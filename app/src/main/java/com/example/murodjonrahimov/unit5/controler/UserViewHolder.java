package com.example.murodjonrahimov.unit5.controler;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.example.murodjonrahimov.unit5.Main2Activity;
import com.example.murodjonrahimov.unit5.R;
import com.example.murodjonrahimov.unit5.model.ModelObjects;
import com.squareup.picasso.Picasso;

/**
* Created by murodjon.rahimov on 1/24/18.
*/
class UserViewHolder extends RecyclerView.ViewHolder{

  private ImageView imageView;
  private TextView title;
  private TextView first;
  private TextView last;
  private TextView city;
  private TextView postcode;
  private TextView email;

  public UserViewHolder(View itemView) {
    super(itemView);

    imageView = itemView.findViewById(R.id.image_view);
    title = itemView.findViewById(R.id.text_view_title);
    first = itemView.findViewById(R.id.text_view_first);
    last = itemView.findViewById(R.id.text_view_last);
    city = itemView.findViewById(R.id.text_view_city);
    postcode = itemView.findViewById(R.id.text_view_postcode);
    email = itemView.findViewById(R.id.text_view_email);
  }

  public void bind(final ModelObjects modelObjects) {
    title.setText(modelObjects.getModelName().getTitle());
    first.setText(modelObjects.getModelName().getFirst());
    last.setText(modelObjects.getModelName().getLast());
    email.setText(modelObjects.getEmail());
    city.setText(modelObjects.getModelLocation().getCity());

    Picasso.with(itemView.getContext()).load(modelObjects.getModelPicture().getThumbnail()).into(imageView);

    itemView.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        Intent intent = new Intent(itemView.getContext(), Main2Activity.class);
        intent.putExtra("modelObjects", modelObjects);
        itemView.getContext().startActivity(intent);
      }
    });
  }

}

