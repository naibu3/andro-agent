package com.google.android.gms.internal.ads;

import android.util.Base64;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzfid {
    public zzfid() {
        try {
            zzgig.zza();
        } catch (GeneralSecurityException e) {
            com.google.android.gms.ads.internal.util.zze.zza("Failed to Configure Aead. ".concat(e.toString()));
            com.google.android.gms.ads.internal.zzu.zzo().zzw(e, "CryptoUtils.registerAead");
        }
    }

    public static final String zza() {
        zzgzz zzgzzVarZzt = zzhac.zzt();
        try {
            zzghb.zzb(zzght.zzb(zzghl.zza(zzgph.zzb().zza("AES128_GCM"))), zzgha.zzb(zzgzzVarZzt));
        } catch (IOException | GeneralSecurityException e) {
            com.google.android.gms.ads.internal.util.zze.zza("Failed to generate key".concat(e.toString()));
            com.google.android.gms.ads.internal.zzu.zzo().zzw(e, "CryptoUtils.generateKey");
        }
        String strEncodeToString = Base64.encodeToString(zzgzzVarZzt.zzb().zzB(), 11);
        zzgzzVarZzt.zzc();
        return strEncodeToString;
    }

    @Nullable
    public static final String zzb(byte[] bArr, byte[] bArr2, String str, zzdux zzduxVar) {
        zzght zzghtVarZzc = zzc(str);
        if (zzghtVarZzc == null) {
            return null;
        }
        try {
            byte[] bArrZza = ((zzggy) zzghtVarZzc.zzd(zzgqp.zza(), zzggy.class)).zza(bArr, bArr2);
            zzduxVar.zzb().put("ds", "1");
            return new String(bArrZza, "UTF-8");
        } catch (UnsupportedEncodingException | UnsupportedOperationException | GeneralSecurityException e) {
            com.google.android.gms.ads.internal.util.zze.zza("Failed to decrypt ".concat(e.toString()));
            com.google.android.gms.ads.internal.zzu.zzo().zzw(e, "CryptoUtils.decrypt");
            zzduxVar.zzb().put("dsf", e.toString());
            return null;
        }
    }

    @Nullable
    private static final zzght zzc(String str) {
        try {
            return zzghb.zza(zzggz.zzb(Base64.decode(str, 11)));
        } catch (IOException | GeneralSecurityException e) {
            com.google.android.gms.ads.internal.util.zze.zza("Failed to get keysethandle".concat(e.toString()));
            com.google.android.gms.ads.internal.zzu.zzo().zzw(e, "CryptoUtils.getHandle");
            return null;
        }
    }
}
