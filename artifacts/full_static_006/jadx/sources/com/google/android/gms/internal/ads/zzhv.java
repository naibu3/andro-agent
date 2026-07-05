package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public class zzhv extends zzhc {
    public final zzhh zzb;
    public final int zzc;

    public zzhv(zzhh zzhhVar, int i, int i2) {
        super(zzb(2008, 1));
        this.zzb = zzhhVar;
        this.zzc = 1;
    }

    public static zzhv zza(IOException iOException, zzhh zzhhVar, int i) {
        String message = iOException.getMessage();
        int i2 = iOException instanceof SocketTimeoutException ? 2002 : iOException instanceof InterruptedIOException ? 1004 : (message == null || !zzfxm.zza(message).matches("cleartext.*not permitted.*")) ? 2001 : 2007;
        return i2 == 2007 ? new zzhu(iOException, zzhhVar) : new zzhv(iOException, zzhhVar, i2, i);
    }

    private static int zzb(int i, int i2) {
        return i == 2000 ? i2 != 1 ? 2000 : 2001 : i;
    }

    public zzhv(IOException iOException, zzhh zzhhVar, int i, int i2) {
        super(iOException, zzb(i, i2));
        this.zzb = zzhhVar;
        this.zzc = i2;
    }

    public zzhv(String str, zzhh zzhhVar, int i, int i2) {
        super(str, zzb(i, i2));
        this.zzb = zzhhVar;
        this.zzc = i2;
    }

    public zzhv(String str, IOException iOException, zzhh zzhhVar, int i, int i2) {
        super(str, iOException, zzb(i, i2));
        this.zzb = zzhhVar;
        this.zzc = i2;
    }
}
