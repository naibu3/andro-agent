package com.google.android.gms.internal.ads;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzazr {
    protected static final String zza = "zzazr";
    private final zzaye zzb;
    private final String zzc;
    private final String zzd;
    private final Class[] zzf;
    private volatile Method zze = null;
    private final CountDownLatch zzg = new CountDownLatch(1);

    public zzazr(zzaye zzayeVar, String str, String str2, Class... clsArr) {
        this.zzb = zzayeVar;
        this.zzc = str;
        this.zzd = str2;
        this.zzf = clsArr;
        zzayeVar.zzk().submit(new zzazq(this));
    }

    static /* bridge */ /* synthetic */ void zzb(zzazr zzazrVar) {
        try {
            zzaye zzayeVar = zzazrVar.zzb;
            Class clsLoadClass = zzayeVar.zzi().loadClass(zzazrVar.zzc(zzayeVar.zzu(), zzazrVar.zzc));
            if (clsLoadClass != null) {
                zzazrVar.zze = clsLoadClass.getMethod(zzazrVar.zzc(zzazrVar.zzb.zzu(), zzazrVar.zzd), zzazrVar.zzf);
                Method method = zzazrVar.zze;
            }
        } catch (zzaxi | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException | NullPointerException unused) {
        } catch (Throwable th) {
            zzazrVar.zzg.countDown();
            throw th;
        }
        zzazrVar.zzg.countDown();
    }

    private final String zzc(byte[] bArr, String str) throws zzaxi, UnsupportedEncodingException {
        return new String(this.zzb.zze().zzb(bArr, str), "UTF-8");
    }

    public final Method zza() {
        if (this.zze != null) {
            return this.zze;
        }
        try {
            if (this.zzg.await(2L, TimeUnit.SECONDS)) {
                return this.zze;
            }
            return null;
        } catch (InterruptedException unused) {
            return null;
        }
    }
}
