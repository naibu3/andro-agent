package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzazd extends zzazs {
    private final zzaxh zzi;
    private final long zzj;
    private final long zzk;

    public zzazd(zzaye zzayeVar, String str, String str2, zzatp zzatpVar, int i, int i2, zzaxh zzaxhVar, long j, long j2) {
        super(zzayeVar, "gAg/p/cQzJRjYz9LhE8cRk72DVV1Cpozf/TbzvACqLcTgM3sRjMEb3DCmwYhMmhP", "avDZD6/xoSbFYvWCy23XLncB75oD5DxKdrTKFY2O0hY=", zzatpVar, i, 11);
        this.zzi = zzaxhVar;
        this.zzj = j;
        this.zzk = j2;
    }

    @Override // com.google.android.gms.internal.ads.zzazs
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        zzaxh zzaxhVar = this.zzi;
        if (zzaxhVar != null) {
            zzaxf zzaxfVar = new zzaxf((String) this.zzf.invoke(null, zzaxhVar.zzb(), Long.valueOf(this.zzj), Long.valueOf(this.zzk)));
            synchronized (this.zze) {
                this.zze.zzE(zzaxfVar.zza.longValue());
                if (zzaxfVar.zzb.longValue() >= 0) {
                    this.zze.zzW(zzaxfVar.zzb.longValue());
                }
                if (zzaxfVar.zzc.longValue() >= 0) {
                    this.zze.zzg(zzaxfVar.zzc.longValue());
                }
            }
        }
    }
}
