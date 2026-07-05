package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.text.TextUtils;
import com.google.common.net.HttpHeaders;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.HttpURLConnection;
import java.net.NoRouteToHostException;
import java.net.ProtocolException;
import java.net.Socket;
import java.net.SocketException;
import java.net.URL;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzcga extends zzgv implements zzhz {
    private static final Pattern zzb = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");
    private static final AtomicReference zzc = new AtomicReference();
    private final SSLSocketFactory zzd;
    private final int zze;
    private final int zzf;
    private final String zzg;
    private final zzhy zzh;
    private zzhh zzi;
    private HttpURLConnection zzj;
    private InputStream zzk;
    private boolean zzl;
    private int zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private long zzq;
    private int zzr;
    private final Set zzs;

    zzcga(String str, zzie zzieVar, int i, int i2, int i3) {
        super(true);
        this.zzd = new zzcfz(this);
        this.zzs = new HashSet();
        zzeq.zzc(str);
        this.zzg = str;
        this.zzh = new zzhy();
        this.zze = i;
        this.zzf = i2;
        this.zzr = i3;
        if (zzieVar != null) {
            zzf(zzieVar);
        }
    }

    private final void zzn() {
        HttpURLConnection httpURLConnection = this.zzj;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                com.google.android.gms.ads.internal.util.client.zzm.zzh("Unexpected error while disconnecting", e);
            }
            this.zzj = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x026d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:126:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b9 A[Catch: IOException -> 0x028c, TryCatch #4 {IOException -> 0x028c, blocks: (B:3:0x000e, B:4:0x0025, B:6:0x002b, B:8:0x0035, B:9:0x003d, B:10:0x0055, B:12:0x005b, B:19:0x007f, B:21:0x0099, B:22:0x00ab, B:23:0x00b0, B:25:0x00b9, B:26:0x00c0, B:39:0x00e8, B:93:0x0231, B:95:0x023c, B:97:0x024d, B:100:0x0256, B:101:0x0265, B:103:0x026d, B:104:0x0274, B:105:0x0275, B:106:0x028b), top: B:118:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x023c A[Catch: IOException -> 0x028c, TryCatch #4 {IOException -> 0x028c, blocks: (B:3:0x000e, B:4:0x0025, B:6:0x002b, B:8:0x0035, B:9:0x003d, B:10:0x0055, B:12:0x005b, B:19:0x007f, B:21:0x0099, B:22:0x00ab, B:23:0x00b0, B:25:0x00b9, B:26:0x00c0, B:39:0x00e8, B:93:0x0231, B:95:0x023c, B:97:0x024d, B:100:0x0256, B:101:0x0265, B:103:0x026d, B:104:0x0274, B:105:0x0275, B:106:0x028b), top: B:118:0x000e }] */
    @Override // com.google.android.gms.internal.ads.zzhb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long zzb(zzhh zzhhVar) throws IOException, NumberFormatException {
        int responseCode;
        String headerField;
        int responseCode2;
        long j;
        long jMax;
        String headerField2;
        this.zzi = zzhhVar;
        long j2 = 0;
        this.zzq = 0L;
        this.zzp = 0L;
        try {
            URL url = new URL(zzhhVar.zza.toString());
            byte[] bArr = zzhhVar.zzc;
            long j3 = zzhhVar.zze;
            long j4 = zzhhVar.zzf;
            boolean zZzb = zzhhVar.zzb(1);
            int i = 0;
            while (true) {
                int i2 = i + 1;
                if (i > 20) {
                    throw new NoRouteToHostException("Too many redirects: " + i2);
                }
                HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                if (httpURLConnection instanceof HttpsURLConnection) {
                    ((HttpsURLConnection) httpURLConnection).setSSLSocketFactory(this.zzd);
                }
                httpURLConnection.setConnectTimeout(this.zze);
                httpURLConnection.setReadTimeout(this.zzf);
                for (Map.Entry entry : this.zzh.zza().entrySet()) {
                    httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
                if (j3 == j2) {
                    if (j4 != -1) {
                    }
                    httpURLConnection.setRequestProperty(HttpHeaders.USER_AGENT, this.zzg);
                    if (!zZzb) {
                        httpURLConnection.setRequestProperty(HttpHeaders.ACCEPT_ENCODING, "identity");
                    }
                    httpURLConnection.setInstanceFollowRedirects(false);
                    httpURLConnection.setDoOutput(false);
                    httpURLConnection.connect();
                    responseCode = httpURLConnection.getResponseCode();
                    if (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303 && responseCode != 307 && responseCode != 308) {
                        this.zzj = httpURLConnection;
                        try {
                            responseCode2 = httpURLConnection.getResponseCode();
                            this.zzm = responseCode2;
                            if (responseCode2 >= 200 || responseCode2 > 299) {
                                Map<String, List<String>> headerFields = this.zzj.getHeaderFields();
                                zzn();
                                zzhx zzhxVar = new zzhx(this.zzm, null, null, headerFields, zzhhVar, zzgd.zzf);
                                if (this.zzm == 416) {
                                    throw zzhxVar;
                                }
                                zzhxVar.initCause(new zzhc(2008));
                                throw zzhxVar;
                            }
                            if (responseCode2 == 200) {
                                j = zzhhVar.zze;
                                if (j == 0) {
                                    j = 0;
                                }
                            }
                            this.zzn = j;
                            if (zzhhVar.zzb(1)) {
                                this.zzo = zzhhVar.zzf;
                            } else {
                                long j5 = zzhhVar.zzf;
                                if (j5 != -1) {
                                    this.zzo = j5;
                                } else {
                                    HttpURLConnection httpURLConnection2 = this.zzj;
                                    String headerField3 = httpURLConnection2.getHeaderField(HttpHeaders.CONTENT_LENGTH);
                                    if (TextUtils.isEmpty(headerField3)) {
                                        jMax = -1;
                                        headerField2 = httpURLConnection2.getHeaderField(HttpHeaders.CONTENT_RANGE);
                                        if (!TextUtils.isEmpty(headerField2)) {
                                        }
                                        this.zzo = jMax != -1 ? jMax - this.zzn : -1L;
                                    } else {
                                        try {
                                            jMax = Long.parseLong(headerField3);
                                        } catch (NumberFormatException unused) {
                                            com.google.android.gms.ads.internal.util.client.zzm.zzg("Unexpected Content-Length [" + headerField3 + "]");
                                        }
                                        headerField2 = httpURLConnection2.getHeaderField(HttpHeaders.CONTENT_RANGE);
                                        if (!TextUtils.isEmpty(headerField2)) {
                                            Matcher matcher = zzb.matcher(headerField2);
                                            if (matcher.find()) {
                                                try {
                                                    long j6 = (Long.parseLong(matcher.group(2)) - Long.parseLong(matcher.group(1))) + 1;
                                                    if (jMax < 0) {
                                                        jMax = j6;
                                                    } else if (jMax != j6) {
                                                        com.google.android.gms.ads.internal.util.client.zzm.zzj("Inconsistent headers [" + headerField3 + "] [" + headerField2 + "]");
                                                        jMax = Math.max(jMax, j6);
                                                    }
                                                } catch (NumberFormatException unused2) {
                                                    com.google.android.gms.ads.internal.util.client.zzm.zzg("Unexpected Content-Range [" + headerField2 + "]");
                                                }
                                            }
                                        }
                                        this.zzo = jMax != -1 ? jMax - this.zzn : -1L;
                                    }
                                }
                            }
                            try {
                                this.zzk = this.zzj.getInputStream();
                                this.zzl = true;
                                zzj(zzhhVar);
                                return this.zzo;
                            } catch (IOException e) {
                                zzn();
                                throw new zzhv(e, zzhhVar, 2000, 1);
                            }
                        } catch (IOException e2) {
                            zzn();
                            throw new zzhv("Unable to connect to ".concat(String.valueOf(zzhhVar.zza.toString())), e2, zzhhVar, 2000, 1);
                        }
                    }
                    headerField = httpURLConnection.getHeaderField(HttpHeaders.LOCATION);
                    httpURLConnection.disconnect();
                    if (headerField != null) {
                        throw new ProtocolException("Null location redirect");
                    }
                    URL url2 = new URL(url, headerField);
                    String protocol = url2.getProtocol();
                    if (!"https".equals(protocol) && !"http".equals(protocol)) {
                        throw new ProtocolException("Unsupported protocol redirect: ".concat(String.valueOf(protocol)));
                    }
                    url = url2;
                    i = i2;
                    j2 = 0;
                } else {
                    j2 = j3;
                }
                String string = "bytes=" + j2 + "-";
                if (j4 != -1) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(string);
                    sb.append((j2 + j4) - 1);
                    string = sb.toString();
                }
                httpURLConnection.setRequestProperty(HttpHeaders.RANGE, string);
                httpURLConnection.setRequestProperty(HttpHeaders.USER_AGENT, this.zzg);
                if (!zZzb) {
                }
                httpURLConnection.setInstanceFollowRedirects(false);
                httpURLConnection.setDoOutput(false);
                httpURLConnection.connect();
                responseCode = httpURLConnection.getResponseCode();
                if (responseCode != 300) {
                    this.zzj = httpURLConnection;
                    responseCode2 = httpURLConnection.getResponseCode();
                    this.zzm = responseCode2;
                    if (responseCode2 >= 200) {
                    }
                    Map<String, List<String>> headerFields2 = this.zzj.getHeaderFields();
                    zzn();
                    zzhx zzhxVar2 = new zzhx(this.zzm, null, null, headerFields2, zzhhVar, zzgd.zzf);
                    if (this.zzm == 416) {
                    }
                }
                headerField = httpURLConnection.getHeaderField(HttpHeaders.LOCATION);
                httpURLConnection.disconnect();
                if (headerField != null) {
                }
            }
        } catch (IOException e3) {
            throw new zzhv("Unable to connect to ".concat(String.valueOf(zzhhVar.zza.toString())), e3, zzhhVar, 2000, 1);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    public final Uri zzc() {
        HttpURLConnection httpURLConnection = this.zzj;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    public final void zzd() throws zzhv {
        try {
            if (this.zzk != null) {
                int i = zzgd.zza;
                try {
                    this.zzk.close();
                } catch (IOException e) {
                    throw new zzhv(e, this.zzi, 2000, 3);
                }
            }
        } finally {
            this.zzk = null;
            zzn();
            if (this.zzl) {
                this.zzl = false;
                zzh();
            }
            this.zzs.clear();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgv, com.google.android.gms.internal.ads.zzhb
    public final Map zze() {
        HttpURLConnection httpURLConnection = this.zzj;
        if (httpURLConnection == null) {
            return null;
        }
        return httpURLConnection.getHeaderFields();
    }

    final void zzm(int i) throws SocketException {
        this.zzr = i;
        for (Socket socket : this.zzs) {
            if (!socket.isClosed()) {
                try {
                    socket.setReceiveBufferSize(this.zzr);
                } catch (SocketException e) {
                    com.google.android.gms.ads.internal.util.client.zzm.zzk("Failed to update receive buffer size.", e);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0077 A[Catch: IOException -> 0x008e, TryCatch #0 {IOException -> 0x008e, blocks: (B:2:0x0000, B:21:0x0056, B:23:0x005e, B:26:0x0069, B:27:0x006f, B:29:0x0077, B:32:0x007e, B:33:0x0083, B:34:0x0084, B:5:0x000b, B:7:0x0016, B:8:0x001a, B:10:0x0022, B:13:0x0038, B:14:0x0042, B:15:0x0047, B:16:0x0048, B:17:0x004d, B:18:0x004e), top: B:39:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0084 A[Catch: IOException -> 0x008e, TRY_LEAVE, TryCatch #0 {IOException -> 0x008e, blocks: (B:2:0x0000, B:21:0x0056, B:23:0x005e, B:26:0x0069, B:27:0x006f, B:29:0x0077, B:32:0x007e, B:33:0x0083, B:34:0x0084, B:5:0x000b, B:7:0x0016, B:8:0x001a, B:10:0x0022, B:13:0x0038, B:14:0x0042, B:15:0x0047, B:16:0x0048, B:17:0x004d, B:18:0x004e), top: B:39:0x0000 }] */
    @Override // com.google.android.gms.internal.ads.zzu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zza(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        try {
            if (this.zzp != this.zzn) {
                byte[] bArr2 = (byte[]) zzc.getAndSet(null);
                if (bArr2 == null) {
                    bArr2 = new byte[4096];
                }
                while (true) {
                    long j = this.zzp;
                    long j2 = this.zzn;
                    if (j == j2) {
                        zzc.set(bArr2);
                        break;
                    }
                    int i4 = this.zzk.read(bArr2, 0, (int) Math.min(j2 - j, bArr2.length));
                    if (Thread.interrupted()) {
                        throw new InterruptedIOException();
                    }
                    if (i4 == -1) {
                        throw new EOFException();
                    }
                    this.zzp += i4;
                    zzg(i4);
                }
            }
            if (i2 == 0) {
                return 0;
            }
            long j3 = this.zzo;
            if (j3 != -1) {
                long j4 = j3 - this.zzq;
                if (j4 != 0) {
                    i2 = (int) Math.min(i2, j4);
                    i3 = this.zzk.read(bArr, i, i2);
                    if (i3 == -1) {
                        this.zzq += i3;
                        zzg(i3);
                        return i3;
                    }
                    if (this.zzo != -1) {
                        throw new EOFException();
                    }
                }
            } else {
                i3 = this.zzk.read(bArr, i, i2);
                if (i3 == -1) {
                }
            }
            return -1;
        } catch (IOException e) {
            throw new zzhv(e, this.zzi, 2000, 2);
        }
    }
}
