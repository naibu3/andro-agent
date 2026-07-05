package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzflk {
    final /* synthetic */ zzfll zza;
    private final Object zzb;
    private final String zzc;
    private final ListenableFuture zzd;
    private final List zze;
    private final ListenableFuture zzf;

    private zzflk(zzfll zzfllVar, Object obj, String str, ListenableFuture listenableFuture, List list, ListenableFuture listenableFuture2) {
        this.zza = zzfllVar;
        this.zzb = obj;
        this.zzc = str;
        this.zzd = listenableFuture;
        this.zze = list;
        this.zzf = listenableFuture2;
    }

    public final zzfky zza() {
        Object obj = this.zzb;
        String strZzf = this.zzc;
        if (strZzf == null) {
            strZzf = this.zza.zzf(obj);
        }
        final zzfky zzfkyVar = new zzfky(obj, strZzf, this.zzf);
        this.zza.zzd.zza(zzfkyVar);
        this.zzd.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzflh
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zza.zzd.zzc(zzfkyVar);
            }
        }, zzcci.zzf);
        zzgft.zzr(zzfkyVar, new zzfli(this, zzfkyVar), zzcci.zzf);
        return zzfkyVar;
    }

    public final zzflk zzb(Object obj) {
        return this.zza.zzb(obj, zza());
    }

    public final zzflk zzc(Class cls, zzgfa zzgfaVar) {
        return new zzflk(this.zza, this.zzb, this.zzc, this.zzd, this.zze, zzgft.zzf(this.zzf, cls, zzgfaVar, this.zza.zzb));
    }

    public final zzflk zzd(final ListenableFuture listenableFuture) {
        return zzg(new zzgfa() { // from class: com.google.android.gms.internal.ads.zzflg
            @Override // com.google.android.gms.internal.ads.zzgfa
            public final ListenableFuture zza(Object obj) {
                return listenableFuture;
            }
        }, zzcci.zzf);
    }

    public final zzflk zze(final zzfkw zzfkwVar) {
        return zzf(new zzgfa() { // from class: com.google.android.gms.internal.ads.zzflf
            @Override // com.google.android.gms.internal.ads.zzgfa
            public final ListenableFuture zza(Object obj) {
                return zzgft.zzh(zzfkwVar.zza(obj));
            }
        });
    }

    public final zzflk zzf(zzgfa zzgfaVar) {
        return zzg(zzgfaVar, this.zza.zzb);
    }

    public final zzflk zzg(zzgfa zzgfaVar, Executor executor) {
        return new zzflk(this.zza, this.zzb, this.zzc, this.zzd, this.zze, zzgft.zzn(this.zzf, zzgfaVar, executor));
    }

    public final zzflk zzh(String str) {
        return new zzflk(this.zza, this.zzb, str, this.zzd, this.zze, this.zzf);
    }

    public final zzflk zzi(long j, TimeUnit timeUnit) {
        return new zzflk(this.zza, this.zzb, this.zzc, this.zzd, this.zze, zzgft.zzo(this.zzf, j, timeUnit, this.zza.zzc));
    }
}
