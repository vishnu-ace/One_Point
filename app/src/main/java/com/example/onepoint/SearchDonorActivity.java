package com.example.onepoint;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class SearchDonorActivity extends AppCompatActivity {

    CardView opositiveCardView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_search_donor );


        opositiveCardView=(CardView)findViewById( R.id.cardViewOpositive );
        opositiveCardView.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity( new Intent( SearchDonorActivity.this,OPositiveList.class ) );
            }
        } );
    }
}
