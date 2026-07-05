package com.google.android.gms.internal.ads;

import android.content.Context;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import androidx.core.view.PointerIconCompat;
import com.google.android.gms.location.GeofenceStatusCodes;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzys extends zzdl {
    public static final zzys zzF;

    @Deprecated
    public static final zzys zzG;

    @Deprecated
    public static final zzn zzH;
    private static final String zzX;
    private static final String zzY;
    private static final String zzZ;
    private static final String zzaa;
    private static final String zzab;
    private static final String zzac;
    private static final String zzad;
    private static final String zzae;
    private static final String zzaf;
    private static final String zzag;
    private static final String zzah;
    private static final String zzai;
    private static final String zzaj;
    private static final String zzak;
    private static final String zzal;
    private static final String zzam;
    private static final String zzan;
    private static final String zzao;
    private static final String zzap;
    public final boolean zzI;
    public final boolean zzJ;
    public final boolean zzK;
    public final boolean zzL;
    public final boolean zzM;
    public final boolean zzN;
    public final boolean zzO;
    public final boolean zzP;
    public final boolean zzQ;
    public final boolean zzR;
    public final boolean zzS;
    public final boolean zzT;
    public final boolean zzU;
    public final boolean zzV;
    public final boolean zzW;
    private final SparseArray zzaq;
    private final SparseBooleanArray zzar;

    static {
        zzys zzysVar = new zzys(new zzyq());
        zzF = zzysVar;
        zzG = zzysVar;
        zzX = Integer.toString(1000, 36);
        zzY = Integer.toString(1001, 36);
        zzZ = Integer.toString(1002, 36);
        zzaa = Integer.toString(PointerIconCompat.TYPE_HELP, 36);
        zzab = Integer.toString(1004, 36);
        zzac = Integer.toString(GeofenceStatusCodes.GEOFENCE_REQUEST_TOO_FREQUENT, 36);
        zzad = Integer.toString(PointerIconCompat.TYPE_CELL, 36);
        zzae = Integer.toString(PointerIconCompat.TYPE_CROSSHAIR, 36);
        zzaf = Integer.toString(PointerIconCompat.TYPE_TEXT, 36);
        zzag = Integer.toString(PointerIconCompat.TYPE_VERTICAL_TEXT, 36);
        zzah = Integer.toString(PointerIconCompat.TYPE_ALIAS, 36);
        zzai = Integer.toString(PointerIconCompat.TYPE_COPY, 36);
        zzaj = Integer.toString(PointerIconCompat.TYPE_NO_DROP, 36);
        zzak = Integer.toString(PointerIconCompat.TYPE_ALL_SCROLL, 36);
        zzal = Integer.toString(PointerIconCompat.TYPE_HORIZONTAL_DOUBLE_ARROW, 36);
        zzam = Integer.toString(PointerIconCompat.TYPE_VERTICAL_DOUBLE_ARROW, 36);
        zzan = Integer.toString(PointerIconCompat.TYPE_TOP_RIGHT_DIAGONAL_DOUBLE_ARROW, 36);
        zzao = Integer.toString(PointerIconCompat.TYPE_TOP_LEFT_DIAGONAL_DOUBLE_ARROW, 36);
        zzap = Integer.toString(PointerIconCompat.TYPE_ZOOM_IN, 36);
        zzH = new zzn() { // from class: com.google.android.gms.internal.ads.zzyo
        };
    }

    private zzys(zzyq zzyqVar) {
        super(zzyqVar);
        this.zzI = zzyqVar.zza;
        this.zzJ = false;
        this.zzK = zzyqVar.zzb;
        this.zzL = false;
        this.zzM = zzyqVar.zzc;
        this.zzN = false;
        this.zzO = false;
        this.zzP = false;
        this.zzQ = false;
        this.zzR = zzyqVar.zzd;
        this.zzS = zzyqVar.zze;
        this.zzT = zzyqVar.zzf;
        this.zzU = false;
        this.zzV = zzyqVar.zzg;
        this.zzW = false;
        this.zzaq = zzyqVar.zzh;
        this.zzar = zzyqVar.zzi;
    }

    public static zzys zzd(Context context) {
        return new zzys(new zzyq(context));
    }

    @Override // com.google.android.gms.internal.ads.zzdl
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzys zzysVar = (zzys) obj;
            if (super.equals(zzysVar) && this.zzI == zzysVar.zzI && this.zzK == zzysVar.zzK && this.zzM == zzysVar.zzM && this.zzR == zzysVar.zzR && this.zzS == zzysVar.zzS && this.zzT == zzysVar.zzT && this.zzV == zzysVar.zzV) {
                SparseBooleanArray sparseBooleanArray = this.zzar;
                SparseBooleanArray sparseBooleanArray2 = zzysVar.zzar;
                int size = sparseBooleanArray.size();
                if (sparseBooleanArray2.size() == size) {
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            SparseArray sparseArray = this.zzaq;
                            SparseArray sparseArray2 = zzysVar.zzaq;
                            int size2 = sparseArray.size();
                            if (sparseArray2.size() == size2) {
                                for (int i2 = 0; i2 < size2; i2++) {
                                    int iIndexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i2));
                                    if (iIndexOfKey >= 0) {
                                        Map map = (Map) sparseArray.valueAt(i2);
                                        Map map2 = (Map) sparseArray2.valueAt(iIndexOfKey);
                                        if (map2.size() == map.size()) {
                                            for (Map.Entry entry : map.entrySet()) {
                                                zzxr zzxrVar = (zzxr) entry.getKey();
                                                if (!map2.containsKey(zzxrVar) || !zzgd.zzG(entry.getValue(), map2.get(zzxrVar))) {
                                                }
                                            }
                                        }
                                    }
                                }
                                return true;
                            }
                        } else {
                            if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i)) < 0) {
                                break;
                            }
                            i++;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzdl
    public final int hashCode() {
        return (((((((((((((((super.hashCode() + 31) * 31) + (this.zzI ? 1 : 0)) * 961) + (this.zzK ? 1 : 0)) * 961) + (this.zzM ? 1 : 0)) * 28629151) + (this.zzR ? 1 : 0)) * 31) + (this.zzS ? 1 : 0)) * 31) + (this.zzT ? 1 : 0)) * 961) + (this.zzV ? 1 : 0)) * 31;
    }

    public final zzyq zzc() {
        return new zzyq(this, null);
    }

    @Deprecated
    public final zzyu zze(int i, zzxr zzxrVar) {
        Map map = (Map) this.zzaq.get(i);
        if (map != null) {
            return (zzyu) map.get(zzxrVar);
        }
        return null;
    }

    public final boolean zzf(int i) {
        return this.zzar.get(i);
    }

    @Deprecated
    public final boolean zzg(int i, zzxr zzxrVar) {
        Map map = (Map) this.zzaq.get(i);
        return map != null && map.containsKey(zzxrVar);
    }
}
