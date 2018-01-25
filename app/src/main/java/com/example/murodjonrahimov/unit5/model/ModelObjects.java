package com.example.murodjonrahimov.unit5.model;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by murodjon.rahimov on 1/24/18.
 */

public class ModelObjects implements Parcelable{

  private ModelName modelName;
  private ModelLocation modelLocation;
  private ModelPicture modelPicture;
  private String email;
  private String dob;
  private String cell;

  public ModelObjects(ModelName modelName, ModelLocation modelLocation, ModelPicture modelPicture, String email, String dob,
                      String cell) {
    this.modelName = modelName;
    this.modelLocation = modelLocation;
    this.modelPicture = modelPicture;
    this.email = email;
    this.dob = dob;
    this.cell = cell;
  }

  public ModelName getModelName() {
    return modelName;
  }

  public void setModelName(ModelName modelName) {
    this.modelName = modelName;
  }

  public ModelLocation getModelLocation() {
    return modelLocation;
  }

  public void setModelLocation(ModelLocation modelLocation) {
    this.modelLocation = modelLocation;
  }

  public ModelPicture getModelPicture() {
    return modelPicture;
  }

  public void setModelPicture(ModelPicture modelPicture) {
    this.modelPicture = modelPicture;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getDob() {
    return dob;
  }

  public void setDob(String dob) {
    this.dob = dob;
  }

  public String getCell() {
    return cell;
  }

  public void setCell(String cell) {
    this.cell = cell;
  }


  @Override
  public int describeContents() {
    return 0;
  }

  @Override
  public void writeToParcel(Parcel dest, int flags) {
    dest.writeParcelable(this.modelName, flags);
    dest.writeParcelable(this.modelLocation, flags);
    dest.writeString(this.email);
    dest.writeString(this.dob);
    dest.writeString(this.cell);
    dest.writeParcelable(this.modelPicture, flags);
  }

  protected ModelObjects(Parcel in) {
    this.modelName = in.readParcelable(ModelName.class.getClassLoader());
    this.modelLocation = in.readParcelable(ModelLocation.class.getClassLoader());
    this.email = in.readString();
    this.dob = in.readString();
    this.cell = in.readString();
    this.modelPicture = in.readParcelable(ModelPicture.class.getClassLoader());
  }

  public static final Parcelable.Creator<ModelObjects> CREATOR = new Parcelable.Creator<ModelObjects>() {
    @Override
    public ModelObjects createFromParcel(Parcel source) {
      return new ModelObjects(source);
    }

    @Override
    public ModelObjects[] newArray(int size) {
      return new ModelObjects[size];
    }
  };
}


