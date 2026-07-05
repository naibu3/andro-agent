package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzglk {

    @Nullable
    private zzglm zza;

    @Nullable
    private String zzb;

    @Nullable
    private zzgll zzc;

    @Nullable
    private zzgii zzd;

    private zzglk() {
        throw null;
    }

    /* synthetic */ zzglk(zzglj zzgljVar) {
    }

    public final zzglk zza(zzgii zzgiiVar) {
        this.zzd = zzgiiVar;
        return this;
    }

    public final zzglk zzb(zzgll zzgllVar) {
        this.zzc = zzgllVar;
        return this;
    }

    public final zzglk zzc(String str) {
        this.zzb = str;
        return this;
    }

    public final zzglk zzd(zzglm zzglmVar) {
        this.zza = zzglmVar;
        return this;
    }

    public final zzglo zze() throws GeneralSecurityException {
        if (this.zza == null) {
            this.zza = zzglm.zzb;
        }
        if (this.zzb == null) {
            throw new GeneralSecurityException("kekUri must be set");
        }
        zzgll zzgllVar = this.zzc;
        if (zzgllVar == null) {
            throw new GeneralSecurityException("dekParsingStrategy must be set");
        }
        zzgii zzgiiVar = this.zzd;
        if (zzgiiVar == null) {
            throw new GeneralSecurityException("dekParametersForNewKeys must be set");
        }
        if (zzgiiVar.zza()) {
            throw new GeneralSecurityException("dekParametersForNewKeys must not have ID Requirements");
        }
        if ((zzgllVar.equals(zzgll.zza) && (zzgiiVar instanceof zzgjz)) || ((zzgllVar.equals(zzgll.zzc) && (zzgiiVar instanceof zzgks)) || ((zzgllVar.equals(zzgll.zzb) && (zzgiiVar instanceof zzgmh)) || ((zzgllVar.equals(zzgll.zzd) && (zzgiiVar instanceof zzgja)) || ((zzgllVar.equals(zzgll.zze) && (zzgiiVar instanceof zzgjm)) || (zzgllVar.equals(zzgll.zzf) && (zzgiiVar instanceof zzgkm))))))) {
            return new zzglo(this.zza, this.zzb, this.zzc, this.zzd, null);
        }
        throw new GeneralSecurityException("Cannot use parsing strategy " + this.zzc.toString() + " when new keys are picked according to " + String.valueOf(this.zzd) + ".");
    }
}
