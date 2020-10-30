package com.globomed.tutorme.Common;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

import com.globomed.tutorme.R;
import com.globomed.tutorme.Student.StudentSignUpActivity;
import com.globomed.tutorme.Tutor.TutorSignUpActivity;

public class ChooseCategoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_category);
    }

    public void onRadioButtonClicked(View view) {
        // Checks if the radio button is now clicked
        boolean checked = ((RadioButton)view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case  R.id.radio_student:
                if(checked) {
                    studentCategory();
                }
                break;
            case R.id.radio_tutor:
                if(checked)
                   tutorCategory();
                break;
        }
    }

    public void studentCategory() {
        Intent intent = new Intent(this, StudentSignUpActivity.class);
        startActivity(intent);
    }

    public void tutorCategory() {
        Intent intent = new Intent(this, TutorSignUpActivity.class);
        startActivity(intent);
    }
}