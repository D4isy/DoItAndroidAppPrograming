package org.androidtown.mission05;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public static final int REQUEST_CODE_MENU = 101;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    public void onButton1Clicked(View v) {
        Intent intent = new Intent(getApplicationContext(),MenuActivity.class);
        startActivityForResult(intent,REQUEST_CODE_MENU);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(resultCode ==RESULT_OK) {
            String name = data.getExtras().getString("name");
            Toast.makeText(getApplicationContext(),name,Toast.LENGTH_LONG).show();
        }
    }
}
