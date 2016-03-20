package com.example.jera.activityejer;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
Button btn, btn2;

    EditText et;
    TextView tv3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et = (EditText) findViewById(R.id.et);
        btn = (Button)findViewById(R.id.btn1);
        tv3 =(TextView) findViewById(R.id.tv3);
        btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                passActivity2();
            }
        });// fin click

        btn2 = (Button)findViewById(R.id.btn2);
        btn2.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                finish();
            }
        });// fin click

    } // fin de oncreate

    public void passActivity2() {
        Intent i = new Intent(this, Activity2.class);
        i.putExtra("name",et.getText().toString());
        startActivityForResult(i, 1);

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {

        if (requestCode == 1) {
            if(resultCode == Activity.RESULT_OK){
                String re=data.getStringExtra("result");
                tv3.setText(re);
            }
            if (resultCode == Activity.RESULT_CANCELED) {
                //Write your code if there's no result
            }
        }
    }//onActivityResult





}//fin MAin
