package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzght {
    private final zzgwu zza;
    private final List zzb;
    private final zzgtk zzc;

    private zzght(zzgwu zzgwuVar, List list) {
        this.zza = zzgwuVar;
        this.zzb = list;
        this.zzc = zzgtk.zza;
    }

    /* synthetic */ zzght(zzgwu zzgwuVar, List list, zzgtk zzgtkVar, zzghs zzghsVar) {
        this.zza = zzgwuVar;
        this.zzb = list;
        this.zzc = zzgtkVar;
    }

    static final zzght zza(zzgwu zzgwuVar) throws GeneralSecurityException {
        zzh(zzgwuVar);
        return new zzght(zzgwuVar, zzg(zzgwuVar));
    }

    public static final zzght zzb(zzghx zzghxVar) throws GeneralSecurityException {
        zzghp zzghpVar = new zzghp();
        zzghn zzghnVar = new zzghn(zzghxVar, null);
        zzghnVar.zzd();
        zzghnVar.zzc();
        zzghpVar.zza(zzghnVar);
        return zzghpVar.zzb();
    }

    private final Object zzf(zzgoi zzgoiVar, Class cls, Class cls2) throws GeneralSecurityException {
        Charset charset = zzgif.zza;
        zzgwu zzgwuVar = this.zza;
        int iZzc = zzgwuVar.zzc();
        int i = 0;
        boolean z = false;
        boolean z2 = true;
        for (zzgwt zzgwtVar : zzgwuVar.zzh()) {
            if (zzgwtVar.zzd() == zzgwj.ENABLED) {
                if (!zzgwtVar.zzl()) {
                    throw new GeneralSecurityException(String.format("key %d has no key data", Integer.valueOf(zzgwtVar.zza())));
                }
                if (zzgwtVar.zzg() == zzgxn.UNKNOWN_PREFIX) {
                    throw new GeneralSecurityException(String.format("key %d has unknown prefix", Integer.valueOf(zzgwtVar.zza())));
                }
                if (zzgwtVar.zzd() == zzgwj.UNKNOWN_STATUS) {
                    throw new GeneralSecurityException(String.format("key %d has unknown status", Integer.valueOf(zzgwtVar.zza())));
                }
                if (zzgwtVar.zza() == iZzc) {
                    if (z) {
                        throw new GeneralSecurityException("keyset contains multiple primary keys");
                    }
                    z = true;
                }
                z2 &= zzgwtVar.zzc().zzc() == zzgwg.ASYMMETRIC_PUBLIC;
                i++;
            }
        }
        if (i == 0) {
            throw new GeneralSecurityException("keyset must contain at least one ENABLED key");
        }
        if (!z && !z2) {
            throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
        }
        zzgqg zzgqgVarZza = zzgqk.zza(cls2);
        zzgqgVarZza.zzc(this.zzc);
        for (int i2 = 0; i2 < this.zzb.size(); i2++) {
            zzgwt zzgwtVarZze = this.zza.zze(i2);
            if (zzgwtVarZze.zzd().equals(zzgwj.ENABLED)) {
                zzghr zzghrVar = (zzghr) this.zzb.get(i2);
                if (zzghrVar == null) {
                    throw new GeneralSecurityException("Key parsing of key with index " + i2 + " and type_url " + zzgwtVarZze.zzc().zzg() + " failed, unable to get primitive");
                }
                zzghi zzghiVarZza = zzghrVar.zza();
                try {
                    Object objZzc = zzgpi.zza().zzc(zzghiVarZza, cls2);
                    if (zzgwtVarZze.zza() == this.zza.zzc()) {
                        zzgqgVarZza.zzb(objZzc, zzghiVarZza, zzgwtVarZze);
                    } else {
                        zzgqgVarZza.zza(objZzc, zzghiVarZza, zzgwtVarZze);
                    }
                } catch (GeneralSecurityException e) {
                    throw new GeneralSecurityException("Unable to get primitive " + cls2.toString() + " for key of type " + zzgwtVarZze.zzc().zzg() + ", see https://developers.google.com/tink/faq/registration_errors", e);
                }
            }
        }
        zzgqk zzgqkVarZzd = zzgqgVarZza.zzd();
        int i3 = zzgib.zza;
        return zzgpi.zza().zzd(zzgqkVarZzd, cls);
    }

    private static List zzg(zzgwu zzgwuVar) throws GeneralSecurityException {
        zzghk zzghkVar;
        ArrayList arrayList = new ArrayList(zzgwuVar.zza());
        for (zzgwt zzgwtVar : zzgwuVar.zzh()) {
            int iZza = zzgwtVar.zza();
            try {
                zzgql zzgqlVarZza = zzgql.zza(zzgwtVar.zzc().zzg(), zzgwtVar.zzc().zzf(), zzgwtVar.zzc().zzc(), zzgwtVar.zzg(), zzgwtVar.zzg() == zzgxn.RAW ? null : Integer.valueOf(zzgwtVar.zza()));
                zzgpl zzgplVarZzc = zzgpl.zzc();
                zzgic zzgicVarZza = zzgic.zza();
                zzghi zzgouVar = !zzgplVarZzc.zzj(zzgqlVarZza) ? new zzgou(zzgqlVarZza, zzgicVarZza) : zzgplVarZzc.zza(zzgqlVarZza, zzgicVarZza);
                zzgwj zzgwjVarZzd = zzgwtVar.zzd();
                zzgwj zzgwjVar = zzgwj.UNKNOWN_STATUS;
                int iOrdinal = zzgwjVarZzd.ordinal();
                if (iOrdinal == 1) {
                    zzghkVar = zzghk.zza;
                } else if (iOrdinal == 2) {
                    zzghkVar = zzghk.zzb;
                } else {
                    if (iOrdinal != 3) {
                        throw new GeneralSecurityException("Unknown key status");
                    }
                    zzghkVar = zzghk.zzc;
                }
                arrayList.add(new zzghr(zzgouVar, zzghkVar, iZza, iZza == zzgwuVar.zzc(), null));
            } catch (GeneralSecurityException unused) {
                arrayList.add(null);
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzh(zzgwu zzgwuVar) throws GeneralSecurityException {
        if (zzgwuVar == null || zzgwuVar.zza() <= 0) {
            throw new GeneralSecurityException("empty keyset");
        }
    }

    public final String toString() {
        Charset charset = zzgif.zza;
        zzgww zzgwwVarZza = zzgwz.zza();
        zzgwu zzgwuVar = this.zza;
        zzgwwVarZza.zzb(zzgwuVar.zzc());
        for (zzgwt zzgwtVar : zzgwuVar.zzh()) {
            zzgwx zzgwxVarZza = zzgwy.zza();
            zzgwxVarZza.zzd(zzgwtVar.zzc().zzg());
            zzgwxVarZza.zzc(zzgwtVar.zzd());
            zzgwxVarZza.zzb(zzgwtVar.zzg());
            zzgwxVarZza.zza(zzgwtVar.zza());
            zzgwwVarZza.zza((zzgwy) zzgwxVarZza.zzbr());
        }
        return ((zzgwz) zzgwwVarZza.zzbr()).toString();
    }

    final zzgwu zzc() {
        return this.zza;
    }

    public final Object zzd(zzghc zzghcVar, Class cls) throws GeneralSecurityException {
        Class clsZza = zzgib.zza(cls);
        if (clsZza != null) {
            return zzf((zzgoi) zzghcVar, cls, clsZza);
        }
        throw new GeneralSecurityException("No wrapper found for ".concat(String.valueOf(cls.getName())));
    }
}
