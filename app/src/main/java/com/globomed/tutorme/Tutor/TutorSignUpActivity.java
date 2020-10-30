package com.globomed.tutorme.Tutor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.globomed.tutorme.R;
import com.globomed.tutorme.Student.LoginActivity;

public class TutorSignUpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutor_sign_up);

        // Redirects a tutor when the already sign in button is clicked
        loginRedirect();
        moveNextToRegister();
    }

    private void loginRedirect() {
        Button signIn = findViewById(R.id.btn_tutor_signIn);

        signIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TutorSignUpActivity.this, TutorLoginActivity.class);
                startActivity(intent);
            }
        });
    }

    private void moveNextToRegister() {
        Button signIn = findViewById(R.id.button_next);

        signIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TutorSignUpActivity.this, TutorRegisterActivity.class);
                startActivity(intent);
            }
        });
    }
}