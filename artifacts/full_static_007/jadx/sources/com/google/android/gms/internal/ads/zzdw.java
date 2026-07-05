package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzdw {
    private final zzgbc zza;
    private final List zzb = new ArrayList();
    private ByteBuffer[] zzc = new ByteBuffer[0];
    private zzdx zzd = zzdx.zza;
    private zzdx zze = zzdx.zza;
    private boolean zzf = false;

    public zzdw(zzgbc zzgbcVar) {
        this.zza = zzgbcVar;
    }

    private final int zzi() {
        return this.zzc.length - 1;
    }

    private final void zzj(ByteBuffer byteBuffer) {
        boolean z;
        do {
            int i = 0;
            z = false;
            while (i <= zzi()) {
                if (!this.zzc[i].hasRemaining()) {
                    zzdz zzdzVar = (zzdz) this.zzb.get(i);
                    if (!zzdzVar.zzh()) {
                        ByteBuffer byteBuffer2 = i > 0 ? this.zzc[i - 1] : byteBuffer.hasRemaining() ? byteBuffer : zzdz.zza;
                        long jRemaining = byteBuffer2.remaining();
                        zzdzVar.zze(byteBuffer2);
                        this.zzc[i] = zzdzVar.zzb();
                        long jRemaining2 = jRemaining - byteBuffer2.remaining();
                        boolean z2 = true;
                        if (jRemaining2 <= 0 && !this.zzc[i].hasRemaining()) {
                            z2 = false;
                        }
                        z |= z2;
                    } else if (!this.zzc[i].hasRemaining() && i < zzi()) {
                        ((zzdz) this.zzb.get(i + 1)).zzd();
                    }
                }
                i++;
            }
        } while (z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzdw)) {
            return false;
        }
        zzdw zzdwVar = (zzdw) obj;
        if (this.zza.size() != zzdwVar.zza.size()) {
            return false;
        }
        for (int i = 0; i < this.zza.size(); i++) {
            if (this.zza.get(i) != zzdwVar.zza.get(i)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final zzdx zza(zzdx zzdxVar) throws zzdy {
        if (zzdxVar.equals(zzdx.zza)) {
            throw new zzdy("Unhandled input format:", zzdxVar);
        }
        for (int i = 0; i < this.zza.size(); i++) {
            zzdz zzdzVar = (zzdz) this.zza.get(i);
            zzdx zzdxVarZza = zzdzVar.zza(zzdxVar);
            if (zzdzVar.zzg()) {
                zzeq.zzf(!zzdxVarZza.equals(zzdx.zza));
                zzdxVar = zzdxVarZza;
            }
        }
        this.zze = zzdxVar;
        return zzdxVar;
    }

    public final ByteBuffer zzb() {
        if (!zzh()) {
            return zzdz.zza;
        }
        ByteBuffer byteBuffer = this.zzc[zzi()];
        if (byteBuffer.hasRemaining()) {
            return byteBuffer;
        }
        zzj(zzdz.zza);
        return this.zzc[zzi()];
    }

    public final void zzc() {
        this.zzb.clear();
        this.zzd = this.zze;
        this.zzf = false;
        for (int i = 0; i < this.zza.size(); i++) {
            zzdz zzdzVar = (zzdz) this.zza.get(i);
            zzdzVar.zzc();
            if (zzdzVar.zzg()) {
                this.zzb.add(zzdzVar);
            }
        }
        this.zzc = new ByteBuffer[this.zzb.size()];
        for (int i2 = 0; i2 <= zzi(); i2++) {
            this.zzc[i2] = ((zzdz) this.zzb.get(i2)).zzb();
        }
    }

    public final void zzd() {
        if (!zzh() || this.zzf) {
            return;
        }
        this.zzf = true;
        ((zzdz) this.zzb.get(0)).zzd();
    }

    public final void zze(ByteBuffer byteBuffer) {
        if (!zzh() || this.zzf) {
            return;
        }
        zzj(byteBuffer);
    }

    public final void zzf() {
        for (int i = 0; i < this.zza.size(); i++) {
            zzdz zzdzVar = (zzdz) this.zza.get(i);
            zzdzVar.zzc();
            zzdzVar.zzf();
        }
        this.zzc = new ByteBuffer[0];
        this.zzd = zzdx.zza;
        this.zze = zzdx.zza;
        this.zzf = false;
    }

    public final boolean zzg() {
        return this.zzf && ((zzdz) this.zzb.get(zzi())).zzh() && !this.zzc[zzi()].hasRemaining();
    }

    public final boolean zzh() {
        return !this.zzb.isEmpty();
    }
}
