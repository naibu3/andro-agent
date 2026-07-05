package T;

import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import g.AbstractC0114l;
import g.AbstractC0115m;
import g.AbstractC0118p;
import g.C;
import java.lang.ref.WeakReference;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import n.C0227b;

/* loaded from: classes.dex */
public final /* synthetic */ class h implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f649a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f650b;

    public /* synthetic */ h(Context context, int i2) {
        this.f649a = i2;
        this.f650b = context;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006f  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() throws Throwable {
        D.e eVar;
        Object systemService;
        Context context;
        switch (this.f649a) {
            case 0:
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new h(this.f650b, 1));
                break;
            case 1:
                f.t(this.f650b, new d(), f.f638a, false);
                break;
            default:
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= 33) {
                    Context context2 = this.f650b;
                    ComponentName componentName = new ComponentName(context2, "androidx.appcompat.app.AppLocalesMetadataHolderService");
                    if (context2.getPackageManager().getComponentEnabledSetting(componentName) != 1) {
                        if (i2 >= 33) {
                            n.g gVar = AbstractC0118p.f1464g;
                            gVar.getClass();
                            C0227b c0227b = new C0227b(gVar);
                            while (true) {
                                if (c0227b.hasNext()) {
                                    AbstractC0118p abstractC0118p = (AbstractC0118p) ((WeakReference) c0227b.next()).get();
                                    if (abstractC0118p != null && (context = ((C) abstractC0118p).f1338k) != null) {
                                        systemService = context.getSystemService("locale");
                                    }
                                } else {
                                    systemService = null;
                                }
                            }
                            eVar = systemService != null ? new D.e(new D.f(AbstractC0115m.a(systemService))) : D.e.f239b;
                            if (eVar.f240a.f241a.isEmpty()) {
                                String strE = x.c.e(context2);
                                Object systemService2 = context2.getSystemService("locale");
                                if (systemService2 != null) {
                                    AbstractC0115m.b(systemService2, AbstractC0114l.a(strE));
                                }
                            }
                            context2.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
                        } else {
                            eVar = AbstractC0118p.f1460c;
                            if (eVar == null) {
                            }
                            if (eVar.f240a.f241a.isEmpty()) {
                            }
                            context2.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
                        }
                    }
                }
                AbstractC0118p.f1463f = true;
                break;
        }
    }
}
