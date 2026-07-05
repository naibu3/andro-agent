package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzagw implements zzcc {
    public static final Parcelable.Creator<zzagw> CREATOR = new zzagv();
    public final int zza;
    public final String zzb;
    public final String zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final byte[] zzh;

    public zzagw(int i, String str, String str2, int i2, int i3, int i4, int i5, byte[] bArr) {
        this.zza = i;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = i2;
        this.zze = i3;
        this.zzf = i4;
        this.zzg = i5;
        this.zzh = bArr;
    }

    zzagw(Parcel parcel) {
        this.zza = parcel.readInt();
        String string = parcel.readString();
        int i = zzgd.zza;
        this.zzb = string;
        this.zzc = parcel.readString();
        this.zzd = parcel.readInt();
        this.zze = parcel.readInt();
        this.zzf = parcel.readInt();
        this.zzg = parcel.readInt();
        this.zzh = parcel.createByteArray();
    }

    public static zzagw zzb(zzfu zzfuVar) {
        int iZzg = zzfuVar.zzg();
        String strZze = zzcg.zze(zzfuVar.zzA(zzfuVar.zzg(), zzfxs.zza));
        String strZzA = zzfuVar.zzA(zzfuVar.zzg(), zzfxs.zzc);
        int iZzg2 = zzfuVar.zzg();
        int iZzg3 = zzfuVar.zzg();
        int iZzg4 = zzfuVar.zzg();
        int iZzg5 = zzfuVar.zzg();
        int iZzg6 = zzfuVar.zzg();
        byte[] bArr = new byte[iZzg6];
        zzfuVar.zzG(bArr, 0, iZzg6);
        return new zzagw(iZzg, strZze, strZzA, iZzg2, iZzg3, iZzg4, iZzg5, bArr);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzagw zzagwVar = (zzagw) obj;
            if (this.zza == zzagwVar.zza && this.zzb.equals(zzagwVar.zzb) && this.zzc.equals(zzagwVar.zzc) && this.zzd == zzagwVar.zzd && this.zze == zzagwVar.zze && this.zzf == zzagwVar.zzf && this.zzg == zzagwVar.zzg && Arrays.equals(this.zzh, zzagwVar.zzh)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((this.zza + 527) * 31) + this.zzb.hashCode()) * 31) + this.zzc.hashCode()) * 31) + this.zzd) * 31) + this.zze) * 31) + this.zzf) * 31) + this.zzg) * 31) + Arrays.hashCode(this.zzh);
    }

    public final String toString() {
        return "Picture: mimeType=" + this.zzb + ", description=" + this.zzc;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.zza);
        parcel.writeString(this.zzb);
        parcel.writeString(this.zzc);
        parcel.writeInt(this.zzd);
        parcel.writeInt(this.zze);
        parcel.writeInt(this.zzf);
        parcel.writeInt(this.zzg);
        parcel.writeByteArray(this.zzh);
    }

    @Override // com.google.android.gms.internal.ads.zzcc
    public final void zza(zzby zzbyVar) {
        zzbyVar.zza(this.zzh, this.zza);
    }
}
