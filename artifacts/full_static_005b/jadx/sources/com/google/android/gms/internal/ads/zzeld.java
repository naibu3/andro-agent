package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.MobileAds;
import java.util.LinkedHashMap;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzeld implements zzgfp {
    final /* synthetic */ long zza;
    final /* synthetic */ zzfgw zzb;
    final /* synthetic */ zzfgt zzc;
    final /* synthetic */ String zzd;
    final /* synthetic */ zzfoa zze;
    final /* synthetic */ zzfhf zzf;
    final /* synthetic */ zzelf zzg;

    zzeld(zzelf zzelfVar, long j, zzfgw zzfgwVar, zzfgt zzfgtVar, String str, zzfoa zzfoaVar, zzfhf zzfhfVar) {
        this.zza = j;
        this.zzb = zzfgwVar;
        this.zzc = zzfgtVar;
        this.zzd = str;
        this.zze = zzfoaVar;
        this.zzf = zzfhfVar;
        this.zzg = zzelfVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0061 A[PHI: r7
      0x0061: PHI (r7v1 int) = (r7v0 int), (r7v3 int), (r7v3 int), (r7v3 int) binds: [B:16:0x002f, B:21:0x004a, B:23:0x004e, B:25:0x0057] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0066 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzgfp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(Throwable th) {
        Integer numValueOf;
        int i;
        com.google.android.gms.ads.internal.client.zze zzeVarZzb;
        com.google.android.gms.ads.internal.client.zze zzeVar;
        long jElapsedRealtime = this.zzg.zza.elapsedRealtime() - this.zza;
        if (th instanceof TimeoutException) {
            i = 2;
        } else if (th instanceof zzekn) {
            i = 3;
        } else if (th instanceof CancellationException) {
            i = 4;
        } else {
            if (!(th instanceof zzfhv)) {
                if (th instanceof zzdzd) {
                    i = zzfiq.zza(th).zza == 3 ? 1 : 6;
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzbD)).booleanValue() && (th instanceof zzehp) && (zzeVarZzb = ((zzehp) th).zzb()) != null) {
                        numValueOf = Integer.valueOf(zzeVarZzb.zza);
                    }
                    i = i;
                } else {
                    numValueOf = null;
                    i = i;
                }
                synchronized (this.zzg) {
                    zzelf zzelfVar = this.zzg;
                    if (zzelfVar.zze) {
                        zzelfVar.zzb.zza(this.zzb, this.zzc, i, th instanceof zzehp ? (zzehp) th : null, jElapsedRealtime);
                    }
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zziu)).booleanValue()) {
                        zzfoe zzfoeVar = this.zzg.zzc;
                        zzfoa zzfoaVar = this.zze;
                        zzfhf zzfhfVar = this.zzf;
                        zzfgt zzfgtVar = this.zzc;
                        zzfoeVar.zzd(zzfoaVar.zzc(zzfhfVar, zzfgtVar, zzfgtVar.zzo));
                    }
                    zzelf zzelfVar2 = this.zzg;
                    if (zzelfVar2.zzg) {
                        return;
                    }
                    LinkedHashMap linkedHashMap = zzelfVar2.zzd;
                    zzfgt zzfgtVar2 = this.zzc;
                    linkedHashMap.put(zzfgtVar2, new zzele(this.zzd, zzfgtVar2.zzag, i, jElapsedRealtime, numValueOf));
                    com.google.android.gms.ads.internal.client.zze zzeVarZza = zzfiq.zza(th);
                    int i2 = zzeVarZza.zza;
                    if ((i2 == 3 || i2 == 0) && (zzeVar = zzeVarZza.zzd) != null && !zzeVar.zzc.equals(MobileAds.ERROR_DOMAIN)) {
                        zzeVarZza = zzfiq.zza(new zzehp(13, zzeVarZza.zzd));
                    }
                    this.zzg.zzf.zzf(this.zzc, jElapsedRealtime, zzeVarZza);
                    return;
                }
            }
            i = 5;
        }
        numValueOf = null;
        synchronized (this.zzg) {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgfp
    public final void zzb(Object obj) {
        long jElapsedRealtime = this.zzg.zza.elapsedRealtime() - this.zza;
        synchronized (this.zzg) {
            zzelf zzelfVar = this.zzg;
            if (zzelfVar.zze) {
                zzelfVar.zzb.zza(this.zzb, this.zzc, 0, null, jElapsedRealtime);
            }
            zzelf zzelfVar2 = this.zzg;
            if (zzelfVar2.zzg) {
                return;
            }
            if (zzelfVar2.zzq(this.zzc)) {
                ((zzele) this.zzg.zzd.get(this.zzc)).zzd = jElapsedRealtime;
            } else {
                LinkedHashMap linkedHashMap = this.zzg.zzd;
                zzfgt zzfgtVar = this.zzc;
                linkedHashMap.put(zzfgtVar, new zzele(this.zzd, zzfgtVar.zzag, 0, jElapsedRealtime, null));
            }
            this.zzg.zzf.zzg(this.zzc, jElapsedRealtime, null);
        }
    }
}
