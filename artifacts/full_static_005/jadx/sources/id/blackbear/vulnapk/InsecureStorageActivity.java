package id.blackbear.vulnapk;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import java.io.FileOutputStream;
import java.io.IOException;

/* loaded from: classes3.dex */
public class InsecureStorageActivity extends AppCompatActivity {
    EditText name;
    TextView result;
    EditText secret;
    Button submit;

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insecurestorage);
        Button button = (Button) findViewById(R.id.insecure_submit);
        this.submit = button;
        button.setOnClickListener(new View.OnClickListener() { // from class: id.blackbear.vulnapk.InsecureStorageActivity.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) throws IOException {
                InsecureStorageActivity insecureStorageActivity = InsecureStorageActivity.this;
                insecureStorageActivity.name = (EditText) insecureStorageActivity.findViewById(R.id.insecure_name);
                InsecureStorageActivity insecureStorageActivity2 = InsecureStorageActivity.this;
                insecureStorageActivity2.secret = (EditText) insecureStorageActivity2.findViewById(R.id.insecure_secret);
                InsecureStorageActivity insecureStorageActivity3 = InsecureStorageActivity.this;
                insecureStorageActivity3.result = (TextView) insecureStorageActivity3.findViewById(R.id.insecure_result);
                String final_result = "This is your secret!\n" + InsecureStorageActivity.this.secret.getText().toString() + "\nBy: " + InsecureStorageActivity.this.name.getText().toString();
                InsecureStorageActivity.this.result.setText(final_result);
                Log.i("user_secret_info", final_result);
                try {
                    FileOutputStream fos = InsecureStorageActivity.this.openFileOutput("mysecret", 0);
                    fos.write(final_result.getBytes());
                    fos.close();
                    Toast.makeText(InsecureStorageActivity.this.getApplicationContext(), "Your secret is saved successfully in our very secure database!.", 0).show();
                } catch (IOException e) {
                    e.printStackTrace();
                    Toast.makeText(InsecureStorageActivity.this.getApplicationContext(), "Failed to save your secret :((", 0).show();
                }
            }
        });
    }
}
