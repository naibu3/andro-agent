.class public final Lcom/google/android/gms/internal/ads/zzejy;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@23.2.0"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzehn;


# instance fields
.field private final zza:Lcom/google/android/gms/internal/ads/zzdst;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/zzdst;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzejy;->zza:Lcom/google/android/gms/internal/ads/zzdst;

    return-void
.end method


# virtual methods
.method public final zza(Ljava/lang/String;Lorg/json/JSONObject;)Lcom/google/android/gms/internal/ads/zzeho;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/ads/zzfhv;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzejy;->zza:Lcom/google/android/gms/internal/ads/zzdst;

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/ads/zzdst;->zzc(Ljava/lang/String;Lorg/json/JSONObject;)Lcom/google/android/gms/internal/ads/zzfim;

    move-result-object p2

    new-instance v0, Lcom/google/android/gms/internal/ads/zzejh;

    .line 2
    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzejh;-><init>()V

    new-instance v1, Lcom/google/android/gms/internal/ads/zzeho;

    invoke-direct {v1, p2, v0, p1}, Lcom/google/android/gms/internal/ads/zzeho;-><init>(Ljava/lang/Object;Lcom/google/android/gms/internal/ads/zzdav;Ljava/lang/String;)V

    return-object v1
.end method
