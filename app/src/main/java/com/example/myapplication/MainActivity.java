package com.example.myapplication;
import android.app.Activity;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
    SeekBar sb1;
    TextView tv1;
    LinearLayout layout;

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv1=(TextView)findViewById(R.id.textView1);
        layout=(LinearLayout)findViewById(R.id.linearLayout1);
        sb1=(SeekBar)findViewById(R.id.seekBar1);
        sb1.setOnSeekBarChangeListener(new OnSeekBarChangeListener() {

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                Toast.makeText(MainActivity.this, "3.放開滑感,數值＝"+sb1.getProgress(),Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                Toast.makeText(MainActivity.this, "1.按下滑桿,數值＝"+seekBar.getProgress(),Toast.LENGTH_SHORT ).show();

            }

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                tv1.setText("2.調整滑桿,數值"+progress);
                layout.setBackgroundColor(new Color().rgb(progress,progress,progress) );

            }
        });
    }

}

