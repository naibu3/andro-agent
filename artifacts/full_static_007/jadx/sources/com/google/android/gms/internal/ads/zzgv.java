package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public abstract class zzgv implements zzhb {
    private final boolean zza;
    private final ArrayList zzb = new ArrayList(1);
    private int zzc;
    private zzhh zzd;

    protected zzgv(boolean z) {
        this.zza = z;
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    public /* synthetic */ Map zze() {
        return Collections.emptyMap();
    }

    protected final void zzg(int i) {
        zzhh zzhhVar = this.zzd;
        int i2 = zzgd.zza;
        for (int i3 = 0; i3 < this.zzc; i3++) {
            ((zzie) this.zzb.get(i3)).zza(this, zzhhVar, this.zza, i);
        }
    }

    protected final void zzh() {
        zzhh zzhhVar = this.zzd;
        int i = zzgd.zza;
        for (int i2 = 0; i2 < this.zzc; i2++) {
            ((zzie) this.zzb.get(i2)).zzb(this, zzhhVar, this.zza);
        }
        this.zzd = null;
    }

    protected final void zzi(zzhh zzhhVar) {
        for (int i = 0; i < this.zzc; i++) {
            ((zzie) this.zzb.get(i)).zzc(this, zzhhVar, this.zza);
        }
    }

    protected final void zzj(zzhh zzhhVar) {
        this.zzd = zzhhVar;
        for (int i = 0; i < this.zzc; i++) {
            ((zzie) this.zzb.get(i)).zzd(this, zzhhVar, this.zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    public final void zzf(zzie zzieVar) {
        zzieVar.getClass();
        if (this.zzb.contains(zzieVar)) {
            return;
        }
        this.zzb.add(zzieVar);
        this.zzc++;
    }
}
