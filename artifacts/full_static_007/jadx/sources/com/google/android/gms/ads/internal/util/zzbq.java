package com.google.android.gms.ads.internal.util;

import android.content.Context;
import androidx.browser.trusted.sharing.ShareTarget;
import com.google.android.gms.common.util.ClientLibraryUtils;
import com.google.android.gms.internal.ads.zzaqm;
import com.google.android.gms.internal.ads.zzarh;
import com.google.android.gms.internal.ads.zzasl;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzccn;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzbq {
    private static zzarh zzb;
    private static final Object zzc = new Object();

    @Deprecated
    public static final zzbl zza = new zzbi();

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034 A[Catch: all -> 0x003d, TryCatch #0 {, blocks: (B:7:0x0010, B:9:0x0014, B:11:0x001d, B:13:0x002f, B:15:0x0039, B:14:0x0034, B:16:0x003b), top: B:21:0x0010 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzbq(Context context) {
        context = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        synchronized (zzc) {
            if (zzb == null) {
                zzbep.zza(context);
                if (!ClientLibraryUtils.isPackageSide()) {
                    zzarh zzarhVarZzb = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzew)).booleanValue() ? zzaz.zzb(context) : zzasl.zza(context, null);
                    zzb = zzarhVarZzb;
                }
            }
        }
    }

    public final ListenableFuture zza(String str) {
        zzccn zzccnVar = new zzccn();
        zzb.zza(new zzbp(str, null, zzccnVar));
        return zzccnVar;
    }

    public final ListenableFuture zzb(int i, String str, Map map, byte[] bArr) {
        zzbn zzbnVar = new zzbn(null);
        zzbj zzbjVar = new zzbj(this, str, zzbnVar);
        com.google.android.gms.ads.internal.util.client.zzl zzlVar = new com.google.android.gms.ads.internal.util.client.zzl(null);
        zzbk zzbkVar = new zzbk(this, i, str, zzbnVar, zzbjVar, bArr, map, zzlVar);
        if (com.google.android.gms.ads.internal.util.client.zzl.zzk()) {
            try {
                zzlVar.zzd(str, ShareTarget.METHOD_GET, zzbkVar.zzl(), zzbkVar.zzx());
            } catch (zzaqm e) {
                com.google.android.gms.ads.internal.util.client.zzm.zzj(e.getMessage());
            }
        }
        zzb.zza(zzbkVar);
        return zzbnVar;
    }
}
