package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzcvx {
    private final zzeam zza;
    private final zzfho zzb;
    private final zzflt zzc;
    private final zzcor zzd;
    private final zzelm zze;
    private final zzdeq zzf;
    private zzfhf zzg;
    private final zzebu zzh;
    private final zzcyp zzi;
    private final Executor zzj;
    private final zzebe zzk;
    private final zzehq zzl;
    private final zzeck zzm;
    private final zzecr zzn;

    zzcvx(zzeam zzeamVar, zzfho zzfhoVar, zzflt zzfltVar, zzcor zzcorVar, zzelm zzelmVar, zzdeq zzdeqVar, zzfhf zzfhfVar, zzebu zzebuVar, zzcyp zzcypVar, Executor executor, zzebe zzebeVar, zzehq zzehqVar, zzeck zzeckVar, zzecr zzecrVar) {
        this.zza = zzeamVar;
        this.zzb = zzfhoVar;
        this.zzc = zzfltVar;
        this.zzd = zzcorVar;
        this.zze = zzelmVar;
        this.zzf = zzdeqVar;
        this.zzg = zzfhfVar;
        this.zzh = zzebuVar;
        this.zzi = zzcypVar;
        this.zzj = executor;
        this.zzk = zzebeVar;
        this.zzl = zzehqVar;
        this.zzm = zzeckVar;
        this.zzn = zzecrVar;
    }

    public final com.google.android.gms.ads.internal.client.zze zza(Throwable th) {
        return zzfiq.zzb(th, this.zzl);
    }

    public final zzdeq zzc() {
        return this.zzf;
    }

    final /* synthetic */ zzfhf zzd(zzfhf zzfhfVar) throws Exception {
        this.zzd.zza(zzfhfVar);
        return zzfhfVar;
    }

    public final ListenableFuture zze(final zzfjj zzfjjVar) {
        zzfky zzfkyVarZza = this.zzc.zzb(zzfln.GET_CACHE_KEY, this.zzi.zzc()).zzf(new zzgfa() { // from class: com.google.android.gms.internal.ads.zzcvt
            @Override // com.google.android.gms.internal.ads.zzgfa
            public final ListenableFuture zza(Object obj) {
                return this.zza.zzf(zzfjjVar, (zzbxu) obj);
            }
        }).zza();
        zzgft.zzr(zzfkyVarZza, new zzcvv(this), this.zzj);
        return zzfkyVarZza;
    }

    final /* synthetic */ ListenableFuture zzf(zzfjj zzfjjVar, zzbxu zzbxuVar) throws Exception {
        zzbxuVar.zzi = zzfjjVar;
        return this.zzh.zza(zzbxuVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    final /* synthetic */ ListenableFuture zzg(ListenableFuture listenableFuture, ListenableFuture listenableFuture2, ListenableFuture listenableFuture3) throws Exception {
        return this.zzn.zzc((zzbxu) listenableFuture.get(), (JSONObject) listenableFuture2.get(), (zzbxx) listenableFuture3.get());
    }

    public final ListenableFuture zzh(zzbxu zzbxuVar) {
        zzfky zzfkyVarZza = this.zzc.zzb(zzfln.NOTIFY_CACHE_HIT, this.zzh.zzg(zzbxuVar)).zza();
        zzgft.zzr(zzfkyVarZza, new zzcvw(this), this.zzj);
        return zzfkyVarZza;
    }

    public final ListenableFuture zzi(ListenableFuture listenableFuture) {
        zzflk zzflkVarZzf = this.zzc.zzb(zzfln.RENDERER, listenableFuture).zze(new zzfkw() { // from class: com.google.android.gms.internal.ads.zzcvo
            @Override // com.google.android.gms.internal.ads.zzfkw
            public final Object zza(Object obj) throws Exception {
                zzfhf zzfhfVar = (zzfhf) obj;
                this.zza.zzd(zzfhfVar);
                return zzfhfVar;
            }
        }).zzf(this.zze);
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzfD)).booleanValue()) {
            zzflkVarZzf = zzflkVarZzf.zzi(((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzfF)).intValue(), TimeUnit.SECONDS);
        }
        return zzflkVarZzf.zza();
    }

    public final ListenableFuture zzj() {
        com.google.android.gms.ads.internal.client.zzl zzlVar = this.zzb.zzd;
        if (zzlVar.zzx == null && zzlVar.zzs == null) {
            return zzk(this.zzi.zzc());
        }
        zzflt zzfltVar = this.zzc;
        zzeam zzeamVar = this.zza;
        return zzfld.zzc(zzeamVar.zza(), zzfln.PRELOADED_LOADER, zzfltVar).zza();
    }

    public final ListenableFuture zzk(final ListenableFuture listenableFuture) {
        if (this.zzg != null) {
            return zzfld.zzc(zzgft.zzh(this.zzg), zzfln.SERVER_TRANSACTION, this.zzc).zza();
        }
        com.google.android.gms.ads.internal.zzu.zzc().zzj();
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzlB)).booleanValue() || ((Boolean) zzbgq.zzc.zze()).booleanValue()) {
            zzflk zzflkVarZzb = this.zzc.zzb(zzfln.SERVER_TRANSACTION, listenableFuture);
            final zzebe zzebeVar = this.zzk;
            Objects.requireNonNull(zzebeVar);
            return zzflkVarZzb.zzf(new zzgfa() { // from class: com.google.android.gms.internal.ads.zzcvu
                @Override // com.google.android.gms.internal.ads.zzgfa
                public final ListenableFuture zza(Object obj) {
                    return zzebeVar.zzb((zzbxu) obj);
                }
            }).zza();
        }
        final zzeck zzeckVar = this.zzm;
        Objects.requireNonNull(zzeckVar);
        final ListenableFuture listenableFutureZzn = zzgft.zzn(listenableFuture, new zzgfa() { // from class: com.google.android.gms.internal.ads.zzcvp
            @Override // com.google.android.gms.internal.ads.zzgfa
            public final ListenableFuture zza(Object obj) {
                return zzeckVar.zza((zzbxu) obj);
            }
        }, this.zzj);
        zzflk zzflkVarZzb2 = this.zzc.zzb(zzfln.BUILD_URL, listenableFutureZzn);
        final zzebu zzebuVar = this.zzh;
        Objects.requireNonNull(zzebuVar);
        final zzfky zzfkyVarZza = zzflkVarZzb2.zzf(new zzgfa() { // from class: com.google.android.gms.internal.ads.zzcvq
            @Override // com.google.android.gms.internal.ads.zzgfa
            public final ListenableFuture zza(Object obj) {
                return zzebuVar.zzb((JSONObject) obj);
            }
        }).zza();
        return this.zzc.zza(zzfln.SERVER_TRANSACTION, listenableFuture, listenableFutureZzn, zzfkyVarZza).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzcvr
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.zzg(listenableFuture, listenableFutureZzn, zzfkyVarZza);
            }
        }).zzf(new zzgfa() { // from class: com.google.android.gms.internal.ads.zzcvs
            @Override // com.google.android.gms.internal.ads.zzgfa
            public final ListenableFuture zza(Object obj) {
                return (ListenableFuture) obj;
            }
        }).zza();
    }

    public final void zzl(zzfhf zzfhfVar) {
        this.zzg = zzfhfVar;
    }
}
