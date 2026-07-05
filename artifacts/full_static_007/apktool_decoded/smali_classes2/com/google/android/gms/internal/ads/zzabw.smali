.class final Lcom/google/android/gms/internal/ads/zzabw;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@23.2.0"


# instance fields
.field private final zza:Lcom/google/android/gms/internal/ads/zzabv;

.field private final zzb:Lcom/google/android/gms/internal/ads/zzabq;

.field private final zzc:Lcom/google/android/gms/internal/ads/zzabo;

.field private final zzd:Lcom/google/android/gms/internal/ads/zzga;

.field private final zze:Lcom/google/android/gms/internal/ads/zzga;

.field private final zzf:Lcom/google/android/gms/internal/ads/zzfm;

.field private zzg:Lcom/google/android/gms/internal/ads/zzdv;

.field private zzh:Lcom/google/android/gms/internal/ads/zzdv;

.field private zzi:J

.field private zzj:J


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/zzabv;Lcom/google/android/gms/internal/ads/zzabq;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzabw;->zza:Lcom/google/android/gms/internal/ads/zzabv;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzabw;->zzb:Lcom/google/android/gms/internal/ads/zzabq;

    new-instance p1, Lcom/google/android/gms/internal/ads/zzabo;

    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/zzabo;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzabw;->zzc:Lcom/google/android/gms/internal/ads/zzabo;

    new-instance p1, Lcom/google/android/gms/internal/ads/zzga;

    const/16 p2, 0xa

    invoke-direct {p1, p2}, Lcom/google/android/gms/internal/ads/zzga;-><init>(I)V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzabw;->zzd:Lcom/google/android/gms/internal/ads/zzga;

    new-instance p1, Lcom/google/android/gms/internal/ads/zzga;

    invoke-direct {p1, p2}, Lcom/google/android/gms/internal/ads/zzga;-><init>(I)V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzabw;->zze:Lcom/google/android/gms/internal/ads/zzga;

    new-instance p1, Lcom/google/android/gms/internal/ads/zzfm;

    const/16 p2, 0x10

    invoke-direct {p1, p2}, Lcom/google/android/gms/internal/ads/zzfm;-><init>(I)V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzabw;->zzf:Lcom/google/android/gms/internal/ads/zzfm;

    .line 2
    sget-object p1, Lcom/google/android/gms/internal/ads/zzdv;->zza:Lcom/google/android/gms/internal/ads/zzdv;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzabw;->zzh:Lcom/google/android/gms/internal/ads/zzdv;

    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide p1, p0, Lcom/google/android/gms/internal/ads/zzabw;->zzj:J

    return-void
.end method

.method private static zzf(Lcom/google/android/gms/internal/ads/zzga;)Ljava/lang/Object;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzga;->zza()I

    move-result v0

    const/4 v1, 0x1

    if-lez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzeq;->zzd(Z)V

    :goto_1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzga;->zza()I

    move-result v0

    if-le v0, v1, :cond_1

    .line 2
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzga;->zzb()Ljava/lang/Object;

    goto :goto_1

    .line 3
    :cond_1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzga;->zzb()Ljava/lang/Object;

    move-result-object p0

    .line 4
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-object p0
.end method


# virtual methods
.method public final zza()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzabw;->zzf:Lcom/google/android/gms/internal/ads/zzfm;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzfm;->zzc()V

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/zzabw;->zzj:J

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzabw;->zze:Lcom/google/android/gms/internal/ads/zzga;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzga;->zza()I

    move-result v1

    if-lez v1, :cond_0

    .line 2
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzabw;->zzf(Lcom/google/android/gms/internal/ads/zzga;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzabw;->zze:Lcom/google/android/gms/internal/ads/zzga;

    const-wide/16 v3, 0x0

    .line 3
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v2, v3, v4, v0}, Lcom/google/android/gms/internal/ads/zzga;->zzd(JLjava/lang/Object;)V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzabw;->zzg:Lcom/google/android/gms/internal/ads/zzdv;

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzabw;->zzd:Lcom/google/android/gms/internal/ads/zzga;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzga;->zza()I

    move-result v1

    if-lez v1, :cond_1

    .line 4
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzabw;->zzf(Lcom/google/android/gms/internal/ads/zzga;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/zzdv;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzabw;->zzg:Lcom/google/android/gms/internal/ads/zzdv;

    :cond_1
    return-void

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzabw;->zzd:Lcom/google/android/gms/internal/ads/zzga;

    .line 5
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzga;->zze()V

    return-void
.end method

.method public final zzb(JJ)V
    .locals 0

    .line 1
    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p3

    iget-object p4, p0, Lcom/google/android/gms/internal/ads/zzabw;->zze:Lcom/google/android/gms/internal/ads/zzga;

    invoke-virtual {p4, p1, p2, p3}, Lcom/google/android/gms/internal/ads/zzga;->zzd(JLjava/lang/Object;)V

    return-void
.end method

.method public final zzc(JJ)V
    .locals 16
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/ads/zzjh;
        }
    .end annotation

    move-object/from16 v0, p0

    .line 1
    :goto_0
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzabw;->zzf:Lcom/google/android/gms/internal/ads/zzfm;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzfm;->zzd()Z

    move-result v2

    if-nez v2, :cond_6

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzabw;->zze:Lcom/google/android/gms/internal/ads/zzga;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzfm;->zza()J

    move-result-wide v14

    .line 2
    invoke-virtual {v2, v14, v15}, Lcom/google/android/gms/internal/ads/zzga;->zzc(J)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Long;

    if-eqz v1, :cond_0

    .line 3
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    iget-wide v4, v0, Lcom/google/android/gms/internal/ads/zzabw;->zzi:J

    cmp-long v2, v2, v4

    if-eqz v2, :cond_0

    .line 4
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    iput-wide v1, v0, Lcom/google/android/gms/internal/ads/zzabw;->zzi:J

    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzabw;->zzb:Lcom/google/android/gms/internal/ads/zzabq;

    .line 5
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzabq;->zzf()V

    :cond_0
    iget-object v3, v0, Lcom/google/android/gms/internal/ads/zzabw;->zzb:Lcom/google/android/gms/internal/ads/zzabq;

    iget-wide v10, v0, Lcom/google/android/gms/internal/ads/zzabw;->zzi:J

    const/4 v12, 0x0

    iget-object v13, v0, Lcom/google/android/gms/internal/ads/zzabw;->zzc:Lcom/google/android/gms/internal/ads/zzabo;

    move-wide v4, v14

    move-wide/from16 v6, p1

    move-wide/from16 v8, p3

    .line 6
    invoke-virtual/range {v3 .. v13}, Lcom/google/android/gms/internal/ads/zzabq;->zza(JJJJZLcom/google/android/gms/internal/ads/zzabo;)I

    move-result v1

    if-eqz v1, :cond_2

    const/4 v2, 0x1

    if-eq v1, v2, :cond_2

    const/4 v2, 0x2

    if-eq v1, v2, :cond_1

    const/4 v2, 0x3

    if-eq v1, v2, :cond_1

    const/4 v2, 0x4

    if-eq v1, v2, :cond_1

    goto :goto_3

    :cond_1
    iput-wide v14, v0, Lcom/google/android/gms/internal/ads/zzabw;->zzj:J

    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzabw;->zzf:Lcom/google/android/gms/internal/ads/zzfm;

    .line 7
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzfm;->zzb()J

    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzabw;->zza:Lcom/google/android/gms/internal/ads/zzabv;

    .line 8
    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/zzabv;->zzl()V

    goto :goto_0

    :cond_2
    iput-wide v14, v0, Lcom/google/android/gms/internal/ads/zzabw;->zzj:J

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzabw;->zzf:Lcom/google/android/gms/internal/ads/zzfm;

    .line 9
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzfm;->zzb()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v6

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzabw;->zzd:Lcom/google/android/gms/internal/ads/zzga;

    .line 10
    invoke-virtual {v2, v6, v7}, Lcom/google/android/gms/internal/ads/zzga;->zzc(J)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/ads/zzdv;

    if-nez v2, :cond_3

    goto :goto_1

    .line 14
    :cond_3
    sget-object v3, Lcom/google/android/gms/internal/ads/zzdv;->zza:Lcom/google/android/gms/internal/ads/zzdv;

    .line 11
    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/ads/zzdv;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_4

    iget-object v3, v0, Lcom/google/android/gms/internal/ads/zzabw;->zzh:Lcom/google/android/gms/internal/ads/zzdv;

    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/ads/zzdv;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_4

    iput-object v2, v0, Lcom/google/android/gms/internal/ads/zzabw;->zzh:Lcom/google/android/gms/internal/ads/zzdv;

    iget-object v3, v0, Lcom/google/android/gms/internal/ads/zzabw;->zza:Lcom/google/android/gms/internal/ads/zzabv;

    .line 12
    invoke-interface {v3, v2}, Lcom/google/android/gms/internal/ads/zzabv;->zzm(Lcom/google/android/gms/internal/ads/zzdv;)V

    :cond_4
    :goto_1
    if-nez v1, :cond_5

    const-wide/16 v1, -0x1

    goto :goto_2

    .line 14
    :cond_5
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzabw;->zzc:Lcom/google/android/gms/internal/ads/zzabo;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzabo;->zzd()J

    move-result-wide v1

    :goto_2
    move-wide v4, v1

    .line 10
    iget-object v3, v0, Lcom/google/android/gms/internal/ads/zzabw;->zza:Lcom/google/android/gms/internal/ads/zzabv;

    iget-wide v8, v0, Lcom/google/android/gms/internal/ads/zzabw;->zzi:J

    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzabw;->zzb:Lcom/google/android/gms/internal/ads/zzabq;

    .line 13
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzabq;->zzp()Z

    move-result v10

    .line 14
    invoke-interface/range {v3 .. v10}, Lcom/google/android/gms/internal/ads/zzabv;->zzp(JJJZ)V

    goto/16 :goto_0

    :cond_6
    :goto_3
    return-void
.end method

.method public final zzd(F)V
    .locals 1

    const/4 v0, 0x0

    cmpl-float v0, p1, v0

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 1
    :goto_0
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzeq;->zzd(Z)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzabw;->zzb:Lcom/google/android/gms/internal/ads/zzabq;

    .line 2
    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/zzabq;->zzn(F)V

    return-void
.end method

.method public final zze(J)Z
    .locals 4

    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/zzabw;->zzj:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v2, v0, v2

    if-eqz v2, :cond_0

    cmp-long p1, v0, p1

    if-ltz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
