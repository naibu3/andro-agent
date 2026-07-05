.class public final Lcom/google/android/gms/internal/ads/zzfdf;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@23.2.0"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzeps;


# instance fields
.field private final zza:Landroid/content/Context;

.field private final zzb:Ljava/util/concurrent/Executor;

.field private final zzc:Lcom/google/android/gms/internal/ads/zzcjd;

.field private final zzd:Lcom/google/android/gms/internal/ads/zzepc;

.field private final zze:Lcom/google/android/gms/internal/ads/zzepg;

.field private final zzf:Landroid/view/ViewGroup;

.field private zzg:Lcom/google/android/gms/internal/ads/zzbfk;

.field private final zzh:Lcom/google/android/gms/internal/ads/zzdca;

.field private final zzi:Lcom/google/android/gms/internal/ads/zzfmq;

.field private final zzj:Lcom/google/android/gms/internal/ads/zzdeh;

.field private final zzk:Lcom/google/android/gms/internal/ads/zzfhm;

.field private zzl:Lcom/google/common/util/concurrent/ListenableFuture;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/util/concurrent/Executor;Lcom/google/android/gms/ads/internal/client/zzq;Lcom/google/android/gms/internal/ads/zzcjd;Lcom/google/android/gms/internal/ads/zzepc;Lcom/google/android/gms/internal/ads/zzepg;Lcom/google/android/gms/internal/ads/zzfhm;Lcom/google/android/gms/internal/ads/zzdeh;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzfdf;->zza:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzfdf;->zzb:Ljava/util/concurrent/Executor;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/zzfdf;->zzc:Lcom/google/android/gms/internal/ads/zzcjd;

    iput-object p5, p0, Lcom/google/android/gms/internal/ads/zzfdf;->zzd:Lcom/google/android/gms/internal/ads/zzepc;

    iput-object p6, p0, Lcom/google/android/gms/internal/ads/zzfdf;->zze:Lcom/google/android/gms/internal/ads/zzepg;

    iput-object p7, p0, Lcom/google/android/gms/internal/ads/zzfdf;->zzk:Lcom/google/android/gms/internal/ads/zzfhm;

    invoke-virtual {p4}, Lcom/google/android/gms/internal/ads/zzcjd;->zzf()Lcom/google/android/gms/internal/ads/zzdca;

    move-result-object p2

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzfdf;->zzh:Lcom/google/android/gms/internal/ads/zzdca;

    .line 2
    invoke-virtual {p4}, Lcom/google/android/gms/internal/ads/zzcjd;->zzz()Lcom/google/android/gms/internal/ads/zzfmq;

    move-result-object p2

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzfdf;->zzi:Lcom/google/android/gms/internal/ads/zzfmq;

    new-instance p2, Landroid/widget/FrameLayout;

    .line 3
    invoke-direct {p2, p1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzfdf;->zzf:Landroid/view/ViewGroup;

    iput-object p8, p0, Lcom/google/android/gms/internal/ads/zzfdf;->zzj:Lcom/google/android/gms/internal/ads/zzdeh;

    .line 4
    invoke-virtual {p7, p3}, Lcom/google/android/gms/internal/ads/zzfhm;->zzs(Lcom/google/android/gms/ads/internal/client/zzq;)Lcom/google/android/gms/internal/ads/zzfhm;

    return-void
.end method

.method static bridge synthetic zzc(Lcom/google/android/gms/internal/ads/zzfdf;)Landroid/view/ViewGroup;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/zzfdf;->zzf:Landroid/view/ViewGroup;

    return-object p0
.end method

.method static bridge synthetic zze(Lcom/google/android/gms/internal/ads/zzfdf;)Lcom/google/android/gms/internal/ads/zzdca;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/zzfdf;->zzh:Lcom/google/android/gms/internal/ads/zzdca;

    return-object p0
.end method

.method static bridge synthetic zzf(Lcom/google/android/gms/internal/ads/zzfdf;)Lcom/google/android/gms/internal/ads/zzdeh;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/zzfdf;->zzj:Lcom/google/android/gms/internal/ads/zzdeh;

    return-object p0
.end method

.method static bridge synthetic zzg(Lcom/google/android/gms/internal/ads/zzfdf;)Lcom/google/android/gms/internal/ads/zzepc;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/zzfdf;->zzd:Lcom/google/android/gms/internal/ads/zzepc;

    return-object p0
.end method

.method static bridge synthetic zzh(Lcom/google/android/gms/internal/ads/zzfdf;)Lcom/google/android/gms/internal/ads/zzepg;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/zzfdf;->zze:Lcom/google/android/gms/internal/ads/zzepg;

    return-object p0
.end method

.method static bridge synthetic zzj(Lcom/google/android/gms/internal/ads/zzfdf;)Lcom/google/android/gms/internal/ads/zzfmq;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/zzfdf;->zzi:Lcom/google/android/gms/internal/ads/zzfmq;

    return-object p0
.end method

.method static bridge synthetic zzk(Lcom/google/android/gms/internal/ads/zzfdf;)Ljava/util/concurrent/Executor;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/zzfdf;->zzb:Ljava/util/concurrent/Executor;

    return-object p0
.end method

.method static bridge synthetic zzl(Lcom/google/android/gms/internal/ads/zzfdf;Lcom/google/common/util/concurrent/ListenableFuture;)V
    .locals 0

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzfdf;->zzl:Lcom/google/common/util/concurrent/ListenableFuture;

    return-void
.end method


# virtual methods
.method public final zza()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfdf;->zzl:Lcom/google/common/util/concurrent/ListenableFuture;

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
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    const/4 p3, 0x0

    if-nez p2, :cond_0

    .line 1
    const-string p1, "Ad unit ID should not be null for banner ad."

    invoke-static {p1}, Lcom/google/android/gms/ads/internal/util/client/zzm;->zzg(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzfdf;->zzb:Ljava/util/concurrent/Executor;

    new-instance p2, Lcom/google/android/gms/internal/ads/zzfdb;

    invoke-direct {p2, p0}, Lcom/google/android/gms/internal/ads/zzfdb;-><init>(Lcom/google/android/gms/internal/ads/zzfdf;)V

    .line 2
    invoke-interface {p1, p2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return p3

    .line 3
    :cond_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzfdf;->zza()Z

    move-result v0

    if-eqz v0, :cond_1

    goto/16 :goto_0

    .line 4
    :cond_1
    sget-object v0, Lcom/google/android/gms/internal/ads/zzbep;->zziU:Lcom/google/android/gms/internal/ads/zzbeg;

    .line 5
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/google/android/gms/internal/ads/zzben;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/zzben;->zza(Lcom/google/android/gms/internal/ads/zzbeg;)Ljava/lang/Object;

    move-result-object v0

    .line 4
    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_2

    iget-boolean v0, p1, Lcom/google/android/gms/ads/internal/client/zzl;->zzf:Z

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfdf;->zzc:Lcom/google/android/gms/internal/ads/zzcjd;

    .line 6
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzcjd;->zzl()Lcom/google/android/gms/internal/ads/zzdya;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzdya;->zzo(Z)V

    :cond_2
    const/4 v0, 0x2

    new-array v0, v0, [Landroid/util/Pair;

    new-instance v2, Landroid/util/Pair;

    .line 7
    sget-object v3, Lcom/google/android/gms/internal/ads/zzdul;->zza:Lcom/google/android/gms/internal/ads/zzdul;

    .line 8
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzdul;->zza()Ljava/lang/String;

    move-result-object v3

    iget-wide v4, p1, Lcom/google/android/gms/ads/internal/client/zzl;->zzz:J

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-direct {v2, v3, v4}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    aput-object v2, v0, p3

    new-instance v2, Landroid/util/Pair;

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

    invoke-direct {v2, v3, v4}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    aput-object v2, v0, v1

    .line 11
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzdun;->zza([Landroid/util/Pair;)Landroid/os/Bundle;

    move-result-object v0

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzfdf;->zzk:Lcom/google/android/gms/internal/ads/zzfhm;

    .line 12
    invoke-virtual {v2, p2}, Lcom/google/android/gms/internal/ads/zzfhm;->zzt(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzfhm;

    .line 13
    invoke-virtual {v2, p1}, Lcom/google/android/gms/internal/ads/zzfhm;->zzH(Lcom/google/android/gms/ads/internal/client/zzl;)Lcom/google/android/gms/internal/ads/zzfhm;

    .line 14
    invoke-virtual {v2, v0}, Lcom/google/android/gms/internal/ads/zzfhm;->zzA(Landroid/os/Bundle;)Lcom/google/android/gms/internal/ads/zzfhm;

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/zzfdf;->zza:Landroid/content/Context;

    .line 15
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzfhm;->zzJ()Lcom/google/android/gms/internal/ads/zzfho;

    move-result-object v0

    .line 16
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzfmm;->zza(Lcom/google/android/gms/internal/ads/zzfho;)Lcom/google/android/gms/internal/ads/zzfmu;

    move-result-object v2

    sget-object v3, Lcom/google/android/gms/internal/ads/zzfmw;->zzb:Lcom/google/android/gms/internal/ads/zzfmw;

    .line 17
    invoke-static {p2, v2, v3, p1}, Lcom/google/android/gms/internal/ads/zzfmb;->zzb(Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzfmu;Lcom/google/android/gms/internal/ads/zzfmw;Lcom/google/android/gms/ads/internal/client/zzl;)Lcom/google/android/gms/internal/ads/zzfmc;

    move-result-object v8

    .line 18
    sget-object p2, Lcom/google/android/gms/internal/ads/zzbgq;->zze:Lcom/google/android/gms/internal/ads/zzbfv;

    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/zzbfv;->zze()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    const/4 v2, 0x0

    if-eqz p2, :cond_4

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/zzfdf;->zzk:Lcom/google/android/gms/internal/ads/zzfhm;

    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/zzfhm;->zzh()Lcom/google/android/gms/ads/internal/client/zzq;

    move-result-object p2

    .line 19
    iget-boolean p2, p2, Lcom/google/android/gms/ads/internal/client/zzq;->zzk:Z

    if-eqz p2, :cond_4

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzfdf;->zzd:Lcom/google/android/gms/internal/ads/zzepc;

    if-eqz p1, :cond_3

    const/4 p2, 0x7

    .line 62
    invoke-static {p2, v2, v2}, Lcom/google/android/gms/internal/ads/zzfiq;->zzd(ILjava/lang/String;Lcom/google/android/gms/ads/internal/client/zze;)Lcom/google/android/gms/ads/internal/client/zze;

    move-result-object p2

    .line 63
    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/ads/zzepc;->zzdB(Lcom/google/android/gms/ads/internal/client/zze;)V

    :cond_3
    :goto_0
    return p3

    :cond_4
    sget-object p2, Lcom/google/android/gms/internal/ads/zzbep;->zzik:Lcom/google/android/gms/internal/ads/zzbeg;

    .line 20
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/google/android/gms/internal/ads/zzben;

    move-result-object p3

    invoke-virtual {p3, p2}, Lcom/google/android/gms/internal/ads/zzben;->zza(Lcom/google/android/gms/internal/ads/zzbeg;)Ljava/lang/Object;

    move-result-object p2

    .line 21
    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-eqz p2, :cond_5

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/zzfdf;->zzc:Lcom/google/android/gms/internal/ads/zzcjd;

    .line 22
    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/zzcjd;->zze()Lcom/google/android/gms/internal/ads/zzctf;

    move-result-object p2

    new-instance p3, Lcom/google/android/gms/internal/ads/zzcyt;

    invoke-direct {p3}, Lcom/google/android/gms/internal/ads/zzcyt;-><init>()V

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzfdf;->zza:Landroid/content/Context;

    .line 23
    invoke-virtual {p3, v3}, Lcom/google/android/gms/internal/ads/zzcyt;->zze(Landroid/content/Context;)Lcom/google/android/gms/internal/ads/zzcyt;

    .line 24
    invoke-virtual {p3, v0}, Lcom/google/android/gms/internal/ads/zzcyt;->zzi(Lcom/google/android/gms/internal/ads/zzfho;)Lcom/google/android/gms/internal/ads/zzcyt;

    invoke-virtual {p3}, Lcom/google/android/gms/internal/ads/zzcyt;->zzj()Lcom/google/android/gms/internal/ads/zzcyv;

    move-result-object p3

    .line 25
    invoke-interface {p2, p3}, Lcom/google/android/gms/internal/ads/zzctf;->zzi(Lcom/google/android/gms/internal/ads/zzcyv;)Lcom/google/android/gms/internal/ads/zzctf;

    new-instance p3, Lcom/google/android/gms/internal/ads/zzdfa;

    invoke-direct {p3}, Lcom/google/android/gms/internal/ads/zzdfa;-><init>()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfdf;->zzd:Lcom/google/android/gms/internal/ads/zzepc;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzfdf;->zzb:Ljava/util/concurrent/Executor;

    .line 26
    invoke-virtual {p3, v0, v3}, Lcom/google/android/gms/internal/ads/zzdfa;->zzj(Lcom/google/android/gms/internal/ads/zzdcg;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/zzdfa;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfdf;->zzd:Lcom/google/android/gms/internal/ads/zzepc;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzfdf;->zzb:Ljava/util/concurrent/Executor;

    .line 27
    invoke-virtual {p3, v0, v3}, Lcom/google/android/gms/internal/ads/zzdfa;->zzk(Lcom/google/android/gms/ads/admanager/AppEventListener;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/zzdfa;

    invoke-virtual {p3}, Lcom/google/android/gms/internal/ads/zzdfa;->zzn()Lcom/google/android/gms/internal/ads/zzdfc;

    move-result-object p3

    .line 28
    invoke-interface {p2, p3}, Lcom/google/android/gms/internal/ads/zzctf;->zzf(Lcom/google/android/gms/internal/ads/zzdfc;)Lcom/google/android/gms/internal/ads/zzctf;

    new-instance p3, Lcom/google/android/gms/internal/ads/zzenl;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfdf;->zzg:Lcom/google/android/gms/internal/ads/zzbfk;

    invoke-direct {p3, v0}, Lcom/google/android/gms/internal/ads/zzenl;-><init>(Lcom/google/android/gms/internal/ads/zzbfk;)V

    .line 29
    invoke-interface {p2, p3}, Lcom/google/android/gms/internal/ads/zzctf;->zze(Lcom/google/android/gms/internal/ads/zzenl;)Lcom/google/android/gms/internal/ads/zzctf;

    new-instance p3, Lcom/google/android/gms/internal/ads/zzdjy;

    sget-object v0, Lcom/google/android/gms/internal/ads/zzdme;->zza:Lcom/google/android/gms/internal/ads/zzdme;

    invoke-direct {p3, v0, v2}, Lcom/google/android/gms/internal/ads/zzdjy;-><init>(Lcom/google/android/gms/internal/ads/zzdme;Lcom/google/android/gms/ads/internal/client/zzbh;)V

    .line 30
    invoke-interface {p2, p3}, Lcom/google/android/gms/internal/ads/zzctf;->zzd(Lcom/google/android/gms/internal/ads/zzdjy;)Lcom/google/android/gms/internal/ads/zzctf;

    iget-object p3, p0, Lcom/google/android/gms/internal/ads/zzfdf;->zzh:Lcom/google/android/gms/internal/ads/zzdca;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfdf;->zzj:Lcom/google/android/gms/internal/ads/zzdeh;

    new-instance v3, Lcom/google/android/gms/internal/ads/zzcuh;

    invoke-direct {v3, p3, v0}, Lcom/google/android/gms/internal/ads/zzcuh;-><init>(Lcom/google/android/gms/internal/ads/zzdca;Lcom/google/android/gms/internal/ads/zzdeh;)V

    .line 31
    invoke-interface {p2, v3}, Lcom/google/android/gms/internal/ads/zzctf;->zzg(Lcom/google/android/gms/internal/ads/zzcuh;)Lcom/google/android/gms/internal/ads/zzctf;

    iget-object p3, p0, Lcom/google/android/gms/internal/ads/zzfdf;->zzf:Landroid/view/ViewGroup;

    new-instance v0, Lcom/google/android/gms/internal/ads/zzcsc;

    invoke-direct {v0, p3}, Lcom/google/android/gms/internal/ads/zzcsc;-><init>(Landroid/view/ViewGroup;)V

    .line 32
    invoke-interface {p2, v0}, Lcom/google/android/gms/internal/ads/zzctf;->zzc(Lcom/google/android/gms/internal/ads/zzcsc;)Lcom/google/android/gms/internal/ads/zzctf;

    .line 33
    invoke-interface {p2}, Lcom/google/android/gms/internal/ads/zzctf;->zzk()Lcom/google/android/gms/internal/ads/zzctg;

    move-result-object p2

    goto/16 :goto_1

    .line 61
    :cond_5
    iget-object p2, p0, Lcom/google/android/gms/internal/ads/zzfdf;->zzc:Lcom/google/android/gms/internal/ads/zzcjd;

    .line 34
    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/zzcjd;->zze()Lcom/google/android/gms/internal/ads/zzctf;

    move-result-object p2

    new-instance p3, Lcom/google/android/gms/internal/ads/zzcyt;

    invoke-direct {p3}, Lcom/google/android/gms/internal/ads/zzcyt;-><init>()V

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzfdf;->zza:Landroid/content/Context;

    .line 35
    invoke-virtual {p3, v3}, Lcom/google/android/gms/internal/ads/zzcyt;->zze(Landroid/content/Context;)Lcom/google/android/gms/internal/ads/zzcyt;

    .line 36
    invoke-virtual {p3, v0}, Lcom/google/android/gms/internal/ads/zzcyt;->zzi(Lcom/google/android/gms/internal/ads/zzfho;)Lcom/google/android/gms/internal/ads/zzcyt;

    invoke-virtual {p3}, Lcom/google/android/gms/internal/ads/zzcyt;->zzj()Lcom/google/android/gms/internal/ads/zzcyv;

    move-result-object p3

    .line 37
    invoke-interface {p2, p3}, Lcom/google/android/gms/internal/ads/zzctf;->zzi(Lcom/google/android/gms/internal/ads/zzcyv;)Lcom/google/android/gms/internal/ads/zzctf;

    new-instance p3, Lcom/google/android/gms/internal/ads/zzdfa;

    invoke-direct {p3}, Lcom/google/android/gms/internal/ads/zzdfa;-><init>()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfdf;->zzd:Lcom/google/android/gms/internal/ads/zzepc;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzfdf;->zzb:Ljava/util/concurrent/Executor;

    .line 38
    invoke-virtual {p3, v0, v3}, Lcom/google/android/gms/internal/ads/zzdfa;->zzj(Lcom/google/android/gms/internal/ads/zzdcg;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/zzdfa;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfdf;->zzd:Lcom/google/android/gms/internal/ads/zzepc;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzfdf;->zzb:Ljava/util/concurrent/Executor;

    .line 39
    invoke-virtual {p3, v0, v3}, Lcom/google/android/gms/internal/ads/zzdfa;->zza(Lcom/google/android/gms/ads/internal/client/zza;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/zzdfa;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfdf;->zze:Lcom/google/android/gms/internal/ads/zzepg;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzfdf;->zzb:Ljava/util/concurrent/Executor;

    .line 40
    invoke-virtual {p3, v0, v3}, Lcom/google/android/gms/internal/ads/zzdfa;->zza(Lcom/google/android/gms/ads/internal/client/zza;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/zzdfa;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfdf;->zzd:Lcom/google/android/gms/internal/ads/zzepc;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzfdf;->zzb:Ljava/util/concurrent/Executor;

    .line 41
    invoke-virtual {p3, v0, v3}, Lcom/google/android/gms/internal/ads/zzdfa;->zzl(Lcom/google/android/gms/internal/ads/zzdhi;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/zzdfa;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfdf;->zzd:Lcom/google/android/gms/internal/ads/zzepc;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzfdf;->zzb:Ljava/util/concurrent/Executor;

    .line 42
    invoke-virtual {p3, v0, v3}, Lcom/google/android/gms/internal/ads/zzdfa;->zzd(Lcom/google/android/gms/internal/ads/zzdaf;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/zzdfa;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfdf;->zzd:Lcom/google/android/gms/internal/ads/zzepc;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzfdf;->zzb:Ljava/util/concurrent/Executor;

    .line 43
    invoke-virtual {p3, v0, v3}, Lcom/google/android/gms/internal/ads/zzdfa;->zze(Lcom/google/android/gms/internal/ads/zzczl;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/zzdfa;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfdf;->zzd:Lcom/google/android/gms/internal/ads/zzepc;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzfdf;->zzb:Ljava/util/concurrent/Executor;

    .line 44
    invoke-virtual {p3, v0, v3}, Lcom/google/android/gms/internal/ads/zzdfa;->zzf(Lcom/google/android/gms/internal/ads/zzdaz;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/zzdfa;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfdf;->zzd:Lcom/google/android/gms/internal/ads/zzepc;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzfdf;->zzb:Ljava/util/concurrent/Executor;

    .line 45
    invoke-virtual {p3, v0, v3}, Lcom/google/android/gms/internal/ads/zzdfa;->zzb(Lcom/google/android/gms/internal/ads/zzczo;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/zzdfa;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfdf;->zzd:Lcom/google/android/gms/internal/ads/zzepc;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzfdf;->zzb:Ljava/util/concurrent/Executor;

    .line 46
    invoke-virtual {p3, v0, v3}, Lcom/google/android/gms/internal/ads/zzdfa;->zzk(Lcom/google/android/gms/ads/admanager/AppEventListener;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/zzdfa;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfdf;->zzd:Lcom/google/android/gms/internal/ads/zzepc;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzfdf;->zzb:Ljava/util/concurrent/Executor;

    .line 47
    invoke-virtual {p3, v0, v3}, Lcom/google/android/gms/internal/ads/zzdfa;->zzi(Lcom/google/android/gms/internal/ads/zzdbw;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/zzdfa;

    invoke-virtual {p3}, Lcom/google/android/gms/internal/ads/zzdfa;->zzn()Lcom/google/android/gms/internal/ads/zzdfc;

    move-result-object p3

    .line 48
    invoke-interface {p2, p3}, Lcom/google/android/gms/internal/ads/zzctf;->zzf(Lcom/google/android/gms/internal/ads/zzdfc;)Lcom/google/android/gms/internal/ads/zzctf;

    new-instance p3, Lcom/google/android/gms/internal/ads/zzenl;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfdf;->zzg:Lcom/google/android/gms/internal/ads/zzbfk;

    invoke-direct {p3, v0}, Lcom/google/android/gms/internal/ads/zzenl;-><init>(Lcom/google/android/gms/internal/ads/zzbfk;)V

    .line 49
    invoke-interface {p2, p3}, Lcom/google/android/gms/internal/ads/zzctf;->zze(Lcom/google/android/gms/internal/ads/zzenl;)Lcom/google/android/gms/internal/ads/zzctf;

    new-instance p3, Lcom/google/android/gms/internal/ads/zzdjy;

    sget-object v0, Lcom/google/android/gms/internal/ads/zzdme;->zza:Lcom/google/android/gms/internal/ads/zzdme;

    invoke-direct {p3, v0, v2}, Lcom/google/android/gms/internal/ads/zzdjy;-><init>(Lcom/google/android/gms/internal/ads/zzdme;Lcom/google/android/gms/ads/internal/client/zzbh;)V

    .line 50
    invoke-interface {p2, p3}, Lcom/google/android/gms/internal/ads/zzctf;->zzd(Lcom/google/android/gms/internal/ads/zzdjy;)Lcom/google/android/gms/internal/ads/zzctf;

    iget-object p3, p0, Lcom/google/android/gms/internal/ads/zzfdf;->zzh:Lcom/google/android/gms/internal/ads/zzdca;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfdf;->zzj:Lcom/google/android/gms/internal/ads/zzdeh;

    new-instance v3, Lcom/google/android/gms/internal/ads/zzcuh;

    invoke-direct {v3, p3, v0}, Lcom/google/android/gms/internal/ads/zzcuh;-><init>(Lcom/google/android/gms/internal/ads/zzdca;Lcom/google/android/gms/internal/ads/zzdeh;)V

    .line 51
    invoke-interface {p2, v3}, Lcom/google/android/gms/internal/ads/zzctf;->zzg(Lcom/google/android/gms/internal/ads/zzcuh;)Lcom/google/android/gms/internal/ads/zzctf;

    iget-object p3, p0, Lcom/google/android/gms/internal/ads/zzfdf;->zzf:Landroid/view/ViewGroup;

    new-instance v0, Lcom/google/android/gms/internal/ads/zzcsc;

    invoke-direct {v0, p3}, Lcom/google/android/gms/internal/ads/zzcsc;-><init>(Landroid/view/ViewGroup;)V

    .line 52
    invoke-interface {p2, v0}, Lcom/google/android/gms/internal/ads/zzctf;->zzc(Lcom/google/android/gms/internal/ads/zzcsc;)Lcom/google/android/gms/internal/ads/zzctf;

    .line 53
    invoke-interface {p2}, Lcom/google/android/gms/internal/ads/zzctf;->zzk()Lcom/google/android/gms/internal/ads/zzctg;

    move-result-object p2

    :goto_1
    move-object v9, p2

    .line 54
    sget-object p2, Lcom/google/android/gms/internal/ads/zzbgd;->zzc:Lcom/google/android/gms/internal/ads/zzbfv;

    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/zzbfv;->zze()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-eqz p2, :cond_6

    .line 55
    invoke-virtual {v9}, Lcom/google/android/gms/internal/ads/zzctg;->zzj()Lcom/google/android/gms/internal/ads/zzfmn;

    move-result-object p2

    sget-object p3, Lcom/google/android/gms/internal/ads/zzfmw;->zzb:Lcom/google/android/gms/internal/ads/zzfmw;

    .line 56
    invoke-virtual {p2, p3}, Lcom/google/android/gms/internal/ads/zzfmn;->zzd(Lcom/google/android/gms/internal/ads/zzfmw;)Lcom/google/android/gms/internal/ads/zzfmn;

    iget-object p3, p1, Lcom/google/android/gms/ads/internal/client/zzl;->zzp:Ljava/lang/String;

    .line 57
    invoke-virtual {p2, p3}, Lcom/google/android/gms/internal/ads/zzfmn;->zzb(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzfmn;

    iget-object p1, p1, Lcom/google/android/gms/ads/internal/client/zzl;->zzm:Landroid/os/Bundle;

    .line 58
    invoke-virtual {p2, p1}, Lcom/google/android/gms/internal/ads/zzfmn;->zzg(Landroid/os/Bundle;)Lcom/google/android/gms/internal/ads/zzfmn;

    move-object v7, p2

    goto :goto_2

    :cond_6
    move-object v7, v2

    .line 59
    :goto_2
    invoke-virtual {v9}, Lcom/google/android/gms/internal/ads/zzctg;->zzd()Lcom/google/android/gms/internal/ads/zzcvx;

    move-result-object p1

    .line 60
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzcvx;->zzj()Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/ads/zzcvx;->zzi(Lcom/google/common/util/concurrent/ListenableFuture;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzfdf;->zzl:Lcom/google/common/util/concurrent/ListenableFuture;

    new-instance p2, Lcom/google/android/gms/internal/ads/zzfde;

    move-object v4, p2

    move-object v5, p0

    move-object v6, p4

    invoke-direct/range {v4 .. v9}, Lcom/google/android/gms/internal/ads/zzfde;-><init>(Lcom/google/android/gms/internal/ads/zzfdf;Lcom/google/android/gms/internal/ads/zzepr;Lcom/google/android/gms/internal/ads/zzfmn;Lcom/google/android/gms/internal/ads/zzfmc;Lcom/google/android/gms/internal/ads/zzctg;)V

    iget-object p3, p0, Lcom/google/android/gms/internal/ads/zzfdf;->zzb:Ljava/util/concurrent/Executor;

    .line 61
    invoke-static {p1, p2, p3}, Lcom/google/android/gms/internal/ads/zzgft;->zzr(Lcom/google/common/util/concurrent/ListenableFuture;Lcom/google/android/gms/internal/ads/zzgfp;Ljava/util/concurrent/Executor;)V

    return v1
.end method

.method public final zzd()Landroid/view/ViewGroup;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfdf;->zzf:Landroid/view/ViewGroup;

    return-object v0
.end method

.method public final zzi()Lcom/google/android/gms/internal/ads/zzfhm;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfdf;->zzk:Lcom/google/android/gms/internal/ads/zzfhm;

    return-object v0
.end method

.method final synthetic zzm()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfdf;->zzd:Lcom/google/android/gms/internal/ads/zzepc;

    const/4 v1, 0x6

    const/4 v2, 0x0

    invoke-static {v1, v2, v2}, Lcom/google/android/gms/internal/ads/zzfiq;->zzd(ILjava/lang/String;Lcom/google/android/gms/ads/internal/client/zze;)Lcom/google/android/gms/ads/internal/client/zze;

    move-result-object v1

    .line 2
    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzepc;->zzdB(Lcom/google/android/gms/ads/internal/client/zze;)V

    return-void
.end method

.method public final zzn()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfdf;->zzj:Lcom/google/android/gms/internal/ads/zzdeh;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzfdf;->zzh:Lcom/google/android/gms/internal/ads/zzdca;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzdeh;->zzc()I

    move-result v0

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/zzdca;->zzd(I)V

    return-void
.end method

.method public final zzo(Lcom/google/android/gms/ads/internal/client/zzbe;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfdf;->zze:Lcom/google/android/gms/internal/ads/zzepg;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/zzepg;->zza(Lcom/google/android/gms/ads/internal/client/zzbe;)V

    return-void
.end method

.method public final zzp(Lcom/google/android/gms/internal/ads/zzdcb;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfdf;->zzb:Ljava/util/concurrent/Executor;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzfdf;->zzh:Lcom/google/android/gms/internal/ads/zzdca;

    invoke-virtual {v1, p1, v0}, Lcom/google/android/gms/internal/ads/zzdez;->zzo(Ljava/lang/Object;Ljava/util/concurrent/Executor;)V

    return-void
.end method

.method public final zzq(Lcom/google/android/gms/internal/ads/zzbfk;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzfdf;->zzg:Lcom/google/android/gms/internal/ads/zzbfk;

    return-void
.end method

.method public final zzr()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfdf;->zzf:Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    .line 2
    instance-of v1, v0, Landroid/view/View;

    if-nez v1, :cond_0

    const/4 v0, 0x0

    return v0

    .line 3
    :cond_0
    check-cast v0, Landroid/view/View;

    .line 4
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzu;->zzp()Lcom/google/android/gms/ads/internal/util/zzt;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/google/android/gms/ads/internal/util/zzt;->zzW(Landroid/view/View;Landroid/content/Context;)Z

    move-result v0

    return v0
.end method
