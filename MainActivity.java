package com.example.myapplication8;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;
import android.widget.CompoundButton;

public class MainActivity extends AppCompatActivity {
    CheckBox Check;
    ToggleButton togle;
    RadioGroup group;
    SeekBar bar;
    TextView txt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Check = (CheckBox) findViewById(R.id.check);
        togle = (ToggleButton) findViewById(R.id.togle);
        group = (RadioGroup) findViewById(R.id.group);
        bar = (SeekBar)findViewById(R.id.seek);
        txt = (TextView) findViewById(R.id.txt);


       Check.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
           @Override
           public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
               if (Check.isChecked())
               {
                   Toast.makeText(MainActivity.this,"check",Toast.LENGTH_SHORT).show();
               }
               else
               {
                   Toast.makeText(MainActivity.this,"uncheck",Toast.LENGTH_SHORT).show();

               }

           }
       });

       togle.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
           @Override
           public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
               if (togle.isChecked())
               {
                   Toast.makeText(MainActivity.this,"on",Toast.LENGTH_SHORT).show();
               }
               else
               {
                   Toast.makeText(MainActivity.this,"off",Toast.LENGTH_SHORT).show();

               }

           }
       });


       group.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
           @Override
           public void onCheckedChanged(RadioGroup group, int checkedId) {
               RadioButton btn = (RadioButton)findViewById(checkedId);
               Toast.makeText(MainActivity.this,btn.getText().toString(),Toast.LENGTH_SHORT).show();
           }
       });

       bar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
           @Override
           public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
               txt.setText("Progress"+progress+"@");
           }

           @Override
           public void onStartTrackingTouch(SeekBar seekBar) {
               Toast.makeText(MainActivity.this,"start",Toast.LENGTH_SHORT).show();

           }

           @Override
           public void onStopTrackingTouch(SeekBar seekBar) {
               Toast.makeText(MainActivity.this,"stop",Toast.LENGTH_SHORT).show();

           }
       });





    }
}
