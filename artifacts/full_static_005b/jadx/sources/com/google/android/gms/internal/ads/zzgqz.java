package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzgqz extends RuntimeException {
    public zzgqz(String str) {
        super(str);
    }

    public static Object zza(zzgqy zzgqyVar) {
        try {
            return zzgqyVar.zza();
        } catch (Exception e) {
            throw new zzgqz(e);
        }
    }

    public zzgqz(String str, Throwable th) {
        super(str, th);
    }

    public zzgqz(Throwable th) {
        super(th);
    }
}
