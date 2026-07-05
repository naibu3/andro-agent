package com.google.android.gms.internal.ads;

import com.google.firebase.FirebaseError;
import java.io.IOException;
import java.util.ArrayDeque;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzair implements zzait {
    private final byte[] zza = new byte[8];
    private final ArrayDeque zzb = new ArrayDeque();
    private final zzaja zzc = new zzaja();
    private zzais zzd;
    private int zze;
    private int zzf;
    private long zzg;

    private final long zzd(zzadv zzadvVar, int i) throws IOException {
        ((zzadi) zzadvVar).zzn(this.zza, 0, i, false);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j = (j << 8) | (this.zza[i2] & 255);
        }
        return j;
    }

    @Override // com.google.android.gms.internal.ads.zzait
    public final void zza(zzais zzaisVar) {
        this.zzd = zzaisVar;
    }

    @Override // com.google.android.gms.internal.ads.zzait
    public final void zzb() {
        this.zze = 0;
        this.zzb.clear();
        this.zzc.zze();
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00b2 A[LOOP:0: B:3:0x0005->B:37:0x00b2, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00bf A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00f9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0102 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0125 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0165 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzait
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean zzc(zzadv zzadvVar) throws IOException {
        int i;
        String str;
        zzadi zzadiVar;
        int iZzb;
        int iZzc;
        zzeq.zzb(this.zzd);
        while (true) {
            zzaiq zzaiqVar = (zzaiq) this.zzb.peek();
            if (zzaiqVar != null && zzadvVar.zzf() >= zzaiqVar.zzb) {
                ((zzaiw) this.zzd).zza.zzi(((zzaiq) this.zzb.pop()).zza);
                return true;
            }
            int i2 = this.zze;
            if (i2 == 0) {
                long jZzd = this.zzc.zzd(zzadvVar, true, false, 4);
                if (jZzd == -2) {
                    zzadvVar.zzj();
                    while (true) {
                        zzadiVar = (zzadi) zzadvVar;
                        zzadiVar.zzm(this.zza, 0, 4, false);
                        iZzb = zzaja.zzb(this.zza[0]);
                        if (iZzb != -1 && iZzb <= 4) {
                            iZzc = (int) zzaja.zzc(this.zza, iZzb, false);
                            zzaiy zzaiyVar = ((zzaiw) this.zzd).zza;
                            if (iZzc != 357149030 && iZzc != 524531317 && iZzc != 475249515) {
                                if (iZzc == 374648427) {
                                    iZzc = 374648427;
                                }
                            }
                        }
                        zzadiVar.zzo(1, false);
                    }
                    zzadiVar.zzo(iZzb, false);
                    jZzd = iZzc;
                }
                if (jZzd == -1) {
                    return false;
                }
                this.zzf = (int) jZzd;
                this.zze = 1;
            } else {
                if (i2 == 1) {
                }
                zzais zzaisVar = this.zzd;
                i = this.zzf;
                zzaiw zzaiwVar = (zzaiw) zzaisVar;
                zzaiy zzaiyVar2 = zzaiwVar.zza;
                switch (i) {
                    case 131:
                    case 136:
                    case 155:
                    case 159:
                    case 176:
                    case 179:
                    case 186:
                    case 215:
                    case 231:
                    case 238:
                    case 241:
                    case 251:
                    case 16871:
                    case 16980:
                    case 17029:
                    case 17143:
                    case 18401:
                    case 18408:
                    case 20529:
                    case 20530:
                    case 21420:
                    case 21432:
                    case 21680:
                    case 21682:
                    case 21690:
                    case 21930:
                    case 21938:
                    case 21945:
                    case 21946:
                    case 21947:
                    case 21948:
                    case 21949:
                    case 21998:
                    case 22186:
                    case 22203:
                    case 25188:
                    case 30114:
                    case 30321:
                    case 2352003:
                    case 2807729:
                        long j = this.zzg;
                        if (j <= 8) {
                            zzaiwVar.zza.zzk(i, zzd(zzadvVar, (int) j));
                            this.zze = 0;
                            return true;
                        }
                        throw zzch.zza("Invalid integer size: " + j, null);
                    case 134:
                    case FirebaseError.ERROR_WEAK_PASSWORD /* 17026 */:
                    case 21358:
                    case 2274716:
                        long j2 = this.zzg;
                        if (j2 > 2147483647L) {
                            throw zzch.zza("String element size: " + j2, null);
                        }
                        int i3 = (int) j2;
                        if (i3 == 0) {
                            str = "";
                        } else {
                            byte[] bArr = new byte[i3];
                            ((zzadi) zzadvVar).zzn(bArr, 0, i3, false);
                            while (i3 > 0) {
                                int i4 = i3 - 1;
                                if (bArr[i4] == 0) {
                                    i3 = i4;
                                } else {
                                    str = new String(bArr, 0, i3);
                                }
                            }
                            str = new String(bArr, 0, i3);
                        }
                        zzaiwVar.zza.zzm(i, str);
                        this.zze = 0;
                        return true;
                    case 160:
                    case 166:
                    case 174:
                    case 183:
                    case 187:
                    case 224:
                    case 225:
                    case 16868:
                    case 18407:
                    case 19899:
                    case 20532:
                    case 20533:
                    case 21936:
                    case 21968:
                    case 25152:
                    case 28032:
                    case 30113:
                    case 30320:
                    case 290298740:
                    case 357149030:
                    case 374648427:
                    case 408125543:
                    case 440786851:
                    case 475249515:
                    case 524531317:
                        long jZzf = zzadvVar.zzf();
                        this.zzb.push(new zzaiq(i, this.zzg + jZzf, null));
                        ((zzaiw) this.zzd).zza.zzl(this.zzf, jZzf, this.zzg);
                        this.zze = 0;
                        return true;
                    case 161:
                    case 163:
                    case 165:
                    case 16877:
                    case 16981:
                    case 18402:
                    case 21419:
                    case 25506:
                    case 30322:
                        zzaiyVar2.zzh(i, (int) this.zzg, zzadvVar);
                        this.zze = 0;
                        return true;
                    case 181:
                    case 17545:
                    case 21969:
                    case 21970:
                    case 21971:
                    case 21972:
                    case 21973:
                    case 21974:
                    case 21975:
                    case 21976:
                    case 21977:
                    case 21978:
                    case 30323:
                    case 30324:
                    case 30325:
                        long j3 = this.zzg;
                        if (j3 != 4 && j3 != 8) {
                            throw zzch.zza("Invalid float size: " + j3, null);
                        }
                        int i5 = (int) j3;
                        zzaiwVar.zza.zzj(i, i5 == 4 ? Float.intBitsToFloat((int) r6) : Double.longBitsToDouble(zzd(zzadvVar, i5)));
                        this.zze = 0;
                        return true;
                    default:
                        ((zzadi) zzadvVar).zzo((int) this.zzg, false);
                        this.zze = 0;
                }
            }
            this.zzg = this.zzc.zzd(zzadvVar, false, true, 8);
            this.zze = 2;
            zzais zzaisVar2 = this.zzd;
            i = this.zzf;
            zzaiw zzaiwVar2 = (zzaiw) zzaisVar2;
            zzaiy zzaiyVar22 = zzaiwVar2.zza;
            switch (i) {
                case 131:
                case 136:
                case 155:
                case 159:
                case 176:
                case 179:
                case 186:
                case 215:
                case 231:
                case 238:
                case 241:
                case 251:
                case 16871:
                case 16980:
                case 17029:
                case 17143:
                case 18401:
                case 18408:
                case 20529:
                case 20530:
                case 21420:
                case 21432:
                case 21680:
                case 21682:
                case 21690:
                case 21930:
                case 21938:
                case 21945:
                case 21946:
                case 21947:
                case 21948:
                case 21949:
                case 21998:
                case 22186:
                case 22203:
                case 25188:
                case 30114:
                case 30321:
                case 2352003:
                case 2807729:
                    break;
                case 134:
                case FirebaseError.ERROR_WEAK_PASSWORD /* 17026 */:
                case 21358:
                case 2274716:
                    break;
                case 160:
                case 166:
                case 174:
                case 183:
                case 187:
                case 224:
                case 225:
                case 16868:
                case 18407:
                case 19899:
                case 20532:
                case 20533:
                case 21936:
                case 21968:
                case 25152:
                case 28032:
                case 30113:
                case 30320:
                case 290298740:
                case 357149030:
                case 374648427:
                case 408125543:
                case 440786851:
                case 475249515:
                case 524531317:
                    break;
                case 161:
                case 163:
                case 165:
                case 16877:
                case 16981:
                case 18402:
                case 21419:
                case 25506:
                case 30322:
                    break;
                case 181:
                case 17545:
                case 21969:
                case 21970:
                case 21971:
                case 21972:
                case 21973:
                case 21974:
                case 21975:
                case 21976:
                case 21977:
                case 21978:
                case 30323:
                case 30324:
                case 30325:
                    break;
            }
        }
    }
}
