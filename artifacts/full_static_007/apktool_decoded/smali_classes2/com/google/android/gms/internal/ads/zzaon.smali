.class public final Lcom/google/android/gms/internal/ads/zzaon;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@23.2.0"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzaoc;


# instance fields
.field private final zza:Lcom/google/android/gms/internal/ads/zzapd;

.field private zzb:Ljava/lang/String;

.field private zzc:Lcom/google/android/gms/internal/ads/zzafa;

.field private zzd:Lcom/google/android/gms/internal/ads/zzaom;

.field private zze:Z

.field private final zzf:[Z

.field private final zzg:Lcom/google/android/gms/internal/ads/zzaor;

.field private final zzh:Lcom/google/android/gms/internal/ads/zzaor;

.field private final zzi:Lcom/google/android/gms/internal/ads/zzaor;

.field private final zzj:Lcom/google/android/gms/internal/ads/zzaor;

.field private final zzk:Lcom/google/android/gms/internal/ads/zzaor;

.field private zzl:J

.field private zzm:J

.field private final zzn:Lcom/google/android/gms/internal/ads/zzfu;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/zzapd;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzaon;->zza:Lcom/google/android/gms/internal/ads/zzapd;

    const/4 p1, 0x3

    new-array p1, p1, [Z

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzaon;->zzf:[Z

    new-instance p1, Lcom/google/android/gms/internal/ads/zzaor;

    const/16 v0, 0x20

    const/16 v1, 0x80

    invoke-direct {p1, v0, v1}, Lcom/google/android/gms/internal/ads/zzaor;-><init>(II)V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzaon;->zzg:Lcom/google/android/gms/internal/ads/zzaor;

    new-instance p1, Lcom/google/android/gms/internal/ads/zzaor;

    const/16 v0, 0x21

    .line 2
    invoke-direct {p1, v0, v1}, Lcom/google/android/gms/internal/ads/zzaor;-><init>(II)V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzaon;->zzh:Lcom/google/android/gms/internal/ads/zzaor;

    new-instance p1, Lcom/google/android/gms/internal/ads/zzaor;

    const/16 v0, 0x22

    .line 3
    invoke-direct {p1, v0, v1}, Lcom/google/android/gms/internal/ads/zzaor;-><init>(II)V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzaon;->zzi:Lcom/google/android/gms/internal/ads/zzaor;

    new-instance p1, Lcom/google/android/gms/internal/ads/zzaor;

    const/16 v0, 0x27

    .line 4
    invoke-direct {p1, v0, v1}, Lcom/google/android/gms/internal/ads/zzaor;-><init>(II)V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzaon;->zzj:Lcom/google/android/gms/internal/ads/zzaor;

    new-instance p1, Lcom/google/android/gms/internal/ads/zzaor;

    const/16 v0, 0x28

    .line 5
    invoke-direct {p1, v0, v1}, Lcom/google/android/gms/internal/ads/zzaor;-><init>(II)V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzaon;->zzk:Lcom/google/android/gms/internal/ads/zzaor;

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/zzaon;->zzm:J

    .line 6
    new-instance p1, Lcom/google/android/gms/internal/ads/zzfu;

    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/zzfu;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzaon;->zzn:Lcom/google/android/gms/internal/ads/zzfu;

    return-void
.end method

.method private final zzf([BII)V
    .locals 1
    .annotation runtime Lorg/checkerframework/checker/nullness/qual/RequiresNonNull;
        value = {
            "sampleReader"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzaon;->zzd:Lcom/google/android/gms/internal/ads/zzaom;

    invoke-virtual {v0, p1, p2, p3}, Lcom/google/android/gms/internal/ads/zzaom;->zzb([BII)V

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzaon;->zze:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzaon;->zzg:Lcom/google/android/gms/internal/ads/zzaor;

    .line 2
    invoke-virtual {v0, p1, p2, p3}, Lcom/google/android/gms/internal/ads/zzaor;->zza([BII)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzaon;->zzh:Lcom/google/android/gms/internal/ads/zzaor;

    .line 3
    invoke-virtual {v0, p1, p2, p3}, Lcom/google/android/gms/internal/ads/zzaor;->zza([BII)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzaon;->zzi:Lcom/google/android/gms/internal/ads/zzaor;

    .line 4
    invoke-virtual {v0, p1, p2, p3}, Lcom/google/android/gms/internal/ads/zzaor;->zza([BII)V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzaon;->zzj:Lcom/google/android/gms/internal/ads/zzaor;

    .line 5
    invoke-virtual {v0, p1, p2, p3}, Lcom/google/android/gms/internal/ads/zzaor;->zza([BII)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzaon;->zzk:Lcom/google/android/gms/internal/ads/zzaor;

    .line 6
    invoke-virtual {v0, p1, p2, p3}, Lcom/google/android/gms/internal/ads/zzaor;->zza([BII)V

    return-void
.end method


# virtual methods
.method public final zza(Lcom/google/android/gms/internal/ads/zzfu;)V
    .locals 31

    move-object/from16 v0, p0

    .line 1
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzaon;->zzc:Lcom/google/android/gms/internal/ads/zzafa;

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/zzeq;->zzb(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    sget v1, Lcom/google/android/gms/internal/ads/zzgd;->zza:I

    :cond_0
    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/zzfu;->zzb()I

    move-result v1

    if-lez v1, :cond_8

    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/zzfu;->zzd()I

    move-result v1

    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/zzfu;->zze()I

    move-result v2

    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/zzfu;->zzM()[B

    move-result-object v3

    iget-wide v4, v0, Lcom/google/android/gms/internal/ads/zzaon;->zzl:J

    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/zzfu;->zzb()I

    move-result v6

    int-to-long v6, v6

    add-long/2addr v4, v6

    iput-wide v4, v0, Lcom/google/android/gms/internal/ads/zzaon;->zzl:J

    iget-object v4, v0, Lcom/google/android/gms/internal/ads/zzaon;->zzc:Lcom/google/android/gms/internal/ads/zzafa;

    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/zzfu;->zzb()I

    move-result v5

    move-object/from16 v6, p1

    .line 3
    invoke-interface {v4, v6, v5}, Lcom/google/android/gms/internal/ads/zzafa;->zzq(Lcom/google/android/gms/internal/ads/zzfu;I)V

    :goto_0
    if-ge v1, v2, :cond_0

    iget-object v4, v0, Lcom/google/android/gms/internal/ads/zzaon;->zzf:[Z

    .line 4
    invoke-static {v3, v1, v2, v4}, Lcom/google/android/gms/internal/ads/zzgr;->zza([BII[Z)I

    move-result v4

    if-eq v4, v2, :cond_7

    add-int/lit8 v5, v4, 0x3

    .line 5
    aget-byte v7, v3, v5

    and-int/lit8 v7, v7, 0x7e

    sub-int v8, v4, v1

    if-lez v8, :cond_1

    .line 6
    invoke-direct {v0, v3, v1, v4}, Lcom/google/android/gms/internal/ads/zzaon;->zzf([BII)V

    :cond_1
    sub-int v12, v2, v4

    iget-wide v9, v0, Lcom/google/android/gms/internal/ads/zzaon;->zzl:J

    int-to-long v13, v12

    sub-long v10, v9, v13

    if-gez v8, :cond_2

    neg-int v4, v8

    goto :goto_1

    :cond_2
    const/4 v4, 0x0

    :goto_1
    iget-wide v8, v0, Lcom/google/android/gms/internal/ads/zzaon;->zzm:J

    iget-object v13, v0, Lcom/google/android/gms/internal/ads/zzaon;->zzd:Lcom/google/android/gms/internal/ads/zzaom;

    iget-boolean v14, v0, Lcom/google/android/gms/internal/ads/zzaon;->zze:Z

    .line 7
    invoke-virtual {v13, v10, v11, v12, v14}, Lcom/google/android/gms/internal/ads/zzaom;->zza(JIZ)V

    iget-boolean v13, v0, Lcom/google/android/gms/internal/ads/zzaon;->zze:Z

    if-nez v13, :cond_3

    iget-object v13, v0, Lcom/google/android/gms/internal/ads/zzaon;->zzg:Lcom/google/android/gms/internal/ads/zzaor;

    .line 8
    invoke-virtual {v13, v4}, Lcom/google/android/gms/internal/ads/zzaor;->zzd(I)Z

    iget-object v13, v0, Lcom/google/android/gms/internal/ads/zzaon;->zzh:Lcom/google/android/gms/internal/ads/zzaor;

    .line 9
    invoke-virtual {v13, v4}, Lcom/google/android/gms/internal/ads/zzaor;->zzd(I)Z

    iget-object v13, v0, Lcom/google/android/gms/internal/ads/zzaon;->zzi:Lcom/google/android/gms/internal/ads/zzaor;

    .line 10
    invoke-virtual {v13, v4}, Lcom/google/android/gms/internal/ads/zzaor;->zzd(I)Z

    iget-object v13, v0, Lcom/google/android/gms/internal/ads/zzaon;->zzg:Lcom/google/android/gms/internal/ads/zzaor;

    invoke-virtual {v13}, Lcom/google/android/gms/internal/ads/zzaor;->zze()Z

    move-result v16

    if-eqz v16, :cond_3

    iget-object v14, v0, Lcom/google/android/gms/internal/ads/zzaon;->zzh:Lcom/google/android/gms/internal/ads/zzaor;

    invoke-virtual {v14}, Lcom/google/android/gms/internal/ads/zzaor;->zze()Z

    move-result v17

    if-eqz v17, :cond_3

    iget-object v15, v0, Lcom/google/android/gms/internal/ads/zzaon;->zzi:Lcom/google/android/gms/internal/ads/zzaor;

    invoke-virtual {v15}, Lcom/google/android/gms/internal/ads/zzaor;->zze()Z

    move-result v18

    if-eqz v18, :cond_3

    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzaon;->zzc:Lcom/google/android/gms/internal/ads/zzafa;

    move/from16 v19, v5

    iget-object v5, v0, Lcom/google/android/gms/internal/ads/zzaon;->zzb:Ljava/lang/String;

    iget v6, v13, Lcom/google/android/gms/internal/ads/zzaor;->zzb:I

    move/from16 v20, v2

    iget v2, v14, Lcom/google/android/gms/internal/ads/zzaor;->zzb:I

    add-int/2addr v2, v6

    move-object/from16 v21, v3

    iget v3, v15, Lcom/google/android/gms/internal/ads/zzaor;->zzb:I

    add-int/2addr v2, v3

    .line 11
    new-array v2, v2, [B

    iget-object v3, v13, Lcom/google/android/gms/internal/ads/zzaor;->zza:[B

    move/from16 v22, v12

    const/4 v12, 0x0

    .line 12
    invoke-static {v3, v12, v2, v12, v6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-object v3, v14, Lcom/google/android/gms/internal/ads/zzaor;->zza:[B

    iget v6, v13, Lcom/google/android/gms/internal/ads/zzaor;->zzb:I

    move-wide/from16 v23, v10

    iget v10, v14, Lcom/google/android/gms/internal/ads/zzaor;->zzb:I

    .line 13
    invoke-static {v3, v12, v2, v6, v10}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-object v3, v15, Lcom/google/android/gms/internal/ads/zzaor;->zza:[B

    iget v6, v13, Lcom/google/android/gms/internal/ads/zzaor;->zzb:I

    iget v10, v14, Lcom/google/android/gms/internal/ads/zzaor;->zzb:I

    add-int/2addr v6, v10

    iget v10, v15, Lcom/google/android/gms/internal/ads/zzaor;->zzb:I

    .line 14
    invoke-static {v3, v12, v2, v6, v10}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-object v3, v14, Lcom/google/android/gms/internal/ads/zzaor;->zza:[B

    iget v6, v14, Lcom/google/android/gms/internal/ads/zzaor;->zzb:I

    const/4 v10, 0x5

    .line 15
    invoke-static {v3, v10, v6}, Lcom/google/android/gms/internal/ads/zzgr;->zzc([BII)Lcom/google/android/gms/internal/ads/zzgo;

    move-result-object v3

    iget v6, v3, Lcom/google/android/gms/internal/ads/zzgo;->zza:I

    iget-boolean v10, v3, Lcom/google/android/gms/internal/ads/zzgo;->zzb:Z

    iget v11, v3, Lcom/google/android/gms/internal/ads/zzgo;->zzc:I

    iget v12, v3, Lcom/google/android/gms/internal/ads/zzgo;->zzd:I

    iget-object v13, v3, Lcom/google/android/gms/internal/ads/zzgo;->zzg:[I

    iget v14, v3, Lcom/google/android/gms/internal/ads/zzgo;->zzh:I

    move/from16 v25, v6

    move/from16 v26, v10

    move/from16 v27, v11

    move/from16 v28, v12

    move-object/from16 v29, v13

    move/from16 v30, v14

    .line 16
    invoke-static/range {v25 .. v30}, Lcom/google/android/gms/internal/ads/zzes;->zzb(IZII[II)Ljava/lang/String;

    move-result-object v6

    new-instance v10, Lcom/google/android/gms/internal/ads/zzal;

    .line 17
    invoke-direct {v10}, Lcom/google/android/gms/internal/ads/zzal;-><init>()V

    .line 18
    invoke-virtual {v10, v5}, Lcom/google/android/gms/internal/ads/zzal;->zzK(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzal;

    const-string v5, "video/hevc"

    .line 19
    invoke-virtual {v10, v5}, Lcom/google/android/gms/internal/ads/zzal;->zzX(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzal;

    .line 20
    invoke-virtual {v10, v6}, Lcom/google/android/gms/internal/ads/zzal;->zzz(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzal;

    iget v5, v3, Lcom/google/android/gms/internal/ads/zzgo;->zzi:I

    .line 21
    invoke-virtual {v10, v5}, Lcom/google/android/gms/internal/ads/zzal;->zzac(I)Lcom/google/android/gms/internal/ads/zzal;

    iget v5, v3, Lcom/google/android/gms/internal/ads/zzgo;->zzj:I

    .line 22
    invoke-virtual {v10, v5}, Lcom/google/android/gms/internal/ads/zzal;->zzI(I)Lcom/google/android/gms/internal/ads/zzal;

    new-instance v5, Lcom/google/android/gms/internal/ads/zzr;

    invoke-direct {v5}, Lcom/google/android/gms/internal/ads/zzr;-><init>()V

    iget v6, v3, Lcom/google/android/gms/internal/ads/zzgo;->zzl:I

    .line 23
    invoke-virtual {v5, v6}, Lcom/google/android/gms/internal/ads/zzr;->zzc(I)Lcom/google/android/gms/internal/ads/zzr;

    iget v6, v3, Lcom/google/android/gms/internal/ads/zzgo;->zzm:I

    .line 24
    invoke-virtual {v5, v6}, Lcom/google/android/gms/internal/ads/zzr;->zzb(I)Lcom/google/android/gms/internal/ads/zzr;

    iget v6, v3, Lcom/google/android/gms/internal/ads/zzgo;->zzn:I

    .line 25
    invoke-virtual {v5, v6}, Lcom/google/android/gms/internal/ads/zzr;->zzd(I)Lcom/google/android/gms/internal/ads/zzr;

    iget v6, v3, Lcom/google/android/gms/internal/ads/zzgo;->zze:I

    add-int/lit8 v6, v6, 0x8

    .line 26
    invoke-virtual {v5, v6}, Lcom/google/android/gms/internal/ads/zzr;->zzf(I)Lcom/google/android/gms/internal/ads/zzr;

    iget v6, v3, Lcom/google/android/gms/internal/ads/zzgo;->zzf:I

    add-int/lit8 v6, v6, 0x8

    .line 27
    invoke-virtual {v5, v6}, Lcom/google/android/gms/internal/ads/zzr;->zza(I)Lcom/google/android/gms/internal/ads/zzr;

    .line 28
    invoke-virtual {v5}, Lcom/google/android/gms/internal/ads/zzr;->zzg()Lcom/google/android/gms/internal/ads/zzt;

    move-result-object v5

    .line 29
    invoke-virtual {v10, v5}, Lcom/google/android/gms/internal/ads/zzal;->zzA(Lcom/google/android/gms/internal/ads/zzt;)Lcom/google/android/gms/internal/ads/zzal;

    iget v3, v3, Lcom/google/android/gms/internal/ads/zzgo;->zzk:F

    .line 30
    invoke-virtual {v10, v3}, Lcom/google/android/gms/internal/ads/zzal;->zzT(F)Lcom/google/android/gms/internal/ads/zzal;

    .line 31
    invoke-static {v2}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    invoke-virtual {v10, v2}, Lcom/google/android/gms/internal/ads/zzal;->zzL(Ljava/util/List;)Lcom/google/android/gms/internal/ads/zzal;

    .line 32
    invoke-virtual {v10}, Lcom/google/android/gms/internal/ads/zzal;->zzad()Lcom/google/android/gms/internal/ads/zzan;

    move-result-object v2

    .line 33
    invoke-interface {v1, v2}, Lcom/google/android/gms/internal/ads/zzafa;->zzl(Lcom/google/android/gms/internal/ads/zzan;)V

    const/4 v1, 0x1

    iput-boolean v1, v0, Lcom/google/android/gms/internal/ads/zzaon;->zze:Z

    goto :goto_2

    :cond_3
    move/from16 v20, v2

    move-object/from16 v21, v3

    move/from16 v19, v5

    move-wide/from16 v23, v10

    move/from16 v22, v12

    :goto_2
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzaon;->zzj:Lcom/google/android/gms/internal/ads/zzaor;

    .line 34
    invoke-virtual {v1, v4}, Lcom/google/android/gms/internal/ads/zzaor;->zzd(I)Z

    move-result v1

    if-eqz v1, :cond_4

    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzaon;->zzj:Lcom/google/android/gms/internal/ads/zzaor;

    iget-object v2, v1, Lcom/google/android/gms/internal/ads/zzaor;->zza:[B

    iget v1, v1, Lcom/google/android/gms/internal/ads/zzaor;->zzb:I

    .line 35
    invoke-static {v2, v1}, Lcom/google/android/gms/internal/ads/zzgr;->zzb([BI)I

    move-result v1

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzaon;->zzn:Lcom/google/android/gms/internal/ads/zzfu;

    iget-object v3, v0, Lcom/google/android/gms/internal/ads/zzaon;->zzj:Lcom/google/android/gms/internal/ads/zzaor;

    iget-object v3, v3, Lcom/google/android/gms/internal/ads/zzaor;->zza:[B

    .line 36
    invoke-virtual {v2, v3, v1}, Lcom/google/android/gms/internal/ads/zzfu;->zzI([BI)V

    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzaon;->zzn:Lcom/google/android/gms/internal/ads/zzfu;

    const/4 v2, 0x5

    .line 37
    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ads/zzfu;->zzL(I)V

    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzaon;->zza:Lcom/google/android/gms/internal/ads/zzapd;

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzaon;->zzn:Lcom/google/android/gms/internal/ads/zzfu;

    .line 38
    invoke-virtual {v1, v8, v9, v2}, Lcom/google/android/gms/internal/ads/zzapd;->zza(JLcom/google/android/gms/internal/ads/zzfu;)V

    :cond_4
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzaon;->zzk:Lcom/google/android/gms/internal/ads/zzaor;

    .line 39
    invoke-virtual {v1, v4}, Lcom/google/android/gms/internal/ads/zzaor;->zzd(I)Z

    move-result v1

    if-eqz v1, :cond_5

    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzaon;->zzk:Lcom/google/android/gms/internal/ads/zzaor;

    iget-object v2, v1, Lcom/google/android/gms/internal/ads/zzaor;->zza:[B

    iget v1, v1, Lcom/google/android/gms/internal/ads/zzaor;->zzb:I

    .line 40
    invoke-static {v2, v1}, Lcom/google/android/gms/internal/ads/zzgr;->zzb([BI)I

    move-result v1

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzaon;->zzn:Lcom/google/android/gms/internal/ads/zzfu;

    iget-object v3, v0, Lcom/google/android/gms/internal/ads/zzaon;->zzk:Lcom/google/android/gms/internal/ads/zzaor;

    iget-object v3, v3, Lcom/google/android/gms/internal/ads/zzaor;->zza:[B

    .line 41
    invoke-virtual {v2, v3, v1}, Lcom/google/android/gms/internal/ads/zzfu;->zzI([BI)V

    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzaon;->zzn:Lcom/google/android/gms/internal/ads/zzfu;

    const/4 v2, 0x5

    .line 42
    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ads/zzfu;->zzL(I)V

    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzaon;->zza:Lcom/google/android/gms/internal/ads/zzapd;

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzaon;->zzn:Lcom/google/android/gms/internal/ads/zzfu;

    .line 43
    invoke-virtual {v1, v8, v9, v2}, Lcom/google/android/gms/internal/ads/zzapd;->zza(JLcom/google/android/gms/internal/ads/zzfu;)V

    :cond_5
    const/4 v1, 0x1

    shr-int/lit8 v1, v7, 0x1

    iget-wide v14, v0, Lcom/google/android/gms/internal/ads/zzaon;->zzm:J

    iget-object v9, v0, Lcom/google/android/gms/internal/ads/zzaon;->zzd:Lcom/google/android/gms/internal/ads/zzaom;

    iget-boolean v2, v0, Lcom/google/android/gms/internal/ads/zzaon;->zze:Z

    move-wide/from16 v10, v23

    move/from16 v12, v22

    move v13, v1

    move/from16 v16, v2

    .line 44
    invoke-virtual/range {v9 .. v16}, Lcom/google/android/gms/internal/ads/zzaom;->zzd(JIIJZ)V

    iget-boolean v2, v0, Lcom/google/android/gms/internal/ads/zzaon;->zze:Z

    if-nez v2, :cond_6

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzaon;->zzg:Lcom/google/android/gms/internal/ads/zzaor;

    .line 45
    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/ads/zzaor;->zzc(I)V

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzaon;->zzh:Lcom/google/android/gms/internal/ads/zzaor;

    .line 46
    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/ads/zzaor;->zzc(I)V

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzaon;->zzi:Lcom/google/android/gms/internal/ads/zzaor;

    .line 47
    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/ads/zzaor;->zzc(I)V

    :cond_6
    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzaon;->zzj:Lcom/google/android/gms/internal/ads/zzaor;

    .line 48
    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/ads/zzaor;->zzc(I)V

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzaon;->zzk:Lcom/google/android/gms/internal/ads/zzaor;

    .line 49
    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/ads/zzaor;->zzc(I)V

    move-object/from16 v6, p1

    move/from16 v1, v19

    move/from16 v2, v20

    move-object/from16 v3, v21

    goto/16 :goto_0

    .line 50
    :cond_7
    invoke-direct {v0, v3, v1, v2}, Lcom/google/android/gms/internal/ads/zzaon;->zzf([BII)V

    :cond_8
    return-void
.end method

.method public final zzb(Lcom/google/android/gms/internal/ads/zzadx;Lcom/google/android/gms/internal/ads/zzapo;)V
    .locals 2

    .line 1
    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/zzapo;->zzc()V

    .line 2
    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/zzapo;->zzb()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzaon;->zzb:Ljava/lang/String;

    .line 3
    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/zzapo;->zza()I

    move-result v0

    const/4 v1, 0x2

    invoke-interface {p1, v0, v1}, Lcom/google/android/gms/internal/ads/zzadx;->zzw(II)Lcom/google/android/gms/internal/ads/zzafa;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzaon;->zzc:Lcom/google/android/gms/internal/ads/zzafa;

    new-instance v0, Lcom/google/android/gms/internal/ads/zzaom;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzaon;->zzc:Lcom/google/android/gms/internal/ads/zzafa;

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/zzaom;-><init>(Lcom/google/android/gms/internal/ads/zzafa;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzaon;->zzd:Lcom/google/android/gms/internal/ads/zzaom;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzaon;->zza:Lcom/google/android/gms/internal/ads/zzapd;

    .line 4
    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/ads/zzapd;->zzb(Lcom/google/android/gms/internal/ads/zzadx;Lcom/google/android/gms/internal/ads/zzapo;)V

    return-void
.end method

.method public final zzc()V
    .locals 0

    return-void
.end method

.method public final zzd(JI)V
    .locals 0

    iput-wide p1, p0, Lcom/google/android/gms/internal/ads/zzaon;->zzm:J

    return-void
.end method

.method public final zze()V
    .locals 2

    const-wide/16 v0, 0x0

    .line 1
    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/zzaon;->zzl:J

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/zzaon;->zzm:J

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzaon;->zzf:[Z

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzgr;->zzf([Z)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzaon;->zzg:Lcom/google/android/gms/internal/ads/zzaor;

    .line 2
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzaor;->zzb()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzaon;->zzh:Lcom/google/android/gms/internal/ads/zzaor;

    .line 3
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzaor;->zzb()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzaon;->zzi:Lcom/google/android/gms/internal/ads/zzaor;

    .line 4
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzaor;->zzb()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzaon;->zzj:Lcom/google/android/gms/internal/ads/zzaor;

    .line 5
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzaor;->zzb()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzaon;->zzk:Lcom/google/android/gms/internal/ads/zzaor;

    .line 6
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzaor;->zzb()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzaon;->zzd:Lcom/google/android/gms/internal/ads/zzaom;

    if-eqz v0, :cond_0

    .line 7
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzaom;->zzc()V

    :cond_0
    return-void
.end method
