package com.google.android.gms.internal.ads;

import android.net.Network;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzfuq extends zzfue {
    private zzfyw<Integer> zza;
    private zzfyw<Integer> zzb;
    private zzfup zzc;
    private HttpURLConnection zzd;

    zzfuq() {
        this(new zzfyw() { // from class: com.google.android.gms.internal.ads.zzfug
            @Override // com.google.android.gms.internal.ads.zzfyw
            public final Object zza() {
                return zzfuq.zzf();
            }
        }, new zzfyw() { // from class: com.google.android.gms.internal.ads.zzfuh
            @Override // com.google.android.gms.internal.ads.zzfyw
            public final Object zza() {
                return zzfuq.zzg();
            }
        }, null);
    }

    zzfuq(zzfyw<Integer> zzfywVar, zzfyw<Integer> zzfywVar2, zzfup zzfupVar) {
        this.zza = zzfywVar;
        this.zzb = zzfywVar2;
        this.zzc = zzfupVar;
    }

    static /* synthetic */ Integer zzf() {
        return -1;
    }

    static /* synthetic */ Integer zzg() {
        return -1;
    }

    public static void zzs(HttpURLConnection httpURLConnection) {
        zzfuf.zza();
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        zzs(this.zzd);
    }

    public HttpURLConnection zzm() throws IOException {
        zzfuf.zzb(((Integer) this.zza.zza()).intValue(), ((Integer) this.zzb.zza()).intValue());
        zzfup zzfupVar = this.zzc;
        zzfupVar.getClass();
        HttpURLConnection httpURLConnection = (HttpURLConnection) zzfupVar.zza();
        this.zzd = httpURLConnection;
        return httpURLConnection;
    }

    public HttpURLConnection zzn(zzfup zzfupVar, final int i, final int i2) throws IOException {
        this.zza = new zzfyw() { // from class: com.google.android.gms.internal.ads.zzfui
            @Override // com.google.android.gms.internal.ads.zzfyw
            public final Object zza() {
                return Integer.valueOf(i);
            }
        };
        this.zzb = new zzfyw() { // from class: com.google.android.gms.internal.ads.zzfuj
            @Override // com.google.android.gms.internal.ads.zzfyw
            public final Object zza() {
                return Integer.valueOf(i2);
            }
        };
        this.zzc = zzfupVar;
        return zzm();
    }

    public HttpURLConnection zzo(final Network network, final URL url, final int i, final int i2) throws IOException {
        this.zza = new zzfyw() { // from class: com.google.android.gms.internal.ads.zzfuk
            @Override // com.google.android.gms.internal.ads.zzfyw
            public final Object zza() {
                return Integer.valueOf(i);
            }
        };
        this.zzb = new zzfyw() { // from class: com.google.android.gms.internal.ads.zzful
            @Override // com.google.android.gms.internal.ads.zzfyw
            public final Object zza() {
                return Integer.valueOf(i2);
            }
        };
        this.zzc = new zzfup() { // from class: com.google.android.gms.internal.ads.zzfum
            @Override // com.google.android.gms.internal.ads.zzfup
            public final URLConnection zza() {
                return network.openConnection(url);
            }
        };
        return zzm();
    }

    public URLConnection zzr(final URL url, final int i) throws IOException {
        this.zza = new zzfyw() { // from class: com.google.android.gms.internal.ads.zzfun
            @Override // com.google.android.gms.internal.ads.zzfyw
            public final Object zza() {
                return Integer.valueOf(i);
            }
        };
        this.zzc = new zzfup() { // from class: com.google.android.gms.internal.ads.zzfuo
            @Override // com.google.android.gms.internal.ads.zzfup
            public final URLConnection zza() {
                return url.openConnection();
            }
        };
        return zzm();
    }
}
