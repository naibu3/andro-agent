package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.view.Surface;
import android.view.TextureView;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzcew extends zzcdk implements TextureView.SurfaceTextureListener, zzcdu {
    private final zzcee zzc;
    private final zzcef zzd;
    private final zzced zze;
    private zzcdj zzf;
    private Surface zzg;
    private zzcdv zzh;
    private String zzi;
    private String[] zzj;
    private boolean zzk;
    private int zzl;
    private zzcec zzm;
    private final boolean zzn;
    private boolean zzo;
    private boolean zzp;
    private int zzq;
    private int zzr;
    private float zzs;

    public zzcew(Context context, zzcef zzcefVar, zzcee zzceeVar, boolean z, boolean z2, zzced zzcedVar) {
        super(context);
        this.zzl = 1;
        this.zzc = zzceeVar;
        this.zzd = zzcefVar;
        this.zzn = z;
        this.zze = zzcedVar;
        setSurfaceTextureListener(this);
        zzcefVar.zza(this);
    }

    private static String zzT(String str, Exception exc) {
        return str + "/" + exc.getClass().getCanonicalName() + ":" + exc.getMessage();
    }

    private final void zzU() {
        zzcdv zzcdvVar = this.zzh;
        if (zzcdvVar != null) {
            zzcdvVar.zzQ(true);
        }
    }

    private final void zzV() {
        if (this.zzo) {
            return;
        }
        this.zzo = true;
        com.google.android.gms.ads.internal.util.zzt.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcev
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzI();
            }
        });
        zzn();
        this.zzd.zzb();
        if (this.zzp) {
            zzp();
        }
    }

    private final void zzW(boolean z, Integer num) {
        zzcdv zzcdvVar = this.zzh;
        if (zzcdvVar != null && !z) {
            zzcdvVar.zzP(num);
            return;
        }
        if (this.zzi == null || this.zzg == null) {
            return;
        }
        if (z) {
            if (!zzad()) {
                com.google.android.gms.ads.internal.util.client.zzm.zzj("No valid ExoPlayerAdapter exists when switch source.");
                return;
            } else {
                zzcdvVar.zzU();
                zzY();
            }
        }
        if (this.zzi.startsWith("cache:")) {
            zzcfp zzcfpVarZzp = this.zzc.zzp(this.zzi);
            if (zzcfpVarZzp instanceof zzcfy) {
                zzcdv zzcdvVarZza = ((zzcfy) zzcfpVarZzp).zza();
                this.zzh = zzcdvVarZza;
                zzcdvVarZza.zzP(num);
                if (!this.zzh.zzV()) {
                    com.google.android.gms.ads.internal.util.client.zzm.zzj("Precached video player has been released.");
                    return;
                }
            } else {
                if (!(zzcfpVarZzp instanceof zzcfv)) {
                    com.google.android.gms.ads.internal.util.client.zzm.zzj("Stream cache miss: ".concat(String.valueOf(this.zzi)));
                    return;
                }
                zzcfv zzcfvVar = (zzcfv) zzcfpVarZzp;
                String strZzF = zzF();
                ByteBuffer byteBufferZzk = zzcfvVar.zzk();
                boolean zZzl = zzcfvVar.zzl();
                String strZzi = zzcfvVar.zzi();
                if (strZzi == null) {
                    com.google.android.gms.ads.internal.util.client.zzm.zzj("Stream cache URL is null.");
                    return;
                } else {
                    zzcdv zzcdvVarZzE = zzE(num);
                    this.zzh = zzcdvVarZzE;
                    zzcdvVarZzE.zzG(new Uri[]{Uri.parse(strZzi)}, strZzF, byteBufferZzk, zZzl);
                }
            }
        } else {
            this.zzh = zzE(num);
            String strZzF2 = zzF();
            Uri[] uriArr = new Uri[this.zzj.length];
            int i = 0;
            while (true) {
                String[] strArr = this.zzj;
                if (i >= strArr.length) {
                    break;
                }
                uriArr[i] = Uri.parse(strArr[i]);
                i++;
            }
            this.zzh.zzF(uriArr, strZzF2);
        }
        this.zzh.zzL(this);
        zzZ(this.zzg, false);
        if (this.zzh.zzV()) {
            int iZzt = this.zzh.zzt();
            this.zzl = iZzt;
            if (iZzt == 3) {
                zzV();
            }
        }
    }

    private final void zzX() {
        zzcdv zzcdvVar = this.zzh;
        if (zzcdvVar != null) {
            zzcdvVar.zzQ(false);
        }
    }

    private final void zzY() {
        if (this.zzh != null) {
            zzZ(null, true);
            zzcdv zzcdvVar = this.zzh;
            if (zzcdvVar != null) {
                zzcdvVar.zzL(null);
                this.zzh.zzH();
                this.zzh = null;
            }
            this.zzl = 1;
            this.zzk = false;
            this.zzo = false;
            this.zzp = false;
        }
    }

    private final void zzZ(Surface surface, boolean z) {
        zzcdv zzcdvVar = this.zzh;
        if (zzcdvVar == null) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Trying to set surface before player is initialized.");
            return;
        }
        try {
            zzcdvVar.zzS(surface, z);
        } catch (IOException e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzk("", e);
        }
    }

    private final void zzaa() {
        zzab(this.zzq, this.zzr);
    }

    private final void zzab(int i, int i2) {
        float f = i2 > 0 ? i / i2 : 1.0f;
        if (this.zzs != f) {
            this.zzs = f;
            requestLayout();
        }
    }

    private final boolean zzac() {
        return zzad() && this.zzl != 1;
    }

    private final boolean zzad() {
        zzcdv zzcdvVar = this.zzh;
        return (zzcdvVar == null || !zzcdvVar.zzV() || this.zzk) ? false : true;
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f = this.zzs;
        if (f != 0.0f && this.zzm == null) {
            float f2 = measuredWidth;
            float f3 = f2 / measuredHeight;
            if (f > f3) {
                measuredHeight = (int) (f2 / f);
            }
            if (f < f3) {
                measuredWidth = (int) (measuredHeight * f);
            }
        }
        setMeasuredDimension(measuredWidth, measuredHeight);
        zzcec zzcecVar = this.zzm;
        if (zzcecVar != null) {
            zzcecVar.zzc(measuredWidth, measuredHeight);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) throws InterruptedException {
        if (this.zzn) {
            zzcec zzcecVar = new zzcec(getContext());
            this.zzm = zzcecVar;
            zzcecVar.zzd(surfaceTexture, i, i2);
            this.zzm.start();
            SurfaceTexture surfaceTextureZzb = this.zzm.zzb();
            if (surfaceTextureZzb != null) {
                surfaceTexture = surfaceTextureZzb;
            } else {
                this.zzm.zze();
                this.zzm = null;
            }
        }
        Surface surface = new Surface(surfaceTexture);
        this.zzg = surface;
        if (this.zzh == null) {
            zzW(false, null);
        } else {
            zzZ(surface, true);
            if (!this.zze.zza) {
                zzU();
            }
        }
        if (this.zzq == 0 || this.zzr == 0) {
            zzab(i, i2);
        } else {
            zzaa();
        }
        com.google.android.gms.ads.internal.util.zzt.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzces
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzM();
            }
        });
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        zzo();
        zzcec zzcecVar = this.zzm;
        if (zzcecVar != null) {
            zzcecVar.zze();
            this.zzm = null;
        }
        if (this.zzh != null) {
            zzX();
            Surface surface = this.zzg;
            if (surface != null) {
                surface.release();
            }
            this.zzg = null;
            zzZ(null, true);
        }
        com.google.android.gms.ads.internal.util.zzt.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzceo
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzN();
            }
        });
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, final int i, final int i2) {
        zzcec zzcecVar = this.zzm;
        if (zzcecVar != null) {
            zzcecVar.zzc(i, i2);
        }
        com.google.android.gms.ads.internal.util.zzt.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcen
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzO(i, i2);
            }
        });
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.zzd.zzf(this);
        this.zza.zza(surfaceTexture, this.zzf);
    }

    @Override // android.view.View
    protected final void onWindowVisibilityChanged(final int i) {
        com.google.android.gms.ads.internal.util.zze.zza("AdExoPlayerView3 window visibility changed to " + i);
        com.google.android.gms.ads.internal.util.zzt.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcem
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzQ(i);
            }
        });
        super.onWindowVisibilityChanged(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcdk
    public final void zzA(int i) {
        zzcdv zzcdvVar = this.zzh;
        if (zzcdvVar != null) {
            zzcdvVar.zzN(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcdk
    public final void zzB(int i) {
        zzcdv zzcdvVar = this.zzh;
        if (zzcdvVar != null) {
            zzcdvVar.zzR(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcdu
    public final void zzD(int i, int i2) {
        this.zzq = i;
        this.zzr = i2;
        zzaa();
    }

    final zzcdv zzE(Integer num) {
        zzced zzcedVar = this.zze;
        zzcee zzceeVar = this.zzc;
        zzcgq zzcgqVar = new zzcgq(zzceeVar.getContext(), zzcedVar, zzceeVar, num);
        com.google.android.gms.ads.internal.util.client.zzm.zzi("ExoPlayerAdapter initialized.");
        return zzcgqVar;
    }

    final String zzF() {
        zzcee zzceeVar = this.zzc;
        return com.google.android.gms.ads.internal.zzu.zzp().zzc(zzceeVar.getContext(), zzceeVar.zzn().afmaVersion);
    }

    final /* synthetic */ void zzG(String str) {
        zzcdj zzcdjVar = this.zzf;
        if (zzcdjVar != null) {
            zzcdjVar.zzb("ExoPlayerAdapter error", str);
        }
    }

    final /* synthetic */ void zzH() {
        zzcdj zzcdjVar = this.zzf;
        if (zzcdjVar != null) {
            zzcdjVar.zza();
        }
    }

    final /* synthetic */ void zzI() {
        zzcdj zzcdjVar = this.zzf;
        if (zzcdjVar != null) {
            zzcdjVar.zzf();
        }
    }

    final /* synthetic */ void zzJ(boolean z, long j) {
        this.zzc.zzv(z, j);
    }

    final /* synthetic */ void zzK(String str) {
        zzcdj zzcdjVar = this.zzf;
        if (zzcdjVar != null) {
            zzcdjVar.zzc("ExoPlayerAdapter exception", str);
        }
    }

    final /* synthetic */ void zzL() {
        zzcdj zzcdjVar = this.zzf;
        if (zzcdjVar != null) {
            zzcdjVar.zzg();
        }
    }

    final /* synthetic */ void zzM() {
        zzcdj zzcdjVar = this.zzf;
        if (zzcdjVar != null) {
            zzcdjVar.zzh();
        }
    }

    final /* synthetic */ void zzN() {
        zzcdj zzcdjVar = this.zzf;
        if (zzcdjVar != null) {
            zzcdjVar.zzi();
        }
    }

    final /* synthetic */ void zzO(int i, int i2) {
        zzcdj zzcdjVar = this.zzf;
        if (zzcdjVar != null) {
            zzcdjVar.zzj(i, i2);
        }
    }

    final /* synthetic */ void zzP() {
        float fZza = this.zzb.zza();
        zzcdv zzcdvVar = this.zzh;
        if (zzcdvVar == null) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Trying to set volume before player is initialized.");
            return;
        }
        try {
            zzcdvVar.zzT(fZza, false);
        } catch (IOException e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzk("", e);
        }
    }

    final /* synthetic */ void zzQ(int i) {
        zzcdj zzcdjVar = this.zzf;
        if (zzcdjVar != null) {
            zzcdjVar.onWindowVisibilityChanged(i);
        }
    }

    final /* synthetic */ void zzR() {
        zzcdj zzcdjVar = this.zzf;
        if (zzcdjVar != null) {
            zzcdjVar.zzd();
        }
    }

    final /* synthetic */ void zzS() {
        zzcdj zzcdjVar = this.zzf;
        if (zzcdjVar != null) {
            zzcdjVar.zze();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcdk
    public final int zza() {
        if (zzac()) {
            return (int) this.zzh.zzy();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcdk
    public final int zzb() {
        zzcdv zzcdvVar = this.zzh;
        if (zzcdvVar != null) {
            return zzcdvVar.zzr();
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzcdk
    public final int zzc() {
        if (zzac()) {
            return (int) this.zzh.zzz();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcdk
    public final int zzd() {
        return this.zzr;
    }

    @Override // com.google.android.gms.internal.ads.zzcdk
    public final int zze() {
        return this.zzq;
    }

    @Override // com.google.android.gms.internal.ads.zzcdk
    public final long zzf() {
        zzcdv zzcdvVar = this.zzh;
        if (zzcdvVar != null) {
            return zzcdvVar.zzx();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzcdk
    public final long zzg() {
        zzcdv zzcdvVar = this.zzh;
        if (zzcdvVar != null) {
            return zzcdvVar.zzA();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzcdk
    public final long zzh() {
        zzcdv zzcdvVar = this.zzh;
        if (zzcdvVar != null) {
            return zzcdvVar.zzB();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzcdu
    public final void zzi(final boolean z, final long j) {
        if (this.zzc != null) {
            zzcci.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcep
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzJ(z, j);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcdk
    public final String zzj() {
        return "ExoPlayer/2".concat(true != this.zzn ? "" : " spherical");
    }

    @Override // com.google.android.gms.internal.ads.zzcdu
    public final void zzk(String str, Exception exc) {
        final String strZzT = zzT(str, exc);
        com.google.android.gms.ads.internal.util.client.zzm.zzj("ExoPlayerAdapter error: ".concat(strZzT));
        this.zzk = true;
        if (this.zze.zza) {
            zzX();
        }
        com.google.android.gms.ads.internal.util.zzt.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcet
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzG(strZzT);
            }
        });
        com.google.android.gms.ads.internal.zzu.zzo().zzv(exc, "AdExoPlayerView.onError");
    }

    @Override // com.google.android.gms.internal.ads.zzcdu
    public final void zzl(String str, Exception exc) {
        final String strZzT = zzT("onLoadException", exc);
        com.google.android.gms.ads.internal.util.client.zzm.zzj("ExoPlayerAdapter exception: ".concat(strZzT));
        com.google.android.gms.ads.internal.zzu.zzo().zzv(exc, "AdExoPlayerView.onException");
        com.google.android.gms.ads.internal.util.zzt.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzceq
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzK(strZzT);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcdu
    public final void zzm(int i) {
        if (this.zzl != i) {
            this.zzl = i;
            if (i == 3) {
                zzV();
                return;
            }
            if (i != 4) {
                return;
            }
            if (this.zze.zza) {
                zzX();
            }
            this.zzd.zze();
            this.zzb.zzc();
            com.google.android.gms.ads.internal.util.zzt.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzceu
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzH();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcdk, com.google.android.gms.internal.ads.zzceh
    public final void zzn() {
        com.google.android.gms.ads.internal.util.zzt.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcel
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzP();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcdk
    public final void zzo() {
        if (zzac()) {
            if (this.zze.zza) {
                zzX();
            }
            this.zzh.zzO(false);
            this.zzd.zze();
            this.zzb.zzc();
            com.google.android.gms.ads.internal.util.zzt.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcer
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzR();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcdk
    public final void zzp() {
        if (!zzac()) {
            this.zzp = true;
            return;
        }
        if (this.zze.zza) {
            zzU();
        }
        this.zzh.zzO(true);
        this.zzd.zzc();
        this.zzb.zzb();
        this.zza.zzb();
        com.google.android.gms.ads.internal.util.zzt.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcek
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzS();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcdk
    public final void zzq(int i) {
        if (zzac()) {
            this.zzh.zzI(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcdk
    public final void zzr(zzcdj zzcdjVar) {
        this.zzf = zzcdjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcdk
    public final void zzs(String str) {
        if (str != null) {
            zzC(str, null, null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcdk
    public final void zzt() {
        if (zzad()) {
            this.zzh.zzU();
            zzY();
        }
        this.zzd.zze();
        this.zzb.zzc();
        this.zzd.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzcdk
    public final void zzu(float f, float f2) {
        zzcec zzcecVar = this.zzm;
        if (zzcecVar != null) {
            zzcecVar.zzf(f, f2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcdu
    public final void zzv() {
        com.google.android.gms.ads.internal.util.zzt.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcej
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzL();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcdk
    public final Integer zzw() {
        zzcdv zzcdvVar = this.zzh;
        if (zzcdvVar != null) {
            return zzcdvVar.zzC();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzcdk
    public final void zzx(int i) {
        zzcdv zzcdvVar = this.zzh;
        if (zzcdvVar != null) {
            zzcdvVar.zzJ(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcdk
    public final void zzy(int i) {
        zzcdv zzcdvVar = this.zzh;
        if (zzcdvVar != null) {
            zzcdvVar.zzK(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcdk
    public final void zzz(int i) {
        zzcdv zzcdvVar = this.zzh;
        if (zzcdvVar != null) {
            zzcdvVar.zzM(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcdk
    public final void zzC(String str, String[] strArr, Integer num) {
        if (str == null) {
            return;
        }
        if (strArr == null) {
            this.zzj = new String[]{str};
        } else {
            this.zzj = (String[]) Arrays.copyOf(strArr, strArr.length);
        }
        String str2 = this.zzi;
        boolean z = this.zze.zzl && str2 != null && !str.equals(str2) && this.zzl == 4;
        this.zzi = str;
        zzW(z, num);
    }
}
