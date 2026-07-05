package com.google.android.gms.internal.ads;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzdsc {
    private final zzczj zza;
    private final zzdhg zzb;
    private final zzdas zzc;
    private final zzdbf zzd;
    private final zzdbr zze;
    private final zzdef zzf;
    private final Executor zzg;
    private final zzdhc zzh;
    private final zzcra zzi;
    private final com.google.android.gms.ads.internal.zzb zzj;
    private final zzcaf zzk;
    private final zzaxd zzl;
    private final zzddw zzm;
    private final zzefz zzn;
    private final zzfoe zzo;
    private final zzdvc zzp;
    private final zzcqd zzq;
    private final zzdsi zzr;

    public zzdsc(zzczj zzczjVar, zzdas zzdasVar, zzdbf zzdbfVar, zzdbr zzdbrVar, zzdef zzdefVar, Executor executor, zzdhc zzdhcVar, zzcra zzcraVar, com.google.android.gms.ads.internal.zzb zzbVar, zzcaf zzcafVar, zzaxd zzaxdVar, zzddw zzddwVar, zzefz zzefzVar, zzfoe zzfoeVar, zzdvc zzdvcVar, zzdhg zzdhgVar, zzcqd zzcqdVar, zzdsi zzdsiVar) {
        this.zza = zzczjVar;
        this.zzc = zzdasVar;
        this.zzd = zzdbfVar;
        this.zze = zzdbrVar;
        this.zzf = zzdefVar;
        this.zzg = executor;
        this.zzh = zzdhcVar;
        this.zzi = zzcraVar;
        this.zzj = zzbVar;
        this.zzk = zzcafVar;
        this.zzl = zzaxdVar;
        this.zzm = zzddwVar;
        this.zzn = zzefzVar;
        this.zzo = zzfoeVar;
        this.zzp = zzdvcVar;
        this.zzb = zzdhgVar;
        this.zzq = zzcqdVar;
        this.zzr = zzdsiVar;
    }

    public static final ListenableFuture zzj(zzchd zzchdVar, String str, String str2) {
        final zzccn zzccnVar = new zzccn();
        zzchdVar.zzN().zzB(new zzcit() { // from class: com.google.android.gms.internal.ads.zzdrt
            @Override // com.google.android.gms.internal.ads.zzcit
            public final void zza(boolean z, int i, String str3, String str4) {
                zzccn zzccnVar2 = zzccnVar;
                if (z) {
                    zzccnVar2.zzc(null);
                    return;
                }
                zzccnVar2.zzd(new Exception("Ad Web View failed to load. Error code: " + i + ", Description: " + str3 + ", Failing URL: " + str4));
            }
        });
        zzchdVar.zzae(str, str2, null);
        return zzccnVar;
    }

    final /* synthetic */ void zzc() {
        this.zza.onAdClicked();
    }

    final /* synthetic */ void zzd(String str, String str2) {
        this.zzf.zzb(str, str2);
    }

    final /* synthetic */ void zze() {
        this.zzc.zzb();
    }

    final /* synthetic */ void zzf(View view) {
        this.zzj.zza();
    }

    final /* synthetic */ void zzg(zzchd zzchdVar, zzchd zzchdVar2, Map map) {
        this.zzi.zzh(zzchdVar);
    }

    final /* synthetic */ boolean zzh(View view, MotionEvent motionEvent) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzka)).booleanValue() && motionEvent != null && motionEvent.getAction() == 0) {
            this.zzr.zzb(motionEvent);
        }
        this.zzj.zza();
        if (view == null) {
            return false;
        }
        view.performClick();
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzi(final zzchd zzchdVar, boolean z, zzbls zzblsVar) {
        zzawz zzawzVarZzc;
        zzchdVar.zzN().zzR(new com.google.android.gms.ads.internal.client.zza() { // from class: com.google.android.gms.internal.ads.zzdru
            @Override // com.google.android.gms.ads.internal.client.zza
            public final void onAdClicked() {
                this.zza.zzc();
            }
        }, this.zzd, this.zze, new zzbkh() { // from class: com.google.android.gms.internal.ads.zzdrv
            @Override // com.google.android.gms.internal.ads.zzbkh
            public final void zzb(String str, String str2) {
                this.zza.zzd(str, str2);
            }
        }, new com.google.android.gms.ads.internal.overlay.zzaa() { // from class: com.google.android.gms.internal.ads.zzdrw
            @Override // com.google.android.gms.ads.internal.overlay.zzaa
            public final void zzg() {
                this.zza.zze();
            }
        }, z, zzblsVar, this.zzj, new zzdsb(this), this.zzk, this.zzn, this.zzo, this.zzp, null, this.zzb, null, null, null, this.zzq);
        zzchdVar.setOnTouchListener(new View.OnTouchListener() { // from class: com.google.android.gms.internal.ads.zzdrx
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                this.zza.zzh(view, motionEvent);
                return false;
            }
        });
        zzchdVar.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.gms.internal.ads.zzdry
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.zza.zzf(view);
            }
        });
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzcD)).booleanValue() && (zzawzVarZzc = this.zzl.zzc()) != null) {
            zzawzVarZzc.zzo((View) zzchdVar);
        }
        this.zzh.zzo(zzchdVar, this.zzg);
        this.zzh.zzo(new zzban() { // from class: com.google.android.gms.internal.ads.zzdrz
            @Override // com.google.android.gms.internal.ads.zzban
            public final void zzdp(zzbam zzbamVar) {
                zzciv zzcivVarZzN = zzchdVar.zzN();
                Rect rect = zzbamVar.zzd;
                zzcivVarZzN.zzq(rect.left, rect.top, false);
            }
        }, this.zzg);
        this.zzh.zza((View) zzchdVar);
        zzchdVar.zzag("/trackActiveViewUnit", new zzblp() { // from class: com.google.android.gms.internal.ads.zzdsa
            @Override // com.google.android.gms.internal.ads.zzblp
            public final void zza(Object obj, Map map) {
                this.zza.zzg(zzchdVar, (zzchd) obj, map);
            }
        });
        this.zzi.zzi(zzchdVar);
    }
}
