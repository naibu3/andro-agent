package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public abstract class zzea implements zzdz {
    protected zzdx zzb;
    protected zzdx zzc;
    private zzdx zzd;
    private zzdx zze;
    private ByteBuffer zzf;
    private ByteBuffer zzg;
    private boolean zzh;

    public zzea() {
        ByteBuffer byteBuffer = zza;
        this.zzf = byteBuffer;
        this.zzg = byteBuffer;
        this.zzd = zzdx.zza;
        zzdx zzdxVar = zzdx.zza;
        this.zze = zzdxVar;
        this.zzb = zzdxVar;
        this.zzc = zzdxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdz
    public final zzdx zza(zzdx zzdxVar) throws zzdy {
        this.zzd = zzdxVar;
        this.zze = zzi(zzdxVar);
        return zzg() ? this.zze : zzdx.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzdz
    public ByteBuffer zzb() {
        ByteBuffer byteBuffer = this.zzg;
        this.zzg = zza;
        return byteBuffer;
    }

    @Override // com.google.android.gms.internal.ads.zzdz
    public final void zzc() {
        this.zzg = zza;
        this.zzh = false;
        this.zzb = this.zzd;
        this.zzc = this.zze;
        zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzdz
    public final void zzd() {
        this.zzh = true;
        zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzdz
    public final void zzf() {
        zzc();
        this.zzf = zza;
        this.zzd = zzdx.zza;
        zzdx zzdxVar = zzdx.zza;
        this.zze = zzdxVar;
        this.zzb = zzdxVar;
        this.zzc = zzdxVar;
        zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzdz
    public boolean zzg() {
        return this.zze != zzdx.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzdz
    public boolean zzh() {
        return this.zzh && this.zzg == zza;
    }

    protected zzdx zzi(zzdx zzdxVar) throws zzdy {
        throw null;
    }

    protected final ByteBuffer zzj(int i) {
        if (this.zzf.capacity() < i) {
            this.zzf = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        } else {
            this.zzf.clear();
        }
        ByteBuffer byteBuffer = this.zzf;
        this.zzg = byteBuffer;
        return byteBuffer;
    }

    protected void zzk() {
    }

    protected void zzl() {
    }

    protected void zzm() {
    }

    protected final boolean zzn() {
        return this.zzg.hasRemaining();
    }
}
