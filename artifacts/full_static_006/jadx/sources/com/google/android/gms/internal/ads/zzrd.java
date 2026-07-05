package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioFormat;
import android.media.AudioManager;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzrd {
    private final Context zza;
    private Boolean zzb;

    public zzrd() {
        this.zza = null;
    }

    public zzrd(Context context) {
        this.zza = context;
    }

    public final zzqa zza(zzan zzanVar, zzk zzkVar) {
        boolean zBooleanValue;
        AudioManager audioManager;
        zzanVar.getClass();
        zzkVar.getClass();
        if (zzgd.zza < 29 || zzanVar.zzB == -1) {
            return zzqa.zza;
        }
        Context context = this.zza;
        Boolean bool = this.zzb;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            boolean z = false;
            if (context == null || (audioManager = (AudioManager) context.getSystemService("audio")) == null) {
                this.zzb = false;
            } else {
                String parameters = audioManager.getParameters("offloadVariableRateSupported");
                if (parameters != null && parameters.equals("offloadVariableRateSupported=1")) {
                    z = true;
                }
                this.zzb = Boolean.valueOf(z);
            }
            zBooleanValue = this.zzb.booleanValue();
        }
        String str = zzanVar.zzn;
        str.getClass();
        int iZza = zzcg.zza(str, zzanVar.zzk);
        if (iZza == 0 || zzgd.zza < zzgd.zzg(iZza)) {
            return zzqa.zza;
        }
        int iZzh = zzgd.zzh(zzanVar.zzA);
        if (iZzh == 0) {
            return zzqa.zza;
        }
        try {
            AudioFormat audioFormatZzw = zzgd.zzw(zzanVar.zzB, iZzh, iZza);
            return zzgd.zza >= 31 ? zzrc.zza(audioFormatZzw, zzkVar.zza().zza, zBooleanValue) : zzrb.zza(audioFormatZzw, zzkVar.zza().zza, zBooleanValue);
        } catch (IllegalArgumentException unused) {
            return zzqa.zza;
        }
    }
}
