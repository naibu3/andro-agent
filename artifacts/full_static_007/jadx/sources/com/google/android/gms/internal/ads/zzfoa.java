package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.util.Clock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzfoa {
    private final zzelf zza;
    private final String zzb;
    private final String zzc;
    private final String zzd;
    private final Context zze;
    private final zzfhg zzf;
    private final zzfhh zzg;
    private final Clock zzh;
    private final zzaxd zzi;

    public zzfoa(zzelf zzelfVar, VersionInfoParcel versionInfoParcel, String str, String str2, Context context, zzfhg zzfhgVar, zzfhh zzfhhVar, Clock clock, zzaxd zzaxdVar) {
        this.zza = zzelfVar;
        this.zzb = versionInfoParcel.afmaVersion;
        this.zzc = str;
        this.zzd = str2;
        this.zze = context;
        this.zzf = zzfhgVar;
        this.zzg = zzfhhVar;
        this.zzh = clock;
        this.zzi = zzaxdVar;
    }

    public static final List zzf(int i, int i2, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(zzj((String) it.next(), "@gw_mpe@", "2." + i2));
        }
        return arrayList;
    }

    public static final List zzg(List list, String str) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(zzj((String) it.next(), "@gw_adnetstatus@", str));
        }
        return arrayList;
    }

    public static final List zzh(List list, long j) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(zzj((String) it.next(), "@gw_ttr@", Long.toString(j, 10)));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String zzi(String str) {
        return TextUtils.isEmpty(str) ? "" : com.google.android.gms.ads.internal.util.client.zzl.zzk() ? "fakeForAdDebugLog" : str;
    }

    private static String zzj(String str, String str2, String str3) {
        if (true == TextUtils.isEmpty(str3)) {
            str3 = "";
        }
        return str.replaceAll(str2, str3);
    }

    public final List zzc(zzfhf zzfhfVar, zzfgt zzfgtVar, List list) {
        return zzd(zzfhfVar, zzfgtVar, false, "", "", list);
    }

    public final List zzd(zzfhf zzfhfVar, zzfgt zzfgtVar, boolean z, String str, String str2, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            boolean z2 = true;
            String strZzj = zzj(zzj(zzj((String) it.next(), "@gw_adlocid@", zzfhfVar.zza.zza.zzf), "@gw_adnetrefresh@", true != z ? "0" : "1"), "@gw_sdkver@", this.zzb);
            if (zzfgtVar != null) {
                strZzj = zzcaw.zzc(zzj(zzj(zzj(strZzj, "@gw_qdata@", zzfgtVar.zzz), "@gw_adnetid@", zzfgtVar.zzy), "@gw_allocid@", zzfgtVar.zzx), this.zze, zzfgtVar.zzX, zzfgtVar.zzax);
            }
            String strZzj2 = zzj(zzj(zzj(zzj(strZzj, "@gw_adnetstatus@", this.zza.zzg()), "@gw_ttr@", Long.toString(this.zza.zza(), 10)), "@gw_seqnum@", this.zzc), "@gw_sessid@", this.zzd);
            boolean z3 = false;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzdx)).booleanValue() && !TextUtils.isEmpty(str)) {
                z3 = true;
            }
            boolean zIsEmpty = TextUtils.isEmpty(str2);
            boolean z4 = !zIsEmpty;
            if (z3) {
                z2 = z4;
            } else {
                if (!zIsEmpty) {
                }
                arrayList.add(strZzj2);
            }
            if (this.zzi.zzf(Uri.parse(strZzj2))) {
                Uri.Builder builderBuildUpon = Uri.parse(strZzj2).buildUpon();
                if (z3) {
                    builderBuildUpon = builderBuildUpon.appendQueryParameter("ms", str);
                }
                if (z2) {
                    builderBuildUpon = builderBuildUpon.appendQueryParameter("attok", str2);
                }
                strZzj2 = builderBuildUpon.build().toString();
            }
            arrayList.add(strZzj2);
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0065 A[LOOP:0: B:13:0x005f->B:15:0x0065, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List zze(zzfgt zzfgtVar, List list, zzbyh zzbyhVar) {
        zzfhg zzfhgVar;
        zzfyb zzfybVarZzd;
        Iterator it;
        ArrayList arrayList = new ArrayList();
        long jCurrentTimeMillis = this.zzh.currentTimeMillis();
        try {
            String strZzc = zzbyhVar.zzc();
            String string = Integer.toString(zzbyhVar.zzb());
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzdy)).booleanValue()) {
                zzfhh zzfhhVar = this.zzg;
                if (zzfhhVar == null) {
                    zzfybVarZzd = zzfyb.zzc();
                    String str = (String) zzfybVarZzd.zza(new zzfxu() { // from class: com.google.android.gms.internal.ads.zzfny
                        @Override // com.google.android.gms.internal.ads.zzfxu
                        public final Object apply(Object obj) {
                            return zzfoa.zzi(((zzfhg) obj).zza);
                        }
                    }).zzb("");
                    String str2 = (String) zzfybVarZzd.zza(new zzfxu() { // from class: com.google.android.gms.internal.ads.zzfnz
                        @Override // com.google.android.gms.internal.ads.zzfxu
                        public final Object apply(Object obj) {
                            return zzfoa.zzi(((zzfhg) obj).zzb);
                        }
                    }).zzb("");
                    it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(zzcaw.zzc(zzj(zzj(zzj(zzj(zzj(zzj((String) it.next(), "@gw_rwd_userid@", Uri.encode(str)), "@gw_rwd_custom_data@", Uri.encode(str2)), "@gw_tmstmp@", Long.toString(jCurrentTimeMillis)), "@gw_rwd_itm@", Uri.encode(strZzc)), "@gw_rwd_amt@", string), "@gw_sdkver@", this.zzb), this.zze, zzfgtVar.zzX, zzfgtVar.zzax));
                    }
                    return arrayList;
                }
                zzfhgVar = zzfhhVar.zza;
            } else {
                zzfhgVar = this.zzf;
            }
            zzfybVarZzd = zzfyb.zzd(zzfhgVar);
            String str3 = (String) zzfybVarZzd.zza(new zzfxu() { // from class: com.google.android.gms.internal.ads.zzfny
                @Override // com.google.android.gms.internal.ads.zzfxu
                public final Object apply(Object obj) {
                    return zzfoa.zzi(((zzfhg) obj).zza);
                }
            }).zzb("");
            String str22 = (String) zzfybVarZzd.zza(new zzfxu() { // from class: com.google.android.gms.internal.ads.zzfnz
                @Override // com.google.android.gms.internal.ads.zzfxu
                public final Object apply(Object obj) {
                    return zzfoa.zzi(((zzfhg) obj).zzb);
                }
            }).zzb("");
            it = list.iterator();
            while (it.hasNext()) {
            }
            return arrayList;
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("Unable to determine award type and amount.", e);
            return arrayList;
        }
    }
}
