package com.example.onepoint;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class CSETechnicalListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_csetechnical_list );



        ArrayList<Person> technialList = new ArrayList<Person>();

        //facultyArrayList.add(new Faculty("Uddalok", "Professor"));
        //facultyArrayList.add(new Faculty("Kingshuk", "Professor"));
        Person Suman= new Person("Mr.Suman Mallick","N/A","Sr. Technical Assistant","N/A",R.drawable.image_faculty);
        Person CSK= new Person("Mr.Chandra Sekhar Kundu","N/A","Sr. Technical Assistant","N/A",R.drawable.image_faculty);
        Person Debendra= new Person("Mr.Debendra Nath Pattanayak","N/A","Sr. Technical Assistant","debu78@gmail.com",R.drawable.image_faculty);
        Person Satyendra= new Person("Mr. Satyendra Kumar Srivastav","N/A","Technical Assistant","N/A",R.drawable.image_faculty);
        Person Samiran= new Person("Mr. Samiran Gupta","N/A","Technical Assistant","N/A",R.drawable.image_faculty);
        Person Rajat= new Person("Mr. Rajat Ghosh","N/A","Technical Assistant","N/A",R.drawable.image_faculty);
        Person Sourav= new Person("Mr.Sourav Gayen","N/A","Technical Assistant","N/A",R.drawable.image_faculty);
        Person Babai= new Person("Mr.Babai Ukil","N/A","Assistant Professor","babaiukilasn@gmail.com",R.drawable.image_faculty);


        //ArrayList<Person> technialList = new ArrayList<>();
        technialList.add(Suman);
        technialList.add(CSK);
        technialList.add(Debendra);
        technialList.add(Satyendra);
        technialList.add(Samiran);
        technialList.add(Rajat);
        technialList.add(Sourav);
        technialList.add(Babai);




        FacultyAdapter techadapter = new FacultyAdapter(this, technialList);

        ListView listView = (ListView) findViewById(R.id.technicalfacultyList);
        listView.setAdapter(techadapter);





    }
}
