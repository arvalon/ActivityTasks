package ru.arvalon.activitytasks;

import android.app.ActivityManager;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class D extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(A.TAG,getClass().getSimpleName()+" onCreate");
        setContentView(R.layout.activity_d);

        App.getInstance().printActivityStack(this);

        View view=new View(this);
        //gotoX(view);

    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Log.d(A.TAG,getClass().getSimpleName()+" onNewIntent");
    }

    public void gotoX(View view) {
        Intent intent = new Intent(this,X.class);
        //intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        //intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(intent);
    }
}
