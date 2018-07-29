package bd.edu.nww.androidactivityclass;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    private TextView tvMessageMan;
    public static final String NAME ="NAME";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondactivity);
        tvMessageMan = findViewById(R.id.textView_message_man);

        Intent intent = getIntent();
        String messageValue = intent.getStringExtra(NAME);
        if (messageValue != null) {
            tvMessageMan.setText(messageValue);
        }
    }
}
