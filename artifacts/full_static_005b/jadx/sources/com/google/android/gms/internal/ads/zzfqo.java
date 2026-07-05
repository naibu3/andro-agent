package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzfqo implements zzfpn {
    private static final zzfqo zza = new zzfqo();
    private static final Handler zzb = new Handler(Looper.getMainLooper());
    private static Handler zzc = null;
    private static final Runnable zzd = new zzfqk();
    private static final Runnable zze = new zzfql();
    private int zzg;
    private long zzm;
    private final List zzf = new ArrayList();
    private boolean zzh = false;
    private final List zzi = new ArrayList();
    private final zzfqh zzk = new zzfqh();
    private final zzfpp zzj = new zzfpp();
    private final zzfqi zzl = new zzfqi(new zzfqr());

    zzfqo() {
    }

    public static zzfqo zzd() {
        return zza;
    }

    static /* bridge */ /* synthetic */ void zzg(zzfqo zzfqoVar) throws JSONException {
        zzfqoVar.zzg = 0;
        zzfqoVar.zzi.clear();
        zzfqoVar.zzh = false;
        for (zzfon zzfonVar : zzfpe.zza().zzb()) {
        }
        zzfqoVar.zzm = System.nanoTime();
        zzfqoVar.zzk.zzi();
        long jNanoTime = System.nanoTime();
        zzfpo zzfpoVarZza = zzfqoVar.zzj.zza();
        if (zzfqoVar.zzk.zze().size() > 0) {
            Iterator it = zzfqoVar.zzk.zze().iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                JSONObject jSONObjectZza = zzfpoVarZza.zza(null);
                View viewZza = zzfqoVar.zzk.zza(str);
                zzfpo zzfpoVarZzb = zzfqoVar.zzj.zzb();
                String strZzc = zzfqoVar.zzk.zzc(str);
                if (strZzc != null) {
                    JSONObject jSONObjectZza2 = zzfpoVarZzb.zza(viewZza);
                    zzfpy.zzb(jSONObjectZza2, str);
                    try {
                        jSONObjectZza2.put("notVisibleReason", strZzc);
                    } catch (JSONException e) {
                        zzfpz.zza("Error with setting not visible reason", e);
                    }
                    zzfpy.zzc(jSONObjectZza, jSONObjectZza2);
                }
                zzfpy.zzf(jSONObjectZza);
                HashSet hashSet = new HashSet();
                hashSet.add(str);
                zzfqoVar.zzl.zzc(jSONObjectZza, hashSet, jNanoTime);
            }
        }
        if (zzfqoVar.zzk.zzf().size() > 0) {
            JSONObject jSONObjectZza3 = zzfpoVarZza.zza(null);
            zzfqoVar.zzk(null, zzfpoVarZza, jSONObjectZza3, 1, false);
            zzfpy.zzf(jSONObjectZza3);
            zzfqoVar.zzl.zzd(jSONObjectZza3, zzfqoVar.zzk.zzf(), jNanoTime);
            boolean z = zzfqoVar.zzh;
        } else {
            zzfqoVar.zzl.zzb();
        }
        zzfqoVar.zzk.zzg();
        long jNanoTime2 = System.nanoTime() - zzfqoVar.zzm;
        if (zzfqoVar.zzf.size() > 0) {
            for (zzfqn zzfqnVar : zzfqoVar.zzf) {
                int i = zzfqoVar.zzg;
                TimeUnit.NANOSECONDS.toMillis(jNanoTime2);
                zzfqnVar.zzb();
                if (zzfqnVar instanceof zzfqm) {
                    int i2 = zzfqoVar.zzg;
                    ((zzfqm) zzfqnVar).zza();
                }
            }
        }
    }

    private final void zzk(View view, zzfpo zzfpoVar, JSONObject jSONObject, int i, boolean z) {
        zzfpoVar.zzb(view, jSONObject, this, i == 1, z);
    }

    private static final void zzl() {
        Handler handler = zzc;
        if (handler != null) {
            handler.removeCallbacks(zze);
            zzc = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfpn
    public final void zza(View view, zzfpo zzfpoVar, JSONObject jSONObject, boolean z) throws JSONException {
        int iZzk;
        boolean z2;
        if (zzfqe.zza(view) != null || (iZzk = this.zzk.zzk(view)) == 3) {
            return;
        }
        JSONObject jSONObjectZza = zzfpoVar.zza(view);
        zzfpy.zzc(jSONObject, jSONObjectZza);
        String strZzd = this.zzk.zzd(view);
        if (strZzd != null) {
            zzfpy.zzb(jSONObjectZza, strZzd);
            try {
                jSONObjectZza.put("hasWindowFocus", Boolean.valueOf(this.zzk.zzj(view)));
            } catch (JSONException e) {
                zzfpz.zza("Error with setting has window focus", e);
            }
            this.zzk.zzh();
        } else {
            zzfqg zzfqgVarZzb = this.zzk.zzb(view);
            if (zzfqgVarZzb != null) {
                zzfph zzfphVarZza = zzfqgVarZzb.zza();
                JSONArray jSONArray = new JSONArray();
                ArrayList arrayListZzb = zzfqgVarZzb.zzb();
                int size = arrayListZzb.size();
                for (int i = 0; i < size; i++) {
                    jSONArray.put((String) arrayListZzb.get(i));
                }
                try {
                    jSONObjectZza.put("isFriendlyObstructionFor", jSONArray);
                    jSONObjectZza.put("friendlyObstructionClass", zzfphVarZza.zzd());
                    jSONObjectZza.put("friendlyObstructionPurpose", zzfphVarZza.zza());
                    jSONObjectZza.put("friendlyObstructionReason", zzfphVarZza.zzc());
                } catch (JSONException e2) {
                    zzfpz.zza("Error with setting friendly obstruction", e2);
                }
                z2 = true;
            } else {
                z2 = false;
            }
            zzk(view, zzfpoVar, jSONObjectZza, iZzk, z || z2);
        }
        this.zzg++;
    }

    public final void zzh() {
        zzl();
    }

    public final void zzi() {
        if (zzc == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            zzc = handler;
            handler.post(zzd);
            zzc.postDelayed(zze, 200L);
        }
    }

    public final void zzj() {
        zzl();
        this.zzf.clear();
        zzb.post(new zzfqj(this));
    }
}
