package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzeul implements zzexw {
    private final Context zza;
    private final zzgge zzb;

    public zzeul(Context context, zzgge zzggeVar) {
        this.zza = context;
        this.zzb = zzggeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzexw
    public final int zza() {
        return 19;
    }

    @Override // com.google.android.gms.internal.ads.zzexw
    public final ListenableFuture zzb() {
        return this.zzb.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzeuk
            @Override // java.util.concurrent.Callable
            public final Object call() {
                String strZzj;
                String strZzk;
                String strZze;
                com.google.android.gms.ads.internal.zzu.zzp();
                zzbbm zzbbmVarZzg = com.google.android.gms.ads.internal.zzu.zzo().zzi().zzg();
                Bundle bundle = null;
                if (zzbbmVarZzg != null && (!com.google.android.gms.ads.internal.zzu.zzo().zzi().zzP() || !com.google.android.gms.ads.internal.zzu.zzo().zzi().zzQ())) {
                    if (zzbbmVarZzg.zzh()) {
                        zzbbmVarZzg.zzg();
                    }
                    zzbbc zzbbcVarZza = zzbbmVarZzg.zza();
                    if (zzbbcVarZza != null) {
                        strZzj = zzbbcVarZza.zzd();
                        strZze = zzbbcVarZza.zze();
                        strZzk = zzbbcVarZza.zzf();
                        if (strZzj != null) {
                            com.google.android.gms.ads.internal.zzu.zzo().zzi().zzx(strZzj);
                        }
                        if (strZzk != null) {
                            com.google.android.gms.ads.internal.zzu.zzo().zzi().zzz(strZzk);
                        }
                    } else {
                        strZzj = com.google.android.gms.ads.internal.zzu.zzo().zzi().zzj();
                        strZzk = com.google.android.gms.ads.internal.zzu.zzo().zzi().zzk();
                        strZze = null;
                    }
                    Bundle bundle2 = new Bundle(1);
                    if (!com.google.android.gms.ads.internal.zzu.zzo().zzi().zzQ()) {
                        if (strZzk == null || TextUtils.isEmpty(strZzk)) {
                            bundle2.putString("v_fp_vertical", "no_hash");
                        } else {
                            bundle2.putString("v_fp_vertical", strZzk);
                        }
                    }
                    if (strZzj != null && !com.google.android.gms.ads.internal.zzu.zzo().zzi().zzP()) {
                        bundle2.putString("fingerprint", strZzj);
                        if (!strZzj.equals(strZze)) {
                            bundle2.putString("v_fp", strZze);
                        }
                    }
                    if (!bundle2.isEmpty()) {
                        bundle = bundle2;
                    }
                }
                return new zzeum(bundle);
            }
        });
    }
}
