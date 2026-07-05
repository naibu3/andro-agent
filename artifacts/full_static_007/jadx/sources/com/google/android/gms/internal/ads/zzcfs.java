package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import com.google.common.net.HttpHeaders;
import com.google.firebase.messaging.Constants;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import java.text.DecimalFormat;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzcfs extends zzcfp {
    public static final /* synthetic */ int zzd = 0;
    private static final Set zze = Collections.synchronizedSet(new HashSet());
    private static final DecimalFormat zzf = new DecimalFormat("#,###");
    private File zzg;
    private boolean zzh;

    public zzcfs(zzcee zzceeVar) {
        super(zzceeVar);
        File cacheDir = this.zza.getCacheDir();
        if (cacheDir == null) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Context.getCacheDir() returned null");
            return;
        }
        File file = new File(zzftv.zza(zzftu.zza(), cacheDir, "admobVideoStreams"));
        this.zzg = file;
        if (!file.isDirectory() && !this.zzg.mkdirs()) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Could not create preload cache directory at ".concat(String.valueOf(this.zzg.getAbsolutePath())));
            this.zzg = null;
        } else {
            if (this.zzg.setReadable(true, false) && this.zzg.setExecutable(true, false)) {
                return;
            }
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Could not set cache file permissions at ".concat(String.valueOf(this.zzg.getAbsolutePath())));
            this.zzg = null;
        }
    }

    private final File zza(File file) {
        return new File(zzftv.zza(zzftu.zza(), this.zzg, String.valueOf(file.getName()).concat(".done")));
    }

    @Override // com.google.android.gms.internal.ads.zzcfp
    public final void zzf() {
        this.zzh = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:128:0x034e, code lost:
    
        r26 = r4;
        r24 = r14;
        r21 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0354, code lost:
    
        r26.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x035c, code lost:
    
        if (com.google.android.gms.ads.internal.util.zze.zzm(3) == false) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x035e, code lost:
    
        com.google.android.gms.ads.internal.util.client.zzm.zze("Preloaded " + com.google.android.gms.internal.ads.zzcfs.zzf.format(r13) + " bytes from " + r30);
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0381, code lost:
    
        r12.setReadable(true, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x038a, code lost:
    
        if (r0.isFile() == false) goto L182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x038c, code lost:
    
        r0.setLastModified(java.lang.System.currentTimeMillis());
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0394, code lost:
    
        r0.createNewFile();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:162:0x03cd  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x03dd  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x03f4  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0410  */
    @Override // com.google.android.gms.internal.ads.zzcfp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean zzt(final String str) throws IOException {
        int i;
        File file;
        String str2;
        String str3;
        String str4;
        FileOutputStream fileOutputStream;
        String str5;
        int i2;
        String str6;
        com.google.android.gms.ads.internal.util.zzcb zzcbVar;
        FileChannel fileChannel;
        ReadableByteChannel readableByteChannel;
        int i3;
        int i4;
        int responseCode;
        String str7;
        boolean zDelete;
        FileOutputStream fileOutputStream2 = null;
        if (this.zzg == null) {
            zzg(str, null, "noCacheDir", null);
            return false;
        }
        do {
            File file2 = this.zzg;
            if (file2 == null) {
                i = 0;
            } else {
                i = 0;
                for (File file3 : file2.listFiles()) {
                    if (!file3.getName().endsWith(".done")) {
                        i++;
                    }
                }
            }
            if (i <= ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzu)).intValue()) {
                file = new File(zzftv.zza(zzftu.zza(), this.zzg, com.google.android.gms.ads.internal.util.client.zzf.zzf(str)));
                File fileZza = zza(file);
                if (file.isFile() && fileZza.isFile()) {
                    int length = (int) file.length();
                    com.google.android.gms.ads.internal.util.client.zzm.zze("Stream cache hit at ".concat(String.valueOf(str)));
                    zzh(str, file.getAbsolutePath(), length);
                    return true;
                }
                String strValueOf = String.valueOf(this.zzg.getAbsolutePath());
                String strValueOf2 = String.valueOf(str);
                Set set = zze;
                String strConcat = strValueOf.concat(strValueOf2);
                synchronized (set) {
                    if (set.contains(strConcat)) {
                        com.google.android.gms.ads.internal.util.client.zzm.zzj("Stream cache already in progress at " + str);
                        zzg(str, file.getAbsolutePath(), "inProgress", null);
                        return false;
                    }
                    set.add(strConcat);
                    str2 = Constants.IPC_BUNDLE_KEY_SEND_ERROR;
                    try {
                        HttpURLConnection httpURLConnectionZzn = zzfuq.zza().zzn(new zzfup() { // from class: com.google.android.gms.internal.ads.zzcfr
                            @Override // com.google.android.gms.internal.ads.zzfup
                            public final URLConnection zza() throws IOException {
                                int i5 = zzcfs.zzd;
                                com.google.android.gms.ads.internal.zzu.zzw();
                                int iIntValue = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzz)).intValue();
                                URL url = new URL(str);
                                int i6 = 0;
                                while (true) {
                                    i6++;
                                    if (i6 > 20) {
                                        throw new IOException("Too many redirects (20)");
                                    }
                                    URLConnection uRLConnectionOpenConnection = url.openConnection();
                                    uRLConnectionOpenConnection.setConnectTimeout(iIntValue);
                                    uRLConnectionOpenConnection.setReadTimeout(iIntValue);
                                    if (!(uRLConnectionOpenConnection instanceof HttpURLConnection)) {
                                        throw new IOException("Invalid protocol.");
                                    }
                                    HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
                                    com.google.android.gms.ads.internal.util.client.zzl zzlVar = new com.google.android.gms.ads.internal.util.client.zzl(null);
                                    zzlVar.zzc(httpURLConnection, null);
                                    httpURLConnection.setInstanceFollowRedirects(false);
                                    int responseCode2 = httpURLConnection.getResponseCode();
                                    zzlVar.zze(httpURLConnection, responseCode2);
                                    if (responseCode2 / 100 != 3) {
                                        return httpURLConnection;
                                    }
                                    String headerField = httpURLConnection.getHeaderField(HttpHeaders.LOCATION);
                                    if (headerField == null) {
                                        throw new IOException("Missing Location header in redirect");
                                    }
                                    URL url2 = new URL(url, headerField);
                                    String protocol = url2.getProtocol();
                                    if (protocol == null) {
                                        throw new IOException("Protocol is null");
                                    }
                                    if (!protocol.equals("http") && !protocol.equals("https")) {
                                        throw new IOException("Unsupported scheme: ".concat(protocol));
                                    }
                                    com.google.android.gms.ads.internal.util.client.zzm.zze("Redirecting to ".concat(headerField));
                                    httpURLConnection.disconnect();
                                    url = url2;
                                }
                            }
                        }, 265, -1);
                        if ((httpURLConnectionZzn instanceof HttpURLConnection) && (responseCode = httpURLConnectionZzn.getResponseCode()) >= 400) {
                            str2 = "badUrl";
                            try {
                                str7 = "HTTP request failed. Code: " + Integer.toString(responseCode);
                            } catch (IOException | RuntimeException e) {
                                e = e;
                                str4 = null;
                            }
                            try {
                                throw new IOException("HTTP status code " + responseCode + " at " + str);
                            } catch (IOException | RuntimeException e2) {
                                e = e2;
                                str4 = str7;
                                str3 = strConcat;
                                if (e instanceof RuntimeException) {
                                }
                                fileOutputStream2.close();
                                if (this.zzh) {
                                }
                                if (file.exists()) {
                                }
                                zzg(str, file.getAbsolutePath(), str2, str4);
                                zze.remove(str3);
                                return false;
                            }
                        }
                        int contentLength = httpURLConnectionZzn.getContentLength();
                        if (contentLength < 0) {
                            com.google.android.gms.ads.internal.util.client.zzm.zzj("Stream cache aborted, missing content-length header at " + str);
                            zzg(str, file.getAbsolutePath(), "contentLengthMissing", null);
                            set.remove(strConcat);
                            return false;
                        }
                        String str8 = zzf.format(contentLength);
                        int iIntValue = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzv)).intValue();
                        if (contentLength > iIntValue) {
                            com.google.android.gms.ads.internal.util.client.zzm.zzj("Content length " + str8 + " exceeds limit at " + str);
                            StringBuilder sb = new StringBuilder();
                            sb.append("File too big for full file cache. Size: ");
                            sb.append(str8);
                            zzg(str, file.getAbsolutePath(), "sizeExceeded", sb.toString());
                            set.remove(strConcat);
                            return false;
                        }
                        com.google.android.gms.ads.internal.util.client.zzm.zze("Caching " + str8 + " bytes from " + str);
                        ReadableByteChannel readableByteChannelNewChannel = Channels.newChannel(httpURLConnectionZzn.getInputStream());
                        FileOutputStream fileOutputStream3 = new FileOutputStream(file);
                        try {
                            FileChannel channel = fileOutputStream3.getChannel();
                            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(1048576);
                            Clock clockZzB = com.google.android.gms.ads.internal.zzu.zzB();
                            long jCurrentTimeMillis = clockZzB.currentTimeMillis();
                            com.google.android.gms.ads.internal.util.zzcb zzcbVar2 = new com.google.android.gms.ads.internal.util.zzcb(((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzy)).longValue());
                            zzbeg zzbegVar = zzbep.zzx;
                            zzben zzbenVarZzc = com.google.android.gms.ads.internal.client.zzba.zzc();
                            long jLongValue = ((Long) zzbenVarZzc.zza(zzbegVar)).longValue();
                            i2 = 0;
                            while (true) {
                                int i5 = readableByteChannelNewChannel.read(byteBufferAllocate);
                                if (i5 < 0) {
                                    break;
                                }
                                i2 += i5;
                                try {
                                    try {
                                        if (i2 > iIntValue) {
                                            String str9 = "File too big for full file cache. Size: " + Integer.toString(i2);
                                            throw new IOException("stream cache file size limit exceeded");
                                        }
                                        try {
                                            byteBufferAllocate.flip();
                                            do {
                                            } while (channel.write(byteBufferAllocate) > 0);
                                            byteBufferAllocate.clear();
                                            if (clockZzB.currentTimeMillis() - jCurrentTimeMillis > 1000 * jLongValue) {
                                                String str10 = "Timeout exceeded. Limit: " + Long.toString(jLongValue) + " sec";
                                                throw new IOException("stream cache time limit exceeded");
                                            }
                                            ByteBuffer byteBuffer = byteBufferAllocate;
                                            if (this.zzh) {
                                                throw new IOException("abort requested");
                                            }
                                            if (zzcbVar2.zzb()) {
                                                str5 = str2;
                                                try {
                                                    zzcbVar = zzcbVar2;
                                                    str6 = strConcat;
                                                    fileChannel = channel;
                                                    fileOutputStream = fileOutputStream3;
                                                    readableByteChannel = readableByteChannelNewChannel;
                                                    i3 = iIntValue;
                                                    i4 = contentLength;
                                                    try {
                                                        try {
                                                            com.google.android.gms.ads.internal.util.client.zzf.zza.post(new zzcfj(this, str, file.getAbsolutePath(), i2, contentLength, false));
                                                        } catch (IOException e3) {
                                                            e = e3;
                                                            str3 = str6;
                                                            str2 = str5;
                                                            fileOutputStream2 = fileOutputStream;
                                                            str4 = null;
                                                            if (e instanceof RuntimeException) {
                                                            }
                                                            fileOutputStream2.close();
                                                            if (this.zzh) {
                                                            }
                                                            if (file.exists()) {
                                                                com.google.android.gms.ads.internal.util.client.zzm.zzj("Could not delete partial cache file at ".concat(String.valueOf(file.getAbsolutePath())));
                                                            }
                                                            zzg(str, file.getAbsolutePath(), str2, str4);
                                                            zze.remove(str3);
                                                            return false;
                                                        }
                                                    } catch (RuntimeException e4) {
                                                        e = e4;
                                                        str3 = str6;
                                                        str2 = str5;
                                                        fileOutputStream2 = fileOutputStream;
                                                        str4 = null;
                                                        if (e instanceof RuntimeException) {
                                                        }
                                                        fileOutputStream2.close();
                                                        if (this.zzh) {
                                                        }
                                                        if (file.exists()) {
                                                        }
                                                        zzg(str, file.getAbsolutePath(), str2, str4);
                                                        zze.remove(str3);
                                                        return false;
                                                    }
                                                } catch (IOException e5) {
                                                    e = e5;
                                                    fileOutputStream = fileOutputStream3;
                                                    str6 = strConcat;
                                                    str3 = str6;
                                                    str2 = str5;
                                                    fileOutputStream2 = fileOutputStream;
                                                    str4 = null;
                                                    if (e instanceof RuntimeException) {
                                                    }
                                                    fileOutputStream2.close();
                                                    if (this.zzh) {
                                                    }
                                                    if (file.exists()) {
                                                    }
                                                    zzg(str, file.getAbsolutePath(), str2, str4);
                                                    zze.remove(str3);
                                                    return false;
                                                } catch (RuntimeException e6) {
                                                    e = e6;
                                                    fileOutputStream = fileOutputStream3;
                                                    str6 = strConcat;
                                                    str3 = str6;
                                                    str2 = str5;
                                                    fileOutputStream2 = fileOutputStream;
                                                    str4 = null;
                                                    if (e instanceof RuntimeException) {
                                                    }
                                                    fileOutputStream2.close();
                                                    if (this.zzh) {
                                                    }
                                                    if (file.exists()) {
                                                    }
                                                    zzg(str, file.getAbsolutePath(), str2, str4);
                                                    zze.remove(str3);
                                                    return false;
                                                }
                                            } else {
                                                zzcbVar = zzcbVar2;
                                                fileChannel = channel;
                                                fileOutputStream = fileOutputStream3;
                                                readableByteChannel = readableByteChannelNewChannel;
                                                i3 = iIntValue;
                                                i4 = contentLength;
                                                str6 = strConcat;
                                                str5 = str2;
                                            }
                                            byteBufferAllocate = byteBuffer;
                                            readableByteChannelNewChannel = readableByteChannel;
                                            str2 = str5;
                                            zzcbVar2 = zzcbVar;
                                            strConcat = str6;
                                            channel = fileChannel;
                                            fileOutputStream3 = fileOutputStream;
                                            iIntValue = i3;
                                            contentLength = i4;
                                        } catch (IOException | RuntimeException e7) {
                                            e = e7;
                                            fileOutputStream = fileOutputStream3;
                                            str6 = strConcat;
                                            str5 = str2;
                                        }
                                    } catch (IOException | RuntimeException e8) {
                                        e = e8;
                                        str3 = str6;
                                        fileOutputStream2 = fileOutputStream;
                                        str4 = null;
                                        if (e instanceof RuntimeException) {
                                        }
                                        fileOutputStream2.close();
                                        if (this.zzh) {
                                        }
                                        if (file.exists()) {
                                        }
                                        zzg(str, file.getAbsolutePath(), str2, str4);
                                        zze.remove(str3);
                                        return false;
                                    }
                                } catch (IOException | RuntimeException e9) {
                                    e = e9;
                                    str4 = zzbenVarZzc;
                                    str3 = str6;
                                    fileOutputStream2 = fileOutputStream;
                                }
                            }
                        } catch (IOException | RuntimeException e10) {
                            e = e10;
                            fileOutputStream = fileOutputStream3;
                            str3 = strConcat;
                            str5 = str2;
                        }
                    } catch (IOException | RuntimeException e11) {
                        e = e11;
                        str3 = strConcat;
                        str2 = Constants.IPC_BUNDLE_KEY_SEND_ERROR;
                        str4 = null;
                        fileOutputStream2 = null;
                    }
                    if (e instanceof RuntimeException) {
                        com.google.android.gms.ads.internal.zzu.zzo().zzw(e, "VideoStreamFullFileCache.preload");
                    }
                    try {
                        fileOutputStream2.close();
                    } catch (IOException | NullPointerException unused) {
                    }
                    if (this.zzh) {
                        com.google.android.gms.ads.internal.util.client.zzm.zzi("Preload aborted for URL \"" + str + "\"");
                    } else {
                        com.google.android.gms.ads.internal.util.client.zzm.zzk("Preload failed for URL \"" + str + "\"", e);
                    }
                    if (file.exists() && !file.delete()) {
                        com.google.android.gms.ads.internal.util.client.zzm.zzj("Could not delete partial cache file at ".concat(String.valueOf(file.getAbsolutePath())));
                    }
                    zzg(str, file.getAbsolutePath(), str2, str4);
                    zze.remove(str3);
                    return false;
                }
            }
            File file4 = this.zzg;
            if (file4 == null) {
                break;
            }
            long j = Long.MAX_VALUE;
            File file5 = null;
            for (File file6 : file4.listFiles()) {
                if (!file6.getName().endsWith(".done")) {
                    long jLastModified = file6.lastModified();
                    if (jLastModified < j) {
                        file5 = file6;
                        j = jLastModified;
                    }
                }
            }
            if (file5 != null) {
                zDelete = file5.delete();
                File fileZza2 = zza(file5);
                if (fileZza2.isFile()) {
                    zDelete &= fileZza2.delete();
                }
            } else {
                zDelete = false;
            }
        } while (zDelete);
        com.google.android.gms.ads.internal.util.client.zzm.zzj("Unable to expire stream cache");
        zzg(str, null, "expireFailed", null);
        return false;
        zzh(str, file.getAbsolutePath(), i2);
        str3 = str6;
        try {
            zze.remove(str3);
            return true;
        } catch (IOException e12) {
            e = e12;
            str2 = str5;
            fileOutputStream2 = fileOutputStream;
            str4 = null;
            if (e instanceof RuntimeException) {
            }
            fileOutputStream2.close();
            if (this.zzh) {
            }
            if (file.exists()) {
            }
            zzg(str, file.getAbsolutePath(), str2, str4);
            zze.remove(str3);
            return false;
        } catch (RuntimeException e13) {
            e = e13;
            str2 = str5;
            fileOutputStream2 = fileOutputStream;
            str4 = null;
            if (e instanceof RuntimeException) {
            }
            fileOutputStream2.close();
            if (this.zzh) {
            }
            if (file.exists()) {
            }
            zzg(str, file.getAbsolutePath(), str2, str4);
            zze.remove(str3);
            return false;
        }
    }
}
