package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.InputStream;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzebu {
    private final zzgge zza;
    private final zzeay zzb;
    private final zzhkj zzc;
    private final zzfmq zzd;
    private final Context zze;
    private final VersionInfoParcel zzf;

    public zzebu(zzgge zzggeVar, zzeay zzeayVar, zzhkj zzhkjVar, zzfmq zzfmqVar, Context context, VersionInfoParcel versionInfoParcel) {
        this.zza = zzggeVar;
        this.zzb = zzeayVar;
        this.zzc = zzhkjVar;
        this.zzd = zzfmqVar;
        this.zze = context;
        this.zzf = versionInfoParcel;
    }

    private final ListenableFuture zzh(final zzbxu zzbxuVar, zzebt zzebtVar, final zzebt zzebtVar2, final zzgfa zzgfaVar) {
        String str = zzbxuVar.zzd;
        com.google.android.gms.ads.internal.zzu.zzp();
        return zzgft.zzf(zzgft.zzn(zzgft.zzn(zzgfk.zzu(com.google.android.gms.ads.internal.util.zzt.zzC(str) ? zzgft.zzg(new zzebh(1)) : zzgft.zzf(zzebtVar.zza(zzbxuVar), ExecutionException.class, new zzgfa() { // from class: com.google.android.gms.internal.ads.zzebs
            @Override // com.google.android.gms.internal.ads.zzgfa
            public final ListenableFuture zza(Object obj) {
                ExecutionException executionException = (ExecutionException) obj;
                Throwable cause = executionException.getCause();
                Throwable cause2 = executionException;
                if (cause != null) {
                    cause2 = executionException.getCause();
                }
                return zzgft.zzg(cause2);
            }
        }, this.zza)), new zzgfa() { // from class: com.google.android.gms.internal.ads.zzebq
            @Override // com.google.android.gms.internal.ads.zzgfa
            public final ListenableFuture zza(Object obj) {
                return zzgft.zzh(((zzebi) obj).zzb());
            }
        }, this.zza), zzgfaVar, this.zza), zzebh.class, new zzgfa() { // from class: com.google.android.gms.internal.ads.zzebr
            @Override // com.google.android.gms.internal.ads.zzgfa
            public final ListenableFuture zza(Object obj) {
                return this.zza.zzc(zzebtVar2, zzbxuVar, zzgfaVar, (zzebh) obj);
            }
        }, this.zza);
    }

    public final ListenableFuture zza(final zzbxu zzbxuVar) {
        zzgfa zzgfaVar = new zzgfa() { // from class: com.google.android.gms.internal.ads.zzebn
            @Override // com.google.android.gms.internal.ads.zzgfa
            public final ListenableFuture zza(Object obj) {
                String str = new String(zzgdm.zzb((InputStream) obj), zzfxs.zzc);
                zzbxu zzbxuVar2 = zzbxuVar;
                zzbxuVar2.zzj = str;
                return zzgft.zzh(zzbxuVar2);
            }
        };
        final zzeay zzeayVar = this.zzb;
        Objects.requireNonNull(zzeayVar);
        return zzh(zzbxuVar, new zzebt() { // from class: com.google.android.gms.internal.ads.zzebo
            @Override // com.google.android.gms.internal.ads.zzebt
            public final ListenableFuture zza(zzbxu zzbxuVar2) {
                return zzeayVar.zza(zzbxuVar2);
            }
        }, new zzebt() { // from class: com.google.android.gms.internal.ads.zzebp
            @Override // com.google.android.gms.internal.ads.zzebt
            public final ListenableFuture zza(zzbxu zzbxuVar2) {
                return this.zza.zzd(zzbxuVar2);
            }
        }, zzgfaVar);
    }

    public final ListenableFuture zzb(JSONObject jSONObject) {
        return zzgft.zzn(zzgfk.zzu(zzgft.zzh(jSONObject)), com.google.android.gms.ads.internal.zzu.zzf().zza(this.zze, this.zzf, this.zzd).zza("AFMA_getAdDictionary", zzbqe.zza, new zzbpz() { // from class: com.google.android.gms.internal.ads.zzebj
            @Override // com.google.android.gms.internal.ads.zzbpz
            public final Object zza(JSONObject jSONObject2) {
                return new zzbxx(jSONObject2);
            }
        }), this.zza);
    }

    final /* synthetic */ ListenableFuture zzc(zzebt zzebtVar, zzbxu zzbxuVar, zzgfa zzgfaVar, zzebh zzebhVar) throws Exception {
        return zzgft.zzn(zzebtVar.zza(zzbxuVar), zzgfaVar, this.zza);
    }

    final /* synthetic */ ListenableFuture zzd(zzbxu zzbxuVar) {
        return ((zzedq) this.zzc.zzb()).zzb(zzbxuVar, Binder.getCallingUid());
    }

    final /* synthetic */ ListenableFuture zze(zzbxu zzbxuVar) {
        return this.zzb.zzd(zzbxuVar.zzh);
    }

    final /* synthetic */ ListenableFuture zzf(zzbxu zzbxuVar) {
        return ((zzedq) this.zzc.zzb()).zzi(zzbxuVar.zzh);
    }

    public final ListenableFuture zzg(zzbxu zzbxuVar) {
        return zzh(zzbxuVar, new zzebt() { // from class: com.google.android.gms.internal.ads.zzebl
            @Override // com.google.android.gms.internal.ads.zzebt
            public final ListenableFuture zza(zzbxu zzbxuVar2) {
                return this.zza.zze(zzbxuVar2);
            }
        }, new zzebt() { // from class: com.google.android.gms.internal.ads.zzebm
            @Override // com.google.android.gms.internal.ads.zzebt
            public final ListenableFuture zza(zzbxu zzbxuVar2) {
                return this.zza.zzf(zzbxuVar2);
            }
        }, new zzgfa() { // from class: com.google.android.gms.internal.ads.zzebk
            @Override // com.google.android.gms.internal.ads.zzgfa
            public final ListenableFuture zza(Object obj) {
                return zzgft.zzh(null);
            }
        });
    }
}
