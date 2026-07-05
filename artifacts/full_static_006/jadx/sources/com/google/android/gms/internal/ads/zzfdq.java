package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbdv;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzfdq implements zzfek {
    private final zzfek zza;
    private final zzfek zzb;
    private final zzfjy zzc;
    private final String zzd;
    private zzcys zze;
    private final Executor zzf;

    public zzfdq(zzfek zzfekVar, zzfek zzfekVar2, zzfjy zzfjyVar, String str, Executor executor) {
        this.zza = zzfekVar;
        this.zzb = zzfekVar2;
        this.zzc = zzfjyVar;
        this.zzd = str;
        this.zzf = executor;
    }

    private final ListenableFuture zzg(zzfjl zzfjlVar, zzfel zzfelVar) {
        zzcys zzcysVar = zzfjlVar.zza;
        this.zze = zzcysVar;
        if (zzfjlVar.zzc != null) {
            if (zzcysVar.zzf() != null) {
                zzfjlVar.zzc.zzo().zzl(zzfjlVar.zza.zzf());
            }
            return zzgft.zzh(zzfjlVar.zzc);
        }
        zzcysVar.zzb().zzl(zzfjlVar.zzb);
        return ((zzfea) this.zza).zzb(zzfelVar, null, zzfjlVar.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzfek
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final synchronized zzcys zzd() {
        return this.zze;
    }

    final /* synthetic */ ListenableFuture zzb(zzfel zzfelVar, zzfdp zzfdpVar, zzfej zzfejVar, zzcys zzcysVar, zzfdv zzfdvVar) throws Exception {
        if (zzfdvVar != null) {
            zzfdp zzfdpVar2 = new zzfdp(zzfdpVar.zza, zzfdpVar.zzb, zzfdpVar.zzc, zzfdpVar.zzd, zzfdpVar.zze, zzfdpVar.zzf, zzfdvVar.zza);
            if (zzfdvVar.zzc != null) {
                this.zze = null;
                this.zzc.zze(zzfdpVar2);
                return zzg(zzfdvVar.zzc, zzfelVar);
            }
            ListenableFuture listenableFutureZza = this.zzc.zza(zzfdpVar2);
            if (listenableFutureZza != null) {
                this.zze = null;
                return zzgft.zzn(listenableFutureZza, new zzgfa() { // from class: com.google.android.gms.internal.ads.zzfdm
                    @Override // com.google.android.gms.internal.ads.zzgfa
                    public final ListenableFuture zza(Object obj) {
                        return this.zza.zze((zzfjv) obj);
                    }
                }, this.zzf);
            }
            this.zzc.zze(zzfdpVar2);
            zzfelVar = new zzfel(zzfelVar.zzb, zzfdvVar.zzb);
        }
        ListenableFuture listenableFutureZzb = ((zzfea) this.zza).zzb(zzfelVar, zzfejVar, zzcysVar);
        this.zze = zzcysVar;
        return listenableFutureZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfek
    public final /* bridge */ /* synthetic */ ListenableFuture zzc(zzfel zzfelVar, zzfej zzfejVar, Object obj) {
        return zzf(zzfelVar, zzfejVar, null);
    }

    final /* synthetic */ ListenableFuture zze(zzfjv zzfjvVar) throws Exception {
        zzfjx zzfjxVar;
        if (zzfjvVar == null || zzfjvVar.zza == null || (zzfjxVar = zzfjvVar.zzb) == null) {
            throw new zzdzd(1, "Empty prefetch");
        }
        zzbdv.zzb.zzc zzcVarZzd = zzbdv.zzb.zzd();
        zzbdv.zzb.zza.C0017zza c0017zzaZza = zzbdv.zzb.zza.zza();
        c0017zzaZza.zzf(zzbdv.zzb.zzd.IN_MEMORY);
        c0017zzaZza.zzh(zzbdv.zzb.zze.zzi());
        zzcVarZzd.zzd(c0017zzaZza);
        zzfjvVar.zza.zza.zzb().zzc().zzm(zzcVarZzd.zzbr());
        return zzg(zzfjvVar.zza, ((zzfdp) zzfjxVar).zzb);
    }

    public final synchronized ListenableFuture zzf(final zzfel zzfelVar, final zzfej zzfejVar, zzcys zzcysVar) {
        zzcyr zzcyrVarZza = zzfejVar.zza(zzfelVar.zzb);
        zzcyrVarZza.zza(new zzfdr(this.zzd));
        final zzcys zzcysVar2 = (zzcys) zzcyrVarZza.zzh();
        zzcysVar2.zzg();
        zzcysVar2.zzg();
        com.google.android.gms.ads.internal.client.zzl zzlVar = zzcysVar2.zzg().zzd;
        if (zzlVar.zzs == null && zzlVar.zzx == null) {
            zzfho zzfhoVarZzg = zzcysVar2.zzg();
            final zzfdp zzfdpVar = new zzfdp(zzfejVar, zzfelVar, zzfhoVarZzg.zzd, zzfhoVarZzg.zzf, this.zzf, zzfhoVarZzg.zzj, null);
            return zzgft.zzn(zzgfk.zzu(((zzfdw) this.zzb).zzb(zzfelVar, zzfejVar, zzcysVar2)), new zzgfa() { // from class: com.google.android.gms.internal.ads.zzfdn
                @Override // com.google.android.gms.internal.ads.zzgfa
                public final ListenableFuture zza(Object obj) {
                    return this.zza.zzb(zzfelVar, zzfdpVar, zzfejVar, zzcysVar2, (zzfdv) obj);
                }
            }, this.zzf);
        }
        this.zze = zzcysVar2;
        return ((zzfea) this.zza).zzb(zzfelVar, zzfejVar, zzcysVar2);
    }
}
