package com.google.android.gms.internal.ads;

import android.support.v4.media.session.PlaybackStateCompat;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzec implements zzdz {
    private int zzb;
    private float zzc = 1.0f;
    private float zzd = 1.0f;
    private zzdx zze = zzdx.zza;
    private zzdx zzf;
    private zzdx zzg;
    private zzdx zzh;
    private boolean zzi;
    private zzeb zzj;
    private ByteBuffer zzk;
    private ShortBuffer zzl;
    private ByteBuffer zzm;
    private long zzn;
    private long zzo;
    private boolean zzp;

    public zzec() {
        zzdx zzdxVar = zzdx.zza;
        this.zzf = zzdxVar;
        this.zzg = zzdxVar;
        this.zzh = zzdxVar;
        ByteBuffer byteBuffer = zza;
        this.zzk = byteBuffer;
        this.zzl = byteBuffer.asShortBuffer();
        this.zzm = zza;
        this.zzb = -1;
    }

    @Override // com.google.android.gms.internal.ads.zzdz
    public final zzdx zza(zzdx zzdxVar) throws zzdy {
        if (zzdxVar.zzd != 2) {
            throw new zzdy("Unhandled input format:", zzdxVar);
        }
        int i = this.zzb;
        if (i == -1) {
            i = zzdxVar.zzb;
        }
        this.zze = zzdxVar;
        zzdx zzdxVar2 = new zzdx(i, zzdxVar.zzc, 2);
        this.zzf = zzdxVar2;
        this.zzi = true;
        return zzdxVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzdz
    public final ByteBuffer zzb() {
        int iZza;
        zzeb zzebVar = this.zzj;
        if (zzebVar != null && (iZza = zzebVar.zza()) > 0) {
            if (this.zzk.capacity() < iZza) {
                ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(iZza).order(ByteOrder.nativeOrder());
                this.zzk = byteBufferOrder;
                this.zzl = byteBufferOrder.asShortBuffer();
            } else {
                this.zzk.clear();
                this.zzl.clear();
            }
            zzebVar.zzd(this.zzl);
            this.zzo += iZza;
            this.zzk.limit(iZza);
            this.zzm = this.zzk;
        }
        ByteBuffer byteBuffer = this.zzm;
        this.zzm = zza;
        return byteBuffer;
    }

    @Override // com.google.android.gms.internal.ads.zzdz
    public final void zzc() {
        if (zzg()) {
            this.zzg = this.zze;
            this.zzh = this.zzf;
            if (this.zzi) {
                zzdx zzdxVar = this.zzg;
                this.zzj = new zzeb(zzdxVar.zzb, zzdxVar.zzc, this.zzc, this.zzd, this.zzh.zzb);
            } else {
                zzeb zzebVar = this.zzj;
                if (zzebVar != null) {
                    zzebVar.zzc();
                }
            }
        }
        this.zzm = zza;
        this.zzn = 0L;
        this.zzo = 0L;
        this.zzp = false;
    }

    @Override // com.google.android.gms.internal.ads.zzdz
    public final void zzd() {
        zzeb zzebVar = this.zzj;
        if (zzebVar != null) {
            zzebVar.zze();
        }
        this.zzp = true;
    }

    @Override // com.google.android.gms.internal.ads.zzdz
    public final void zze(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            zzeb zzebVar = this.zzj;
            zzebVar.getClass();
            ShortBuffer shortBufferAsShortBuffer = byteBuffer.asShortBuffer();
            int iRemaining = byteBuffer.remaining();
            this.zzn += iRemaining;
            zzebVar.zzf(shortBufferAsShortBuffer);
            byteBuffer.position(byteBuffer.position() + iRemaining);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdz
    public final void zzf() {
        this.zzc = 1.0f;
        this.zzd = 1.0f;
        this.zze = zzdx.zza;
        zzdx zzdxVar = zzdx.zza;
        this.zzf = zzdxVar;
        this.zzg = zzdxVar;
        this.zzh = zzdxVar;
        ByteBuffer byteBuffer = zza;
        this.zzk = byteBuffer;
        this.zzl = byteBuffer.asShortBuffer();
        this.zzm = zza;
        this.zzb = -1;
        this.zzi = false;
        this.zzj = null;
        this.zzn = 0L;
        this.zzo = 0L;
        this.zzp = false;
    }

    @Override // com.google.android.gms.internal.ads.zzdz
    public final boolean zzg() {
        if (this.zzf.zzb == -1) {
            return false;
        }
        if (Math.abs(this.zzc - 1.0f) >= 1.0E-4f || Math.abs(this.zzd - 1.0f) >= 1.0E-4f) {
            return true;
        }
        return this.zzf.zzb != this.zze.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzdz
    public final boolean zzh() {
        if (!this.zzp) {
            return false;
        }
        zzeb zzebVar = this.zzj;
        return zzebVar == null || zzebVar.zza() == 0;
    }

    public final long zzi(long j) {
        long j2 = this.zzo;
        if (j2 < PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID) {
            return (long) (this.zzc * j);
        }
        long j3 = this.zzn;
        this.zzj.getClass();
        long jZzb = j3 - r3.zzb();
        int i = this.zzh.zzb;
        int i2 = this.zzg.zzb;
        return i == i2 ? zzgd.zzt(j, jZzb, j2, RoundingMode.FLOOR) : zzgd.zzt(j, jZzb * i, j2 * i2, RoundingMode.FLOOR);
    }

    public final void zzj(float f) {
        if (this.zzd != f) {
            this.zzd = f;
            this.zzi = true;
        }
    }

    public final void zzk(float f) {
        if (this.zzc != f) {
            this.zzc = f;
            this.zzi = true;
        }
    }
}
