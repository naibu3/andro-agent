package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.DeniedByServerException;
import android.media.MediaCodec;
import android.media.MediaDrm;
import android.media.MediaDrmResetException;
import android.media.NotProvisionedException;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.media.metrics.NetworkEvent;
import android.media.metrics.PlaybackErrorEvent;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.PlaybackStateEvent;
import android.media.metrics.TrackChangeEvent;
import android.os.SystemClock;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.util.Pair;
import androidx.core.view.PointerIconCompat;
import androidx.window.embedding.EmbeddingCompat;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.UUID;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzpf implements zzna, zzpg {
    private final Context zza;
    private final zzph zzb;
    private final PlaybackSession zzc;
    private String zzi;
    private PlaybackMetrics.Builder zzj;
    private int zzk;
    private zzcj zzn;
    private zzpe zzo;
    private zzpe zzp;
    private zzpe zzq;
    private zzan zzr;
    private zzan zzs;
    private zzan zzt;
    private boolean zzu;
    private boolean zzv;
    private int zzw;
    private int zzx;
    private int zzy;
    private boolean zzz;
    private final zzdb zze = new zzdb();
    private final zzcz zzf = new zzcz();
    private final HashMap zzh = new HashMap();
    private final HashMap zzg = new HashMap();
    private final long zzd = SystemClock.elapsedRealtime();
    private int zzl = 0;
    private int zzm = 0;

    private zzpf(Context context, PlaybackSession playbackSession) {
        this.zza = context.getApplicationContext();
        this.zzc = playbackSession;
        zzpd zzpdVar = new zzpd(zzpd.zza);
        this.zzb = zzpdVar;
        zzpdVar.zzh(this);
    }

    public static zzpf zzb(Context context) {
        MediaMetricsManager mediaMetricsManager = (MediaMetricsManager) context.getSystemService("media_metrics");
        if (mediaMetricsManager == null) {
            return null;
        }
        return new zzpf(context, mediaMetricsManager.createPlaybackSession());
    }

    private static int zzr(int i) {
        switch (zzgd.zzj(i)) {
            case 6002:
                return 24;
            case 6003:
                return 28;
            case 6004:
                return 25;
            case 6005:
                return 26;
            default:
                return 27;
        }
    }

    private final void zzs() {
        PlaybackMetrics.Builder builder = this.zzj;
        if (builder != null && this.zzz) {
            builder.setAudioUnderrunCount(this.zzy);
            this.zzj.setVideoFramesDropped(this.zzw);
            this.zzj.setVideoFramesPlayed(this.zzx);
            Long l = (Long) this.zzg.get(this.zzi);
            this.zzj.setNetworkTransferDurationMillis(l == null ? 0L : l.longValue());
            Long l2 = (Long) this.zzh.get(this.zzi);
            this.zzj.setNetworkBytesRead(l2 == null ? 0L : l2.longValue());
            this.zzj.setStreamSource((l2 == null || l2.longValue() <= 0) ? 0 : 1);
            this.zzc.reportPlaybackMetrics(this.zzj.build());
        }
        this.zzj = null;
        this.zzi = null;
        this.zzy = 0;
        this.zzw = 0;
        this.zzx = 0;
        this.zzr = null;
        this.zzs = null;
        this.zzt = null;
        this.zzz = false;
    }

    private final void zzt(long j, zzan zzanVar, int i) {
        if (zzgd.zzG(this.zzs, zzanVar)) {
            return;
        }
        int i2 = this.zzs == null ? 1 : 0;
        this.zzs = zzanVar;
        zzx(0, j, zzanVar, i2);
    }

    private final void zzu(long j, zzan zzanVar, int i) {
        if (zzgd.zzG(this.zzt, zzanVar)) {
            return;
        }
        int i2 = this.zzt == null ? 1 : 0;
        this.zzt = zzanVar;
        zzx(2, j, zzanVar, i2);
    }

    @RequiresNonNull({"metricsBuilder"})
    private final void zzv(zzdc zzdcVar, zzvo zzvoVar) {
        int iZza;
        PlaybackMetrics.Builder builder = this.zzj;
        if (zzvoVar == null || (iZza = zzdcVar.zza(zzvoVar.zza)) == -1) {
            return;
        }
        int i = 0;
        zzdcVar.zzd(iZza, this.zzf, false);
        zzdcVar.zze(this.zzf.zzd, this.zze, 0L);
        zzbn zzbnVar = this.zze.zze.zzd;
        if (zzbnVar != null) {
            int iZzn = zzgd.zzn(zzbnVar.zzb);
            i = iZzn != 0 ? iZzn != 1 ? iZzn != 2 ? 1 : 4 : 5 : 3;
        }
        builder.setStreamType(i);
        zzdb zzdbVar = this.zze;
        if (zzdbVar.zzo != -9223372036854775807L && !zzdbVar.zzm && !zzdbVar.zzj && !zzdbVar.zzb()) {
            builder.setMediaDurationMillis(zzgd.zzu(this.zze.zzo));
        }
        builder.setPlaybackType(true != this.zze.zzb() ? 1 : 2);
        this.zzz = true;
    }

    private final void zzw(long j, zzan zzanVar, int i) {
        if (zzgd.zzG(this.zzr, zzanVar)) {
            return;
        }
        int i2 = this.zzr == null ? 1 : 0;
        this.zzr = zzanVar;
        zzx(1, j, zzanVar, i2);
    }

    private final void zzx(int i, long j, zzan zzanVar, int i2) {
        TrackChangeEvent.Builder timeSinceCreatedMillis = new TrackChangeEvent.Builder(i).setTimeSinceCreatedMillis(j - this.zzd);
        if (zzanVar != null) {
            timeSinceCreatedMillis.setTrackState(1);
            timeSinceCreatedMillis.setTrackChangeReason(i2 != 1 ? 1 : 2);
            String str = zzanVar.zzm;
            if (str != null) {
                timeSinceCreatedMillis.setContainerMimeType(str);
            }
            String str2 = zzanVar.zzn;
            if (str2 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str2);
            }
            String str3 = zzanVar.zzk;
            if (str3 != null) {
                timeSinceCreatedMillis.setCodecName(str3);
            }
            int i3 = zzanVar.zzj;
            if (i3 != -1) {
                timeSinceCreatedMillis.setBitrate(i3);
            }
            int i4 = zzanVar.zzs;
            if (i4 != -1) {
                timeSinceCreatedMillis.setWidth(i4);
            }
            int i5 = zzanVar.zzt;
            if (i5 != -1) {
                timeSinceCreatedMillis.setHeight(i5);
            }
            int i6 = zzanVar.zzA;
            if (i6 != -1) {
                timeSinceCreatedMillis.setChannelCount(i6);
            }
            int i7 = zzanVar.zzB;
            if (i7 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i7);
            }
            String str4 = zzanVar.zze;
            if (str4 != null) {
                int i8 = zzgd.zza;
                String[] strArrSplit = str4.split("-", -1);
                Pair pairCreate = Pair.create(strArrSplit[0], strArrSplit.length >= 2 ? strArrSplit[1] : null);
                timeSinceCreatedMillis.setLanguage((String) pairCreate.first);
                if (pairCreate.second != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) pairCreate.second);
                }
            }
            float f = zzanVar.zzu;
            if (f != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.zzz = true;
        this.zzc.reportTrackChangeEvent(timeSinceCreatedMillis.build());
    }

    @EnsuresNonNullIf(expression = {"#1"}, result = EmbeddingCompat.DEBUG)
    private final boolean zzy(zzpe zzpeVar) {
        if (zzpeVar != null) {
            return zzpeVar.zzc.equals(this.zzb.zze());
        }
        return false;
    }

    public final LogSessionId zza() {
        return this.zzc.getSessionId();
    }

    @Override // com.google.android.gms.internal.ads.zzpg
    public final void zzc(zzmy zzmyVar, String str) {
        zzvo zzvoVar = zzmyVar.zzd;
        if (zzvoVar == null || !zzvoVar.zzb()) {
            zzs();
            this.zzi = str;
            this.zzj = new PlaybackMetrics.Builder().setPlayerName("AndroidXMedia3").setPlayerVersion("1.4.0-alpha01");
            zzv(zzmyVar.zzb, zzmyVar.zzd);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzpg
    public final void zzd(zzmy zzmyVar, String str, boolean z) {
        zzvo zzvoVar = zzmyVar.zzd;
        if ((zzvoVar == null || !zzvoVar.zzb()) && str.equals(this.zzi)) {
            zzs();
        }
        this.zzg.remove(str);
        this.zzh.remove(str);
    }

    @Override // com.google.android.gms.internal.ads.zzna
    public final /* synthetic */ void zze(zzmy zzmyVar, zzan zzanVar, zziy zziyVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzna
    public final void zzf(zzmy zzmyVar, int i, long j, long j2) {
        zzvo zzvoVar = zzmyVar.zzd;
        if (zzvoVar != null) {
            zzph zzphVar = this.zzb;
            zzdc zzdcVar = zzmyVar.zzb;
            HashMap map = this.zzh;
            String strZzf = zzphVar.zzf(zzdcVar, zzvoVar);
            Long l = (Long) map.get(strZzf);
            Long l2 = (Long) this.zzg.get(strZzf);
            this.zzh.put(strZzf, Long.valueOf((l == null ? 0L : l.longValue()) + j));
            this.zzg.put(strZzf, Long.valueOf((l2 != null ? l2.longValue() : 0L) + i));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzna
    public final void zzg(zzmy zzmyVar, zzvk zzvkVar) {
        zzvo zzvoVar = zzmyVar.zzd;
        if (zzvoVar == null) {
            return;
        }
        zzan zzanVar = zzvkVar.zzb;
        zzanVar.getClass();
        zzpe zzpeVar = new zzpe(zzanVar, 0, this.zzb.zzf(zzmyVar.zzb, zzvoVar));
        int i = zzvkVar.zza;
        if (i != 0) {
            if (i == 1) {
                this.zzp = zzpeVar;
                return;
            } else if (i != 2) {
                if (i != 3) {
                    return;
                }
                this.zzq = zzpeVar;
                return;
            }
        }
        this.zzo = zzpeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzna
    public final /* synthetic */ void zzh(zzmy zzmyVar, int i, long j) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x02a1  */
    @Override // com.google.android.gms.internal.ads.zzna
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzi(zzct zzctVar, zzmz zzmzVar) throws NumberFormatException {
        int i;
        int i2;
        int iZzr;
        int i3;
        int errorCode;
        int iZzk;
        zzae zzaeVar;
        int i4;
        int i5;
        if (zzmzVar.zzb() == 0) {
            return;
        }
        for (int i6 = 0; i6 < zzmzVar.zzb(); i6++) {
            int iZza = zzmzVar.zza(i6);
            zzmy zzmyVarZzc = zzmzVar.zzc(iZza);
            if (iZza == 0) {
                this.zzb.zzk(zzmyVarZzc);
            } else if (iZza == 11) {
                this.zzb.zzj(zzmyVarZzc, this.zzk);
            } else {
                this.zzb.zzi(zzmyVarZzc);
            }
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (zzmzVar.zzd(0)) {
            zzmy zzmyVarZzc2 = zzmzVar.zzc(0);
            if (this.zzj != null) {
                zzv(zzmyVarZzc2.zzb, zzmyVarZzc2.zzd);
            }
        }
        if (zzmzVar.zzd(2) && this.zzj != null) {
            zzgbc zzgbcVarZza = zzctVar.zzo().zza();
            int size = zzgbcVarZza.size();
            int i7 = 0;
            loop1: while (true) {
                if (i7 >= size) {
                    zzaeVar = null;
                    break;
                }
                zzdo zzdoVar = (zzdo) zzgbcVarZza.get(i7);
                int i8 = 0;
                while (true) {
                    i5 = i7 + 1;
                    if (i8 < zzdoVar.zzb) {
                        if (zzdoVar.zzd(i8) && (zzaeVar = zzdoVar.zzb(i8).zzq) != null) {
                            break loop1;
                        } else {
                            i8++;
                        }
                    }
                }
                i7 = i5;
            }
            if (zzaeVar != null) {
                PlaybackMetrics.Builder builder = this.zzj;
                int i9 = zzgd.zza;
                int i10 = 0;
                while (true) {
                    if (i10 >= zzaeVar.zzb) {
                        i4 = 1;
                        break;
                    }
                    UUID uuid = zzaeVar.zza(i10).zza;
                    if (uuid.equals(zzo.zzd)) {
                        i4 = 3;
                        break;
                    } else if (uuid.equals(zzo.zze)) {
                        i4 = 2;
                        break;
                    } else {
                        if (uuid.equals(zzo.zzc)) {
                            i4 = 6;
                            break;
                        }
                        i10++;
                    }
                }
                builder.setDrmType(i4);
            }
        }
        if (zzmzVar.zzd(PointerIconCompat.TYPE_COPY)) {
            this.zzy++;
        }
        zzcj zzcjVar = this.zzn;
        if (zzcjVar != null) {
            Context context = this.zza;
            if (zzcjVar.zzb == 1001) {
                i3 = 20;
            } else {
                zzjh zzjhVar = (zzjh) zzcjVar;
                boolean z = zzjhVar.zze == 1;
                int i11 = zzjhVar.zzi;
                Throwable cause = zzcjVar.getCause();
                cause.getClass();
                if (cause instanceof IOException) {
                    if (cause instanceof zzhx) {
                        iZzk = ((zzhx) cause).zzd;
                        i3 = 5;
                    } else if ((cause instanceof zzhw) || (cause instanceof zzch)) {
                        iZzk = 0;
                        i3 = 11;
                    } else {
                        boolean z2 = cause instanceof zzhv;
                        if (z2 || (cause instanceof zzif)) {
                            if (zzfs.zzb(context).zza() == 1) {
                                iZzk = 0;
                                i3 = 3;
                            } else {
                                Throwable cause2 = cause.getCause();
                                if (cause2 instanceof UnknownHostException) {
                                    iZzk = 0;
                                    i3 = 6;
                                } else if (cause2 instanceof SocketTimeoutException) {
                                    iZzk = 0;
                                    i3 = 7;
                                } else if (z2 && ((zzhv) cause).zzc == 1) {
                                    iZzk = 0;
                                    i3 = 4;
                                } else {
                                    iZzk = 0;
                                    i3 = 8;
                                }
                            }
                        } else if (zzcjVar.zzb == 1002) {
                            i3 = 21;
                        } else if (cause instanceof zzsm) {
                            Throwable cause3 = cause.getCause();
                            cause3.getClass();
                            int i12 = zzgd.zza;
                            if (cause3 instanceof MediaDrm.MediaDrmStateException) {
                                errorCode = zzgd.zzk(((MediaDrm.MediaDrmStateException) cause3).getDiagnosticInfo());
                                iZzr = zzr(errorCode);
                                int i13 = iZzr;
                                iZzk = errorCode;
                                i3 = i13;
                            } else if (zzgd.zza >= 23 && (cause3 instanceof MediaDrmResetException)) {
                                i3 = 27;
                            } else if (cause3 instanceof NotProvisionedException) {
                                i3 = 24;
                            } else if (cause3 instanceof DeniedByServerException) {
                                i3 = 29;
                            } else {
                                if (!(cause3 instanceof zzsw)) {
                                    i3 = cause3 instanceof zzsk ? 28 : 30;
                                }
                                iZzk = 0;
                                i3 = 23;
                            }
                        } else if ((cause instanceof zzhr) && (cause.getCause() instanceof FileNotFoundException)) {
                            Throwable cause4 = cause.getCause();
                            cause4.getClass();
                            Throwable cause5 = cause4.getCause();
                            int i14 = zzgd.zza;
                            if ((cause5 instanceof ErrnoException) && ((ErrnoException) cause5).errno == OsConstants.EACCES) {
                                i3 = 32;
                            } else {
                                iZzk = 0;
                                i3 = 31;
                            }
                        } else {
                            iZzk = 0;
                            i3 = 9;
                        }
                    }
                    this.zzc.reportPlaybackErrorEvent(new PlaybackErrorEvent.Builder().setTimeSinceCreatedMillis(jElapsedRealtime - this.zzd).setErrorCode(i3).setSubErrorCode(iZzk).setException(zzcjVar).build());
                    this.zzz = true;
                    this.zzn = null;
                } else if (z) {
                    i3 = 35;
                    if (i11 != 0 && i11 != 1) {
                        if (z && i11 == 3) {
                            i3 = 15;
                        } else {
                            if (z && i11 == 2) {
                                iZzk = 0;
                                i3 = 23;
                            } else if (cause instanceof zztt) {
                                iZzk = zzgd.zzk(((zztt) cause).zzd);
                                i3 = 13;
                            } else {
                                iZzr = 14;
                                if (cause instanceof zzto) {
                                    errorCode = zzgd.zzk(((zzto) cause).zzb);
                                } else if (cause instanceof OutOfMemoryError) {
                                    i3 = 14;
                                } else if (cause instanceof zzqr) {
                                    errorCode = ((zzqr) cause).zza;
                                    iZzr = 17;
                                } else if (cause instanceof zzqu) {
                                    errorCode = ((zzqu) cause).zza;
                                    iZzr = 18;
                                } else if (cause instanceof MediaCodec.CryptoException) {
                                    errorCode = ((MediaCodec.CryptoException) cause).getErrorCode();
                                    iZzr = zzr(errorCode);
                                } else {
                                    i3 = 22;
                                }
                                int i132 = iZzr;
                                iZzk = errorCode;
                                i3 = i132;
                            }
                            this.zzc.reportPlaybackErrorEvent(new PlaybackErrorEvent.Builder().setTimeSinceCreatedMillis(jElapsedRealtime - this.zzd).setErrorCode(i3).setSubErrorCode(iZzk).setException(zzcjVar).build());
                            this.zzz = true;
                            this.zzn = null;
                        }
                    }
                }
            }
            iZzk = 0;
            this.zzc.reportPlaybackErrorEvent(new PlaybackErrorEvent.Builder().setTimeSinceCreatedMillis(jElapsedRealtime - this.zzd).setErrorCode(i3).setSubErrorCode(iZzk).setException(zzcjVar).build());
            this.zzz = true;
            this.zzn = null;
        }
        if (zzmzVar.zzd(2)) {
            zzdp zzdpVarZzo = zzctVar.zzo();
            boolean zZzb = zzdpVarZzo.zzb(2);
            boolean zZzb2 = zzdpVarZzo.zzb(1);
            boolean zZzb3 = zzdpVarZzo.zzb(3);
            if (zZzb || zZzb2) {
                if (!zZzb) {
                    zzw(jElapsedRealtime, null, 0);
                }
                if (!zZzb2) {
                    zzt(jElapsedRealtime, null, 0);
                }
                if (!zZzb3) {
                    zzu(jElapsedRealtime, null, 0);
                }
            } else if (zZzb3) {
                zZzb3 = true;
                if (!zZzb) {
                }
                if (!zZzb2) {
                }
                if (!zZzb3) {
                }
            }
        }
        if (zzy(this.zzo)) {
            zzpe zzpeVar = this.zzo;
            zzan zzanVar = zzpeVar.zza;
            if (zzanVar.zzt != -1) {
                int i15 = zzpeVar.zzb;
                zzw(jElapsedRealtime, zzanVar, 0);
                this.zzo = null;
            }
        }
        if (zzy(this.zzp)) {
            zzpe zzpeVar2 = this.zzp;
            zzan zzanVar2 = zzpeVar2.zza;
            int i16 = zzpeVar2.zzb;
            zzt(jElapsedRealtime, zzanVar2, 0);
            this.zzp = null;
        }
        if (zzy(this.zzq)) {
            zzpe zzpeVar3 = this.zzq;
            zzan zzanVar3 = zzpeVar3.zza;
            int i17 = zzpeVar3.zzb;
            zzu(jElapsedRealtime, zzanVar3, 0);
            this.zzq = null;
        }
        switch (zzfs.zzb(this.zza).zza()) {
            case 0:
                i = 0;
                break;
            case 1:
                i = 9;
                break;
            case 2:
                i = 2;
                break;
            case 3:
                i = 4;
                break;
            case 4:
                i = 5;
                break;
            case 5:
                i = 6;
                break;
            case 6:
            case 8:
            default:
                i = 1;
                break;
            case 7:
                i = 3;
                break;
            case 9:
                i = 8;
                break;
            case 10:
                i = 7;
                break;
        }
        if (i != this.zzm) {
            this.zzm = i;
            this.zzc.reportNetworkEvent(new NetworkEvent.Builder().setNetworkType(i).setTimeSinceCreatedMillis(jElapsedRealtime - this.zzd).build());
        }
        if (zzctVar.zzf() != 2) {
            this.zzu = false;
        }
        if (((zzmt) zzctVar).zzC() == null) {
            this.zzv = false;
        } else if (zzmzVar.zzd(10)) {
            this.zzv = true;
        }
        int iZzf = zzctVar.zzf();
        if (this.zzu) {
            i2 = 5;
        } else if (this.zzv) {
            i2 = 13;
        } else {
            i2 = 4;
            if (iZzf == 4) {
                i2 = 11;
            } else if (iZzf == 2) {
                int i18 = this.zzl;
                i2 = (i18 == 0 || i18 == 2 || i18 == 12) ? 2 : !zzctVar.zzv() ? 7 : zzctVar.zzg() != 0 ? 10 : 6;
            } else if (iZzf != 3) {
                i2 = (iZzf != 1 || this.zzl == 0) ? this.zzl : 12;
            } else if (zzctVar.zzv()) {
                i2 = zzctVar.zzg() != 0 ? 9 : 3;
            }
        }
        if (this.zzl != i2) {
            this.zzl = i2;
            this.zzz = true;
            this.zzc.reportPlaybackStateEvent(new PlaybackStateEvent.Builder().setState(this.zzl).setTimeSinceCreatedMillis(jElapsedRealtime - this.zzd).build());
        }
        if (zzmzVar.zzd(1028)) {
            this.zzb.zzg(zzmzVar.zzc(1028));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzna
    public final void zzj(zzmy zzmyVar, zzvf zzvfVar, zzvk zzvkVar, IOException iOException, boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzna
    public final /* synthetic */ void zzk(zzmy zzmyVar, int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzna
    public final void zzl(zzmy zzmyVar, zzcj zzcjVar) {
        this.zzn = zzcjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzna
    public final void zzm(zzmy zzmyVar, zzcs zzcsVar, zzcs zzcsVar2, int i) {
        if (i == 1) {
            this.zzu = true;
            i = 1;
        }
        this.zzk = i;
    }

    @Override // com.google.android.gms.internal.ads.zzna
    public final /* synthetic */ void zzn(zzmy zzmyVar, Object obj, long j) {
    }

    @Override // com.google.android.gms.internal.ads.zzna
    public final void zzo(zzmy zzmyVar, zzix zzixVar) {
        this.zzw += zzixVar.zzg;
        this.zzx += zzixVar.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzna
    public final /* synthetic */ void zzp(zzmy zzmyVar, zzan zzanVar, zziy zziyVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzna
    public final void zzq(zzmy zzmyVar, zzdv zzdvVar) {
        zzpe zzpeVar = this.zzo;
        if (zzpeVar != null) {
            zzan zzanVar = zzpeVar.zza;
            if (zzanVar.zzt == -1) {
                zzal zzalVarZzb = zzanVar.zzb();
                zzalVarZzb.zzac(zzdvVar.zzc);
                zzalVarZzb.zzI(zzdvVar.zzd);
                this.zzo = new zzpe(zzalVarZzb.zzad(), 0, zzpeVar.zzc);
            }
        }
    }
}
