.class final Lcom/google/android/gms/internal/ads/zzgpv;
.super Lcom/google/android/gms/internal/ads/zzgpy;
.source "com.google.android.gms:play-services-ads@@23.2.0"


# instance fields
.field final synthetic zza:Lcom/google/android/gms/internal/ads/zzgpw;


# direct methods
.method constructor <init>(Ljava/lang/Class;Ljava/lang/Class;Lcom/google/android/gms/internal/ads/zzgpw;)V
    .locals 0

    .line 1
    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzgpv;->zza:Lcom/google/android/gms/internal/ads/zzgpw;

    const/4 p3, 0x0

    invoke-direct {p0, p1, p2, p3}, Lcom/google/android/gms/internal/ads/zzgpy;-><init>(Ljava/lang/Class;Ljava/lang/Class;Lcom/google/android/gms/internal/ads/zzgpx;)V

    return-void
.end method


# virtual methods
.method public final zza(Lcom/google/android/gms/internal/ads/zzghi;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzgpv;->zza:Lcom/google/android/gms/internal/ads/zzgpw;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ads/zzgpw;->zza(Lcom/google/android/gms/internal/ads/zzghi;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
