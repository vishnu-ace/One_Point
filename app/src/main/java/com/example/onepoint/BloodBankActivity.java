package com.example.onepoint;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;

public class BloodBankActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    private Spinner spinner;
    private Button becomeDonorButton;
    private String spinnerSelectedItem;
    private Button searchDonorButton;
    private EditText editTextBecomeDonorPhoneNumber;
    private EditText editTextBecomeDonorAge;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_blood_bank );

        final Spinner spinner = (Spinner) findViewById(R.id.spinner_blood_group_list);
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.blood_group_list, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        spinner.setAdapter(adapter);

        becomeDonorButton=(Button)findViewById( R.id.become_donor_button );
        searchDonorButton=(Button)findViewById( R.id.search_donor_button );
        editTextBecomeDonorPhoneNumber=(EditText)findViewById( R.id.editText_become_donor_phoneNumber );
        editTextBecomeDonorAge=(EditText)findViewById( R.id.editText_become_donor_age );

       spinner.setOnItemSelectedListener( this );




        searchDonorButton.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity( new Intent( BloodBankActivity.this,SearchDonorActivity.class ) );
            }
        } );



        becomeDonorButton.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (editTextBecomeDonorAge == null && editTextBecomeDonorPhoneNumber == null)
                {

                    Toast.makeText( getApplicationContext(),"Empty Values",Toast.LENGTH_LONG ).show();
                }


                else
                {

                    addBloodValue();

                    startActivity( new Intent(BloodBankActivity.this,BecomeDonorActivity.class) );

                    editTextBecomeDonorPhoneNumber.setText( "" );
                    editTextBecomeDonorAge.setText( "" );
                }

            }
        } );


    }

    private void addBloodValue() {

        HashMap<String,Object> hashMap=new HashMap<>();
        hashMap.put("Phone",editTextBecomeDonorPhoneNumber.getText().toString());
        hashMap.put("Age",editTextBecomeDonorAge.getText().toString());

        FirebaseDatabase.getInstance().getReference().child(spinnerSelectedItem).push()
                .setValue(hashMap);


    }


    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

        spinnerSelectedItem=adapterView.getItemAtPosition(i).toString();

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}
