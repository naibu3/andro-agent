.class final Lcom/google/android/gms/internal/ads/zzhan;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads-lite@@23.2.0"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzhdr;


# instance fields
.field private final zza:Lcom/google/android/gms/internal/ads/zzham;

.field private zzb:I

.field private zzc:I

.field private zzd:I


# direct methods
.method private constructor <init>(Lcom/google/android/gms/internal/ads/zzham;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzhan;->zzd:I

    const-string v0, "input"

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/ads/zzhcb;->zzc(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzhan;->zza:Lcom/google/android/gms/internal/ads/zzham;

    iput-object p0, p1, Lcom/google/android/gms/internal/ads/zzham;->zzc:Lcom/google/android/gms/internal/ads/zzhan;

    return-void
.end method

.method private final zzR(Lcom/google/android/gms/internal/ads/zzhdz;Lcom/google/android/gms/internal/ads/zzhay;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/zzhdz;->zze()Ljava/lang/Object;

    move-result-object v0

    .line 2
    invoke-direct {p0, v0, p1, p2}, Lcom/google/android/gms/internal/ads/zzhan;->zzT(Ljava/lang/Object;Lcom/google/android/gms/internal/ads/zzhdz;Lcom/google/android/gms/internal/ads/zzhay;)V

    .line 3
    invoke-interface {p1, v0}, Lcom/google/android/gms/internal/ads/zzhdz;->zzf(Ljava/lang/Object;)V

    return-object v0
.end method

.method private final zzS(Lcom/google/android/gms/internal/ads/zzhdz;Lcom/google/android/gms/internal/ads/zzhay;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/zzhdz;->zze()Ljava/lang/Object;

    move-result-object v0

    .line 2
    invoke-direct {p0, v0, p1, p2}, Lcom/google/android/gms/internal/ads/zzhan;->zzU(Ljava/lang/Object;Lcom/google/android/gms/internal/ads/zzhdz;Lcom/google/android/gms/internal/ads/zzhay;)V

    .line 3
    invoke-interface {p1, v0}, Lcom/google/android/gms/internal/ads/zzhdz;->zzf(Ljava/lang/Object;)V

    return-object v0
.end method

.method private final zzT(Ljava/lang/Object;Lcom/google/android/gms/internal/ads/zzhdz;Lcom/google/android/gms/internal/ads/zzhay;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget v0, p0, Lcom/google/android/gms/internal/ads/zzhan;->zzc:I

    iget v1, p0, Lcom/google/android/gms/internal/ads/zzhan;->zzb:I

    ushr-int/lit8 v1, v1, 0x3

    shl-int/lit8 v1, v1, 0x3

    or-int/lit8 v1, v1, 0x4

    iput v1, p0, Lcom/google/android/gms/internal/ads/zzhan;->zzc:I

    :try_start_0
    invoke-interface {p2, p1, p0, p3}, Lcom/google/android/gms/internal/ads/zzhdz;->zzh(Ljava/lang/Object;Lcom/google/android/gms/internal/ads/zzhdr;Lcom/google/android/gms/internal/ads/zzhay;)V

    iget p1, p0, Lcom/google/android/gms/internal/ads/zzhan;->zzb:I

    iget p2, p0, Lcom/google/android/gms/internal/ads/zzhan;->zzc:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-ne p1, p2, :cond_0

    .line 3
    iput v0, p0, Lcom/google/android/gms/internal/ads/zzhan;->zzc:I

    return-void

    .line 2
    :cond_0
    :try_start_1
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzhcd;->zzg()Lcom/google/android/gms/internal/ads/zzhcd;

    move-result-object p1

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception p1

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzhan;->zzc:I

    .line 3
    throw p1
.end method

.method private final zzU(Ljava/lang/Object;Lcom/google/android/gms/internal/ads/zzhdz;Lcom/google/android/gms/internal/ads/zzhay;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzhan;->zza:Lcom/google/android/gms/internal/ads/zzham;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzham;->zzn()I

    move-result v1

    iget v2, v0, Lcom/google/android/gms/internal/ads/zzham;->zza:I

    iget v0, v0, Lcom/google/android/gms/internal/ads/zzham;->zzb:I

    if-ge v2, v0, :cond_0

    .line 3
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzhan;->zza:Lcom/google/android/gms/internal/ads/zzham;

    .line 4
    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzham;->zze(I)I

    move-result v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzhan;->zza:Lcom/google/android/gms/internal/ads/zzham;

    iget v2, v1, Lcom/google/android/gms/internal/ads/zzham;->zza:I

    add-int/lit8 v2, v2, 0x1

    iput v2, v1, Lcom/google/android/gms/internal/ads/zzham;->zza:I

    .line 5
    invoke-interface {p2, p1, p0, p3}, Lcom/google/android/gms/internal/ads/zzhdz;->zzh(Ljava/lang/Object;Lcom/google/android/gms/internal/ads/zzhdr;Lcom/google/android/gms/internal/ads/zzhay;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzhan;->zza:Lcom/google/android/gms/internal/ads/zzham;

    const/4 p2, 0x0

    .line 6
    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/ads/zzham;->zzz(I)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzhan;->zza:Lcom/google/android/gms/internal/ads/zzham;

    iget p2, p1, Lcom/google/android/gms/internal/ads/zzham;->zza:I

    add-int/lit8 p2, p2, -0x1

    iput p2, p1, Lcom/google/android/gms/internal/ads/zzham;->zza:I

    .line 7
    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/ads/zzham;->zzA(I)V

    return-void

    .line 1
    :cond_0
    new-instance p1, Lcom/google/android/gms/internal/ads/zzhcd;

    const-string p2, "Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit."

    .line 2
    invoke-direct {p1, p2}, Lcom/google/android/gms/internal/ads/zzhcd;-><init>(Ljava/lang/String;)V

    .line 3
    throw p1
.end method

.method private final zzV(I)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzhan;->zza:Lcom/google/android/gms/internal/ads/zzham;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzham;->zzd()I

    move-result v0

    if-ne v0, p1, :cond_0

    return-void

    :cond_0
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzhcd;->zzj()Lcom/google/android/gms/internal/ads/zzhcd;

    move-result-object p1

    throw p1
.end method

.method private final zzW(I)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget v0, p0, Lcom/google/android/gms/internal/ads/zzhan;->zzb:I

    and-int/lit8 v0, v0, 0x7

    if-ne v0, p1, :cond_0

    return-void

    :cond_0
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzhcd;->zza()Lcom/google/android/gms/internal/ads/zzhcc;

    move-result-object p1

    throw p1
.end method

.method private static final zzX(I)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    and-int/lit8 p0, p0, 0x3

    if-nez p0, :cond_0

    return-void

    .line 1
    :cond_0
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzhcd;->zzg()Lcom/google/android/gms/internal/ads/zzhcd;

    move-result-object p0

    throw p0
.end method

.method private static final zzY(I)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    and-int/lit8 p0, p0, 0x7

    if-nez p0, :cond_0

    return-void

    .line 1
    :cond_0
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzhcd;->zzg()Lcom/google/android/gms/internal/ads/zzhcd;

    move-result-object p0

    throw p0
.end method

.method public static zzq(Lcom/google/android/gms/internal/ads/zzham;)Lcom/google/android/gms/internal/ads/zzhan;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzham;->zzc:Lcom/google/android/gms/internal/ads/zzhan;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Lcom/google/android/gms/internal/ads/zzhan;

    .line 2
    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/ads/zzhan;-><init>(Lcom/google/android/gms/internal/ads/zzham;)V

    return-object v0
.end method


# virtual methods
.method public final zzA(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    instance-of v0, p1, Lcom/google/android/gms/internal/ads/zzhbp;

    const/4 v1, 0x2

    if-eqz v0, :cond_4

    move-object v0, p1

    check-cast v0, Lcom/google/android/gms/internal/ads/zzhbp;

    iget p1, p0, Lcom/google/android/gms/internal/ads/zzhan;->zzb:I

    and-int/lit8 p1, p1, 0x7

    if-eqz p1, :cond_2

    if-ne p1, v1, :cond_1

    .line 7
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzhan;->zza:Lcom/google/android/gms/internal/ads/zzham;

    .line 2
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzham;->zzn()I

    move-result v1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzham;->zzd()I

    move-result p1

    add-int/2addr p1, v1

    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzhan;->zza:Lcom/google/android/gms/internal/ads/zzham;

    .line 3
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzham;->zzf()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzhbp;->zzi(I)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzhan;->zza:Lcom/google/android/gms/internal/ads/zzham;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzham;->zzd()I

    move-result v1

    if-lt v1, p1, :cond_0

    .line 4
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzhan;->zzV(I)V

    return-void

    .line 8
    :cond_1
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzhcd;->zza()Lcom/google/android/gms/internal/ads/zzhcc;

    move-result-object p1

    throw p1

    .line 1
    :cond_2
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzhan;->zza:Lcom/google/android/gms/internal/ads/zzham;

    .line 5
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzham;->zzf()I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/zzhbp;->zzi(I)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzhan;->zza:Lcom/google/android/gms/internal/ads/zzham;

    .line 6
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzham;->zzC()Z

    move-result p1

    if-eqz p1, :cond_3

    goto :goto_1

    :cond_3
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzhan;->zza:Lcom/google/android/gms/internal/ads/zzham;

    .line 7
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzham;->zzm()I

    move-result p1

    iget v1, p0, Lcom/google/android/gms/internal/ads/zzhan;->zzb:I

    if-eq p1, v1, :cond_2

    goto :goto_0

    .line 4
    :cond_4
    iget v0, p0, Lcom/google/android/gms/internal/ads/zzhan;->zzb:I

    and-int/lit8 v0, v0, 0x7

    if-eqz v0, :cond_7

    if-ne v0, v1, :cond_6

    .line 14
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzhan;->zza:Lcom/google/android/gms/internal/ads/zzham;

    .line 9
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzham;->zzn()I

    move-result v1

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzham;->zzd()I

    move-result v0

    add-int/2addr v0, v1

    :cond_5
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzhan;->zza:Lcom/google/android/gms/internal/ads/zzham;

    .line 10
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzham;->zzf()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p1, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzhan;->zza:Lcom/google/android/gms/internal/ads/zzham;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzham;->zzd()I

    move-result v1

    if-lt v1, v0, :cond_5

    .line 11
    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/zzhan;->zzV(I)V

    return-void

    .line 15
    :cond_6
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzhcd;->zza()Lcom/google/android/gms/internal/ads/zzhcc;

    move-result-object p1

    throw p1

    .line 4
    :cond_7
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzhan;->zza:Lcom/google/android/gms/internal/ads/zzham;

    .line 12
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzham;->zzf()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzhan;->zza:Lcom/google/android/gms/internal/ads/zzham;

    .line 13
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzham;->zzC()Z

    move-result v0

    if-nez v0, :cond_8

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzhan;->zza:Lcom/google/android/gms/internal/ads/zzham;

    .line 14
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzham;->zzm()I

    move-result v0

    iget v1, p0, Lcom/google/android/gms/internal/ads/zzhan;->zzb:I

    if-eq v0, v1, :cond_7

    move p1, v0

    .line 7
    :goto_0
    iput p1, p0, Lcom/google/android/gms/internal/ads/zzhan;->zzd:I

    :cond_8
    :goto_1
    return-void
.end method

.method public final zzB(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    instance-of v0, p1, Lcom/google/android/gms/internal/ads/zzhbp;

    const/4 v1, 0x5

    const/4 v2, 0x2

    if-eqz v0, :cond_5

    move-object v0, p1

    check-cast v0, Lcom/google/android/gms/internal/ads/zzhbp;

    iget p1, p0, Lcom/google/android/gms/internal/ads/zzhan;->zzb:I

    and-int/lit8 p1, p1, 0x7

    if-eq p1, v2, :cond_3

    if-ne p1, v1, :cond_2

    :cond_0
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzhan;->zza:Lcom/google/android/gms/internal/ads/zzham;

    .line 2
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzham;->zzg()I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/zzhbp;->zzi(I)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzhan;->zza:Lcom/google/android/gms/internal/ads/zzham;

    .line 3
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzham;->zzC()Z

    move-result p1

    if-eqz p1, :cond_1

    goto/16 :goto_1

    :cond_1
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzhan;->zza:Lcom/google/android/gms/internal/ads/zzham;

    .line 4
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzham;->zzm()I

    move-result p1

    iget v1, p0, Lcom/google/android/gms/internal/ads/zzhan;->zzb:I

    if-eq p1, v1, :cond_0

    goto :goto_0

    .line 8
    :cond_2
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzhcd;->zza()Lcom/google/android/gms/internal/ads/zzhcc;

    move-result-object p1

    throw p1

    .line 4
    :cond_3
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzhan;->zza:Lcom/google/android/gms/internal/ads/zzham;

    .line 5
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzham;->zzn()I

    move-result p1

    .line 6
    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzhan;->zzX(I)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzhan;->zza:Lcom/google/android/gms/internal/ads/zzham;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzham;->zzd()I

    move-result v1

    add-int v3, v1, p1

    :cond_4
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzhan;->zza:Lcom/google/android/gms/internal/ads/zzham;

    .line 7
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzham;->zzg()I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/zzhbp;->zzi(I)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzhan;->zza:Lcom/google/android/gms/internal/ads/zzham;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzham;->zzd()I

    move-result p1

    if-lt p1, v3, :cond_4

    goto :goto_1

    :cond_5
    iget v0, p0, Lcom/google/android/gms/internal/ads/zzhan;->zzb:I

    and-int/lit8 v0, v0, 0x7

    if-eq v0, v2, :cond_8

    if-ne v0, v1, :cond_7

    :cond_6
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzhan;->zza:Lcom/google/android/gms/internal/ads/zzham;

    .line 9
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzham;->zzg()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzhan;->zza:Lcom/google/android/gms/internal/ads/zzham;

    .line 10
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzham;->zzC()Z

    move-result v0

    if-nez v0, :cond_a

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzhan;->zza:Lcom/google/android/gms/internal/ads/zzham;

    .line 11
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzham;->zzm()I

    move-result v0

    iget v1, p0, Lcom/google/android/gms/internal/ads/zzhan;->zzb:I

    if-eq v0, v1, :cond_6

    move p1, v0

    .line 4
    :goto_0
    iput p1, p0, Lcom/google/android/gms/internal/ads/zzhan;->zzd:I

    return-void

    .line 15
    :cond_7
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzhcd;->zza()Lcom/google/android/gms/internal/ads/zzhcc;

    move-result-object p1

    throw p1

    .line 11
    :cond_8
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzhan;->zza:Lcom/google/android/gms/internal/ads/zzham;

    .line 12
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzham;->zzn()I

    move-result v0

    .line 13
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzhan;->zzX(I)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzhan;->zza:Lcom/google/android/gms/internal/ads/zzham;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzham;->zzd()I

    move-result v1

    add-int/2addr v1, v0

    .line 8
    :cond_9
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzhan;->zza:Lcom/google/android/gms/internal/ads/zzham;

    .line 14
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzham;->zzg()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzhan;->zza:Lcom/google/android/gms/internal/ads/zzham;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzham;->zzd()I

    move-result v0

    if-lt v0, v1, :cond_9

    :cond_a
    :goto_1
    return-void
.end method

.method public final zzC(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    instance-of v0, p1, Lcom/google/android/gms/internal/ads/zzhct;

    const/4 v1, 0x2

    const/4 v2, 0x1

    if-eqz v0, :cond_4

    move-object v0, p1

    check-cast v0, Lcom/google/android/gms/internal/ads/zzhct;

    iget p1, p0, Lcom/google/android/gms/internal/ads/zzhan;->zzb:I

    and-int/lit8 p1, p1, 0x7

    if-eq p1, v2, :cond_2

    if-ne p1, v1, :cond_1

    .line 7
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzhan;->zza:Lcom/google/android/gms/internal/ads/zzham;

    .line 2
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzham;->zzn()I

    move-result p1

    .line 3
    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzhan;->zzY(I)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzhan;->zza:Lcom/google/android/gms/internal/ads/zzham;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzham;->zzd()I

    move-result v1

    add-int/2addr v1, p1

    :cond_0
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzhan;->zza:Lcom/google/android/gms/internal/ads/zzham;

    .line 4
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzham;->zzo()J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Lcom/google/android/gms/internal/ads/zzhct;->zzg(J)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzhan;->zza:Lcom/google/android/gms/internal/ads/zzham;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzham;->zzd()I

    move-result p1

    if-lt p1, v1, :cond_0

    goto/16 :goto_1

    .line 8
    :cond_1
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzhcd;->zza()Lcom/google/android/gms/internal/ads/zzhcc;

    move-result-object p1

    throw p1

    .line 1
    :cond_2
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzhan;->zza:Lcom/google/android/gms/internal/ads/zzham;

    .line 5
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzham;->zzo()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ads/zzhct;->zzg(J)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzhan;->zza:Lcom/google/android/gms/internal/ads/zzham;

    .line 6
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzham;->zzC()Z

    move-result p1

    if-eqz p1, :cond_3

    goto :goto_1

    :cond_3
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzhan;->zza:Lcom/google/android/gms/internal/ads/zzham;

    .line 7
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzham;->zzm()I

    move-result p1

    iget v1, p0, Lcom/google/android/gms/internal/ads/zzhan;->zzb:I

    if-eq p1, v1, :cond_2

    goto :goto_0

    .line 4
    :cond_4
    iget v0, p0, Lcom/google/android/gms/internal/ads/zzhan;->zzb:I

    and-int/lit8 v0, v0, 0x7

    if-eq v0, v2, :cond_7

    if-ne v0, v1, :cond_6

    .line 14
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzhan;->zza:Lcom/google/android/gms/internal/ads/zzham;

    .line 9
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzham;->zzn()I

    move-result v0

    .line 10
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzhan;->zzY(I)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzhan;->zza:Lcom/google/android/gms/internal/ads/zzham;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzham;->zzd()I

    move-result v1

    add-int/2addr v1, v0

    .line 8
    :cond_5
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzhan;->zza:Lcom/google/android/gms/internal/ads/zzham;

    .line 11
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzham;->zzo()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzhan;->zza:Lcom/google/android/gms/internal/ads/zzham;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzham;->zzd()I

    move-result v0

    if-lt v0, v1, :cond_5

    goto :goto_1

    .line 15
    :cond_6
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzhcd;->zza()Lcom/google/android/gms/internal/ads/zzhcc;

    move-result-object p1

    throw p1

    .line 4
    :cond_7
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzhan;->zza:Lcom/google/android/gms/internal/ads/zzham;

    .line 12
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzham;->zzo()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzhan;->zza:Lcom/google/android/gms/internal/ads/zzham;

    .line 13
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzham;->zzC()Z

    move-result v0

    if-nez v0, :cond_8

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzhan;->zza:Lcom/google/android/gms/internal/ads/zzham;

    .line 14
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzham;->zzm()I

    move-result v0

    iget v1, p0, Lcom/google/android/gms/internal/ads/zzhan;->zzb:I

    if-eq v0, v1, :cond_7

    move p1, v0

    .line 7
    :goto_0
    iput p1, p0, Lcom/google/android/gms/internal/ads/zzhan;->zzd:I

    :cond_8
    :goto_1
    return-void
.end method

.method public final zzD(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    instance-of v0, p1, Lcom/google/android/gms/internal/ads/zzhbf;

    const/4 v1, 0x5

    const/4 v2, 0x2

    if-eqz v0, :cond_5

    move-object v0, p1

    check-cast v0, Lcom/google/android/gms/internal/ads/zzhbf;

    iget p1, p0, Lcom/google/android/gms/internal/ads/zzhan;->zzb:I

    and-int/lit8 p1, p1, 0x7

    if-eq p1, v2, :cond_3

    if-ne p1, v1, :cond_2

    :cond_0
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzhan;->zza:Lcom/google/android/gms/internal/ads/zzham;

    .line 2
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzham;->zzc()F

    move-result p1

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/zzhbf;->zzh(F)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzhan;->zza:Lcom/google/android/gms/internal/ads/zzham;

    .line 3
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzham;->zzC()Z

    move-result p1

    if-eqz p1, :cond_1

    goto/16 :goto_1

    :cond_1
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzhan;->zza:Lcom/google/android/gms/internal/ads/zzham;

    .line 4
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzham;->zzm()I

    move-result p1

    iget v1, p0, Lcom/google/android/gms/internal/ads/zzhan;->zzb:I

    if-eq p1, v1, :cond_0

    goto :goto_0

    .line 8
    :cond_2
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzhcd;->zza()Lcom/google/android/gms/internal/ads/zzhcc;

    move-result-object p1

    throw p1

    .line 4
    :cond_3
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzhan;->zza:Lcom/google/android/gms/internal/ads/zzham;

    .line 5
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzham;->zzn()I

    move-result p1

    .line 6
    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzhan;->zzX(I)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzhan;->zza:Lcom/google/android/gms/internal/ads/zzham;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzham;->zzd()I

    move-result v1

    add-int v3, v1, p1

    :cond_4
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzhan;->zza:Lcom/google/android/gms/internal/ads/zzham;

    .line 7
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzham;->zzc()F

    move-result p1

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/zzhbf;->zzh(F)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzhan;->zza:Lcom/google/android/gms/internal/ads/zzham;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzham;->zzd()I

    move-result p1

    if-lt p1, v3, :cond_4

    goto :goto_1

    :cond_5
    iget v0, p0, Lcom/google/android/gms/internal/ads/zzhan;->zzb:I

    and-int/lit8 v0, v0, 0x7

    if-eq v0, v2, :cond_8

    if-ne v0, v1, :cond_7

    :cond_6
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzhan;->zza:Lcom/google/android/gms/internal/ads/zzham;

    .line 9
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzham;->zzc()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzhan;->zza:Lcom/google/android/gms/internal/ads/zzham;

    .line 10
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzham;->zzC()Z

    move-result v0

    if-nez v0, :cond_a

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzhan;->zza:Lcom/google/android/gms/internal/ads/zzham;

    .line 11
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzham;->zzm()I

    move-result v0

    iget v1, p0, Lcom/google/android/gms/internal/ads/zzhan;->zzb:I

    if-eq v0, v1, :cond_6

    move p1, v0

    .line 4
    :goto_0
    iput p1, p0, Lcom/google/android/gms/internal/ads/zzhan;->zzd:I

    return-void

    .line 15
    :cond_7
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzhcd;->zza()Lcom/google/android/gms/internal/ads/zzhcc;

    move-result-object p1

    throw p1

    .line 11
    :cond_8
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzhan;->zza:Lcom/google/android/gms/internal/ads/zzham;

    .line 12
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzham;->zzn()I

    move-result v0

    .line 13
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzhan;->zzX(I)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzhan;->zza:Lcom/google/android/gms/internal/ads/zzham;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzham;->zzd()I

    move-result v1

    add-int/2addr v1, v0

    .line 8
    :cond_9
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzhan;->zza:Lcom/google/android/gms/internal/ads/zzham;

    .line 14
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzham;->zzc()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzhan;->zza:Lcom/google/android/gms/internal/ads/zzham;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzham;->zzd()I

    move-result v0

    if-lt v0, v1, :cond_9

    :cond_a
    :goto_1
    return-void
.end method

.method public final zzE(Ljava/util/List;Lcom/google/android/gms/internal/ads/zzhdz;Lcom/google/android/gms/internal/ads/zzhay;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    iget v0, p0, Lcom/google/android/gms/internal/ads/zzhan;->zzb:I

    and-int/lit8 v1, v0, 0x7

    const/4 v2, 0x3

    if-ne v1, v2, :cond_3

    :cond_0
    invoke-direct {p0, p2, p3}, Lcom/google/android/gms/internal/ads/zzhan;->zzR(Lcom/google/android/gms/internal/ads/zzhdz;Lcom/google/android/gms/internal/ads/zzhay;)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {p1, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzhan;->zza:Lcom/google/android/gms/internal/ads/zzham;

    .line 2
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzham;->zzC()Z

    move-result v1

    if-nez v1, :cond_2

    iget v1, p0, Lcom/google/android/gms/internal/ads/zzhan;->zzd:I

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzhan;->zza:Lcom/google/android/gms/internal/ads/zzham;

    .line 3
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzham;->zzm()I

    move-result v1

    if-eq v1, v0, :cond_0

    .line 4
    iput v1, p0, Lcom/google/android/gms/internal/ads/zzhan;->zzd:I

    :cond_2
    :goto_0
    return-void

    :cond_3
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzhcd;->zza()Lcom/google/android/gms/internal/ads/zzhcc;

    move-result-object p1

    throw p1
.end method

.method public final zzF(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    instance-of v0, p1, Lcom/google/android/gms/internal/ads/zzhbp;

    const/4 v1, 0x2

    if-eqz v0, :cond_4

    move-object v0, p1

    check-cast v0, Lcom/google/android/gms/internal/ads/zzhbp;

    iget p1, p0, Lcom/google/android/gms/internal/ads/zzhan;->zzb:I

    and-int/lit8 p1, p1, 0x7

    if-eqz p1, :cond_2

    if-ne p1, v1, :cond_1

    .line 7
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzhan;->zza:Lcom/google/android/gms/internal/ads/zzham;

    .line 2
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzham;->zzn()I

    move-result v1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzham;->zzd()I

    move-result p1

    add-int/2addr p1, v1

    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzhan;->zza:Lcom/google/android/gms/internal/ads/zzham;

    .line 3
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzham;->zzh()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzhbp;->zzi(I)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzhan;->zza:Lcom/google/android/gms/internal/ads/zzham;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzham;->zzd()I

    move-result v1

    if-lt v1, p1, :cond_0

    .line 4
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzhan;->zzV(I)V

    return-void

    .line 8
    :cond_1
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzhcd;->zza()Lcom/google/android/gms/internal/ads/zzhcc;

    move-result-object p1

    throw p1

    .line 1
    :cond_2
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzhan;->zza:Lcom/google/android/gms/internal/ads/zzham;

    .line 5
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzham;->zzh()I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/zzhbp;->zzi(I)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzhan;->zza:Lcom/google/android/gms/internal/ads/zzham;

    .line 6
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzham;->zzC()Z

    move-result p1

    if-eqz p1, :cond_3

    goto :goto_1

    :cond_3
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzhan;->zza:Lcom/google/android/gms/internal/ads/zzham;

    .line 7
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzham;->zzm()I

    move-result p1

    iget v1, p0, Lcom/google/android/gms/internal/ads/zzhan;->zzb:I

    if-eq p1, v1, :cond_2

    goto :goto_0

    .line 4
    :cond_4
    iget v0, p0, Lcom/google/android/gms/internal/ads/zzhan;->zzb:I

    and-int/lit8 v0, v0, 0x7

    if-eqz v0, :cond_7

    if-ne v0, v1, :cond_6

    .line 14
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzhan;->zza:Lcom/google/android/gms/internal/ads/zzham;

    .line 9
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzham;->zzn()I

    move-result v1

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzham;->zzd()I

    move-result v0

    add-int/2addr v0, v1

    :cond_5
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzhan;->zza:Lcom/google/android/gms/internal/ads/zzham;

    .line 10
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzham;->zzh()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p1, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzhan;->zza:Lcom/google/android/gms/internal/ads/zzham;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzham;->zzd()I

    move-result v1

    if-lt v1, v0, :cond_5

    .line 11
    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/zzhan;->zzV(I)V

    return-void

    .line 15
    :cond_6
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzhcd;->zza()Lcom/google/android/gms/internal/ads/zzhcc;

    move-result-object p1

    throw p1

    .line 4
    :cond_7
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzhan;->zza:Lcom/google/android/gms/internal/ads/zzham;

    .line 12
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzham;->zzh()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzhan;->zza:Lcom/google/android/gms/internal/ads/zzham;

    .line 13
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzham;->zzC()Z

    move-result v0

    if-nez v0, :cond_8

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzhan;->zza:Lcom/google/android/gms/internal/ads/zzham;

    .line 14
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzham;->zzm()I

    move-result v0

    iget v1, p0, Lcom/google/android/gms/internal/ads/zzhan;->zzb:I

    if-eq v0, v1, :cond_7

    move p1, v0

    .line 7
    :goto_0
    iput p1, p0, Lcom/google/android/gms/internal/ads/zzhan;->zzd:I

    :cond_8
    :goto_1
    return-void
.end method

.method public final zzG(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    instance-of v0, p1, Lcom/google/android/gms/internal/ads/zzhct;

    const/4 v1, 0x2

    if-eqz v0, :cond_4

    move-object v0, p1

    check-cast v0, Lcom/google/android/gms/internal/ads/zzhct;

    iget p1, p0, Lcom/google/android/gms/internal/ads/zzhan;->zzb:I

    and-int/lit8 p1, p1, 0x7

    if-eqz p1, :cond_2

    if-ne p1, v1, :cond_1

    .line 7
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzhan;->zza:Lcom/google/android/gms/internal/ads/zzham;

    .line 2
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzham;->zzn()I

    move-result v1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzham;->zzd()I

    move-result p1

    add-int/2addr p1, v1

    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzhan;->zza:Lcom/google/android/gms/internal/ads/zzham;

    .line 3
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzham;->zzp()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ads/zzhct;->zzg(J)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzhan;->zza:Lcom/google/android/gms/internal/ads/zzham;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzham;->zzd()I

    move-result v1

    if-lt v1, p1, :cond_0

    .line 4
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzhan;->zzV(I)V

    return-void

    .line 8
    :cond_1
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzhcd;->zza()Lcom/google/android/gms/internal/ads/zzhcc;

    move-result-object p1

    throw p1

    .line 1
    :cond_2
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzhan;->zza:Lcom/google/android/gms/internal/ads/zzham;

    .line 5
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzham;->zzp()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ads/zzhct;->zzg(J)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzhan;->zza:Lcom/google/android/gms/internal/ads/zzham;

    .line 6
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzham;->zzC()Z

    move-result p1

    if-eqz p1, :cond_3

    goto :goto_1

    :cond_3
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzhan;->zza:Lcom/google/android/gms/internal/ads/zzham;

    .line 7
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzham;->zzm()I

    move-result p1

    iget v1, p0, Lcom/google/android/gms/internal/ads/zzhan;->zzb:I

    if-eq p1, v1, :cond_2

    goto :goto_0

    .line 4
    :cond_4
    iget v0, p0, Lcom/google/android/gms/internal/ads/zzhan;->zzb:I

    and-int/lit8 v0, v0, 0x7

    if-eqz v0, :cond_7

    if-ne v0, v1, :cond_6

    .line 14
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzhan;->zza:Lcom/google/android/gms/internal/ads/zzham;

    .line 9
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzham;->zzn()I

    move-result v1

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzham;->zzd()I

    move-result v0

    add-int/2addr v0, v1

    :cond_5
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzhan;->zza:Lcom/google/android/gms/internal/ads/zzham;

    .line 10
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzham;->zzp()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-interface {p1, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzhan;->zza:Lcom/google/android/gms/internal/ads/zzham;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzham;->zzd()I

    move-result v1

    if-lt v1, v0, :cond_5

    .line 11
    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/zzhan;->zzV(I)V

    return-void

    .line 15
    :cond_6
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzhcd;->zza()Lcom/google/android/gms/internal/ads/zzhcc;

    move-result-object p1

    throw p1

    .line 4
    :cond_7
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzhan;->zza:Lcom/google/android/gms/internal/ads/zzham;

    .line 12
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzham;->zzp()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzhan;->zza:Lcom/google/android/gms/internal/ads/zzham;

    .line 13
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzham;->zzC()Z

    move-result v0

    if-nez v0, :cond_8

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzhan;->zza:Lcom/google/android/gms/internal/ads/zzham;

    .line 14
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzham;->zzm()I

    move-result v0

    iget v1, p0, Lcom/google/android/gms/internal/ads/zzhan;->zzb:I

    if-eq v0, v1, :cond_7

    move p1, v0

    .line 7
    :goto_0
    iput p1, p0, Lcom/google/android/gms/internal/ads/zzhan;->zzd:I

    :cond_8
    :goto_1
    return-void
.end method

.method public final zzH(Ljava/util/List;Lcom/google/android/gms/internal/ads/zzhdz;Lcom/google/android/gms/internal/ads/zzhay;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget v0, p0, Lcom/google/android/gms/internal/ads/zzhan;->zzb:I

    and-int/lit8 v1, v0, 0x7

    const/4 v2, 0x2

    if-ne v1, v2, :cond_3

    :cond_0
    invoke-direct {p0, p2, p3}, Lcom/google/android/gms/internal/ads/zzhan;->zzS(Lcom/google/android/gms/internal/ads/zzhdz;Lcom/google/android/gms/internal/ads/zzhay;)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {p1, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzhan;->zza:Lcom/google/android/gms/internal/ads/zzham;

    .line 2
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzham;->zzC()Z

    move-result v1

    if-nez v1, :cond_2

    iget v1, p0, Lcom/google/android/gms/internal/ads/zzhan;->zzd:I

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzhan;->zza:Lcom/google/android/gms/internal/ads/zzham;

    .line 3
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzham;->zzm()I

    move-result v1

    if-eq v1, v0, :cond_0

    .line 4
    iput v1, p0, Lcom/google/android/gms/internal/ads/zzhan;->zzd:I

    :cond_2
    :goto_0
    return-void

    :cond_3
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzhcd;->zza()Lcom/google/android/gms/internal/ads/zzhcc;

    move-result-object p1

    throw p1
.end method

.method public final zzI(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    instance-of v0, p1, Lcom/google/android/gms/internal/ads/zzhbp;

    const/4 v1, 0x5

    const/4 v2, 0x2

    if-eqz v0, :cond_5

    move-object v0, p1

    check-cast v0, Lcom/google/android/gms/internal/ads/zzhbp;

    iget p1, p0, Lcom/google/android/gms/internal/ads/zzhan;->zzb:I

    and-int/lit8 p1, p1, 0x7

    if-eq p1, v2, :cond_3

    if-ne p1, v1, :cond_2

    :cond_0
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzhan;->zza:Lcom/google/android/gms/internal/ads/zzham;

    .line 2
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzham;->zzk()I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/zzhbp;->zzi(I)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzhan;->zza:Lcom/google/android/gms/internal/ads/zzham;

    .line 3
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzham;->zzC()Z

    move-result p1

    if-eqz p1, :cond_1

    goto/16 :goto_1

    :cond_1
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzhan;->zza:Lcom/google/android/gms/internal/ads/zzham;

    .line 4
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzham;->zzm()I

    move-result p1

    iget v1, p0, Lcom/google/android/gms/internal/ads/zzhan;->zzb:I

    if-eq p1, v1, :cond_0

    goto :goto_0

    .line 8
    :cond_2
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzhcd;->zza()Lcom/google/android/gms/internal/ads/zzhcc;

    move-result-object p1

    throw p1

    .line 4
    :cond_3
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzhan;->zza:Lcom/google/android/gms/internal/ads/zzham;

    .line 5
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzham;->zzn()I

    move-result p1

    .line 6
    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzhan;->zzX(I)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzhan;->zza:Lcom/google/android/gms/internal/ads/zzham;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzham;->zzd()I

    move-result v1

    add-int v3, v1, p1

    :cond_4
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzhan;->zza:Lcom/google/android/gms/internal/ads/zzham;

    .line 7
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzham;->zzk()I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/zzhbp;->zzi(I)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzhan;->zza:Lcom/google/android/gms/internal/ads/zzham;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzham;->zzd()I

    move-result p1

    if-lt p1, v3, :cond_4

    goto :goto_1

    :cond_5
    iget v0, p0, Lcom/google/android/gms/internal/ads/zzhan;->zzb:I

    and-int/lit8 v0, v0, 0x7

    if-eq v0, v2, :cond_8

    if-ne v0, v1, :cond_7

    :cond_6
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzhan;->zza:Lcom/google/android/gms/internal/ads/zzham;

    .line 9
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzham;->zzk()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzhan;->zza:Lcom/google/android/gms/internal/ads/zzham;

    .line 10
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzham;->zzC()Z

    move-result v0

    if-nez v0, :cond_a

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzhan;->zza:Lcom/google/android/gms/internal/ads/zzham;

    .line 11
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzham;->zzm()I

    move-result v0

    iget v1, p0, Lcom/google/android/gms/internal/ads/zzhan;->zzb:I

    if-eq v0, v1, :cond_6

    move p1, v0

    .line 4
    :goto_0
    iput p1, p0, Lcom/google/android/gms/internal/ads/zzhan;->zzd:I

    return-void

    .line 15
    :cond_7
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzhcd;->zza()Lcom/google/android/gms/internal/ads/zzhcc;

    move-result-object p1

    throw p1

    .line 11
    :cond_8
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzhan;->zza:Lcom/google/android/gms/internal/ads/zzham;

    .line 12
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzham;->zzn()I

    move-result v0

    .line 13
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzhan;->zzX(I)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzhan;->zza:Lcom/google/android/gms/internal/ads/zzham;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzham;->zzd()I

    move-result v1

    add-int/2addr v1, v0

    .line 8
    :cond_9
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzhan;->zza:Lcom/google/android/gms/internal/ads/zzham;

    .line 14
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzham;->zzk()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzhan;->zza:Lcom/google/android/gms/internal/ads/zzham;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzham;->zzd()I

    move-result v0

    if-lt v0, v1, :cond_9

    :cond_a
    :goto_1
    return-void
.end method

.method public final zzJ(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    instance-of v0, p1, Lcom/google/android/gms/internal/ads/zzhct;

    const/4 v1, 0x2

    const/4 v2, 0x1

    if-eqz v0, :cond_4

    move-object v0, p1

    check-cast v0, Lcom/google/android/gms/internal/ads/zzhct;

    iget p1, p0, Lcom/google/android/gms/internal/ads/zzhan;->zzb:I

    and-int/lit8 p1, p1, 0x7

    if-eq p1, v2, :cond_2

    if-ne p1, v1, :cond_1

    .line 7
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzhan;->zza:Lcom/google/android/gms/internal/ads/zzham;

    .line 2
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzham;->zzn()I

    move-result p1

    .line 3
    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzhan;->zzY(I)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzhan;->zza:Lcom/google/android/gms/internal/ads/zzham;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzham;->zzd()I

    move-result v1

    add-int/2addr v1, p1

    :cond_0
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzhan;->zza:Lcom/google/android/gms/internal/ads/zzham;

    .line 4
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzham;->zzt()J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Lcom/google/android/gms/internal/ads/zzhct;->zzg(J)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzhan;->zza:Lcom/google/android/gms/internal/ads/zzham;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzham;->zzd()I

    move-result p1

    if-lt p1, v1, :cond_0

    goto/16 :goto_1

    .line 8
    :cond_1
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzhcd;->zza()Lcom/google/android/gms/internal/ads/zzhcc;

    move-result-object p1

    throw p1

    .line 1
    :cond_2
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzhan;->zza:Lcom/google/android/gms/internal/ads/zzham;

    .line 5
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzham;->zzt()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ads/zzhct;->zzg(J)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzhan;->zza:Lcom/google/android/gms/internal/ads/zzham;

    .line 6
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzham;->zzC()Z

    move-result p1

    if-eqz p1, :cond_3

    goto :goto_1

    :cond_3
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzhan;->zza:Lcom/google/android/gms/internal/ads/zzham;

    .line 7
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzham;->zzm()I

    move-result p1

    iget v1, p0, Lcom/google/android/gms/internal/ads/zzhan;->zzb:I

    if-eq p1, v1, :cond_2

    goto :goto_0

    .line 4
    :cond_4
    iget v0, p0, Lcom/google/android/gms/internal/ads/zzhan;->zzb:I

    and-int/lit8 v0, v0, 0x7

    if-eq v0, v2, :cond_7

    if-ne v0, v1, :cond_6

    .line 14
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzhan;->zza:Lcom/google/android/gms/internal/ads/zzham;

    .line 9
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzham;->zzn()I

    move-result v0

    .line 10
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzhan;->zzY(I)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzhan;->zza:Lcom/google/android/gms/internal/ads/zzham;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzham;->zzd()I

    move-result v1

    add-int/2addr v1, v0

    .line 8
    :cond_5
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzhan;->zza:Lcom/google/android/gms/internal/ads/zzham;

    .line 11
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzham;->zzt()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzhan;->zza:Lcom/google/android/gms/internal/ads/zzham;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzham;->zzd()I

    move-result v0

    if-lt v0, v1, :cond_5

    goto :goto_1

    .line 15
    :cond_6
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzhcd;->zza()Lcom/google/android/gms/internal/ads/zzhcc;

    move-result-object p1

    throw p1

    .line 4
    :cond_7
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzhan;->zza:Lcom/google/android/gms/internal/ads/zzham;

    .line 12
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzham;->zzt()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzhan;->zza:Lcom/google/android/gms/internal/ads/zzham;

    .line 13
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzham;->zzC()Z

    move-result v0

    if-nez v0, :cond_8

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzhan;->zza:Lcom/google/android/gms/internal/ads/zzham;

    .line 14
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzham;->zzm()I

    move-result v0

    iget v1, p0, Lcom/google/android/gms/internal/ads/zzhan;->zzb:I

    if-eq v0, v1, :cond_7

    move p1, v0

    .line 7
    :goto_0
    iput p1, p0, Lcom/google/android/gms/internal/ads/zzhan;->zzd:I

    :cond_8
    :goto_1
    return-void
.end method

.method public final zzK(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    instance-of v0, p1, Lcom/google/android/gms/internal/ads/zzhbp;

    const/4 v1, 0x2

    if-eqz v0, :cond_4

    move-object v0, p1

    check-cast v0, Lcom/google/android/gms/internal/ads/zzhbp;

    iget p1, p0, Lcom/google/android/gms/internal/ads/zzhan;->zzb:I

    and-int/lit8 p1, p1, 0x7

    if-eqz p1, :cond_2

    if-ne p1, v1, :cond_1

    .line 7
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzhan;->zza:Lcom/google/android/gms/internal/ads/zzham;

    .line 2
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzham;->zzn()I

    move-result v1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzham;->zzd()I

    move-result p1

    add-int/2addr p1, v1

    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzhan;->zza:Lcom/google/android/gms/internal/ads/zzham;

    .line 3
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzham;->zzl()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzhbp;->zzi(I)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzhan;->zza:Lcom/google/android/gms/internal/ads/zzham;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzham;->zzd()I

    move-result v1

    if-lt v1, p1, :cond_0

    .line 4
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzhan;->zzV(I)V

    return-void

    .line 8
    :cond_1
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzhcd;->zza()Lcom/google/android/gms/internal/ads/zzhcc;

    move-result-object p1

    throw p1

    .line 1
    :cond_2
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzhan;->zza:Lcom/google/android/gms/internal/ads/zzham;

    .line 5
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzham;->zzl()I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/zzhbp;->zzi(I)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzhan;->zza:Lcom/google/android/gms/internal/ads/zzham;

    .line 6
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzham;->zzC()Z

    move-result p1

    if-eqz p1, :cond_3

    goto :goto_1

    :cond_3
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzhan;->zza:Lcom/google/android/gms/internal/ads/zzham;

    .line 7
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzham;->zzm()I

    move-result p1

    iget v1, p0, Lcom/google/android/gms/internal/ads/zzhan;->zzb:I

    if-eq p1, v1, :cond_2

    goto :goto_0

    .line 4
    :cond_4
    iget v0, p0, Lcom/google/android/gms/internal/ads/zzhan;->zzb:I

    and-int/lit8 v0, v0, 0x7

    if-eqz v0, :cond_7

    if-ne v0, v1, :cond_6

    .line 14
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzhan;->zza:Lcom/google/android/gms/internal/ads/zzham;

    .line 9
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzham;->zzn()I

    move-result v1

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzham;->zzd()I

    move-result v0

    add-int/2addr v0, v1

    :cond_5
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzhan;->zza:Lcom/google/android/gms/internal/ads/zzham;

    .line 10
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzham;->zzl()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p1, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzhan;->zza:Lcom/google/android/gms/internal/ads/zzham;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzham;->zzd()I

    move-result v1

    if-lt v1, v0, :cond_5

    .line 11
    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/zzhan;->zzV(I)V

    return-void

    .line 15
    :cond_6
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzhcd;->zza()Lcom/google/android/gms/internal/ads/zzhcc;

    move-result-object p1

    throw p1

    .line 4
    :cond_7
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzhan;->zza:Lcom/google/android/gms/internal/ads/zzham;

    .line 12
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzham;->zzl()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzhan;->zza:Lcom/google/android/gms/internal/ads/zzham;

    .line 13
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzham;->zzC()Z

    move-result v0

    if-nez v0, :cond_8

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzhan;->zza:Lcom/google/android/gms/internal/ads/zzham;

    .line 14
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzham;->zzm()I

    move-result v0

    iget v1, p0, Lcom/google/android/gms/internal/ads/zzhan;->zzb:I

    if-eq v0, v1, :cond_7

    move p1, v0

    .line 7
    :goto_0
    iput p1, p0, Lcom/google/android/gms/internal/ads/zzhan;->zzd:I

    :cond_8
    :goto_1
    return-void
.end method

.method public final zzL(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    instance-of v0, p1, Lcom/google/android/gms/internal/ads/zzhct;

    const/4 v1, 0x2

    if-eqz v0, :cond_4

    move-object v0, p1

    check-cast v0, Lcom/google/android/gms/internal/ads/zzhct;

    iget p1, p0, Lcom/google/android/gms/internal/ads/zzhan;->zzb:I

    and-int/lit8 p1, p1, 0x7

    if-eqz p1, :cond_2

    if-ne p1, v1, :cond_1

    .line 7
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzhan;->zza:Lcom/google/android/gms/internal/ads/zzham;

    .line 2
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzham;->zzn()I

    move-result v1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzham;->zzd()I

    move-result p1

    add-int/2addr p1, v1

    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzhan;->zza:Lcom/google/android/gms/internal/ads/zzham;

    .line 3
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzham;->zzu()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ads/zzhct;->zzg(J)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzhan;->zza:Lcom/google/android/gms/internal/ads/zzham;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzham;->zzd()I

    move-result v1

    if-lt v1, p1, :cond_0

    .line 4
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzhan;->zzV(I)V

    return-void

    .line 8
    :cond_1
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzhcd;->zza()Lcom/google/android/gms/internal/ads/zzhcc;

    move-result-object p1

    throw p1

    .line 1
    :cond_2
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzhan;->zza:Lcom/google/android/gms/internal/ads/zzham;

    .line 5
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzham;->zzu()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ads/zzhct;->zzg(J)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzhan;->zza:Lcom/google/android/gms/internal/ads/zzham;

    .line 6
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzham;->zzC()Z

    move-result p1

    if-eqz p1, :cond_3

    goto :goto_1

    :cond_3
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzhan;->zza:Lcom/google/android/gms/internal/ads/zzham;

    .line 7
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzham;->zzm()I

    move-result p1

    iget v1, p0, Lcom/google/android/gms/internal/ads/zzhan;->zzb:I

    if-eq p1, v1, :cond_2

    goto :goto_0

    .line 4
    :cond_4
    iget v0, p0, Lcom/google/android/gms/internal/ads/zzhan;->zzb:I

    and-int/lit8 v0, v0, 0x7

    if-eqz v0, :cond_7

    if-ne v0, v1, :cond_6

    .line 14
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzhan;->zza:Lcom/google/android/gms/internal/ads/zzham;

    .line 9
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzham;->zzn()I

    move-result v1

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzham;->zzd()I

    move-result v0

    add-int/2addr v0, v1

    :cond_5
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzhan;->zza:Lcom/google/android/gms/internal/ads/zzham;

    .line 10
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzham;->zzu()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-interface {p1, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzhan;->zza:Lcom/google/android/gms/internal/ads/zzham;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzham;->zzd()I

    move-result v1

    if-lt v1, v0, :cond_5

    .line 11
    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/zzhan;->zzV(I)V

    return-void

    .line 15
    :cond_6
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzhcd;->zza()Lcom/google/android/gms/internal/ads/zzhcc;

    move-result-object p1

    throw p1

    .line 4
    :cond_7
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzhan;->zza:Lcom/google/android/gms/internal/ads/zzham;

    .line 12
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzham;->zzu()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzhan;->zza:Lcom/google/android/gms/internal/ads/zzham;

    .line 13
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzham;->zzC()Z

    move-result v0

    if-nez v0, :cond_8

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzhan;->zza:Lcom/google/android/gms/internal/ads/zzham;

    .line 14
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzham;->zzm()I

    move-result v0

    iget v1, p0, Lcom/google/android/gms/internal/ads/zzhan;->zzb:I

    if-eq v0, v1, :cond_7

    move p1, v0

    .line 7
    :goto_0
    iput p1, p0, Lcom/google/android/gms/internal/ads/zzhan;->zzd:I

    :cond_8
    :goto_1
    return-void
.end method

.method public final zzM(Ljava/util/List;Z)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget v0, p0, Lcom/google/android/gms/internal/ads/zzhan;->zzb:I

    and-int/lit8 v0, v0, 0x7

    const/4 v1, 0x2

    if-ne v0, v1, :cond_6

    instance-of v0, p1, Lcom/google/android/gms/internal/ads/zzhcm;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    if-nez p2, :cond_2

    .line 5
    check-cast p1, Lcom/google/android/gms/internal/ads/zzhcm;

    .line 6
    :cond_1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzhan;->zzp()Lcom/google/android/gms/internal/ads/zzhac;

    move-result-object p2

    invoke-interface {p1, p2}, Lcom/google/android/gms/internal/ads/zzhcm;->zzi(Lcom/google/android/gms/internal/ads/zzhac;)V

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/zzhan;->zza:Lcom/google/android/gms/internal/ads/zzham;

    .line 7
    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/zzham;->zzC()Z

    move-result p2

    if-nez p2, :cond_4

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/zzhan;->zza:Lcom/google/android/gms/internal/ads/zzham;

    .line 8
    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/zzham;->zzm()I

    move-result p2

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzhan;->zzb:I

    if-eq p2, v0, :cond_1

    goto :goto_2

    :cond_2
    :goto_0
    if-eqz p2, :cond_3

    .line 2
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzhan;->zzu()Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_3
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzhan;->zzt()Ljava/lang/String;

    move-result-object v0

    :goto_1
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzhan;->zza:Lcom/google/android/gms/internal/ads/zzham;

    .line 3
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzham;->zzC()Z

    move-result v0

    if-eqz v0, :cond_5

    :cond_4
    return-void

    :cond_5
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzhan;->zza:Lcom/google/android/gms/internal/ads/zzham;

    .line 4
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzham;->zzm()I

    move-result v0

    iget v1, p0, Lcom/google/android/gms/internal/ads/zzhan;->zzb:I

    if-eq v0, v1, :cond_2

    move p2, v0

    :goto_2
    iput p2, p0, Lcom/google/android/gms/internal/ads/zzhan;->zzd:I

    return-void

    .line 1
    :cond_6
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzhcd;->zza()Lcom/google/android/gms/internal/ads/zzhcc;

    move-result-object p1

    throw p1
.end method

.method public final zzN(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    instance-of v0, p1, Lcom/google/android/gms/internal/ads/zzhbp;

    const/4 v1, 0x2

    if-eqz v0, :cond_4

    move-object v0, p1

    check-cast v0, Lcom/google/android/gms/internal/ads/zzhbp;

    iget p1, p0, Lcom/google/android/gms/internal/ads/zzhan;->zzb:I

    and-int/lit8 p1, p1, 0x7

    if-eqz p1, :cond_2

    if-ne p1, v1, :cond_1

    .line 7
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzhan;->zza:Lcom/google/android/gms/internal/ads/zzham;

    .line 2
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzham;->zzn()I

    move-result v1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzham;->zzd()I

    move-result p1

    add-int/2addr p1, v1

    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzhan;->zza:Lcom/google/android/gms/internal/ads/zzham;

    .line 3
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzham;->zzn()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzhbp;->zzi(I)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzhan;->zza:Lcom/google/android/gms/internal/ads/zzham;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzham;->zzd()I

    move-result v1

    if-lt v1, p1, :cond_0

    .line 4
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzhan;->zzV(I)V

    return-void

    .line 8
    :cond_1
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzhcd;->zza()Lcom/google/android/gms/internal/ads/zzhcc;

    move-result-object p1

    throw p1

    .line 1
    :cond_2
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzhan;->zza:Lcom/google/android/gms/internal/ads/zzham;

    .line 5
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzham;->zzn()I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/zzhbp;->zzi(I)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzhan;->zza:Lcom/google/android/gms/internal/ads/zzham;

    .line 6
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzham;->zzC()Z

    move-result p1

    if-eqz p1, :cond_3

    goto :goto_1

    :cond_3
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzhan;->zza:Lcom/google/android/gms/internal/ads/zzham;

    .line 7
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzham;->zzm()I

    move-result p1

    iget v1, p0, Lcom/google/android/gms/internal/ads/zzhan;->zzb:I

    if-eq p1, v1, :cond_2

    goto :goto_0

    .line 4
    :cond_4
    iget v0, p0, Lcom/google/android/gms/internal/ads/zzhan;->zzb:I

    and-int/lit8 v0, v0, 0x7

    if-eqz v0, :cond_7

    if-ne v0, v1, :cond_6

    .line 14
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzhan;->zza:Lcom/google/android/gms/internal/ads/zzham;

    .line 9
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzham;->zzn()I

    move-result v1

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzham;->zzd()I

    move-result v0

    add-int/2addr v0, v1

    :cond_5
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzhan;->zza:Lcom/google/android/gms/internal/ads/zzham;

    .line 10
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzham;->zzn()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p1, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzhan;->zza:Lcom/google/android/gms/internal/ads/zzham;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzham;->zzd()I

    move-result v1

    if-lt v1, v0, :cond_5

    .line 11
    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/zzhan;->zzV(I)V

    return-void

    .line 15
    :cond_6
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzhcd;->zza()Lcom/google/android/gms/internal/ads/zzhcc;

    move-result-object p1

    throw p1

    .line 4
    :cond_7
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzhan;->zza:Lcom/google/android/gms/internal/ads/zzham;

    .line 12
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzham;->zzn()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzhan;->zza:Lcom/google/android/gms/internal/ads/zzham;

    .line 13
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzham;->zzC()Z

    move-result v0

    if-nez v0, :cond_8

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzhan;->zza:Lcom/google/android/gms/internal/ads/zzham;

    .line 14
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzham;->zzm()I

    move-result v0

    iget v1, p0, Lcom/google/android/gms/internal/ads/zzhan;->zzb:I

    if-eq v0, v1, :cond_7

    move p1, v0

    .line 7
    :goto_0
    iput p1, p0, Lcom/google/android/gms/internal/ads/zzhan;->zzd:I

    :cond_8
    :goto_1
    return-void
.end method

.method public final zzO(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    instance-of v0, p1, Lcom/google/android/gms/internal/ads/zzhct;

    const/4 v1, 0x2

    if-eqz v0, :cond_4

    move-object v0, p1

    check-cast v0, Lcom/google/android/gms/internal/ads/zzhct;

    iget p1, p0, Lcom/google/android/gms/internal/ads/zzhan;->zzb:I

    and-int/lit8 p1, p1, 0x7

    if-eqz p1, :cond_2

    if-ne p1, v1, :cond_1

    .line 7
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzhan;->zza:Lcom/google/android/gms/internal/ads/zzham;

    .line 2
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzham;->zzn()I

    move-result v1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzham;->zzd()I

    move-result p1

    add-int/2addr p1, v1

    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzhan;->zza:Lcom/google/android/gms/internal/ads/zzham;

    .line 3
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzham;->zzv()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ads/zzhct;->zzg(J)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzhan;->zza:Lcom/google/android/gms/internal/ads/zzham;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzham;->zzd()I

    move-result v1

    if-lt v1, p1, :cond_0

    .line 4
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzhan;->zzV(I)V

    return-void

    .line 8
    :cond_1
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzhcd;->zza()Lcom/google/android/gms/internal/ads/zzhcc;

    move-result-object p1

    throw p1

    .line 1
    :cond_2
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzhan;->zza:Lcom/google/android/gms/internal/ads/zzham;

    .line 5
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzham;->zzv()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ads/zzhct;->zzg(J)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzhan;->zza:Lcom/google/android/gms/internal/ads/zzham;

    .line 6
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzham;->zzC()Z

    move-result p1

    if-eqz p1, :cond_3

    goto :goto_1

    :cond_3
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzhan;->zza:Lcom/google/android/gms/internal/ads/zzham;

    .line 7
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzham;->zzm()I

    move-result p1

    iget v1, p0, Lcom/google/android/gms/internal/ads/zzhan;->zzb:I

    if-eq p1, v1, :cond_2

    goto :goto_0

    .line 4
    :cond_4
    iget v0, p0, Lcom/google/android/gms/internal/ads/zzhan;->zzb:I

    and-int/lit8 v0, v0, 0x7

    if-eqz v0, :cond_7

    if-ne v0, v1, :cond_6

    .line 14
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzhan;->zza:Lcom/google/android/gms/internal/ads/zzham;

    .line 9
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzham;->zzn()I

    move-result v1

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzham;->zzd()I

    move-result v0

    add-int/2addr v0, v1

    :cond_5
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzhan;->zza:Lcom/google/android/gms/internal/ads/zzham;

    .line 10
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzham;->zzv()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-interface {p1, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzhan;->zza:Lcom/google/android/gms/internal/ads/zzham;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzham;->zzd()I

    move-result v1

    if-lt v1, v0, :cond_5

    .line 11
    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/zzhan;->zzV(I)V

    return-void

    .line 15
    :cond_6
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzhcd;->zza()Lcom/google/android/gms/internal/ads/zzhcc;

    move-result-object p1

    throw p1

    .line 4
    :cond_7
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzhan;->zza:Lcom/google/android/gms/internal/ads/zzham;

    .line 12
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzham;->zzv()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzhan;->zza:Lcom/google/android/gms/internal/ads/zzham;

    .line 13
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzham;->zzC()Z

    move-result v0

    if-nez v0, :cond_8

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzhan;->zza:Lcom/google/android/gms/internal/ads/zzham;

    .line 14
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzham;->zzm()I

    move-result v0

    iget v1, p0, Lcom/google/android/gms/internal/ads/zzhan;->zzb:I

    if-eq v0, v1, :cond_7

    move p1, v0

    .line 7
    :goto_0
    iput p1, p0, Lcom/google/android/gms/internal/ads/zzhan;->zzd:I

    :cond_8
    :goto_1
    return-void
.end method

.method public final zzP()Z
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/zzhan;->zzW(I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzhan;->zza:Lcom/google/android/gms/internal/ads/zzham;

    .line 2
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzham;->zzD()Z

    move-result v0

    return v0
.end method

.method public final zzQ()Z
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzhan;->zza:Lcom/google/android/gms/internal/ads/zzham;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzham;->zzC()Z

    move-result v0

    if-nez v0, :cond_1

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzhan;->zzb:I

    iget v1, p0, Lcom/google/android/gms/internal/ads/zzhan;->zzc:I

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzhan;->zza:Lcom/google/android/gms/internal/ads/zzham;

    .line 2
    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/zzham;->zzE(I)Z

    move-result v0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x0

    return v0
.end method

.method public final zza()D
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x1

    .line 1
    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/zzhan;->zzW(I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzhan;->zza:Lcom/google/android/gms/internal/ads/zzham;

    .line 2
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzham;->zzb()D

    move-result-wide v0

    return-wide v0
.end method

.method public final zzb()F
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x5

    .line 1
    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/zzhan;->zzW(I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzhan;->zza:Lcom/google/android/gms/internal/ads/zzham;

    .line 2
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzham;->zzc()F

    move-result v0

    return v0
.end method

.method public final zzc()I
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget v0, p0, Lcom/google/android/gms/internal/ads/zzhan;->zzd:I

    if-eqz v0, :cond_0

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzhan;->zzb:I

    const/4 v1, 0x0

    iput v1, p0, Lcom/google/android/gms/internal/ads/zzhan;->zzd:I

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzhan;->zza:Lcom/google/android/gms/internal/ads/zzham;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzham;->zzm()I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzhan;->zzb:I

    :goto_0
    if-eqz v0, :cond_2

    iget v1, p0, Lcom/google/android/gms/internal/ads/zzhan;->zzc:I

    if-ne v0, v1, :cond_1

    goto :goto_1

    :cond_1
    ushr-int/lit8 v0, v0, 0x3

    return v0

    :cond_2
    :goto_1
    const v0, 0x7fffffff

    return v0
.end method

.method public final zzd()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzhan;->zzb:I

    return v0
.end method

.method public final zze()I
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/zzhan;->zzW(I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzhan;->zza:Lcom/google/android/gms/internal/ads/zzham;

    .line 2
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzham;->zzf()I

    move-result v0

    return v0
.end method

.method public final zzf()I
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x5

    .line 1
    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/zzhan;->zzW(I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzhan;->zza:Lcom/google/android/gms/internal/ads/zzham;

    .line 2
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzham;->zzg()I

    move-result v0

    return v0
.end method

.method public final zzg()I
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/zzhan;->zzW(I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzhan;->zza:Lcom/google/android/gms/internal/ads/zzham;

    .line 2
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzham;->zzh()I

    move-result v0

    return v0
.end method

.method public final zzh()I
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x5

    .line 1
    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/zzhan;->zzW(I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzhan;->zza:Lcom/google/android/gms/internal/ads/zzham;

    .line 2
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzham;->zzk()I

    move-result v0

    return v0
.end method

.method public final zzi()I
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/zzhan;->zzW(I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzhan;->zza:Lcom/google/android/gms/internal/ads/zzham;

    .line 2
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzham;->zzl()I

    move-result v0

    return v0
.end method

.method public final zzj()I
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/zzhan;->zzW(I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzhan;->zza:Lcom/google/android/gms/internal/ads/zzham;

    .line 2
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzham;->zzn()I

    move-result v0

    return v0
.end method

.method public final zzk()J
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x1

    .line 1
    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/zzhan;->zzW(I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzhan;->zza:Lcom/google/android/gms/internal/ads/zzham;

    .line 2
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzham;->zzo()J

    move-result-wide v0

    return-wide v0
.end method

.method public final zzl()J
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/zzhan;->zzW(I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzhan;->zza:Lcom/google/android/gms/internal/ads/zzham;

    .line 2
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzham;->zzp()J

    move-result-wide v0

    return-wide v0
.end method

.method public final zzm()J
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x1

    .line 1
    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/zzhan;->zzW(I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzhan;->zza:Lcom/google/android/gms/internal/ads/zzham;

    .line 2
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzham;->zzt()J

    move-result-wide v0

    return-wide v0
.end method

.method public final zzn()J
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/zzhan;->zzW(I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzhan;->zza:Lcom/google/android/gms/internal/ads/zzham;

    .line 2
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzham;->zzu()J

    move-result-wide v0

    return-wide v0
.end method

.method public final zzo()J
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/zzhan;->zzW(I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzhan;->zza:Lcom/google/android/gms/internal/ads/zzham;

    .line 2
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzham;->zzv()J

    move-result-wide v0

    return-wide v0
.end method

.method public final zzp()Lcom/google/android/gms/internal/ads/zzhac;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x2

    .line 1
    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/zzhan;->zzW(I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzhan;->zza:Lcom/google/android/gms/internal/ads/zzham;

    .line 2
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzham;->zzw()Lcom/google/android/gms/internal/ads/zzhac;

    move-result-object v0

    return-object v0
.end method

.method public final zzr(Ljava/lang/Class;Lcom/google/android/gms/internal/ads/zzhay;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const/4 v0, 0x3

    .line 1
    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/zzhan;->zzW(I)V

    .line 2
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzhdo;->zza()Lcom/google/android/gms/internal/ads/zzhdo;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/zzhdo;->zzb(Ljava/lang/Class;)Lcom/google/android/gms/internal/ads/zzhdz;

    move-result-object p1

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/ads/zzhan;->zzR(Lcom/google/android/gms/internal/ads/zzhdz;Lcom/google/android/gms/internal/ads/zzhay;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final zzs(Ljava/lang/Class;Lcom/google/android/gms/internal/ads/zzhay;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x2

    .line 1
    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/zzhan;->zzW(I)V

    .line 2
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzhdo;->zza()Lcom/google/android/gms/internal/ads/zzhdo;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/zzhdo;->zzb(Ljava/lang/Class;)Lcom/google/android/gms/internal/ads/zzhdz;

    move-result-object p1

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/ads/zzhan;->zzS(Lcom/google/android/gms/internal/ads/zzhdz;Lcom/google/android/gms/internal/ads/zzhay;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final zzt()Ljava/lang/String;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x2

    .line 1
    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/zzhan;->zzW(I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzhan;->zza:Lcom/google/android/gms/internal/ads/zzham;

    .line 2
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzham;->zzx()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final zzu()Ljava/lang/String;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x2

    .line 1
    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/zzhan;->zzW(I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzhan;->zza:Lcom/google/android/gms/internal/ads/zzham;

    .line 2
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzham;->zzy()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final zzv(Ljava/lang/Object;Lcom/google/android/gms/internal/ads/zzhdz;Lcom/google/android/gms/internal/ads/zzhay;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x3

    .line 1
    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/zzhan;->zzW(I)V

    .line 2
    invoke-direct {p0, p1, p2, p3}, Lcom/google/android/gms/internal/ads/zzhan;->zzT(Ljava/lang/Object;Lcom/google/android/gms/internal/ads/zzhdz;Lcom/google/android/gms/internal/ads/zzhay;)V

    return-void
.end method

.method public final zzw(Ljava/lang/Object;Lcom/google/android/gms/internal/ads/zzhdz;Lcom/google/android/gms/internal/ads/zzhay;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x2

    .line 1
    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/zzhan;->zzW(I)V

    .line 2
    invoke-direct {p0, p1, p2, p3}, Lcom/google/android/gms/internal/ads/zzhan;->zzU(Ljava/lang/Object;Lcom/google/android/gms/internal/ads/zzhdz;Lcom/google/android/gms/internal/ads/zzhay;)V

    return-void
.end method

.method public final zzx(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    instance-of v0, p1, Lcom/google/android/gms/internal/ads/zzgzp;

    const/4 v1, 0x2

    if-eqz v0, :cond_4

    move-object v0, p1

    check-cast v0, Lcom/google/android/gms/internal/ads/zzgzp;

    iget p1, p0, Lcom/google/android/gms/internal/ads/zzhan;->zzb:I

    and-int/lit8 p1, p1, 0x7

    if-eqz p1, :cond_2

    if-ne p1, v1, :cond_1

    .line 7
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzhan;->zza:Lcom/google/android/gms/internal/ads/zzham;

    .line 2
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzham;->zzn()I

    move-result v1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzham;->zzd()I

    move-result p1

    add-int/2addr p1, v1

    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzhan;->zza:Lcom/google/android/gms/internal/ads/zzham;

    .line 3
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzham;->zzD()Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzgzp;->zzg(Z)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzhan;->zza:Lcom/google/android/gms/internal/ads/zzham;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzham;->zzd()I

    move-result v1

    if-lt v1, p1, :cond_0

    .line 4
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzhan;->zzV(I)V

    return-void

    .line 8
    :cond_1
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzhcd;->zza()Lcom/google/android/gms/internal/ads/zzhcc;

    move-result-object p1

    throw p1

    .line 1
    :cond_2
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzhan;->zza:Lcom/google/android/gms/internal/ads/zzham;

    .line 5
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzham;->zzD()Z

    move-result p1

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/zzgzp;->zzg(Z)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzhan;->zza:Lcom/google/android/gms/internal/ads/zzham;

    .line 6
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzham;->zzC()Z

    move-result p1

    if-eqz p1, :cond_3

    goto :goto_1

    :cond_3
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzhan;->zza:Lcom/google/android/gms/internal/ads/zzham;

    .line 7
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzham;->zzm()I

    move-result p1

    iget v1, p0, Lcom/google/android/gms/internal/ads/zzhan;->zzb:I

    if-eq p1, v1, :cond_2

    goto :goto_0

    .line 4
    :cond_4
    iget v0, p0, Lcom/google/android/gms/internal/ads/zzhan;->zzb:I

    and-int/lit8 v0, v0, 0x7

    if-eqz v0, :cond_7

    if-ne v0, v1, :cond_6

    .line 14
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzhan;->zza:Lcom/google/android/gms/internal/ads/zzham;

    .line 9
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzham;->zzn()I

    move-result v1

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzham;->zzd()I

    move-result v0

    add-int/2addr v0, v1

    :cond_5
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzhan;->zza:Lcom/google/android/gms/internal/ads/zzham;

    .line 10
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzham;->zzD()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-interface {p1, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzhan;->zza:Lcom/google/android/gms/internal/ads/zzham;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzham;->zzd()I

    move-result v1

    if-lt v1, v0, :cond_5

    .line 11
    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/zzhan;->zzV(I)V

    return-void

    .line 15
    :cond_6
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzhcd;->zza()Lcom/google/android/gms/internal/ads/zzhcc;

    move-result-object p1

    throw p1

    .line 4
    :cond_7
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzhan;->zza:Lcom/google/android/gms/internal/ads/zzham;

    .line 12
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzham;->zzD()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzhan;->zza:Lcom/google/android/gms/internal/ads/zzham;

    .line 13
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzham;->zzC()Z

    move-result v0

    if-nez v0, :cond_8

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzhan;->zza:Lcom/google/android/gms/internal/ads/zzham;

    .line 14
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzham;->zzm()I

    move-result v0

    iget v1, p0, Lcom/google/android/gms/internal/ads/zzhan;->zzb:I

    if-eq v0, v1, :cond_7

    move p1, v0

    .line 7
    :goto_0
    iput p1, p0, Lcom/google/android/gms/internal/ads/zzhan;->zzd:I

    :cond_8
    :goto_1
    return-void
.end method

.method public final zzy(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget v0, p0, Lcom/google/android/gms/internal/ads/zzhan;->zzb:I

    and-int/lit8 v0, v0, 0x7

    const/4 v1, 0x2

    if-ne v0, v1, :cond_2

    :cond_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzhan;->zzp()Lcom/google/android/gms/internal/ads/zzhac;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzhan;->zza:Lcom/google/android/gms/internal/ads/zzham;

    .line 2
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzham;->zzC()Z

    move-result v0

    if-eqz v0, :cond_1

    return-void

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzhan;->zza:Lcom/google/android/gms/internal/ads/zzham;

    .line 3
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzham;->zzm()I

    move-result v0

    iget v1, p0, Lcom/google/android/gms/internal/ads/zzhan;->zzb:I

    if-eq v0, v1, :cond_0

    .line 4
    iput v0, p0, Lcom/google/android/gms/internal/ads/zzhan;->zzd:I

    return-void

    :cond_2
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzhcd;->zza()Lcom/google/android/gms/internal/ads/zzhcc;

    move-result-object p1

    throw p1
.end method

.method public final zzz(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    instance-of v0, p1, Lcom/google/android/gms/internal/ads/zzhav;

    const/4 v1, 0x2

    const/4 v2, 0x1

    if-eqz v0, :cond_4

    move-object v0, p1

    check-cast v0, Lcom/google/android/gms/internal/ads/zzhav;

    iget p1, p0, Lcom/google/android/gms/internal/ads/zzhan;->zzb:I

    and-int/lit8 p1, p1, 0x7

    if-eq p1, v2, :cond_2

    if-ne p1, v1, :cond_1

    .line 7
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzhan;->zza:Lcom/google/android/gms/internal/ads/zzham;

    .line 2
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzham;->zzn()I

    move-result p1

    .line 3
    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzhan;->zzY(I)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzhan;->zza:Lcom/google/android/gms/internal/ads/zzham;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzham;->zzd()I

    move-result v1

    add-int/2addr v1, p1

    :cond_0
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzhan;->zza:Lcom/google/android/gms/internal/ads/zzham;

    .line 4
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzham;->zzb()D

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Lcom/google/android/gms/internal/ads/zzhav;->zzh(D)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzhan;->zza:Lcom/google/android/gms/internal/ads/zzham;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzham;->zzd()I

    move-result p1

    if-lt p1, v1, :cond_0

    goto/16 :goto_1

    .line 8
    :cond_1
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzhcd;->zza()Lcom/google/android/gms/internal/ads/zzhcc;

    move-result-object p1

    throw p1

    .line 1
    :cond_2
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzhan;->zza:Lcom/google/android/gms/internal/ads/zzham;

    .line 5
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzham;->zzb()D

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ads/zzhav;->zzh(D)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzhan;->zza:Lcom/google/android/gms/internal/ads/zzham;

    .line 6
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzham;->zzC()Z

    move-result p1

    if-eqz p1, :cond_3

    goto :goto_1

    :cond_3
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzhan;->zza:Lcom/google/android/gms/internal/ads/zzham;

    .line 7
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzham;->zzm()I

    move-result p1

    iget v1, p0, Lcom/google/android/gms/internal/ads/zzhan;->zzb:I

    if-eq p1, v1, :cond_2

    goto :goto_0

    .line 4
    :cond_4
    iget v0, p0, Lcom/google/android/gms/internal/ads/zzhan;->zzb:I

    and-int/lit8 v0, v0, 0x7

    if-eq v0, v2, :cond_7

    if-ne v0, v1, :cond_6

    .line 14
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzhan;->zza:Lcom/google/android/gms/internal/ads/zzham;

    .line 9
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzham;->zzn()I

    move-result v0

    .line 10
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzhan;->zzY(I)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzhan;->zza:Lcom/google/android/gms/internal/ads/zzham;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzham;->zzd()I

    move-result v1

    add-int/2addr v1, v0

    .line 8
    :cond_5
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzhan;->zza:Lcom/google/android/gms/internal/ads/zzham;

    .line 11
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzham;->zzb()D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzhan;->zza:Lcom/google/android/gms/internal/ads/zzham;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzham;->zzd()I

    move-result v0

    if-lt v0, v1, :cond_5

    goto :goto_1

    .line 15
    :cond_6
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzhcd;->zza()Lcom/google/android/gms/internal/ads/zzhcc;

    move-result-object p1

    throw p1

    .line 4
    :cond_7
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzhan;->zza:Lcom/google/android/gms/internal/ads/zzham;

    .line 12
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzham;->zzb()D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzhan;->zza:Lcom/google/android/gms/internal/ads/zzham;

    .line 13
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzham;->zzC()Z

    move-result v0

    if-nez v0, :cond_8

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzhan;->zza:Lcom/google/android/gms/internal/ads/zzham;

    .line 14
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzham;->zzm()I

    move-result v0

    iget v1, p0, Lcom/google/android/gms/internal/ads/zzhan;->zzb:I

    if-eq v0, v1, :cond_7

    move p1, v0

    .line 7
    :goto_0
    iput p1, p0, Lcom/google/android/gms/internal/ads/zzhan;->zzd:I

    :cond_8
    :goto_1
    return-void
.end method
