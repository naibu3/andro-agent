package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzcd implements Parcelable {
    public static final Parcelable.Creator<zzcd> CREATOR = new zzcb();
    public final long zza;
    private final zzcc[] zzb;

    public zzcd(long j, zzcc... zzccVarArr) {
        this.zza = j;
        this.zzb = zzccVarArr;
    }

    zzcd(Parcel parcel) {
        this.zzb = new zzcc[parcel.readInt()];
        int i = 0;
        while (true) {
            zzcc[] zzccVarArr = this.zzb;
            if (i >= zzccVarArr.length) {
                this.zza = parcel.readLong();
                return;
            } else {
                zzccVarArr[i] = (zzcc) parcel.readParcelable(zzcc.class.getClassLoader());
                i++;
            }
        }
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
            zzcd zzcdVar = (zzcd) obj;
            if (Arrays.equals(this.zzb, zzcdVar.zzb) && this.zza == zzcdVar.zza) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = Arrays.hashCode(this.zzb) * 31;
        long j = this.zza;
        return iHashCode + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        String str;
        long j = this.zza;
        String string = Arrays.toString(this.zzb);
        if (j == -9223372036854775807L) {
            str = "";
        } else {
            str = ", presentationTimeUs=" + j;
        }
        return "entries=" + string + str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.zzb.length);
        for (zzcc zzccVar : this.zzb) {
            parcel.writeParcelable(zzccVar, 0);
        }
        parcel.writeLong(this.zza);
    }

    public final int zza() {
        return this.zzb.length;
    }

    public final zzcc zzb(int i) {
        return this.zzb[i];
    }

    public final zzcd zzc(zzcc... zzccVarArr) {
        int length = zzccVarArr.length;
        if (length == 0) {
            return this;
        }
        long j = this.zza;
        zzcc[] zzccVarArr2 = this.zzb;
        int i = zzgd.zza;
        int length2 = zzccVarArr2.length;
        Object[] objArrCopyOf = Arrays.copyOf(zzccVarArr2, length2 + length);
        System.arraycopy(zzccVarArr, 0, objArrCopyOf, length2, length);
        return new zzcd(j, (zzcc[]) objArrCopyOf);
    }

    public final zzcd zzd(zzcd zzcdVar) {
        return zzcdVar == null ? this : zzc(zzcdVar.zzb);
    }

    public zzcd(List list) {
        this(-9223372036854775807L, (zzcc[]) list.toArray(new zzcc[0]));
    }
}
