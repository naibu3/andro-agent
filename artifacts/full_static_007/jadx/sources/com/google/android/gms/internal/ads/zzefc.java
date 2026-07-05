package com.google.android.gms.internal.ads;

import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import com.google.android.gms.internal.ads.zzbdv;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzefc implements zzgfp {
    final /* synthetic */ boolean zza;
    final /* synthetic */ zzefd zzb;

    zzefc(zzefd zzefdVar, boolean z) {
        this.zza = z;
        this.zzb = zzefdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgfp
    public final void zza(Throwable th) {
        com.google.android.gms.ads.internal.util.client.zzm.zzg("Failed to get signals bundle");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0094  */
    @Override // com.google.android.gms.internal.ads.zzgfp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        List<String> listEmptyList;
        List listAsList;
        char c;
        Bundle bundle = (Bundle) obj;
        if (this.zzb.zzf()) {
            return;
        }
        Object obj2 = bundle.get("ad_types");
        if (obj2 instanceof List) {
            listAsList = (List) obj2;
        } else {
            if (!(obj2 instanceof String[])) {
                listEmptyList = Collections.emptyList();
                final ArrayList arrayList = new ArrayList();
                for (String str : listEmptyList) {
                    switch (str.hashCode()) {
                        case -1396342996:
                            if (str.equals("banner")) {
                                c = 0;
                                break;
                            } else {
                                c = 65535;
                                break;
                            }
                        case -1052618729:
                            if (str.equals("native")) {
                                c = 2;
                                break;
                            }
                            break;
                        case -239580146:
                            if (str.equals("rewarded")) {
                                c = 3;
                                break;
                            }
                            break;
                        case 604727084:
                            if (str.equals("interstitial")) {
                                c = 1;
                                break;
                            }
                            break;
                    }
                    arrayList.add(c != 0 ? c != 1 ? c != 2 ? c != 3 ? zzbdv.zzd.zza.AD_FORMAT_TYPE_UNSPECIFIED : zzbdv.zzd.zza.REWARD_BASED_VIDEO_AD : zzbdv.zzd.zza.NATIVE_APP_INSTALL : zzbdv.zzd.zza.INTERSTITIAL : zzbdv.zzd.zza.BANNER);
                }
                final zzbdv.zzaf.zzd zzdVarZzb = zzefd.zzb(this.zzb, bundle);
                final zzbdv.zzab zzabVarZza = zzefd.zza(this.zzb, bundle);
                zzefd zzefdVar = this.zzb;
                final boolean z = this.zza;
                zzefdVar.zza.zza(new zzfkw() { // from class: com.google.android.gms.internal.ads.zzefb
                    @Override // com.google.android.gms.internal.ads.zzfkw
                    public final Object zza(Object obj3) throws SQLException {
                        zzefc zzefcVar = this.zza;
                        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj3;
                        if (zzefcVar.zzb.zzf()) {
                            return null;
                        }
                        zzbdv.zzaf.zzd zzdVar = zzdVarZzb;
                        zzbdv.zzab zzabVar = zzabVarZza;
                        ArrayList arrayList2 = arrayList;
                        boolean z2 = z;
                        byte[] bArrZze = zzefd.zze(zzefcVar.zzb, z2, arrayList2, zzabVar, zzdVar);
                        zzefg.zzf(sQLiteDatabase, z2, true);
                        zzefg.zzc(sQLiteDatabase, zzefcVar.zzb.zzf.zzd(), bArrZze);
                        return null;
                    }
                });
            }
            listAsList = Arrays.asList((String[]) obj2);
        }
        ArrayList arrayList2 = new ArrayList(listAsList.size());
        for (Object obj3 : listAsList) {
            if (obj3 instanceof String) {
                arrayList2.add((String) obj3);
            }
        }
        listEmptyList = Collections.unmodifiableList(arrayList2);
        final ArrayList arrayList3 = new ArrayList();
        while (r0.hasNext()) {
        }
        final zzbdv.zzaf.zzd zzdVarZzb2 = zzefd.zzb(this.zzb, bundle);
        final zzbdv.zzab zzabVarZza2 = zzefd.zza(this.zzb, bundle);
        zzefd zzefdVar2 = this.zzb;
        final boolean z2 = this.zza;
        zzefdVar2.zza.zza(new zzfkw() { // from class: com.google.android.gms.internal.ads.zzefb
            @Override // com.google.android.gms.internal.ads.zzfkw
            public final Object zza(Object obj32) throws SQLException {
                zzefc zzefcVar = this.zza;
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj32;
                if (zzefcVar.zzb.zzf()) {
                    return null;
                }
                zzbdv.zzaf.zzd zzdVar = zzdVarZzb2;
                zzbdv.zzab zzabVar = zzabVarZza2;
                ArrayList arrayList22 = arrayList3;
                boolean z22 = z2;
                byte[] bArrZze = zzefd.zze(zzefcVar.zzb, z22, arrayList22, zzabVar, zzdVar);
                zzefg.zzf(sQLiteDatabase, z22, true);
                zzefg.zzc(sQLiteDatabase, zzefcVar.zzb.zzf.zzd(), bArrZze);
                return null;
            }
        });
    }
}
