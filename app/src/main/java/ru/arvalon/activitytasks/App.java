package ru.arvalon.activitytasks;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.util.Log;

/**
 * Created by arvalon on 27.02.2018.
 */

public class App extends Application {

    private static final String NULL = "null";

    private static App instance;

    public static App getInstance(){return instance;}

    private ActivityManager am;

    @Override
    public void onCreate() {
        super.onCreate();
        instance=this;
         am = (ActivityManager) this.getSystemService(this.ACTIVITY_SERVICE);
    }

    void printActivityStack(Activity activity){

        Log.d(A.TAG,"Task Stack from "+activity.getLocalClassName());


        for (ActivityManager.AppTask task : am.getAppTasks()) {

            String className = (task.getTaskInfo().topActivity != null) ? task.getTaskInfo().topActivity.getShortClassName() : NULL;

            String baseActivity = (task.getTaskInfo().baseActivity != null) ? task.getTaskInfo().baseActivity.getShortClassName() : NULL;

            Log.d(A.TAG,
                    "ID "+task.getTaskInfo().id+
                            " Desc: "+task.getTaskInfo().description+
                            " Num: "+task.getTaskInfo().numActivities+
                            " TopActivity: "+className+
                            " BaseActivity: "+baseActivity
                    );
        }

    }

}
