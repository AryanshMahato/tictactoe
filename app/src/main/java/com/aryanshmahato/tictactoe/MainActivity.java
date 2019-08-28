package com.aryanshmahato.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
  }

  public void layout_OPS_clicked(View view){
    Intent viewIntent =
            new Intent("android.intent.action.VIEW",
                    Uri.parse("https://github.com/AryanshMahato/tictactoe"));
    startActivity(viewIntent);
  }

  public void button_SinglePlayer_clicked(View view){
    Intent intent = new Intent(this, SinglePlayer.class);
    intent.putExtra("Xpoint", 0);
    intent.putExtra("Opoint", 0);
    startActivity(intent);
  }

  public void button_DoublePlayer_clicked(View view){
    Intent intent = new Intent(this, DoublePlayer.class);
    startActivity(intent);
  }

}
