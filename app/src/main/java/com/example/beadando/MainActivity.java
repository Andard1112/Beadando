package com.example.beadando;

import androidx.appcompat.app.AppCompatActivity;

import android.content.pm.ActivityInfo;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private SeekBar sb_Red, sb_Green, sb_Blue;
    private TextView tv_Red, tv_Green, tv_Blue, tv_Red_Szam, tv_Green_Szam, tv_Blue_Szam, tv_szin;
    private View v_hatter_szin;
    private int piros, zold, kek;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();

        sb_Red = findViewById(R.id.sb_Red);
        sb_Green = findViewById(R.id.sb_Green);
        sb_Blue = findViewById(R.id.sb_Blue);
        tv_Red = findViewById(R.id.tv_Red);
        tv_Green= findViewById(R.id.tv_Green);
        tv_Blue = findViewById(R.id.tv_Blue);
        tv_Red_Szam = findViewById(R.id.tv_Red_Szam);
        tv_Green_Szam = findViewById(R.id.tv_Green_Szam);
        tv_Blue_Szam = findViewById(R.id.tv_Blue_Szam);
        tv_szin = findViewById(R.id.tv_szin);
        v_hatter_szin = findViewById(R.id.v_hatter_szin);

        sb_Red.setOnSeekBarChangeListener(
                new SeekBar.OnSeekBarChangeListener() {
                    @Override
                    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                        tv_Red_Szam.setText(""+progress);
                        piros = progress;
                        tv_szin.setText("("+piros+","+zold+","+kek+")");
                        v_hatter_szin.setBackgroundColor(Color.rgb(piros,zold,kek));
                    }

                    @Override
                    public void onStartTrackingTouch(SeekBar seekBar) {

                    }

                    @Override
                    public void onStopTrackingTouch(SeekBar seekBar) {

                    }
                }
        );
        sb_Green.setOnSeekBarChangeListener(
                new SeekBar.OnSeekBarChangeListener() {
                    @Override
                    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                        tv_Green_Szam.setText(""+progress);
                        zold = progress;
                        tv_szin.setText("("+piros+","+zold+","+kek+")");
                        v_hatter_szin.setBackgroundColor(Color.rgb(piros,zold,kek));
                    }

                    @Override
                    public void onStartTrackingTouch(SeekBar seekBar) {

                    }

                    @Override
                    public void onStopTrackingTouch(SeekBar seekBar) {

                    }
                }
        );
        sb_Blue.setOnSeekBarChangeListener(
                new SeekBar.OnSeekBarChangeListener() {
                    @Override
                    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                        tv_Blue_Szam.setText(""+progress);
                        kek = progress;
                        tv_szin.setText("("+piros+","+zold+","+kek+")");
                        v_hatter_szin.setBackgroundColor(Color.rgb(piros,zold,kek));
                    }

                    @Override
                    public void onStartTrackingTouch(SeekBar seekBar) {

                    }

                    @Override
                    public void onStopTrackingTouch(SeekBar seekBar) {

                    }
                }
        );


    }

}
