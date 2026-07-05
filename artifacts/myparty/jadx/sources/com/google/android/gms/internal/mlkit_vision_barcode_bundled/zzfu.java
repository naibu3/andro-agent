package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import com.stripe.android.stripe3ds2.transactions.ChallengeRequestData;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: com.google.mlkit:barcode-scanning@@17.3.0 */
/* loaded from: classes4.dex */
final class zzfu {
    public static final /* synthetic */ int zza = 0;
    private static final zzfu zzb = new zzfu();
    private final ConcurrentMap zzd = new ConcurrentHashMap();
    private final zzgf zzc = new zzfe();

    private zzfu() {
    }

    public static zzfu zza() {
        return zzb;
    }

    public final zzge zzb(Class cls) {
        zzep.zzc(cls, ChallengeRequestData.FIELD_MESSAGE_TYPE);
        zzge zzgeVar = (zzge) this.zzd.get(cls);
        if (zzgeVar != null) {
            return zzgeVar;
        }
        zzge zzgeVarZza = this.zzc.zza(cls);
        zzep.zzc(cls, ChallengeRequestData.FIELD_MESSAGE_TYPE);
        zzge zzgeVar2 = (zzge) this.zzd.putIfAbsent(cls, zzgeVarZza);
        return zzgeVar2 == null ? zzgeVarZza : zzgeVar2;
    }
}
