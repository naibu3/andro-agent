package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzahg extends zzahr {
    public static final Parcelable.Creator<zzahg> CREATOR = new zzahf();
    public final String zza;
    public final int zzb;
    public final int zzc;
    public final long zzd;
    public final long zze;
    private final zzahr[] zzg;

    zzahg(Parcel parcel) {
        super("CHAP");
        String string = parcel.readString();
        int i = zzgd.zza;
        this.zza = string;
        this.zzb = parcel.readInt();
        this.zzc = parcel.readInt();
        this.zzd = parcel.readLong();
        this.zze = parcel.readLong();
        int i2 = parcel.readInt();
        this.zzg = new zzahr[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            this.zzg[i3] = (zzahr) parcel.readParcelable(zzahr.class.getClassLoader());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzahr, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzahg zzahgVar = (zzahg) obj;
            if (this.zzb == zzahgVar.zzb && this.zzc == zzahgVar.zzc && this.zzd == zzahgVar.zzd && this.zze == zzahgVar.zze && zzgd.zzG(this.zza, zzahgVar.zza) && Arrays.equals(this.zzg, zzahgVar.zzg)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.zza;
        return ((((((((this.zzb + 527) * 31) + this.zzc) * 31) + ((int) this.zzd)) * 31) + ((int) this.zze)) * 31) + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zza);
        parcel.writeInt(this.zzb);
        parcel.writeInt(this.zzc);
        parcel.writeLong(this.zzd);
        parcel.writeLong(this.zze);
        parcel.writeInt(this.zzg.length);
        for (zzahr zzahrVar : this.zzg) {
            parcel.writeParcelable(zzahrVar, 0);
        }
    }

    public zzahg(String str, int i, int i2, long j, long j2, zzahr[] zzahrVarArr) {
        super("CHAP");
        this.zza = str;
        this.zzb = i;
        this.zzc = i2;
        this.zzd = j;
        this.zze = j2;
        this.zzg = zzahrVarArr;
    }
}
