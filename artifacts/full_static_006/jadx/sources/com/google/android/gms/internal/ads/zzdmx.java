package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.common.util.Clock;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzdmx implements View.OnClickListener {
    String zza;
    Long zzb;
    WeakReference zzc;
    private final zzdqs zzd;
    private final Clock zze;
    private zzbjp zzf;
    private zzblp zzg;

    public zzdmx(zzdqs zzdqsVar, Clock clock) {
        this.zzd = zzdqsVar;
        this.zze = clock;
    }

    private final void zzd() {
        View view;
        this.zza = null;
        this.zzb = null;
        WeakReference weakReference = this.zzc;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        view.setClickable(false);
        view.setOnClickListener(null);
        this.zzc = null;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        WeakReference weakReference = this.zzc;
        if (weakReference == null || weakReference.get() != view) {
            return;
        }
        if (this.zza != null && this.zzb != null) {
            HashMap map = new HashMap();
            map.put("id", this.zza);
            map.put("time_interval", String.valueOf(this.zze.currentTimeMillis() - this.zzb.longValue()));
            map.put("messageType", "onePointFiveClick");
            this.zzd.zzj("sendMessageToNativeJs", map);
        }
        zzd();
    }

    public final zzbjp zza() {
        return this.zzf;
    }

    public final void zzb() {
        if (this.zzf == null || this.zzb == null) {
            return;
        }
        zzd();
        try {
            this.zzf.zze();
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e);
        }
    }

    public final void zzc(final zzbjp zzbjpVar) {
        this.zzf = zzbjpVar;
        zzblp zzblpVar = this.zzg;
        if (zzblpVar != null) {
            this.zzd.zzn("/unconfirmedClick", zzblpVar);
        }
        zzblp zzblpVar2 = new zzblp() { // from class: com.google.android.gms.internal.ads.zzdmw
            @Override // com.google.android.gms.internal.ads.zzblp
            public final void zza(Object obj, Map map) {
                zzdmx zzdmxVar = this.zza;
                try {
                    zzdmxVar.zzb = Long.valueOf(Long.parseLong((String) map.get("timestamp")));
                } catch (NumberFormatException unused) {
                    com.google.android.gms.ads.internal.util.client.zzm.zzg("Failed to call parse unconfirmedClickTimestamp.");
                }
                zzbjp zzbjpVar2 = zzbjpVar;
                zzdmxVar.zza = (String) map.get("id");
                String str = (String) map.get("asset_id");
                if (zzbjpVar2 == null) {
                    com.google.android.gms.ads.internal.util.client.zzm.zze("Received unconfirmed click but UnconfirmedClickListener is null.");
                    return;
                }
                try {
                    zzbjpVar2.zzf(str);
                } catch (RemoteException e) {
                    com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e);
                }
            }
        };
        this.zzg = zzblpVar2;
        this.zzd.zzl("/unconfirmedClick", zzblpVar2);
    }
}
