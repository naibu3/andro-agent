package com.google.android.gms.internal.ads;

import android.net.Uri;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzadn implements zzaea {
    private static final int[] zzb = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14, 17, 18, 19, 20};
    private static final zzadm zzc = new zzadm(new zzadl() { // from class: com.google.android.gms.internal.ads.zzadj
        @Override // com.google.android.gms.internal.ads.zzadl
        public final Constructor zza() {
            if (Boolean.TRUE.equals(Class.forName("androidx.media3.decoder.flac.FlacLibrary").getMethod("isAvailable", new Class[0]).invoke(null, new Object[0]))) {
                return Class.forName("androidx.media3.decoder.flac.FlacExtractor").asSubclass(zzadu.class).getConstructor(Integer.TYPE);
            }
            return null;
        }
    });
    private static final zzadm zzd = new zzadm(new zzadl() { // from class: com.google.android.gms.internal.ads.zzadk
        @Override // com.google.android.gms.internal.ads.zzadl
        public final Constructor zza() {
            return Class.forName("androidx.media3.decoder.midi.MidiExtractor").asSubclass(zzadu.class).getConstructor(new Class[0]);
        }
    });
    private zzgbc zze;
    private final zzalt zzf = new zzalo();

    /* JADX WARN: Removed duplicated region for block: B:107:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01e0 A[Catch: all -> 0x03bf, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0017, B:9:0x001e, B:131:0x01e0, B:132:0x01e3, B:246:0x0391, B:247:0x0394, B:249:0x0399, B:252:0x039f, B:253:0x03a2, B:254:0x03a5, B:255:0x03ac, B:257:0x03b2, B:135:0x01ec, B:137:0x01f4, B:140:0x01fe, B:143:0x020a, B:145:0x0212, B:148:0x021c, B:151:0x0227, B:154:0x0232, B:157:0x023d, B:159:0x0245, B:161:0x024d, B:164:0x0257, B:166:0x0265, B:169:0x026f, B:172:0x027a, B:174:0x0282, B:176:0x0290, B:178:0x029e, B:181:0x02ae, B:183:0x02bc, B:186:0x02c6, B:188:0x02ce, B:190:0x02d6, B:192:0x02de, B:195:0x02e8, B:197:0x02f0, B:200:0x0300, B:202:0x0308, B:205:0x0312, B:207:0x031a, B:210:0x0323, B:212:0x032b, B:215:0x0334, B:218:0x033f, B:221:0x034a, B:224:0x0355, B:226:0x035d, B:229:0x0366, B:14:0x0048, B:15:0x0050, B:108:0x01a9, B:17:0x0055, B:20:0x0061, B:23:0x006c, B:26:0x0078, B:29:0x0084, B:32:0x008f, B:35:0x009b, B:38:0x00a6, B:41:0x00b1, B:44:0x00bd, B:47:0x00c8, B:50:0x00d4, B:53:0x00df, B:56:0x00ea, B:59:0x00f5, B:62:0x0101, B:65:0x010c, B:68:0x0118, B:71:0x0124, B:74:0x0130, B:77:0x013c, B:80:0x0148, B:83:0x0153, B:86:0x015e, B:89:0x0169, B:92:0x0174, B:95:0x017f, B:98:0x0189, B:101:0x0194, B:104:0x019e), top: B:264:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01ec A[Catch: all -> 0x03bf, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0017, B:9:0x001e, B:131:0x01e0, B:132:0x01e3, B:246:0x0391, B:247:0x0394, B:249:0x0399, B:252:0x039f, B:253:0x03a2, B:254:0x03a5, B:255:0x03ac, B:257:0x03b2, B:135:0x01ec, B:137:0x01f4, B:140:0x01fe, B:143:0x020a, B:145:0x0212, B:148:0x021c, B:151:0x0227, B:154:0x0232, B:157:0x023d, B:159:0x0245, B:161:0x024d, B:164:0x0257, B:166:0x0265, B:169:0x026f, B:172:0x027a, B:174:0x0282, B:176:0x0290, B:178:0x029e, B:181:0x02ae, B:183:0x02bc, B:186:0x02c6, B:188:0x02ce, B:190:0x02d6, B:192:0x02de, B:195:0x02e8, B:197:0x02f0, B:200:0x0300, B:202:0x0308, B:205:0x0312, B:207:0x031a, B:210:0x0323, B:212:0x032b, B:215:0x0334, B:218:0x033f, B:221:0x034a, B:224:0x0355, B:226:0x035d, B:229:0x0366, B:14:0x0048, B:15:0x0050, B:108:0x01a9, B:17:0x0055, B:20:0x0061, B:23:0x006c, B:26:0x0078, B:29:0x0084, B:32:0x008f, B:35:0x009b, B:38:0x00a6, B:41:0x00b1, B:44:0x00bd, B:47:0x00c8, B:50:0x00d4, B:53:0x00df, B:56:0x00ea, B:59:0x00f5, B:62:0x0101, B:65:0x010c, B:68:0x0118, B:71:0x0124, B:74:0x0130, B:77:0x013c, B:80:0x0148, B:83:0x0153, B:86:0x015e, B:89:0x0169, B:92:0x0174, B:95:0x017f, B:98:0x0189, B:101:0x0194, B:104:0x019e), top: B:264:0x0003 }] */
    @Override // com.google.android.gms.internal.ads.zzaea
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized zzadu[] zza(Uri uri, Map map) {
        char c;
        int i;
        String lastPathSegment;
        zzadu[] zzaduVarArr;
        ArrayList arrayList = new ArrayList(20);
        List list = (List) map.get("Content-Type");
        String str = (list == null || list.isEmpty()) ? null : (String) list.get(0);
        if (str == null) {
            i = -1;
            if (i != -1) {
                zzb(i, arrayList);
            }
            lastPathSegment = uri.getLastPathSegment();
            if (lastPathSegment != null) {
                int i2 = (lastPathSegment.endsWith(".ac3") || lastPathSegment.endsWith(".ec3")) ? 0 : lastPathSegment.endsWith(".ac4") ? 1 : (lastPathSegment.endsWith(".adts") || lastPathSegment.endsWith(".aac")) ? 2 : lastPathSegment.endsWith(".amr") ? 3 : lastPathSegment.endsWith(".flac") ? 4 : lastPathSegment.endsWith(".flv") ? 5 : (lastPathSegment.endsWith(".mid") || lastPathSegment.endsWith(".midi") || lastPathSegment.endsWith(".smf")) ? 15 : (lastPathSegment.startsWith(".mk", lastPathSegment.length() + (-4)) || lastPathSegment.endsWith(".webm")) ? 6 : lastPathSegment.endsWith(".mp3") ? 7 : (lastPathSegment.endsWith(".mp4") || lastPathSegment.startsWith(".m4", lastPathSegment.length() + (-4)) || lastPathSegment.startsWith(".mp4", lastPathSegment.length() + (-5)) || lastPathSegment.startsWith(".cmf", lastPathSegment.length() + (-5))) ? 8 : (lastPathSegment.startsWith(".og", lastPathSegment.length() + (-4)) || lastPathSegment.endsWith(".opus")) ? 9 : (lastPathSegment.endsWith(".ps") || lastPathSegment.endsWith(".mpeg") || lastPathSegment.endsWith(".mpg") || lastPathSegment.endsWith(".m2p")) ? 10 : (lastPathSegment.endsWith(".ts") || lastPathSegment.startsWith(".ts", lastPathSegment.length() + (-4))) ? 11 : (lastPathSegment.endsWith(".wav") || lastPathSegment.endsWith(".wave")) ? 12 : (lastPathSegment.endsWith(".vtt") || lastPathSegment.endsWith(".webvtt")) ? 13 : (lastPathSegment.endsWith(".jpg") || lastPathSegment.endsWith(".jpeg")) ? 14 : lastPathSegment.endsWith(".avi") ? 16 : lastPathSegment.endsWith(".png") ? 17 : lastPathSegment.endsWith(".webp") ? 18 : (lastPathSegment.endsWith(".bmp") || lastPathSegment.endsWith(".dib")) ? 19 : lastPathSegment.endsWith(".heic") ? 20 : -1;
                if (i2 != -1 && i2 != i) {
                    zzb(i2, arrayList);
                }
                int[] iArr = zzb;
                for (int i3 = 0; i3 < 20; i3++) {
                    int i4 = iArr[i3];
                    if (i4 != i && i4 != i2) {
                        zzb(i4, arrayList);
                    }
                }
                zzaduVarArr = new zzadu[arrayList.size()];
                for (int i5 = 0; i5 < arrayList.size(); i5++) {
                    zzaduVarArr[i5] = (zzadu) arrayList.get(i5);
                }
            }
        } else {
            String strZze = zzcg.zze(str);
            switch (strZze.hashCode()) {
                case -2123537834:
                    if (strZze.equals("audio/eac3-joc")) {
                        c = 2;
                        break;
                    } else {
                        c = 65535;
                        break;
                    }
                case -1662384011:
                    if (strZze.equals("video/mp2p")) {
                        c = 20;
                        break;
                    }
                    break;
                case -1662384007:
                    if (strZze.equals("video/mp2t")) {
                        c = 21;
                        break;
                    }
                    break;
                case -1662095187:
                    if (strZze.equals("video/webm")) {
                        c = '\f';
                        break;
                    }
                    break;
                case -1606874997:
                    if (strZze.equals("audio/amr-wb")) {
                        c = 6;
                        break;
                    }
                    break;
                case -1487464690:
                    if (strZze.equals("image/heif")) {
                        c = 29;
                        break;
                    }
                    break;
                case -1487394660:
                    if (strZze.equals("image/jpeg")) {
                        c = 24;
                        break;
                    }
                    break;
                case -1487018032:
                    if (strZze.equals("image/webp")) {
                        c = 27;
                        break;
                    }
                    break;
                case -1248337486:
                    if (strZze.equals("application/mp4")) {
                        c = 18;
                        break;
                    }
                    break;
                case -1079884372:
                    if (strZze.equals("video/x-msvideo")) {
                        c = 25;
                        break;
                    }
                    break;
                case -1004728940:
                    if (strZze.equals("text/vtt")) {
                        c = 23;
                        break;
                    }
                    break;
                case -879272239:
                    if (strZze.equals("image/bmp")) {
                        c = 28;
                        break;
                    }
                    break;
                case -879258763:
                    if (strZze.equals("image/png")) {
                        c = 26;
                        break;
                    }
                    break;
                case -387023398:
                    if (strZze.equals("audio/x-matroska")) {
                        c = 11;
                        break;
                    }
                    break;
                case -43467528:
                    if (strZze.equals("application/webm")) {
                        c = 14;
                        break;
                    }
                    break;
                case 13915911:
                    if (strZze.equals("video/x-flv")) {
                        c = '\b';
                        break;
                    }
                    break;
                case 187078296:
                    if (strZze.equals("audio/ac3")) {
                        c = 0;
                        break;
                    }
                    break;
                case 187078297:
                    if (strZze.equals("audio/ac4")) {
                        c = 3;
                        break;
                    }
                    break;
                case 187078669:
                    if (strZze.equals("audio/amr")) {
                        c = 4;
                        break;
                    }
                    break;
                case 187090232:
                    if (strZze.equals("audio/mp4")) {
                        c = 17;
                        break;
                    }
                    break;
                case 187091926:
                    if (strZze.equals("audio/ogg")) {
                        c = 19;
                        break;
                    }
                    break;
                case 187099443:
                    if (strZze.equals("audio/wav")) {
                        c = 22;
                        break;
                    }
                    break;
                case 1331848029:
                    if (strZze.equals("video/mp4")) {
                        c = 16;
                        break;
                    }
                    break;
                case 1503095341:
                    if (strZze.equals("audio/3gpp")) {
                        c = 5;
                        break;
                    }
                    break;
                case 1504578661:
                    if (strZze.equals("audio/eac3")) {
                        c = 1;
                        break;
                    }
                    break;
                case 1504619009:
                    if (strZze.equals("audio/flac")) {
                        c = 7;
                        break;
                    }
                    break;
                case 1504824762:
                    if (strZze.equals("audio/midi")) {
                        c = '\t';
                        break;
                    }
                    break;
                case 1504831518:
                    if (strZze.equals("audio/mpeg")) {
                        c = 15;
                        break;
                    }
                    break;
                case 1505118770:
                    if (strZze.equals("audio/webm")) {
                        c = '\r';
                        break;
                    }
                    break;
                case 2039520277:
                    if (strZze.equals("video/x-matroska")) {
                        c = '\n';
                        break;
                    }
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                case 1:
                case 2:
                    i = 0;
                    break;
                case 3:
                    i = 1;
                    break;
                case 4:
                case 5:
                case 6:
                    i = 3;
                    break;
                case 7:
                    i = 4;
                    break;
                case '\b':
                    i = 5;
                    break;
                case '\t':
                    i = 15;
                    break;
                case '\n':
                case 11:
                case '\f':
                case '\r':
                case 14:
                    i = 6;
                    break;
                case 15:
                    i = 7;
                    break;
                case 16:
                case 17:
                case 18:
                    i = 8;
                    break;
                case 19:
                    i = 9;
                    break;
                case 20:
                    i = 10;
                    break;
                case 21:
                    i = 11;
                    break;
                case 22:
                    i = 12;
                    break;
                case 23:
                    i = 13;
                    break;
                case 24:
                    i = 14;
                    break;
                case 25:
                    i = 16;
                    break;
                case 26:
                    i = 17;
                    break;
                case 27:
                    i = 18;
                    break;
                case 28:
                    i = 19;
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HORIZONTAL_BIAS /* 29 */:
                    i = 20;
                    break;
                default:
                    i = -1;
                    break;
            }
            if (i != -1) {
            }
            lastPathSegment = uri.getLastPathSegment();
            if (lastPathSegment != null) {
            }
        }
        return zzaduVarArr;
    }

    private final void zzb(int i, List list) {
        switch (i) {
            case 0:
                list.add(new zzanr());
                break;
            case 1:
                list.add(new zzanu());
                break;
            case 2:
                list.add(new zzanx(0));
                break;
            case 3:
                list.add(new zzafi(0));
                break;
            case 4:
                zzadu zzaduVarZza = zzc.zza(0);
                if (zzaduVarZza == null) {
                    list.add(new zzaga(0));
                    break;
                } else {
                    list.add(zzaduVarZza);
                    break;
                }
            case 5:
                list.add(new zzagd());
                break;
            case 6:
                list.add(new zzaiy(this.zzf, 2));
                break;
            case 7:
                list.add(new zzajg(0));
                break;
            case 8:
                list.add(new zzakd(this.zzf, 32));
                list.add(new zzakj(this.zzf, 16));
                break;
            case 9:
                list.add(new zzala());
                break;
            case 10:
                list.add(new zzapa());
                break;
            case 11:
                if (this.zze == null) {
                    this.zze = zzgbc.zzm();
                }
                list.add(new zzapk(1, 1, this.zzf, new zzgb(0L), new zzanz(0, this.zze), 112800));
                break;
            case 12:
                list.add(new zzapw());
                break;
            case 14:
                list.add(new zzagj(0));
                break;
            case 15:
                zzadu zzaduVarZza2 = zzd.zza(new Object[0]);
                if (zzaduVarZza2 != null) {
                    list.add(zzaduVarZza2);
                    break;
                }
                break;
            case 16:
                list.add(new zzafn(1, this.zzf));
                break;
            case 17:
                list.add(new zzall());
                break;
            case 18:
                list.add(new zzaqb());
                break;
            case 19:
                list.add(new zzafu());
                break;
            case 20:
                list.add(new zzagi());
                break;
        }
    }
}
