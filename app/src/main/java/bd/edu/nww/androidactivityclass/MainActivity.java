package bd.edu.nww.androidactivityclass;

import android.content.Intent;
import android.net.Uri;
import android.os.Parcelable;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.io.Serializable;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    public static final String TAG = MainActivity.class.getSimpleName();

    ImageView imageView;
    private Button btnBrowser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_framelayout);
        imageView = findViewById(R.id.imageViw_santa);
        btnBrowser = findViewById(R.id.btnBrowser);
        btnBrowser.setOnClickListener(this);
        imageView.setOnClickListener(this);
        Log.d(TAG, "onCreate()");

    }

    @Override
    public void onSaveInstanceState(Bundle outState, PersistableBundle outPersistentState) {
        super.onSaveInstanceState(outState, outPersistentState);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy()");
    }

    @Override
    public void onClick(View view) {

        if (view.getId() == R.id.imageViw_santa) {

            Intent intent = new Intent(this, SecondActivity.class);
            intent.putExtra(SecondActivity.NAME, "From first Activity");
            startActivity(intent);
            overridePendingTransition(R.anim.activity_slide_start_enter, R.anim.activity_slide_finish_exit);
           // overridePendingTransition(android.R.anim.fade_in, R.anim.activity_slide_finish_exit);


        } else if (view.getId() == R.id.btnBrowser) {
            onBrowseClick();
        }

    }


    public void onBrowseClick() {
        String url = "http://www.google.com";
        Uri uri = Uri.parse(url);
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        // Verify that the intent will resolve to an activity
        if (intent.resolveActivity(getPackageManager()) != null) {
            // Here we use an intent without a Chooser unlike the next example
            startActivity(intent);
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
    }
}
