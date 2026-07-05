package id.blackbear.vulnapk;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes3.dex */
public class InsecureCryptoActivity extends AppCompatActivity {
    TextView result;
    EditText secret;
    Button submit;

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insecurecrypto);
        Button button = (Button) findViewById(R.id.crypto_submit);
        this.submit = button;
        button.setOnClickListener(new View.OnClickListener() { // from class: id.blackbear.vulnapk.InsecureCryptoActivity.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) throws NoSuchAlgorithmException {
                InsecureCryptoActivity insecureCryptoActivity = InsecureCryptoActivity.this;
                insecureCryptoActivity.secret = (EditText) insecureCryptoActivity.findViewById(R.id.crypto_secret_input);
                InsecureCryptoActivity insecureCryptoActivity2 = InsecureCryptoActivity.this;
                insecureCryptoActivity2.result = (TextView) insecureCryptoActivity2.findViewById(R.id.crypto_result);
                String encrypted = null;
                String hashed = null;
                try {
                    encrypted = CryptoUtil.encrypt(InsecureCryptoActivity.this.secret.getText().toString());
                    MessageDigest messagedigest = MessageDigest.getInstance("MD5");
                    String input = InsecureCryptoActivity.this.secret.getText().toString();
                    byte[] hashBytes = messagedigest.digest(input.getBytes());
                    StringBuilder stringbuilder = new StringBuilder();
                    for (byte b : hashBytes) {
                        stringbuilder.append(String.format("%02x", Byte.valueOf(b)));
                    }
                    hashed = stringbuilder.toString();
                    Toast.makeText(InsecureCryptoActivity.this.getApplicationContext(), "Encrypted Successfully!", 0).show();
                } catch (Exception e) {
                    Toast.makeText(InsecureCryptoActivity.this.getApplicationContext(), "An Error Has Occurred", 0).show();
                }
                String final_result = "This is your encrypted secret!\n" + encrypted + "And your hashed secret is: " + hashed;
                InsecureCryptoActivity.this.result.setText(final_result);
            }
        });
    }
}
