package com.google.android.gms.internal.ads;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Pair;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zztp {
    public final String zza;
    public final String zzb;
    public final String zzc;
    public final MediaCodecInfo.CodecCapabilities zzd;
    public final boolean zze;
    public final boolean zzf;
    public final boolean zzg;
    private final boolean zzh;

    /* JADX WARN: Removed duplicated region for block: B:23:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zztp zzc(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        boolean z6;
        boolean z7;
        boolean z8 = codecCapabilities != null && codecCapabilities.isFeatureSupported("adaptive-playback") && (zzgd.zza > 22 || !(("ODROID-XU3".equals(zzgd.zzd) || "Nexus 10".equals(zzgd.zzd)) && ("OMX.Exynos.AVC.Decoder".equals(str) || "OMX.Exynos.AVC.Decoder.secure".equals(str))));
        if (codecCapabilities != null) {
            int i = zzgd.zza;
            z6 = codecCapabilities.isFeatureSupported("tunneled-playback");
        }
        if (z5) {
            z7 = true;
        } else {
            if (codecCapabilities != null) {
                int i2 = zzgd.zza;
                if (codecCapabilities.isFeatureSupported("secure-playback")) {
                }
            }
            z7 = false;
        }
        return new zztp(str, str2, str3, codecCapabilities, z, z2, z3, z8, z6, z7);
    }

    private static Point zzi(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        int i3 = zzgd.zza;
        return new Point((((i + widthAlignment) - 1) / widthAlignment) * widthAlignment, (((i2 + heightAlignment) - 1) / heightAlignment) * heightAlignment);
    }

    private final void zzj(String str) {
        zzfk.zzb("MediaCodecInfo", "NoSupport [" + str + "] [" + this.zza + ", " + this.zzb + "] [" + zzgd.zze + "]");
    }

    private static boolean zzk(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        Point pointZzi = zzi(videoCapabilities, i, i2);
        int i3 = pointZzi.x;
        int i4 = pointZzi.y;
        return (d == -1.0d || d < 1.0d) ? videoCapabilities.isSizeSupported(i3, i4) : videoCapabilities.areSizeAndRateSupported(i3, i4, Math.floor(d));
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00d9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean zzl(zzan zzanVar, boolean z) {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArrZzh;
        int iIntValue;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        Pair pairZza = zzuj.zza(zzanVar);
        if (pairZza != null) {
            int iIntValue2 = ((Integer) pairZza.first).intValue();
            int iIntValue3 = ((Integer) pairZza.second).intValue();
            int i = 8;
            if ("video/dolby-vision".equals(zzanVar.zzn)) {
                if ("video/avc".equals(this.zzb)) {
                    iIntValue2 = 8;
                } else if ("video/hevc".equals(this.zzb)) {
                    iIntValue2 = 2;
                }
                iIntValue3 = 0;
            }
            if (this.zzh) {
                codecProfileLevelArrZzh = zzh();
                if (zzgd.zza <= 23 && "video/x-vnd.on2.vp9".equals(this.zzb) && codecProfileLevelArrZzh.length == 0) {
                    MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzd;
                    iIntValue = (codecCapabilities != null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) ? 0 : ((Integer) videoCapabilities.getBitrateRange().getUpper()).intValue();
                    if (iIntValue < 180000000) {
                        i = 1024;
                    } else if (iIntValue >= 120000000) {
                        i = 512;
                    } else if (iIntValue >= 60000000) {
                        i = 256;
                    } else if (iIntValue >= 30000000) {
                        i = 128;
                    } else if (iIntValue >= 18000000) {
                        i = 64;
                    } else if (iIntValue >= 12000000) {
                        i = 32;
                    } else if (iIntValue >= 7200000) {
                        i = 16;
                    } else if (iIntValue < 3600000) {
                        i = iIntValue >= 1800000 ? 4 : iIntValue >= 800000 ? 2 : 1;
                    }
                    MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
                    codecProfileLevel.profile = 1;
                    codecProfileLevel.level = i;
                    codecProfileLevelArrZzh = new MediaCodecInfo.CodecProfileLevel[]{codecProfileLevel};
                }
                for (MediaCodecInfo.CodecProfileLevel codecProfileLevel2 : codecProfileLevelArrZzh) {
                    if (codecProfileLevel2.profile != iIntValue2 || ((codecProfileLevel2.level < iIntValue3 && z) || ("video/hevc".equals(this.zzb) && iIntValue2 == 2 && ("sailfish".equals(zzgd.zzb) || "marlin".equals(zzgd.zzb))))) {
                    }
                }
                zzj("codec.profileLevel, " + zzanVar.zzk + ", " + this.zzc);
                return false;
            }
            if (iIntValue2 == 42) {
                iIntValue2 = 42;
                codecProfileLevelArrZzh = zzh();
                if (zzgd.zza <= 23) {
                    MediaCodecInfo.CodecCapabilities codecCapabilities2 = this.zzd;
                    if (codecCapabilities2 != null) {
                        if (iIntValue < 180000000) {
                        }
                        MediaCodecInfo.CodecProfileLevel codecProfileLevel3 = new MediaCodecInfo.CodecProfileLevel();
                        codecProfileLevel3.profile = 1;
                        codecProfileLevel3.level = i;
                        codecProfileLevelArrZzh = new MediaCodecInfo.CodecProfileLevel[]{codecProfileLevel3};
                    }
                }
                while (i < r4) {
                }
                zzj("codec.profileLevel, " + zzanVar.zzk + ", " + this.zzc);
                return false;
            }
        }
        return true;
    }

    private final boolean zzm(zzan zzanVar) {
        return this.zzb.equals(zzanVar.zzn) || this.zzb.equals(zzuj.zzc(zzanVar));
    }

    public final String toString() {
        return this.zza;
    }

    public final Point zza(int i, int i2) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzd;
        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
            return null;
        }
        return zzi(videoCapabilities, i, i2);
    }

    public final zziy zzb(zzan zzanVar, zzan zzanVar2) {
        int i = true != zzgd.zzG(zzanVar.zzn, zzanVar2.zzn) ? 8 : 0;
        if (this.zzh) {
            if (zzanVar.zzv != zzanVar2.zzv) {
                i |= 1024;
            }
            if (!this.zze && (zzanVar.zzs != zzanVar2.zzs || zzanVar.zzt != zzanVar2.zzt)) {
                i |= 512;
            }
            if ((!zzt.zzg(zzanVar.zzz) || !zzt.zzg(zzanVar2.zzz)) && !zzgd.zzG(zzanVar.zzz, zzanVar2.zzz)) {
                i |= 2048;
            }
            String str = this.zza;
            if (zzgd.zzd.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(str) && !zzanVar.zzd(zzanVar2)) {
                i |= 2;
            }
            if (i == 0) {
                return new zziy(this.zza, zzanVar, zzanVar2, true != zzanVar.zzd(zzanVar2) ? 2 : 3, 0);
            }
        } else {
            if (zzanVar.zzA != zzanVar2.zzA) {
                i |= 4096;
            }
            if (zzanVar.zzB != zzanVar2.zzB) {
                i |= 8192;
            }
            if (zzanVar.zzC != zzanVar2.zzC) {
                i |= 16384;
            }
            if (i == 0 && "audio/mp4a-latm".equals(this.zzb)) {
                Pair pairZza = zzuj.zza(zzanVar);
                Pair pairZza2 = zzuj.zza(zzanVar2);
                if (pairZza != null && pairZza2 != null) {
                    int iIntValue = ((Integer) pairZza.first).intValue();
                    int iIntValue2 = ((Integer) pairZza2.first).intValue();
                    if (iIntValue == 42 && iIntValue2 == 42) {
                        return new zziy(this.zza, zzanVar, zzanVar2, 3, 0);
                    }
                }
            }
            if (!zzanVar.zzd(zzanVar2)) {
                i |= 32;
            }
            if ("audio/opus".equals(this.zzb)) {
                i |= 2;
            }
            if (i == 0) {
                return new zziy(this.zza, zzanVar, zzanVar2, 1, 0);
            }
        }
        return new zziy(this.zza, zzanVar, zzanVar2, 0, i);
    }

    public final boolean zzd(zzan zzanVar) {
        return zzm(zzanVar) && zzl(zzanVar, false);
    }

    public final boolean zze(zzan zzanVar) throws zzud {
        if (!zzm(zzanVar) || !zzl(zzanVar, true)) {
            return false;
        }
        if (this.zzh) {
            if (zzanVar.zzs <= 0 || zzanVar.zzt <= 0) {
                return true;
            }
            int i = zzgd.zza;
            return zzg(zzanVar.zzs, zzanVar.zzt, zzanVar.zzu);
        }
        int i2 = zzgd.zza;
        int i3 = zzanVar.zzB;
        if (i3 != -1) {
            MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzd;
            if (codecCapabilities == null) {
                zzj("sampleRate.caps");
                return false;
            }
            MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
            if (audioCapabilities == null) {
                zzj("sampleRate.aCaps");
                return false;
            }
            if (!audioCapabilities.isSampleRateSupported(i3)) {
                zzj("sampleRate.support, " + i3);
                return false;
            }
        }
        int i4 = zzanVar.zzA;
        if (i4 != -1) {
            MediaCodecInfo.CodecCapabilities codecCapabilities2 = this.zzd;
            if (codecCapabilities2 == null) {
                zzj("channelCount.caps");
            } else {
                MediaCodecInfo.AudioCapabilities audioCapabilities2 = codecCapabilities2.getAudioCapabilities();
                if (audioCapabilities2 == null) {
                    zzj("channelCount.aCaps");
                } else {
                    String str = this.zza;
                    String str2 = this.zzb;
                    int maxInputChannelCount = audioCapabilities2.getMaxInputChannelCount();
                    if (maxInputChannelCount <= 1 && ((zzgd.zza < 26 || maxInputChannelCount <= 0) && !"audio/mpeg".equals(str2) && !"audio/3gpp".equals(str2) && !"audio/amr-wb".equals(str2) && !"audio/mp4a-latm".equals(str2) && !"audio/vorbis".equals(str2) && !"audio/opus".equals(str2) && !"audio/raw".equals(str2) && !"audio/flac".equals(str2) && !"audio/g711-alaw".equals(str2) && !"audio/g711-mlaw".equals(str2) && !"audio/gsm".equals(str2))) {
                        int i5 = "audio/ac3".equals(str2) ? 6 : "audio/eac3".equals(str2) ? 16 : 30;
                        zzfk.zzf("MediaCodecInfo", "AssumedMaxChannelAdjustment: " + str + ", [" + maxInputChannelCount + " to " + i5 + "]");
                        maxInputChannelCount = i5;
                    }
                    if (maxInputChannelCount < i4) {
                        zzj("channelCount.support, " + i4);
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final boolean zzf(zzan zzanVar) {
        if (this.zzh) {
            return this.zze;
        }
        Pair pairZza = zzuj.zza(zzanVar);
        return pairZza != null && ((Integer) pairZza.first).intValue() == 42;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean zzg(int i, int i2, double d) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzd;
        if (codecCapabilities == null) {
            zzj("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            zzj("sizeAndRate.vCaps");
            return false;
        }
        if (zzgd.zza >= 29) {
            int iZza = zztr.zza(videoCapabilities, i, i2, d);
            if (iZza != 2) {
                if (iZza == 1) {
                    zzj("sizeAndRate.cover, " + i + "x" + i2 + "@" + d);
                    return false;
                }
                if (!zzk(videoCapabilities, i, i2, d)) {
                }
            }
        } else if (!zzk(videoCapabilities, i, i2, d)) {
            if (i >= i2 || (("OMX.MTK.VIDEO.DECODER.HEVC".equals(this.zza) && "mcv5a".equals(zzgd.zzb)) || !zzk(videoCapabilities, i2, i, d))) {
                zzj("sizeAndRate.support, " + i + "x" + i2 + "@" + d);
                return false;
            }
            zzfk.zzb("MediaCodecInfo", "AssumedSupport [" + ("sizeAndRate.rotated, " + i + "x" + i2 + "@" + d) + "] [" + this.zza + ", " + this.zzb + "] [" + zzgd.zze + "]");
        }
        return true;
    }

    public final MediaCodecInfo.CodecProfileLevel[] zzh() {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzd;
        return (codecCapabilities == null || codecCapabilities.profileLevels == null) ? new MediaCodecInfo.CodecProfileLevel[0] : this.zzd.profileLevels;
    }

    zztp(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        str.getClass();
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = codecCapabilities;
        this.zzg = z;
        this.zze = z4;
        this.zzf = z6;
        this.zzh = zzcg.zzh(str2);
    }
}
