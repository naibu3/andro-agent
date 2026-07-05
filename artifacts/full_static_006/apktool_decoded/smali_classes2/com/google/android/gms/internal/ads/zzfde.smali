.class final Lcom/google/android/gms/internal/ads/zzfde;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@23.2.0"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzgfp;


# instance fields
.field final synthetic zza:Lcom/google/android/gms/internal/ads/zzepr;

.field final synthetic zzb:Lcom/google/android/gms/internal/ads/zzfmn;

.field final synthetic zzc:Lcom/google/android/gms/internal/ads/zzfmc;

.field final synthetic zzd:Lcom/google/android/gms/internal/ads/zzctg;

.field final synthetic zze:Lcom/google/android/gms/internal/ads/zzfdf;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/zzfdf;Lcom/google/android/gms/internal/ads/zzepr;Lcom/google/android/gms/internal/ads/zzfmn;Lcom/google/android/gms/internal/ads/zzfmc;Lcom/google/android/gms/internal/ads/zzctg;)V
    .locals 0

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzfde;->zza:Lcom/google/android/gms/internal/ads/zzepr;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzfde;->zzb:Lcom/google/android/gms/internal/ads/zzfmn;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/zzfde;->zzc:Lcom/google/android/gms/internal/ads/zzfmc;

    iput-object p5, p0, Lcom/google/android/gms/internal/ads/zzfde;->zzd:Lcom/google/android/gms/internal/ads/zzctg;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzfde;->zze:Lcom/google/android/gms/internal/ads/zzfdf;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final zza(Ljava/lang/Throwable;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfde;->zzd:Lcom/google/android/gms/internal/ads/zzctg;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzctg;->zzd()Lcom/google/android/gms/internal/ads/zzcvx;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/zzcvx;->zza(Ljava/lang/Throwable;)Lcom/google/android/gms/ads/internal/client/zze;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzfde;->zze:Lcom/google/android/gms/internal/ads/zzfdf;

    monitor-enter v1

    :try_start_0
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzfde;->zze:Lcom/google/android/gms/internal/ads/zzfdf;

    const/4 v3, 0x0

    .line 2
    invoke-static {v2, v3}, Lcom/google/android/gms/internal/ads/zzfdf;->zzl(Lcom/google/android/gms/internal/ads/zzfdf;Lcom/google/common/util/concurrent/ListenableFuture;)V

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzfde;->zzd:Lcom/google/android/gms/internal/ads/zzctg;

    .line 3
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzctg;->zzf()Lcom/google/android/gms/internal/ads/zzczn;

    move-result-object v2

    invoke-virtual {v2, v0}, Lcom/google/android/gms/internal/ads/zzczn;->zzdB(Lcom/google/android/gms/ads/internal/client/zze;)V

    .line 4
    sget-object v2, Lcom/google/android/gms/internal/ads/zzbep;->zzik:Lcom/google/android/gms/internal/ads/zzbeg;

    .line 5
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/google/android/gms/internal/ads/zzben;

    move-result-object v3

    invoke-virtual {v3, v2}, Lcom/google/android/gms/internal/ads/zzben;->zza(Lcom/google/android/gms/internal/ads/zzbeg;)Ljava/lang/Object;

    move-result-object v2

    .line 4
    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzfde;->zze:Lcom/google/android/gms/internal/ads/zzfdf;

    invoke-static {v2}, Lcom/google/android/gms/internal/ads/zzfdf;->zzk(Lcom/google/android/gms/internal/ads/zzfdf;)Ljava/util/concurrent/Executor;

    move-result-object v2

    new-instance v3, Lcom/google/android/gms/internal/ads/zzfdc;

    invoke-direct {v3, p0, v0}, Lcom/google/android/gms/internal/ads/zzfdc;-><init>(Lcom/google/android/gms/internal/ads/zzfde;Lcom/google/android/gms/ads/internal/client/zze;)V

    .line 6
    invoke-interface {v2, v3}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    :cond_0
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzfde;->zze:Lcom/google/android/gms/internal/ads/zzfdf;

    invoke-static {v2}, Lcom/google/android/gms/internal/ads/zzfdf;->zze(Lcom/google/android/gms/internal/ads/zzfdf;)Lcom/google/android/gms/internal/ads/zzdca;

    move-result-object v3

    invoke-static {v2}, Lcom/google/android/gms/internal/ads/zzfdf;->zzf(Lcom/google/android/gms/internal/ads/zzfdf;)Lcom/google/android/gms/internal/ads/zzdeh;

    move-result-object v2

    .line 7
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzdeh;->zzc()I

    move-result v2

    invoke-virtual {v3, v2}, Lcom/google/android/gms/internal/ads/zzdca;->zzd(I)V

    .line 8
    iget v2, v0, Lcom/google/android/gms/ads/internal/client/zze;->zza:I

    const-string v3, "BannerAdLoader.onFailure"

    invoke-static {v2, p1, v3}, Lcom/google/android/gms/internal/ads/zzfil;->zzb(ILjava/lang/Throwable;Ljava/lang/String;)V

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzfde;->zza:Lcom/google/android/gms/internal/ads/zzepr;

    .line 9
    invoke-interface {v2}, Lcom/google/android/gms/internal/ads/zzepr;->zza()V

    .line 10
    sget-object v2, Lcom/google/android/gms/internal/ads/zzbgd;->zzc:Lcom/google/android/gms/internal/ads/zzbfv;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzbfv;->zze()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_1

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzfde;->zzb:Lcom/google/android/gms/internal/ads/zzfmn;

    if-eqz v2, :cond_1

    .line 13
    invoke-virtual {v2, v0}, Lcom/google/android/gms/internal/ads/zzfmn;->zzc(Lcom/google/android/gms/ads/internal/client/zze;)Lcom/google/android/gms/internal/ads/zzfmn;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfde;->zzc:Lcom/google/android/gms/internal/ads/zzfmc;

    .line 14
    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ads/zzfmc;->zzi(Ljava/lang/Throwable;)Lcom/google/android/gms/internal/ads/zzfmc;

    invoke-interface {v0, v3}, Lcom/google/android/gms/internal/ads/zzfmc;->zzh(Z)Lcom/google/android/gms/internal/ads/zzfmc;

    invoke-virtual {v2, v0}, Lcom/google/android/gms/internal/ads/zzfmn;->zza(Lcom/google/android/gms/internal/ads/zzfmc;)Lcom/google/android/gms/internal/ads/zzfmn;

    .line 15
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzfmn;->zzi()V

    goto :goto_0

    .line 16
    :cond_1
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzfde;->zze:Lcom/google/android/gms/internal/ads/zzfdf;

    invoke-static {v2}, Lcom/google/android/gms/internal/ads/zzfdf;->zzj(Lcom/google/android/gms/internal/ads/zzfdf;)Lcom/google/android/gms/internal/ads/zzfmq;

    move-result-object v2

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/zzfde;->zzc:Lcom/google/android/gms/internal/ads/zzfmc;

    .line 11
    invoke-interface {v4, v0}, Lcom/google/android/gms/internal/ads/zzfmc;->zza(Lcom/google/android/gms/ads/internal/client/zze;)Lcom/google/android/gms/internal/ads/zzfmc;

    invoke-interface {v4, p1}, Lcom/google/android/gms/internal/ads/zzfmc;->zzi(Ljava/lang/Throwable;)Lcom/google/android/gms/internal/ads/zzfmc;

    invoke-interface {v4, v3}, Lcom/google/android/gms/internal/ads/zzfmc;->zzh(Z)Lcom/google/android/gms/internal/ads/zzfmc;

    invoke-interface {v4}, Lcom/google/android/gms/internal/ads/zzfmc;->zzn()Lcom/google/android/gms/internal/ads/zzfmg;

    move-result-object p1

    .line 12
    invoke-virtual {v2, p1}, Lcom/google/android/gms/internal/ads/zzfmq;->zzb(Lcom/google/android/gms/internal/ads/zzfmg;)V

    .line 16
    :goto_0
    monitor-exit v1

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final bridge synthetic zzb(Ljava/lang/Object;)V
    .locals 5

    const-string v0, "Banner view provided from "

    .line 1
    check-cast p1, Lcom/google/android/gms/internal/ads/zzcsf;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzfde;->zze:Lcom/google/android/gms/internal/ads/zzfdf;

    monitor-enter v1

    :try_start_0
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzfde;->zze:Lcom/google/android/gms/internal/ads/zzfdf;

    const/4 v3, 0x0

    .line 2
    invoke-static {v2, v3}, Lcom/google/android/gms/internal/ads/zzfdf;->zzl(Lcom/google/android/gms/internal/ads/zzfdf;Lcom/google/common/util/concurrent/ListenableFuture;)V

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzfde;->zze:Lcom/google/android/gms/internal/ads/zzfdf;

    invoke-static {v2}, Lcom/google/android/gms/internal/ads/zzfdf;->zzc(Lcom/google/android/gms/internal/ads/zzfdf;)Landroid/view/ViewGroup;

    move-result-object v2

    .line 3
    invoke-virtual {v2}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 4
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzcsf;->zzc()Landroid/view/View;

    move-result-object v2

    if-eqz v2, :cond_1

    .line 5
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzcsf;->zzc()Landroid/view/View;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v2

    .line 6
    instance-of v3, v2, Landroid/view/ViewGroup;

    if-eqz v3, :cond_1

    const-string v3, ""

    .line 7
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzcup;->zzl()Lcom/google/android/gms/internal/ads/zzcze;

    move-result-object v4

    if-eqz v4, :cond_0

    .line 8
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzcup;->zzl()Lcom/google/android/gms/internal/ads/zzcze;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzcze;->zzg()Ljava/lang/String;

    move-result-object v3

    :cond_0
    new-instance v4, Ljava/lang/StringBuilder;

    .line 9
    invoke-direct {v4, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " already has a parent view. Removing its old parent."

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 10
    invoke-static {v0}, Lcom/google/android/gms/ads/internal/util/client/zzm;->zzj(Ljava/lang/String;)V

    .line 11
    check-cast v2, Landroid/view/ViewGroup;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzcsf;->zzc()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v2, v0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 12
    :cond_1
    sget-object v0, Lcom/google/android/gms/internal/ads/zzbep;->zzik:Lcom/google/android/gms/internal/ads/zzbeg;

    .line 13
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/google/android/gms/internal/ads/zzben;

    move-result-object v2

    invoke-virtual {v2, v0}, Lcom/google/android/gms/internal/ads/zzben;->zza(Lcom/google/android/gms/internal/ads/zzbeg;)Ljava/lang/Object;

    move-result-object v0

    .line 12
    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 14
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzcup;->zzn()Lcom/google/android/gms/internal/ads/zzddq;

    move-result-object v0

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzfde;->zze:Lcom/google/android/gms/internal/ads/zzfdf;

    invoke-static {v2}, Lcom/google/android/gms/internal/ads/zzfdf;->zzg(Lcom/google/android/gms/internal/ads/zzfdf;)Lcom/google/android/gms/internal/ads/zzepc;

    move-result-object v2

    .line 15
    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/ads/zzddq;->zza(Lcom/google/android/gms/internal/ads/zzepc;)Lcom/google/android/gms/internal/ads/zzddq;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzfde;->zze:Lcom/google/android/gms/internal/ads/zzfdf;

    invoke-static {v2}, Lcom/google/android/gms/internal/ads/zzfdf;->zzh(Lcom/google/android/gms/internal/ads/zzfdf;)Lcom/google/android/gms/internal/ads/zzepg;

    move-result-object v2

    .line 16
    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/ads/zzddq;->zzc(Lcom/google/android/gms/internal/ads/zzepg;)Lcom/google/android/gms/internal/ads/zzddq;

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfde;->zze:Lcom/google/android/gms/internal/ads/zzfdf;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzfdf;->zzc(Lcom/google/android/gms/internal/ads/zzfdf;)Landroid/view/ViewGroup;

    move-result-object v0

    .line 17
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzcsf;->zzc()Landroid/view/View;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfde;->zza:Lcom/google/android/gms/internal/ads/zzepr;

    .line 18
    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ads/zzepr;->zzb(Ljava/lang/Object;)V

    sget-object v0, Lcom/google/android/gms/internal/ads/zzbep;->zzik:Lcom/google/android/gms/internal/ads/zzbeg;

    .line 19
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/google/android/gms/internal/ads/zzben;

    move-result-object v2

    invoke-virtual {v2, v0}, Lcom/google/android/gms/internal/ads/zzben;->zza(Lcom/google/android/gms/internal/ads/zzbeg;)Ljava/lang/Object;

    move-result-object v0

    .line 20
    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfde;->zze:Lcom/google/android/gms/internal/ads/zzfdf;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzfdf;->zzk(Lcom/google/android/gms/internal/ads/zzfdf;)Ljava/util/concurrent/Executor;

    move-result-object v2

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzfdf;->zzg(Lcom/google/android/gms/internal/ads/zzfdf;)Lcom/google/android/gms/internal/ads/zzepc;

    move-result-object v0

    .line 21
    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v3, Lcom/google/android/gms/internal/ads/zzfdd;

    invoke-direct {v3, v0}, Lcom/google/android/gms/internal/ads/zzfdd;-><init>(Lcom/google/android/gms/internal/ads/zzepc;)V

    invoke-interface {v2, v3}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    :cond_3
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfde;->zze:Lcom/google/android/gms/internal/ads/zzfdf;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzfdf;->zze(Lcom/google/android/gms/internal/ads/zzfdf;)Lcom/google/android/gms/internal/ads/zzdca;

    move-result-object v0

    .line 22
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzcsf;->zza()I

    move-result v2

    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/ads/zzdca;->zzd(I)V

    .line 23
    sget-object v0, Lcom/google/android/gms/internal/ads/zzbgd;->zzc:Lcom/google/android/gms/internal/ads/zzbfv;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzbfv;->zze()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    const/4 v2, 0x1

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfde;->zzb:Lcom/google/android/gms/internal/ads/zzfmn;

    if-eqz v0, :cond_4

    .line 29
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzcup;->zzp()Lcom/google/android/gms/internal/ads/zzfhf;

    move-result-object v3

    iget-object v3, v3, Lcom/google/android/gms/internal/ads/zzfhf;->zzb:Lcom/google/android/gms/internal/ads/zzfhe;

    invoke-virtual {v0, v3}, Lcom/google/android/gms/internal/ads/zzfmn;->zzh(Lcom/google/android/gms/internal/ads/zzfhe;)Lcom/google/android/gms/internal/ads/zzfmn;

    .line 30
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzcup;->zzl()Lcom/google/android/gms/internal/ads/zzcze;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzcze;->zzg()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/zzfmn;->zzf(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzfmn;

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzfde;->zzc:Lcom/google/android/gms/internal/ads/zzfmc;

    .line 31
    invoke-interface {p1, v2}, Lcom/google/android/gms/internal/ads/zzfmc;->zzh(Z)Lcom/google/android/gms/internal/ads/zzfmc;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/zzfmn;->zza(Lcom/google/android/gms/internal/ads/zzfmc;)Lcom/google/android/gms/internal/ads/zzfmn;

    .line 32
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzfmn;->zzi()V

    goto :goto_0

    .line 33
    :cond_4
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfde;->zze:Lcom/google/android/gms/internal/ads/zzfdf;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzfdf;->zzj(Lcom/google/android/gms/internal/ads/zzfdf;)Lcom/google/android/gms/internal/ads/zzfmq;

    move-result-object v0

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzfde;->zzc:Lcom/google/android/gms/internal/ads/zzfmc;

    .line 24
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzcup;->zzp()Lcom/google/android/gms/internal/ads/zzfhf;

    move-result-object v4

    iget-object v4, v4, Lcom/google/android/gms/internal/ads/zzfhf;->zzb:Lcom/google/android/gms/internal/ads/zzfhe;

    invoke-interface {v3, v4}, Lcom/google/android/gms/internal/ads/zzfmc;->zzb(Lcom/google/android/gms/internal/ads/zzfhe;)Lcom/google/android/gms/internal/ads/zzfmc;

    .line 25
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzcup;->zzl()Lcom/google/android/gms/internal/ads/zzcze;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzcze;->zzg()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v3, p1}, Lcom/google/android/gms/internal/ads/zzfmc;->zze(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzfmc;

    .line 26
    invoke-interface {v3, v2}, Lcom/google/android/gms/internal/ads/zzfmc;->zzh(Z)Lcom/google/android/gms/internal/ads/zzfmc;

    .line 27
    invoke-interface {v3}, Lcom/google/android/gms/internal/ads/zzfmc;->zzn()Lcom/google/android/gms/internal/ads/zzfmg;

    move-result-object p1

    .line 28
    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/zzfmq;->zzb(Lcom/google/android/gms/internal/ads/zzfmg;)V

    .line 33
    :goto_0
    monitor-exit v1

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method
