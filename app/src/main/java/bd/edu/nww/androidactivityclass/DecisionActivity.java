package bd.edu.nww.androidactivityclass;

import android.databinding.DataBindingUtil;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.Toast;

import bd.edu.nww.androidactivityclass.databinding.ActivityDecisionBinding;

public class DecisionActivity extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener{
//private ActivityDecisionBinding binding;
    ActivityDecisionBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       binding = DataBindingUtil.setContentView(this,R.layout.activity_decision);
       binding.radioGoupGender.setOnCheckedChangeListener(this);
       /* radioGroupGender = findViewById(R.id.radioGoup_gender);
        radioGroupGender.setOnCheckedChangeListener(this);
        relativeLayout = findViewById(R.id.relativeLayout);*/
        /*radioGroupGender.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                int selectedButtonID = radioGroup.getCheckedRadioButtonId();
                if (selectedButtonID == R.id.radioBtn_male) {
                    relativeLayout.setBackgroundColor(Color.RED);
                    Toast.makeText(DecisionActivity.this, "Male Selected", Toast.LENGTH_SHORT).show();
                } else if (selectedButtonID == R.id.radioBtn_female) {
                    Toast.makeText(DecisionActivity.this, "Female Selected", Toast.LENGTH_SHORT).show();

                }
            }
        });*/
    }

    @Override
    public void onCheckedChanged(RadioGroup radioGroup, int i) {
        int selectedButtonID = radioGroup.getCheckedRadioButtonId();
        if (selectedButtonID == R.id.radioBtn_male) {
            binding.relativeLayout.setBackgroundColor(Color.RED);
            Toast.makeText(DecisionActivity.this, "Male Selected", Toast.LENGTH_SHORT).show();
        } else if (selectedButtonID == R.id.radioBtn_female) {
            Toast.makeText(DecisionActivity.this, "Female Selected", Toast.LENGTH_SHORT).show();

        }
    }
}
