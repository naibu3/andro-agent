package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzazk extends zzazs {
    private final StackTraceElement[] zzi;

    public zzazk(zzaye zzayeVar, String str, String str2, zzatp zzatpVar, int i, int i2, StackTraceElement[] stackTraceElementArr) {
        super(zzayeVar, "9douHjmTTjq3N4YYUdzzHaKyxIqsB5K92p8t26vKQB1HahpVak+32YHan4LmgLPE", "q6oLc2ULDKRAR1VDdX5lO9/kb0NHjx7PMACMr/7cZL8=", zzatpVar, i, 45);
        this.zzi = stackTraceElementArr;
    }

    @Override // com.google.android.gms.internal.ads.zzazs
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        StackTraceElement[] stackTraceElementArr = this.zzi;
        if (stackTraceElementArr != null) {
            zzaxv zzaxvVar = new zzaxv((String) this.zzf.invoke(null, stackTraceElementArr));
            synchronized (this.zze) {
                this.zze.zzL(zzaxvVar.zza.longValue());
                if (zzaxvVar.zzb.booleanValue()) {
                    this.zze.zzA(zzaxvVar.zzc.booleanValue() ? zzavc.ENUM_FALSE : zzavc.ENUM_TRUE);
                } else {
                    this.zze.zzA(zzavc.ENUM_FAILURE);
                }
            }
        }
    }
}
