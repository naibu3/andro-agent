package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public abstract class zzhkh {
    public static zzhkh zzb(Class cls) {
        return System.getProperty("java.vm.name").equalsIgnoreCase("Dalvik") ? new zzhkc(cls.getSimpleName()) : new zzhke(cls.getSimpleName());
    }

    public abstract void zza(String str);
}
