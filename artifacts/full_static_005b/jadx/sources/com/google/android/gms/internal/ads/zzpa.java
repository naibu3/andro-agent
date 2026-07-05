package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.util.SparseArray;
import androidx.core.view.PointerIconCompat;
import java.io.IOException;
import java.util.List;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzpa implements zzmx {
    private final zzer zza;
    private final zzcz zzb;
    private final zzdb zzc;
    private final zzoz zzd;
    private final SparseArray zze;
    private zzfh zzf;
    private zzct zzg;
    private zzfb zzh;
    private boolean zzi;

    public static /* synthetic */ void zzV(zzpa zzpaVar) {
        final zzmy zzmyVarZzT = zzpaVar.zzT();
        zzpaVar.zzY(zzmyVarZzT, 1028, new zzfe() { // from class: com.google.android.gms.internal.ads.zznc
            @Override // com.google.android.gms.internal.ads.zzfe
            public final void zza(Object obj) {
            }
        });
        zzpaVar.zzf.zze();
    }

    private final zzmy zzaa(int i, zzvo zzvoVar) {
        zzct zzctVar = this.zzg;
        zzctVar.getClass();
        if (zzvoVar != null) {
            return this.zzd.zza(zzvoVar) != null ? zzZ(zzvoVar) : zzU(zzdc.zza, i, zzvoVar);
        }
        zzdc zzdcVarZzn = zzctVar.zzn();
        if (i >= zzdcVarZzn.zzc()) {
            zzdcVarZzn = zzdc.zza;
        }
        return zzU(zzdcVarZzn, i, null);
    }

    private final zzmy zzab() {
        return zzZ(this.zzd.zzd());
    }

    private final zzmy zzac() {
        return zzZ(this.zzd.zze());
    }

    private final zzmy zzad(zzcj zzcjVar) {
        zzvo zzvoVar;
        return (!(zzcjVar instanceof zzjh) || (zzvoVar = ((zzjh) zzcjVar).zzj) == null) ? zzT() : zzZ(zzvoVar);
    }

    @Override // com.google.android.gms.internal.ads.zzmx
    public final void zzA(final zzan zzanVar, final zziy zziyVar) {
        final zzmy zzmyVarZzac = zzac();
        zzY(zzmyVarZzac, PointerIconCompat.TYPE_VERTICAL_TEXT, new zzfe() { // from class: com.google.android.gms.internal.ads.zzoo
            @Override // com.google.android.gms.internal.ads.zzfe
            public final void zza(Object obj) {
                ((zzna) obj).zze(zzmyVarZzac, zzanVar, zziyVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmx
    public final void zzB(final long j) {
        final zzmy zzmyVarZzac = zzac();
        zzY(zzmyVarZzac, PointerIconCompat.TYPE_ALIAS, new zzfe(j) { // from class: com.google.android.gms.internal.ads.zzns
            @Override // com.google.android.gms.internal.ads.zzfe
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmx
    public final void zzC(final Exception exc) {
        final zzmy zzmyVarZzac = zzac();
        zzY(zzmyVarZzac, PointerIconCompat.TYPE_HORIZONTAL_DOUBLE_ARROW, new zzfe() { // from class: com.google.android.gms.internal.ads.zzow
            @Override // com.google.android.gms.internal.ads.zzfe
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmx
    public final void zzD(final zzqp zzqpVar) {
        final zzmy zzmyVarZzac = zzac();
        zzY(zzmyVarZzac, 1031, new zzfe() { // from class: com.google.android.gms.internal.ads.zzol
            @Override // com.google.android.gms.internal.ads.zzfe
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmx
    public final void zzE(final zzqp zzqpVar) {
        final zzmy zzmyVarZzac = zzac();
        zzY(zzmyVarZzac, 1032, new zzfe() { // from class: com.google.android.gms.internal.ads.zzov
            @Override // com.google.android.gms.internal.ads.zzfe
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmx
    public final void zzF(final int i, final long j, final long j2) {
        final zzmy zzmyVarZzac = zzac();
        zzY(zzmyVarZzac, PointerIconCompat.TYPE_COPY, new zzfe(i, j, j2) { // from class: com.google.android.gms.internal.ads.zzno
            @Override // com.google.android.gms.internal.ads.zzfe
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmx
    public final void zzG(final int i, final long j) {
        final zzmy zzmyVarZzab = zzab();
        zzY(zzmyVarZzab, PointerIconCompat.TYPE_ZOOM_IN, new zzfe() { // from class: com.google.android.gms.internal.ads.zzny
            @Override // com.google.android.gms.internal.ads.zzfe
            public final void zza(Object obj) {
                ((zzna) obj).zzh(zzmyVarZzab, i, j);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmx
    public final void zzH(final Object obj, final long j) {
        final zzmy zzmyVarZzac = zzac();
        zzY(zzmyVarZzac, 26, new zzfe() { // from class: com.google.android.gms.internal.ads.zzos
            @Override // com.google.android.gms.internal.ads.zzfe
            public final void zza(Object obj2) {
                ((zzna) obj2).zzn(zzmyVarZzac, obj, j);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmx
    public final void zzI(final Exception exc) {
        final zzmy zzmyVarZzac = zzac();
        zzY(zzmyVarZzac, 1030, new zzfe() { // from class: com.google.android.gms.internal.ads.zznn
            @Override // com.google.android.gms.internal.ads.zzfe
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmx
    public final void zzJ(final String str, final long j, final long j2) {
        final zzmy zzmyVarZzac = zzac();
        zzY(zzmyVarZzac, PointerIconCompat.TYPE_TOP_RIGHT_DIAGONAL_DOUBLE_ARROW, new zzfe(str, j2, j) { // from class: com.google.android.gms.internal.ads.zzou
            public final /* synthetic */ String zzb;

            @Override // com.google.android.gms.internal.ads.zzfe
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmx
    public final void zzK(final String str) {
        final zzmy zzmyVarZzac = zzac();
        zzY(zzmyVarZzac, PointerIconCompat.TYPE_ZOOM_OUT, new zzfe() { // from class: com.google.android.gms.internal.ads.zznx
            @Override // com.google.android.gms.internal.ads.zzfe
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmx
    public final void zzL(final zzix zzixVar) {
        final zzmy zzmyVarZzab = zzab();
        zzY(zzmyVarZzab, PointerIconCompat.TYPE_GRAB, new zzfe() { // from class: com.google.android.gms.internal.ads.zzok
            @Override // com.google.android.gms.internal.ads.zzfe
            public final void zza(Object obj) {
                ((zzna) obj).zzo(zzmyVarZzab, zzixVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmx
    public final void zzM(final zzix zzixVar) {
        final zzmy zzmyVarZzac = zzac();
        zzY(zzmyVarZzac, PointerIconCompat.TYPE_VERTICAL_DOUBLE_ARROW, new zzfe() { // from class: com.google.android.gms.internal.ads.zzoq
            @Override // com.google.android.gms.internal.ads.zzfe
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmx
    public final void zzN(final long j, final int i) {
        final zzmy zzmyVarZzab = zzab();
        zzY(zzmyVarZzab, PointerIconCompat.TYPE_GRABBING, new zzfe(j, i) { // from class: com.google.android.gms.internal.ads.zzoc
            @Override // com.google.android.gms.internal.ads.zzfe
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmx
    public final void zzO(final zzan zzanVar, final zziy zziyVar) {
        final zzmy zzmyVarZzac = zzac();
        zzY(zzmyVarZzac, PointerIconCompat.TYPE_TOP_LEFT_DIAGONAL_DOUBLE_ARROW, new zzfe() { // from class: com.google.android.gms.internal.ads.zzoj
            @Override // com.google.android.gms.internal.ads.zzfe
            public final void zza(Object obj) {
                ((zzna) obj).zzp(zzmyVarZzac, zzanVar, zziyVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmx
    public final void zzP() {
        zzfb zzfbVar = this.zzh;
        zzeq.zzb(zzfbVar);
        zzfbVar.zzh(new Runnable() { // from class: com.google.android.gms.internal.ads.zzor
            @Override // java.lang.Runnable
            public final void run() {
                zzpa.zzV(this.zza);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmx
    public final void zzQ(zzna zznaVar) {
        this.zzf.zzf(zznaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzmx
    public final void zzR(final zzct zzctVar, Looper looper) {
        boolean z = true;
        if (this.zzg != null && !this.zzd.zzb.isEmpty()) {
            z = false;
        }
        zzeq.zzf(z);
        zzctVar.getClass();
        this.zzg = zzctVar;
        this.zzh = this.zza.zzb(looper, null);
        this.zzf = this.zzf.zza(looper, new zzff() { // from class: com.google.android.gms.internal.ads.zznq
            @Override // com.google.android.gms.internal.ads.zzff
            public final void zza(Object obj, zzah zzahVar) {
                this.zza.zzW(zzctVar, (zzna) obj, zzahVar);
            }
        });
    }

    protected final zzmy zzT() {
        return zzZ(this.zzd.zzb());
    }

    @RequiresNonNull({"player"})
    protected final zzmy zzU(zzdc zzdcVar, int i, zzvo zzvoVar) {
        zzvo zzvoVar2 = true == zzdcVar.zzo() ? null : zzvoVar;
        long jZza = this.zza.zza();
        boolean z = zzdcVar.equals(this.zzg.zzn()) && i == this.zzg.zzd();
        long jZzu = 0;
        if (zzvoVar2 == null || !zzvoVar2.zzb()) {
            if (z) {
                jZzu = this.zzg.zzj();
            } else if (!zzdcVar.zzo()) {
                long j = zzdcVar.zze(i, this.zzc, 0L).zzn;
                jZzu = zzgd.zzu(0L);
            }
        } else if (z && this.zzg.zzb() == zzvoVar2.zzb && this.zzg.zzc() == zzvoVar2.zzc) {
            jZzu = this.zzg.zzk();
        }
        return new zzmy(jZza, zzdcVar, i, zzvoVar2, jZzu, this.zzg.zzn(), this.zzg.zzd(), this.zzd.zzb(), this.zzg.zzk(), this.zzg.zzm());
    }

    final /* synthetic */ void zzW(zzct zzctVar, zzna zznaVar, zzah zzahVar) {
        zznaVar.zzi(zzctVar, new zzmz(zzahVar, this.zze));
    }

    @Override // com.google.android.gms.internal.ads.zzzt
    public final void zzX(final int i, final long j, final long j2) {
        final zzmy zzmyVarZzZ = zzZ(this.zzd.zzc());
        zzY(zzmyVarZzZ, PointerIconCompat.TYPE_CELL, new zzfe() { // from class: com.google.android.gms.internal.ads.zznl
            @Override // com.google.android.gms.internal.ads.zzfe
            public final void zza(Object obj) {
                ((zzna) obj).zzf(zzmyVarZzZ, i, j, j2);
            }
        });
    }

    protected final void zzY(zzmy zzmyVar, int i, zzfe zzfeVar) {
        this.zze.put(i, zzmyVar);
        zzfh zzfhVar = this.zzf;
        zzfhVar.zzd(i, zzfeVar);
        zzfhVar.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzcq
    public final void zza(final zzcp zzcpVar) {
        final zzmy zzmyVarZzT = zzT();
        zzY(zzmyVarZzT, 13, new zzfe() { // from class: com.google.android.gms.internal.ads.zznh
            @Override // com.google.android.gms.internal.ads.zzfe
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzvy
    public final void zzae(int i, zzvo zzvoVar, final zzvk zzvkVar) {
        final zzmy zzmyVarZzaa = zzaa(i, zzvoVar);
        zzY(zzmyVarZzaa, 1004, new zzfe() { // from class: com.google.android.gms.internal.ads.zzod
            @Override // com.google.android.gms.internal.ads.zzfe
            public final void zza(Object obj) {
                ((zzna) obj).zzg(zzmyVarZzaa, zzvkVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzvy
    public final void zzaf(int i, zzvo zzvoVar, final zzvf zzvfVar, final zzvk zzvkVar) {
        final zzmy zzmyVarZzaa = zzaa(i, zzvoVar);
        zzY(zzmyVarZzaa, 1002, new zzfe() { // from class: com.google.android.gms.internal.ads.zzoe
            @Override // com.google.android.gms.internal.ads.zzfe
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzvy
    public final void zzag(int i, zzvo zzvoVar, final zzvf zzvfVar, final zzvk zzvkVar) {
        final zzmy zzmyVarZzaa = zzaa(i, zzvoVar);
        zzY(zzmyVarZzaa, 1001, new zzfe() { // from class: com.google.android.gms.internal.ads.zzoi
            @Override // com.google.android.gms.internal.ads.zzfe
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzvy
    public final void zzah(int i, zzvo zzvoVar, final zzvf zzvfVar, final zzvk zzvkVar, final IOException iOException, final boolean z) {
        final zzmy zzmyVarZzaa = zzaa(i, zzvoVar);
        zzY(zzmyVarZzaa, PointerIconCompat.TYPE_HELP, new zzfe() { // from class: com.google.android.gms.internal.ads.zznp
            @Override // com.google.android.gms.internal.ads.zzfe
            public final void zza(Object obj) {
                ((zzna) obj).zzj(zzmyVarZzaa, zzvfVar, zzvkVar, iOException, z);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzvy
    public final void zzai(int i, zzvo zzvoVar, final zzvf zzvfVar, final zzvk zzvkVar) {
        final zzmy zzmyVarZzaa = zzaa(i, zzvoVar);
        zzY(zzmyVarZzaa, 1000, new zzfe() { // from class: com.google.android.gms.internal.ads.zzng
            @Override // com.google.android.gms.internal.ads.zzfe
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcq
    public final void zzb(final boolean z) {
        final zzmy zzmyVarZzT = zzT();
        zzY(zzmyVarZzT, 3, new zzfe(z) { // from class: com.google.android.gms.internal.ads.zzne
            @Override // com.google.android.gms.internal.ads.zzfe
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcq
    public final void zzc(final boolean z) {
        final zzmy zzmyVarZzT = zzT();
        zzY(zzmyVarZzT, 7, new zzfe(z) { // from class: com.google.android.gms.internal.ads.zznt
            @Override // com.google.android.gms.internal.ads.zzfe
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcq
    public final void zzd(final zzbu zzbuVar, final int i) {
        final zzmy zzmyVarZzT = zzT();
        zzY(zzmyVarZzT, 1, new zzfe(zzbuVar, i) { // from class: com.google.android.gms.internal.ads.zznj
            public final /* synthetic */ zzbu zzb;

            @Override // com.google.android.gms.internal.ads.zzfe
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcq
    public final void zze(final zzca zzcaVar) {
        final zzmy zzmyVarZzT = zzT();
        zzY(zzmyVarZzT, 14, new zzfe() { // from class: com.google.android.gms.internal.ads.zzox
            @Override // com.google.android.gms.internal.ads.zzfe
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcq
    public final void zzf(final boolean z, final int i) {
        final zzmy zzmyVarZzT = zzT();
        zzY(zzmyVarZzT, 5, new zzfe(z, i) { // from class: com.google.android.gms.internal.ads.zzoa
            @Override // com.google.android.gms.internal.ads.zzfe
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcq
    public final void zzg(final zzcl zzclVar) {
        final zzmy zzmyVarZzT = zzT();
        zzY(zzmyVarZzT, 12, new zzfe() { // from class: com.google.android.gms.internal.ads.zznb
            @Override // com.google.android.gms.internal.ads.zzfe
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcq
    public final void zzh(final int i) {
        final zzmy zzmyVarZzT = zzT();
        zzY(zzmyVarZzT, 4, new zzfe() { // from class: com.google.android.gms.internal.ads.zzoh
            @Override // com.google.android.gms.internal.ads.zzfe
            public final void zza(Object obj) {
                ((zzna) obj).zzk(zzmyVarZzT, i);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcq
    public final void zzi(final int i) {
        final zzmy zzmyVarZzT = zzT();
        zzY(zzmyVarZzT, 6, new zzfe(i) { // from class: com.google.android.gms.internal.ads.zznw
            @Override // com.google.android.gms.internal.ads.zzfe
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcq
    public final void zzj(final zzcj zzcjVar) {
        final zzmy zzmyVarZzad = zzad(zzcjVar);
        zzY(zzmyVarZzad, 10, new zzfe() { // from class: com.google.android.gms.internal.ads.zzof
            @Override // com.google.android.gms.internal.ads.zzfe
            public final void zza(Object obj) {
                ((zzna) obj).zzl(zzmyVarZzad, zzcjVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcq
    public final void zzk(final zzcj zzcjVar) {
        final zzmy zzmyVarZzad = zzad(zzcjVar);
        zzY(zzmyVarZzad, 10, new zzfe() { // from class: com.google.android.gms.internal.ads.zznz
            @Override // com.google.android.gms.internal.ads.zzfe
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcq
    public final void zzl(final boolean z, final int i) {
        final zzmy zzmyVarZzT = zzT();
        zzY(zzmyVarZzT, -1, new zzfe(z, i) { // from class: com.google.android.gms.internal.ads.zznr
            @Override // com.google.android.gms.internal.ads.zzfe
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcq
    public final void zzn(final boolean z) {
        final zzmy zzmyVarZzac = zzac();
        zzY(zzmyVarZzac, 23, new zzfe(z) { // from class: com.google.android.gms.internal.ads.zznk
            @Override // com.google.android.gms.internal.ads.zzfe
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcq
    public final void zzo(final int i, final int i2) {
        final zzmy zzmyVarZzac = zzac();
        zzY(zzmyVarZzac, 24, new zzfe(i, i2) { // from class: com.google.android.gms.internal.ads.zzoy
            @Override // com.google.android.gms.internal.ads.zzfe
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcq
    public final void zzq(final zzdp zzdpVar) {
        final zzmy zzmyVarZzT = zzT();
        zzY(zzmyVarZzT, 2, new zzfe() { // from class: com.google.android.gms.internal.ads.zznu
            @Override // com.google.android.gms.internal.ads.zzfe
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcq
    public final void zzr(final zzdv zzdvVar) {
        final zzmy zzmyVarZzac = zzac();
        zzY(zzmyVarZzac, 25, new zzfe() { // from class: com.google.android.gms.internal.ads.zzom
            @Override // com.google.android.gms.internal.ads.zzfe
            public final void zza(Object obj) {
                zzmy zzmyVar = zzmyVarZzac;
                zzdv zzdvVar2 = zzdvVar;
                ((zzna) obj).zzq(zzmyVar, zzdvVar2);
                int i = zzdvVar2.zzc;
                int i2 = zzdvVar2.zzd;
                int i3 = zzdvVar2.zze;
                float f = zzdvVar2.zzf;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcq
    public final void zzs(final float f) {
        final zzmy zzmyVarZzac = zzac();
        zzY(zzmyVarZzac, 22, new zzfe(f) { // from class: com.google.android.gms.internal.ads.zznm
            @Override // com.google.android.gms.internal.ads.zzfe
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmx
    public final void zzt(zzna zznaVar) {
        this.zzf.zzb(zznaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzmx
    public final void zzu() {
        if (this.zzi) {
            return;
        }
        final zzmy zzmyVarZzT = zzT();
        this.zzi = true;
        zzY(zzmyVarZzT, -1, new zzfe() { // from class: com.google.android.gms.internal.ads.zzon
            @Override // com.google.android.gms.internal.ads.zzfe
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmx
    public final void zzv(final Exception exc) {
        final zzmy zzmyVarZzac = zzac();
        zzY(zzmyVarZzac, 1029, new zzfe() { // from class: com.google.android.gms.internal.ads.zzot
            @Override // com.google.android.gms.internal.ads.zzfe
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmx
    public final void zzw(final String str, final long j, final long j2) {
        final zzmy zzmyVarZzac = zzac();
        zzY(zzmyVarZzac, PointerIconCompat.TYPE_TEXT, new zzfe(str, j2, j) { // from class: com.google.android.gms.internal.ads.zznv
            public final /* synthetic */ String zzb;

            @Override // com.google.android.gms.internal.ads.zzfe
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmx
    public final void zzx(final String str) {
        final zzmy zzmyVarZzac = zzac();
        zzY(zzmyVarZzac, PointerIconCompat.TYPE_NO_DROP, new zzfe() { // from class: com.google.android.gms.internal.ads.zznf
            @Override // com.google.android.gms.internal.ads.zzfe
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmx
    public final void zzy(final zzix zzixVar) {
        final zzmy zzmyVarZzab = zzab();
        zzY(zzmyVarZzab, PointerIconCompat.TYPE_ALL_SCROLL, new zzfe() { // from class: com.google.android.gms.internal.ads.zzog
            @Override // com.google.android.gms.internal.ads.zzfe
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmx
    public final void zzz(final zzix zzixVar) {
        final zzmy zzmyVarZzac = zzac();
        zzY(zzmyVarZzac, PointerIconCompat.TYPE_CROSSHAIR, new zzfe() { // from class: com.google.android.gms.internal.ads.zznd
            @Override // com.google.android.gms.internal.ads.zzfe
            public final void zza(Object obj) {
            }
        });
    }

    private final zzmy zzZ(zzvo zzvoVar) {
        this.zzg.getClass();
        zzdc zzdcVarZza = zzvoVar == null ? null : this.zzd.zza(zzvoVar);
        if (zzvoVar != null && zzdcVarZza != null) {
            return zzU(zzdcVarZza, zzdcVarZza.zzn(zzvoVar.zza, this.zzb).zzd, zzvoVar);
        }
        int iZzd = this.zzg.zzd();
        zzdc zzdcVarZzn = this.zzg.zzn();
        if (iZzd >= zzdcVarZzn.zzc()) {
            zzdcVarZzn = zzdc.zza;
        }
        return zzU(zzdcVarZzn, iZzd, null);
    }

    @Override // com.google.android.gms.internal.ads.zzmx
    public final void zzS(List list, zzvo zzvoVar) {
        zzct zzctVar = this.zzg;
        zzctVar.getClass();
        this.zzd.zzh(list, zzvoVar, zzctVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcq
    public final void zzm(final zzcs zzcsVar, final zzcs zzcsVar2, final int i) {
        if (i == 1) {
            this.zzi = false;
            i = 1;
        }
        zzoz zzozVar = this.zzd;
        zzct zzctVar = this.zzg;
        zzctVar.getClass();
        zzozVar.zzg(zzctVar);
        final zzmy zzmyVarZzT = zzT();
        zzY(zzmyVarZzT, 11, new zzfe() { // from class: com.google.android.gms.internal.ads.zzop
            @Override // com.google.android.gms.internal.ads.zzfe
            public final void zza(Object obj) {
                ((zzna) obj).zzm(zzmyVarZzT, zzcsVar, zzcsVar2, i);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcq
    public final void zzp(zzdc zzdcVar, final int i) {
        zzct zzctVar = this.zzg;
        zzctVar.getClass();
        this.zzd.zzi(zzctVar);
        final zzmy zzmyVarZzT = zzT();
        zzY(zzmyVarZzT, 0, new zzfe(i) { // from class: com.google.android.gms.internal.ads.zzni
            @Override // com.google.android.gms.internal.ads.zzfe
            public final void zza(Object obj) {
            }
        });
    }

    public zzpa(zzer zzerVar) {
        zzerVar.getClass();
        this.zza = zzerVar;
        this.zzf = new zzfh(zzgd.zzy(), zzerVar, new zzff() { // from class: com.google.android.gms.internal.ads.zzob
            @Override // com.google.android.gms.internal.ads.zzff
            public final void zza(Object obj, zzah zzahVar) {
            }
        });
        zzcz zzczVar = new zzcz();
        this.zzb = zzczVar;
        this.zzc = new zzdb();
        this.zzd = new zzoz(zzczVar);
        this.zze = new SparseArray();
    }
}
