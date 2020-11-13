package com.example.fyptest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {
    EditText txtName, txtAge, txtPhoneNo, txtHeight;
    Button btnSave;
    DatabaseReference reff;

    Member member;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtName=(EditText)findViewById(R.id.txtName);
        txtAge=(EditText)findViewById(R.id.txtAge);
        txtPhoneNo=(EditText)findViewById(R.id.txtPhoneNo);
        txtHeight=(EditText)findViewById(R.id.txtHeight);
        btnSave=(Button)findViewById(R.id.btnSave);
        member=new Member();
        reff= FirebaseDatabase.getInstance().getReference().child("Member");
        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int age=Integer.parseInt(txtAge.getText().toString().trim());
                Float height=Float.parseFloat(txtHeight.getText().toString().trim());
                Long phoneNo=Long.parseLong(txtPhoneNo.getText().toString().trim());

                member.setName(txtName.getText().toString().trim());
                member.setAge(age);
                member.setHeight(height);
                member.setPhoneNo(phoneNo);

                reff.push().setValue(member);
                Toast.makeText(MainActivity.this, "Data Inserted Successfully",Toast.LENGTH_LONG).show();
            }
        });

    }
}