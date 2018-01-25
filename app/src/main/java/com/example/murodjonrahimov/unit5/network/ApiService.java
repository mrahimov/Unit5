package com.example.murodjonrahimov.unit5.network;


import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import rx.Observable;

/**
 * Created by murodjon.rahimov on 1/24/18.
 */

public interface ApiService {

  @GET("api/?nat=us&inc=name,location,cell,email,dob,picture&results=20")
  Call<ApiResponce> getPeople();



}

//https://randomuser.me/api/?nat=us&inc=name,location,cell,email,dob,picture&results=20