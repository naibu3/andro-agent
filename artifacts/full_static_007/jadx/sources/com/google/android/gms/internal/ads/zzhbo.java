package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzhbi;
import com.google.android.gms.internal.ads.zzhbo;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.2.0 */
/* loaded from: classes2.dex */
public abstract class zzhbo<MessageType extends zzhbo<MessageType, BuilderType>, BuilderType extends zzhbi<MessageType, BuilderType>> extends zzgzi<MessageType, BuilderType> {
    private static final int zza = Integer.MIN_VALUE;
    private static final int zzb = Integer.MAX_VALUE;
    private static Map<Object, zzhbo<?, ?>> zzc = new ConcurrentHashMap();
    static final int zzr = Integer.MAX_VALUE;
    static final int zzs = 0;
    private int zzd = -1;
    protected zzher zzt = zzher.zzc();

    protected static zzhbq zzbA() {
        return zzgzp.zzd();
    }

    protected static zzhbq zzbB(zzhbq zzhbqVar) {
        int size = zzhbqVar.size();
        return zzhbqVar.zzf(size == 0 ? 10 : size + size);
    }

    protected static zzhbr zzbC() {
        return zzhav.zze();
    }

    protected static zzhbr zzbD(zzhbr zzhbrVar) {
        int size = zzhbrVar.size();
        return zzhbrVar.zzf(size == 0 ? 10 : size + size);
    }

    protected static zzhbv zzbE() {
        return zzhbf.zze();
    }

    protected static zzhbv zzbF(zzhbv zzhbvVar) {
        int size = zzhbvVar.size();
        return zzhbvVar.zzf(size == 0 ? 10 : size + size);
    }

    protected static zzhbw zzbG() {
        return zzhbp.zzg();
    }

    protected static zzhbw zzbH(zzhbw zzhbwVar) {
        int size = zzhbwVar.size();
        return zzhbwVar.zzf(size == 0 ? 10 : size + size);
    }

    protected static zzhbz zzbI() {
        return zzhct.zzh();
    }

    protected static zzhbz zzbJ(zzhbz zzhbzVar) {
        int size = zzhbzVar.size();
        return zzhbzVar.zzf(size == 0 ? 10 : size + size);
    }

    protected static <E> zzhca<E> zzbK() {
        return zzhdp.zzd();
    }

    protected static <E> zzhca<E> zzbL(zzhca<E> zzhcaVar) {
        int size = zzhcaVar.size();
        return zzhcaVar.zzf(size == 0 ? 10 : size + size);
    }

    static Object zzbQ(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    protected static Object zzbR(zzhde zzhdeVar, String str, Object[] objArr) {
        return new zzhdq(zzhdeVar, str, objArr);
    }

    static Method zzbS(Class cls, String str, Class... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException("Generated message class \"" + cls.getName() + "\" missing method \"" + str + "\".", e);
        }
    }

    public static <ContainingType extends zzhde, Type> zzhbm<ContainingType, Type> zzbe(ContainingType containingtype, zzhde zzhdeVar, zzhbt zzhbtVar, int i, zzhfg zzhfgVar, boolean z, Class cls) {
        return new zzhbm<>(containingtype, Collections.emptyList(), zzhdeVar, new zzhbl(zzhbtVar, i, zzhfgVar, true, z), cls);
    }

    public static <ContainingType extends zzhde, Type> zzhbm<ContainingType, Type> zzbf(ContainingType containingtype, Type type, zzhde zzhdeVar, zzhbt zzhbtVar, int i, zzhfg zzhfgVar, Class cls) {
        return new zzhbm<>(containingtype, type, zzhdeVar, new zzhbl(zzhbtVar, i, zzhfgVar, false, false), cls);
    }

    static <T extends zzhbo> T zzbh(Class<T> cls) throws ClassNotFoundException {
        zzhbo<?, ?> zzhboVarZzbt = zzc.get(cls);
        if (zzhboVarZzbt == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzhboVarZzbt = zzc.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (zzhboVarZzbt == null) {
            zzhboVarZzbt = ((zzhbo) zzhfa.zzg(cls)).zzbt();
            if (zzhboVarZzbt == null) {
                throw new IllegalStateException();
            }
            zzc.put(cls, zzhboVarZzbt);
        }
        return zzhboVarZzbt;
    }

    protected static <T extends zzhbo<T, ?>> T zzbk(T t, InputStream inputStream) throws zzhcd {
        T t2 = (T) zzg(t, inputStream, zzhay.zza);
        zzf(t2);
        return t2;
    }

    protected static <T extends zzhbo<T, ?>> T zzbl(T t, InputStream inputStream, zzhay zzhayVar) throws zzhcd {
        T t2 = (T) zzg(t, inputStream, zzhayVar);
        zzf(t2);
        return t2;
    }

    protected static <T extends zzhbo<T, ?>> T zzbm(T t, zzhac zzhacVar) throws zzhcd {
        T t2 = (T) zzbr(t, zzhacVar, zzhay.zza);
        zzf(t2);
        return t2;
    }

    protected static <T extends zzhbo<T, ?>> T zzbn(T t, zzham zzhamVar) throws zzhcd {
        return (T) zzbs(t, zzhamVar, zzhay.zza);
    }

    protected static <T extends zzhbo<T, ?>> T zzbo(T t, InputStream inputStream) throws zzhcd {
        T t2 = (T) zzbz(t, zzham.zzI(inputStream, 4096), zzhay.zza);
        zzf(t2);
        return t2;
    }

    protected static <T extends zzhbo<T, ?>> T zzbp(T t, ByteBuffer byteBuffer) throws zzhcd {
        return (T) zzbv(t, byteBuffer, zzhay.zza);
    }

    protected static <T extends zzhbo<T, ?>> T zzbq(T t, byte[] bArr) throws zzhcd {
        T t2 = (T) zzi(t, bArr, 0, bArr.length, zzhay.zza);
        zzf(t2);
        return t2;
    }

    protected static <T extends zzhbo<T, ?>> T zzbr(T t, zzhac zzhacVar, zzhay zzhayVar) throws zzhcd {
        T t2 = (T) zzh(t, zzhacVar, zzhayVar);
        zzf(t2);
        return t2;
    }

    protected static <T extends zzhbo<T, ?>> T zzbs(T t, zzham zzhamVar, zzhay zzhayVar) throws zzhcd {
        T t2 = (T) zzbz(t, zzhamVar, zzhayVar);
        zzf(t2);
        return t2;
    }

    protected static <T extends zzhbo<T, ?>> T zzbu(T t, InputStream inputStream, zzhay zzhayVar) throws zzhcd {
        T t2 = (T) zzbz(t, zzham.zzI(inputStream, 4096), zzhayVar);
        zzf(t2);
        return t2;
    }

    protected static <T extends zzhbo<T, ?>> T zzbv(T t, ByteBuffer byteBuffer, zzhay zzhayVar) throws zzhcd {
        zzham zzhamVarZzJ;
        int i = zzham.zzd;
        boolean z = false;
        if (byteBuffer.hasArray()) {
            zzhamVarZzJ = zzham.zzJ(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining(), false);
        } else if (byteBuffer.isDirect() && zzhfa.zzB()) {
            zzhamVarZzJ = new zzhak(byteBuffer, z, null);
        } else {
            int iRemaining = byteBuffer.remaining();
            byte[] bArr = new byte[iRemaining];
            byteBuffer.duplicate().get(bArr);
            zzhamVarZzJ = zzham.zzJ(bArr, 0, iRemaining, true);
        }
        T t2 = (T) zzbs(t, zzhamVarZzJ, zzhayVar);
        zzf(t2);
        return t2;
    }

    protected static <T extends zzhbo<T, ?>> T zzbx(T t, byte[] bArr, zzhay zzhayVar) throws zzhcd {
        T t2 = (T) zzi(t, bArr, 0, bArr.length, zzhayVar);
        zzf(t2);
        return t2;
    }

    protected static <T extends zzhbo<T, ?>> T zzby(T t, zzham zzhamVar) throws zzhcd {
        return (T) zzbz(t, zzhamVar, zzhay.zza);
    }

    static <T extends zzhbo<T, ?>> T zzbz(T t, zzham zzhamVar, zzhay zzhayVar) throws zzhcd {
        T t2 = (T) t.zzbj();
        try {
            zzhdz zzhdzVarZzb = zzhdo.zza().zzb(t2.getClass());
            zzhdzVarZzb.zzh(t2, zzhan.zzq(zzhamVar), zzhayVar);
            zzhdzVarZzb.zzf(t2);
            return t2;
        } catch (zzhcd e) {
            e = e;
            if (e.zzl()) {
                e = new zzhcd(e);
            }
            e.zzh(t2);
            throw e;
        } catch (zzhep e2) {
            zzhcd zzhcdVarZza = e2.zza();
            zzhcdVarZza.zzh(t2);
            throw zzhcdVarZza;
        } catch (IOException e3) {
            if (e3.getCause() instanceof zzhcd) {
                throw ((zzhcd) e3.getCause());
            }
            zzhcd zzhcdVar = new zzhcd(e3);
            zzhcdVar.zzh(t2);
            throw zzhcdVar;
        } catch (RuntimeException e4) {
            if (e4.getCause() instanceof zzhcd) {
                throw ((zzhcd) e4.getCause());
            }
            throw e4;
        }
    }

    private int zzc(zzhdz<?> zzhdzVar) {
        if (zzhdzVar != null) {
            return zzhdzVar.zza(this);
        }
        return zzhdo.zza().zzb(getClass()).zza(this);
    }

    protected static <T extends zzhbo> void zzca(Class<T> cls, T t) {
        t.zzbW();
        zzc.put(cls, t);
    }

    protected static final <T extends zzhbo<T, ?>> boolean zzcd(T t, boolean z) {
        byte bByteValue = ((Byte) t.zzbO(zzhbn.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zZzl = zzhdo.zza().zzb(t.getClass()).zzl(t);
        if (z) {
            t.zzbP(zzhbn.SET_MEMOIZED_IS_INITIALIZED, true != zZzl ? null : t);
        }
        return zZzl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <MessageType extends zzhbk<MessageType, BuilderType>, BuilderType, T> zzhbm<MessageType, T> zze(zzhaw<MessageType, T> zzhawVar) {
        return (zzhbm) zzhawVar;
    }

    private static <T extends zzhbo<T, ?>> T zzf(T t) throws zzhcd {
        if (t == null || t.zzbw()) {
            return t;
        }
        zzhcd zzhcdVarZza = t.zzaP().zza();
        zzhcdVarZza.zzh(t);
        throw zzhcdVarZza;
    }

    private static <T extends zzhbo<T, ?>> T zzg(T t, InputStream inputStream, zzhay zzhayVar) throws IOException {
        try {
            int i = inputStream.read();
            if (i == -1) {
                return null;
            }
            zzham zzhamVarZzI = zzham.zzI(new zzgzg(inputStream, zzham.zzG(i, inputStream)), 4096);
            T t2 = (T) zzbz(t, zzhamVarZzI, zzhayVar);
            try {
                zzhamVarZzI.zzz(0);
                return t2;
            } catch (zzhcd e) {
                e.zzh(t2);
                throw e;
            }
        } catch (zzhcd e2) {
            if (e2.zzl()) {
                throw new zzhcd(e2);
            }
            throw e2;
        } catch (IOException e3) {
            throw new zzhcd(e3);
        }
    }

    private static <T extends zzhbo<T, ?>> T zzh(T t, zzhac zzhacVar, zzhay zzhayVar) throws zzhcd {
        zzham zzhamVarZzl = zzhacVar.zzl();
        T t2 = (T) zzbz(t, zzhamVarZzl, zzhayVar);
        try {
            zzhamVarZzl.zzz(0);
            return t2;
        } catch (zzhcd e) {
            e.zzh(t2);
            throw e;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T extends zzhbo<T, ?>> T zzi(T t, byte[] bArr, int i, int i2, zzhay zzhayVar) throws zzhcd {
        T t2 = (T) t.zzbj();
        try {
            zzhdz zzhdzVarZzb = zzhdo.zza().zzb(t2.getClass());
            zzhdzVarZzb.zzi(t2, bArr, i, i + i2, new zzgzn(zzhayVar));
            zzhdzVarZzb.zzf(t2);
            return t2;
        } catch (zzhcd e) {
            e = e;
            if (e.zzl()) {
                e = new zzhcd(e);
            }
            e.zzh(t2);
            throw e;
        } catch (zzhep e2) {
            zzhcd zzhcdVarZza = e2.zza();
            zzhcdVarZza.zzh(t2);
            throw zzhcdVarZza;
        } catch (IOException e3) {
            if (e3.getCause() instanceof zzhcd) {
                throw ((zzhcd) e3.getCause());
            }
            zzhcd zzhcdVar = new zzhcd(e3);
            zzhcdVar.zzh(t2);
            throw zzhcdVar;
        } catch (IndexOutOfBoundsException unused) {
            zzhcd zzhcdVarZzj = zzhcd.zzj();
            zzhcdVarZzj.zzh(t2);
            throw zzhcdVarZzj;
        }
    }

    private void zzj() {
        if (this.zzt == zzher.zzc()) {
            this.zzt = zzher.zzf();
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return zzhdo.zza().zzb(getClass()).zzk(this, (zzhbo) obj);
    }

    public int hashCode() {
        if (zzce()) {
            return zzaW();
        }
        if (zzcc()) {
            zzcb(zzaW());
        }
        return zzaX();
    }

    public String toString() {
        return zzhdg.zza(this, super.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzgzi
    int zzaL() {
        return this.zzd & Integer.MAX_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.zzgzi
    int zzaM(zzhdz zzhdzVar) {
        if (!zzce()) {
            if (zzaL() != Integer.MAX_VALUE) {
                return zzaL();
            }
            int iZzc = zzc(zzhdzVar);
            zzaS(iZzc);
            return iZzc;
        }
        int iZzc2 = zzc(zzhdzVar);
        if (iZzc2 >= 0) {
            return iZzc2;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + iZzc2);
    }

    @Override // com.google.android.gms.internal.ads.zzgzi
    public zzhdj zzaO() {
        throw new UnsupportedOperationException("Lite does not support the mutable API.");
    }

    @Override // com.google.android.gms.internal.ads.zzgzi
    void zzaS(int i) {
        if (i >= 0) {
            this.zzd = i | (this.zzd & Integer.MIN_VALUE);
        } else {
            throw new IllegalStateException("serialized size must be non-negative, was " + i);
        }
    }

    int zzaW() {
        return zzhdo.zza().zzb(getClass()).zzb(this);
    }

    int zzaX() {
        return this.zzq;
    }

    @Override // com.google.android.gms.internal.ads.zzhde
    public int zzaY() {
        return zzaM(null);
    }

    protected final <MessageType extends zzhbo<MessageType, BuilderType>, BuilderType extends zzhbi<MessageType, BuilderType>> BuilderType zzaZ() {
        return (BuilderType) zzbO(zzhbn.NEW_BUILDER);
    }

    public final zzhdm<MessageType> zzbM() {
        return (zzhdm) zzbO(zzhbn.GET_PARSER);
    }

    Object zzbN() throws Exception {
        return zzbO(zzhbn.BUILD_MESSAGE_INFO);
    }

    protected Object zzbO(zzhbn zzhbnVar) {
        return zzde(zzhbnVar, null, null);
    }

    protected Object zzbP(zzhbn zzhbnVar, Object obj) {
        return zzde(zzhbnVar, obj, null);
    }

    void zzbT() {
        this.zzq = 0;
    }

    void zzbU() {
        zzaS(Integer.MAX_VALUE);
    }

    protected void zzbV() {
        zzhdo.zza().zzb(getClass()).zzf(this);
        zzbW();
    }

    void zzbW() {
        this.zzd &= Integer.MAX_VALUE;
    }

    protected void zzbX(int i, zzhac zzhacVar) {
        zzj();
        zzher zzherVar = this.zzt;
        zzherVar.zzg();
        if (i == 0) {
            throw new IllegalArgumentException("Zero is not a valid field number.");
        }
        zzherVar.zzj((i << 3) | 2, zzhacVar);
    }

    protected final void zzbY(zzher zzherVar) {
        this.zzt = zzher.zze(this.zzt, zzherVar);
    }

    protected void zzbZ(int i, int i2) {
        zzj();
        zzher zzherVar = this.zzt;
        zzherVar.zzg();
        if (i == 0) {
            throw new IllegalArgumentException("Zero is not a valid field number.");
        }
        zzherVar.zzj(i << 3, Long.valueOf(i2));
    }

    protected final <MessageType extends zzhbo<MessageType, BuilderType>, BuilderType extends zzhbi<MessageType, BuilderType>> BuilderType zzba(MessageType messagetype) {
        BuilderType buildertype = (BuilderType) zzaZ();
        buildertype.zzbj(messagetype);
        return buildertype;
    }

    @Override // com.google.android.gms.internal.ads.zzhde
    /* renamed from: zzbb, reason: merged with bridge method [inline-methods] */
    public final BuilderType zzcY() {
        return (BuilderType) zzbO(zzhbn.NEW_BUILDER);
    }

    @Override // com.google.android.gms.internal.ads.zzhde
    /* renamed from: zzbc, reason: merged with bridge method [inline-methods] */
    public final BuilderType zzcZ() {
        BuilderType buildertype = (BuilderType) zzbO(zzhbn.NEW_BUILDER);
        buildertype.zzbj(this);
        return buildertype;
    }

    @Override // com.google.android.gms.internal.ads.zzhdf
    /* renamed from: zzbi, reason: merged with bridge method [inline-methods] */
    public final MessageType zzbt() {
        return (MessageType) zzbO(zzhbn.GET_DEFAULT_INSTANCE);
    }

    MessageType zzbj() {
        return (MessageType) zzbO(zzhbn.NEW_MUTABLE_INSTANCE);
    }

    @Override // com.google.android.gms.internal.ads.zzhdf
    public final boolean zzbw() {
        return zzcd(this, Boolean.TRUE.booleanValue());
    }

    void zzcb(int i) {
        this.zzq = i;
    }

    boolean zzcc() {
        return zzaX() == 0;
    }

    boolean zzce() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    protected boolean zzcf(int i, zzham zzhamVar) throws IOException {
        if ((i & 7) == 4) {
            return false;
        }
        zzj();
        return this.zzt.zzm(i, zzhamVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhde
    public void zzda(zzhat zzhatVar) throws IOException {
        zzhdo.zza().zzb(getClass()).zzj(this, zzhau.zza(zzhatVar));
    }

    protected abstract Object zzde(zzhbn zzhbnVar, Object obj, Object obj2);
}
