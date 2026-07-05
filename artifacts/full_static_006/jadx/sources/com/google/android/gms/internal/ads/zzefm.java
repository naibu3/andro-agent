package com.google.android.gms.internal.ads;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.ads.zzbdv;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzefm {
    private final zzbdm zza;
    private final Context zzb;
    private final zzeer zzc;
    private final VersionInfoParcel zzd;

    public zzefm(Context context, VersionInfoParcel versionInfoParcel, zzbdm zzbdmVar, zzeer zzeerVar) {
        this.zzb = context;
        this.zzd = versionInfoParcel;
        this.zza = zzbdmVar;
        this.zzc = zzeerVar;
    }

    public final void zzb(final boolean z) {
        try {
            this.zzc.zza(new zzfkw() { // from class: com.google.android.gms.internal.ads.zzefj
                @Override // com.google.android.gms.internal.ads.zzfkw
                public final Object zza(Object obj) throws Exception {
                    this.zza.zza(z, (SQLiteDatabase) obj);
                    return null;
                }
            });
        } catch (Exception e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzg("Error in offline signals database startup: ".concat(String.valueOf(e.getMessage())));
        }
    }

    final /* synthetic */ Void zza(boolean z, SQLiteDatabase sQLiteDatabase) throws Exception {
        if (z) {
            this.zzb.deleteDatabase("OfflineUpload.db");
        } else {
            ArrayList arrayList = new ArrayList();
            Cursor cursorQuery = sQLiteDatabase.query("offline_signal_contents", new String[]{"serialized_proto_data"}, null, null, null, null, null);
            while (cursorQuery.moveToNext()) {
                try {
                    arrayList.add(zzbdv.zzaf.zza.zzx(cursorQuery.getBlob(cursorQuery.getColumnIndexOrThrow("serialized_proto_data"))));
                } catch (zzhcd e) {
                    com.google.android.gms.ads.internal.util.client.zzm.zzg("Unable to deserialize proto from offline signals database:");
                    com.google.android.gms.ads.internal.util.client.zzm.zzg(e.getMessage());
                }
            }
            cursorQuery.close();
            Context context = this.zzb;
            zzbdv.zzaf.zzc zzcVarZzi = zzbdv.zzaf.zzi();
            zzcVarZzi.zzv(context.getPackageName());
            zzcVarZzi.zzy(Build.MODEL);
            zzcVarZzi.zzA(zzefg.zza(sQLiteDatabase, 0));
            zzcVarZzi.zzh(arrayList);
            zzcVarZzi.zzE(zzefg.zza(sQLiteDatabase, 1));
            zzcVarZzi.zzx(zzefg.zza(sQLiteDatabase, 3));
            zzcVarZzi.zzF(com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis());
            zzcVarZzi.zzB(zzefg.zzb(sQLiteDatabase, 2));
            final zzbdv.zzaf zzafVarZzbr = zzcVarZzi.zzbr();
            int size = arrayList.size();
            long jZze = 0;
            for (int i = 0; i < size; i++) {
                zzbdv.zzaf.zza zzaVar = (zzbdv.zzaf.zza) arrayList.get(i);
                if (zzaVar.zzk() == zzbdv.zzq.ENUM_TRUE && zzaVar.zze() > jZze) {
                    jZze = zzaVar.zze();
                }
            }
            if (jZze != 0) {
                ContentValues contentValues = new ContentValues();
                contentValues.put(AppMeasurementSdk.ConditionalUserProperty.VALUE, Long.valueOf(jZze));
                sQLiteDatabase.update("offline_signal_statistics", contentValues, "statistic_name = 'last_successful_request_time'", null);
            }
            this.zza.zzc(new zzbdl() { // from class: com.google.android.gms.internal.ads.zzefk
                @Override // com.google.android.gms.internal.ads.zzbdl
                public final void zza(zzbdv.zzt.zza zzaVar2) {
                    zzaVar2.zzW(zzafVarZzbr);
                }
            });
            VersionInfoParcel versionInfoParcel = this.zzd;
            zzbdv.zzar.zza zzaVarZzd = zzbdv.zzar.zzd();
            zzaVarZzd.zzg(versionInfoParcel.buddyApkVersion);
            zzaVarZzd.zzi(this.zzd.clientJarVersion);
            zzaVarZzd.zzh(true != this.zzd.isClientJar ? 2 : 0);
            final zzbdv.zzar zzarVarZzbr = zzaVarZzd.zzbr();
            this.zza.zzc(new zzbdl() { // from class: com.google.android.gms.internal.ads.zzefl
                @Override // com.google.android.gms.internal.ads.zzbdl
                public final void zza(zzbdv.zzt.zza zzaVar2) {
                    zzbdv.zzm.zza zzaVarZzcZ = zzaVar2.zzg().zzcZ();
                    zzaVarZzcZ.zzw(zzarVarZzbr);
                    zzaVar2.zzK(zzaVarZzcZ);
                }
            });
            this.zza.zzb(zzbdo.OFFLINE_UPLOAD);
            zzefg.zze(sQLiteDatabase);
        }
        return null;
    }
}
