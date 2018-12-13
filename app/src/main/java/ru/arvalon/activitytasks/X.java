package ru.arvalon.activitytasks;

import android.app.ActivityManager;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class X extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_x);

        App.getInstance().printActivityStack(this);

        View view=new View(this);
        //gotoY(view);
    }

    public void gotoY(View view) {
        Intent intent = new Intent(this,Y.class);
        startActivity(intent);
    }
}
