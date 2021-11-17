package de.fullben.docker.stats;

import de.fullben.docker.stats.map.StatsMapper;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DirectoryMapper {

  private final StatsMapper<?> statsMapper;

  public DirectoryMapper(StatsMapper<?> statsMapper) {
    this.statsMapper = statsMapper;
  }

  public void map(String dir) throws Exception {
    List<Path> jsonFiles;
    try (Stream<Path> walk = Files.walk(Path.of(dir), 1)) {
      jsonFiles =
          walk.filter(p -> !Files.isDirectory(p))
              .filter(p -> p.getFileName().toString().toLowerCase(Locale.ROOT).endsWith(".json"))
              .collect(Collectors.toList());
    }
    for (Path jsonFile : jsonFiles) {
      statsMapper.map(jsonFile);
    }
  }
}
