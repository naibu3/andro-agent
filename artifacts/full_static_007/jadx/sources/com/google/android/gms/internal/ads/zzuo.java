package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public abstract class zzuo implements zzvq {
    private final ArrayList zza = new ArrayList(1);
    private final HashSet zzb = new HashSet(1);
    private final zzvx zzc = new zzvx();
    private final zzso zzd = new zzso();
    private Looper zze;
    private zzdc zzf;
    private zzpj zzg;

    @Override // com.google.android.gms.internal.ads.zzvq
    public /* synthetic */ zzdc zzM() {
        return null;
    }

    protected final zzpj zzb() {
        zzpj zzpjVar = this.zzg;
        zzeq.zzb(zzpjVar);
        return zzpjVar;
    }

    protected final zzso zzc(zzvo zzvoVar) {
        return this.zzd.zza(0, zzvoVar);
    }

    protected final zzso zzd(int i, zzvo zzvoVar) {
        return this.zzd.zza(0, zzvoVar);
    }

    protected final zzvx zze(zzvo zzvoVar) {
        return this.zzc.zza(0, zzvoVar);
    }

    protected final zzvx zzf(int i, zzvo zzvoVar) {
        return this.zzc.zza(0, zzvoVar);
    }

    @Override // com.google.android.gms.internal.ads.zzvq
    public final void zzg(Handler handler, zzsp zzspVar) {
        this.zzd.zzb(handler, zzspVar);
    }

    @Override // com.google.android.gms.internal.ads.zzvq
    public final void zzh(Handler handler, zzvy zzvyVar) {
        this.zzc.zzb(handler, zzvyVar);
    }

    @Override // com.google.android.gms.internal.ads.zzvq
    public final void zzi(zzvp zzvpVar) {
        boolean zIsEmpty = this.zzb.isEmpty();
        this.zzb.remove(zzvpVar);
        if (zIsEmpty || !this.zzb.isEmpty()) {
            return;
        }
        zzj();
    }

    protected void zzj() {
    }

    @Override // com.google.android.gms.internal.ads.zzvq
    public final void zzk(zzvp zzvpVar) {
        this.zze.getClass();
        HashSet hashSet = this.zzb;
        boolean zIsEmpty = hashSet.isEmpty();
        hashSet.add(zzvpVar);
        if (zIsEmpty) {
            zzl();
        }
    }

    protected void zzl() {
    }

    @Override // com.google.android.gms.internal.ads.zzvq
    public final void zzm(zzvp zzvpVar, zzie zzieVar, zzpj zzpjVar) {
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = this.zze;
        boolean z = true;
        if (looper != null && looper != looperMyLooper) {
            z = false;
        }
        zzeq.zzd(z);
        this.zzg = zzpjVar;
        zzdc zzdcVar = this.zzf;
        this.zza.add(zzvpVar);
        if (this.zze == null) {
            this.zze = looperMyLooper;
            this.zzb.add(zzvpVar);
            zzn(zzieVar);
        } else if (zzdcVar != null) {
            zzk(zzvpVar);
            zzvpVar.zza(this, zzdcVar);
        }
    }

    protected abstract void zzn(zzie zzieVar);

    protected final void zzo(zzdc zzdcVar) {
        this.zzf = zzdcVar;
        ArrayList arrayList = this.zza;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((zzvp) arrayList.get(i)).zza(this, zzdcVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvq
    public final void zzp(zzvp zzvpVar) {
        this.zza.remove(zzvpVar);
        if (!this.zza.isEmpty()) {
            zzi(zzvpVar);
            return;
        }
        this.zze = null;
        this.zzf = null;
        this.zzg = null;
        this.zzb.clear();
        zzq();
    }

    protected abstract void zzq();

    @Override // com.google.android.gms.internal.ads.zzvq
    public final void zzr(zzsp zzspVar) {
        this.zzd.zzc(zzspVar);
    }

    @Override // com.google.android.gms.internal.ads.zzvq
    public final void zzs(zzvy zzvyVar) {
        this.zzc.zzh(zzvyVar);
    }

    @Override // com.google.android.gms.internal.ads.zzvq
    public /* synthetic */ void zzt(zzbu zzbuVar) {
        throw null;
    }

    protected final boolean zzu() {
        return !this.zzb.isEmpty();
    }

    @Override // com.google.android.gms.internal.ads.zzvq
    public /* synthetic */ boolean zzv() {
        return true;
    }
}
