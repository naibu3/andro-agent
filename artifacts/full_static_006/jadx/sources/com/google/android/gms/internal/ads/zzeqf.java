package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzeqf implements zzexw {
    private final zzgge zza;
    private final zzgge zzb;
    private final Context zzc;
    private final zzfho zzd;
    private final View zze;

    public zzeqf(zzgge zzggeVar, zzgge zzggeVar2, Context context, zzfho zzfhoVar, ViewGroup viewGroup) {
        this.zza = zzggeVar;
        this.zzb = zzggeVar2;
        this.zzc = context;
        this.zzd = zzfhoVar;
        this.zze = viewGroup;
    }

    private final List zze() {
        ArrayList arrayList = new ArrayList();
        View view = this.zze;
        while (view != null) {
            Object parent = view.getParent();
            if (parent == null) {
                break;
            }
            int iIndexOfChild = parent instanceof ViewGroup ? ((ViewGroup) parent).indexOfChild(view) : -1;
            Bundle bundle = new Bundle();
            bundle.putString("type", parent.getClass().getName());
            bundle.putInt("index_of_child", iIndexOfChild);
            arrayList.add(bundle);
            if (!(parent instanceof View)) {
                break;
            }
            view = (View) parent;
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.zzexw
    public final int zza() {
        return 3;
    }

    @Override // com.google.android.gms.internal.ads.zzexw
    public final ListenableFuture zzb() {
        zzbep.zza(this.zzc);
        return ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzla)).booleanValue() ? this.zzb.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzeqd
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.zzc();
            }
        }) : this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzeqe
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.zzd();
            }
        });
    }

    final /* synthetic */ zzeqg zzc() throws Exception {
        return new zzeqg(this.zzc, this.zzd.zze, zze());
    }

    final /* synthetic */ zzeqg zzd() throws Exception {
        return new zzeqg(this.zzc, this.zzd.zze, zze());
    }
}
