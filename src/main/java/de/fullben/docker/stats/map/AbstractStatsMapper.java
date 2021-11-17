package de.fullben.docker.stats.map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.ZonedDateTime;
import java.util.Arrays;

public abstract class AbstractStatsMapper<T> implements StatsMapper<T> {

  Gson createDefaultGson() {
    return new GsonBuilder()
        .registerTypeAdapter(
            ZonedDateTime.class,
            new TypeAdapter<ZonedDateTime>() {
              @Override
              public void write(JsonWriter out, ZonedDateTime value) throws IOException {
                out.value(value.toString());
              }

              @Override
              public ZonedDateTime read(JsonReader in) throws IOException {
                return ZonedDateTime.parse(in.nextString());
              }
            })
        .enableComplexMapKeySerialization()
        .setPrettyPrinting()
        .create();
  }

  Path requireExistingJsonFile(Path file) {
    if (file == null) {
      throw new NullPointerException();
    }
    if (!Files.exists(file)) {
      throw new IllegalArgumentException("File does not exist: " + file);
    }
    if (!file.getFileName().toString().endsWith(".json")) {
      throw new IllegalArgumentException("Not a JSON file: " + file);
    }
    return file;
  }

  String getFileName(Path file) {
    String[] parts = file.getFileName().toString().split("\\.");
    if (parts.length < 2) {
      throw new IllegalArgumentException("Not a valid filename: " + file);
    } else if (parts.length == 2) {
      return parts[0];
    } else {
      String[] filenameParts = Arrays.copyOf(parts, parts.length - 1);
      return String.join("", filenameParts);
    }
  }
}
