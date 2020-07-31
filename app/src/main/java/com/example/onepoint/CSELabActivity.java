package com.example.onepoint;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class CSELabActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_cse__lab_ );




        ArrayList<Person> cselablist = new ArrayList<Person>();

        //facultyArrayList.add(new Faculty("Uddalok", "Professor"));
        //facultyArrayList.add(new Faculty("Kingshuk", "Professor"));
        Person Monish= new Person("Dr.Monish Chatterjee","8670466095","Associate Professor & HOD","monishchatterjee@rediffmail.com",R.drawable.image_faculty);
        Person Sandip= new Person("Mr.Sandip Roy","9932881846","Assistant Professor","sandip_9500@rediffmail.com",R.drawable.image_faculty);
        Person Abhishek= new Person("Mr.Abhishek Bandyopadhyay","9641774807","Assistant Professor","dr.bady_g@rediffmail.com",R.drawable.image_faculty);
        Person Ujjwal= new Person("Mr.Ujjwal Kumar Kamila","9932195104","Assistant Professor","ujjwal.kamila@gmail.com",R.drawable.image_faculty);
        Person Sabyasachi= new Person("Mr.Sabyasachi Mukherjee","9434477963","Assistant Professor","sabyasachi.mukherjee24@gmail.com",R.drawable.image_faculty);
        Person Pranabes= new Person("Mr.Pranabes Gangopadhyay","7797622182","Assistant Professor","pranabes7@gmail.com",R.drawable.image_faculty);
        Person Uddalok= new Person("Mr.Uddalok Sen","9163067859","Assistant Professor","uddaloksen81@gmail.com",R.drawable.image_faculty);
        Person Kinshuk= new Person("Mr.Kinshuk Banerjee","N/A","Assistant Professor","N/A",R.drawable.image_faculty);
        Person Shibsankar= new Person("Mr.Shibsankar Bala","9474020052","Assistant Professor","shibsankar.bala@gmail.com",R.drawable.image_faculty);
        Person Simanta= new Person("Mr.Simanta Hazra","N/A","Assistant Professor","simantahazra2@rediffmail.com",R.drawable.image_faculty);
        Person Shatabdi= new Person("Mrs.Shatabdi Saha","N/A","Assistant Professor","shatabdi.mondal@gmail.com",R.drawable.image_faculty);
        Person Vedatrayee= new Person("Mrs.Vedatrayee Chatterjee","N/A","Assistant Professor","chatterjee_vedatrayee@rediffmail.com",R.drawable.image_faculty);
        Person Lumbini= new Person("Mrs.Lumbini Bhaumik","N/A","Assistant Professor","lumbinibhaumik@gmail.com",R.drawable.image_faculty);

        //ArrayList<Person> peoplelist = new ArrayList<>();
        cselablist.add(Monish);
        cselablist.add(Sandip);
        cselablist.add(Abhishek);
        cselablist.add(Ujjwal);
        cselablist.add(Sabyasachi);
        cselablist.add(Pranabes);
        cselablist.add(Uddalok);
        cselablist.add(Kinshuk);
        cselablist.add(Shibsankar);
        cselablist.add(Simanta);
        cselablist.add(Shatabdi);
        cselablist.add(Vedatrayee);
        cselablist.add(Lumbini);



        FacultyAdapter adapter = new FacultyAdapter(this, cselablist);

        ListView listView = (ListView) findViewById(R.id.cselabListxml);
        listView.setAdapter(adapter);





    }
}
