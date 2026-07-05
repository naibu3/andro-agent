package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
abstract class zzges extends zzgey {
    private static final zzggd zza = new zzggd(zzges.class);

    @CheckForNull
    private zzgax zzb;
    private final boolean zzc;
    private final boolean zzf;

    zzges(zzgax zzgaxVar, boolean z, boolean z2) {
        super(zzgaxVar.size());
        zzgaxVar.getClass();
        this.zzb = zzgaxVar;
        this.zzc = z;
        this.zzf = z2;
    }

    private final void zzG(int i, Future future) {
        try {
            zzf(i, zzgft.zzp(future));
        } catch (ExecutionException e) {
            zzI(e.getCause());
        } catch (Throwable th) {
            zzI(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzH, reason: merged with bridge method [inline-methods] */
    public final void zzx(@CheckForNull zzgax zzgaxVar) {
        int iZzA = zzA();
        int i = 0;
        zzfyg.zzk(iZzA >= 0, "Less than 0 remaining futures");
        if (iZzA == 0) {
            if (zzgaxVar != null) {
                zzgdi it = zzgaxVar.iterator();
                while (it.hasNext()) {
                    Future future = (Future) it.next();
                    if (!future.isCancelled()) {
                        zzG(i, future);
                    }
                    i++;
                }
            }
            zzF();
            zzu();
            zzy(2);
        }
    }

    private static void zzJ(Throwable th) {
        zza.zza().logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFuture", "log", true != (th instanceof Error) ? "Got more than one input Future failure. Logging failures after the first" : "Input Future failed with Error", th);
    }

    private static boolean zzK(Set set, Throwable th) {
        while (th != null) {
            if (!set.add(th)) {
                return false;
            }
            th = th.getCause();
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzgeh
    @CheckForNull
    protected final String zza() {
        zzgax zzgaxVar = this.zzb;
        return zzgaxVar != null ? "futures=".concat(zzgaxVar.toString()) : super.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzgeh
    protected final void zzb() {
        zzgax zzgaxVar = this.zzb;
        zzy(1);
        if ((zzgaxVar != null) && isCancelled()) {
            boolean zZzt = zzt();
            zzgdi it = zzgaxVar.iterator();
            while (it.hasNext()) {
                ((Future) it.next()).cancel(zZzt);
            }
        }
    }

    abstract void zzf(int i, Object obj);

    abstract void zzu();

    final void zzv() {
        Objects.requireNonNull(this.zzb);
        if (this.zzb.isEmpty()) {
            zzu();
            return;
        }
        if (!this.zzc) {
            final zzgax zzgaxVar = this.zzf ? this.zzb : null;
            Runnable runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.zzger
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzx(zzgaxVar);
                }
            };
            zzgdi it = this.zzb.iterator();
            while (it.hasNext()) {
                ((ListenableFuture) it.next()).addListener(runnable, zzgfh.INSTANCE);
            }
            return;
        }
        zzgdi it2 = this.zzb.iterator();
        final int i = 0;
        while (it2.hasNext()) {
            final ListenableFuture listenableFuture = (ListenableFuture) it2.next();
            listenableFuture.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzgeq
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzw(listenableFuture, i);
                }
            }, zzgfh.INSTANCE);
            i++;
        }
    }

    final /* synthetic */ void zzw(ListenableFuture listenableFuture, int i) {
        try {
            if (listenableFuture.isCancelled()) {
                this.zzb = null;
                cancel(false);
            } else {
                zzG(i, listenableFuture);
            }
        } finally {
            zzx(null);
        }
    }

    void zzy(int i) {
        this.zzb = null;
    }

    @Override // com.google.android.gms.internal.ads.zzgey
    final void zze(Set set) {
        set.getClass();
        if (isCancelled()) {
            return;
        }
        zzK(set, (Throwable) Objects.requireNonNull(zzl()));
    }

    private final void zzI(Throwable th) {
        th.getClass();
        if (this.zzc && !zzd(th) && zzK(zzC(), th)) {
            zzJ(th);
        } else if (th instanceof Error) {
            zzJ(th);
        }
    }
}
