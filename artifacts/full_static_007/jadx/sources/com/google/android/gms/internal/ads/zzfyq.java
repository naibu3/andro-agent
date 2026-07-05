package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.2.0 */
/* loaded from: classes2.dex */
final class zzfyq implements Iterable {
    final /* synthetic */ CharSequence zza;
    final /* synthetic */ zzfyt zzb;

    zzfyq(zzfyt zzfytVar, CharSequence charSequence) {
        this.zza = charSequence;
        this.zzb = zzfytVar;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.zzb.zzg(this.zza);
    }

    public final String toString() throws IOException {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        zzfxv.zzb(sb, this, ", ");
        sb.append(']');
        return sb.toString();
    }
}
