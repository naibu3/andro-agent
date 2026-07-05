package com.google.android.gms.internal.ads;

import org.apache.cordova.networkinformation.NetworkManager;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public enum zzfop {
    CTV("ctv"),
    MOBILE(NetworkManager.MOBILE),
    OTHER("other");

    private final String zze;

    zzfop(String str) {
        this.zze = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.zze;
    }
}
