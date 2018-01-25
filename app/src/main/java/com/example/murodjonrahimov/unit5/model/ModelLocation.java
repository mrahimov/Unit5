package com.example.murodjonrahimov.unit5.model;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by murodjon.rahimov on 1/24/18.
 */

public class ModelLocation implements Parcelable {
  private String street;
  private String city;
  private String state;
  private int postcode;

  public ModelLocation(String street, String city, String state, int postcode) {
    this.street = street;
    this.city = city;
    this.state = state;
    this.postcode = postcode;
  }

  public void setStreet(String street) {
    this.street = street;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public void setState(String state) {
    this.state = state;
  }

  public void setPostcode(int postcode) {
    this.postcode = postcode;
  }

  public static Creator<ModelLocation> getCREATOR() {
    return CREATOR;
  }

  public String getStreet() {
    return street;
  }

  public String getCity() {
    return city;
  }

  public String getState() {
    return state;
  }

  public int getPostcode() {
    return postcode;
  }

  @Override
  public int describeContents() {
    return 0;
  }

  @Override
  public void writeToParcel(Parcel dest, int flags) {
    dest.writeString(this.street);
    dest.writeString(this.city);
    dest.writeString(this.state);
    dest.writeInt(this.postcode);
  }

  public ModelLocation() {
  }

  protected ModelLocation(Parcel in) {
    this.street = in.readString();
    this.city = in.readString();
    this.state = in.readString();
    this.postcode = in.readInt();
  }

  public static final Creator<ModelLocation> CREATOR = new Creator<ModelLocation>() {
    @Override
    public ModelLocation createFromParcel(Parcel source) {
      return new ModelLocation(source);
    }

    @Override
    public ModelLocation[] newArray(int size) {
      return new ModelLocation[size];
    }
  };
}
