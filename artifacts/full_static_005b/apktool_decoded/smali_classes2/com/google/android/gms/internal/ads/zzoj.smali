.class public final synthetic Lcom/google/android/gms/internal/ads/zzoj;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@23.2.0"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzfe;


# instance fields
.field public final synthetic zza:Lcom/google/android/gms/internal/ads/zzmy;

.field public final synthetic zzb:Lcom/google/android/gms/internal/ads/zzan;

.field public final synthetic zzc:Lcom/google/android/gms/internal/ads/zziy;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/zzmy;Lcom/google/android/gms/internal/ads/zzan;Lcom/google/android/gms/internal/ads/zziy;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzoj;->zza:Lcom/google/android/gms/internal/ads/zzmy;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzoj;->zzb:Lcom/google/android/gms/internal/ads/zzan;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzoj;->zzc:Lcom/google/android/gms/internal/ads/zziy;

    return-void
.end method


# virtual methods
.method public final zza(Ljava/lang/Object;)V
    .locals 3

    check-cast p1, Lcom/google/android/gms/internal/ads/zzna;

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzoj;->zza:Lcom/google/android/gms/internal/ads/zzmy;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzoj;->zzb:Lcom/google/android/gms/internal/ads/zzan;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzoj;->zzc:Lcom/google/android/gms/internal/ads/zziy;

    invoke-interface {p1, v0, v1, v2}, Lcom/google/android/gms/internal/ads/zzna;->zzp(Lcom/google/android/gms/internal/ads/zzmy;Lcom/google/android/gms/internal/ads/zzan;Lcom/google/android/gms/internal/ads/zziy;)V

    return-void
.end method
