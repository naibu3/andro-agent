package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes2.dex */
public final class zzfjj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzfjj> CREATOR = new zzfjk();

    @Nullable
    public final Context zza;
    public final zzfjg zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final String zzf;
    public final int zzg;
    private final zzfjg[] zzh;
    private final int zzi;
    private final int zzj;
    private final int zzk;
    private final int[] zzl;
    private final int[] zzm;

    public zzfjj(int i, int i2, int i3, int i4, String str, int i5, int i6) {
        zzfjg[] zzfjgVarArrValues = zzfjg.values();
        this.zzh = zzfjgVarArrValues;
        int[] iArrZza = zzfjh.zza();
        this.zzl = iArrZza;
        int[] iArrZza2 = zzfji.zza();
        this.zzm = iArrZza2;
        this.zza = null;
        this.zzi = i;
        this.zzb = zzfjgVarArrValues[i];
        this.zzc = i2;
        this.zzd = i3;
        this.zze = i4;
        this.zzf = str;
        this.zzj = i5;
        this.zzg = iArrZza[i5];
        this.zzk = i6;
        int i7 = iArrZza2[i6];
    }

    @Nullable
    public static zzfjj zza(zzfjg zzfjgVar, Context context) {
        if (zzfjgVar == zzfjg.Rewarded) {
            return new zzfjj(context, zzfjgVar, ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzgC)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzgI)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzgK)).intValue(), (String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzgM), (String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzgE), (String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzgG));
        }
        if (zzfjgVar == zzfjg.Interstitial) {
            return new zzfjj(context, zzfjgVar, ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzgD)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzgJ)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzgL)).intValue(), (String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzgN), (String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzgF), (String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzgH));
        }
        if (zzfjgVar != zzfjg.AppOpen) {
            return null;
        }
        return new zzfjj(context, zzfjgVar, ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzgQ)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzgS)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzgT)).intValue(), (String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzgO), (String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzgP), (String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzgR));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.zzi;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, i2);
        SafeParcelWriter.writeInt(parcel, 2, this.zzc);
        SafeParcelWriter.writeInt(parcel, 3, this.zzd);
        SafeParcelWriter.writeInt(parcel, 4, this.zze);
        SafeParcelWriter.writeString(parcel, 5, this.zzf, false);
        SafeParcelWriter.writeInt(parcel, 6, this.zzj);
        SafeParcelWriter.writeInt(parcel, 7, this.zzk);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    private zzfjj(@Nullable Context context, zzfjg zzfjgVar, int i, int i2, int i3, String str, String str2, String str3) {
        int i4;
        this.zzh = zzfjg.values();
        this.zzl = zzfjh.zza();
        this.zzm = zzfji.zza();
        this.zza = context;
        this.zzi = zzfjgVar.ordinal();
        this.zzb = zzfjgVar;
        this.zzc = i;
        this.zzd = i2;
        this.zze = i3;
        this.zzf = str;
        if ("oldest".equals(str2)) {
            i4 = 1;
        } else {
            i4 = (!"lru".equals(str2) && "lfu".equals(str2)) ? 3 : 2;
        }
        this.zzg = i4;
        this.zzj = i4 - 1;
        "onAdClosed".equals(str3);
        this.zzk = 0;
    }
}
