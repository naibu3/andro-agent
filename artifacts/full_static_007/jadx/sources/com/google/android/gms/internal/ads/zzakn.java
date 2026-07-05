package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzakn {
    private static final zzfyt zza = zzfyt.zzc(zzfxr.zzc(':'));
    private static final zzfyt zzb = zzfyt.zzc(zzfxr.zzc('*'));
    private final List zzc = new ArrayList();
    private int zzd = 0;
    private int zze;

    public final void zzb() {
        this.zzc.clear();
        this.zzd = 0;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zza(zzadv zzadvVar, zzaeq zzaeqVar, List list) throws IOException {
        int i;
        char c;
        char c2;
        int i2 = this.zzd;
        if (i2 == 0) {
            long jZzd = zzadvVar.zzd();
            zzaeqVar.zza = (jZzd == -1 || jZzd < 8) ? 0L : jZzd - 8;
            this.zzd = 1;
            return 1;
        }
        int i3 = 2;
        if (i2 != 1) {
            char c3 = 2819;
            short s = 2817;
            short s2 = 2816;
            short s3 = 2192;
            if (i2 != 2) {
                long jZzf = zzadvVar.zzf();
                int iZzd = (int) ((zzadvVar.zzd() - zzadvVar.zzf()) - this.zze);
                zzfu zzfuVar = new zzfu(iZzd);
                zzadvVar.zzi(zzfuVar.zzM(), 0, iZzd);
                int i4 = 0;
                while (i4 < this.zzc.size()) {
                    zzakm zzakmVar = (zzakm) this.zzc.get(i4);
                    zzfuVar.zzK((int) (zzakmVar.zza - jZzf));
                    zzfuVar.zzL(4);
                    int iZzi = zzfuVar.zzi();
                    String strZzA = zzfuVar.zzA(iZzi, zzfxs.zzc);
                    switch (strZzA.hashCode()) {
                        case -1711564334:
                            if (strZzA.equals("SlowMotion_Data")) {
                                c = 0;
                                break;
                            } else {
                                c = 65535;
                                break;
                            }
                        case -1332107749:
                            if (strZzA.equals("Super_SlowMotion_Edit_Data")) {
                                c = 3;
                                break;
                            }
                            break;
                        case -1251387154:
                            if (strZzA.equals("Super_SlowMotion_Data")) {
                                c = 1;
                                break;
                            }
                            break;
                        case -830665521:
                            if (strZzA.equals("Super_SlowMotion_Deflickering_On")) {
                                c = 4;
                                break;
                            }
                            break;
                        case 1760745220:
                            if (strZzA.equals("Super_SlowMotion_BGM")) {
                                c = 2;
                                break;
                            }
                            break;
                    }
                    if (c == 0) {
                        c2 = 2192;
                    } else if (c == 1) {
                        c2 = 2816;
                    } else if (c == 2) {
                        c2 = 2817;
                    } else if (c == 3) {
                        c2 = c3;
                    } else {
                        if (c != 4) {
                            throw zzch.zza("Invalid SEF name", null);
                        }
                        c2 = 2820;
                    }
                    int i5 = zzakmVar.zzb - (iZzi + 8);
                    if (c2 == 2192) {
                        ArrayList arrayList = new ArrayList();
                        List listZzf = zzb.zzf(zzfuVar.zzA(i5, zzfxs.zzc));
                        for (int i6 = 0; i6 < listZzf.size(); i6++) {
                            List listZzf2 = zza.zzf((CharSequence) listZzf.get(i6));
                            if (listZzf2.size() != 3) {
                                throw zzch.zza(null, null);
                            }
                            try {
                                arrayList.add(new zzaii(Long.parseLong((String) listZzf2.get(0)), Long.parseLong((String) listZzf2.get(1)), 1 << (Integer.parseInt((String) listZzf2.get(2)) - 1)));
                            } catch (NumberFormatException e) {
                                throw zzch.zza(null, e);
                            }
                        }
                        list.add(new zzaij(arrayList));
                    } else if (c2 != 2816 && c2 != 2817 && c2 != c3 && c2 != 2820) {
                        throw new IllegalStateException();
                    }
                    i4++;
                    c3 = 2819;
                }
                zzaeqVar.zza = 0L;
                return 1;
            }
            long jZzd2 = zzadvVar.zzd();
            int i7 = this.zze - 20;
            zzfu zzfuVar2 = new zzfu(i7);
            zzadvVar.zzi(zzfuVar2.zzM(), 0, i7);
            int i8 = 0;
            while (i8 < i7 / 12) {
                zzfuVar2.zzL(i3);
                short sZzC = zzfuVar2.zzC();
                if (sZzC == s3 || sZzC == s2 || sZzC == s || sZzC == 2819 || sZzC == 2820) {
                    i = i7;
                    this.zzc.add(new zzakm(sZzC, (jZzd2 - this.zze) - zzfuVar2.zzi(), zzfuVar2.zzi()));
                } else {
                    zzfuVar2.zzL(8);
                    i = i7;
                }
                i8++;
                i7 = i;
                i3 = 2;
                s = 2817;
                s2 = 2816;
                s3 = 2192;
            }
            if (this.zzc.isEmpty()) {
                zzaeqVar.zza = 0L;
            } else {
                this.zzd = 3;
                zzaeqVar.zza = ((zzakm) this.zzc.get(0)).zza;
            }
        } else {
            zzfu zzfuVar3 = new zzfu(8);
            zzadvVar.zzi(zzfuVar3.zzM(), 0, 8);
            this.zze = zzfuVar3.zzi() + 8;
            if (zzfuVar3.zzg() != 1397048916) {
                zzaeqVar.zza = 0L;
            } else {
                zzaeqVar.zza = zzadvVar.zzf() - (this.zze - 12);
                this.zzd = 2;
            }
        }
        return 1;
    }
}
