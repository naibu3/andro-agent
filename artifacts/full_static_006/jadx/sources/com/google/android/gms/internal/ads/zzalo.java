package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzalo implements zzalt {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005e  */
    @Override // com.google.android.gms.internal.ads.zzalt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zza(zzan zzanVar) {
        String str = zzanVar.zzn;
        if (str != null) {
            switch (str) {
                case "text/x-ssa":
                case "text/vtt":
                    return 1;
                case "application/x-mp4-vtt":
                    return 2;
                case "application/x-subrip":
                    return 1;
                case "application/x-quicktime-tx3g":
                case "application/pgs":
                case "application/dvbsubs":
                    return 2;
                case "application/ttml+xml":
                    return 1;
            }
        }
        throw new IllegalArgumentException("Unsupported MIME type: ".concat(String.valueOf(str)));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005c  */
    @Override // com.google.android.gms.internal.ads.zzalt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzalv zzb(zzan zzanVar) {
        String str = zzanVar.zzn;
        if (str != null) {
            switch (str) {
                case "text/x-ssa":
                    return new zzaml(zzanVar.zzp);
                case "text/vtt":
                    return new zzanm();
                case "application/x-mp4-vtt":
                    return new zzanb();
                case "application/x-subrip":
                    return new zzamp();
                case "application/x-quicktime-tx3g":
                    return new zzana(zzanVar.zzp);
                case "application/pgs":
                    return new zzamj();
                case "application/dvbsubs":
                    return new zzamh(zzanVar.zzp);
                case "application/ttml+xml":
                    return new zzamv();
            }
        }
        throw new IllegalArgumentException("Unsupported MIME type: ".concat(String.valueOf(str)));
    }

    @Override // com.google.android.gms.internal.ads.zzalt
    public final boolean zzc(zzan zzanVar) {
        String str = zzanVar.zzn;
        return Objects.equals(str, "text/x-ssa") || Objects.equals(str, "text/vtt") || Objects.equals(str, "application/x-mp4-vtt") || Objects.equals(str, "application/x-subrip") || Objects.equals(str, "application/x-quicktime-tx3g") || Objects.equals(str, "application/pgs") || Objects.equals(str, "application/dvbsubs") || Objects.equals(str, "application/ttml+xml");
    }
}
