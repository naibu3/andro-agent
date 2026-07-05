package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.2.0 */
/* loaded from: classes2.dex */
final class zzhes extends zzheq {
    zzhes() {
    }

    @Override // com.google.android.gms.internal.ads.zzheq
    final /* synthetic */ int zza(Object obj) {
        return ((zzher) obj).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzheq
    final /* synthetic */ int zzb(Object obj) {
        return ((zzher) obj).zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzheq
    final /* bridge */ /* synthetic */ Object zzc(Object obj) {
        zzhbo zzhboVar = (zzhbo) obj;
        zzher zzherVar = zzhboVar.zzt;
        if (zzherVar != zzher.zzc()) {
            return zzherVar;
        }
        zzher zzherVarZzf = zzher.zzf();
        zzhboVar.zzt = zzherVarZzf;
        return zzherVarZzf;
    }

    @Override // com.google.android.gms.internal.ads.zzheq
    final /* synthetic */ Object zzd(Object obj) {
        return ((zzhbo) obj).zzt;
    }

    @Override // com.google.android.gms.internal.ads.zzheq
    final /* bridge */ /* synthetic */ Object zze(Object obj, Object obj2) {
        if (zzher.zzc().equals(obj2)) {
            return obj;
        }
        if (zzher.zzc().equals(obj)) {
            return zzher.zze((zzher) obj, (zzher) obj2);
        }
        ((zzher) obj).zzd((zzher) obj2);
        return obj;
    }

    @Override // com.google.android.gms.internal.ads.zzheq
    final /* synthetic */ Object zzf() {
        return zzher.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzheq
    final /* synthetic */ Object zzg(Object obj) {
        ((zzher) obj).zzh();
        return obj;
    }

    @Override // com.google.android.gms.internal.ads.zzheq
    final /* bridge */ /* synthetic */ void zzh(Object obj, int i, int i2) {
        ((zzher) obj).zzj((i << 3) | 5, Integer.valueOf(i2));
    }

    @Override // com.google.android.gms.internal.ads.zzheq
    final /* bridge */ /* synthetic */ void zzi(Object obj, int i, long j) {
        ((zzher) obj).zzj((i << 3) | 1, Long.valueOf(j));
    }

    @Override // com.google.android.gms.internal.ads.zzheq
    final /* bridge */ /* synthetic */ void zzj(Object obj, int i, Object obj2) {
        ((zzher) obj).zzj((i << 3) | 3, obj2);
    }

    @Override // com.google.android.gms.internal.ads.zzheq
    final /* bridge */ /* synthetic */ void zzk(Object obj, int i, zzhac zzhacVar) {
        ((zzher) obj).zzj((i << 3) | 2, zzhacVar);
    }

    @Override // com.google.android.gms.internal.ads.zzheq
    final /* bridge */ /* synthetic */ void zzl(Object obj, int i, long j) {
        ((zzher) obj).zzj(i << 3, Long.valueOf(j));
    }

    @Override // com.google.android.gms.internal.ads.zzheq
    final void zzm(Object obj) {
        ((zzhbo) obj).zzt.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzheq
    final /* synthetic */ void zzn(Object obj, Object obj2) {
        ((zzhbo) obj).zzt = (zzher) obj2;
    }

    @Override // com.google.android.gms.internal.ads.zzheq
    final /* synthetic */ void zzo(Object obj, Object obj2) {
        ((zzhbo) obj).zzt = (zzher) obj2;
    }

    @Override // com.google.android.gms.internal.ads.zzheq
    final /* synthetic */ void zzp(Object obj, zzhfi zzhfiVar) throws IOException {
        ((zzher) obj).zzk(zzhfiVar);
    }

    @Override // com.google.android.gms.internal.ads.zzheq
    final /* synthetic */ void zzq(Object obj, zzhfi zzhfiVar) throws IOException {
        ((zzher) obj).zzl(zzhfiVar);
    }

    @Override // com.google.android.gms.internal.ads.zzheq
    final boolean zzs(zzhdr zzhdrVar) {
        return false;
    }
}
