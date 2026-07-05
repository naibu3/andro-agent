.class public final synthetic Lcom/google/android/gms/internal/ads/zzgkt;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@23.2.0"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzgpw;


# direct methods
.method public synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final zza(Lcom/google/android/gms/internal/ads/zzghi;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Lcom/google/android/gms/internal/ads/zzgla;

    sget v0, Lcom/google/android/gms/internal/ads/zzgkv;->zza:I

    .line 1
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzgla;->zzb()Lcom/google/android/gms/internal/ads/zzglc;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzglc;->zzd()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzghv;->zza(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzghu;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzghu;->zzb()Lcom/google/android/gms/internal/ads/zzggy;

    move-result-object v0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzgla;->zzc()Lcom/google/android/gms/internal/ads/zzgze;

    move-result-object p1

    .line 2
    invoke-static {v0, p1}, Lcom/google/android/gms/internal/ads/zzgns;->zzc(Lcom/google/android/gms/internal/ads/zzggy;Lcom/google/android/gms/internal/ads/zzgze;)Lcom/google/android/gms/internal/ads/zzggy;

    move-result-object p1

    return-object p1
.end method
