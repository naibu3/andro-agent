package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzanb implements zzalv {
    private final zzfu zza = new zzfu();

    @Override // com.google.android.gms.internal.ads.zzalv
    public final void zza(byte[] bArr, int i, int i2, zzalu zzaluVar, zzev zzevVar) {
        zzei zzeiVarZzp;
        this.zza.zzI(bArr, i2 + i);
        this.zza.zzK(i);
        ArrayList arrayList = new ArrayList();
        while (true) {
            zzfu zzfuVar = this.zza;
            if (zzfuVar.zzb() <= 0) {
                zzevVar.zza(new zzaln(arrayList, -9223372036854775807L, -9223372036854775807L));
                return;
            }
            zzeq.zze(zzfuVar.zzb() >= 8, "Incomplete Mp4Webvtt Top Level box header found.");
            zzfu zzfuVar2 = this.zza;
            int iZzg = zzfuVar2.zzg() - 8;
            if (zzfuVar2.zzg() == 1987343459) {
                zzfu zzfuVar3 = this.zza;
                CharSequence charSequenceZza = null;
                zzeg zzegVarZzb = null;
                while (iZzg > 0) {
                    zzeq.zze(iZzg >= 8, "Incomplete vtt cue box header found.");
                    int iZzg2 = zzfuVar3.zzg();
                    int iZzg3 = zzfuVar3.zzg();
                    int i3 = iZzg - 8;
                    int i4 = iZzg2 - 8;
                    String strZzB = zzgd.zzB(zzfuVar3.zzM(), zzfuVar3.zzd(), i4);
                    zzfuVar3.zzL(i4);
                    if (iZzg3 == 1937011815) {
                        zzegVarZzb = zzanl.zzb(strZzB);
                    } else if (iZzg3 == 1885436268) {
                        charSequenceZza = zzanl.zza(null, strZzB.trim(), Collections.emptyList());
                    }
                    iZzg = i3 - i4;
                }
                if (charSequenceZza == null) {
                    charSequenceZza = "";
                }
                if (zzegVarZzb != null) {
                    zzegVarZzb.zzl(charSequenceZza);
                    zzeiVarZzp = zzegVarZzb.zzp();
                } else {
                    zzank zzankVar = new zzank();
                    zzankVar.zzc = charSequenceZza;
                    zzeiVarZzp = zzankVar.zza().zzp();
                }
                arrayList.add(zzeiVarZzp);
            } else {
                this.zza.zzL(iZzg);
            }
        }
    }
}
