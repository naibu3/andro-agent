package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.UUID;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzbqt implements zzgfa {
    private final zzbpz zza;
    private final zzbqa zzb;
    private final String zzc = "google.afma.activeView.handleUpdate";
    private final ListenableFuture zzd;

    zzbqt(ListenableFuture listenableFuture, String str, zzbqa zzbqaVar, zzbpz zzbpzVar) {
        this.zzd = listenableFuture;
        this.zzb = zzbqaVar;
        this.zza = zzbpzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgfa
    public final ListenableFuture zza(Object obj) throws Exception {
        return zzb(obj);
    }

    public final ListenableFuture zzb(final Object obj) {
        return zzgft.zzn(this.zzd, new zzgfa() { // from class: com.google.android.gms.internal.ads.zzbqr
            @Override // com.google.android.gms.internal.ads.zzgfa
            public final ListenableFuture zza(Object obj2) {
                return this.zza.zzc(obj, (zzbpu) obj2);
            }
        }, zzcci.zzf);
    }

    final /* synthetic */ ListenableFuture zzc(Object obj, zzbpu zzbpuVar) throws Exception {
        zzccn zzccnVar = new zzccn();
        com.google.android.gms.ads.internal.zzu.zzp();
        String string = UUID.randomUUID().toString();
        zzblo.zzo.zzc(string, new zzbqs(this, zzccnVar));
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", string);
        jSONObject.put("args", (JSONObject) obj);
        zzbpuVar.zzl(this.zzc, jSONObject);
        return zzccnVar;
    }
}
