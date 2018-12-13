package ru.arvalon.activitytasks;

import android.app.ActivityManager;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class C extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c);

        App.getInstance().printActivityStack(this);

        View view=new View(this);
        //gotoD(view);

    }

    public void gotoD(View view) {
        Intent intent = new Intent(this,D.class);
        startActivity(intent);
    }
}
