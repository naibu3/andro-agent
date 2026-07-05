package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgzh;
import com.google.android.gms.internal.ads.zzgzi;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.2.0 */
/* loaded from: classes2.dex */
public abstract class zzgzi<MessageType extends zzgzi<MessageType, BuilderType>, BuilderType extends zzgzh<MessageType, BuilderType>> implements zzhde {
    protected int zzq = 0;

    protected static <T> void zzaQ(Iterable<T> iterable, List<? super T> list) {
        zzgzh.zzbd(iterable, list);
    }

    protected static void zzaR(zzhac zzhacVar) throws IllegalArgumentException {
        if (!zzhacVar.zzp()) {
            throw new IllegalArgumentException("Byte string is not UTF-8.");
        }
    }

    private String zzdI(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    int zzaL() {
        throw new UnsupportedOperationException();
    }

    int zzaM(zzhdz zzhdzVar) {
        return zzaL();
    }

    @Override // com.google.android.gms.internal.ads.zzhde
    public zzhac zzaN() {
        try {
            int iZzaY = zzaY();
            zzhac zzhacVar = zzhac.zzb;
            byte[] bArr = new byte[iZzaY];
            zzhat zzhatVarZzF = zzhat.zzF(bArr, 0, iZzaY);
            zzda(zzhatVarZzF);
            zzhatVarZzF.zzG();
            return new zzgzy(bArr);
        } catch (IOException e) {
            throw new RuntimeException(zzdI("ByteString"), e);
        }
    }

    public zzhdj zzaO() {
        throw new UnsupportedOperationException("mutableCopy() is not implemented.");
    }

    zzhep zzaP() {
        return new zzhep(this);
    }

    void zzaS(int i) {
        throw new UnsupportedOperationException();
    }

    public void zzaT(OutputStream outputStream) throws IOException {
        int iZzaY = zzaY();
        zzhar zzharVar = new zzhar(outputStream, zzhat.zzB(zzhat.zzD(iZzaY) + iZzaY));
        zzharVar.zzu(iZzaY);
        zzda(zzharVar);
        zzharVar.zzL();
    }

    public void zzaU(OutputStream outputStream) throws IOException {
        zzhar zzharVar = new zzhar(outputStream, zzhat.zzB(zzaY()));
        zzda(zzharVar);
        zzharVar.zzL();
    }

    public byte[] zzaV() {
        try {
            int iZzaY = zzaY();
            byte[] bArr = new byte[iZzaY];
            zzhat zzhatVarZzF = zzhat.zzF(bArr, 0, iZzaY);
            zzda(zzhatVarZzF);
            zzhatVarZzF.zzG();
            return bArr;
        } catch (IOException e) {
            throw new RuntimeException(zzdI("byte array"), e);
        }
    }
}
