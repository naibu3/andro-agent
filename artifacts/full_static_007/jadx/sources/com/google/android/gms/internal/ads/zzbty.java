package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.content.Intent;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzbty implements DialogInterface.OnClickListener {
    final /* synthetic */ zzbua zza;

    zzbty(zzbua zzbuaVar) {
        this.zza = zzbuaVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        zzbua zzbuaVar = this.zza;
        Intent intentZzb = zzbuaVar.zzb();
        com.google.android.gms.ads.internal.zzu.zzp();
        com.google.android.gms.ads.internal.util.zzt.zzT(zzbuaVar.zzb, intentZzb);
    }
}
