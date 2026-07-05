package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import java.util.concurrent.Future;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzbdi {
    private zzbcx zza;
    private boolean zzb;
    private final Context zzc;
    private final Object zzd = new Object();

    zzbdi(Context context) {
        this.zzc = context;
    }

    final Future zzc(zzbcy zzbcyVar) {
        zzbdc zzbdcVar = new zzbdc(this);
        zzbdg zzbdgVar = new zzbdg(this, zzbcyVar, zzbdcVar);
        zzbdh zzbdhVar = new zzbdh(this, zzbdcVar);
        synchronized (this.zzd) {
            zzbcx zzbcxVar = new zzbcx(this.zzc, com.google.android.gms.ads.internal.zzu.zzt().zzb(), zzbdgVar, zzbdhVar);
            this.zza = zzbcxVar;
            zzbcxVar.checkAvailabilityAndConnect();
        }
        return zzbdcVar;
    }

    static /* bridge */ /* synthetic */ void zze(zzbdi zzbdiVar) {
        synchronized (zzbdiVar.zzd) {
            zzbcx zzbcxVar = zzbdiVar.zza;
            if (zzbcxVar == null) {
                return;
            }
            zzbcxVar.disconnect();
            zzbdiVar.zza = null;
            Binder.flushPendingCommands();
        }
    }
}
