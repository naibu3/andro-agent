package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public class zzgfk extends zzgfu {
    zzgfk() {
    }

    public static zzgfk zzu(ListenableFuture listenableFuture) {
        return listenableFuture instanceof zzgfk ? (zzgfk) listenableFuture : new zzgfl(listenableFuture);
    }
}
