package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzfoe {
    private final Context zza;
    private final Executor zzb;
    private final com.google.android.gms.ads.internal.util.client.zzr zzc;
    private final zzfmq zzd;

    zzfoe(Context context, Executor executor, com.google.android.gms.ads.internal.util.client.zzr zzrVar, zzfmq zzfmqVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzrVar;
        this.zzd = zzfmqVar;
    }

    final /* synthetic */ void zza(String str) {
        this.zzc.zza(str);
    }

    final /* synthetic */ void zzb(String str, zzfmn zzfmnVar) {
        zzfmc zzfmcVarZza = zzfmb.zza(this.zza, zzfmu.CUI_NAME_PING);
        zzfmcVarZza.zzj();
        zzfmcVarZza.zzh(this.zzc.zza(str));
        if (zzfmnVar == null) {
            this.zzd.zzb(zzfmcVarZza.zzn());
        } else {
            zzfmnVar.zza(zzfmcVarZza);
            zzfmnVar.zzi();
        }
    }

    public final void zzc(final String str, final zzfmn zzfmnVar) {
        if (zzfmq.zza() && ((Boolean) zzbgd.zzd.zze()).booleanValue()) {
            this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfod
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzb(str, zzfmnVar);
                }
            });
        } else {
            this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfoc
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zza(str);
                }
            });
        }
    }

    public final void zzd(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzc((String) it.next(), null);
        }
    }
}
