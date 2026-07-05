package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzazj extends zzazs {
    private final boolean zzi;

    public zzazj(zzaye zzayeVar, String str, String str2, zzatp zzatpVar, int i, int i2) {
        super(zzayeVar, "vvYcBqgI4aoC3GZZ7n1bdLp71k52s6EJLh0/nA6ME39LmvOZf3TBZ+H4xg1YfQXg", "6jGSPrUM0+2YrTO2vsTOKq3+XL/IfUFs5oxZaSEvsQg=", zzatpVar, i, 61);
        this.zzi = zzayeVar.zzs();
    }

    @Override // com.google.android.gms.internal.ads.zzazs
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        long jLongValue = ((Long) this.zzf.invoke(null, this.zzb.zzb(), Boolean.valueOf(this.zzi))).longValue();
        synchronized (this.zze) {
            this.zze.zzK(jLongValue);
        }
    }
}
