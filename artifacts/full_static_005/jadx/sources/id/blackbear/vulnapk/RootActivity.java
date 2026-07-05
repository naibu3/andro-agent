package id.blackbear.vulnapk;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.scottyab.rootbeer.RootBeer;

/* loaded from: classes3.dex */
public class RootActivity extends AppCompatActivity {
    TextView hook;
    TextView status;

    public String checkStatus(String status) {
        if (status.equals("Admin")) {
            return "yay";
        }
        return "nay";
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rootdetection);
        this.status = (TextView) findViewById(R.id.root_status);
        this.hook = (TextView) findViewById(R.id.hook_status);
        RootBeer rootBeer = new RootBeer(this);
        if (rootBeer.isRooted()) {
            this.status.setText("STATUS: ROOT DETECTED!!!!!");
        } else {
            this.status.setText("STATUS: ROOT IS NOT DETECTED.");
        }
        if (checkStatus("NormalUser").equals("yay")) {
            this.hook.setText("STATUS: YOU ARE ADMIN!");
        } else {
            this.hook.setText("STATUS: WHO ARE YOU ?!");
        }
    }
}
