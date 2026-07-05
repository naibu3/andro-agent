.class public final Lcom/google/android/gms/internal/ads/zzaoq;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@23.2.0"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzaoc;


# instance fields
.field private final zza:Lcom/google/android/gms/internal/ads/zzfu;

.field private final zzb:Lcom/google/android/gms/internal/ads/zzaen;

.field private final zzc:Ljava/lang/String;

.field private final zzd:I

.field private zze:Lcom/google/android/gms/internal/ads/zzafa;

.field private zzf:Ljava/lang/String;

.field private zzg:I

.field private zzh:I

.field private zzi:Z

.field private zzj:Z

.field private zzk:J

.field private zzl:I

.field private zzm:J


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    throw v0
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzaoq;->zzg:I

    new-instance v1, Lcom/google/android/gms/internal/ads/zzfu;

    const/4 v2, 0x4

    invoke-direct {v1, v2}, Lcom/google/android/gms/internal/ads/zzfu;-><init>(I)V

    iput-object v1, p0, Lcom/google/android/gms/internal/ads/zzaoq;->zza:Lcom/google/android/gms/internal/ads/zzfu;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzfu;->zzM()[B

    move-result-object v1

    const/4 v2, -0x1

    .line 2
    aput-byte v2, v1, v0

    new-instance v0, Lcom/google/android/gms/internal/ads/zzaen;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzaen;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzaoq;->zzb:Lcom/google/android/gms/internal/ads/zzaen;

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/zzaoq;->zzm:J

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzaoq;->zzc:Ljava/lang/String;

    iput p2, p0, Lcom/google/android/gms/internal/ads/zzaoq;->zzd:I

    return-void
.end method


# virtual methods
.method public final zza(Lcom/google/android/gms/internal/ads/zzfu;)V
    .locals 11

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzaoq;->zze:Lcom/google/android/gms/internal/ads/zzafa;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzeq;->zzb(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    :goto_0
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzfu;->zzb()I

    move-result v0

    if-lez v0, :cond_a

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzaoq;->zzg:I

    const/4 v1, 0x2

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v0, :cond_5

    if-eq v0, v2, :cond_2

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzfu;->zzb()I

    move-result v0

    iget v1, p0, Lcom/google/android/gms/internal/ads/zzaoq;->zzl:I

    iget v4, p0, Lcom/google/android/gms/internal/ads/zzaoq;->zzh:I

    sub-int/2addr v1, v4

    .line 23
    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzaoq;->zze:Lcom/google/android/gms/internal/ads/zzafa;

    .line 24
    invoke-interface {v1, p1, v0}, Lcom/google/android/gms/internal/ads/zzafa;->zzq(Lcom/google/android/gms/internal/ads/zzfu;I)V

    iget v1, p0, Lcom/google/android/gms/internal/ads/zzaoq;->zzh:I

    add-int/2addr v1, v0

    iput v1, p0, Lcom/google/android/gms/internal/ads/zzaoq;->zzh:I

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzaoq;->zzl:I

    if-lt v1, v0, :cond_0

    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/zzaoq;->zzm:J

    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v0, v0, v4

    if-eqz v0, :cond_1

    goto :goto_1

    :cond_1
    move v2, v3

    .line 25
    :goto_1
    invoke-static {v2}, Lcom/google/android/gms/internal/ads/zzeq;->zzf(Z)V

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/zzaoq;->zze:Lcom/google/android/gms/internal/ads/zzafa;

    iget-wide v5, p0, Lcom/google/android/gms/internal/ads/zzaoq;->zzm:J

    iget v8, p0, Lcom/google/android/gms/internal/ads/zzaoq;->zzl:I

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v7, 0x1

    .line 26
    invoke-interface/range {v4 .. v10}, Lcom/google/android/gms/internal/ads/zzafa;->zzs(JIIILcom/google/android/gms/internal/ads/zzaez;)V

    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/zzaoq;->zzm:J

    iget-wide v4, p0, Lcom/google/android/gms/internal/ads/zzaoq;->zzk:J

    add-long/2addr v0, v4

    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/zzaoq;->zzm:J

    iput v3, p0, Lcom/google/android/gms/internal/ads/zzaoq;->zzh:I

    iput v3, p0, Lcom/google/android/gms/internal/ads/zzaoq;->zzg:I

    goto :goto_0

    .line 5
    :cond_2
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzfu;->zzb()I

    move-result v0

    iget v4, p0, Lcom/google/android/gms/internal/ads/zzaoq;->zzh:I

    const/4 v5, 0x4

    rsub-int/lit8 v4, v4, 0x4

    .line 6
    invoke-static {v0, v4}, Ljava/lang/Math;->min(II)I

    move-result v0

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/zzaoq;->zza:Lcom/google/android/gms/internal/ads/zzfu;

    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/zzfu;->zzM()[B

    move-result-object v4

    iget v6, p0, Lcom/google/android/gms/internal/ads/zzaoq;->zzh:I

    .line 7
    invoke-virtual {p1, v4, v6, v0}, Lcom/google/android/gms/internal/ads/zzfu;->zzG([BII)V

    iget v4, p0, Lcom/google/android/gms/internal/ads/zzaoq;->zzh:I

    add-int/2addr v4, v0

    iput v4, p0, Lcom/google/android/gms/internal/ads/zzaoq;->zzh:I

    if-lt v4, v5, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzaoq;->zza:Lcom/google/android/gms/internal/ads/zzfu;

    .line 8
    invoke-virtual {v0, v3}, Lcom/google/android/gms/internal/ads/zzfu;->zzK(I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzaoq;->zzb:Lcom/google/android/gms/internal/ads/zzaen;

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/zzaoq;->zza:Lcom/google/android/gms/internal/ads/zzfu;

    .line 9
    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/zzfu;->zzg()I

    move-result v4

    invoke-virtual {v0, v4}, Lcom/google/android/gms/internal/ads/zzaen;->zza(I)Z

    move-result v0

    if-nez v0, :cond_3

    iput v3, p0, Lcom/google/android/gms/internal/ads/zzaoq;->zzh:I

    iput v2, p0, Lcom/google/android/gms/internal/ads/zzaoq;->zzg:I

    goto/16 :goto_0

    :cond_3
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzaoq;->zzb:Lcom/google/android/gms/internal/ads/zzaen;

    iget v4, v0, Lcom/google/android/gms/internal/ads/zzaen;->zzc:I

    iput v4, p0, Lcom/google/android/gms/internal/ads/zzaoq;->zzl:I

    iget-boolean v4, p0, Lcom/google/android/gms/internal/ads/zzaoq;->zzi:Z

    if-nez v4, :cond_4

    iget v4, v0, Lcom/google/android/gms/internal/ads/zzaen;->zzg:I

    int-to-long v6, v4

    iget v0, v0, Lcom/google/android/gms/internal/ads/zzaen;->zzd:I

    const-wide/32 v8, 0xf4240

    mul-long/2addr v6, v8

    int-to-long v8, v0

    .line 10
    div-long/2addr v6, v8

    iput-wide v6, p0, Lcom/google/android/gms/internal/ads/zzaoq;->zzk:J

    new-instance v0, Lcom/google/android/gms/internal/ads/zzal;

    .line 11
    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzal;-><init>()V

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/zzaoq;->zzf:Ljava/lang/String;

    .line 12
    invoke-virtual {v0, v4}, Lcom/google/android/gms/internal/ads/zzal;->zzK(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzal;

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/zzaoq;->zzb:Lcom/google/android/gms/internal/ads/zzaen;

    iget-object v4, v4, Lcom/google/android/gms/internal/ads/zzaen;->zzb:Ljava/lang/String;

    .line 13
    invoke-virtual {v0, v4}, Lcom/google/android/gms/internal/ads/zzal;->zzX(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzal;

    const/16 v4, 0x1000

    .line 14
    invoke-virtual {v0, v4}, Lcom/google/android/gms/internal/ads/zzal;->zzP(I)Lcom/google/android/gms/internal/ads/zzal;

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/zzaoq;->zzb:Lcom/google/android/gms/internal/ads/zzaen;

    iget v4, v4, Lcom/google/android/gms/internal/ads/zzaen;->zze:I

    .line 15
    invoke-virtual {v0, v4}, Lcom/google/android/gms/internal/ads/zzal;->zzy(I)Lcom/google/android/gms/internal/ads/zzal;

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/zzaoq;->zzb:Lcom/google/android/gms/internal/ads/zzaen;

    iget v4, v4, Lcom/google/android/gms/internal/ads/zzaen;->zzd:I

    .line 16
    invoke-virtual {v0, v4}, Lcom/google/android/gms/internal/ads/zzal;->zzY(I)Lcom/google/android/gms/internal/ads/zzal;

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/zzaoq;->zzc:Ljava/lang/String;

    .line 17
    invoke-virtual {v0, v4}, Lcom/google/android/gms/internal/ads/zzal;->zzO(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzal;

    iget v4, p0, Lcom/google/android/gms/internal/ads/zzaoq;->zzd:I

    .line 18
    invoke-virtual {v0, v4}, Lcom/google/android/gms/internal/ads/zzal;->zzV(I)Lcom/google/android/gms/internal/ads/zzal;

    .line 19
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzal;->zzad()Lcom/google/android/gms/internal/ads/zzan;

    move-result-object v0

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/zzaoq;->zze:Lcom/google/android/gms/internal/ads/zzafa;

    .line 20
    invoke-interface {v4, v0}, Lcom/google/android/gms/internal/ads/zzafa;->zzl(Lcom/google/android/gms/internal/ads/zzan;)V

    iput-boolean v2, p0, Lcom/google/android/gms/internal/ads/zzaoq;->zzi:Z

    :cond_4
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzaoq;->zza:Lcom/google/android/gms/internal/ads/zzfu;

    .line 21
    invoke-virtual {v0, v3}, Lcom/google/android/gms/internal/ads/zzfu;->zzK(I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzaoq;->zze:Lcom/google/android/gms/internal/ads/zzafa;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzaoq;->zza:Lcom/google/android/gms/internal/ads/zzfu;

    .line 22
    invoke-interface {v0, v2, v5}, Lcom/google/android/gms/internal/ads/zzafa;->zzq(Lcom/google/android/gms/internal/ads/zzfu;I)V

    iput v1, p0, Lcom/google/android/gms/internal/ads/zzaoq;->zzg:I

    goto/16 :goto_0

    .line 26
    :cond_5
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzfu;->zzM()[B

    move-result-object v0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzfu;->zzd()I

    move-result v4

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzfu;->zze()I

    move-result v5

    :goto_2
    if-ge v4, v5, :cond_9

    add-int/lit8 v6, v4, 0x1

    .line 2
    aget-byte v7, v0, v4

    and-int/lit16 v8, v7, 0xff

    const/16 v9, 0xff

    if-ne v8, v9, :cond_6

    move v8, v2

    goto :goto_3

    :cond_6
    move v8, v3

    :goto_3
    iget-boolean v9, p0, Lcom/google/android/gms/internal/ads/zzaoq;->zzj:Z

    if-eqz v9, :cond_7

    and-int/lit16 v7, v7, 0xe0

    const/16 v9, 0xe0

    if-ne v7, v9, :cond_7

    move v7, v2

    goto :goto_4

    :cond_7
    move v7, v3

    :goto_4
    iput-boolean v8, p0, Lcom/google/android/gms/internal/ads/zzaoq;->zzj:Z

    if-eqz v7, :cond_8

    .line 3
    invoke-virtual {p1, v6}, Lcom/google/android/gms/internal/ads/zzfu;->zzK(I)V

    iput-boolean v3, p0, Lcom/google/android/gms/internal/ads/zzaoq;->zzj:Z

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzaoq;->zza:Lcom/google/android/gms/internal/ads/zzfu;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzfu;->zzM()[B

    move-result-object v3

    .line 4
    aget-byte v0, v0, v4

    aput-byte v0, v3, v2

    iput v1, p0, Lcom/google/android/gms/internal/ads/zzaoq;->zzh:I

    iput v2, p0, Lcom/google/android/gms/internal/ads/zzaoq;->zzg:I

    goto/16 :goto_0

    :cond_8
    move v4, v6

    goto :goto_2

    .line 5
    :cond_9
    invoke-virtual {p1, v5}, Lcom/google/android/gms/internal/ads/zzfu;->zzK(I)V

    goto/16 :goto_0

    :cond_a
    return-void
.end method

.method public final zzb(Lcom/google/android/gms/internal/ads/zzadx;Lcom/google/android/gms/internal/ads/zzapo;)V
    .locals 1

    .line 1
    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/zzapo;->zzc()V

    .line 2
    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/zzapo;->zzb()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzaoq;->zzf:Ljava/lang/String;

    .line 3
    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/zzapo;->zza()I

    move-result p2

    const/4 v0, 0x1

    invoke-interface {p1, p2, v0}, Lcom/google/android/gms/internal/ads/zzadx;->zzw(II)Lcom/google/android/gms/internal/ads/zzafa;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzaoq;->zze:Lcom/google/android/gms/internal/ads/zzafa;

    return-void
.end method

.method public final zzc()V
    .locals 0

    return-void
.end method

.method public final zzd(JI)V
    .locals 0

    iput-wide p1, p0, Lcom/google/android/gms/internal/ads/zzaoq;->zzm:J

    return-void
.end method

.method public final zze()V
    .locals 2

    const/4 v0, 0x0

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzaoq;->zzg:I

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzaoq;->zzh:I

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzaoq;->zzj:Z

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/zzaoq;->zzm:J

    return-void
.end method
