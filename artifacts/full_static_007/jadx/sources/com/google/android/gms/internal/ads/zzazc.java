package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzazc extends zzazs {
    private final zzaxw zzi;

    public zzazc(zzaye zzayeVar, String str, String str2, zzatp zzatpVar, int i, int i2, zzaxw zzaxwVar) {
        super(zzayeVar, "QcEEfK1PwFv2Eb+NZQ+4kWKAUUVvycYqoBzmAjBexJV/sKEjaFlajeD5MAZYWXy5", "361aY1ErIwpwsXwpamiiDSCpkl/IcdBM93dd8sW9a/Y=", zzatpVar, i, 94);
        this.zzi = zzaxwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzazs
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        int iIntValue = ((Integer) this.zzf.invoke(null, this.zzi.zza())).intValue();
        synchronized (this.zze) {
            this.zze.zzD(zzauh.zzb(iIntValue));
        }
    }
}
