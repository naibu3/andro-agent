package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzahi extends zzahr {
    public static final Parcelable.Creator<zzahi> CREATOR = new zzahh();
    public final String zza;
    public final boolean zzb;
    public final boolean zzc;
    public final String[] zzd;
    private final zzahr[] zze;

    zzahi(Parcel parcel) {
        super("CTOC");
        String string = parcel.readString();
        int i = zzgd.zza;
        this.zza = string;
        this.zzb = parcel.readByte() != 0;
        this.zzc = parcel.readByte() != 0;
        this.zzd = parcel.createStringArray();
        int i2 = parcel.readInt();
        this.zze = new zzahr[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            this.zze[i3] = (zzahr) parcel.readParcelable(zzahr.class.getClassLoader());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzahi zzahiVar = (zzahi) obj;
            if (this.zzb == zzahiVar.zzb && this.zzc == zzahiVar.zzc && zzgd.zzG(this.zza, zzahiVar.zza) && Arrays.equals(this.zzd, zzahiVar.zzd) && Arrays.equals(this.zze, zzahiVar.zze)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.zza;
        return (((((this.zzb ? 1 : 0) + 527) * 31) + (this.zzc ? 1 : 0)) * 31) + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zza);
        parcel.writeByte(this.zzb ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.zzc ? (byte) 1 : (byte) 0);
        parcel.writeStringArray(this.zzd);
        parcel.writeInt(this.zze.length);
        for (zzahr zzahrVar : this.zze) {
            parcel.writeParcelable(zzahrVar, 0);
        }
    }

    public zzahi(String str, boolean z, boolean z2, String[] strArr, zzahr[] zzahrVarArr) {
        super("CTOC");
        this.zza = str;
        this.zzb = z;
        this.zzc = z2;
        this.zzd = strArr;
        this.zze = zzahrVarArr;
    }
}
