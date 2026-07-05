package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzfke {
    private final zzfjx zza;
    private final ListenableFuture zzb;
    private boolean zzc = false;
    private boolean zzd = false;

    public zzfke(final zzfjc zzfjcVar, final zzfjw zzfjwVar, final zzfjx zzfjxVar) {
        this.zza = zzfjxVar;
        this.zzb = zzgft.zzf(zzgft.zzn(zzfjwVar.zza(zzfjxVar), new zzgfa() { // from class: com.google.android.gms.internal.ads.zzfkc
            @Override // com.google.android.gms.internal.ads.zzgfa
            public final ListenableFuture zza(Object obj) {
                return this.zza.zzb(zzfjwVar, zzfjcVar, zzfjxVar, (zzfjl) obj);
            }
        }, zzfjxVar.zzb()), Exception.class, new zzgfa() { // from class: com.google.android.gms.internal.ads.zzfkd
            @Override // com.google.android.gms.internal.ads.zzgfa
            public final ListenableFuture zza(Object obj) {
                return this.zza.zzc(zzfjwVar, (Exception) obj);
            }
        }, zzfjxVar.zzb());
    }

    public final synchronized ListenableFuture zza(zzfjx zzfjxVar) {
        if (!this.zzd && !this.zzc && this.zza.zza() != null && zzfjxVar.zza() != null && this.zza.zza().equals(zzfjxVar.zza())) {
            this.zzc = true;
            return this.zzb;
        }
        return null;
    }

    final /* synthetic */ ListenableFuture zzb(zzfjw zzfjwVar, zzfjc zzfjcVar, zzfjx zzfjxVar, zzfjl zzfjlVar) throws Exception {
        synchronized (this) {
            this.zzd = true;
            zzfjwVar.zzb(zzfjlVar);
            if (this.zzc) {
                return zzgft.zzh(new zzfjv(zzfjlVar, zzfjxVar));
            }
            zzfjcVar.zzd(zzfjxVar.zza(), zzfjlVar);
            return zzgft.zzh(null);
        }
    }

    final /* synthetic */ ListenableFuture zzc(zzfjw zzfjwVar, Exception exc) throws Exception {
        synchronized (this) {
            this.zzd = true;
            throw exc;
        }
    }

    public final synchronized void zzd(zzgfp zzgfpVar) {
        zzgft.zzr(zzgft.zzn(this.zzb, new zzgfa() { // from class: com.google.android.gms.internal.ads.zzfkb
            @Override // com.google.android.gms.internal.ads.zzgfa
            public final ListenableFuture zza(Object obj) {
                return zzgft.zzi();
            }
        }, this.zza.zzb()), zzgfpVar, this.zza.zzb());
    }
}
