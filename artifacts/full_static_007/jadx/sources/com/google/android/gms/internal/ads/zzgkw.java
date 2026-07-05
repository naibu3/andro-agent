package com.google.android.gms.internal.ads;

import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzgkw implements zzggy {
    public static final /* synthetic */ int zza = 0;
    private static final byte[] zzb = new byte[0];
    private static final Set zzc;
    private final String zzd;
    private final zzghx zze;
    private final zzggy zzf;

    static {
        HashSet hashSet = new HashSet();
        hashSet.add("type.googleapis.com/google.crypto.tink.AesGcmKey");
        hashSet.add("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        hashSet.add("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        hashSet.add("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        hashSet.add("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        hashSet.add("type.googleapis.com/google.crypto.tink.AesEaxKey");
        zzc = Collections.unmodifiableSet(hashSet);
    }

    @Deprecated
    zzgkw(zzgwm zzgwmVar, zzggy zzggyVar) throws GeneralSecurityException {
        if (!zzc.contains(zzgwmVar.zzi())) {
            throw new IllegalArgumentException("Unsupported DEK key type: " + zzgwmVar.zzi() + ". Only Tink AEAD key types are supported.");
        }
        this.zzd = zzgwmVar.zzi();
        zzgwl zzgwlVarZzc = zzgwm.zzc(zzgwmVar);
        zzgwlVarZzc.zza(zzgxn.RAW);
        this.zze = zzgie.zza(((zzgwm) zzgwlVarZzc.zzbr()).zzaV());
        this.zzf = zzggyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzggy
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        try {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
            int i = byteBufferWrap.getInt();
            if (i <= 0 || i > bArr.length - 4) {
                throw new GeneralSecurityException("invalid ciphertext");
            }
            byte[] bArr3 = new byte[i];
            byteBufferWrap.get(bArr3, 0, i);
            byte[] bArr4 = new byte[byteBufferWrap.remaining()];
            byteBufferWrap.get(bArr4, 0, byteBufferWrap.remaining());
            byte[] bArrZza = this.zzf.zza(bArr3, zzb);
            String str = this.zzd;
            zzhac zzhacVar = zzhac.zzb;
            return ((zzggy) zzgpi.zza().zzc(zzgpl.zzc().zza(zzgql.zza(str, zzhac.zzv(bArrZza, 0, bArrZza.length), zzgwg.SYMMETRIC, zzgxn.RAW, null), zzghh.zza()), zzggy.class)).zza(bArr4, bArr2);
        } catch (IndexOutOfBoundsException | NegativeArraySizeException | BufferUnderflowException e) {
            throw new GeneralSecurityException("invalid ciphertext", e);
        }
    }
}
