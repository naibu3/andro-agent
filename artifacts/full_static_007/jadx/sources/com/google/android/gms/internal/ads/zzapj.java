package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseIntArray;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzapj implements zzapb {
    final /* synthetic */ zzapk zza;
    private final zzft zzb = new zzft(new byte[5], 5);
    private final SparseArray zzc = new SparseArray();
    private final SparseIntArray zzd = new SparseIntArray();
    private final int zze;

    public zzapj(zzapk zzapkVar, int i) {
        this.zza = zzapkVar;
        this.zze = i;
    }

    @Override // com.google.android.gms.internal.ads.zzapb
    public final void zza(zzfu zzfuVar) {
        zzgb zzgbVar;
        zzgb zzgbVar2;
        int i;
        if (zzfuVar.zzm() != 2) {
            return;
        }
        zzgb zzgbVar3 = (zzgb) this.zza.zzb.get(0);
        if ((zzfuVar.zzm() & 128) != 0) {
            zzfuVar.zzL(1);
            int iZzq = zzfuVar.zzq();
            int i2 = 3;
            zzfuVar.zzL(3);
            zzfuVar.zzF(this.zzb, 2);
            this.zzb.zzm(3);
            int i3 = 13;
            this.zza.zzr = this.zzb.zzd(13);
            zzfuVar.zzF(this.zzb, 2);
            int i4 = 4;
            this.zzb.zzm(4);
            int i5 = 12;
            zzfuVar.zzL(this.zzb.zzd(12));
            this.zzc.clear();
            this.zzd.clear();
            int iZzb = zzfuVar.zzb();
            while (iZzb > 0) {
                int i6 = 5;
                zzfuVar.zzF(this.zzb, 5);
                zzft zzftVar = this.zzb;
                int iZzd = zzftVar.zzd(8);
                zzftVar.zzm(i2);
                int iZzd2 = this.zzb.zzd(i3);
                this.zzb.zzm(i4);
                int iZzd3 = this.zzb.zzd(i5);
                int iZzd4 = zzfuVar.zzd();
                int i7 = iZzd4 + iZzd3;
                int iZzm = 0;
                String str = null;
                ArrayList arrayList = null;
                int i8 = -1;
                while (zzfuVar.zzd() < i7) {
                    int iZzm2 = zzfuVar.zzm();
                    int iZzd5 = zzfuVar.zzd() + zzfuVar.zzm();
                    if (iZzd5 > i7) {
                        break;
                    }
                    if (iZzm2 == i6) {
                        long jZzu = zzfuVar.zzu();
                        if (jZzu != 1094921523) {
                            if (jZzu != 1161904947) {
                                if (jZzu != 1094921524) {
                                    if (jZzu == 1212503619) {
                                        i = 36;
                                        zzgbVar2 = zzgbVar3;
                                        i8 = i;
                                    }
                                    zzgbVar2 = zzgbVar3;
                                }
                                zzgbVar2 = zzgbVar3;
                                i8 = 172;
                            }
                            zzgbVar2 = zzgbVar3;
                            i8 = 135;
                        }
                        zzgbVar2 = zzgbVar3;
                        i8 = 129;
                    } else if (iZzm2 == 106) {
                        zzgbVar2 = zzgbVar3;
                        i8 = 129;
                    } else if (iZzm2 == 122) {
                        zzgbVar2 = zzgbVar3;
                        i8 = 135;
                    } else {
                        if (iZzm2 == 127) {
                            int iZzm3 = zzfuVar.zzm();
                            if (iZzm3 != 21) {
                                if (iZzm3 == 14) {
                                    i = 136;
                                } else {
                                    if (iZzm3 == 33) {
                                        i = 139;
                                    }
                                    zzgbVar2 = zzgbVar3;
                                }
                            }
                            zzgbVar2 = zzgbVar3;
                            i8 = 172;
                        } else if (iZzm2 == 123) {
                            i = 138;
                        } else if (iZzm2 == 10) {
                            String strTrim = zzfuVar.zzA(i2, zzfxs.zzc).trim();
                            iZzm = zzfuVar.zzm();
                            zzgbVar2 = zzgbVar3;
                            str = strTrim;
                        } else if (iZzm2 == 89) {
                            ArrayList arrayList2 = new ArrayList();
                            while (zzfuVar.zzd() < iZzd5) {
                                String strTrim2 = zzfuVar.zzA(i2, zzfxs.zzc).trim();
                                int iZzm4 = zzfuVar.zzm();
                                zzgb zzgbVar4 = zzgbVar3;
                                byte[] bArr = new byte[i4];
                                zzfuVar.zzG(bArr, 0, i4);
                                arrayList2.add(new zzapl(strTrim2, iZzm4, bArr));
                                zzgbVar3 = zzgbVar4;
                                i2 = 3;
                                i4 = 4;
                            }
                            zzgbVar2 = zzgbVar3;
                            arrayList = arrayList2;
                            i8 = 89;
                        } else {
                            zzgbVar2 = zzgbVar3;
                            if (iZzm2 == 111) {
                                i8 = 257;
                            }
                        }
                        zzgbVar2 = zzgbVar3;
                        i8 = i;
                    }
                    zzfuVar.zzL(iZzd5 - zzfuVar.zzd());
                    zzgbVar3 = zzgbVar2;
                    i2 = 3;
                    i4 = 4;
                    i6 = 5;
                }
                zzgb zzgbVar5 = zzgbVar3;
                zzfuVar.zzK(i7);
                zzapm zzapmVar = new zzapm(i8, str, iZzm, arrayList, Arrays.copyOfRange(zzfuVar.zzM(), iZzd4, i7));
                if (iZzd == 6 || iZzd == 5) {
                    iZzd = zzapmVar.zza;
                }
                iZzb -= iZzd3 + 5;
                if (!this.zza.zzh.get(iZzd2)) {
                    zzapp zzappVarZza = this.zza.zze.zza(iZzd, zzapmVar);
                    this.zzd.put(iZzd2, iZzd2);
                    this.zzc.put(iZzd2, zzappVarZza);
                }
                zzgbVar3 = zzgbVar5;
                i2 = 3;
                i4 = 4;
                i5 = 12;
                i3 = 13;
            }
            zzgb zzgbVar6 = zzgbVar3;
            int size = this.zzd.size();
            int i9 = 0;
            while (i9 < size) {
                SparseIntArray sparseIntArray = this.zzd;
                zzapk zzapkVar = this.zza;
                int iKeyAt = sparseIntArray.keyAt(i9);
                int iValueAt = sparseIntArray.valueAt(i9);
                zzapkVar.zzh.put(iKeyAt, true);
                this.zza.zzi.put(iValueAt, true);
                zzapp zzappVar = (zzapp) this.zzc.valueAt(i9);
                if (zzappVar != null) {
                    zzadx zzadxVar = this.zza.zzl;
                    zzapo zzapoVar = new zzapo(iZzq, iKeyAt, 8192);
                    zzgbVar = zzgbVar6;
                    zzappVar.zzb(zzgbVar, zzadxVar, zzapoVar);
                    this.zza.zzg.put(iValueAt, zzappVar);
                } else {
                    zzgbVar = zzgbVar6;
                }
                i9++;
                zzgbVar6 = zzgbVar;
            }
            this.zza.zzg.remove(this.zze);
            this.zza.zzm = 0;
            zzapk zzapkVar2 = this.zza;
            if (zzapkVar2.zzm == 0) {
                zzapkVar2.zzl.zzD();
                this.zza.zzn = true;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzapb
    public final void zzb(zzgb zzgbVar, zzadx zzadxVar, zzapo zzapoVar) {
    }
}
