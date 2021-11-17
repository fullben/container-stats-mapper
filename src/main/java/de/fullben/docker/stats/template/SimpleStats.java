package de.fullben.docker.stats.template;

import de.fullben.docker.stats.model.Stats;

public class SimpleStats {

  private final long read;
  private final int currentPidCount;
  private final long totalCpuUsage;
  private final long prevTotalCpuUsage;
  private final long systemCpuUsage;
  private final long prevSystemCpuUsage;
  private final int onlineProcessorCount;
  private final int processorCount;
  private final long memoryUsage;
  private final long memoryUsageMax;
  private final long memoryUsageLimit;
  private final String name;
  private final String id;

  public SimpleStats(Stats stats) {
    read = stats.getRead() == null ? 0 : stats.getRead().toEpochSecond() * 1000;
    currentPidCount = stats.getPidsStats() == null ? 0 : stats.getPidsStats().getCurrent();
    totalCpuUsage =
        stats.getCpuStats() == null ? 0 : stats.getCpuStats().getCpuUsage().getTotalUsage();
    prevTotalCpuUsage =
        stats.getPreCpuStats() == null ? 0 : stats.getPreCpuStats().getCpuUsage().getTotalUsage();
    systemCpuUsage = stats.getCpuStats() == null ? 0 : stats.getCpuStats().getSystemCpuUsage();
    prevSystemCpuUsage =
        stats.getPreCpuStats() == null ? 0 : stats.getPreCpuStats().getSystemCpuUsage();
    onlineProcessorCount = stats.getCpuStats() == null ? 0 : stats.getCpuStats().getOnlineCpus();
    processorCount = stats.getProcessorCount();
    memoryUsage = stats.getMemoryStats() == null ? 0 : stats.getMemoryStats().getUsage();
    memoryUsageMax = stats.getMemoryStats() == null ? 0 : stats.getMemoryStats().getMaxUsage();
    memoryUsageLimit = stats.getMemoryStats() == null ? 0 : stats.getMemoryStats().getLimit();
    name = stats.getName();
    id = stats.getId();
  }

  public long getRead() {
    return read;
  }

  public int getCurrentPidCount() {
    return currentPidCount;
  }

  public long getTotalCpuUsage() {
    return totalCpuUsage;
  }

  public long getPrevTotalCpuUsage() {
    return prevTotalCpuUsage;
  }

  public long getSystemCpuUsage() {
    return systemCpuUsage;
  }

  public long getPrevSystemCpuUsage() {
    return prevSystemCpuUsage;
  }

  public int getOnlineProcessorCount() {
    return onlineProcessorCount;
  }

  public int getProcessorCount() {
    return processorCount;
  }

  public long getMemoryUsage() {
    return memoryUsage;
  }

  public long getMemoryUsageMax() {
    return memoryUsageMax;
  }

  public long getMemoryUsageLimit() {
    return memoryUsageLimit;
  }

  public String getName() {
    return name;
  }

  public String getId() {
    return id;
  }
}
