package de.fullben.docker.stats.model;

import com.google.gson.annotations.SerializedName;

public class CpuStats {

  @SerializedName("cpu_usage")
  private CpuUsage cpuUsage;

  @SerializedName("system_cpu_usage")
  private long systemCpuUsage;

  @SerializedName("online_cpus")
  private int onlineCpus;

  @SerializedName("throttling_data")
  private ThrottlingData throttlingData;

  public CpuUsage getCpuUsage() {
    return cpuUsage;
  }

  public void setCpuUsage(CpuUsage cpuUsage) {
    this.cpuUsage = cpuUsage;
  }

  public long getSystemCpuUsage() {
    return systemCpuUsage;
  }

  public void setSystemCpuUsage(long systemCpuUsage) {
    this.systemCpuUsage = systemCpuUsage;
  }

  public int getOnlineCpus() {
    return onlineCpus;
  }

  public void setOnlineCpus(int onlineCpus) {
    this.onlineCpus = onlineCpus;
  }

  public ThrottlingData getThrottlingData() {
    return throttlingData;
  }

  public void setThrottlingData(ThrottlingData throttlingData) {
    this.throttlingData = throttlingData;
  }
}
