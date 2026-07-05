.class public final synthetic Lcom/google/android/gms/internal/ads/zzaph;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@23.2.0"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzaea;


# direct methods
.method public synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic zza(Landroid/net/Uri;Ljava/util/Map;)[Lcom/google/android/gms/internal/ads/zzadu;
    .locals 8

    const/4 p1, 0x1

    .line 1
    new-array p1, p1, [Lcom/google/android/gms/internal/ads/zzadu;

    new-instance p2, Lcom/google/android/gms/internal/ads/zzapk;

    sget-object v3, Lcom/google/android/gms/internal/ads/zzalt;->zza:Lcom/google/android/gms/internal/ads/zzalt;

    new-instance v4, Lcom/google/android/gms/internal/ads/zzgb;

    const-wide/16 v0, 0x0

    invoke-direct {v4, v0, v1}, Lcom/google/android/gms/internal/ads/zzgb;-><init>(J)V

    new-instance v5, Lcom/google/android/gms/internal/ads/zzanz;

    const/4 v7, 0x0

    invoke-direct {v5, v7}, Lcom/google/android/gms/internal/ads/zzanz;-><init>(I)V

    const v6, 0x1b8a0

    const/4 v1, 0x1

    const/4 v2, 0x1

    move-object v0, p2

    invoke-direct/range {v0 .. v6}, Lcom/google/android/gms/internal/ads/zzapk;-><init>(IILcom/google/android/gms/internal/ads/zzalt;Lcom/google/android/gms/internal/ads/zzgb;Lcom/google/android/gms/internal/ads/zzapn;I)V

    aput-object p2, p1, v7

    return-object p1
.end method
