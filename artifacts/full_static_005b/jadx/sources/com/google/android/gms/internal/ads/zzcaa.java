package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Looper;
import android.view.View;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes2.dex */
public final class zzcaa implements zzcaf {
    public static final /* synthetic */ int zzb = 0;
    private static final List zzc = Collections.synchronizedList(new ArrayList());
    boolean zza;
    private final zzhgn zzd;
    private final LinkedHashMap zze;
    private final Context zzh;
    private final zzcac zzi;
    private final zzcab zzn;
    private final List zzf = new ArrayList();
    private final List zzg = new ArrayList();
    private final Object zzj = new Object();
    private HashSet zzk = new HashSet();
    private boolean zzl = false;
    private boolean zzm = false;

    public zzcaa(Context context, VersionInfoParcel versionInfoParcel, zzcac zzcacVar, String str, zzcab zzcabVar) {
        Preconditions.checkNotNull(zzcacVar, "SafeBrowsing config is not present.");
        this.zzh = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.zze = new LinkedHashMap();
        this.zzn = zzcabVar;
        this.zzi = zzcacVar;
        Iterator it = zzcacVar.zze.iterator();
        while (it.hasNext()) {
            this.zzk.add(((String) it.next()).toLowerCase(Locale.ENGLISH));
        }
        this.zzk.remove("cookie".toLowerCase(Locale.ENGLISH));
        zzhgn zzhgnVarZzc = zzhjh.zzc();
        zzhgnVarZzc.zzj(zzhim.OCTAGON_AD);
        zzhgnVarZzc.zzk(str);
        zzhgnVarZzc.zzh(str);
        zzhgo zzhgoVarZzc = zzhgp.zzc();
        String str2 = this.zzi.zza;
        if (str2 != null) {
            zzhgoVarZzc.zza(str2);
        }
        zzhgnVarZzc.zzg((zzhgp) zzhgoVarZzc.zzbr());
        zzhis zzhisVarZzc = zzhit.zzc();
        zzhisVarZzc.zzc(Wrappers.packageManager(this.zzh).isCallerInstantApp());
        String str3 = versionInfoParcel.afmaVersion;
        if (str3 != null) {
            zzhisVarZzc.zza(str3);
        }
        long apkVersion = GoogleApiAvailabilityLight.getInstance().getApkVersion(this.zzh);
        if (apkVersion > 0) {
            zzhisVarZzc.zzb(apkVersion);
        }
        zzhgnVarZzc.zzf((zzhit) zzhisVarZzc.zzbr());
        this.zzd = zzhgnVarZzc;
    }

    @Override // com.google.android.gms.internal.ads.zzcaf
    public final zzcac zza() {
        return this.zzi;
    }

    final /* synthetic */ ListenableFuture zzb(Map map) throws Exception {
        zzhiq zzhiqVar;
        ListenableFuture listenableFutureZzm;
        if (map != null) {
            try {
                for (String str : map.keySet()) {
                    JSONArray jSONArrayOptJSONArray = new JSONObject((String) map.get(str)).optJSONArray("matches");
                    if (jSONArrayOptJSONArray != null) {
                        synchronized (this.zzj) {
                            int length = jSONArrayOptJSONArray.length();
                            synchronized (this.zzj) {
                                zzhiqVar = (zzhiq) this.zze.get(str);
                            }
                            if (zzhiqVar == null) {
                                zzcae.zza("Cannot find the corresponding resource object for " + str);
                            } else {
                                for (int i = 0; i < length; i++) {
                                    zzhiqVar.zza(jSONArrayOptJSONArray.getJSONObject(i).getString("threat_type"));
                                }
                                this.zza = (length > 0) | this.zza;
                            }
                        }
                    }
                }
            } catch (JSONException e) {
                if (((Boolean) zzbgs.zzb.zze()).booleanValue()) {
                    com.google.android.gms.ads.internal.util.client.zzm.zzf("Failed to get SafeBrowsing metadata", e);
                }
                return zzgft.zzg(new Exception("Safebrowsing report transmission failed."));
            }
        }
        if (this.zza) {
            synchronized (this.zzj) {
                this.zzd.zzj(zzhim.OCTAGON_AD_SB_MATCH);
            }
        }
        boolean z = this.zza;
        if (!(z && this.zzi.zzg) && (!(this.zzm && this.zzi.zzf) && (z || !this.zzi.zzd))) {
            return zzgft.zzh(null);
        }
        synchronized (this.zzj) {
            Iterator it = this.zze.values().iterator();
            while (it.hasNext()) {
                this.zzd.zzc((zzhir) ((zzhiq) it.next()).zzbr());
            }
            this.zzd.zza(this.zzf);
            this.zzd.zzb(this.zzg);
            if (zzcae.zzb()) {
                StringBuilder sb = new StringBuilder("Sending SB report\n  url: " + this.zzd.zzm() + "\n  clickUrl: " + this.zzd.zzl() + "\n  resources: \n");
                for (zzhir zzhirVar : this.zzd.zzn()) {
                    sb.append("    [");
                    sb.append(zzhirVar.zzc());
                    sb.append("] ");
                    sb.append(zzhirVar.zzg());
                }
                zzcae.zza(sb.toString());
            }
            ListenableFuture listenableFutureZzb = new com.google.android.gms.ads.internal.util.zzbq(this.zzh).zzb(1, this.zzi.zzb, null, ((zzhjh) this.zzd.zzbr()).zzaV());
            if (zzcae.zzb()) {
                listenableFutureZzb.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbzx
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzcae.zza("Pinged SB successfully.");
                    }
                }, zzcci.zza);
            }
            listenableFutureZzm = zzgft.zzm(listenableFutureZzb, new zzfxu() { // from class: com.google.android.gms.internal.ads.zzbzy
                @Override // com.google.android.gms.internal.ads.zzfxu
                public final Object apply(Object obj) {
                    int i2 = zzcaa.zzb;
                    return null;
                }
            }, zzcci.zzf);
        }
        return listenableFutureZzm;
    }

    @Override // com.google.android.gms.internal.ads.zzcaf
    public final void zzd(String str, Map map, int i) {
        zzhip zzhipVar;
        synchronized (this.zzj) {
            if (i == 3) {
                this.zzm = true;
            }
            if (this.zze.containsKey(str)) {
                if (i == 3 && (zzhipVar = zzhip.AD_RESOURCE_AUTO_CLICK_DESTINATION) != null) {
                    ((zzhiq) this.zze.get(str)).zzb(zzhipVar);
                }
                return;
            }
            zzhiq zzhiqVarZze = zzhir.zze();
            zzhip zzhipVarZzb = zzhip.zzb(i);
            if (zzhipVarZzb != null) {
                zzhiqVarZze.zzb(zzhipVarZzb);
            }
            zzhiqVarZze.zzc(this.zze.size());
            zzhiqVarZze.zze(str);
            zzhhe zzhheVarZzc = zzhhh.zzc();
            if (!this.zzk.isEmpty() && map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str2 = entry.getKey() != null ? (String) entry.getKey() : "";
                    String str3 = entry.getValue() != null ? (String) entry.getValue() : "";
                    if (this.zzk.contains(str2.toLowerCase(Locale.ENGLISH))) {
                        zzhhc zzhhcVarZzc = zzhhd.zzc();
                        zzhhcVarZzc.zza(zzhac.zzw(str2));
                        zzhhcVarZzc.zzb(zzhac.zzw(str3));
                        zzhheVarZzc.zza((zzhhd) zzhhcVarZzc.zzbr());
                    }
                }
            }
            zzhiqVarZze.zzd((zzhhh) zzhheVarZzc.zzbr());
            this.zze.put(str, zzhiqVarZze);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcaf
    public final void zze() {
        synchronized (this.zzj) {
            this.zze.keySet();
            ListenableFuture listenableFutureZzn = zzgft.zzn(zzgft.zzh(Collections.emptyMap()), new zzgfa() { // from class: com.google.android.gms.internal.ads.zzbzv
                @Override // com.google.android.gms.internal.ads.zzgfa
                public final ListenableFuture zza(Object obj) {
                    return this.zza.zzb((Map) obj);
                }
            }, zzcci.zzf);
            ListenableFuture listenableFutureZzo = zzgft.zzo(listenableFutureZzn, 10L, TimeUnit.SECONDS, zzcci.zzd);
            zzgft.zzr(listenableFutureZzn, new zzbzz(this, listenableFutureZzo), zzcci.zzf);
            zzc.add(listenableFutureZzo);
        }
    }

    final /* synthetic */ void zzf(Bitmap bitmap) {
        zzgzz zzgzzVarZzt = zzhac.zzt();
        bitmap.compress(Bitmap.CompressFormat.PNG, 0, zzgzzVarZzt);
        synchronized (this.zzj) {
            zzhgn zzhgnVar = this.zzd;
            zzhif zzhifVarZzc = zzhij.zzc();
            zzhifVarZzc.zza(zzgzzVarZzt.zzb());
            zzhifVarZzc.zzb("image/png");
            zzhifVarZzc.zzc(zzhii.TYPE_CREATIVE);
            zzhgnVar.zzi((zzhij) zzhifVarZzc.zzbr());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0036 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzcaf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzg(View view) {
        Bitmap bitmapCreateBitmap;
        boolean zIsDrawingCacheEnabled;
        if (this.zzi.zzc && !this.zzl) {
            com.google.android.gms.ads.internal.zzu.zzp();
            final Bitmap bitmap = null;
            if (view != null) {
                try {
                    zIsDrawingCacheEnabled = view.isDrawingCacheEnabled();
                    view.setDrawingCacheEnabled(true);
                    Bitmap drawingCache = view.getDrawingCache();
                    bitmapCreateBitmap = drawingCache != null ? Bitmap.createBitmap(drawingCache) : null;
                } catch (RuntimeException e) {
                    e = e;
                    bitmapCreateBitmap = null;
                }
                try {
                    view.setDrawingCacheEnabled(zIsDrawingCacheEnabled);
                } catch (RuntimeException e2) {
                    e = e2;
                    com.google.android.gms.ads.internal.util.client.zzm.zzh("Fail to capture the web view", e);
                    if (bitmapCreateBitmap != null) {
                    }
                    if (bitmap != null) {
                    }
                }
                if (bitmapCreateBitmap != null) {
                    try {
                        int width = view.getWidth();
                        int height = view.getHeight();
                        if (width == 0 || height == 0) {
                            com.google.android.gms.ads.internal.util.client.zzm.zzj("Width or height of view is zero");
                        } else {
                            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.RGB_565);
                            Canvas canvas = new Canvas(bitmapCreateBitmap2);
                            view.layout(0, 0, width, height);
                            view.draw(canvas);
                            bitmap = bitmapCreateBitmap2;
                        }
                    } catch (RuntimeException e3) {
                        com.google.android.gms.ads.internal.util.client.zzm.zzh("Fail to capture the webview", e3);
                    }
                } else {
                    bitmap = bitmapCreateBitmap;
                }
            }
            if (bitmap != null) {
                zzcae.zza("Failed to capture the webview bitmap.");
                return;
            }
            this.zzl = true;
            Runnable runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.zzbzw
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzf(bitmap);
                }
            };
            if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
                runnable.run();
            } else {
                zzcci.zza.execute(runnable);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcaf
    public final void zzh(String str) {
        synchronized (this.zzj) {
            if (str == null) {
                this.zzd.zzd();
            } else {
                this.zzd.zze(str);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcaf
    public final boolean zzi() {
        return PlatformVersion.isAtLeastKitKat() && this.zzi.zzc && !this.zzl;
    }
}
