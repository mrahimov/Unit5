package com.example.murodjonrahimov.unit5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;
import com.example.murodjonrahimov.unit5.controler.UserAdapter;
import com.example.murodjonrahimov.unit5.model.ModelObjects;
import com.example.murodjonrahimov.unit5.network.ApiResponce;
import com.example.murodjonrahimov.unit5.network.ApiService;
import java.util.List;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

  UserAdapter userAdapter;
  ApiService apiService;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    RecyclerView recyclerView = findViewById(R.id.recycler_view);
    userAdapter = new UserAdapter();
    GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 2);
    recyclerView.setAdapter(userAdapter);
    recyclerView.setLayoutManager(gridLayoutManager);

    Retrofit retrofit = new Retrofit.Builder()
      .baseUrl("https://randomuser.me/")
      .addConverterFactory(GsonConverterFactory
        .create())
      .build();

    apiService = retrofit.create(ApiService.class);
    pullData();
  }

  private void pullData() {

    Call<ApiResponce> apiResponceCall = apiService.getPeople();
    apiResponceCall.enqueue(new Callback<ApiResponce>() {
      @Override
      public void onResponse(Call<ApiResponce> call, retrofit2.Response<ApiResponce> response) {
        List<ModelObjects> people = response.body()
          .getResults();
        userAdapter.setData(people);
        userAdapter.notifyDataSetChanged();
      }

      @Override
      public void onFailure(Call<ApiResponce> call, Throwable t) {

        //Log.d("ERRRR", call.toString());
      }
    });

  }

  @Override
  public boolean onCreateOptionsMenu(Menu menu) {
    MenuInflater inflater = getMenuInflater();
    inflater.inflate(R.menu.menu, menu);
    return true;
  }

  @Override
  public boolean onOptionsItemSelected(MenuItem item) {
    switch (item.getItemId()) {
      case R.id.refresh:
        pullData();
        return true;
      default:
        return super.onOptionsItemSelected(item);
    }
  }

}

