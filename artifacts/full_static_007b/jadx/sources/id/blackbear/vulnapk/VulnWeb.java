package id.blackbear.vulnapk;

import android.os.Bundle;
import android.util.Log;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.appcompat.app.AppCompatActivity;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/* loaded from: classes3.dex */
public class VulnWeb extends AppCompatActivity {
    private WebView webView;

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) throws IOException {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);
        WebView webView = (WebView) findViewById(R.id.web_webview);
        this.webView = webView;
        webView.setWebViewClient(new WebViewClient());
        this.webView.getSettings().setJavaScriptEnabled(true);
        StringBuilder content = new StringBuilder();
        try {
            FileInputStream fis = new FileInputStream("/data/data/id.blackbear.vulnapk/files/ip_settings");
            BufferedReader br = new BufferedReader(new InputStreamReader(fis));
            while (true) {
                String line = br.readLine();
                if (line == null) {
                    break;
                } else {
                    content.append(line).append("\n");
                }
            }
            br.close();
            fis.close();
        } catch (IOException e) {
            Log.e("ip-addr", "Error reading file: " + e.getMessage());
        }
        this.webView.loadUrl(String.valueOf(content));
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (this.webView.canGoBack()) {
            this.webView.goBack();
        } else {
            super.onBackPressed();
        }
    }
}
