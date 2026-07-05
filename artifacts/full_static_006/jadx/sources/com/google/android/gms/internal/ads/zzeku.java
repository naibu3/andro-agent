package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.ads.mediation.AbstractAdViewAdapter;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public abstract class zzeku implements zzehl {
    private static Bundle zzd(Bundle bundle) {
        return bundle == null ? new Bundle() : new Bundle(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzehl
    public final ListenableFuture zza(zzfhf zzfhfVar, zzfgt zzfgtVar) {
        String strOptString = zzfgtVar.zzw.optString(AbstractAdViewAdapter.AD_UNIT_ID_PARAMETER, "");
        zzfho zzfhoVar = zzfhfVar.zza.zza;
        zzfhm zzfhmVar = new zzfhm();
        zzfhmVar.zzq(zzfhoVar);
        zzfhmVar.zzt(strOptString);
        Bundle bundleZzd = zzd(zzfhoVar.zzd.zzm);
        Bundle bundleZzd2 = zzd(bundleZzd.getBundle("com.google.ads.mediation.admob.AdMobAdapter"));
        bundleZzd2.putInt("gw", 1);
        String strOptString2 = zzfgtVar.zzw.optString("mad_hac", null);
        if (strOptString2 != null) {
            bundleZzd2.putString("mad_hac", strOptString2);
        }
        String strOptString3 = zzfgtVar.zzw.optString("adJson", null);
        if (strOptString3 != null) {
            bundleZzd2.putString("_ad", strOptString3);
        }
        bundleZzd2.putBoolean("_noRefresh", true);
        Iterator<String> itKeys = zzfgtVar.zzE.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            String strOptString4 = zzfgtVar.zzE.optString(next, null);
            if (next != null) {
                bundleZzd2.putString(next, strOptString4);
            }
        }
        bundleZzd.putBundle("com.google.ads.mediation.admob.AdMobAdapter", bundleZzd2);
        com.google.android.gms.ads.internal.client.zzl zzlVar = zzfhoVar.zzd;
        Bundle bundle = zzlVar.zzn;
        List list = zzlVar.zzo;
        String str = zzlVar.zzp;
        String str2 = zzlVar.zzq;
        int i = zzlVar.zzd;
        boolean z = zzlVar.zzr;
        List list2 = zzlVar.zze;
        com.google.android.gms.ads.internal.client.zzc zzcVar = zzlVar.zzs;
        boolean z2 = zzlVar.zzf;
        int i2 = zzlVar.zzt;
        int i3 = zzlVar.zzg;
        String str3 = zzlVar.zzu;
        boolean z3 = zzlVar.zzh;
        List list3 = zzlVar.zzv;
        String str4 = zzlVar.zzi;
        int i4 = zzlVar.zzw;
        zzfhmVar.zzH(new com.google.android.gms.ads.internal.client.zzl(zzlVar.zza, zzlVar.zzb, bundleZzd2, i, list2, z2, i3, z3, str4, zzlVar.zzj, zzlVar.zzk, zzlVar.zzl, bundleZzd, bundle, list, str, str2, z, zzcVar, i2, str3, list3, i4, zzlVar.zzx, zzlVar.zzy, zzlVar.zzz));
        zzfho zzfhoVarZzJ = zzfhmVar.zzJ();
        Bundle bundle2 = new Bundle();
        zzfgw zzfgwVar = zzfhfVar.zzb.zzb;
        Bundle bundle3 = new Bundle();
        bundle3.putStringArrayList("nofill_urls", new ArrayList<>(zzfgwVar.zza));
        bundle3.putInt("refresh_interval", zzfgwVar.zzc);
        bundle3.putString("gws_query_id", zzfgwVar.zzb);
        bundle2.putBundle("parent_common_config", bundle3);
        zzfho zzfhoVar2 = zzfhfVar.zza.zza;
        Bundle bundle4 = new Bundle();
        bundle4.putString("initial_ad_unit_id", zzfhoVar2.zzf);
        bundle4.putString("allocation_id", zzfgtVar.zzx);
        bundle4.putString("ad_source_name", zzfgtVar.zzG);
        bundle4.putStringArrayList("click_urls", new ArrayList<>(zzfgtVar.zzc));
        bundle4.putStringArrayList("imp_urls", new ArrayList<>(zzfgtVar.zzd));
        bundle4.putStringArrayList("manual_tracking_urls", new ArrayList<>(zzfgtVar.zzq));
        bundle4.putStringArrayList("fill_urls", new ArrayList<>(zzfgtVar.zzn));
        bundle4.putStringArrayList("video_start_urls", new ArrayList<>(zzfgtVar.zzh));
        bundle4.putStringArrayList("video_reward_urls", new ArrayList<>(zzfgtVar.zzi));
        bundle4.putStringArrayList("video_complete_urls", new ArrayList<>(zzfgtVar.zzj));
        bundle4.putString("transaction_id", zzfgtVar.zzk);
        bundle4.putString("valid_from_timestamp", zzfgtVar.zzl);
        bundle4.putBoolean("is_closable_area_disabled", zzfgtVar.zzQ);
        bundle4.putString("recursive_server_response_data", zzfgtVar.zzap);
        if (zzfgtVar.zzm != null) {
            Bundle bundle5 = new Bundle();
            bundle5.putInt("rb_amount", zzfgtVar.zzm.zzb);
            bundle5.putString("rb_type", zzfgtVar.zzm.zza);
            bundle4.putParcelableArray("rewards", new Bundle[]{bundle5});
        }
        bundle2.putBundle("parent_ad_config", bundle4);
        return zzc(zzfhoVarZzJ, bundle2, zzfgtVar, zzfhfVar);
    }

    @Override // com.google.android.gms.internal.ads.zzehl
    public final boolean zzb(zzfhf zzfhfVar, zzfgt zzfgtVar) {
        return !TextUtils.isEmpty(zzfgtVar.zzw.optString(AbstractAdViewAdapter.AD_UNIT_ID_PARAMETER, ""));
    }

    protected abstract ListenableFuture zzc(zzfho zzfhoVar, Bundle bundle, zzfgt zzfgtVar, zzfhf zzfhfVar);
}
