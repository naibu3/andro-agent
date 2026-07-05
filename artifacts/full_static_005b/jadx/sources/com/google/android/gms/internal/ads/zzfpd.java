package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzfpd extends zzfpg {
    private static final zzfpd zzb = new zzfpd();

    private zzfpd() {
    }

    public static zzfpd zza() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfpg
    public final void zzb(boolean z) {
        Iterator it = zzfpe.zza().zzc().iterator();
        while (it.hasNext()) {
            ((zzfon) it.next()).zzg().zzk(z);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfpg
    public final boolean zzc() {
        Iterator it = zzfpe.zza().zzb().iterator();
        while (it.hasNext()) {
            View viewZzf = ((zzfon) it.next()).zzf();
            if (viewZzf != null && viewZzf.hasWindowFocus()) {
                return true;
            }
        }
        return false;
    }
}
