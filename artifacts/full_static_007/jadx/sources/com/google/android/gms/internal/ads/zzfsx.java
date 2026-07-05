package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.common.util.Hex;
import java.io.File;
import java.util.HashSet;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzfsx {
    final File zza;
    private final File zzb;
    private final SharedPreferences zzc;
    private final zzazw zzd;

    public zzfsx(Context context, zzazw zzazwVar) {
        this.zzc = context.getSharedPreferences("pcvmspf", 0);
        File dir = context.getDir("pccache", 0);
        zzfsy.zza(dir, false);
        this.zzb = dir;
        File dir2 = context.getDir("tmppccache", 0);
        zzfsy.zza(dir2, true);
        this.zza = dir2;
        this.zzd = zzazwVar;
    }

    private final File zzd() {
        File file = new File(this.zzb, Integer.toString(this.zzd.zza()));
        if (!file.exists()) {
            file.mkdir();
        }
        return file;
    }

    private final String zze() {
        return "FBAMTD" + this.zzd.zza();
    }

    private final String zzf() {
        return "LATMTD" + this.zzd.zza();
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean zza(zzazz zzazzVar, zzftd zzftdVar) throws IllegalArgumentException {
        boolean z;
        String strZzk = zzazzVar.zzd().zzk();
        byte[] bArrZzB = zzazzVar.zzf().zzB();
        byte[] bArrZzB2 = zzazzVar.zze().zzB();
        if (!TextUtils.isEmpty(strZzk) && bArrZzB2 != null && bArrZzB2.length != 0) {
            zzfsy.zzd(this.zza);
            this.zza.mkdirs();
            zzfsy.zzc(strZzk, this.zza).mkdirs();
            File fileZzb = zzfsy.zzb(strZzk, "pcam.jar", this.zza);
            if ((bArrZzB == null || bArrZzB.length <= 0 || zzfsy.zze(fileZzb, bArrZzB)) && zzfsy.zze(zzfsy.zzb(strZzk, "pcbc", this.zza), bArrZzB2)) {
                File fileZzb2 = zzfsy.zzb(zzazzVar.zzd().zzk(), "pcam.jar", this.zza);
                if (fileZzb2.exists() && zzftdVar != null && !zzftdVar.zza(fileZzb2)) {
                    return false;
                }
                String strZzk2 = zzazzVar.zzd().zzk();
                if (TextUtils.isEmpty(strZzk2)) {
                    z = false;
                } else {
                    File fileZzb3 = zzfsy.zzb(strZzk2, "pcam.jar", this.zza);
                    File fileZzb4 = zzfsy.zzb(strZzk2, "pcbc", this.zza);
                    File fileZzb5 = zzfsy.zzb(strZzk2, "pcam.jar", zzd());
                    File fileZzb6 = zzfsy.zzb(strZzk2, "pcbc", zzd());
                    if ((!fileZzb3.exists() || fileZzb3.renameTo(fileZzb5)) && fileZzb4.exists() && fileZzb4.renameTo(fileZzb6)) {
                        zzbab zzbabVarZze = zzbac.zze();
                        zzbabVarZze.zze(zzazzVar.zzd().zzk());
                        zzbabVarZze.zza(zzazzVar.zzd().zzj());
                        zzbabVarZze.zzb(zzazzVar.zzd().zza());
                        zzbabVarZze.zzd(zzazzVar.zzd().zzd());
                        zzbabVarZze.zzc(zzazzVar.zzd().zzc());
                        zzbac zzbacVar = (zzbac) zzbabVarZze.zzbr();
                        zzbac zzbacVarZzb = zzb(1);
                        SharedPreferences.Editor editorEdit = this.zzc.edit();
                        if (zzbacVarZzb != null && !zzbacVar.zzk().equals(zzbacVarZzb.zzk())) {
                            editorEdit.putString(zze(), Hex.bytesToStringLowercase(zzbacVarZzb.zzaV()));
                        }
                        editorEdit.putString(zzf(), Hex.bytesToStringLowercase(zzbacVar.zzaV()));
                        if (editorEdit.commit()) {
                            z = true;
                        }
                    }
                }
                HashSet hashSet = new HashSet();
                zzbac zzbacVarZzb2 = zzb(1);
                if (zzbacVarZzb2 != null) {
                    hashSet.add(zzbacVarZzb2.zzk());
                }
                zzbac zzbacVarZzb3 = zzb(2);
                if (zzbacVarZzb3 != null) {
                    hashSet.add(zzbacVarZzb3.zzk());
                }
                for (File file : zzd().listFiles()) {
                    String name = file.getName();
                    if (!hashSet.contains(name)) {
                        zzfsy.zzd(zzfsy.zzc(name, zzd()));
                    }
                }
                return z;
            }
        }
        return false;
    }

    final zzbac zzb(int i) throws IllegalArgumentException {
        String string = i == 1 ? this.zzc.getString(zzf(), null) : this.zzc.getString(zze(), null);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            byte[] bArrStringToBytes = Hex.stringToBytes(string);
            zzhac zzhacVar = zzhac.zzb;
            zzbac zzbacVarZzh = zzbac.zzh(zzhac.zzv(bArrStringToBytes, 0, bArrStringToBytes.length));
            String strZzk = zzbacVarZzh.zzk();
            File fileZzb = zzfsy.zzb(strZzk, "pcam.jar", zzd());
            if (!fileZzb.exists()) {
                fileZzb = zzfsy.zzb(strZzk, "pcam", zzd());
            }
            File fileZzb2 = zzfsy.zzb(strZzk, "pcbc", zzd());
            if (fileZzb.exists()) {
                if (fileZzb2.exists()) {
                    return zzbacVarZzh;
                }
            }
        } catch (zzhcd unused) {
        }
        return null;
    }

    public final zzfsw zzc(int i) throws IllegalArgumentException {
        zzbac zzbacVarZzb = zzb(1);
        if (zzbacVarZzb == null) {
            return null;
        }
        String strZzk = zzbacVarZzb.zzk();
        File fileZzb = zzfsy.zzb(strZzk, "pcam.jar", zzd());
        if (!fileZzb.exists()) {
            fileZzb = zzfsy.zzb(strZzk, "pcam", zzd());
        }
        return new zzfsw(zzbacVarZzb, fileZzb, zzfsy.zzb(strZzk, "pcbc", zzd()), zzfsy.zzb(strZzk, "pcopt", zzd()));
    }
}
