package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzzd extends zzza {
    private final boolean zze;
    private final zzys zzf;
    private final boolean zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final int zzj;
    private final int zzk;
    private final int zzl;
    private final int zzm;
    private final boolean zzn;
    private final int zzo;
    private final boolean zzp;
    private final boolean zzq;
    private final int zzr;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x012a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzzd(int i, zzde zzdeVar, int i2, zzys zzysVar, int i3, int i4, boolean z) {
        boolean z2;
        boolean z3;
        int i5;
        char c;
        boolean z4;
        super(i, zzdeVar, i2);
        this.zzf = zzysVar;
        int i6 = 1;
        int i7 = true != zzysVar.zzK ? 16 : 24;
        boolean z5 = zzysVar.zzJ;
        if (z) {
            zzan zzanVar = this.zzd;
            if (zzanVar.zzs != -1) {
                int i8 = zzysVar.zzd;
            }
            if (zzanVar.zzt != -1) {
                int i9 = zzysVar.zze;
            }
            float f = zzanVar.zzu;
            if (f != -1.0f) {
                int i10 = zzysVar.zzf;
                if (f > 2.1474836E9f) {
                    z2 = false;
                }
            }
            if (zzanVar.zzj != -1) {
                int i11 = zzysVar.zzg;
            }
            z2 = true;
        }
        this.zze = z2;
        if (z) {
            zzan zzanVar2 = this.zzd;
            int i12 = zzanVar2.zzs;
            if (i12 != -1) {
                int i13 = zzysVar.zzh;
                if (i12 >= 0) {
                    int i14 = zzanVar2.zzt;
                    if (i14 != -1) {
                        int i15 = zzysVar.zzi;
                        if (i14 >= 0) {
                            float f2 = zzanVar2.zzu;
                            if (f2 != -1.0f) {
                                int i16 = zzysVar.zzj;
                                if (f2 >= 0.0f) {
                                    int i17 = zzanVar2.zzj;
                                    if (i17 != -1) {
                                        int i18 = zzysVar.zzk;
                                        if (i17 >= 0) {
                                        }
                                    }
                                    z3 = true;
                                }
                            }
                        }
                    }
                }
            }
        } else {
            z3 = false;
        }
        this.zzg = z3;
        this.zzh = zzze.zzo(i3, false);
        zzan zzanVar3 = this.zzd;
        float f3 = zzanVar3.zzu;
        this.zzi = f3 != -1.0f && f3 >= 10.0f;
        this.zzj = zzanVar3.zzj;
        this.zzk = zzanVar3.zza();
        int i19 = this.zzd.zzg;
        int i20 = zzysVar.zzp;
        this.zzm = zzze.zzb(i19, 0);
        int i21 = this.zzd.zzg;
        this.zzn = i21 == 0 || (i21 & 1) != 0;
        int i22 = 0;
        while (true) {
            if (i22 >= zzysVar.zzo.size()) {
                i22 = Integer.MAX_VALUE;
                break;
            }
            String str = this.zzd.zzn;
            if (str != null && str.equals(zzysVar.zzo.get(i22))) {
                break;
            } else {
                i22++;
            }
        }
        this.zzl = i22;
        this.zzp = (i3 & 384) == 128;
        this.zzq = (i3 & 64) == 64;
        zzan zzanVar4 = this.zzd;
        String str2 = zzanVar4.zzn;
        if (str2 == null) {
            i5 = 0;
        } else {
            i5 = 4;
            switch (str2.hashCode()) {
                case -1851077871:
                    if (!str2.equals("video/dolby-vision")) {
                        c = 65535;
                        break;
                    } else {
                        c = 0;
                        break;
                    }
                case -1662735862:
                    if (str2.equals("video/av01")) {
                        c = 1;
                        break;
                    }
                    break;
                case -1662541442:
                    if (str2.equals("video/hevc")) {
                        c = 2;
                        break;
                    }
                    break;
                case 1331836730:
                    if (str2.equals("video/avc")) {
                        c = 4;
                        break;
                    }
                    break;
                case 1599127257:
                    if (str2.equals("video/x-vnd.on2.vp9")) {
                        c = 3;
                        break;
                    }
                    break;
            }
            if (c == 0) {
                i5 = 5;
            } else if (c != 1) {
                if (c == 2) {
                    i5 = 3;
                } else if (c == 3) {
                    i5 = 2;
                } else if (c == 4) {
                    i5 = 1;
                }
            }
        }
        this.zzr = i5;
        if ((zzanVar4.zzg & 16384) != 0) {
            i6 = 0;
        } else {
            zzys zzysVar2 = this.zzf;
            if (zzze.zzo(i3, zzysVar2.zzT) && ((z4 = this.zze) || zzysVar2.zzI)) {
                if (zzze.zzo(i3, false) && this.zzg && z4 && zzanVar4.zzj != -1) {
                    boolean z6 = zzysVar2.zzC;
                    boolean z7 = zzysVar2.zzB;
                    if ((i7 & i3) != 0) {
                        i6 = 2;
                    }
                }
            }
        }
        this.zzo = i6;
    }

    public static /* synthetic */ int zza(zzzd zzzdVar, zzzd zzzdVar2) {
        zzgcn zzgcnVarZza = (zzzdVar.zze && zzzdVar.zzh) ? zzze.zzb : zzze.zzb.zza();
        zzgar zzgarVarZzk = zzgar.zzk();
        boolean z = zzzdVar.zzf.zzB;
        return zzgarVarZzk.zzd(Integer.valueOf(zzzdVar.zzk), Integer.valueOf(zzzdVar2.zzk), zzgcnVarZza).zzd(Integer.valueOf(zzzdVar.zzj), Integer.valueOf(zzzdVar2.zzj), zzgcnVarZza).zza();
    }

    public static /* synthetic */ int zzd(zzzd zzzdVar, zzzd zzzdVar2) {
        zzgar zzgarVarZzd = zzgar.zzk().zze(zzzdVar.zzh, zzzdVar2.zzh).zzb(zzzdVar.zzm, zzzdVar2.zzm).zze(zzzdVar.zzn, zzzdVar2.zzn).zze(zzzdVar.zzi, zzzdVar2.zzi).zze(zzzdVar.zze, zzzdVar2.zze).zze(zzzdVar.zzg, zzzdVar2.zzg).zzd(Integer.valueOf(zzzdVar.zzl), Integer.valueOf(zzzdVar2.zzl), zzgcn.zzc().zza());
        boolean z = zzzdVar.zzp;
        zzgar zzgarVarZze = zzgarVarZzd.zze(z, zzzdVar2.zzp);
        boolean z2 = zzzdVar.zzq;
        zzgar zzgarVarZze2 = zzgarVarZze.zze(z2, zzzdVar2.zzq);
        if (z && z2) {
            zzgarVarZze2 = zzgarVarZze2.zzb(zzzdVar.zzr, zzzdVar2.zzr);
        }
        return zzgarVarZze2.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzza
    public final int zzb() {
        return this.zzo;
    }

    @Override // com.google.android.gms.internal.ads.zzza
    public final /* bridge */ /* synthetic */ boolean zzc(zzza zzzaVar) {
        zzzd zzzdVar = (zzzd) zzzaVar;
        if (!zzgd.zzG(this.zzd.zzn, zzzdVar.zzd.zzn)) {
            return false;
        }
        boolean z = this.zzf.zzL;
        return this.zzp == zzzdVar.zzp && this.zzq == zzzdVar.zzq;
    }
}
