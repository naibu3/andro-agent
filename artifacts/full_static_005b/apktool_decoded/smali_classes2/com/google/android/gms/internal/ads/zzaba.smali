.class final Lcom/google/android/gms/internal/ads/zzaba;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@23.2.0"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzacm;
.implements Lcom/google/android/gms/internal/ads/zzaas;


# instance fields
.field final synthetic zza:Lcom/google/android/gms/internal/ads/zzabc;

.field private final zzb:Landroid/content/Context;

.field private final zzc:I

.field private final zzd:Ljava/util/ArrayList;

.field private zze:Lcom/google/android/gms/internal/ads/zzds;

.field private zzf:Lcom/google/android/gms/internal/ads/zzan;

.field private zzg:J

.field private zzh:Z

.field private zzi:J

.field private zzj:Z

.field private zzk:J

.field private zzl:Lcom/google/android/gms/internal/ads/zzack;

.field private zzm:Ljava/util/concurrent/Executor;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/zzabc;Landroid/content/Context;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzaba;->zza:Lcom/google/android/gms/internal/ads/zzabc;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzaba;->zzb:Landroid/content/Context;

    invoke-static {p2}, Lcom/google/android/gms/internal/ads/zzgd;->zzL(Landroid/content/Context;)Z

    move-result p1

    const/4 p2, 0x1

    if-eq p2, p1, :cond_0

    const/4 p2, 0x5

    :cond_0
    iput p2, p0, Lcom/google/android/gms/internal/ads/zzaba;->zzc:I

    new-instance p1, Ljava/util/ArrayList;

    .line 2
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzaba;->zzd:Ljava/util/ArrayList;

    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide p1, p0, Lcom/google/android/gms/internal/ads/zzaba;->zzi:J

    sget-object p1, Lcom/google/android/gms/internal/ads/zzack;->zzb:Lcom/google/android/gms/internal/ads/zzack;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzaba;->zzl:Lcom/google/android/gms/internal/ads/zzack;

    invoke-static {}, Lcom/google/android/gms/internal/ads/zzabc;->zze()Ljava/util/concurrent/Executor;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzaba;->zzm:Ljava/util/concurrent/Executor;

    return-void
.end method

.method private final zzm()V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzaba;->zzf:Lcom/google/android/gms/internal/ads/zzan;

    if-nez v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzaba;->zzd:Ljava/util/ArrayList;

    .line 2
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzaba;->zzf:Lcom/google/android/gms/internal/ads/zzan;

    .line 8
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v1, 0x0

    .line 3
    invoke-static {v1}, Lcom/google/android/gms/internal/ads/zzeq;->zzb(Ljava/lang/Object;)Ljava/lang/Object;

    iget v2, v0, Lcom/google/android/gms/internal/ads/zzan;->zzt:I

    iget v3, v0, Lcom/google/android/gms/internal/ads/zzan;->zzs:I

    iget-object v4, v0, Lcom/google/android/gms/internal/ads/zzan;->zzz:Lcom/google/android/gms/internal/ads/zzt;

    new-instance v5, Lcom/google/android/gms/internal/ads/zzao;

    .line 4
    invoke-static {v4}, Lcom/google/android/gms/internal/ads/zzabc;->zza(Lcom/google/android/gms/internal/ads/zzt;)Lcom/google/android/gms/internal/ads/zzt;

    move-result-object v4

    invoke-direct {v5, v4, v3, v2}, Lcom/google/android/gms/internal/ads/zzao;-><init>(Lcom/google/android/gms/internal/ads/zzt;II)V

    iget v0, v0, Lcom/google/android/gms/internal/ads/zzan;->zzw:F

    .line 5
    invoke-virtual {v5, v0}, Lcom/google/android/gms/internal/ads/zzao;->zza(F)Lcom/google/android/gms/internal/ads/zzao;

    .line 6
    invoke-virtual {v5}, Lcom/google/android/gms/internal/ads/zzao;->zzb()Lcom/google/android/gms/internal/ads/zzaq;

    .line 7
    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/zzds;->zzd()V

    throw v1
.end method


# virtual methods
.method public final zza(Lcom/google/android/gms/internal/ads/zzabc;)V
    .locals 2

    .line 1
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzaba;->zzl:Lcom/google/android/gms/internal/ads/zzack;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzaba;->zzm:Ljava/util/concurrent/Executor;

    new-instance v1, Lcom/google/android/gms/internal/ads/zzaaz;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/internal/ads/zzaaz;-><init>(Lcom/google/android/gms/internal/ads/zzaba;Lcom/google/android/gms/internal/ads/zzack;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final zzb(Lcom/google/android/gms/internal/ads/zzabc;)V
    .locals 2

    .line 1
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzaba;->zzl:Lcom/google/android/gms/internal/ads/zzack;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzaba;->zzm:Ljava/util/concurrent/Executor;

    new-instance v1, Lcom/google/android/gms/internal/ads/zzaay;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/internal/ads/zzaay;-><init>(Lcom/google/android/gms/internal/ads/zzaba;Lcom/google/android/gms/internal/ads/zzack;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final zzc(Lcom/google/android/gms/internal/ads/zzabc;Lcom/google/android/gms/internal/ads/zzdv;)V
    .locals 2

    .line 1
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzaba;->zzl:Lcom/google/android/gms/internal/ads/zzack;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzaba;->zzm:Ljava/util/concurrent/Executor;

    new-instance v1, Lcom/google/android/gms/internal/ads/zzaax;

    invoke-direct {v1, p0, p1, p2}, Lcom/google/android/gms/internal/ads/zzaax;-><init>(Lcom/google/android/gms/internal/ads/zzaba;Lcom/google/android/gms/internal/ads/zzack;Lcom/google/android/gms/internal/ads/zzdv;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final zzd(JZ)J
    .locals 2

    const/4 p1, 0x0

    .line 1
    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzeq;->zzf(Z)V

    iget-wide p1, p0, Lcom/google/android/gms/internal/ads/zzaba;->zzk:J

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long p3, p1, v0

    if-eqz p3, :cond_1

    iget-object p3, p0, Lcom/google/android/gms/internal/ads/zzaba;->zza:Lcom/google/android/gms/internal/ads/zzabc;

    .line 2
    invoke-static {p3, p1, p2}, Lcom/google/android/gms/internal/ads/zzabc;->zzt(Lcom/google/android/gms/internal/ads/zzabc;J)Z

    move-result p1

    if-nez p1, :cond_0

    return-wide v0

    .line 3
    :cond_0
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzaba;->zzm()V

    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/zzaba;->zzk:J

    :cond_1
    const/4 p1, 0x0

    .line 4
    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzeq;->zzb(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/zzds;->zza()I

    throw p1
.end method

.method public final zze()V
    .locals 2

    const/4 v0, 0x0

    .line 1
    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzaba;->zzj:Z

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/zzaba;->zzi:J

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzaba;->zza:Lcom/google/android/gms/internal/ads/zzabc;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzabc;->zzg(Lcom/google/android/gms/internal/ads/zzabc;)V

    return-void
.end method

.method public final zzf(Lcom/google/android/gms/internal/ads/zzan;Lcom/google/android/gms/internal/ads/zzer;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/ads/zzacl;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzaba;->zza:Lcom/google/android/gms/internal/ads/zzabc;

    invoke-static {v0, p1, p2}, Lcom/google/android/gms/internal/ads/zzabc;->zzb(Lcom/google/android/gms/internal/ads/zzabc;Lcom/google/android/gms/internal/ads/zzan;Lcom/google/android/gms/internal/ads/zzer;)Lcom/google/android/gms/internal/ads/zzds;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzaba;->zze:Lcom/google/android/gms/internal/ads/zzds;

    return-void
.end method

.method public final zzg(ILcom/google/android/gms/internal/ads/zzan;)V
    .locals 5

    const/4 p1, 0x0

    .line 1
    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzeq;->zzf(Z)V

    .line 2
    sget v0, Lcom/google/android/gms/internal/ads/zzgd;->zza:I

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzaba;->zzf:Lcom/google/android/gms/internal/ads/zzan;

    iget-boolean p2, p0, Lcom/google/android/gms/internal/ads/zzaba;->zzj:Z

    const/4 v0, 0x1

    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    if-nez p2, :cond_0

    .line 3
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzaba;->zzm()V

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzaba;->zzj:Z

    iput-wide v1, p0, Lcom/google/android/gms/internal/ads/zzaba;->zzk:J

    return-void

    :cond_0
    iget-wide v3, p0, Lcom/google/android/gms/internal/ads/zzaba;->zzi:J

    cmp-long p2, v3, v1

    if-eqz p2, :cond_1

    move p1, v0

    .line 4
    :cond_1
    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzeq;->zzf(Z)V

    iget-wide p1, p0, Lcom/google/android/gms/internal/ads/zzaba;->zzi:J

    iput-wide p1, p0, Lcom/google/android/gms/internal/ads/zzaba;->zzk:J

    return-void
.end method

.method public final zzh(JJ)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/ads/zzacl;
        }
    .end annotation

    const/4 v0, 0x0

    .line 1
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzeq;->zzf(Z)V

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzaba;->zza:Lcom/google/android/gms/internal/ads/zzabc;

    .line 2
    invoke-virtual {v0, p1, p2, p3, p4}, Lcom/google/android/gms/internal/ads/zzabc;->zzo(JJ)V
    :try_end_0
    .catch Lcom/google/android/gms/internal/ads/zzjh; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance p2, Lcom/google/android/gms/internal/ads/zzacl;

    iget-object p3, p0, Lcom/google/android/gms/internal/ads/zzaba;->zzf:Lcom/google/android/gms/internal/ads/zzan;

    if-nez p3, :cond_0

    new-instance p3, Lcom/google/android/gms/internal/ads/zzal;

    .line 3
    invoke-direct {p3}, Lcom/google/android/gms/internal/ads/zzal;-><init>()V

    invoke-virtual {p3}, Lcom/google/android/gms/internal/ads/zzal;->zzad()Lcom/google/android/gms/internal/ads/zzan;

    move-result-object p3

    :cond_0
    invoke-direct {p2, p1, p3}, Lcom/google/android/gms/internal/ads/zzacl;-><init>(Ljava/lang/Throwable;Lcom/google/android/gms/internal/ads/zzan;)V

    throw p2
.end method

.method public final zzi(Lcom/google/android/gms/internal/ads/zzack;Ljava/util/concurrent/Executor;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzaba;->zzl:Lcom/google/android/gms/internal/ads/zzack;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzaba;->zzm:Ljava/util/concurrent/Executor;

    return-void
.end method

.method public final zzj(J)V
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/zzaba;->zzg:J

    cmp-long v0, v0, p1

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzaba;->zzh:Z

    iput-wide p1, p0, Lcom/google/android/gms/internal/ads/zzaba;->zzg:J

    return-void
.end method

.method public final zzk(Ljava/util/List;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzaba;->zzd:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzaba;->zzd:Ljava/util/ArrayList;

    .line 2
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 3
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzaba;->zzm()V

    return-void
.end method

.method public final zzl()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzaba;->zzb:Landroid/content/Context;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzgd;->zzL(Landroid/content/Context;)Z

    move-result v0

    return v0
.end method
