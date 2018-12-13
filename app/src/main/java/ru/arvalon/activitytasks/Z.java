package ru.arvalon.activitytasks;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class Z extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_z);

        App.getInstance().printActivityStack(this);

    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Log.d(A.TAG,getClass().getSimpleName()+" onNewIntent");
    }

    public void gotoD(View view) {
        Intent intent = new Intent(this,D.class);
        startActivity(intent);
    }

    public void gotoZ(View view) {
        Intent intent = new Intent(this,Z.class);
        startActivity(intent);
    }
}
