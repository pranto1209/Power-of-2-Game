package com.example.pranto.powerof2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ResultPage extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        int result= getIntent().getExtras().getInt("Result");
        Button btn= findViewById(R.id.ResultBtn);
        TextView tv = findViewById(R.id.ResultTxt);
        if(result==0)
        {
            btn.setText("GO TO MAIN MENU");
            tv.setText("CONGRATULATIONS!\nYOU WIN!");
        }
        else
        {
            tv.setText("GAME OVER!\nYOU LOST!");
            btn.setText("TRY AGAIN");
        }
    }
    public void retry(View v)
    {
        finish();
        Intent i= new Intent(ResultPage.this,Game.class);
        startActivity(i);
    }
}
