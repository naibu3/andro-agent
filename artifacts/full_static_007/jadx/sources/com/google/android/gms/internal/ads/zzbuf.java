package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import org.json.JSONException;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzbuf implements DialogInterface.OnClickListener {
    final /* synthetic */ zzbug zza;

    zzbuf(zzbug zzbugVar) {
        this.zza = zzbugVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) throws JSONException {
        this.zza.zzh("User canceled the download.");
    }
}
