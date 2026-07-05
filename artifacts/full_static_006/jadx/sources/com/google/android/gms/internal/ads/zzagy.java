package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
@Deprecated
/* loaded from: classes2.dex */
public class zzagy implements zzcc {
    public static final Parcelable.Creator<zzagy> CREATOR = new zzagx();
    public final String zza;
    public final String zzb;

    protected zzagy(Parcel parcel) {
        String string = parcel.readString();
        int i = zzgd.zza;
        this.zza = string;
        this.zzb = parcel.readString();
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
            zzagy zzagyVar = (zzagy) obj;
            if (this.zza.equals(zzagyVar.zza) && this.zzb.equals(zzagyVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.zza.hashCode() + 527) * 31) + this.zzb.hashCode();
    }

    public final String toString() {
        return "VC: " + this.zza + "=" + this.zzb;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zza);
        parcel.writeString(this.zzb);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0040  */
    @Override // com.google.android.gms.internal.ads.zzcc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(zzby zzbyVar) {
        char c;
        String str = this.zza;
        switch (str.hashCode()) {
            case 62359119:
                if (!str.equals("ALBUM")) {
                    c = 65535;
                    break;
                } else {
                    c = 2;
                    break;
                }
            case 79833656:
                if (str.equals("TITLE")) {
                    c = 0;
                    break;
                }
                break;
            case 428414940:
                if (str.equals("DESCRIPTION")) {
                    c = 4;
                    break;
                }
                break;
            case 1746739798:
                if (str.equals("ALBUMARTIST")) {
                    c = 3;
                    break;
                }
                break;
            case 1939198791:
                if (str.equals("ARTIST")) {
                    c = 1;
                    break;
                }
                break;
        }
        if (c == 0) {
            zzbyVar.zzq(this.zzb);
            return;
        }
        if (c == 1) {
            zzbyVar.zze(this.zzb);
            return;
        }
        if (c == 2) {
            zzbyVar.zzd(this.zzb);
        } else if (c == 3) {
            zzbyVar.zzc(this.zzb);
        } else {
            if (c != 4) {
                return;
            }
            zzbyVar.zzh(this.zzb);
        }
    }

    public zzagy(String str, String str2) {
        this.zza = zzfxm.zzb(str);
        this.zzb = str2;
    }
}
