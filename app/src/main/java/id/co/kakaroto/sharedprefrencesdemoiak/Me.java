package id.co.kakaroto.sharedprefrencesdemoiak;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by kakaroto on 11/11/17.
 */

public class Me {

    private final String KEY_NAME = "key-name";

    private SharedPreferences preferences;
    private SharedPreferences.Editor editor;
    private final String PREF_NAME = "pref-name";
    private static Me instace;

    public Me(Context context) {
        final int PRIVATE_MODE = 0;
        preferences = context.getSharedPreferences
                (PREF_NAME, PRIVATE_MODE);
        editor = preferences.edit();
    }

    public static void init(Context context) {
        instace = new Me(context);
    }

    public synchronized static Me getInstace() {
        return instace;
    }

    public void setData(String key, String value) {
        editor.putString(key, value);
        editor.commit();
    }

    public String getData(String key) {
        return preferences.getString(key, "");
    }

    public void setName(String name) {
        editor.putString(KEY_NAME, name);
        editor.commit();
    }

    public String getName() {
        return preferences.getString(KEY_NAME, "");
    }

    public void clear() {
        editor.clear();
        editor.commit();
    }
}
