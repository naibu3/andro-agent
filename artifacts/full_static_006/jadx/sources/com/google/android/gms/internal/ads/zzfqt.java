package com.google.android.gms.internal.ads;

import java.util.HashSet;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzfqt extends zzfqp {
    public zzfqt(zzfqi zzfqiVar, HashSet hashSet, JSONObject jSONObject, long j) {
        super(zzfqiVar, hashSet, jSONObject, j);
    }

    private final void zzc(String str) {
        zzfpe zzfpeVarZza = zzfpe.zza();
        if (zzfpeVarZza != null) {
            for (zzfon zzfonVar : zzfpeVarZza.zzc()) {
                if (this.zza.contains(zzfonVar.zzh())) {
                    zzfonVar.zzg().zzd(str, this.zzc);
                }
            }
        }
    }

    @Override // android.os.AsyncTask
    protected final /* synthetic */ Object doInBackground(Object[] objArr) {
        return this.zzb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzfqq, android.os.AsyncTask
    protected final /* synthetic */ void onPostExecute(Object obj) {
        String str = (String) obj;
        zzc(str);
        super.onPostExecute(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzfqq
    /* renamed from: zza */
    public final void onPostExecute(String str) {
        zzc(str);
        super.onPostExecute(str);
    }
}
