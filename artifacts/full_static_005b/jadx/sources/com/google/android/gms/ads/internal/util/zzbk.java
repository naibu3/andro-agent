package com.google.android.gms.ads.internal.util;

import com.google.android.gms.internal.ads.zzaqm;
import com.google.android.gms.internal.ads.zzari;
import com.google.android.gms.internal.ads.zzarj;
import com.google.android.gms.internal.ads.zzasj;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes.dex */
final class zzbk extends zzasj {
    final /* synthetic */ byte[] zza;
    final /* synthetic */ Map zzb;
    final /* synthetic */ com.google.android.gms.ads.internal.util.client.zzl zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzbk(zzbq zzbqVar, int i, String str, zzarj zzarjVar, zzari zzariVar, byte[] bArr, Map map, com.google.android.gms.ads.internal.util.client.zzl zzlVar) {
        super(i, str, zzarjVar, zzariVar);
        this.zza = bArr;
        this.zzb = map;
        this.zzc = zzlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzare
    public final Map zzl() throws zzaqm {
        Map map = this.zzb;
        return map == null ? Collections.emptyMap() : map;
    }

    @Override // com.google.android.gms.internal.ads.zzasj, com.google.android.gms.internal.ads.zzare
    protected final /* bridge */ /* synthetic */ void zzo(Object obj) {
        zzo((String) obj);
    }

    @Override // com.google.android.gms.internal.ads.zzare
    public final byte[] zzx() throws zzaqm {
        byte[] bArr = this.zza;
        if (bArr == null) {
            return null;
        }
        return bArr;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzasj
    /* renamed from: zzz */
    public final void zzo(String str) throws IOException {
        this.zzc.zzg(str);
        super.zzo(str);
    }
}
