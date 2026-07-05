.class public final synthetic Lcom/google/android/gms/internal/ads/zzgpj;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@23.2.0"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzgqy;


# direct methods
.method public synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final zza()Ljava/lang/Object;
    .locals 5

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/ads/zzgpl;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzgpl;-><init>()V

    new-instance v1, Lcom/google/android/gms/internal/ads/zzgpk;

    invoke-direct {v1}, Lcom/google/android/gms/internal/ads/zzgpk;-><init>()V

    new-instance v2, Lcom/google/android/gms/internal/ads/zzgoo;

    const-class v3, Lcom/google/android/gms/internal/ads/zzgou;

    const-class v4, Lcom/google/android/gms/internal/ads/zzgql;

    invoke-direct {v2, v3, v4, v1}, Lcom/google/android/gms/internal/ads/zzgoo;-><init>(Ljava/lang/Class;Ljava/lang/Class;Lcom/google/android/gms/internal/ads/zzgop;)V

    .line 2
    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/ads/zzgpl;->zzg(Lcom/google/android/gms/internal/ads/zzgor;)V

    return-object v0
.end method
