package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.net.ssl.SSLSocketFactory;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzasf extends zzars {
    public zzasf() {
        throw null;
    }

    public zzasf(zzase zzaseVar, SSLSocketFactory sSLSocketFactory) {
    }

    static List zza(Map map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getKey() != null) {
                Iterator it = ((List) entry.getValue()).iterator();
                while (it.hasNext()) {
                    arrayList.add(new zzaqw((String) entry.getKey(), (String) it.next()));
                }
            }
        }
        return arrayList;
    }
}
