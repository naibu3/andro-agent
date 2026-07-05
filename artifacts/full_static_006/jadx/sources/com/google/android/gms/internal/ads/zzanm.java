package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzanm implements zzalv {
    private final zzfu zza = new zzfu();
    private final zzanc zzb = new zzanc();

    @Override // com.google.android.gms.internal.ads.zzalv
    public final void zza(byte[] bArr, int i, int i2, zzalu zzaluVar, zzev zzevVar) throws zzch {
        this.zza.zzI(bArr, i2 + i);
        this.zza.zzK(i);
        ArrayList arrayList = new ArrayList();
        try {
            zzfu zzfuVar = this.zza;
            int iZzd = zzfuVar.zzd();
            String strZzy = zzfuVar.zzy(zzfxs.zzc);
            if (strZzy == null || !strZzy.startsWith("WEBVTT")) {
                zzfuVar.zzK(iZzd);
                throw zzch.zza("Expected WEBVTT. Got ".concat(String.valueOf(zzfuVar.zzy(zzfxs.zzc))), null);
            }
            while (!TextUtils.isEmpty(this.zza.zzy(zzfxs.zzc))) {
            }
            ArrayList arrayList2 = new ArrayList();
            while (true) {
                zzfu zzfuVar2 = this.zza;
                char c = 65535;
                int iZzd2 = 0;
                while (c == 65535) {
                    iZzd2 = zzfuVar2.zzd();
                    String strZzy2 = zzfuVar2.zzy(zzfxs.zzc);
                    c = strZzy2 == null ? (char) 0 : "STYLE".equals(strZzy2) ? (char) 2 : strZzy2.startsWith("NOTE") ? (char) 1 : (char) 3;
                }
                zzfuVar2.zzK(iZzd2);
                if (c == 0) {
                    zzalp.zza(new zzanp(arrayList2), zzaluVar, zzevVar);
                    return;
                }
                if (c == 1) {
                    while (!TextUtils.isEmpty(this.zza.zzy(zzfxs.zzc))) {
                    }
                } else if (c != 2) {
                    zzane zzaneVarZzc = zzanl.zzc(this.zza, arrayList);
                    if (zzaneVarZzc != null) {
                        arrayList2.add(zzaneVarZzc);
                    }
                } else {
                    if (!arrayList2.isEmpty()) {
                        throw new IllegalArgumentException("A style block was found after the first cue.");
                    }
                    this.zza.zzy(zzfxs.zzc);
                    arrayList.addAll(this.zzb.zzb(this.zza));
                }
            }
        } catch (zzch e) {
            throw new IllegalArgumentException(e);
        }
    }
}
