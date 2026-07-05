package com.google.android.gms.internal.ads;

import java.io.File;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzawu implements zzftd {
    final /* synthetic */ zzfqx zza;

    zzawu(zzaww zzawwVar, zzfqx zzfqxVar) {
        this.zza = zzfqxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzftd
    public final boolean zza(File file) {
        try {
            return this.zza.zza(file);
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }
}
