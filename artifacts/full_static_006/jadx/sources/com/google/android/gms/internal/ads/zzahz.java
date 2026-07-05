package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzahz extends zzahr {
    public static final Parcelable.Creator<zzahz> CREATOR = new zzahy();
    public final String zza;

    @Deprecated
    public final String zzb;
    public final zzgbc zzc;

    /* JADX WARN: Multi-variable type inference failed */
    public zzahz(String str, String str2, List list) {
        super(str);
        zzeq.zzd(!list.isEmpty());
        this.zza = str2;
        zzgbc zzgbcVarZzk = zzgbc.zzk(list);
        this.zzc = zzgbcVarZzk;
        this.zzb = (String) zzgbcVarZzk.get(0);
    }

    private static List zzb(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            if (str.length() >= 10) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(8, 10))));
            } else if (str.length() >= 7) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
            } else if (str.length() >= 4) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
            }
            return arrayList;
        } catch (NumberFormatException unused) {
            return new ArrayList();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzahz zzahzVar = (zzahz) obj;
            if (zzgd.zzG(this.zzf, zzahzVar.zzf) && zzgd.zzG(this.zza, zzahzVar.zza) && this.zzc.equals(zzahzVar.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.zzf.hashCode() + 527;
        String str = this.zza;
        return (((iHashCode * 31) + (str != null ? str.hashCode() : 0)) * 31) + this.zzc.hashCode();
    }

    @Override // com.google.android.gms.internal.ads.zzahr
    public final String toString() {
        return this.zzf + ": description=" + this.zza + ": values=" + String.valueOf(this.zzc);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zzf);
        parcel.writeString(this.zza);
        parcel.writeStringArray((String[]) this.zzc.toArray(new String[0]));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0108  */
    @Override // com.google.android.gms.internal.ads.zzahr, com.google.android.gms.internal.ads.zzcc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(zzby zzbyVar) throws NumberFormatException {
        switch (this.zzf) {
            case "TT2":
            case "TIT2":
                zzbyVar.zzq((CharSequence) this.zzc.get(0));
                break;
            case "TP1":
            case "TPE1":
                zzbyVar.zze((CharSequence) this.zzc.get(0));
                break;
            case "TP2":
            case "TPE2":
                zzbyVar.zzc((CharSequence) this.zzc.get(0));
                break;
            case "TAL":
            case "TALB":
                zzbyVar.zzd((CharSequence) this.zzc.get(0));
                break;
            case "TRK":
            case "TRCK":
                String str = (String) this.zzc.get(0);
                int i = zzgd.zza;
                String[] strArrSplit = str.split("/", -1);
                try {
                    int i2 = Integer.parseInt(strArrSplit[0]);
                    Integer numValueOf = strArrSplit.length > 1 ? Integer.valueOf(Integer.parseInt(strArrSplit[1])) : null;
                    zzbyVar.zzs(Integer.valueOf(i2));
                    zzbyVar.zzr(numValueOf);
                    break;
                } catch (NumberFormatException unused) {
                    return;
                }
            case "TYE":
            case "TYER":
                try {
                    zzbyVar.zzl(Integer.valueOf(Integer.parseInt((String) this.zzc.get(0))));
                    break;
                } catch (NumberFormatException unused2) {
                    return;
                }
            case "TDA":
            case "TDAT":
                try {
                    String str2 = (String) this.zzc.get(0);
                    int i3 = Integer.parseInt(str2.substring(2, 4));
                    int i4 = Integer.parseInt(str2.substring(0, 2));
                    zzbyVar.zzk(Integer.valueOf(i3));
                    zzbyVar.zzj(Integer.valueOf(i4));
                    break;
                } catch (NumberFormatException | StringIndexOutOfBoundsException unused3) {
                    return;
                }
            case "TDRC":
                List listZzb = zzb((String) this.zzc.get(0));
                int size = listZzb.size();
                if (size != 1) {
                    if (size != 2) {
                        if (size == 3) {
                            zzbyVar.zzj((Integer) listZzb.get(2));
                        }
                    }
                    zzbyVar.zzk((Integer) listZzb.get(1));
                }
                zzbyVar.zzl((Integer) listZzb.get(0));
                break;
            case "TDRL":
                List listZzb2 = zzb((String) this.zzc.get(0));
                int size2 = listZzb2.size();
                if (size2 != 1) {
                    if (size2 != 2) {
                        if (size2 == 3) {
                            zzbyVar.zzm((Integer) listZzb2.get(2));
                        }
                    }
                    zzbyVar.zzn((Integer) listZzb2.get(1));
                }
                zzbyVar.zzo((Integer) listZzb2.get(0));
                break;
            case "TCM":
            case "TCOM":
                zzbyVar.zzf((CharSequence) this.zzc.get(0));
                break;
            case "TP3":
            case "TPE3":
                zzbyVar.zzg((CharSequence) this.zzc.get(0));
                break;
            case "TXT":
            case "TEXT":
                zzbyVar.zzt((CharSequence) this.zzc.get(0));
                break;
        }
    }
}
