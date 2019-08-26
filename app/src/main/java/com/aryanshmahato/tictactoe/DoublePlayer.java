package com.aryanshmahato.tictactoe;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;

import es.dmoral.toasty.Toasty;

public class DoublePlayer extends AppCompatActivity {
  ImageView box0, box1, box2, box3, box4, box5, box6, box7, box8;
  boolean canDo0, canDo1, canDo2, canDo3, canDo4,canDo5, canDo6, canDo7, canDo8;
  char turn='X';


  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_double_player);

    box0=findViewById(R.id.box1);
    box1=findViewById(R.id.box2);
    box2=findViewById(R.id.box3);
    box3=findViewById(R.id.box4);
    box4=findViewById(R.id.box5);
    box5=findViewById(R.id.box6);
    box6=findViewById(R.id.box7);
    box7=findViewById(R.id.box8);
    box8=findViewById(R.id.box9);

    canDo0=true;
    canDo1=true;
    canDo2=true;
    canDo3=true;
    canDo4=true;
    canDo5=true;
    canDo6=true;
    canDo7=true;
    canDo8=true;


    box0Clicked();
    box1Clicked();
    box2Clicked();
    box3Clicked();
    box4Clicked();
    box5Clicked();
    box6Clicked();
    box7Clicked();
    box8Clicked();


  }

  public void changeTurn(){
    if (turn=='X'){
      turn='Y';
    }else{
      turn='X';
    }
  }

  public void button_homeButton_clicked(View view){
    Intent intent = new Intent(DoublePlayer.this, MainActivity.class);
    startActivity(intent);
  }

  public void textView_seeTheCodeHere_clicked(View view){
    Intent viewIntent =
            new Intent("android.intent.action.VIEW",
                    Uri.parse("https://github.com/AryanshMahato/tictactoe"));
    startActivity(viewIntent);
  }


  public void box0Clicked(){
    box0.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        if (canDo0) {
          if (turn == 'X') {
            box0.setImageResource(R.drawable.ic_cross);
          } else {
            box0.setImageResource(R.drawable.ic_circle);
          }
          canDo0 = false;

          changeTurn();
        }
      }
    });
  }

  public void box1Clicked(){
    box1.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        if (canDo1) {
          if (turn == 'X') {
            box1.setImageResource(R.drawable.ic_cross);
          } else {
            box1.setImageResource(R.drawable.ic_circle);
          }
          canDo1 = false;

          changeTurn();
        }
      }
    });
  }

  public void box2Clicked(){
    box2.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        if (canDo2) {
          if (turn == 'X') {
            box2.setImageResource(R.drawable.ic_cross);
          } else {
            box2.setImageResource(R.drawable.ic_circle);
          }
          canDo2 = false;

          changeTurn();
        }
      }
    });
  }

  public void box3Clicked(){
    box3.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        if (canDo3) {
          if (turn == 'X') {
            box3.setImageResource(R.drawable.ic_cross);
          } else {
            box3.setImageResource(R.drawable.ic_circle);
          }
          canDo3 = false;

          changeTurn();
        }
      }
    });
  }

  public void box4Clicked(){
    box4.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        if (canDo4) {
          if (turn == 'X') {
            box4.setImageResource(R.drawable.ic_cross);
          } else {
            box4.setImageResource(R.drawable.ic_circle);
          }
          canDo4 = false;

          changeTurn();
        }
      }
    });
  }

  public void box5Clicked(){
    box5.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        if (canDo5) {
          if (turn == 'X') {
            box5.setImageResource(R.drawable.ic_cross);
          } else {
            box5.setImageResource(R.drawable.ic_circle);
          }
          canDo5 = false;

          changeTurn();
        }
      }
    });
  }

  public void box6Clicked(){
    box6.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        if (canDo6) {
          if (turn == 'X') {
            box6.setImageResource(R.drawable.ic_cross);
          } else {
            box6.setImageResource(R.drawable.ic_circle);
          }
          canDo6 = false;

          changeTurn();
        }
      }
    });
  }

  public void box7Clicked(){
    box7.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        if (canDo7) {
          if (turn == 'X') {
            box7.setImageResource(R.drawable.ic_cross);
          } else {
            box7.setImageResource(R.drawable.ic_circle);
          }
          canDo7 = false;

          changeTurn();
        }
      }
    });
  }

  public void box8Clicked(){
    box8.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        if (canDo8) {
          if (turn == 'X') {
            box8.setImageResource(R.drawable.ic_cross);
          } else {
            box8.setImageResource(R.drawable.ic_circle);
          }
          canDo8 = false;

          changeTurn();
        }
      }
    });
  }



}















