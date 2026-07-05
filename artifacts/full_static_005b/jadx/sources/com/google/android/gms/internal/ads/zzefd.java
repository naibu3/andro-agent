package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.util.SparseArray;
import com.google.android.gms.internal.ads.zzbdv;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzefd extends zzefe {
    private static final SparseArray zzb;
    private final Context zzc;
    private final zzcyp zzd;
    private final TelephonyManager zze;
    private final zzeev zzf;
    private zzbdv.zzq zzg;

    static {
        SparseArray sparseArray = new SparseArray();
        zzb = sparseArray;
        sparseArray.put(NetworkInfo.DetailedState.CONNECTED.ordinal(), zzbdv.zzaf.zzd.CONNECTED);
        sparseArray.put(NetworkInfo.DetailedState.AUTHENTICATING.ordinal(), zzbdv.zzaf.zzd.CONNECTING);
        sparseArray.put(NetworkInfo.DetailedState.CONNECTING.ordinal(), zzbdv.zzaf.zzd.CONNECTING);
        sparseArray.put(NetworkInfo.DetailedState.OBTAINING_IPADDR.ordinal(), zzbdv.zzaf.zzd.CONNECTING);
        sparseArray.put(NetworkInfo.DetailedState.DISCONNECTING.ordinal(), zzbdv.zzaf.zzd.DISCONNECTING);
        sparseArray.put(NetworkInfo.DetailedState.BLOCKED.ordinal(), zzbdv.zzaf.zzd.DISCONNECTED);
        sparseArray.put(NetworkInfo.DetailedState.DISCONNECTED.ordinal(), zzbdv.zzaf.zzd.DISCONNECTED);
        sparseArray.put(NetworkInfo.DetailedState.FAILED.ordinal(), zzbdv.zzaf.zzd.DISCONNECTED);
        sparseArray.put(NetworkInfo.DetailedState.IDLE.ordinal(), zzbdv.zzaf.zzd.DISCONNECTED);
        sparseArray.put(NetworkInfo.DetailedState.SCANNING.ordinal(), zzbdv.zzaf.zzd.DISCONNECTED);
        sparseArray.put(NetworkInfo.DetailedState.SUSPENDED.ordinal(), zzbdv.zzaf.zzd.SUSPENDED);
        sparseArray.put(NetworkInfo.DetailedState.CAPTIVE_PORTAL_CHECK.ordinal(), zzbdv.zzaf.zzd.CONNECTING);
        sparseArray.put(NetworkInfo.DetailedState.VERIFYING_POOR_LINK.ordinal(), zzbdv.zzaf.zzd.CONNECTING);
    }

    zzefd(Context context, zzcyp zzcypVar, zzeev zzeevVar, zzeer zzeerVar, com.google.android.gms.ads.internal.util.zzg zzgVar) {
        super(zzeerVar, zzgVar);
        this.zzc = context;
        this.zzd = zzcypVar;
        this.zzf = zzeevVar;
        this.zze = (TelephonyManager) context.getSystemService("phone");
    }

    static /* bridge */ /* synthetic */ zzbdv.zzab zza(zzefd zzefdVar, Bundle bundle) {
        zzbdv.zzab.zzb zzbVar;
        zzbdv.zzab.zza zzaVarZza = zzbdv.zzab.zza();
        int i = bundle.getInt("cnt", -2);
        int i2 = bundle.getInt("gnt", 0);
        if (i == -1) {
            zzefdVar.zzg = zzbdv.zzq.ENUM_TRUE;
        } else {
            zzefdVar.zzg = zzbdv.zzq.ENUM_FALSE;
            if (i == 0) {
                zzaVarZza.zzd(zzbdv.zzab.zzc.CELL);
            } else if (i != 1) {
                zzaVarZza.zzd(zzbdv.zzab.zzc.NETWORKTYPE_UNSPECIFIED);
            } else {
                zzaVarZza.zzd(zzbdv.zzab.zzc.WIFI);
            }
            switch (i2) {
                case 1:
                case 2:
                case 4:
                case 7:
                case 11:
                case 16:
                    zzbVar = zzbdv.zzab.zzb.TWO_G;
                    break;
                case 3:
                case 5:
                case 6:
                case 8:
                case 9:
                case 10:
                case 12:
                case 14:
                case 15:
                case 17:
                    zzbVar = zzbdv.zzab.zzb.THREE_G;
                    break;
                case 13:
                    zzbVar = zzbdv.zzab.zzb.LTE;
                    break;
                default:
                    zzbVar = zzbdv.zzab.zzb.CELLULAR_NETWORK_TYPE_UNSPECIFIED;
                    break;
            }
            zzaVarZza.zzc(zzbVar);
        }
        return zzaVarZza.zzbr();
    }

    static /* bridge */ /* synthetic */ zzbdv.zzaf.zzd zzb(zzefd zzefdVar, Bundle bundle) {
        return (zzbdv.zzaf.zzd) zzb.get(zzfic.zza(zzfic.zza(bundle, "device"), "network").getInt("active_network_state", -1), zzbdv.zzaf.zzd.UNSPECIFIED);
    }

    static /* bridge */ /* synthetic */ byte[] zze(zzefd zzefdVar, boolean z, ArrayList arrayList, zzbdv.zzab zzabVar, zzbdv.zzaf.zzd zzdVar) {
        zzbdv.zzaf.zza.C0016zza c0016zzaZzn = zzbdv.zzaf.zza.zzn();
        c0016zzaZzn.zzn(arrayList);
        c0016zzaZzn.zzD(zzg(Settings.Global.getInt(zzefdVar.zzc.getContentResolver(), "airplane_mode_on", 0) != 0));
        c0016zzaZzn.zzE(com.google.android.gms.ads.internal.zzu.zzq().zzg(zzefdVar.zzc, zzefdVar.zze));
        c0016zzaZzn.zzM(zzefdVar.zzf.zze());
        c0016zzaZzn.zzL(zzefdVar.zzf.zzb());
        c0016zzaZzn.zzG(zzefdVar.zzf.zza());
        c0016zzaZzn.zzH(zzdVar);
        c0016zzaZzn.zzJ(zzabVar);
        c0016zzaZzn.zzK(zzefdVar.zzg);
        c0016zzaZzn.zzN(zzg(z));
        c0016zzaZzn.zzP(zzefdVar.zzf.zzd());
        c0016zzaZzn.zzO(com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis());
        c0016zzaZzn.zzQ(zzg(Settings.Global.getInt(zzefdVar.zzc.getContentResolver(), "wifi_on", 0) != 0));
        return c0016zzaZzn.zzbr().zzaV();
    }

    private static final zzbdv.zzq zzg(boolean z) {
        return z ? zzbdv.zzq.ENUM_TRUE : zzbdv.zzq.ENUM_FALSE;
    }

    public final void zzd(boolean z) {
        zzgft.zzr(this.zzd.zzb(new Bundle()), new zzefc(this, z), zzcci.zzf);
    }
}
