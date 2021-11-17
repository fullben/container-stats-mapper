package de.fullben.docker.stats.model;

import com.google.gson.annotations.SerializedName;
import java.time.ZonedDateTime;

public class Stats {

  private ZonedDateTime read;
  private ZonedDateTime preread;

  @SerializedName("pids_stats")
  private PidsStats pidsStats;

  @SerializedName("blkio_stats")
  private BlkioStats blkioStats;

  @SerializedName("num_procs")
  private int processorCount;

  @SerializedName("storage_stats")
  private Object storageStats;

  @SerializedName("cpu_stats")
  private CpuStats cpuStats;

  @SerializedName("precpu_stats")
  private CpuStats preCpuStats;

  @SerializedName("memory_stats")
  private MemoryStats memoryStats;

  private String name;
  private String id;
  private Networks networks;

  public ZonedDateTime getRead() {
    return read;
  }

  public void setRead(ZonedDateTime read) {
    this.read = read;
  }

  public ZonedDateTime getPreread() {
    return preread;
  }

  public void setPreread(ZonedDateTime preread) {
    this.preread = preread;
  }

  public PidsStats getPidsStats() {
    return pidsStats;
  }

  public void setPidsStats(PidsStats pidsStats) {
    this.pidsStats = pidsStats;
  }

  public BlkioStats getBlkioStats() {
    return blkioStats;
  }

  public void setBlkioStats(BlkioStats blkioStats) {
    this.blkioStats = blkioStats;
  }

  public int getProcessorCount() {
    return processorCount;
  }

  public void setProcessorCount(int processorCount) {
    this.processorCount = processorCount;
  }

  public Object getStorageStats() {
    return storageStats;
  }

  public void setStorageStats(Object storageStats) {
    this.storageStats = storageStats;
  }

  public CpuStats getCpuStats() {
    return cpuStats;
  }

  public void setCpuStats(CpuStats cpuStats) {
    this.cpuStats = cpuStats;
  }

  public CpuStats getPreCpuStats() {
    return preCpuStats;
  }

  public void setPreCpuStats(CpuStats preCpuStats) {
    this.preCpuStats = preCpuStats;
  }

  public MemoryStats getMemoryStats() {
    return memoryStats;
  }

  public void setMemoryStats(MemoryStats memoryStats) {
    this.memoryStats = memoryStats;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Networks getNetworks() {
    return networks;
  }

  public void setNetworks(Networks networks) {
    this.networks = networks;
  }
}
