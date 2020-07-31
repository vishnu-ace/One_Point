package com.example.onepoint;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.view.MenuItem;
import android.view.View;

import com.google.android.material.navigation.NavigationView;
import com.smarteist.autoimageslider.IndicatorAnimations;
import com.smarteist.autoimageslider.IndicatorView.draw.controller.DrawController;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    //private static int Splash_Time_OUT = 3000;
    private DrawerLayout mdrawerlayout;
    private ActionBarDrawerToggle mtoggle;
    int mposition;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        final SliderView sliderView = findViewById(R.id.imageSlider);
        SliderAdapterExample adapter = new SliderAdapterExample(this);
        adapter.setCount(5);


        sliderView.setSliderAdapter(adapter);

        sliderView.setIndicatorAnimation( IndicatorAnimations.WORM);
        sliderView.setSliderTransformAnimation( SliderAnimations.CUBEINROTATIONTRANSFORMATION);
        sliderView.setAutoCycleDirection(SliderView.AUTO_CYCLE_DIRECTION_BACK_AND_FORTH);
        sliderView.setIndicatorSelectedColor( Color.WHITE);
        sliderView.setIndicatorUnselectedColor(Color.GRAY);
        sliderView.setScrollTimeInSec(2);
        sliderView.startAutoCycle();


        sliderView.setOnIndicatorClickListener((new DrawController.ClickListener() {
            @Override
            public void onIndicatorClicked(int position) {
                mposition = position;
                sliderView.setCurrentPagePosition(position);



            }
        }));



        mdrawerlayout = (DrawerLayout)findViewById(R.id.acitvity_main_navdrawer);
        mtoggle = new ActionBarDrawerToggle( this,mdrawerlayout,R.string.open ,R.string.close);

        mdrawerlayout.addDrawerListener( mtoggle );
        mtoggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled( true );

        NavigationView navigationView =(NavigationView)findViewById( R.id.navigation_view );
        navigationView.setNavigationItemSelectedListener( this );


        CardView mapCard = (CardView)findViewById(R.id.map_card );
        CardView labCard = (CardView)findViewById( R.id.labs_card );
        CardView facultyCard = (CardView)findViewById( R.id.faculty_card );
        CardView noticeCard = (CardView)findViewById( R.id.notice_card );
        CardView bloodBankCard = (CardView)findViewById( R.id.bloodbank_card );
        CardView galleryCard = (CardView)findViewById( R.id.gallery_card );

        galleryCard.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent openGalleryIntent = new Intent( MainActivity.this,GalleryActivity.class );
                startActivity( openGalleryIntent );
            }
        } );


        bloodBankCard.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent openBloodBankIntent = new Intent( MainActivity.this,BloodBankActivity.class );
                startActivity( openBloodBankIntent );
            }
        } );

        noticeCard.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent openNoticeIntent = new Intent( MainActivity.this,NoticeActivity.class );
                startActivity( openNoticeIntent );
            }
        } );




        labCard.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent openLabIntent = new Intent( MainActivity.this,LabActivity.class );
                startActivity( openLabIntent );
            }
        } );


        facultyCard.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent openFacultyIntent = new Intent( MainActivity.this,FacultyActivity.class );
                startActivity( openFacultyIntent );
            }
        } );



        mapCard.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent openMapIntent = new Intent( MainActivity.this, MapActivity.class );
                startActivity( openMapIntent );
            }
        } );
    }




    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if(mtoggle.onOptionsItemSelected( item )){
            return true;
        }


        return super.onOptionsItemSelected( item );
    }



    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

        int id =menuItem.getItemId();


        if (id == R.id.home)
        {
            Intent i_home = new Intent( MainActivity.this, MapActivity.class );
            startActivity( i_home );

        }

        if (id == R.id.notice)
        {
            Intent i_notice = new Intent( MainActivity.this, NoticeActivity.class );
            startActivity( i_notice );

        }
        if (id == R.id.bloodbank)
        {
            Intent i_blood = new Intent( MainActivity.this,BloodBankActivity.class );
            startActivity( i_blood );
        }

        if (id == R.id.gallery)
        {
            Intent i_gallery = new Intent( MainActivity.this,GalleryActivity.class );
            startActivity( i_gallery );
        }

        mdrawerlayout.closeDrawer( GravityCompat.START,true);
        return false;
    }
}
