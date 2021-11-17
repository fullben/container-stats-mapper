package de.fullben.docker.stats.model;

import com.google.gson.annotations.SerializedName;

public class BlkioStats {

  @SerializedName("io_service_bytes_recursive")
  private ServiceBytes[] ioServiceBytesRecursive;

  @SerializedName("io_serviced_recursive")
  private ServiceBytes[] ioServicedRecursive;

  @SerializedName("io_queue_recursive")
  private ServiceBytes[] ioQueueRecursive;

  @SerializedName("io_service_time_recursive")
  private ServiceBytes[] ioServiceTimeRecursive;

  @SerializedName("io_wait_time_recursive")
  private ServiceBytes[] ioWaitTimeRecursive;

  @SerializedName("io_merge_recursive")
  private ServiceBytes[] ioMergeRecursive;

  @SerializedName("io_time_recursive")
  private ServiceBytes[] ioTimeRecursive;

  @SerializedName("sectors_recursive")
  private ServiceBytes[] sectorsRecursive;

  public ServiceBytes[] getIoServiceBytesRecursive() {
    return ioServiceBytesRecursive;
  }

  public void setIoServiceBytesRecursive(ServiceBytes[] ioServiceBytesRecursive) {
    this.ioServiceBytesRecursive = ioServiceBytesRecursive;
  }

  public ServiceBytes[] getIoServicedRecursive() {
    return ioServicedRecursive;
  }

  public void setIoServicedRecursive(ServiceBytes[] ioServicedRecursive) {
    this.ioServicedRecursive = ioServicedRecursive;
  }

  public ServiceBytes[] getIoQueueRecursive() {
    return ioQueueRecursive;
  }

  public void setIoQueueRecursive(ServiceBytes[] ioQueueRecursive) {
    this.ioQueueRecursive = ioQueueRecursive;
  }

  public ServiceBytes[] getIoServiceTimeRecursive() {
    return ioServiceTimeRecursive;
  }

  public void setIoServiceTimeRecursive(ServiceBytes[] ioServiceTimeRecursive) {
    this.ioServiceTimeRecursive = ioServiceTimeRecursive;
  }

  public ServiceBytes[] getIoWaitTimeRecursive() {
    return ioWaitTimeRecursive;
  }

  public void setIoWaitTimeRecursive(ServiceBytes[] ioWaitTimeRecursive) {
    this.ioWaitTimeRecursive = ioWaitTimeRecursive;
  }

  public ServiceBytes[] getIoMergeRecursive() {
    return ioMergeRecursive;
  }

  public void setIoMergeRecursive(ServiceBytes[] ioMergeRecursive) {
    this.ioMergeRecursive = ioMergeRecursive;
  }

  public ServiceBytes[] getIoTimeRecursive() {
    return ioTimeRecursive;
  }

  public void setIoTimeRecursive(ServiceBytes[] ioTimeRecursive) {
    this.ioTimeRecursive = ioTimeRecursive;
  }

  public ServiceBytes[] getSectorsRecursive() {
    return sectorsRecursive;
  }

  public void setSectorsRecursive(ServiceBytes[] sectorsRecursive) {
    this.sectorsRecursive = sectorsRecursive;
  }
}
