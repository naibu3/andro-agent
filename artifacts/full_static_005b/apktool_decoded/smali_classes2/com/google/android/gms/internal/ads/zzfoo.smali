.class public final enum Lcom/google/android/gms/internal/ads/zzfoo;
.super Ljava/lang/Enum;
.source "com.google.android.gms:play-services-ads@@23.2.0"


# static fields
.field public static final enum zza:Lcom/google/android/gms/internal/ads/zzfoo;

.field public static final enum zzb:Lcom/google/android/gms/internal/ads/zzfoo;

.field public static final enum zzc:Lcom/google/android/gms/internal/ads/zzfoo;

.field public static final enum zzd:Lcom/google/android/gms/internal/ads/zzfoo;

.field public static final enum zze:Lcom/google/android/gms/internal/ads/zzfoo;

.field private static final synthetic zzf:[Lcom/google/android/gms/internal/ads/zzfoo;


# instance fields
.field private final zzg:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/ads/zzfoo;

    const-string v1, "DEFINED_BY_JAVASCRIPT"

    const/4 v2, 0x0

    const-string v3, "definedByJavaScript"

    invoke-direct {v0, v1, v2, v3}, Lcom/google/android/gms/internal/ads/zzfoo;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/google/android/gms/internal/ads/zzfoo;->zza:Lcom/google/android/gms/internal/ads/zzfoo;

    new-instance v1, Lcom/google/android/gms/internal/ads/zzfoo;

    const-string v2, "HTML_DISPLAY"

    const/4 v3, 0x1

    .line 2
    const-string v4, "htmlDisplay"

    invoke-direct {v1, v2, v3, v4}, Lcom/google/android/gms/internal/ads/zzfoo;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, Lcom/google/android/gms/internal/ads/zzfoo;->zzb:Lcom/google/android/gms/internal/ads/zzfoo;

    new-instance v2, Lcom/google/android/gms/internal/ads/zzfoo;

    const-string v3, "NATIVE_DISPLAY"

    const/4 v4, 0x2

    .line 3
    const-string v5, "nativeDisplay"

    invoke-direct {v2, v3, v4, v5}, Lcom/google/android/gms/internal/ads/zzfoo;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v2, Lcom/google/android/gms/internal/ads/zzfoo;->zzc:Lcom/google/android/gms/internal/ads/zzfoo;

    new-instance v3, Lcom/google/android/gms/internal/ads/zzfoo;

    const-string v4, "VIDEO"

    const/4 v5, 0x3

    .line 4
    const-string v6, "video"

    invoke-direct {v3, v4, v5, v6}, Lcom/google/android/gms/internal/ads/zzfoo;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v3, Lcom/google/android/gms/internal/ads/zzfoo;->zzd:Lcom/google/android/gms/internal/ads/zzfoo;

    new-instance v4, Lcom/google/android/gms/internal/ads/zzfoo;

    const-string v5, "AUDIO"

    const/4 v6, 0x4

    .line 5
    const-string v7, "audio"

    invoke-direct {v4, v5, v6, v7}, Lcom/google/android/gms/internal/ads/zzfoo;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v4, Lcom/google/android/gms/internal/ads/zzfoo;->zze:Lcom/google/android/gms/internal/ads/zzfoo;

    filled-new-array {v0, v1, v2, v3, v4}, [Lcom/google/android/gms/internal/ads/zzfoo;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/ads/zzfoo;->zzf:[Lcom/google/android/gms/internal/ads/zzfoo;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzfoo;->zzg:Ljava/lang/String;

    return-void
.end method

.method public static values()[Lcom/google/android/gms/internal/ads/zzfoo;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/ads/zzfoo;->zzf:[Lcom/google/android/gms/internal/ads/zzfoo;

    invoke-virtual {v0}, [Lcom/google/android/gms/internal/ads/zzfoo;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/google/android/gms/internal/ads/zzfoo;

    return-object v0
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfoo;->zzg:Ljava/lang/String;

    return-object v0
.end method
