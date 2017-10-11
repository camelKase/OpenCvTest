package comcamelkase.httpsgithub.opencvtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.view.View;
import android.content.Intent;


import org.opencv.android.OpenCVLoader;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    static {
        if (!OpenCVLoader.initDebug()) {
            Log.d (TAG, "OpenCV not loaded");
        } else {
            Log.d (TAG, "OpenCV WORKS FINALLY T.T");
        }
    }
    private void configureNextButton() {
        Button nextButton = (Button) findViewById(R.id.nextButton);
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, FullscreenActivity.class));
            }
        });
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        configureNextButton();
    }


}
