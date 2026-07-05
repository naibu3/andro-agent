package com.indalweb.aficionFAB;

import android.os.Bundle;
import java.io.IOException;
import org.apache.cordova.CordovaActivity;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes2.dex */
public class MainActivity extends CordovaActivity {
    @Override // org.apache.cordova.CordovaActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) throws XmlPullParserException, IOException {
        super.onCreate(bundle);
        Bundle extras = getIntent().getExtras();
        if (extras != null && extras.getBoolean("cdvStartInBackground", false)) {
            moveTaskToBack(true);
        }
        loadUrl(this.launchUrl);
    }
}
