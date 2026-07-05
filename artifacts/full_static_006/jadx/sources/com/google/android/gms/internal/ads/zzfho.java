package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzfho {
    public final com.google.android.gms.ads.internal.client.zzfk zza;
    public final zzbnz zzb;
    public final zzepc zzc;
    public final com.google.android.gms.ads.internal.client.zzl zzd;
    public final com.google.android.gms.ads.internal.client.zzq zze;
    public final String zzf;
    public final ArrayList zzg;
    public final ArrayList zzh;
    public final zzbhk zzi;
    public final com.google.android.gms.ads.internal.client.zzw zzj;
    public final int zzk;
    public final AdManagerAdViewOptions zzl;
    public final PublisherAdViewOptions zzm;
    public final com.google.android.gms.ads.internal.client.zzcb zzn;
    public final zzfhb zzo;
    public final boolean zzp;
    public final boolean zzq;
    public final boolean zzr;
    public final Bundle zzs;
    public final com.google.android.gms.ads.internal.client.zzcf zzt;

    /* synthetic */ zzfho(zzfhm zzfhmVar, zzfhn zzfhnVar) {
        this.zze = zzfhmVar.zzb;
        this.zzf = zzfhmVar.zzc;
        this.zzt = zzfhmVar.zzu;
        int i = zzfhmVar.zza.zza;
        long j = zzfhmVar.zza.zzb;
        Bundle bundle = zzfhmVar.zza.zzc;
        int i2 = zzfhmVar.zza.zzd;
        List list = zzfhmVar.zza.zze;
        boolean z = zzfhmVar.zza.zzf;
        int i3 = zzfhmVar.zza.zzg;
        boolean z2 = true;
        if (!zzfhmVar.zza.zzh && !zzfhmVar.zze) {
            z2 = false;
        }
        this.zzd = new com.google.android.gms.ads.internal.client.zzl(i, j, bundle, i2, list, z, i3, z2, zzfhmVar.zza.zzi, zzfhmVar.zza.zzj, zzfhmVar.zza.zzk, zzfhmVar.zza.zzl, zzfhmVar.zza.zzm, zzfhmVar.zza.zzn, zzfhmVar.zza.zzo, zzfhmVar.zza.zzp, zzfhmVar.zza.zzq, zzfhmVar.zza.zzr, zzfhmVar.zza.zzs, zzfhmVar.zza.zzt, zzfhmVar.zza.zzu, zzfhmVar.zza.zzv, com.google.android.gms.ads.internal.util.zzt.zza(zzfhmVar.zza.zzw), zzfhmVar.zza.zzx, zzfhmVar.zza.zzy, zzfhmVar.zza.zzz);
        this.zza = zzfhmVar.zzd != null ? zzfhmVar.zzd : zzfhmVar.zzh != null ? zzfhmVar.zzh.zzf : null;
        this.zzg = zzfhmVar.zzf;
        this.zzh = zzfhmVar.zzg;
        this.zzi = zzfhmVar.zzf == null ? null : zzfhmVar.zzh == null ? new zzbhk(new NativeAdOptions.Builder().build()) : zzfhmVar.zzh;
        this.zzj = zzfhmVar.zzi;
        this.zzk = zzfhmVar.zzm;
        this.zzl = zzfhmVar.zzj;
        this.zzm = zzfhmVar.zzk;
        this.zzn = zzfhmVar.zzl;
        this.zzb = zzfhmVar.zzn;
        this.zzo = new zzfhb(zzfhmVar.zzo, null);
        this.zzp = zzfhmVar.zzp;
        this.zzq = zzfhmVar.zzq;
        this.zzc = zzfhmVar.zzr;
        this.zzr = zzfhmVar.zzs;
        this.zzs = zzfhmVar.zzt;
    }

    public final zzbjm zza() {
        PublisherAdViewOptions publisherAdViewOptions = this.zzm;
        if (publisherAdViewOptions == null && this.zzl == null) {
            return null;
        }
        return publisherAdViewOptions != null ? publisherAdViewOptions.zzb() : this.zzl.zza();
    }

    public final boolean zzb() {
        return this.zzf.matches((String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzde));
    }
}
