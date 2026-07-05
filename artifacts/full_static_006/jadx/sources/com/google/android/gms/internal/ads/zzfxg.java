package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzfxg {
    private static final Map zza = new HashMap();
    private final Context zzb;
    private final zzfwv zzc;
    private boolean zzh;
    private final Intent zzi;
    private ServiceConnection zzm;
    private IInterface zzn;
    private final zzfwi zzo;
    private final List zze = new ArrayList();
    private final Set zzf = new HashSet();
    private final Object zzg = new Object();
    private final IBinder.DeathRecipient zzk = new IBinder.DeathRecipient() { // from class: com.google.android.gms.internal.ads.zzfwx
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            zzfxg.zzj(this.zza);
        }
    };
    private final AtomicInteger zzl = new AtomicInteger(0);
    private final String zzd = "OverlayDisplayService";
    private final WeakReference zzj = new WeakReference(null);

    public zzfxg(Context context, zzfwv zzfwvVar, String str, Intent intent, zzfwi zzfwiVar, zzfxb zzfxbVar) {
        this.zzb = context;
        this.zzc = zzfwvVar;
        this.zzi = intent;
        this.zzo = zzfwiVar;
    }

    public static /* synthetic */ void zzj(zzfxg zzfxgVar) {
        zzfxgVar.zzc.zzc("reportBinderDeath", new Object[0]);
        zzfxb zzfxbVar = (zzfxb) zzfxgVar.zzj.get();
        if (zzfxbVar != null) {
            zzfxgVar.zzc.zzc("calling onBinderDied", new Object[0]);
            zzfxbVar.zza();
        } else {
            zzfxgVar.zzc.zzc("%s : Binder has died.", zzfxgVar.zzd);
            Iterator it = zzfxgVar.zze.iterator();
            while (it.hasNext()) {
                ((zzfww) it.next()).zzc(zzfxgVar.zzv());
            }
            zzfxgVar.zze.clear();
        }
        synchronized (zzfxgVar.zzg) {
            zzfxgVar.zzw();
        }
    }

    static /* bridge */ /* synthetic */ void zzn(final zzfxg zzfxgVar, final TaskCompletionSource taskCompletionSource) {
        zzfxgVar.zzf.add(taskCompletionSource);
        taskCompletionSource.getTask().addOnCompleteListener(new OnCompleteListener() { // from class: com.google.android.gms.internal.ads.zzfwy
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                this.zza.zzt(taskCompletionSource, task);
            }
        });
    }

    static /* bridge */ /* synthetic */ void zzq(zzfxg zzfxgVar) throws RemoteException {
        zzfxgVar.zzc.zzc("linkToDeath", new Object[0]);
        try {
            zzfxgVar.zzn.asBinder().linkToDeath(zzfxgVar.zzk, 0);
        } catch (RemoteException e) {
            zzfxgVar.zzc.zzb(e, "linkToDeath failed", new Object[0]);
        }
    }

    static /* bridge */ /* synthetic */ void zzr(zzfxg zzfxgVar) {
        zzfxgVar.zzc.zzc("unlinkToDeath", new Object[0]);
        zzfxgVar.zzn.asBinder().unlinkToDeath(zzfxgVar.zzk, 0);
    }

    private final RemoteException zzv() {
        return new RemoteException(String.valueOf(this.zzd).concat(" : Binder has died."));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzw() {
        Iterator it = this.zzf.iterator();
        while (it.hasNext()) {
            ((TaskCompletionSource) it.next()).trySetException(zzv());
        }
        this.zzf.clear();
    }

    public final Handler zzc() {
        Handler handler;
        Map map = zza;
        synchronized (map) {
            if (!map.containsKey(this.zzd)) {
                HandlerThread handlerThread = new HandlerThread(this.zzd, 10);
                handlerThread.start();
                map.put(this.zzd, new Handler(handlerThread.getLooper()));
            }
            handler = (Handler) map.get(this.zzd);
        }
        return handler;
    }

    public final IInterface zze() {
        return this.zzn;
    }

    public final void zzs(zzfww zzfwwVar, TaskCompletionSource taskCompletionSource) {
        zzc().post(new zzfwz(this, zzfwwVar.zzb(), taskCompletionSource, zzfwwVar));
    }

    final /* synthetic */ void zzt(TaskCompletionSource taskCompletionSource, Task task) {
        synchronized (this.zzg) {
            this.zzf.remove(taskCompletionSource);
        }
    }

    public final void zzu() {
        zzc().post(new zzfxa(this));
    }

    static /* bridge */ /* synthetic */ void zzp(zzfxg zzfxgVar, zzfww zzfwwVar) {
        if (zzfxgVar.zzn != null || zzfxgVar.zzh) {
            if (!zzfxgVar.zzh) {
                zzfwwVar.run();
                return;
            } else {
                zzfxgVar.zzc.zzc("Waiting to bind to the service.", new Object[0]);
                zzfxgVar.zze.add(zzfwwVar);
                return;
            }
        }
        zzfxgVar.zzc.zzc("Initiate binding to the service.", new Object[0]);
        zzfxgVar.zze.add(zzfwwVar);
        zzfxf zzfxfVar = new zzfxf(zzfxgVar, null);
        zzfxgVar.zzm = zzfxfVar;
        zzfxgVar.zzh = true;
        if (zzfxgVar.zzb.bindService(zzfxgVar.zzi, zzfxfVar, 1)) {
            return;
        }
        zzfxgVar.zzc.zzc("Failed to bind to the service.", new Object[0]);
        zzfxgVar.zzh = false;
        Iterator it = zzfxgVar.zze.iterator();
        while (it.hasNext()) {
            ((zzfww) it.next()).zzc(new zzfxh());
        }
        zzfxgVar.zze.clear();
    }
}
