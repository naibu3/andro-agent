package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.HashSet;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzfqu extends zzfqp {
    public zzfqu(zzfqi zzfqiVar, HashSet hashSet, JSONObject jSONObject, long j) {
        super(zzfqiVar, hashSet, jSONObject, j);
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        if (zzfpy.zzg(this.zzb, this.zzd.zza())) {
            return null;
        }
        this.zzd.zze(this.zzb);
        return this.zzb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzfqq, android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        onPostExecute((String) obj);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzfqq
    /* renamed from: zza */
    public final void onPostExecute(String str) {
        zzfpe zzfpeVarZza;
        if (!TextUtils.isEmpty(str) && (zzfpeVarZza = zzfpe.zza()) != null) {
            for (zzfon zzfonVar : zzfpeVarZza.zzc()) {
                if (this.zza.contains(zzfonVar.zzh())) {
                    zzfonVar.zzg().zzh(str, this.zzc);
                }
            }
        }
        super.onPostExecute(str);
    }
}
