package com.example.onepoint;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

class FacultyAdapter extends ArrayAdapter<Person> {


    public Context context;
    public int lastPosition = -1;

    public FacultyAdapter(Context context, ArrayList<Person> words) {
        super( context, 0, words );
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from( getContext() ).inflate(
                    R.layout.list_adapter_layout, parent, false );
        }

        Person currentFaculty = getItem( position );
        //final  View result;
        ImageView imageView = (ImageView) listItemView.findViewById( R.id.image );
        imageView.setImageResource( currentFaculty.getImage() );

        TextView faculty_name_textview;
        faculty_name_textview = (TextView) listItemView.findViewById( R.id.textviewFacultyName );
        faculty_name_textview.setText( currentFaculty.getName() );


        TextView facultydesignationtextview;
        facultydesignationtextview = (TextView) listItemView.findViewById( R.id.textviewDesignation );
        facultydesignationtextview.setText( currentFaculty.getDes() );

        TextView facultyphoneno_text_view;
        facultyphoneno_text_view = (TextView) listItemView.findViewById( R.id.textviewPhoneno );
        facultyphoneno_text_view.setText( currentFaculty.getPhone_no() );

        TextView faculty_email_textview;
        faculty_email_textview = (TextView) listItemView.findViewById( R.id.textviewEmail );
        faculty_email_textview.setText( currentFaculty.getEmail() );


        View listItemView1 = listItemView;
        return listItemView1;


    }
}