package com.example.jera.activityejer;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {
     TextView tv2;
    Button btn3;
    String result="antes del boton";
    Intent i2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        tv2 =(TextView) findViewById(R.id.tv2);
        i2= getIntent();
        Bundle b2 = i2.getExtras();
        if(b2!=null)
        {
            String j =(String) b2.get("name");
            tv2.setText(j);
        }
        i2.putExtra("result",result);
        setResult(Activity.RESULT_OK,i2);





        btn3 = (Button)findViewById(R.id.btn3);
        btn3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                result = "RESULTADO DE REGRESO";
                putResult();
                finish();

            }
        });// fin click






    }

    private void putResult() {

        i2.putExtra("result",result);
        setResult(Activity.RESULT_OK,i2);
    }
}
