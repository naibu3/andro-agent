package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzaaw implements zzcu {
    private final zzdr zza;

    public zzaaw(zzdr zzdrVar) {
        this.zza = zzdrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcu
    public final zzcv zza(Context context, zzt zztVar, zzw zzwVar, zzdt zzdtVar, Executor executor, List list, long j) throws zzdq {
        try {
            try {
                return ((zzcu) Class.forName("androidx.media3.effect.PreviewingSingleInputVideoGraph$Factory").getConstructor(zzdr.class).newInstance(this.zza)).zza(context, zztVar, zzwVar, zzdtVar, executor, list, 0L);
            } catch (Exception e) {
                e = e;
                if (e instanceof zzdq) {
                    throw ((zzdq) e);
                }
                throw new zzdq(e, -9223372036854775807L);
            }
        } catch (Exception e2) {
            e = e2;
        }
    }
}
