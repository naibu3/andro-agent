.class public abstract Lcom/google/android/gms/internal/ads/zzftz;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@23.2.0"


# static fields
.field public static final zza:Lcom/google/android/gms/internal/ads/zzftz;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/ads/zzftr;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzftr;-><init>()V

    const-string v1, ""

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzftr;->zza(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzfty;

    const/4 v1, 0x0

    .line 2
    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzfty;->zzb(Z)Lcom/google/android/gms/internal/ads/zzfty;

    .line 3
    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzfty;->zzc(Z)Lcom/google/android/gms/internal/ads/zzfty;

    const/4 v1, 0x1

    .line 4
    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzfty;->zze(I)Lcom/google/android/gms/internal/ads/zzfty;

    .line 5
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzfty;->zzd()Lcom/google/android/gms/internal/ads/zzftz;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/ads/zzftz;->zza:Lcom/google/android/gms/internal/ads/zzftz;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract zza()Lcom/google/android/gms/internal/ads/zzftp;
.end method

.method public abstract zzb()Lcom/google/android/gms/internal/ads/zzftq;
.end method

.method public abstract zzc()Ljava/lang/String;
.end method

.method public abstract zzd()Z
.end method

.method public abstract zze()Z
.end method

.method public abstract zzf()I
.end method
