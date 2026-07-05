package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.view.Surface;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.net.SocketException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzcgq extends zzcdv implements zzie, zzna {
    public static final /* synthetic */ int zza = 0;
    private final Context zzb;
    private final zzcgb zzc;
    private final zzze zzd;
    private final zzced zze;
    private final WeakReference zzf;
    private final zzwu zzg;
    private zzjr zzh;
    private ByteBuffer zzi;
    private boolean zzj;
    private zzcdu zzk;
    private int zzl;
    private int zzm;
    private long zzn;
    private final String zzo;
    private final int zzp;
    private Integer zzr;
    private final ArrayList zzs;
    private volatile zzcgd zzt;
    private final Object zzq = new Object();
    private final Set zzu = new HashSet();

    /* JADX WARN: Removed duplicated region for block: B:21:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00e9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzcgq(Context context, zzced zzcedVar, zzcee zzceeVar, Integer num) {
        final zzha zzhaVar;
        this.zzb = context;
        this.zze = zzcedVar;
        this.zzr = num;
        this.zzf = new WeakReference(zzceeVar);
        zzcgb zzcgbVar = new zzcgb();
        this.zzc = zzcgbVar;
        zzze zzzeVar = new zzze(context);
        this.zzd = zzzeVar;
        if (com.google.android.gms.ads.internal.util.zze.zzc()) {
            com.google.android.gms.ads.internal.util.zze.zza("SimpleExoPlayerAdapter initialize ".concat(toString()));
        }
        zzD().incrementAndGet();
        zzms zzmsVar = new zzms(context, new zzcgn(this));
        zzmsVar.zzb(zzzeVar);
        zzmsVar.zza(zzcgbVar);
        zzmt zzmtVarZzc = zzmsVar.zzc();
        this.zzh = zzmtVarZzc;
        zzmtVarZzc.zzz(this);
        this.zzl = 0;
        this.zzn = 0L;
        this.zzm = 0;
        this.zzs = new ArrayList();
        this.zzt = null;
        this.zzo = (String) zzfyb.zzd(zzceeVar != null ? zzceeVar.zzr() : null).zzb("");
        this.zzp = zzceeVar != null ? zzceeVar.zzf() : 0;
        final String strZzc = com.google.android.gms.ads.internal.zzu.zzp().zzc(context, zzceeVar.zzn().afmaVersion);
        if (!this.zzj || this.zzi.limit() <= 0) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzbZ)).booleanValue()) {
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzbR)).booleanValue()) {
                    final boolean z = zzcedVar.zzj ? false : true;
                    final zzha zzhaVar2 = zzcedVar.zzm ? new zzha() { // from class: com.google.android.gms.internal.ads.zzcgh
                        @Override // com.google.android.gms.internal.ads.zzha
                        public final zzhb zza() {
                            return this.zza.zzW(strZzc, z);
                        }
                    } : zzcedVar.zzi > 0 ? new zzha() { // from class: com.google.android.gms.internal.ads.zzcgi
                        @Override // com.google.android.gms.internal.ads.zzha
                        public final zzhb zza() {
                            return this.zza.zzX(strZzc, z);
                        }
                    } : new zzha() { // from class: com.google.android.gms.internal.ads.zzcgj
                        @Override // com.google.android.gms.internal.ads.zzha
                        public final zzhb zza() {
                            return this.zza.zzY(strZzc, z);
                        }
                    };
                    zzhaVar = zzcedVar.zzj ? new zzha() { // from class: com.google.android.gms.internal.ads.zzcgk
                        @Override // com.google.android.gms.internal.ads.zzha
                        public final zzhb zza() {
                            return this.zza.zzZ(zzhaVar2);
                        }
                    } : zzhaVar2;
                    ByteBuffer byteBuffer = this.zzi;
                    if (byteBuffer != null && byteBuffer.limit() > 0) {
                        final byte[] bArr = new byte[this.zzi.limit()];
                        this.zzi.get(bArr);
                        zzhaVar = new zzha() { // from class: com.google.android.gms.internal.ads.zzcgl
                            @Override // com.google.android.gms.internal.ads.zzha
                            public final zzhb zza() {
                                int i = zzcgq.zza;
                                zzhb zzhbVarZza = zzhaVar.zza();
                                byte[] bArr2 = bArr;
                                return new zzcge(new zzgw(bArr2), bArr2.length, zzhbVarZza);
                            }
                        };
                    }
                }
            }
        } else {
            final byte[] bArr2 = new byte[this.zzi.limit()];
            this.zzi.get(bArr2);
            zzhaVar = new zzha() { // from class: com.google.android.gms.internal.ads.zzcgf
                @Override // com.google.android.gms.internal.ads.zzha
                public final zzhb zza() {
                    return new zzgw(bArr2);
                }
            };
        }
        this.zzg = new zzwu(zzhaVar, new zzwt(((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzo)).booleanValue() ? new zzaea() { // from class: com.google.android.gms.internal.ads.zzcgp
            @Override // com.google.android.gms.internal.ads.zzaea
            public final /* synthetic */ zzadu[] zza(Uri uri, Map map) {
                int i = zzcgq.zza;
                return new zzadu[]{new zzakj(), new zzaiy(), new zzakd(zzalt.zza, 32, null, null, zzgbc.zzm(), null)};
            }
        } : new zzaea() { // from class: com.google.android.gms.internal.ads.zzcgg
            @Override // com.google.android.gms.internal.ads.zzaea
            public final /* synthetic */ zzadu[] zza(Uri uri, Map map) {
                int i = zzcgq.zza;
                return new zzadu[]{new zzakj(), new zzaiy()};
            }
        }));
    }

    private final boolean zzad() {
        return this.zzt != null && this.zzt.zzq();
    }

    public final void finalize() {
        zzD().decrementAndGet();
        if (com.google.android.gms.ads.internal.util.zze.zzc()) {
            com.google.android.gms.ads.internal.util.zze.zza("SimpleExoPlayerAdapter finalize ".concat(toString()));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcdv
    public final long zzA() {
        if (zzad()) {
            return 0L;
        }
        return this.zzl;
    }

    @Override // com.google.android.gms.internal.ads.zzcdv
    public final long zzB() {
        if (zzad()) {
            return this.zzt.zzl();
        }
        synchronized (this.zzq) {
            while (!this.zzs.isEmpty()) {
                long j = this.zzn;
                Map mapZze = ((zzhz) this.zzs.remove(0)).zze();
                long j2 = 0;
                if (mapZze != null) {
                    Iterator it = mapZze.entrySet().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Map.Entry entry = (Map.Entry) it.next();
                        if (entry != null) {
                            try {
                                if (entry.getKey() != null && zzfxm.zzc("content-length", (CharSequence) entry.getKey()) && entry.getValue() != null && ((List) entry.getValue()).get(0) != null) {
                                    j2 = Long.parseLong((String) ((List) entry.getValue()).get(0));
                                    break;
                                }
                            } catch (NumberFormatException unused) {
                                continue;
                            }
                        }
                    }
                }
                this.zzn = j + j2;
            }
        }
        return this.zzn;
    }

    @Override // com.google.android.gms.internal.ads.zzcdv
    public final Integer zzC() {
        return this.zzr;
    }

    @Override // com.google.android.gms.internal.ads.zzcdv
    public final void zzF(Uri[] uriArr, String str) {
        zzG(uriArr, str, ByteBuffer.allocate(0), false);
    }

    @Override // com.google.android.gms.internal.ads.zzcdv
    public final void zzH() {
        zzjr zzjrVar = this.zzh;
        if (zzjrVar != null) {
            zzjrVar.zzA(this);
            this.zzh.zzq();
            this.zzh = null;
            zzE().decrementAndGet();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcdv
    public final void zzI(long j) {
        zzm zzmVar = (zzm) this.zzh;
        zzmVar.zza(zzmVar.zzd(), j, 5, false);
    }

    @Override // com.google.android.gms.internal.ads.zzcdv
    public final void zzJ(int i) {
        this.zzc.zzk(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcdv
    public final void zzK(int i) {
        this.zzc.zzl(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcdv
    public final void zzL(zzcdu zzcduVar) {
        this.zzk = zzcduVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcdv
    public final void zzM(int i) {
        this.zzc.zzm(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcdv
    public final void zzN(int i) {
        this.zzc.zzn(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcdv
    public final void zzO(boolean z) {
        this.zzh.zzr(z);
    }

    @Override // com.google.android.gms.internal.ads.zzcdv
    public final void zzP(Integer num) {
        this.zzr = num;
    }

    @Override // com.google.android.gms.internal.ads.zzcdv
    public final void zzQ(boolean z) {
        if (this.zzh == null) {
            return;
        }
        int i = 0;
        while (true) {
            this.zzh.zzy();
            if (i >= 2) {
                return;
            }
            zzze zzzeVar = this.zzd;
            zzyq zzyqVarZzc = zzzeVar.zzf().zzc();
            zzyqVarZzc.zzp(i, !z);
            zzzeVar.zzl(zzyqVarZzc);
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcdv
    public final void zzR(int i) throws SocketException {
        Iterator it = this.zzu.iterator();
        while (it.hasNext()) {
            zzcga zzcgaVar = (zzcga) ((WeakReference) it.next()).get();
            if (zzcgaVar != null) {
                zzcgaVar.zzm(i);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcdv
    public final void zzS(Surface surface, boolean z) {
        zzjr zzjrVar = this.zzh;
        if (zzjrVar != null) {
            zzjrVar.zzs(surface);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcdv
    public final void zzT(float f, boolean z) {
        zzjr zzjrVar = this.zzh;
        if (zzjrVar != null) {
            zzjrVar.zzt(f);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcdv
    public final void zzU() {
        this.zzh.zzu();
    }

    @Override // com.google.android.gms.internal.ads.zzcdv
    public final boolean zzV() {
        return this.zzh != null;
    }

    final /* synthetic */ zzhb zzW(String str, boolean z) {
        zzcgq zzcgqVar = true != z ? null : this;
        zzced zzcedVar = this.zze;
        return new zzcgt(str, zzcgqVar, zzcedVar.zzd, zzcedVar.zzf, zzcedVar.zzn, zzcedVar.zzo);
    }

    final /* synthetic */ zzhb zzX(String str, boolean z) {
        zzcgq zzcgqVar = true != z ? null : this;
        zzced zzcedVar = this.zze;
        zzcga zzcgaVar = new zzcga(str, zzcgqVar, zzcedVar.zzd, zzcedVar.zzf, zzcedVar.zzi);
        this.zzu.add(new WeakReference(zzcgaVar));
        return zzcgaVar;
    }

    final /* synthetic */ zzhb zzY(String str, boolean z) {
        zzhk zzhkVar = new zzhk();
        zzhkVar.zzf(str);
        zzhkVar.zze(true != z ? null : this);
        zzhkVar.zzc(this.zze.zzd);
        zzhkVar.zzd(this.zze.zzf);
        zzhkVar.zzb(true);
        return zzhkVar.zza();
    }

    final /* synthetic */ zzhb zzZ(zzha zzhaVar) {
        zzhb zzhbVarZza = zzhaVar.zza();
        zzcgo zzcgoVar = new zzcgo(this);
        return new zzcgd(this.zzb, zzhbVarZza, this.zzo, this.zzp, this, zzcgoVar);
    }

    @Override // com.google.android.gms.internal.ads.zzie
    public final void zza(zzhb zzhbVar, zzhh zzhhVar, boolean z, int i) {
        this.zzl += i;
    }

    final zzvq zzaa(Uri uri) {
        zzaw zzawVar = new zzaw();
        zzawVar.zzb(uri);
        zzbu zzbuVarZzc = zzawVar.zzc();
        zzwu zzwuVar = this.zzg;
        zzwuVar.zza(this.zze.zzg);
        return zzwuVar.zzb(zzbuVarZzc);
    }

    final /* synthetic */ void zzab(boolean z, long j) {
        zzcdu zzcduVar = this.zzk;
        if (zzcduVar != null) {
            zzcduVar.zzi(z, j);
        }
    }

    final /* synthetic */ zzmn[] zzac(Handler handler, zzaci zzaciVar, zzqo zzqoVar, zzxu zzxuVar, zzun zzunVar) {
        zztx zztxVar = zztx.zza;
        Context context = this.zzb;
        zzsf zzsfVar = new zzsf(context, new zztj(context), zztxVar, false, handler, zzqoVar, new zzrl(context).zzd());
        zztx zztxVar2 = zztx.zza;
        Context context2 = this.zzb;
        return new zzmn[]{zzsfVar, new zzabj(context2, new zztj(context2), zztxVar2, 0L, false, handler, zzaciVar, -1, 30.0f)};
    }

    @Override // com.google.android.gms.internal.ads.zzie
    public final void zzb(zzhb zzhbVar, zzhh zzhhVar, boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzie
    public final void zzc(zzhb zzhbVar, zzhh zzhhVar, boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzie
    public final void zzd(zzhb zzhbVar, zzhh zzhhVar, boolean z) {
        if (zzhbVar instanceof zzhz) {
            synchronized (this.zzq) {
                this.zzs.add((zzhz) zzhbVar);
            }
        } else if (zzhbVar instanceof zzcgd) {
            this.zzt = (zzcgd) zzhbVar;
            final zzcee zzceeVar = (zzcee) this.zzf.get();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzbR)).booleanValue() && zzceeVar != null && this.zzt.zzn()) {
                final HashMap map = new HashMap();
                map.put("gcacheHit", String.valueOf(this.zzt.zzp()));
                map.put("gcacheDownloaded", String.valueOf(this.zzt.zzo()));
                com.google.android.gms.ads.internal.util.zzt.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcgm
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i = zzcgq.zza;
                        zzceeVar.zzd("onGcacheInfoEvent", map);
                    }
                });
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzna
    public final void zze(zzmy zzmyVar, zzan zzanVar, zziy zziyVar) {
        zzcee zzceeVar = (zzcee) this.zzf.get();
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzbR)).booleanValue() || zzceeVar == null) {
            return;
        }
        HashMap map = new HashMap();
        String str = zzanVar.zzm;
        if (str != null) {
            map.put("audioMime", str);
        }
        String str2 = zzanVar.zzn;
        if (str2 != null) {
            map.put("audioSampleMime", str2);
        }
        String str3 = zzanVar.zzk;
        if (str3 != null) {
            map.put("audioCodec", str3);
        }
        zzceeVar.zzd("onMetadataEvent", map);
    }

    @Override // com.google.android.gms.internal.ads.zzna
    public final /* synthetic */ void zzf(zzmy zzmyVar, int i, long j, long j2) {
    }

    @Override // com.google.android.gms.internal.ads.zzna
    public final /* synthetic */ void zzg(zzmy zzmyVar, zzvk zzvkVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzna
    public final void zzh(zzmy zzmyVar, int i, long j) {
        this.zzm += i;
    }

    @Override // com.google.android.gms.internal.ads.zzna
    public final /* synthetic */ void zzi(zzct zzctVar, zzmz zzmzVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzna
    public final void zzj(zzmy zzmyVar, zzvf zzvfVar, zzvk zzvkVar, IOException iOException, boolean z) {
        zzcdu zzcduVar = this.zzk;
        if (zzcduVar != null) {
            if (this.zze.zzk) {
                zzcduVar.zzl("onLoadException", iOException);
            } else {
                zzcduVar.zzk("onLoadError", iOException);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzna
    public final void zzk(zzmy zzmyVar, int i) {
        zzcdu zzcduVar = this.zzk;
        if (zzcduVar != null) {
            zzcduVar.zzm(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzna
    public final void zzl(zzmy zzmyVar, zzcj zzcjVar) {
        zzcdu zzcduVar = this.zzk;
        if (zzcduVar != null) {
            zzcduVar.zzk("onPlayerError", zzcjVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzna
    public final /* synthetic */ void zzm(zzmy zzmyVar, zzcs zzcsVar, zzcs zzcsVar2, int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzna
    public final void zzn(zzmy zzmyVar, Object obj, long j) {
        zzcdu zzcduVar = this.zzk;
        if (zzcduVar != null) {
            zzcduVar.zzv();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzna
    public final /* synthetic */ void zzo(zzmy zzmyVar, zzix zzixVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzna
    public final void zzp(zzmy zzmyVar, zzan zzanVar, zziy zziyVar) {
        zzcee zzceeVar = (zzcee) this.zzf.get();
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzbR)).booleanValue() || zzceeVar == null) {
            return;
        }
        HashMap map = new HashMap();
        map.put("frameRate", String.valueOf(zzanVar.zzu));
        map.put("bitRate", String.valueOf(zzanVar.zzj));
        map.put("resolution", zzanVar.zzs + "x" + zzanVar.zzt);
        String str = zzanVar.zzm;
        if (str != null) {
            map.put("videoMime", str);
        }
        String str2 = zzanVar.zzn;
        if (str2 != null) {
            map.put("videoSampleMime", str2);
        }
        String str3 = zzanVar.zzk;
        if (str3 != null) {
            map.put("videoCodec", str3);
        }
        zzceeVar.zzd("onMetadataEvent", map);
    }

    @Override // com.google.android.gms.internal.ads.zzna
    public final void zzq(zzmy zzmyVar, zzdv zzdvVar) {
        zzcdu zzcduVar = this.zzk;
        if (zzcduVar != null) {
            zzcduVar.zzD(zzdvVar.zzc, zzdvVar.zzd);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcdv
    public final int zzr() {
        return this.zzm;
    }

    @Override // com.google.android.gms.internal.ads.zzcdv
    public final int zzt() {
        return this.zzh.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzcdv
    public final long zzv() {
        return this.zzh.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzcdv
    public final long zzw() {
        return this.zzl;
    }

    @Override // com.google.android.gms.internal.ads.zzcdv
    public final long zzx() {
        if (zzad() && this.zzt.zzp()) {
            return Math.min(this.zzl, this.zzt.zzk());
        }
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzcdv
    public final long zzy() {
        return this.zzh.zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzcdv
    public final long zzz() {
        return this.zzh.zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzcdv
    public final void zzG(Uri[] uriArr, String str, ByteBuffer byteBuffer, boolean z) {
        zzvq zzwfVar;
        if (this.zzh != null) {
            this.zzi = byteBuffer;
            this.zzj = z;
            int length = uriArr.length;
            if (length == 1) {
                zzwfVar = zzaa(uriArr[0]);
            } else {
                zzvq[] zzvqVarArr = new zzvq[length];
                for (int i = 0; i < uriArr.length; i++) {
                    zzvqVarArr[i] = zzaa(uriArr[i]);
                }
                zzwfVar = new zzwf(false, false, new zzuz(), zzvqVarArr);
            }
            this.zzh.zzB(zzwfVar);
            this.zzh.zzp();
            zzE().incrementAndGet();
        }
    }
}
