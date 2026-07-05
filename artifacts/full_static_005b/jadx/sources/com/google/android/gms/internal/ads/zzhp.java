package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.support.v4.media.session.PlaybackStateCompat;
import androidx.browser.trusted.sharing.ShareTarget;
import com.google.common.net.HttpHeaders;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.NoRouteToHostException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPInputStream;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzhp extends zzgv implements zzhz {
    private final boolean zzb;
    private final int zzc;
    private final int zzd;
    private final String zze;
    private final zzhy zzf;
    private final zzhy zzg;
    private zzhh zzh;
    private HttpURLConnection zzi;
    private InputStream zzj;
    private boolean zzk;
    private int zzl;
    private long zzm;
    private long zzn;

    @Deprecated
    public zzhp() {
        this(null, 8000, 8000, false, null, null, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final HttpURLConnection zzk(URL url, int i, byte[] bArr, long j, long j2, boolean z, boolean z2, Map map) throws IOException {
        String string;
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.zzc);
        httpURLConnection.setReadTimeout(this.zzd);
        HashMap map2 = new HashMap();
        zzhy zzhyVar = this.zzf;
        if (zzhyVar != null) {
            map2.putAll(zzhyVar.zza());
        }
        map2.putAll(this.zzg.zza());
        map2.putAll(map);
        for (Map.Entry entry : map2.entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        if (j != 0) {
            StringBuilder sb = new StringBuilder("bytes=");
            sb.append(j);
            sb.append("-");
            if (j2 != -1) {
                sb.append((j + j2) - 1);
            }
            string = sb.toString();
        } else if (j2 == -1) {
            string = null;
        } else {
            j = 0;
            StringBuilder sb2 = new StringBuilder("bytes=");
            sb2.append(j);
            sb2.append("-");
            if (j2 != -1) {
            }
            string = sb2.toString();
        }
        if (string != null) {
            httpURLConnection.setRequestProperty(HttpHeaders.RANGE, string);
        }
        String str = this.zze;
        if (str != null) {
            httpURLConnection.setRequestProperty(HttpHeaders.USER_AGENT, str);
        }
        httpURLConnection.setRequestProperty(HttpHeaders.ACCEPT_ENCODING, true != z ? "identity" : "gzip");
        httpURLConnection.setInstanceFollowRedirects(z2);
        httpURLConnection.setDoOutput(false);
        int i2 = zzhh.zzh;
        httpURLConnection.setRequestMethod(ShareTarget.METHOD_GET);
        httpURLConnection.connect();
        return httpURLConnection;
    }

    private final URL zzl(URL url, String str, zzhh zzhhVar) throws zzhv {
        if (str == null) {
            throw new zzhv("Null location redirect", zzhhVar, 2001, 1);
        }
        try {
            URL url2 = new URL(url, str);
            String protocol = url2.getProtocol();
            if (!"https".equals(protocol) && !"http".equals(protocol)) {
                throw new zzhv("Unsupported protocol redirect: ".concat(String.valueOf(protocol)), zzhhVar, 2001, 1);
            }
            if (this.zzb || protocol.equals(url.getProtocol())) {
                return url2;
            }
            throw new zzhv("Disallowed cross-protocol redirect (" + url.getProtocol() + " to " + protocol + ")", zzhhVar, 2001, 1);
        } catch (MalformedURLException e) {
            throw new zzhv(e, zzhhVar, 2001, 1);
        }
    }

    private final void zzm() {
        HttpURLConnection httpURLConnection = this.zzi;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                zzfk.zzd("DefaultHttpDataSource", "Unexpected error while disconnecting", e);
            }
            this.zzi = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0029 A[Catch: IOException -> 0x0033, TRY_LEAVE, TryCatch #0 {IOException -> 0x0033, blocks: (B:4:0x0004, B:6:0x000d, B:9:0x0018, B:10:0x001e, B:13:0x0029), top: B:18:0x0004 }] */
    @Override // com.google.android.gms.internal.ads.zzu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zza(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        if (i2 == 0) {
            return 0;
        }
        try {
            long j = this.zzm;
            if (j != -1) {
                long j2 = j - this.zzn;
                if (j2 != 0) {
                    i2 = (int) Math.min(i2, j2);
                    InputStream inputStream = this.zzj;
                    int i4 = zzgd.zza;
                    i3 = inputStream.read(bArr, i, i2);
                    if (i3 == -1) {
                        this.zzn += i3;
                        zzg(i3);
                        return i3;
                    }
                }
            } else {
                InputStream inputStream2 = this.zzj;
                int i42 = zzgd.zza;
                i3 = inputStream2.read(bArr, i, i2);
                if (i3 == -1) {
                }
            }
            return -1;
        } catch (IOException e) {
            zzhh zzhhVar = this.zzh;
            int i5 = zzgd.zza;
            throw zzhv.zza(e, zzhhVar, 2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00ba  */
    @Override // com.google.android.gms.internal.ads.zzhb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long zzb(zzhh zzhhVar) throws IOException, NumberFormatException {
        int i;
        URL url;
        long j;
        long j2;
        boolean zZzb;
        HttpURLConnection httpURLConnectionZzk;
        String str;
        byte[] bArrZzb;
        long j3;
        this.zzh = zzhhVar;
        this.zzn = 0L;
        this.zzm = 0L;
        zzi(zzhhVar);
        try {
            url = new URL(zzhhVar.zza.toString());
            int i2 = zzhhVar.zzb;
            byte[] bArr = zzhhVar.zzc;
            j = zzhhVar.zze;
            j2 = zzhhVar.zzf;
            zZzb = zzhhVar.zzb(1);
            try {
            } catch (IOException e) {
                e = e;
                i = 1;
            }
        } catch (IOException e2) {
            e = e2;
            i = 1;
        }
        if (this.zzb) {
            URL urlZzl = url;
            int i3 = 0;
            while (true) {
                int i4 = i3 + 1;
                if (i3 > 20) {
                    i = 1;
                    throw new zzhv(new NoRouteToHostException("Too many redirects: " + i4), zzhhVar, 2001, 1);
                }
                long j4 = j2;
                long j5 = j;
                URL url2 = urlZzl;
                HttpURLConnection httpURLConnectionZzk2 = zzk(urlZzl, 1, null, j, j2, zZzb, false, zzhhVar.zzd);
                int responseCode = httpURLConnectionZzk2.getResponseCode();
                String headerField = httpURLConnectionZzk2.getHeaderField(HttpHeaders.LOCATION);
                if (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303 && responseCode != 307 && responseCode != 308) {
                    httpURLConnectionZzk = httpURLConnectionZzk2;
                    break;
                }
                i = 1;
                try {
                    httpURLConnectionZzk2.disconnect();
                    urlZzl = zzl(url2, headerField, zzhhVar);
                    i3 = i4;
                    j2 = j4;
                    j = j5;
                } catch (IOException e3) {
                    e = e3;
                }
                e = e3;
                zzm();
                throw zzhv.zza(e, zzhhVar, i);
            }
        }
        httpURLConnectionZzk = zzk(url, 1, null, j, j2, zZzb, true, zzhhVar.zzd);
        this.zzi = httpURLConnectionZzk;
        this.zzl = httpURLConnectionZzk.getResponseCode();
        String responseMessage = httpURLConnectionZzk.getResponseMessage();
        int i5 = this.zzl;
        if (i5 < 200 || i5 > 299) {
            Map<String, List<String>> headerFields = httpURLConnectionZzk.getHeaderFields();
            if (this.zzl == 416) {
                str = responseMessage;
                if (zzhhVar.zze == zzia.zzb(httpURLConnectionZzk.getHeaderField(HttpHeaders.CONTENT_RANGE))) {
                    this.zzk = true;
                    zzj(zzhhVar);
                    long j6 = zzhhVar.zzf;
                    if (j6 != -1) {
                        return j6;
                    }
                    return 0L;
                }
            } else {
                str = responseMessage;
            }
            InputStream errorStream = httpURLConnectionZzk.getErrorStream();
            try {
                bArrZzb = errorStream != null ? zzgdm.zzb(errorStream) : zzgd.zzf;
            } catch (IOException unused) {
                bArrZzb = zzgd.zzf;
            }
            byte[] bArr2 = bArrZzb;
            zzm();
            throw new zzhx(this.zzl, str, this.zzl == 416 ? new zzhc(2008) : null, headerFields, zzhhVar, bArr2);
        }
        httpURLConnectionZzk.getContentType();
        if (this.zzl == 200) {
            j3 = zzhhVar.zze;
            if (j3 == 0) {
                j3 = 0;
            }
        }
        boolean zEqualsIgnoreCase = "gzip".equalsIgnoreCase(httpURLConnectionZzk.getHeaderField(HttpHeaders.CONTENT_ENCODING));
        if (zEqualsIgnoreCase) {
            this.zzm = zzhhVar.zzf;
        } else {
            long j7 = zzhhVar.zzf;
            if (j7 != -1) {
                this.zzm = j7;
            } else {
                long jZza = zzia.zza(httpURLConnectionZzk.getHeaderField(HttpHeaders.CONTENT_LENGTH), httpURLConnectionZzk.getHeaderField(HttpHeaders.CONTENT_RANGE));
                this.zzm = jZza != -1 ? jZza - j3 : -1L;
            }
        }
        try {
            this.zzj = httpURLConnectionZzk.getInputStream();
            if (zEqualsIgnoreCase) {
                this.zzj = new GZIPInputStream(this.zzj);
            }
            this.zzk = true;
            zzj(zzhhVar);
            if (j3 != 0) {
                try {
                    byte[] bArr3 = new byte[4096];
                    while (j3 > 0) {
                        int iMin = (int) Math.min(j3, PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM);
                        InputStream inputStream = this.zzj;
                        int i6 = zzgd.zza;
                        int i7 = inputStream.read(bArr3, 0, iMin);
                        if (Thread.currentThread().isInterrupted()) {
                            throw new zzhv(new InterruptedIOException(), zzhhVar, 2000, 1);
                        }
                        if (i7 == -1) {
                            throw new zzhv(zzhhVar, 2008, 1);
                        }
                        j3 -= i7;
                        zzg(i7);
                    }
                } catch (IOException e4) {
                    zzm();
                    if (e4 instanceof zzhv) {
                        throw ((zzhv) e4);
                    }
                    throw new zzhv(e4, zzhhVar, 2000, 1);
                }
            }
            return this.zzm;
        } catch (IOException e5) {
            zzm();
            throw new zzhv(e5, zzhhVar, 2000, 1);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    public final Uri zzc() {
        HttpURLConnection httpURLConnection = this.zzi;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    public final void zzd() throws zzhv {
        try {
            InputStream inputStream = this.zzj;
            if (inputStream != null) {
                if (this.zzi != null) {
                    int i = zzgd.zza;
                }
                try {
                    inputStream.close();
                } catch (IOException e) {
                    zzhh zzhhVar = this.zzh;
                    int i2 = zzgd.zza;
                    throw new zzhv(e, zzhhVar, 2000, 3);
                }
            }
        } finally {
            this.zzj = null;
            zzm();
            if (this.zzk) {
                this.zzk = false;
                zzh();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgv, com.google.android.gms.internal.ads.zzhb
    public final Map zze() {
        HttpURLConnection httpURLConnection = this.zzi;
        return httpURLConnection == null ? zzgbf.zzd() : new zzhn(httpURLConnection.getHeaderFields());
    }

    private zzhp(String str, int i, int i2, boolean z, zzhy zzhyVar, zzfyh zzfyhVar, boolean z2) {
        super(true);
        this.zze = str;
        this.zzc = i;
        this.zzd = i2;
        this.zzb = z;
        this.zzf = zzhyVar;
        this.zzg = new zzhy();
    }
}
