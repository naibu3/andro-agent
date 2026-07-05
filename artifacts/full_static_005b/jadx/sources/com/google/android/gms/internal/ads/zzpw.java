package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.net.Uri;
import android.os.Handler;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzpw {
    private final Context zza;
    private final Handler zzb;
    private final zzps zzc;
    private final BroadcastReceiver zzd;
    private final zzpt zze;
    private zzpp zzf;
    private zzpx zzg;
    private zzk zzh;
    private boolean zzi;
    private final zzrh zzj;

    /* JADX WARN: Multi-variable type inference failed */
    zzpw(Context context, zzrh zzrhVar, zzk zzkVar, zzpx zzpxVar) {
        Context applicationContext = context.getApplicationContext();
        this.zza = applicationContext;
        this.zzj = zzrhVar;
        this.zzh = zzkVar;
        this.zzg = zzpxVar;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Handler handler = new Handler(zzgd.zzy(), null);
        this.zzb = handler;
        this.zzc = zzgd.zza >= 23 ? new zzps(this, objArr2 == true ? 1 : 0) : null;
        this.zzd = new zzpv(this, objArr == true ? 1 : 0);
        Uri uriZza = zzpp.zza();
        this.zze = uriZza != null ? new zzpt(this, handler, applicationContext.getContentResolver(), uriZza) : null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzj(zzpp zzppVar) {
        if (!this.zzi || zzppVar.equals(this.zzf)) {
            return;
        }
        this.zzf = zzppVar;
        this.zzj.zza.zzJ(zzppVar);
    }

    public final zzpp zzc() {
        zzps zzpsVar;
        if (this.zzi) {
            zzpp zzppVar = this.zzf;
            zzppVar.getClass();
            return zzppVar;
        }
        this.zzi = true;
        zzpt zzptVar = this.zze;
        if (zzptVar != null) {
            zzptVar.zza();
        }
        if (zzgd.zza >= 23 && (zzpsVar = this.zzc) != null) {
            zzpq.zza(this.zza, zzpsVar, this.zzb);
        }
        zzpp zzppVarZzd = zzpp.zzd(this.zza, this.zzd != null ? this.zza.registerReceiver(this.zzd, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"), null, this.zzb) : null, this.zzh, this.zzg);
        this.zzf = zzppVarZzd;
        return zzppVarZzd;
    }

    public final void zzg(zzk zzkVar) {
        this.zzh = zzkVar;
        zzj(zzpp.zzc(this.zza, zzkVar, this.zzg));
    }

    public final void zzh(AudioDeviceInfo audioDeviceInfo) {
        zzpx zzpxVar = this.zzg;
        if (zzgd.zzG(audioDeviceInfo, zzpxVar == null ? null : zzpxVar.zza)) {
            return;
        }
        zzpx zzpxVar2 = audioDeviceInfo != null ? new zzpx(audioDeviceInfo) : null;
        this.zzg = zzpxVar2;
        zzj(zzpp.zzc(this.zza, this.zzh, zzpxVar2));
    }

    public final void zzi() {
        zzps zzpsVar;
        if (this.zzi) {
            this.zzf = null;
            if (zzgd.zza >= 23 && (zzpsVar = this.zzc) != null) {
                zzpq.zzb(this.zza, zzpsVar);
            }
            BroadcastReceiver broadcastReceiver = this.zzd;
            if (broadcastReceiver != null) {
                this.zza.unregisterReceiver(broadcastReceiver);
            }
            zzpt zzptVar = this.zze;
            if (zzptVar != null) {
                zzptVar.zzb();
            }
            this.zzi = false;
        }
    }
}
