package app.qk.teliver;

import android.support.multidex.MultiDexApplication;

import com.teliver.sdk.core.TLog;
import com.teliver.sdk.core.Teliver;

public class MApplication extends MultiDexApplication {

    @Override
    public void onCreate() {
        super.onCreate();
        Teliver.init(this,"69af23887dfb444fb0285288e39fe7a2");
        TLog.setVisible(true);
    }
}
