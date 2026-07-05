.class public final Lcom/google/android/gms/internal/ads/zzagp;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@23.2.0"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzadx;


# instance fields
.field private final zzb:J

.field private final zzc:Lcom/google/android/gms/internal/ads/zzadx;


# direct methods
.method public constructor <init>(JLcom/google/android/gms/internal/ads/zzadx;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lcom/google/android/gms/internal/ads/zzagp;->zzb:J

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzagp;->zzc:Lcom/google/android/gms/internal/ads/zzadx;

    return-void
.end method

.method static bridge synthetic zza(Lcom/google/android/gms/internal/ads/zzagp;)J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/zzagp;->zzb:J

    return-wide v0
.end method


# virtual methods
.method public final zzD()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzagp;->zzc:Lcom/google/android/gms/internal/ads/zzadx;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzadx;->zzD()V

    return-void
.end method

.method public final zzO(Lcom/google/android/gms/internal/ads/zzaet;)V
    .locals 1

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/ads/zzago;

    invoke-direct {v0, p0, p1, p1}, Lcom/google/android/gms/internal/ads/zzago;-><init>(Lcom/google/android/gms/internal/ads/zzagp;Lcom/google/android/gms/internal/ads/zzaet;Lcom/google/android/gms/internal/ads/zzaet;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzagp;->zzc:Lcom/google/android/gms/internal/ads/zzadx;

    invoke-interface {p1, v0}, Lcom/google/android/gms/internal/ads/zzadx;->zzO(Lcom/google/android/gms/internal/ads/zzaet;)V

    return-void
.end method

.method public final zzw(II)Lcom/google/android/gms/internal/ads/zzafa;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzagp;->zzc:Lcom/google/android/gms/internal/ads/zzadx;

    invoke-interface {v0, p1, p2}, Lcom/google/android/gms/internal/ads/zzadx;->zzw(II)Lcom/google/android/gms/internal/ads/zzafa;

    move-result-object p1

    return-object p1
.end method
