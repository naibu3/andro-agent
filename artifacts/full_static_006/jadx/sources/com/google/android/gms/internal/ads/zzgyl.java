package com.google.android.gms.internal.ads;

import com.google.android.gms.security.ProviderInstaller;
import java.security.GeneralSecurityException;
import java.security.Provider;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzgyl implements zzgym {
    private final zzgyv zza;

    /* synthetic */ zzgyl(zzgyv zzgyvVar, zzgyk zzgykVar) {
        this.zza = zzgyvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgym
    public final Object zza(String str) throws GeneralSecurityException {
        Iterator it = zzgyn.zzb(ProviderInstaller.PROVIDER_NAME, "AndroidOpenSSL", "Conscrypt").iterator();
        Exception exc = null;
        while (it.hasNext()) {
            try {
                return this.zza.zza(str, (Provider) it.next());
            } catch (Exception e) {
                if (exc == null) {
                    exc = e;
                }
            }
        }
        throw new GeneralSecurityException("No good Provider found.", exc);
    }
}
