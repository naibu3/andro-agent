package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzfvg extends zzfve {
    private static zzfvg zzc;

    private zzfvg(Context context) {
        super(context, "paidv1_id", "paidv1_creation_time", "PaidV1LifecycleImpl");
    }

    public static final zzfvg zzj(Context context) {
        zzfvg zzfvgVar;
        synchronized (zzfvg.class) {
            if (zzc == null) {
                zzc = new zzfvg(context);
            }
            zzfvgVar = zzc;
        }
        return zzfvgVar;
    }

    public final zzfvd zzh(long j, boolean z) throws IOException {
        zzfvd zzfvdVarZzb;
        synchronized (zzfvg.class) {
            zzfvdVarZzb = zzb(null, null, j, z);
        }
        return zzfvdVarZzb;
    }

    public final zzfvd zzi(String str, String str2, long j, boolean z) throws IOException {
        zzfvd zzfvdVarZzb;
        synchronized (zzfvg.class) {
            zzfvdVarZzb = zzb(str, str2, j, z);
        }
        return zzfvdVarZzb;
    }

    public final void zzk() throws IOException {
        synchronized (zzfvg.class) {
            zzf(false);
        }
    }

    public final void zzl() throws IOException {
        synchronized (zzfvg.class) {
            zzf(true);
        }
    }
}
