package id.blackbear.vulnapk;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* loaded from: classes3.dex */
public class SettingsActivity extends AppCompatActivity {
    Button delete;
    EditText ip;
    Button submit;

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        this.submit = (Button) findViewById(R.id.settings_save);
        this.delete = (Button) findViewById(R.id.settings_delete);
        this.ip = (EditText) findViewById(R.id.settings_ip);
        this.submit.setOnClickListener(new View.OnClickListener() { // from class: id.blackbear.vulnapk.SettingsActivity.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) throws IOException {
                try {
                    FileOutputStream fos = SettingsActivity.this.openFileOutput("ip_settings", 0);
                    fos.write(SettingsActivity.this.ip.getText().toString().getBytes());
                    fos.close();
                    Toast.makeText(SettingsActivity.this.getApplicationContext(), "Saved successfully.", 0).show();
                } catch (IOException e) {
                    e.printStackTrace();
                    Toast.makeText(SettingsActivity.this.getApplicationContext(), "Error occurred.", 0).show();
                }
            }
        });
        this.delete.setOnClickListener(new View.OnClickListener() { // from class: id.blackbear.vulnapk.SettingsActivity.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                File file = new File("data/data/id.blackbear.vulnapk/files/ip_settings");
                if (file.exists()) {
                    boolean isDeleted = file.delete();
                    if (isDeleted) {
                        Toast.makeText(SettingsActivity.this.getApplicationContext(), "File deleted successfully", 0).show();
                        return;
                    } else {
                        Toast.makeText(SettingsActivity.this.getApplicationContext(), "Error occurred.", 0).show();
                        return;
                    }
                }
                Toast.makeText(SettingsActivity.this.getApplicationContext(), "File doesn't exist.", 0).show();
            }
        });
    }
}
