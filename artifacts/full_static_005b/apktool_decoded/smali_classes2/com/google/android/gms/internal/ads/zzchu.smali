.class public final synthetic Lcom/google/android/gms/internal/ads/zzchu;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@23.2.0"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic zza:Lcom/google/android/gms/internal/ads/zzchv;

.field public final synthetic zzb:Lcom/google/android/gms/internal/ads/zzehe;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/zzchv;Lcom/google/android/gms/internal/ads/zzehe;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzchu;->zza:Lcom/google/android/gms/internal/ads/zzchv;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzchu;->zzb:Lcom/google/android/gms/internal/ads/zzehe;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/ads/zzchs;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzchu;->zza:Lcom/google/android/gms/internal/ads/zzchv;

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/zzchs;-><init>(Lcom/google/android/gms/internal/ads/zzchv;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzchu;->zzb:Lcom/google/android/gms/internal/ads/zzehe;

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/zzehe;->zzf(Lcom/google/android/gms/internal/ads/zzchs;)V

    return-void
.end method
