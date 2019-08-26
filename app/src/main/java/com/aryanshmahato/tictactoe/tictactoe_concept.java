package com.aryanshmahato.tictactoe;

import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import es.dmoral.toasty.Toasty;

public class tictactoe_concept {
  public void input(ImageView imageView, char turn){
    if (turn == 'X'){
      clickedX(imageView);
    }
    else if (turn == 'O'){
      clickedO(imageView);
    }
    else {
      Log.d("100001", "Some error Occurred");
    }
  }

  public void clickedO(ImageView imageView){
    imageView.setImageResource(R.drawable.ic_cross);
  }
  public void clickedX(ImageView imageView){
    imageView.setImageResource(R.drawable.ic_circle);

  }
}




















