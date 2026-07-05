package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashSet;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzfsk {
    public static boolean zza(zzazw zzazwVar) {
        zzazw zzazwVar2 = zzazw.UNSUPPORTED;
        int iOrdinal = zzazwVar.ordinal();
        return iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3 || iOrdinal == 4 || iOrdinal == 5;
    }

    public static final zzazw zzb(Context context, zzfre zzfreVar) {
        zzazw zzazwVar;
        FileInputStream fileInputStream;
        byte[] bArr;
        File file = new File(new File(context.getApplicationInfo().dataDir), "lib");
        if (file.exists()) {
            File[] fileArrListFiles = file.listFiles(new zzgdn(Pattern.compile(".*\\.so$", 2)));
            if (fileArrListFiles == null || fileArrListFiles.length == 0) {
                zzfreVar.zzb(5017, "No .so");
                zzazwVar = zzazw.UNKNOWN;
            } else {
                try {
                    fileInputStream = new FileInputStream(fileArrListFiles[0]);
                    try {
                        bArr = new byte[20];
                    } finally {
                    }
                } catch (IOException e) {
                    zzd(null, e.toString(), context, zzfreVar);
                }
                if (fileInputStream.read(bArr) == 20) {
                    byte[] bArr2 = {0, 0};
                    if (bArr[5] == 2) {
                        zzd(bArr, null, context, zzfreVar);
                        zzazwVar = zzazw.UNSUPPORTED;
                    } else {
                        bArr2[0] = bArr[19];
                        bArr2[1] = bArr[18];
                        short s = ByteBuffer.wrap(bArr2).getShort();
                        if (s == 3) {
                            zzazwVar = zzazw.X86;
                        } else if (s == 40) {
                            zzazwVar = zzazw.ARM7;
                        } else if (s == 62) {
                            zzazwVar = zzazw.X86_64;
                        } else if (s == 183) {
                            zzazwVar = zzazw.ARM64;
                        } else if (s != 243) {
                            zzd(bArr, null, context, zzfreVar);
                            zzazwVar = zzazw.UNSUPPORTED;
                        } else {
                            zzazwVar = zzazw.RISCV64;
                        }
                    }
                    fileInputStream.close();
                } else {
                    fileInputStream.close();
                    zzazwVar = zzazw.UNSUPPORTED;
                }
            }
        } else {
            zzfreVar.zzb(5017, "No lib/");
            zzazwVar = zzazw.UNKNOWN;
        }
        if (zzazwVar == zzazw.UNKNOWN) {
            String strZzc = zzc(context, zzfreVar);
            if (TextUtils.isEmpty(strZzc)) {
                zzd(null, "Empty dev arch", context, zzfreVar);
                zzazwVar = zzazw.UNSUPPORTED;
            } else if (strZzc.equalsIgnoreCase("i686") || strZzc.equalsIgnoreCase("x86")) {
                zzazwVar = zzazw.X86;
            } else if (strZzc.equalsIgnoreCase("x86_64")) {
                zzazwVar = zzazw.X86_64;
            } else if (strZzc.equalsIgnoreCase("arm64-v8a")) {
                zzazwVar = zzazw.ARM64;
            } else if (strZzc.equalsIgnoreCase("armeabi-v7a") || strZzc.equalsIgnoreCase("armv71")) {
                zzazwVar = zzazw.ARM7;
            } else if (strZzc.equalsIgnoreCase("riscv64")) {
                zzazwVar = zzazw.RISCV64;
            } else {
                zzd(null, strZzc, context, zzfreVar);
                zzazwVar = zzazw.UNSUPPORTED;
            }
        }
        zzfreVar.zzb(5018, zzazwVar.name());
        return zzazwVar;
    }

    private static final String zzc(Context context, zzfre zzfreVar) {
        HashSet hashSet = new HashSet(Arrays.asList("i686", "armv71"));
        String strZza = zzfyu.OS_ARCH.zza();
        if (!TextUtils.isEmpty(strZza) && hashSet.contains(strZza)) {
            return strZza;
        }
        try {
            String[] strArr = (String[]) Build.class.getField("SUPPORTED_ABIS").get(null);
            if (strArr != null && strArr.length > 0) {
                return strArr[0];
            }
        } catch (IllegalAccessException e) {
            zzfreVar.zzc(2024, 0L, e);
        } catch (NoSuchFieldException e2) {
            zzfreVar.zzc(2024, 0L, e2);
        }
        return Build.CPU_ABI != null ? Build.CPU_ABI : Build.CPU_ABI2;
    }

    private static final void zzd(byte[] bArr, String str, Context context, zzfre zzfreVar) {
        StringBuilder sb = new StringBuilder("os.arch:");
        sb.append(zzfyu.OS_ARCH.zza());
        sb.append(";");
        try {
            String[] strArr = (String[]) Build.class.getField("SUPPORTED_ABIS").get(null);
            if (strArr != null) {
                sb.append("supported_abis:");
                sb.append(Arrays.toString(strArr));
                sb.append(";");
            }
        } catch (IllegalAccessException | NoSuchFieldException unused) {
        }
        sb.append("CPU_ABI:");
        sb.append(Build.CPU_ABI);
        sb.append(";CPU_ABI2:");
        sb.append(Build.CPU_ABI2);
        sb.append(";");
        if (bArr != null) {
            sb.append("ELF:");
            sb.append(Arrays.toString(bArr));
            sb.append(";");
        }
        if (str != null) {
            sb.append("dbg:");
            sb.append(str);
            sb.append(";");
        }
        zzfreVar.zzb(4007, sb.toString());
    }
}
