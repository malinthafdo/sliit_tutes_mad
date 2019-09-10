package com.example.mad_tutorial_4_sqlite;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.mad_tutorial_4_sqlite.Database.DBHelper;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button signIn, add, delete, update, selectAll;
    TextView uName, pwd;
    DBHelper dbHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dbHelper = new DBHelper(this);
        signIn = (Button)findViewById(R.id.btnSignIn);
        add = (Button)findViewById(R.id.btnAdd);
        delete = (Button)findViewById(R.id.btnDelete);
        update = (Button)findViewById(R.id.btnUpdate);
        selectAll = (Button)findViewById(R.id.btnSelectAll);

        uName = (TextView)findViewById(R.id.username);
        pwd = (TextView)findViewById(R.id.pasword);

        signIn.setOnClickListener(this);
        add.setOnClickListener(this);
        delete.setOnClickListener(this);
        update.setOnClickListener(this);
        selectAll.setOnClickListener(this);

    }

    public void onClick(View view){

    }
}
