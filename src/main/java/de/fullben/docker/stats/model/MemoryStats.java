package de.fullben.docker.stats.model;

import com.google.gson.annotations.SerializedName;

public class MemoryStats {

  private long usage;

  @SerializedName("max_usage")
  private long maxUsage;

  private MemoryDetails stats;
  private long limit;

  public long getUsage() {
    return usage;
  }

  public void setUsage(long usage) {
    this.usage = usage;
  }

  public long getMaxUsage() {
    return maxUsage;
  }

  public void setMaxUsage(long maxUsage) {
    this.maxUsage = maxUsage;
  }

  public MemoryDetails getStats() {
    return stats;
  }

  public void setStats(MemoryDetails stats) {
    this.stats = stats;
  }

  public long getLimit() {
    return limit;
  }

  public void setLimit(long limit) {
    this.limit = limit;
  }
}
