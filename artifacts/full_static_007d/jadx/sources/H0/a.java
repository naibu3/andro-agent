package H0;

/* loaded from: classes.dex */
public final class a extends Thread {
    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        d dVarB;
        while (true) {
            try {
                synchronized (d.class) {
                    d dVar = d.f407j;
                    dVarB = C0.f.b();
                    if (dVarB == d.f407j) {
                        d.f407j = null;
                        return;
                    }
                }
                if (dVarB != null) {
                    dVarB.j();
                }
            } catch (InterruptedException unused) {
            }
        }
    }
}
