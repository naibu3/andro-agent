package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzwd implements zzvm, zzvl {
    private final zzvm[] zza;
    private zzvl zze;
    private zzxr zzf;
    private final zzuz zzi;
    private final ArrayList zzc = new ArrayList();
    private final HashMap zzd = new HashMap();
    private zzxh zzh = new zzuy(zzgbc.zzm(), zzgbc.zzm());
    private final IdentityHashMap zzb = new IdentityHashMap();
    private zzvm[] zzg = new zzvm[0];

    public zzwd(zzuz zzuzVar, long[] jArr, zzvm... zzvmVarArr) {
        this.zzi = zzuzVar;
        this.zza = zzvmVarArr;
        for (int i = 0; i < zzvmVarArr.length; i++) {
            long j = jArr[i];
            if (j != 0) {
                this.zza[i] = new zzxn(zzvmVarArr[i], j);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvm
    public final long zza(long j, zzmr zzmrVar) {
        zzvm[] zzvmVarArr = this.zzg;
        return (zzvmVarArr.length > 0 ? zzvmVarArr[0] : this.zza[0]).zza(j, zzmrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzvm, com.google.android.gms.internal.ads.zzxh
    public final long zzb() {
        return this.zzh.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzvm, com.google.android.gms.internal.ads.zzxh
    public final long zzc() {
        return this.zzh.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzvm
    public final long zzd() {
        long j = -9223372036854775807L;
        for (zzvm zzvmVar : this.zzg) {
            long jZzd = zzvmVar.zzd();
            if (jZzd == -9223372036854775807L) {
                if (j != -9223372036854775807L && zzvmVar.zze(j) != j) {
                    throw new IllegalStateException("Unexpected child seekToUs result.");
                }
            } else if (j == -9223372036854775807L) {
                for (zzvm zzvmVar2 : this.zzg) {
                    if (zzvmVar2 == zzvmVar) {
                        break;
                    }
                    if (zzvmVar2.zze(jZzd) != jZzd) {
                        throw new IllegalStateException("Unexpected child seekToUs result.");
                    }
                }
                j = jZzd;
            } else if (jZzd != j) {
                throw new IllegalStateException("Conflicting discontinuities.");
            }
        }
        return j;
    }

    @Override // com.google.android.gms.internal.ads.zzvm
    public final long zze(long j) {
        long jZze = this.zzg[0].zze(j);
        int i = 1;
        while (true) {
            zzvm[] zzvmVarArr = this.zzg;
            if (i >= zzvmVarArr.length) {
                return jZze;
            }
            if (zzvmVarArr[i].zze(jZze) != jZze) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvm
    public final long zzf(zzzg[] zzzgVarArr, boolean[] zArr, zzxf[] zzxfVarArr, boolean[] zArr2, long j) {
        int length;
        int length2 = zzzgVarArr.length;
        int[] iArr = new int[length2];
        int[] iArr2 = new int[length2];
        int i = 0;
        int i2 = 0;
        while (true) {
            length = zzzgVarArr.length;
            if (i2 >= length) {
                break;
            }
            zzxf zzxfVar = zzxfVarArr[i2];
            Integer num = zzxfVar != null ? (Integer) this.zzb.get(zzxfVar) : null;
            iArr[i2] = num == null ? -1 : num.intValue();
            zzzg zzzgVar = zzzgVarArr[i2];
            if (zzzgVar != null) {
                String str = zzzgVar.zze().zzc;
                iArr2[i2] = Integer.parseInt(str.substring(0, str.indexOf(":")));
            } else {
                iArr2[i2] = -1;
            }
            i2++;
        }
        this.zzb.clear();
        zzxf[] zzxfVarArr2 = new zzxf[length];
        zzxf[] zzxfVarArr3 = new zzxf[length];
        zzzg[] zzzgVarArr2 = new zzzg[length];
        ArrayList arrayList = new ArrayList(this.zza.length);
        long j2 = j;
        int i3 = 0;
        while (i3 < this.zza.length) {
            for (int i4 = i; i4 < zzzgVarArr.length; i4++) {
                zzxfVarArr3[i4] = iArr[i4] == i3 ? zzxfVarArr[i4] : null;
                if (iArr2[i4] == i3) {
                    zzzg zzzgVar2 = zzzgVarArr[i4];
                    zzzgVar2.getClass();
                    zzde zzdeVar = (zzde) this.zzd.get(zzzgVar2.zze());
                    zzdeVar.getClass();
                    zzzgVarArr2[i4] = new zzwc(zzzgVar2, zzdeVar);
                } else {
                    zzzgVarArr2[i4] = null;
                }
            }
            ArrayList arrayList2 = arrayList;
            zzzg[] zzzgVarArr3 = zzzgVarArr2;
            zzxf[] zzxfVarArr4 = zzxfVarArr3;
            long jZzf = this.zza[i3].zzf(zzzgVarArr2, zArr, zzxfVarArr3, zArr2, j2);
            if (i3 == 0) {
                j2 = jZzf;
            } else if (jZzf != j2) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z = false;
            for (int i5 = 0; i5 < zzzgVarArr.length; i5++) {
                if (iArr2[i5] == i3) {
                    zzxf zzxfVar2 = zzxfVarArr4[i5];
                    zzxfVar2.getClass();
                    zzxfVarArr2[i5] = zzxfVar2;
                    this.zzb.put(zzxfVar2, Integer.valueOf(i3));
                    z = true;
                } else if (iArr[i5] == i3) {
                    zzeq.zzf(zzxfVarArr4[i5] == null);
                }
            }
            if (z) {
                arrayList2.add(this.zza[i3]);
            }
            i3++;
            arrayList = arrayList2;
            zzzgVarArr2 = zzzgVarArr3;
            zzxfVarArr3 = zzxfVarArr4;
            i = 0;
        }
        int i6 = i;
        ArrayList arrayList3 = arrayList;
        System.arraycopy(zzxfVarArr2, i6, zzxfVarArr, i6, length);
        this.zzg = (zzvm[]) arrayList3.toArray(new zzvm[i6]);
        this.zzh = new zzuy(arrayList3, zzgbs.zzb(arrayList3, new zzfxu() { // from class: com.google.android.gms.internal.ads.zzwb
            @Override // com.google.android.gms.internal.ads.zzfxu
            public final Object apply(Object obj) {
                return ((zzvm) obj).zzh().zzc();
            }
        }));
        return j2;
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final /* bridge */ /* synthetic */ void zzg(zzxh zzxhVar) {
        zzvl zzvlVar = this.zze;
        zzvlVar.getClass();
        zzvlVar.zzg(this);
    }

    @Override // com.google.android.gms.internal.ads.zzvm
    public final zzxr zzh() {
        zzxr zzxrVar = this.zzf;
        zzxrVar.getClass();
        return zzxrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    public final void zzi(zzvm zzvmVar) {
        this.zzc.remove(zzvmVar);
        if (!this.zzc.isEmpty()) {
            return;
        }
        int i = 0;
        for (zzvm zzvmVar2 : this.zza) {
            i += zzvmVar2.zzh().zzc;
        }
        zzde[] zzdeVarArr = new zzde[i];
        int i2 = 0;
        int i3 = 0;
        while (true) {
            zzvm[] zzvmVarArr = this.zza;
            if (i2 >= zzvmVarArr.length) {
                this.zzf = new zzxr(zzdeVarArr);
                zzvl zzvlVar = this.zze;
                zzvlVar.getClass();
                zzvlVar.zzi(this);
                return;
            }
            zzxr zzxrVarZzh = zzvmVarArr[i2].zzh();
            int i4 = zzxrVarZzh.zzc;
            int i5 = 0;
            while (i5 < i4) {
                zzde zzdeVarZzb = zzxrVarZzh.zzb(i5);
                zzan[] zzanVarArr = new zzan[zzdeVarZzb.zzb];
                for (int i6 = 0; i6 < zzdeVarZzb.zzb; i6++) {
                    zzan zzanVarZzb = zzdeVarZzb.zzb(i6);
                    zzal zzalVarZzb = zzanVarZzb.zzb();
                    String str = zzanVarZzb.zzb;
                    if (str == null) {
                        str = "";
                    }
                    zzalVarZzb.zzK(i2 + ":" + str);
                    zzanVarArr[i6] = zzalVarZzb.zzad();
                }
                zzde zzdeVar = new zzde(i2 + ":" + zzdeVarZzb.zzc, zzanVarArr);
                this.zzd.put(zzdeVar, zzdeVarZzb);
                zzdeVarArr[i3] = zzdeVar;
                i5++;
                i3++;
            }
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvm
    public final void zzj(long j, boolean z) {
        for (zzvm zzvmVar : this.zzg) {
            zzvmVar.zzj(j, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvm
    public final void zzk() throws IOException {
        int i = 0;
        while (true) {
            zzvm[] zzvmVarArr = this.zza;
            if (i >= zzvmVarArr.length) {
                return;
            }
            zzvmVarArr[i].zzk();
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvm
    public final void zzl(zzvl zzvlVar, long j) {
        this.zze = zzvlVar;
        Collections.addAll(this.zzc, this.zza);
        int i = 0;
        while (true) {
            zzvm[] zzvmVarArr = this.zza;
            if (i >= zzvmVarArr.length) {
                return;
            }
            zzvmVarArr[i].zzl(this, j);
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvm, com.google.android.gms.internal.ads.zzxh
    public final void zzm(long j) {
        this.zzh.zzm(j);
    }

    public final zzvm zzn(int i) {
        zzvm zzvmVar = this.zza[i];
        return zzvmVar instanceof zzxn ? ((zzxn) zzvmVar).zzn() : zzvmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzvm, com.google.android.gms.internal.ads.zzxh
    public final boolean zzo(zzlo zzloVar) {
        if (this.zzc.isEmpty()) {
            return this.zzh.zzo(zzloVar);
        }
        int size = this.zzc.size();
        for (int i = 0; i < size; i++) {
            ((zzvm) this.zzc.get(i)).zzo(zzloVar);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzvm, com.google.android.gms.internal.ads.zzxh
    public final boolean zzp() {
        return this.zzh.zzp();
    }
}
