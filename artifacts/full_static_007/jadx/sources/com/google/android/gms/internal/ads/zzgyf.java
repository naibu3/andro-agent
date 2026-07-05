package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.Arrays;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzgyf implements zzggy {
    private final zzgyx zza;
    private final zzghw zzb;
    private final int zzc;
    private final byte[] zzd;

    private zzgyf(zzgyx zzgyxVar, zzghw zzghwVar, int i, byte[] bArr) {
        this.zza = zzgyxVar;
        this.zzb = zzghwVar;
        this.zzc = i;
        this.zzd = bArr;
    }

    public static zzggy zzb(zzgiq zzgiqVar) throws GeneralSecurityException {
        zzgxy zzgxyVar = new zzgxy(zzgiqVar.zzd().zzd(zzghh.zza()), zzgiqVar.zzb().zzd());
        String strValueOf = String.valueOf(String.valueOf(zzgiqVar.zzb().zzg()));
        return new zzgyf(zzgxyVar, new zzgzb(new zzgza("HMAC".concat(strValueOf), new SecretKeySpec(zzgiqVar.zze().zzd(zzghh.zza()), "HMAC")), zzgiqVar.zzb().zze()), zzgiqVar.zzb().zze(), zzgiqVar.zzc().zzc());
    }

    @Override // com.google.android.gms.internal.ads.zzggy
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.zzd;
        int i = this.zzc;
        int length = bArr3.length;
        int length2 = bArr.length;
        if (length2 < i + length) {
            throw new GeneralSecurityException("Decryption failed (ciphertext too short).");
        }
        if (!zzgra.zzc(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, this.zzd.length, length2 - this.zzc);
        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, length2 - this.zzc, length2);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        if (MessageDigest.isEqual(((zzgzb) this.zzb).zzc(zzgyd.zzb(bArr2, bArrCopyOfRange, Arrays.copyOf(ByteBuffer.allocate(8).putLong(bArr2.length * 8).array(), 8))), bArrCopyOfRange2)) {
            return this.zza.zza(bArrCopyOfRange);
        }
        throw new GeneralSecurityException("invalid MAC");
    }
}
