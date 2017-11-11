package id.co.kakaroto.sharedprefrencesdemoiak;

import android.app.Application;

/**
 * Created by kakaroto on 11/11/17.
 */

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Me.init(this);
    }
}
