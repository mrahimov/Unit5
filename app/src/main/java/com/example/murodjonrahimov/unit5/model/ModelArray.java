package com.example.murodjonrahimov.unit5.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by murodjon.rahimov on 1/24/18.
 */

public class ModelArray {
  List<ModelObjects> objectsList = new ArrayList<>();
  ModelInfo modelInfo;

  public ModelArray(List<ModelObjects> objectsList, ModelInfo modelInfo) {
    this.objectsList = objectsList;
    this.modelInfo = modelInfo;
  }

  public List<ModelObjects> getObjectsList() {
    return objectsList;
  }

  public void setObjectsList(List<ModelObjects> objectsList) {
    this.objectsList = objectsList;
  }

  public ModelInfo getModelInfo() {
    return modelInfo;
  }

  public void setModelInfo(ModelInfo modelInfo) {
    this.modelInfo = modelInfo;
  }
}
