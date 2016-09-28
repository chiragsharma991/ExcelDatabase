package com.example.mobilestyx.rnd;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ToggleButton toggleButton1=(ToggleButton)findViewById(R.id.button);
        final ToggleButton toggleButton2=(ToggleButton)findViewById(R.id.button1);
      //  Button button=(Button)findViewById(R.id.click);

        // this will changemit?
        toggleButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(toggleButton1.isChecked())
                {
                    Toast.makeText(MainActivity.this,"checked",Toast.LENGTH_SHORT).show();
                }else
                {
                    Toast.makeText(MainActivity.this,"unchecked",Toast.LENGTH_SHORT).show();
                }
            }
        });

       final Switch aSwitch=(Switch)findViewById(R.id.swith);
        aSwitch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(aSwitch.isChecked())
                {
                    Toast.makeText(MainActivity.this,"switch checked",Toast.LENGTH_SHORT).show();
                }else
                {
                    Toast.makeText(MainActivity.this,"switch unchecked",Toast.LENGTH_SHORT).show();
                }

            }
        });

        CheckBox checkBox=(CheckBox)findViewById(R.id.checkbox123);
        RadioButton radio1=(RadioButton)findViewById(R.id.Radio1);
        RadioButton radio2=(RadioButton)findViewById(R.id.Radio2);
        RadioGroup radioGroup=(RadioGroup)findViewById(R.id.Radio) ;
        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean ischecked) {
                if(ischecked)
                {
                    Toast.makeText(MainActivity.this,"check box is checked",Toast.LENGTH_SHORT).show();

                }else
                {
                    Toast.makeText(MainActivity.this,"check box is unchecked",Toast.LENGTH_SHORT).show();

                }


            }
        });
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedID) {
                if(checkedID==R.id.Radio1)
                {
                    Toast.makeText(MainActivity.this,"Radio one is checked",Toast.LENGTH_SHORT).show();


                }else if(checkedID==R.id.Radio2)
                {
                    Toast.makeText(MainActivity.this,"Radio two is checked",Toast.LENGTH_SHORT).show();

                }else
                {
                    Toast.makeText(MainActivity.this,"nothing",Toast.LENGTH_SHORT).show();

                }
            }
        });



    }
}
