package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzgno extends zzgnp {
    public zzgno(byte[] bArr) throws GeneralSecurityException {
        super(bArr);
    }

    @Override // com.google.android.gms.internal.ads.zzgnp
    final zzgnn zza(byte[] bArr, int i) throws InvalidKeyException {
        return new zzgnm(bArr, i);
    }
}
