package com.aryanshmahato.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class SinglePlayer extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_single_player);
  }

  public void button_homeButton_clicked(View view){
    Intent intent = new Intent(SinglePlayer.this, MainActivity.class);
    startActivity(intent);
  }

  public void textView_seeTheCodeHere_clicked(View view){
    Intent viewIntent =
            new Intent("android.intent.action.VIEW",
                    Uri.parse("https://github.com/AryanshMahato/tictactoe"));
    startActivity(viewIntent);
  }
}
