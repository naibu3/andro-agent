package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzayv extends zzazs {
    private final long zzi;

    public zzayv(zzaye zzayeVar, String str, String str2, zzatp zzatpVar, long j, int i, int i2) {
        super(zzayeVar, "Rx5KxmHu63h8QT7T4cYR2mu7F4LQnYkocG/Azb9HP8ZHyjUHnRxxCuB99BIp3kbl", "3fysZeGzwX+hqd2f4+qtlSho+oF+DeFl9kzKrTFOSWo=", zzatpVar, i, 25);
        this.zzi = j;
    }

    @Override // com.google.android.gms.internal.ads.zzazs
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        long jLongValue = ((Long) this.zzf.invoke(null, new Object[0])).longValue();
        synchronized (this.zze) {
            this.zze.zzv(jLongValue);
            long j = this.zzi;
            if (j != 0) {
                this.zze.zzZ(jLongValue - j);
                this.zze.zzab(this.zzi);
            }
        }
    }
}
