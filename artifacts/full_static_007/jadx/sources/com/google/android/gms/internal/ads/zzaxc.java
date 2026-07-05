package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzaxc extends zzaxb {
    protected zzaxc(Context context, String str, boolean z) {
        super(context, str, z);
    }

    public static zzaxc zzt(String str, Context context, boolean z) {
        zzr(context, false);
        return new zzaxc(context, str, false);
    }

    @Deprecated
    public static zzaxc zzu(String str, Context context, boolean z, int i) {
        zzr(context, z);
        return new zzaxc(context, str, z);
    }

    @Override // com.google.android.gms.internal.ads.zzaxb
    protected final List zzp(zzaye zzayeVar, Context context, zzatp zzatpVar, zzatg zzatgVar) {
        if (zzayeVar.zzk() == null || !this.zzu) {
            return super.zzp(zzayeVar, context, zzatpVar, null);
        }
        int iZza = zzayeVar.zza();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(super.zzp(zzayeVar, context, zzatpVar, null));
        arrayList.add(new zzayw(zzayeVar, "FLgp79R6LGLnWDio6G1XBjsjORgKSjLkdakyn5bigQludVyQtVZMhDAlppvakfKf", "oPDFFWKd1EuWWR8iem/Fb2LK/5grpy+LhaDBlMcgIHs=", zzatpVar, iZza, 24));
        return arrayList;
    }
}
