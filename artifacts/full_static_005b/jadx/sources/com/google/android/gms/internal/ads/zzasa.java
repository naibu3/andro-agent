package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import android.text.TextUtils;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzasa implements zzaqo {
    private final zzarz zzc;
    private final Map zza = new LinkedHashMap(16, 0.75f, true);
    private long zzb = 0;
    private final int zzd = 5242880;

    public zzasa(zzarz zzarzVar, int i) {
        this.zzc = zzarzVar;
    }

    static int zze(InputStream inputStream) throws IOException {
        return (zzn(inputStream) << 24) | zzn(inputStream) | (zzn(inputStream) << 8) | (zzn(inputStream) << 16);
    }

    static long zzf(InputStream inputStream) throws IOException {
        return (zzn(inputStream) & 255) | ((zzn(inputStream) & 255) << 8) | ((zzn(inputStream) & 255) << 16) | ((zzn(inputStream) & 255) << 24) | ((zzn(inputStream) & 255) << 32) | ((zzn(inputStream) & 255) << 40) | ((zzn(inputStream) & 255) << 48) | ((zzn(inputStream) & 255) << 56);
    }

    static String zzh(zzary zzaryVar) throws IOException {
        return new String(zzm(zzaryVar, zzf(zzaryVar)), "UTF-8");
    }

    static void zzj(OutputStream outputStream, int i) throws IOException {
        outputStream.write(i & 255);
        outputStream.write((i >> 8) & 255);
        outputStream.write((i >> 16) & 255);
        outputStream.write((i >> 24) & 255);
    }

    static void zzk(OutputStream outputStream, long j) throws IOException {
        outputStream.write((byte) j);
        outputStream.write((byte) (j >>> 8));
        outputStream.write((byte) (j >>> 16));
        outputStream.write((byte) (j >>> 24));
        outputStream.write((byte) (j >>> 32));
        outputStream.write((byte) (j >>> 40));
        outputStream.write((byte) (j >>> 48));
        outputStream.write((byte) (j >>> 56));
    }

    static void zzl(OutputStream outputStream, String str) throws IOException {
        byte[] bytes = str.getBytes("UTF-8");
        int length = bytes.length;
        zzk(outputStream, length);
        outputStream.write(bytes, 0, length);
    }

    static byte[] zzm(zzary zzaryVar, long j) throws IOException {
        long jZza = zzaryVar.zza();
        if (j >= 0 && j <= jZza) {
            int i = (int) j;
            if (i == j) {
                byte[] bArr = new byte[i];
                new DataInputStream(zzaryVar).readFully(bArr);
                return bArr;
            }
        }
        throw new IOException("streamToBytes length=" + j + ", maxLength=" + jZza);
    }

    private static int zzn(InputStream inputStream) throws IOException {
        int i = inputStream.read();
        if (i != -1) {
            return i;
        }
        throw new EOFException();
    }

    private final void zzo(String str, zzarx zzarxVar) {
        if (this.zza.containsKey(str)) {
            this.zzb += zzarxVar.zza - ((zzarx) this.zza.get(str)).zza;
        } else {
            this.zzb += zzarxVar.zza;
        }
        this.zza.put(str, zzarxVar);
    }

    private final void zzp(String str) {
        zzarx zzarxVar = (zzarx) this.zza.remove(str);
        if (zzarxVar != null) {
            this.zzb -= zzarxVar.zza;
        }
    }

    private static final String zzq(String str) {
        int length = str.length() / 2;
        return String.valueOf(String.valueOf(str.substring(0, length).hashCode())).concat(String.valueOf(String.valueOf(str.substring(length).hashCode())));
    }

    @Override // com.google.android.gms.internal.ads.zzaqo
    public final synchronized zzaqn zza(String str) {
        zzarx zzarxVar = (zzarx) this.zza.get(str);
        if (zzarxVar == null) {
            return null;
        }
        File fileZzg = zzg(str);
        try {
            zzary zzaryVar = new zzary(new BufferedInputStream(new FileInputStream(fileZzg)), fileZzg.length());
            try {
                zzarx zzarxVarZza = zzarx.zza(zzaryVar);
                if (!TextUtils.equals(str, zzarxVarZza.zzb)) {
                    zzarq.zza("%s: key=%s, found=%s", fileZzg.getAbsolutePath(), str, zzarxVarZza.zzb);
                    zzp(str);
                    return null;
                }
                byte[] bArrZzm = zzm(zzaryVar, zzaryVar.zza());
                zzaqn zzaqnVar = new zzaqn();
                zzaqnVar.zza = bArrZzm;
                zzaqnVar.zzb = zzarxVar.zzc;
                zzaqnVar.zzc = zzarxVar.zzd;
                zzaqnVar.zzd = zzarxVar.zze;
                zzaqnVar.zze = zzarxVar.zzf;
                zzaqnVar.zzf = zzarxVar.zzg;
                List<zzaqw> list = zzarxVar.zzh;
                TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
                for (zzaqw zzaqwVar : list) {
                    treeMap.put(zzaqwVar.zza(), zzaqwVar.zzb());
                }
                zzaqnVar.zzg = treeMap;
                zzaqnVar.zzh = Collections.unmodifiableList(zzarxVar.zzh);
                return zzaqnVar;
            } finally {
                zzaryVar.close();
            }
        } catch (IOException e) {
            zzarq.zza("%s: %s", fileZzg.getAbsolutePath(), e.toString());
            zzi(str);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaqo
    public final synchronized void zzb() {
        File fileZza = this.zzc.zza();
        if (fileZza.exists()) {
            File[] fileArrListFiles = fileZza.listFiles();
            if (fileArrListFiles != null) {
                for (File file : fileArrListFiles) {
                    try {
                        long length = file.length();
                        zzary zzaryVar = new zzary(new BufferedInputStream(new FileInputStream(file)), length);
                        try {
                            zzarx zzarxVarZza = zzarx.zza(zzaryVar);
                            zzarxVarZza.zza = length;
                            zzo(zzarxVarZza.zzb, zzarxVarZza);
                            zzaryVar.close();
                        } catch (Throwable th) {
                            zzaryVar.close();
                            throw th;
                        }
                    } catch (IOException unused) {
                        file.delete();
                    }
                }
            }
        } else if (!fileZza.mkdirs()) {
            zzarq.zzb("Unable to create cache dir %s", fileZza.getAbsolutePath());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaqo
    public final synchronized void zzc(String str, boolean z) {
        zzaqn zzaqnVarZza = zza(str);
        if (zzaqnVarZza != null) {
            zzaqnVarZza.zzf = 0L;
            zzaqnVarZza.zze = 0L;
            zzd(str, zzaqnVarZza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaqo
    public final synchronized void zzd(String str, zzaqn zzaqnVar) {
        long j = this.zzb;
        int length = zzaqnVar.zza.length;
        long j2 = j + length;
        int i = this.zzd;
        if (j2 <= i || length <= i * 0.9f) {
            File fileZzg = zzg(str);
            try {
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(fileZzg));
                zzarx zzarxVar = new zzarx(str, zzaqnVar);
                try {
                    zzj(bufferedOutputStream, 538247942);
                    zzl(bufferedOutputStream, zzarxVar.zzb);
                    String str2 = zzarxVar.zzc;
                    if (str2 == null) {
                        str2 = "";
                    }
                    zzl(bufferedOutputStream, str2);
                    zzk(bufferedOutputStream, zzarxVar.zzd);
                    zzk(bufferedOutputStream, zzarxVar.zze);
                    zzk(bufferedOutputStream, zzarxVar.zzf);
                    zzk(bufferedOutputStream, zzarxVar.zzg);
                    List<zzaqw> list = zzarxVar.zzh;
                    if (list != null) {
                        zzj(bufferedOutputStream, list.size());
                        for (zzaqw zzaqwVar : list) {
                            zzl(bufferedOutputStream, zzaqwVar.zza());
                            zzl(bufferedOutputStream, zzaqwVar.zzb());
                        }
                    } else {
                        zzj(bufferedOutputStream, 0);
                    }
                    bufferedOutputStream.flush();
                    bufferedOutputStream.write(zzaqnVar.zza);
                    bufferedOutputStream.close();
                    zzarxVar.zza = fileZzg.length();
                    zzo(str, zzarxVar);
                    if (this.zzb >= this.zzd) {
                        if (zzarq.zzb) {
                            zzarq.zzd("Pruning old cache entries.", new Object[0]);
                        }
                        long j3 = this.zzb;
                        long jElapsedRealtime = SystemClock.elapsedRealtime();
                        Iterator it = this.zza.entrySet().iterator();
                        int i2 = 0;
                        while (it.hasNext()) {
                            zzarx zzarxVar2 = (zzarx) ((Map.Entry) it.next()).getValue();
                            if (zzg(zzarxVar2.zzb).delete()) {
                                this.zzb -= zzarxVar2.zza;
                            } else {
                                String str3 = zzarxVar2.zzb;
                                zzarq.zza("Could not delete cache entry for key=%s, filename=%s", str3, zzq(str3));
                            }
                            it.remove();
                            i2++;
                            if (this.zzb < this.zzd * 0.9f) {
                                break;
                            }
                        }
                        if (zzarq.zzb) {
                            zzarq.zzd("pruned %d files, %d bytes, %d ms", Integer.valueOf(i2), Long.valueOf(this.zzb - j3), Long.valueOf(SystemClock.elapsedRealtime() - jElapsedRealtime));
                        }
                    }
                } catch (IOException e) {
                    zzarq.zza("%s", e.toString());
                    bufferedOutputStream.close();
                    zzarq.zza("Failed to write header for %s", fileZzg.getAbsolutePath());
                    throw new IOException();
                }
            } catch (IOException unused) {
                if (!fileZzg.delete()) {
                    zzarq.zza("Could not clean up file %s", fileZzg.getAbsolutePath());
                }
                if (!this.zzc.zza().exists()) {
                    zzarq.zza("Re-initializing cache after external clearing.", new Object[0]);
                    this.zza.clear();
                    this.zzb = 0L;
                    zzb();
                }
            }
        }
    }

    public final File zzg(String str) {
        return new File(this.zzc.zza(), zzq(str));
    }

    public final synchronized void zzi(String str) {
        boolean zDelete = zzg(str).delete();
        zzp(str);
        if (zDelete) {
            return;
        }
        zzarq.zza("Could not delete cache entry for key=%s, filename=%s", str, zzq(str));
    }

    public zzasa(File file, int i) {
        this.zzc = new zzarw(this, file);
    }
}
