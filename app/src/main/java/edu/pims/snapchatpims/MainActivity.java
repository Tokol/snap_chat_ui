package edu.pims.snapchatpims;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.chip.Chip;

public class MainActivity extends AppCompatActivity {

    // Java variable  Initlize
    ImageView imageView;
    Chip btnLogin, btnSingUp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
       setContentView(R.layout.activity_main);
       //assocating java to xml ids;

        imageView = (ImageView) findViewById(R.id.logoImg);

        btnLogin = (Chip) findViewById(R.id.loginBtn);
        btnSingUp= (Chip)findViewById(R.id.signUpBtn);

        //clickable event
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //code here//
/// on clicked is triggered here
                Log.d("testing", "clicked");
            }
        });

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            //we will call intent class

                Intent intent = new Intent(MainActivity.this, LoginActivity.class);

                startActivity(intent);



            }
        });







    }


}