.class public final synthetic Lcom/google/android/gms/internal/ads/zzaj;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@23.2.0"

# interfaces
.implements Ljava/util/function/Predicate;


# instance fields
.field public final synthetic zza:Lcom/google/android/gms/internal/ads/zzal;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/zzal;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzaj;->zza:Lcom/google/android/gms/internal/ads/zzal;

    return-void
.end method


# virtual methods
.method public final test(Ljava/lang/Object;)Z
    .locals 1

    check-cast p1, Lcom/google/android/gms/internal/ads/zzas;

    sget-object v0, Lcom/google/android/gms/internal/ads/zzan;->zza:Lcom/google/android/gms/internal/ads/zzn;

    .line 1
    iget-object p1, p1, Lcom/google/android/gms/internal/ads/zzas;->zzb:Ljava/lang/String;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzaj;->zza:Lcom/google/android/gms/internal/ads/zzal;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzal;->zzai(Lcom/google/android/gms/internal/ads/zzal;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method
