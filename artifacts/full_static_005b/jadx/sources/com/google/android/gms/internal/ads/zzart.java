package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import androidx.browser.trusted.sharing.ShareTarget;
import com.google.common.net.HttpHeaders;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public class zzart implements zzaqx {
    protected final zzarv zza;

    @Deprecated
    protected final zzars zzb;
    private final zzars zzc;

    public zzart(zzars zzarsVar) {
        zzarv zzarvVar = new zzarv(4096);
        this.zzc = zzarsVar;
        this.zzb = zzarsVar;
        this.zza = zzarvVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:143:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x02a5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzaqx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzara zza(zzare zzareVar) throws Throwable {
        zzasc zzascVar;
        byte[] bArr;
        zzash zzashVar;
        zzash zzashVar2;
        int iZzb;
        Map mapEmptyMap;
        byte[] bArr2;
        byte[] bArrZzb;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        while (true) {
            Collections.emptyList();
            try {
                zzaqn zzaqnVarZzd = zzareVar.zzd();
                if (zzaqnVarZzd == null) {
                    mapEmptyMap = Collections.emptyMap();
                } else {
                    HashMap map = new HashMap();
                    String str = zzaqnVarZzd.zzb;
                    if (str != null) {
                        map.put(HttpHeaders.IF_NONE_MATCH, str);
                    }
                    long j = zzaqnVarZzd.zzd;
                    if (j > 0) {
                        map.put(HttpHeaders.IF_MODIFIED_SINCE, zzasb.zzc(j));
                    }
                    mapEmptyMap = map;
                }
                String strZzk = zzareVar.zzk();
                HashMap map2 = new HashMap();
                map2.putAll(mapEmptyMap);
                map2.putAll(zzareVar.zzl());
                URL url = new URL(strZzk);
                HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                httpURLConnection.setInstanceFollowRedirects(HttpURLConnection.getFollowRedirects());
                int iZzb2 = zzareVar.zzb();
                httpURLConnection.setConnectTimeout(iZzb2);
                httpURLConnection.setReadTimeout(iZzb2);
                boolean z = false;
                httpURLConnection.setUseCaches(false);
                httpURLConnection.setDoInput(true);
                "https".equals(url.getProtocol());
                try {
                    for (String str2 : map2.keySet()) {
                        httpURLConnection.setRequestProperty(str2, (String) map2.get(str2));
                    }
                    if (zzareVar.zza() != 0) {
                        httpURLConnection.setRequestMethod(ShareTarget.METHOD_POST);
                        byte[] bArrZzx = zzareVar.zzx();
                        if (bArrZzx != null) {
                            httpURLConnection.setDoOutput(true);
                            if (!httpURLConnection.getRequestProperties().containsKey("Content-Type")) {
                                httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8");
                            }
                            DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
                            dataOutputStream.write(bArrZzx);
                            dataOutputStream.close();
                        }
                    } else {
                        httpURLConnection.setRequestMethod(ShareTarget.METHOD_GET);
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    if (responseCode == -1) {
                        try {
                            throw new IOException("Could not retrieve response code from HttpUrlConnection.");
                        } catch (Throwable th) {
                            th = th;
                            if (!z) {
                            }
                            throw th;
                        }
                    }
                    zzareVar.zza();
                    if ((responseCode >= 100 && responseCode < 200) || responseCode == 204 || responseCode == 304) {
                        zzascVar = new zzasc(responseCode, zzasf.zza(httpURLConnection.getHeaderFields()), -1, null);
                        httpURLConnection.disconnect();
                    } else {
                        try {
                            zzascVar = new zzasc(responseCode, zzasf.zza(httpURLConnection.getHeaderFields()), httpURLConnection.getContentLength(), new zzasd(httpURLConnection));
                        } catch (Throwable th2) {
                            th = th2;
                            z = true;
                            if (!z) {
                                try {
                                    httpURLConnection.disconnect();
                                } catch (IOException e) {
                                    e = e;
                                    zzascVar = null;
                                    bArr = null;
                                    if (e instanceof SocketTimeoutException) {
                                    }
                                    zzashVar2 = zzashVar;
                                    zzaqs zzaqsVarZzy = zzareVar.zzy();
                                    iZzb = zzareVar.zzb();
                                    try {
                                        zzaqsVarZzy.zzc(zzashVar2.zzb);
                                        zzareVar.zzm(String.format("%s-retry [timeout=%s]", zzashVar2.zza, Integer.valueOf(iZzb)));
                                    } catch (zzarn e2) {
                                        zzareVar.zzm(String.format("%s-timeout-giveup [timeout=%s]", zzashVar2.zza, Integer.valueOf(iZzb)));
                                        throw e2;
                                    }
                                }
                            }
                            throw th;
                        }
                    }
                    try {
                        int iZzb3 = zzascVar.zzb();
                        List listZzd = zzascVar.zzd();
                        if (iZzb3 == 304) {
                            long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
                            zzaqn zzaqnVarZzd2 = zzareVar.zzd();
                            if (zzaqnVarZzd2 == null) {
                                return new zzara(304, (byte[]) null, true, jElapsedRealtime2, listZzd);
                            }
                            TreeSet treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
                            if (!listZzd.isEmpty()) {
                                Iterator it = listZzd.iterator();
                                while (it.hasNext()) {
                                    treeSet.add(((zzaqw) it.next()).zza());
                                }
                            }
                            ArrayList arrayList = new ArrayList(listZzd);
                            List list = zzaqnVarZzd2.zzh;
                            if (list != null) {
                                if (!list.isEmpty()) {
                                    for (zzaqw zzaqwVar : zzaqnVarZzd2.zzh) {
                                        if (!treeSet.contains(zzaqwVar.zza())) {
                                            arrayList.add(zzaqwVar);
                                        }
                                    }
                                }
                            } else if (!zzaqnVarZzd2.zzg.isEmpty()) {
                                for (Map.Entry entry : zzaqnVarZzd2.zzg.entrySet()) {
                                    if (!treeSet.contains(entry.getKey())) {
                                        arrayList.add(new zzaqw((String) entry.getKey(), (String) entry.getValue()));
                                    }
                                }
                            }
                            return new zzara(304, zzaqnVarZzd2.zza, true, jElapsedRealtime2, (List) arrayList);
                        }
                        InputStream inputStreamZzc = zzascVar.zzc();
                        if (inputStreamZzc != null) {
                            int iZza = zzascVar.zza();
                            try {
                                zzarv zzarvVar = this.zza;
                                zzasi zzasiVar = new zzasi(zzarvVar, iZza);
                                try {
                                    bArrZzb = zzarvVar.zzb(1024);
                                    while (true) {
                                        try {
                                            int i = inputStreamZzc.read(bArrZzb);
                                            if (i == -1) {
                                                break;
                                            }
                                            zzasiVar.write(bArrZzb, 0, i);
                                        } catch (Throwable th3) {
                                            th = th3;
                                            try {
                                                inputStreamZzc.close();
                                                break;
                                            } catch (IOException unused) {
                                                zzarq.zzd("Error occurred when closing InputStream", new Object[0]);
                                            }
                                            zzarvVar.zza(bArrZzb);
                                            zzasiVar.close();
                                            throw th;
                                        }
                                    }
                                    byte[] byteArray = zzasiVar.toByteArray();
                                    try {
                                        inputStreamZzc.close();
                                    } catch (IOException unused2) {
                                        zzarq.zzd("Error occurred when closing InputStream", new Object[0]);
                                    }
                                    zzarvVar.zza(bArrZzb);
                                    zzasiVar.close();
                                    bArr2 = byteArray;
                                } catch (Throwable th4) {
                                    th = th4;
                                    bArrZzb = null;
                                }
                            } catch (IOException e3) {
                                e = e3;
                                bArr = null;
                                if (e instanceof SocketTimeoutException) {
                                    zzashVar = new zzash("socket", new zzarm(), null);
                                } else {
                                    if (e instanceof MalformedURLException) {
                                        throw new RuntimeException("Bad URL ".concat(String.valueOf(zzareVar.zzk())), e);
                                    }
                                    if (zzascVar == null) {
                                        throw new zzarb(e);
                                    }
                                    int iZzb4 = zzascVar.zzb();
                                    zzarq.zzb("Unexpected response code %d for %s", Integer.valueOf(iZzb4), zzareVar.zzk());
                                    if (bArr != null) {
                                        zzara zzaraVar = new zzara(iZzb4, bArr, false, SystemClock.elapsedRealtime() - jElapsedRealtime, zzascVar.zzd());
                                        if (iZzb4 != 401 && iZzb4 != 403) {
                                            if (iZzb4 < 400 || iZzb4 > 499) {
                                                throw new zzarl(zzaraVar);
                                            }
                                            throw new zzaqr(zzaraVar);
                                        }
                                        zzashVar = new zzash("auth", new zzaqm(zzaraVar), null);
                                    } else {
                                        zzashVar = new zzash("network", new zzaqz(), null);
                                    }
                                }
                                zzashVar2 = zzashVar;
                                zzaqs zzaqsVarZzy2 = zzareVar.zzy();
                                iZzb = zzareVar.zzb();
                                zzaqsVarZzy2.zzc(zzashVar2.zzb);
                                zzareVar.zzm(String.format("%s-retry [timeout=%s]", zzashVar2.zza, Integer.valueOf(iZzb)));
                            }
                        } else {
                            bArr2 = new byte[0];
                        }
                        try {
                            long jElapsedRealtime3 = SystemClock.elapsedRealtime() - jElapsedRealtime;
                            if (zzarq.zzb || jElapsedRealtime3 > 3000) {
                                zzarq.zza("HTTP response for request=<%s> [lifetime=%d], [size=%s], [rc=%d], [retryCount=%s]", zzareVar, Long.valueOf(jElapsedRealtime3), bArr2 != null ? Integer.valueOf(bArr2.length) : "null", Integer.valueOf(iZzb3), Integer.valueOf(zzareVar.zzy().zza()));
                            }
                            if (iZzb3 < 200 || iZzb3 > 299) {
                                throw new IOException();
                            }
                            return new zzara(iZzb3, bArr2, false, SystemClock.elapsedRealtime() - jElapsedRealtime, listZzd);
                        } catch (IOException e4) {
                            e = e4;
                            bArr = bArr2;
                            if (e instanceof SocketTimeoutException) {
                            }
                            zzashVar2 = zzashVar;
                            zzaqs zzaqsVarZzy22 = zzareVar.zzy();
                            iZzb = zzareVar.zzb();
                            zzaqsVarZzy22.zzc(zzashVar2.zzb);
                            zzareVar.zzm(String.format("%s-retry [timeout=%s]", zzashVar2.zza, Integer.valueOf(iZzb)));
                        }
                    } catch (IOException e5) {
                        e = e5;
                    }
                } catch (Throwable th5) {
                    th = th5;
                }
            } catch (IOException e6) {
                e = e6;
            }
            zzareVar.zzm(String.format("%s-retry [timeout=%s]", zzashVar2.zza, Integer.valueOf(iZzb)));
        }
    }
}
