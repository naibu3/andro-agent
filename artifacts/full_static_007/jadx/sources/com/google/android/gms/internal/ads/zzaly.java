package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzaly implements zzafa {
    private final zzafa zza;
    private final zzalt zzb;
    private zzalv zzh;
    private zzan zzi;
    private final zzalm zzc = new zzalm();
    private int zze = 0;
    private int zzf = 0;
    private byte[] zzg = zzgd.zzf;
    private final zzfu zzd = new zzfu();

    public zzaly(zzafa zzafaVar, zzalt zzaltVar) {
        this.zza = zzafaVar;
        this.zzb = zzaltVar;
    }

    private final void zzb(int i) {
        int length = this.zzg.length;
        int i2 = this.zzf;
        if (length - i2 >= i) {
            return;
        }
        int i3 = i2 - this.zze;
        int iMax = Math.max(i3 + i3, i + i3);
        byte[] bArr = this.zzg;
        byte[] bArr2 = iMax <= bArr.length ? bArr : new byte[iMax];
        System.arraycopy(bArr, this.zze, bArr2, 0, i3);
        this.zze = 0;
        this.zzf = i3;
        this.zzg = bArr2;
    }

    final /* synthetic */ void zza(long j, int i, zzaln zzalnVar) {
        zzeq.zzb(this.zzi);
        zzgbc zzgbcVar = zzalnVar.zza;
        long j2 = zzalnVar.zzc;
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(zzgbcVar.size());
        Iterator<E> it = zzgbcVar.iterator();
        while (it.hasNext()) {
            arrayList.add(((zzei) it.next()).zza());
        }
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("c", arrayList);
        bundle.putLong("d", j2);
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeBundle(bundle);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        zzfu zzfuVar = this.zzd;
        int length = bArrMarshall.length;
        zzfuVar.zzI(bArrMarshall, length);
        this.zza.zzq(this.zzd, length);
        long j3 = zzalnVar.zzb;
        if (j3 == -9223372036854775807L) {
            zzeq.zzf(this.zzi.zzr == Long.MAX_VALUE);
        } else {
            long j4 = this.zzi.zzr;
            j = j4 == Long.MAX_VALUE ? j + j3 : j3 + j4;
        }
        this.zza.zzs(j, i, length, 0, null);
    }

    @Override // com.google.android.gms.internal.ads.zzafa
    public final /* synthetic */ int zzf(zzu zzuVar, int i, boolean z) {
        return zzaey.zza(this, zzuVar, i, z);
    }

    @Override // com.google.android.gms.internal.ads.zzafa
    public final int zzg(zzu zzuVar, int i, boolean z, int i2) throws IOException {
        if (this.zzh == null) {
            return this.zza.zzg(zzuVar, i, z, 0);
        }
        zzb(i);
        int iZza = zzuVar.zza(this.zzg, this.zzf, i);
        if (iZza != -1) {
            this.zzf += iZza;
            return iZza;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // com.google.android.gms.internal.ads.zzafa
    public final void zzl(zzan zzanVar) {
        String str = zzanVar.zzn;
        str.getClass();
        zzeq.zzd(zzcg.zzb(str) == 3);
        if (!zzanVar.equals(this.zzi)) {
            this.zzi = zzanVar;
            this.zzh = this.zzb.zzc(zzanVar) ? this.zzb.zzb(zzanVar) : null;
        }
        if (this.zzh == null) {
            this.zza.zzl(zzanVar);
            return;
        }
        zzafa zzafaVar = this.zza;
        zzal zzalVarZzb = zzanVar.zzb();
        zzalVarZzb.zzX("application/x-media3-cues");
        zzalVarZzb.zzz(zzanVar.zzn);
        zzalVarZzb.zzab(Long.MAX_VALUE);
        zzalVarZzb.zzD(this.zzb.zza(zzanVar));
        zzafaVar.zzl(zzalVarZzb.zzad());
    }

    @Override // com.google.android.gms.internal.ads.zzafa
    public final /* synthetic */ void zzq(zzfu zzfuVar, int i) {
        zzaey.zzb(this, zzfuVar, i);
    }

    @Override // com.google.android.gms.internal.ads.zzafa
    public final void zzr(zzfu zzfuVar, int i, int i2) {
        if (this.zzh == null) {
            this.zza.zzr(zzfuVar, i, i2);
            return;
        }
        zzb(i);
        zzfuVar.zzG(this.zzg, this.zzf, i);
        this.zzf += i;
    }

    @Override // com.google.android.gms.internal.ads.zzafa
    public final void zzs(final long j, final int i, int i2, int i3, zzaez zzaezVar) {
        if (this.zzh == null) {
            this.zza.zzs(j, i, i2, i3, zzaezVar);
            return;
        }
        zzeq.zze(zzaezVar == null, "DRM on subtitles is not supported");
        int i4 = (this.zzf - i3) - i2;
        this.zzh.zza(this.zzg, i4, i2, zzalu.zza(), new zzev() { // from class: com.google.android.gms.internal.ads.zzalx
            @Override // com.google.android.gms.internal.ads.zzev
            public final void zza(Object obj) {
                this.zza.zza(j, i, (zzaln) obj);
            }
        });
        int i5 = i4 + i2;
        this.zze = i5;
        if (i5 == this.zzf) {
            this.zze = 0;
            this.zzf = 0;
        }
    }
}
