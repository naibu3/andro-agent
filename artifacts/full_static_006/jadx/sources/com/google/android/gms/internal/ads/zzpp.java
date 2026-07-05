package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.net.Uri;
import android.provider.Settings;
import android.util.Pair;
import android.util.SparseArray;
import java.util.List;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzpp {
    static final zzgbf zzb;
    private final SparseArray zzd;
    private final int zze;
    public static final zzpp zza = new zzpp(zzgbc.zzn(zzpn.zza));
    private static final zzgbc zzc = zzgbc.zzp(2, 5, 6);

    static {
        zzgbe zzgbeVar = new zzgbe();
        zzgbeVar.zza(5, 6);
        zzgbeVar.zza(17, 6);
        zzgbeVar.zza(7, 6);
        zzgbeVar.zza(30, 10);
        zzgbeVar.zza(18, 6);
        zzgbeVar.zza(6, 8);
        zzgbeVar.zza(8, 8);
        zzgbeVar.zza(14, 8);
        zzb = zzgbeVar.zzc();
    }

    private zzpp(List list) {
        this.zzd = new SparseArray();
        for (int i = 0; i < list.size(); i++) {
            zzpn zzpnVar = (zzpn) list.get(i);
            this.zzd.put(zzpnVar.zzb, zzpnVar);
        }
        int iMax = 0;
        for (int i2 = 0; i2 < this.zzd.size(); i2++) {
            iMax = Math.max(iMax, ((zzpn) this.zzd.valueAt(i2)).zzc);
        }
        this.zze = iMax;
    }

    static Uri zza() {
        if (zzf()) {
            return Settings.Global.getUriFor("external_surround_sound_enabled");
        }
        return null;
    }

    static zzpp zzc(Context context, zzk zzkVar, zzpx zzpxVar) {
        return zzd(context, context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), zzkVar, zzpxVar);
    }

    static zzpp zzd(Context context, Intent intent, zzk zzkVar, zzpx zzpxVar) {
        Object systemService = context.getSystemService("audio");
        systemService.getClass();
        AudioManager audioManager = (AudioManager) systemService;
        if (zzpxVar == null) {
            zzpxVar = zzgd.zza >= 33 ? zzpm.zzb(audioManager, zzkVar) : null;
        }
        if (zzgd.zza >= 33 && (zzgd.zzN(context) || zzgd.zzJ(context))) {
            return zzpm.zza(audioManager, zzkVar);
        }
        if (zzgd.zza >= 23 && zzpk.zza(audioManager, zzpxVar)) {
            return zza;
        }
        zzgbg zzgbgVar = new zzgbg();
        zzgbgVar.zzf((Object) 2);
        if (zzgd.zza >= 29 && (zzgd.zzN(context) || zzgd.zzJ(context))) {
            zzgbgVar.zzh(zzpl.zzb(zzkVar));
            return new zzpp(zze(zzgea.zzg(zzgbgVar.zzi()), 10));
        }
        ContentResolver contentResolver = context.getContentResolver();
        boolean z = Settings.Global.getInt(contentResolver, "use_external_surround_sound_flag", 0) == 1;
        if ((z || zzf()) && Settings.Global.getInt(contentResolver, "external_surround_sound_enabled", 0) == 1) {
            zzgbgVar.zzh(zzc);
        }
        if (intent == null || z || intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) != 1) {
            return new zzpp(zze(zzgea.zzg(zzgbgVar.zzi()), 10));
        }
        int[] intArrayExtra = intent.getIntArrayExtra("android.media.extra.ENCODINGS");
        if (intArrayExtra != null) {
            zzgbgVar.zzh(zzgea.zzf(intArrayExtra));
        }
        return new zzpp(zze(zzgea.zzg(zzgbgVar.zzi()), intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 10)));
    }

    private static zzgbc zze(int[] iArr, int i) {
        zzgaz zzgazVar = new zzgaz();
        for (int i2 : iArr) {
            zzgazVar.zzf(new zzpn(i2, i));
        }
        return zzgazVar.zzi();
    }

    private static boolean zzf() {
        return "Amazon".equals(zzgd.zzc) || "Xiaomi".equals(zzgd.zzc);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0045 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzpp)) {
            return false;
        }
        zzpp zzppVar = (zzpp) obj;
        SparseArray sparseArray = this.zzd;
        SparseArray<?> sparseArray2 = zzppVar.zzd;
        if (zzgd.zza < 31) {
            int size = sparseArray.size();
            if (size == sparseArray2.size()) {
                for (int i = 0; i < size; i++) {
                    if (!Objects.equals(sparseArray.valueAt(i), sparseArray2.get(sparseArray.keyAt(i)))) {
                        break;
                    }
                }
                if (this.zze != zzppVar.zze) {
                    break;
                }
            }
        } else if (sparseArray.contentEquals(sparseArray2)) {
            if (this.zze != zzppVar.zze) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iContentHashCode;
        int i = zzgd.zza;
        SparseArray sparseArray = this.zzd;
        if (i >= 31) {
            iContentHashCode = sparseArray.contentHashCode();
        } else {
            int iKeyAt = 17;
            for (int i2 = 0; i2 < sparseArray.size(); i2++) {
                iKeyAt = (((iKeyAt * 31) + sparseArray.keyAt(i2)) * 31) + Objects.hashCode(sparseArray.valueAt(i2));
            }
            iContentHashCode = iKeyAt;
        }
        return this.zze + (iContentHashCode * 31);
    }

    public final String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.zze + ", audioProfiles=" + this.zzd.toString() + "]";
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003a A[PHI: r0
      0x003a: PHI (r0v3 int) = (r0v2 int), (r0v7 int) binds: [B:11:0x002c, B:14:0x0036] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x009d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Pair zzb(zzan zzanVar, zzk zzkVar) {
        String str = zzanVar.zzn;
        str.getClass();
        int iZza = zzcg.zza(str, zzanVar.zzk);
        if (!zzb.containsKey(Integer.valueOf(iZza))) {
            return null;
        }
        int i = 6;
        if (iZza != 18) {
            if (iZza == 8) {
                if (zzgd.zzH(this.zzd, 8)) {
                    iZza = 8;
                    if (iZza == 30) {
                    }
                }
                iZza = 7;
            } else if (iZza == 30 && !zzgd.zzH(this.zzd, 30)) {
                iZza = 7;
            }
        } else if (zzgd.zzH(this.zzd, 18)) {
            iZza = 18;
            if (iZza == 8) {
            }
        } else {
            iZza = 6;
        }
        if (!zzgd.zzH(this.zzd, iZza)) {
            return null;
        }
        zzpn zzpnVar = (zzpn) this.zzd.get(iZza);
        zzpnVar.getClass();
        int iZza2 = zzanVar.zzA;
        if (iZza2 == -1 || iZza == 18) {
            int i2 = zzanVar.zzB;
            if (i2 == -1) {
                i2 = 48000;
            }
            iZza2 = zzpnVar.zza(i2, zzkVar);
        } else if (!zzanVar.zzn.equals("audio/vnd.dts.uhd;profile=p2") || zzgd.zza >= 33) {
            if (!zzpnVar.zzb(iZza2)) {
                return null;
            }
        } else if (iZza2 > 10) {
            return null;
        }
        if (zzgd.zza > 28) {
            i = iZza2;
        } else if (iZza2 == 7) {
            i = 8;
        } else if (iZza2 != 3 && iZza2 != 4 && iZza2 != 5) {
        }
        if (zzgd.zza <= 26 && "fugu".equals(zzgd.zzb) && i == 1) {
            i = 2;
        }
        int iZzh = zzgd.zzh(i);
        if (iZzh != 0) {
            return Pair.create(Integer.valueOf(iZza), Integer.valueOf(iZzh));
        }
        return null;
    }
}
