package com.example.onepoint;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.firebase.database.FirebaseDatabase;

public class OPositiveList extends AppCompatActivity {

    RecyclerView oPositiveRecyclerView;
    BloodGroupAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_opositive_list );

        oPositiveRecyclerView =(RecyclerView)findViewById( R.id.o_positive_recyclerview );
        oPositiveRecyclerView.setLayoutManager( new LinearLayoutManager(this) );

        FirebaseRecyclerOptions<BloodGroupDetails> options =
                new FirebaseRecyclerOptions.Builder<BloodGroupDetails>()
                        .setQuery( FirebaseDatabase.getInstance().getReference().child( "O+" ), BloodGroupDetails.class)
                        .build();


        adapter = new BloodGroupAdapter( options );
        oPositiveRecyclerView.setAdapter( adapter );

    }

    @Override
    protected void onStart() {
        super.onStart();
        adapter.startListening();
    }


    @Override
    protected void onStop() {
        super.onStop();
        adapter.stopListening();
    }
}
