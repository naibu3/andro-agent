package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzftk {
    final zzftn zza;
    final boolean zzb;

    private zzftk(zzftn zzftnVar) {
        this.zza = zzftnVar;
        this.zzb = zzftnVar != null;
    }

    public static zzftk zzb(Context context, String str, String str2) throws zzfsm {
        zzftn zzftlVar;
        try {
            try {
                try {
                    IBinder iBinderInstantiate = DynamiteModule.load(context, DynamiteModule.PREFER_REMOTE, ModuleDescriptor.MODULE_ID).instantiate("com.google.android.gms.gass.internal.clearcut.GassDynamiteClearcutLogger");
                    if (iBinderInstantiate == null) {
                        zzftlVar = null;
                    } else {
                        IInterface iInterfaceQueryLocalInterface = iBinderInstantiate.queryLocalInterface("com.google.android.gms.gass.internal.clearcut.IGassClearcut");
                        zzftlVar = iInterfaceQueryLocalInterface instanceof zzftn ? (zzftn) iInterfaceQueryLocalInterface : new zzftl(iBinderInstantiate);
                    }
                    zzftlVar.zze(ObjectWrapper.wrap(context), str, null);
                    Log.i("GASS", "GassClearcutLogger Initialized.");
                    return new zzftk(zzftlVar);
                } catch (Exception e) {
                    throw new zzfsm(e);
                }
            } catch (RemoteException | zzfsm | NullPointerException | SecurityException unused) {
                Log.d("GASS", "Cannot dynamite load clearcut");
                return new zzftk(new zzfto());
            }
        } catch (Exception e2) {
            throw new zzfsm(e2);
        }
    }

    public static zzftk zzc() {
        zzfto zzftoVar = new zzfto();
        Log.d("GASS", "Clearcut logging disabled");
        return new zzftk(zzftoVar);
    }

    public final zzftj zza(byte[] bArr) {
        return new zzftj(this, bArr, null);
    }
}
