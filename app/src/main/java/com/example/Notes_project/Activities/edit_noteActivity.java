package com.example.Notes_project.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.Notes_project.Activities.NotesShowAll;
import com.example.Notes_project.R;


public class edit_noteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_note);
    }
    public void showall(View view) {
        Intent showall=new Intent(this, NotesShowAll.class);
        startActivity(showall);

    }
}
