package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.view.View;
import androidx.collection.SimpleArrayMap;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzdlt {
    private int zza;
    private com.google.android.gms.ads.internal.client.zzdq zzb;
    private zzbho zzc;
    private View zzd;
    private List zze;
    private com.google.android.gms.ads.internal.client.zzel zzg;
    private Bundle zzh;
    private zzchd zzi;
    private zzchd zzj;
    private zzchd zzk;
    private zzehg zzl;
    private ListenableFuture zzm;
    private zzccn zzn;
    private View zzo;
    private View zzp;
    private IObjectWrapper zzq;
    private double zzr;
    private zzbhv zzs;
    private zzbhv zzt;
    private String zzu;
    private float zzx;
    private String zzy;
    private final SimpleArrayMap zzv = new SimpleArrayMap();
    private final SimpleArrayMap zzw = new SimpleArrayMap();
    private List zzf = Collections.emptyList();

    public static zzdlt zzag(zzbrq zzbrqVar) {
        try {
            zzdls zzdlsVarZzak = zzak(zzbrqVar.zzg(), null);
            zzbho zzbhoVarZzh = zzbrqVar.zzh();
            View view = (View) zzam(zzbrqVar.zzj());
            String strZzo = zzbrqVar.zzo();
            List listZzr = zzbrqVar.zzr();
            String strZzm = zzbrqVar.zzm();
            Bundle bundleZzf = zzbrqVar.zzf();
            String strZzn = zzbrqVar.zzn();
            View view2 = (View) zzam(zzbrqVar.zzk());
            IObjectWrapper iObjectWrapperZzl = zzbrqVar.zzl();
            String strZzq = zzbrqVar.zzq();
            String strZzp = zzbrqVar.zzp();
            double dZze = zzbrqVar.zze();
            zzbhv zzbhvVarZzi = zzbrqVar.zzi();
            zzdlt zzdltVar = new zzdlt();
            zzdltVar.zza = 2;
            zzdltVar.zzb = zzdlsVarZzak;
            zzdltVar.zzc = zzbhoVarZzh;
            zzdltVar.zzd = view;
            zzdltVar.zzZ("headline", strZzo);
            zzdltVar.zze = listZzr;
            zzdltVar.zzZ("body", strZzm);
            zzdltVar.zzh = bundleZzf;
            zzdltVar.zzZ("call_to_action", strZzn);
            zzdltVar.zzo = view2;
            zzdltVar.zzq = iObjectWrapperZzl;
            zzdltVar.zzZ("store", strZzq);
            zzdltVar.zzZ("price", strZzp);
            zzdltVar.zzr = dZze;
            zzdltVar.zzs = zzbhvVarZzi;
            return zzdltVar;
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzk("Failed to get native ad from app install ad mapper", e);
            return null;
        }
    }

    public static zzdlt zzah(zzbrr zzbrrVar) {
        try {
            zzdls zzdlsVarZzak = zzak(zzbrrVar.zzf(), null);
            zzbho zzbhoVarZzg = zzbrrVar.zzg();
            View view = (View) zzam(zzbrrVar.zzi());
            String strZzo = zzbrrVar.zzo();
            List listZzp = zzbrrVar.zzp();
            String strZzm = zzbrrVar.zzm();
            Bundle bundleZze = zzbrrVar.zze();
            String strZzn = zzbrrVar.zzn();
            View view2 = (View) zzam(zzbrrVar.zzj());
            IObjectWrapper iObjectWrapperZzk = zzbrrVar.zzk();
            String strZzl = zzbrrVar.zzl();
            zzbhv zzbhvVarZzh = zzbrrVar.zzh();
            zzdlt zzdltVar = new zzdlt();
            zzdltVar.zza = 1;
            zzdltVar.zzb = zzdlsVarZzak;
            zzdltVar.zzc = zzbhoVarZzg;
            zzdltVar.zzd = view;
            zzdltVar.zzZ("headline", strZzo);
            zzdltVar.zze = listZzp;
            zzdltVar.zzZ("body", strZzm);
            zzdltVar.zzh = bundleZze;
            zzdltVar.zzZ("call_to_action", strZzn);
            zzdltVar.zzo = view2;
            zzdltVar.zzq = iObjectWrapperZzk;
            zzdltVar.zzZ("advertiser", strZzl);
            zzdltVar.zzt = zzbhvVarZzh;
            return zzdltVar;
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzk("Failed to get native ad from content ad mapper", e);
            return null;
        }
    }

    public static zzdlt zzai(zzbrq zzbrqVar) {
        try {
            return zzal(zzak(zzbrqVar.zzg(), null), zzbrqVar.zzh(), (View) zzam(zzbrqVar.zzj()), zzbrqVar.zzo(), zzbrqVar.zzr(), zzbrqVar.zzm(), zzbrqVar.zzf(), zzbrqVar.zzn(), (View) zzam(zzbrqVar.zzk()), zzbrqVar.zzl(), zzbrqVar.zzq(), zzbrqVar.zzp(), zzbrqVar.zze(), zzbrqVar.zzi(), null, 0.0f);
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzk("Failed to get native ad assets from app install ad mapper", e);
            return null;
        }
    }

    public static zzdlt zzaj(zzbrr zzbrrVar) {
        try {
            return zzal(zzak(zzbrrVar.zzf(), null), zzbrrVar.zzg(), (View) zzam(zzbrrVar.zzi()), zzbrrVar.zzo(), zzbrrVar.zzp(), zzbrrVar.zzm(), zzbrrVar.zze(), zzbrrVar.zzn(), (View) zzam(zzbrrVar.zzj()), zzbrrVar.zzk(), null, null, -1.0d, zzbrrVar.zzh(), zzbrrVar.zzl(), 0.0f);
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzk("Failed to get native ad assets from content ad mapper", e);
            return null;
        }
    }

    private static zzdls zzak(com.google.android.gms.ads.internal.client.zzdq zzdqVar, zzbru zzbruVar) {
        if (zzdqVar == null) {
            return null;
        }
        return new zzdls(zzdqVar, zzbruVar);
    }

    private static zzdlt zzal(com.google.android.gms.ads.internal.client.zzdq zzdqVar, zzbho zzbhoVar, View view, String str, List list, String str2, Bundle bundle, String str3, View view2, IObjectWrapper iObjectWrapper, String str4, String str5, double d, zzbhv zzbhvVar, String str6, float f) {
        zzdlt zzdltVar = new zzdlt();
        zzdltVar.zza = 6;
        zzdltVar.zzb = zzdqVar;
        zzdltVar.zzc = zzbhoVar;
        zzdltVar.zzd = view;
        zzdltVar.zzZ("headline", str);
        zzdltVar.zze = list;
        zzdltVar.zzZ("body", str2);
        zzdltVar.zzh = bundle;
        zzdltVar.zzZ("call_to_action", str3);
        zzdltVar.zzo = view2;
        zzdltVar.zzq = iObjectWrapper;
        zzdltVar.zzZ("store", str4);
        zzdltVar.zzZ("price", str5);
        zzdltVar.zzr = d;
        zzdltVar.zzs = zzbhvVar;
        zzdltVar.zzZ("advertiser", str6);
        zzdltVar.zzR(f);
        return zzdltVar;
    }

    private static Object zzam(IObjectWrapper iObjectWrapper) {
        if (iObjectWrapper == null) {
            return null;
        }
        return ObjectWrapper.unwrap(iObjectWrapper);
    }

    public static zzdlt zzt(zzbru zzbruVar) {
        try {
            return zzal(zzak(zzbruVar.zzj(), zzbruVar), zzbruVar.zzk(), (View) zzam(zzbruVar.zzm()), zzbruVar.zzs(), zzbruVar.zzv(), zzbruVar.zzq(), zzbruVar.zzi(), zzbruVar.zzr(), (View) zzam(zzbruVar.zzn()), zzbruVar.zzo(), zzbruVar.zzu(), zzbruVar.zzt(), zzbruVar.zze(), zzbruVar.zzl(), zzbruVar.zzp(), zzbruVar.zzf());
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzk("Failed to get native ad assets from unified ad mapper", e);
            return null;
        }
    }

    public final synchronized String zzA() {
        return this.zzu;
    }

    public final synchronized String zzB() {
        return zzF("headline");
    }

    public final synchronized String zzC() {
        return this.zzy;
    }

    public final synchronized String zzD() {
        return zzF("price");
    }

    public final synchronized String zzE() {
        return zzF("store");
    }

    public final synchronized String zzF(String str) {
        return (String) this.zzw.get(str);
    }

    public final synchronized List zzG() {
        return this.zze;
    }

    public final synchronized List zzH() {
        return this.zzf;
    }

    public final synchronized void zzI() {
        zzchd zzchdVar = this.zzi;
        if (zzchdVar != null) {
            zzchdVar.destroy();
            this.zzi = null;
        }
        zzchd zzchdVar2 = this.zzj;
        if (zzchdVar2 != null) {
            zzchdVar2.destroy();
            this.zzj = null;
        }
        zzchd zzchdVar3 = this.zzk;
        if (zzchdVar3 != null) {
            zzchdVar3.destroy();
            this.zzk = null;
        }
        ListenableFuture listenableFuture = this.zzm;
        if (listenableFuture != null) {
            listenableFuture.cancel(false);
            this.zzm = null;
        }
        zzccn zzccnVar = this.zzn;
        if (zzccnVar != null) {
            zzccnVar.cancel(false);
            this.zzn = null;
        }
        this.zzl = null;
        this.zzv.clear();
        this.zzw.clear();
        this.zzb = null;
        this.zzc = null;
        this.zzd = null;
        this.zze = null;
        this.zzh = null;
        this.zzo = null;
        this.zzp = null;
        this.zzq = null;
        this.zzs = null;
        this.zzt = null;
        this.zzu = null;
    }

    public final synchronized void zzJ(zzbho zzbhoVar) {
        this.zzc = zzbhoVar;
    }

    public final synchronized void zzK(String str) {
        this.zzu = str;
    }

    public final synchronized void zzL(com.google.android.gms.ads.internal.client.zzel zzelVar) {
        this.zzg = zzelVar;
    }

    public final synchronized void zzM(zzbhv zzbhvVar) {
        this.zzs = zzbhvVar;
    }

    public final synchronized void zzN(String str, zzbhi zzbhiVar) {
        if (zzbhiVar == null) {
            this.zzv.remove(str);
        } else {
            this.zzv.put(str, zzbhiVar);
        }
    }

    public final synchronized void zzO(zzchd zzchdVar) {
        this.zzj = zzchdVar;
    }

    public final synchronized void zzP(List list) {
        this.zze = list;
    }

    public final synchronized void zzQ(zzbhv zzbhvVar) {
        this.zzt = zzbhvVar;
    }

    public final synchronized void zzR(float f) {
        this.zzx = f;
    }

    public final synchronized void zzS(List list) {
        this.zzf = list;
    }

    public final synchronized void zzT(zzchd zzchdVar) {
        this.zzk = zzchdVar;
    }

    public final synchronized void zzU(ListenableFuture listenableFuture) {
        this.zzm = listenableFuture;
    }

    public final synchronized void zzV(String str) {
        this.zzy = str;
    }

    public final synchronized void zzW(zzehg zzehgVar) {
        this.zzl = zzehgVar;
    }

    public final synchronized void zzX(zzccn zzccnVar) {
        this.zzn = zzccnVar;
    }

    public final synchronized void zzY(double d) {
        this.zzr = d;
    }

    public final synchronized void zzZ(String str, String str2) {
        if (str2 == null) {
            this.zzw.remove(str);
        } else {
            this.zzw.put(str, str2);
        }
    }

    public final synchronized double zza() {
        return this.zzr;
    }

    public final synchronized void zzaa(int i) {
        this.zza = i;
    }

    public final synchronized void zzab(com.google.android.gms.ads.internal.client.zzdq zzdqVar) {
        this.zzb = zzdqVar;
    }

    public final synchronized void zzac(View view) {
        this.zzo = view;
    }

    public final synchronized void zzad(zzchd zzchdVar) {
        this.zzi = zzchdVar;
    }

    public final synchronized void zzae(View view) {
        this.zzp = view;
    }

    public final synchronized boolean zzaf() {
        return this.zzj != null;
    }

    public final synchronized float zzb() {
        return this.zzx;
    }

    public final synchronized int zzc() {
        return this.zza;
    }

    public final synchronized Bundle zzd() {
        if (this.zzh == null) {
            this.zzh = new Bundle();
        }
        return this.zzh;
    }

    public final synchronized View zze() {
        return this.zzd;
    }

    public final synchronized View zzf() {
        return this.zzo;
    }

    public final synchronized View zzg() {
        return this.zzp;
    }

    public final synchronized SimpleArrayMap zzh() {
        return this.zzv;
    }

    public final synchronized SimpleArrayMap zzi() {
        return this.zzw;
    }

    public final synchronized com.google.android.gms.ads.internal.client.zzdq zzj() {
        return this.zzb;
    }

    public final synchronized com.google.android.gms.ads.internal.client.zzel zzk() {
        return this.zzg;
    }

    public final synchronized zzbho zzl() {
        return this.zzc;
    }

    public final zzbhv zzm() {
        List list = this.zze;
        if (list == null || list.isEmpty()) {
            return null;
        }
        Object obj = this.zze.get(0);
        if (obj instanceof IBinder) {
            return zzbhu.zzg((IBinder) obj);
        }
        return null;
    }

    public final synchronized zzbhv zzn() {
        return this.zzs;
    }

    public final synchronized zzbhv zzo() {
        return this.zzt;
    }

    public final synchronized zzccn zzp() {
        return this.zzn;
    }

    public final synchronized zzchd zzq() {
        return this.zzj;
    }

    public final synchronized zzchd zzr() {
        return this.zzk;
    }

    public final synchronized zzchd zzs() {
        return this.zzi;
    }

    public final synchronized zzehg zzu() {
        return this.zzl;
    }

    public final synchronized IObjectWrapper zzv() {
        return this.zzq;
    }

    public final synchronized ListenableFuture zzw() {
        return this.zzm;
    }

    public final synchronized String zzx() {
        return zzF("advertiser");
    }

    public final synchronized String zzy() {
        return zzF("body");
    }

    public final synchronized String zzz() {
        return zzF("call_to_action");
    }
}
