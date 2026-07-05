package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.StringReader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzagq {
    private static final String[] zza = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};
    private static final String[] zzb = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};
    private static final String[] zzc = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0088, code lost:
    
        r7 = -9223372036854775807L;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzagm zza(String str) throws XmlPullParserException, IOException, NumberFormatException {
        long j;
        try {
            XmlPullParser xmlPullParserNewPullParser = XmlPullParserFactory.newInstance().newPullParser();
            xmlPullParserNewPullParser.setInput(new StringReader(str));
            xmlPullParserNewPullParser.next();
            if (!zzge.zzc(xmlPullParserNewPullParser, "x:xmpmeta")) {
                throw zzch.zza("Couldn't find xmp metadata", null);
            }
            zzgbc zzgbcVarZzm = zzgbc.zzm();
            long j2 = -9223372036854775807L;
            do {
                xmlPullParserNewPullParser.next();
                if (zzge.zzc(xmlPullParserNewPullParser, "rdf:Description")) {
                    String[] strArr = zza;
                    int i = 0;
                    for (int i2 = 0; i2 < 4; i2++) {
                        String strZza = zzge.zza(xmlPullParserNewPullParser, strArr[i2]);
                        if (strZza != null) {
                            if (Integer.parseInt(strZza) != 1) {
                                return null;
                            }
                            String[] strArr2 = zzb;
                            int i3 = 0;
                            while (true) {
                                if (i3 >= 4) {
                                    break;
                                }
                                String strZza2 = zzge.zza(xmlPullParserNewPullParser, strArr2[i3]);
                                if (strZza2 != null) {
                                    j = Long.parseLong(strZza2);
                                    if (j == -1) {
                                    }
                                } else {
                                    i3++;
                                }
                            }
                            String[] strArr3 = zzc;
                            while (true) {
                                if (i >= 2) {
                                    zzgbcVarZzm = zzgbc.zzm();
                                    break;
                                }
                                String strZza3 = zzge.zza(xmlPullParserNewPullParser, strArr3[i]);
                                if (strZza3 != null) {
                                    zzgbcVarZzm = zzgbc.zzo(new zzagl("image/jpeg", "Primary", 0L, 0L), new zzagl("video/mp4", "MotionPhoto", Long.parseLong(strZza3), 0L));
                                    break;
                                }
                                i++;
                            }
                            j2 = j;
                        }
                    }
                    return null;
                }
                if (zzge.zzc(xmlPullParserNewPullParser, "Container:Directory")) {
                    zzgbcVarZzm = zzb(xmlPullParserNewPullParser, "Container", "Item");
                } else if (zzge.zzc(xmlPullParserNewPullParser, "GContainer:Directory")) {
                    zzgbcVarZzm = zzb(xmlPullParserNewPullParser, "GContainer", "GContainerItem");
                }
            } while (!zzge.zzb(xmlPullParserNewPullParser, "x:xmpmeta"));
            if (zzgbcVarZzm.isEmpty()) {
                return null;
            }
            return new zzagm(j2, zzgbcVarZzm);
        } catch (zzch | NumberFormatException | XmlPullParserException unused) {
            zzfk.zzf("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata");
            return null;
        }
    }

    private static zzgbc zzb(XmlPullParser xmlPullParser, String str, String str2) throws XmlPullParserException, IOException {
        zzgaz zzgazVar = new zzgaz();
        do {
            String strConcat = str.concat(":Item");
            xmlPullParser.next();
            if (zzge.zzc(xmlPullParser, strConcat)) {
                String strConcat2 = str2.concat(":Mime");
                String strConcat3 = str2.concat(":Semantic");
                String strConcat4 = str2.concat(":Length");
                String strConcat5 = str2.concat(":Padding");
                String strZza = zzge.zza(xmlPullParser, strConcat2);
                String strZza2 = zzge.zza(xmlPullParser, strConcat3);
                String strZza3 = zzge.zza(xmlPullParser, strConcat4);
                String strZza4 = zzge.zza(xmlPullParser, strConcat5);
                if (strZza == null || strZza2 == null) {
                    return zzgbc.zzm();
                }
                zzgazVar.zzf(new zzagl(strZza, strZza2, strZza3 != null ? Long.parseLong(strZza3) : 0L, strZza4 != null ? Long.parseLong(strZza4) : 0L));
            }
        } while (!zzge.zzb(xmlPullParser, str.concat(":Directory")));
        return zzgazVar.zzi();
    }
}
