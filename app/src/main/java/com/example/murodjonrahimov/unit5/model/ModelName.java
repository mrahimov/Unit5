package com.example.murodjonrahimov.unit5.model;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by murodjon.rahimov on 1/24/18.
 */

public class ModelName implements Parcelable{
  private String title;
  private String first;
  private String last;

  public void setTitle(String title) {
    this.title = title;
  }

  public void setFirst(String first) {
    this.first = first;
  }

  public void setLast(String last) {
    this.last = last;
  }

  public static Creator<ModelName> getCREATOR() {
    return CREATOR;
  }

  public ModelName(String title, String first, String last) {

    this.title = title;
    this.first = first;
    this.last = last;
  }

  public String getTitle() {
    return title;
  }

  public String getFirst() {
    return first;
  }

  public String getLast() {
    return last;
  }

  @Override
  public int describeContents() {
    return 0;
  }

  @Override
  public void writeToParcel(Parcel dest, int flags) {
    dest.writeString(this.title);
    dest.writeString(this.first);
    dest.writeString(this.last);
  }

  protected ModelName(Parcel in) {
    this.title = in.readString();
    this.first = in.readString();
    this.last = in.readString();
  }

  public static final Creator<ModelName> CREATOR = new Creator<ModelName>() {
    @Override
    public ModelName createFromParcel(Parcel source) {
      return new ModelName(source);
    }

    @Override
    public ModelName[] newArray(int size) {
      return new ModelName[size];
    }
  };
}
