package com.google.android.gms.ads.internal.util.client;

import android.net.TrafficStats;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.common.util.ClientLibraryUtils;
import com.google.common.net.HttpHeaders;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.2.0 */
/* loaded from: classes.dex */
public final class zzr implements zze {
    private final String zza;

    public zzr() {
        throw null;
    }

    public zzr(String str) {
        this.zza = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00d4 A[PHI: r5
      0x00d4: PHI (r5v1 boolean) = (r5v0 boolean), (r5v0 boolean), (r5v3 boolean) binds: [B:38:0x00d2, B:34:0x00b2, B:19:0x0085] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.android.gms.ads.internal.util.client.zze
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean zza(String str) {
        boolean z = false;
        try {
            try {
                if (ClientLibraryUtils.isPackageSide()) {
                    TrafficStats.setThreadStatsTag(263);
                }
                zzm.zze("Pinging URL: " + str);
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
                try {
                    zzay.zzb();
                    String str2 = this.zza;
                    httpURLConnection.setConnectTimeout(60000);
                    httpURLConnection.setInstanceFollowRedirects(true);
                    httpURLConnection.setReadTimeout(60000);
                    if (str2 != null) {
                        httpURLConnection.setRequestProperty(HttpHeaders.USER_AGENT, str2);
                    }
                    httpURLConnection.setUseCaches(false);
                    zzl zzlVar = new zzl(null);
                    zzlVar.zzc(httpURLConnection, null);
                    int responseCode = httpURLConnection.getResponseCode();
                    zzlVar.zze(httpURLConnection, responseCode);
                    if (responseCode < 200 || responseCode >= 300) {
                        zzm.zzj("Received non-success response code " + responseCode + " from pinging URL: " + str);
                    } else {
                        z = true;
                    }
                } finally {
                    httpURLConnection.disconnect();
                }
            } catch (Throwable th) {
                if (ClientLibraryUtils.isPackageSide()) {
                    TrafficStats.clearThreadStatsTag();
                }
                throw th;
            }
        } catch (IOException e) {
            e = e;
            zzm.zzj("Error while pinging URL: " + str + ". " + e.getMessage());
            if (ClientLibraryUtils.isPackageSide()) {
            }
        } catch (IndexOutOfBoundsException e2) {
            zzm.zzj("Error while parsing ping URL: " + str + ". " + e2.getMessage());
            if (ClientLibraryUtils.isPackageSide()) {
            }
        } catch (RuntimeException e3) {
            e = e3;
            zzm.zzj("Error while pinging URL: " + str + ". " + e.getMessage());
            if (ClientLibraryUtils.isPackageSide()) {
            }
        }
        if (ClientLibraryUtils.isPackageSide()) {
            TrafficStats.clearThreadStatsTag();
        }
        return z;
    }
}
