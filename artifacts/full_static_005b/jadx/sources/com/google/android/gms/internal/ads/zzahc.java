package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzahc extends zzahr {
    public static final Parcelable.Creator<zzahc> CREATOR = new zzahb();
    public final String zza;
    public final String zzb;
    public final int zzc;
    public final byte[] zzd;

    zzahc(Parcel parcel) {
        super("APIC");
        String string = parcel.readString();
        int i = zzgd.zza;
        this.zza = string;
        this.zzb = parcel.readString();
        this.zzc = parcel.readInt();
        this.zzd = parcel.createByteArray();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzahc zzahcVar = (zzahc) obj;
            if (this.zzc == zzahcVar.zzc && zzgd.zzG(this.zza, zzahcVar.zza) && zzgd.zzG(this.zzb, zzahcVar.zzb) && Arrays.equals(this.zzd, zzahcVar.zzd)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.zza;
        int iHashCode = str != null ? str.hashCode() : 0;
        int i = this.zzc;
        String str2 = this.zzb;
        return ((((((i + 527) * 31) + iHashCode) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + Arrays.hashCode(this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzahr
    public final String toString() {
        return this.zzf + ": mimeType=" + this.zza + ", description=" + this.zzb;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zza);
        parcel.writeString(this.zzb);
        parcel.writeInt(this.zzc);
        parcel.writeByteArray(this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzahr, com.google.android.gms.internal.ads.zzcc
    public final void zza(zzby zzbyVar) {
        zzbyVar.zza(this.zzd, this.zzc);
    }

    public zzahc(String str, String str2, int i, byte[] bArr) {
        super("APIC");
        this.zza = str;
        this.zzb = str2;
        this.zzc = i;
        this.zzd = bArr;
    }
}
