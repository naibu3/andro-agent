package com.google.android.gms.internal.ads;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzage extends zzagg {
    private long zzb;
    private long[] zzc;
    private long[] zzd;

    public zzage() {
        super(new zzadt());
        this.zzb = -9223372036854775807L;
        this.zzc = new long[0];
        this.zzd = new long[0];
    }

    private static Double zzg(zzfu zzfuVar) {
        return Double.valueOf(Double.longBitsToDouble(zzfuVar.zzt()));
    }

    private static String zzi(zzfu zzfuVar) {
        int iZzq = zzfuVar.zzq();
        int iZzd = zzfuVar.zzd();
        zzfuVar.zzL(iZzq);
        return new String(zzfuVar.zzM(), iZzd, iZzq);
    }

    private static HashMap zzj(zzfu zzfuVar) {
        int iZzp = zzfuVar.zzp();
        HashMap map = new HashMap(iZzp);
        for (int i = 0; i < iZzp; i++) {
            String strZzi = zzi(zzfuVar);
            Object objZzh = zzh(zzfuVar, zzfuVar.zzm());
            if (objZzh != null) {
                map.put(strZzi, objZzh);
            }
        }
        return map;
    }

    @Override // com.google.android.gms.internal.ads.zzagg
    protected final boolean zza(zzfu zzfuVar) {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzagg
    protected final boolean zzb(zzfu zzfuVar, long j) {
        if (zzfuVar.zzm() == 2 && "onMetaData".equals(zzi(zzfuVar)) && zzfuVar.zzb() != 0 && zzfuVar.zzm() == 8) {
            HashMap mapZzj = zzj(zzfuVar);
            Object obj = mapZzj.get(TypedValues.TransitionType.S_DURATION);
            if (obj instanceof Double) {
                double dDoubleValue = ((Double) obj).doubleValue();
                if (dDoubleValue > 0.0d) {
                    this.zzb = (long) (dDoubleValue * 1000000.0d);
                }
            }
            Object obj2 = mapZzj.get("keyframes");
            if (obj2 instanceof Map) {
                Map map = (Map) obj2;
                Object obj3 = map.get("filepositions");
                Object obj4 = map.get("times");
                if ((obj3 instanceof List) && (obj4 instanceof List)) {
                    List list = (List) obj3;
                    List list2 = (List) obj4;
                    int size = list2.size();
                    this.zzc = new long[size];
                    this.zzd = new long[size];
                    for (int i = 0; i < size; i++) {
                        Object obj5 = list.get(i);
                        Object obj6 = list2.get(i);
                        if (!(obj6 instanceof Double) || !(obj5 instanceof Double)) {
                            this.zzc = new long[0];
                            this.zzd = new long[0];
                            break;
                        }
                        this.zzc[i] = (long) (((Double) obj6).doubleValue() * 1000000.0d);
                        this.zzd[i] = ((Double) obj5).longValue();
                    }
                }
            }
        }
        return false;
    }

    public final long zzc() {
        return this.zzb;
    }

    public final long[] zzd() {
        return this.zzd;
    }

    public final long[] zze() {
        return this.zzc;
    }

    private static Object zzh(zzfu zzfuVar, int i) {
        if (i == 0) {
            return zzg(zzfuVar);
        }
        if (i == 1) {
            return Boolean.valueOf(zzfuVar.zzm() == 1);
        }
        if (i == 2) {
            return zzi(zzfuVar);
        }
        if (i != 3) {
            if (i == 8) {
                return zzj(zzfuVar);
            }
            if (i != 10) {
                if (i != 11) {
                    return null;
                }
                Date date = new Date((long) zzg(zzfuVar).doubleValue());
                zzfuVar.zzL(2);
                return date;
            }
            int iZzp = zzfuVar.zzp();
            ArrayList arrayList = new ArrayList(iZzp);
            for (int i2 = 0; i2 < iZzp; i2++) {
                Object objZzh = zzh(zzfuVar, zzfuVar.zzm());
                if (objZzh != null) {
                    arrayList.add(objZzh);
                }
            }
            return arrayList;
        }
        HashMap map = new HashMap();
        while (true) {
            String strZzi = zzi(zzfuVar);
            int iZzm = zzfuVar.zzm();
            if (iZzm == 9) {
                return map;
            }
            Object objZzh2 = zzh(zzfuVar, iZzm);
            if (objZzh2 != null) {
                map.put(strZzi, objZzh2);
            }
        }
    }
}
