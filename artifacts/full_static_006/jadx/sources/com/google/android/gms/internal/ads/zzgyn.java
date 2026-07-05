package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzgyn {
    public static final zzgyn zza = new zzgyn(new zzgyo());
    public static final zzgyn zzb = new zzgyn(new zzgys());
    public static final zzgyn zzc = new zzgyn(new zzgyu());
    public static final zzgyn zzd = new zzgyn(new zzgyt());
    public static final zzgyn zze = new zzgyn(new zzgyp());
    public static final zzgyn zzf = new zzgyn(new zzgyr());
    public static final zzgyn zzg = new zzgyn(new zzgyq());
    private final zzgym zzh;

    /* JADX WARN: Multi-variable type inference failed */
    public zzgyn(zzgyv zzgyvVar) {
        this.zzh = !zzgod.zzb() ? "The Android Project".equals(System.getProperty("java.vendor")) ? new zzgyh(zzgyvVar, null) : new zzgyj(zzgyvVar, 0 == true ? 1 : 0) : new zzgyl(zzgyvVar, 0 == true ? 1 : 0);
    }

    public static List zzb(String... strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            Provider provider = Security.getProvider(str);
            if (provider != null) {
                arrayList.add(provider);
            }
        }
        return arrayList;
    }

    public final Object zza(String str) throws GeneralSecurityException {
        return this.zzh.zza(str);
    }
}
