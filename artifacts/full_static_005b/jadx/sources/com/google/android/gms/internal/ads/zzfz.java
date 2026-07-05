package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzfz implements zzfb {
    private static final List zza = new ArrayList(50);
    private final Handler zzb;

    public zzfz(Handler handler) {
        this.zzb = handler;
    }

    static /* bridge */ /* synthetic */ void zzl(zzfy zzfyVar) {
        List list = zza;
        synchronized (list) {
            if (list.size() < 50) {
                list.add(zzfyVar);
            }
        }
    }

    private static zzfy zzm() {
        zzfy zzfyVar;
        List list = zza;
        synchronized (list) {
            zzfyVar = list.isEmpty() ? new zzfy(null) : (zzfy) list.remove(list.size() - 1);
        }
        return zzfyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfb
    public final Looper zza() {
        return this.zzb.getLooper();
    }

    @Override // com.google.android.gms.internal.ads.zzfb
    public final zzfa zzb(int i) {
        Handler handler = this.zzb;
        zzfy zzfyVarZzm = zzm();
        zzfyVarZzm.zzb(handler.obtainMessage(i), this);
        return zzfyVarZzm;
    }

    @Override // com.google.android.gms.internal.ads.zzfb
    public final zzfa zzc(int i, Object obj) {
        Handler handler = this.zzb;
        zzfy zzfyVarZzm = zzm();
        zzfyVarZzm.zzb(handler.obtainMessage(i, obj), this);
        return zzfyVarZzm;
    }

    @Override // com.google.android.gms.internal.ads.zzfb
    public final zzfa zzd(int i, int i2, int i3) {
        Handler handler = this.zzb;
        zzfy zzfyVarZzm = zzm();
        zzfyVarZzm.zzb(handler.obtainMessage(1, i2, i3), this);
        return zzfyVarZzm;
    }

    @Override // com.google.android.gms.internal.ads.zzfb
    public final void zze(Object obj) {
        this.zzb.removeCallbacksAndMessages(null);
    }

    @Override // com.google.android.gms.internal.ads.zzfb
    public final void zzf(int i) {
        this.zzb.removeMessages(i);
    }

    @Override // com.google.android.gms.internal.ads.zzfb
    public final boolean zzg(int i) {
        return this.zzb.hasMessages(0);
    }

    @Override // com.google.android.gms.internal.ads.zzfb
    public final boolean zzh(Runnable runnable) {
        return this.zzb.post(runnable);
    }

    @Override // com.google.android.gms.internal.ads.zzfb
    public final boolean zzi(int i) {
        return this.zzb.sendEmptyMessage(i);
    }

    @Override // com.google.android.gms.internal.ads.zzfb
    public final boolean zzj(int i, long j) {
        return this.zzb.sendEmptyMessageAtTime(2, j);
    }

    @Override // com.google.android.gms.internal.ads.zzfb
    public final boolean zzk(zzfa zzfaVar) {
        return ((zzfy) zzfaVar).zzc(this.zzb);
    }
}
