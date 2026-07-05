package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import androidx.core.app.NotificationManagerCompat;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.lang.reflect.InvocationTargetException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzbmb implements zzblp {
    private final com.google.android.gms.ads.internal.zzb zza;
    private final zzdvc zzb;
    private final zzbud zzd;
    private final zzefz zze;
    private final zzcqd zzf;
    private com.google.android.gms.ads.internal.overlay.zzy zzg = null;
    private final zzgge zzh = zzcci.zzf;
    private final com.google.android.gms.ads.internal.util.client.zzr zzc = new com.google.android.gms.ads.internal.util.client.zzr(null);

    public zzbmb(com.google.android.gms.ads.internal.zzb zzbVar, zzbud zzbudVar, zzefz zzefzVar, zzdvc zzdvcVar, zzcqd zzcqdVar) {
        this.zza = zzbVar;
        this.zzd = zzbudVar;
        this.zze = zzefzVar;
        this.zzb = zzdvcVar;
        this.zzf = zzcqdVar;
    }

    public static int zzb(Map map) {
        String str = (String) map.get("o");
        if (str == null) {
            return -1;
        }
        if ("p".equalsIgnoreCase(str)) {
            return 7;
        }
        if ("l".equalsIgnoreCase(str)) {
            return 6;
        }
        return "c".equalsIgnoreCase(str) ? 14 : -1;
    }

    static Uri zzc(Context context, zzaxd zzaxdVar, Uri uri, View view, Activity activity, zzfhs zzfhsVar) {
        if (zzaxdVar == null) {
            return uri;
        }
        try {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzlW)).booleanValue() || zzfhsVar == null) {
                if (zzaxdVar.zze(uri)) {
                    uri = zzaxdVar.zza(uri, context, view, activity);
                }
            } else if (zzaxdVar.zze(uri)) {
                uri = zzfhsVar.zza(uri, context, view, activity);
            }
        } catch (zzaxe unused) {
        } catch (Exception e) {
            com.google.android.gms.ads.internal.zzu.zzo().zzw(e, "OpenGmsgHandler.maybeAddClickSignalsToUri");
        }
        return uri;
    }

    static Uri zzd(Uri uri) {
        try {
            if (uri.getQueryParameter("aclk_ms") != null) {
                return uri.buildUpon().appendQueryParameter("aclk_upms", String.valueOf(SystemClock.uptimeMillis())).build();
            }
        } catch (UnsupportedOperationException e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("Error adding click uptime parameter to url: ".concat(String.valueOf(uri.toString())), e);
        }
        return uri;
    }

    public static boolean zzf(Map map) {
        return "1".equals(map.get("custom_close"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzh(String str, com.google.android.gms.ads.internal.client.zza zzaVar, Map map, String str2) throws URISyntaxException {
        String str3;
        boolean z;
        HashMap map2;
        Object obj;
        Object obj2;
        boolean z2;
        zzchd zzchdVar = (zzchd) zzaVar;
        zzfgt zzfgtVarZzD = zzchdVar.zzD();
        zzfgw zzfgwVarZzR = zzchdVar.zzR();
        boolean z3 = false;
        if (zzfgtVarZzD == null || zzfgwVarZzR == null) {
            str3 = "";
            z = false;
        } else {
            String str4 = zzfgwVarZzR.zzb;
            z = zzfgtVarZzD.zzaj;
            str3 = str4;
        }
        boolean z4 = (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzkK)).booleanValue() && map.containsKey("sc") && ((String) map.get("sc")).equals("0")) ? false : true;
        boolean z5 = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzmH)).booleanValue() && map.containsKey("ig_cl") && ((String) map.get("ig_cl")).equals("true");
        if ("expand".equalsIgnoreCase(str2)) {
            if (zzchdVar.zzaF()) {
                com.google.android.gms.ads.internal.util.client.zzm.zzj("Cannot expand WebView that is already expanded.");
                return;
            } else {
                zzk(false);
                ((zzcin) zzaVar).zzaL(zzf(map), zzb(map), z4);
                return;
            }
        }
        if ("webapp".equalsIgnoreCase(str2)) {
            zzk(false);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzlR)).booleanValue() && Objects.equals(map.get("is_allowed_for_lock_screen"), "1")) {
                z3 = true;
            }
            if (str != null) {
                ((zzcin) zzaVar).zzaN(zzf(map), zzb(map), str, z4, z3);
                return;
            } else {
                ((zzcin) zzaVar).zzaM(zzf(map), zzb(map), (String) map.get("html"), (String) map.get("baseurl"), z4);
                return;
            }
        }
        if ("chrome_custom_tab".equalsIgnoreCase(str2)) {
            zzchdVar.getContext();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzeB)).booleanValue()) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzeF)).booleanValue()) {
                    com.google.android.gms.ads.internal.util.zze.zza("User opt out chrome custom tab.");
                } else {
                    z3 = true;
                }
            }
            boolean zZzg = zzbfm.zzg(zzchdVar.getContext());
            if (z3) {
                if (zZzg) {
                    zzk(true);
                    if (TextUtils.isEmpty(str)) {
                        com.google.android.gms.ads.internal.util.client.zzm.zzj("Cannot open browser with null or empty url");
                        zzm(7);
                        return;
                    }
                    Uri uriZzd = zzd(zzc(zzchdVar.getContext(), zzchdVar.zzI(), Uri.parse(str), zzchdVar.zzF(), zzchdVar.zzi(), zzchdVar.zzS()));
                    if (z && this.zze != null && zzl(zzaVar, zzchdVar.getContext(), uriZzd.toString(), str3)) {
                        return;
                    }
                    this.zzg = new zzbly(this);
                    ((zzcin) zzaVar).zzaJ(new com.google.android.gms.ads.internal.overlay.zzc(null, uriZzd.toString(), null, null, null, null, null, null, ObjectWrapper.wrap(this.zzg).asBinder(), true), z4, z5);
                    return;
                }
                zzm(4);
            }
            map.put("use_first_package", "true");
            map.put("use_running_process", "true");
            zzj(zzaVar, map, z, str3, z4, z5);
            return;
        }
        if ("app".equalsIgnoreCase(str2) && "true".equalsIgnoreCase((String) map.get("system_browser"))) {
            zzj(zzaVar, map, z, str3, z4, z5);
            return;
        }
        if ("open_app".equalsIgnoreCase(str2)) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzio)).booleanValue()) {
                zzk(true);
                String str5 = (String) map.get("p");
                if (str5 == null) {
                    com.google.android.gms.ads.internal.util.client.zzm.zzj("Package name missing from open app action.");
                    return;
                }
                if (z && this.zze != null && zzl(zzaVar, zzchdVar.getContext(), str5, str3)) {
                    return;
                }
                PackageManager packageManager = zzchdVar.getContext().getPackageManager();
                if (packageManager == null) {
                    com.google.android.gms.ads.internal.util.client.zzm.zzj("Cannot get package manager from open app action.");
                    return;
                }
                Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(str5);
                if (launchIntentForPackage != null) {
                    ((zzcin) zzaVar).zzaJ(new com.google.android.gms.ads.internal.overlay.zzc(launchIntentForPackage, this.zzg), z4, z5);
                    return;
                }
                return;
            }
            return;
        }
        zzk(true);
        String str6 = (String) map.get("intent_url");
        Intent uri = null;
        if (!TextUtils.isEmpty(str6)) {
            try {
                uri = Intent.parseUri(str6, 0);
            } catch (URISyntaxException e) {
                com.google.android.gms.ads.internal.util.client.zzm.zzh("Error parsing the url: ".concat(String.valueOf(str6)), e);
            }
        }
        Intent intent = uri;
        if (intent != null && intent.getData() != null) {
            Uri data = intent.getData();
            if (!Uri.EMPTY.equals(data)) {
                Uri uriZzd2 = zzd(zzc(zzchdVar.getContext(), zzchdVar.zzI(), data, zzchdVar.zzF(), zzchdVar.zzi(), zzchdVar.zzS()));
                if (!TextUtils.isEmpty(intent.getType())) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzip)).booleanValue()) {
                        intent.setDataAndType(uriZzd2, intent.getType());
                    } else {
                        intent.setData(uriZzd2);
                    }
                }
            }
        }
        boolean z6 = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zziG)).booleanValue() && "intent_async".equalsIgnoreCase(str2) && map.containsKey("event_id");
        HashMap map3 = new HashMap();
        if (z6) {
            map2 = map3;
            obj2 = "p";
            obj = "event_id";
            this.zzg = new zzblz(this, z4, zzaVar, map2, map);
            z2 = false;
        } else {
            map2 = map3;
            obj = "event_id";
            obj2 = "p";
            z2 = z4;
        }
        if (intent != null) {
            if (!z || this.zze == null || !zzl(zzaVar, zzchdVar.getContext(), intent.getData().toString(), str3)) {
                ((zzcin) zzaVar).zzaJ(new com.google.android.gms.ads.internal.overlay.zzc(intent, this.zzg), z2, z5);
                return;
            } else {
                if (z6) {
                    HashMap map4 = map2;
                    map4.put((String) map.get(obj), true);
                    ((zzbok) zzaVar).zzd("openIntentAsync", map4);
                    return;
                }
                return;
            }
        }
        HashMap map5 = map2;
        String string = !TextUtils.isEmpty(str) ? zzd(zzc(zzchdVar.getContext(), zzchdVar.zzI(), Uri.parse(str), zzchdVar.zzF(), zzchdVar.zzi(), zzchdVar.zzS())).toString() : str;
        if (!z || this.zze == null || !zzl(zzaVar, zzchdVar.getContext(), string, str3)) {
            ((zzcin) zzaVar).zzaJ(new com.google.android.gms.ads.internal.overlay.zzc((String) map.get("i"), string, (String) map.get("m"), (String) map.get(obj2), (String) map.get("c"), (String) map.get("f"), (String) map.get("e"), this.zzg), z2, z5);
        } else if (z6) {
            map5.put((String) map.get(obj), true);
            ((zzbok) zzaVar).zzd("openIntentAsync", map5);
        }
    }

    private final void zzi(Context context, String str, String str2) {
        this.zze.zzc(str);
        zzdvc zzdvcVar = this.zzb;
        if (zzdvcVar != null) {
            zzegk.zzc(context, zzdvcVar, this.zze, str, "dialog_not_shown", zzgbf.zze("dialog_not_shown_reason", str2));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0152, code lost:
    
        r21 = r6;
        r10 = r15;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x015a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zzj(com.google.android.gms.ads.internal.client.zza zzaVar, Map map, boolean z, String str, boolean z2, boolean z3) {
        Intent intentZzb;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        ResolveInfo resolveInfoZzc;
        com.google.android.gms.ads.internal.client.zza zzaVar2;
        boolean z4 = true;
        zzk(true);
        zzchd zzchdVar = (zzchd) zzaVar;
        Context context = zzchdVar.getContext();
        zzaxd zzaxdVarZzI = zzchdVar.zzI();
        View viewZzF = zzchdVar.zzF();
        zzfhs zzfhsVarZzS = zzchdVar.zzS();
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        String str2 = (String) map.get("u");
        Intent intentZzb2 = null;
        Uri uriBuild = null;
        if (TextUtils.isEmpty(str2)) {
            intentZzb = intentZzb2;
        } else {
            Uri uriZzd = zzd(zzc(context, zzaxdVarZzI, Uri.parse(str2), viewZzF, null, zzfhsVarZzS));
            boolean z5 = Boolean.parseBoolean((String) map.get("use_first_package"));
            boolean z6 = Boolean.parseBoolean((String) map.get("use_running_process"));
            if (!Boolean.parseBoolean((String) map.get("use_custom_tabs"))) {
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzez)).booleanValue()) {
                    z4 = false;
                }
            }
            if ("http".equalsIgnoreCase(uriZzd.getScheme())) {
                uriBuild = uriZzd.buildUpon().scheme("https").build();
            } else if ("https".equalsIgnoreCase(uriZzd.getScheme())) {
                uriBuild = uriZzd.buildUpon().scheme("http").build();
            }
            Uri uri = uriBuild;
            ArrayList arrayList = new ArrayList();
            Intent intentZza = zzbma.zza(uriZzd, context, zzaxdVarZzI, viewZzF, zzfhsVarZzS);
            Intent intentZza2 = zzbma.zza(uri, context, zzaxdVarZzI, viewZzF, zzfhsVarZzS);
            if (z4) {
                com.google.android.gms.ads.internal.zzu.zzp();
                com.google.android.gms.ads.internal.util.zzt.zzo(context, intentZza);
                com.google.android.gms.ads.internal.zzu.zzp();
                com.google.android.gms.ads.internal.util.zzt.zzo(context, intentZza2);
            }
            ArrayList arrayList2 = arrayList;
            ResolveInfo resolveInfoZzd = zzbma.zzd(intentZza, arrayList, context, zzaxdVarZzI, viewZzF, zzfhsVarZzS);
            if (resolveInfoZzd != null) {
                intentZzb2 = zzbma.zzb(intentZza, resolveInfoZzd, context, zzaxdVarZzI, viewZzF, zzfhsVarZzS);
            } else if (intentZza2 == null || (resolveInfoZzc = zzbma.zzc(intentZza2, context, zzaxdVarZzI, viewZzF, zzfhsVarZzS)) == null) {
                if (!arrayList2.isEmpty()) {
                    if (!z6 || activityManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
                        ArrayList arrayList3 = arrayList2;
                        if (z5) {
                            intentZzb2 = zzbma.zzb(intentZza, (ResolveInfo) arrayList3.get(0), context, zzaxdVarZzI, viewZzF, zzfhsVarZzS);
                        }
                    } else {
                        int size = arrayList2.size();
                        int i = 0;
                        loop0: while (i < size) {
                            ArrayList arrayList4 = arrayList2;
                            ResolveInfo resolveInfo = (ResolveInfo) arrayList4.get(i);
                            Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
                            do {
                                int i2 = i + 1;
                                if (it.hasNext()) {
                                }
                            } while (!it.next().processName.equals(resolveInfo.activityInfo.packageName));
                            intentZzb2 = zzbma.zzb(intentZza, resolveInfo, context, zzaxdVarZzI, viewZzF, zzfhsVarZzS);
                            break loop0;
                        }
                        ArrayList arrayList32 = arrayList2;
                        if (z5) {
                        }
                    }
                }
                intentZzb = intentZza;
            } else {
                intentZzb = zzbma.zzb(intentZza, resolveInfoZzc, context, zzaxdVarZzI, viewZzF, zzfhsVarZzS);
                if (zzbma.zzc(intentZzb, context, zzaxdVarZzI, viewZzF, zzfhsVarZzS) == null) {
                }
            }
            intentZzb = intentZzb2;
        }
        if (!z || this.zze == null || intentZzb == null) {
            zzaVar2 = zzaVar;
        } else {
            zzaVar2 = zzaVar;
            if (zzl(zzaVar2, zzchdVar.getContext(), intentZzb.getData().toString(), str)) {
                return;
            }
        }
        try {
            ((zzcin) zzaVar2).zzaJ(new com.google.android.gms.ads.internal.overlay.zzc(intentZzb, this.zzg), z2, z3);
        } catch (ActivityNotFoundException e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj(e.getMessage());
        }
    }

    private final void zzk(boolean z) {
        zzbud zzbudVar = this.zzd;
        if (zzbudVar != null) {
            zzbudVar.zza(z);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x008f, code lost:
    
        if ((android.os.Build.VERSION.SDK_INT < 33 ? ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(com.google.android.gms.internal.ads.zzbep.zziz)).booleanValue() : ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(com.google.android.gms.internal.ads.zzbep.zziy)).booleanValue()) != false) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean zzl(com.google.android.gms.ads.internal.client.zza zzaVar, Context context, String str, String str2) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        zzdvc zzdvcVar = this.zzb;
        if (zzdvcVar != null) {
            zzegk.zzc(context, zzdvcVar, this.zze, str2, "offline_open", new HashMap());
        }
        if (com.google.android.gms.ads.internal.zzu.zzo().zzA(context)) {
            this.zze.zzh(this.zzc, str2);
            return false;
        }
        com.google.android.gms.ads.internal.zzu.zzp();
        com.google.android.gms.ads.internal.util.zzbt zzbtVarZzz = com.google.android.gms.ads.internal.util.zzt.zzz(context);
        com.google.android.gms.ads.internal.zzu.zzp();
        boolean zAreNotificationsEnabled = NotificationManagerCompat.from(context).areNotificationsEnabled();
        boolean zZzi = com.google.android.gms.ads.internal.zzu.zzq().zzi(context, "offline_notification_channel");
        zzchd zzchdVar = (zzchd) zzaVar;
        boolean z = zzchdVar.zzO().zzi() && zzchdVar.zzi() == null;
        if (!zAreNotificationsEnabled) {
            com.google.android.gms.ads.internal.zzu.zzp();
            if (!NotificationManagerCompat.from(context).areNotificationsEnabled()) {
            }
            zzi(context, str2, "notifications_disabled");
            return false;
        }
        if (zZzi) {
            zzi(context, str2, "notification_channel_disabled");
            return false;
        }
        if (zzbtVarZzz == null) {
            zzi(context, str2, "work_manager_unavailable");
            return false;
        }
        if (z) {
            zzi(context, str2, "ad_no_activity");
            return false;
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zziw)).booleanValue()) {
            zzi(context, str2, "notification_flow_disabled");
            return false;
        }
        if (zzchdVar.zzL() == null || zzchdVar.zzi() == null) {
            ((zzcin) zzaVar).zzaK(str2, str, 14);
        } else {
            zzegl zzeglVarZze = zzegm.zze();
            zzeglVarZze.zza(zzchdVar.zzi());
            zzeglVarZze.zzb(null);
            zzeglVarZze.zzc(str2);
            zzeglVarZze.zzd(str);
            try {
                zzchdVar.zzL().zzf(zzeglVarZze.zze());
            } catch (Exception e) {
                zzi(context, str2, e.getMessage());
                return false;
            }
        }
        zzaVar.onAdClicked();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzm(int i) {
        String str;
        zzdvc zzdvcVar = this.zzb;
        if (zzdvcVar == null) {
            return;
        }
        zzdvb zzdvbVarZza = zzdvcVar.zza();
        zzdvbVarZza.zzb("action", "cct_action");
        switch (i) {
            case 2:
                str = "CONTEXT_NOT_AN_ACTIVITY";
                break;
            case 3:
                str = "CONTEXT_NULL";
                break;
            case 4:
                str = "CCT_NOT_SUPPORTED";
                break;
            case 5:
                str = "CCT_READY_TO_OPEN";
                break;
            case 6:
                str = "ACTIVITY_NOT_FOUND";
                break;
            case 7:
                str = "EMPTY_URL";
                break;
            case 8:
                str = "UNKNOWN";
                break;
            default:
                str = "WRONG_EXP_SETUP";
                break;
        }
        zzdvbVarZza.zzb("cct_open_status", str);
        zzdvbVarZza.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzblp
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        com.google.android.gms.ads.internal.client.zza zzaVar = (com.google.android.gms.ads.internal.client.zza) obj;
        String str = (String) map.get("u");
        Map map2 = new HashMap();
        zzchd zzchdVar = (zzchd) zzaVar;
        if (zzchdVar.zzD() != null) {
            map2 = zzchdVar.zzD().zzax;
        }
        String strZzc = zzcaw.zzc(str, zzchdVar.getContext(), true, map2);
        String str2 = (String) map.get("a");
        if (str2 == null) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Action missing from an open GMSG.");
            return;
        }
        com.google.android.gms.ads.internal.zzb zzbVar = this.zza;
        if (zzbVar == null || zzbVar.zzc()) {
            zzgft.zzr((((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzka)).booleanValue() && this.zzf != null && zzcqd.zzj(strZzc)) ? this.zzf.zzb(strZzc, com.google.android.gms.ads.internal.client.zzay.zze()) : zzgft.zzh(strZzc), new zzblx(this, map, zzaVar, str2), this.zzh);
        } else {
            this.zza.zzb(strZzc);
        }
    }
}
