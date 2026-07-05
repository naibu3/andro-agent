.class public final Lcom/google/android/gms/internal/ads/zzfew;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@23.2.0"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzeps;


# instance fields
.field private final zza:Landroid/content/Context;

.field private final zzb:Ljava/util/concurrent/Executor;

.field private final zzc:Lcom/google/android/gms/internal/ads/zzcjd;

.field private final zzd:Lcom/google/android/gms/internal/ads/zzepc;

.field private final zze:Lcom/google/android/gms/internal/ads/zzffw;

.field private zzf:Lcom/google/android/gms/internal/ads/zzbfk;

.field private final zzg:Lcom/google/android/gms/internal/ads/zzfmq;

.field private final zzh:Lcom/google/android/gms/internal/ads/zzfhm;

.field private zzi:Lcom/google/common/util/concurrent/ListenableFuture;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/util/concurrent/Executor;Lcom/google/android/gms/internal/ads/zzcjd;Lcom/google/android/gms/internal/ads/zzepc;Lcom/google/android/gms/internal/ads/zzffw;Lcom/google/android/gms/internal/ads/zzfhm;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzfew;->zza:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzfew;->zzb:Ljava/util/concurrent/Executor;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzfew;->zzc:Lcom/google/android/gms/internal/ads/zzcjd;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/zzfew;->zzd:Lcom/google/android/gms/internal/ads/zzepc;

    iput-object p6, p0, Lcom/google/android/gms/internal/ads/zzfew;->zzh:Lcom/google/android/gms/internal/ads/zzfhm;

    iput-object p5, p0, Lcom/google/android/gms/internal/ads/zzfew;->zze:Lcom/google/android/gms/internal/ads/zzffw;

    invoke-virtual {p3}, Lcom/google/android/gms/internal/ads/zzcjd;->zzz()Lcom/google/android/gms/internal/ads/zzfmq;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzfew;->zzg:Lcom/google/android/gms/internal/ads/zzfmq;

    return-void
.end method

.method static bridge synthetic zzc(Lcom/google/android/gms/internal/ads/zzfew;)Lcom/google/android/gms/internal/ads/zzepc;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/zzfew;->zzd:Lcom/google/android/gms/internal/ads/zzepc;

    return-object p0
.end method

.method static bridge synthetic zzd(Lcom/google/android/gms/internal/ads/zzfew;)Lcom/google/android/gms/internal/ads/zzffw;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/zzfew;->zze:Lcom/google/android/gms/internal/ads/zzffw;

    return-object p0
.end method

.method static bridge synthetic zze(Lcom/google/android/gms/internal/ads/zzfew;)Lcom/google/android/gms/internal/ads/zzfmq;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/zzfew;->zzg:Lcom/google/android/gms/internal/ads/zzfmq;

    return-object p0
.end method

.method static bridge synthetic zzf(Lcom/google/android/gms/internal/ads/zzfew;)Ljava/util/concurrent/Executor;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/zzfew;->zzb:Ljava/util/concurrent/Executor;

    return-object p0
.end method

.method static bridge synthetic zzg(Lcom/google/android/gms/internal/ads/zzfew;Lcom/google/common/util/concurrent/ListenableFuture;)V
    .locals 0

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzfew;->zzi:Lcom/google/common/util/concurrent/ListenableFuture;

    return-void
.end method


# virtual methods
.method public final zza()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfew;->zzi:Lcom/google/common/util/concurrent/ListenableFuture;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/google/common/util/concurrent/ListenableFuture;->isDone()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final zzb(Lcom/google/android/gms/ads/internal/client/zzl;Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzepq;Lcom/google/android/gms/internal/ads/zzepr;)Z
    .locals 9

    const/4 v0, 0x0

    if-nez p2, :cond_0

    .line 1
    const-string p1, "Ad unit ID should not be null for interstitial ad."

    invoke-static {p1}, Lcom/google/android/gms/ads/internal/util/client/zzm;->zzg(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzfew;->zzb:Ljava/util/concurrent/Executor;

    new-instance p2, Lcom/google/android/gms/internal/ads/zzfeq;

    invoke-direct {p2, p0}, Lcom/google/android/gms/internal/ads/zzfeq;-><init>(Lcom/google/android/gms/internal/ads/zzfew;)V

    .line 2
    invoke-interface {p1, p2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return v0

    .line 3
    :cond_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzfew;->zza()Z

    move-result v1

    if-eqz v1, :cond_1

    return v0

    .line 4
    :cond_1
    sget-object v1, Lcom/google/android/gms/internal/ads/zzbep;->zziU:Lcom/google/android/gms/internal/ads/zzbeg;

    .line 5
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/google/android/gms/internal/ads/zzben;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/ads/zzben;->zza(Lcom/google/android/gms/internal/ads/zzbeg;)Ljava/lang/Object;

    move-result-object v1

    .line 4
    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_2

    iget-boolean v1, p1, Lcom/google/android/gms/ads/internal/client/zzl;->zzf:Z

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzfew;->zzc:Lcom/google/android/gms/internal/ads/zzcjd;

    .line 6
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzcjd;->zzl()Lcom/google/android/gms/internal/ads/zzdya;

    move-result-object v1

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ads/zzdya;->zzo(Z)V

    :cond_2
    check-cast p3, Lcom/google/android/gms/internal/ads/zzfep;

    iget-object p3, p3, Lcom/google/android/gms/internal/ads/zzfep;->zza:Lcom/google/android/gms/ads/internal/client/zzq;

    const/4 v1, 0x2

    new-array v1, v1, [Landroid/util/Pair;

    new-instance v3, Landroid/util/Pair;

    .line 7
    sget-object v4, Lcom/google/android/gms/internal/ads/zzdul;->zza:Lcom/google/android/gms/internal/ads/zzdul;

    .line 8
    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/zzdul;->zza()Ljava/lang/String;

    move-result-object v4

    iget-wide v5, p1, Lcom/google/android/gms/ads/internal/client/zzl;->zzz:J

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    invoke-direct {v3, v4, v5}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    aput-object v3, v1, v0

    new-instance v0, Landroid/util/Pair;

    sget-object v3, Lcom/google/android/gms/internal/ads/zzdul;->zzb:Lcom/google/android/gms/internal/ads/zzdul;

    .line 9
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzdul;->zza()Ljava/lang/String;

    move-result-object v3

    .line 10
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzu;->zzB()Lcom/google/android/gms/common/util/Clock;

    move-result-object v4

    invoke-interface {v4}, Lcom/google/android/gms/common/util/Clock;->currentTimeMillis()J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-direct {v0, v3, v4}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    aput-object v0, v1, v2

    .line 11
    invoke-static {v1}, Lcom/google/android/gms/internal/ads/zzdun;->zza([Landroid/util/Pair;)Landroid/os/Bundle;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzfew;->zzh:Lcom/google/android/gms/internal/ads/zzfhm;

    .line 12
    invoke-virtual {v1, p2}, Lcom/google/android/gms/internal/ads/zzfhm;->zzt(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzfhm;

    .line 13
    invoke-virtual {v1, p3}, Lcom/google/android/gms/internal/ads/zzfhm;->zzs(Lcom/google/android/gms/ads/internal/client/zzq;)Lcom/google/android/gms/internal/ads/zzfhm;

    .line 14
    invoke-virtual {v1, p1}, Lcom/google/android/gms/internal/ads/zzfhm;->zzH(Lcom/google/android/gms/ads/internal/client/zzl;)Lcom/google/android/gms/internal/ads/zzfhm;

    .line 15
    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/zzfhm;->zzA(Landroid/os/Bundle;)Lcom/google/android/gms/internal/ads/zzfhm;

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/zzfew;->zza:Landroid/content/Context;

    .line 16
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzfhm;->zzJ()Lcom/google/android/gms/internal/ads/zzfho;

    move-result-object p3

    .line 17
    invoke-static {p3}, Lcom/google/android/gms/internal/ads/zzfmm;->zza(Lcom/google/android/gms/internal/ads/zzfho;)Lcom/google/android/gms/internal/ads/zzfmu;

    move-result-object v0

    sget-object v1, Lcom/google/android/gms/internal/ads/zzfmw;->zzc:Lcom/google/android/gms/internal/ads/zzfmw;

    .line 18
    invoke-static {p2, v0, v1, p1}, Lcom/google/android/gms/internal/ads/zzfmb;->zzb(Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzfmu;Lcom/google/android/gms/internal/ads/zzfmw;Lcom/google/android/gms/ads/internal/client/zzl;)Lcom/google/android/gms/internal/ads/zzfmc;

    move-result-object v7

    sget-object p2, Lcom/google/android/gms/internal/ads/zzbep;->zzim:Lcom/google/android/gms/internal/ads/zzbeg;

    .line 19
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/google/android/gms/internal/ads/zzben;

    move-result-object v0

    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/ads/zzben;->zza(Lcom/google/android/gms/internal/ads/zzbeg;)Ljava/lang/Object;

    move-result-object p2

    .line 20
    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-eqz p2, :cond_3

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/zzfew;->zzc:Lcom/google/android/gms/internal/ads/zzcjd;

    .line 21
    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/zzcjd;->zzg()Lcom/google/android/gms/internal/ads/zzdjg;

    move-result-object p2

    new-instance v0, Lcom/google/android/gms/internal/ads/zzcyt;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzcyt;-><init>()V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzfew;->zza:Landroid/content/Context;

    .line 22
    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzcyt;->zze(Landroid/content/Context;)Lcom/google/android/gms/internal/ads/zzcyt;

    .line 23
    invoke-virtual {v0, p3}, Lcom/google/android/gms/internal/ads/zzcyt;->zzi(Lcom/google/android/gms/internal/ads/zzfho;)Lcom/google/android/gms/internal/ads/zzcyt;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzcyt;->zzj()Lcom/google/android/gms/internal/ads/zzcyv;

    move-result-object p3

    .line 24
    invoke-interface {p2, p3}, Lcom/google/android/gms/internal/ads/zzdjg;->zze(Lcom/google/android/gms/internal/ads/zzcyv;)Lcom/google/android/gms/internal/ads/zzdjg;

    new-instance p3, Lcom/google/android/gms/internal/ads/zzdfa;

    invoke-direct {p3}, Lcom/google/android/gms/internal/ads/zzdfa;-><init>()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfew;->zzd:Lcom/google/android/gms/internal/ads/zzepc;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzfew;->zzb:Ljava/util/concurrent/Executor;

    .line 25
    invoke-virtual {p3, v0, v1}, Lcom/google/android/gms/internal/ads/zzdfa;->zzj(Lcom/google/android/gms/internal/ads/zzdcg;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/zzdfa;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfew;->zzd:Lcom/google/android/gms/internal/ads/zzepc;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzfew;->zzb:Ljava/util/concurrent/Executor;

    .line 26
    invoke-virtual {p3, v0, v1}, Lcom/google/android/gms/internal/ads/zzdfa;->zzk(Lcom/google/android/gms/ads/admanager/AppEventListener;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/zzdfa;

    invoke-virtual {p3}, Lcom/google/android/gms/internal/ads/zzdfa;->zzn()Lcom/google/android/gms/internal/ads/zzdfc;

    move-result-object p3

    .line 27
    invoke-interface {p2, p3}, Lcom/google/android/gms/internal/ads/zzdjg;->zzd(Lcom/google/android/gms/internal/ads/zzdfc;)Lcom/google/android/gms/internal/ads/zzdjg;

    new-instance p3, Lcom/google/android/gms/internal/ads/zzenl;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfew;->zzf:Lcom/google/android/gms/internal/ads/zzbfk;

    invoke-direct {p3, v0}, Lcom/google/android/gms/internal/ads/zzenl;-><init>(Lcom/google/android/gms/internal/ads/zzbfk;)V

    .line 28
    invoke-interface {p2, p3}, Lcom/google/android/gms/internal/ads/zzdjg;->zzc(Lcom/google/android/gms/internal/ads/zzenl;)Lcom/google/android/gms/internal/ads/zzdjg;

    .line 29
    invoke-interface {p2}, Lcom/google/android/gms/internal/ads/zzdjg;->zzf()Lcom/google/android/gms/internal/ads/zzdjh;

    move-result-object p2

    :goto_0
    move-object v8, p2

    goto/16 :goto_1

    .line 57
    :cond_3
    new-instance p2, Lcom/google/android/gms/internal/ads/zzdfa;

    .line 30
    invoke-direct {p2}, Lcom/google/android/gms/internal/ads/zzdfa;-><init>()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfew;->zze:Lcom/google/android/gms/internal/ads/zzffw;

    if-eqz v0, :cond_4

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzfew;->zzb:Ljava/util/concurrent/Executor;

    .line 31
    invoke-virtual {p2, v0, v1}, Lcom/google/android/gms/internal/ads/zzdfa;->zze(Lcom/google/android/gms/internal/ads/zzczl;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/zzdfa;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfew;->zze:Lcom/google/android/gms/internal/ads/zzffw;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzfew;->zzb:Ljava/util/concurrent/Executor;

    .line 32
    invoke-virtual {p2, v0, v1}, Lcom/google/android/gms/internal/ads/zzdfa;->zzf(Lcom/google/android/gms/internal/ads/zzdaz;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/zzdfa;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfew;->zze:Lcom/google/android/gms/internal/ads/zzffw;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzfew;->zzb:Ljava/util/concurrent/Executor;

    .line 33
    invoke-virtual {p2, v0, v1}, Lcom/google/android/gms/internal/ads/zzdfa;->zzb(Lcom/google/android/gms/internal/ads/zzczo;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/zzdfa;

    :cond_4
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfew;->zzc:Lcom/google/android/gms/internal/ads/zzcjd;

    .line 34
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzcjd;->zzg()Lcom/google/android/gms/internal/ads/zzdjg;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/ads/zzcyt;

    invoke-direct {v1}, Lcom/google/android/gms/internal/ads/zzcyt;-><init>()V

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzfew;->zza:Landroid/content/Context;

    .line 35
    invoke-virtual {v1, v3}, Lcom/google/android/gms/internal/ads/zzcyt;->zze(Landroid/content/Context;)Lcom/google/android/gms/internal/ads/zzcyt;

    .line 36
    invoke-virtual {v1, p3}, Lcom/google/android/gms/internal/ads/zzcyt;->zzi(Lcom/google/android/gms/internal/ads/zzfho;)Lcom/google/android/gms/internal/ads/zzcyt;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzcyt;->zzj()Lcom/google/android/gms/internal/ads/zzcyv;

    move-result-object p3

    .line 37
    invoke-interface {v0, p3}, Lcom/google/android/gms/internal/ads/zzdjg;->zze(Lcom/google/android/gms/internal/ads/zzcyv;)Lcom/google/android/gms/internal/ads/zzdjg;

    iget-object p3, p0, Lcom/google/android/gms/internal/ads/zzfew;->zzd:Lcom/google/android/gms/internal/ads/zzepc;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzfew;->zzb:Ljava/util/concurrent/Executor;

    .line 38
    invoke-virtual {p2, p3, v1}, Lcom/google/android/gms/internal/ads/zzdfa;->zzj(Lcom/google/android/gms/internal/ads/zzdcg;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/zzdfa;

    iget-object p3, p0, Lcom/google/android/gms/internal/ads/zzfew;->zzd:Lcom/google/android/gms/internal/ads/zzepc;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzfew;->zzb:Ljava/util/concurrent/Executor;

    .line 39
    invoke-virtual {p2, p3, v1}, Lcom/google/android/gms/internal/ads/zzdfa;->zze(Lcom/google/android/gms/internal/ads/zzczl;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/zzdfa;

    iget-object p3, p0, Lcom/google/android/gms/internal/ads/zzfew;->zzd:Lcom/google/android/gms/internal/ads/zzepc;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzfew;->zzb:Ljava/util/concurrent/Executor;

    .line 40
    invoke-virtual {p2, p3, v1}, Lcom/google/android/gms/internal/ads/zzdfa;->zzf(Lcom/google/android/gms/internal/ads/zzdaz;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/zzdfa;

    iget-object p3, p0, Lcom/google/android/gms/internal/ads/zzfew;->zzd:Lcom/google/android/gms/internal/ads/zzepc;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzfew;->zzb:Ljava/util/concurrent/Executor;

    .line 41
    invoke-virtual {p2, p3, v1}, Lcom/google/android/gms/internal/ads/zzdfa;->zzb(Lcom/google/android/gms/internal/ads/zzczo;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/zzdfa;

    iget-object p3, p0, Lcom/google/android/gms/internal/ads/zzfew;->zzd:Lcom/google/android/gms/internal/ads/zzepc;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzfew;->zzb:Ljava/util/concurrent/Executor;

    .line 42
    invoke-virtual {p2, p3, v1}, Lcom/google/android/gms/internal/ads/zzdfa;->zza(Lcom/google/android/gms/ads/internal/client/zza;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/zzdfa;

    iget-object p3, p0, Lcom/google/android/gms/internal/ads/zzfew;->zzd:Lcom/google/android/gms/internal/ads/zzepc;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzfew;->zzb:Ljava/util/concurrent/Executor;

    .line 43
    invoke-virtual {p2, p3, v1}, Lcom/google/android/gms/internal/ads/zzdfa;->zzl(Lcom/google/android/gms/internal/ads/zzdhi;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/zzdfa;

    iget-object p3, p0, Lcom/google/android/gms/internal/ads/zzfew;->zzd:Lcom/google/android/gms/internal/ads/zzepc;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzfew;->zzb:Ljava/util/concurrent/Executor;

    .line 44
    invoke-virtual {p2, p3, v1}, Lcom/google/android/gms/internal/ads/zzdfa;->zzk(Lcom/google/android/gms/ads/admanager/AppEventListener;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/zzdfa;

    iget-object p3, p0, Lcom/google/android/gms/internal/ads/zzfew;->zzd:Lcom/google/android/gms/internal/ads/zzepc;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzfew;->zzb:Ljava/util/concurrent/Executor;

    .line 45
    invoke-virtual {p2, p3, v1}, Lcom/google/android/gms/internal/ads/zzdfa;->zzi(Lcom/google/android/gms/internal/ads/zzdbw;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/zzdfa;

    iget-object p3, p0, Lcom/google/android/gms/internal/ads/zzfew;->zzd:Lcom/google/android/gms/internal/ads/zzepc;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzfew;->zzb:Ljava/util/concurrent/Executor;

    .line 46
    invoke-virtual {p2, p3, v1}, Lcom/google/android/gms/internal/ads/zzdfa;->zzc(Lcom/google/android/gms/internal/ads/zzdab;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/zzdfa;

    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/zzdfa;->zzn()Lcom/google/android/gms/internal/ads/zzdfc;

    move-result-object p2

    .line 47
    invoke-interface {v0, p2}, Lcom/google/android/gms/internal/ads/zzdjg;->zzd(Lcom/google/android/gms/internal/ads/zzdfc;)Lcom/google/android/gms/internal/ads/zzdjg;

    new-instance p2, Lcom/google/android/gms/internal/ads/zzenl;

    iget-object p3, p0, Lcom/google/android/gms/internal/ads/zzfew;->zzf:Lcom/google/android/gms/internal/ads/zzbfk;

    invoke-direct {p2, p3}, Lcom/google/android/gms/internal/ads/zzenl;-><init>(Lcom/google/android/gms/internal/ads/zzbfk;)V

    .line 48
    invoke-interface {v0, p2}, Lcom/google/android/gms/internal/ads/zzdjg;->zzc(Lcom/google/android/gms/internal/ads/zzenl;)Lcom/google/android/gms/internal/ads/zzdjg;

    .line 49
    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzdjg;->zzf()Lcom/google/android/gms/internal/ads/zzdjh;

    move-result-object p2

    goto/16 :goto_0

    .line 50
    :goto_1
    sget-object p2, Lcom/google/android/gms/internal/ads/zzbgd;->zzc:Lcom/google/android/gms/internal/ads/zzbfv;

    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/zzbfv;->zze()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-eqz p2, :cond_5

    .line 51
    invoke-virtual {v8}, Lcom/google/android/gms/internal/ads/zzdjh;->zzf()Lcom/google/android/gms/internal/ads/zzfmn;

    move-result-object p2

    sget-object p3, Lcom/google/android/gms/internal/ads/zzfmw;->zzc:Lcom/google/android/gms/internal/ads/zzfmw;

    .line 52
    invoke-virtual {p2, p3}, Lcom/google/android/gms/internal/ads/zzfmn;->zzd(Lcom/google/android/gms/internal/ads/zzfmw;)Lcom/google/android/gms/internal/ads/zzfmn;

    iget-object p3, p1, Lcom/google/android/gms/ads/internal/client/zzl;->zzp:Ljava/lang/String;

    .line 53
    invoke-virtual {p2, p3}, Lcom/google/android/gms/internal/ads/zzfmn;->zzb(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzfmn;

    iget-object p1, p1, Lcom/google/android/gms/ads/internal/client/zzl;->zzm:Landroid/os/Bundle;

    .line 54
    invoke-virtual {p2, p1}, Lcom/google/android/gms/internal/ads/zzfmn;->zzg(Landroid/os/Bundle;)Lcom/google/android/gms/internal/ads/zzfmn;

    move-object v6, p2

    goto :goto_2

    :cond_5
    const/4 p1, 0x0

    move-object v6, p1

    .line 55
    :goto_2
    invoke-virtual {v8}, Lcom/google/android/gms/internal/ads/zzdjh;->zza()Lcom/google/android/gms/internal/ads/zzcvx;

    move-result-object p1

    .line 56
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzcvx;->zzj()Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/ads/zzcvx;->zzi(Lcom/google/common/util/concurrent/ListenableFuture;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzfew;->zzi:Lcom/google/common/util/concurrent/ListenableFuture;

    new-instance p2, Lcom/google/android/gms/internal/ads/zzfev;

    move-object v3, p2

    move-object v4, p0

    move-object v5, p4

    invoke-direct/range {v3 .. v8}, Lcom/google/android/gms/internal/ads/zzfev;-><init>(Lcom/google/android/gms/internal/ads/zzfew;Lcom/google/android/gms/internal/ads/zzepr;Lcom/google/android/gms/internal/ads/zzfmn;Lcom/google/android/gms/internal/ads/zzfmc;Lcom/google/android/gms/internal/ads/zzdjh;)V

    iget-object p3, p0, Lcom/google/android/gms/internal/ads/zzfew;->zzb:Ljava/util/concurrent/Executor;

    .line 57
    invoke-static {p1, p2, p3}, Lcom/google/android/gms/internal/ads/zzgft;->zzr(Lcom/google/common/util/concurrent/ListenableFuture;Lcom/google/android/gms/internal/ads/zzgfp;Ljava/util/concurrent/Executor;)V

    return v2
.end method

.method final synthetic zzh()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfew;->zzd:Lcom/google/android/gms/internal/ads/zzepc;

    const/4 v1, 0x6

    const/4 v2, 0x0

    invoke-static {v1, v2, v2}, Lcom/google/android/gms/internal/ads/zzfiq;->zzd(ILjava/lang/String;Lcom/google/android/gms/ads/internal/client/zze;)Lcom/google/android/gms/ads/internal/client/zze;

    move-result-object v1

    .line 2
    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzepc;->zzdB(Lcom/google/android/gms/ads/internal/client/zze;)V

    return-void
.end method

.method public final zzi(Lcom/google/android/gms/internal/ads/zzbfk;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzfew;->zzf:Lcom/google/android/gms/internal/ads/zzbfk;

    return-void
.end method
