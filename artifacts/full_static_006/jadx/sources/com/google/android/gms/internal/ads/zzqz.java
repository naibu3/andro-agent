package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.os.SystemClock;
import androidx.work.WorkRequest;
import java.lang.reflect.Method;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzqz {
    private long zzA;
    private long zzB;
    private long zzC;
    private boolean zzD;
    private long zzE;
    private long zzF;
    private boolean zzG;
    private long zzH;
    private zzer zzI;
    private final zzqy zza;
    private final long[] zzb;
    private AudioTrack zzc;
    private int zzd;
    private zzqx zze;
    private int zzf;
    private boolean zzg;
    private long zzh;
    private float zzi;
    private boolean zzj;
    private long zzk;
    private long zzl;
    private Method zzm;
    private long zzn;
    private boolean zzo;
    private boolean zzp;
    private long zzq;
    private long zzr;
    private long zzs;
    private long zzt;
    private long zzu;
    private int zzv;
    private int zzw;
    private long zzx;
    private long zzy;
    private long zzz;

    public zzqz(zzqy zzqyVar) {
        this.zza = zzqyVar;
        try {
            this.zzm = AudioTrack.class.getMethod("getLatency", null);
        } catch (NoSuchMethodException unused) {
        }
        this.zzb = new long[10];
        this.zzI = zzer.zza;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0099  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final long zzl() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        int i = 2;
        if (this.zzx != -9223372036854775807L) {
            AudioTrack audioTrack = this.zzc;
            audioTrack.getClass();
            if (audioTrack.getPlayState() == 2) {
                return this.zzz;
            }
            return Math.min(this.zzA, this.zzz + zzgd.zzo(zzgd.zzp(zzgd.zzr(jElapsedRealtime) - this.zzx, this.zzi), this.zzf));
        }
        if (jElapsedRealtime - this.zzr >= 5) {
            AudioTrack audioTrack2 = this.zzc;
            audioTrack2.getClass();
            int playState = audioTrack2.getPlayState();
            if (playState != 1) {
                long playbackHeadPosition = audioTrack2.getPlaybackHeadPosition() & 4294967295L;
                long j = 0;
                if (this.zzg) {
                    if (playState != 2) {
                        i = playState;
                    } else if (playbackHeadPosition == 0) {
                        this.zzu = this.zzs;
                    }
                    playbackHeadPosition += this.zzu;
                    playState = i;
                }
                if (zzgd.zza > 29) {
                    if (this.zzs > playbackHeadPosition) {
                        this.zzt++;
                    }
                    this.zzs = playbackHeadPosition;
                } else {
                    if (playbackHeadPosition != 0) {
                        j = playbackHeadPosition;
                    } else if (this.zzs > 0 && playState == 3) {
                        if (this.zzy == -9223372036854775807L) {
                            this.zzy = jElapsedRealtime;
                        }
                    }
                    this.zzy = -9223372036854775807L;
                    playbackHeadPosition = j;
                    if (this.zzs > playbackHeadPosition) {
                    }
                    this.zzs = playbackHeadPosition;
                }
            }
            this.zzr = jElapsedRealtime;
        }
        return this.zzs + this.zzH + (this.zzt << 32);
    }

    private final long zzm() {
        return zzgd.zzs(zzl(), this.zzf);
    }

    private final void zzn() {
        this.zzk = 0L;
        this.zzw = 0;
        this.zzv = 0;
        this.zzl = 0L;
        this.zzC = 0L;
        this.zzF = 0L;
        this.zzj = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long zza(boolean z) {
        long jZzm;
        Method method;
        AudioTrack audioTrack;
        zzqz zzqzVar = this;
        AudioTrack audioTrack2 = zzqzVar.zzc;
        audioTrack2.getClass();
        if (audioTrack2.getPlayState() == 3) {
            long jNanoTime = System.nanoTime() / 1000;
            if (jNanoTime - zzqzVar.zzl >= WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS) {
                long jZzm2 = zzm();
                if (jZzm2 != 0) {
                    zzqzVar.zzb[zzqzVar.zzv] = zzgd.zzq(jZzm2, zzqzVar.zzi) - jNanoTime;
                    zzqzVar.zzv = (zzqzVar.zzv + 1) % 10;
                    int i = zzqzVar.zzw;
                    if (i < 10) {
                        zzqzVar.zzw = i + 1;
                    }
                    zzqzVar.zzl = jNanoTime;
                    zzqzVar.zzk = 0L;
                    int i2 = 0;
                    while (true) {
                        int i3 = zzqzVar.zzw;
                        if (i2 >= i3) {
                            break;
                        }
                        zzqzVar.zzk += zzqzVar.zzb[i2] / i3;
                        i2++;
                    }
                    if (!zzqzVar.zzg) {
                        zzqx zzqxVar = zzqzVar.zze;
                        zzqxVar.getClass();
                        if (zzqxVar.zzg(jNanoTime)) {
                            long jZzb = zzqxVar.zzb();
                            long jZza = zzqxVar.zza();
                            long jZzm3 = zzm();
                            if (Math.abs(jZzb - jNanoTime) > 5000000) {
                                zzrz zzrzVar = ((zzru) zzqzVar.zza).zza;
                                zzfk.zzf("DefaultAudioSink", "Spurious audio timestamp (system clock mismatch): " + jZza + ", " + jZzb + ", " + jNanoTime + ", " + jZzm3 + ", " + zzrzVar.zzL() + ", " + zzrzVar.zzM());
                                zzqxVar.zzd();
                            } else if (Math.abs(zzgd.zzs(jZza, zzqzVar.zzf) - jZzm3) > 5000000) {
                                zzrz zzrzVar2 = ((zzru) zzqzVar.zza).zza;
                                zzfk.zzf("DefaultAudioSink", "Spurious audio timestamp (frame position mismatch): " + jZza + ", " + jZzb + ", " + jNanoTime + ", " + jZzm3 + ", " + zzrzVar2.zzL() + ", " + zzrzVar2.zzM());
                                zzqxVar.zzd();
                            } else {
                                zzqxVar.zzc();
                            }
                            zzqzVar = this;
                        }
                        if (zzqzVar.zzp && (method = zzqzVar.zzm) != null && jNanoTime - zzqzVar.zzq >= 500000) {
                            try {
                                audioTrack = zzqzVar.zzc;
                            } catch (Exception unused) {
                                zzqzVar.zzm = null;
                            }
                            if (audioTrack == null) {
                                throw null;
                            }
                            Integer num = (Integer) method.invoke(audioTrack, new Object[0]);
                            int i4 = zzgd.zza;
                            long jIntValue = (num.intValue() * 1000) - zzqzVar.zzh;
                            zzqzVar.zzn = jIntValue;
                            long jMax = Math.max(jIntValue, 0L);
                            zzqzVar.zzn = jMax;
                            if (jMax > 5000000) {
                                zzfk.zzf("DefaultAudioSink", "Ignoring impossibly large audio latency: " + jMax);
                                zzqzVar.zzn = 0L;
                            }
                            zzqzVar.zzq = jNanoTime;
                        }
                    }
                }
            } else if (!zzqzVar.zzg) {
            }
        }
        long jNanoTime2 = System.nanoTime() / 1000;
        zzqx zzqxVar2 = zzqzVar.zze;
        zzqxVar2.getClass();
        boolean zZzf = zzqxVar2.zzf();
        if (zZzf) {
            jZzm = zzgd.zzs(zzqxVar2.zza(), zzqzVar.zzf) + zzgd.zzp(jNanoTime2 - zzqxVar2.zzb(), zzqzVar.zzi);
        } else {
            jZzm = zzqzVar.zzw == 0 ? zzm() : zzgd.zzp(zzqzVar.zzk + jNanoTime2, zzqzVar.zzi);
            if (!z) {
                jZzm = Math.max(0L, jZzm - zzqzVar.zzn);
            }
        }
        if (zzqzVar.zzD != zZzf) {
            zzqzVar.zzF = zzqzVar.zzC;
            zzqzVar.zzE = zzqzVar.zzB;
        }
        long j = jNanoTime2 - zzqzVar.zzF;
        if (j < 1000000) {
            long jZzp = zzqzVar.zzE + zzgd.zzp(j, zzqzVar.zzi);
            long j2 = (j * 1000) / 1000000;
            jZzm = ((jZzm * j2) + ((1000 - j2) * jZzp)) / 1000;
        }
        if (!zzqzVar.zzj) {
            long j3 = zzqzVar.zzB;
            if (jZzm > j3) {
                zzqzVar.zzj = true;
                int i5 = zzgd.zza;
                long jCurrentTimeMillis = System.currentTimeMillis() - zzgd.zzu(zzgd.zzq(zzgd.zzu(jZzm - j3), zzqzVar.zzi));
                zzrz zzrzVar3 = ((zzru) zzqzVar.zza).zza;
                if (zzrzVar3.zzq != null) {
                    ((zzse) zzrzVar3.zzq).zza.zzc.zzv(jCurrentTimeMillis);
                }
            }
        }
        zzqzVar.zzC = jNanoTime2;
        zzqzVar.zzB = jZzm;
        zzqzVar.zzD = zZzf;
        return jZzm;
    }

    public final void zzb(long j) {
        this.zzz = zzl();
        this.zzx = zzgd.zzr(SystemClock.elapsedRealtime());
        this.zzA = j;
    }

    public final void zzc() {
        zzn();
        this.zzc = null;
        this.zze = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzd(AudioTrack audioTrack, boolean z, int i, int i2, int i3) {
        boolean z2;
        this.zzc = audioTrack;
        this.zzd = i3;
        this.zze = new zzqx(audioTrack);
        this.zzf = audioTrack.getSampleRate();
        if (!z || zzgd.zza >= 23) {
            z2 = false;
        } else {
            z2 = true;
            if (i != 5) {
                if (i == 6) {
                    i = 6;
                }
            }
        }
        this.zzg = z2;
        boolean zZzK = zzgd.zzK(i);
        this.zzp = zZzK;
        this.zzh = zZzK ? zzgd.zzs(i3 / i2, this.zzf) : -9223372036854775807L;
        this.zzs = 0L;
        this.zzt = 0L;
        this.zzG = false;
        this.zzH = 0L;
        this.zzu = 0L;
        this.zzo = false;
        this.zzx = -9223372036854775807L;
        this.zzy = -9223372036854775807L;
        this.zzq = 0L;
        this.zzn = 0L;
        this.zzi = 1.0f;
    }

    public final void zze(zzer zzerVar) {
        this.zzI = zzerVar;
    }

    public final void zzf() {
        if (this.zzx != -9223372036854775807L) {
            this.zzx = zzgd.zzr(SystemClock.elapsedRealtime());
        }
        zzqx zzqxVar = this.zze;
        zzqxVar.getClass();
        zzqxVar.zze();
    }

    public final boolean zzg(long j) {
        if (j > zzgd.zzo(zza(false), this.zzf)) {
            return true;
        }
        if (this.zzg) {
            AudioTrack audioTrack = this.zzc;
            audioTrack.getClass();
            if (audioTrack.getPlayState() == 2 && zzl() == 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean zzh() {
        AudioTrack audioTrack = this.zzc;
        audioTrack.getClass();
        return audioTrack.getPlayState() == 3;
    }

    public final boolean zzi(long j) {
        return this.zzy != -9223372036854775807L && j > 0 && SystemClock.elapsedRealtime() - this.zzy >= 200;
    }

    public final boolean zzj(long j) {
        AudioTrack audioTrack = this.zzc;
        audioTrack.getClass();
        int playState = audioTrack.getPlayState();
        if (this.zzg) {
            if (playState == 2) {
                this.zzo = false;
                return false;
            }
            if (playState == 1) {
                if (zzl() == 0) {
                    return false;
                }
                playState = 1;
            }
        }
        boolean z = this.zzo;
        boolean zZzg = zzg(j);
        this.zzo = zZzg;
        if (z && !zZzg && playState != 1) {
            zzqy zzqyVar = this.zza;
            int i = this.zzd;
            long jZzu = zzgd.zzu(this.zzh);
            zzru zzruVar = (zzru) zzqyVar;
            zzrz zzrzVar = zzruVar.zza;
            if (zzrzVar.zzq != null) {
                ((zzse) zzruVar.zza.zzq).zza.zzc.zzx(i, jZzu, SystemClock.elapsedRealtime() - zzrzVar.zzW);
            }
        }
        return true;
    }

    public final boolean zzk() {
        zzn();
        if (this.zzx != -9223372036854775807L) {
            this.zzz = zzl();
            return false;
        }
        zzqx zzqxVar = this.zze;
        zzqxVar.getClass();
        zzqxVar.zze();
        return true;
    }
}
