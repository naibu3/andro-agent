package x;

import C0.m;
import H.InterfaceC0017k;
import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.lifecycle.AbstractC0068o;
import androidx.lifecycle.B;
import androidx.lifecycle.D;
import androidx.lifecycle.EnumC0067n;
import androidx.lifecycle.InterfaceC0072t;
import androidx.lifecycle.v;
import j0.AbstractC0150d;

/* loaded from: classes.dex */
public abstract class f extends Activity implements InterfaceC0072t, InterfaceC0017k {
    private final n.k extraDataMap = new n.k(0);
    private final v lifecycleRegistry = new v(this);

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        AbstractC0150d.e(keyEvent, "event");
        View decorView = getWindow().getDecorView();
        AbstractC0150d.d(decorView, "window.decorView");
        if (m.g(decorView, keyEvent)) {
            return true;
        }
        return m.h(this, decorView, this, keyEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        AbstractC0150d.e(keyEvent, "event");
        View decorView = getWindow().getDecorView();
        AbstractC0150d.d(decorView, "window.decorView");
        if (m.g(decorView, keyEvent)) {
            return true;
        }
        return super.dispatchKeyShortcutEvent(keyEvent);
    }

    public <T extends e> T getExtraData(Class<T> cls) {
        AbstractC0150d.e(cls, "extraDataClass");
        if (this.extraDataMap.get(cls) == null) {
            return null;
        }
        throw new ClassCastException();
    }

    public AbstractC0068o getLifecycle() {
        return this.lifecycleRegistry;
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i2 = D.f1150b;
        B.b(this);
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        AbstractC0150d.e(bundle, "outState");
        v vVar = this.lifecycleRegistry;
        EnumC0067n enumC0067n = EnumC0067n.f1198c;
        vVar.d("setCurrentState");
        vVar.f(enumC0067n);
        super.onSaveInstanceState(bundle);
    }

    public void putExtraData(e eVar) {
        AbstractC0150d.e(eVar, "extraData");
        throw null;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean shouldDumpInternalState(String[] strArr) {
        boolean z2 = false;
        if (strArr != null && strArr.length != 0) {
            String str = strArr[0];
            switch (str.hashCode()) {
                case -645125871:
                    if (str.equals("--translation") && Build.VERSION.SDK_INT >= 31) {
                        z2 = true;
                        break;
                    }
                    break;
                case 100470631:
                    if (str.equals("--dump-dumpable")) {
                        if (Build.VERSION.SDK_INT >= 33) {
                        }
                    }
                    break;
                case 472614934:
                    if (str.equals("--list-dumpables")) {
                    }
                    break;
                case 1159329357:
                    if (str.equals("--contentcapture") && Build.VERSION.SDK_INT >= 29) {
                    }
                    break;
                case 1455016274:
                    if (str.equals("--autofill") && Build.VERSION.SDK_INT >= 26) {
                    }
                    break;
            }
        }
        return !z2;
    }

    @Override // H.InterfaceC0017k
    public boolean superDispatchKeyEvent(KeyEvent keyEvent) {
        AbstractC0150d.e(keyEvent, "event");
        return super.dispatchKeyEvent(keyEvent);
    }
}
