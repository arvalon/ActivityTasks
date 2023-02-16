package ru.arvalon.activitytasks;

import android.app.ActivityManager;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

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
