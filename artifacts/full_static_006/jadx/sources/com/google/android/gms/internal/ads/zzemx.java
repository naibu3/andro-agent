package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzemx implements zzehl {
    private final zzehn zza;
    private final zzehr zzb;
    private final zzflt zzc;
    private final zzgge zzd;

    public zzemx(zzflt zzfltVar, zzgge zzggeVar, zzehn zzehnVar, zzehr zzehrVar) {
        this.zzc = zzfltVar;
        this.zzd = zzggeVar;
        this.zzb = zzehrVar;
        this.zza = zzehnVar;
    }

    static final String zze(String str, int i) {
        return "Error from: " + str + ", code: " + i;
    }

    @Override // com.google.android.gms.internal.ads.zzehl
    public final ListenableFuture zza(final zzfhf zzfhfVar, final zzfgt zzfgtVar) {
        final zzeho zzehoVarZza;
        Iterator it = zzfgtVar.zzu.iterator();
        while (true) {
            if (!it.hasNext()) {
                zzehoVarZza = null;
                break;
            }
            try {
                zzehoVarZza = this.zza.zza((String) it.next(), zzfgtVar.zzw);
                break;
            } catch (zzfhv unused) {
            }
        }
        if (zzehoVarZza == null) {
            return zzgft.zzg(new zzekn("Unable to instantiate mediation adapter class."));
        }
        zzccn zzccnVar = new zzccn();
        zzehoVarZza.zzc.zza(new zzemw(this, zzehoVarZza, zzccnVar));
        if (zzfgtVar.zzN) {
            Bundle bundle = zzfhfVar.zza.zza.zzd.zzm;
            Bundle bundle2 = bundle.getBundle(AdMobAdapter.class.getName());
            if (bundle2 == null) {
                bundle2 = new Bundle();
                bundle.putBundle(AdMobAdapter.class.getName(), bundle2);
            }
            bundle2.putBoolean("render_test_ad_label", true);
        }
        zzflt zzfltVar = this.zzc;
        return zzfld.zzd(new zzfkx() { // from class: com.google.android.gms.internal.ads.zzemu
            @Override // com.google.android.gms.internal.ads.zzfkx
            public final void zza() throws Exception {
                this.zza.zzd(zzfhfVar, zzfgtVar, zzehoVarZza);
            }
        }, this.zzd, zzfln.ADAPTER_LOAD_AD_SYN, zzfltVar).zzb(zzfln.ADAPTER_LOAD_AD_ACK).zzd(zzccnVar).zzb(zzfln.ADAPTER_WRAP_ADAPTER).zze(new zzfkw() { // from class: com.google.android.gms.internal.ads.zzemv
            @Override // com.google.android.gms.internal.ads.zzfkw
            public final Object zza(Object obj) {
                return this.zza.zzc(zzfhfVar, zzfgtVar, zzehoVarZza, (Void) obj);
            }
        }).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzehl
    public final boolean zzb(zzfhf zzfhfVar, zzfgt zzfgtVar) {
        return !zzfgtVar.zzu.isEmpty();
    }

    final /* synthetic */ Object zzc(zzfhf zzfhfVar, zzfgt zzfgtVar, zzeho zzehoVar, Void r4) throws Exception {
        return this.zzb.zza(zzfhfVar, zzfgtVar, zzehoVar);
    }

    final /* synthetic */ void zzd(zzfhf zzfhfVar, zzfgt zzfgtVar, zzeho zzehoVar) throws Exception {
        this.zzb.zzb(zzfhfVar, zzfgtVar, zzehoVar);
    }
}
