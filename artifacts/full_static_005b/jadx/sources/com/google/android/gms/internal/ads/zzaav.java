package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzaav implements zzdr {
    private static final zzfyw zza = zzfyz.zza(new zzfyw() { // from class: com.google.android.gms.internal.ads.zzaat
        @Override // com.google.android.gms.internal.ads.zzfyw
        public final Object zza() throws IllegalAccessException, InstantiationException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
            try {
                Class<?> cls = Class.forName("androidx.media3.effect.DefaultVideoFrameProcessor$Factory$Builder");
                Object objInvoke = cls.getMethod("build", new Class[0]).invoke(cls.getConstructor(new Class[0]).newInstance(new Object[0]), new Object[0]);
                if (objInvoke != null) {
                    return (zzdr) objInvoke;
                }
                throw null;
            } catch (Exception e) {
                throw new IllegalStateException(e);
            }
        }
    });

    private zzaav() {
        throw null;
    }

    /* synthetic */ zzaav(zzaau zzaauVar) {
    }
}
