package com.google.android.gms.ads.internal.util;

import android.content.Context;
import com.google.android.gms.internal.ads.zzara;
import com.google.android.gms.internal.ads.zzare;
import com.google.android.gms.internal.ads.zzarh;
import com.google.android.gms.internal.ads.zzarn;
import com.google.android.gms.internal.ads.zzars;
import com.google.android.gms.internal.ads.zzart;
import com.google.android.gms.internal.ads.zzasa;
import com.google.android.gms.internal.ads.zzasf;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzbnm;
import com.google.android.gms.internal.ads.zzftu;
import com.google.android.gms.internal.ads.zzftv;
import java.io.File;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes.dex */
public final class zzaz extends zzart {
    private final Context zzc;

    private zzaz(Context context, zzars zzarsVar) {
        super(zzarsVar);
        this.zzc = context;
    }

    public static zzarh zzb(Context context) {
        zzarh zzarhVar = new zzarh(new zzasa(new File(zzftv.zza(zzftu.zza(), context.getCacheDir(), "admob_volley")), 20971520), new zzaz(context, new zzasf(null, null)), 4);
        zzarhVar.zzd();
        return zzarhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzart, com.google.android.gms.internal.ads.zzaqx
    public final zzara zza(zzare zzareVar) throws zzarn {
        if (zzareVar.zza() == 0) {
            if (Pattern.matches((String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzex), zzareVar.zzk())) {
                Context context = this.zzc;
                com.google.android.gms.ads.internal.client.zzay.zzb();
                if (com.google.android.gms.ads.internal.util.client.zzf.zzt(context, 13400000)) {
                    zzara zzaraVarZza = new zzbnm(this.zzc).zza(zzareVar);
                    if (zzaraVarZza != null) {
                        zze.zza("Got gmscore asset response: ".concat(String.valueOf(zzareVar.zzk())));
                        return zzaraVarZza;
                    }
                    zze.zza("Failed to get gmscore asset response: ".concat(String.valueOf(zzareVar.zzk())));
                }
            }
        }
        return super.zza(zzareVar);
    }
}
