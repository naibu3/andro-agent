package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.common.net.HttpHeaders;
import java.util.HashMap;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzeeh implements zzfkw {
    private static final Pattern zza = Pattern.compile("([^;]+=[^;]+)(;\\s|$)", 2);
    private final String zzb;
    private final zzfmc zzc;
    private final zzfmn zzd;

    public zzeeh(String str, zzfmn zzfmnVar, zzfmc zzfmcVar) {
        this.zzb = str;
        this.zzd = zzfmnVar;
        this.zzc = zzfmcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfkw
    public final /* bridge */ /* synthetic */ Object zza(Object obj) throws Exception {
        zzdzd zzdzdVar;
        String strConcat;
        zzeeg zzeegVar = (zzeeg) obj;
        int iOptInt = zzeegVar.zza.optInt("http_timeout_millis", 60000);
        zzbxx zzbxxVar = zzeegVar.zzb;
        String strJoin = "";
        if (zzbxxVar.zza() != -2) {
            if (zzbxxVar.zza() == 1) {
                if (zzbxxVar.zzh() != null) {
                    strJoin = TextUtils.join(", ", zzbxxVar.zzh());
                    com.google.android.gms.ads.internal.util.client.zzm.zzg(strJoin);
                }
                zzdzdVar = new zzdzd(2, "Error building request URL: ".concat(String.valueOf(strJoin)));
            } else {
                zzdzdVar = new zzdzd(1);
            }
            zzfmn zzfmnVar = this.zzd;
            zzfmc zzfmcVar = this.zzc;
            zzfmcVar.zzi(zzdzdVar);
            zzfmcVar.zzh(false);
            zzfmnVar.zza(zzfmcVar);
            throw zzdzdVar;
        }
        HashMap map = new HashMap();
        if (zzeegVar.zzb.zzj() && !TextUtils.isEmpty(this.zzb)) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzaP)).booleanValue()) {
                String str = this.zzb;
                if (TextUtils.isEmpty(str)) {
                    strConcat = "";
                } else {
                    Matcher matcher = zza.matcher(str);
                    strConcat = "";
                    while (matcher.find()) {
                        String strGroup = matcher.group(1);
                        if (strGroup != null && (strGroup.toLowerCase(Locale.ROOT).startsWith("id=") || strGroup.toLowerCase(Locale.ROOT).startsWith("ide="))) {
                            if (!TextUtils.isEmpty(strConcat)) {
                                strConcat = strConcat.concat("; ");
                            }
                            strConcat = strConcat.concat(strGroup);
                        }
                    }
                }
                if (!TextUtils.isEmpty(strConcat)) {
                    map.put(HttpHeaders.COOKIE, strConcat);
                }
            } else {
                map.put(HttpHeaders.COOKIE, this.zzb);
            }
        }
        if (zzeegVar.zzb.zzk()) {
            zzeei.zza(map, zzeegVar.zza);
        }
        if (zzeegVar.zzb != null && !TextUtils.isEmpty(zzeegVar.zzb.zzf())) {
            strJoin = zzeegVar.zzb.zzf();
        }
        zzfmn zzfmnVar2 = this.zzd;
        zzfmc zzfmcVar2 = this.zzc;
        zzfmcVar2.zzh(true);
        zzfmnVar2.zza(zzfmcVar2);
        return new zzeec(zzeegVar.zzb.zzg(), iOptInt, map, strJoin.getBytes(zzfxs.zzc), "", zzeegVar.zzb.zzk());
    }
}
