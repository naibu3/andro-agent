package com.google.android.gms.internal.ads;

import com.google.common.primitives.SignedBytes;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzanz implements zzapn {
    private final List zza;

    public zzanz() {
        this(0);
    }

    public zzanz(int i, List list) {
        this.zza = list;
    }

    private final zzapd zzb(zzapm zzapmVar) {
        return new zzapd(zzd(zzapmVar));
    }

    private final zzapr zzc(zzapm zzapmVar) {
        return new zzapr(zzd(zzapmVar));
    }

    private final List zzd(zzapm zzapmVar) {
        String str;
        int i;
        List listSingletonList;
        zzfu zzfuVar = new zzfu(zzapmVar.zze);
        List arrayList = this.zza;
        while (zzfuVar.zzb() > 0) {
            int iZzm = zzfuVar.zzm();
            int iZzd = zzfuVar.zzd() + zzfuVar.zzm();
            if (iZzm == 134) {
                arrayList = new ArrayList();
                int iZzm2 = zzfuVar.zzm() & 31;
                for (int i2 = 0; i2 < iZzm2; i2++) {
                    String strZzA = zzfuVar.zzA(3, zzfxs.zzc);
                    int iZzm3 = zzfuVar.zzm();
                    boolean z = (iZzm3 & 128) != 0;
                    if (z) {
                        i = iZzm3 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i = 1;
                    }
                    byte bZzm = (byte) zzfuVar.zzm();
                    zzfuVar.zzL(1);
                    if (z) {
                        int i3 = bZzm & SignedBytes.MAX_POWER_OF_TWO;
                        int i4 = zzes.zza;
                        listSingletonList = Collections.singletonList(i3 != 0 ? new byte[]{1} : new byte[]{0});
                    } else {
                        listSingletonList = null;
                    }
                    zzal zzalVar = new zzal();
                    zzalVar.zzX(str);
                    zzalVar.zzO(strZzA);
                    zzalVar.zzw(i);
                    zzalVar.zzL(listSingletonList);
                    arrayList.add(zzalVar.zzad());
                }
            }
            zzfuVar.zzK(iZzd);
        }
        return arrayList;
    }

    public zzanz(int i) {
        this.zza = zzgbc.zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzapn
    public final zzapp zza(int i, zzapm zzapmVar) {
        if (i != 2) {
            if (i == 3 || i == 4) {
                return new zzaot(new zzaoq(zzapmVar.zzb, zzapmVar.zza()));
            }
            if (i == 21) {
                return new zzaot(new zzaoo());
            }
            if (i == 27) {
                return new zzaot(new zzaol(zzb(zzapmVar), false, false));
            }
            if (i == 36) {
                return new zzaot(new zzaon(zzb(zzapmVar)));
            }
            if (i == 89) {
                return new zzaot(new zzaob(zzapmVar.zzd));
            }
            if (i == 172) {
                return new zzaot(new zzanv(zzapmVar.zzb, zzapmVar.zza()));
            }
            if (i == 257) {
                return new zzapc(new zzaos("application/vnd.dvb.ait"));
            }
            if (i != 128) {
                if (i != 129) {
                    if (i != 138) {
                        if (i == 139) {
                            return new zzaot(new zzaoa(zzapmVar.zzb, zzapmVar.zza(), 5408));
                        }
                        switch (i) {
                            case 15:
                                return new zzaot(new zzany(false, zzapmVar.zzb, zzapmVar.zza()));
                            case 16:
                                return new zzaot(new zzaoh(zzc(zzapmVar)));
                            case 17:
                                return new zzaot(new zzaop(zzapmVar.zzb, zzapmVar.zza()));
                            default:
                                switch (i) {
                                    case 134:
                                        return new zzapc(new zzaos("application/x-scte35"));
                                    case 135:
                                        break;
                                    case 136:
                                        break;
                                    default:
                                        return null;
                                }
                        }
                    }
                    return new zzaot(new zzaoa(zzapmVar.zzb, zzapmVar.zza(), 4096));
                }
                return new zzaot(new zzans(zzapmVar.zzb, zzapmVar.zza()));
            }
        }
        return new zzaot(new zzaoe(zzc(zzapmVar)));
    }
}
