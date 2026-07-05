package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzaba implements zzacm, zzaas {
    final /* synthetic */ zzabc zza;
    private final Context zzb;
    private final int zzc;
    private final ArrayList zzd;
    private zzds zze;
    private zzan zzf;
    private long zzg;
    private boolean zzh;
    private long zzi;
    private boolean zzj;
    private long zzk;
    private zzack zzl;
    private Executor zzm;

    public zzaba(zzabc zzabcVar, Context context) {
        this.zza = zzabcVar;
        this.zzb = context;
        this.zzc = true != zzgd.zzL(context) ? 5 : 1;
        this.zzd = new ArrayList();
        this.zzi = -9223372036854775807L;
        this.zzl = zzack.zzb;
        this.zzm = zzabc.zza;
    }

    private final void zzm() {
        if (this.zzf == null) {
            return;
        }
        new ArrayList().addAll(this.zzd);
        zzan zzanVar = this.zzf;
        zzanVar.getClass();
        zzds zzdsVar = null;
        zzeq.zzb(null);
        int i = zzanVar.zzt;
        zzao zzaoVar = new zzao(zzabc.zzu(zzanVar.zzz), zzanVar.zzs, i);
        zzaoVar.zza(zzanVar.zzw);
        zzaoVar.zzb();
        zzdsVar.zzd();
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzaas
    public final void zza(zzabc zzabcVar) {
        final zzack zzackVar = this.zzl;
        this.zzm.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzaaz
            @Override // java.lang.Runnable
            public final void run() {
                zzackVar.zza(this.zza);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzaas
    public final void zzb(zzabc zzabcVar) {
        final zzack zzackVar = this.zzl;
        this.zzm.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzaay
            @Override // java.lang.Runnable
            public final void run() {
                zzackVar.zzb(this.zza);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzaas
    public final void zzc(zzabc zzabcVar, final zzdv zzdvVar) {
        final zzack zzackVar = this.zzl;
        this.zzm.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzaax
            @Override // java.lang.Runnable
            public final void run() {
                zzackVar.zzc(this.zza, zzdvVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzacm
    public final long zzd(long j, boolean z) {
        zzeq.zzf(false);
        long j2 = this.zzk;
        if (j2 != -9223372036854775807L) {
            if (!zzabc.zzt(this.zza, j2)) {
                return -9223372036854775807L;
            }
            zzm();
            this.zzk = -9223372036854775807L;
        }
        zzds zzdsVar = null;
        zzeq.zzb(null);
        zzdsVar.zza();
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzacm
    public final void zze() {
        this.zzj = false;
        this.zzi = -9223372036854775807L;
        zzabc.zzg(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzacm
    public final void zzf(zzan zzanVar, zzer zzerVar) throws zzacl {
        this.zze = zzabc.zzb(this.zza, zzanVar, zzerVar);
    }

    @Override // com.google.android.gms.internal.ads.zzacm
    public final void zzg(int i, zzan zzanVar) {
        zzeq.zzf(false);
        int i2 = zzgd.zza;
        this.zzf = zzanVar;
        if (this.zzj) {
            zzeq.zzf(this.zzi != -9223372036854775807L);
            this.zzk = this.zzi;
        } else {
            zzm();
            this.zzj = true;
            this.zzk = -9223372036854775807L;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzacm
    public final void zzh(long j, long j2) throws zzacl {
        zzeq.zzf(false);
        try {
            this.zza.zzo(j, j2);
        } catch (zzjh e) {
            zzan zzanVarZzad = this.zzf;
            if (zzanVarZzad == null) {
                zzanVarZzad = new zzal().zzad();
            }
            throw new zzacl(e, zzanVarZzad);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzacm
    public final void zzi(zzack zzackVar, Executor executor) {
        this.zzl = zzackVar;
        this.zzm = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzacm
    public final void zzj(long j) {
        this.zzh = this.zzg != j;
        this.zzg = j;
    }

    public final void zzk(List list) {
        this.zzd.clear();
        this.zzd.addAll(list);
        zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzacm
    public final boolean zzl() {
        return zzgd.zzL(this.zzb);
    }
}
