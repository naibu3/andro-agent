package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzgoa extends ThreadLocal {
    zzgoa() {
    }

    protected static final Cipher zza() {
        try {
            Cipher cipher = (Cipher) zzgyn.zza.zza("AES/GCM-SIV/NoPadding");
            if (zzgob.zze(cipher)) {
                return cipher;
            }
            return null;
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }

    @Override // java.lang.ThreadLocal
    protected final /* bridge */ /* synthetic */ Object initialValue() {
        return zza();
    }
}
