package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Message;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzfy implements zzfa {
    private Message zza;
    private zzfz zzb;

    private zzfy() {
        throw null;
    }

    /* synthetic */ zzfy(zzfx zzfxVar) {
    }

    private final void zzd() {
        this.zza = null;
        this.zzb = null;
        zzfz.zzl(this);
    }

    public final zzfy zzb(Message message, zzfz zzfzVar) {
        this.zza = message;
        this.zzb = zzfzVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfa
    public final void zza() {
        Message message = this.zza;
        message.getClass();
        message.sendToTarget();
        zzd();
    }

    public final boolean zzc(Handler handler) {
        Message message = this.zza;
        message.getClass();
        boolean zSendMessageAtFrontOfQueue = handler.sendMessageAtFrontOfQueue(message);
        zzd();
        return zSendMessageAtFrontOfQueue;
    }
}
