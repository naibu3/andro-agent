.class public final synthetic Lcom/google/android/gms/internal/ads/zzcfw;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@23.2.0"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic zza:Lcom/google/android/gms/internal/ads/zzcee;

.field public final synthetic zzb:Z

.field public final synthetic zzc:J


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/zzcee;ZJ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzcfw;->zza:Lcom/google/android/gms/internal/ads/zzcee;

    iput-boolean p2, p0, Lcom/google/android/gms/internal/ads/zzcfw;->zzb:Z

    iput-wide p3, p0, Lcom/google/android/gms/internal/ads/zzcfw;->zzc:J

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    sget v0, Lcom/google/android/gms/internal/ads/zzcfy;->zzd:I

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzcfw;->zza:Lcom/google/android/gms/internal/ads/zzcee;

    iget-boolean v1, p0, Lcom/google/android/gms/internal/ads/zzcfw;->zzb:Z

    iget-wide v2, p0, Lcom/google/android/gms/internal/ads/zzcfw;->zzc:J

    invoke-interface {v0, v1, v2, v3}, Lcom/google/android/gms/internal/ads/zzcee;->zzv(ZJ)V

    return-void
.end method
