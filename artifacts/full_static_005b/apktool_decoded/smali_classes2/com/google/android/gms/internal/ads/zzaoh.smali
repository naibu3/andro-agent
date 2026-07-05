.class public final Lcom/google/android/gms/internal/ads/zzaoh;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@23.2.0"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzaoc;


# static fields
.field private static final zza:[F


# instance fields
.field private final zzb:Lcom/google/android/gms/internal/ads/zzapr;

.field private final zzc:Lcom/google/android/gms/internal/ads/zzfu;

.field private final zzd:[Z

.field private final zze:Lcom/google/android/gms/internal/ads/zzaof;

.field private final zzf:Lcom/google/android/gms/internal/ads/zzaor;

.field private zzg:Lcom/google/android/gms/internal/ads/zzaog;

.field private zzh:J

.field private zzi:Ljava/lang/String;

.field private zzj:Lcom/google/android/gms/internal/ads/zzafa;

.field private zzk:Z

.field private zzl:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x7

    new-array v0, v0, [F

    fill-array-data v0, :array_0

    sput-object v0, Lcom/google/android/gms/internal/ads/zzaoh;->zza:[F

    return-void

    nop

    :array_0
    .array-data 4
        0x3f800000    # 1.0f
        0x3f800000    # 1.0f
        0x3f8ba2e9
        0x3f68ba2f
        0x3fba2e8c
        0x3f9b26ca
        0x3f800000    # 1.0f
    .end array-data
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/zzaoh;-><init>(Lcom/google/android/gms/internal/ads/zzapr;)V

    return-void
.end method

.method constructor <init>(Lcom/google/android/gms/internal/ads/zzapr;)V
    .locals 4

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzaoh;->zzb:Lcom/google/android/gms/internal/ads/zzapr;

    const/4 v0, 0x4

    new-array v0, v0, [Z

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzaoh;->zzd:[Z

    new-instance v0, Lcom/google/android/gms/internal/ads/zzaof;

    const/16 v1, 0x80

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/zzaof;-><init>(I)V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzaoh;->zze:Lcom/google/android/gms/internal/ads/zzaof;

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v2, p0, Lcom/google/android/gms/internal/ads/zzaoh;->zzl:J

    if-eqz p1, :cond_0

    new-instance p1, Lcom/google/android/gms/internal/ads/zzaor;

    const/16 v0, 0xb2

    .line 3
    invoke-direct {p1, v0, v1}, Lcom/google/android/gms/internal/ads/zzaor;-><init>(II)V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzaoh;->zzf:Lcom/google/android/gms/internal/ads/zzaor;

    .line 4
    new-instance p1, Lcom/google/android/gms/internal/ads/zzfu;

    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/zzfu;-><init>()V

    :goto_0
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzaoh;->zzc:Lcom/google/android/gms/internal/ads/zzfu;

    return-void

    :cond_0
    const/4 p1, 0x0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzaoh;->zzf:Lcom/google/android/gms/internal/ads/zzaor;

    goto :goto_0
.end method


# virtual methods
.method public final zza(Lcom/google/android/gms/internal/ads/zzfu;)V
    .locals 17

    move-object/from16 v0, p0

    .line 1
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzaoh;->zzg:Lcom/google/android/gms/internal/ads/zzaog;

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/zzeq;->zzb(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzaoh;->zzj:Lcom/google/android/gms/internal/ads/zzafa;

    .line 2
    invoke-static {v1}, Lcom/google/android/gms/internal/ads/zzeq;->zzb(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/zzfu;->zzd()I

    move-result v1

    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/zzfu;->zze()I

    move-result v2

    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/zzfu;->zzM()[B

    move-result-object v3

    iget-wide v4, v0, Lcom/google/android/gms/internal/ads/zzaoh;->zzh:J

    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/zzfu;->zzb()I

    move-result v6

    int-to-long v6, v6

    add-long/2addr v4, v6

    iput-wide v4, v0, Lcom/google/android/gms/internal/ads/zzaoh;->zzh:J

    iget-object v4, v0, Lcom/google/android/gms/internal/ads/zzaoh;->zzj:Lcom/google/android/gms/internal/ads/zzafa;

    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/zzfu;->zzb()I

    move-result v5

    move-object/from16 v6, p1

    .line 3
    invoke-interface {v4, v6, v5}, Lcom/google/android/gms/internal/ads/zzafa;->zzq(Lcom/google/android/gms/internal/ads/zzfu;I)V

    :goto_0
    iget-object v4, v0, Lcom/google/android/gms/internal/ads/zzaoh;->zzd:[Z

    .line 4
    invoke-static {v3, v1, v2, v4}, Lcom/google/android/gms/internal/ads/zzgr;->zza([BII[Z)I

    move-result v4

    if-ne v4, v2, :cond_2

    iget-boolean v4, v0, Lcom/google/android/gms/internal/ads/zzaoh;->zzk:Z

    if-nez v4, :cond_0

    iget-object v4, v0, Lcom/google/android/gms/internal/ads/zzaoh;->zze:Lcom/google/android/gms/internal/ads/zzaof;

    .line 71
    invoke-virtual {v4, v3, v1, v2}, Lcom/google/android/gms/internal/ads/zzaof;->zza([BII)V

    :cond_0
    iget-object v4, v0, Lcom/google/android/gms/internal/ads/zzaoh;->zzg:Lcom/google/android/gms/internal/ads/zzaog;

    .line 72
    invoke-virtual {v4, v3, v1, v2}, Lcom/google/android/gms/internal/ads/zzaog;->zza([BII)V

    iget-object v4, v0, Lcom/google/android/gms/internal/ads/zzaoh;->zzf:Lcom/google/android/gms/internal/ads/zzaor;

    if-eqz v4, :cond_1

    .line 73
    invoke-virtual {v4, v3, v1, v2}, Lcom/google/android/gms/internal/ads/zzaor;->zza([BII)V

    :cond_1
    return-void

    :cond_2
    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/zzfu;->zzM()[B

    move-result-object v5

    add-int/lit8 v7, v4, 0x3

    .line 5
    aget-byte v5, v5, v7

    and-int/lit16 v5, v5, 0xff

    sub-int v8, v4, v1

    iget-boolean v9, v0, Lcom/google/android/gms/internal/ads/zzaoh;->zzk:Z

    if-nez v9, :cond_e

    if-lez v8, :cond_3

    iget-object v9, v0, Lcom/google/android/gms/internal/ads/zzaoh;->zze:Lcom/google/android/gms/internal/ads/zzaof;

    .line 6
    invoke-virtual {v9, v3, v1, v4}, Lcom/google/android/gms/internal/ads/zzaof;->zza([BII)V

    :cond_3
    if-gez v8, :cond_4

    neg-int v9, v8

    goto :goto_1

    :cond_4
    const/4 v9, 0x0

    :goto_1
    iget-object v12, v0, Lcom/google/android/gms/internal/ads/zzaoh;->zze:Lcom/google/android/gms/internal/ads/zzaof;

    .line 7
    invoke-virtual {v12, v5, v9}, Lcom/google/android/gms/internal/ads/zzaof;->zzc(II)Z

    move-result v9

    if-eqz v9, :cond_e

    iget-object v9, v0, Lcom/google/android/gms/internal/ads/zzaoh;->zzj:Lcom/google/android/gms/internal/ads/zzafa;

    iget-object v12, v0, Lcom/google/android/gms/internal/ads/zzaoh;->zze:Lcom/google/android/gms/internal/ads/zzaof;

    iget v13, v12, Lcom/google/android/gms/internal/ads/zzaof;->zzb:I

    iget-object v14, v0, Lcom/google/android/gms/internal/ads/zzaoh;->zzi:Ljava/lang/String;

    .line 74
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    iget-object v15, v12, Lcom/google/android/gms/internal/ads/zzaof;->zzc:[B

    iget v12, v12, Lcom/google/android/gms/internal/ads/zzaof;->zza:I

    .line 8
    invoke-static {v15, v12}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v12

    new-instance v15, Lcom/google/android/gms/internal/ads/zzft;

    .line 9
    array-length v10, v12

    invoke-direct {v15, v12, v10}, Lcom/google/android/gms/internal/ads/zzft;-><init>([BI)V

    .line 10
    invoke-virtual {v15, v13}, Lcom/google/android/gms/internal/ads/zzft;->zzn(I)V

    const/4 v10, 0x4

    .line 11
    invoke-virtual {v15, v10}, Lcom/google/android/gms/internal/ads/zzft;->zzn(I)V

    .line 12
    invoke-virtual {v15}, Lcom/google/android/gms/internal/ads/zzft;->zzl()V

    const/16 v13, 0x8

    .line 13
    invoke-virtual {v15, v13}, Lcom/google/android/gms/internal/ads/zzft;->zzm(I)V

    .line 14
    invoke-virtual {v15}, Lcom/google/android/gms/internal/ads/zzft;->zzo()Z

    move-result v16

    const/4 v11, 0x3

    if-eqz v16, :cond_5

    .line 15
    invoke-virtual {v15, v10}, Lcom/google/android/gms/internal/ads/zzft;->zzm(I)V

    .line 16
    invoke-virtual {v15, v11}, Lcom/google/android/gms/internal/ads/zzft;->zzm(I)V

    .line 17
    :cond_5
    invoke-virtual {v15, v10}, Lcom/google/android/gms/internal/ads/zzft;->zzd(I)I

    move-result v10

    const/high16 v16, 0x3f800000    # 1.0f

    const-string v11, "Invalid aspect ratio"

    const-string v13, "H263Reader"

    const/16 v6, 0xf

    if-ne v10, v6, :cond_7

    const/16 v6, 0x8

    .line 18
    invoke-virtual {v15, v6}, Lcom/google/android/gms/internal/ads/zzft;->zzd(I)I

    move-result v10

    .line 19
    invoke-virtual {v15, v6}, Lcom/google/android/gms/internal/ads/zzft;->zzd(I)I

    move-result v6

    if-nez v6, :cond_6

    .line 20
    invoke-static {v13, v11}, Lcom/google/android/gms/internal/ads/zzfk;->zzf(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_2

    :cond_6
    int-to-float v10, v10

    int-to-float v6, v6

    div-float v16, v10, v6

    goto :goto_2

    :cond_7
    const/4 v6, 0x7

    if-ge v10, v6, :cond_8

    .line 45
    sget-object v6, Lcom/google/android/gms/internal/ads/zzaoh;->zza:[F

    .line 21
    aget v16, v6, v10

    goto :goto_2

    .line 22
    :cond_8
    invoke-static {v13, v11}, Lcom/google/android/gms/internal/ads/zzfk;->zzf(Ljava/lang/String;Ljava/lang/String;)V

    :goto_2
    move/from16 v6, v16

    .line 23
    invoke-virtual {v15}, Lcom/google/android/gms/internal/ads/zzft;->zzo()Z

    move-result v10

    const/4 v11, 0x2

    if-eqz v10, :cond_9

    .line 24
    invoke-virtual {v15, v11}, Lcom/google/android/gms/internal/ads/zzft;->zzm(I)V

    const/4 v10, 0x1

    .line 25
    invoke-virtual {v15, v10}, Lcom/google/android/gms/internal/ads/zzft;->zzm(I)V

    .line 26
    invoke-virtual {v15}, Lcom/google/android/gms/internal/ads/zzft;->zzo()Z

    move-result v10

    if-eqz v10, :cond_9

    const/16 v10, 0xf

    .line 27
    invoke-virtual {v15, v10}, Lcom/google/android/gms/internal/ads/zzft;->zzm(I)V

    .line 28
    invoke-virtual {v15}, Lcom/google/android/gms/internal/ads/zzft;->zzl()V

    .line 29
    invoke-virtual {v15, v10}, Lcom/google/android/gms/internal/ads/zzft;->zzm(I)V

    .line 30
    invoke-virtual {v15}, Lcom/google/android/gms/internal/ads/zzft;->zzl()V

    .line 31
    invoke-virtual {v15, v10}, Lcom/google/android/gms/internal/ads/zzft;->zzm(I)V

    .line 32
    invoke-virtual {v15}, Lcom/google/android/gms/internal/ads/zzft;->zzl()V

    const/4 v11, 0x3

    .line 33
    invoke-virtual {v15, v11}, Lcom/google/android/gms/internal/ads/zzft;->zzm(I)V

    const/16 v11, 0xb

    .line 34
    invoke-virtual {v15, v11}, Lcom/google/android/gms/internal/ads/zzft;->zzm(I)V

    .line 35
    invoke-virtual {v15}, Lcom/google/android/gms/internal/ads/zzft;->zzl()V

    .line 36
    invoke-virtual {v15, v10}, Lcom/google/android/gms/internal/ads/zzft;->zzm(I)V

    .line 37
    invoke-virtual {v15}, Lcom/google/android/gms/internal/ads/zzft;->zzl()V

    const/4 v10, 0x2

    goto :goto_3

    :cond_9
    move v10, v11

    .line 38
    :goto_3
    invoke-virtual {v15, v10}, Lcom/google/android/gms/internal/ads/zzft;->zzd(I)I

    move-result v10

    if-eqz v10, :cond_a

    const-string v10, "Unhandled video object layer shape"

    .line 39
    invoke-static {v13, v10}, Lcom/google/android/gms/internal/ads/zzfk;->zzf(Ljava/lang/String;Ljava/lang/String;)V

    .line 40
    :cond_a
    invoke-virtual {v15}, Lcom/google/android/gms/internal/ads/zzft;->zzl()V

    const/16 v10, 0x10

    .line 41
    invoke-virtual {v15, v10}, Lcom/google/android/gms/internal/ads/zzft;->zzd(I)I

    move-result v10

    .line 42
    invoke-virtual {v15}, Lcom/google/android/gms/internal/ads/zzft;->zzl()V

    .line 43
    invoke-virtual {v15}, Lcom/google/android/gms/internal/ads/zzft;->zzo()Z

    move-result v11

    if-eqz v11, :cond_d

    if-nez v10, :cond_b

    const-string v10, "Invalid vop_increment_time_resolution"

    .line 44
    invoke-static {v13, v10}, Lcom/google/android/gms/internal/ads/zzfk;->zzf(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_5

    :cond_b
    add-int/lit8 v10, v10, -0x1

    const/4 v11, 0x0

    :goto_4
    if-lez v10, :cond_c

    shr-int/lit8 v10, v10, 0x1

    add-int/lit8 v11, v11, 0x1

    goto :goto_4

    .line 45
    :cond_c
    invoke-virtual {v15, v11}, Lcom/google/android/gms/internal/ads/zzft;->zzm(I)V

    .line 46
    :cond_d
    :goto_5
    invoke-virtual {v15}, Lcom/google/android/gms/internal/ads/zzft;->zzl()V

    const/16 v10, 0xd

    .line 47
    invoke-virtual {v15, v10}, Lcom/google/android/gms/internal/ads/zzft;->zzd(I)I

    move-result v11

    .line 48
    invoke-virtual {v15}, Lcom/google/android/gms/internal/ads/zzft;->zzl()V

    .line 49
    invoke-virtual {v15, v10}, Lcom/google/android/gms/internal/ads/zzft;->zzd(I)I

    move-result v10

    .line 50
    invoke-virtual {v15}, Lcom/google/android/gms/internal/ads/zzft;->zzl()V

    .line 51
    invoke-virtual {v15}, Lcom/google/android/gms/internal/ads/zzft;->zzl()V

    new-instance v13, Lcom/google/android/gms/internal/ads/zzal;

    .line 52
    invoke-direct {v13}, Lcom/google/android/gms/internal/ads/zzal;-><init>()V

    .line 53
    invoke-virtual {v13, v14}, Lcom/google/android/gms/internal/ads/zzal;->zzK(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzal;

    const-string v14, "video/mp4v-es"

    .line 54
    invoke-virtual {v13, v14}, Lcom/google/android/gms/internal/ads/zzal;->zzX(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzal;

    .line 55
    invoke-virtual {v13, v11}, Lcom/google/android/gms/internal/ads/zzal;->zzac(I)Lcom/google/android/gms/internal/ads/zzal;

    .line 56
    invoke-virtual {v13, v10}, Lcom/google/android/gms/internal/ads/zzal;->zzI(I)Lcom/google/android/gms/internal/ads/zzal;

    .line 57
    invoke-virtual {v13, v6}, Lcom/google/android/gms/internal/ads/zzal;->zzT(F)Lcom/google/android/gms/internal/ads/zzal;

    .line 58
    invoke-static {v12}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v6

    invoke-virtual {v13, v6}, Lcom/google/android/gms/internal/ads/zzal;->zzL(Ljava/util/List;)Lcom/google/android/gms/internal/ads/zzal;

    .line 59
    invoke-virtual {v13}, Lcom/google/android/gms/internal/ads/zzal;->zzad()Lcom/google/android/gms/internal/ads/zzan;

    move-result-object v6

    .line 60
    invoke-interface {v9, v6}, Lcom/google/android/gms/internal/ads/zzafa;->zzl(Lcom/google/android/gms/internal/ads/zzan;)V

    const/4 v6, 0x1

    iput-boolean v6, v0, Lcom/google/android/gms/internal/ads/zzaoh;->zzk:Z

    :cond_e
    iget-object v6, v0, Lcom/google/android/gms/internal/ads/zzaoh;->zzg:Lcom/google/android/gms/internal/ads/zzaog;

    .line 61
    invoke-virtual {v6, v3, v1, v4}, Lcom/google/android/gms/internal/ads/zzaog;->zza([BII)V

    iget-object v6, v0, Lcom/google/android/gms/internal/ads/zzaoh;->zzf:Lcom/google/android/gms/internal/ads/zzaor;

    if-eqz v6, :cond_12

    if-lez v8, :cond_f

    .line 62
    invoke-virtual {v6, v3, v1, v4}, Lcom/google/android/gms/internal/ads/zzaor;->zza([BII)V

    const/4 v10, 0x0

    goto :goto_6

    :cond_f
    neg-int v10, v8

    :goto_6
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzaoh;->zzf:Lcom/google/android/gms/internal/ads/zzaor;

    .line 63
    invoke-virtual {v1, v10}, Lcom/google/android/gms/internal/ads/zzaor;->zzd(I)Z

    move-result v1

    if-eqz v1, :cond_10

    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzaoh;->zzf:Lcom/google/android/gms/internal/ads/zzaor;

    .line 64
    iget-object v6, v1, Lcom/google/android/gms/internal/ads/zzaor;->zza:[B

    iget v1, v1, Lcom/google/android/gms/internal/ads/zzaor;->zzb:I

    invoke-static {v6, v1}, Lcom/google/android/gms/internal/ads/zzgr;->zzb([BI)I

    move-result v1

    iget-object v6, v0, Lcom/google/android/gms/internal/ads/zzaoh;->zzc:Lcom/google/android/gms/internal/ads/zzfu;

    .line 65
    sget v8, Lcom/google/android/gms/internal/ads/zzgd;->zza:I

    iget-object v8, v0, Lcom/google/android/gms/internal/ads/zzaoh;->zzf:Lcom/google/android/gms/internal/ads/zzaor;

    iget-object v8, v8, Lcom/google/android/gms/internal/ads/zzaor;->zza:[B

    invoke-virtual {v6, v8, v1}, Lcom/google/android/gms/internal/ads/zzfu;->zzI([BI)V

    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzaoh;->zzb:Lcom/google/android/gms/internal/ads/zzapr;

    iget-wide v8, v0, Lcom/google/android/gms/internal/ads/zzaoh;->zzl:J

    iget-object v6, v0, Lcom/google/android/gms/internal/ads/zzaoh;->zzc:Lcom/google/android/gms/internal/ads/zzfu;

    .line 66
    invoke-virtual {v1, v8, v9, v6}, Lcom/google/android/gms/internal/ads/zzapr;->zza(JLcom/google/android/gms/internal/ads/zzfu;)V

    :cond_10
    const/16 v1, 0xb2

    if-ne v5, v1, :cond_12

    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/zzfu;->zzM()[B

    move-result-object v5

    add-int/lit8 v6, v4, 0x2

    .line 67
    aget-byte v5, v5, v6

    const/4 v6, 0x1

    if-ne v5, v6, :cond_11

    iget-object v5, v0, Lcom/google/android/gms/internal/ads/zzaoh;->zzf:Lcom/google/android/gms/internal/ads/zzaor;

    .line 68
    invoke-virtual {v5, v1}, Lcom/google/android/gms/internal/ads/zzaor;->zzc(I)V

    :cond_11
    move v5, v1

    :cond_12
    sub-int v1, v2, v4

    iget-wide v8, v0, Lcom/google/android/gms/internal/ads/zzaoh;->zzh:J

    int-to-long v10, v1

    sub-long/2addr v8, v10

    iget-object v4, v0, Lcom/google/android/gms/internal/ads/zzaoh;->zzg:Lcom/google/android/gms/internal/ads/zzaog;

    iget-boolean v6, v0, Lcom/google/android/gms/internal/ads/zzaoh;->zzk:Z

    .line 69
    invoke-virtual {v4, v8, v9, v1, v6}, Lcom/google/android/gms/internal/ads/zzaog;->zzb(JIZ)V

    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzaoh;->zzg:Lcom/google/android/gms/internal/ads/zzaog;

    iget-wide v8, v0, Lcom/google/android/gms/internal/ads/zzaoh;->zzl:J

    .line 70
    invoke-virtual {v1, v5, v8, v9}, Lcom/google/android/gms/internal/ads/zzaog;->zzc(IJ)V

    move-object/from16 v6, p1

    move v1, v7

    goto/16 :goto_0
.end method

.method public final zzb(Lcom/google/android/gms/internal/ads/zzadx;Lcom/google/android/gms/internal/ads/zzapo;)V
    .locals 2

    .line 1
    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/zzapo;->zzc()V

    .line 2
    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/zzapo;->zzb()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzaoh;->zzi:Ljava/lang/String;

    .line 3
    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/zzapo;->zza()I

    move-result v0

    const/4 v1, 0x2

    invoke-interface {p1, v0, v1}, Lcom/google/android/gms/internal/ads/zzadx;->zzw(II)Lcom/google/android/gms/internal/ads/zzafa;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzaoh;->zzj:Lcom/google/android/gms/internal/ads/zzafa;

    new-instance v0, Lcom/google/android/gms/internal/ads/zzaog;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzaoh;->zzj:Lcom/google/android/gms/internal/ads/zzafa;

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/zzaog;-><init>(Lcom/google/android/gms/internal/ads/zzafa;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzaoh;->zzg:Lcom/google/android/gms/internal/ads/zzaog;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzaoh;->zzb:Lcom/google/android/gms/internal/ads/zzapr;

    if-eqz v0, :cond_0

    .line 4
    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/ads/zzapr;->zzb(Lcom/google/android/gms/internal/ads/zzadx;Lcom/google/android/gms/internal/ads/zzapo;)V

    :cond_0
    return-void
.end method

.method public final zzc()V
    .locals 0

    return-void
.end method

.method public final zzd(JI)V
    .locals 0

    iput-wide p1, p0, Lcom/google/android/gms/internal/ads/zzaoh;->zzl:J

    return-void
.end method

.method public final zze()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzaoh;->zzd:[Z

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzgr;->zzf([Z)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzaoh;->zze:Lcom/google/android/gms/internal/ads/zzaof;

    .line 2
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzaof;->zzb()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzaoh;->zzg:Lcom/google/android/gms/internal/ads/zzaog;

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzaog;->zzd()V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzaoh;->zzf:Lcom/google/android/gms/internal/ads/zzaor;

    if-eqz v0, :cond_1

    .line 4
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzaor;->zzb()V

    :cond_1
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/zzaoh;->zzh:J

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/zzaoh;->zzl:J

    return-void
.end method
