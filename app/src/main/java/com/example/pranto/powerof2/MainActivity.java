package com.example.pranto.powerof2;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button exitButton;
    private AlertDialog.Builder alertDialogBuilder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        exitButton = (Button) findViewById(R.id.exitButton);
        exitButton.setOnClickListener(this);
    }

    public void startGame(View v)
    {
        Intent i=new Intent(this,Game.class);
        startActivity(i);
        Toast.makeText(MainActivity.this, "START GAME", Toast.LENGTH_SHORT).show();
    }

    public void onBackPressed() {
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
        alertDialogBuilder.setTitle("EXIT");
        alertDialogBuilder.setMessage("DO YOU WANT TO EXIT?");
        alertDialogBuilder.setPositiveButton("YES", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                moveTaskToBack(true);
                android.os.Process.killProcess(android.os.Process.myPid());
                //finish();
                System.exit(1);
                Toast.makeText(MainActivity.this, "EXIT SUCCESSFULLY", Toast.LENGTH_SHORT).show();
            }
        });
        alertDialogBuilder.setNegativeButton("NO", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity.this, "CONTINUE", Toast.LENGTH_SHORT).show();
            }
        });
        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();
    }

    @Override
    public void onClick(View v) {
        alertDialogBuilder=new AlertDialog.Builder(MainActivity.this);
        alertDialogBuilder.setTitle("EXIT");
        alertDialogBuilder.setMessage("DO YOU WANT TO EXIT?");
        alertDialogBuilder.setPositiveButton("YES", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                moveTaskToBack(true);
                android.os.Process.killProcess(android.os.Process.myPid());
                //finish();
                System.exit(1);
                Toast.makeText(MainActivity.this, "EXIT SUCCESSFULLY", Toast.LENGTH_SHORT).show();
            }
        });

        alertDialogBuilder.setNegativeButton("NO", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity.this, "CONTINUE", Toast.LENGTH_SHORT).show();
            }
        });

        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();

    }
}
