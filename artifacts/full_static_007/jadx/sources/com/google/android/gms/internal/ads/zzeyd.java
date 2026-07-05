package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.LocaleList;
import android.os.StatFs;
import android.support.v4.media.session.PlaybackStateCompat;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzeyd implements zzexw {
    private final zzgge zza;
    private final Context zzb;

    public zzeyd(zzgge zzggeVar, Context context) {
        this.zza = zzggeVar;
        this.zzb = context;
    }

    private static ResolveInfo zzd(PackageManager packageManager, String str) {
        return packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)), 65536);
    }

    @Override // com.google.android.gms.internal.ads.zzexw
    public final int zza() {
        return 38;
    }

    @Override // com.google.android.gms.internal.ads.zzexw
    public final ListenableFuture zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzeyc
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.zzc();
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final /* synthetic */ zzeyb zzc() throws Exception {
        ActivityInfo activityInfo;
        PackageInfo packageInfo;
        String str;
        String str2;
        boolean zEquals;
        boolean z;
        String string;
        Bundle bundle;
        PackageInfo packageInfo2;
        PackageManager packageManager = this.zzb.getPackageManager();
        Locale locale = Locale.getDefault();
        ResolveInfo resolveInfoZzd = zzd(packageManager, "geo:0,0?q=donuts");
        ResolveInfo resolveInfoZzd2 = zzd(packageManager, "http://www.google.com");
        String country = locale.getCountry();
        com.google.android.gms.ads.internal.zzu.zzp();
        com.google.android.gms.ads.internal.client.zzay.zzb();
        boolean zZzs = com.google.android.gms.ads.internal.util.client.zzf.zzs();
        Context context = this.zzb;
        boolean zIsLatchsky = DeviceProperties.isLatchsky(context);
        boolean zIsSidewinder = DeviceProperties.isSidewinder(context);
        String language = locale.getLanguage();
        ArrayList arrayList = new ArrayList();
        LocaleList localeList = LocaleList.getDefault();
        for (int i = 0; i < localeList.size(); i++) {
            arrayList.add(localeList.get(i).getLanguage());
        }
        Context context2 = this.zzb;
        ResolveInfo resolveInfoZzd3 = zzd(packageManager, "market://details?id=com.google.android.gms.ads");
        if (resolveInfoZzd3 != null && (activityInfo = resolveInfoZzd3.activityInfo) != null) {
            try {
                packageInfo = Wrappers.packageManager(context2).getPackageInfo(activityInfo.packageName, 0);
            } catch (PackageManager.NameNotFoundException unused) {
            }
            if (packageInfo != null) {
                str = packageInfo.versionCode + "." + activityInfo.packageName;
            } else {
                str = null;
            }
        }
        try {
            packageInfo2 = Wrappers.packageManager(this.zzb).getPackageInfo("com.android.vending", 128);
        } catch (Exception unused2) {
        }
        String str3 = packageInfo2 != null ? packageInfo2.versionCode + "." + packageInfo2.packageName : null;
        Context context3 = this.zzb;
        String str4 = Build.FINGERPRINT;
        if (packageManager != null) {
            str2 = str3;
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
            ResolveInfo resolveInfoResolveActivity = packageManager.resolveActivity(intent, 0);
            List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
            if (listQueryIntentActivities != null && resolveInfoResolveActivity != null) {
                int i2 = 0;
                while (i2 < listQueryIntentActivities.size()) {
                    List<ResolveInfo> list = listQueryIntentActivities;
                    if (resolveInfoResolveActivity.activityInfo.name.equals(listQueryIntentActivities.get(i2).activityInfo.name)) {
                        zEquals = resolveInfoResolveActivity.activityInfo.packageName.equals(zzhlh.zza(context3));
                        break;
                    }
                    i2++;
                    listQueryIntentActivities = list;
                }
            }
            com.google.android.gms.ads.internal.zzu.zzp();
            long availableBytes = new StatFs(Environment.getDataDirectory().getAbsolutePath()).getAvailableBytes() / PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID;
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzlq)).booleanValue()) {
                com.google.android.gms.ads.internal.zzu.zzp();
                z = com.google.android.gms.ads.internal.util.zzt.zzB(this.zzb);
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzlu)).booleanValue()) {
                string = "";
            } else {
                Context context4 = this.zzb;
                try {
                    bundle = Wrappers.packageManager(context4).getApplicationInfo(context4.getPackageName(), 128).metaData;
                } catch (PackageManager.NameNotFoundException unused3) {
                }
                string = (bundle == null || !bundle.containsKey("com.google.unity.ads.UNITY_VERSION")) ? null : bundle.getString("com.google.unity.ads.UNITY_VERSION");
            }
            return new zzeyb(resolveInfoZzd == null, resolveInfoZzd2 == null, country, zZzs, zIsLatchsky, zIsSidewinder, language, arrayList, str, str2, str4, zEquals, Build.MODEL, availableBytes, z, string, Build.VERSION.SDK_INT);
        }
        str2 = str3;
        zEquals = false;
        com.google.android.gms.ads.internal.zzu.zzp();
        long availableBytes2 = new StatFs(Environment.getDataDirectory().getAbsolutePath()).getAvailableBytes() / PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzlq)).booleanValue()) {
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzlu)).booleanValue()) {
        }
        if (resolveInfoZzd2 == null) {
        }
        return new zzeyb(resolveInfoZzd == null, resolveInfoZzd2 == null, country, zZzs, zIsLatchsky, zIsSidewinder, language, arrayList, str, str2, str4, zEquals, Build.MODEL, availableBytes2, z, string, Build.VERSION.SDK_INT);
    }
}
