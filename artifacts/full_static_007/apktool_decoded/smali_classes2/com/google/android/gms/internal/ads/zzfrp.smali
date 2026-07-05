.class public final Lcom/google/android/gms/internal/ads/zzfrp;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@23.2.0"


# instance fields
.field private final zza:Landroid/content/Context;

.field private final zzb:Landroid/os/Looper;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/os/Looper;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzfrp;->zza:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzfrp;->zzb:Landroid/os/Looper;

    return-void
.end method


# virtual methods
.method public final zza(Ljava/lang/String;)V
    .locals 3

    .line 1
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzfsj;->zza()Lcom/google/android/gms/internal/ads/zzfsf;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzfrp;->zza:Landroid/content/Context;

    .line 2
    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzfsf;->zza(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzfsf;

    sget-object v1, Lcom/google/android/gms/internal/ads/zzfsi;->zzb:Lcom/google/android/gms/internal/ads/zzfsi;

    .line 3
    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzfsf;->zzc(Lcom/google/android/gms/internal/ads/zzfsi;)Lcom/google/android/gms/internal/ads/zzfsf;

    .line 4
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzfsd;->zza()Lcom/google/android/gms/internal/ads/zzfsc;

    move-result-object v1

    .line 5
    invoke-virtual {v1, p1}, Lcom/google/android/gms/internal/ads/zzfsc;->zzb(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzfsc;

    sget-object p1, Lcom/google/android/gms/internal/ads/zzfsb;->zzb:Lcom/google/android/gms/internal/ads/zzfsb;

    .line 6
    invoke-virtual {v1, p1}, Lcom/google/android/gms/internal/ads/zzfsc;->zza(Lcom/google/android/gms/internal/ads/zzfsb;)Lcom/google/android/gms/internal/ads/zzfsc;

    .line 7
    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzfsf;->zzb(Lcom/google/android/gms/internal/ads/zzfsc;)Lcom/google/android/gms/internal/ads/zzfsf;

    .line 8
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzhbi;->zzbn()Lcom/google/android/gms/internal/ads/zzhbo;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/ads/zzfsj;

    .line 9
    new-instance v0, Lcom/google/android/gms/internal/ads/zzfrq;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzfrp;->zza:Landroid/content/Context;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzfrp;->zzb:Landroid/os/Looper;

    .line 10
    invoke-direct {v0, v1, v2, p1}, Lcom/google/android/gms/internal/ads/zzfrq;-><init>(Landroid/content/Context;Landroid/os/Looper;Lcom/google/android/gms/internal/ads/zzfsj;)V

    .line 9
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzfrq;->zza()V

    return-void
.end method
