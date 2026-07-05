package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes2.dex */
public final class zzdnu implements zzdmb {
    private final zzbru zza;
    private final zzdad zzb;
    private final zzczj zzc;
    private final zzdhg zzd;
    private final Context zze;
    private final zzfgt zzf;
    private final VersionInfoParcel zzg;
    private final zzfho zzh;
    private boolean zzi = false;
    private boolean zzj = false;
    private boolean zzk = true;
    private final zzbrq zzl;
    private final zzbrr zzm;

    public zzdnu(zzbrq zzbrqVar, zzbrr zzbrrVar, zzbru zzbruVar, zzdad zzdadVar, zzczj zzczjVar, zzdhg zzdhgVar, Context context, zzfgt zzfgtVar, VersionInfoParcel versionInfoParcel, zzfho zzfhoVar) {
        this.zzl = zzbrqVar;
        this.zzm = zzbrrVar;
        this.zza = zzbruVar;
        this.zzb = zzdadVar;
        this.zzc = zzczjVar;
        this.zzd = zzdhgVar;
        this.zze = context;
        this.zzf = zzfgtVar;
        this.zzg = versionInfoParcel;
        this.zzh = zzfhoVar;
    }

    private final void zzb(View view) {
        try {
            zzbru zzbruVar = this.zza;
            if (zzbruVar != null && !zzbruVar.zzA()) {
                this.zza.zzw(ObjectWrapper.wrap(view));
                this.zzc.onAdClicked();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzkM)).booleanValue()) {
                    this.zzd.zzdG();
                    return;
                }
                return;
            }
            zzbrq zzbrqVar = this.zzl;
            if (zzbrqVar != null && !zzbrqVar.zzx()) {
                this.zzl.zzs(ObjectWrapper.wrap(view));
                this.zzc.onAdClicked();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzkM)).booleanValue()) {
                    this.zzd.zzdG();
                    return;
                }
                return;
            }
            zzbrr zzbrrVar = this.zzm;
            if (zzbrrVar == null || zzbrrVar.zzv()) {
                return;
            }
            this.zzm.zzq(ObjectWrapper.wrap(view));
            this.zzc.onAdClicked();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzkM)).booleanValue()) {
                this.zzd.zzdG();
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzk("Failed to call handleClick", e);
        }
    }

    private static final HashMap zzc(Map map) {
        HashMap map2 = new HashMap();
        if (map != null) {
            synchronized (map) {
                for (Map.Entry entry : map.entrySet()) {
                    View view = (View) ((WeakReference) entry.getValue()).get();
                    if (view != null) {
                        map2.put((String) entry.getKey(), view);
                    }
                }
            }
        }
        return map2;
    }

    @Override // com.google.android.gms.internal.ads.zzdmb
    public final boolean zzA() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzdmb
    public final boolean zzB() {
        return this.zzf.zzM;
    }

    @Override // com.google.android.gms.internal.ads.zzdmb
    public final boolean zzC(Bundle bundle) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzdmb
    public final int zza() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzdmb
    public final JSONObject zze(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzdmb
    public final JSONObject zzf(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzdmb
    public final void zzg() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzdmb
    public final void zzh() {
    }

    @Override // com.google.android.gms.internal.ads.zzdmb
    public final void zzi() {
    }

    @Override // com.google.android.gms.internal.ads.zzdmb
    public final void zzj(com.google.android.gms.ads.internal.client.zzcw zzcwVar) {
        com.google.android.gms.ads.internal.util.client.zzm.zzj("Mute This Ad is not supported for 3rd party ads");
    }

    @Override // com.google.android.gms.internal.ads.zzdmb
    public final void zzk(View view, View view2, Map map, Map map2, boolean z, ImageView.ScaleType scaleType) {
        if (this.zzj && this.zzf.zzM) {
            return;
        }
        zzb(view);
    }

    @Override // com.google.android.gms.internal.ads.zzdmb
    public final void zzl(String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzdmb
    public final void zzm(Bundle bundle) {
    }

    @Override // com.google.android.gms.internal.ads.zzdmb
    public final void zzo(View view, View view2, Map map, Map map2, boolean z, ImageView.ScaleType scaleType, int i) {
        if (!this.zzj) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Custom click reporting for 3p ads failed. enableCustomClickGesture is not set.");
        } else if (this.zzf.zzM) {
            zzb(view2);
        } else {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Custom click reporting for 3p ads failed. Ad unit id not in allow list.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdmb
    public final void zzp() {
    }

    @Override // com.google.android.gms.internal.ads.zzdmb
    public final void zzq(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        try {
            if (!this.zzi) {
                this.zzi = com.google.android.gms.ads.internal.zzu.zzs().zzn(this.zze, this.zzg.afmaVersion, this.zzf.zzD.toString(), this.zzh.zzf);
            }
            if (this.zzk) {
                zzbru zzbruVar = this.zza;
                if (zzbruVar != null && !zzbruVar.zzB()) {
                    this.zza.zzx();
                    this.zzb.zza();
                    return;
                }
                zzbrq zzbrqVar = this.zzl;
                if (zzbrqVar != null && !zzbrqVar.zzy()) {
                    this.zzl.zzt();
                    this.zzb.zza();
                    return;
                }
                zzbrr zzbrrVar = this.zzm;
                if (zzbrrVar == null || zzbrrVar.zzw()) {
                    return;
                }
                this.zzm.zzr();
                this.zzb.zza();
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzk("Failed to call recordImpression", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdmb
    public final void zzr() {
    }

    @Override // com.google.android.gms.internal.ads.zzdmb
    public final void zzs(View view, MotionEvent motionEvent, View view2) {
    }

    @Override // com.google.android.gms.internal.ads.zzdmb
    public final void zzt(Bundle bundle) {
    }

    @Override // com.google.android.gms.internal.ads.zzdmb
    public final void zzu(View view) {
    }

    @Override // com.google.android.gms.internal.ads.zzdmb
    public final void zzv() {
        this.zzj = true;
    }

    @Override // com.google.android.gms.internal.ads.zzdmb
    public final void zzw(com.google.android.gms.ads.internal.client.zzcs zzcsVar) {
        com.google.android.gms.ads.internal.util.client.zzm.zzj("Mute This Ad is not supported for 3rd party ads");
    }

    @Override // com.google.android.gms.internal.ads.zzdmb
    public final void zzx(zzbjp zzbjpVar) {
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00cc A[Catch: JSONException -> 0x0044, RemoteException -> 0x0122, TRY_LEAVE, TryCatch #0 {JSONException -> 0x0044, blocks: (B:47:0x00b1, B:48:0x00c6, B:50:0x00cc), top: B:72:0x00b1 }] */
    @Override // com.google.android.gms.internal.ads.zzdmb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzy(View view, Map map, Map map2, View.OnTouchListener onTouchListener, View.OnClickListener onClickListener) {
        Object obj;
        Iterator it;
        IObjectWrapper iObjectWrapperZzn;
        try {
            IObjectWrapper iObjectWrapperWrap = ObjectWrapper.wrap(view);
            JSONObject jSONObject = this.zzf.zzak;
            boolean z = true;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzby)).booleanValue() && jSONObject.length() != 0) {
                Map map3 = map == null ? new HashMap() : map;
                Map map4 = map2 == null ? new HashMap() : map2;
                HashMap map5 = new HashMap();
                map5.putAll(map3);
                map5.putAll(map4);
                Iterator<String> itKeys = jSONObject.keys();
                loop0: while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(next);
                    if (jSONArrayOptJSONArray != null) {
                        WeakReference weakReference = (WeakReference) map5.get(next);
                        if (weakReference != null && (obj = weakReference.get()) != null) {
                            Class<?> cls = obj.getClass();
                            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzbz)).booleanValue() && next.equals("3010")) {
                                zzbru zzbruVar = this.zza;
                                Object objUnwrap = null;
                                if (zzbruVar != null) {
                                    try {
                                        iObjectWrapperZzn = zzbruVar.zzn();
                                    } catch (RemoteException | IllegalArgumentException unused) {
                                    }
                                } else {
                                    zzbrq zzbrqVar = this.zzl;
                                    if (zzbrqVar != null) {
                                        iObjectWrapperZzn = zzbrqVar.zzk();
                                    } else {
                                        zzbrr zzbrrVar = this.zzm;
                                        iObjectWrapperZzn = zzbrrVar != null ? zzbrrVar.zzj() : null;
                                    }
                                }
                                if (iObjectWrapperZzn != null) {
                                    objUnwrap = ObjectWrapper.unwrap(iObjectWrapperZzn);
                                }
                                if (objUnwrap != null) {
                                    cls = objUnwrap.getClass();
                                    ArrayList arrayList = new ArrayList();
                                    com.google.android.gms.ads.internal.util.zzbw.zzc(jSONArrayOptJSONArray, arrayList);
                                    com.google.android.gms.ads.internal.zzu.zzp();
                                    ClassLoader classLoader = this.zze.getClassLoader();
                                    it = arrayList.iterator();
                                    while (it.hasNext()) {
                                    }
                                }
                            } else {
                                try {
                                    ArrayList arrayList2 = new ArrayList();
                                    com.google.android.gms.ads.internal.util.zzbw.zzc(jSONArrayOptJSONArray, arrayList2);
                                    com.google.android.gms.ads.internal.zzu.zzp();
                                    ClassLoader classLoader2 = this.zze.getClassLoader();
                                    it = arrayList2.iterator();
                                    while (it.hasNext()) {
                                        if (Class.forName((String) it.next(), false, classLoader2).isAssignableFrom(cls)) {
                                            break;
                                        }
                                    }
                                } catch (JSONException unused2) {
                                    continue;
                                }
                            }
                        }
                        z = false;
                        break;
                    }
                }
            }
            this.zzk = z;
            HashMap mapZzc = zzc(map);
            HashMap mapZzc2 = zzc(map2);
            zzbru zzbruVar2 = this.zza;
            if (zzbruVar2 != null) {
                zzbruVar2.zzy(iObjectWrapperWrap, ObjectWrapper.wrap(mapZzc), ObjectWrapper.wrap(mapZzc2));
                return;
            }
            zzbrq zzbrqVar2 = this.zzl;
            if (zzbrqVar2 != null) {
                zzbrqVar2.zzv(iObjectWrapperWrap, ObjectWrapper.wrap(mapZzc), ObjectWrapper.wrap(mapZzc2));
                this.zzl.zzu(iObjectWrapperWrap);
                return;
            }
            zzbrr zzbrrVar2 = this.zzm;
            if (zzbrrVar2 != null) {
                zzbrrVar2.zzt(iObjectWrapperWrap, ObjectWrapper.wrap(mapZzc), ObjectWrapper.wrap(mapZzc2));
                this.zzm.zzs(iObjectWrapperWrap);
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzk("Failed to call trackView", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdmb
    public final void zzz(View view, Map map) {
        try {
            IObjectWrapper iObjectWrapperWrap = ObjectWrapper.wrap(view);
            zzbru zzbruVar = this.zza;
            if (zzbruVar != null) {
                zzbruVar.zzz(iObjectWrapperWrap);
                return;
            }
            zzbrq zzbrqVar = this.zzl;
            if (zzbrqVar != null) {
                zzbrqVar.zzw(iObjectWrapperWrap);
                return;
            }
            zzbrr zzbrrVar = this.zzm;
            if (zzbrrVar != null) {
                zzbrrVar.zzu(iObjectWrapperWrap);
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzk("Failed to call untrackView", e);
        }
    }
}
