package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.2.0 */
/* loaded from: classes2.dex */
public abstract class zzfxr implements zzfyh {
    protected zzfxr() {
    }

    public static zzfxr zzc(char c) {
        return new zzfxo(c);
    }

    @Override // com.google.android.gms.internal.ads.zzfyh
    @Deprecated
    public final /* synthetic */ boolean zza(Object obj) {
        return zzb(((Character) obj).charValue());
    }

    public abstract boolean zzb(char c);
}
