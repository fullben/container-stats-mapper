package de.fullben.docker.stats.model;

import com.google.gson.annotations.SerializedName;

public class CpuUsage {

  @SerializedName("total_usage")
  private long totalUsage;

  @SerializedName("percpu_usage")
  private long[] perCpuUsage;

  @SerializedName("usage_in_kernelmode")
  private long usageInKernelMode;

  @SerializedName("usage_in_usermode")
  private long usageInUserMode;

  public long getTotalUsage() {
    return totalUsage;
  }

  public void setTotalUsage(long totalUsage) {
    this.totalUsage = totalUsage;
  }

  public long[] getPerCpuUsage() {
    return perCpuUsage;
  }

  public void setPerCpuUsage(long[] perCpuUsage) {
    this.perCpuUsage = perCpuUsage;
  }

  public long getUsageInKernelMode() {
    return usageInKernelMode;
  }

  public void setUsageInKernelMode(long usageInKernelMode) {
    this.usageInKernelMode = usageInKernelMode;
  }

  public long getUsageInUserMode() {
    return usageInUserMode;
  }

  public void setUsageInUserMode(long usageInUserMode) {
    this.usageInUserMode = usageInUserMode;
  }
}
