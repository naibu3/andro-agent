package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgzh;
import com.google.android.gms.internal.ads.zzgzi;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.2.0 */
/* loaded from: classes2.dex */
public abstract class zzgzh<MessageType extends zzgzi<MessageType, BuilderType>, BuilderType extends zzgzh<MessageType, BuilderType>> implements zzhdd {
    private String zza(String str) {
        return "Reading " + getClass().getName() + " from a " + str + " threw an IOException (should never happen).";
    }

    private static <T> void zzb(Iterable<T> iterable, List<? super T> list) {
        if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
            ((ArrayList) list).ensureCapacity(list.size() + ((Collection) iterable).size());
        }
        int size = list.size();
        for (T t : iterable) {
            if (t == null) {
                String str = "Element at index " + (list.size() - size) + " is null.";
                int size2 = list.size();
                while (true) {
                    size2--;
                    if (size2 < size) {
                        throw new NullPointerException(str);
                    }
                    list.remove(size2);
                }
            } else {
                list.add(t);
            }
        }
    }

    protected static zzhep zzbb(zzhde zzhdeVar) {
        return new zzhep(zzhdeVar);
    }

    @Deprecated
    protected static <T> void zzbc(Iterable<T> iterable, Collection<? super T> collection) {
        zzbd(iterable, (List) collection);
    }

    protected static <T> void zzbd(Iterable<T> iterable, List<? super T> list) {
        byte[] bArr = zzhcb.zzd;
        iterable.getClass();
        if (!(iterable instanceof zzhcm)) {
            if (iterable instanceof zzhdn) {
                list.addAll((Collection) iterable);
                return;
            } else {
                zzb(iterable, list);
                return;
            }
        }
        List listZzh = ((zzhcm) iterable).zzh();
        zzhcm zzhcmVar = (zzhcm) list;
        int size = list.size();
        for (Object obj : listZzh) {
            if (obj == null) {
                String str = "Element at index " + (zzhcmVar.size() - size) + " is null.";
                int size2 = zzhcmVar.size();
                while (true) {
                    size2--;
                    if (size2 < size) {
                        throw new NullPointerException(str);
                    }
                    zzhcmVar.remove(size2);
                }
            } else if (obj instanceof zzhac) {
                zzhcmVar.zzi((zzhac) obj);
            } else {
                zzhcmVar.add((String) obj);
            }
        }
    }

    @Override // 
    public abstract BuilderType zzaP();

    protected abstract BuilderType zzaD(MessageType messagetype);

    public BuilderType zzaE(zzhac zzhacVar) throws zzhcd {
        try {
            zzham zzhamVarZzl = zzhacVar.zzl();
            zzaR(zzhamVarZzl);
            zzhamVarZzl.zzz(0);
            return this;
        } catch (zzhcd e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException(zza("ByteString"), e2);
        }
    }

    /* renamed from: zzaF, reason: merged with bridge method [inline-methods] */
    public BuilderType zzaR(zzham zzhamVar) throws IOException {
        return (BuilderType) zzaW(zzhamVar, zzhay.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzhdd
    /* renamed from: zzaG, reason: merged with bridge method [inline-methods] */
    public BuilderType zzaS(zzhde zzhdeVar) {
        if (zzbt().getClass().isInstance(zzhdeVar)) {
            return (BuilderType) zzaD((zzgzi) zzhdeVar);
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }

    public BuilderType zzaH(InputStream inputStream) throws IOException {
        zzham zzhamVarZzI = zzham.zzI(inputStream, 4096);
        zzaR(zzhamVarZzI);
        zzhamVarZzI.zzz(0);
        return this;
    }

    /* renamed from: zzaI, reason: merged with bridge method [inline-methods] */
    public BuilderType zzaU(byte[] bArr) throws zzhcd {
        return (BuilderType) zzaZ(bArr, 0, bArr.length);
    }

    public BuilderType zzaJ(zzhac zzhacVar, zzhay zzhayVar) throws zzhcd {
        try {
            zzham zzhamVarZzl = zzhacVar.zzl();
            zzaW(zzhamVarZzl, zzhayVar);
            zzhamVarZzl.zzz(0);
            return this;
        } catch (zzhcd e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException(zza("ByteString"), e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhdd
    /* renamed from: zzaK, reason: merged with bridge method [inline-methods] */
    public abstract BuilderType zzaW(zzham zzhamVar, zzhay zzhayVar) throws IOException;

    public BuilderType zzaL(InputStream inputStream, zzhay zzhayVar) throws IOException {
        zzham zzhamVarZzI = zzham.zzI(inputStream, 4096);
        zzaW(zzhamVarZzI, zzhayVar);
        zzhamVarZzI.zzz(0);
        return this;
    }

    /* renamed from: zzaM, reason: merged with bridge method [inline-methods] */
    public BuilderType zzaY(byte[] bArr, zzhay zzhayVar) throws zzhcd {
        return (BuilderType) zzba(bArr, 0, bArr.length, zzhayVar);
    }

    @Override // 
    /* renamed from: zzaN, reason: merged with bridge method [inline-methods] */
    public BuilderType zzaZ(byte[] bArr, int i, int i2) throws zzhcd {
        try {
            zzham zzhamVarZzJ = zzham.zzJ(bArr, i, i2, false);
            zzaR(zzhamVarZzJ);
            zzhamVarZzJ.zzz(0);
            return this;
        } catch (zzhcd e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException(zza("byte array"), e2);
        }
    }

    @Override // 
    /* renamed from: zzaO, reason: merged with bridge method [inline-methods] */
    public BuilderType zzba(byte[] bArr, int i, int i2, zzhay zzhayVar) throws zzhcd {
        try {
            zzham zzhamVarZzJ = zzham.zzJ(bArr, i, i2, false);
            zzaW(zzhamVarZzJ, zzhayVar);
            zzhamVarZzJ.zzz(0);
            return this;
        } catch (zzhcd e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException(zza("byte array"), e2);
        }
    }

    public /* bridge */ /* synthetic */ zzhdd zzaQ(zzhac zzhacVar) throws zzhcd {
        zzaE(zzhacVar);
        return this;
    }

    public /* bridge */ /* synthetic */ zzhdd zzaT(InputStream inputStream) throws IOException {
        zzaH(inputStream);
        return this;
    }

    public /* bridge */ /* synthetic */ zzhdd zzaV(zzhac zzhacVar, zzhay zzhayVar) throws zzhcd {
        zzaJ(zzhacVar, zzhayVar);
        return this;
    }

    public /* bridge */ /* synthetic */ zzhdd zzaX(InputStream inputStream, zzhay zzhayVar) throws IOException {
        zzaL(inputStream, zzhayVar);
        return this;
    }

    public boolean zzbe(InputStream inputStream) throws IOException {
        return zzbf(inputStream, zzhay.zza);
    }

    public boolean zzbf(InputStream inputStream, zzhay zzhayVar) throws IOException {
        int i = inputStream.read();
        if (i == -1) {
            return false;
        }
        zzaL(new zzgzg(inputStream, zzham.zzG(i, inputStream)), zzhayVar);
        return true;
    }
}
