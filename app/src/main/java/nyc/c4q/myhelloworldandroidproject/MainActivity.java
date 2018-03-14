package nyc.c4q.myhelloworldandroidproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("MainActivity", "This is a test");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("MainActivity", "This is a test of the onStart method");
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.d("MainActivity", "This is a test of the onResume method");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("MainActivity", "This is a test of the onPause method");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("MainActivity", "This is a test of the onStop method");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("MainActivity", "This is a test of the onDestroy method");
    }
}
