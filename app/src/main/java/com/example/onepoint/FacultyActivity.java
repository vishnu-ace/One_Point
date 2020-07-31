package com.example.onepoint;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class FacultyActivity extends AppCompatActivity {



    private Button faculty_activity_button;
    private Button technical_activity_button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_faculty );

        faculty_activity_button = (Button) findViewById( R.id.Activity_Faculty_CSE_Button );
        technical_activity_button=(Button) findViewById( R.id.Activity_Technical_CSE_Button );


        faculty_activity_button.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent openfacultylist = new Intent( FacultyActivity.this, CSEFacultyListActivity.class);
                startActivity( openfacultylist );
            }
        } );


        technical_activity_button.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent opentechnicallist = new Intent( FacultyActivity.this,CSETechnicalListActivity.class );
                startActivity( opentechnicallist );
            }
        } );


    }




}
