.class final Lcom/google/android/gms/internal/ads/zzlq;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@23.2.0"


# instance fields
.field public final zza:Lcom/google/android/gms/internal/ads/zzvm;

.field public final zzb:Ljava/lang/Object;

.field public final zzc:[Lcom/google/android/gms/internal/ads/zzxf;

.field public zzd:Z

.field public zze:Z

.field public zzf:Lcom/google/android/gms/internal/ads/zzlr;

.field public zzg:Z

.field private final zzh:[Z

.field private final zzi:[Lcom/google/android/gms/internal/ads/zzmp;

.field private final zzj:Lcom/google/android/gms/internal/ads/zzzm;

.field private final zzk:Lcom/google/android/gms/internal/ads/zzmf;

.field private zzl:Lcom/google/android/gms/internal/ads/zzlq;

.field private zzm:Lcom/google/android/gms/internal/ads/zzxr;

.field private zzn:Lcom/google/android/gms/internal/ads/zzzn;

.field private zzo:J


# direct methods
.method public constructor <init>([Lcom/google/android/gms/internal/ads/zzmp;JLcom/google/android/gms/internal/ads/zzzm;Lcom/google/android/gms/internal/ads/zzzv;Lcom/google/android/gms/internal/ads/zzmf;Lcom/google/android/gms/internal/ads/zzlr;Lcom/google/android/gms/internal/ads/zzzn;)V
    .locals 7

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzlq;->zzi:[Lcom/google/android/gms/internal/ads/zzmp;

    iput-wide p2, p0, Lcom/google/android/gms/internal/ads/zzlq;->zzo:J

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/zzlq;->zzj:Lcom/google/android/gms/internal/ads/zzzm;

    iput-object p6, p0, Lcom/google/android/gms/internal/ads/zzlq;->zzk:Lcom/google/android/gms/internal/ads/zzmf;

    iget-object p1, p7, Lcom/google/android/gms/internal/ads/zzlr;->zza:Lcom/google/android/gms/internal/ads/zzvo;

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/zzvo;->zza:Ljava/lang/Object;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzlq;->zzb:Ljava/lang/Object;

    iput-object p7, p0, Lcom/google/android/gms/internal/ads/zzlq;->zzf:Lcom/google/android/gms/internal/ads/zzlr;

    sget-object p1, Lcom/google/android/gms/internal/ads/zzxr;->zza:Lcom/google/android/gms/internal/ads/zzxr;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzlq;->zzm:Lcom/google/android/gms/internal/ads/zzxr;

    iput-object p8, p0, Lcom/google/android/gms/internal/ads/zzlq;->zzn:Lcom/google/android/gms/internal/ads/zzzn;

    const/4 p1, 0x2

    new-array p2, p1, [Lcom/google/android/gms/internal/ads/zzxf;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzlq;->zzc:[Lcom/google/android/gms/internal/ads/zzxf;

    new-array p1, p1, [Z

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzlq;->zzh:[Z

    iget-object p1, p7, Lcom/google/android/gms/internal/ads/zzlr;->zza:Lcom/google/android/gms/internal/ads/zzvo;

    iget-wide p2, p7, Lcom/google/android/gms/internal/ads/zzlr;->zzb:J

    iget-wide v5, p7, Lcom/google/android/gms/internal/ads/zzlr;->zzd:J

    .line 2
    invoke-virtual {p6, p1, p5, p2, p3}, Lcom/google/android/gms/internal/ads/zzmf;->zzp(Lcom/google/android/gms/internal/ads/zzvo;Lcom/google/android/gms/internal/ads/zzzv;J)Lcom/google/android/gms/internal/ads/zzvm;

    move-result-object v1

    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long p1, v5, p1

    if-eqz p1, :cond_0

    new-instance p1, Lcom/google/android/gms/internal/ads/zzus;

    const/4 v2, 0x1

    const-wide/16 v3, 0x0

    move-object v0, p1

    invoke-direct/range {v0 .. v6}, Lcom/google/android/gms/internal/ads/zzus;-><init>(Lcom/google/android/gms/internal/ads/zzvm;ZJJ)V

    move-object v1, p1

    :cond_0
    iput-object v1, p0, Lcom/google/android/gms/internal/ads/zzlq;->zza:Lcom/google/android/gms/internal/ads/zzvm;

    return-void
.end method

.method private final zzs()V
    .locals 3

    .line 1
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzlq;->zzu()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzlq;->zzn:Lcom/google/android/gms/internal/ads/zzzn;

    iget v2, v1, Lcom/google/android/gms/internal/ads/zzzn;->zza:I

    if-ge v0, v2, :cond_0

    .line 2
    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/zzzn;->zzb(I)Z

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzlq;->zzn:Lcom/google/android/gms/internal/ads/zzzn;

    .line 3
    iget-object v1, v1, Lcom/google/android/gms/internal/ads/zzzn;->zzc:[Lcom/google/android/gms/internal/ads/zzzg;

    aget-object v1, v1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method private final zzt()V
    .locals 3

    .line 1
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzlq;->zzu()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzlq;->zzn:Lcom/google/android/gms/internal/ads/zzzn;

    iget v2, v1, Lcom/google/android/gms/internal/ads/zzzn;->zza:I

    if-ge v0, v2, :cond_0

    .line 2
    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/zzzn;->zzb(I)Z

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzlq;->zzn:Lcom/google/android/gms/internal/ads/zzzn;

    .line 3
    iget-object v1, v1, Lcom/google/android/gms/internal/ads/zzzn;->zzc:[Lcom/google/android/gms/internal/ads/zzzg;

    aget-object v1, v1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method private final zzu()Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzlq;->zzl:Lcom/google/android/gms/internal/ads/zzlq;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method


# virtual methods
.method public final zza(Lcom/google/android/gms/internal/ads/zzzn;JZ)J
    .locals 6

    const/4 p4, 0x2

    .line 1
    new-array v5, p4, [Z

    const/4 v4, 0x0

    move-object v0, p0

    move-object v1, p1

    move-wide v2, p2

    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/ads/zzlq;->zzb(Lcom/google/android/gms/internal/ads/zzzn;JZ[Z)J

    move-result-wide p1

    return-wide p1
.end method

.method public final zzb(Lcom/google/android/gms/internal/ads/zzzn;JZ[Z)J
    .locals 14

    move-object v0, p0

    move-object v1, p1

    const/4 v2, 0x0

    move v3, v2

    .line 1
    :goto_0
    iget v4, v1, Lcom/google/android/gms/internal/ads/zzzn;->zza:I

    const/4 v5, 0x1

    if-ge v3, v4, :cond_1

    iget-object v4, v0, Lcom/google/android/gms/internal/ads/zzlq;->zzh:[Z

    if-nez p4, :cond_0

    iget-object v6, v0, Lcom/google/android/gms/internal/ads/zzlq;->zzn:Lcom/google/android/gms/internal/ads/zzzn;

    invoke-virtual {p1, v6, v3}, Lcom/google/android/gms/internal/ads/zzzn;->zza(Lcom/google/android/gms/internal/ads/zzzn;I)Z

    move-result v6

    if-eqz v6, :cond_0

    goto :goto_1

    :cond_0
    move v5, v2

    :goto_1
    aput-boolean v5, v4, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    move v3, v2

    :goto_2
    iget-object v4, v0, Lcom/google/android/gms/internal/ads/zzlq;->zzi:[Lcom/google/android/gms/internal/ads/zzmp;

    const/4 v6, 0x2

    if-ge v3, v6, :cond_2

    .line 2
    aget-object v4, v4, v3

    invoke-interface {v4}, Lcom/google/android/gms/internal/ads/zzmp;->zzb()I

    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    .line 3
    :cond_2
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzlq;->zzs()V

    iput-object v1, v0, Lcom/google/android/gms/internal/ads/zzlq;->zzn:Lcom/google/android/gms/internal/ads/zzzn;

    .line 4
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzlq;->zzt()V

    iget-object v7, v0, Lcom/google/android/gms/internal/ads/zzlq;->zza:Lcom/google/android/gms/internal/ads/zzvm;

    iget-object v8, v1, Lcom/google/android/gms/internal/ads/zzzn;->zzc:[Lcom/google/android/gms/internal/ads/zzzg;

    iget-object v9, v0, Lcom/google/android/gms/internal/ads/zzlq;->zzh:[Z

    iget-object v10, v0, Lcom/google/android/gms/internal/ads/zzlq;->zzc:[Lcom/google/android/gms/internal/ads/zzxf;

    move-object/from16 v11, p5

    move-wide/from16 v12, p2

    .line 5
    invoke-interface/range {v7 .. v13}, Lcom/google/android/gms/internal/ads/zzvm;->zzf([Lcom/google/android/gms/internal/ads/zzzg;[Z[Lcom/google/android/gms/internal/ads/zzxf;[ZJ)J

    move-result-wide v3

    move v7, v2

    :goto_3
    iget-object v8, v0, Lcom/google/android/gms/internal/ads/zzlq;->zzi:[Lcom/google/android/gms/internal/ads/zzmp;

    if-ge v7, v6, :cond_3

    .line 6
    aget-object v8, v8, v7

    invoke-interface {v8}, Lcom/google/android/gms/internal/ads/zzmp;->zzb()I

    add-int/lit8 v7, v7, 0x1

    goto :goto_3

    :cond_3
    iput-boolean v2, v0, Lcom/google/android/gms/internal/ads/zzlq;->zze:Z

    move v7, v2

    :goto_4
    iget-object v8, v0, Lcom/google/android/gms/internal/ads/zzlq;->zzc:[Lcom/google/android/gms/internal/ads/zzxf;

    if-ge v7, v6, :cond_6

    aget-object v8, v8, v7

    if-eqz v8, :cond_4

    .line 7
    invoke-virtual {p1, v7}, Lcom/google/android/gms/internal/ads/zzzn;->zzb(I)Z

    move-result v8

    invoke-static {v8}, Lcom/google/android/gms/internal/ads/zzeq;->zzf(Z)V

    iget-object v8, v0, Lcom/google/android/gms/internal/ads/zzlq;->zzi:[Lcom/google/android/gms/internal/ads/zzmp;

    aget-object v8, v8, v7

    .line 8
    invoke-interface {v8}, Lcom/google/android/gms/internal/ads/zzmp;->zzb()I

    iput-boolean v5, v0, Lcom/google/android/gms/internal/ads/zzlq;->zze:Z

    goto :goto_6

    :cond_4
    iget-object v8, v1, Lcom/google/android/gms/internal/ads/zzzn;->zzc:[Lcom/google/android/gms/internal/ads/zzzg;

    .line 9
    aget-object v8, v8, v7

    if-nez v8, :cond_5

    move v8, v5

    goto :goto_5

    :cond_5
    move v8, v2

    :goto_5
    invoke-static {v8}, Lcom/google/android/gms/internal/ads/zzeq;->zzf(Z)V

    :goto_6
    add-int/lit8 v7, v7, 0x1

    goto :goto_4

    :cond_6
    return-wide v3
.end method

.method public final zzc()J
    .locals 5

    .line 1
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzlq;->zzd:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzlq;->zzf:Lcom/google/android/gms/internal/ads/zzlr;

    iget-wide v0, v0, Lcom/google/android/gms/internal/ads/zzlr;->zzb:J

    return-wide v0

    :cond_0
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzlq;->zze:Z

    const-wide/high16 v1, -0x8000000000000000L

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzlq;->zza:Lcom/google/android/gms/internal/ads/zzvm;

    .line 2
    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzvm;->zzb()J

    move-result-wide v3

    goto :goto_0

    :cond_1
    move-wide v3, v1

    :goto_0
    cmp-long v0, v3, v1

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzlq;->zzf:Lcom/google/android/gms/internal/ads/zzlr;

    .line 3
    iget-wide v0, v0, Lcom/google/android/gms/internal/ads/zzlr;->zze:J

    return-wide v0

    :cond_2
    return-wide v3
.end method

.method public final zzd()J
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzlq;->zzd:Z

    if-nez v0, :cond_0

    const-wide/16 v0, 0x0

    return-wide v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzlq;->zza:Lcom/google/android/gms/internal/ads/zzvm;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzvm;->zzc()J

    move-result-wide v0

    return-wide v0
.end method

.method public final zze()J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/zzlq;->zzo:J

    return-wide v0
.end method

.method public final zzf()J
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzlq;->zzf:Lcom/google/android/gms/internal/ads/zzlr;

    iget-wide v0, v0, Lcom/google/android/gms/internal/ads/zzlr;->zzb:J

    iget-wide v2, p0, Lcom/google/android/gms/internal/ads/zzlq;->zzo:J

    add-long/2addr v0, v2

    return-wide v0
.end method

.method public final zzg()Lcom/google/android/gms/internal/ads/zzlq;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzlq;->zzl:Lcom/google/android/gms/internal/ads/zzlq;

    return-object v0
.end method

.method public final zzh()Lcom/google/android/gms/internal/ads/zzxr;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzlq;->zzm:Lcom/google/android/gms/internal/ads/zzxr;

    return-object v0
.end method

.method public final zzi()Lcom/google/android/gms/internal/ads/zzzn;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzlq;->zzn:Lcom/google/android/gms/internal/ads/zzzn;

    return-object v0
.end method

.method public final zzj(FLcom/google/android/gms/internal/ads/zzdc;)Lcom/google/android/gms/internal/ads/zzzn;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/ads/zzjh;
        }
    .end annotation

    .line 1
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzlq;->zzm:Lcom/google/android/gms/internal/ads/zzxr;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzlq;->zzf:Lcom/google/android/gms/internal/ads/zzlr;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zzlr;->zza:Lcom/google/android/gms/internal/ads/zzvo;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzlq;->zzj:Lcom/google/android/gms/internal/ads/zzzm;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzlq;->zzi:[Lcom/google/android/gms/internal/ads/zzmp;

    invoke-virtual {v1, v2, p1, v0, p2}, Lcom/google/android/gms/internal/ads/zzzm;->zzp([Lcom/google/android/gms/internal/ads/zzmp;Lcom/google/android/gms/internal/ads/zzxr;Lcom/google/android/gms/internal/ads/zzvo;Lcom/google/android/gms/internal/ads/zzdc;)Lcom/google/android/gms/internal/ads/zzzn;

    move-result-object p1

    iget-object p2, p1, Lcom/google/android/gms/internal/ads/zzzn;->zzc:[Lcom/google/android/gms/internal/ads/zzzg;

    .line 2
    array-length v0, p2

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    aget-object v2, p2, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-object p1
.end method

.method public final zzk(JFJ)V
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzlq;->zzu()Z

    move-result v0

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzeq;->zzf(Z)V

    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/zzlq;->zzo:J

    sub-long/2addr p1, v0

    new-instance v0, Lcom/google/android/gms/internal/ads/zzlm;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzlm;-><init>()V

    .line 2
    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/ads/zzlm;->zze(J)Lcom/google/android/gms/internal/ads/zzlm;

    .line 3
    invoke-virtual {v0, p3}, Lcom/google/android/gms/internal/ads/zzlm;->zzf(F)Lcom/google/android/gms/internal/ads/zzlm;

    .line 4
    invoke-virtual {v0, p4, p5}, Lcom/google/android/gms/internal/ads/zzlm;->zzd(J)Lcom/google/android/gms/internal/ads/zzlm;

    new-instance p1, Lcom/google/android/gms/internal/ads/zzlo;

    const/4 p2, 0x0

    invoke-direct {p1, v0, p2}, Lcom/google/android/gms/internal/ads/zzlo;-><init>(Lcom/google/android/gms/internal/ads/zzlm;Lcom/google/android/gms/internal/ads/zzln;)V

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/zzlq;->zza:Lcom/google/android/gms/internal/ads/zzvm;

    .line 5
    invoke-interface {p2, p1}, Lcom/google/android/gms/internal/ads/zzvm;->zzo(Lcom/google/android/gms/internal/ads/zzlo;)Z

    return-void
.end method

.method public final zzl(FLcom/google/android/gms/internal/ads/zzdc;)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/ads/zzjh;
        }
    .end annotation

    const/4 v0, 0x1

    .line 1
    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzlq;->zzd:Z

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzlq;->zza:Lcom/google/android/gms/internal/ads/zzvm;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzvm;->zzh()Lcom/google/android/gms/internal/ads/zzxr;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzlq;->zzm:Lcom/google/android/gms/internal/ads/zzxr;

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/internal/ads/zzlq;->zzj(FLcom/google/android/gms/internal/ads/zzdc;)Lcom/google/android/gms/internal/ads/zzzn;

    move-result-object p1

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/zzlq;->zzf:Lcom/google/android/gms/internal/ads/zzlr;

    .line 3
    iget-wide v0, p2, Lcom/google/android/gms/internal/ads/zzlr;->zzb:J

    .line 4
    iget-wide v2, p2, Lcom/google/android/gms/internal/ads/zzlr;->zze:J

    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long p2, v2, v4

    if-eqz p2, :cond_0

    cmp-long p2, v0, v2

    if-ltz p2, :cond_0

    const-wide/16 v0, -0x1

    add-long/2addr v2, v0

    const-wide/16 v0, 0x0

    .line 5
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v0

    :cond_0
    const/4 p2, 0x0

    .line 6
    invoke-virtual {p0, p1, v0, v1, p2}, Lcom/google/android/gms/internal/ads/zzlq;->zza(Lcom/google/android/gms/internal/ads/zzzn;JZ)J

    move-result-wide p1

    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/zzlq;->zzo:J

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzlq;->zzf:Lcom/google/android/gms/internal/ads/zzlr;

    .line 7
    iget-wide v3, v2, Lcom/google/android/gms/internal/ads/zzlr;->zzb:J

    sub-long/2addr v3, p1

    add-long/2addr v0, v3

    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/zzlq;->zzo:J

    .line 8
    invoke-virtual {v2, p1, p2}, Lcom/google/android/gms/internal/ads/zzlr;->zzb(J)Lcom/google/android/gms/internal/ads/zzlr;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzlq;->zzf:Lcom/google/android/gms/internal/ads/zzlr;

    return-void
.end method

.method public final zzm(J)V
    .locals 3

    .line 1
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzlq;->zzu()Z

    move-result v0

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzeq;->zzf(Z)V

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzlq;->zzd:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzlq;->zza:Lcom/google/android/gms/internal/ads/zzvm;

    iget-wide v1, p0, Lcom/google/android/gms/internal/ads/zzlq;->zzo:J

    sub-long/2addr p1, v1

    .line 2
    invoke-interface {v0, p1, p2}, Lcom/google/android/gms/internal/ads/zzvm;->zzm(J)V

    :cond_0
    return-void
.end method

.method public final zzn()V
    .locals 3

    .line 1
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzlq;->zzs()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzlq;->zza:Lcom/google/android/gms/internal/ads/zzvm;

    :try_start_0
    instance-of v1, v0, Lcom/google/android/gms/internal/ads/zzus;
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzlq;->zzk:Lcom/google/android/gms/internal/ads/zzmf;

    if-eqz v1, :cond_0

    .line 2
    :try_start_1
    check-cast v0, Lcom/google/android/gms/internal/ads/zzus;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zzus;->zza:Lcom/google/android/gms/internal/ads/zzvm;

    invoke-virtual {v2, v0}, Lcom/google/android/gms/internal/ads/zzmf;->zzi(Lcom/google/android/gms/internal/ads/zzvm;)V

    return-void

    .line 3
    :cond_0
    invoke-virtual {v2, v0}, Lcom/google/android/gms/internal/ads/zzmf;->zzi(Lcom/google/android/gms/internal/ads/zzvm;)V
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0

    return-void

    :catch_0
    move-exception v0

    const-string v1, "MediaPeriodHolder"

    const-string v2, "Period release failed."

    .line 4
    invoke-static {v1, v2, v0}, Lcom/google/android/gms/internal/ads/zzfk;->zzd(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final zzo(Lcom/google/android/gms/internal/ads/zzlq;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzlq;->zzl:Lcom/google/android/gms/internal/ads/zzlq;

    if-ne p1, v0, :cond_0

    return-void

    :cond_0
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzlq;->zzs()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzlq;->zzl:Lcom/google/android/gms/internal/ads/zzlq;

    .line 2
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzlq;->zzt()V

    return-void
.end method

.method public final zzp(J)V
    .locals 0

    const-wide p1, 0xe8d4a51000L

    iput-wide p1, p0, Lcom/google/android/gms/internal/ads/zzlq;->zzo:J

    return-void
.end method

.method public final zzq()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzlq;->zza:Lcom/google/android/gms/internal/ads/zzvm;

    instance-of v1, v0, Lcom/google/android/gms/internal/ads/zzus;

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzlq;->zzf:Lcom/google/android/gms/internal/ads/zzlr;

    iget-wide v1, v1, Lcom/google/android/gms/internal/ads/zzlr;->zzd:J

    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v3, v1, v3

    if-nez v3, :cond_0

    const-wide/high16 v1, -0x8000000000000000L

    .line 2
    :cond_0
    check-cast v0, Lcom/google/android/gms/internal/ads/zzus;

    const-wide/16 v3, 0x0

    invoke-virtual {v0, v3, v4, v1, v2}, Lcom/google/android/gms/internal/ads/zzus;->zzn(JJ)V

    :cond_1
    return-void
.end method

.method public final zzr()Z
    .locals 7

    .line 1
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzlq;->zzd:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzlq;->zze:Z

    const/4 v2, 0x1

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzlq;->zza:Lcom/google/android/gms/internal/ads/zzvm;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzvm;->zzb()J

    move-result-wide v3

    const-wide/high16 v5, -0x8000000000000000L

    cmp-long v0, v3, v5

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    return v2

    :cond_1
    move v1, v2

    :cond_2
    :goto_0
    return v1
.end method
