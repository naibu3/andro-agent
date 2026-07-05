package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzgqg {
    private final Class zza;
    private zzgqi zzd;
    private Map zzb = new HashMap();
    private final List zzc = new ArrayList();
    private zzgtk zze = zzgtk.zza;

    /* synthetic */ zzgqg(Class cls, zzgqf zzgqfVar) {
        this.zza = cls;
    }

    private final zzgqg zze(Object obj, zzghi zzghiVar, zzgwt zzgwtVar, boolean z) throws GeneralSecurityException {
        byte[] bArrZzc;
        if (this.zzb == null) {
            throw new IllegalStateException("addEntry cannot be called after build");
        }
        if (zzgwtVar.zzd() != zzgwj.ENABLED) {
            throw new GeneralSecurityException("only ENABLED key is allowed");
        }
        zzgxn zzgxnVar = zzgxn.UNKNOWN_PREFIX;
        int iOrdinal = zzgwtVar.zzg().ordinal();
        if (iOrdinal == 1) {
            bArrZzc = zzgpm.zzb(zzgwtVar.zza()).zzc();
        } else if (iOrdinal == 2) {
            bArrZzc = zzgpm.zza(zzgwtVar.zza()).zzc();
        } else if (iOrdinal != 3) {
            if (iOrdinal != 4) {
                throw new GeneralSecurityException("unknown output prefix type");
            }
            bArrZzc = zzgpm.zza(zzgwtVar.zza()).zzc();
        } else {
            bArrZzc = zzghd.zza;
        }
        zzgqi zzgqiVar = new zzgqi(obj, zzgze.zzb(bArrZzc), zzgwtVar.zzd(), zzgwtVar.zzg(), zzgwtVar.zza(), zzgwtVar.zzc().zzg(), zzghiVar, null);
        Map map = this.zzb;
        List list = this.zzc;
        ArrayList arrayList = new ArrayList();
        arrayList.add(zzgqiVar);
        List list2 = (List) map.put(zzgqiVar.zzb, Collections.unmodifiableList(arrayList));
        if (list2 != null) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(list2);
            arrayList2.add(zzgqiVar);
            map.put(zzgqiVar.zzb, Collections.unmodifiableList(arrayList2));
        }
        list.add(zzgqiVar);
        if (z) {
            if (this.zzd != null) {
                throw new IllegalStateException("you cannot set two primary primitives");
            }
            this.zzd = zzgqiVar;
        }
        return this;
    }

    public final zzgqg zza(Object obj, zzghi zzghiVar, zzgwt zzgwtVar) throws GeneralSecurityException {
        zze(obj, zzghiVar, zzgwtVar, false);
        return this;
    }

    public final zzgqg zzb(Object obj, zzghi zzghiVar, zzgwt zzgwtVar) throws GeneralSecurityException {
        zze(obj, zzghiVar, zzgwtVar, true);
        return this;
    }

    public final zzgqg zzc(zzgtk zzgtkVar) {
        if (this.zzb == null) {
            throw new IllegalStateException("setAnnotations cannot be called after build");
        }
        this.zze = zzgtkVar;
        return this;
    }

    public final zzgqk zzd() throws GeneralSecurityException {
        Map map = this.zzb;
        if (map == null) {
            throw new IllegalStateException("build cannot be called twice");
        }
        zzgqk zzgqkVar = new zzgqk(map, this.zzc, this.zzd, this.zze, this.zza, null);
        this.zzb = null;
        return zzgqkVar;
    }
}
