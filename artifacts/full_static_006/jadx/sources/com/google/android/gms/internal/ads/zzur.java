package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzur implements zzxf {
    public final zzxf zza;
    final /* synthetic */ zzus zzb;
    private boolean zzc;

    public zzur(zzus zzusVar, zzxf zzxfVar) {
        this.zzb = zzusVar;
        this.zza = zzxfVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003b  */
    @Override // com.google.android.gms.internal.ads.zzxf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zza(zzlj zzljVar, zzin zzinVar, int i) {
        zzus zzusVar = this.zzb;
        if (zzusVar.zzq()) {
            return -3;
        }
        if (this.zzc) {
            zzinVar.zzc(4);
            return -4;
        }
        long jZzb = zzusVar.zzb();
        int iZza = this.zza.zza(zzljVar, zzinVar, i);
        if (iZza != -5) {
            long j = this.zzb.zzb;
            if (j == Long.MIN_VALUE || ((iZza != -4 || zzinVar.zze < j) && !(iZza == -3 && jZzb == Long.MIN_VALUE && !zzinVar.zzd))) {
                return iZza;
            }
            zzinVar.zzb();
            zzinVar.zzc(4);
            this.zzc = true;
            return -4;
        }
        zzan zzanVar = zzljVar.zza;
        zzanVar.getClass();
        int i2 = zzanVar.zzD;
        if (i2 != 0) {
            int i3 = this.zzb.zzb == Long.MIN_VALUE ? zzanVar.zzE : 0;
            zzal zzalVarZzb = zzanVar.zzb();
            zzalVarZzb.zzF(i2);
            zzalVarZzb.zzG(i3);
            zzljVar.zza = zzalVarZzb.zzad();
        } else if (zzanVar.zzE != 0) {
            i2 = 0;
            if (this.zzb.zzb == Long.MIN_VALUE) {
            }
            zzal zzalVarZzb2 = zzanVar.zzb();
            zzalVarZzb2.zzF(i2);
            zzalVarZzb2.zzG(i3);
            zzljVar.zza = zzalVarZzb2.zzad();
        }
        return -5;
    }

    @Override // com.google.android.gms.internal.ads.zzxf
    public final int zzb(long j) {
        if (this.zzb.zzq()) {
            return -3;
        }
        return this.zza.zzb(j);
    }

    public final void zzc() {
        this.zzc = false;
    }

    @Override // com.google.android.gms.internal.ads.zzxf
    public final void zzd() throws IOException {
        this.zza.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzxf
    public final boolean zze() {
        return !this.zzb.zzq() && this.zza.zze();
    }
}
