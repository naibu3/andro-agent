.class public final enum Lcom/google/android/gms/internal/ads/zzfmy;
.super Ljava/lang/Enum;
.source "com.google.android.gms:play-services-ads@@23.2.0"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzhbs;


# static fields
.field public static final enum zza:Lcom/google/android/gms/internal/ads/zzfmy;

.field public static final enum zzb:Lcom/google/android/gms/internal/ads/zzfmy;

.field public static final enum zzc:Lcom/google/android/gms/internal/ads/zzfmy;

.field public static final enum zzd:Lcom/google/android/gms/internal/ads/zzfmy;

.field private static final zze:Lcom/google/android/gms/internal/ads/zzhbt;

.field private static final synthetic zzf:[Lcom/google/android/gms/internal/ads/zzfmy;


# instance fields
.field private final zzg:I


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/ads/zzfmy;

    const-string v1, "ORIENTATION_UNKNOWN"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lcom/google/android/gms/internal/ads/zzfmy;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/google/android/gms/internal/ads/zzfmy;->zza:Lcom/google/android/gms/internal/ads/zzfmy;

    new-instance v1, Lcom/google/android/gms/internal/ads/zzfmy;

    const-string v2, "ORIENTATION_PORTRAIT"

    const/4 v3, 0x1

    .line 2
    invoke-direct {v1, v2, v3, v3}, Lcom/google/android/gms/internal/ads/zzfmy;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lcom/google/android/gms/internal/ads/zzfmy;->zzb:Lcom/google/android/gms/internal/ads/zzfmy;

    new-instance v2, Lcom/google/android/gms/internal/ads/zzfmy;

    const-string v3, "ORIENTATION_LANDSCAPE"

    const/4 v4, 0x2

    .line 3
    invoke-direct {v2, v3, v4, v4}, Lcom/google/android/gms/internal/ads/zzfmy;-><init>(Ljava/lang/String;II)V

    sput-object v2, Lcom/google/android/gms/internal/ads/zzfmy;->zzc:Lcom/google/android/gms/internal/ads/zzfmy;

    new-instance v3, Lcom/google/android/gms/internal/ads/zzfmy;

    const/4 v4, 0x3

    const/4 v5, -0x1

    .line 4
    const-string v6, "UNRECOGNIZED"

    invoke-direct {v3, v6, v4, v5}, Lcom/google/android/gms/internal/ads/zzfmy;-><init>(Ljava/lang/String;II)V

    sput-object v3, Lcom/google/android/gms/internal/ads/zzfmy;->zzd:Lcom/google/android/gms/internal/ads/zzfmy;

    filled-new-array {v0, v1, v2, v3}, [Lcom/google/android/gms/internal/ads/zzfmy;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/ads/zzfmy;->zzf:[Lcom/google/android/gms/internal/ads/zzfmy;

    new-instance v0, Lcom/google/android/gms/internal/ads/zzfmx;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzfmx;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ads/zzfmy;->zze:Lcom/google/android/gms/internal/ads/zzhbt;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lcom/google/android/gms/internal/ads/zzfmy;->zzg:I

    return-void
.end method

.method public static values()[Lcom/google/android/gms/internal/ads/zzfmy;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/ads/zzfmy;->zzf:[Lcom/google/android/gms/internal/ads/zzfmy;

    invoke-virtual {v0}, [Lcom/google/android/gms/internal/ads/zzfmy;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/google/android/gms/internal/ads/zzfmy;

    return-object v0
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzfmy;->zza()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final zza()I
    .locals 2

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/ads/zzfmy;->zzd:Lcom/google/android/gms/internal/ads/zzfmy;

    if-eq p0, v0, :cond_0

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzfmy;->zzg:I

    return v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Can\'t get the number of an unknown enum value."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
