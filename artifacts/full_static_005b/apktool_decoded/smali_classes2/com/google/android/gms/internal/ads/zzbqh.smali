.class public final Lcom/google/android/gms/internal/ads/zzbqh;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@23.2.0"


# annotations
.annotation runtime Ljavax/annotation/ParametersAreNonnullByDefault;
.end annotation


# static fields
.field static final zza:Lcom/google/android/gms/ads/internal/util/zzbd;

.field static final zzb:Lcom/google/android/gms/ads/internal/util/zzbd;


# instance fields
.field private final zzc:Lcom/google/android/gms/internal/ads/zzbpt;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/ads/zzbqf;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzbqf;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ads/zzbqh;->zza:Lcom/google/android/gms/ads/internal/util/zzbd;

    new-instance v0, Lcom/google/android/gms/internal/ads/zzbqg;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzbqg;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ads/zzbqh;->zzb:Lcom/google/android/gms/ads/internal/util/zzbd;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzfmq;)V
    .locals 8
    .param p4    # Lcom/google/android/gms/internal/ads/zzfmq;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v7, Lcom/google/android/gms/internal/ads/zzbpt;

    sget-object v4, Lcom/google/android/gms/internal/ads/zzbqh;->zza:Lcom/google/android/gms/ads/internal/util/zzbd;

    sget-object v5, Lcom/google/android/gms/internal/ads/zzbqh;->zzb:Lcom/google/android/gms/ads/internal/util/zzbd;

    move-object v0, v7

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v6, p4

    invoke-direct/range {v0 .. v6}, Lcom/google/android/gms/internal/ads/zzbpt;-><init>(Landroid/content/Context;Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;Ljava/lang/String;Lcom/google/android/gms/ads/internal/util/zzbd;Lcom/google/android/gms/ads/internal/util/zzbd;Lcom/google/android/gms/internal/ads/zzfmq;)V

    iput-object v7, p0, Lcom/google/android/gms/internal/ads/zzbqh;->zzc:Lcom/google/android/gms/internal/ads/zzbpt;

    return-void
.end method


# virtual methods
.method public final zza(Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzbqa;Lcom/google/android/gms/internal/ads/zzbpz;)Lcom/google/android/gms/internal/ads/zzbpx;
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/ads/zzbql;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzbqh;->zzc:Lcom/google/android/gms/internal/ads/zzbpt;

    invoke-direct {v0, v1, p1, p2, p3}, Lcom/google/android/gms/internal/ads/zzbql;-><init>(Lcom/google/android/gms/internal/ads/zzbpt;Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzbqa;Lcom/google/android/gms/internal/ads/zzbpz;)V

    return-object v0
.end method

.method public final zzb()Lcom/google/android/gms/internal/ads/zzbqq;
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/ads/zzbqq;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzbqh;->zzc:Lcom/google/android/gms/internal/ads/zzbpt;

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/zzbqq;-><init>(Lcom/google/android/gms/internal/ads/zzbpt;)V

    return-object v0
.end method
