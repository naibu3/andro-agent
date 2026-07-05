package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzsf extends zztv implements zzlp {
    private final Context zzb;
    private final zzqn zzc;
    private final zzqv zzd;
    private int zze;
    private boolean zzf;
    private boolean zzg;
    private zzan zzh;
    private zzan zzi;
    private long zzj;
    private boolean zzk;
    private boolean zzl;
    private zzmm zzm;
    private boolean zzn;

    public zzsf(Context context, zztl zztlVar, zztx zztxVar, boolean z, Handler handler, zzqo zzqoVar, zzqv zzqvVar) {
        super(1, zztlVar, zztxVar, false, 44100.0f);
        this.zzb = context.getApplicationContext();
        this.zzd = zzqvVar;
        this.zzc = new zzqn(handler, zzqoVar);
        zzqvVar.zzq(new zzse(this, null));
    }

    private final int zzaM(zztp zztpVar, zzan zzanVar) {
        if (!"OMX.google.raw.decoder".equals(zztpVar.zza) || zzgd.zza >= 24 || (zzgd.zza == 23 && zzgd.zzN(this.zzb))) {
            return zzanVar.zzo;
        }
        return -1;
    }

    private static List zzaN(zztx zztxVar, zzan zzanVar, boolean z, zzqv zzqvVar) throws zzud {
        zztp zztpVarZzb;
        return zzanVar.zzn == null ? zzgbc.zzm() : (!zzqvVar.zzA(zzanVar) || (zztpVarZzb = zzuj.zzb()) == null) ? zzuj.zzf(zztxVar, zzanVar, false, false) : zzgbc.zzn(zztpVarZzb);
    }

    private final void zzaO() {
        long jZzb = this.zzd.zzb(zzW());
        if (jZzb != Long.MIN_VALUE) {
            if (!this.zzk) {
                jZzb = Math.max(this.zzj, jZzb);
            }
            this.zzj = jZzb;
            this.zzk = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zziw
    protected final void zzA() {
        this.zzd.zzk();
    }

    @Override // com.google.android.gms.internal.ads.zztv, com.google.android.gms.internal.ads.zziw
    protected final void zzC() {
        this.zzn = false;
        try {
            super.zzC();
            if (this.zzl) {
                this.zzl = false;
                this.zzd.zzl();
            }
        } catch (Throwable th) {
            if (this.zzl) {
                this.zzl = false;
                this.zzd.zzl();
            }
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zziw
    protected final void zzD() {
        this.zzd.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zziw
    protected final void zzE() {
        zzaO();
        this.zzd.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzmn, com.google.android.gms.internal.ads.zzmp
    public final String zzU() {
        return "MediaCodecAudioRenderer";
    }

    @Override // com.google.android.gms.internal.ads.zztv, com.google.android.gms.internal.ads.zzmn
    public final boolean zzW() {
        return super.zzW() && this.zzd.zzz();
    }

    @Override // com.google.android.gms.internal.ads.zztv, com.google.android.gms.internal.ads.zzmn
    public final boolean zzX() {
        return this.zzd.zzy() || super.zzX();
    }

    @Override // com.google.android.gms.internal.ads.zztv
    protected final float zzZ(float f, zzan zzanVar, zzan[] zzanVarArr) {
        int iMax = -1;
        for (zzan zzanVar2 : zzanVarArr) {
            int i = zzanVar2.zzB;
            if (i != -1) {
                iMax = Math.max(iMax, i);
            }
        }
        if (iMax == -1) {
            return -1.0f;
        }
        return iMax * f;
    }

    @Override // com.google.android.gms.internal.ads.zzlp
    public final long zza() {
        if (zzcU() == 2) {
            zzaO();
        }
        return this.zzj;
    }

    @Override // com.google.android.gms.internal.ads.zztv
    protected final int zzaa(zztx zztxVar, zzan zzanVar) throws zzud {
        int i;
        boolean z;
        if (!zzcg.zzg(zzanVar.zzn)) {
            return 128;
        }
        int i2 = zzgd.zza;
        int i3 = zzanVar.zzH;
        boolean zZzaL = zzaL(zzanVar);
        int i4 = 1;
        if (!zZzaL || (i3 != 0 && zzuj.zzb() == null)) {
            i = 0;
        } else {
            zzqa zzqaVarZzd = this.zzd.zzd(zzanVar);
            if (zzqaVarZzd.zzb) {
                i = true != zzqaVarZzd.zzc ? 512 : 1536;
                if (zzqaVarZzd.zzd) {
                    i |= 2048;
                }
            } else {
                i = 0;
            }
            if (this.zzd.zzA(zzanVar)) {
                return i | 172;
            }
        }
        if ((!"audio/raw".equals(zzanVar.zzn) || this.zzd.zzA(zzanVar)) && this.zzd.zzA(zzgd.zzz(2, zzanVar.zzA, zzanVar.zzB))) {
            List listZzaN = zzaN(zztxVar, zzanVar, false, this.zzd);
            if (!listZzaN.isEmpty()) {
                if (zZzaL) {
                    zztp zztpVar = (zztp) listZzaN.get(0);
                    boolean zZze = zztpVar.zze(zzanVar);
                    if (zZze) {
                        z = true;
                    } else {
                        for (int i5 = 1; i5 < listZzaN.size(); i5++) {
                            zztp zztpVar2 = (zztp) listZzaN.get(i5);
                            if (zztpVar2.zze(zzanVar)) {
                                z = false;
                                zZze = true;
                                zztpVar = zztpVar2;
                                break;
                            }
                        }
                        z = true;
                    }
                    int i6 = true != zZze ? 3 : 4;
                    int i7 = 8;
                    if (zZze && zztpVar.zzf(zzanVar)) {
                        i7 = 16;
                    }
                    return i6 | i7 | 32 | (true != zztpVar.zzg ? 0 : 64) | (true != z ? 0 : 128) | i;
                }
                i4 = 2;
            }
        }
        return i4 | 128;
    }

    @Override // com.google.android.gms.internal.ads.zztv
    protected final zziy zzab(zztp zztpVar, zzan zzanVar, zzan zzanVar2) {
        int i;
        int i2;
        zziy zziyVarZzb = zztpVar.zzb(zzanVar, zzanVar2);
        int i3 = zziyVarZzb.zze;
        if (zzaJ(zzanVar2)) {
            i3 |= 32768;
        }
        if (zzaM(zztpVar, zzanVar2) > this.zze) {
            i3 |= 64;
        }
        String str = zztpVar.zza;
        if (i3 != 0) {
            i2 = i3;
            i = 0;
        } else {
            i = zziyVarZzb.zzd;
            i2 = 0;
        }
        return new zziy(str, zzanVar, zzanVar2, i, i2);
    }

    @Override // com.google.android.gms.internal.ads.zztv
    protected final zztk zzaf(zztp zztpVar, zzan zzanVar, MediaCrypto mediaCrypto, float f) {
        zzan[] zzanVarArrZzT = zzT();
        int length = zzanVarArrZzT.length;
        int iZzaM = zzaM(zztpVar, zzanVar);
        if (length != 1) {
            for (zzan zzanVar2 : zzanVarArrZzT) {
                if (zztpVar.zzb(zzanVar, zzanVar2).zzd != 0) {
                    iZzaM = Math.max(iZzaM, zzaM(zztpVar, zzanVar2));
                }
            }
        }
        this.zze = iZzaM;
        this.zzf = zzgd.zza < 24 && "OMX.SEC.aac.dec".equals(zztpVar.zza) && "samsung".equals(zzgd.zzc) && (zzgd.zzb.startsWith("zeroflte") || zzgd.zzb.startsWith("herolte") || zzgd.zzb.startsWith("heroqlte"));
        String str = zztpVar.zza;
        this.zzg = str.equals("OMX.google.opus.decoder") || str.equals("c2.android.opus.decoder") || str.equals("OMX.google.vorbis.decoder") || str.equals("c2.android.vorbis.decoder");
        String str2 = zztpVar.zzc;
        int i = this.zze;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str2);
        mediaFormat.setInteger("channel-count", zzanVar.zzA);
        mediaFormat.setInteger("sample-rate", zzanVar.zzB);
        zzfn.zzb(mediaFormat, zzanVar.zzp);
        zzfn.zza(mediaFormat, "max-input-size", i);
        if (zzgd.zza >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f != -1.0f && (zzgd.zza != 23 || (!"ZTE B2017G".equals(zzgd.zzd) && !"AXON 7 mini".equals(zzgd.zzd)))) {
                mediaFormat.setFloat("operating-rate", f);
            }
        }
        if (zzgd.zza <= 28 && "audio/ac4".equals(zzanVar.zzn)) {
            mediaFormat.setInteger("ac4-is-sync", 1);
        }
        if (zzgd.zza >= 24 && this.zzd.zza(zzgd.zzz(4, zzanVar.zzA, zzanVar.zzB)) == 2) {
            mediaFormat.setInteger("pcm-encoding", 4);
        }
        if (zzgd.zza >= 32) {
            mediaFormat.setInteger("max-output-channel-count", 99);
        }
        this.zzi = (!"audio/raw".equals(zztpVar.zzb) || "audio/raw".equals(zzanVar.zzn)) ? null : zzanVar;
        return zztk.zza(zztpVar, mediaFormat, zzanVar, null);
    }

    @Override // com.google.android.gms.internal.ads.zztv
    protected final List zzag(zztx zztxVar, zzan zzanVar, boolean z) throws zzud {
        return zzuj.zzg(zzaN(zztxVar, zzanVar, false, this.zzd), zzanVar);
    }

    @Override // com.google.android.gms.internal.ads.zztv
    protected final void zzaj(zzin zzinVar) {
        zzan zzanVar;
        if (zzgd.zza < 29 || (zzanVar = zzinVar.zza) == null || !Objects.equals(zzanVar.zzn, "audio/opus") || !zzaI()) {
            return;
        }
        ByteBuffer byteBuffer = zzinVar.zzf;
        byteBuffer.getClass();
        zzan zzanVar2 = zzinVar.zza;
        zzanVar2.getClass();
        if (byteBuffer.remaining() == 8) {
            this.zzd.zzr(zzanVar2.zzD, (int) ((byteBuffer.order(ByteOrder.LITTLE_ENDIAN).getLong() * 48000) / 1000000000));
        }
    }

    @Override // com.google.android.gms.internal.ads.zztv
    protected final void zzak(Exception exc) {
        zzfk.zzd("MediaCodecAudioRenderer", "Audio codec error", exc);
        this.zzc.zza(exc);
    }

    @Override // com.google.android.gms.internal.ads.zztv
    protected final void zzal(String str, zztk zztkVar, long j, long j2) {
        this.zzc.zze(str, j, j2);
    }

    @Override // com.google.android.gms.internal.ads.zztv
    protected final void zzam(String str) {
        this.zzc.zzf(str);
    }

    protected final void zzao() {
        this.zzk = true;
    }

    @Override // com.google.android.gms.internal.ads.zztv
    protected final void zzap() {
        this.zzd.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zztv
    protected final void zzaq() throws zzjh {
        try {
            this.zzd.zzj();
        } catch (zzqu e) {
            throw zzi(e, e.zzc, e.zzb, true != zzaI() ? 5002 : 5003);
        }
    }

    @Override // com.google.android.gms.internal.ads.zztv
    protected final boolean zzas(zzan zzanVar) {
        zzm();
        return this.zzd.zzA(zzanVar);
    }

    @Override // com.google.android.gms.internal.ads.zzlp
    public final zzcl zzc() {
        return this.zzd.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzlp
    public final void zzg(zzcl zzclVar) {
        this.zzd.zzs(zzclVar);
    }

    @Override // com.google.android.gms.internal.ads.zzlp
    public final boolean zzj() {
        boolean z = this.zzn;
        this.zzn = false;
        return z;
    }

    @Override // com.google.android.gms.internal.ads.zziw, com.google.android.gms.internal.ads.zzmn
    public final zzlp zzk() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zziw, com.google.android.gms.internal.ads.zzmi
    public final void zzt(int i, Object obj) throws zzjh {
        if (i == 2) {
            zzqv zzqvVar = this.zzd;
            obj.getClass();
            zzqvVar.zzw(((Float) obj).floatValue());
            return;
        }
        if (i == 3) {
            zzk zzkVar = (zzk) obj;
            zzqv zzqvVar2 = this.zzd;
            zzkVar.getClass();
            zzqvVar2.zzm(zzkVar);
            return;
        }
        if (i == 6) {
            zzl zzlVar = (zzl) obj;
            zzqv zzqvVar3 = this.zzd;
            zzlVar.getClass();
            zzqvVar3.zzo(zzlVar);
            return;
        }
        switch (i) {
            case 9:
                zzqv zzqvVar4 = this.zzd;
                obj.getClass();
                zzqvVar4.zzv(((Boolean) obj).booleanValue());
                break;
            case 10:
                zzqv zzqvVar5 = this.zzd;
                obj.getClass();
                zzqvVar5.zzn(((Integer) obj).intValue());
                break;
            case 11:
                this.zzm = (zzmm) obj;
                break;
            case 12:
                if (zzgd.zza >= 23) {
                    zzsc.zza(this.zzd, obj);
                    break;
                }
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.zztv, com.google.android.gms.internal.ads.zziw
    protected final void zzw() {
        this.zzl = true;
        this.zzh = null;
        try {
            this.zzd.zzf();
            super.zzw();
        } catch (Throwable th) {
            super.zzw();
            throw th;
        } finally {
            this.zzc.zzg(this.zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zztv, com.google.android.gms.internal.ads.zziw
    protected final void zzx(boolean z, boolean z2) throws zzjh {
        super.zzx(z, z2);
        this.zzc.zzh(this.zza);
        zzm();
        this.zzd.zzt(zzn());
        this.zzd.zzp(zzh());
    }

    @Override // com.google.android.gms.internal.ads.zztv, com.google.android.gms.internal.ads.zziw
    protected final void zzz(long j, boolean z) throws zzjh {
        super.zzz(j, z);
        this.zzd.zzf();
        this.zzj = j;
        this.zzn = false;
        this.zzk = true;
    }

    @Override // com.google.android.gms.internal.ads.zztv
    protected final zziy zzac(zzlj zzljVar) throws zzjh {
        zzan zzanVar = zzljVar.zza;
        zzanVar.getClass();
        this.zzh = zzanVar;
        zziy zziyVarZzac = super.zzac(zzljVar);
        this.zzc.zzi(zzanVar, zziyVarZzac);
        return zziyVarZzac;
    }

    @Override // com.google.android.gms.internal.ads.zztv
    protected final boolean zzar(long j, long j2, zztm zztmVar, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, zzan zzanVar) throws zzjh {
        byteBuffer.getClass();
        if (this.zzi != null && (i2 & 2) != 0) {
            zztmVar.getClass();
            zztmVar.zzn(i, false);
            return true;
        }
        if (z) {
            if (zztmVar != null) {
                zztmVar.zzn(i, false);
            }
            this.zza.zzf += i3;
            this.zzd.zzg();
            return true;
        }
        try {
            if (!this.zzd.zzx(byteBuffer, j3, i3)) {
                return false;
            }
            if (zztmVar != null) {
                zztmVar.zzn(i, false);
            }
            this.zza.zze += i3;
            return true;
        } catch (zzqr e) {
            zzan zzanVar2 = this.zzh;
            if (zzaI()) {
                zzm();
            }
            throw zzi(e, zzanVar2, e.zzb, 5001);
        } catch (zzqu e2) {
            if (zzaI()) {
                zzm();
            }
            throw zzi(e2, zzanVar, e2.zzb, 5002);
        }
    }

    @Override // com.google.android.gms.internal.ads.zztv
    protected final void zzan(zzan zzanVar, MediaFormat mediaFormat) throws zzjh {
        int[] iArr;
        int i;
        zzan zzanVar2 = this.zzi;
        int[] iArr2 = null;
        boolean z = true;
        if (zzanVar2 != null) {
            zzanVar = zzanVar2;
        } else if (zzaw() != null) {
            mediaFormat.getClass();
            int iZzl = "audio/raw".equals(zzanVar.zzn) ? zzanVar.zzC : (zzgd.zza < 24 || !mediaFormat.containsKey("pcm-encoding")) ? mediaFormat.containsKey("v-bits-per-sample") ? zzgd.zzl(mediaFormat.getInteger("v-bits-per-sample")) : 2 : mediaFormat.getInteger("pcm-encoding");
            zzal zzalVar = new zzal();
            zzalVar.zzX("audio/raw");
            zzalVar.zzR(iZzl);
            zzalVar.zzF(zzanVar.zzD);
            zzalVar.zzG(zzanVar.zzE);
            zzalVar.zzQ(zzanVar.zzl);
            zzalVar.zzK(zzanVar.zzb);
            zzalVar.zzM(zzanVar.zzc);
            zzalVar.zzN(zzanVar.zzd);
            zzalVar.zzO(zzanVar.zze);
            zzalVar.zzZ(zzanVar.zzf);
            zzalVar.zzV(zzanVar.zzg);
            zzalVar.zzy(mediaFormat.getInteger("channel-count"));
            zzalVar.zzY(mediaFormat.getInteger("sample-rate"));
            zzan zzanVarZzad = zzalVar.zzad();
            if (this.zzf && zzanVarZzad.zzA == 6 && (i = zzanVar.zzA) < 6) {
                iArr2 = new int[i];
                for (int i2 = 0; i2 < zzanVar.zzA; i2++) {
                    iArr2[i2] = i2;
                }
            } else if (this.zzg) {
                int i3 = zzanVarZzad.zzA;
                if (i3 == 3) {
                    iArr = new int[]{0, 2, 1};
                } else if (i3 == 5) {
                    iArr = new int[]{0, 2, 1, 3, 4};
                } else if (i3 == 6) {
                    iArr = new int[]{0, 2, 1, 5, 3, 4};
                } else if (i3 == 7) {
                    iArr = new int[]{0, 2, 1, 6, 5, 3, 4};
                } else if (i3 == 8) {
                    iArr = new int[]{0, 2, 1, 7, 5, 6, 3, 4};
                }
                iArr2 = iArr;
            }
            zzanVar = zzanVarZzad;
        }
        try {
            if (zzgd.zza >= 29) {
                if (zzaI()) {
                    zzm();
                }
                if (zzgd.zza < 29) {
                    z = false;
                }
                zzeq.zzf(z);
            }
            this.zzd.zze(zzanVar, 0, iArr2);
        } catch (zzqq e) {
            throw zzi(e, e.zza, false, 5001);
        }
    }
}
