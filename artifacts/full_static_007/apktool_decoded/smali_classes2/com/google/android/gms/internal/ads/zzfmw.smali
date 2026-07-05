.class public final enum Lcom/google/android/gms/internal/ads/zzfmw;
.super Ljava/lang/Enum;
.source "com.google.android.gms:play-services-ads@@23.2.0"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzhbs;


# static fields
.field public static final enum zza:Lcom/google/android/gms/internal/ads/zzfmw;

.field public static final enum zzb:Lcom/google/android/gms/internal/ads/zzfmw;

.field public static final enum zzc:Lcom/google/android/gms/internal/ads/zzfmw;

.field public static final enum zzd:Lcom/google/android/gms/internal/ads/zzfmw;

.field public static final enum zze:Lcom/google/android/gms/internal/ads/zzfmw;

.field public static final enum zzf:Lcom/google/android/gms/internal/ads/zzfmw;

.field public static final enum zzg:Lcom/google/android/gms/internal/ads/zzfmw;

.field public static final enum zzh:Lcom/google/android/gms/internal/ads/zzfmw;

.field private static final zzi:Lcom/google/android/gms/internal/ads/zzhbt;

.field private static final synthetic zzj:[Lcom/google/android/gms/internal/ads/zzfmw;


# instance fields
.field private final zzk:I


# direct methods
.method static constructor <clinit>()V
    .locals 11

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/ads/zzfmw;

    const-string v1, "FORMAT_UNKNOWN"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lcom/google/android/gms/internal/ads/zzfmw;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/google/android/gms/internal/ads/zzfmw;->zza:Lcom/google/android/gms/internal/ads/zzfmw;

    new-instance v1, Lcom/google/android/gms/internal/ads/zzfmw;

    const-string v2, "FORMAT_BANNER"

    const/4 v3, 0x1

    .line 2
    invoke-direct {v1, v2, v3, v3}, Lcom/google/android/gms/internal/ads/zzfmw;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lcom/google/android/gms/internal/ads/zzfmw;->zzb:Lcom/google/android/gms/internal/ads/zzfmw;

    new-instance v2, Lcom/google/android/gms/internal/ads/zzfmw;

    const-string v3, "FORMAT_INTERSTITIAL"

    const/4 v4, 0x2

    .line 3
    invoke-direct {v2, v3, v4, v4}, Lcom/google/android/gms/internal/ads/zzfmw;-><init>(Ljava/lang/String;II)V

    sput-object v2, Lcom/google/android/gms/internal/ads/zzfmw;->zzc:Lcom/google/android/gms/internal/ads/zzfmw;

    new-instance v3, Lcom/google/android/gms/internal/ads/zzfmw;

    const-string v4, "FORMAT_REWARDED"

    const/4 v5, 0x3

    .line 4
    invoke-direct {v3, v4, v5, v5}, Lcom/google/android/gms/internal/ads/zzfmw;-><init>(Ljava/lang/String;II)V

    sput-object v3, Lcom/google/android/gms/internal/ads/zzfmw;->zzd:Lcom/google/android/gms/internal/ads/zzfmw;

    new-instance v4, Lcom/google/android/gms/internal/ads/zzfmw;

    const-string v5, "FORMAT_REWARDED_INTERSTITIAL"

    const/4 v6, 0x4

    .line 5
    invoke-direct {v4, v5, v6, v6}, Lcom/google/android/gms/internal/ads/zzfmw;-><init>(Ljava/lang/String;II)V

    sput-object v4, Lcom/google/android/gms/internal/ads/zzfmw;->zze:Lcom/google/android/gms/internal/ads/zzfmw;

    new-instance v5, Lcom/google/android/gms/internal/ads/zzfmw;

    const-string v6, "FORMAT_APP_OPEN"

    const/4 v7, 0x5

    .line 6
    invoke-direct {v5, v6, v7, v7}, Lcom/google/android/gms/internal/ads/zzfmw;-><init>(Ljava/lang/String;II)V

    sput-object v5, Lcom/google/android/gms/internal/ads/zzfmw;->zzf:Lcom/google/android/gms/internal/ads/zzfmw;

    new-instance v6, Lcom/google/android/gms/internal/ads/zzfmw;

    const-string v7, "FORMAT_NATIVE"

    const/4 v8, 0x6

    .line 7
    invoke-direct {v6, v7, v8, v8}, Lcom/google/android/gms/internal/ads/zzfmw;-><init>(Ljava/lang/String;II)V

    sput-object v6, Lcom/google/android/gms/internal/ads/zzfmw;->zzg:Lcom/google/android/gms/internal/ads/zzfmw;

    new-instance v7, Lcom/google/android/gms/internal/ads/zzfmw;

    const/4 v8, 0x7

    const/4 v9, -0x1

    .line 8
    const-string v10, "UNRECOGNIZED"

    invoke-direct {v7, v10, v8, v9}, Lcom/google/android/gms/internal/ads/zzfmw;-><init>(Ljava/lang/String;II)V

    sput-object v7, Lcom/google/android/gms/internal/ads/zzfmw;->zzh:Lcom/google/android/gms/internal/ads/zzfmw;

    filled-new-array/range {v0 .. v7}, [Lcom/google/android/gms/internal/ads/zzfmw;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/ads/zzfmw;->zzj:[Lcom/google/android/gms/internal/ads/zzfmw;

    new-instance v0, Lcom/google/android/gms/internal/ads/zzfmv;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzfmv;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ads/zzfmw;->zzi:Lcom/google/android/gms/internal/ads/zzhbt;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lcom/google/android/gms/internal/ads/zzfmw;->zzk:I

    return-void
.end method

.method public static values()[Lcom/google/android/gms/internal/ads/zzfmw;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/ads/zzfmw;->zzj:[Lcom/google/android/gms/internal/ads/zzfmw;

    invoke-virtual {v0}, [Lcom/google/android/gms/internal/ads/zzfmw;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/google/android/gms/internal/ads/zzfmw;

    return-object v0
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzfmw;->zza()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final zza()I
    .locals 2

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/ads/zzfmw;->zzh:Lcom/google/android/gms/internal/ads/zzfmw;

    if-eq p0, v0, :cond_0

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzfmw;->zzk:I

    return v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Can\'t get the number of an unknown enum value."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
