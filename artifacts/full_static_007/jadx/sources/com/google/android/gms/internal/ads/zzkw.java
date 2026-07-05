package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import androidx.core.view.PointerIconCompat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzkw extends zzm implements zzjr {
    public static final /* synthetic */ int zzd = 0;
    private final zzmw zzA;
    private final long zzB;
    private int zzC;
    private int zzD;
    private boolean zzE;
    private int zzF;
    private zzmr zzG;
    private zzcp zzH;
    private zzca zzI;
    private zzca zzJ;
    private zzan zzK;
    private zzan zzL;
    private Object zzM;
    private Surface zzN;
    private int zzO;
    private zzfv zzP;
    private zzix zzQ;
    private zzix zzR;
    private int zzS;
    private zzk zzT;
    private float zzU;
    private boolean zzV;
    private zzek zzW;
    private boolean zzX;
    private boolean zzY;
    private zzaa zzZ;
    private zzdv zzaa;
    private zzca zzab;
    private zzmg zzac;
    private int zzad;
    private long zzae;
    private final zzjs zzaf;
    private zzxi zzag;
    final zzzn zzb;
    final zzcp zzc;
    private final zzeu zze;
    private final Context zzf;
    private final zzct zzg;
    private final zzmn[] zzh;
    private final zzzm zzi;
    private final zzfb zzj;
    private final zzlh zzk;
    private final zzfh zzl;
    private final CopyOnWriteArraySet zzm;
    private final zzcz zzn;
    private final List zzo;
    private final boolean zzp;
    private final zzvn zzq;
    private final zzmx zzr;
    private final Looper zzs;
    private final zzzu zzt;
    private final zzer zzu;
    private final zzks zzv;
    private final zzku zzw;
    private final zzir zzx;
    private final zziv zzy;
    private final zzmv zzz;

    static {
        zzbv.zzb("media3.exoplayer");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v3, types: [com.google.android.gms.internal.ads.zzmx, com.google.android.gms.internal.ads.zzzt, java.lang.Object] */
    public zzkw(zzjq zzjqVar, zzct zzctVar) {
        zzeu zzeuVar = new zzeu(zzer.zza);
        this.zze = zzeuVar;
        try {
            zzfk.zze("ExoPlayerImpl", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.4.0-alpha01] [" + zzgd.zze + "]");
            Context applicationContext = zzjqVar.zza.getApplicationContext();
            this.zzf = applicationContext;
            ?? Apply = zzjqVar.zzh.apply(zzjqVar.zzb);
            this.zzr = Apply;
            this.zzT = zzjqVar.zzj;
            this.zzO = zzjqVar.zzk;
            this.zzV = false;
            this.zzB = zzjqVar.zzo;
            zzks zzksVar = new zzks(this, null);
            this.zzv = zzksVar;
            zzku zzkuVar = new zzku(null == true ? 1 : 0);
            this.zzw = zzkuVar;
            Handler handler = new Handler(zzjqVar.zzi);
            zzmn[] zzmnVarArrZza = ((zzjj) zzjqVar.zzc).zza.zza(handler, zzksVar, zzksVar, zzksVar, zzksVar);
            this.zzh = zzmnVarArrZza;
            int length = zzmnVarArrZza.length;
            zzzm zzzmVar = (zzzm) zzjqVar.zze.zza();
            this.zzi = zzzmVar;
            this.zzq = zzjq.zza(((zzjk) zzjqVar.zzd).zza);
            zzzy zzzyVarZzg = zzzy.zzg(((zzjn) zzjqVar.zzg).zza);
            this.zzt = zzzyVarZzg;
            this.zzp = zzjqVar.zzl;
            this.zzG = zzjqVar.zzm;
            Looper looper = zzjqVar.zzi;
            this.zzs = looper;
            zzer zzerVar = zzjqVar.zzb;
            this.zzu = zzerVar;
            this.zzg = zzctVar;
            zzfh zzfhVar = new zzfh(looper, zzerVar, new zzff() { // from class: com.google.android.gms.internal.ads.zzkm
                @Override // com.google.android.gms.internal.ads.zzff
                public final void zza(Object obj, zzah zzahVar) {
                }
            });
            this.zzl = zzfhVar;
            CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
            this.zzm = copyOnWriteArraySet;
            this.zzo = new ArrayList();
            this.zzag = new zzxi(0);
            int length2 = zzmnVarArrZza.length;
            zzzn zzznVar = new zzzn(new zzmq[2], new zzzg[2], zzdp.zza, null);
            this.zzb = zzznVar;
            this.zzn = new zzcz();
            zzcn zzcnVar = new zzcn();
            zzcnVar.zzc(1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 35, 22, 24, 27, 28, 32);
            zzzmVar.zzn();
            zzcnVar.zzd(29, true);
            zzcnVar.zzd(23, false);
            zzcnVar.zzd(25, false);
            zzcnVar.zzd(33, false);
            zzcnVar.zzd(26, false);
            zzcnVar.zzd(34, false);
            zzcp zzcpVarZze = zzcnVar.zze();
            this.zzc = zzcpVarZze;
            zzcn zzcnVar2 = new zzcn();
            zzcnVar2.zzb(zzcpVarZze);
            zzcnVar2.zza(4);
            zzcnVar2.zza(10);
            this.zzH = zzcnVar2.zze();
            this.zzj = zzerVar.zzb(looper, null);
            zzjs zzjsVar = new zzjs(this);
            this.zzaf = zzjsVar;
            this.zzac = zzmg.zzg(zzznVar);
            Apply.zzR(zzctVar, looper);
            this.zzk = new zzlh(zzmnVarArrZza, zzzmVar, zzznVar, (zzlk) zzjqVar.zzf.zza(), zzzyVarZzg, 0, false, Apply, this.zzG, zzjqVar.zzs, zzjqVar.zzn, false, looper, zzerVar, zzjsVar, zzgd.zza < 31 ? new zzpj(zzjqVar.zzr) : zzkn.zza(applicationContext, this, zzjqVar.zzp, zzjqVar.zzr), null);
            this.zzU = 1.0f;
            this.zzI = zzca.zza;
            zzca zzcaVar = zzca.zza;
            this.zzJ = zzcaVar;
            this.zzab = zzcaVar;
            int iGenerateAudioSessionId = -1;
            this.zzad = -1;
            AudioManager audioManager = (AudioManager) applicationContext.getSystemService("audio");
            if (audioManager != null) {
                iGenerateAudioSessionId = audioManager.generateAudioSessionId();
            }
            this.zzS = iGenerateAudioSessionId;
            this.zzW = zzek.zza;
            this.zzX = true;
            if (Apply == 0) {
                throw null;
            }
            zzfhVar.zzb(Apply);
            zzzyVarZzg.zze(new Handler(looper), Apply);
            copyOnWriteArraySet.add(zzksVar);
            this.zzx = new zzir(zzjqVar.zza, handler, zzksVar);
            this.zzy = new zziv(zzjqVar.zza, handler, zzksVar);
            zzgd.zzG(null, null);
            this.zzz = new zzmv(zzjqVar.zza);
            this.zzA = new zzmw(zzjqVar.zza);
            this.zzZ = new zzy(0).zza();
            this.zzaa = zzdv.zza;
            this.zzP = zzfv.zza;
            zzzmVar.zzk(this.zzT);
            zzag(1, 10, Integer.valueOf(this.zzS));
            zzag(2, 10, Integer.valueOf(this.zzS));
            zzag(1, 3, this.zzT);
            zzag(2, 4, Integer.valueOf(this.zzO));
            zzag(2, 5, 0);
            zzag(1, 9, Boolean.valueOf(this.zzV));
            zzag(2, 7, zzkuVar);
            zzag(6, 8, zzkuVar);
            zzeuVar.zze();
        } catch (Throwable th) {
            this.zze.zze();
            throw th;
        }
    }

    static /* bridge */ /* synthetic */ void zzP(zzkw zzkwVar, SurfaceTexture surfaceTexture) {
        Surface surface = new Surface(surfaceTexture);
        zzkwVar.zzai(surface);
        zzkwVar.zzN = surface;
    }

    private final int zzW(zzmg zzmgVar) {
        return zzmgVar.zza.zzo() ? this.zzad : zzmgVar.zza.zzn(zzmgVar.zzb.zza, this.zzn).zzd;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int zzX(boolean z, int i) {
        return (!z || i == 1) ? 1 : 2;
    }

    private final long zzY(zzmg zzmgVar) {
        if (!zzmgVar.zzb.zzb()) {
            return zzgd.zzu(zzZ(zzmgVar));
        }
        zzmgVar.zza.zzn(zzmgVar.zzb.zza, this.zzn);
        if (zzmgVar.zzc == -9223372036854775807L) {
            long j = zzmgVar.zza.zze(zzW(zzmgVar), this.zza, 0L).zzn;
            return zzgd.zzu(0L);
        }
        int i = zzgd.zza;
        return zzgd.zzu(0L) + zzgd.zzu(zzmgVar.zzc);
    }

    private final long zzZ(zzmg zzmgVar) {
        if (zzmgVar.zza.zzo()) {
            return zzgd.zzr(this.zzae);
        }
        boolean z = zzmgVar.zzo;
        long j = zzmgVar.zzr;
        if (zzmgVar.zzb.zzb()) {
            return j;
        }
        zzab(zzmgVar.zza, zzmgVar.zzb, j);
        return j;
    }

    private static long zzaa(zzmg zzmgVar) {
        zzdb zzdbVar = new zzdb();
        zzcz zzczVar = new zzcz();
        zzmgVar.zza.zzn(zzmgVar.zzb.zza, zzczVar);
        long j = zzmgVar.zzc;
        if (j != -9223372036854775807L) {
            return j;
        }
        long j2 = zzmgVar.zza.zze(zzczVar.zzd, zzdbVar, 0L).zzn;
        return 0L;
    }

    private final long zzab(zzdc zzdcVar, zzvo zzvoVar, long j) {
        zzdcVar.zzn(zzvoVar.zza, this.zzn);
        return j;
    }

    private final Pair zzac(zzdc zzdcVar, int i, long j) {
        if (zzdcVar.zzo()) {
            this.zzad = i;
            if (j == -9223372036854775807L) {
                j = 0;
            }
            this.zzae = j;
            return null;
        }
        if (i == -1 || i >= zzdcVar.zzc()) {
            i = zzdcVar.zzg(false);
            long j2 = zzdcVar.zze(i, this.zza, 0L).zzn;
            j = zzgd.zzu(0L);
        }
        return zzdcVar.zzl(this.zza, this.zzn, i, zzgd.zzr(j));
    }

    private final zzmg zzad(zzmg zzmgVar, zzdc zzdcVar, Pair pair) {
        zzeq.zzd(zzdcVar.zzo() || pair != null);
        zzdc zzdcVar2 = zzmgVar.zza;
        long jZzY = zzY(zzmgVar);
        zzmg zzmgVarZzf = zzmgVar.zzf(zzdcVar);
        if (zzdcVar.zzo()) {
            zzvo zzvoVarZzh = zzmg.zzh();
            long jZzr = zzgd.zzr(this.zzae);
            zzmg zzmgVarZza = zzmgVarZzf.zzb(zzvoVarZzh, jZzr, jZzr, jZzr, 0L, zzxr.zza, this.zzb, zzgbc.zzm()).zza(zzvoVarZzh);
            zzmgVarZza.zzp = zzmgVarZza.zzr;
            return zzmgVarZza;
        }
        Object obj = zzmgVarZzf.zzb.zza;
        int i = zzgd.zza;
        boolean zEquals = obj.equals(pair.first);
        zzvo zzvoVar = !zEquals ? new zzvo(pair.first, -1L) : zzmgVarZzf.zzb;
        long jLongValue = ((Long) pair.second).longValue();
        long jZzr2 = zzgd.zzr(jZzY);
        if (!zzdcVar2.zzo()) {
            zzdcVar2.zzn(obj, this.zzn);
        }
        if (!zEquals || jLongValue < jZzr2) {
            zzeq.zzf(!zzvoVar.zzb());
            zzmg zzmgVarZza2 = zzmgVarZzf.zzb(zzvoVar, jLongValue, jLongValue, jLongValue, 0L, !zEquals ? zzxr.zza : zzmgVarZzf.zzh, !zEquals ? this.zzb : zzmgVarZzf.zzi, !zEquals ? zzgbc.zzm() : zzmgVarZzf.zzj).zza(zzvoVar);
            zzmgVarZza2.zzp = jLongValue;
            return zzmgVarZza2;
        }
        if (jLongValue != jZzr2) {
            zzeq.zzf(!zzvoVar.zzb());
            long jMax = Math.max(0L, zzmgVarZzf.zzq - (jLongValue - jZzr2));
            long j = zzmgVarZzf.zzp;
            if (zzmgVarZzf.zzk.equals(zzmgVarZzf.zzb)) {
                j = jLongValue + jMax;
            }
            zzmg zzmgVarZzb = zzmgVarZzf.zzb(zzvoVar, jLongValue, jLongValue, jLongValue, jMax, zzmgVarZzf.zzh, zzmgVarZzf.zzi, zzmgVarZzf.zzj);
            zzmgVarZzb.zzp = j;
            return zzmgVarZzb;
        }
        int iZza = zzdcVar.zza(zzmgVarZzf.zzk.zza);
        if (iZza != -1 && zzdcVar.zzd(iZza, this.zzn, false).zzd == zzdcVar.zzn(zzvoVar.zza, this.zzn).zzd) {
            return zzmgVarZzf;
        }
        zzdcVar.zzn(zzvoVar.zza, this.zzn);
        long jZzh = zzvoVar.zzb() ? this.zzn.zzh(zzvoVar.zzb, zzvoVar.zzc) : this.zzn.zze;
        zzmg zzmgVarZza3 = zzmgVarZzf.zzb(zzvoVar, zzmgVarZzf.zzr, zzmgVarZzf.zzr, zzmgVarZzf.zzd, jZzh - zzmgVarZzf.zzr, zzmgVarZzf.zzh, zzmgVarZzf.zzi, zzmgVarZzf.zzj).zza(zzvoVar);
        zzmgVarZza3.zzp = jZzh;
        return zzmgVarZza3;
    }

    private final zzmj zzae(zzmi zzmiVar) {
        int iZzW = zzW(this.zzac);
        zzdc zzdcVar = this.zzac.zza;
        if (iZzW == -1) {
            iZzW = 0;
        }
        zzer zzerVar = this.zzu;
        zzlh zzlhVar = this.zzk;
        return new zzmj(zzlhVar, zzmiVar, zzdcVar, iZzW, zzerVar, zzlhVar.zzb());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzaf(final int i, final int i2) {
        if (i == this.zzP.zzb() && i2 == this.zzP.zza()) {
            return;
        }
        this.zzP = new zzfv(i, i2);
        zzfh zzfhVar = this.zzl;
        zzfhVar.zzd(24, new zzfe() { // from class: com.google.android.gms.internal.ads.zzkj
            @Override // com.google.android.gms.internal.ads.zzfe
            public final void zza(Object obj) {
                int i3 = zzkw.zzd;
                ((zzcq) obj).zzo(i, i2);
            }
        });
        zzfhVar.zzc();
        zzag(2, 14, new zzfv(i, i2));
    }

    private final void zzag(int i, int i2, Object obj) {
        zzmn[] zzmnVarArr = this.zzh;
        int length = zzmnVarArr.length;
        for (int i3 = 0; i3 < 2; i3++) {
            zzmn zzmnVar = zzmnVarArr[i3];
            if (zzmnVar.zzb() == i) {
                zzmj zzmjVarZzae = zzae(zzmnVar);
                zzmjVarZzae.zzf(i2);
                zzmjVarZzae.zze(obj);
                zzmjVarZzae.zzd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzah() {
        zzag(1, 2, Float.valueOf(this.zzU * this.zzy.zza()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzai(Object obj) {
        ArrayList arrayList = new ArrayList();
        zzmn[] zzmnVarArr = this.zzh;
        int length = zzmnVarArr.length;
        boolean z = false;
        for (int i = 0; i < 2; i++) {
            zzmn zzmnVar = zzmnVarArr[i];
            if (zzmnVar.zzb() == 2) {
                zzmj zzmjVarZzae = zzae(zzmnVar);
                zzmjVarZzae.zzf(1);
                zzmjVarZzae.zze(obj);
                zzmjVarZzae.zzd();
                arrayList.add(zzmjVarZzae);
            }
        }
        Object obj2 = this.zzM;
        if (obj2 != null && obj2 != obj) {
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((zzmj) it.next()).zzi(this.zzB);
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
                z = true;
            }
            Object obj3 = this.zzM;
            Surface surface = this.zzN;
            if (obj3 == surface) {
                surface.release();
                this.zzN = null;
            }
        }
        this.zzM = obj;
        if (z) {
            zzaj(zzjh.zzd(new zzli(3), PointerIconCompat.TYPE_HELP));
        }
    }

    private final void zzaj(zzjh zzjhVar) {
        zzmg zzmgVar = this.zzac;
        zzmg zzmgVarZza = zzmgVar.zza(zzmgVar.zzb);
        zzmgVarZza.zzp = zzmgVarZza.zzr;
        zzmgVarZza.zzq = 0L;
        zzmg zzmgVarZze = zzmgVarZza.zze(1);
        if (zzjhVar != null) {
            zzmgVarZze = zzmgVarZze.zzd(zzjhVar);
        }
        this.zzC++;
        this.zzk.zzo();
        zzal(zzmgVarZze, 0, 1, false, 5, -9223372036854775807L, -1, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzak(boolean z, int i, int i2) {
        int i3 = 0;
        boolean z2 = z && i != -1;
        if (z2 && i != 1) {
            i3 = 1;
        }
        zzmg zzmgVar = this.zzac;
        if (zzmgVar.zzl == z2 && zzmgVar.zzm == i3) {
            return;
        }
        this.zzC++;
        boolean z3 = zzmgVar.zzo;
        zzmg zzmgVarZzc = zzmgVar.zzc(z2, i3);
        this.zzk.zzn(z2, i3);
        zzal(zzmgVarZzc, 0, i2, false, 5, -9223372036854775807L, -1, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x03dc  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x03ee  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x040f  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0411  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x042c  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0440  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x044d  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x045d  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0475 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0479  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x047f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0483  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x048a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0494  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x049b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:192:0x049f  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x04a7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:200:0x04b1  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x04be A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:205:0x04c2  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x04ca A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:210:0x04d0  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x04e4  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0299  */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v24, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v32 */
    /* JADX WARN: Type inference failed for: r8v39 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zzal(final zzmg zzmgVar, final int i, final int i2, boolean z, int i3, long j, int i4, boolean z2) {
        int i5;
        boolean z3;
        boolean z4;
        Pair pair;
        boolean z5;
        int i6;
        boolean zBooleanValue;
        final zzbu zzbuVar;
        List list;
        int i7;
        zzdc zzdcVarZzn;
        zzca zzcaVarZzu;
        boolean zEquals;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        zzzn zzznVar;
        zzzn zzznVar2;
        zzm zzmVar;
        zzdc zzdcVarZzn2;
        zzcp zzcpVar;
        boolean z10;
        zzdc zzdcVarZzn3;
        ?? r8;
        int i8;
        boolean z11;
        zzdc zzdcVarZzn4;
        boolean z12;
        zzdc zzdcVarZzn5;
        long j2;
        int i9;
        boolean z13;
        zzcp zzcpVarZze;
        int i10;
        Object obj;
        zzbu zzbuVar2;
        Object obj2;
        int i11;
        long jZzaa;
        long jZzaa2;
        Object obj3;
        zzbu zzbuVar3;
        Object obj4;
        int iZza;
        final int i12 = i3;
        zzmg zzmgVar2 = this.zzac;
        this.zzac = zzmgVar;
        boolean zEquals2 = zzmgVar2.zza.equals(zzmgVar.zza);
        zzdc zzdcVar = zzmgVar2.zza;
        zzdc zzdcVar2 = zzmgVar.zza;
        if (zzdcVar2.zzo() && zzdcVar.zzo()) {
            pair = new Pair(false, -1);
        } else {
            if (zzdcVar2.zzo() == zzdcVar.zzo()) {
                if (zzdcVar.zze(zzdcVar.zzn(zzmgVar2.zzb.zza, this.zzn).zzd, this.zza, 0L).zzc.equals(zzdcVar2.zze(zzdcVar2.zzn(zzmgVar.zzb.zza, this.zzn).zzd, this.zza, 0L).zzc)) {
                    if (!z) {
                        i5 = i12;
                        z3 = false;
                    } else if (i12 != 0) {
                        i5 = i12;
                        z3 = true;
                    } else if (zzmgVar2.zzb.zzd < zzmgVar.zzb.zzd) {
                        pair = new Pair(true, 0);
                        z4 = true;
                        i12 = 0;
                    } else {
                        z3 = true;
                        i5 = 0;
                    }
                    z4 = z3;
                    i12 = i5;
                    pair = new Pair(false, -1);
                } else {
                    if (!z) {
                        z5 = false;
                        z4 = false;
                    } else if (i12 == 0) {
                        i6 = 1;
                        z4 = true;
                        i12 = 0;
                        pair = new Pair(true, Integer.valueOf(i6));
                    } else {
                        z5 = true;
                        z4 = true;
                    }
                    if (z5 && i12 == 1) {
                        i6 = 2;
                    } else {
                        if (zEquals2) {
                            throw new IllegalStateException();
                        }
                        z4 = z5;
                        i6 = 3;
                    }
                    pair = new Pair(true, Integer.valueOf(i6));
                }
                zBooleanValue = ((Boolean) pair.first).booleanValue();
                final int iIntValue = ((Integer) pair.second).intValue();
                if (zBooleanValue) {
                    zzbuVar = null;
                } else {
                    zzbuVar = !zzmgVar.zza.zzo() ? zzmgVar.zza.zze(zzmgVar.zza.zzn(zzmgVar.zzb.zza, this.zzn).zzd, this.zza, 0L).zze : null;
                    this.zzab = zzca.zza;
                }
                if (!zBooleanValue || !zzmgVar2.zzj.equals(zzmgVar.zzj)) {
                    zzby zzbyVarZza = this.zzab.zza();
                    list = zzmgVar.zzj;
                    for (i7 = 0; i7 < list.size(); i7++) {
                        zzcd zzcdVar = (zzcd) list.get(i7);
                        for (int i13 = 0; i13 < zzcdVar.zza(); i13++) {
                            zzcdVar.zzb(i13).zza(zzbyVarZza);
                        }
                    }
                    this.zzab = zzbyVarZza.zzu();
                }
                zzdcVarZzn = zzn();
                if (zzdcVarZzn.zzo()) {
                    zzbu zzbuVar4 = zzdcVarZzn.zze(zzd(), this.zza, 0L).zze;
                    zzby zzbyVarZza2 = this.zzab.zza();
                    zzbyVarZza2.zzb(zzbuVar4.zzg);
                    zzcaVarZzu = zzbyVarZza2.zzu();
                } else {
                    zzcaVarZzu = this.zzab;
                }
                zEquals = zzcaVarZzu.equals(this.zzI);
                this.zzI = zzcaVarZzu;
                z6 = zzmgVar2.zzl == zzmgVar.zzl;
                z7 = zzmgVar2.zze == zzmgVar.zze;
                if (!z7 || z6) {
                    zzam();
                }
                boolean z14 = zzmgVar2.zzg == zzmgVar.zzg;
                if (!zEquals2) {
                    this.zzl.zzd(0, new zzfe() { // from class: com.google.android.gms.internal.ads.zzju
                        @Override // com.google.android.gms.internal.ads.zzfe
                        public final void zza(Object obj5) {
                            int i14 = zzkw.zzd;
                            ((zzcq) obj5).zzp(zzmgVar.zza, i);
                        }
                    });
                }
                if (z4) {
                    z8 = z7;
                    z9 = z14;
                } else {
                    zzcz zzczVar = new zzcz();
                    if (zzmgVar2.zza.zzo()) {
                        z8 = z7;
                        z9 = z14;
                        i10 = i4;
                        obj = null;
                        zzbuVar2 = null;
                        obj2 = null;
                        i11 = -1;
                    } else {
                        Object obj5 = zzmgVar2.zzb.zza;
                        zzmgVar2.zza.zzn(obj5, zzczVar);
                        int i14 = zzczVar.zzd;
                        int iZza2 = zzmgVar2.zza.zza(obj5);
                        z8 = z7;
                        z9 = z14;
                        obj2 = obj5;
                        obj = zzmgVar2.zza.zze(i14, this.zza, 0L).zzc;
                        zzbuVar2 = this.zza.zze;
                        i10 = i14;
                        i11 = iZza2;
                    }
                    if (i12 == 0) {
                        if (zzmgVar2.zzb.zzb()) {
                            zzvo zzvoVar = zzmgVar2.zzb;
                            jZzaa = zzczVar.zzh(zzvoVar.zzb, zzvoVar.zzc);
                            jZzaa2 = zzaa(zzmgVar2);
                            int i15 = zzgd.zza;
                            zzvo zzvoVar2 = zzmgVar2.zzb;
                            final zzcs zzcsVar = new zzcs(obj, i10, zzbuVar2, obj2, i11, zzgd.zzu(jZzaa), zzgd.zzu(jZzaa2), zzvoVar2.zzb, zzvoVar2.zzc);
                            int iZzd = zzd();
                            if (this.zzac.zza.zzo()) {
                                zzmg zzmgVar3 = this.zzac;
                                Object obj6 = zzmgVar3.zzb.zza;
                                zzmgVar3.zza.zzn(obj6, this.zzn);
                                iZza = this.zzac.zza.zza(obj6);
                                obj3 = this.zzac.zza.zze(iZzd, this.zza, 0L).zzc;
                                zzbuVar3 = this.zza.zze;
                                obj4 = obj6;
                            } else {
                                obj3 = null;
                                zzbuVar3 = null;
                                obj4 = null;
                                iZza = -1;
                            }
                            long jZzu = zzgd.zzu(j);
                            long jZzu2 = !this.zzac.zzb.zzb() ? zzgd.zzu(zzaa(this.zzac)) : jZzu;
                            zzvo zzvoVar3 = this.zzac.zzb;
                            final zzcs zzcsVar2 = new zzcs(obj3, iZzd, zzbuVar3, obj4, iZza, jZzu, jZzu2, zzvoVar3.zzb, zzvoVar3.zzc);
                            this.zzl.zzd(11, new zzfe() { // from class: com.google.android.gms.internal.ads.zzjz
                                @Override // com.google.android.gms.internal.ads.zzfe
                                public final void zza(Object obj7) {
                                    int i16 = zzkw.zzd;
                                    ((zzcq) obj7).zzm(zzcsVar, zzcsVar2, i12);
                                }
                            });
                        } else {
                            jZzaa = zzmgVar2.zzb.zze != -1 ? zzaa(this.zzac) : zzczVar.zze;
                            jZzaa2 = jZzaa;
                            int i152 = zzgd.zza;
                            zzvo zzvoVar22 = zzmgVar2.zzb;
                            final zzcs zzcsVar3 = new zzcs(obj, i10, zzbuVar2, obj2, i11, zzgd.zzu(jZzaa), zzgd.zzu(jZzaa2), zzvoVar22.zzb, zzvoVar22.zzc);
                            int iZzd2 = zzd();
                            if (this.zzac.zza.zzo()) {
                            }
                            long jZzu3 = zzgd.zzu(j);
                            if (!this.zzac.zzb.zzb()) {
                            }
                            zzvo zzvoVar32 = this.zzac.zzb;
                            final zzcs zzcsVar22 = new zzcs(obj3, iZzd2, zzbuVar3, obj4, iZza, jZzu3, jZzu2, zzvoVar32.zzb, zzvoVar32.zzc);
                            this.zzl.zzd(11, new zzfe() { // from class: com.google.android.gms.internal.ads.zzjz
                                @Override // com.google.android.gms.internal.ads.zzfe
                                public final void zza(Object obj7) {
                                    int i16 = zzkw.zzd;
                                    ((zzcq) obj7).zzm(zzcsVar3, zzcsVar22, i12);
                                }
                            });
                        }
                    } else if (zzmgVar2.zzb.zzb()) {
                        jZzaa = zzmgVar2.zzr;
                        jZzaa2 = zzaa(zzmgVar2);
                        int i1522 = zzgd.zza;
                        zzvo zzvoVar222 = zzmgVar2.zzb;
                        final zzcs zzcsVar32 = new zzcs(obj, i10, zzbuVar2, obj2, i11, zzgd.zzu(jZzaa), zzgd.zzu(jZzaa2), zzvoVar222.zzb, zzvoVar222.zzc);
                        int iZzd22 = zzd();
                        if (this.zzac.zza.zzo()) {
                        }
                        long jZzu32 = zzgd.zzu(j);
                        if (!this.zzac.zzb.zzb()) {
                        }
                        zzvo zzvoVar322 = this.zzac.zzb;
                        final zzcs zzcsVar222 = new zzcs(obj3, iZzd22, zzbuVar3, obj4, iZza, jZzu32, jZzu2, zzvoVar322.zzb, zzvoVar322.zzc);
                        this.zzl.zzd(11, new zzfe() { // from class: com.google.android.gms.internal.ads.zzjz
                            @Override // com.google.android.gms.internal.ads.zzfe
                            public final void zza(Object obj7) {
                                int i16 = zzkw.zzd;
                                ((zzcq) obj7).zzm(zzcsVar32, zzcsVar222, i12);
                            }
                        });
                    } else {
                        jZzaa = zzmgVar2.zzr;
                        jZzaa2 = jZzaa;
                        int i15222 = zzgd.zza;
                        zzvo zzvoVar2222 = zzmgVar2.zzb;
                        final zzcs zzcsVar322 = new zzcs(obj, i10, zzbuVar2, obj2, i11, zzgd.zzu(jZzaa), zzgd.zzu(jZzaa2), zzvoVar2222.zzb, zzvoVar2222.zzc);
                        int iZzd222 = zzd();
                        if (this.zzac.zza.zzo()) {
                        }
                        long jZzu322 = zzgd.zzu(j);
                        if (!this.zzac.zzb.zzb()) {
                        }
                        zzvo zzvoVar3222 = this.zzac.zzb;
                        final zzcs zzcsVar2222 = new zzcs(obj3, iZzd222, zzbuVar3, obj4, iZza, jZzu322, jZzu2, zzvoVar3222.zzb, zzvoVar3222.zzc);
                        this.zzl.zzd(11, new zzfe() { // from class: com.google.android.gms.internal.ads.zzjz
                            @Override // com.google.android.gms.internal.ads.zzfe
                            public final void zza(Object obj7) {
                                int i16 = zzkw.zzd;
                                ((zzcq) obj7).zzm(zzcsVar322, zzcsVar2222, i12);
                            }
                        });
                    }
                }
                if (!zBooleanValue) {
                    this.zzl.zzd(1, new zzfe() { // from class: com.google.android.gms.internal.ads.zzkb
                        @Override // com.google.android.gms.internal.ads.zzfe
                        public final void zza(Object obj7) {
                            int i16 = zzkw.zzd;
                            ((zzcq) obj7).zzd(zzbuVar, iIntValue);
                        }
                    });
                }
                if (zzmgVar2.zzf != zzmgVar.zzf) {
                    this.zzl.zzd(10, new zzfe() { // from class: com.google.android.gms.internal.ads.zzkc
                        @Override // com.google.android.gms.internal.ads.zzfe
                        public final void zza(Object obj7) {
                            int i16 = zzkw.zzd;
                            ((zzcq) obj7).zzk(zzmgVar.zzf);
                        }
                    });
                    if (zzmgVar.zzf != null) {
                        this.zzl.zzd(10, new zzfe() { // from class: com.google.android.gms.internal.ads.zzkd
                            @Override // com.google.android.gms.internal.ads.zzfe
                            public final void zza(Object obj7) {
                                int i16 = zzkw.zzd;
                                ((zzcq) obj7).zzj(zzmgVar.zzf);
                            }
                        });
                    }
                }
                zzznVar = zzmgVar2.zzi;
                zzznVar2 = zzmgVar.zzi;
                if (zzznVar != zzznVar2) {
                    this.zzi.zzq(zzznVar2.zze);
                    this.zzl.zzd(2, new zzfe() { // from class: com.google.android.gms.internal.ads.zzke
                        @Override // com.google.android.gms.internal.ads.zzfe
                        public final void zza(Object obj7) {
                            int i16 = zzkw.zzd;
                            ((zzcq) obj7).zzq(zzmgVar.zzi.zzd);
                        }
                    });
                }
                if (!zEquals) {
                    final zzca zzcaVar = this.zzI;
                    this.zzl.zzd(14, new zzfe() { // from class: com.google.android.gms.internal.ads.zzkf
                        @Override // com.google.android.gms.internal.ads.zzfe
                        public final void zza(Object obj7) {
                            int i16 = zzkw.zzd;
                            ((zzcq) obj7).zze(zzcaVar);
                        }
                    });
                }
                if (z9) {
                    this.zzl.zzd(3, new zzfe() { // from class: com.google.android.gms.internal.ads.zzkg
                        @Override // com.google.android.gms.internal.ads.zzfe
                        public final void zza(Object obj7) {
                            int i16 = zzkw.zzd;
                            ((zzcq) obj7).zzb(zzmgVar.zzg);
                        }
                    });
                }
                if (!z8 || z6) {
                    this.zzl.zzd(-1, new zzfe() { // from class: com.google.android.gms.internal.ads.zzkh
                        @Override // com.google.android.gms.internal.ads.zzfe
                        public final void zza(Object obj7) {
                            int i16 = zzkw.zzd;
                            zzmg zzmgVar4 = zzmgVar;
                            ((zzcq) obj7).zzl(zzmgVar4.zzl, zzmgVar4.zze);
                        }
                    });
                }
                if (z8) {
                    this.zzl.zzd(4, new zzfe() { // from class: com.google.android.gms.internal.ads.zzki
                        @Override // com.google.android.gms.internal.ads.zzfe
                        public final void zza(Object obj7) {
                            int i16 = zzkw.zzd;
                            ((zzcq) obj7).zzh(zzmgVar.zze);
                        }
                    });
                }
                if (z6) {
                    this.zzl.zzd(5, new zzfe() { // from class: com.google.android.gms.internal.ads.zzjv
                        @Override // com.google.android.gms.internal.ads.zzfe
                        public final void zza(Object obj7) {
                            int i16 = zzkw.zzd;
                            ((zzcq) obj7).zzf(zzmgVar.zzl, i2);
                        }
                    });
                }
                if (zzmgVar2.zzm != zzmgVar.zzm) {
                    this.zzl.zzd(6, new zzfe() { // from class: com.google.android.gms.internal.ads.zzjw
                        @Override // com.google.android.gms.internal.ads.zzfe
                        public final void zza(Object obj7) {
                            int i16 = zzkw.zzd;
                            ((zzcq) obj7).zzi(zzmgVar.zzm);
                        }
                    });
                }
                if (zzmgVar2.zzi() != zzmgVar.zzi()) {
                    this.zzl.zzd(7, new zzfe() { // from class: com.google.android.gms.internal.ads.zzjx
                        @Override // com.google.android.gms.internal.ads.zzfe
                        public final void zza(Object obj7) {
                            int i16 = zzkw.zzd;
                            ((zzcq) obj7).zzc(zzmgVar.zzi());
                        }
                    });
                }
                if (!zzmgVar2.zzn.equals(zzmgVar.zzn)) {
                    this.zzl.zzd(12, new zzfe() { // from class: com.google.android.gms.internal.ads.zzjy
                        @Override // com.google.android.gms.internal.ads.zzfe
                        public final void zza(Object obj7) {
                            int i16 = zzkw.zzd;
                            ((zzcq) obj7).zzg(zzmgVar.zzn);
                        }
                    });
                }
                zzcp zzcpVar2 = this.zzH;
                zzct zzctVar = this.zzg;
                zzcp zzcpVar3 = this.zzc;
                int i16 = zzgd.zza;
                boolean zZzx = zzctVar.zzx();
                zzmVar = (zzm) zzctVar;
                zzdcVarZzn2 = zzmVar.zzn();
                if (zzdcVarZzn2.zzo()) {
                    zzcpVar = zzcpVar2;
                    z10 = zzdcVarZzn2.zze(zzmVar.zzd(), zzmVar.zza, 0L).zzi;
                    zzdcVarZzn3 = zzmVar.zzn();
                    if (zzdcVarZzn3.zzo()) {
                        i8 = -1;
                        r8 = 0;
                        z11 = false;
                    } else {
                        int iZzd3 = zzmVar.zzd();
                        zzmVar.zzh();
                        zzmVar.zzw();
                        r8 = 0;
                        r8 = 0;
                        int iZzk = zzdcVarZzn3.zzk(iZzd3, 0, false);
                        i8 = -1;
                        z11 = iZzk != -1;
                    }
                    zzdcVarZzn4 = zzmVar.zzn();
                    if (zzdcVarZzn4.zzo()) {
                        z12 = r8;
                    } else {
                        int iZzd4 = zzmVar.zzd();
                        zzmVar.zzh();
                        zzmVar.zzw();
                        if (zzdcVarZzn4.zzj(iZzd4, r8, r8) != i8) {
                            z12 = true;
                        }
                    }
                    zzdcVarZzn5 = zzmVar.zzn();
                    if (!zzdcVarZzn5.zzo()) {
                        j2 = 0;
                        boolean z15 = zzdcVarZzn5.zze(zzmVar.zzd(), zzmVar.zza, 0L).zzb();
                        zzdc zzdcVarZzn6 = zzmVar.zzn();
                        boolean z16 = zzdcVarZzn6.zzo() && zzdcVarZzn6.zze(zzmVar.zzd(), zzmVar.zza, j2).zzj;
                        boolean zZzo = zzctVar.zzn().zzo();
                        zzcn zzcnVar = new zzcn();
                        zzcnVar.zzb(zzcpVar3);
                        boolean z17 = !zZzx;
                        zzcnVar.zzd(4, z17);
                        zzcnVar.zzd(5, (z10 || zZzx) ? false : true);
                        zzcnVar.zzd(6, (z11 || zZzx) ? false : true);
                        zzcnVar.zzd(7, zZzo && (z11 || !z15 || z10) && !zZzx);
                        zzcnVar.zzd(8, (z12 || zZzx) ? false : true);
                        zzcnVar.zzd(9, zZzo && (z12 || (z15 && z16)) && !zZzx);
                        zzcnVar.zzd(10, z17);
                        zzcnVar.zzd(11, (z10 || zZzx) ? false : true);
                        if (z10 || zZzx) {
                            i9 = 12;
                            z13 = false;
                        } else {
                            i9 = 12;
                            z13 = true;
                        }
                        zzcnVar.zzd(i9, z13);
                        zzcpVarZze = zzcnVar.zze();
                        this.zzH = zzcpVarZze;
                        if (!zzcpVarZze.equals(zzcpVar)) {
                            this.zzl.zzd(13, new zzfe() { // from class: com.google.android.gms.internal.ads.zzjt
                                @Override // com.google.android.gms.internal.ads.zzfe
                                public final void zza(Object obj7) {
                                    this.zza.zzU((zzcq) obj7);
                                }
                            });
                        }
                        this.zzl.zzc();
                        boolean z18 = zzmgVar2.zzo;
                        boolean z19 = zzmgVar.zzo;
                    }
                    j2 = 0;
                    zzdc zzdcVarZzn62 = zzmVar.zzn();
                    if (zzdcVarZzn62.zzo()) {
                    }
                    boolean zZzo2 = zzctVar.zzn().zzo();
                    zzcn zzcnVar2 = new zzcn();
                    zzcnVar2.zzb(zzcpVar3);
                    boolean z172 = !zZzx;
                    zzcnVar2.zzd(4, z172);
                    zzcnVar2.zzd(5, (z10 || zZzx) ? false : true);
                    zzcnVar2.zzd(6, (z11 || zZzx) ? false : true);
                    zzcnVar2.zzd(7, zZzo2 && (z11 || !z15 || z10) && !zZzx);
                    zzcnVar2.zzd(8, (z12 || zZzx) ? false : true);
                    zzcnVar2.zzd(9, zZzo2 && (z12 || (z15 && z16)) && !zZzx);
                    zzcnVar2.zzd(10, z172);
                    zzcnVar2.zzd(11, (z10 || zZzx) ? false : true);
                    if (z10) {
                        i9 = 12;
                        z13 = false;
                    }
                    zzcnVar2.zzd(i9, z13);
                    zzcpVarZze = zzcnVar2.zze();
                    this.zzH = zzcpVarZze;
                    if (!zzcpVarZze.equals(zzcpVar)) {
                    }
                    this.zzl.zzc();
                    boolean z182 = zzmgVar2.zzo;
                    boolean z192 = zzmgVar.zzo;
                }
                zzcpVar = zzcpVar2;
                zzdcVarZzn3 = zzmVar.zzn();
                if (zzdcVarZzn3.zzo()) {
                }
                zzdcVarZzn4 = zzmVar.zzn();
                if (zzdcVarZzn4.zzo()) {
                }
                zzdcVarZzn5 = zzmVar.zzn();
                if (!zzdcVarZzn5.zzo()) {
                }
                zzdc zzdcVarZzn622 = zzmVar.zzn();
                if (zzdcVarZzn622.zzo()) {
                }
                boolean zZzo22 = zzctVar.zzn().zzo();
                zzcn zzcnVar22 = new zzcn();
                zzcnVar22.zzb(zzcpVar3);
                boolean z1722 = !zZzx;
                zzcnVar22.zzd(4, z1722);
                zzcnVar22.zzd(5, (z10 || zZzx) ? false : true);
                zzcnVar22.zzd(6, (z11 || zZzx) ? false : true);
                zzcnVar22.zzd(7, zZzo22 && (z11 || !z15 || z10) && !zZzx);
                zzcnVar22.zzd(8, (z12 || zZzx) ? false : true);
                zzcnVar22.zzd(9, zZzo22 && (z12 || (z15 && z16)) && !zZzx);
                zzcnVar22.zzd(10, z1722);
                zzcnVar22.zzd(11, (z10 || zZzx) ? false : true);
                if (z10) {
                }
                zzcnVar22.zzd(i9, z13);
                zzcpVarZze = zzcnVar22.zze();
                this.zzH = zzcpVarZze;
                if (!zzcpVarZze.equals(zzcpVar)) {
                }
                this.zzl.zzc();
                boolean z1822 = zzmgVar2.zzo;
                boolean z1922 = zzmgVar.zzo;
            }
            pair = new Pair(true, 3);
        }
        z4 = z;
        zBooleanValue = ((Boolean) pair.first).booleanValue();
        final int iIntValue2 = ((Integer) pair.second).intValue();
        if (zBooleanValue) {
        }
        if (!zBooleanValue) {
            zzby zzbyVarZza3 = this.zzab.zza();
            list = zzmgVar.zzj;
            while (i7 < list.size()) {
            }
            this.zzab = zzbyVarZza3.zzu();
        }
        zzdcVarZzn = zzn();
        if (zzdcVarZzn.zzo()) {
        }
        zEquals = zzcaVarZzu.equals(this.zzI);
        this.zzI = zzcaVarZzu;
        if (zzmgVar2.zzl == zzmgVar.zzl) {
        }
        if (zzmgVar2.zze == zzmgVar.zze) {
        }
        if (!z7) {
            zzam();
        }
        if (zzmgVar2.zzg == zzmgVar.zzg) {
        }
        if (!zEquals2) {
        }
        if (z4) {
        }
        if (!zBooleanValue) {
        }
        if (zzmgVar2.zzf != zzmgVar.zzf) {
        }
        zzznVar = zzmgVar2.zzi;
        zzznVar2 = zzmgVar.zzi;
        if (zzznVar != zzznVar2) {
        }
        if (!zEquals) {
        }
        if (z9) {
        }
        if (!z8) {
            this.zzl.zzd(-1, new zzfe() { // from class: com.google.android.gms.internal.ads.zzkh
                @Override // com.google.android.gms.internal.ads.zzfe
                public final void zza(Object obj7) {
                    int i162 = zzkw.zzd;
                    zzmg zzmgVar4 = zzmgVar;
                    ((zzcq) obj7).zzl(zzmgVar4.zzl, zzmgVar4.zze);
                }
            });
        }
        if (z8) {
        }
        if (z6) {
        }
        if (zzmgVar2.zzm != zzmgVar.zzm) {
        }
        if (zzmgVar2.zzi() != zzmgVar.zzi()) {
        }
        if (!zzmgVar2.zzn.equals(zzmgVar.zzn)) {
        }
        zzcp zzcpVar22 = this.zzH;
        zzct zzctVar2 = this.zzg;
        zzcp zzcpVar32 = this.zzc;
        int i162 = zzgd.zza;
        boolean zZzx2 = zzctVar2.zzx();
        zzmVar = (zzm) zzctVar2;
        zzdcVarZzn2 = zzmVar.zzn();
        if (zzdcVarZzn2.zzo()) {
        }
        zzdcVarZzn3 = zzmVar.zzn();
        if (zzdcVarZzn3.zzo()) {
        }
        zzdcVarZzn4 = zzmVar.zzn();
        if (zzdcVarZzn4.zzo()) {
        }
        zzdcVarZzn5 = zzmVar.zzn();
        if (!zzdcVarZzn5.zzo()) {
        }
        zzdc zzdcVarZzn6222 = zzmVar.zzn();
        if (zzdcVarZzn6222.zzo()) {
        }
        boolean zZzo222 = zzctVar2.zzn().zzo();
        zzcn zzcnVar222 = new zzcn();
        zzcnVar222.zzb(zzcpVar32);
        boolean z17222 = !zZzx2;
        zzcnVar222.zzd(4, z17222);
        zzcnVar222.zzd(5, (z10 || zZzx2) ? false : true);
        zzcnVar222.zzd(6, (z11 || zZzx2) ? false : true);
        zzcnVar222.zzd(7, zZzo222 && (z11 || !z15 || z10) && !zZzx2);
        zzcnVar222.zzd(8, (z12 || zZzx2) ? false : true);
        zzcnVar222.zzd(9, zZzo222 && (z12 || (z15 && z16)) && !zZzx2);
        zzcnVar222.zzd(10, z17222);
        zzcnVar222.zzd(11, (z10 || zZzx2) ? false : true);
        if (z10) {
        }
        zzcnVar222.zzd(i9, z13);
        zzcpVarZze = zzcnVar222.zze();
        this.zzH = zzcpVarZze;
        if (!zzcpVarZze.equals(zzcpVar)) {
        }
        this.zzl.zzc();
        boolean z18222 = zzmgVar2.zzo;
        boolean z19222 = zzmgVar.zzo;
    }

    private final void zzam() {
        int iZzf = zzf();
        if (iZzf == 2 || iZzf == 3) {
            zzan();
            boolean z = this.zzac.zzo;
            zzv();
            zzv();
        }
    }

    private final void zzan() {
        this.zze.zzb();
        if (Thread.currentThread() != this.zzs.getThread()) {
            String str = String.format(Locale.US, "Player is accessed on the wrong thread.\nCurrent thread: '%s'\nExpected thread: '%s'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread", Thread.currentThread().getName(), this.zzs.getThread().getName());
            if (this.zzX) {
                throw new IllegalStateException(str);
            }
            zzfk.zzg("ExoPlayerImpl", str, this.zzY ? null : new IllegalStateException());
            this.zzY = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzjr
    public final void zzA(zzna zznaVar) {
        zzan();
        this.zzr.zzQ(zznaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzjr
    public final void zzB(zzvq zzvqVar) {
        zzan();
        List listSingletonList = Collections.singletonList(zzvqVar);
        zzan();
        zzan();
        zzW(this.zzac);
        zzk();
        this.zzC++;
        if (!this.zzo.isEmpty()) {
            int size = this.zzo.size();
            for (int i = size - 1; i >= 0; i--) {
                this.zzo.remove(i);
            }
            this.zzag = this.zzag.zzh(0, size);
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < listSingletonList.size(); i2++) {
            zzmd zzmdVar = new zzmd((zzvq) listSingletonList.get(i2), this.zzp);
            arrayList.add(zzmdVar);
            this.zzo.add(i2, new zzkv(zzmdVar.zzb, zzmdVar.zza));
        }
        this.zzag = this.zzag.zzg(0, arrayList.size());
        zzml zzmlVar = new zzml(this.zzo, this.zzag);
        if (!zzmlVar.zzo() && zzmlVar.zzc() < 0) {
            throw new zzar(zzmlVar, -1, -9223372036854775807L);
        }
        int iZzg = zzmlVar.zzg(false);
        zzmg zzmgVarZzad = zzad(this.zzac, zzmlVar, zzac(zzmlVar, iZzg, -9223372036854775807L));
        int i3 = zzmgVarZzad.zze;
        if (iZzg != -1 && i3 != 1) {
            i3 = 4;
            if (!zzmlVar.zzo() && iZzg < zzmlVar.zzc()) {
                i3 = 2;
            }
        }
        zzmg zzmgVarZze = zzmgVarZzad.zze(i3);
        this.zzk.zzq(arrayList, iZzg, zzgd.zzr(-9223372036854775807L), this.zzag);
        zzal(zzmgVarZze, 0, 1, (this.zzac.zzb.zza.equals(zzmgVarZze.zzb.zza) || this.zzac.zza.zzo()) ? false : true, 4, zzZ(zzmgVarZze), -1, false);
    }

    public final zzjh zzE() {
        zzan();
        return this.zzac.zzf;
    }

    final /* synthetic */ void zzS(zzlf zzlfVar) {
        long j;
        boolean z;
        int i = this.zzC - zzlfVar.zzb;
        this.zzC = i;
        boolean z2 = true;
        if (zzlfVar.zzc) {
            this.zzD = zzlfVar.zzd;
            this.zzE = true;
        }
        if (zzlfVar.zze) {
            this.zzF = zzlfVar.zzf;
        }
        if (i == 0) {
            zzdc zzdcVar = zzlfVar.zza.zza;
            if (!this.zzac.zza.zzo() && zzdcVar.zzo()) {
                this.zzad = -1;
                this.zzae = 0L;
            }
            if (!zzdcVar.zzo()) {
                List listZzw = ((zzml) zzdcVar).zzw();
                zzeq.zzf(listZzw.size() == this.zzo.size());
                for (int i2 = 0; i2 < listZzw.size(); i2++) {
                    ((zzkv) this.zzo.get(i2)).zzc((zzdc) listZzw.get(i2));
                }
            }
            if (this.zzE) {
                if (zzlfVar.zza.zzb.equals(this.zzac.zzb) && zzlfVar.zza.zzd == this.zzac.zzr) {
                    z2 = false;
                }
                if (!z2) {
                    j = -9223372036854775807L;
                } else if (zzdcVar.zzo() || zzlfVar.zza.zzb.zzb()) {
                    j = zzlfVar.zza.zzd;
                } else {
                    zzmg zzmgVar = zzlfVar.zza;
                    zzvo zzvoVar = zzmgVar.zzb;
                    j = zzmgVar.zzd;
                    zzab(zzdcVar, zzvoVar, j);
                }
                z = z2;
            } else {
                j = -9223372036854775807L;
                z = false;
            }
            this.zzE = false;
            zzal(zzlfVar.zza, 1, this.zzF, z, this.zzD, j, -1, false);
        }
    }

    final /* synthetic */ void zzT(final zzlf zzlfVar) {
        this.zzj.zzh(new Runnable() { // from class: com.google.android.gms.internal.ads.zzkl
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzS(zzlfVar);
            }
        });
    }

    final /* synthetic */ void zzU(zzcq zzcqVar) {
        zzcqVar.zza(this.zzH);
    }

    @Override // com.google.android.gms.internal.ads.zzm
    public final void zza(int i, long j, int i2, boolean z) {
        zzan();
        if (i == -1) {
            return;
        }
        zzeq.zzd(i >= 0);
        zzdc zzdcVar = this.zzac.zza;
        if (zzdcVar.zzo() || i < zzdcVar.zzc()) {
            this.zzr.zzu();
            this.zzC++;
            if (zzx()) {
                zzfk.zzf("ExoPlayerImpl", "seekTo ignored because an ad is playing");
                zzlf zzlfVar = new zzlf(this.zzac);
                zzlfVar.zza(1);
                this.zzaf.zza.zzT(zzlfVar);
                return;
            }
            zzmg zzmgVarZze = this.zzac;
            int i3 = zzmgVarZze.zze;
            if (i3 == 3 || (i3 == 4 && !zzdcVar.zzo())) {
                zzmgVarZze = this.zzac.zze(2);
            }
            int iZzd = zzd();
            zzmg zzmgVarZzad = zzad(zzmgVarZze, zzdcVar, zzac(zzdcVar, i, j));
            this.zzk.zzl(zzdcVar, i, zzgd.zzr(j));
            zzal(zzmgVarZzad, 0, 1, true, 1, zzZ(zzmgVarZzad), iZzd, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzct
    public final int zzb() {
        zzan();
        if (zzx()) {
            return this.zzac.zzb.zzb;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzct
    public final int zzc() {
        zzan();
        if (zzx()) {
            return this.zzac.zzb.zzc;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzct
    public final int zzd() {
        zzan();
        int iZzW = zzW(this.zzac);
        if (iZzW == -1) {
            return 0;
        }
        return iZzW;
    }

    @Override // com.google.android.gms.internal.ads.zzct
    public final int zze() {
        zzan();
        if (this.zzac.zza.zzo()) {
            return 0;
        }
        zzmg zzmgVar = this.zzac;
        return zzmgVar.zza.zza(zzmgVar.zzb.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzct
    public final int zzf() {
        zzan();
        return this.zzac.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzct
    public final int zzg() {
        zzan();
        return this.zzac.zzm;
    }

    @Override // com.google.android.gms.internal.ads.zzct
    public final int zzh() {
        zzan();
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzct
    public final long zzi() {
        zzan();
        if (zzx()) {
            zzmg zzmgVar = this.zzac;
            return zzmgVar.zzk.equals(zzmgVar.zzb) ? zzgd.zzu(this.zzac.zzp) : zzl();
        }
        zzan();
        if (this.zzac.zza.zzo()) {
            return this.zzae;
        }
        zzmg zzmgVar2 = this.zzac;
        long j = 0;
        if (zzmgVar2.zzk.zzd != zzmgVar2.zzb.zzd) {
            return zzgd.zzu(zzmgVar2.zza.zze(zzd(), this.zza, 0L).zzo);
        }
        long j2 = zzmgVar2.zzp;
        if (this.zzac.zzk.zzb()) {
            zzmg zzmgVar3 = this.zzac;
            zzmgVar3.zza.zzn(zzmgVar3.zzk.zza, this.zzn).zzi(this.zzac.zzk.zzb);
        } else {
            j = j2;
        }
        zzmg zzmgVar4 = this.zzac;
        zzab(zzmgVar4.zza, zzmgVar4.zzk, j);
        return zzgd.zzu(j);
    }

    @Override // com.google.android.gms.internal.ads.zzct
    public final long zzj() {
        zzan();
        return zzY(this.zzac);
    }

    @Override // com.google.android.gms.internal.ads.zzct
    public final long zzk() {
        zzan();
        return zzgd.zzu(zzZ(this.zzac));
    }

    @Override // com.google.android.gms.internal.ads.zzct
    public final long zzl() {
        zzan();
        if (zzx()) {
            zzmg zzmgVar = this.zzac;
            zzvo zzvoVar = zzmgVar.zzb;
            zzmgVar.zza.zzn(zzvoVar.zza, this.zzn);
            return zzgd.zzu(this.zzn.zzh(zzvoVar.zzb, zzvoVar.zzc));
        }
        zzdc zzdcVarZzn = zzn();
        if (zzdcVarZzn.zzo()) {
            return -9223372036854775807L;
        }
        return zzgd.zzu(zzdcVarZzn.zze(zzd(), this.zza, 0L).zzo);
    }

    @Override // com.google.android.gms.internal.ads.zzct
    public final long zzm() {
        zzan();
        return zzgd.zzu(this.zzac.zzq);
    }

    @Override // com.google.android.gms.internal.ads.zzct
    public final zzdc zzn() {
        zzan();
        return this.zzac.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzct
    public final zzdp zzo() {
        zzan();
        return this.zzac.zzi.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzct
    public final void zzp() {
        zzan();
        zziv zzivVar = this.zzy;
        boolean zZzv = zzv();
        int iZzb = zzivVar.zzb(zZzv, 2);
        zzak(zZzv, iZzb, zzX(zZzv, iZzb));
        zzmg zzmgVar = this.zzac;
        if (zzmgVar.zze != 1) {
            return;
        }
        zzmg zzmgVarZzd = zzmgVar.zzd(null);
        zzmg zzmgVarZze = zzmgVarZzd.zze(true == zzmgVarZzd.zza.zzo() ? 4 : 2);
        this.zzC++;
        this.zzk.zzk();
        zzal(zzmgVarZze, 1, 1, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // com.google.android.gms.internal.ads.zzct
    public final void zzq() {
        zzfk.zze("ExoPlayerImpl", "Release " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.4.0-alpha01] [" + zzgd.zze + "] [" + zzbv.zza() + "]");
        zzan();
        this.zzy.zzd();
        if (!this.zzk.zzp()) {
            zzfh zzfhVar = this.zzl;
            zzfhVar.zzd(10, new zzfe() { // from class: com.google.android.gms.internal.ads.zzkk
                @Override // com.google.android.gms.internal.ads.zzfe
                public final void zza(Object obj) {
                    ((zzcq) obj).zzj(zzjh.zzd(new zzli(1), PointerIconCompat.TYPE_HELP));
                }
            });
            zzfhVar.zzc();
        }
        this.zzl.zze();
        this.zzj.zze(null);
        this.zzt.zzf(this.zzr);
        boolean z = this.zzac.zzo;
        zzmg zzmgVarZze = this.zzac.zze(1);
        this.zzac = zzmgVarZze;
        zzmg zzmgVarZza = zzmgVarZze.zza(zzmgVarZze.zzb);
        this.zzac = zzmgVarZza;
        zzmgVarZza.zzp = zzmgVarZza.zzr;
        this.zzac.zzq = 0L;
        this.zzr.zzP();
        this.zzi.zzj();
        Surface surface = this.zzN;
        if (surface != null) {
            surface.release();
            this.zzN = null;
        }
        this.zzW = zzek.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzct
    public final void zzr(boolean z) {
        zzan();
        int iZzb = this.zzy.zzb(z, zzf());
        zzak(z, iZzb, zzX(z, iZzb));
    }

    @Override // com.google.android.gms.internal.ads.zzct
    public final void zzs(Surface surface) {
        zzan();
        zzai(surface);
        int i = surface == null ? 0 : -1;
        zzaf(i, i);
    }

    @Override // com.google.android.gms.internal.ads.zzct
    public final void zzt(float f) {
        zzan();
        final float fMax = Math.max(0.0f, Math.min(f, 1.0f));
        if (this.zzU == fMax) {
            return;
        }
        this.zzU = fMax;
        zzah();
        zzfh zzfhVar = this.zzl;
        zzfhVar.zzd(22, new zzfe() { // from class: com.google.android.gms.internal.ads.zzka
            @Override // com.google.android.gms.internal.ads.zzfe
            public final void zza(Object obj) {
                int i = zzkw.zzd;
                ((zzcq) obj).zzs(fMax);
            }
        });
        zzfhVar.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzct
    public final void zzu() {
        zzan();
        this.zzy.zzb(zzv(), 1);
        zzaj(null);
        this.zzW = new zzek(zzgbc.zzm(), this.zzac.zzr);
    }

    @Override // com.google.android.gms.internal.ads.zzct
    public final boolean zzv() {
        zzan();
        return this.zzac.zzl;
    }

    @Override // com.google.android.gms.internal.ads.zzct
    public final boolean zzw() {
        zzan();
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzct
    public final boolean zzx() {
        zzan();
        return this.zzac.zzb.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzjr
    public final int zzy() {
        zzan();
        int length = this.zzh.length;
        return 2;
    }

    @Override // com.google.android.gms.internal.ads.zzjr
    public final void zzz(zzna zznaVar) {
        this.zzr.zzt(zznaVar);
    }
}
