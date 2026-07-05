package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzcqp implements zzczl, zzdaz, zzdaf, com.google.android.gms.ads.internal.client.zza, zzdab, zzdgz {
    private final Context zza;
    private final Executor zzb;
    private final Executor zzc;
    private final ScheduledExecutorService zzd;
    private final zzfhf zze;
    private final zzfgt zzf;
    private final zzfoa zzg;
    private final zzfia zzh;
    private final zzaxd zzi;
    private final zzbfs zzj;
    private final zzfmn zzk;
    private final WeakReference zzl;
    private final WeakReference zzm;
    private final zzcyn zzn;
    private boolean zzo;
    private final AtomicBoolean zzp = new AtomicBoolean();
    private final zzbfu zzq;

    zzcqp(Context context, Executor executor, Executor executor2, ScheduledExecutorService scheduledExecutorService, zzfhf zzfhfVar, zzfgt zzfgtVar, zzfoa zzfoaVar, zzfia zzfiaVar, View view, zzchd zzchdVar, zzaxd zzaxdVar, zzbfs zzbfsVar, zzbfu zzbfuVar, zzfmn zzfmnVar, zzcyn zzcynVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = executor2;
        this.zzd = scheduledExecutorService;
        this.zze = zzfhfVar;
        this.zzf = zzfgtVar;
        this.zzg = zzfoaVar;
        this.zzh = zzfiaVar;
        this.zzi = zzaxdVar;
        this.zzl = new WeakReference(view);
        this.zzm = new WeakReference(zzchdVar);
        this.zzj = zzbfsVar;
        this.zzq = zzbfuVar;
        this.zzk = zzfmnVar;
        this.zzn = zzcynVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List zzu() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzls)).booleanValue()) {
            com.google.android.gms.ads.internal.zzu.zzp();
            if (com.google.android.gms.ads.internal.util.zzt.zzB(this.zza)) {
                com.google.android.gms.ads.internal.zzu.zzp();
                Integer numZzs = com.google.android.gms.ads.internal.util.zzt.zzs(this.zza);
                if (numZzs != null) {
                    Integer numValueOf = Integer.valueOf(Math.min(numZzs.intValue(), 20));
                    ArrayList arrayList = new ArrayList();
                    Iterator it = this.zzf.zzd.iterator();
                    while (it.hasNext()) {
                        arrayList.add(Uri.parse((String) it.next()).buildUpon().appendQueryParameter("dspct", Integer.toString(numValueOf.intValue())).toString());
                    }
                    return arrayList;
                }
            }
        }
        return this.zzf.zzd;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzv() {
        String strZzh;
        int i;
        List list = this.zzf.zzd;
        if (list == null || list.isEmpty()) {
            return;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzdx)).booleanValue()) {
            strZzh = this.zzi.zzc().zzh(this.zza, (View) this.zzl.get(), null);
        } else {
            strZzh = null;
        }
        if ((((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzao)).booleanValue() && this.zze.zzb.zzb.zzg) || !((Boolean) zzbgj.zzh.zze()).booleanValue()) {
            this.zzh.zza(this.zzg.zzd(this.zze, this.zzf, false, strZzh, null, zzu()));
            return;
        }
        if (((Boolean) zzbgj.zzg.zze()).booleanValue() && ((i = this.zzf.zzb) == 1 || i == 2 || i == 5)) {
        }
        zzgft.zzr((zzgfk) zzgft.zzo(zzgfk.zzu(zzgft.zzh(null)), ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzaW)).longValue(), TimeUnit.MILLISECONDS, this.zzd), new zzcqo(this, strZzh), this.zzb);
    }

    private final void zzw(final int i, final int i2) {
        View view;
        if (i <= 0 || !((view = (View) this.zzl.get()) == null || view.getHeight() == 0 || view.getWidth() == 0)) {
            zzv();
        } else {
            this.zzd.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcqm
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzp(i, i2);
                }
            }, i2, TimeUnit.MILLISECONDS);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        if (!(((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzao)).booleanValue() && this.zze.zzb.zzb.zzg) && ((Boolean) zzbgj.zzd.zze()).booleanValue()) {
            zzgft.zzr(zzgft.zze(zzgfk.zzu(this.zzj.zza()), Throwable.class, new zzfxu() { // from class: com.google.android.gms.internal.ads.zzcqj
                @Override // com.google.android.gms.internal.ads.zzfxu
                public final Object apply(Object obj) {
                    return "failure_click_attok";
                }
            }, zzcci.zzf), new zzcqn(this), this.zzb);
            return;
        }
        zzfia zzfiaVar = this.zzh;
        zzfoa zzfoaVar = this.zzg;
        zzfhf zzfhfVar = this.zze;
        zzfgt zzfgtVar = this.zzf;
        zzfiaVar.zzc(zzfoaVar.zzc(zzfhfVar, zzfgtVar, zzfgtVar.zzc), true == com.google.android.gms.ads.internal.zzu.zzo().zzA(this.zza) ? 2 : 1);
    }

    @Override // com.google.android.gms.internal.ads.zzczl
    public final void zza() {
    }

    @Override // com.google.android.gms.internal.ads.zzczl
    public final void zzb() {
    }

    @Override // com.google.android.gms.internal.ads.zzczl
    public final void zzc() {
    }

    @Override // com.google.android.gms.internal.ads.zzczl
    public final void zzds(zzbyh zzbyhVar, String str, String str2) {
        zzfoa zzfoaVar = this.zzg;
        zzfgt zzfgtVar = this.zzf;
        this.zzh.zza(zzfoaVar.zze(zzfgtVar, zzfgtVar.zzi, zzbyhVar));
    }

    @Override // com.google.android.gms.internal.ads.zzczl
    public final void zze() {
        zzfoa zzfoaVar = this.zzg;
        zzfhf zzfhfVar = this.zze;
        zzfgt zzfgtVar = this.zzf;
        this.zzh.zza(zzfoaVar.zzc(zzfhfVar, zzfgtVar, zzfgtVar.zzj));
    }

    @Override // com.google.android.gms.internal.ads.zzczl
    public final void zzf() {
        zzfoa zzfoaVar = this.zzg;
        zzfhf zzfhfVar = this.zze;
        zzfgt zzfgtVar = this.zzf;
        this.zzh.zza(zzfoaVar.zzc(zzfhfVar, zzfgtVar, zzfgtVar.zzh));
    }

    final /* synthetic */ void zzn() {
        this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcql
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzv();
            }
        });
    }

    final /* synthetic */ void zzo(int i, int i2) {
        zzw(i - 1, i2);
    }

    final /* synthetic */ void zzp(final int i, final int i2) {
        this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcqk
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzo(i, i2);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdab
    public final void zzq(com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzbw)).booleanValue()) {
            this.zzh.zza(this.zzg.zzc(this.zze, this.zzf, zzfoa.zzf(2, zzeVar.zza, this.zzf.zzp)));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdaf
    public final void zzr() {
        if (this.zzp.compareAndSet(false, true)) {
            int iIntValue = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzdG)).intValue();
            if (iIntValue > 0) {
                zzw(iIntValue, ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzdH)).intValue());
                return;
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzdF)).booleanValue()) {
                this.zzc.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcqi
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.zza.zzn();
                    }
                });
            } else {
                zzv();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdaz
    public final synchronized void zzs() {
        zzcyn zzcynVar;
        if (this.zzo) {
            ArrayList arrayList = new ArrayList(zzu());
            arrayList.addAll(this.zzf.zzg);
            this.zzh.zza(this.zzg.zzd(this.zze, this.zzf, true, null, null, arrayList));
        } else {
            zzfia zzfiaVar = this.zzh;
            zzfoa zzfoaVar = this.zzg;
            zzfhf zzfhfVar = this.zze;
            zzfgt zzfgtVar = this.zzf;
            zzfiaVar.zza(zzfoaVar.zzc(zzfhfVar, zzfgtVar, zzfgtVar.zzn));
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzdC)).booleanValue() && (zzcynVar = this.zzn) != null) {
                List listZzh = zzfoa.zzh(zzfoa.zzg(zzcynVar.zzb().zzn, zzcynVar.zza().zzg()), this.zzn.zza().zza());
                zzfia zzfiaVar2 = this.zzh;
                zzfoa zzfoaVar2 = this.zzg;
                zzcyn zzcynVar2 = this.zzn;
                zzfiaVar2.zza(zzfoaVar2.zzc(zzcynVar2.zzc(), zzcynVar2.zzb(), listZzh));
            }
            zzfia zzfiaVar3 = this.zzh;
            zzfoa zzfoaVar3 = this.zzg;
            zzfhf zzfhfVar2 = this.zze;
            zzfgt zzfgtVar2 = this.zzf;
            zzfiaVar3.zza(zzfoaVar3.zzc(zzfhfVar2, zzfgtVar2, zzfgtVar2.zzg));
        }
        this.zzo = true;
    }

    @Override // com.google.android.gms.internal.ads.zzdgz
    public final void zzt() {
        zzfoa zzfoaVar = this.zzg;
        zzfhf zzfhfVar = this.zze;
        zzfgt zzfgtVar = this.zzf;
        this.zzh.zza(zzfoaVar.zzc(zzfhfVar, zzfgtVar, zzfgtVar.zzav));
    }
}
