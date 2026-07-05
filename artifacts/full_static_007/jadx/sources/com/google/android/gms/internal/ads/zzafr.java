package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzafr implements zzafj {
    public final zzgbc zza;
    private final int zzb;

    private zzafr(int i, zzgbc zzgbcVar) {
        this.zzb = i;
        this.zza = zzgbcVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static zzafr zzc(int i, zzfu zzfuVar) {
        zzafj zzafsVar;
        String str;
        zzgaz zzgazVar = new zzgaz();
        int iZze = zzfuVar.zze();
        int i2 = -2;
        while (zzfuVar.zzb() > 8) {
            int iZzi = zzfuVar.zzi();
            int iZzd = zzfuVar.zzd() + zzfuVar.zzi();
            zzfuVar.zzJ(iZzd);
            if (iZzi != 1414744396) {
                zzafs zzafsVar2 = null;
                switch (iZzi) {
                    case 1718776947:
                        if (i2 == 2) {
                            zzfuVar.zzL(4);
                            int iZzi2 = zzfuVar.zzi();
                            int iZzi3 = zzfuVar.zzi();
                            zzfuVar.zzL(4);
                            int iZzi4 = zzfuVar.zzi();
                            switch (iZzi4) {
                                case 808802372:
                                case 877677894:
                                case 1145656883:
                                case 1145656920:
                                case 1482049860:
                                case 1684633208:
                                case 2021026148:
                                    str = "video/mp4v-es";
                                    break;
                                case 826496577:
                                case 828601953:
                                case 875967048:
                                    str = "video/avc";
                                    break;
                                case 842289229:
                                    str = "video/mp42";
                                    break;
                                case 859066445:
                                    str = "video/mp43";
                                    break;
                                case 1196444237:
                                case 1735420525:
                                    str = "video/mjpeg";
                                    break;
                                default:
                                    str = null;
                                    break;
                            }
                            if (str == null) {
                                zzfk.zzf("StreamFormatChunk", "Ignoring track with unsupported compression " + iZzi4);
                            } else {
                                zzal zzalVar = new zzal();
                                zzalVar.zzac(iZzi2);
                                zzalVar.zzI(iZzi3);
                                zzalVar.zzX(str);
                                zzafsVar2 = new zzafs(zzalVar.zzad());
                            }
                        } else if (i2 == 1) {
                            int iZzk = zzfuVar.zzk();
                            String str2 = iZzk != 1 ? iZzk != 85 ? iZzk != 255 ? iZzk != 8192 ? iZzk != 8193 ? null : "audio/vnd.dts" : "audio/ac3" : "audio/mp4a-latm" : "audio/mpeg" : "audio/raw";
                            if (str2 != null) {
                                int iZzk2 = zzfuVar.zzk();
                                int iZzi5 = zzfuVar.zzi();
                                zzfuVar.zzL(6);
                                int iZzl = zzgd.zzl(zzfuVar.zzq());
                                int iZzk3 = zzfuVar.zzk();
                                byte[] bArr = new byte[iZzk3];
                                zzfuVar.zzG(bArr, 0, iZzk3);
                                zzal zzalVar2 = new zzal();
                                zzalVar2.zzX(str2);
                                zzalVar2.zzy(iZzk2);
                                zzalVar2.zzY(iZzi5);
                                if ("audio/raw".equals(str2) && iZzl != 0) {
                                    zzalVar2.zzR(iZzl);
                                }
                                if ("audio/mp4a-latm".equals(str2) && iZzk3 > 0) {
                                    zzalVar2.zzL(zzgbc.zzn(bArr));
                                }
                                zzafsVar = new zzafs(zzalVar2.zzad());
                                break;
                            } else {
                                zzfk.zzf("StreamFormatChunk", "Ignoring track with unsupported format tag " + iZzk);
                            }
                        } else {
                            zzfk.zzf("StreamFormatChunk", "Ignoring strf box for unsupported track type: ".concat(zzgd.zzC(i2)));
                        }
                        zzafsVar = zzafsVar2;
                        break;
                    case 1751742049:
                        zzafsVar = zzafo.zzb(zzfuVar);
                        break;
                    case 1752331379:
                        zzafsVar = zzafp.zzb(zzfuVar);
                        break;
                    case 1852994675:
                        zzafsVar = zzaft.zzb(zzfuVar);
                        break;
                    default:
                        zzafsVar = zzafsVar2;
                        break;
                }
            } else {
                zzafsVar = zzc(zzfuVar.zzi(), zzfuVar);
            }
            if (zzafsVar != null) {
                if (zzafsVar.zza() == 1752331379) {
                    int i3 = ((zzafp) zzafsVar).zza;
                    if (i3 == 1935960438) {
                        i2 = 2;
                    } else if (i3 == 1935963489) {
                        i2 = 1;
                    } else if (i3 != 1937012852) {
                        zzfk.zzf("AviStreamHeaderChunk", "Found unsupported streamType fourCC: ".concat(String.valueOf(Integer.toHexString(i3))));
                        i2 = -1;
                    } else {
                        i2 = 3;
                    }
                }
                zzgazVar.zzf(zzafsVar);
            }
            zzfuVar.zzK(iZzd);
            zzfuVar.zzJ(iZze);
        }
        return new zzafr(i, zzgazVar.zzi());
    }

    @Override // com.google.android.gms.internal.ads.zzafj
    public final int zza() {
        return this.zzb;
    }

    public final zzafj zzb(Class cls) {
        zzgbc zzgbcVar = this.zza;
        int size = zzgbcVar.size();
        int i = 0;
        while (i < size) {
            zzafj zzafjVar = (zzafj) zzgbcVar.get(i);
            i++;
            if (zzafjVar.getClass() == cls) {
                return zzafjVar;
            }
        }
        return null;
    }
}
