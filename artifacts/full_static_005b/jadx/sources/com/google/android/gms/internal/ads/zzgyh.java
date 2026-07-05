package com.google.android.gms.internal.ads;

import com.google.android.gms.security.ProviderInstaller;
import java.security.GeneralSecurityException;
import java.security.Provider;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzgyh implements zzgym {
    private final zzgyv zza;

    /* synthetic */ zzgyh(zzgyv zzgyvVar, zzgyg zzgygVar) {
        this.zza = zzgyvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgym
    public final Object zza(String str) throws GeneralSecurityException {
        Iterator it = zzgyn.zzb(ProviderInstaller.PROVIDER_NAME, "AndroidOpenSSL").iterator();
        while (it.hasNext()) {
            try {
                return this.zza.zza(str, (Provider) it.next());
            } catch (Exception unused) {
            }
        }
        return this.zza.zza(str, null);
    }
}
