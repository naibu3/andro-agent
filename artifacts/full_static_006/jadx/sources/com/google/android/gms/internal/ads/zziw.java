package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public abstract class zziw implements zzmn, zzmp {
    private final int zzb;
    private zzmq zzd;
    private int zze;
    private zzpj zzf;
    private zzer zzg;
    private int zzh;
    private zzxf zzi;
    private zzan[] zzj;
    private long zzk;
    private long zzl;
    private boolean zzn;
    private boolean zzo;
    private zzmo zzq;
    private final Object zza = new Object();
    private final zzlj zzc = new zzlj();
    private long zzm = Long.MIN_VALUE;
    private zzdc zzp = zzdc.zza;

    public zziw(int i) {
        this.zzb = i;
    }

    private final void zzZ(long j, boolean z) throws zzjh {
        this.zzn = false;
        this.zzl = j;
        this.zzm = j;
        zzz(j, z);
    }

    protected void zzA() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzB() {
        zzmo zzmoVar;
        synchronized (this.zza) {
            zzmoVar = this.zzq;
        }
        if (zzmoVar != null) {
            zzmoVar.zza(this);
        }
    }

    protected void zzC() {
    }

    protected void zzD() throws zzjh {
    }

    protected void zzE() {
    }

    protected void zzF(zzan[] zzanVarArr, long j, long j2, zzvo zzvoVar) throws zzjh {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzmn
    public final void zzG() {
        zzeq.zzf(this.zzh == 0);
        zzA();
    }

    @Override // com.google.android.gms.internal.ads.zzmn
    public final void zzH(zzan[] zzanVarArr, zzxf zzxfVar, long j, long j2, zzvo zzvoVar) throws zzjh {
        zzeq.zzf(!this.zzn);
        this.zzi = zzxfVar;
        if (this.zzm == Long.MIN_VALUE) {
            this.zzm = j;
        }
        this.zzj = zzanVarArr;
        this.zzk = j2;
        zzF(zzanVarArr, j, j2, zzvoVar);
    }

    @Override // com.google.android.gms.internal.ads.zzmn
    public final void zzI() {
        zzeq.zzf(this.zzh == 0);
        zzlj zzljVar = this.zzc;
        zzljVar.zzb = null;
        zzljVar.zza = null;
        zzC();
    }

    @Override // com.google.android.gms.internal.ads.zzmn
    public final void zzJ(long j) throws zzjh {
        zzZ(j, false);
    }

    @Override // com.google.android.gms.internal.ads.zzmn
    public final void zzK() {
        this.zzn = true;
    }

    @Override // com.google.android.gms.internal.ads.zzmp
    public final void zzL(zzmo zzmoVar) {
        synchronized (this.zza) {
            this.zzq = zzmoVar;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzmn
    public /* synthetic */ void zzM(float f, float f2) {
    }

    @Override // com.google.android.gms.internal.ads.zzmn
    public final void zzN(zzdc zzdcVar) {
        if (zzgd.zzG(this.zzp, zzdcVar)) {
            return;
        }
        this.zzp = zzdcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzmn
    public final void zzO() throws zzjh {
        zzeq.zzf(this.zzh == 1);
        this.zzh = 2;
        zzD();
    }

    @Override // com.google.android.gms.internal.ads.zzmn
    public final void zzP() {
        zzeq.zzf(this.zzh == 2);
        this.zzh = 1;
        zzE();
    }

    @Override // com.google.android.gms.internal.ads.zzmn
    public final boolean zzQ() {
        return this.zzm == Long.MIN_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.zzmn
    public final boolean zzR() {
        return this.zzn;
    }

    protected final zzan[] zzT() {
        zzan[] zzanVarArr = this.zzj;
        zzanVarArr.getClass();
        return zzanVarArr;
    }

    @Override // com.google.android.gms.internal.ads.zzmn, com.google.android.gms.internal.ads.zzmp
    public final int zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzmn
    public final int zzcU() {
        return this.zzh;
    }

    protected final int zzcV(zzlj zzljVar, zzin zzinVar, int i) {
        zzxf zzxfVar = this.zzi;
        zzxfVar.getClass();
        int iZza = zzxfVar.zza(zzljVar, zzinVar, i);
        if (iZza == -4) {
            if (zzinVar.zzf()) {
                this.zzm = Long.MIN_VALUE;
                return this.zzn ? -4 : -3;
            }
            long j = zzinVar.zze + this.zzk;
            zzinVar.zze = j;
            this.zzm = Math.max(this.zzm, j);
        } else if (iZza == -5) {
            zzan zzanVar = zzljVar.zza;
            zzanVar.getClass();
            long j2 = zzanVar.zzr;
            if (j2 != Long.MAX_VALUE) {
                zzal zzalVarZzb = zzanVar.zzb();
                zzalVarZzb.zzab(j2 + this.zzk);
                zzljVar.zza = zzalVarZzb.zzad();
                return -5;
            }
        }
        return iZza;
    }

    @Override // com.google.android.gms.internal.ads.zzmn
    public final long zzcW() {
        return this.zzm;
    }

    protected final zzlj zzcX() {
        zzlj zzljVar = this.zzc;
        zzljVar.zzb = null;
        zzljVar.zza = null;
        return zzljVar;
    }

    @Override // com.google.android.gms.internal.ads.zzmp
    public int zze() throws zzjh {
        return 0;
    }

    protected final long zzf() {
        return this.zzl;
    }

    protected final zzer zzh() {
        zzer zzerVar = this.zzg;
        zzerVar.getClass();
        return zzerVar;
    }

    protected final zzjh zzi(Throwable th, zzan zzanVar, boolean z, int i) {
        int iZzY = 4;
        if (zzanVar != null && !this.zzo) {
            this.zzo = true;
            try {
                iZzY = zzY(zzanVar) & 7;
            } catch (zzjh unused) {
            } finally {
                this.zzo = false;
            }
        }
        return zzjh.zzb(th, zzU(), this.zze, zzanVar, iZzY, z, i);
    }

    @Override // com.google.android.gms.internal.ads.zzmn
    public zzlp zzk() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzmn
    public final zzmp zzl() {
        return this;
    }

    protected final zzmq zzm() {
        zzmq zzmqVar = this.zzd;
        zzmqVar.getClass();
        return zzmqVar;
    }

    protected final zzpj zzn() {
        zzpj zzpjVar = this.zzf;
        zzpjVar.getClass();
        return zzpjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzmn
    public final zzxf zzo() {
        return this.zzi;
    }

    @Override // com.google.android.gms.internal.ads.zzmp
    public final void zzp() {
        synchronized (this.zza) {
            this.zzq = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzmn
    public final void zzq() {
        zzeq.zzf(this.zzh == 1);
        zzlj zzljVar = this.zzc;
        zzljVar.zzb = null;
        zzljVar.zza = null;
        this.zzh = 0;
        this.zzi = null;
        this.zzj = null;
        this.zzn = false;
        zzw();
    }

    @Override // com.google.android.gms.internal.ads.zzmn
    public final void zzr(zzmq zzmqVar, zzan[] zzanVarArr, zzxf zzxfVar, long j, boolean z, boolean z2, long j2, long j3, zzvo zzvoVar) throws zzjh {
        zzeq.zzf(this.zzh == 0);
        this.zzd = zzmqVar;
        this.zzh = 1;
        zzx(z, z2);
        zzH(zzanVarArr, zzxfVar, j2, j3, zzvoVar);
        zzZ(j2, z);
    }

    @Override // com.google.android.gms.internal.ads.zzmn
    public /* synthetic */ void zzs() {
    }

    @Override // com.google.android.gms.internal.ads.zzmi
    public void zzt(int i, Object obj) throws zzjh {
    }

    @Override // com.google.android.gms.internal.ads.zzmn
    public final void zzu(int i, zzpj zzpjVar, zzer zzerVar) {
        this.zze = i;
        this.zzf = zzpjVar;
        this.zzg = zzerVar;
        zzy();
    }

    protected void zzw() {
        throw null;
    }

    protected void zzx(boolean z, boolean z2) throws zzjh {
    }

    protected void zzy() {
    }

    protected void zzz(long j, boolean z) throws zzjh {
        throw null;
    }

    protected final boolean zzS() {
        if (zzQ()) {
            return this.zzn;
        }
        zzxf zzxfVar = this.zzi;
        zzxfVar.getClass();
        return zzxfVar.zze();
    }

    protected final int zzd(long j) {
        zzxf zzxfVar = this.zzi;
        zzxfVar.getClass();
        return zzxfVar.zzb(j - this.zzk);
    }

    @Override // com.google.android.gms.internal.ads.zzmn
    public final void zzv() throws IOException {
        zzxf zzxfVar = this.zzi;
        zzxfVar.getClass();
        zzxfVar.zzd();
    }
}
