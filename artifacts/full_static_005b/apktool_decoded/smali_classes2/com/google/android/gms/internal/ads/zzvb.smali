.class public final Lcom/google/android/gms/internal/ads/zzvb;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@23.2.0"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzwa;


# instance fields
.field private final zzc:Lcom/google/android/gms/internal/ads/zzva;

.field private final zzd:Lcom/google/android/gms/internal/ads/zzha;

.field private final zze:Lcom/google/android/gms/internal/ads/zzalt;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzaea;)V
    .locals 2

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/ads/zzhi;

    invoke-direct {v0, p1}, Lcom/google/android/gms/internal/ads/zzhi;-><init>(Landroid/content/Context;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzvb;->zzd:Lcom/google/android/gms/internal/ads/zzha;

    new-instance p1, Lcom/google/android/gms/internal/ads/zzalo;

    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/zzalo;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzvb;->zze:Lcom/google/android/gms/internal/ads/zzalt;

    new-instance v1, Lcom/google/android/gms/internal/ads/zzva;

    .line 2
    invoke-direct {v1, p2, p1}, Lcom/google/android/gms/internal/ads/zzva;-><init>(Lcom/google/android/gms/internal/ads/zzaea;Lcom/google/android/gms/internal/ads/zzalt;)V

    iput-object v1, p0, Lcom/google/android/gms/internal/ads/zzvb;->zzc:Lcom/google/android/gms/internal/ads/zzva;

    .line 3
    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/zzva;->zza(Lcom/google/android/gms/internal/ads/zzha;)V

    return-void
.end method
