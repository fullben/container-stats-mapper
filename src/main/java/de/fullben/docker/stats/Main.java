package de.fullben.docker.stats;

import de.fullben.docker.stats.map.SimpleStatsMapper;

public class Main {

  public static void main(String[] args) throws Exception {
    DirectoryMapper mapper = new DirectoryMapper(new SimpleStatsMapper());
    mapper.map("PATH/TO/DIR");
  }
}
