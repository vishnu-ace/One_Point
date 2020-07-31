package com.example.onepoint;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LabActivity extends AppCompatActivity {


    Button cse_lab;
    Button ece_lab;
    Button it_lab;
    Button me_lab;
    Button ee_lab;
    Button ce_lab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_lab );

        cse_lab =(Button)findViewById( R.id.Activity_Lab_CSE_Button );
        ece_lab=(Button)findViewById(R.id.Activity_Lab_ECE_Button);
        it_lab=(Button)findViewById(R.id.Activity_Lab_IT_Button);
        me_lab=(Button)findViewById(R.id.Activity_Lab_ME_Button);
        ee_lab=(Button)findViewById(R.id.Activity_Lab_EE_Button);
        ce_lab=(Button)findViewById(R.id.Activity_Lab_CE_Button);



        cse_lab.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cse_intent = new Intent( LabActivity.this, CSELabActivity.class );
                startActivity( cse_intent );
            }
        } );


        ece_lab.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cse_intent = new Intent( LabActivity.this, CSELabActivity.class );
                startActivity( cse_intent );
            }
        } );

        it_lab.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cse_intent = new Intent( LabActivity.this, CSELabActivity.class );
                startActivity( cse_intent );
            }
        } );

        me_lab.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cse_intent = new Intent( LabActivity.this, CSELabActivity.class );
                startActivity( cse_intent );
            }
        } );


        ee_lab.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cse_intent = new Intent( LabActivity.this, CSELabActivity.class );
                startActivity( cse_intent );
            }
        } );


        ce_lab.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cse_intent = new Intent( LabActivity.this, CSELabActivity.class );
                startActivity( cse_intent );
            }
        } );


    }

}
