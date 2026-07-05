package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzabc implements zzacn, zzdt, zzabv {
    private static final Executor zza = new Executor() { // from class: com.google.android.gms.internal.ads.zzaao
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
        }
    };
    private final Context zzb;
    private final zzaba zzc;
    private final zzcu zzd;
    private final CopyOnWriteArraySet zze;
    private zzer zzf;
    private zzabq zzg;
    private zzabw zzh;
    private zzan zzi;
    private zzabn zzj;
    private zzfb zzk;
    private zzcv zzl;
    private Pair zzm;
    private int zzn;
    private int zzo;
    private float zzp;

    /* synthetic */ zzabc(zzaar zzaarVar, zzabb zzabbVar) {
        Context context = zzaarVar.zza;
        this.zzb = context;
        zzaba zzabaVar = new zzaba(this, context);
        this.zzc = zzabaVar;
        zzcu zzcuVar = zzaarVar.zzc;
        zzeq.zzb(zzcuVar);
        this.zzd = zzcuVar;
        CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
        this.zze = copyOnWriteArraySet;
        this.zzo = 0;
        this.zzp = 1.0f;
        copyOnWriteArraySet.add(zzabaVar);
    }

    static /* bridge */ /* synthetic */ zzds zzb(zzabc zzabcVar, zzan zzanVar, zzer zzerVar) throws zzacl {
        zzeq.zzf(zzabcVar.zzo == 0);
        zzeq.zzf((zzabcVar.zzh == null || zzabcVar.zzg == null) ? false : true);
        zzabcVar.zzf = zzerVar;
        Looper looperMyLooper = Looper.myLooper();
        zzeq.zzb(looperMyLooper);
        zzabcVar.zzk = zzerVar.zzb(looperMyLooper, null);
        zzt zztVarZzu = zzu(zzanVar.zzz);
        if (zztVarZzu.zzf == 7 && zzgd.zza < 34) {
            zzr zzrVarZzc = zztVarZzu.zzc();
            zzrVarZzc.zzd(6);
            zztVarZzu = zzrVarZzc.zzg();
        }
        zzt zztVar = zztVarZzu;
        try {
            zzcu zzcuVar = zzabcVar.zzd;
            Context context = zzabcVar.zzb;
            zzw zzwVar = zzw.zza;
            final zzfb zzfbVar = zzabcVar.zzk;
            Objects.requireNonNull(zzfbVar);
            zzabcVar.zzl = zzcuVar.zza(context, zztVar, zzwVar, zzabcVar, new Executor() { // from class: com.google.android.gms.internal.ads.zzaap
                @Override // java.util.concurrent.Executor
                public final void execute(Runnable runnable) {
                    zzfbVar.zzh(runnable);
                }
            }, zzgbc.zzm(), 0L);
            Pair pair = zzabcVar.zzm;
            if (pair == null) {
                throw null;
            }
            zzfv zzfvVar = (zzfv) zzabcVar.zzm.second;
            zzfvVar.zzb();
            zzfvVar.zza();
            throw null;
        } catch (zzdq e) {
            throw new zzacl(e, zzanVar);
        }
    }

    public static /* synthetic */ void zzf(zzabc zzabcVar) {
        int i = zzabcVar.zzn - 1;
        zzabcVar.zzn = i;
        if (i > 0) {
            return;
        }
        if (i < 0) {
            throw new IllegalStateException(String.valueOf(i));
        }
        zzabw zzabwVar = zzabcVar.zzh;
        zzeq.zzb(zzabwVar);
        zzabwVar.zza();
    }

    static /* bridge */ /* synthetic */ void zzg(final zzabc zzabcVar) {
        if (zzabcVar.zzv()) {
            zzabcVar.zzn++;
            zzabw zzabwVar = zzabcVar.zzh;
            zzeq.zzb(zzabwVar);
            zzabwVar.zza();
            zzfb zzfbVar = zzabcVar.zzk;
            zzeq.zzb(zzfbVar);
            zzfbVar.zzh(new Runnable() { // from class: com.google.android.gms.internal.ads.zzaaq
                @Override // java.lang.Runnable
                public final void run() {
                    zzabc.zzf(this.zza);
                }
            });
        }
    }

    static /* bridge */ /* synthetic */ void zzh(zzabc zzabcVar, long j, long j2) {
        zzabw zzabwVar = zzabcVar.zzh;
        zzeq.zzb(zzabwVar);
        zzabwVar.zzb(j, j2);
    }

    static /* bridge */ /* synthetic */ void zzi(zzabc zzabcVar, float f) {
        zzabcVar.zzp = f;
        zzabw zzabwVar = zzabcVar.zzh;
        if (zzabwVar != null) {
            zzabwVar.zzd(f);
        }
    }

    static /* bridge */ /* synthetic */ boolean zzt(zzabc zzabcVar, long j) {
        if (zzabcVar.zzn != 0) {
            return false;
        }
        zzabw zzabwVar = zzabcVar.zzh;
        zzeq.zzb(zzabwVar);
        return zzabwVar.zze(j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzt zzu(zzt zztVar) {
        return (zztVar == null || !zztVar.zzf()) ? zzt.zza : zztVar;
    }

    private final boolean zzv() {
        return this.zzo == 1;
    }

    @Override // com.google.android.gms.internal.ads.zzacn
    public final zzabq zzc() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzacn
    public final zzacm zzd() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzacn
    public final void zzk() {
        zzfv.zza.zzb();
        zzfv.zza.zza();
        this.zzm = null;
    }

    @Override // com.google.android.gms.internal.ads.zzabv
    public final void zzl() {
        Iterator it = this.zze.iterator();
        while (it.hasNext()) {
            ((zzaas) it.next()).zzb(this);
        }
        zzeq.zzb(null);
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzabv
    public final void zzm(zzdv zzdvVar) {
        zzal zzalVar = new zzal();
        zzalVar.zzac(zzdvVar.zzc);
        zzalVar.zzI(zzdvVar.zzd);
        zzalVar.zzX("video/raw");
        this.zzi = zzalVar.zzad();
        Iterator it = this.zze.iterator();
        while (it.hasNext()) {
            ((zzaas) it.next()).zzc(this, zzdvVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzacn
    public final void zzn() {
        if (this.zzo == 2) {
            return;
        }
        zzfb zzfbVar = this.zzk;
        if (zzfbVar != null) {
            zzfbVar.zze(null);
        }
        this.zzm = null;
        this.zzo = 2;
    }

    public final void zzo(long j, long j2) throws zzjh {
        if (this.zzn == 0) {
            zzabw zzabwVar = this.zzh;
            zzeq.zzb(zzabwVar);
            zzabwVar.zzc(j, j2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzabv
    public final void zzp(long j, long j2, long j3, boolean z) {
        if (z && this.zzm != null) {
            Iterator it = this.zze.iterator();
            while (it.hasNext()) {
                ((zzaas) it.next()).zza(this);
            }
        }
        if (this.zzj != null) {
            zzan zzanVarZzad = this.zzi;
            if (zzanVarZzad == null) {
                zzanVarZzad = new zzal().zzad();
            }
            zzeq.zzb(this.zzf);
            this.zzj.zza(j2 - j3, System.nanoTime(), zzanVarZzad, null);
        }
        zzeq.zzb(null);
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzacn
    public final void zzq(Surface surface, zzfv zzfvVar) {
        Pair pair = this.zzm;
        if (pair != null && ((Surface) pair.first).equals(surface) && ((zzfv) this.zzm.second).equals(zzfvVar)) {
            return;
        }
        this.zzm = Pair.create(surface, zzfvVar);
        zzfvVar.zzb();
        zzfvVar.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzacn
    public final void zzr(List list) {
        this.zzc.zzk(list);
    }

    @Override // com.google.android.gms.internal.ads.zzacn
    public final void zzs(zzabq zzabqVar) {
        zzeq.zzf(!zzv());
        this.zzg = zzabqVar;
        zzabw zzabwVar = new zzabw(this, zzabqVar);
        this.zzh = zzabwVar;
        zzabwVar.zzd(this.zzp);
    }
}
