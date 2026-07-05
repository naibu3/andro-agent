package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Pair;
import android.view.Surface;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.text.HtmlCompat;
import androidx.work.WorkRequest;
import com.google.android.gms.common.Scopes;
import com.google.android.gms.location.LocationRequest;
import com.google.common.base.Ascii;
import java.nio.ByteBuffer;
import java.util.List;
import kotlin.io.encoding.Base64;
import kotlin.text.Typography;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import kotlinx.coroutines.scheduling.WorkQueueKt;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzabj extends zztv implements zzabp {
    private static final int[] zzb = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};
    private static boolean zzc;
    private static boolean zzd;
    private zzdv zzA;
    private boolean zzB;
    private boolean zzC;
    private int zzD;
    private zzabn zzE;
    private zzacm zzF;
    private final Context zze;
    private final zzacn zzf;
    private final zzach zzg;
    private final boolean zzh;
    private final zzabq zzi;
    private final zzabo zzj;
    private zzabi zzk;
    private boolean zzl;
    private boolean zzm;
    private Surface zzn;
    private zzfv zzo;
    private zzabm zzp;
    private boolean zzq;
    private int zzr;
    private long zzs;
    private int zzt;
    private int zzu;
    private int zzv;
    private long zzw;
    private int zzx;
    private long zzy;
    private zzdv zzz;

    public zzabj(Context context, zztl zztlVar, zztx zztxVar, long j, boolean z, Handler handler, zzaci zzaciVar, int i, float f) {
        super(2, zztlVar, zztxVar, false, 30.0f);
        Context applicationContext = context.getApplicationContext();
        this.zze = applicationContext;
        this.zzg = new zzach(handler, zzaciVar);
        zzabc zzabcVarZzc = new zzaar(applicationContext).zzc();
        if (zzabcVarZzc.zzc() == null) {
            zzabcVarZzc.zzs(new zzabq(applicationContext, this, 0L));
        }
        this.zzf = zzabcVarZzc;
        zzabq zzabqVarZzc = zzabcVarZzc.zzc();
        zzeq.zzb(zzabqVarZzc);
        this.zzi = zzabqVarZzc;
        this.zzj = new zzabo();
        this.zzh = "NVIDIA".equals(zzgd.zzc);
        this.zzr = 1;
        this.zzz = zzdv.zza;
        this.zzD = 0;
        this.zzA = null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0080 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0083 A[Catch: all -> 0x07aa, TRY_ENTER, TryCatch #0 {, blocks: (B:7:0x000f, B:9:0x0013, B:11:0x0021, B:514:0x07a2, B:42:0x0083, B:44:0x0089, B:47:0x0094, B:80:0x00ff, B:82:0x0105, B:507:0x078e, B:515:0x07a6), top: B:521:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:505:0x078a  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00fb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected static final boolean zzaQ(String str) {
        boolean z;
        boolean z2;
        boolean z3 = false;
        if (str.startsWith("OMX.google")) {
            return false;
        }
        synchronized (zzabj.class) {
            if (!zzc) {
                char c = 28;
                if (zzgd.zza <= 28) {
                    String str2 = zzgd.zzb;
                    switch (str2.hashCode()) {
                        case -1339091551:
                            if (!str2.equals("dangal")) {
                                z2 = -1;
                                break;
                            } else {
                                z2 = true;
                                break;
                            }
                        case -1220081023:
                            if (str2.equals("dangalFHD")) {
                                z2 = 3;
                                break;
                            }
                            break;
                        case -1220066608:
                            if (str2.equals("dangalUHD")) {
                                z2 = 2;
                                break;
                            }
                            break;
                        case -1012436106:
                            if (str2.equals("oneday")) {
                                z2 = 7;
                                break;
                            }
                            break;
                        case -760312546:
                            if (str2.equals("aquaman")) {
                                z2 = false;
                                break;
                            }
                            break;
                        case -64886864:
                            if (str2.equals("magnolia")) {
                                z2 = 4;
                                break;
                            }
                            break;
                        case 3415681:
                            if (str2.equals("once")) {
                                z2 = 6;
                                break;
                            }
                            break;
                        case 825323514:
                            if (str2.equals("machuca")) {
                                z2 = 5;
                                break;
                            }
                            break;
                    }
                    switch (z2) {
                        default:
                            if (zzgd.zza > 27 || !"HWEML".equals(zzgd.zzb)) {
                                String str3 = zzgd.zzd;
                                switch (str3.hashCode()) {
                                    case -349662828:
                                        if (!str3.equals("AFTJMST12")) {
                                            z = -1;
                                            break;
                                        } else {
                                            z = 6;
                                            break;
                                        }
                                    case -321033677:
                                        if (str3.equals("AFTKMST12")) {
                                            z = 7;
                                            break;
                                        }
                                        break;
                                    case 2006354:
                                        if (str3.equals("AFTA")) {
                                            z = false;
                                            break;
                                        }
                                        break;
                                    case 2006367:
                                        if (str3.equals("AFTN")) {
                                            z = true;
                                            break;
                                        }
                                        break;
                                    case 2006371:
                                        if (str3.equals("AFTR")) {
                                            z = 2;
                                            break;
                                        }
                                        break;
                                    case 1785421873:
                                        if (str3.equals("AFTEU011")) {
                                            z = 3;
                                            break;
                                        }
                                        break;
                                    case 1785421876:
                                        if (str3.equals("AFTEU014")) {
                                            z = 4;
                                            break;
                                        }
                                        break;
                                    case 1798172390:
                                        if (str3.equals("AFTSO001")) {
                                            z = 8;
                                            break;
                                        }
                                        break;
                                    case 2119412532:
                                        if (str3.equals("AFTEUFF014")) {
                                            z = 5;
                                            break;
                                        }
                                        break;
                                }
                                switch (z) {
                                    default:
                                        if (zzgd.zza <= 26) {
                                            String str4 = zzgd.zzb;
                                            switch (str4.hashCode()) {
                                                case -2144781245:
                                                    if (!str4.equals("GIONEE_SWW1609")) {
                                                        c = 65535;
                                                        break;
                                                    } else {
                                                        c = '6';
                                                        break;
                                                    }
                                                case -2144781185:
                                                    if (str4.equals("GIONEE_SWW1627")) {
                                                        c = '7';
                                                        break;
                                                    }
                                                    break;
                                                case -2144781160:
                                                    if (str4.equals("GIONEE_SWW1631")) {
                                                        c = '8';
                                                        break;
                                                    }
                                                    break;
                                                case -2097309513:
                                                    if (str4.equals("K50a40")) {
                                                        c = 'J';
                                                        break;
                                                    }
                                                    break;
                                                case -2022874474:
                                                    if (str4.equals("CP8676_I02")) {
                                                        c = 22;
                                                        break;
                                                    }
                                                    break;
                                                case -1978993182:
                                                    if (str4.equals("NX541J")) {
                                                        c = 'Y';
                                                        break;
                                                    }
                                                    break;
                                                case -1978990237:
                                                    if (str4.equals("NX573J")) {
                                                        c = 'Z';
                                                        break;
                                                    }
                                                    break;
                                                case -1936688988:
                                                    if (str4.equals("PGN528")) {
                                                        c = 'e';
                                                        break;
                                                    }
                                                    break;
                                                case -1936688066:
                                                    if (str4.equals("PGN610")) {
                                                        c = 'f';
                                                        break;
                                                    }
                                                    break;
                                                case -1936688065:
                                                    if (str4.equals("PGN611")) {
                                                        c = 'g';
                                                        break;
                                                    }
                                                    break;
                                                case -1931988508:
                                                    if (str4.equals("AquaPowerM")) {
                                                        c = '\r';
                                                        break;
                                                    }
                                                    break;
                                                case -1885099851:
                                                    if (str4.equals("RAIJIN")) {
                                                        c = 't';
                                                        break;
                                                    }
                                                    break;
                                                case -1696512866:
                                                    if (str4.equals("XT1663")) {
                                                        c = 137;
                                                        break;
                                                    }
                                                    break;
                                                case -1680025915:
                                                    if (str4.equals("ComioS1")) {
                                                        c = 21;
                                                        break;
                                                    }
                                                    break;
                                                case -1615810839:
                                                    if (str4.equals("Phantom6")) {
                                                        c = 'h';
                                                        break;
                                                    }
                                                    break;
                                                case -1600724499:
                                                    if (str4.equals("pacificrim")) {
                                                        c = '_';
                                                        break;
                                                    }
                                                    break;
                                                case -1554255044:
                                                    if (str4.equals("vernee_M5")) {
                                                        c = 130;
                                                        break;
                                                    }
                                                    break;
                                                case -1481772737:
                                                    if (str4.equals("panell_dl")) {
                                                        c = 'a';
                                                        break;
                                                    }
                                                    break;
                                                case -1481772730:
                                                    if (str4.equals("panell_ds")) {
                                                        c = 'b';
                                                        break;
                                                    }
                                                    break;
                                                case -1481772729:
                                                    if (str4.equals("panell_dt")) {
                                                        c = 'c';
                                                        break;
                                                    }
                                                    break;
                                                case -1320080169:
                                                    if (str4.equals("GiONEE_GBL7319")) {
                                                        c = '4';
                                                        break;
                                                    }
                                                    break;
                                                case -1217592143:
                                                    if (str4.equals("BRAVIA_ATV2")) {
                                                        c = 18;
                                                        break;
                                                    }
                                                    break;
                                                case -1180384755:
                                                    if (str4.equals("iris60")) {
                                                        c = 'F';
                                                        break;
                                                    }
                                                    break;
                                                case -1139198265:
                                                    if (str4.equals("Slate_Pro")) {
                                                        c = 'v';
                                                        break;
                                                    }
                                                    break;
                                                case -1052835013:
                                                    if (str4.equals("namath")) {
                                                        c = 'W';
                                                        break;
                                                    }
                                                    break;
                                                case -993250464:
                                                    if (str4.equals("A10-70F")) {
                                                        c = 5;
                                                        break;
                                                    }
                                                    break;
                                                case -993250458:
                                                    if (str4.equals("A10-70L")) {
                                                        c = 6;
                                                        break;
                                                    }
                                                    break;
                                                case -965403638:
                                                    if (str4.equals("s905x018")) {
                                                        c = 'x';
                                                        break;
                                                    }
                                                    break;
                                                case -958336948:
                                                    if (str4.equals("ELUGA_Ray_X")) {
                                                        c = Typography.quote;
                                                        break;
                                                    }
                                                    break;
                                                case -879245230:
                                                    if (str4.equals("tcl_eu")) {
                                                        c = '~';
                                                        break;
                                                    }
                                                    break;
                                                case -842500323:
                                                    if (str4.equals("nicklaus_f")) {
                                                        c = 'X';
                                                        break;
                                                    }
                                                    break;
                                                case -821392978:
                                                    if (str4.equals("A7000-a")) {
                                                        c = '\t';
                                                        break;
                                                    }
                                                    break;
                                                case -797483286:
                                                    if (str4.equals("SVP-DTV15")) {
                                                        c = 'w';
                                                        break;
                                                    }
                                                    break;
                                                case -794946968:
                                                    if (str4.equals("watson")) {
                                                        c = 131;
                                                        break;
                                                    }
                                                    break;
                                                case -788334647:
                                                    if (str4.equals("whyred")) {
                                                        c = 132;
                                                        break;
                                                    }
                                                    break;
                                                case -782144577:
                                                    if (str4.equals("OnePlus5T")) {
                                                        c = '[';
                                                        break;
                                                    }
                                                    break;
                                                case -575125681:
                                                    if (str4.equals("GiONEE_CBL7513")) {
                                                        c = '3';
                                                        break;
                                                    }
                                                    break;
                                                case -521118391:
                                                    if (str4.equals("GIONEE_GBL7360")) {
                                                        c = '5';
                                                        break;
                                                    }
                                                    break;
                                                case -430914369:
                                                    if (str4.equals("Pixi4-7_3G")) {
                                                        c = 'i';
                                                        break;
                                                    }
                                                    break;
                                                case -290434366:
                                                    if (str4.equals("taido_row")) {
                                                        c = 'y';
                                                        break;
                                                    }
                                                    break;
                                                case -282781963:
                                                    if (str4.equals("BLACK-1X")) {
                                                        c = 17;
                                                        break;
                                                    }
                                                    break;
                                                case -277133239:
                                                    if (str4.equals("Z12_PRO")) {
                                                        c = 138;
                                                        break;
                                                    }
                                                    break;
                                                case -173639913:
                                                    if (str4.equals("ELUGA_A3_Pro")) {
                                                        c = 31;
                                                        break;
                                                    }
                                                    break;
                                                case -56598463:
                                                    if (str4.equals("woods_fn")) {
                                                        c = 134;
                                                        break;
                                                    }
                                                    break;
                                                case 2126:
                                                    if (str4.equals("C1")) {
                                                        c = 20;
                                                        break;
                                                    }
                                                    break;
                                                case 2564:
                                                    if (str4.equals("Q5")) {
                                                        c = 'q';
                                                        break;
                                                    }
                                                    break;
                                                case 2715:
                                                    if (str4.equals("V1")) {
                                                        c = Ascii.MAX;
                                                        break;
                                                    }
                                                    break;
                                                case 2719:
                                                    if (str4.equals("V5")) {
                                                        c = 129;
                                                        break;
                                                    }
                                                    break;
                                                case 3091:
                                                    if (str4.equals("b5")) {
                                                        c = 16;
                                                        break;
                                                    }
                                                    break;
                                                case 3483:
                                                    if (str4.equals("mh")) {
                                                        c = 'T';
                                                        break;
                                                    }
                                                    break;
                                                case 73405:
                                                    if (str4.equals("JGZ")) {
                                                        c = 'I';
                                                        break;
                                                    }
                                                    break;
                                                case 75537:
                                                    if (str4.equals("M04")) {
                                                        c = 'O';
                                                        break;
                                                    }
                                                    break;
                                                case 75739:
                                                    if (str4.equals("M5c")) {
                                                        c = 'P';
                                                        break;
                                                    }
                                                    break;
                                                case 76779:
                                                    if (str4.equals("MX6")) {
                                                        c = 'V';
                                                        break;
                                                    }
                                                    break;
                                                case 78669:
                                                    if (str4.equals("P85")) {
                                                        c = '^';
                                                        break;
                                                    }
                                                    break;
                                                case 79305:
                                                    if (str4.equals("PLE")) {
                                                        c = 'k';
                                                        break;
                                                    }
                                                    break;
                                                case 80618:
                                                    if (str4.equals("QX1")) {
                                                        c = 's';
                                                        break;
                                                    }
                                                    break;
                                                case 88274:
                                                    if (str4.equals("Z80")) {
                                                        c = 139;
                                                        break;
                                                    }
                                                    break;
                                                case 98846:
                                                    if (str4.equals("cv1")) {
                                                        c = 26;
                                                        break;
                                                    }
                                                    break;
                                                case 98848:
                                                    if (str4.equals("cv3")) {
                                                        c = 27;
                                                        break;
                                                    }
                                                    break;
                                                case 99329:
                                                    if (!str4.equals("deb")) {
                                                    }
                                                    break;
                                                case 101481:
                                                    if (str4.equals("flo")) {
                                                        c = '1';
                                                        break;
                                                    }
                                                    break;
                                                case 1513190:
                                                    if (str4.equals("1601")) {
                                                        c = 0;
                                                        break;
                                                    }
                                                    break;
                                                case 1514184:
                                                    if (str4.equals("1713")) {
                                                        c = 1;
                                                        break;
                                                    }
                                                    break;
                                                case 1514185:
                                                    if (str4.equals("1714")) {
                                                        c = 2;
                                                        break;
                                                    }
                                                    break;
                                                case 2133089:
                                                    if (str4.equals("F01H")) {
                                                        c = Typography.dollar;
                                                        break;
                                                    }
                                                    break;
                                                case 2133091:
                                                    if (str4.equals("F01J")) {
                                                        c = '%';
                                                        break;
                                                    }
                                                    break;
                                                case 2133120:
                                                    if (str4.equals("F02H")) {
                                                        c = Typography.amp;
                                                        break;
                                                    }
                                                    break;
                                                case 2133151:
                                                    if (str4.equals("F03H")) {
                                                        c = '\'';
                                                        break;
                                                    }
                                                    break;
                                                case 2133182:
                                                    if (str4.equals("F04H")) {
                                                        c = '(';
                                                        break;
                                                    }
                                                    break;
                                                case 2133184:
                                                    if (str4.equals("F04J")) {
                                                        c = ')';
                                                        break;
                                                    }
                                                    break;
                                                case 2436959:
                                                    if (str4.equals("P681")) {
                                                        c = ']';
                                                        break;
                                                    }
                                                    break;
                                                case 2463773:
                                                    if (str4.equals("Q350")) {
                                                        c = 'm';
                                                        break;
                                                    }
                                                    break;
                                                case 2464648:
                                                    if (str4.equals("Q427")) {
                                                        c = 'o';
                                                        break;
                                                    }
                                                    break;
                                                case 2689555:
                                                    if (str4.equals("XE2X")) {
                                                        c = 136;
                                                        break;
                                                    }
                                                    break;
                                                case 3154429:
                                                    if (str4.equals("fugu")) {
                                                        c = '2';
                                                        break;
                                                    }
                                                    break;
                                                case 3284551:
                                                    if (str4.equals("kate")) {
                                                        c = 'K';
                                                        break;
                                                    }
                                                    break;
                                                case 3351335:
                                                    if (str4.equals("mido")) {
                                                        c = 'U';
                                                        break;
                                                    }
                                                    break;
                                                case 3386211:
                                                    if (str4.equals("p212")) {
                                                        c = '\\';
                                                        break;
                                                    }
                                                    break;
                                                case 41325051:
                                                    if (str4.equals("MEIZU_M5")) {
                                                        c = 'S';
                                                        break;
                                                    }
                                                    break;
                                                case 51349633:
                                                    if (str4.equals("601LV")) {
                                                        c = 3;
                                                        break;
                                                    }
                                                    break;
                                                case 51350594:
                                                    if (str4.equals("602LV")) {
                                                        c = 4;
                                                        break;
                                                    }
                                                    break;
                                                case 55178625:
                                                    if (str4.equals("Aura_Note_2")) {
                                                        c = 15;
                                                        break;
                                                    }
                                                    break;
                                                case 61542055:
                                                    if (str4.equals("A1601")) {
                                                        c = 7;
                                                        break;
                                                    }
                                                    break;
                                                case 65355429:
                                                    if (str4.equals("E5643")) {
                                                        c = 30;
                                                        break;
                                                    }
                                                    break;
                                                case 66214468:
                                                    if (str4.equals("F3111")) {
                                                        c = '*';
                                                        break;
                                                    }
                                                    break;
                                                case 66214470:
                                                    if (str4.equals("F3113")) {
                                                        c = '+';
                                                        break;
                                                    }
                                                    break;
                                                case 66214473:
                                                    if (str4.equals("F3116")) {
                                                        c = ',';
                                                        break;
                                                    }
                                                    break;
                                                case 66215429:
                                                    if (str4.equals("F3211")) {
                                                        c = '-';
                                                        break;
                                                    }
                                                    break;
                                                case 66215431:
                                                    if (str4.equals("F3213")) {
                                                        c = '.';
                                                        break;
                                                    }
                                                    break;
                                                case 66215433:
                                                    if (str4.equals("F3215")) {
                                                        c = '/';
                                                        break;
                                                    }
                                                    break;
                                                case 66216390:
                                                    if (str4.equals("F3311")) {
                                                        c = '0';
                                                        break;
                                                    }
                                                    break;
                                                case 76402249:
                                                    if (str4.equals("PRO7S")) {
                                                        c = 'l';
                                                        break;
                                                    }
                                                    break;
                                                case 76404105:
                                                    if (str4.equals("Q4260")) {
                                                        c = 'n';
                                                        break;
                                                    }
                                                    break;
                                                case 76404911:
                                                    if (str4.equals("Q4310")) {
                                                        c = 'p';
                                                        break;
                                                    }
                                                    break;
                                                case 80963634:
                                                    if (str4.equals("V23GB")) {
                                                        c = 128;
                                                        break;
                                                    }
                                                    break;
                                                case 82882791:
                                                    if (str4.equals("X3_HK")) {
                                                        c = 135;
                                                        break;
                                                    }
                                                    break;
                                                case 98715550:
                                                    if (str4.equals("i9031")) {
                                                        c = 'C';
                                                        break;
                                                    }
                                                    break;
                                                case 101370885:
                                                    if (str4.equals("l5460")) {
                                                        c = 'L';
                                                        break;
                                                    }
                                                    break;
                                                case 102844228:
                                                    if (str4.equals("le_x6")) {
                                                        c = 'M';
                                                        break;
                                                    }
                                                    break;
                                                case 165221241:
                                                    if (str4.equals("A2016a40")) {
                                                        c = '\b';
                                                        break;
                                                    }
                                                    break;
                                                case 182191441:
                                                    if (str4.equals("CPY83_I00")) {
                                                        c = 25;
                                                        break;
                                                    }
                                                    break;
                                                case 245388979:
                                                    if (str4.equals("marino_f")) {
                                                        c = 'R';
                                                        break;
                                                    }
                                                    break;
                                                case 287431619:
                                                    if (str4.equals("griffin")) {
                                                        c = Typography.less;
                                                        break;
                                                    }
                                                    break;
                                                case 307593612:
                                                    if (str4.equals("A7010a48")) {
                                                        c = 11;
                                                        break;
                                                    }
                                                    break;
                                                case 308517133:
                                                    if (str4.equals("A7020a48")) {
                                                        c = '\f';
                                                        break;
                                                    }
                                                    break;
                                                case 316215098:
                                                    if (str4.equals("TB3-730F")) {
                                                        c = 'z';
                                                        break;
                                                    }
                                                    break;
                                                case 316215116:
                                                    if (str4.equals("TB3-730X")) {
                                                        c = '{';
                                                        break;
                                                    }
                                                    break;
                                                case 316246811:
                                                    if (str4.equals("TB3-850F")) {
                                                        c = '|';
                                                        break;
                                                    }
                                                    break;
                                                case 316246818:
                                                    if (str4.equals("TB3-850M")) {
                                                        c = '}';
                                                        break;
                                                    }
                                                    break;
                                                case 407160593:
                                                    if (str4.equals("Pixi5-10_4G")) {
                                                        c = 'j';
                                                        break;
                                                    }
                                                    break;
                                                case 507412548:
                                                    if (str4.equals("QM16XE_U")) {
                                                        c = 'r';
                                                        break;
                                                    }
                                                    break;
                                                case 793982701:
                                                    if (str4.equals("GIONEE_WBL5708")) {
                                                        c = '9';
                                                        break;
                                                    }
                                                    break;
                                                case 794038622:
                                                    if (str4.equals("GIONEE_WBL7365")) {
                                                        c = ':';
                                                        break;
                                                    }
                                                    break;
                                                case 794040393:
                                                    if (str4.equals("GIONEE_WBL7519")) {
                                                        c = ';';
                                                        break;
                                                    }
                                                    break;
                                                case 835649806:
                                                    if (str4.equals("manning")) {
                                                        c = 'Q';
                                                        break;
                                                    }
                                                    break;
                                                case 917340916:
                                                    if (str4.equals("A7000plus")) {
                                                        c = '\n';
                                                        break;
                                                    }
                                                    break;
                                                case 958008161:
                                                    if (str4.equals("j2xlteins")) {
                                                        c = 'H';
                                                        break;
                                                    }
                                                    break;
                                                case 1060579533:
                                                    if (str4.equals("panell_d")) {
                                                        c = '`';
                                                        break;
                                                    }
                                                    break;
                                                case 1150207623:
                                                    if (str4.equals("LS-5017")) {
                                                        c = 'N';
                                                        break;
                                                    }
                                                    break;
                                                case 1176899427:
                                                    if (str4.equals("itel_S41")) {
                                                        c = 'G';
                                                        break;
                                                    }
                                                    break;
                                                case 1280332038:
                                                    if (str4.equals("hwALE-H")) {
                                                        c = Typography.greater;
                                                        break;
                                                    }
                                                    break;
                                                case 1306947716:
                                                    if (str4.equals("EverStar_S")) {
                                                        c = '#';
                                                        break;
                                                    }
                                                    break;
                                                case 1349174697:
                                                    if (str4.equals("htc_e56ml_dtul")) {
                                                        c = '=';
                                                        break;
                                                    }
                                                    break;
                                                case 1522194893:
                                                    if (str4.equals("woods_f")) {
                                                        c = 133;
                                                        break;
                                                    }
                                                    break;
                                                case 1691543273:
                                                    if (str4.equals("CPH1609")) {
                                                        c = 23;
                                                        break;
                                                    }
                                                    break;
                                                case 1691544261:
                                                    if (str4.equals("CPH1715")) {
                                                        c = 24;
                                                        break;
                                                    }
                                                    break;
                                                case 1709443163:
                                                    if (str4.equals("iball8735_9806")) {
                                                        c = 'D';
                                                        break;
                                                    }
                                                    break;
                                                case 1865889110:
                                                    if (str4.equals("santoni")) {
                                                        c = 'u';
                                                        break;
                                                    }
                                                    break;
                                                case 1906253259:
                                                    if (str4.equals("PB2-670M")) {
                                                        c = 'd';
                                                        break;
                                                    }
                                                    break;
                                                case 1977196784:
                                                    if (str4.equals("Infinix-X572")) {
                                                        c = 'E';
                                                        break;
                                                    }
                                                    break;
                                                case 2006372676:
                                                    if (str4.equals("BRAVIA_ATV3_4K")) {
                                                        c = 19;
                                                        break;
                                                    }
                                                    break;
                                                case 2019281702:
                                                    if (str4.equals("DM-01K")) {
                                                        c = 29;
                                                        break;
                                                    }
                                                    break;
                                                case 2029784656:
                                                    if (str4.equals("HWBLN-H")) {
                                                        c = '?';
                                                        break;
                                                    }
                                                    break;
                                                case 2030379515:
                                                    if (str4.equals("HWCAM-H")) {
                                                        c = '@';
                                                        break;
                                                    }
                                                    break;
                                                case 2033393791:
                                                    if (str4.equals("ASUS_X00AD_2")) {
                                                        c = 14;
                                                        break;
                                                    }
                                                    break;
                                                case 2047190025:
                                                    if (str4.equals("ELUGA_Note")) {
                                                        c = ' ';
                                                        break;
                                                    }
                                                    break;
                                                case 2047252157:
                                                    if (str4.equals("ELUGA_Prim")) {
                                                        c = '!';
                                                        break;
                                                    }
                                                    break;
                                                case 2048319463:
                                                    if (str4.equals("HWVNS-H")) {
                                                        c = 'A';
                                                        break;
                                                    }
                                                    break;
                                                case 2048855701:
                                                    if (str4.equals("HWWAS-H")) {
                                                        c = 'B';
                                                        break;
                                                    }
                                                    break;
                                            }
                                            switch (c) {
                                                default:
                                                    if (str3.hashCode() == -594534941 && str3.equals("JSN-L21")) {
                                                    }
                                                    break;
                                                case 0:
                                                case 1:
                                                case 2:
                                                case 3:
                                                case 4:
                                                case 5:
                                                case 6:
                                                case 7:
                                                case '\b':
                                                case '\t':
                                                case '\n':
                                                case 11:
                                                case '\f':
                                                case '\r':
                                                case 14:
                                                case 15:
                                                case 16:
                                                case 17:
                                                case 18:
                                                case 19:
                                                case 20:
                                                case 21:
                                                case 22:
                                                case 23:
                                                case 24:
                                                case 25:
                                                case 26:
                                                case 27:
                                                case 28:
                                                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HORIZONTAL_BIAS /* 29 */:
                                                case 30:
                                                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_WIDTH_DEFAULT /* 31 */:
                                                case ' ':
                                                case '!':
                                                case '\"':
                                                case '#':
                                                case '$':
                                                case '%':
                                                case '&':
                                                case '\'':
                                                case '(':
                                                case ')':
                                                case '*':
                                                case '+':
                                                case ',':
                                                case '-':
                                                case '.':
                                                case '/':
                                                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE /* 48 */:
                                                case ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX /* 49 */:
                                                case '2':
                                                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_TAG /* 51 */:
                                                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_TOP_OF /* 52 */:
                                                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_BOTTOM_OF /* 53 */:
                                                case ConstraintLayout.LayoutParams.Table.LAYOUT_MARGIN_BASELINE /* 54 */:
                                                case ConstraintLayout.LayoutParams.Table.LAYOUT_GONE_MARGIN_BASELINE /* 55 */:
                                                case '8':
                                                case '9':
                                                case ':':
                                                case ';':
                                                case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                                                case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                                                case '>':
                                                case HtmlCompat.FROM_HTML_MODE_COMPACT /* 63 */:
                                                case '@':
                                                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HEIGHT /* 65 */:
                                                case ConstraintLayout.LayoutParams.Table.LAYOUT_WRAP_BEHAVIOR_IN_PARENT /* 66 */:
                                                case ConstraintLayout.LayoutParams.Table.GUIDELINE_USE_RTL /* 67 */:
                                                case 'D':
                                                case 'E':
                                                case 'F':
                                                case 'G':
                                                case 'H':
                                                case 'I':
                                                case 'J':
                                                case 'K':
                                                case Base64.mimeLineLength /* 76 */:
                                                case 'M':
                                                case 'N':
                                                case 'O':
                                                case 'P':
                                                case 'Q':
                                                case 'R':
                                                case 'S':
                                                case 'T':
                                                case 'U':
                                                case 'V':
                                                case 'W':
                                                case 'X':
                                                case 'Y':
                                                case 'Z':
                                                case '[':
                                                case '\\':
                                                case ']':
                                                case '^':
                                                case '_':
                                                case '`':
                                                case 'a':
                                                case 'b':
                                                case 'c':
                                                case 'd':
                                                case TypedValues.TYPE_TARGET /* 101 */:
                                                case 'f':
                                                case 'g':
                                                case 'h':
                                                case LocationRequest.PRIORITY_NO_POWER /* 105 */:
                                                case 'j':
                                                case 'k':
                                                case AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR /* 108 */:
                                                case AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY /* 109 */:
                                                case 'n':
                                                case 'o':
                                                case 'p':
                                                case 'q':
                                                case 'r':
                                                case 's':
                                                case 't':
                                                case 'u':
                                                case 'v':
                                                case 'w':
                                                case 'x':
                                                case 'y':
                                                case 'z':
                                                case '{':
                                                case '|':
                                                case '}':
                                                case '~':
                                                case WorkQueueKt.MASK /* 127 */:
                                                case 128:
                                                case 129:
                                                case 130:
                                                case 131:
                                                case 132:
                                                case 133:
                                                case 134:
                                                case 135:
                                                case 136:
                                                case 137:
                                                case 138:
                                                case 139:
                                                    z3 = true;
                                                    break;
                                            }
                                        }
                                        break;
                                    case false:
                                    case true:
                                    case true:
                                    case true:
                                    case true:
                                    case true:
                                    case true:
                                    case true:
                                    case true:
                                        break;
                                }
                            }
                            break;
                        case false:
                        case true:
                        case true:
                        case true:
                        case true:
                        case true:
                        case true:
                        case true:
                            break;
                    }
                    zzd = z3;
                    zzc = true;
                }
            }
        }
        return zzd;
    }

    private static List zzaR(Context context, zztx zztxVar, zzan zzanVar, boolean z, boolean z2) throws zzud {
        if (zzanVar.zzn == null) {
            return zzgbc.zzm();
        }
        if (zzgd.zza >= 26 && "video/dolby-vision".equals(zzanVar.zzn) && !zzabh.zza(context)) {
            List listZzd = zzuj.zzd(zztxVar, zzanVar, z, z2);
            if (!listZzd.isEmpty()) {
                return listZzd;
            }
        }
        return zzuj.zzf(zztxVar, zzanVar, z, z2);
    }

    private final void zzaS() {
        zzdv zzdvVar = this.zzA;
        if (zzdvVar != null) {
            this.zzg.zzt(zzdvVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @RequiresNonNull({"displaySurface"})
    public final void zzaT() {
        this.zzg.zzq(this.zzn);
        this.zzq = true;
    }

    private final void zzaU() {
        Surface surface = this.zzn;
        zzabm zzabmVar = this.zzp;
        if (surface == zzabmVar) {
            this.zzn = null;
        }
        if (zzabmVar != null) {
            zzabmVar.release();
            this.zzp = null;
        }
    }

    private final boolean zzaV(zztp zztpVar) {
        if (zzgd.zza < 23 || zzaQ(zztpVar.zza)) {
            return false;
        }
        return !zztpVar.zzf || zzabm.zzb(this.zze);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int zzad(zztp zztpVar, zzan zzanVar) {
        int iIntValue;
        int i = zzanVar.zzs;
        int i2 = zzanVar.zzt;
        if (i != -1 && i2 != -1) {
            String str = zzanVar.zzn;
            str.getClass();
            char c = 2;
            if ("video/dolby-vision".equals(str)) {
                Pair pairZza = zzuj.zza(zzanVar);
                str = (pairZza == null || !((iIntValue = ((Integer) pairZza.first).intValue()) == 512 || iIntValue == 1 || iIntValue == 2)) ? "video/hevc" : "video/avc";
            }
            int i3 = 4;
            switch (str.hashCode()) {
                case -1664118616:
                    if (!str.equals("video/3gpp")) {
                        c = 65535;
                        break;
                    } else {
                        c = 0;
                        break;
                    }
                case -1662735862:
                    if (!str.equals("video/av01")) {
                    }
                    break;
                case -1662541442:
                    if (str.equals("video/hevc")) {
                        c = 4;
                        break;
                    }
                    break;
                case 1187890754:
                    if (str.equals("video/mp4v-es")) {
                        c = 1;
                        break;
                    }
                    break;
                case 1331836730:
                    if (str.equals("video/avc")) {
                        c = 5;
                        break;
                    }
                    break;
                case 1599127256:
                    if (str.equals("video/x-vnd.on2.vp8")) {
                        c = 3;
                        break;
                    }
                    break;
                case 1599127257:
                    if (str.equals("video/x-vnd.on2.vp9")) {
                        c = 6;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                case 1:
                case 2:
                case 3:
                    return ((i * i2) * 3) / i3;
                case 4:
                    return Math.max(2097152, ((i * i2) * 3) / 4);
                case 5:
                    if (!"BRAVIA 4K 2015".equals(zzgd.zzd) && (!"Amazon".equals(zzgd.zzc) || (!"KFSOWI".equals(zzgd.zzd) && (!"AFTS".equals(zzgd.zzd) || !zztpVar.zzf)))) {
                        return ((((i + 15) / 16) * ((i2 + 15) / 16)) * 768) / 4;
                    }
                    break;
                case 6:
                    i3 = 8;
                    return ((i * i2) * 3) / i3;
            }
        }
        return -1;
    }

    protected static int zzae(zztp zztpVar, zzan zzanVar) {
        if (zzanVar.zzo == -1) {
            return zzad(zztpVar, zzanVar);
        }
        int size = zzanVar.zzp.size();
        int length = 0;
        for (int i = 0; i < size; i++) {
            length += ((byte[]) zzanVar.zzp.get(i)).length;
        }
        return zzanVar.zzo + length;
    }

    @Override // com.google.android.gms.internal.ads.zziw
    protected final void zzA() {
        if (this.zzF != null) {
            this.zzf.zzn();
        }
    }

    @Override // com.google.android.gms.internal.ads.zztv, com.google.android.gms.internal.ads.zziw
    protected final void zzC() {
        try {
            super.zzC();
            this.zzC = false;
            if (this.zzp != null) {
                zzaU();
            }
        } catch (Throwable th) {
            this.zzC = false;
            if (this.zzp != null) {
                zzaU();
            }
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zziw
    protected final void zzD() {
        this.zzt = 0;
        zzh();
        this.zzs = SystemClock.elapsedRealtime();
        this.zzw = 0L;
        this.zzx = 0;
        this.zzi.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zziw
    protected final void zzE() {
        if (this.zzt > 0) {
            zzh();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            this.zzg.zzd(this.zzt, jElapsedRealtime - this.zzs);
            this.zzt = 0;
            this.zzs = jElapsedRealtime;
        }
        int i = this.zzx;
        if (i != 0) {
            this.zzg.zzr(this.zzw, i);
            this.zzw = 0L;
            this.zzx = 0;
        }
        this.zzi.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zztv, com.google.android.gms.internal.ads.zziw, com.google.android.gms.internal.ads.zzmn
    public final void zzM(float f, float f2) throws zzjh {
        super.zzM(f, f2);
        this.zzi.zzn(f);
        zzacm zzacmVar = this.zzF;
        if (zzacmVar != null) {
            zzabc.zzi(((zzaba) zzacmVar).zza, f);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzmn, com.google.android.gms.internal.ads.zzmp
    public final String zzU() {
        return "MediaCodecVideoRenderer";
    }

    @Override // com.google.android.gms.internal.ads.zztv, com.google.android.gms.internal.ads.zzmn
    public final void zzV(long j, long j2) throws zzjh {
        super.zzV(j, j2);
        zzacm zzacmVar = this.zzF;
        if (zzacmVar != null) {
            try {
                zzacmVar.zzh(j, j2);
            } catch (zzacl e) {
                throw zzi(e, e.zza, false, 7001);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zztv, com.google.android.gms.internal.ads.zzmn
    public final boolean zzW() {
        return super.zzW() && this.zzF == null;
    }

    @Override // com.google.android.gms.internal.ads.zztv, com.google.android.gms.internal.ads.zzmn
    public final boolean zzX() {
        zzabm zzabmVar;
        boolean z = false;
        if (super.zzX() && this.zzF == null) {
            z = true;
        }
        if (!z || (((zzabmVar = this.zzp) == null || this.zzn != zzabmVar) && zzaw() != null)) {
            return this.zzi.zzo(z);
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zztv
    protected final float zzZ(float f, zzan zzanVar, zzan[] zzanVarArr) {
        float fMax = -1.0f;
        for (zzan zzanVar2 : zzanVarArr) {
            float f2 = zzanVar2.zzu;
            if (f2 != -1.0f) {
                fMax = Math.max(fMax, f2);
            }
        }
        if (fMax == -1.0f) {
            return -1.0f;
        }
        return fMax * f;
    }

    @Override // com.google.android.gms.internal.ads.zztv
    protected final void zzaA(long j) {
        super.zzaA(j);
        this.zzv--;
    }

    @Override // com.google.android.gms.internal.ads.zztv
    protected final void zzaB(zzin zzinVar) throws zzjh {
        this.zzv++;
        int i = zzgd.zza;
    }

    @Override // com.google.android.gms.internal.ads.zztv
    protected final void zzaC(zzan zzanVar) throws zzjh {
        zzfv zzfvVar;
        if (this.zzB && !this.zzC) {
            zzacm zzacmVarZzd = this.zzf.zzd();
            this.zzF = zzacmVarZzd;
            try {
                zzacmVarZzd.zzf(zzanVar, zzh());
                this.zzF.zzi(new zzabg(this), zzggk.zzb());
                zzabn zzabnVar = this.zzE;
                if (zzabnVar != null) {
                    ((zzaba) this.zzF).zza.zzj = zzabnVar;
                }
                this.zzF.zzj(zzau());
                Surface surface = this.zzn;
                if (surface != null && (zzfvVar = this.zzo) != null) {
                    this.zzf.zzq(surface, zzfvVar);
                }
            } catch (zzacl e) {
                throw zzi(e, zzanVar, false, 7000);
            }
        }
        this.zzC = true;
    }

    @Override // com.google.android.gms.internal.ads.zztv
    protected final void zzaE() {
        super.zzaE();
        this.zzv = 0;
    }

    @Override // com.google.android.gms.internal.ads.zztv
    protected final boolean zzaK(zztp zztpVar) {
        return this.zzn != null || zzaV(zztpVar);
    }

    protected final void zzaM(zztm zztmVar, int i, long j) {
        Trace.beginSection("skipVideoBuffer");
        zztmVar.zzn(i, false);
        Trace.endSection();
        this.zza.zzf++;
    }

    protected final void zzaN(int i, int i2) {
        zzix zzixVar = this.zza;
        zzixVar.zzh += i;
        int i3 = i + i2;
        zzixVar.zzg += i3;
        this.zzt += i3;
        int i4 = this.zzu + i3;
        this.zzu = i4;
        zzixVar.zzi = Math.max(i4, zzixVar.zzi);
    }

    protected final void zzaO(long j) {
        zzix zzixVar = this.zza;
        zzixVar.zzk += j;
        zzixVar.zzl++;
        this.zzw += j;
        this.zzx++;
    }

    protected final boolean zzaP(long j, boolean z) throws zzjh {
        int iZzd = zzd(j);
        if (iZzd == 0) {
            return false;
        }
        if (z) {
            zzix zzixVar = this.zza;
            zzixVar.zzd += iZzd;
            zzixVar.zzf += this.zzv;
        } else {
            this.zza.zzj++;
            zzaN(iZzd, this.zzv);
        }
        zzaG();
        zzacm zzacmVar = this.zzF;
        if (zzacmVar != null) {
            zzacmVar.zze();
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zztv
    protected final int zzaa(zztx zztxVar, zzan zzanVar) throws zzud {
        boolean z;
        if (!zzcg.zzh(zzanVar.zzn)) {
            return 128;
        }
        int i = 1;
        int i2 = 0;
        boolean z2 = zzanVar.zzq != null;
        List listZzaR = zzaR(this.zze, zztxVar, zzanVar, z2, false);
        if (z2 && listZzaR.isEmpty()) {
            listZzaR = zzaR(this.zze, zztxVar, zzanVar, false, false);
        }
        if (!listZzaR.isEmpty()) {
            if (zzaL(zzanVar)) {
                zztp zztpVar = (zztp) listZzaR.get(0);
                boolean zZze = zztpVar.zze(zzanVar);
                if (zZze) {
                    z = true;
                } else {
                    for (int i3 = 1; i3 < listZzaR.size(); i3++) {
                        zztp zztpVar2 = (zztp) listZzaR.get(i3);
                        if (zztpVar2.zze(zzanVar)) {
                            zZze = true;
                            z = false;
                            zztpVar = zztpVar2;
                            break;
                        }
                    }
                    z = true;
                }
                int i4 = true != zZze ? 3 : 4;
                int i5 = true != zztpVar.zzf(zzanVar) ? 8 : 16;
                int i6 = true != zztpVar.zzg ? 0 : 64;
                int i7 = true != z ? 0 : 128;
                if (zzgd.zza >= 26 && "video/dolby-vision".equals(zzanVar.zzn) && !zzabh.zza(this.zze)) {
                    i7 = 256;
                }
                if (zZze) {
                    List listZzaR2 = zzaR(this.zze, zztxVar, zzanVar, z2, true);
                    if (!listZzaR2.isEmpty()) {
                        zztp zztpVar3 = (zztp) zzuj.zzg(listZzaR2, zzanVar).get(0);
                        if (zztpVar3.zze(zzanVar) && zztpVar3.zzf(zzanVar)) {
                            i2 = 32;
                        }
                    }
                }
                return i4 | i5 | i2 | i6 | i7;
            }
            i = 2;
        }
        return i | 128;
    }

    @Override // com.google.android.gms.internal.ads.zztv
    protected final zziy zzab(zztp zztpVar, zzan zzanVar, zzan zzanVar2) {
        int i;
        int i2;
        zziy zziyVarZzb = zztpVar.zzb(zzanVar, zzanVar2);
        int i3 = zziyVarZzb.zze;
        zzabi zzabiVar = this.zzk;
        zzabiVar.getClass();
        if (zzanVar2.zzs > zzabiVar.zza || zzanVar2.zzt > zzabiVar.zzb) {
            i3 |= 256;
        }
        if (zzae(zztpVar, zzanVar2) > zzabiVar.zzc) {
            i3 |= 64;
        }
        String str = zztpVar.zza;
        if (i3 != 0) {
            i2 = i3;
            i = 0;
        } else {
            i = zziyVarZzb.zzd;
            i2 = 0;
        }
        return new zziy(str, zzanVar, zzanVar2, i, i2);
    }

    @Override // com.google.android.gms.internal.ads.zztv
    protected final zziy zzac(zzlj zzljVar) throws zzjh {
        zziy zziyVarZzac = super.zzac(zzljVar);
        zzan zzanVar = zzljVar.zza;
        zzanVar.getClass();
        this.zzg.zzf(zzanVar, zziyVarZzac);
        return zziyVarZzac;
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x00fc, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01f5  */
    @Override // com.google.android.gms.internal.ads.zztv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final zztk zzaf(zztp zztpVar, zzan zzanVar, MediaCrypto mediaCrypto, float f) {
        String str;
        Point pointZza;
        int i;
        int i2;
        boolean z;
        MediaFormat mediaFormat;
        float f2;
        zzt zztVar;
        zzacm zzacmVar;
        boolean z2;
        Pair pairZza;
        int iZzad;
        zzabm zzabmVar = this.zzp;
        if (zzabmVar != null) {
            if (zzabmVar.zza != zztpVar.zzf) {
                zzaU();
            }
        }
        String str2 = zztpVar.zzc;
        zzan[] zzanVarArrZzT = zzT();
        int iMax = zzanVar.zzs;
        int iMax2 = zzanVar.zzt;
        int iZzae = zzae(zztpVar, zzanVar);
        int length = zzanVarArrZzT.length;
        if (length != 1) {
            boolean z3 = false;
            for (int i3 = 0; i3 < length; i3++) {
                zzan zzanVarZzad = zzanVarArrZzT[i3];
                if (zzanVar.zzz != null && zzanVarZzad.zzz == null) {
                    zzal zzalVarZzb = zzanVarZzad.zzb();
                    zzalVarZzb.zzA(zzanVar.zzz);
                    zzanVarZzad = zzalVarZzb.zzad();
                }
                if (zztpVar.zzb(zzanVar, zzanVarZzad).zzd != 0) {
                    int i4 = zzanVarZzad.zzs;
                    z3 |= i4 == -1 || zzanVarZzad.zzt == -1;
                    iMax = Math.max(iMax, i4);
                    iMax2 = Math.max(iMax2, zzanVarZzad.zzt);
                    iZzae = Math.max(iZzae, zzae(zztpVar, zzanVarZzad));
                }
            }
            if (z3) {
                zzfk.zzf("MediaCodecVideoRenderer", "Resolutions unknown. Codec max resolution: " + iMax + "x" + iMax2);
                int i5 = zzanVar.zzt;
                int i6 = zzanVar.zzs;
                boolean z4 = i5 > i6;
                int i7 = z4 ? i5 : i6;
                if (true == z4) {
                    i5 = i6;
                }
                int[] iArr = zzb;
                int i8 = 0;
                while (true) {
                    if (i8 >= 9) {
                        str = str2;
                        break;
                    }
                    float f3 = i5;
                    float f4 = i7;
                    str = str2;
                    int i9 = iArr[i8];
                    int[] iArr2 = iArr;
                    float f5 = i9;
                    if (i9 <= i7 || (i = (int) (f5 * (f3 / f4))) <= i5) {
                        break;
                    }
                    int i10 = zzgd.zza;
                    int i11 = true != z4 ? i9 : i;
                    if (true != z4) {
                        i9 = i;
                    }
                    pointZza = zztpVar.zza(i11, i9);
                    float f6 = zzanVar.zzu;
                    if (pointZza != null) {
                        i2 = i5;
                        if (zztpVar.zzg(pointZza.x, pointZza.y, f6)) {
                            break;
                        }
                    } else {
                        i2 = i5;
                    }
                    i8++;
                    str2 = str;
                    iArr = iArr2;
                    i5 = i2;
                }
                if (pointZza != null) {
                    iMax = Math.max(iMax, pointZza.x);
                    iMax2 = Math.max(iMax2, pointZza.y);
                    zzal zzalVarZzb2 = zzanVar.zzb();
                    zzalVarZzb2.zzac(iMax);
                    zzalVarZzb2.zzI(iMax2);
                    iZzae = Math.max(iZzae, zzad(zztpVar, zzalVarZzb2.zzad()));
                    zzfk.zzf("MediaCodecVideoRenderer", "Codec max resolution adjusted to: " + iMax + "x" + iMax2);
                }
            }
            zzabi zzabiVar = new zzabi(iMax, iMax2, iZzae);
            this.zzk = zzabiVar;
            z = this.zzh;
            mediaFormat = new MediaFormat();
            mediaFormat.setString("mime", str);
            mediaFormat.setInteger("width", zzanVar.zzs);
            mediaFormat.setInteger("height", zzanVar.zzt);
            zzfn.zzb(mediaFormat, zzanVar.zzp);
            f2 = zzanVar.zzu;
            if (f2 != -1.0f) {
                mediaFormat.setFloat("frame-rate", f2);
            }
            zzfn.zza(mediaFormat, "rotation-degrees", zzanVar.zzv);
            zztVar = zzanVar.zzz;
            if (zztVar != null) {
                zzfn.zza(mediaFormat, "color-transfer", zztVar.zzf);
                zzfn.zza(mediaFormat, "color-standard", zztVar.zzd);
                zzfn.zza(mediaFormat, "color-range", zztVar.zze);
                byte[] bArr = zztVar.zzg;
                if (bArr != null) {
                    mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
                }
            }
            if ("video/dolby-vision".equals(zzanVar.zzn) && (pairZza = zzuj.zza(zzanVar)) != null) {
                zzfn.zza(mediaFormat, Scopes.PROFILE, ((Integer) pairZza.first).intValue());
            }
            mediaFormat.setInteger("max-width", zzabiVar.zza);
            mediaFormat.setInteger("max-height", zzabiVar.zzb);
            zzfn.zza(mediaFormat, "max-input-size", zzabiVar.zzc);
            if (zzgd.zza >= 23) {
                mediaFormat.setInteger("priority", 0);
                if (f != -1.0f) {
                    mediaFormat.setFloat("operating-rate", f);
                }
            }
            if (z) {
                mediaFormat.setInteger("no-post-process", 1);
                mediaFormat.setInteger("auto-frc", 0);
            }
            if (this.zzn == null) {
                if (!zzaV(zztpVar)) {
                    throw new IllegalStateException();
                }
                if (this.zzp == null) {
                    this.zzp = zzabm.zza(this.zze, zztpVar.zzf);
                }
                this.zzn = this.zzp;
            }
            zzacmVar = this.zzF;
            if (zzacmVar != null || zzacmVar.zzl()) {
                z2 = false;
            } else {
                z2 = false;
                mediaFormat.setInteger("allow-frame-drop", 0);
            }
            if (this.zzF != null) {
                return zztk.zzb(zztpVar, mediaFormat, zzanVar, this.zzn, null);
            }
            zzds zzdsVar = null;
            zzeq.zzf(z2);
            zzeq.zzb(null);
            zzdsVar.zzb();
            throw null;
        }
        if (iZzae != -1 && (iZzad = zzad(zztpVar, zzanVar)) != -1) {
            iZzae = Math.min((int) (iZzae * 1.5f), iZzad);
        }
        str = str2;
        zzabi zzabiVar2 = new zzabi(iMax, iMax2, iZzae);
        this.zzk = zzabiVar2;
        z = this.zzh;
        mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", zzanVar.zzs);
        mediaFormat.setInteger("height", zzanVar.zzt);
        zzfn.zzb(mediaFormat, zzanVar.zzp);
        f2 = zzanVar.zzu;
        if (f2 != -1.0f) {
        }
        zzfn.zza(mediaFormat, "rotation-degrees", zzanVar.zzv);
        zztVar = zzanVar.zzz;
        if (zztVar != null) {
        }
        if ("video/dolby-vision".equals(zzanVar.zzn)) {
            zzfn.zza(mediaFormat, Scopes.PROFILE, ((Integer) pairZza.first).intValue());
        }
        mediaFormat.setInteger("max-width", zzabiVar2.zza);
        mediaFormat.setInteger("max-height", zzabiVar2.zzb);
        zzfn.zza(mediaFormat, "max-input-size", zzabiVar2.zzc);
        if (zzgd.zza >= 23) {
        }
        if (z) {
        }
        if (this.zzn == null) {
        }
        zzacmVar = this.zzF;
        if (zzacmVar != null) {
            z2 = false;
        }
        if (this.zzF != null) {
        }
    }

    @Override // com.google.android.gms.internal.ads.zztv
    protected final List zzag(zztx zztxVar, zzan zzanVar, boolean z) throws zzud {
        return zzuj.zzg(zzaR(this.zze, zztxVar, zzanVar, false, false), zzanVar);
    }

    @Override // com.google.android.gms.internal.ads.zztv
    protected final void zzaj(zzin zzinVar) throws zzjh {
        if (this.zzm) {
            ByteBuffer byteBuffer = zzinVar.zzf;
            byteBuffer.getClass();
            if (byteBuffer.remaining() >= 7) {
                byte b = byteBuffer.get();
                short s = byteBuffer.getShort();
                short s2 = byteBuffer.getShort();
                byte b2 = byteBuffer.get();
                byte b3 = byteBuffer.get();
                byteBuffer.position(0);
                if (b == -75 && s == 60 && s2 == 1 && b2 == 4) {
                    if (b3 == 0 || b3 == 1) {
                        byte[] bArr = new byte[byteBuffer.remaining()];
                        byteBuffer.get(bArr);
                        byteBuffer.position(0);
                        zztm zztmVarZzaw = zzaw();
                        zztmVarZzaw.getClass();
                        Bundle bundle = new Bundle();
                        bundle.putByteArray("hdr10-plus-info", bArr);
                        zztmVarZzaw.zzp(bundle);
                    }
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zztv
    protected final void zzak(Exception exc) {
        zzfk.zzd("MediaCodecVideoRenderer", "Video codec error", exc);
        this.zzg.zzs(exc);
    }

    @Override // com.google.android.gms.internal.ads.zztv
    protected final void zzal(String str, zztk zztkVar, long j, long j2) {
        this.zzg.zza(str, j, j2);
        this.zzl = zzaQ(str);
        zztp zztpVarZzay = zzay();
        zztpVarZzay.getClass();
        boolean z = false;
        if (zzgd.zza >= 29 && "video/x-vnd.on2.vp9".equals(zztpVarZzay.zzb)) {
            MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArrZzh = zztpVarZzay.zzh();
            int length = codecProfileLevelArrZzh.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (codecProfileLevelArrZzh[i].profile == 16384) {
                    z = true;
                    break;
                }
                i++;
            }
        }
        this.zzm = z;
    }

    @Override // com.google.android.gms.internal.ads.zztv
    protected final void zzam(String str) {
        this.zzg.zzb(str);
    }

    @Override // com.google.android.gms.internal.ads.zztv
    protected final void zzan(zzan zzanVar, MediaFormat mediaFormat) {
        zztm zztmVarZzaw = zzaw();
        if (zztmVarZzaw != null) {
            zztmVarZzaw.zzq(this.zzr);
        }
        mediaFormat.getClass();
        boolean z = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
        int integer = z ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger("width");
        int integer2 = z ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger("height");
        float f = zzanVar.zzw;
        int i = zzgd.zza;
        int i2 = zzanVar.zzv;
        if (i2 == 90 || i2 == 270) {
            f = 1.0f / f;
            int i3 = integer2;
            integer2 = integer;
            integer = i3;
        }
        this.zzz = new zzdv(integer, integer2, 0, f);
        this.zzi.zzl(zzanVar.zzu);
        zzacm zzacmVar = this.zzF;
        if (zzacmVar != null) {
            zzal zzalVarZzb = zzanVar.zzb();
            zzalVarZzb.zzac(integer);
            zzalVarZzb.zzI(integer2);
            zzalVarZzb.zzW(0);
            zzalVarZzb.zzT(f);
            zzacmVar.zzg(1, zzalVarZzb.zzad());
        }
    }

    protected final void zzao(zztm zztmVar, int i, long j, long j2) {
        Trace.beginSection("releaseOutputBuffer");
        zztmVar.zzm(i, j2);
        Trace.endSection();
        this.zza.zze++;
        this.zzu = 0;
        if (this.zzF == null) {
            zzdv zzdvVar = this.zzz;
            if (!zzdvVar.equals(zzdv.zza) && !zzdvVar.equals(this.zzA)) {
                this.zzA = zzdvVar;
                this.zzg.zzt(zzdvVar);
            }
            if (!this.zzi.zzp() || this.zzn == null) {
                return;
            }
            zzaT();
        }
    }

    @Override // com.google.android.gms.internal.ads.zztv
    protected final void zzap() {
        this.zzi.zzf();
        this.zzf.zzd().zzj(zzau());
    }

    @Override // com.google.android.gms.internal.ads.zztv
    protected final int zzat(zzin zzinVar) {
        int i = zzgd.zza;
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zztv
    protected final zzto zzax(Throwable th, zztp zztpVar) {
        return new zzabf(th, zztpVar, this.zzn);
    }

    @Override // com.google.android.gms.internal.ads.zziw, com.google.android.gms.internal.ads.zzmn
    public final void zzs() {
        this.zzi.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zztv, com.google.android.gms.internal.ads.zziw
    protected final void zzw() {
        this.zzA = null;
        this.zzi.zzd();
        this.zzq = false;
        try {
            super.zzw();
        } finally {
            this.zzg.zzc(this.zza);
            this.zzg.zzt(zzdv.zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zztv, com.google.android.gms.internal.ads.zziw
    protected final void zzx(boolean z, boolean z2) throws zzjh {
        super.zzx(z, z2);
        zzm();
        this.zzg.zze(this.zza);
        this.zzi.zze(z2);
    }

    @Override // com.google.android.gms.internal.ads.zziw
    protected final void zzy() {
        this.zzi.zzk(zzh());
    }

    @Override // com.google.android.gms.internal.ads.zztv, com.google.android.gms.internal.ads.zziw
    protected final void zzz(long j, boolean z) throws zzjh {
        this.zzf.zzd().zze();
        super.zzz(j, z);
        this.zzi.zzi();
        if (z) {
            this.zzi.zzc(false);
        }
        this.zzu = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v12, types: [android.view.Surface] */
    @Override // com.google.android.gms.internal.ads.zziw, com.google.android.gms.internal.ads.zzmi
    public final void zzt(int i, Object obj) throws zzjh {
        Surface surface;
        if (i != 1) {
            if (i == 7) {
                obj.getClass();
                zzabn zzabnVar = (zzabn) obj;
                this.zzE = zzabnVar;
                zzacm zzacmVar = this.zzF;
                if (zzacmVar != null) {
                    ((zzaba) zzacmVar).zza.zzj = zzabnVar;
                    return;
                }
                return;
            }
            if (i == 10) {
                obj.getClass();
                int iIntValue = ((Integer) obj).intValue();
                if (this.zzD != iIntValue) {
                    this.zzD = iIntValue;
                    return;
                }
                return;
            }
            if (i == 4) {
                obj.getClass();
                int iIntValue2 = ((Integer) obj).intValue();
                this.zzr = iIntValue2;
                zztm zztmVarZzaw = zzaw();
                if (zztmVarZzaw != null) {
                    zztmVarZzaw.zzq(iIntValue2);
                    return;
                }
                return;
            }
            if (i == 5) {
                zzabq zzabqVar = this.zzi;
                obj.getClass();
                zzabqVar.zzj(((Integer) obj).intValue());
                return;
            }
            if (i == 13) {
                obj.getClass();
                this.zzf.zzr((List) obj);
                this.zzB = true;
                return;
            } else {
                if (i != 14) {
                    return;
                }
                obj.getClass();
                zzfv zzfvVar = (zzfv) obj;
                this.zzo = zzfvVar;
                if (this.zzF != null) {
                    zzfvVar.getClass();
                    if (zzfvVar.zzb() == 0 || zzfvVar.zza() == 0 || (surface = this.zzn) == null) {
                        return;
                    }
                    this.zzf.zzq(surface, zzfvVar);
                    return;
                }
                return;
            }
        }
        zzabm zzabmVarZza = obj instanceof Surface ? (Surface) obj : null;
        if (zzabmVarZza == null) {
            zzabm zzabmVar = this.zzp;
            if (zzabmVar != null) {
                zzabmVarZza = zzabmVar;
            } else {
                zztp zztpVarZzay = zzay();
                if (zztpVarZzay != null && zzaV(zztpVarZzay)) {
                    zzabmVarZza = zzabm.zza(this.zze, zztpVarZzay.zzf);
                    this.zzp = zzabmVarZza;
                }
            }
        }
        if (this.zzn == zzabmVarZza) {
            if (zzabmVarZza == null || zzabmVarZza == this.zzp) {
                return;
            }
            zzaS();
            Surface surface2 = this.zzn;
            if (surface2 == null || !this.zzq) {
                return;
            }
            this.zzg.zzq(surface2);
            return;
        }
        this.zzn = zzabmVarZza;
        this.zzi.zzm(zzabmVarZza);
        this.zzq = false;
        int iZzcU = zzcU();
        zztm zztmVarZzaw2 = zzaw();
        zzabm zzabmVar2 = zzabmVarZza;
        if (zztmVarZzaw2 != null) {
            zzabmVar2 = zzabmVarZza;
            if (this.zzF == null) {
                zzabm zzabmVar3 = zzabmVarZza;
                if (zzgd.zza < 23) {
                    zzaD();
                    zzaz();
                    zzabmVar2 = zzabmVar3;
                } else {
                    if (zzabmVarZza != null) {
                        zzabmVar3 = zzabmVarZza;
                        if (!this.zzl) {
                            zztmVarZzaw2.zzo(zzabmVarZza);
                            zzabmVar2 = zzabmVarZza;
                        }
                    } else {
                        zzabmVar3 = null;
                    }
                    zzaD();
                    zzaz();
                    zzabmVar2 = zzabmVar3;
                }
            }
        }
        if (zzabmVar2 == null || zzabmVar2 == this.zzp) {
            this.zzA = null;
            if (this.zzF != null) {
                this.zzf.zzk();
                return;
            }
            return;
        }
        zzaS();
        if (iZzcU == 2) {
            this.zzi.zzc(true);
        }
        if (this.zzF != null) {
            this.zzf.zzq(zzabmVar2, zzfv.zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zztv
    protected final boolean zzar(long j, long j2, zztm zztmVar, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, zzan zzanVar) throws zzjh {
        zztmVar.getClass();
        long jZzau = j3 - zzau();
        int iZza = this.zzi.zza(j3, j, j2, zzav(), z2, this.zzj);
        if (z && !z2) {
            zzaM(zztmVar, i, jZzau);
            return true;
        }
        if (this.zzn != this.zzp || this.zzF != null) {
            zzacm zzacmVar = this.zzF;
            if (zzacmVar != null) {
                try {
                    zzacmVar.zzh(j, j2);
                    long jZzd = this.zzF.zzd(jZzau, z2);
                    if (jZzd != -9223372036854775807L) {
                        int i4 = zzgd.zza;
                        zzao(zztmVar, i, jZzau, jZzd);
                        return true;
                    }
                } catch (zzacl e) {
                    throw zzi(e, e.zza, false, 7001);
                }
            } else {
                if (iZza == 0) {
                    zzh();
                    long jNanoTime = System.nanoTime();
                    int i5 = zzgd.zza;
                    zzao(zztmVar, i, jZzau, jNanoTime);
                    zzaO(this.zzj.zzc());
                    return true;
                }
                if (iZza == 1) {
                    zzabo zzaboVar = this.zzj;
                    long jZzd2 = zzaboVar.zzd();
                    long jZzc = zzaboVar.zzc();
                    int i6 = zzgd.zza;
                    if (jZzd2 == this.zzy) {
                        zzaM(zztmVar, i, jZzau);
                    } else {
                        zzao(zztmVar, i, jZzau, jZzd2);
                    }
                    zzaO(jZzc);
                    this.zzy = jZzd2;
                    return true;
                }
                if (iZza == 2) {
                    Trace.beginSection("dropVideoBuffer");
                    zztmVar.zzn(i, false);
                    Trace.endSection();
                    zzaN(0, 1);
                    zzaO(this.zzj.zzc());
                    return true;
                }
                if (iZza == 3) {
                    zzaM(zztmVar, i, jZzau);
                    zzaO(this.zzj.zzc());
                    return true;
                }
            }
        } else if (this.zzj.zzc() < WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS) {
            zzaM(zztmVar, i, jZzau);
            zzaO(this.zzj.zzc());
            return true;
        }
        return false;
    }
}
