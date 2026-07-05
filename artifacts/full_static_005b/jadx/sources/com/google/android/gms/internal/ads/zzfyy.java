package com.google.android.gms.internal.ads;

import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.2.0 */
/* loaded from: classes2.dex */
final class zzfyy implements zzfyw {
    private static final zzfyw zza = new zzfyw() { // from class: com.google.android.gms.internal.ads.zzfyx
        @Override // com.google.android.gms.internal.ads.zzfyw
        public final Object zza() {
            throw new IllegalStateException();
        }
    };
    private volatile zzfyw zzb;

    @CheckForNull
    private Object zzc;

    zzfyy(zzfyw zzfywVar) {
        this.zzb = zzfywVar;
    }

    public final String toString() {
        Object obj = this.zzb;
        if (obj == zza) {
            obj = "<supplier that returned " + String.valueOf(this.zzc) + ">";
        }
        return "Suppliers.memoize(" + String.valueOf(obj) + ")";
    }

    @Override // com.google.android.gms.internal.ads.zzfyw
    public final Object zza() {
        zzfyw zzfywVar = this.zzb;
        zzfyw zzfywVar2 = zza;
        if (zzfywVar != zzfywVar2) {
            synchronized (this) {
                if (this.zzb != zzfywVar2) {
                    Object objZza = this.zzb.zza();
                    this.zzc = objZza;
                    this.zzb = zzfywVar2;
                    return objZza;
                }
            }
        }
        return this.zzc;
    }
}
