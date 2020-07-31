package com.example.onepoint;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class DialogFacultyActivity extends AppCompatActivity {

    public static final int REQUEST_PHONE_CALL = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_dialog_faculty );

        TextView textView = (TextView) findViewById( R.id.dialog_text );
        TextView textViewPhone = (TextView) findViewById( R.id.dialog_phone );


        Bundle extras = getIntent().getExtras();
        String username_string = extras.getString( "NAME" );


        final String phone_string = extras.getString( "PHONE NO" );

        textView.setText( username_string );
        textViewPhone.setText( phone_string );

        textViewPhone.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentcall = new Intent( Intent.ACTION_CALL, Uri.parse( "tel:" + "9830992933" ) );
                if (ContextCompat.checkSelfPermission(DialogFacultyActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(DialogFacultyActivity.this, new String[]{Manifest.permission.CALL_PHONE},REQUEST_PHONE_CALL);
                }
                else
                {
                    startActivity(intentcall);
                }
            }
        } );


    }
}
