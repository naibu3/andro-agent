package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.NativeAd;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzbhp extends NativeAd.AdChoicesInfo {
    private final zzbho zza;
    private final List zzb = new ArrayList();
    private String zzc;

    public zzbhp(zzbho zzbhoVar) {
        IBinder iBinder;
        this.zza = zzbhoVar;
        try {
            this.zzc = zzbhoVar.zzg();
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("", e);
            this.zzc = "";
        }
        try {
            for (Object obj : zzbhoVar.zzh()) {
                zzbhv zzbhtVar = null;
                if ((obj instanceof IBinder) && (iBinder = (IBinder) obj) != null) {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
                    zzbhtVar = iInterfaceQueryLocalInterface instanceof zzbhv ? (zzbhv) iInterfaceQueryLocalInterface : new zzbht(iBinder);
                }
                if (zzbhtVar != null) {
                    this.zzb.add(new zzbhw(zzbhtVar));
                }
            }
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("", e2);
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.AdChoicesInfo
    public final List<NativeAd.Image> getImages() {
        return this.zzb;
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.AdChoicesInfo
    public final CharSequence getText() {
        return this.zzc;
    }
}
