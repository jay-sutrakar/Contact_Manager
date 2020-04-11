package com.example.contact_manager;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {
    private TextView Name;
    private TextView phoneNumber;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        Name=findViewById(R.id.nameId);
        phoneNumber=findViewById(R.id.phone_numberId);
        Bundle bundle=getIntent().getExtras();
        if(bundle!=null){
            String name=bundle.getString("name");
            String phone=bundle.getString("number");
            Name.setText(name);
            phoneNumber.setText(phone);
        }
    }
}
