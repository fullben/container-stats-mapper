package de.fullben.docker.stats.map;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import de.fullben.docker.stats.model.Stats;
import de.fullben.docker.stats.template.SimpleStats;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.file.Path;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class SimpleStatsMapper extends AbstractStatsMapper<SimpleStats> {

  private final Gson gson;
  private final Type dataType;

  public SimpleStatsMapper() {
    gson = createDefaultGson();
    dataType = new TypeToken<Collection<Stats>>() {}.getType();
  }

  @Override
  public List<SimpleStats> map(Path file) throws IOException {
    requireExistingJsonFile(file);
    JsonReader reader = new JsonReader(new FileReader(file.toFile()));
    List<Stats> stats = gson.fromJson(reader, dataType);
    List<SimpleStats> simpleStats =
        stats.stream().map(SimpleStats::new).collect(Collectors.toList());
    Path newFile = Path.of(file.getParent().toString(), getFileName(file) + "-mapped.json");
    try (FileWriter writer = new FileWriter(newFile.toFile())) {
      gson.toJson(simpleStats, writer);
    }
    return simpleStats;
  }
}
