package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zztq {
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0088, code lost:
    
        if (zzb(r7, new android.media.MediaCodecInfo.VideoCapabilities.PerformancePoint(1280, 720, 60)) != 1) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009f A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int zza(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        List<MediaCodecInfo.VideoCapabilities.PerformancePoint> supportedPerformancePoints;
        List<MediaCodecInfo.VideoCapabilities.PerformancePoint> supportedPerformancePoints2 = videoCapabilities.getSupportedPerformancePoints();
        if (supportedPerformancePoints2 == null || supportedPerformancePoints2.isEmpty()) {
            return 0;
        }
        int iZzb = zzb(supportedPerformancePoints2, new MediaCodecInfo.VideoCapabilities.PerformancePoint(i, i2, (int) d));
        boolean z = true;
        if (iZzb == 1 && zztr.zza == null) {
            if (zzgd.zza >= 35) {
                z = false;
                zztr.zza = Boolean.valueOf(z);
                if (!zztr.zza.booleanValue()) {
                    return 0;
                }
            } else {
                try {
                    zzal zzalVar = new zzal();
                    zzalVar.zzX("video/avc");
                    zzan zzanVarZzad = zzalVar.zzad();
                    if (zzanVarZzad.zzn != null) {
                        List listZzf = zzuj.zzf(zztx.zza, zzanVarZzad, false, false);
                        int i3 = 0;
                        while (true) {
                            if (i3 < listZzf.size()) {
                                if (((zztp) listZzf.get(i3)).zzd != null && ((zztp) listZzf.get(i3)).zzd.getVideoCapabilities() != null && (supportedPerformancePoints = ((zztp) listZzf.get(i3)).zzd.getVideoCapabilities().getSupportedPerformancePoints()) != null && !supportedPerformancePoints.isEmpty()) {
                                    break;
                                }
                                i3++;
                            } else {
                                break;
                            }
                        }
                    }
                } catch (zzud unused) {
                }
                zztr.zza = Boolean.valueOf(z);
                if (!zztr.zza.booleanValue()) {
                }
            }
        }
        return iZzb;
    }

    private static int zzb(List list, MediaCodecInfo.VideoCapabilities.PerformancePoint performancePoint) {
        for (int i = 0; i < list.size(); i++) {
            if (((MediaCodecInfo.VideoCapabilities.PerformancePoint) list.get(i)).covers(performancePoint)) {
                return 2;
            }
        }
        return 1;
    }
}
