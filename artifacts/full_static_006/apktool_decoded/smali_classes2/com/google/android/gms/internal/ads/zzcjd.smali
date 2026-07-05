.class public abstract Lcom/google/android/gms/internal/ads/zzcjd;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@23.2.0"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzcoq;


# static fields
.field private static zza:Lcom/google/android/gms/internal/ads/zzcjd;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static declared-synchronized zzD(Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzbrf;IZILcom/google/android/gms/internal/ads/zzcki;)Lcom/google/android/gms/internal/ads/zzcjd;
    .locals 4
    .param p1    # Lcom/google/android/gms/internal/ads/zzbrf;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    const-class p2, Lcom/google/android/gms/internal/ads/zzcjd;

    monitor-enter p2

    .line 1
    :try_start_0
    sget-object p3, Lcom/google/android/gms/internal/ads/zzcjd;->zza:Lcom/google/android/gms/internal/ads/zzcjd;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p3, :cond_0

    monitor-exit p2

    return-object p3

    :cond_0
    :try_start_1
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzu;->zzB()Lcom/google/android/gms/common/util/Clock;

    move-result-object p3

    invoke-interface {p3}, Lcom/google/android/gms/common/util/Clock;->currentTimeMillis()J

    move-result-wide v0

    .line 2
    invoke-static {p0}, Lcom/google/android/gms/internal/ads/zzbep;->zza(Landroid/content/Context;)V

    .line 3
    sget-object p3, Lcom/google/android/gms/internal/ads/zzbgc;->zze:Lcom/google/android/gms/internal/ads/zzbfv;

    invoke-virtual {p3}, Lcom/google/android/gms/internal/ads/zzbfv;->zze()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/Boolean;

    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p3

    if-eqz p3, :cond_1

    .line 4
    invoke-static {p0}, Lcom/google/android/gms/internal/ads/zzbdz;->zzd(Landroid/content/Context;)V

    .line 5
    :cond_1
    invoke-static {p0}, Lcom/google/android/gms/internal/ads/zzfik;->zzd(Landroid/content/Context;)Lcom/google/android/gms/internal/ads/zzfik;

    move-result-object p3

    const v2, 0xe69aab0

    const/4 v3, 0x0

    .line 6
    invoke-virtual {p3, v2, v3, p4}, Lcom/google/android/gms/internal/ads/zzfik;->zzc(IZI)Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;

    move-result-object p4

    .line 7
    invoke-virtual {p3, p1}, Lcom/google/android/gms/internal/ads/zzfik;->zzf(Lcom/google/android/gms/internal/ads/zzbrf;)V

    new-instance p1, Lcom/google/android/gms/internal/ads/zzclw;

    const/4 p3, 0x0

    invoke-direct {p1, p3}, Lcom/google/android/gms/internal/ads/zzclw;-><init>(Lcom/google/android/gms/internal/ads/zzclv;)V

    new-instance v2, Lcom/google/android/gms/internal/ads/zzcje;

    invoke-direct {v2}, Lcom/google/android/gms/internal/ads/zzcje;-><init>()V

    .line 8
    invoke-virtual {v2, p4}, Lcom/google/android/gms/internal/ads/zzcje;->zzf(Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;)Lcom/google/android/gms/internal/ads/zzcje;

    .line 9
    invoke-virtual {v2, p0}, Lcom/google/android/gms/internal/ads/zzcje;->zze(Landroid/content/Context;)Lcom/google/android/gms/internal/ads/zzcje;

    .line 10
    invoke-virtual {v2, v0, v1}, Lcom/google/android/gms/internal/ads/zzcje;->zzd(J)Lcom/google/android/gms/internal/ads/zzcje;

    new-instance v0, Lcom/google/android/gms/internal/ads/zzcjg;

    invoke-direct {v0, v2, p3}, Lcom/google/android/gms/internal/ads/zzcjg;-><init>(Lcom/google/android/gms/internal/ads/zzcje;Lcom/google/android/gms/internal/ads/zzcjf;)V

    .line 11
    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/ads/zzclw;->zzb(Lcom/google/android/gms/internal/ads/zzcjg;)Lcom/google/android/gms/internal/ads/zzclw;

    new-instance p3, Lcom/google/android/gms/internal/ads/zzcnj;

    invoke-direct {p3, p5}, Lcom/google/android/gms/internal/ads/zzcnj;-><init>(Lcom/google/android/gms/internal/ads/zzcki;)V

    .line 12
    invoke-virtual {p1, p3}, Lcom/google/android/gms/internal/ads/zzclw;->zzc(Lcom/google/android/gms/internal/ads/zzcnj;)Lcom/google/android/gms/internal/ads/zzclw;

    .line 13
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzclw;->zza()Lcom/google/android/gms/internal/ads/zzcjd;

    move-result-object p1

    .line 14
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzu;->zzo()Lcom/google/android/gms/internal/ads/zzcby;

    move-result-object p3

    invoke-virtual {p3, p0, p4}, Lcom/google/android/gms/internal/ads/zzcby;->zzu(Landroid/content/Context;Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;)V

    .line 15
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzu;->zzc()Lcom/google/android/gms/internal/ads/zzbcu;

    move-result-object p3

    invoke-virtual {p3, p0}, Lcom/google/android/gms/internal/ads/zzbcu;->zzi(Landroid/content/Context;)V

    .line 16
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzu;->zzp()Lcom/google/android/gms/ads/internal/util/zzt;

    move-result-object p3

    invoke-virtual {p3, p0}, Lcom/google/android/gms/ads/internal/util/zzt;->zzl(Landroid/content/Context;)Z

    .line 17
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzu;->zzp()Lcom/google/android/gms/ads/internal/util/zzt;

    move-result-object p3

    invoke-virtual {p3, p0}, Lcom/google/android/gms/ads/internal/util/zzt;->zzk(Landroid/content/Context;)Z

    .line 18
    invoke-static {p0}, Lcom/google/android/gms/ads/internal/util/zzd;->zza(Landroid/content/Context;)V

    .line 19
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzu;->zzb()Lcom/google/android/gms/internal/ads/zzbbh;

    move-result-object p3

    invoke-virtual {p3, p0}, Lcom/google/android/gms/internal/ads/zzbbh;->zzd(Landroid/content/Context;)V

    .line 20
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzu;->zzv()Lcom/google/android/gms/ads/internal/util/zzcm;

    move-result-object p3

    invoke-virtual {p3, p0}, Lcom/google/android/gms/ads/internal/util/zzcm;->zzb(Landroid/content/Context;)V

    .line 21
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzcjd;->zza()Lcom/google/android/gms/ads/internal/util/zzcf;

    move-result-object p3

    invoke-virtual {p3}, Lcom/google/android/gms/ads/internal/util/zzcf;->zzc()V

    .line 22
    invoke-static {p0}, Lcom/google/android/gms/internal/ads/zzcav;->zzd(Landroid/content/Context;)Lcom/google/android/gms/internal/ads/zzcav;

    sget-object p3, Lcom/google/android/gms/internal/ads/zzbep;->zzgs:Lcom/google/android/gms/internal/ads/zzbeg;

    .line 23
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/google/android/gms/internal/ads/zzben;

    move-result-object p5

    invoke-virtual {p5, p3}, Lcom/google/android/gms/internal/ads/zzben;->zza(Lcom/google/android/gms/internal/ads/zzbeg;)Ljava/lang/Object;

    move-result-object p3

    .line 24
    check-cast p3, Ljava/lang/Boolean;

    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p3

    if-eqz p3, :cond_2

    sget-object p3, Lcom/google/android/gms/internal/ads/zzbep;->zzaw:Lcom/google/android/gms/internal/ads/zzbeg;

    .line 25
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/google/android/gms/internal/ads/zzben;

    move-result-object p5

    invoke-virtual {p5, p3}, Lcom/google/android/gms/internal/ads/zzben;->zza(Lcom/google/android/gms/internal/ads/zzbeg;)Ljava/lang/Object;

    move-result-object p3

    .line 26
    check-cast p3, Ljava/lang/Boolean;

    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p3

    if-nez p3, :cond_2

    new-instance p3, Lcom/google/android/gms/internal/ads/zzefm;

    new-instance p5, Lcom/google/android/gms/internal/ads/zzbdm;

    new-instance v0, Lcom/google/android/gms/internal/ads/zzbdu;

    .line 27
    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/ads/zzbdu;-><init>(Landroid/content/Context;)V

    invoke-direct {p5, v0}, Lcom/google/android/gms/internal/ads/zzbdm;-><init>(Lcom/google/android/gms/internal/ads/zzbdu;)V

    new-instance v0, Lcom/google/android/gms/internal/ads/zzeer;

    new-instance v1, Lcom/google/android/gms/internal/ads/zzeen;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/ads/zzeen;-><init>(Landroid/content/Context;)V

    .line 28
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzcjd;->zzA()Lcom/google/android/gms/internal/ads/zzgge;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/internal/ads/zzeer;-><init>(Lcom/google/android/gms/internal/ads/zzeen;Lcom/google/android/gms/internal/ads/zzgge;)V

    invoke-direct {p3, p0, p4, p5, v0}, Lcom/google/android/gms/internal/ads/zzefm;-><init>(Landroid/content/Context;Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;Lcom/google/android/gms/internal/ads/zzbdm;Lcom/google/android/gms/internal/ads/zzeer;)V

    .line 29
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzu;->zzo()Lcom/google/android/gms/internal/ads/zzcby;

    move-result-object p0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzcby;->zzi()Lcom/google/android/gms/ads/internal/util/zzg;

    move-result-object p0

    invoke-interface {p0}, Lcom/google/android/gms/ads/internal/util/zzg;->zzS()Z

    move-result p0

    invoke-virtual {p3, p0}, Lcom/google/android/gms/internal/ads/zzefm;->zzb(Z)V

    :cond_2
    sput-object p1, Lcom/google/android/gms/internal/ads/zzcjd;->zza:Lcom/google/android/gms/internal/ads/zzcjd;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p2

    return-object p1

    :catchall_0
    move-exception p0

    :try_start_2
    monitor-exit p2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p0
.end method

.method public static zzb(Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzbrf;I)Lcom/google/android/gms/internal/ads/zzcjd;
    .locals 6
    .param p1    # Lcom/google/android/gms/internal/ads/zzbrf;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    new-instance v5, Lcom/google/android/gms/internal/ads/zzcki;

    invoke-direct {v5}, Lcom/google/android/gms/internal/ads/zzcki;-><init>()V

    const v2, 0xe69aab0

    const/4 v3, 0x0

    move-object v0, p0

    move-object v1, p1

    move v4, p2

    invoke-static/range {v0 .. v5}, Lcom/google/android/gms/internal/ads/zzcjd;->zzD(Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzbrf;IZILcom/google/android/gms/internal/ads/zzcki;)Lcom/google/android/gms/internal/ads/zzcjd;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public abstract zzA()Lcom/google/android/gms/internal/ads/zzgge;
.end method

.method public abstract zzB()Ljava/util/concurrent/Executor;
.end method

.method public abstract zzC()Ljava/util/concurrent/ScheduledExecutorService;
.end method

.method public abstract zza()Lcom/google/android/gms/ads/internal/util/zzcf;
.end method

.method public abstract zzc()Lcom/google/android/gms/internal/ads/zzcnt;
.end method

.method public abstract zzd()Lcom/google/android/gms/internal/ads/zzcrs;
.end method

.method public abstract zze()Lcom/google/android/gms/internal/ads/zzctf;
.end method

.method public abstract zzf()Lcom/google/android/gms/internal/ads/zzdca;
.end method

.method public abstract zzg()Lcom/google/android/gms/internal/ads/zzdjg;
.end method

.method public abstract zzh()Lcom/google/android/gms/internal/ads/zzdkc;
.end method

.method public abstract zzi()Lcom/google/android/gms/internal/ads/zzdrl;
.end method

.method public abstract zzj()Lcom/google/android/gms/internal/ads/zzdvc;
.end method

.method public abstract zzk()Lcom/google/android/gms/internal/ads/zzdwl;
.end method

.method public abstract zzl()Lcom/google/android/gms/internal/ads/zzdya;
.end method

.method public abstract zzm()Lcom/google/android/gms/internal/ads/zzdyx;
.end method

.method public abstract zzn()Lcom/google/android/gms/internal/ads/zzegk;
.end method

.method public abstract zzo()Lcom/google/android/gms/ads/nonagon/signalgeneration/zzk;
.end method

.method public abstract zzp()Lcom/google/android/gms/ads/nonagon/signalgeneration/zzq;
.end method

.method public abstract zzq()Lcom/google/android/gms/ads/nonagon/signalgeneration/zzaj;
.end method

.method public final zzr(Lcom/google/android/gms/internal/ads/zzbxu;I)Lcom/google/android/gms/internal/ads/zzeyv;
    .locals 1

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/ads/zzfay;

    invoke-direct {v0, p1, p2}, Lcom/google/android/gms/internal/ads/zzfay;-><init>(Lcom/google/android/gms/internal/ads/zzbxu;I)V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ads/zzcjd;->zzs(Lcom/google/android/gms/internal/ads/zzfay;)Lcom/google/android/gms/internal/ads/zzeyv;

    move-result-object p1

    return-object p1
.end method

.method protected abstract zzs(Lcom/google/android/gms/internal/ads/zzfay;)Lcom/google/android/gms/internal/ads/zzeyv;
.end method

.method public abstract zzt()Lcom/google/android/gms/internal/ads/zzfbt;
.end method

.method public abstract zzu()Lcom/google/android/gms/internal/ads/zzfdh;
.end method

.method public abstract zzv()Lcom/google/android/gms/internal/ads/zzfey;
.end method

.method public abstract zzw()Lcom/google/android/gms/internal/ads/zzfgm;
.end method

.method public abstract zzx()Lcom/google/android/gms/internal/ads/zzfid;
.end method

.method public abstract zzy()Lcom/google/android/gms/internal/ads/zzfin;
.end method

.method public abstract zzz()Lcom/google/android/gms/internal/ads/zzfmq;
.end method
