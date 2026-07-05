package Z;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import org.conscrypt.BuildConfig;

/* loaded from: classes.dex */
public final class i {
    public static final u0.o h;

    /* renamed from: i, reason: collision with root package name */
    public static i f702i;

    /* renamed from: a, reason: collision with root package name */
    public final Context f703a;

    /* renamed from: b, reason: collision with root package name */
    public final u0.q f704b;

    /* renamed from: c, reason: collision with root package name */
    public E.c f705c;

    /* renamed from: f, reason: collision with root package name */
    public String f708f;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f706d = new AtomicBoolean(false);

    /* renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f707e = new AtomicBoolean(false);

    /* renamed from: g, reason: collision with root package name */
    public final Handler f709g = new Handler(Looper.getMainLooper());

    static {
        Pattern pattern = u0.o.f2491c;
        h = C0.m.n("application/json; charset=utf-8");
    }

    public i(Context context) throws NoSuchAlgorithmException, KeyManagementException {
        u0.q qVar;
        this.f703a = context;
        try {
            TrustManager[] trustManagerArr = {new f(0)};
            SSLContext sSLContext = SSLContext.getInstance("SSL");
            sSLContext.init(null, trustManagerArr, new SecureRandom());
            SSLSocketFactory socketFactory = sSLContext.getSocketFactory();
            u0.p pVar = new u0.p();
            pVar.a(socketFactory, (X509TrustManager) trustManagerArr[0]);
            pVar.f2511r = new c(0);
            qVar = new u0.q(pVar);
        } catch (Exception e2) {
            Log.e("AccountManager", "Error creating unsafe OkHttpClient", e2);
            qVar = new u0.q();
        }
        this.f704b = qVar;
        e();
        SharedPreferences sharedPreferences = this.f703a.getSharedPreferences("CloudNotesPrefs", 0);
        String string = sharedPreferences.getString("userEmail", null);
        String string2 = sharedPreferences.getString("userToken", null);
        if (string == null || string2 == null) {
            return;
        }
        this.f705c = new E.c(string, string2, 5);
        f(null);
    }

    public static synchronized i a(Context context) {
        try {
            if (f702i == null) {
                f702i = new i(context.getApplicationContext());
            }
        } catch (Throwable th) {
            throw th;
        }
        return f702i;
    }

    public final boolean b() {
        if (this.f705c == null) {
            Log.d("AccountManager", "isLoggedIn: currentUser is null");
            return false;
        }
        if (this.f707e.get()) {
            return true;
        }
        Log.d("AccountManager", "isLoggedIn: Token not verified or invalid");
        return false;
    }

    public final void c() {
        this.f705c = null;
        this.f707e.set(false);
        d(null);
        Log.d("AccountManager", "User logged out");
    }

    public final void d(E.c cVar) {
        SharedPreferences.Editor editorEdit = this.f703a.getSharedPreferences("CloudNotesPrefs", 0).edit();
        if (cVar != null) {
            editorEdit.putString("userEmail", (String) cVar.f271b);
            editorEdit.putString("userToken", (String) cVar.f272c);
        } else {
            editorEdit.remove("userEmail");
            editorEdit.remove("userToken");
        }
        editorEdit.apply();
    }

    public final void e() {
        SharedPreferences sharedPreferences = this.f703a.getSharedPreferences("ServerConfig", 0);
        String string = sharedPreferences.getString("SERVER_IP", BuildConfig.FLAVOR);
        String string2 = sharedPreferences.getString("SERVER_PORT", BuildConfig.FLAVOR);
        if (string.isEmpty()) {
            this.f708f = BuildConfig.FLAVOR;
        } else {
            this.f708f = "http://".concat(string);
            if (!string2.isEmpty()) {
                this.f708f += ":" + string2;
            }
            this.f708f += "/api";
        }
        Log.d("AccountManager", "Server URL updated to: " + this.f708f);
    }

    public final void f(h hVar) {
        String str = this.f708f;
        boolean z2 = (str == null || str.isEmpty()) ? false : true;
        AtomicBoolean atomicBoolean = this.f707e;
        Handler handler = this.f709g;
        if (!z2) {
            atomicBoolean.set(false);
            if (hVar != null) {
                handler.post(new a(hVar, 0));
                return;
            }
            return;
        }
        if (this.f705c == null) {
            atomicBoolean.set(false);
            if (hVar != null) {
                handler.post(new a(hVar, 1));
                return;
            }
            return;
        }
        if (this.f706d.getAndSet(true)) {
            Log.d("AccountManager", "verifyToken: Already verifying, skipping");
            if (hVar != null) {
                handler.post(new b(this, hVar, 0));
                return;
            }
            return;
        }
        Log.d("AccountManager", "Starting token verification");
        u0.s sVar = new u0.s();
        sVar.d(this.f708f + "/auth/verify");
        sVar.b("Authorization", "Bearer ".concat((String) this.f705c.f272c));
        sVar.c("GET", null);
        B0.h hVarA = sVar.a();
        u0.q qVar = this.f704b;
        qVar.getClass();
        new y0.h(qVar, hVarA).e(new E.c(this, hVar, 3, false));
    }
}
