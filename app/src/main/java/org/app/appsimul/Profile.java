package org.app.appsimul;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Profile extends AppCompatActivity {

    private TextView et_name, et_hp, et_birth, et_blood, et_address, et_height, et_weight, et_disease;
    private Button btn_edit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        et_name = (TextView) findViewById(R.id.et_name);
        et_hp = (TextView) findViewById(R.id.et_hp);
        et_birth = (TextView) findViewById(R.id.et_birth);
        et_blood = (TextView) findViewById(R.id.et_blood);
        et_address = (TextView) findViewById(R.id.et_address);
        et_height = (TextView) findViewById(R.id.et_height);
        et_weight = (TextView) findViewById(R.id.et_weight);
        et_disease = (TextView) findViewById(R.id.et_disease);

        btn_edit = (Button) findViewById(R.id.btn_edit);

        Intent intent = getIntent();
        String userID = intent.getStringExtra("userID");
        String userName = intent.getStringExtra("userName");

        et_hp.setText(userID);
        et_name.setText(userName);




    }
}