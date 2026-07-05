package com.google.android.gms.ads.internal;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.zzbwx;
import com.google.android.gms.internal.ads.zzcaf;
import java.util.Collections;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzb {
    private final Context zza;
    private boolean zzb;
    private final zzcaf zzc;
    private final zzbwx zzd = new zzbwx(false, Collections.emptyList());

    public zzb(Context context, zzcaf zzcafVar, zzbwx zzbwxVar) {
        this.zza = context;
        this.zzc = zzcafVar;
    }

    private final boolean zzd() {
        zzcaf zzcafVar = this.zzc;
        return (zzcafVar != null && zzcafVar.zza().zzf) || this.zzd.zza;
    }

    public final void zza() {
        this.zzb = true;
    }

    public final void zzb(String str) {
        List<String> list;
        if (zzd()) {
            if (str == null) {
                str = "";
            }
            zzcaf zzcafVar = this.zzc;
            if (zzcafVar != null) {
                zzcafVar.zzd(str, null, 3);
                return;
            }
            zzbwx zzbwxVar = this.zzd;
            if (!zzbwxVar.zza || (list = zzbwxVar.zzb) == null) {
                return;
            }
            for (String str2 : list) {
                if (!TextUtils.isEmpty(str2)) {
                    String strReplace = str2.replace("{NAVIGATION_URL}", Uri.encode(str));
                    Context context = this.zza;
                    zzu.zzp();
                    com.google.android.gms.ads.internal.util.zzt.zzL(context, "", strReplace);
                }
            }
        }
    }

    public final boolean zzc() {
        return !zzd() || this.zzb;
    }
}
