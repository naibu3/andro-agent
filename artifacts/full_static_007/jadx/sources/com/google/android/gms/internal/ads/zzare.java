package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.util.Collections;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public abstract class zzare implements Comparable {
    private final zzarp zza;
    private final int zzb;
    private final String zzc;
    private final int zzd;
    private final Object zze;
    private final zzari zzf;
    private Integer zzg;
    private zzarh zzh;
    private boolean zzi;
    private zzaqn zzj;
    private zzard zzk;
    private final zzaqs zzl;

    public zzare(int i, String str, zzari zzariVar) {
        Uri uri;
        String host;
        this.zza = zzarp.zza ? new zzarp() : null;
        this.zze = new Object();
        int iHashCode = 0;
        this.zzi = false;
        this.zzj = null;
        this.zzb = i;
        this.zzc = str;
        this.zzf = zzariVar;
        this.zzl = new zzaqs();
        if (!TextUtils.isEmpty(str) && (uri = Uri.parse(str)) != null && (host = uri.getHost()) != null) {
            iHashCode = host.hashCode();
        }
        this.zzd = iHashCode;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.zzg.intValue() - ((zzare) obj).zzg.intValue();
    }

    public final String toString() {
        String strValueOf = String.valueOf(Integer.toHexString(this.zzd));
        zzw();
        return "[ ] " + this.zzc + " " + "0x".concat(strValueOf) + " NORMAL " + this.zzg;
    }

    public final int zza() {
        return this.zzb;
    }

    public final int zzb() {
        return this.zzl.zzb();
    }

    public final int zzc() {
        return this.zzd;
    }

    public final zzaqn zzd() {
        return this.zzj;
    }

    public final zzare zze(zzaqn zzaqnVar) {
        this.zzj = zzaqnVar;
        return this;
    }

    public final zzare zzf(zzarh zzarhVar) {
        this.zzh = zzarhVar;
        return this;
    }

    public final zzare zzg(int i) {
        this.zzg = Integer.valueOf(i);
        return this;
    }

    protected abstract zzark zzh(zzara zzaraVar);

    public final String zzj() {
        int i = this.zzb;
        String str = this.zzc;
        if (i == 0) {
            return str;
        }
        return Integer.toString(1) + "-" + str;
    }

    public final String zzk() {
        return this.zzc;
    }

    public Map zzl() throws zzaqm {
        return Collections.emptyMap();
    }

    public final void zzm(String str) {
        if (zzarp.zza) {
            this.zza.zza(str, Thread.currentThread().getId());
        }
    }

    public final void zzn(zzarn zzarnVar) {
        zzari zzariVar;
        synchronized (this.zze) {
            zzariVar = this.zzf;
        }
        zzariVar.zza(zzarnVar);
    }

    protected abstract void zzo(Object obj);

    final void zzp(String str) {
        zzarh zzarhVar = this.zzh;
        if (zzarhVar != null) {
            zzarhVar.zzb(this);
        }
        if (zzarp.zza) {
            long id = Thread.currentThread().getId();
            if (Looper.myLooper() != Looper.getMainLooper()) {
                new Handler(Looper.getMainLooper()).post(new zzarc(this, str, id));
            } else {
                this.zza.zza(str, id);
                this.zza.zzb(toString());
            }
        }
    }

    public final void zzq() {
        synchronized (this.zze) {
            this.zzi = true;
        }
    }

    final void zzr() {
        zzard zzardVar;
        synchronized (this.zze) {
            zzardVar = this.zzk;
        }
        if (zzardVar != null) {
            zzardVar.zza(this);
        }
    }

    final void zzs(zzark zzarkVar) {
        zzard zzardVar;
        synchronized (this.zze) {
            zzardVar = this.zzk;
        }
        if (zzardVar != null) {
            zzardVar.zzb(this, zzarkVar);
        }
    }

    final void zzt(int i) {
        zzarh zzarhVar = this.zzh;
        if (zzarhVar != null) {
            zzarhVar.zzc(this, i);
        }
    }

    final void zzu(zzard zzardVar) {
        synchronized (this.zze) {
            this.zzk = zzardVar;
        }
    }

    public final boolean zzv() {
        boolean z;
        synchronized (this.zze) {
            z = this.zzi;
        }
        return z;
    }

    public final boolean zzw() {
        synchronized (this.zze) {
        }
        return false;
    }

    public byte[] zzx() throws zzaqm {
        return null;
    }

    public final zzaqs zzy() {
        return this.zzl;
    }
}
