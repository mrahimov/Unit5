package com.example.murodjonrahimov.unit5.model;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by murodjon.rahimov on 1/24/18.
 */

public class ModelPicture implements Parcelable{
  private String large;
  private String medium;
  private String thumbnail;

  public void setLarge(String large) {
    this.large = large;
  }

  public void setMedium(String medium) {
    this.medium = medium;
  }

  public void setThumbnail(String thumbnail) {
    this.thumbnail = thumbnail;
  }

  public static Creator<ModelPicture> getCREATOR() {
    return CREATOR;
  }

  public ModelPicture(String large, String medium, String thumbnail) {

    this.large = large;
    this.medium = medium;
    this.thumbnail = thumbnail;
  }

  public String getLarge() {
    return large;
  }

  public String getMedium() {
    return medium;
  }

  public String getThumbnail() {
    return thumbnail;
  }

  @Override
  public int describeContents() {
    return 0;
  }

  @Override
  public void writeToParcel(Parcel dest, int flags) {
    dest.writeString(this.large);
    dest.writeString(this.medium);
    dest.writeString(this.thumbnail);
  }

  protected ModelPicture(Parcel in) {
    this.large = in.readString();
    this.medium = in.readString();
    this.thumbnail = in.readString();
  }

  public static final Creator<ModelPicture> CREATOR = new Creator<ModelPicture>() {
    @Override
    public ModelPicture createFromParcel(Parcel source) {
      return new ModelPicture(source);
    }

    @Override
    public ModelPicture[] newArray(int size) {
      return new ModelPicture[size];
    }
  };
}
