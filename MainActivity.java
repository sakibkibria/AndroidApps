package com.example.sakib_kibria.aibio;

import android.content.Intent;
import android.support.annotation.BoolRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Switch;
//import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void OnClick(View view ){
        //create a new intent
        Intent i=new Intent(this,secondMainActivity.class);
        //find textview by id
        final EditText text= (EditText) findViewById(R.id.Message);
        //find textview by id
        final EditText text2= (EditText) findViewById(R.id.Message2);
        //find textview by id
        final EditText text3= (EditText) findViewById(R.id.Message3);
        //find switch my id
        final Switch switch1=(Switch) findViewById(R.id.switch1) ;
        //check status of switch
        Boolean switchstate=switch1.isChecked();
        //Switch output NO/YES
        String switchtext;
        if(switchstate==true){
            switchtext="currently employed ";
        }
        else
        {switchtext="Not employed ";}

        //Get a reference to the Spinner
        Spinner spinner = (Spinner) findViewById(R.id.spinner);

        //Get the selected item in the Spinner
        String spinnerstring = String.valueOf(spinner.getSelectedItem());


        //Get a reference to the checkbox
        CheckBox checkedbox = (CheckBox) findViewById(R.id.checkBox);

        //State of the Checked box
        Boolean CheckedBoxState = checkedbox.isChecked();
      //If CheckBox output if check ON/OFF
        String checkboxtext;
        if(CheckedBoxState==true){
            checkboxtext=" receiving 401 Benefits and Heath Insurance Package. ";
        }
        else
        {checkboxtext="Not receiving any Benefits. ";}

        //converts the object to string
        String usermessage= text.getText().toString();
        String usermessage2= text2.getText().toString();
        String usermessage3= text3.getText().toString();
         //SEND TO SEND_ACTIVITY
        i.putExtra("sendmessage",usermessage);
        i.putExtra("sendmessage2",usermessage2);
        i.putExtra("sendmessage6",usermessage3);
        i.putExtra("sendmessage3",switchtext);
        i.putExtra("sendmessage4",spinnerstring);
        i.putExtra("sendmessage5",checkboxtext);
        startActivity(i);

    }
}
