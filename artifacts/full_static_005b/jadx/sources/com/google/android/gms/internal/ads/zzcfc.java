package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzcfc extends zzasn {
    static final zzcfc zzb = new zzcfc();

    zzcfc() {
    }

    @Override // com.google.android.gms.internal.ads.zzasn
    public final zzasr zza(String str, byte[] bArr, String str2) {
        return "moov".equals(str) ? new zzast() : "mvhd".equals(str) ? new zzasu() : new zzasv(str);
    }
}
