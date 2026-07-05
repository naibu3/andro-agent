package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzahe extends zzahr {
    public static final Parcelable.Creator<zzahe> CREATOR = new zzahd();
    public final byte[] zza;

    /* JADX WARN: Illegal instructions before constructor call */
    zzahe(Parcel parcel) {
        String string = parcel.readString();
        int i = zzgd.zza;
        super(string);
        this.zza = parcel.createByteArray();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzahe zzaheVar = (zzahe) obj;
            if (this.zzf.equals(zzaheVar.zzf) && Arrays.equals(this.zza, zzaheVar.zza)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.zzf.hashCode() + 527) * 31) + Arrays.hashCode(this.zza);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zzf);
        parcel.writeByteArray(this.zza);
    }

    public zzahe(String str, byte[] bArr) {
        super(str);
        this.zza = bArr;
    }
}
