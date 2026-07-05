package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import androidx.collection.ArrayMap;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.common.util.concurrent.ListenableFuture;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzdlo extends zzcup {
    public static final zzgbc zzc = zzgbc.zzr("3010", "3008", "1005", "1009", "2011", "2007");
    private final zzbap zzA;
    private final Executor zzd;
    private final zzdlt zze;
    private final zzdmb zzf;
    private final zzdmt zzg;
    private final zzdly zzh;
    private final zzdme zzi;
    private final zzhkj zzj;
    private final zzhkj zzk;
    private final zzhkj zzl;
    private final zzhkj zzm;
    private final zzhkj zzn;
    private zzdnp zzo;
    private boolean zzp;
    private boolean zzq;
    private boolean zzr;
    private final zzcaq zzs;
    private final zzaxd zzt;
    private final VersionInfoParcel zzu;
    private final Context zzv;
    private final zzdlq zzw;
    private final zzepf zzx;
    private final Map zzy;
    private final List zzz;

    public zzdlo(zzcuo zzcuoVar, Executor executor, zzdlt zzdltVar, zzdmb zzdmbVar, zzdmt zzdmtVar, zzdly zzdlyVar, zzdme zzdmeVar, zzhkj zzhkjVar, zzhkj zzhkjVar2, zzhkj zzhkjVar3, zzhkj zzhkjVar4, zzhkj zzhkjVar5, zzcaq zzcaqVar, zzaxd zzaxdVar, VersionInfoParcel versionInfoParcel, Context context, zzdlq zzdlqVar, zzepf zzepfVar, zzbap zzbapVar) {
        super(zzcuoVar);
        this.zzd = executor;
        this.zze = zzdltVar;
        this.zzf = zzdmbVar;
        this.zzg = zzdmtVar;
        this.zzh = zzdlyVar;
        this.zzi = zzdmeVar;
        this.zzj = zzhkjVar;
        this.zzk = zzhkjVar2;
        this.zzl = zzhkjVar3;
        this.zzm = zzhkjVar4;
        this.zzn = zzhkjVar5;
        this.zzs = zzcaqVar;
        this.zzt = zzaxdVar;
        this.zzu = versionInfoParcel;
        this.zzv = context;
        this.zzw = zzdlqVar;
        this.zzx = zzepfVar;
        this.zzy = new HashMap();
        this.zzz = new ArrayList();
        this.zzA = zzbapVar;
    }

    public static boolean zzX(View view) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzkE)).booleanValue()) {
            return view.isShown() && view.getGlobalVisibleRect(new Rect(), null);
        }
        com.google.android.gms.ads.internal.zzu.zzp();
        long jZzw = com.google.android.gms.ads.internal.util.zzt.zzw(view);
        if (view.isShown() && view.getGlobalVisibleRect(new Rect(), null)) {
            if (jZzw >= ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzkF)).intValue()) {
                return true;
            }
        }
        return false;
    }

    private final synchronized ImageView.ScaleType zzZ() {
        zzdnp zzdnpVar = this.zzo;
        if (zzdnpVar == null) {
            com.google.android.gms.ads.internal.util.client.zzm.zze("Ad should be associated with an ad view before calling getMediaviewScaleType()");
            return null;
        }
        IObjectWrapper iObjectWrapperZzj = zzdnpVar.zzj();
        if (iObjectWrapperZzj != null) {
            return (ImageView.ScaleType) ObjectWrapper.unwrap(iObjectWrapperZzj);
        }
        return zzdmt.zza;
    }

    private final void zzaa(String str, boolean z) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzfi)).booleanValue()) {
            zzf("Google", true);
            return;
        }
        ListenableFuture listenableFutureZzw = this.zze.zzw();
        if (listenableFutureZzw == null) {
            return;
        }
        zzgft.zzr(listenableFutureZzw, new zzdlm(this, "Google", true), this.zzd);
    }

    private final synchronized void zzab(View view, Map map, Map map2) {
        this.zzg.zzd(this.zzo);
        this.zzf.zzq(view, map, map2, zzZ());
        this.zzq = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzac(View view, zzehg zzehgVar) {
        zzchd zzchdVarZzr = this.zze.zzr();
        if (!this.zzh.zzd() || zzehgVar == null || zzchdVarZzr == null || view == null) {
            return;
        }
        com.google.android.gms.ads.internal.zzu.zzA().zzj(zzehgVar.zza(), view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzad, reason: merged with bridge method [inline-methods] */
    public final synchronized void zzz(zzdnp zzdnpVar) {
        Iterator<String> itKeys;
        View view;
        zzawz zzawzVarZzc;
        if (!this.zzp) {
            this.zzo = zzdnpVar;
            this.zzg.zze(zzdnpVar);
            this.zzf.zzy(zzdnpVar.zzf(), zzdnpVar.zzm(), zzdnpVar.zzn(), zzdnpVar, zzdnpVar);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzcD)).booleanValue() && (zzawzVarZzc = this.zzt.zzc()) != null) {
                zzawzVarZzc.zzo(zzdnpVar.zzf());
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzbL)).booleanValue()) {
                zzfgt zzfgtVar = this.zzb;
                if (zzfgtVar.zzal && (itKeys = zzfgtVar.zzak.keys()) != null) {
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        WeakReference weakReference = (WeakReference) this.zzo.zzl().get(next);
                        this.zzy.put(next, false);
                        if (weakReference != null && (view = (View) weakReference.get()) != null) {
                            zzbao zzbaoVar = new zzbao(this.zzv, view);
                            this.zzz.add(zzbaoVar);
                            zzbaoVar.zzc(new zzdll(this, next));
                        }
                    }
                }
            }
            if (zzdnpVar.zzi() != null) {
                zzdnpVar.zzi().zzc(this.zzs);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzae, reason: merged with bridge method [inline-methods] */
    public final void zzA(zzdnp zzdnpVar) {
        this.zzf.zzz(zzdnpVar.zzf(), zzdnpVar.zzl());
        if (zzdnpVar.zzh() != null) {
            zzdnpVar.zzh().setClickable(false);
            zzdnpVar.zzh().removeAllViews();
        }
        if (zzdnpVar.zzi() != null) {
            zzdnpVar.zzi().zze(this.zzs);
        }
        this.zzo = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0046 A[Catch: all -> 0x008e, TryCatch #0 {, blocks: (B:3:0x0001, B:6:0x0007, B:8:0x0019, B:10:0x001f, B:11:0x0029, B:13:0x002f, B:17:0x0046, B:20:0x005a, B:21:0x0062, B:23:0x0068, B:25:0x007c, B:27:0x0082, B:32:0x0089), top: B:38:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0089 A[Catch: all -> 0x008e, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:6:0x0007, B:8:0x0019, B:10:0x001f, B:11:0x0029, B:13:0x002f, B:17:0x0046, B:20:0x005a, B:21:0x0062, B:23:0x0068, B:25:0x007c, B:27:0x0082, B:32:0x0089), top: B:38:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void zzB(View view, Map map, Map map2, boolean z) {
        if (!this.zzq) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzbL)).booleanValue() && this.zzb.zzal) {
                Iterator it = this.zzy.keySet().iterator();
                while (it.hasNext()) {
                    if (!((Boolean) this.zzy.get((String) it.next())).booleanValue()) {
                        break;
                    }
                }
                if (!z) {
                }
            } else {
                if (!z) {
                    zzab(view, map, map2);
                    return;
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzdS)).booleanValue() && map != null) {
                    Iterator it2 = map.entrySet().iterator();
                    while (it2.hasNext()) {
                        View view2 = (View) ((WeakReference) ((Map.Entry) it2.next()).getValue()).get();
                        if (view2 != null && zzX(view2)) {
                            zzab(view, map, map2);
                            return;
                        }
                    }
                }
            }
        }
    }

    public final synchronized void zzC(com.google.android.gms.ads.internal.client.zzcw zzcwVar) {
        this.zzf.zzj(zzcwVar);
    }

    public final synchronized void zzD(View view, View view2, Map map, Map map2, boolean z) {
        this.zzg.zzc(this.zzo);
        this.zzf.zzk(view, view2, map, map2, z, zzZ());
        if (this.zzr) {
            zzdlt zzdltVar = this.zze;
            if (zzdltVar.zzs() != null) {
                zzdltVar.zzs().zzd("onSdkAdUserInteractionClick", new ArrayMap());
            }
        }
    }

    public final synchronized void zzE(final View view, final int i) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzlA)).booleanValue()) {
            zzdnp zzdnpVar = this.zzo;
            if (zzdnpVar == null) {
                com.google.android.gms.ads.internal.util.client.zzm.zze("Ad should be associated with an ad view before calling performClickForCustomGesture()");
            } else {
                final boolean z = zzdnpVar instanceof zzdmn;
                this.zzd.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdli
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.zza.zzx(view, z, i);
                    }
                });
            }
        }
    }

    public final synchronized void zzF(String str) {
        this.zzf.zzl(str);
    }

    public final synchronized void zzG(Bundle bundle) {
        this.zzf.zzm(bundle);
    }

    public final synchronized void zzH() {
        zzdnp zzdnpVar = this.zzo;
        if (zzdnpVar == null) {
            com.google.android.gms.ads.internal.util.client.zzm.zze("Ad should be associated with an ad view before calling recordCustomClickGesture()");
        } else {
            final boolean z = zzdnpVar instanceof zzdmn;
            this.zzd.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdlk
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzy(z);
                }
            });
        }
    }

    public final synchronized void zzI() {
        if (this.zzq) {
            return;
        }
        this.zzf.zzr();
    }

    public final void zzJ(View view) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzfi)).booleanValue()) {
            zzac(view, this.zze.zzu());
            return;
        }
        zzccn zzccnVarZzp = this.zze.zzp();
        if (zzccnVarZzp == null) {
            return;
        }
        zzgft.zzr(zzccnVarZzp, new zzdln(this, view), this.zzd);
    }

    public final synchronized void zzK(View view, MotionEvent motionEvent, View view2) {
        this.zzf.zzs(view, motionEvent, view2);
    }

    public final synchronized void zzL(Bundle bundle) {
        this.zzf.zzt(bundle);
    }

    public final synchronized void zzM(View view) {
        this.zzf.zzu(view);
    }

    public final synchronized void zzN() {
        this.zzf.zzv();
    }

    public final synchronized void zzO(com.google.android.gms.ads.internal.client.zzcs zzcsVar) {
        this.zzf.zzw(zzcsVar);
    }

    public final synchronized void zzP(com.google.android.gms.ads.internal.client.zzdg zzdgVar) {
        this.zzx.zza(zzdgVar);
    }

    public final synchronized void zzQ(zzbjp zzbjpVar) {
        this.zzf.zzx(zzbjpVar);
    }

    public final synchronized void zzR(final zzdnp zzdnpVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzbJ)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zzt.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdle
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzz(zzdnpVar);
                }
            });
        } else {
            zzz(zzdnpVar);
        }
    }

    public final synchronized void zzS(final zzdnp zzdnpVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzbJ)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zzt.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdlf
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzA(zzdnpVar);
                }
            });
        } else {
            zzA(zzdnpVar);
        }
    }

    public final boolean zzT() {
        return this.zzh.zze();
    }

    public final synchronized boolean zzU() {
        return this.zzf.zzA();
    }

    public final synchronized boolean zzV() {
        return this.zzf.zzB();
    }

    public final boolean zzW() {
        return this.zzh.zzd();
    }

    public final synchronized boolean zzY(Bundle bundle) {
        if (this.zzq) {
            return true;
        }
        boolean zZzC = this.zzf.zzC(bundle);
        this.zzq = zZzC;
        return zZzC;
    }

    public final synchronized int zza() {
        return this.zzf.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzcup
    public final synchronized void zzb() {
        this.zzp = true;
        this.zzd.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdlj
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzw();
            }
        });
        super.zzb();
    }

    public final zzdlq zzc() {
        return this.zzw;
    }

    public final zzehg zzf(String str, boolean z) {
        String str2;
        zzehd zzehdVar;
        zzehc zzehcVar;
        if (!this.zzh.zzd() || TextUtils.isEmpty(str)) {
            return null;
        }
        zzdlt zzdltVar = this.zze;
        zzchd zzchdVarZzr = zzdltVar.zzr();
        zzchd zzchdVarZzs = zzdltVar.zzs();
        if (zzchdVarZzr == null && zzchdVarZzs == null) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Omid display and video webview are null. Skipping initialization.");
            return null;
        }
        boolean z2 = false;
        boolean z3 = zzchdVarZzr != null;
        boolean z4 = zzchdVarZzs != null;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzfg)).booleanValue()) {
            this.zzh.zza();
            int iZzc = this.zzh.zza().zzc();
            int i = iZzc - 1;
            if (i != 0) {
                if (i != 1) {
                    com.google.android.gms.ads.internal.util.client.zzm.zzj("Unknown omid media type: " + (iZzc != 1 ? iZzc != 2 ? "UNKNOWN" : "DISPLAY" : "VIDEO") + ". Not initializing Omid.");
                    return null;
                }
                if (zzchdVarZzr == null) {
                    com.google.android.gms.ads.internal.util.client.zzm.zzj("Omid media type was display but there was no display webview.");
                    return null;
                }
                z4 = false;
                z2 = true;
            } else {
                if (zzchdVarZzs == null) {
                    com.google.android.gms.ads.internal.util.client.zzm.zzj("Omid media type was video but there was no video webview.");
                    return null;
                }
                z4 = true;
            }
        } else {
            z2 = z3;
        }
        if (z2) {
            str2 = null;
        } else {
            str2 = "javascript";
            zzchdVarZzr = zzchdVarZzs;
        }
        zzchdVarZzr.zzG();
        if (!com.google.android.gms.ads.internal.zzu.zzA().zzl(this.zzv)) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Failed to initialize omid in InternalNativeAd");
            return null;
        }
        VersionInfoParcel versionInfoParcel = this.zzu;
        String str3 = versionInfoParcel.buddyApkVersion + "." + versionInfoParcel.clientJarVersion;
        if (z4) {
            zzehcVar = zzehc.VIDEO;
            zzehdVar = zzehd.DEFINED_BY_JAVASCRIPT;
        } else {
            zzdlt zzdltVar2 = this.zze;
            zzehc zzehcVar2 = zzehc.NATIVE_DISPLAY;
            zzehdVar = zzdltVar2.zzc() == 3 ? zzehd.UNSPECIFIED : zzehd.ONE_PIXEL;
            zzehcVar = zzehcVar2;
        }
        zzehg zzehgVarZzb = com.google.android.gms.ads.internal.zzu.zzA().zzb(str3, zzchdVarZzr.zzG(), "", "javascript", str2, str, zzehdVar, zzehcVar, this.zzb.zzam);
        if (zzehgVarZzb == null) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Failed to create omid session in InternalNativeAd");
            return null;
        }
        this.zze.zzW(zzehgVarZzb);
        zzchdVarZzr.zzat(zzehgVarZzb);
        if (z4) {
            com.google.android.gms.ads.internal.zzu.zzA().zzj(zzehgVarZzb.zza(), zzchdVarZzs.zzF());
            this.zzr = true;
        }
        if (z) {
            com.google.android.gms.ads.internal.zzu.zzA().zzk(zzehgVarZzb.zza());
            zzchdVarZzr.zzd("onSdkLoaded", new ArrayMap());
        }
        return zzehgVarZzb;
    }

    public final String zzg() {
        return this.zzh.zzb();
    }

    public final synchronized JSONObject zzi(View view, Map map, Map map2) {
        return this.zzf.zze(view, map, map2, zzZ());
    }

    @Override // com.google.android.gms.internal.ads.zzcup
    public final void zzj() {
        this.zzd.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdlg
            @Override // java.lang.Runnable
            public final void run() {
                zzdlo.zzs(this.zza);
            }
        });
        if (this.zze.zzc() != 7) {
            Executor executor = this.zzd;
            final zzdmb zzdmbVar = this.zzf;
            Objects.requireNonNull(zzdmbVar);
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdlh
                @Override // java.lang.Runnable
                public final void run() {
                    zzdmbVar.zzp();
                }
            });
        }
        super.zzj();
    }

    public final synchronized JSONObject zzk(View view, Map map, Map map2) {
        return this.zzf.zzf(view, map, map2, zzZ());
    }

    public final void zzu(View view) {
        zzehg zzehgVarZzu = this.zze.zzu();
        if (!this.zzh.zzd() || zzehgVarZzu == null || view == null) {
            return;
        }
        com.google.android.gms.ads.internal.zzu.zzA().zzg(zzehgVarZzu.zza(), view);
    }

    public final synchronized void zzv() {
        this.zzf.zzh();
    }

    final /* synthetic */ void zzw() {
        this.zzf.zzi();
        this.zze.zzI();
    }

    final /* synthetic */ void zzx(View view, boolean z, int i) {
        this.zzf.zzo(view, this.zzo.zzf(), this.zzo.zzl(), this.zzo.zzm(), z, zzZ(), i);
    }

    final /* synthetic */ void zzy(boolean z) {
        this.zzf.zzo(null, this.zzo.zzf(), this.zzo.zzl(), this.zzo.zzm(), z, zzZ(), 0);
    }

    public static /* synthetic */ void zzs(zzdlo zzdloVar) {
        try {
            zzdlt zzdltVar = zzdloVar.zze;
            int iZzc = zzdltVar.zzc();
            if (iZzc == 1) {
                if (zzdloVar.zzi.zzb() != null) {
                    zzdloVar.zzaa("Google", true);
                    zzdloVar.zzi.zzb().zze((zzbim) zzdloVar.zzj.zzb());
                    return;
                }
                return;
            }
            if (iZzc == 2) {
                if (zzdloVar.zzi.zza() != null) {
                    zzdloVar.zzaa("Google", true);
                    zzdloVar.zzi.zza().zze((zzbik) zzdloVar.zzk.zzb());
                    return;
                }
                return;
            }
            if (iZzc == 3) {
                if (zzdloVar.zzi.zzd(zzdltVar.zzA()) != null) {
                    if (zzdloVar.zze.zzs() != null) {
                        zzdloVar.zzf("Google", true);
                    }
                    zzdloVar.zzi.zzd(zzdloVar.zze.zzA()).zze((zzbip) zzdloVar.zzn.zzb());
                    return;
                }
                return;
            }
            if (iZzc == 6) {
                if (zzdloVar.zzi.zzf() != null) {
                    zzdloVar.zzaa("Google", true);
                    zzdloVar.zzi.zzf().zze((zzbjs) zzdloVar.zzl.zzb());
                    return;
                }
                return;
            }
            if (iZzc != 7) {
                com.google.android.gms.ads.internal.util.client.zzm.zzg("Wrong native template id!");
                return;
            }
            zzdme zzdmeVar = zzdloVar.zzi;
            if (zzdmeVar.zzg() != null) {
                zzdmeVar.zzg().zzg((zzboc) zzdloVar.zzm.zzb());
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("RemoteException when notifyAdLoad is called", e);
        }
    }
}
