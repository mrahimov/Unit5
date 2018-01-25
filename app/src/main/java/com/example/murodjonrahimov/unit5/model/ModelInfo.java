package com.example.murodjonrahimov.unit5.model;

/**
 * Created by murodjon.rahimov on 1/24/18.
 */

public class ModelInfo {
  private String seed;
  private int results;
  private int page;
  private double version;

  public ModelInfo(String seed, int results, int page, double version) {
    this.seed = seed;
    this.results = results;
    this.page = page;
    this.version = version;
  }

  public String getSeed() {
    return seed;
  }

  public void setSeed(String seed) {
    this.seed = seed;
  }

  public int getResults() {
    return results;
  }

  public void setResults(int results) {
    this.results = results;
  }

  public int getPage() {
    return page;
  }

  public void setPage(int page) {
    this.page = page;
  }

  public double getVersion() {
    return version;
  }

  public void setVersion(double version) {
    this.version = version;
  }
}
