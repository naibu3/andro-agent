package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.2.0 */
/* loaded from: classes2.dex */
final class zzhcw implements zzhea {
    private static final zzhdc zza = new zzhcu();
    private final zzhdc zzb;

    public zzhcw() {
        zzhdc zzhdcVar;
        zzhdc[] zzhdcVarArr = new zzhdc[2];
        zzhdcVarArr[0] = zzhbh.zza();
        try {
            zzhdcVar = (zzhdc) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            zzhdcVar = zza;
        }
        zzhdcVarArr[1] = zzhdcVar;
        zzhcv zzhcvVar = new zzhcv(zzhdcVarArr);
        byte[] bArr = zzhcb.zzd;
        this.zzb = zzhcvVar;
    }

    private static boolean zzb(zzhdb zzhdbVar) {
        return zzhdbVar.zzc() + (-1) != 1;
    }

    @Override // com.google.android.gms.internal.ads.zzhea
    public final zzhdz zza(Class cls) {
        zzheb.zzs(cls);
        zzhdb zzhdbVarZzb = this.zzb.zzb(cls);
        return zzhdbVarZzb.zzb() ? zzhbo.class.isAssignableFrom(cls) ? zzhdi.zzc(zzheb.zzn(), zzhbb.zzb(), zzhdbVarZzb.zza()) : zzhdi.zzc(zzheb.zzm(), zzhbb.zza(), zzhdbVarZzb.zza()) : zzhbo.class.isAssignableFrom(cls) ? zzb(zzhdbVarZzb) ? zzhdh.zzm(cls, zzhdbVarZzb, zzhdl.zzb(), zzhcs.zze(), zzheb.zzn(), zzhbb.zzb(), zzhda.zzb()) : zzhdh.zzm(cls, zzhdbVarZzb, zzhdl.zzb(), zzhcs.zze(), zzheb.zzn(), null, zzhda.zzb()) : zzb(zzhdbVarZzb) ? zzhdh.zzm(cls, zzhdbVarZzb, zzhdl.zza(), zzhcs.zzd(), zzheb.zzm(), zzhbb.zza(), zzhda.zza()) : zzhdh.zzm(cls, zzhdbVarZzb, zzhdl.zza(), zzhcs.zzd(), zzheb.zzm(), null, zzhda.zza());
    }
}
