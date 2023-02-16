package ru.arvalon.activitytasks;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

/**
 * This is A ativity
 */
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
