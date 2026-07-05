package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzym extends zzza implements Comparable {
    private final int zze;
    private final int zzf;

    public zzym(int i, zzde zzdeVar, int i2, zzys zzysVar, int i3) {
        super(i, zzdeVar, i2);
        this.zze = zzze.zzo(i3, zzysVar.zzT) ? 1 : 0;
        this.zzf = this.zzd.zza();
    }

    @Override // java.lang.Comparable
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final int compareTo(zzym zzymVar) {
        return Integer.compare(this.zzf, zzymVar.zzf);
    }

    @Override // com.google.android.gms.internal.ads.zzza
    public final int zzb() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzza
    public final /* bridge */ /* synthetic */ boolean zzc(zzza zzzaVar) {
        return false;
    }
}
