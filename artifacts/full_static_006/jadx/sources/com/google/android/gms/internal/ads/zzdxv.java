package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzdxv {
    private final zzdxf zza;
    private final zzdsq zzb;
    private final Object zzc = new Object();
    private final List zzd = new ArrayList();
    private boolean zze;

    zzdxv(zzdxf zzdxfVar, zzdsq zzdsqVar) {
        this.zza = zzdxfVar;
        this.zzb = zzdsqVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzd(List list) {
        zzdsp zzdspVarZza;
        zzdsp zzdspVarZza2;
        zzbtt zzbttVar;
        synchronized (this.zzc) {
            if (this.zze) {
                return;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                zzbnn zzbnnVar = (zzbnn) it.next();
                String string = (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzjq)).booleanValue() || (zzdspVarZza2 = this.zzb.zza(zzbnnVar.zza)) == null || (zzbttVar = zzdspVarZza2.zzc) == null) ? "" : zzbttVar.toString();
                String str = string;
                boolean z = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzjr)).booleanValue() && (zzdspVarZza = this.zzb.zza(zzbnnVar.zza)) != null && zzdspVarZza.zzd;
                List list2 = this.zzd;
                String str2 = zzbnnVar.zza;
                list2.add(new zzdxu(str2, str, this.zzb.zzb(str2), zzbnnVar.zzb ? 1 : 0, zzbnnVar.zzd, zzbnnVar.zzc, z));
            }
            this.zze = true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f A[Catch: all -> 0x003f, LOOP:0: B:13:0x0029->B:15:0x002f, LOOP_END, TryCatch #0 {, blocks: (B:4:0x0008, B:6:0x000c, B:8:0x0014, B:9:0x001e, B:10:0x0021, B:12:0x0023, B:13:0x0029, B:15:0x002f, B:16:0x003d), top: B:21:0x0008 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final JSONArray zza() throws JSONException {
        Iterator it;
        JSONArray jSONArray = new JSONArray();
        synchronized (this.zzc) {
            if (this.zze) {
                it = this.zzd.iterator();
                while (it.hasNext()) {
                    jSONArray.put(((zzdxu) it.next()).zza());
                }
            } else if (this.zza.zzt()) {
                zzd(this.zza.zzg());
                it = this.zzd.iterator();
                while (it.hasNext()) {
                }
            } else {
                zzc();
            }
        }
        return jSONArray;
    }

    public final void zzc() {
        this.zza.zzs(new zzdxt(this));
    }
}
