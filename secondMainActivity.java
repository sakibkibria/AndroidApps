package com.example.sakib_kibria.aibio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.Manifest;

import org.w3c.dom.Text;

public class secondMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_layout);

        Bundle data =getIntent().getExtras();


        String welcomemessage = data.getString("sendmessage");
        String welcomemessage2 = data.getString("sendmessage2");
        String welcomemessage3 = data.getString("sendmessage3");
        String welcomemessage4 = data.getString("sendmessage4");
        String welcomemessage5 = data.getString("sendmessage5");
        String welcomemessage6 = data.getString("sendmessage6");
        final TextView outputtext= (TextView)findViewById(R.id.outputmeassage);
        String finalmessage= welcomemessage +" is a "+welcomemessage4 +" "+welcomemessage6+" at "+welcomemessage2+" "+ welcomemessage3 +" "+welcomemessage5;
        outputtext.setText(finalmessage);


    }
}
