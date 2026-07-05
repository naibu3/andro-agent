package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApkChecksum;
import android.content.pm.PackageManager;
import android.os.Build;
import java.io.ByteArrayInputStream;
import java.lang.reflect.InvocationTargetException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzays extends zzazs {
    private static final zzazt zzi = new zzazt();
    private final Context zzj;

    public zzays(zzaye zzayeVar, String str, String str2, zzatp zzatpVar, int i, int i2, Context context, zzatg zzatgVar) {
        super(zzayeVar, "iz9pI8M74OdFMOjBXhk6CVKK/c29GtinDT3TfbuphLdYOSnoV+Rg8WuW9whaa7rD", "AMztxBQmasdCMrU1nlH2RhtlfSPsjcYFxTHFmKvCDYM=", zzatpVar, i, 27);
        this.zzj = context;
    }

    private final String zzc() throws ExecutionException, InterruptedException {
        try {
            if (this.zzb.zzl() != null) {
                this.zzb.zzl().get();
            }
            zzaus zzausVarZzc = this.zzb.zzc();
            if (zzausVarZzc == null || !zzausVarZzc.zzar()) {
                return null;
            }
            return zzausVarZzc.zzi();
        } catch (InterruptedException | ExecutionException unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzazs
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        zzatl zzatlVar;
        zzavp zzavpVar;
        AtomicReference atomicReferenceZza = zzi.zza(this.zzj.getPackageName());
        synchronized (atomicReferenceZza) {
            zzavp zzavpVar2 = (zzavp) atomicReferenceZza.get();
            if (zzavpVar2 == null || zzayh.zzd(zzavpVar2.zza) || zzavpVar2.zza.equals("E") || zzavpVar2.zza.equals("0000000000000000000000000000000000000000000000000000000000000000")) {
                if (zzayh.zzd(null)) {
                    (!zzayh.zzd(null) ? false : false).booleanValue();
                    zzatlVar = zzatl.ENUM_SIGNAL_SOURCE_ADSHIELD;
                } else {
                    zzatlVar = zzatl.ENUM_SIGNAL_SOURCE_CALLER_PROVIDED;
                }
                Boolean boolValueOf = Boolean.valueOf(zzatlVar == zzatl.ENUM_SIGNAL_SOURCE_ADSHIELD);
                Boolean bool = (Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzcu);
                String strZzb = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzct)).booleanValue() ? zzb() : null;
                if (bool.booleanValue() && this.zzb.zzp() && zzayh.zzd(strZzb)) {
                    strZzb = zzc();
                }
                zzavp zzavpVar3 = new zzavp((String) this.zzf.invoke(null, this.zzj, boolValueOf, strZzb));
                if (zzayh.zzd(zzavpVar3.zza) || zzavpVar3.zza.equals("E")) {
                    int iOrdinal = zzatlVar.ordinal();
                    if (iOrdinal == 3) {
                        String strZzc = zzc();
                        if (!zzayh.zzd(strZzc)) {
                            zzavpVar3.zza = strZzc;
                        }
                    } else if (iOrdinal == 4) {
                        throw null;
                    }
                }
                atomicReferenceZza.set(zzavpVar3);
            }
            zzavpVar = (zzavp) atomicReferenceZza.get();
        }
        synchronized (this.zze) {
            if (zzavpVar != null) {
                this.zze.zzz(zzavpVar.zza);
                this.zze.zzae(zzavpVar.zzb);
                this.zze.zzag(zzavpVar.zzc);
                this.zze.zzj(zzavpVar.zzd);
                this.zze.zzy(zzavpVar.zze);
            }
        }
    }

    protected final String zzb() throws PackageManager.NameNotFoundException, CertificateException {
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            byte[] bArrZzf = zzayh.zzf((String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzcv));
            ArrayList arrayList = new ArrayList();
            arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(bArrZzf)));
            if (!Build.TYPE.equals("user")) {
                arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(zzayh.zzf((String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzcw)))));
            }
            Context context = this.zzj;
            String packageName = context.getPackageName();
            this.zzb.zzk();
            if (Build.VERSION.SDK_INT <= 30 && !Build.VERSION.CODENAME.equals("S")) {
                return null;
            }
            final zzggm zzggmVarZze = zzggm.zze();
            context.getPackageManager().requestChecksums(packageName, false, 8, arrayList, new PackageManager.OnChecksumsReadyListener() { // from class: com.google.android.gms.internal.ads.zzazu
                @Override // android.content.pm.PackageManager.OnChecksumsReadyListener
                public final void onChecksumsReady(List list) {
                    zzggm zzggmVar = zzggmVarZze;
                    if (list == null) {
                        zzggmVar.zzc(null);
                        return;
                    }
                    try {
                        int size = list.size();
                        for (int i = 0; i < size; i++) {
                            ApkChecksum apkChecksum = (ApkChecksum) list.get(i);
                            if (apkChecksum.getType() == 8) {
                                zzggmVar.zzc(zzayh.zzb(apkChecksum.getValue()));
                                return;
                            }
                        }
                        zzggmVar.zzc(null);
                    } catch (Throwable unused) {
                        zzggmVar.zzc(null);
                    }
                }
            });
            return (String) zzggmVarZze.get();
        } catch (PackageManager.NameNotFoundException | InterruptedException | NoClassDefFoundError | CertificateEncodingException | CertificateException | ExecutionException unused) {
            return null;
        }
    }
}
