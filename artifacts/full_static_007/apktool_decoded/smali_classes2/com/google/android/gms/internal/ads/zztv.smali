.class public abstract Lcom/google/android/gms/internal/ads/zztv;
.super Lcom/google/android/gms/internal/ads/zziw;
.source "com.google.android.gms:play-services-ads@@23.2.0"


# static fields
.field private static final zzb:[B


# instance fields
.field private zzA:Z

.field private zzB:Z

.field private zzC:Z

.field private zzD:Z

.field private zzE:Z

.field private zzF:J

.field private zzG:I

.field private zzH:I

.field private zzI:Ljava/nio/ByteBuffer;

.field private zzJ:Z

.field private zzK:Z

.field private zzL:Z

.field private zzM:Z

.field private zzN:Z

.field private zzO:Z

.field private zzP:I

.field private zzQ:I

.field private zzR:I

.field private zzS:Z

.field private zzT:Z

.field private zzU:Z

.field private zzV:J

.field private zzW:J

.field private zzX:Z

.field private zzY:Z

.field private zzZ:Z

.field protected zza:Lcom/google/android/gms/internal/ads/zzix;

.field private zzaa:Lcom/google/android/gms/internal/ads/zztu;

.field private zzab:J

.field private zzac:Z

.field private zzad:Lcom/google/android/gms/internal/ads/zzsu;

.field private zzae:Lcom/google/android/gms/internal/ads/zzsu;

.field private final zzc:Lcom/google/android/gms/internal/ads/zztl;

.field private final zzd:Lcom/google/android/gms/internal/ads/zztx;

.field private final zze:F

.field private final zzf:Lcom/google/android/gms/internal/ads/zzin;

.field private final zzg:Lcom/google/android/gms/internal/ads/zzin;

.field private final zzh:Lcom/google/android/gms/internal/ads/zzin;

.field private final zzi:Lcom/google/android/gms/internal/ads/zzti;

.field private final zzj:Landroid/media/MediaCodec$BufferInfo;

.field private final zzk:Ljava/util/ArrayDeque;

.field private final zzl:Lcom/google/android/gms/internal/ads/zzsg;

.field private zzm:Lcom/google/android/gms/internal/ads/zzan;

.field private zzn:Lcom/google/android/gms/internal/ads/zzan;

.field private zzo:Landroid/media/MediaCrypto;

.field private zzp:F

.field private zzq:Lcom/google/android/gms/internal/ads/zztm;

.field private zzr:Lcom/google/android/gms/internal/ads/zzan;

.field private zzs:Landroid/media/MediaFormat;

.field private zzt:Z

.field private zzu:F

.field private zzv:Ljava/util/ArrayDeque;

.field private zzw:Lcom/google/android/gms/internal/ads/zztt;

.field private zzx:Lcom/google/android/gms/internal/ads/zztp;

.field private zzy:I

.field private zzz:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x26

    new-array v0, v0, [B

    fill-array-data v0, :array_0

    sput-object v0, Lcom/google/android/gms/internal/ads/zztv;->zzb:[B

    return-void

    :array_0
    .array-data 1
        0x0t
        0x0t
        0x1t
        0x67t
        0x42t
        -0x40t
        0xbt
        -0x26t
        0x25t
        -0x70t
        0x0t
        0x0t
        0x1t
        0x68t
        -0x32t
        0xft
        0x13t
        0x20t
        0x0t
        0x0t
        0x1t
        0x65t
        -0x78t
        -0x7ct
        0xdt
        -0x32t
        0x71t
        0x18t
        -0x60t
        0x0t
        0x2ft
        -0x41t
        0x1ct
        0x31t
        -0x3dt
        0x27t
        0x5dt
        0x78t
    .end array-data
.end method

.method public constructor <init>(ILcom/google/android/gms/internal/ads/zztl;Lcom/google/android/gms/internal/ads/zztx;ZF)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zziw;-><init>(I)V

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zztv;->zzc:Lcom/google/android/gms/internal/ads/zztl;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zztv;->zzd:Lcom/google/android/gms/internal/ads/zztx;

    iput p5, p0, Lcom/google/android/gms/internal/ads/zztv;->zze:F

    .line 2
    new-instance p1, Lcom/google/android/gms/internal/ads/zzin;

    const/4 p2, 0x0

    .line 3
    invoke-direct {p1, p2, p2}, Lcom/google/android/gms/internal/ads/zzin;-><init>(II)V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zztv;->zzf:Lcom/google/android/gms/internal/ads/zzin;

    new-instance p1, Lcom/google/android/gms/internal/ads/zzin;

    .line 4
    invoke-direct {p1, p2, p2}, Lcom/google/android/gms/internal/ads/zzin;-><init>(II)V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zztv;->zzg:Lcom/google/android/gms/internal/ads/zzin;

    new-instance p1, Lcom/google/android/gms/internal/ads/zzin;

    const/4 p3, 0x2

    .line 5
    invoke-direct {p1, p3, p2}, Lcom/google/android/gms/internal/ads/zzin;-><init>(II)V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zztv;->zzh:Lcom/google/android/gms/internal/ads/zzin;

    new-instance p1, Lcom/google/android/gms/internal/ads/zzti;

    .line 6
    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/zzti;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zztv;->zzi:Lcom/google/android/gms/internal/ads/zzti;

    .line 7
    new-instance p3, Landroid/media/MediaCodec$BufferInfo;

    invoke-direct {p3}, Landroid/media/MediaCodec$BufferInfo;-><init>()V

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zztv;->zzj:Landroid/media/MediaCodec$BufferInfo;

    const/high16 p3, 0x3f800000    # 1.0f

    iput p3, p0, Lcom/google/android/gms/internal/ads/zztv;->zzp:F

    new-instance p3, Ljava/util/ArrayDeque;

    .line 8
    invoke-direct {p3}, Ljava/util/ArrayDeque;-><init>()V

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zztv;->zzk:Ljava/util/ArrayDeque;

    sget-object p3, Lcom/google/android/gms/internal/ads/zztu;->zza:Lcom/google/android/gms/internal/ads/zztu;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zztv;->zzaa:Lcom/google/android/gms/internal/ads/zztu;

    .line 9
    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/ads/zzin;->zzi(I)V

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/zzti;->zzc:Ljava/nio/ByteBuffer;

    .line 10
    invoke-static {}, Ljava/nio/ByteOrder;->nativeOrder()Ljava/nio/ByteOrder;

    move-result-object p3

    invoke-virtual {p1, p3}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 11
    new-instance p1, Lcom/google/android/gms/internal/ads/zzsg;

    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/zzsg;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zztv;->zzl:Lcom/google/android/gms/internal/ads/zzsg;

    const/high16 p1, -0x40800000    # -1.0f

    iput p1, p0, Lcom/google/android/gms/internal/ads/zztv;->zzu:F

    iput p2, p0, Lcom/google/android/gms/internal/ads/zztv;->zzy:I

    iput p2, p0, Lcom/google/android/gms/internal/ads/zztv;->zzP:I

    const/4 p1, -0x1

    iput p1, p0, Lcom/google/android/gms/internal/ads/zztv;->zzG:I

    iput p1, p0, Lcom/google/android/gms/internal/ads/zztv;->zzH:I

    const-wide p3, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide p3, p0, Lcom/google/android/gms/internal/ads/zztv;->zzF:J

    iput-wide p3, p0, Lcom/google/android/gms/internal/ads/zztv;->zzV:J

    iput-wide p3, p0, Lcom/google/android/gms/internal/ads/zztv;->zzW:J

    iput-wide p3, p0, Lcom/google/android/gms/internal/ads/zztv;->zzab:J

    iput p2, p0, Lcom/google/android/gms/internal/ads/zztv;->zzQ:I

    iput p2, p0, Lcom/google/android/gms/internal/ads/zztv;->zzR:I

    new-instance p1, Lcom/google/android/gms/internal/ads/zzix;

    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/zzix;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zztv;->zza:Lcom/google/android/gms/internal/ads/zzix;

    return-void
.end method

.method protected static zzaL(Lcom/google/android/gms/internal/ads/zzan;)Z
    .locals 0

    .line 1
    iget p0, p0, Lcom/google/android/gms/internal/ads/zzan;->zzH:I

    if-eqz p0, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_0
    const/4 p0, 0x1

    return p0
.end method

.method private final zzaM()V
    .locals 2

    const/4 v0, -0x1

    iput v0, p0, Lcom/google/android/gms/internal/ads/zztv;->zzG:I

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zztv;->zzg:Lcom/google/android/gms/internal/ads/zzin;

    const/4 v1, 0x0

    iput-object v1, v0, Lcom/google/android/gms/internal/ads/zzin;->zzc:Ljava/nio/ByteBuffer;

    return-void
.end method

.method private final zzaN()V
    .locals 1

    const/4 v0, -0x1

    iput v0, p0, Lcom/google/android/gms/internal/ads/zztv;->zzH:I

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zztv;->zzI:Ljava/nio/ByteBuffer;

    return-void
.end method

.method private final zzaO(Lcom/google/android/gms/internal/ads/zztu;)V
    .locals 4

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zztv;->zzaa:Lcom/google/android/gms/internal/ads/zztu;

    iget-wide v0, p1, Lcom/google/android/gms/internal/ads/zztu;->zzd:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long p1, v0, v2

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/zztv;->zzac:Z

    :cond_0
    return-void
.end method

.method private final zzaP()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/ads/zzjh;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zztv;->zzae:Lcom/google/android/gms/internal/ads/zzsu;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zztv;->zzad:Lcom/google/android/gms/internal/ads/zzsu;

    const/4 v0, 0x0

    iput v0, p0, Lcom/google/android/gms/internal/ads/zztv;->zzQ:I

    iput v0, p0, Lcom/google/android/gms/internal/ads/zztv;->zzR:I

    return-void
.end method

.method private final zzaQ()Z
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/ads/zzjh;
        }
    .end annotation

    .line 1
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zztv;->zzS:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_1

    iput v1, p0, Lcom/google/android/gms/internal/ads/zztv;->zzQ:I

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zztv;->zzA:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x3

    iput v0, p0, Lcom/google/android/gms/internal/ads/zztv;->zzR:I

    const/4 v0, 0x0

    return v0

    :cond_0
    const/4 v0, 0x2

    iput v0, p0, Lcom/google/android/gms/internal/ads/zztv;->zzR:I

    goto :goto_0

    :cond_1
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zztv;->zzaP()V

    :goto_0
    return v1
.end method

.method private final zzaR()Z
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/ads/zzjh;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zztv;->zzq:Lcom/google/android/gms/internal/ads/zztm;

    const/4 v7, 0x0

    if-eqz v0, :cond_1a

    iget v1, p0, Lcom/google/android/gms/internal/ads/zztv;->zzQ:I

    const/4 v8, 0x2

    if-eq v1, v8, :cond_1a

    iget-boolean v1, p0, Lcom/google/android/gms/internal/ads/zztv;->zzX:Z

    if-eqz v1, :cond_0

    goto/16 :goto_3

    :cond_0
    iget v1, p0, Lcom/google/android/gms/internal/ads/zztv;->zzG:I

    if-gez v1, :cond_2

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zztm;->zza()I

    move-result v1

    iput v1, p0, Lcom/google/android/gms/internal/ads/zztv;->zzG:I

    if-gez v1, :cond_1

    return v7

    :cond_1
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zztv;->zzg:Lcom/google/android/gms/internal/ads/zzin;

    .line 2
    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ads/zztm;->zzf(I)Ljava/nio/ByteBuffer;

    move-result-object v1

    iput-object v1, v2, Lcom/google/android/gms/internal/ads/zzin;->zzc:Ljava/nio/ByteBuffer;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zztv;->zzg:Lcom/google/android/gms/internal/ads/zzin;

    .line 3
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzih;->zzb()V

    :cond_2
    iget v1, p0, Lcom/google/android/gms/internal/ads/zztv;->zzQ:I

    const/4 v9, 0x1

    if-ne v1, v9, :cond_4

    iget-boolean v1, p0, Lcom/google/android/gms/internal/ads/zztv;->zzE:Z

    if-nez v1, :cond_3

    iput-boolean v9, p0, Lcom/google/android/gms/internal/ads/zztv;->zzT:Z

    iget v1, p0, Lcom/google/android/gms/internal/ads/zztv;->zzG:I

    const-wide/16 v4, 0x0

    const/4 v6, 0x4

    const/4 v2, 0x0

    const/4 v3, 0x0

    .line 4
    invoke-interface/range {v0 .. v6}, Lcom/google/android/gms/internal/ads/zztm;->zzj(IIIJI)V

    .line 5
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zztv;->zzaM()V

    :cond_3
    iput v8, p0, Lcom/google/android/gms/internal/ads/zztv;->zzQ:I

    return v7

    :cond_4
    iget-boolean v1, p0, Lcom/google/android/gms/internal/ads/zztv;->zzC:Z

    if-eqz v1, :cond_5

    iput-boolean v7, p0, Lcom/google/android/gms/internal/ads/zztv;->zzC:Z

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zztv;->zzg:Lcom/google/android/gms/internal/ads/zzin;

    iget-object v1, v1, Lcom/google/android/gms/internal/ads/zzin;->zzc:Ljava/nio/ByteBuffer;

    .line 9
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v2, Lcom/google/android/gms/internal/ads/zztv;->zzb:[B

    .line 6
    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    iget v1, p0, Lcom/google/android/gms/internal/ads/zztv;->zzG:I

    const-wide/16 v4, 0x0

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/16 v3, 0x26

    .line 7
    invoke-interface/range {v0 .. v6}, Lcom/google/android/gms/internal/ads/zztm;->zzj(IIIJI)V

    .line 8
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zztv;->zzaM()V

    iput-boolean v9, p0, Lcom/google/android/gms/internal/ads/zztv;->zzS:Z

    return v9

    :cond_5
    iget v1, p0, Lcom/google/android/gms/internal/ads/zztv;->zzP:I

    if-ne v1, v9, :cond_7

    move v1, v7

    :goto_0
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zztv;->zzr:Lcom/google/android/gms/internal/ads/zzan;

    .line 52
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    iget-object v2, v2, Lcom/google/android/gms/internal/ads/zzan;->zzp:Ljava/util/List;

    .line 10
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_6

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zztv;->zzr:Lcom/google/android/gms/internal/ads/zzan;

    .line 11
    iget-object v2, v2, Lcom/google/android/gms/internal/ads/zzan;->zzp:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [B

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zztv;->zzg:Lcom/google/android/gms/internal/ads/zzin;

    iget-object v3, v3, Lcom/google/android/gms/internal/ads/zzin;->zzc:Ljava/nio/ByteBuffer;

    .line 13
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    invoke-virtual {v3, v2}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_6
    iput v8, p0, Lcom/google/android/gms/internal/ads/zztv;->zzP:I

    :cond_7
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zztv;->zzg:Lcom/google/android/gms/internal/ads/zzin;

    iget-object v1, v1, Lcom/google/android/gms/internal/ads/zzin;->zzc:Ljava/nio/ByteBuffer;

    .line 51
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->position()I

    move-result v1

    .line 15
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zziw;->zzcX()Lcom/google/android/gms/internal/ads/zzlj;

    move-result-object v2

    :try_start_0
    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zztv;->zzg:Lcom/google/android/gms/internal/ads/zzin;

    .line 16
    invoke-virtual {p0, v2, v3, v7}, Lcom/google/android/gms/internal/ads/zziw;->zzcV(Lcom/google/android/gms/internal/ads/zzlj;Lcom/google/android/gms/internal/ads/zzin;I)I

    move-result v3
    :try_end_0
    .catch Lcom/google/android/gms/internal/ads/zzim; {:try_start_0 .. :try_end_0} :catch_2

    const/4 v4, -0x3

    if-ne v3, v4, :cond_9

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zziw;->zzQ()Z

    move-result v0

    if-eqz v0, :cond_8

    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/zztv;->zzV:J

    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/zztv;->zzW:J

    :cond_8
    return v7

    :cond_9
    const/4 v4, -0x5

    if-ne v3, v4, :cond_b

    iget v0, p0, Lcom/google/android/gms/internal/ads/zztv;->zzP:I

    if-ne v0, v8, :cond_a

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zztv;->zzg:Lcom/google/android/gms/internal/ads/zzin;

    .line 20
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzih;->zzb()V

    iput v9, p0, Lcom/google/android/gms/internal/ads/zztv;->zzP:I

    .line 21
    :cond_a
    invoke-virtual {p0, v2}, Lcom/google/android/gms/internal/ads/zztv;->zzac(Lcom/google/android/gms/internal/ads/zzlj;)Lcom/google/android/gms/internal/ads/zziy;

    return v9

    :cond_b
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zztv;->zzg:Lcom/google/android/gms/internal/ads/zzin;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzih;->zzf()Z

    move-result v3

    if-eqz v3, :cond_f

    iget-wide v3, p0, Lcom/google/android/gms/internal/ads/zztv;->zzV:J

    iput-wide v3, p0, Lcom/google/android/gms/internal/ads/zztv;->zzW:J

    iget v1, p0, Lcom/google/android/gms/internal/ads/zztv;->zzP:I

    if-ne v1, v8, :cond_c

    .line 22
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzih;->zzb()V

    iput v9, p0, Lcom/google/android/gms/internal/ads/zztv;->zzP:I

    :cond_c
    iput-boolean v9, p0, Lcom/google/android/gms/internal/ads/zztv;->zzX:Z

    iget-boolean v1, p0, Lcom/google/android/gms/internal/ads/zztv;->zzS:Z

    if-nez v1, :cond_d

    .line 23
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zztv;->zzao()V

    return v7

    :cond_d
    :try_start_1
    iget-boolean v1, p0, Lcom/google/android/gms/internal/ads/zztv;->zzE:Z

    if-nez v1, :cond_e

    iput-boolean v9, p0, Lcom/google/android/gms/internal/ads/zztv;->zzT:Z

    iget v1, p0, Lcom/google/android/gms/internal/ads/zztv;->zzG:I

    const-wide/16 v4, 0x0

    const/4 v6, 0x4

    const/4 v2, 0x0

    const/4 v3, 0x0

    .line 24
    invoke-interface/range {v0 .. v6}, Lcom/google/android/gms/internal/ads/zztm;->zzj(IIIJI)V

    .line 25
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zztv;->zzaM()V
    :try_end_1
    .catch Landroid/media/MediaCodec$CryptoException; {:try_start_1 .. :try_end_1} :catch_0

    :cond_e
    return v7

    :catch_0
    move-exception v0

    .line 49
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zztv;->zzm:Lcom/google/android/gms/internal/ads/zzan;

    .line 26
    invoke-virtual {v0}, Landroid/media/MediaCodec$CryptoException;->getErrorCode()I

    move-result v2

    invoke-static {v2}, Lcom/google/android/gms/internal/ads/zzgd;->zzj(I)I

    move-result v2

    .line 27
    invoke-virtual {p0, v0, v1, v7, v2}, Lcom/google/android/gms/internal/ads/zziw;->zzi(Ljava/lang/Throwable;Lcom/google/android/gms/internal/ads/zzan;ZI)Lcom/google/android/gms/internal/ads/zzjh;

    move-result-object v0

    .line 28
    throw v0

    .line 25
    :cond_f
    iget-boolean v3, p0, Lcom/google/android/gms/internal/ads/zztv;->zzS:Z

    if-nez v3, :cond_11

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzih;->zzg()Z

    move-result v3

    if-nez v3, :cond_11

    .line 50
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzih;->zzb()V

    iget v0, p0, Lcom/google/android/gms/internal/ads/zztv;->zzP:I

    if-ne v0, v8, :cond_10

    iput v9, p0, Lcom/google/android/gms/internal/ads/zztv;->zzP:I

    :cond_10
    return v9

    :cond_11
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzin;->zzk()Z

    move-result v3

    if-eqz v3, :cond_12

    iget-object v2, v2, Lcom/google/android/gms/internal/ads/zzin;->zzb:Lcom/google/android/gms/internal/ads/zzik;

    .line 29
    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/ads/zzik;->zzb(I)V

    :cond_12
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zztv;->zzg:Lcom/google/android/gms/internal/ads/zzin;

    iget-wide v4, v1, Lcom/google/android/gms/internal/ads/zzin;->zze:J

    iget-boolean v1, p0, Lcom/google/android/gms/internal/ads/zztv;->zzZ:Z

    if-eqz v1, :cond_14

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zztv;->zzk:Ljava/util/ArrayDeque;

    .line 30
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_13

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zztv;->zzk:Ljava/util/ArrayDeque;

    .line 31
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->peekLast()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/ads/zztu;

    iget-object v1, v1, Lcom/google/android/gms/internal/ads/zztu;->zze:Lcom/google/android/gms/internal/ads/zzga;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zztv;->zzm:Lcom/google/android/gms/internal/ads/zzan;

    .line 33
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    invoke-virtual {v1, v4, v5, v2}, Lcom/google/android/gms/internal/ads/zzga;->zzd(JLjava/lang/Object;)V

    goto :goto_1

    .line 41
    :cond_13
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zztv;->zzaa:Lcom/google/android/gms/internal/ads/zztu;

    .line 34
    iget-object v1, v1, Lcom/google/android/gms/internal/ads/zztu;->zze:Lcom/google/android/gms/internal/ads/zzga;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zztv;->zzm:Lcom/google/android/gms/internal/ads/zzan;

    .line 49
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    invoke-virtual {v1, v4, v5, v2}, Lcom/google/android/gms/internal/ads/zzga;->zzd(JLjava/lang/Object;)V

    .line 32
    :goto_1
    iput-boolean v7, p0, Lcom/google/android/gms/internal/ads/zztv;->zzZ:Z

    :cond_14
    iget-wide v1, p0, Lcom/google/android/gms/internal/ads/zztv;->zzV:J

    .line 35
    invoke-static {v1, v2, v4, v5}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v1

    iput-wide v1, p0, Lcom/google/android/gms/internal/ads/zztv;->zzV:J

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zziw;->zzQ()Z

    move-result v6

    if-nez v6, :cond_15

    iget-object v6, p0, Lcom/google/android/gms/internal/ads/zztv;->zzg:Lcom/google/android/gms/internal/ads/zzin;

    invoke-virtual {v6}, Lcom/google/android/gms/internal/ads/zzih;->zzh()Z

    move-result v6

    if-eqz v6, :cond_16

    :cond_15
    iput-wide v1, p0, Lcom/google/android/gms/internal/ads/zztv;->zzW:J

    :cond_16
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zztv;->zzg:Lcom/google/android/gms/internal/ads/zzin;

    .line 36
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzin;->zzj()V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zztv;->zzg:Lcom/google/android/gms/internal/ads/zzin;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzih;->zze()Z

    move-result v2

    if-eqz v2, :cond_17

    .line 37
    invoke-virtual {p0, v1}, Lcom/google/android/gms/internal/ads/zztv;->zzaj(Lcom/google/android/gms/internal/ads/zzin;)V

    :cond_17
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zztv;->zzg:Lcom/google/android/gms/internal/ads/zzin;

    .line 38
    invoke-virtual {p0, v1}, Lcom/google/android/gms/internal/ads/zztv;->zzaB(Lcom/google/android/gms/internal/ads/zzin;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zztv;->zzg:Lcom/google/android/gms/internal/ads/zzin;

    .line 39
    invoke-virtual {p0, v1}, Lcom/google/android/gms/internal/ads/zztv;->zzat(Lcom/google/android/gms/internal/ads/zzin;)I

    if-eqz v3, :cond_18

    :try_start_2
    iget v1, p0, Lcom/google/android/gms/internal/ads/zztv;->zzG:I

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zztv;->zzg:Lcom/google/android/gms/internal/ads/zzin;

    iget-object v3, v2, Lcom/google/android/gms/internal/ads/zzin;->zzb:Lcom/google/android/gms/internal/ads/zzik;

    const/4 v6, 0x0

    const/4 v2, 0x0

    .line 43
    invoke-interface/range {v0 .. v6}, Lcom/google/android/gms/internal/ads/zztm;->zzk(IILcom/google/android/gms/internal/ads/zzik;JI)V

    goto :goto_2

    .line 48
    :cond_18
    iget v1, p0, Lcom/google/android/gms/internal/ads/zztv;->zzG:I

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zztv;->zzg:Lcom/google/android/gms/internal/ads/zzin;

    iget-object v2, v2, Lcom/google/android/gms/internal/ads/zzin;->zzc:Ljava/nio/ByteBuffer;

    if-eqz v2, :cond_19

    .line 40
    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->limit()I

    move-result v3

    const/4 v6, 0x0

    const/4 v2, 0x0

    .line 41
    invoke-interface/range {v0 .. v6}, Lcom/google/android/gms/internal/ads/zztm;->zzj(IIIJI)V
    :try_end_2
    .catch Landroid/media/MediaCodec$CryptoException; {:try_start_2 .. :try_end_2} :catch_1

    .line 47
    :goto_2
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zztv;->zzaM()V

    iput-boolean v9, p0, Lcom/google/android/gms/internal/ads/zztv;->zzS:Z

    iput v7, p0, Lcom/google/android/gms/internal/ads/zztv;->zzP:I

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zztv;->zza:Lcom/google/android/gms/internal/ads/zzix;

    .line 48
    iget v1, v0, Lcom/google/android/gms/internal/ads/zzix;->zzc:I

    add-int/2addr v1, v9

    iput v1, v0, Lcom/google/android/gms/internal/ads/zzix;->zzc:I

    return v9

    :cond_19
    const/4 v0, 0x0

    .line 42
    :try_start_3
    throw v0
    :try_end_3
    .catch Landroid/media/MediaCodec$CryptoException; {:try_start_3 .. :try_end_3} :catch_1

    :catch_1
    move-exception v0

    .line 33
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zztv;->zzm:Lcom/google/android/gms/internal/ads/zzan;

    .line 44
    invoke-virtual {v0}, Landroid/media/MediaCodec$CryptoException;->getErrorCode()I

    move-result v2

    invoke-static {v2}, Lcom/google/android/gms/internal/ads/zzgd;->zzj(I)I

    move-result v2

    .line 45
    invoke-virtual {p0, v0, v1, v7, v2}, Lcom/google/android/gms/internal/ads/zziw;->zzi(Ljava/lang/Throwable;Lcom/google/android/gms/internal/ads/zzan;ZI)Lcom/google/android/gms/internal/ads/zzjh;

    move-result-object v0

    .line 46
    throw v0

    :catch_2
    move-exception v0

    .line 17
    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ads/zztv;->zzak(Ljava/lang/Exception;)V

    .line 18
    invoke-direct {p0, v7}, Lcom/google/android/gms/internal/ads/zztv;->zzaU(I)Z

    .line 19
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zztv;->zzah()V

    return v9

    :cond_1a
    :goto_3
    return v7
.end method

.method private final zzaS()Z
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/zztv;->zzH:I

    if-ltz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method private final zzaT(JJ)Z
    .locals 4

    cmp-long v0, p3, p1

    const/4 v1, 0x0

    if-gez v0, :cond_2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zztv;->zzn:Lcom/google/android/gms/internal/ads/zzan;

    const/4 v2, 0x1

    if-eqz v0, :cond_1

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zzan;->zzn:Ljava/lang/String;

    const-string v3, "audio/opus"

    invoke-static {v0, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {p1, p2, p3, p4}, Lcom/google/android/gms/internal/ads/zzaep;->zzf(JJ)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    return v2

    :cond_1
    move v1, v2

    :cond_2
    :goto_0
    return v1
.end method

.method private final zzaU(I)Z
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/ads/zzjh;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zztv;->zzf:Lcom/google/android/gms/internal/ads/zzin;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zziw;->zzcX()Lcom/google/android/gms/internal/ads/zzlj;

    move-result-object v1

    .line 2
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzih;->zzb()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zztv;->zzf:Lcom/google/android/gms/internal/ads/zzin;

    or-int/lit8 p1, p1, 0x4

    .line 3
    invoke-virtual {p0, v1, v0, p1}, Lcom/google/android/gms/internal/ads/zziw;->zzcV(Lcom/google/android/gms/internal/ads/zzlj;Lcom/google/android/gms/internal/ads/zzin;I)I

    move-result p1

    const/4 v0, -0x5

    const/4 v2, 0x1

    if-ne p1, v0, :cond_0

    .line 4
    invoke-virtual {p0, v1}, Lcom/google/android/gms/internal/ads/zztv;->zzac(Lcom/google/android/gms/internal/ads/zzlj;)Lcom/google/android/gms/internal/ads/zziy;

    return v2

    :cond_0
    const/4 v0, -0x4

    if-ne p1, v0, :cond_1

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zztv;->zzf:Lcom/google/android/gms/internal/ads/zzin;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzih;->zzf()Z

    move-result p1

    if-eqz p1, :cond_1

    iput-boolean v2, p0, Lcom/google/android/gms/internal/ads/zztv;->zzX:Z

    .line 5
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zztv;->zzao()V

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method private final zzaV(Lcom/google/android/gms/internal/ads/zzan;)Z
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/ads/zzjh;
        }
    .end annotation

    .line 1
    sget v0, Lcom/google/android/gms/internal/ads/zzgd;->zza:I

    const/16 v1, 0x17

    const/4 v2, 0x1

    if-ge v0, v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zztv;->zzq:Lcom/google/android/gms/internal/ads/zztm;

    if-eqz v0, :cond_3

    iget v0, p0, Lcom/google/android/gms/internal/ads/zztv;->zzR:I

    const/4 v1, 0x3

    if-eq v0, v1, :cond_3

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zziw;->zzcU()I

    move-result v0

    if-eqz v0, :cond_3

    iget v0, p0, Lcom/google/android/gms/internal/ads/zztv;->zzp:F

    .line 8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zziw;->zzT()[Lcom/google/android/gms/internal/ads/zzan;

    move-result-object v1

    invoke-virtual {p0, v0, p1, v1}, Lcom/google/android/gms/internal/ads/zztv;->zzZ(FLcom/google/android/gms/internal/ads/zzan;[Lcom/google/android/gms/internal/ads/zzan;)F

    move-result p1

    iget v0, p0, Lcom/google/android/gms/internal/ads/zztv;->zzu:F

    cmpl-float v1, v0, p1

    if-eqz v1, :cond_3

    const/high16 v1, -0x40800000    # -1.0f

    cmpl-float v3, p1, v1

    if-nez v3, :cond_1

    .line 3
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zztv;->zzae()V

    const/4 p1, 0x0

    return p1

    :cond_1
    cmpl-float v0, v0, v1

    if-nez v0, :cond_2

    iget v0, p0, Lcom/google/android/gms/internal/ads/zztv;->zze:F

    cmpl-float v0, p1, v0

    if-lez v0, :cond_3

    :cond_2
    new-instance v0, Landroid/os/Bundle;

    .line 4
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const-string v1, "operating-rate"

    .line 5
    invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zztv;->zzq:Lcom/google/android/gms/internal/ads/zztm;

    .line 7
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    invoke-interface {v1, v0}, Lcom/google/android/gms/internal/ads/zztm;->zzp(Landroid/os/Bundle;)V

    iput p1, p0, Lcom/google/android/gms/internal/ads/zztv;->zzu:F

    :cond_3
    :goto_0
    return v2
.end method

.method private final zzad()V
    .locals 2

    const/4 v0, 0x0

    .line 1
    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zztv;->zzN:Z

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zztv;->zzi:Lcom/google/android/gms/internal/ads/zzti;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzih;->zzb()V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zztv;->zzh:Lcom/google/android/gms/internal/ads/zzin;

    .line 2
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzih;->zzb()V

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zztv;->zzM:Z

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zztv;->zzL:Z

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zztv;->zzl:Lcom/google/android/gms/internal/ads/zzsg;

    .line 3
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzsg;->zzb()V

    return-void
.end method

.method private final zzae()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/ads/zzjh;
        }
    .end annotation

    .line 1
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zztv;->zzS:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    iput v0, p0, Lcom/google/android/gms/internal/ads/zztv;->zzQ:I

    const/4 v0, 0x3

    iput v0, p0, Lcom/google/android/gms/internal/ads/zztv;->zzR:I

    return-void

    :cond_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zztv;->zzaD()V

    .line 2
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zztv;->zzaz()V

    return-void
.end method

.method private final zzah()V
    .locals 1

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zztv;->zzq:Lcom/google/android/gms/internal/ads/zztm;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzeq;->zzb(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zztm;->zzi()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 2
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zztv;->zzaE()V

    return-void

    :catchall_0
    move-exception v0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zztv;->zzaE()V

    .line 3
    throw v0
.end method

.method private final zzai(Lcom/google/android/gms/internal/ads/zztp;Landroid/media/MediaCrypto;)V
    .locals 17
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    move-object/from16 v8, p0

    move-object/from16 v0, p1

    const-string v1, "createCodec:"

    .line 1
    iget-object v2, v8, Lcom/google/android/gms/internal/ads/zztv;->zzm:Lcom/google/android/gms/internal/ads/zzan;

    .line 102
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1
    iget-object v3, v0, Lcom/google/android/gms/internal/ads/zztp;->zza:Ljava/lang/String;

    sget v4, Lcom/google/android/gms/internal/ads/zzgd;->zza:I

    const/16 v5, 0x17

    if-ge v4, v5, :cond_0

    const/high16 v4, -0x40800000    # -1.0f

    goto :goto_0

    .line 101
    :cond_0
    iget v4, v8, Lcom/google/android/gms/internal/ads/zztv;->zzp:F

    .line 2
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/zziw;->zzT()[Lcom/google/android/gms/internal/ads/zzan;

    move-result-object v7

    invoke-virtual {v8, v4, v2, v7}, Lcom/google/android/gms/internal/ads/zztv;->zzZ(FLcom/google/android/gms/internal/ads/zzan;[Lcom/google/android/gms/internal/ads/zzan;)F

    move-result v4

    .line 1
    :goto_0
    iget v7, v8, Lcom/google/android/gms/internal/ads/zztv;->zze:F

    cmpg-float v7, v4, v7

    if-gtz v7, :cond_1

    const/high16 v4, -0x40800000    # -1.0f

    .line 3
    :cond_1
    invoke-virtual {v8, v2}, Lcom/google/android/gms/internal/ads/zztv;->zzaC(Lcom/google/android/gms/internal/ads/zzan;)V

    .line 4
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/zziw;->zzh()Lcom/google/android/gms/internal/ads/zzer;

    .line 5
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v9

    const/4 v7, 0x0

    .line 6
    invoke-virtual {v8, v0, v2, v7, v4}, Lcom/google/android/gms/internal/ads/zztv;->zzaf(Lcom/google/android/gms/internal/ads/zztp;Lcom/google/android/gms/internal/ads/zzan;Landroid/media/MediaCrypto;F)Lcom/google/android/gms/internal/ads/zztk;

    move-result-object v7

    sget v11, Lcom/google/android/gms/internal/ads/zzgd;->zza:I

    const/16 v12, 0x1f

    if-lt v11, v12, :cond_2

    .line 7
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/zziw;->zzn()Lcom/google/android/gms/internal/ads/zzpj;

    move-result-object v11

    invoke-static {v7, v11}, Lcom/google/android/gms/internal/ads/zzts;->zza(Lcom/google/android/gms/internal/ads/zztk;Lcom/google/android/gms/internal/ads/zzpj;)V

    :cond_2
    :try_start_0
    new-instance v11, Ljava/lang/StringBuilder;

    .line 8
    invoke-direct {v11, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v11, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 9
    invoke-static {v1}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    iget-object v1, v8, Lcom/google/android/gms/internal/ads/zztv;->zzc:Lcom/google/android/gms/internal/ads/zztl;

    .line 10
    invoke-interface {v1, v7}, Lcom/google/android/gms/internal/ads/zztl;->zzd(Lcom/google/android/gms/internal/ads/zztk;)Lcom/google/android/gms/internal/ads/zztm;

    move-result-object v1

    iput-object v1, v8, Lcom/google/android/gms/internal/ads/zztv;->zzq:Lcom/google/android/gms/internal/ads/zztm;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 13
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/zziw;->zzh()Lcom/google/android/gms/internal/ads/zzer;

    .line 14
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v11

    .line 15
    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/ads/zztp;->zze(Lcom/google/android/gms/internal/ads/zzan;)Z

    move-result v1

    if-nez v1, :cond_28

    new-instance v1, Ljava/lang/StringBuilder;

    .line 16
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v15, "id="

    .line 17
    invoke-virtual {v1, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v15, v2, Lcom/google/android/gms/internal/ads/zzan;->zzb:Ljava/lang/String;

    invoke-virtual {v1, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v15, ", mimeType="

    invoke-virtual {v1, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v15, v2, Lcom/google/android/gms/internal/ads/zzan;->zzn:Ljava/lang/String;

    invoke-virtual {v1, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v15, v2, Lcom/google/android/gms/internal/ads/zzan;->zzm:Ljava/lang/String;

    if-eqz v15, :cond_3

    const-string v15, ", container="

    .line 18
    invoke-virtual {v1, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v15, v2, Lcom/google/android/gms/internal/ads/zzan;->zzm:Ljava/lang/String;

    invoke-virtual {v1, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_3
    iget v15, v2, Lcom/google/android/gms/internal/ads/zzan;->zzj:I

    const/4 v14, -0x1

    if-eq v15, v14, :cond_4

    const-string v15, ", bitrate="

    .line 19
    invoke-virtual {v1, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v15, v2, Lcom/google/android/gms/internal/ads/zzan;->zzj:I

    invoke-virtual {v1, v15}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    :cond_4
    iget-object v15, v2, Lcom/google/android/gms/internal/ads/zzan;->zzk:Ljava/lang/String;

    if-eqz v15, :cond_5

    const-string v15, ", codecs="

    .line 20
    invoke-virtual {v1, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v15, v2, Lcom/google/android/gms/internal/ads/zzan;->zzk:Ljava/lang/String;

    invoke-virtual {v1, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_5
    iget-object v15, v2, Lcom/google/android/gms/internal/ads/zzan;->zzq:Lcom/google/android/gms/internal/ads/zzae;

    const-string v5, ","

    if-eqz v15, :cond_c

    new-instance v15, Ljava/util/LinkedHashSet;

    .line 21
    invoke-direct {v15}, Ljava/util/LinkedHashSet;-><init>()V

    const/4 v13, 0x0

    :goto_1
    iget-object v6, v2, Lcom/google/android/gms/internal/ads/zzan;->zzq:Lcom/google/android/gms/internal/ads/zzae;

    .line 22
    iget v14, v6, Lcom/google/android/gms/internal/ads/zzae;->zzb:I

    if-ge v13, v14, :cond_b

    .line 23
    invoke-virtual {v6, v13}, Lcom/google/android/gms/internal/ads/zzae;->zza(I)Lcom/google/android/gms/internal/ads/zzad;

    move-result-object v6

    iget-object v6, v6, Lcom/google/android/gms/internal/ads/zzad;->zza:Ljava/util/UUID;

    .line 24
    sget-object v14, Lcom/google/android/gms/internal/ads/zzo;->zzb:Ljava/util/UUID;

    invoke-virtual {v6, v14}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_6

    const-string v6, "cenc"

    .line 25
    invoke-interface {v15, v6}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :goto_2
    move-object/from16 v16, v7

    goto :goto_3

    :cond_6
    sget-object v14, Lcom/google/android/gms/internal/ads/zzo;->zzc:Ljava/util/UUID;

    .line 26
    invoke-virtual {v6, v14}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_7

    const-string v6, "clearkey"

    .line 27
    invoke-interface {v15, v6}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_7
    sget-object v14, Lcom/google/android/gms/internal/ads/zzo;->zze:Ljava/util/UUID;

    .line 28
    invoke-virtual {v6, v14}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_8

    const-string v6, "playready"

    .line 29
    invoke-interface {v15, v6}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_8
    sget-object v14, Lcom/google/android/gms/internal/ads/zzo;->zzd:Ljava/util/UUID;

    .line 30
    invoke-virtual {v6, v14}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_9

    const-string v6, "widevine"

    .line 31
    invoke-interface {v15, v6}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_9
    sget-object v14, Lcom/google/android/gms/internal/ads/zzo;->zza:Ljava/util/UUID;

    .line 32
    invoke-virtual {v6, v14}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_a

    const-string v6, "universal"

    .line 33
    invoke-interface {v15, v6}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 34
    :cond_a
    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v6

    new-instance v14, Ljava/lang/StringBuilder;

    move-object/from16 v16, v7

    const-string v7, "unknown ("

    invoke-direct {v14, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v14, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, ")"

    invoke-virtual {v14, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-interface {v15, v6}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :goto_3
    add-int/lit8 v13, v13, 0x1

    move-object/from16 v7, v16

    const/4 v14, -0x1

    goto :goto_1

    :cond_b
    move-object/from16 v16, v7

    const-string v6, ", drm=["

    .line 35
    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    invoke-static {v1, v15, v5}, Lcom/google/android/gms/internal/ads/zzfxv;->zzb(Ljava/lang/StringBuilder;Ljava/lang/Iterable;Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v6, 0x5d

    .line 37
    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_4

    :cond_c
    move-object/from16 v16, v7

    :goto_4
    iget v6, v2, Lcom/google/android/gms/internal/ads/zzan;->zzs:I

    const/4 v7, -0x1

    if-eq v6, v7, :cond_d

    iget v6, v2, Lcom/google/android/gms/internal/ads/zzan;->zzt:I

    if-eq v6, v7, :cond_d

    const-string v6, ", res="

    .line 38
    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v6, v2, Lcom/google/android/gms/internal/ads/zzan;->zzs:I

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v6, "x"

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v6, v2, Lcom/google/android/gms/internal/ads/zzan;->zzt:I

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    :cond_d
    iget-object v6, v2, Lcom/google/android/gms/internal/ads/zzan;->zzz:Lcom/google/android/gms/internal/ads/zzt;

    if-eqz v6, :cond_f

    invoke-virtual {v6}, Lcom/google/android/gms/internal/ads/zzt;->zze()Z

    move-result v7

    if-nez v7, :cond_e

    invoke-virtual {v6}, Lcom/google/android/gms/internal/ads/zzt;->zzf()Z

    move-result v6

    if-eqz v6, :cond_f

    :cond_e
    const-string v6, ", color="

    .line 39
    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v6, v2, Lcom/google/android/gms/internal/ads/zzan;->zzz:Lcom/google/android/gms/internal/ads/zzt;

    invoke-virtual {v6}, Lcom/google/android/gms/internal/ads/zzt;->zzd()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_f
    iget v6, v2, Lcom/google/android/gms/internal/ads/zzan;->zzu:F

    const/high16 v7, -0x40800000    # -1.0f

    cmpl-float v6, v6, v7

    if-eqz v6, :cond_10

    const-string v6, ", fps="

    .line 40
    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v6, v2, Lcom/google/android/gms/internal/ads/zzan;->zzu:F

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    :cond_10
    iget v6, v2, Lcom/google/android/gms/internal/ads/zzan;->zzA:I

    const/4 v7, -0x1

    if-eq v6, v7, :cond_11

    const-string v6, ", channels="

    .line 41
    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v6, v2, Lcom/google/android/gms/internal/ads/zzan;->zzA:I

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    :cond_11
    iget v6, v2, Lcom/google/android/gms/internal/ads/zzan;->zzB:I

    if-eq v6, v7, :cond_12

    const-string v6, ", sample_rate="

    .line 42
    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v6, v2, Lcom/google/android/gms/internal/ads/zzan;->zzB:I

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    :cond_12
    iget-object v6, v2, Lcom/google/android/gms/internal/ads/zzan;->zze:Ljava/lang/String;

    if-eqz v6, :cond_13

    const-string v6, ", language="

    .line 43
    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v6, v2, Lcom/google/android/gms/internal/ads/zzan;->zze:Ljava/lang/String;

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_13
    iget-object v6, v2, Lcom/google/android/gms/internal/ads/zzan;->zzd:Ljava/util/List;

    .line 44
    invoke-interface {v6}, Ljava/util/List;->isEmpty()Z

    move-result v6

    const-string v7, "]"

    if-nez v6, :cond_14

    const-string v6, ", labels=["

    .line 45
    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v6, v2, Lcom/google/android/gms/internal/ads/zzan;->zzd:Ljava/util/List;

    .line 46
    invoke-static {v1, v6, v5}, Lcom/google/android/gms/internal/ads/zzfxv;->zzb(Ljava/lang/StringBuilder;Ljava/lang/Iterable;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_14
    iget v6, v2, Lcom/google/android/gms/internal/ads/zzan;->zzf:I

    if-eqz v6, :cond_17

    const-string v6, ", selectionFlags=["

    .line 48
    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v6, v2, Lcom/google/android/gms/internal/ads/zzan;->zzf:I

    new-instance v13, Ljava/util/ArrayList;

    .line 49
    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    and-int/lit8 v14, v6, 0x1

    if-eqz v14, :cond_15

    const-string v14, "default"

    .line 50
    invoke-interface {v13, v14}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_15
    const/4 v14, 0x2

    and-int/2addr v6, v14

    if-eqz v6, :cond_16

    const-string v6, "forced"

    .line 51
    invoke-interface {v13, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 52
    :cond_16
    invoke-static {v1, v13, v5}, Lcom/google/android/gms/internal/ads/zzfxv;->zzb(Ljava/lang/StringBuilder;Ljava/lang/Iterable;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_17
    iget v6, v2, Lcom/google/android/gms/internal/ads/zzan;->zzg:I

    if-eqz v6, :cond_27

    const-string v6, ", roleFlags=["

    .line 54
    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v6, v2, Lcom/google/android/gms/internal/ads/zzan;->zzg:I

    new-instance v13, Ljava/util/ArrayList;

    .line 55
    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    and-int/lit8 v14, v6, 0x1

    if-eqz v14, :cond_18

    const-string v14, "main"

    .line 56
    invoke-interface {v13, v14}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_18
    and-int/lit8 v14, v6, 0x2

    if-eqz v14, :cond_19

    const-string v14, "alt"

    .line 57
    invoke-interface {v13, v14}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_19
    and-int/lit8 v14, v6, 0x4

    if-eqz v14, :cond_1a

    const-string v14, "supplementary"

    .line 58
    invoke-interface {v13, v14}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_1a
    and-int/lit8 v14, v6, 0x8

    if-eqz v14, :cond_1b

    const-string v14, "commentary"

    .line 59
    invoke-interface {v13, v14}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_1b
    and-int/lit8 v14, v6, 0x10

    if-eqz v14, :cond_1c

    const-string v14, "dub"

    .line 60
    invoke-interface {v13, v14}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_1c
    and-int/lit8 v14, v6, 0x20

    if-eqz v14, :cond_1d

    const-string v14, "emergency"

    .line 61
    invoke-interface {v13, v14}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_1d
    and-int/lit8 v14, v6, 0x40

    if-eqz v14, :cond_1e

    const-string v14, "caption"

    .line 62
    invoke-interface {v13, v14}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_1e
    and-int/lit16 v14, v6, 0x80

    if-eqz v14, :cond_1f

    const-string v14, "subtitle"

    .line 63
    invoke-interface {v13, v14}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_1f
    and-int/lit16 v14, v6, 0x100

    if-eqz v14, :cond_20

    const-string v14, "sign"

    .line 64
    invoke-interface {v13, v14}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_20
    and-int/lit16 v14, v6, 0x200

    if-eqz v14, :cond_21

    const-string v14, "describes-video"

    .line 65
    invoke-interface {v13, v14}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_21
    and-int/lit16 v14, v6, 0x400

    if-eqz v14, :cond_22

    const-string v14, "describes-music"

    .line 66
    invoke-interface {v13, v14}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_22
    and-int/lit16 v14, v6, 0x800

    if-eqz v14, :cond_23

    const-string v14, "enhanced-intelligibility"

    .line 67
    invoke-interface {v13, v14}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_23
    and-int/lit16 v14, v6, 0x1000

    if-eqz v14, :cond_24

    const-string v14, "transcribes-dialog"

    .line 68
    invoke-interface {v13, v14}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_24
    and-int/lit16 v14, v6, 0x2000

    if-eqz v14, :cond_25

    const-string v14, "easy-read"

    .line 69
    invoke-interface {v13, v14}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_25
    and-int/lit16 v6, v6, 0x4000

    if-eqz v6, :cond_26

    const-string v6, "trick-play"

    .line 70
    invoke-interface {v13, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 71
    :cond_26
    invoke-static {v1, v13, v5}, Lcom/google/android/gms/internal/ads/zzfxv;->zzb(Ljava/lang/StringBuilder;Ljava/lang/Iterable;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_27
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    filled-new-array {v1, v3}, [Ljava/lang/Object;

    move-result-object v1

    sget-object v5, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v6, "Format exceeds selected codec\'s capabilities [%s, %s]"

    .line 73
    invoke-static {v5, v6, v1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v5, "MediaCodecRenderer"

    .line 74
    invoke-static {v5, v1}, Lcom/google/android/gms/internal/ads/zzfk;->zzf(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_5

    :cond_28
    move-object/from16 v16, v7

    :goto_5
    iput-object v0, v8, Lcom/google/android/gms/internal/ads/zztv;->zzx:Lcom/google/android/gms/internal/ads/zztp;

    iput v4, v8, Lcom/google/android/gms/internal/ads/zztv;->zzu:F

    iput-object v2, v8, Lcom/google/android/gms/internal/ads/zztv;->zzr:Lcom/google/android/gms/internal/ads/zzan;

    sget v1, Lcom/google/android/gms/internal/ads/zzgd;->zza:I

    const/16 v2, 0x19

    const/4 v14, 0x1

    if-gt v1, v2, :cond_2a

    const-string v1, "OMX.Exynos.avc.dec.secure"

    .line 75
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2a

    sget-object v1, Lcom/google/android/gms/internal/ads/zzgd;->zzd:Ljava/lang/String;

    const-string v4, "SM-T585"

    .line 76
    invoke-virtual {v1, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_29

    sget-object v1, Lcom/google/android/gms/internal/ads/zzgd;->zzd:Ljava/lang/String;

    const-string v4, "SM-A510"

    .line 77
    invoke-virtual {v1, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_29

    sget-object v1, Lcom/google/android/gms/internal/ads/zzgd;->zzd:Ljava/lang/String;

    const-string v4, "SM-A520"

    .line 78
    invoke-virtual {v1, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_29

    sget-object v1, Lcom/google/android/gms/internal/ads/zzgd;->zzd:Ljava/lang/String;

    const-string v4, "SM-J700"

    .line 79
    invoke-virtual {v1, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2a

    :cond_29
    const/4 v1, 0x2

    goto :goto_6

    .line 99
    :cond_2a
    sget v1, Lcom/google/android/gms/internal/ads/zzgd;->zza:I

    const/16 v4, 0x18

    if-ge v1, v4, :cond_2d

    const-string v1, "OMX.Nvidia.h264.decode"

    .line 80
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2b

    const-string v1, "OMX.Nvidia.h264.decode.secure"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2d

    :cond_2b
    const-string v1, "flounder"

    sget-object v4, Lcom/google/android/gms/internal/ads/zzgd;->zzb:Ljava/lang/String;

    .line 81
    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2c

    const-string v1, "flounder_lte"

    sget-object v4, Lcom/google/android/gms/internal/ads/zzgd;->zzb:Ljava/lang/String;

    .line 82
    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2c

    const-string v1, "grouper"

    sget-object v4, Lcom/google/android/gms/internal/ads/zzgd;->zzb:Ljava/lang/String;

    .line 83
    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2c

    const-string v1, "tilapia"

    sget-object v4, Lcom/google/android/gms/internal/ads/zzgd;->zzb:Ljava/lang/String;

    .line 84
    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2d

    :cond_2c
    move v1, v14

    goto :goto_6

    :cond_2d
    const/4 v1, 0x0

    .line 79
    :goto_6
    iput v1, v8, Lcom/google/android/gms/internal/ads/zztv;->zzy:I

    iget-object v1, v8, Lcom/google/android/gms/internal/ads/zztv;->zzr:Lcom/google/android/gms/internal/ads/zzan;

    .line 101
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 79
    sget v1, Lcom/google/android/gms/internal/ads/zzgd;->zza:I

    const/16 v4, 0x1d

    if-ne v1, v4, :cond_2e

    const-string v1, "c2.android.aac.decoder"

    .line 85
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2e

    move v1, v14

    goto :goto_7

    :cond_2e
    const/4 v1, 0x0

    :goto_7
    iput-boolean v1, v8, Lcom/google/android/gms/internal/ads/zztv;->zzz:Z

    sget v1, Lcom/google/android/gms/internal/ads/zzgd;->zza:I

    const/16 v5, 0x17

    if-gt v1, v5, :cond_30

    const-string v1, "OMX.google.vorbis.decoder"

    .line 86
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2f

    goto :goto_8

    :cond_2f
    move v1, v14

    goto :goto_9

    :cond_30
    :goto_8
    const/4 v1, 0x0

    :goto_9
    iput-boolean v1, v8, Lcom/google/android/gms/internal/ads/zztv;->zzA:Z

    sget v1, Lcom/google/android/gms/internal/ads/zzgd;->zza:I

    const/16 v5, 0x15

    if-ne v1, v5, :cond_31

    const-string v1, "OMX.google.aac.decoder"

    .line 87
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_31

    move v1, v14

    goto :goto_a

    :cond_31
    const/4 v1, 0x0

    :goto_a
    iput-boolean v1, v8, Lcom/google/android/gms/internal/ads/zztv;->zzB:Z

    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zztp;->zza:Ljava/lang/String;

    sget v5, Lcom/google/android/gms/internal/ads/zzgd;->zza:I

    if-gt v5, v2, :cond_33

    const-string v2, "OMX.rk.video_decoder.avc"

    .line 88
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_32

    goto :goto_c

    :cond_32
    :goto_b
    move v0, v14

    goto :goto_d

    :cond_33
    :goto_c
    sget v2, Lcom/google/android/gms/internal/ads/zzgd;->zza:I

    if-gt v2, v4, :cond_34

    const-string v2, "OMX.broadcom.video_decoder.tunnel"

    .line 89
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_32

    const-string v2, "OMX.broadcom.video_decoder.tunnel.secure"

    .line 90
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_32

    const-string v2, "OMX.bcm.vdec.avc.tunnel"

    .line 91
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_32

    const-string v2, "OMX.bcm.vdec.avc.tunnel.secure"

    .line 92
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_32

    const-string v2, "OMX.bcm.vdec.hevc.tunnel"

    .line 93
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_32

    const-string v2, "OMX.bcm.vdec.hevc.tunnel.secure"

    .line 94
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_32

    :cond_34
    const-string v1, "Amazon"

    sget-object v2, Lcom/google/android/gms/internal/ads/zzgd;->zzc:Ljava/lang/String;

    .line 95
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_35

    const-string v1, "AFTS"

    sget-object v2, Lcom/google/android/gms/internal/ads/zzgd;->zzd:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_35

    iget-boolean v0, v0, Lcom/google/android/gms/internal/ads/zztp;->zzf:Z

    if-eqz v0, :cond_35

    goto :goto_b

    :cond_35
    const/4 v0, 0x0

    :goto_d
    iput-boolean v0, v8, Lcom/google/android/gms/internal/ads/zztv;->zzE:Z

    iget-object v0, v8, Lcom/google/android/gms/internal/ads/zztv;->zzq:Lcom/google/android/gms/internal/ads/zztm;

    .line 100
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 95
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/zziw;->zzcU()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_36

    .line 96
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/zziw;->zzh()Lcom/google/android/gms/internal/ads/zzer;

    .line 97
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    const-wide/16 v4, 0x3e8

    add-long/2addr v0, v4

    iput-wide v0, v8, Lcom/google/android/gms/internal/ads/zztv;->zzF:J

    :cond_36
    iget-object v0, v8, Lcom/google/android/gms/internal/ads/zztv;->zza:Lcom/google/android/gms/internal/ads/zzix;

    .line 98
    iget v1, v0, Lcom/google/android/gms/internal/ads/zzix;->zza:I

    add-int/2addr v1, v14

    iput v1, v0, Lcom/google/android/gms/internal/ads/zzix;->zza:I

    sub-long v6, v11, v9

    move-object/from16 v1, p0

    move-object v2, v3

    move-object/from16 v3, v16

    move-wide v4, v11

    .line 99
    invoke-virtual/range {v1 .. v7}, Lcom/google/android/gms/internal/ads/zztv;->zzal(Ljava/lang/String;Lcom/google/android/gms/internal/ads/zztk;JJ)V

    return-void

    :catchall_0
    move-exception v0

    .line 11
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 12
    throw v0
.end method

.method private final zzao()V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/ads/zzjh;
        }
    .end annotation

    .line 6
    iget v0, p0, Lcom/google/android/gms/internal/ads/zztv;->zzR:I

    const/4 v1, 0x1

    if-eq v0, v1, :cond_2

    const/4 v2, 0x2

    if-eq v0, v2, :cond_1

    const/4 v2, 0x3

    if-eq v0, v2, :cond_0

    iput-boolean v1, p0, Lcom/google/android/gms/internal/ads/zztv;->zzY:Z

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zztv;->zzaq()V

    return-void

    .line 1
    :cond_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zztv;->zzaD()V

    .line 2
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zztv;->zzaz()V

    return-void

    .line 3
    :cond_1
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zztv;->zzah()V

    .line 4
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zztv;->zzaP()V

    return-void

    .line 5
    :cond_2
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zztv;->zzah()V

    return-void
.end method


# virtual methods
.method protected zzC()V
    .locals 2

    const/4 v0, 0x0

    .line 1
    :try_start_0
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zztv;->zzad()V

    .line 2
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zztv;->zzaD()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zztv;->zzae:Lcom/google/android/gms/internal/ads/zzsu;

    return-void

    :catchall_0
    move-exception v1

    .line 2
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zztv;->zzae:Lcom/google/android/gms/internal/ads/zzsu;

    .line 3
    throw v1
.end method

.method protected final zzF([Lcom/google/android/gms/internal/ads/zzan;JJLcom/google/android/gms/internal/ads/zzvo;)V
    .locals 12
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/ads/zzjh;
        }
    .end annotation

    move-object v0, p0

    .line 1
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zztv;->zzaa:Lcom/google/android/gms/internal/ads/zztu;

    iget-wide v1, v1, Lcom/google/android/gms/internal/ads/zztu;->zzd:J

    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v1, v1, v3

    if-nez v1, :cond_0

    new-instance v1, Lcom/google/android/gms/internal/ads/zztu;

    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    move-object v5, v1

    move-wide v8, p2

    move-wide/from16 v10, p4

    invoke-direct/range {v5 .. v11}, Lcom/google/android/gms/internal/ads/zztu;-><init>(JJJ)V

    .line 2
    invoke-direct {p0, v1}, Lcom/google/android/gms/internal/ads/zztv;->zzaO(Lcom/google/android/gms/internal/ads/zztu;)V

    return-void

    :cond_0
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zztv;->zzk:Ljava/util/ArrayDeque;

    .line 3
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_3

    iget-wide v1, v0, Lcom/google/android/gms/internal/ads/zztv;->zzV:J

    cmp-long v5, v1, v3

    if-eqz v5, :cond_1

    iget-wide v5, v0, Lcom/google/android/gms/internal/ads/zztv;->zzab:J

    cmp-long v7, v5, v3

    if-eqz v7, :cond_3

    cmp-long v1, v5, v1

    if-ltz v1, :cond_3

    :cond_1
    new-instance v1, Lcom/google/android/gms/internal/ads/zztu;

    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    move-object v5, v1

    move-wide v8, p2

    move-wide/from16 v10, p4

    invoke-direct/range {v5 .. v11}, Lcom/google/android/gms/internal/ads/zztu;-><init>(JJJ)V

    .line 5
    invoke-direct {p0, v1}, Lcom/google/android/gms/internal/ads/zztv;->zzaO(Lcom/google/android/gms/internal/ads/zztu;)V

    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zztv;->zzaa:Lcom/google/android/gms/internal/ads/zztu;

    .line 6
    iget-wide v1, v1, Lcom/google/android/gms/internal/ads/zztu;->zzd:J

    cmp-long v1, v1, v3

    if-eqz v1, :cond_2

    .line 7
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zztv;->zzap()V

    :cond_2
    return-void

    :cond_3
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zztv;->zzk:Ljava/util/ArrayDeque;

    new-instance v9, Lcom/google/android/gms/internal/ads/zztu;

    iget-wide v3, v0, Lcom/google/android/gms/internal/ads/zztv;->zzV:J

    move-object v2, v9

    move-wide v5, p2

    move-wide/from16 v7, p4

    invoke-direct/range {v2 .. v8}, Lcom/google/android/gms/internal/ads/zztu;-><init>(JJJ)V

    .line 4
    invoke-virtual {v1, v9}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public zzM(FF)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/ads/zzjh;
        }
    .end annotation

    .line 1
    iput p2, p0, Lcom/google/android/gms/internal/ads/zztv;->zzp:F

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zztv;->zzr:Lcom/google/android/gms/internal/ads/zzan;

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zztv;->zzaV(Lcom/google/android/gms/internal/ads/zzan;)Z

    return-void
.end method

.method public zzV(JJ)V
    .locals 22
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/ads/zzjh;
        }
    .end annotation

    move-object/from16 v15, p0

    const/4 v14, 0x1

    .line 1
    :try_start_0
    iget-boolean v0, v15, Lcom/google/android/gms/internal/ads/zztv;->zzY:Z

    if-eqz v0, :cond_0

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/zztv;->zzaq()V

    return-void

    :cond_0
    iget-object v0, v15, Lcom/google/android/gms/internal/ads/zztv;->zzm:Lcom/google/android/gms/internal/ads/zzan;

    const/4 v11, 0x2

    if-nez v0, :cond_2

    .line 2
    invoke-direct {v15, v11}, Lcom/google/android/gms/internal/ads/zztv;->zzaU(I)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    return-void

    .line 3
    :cond_2
    :goto_0
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/zztv;->zzaz()V

    iget-boolean v0, v15, Lcom/google/android/gms/internal/ads/zztv;->zzL:Z
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_e

    if-eqz v0, :cond_19

    :try_start_1
    const-string v0, "bypassRender"

    .line 4
    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    :cond_3
    :goto_1
    iget-boolean v0, v15, Lcom/google/android/gms/internal/ads/zztv;->zzY:Z

    xor-int/2addr v0, v14

    .line 5
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzeq;->zzf(Z)V

    iget-object v0, v15, Lcom/google/android/gms/internal/ads/zztv;->zzi:Lcom/google/android/gms/internal/ads/zzti;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzti;->zzp()Z

    move-result v1
    :try_end_1
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_3

    if-eqz v1, :cond_6

    :try_start_2
    iget-object v7, v0, Lcom/google/android/gms/internal/ads/zzti;->zzc:Ljava/nio/ByteBuffer;

    iget v8, v15, Lcom/google/android/gms/internal/ads/zztv;->zzH:I

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzti;->zzl()I

    move-result v10

    iget-wide v4, v0, Lcom/google/android/gms/internal/ads/zzti;->zze:J

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/zziw;->zzf()J

    move-result-wide v1

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzti;->zzm()J

    move-result-wide v12

    .line 6
    invoke-direct {v15, v1, v2, v12, v13}, Lcom/google/android/gms/internal/ads/zztv;->zzaT(JJ)Z

    move-result v13

    iget-object v0, v15, Lcom/google/android/gms/internal/ads/zztv;->zzi:Lcom/google/android/gms/internal/ads/zzti;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzih;->zzf()Z

    move-result v0

    iget-object v11, v15, Lcom/google/android/gms/internal/ads/zztv;->zzn:Lcom/google/android/gms/internal/ads/zzan;
    :try_end_2
    .catch Ljava/lang/IllegalStateException; {:try_start_2 .. :try_end_2} :catch_1

    if-eqz v11, :cond_5

    const/4 v6, 0x0

    const/4 v9, 0x0

    move-object/from16 v1, p0

    move-wide/from16 v2, p1

    move-wide/from16 v18, v4

    move-wide/from16 v4, p3

    move-object/from16 v17, v11

    move-wide/from16 v11, v18

    move v14, v0

    move-object/from16 v15, v17

    .line 7
    :try_start_3
    invoke-virtual/range {v1 .. v15}, Lcom/google/android/gms/internal/ads/zztv;->zzar(JJLcom/google/android/gms/internal/ads/zztm;Ljava/nio/ByteBuffer;IIIJZZLcom/google/android/gms/internal/ads/zzan;)Z

    move-result v0
    :try_end_3
    .catch Ljava/lang/IllegalStateException; {:try_start_3 .. :try_end_3} :catch_0

    if-eqz v0, :cond_4

    move-object/from16 v15, p0

    :try_start_4
    iget-object v0, v15, Lcom/google/android/gms/internal/ads/zztv;->zzi:Lcom/google/android/gms/internal/ads/zzti;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzti;->zzm()J

    move-result-wide v0

    .line 8
    invoke-virtual {v15, v0, v1}, Lcom/google/android/gms/internal/ads/zztv;->zzaA(J)V

    iget-object v0, v15, Lcom/google/android/gms/internal/ads/zztv;->zzi:Lcom/google/android/gms/internal/ads/zzti;

    .line 9
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzih;->zzb()V

    goto :goto_3

    :cond_4
    move-object/from16 v15, p0

    const/4 v13, 0x0

    const/4 v14, 0x1

    goto/16 :goto_a

    :catch_0
    move-exception v0

    move-object/from16 v15, p0

    goto :goto_2

    :cond_5
    const/4 v0, 0x0

    .line 38
    throw v0
    :try_end_4
    .catch Ljava/lang/IllegalStateException; {:try_start_4 .. :try_end_4} :catch_1

    :catch_1
    move-exception v0

    :goto_2
    move-object v1, v15

    const/4 v2, 0x1

    goto/16 :goto_19

    :cond_6
    :goto_3
    const/4 v0, 0x0

    .line 9
    :try_start_5
    iget-boolean v1, v15, Lcom/google/android/gms/internal/ads/zztv;->zzX:Z
    :try_end_5
    .catch Ljava/lang/IllegalStateException; {:try_start_5 .. :try_end_5} :catch_2

    if-eqz v1, :cond_7

    const/4 v14, 0x1

    :try_start_6
    iput-boolean v14, v15, Lcom/google/android/gms/internal/ads/zztv;->zzY:Z
    :try_end_6
    .catch Ljava/lang/IllegalStateException; {:try_start_6 .. :try_end_6} :catch_e

    const/4 v13, 0x0

    goto/16 :goto_a

    :cond_7
    const/4 v14, 0x1

    .line 81
    :try_start_7
    iget-boolean v1, v15, Lcom/google/android/gms/internal/ads/zztv;->zzM:Z

    if-eqz v1, :cond_8

    iget-object v1, v15, Lcom/google/android/gms/internal/ads/zztv;->zzi:Lcom/google/android/gms/internal/ads/zzti;

    iget-object v2, v15, Lcom/google/android/gms/internal/ads/zztv;->zzh:Lcom/google/android/gms/internal/ads/zzin;

    .line 10
    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ads/zzti;->zzo(Lcom/google/android/gms/internal/ads/zzin;)Z

    move-result v1

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/zzeq;->zzf(Z)V
    :try_end_7
    .catch Ljava/lang/IllegalStateException; {:try_start_7 .. :try_end_7} :catch_3

    const/4 v13, 0x0

    :try_start_8
    iput-boolean v13, v15, Lcom/google/android/gms/internal/ads/zztv;->zzM:Z

    goto :goto_4

    :cond_8
    const/4 v13, 0x0

    :goto_4
    iget-boolean v1, v15, Lcom/google/android/gms/internal/ads/zztv;->zzN:Z

    if-eqz v1, :cond_9

    iget-object v1, v15, Lcom/google/android/gms/internal/ads/zztv;->zzi:Lcom/google/android/gms/internal/ads/zzti;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzti;->zzp()Z

    move-result v1

    if-nez v1, :cond_3

    .line 11
    invoke-direct/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/zztv;->zzad()V

    iput-boolean v13, v15, Lcom/google/android/gms/internal/ads/zztv;->zzN:Z

    .line 12
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/zztv;->zzaz()V

    iget-boolean v1, v15, Lcom/google/android/gms/internal/ads/zztv;->zzL:Z

    if-eqz v1, :cond_18

    :cond_9
    iget-boolean v1, v15, Lcom/google/android/gms/internal/ads/zztv;->zzX:Z

    xor-int/2addr v1, v14

    .line 13
    invoke-static {v1}, Lcom/google/android/gms/internal/ads/zzeq;->zzf(Z)V

    .line 14
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/zziw;->zzcX()Lcom/google/android/gms/internal/ads/zzlj;

    move-result-object v1

    iget-object v2, v15, Lcom/google/android/gms/internal/ads/zztv;->zzh:Lcom/google/android/gms/internal/ads/zzin;

    .line 15
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzih;->zzb()V

    :cond_a
    iget-object v2, v15, Lcom/google/android/gms/internal/ads/zztv;->zzh:Lcom/google/android/gms/internal/ads/zzin;

    .line 16
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzih;->zzb()V

    iget-object v2, v15, Lcom/google/android/gms/internal/ads/zztv;->zzh:Lcom/google/android/gms/internal/ads/zzin;

    .line 17
    invoke-virtual {v15, v1, v2, v13}, Lcom/google/android/gms/internal/ads/zziw;->zzcV(Lcom/google/android/gms/internal/ads/zzlj;Lcom/google/android/gms/internal/ads/zzin;I)I

    move-result v2

    const/4 v3, -0x5

    if-eq v2, v3, :cond_16

    const/4 v3, -0x4

    if-eq v2, v3, :cond_b

    goto/16 :goto_9

    .line 32
    :cond_b
    iget-object v2, v15, Lcom/google/android/gms/internal/ads/zztv;->zzh:Lcom/google/android/gms/internal/ads/zzin;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzih;->zzf()Z

    move-result v2

    if-eqz v2, :cond_c

    iput-boolean v14, v15, Lcom/google/android/gms/internal/ads/zztv;->zzX:Z

    goto/16 :goto_9

    :cond_c
    iget-boolean v2, v15, Lcom/google/android/gms/internal/ads/zztv;->zzZ:Z
    :try_end_8
    .catch Ljava/lang/IllegalStateException; {:try_start_8 .. :try_end_8} :catch_d

    const-string v3, "audio/opus"

    if-eqz v2, :cond_10

    :try_start_9
    iget-object v2, v15, Lcom/google/android/gms/internal/ads/zztv;->zzm:Lcom/google/android/gms/internal/ads/zzan;

    if-eqz v2, :cond_f

    iput-object v2, v15, Lcom/google/android/gms/internal/ads/zztv;->zzn:Lcom/google/android/gms/internal/ads/zzan;

    .line 18
    iget-object v2, v2, Lcom/google/android/gms/internal/ads/zzan;->zzn:Ljava/lang/String;

    invoke-static {v2, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_e

    iget-object v2, v15, Lcom/google/android/gms/internal/ads/zztv;->zzn:Lcom/google/android/gms/internal/ads/zzan;

    iget-object v2, v2, Lcom/google/android/gms/internal/ads/zzan;->zzp:Ljava/util/List;

    .line 19
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_e

    iget-object v2, v15, Lcom/google/android/gms/internal/ads/zztv;->zzn:Lcom/google/android/gms/internal/ads/zzan;

    .line 20
    iget-object v2, v2, Lcom/google/android/gms/internal/ads/zzan;->zzp:Ljava/util/List;

    .line 21
    invoke-interface {v2, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [B

    invoke-static {v2}, Lcom/google/android/gms/internal/ads/zzaep;->zza([B)I

    move-result v2

    iget-object v4, v15, Lcom/google/android/gms/internal/ads/zztv;->zzn:Lcom/google/android/gms/internal/ads/zzan;

    if-eqz v4, :cond_d

    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/zzan;->zzb()Lcom/google/android/gms/internal/ads/zzal;

    move-result-object v4

    .line 22
    invoke-virtual {v4, v2}, Lcom/google/android/gms/internal/ads/zzal;->zzF(I)Lcom/google/android/gms/internal/ads/zzal;

    .line 23
    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/zzal;->zzad()Lcom/google/android/gms/internal/ads/zzan;

    move-result-object v2

    iput-object v2, v15, Lcom/google/android/gms/internal/ads/zztv;->zzn:Lcom/google/android/gms/internal/ads/zzan;

    goto :goto_5

    .line 35
    :cond_d
    throw v0

    .line 23
    :cond_e
    :goto_5
    iget-object v2, v15, Lcom/google/android/gms/internal/ads/zztv;->zzn:Lcom/google/android/gms/internal/ads/zzan;

    .line 24
    invoke-virtual {v15, v2, v0}, Lcom/google/android/gms/internal/ads/zztv;->zzan(Lcom/google/android/gms/internal/ads/zzan;Landroid/media/MediaFormat;)V

    iput-boolean v13, v15, Lcom/google/android/gms/internal/ads/zztv;->zzZ:Z

    goto :goto_6

    .line 36
    :cond_f
    throw v0

    .line 24
    :cond_10
    :goto_6
    iget-object v2, v15, Lcom/google/android/gms/internal/ads/zztv;->zzh:Lcom/google/android/gms/internal/ads/zzin;

    .line 25
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzin;->zzj()V

    iget-object v2, v15, Lcom/google/android/gms/internal/ads/zztv;->zzn:Lcom/google/android/gms/internal/ads/zzan;

    if-eqz v2, :cond_13

    iget-object v2, v2, Lcom/google/android/gms/internal/ads/zzan;->zzn:Ljava/lang/String;

    .line 26
    invoke-static {v2, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_13

    iget-object v2, v15, Lcom/google/android/gms/internal/ads/zztv;->zzh:Lcom/google/android/gms/internal/ads/zzin;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzih;->zze()Z

    move-result v3

    if-eqz v3, :cond_11

    iget-object v3, v15, Lcom/google/android/gms/internal/ads/zztv;->zzn:Lcom/google/android/gms/internal/ads/zzan;

    iput-object v3, v2, Lcom/google/android/gms/internal/ads/zzin;->zza:Lcom/google/android/gms/internal/ads/zzan;

    .line 27
    invoke-virtual {v15, v2}, Lcom/google/android/gms/internal/ads/zztv;->zzaj(Lcom/google/android/gms/internal/ads/zzin;)V

    :cond_11
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/zziw;->zzf()J

    move-result-wide v2

    iget-object v4, v15, Lcom/google/android/gms/internal/ads/zztv;->zzh:Lcom/google/android/gms/internal/ads/zzin;

    iget-wide v5, v4, Lcom/google/android/gms/internal/ads/zzin;->zze:J

    invoke-static {v2, v3, v5, v6}, Lcom/google/android/gms/internal/ads/zzaep;->zzf(JJ)Z

    move-result v2

    if-eqz v2, :cond_13

    iget-object v2, v15, Lcom/google/android/gms/internal/ads/zztv;->zzl:Lcom/google/android/gms/internal/ads/zzsg;

    iget-object v3, v15, Lcom/google/android/gms/internal/ads/zztv;->zzn:Lcom/google/android/gms/internal/ads/zzan;

    if-eqz v3, :cond_12

    iget-object v3, v3, Lcom/google/android/gms/internal/ads/zzan;->zzp:Ljava/util/List;

    .line 28
    invoke-virtual {v2, v4, v3}, Lcom/google/android/gms/internal/ads/zzsg;->zza(Lcom/google/android/gms/internal/ads/zzin;Ljava/util/List;)V

    goto :goto_7

    .line 34
    :cond_12
    throw v0

    .line 28
    :cond_13
    :goto_7
    iget-object v2, v15, Lcom/google/android/gms/internal/ads/zztv;->zzi:Lcom/google/android/gms/internal/ads/zzti;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzti;->zzp()Z

    move-result v3

    if-nez v3, :cond_14

    goto :goto_8

    .line 31
    :cond_14
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/zziw;->zzf()J

    move-result-wide v3

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzti;->zzm()J

    move-result-wide v5

    .line 29
    invoke-direct {v15, v3, v4, v5, v6}, Lcom/google/android/gms/internal/ads/zztv;->zzaT(JJ)Z

    move-result v2

    iget-object v5, v15, Lcom/google/android/gms/internal/ads/zztv;->zzh:Lcom/google/android/gms/internal/ads/zzin;

    iget-wide v5, v5, Lcom/google/android/gms/internal/ads/zzin;->zze:J

    .line 30
    invoke-direct {v15, v3, v4, v5, v6}, Lcom/google/android/gms/internal/ads/zztv;->zzaT(JJ)Z

    move-result v3

    if-ne v2, v3, :cond_15

    .line 28
    :goto_8
    iget-object v2, v15, Lcom/google/android/gms/internal/ads/zztv;->zzi:Lcom/google/android/gms/internal/ads/zzti;

    iget-object v3, v15, Lcom/google/android/gms/internal/ads/zztv;->zzh:Lcom/google/android/gms/internal/ads/zzin;

    .line 31
    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/ads/zzti;->zzo(Lcom/google/android/gms/internal/ads/zzin;)Z

    move-result v2

    if-nez v2, :cond_a

    :cond_15
    iput-boolean v14, v15, Lcom/google/android/gms/internal/ads/zztv;->zzM:Z

    goto :goto_9

    .line 32
    :cond_16
    invoke-virtual {v15, v1}, Lcom/google/android/gms/internal/ads/zztv;->zzac(Lcom/google/android/gms/internal/ads/zzlj;)Lcom/google/android/gms/internal/ads/zziy;

    .line 17
    :goto_9
    iget-object v1, v15, Lcom/google/android/gms/internal/ads/zztv;->zzi:Lcom/google/android/gms/internal/ads/zzti;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzti;->zzp()Z

    move-result v2

    if-eqz v2, :cond_17

    .line 33
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzin;->zzj()V

    :cond_17
    iget-object v1, v15, Lcom/google/android/gms/internal/ads/zztv;->zzi:Lcom/google/android/gms/internal/ads/zzti;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzti;->zzp()Z

    move-result v1

    if-nez v1, :cond_3

    iget-boolean v1, v15, Lcom/google/android/gms/internal/ads/zztv;->zzX:Z

    if-nez v1, :cond_3

    iget-boolean v1, v15, Lcom/google/android/gms/internal/ads/zztv;->zzN:Z

    if-eqz v1, :cond_18

    goto/16 :goto_1

    .line 37
    :cond_18
    :goto_a
    invoke-static {}, Landroid/os/Trace;->endSection()V

    move/from16 v18, v13

    move v2, v14

    move-object v1, v15

    goto/16 :goto_16

    :catch_2
    move-exception v0

    const/4 v13, 0x0

    const/4 v14, 0x1

    goto/16 :goto_18

    :catch_3
    move-exception v0

    const/4 v13, 0x0

    goto/16 :goto_18

    :cond_19
    const/4 v0, 0x0

    const/4 v13, 0x0

    .line 30
    iget-object v1, v15, Lcom/google/android/gms/internal/ads/zztv;->zzq:Lcom/google/android/gms/internal/ads/zztm;
    :try_end_9
    .catch Ljava/lang/IllegalStateException; {:try_start_9 .. :try_end_9} :catch_d

    if-eqz v1, :cond_33

    .line 39
    :try_start_a
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/zziw;->zzh()Lcom/google/android/gms/internal/ads/zzer;

    .line 40
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    const-string v1, "drainAndFeed"

    .line 41
    invoke-static {v1}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    :goto_b
    iget-object v6, v15, Lcom/google/android/gms/internal/ads/zztv;->zzq:Lcom/google/android/gms/internal/ads/zztm;

    if-eqz v6, :cond_32

    invoke-direct/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/zztv;->zzaS()Z

    move-result v1
    :try_end_a
    .catch Ljava/lang/IllegalStateException; {:try_start_a .. :try_end_a} :catch_a

    if-nez v1, :cond_2b

    :try_start_b
    iget-boolean v1, v15, Lcom/google/android/gms/internal/ads/zztv;->zzB:Z

    if-eqz v1, :cond_1a

    iget-boolean v1, v15, Lcom/google/android/gms/internal/ads/zztv;->zzT:Z
    :try_end_b
    .catch Ljava/lang/IllegalStateException; {:try_start_b .. :try_end_b} :catch_d

    if-eqz v1, :cond_1a

    :try_start_c
    iget-object v1, v15, Lcom/google/android/gms/internal/ads/zztv;->zzj:Landroid/media/MediaCodec$BufferInfo;

    .line 43
    invoke-interface {v6, v1}, Lcom/google/android/gms/internal/ads/zztm;->zzb(Landroid/media/MediaCodec$BufferInfo;)I

    move-result v1
    :try_end_c
    .catch Ljava/lang/IllegalStateException; {:try_start_c .. :try_end_c} :catch_4

    goto :goto_c

    .line 65
    :catch_4
    :try_start_d
    invoke-direct/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/zztv;->zzao()V

    iget-boolean v0, v15, Lcom/google/android/gms/internal/ads/zztv;->zzY:Z

    if-eqz v0, :cond_1e

    .line 66
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/zztv;->zzaD()V

    goto :goto_d

    .line 59
    :cond_1a
    iget-object v1, v15, Lcom/google/android/gms/internal/ads/zztv;->zzj:Landroid/media/MediaCodec$BufferInfo;

    .line 42
    invoke-interface {v6, v1}, Lcom/google/android/gms/internal/ads/zztm;->zzb(Landroid/media/MediaCodec$BufferInfo;)I

    move-result v1

    :goto_c
    if-gez v1, :cond_22

    const/4 v2, -0x2

    if-ne v1, v2, :cond_1d

    .line 43
    iput-boolean v14, v15, Lcom/google/android/gms/internal/ads/zztv;->zzU:Z

    iget-object v1, v15, Lcom/google/android/gms/internal/ads/zztv;->zzq:Lcom/google/android/gms/internal/ads/zztm;

    if-eqz v1, :cond_1c

    .line 44
    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/zztm;->zzc()Landroid/media/MediaFormat;

    move-result-object v1

    iget v2, v15, Lcom/google/android/gms/internal/ads/zztv;->zzy:I

    if-eqz v2, :cond_1b

    const-string v2, "width"

    .line 45
    invoke-virtual {v1, v2}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    move-result v2

    const/16 v3, 0x20

    if-ne v2, v3, :cond_1b

    const-string v2, "height"

    .line 46
    invoke-virtual {v1, v2}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    move-result v2

    if-ne v2, v3, :cond_1b

    iput-boolean v14, v15, Lcom/google/android/gms/internal/ads/zztv;->zzD:Z

    goto :goto_b

    :cond_1b
    iput-object v1, v15, Lcom/google/android/gms/internal/ads/zztv;->zzs:Landroid/media/MediaFormat;

    iput-boolean v14, v15, Lcom/google/android/gms/internal/ads/zztv;->zzt:Z

    goto :goto_b

    .line 67
    :cond_1c
    throw v0

    .line 46
    :cond_1d
    iget-boolean v0, v15, Lcom/google/android/gms/internal/ads/zztv;->zzE:Z

    if-nez v0, :cond_20

    :cond_1e
    :goto_d
    move/from16 v18, v13

    :cond_1f
    :goto_e
    move-object v1, v15

    goto/16 :goto_14

    .line 77
    :cond_20
    iget-boolean v0, v15, Lcom/google/android/gms/internal/ads/zztv;->zzX:Z

    if-nez v0, :cond_21

    iget v0, v15, Lcom/google/android/gms/internal/ads/zztv;->zzQ:I

    if-ne v0, v11, :cond_1e

    .line 68
    :cond_21
    invoke-direct/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/zztv;->zzao()V

    goto :goto_d

    :cond_22
    iget-boolean v2, v15, Lcom/google/android/gms/internal/ads/zztv;->zzD:Z

    if-eqz v2, :cond_23

    iput-boolean v13, v15, Lcom/google/android/gms/internal/ads/zztv;->zzD:Z

    .line 47
    invoke-interface {v6, v1, v13}, Lcom/google/android/gms/internal/ads/zztm;->zzn(IZ)V

    goto :goto_b

    :cond_23
    iget-object v2, v15, Lcom/google/android/gms/internal/ads/zztv;->zzj:Landroid/media/MediaCodec$BufferInfo;

    .line 48
    iget v2, v2, Landroid/media/MediaCodec$BufferInfo;->size:I

    if-nez v2, :cond_24

    iget-object v2, v15, Lcom/google/android/gms/internal/ads/zztv;->zzj:Landroid/media/MediaCodec$BufferInfo;

    iget v2, v2, Landroid/media/MediaCodec$BufferInfo;->flags:I

    and-int/lit8 v2, v2, 0x4

    if-eqz v2, :cond_24

    .line 75
    invoke-direct/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/zztv;->zzao()V

    goto :goto_d

    :cond_24
    iput v1, v15, Lcom/google/android/gms/internal/ads/zztv;->zzH:I

    .line 49
    invoke-interface {v6, v1}, Lcom/google/android/gms/internal/ads/zztm;->zzg(I)Ljava/nio/ByteBuffer;

    move-result-object v1

    iput-object v1, v15, Lcom/google/android/gms/internal/ads/zztv;->zzI:Ljava/nio/ByteBuffer;

    if-eqz v1, :cond_25

    iget-object v2, v15, Lcom/google/android/gms/internal/ads/zztv;->zzj:Landroid/media/MediaCodec$BufferInfo;

    .line 50
    iget v2, v2, Landroid/media/MediaCodec$BufferInfo;->offset:I

    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    iget-object v1, v15, Lcom/google/android/gms/internal/ads/zztv;->zzI:Ljava/nio/ByteBuffer;

    iget-object v2, v15, Lcom/google/android/gms/internal/ads/zztv;->zzj:Landroid/media/MediaCodec$BufferInfo;

    .line 51
    iget v2, v2, Landroid/media/MediaCodec$BufferInfo;->offset:I

    iget-object v3, v15, Lcom/google/android/gms/internal/ads/zztv;->zzj:Landroid/media/MediaCodec$BufferInfo;

    iget v3, v3, Landroid/media/MediaCodec$BufferInfo;->size:I

    add-int/2addr v2, v3

    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;

    :cond_25
    iget-object v1, v15, Lcom/google/android/gms/internal/ads/zztv;->zzj:Landroid/media/MediaCodec$BufferInfo;

    .line 52
    iget-wide v1, v1, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/zziw;->zzf()J

    move-result-wide v3

    cmp-long v1, v1, v3

    if-gez v1, :cond_26

    move v1, v14

    goto :goto_f

    :cond_26
    move v1, v13

    :goto_f
    iput-boolean v1, v15, Lcom/google/android/gms/internal/ads/zztv;->zzJ:Z

    iget-wide v1, v15, Lcom/google/android/gms/internal/ads/zztv;->zzW:J

    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v3, v1, v3

    if-eqz v3, :cond_27

    iget-object v3, v15, Lcom/google/android/gms/internal/ads/zztv;->zzj:Landroid/media/MediaCodec$BufferInfo;

    .line 53
    iget-wide v3, v3, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    cmp-long v1, v1, v3

    if-gtz v1, :cond_27

    move v1, v14

    goto :goto_10

    :cond_27
    move v1, v13

    :goto_10
    iput-boolean v1, v15, Lcom/google/android/gms/internal/ads/zztv;->zzK:Z

    iget-object v1, v15, Lcom/google/android/gms/internal/ads/zztv;->zzj:Landroid/media/MediaCodec$BufferInfo;

    .line 54
    iget-wide v1, v1, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    iget-object v3, v15, Lcom/google/android/gms/internal/ads/zztv;->zzaa:Lcom/google/android/gms/internal/ads/zztu;

    .line 55
    iget-object v3, v3, Lcom/google/android/gms/internal/ads/zztu;->zze:Lcom/google/android/gms/internal/ads/zzga;

    invoke-virtual {v3, v1, v2}, Lcom/google/android/gms/internal/ads/zzga;->zzc(J)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/ads/zzan;

    if-nez v1, :cond_28

    iget-boolean v2, v15, Lcom/google/android/gms/internal/ads/zztv;->zzac:Z

    if-eqz v2, :cond_28

    iget-object v2, v15, Lcom/google/android/gms/internal/ads/zztv;->zzs:Landroid/media/MediaFormat;

    if-eqz v2, :cond_28

    iget-object v1, v15, Lcom/google/android/gms/internal/ads/zztv;->zzaa:Lcom/google/android/gms/internal/ads/zztu;

    .line 56
    iget-object v1, v1, Lcom/google/android/gms/internal/ads/zztu;->zze:Lcom/google/android/gms/internal/ads/zzga;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzga;->zzb()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/ads/zzan;

    :cond_28
    if-eqz v1, :cond_29

    iput-object v1, v15, Lcom/google/android/gms/internal/ads/zztv;->zzn:Lcom/google/android/gms/internal/ads/zzan;

    goto :goto_11

    .line 59
    :cond_29
    iget-boolean v1, v15, Lcom/google/android/gms/internal/ads/zztv;->zzt:Z

    if-eqz v1, :cond_2b

    iget-object v1, v15, Lcom/google/android/gms/internal/ads/zztv;->zzn:Lcom/google/android/gms/internal/ads/zzan;

    if-eqz v1, :cond_2b

    .line 56
    :goto_11
    iget-object v1, v15, Lcom/google/android/gms/internal/ads/zztv;->zzn:Lcom/google/android/gms/internal/ads/zzan;

    if-eqz v1, :cond_2a

    iget-object v2, v15, Lcom/google/android/gms/internal/ads/zztv;->zzs:Landroid/media/MediaFormat;

    .line 57
    invoke-virtual {v15, v1, v2}, Lcom/google/android/gms/internal/ads/zztv;->zzan(Lcom/google/android/gms/internal/ads/zzan;Landroid/media/MediaFormat;)V

    iput-boolean v13, v15, Lcom/google/android/gms/internal/ads/zztv;->zzt:Z

    iput-boolean v13, v15, Lcom/google/android/gms/internal/ads/zztv;->zzac:Z

    goto :goto_12

    .line 74
    :cond_2a
    throw v0
    :try_end_d
    .catch Ljava/lang/IllegalStateException; {:try_start_d .. :try_end_d} :catch_d

    .line 57
    :cond_2b
    :goto_12
    :try_start_e
    iget-boolean v1, v15, Lcom/google/android/gms/internal/ads/zztv;->zzB:Z

    if-eqz v1, :cond_2d

    iget-boolean v1, v15, Lcom/google/android/gms/internal/ads/zztv;->zzT:Z
    :try_end_e
    .catch Ljava/lang/IllegalStateException; {:try_start_e .. :try_end_e} :catch_a

    if-eqz v1, :cond_2d

    :try_start_f
    iget-object v7, v15, Lcom/google/android/gms/internal/ads/zztv;->zzI:Ljava/nio/ByteBuffer;

    iget v8, v15, Lcom/google/android/gms/internal/ads/zztv;->zzH:I

    iget-object v1, v15, Lcom/google/android/gms/internal/ads/zztv;->zzj:Landroid/media/MediaCodec$BufferInfo;

    .line 60
    iget v9, v1, Landroid/media/MediaCodec$BufferInfo;->flags:I

    iget-object v1, v15, Lcom/google/android/gms/internal/ads/zztv;->zzj:Landroid/media/MediaCodec$BufferInfo;

    iget-wide v4, v1, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    iget-boolean v12, v15, Lcom/google/android/gms/internal/ads/zztv;->zzJ:Z

    iget-boolean v10, v15, Lcom/google/android/gms/internal/ads/zztv;->zzK:Z

    iget-object v2, v15, Lcom/google/android/gms/internal/ads/zztv;->zzn:Lcom/google/android/gms/internal/ads/zzan;
    :try_end_f
    .catch Ljava/lang/IllegalStateException; {:try_start_f .. :try_end_f} :catch_5

    if-eqz v2, :cond_2c

    const/16 v16, 0x1

    move-object/from16 v1, p0

    move-object/from16 v17, v2

    move-wide/from16 v2, p1

    move-wide/from16 v18, v4

    move-wide/from16 v4, p3

    move/from16 v20, v10

    move/from16 v10, v16

    move/from16 v21, v11

    move/from16 v16, v12

    move-wide/from16 v11, v18

    move/from16 v18, v13

    move/from16 v13, v16

    move/from16 v14, v20

    move-object/from16 v15, v17

    .line 61
    :try_start_10
    invoke-virtual/range {v1 .. v15}, Lcom/google/android/gms/internal/ads/zztv;->zzar(JJLcom/google/android/gms/internal/ads/zztm;Ljava/nio/ByteBuffer;IIIJZZLcom/google/android/gms/internal/ads/zzan;)Z

    move-result v1

    goto :goto_13

    :cond_2c
    move/from16 v18, v13

    .line 71
    throw v0
    :try_end_10
    .catch Ljava/lang/IllegalStateException; {:try_start_10 .. :try_end_10} :catch_6

    :catch_5
    move/from16 v18, v13

    .line 72
    :catch_6
    :try_start_11
    invoke-direct/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/zztv;->zzao()V
    :try_end_11
    .catch Ljava/lang/IllegalStateException; {:try_start_11 .. :try_end_11} :catch_7

    move-object/from16 v15, p0

    :try_start_12
    iget-boolean v0, v15, Lcom/google/android/gms/internal/ads/zztv;->zzY:Z

    if-eqz v0, :cond_1f

    .line 73
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/zztv;->zzaD()V

    goto/16 :goto_e

    :catch_7
    move-exception v0

    move-object/from16 v15, p0

    goto/16 :goto_15

    :cond_2d
    move/from16 v21, v11

    move/from16 v18, v13

    .line 70
    iget-object v7, v15, Lcom/google/android/gms/internal/ads/zztv;->zzI:Ljava/nio/ByteBuffer;

    iget v8, v15, Lcom/google/android/gms/internal/ads/zztv;->zzH:I

    iget-object v1, v15, Lcom/google/android/gms/internal/ads/zztv;->zzj:Landroid/media/MediaCodec$BufferInfo;

    .line 58
    iget v9, v1, Landroid/media/MediaCodec$BufferInfo;->flags:I

    iget-object v1, v15, Lcom/google/android/gms/internal/ads/zztv;->zzj:Landroid/media/MediaCodec$BufferInfo;

    iget-wide v11, v1, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    iget-boolean v13, v15, Lcom/google/android/gms/internal/ads/zztv;->zzJ:Z

    iget-boolean v14, v15, Lcom/google/android/gms/internal/ads/zztv;->zzK:Z

    iget-object v10, v15, Lcom/google/android/gms/internal/ads/zztv;->zzn:Lcom/google/android/gms/internal/ads/zzan;
    :try_end_12
    .catch Ljava/lang/IllegalStateException; {:try_start_12 .. :try_end_12} :catch_9

    if-eqz v10, :cond_31

    const/16 v16, 0x1

    move-object/from16 v1, p0

    move-wide/from16 v2, p1

    move-wide/from16 v4, p3

    move-object/from16 v17, v10

    move/from16 v10, v16

    move-object/from16 v15, v17

    .line 59
    :try_start_13
    invoke-virtual/range {v1 .. v15}, Lcom/google/android/gms/internal/ads/zztv;->zzar(JJLcom/google/android/gms/internal/ads/zztm;Ljava/nio/ByteBuffer;IIIJZZLcom/google/android/gms/internal/ads/zzan;)Z

    move-result v1
    :try_end_13
    .catch Ljava/lang/IllegalStateException; {:try_start_13 .. :try_end_13} :catch_8

    :goto_13
    if-eqz v1, :cond_2f

    move-object/from16 v1, p0

    .line 61
    :try_start_14
    iget-object v2, v1, Lcom/google/android/gms/internal/ads/zztv;->zzj:Landroid/media/MediaCodec$BufferInfo;

    .line 62
    iget-wide v2, v2, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    invoke-virtual {v1, v2, v3}, Lcom/google/android/gms/internal/ads/zztv;->zzaA(J)V

    iget-object v2, v1, Lcom/google/android/gms/internal/ads/zztv;->zzj:Landroid/media/MediaCodec$BufferInfo;

    .line 63
    iget v2, v2, Landroid/media/MediaCodec$BufferInfo;->flags:I

    and-int/lit8 v2, v2, 0x4

    .line 64
    invoke-direct/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/zztv;->zzaN()V

    if-eqz v2, :cond_2e

    .line 70
    invoke-direct/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/zztv;->zzao()V

    goto :goto_14

    :cond_2e
    move-object v15, v1

    move/from16 v13, v18

    move/from16 v11, v21

    const/4 v14, 0x1

    goto/16 :goto_b

    :cond_2f
    move-object/from16 v1, p0

    .line 76
    :cond_30
    :goto_14
    invoke-direct/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/zztv;->zzaR()Z

    move-result v0

    if-nez v0, :cond_30

    .line 77
    invoke-static {}, Landroid/os/Trace;->endSection()V

    const/4 v2, 0x1

    goto :goto_16

    :catch_8
    move-exception v0

    move-object/from16 v1, p0

    goto :goto_17

    :cond_31
    move-object v1, v15

    .line 69
    throw v0

    :catch_9
    move-exception v0

    goto :goto_15

    :cond_32
    move/from16 v18, v13

    move-object v1, v15

    .line 78
    throw v0

    :catch_a
    move-exception v0

    move/from16 v18, v13

    :goto_15
    move-object v1, v15

    goto :goto_17

    :cond_33
    move/from16 v18, v13

    move-object v1, v15

    .line 42
    iget-object v0, v1, Lcom/google/android/gms/internal/ads/zztv;->zza:Lcom/google/android/gms/internal/ads/zzix;

    .line 79
    iget v2, v0, Lcom/google/android/gms/internal/ads/zzix;->zzd:I

    invoke-virtual/range {p0 .. p2}, Lcom/google/android/gms/internal/ads/zziw;->zzd(J)I

    move-result v3

    add-int/2addr v2, v3

    iput v2, v0, Lcom/google/android/gms/internal/ads/zzix;->zzd:I
    :try_end_14
    .catch Ljava/lang/IllegalStateException; {:try_start_14 .. :try_end_14} :catch_c

    const/4 v2, 0x1

    .line 80
    :try_start_15
    invoke-direct {v1, v2}, Lcom/google/android/gms/internal/ads/zztv;->zzaU(I)Z

    .line 37
    :goto_16
    iget-object v0, v1, Lcom/google/android/gms/internal/ads/zztv;->zza:Lcom/google/android/gms/internal/ads/zzix;

    .line 81
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzix;->zza()V
    :try_end_15
    .catch Ljava/lang/IllegalStateException; {:try_start_15 .. :try_end_15} :catch_b

    return-void

    :catch_b
    move-exception v0

    goto :goto_1a

    :catch_c
    move-exception v0

    :goto_17
    const/4 v2, 0x1

    goto :goto_1a

    :catch_d
    move-exception v0

    :goto_18
    move/from16 v18, v13

    move v2, v14

    move-object v1, v15

    goto :goto_1a

    :catch_e
    move-exception v0

    move v2, v14

    move-object v1, v15

    :goto_19
    const/16 v18, 0x0

    .line 82
    :goto_1a
    sget v3, Lcom/google/android/gms/internal/ads/zzgd;->zza:I

    .line 83
    instance-of v3, v0, Landroid/media/MediaCodec$CodecException;

    if-eqz v3, :cond_34

    goto :goto_1b

    .line 84
    :cond_34
    invoke-virtual {v0}, Ljava/lang/IllegalStateException;->getStackTrace()[Ljava/lang/StackTraceElement;

    move-result-object v4

    .line 85
    array-length v5, v4

    if-lez v5, :cond_37

    aget-object v4, v4, v18

    invoke-virtual {v4}, Ljava/lang/StackTraceElement;->getClassName()Ljava/lang/String;

    move-result-object v4

    const-string v5, "android.media.MediaCodec"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_37

    .line 87
    :goto_1b
    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/zztv;->zzak(Ljava/lang/Exception;)V

    if-eqz v3, :cond_35

    .line 88
    move-object v3, v0

    check-cast v3, Landroid/media/MediaCodec$CodecException;

    invoke-virtual {v3}, Landroid/media/MediaCodec$CodecException;->isRecoverable()Z

    move-result v3

    if-eqz v3, :cond_35

    move v14, v2

    goto :goto_1c

    :cond_35
    move/from16 v14, v18

    :goto_1c
    if-eqz v14, :cond_36

    .line 89
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/zztv;->zzaD()V

    :cond_36
    iget-object v2, v1, Lcom/google/android/gms/internal/ads/zztv;->zzx:Lcom/google/android/gms/internal/ads/zztp;

    .line 90
    invoke-virtual {v1, v0, v2}, Lcom/google/android/gms/internal/ads/zztv;->zzax(Ljava/lang/Throwable;Lcom/google/android/gms/internal/ads/zztp;)Lcom/google/android/gms/internal/ads/zzto;

    move-result-object v0

    iget-object v2, v1, Lcom/google/android/gms/internal/ads/zztv;->zzm:Lcom/google/android/gms/internal/ads/zzan;

    const/16 v3, 0xfa3

    .line 91
    invoke-virtual {v1, v0, v2, v14, v3}, Lcom/google/android/gms/internal/ads/zziw;->zzi(Ljava/lang/Throwable;Lcom/google/android/gms/internal/ads/zzan;ZI)Lcom/google/android/gms/internal/ads/zzjh;

    move-result-object v0

    throw v0

    .line 86
    :cond_37
    throw v0
.end method

.method public zzW()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zztv;->zzY:Z

    return v0
.end method

.method public zzX()Z
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zztv;->zzm:Lcom/google/android/gms/internal/ads/zzan;

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zziw;->zzS()Z

    move-result v0

    const/4 v2, 0x1

    if-nez v0, :cond_1

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zztv;->zzaS()Z

    move-result v0

    if-nez v0, :cond_1

    iget-wide v3, p0, Lcom/google/android/gms/internal/ads/zztv;->zzF:J

    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v0, v3, v5

    if-eqz v0, :cond_2

    .line 2
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zziw;->zzh()Lcom/google/android/gms/internal/ads/zzer;

    .line 3
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v3

    iget-wide v5, p0, Lcom/google/android/gms/internal/ads/zztv;->zzF:J

    cmp-long v0, v3, v5

    if-ltz v0, :cond_0

    goto :goto_0

    :cond_0
    return v2

    :cond_1
    move v1, v2

    :cond_2
    :goto_0
    return v1
.end method

.method public final zzY(Lcom/google/android/gms/internal/ads/zzan;)I
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/ads/zzjh;
        }
    .end annotation

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zztv;->zzd:Lcom/google/android/gms/internal/ads/zztx;

    invoke-virtual {p0, v0, p1}, Lcom/google/android/gms/internal/ads/zztv;->zzaa(Lcom/google/android/gms/internal/ads/zztx;Lcom/google/android/gms/internal/ads/zzan;)I

    move-result p1
    :try_end_0
    .catch Lcom/google/android/gms/internal/ads/zzud; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    :catch_0
    move-exception v0

    const/4 v1, 0x0

    const/16 v2, 0xfa2

    .line 2
    invoke-virtual {p0, v0, p1, v1, v2}, Lcom/google/android/gms/internal/ads/zziw;->zzi(Ljava/lang/Throwable;Lcom/google/android/gms/internal/ads/zzan;ZI)Lcom/google/android/gms/internal/ads/zzjh;

    move-result-object p1

    .line 3
    throw p1
.end method

.method protected zzZ(FLcom/google/android/gms/internal/ads/zzan;[Lcom/google/android/gms/internal/ads/zzan;)F
    .locals 0

    const/4 p1, 0x0

    throw p1
.end method

.method protected zzaA(J)V
    .locals 2

    .line 1
    iput-wide p1, p0, Lcom/google/android/gms/internal/ads/zztv;->zzab:J

    :goto_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zztv;->zzk:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zztv;->zzk:Ljava/util/ArrayDeque;

    .line 2
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/zztu;

    iget-wide v0, v0, Lcom/google/android/gms/internal/ads/zztu;->zzb:J

    cmp-long v0, p1, v0

    if-ltz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zztv;->zzk:Ljava/util/ArrayDeque;

    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->poll()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/zztu;

    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3
    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/zztv;->zzaO(Lcom/google/android/gms/internal/ads/zztu;)V

    .line 4
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zztv;->zzap()V

    goto :goto_0

    :cond_0
    return-void
.end method

.method protected zzaB(Lcom/google/android/gms/internal/ads/zzin;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/ads/zzjh;
        }
    .end annotation

    return-void
.end method

.method protected zzaC(Lcom/google/android/gms/internal/ads/zzan;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/ads/zzjh;
        }
    .end annotation

    return-void
.end method

.method protected final zzaD()V
    .locals 3

    const/4 v0, 0x0

    .line 1
    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zztv;->zzq:Lcom/google/android/gms/internal/ads/zztm;

    if-eqz v1, :cond_1

    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/zztm;->zzl()V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zztv;->zza:Lcom/google/android/gms/internal/ads/zzix;

    .line 2
    iget v2, v1, Lcom/google/android/gms/internal/ads/zzix;->zzb:I

    add-int/lit8 v2, v2, 0x1

    iput v2, v1, Lcom/google/android/gms/internal/ads/zzix;->zzb:I

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zztv;->zzx:Lcom/google/android/gms/internal/ads/zztp;

    if-eqz v1, :cond_0

    iget-object v1, v1, Lcom/google/android/gms/internal/ads/zztp;->zza:Ljava/lang/String;

    .line 3
    invoke-virtual {p0, v1}, Lcom/google/android/gms/internal/ads/zztv;->zzam(Ljava/lang/String;)V

    goto :goto_0

    .line 5
    :cond_0
    throw v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 6
    :cond_1
    :goto_0
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zztv;->zzq:Lcom/google/android/gms/internal/ads/zztm;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zztv;->zzo:Landroid/media/MediaCrypto;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zztv;->zzad:Lcom/google/android/gms/internal/ads/zzsu;

    .line 4
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zztv;->zzaF()V

    return-void

    :catchall_0
    move-exception v1

    .line 5
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zztv;->zzq:Lcom/google/android/gms/internal/ads/zztm;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zztv;->zzo:Landroid/media/MediaCrypto;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zztv;->zzad:Lcom/google/android/gms/internal/ads/zzsu;

    .line 4
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zztv;->zzaF()V

    .line 6
    throw v1
.end method

.method protected zzaE()V
    .locals 3

    .line 1
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zztv;->zzaM()V

    .line 2
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zztv;->zzaN()V

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/zztv;->zzF:J

    const/4 v2, 0x0

    iput-boolean v2, p0, Lcom/google/android/gms/internal/ads/zztv;->zzT:Z

    iput-boolean v2, p0, Lcom/google/android/gms/internal/ads/zztv;->zzS:Z

    iput-boolean v2, p0, Lcom/google/android/gms/internal/ads/zztv;->zzC:Z

    iput-boolean v2, p0, Lcom/google/android/gms/internal/ads/zztv;->zzD:Z

    iput-boolean v2, p0, Lcom/google/android/gms/internal/ads/zztv;->zzJ:Z

    iput-boolean v2, p0, Lcom/google/android/gms/internal/ads/zztv;->zzK:Z

    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/zztv;->zzV:J

    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/zztv;->zzW:J

    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/zztv;->zzab:J

    iput v2, p0, Lcom/google/android/gms/internal/ads/zztv;->zzQ:I

    iput v2, p0, Lcom/google/android/gms/internal/ads/zztv;->zzR:I

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zztv;->zzO:Z

    iput v0, p0, Lcom/google/android/gms/internal/ads/zztv;->zzP:I

    return-void
.end method

.method protected final zzaF()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zztv;->zzaE()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zztv;->zzv:Ljava/util/ArrayDeque;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zztv;->zzx:Lcom/google/android/gms/internal/ads/zztp;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zztv;->zzr:Lcom/google/android/gms/internal/ads/zzan;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zztv;->zzs:Landroid/media/MediaFormat;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zztv;->zzt:Z

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zztv;->zzU:Z

    const/high16 v1, -0x40800000    # -1.0f

    iput v1, p0, Lcom/google/android/gms/internal/ads/zztv;->zzu:F

    iput v0, p0, Lcom/google/android/gms/internal/ads/zztv;->zzy:I

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zztv;->zzz:Z

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zztv;->zzA:Z

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zztv;->zzB:Z

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zztv;->zzE:Z

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zztv;->zzO:Z

    iput v0, p0, Lcom/google/android/gms/internal/ads/zztv;->zzP:I

    return-void
.end method

.method protected final zzaG()Z
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/ads/zzjh;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zztv;->zzaH()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zztv;->zzaz()V

    :cond_0
    return v0
.end method

.method protected final zzaH()Z
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zztv;->zzq:Lcom/google/android/gms/internal/ads/zztm;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    iget v0, p0, Lcom/google/android/gms/internal/ads/zztv;->zzR:I

    const/4 v2, 0x3

    const/4 v3, 0x1

    if-eq v0, v2, :cond_5

    iget-boolean v2, p0, Lcom/google/android/gms/internal/ads/zztv;->zzz:Z

    if-eqz v2, :cond_1

    iget-boolean v2, p0, Lcom/google/android/gms/internal/ads/zztv;->zzU:Z

    if-eqz v2, :cond_5

    :cond_1
    iget-boolean v2, p0, Lcom/google/android/gms/internal/ads/zztv;->zzA:Z

    if-eqz v2, :cond_2

    iget-boolean v2, p0, Lcom/google/android/gms/internal/ads/zztv;->zzT:Z

    if-nez v2, :cond_5

    :cond_2
    const/4 v2, 0x2

    if-ne v0, v2, :cond_4

    sget v0, Lcom/google/android/gms/internal/ads/zzgd;->zza:I

    const/16 v2, 0x17

    if-lt v0, v2, :cond_3

    move v0, v3

    goto :goto_0

    :cond_3
    move v0, v1

    :goto_0
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzeq;->zzf(Z)V

    sget v0, Lcom/google/android/gms/internal/ads/zzgd;->zza:I

    if-lt v0, v2, :cond_4

    .line 2
    :try_start_0
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zztv;->zzaP()V
    :try_end_0
    .catch Lcom/google/android/gms/internal/ads/zzjh; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    .line 6
    const-string v1, "MediaCodecRenderer"

    const-string v2, "Failed to update the DRM session, releasing the codec instead."

    .line 3
    invoke-static {v1, v2, v0}, Lcom/google/android/gms/internal/ads/zzfk;->zzg(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 4
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zztv;->zzaD()V

    return v3

    .line 5
    :cond_4
    :goto_1
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zztv;->zzah()V

    return v1

    .line 6
    :cond_5
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zztv;->zzaD()V

    return v3
.end method

.method protected final zzaI()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zztv;->zzL:Z

    return v0
.end method

.method protected final zzaJ(Lcom/google/android/gms/internal/ads/zzan;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zztv;->zzae:Lcom/google/android/gms/internal/ads/zzsu;

    if-nez v0, :cond_0

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/ads/zztv;->zzas(Lcom/google/android/gms/internal/ads/zzan;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method protected zzaK(Lcom/google/android/gms/internal/ads/zztp;)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method

.method protected abstract zzaa(Lcom/google/android/gms/internal/ads/zztx;Lcom/google/android/gms/internal/ads/zzan;)I
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/ads/zzud;
        }
    .end annotation
.end method

.method protected zzab(Lcom/google/android/gms/internal/ads/zztp;Lcom/google/android/gms/internal/ads/zzan;Lcom/google/android/gms/internal/ads/zzan;)Lcom/google/android/gms/internal/ads/zziy;
    .locals 0

    const/4 p1, 0x0

    throw p1
.end method

.method protected zzac(Lcom/google/android/gms/internal/ads/zzlj;)Lcom/google/android/gms/internal/ads/zziy;
    .locals 11
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/ads/zzjh;
        }
    .end annotation

    const/4 v0, 0x1

    .line 1
    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zztv;->zzZ:Z

    iget-object v4, p1, Lcom/google/android/gms/internal/ads/zzlj;->zza:Lcom/google/android/gms/internal/ads/zzan;

    .line 18
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1
    iget-object v1, v4, Lcom/google/android/gms/internal/ads/zzan;->zzn:Ljava/lang/String;

    const/4 v2, 0x0

    if-eqz v1, :cond_13

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/zzlj;->zzb:Lcom/google/android/gms/internal/ads/zzsu;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zztv;->zzae:Lcom/google/android/gms/internal/ads/zzsu;

    iput-object v4, p0, Lcom/google/android/gms/internal/ads/zztv;->zzm:Lcom/google/android/gms/internal/ads/zzan;

    iget-boolean p1, p0, Lcom/google/android/gms/internal/ads/zztv;->zzL:Z

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zztv;->zzN:Z

    return-object v1

    :cond_0
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zztv;->zzq:Lcom/google/android/gms/internal/ads/zztm;

    if-nez p1, :cond_1

    iput-object v1, p0, Lcom/google/android/gms/internal/ads/zztv;->zzv:Ljava/util/ArrayDeque;

    .line 3
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zztv;->zzaz()V

    return-object v1

    :cond_1
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zztv;->zzx:Lcom/google/android/gms/internal/ads/zztp;

    .line 17
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3
    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zztv;->zzr:Lcom/google/android/gms/internal/ads/zzan;

    .line 16
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3
    iget-object v5, p0, Lcom/google/android/gms/internal/ads/zztv;->zzad:Lcom/google/android/gms/internal/ads/zzsu;

    iget-object v6, p0, Lcom/google/android/gms/internal/ads/zztv;->zzae:Lcom/google/android/gms/internal/ads/zzsu;

    if-ne v5, v6, :cond_12

    if-eq v6, v5, :cond_2

    move v5, v0

    goto :goto_0

    :cond_2
    move v5, v2

    :goto_0
    if-eqz v5, :cond_4

    .line 4
    sget v6, Lcom/google/android/gms/internal/ads/zzgd;->zza:I

    const/16 v7, 0x17

    if-lt v6, v7, :cond_3

    goto :goto_1

    :cond_3
    move v6, v2

    goto :goto_2

    :cond_4
    :goto_1
    move v6, v0

    :goto_2
    invoke-static {v6}, Lcom/google/android/gms/internal/ads/zzeq;->zzf(Z)V

    .line 5
    invoke-virtual {p0, v1, v3, v4}, Lcom/google/android/gms/internal/ads/zztv;->zzab(Lcom/google/android/gms/internal/ads/zztp;Lcom/google/android/gms/internal/ads/zzan;Lcom/google/android/gms/internal/ads/zzan;)Lcom/google/android/gms/internal/ads/zziy;

    move-result-object v6

    iget v7, v6, Lcom/google/android/gms/internal/ads/zziy;->zzd:I

    const/4 v8, 0x3

    if-eqz v7, :cond_e

    const/16 v9, 0x10

    const/4 v10, 0x2

    if-eq v7, v0, :cond_a

    if-eq v7, v10, :cond_6

    .line 6
    invoke-direct {p0, v4}, Lcom/google/android/gms/internal/ads/zztv;->zzaV(Lcom/google/android/gms/internal/ads/zzan;)Z

    move-result v0

    if-nez v0, :cond_5

    goto :goto_4

    .line 13
    :cond_5
    iput-object v4, p0, Lcom/google/android/gms/internal/ads/zztv;->zzr:Lcom/google/android/gms/internal/ads/zzan;

    if-eqz v5, :cond_f

    .line 7
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zztv;->zzaQ()Z

    move-result v0

    if-nez v0, :cond_f

    goto :goto_6

    .line 8
    :cond_6
    invoke-direct {p0, v4}, Lcom/google/android/gms/internal/ads/zztv;->zzaV(Lcom/google/android/gms/internal/ads/zzan;)Z

    move-result v7

    if-nez v7, :cond_7

    goto :goto_4

    :cond_7
    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zztv;->zzO:Z

    iput v0, p0, Lcom/google/android/gms/internal/ads/zztv;->zzP:I

    iget v7, p0, Lcom/google/android/gms/internal/ads/zztv;->zzy:I

    if-eq v7, v10, :cond_9

    if-ne v7, v0, :cond_8

    iget v7, v4, Lcom/google/android/gms/internal/ads/zzan;->zzs:I

    iget v9, v3, Lcom/google/android/gms/internal/ads/zzan;->zzs:I

    if-ne v7, v9, :cond_8

    iget v7, v4, Lcom/google/android/gms/internal/ads/zzan;->zzt:I

    iget v9, v3, Lcom/google/android/gms/internal/ads/zzan;->zzt:I

    if-ne v7, v9, :cond_8

    goto :goto_3

    :cond_8
    move v0, v2

    :cond_9
    :goto_3
    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zztv;->zzC:Z

    iput-object v4, p0, Lcom/google/android/gms/internal/ads/zztv;->zzr:Lcom/google/android/gms/internal/ads/zzan;

    if-eqz v5, :cond_f

    .line 9
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zztv;->zzaQ()Z

    move-result v0

    if-nez v0, :cond_f

    goto :goto_6

    .line 10
    :cond_a
    invoke-direct {p0, v4}, Lcom/google/android/gms/internal/ads/zztv;->zzaV(Lcom/google/android/gms/internal/ads/zzan;)Z

    move-result v7

    if-nez v7, :cond_b

    :goto_4
    move v10, v9

    goto :goto_6

    :cond_b
    iput-object v4, p0, Lcom/google/android/gms/internal/ads/zztv;->zzr:Lcom/google/android/gms/internal/ads/zzan;

    if-eqz v5, :cond_c

    .line 11
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zztv;->zzaQ()Z

    move-result v0

    if-nez v0, :cond_f

    goto :goto_6

    :cond_c
    iget-boolean v5, p0, Lcom/google/android/gms/internal/ads/zztv;->zzS:Z

    if-eqz v5, :cond_f

    iput v0, p0, Lcom/google/android/gms/internal/ads/zztv;->zzQ:I

    iget-boolean v5, p0, Lcom/google/android/gms/internal/ads/zztv;->zzA:Z

    if-eqz v5, :cond_d

    iput v8, p0, Lcom/google/android/gms/internal/ads/zztv;->zzR:I

    goto :goto_6

    :cond_d
    iput v0, p0, Lcom/google/android/gms/internal/ads/zztv;->zzR:I

    goto :goto_5

    .line 12
    :cond_e
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zztv;->zzae()V

    :cond_f
    :goto_5
    move v10, v2

    .line 6
    :goto_6
    iget v0, v6, Lcom/google/android/gms/internal/ads/zziy;->zzd:I

    if-eqz v0, :cond_11

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zztv;->zzq:Lcom/google/android/gms/internal/ads/zztm;

    if-ne v0, p1, :cond_10

    iget p1, p0, Lcom/google/android/gms/internal/ads/zztv;->zzR:I

    if-ne p1, v8, :cond_11

    :cond_10
    iget-object v2, v1, Lcom/google/android/gms/internal/ads/zztp;->zza:Ljava/lang/String;

    new-instance p1, Lcom/google/android/gms/internal/ads/zziy;

    const/4 v5, 0x0

    move-object v1, p1

    move v6, v10

    .line 13
    invoke-direct/range {v1 .. v6}, Lcom/google/android/gms/internal/ads/zziy;-><init>(Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzan;Lcom/google/android/gms/internal/ads/zzan;II)V

    return-object p1

    :cond_11
    return-object v6

    .line 14
    :cond_12
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zztv;->zzae()V

    iget-object v2, v1, Lcom/google/android/gms/internal/ads/zztp;->zza:Ljava/lang/String;

    new-instance p1, Lcom/google/android/gms/internal/ads/zziy;

    const/4 v5, 0x0

    const/16 v6, 0x80

    move-object v1, p1

    .line 15
    invoke-direct/range {v1 .. v6}, Lcom/google/android/gms/internal/ads/zziy;-><init>(Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzan;Lcom/google/android/gms/internal/ads/zzan;II)V

    return-object p1

    .line 1
    :cond_13
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Sample MIME type is null."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    const/16 v0, 0xfa5

    .line 2
    invoke-virtual {p0, p1, v4, v2, v0}, Lcom/google/android/gms/internal/ads/zziw;->zzi(Ljava/lang/Throwable;Lcom/google/android/gms/internal/ads/zzan;ZI)Lcom/google/android/gms/internal/ads/zzjh;

    move-result-object p1

    .line 1
    throw p1
.end method

.method protected abstract zzaf(Lcom/google/android/gms/internal/ads/zztp;Lcom/google/android/gms/internal/ads/zzan;Landroid/media/MediaCrypto;F)Lcom/google/android/gms/internal/ads/zztk;
.end method

.method protected abstract zzag(Lcom/google/android/gms/internal/ads/zztx;Lcom/google/android/gms/internal/ads/zzan;Z)Ljava/util/List;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/ads/zzud;
        }
    .end annotation
.end method

.method protected zzaj(Lcom/google/android/gms/internal/ads/zzin;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/ads/zzjh;
        }
    .end annotation

    const/4 p1, 0x0

    throw p1
.end method

.method protected zzak(Ljava/lang/Exception;)V
    .locals 0

    const/4 p1, 0x0

    throw p1
.end method

.method protected zzal(Ljava/lang/String;Lcom/google/android/gms/internal/ads/zztk;JJ)V
    .locals 0

    const/4 p1, 0x0

    throw p1
.end method

.method protected zzam(Ljava/lang/String;)V
    .locals 0

    const/4 p1, 0x0

    throw p1
.end method

.method protected zzan(Lcom/google/android/gms/internal/ads/zzan;Landroid/media/MediaFormat;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/ads/zzjh;
        }
    .end annotation

    const/4 p1, 0x0

    throw p1
.end method

.method protected zzap()V
    .locals 0

    return-void
.end method

.method protected zzaq()V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/ads/zzjh;
        }
    .end annotation

    return-void
.end method

.method protected abstract zzar(JJLcom/google/android/gms/internal/ads/zztm;Ljava/nio/ByteBuffer;IIIJZZLcom/google/android/gms/internal/ads/zzan;)Z
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/ads/zzjh;
        }
    .end annotation
.end method

.method protected zzas(Lcom/google/android/gms/internal/ads/zzan;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method protected zzat(Lcom/google/android/gms/internal/ads/zzin;)I
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method protected final zzau()J
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zztv;->zzaa:Lcom/google/android/gms/internal/ads/zztu;

    iget-wide v0, v0, Lcom/google/android/gms/internal/ads/zztu;->zzd:J

    return-wide v0
.end method

.method protected final zzav()J
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zztv;->zzaa:Lcom/google/android/gms/internal/ads/zztu;

    iget-wide v0, v0, Lcom/google/android/gms/internal/ads/zztu;->zzc:J

    return-wide v0
.end method

.method protected final zzaw()Lcom/google/android/gms/internal/ads/zztm;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zztv;->zzq:Lcom/google/android/gms/internal/ads/zztm;

    return-object v0
.end method

.method protected zzax(Ljava/lang/Throwable;Lcom/google/android/gms/internal/ads/zztp;)Lcom/google/android/gms/internal/ads/zzto;
    .locals 1

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/ads/zzto;

    invoke-direct {v0, p1, p2}, Lcom/google/android/gms/internal/ads/zzto;-><init>(Ljava/lang/Throwable;Lcom/google/android/gms/internal/ads/zztp;)V

    return-object v0
.end method

.method protected final zzay()Lcom/google/android/gms/internal/ads/zztp;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zztv;->zzx:Lcom/google/android/gms/internal/ads/zztp;

    return-object v0
.end method

.method protected final zzaz()V
    .locals 11
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/ads/zzjh;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zztv;->zzq:Lcom/google/android/gms/internal/ads/zztm;

    if-nez v0, :cond_f

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zztv;->zzL:Z

    if-nez v0, :cond_f

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zztv;->zzm:Lcom/google/android/gms/internal/ads/zzan;

    if-nez v0, :cond_0

    goto/16 :goto_4

    :cond_0
    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ads/zztv;->zzaJ(Lcom/google/android/gms/internal/ads/zzan;)Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_2

    .line 2
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zztv;->zzad()V

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zzan;->zzn:Ljava/lang/String;

    const-string v1, "audio/mp4a-latm"

    .line 3
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    const-string v1, "audio/mpeg"

    .line 4
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    const-string v1, "audio/opus"

    .line 5
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zztv;->zzi:Lcom/google/android/gms/internal/ads/zzti;

    .line 7
    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/ads/zzti;->zzn(I)V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zztv;->zzi:Lcom/google/android/gms/internal/ads/zzti;

    const/16 v1, 0x20

    .line 6
    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzti;->zzn(I)V

    .line 7
    :goto_0
    iput-boolean v2, p0, Lcom/google/android/gms/internal/ads/zztv;->zzL:Z

    return-void

    .line 6
    :cond_2
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zztv;->zzae:Lcom/google/android/gms/internal/ads/zzsu;

    iput-object v1, p0, Lcom/google/android/gms/internal/ads/zztv;->zzad:Lcom/google/android/gms/internal/ads/zzsu;

    if-eqz v1, :cond_3

    .line 8
    invoke-static {v2}, Lcom/google/android/gms/internal/ads/zzeq;->zzf(Z)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zztv;->zzad:Lcom/google/android/gms/internal/ads/zzsu;

    .line 9
    sget-boolean v2, Lcom/google/android/gms/internal/ads/zzsv;->zza:Z

    .line 10
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzsu;->zza()Lcom/google/android/gms/internal/ads/zzsm;

    :cond_3
    const/4 v1, 0x0

    :try_start_0
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zztv;->zzad:Lcom/google/android/gms/internal/ads/zzsu;

    if-eqz v2, :cond_4

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzan;->zzn:Ljava/lang/String;

    .line 11
    invoke-static {v2}, Lcom/google/android/gms/internal/ads/zzeq;->zzb(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_4
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zztv;->zzm:Lcom/google/android/gms/internal/ads/zzan;

    const/4 v3, 0x0

    if-eqz v2, :cond_e

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/zztv;->zzv:Ljava/util/ArrayDeque;
    :try_end_0
    .catch Lcom/google/android/gms/internal/ads/zztt; {:try_start_0 .. :try_end_0} :catch_3

    if-nez v4, :cond_6

    :try_start_1
    iget-object v4, p0, Lcom/google/android/gms/internal/ads/zztv;->zzd:Lcom/google/android/gms/internal/ads/zztx;

    .line 12
    invoke-virtual {p0, v4, v2, v1}, Lcom/google/android/gms/internal/ads/zztv;->zzag(Lcom/google/android/gms/internal/ads/zztx;Lcom/google/android/gms/internal/ads/zzan;Z)Ljava/util/List;

    move-result-object v4

    .line 13
    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    new-instance v5, Ljava/util/ArrayDeque;

    .line 14
    invoke-direct {v5}, Ljava/util/ArrayDeque;-><init>()V

    iput-object v5, p0, Lcom/google/android/gms/internal/ads/zztv;->zzv:Ljava/util/ArrayDeque;

    .line 15
    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    move-result v5

    if-nez v5, :cond_5

    iget-object v5, p0, Lcom/google/android/gms/internal/ads/zztv;->zzv:Ljava/util/ArrayDeque;

    .line 16
    invoke-interface {v4, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/google/android/gms/internal/ads/zztp;

    invoke-virtual {v5, v4}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    :cond_5
    iput-object v3, p0, Lcom/google/android/gms/internal/ads/zztv;->zzw:Lcom/google/android/gms/internal/ads/zztt;
    :try_end_1
    .catch Lcom/google/android/gms/internal/ads/zzud; {:try_start_1 .. :try_end_1} :catch_0
    .catch Lcom/google/android/gms/internal/ads/zztt; {:try_start_1 .. :try_end_1} :catch_3

    goto :goto_1

    :catch_0
    move-exception v3

    .line 37
    :try_start_2
    new-instance v4, Lcom/google/android/gms/internal/ads/zztt;

    const v5, -0xc34e

    .line 17
    invoke-direct {v4, v2, v3, v1, v5}, Lcom/google/android/gms/internal/ads/zztt;-><init>(Lcom/google/android/gms/internal/ads/zzan;Ljava/lang/Throwable;ZI)V

    throw v4

    .line 16
    :cond_6
    :goto_1
    iget-object v4, p0, Lcom/google/android/gms/internal/ads/zztv;->zzv:Ljava/util/ArrayDeque;

    .line 18
    invoke-virtual {v4}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_d

    .line 19
    iget-object v4, p0, Lcom/google/android/gms/internal/ads/zztv;->zzv:Ljava/util/ArrayDeque;

    if-eqz v4, :cond_c

    .line 20
    invoke-virtual {v4}, Ljava/util/ArrayDeque;->peekFirst()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/google/android/gms/internal/ads/zztp;

    :goto_2
    iget-object v6, p0, Lcom/google/android/gms/internal/ads/zztv;->zzq:Lcom/google/android/gms/internal/ads/zztm;

    if-nez v6, :cond_b

    .line 21
    invoke-virtual {v4}, Ljava/util/ArrayDeque;->peekFirst()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/google/android/gms/internal/ads/zztp;

    if-eqz v6, :cond_a

    .line 22
    invoke-virtual {p0, v6}, Lcom/google/android/gms/internal/ads/zztv;->zzaK(Lcom/google/android/gms/internal/ads/zztp;)Z

    move-result v7
    :try_end_2
    .catch Lcom/google/android/gms/internal/ads/zztt; {:try_start_2 .. :try_end_2} :catch_3

    if-eqz v7, :cond_f

    .line 23
    :try_start_3
    invoke-direct {p0, v6, v3}, Lcom/google/android/gms/internal/ads/zztv;->zzai(Lcom/google/android/gms/internal/ads/zztp;Landroid/media/MediaCrypto;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    goto :goto_2

    :catch_1
    move-exception v7

    .line 35
    const-string v8, "MediaCodecRenderer"

    if-ne v6, v5, :cond_7

    :try_start_4
    const-string v7, "Preferred decoder instantiation failed. Sleeping for 50ms then retrying."

    .line 24
    invoke-static {v8, v7}, Lcom/google/android/gms/internal/ads/zzfk;->zzf(Ljava/lang/String;Ljava/lang/String;)V

    const-wide/16 v9, 0x32

    .line 25
    invoke-static {v9, v10}, Ljava/lang/Thread;->sleep(J)V

    .line 26
    invoke-direct {p0, v6, v3}, Lcom/google/android/gms/internal/ads/zztv;->zzai(Lcom/google/android/gms/internal/ads/zztp;Landroid/media/MediaCrypto;)V

    goto :goto_2

    .line 27
    :cond_7
    throw v7
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_2

    :catch_2
    move-exception v7

    .line 26
    :try_start_5
    iget-object v9, v6, Lcom/google/android/gms/internal/ads/zztp;->zza:Ljava/lang/String;

    const-string v10, "Failed to initialize decoder: "

    invoke-virtual {v10, v9}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 28
    invoke-static {v8, v9, v7}, Lcom/google/android/gms/internal/ads/zzfk;->zzg(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 29
    invoke-virtual {v4}, Ljava/util/ArrayDeque;->removeFirst()Ljava/lang/Object;

    new-instance v8, Lcom/google/android/gms/internal/ads/zztt;

    .line 30
    invoke-direct {v8, v2, v7, v1, v6}, Lcom/google/android/gms/internal/ads/zztt;-><init>(Lcom/google/android/gms/internal/ads/zzan;Ljava/lang/Throwable;ZLcom/google/android/gms/internal/ads/zztp;)V

    .line 31
    invoke-virtual {p0, v8}, Lcom/google/android/gms/internal/ads/zztv;->zzak(Ljava/lang/Exception;)V

    iget-object v6, p0, Lcom/google/android/gms/internal/ads/zztv;->zzw:Lcom/google/android/gms/internal/ads/zztt;

    if-nez v6, :cond_8

    iput-object v8, p0, Lcom/google/android/gms/internal/ads/zztv;->zzw:Lcom/google/android/gms/internal/ads/zztt;

    goto :goto_3

    .line 32
    :cond_8
    invoke-static {v6, v8}, Lcom/google/android/gms/internal/ads/zztt;->zza(Lcom/google/android/gms/internal/ads/zztt;Lcom/google/android/gms/internal/ads/zztt;)Lcom/google/android/gms/internal/ads/zztt;

    move-result-object v6

    iput-object v6, p0, Lcom/google/android/gms/internal/ads/zztv;->zzw:Lcom/google/android/gms/internal/ads/zztt;

    .line 33
    :goto_3
    invoke-virtual {v4}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v6

    if-nez v6, :cond_9

    goto :goto_2

    :cond_9
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zztv;->zzw:Lcom/google/android/gms/internal/ads/zztt;

    .line 34
    throw v2

    .line 35
    :cond_a
    throw v3

    .line 23
    :cond_b
    iput-object v3, p0, Lcom/google/android/gms/internal/ads/zztv;->zzv:Ljava/util/ArrayDeque;

    return-void

    .line 36
    :cond_c
    throw v3

    .line 18
    :cond_d
    new-instance v4, Lcom/google/android/gms/internal/ads/zztt;

    const v5, -0xc34f

    .line 19
    invoke-direct {v4, v2, v3, v1, v5}, Lcom/google/android/gms/internal/ads/zztt;-><init>(Lcom/google/android/gms/internal/ads/zzan;Ljava/lang/Throwable;ZI)V

    throw v4

    .line 37
    :cond_e
    throw v3
    :try_end_5
    .catch Lcom/google/android/gms/internal/ads/zztt; {:try_start_5 .. :try_end_5} :catch_3

    :catch_3
    move-exception v2

    const/16 v3, 0xfa1

    .line 38
    invoke-virtual {p0, v2, v0, v1, v3}, Lcom/google/android/gms/internal/ads/zziw;->zzi(Ljava/lang/Throwable;Lcom/google/android/gms/internal/ads/zzan;ZI)Lcom/google/android/gms/internal/ads/zzjh;

    move-result-object v0

    .line 39
    throw v0

    :cond_f
    :goto_4
    return-void
.end method

.method public final zze()I
    .locals 1

    const/16 v0, 0x8

    return v0
.end method

.method protected zzw()V
    .locals 1

    const/4 v0, 0x0

    .line 1
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zztv;->zzm:Lcom/google/android/gms/internal/ads/zzan;

    sget-object v0, Lcom/google/android/gms/internal/ads/zztu;->zza:Lcom/google/android/gms/internal/ads/zztu;

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/zztv;->zzaO(Lcom/google/android/gms/internal/ads/zztu;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zztv;->zzk:Ljava/util/ArrayDeque;

    .line 2
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->clear()V

    .line 3
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zztv;->zzaH()Z

    return-void
.end method

.method protected zzx(ZZ)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/ads/zzjh;
        }
    .end annotation

    new-instance p1, Lcom/google/android/gms/internal/ads/zzix;

    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/zzix;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zztv;->zza:Lcom/google/android/gms/internal/ads/zzix;

    return-void
.end method

.method protected zzz(JZ)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/ads/zzjh;
        }
    .end annotation

    const/4 p1, 0x0

    .line 1
    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/zztv;->zzX:Z

    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/zztv;->zzY:Z

    iget-boolean p2, p0, Lcom/google/android/gms/internal/ads/zztv;->zzL:Z

    if-eqz p2, :cond_0

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/zztv;->zzi:Lcom/google/android/gms/internal/ads/zzti;

    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/zzih;->zzb()V

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/zztv;->zzh:Lcom/google/android/gms/internal/ads/zzin;

    .line 2
    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/zzih;->zzb()V

    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/zztv;->zzM:Z

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zztv;->zzl:Lcom/google/android/gms/internal/ads/zzsg;

    .line 3
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzsg;->zzb()V

    goto :goto_0

    .line 4
    :cond_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zztv;->zzaG()Z

    .line 3
    :goto_0
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zztv;->zzaa:Lcom/google/android/gms/internal/ads/zztu;

    .line 5
    iget-object p1, p1, Lcom/google/android/gms/internal/ads/zztu;->zze:Lcom/google/android/gms/internal/ads/zzga;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzga;->zza()I

    move-result p2

    if-lez p2, :cond_1

    const/4 p2, 0x1

    iput-boolean p2, p0, Lcom/google/android/gms/internal/ads/zztv;->zzZ:Z

    .line 6
    :cond_1
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzga;->zze()V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zztv;->zzk:Ljava/util/ArrayDeque;

    .line 7
    invoke-virtual {p1}, Ljava/util/ArrayDeque;->clear()V

    return-void
.end method
