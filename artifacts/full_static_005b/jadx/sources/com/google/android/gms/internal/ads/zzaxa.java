package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import androidx.core.view.PointerIconCompat;
import com.google.android.gms.location.GeofenceStatusCodes;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public abstract class zzaxa implements zzawz {
    protected static volatile zzaye zza;
    protected MotionEvent zzb;
    protected double zzk;
    protected float zzl;
    protected float zzm;
    protected float zzn;
    protected float zzo;
    protected DisplayMetrics zzq;
    protected zzaxw zzr;
    private double zzs;
    private double zzt;
    protected final LinkedList zzc = new LinkedList();
    protected long zzd = 0;
    protected long zze = 0;
    protected long zzf = 0;
    protected long zzg = 0;
    protected long zzh = 0;
    protected long zzi = 0;
    protected long zzj = 0;
    private boolean zzu = false;
    protected boolean zzp = false;

    protected zzaxa(Context context) {
        try {
            zzavs.zze();
            this.zzq = context.getResources().getDisplayMetrics();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzcH)).booleanValue()) {
                this.zzr = new zzaxw();
            }
        } catch (Throwable unused) {
        }
    }

    private final void zzj() {
        this.zzh = 0L;
        this.zzd = 0L;
        this.zze = 0L;
        this.zzf = 0L;
        this.zzg = 0L;
        this.zzi = 0L;
        this.zzj = 0L;
        if (this.zzc.isEmpty()) {
            MotionEvent motionEvent = this.zzb;
            if (motionEvent != null) {
                motionEvent.recycle();
            }
        } else {
            Iterator it = this.zzc.iterator();
            while (it.hasNext()) {
                ((MotionEvent) it.next()).recycle();
            }
            this.zzc.clear();
        }
        this.zzb = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0079 A[PHI: r1 r8
      0x0079: PHI (r1v10 int) = (r1v2 int), (r1v2 int), (r1v11 int), (r1v12 int) binds: [B:34:0x007d, B:35:0x007f, B:31:0x0078, B:27:0x0072] A[DONT_GENERATE, DONT_INLINE]
      0x0079: PHI (r8v6 com.google.android.gms.internal.ads.zzatp) = 
      (r8v3 com.google.android.gms.internal.ads.zzatp)
      (r8v3 com.google.android.gms.internal.ads.zzatp)
      (r8v8 com.google.android.gms.internal.ads.zzatp)
      (r8v8 com.google.android.gms.internal.ads.zzatp)
     binds: [B:34:0x007d, B:35:0x007f, B:31:0x0078, B:27:0x0072] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00e8 A[Catch: Exception -> 0x00ee, TRY_LEAVE, TryCatch #0 {Exception -> 0x00ee, blocks: (B:45:0x00a7, B:48:0x00b4, B:57:0x00d8, B:58:0x00e8), top: B:73:0x00a7 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00a7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final String zzm(Context context, String str, int i, View view, Activity activity, byte[] bArr) {
        zzawy zzawyVarZzd;
        String str2;
        int i2;
        int i3;
        Exception exc;
        int i4;
        int i5;
        String strZzb;
        zzatp zzatpVarZzc;
        int i6;
        int i7;
        int i8 = i;
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean zBooleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzcz)).booleanValue();
        zzatp zzatpVarZzb = null;
        if (zBooleanValue) {
            zzawyVarZzd = zza != null ? zza.zzd() : null;
            str2 = "be";
        } else {
            zzawyVarZzd = null;
            str2 = null;
        }
        try {
            if (i8 == 3) {
                zzatpVarZzb = zzb(context, view, activity);
                try {
                    this.zzu = true;
                    i7 = 1002;
                } catch (Exception e) {
                    exc = e;
                    i2 = 3;
                    i3 = 1;
                    if (zBooleanValue) {
                        i4 = 2;
                    }
                    long jCurrentTimeMillis2 = System.currentTimeMillis();
                    if (zzatpVarZzb != null) {
                    }
                    return strZzb;
                }
            } else {
                if (i8 == 2) {
                    zzatpVarZzc = zzd(context, view, activity);
                    i6 = PointerIconCompat.TYPE_TEXT;
                } else {
                    zzatpVarZzc = zzc(context, null);
                    i6 = 1000;
                }
                zzatpVarZzb = zzatpVarZzc;
                i7 = i6;
            }
            if (!zBooleanValue || zzawyVarZzd == null) {
                i2 = 3;
            } else {
                i2 = 3;
                i3 = 1;
                try {
                    zzawyVarZzd.zzc(i7, -1, System.currentTimeMillis() - jCurrentTimeMillis, str2, null);
                } catch (Exception e2) {
                    e = e2;
                    exc = e;
                    if (zBooleanValue || zzawyVarZzd == null) {
                        i4 = 2;
                    } else {
                        if (i8 == i2) {
                            i5 = 1003;
                            i4 = 2;
                        } else {
                            i4 = 2;
                            if (i8 == 2) {
                                i5 = 1009;
                            } else {
                                i5 = 1001;
                                i8 = i3;
                            }
                        }
                        zzawyVarZzd.zzc(i5, -1, System.currentTimeMillis() - jCurrentTimeMillis, str2, exc);
                    }
                    long jCurrentTimeMillis22 = System.currentTimeMillis();
                    if (zzatpVarZzb != null) {
                    }
                    return strZzb;
                }
            }
        } catch (Exception e3) {
            e = e3;
            i2 = 3;
            i3 = 1;
        }
        i4 = 2;
        long jCurrentTimeMillis222 = System.currentTimeMillis();
        if (zzatpVarZzb != null) {
            try {
                if (((zzaus) zzatpVarZzb.zzbr()).zzaY() == 0) {
                    strZzb = Integer.toString(5);
                } else {
                    zzaus zzausVar = (zzaus) zzatpVarZzb.zzbr();
                    int i9 = zzavs.zzc;
                    strZzb = zzavs.zzb(zzausVar.zzaV(), str);
                    if (zBooleanValue && zzawyVarZzd != null) {
                        zzawyVarZzd.zzc(i8 == i2 ? PointerIconCompat.TYPE_CELL : i8 == i4 ? PointerIconCompat.TYPE_ALIAS : 1004, -1, System.currentTimeMillis() - jCurrentTimeMillis222, str2, null);
                    }
                }
            } catch (Exception e4) {
                strZzb = Integer.toString(7);
                if (zBooleanValue && zzawyVarZzd != null) {
                    zzawyVarZzd.zzc(i8 == i2 ? PointerIconCompat.TYPE_CROSSHAIR : i8 == i4 ? PointerIconCompat.TYPE_COPY : GeofenceStatusCodes.GEOFENCE_REQUEST_TOO_FREQUENT, -1, System.currentTimeMillis() - jCurrentTimeMillis222, str2, e4);
                }
            }
        } else {
            strZzb = Integer.toString(5);
        }
        return strZzb;
    }

    protected abstract long zza(StackTraceElement[] stackTraceElementArr) throws zzaxu;

    protected abstract zzatp zzb(Context context, View view, Activity activity);

    protected abstract zzatp zzc(Context context, zzatg zzatgVar);

    protected abstract zzatp zzd(Context context, View view, Activity activity);

    @Override // com.google.android.gms.internal.ads.zzawz
    public final String zze(Context context, String str, View view) {
        return zzm(context, str, 3, view, null, null);
    }

    @Override // com.google.android.gms.internal.ads.zzawz
    public final String zzf(Context context, String str, View view, Activity activity) {
        return zzm(context, str, 3, view, activity, null);
    }

    @Override // com.google.android.gms.internal.ads.zzawz
    public final String zzg(Context context) {
        if (zzayh.zzc()) {
            throw new IllegalStateException("The caller must not be called from the UI thread.");
        }
        return zzm(context, null, 1, null, null, null);
    }

    @Override // com.google.android.gms.internal.ads.zzawz
    public final String zzh(Context context, View view, Activity activity) {
        return zzm(context, null, 2, view, activity, null);
    }

    protected abstract zzayg zzi(MotionEvent motionEvent) throws zzaxu;

    @Override // com.google.android.gms.internal.ads.zzawz
    public final synchronized void zzk(MotionEvent motionEvent) {
        Long l;
        if (this.zzu) {
            zzj();
            this.zzu = false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.zzk = 0.0d;
            this.zzs = motionEvent.getRawX();
            this.zzt = motionEvent.getRawY();
        } else if (action == 1 || action == 2) {
            double rawX = motionEvent.getRawX();
            double rawY = motionEvent.getRawY();
            double d = rawX - this.zzs;
            double d2 = rawY - this.zzt;
            this.zzk += Math.sqrt((d * d) + (d2 * d2));
            this.zzs = rawX;
            this.zzt = rawY;
        }
        int action2 = motionEvent.getAction();
        if (action2 != 0) {
            try {
                if (action2 == 1) {
                    MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                    this.zzb = motionEventObtain;
                    this.zzc.add(motionEventObtain);
                    if (this.zzc.size() > 6) {
                        ((MotionEvent) this.zzc.remove()).recycle();
                    }
                    this.zzf++;
                    this.zzh = zza(new Throwable().getStackTrace());
                } else if (action2 == 2) {
                    this.zze += motionEvent.getHistorySize() + 1;
                    zzayg zzaygVarZzi = zzi(motionEvent);
                    Long l2 = zzaygVarZzi.zzd;
                    if (l2 != null && zzaygVarZzi.zzg != null) {
                        this.zzi += l2.longValue() + zzaygVarZzi.zzg.longValue();
                    }
                    if (this.zzq != null && (l = zzaygVarZzi.zze) != null && zzaygVarZzi.zzh != null) {
                        this.zzj += l.longValue() + zzaygVarZzi.zzh.longValue();
                    }
                } else if (action2 == 3) {
                    this.zzg++;
                }
            } catch (zzaxu unused) {
            }
        } else {
            this.zzl = motionEvent.getX();
            this.zzm = motionEvent.getY();
            this.zzn = motionEvent.getRawX();
            this.zzo = motionEvent.getRawY();
            this.zzd++;
        }
        this.zzp = true;
    }

    @Override // com.google.android.gms.internal.ads.zzawz
    public final synchronized void zzl(int i, int i2, int i3) {
        if (this.zzb != null) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzcx)).booleanValue()) {
                zzj();
            } else {
                this.zzb.recycle();
            }
        }
        DisplayMetrics displayMetrics = this.zzq;
        if (displayMetrics != null) {
            this.zzb = MotionEvent.obtain(0L, i3, 1, i * displayMetrics.density, i2 * this.zzq.density, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        } else {
            this.zzb = null;
        }
        this.zzp = false;
    }

    @Override // com.google.android.gms.internal.ads.zzawz
    public final void zzn(StackTraceElement[] stackTraceElementArr) {
        zzaxw zzaxwVar;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzcH)).booleanValue() || (zzaxwVar = this.zzr) == null) {
            return;
        }
        zzaxwVar.zzb(Arrays.asList(stackTraceElementArr));
    }

    @Override // com.google.android.gms.internal.ads.zzawz
    public void zzo(View view) {
    }
}
