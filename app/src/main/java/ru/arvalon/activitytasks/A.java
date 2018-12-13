package ru.arvalon.activitytasks;

import android.app.ActivityManager;
import android.content.Intent;
import android.support.v4.app.ActivityManagerCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class A extends AppCompatActivity {

    public static final String TAG = "happy";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);

        App.getInstance().printActivityStack(this);

        View view=new View(this);
        //gotoB(view);

    }

    public void gotoB(View view) {
        Intent intent = new Intent(this,B.class);
        startActivity(intent);
    }
}
