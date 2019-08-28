package com.aryanshmahato.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import es.dmoral.toasty.Toasty;

public class DoublePlayer extends AppCompatActivity {
  ImageView box0, box1, box2, box3, box4, box5, box6, box7, box8;
  boolean canDo0, canDo1, canDo2, canDo3, canDo4,canDo5, canDo6, canDo7, canDo8;
  char turn='X';
  ArrayList<Integer> XValue=new ArrayList<>();  //To store the positions occupied by X
  ArrayList<Integer> OValue=new ArrayList<>();  //To store the positions occupied by O
  tictactoe_concept tictactoeConcept=new tictactoe_concept();
  int Xpoints=0, Opoints=0; //Stores the points of each Player(O,X)
  TextView playerX, playerO;  //ScoreBoard texts





  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_double_player);


    try {
      Xpoints = getIntent().getExtras().getInt("Xpoint"); //Get data from Intent after Refreshing
      Opoints = getIntent().getExtras().getInt("Opoint");
    } catch (Exception e) {
      e.printStackTrace();
    }


    box0=findViewById(R.id.box1);
    box1=findViewById(R.id.box2);
    box2=findViewById(R.id.box3);
    box3=findViewById(R.id.box4);
    box4=findViewById(R.id.box5);
    box5=findViewById(R.id.box6);
    box6=findViewById(R.id.box7);
    box7=findViewById(R.id.box8);
    box8=findViewById(R.id.box9);

    playerO = findViewById(R.id.textView_scoreBoardTwo);
    playerX = findViewById(R.id.textView_scoreBoardOne);

    Ocounter();
    Xcounter();

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

    Restart();
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
        if (canDo0) { //Checking if we are over writing our Box
          if (turn == 'X') { //Checking whose Turn is this, Either X or O
            box0.setImageResource(R.drawable.ic_cross);
          } else {
            box0.setImageResource(R.drawable.ic_circle);
          }
          canDo0 = false; //Changing Over Writing flag to false

          injecting(turn, 1);
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

          injecting(turn, 2);
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

          injecting(turn, 3);
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
          injecting(turn, 4);
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
          injecting(turn, 5);
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
          injecting(turn, 6);
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
          injecting(turn, 7);
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
          injecting(turn, 8);
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
          injecting(turn, 9);
          changeTurn();
        }
      }
    });
  }


  public void injecting(char whoseTurn, int position){
    if (whoseTurn=='X'){
      XValue.add(position);
    }else{
      OValue.add(position);
    }   //To register positions of X and O in XValue and OValue

    if (tictactoeConcept.winnerAlgo(XValue)){ //winnerAlgo returns true when X occupies the winning positions
      XIsWinner();
    }else if (tictactoeConcept.winnerAlgo(OValue)){
      OIsWinner();
    }

    if (XValue.size() + OValue.size() == 9){
      matchDraw();
    }

  }


  public void XIsWinner(){

    final Dialog mDialog = new Dialog(this);  //A Dialog Declaring the winner

    mDialog.setContentView(R.layout.winning_popup_xwinner);
    mDialog.setTitle("Everything is set");
    mDialog.show();
    ++Xpoints;  //Increments Score of X
    Xcounter(); //Refresh the onScreen Scoreboard

    mDialog.setOnCancelListener(new DialogInterface.OnCancelListener() {  //Refresh the app when Dialog Dismisses
      @Override
      public void onCancel(DialogInterface dialog) {
        mDialog.dismiss();  //Dismiss The Dialog
        reset();  //Resets the Game, Do not reset's ScoreBoard
      }
    });

  }

  public void OIsWinner(){
    final Dialog mDialog = new Dialog(this); //A Dialog Declaring the winner

    mDialog.setContentView(R.layout.winning_popup_owinner);
    mDialog.setTitle("Everything is set");
    mDialog.show();
    ++Opoints; //Increments Score of O
    Ocounter(); //Refresh the onScreen Scoreboard

    mDialog.setOnCancelListener(new DialogInterface.OnCancelListener() { //Refresh the app when Dialog Dismisses
      @Override
      public void onCancel(DialogInterface dialog) {
        mDialog.dismiss();  //Dismiss The Dialog
        reset();  //Resets the Game, Do not reset's ScoreBoard
      }
    });


  }

  public void matchDraw(){
    final Dialog mDialog = new Dialog(this);  //A Dialog Declaring the winner

    mDialog.setContentView(R.layout.match_draw);
    mDialog.setTitle("Everything is set");
    mDialog.show();

    mDialog.setOnCancelListener(new DialogInterface.OnCancelListener() {  //Refresh the app when Dialog Dismisses
      @Override
      public void onCancel(DialogInterface dialog) {
        mDialog.dismiss();  //Dismiss The Dialog
        reset();  //Resets the Game, Do not reset's ScoreBoard
      }
    });
  }


  public void reset(){
    Intent intent = getIntent();  //Resetting Via Intent
    overridePendingTransition(0, 0);
    intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
    intent.putExtra("Xpoint", Xpoints); //Pass Points to new refreshed screen to keep the ScoreBoard Alive
    intent.putExtra("Opoint", Opoints);
    finish();
    overridePendingTransition(0, 0);
    startActivity(intent);
  }

  public void Ocounter(){
    playerO.setText("PLAYER 2 (O): "+ Opoints); //Changes onScreen ScoreBoard
  }

  public void Xcounter(){
    playerX.setText("PLAYER 1 (X): "+ Xpoints); //Changes onScreen ScoreBoard
  }

  public void Restart(){

  }



}


//TODO: Build a better UX when Someone Wins! --Working: Found a solution(To be tested) (DONE)
//TODO: Implement points counting --Working: Found a solution(To be tested) (DONE)
//TODO: Add Restart Button(Set points to 0 also)











