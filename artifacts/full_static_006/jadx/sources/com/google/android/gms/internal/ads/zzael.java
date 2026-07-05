package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzael {
    private final zzfu zza = new zzfu(10);

    public final zzcd zza(zzadv zzadvVar, zzaho zzahoVar) throws IOException {
        zzcd zzcdVarZza = null;
        int i = 0;
        while (true) {
            try {
                ((zzadi) zzadvVar).zzm(this.zza.zzM(), 0, 10, false);
                this.zza.zzK(0);
                if (this.zza.zzo() != 4801587) {
                    break;
                }
                this.zza.zzL(3);
                int iZzl = this.zza.zzl();
                int i2 = iZzl + 10;
                if (zzcdVarZza == null) {
                    byte[] bArr = new byte[i2];
                    System.arraycopy(this.zza.zzM(), 0, bArr, 0, 10);
                    ((zzadi) zzadvVar).zzm(bArr, 10, iZzl, false);
                    zzcdVarZza = zzahq.zza(bArr, i2, zzahoVar, new zzagr());
                } else {
                    ((zzadi) zzadvVar).zzl(iZzl, false);
                }
                i += i2;
            } catch (EOFException unused) {
            }
        }
        zzadvVar.zzj();
        ((zzadi) zzadvVar).zzl(i, false);
        return zzcdVarZza;
    }
}
