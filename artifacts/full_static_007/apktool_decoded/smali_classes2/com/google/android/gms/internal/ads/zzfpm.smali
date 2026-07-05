.class public final Lcom/google/android/gms/internal/ads/zzfpm;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@23.2.0"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzfpf;


# static fields
.field private static zza:Lcom/google/android/gms/internal/ads/zzfpm;


# instance fields
.field private zzb:F

.field private final zzc:Lcom/google/android/gms/internal/ads/zzfpb;

.field private final zzd:Lcom/google/android/gms/internal/ads/zzfoz;

.field private zze:Lcom/google/android/gms/internal/ads/zzfpa;

.field private zzf:Lcom/google/android/gms/internal/ads/zzfpe;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/zzfpb;Lcom/google/android/gms/internal/ads/zzfoz;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzfpm;->zzb:F

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzfpm;->zzc:Lcom/google/android/gms/internal/ads/zzfpb;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzfpm;->zzd:Lcom/google/android/gms/internal/ads/zzfoz;

    return-void
.end method

.method public static zzb()Lcom/google/android/gms/internal/ads/zzfpm;
    .locals 3

    sget-object v0, Lcom/google/android/gms/internal/ads/zzfpm;->zza:Lcom/google/android/gms/internal/ads/zzfpm;

    if-nez v0, :cond_0

    new-instance v0, Lcom/google/android/gms/internal/ads/zzfoz;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzfoz;-><init>()V

    new-instance v1, Lcom/google/android/gms/internal/ads/zzfpb;

    invoke-direct {v1}, Lcom/google/android/gms/internal/ads/zzfpb;-><init>()V

    new-instance v2, Lcom/google/android/gms/internal/ads/zzfpm;

    invoke-direct {v2, v1, v0}, Lcom/google/android/gms/internal/ads/zzfpm;-><init>(Lcom/google/android/gms/internal/ads/zzfpb;Lcom/google/android/gms/internal/ads/zzfoz;)V

    sput-object v2, Lcom/google/android/gms/internal/ads/zzfpm;->zza:Lcom/google/android/gms/internal/ads/zzfpm;

    :cond_0
    sget-object v0, Lcom/google/android/gms/internal/ads/zzfpm;->zza:Lcom/google/android/gms/internal/ads/zzfpm;

    return-object v0
.end method


# virtual methods
.method public final zza()F
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzfpm;->zzb:F

    return v0
.end method

.method public final zzc(Z)V
    .locals 0

    if-eqz p1, :cond_0

    .line 1
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzfqo;->zzd()Lcom/google/android/gms/internal/ads/zzfqo;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzfqo;->zzi()V

    return-void

    .line 2
    :cond_0
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzfqo;->zzd()Lcom/google/android/gms/internal/ads/zzfqo;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzfqo;->zzh()V

    return-void
.end method

.method public final zzd(Landroid/content/Context;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/ads/zzfoy;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzfoy;-><init>()V

    new-instance v1, Landroid/os/Handler;

    invoke-direct {v1}, Landroid/os/Handler;-><init>()V

    new-instance v2, Lcom/google/android/gms/internal/ads/zzfpa;

    .line 2
    invoke-direct {v2, v1, p1, v0, p0}, Lcom/google/android/gms/internal/ads/zzfpa;-><init>(Landroid/os/Handler;Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzfoy;Lcom/google/android/gms/internal/ads/zzfpm;)V

    iput-object v2, p0, Lcom/google/android/gms/internal/ads/zzfpm;->zze:Lcom/google/android/gms/internal/ads/zzfpa;

    return-void
.end method

.method public final zze(F)V
    .locals 2

    .line 1
    iput p1, p0, Lcom/google/android/gms/internal/ads/zzfpm;->zzb:F

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfpm;->zzf:Lcom/google/android/gms/internal/ads/zzfpe;

    if-nez v0, :cond_0

    invoke-static {}, Lcom/google/android/gms/internal/ads/zzfpe;->zza()Lcom/google/android/gms/internal/ads/zzfpe;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzfpm;->zzf:Lcom/google/android/gms/internal/ads/zzfpe;

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfpm;->zzf:Lcom/google/android/gms/internal/ads/zzfpe;

    .line 2
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzfpe;->zzb()Ljava/util/Collection;

    move-result-object v0

    .line 3
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/ads/zzfon;

    .line 4
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzfon;->zzg()Lcom/google/android/gms/internal/ads/zzfps;

    move-result-object v1

    invoke-virtual {v1, p1}, Lcom/google/android/gms/internal/ads/zzfps;->zzl(F)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final zzf()V
    .locals 1

    .line 1
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzfpd;->zza()Lcom/google/android/gms/internal/ads/zzfpd;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/google/android/gms/internal/ads/zzfpg;->zze(Lcom/google/android/gms/internal/ads/zzfpf;)V

    invoke-static {}, Lcom/google/android/gms/internal/ads/zzfpd;->zza()Lcom/google/android/gms/internal/ads/zzfpd;

    move-result-object v0

    .line 2
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzfpg;->zzf()V

    .line 3
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzfqo;->zzd()Lcom/google/android/gms/internal/ads/zzfqo;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzfqo;->zzi()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfpm;->zze:Lcom/google/android/gms/internal/ads/zzfpa;

    .line 4
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzfpa;->zza()V

    return-void
.end method

.method public final zzg()V
    .locals 1

    .line 1
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzfqo;->zzd()Lcom/google/android/gms/internal/ads/zzfqo;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzfqo;->zzj()V

    .line 2
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzfpd;->zza()Lcom/google/android/gms/internal/ads/zzfpd;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzfpg;->zzg()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfpm;->zze:Lcom/google/android/gms/internal/ads/zzfpa;

    .line 3
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzfpa;->zzb()V

    return-void
.end method
