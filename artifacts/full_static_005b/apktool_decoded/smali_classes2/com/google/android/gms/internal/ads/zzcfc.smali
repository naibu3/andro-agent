.class final Lcom/google/android/gms/internal/ads/zzcfc;
.super Lcom/google/android/gms/internal/ads/zzasn;
.source "com.google.android.gms:play-services-ads@@23.2.0"


# static fields
.field static final zzb:Lcom/google/android/gms/internal/ads/zzcfc;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/ads/zzcfc;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzcfc;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ads/zzcfc;->zzb:Lcom/google/android/gms/internal/ads/zzcfc;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzasn;-><init>()V

    return-void
.end method


# virtual methods
.method public final zza(Ljava/lang/String;[BLjava/lang/String;)Lcom/google/android/gms/internal/ads/zzasr;
    .locals 0

    .line 1
    const-string p2, "moov"

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    .line 2
    new-instance p1, Lcom/google/android/gms/internal/ads/zzast;

    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/zzast;-><init>()V

    return-object p1

    :cond_0
    const-string p2, "mvhd"

    .line 3
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_1

    .line 4
    new-instance p1, Lcom/google/android/gms/internal/ads/zzasu;

    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/zzasu;-><init>()V

    return-object p1

    .line 5
    :cond_1
    new-instance p2, Lcom/google/android/gms/internal/ads/zzasv;

    invoke-direct {p2, p1}, Lcom/google/android/gms/internal/ads/zzasv;-><init>(Ljava/lang/String;)V

    return-object p2
.end method
