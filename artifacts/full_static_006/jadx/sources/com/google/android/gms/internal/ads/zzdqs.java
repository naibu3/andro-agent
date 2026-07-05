package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzdqs {
    private final com.google.android.gms.ads.internal.zza zzb;
    private final zzchq zzc;
    private final Context zzd;
    private final zzdvc zze;
    private final Executor zzf;
    private final zzaxd zzg;
    private final VersionInfoParcel zzh;
    private final zzefz zzj;
    private final zzfoe zzk;
    private final zzegk zzl;
    private final zzfhs zzm;
    private ListenableFuture zzn;
    private final zzdqf zza = new zzdqf();
    private final zzbmf zzi = new zzbmf();

    zzdqs(zzdqp zzdqpVar) {
        this.zzd = zzdqpVar.zzc;
        this.zzf = zzdqpVar.zzf;
        this.zzg = zzdqpVar.zzg;
        this.zzh = zzdqpVar.zzh;
        this.zzb = zzdqpVar.zza;
        this.zzc = zzdqpVar.zzb;
        this.zzj = zzdqpVar.zze;
        this.zzk = zzdqpVar.zzi;
        this.zze = zzdqpVar.zzd;
        this.zzl = zzdqpVar.zzj;
        this.zzm = zzdqpVar.zzk;
    }

    final /* synthetic */ zzchd zza(zzchd zzchdVar) {
        zzchdVar.zzag("/result", this.zzi);
        zzciv zzcivVarZzN = zzchdVar.zzN();
        com.google.android.gms.ads.internal.zzb zzbVar = new com.google.android.gms.ads.internal.zzb(this.zzd, null, null);
        zzefz zzefzVar = this.zzj;
        zzfoe zzfoeVar = this.zzk;
        zzdvc zzdvcVar = this.zze;
        zzdqf zzdqfVar = this.zza;
        zzcivVarZzN.zzR(null, zzdqfVar, zzdqfVar, zzdqfVar, zzdqfVar, false, null, zzbVar, null, null, zzefzVar, zzfoeVar, zzdvcVar, null, null, null, null, null, null);
        return zzchdVar;
    }

    final /* synthetic */ ListenableFuture zzf(String str, JSONObject jSONObject, zzchd zzchdVar) throws Exception {
        return this.zzi.zzb(zzchdVar, str, jSONObject);
    }

    public final synchronized ListenableFuture zzg(final String str, final JSONObject jSONObject) {
        ListenableFuture listenableFuture = this.zzn;
        if (listenableFuture == null) {
            return zzgft.zzh(null);
        }
        return zzgft.zzn(listenableFuture, new zzgfa() { // from class: com.google.android.gms.internal.ads.zzdqg
            @Override // com.google.android.gms.internal.ads.zzgfa
            public final ListenableFuture zza(Object obj) {
                return this.zza.zzf(str, jSONObject, (zzchd) obj);
            }
        }, this.zzf);
    }

    public final synchronized void zzh(zzfgt zzfgtVar, zzfgw zzfgwVar, zzcqd zzcqdVar) {
        ListenableFuture listenableFuture = this.zzn;
        if (listenableFuture == null) {
            return;
        }
        zzgft.zzr(listenableFuture, new zzdqm(this, zzfgtVar, zzfgwVar, zzcqdVar), this.zzf);
    }

    public final synchronized void zzi() {
        ListenableFuture listenableFuture = this.zzn;
        if (listenableFuture == null) {
            return;
        }
        zzgft.zzr(listenableFuture, new zzdqi(this), this.zzf);
        this.zzn = null;
    }

    public final synchronized void zzj(String str, Map map) {
        ListenableFuture listenableFuture = this.zzn;
        if (listenableFuture == null) {
            return;
        }
        zzgft.zzr(listenableFuture, new zzdql(this, "sendMessageToNativeJs", map), this.zzf);
    }

    public final synchronized void zzk() {
        final String str = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzdL);
        final Context context = this.zzd;
        final zzaxd zzaxdVar = this.zzg;
        final VersionInfoParcel versionInfoParcel = this.zzh;
        final com.google.android.gms.ads.internal.zza zzaVar = this.zzb;
        final zzegk zzegkVar = this.zzl;
        final zzfhs zzfhsVar = this.zzm;
        ListenableFuture listenableFutureZzm = zzgft.zzm(zzgft.zzk(new zzgez() { // from class: com.google.android.gms.internal.ads.zzcho
            @Override // com.google.android.gms.internal.ads.zzgez
            public final ListenableFuture zza() throws zzchp {
                com.google.android.gms.ads.internal.zzu.zzz();
                Context context2 = context;
                zzcix zzcixVarZza = zzcix.zza();
                zzaxd zzaxdVar2 = zzaxdVar;
                zzegk zzegkVar2 = zzegkVar;
                com.google.android.gms.ads.internal.zza zzaVar2 = zzaVar;
                zzchd zzchdVarZza = zzchq.zza(context2, zzcixVarZza, "", false, false, zzaxdVar2, null, versionInfoParcel, null, null, zzaVar2, zzbdm.zza(), null, null, zzegkVar2, zzfhsVar);
                final zzccm zzccmVarZza = zzccm.zza(zzchdVarZza);
                zzchdVarZza.zzN().zzB(new zzcit() { // from class: com.google.android.gms.internal.ads.zzchn
                    @Override // com.google.android.gms.internal.ads.zzcit
                    public final void zza(boolean z, int i, String str2, String str3) {
                        zzccmVarZza.zzb();
                    }
                });
                zzchdVarZza.loadUrl(str);
                return zzccmVarZza;
            }
        }, zzcci.zze), new zzfxu() { // from class: com.google.android.gms.internal.ads.zzdqh
            @Override // com.google.android.gms.internal.ads.zzfxu
            public final Object apply(Object obj) {
                zzchd zzchdVar = (zzchd) obj;
                this.zza.zza(zzchdVar);
                return zzchdVar;
            }
        }, this.zzf);
        this.zzn = listenableFutureZzm;
        zzccl.zza(listenableFutureZzm, "NativeJavascriptExecutor.initializeEngine");
    }

    public final synchronized void zzl(String str, zzblp zzblpVar) {
        ListenableFuture listenableFuture = this.zzn;
        if (listenableFuture == null) {
            return;
        }
        zzgft.zzr(listenableFuture, new zzdqj(this, str, zzblpVar), this.zzf);
    }

    public final void zzm(WeakReference weakReference, String str, zzblp zzblpVar) {
        zzl(str, new zzdqr(this, weakReference, str, zzblpVar, null));
    }

    public final synchronized void zzn(String str, zzblp zzblpVar) {
        ListenableFuture listenableFuture = this.zzn;
        if (listenableFuture == null) {
            return;
        }
        zzgft.zzr(listenableFuture, new zzdqk(this, str, zzblpVar), this.zzf);
    }
}
