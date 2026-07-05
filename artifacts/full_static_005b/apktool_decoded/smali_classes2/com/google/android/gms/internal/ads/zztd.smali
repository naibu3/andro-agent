.class final Lcom/google/android/gms/internal/ads/zztd;
.super Landroid/os/Handler;
.source "com.google.android.gms:play-services-ads@@23.2.0"


# instance fields
.field final synthetic zza:Lcom/google/android/gms/internal/ads/zztf;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/zztf;Landroid/os/Looper;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zztd;->zza:Lcom/google/android/gms/internal/ads/zztf;

    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    return-void
.end method


# virtual methods
.method public final handleMessage(Landroid/os/Message;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zztd;->zza:Lcom/google/android/gms/internal/ads/zztf;

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/ads/zztf;->zza(Lcom/google/android/gms/internal/ads/zztf;Landroid/os/Message;)V

    return-void
.end method
