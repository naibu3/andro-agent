package androidx.emoji2.text;

import A.f;
import M.j;
import M.k;
import M.t;
import V.a;
import V.b;
import android.content.Context;
import androidx.lifecycle.AbstractC0068o;
import androidx.lifecycle.InterfaceC0072t;
import androidx.lifecycle.ProcessLifecycleInitializer;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes.dex */
public class EmojiCompatInitializer implements b {
    @Override // V.b
    public final List a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    @Override // V.b
    public final Object b(Context context) {
        Object objB;
        t tVar = new t(new f(context));
        tVar.f566b = 1;
        if (j.f533k == null) {
            synchronized (j.f532j) {
                try {
                    if (j.f533k == null) {
                        j.f533k = new j(tVar);
                    }
                } finally {
                }
            }
        }
        a aVarC = a.c(context);
        aVarC.getClass();
        synchronized (a.f675e) {
            try {
                objB = aVarC.f676a.get(ProcessLifecycleInitializer.class);
                if (objB == null) {
                    objB = aVarC.b(ProcessLifecycleInitializer.class, new HashSet());
                }
            } finally {
            }
        }
        AbstractC0068o lifecycle = ((InterfaceC0072t) objB).getLifecycle();
        lifecycle.a(new k(this, lifecycle));
        return Boolean.TRUE;
    }
}
