package com.google.android.gms.ads.nonagon.signalgeneration;

import android.os.Bundle;
import android.util.JsonReader;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzbxu;
import com.google.android.gms.internal.ads.zzdul;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes.dex */
public final class zzax {
    public final String zza;
    public String zzb;
    public zzbxu zzc;
    public Bundle zzd = new Bundle();
    private long zze;
    private long zzf;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzax(JsonReader jsonReader, zzbxu zzbxuVar) throws IOException {
        zzbxu zzbxuVar2;
        Bundle bundle;
        char c;
        this.zze = -1L;
        this.zzf = -1L;
        this.zzc = zzbxuVar;
        HashMap map = new HashMap();
        jsonReader.beginObject();
        String strNextString = "";
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName = strNextName == null ? "" : strNextName;
            switch (strNextName.hashCode()) {
                case -1573145462:
                    if (strNextName.equals("start_time")) {
                        c = 2;
                        break;
                    } else {
                        c = 65535;
                        break;
                    }
                case -995427962:
                    if (strNextName.equals("params")) {
                        c = 0;
                        break;
                    }
                    break;
                case -271442291:
                    if (strNextName.equals("signal_dictionary")) {
                        c = 1;
                        break;
                    }
                    break;
                case 1725551537:
                    if (strNextName.equals("end_time")) {
                        c = 3;
                        break;
                    }
                    break;
            }
            if (c == 0) {
                strNextString = jsonReader.nextString();
            } else if (c == 1) {
                map = new HashMap();
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    map.put(jsonReader.nextName(), jsonReader.nextString());
                }
                jsonReader.endObject();
            } else if (c == 2) {
                this.zze = jsonReader.nextLong();
            } else if (c != 3) {
                jsonReader.skipValue();
            } else {
                this.zzf = jsonReader.nextLong();
            }
        }
        this.zza = strNextString;
        jsonReader.endObject();
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getKey() != null && entry.getValue() != null) {
                this.zzd.putString((String) entry.getKey(), (String) entry.getValue());
            }
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzcd)).booleanValue() || (zzbxuVar2 = this.zzc) == null || (bundle = zzbxuVar2.zzm) == null) {
            return;
        }
        bundle.putLong(zzdul.GET_SIGNALS_SDKCORE_START.zza(), this.zze);
        this.zzc.zzm.putLong(zzdul.GET_SIGNALS_SDKCORE_END.zza(), this.zzf);
    }
}
