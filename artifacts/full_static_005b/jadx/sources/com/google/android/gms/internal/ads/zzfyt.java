package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzfyt {
    private final zzfxr zza;
    private final zzfys zzb;

    private zzfyt(zzfys zzfysVar) {
        zzfxr zzfxrVar = zzfxq.zza;
        this.zzb = zzfysVar;
        this.zza = zzfxrVar;
    }

    public static zzfyt zzb(int i) {
        return new zzfyt(new zzfyp(4000));
    }

    public static zzfyt zzc(zzfxr zzfxrVar) {
        return new zzfyt(new zzfyn(zzfxrVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Iterator zzg(CharSequence charSequence) {
        return this.zzb.zza(this, charSequence);
    }

    public final Iterable zzd(CharSequence charSequence) {
        charSequence.getClass();
        return new zzfyq(this, charSequence);
    }

    public final List zzf(CharSequence charSequence) {
        charSequence.getClass();
        Iterator itZzg = zzg(charSequence);
        ArrayList arrayList = new ArrayList();
        while (itZzg.hasNext()) {
            arrayList.add((String) itZzg.next());
        }
        return Collections.unmodifiableList(arrayList);
    }
}
