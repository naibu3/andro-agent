package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zziv {
    private final AudioManager zza;
    private final zzit zzb;
    private zziu zzc;
    private int zzd;
    private float zze = 1.0f;

    public zziv(Context context, Handler handler, zziu zziuVar) {
        AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
        audioManager.getClass();
        this.zza = audioManager;
        this.zzc = zziuVar;
        this.zzb = new zzit(this, handler);
        this.zzd = 0;
    }

    private final void zze() {
        if (this.zzd == 0) {
            return;
        }
        if (zzgd.zza < 26) {
            this.zza.abandonAudioFocus(this.zzb);
        }
        zzg(0);
    }

    private final void zzf(int i) {
        zziu zziuVar = this.zzc;
        if (zziuVar != null) {
            zzks zzksVar = (zzks) zziuVar;
            boolean zZzv = zzksVar.zza.zzv();
            zzksVar.zza.zzak(zZzv, i, zzkw.zzX(zZzv, i));
        }
    }

    private final void zzg(int i) {
        if (this.zzd == i) {
            return;
        }
        this.zzd = i;
        float f = i == 3 ? 0.2f : 1.0f;
        if (this.zze != f) {
            this.zze = f;
            zziu zziuVar = this.zzc;
            if (zziuVar != null) {
                ((zzks) zziuVar).zza.zzah();
            }
        }
    }

    public final float zza() {
        return this.zze;
    }

    public final int zzb(boolean z, int i) {
        zze();
        return z ? 1 : -1;
    }

    public final void zzd() {
        this.zzc = null;
        zze();
    }

    static /* bridge */ /* synthetic */ void zzc(zziv zzivVar, int i) {
        if (i == -3 || i == -2) {
            if (i != -2) {
                zzivVar.zzg(3);
                return;
            } else {
                zzivVar.zzf(0);
                zzivVar.zzg(2);
                return;
            }
        }
        if (i == -1) {
            zzivVar.zzf(-1);
            zzivVar.zze();
        } else if (i == 1) {
            zzivVar.zzg(1);
            zzivVar.zzf(1);
        } else {
            zzfk.zzf("AudioFocusManager", "Unknown focus change type: " + i);
        }
    }
}
