package com.example.onepoint;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;

public class GalleryActivity extends AppCompatActivity {

    int mposition;



    GridView gridView;

    ArrayList<Integer> imageArray = new ArrayList<>( Arrays.asList(

            R.drawable.pic1 , R.drawable.pic2, R.drawable.pic3 , R.drawable.pic4 , R.drawable.pc5,
            R.drawable.pic6 , R.drawable.pic7, R.drawable.pic8 , R.drawable.pic9 , R.drawable.pic10, R.drawable.pic12 , R.drawable.pic13, R.drawable.pic14,R.drawable.pic15
            , R.drawable.pic16, R.drawable.pic17 , R.drawable.pic18 , R.drawable.pic5, R.drawable.pic19
    ) ) ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_gallery );

        GridView gridView = findViewById( R.id.Grid_view );
        gridView.setAdapter( new ImageAdapter( imageArray, this ) );
        // gridView.setExpanded(true);

        gridView.setOnItemClickListener( new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                int item_ps = imageArray.get( position );

                showdialogbox( item_ps );

            }
        } );

    }



        public void showdialogbox (final int item_pos){
            final Dialog dialog = new Dialog( this );
            dialog.setContentView( R.layout.custom_layout_box );


            TextView Image_name = dialog.findViewById( R.id.text_image_name );
            ImageView image = dialog.findViewById( R.id.img );
            Button btn_full = dialog.findViewById( R.id.btn_full );
            Button btn_cls = dialog.findViewById( R.id.btn_cls );

            String Title = getResources().getResourceName( item_pos );

            int index = Title.indexOf( "/" );

            String name = Title.substring( index+1,Title.length() );
            Image_name.setText( name );

            image.setImageResource( item_pos );

            btn_cls.setOnClickListener( new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    dialog.dismiss();
                }
            } );

            btn_full.setOnClickListener( new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i = new Intent( GalleryActivity.this,FullScreenActivity.class );
                    i.putExtra( "image_id",item_pos );
                    startActivity( i );
                }
            } );

            dialog.show();








        }
}
