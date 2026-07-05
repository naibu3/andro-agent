package i;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.view.LayoutInflater;
import org.conscrypt.R;

/* renamed from: i.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0122d extends ContextWrapper {

    /* renamed from: f, reason: collision with root package name */
    public static Configuration f1511f;

    /* renamed from: a, reason: collision with root package name */
    public int f1512a;

    /* renamed from: b, reason: collision with root package name */
    public Resources.Theme f1513b;

    /* renamed from: c, reason: collision with root package name */
    public LayoutInflater f1514c;

    /* renamed from: d, reason: collision with root package name */
    public Configuration f1515d;

    /* renamed from: e, reason: collision with root package name */
    public Resources f1516e;

    public C0122d(Context context, int i2) {
        super(context);
        this.f1512a = i2;
    }

    public final void a(Configuration configuration) {
        if (this.f1516e != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        }
        if (this.f1515d != null) {
            throw new IllegalStateException("Override configuration has already been set");
        }
        this.f1515d = new Configuration(configuration);
    }

    @Override // android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public final void b() {
        if (this.f1513b == null) {
            this.f1513b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f1513b.setTo(theme);
            }
        }
        this.f1513b.applyStyle(this.f1512a, true);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final AssetManager getAssets() {
        return getResources().getAssets();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    @Override // android.content.ContextWrapper, android.content.Context
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Resources getResources() {
        if (this.f1516e == null) {
            Configuration configuration = this.f1515d;
            if (configuration == null) {
                this.f1516e = super.getResources();
            } else {
                if (Build.VERSION.SDK_INT >= 26) {
                    if (f1511f == null) {
                        Configuration configuration2 = new Configuration();
                        configuration2.fontScale = 0.0f;
                        f1511f = configuration2;
                    }
                    if (configuration.equals(f1511f)) {
                    }
                }
                this.f1516e = createConfigurationContext(this.f1515d).getResources();
            }
        }
        return this.f1516e;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f1514c == null) {
            this.f1514c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f1514c;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources.Theme getTheme() {
        Resources.Theme theme = this.f1513b;
        if (theme != null) {
            return theme;
        }
        if (this.f1512a == 0) {
            this.f1512a = R.style.Theme_AppCompat_Light;
        }
        b();
        return this.f1513b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i2) {
        if (this.f1512a != i2) {
            this.f1512a = i2;
            b();
        }
    }
}
