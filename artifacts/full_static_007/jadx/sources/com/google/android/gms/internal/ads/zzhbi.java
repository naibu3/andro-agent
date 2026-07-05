package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzhbi;
import com.google.android.gms.internal.ads.zzhbo;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.2.0 */
/* loaded from: classes2.dex */
public class zzhbi<MessageType extends zzhbo<MessageType, BuilderType>, BuilderType extends zzhbi<MessageType, BuilderType>> extends zzgzh<MessageType, BuilderType> {
    protected MessageType zza;
    private final MessageType zzb;

    protected zzhbi(MessageType messagetype) {
        this.zzb = messagetype;
        if (messagetype.zzce()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.zza = (MessageType) zza();
    }

    private MessageType zza() {
        return (MessageType) this.zzb.zzbj();
    }

    private static <MessageType> void zzb(MessageType messagetype, MessageType messagetype2) {
        zzhdo.zza().zzb(messagetype.getClass()).zzg(messagetype, messagetype2);
    }

    @Override // com.google.android.gms.internal.ads.zzgzh
    protected /* bridge */ /* synthetic */ zzgzh zzaD(zzgzi zzgziVar) {
        zzbi((zzhbo) zzgziVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgzh
    /* renamed from: zzaK */
    public /* bridge */ /* synthetic */ zzgzh zzaW(zzham zzhamVar, zzhay zzhayVar) throws IOException {
        zzbk(zzhamVar, zzhayVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgzh
    /* renamed from: zzaN */
    public /* bridge */ /* synthetic */ zzgzh zzaZ(byte[] bArr, int i, int i2) throws zzhcd {
        zzbl(bArr, i, i2);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgzh
    /* renamed from: zzaO */
    public /* bridge */ /* synthetic */ zzgzh zzba(byte[] bArr, int i, int i2, zzhay zzhayVar) throws zzhcd {
        zzbm(bArr, i, i2, zzhayVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgzh, com.google.android.gms.internal.ads.zzhdd
    public /* bridge */ /* synthetic */ zzhdd zzaW(zzham zzhamVar, zzhay zzhayVar) throws IOException {
        zzbk(zzhamVar, zzhayVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgzh
    public /* bridge */ /* synthetic */ zzhdd zzaZ(byte[] bArr, int i, int i2) throws zzhcd {
        zzbl(bArr, i, i2);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgzh
    public /* bridge */ /* synthetic */ zzhdd zzba(byte[] bArr, int i, int i2, zzhay zzhayVar) throws zzhcd {
        zzbm(bArr, i, i2, zzhayVar);
        return this;
    }

    public final BuilderType zzbg() {
        if (this.zzb.zzce()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.zza = (MessageType) zza();
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgzh
    /* renamed from: zzbh, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public BuilderType zzaP() {
        BuilderType buildertype = (BuilderType) zzbt().zzcY();
        buildertype.zza = (MessageType) zzbs();
        return buildertype;
    }

    protected BuilderType zzbi(MessageType messagetype) {
        zzbj(messagetype);
        return this;
    }

    public BuilderType zzbj(MessageType messagetype) {
        if (zzbt().equals(messagetype)) {
            return this;
        }
        zzbu();
        zzb(this.zza, messagetype);
        return this;
    }

    public BuilderType zzbk(zzham zzhamVar, zzhay zzhayVar) throws IOException {
        zzbu();
        try {
            zzhdo.zza().zzb(this.zza.getClass()).zzh(this.zza, zzhan.zzq(zzhamVar), zzhayVar);
            return this;
        } catch (RuntimeException e) {
            if (e.getCause() instanceof IOException) {
                throw ((IOException) e.getCause());
            }
            throw e;
        }
    }

    public BuilderType zzbl(byte[] bArr, int i, int i2) throws zzhcd {
        zzbm(bArr, i, i2, zzhay.zza);
        return this;
    }

    public BuilderType zzbm(byte[] bArr, int i, int i2, zzhay zzhayVar) throws zzhcd {
        zzbu();
        try {
            zzhdo.zza().zzb(this.zza.getClass()).zzi(this.zza, bArr, i, i + i2, new zzgzn(zzhayVar));
            return this;
        } catch (zzhcd e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e2);
        } catch (IndexOutOfBoundsException unused) {
            throw zzhcd.zzj();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhdd
    /* renamed from: zzbn, reason: merged with bridge method [inline-methods] */
    public final MessageType zzbr() {
        MessageType messagetype = (MessageType) zzbs();
        if (messagetype.zzbw()) {
            return messagetype;
        }
        throw zzbb(messagetype);
    }

    @Override // com.google.android.gms.internal.ads.zzhdd
    /* renamed from: zzbo, reason: merged with bridge method [inline-methods] */
    public MessageType zzbs() {
        if (!this.zza.zzce()) {
            return this.zza;
        }
        this.zza.zzbV();
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzhdf
    /* renamed from: zzbp, reason: merged with bridge method [inline-methods] */
    public MessageType zzbt() {
        return this.zzb;
    }

    public /* bridge */ /* synthetic */ zzhdd zzbq() {
        zzbg();
        return this;
    }

    protected final void zzbu() {
        if (this.zza.zzce()) {
            return;
        }
        zzbv();
    }

    protected void zzbv() {
        MessageType messagetype = (MessageType) zza();
        zzb(messagetype, this.zza);
        this.zza = messagetype;
    }

    @Override // com.google.android.gms.internal.ads.zzhdf
    public final boolean zzbw() {
        return zzhbo.zzcd(this.zza, false);
    }
}
