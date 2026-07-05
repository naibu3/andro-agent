package com.google.android.gms.internal.ads;

import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzbuc implements View.OnClickListener {
    final /* synthetic */ zzbud zza;

    zzbuc(zzbud zzbudVar) {
        this.zza = zzbudVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.zza.zza(true);
    }
}
