package com.google.android.gms.internal.ads;

import androidx.core.view.ViewCompat;
import com.google.common.net.HttpHeaders;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzakf {
    static final String[] zza = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", HttpHeaders.TRAILER, "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Afro-Punk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop", "Abstract", "Art Rock", "Baroque", "Bhangra", "Big beat", "Breakbeat", "Chillout", "Downtempo", "Dub", "EBM", "Eclectic", "Electro", "Electroclash", "Emo", "Experimental", "Garage", "Global", "IDM", "Illbient", "Industro-Goth", "Jam Band", "Krautrock", "Leftfield", "Lounge", "Math Rock", "New Romantic", "Nu-Breakz", "Post-Punk", "Post-Rock", "Psytrance", "Shoegaze", "Space Rock", "Trop Rock", "World Music", "Neoclassical", "Audiobook", "Audio theatre", "Neue Deutsche Welle", "Podcast", "Indie-Rock", "G-Funk", "Dubstep", "Garage Rock", "Psybient"};
    public static final /* synthetic */ int zzb = 0;

    /* JADX WARN: Removed duplicated region for block: B:136:0x0267 A[Catch: all -> 0x01f9, TryCatch #0 {all -> 0x01f9, blocks: (B:9:0x0030, B:13:0x003a, B:16:0x0043, B:18:0x004f, B:21:0x005b, B:24:0x0068, B:27:0x0077, B:30:0x0084, B:33:0x0091, B:35:0x009b, B:43:0x00b4, B:44:0x00c5, B:45:0x00d8, B:48:0x00e4, B:51:0x00f1, B:54:0x00fe, B:57:0x010b, B:60:0x0118, B:63:0x0125, B:66:0x0132, B:69:0x013f, B:72:0x014c, B:75:0x015c, B:79:0x0170, B:81:0x0176, B:83:0x018b, B:84:0x0192, B:86:0x0199, B:91:0x01a4, B:96:0x01b0, B:136:0x0267, B:97:0x01c5, B:99:0x01cc, B:101:0x01d6, B:102:0x01ea, B:117:0x0219, B:120:0x0226, B:123:0x0232, B:126:0x023e, B:129:0x024a, B:132:0x0256, B:135:0x0260, B:137:0x027b, B:138:0x0282), top: B:143:0x0022 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzcc zza(zzfu zzfuVar) {
        String str;
        zzcc zzahcVar;
        int iZzd = zzfuVar.zzd() + zzfuVar.zzg();
        int iZzg = zzfuVar.zzg();
        int i = (iZzg >> 24) & 255;
        zzcc zzccVarZze = null;
        try {
            if (i == 169 || i == 253) {
                int i2 = iZzg & ViewCompat.MEASURED_SIZE_MASK;
                if (i2 == 6516084) {
                    int iZzg2 = zzfuVar.zzg();
                    if (zzfuVar.zzg() == 1684108385) {
                        zzfuVar.zzL(8);
                        String strZzz = zzfuVar.zzz(iZzg2 - 16);
                        zzccVarZze = new zzahk("und", strZzz, strZzz);
                    } else {
                        zzfk.zzf("MetadataUtil", "Failed to parse comment attribute: ".concat(zzajo.zzf(iZzg)));
                    }
                } else if (i2 == 7233901 || i2 == 7631467) {
                    zzccVarZze = zze(iZzg, "TIT2", zzfuVar);
                } else if (i2 == 6516589 || i2 == 7828084) {
                    zzccVarZze = zze(iZzg, "TCOM", zzfuVar);
                } else if (i2 == 6578553) {
                    zzccVarZze = zze(iZzg, "TDRC", zzfuVar);
                } else if (i2 == 4280916) {
                    zzccVarZze = zze(iZzg, "TPE1", zzfuVar);
                } else if (i2 == 7630703) {
                    zzccVarZze = zze(iZzg, "TSSE", zzfuVar);
                } else if (i2 == 6384738) {
                    zzccVarZze = zze(iZzg, "TALB", zzfuVar);
                } else if (i2 == 7108978) {
                    zzccVarZze = zze(iZzg, "USLT", zzfuVar);
                } else if (i2 == 6776174) {
                    zzccVarZze = zze(iZzg, "TCON", zzfuVar);
                } else if (i2 == 6779504) {
                    zzccVarZze = zze(iZzg, "TIT1", zzfuVar);
                } else {
                    zzfk.zzb("MetadataUtil", "Skipped unknown metadata entry: " + zzajo.zzf(iZzg));
                }
            } else if (iZzg == 1735291493) {
                int iZzb = zzb(zzfuVar);
                String str2 = (iZzb <= 0 || iZzb > 192) ? null : zza[iZzb - 1];
                if (str2 != null) {
                    zzahcVar = new zzahz("TCON", null, zzgbc.zzn(str2));
                    zzccVarZze = zzahcVar;
                } else {
                    zzfk.zzf("MetadataUtil", "Failed to parse standard genre code");
                }
            } else if (iZzg == 1684632427) {
                zzccVarZze = zzd(1684632427, "TPOS", zzfuVar);
            } else if (iZzg == 1953655662) {
                zzccVarZze = zzd(1953655662, "TRCK", zzfuVar);
            } else if (iZzg == 1953329263) {
                zzccVarZze = zzc(1953329263, "TBPM", zzfuVar, true, false);
            } else if (iZzg == 1668311404) {
                zzccVarZze = zzc(1668311404, "TCMP", zzfuVar, true, true);
            } else if (iZzg == 1668249202) {
                int iZzg3 = zzfuVar.zzg();
                if (zzfuVar.zzg() == 1684108385) {
                    int iZzg4 = zzfuVar.zzg() & ViewCompat.MEASURED_SIZE_MASK;
                    if (iZzg4 == 13) {
                        str = "image/jpeg";
                    } else if (iZzg4 == 14) {
                        str = "image/png";
                        iZzg4 = 14;
                    } else {
                        str = null;
                    }
                    if (str == null) {
                        zzfk.zzf("MetadataUtil", "Unrecognized cover art flags: " + iZzg4);
                    } else {
                        zzfuVar.zzL(4);
                        int i3 = iZzg3 - 16;
                        byte[] bArr = new byte[i3];
                        zzfuVar.zzG(bArr, 0, i3);
                        zzahcVar = new zzahc(str, null, 3, bArr);
                        zzccVarZze = zzahcVar;
                    }
                } else {
                    zzfk.zzf("MetadataUtil", "Failed to parse cover art attribute");
                }
            } else if (iZzg == 1631670868) {
                zzccVarZze = zze(1631670868, "TPE2", zzfuVar);
            } else if (iZzg == 1936682605) {
                zzccVarZze = zze(1936682605, "TSOT", zzfuVar);
            } else if (iZzg == 1936679276) {
                zzccVarZze = zze(1936679276, "TSOA", zzfuVar);
            } else if (iZzg == 1936679282) {
                zzccVarZze = zze(1936679282, "TSOP", zzfuVar);
            } else if (iZzg == 1936679265) {
                zzccVarZze = zze(1936679265, "TSO2", zzfuVar);
            } else if (iZzg == 1936679791) {
                zzccVarZze = zze(1936679791, "TSOC", zzfuVar);
            } else if (iZzg == 1920233063) {
                zzccVarZze = zzc(1920233063, "ITUNESADVISORY", zzfuVar, false, false);
            } else if (iZzg == 1885823344) {
                zzccVarZze = zzc(1885823344, "ITUNESGAPLESS", zzfuVar, false, true);
            } else if (iZzg == 1936683886) {
                zzccVarZze = zze(1936683886, "TVSHOWSORT", zzfuVar);
            } else if (iZzg == 1953919848) {
                zzccVarZze = zze(1953919848, "TVSHOW", zzfuVar);
            } else if (iZzg == 757935405) {
                int i4 = -1;
                int i5 = -1;
                String strZzz2 = null;
                String strZzz3 = null;
                while (zzfuVar.zzd() < iZzd) {
                    int iZzd2 = zzfuVar.zzd();
                    int iZzg5 = zzfuVar.zzg();
                    int iZzg6 = zzfuVar.zzg();
                    zzfuVar.zzL(4);
                    if (iZzg6 == 1835360622) {
                        strZzz2 = zzfuVar.zzz(iZzg5 - 12);
                    } else {
                        int i6 = iZzg5 - 12;
                        if (iZzg6 == 1851878757) {
                            strZzz3 = zzfuVar.zzz(i6);
                        } else {
                            if (iZzg6 == 1684108385) {
                                i5 = iZzg5;
                            }
                            if (iZzg6 == 1684108385) {
                                i4 = iZzd2;
                            }
                            zzfuVar.zzL(i6);
                        }
                    }
                }
                if (strZzz2 != null && strZzz3 != null && i4 != -1) {
                    zzfuVar.zzK(i4);
                    zzfuVar.zzL(16);
                    zzccVarZze = new zzaht(strZzz2, strZzz3, zzfuVar.zzz(i5 - 16));
                }
            }
            return zzccVarZze;
        } finally {
            zzfuVar.zzK(iZzd);
        }
    }

    private static int zzb(zzfu zzfuVar) {
        int iZzg = zzfuVar.zzg();
        if (zzfuVar.zzg() == 1684108385) {
            zzfuVar.zzL(8);
            int i = iZzg - 16;
            if (i == 1) {
                return zzfuVar.zzm();
            }
            if (i == 2) {
                return zzfuVar.zzq();
            }
            if (i == 3) {
                return zzfuVar.zzo();
            }
            if (i == 4 && (zzfuVar.zzf() & 128) == 0) {
                return zzfuVar.zzp();
            }
        }
        zzfk.zzf("MetadataUtil", "Failed to parse data atom to int");
        return -1;
    }

    private static zzahr zzc(int i, String str, zzfu zzfuVar, boolean z, boolean z2) {
        int iZzb = zzb(zzfuVar);
        if (z2) {
            iZzb = Math.min(1, iZzb);
        }
        if (iZzb >= 0) {
            return z ? new zzahz(str, null, zzgbc.zzn(Integer.toString(iZzb))) : new zzahk("und", str, Integer.toString(iZzb));
        }
        zzfk.zzf("MetadataUtil", "Failed to parse uint8 attribute: ".concat(zzajo.zzf(i)));
        return null;
    }

    private static zzahz zzd(int i, String str, zzfu zzfuVar) {
        int iZzg = zzfuVar.zzg();
        if (zzfuVar.zzg() == 1684108385 && iZzg >= 22) {
            zzfuVar.zzL(10);
            int iZzq = zzfuVar.zzq();
            if (iZzq > 0) {
                StringBuilder sb = new StringBuilder();
                sb.append(iZzq);
                String string = sb.toString();
                int iZzq2 = zzfuVar.zzq();
                if (iZzq2 > 0) {
                    string = string + "/" + iZzq2;
                }
                return new zzahz(str, null, zzgbc.zzn(string));
            }
        }
        zzfk.zzf("MetadataUtil", "Failed to parse index/count attribute: ".concat(zzajo.zzf(i)));
        return null;
    }

    private static zzahz zze(int i, String str, zzfu zzfuVar) {
        int iZzg = zzfuVar.zzg();
        if (zzfuVar.zzg() == 1684108385) {
            zzfuVar.zzL(8);
            return new zzahz(str, null, zzgbc.zzn(zzfuVar.zzz(iZzg - 16)));
        }
        zzfk.zzf("MetadataUtil", "Failed to parse text attribute: ".concat(zzajo.zzf(i)));
        return null;
    }
}
