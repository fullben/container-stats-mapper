package de.fullben.docker.stats.model;

import com.google.gson.annotations.SerializedName;

public class ThrottlingData {

  private int periods;

  @SerializedName("throttled_periods")
  private int throttledPeriods;

  @SerializedName("throttled_time")
  private int throttledTime;

  public int getPeriods() {
    return periods;
  }

  public void setPeriods(int periods) {
    this.periods = periods;
  }

  public int getThrottledPeriods() {
    return throttledPeriods;
  }

  public void setThrottledPeriods(int throttledPeriods) {
    this.throttledPeriods = throttledPeriods;
  }

  public int getThrottledTime() {
    return throttledTime;
  }

  public void setThrottledTime(int throttledTime) {
    this.throttledTime = throttledTime;
  }
}
