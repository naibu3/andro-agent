package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgeh;
import java.util.Collections;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Level;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
abstract class zzgey extends zzgeh.zzi {
    private static final zzgeu zzbd;
    private static final zzggd zzbe = new zzggd(zzgey.class);
    private volatile int remaining;

    @CheckForNull
    private volatile Set<Throwable> seenExceptions = null;

    static {
        zzgeu zzgexVar;
        Throwable th;
        zzgew zzgewVar = null;
        try {
            zzgexVar = new zzgev(AtomicReferenceFieldUpdater.newUpdater(zzgey.class, Set.class, "seenExceptions"), AtomicIntegerFieldUpdater.newUpdater(zzgey.class, "remaining"));
            th = null;
        } catch (Throwable th2) {
            zzgexVar = new zzgex(zzgewVar);
            th = th2;
        }
        zzbd = zzgexVar;
        if (th != null) {
            zzbe.zza().logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFutureState", "<clinit>", "SafeAtomicHelper is broken!", th);
        }
    }

    zzgey(int i) {
        this.remaining = i;
    }

    final int zzA() {
        return zzbd.zza(this);
    }

    final Set zzC() {
        Set<Throwable> set = this.seenExceptions;
        if (set != null) {
            return set;
        }
        Set setNewSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
        zze(setNewSetFromMap);
        zzbd.zzb(this, null, setNewSetFromMap);
        return (Set) Objects.requireNonNull(this.seenExceptions);
    }

    final void zzF() {
        this.seenExceptions = null;
    }

    abstract void zze(Set set);
}
