package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzazh extends zzazs {
    public zzazh(zzaye zzayeVar, String str, String str2, zzatp zzatpVar, int i, int i2) {
        super(zzayeVar, "0njjbCFUq6vJ1UgnErUI7KEtLgZLN7V9IJ5yZ3QtzXmjMaTjzKInpeDNakYTgh0P", "C8NIMy/t/HZjKrbJt0Xe/Cv+czK1jvEhHHQsIVfXSJE=", zzatpVar, i, 73);
    }

    @Override // com.google.android.gms.internal.ads.zzazs
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        try {
            this.zze.zzI(((Boolean) this.zzf.invoke(null, this.zzb.zzb())).booleanValue() ? zzavc.ENUM_TRUE : zzavc.ENUM_FALSE);
        } catch (InvocationTargetException unused) {
            this.zze.zzI(zzavc.ENUM_FAILURE);
        }
    }
}
