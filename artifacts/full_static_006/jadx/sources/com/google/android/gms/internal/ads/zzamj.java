package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.zip.Inflater;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzamj implements zzalv {
    private final zzfu zza = new zzfu();
    private final zzfu zzb = new zzfu();
    private final zzami zzc = new zzami();
    private Inflater zzd;

    @Override // com.google.android.gms.internal.ads.zzalv
    public final void zza(byte[] bArr, int i, int i2, zzalu zzaluVar, zzev zzevVar) {
        this.zza.zzI(bArr, i2 + i);
        this.zza.zzK(i);
        zzfu zzfuVar = this.zza;
        if (zzfuVar.zzb() > 0 && zzfuVar.zzf() == 120) {
            if (this.zzd == null) {
                this.zzd = new Inflater();
            }
            if (zzgd.zzI(zzfuVar, this.zzb, this.zzd)) {
                zzfu zzfuVar2 = this.zzb;
                zzfuVar.zzI(zzfuVar2.zzM(), zzfuVar2.zze());
            }
        }
        this.zzc.zze();
        ArrayList arrayList = new ArrayList();
        while (true) {
            zzfu zzfuVar3 = this.zza;
            if (zzfuVar3.zzb() < 3) {
                zzevVar.zza(new zzaln(arrayList, -9223372036854775807L, -9223372036854775807L));
                return;
            }
            zzami zzamiVar = this.zzc;
            int iZze = zzfuVar3.zze();
            int iZzm = zzfuVar3.zzm();
            int iZzq = zzfuVar3.zzq();
            int iZzd = zzfuVar3.zzd() + iZzq;
            zzei zzeiVar = null;
            if (iZzd > iZze) {
                zzfuVar3.zzK(iZze);
            } else {
                if (iZzm != 128) {
                    switch (iZzm) {
                        case 20:
                            zzami.zzd(zzamiVar, zzfuVar3, iZzq);
                            break;
                        case 21:
                            zzami.zzb(zzamiVar, zzfuVar3, iZzq);
                            break;
                        case 22:
                            zzami.zzc(zzamiVar, zzfuVar3, iZzq);
                            break;
                    }
                } else {
                    zzei zzeiVarZza = zzamiVar.zza();
                    zzamiVar.zze();
                    zzeiVar = zzeiVarZza;
                }
                zzfuVar3.zzK(iZzd);
            }
            if (zzeiVar != null) {
                arrayList.add(zzeiVar);
            }
        }
    }
}
