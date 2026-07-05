package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.IBinder;
import android.text.TextUtils;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzfme implements zzfmc {
    private final Context zza;
    private final zzfmu zzb;
    private long zzc = 0;
    private long zzd = -1;
    private boolean zze = false;
    private zzfmw zzf = zzfmw.FORMAT_UNKNOWN;
    private zzfmy zzg = zzfmy.ORIENTATION_UNKNOWN;
    private int zzh = 0;
    private String zzi = "";
    private String zzj = "";
    private String zzk = "";
    private String zzl = "";
    private zzfnc zzm = zzfnc.SCAR_REQUEST_TYPE_UNSPECIFIED;
    private String zzn = "";
    private String zzo = "";
    private String zzp = "";
    private boolean zzq = false;
    private boolean zzr = false;

    zzfme(Context context, zzfmu zzfmuVar) {
        this.zza = context;
        this.zzb = zzfmuVar;
    }

    public final synchronized zzfme zzA() {
        Configuration configuration;
        this.zzh = com.google.android.gms.ads.internal.zzu.zzq().zzm(this.zza);
        Resources resources = this.zza.getResources();
        zzfmy zzfmyVar = (resources == null || (configuration = resources.getConfiguration()) == null) ? zzfmy.ORIENTATION_UNKNOWN : configuration.orientation == 2 ? zzfmy.ORIENTATION_LANDSCAPE : zzfmy.ORIENTATION_PORTRAIT;
        this.zzg = zzfmyVar;
        this.zzc = com.google.android.gms.ads.internal.zzu.zzB().elapsedRealtime();
        this.zzr = true;
        return this;
    }

    public final synchronized zzfme zzB() {
        this.zzd = com.google.android.gms.ads.internal.zzu.zzB().elapsedRealtime();
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfmc
    public final /* bridge */ /* synthetic */ zzfmc zza(com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzr(zzeVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfmc
    public final /* bridge */ /* synthetic */ zzfmc zzb(zzfhe zzfheVar) {
        zzs(zzfheVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfmc
    public final /* bridge */ /* synthetic */ zzfmc zzc(String str) {
        zzt(str);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfmc
    public final /* bridge */ /* synthetic */ zzfmc zzd(zzfmw zzfmwVar) {
        zzu(zzfmwVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfmc
    public final /* bridge */ /* synthetic */ zzfmc zze(String str) {
        zzv(str);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfmc
    public final /* bridge */ /* synthetic */ zzfmc zzf(String str) {
        zzw(str);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfmc
    public final /* bridge */ /* synthetic */ zzfmc zzg(zzfnc zzfncVar) {
        zzx(zzfncVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfmc
    public final /* bridge */ /* synthetic */ zzfmc zzh(boolean z) {
        zzy(z);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfmc
    public final /* bridge */ /* synthetic */ zzfmc zzi(Throwable th) {
        zzz(th);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfmc
    public final /* bridge */ /* synthetic */ zzfmc zzj() {
        zzA();
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfmc
    public final /* bridge */ /* synthetic */ zzfmc zzk() {
        zzB();
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfmc
    public final synchronized boolean zzl() {
        return this.zzr;
    }

    @Override // com.google.android.gms.internal.ads.zzfmc
    public final boolean zzm() {
        return !TextUtils.isEmpty(this.zzk);
    }

    @Override // com.google.android.gms.internal.ads.zzfmc
    public final synchronized zzfmg zzn() {
        zzfmf zzfmfVar = null;
        if (this.zzq) {
            return null;
        }
        this.zzq = true;
        if (!this.zzr) {
            zzA();
        }
        if (this.zzd < 0) {
            zzB();
        }
        return new zzfmg(this, zzfmfVar);
    }

    public final synchronized zzfme zzr(com.google.android.gms.ads.internal.client.zze zzeVar) {
        IBinder iBinder = zzeVar.zze;
        if (iBinder != null) {
            zzcze zzczeVar = (zzcze) iBinder;
            String strZzk = zzczeVar.zzk();
            if (!TextUtils.isEmpty(strZzk)) {
                this.zzi = strZzk;
            }
            String strZzi = zzczeVar.zzi();
            if (!TextUtils.isEmpty(strZzi)) {
                this.zzj = strZzi;
            }
        }
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002b, code lost:
    
        r2.zzj = r0.zzac;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized zzfme zzs(zzfhe zzfheVar) {
        if (!TextUtils.isEmpty(zzfheVar.zzb.zzb)) {
            this.zzi = zzfheVar.zzb.zzb;
        }
        Iterator it = zzfheVar.zza.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            zzfgt zzfgtVar = (zzfgt) it.next();
            if (!TextUtils.isEmpty(zzfgtVar.zzac)) {
                break;
            }
        }
        return this;
    }

    public final synchronized zzfme zzt(String str) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zziP)).booleanValue()) {
            this.zzp = str;
        }
        return this;
    }

    public final synchronized zzfme zzu(zzfmw zzfmwVar) {
        this.zzf = zzfmwVar;
        return this;
    }

    public final synchronized zzfme zzv(String str) {
        this.zzk = str;
        return this;
    }

    public final synchronized zzfme zzw(String str) {
        this.zzl = str;
        return this;
    }

    public final synchronized zzfme zzx(zzfnc zzfncVar) {
        this.zzm = zzfncVar;
        return this;
    }

    public final synchronized zzfme zzy(boolean z) {
        this.zze = z;
        return this;
    }

    public final synchronized zzfme zzz(Throwable th) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zziP)).booleanValue()) {
            this.zzo = zzbwj.zzf(th);
            this.zzn = (String) zzfyt.zzc(zzfxr.zzc('\n')).zzd(zzbwj.zze(th)).iterator().next();
        }
        return this;
    }
}
