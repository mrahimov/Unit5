package com.example.murodjonrahimov.unit5.controler;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.murodjonrahimov.unit5.R;
import com.example.murodjonrahimov.unit5.model.ModelObjects;
import com.squareup.picasso.Picasso;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by murodjon.rahimov on 1/24/18.
 */

 public class UserAdapter extends RecyclerView.Adapter<UserViewHolder> {

   private List<ModelObjects> modelObjectsList = new ArrayList<>();

  @Override
  public UserViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
    LayoutInflater inflater = LayoutInflater.from(parent.getContext());
    return new UserViewHolder(inflater.inflate(R.layout.item_view, parent, false));
  }

  @Override
  public void onBindViewHolder(UserViewHolder holder, int position) {
    ModelObjects modelObjects = modelObjectsList.get(position);
    holder.bind(modelObjects);

  }

  @Override
  public int getItemCount() {
    return modelObjectsList.size();
  }
  public void setData(List<ModelObjects> modelObjectsList) {
    this.modelObjectsList = modelObjectsList;
  }
}

