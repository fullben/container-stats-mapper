package de.fullben.docker.stats.map;

import java.nio.file.Path;
import java.util.Collection;

public interface StatsMapper<T> {

  Collection<T> map(Path statsFile) throws Exception;
}
