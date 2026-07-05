package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzghp {
    private final List zza = new ArrayList();
    private final zzgtk zzb = zzgtk.zza;
    private boolean zzc = false;

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzd() {
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            ((zzghn) it.next()).zza = false;
        }
    }

    public final zzghp zza(zzghn zzghnVar) {
        if (zzghnVar.zzf != null) {
            throw new IllegalStateException("Entry has already been added to a KeysetHandle.Builder");
        }
        if (zzghnVar.zza) {
            zzd();
        }
        zzghnVar.zzf = this;
        this.zza.add(zzghnVar);
        return this;
    }

    public final zzght zzb() throws GeneralSecurityException {
        int i;
        zzgwj zzgwjVar;
        if (this.zzc) {
            throw new GeneralSecurityException("KeysetHandle.Builder#build must only be called once");
        }
        char c = 1;
        this.zzc = true;
        List list = this.zza;
        zzgwr zzgwrVarZzd = zzgwu.zzd();
        ArrayList arrayList = new ArrayList(list.size());
        List list2 = this.zza;
        int i2 = 0;
        int i3 = 0;
        while (i3 < list2.size() - 1) {
            int i4 = i3 + 1;
            if (((zzghn) list2.get(i3)).zze == zzgho.zza && ((zzghn) list2.get(i4)).zze != zzgho.zza) {
                throw new GeneralSecurityException("Entries with 'withRandomId()' may only be followed by other entries with 'withRandomId()'.");
            }
            i3 = i4;
        }
        HashSet hashSet = new HashSet();
        zzghs zzghsVar = null;
        Integer num = null;
        for (zzghn zzghnVar : this.zza) {
            zzghk unused = zzghnVar.zzb;
            if (zzghnVar.zze == null) {
                throw new GeneralSecurityException("No ID was set (with withFixedId or withRandomId)");
            }
            if (zzghnVar.zze == zzgho.zza) {
                i = i2;
                while (true) {
                    if (i != 0 && !hashSet.contains(Integer.valueOf(i))) {
                        break;
                    }
                    SecureRandom secureRandom = new SecureRandom();
                    byte[] bArr = new byte[4];
                    int i5 = i2;
                    while (i5 == 0) {
                        secureRandom.nextBytes(bArr);
                        i5 = ((bArr[i2] & 255) << 24) | ((bArr[c] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
                    }
                    i = i5;
                }
            } else {
                zzgho unused2 = zzghnVar.zze;
                i = i2;
            }
            Integer numValueOf = Integer.valueOf(i);
            if (hashSet.contains(numValueOf)) {
                throw new GeneralSecurityException("Id " + i + " is used twice in the keyset");
            }
            hashSet.add(numValueOf);
            zzghn.zza(zzghnVar);
            zzghi zzghiVarZza = zzgpb.zzb().zza(zzghnVar.zzd, c != zzghnVar.zzd.zza() ? null : numValueOf);
            zzghr zzghrVar = new zzghr(zzghiVarZza, zzghnVar.zzb, i, zzghnVar.zza, null);
            zzghk zzghkVar = zzghnVar.zzb;
            zzgql zzgqlVar = (zzgql) zzgpl.zzc().zzd(zzghiVarZza, zzgql.class, zzgic.zza());
            Integer numZzf = zzgqlVar.zzf();
            if (numZzf != null && numZzf.intValue() != i) {
                throw new GeneralSecurityException("Wrong ID set for key with ID requirement");
            }
            if (zzghk.zza.equals(zzghkVar)) {
                zzgwjVar = zzgwj.ENABLED;
            } else if (zzghk.zzb.equals(zzghkVar)) {
                zzgwjVar = zzgwj.DISABLED;
            } else {
                if (!zzghk.zzc.equals(zzghkVar)) {
                    throw new IllegalStateException("Unknown key status");
                }
                zzgwjVar = zzgwj.DESTROYED;
            }
            zzgws zzgwsVarZze = zzgwt.zze();
            zzgwe zzgweVarZza = zzgwh.zza();
            zzgweVarZza.zzb(zzgqlVar.zzg());
            zzgweVarZza.zzc(zzgqlVar.zze());
            zzgweVarZza.zza(zzgqlVar.zzb());
            zzgwsVarZze.zza(zzgweVarZza);
            zzgwsVarZze.zzd(zzgwjVar);
            zzgwsVarZze.zzb(i);
            zzgwsVarZze.zzc(zzgqlVar.zzc());
            zzgwrVarZzd.zza((zzgwt) zzgwsVarZze.zzbr());
            if (zzghnVar.zza) {
                if (num != null) {
                    throw new GeneralSecurityException("Two primaries were set");
                }
                if (zzghnVar.zzb != zzghk.zza) {
                    throw new GeneralSecurityException("Primary key is not enabled");
                }
                num = numValueOf;
            }
            arrayList.add(zzghrVar);
            c = 1;
            i2 = 0;
        }
        if (num == null) {
            throw new GeneralSecurityException("No primary was set");
        }
        zzgwrVarZzd.zzb(num.intValue());
        zzgwu zzgwuVar = (zzgwu) zzgwrVarZzd.zzbr();
        zzght.zzh(zzgwuVar);
        return new zzght(zzgwuVar, arrayList, this.zzb, zzghsVar);
    }
}
