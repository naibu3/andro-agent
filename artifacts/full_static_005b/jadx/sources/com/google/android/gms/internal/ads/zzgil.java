package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzgil implements zzggy {
    private final zzgqk zza;
    private final zzgtl zzb;
    private final zzgtl zzc;

    /* synthetic */ zzgil(zzgqk zzgqkVar, zzgik zzgikVar) {
        zzgtl zzgtlVarZza;
        this.zza = zzgqkVar;
        if (zzgqkVar.zzg()) {
            zzgtm zzgtmVarZzb = zzgpg.zza().zzb();
            zzgtr zzgtrVarZza = zzgoy.zza(zzgqkVar);
            this.zzb = zzgtmVarZzb.zza(zzgtrVarZza, "aead", "encrypt");
            zzgtlVarZza = zzgtmVarZzb.zza(zzgtrVarZza, "aead", "decrypt");
        } else {
            zzgtlVarZza = zzgoy.zza;
            this.zzb = zzgtlVarZza;
        }
        this.zzc = zzgtlVarZza;
    }

    @Override // com.google.android.gms.internal.ads.zzggy
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length > 5) {
            for (zzgqi zzgqiVar : this.zza.zzf(Arrays.copyOf(bArr, 5))) {
                try {
                    byte[] bArrZza = ((zzggy) zzgqiVar.zze()).zza(bArr, bArr2);
                    zzgqiVar.zza();
                    int length = bArr.length;
                    return bArrZza;
                } catch (GeneralSecurityException unused) {
                }
            }
        }
        for (zzgqi zzgqiVar2 : this.zza.zzf(zzghd.zza)) {
            try {
                byte[] bArrZza2 = ((zzggy) zzgqiVar2.zze()).zza(bArr, bArr2);
                zzgqiVar2.zza();
                int length2 = bArr.length;
                return bArrZza2;
            } catch (GeneralSecurityException unused2) {
            }
        }
        throw new GeneralSecurityException("decryption failed");
    }
}
