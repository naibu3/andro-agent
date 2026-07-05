package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.2.0 */
/* loaded from: classes2.dex */
final class zzhan implements zzhdr {
    private final zzham zza;
    private int zzb;
    private int zzc;
    private int zzd = 0;

    private zzhan(zzham zzhamVar) {
        zzhcb.zzc(zzhamVar, "input");
        this.zza = zzhamVar;
        zzhamVar.zzc = this;
    }

    private final Object zzR(zzhdz zzhdzVar, zzhay zzhayVar) throws IOException {
        Object objZze = zzhdzVar.zze();
        zzT(objZze, zzhdzVar, zzhayVar);
        zzhdzVar.zzf(objZze);
        return objZze;
    }

    private final Object zzS(zzhdz zzhdzVar, zzhay zzhayVar) throws IOException {
        Object objZze = zzhdzVar.zze();
        zzU(objZze, zzhdzVar, zzhayVar);
        zzhdzVar.zzf(objZze);
        return objZze;
    }

    private final void zzT(Object obj, zzhdz zzhdzVar, zzhay zzhayVar) throws IOException {
        int i = this.zzc;
        this.zzc = ((this.zzb >>> 3) << 3) | 4;
        try {
            zzhdzVar.zzh(obj, this, zzhayVar);
            if (this.zzb == this.zzc) {
            } else {
                throw zzhcd.zzg();
            }
        } finally {
            this.zzc = i;
        }
    }

    private final void zzU(Object obj, zzhdz zzhdzVar, zzhay zzhayVar) throws IOException {
        zzham zzhamVar = this.zza;
        int iZzn = zzhamVar.zzn();
        if (zzhamVar.zza >= zzhamVar.zzb) {
            throw new zzhcd("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
        int iZze = this.zza.zze(iZzn);
        this.zza.zza++;
        zzhdzVar.zzh(obj, this, zzhayVar);
        this.zza.zzz(0);
        r4.zza--;
        this.zza.zzA(iZze);
    }

    private final void zzV(int i) throws IOException {
        if (this.zza.zzd() != i) {
            throw zzhcd.zzj();
        }
    }

    private final void zzW(int i) throws IOException {
        if ((this.zzb & 7) != i) {
            throw zzhcd.zza();
        }
    }

    private static final void zzX(int i) throws IOException {
        if ((i & 3) != 0) {
            throw zzhcd.zzg();
        }
    }

    private static final void zzY(int i) throws IOException {
        if ((i & 7) != 0) {
            throw zzhcd.zzg();
        }
    }

    public static zzhan zzq(zzham zzhamVar) {
        zzhan zzhanVar = zzhamVar.zzc;
        return zzhanVar != null ? zzhanVar : new zzhan(zzhamVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhdr
    public final void zzA(List list) throws IOException {
        int iZzm;
        int iZzm2;
        if (list instanceof zzhbp) {
            zzhbp zzhbpVar = (zzhbp) list;
            int i = this.zzb & 7;
            if (i != 0) {
                if (i != 2) {
                    throw zzhcd.zza();
                }
                zzham zzhamVar = this.zza;
                int iZzd = zzhamVar.zzd() + zzhamVar.zzn();
                do {
                    zzhbpVar.zzi(this.zza.zzf());
                } while (this.zza.zzd() < iZzd);
                zzV(iZzd);
                return;
            }
            do {
                zzhbpVar.zzi(this.zza.zzf());
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm2 = this.zza.zzm();
                }
            } while (iZzm2 == this.zzb);
        } else {
            int i2 = this.zzb & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw zzhcd.zza();
                }
                zzham zzhamVar2 = this.zza;
                int iZzd2 = zzhamVar2.zzd() + zzhamVar2.zzn();
                do {
                    list.add(Integer.valueOf(this.zza.zzf()));
                } while (this.zza.zzd() < iZzd2);
                zzV(iZzd2);
                return;
            }
            do {
                list.add(Integer.valueOf(this.zza.zzf()));
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm = this.zza.zzm();
                }
            } while (iZzm == this.zzb);
            iZzm2 = iZzm;
        }
        this.zzd = iZzm2;
    }

    @Override // com.google.android.gms.internal.ads.zzhdr
    public final void zzB(List list) throws IOException {
        int iZzm;
        int iZzm2;
        if (list instanceof zzhbp) {
            zzhbp zzhbpVar = (zzhbp) list;
            int i = this.zzb & 7;
            if (i == 2) {
                int iZzn = this.zza.zzn();
                zzX(iZzn);
                int iZzd = this.zza.zzd() + iZzn;
                do {
                    zzhbpVar.zzi(this.zza.zzg());
                } while (this.zza.zzd() < iZzd);
                return;
            }
            if (i != 5) {
                throw zzhcd.zza();
            }
            do {
                zzhbpVar.zzi(this.zza.zzg());
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm2 = this.zza.zzm();
                }
            } while (iZzm2 == this.zzb);
        } else {
            int i2 = this.zzb & 7;
            if (i2 == 2) {
                int iZzn2 = this.zza.zzn();
                zzX(iZzn2);
                int iZzd2 = this.zza.zzd() + iZzn2;
                do {
                    list.add(Integer.valueOf(this.zza.zzg()));
                } while (this.zza.zzd() < iZzd2);
                return;
            }
            if (i2 != 5) {
                throw zzhcd.zza();
            }
            do {
                list.add(Integer.valueOf(this.zza.zzg()));
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm = this.zza.zzm();
                }
            } while (iZzm == this.zzb);
            iZzm2 = iZzm;
        }
        this.zzd = iZzm2;
    }

    @Override // com.google.android.gms.internal.ads.zzhdr
    public final void zzC(List list) throws IOException {
        int iZzm;
        int iZzm2;
        if (list instanceof zzhct) {
            zzhct zzhctVar = (zzhct) list;
            int i = this.zzb & 7;
            if (i != 1) {
                if (i != 2) {
                    throw zzhcd.zza();
                }
                int iZzn = this.zza.zzn();
                zzY(iZzn);
                int iZzd = this.zza.zzd() + iZzn;
                do {
                    zzhctVar.zzg(this.zza.zzo());
                } while (this.zza.zzd() < iZzd);
                return;
            }
            do {
                zzhctVar.zzg(this.zza.zzo());
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm2 = this.zza.zzm();
                }
            } while (iZzm2 == this.zzb);
        } else {
            int i2 = this.zzb & 7;
            if (i2 != 1) {
                if (i2 != 2) {
                    throw zzhcd.zza();
                }
                int iZzn2 = this.zza.zzn();
                zzY(iZzn2);
                int iZzd2 = this.zza.zzd() + iZzn2;
                do {
                    list.add(Long.valueOf(this.zza.zzo()));
                } while (this.zza.zzd() < iZzd2);
                return;
            }
            do {
                list.add(Long.valueOf(this.zza.zzo()));
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm = this.zza.zzm();
                }
            } while (iZzm == this.zzb);
            iZzm2 = iZzm;
        }
        this.zzd = iZzm2;
    }

    @Override // com.google.android.gms.internal.ads.zzhdr
    public final void zzD(List list) throws IOException {
        int iZzm;
        int iZzm2;
        if (list instanceof zzhbf) {
            zzhbf zzhbfVar = (zzhbf) list;
            int i = this.zzb & 7;
            if (i == 2) {
                int iZzn = this.zza.zzn();
                zzX(iZzn);
                int iZzd = this.zza.zzd() + iZzn;
                do {
                    zzhbfVar.zzh(this.zza.zzc());
                } while (this.zza.zzd() < iZzd);
                return;
            }
            if (i != 5) {
                throw zzhcd.zza();
            }
            do {
                zzhbfVar.zzh(this.zza.zzc());
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm2 = this.zza.zzm();
                }
            } while (iZzm2 == this.zzb);
        } else {
            int i2 = this.zzb & 7;
            if (i2 == 2) {
                int iZzn2 = this.zza.zzn();
                zzX(iZzn2);
                int iZzd2 = this.zza.zzd() + iZzn2;
                do {
                    list.add(Float.valueOf(this.zza.zzc()));
                } while (this.zza.zzd() < iZzd2);
                return;
            }
            if (i2 != 5) {
                throw zzhcd.zza();
            }
            do {
                list.add(Float.valueOf(this.zza.zzc()));
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm = this.zza.zzm();
                }
            } while (iZzm == this.zzb);
            iZzm2 = iZzm;
        }
        this.zzd = iZzm2;
    }

    @Override // com.google.android.gms.internal.ads.zzhdr
    @Deprecated
    public final void zzE(List list, zzhdz zzhdzVar, zzhay zzhayVar) throws IOException {
        int iZzm;
        int i = this.zzb;
        if ((i & 7) != 3) {
            throw zzhcd.zza();
        }
        do {
            list.add(zzR(zzhdzVar, zzhayVar));
            if (this.zza.zzC() || this.zzd != 0) {
                return;
            } else {
                iZzm = this.zza.zzm();
            }
        } while (iZzm == i);
        this.zzd = iZzm;
    }

    @Override // com.google.android.gms.internal.ads.zzhdr
    public final void zzF(List list) throws IOException {
        int iZzm;
        int iZzm2;
        if (list instanceof zzhbp) {
            zzhbp zzhbpVar = (zzhbp) list;
            int i = this.zzb & 7;
            if (i != 0) {
                if (i != 2) {
                    throw zzhcd.zza();
                }
                zzham zzhamVar = this.zza;
                int iZzd = zzhamVar.zzd() + zzhamVar.zzn();
                do {
                    zzhbpVar.zzi(this.zza.zzh());
                } while (this.zza.zzd() < iZzd);
                zzV(iZzd);
                return;
            }
            do {
                zzhbpVar.zzi(this.zza.zzh());
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm2 = this.zza.zzm();
                }
            } while (iZzm2 == this.zzb);
        } else {
            int i2 = this.zzb & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw zzhcd.zza();
                }
                zzham zzhamVar2 = this.zza;
                int iZzd2 = zzhamVar2.zzd() + zzhamVar2.zzn();
                do {
                    list.add(Integer.valueOf(this.zza.zzh()));
                } while (this.zza.zzd() < iZzd2);
                zzV(iZzd2);
                return;
            }
            do {
                list.add(Integer.valueOf(this.zza.zzh()));
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm = this.zza.zzm();
                }
            } while (iZzm == this.zzb);
            iZzm2 = iZzm;
        }
        this.zzd = iZzm2;
    }

    @Override // com.google.android.gms.internal.ads.zzhdr
    public final void zzG(List list) throws IOException {
        int iZzm;
        int iZzm2;
        if (list instanceof zzhct) {
            zzhct zzhctVar = (zzhct) list;
            int i = this.zzb & 7;
            if (i != 0) {
                if (i != 2) {
                    throw zzhcd.zza();
                }
                zzham zzhamVar = this.zza;
                int iZzd = zzhamVar.zzd() + zzhamVar.zzn();
                do {
                    zzhctVar.zzg(this.zza.zzp());
                } while (this.zza.zzd() < iZzd);
                zzV(iZzd);
                return;
            }
            do {
                zzhctVar.zzg(this.zza.zzp());
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm2 = this.zza.zzm();
                }
            } while (iZzm2 == this.zzb);
        } else {
            int i2 = this.zzb & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw zzhcd.zza();
                }
                zzham zzhamVar2 = this.zza;
                int iZzd2 = zzhamVar2.zzd() + zzhamVar2.zzn();
                do {
                    list.add(Long.valueOf(this.zza.zzp()));
                } while (this.zza.zzd() < iZzd2);
                zzV(iZzd2);
                return;
            }
            do {
                list.add(Long.valueOf(this.zza.zzp()));
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm = this.zza.zzm();
                }
            } while (iZzm == this.zzb);
            iZzm2 = iZzm;
        }
        this.zzd = iZzm2;
    }

    @Override // com.google.android.gms.internal.ads.zzhdr
    public final void zzH(List list, zzhdz zzhdzVar, zzhay zzhayVar) throws IOException {
        int iZzm;
        int i = this.zzb;
        if ((i & 7) != 2) {
            throw zzhcd.zza();
        }
        do {
            list.add(zzS(zzhdzVar, zzhayVar));
            if (this.zza.zzC() || this.zzd != 0) {
                return;
            } else {
                iZzm = this.zza.zzm();
            }
        } while (iZzm == i);
        this.zzd = iZzm;
    }

    @Override // com.google.android.gms.internal.ads.zzhdr
    public final void zzI(List list) throws IOException {
        int iZzm;
        int iZzm2;
        if (list instanceof zzhbp) {
            zzhbp zzhbpVar = (zzhbp) list;
            int i = this.zzb & 7;
            if (i == 2) {
                int iZzn = this.zza.zzn();
                zzX(iZzn);
                int iZzd = this.zza.zzd() + iZzn;
                do {
                    zzhbpVar.zzi(this.zza.zzk());
                } while (this.zza.zzd() < iZzd);
                return;
            }
            if (i != 5) {
                throw zzhcd.zza();
            }
            do {
                zzhbpVar.zzi(this.zza.zzk());
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm2 = this.zza.zzm();
                }
            } while (iZzm2 == this.zzb);
        } else {
            int i2 = this.zzb & 7;
            if (i2 == 2) {
                int iZzn2 = this.zza.zzn();
                zzX(iZzn2);
                int iZzd2 = this.zza.zzd() + iZzn2;
                do {
                    list.add(Integer.valueOf(this.zza.zzk()));
                } while (this.zza.zzd() < iZzd2);
                return;
            }
            if (i2 != 5) {
                throw zzhcd.zza();
            }
            do {
                list.add(Integer.valueOf(this.zza.zzk()));
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm = this.zza.zzm();
                }
            } while (iZzm == this.zzb);
            iZzm2 = iZzm;
        }
        this.zzd = iZzm2;
    }

    @Override // com.google.android.gms.internal.ads.zzhdr
    public final void zzJ(List list) throws IOException {
        int iZzm;
        int iZzm2;
        if (list instanceof zzhct) {
            zzhct zzhctVar = (zzhct) list;
            int i = this.zzb & 7;
            if (i != 1) {
                if (i != 2) {
                    throw zzhcd.zza();
                }
                int iZzn = this.zza.zzn();
                zzY(iZzn);
                int iZzd = this.zza.zzd() + iZzn;
                do {
                    zzhctVar.zzg(this.zza.zzt());
                } while (this.zza.zzd() < iZzd);
                return;
            }
            do {
                zzhctVar.zzg(this.zza.zzt());
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm2 = this.zza.zzm();
                }
            } while (iZzm2 == this.zzb);
        } else {
            int i2 = this.zzb & 7;
            if (i2 != 1) {
                if (i2 != 2) {
                    throw zzhcd.zza();
                }
                int iZzn2 = this.zza.zzn();
                zzY(iZzn2);
                int iZzd2 = this.zza.zzd() + iZzn2;
                do {
                    list.add(Long.valueOf(this.zza.zzt()));
                } while (this.zza.zzd() < iZzd2);
                return;
            }
            do {
                list.add(Long.valueOf(this.zza.zzt()));
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm = this.zza.zzm();
                }
            } while (iZzm == this.zzb);
            iZzm2 = iZzm;
        }
        this.zzd = iZzm2;
    }

    @Override // com.google.android.gms.internal.ads.zzhdr
    public final void zzK(List list) throws IOException {
        int iZzm;
        int iZzm2;
        if (list instanceof zzhbp) {
            zzhbp zzhbpVar = (zzhbp) list;
            int i = this.zzb & 7;
            if (i != 0) {
                if (i != 2) {
                    throw zzhcd.zza();
                }
                zzham zzhamVar = this.zza;
                int iZzd = zzhamVar.zzd() + zzhamVar.zzn();
                do {
                    zzhbpVar.zzi(this.zza.zzl());
                } while (this.zza.zzd() < iZzd);
                zzV(iZzd);
                return;
            }
            do {
                zzhbpVar.zzi(this.zza.zzl());
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm2 = this.zza.zzm();
                }
            } while (iZzm2 == this.zzb);
        } else {
            int i2 = this.zzb & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw zzhcd.zza();
                }
                zzham zzhamVar2 = this.zza;
                int iZzd2 = zzhamVar2.zzd() + zzhamVar2.zzn();
                do {
                    list.add(Integer.valueOf(this.zza.zzl()));
                } while (this.zza.zzd() < iZzd2);
                zzV(iZzd2);
                return;
            }
            do {
                list.add(Integer.valueOf(this.zza.zzl()));
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm = this.zza.zzm();
                }
            } while (iZzm == this.zzb);
            iZzm2 = iZzm;
        }
        this.zzd = iZzm2;
    }

    @Override // com.google.android.gms.internal.ads.zzhdr
    public final void zzL(List list) throws IOException {
        int iZzm;
        int iZzm2;
        if (list instanceof zzhct) {
            zzhct zzhctVar = (zzhct) list;
            int i = this.zzb & 7;
            if (i != 0) {
                if (i != 2) {
                    throw zzhcd.zza();
                }
                zzham zzhamVar = this.zza;
                int iZzd = zzhamVar.zzd() + zzhamVar.zzn();
                do {
                    zzhctVar.zzg(this.zza.zzu());
                } while (this.zza.zzd() < iZzd);
                zzV(iZzd);
                return;
            }
            do {
                zzhctVar.zzg(this.zza.zzu());
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm2 = this.zza.zzm();
                }
            } while (iZzm2 == this.zzb);
        } else {
            int i2 = this.zzb & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw zzhcd.zza();
                }
                zzham zzhamVar2 = this.zza;
                int iZzd2 = zzhamVar2.zzd() + zzhamVar2.zzn();
                do {
                    list.add(Long.valueOf(this.zza.zzu()));
                } while (this.zza.zzd() < iZzd2);
                zzV(iZzd2);
                return;
            }
            do {
                list.add(Long.valueOf(this.zza.zzu()));
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm = this.zza.zzm();
                }
            } while (iZzm == this.zzb);
            iZzm2 = iZzm;
        }
        this.zzd = iZzm2;
    }

    public final void zzM(List list, boolean z) throws IOException {
        int iZzm;
        int iZzm2;
        if ((this.zzb & 7) != 2) {
            throw zzhcd.zza();
        }
        if ((list instanceof zzhcm) && !z) {
            zzhcm zzhcmVar = (zzhcm) list;
            do {
                zzhcmVar.zzi(zzp());
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm2 = this.zza.zzm();
                }
            } while (iZzm2 == this.zzb);
        } else {
            do {
                list.add(z ? zzu() : zzt());
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm = this.zza.zzm();
                }
            } while (iZzm == this.zzb);
            iZzm2 = iZzm;
        }
        this.zzd = iZzm2;
    }

    @Override // com.google.android.gms.internal.ads.zzhdr
    public final void zzN(List list) throws IOException {
        int iZzm;
        int iZzm2;
        if (list instanceof zzhbp) {
            zzhbp zzhbpVar = (zzhbp) list;
            int i = this.zzb & 7;
            if (i != 0) {
                if (i != 2) {
                    throw zzhcd.zza();
                }
                zzham zzhamVar = this.zza;
                int iZzd = zzhamVar.zzd() + zzhamVar.zzn();
                do {
                    zzhbpVar.zzi(this.zza.zzn());
                } while (this.zza.zzd() < iZzd);
                zzV(iZzd);
                return;
            }
            do {
                zzhbpVar.zzi(this.zza.zzn());
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm2 = this.zza.zzm();
                }
            } while (iZzm2 == this.zzb);
        } else {
            int i2 = this.zzb & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw zzhcd.zza();
                }
                zzham zzhamVar2 = this.zza;
                int iZzd2 = zzhamVar2.zzd() + zzhamVar2.zzn();
                do {
                    list.add(Integer.valueOf(this.zza.zzn()));
                } while (this.zza.zzd() < iZzd2);
                zzV(iZzd2);
                return;
            }
            do {
                list.add(Integer.valueOf(this.zza.zzn()));
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm = this.zza.zzm();
                }
            } while (iZzm == this.zzb);
            iZzm2 = iZzm;
        }
        this.zzd = iZzm2;
    }

    @Override // com.google.android.gms.internal.ads.zzhdr
    public final void zzO(List list) throws IOException {
        int iZzm;
        int iZzm2;
        if (list instanceof zzhct) {
            zzhct zzhctVar = (zzhct) list;
            int i = this.zzb & 7;
            if (i != 0) {
                if (i != 2) {
                    throw zzhcd.zza();
                }
                zzham zzhamVar = this.zza;
                int iZzd = zzhamVar.zzd() + zzhamVar.zzn();
                do {
                    zzhctVar.zzg(this.zza.zzv());
                } while (this.zza.zzd() < iZzd);
                zzV(iZzd);
                return;
            }
            do {
                zzhctVar.zzg(this.zza.zzv());
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm2 = this.zza.zzm();
                }
            } while (iZzm2 == this.zzb);
        } else {
            int i2 = this.zzb & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw zzhcd.zza();
                }
                zzham zzhamVar2 = this.zza;
                int iZzd2 = zzhamVar2.zzd() + zzhamVar2.zzn();
                do {
                    list.add(Long.valueOf(this.zza.zzv()));
                } while (this.zza.zzd() < iZzd2);
                zzV(iZzd2);
                return;
            }
            do {
                list.add(Long.valueOf(this.zza.zzv()));
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm = this.zza.zzm();
                }
            } while (iZzm == this.zzb);
            iZzm2 = iZzm;
        }
        this.zzd = iZzm2;
    }

    @Override // com.google.android.gms.internal.ads.zzhdr
    public final boolean zzP() throws IOException {
        zzW(0);
        return this.zza.zzD();
    }

    @Override // com.google.android.gms.internal.ads.zzhdr
    public final boolean zzQ() throws IOException {
        int i;
        if (this.zza.zzC() || (i = this.zzb) == this.zzc) {
            return false;
        }
        return this.zza.zzE(i);
    }

    @Override // com.google.android.gms.internal.ads.zzhdr
    public final double zza() throws IOException {
        zzW(1);
        return this.zza.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzhdr
    public final float zzb() throws IOException {
        zzW(5);
        return this.zza.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzhdr
    public final int zzc() throws IOException {
        int iZzm = this.zzd;
        if (iZzm != 0) {
            this.zzb = iZzm;
            this.zzd = 0;
        } else {
            iZzm = this.zza.zzm();
            this.zzb = iZzm;
        }
        if (iZzm == 0 || iZzm == this.zzc) {
            return Integer.MAX_VALUE;
        }
        return iZzm >>> 3;
    }

    @Override // com.google.android.gms.internal.ads.zzhdr
    public final int zzd() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzhdr
    public final int zze() throws IOException {
        zzW(0);
        return this.zza.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzhdr
    public final int zzf() throws IOException {
        zzW(5);
        return this.zza.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzhdr
    public final int zzg() throws IOException {
        zzW(0);
        return this.zza.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzhdr
    public final int zzh() throws IOException {
        zzW(5);
        return this.zza.zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzhdr
    public final int zzi() throws IOException {
        zzW(0);
        return this.zza.zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzhdr
    public final int zzj() throws IOException {
        zzW(0);
        return this.zza.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzhdr
    public final long zzk() throws IOException {
        zzW(1);
        return this.zza.zzo();
    }

    @Override // com.google.android.gms.internal.ads.zzhdr
    public final long zzl() throws IOException {
        zzW(0);
        return this.zza.zzp();
    }

    @Override // com.google.android.gms.internal.ads.zzhdr
    public final long zzm() throws IOException {
        zzW(1);
        return this.zza.zzt();
    }

    @Override // com.google.android.gms.internal.ads.zzhdr
    public final long zzn() throws IOException {
        zzW(0);
        return this.zza.zzu();
    }

    @Override // com.google.android.gms.internal.ads.zzhdr
    public final long zzo() throws IOException {
        zzW(0);
        return this.zza.zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzhdr
    public final zzhac zzp() throws IOException {
        zzW(2);
        return this.zza.zzw();
    }

    @Override // com.google.android.gms.internal.ads.zzhdr
    @Deprecated
    public final Object zzr(Class cls, zzhay zzhayVar) throws IOException {
        zzW(3);
        return zzR(zzhdo.zza().zzb(cls), zzhayVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhdr
    public final Object zzs(Class cls, zzhay zzhayVar) throws IOException {
        zzW(2);
        return zzS(zzhdo.zza().zzb(cls), zzhayVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhdr
    public final String zzt() throws IOException {
        zzW(2);
        return this.zza.zzx();
    }

    @Override // com.google.android.gms.internal.ads.zzhdr
    public final String zzu() throws IOException {
        zzW(2);
        return this.zza.zzy();
    }

    @Override // com.google.android.gms.internal.ads.zzhdr
    public final void zzv(Object obj, zzhdz zzhdzVar, zzhay zzhayVar) throws IOException {
        zzW(3);
        zzT(obj, zzhdzVar, zzhayVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhdr
    public final void zzw(Object obj, zzhdz zzhdzVar, zzhay zzhayVar) throws IOException {
        zzW(2);
        zzU(obj, zzhdzVar, zzhayVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhdr
    public final void zzx(List list) throws IOException {
        int iZzm;
        int iZzm2;
        if (list instanceof zzgzp) {
            zzgzp zzgzpVar = (zzgzp) list;
            int i = this.zzb & 7;
            if (i != 0) {
                if (i != 2) {
                    throw zzhcd.zza();
                }
                zzham zzhamVar = this.zza;
                int iZzd = zzhamVar.zzd() + zzhamVar.zzn();
                do {
                    zzgzpVar.zzg(this.zza.zzD());
                } while (this.zza.zzd() < iZzd);
                zzV(iZzd);
                return;
            }
            do {
                zzgzpVar.zzg(this.zza.zzD());
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm2 = this.zza.zzm();
                }
            } while (iZzm2 == this.zzb);
        } else {
            int i2 = this.zzb & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw zzhcd.zza();
                }
                zzham zzhamVar2 = this.zza;
                int iZzd2 = zzhamVar2.zzd() + zzhamVar2.zzn();
                do {
                    list.add(Boolean.valueOf(this.zza.zzD()));
                } while (this.zza.zzd() < iZzd2);
                zzV(iZzd2);
                return;
            }
            do {
                list.add(Boolean.valueOf(this.zza.zzD()));
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm = this.zza.zzm();
                }
            } while (iZzm == this.zzb);
            iZzm2 = iZzm;
        }
        this.zzd = iZzm2;
    }

    @Override // com.google.android.gms.internal.ads.zzhdr
    public final void zzy(List list) throws IOException {
        int iZzm;
        if ((this.zzb & 7) != 2) {
            throw zzhcd.zza();
        }
        do {
            list.add(zzp());
            if (this.zza.zzC()) {
                return;
            } else {
                iZzm = this.zza.zzm();
            }
        } while (iZzm == this.zzb);
        this.zzd = iZzm;
    }

    @Override // com.google.android.gms.internal.ads.zzhdr
    public final void zzz(List list) throws IOException {
        int iZzm;
        int iZzm2;
        if (list instanceof zzhav) {
            zzhav zzhavVar = (zzhav) list;
            int i = this.zzb & 7;
            if (i != 1) {
                if (i != 2) {
                    throw zzhcd.zza();
                }
                int iZzn = this.zza.zzn();
                zzY(iZzn);
                int iZzd = this.zza.zzd() + iZzn;
                do {
                    zzhavVar.zzh(this.zza.zzb());
                } while (this.zza.zzd() < iZzd);
                return;
            }
            do {
                zzhavVar.zzh(this.zza.zzb());
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm2 = this.zza.zzm();
                }
            } while (iZzm2 == this.zzb);
        } else {
            int i2 = this.zzb & 7;
            if (i2 != 1) {
                if (i2 != 2) {
                    throw zzhcd.zza();
                }
                int iZzn2 = this.zza.zzn();
                zzY(iZzn2);
                int iZzd2 = this.zza.zzd() + iZzn2;
                do {
                    list.add(Double.valueOf(this.zza.zzb()));
                } while (this.zza.zzd() < iZzd2);
                return;
            }
            do {
                list.add(Double.valueOf(this.zza.zzb()));
                if (this.zza.zzC()) {
                    return;
                } else {
                    iZzm = this.zza.zzm();
                }
            } while (iZzm == this.zzb);
            iZzm2 = iZzm;
        }
        this.zzd = iZzm2;
    }
}
