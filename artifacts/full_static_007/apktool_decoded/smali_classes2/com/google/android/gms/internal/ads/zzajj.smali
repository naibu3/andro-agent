.class final Lcom/google/android/gms/internal/ads/zzajj;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@23.2.0"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzaji;


# instance fields
.field private final zza:[J

.field private final zzb:[J

.field private final zzc:J

.field private final zzd:J

.field private final zze:I


# direct methods
.method private constructor <init>([J[JJJI)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzajj;->zza:[J

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzajj;->zzb:[J

    iput-wide p3, p0, Lcom/google/android/gms/internal/ads/zzajj;->zzc:J

    iput-wide p5, p0, Lcom/google/android/gms/internal/ads/zzajj;->zzd:J

    iput p7, p0, Lcom/google/android/gms/internal/ads/zzajj;->zze:I

    return-void
.end method

.method public static zzb(JJLcom/google/android/gms/internal/ads/zzaen;Lcom/google/android/gms/internal/ads/zzfu;)Lcom/google/android/gms/internal/ads/zzajj;
    .locals 19

    move-wide/from16 v0, p0

    move-object/from16 v2, p4

    move-object/from16 v3, p5

    const/16 v4, 0xa

    .line 1
    invoke-virtual {v3, v4}, Lcom/google/android/gms/internal/ads/zzfu;->zzL(I)V

    .line 2
    invoke-virtual/range {p5 .. p5}, Lcom/google/android/gms/internal/ads/zzfu;->zzg()I

    move-result v4

    if-gtz v4, :cond_0

    goto :goto_2

    :cond_0
    iget v5, v2, Lcom/google/android/gms/internal/ads/zzaen;->zzd:I

    const/16 v6, 0x7d00

    if-lt v5, v6, :cond_1

    const/16 v6, 0x480

    goto :goto_0

    :cond_1
    const/16 v6, 0x240

    :goto_0
    int-to-long v6, v6

    const-wide/32 v8, 0xf4240

    mul-long v12, v6, v8

    int-to-long v14, v5

    int-to-long v10, v4

    .line 3
    sget-object v16, Ljava/math/RoundingMode;->FLOOR:Ljava/math/RoundingMode;

    .line 4
    invoke-static/range {v10 .. v16}, Lcom/google/android/gms/internal/ads/zzgd;->zzt(JJJLjava/math/RoundingMode;)J

    move-result-wide v4

    .line 5
    invoke-virtual/range {p5 .. p5}, Lcom/google/android/gms/internal/ads/zzfu;->zzq()I

    move-result v6

    .line 6
    invoke-virtual/range {p5 .. p5}, Lcom/google/android/gms/internal/ads/zzfu;->zzq()I

    move-result v7

    .line 7
    invoke-virtual/range {p5 .. p5}, Lcom/google/android/gms/internal/ads/zzfu;->zzq()I

    move-result v8

    const/4 v9, 0x2

    .line 8
    invoke-virtual {v3, v9}, Lcom/google/android/gms/internal/ads/zzfu;->zzL(I)V

    iget v10, v2, Lcom/google/android/gms/internal/ads/zzaen;->zzc:I

    int-to-long v10, v10

    add-long v10, p2, v10

    new-array v12, v6, [J

    new-array v13, v6, [J

    const/4 v14, 0x0

    move v9, v14

    move-wide/from16 v14, p2

    :goto_1
    if-ge v9, v6, :cond_6

    int-to-long v2, v9

    mul-long/2addr v2, v4

    move-wide/from16 v17, v4

    int-to-long v4, v6

    .line 9
    div-long/2addr v2, v4

    aput-wide v2, v12, v9

    .line 10
    invoke-static {v14, v15, v10, v11}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v2

    aput-wide v2, v13, v9

    const/4 v2, 0x1

    if-eq v8, v2, :cond_5

    const/4 v2, 0x2

    if-eq v8, v2, :cond_4

    const/4 v3, 0x3

    if-eq v8, v3, :cond_3

    const/4 v3, 0x4

    if-eq v8, v3, :cond_2

    :goto_2
    const/4 v0, 0x0

    return-object v0

    .line 11
    :cond_2
    invoke-virtual/range {p5 .. p5}, Lcom/google/android/gms/internal/ads/zzfu;->zzp()I

    move-result v3

    goto :goto_3

    .line 12
    :cond_3
    invoke-virtual/range {p5 .. p5}, Lcom/google/android/gms/internal/ads/zzfu;->zzo()I

    move-result v3

    goto :goto_3

    .line 13
    :cond_4
    invoke-virtual/range {p5 .. p5}, Lcom/google/android/gms/internal/ads/zzfu;->zzq()I

    move-result v3

    goto :goto_3

    :cond_5
    const/4 v2, 0x2

    .line 14
    invoke-virtual/range {p5 .. p5}, Lcom/google/android/gms/internal/ads/zzfu;->zzm()I

    move-result v3

    :goto_3
    int-to-long v4, v7

    int-to-long v2, v3

    mul-long/2addr v2, v4

    add-long/2addr v14, v2

    add-int/lit8 v9, v9, 0x1

    move-object/from16 v2, p4

    move-object/from16 v3, p5

    move-wide/from16 v4, v17

    goto :goto_1

    :cond_6
    move-wide/from16 v17, v4

    const-wide/16 v2, -0x1

    cmp-long v2, v0, v2

    if-eqz v2, :cond_7

    cmp-long v2, v0, v14

    if-eqz v2, :cond_7

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "VBRI data size mismatch: "

    .line 15
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ", "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v14, v15}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "VbriSeeker"

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/ads/zzfk;->zzf(Ljava/lang/String;Ljava/lang/String;)V

    :cond_7
    new-instance v8, Lcom/google/android/gms/internal/ads/zzajj;

    move-object/from16 v0, p4

    iget v7, v0, Lcom/google/android/gms/internal/ads/zzaen;->zzf:I

    move-object v0, v8

    move-object v1, v12

    move-object v2, v13

    move-wide/from16 v3, v17

    move-wide v5, v14

    invoke-direct/range {v0 .. v7}, Lcom/google/android/gms/internal/ads/zzajj;-><init>([J[JJJI)V

    return-object v8
.end method


# virtual methods
.method public final zza()J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/zzajj;->zzc:J

    return-wide v0
.end method

.method public final zzc()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzajj;->zze:I

    return v0
.end method

.method public final zzd()J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/zzajj;->zzd:J

    return-wide v0
.end method

.method public final zze(J)J
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzajj;->zzb:[J

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzajj;->zza:[J

    const/4 v2, 0x1

    invoke-static {v0, p1, p2, v2, v2}, Lcom/google/android/gms/internal/ads/zzgd;->zzc([JJZZ)I

    move-result p1

    aget-wide p1, v1, p1

    return-wide p1
.end method

.method public final zzg(J)Lcom/google/android/gms/internal/ads/zzaer;
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzajj;->zza:[J

    const/4 v1, 0x1

    invoke-static {v0, p1, p2, v1, v1}, Lcom/google/android/gms/internal/ads/zzgd;->zzc([JJZZ)I

    move-result v2

    new-instance v3, Lcom/google/android/gms/internal/ads/zzaeu;

    .line 2
    aget-wide v4, v0, v2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzajj;->zzb:[J

    aget-wide v6, v0, v2

    invoke-direct {v3, v4, v5, v6, v7}, Lcom/google/android/gms/internal/ads/zzaeu;-><init>(JJ)V

    iget-wide v4, v3, Lcom/google/android/gms/internal/ads/zzaeu;->zzb:J

    cmp-long p1, v4, p1

    if-gez p1, :cond_1

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzajj;->zza:[J

    array-length p2, p1

    add-int/lit8 p2, p2, -0x1

    if-ne v2, p2, :cond_0

    goto :goto_0

    :cond_0
    add-int/2addr v2, v1

    new-instance p2, Lcom/google/android/gms/internal/ads/zzaeu;

    .line 3
    aget-wide v0, p1, v2

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzajj;->zzb:[J

    aget-wide v4, p1, v2

    invoke-direct {p2, v0, v1, v4, v5}, Lcom/google/android/gms/internal/ads/zzaeu;-><init>(JJ)V

    new-instance p1, Lcom/google/android/gms/internal/ads/zzaer;

    invoke-direct {p1, v3, p2}, Lcom/google/android/gms/internal/ads/zzaer;-><init>(Lcom/google/android/gms/internal/ads/zzaeu;Lcom/google/android/gms/internal/ads/zzaeu;)V

    return-object p1

    .line 2
    :cond_1
    :goto_0
    new-instance p1, Lcom/google/android/gms/internal/ads/zzaer;

    invoke-direct {p1, v3, v3}, Lcom/google/android/gms/internal/ads/zzaer;-><init>(Lcom/google/android/gms/internal/ads/zzaeu;Lcom/google/android/gms/internal/ads/zzaeu;)V

    return-object p1
.end method

.method public final zzh()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
