package ru.arvalon.activitytasks;

import android.app.ActivityManager;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class Y extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_y);

        App.getInstance().printActivityStack(this);

        View view=new View(this);
        //gotoZ(view);
    }

    public void gotoZ(View view) {
        Intent intent = new Intent(this,Z.class);
        startActivity(intent);
    }
}
