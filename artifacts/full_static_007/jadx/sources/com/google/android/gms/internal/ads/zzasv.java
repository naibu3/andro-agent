package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzasv extends zzhjw {
    ByteBuffer zza;

    public zzasv(String str) {
        super(str);
    }

    @Override // com.google.android.gms.internal.ads.zzhjw
    public final void zzf(ByteBuffer byteBuffer) {
        this.zza = byteBuffer;
        byteBuffer.position(byteBuffer.position() + byteBuffer.remaining());
    }
}
