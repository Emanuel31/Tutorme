package com.globomed.tutorme.Student;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.globomed.tutorme.R;
import com.globomed.tutorme.Tutor.TutorLoginActivity;
import com.globomed.tutorme.Tutor.TutorRegisterActivity;

public class StudentRegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sudent_register);

        StudentLoginRedirect();
    }

    private void StudentLoginRedirect() {
        Button signIn = findViewById(R.id.std_login_screen);

        signIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(StudentRegisterActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });
    }
}