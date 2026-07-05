package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public abstract class zzhjw implements zzasr {
    private static final zzhkh zza = zzhkh.zzb(zzhjw.class);
    protected final String zzb;
    long zze;
    zzhkb zzg;
    private zzass zzh;
    private ByteBuffer zzi;
    long zzf = -1;
    private ByteBuffer zzj = null;
    boolean zzd = true;
    boolean zzc = true;

    protected zzhjw(String str) {
        this.zzb = str;
    }

    private final synchronized void zzd() {
        if (this.zzd) {
            return;
        }
        try {
            zzhkh zzhkhVar = zza;
            String str = this.zzb;
            zzhkhVar.zza(str.length() != 0 ? "mem mapping ".concat(str) : new String("mem mapping "));
            this.zzi = this.zzg.zzd(this.zze, this.zzf);
            this.zzd = true;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzasr
    public final String zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzasr
    public final void zzb(zzhkb zzhkbVar, ByteBuffer byteBuffer, long j, zzaso zzasoVar) throws IOException {
        this.zze = zzhkbVar.zzb();
        byteBuffer.remaining();
        this.zzf = j;
        this.zzg = zzhkbVar;
        zzhkbVar.zze(zzhkbVar.zzb() + j);
        this.zzd = false;
        this.zzc = false;
        zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzasr
    public final void zzc(zzass zzassVar) {
        this.zzh = zzassVar;
    }

    protected abstract void zzf(ByteBuffer byteBuffer);

    public final synchronized void zzg() {
        zzd();
        zzhkh zzhkhVar = zza;
        String str = this.zzb;
        zzhkhVar.zza(str.length() != 0 ? "parsing details of ".concat(str) : new String("parsing details of "));
        ByteBuffer byteBuffer = this.zzi;
        if (byteBuffer != null) {
            this.zzc = true;
            byteBuffer.rewind();
            zzf(byteBuffer);
            if (byteBuffer.remaining() > 0) {
                this.zzj = byteBuffer.slice();
            }
            this.zzi = null;
        }
    }
}
