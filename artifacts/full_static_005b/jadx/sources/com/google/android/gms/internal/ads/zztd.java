package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zztd extends Handler {
    final /* synthetic */ zztf zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zztd(zztf zztfVar, Looper looper) {
        super(looper);
        this.zza = zztfVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) throws MediaCodec.CryptoException {
        zztf.zza(this.zza, message);
    }
}
