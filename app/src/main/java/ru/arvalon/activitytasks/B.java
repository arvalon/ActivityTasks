package ru.arvalon.activitytasks;

import android.app.ActivityManager;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class B extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);

        App.getInstance().printActivityStack(this);

        View view=new View(this);
        //gotoC(view);
    }

    public void gotoC(View view) {
        Intent intent = new Intent(this,C.class);
        startActivity(intent);
    }
}
