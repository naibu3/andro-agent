package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzfr extends BroadcastReceiver {
    final /* synthetic */ zzfs zza;

    /* synthetic */ zzfr(zzfs zzfsVar, zzfq zzfqVar) {
        this.zza = zzfsVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0039  */
    @Override // android.content.BroadcastReceiver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onReceive(Context context, Intent intent) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        int i = 0;
        if (connectivityManager != null) {
            try {
                NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                    i = 1;
                } else {
                    int type = activeNetworkInfo.getType();
                    if (type == 0) {
                        switch (activeNetworkInfo.getSubtype()) {
                            case 1:
                            case 2:
                                i = 3;
                                break;
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                            case 11:
                            case 12:
                            case 14:
                            case 15:
                            case 17:
                                i = 4;
                                break;
                            case 13:
                                i = 5;
                                break;
                            case 16:
                            case 19:
                            default:
                                i = 6;
                                break;
                            case 18:
                                i = 2;
                                break;
                            case 20:
                                if (zzgd.zza >= 29) {
                                    i = 9;
                                    break;
                                }
                                break;
                        }
                    } else if (type != 1) {
                        if (type != 4 && type != 5) {
                            if (type != 6) {
                                i = type != 9 ? 8 : 7;
                            }
                        }
                    }
                }
            } catch (SecurityException unused) {
            }
        }
        if (zzgd.zza < 31 || i != 5) {
            zzfs.zzc(this.zza, i);
            return;
        }
        zzfs zzfsVar = this.zza;
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            if (telephonyManager == null) {
                throw null;
            }
            zzfp zzfpVar = new zzfp(zzfsVar);
            telephonyManager.registerTelephonyCallback(context.getMainExecutor(), zzfpVar);
            telephonyManager.unregisterTelephonyCallback(zzfpVar);
        } catch (RuntimeException unused2) {
            zzfs.zzc(zzfsVar, 5);
        }
    }
}
