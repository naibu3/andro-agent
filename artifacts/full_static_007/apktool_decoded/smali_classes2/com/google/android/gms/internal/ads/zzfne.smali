.class public final enum Lcom/google/android/gms/internal/ads/zzfne;
.super Ljava/lang/Enum;
.source "com.google.android.gms:play-services-ads@@23.2.0"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzhbs;


# static fields
.field public static final enum zza:Lcom/google/android/gms/internal/ads/zzfne;

.field public static final enum zzb:Lcom/google/android/gms/internal/ads/zzfne;

.field private static final zzc:Lcom/google/android/gms/internal/ads/zzhbt;

.field private static final synthetic zzd:[Lcom/google/android/gms/internal/ads/zzfne;


# instance fields
.field private final zze:I


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/ads/zzfne;

    const-string v1, "TAG_UNKNOWN"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lcom/google/android/gms/internal/ads/zzfne;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/google/android/gms/internal/ads/zzfne;->zza:Lcom/google/android/gms/internal/ads/zzfne;

    new-instance v1, Lcom/google/android/gms/internal/ads/zzfne;

    const/4 v2, 0x1

    const/4 v3, -0x1

    .line 2
    const-string v4, "UNRECOGNIZED"

    invoke-direct {v1, v4, v2, v3}, Lcom/google/android/gms/internal/ads/zzfne;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lcom/google/android/gms/internal/ads/zzfne;->zzb:Lcom/google/android/gms/internal/ads/zzfne;

    filled-new-array {v0, v1}, [Lcom/google/android/gms/internal/ads/zzfne;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/ads/zzfne;->zzd:[Lcom/google/android/gms/internal/ads/zzfne;

    new-instance v0, Lcom/google/android/gms/internal/ads/zzfnd;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzfnd;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ads/zzfne;->zzc:Lcom/google/android/gms/internal/ads/zzhbt;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lcom/google/android/gms/internal/ads/zzfne;->zze:I

    return-void
.end method

.method public static values()[Lcom/google/android/gms/internal/ads/zzfne;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/ads/zzfne;->zzd:[Lcom/google/android/gms/internal/ads/zzfne;

    invoke-virtual {v0}, [Lcom/google/android/gms/internal/ads/zzfne;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/google/android/gms/internal/ads/zzfne;

    return-object v0
.end method

.method public static zzb(I)Lcom/google/android/gms/internal/ads/zzfne;
    .locals 0

    if-eqz p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    sget-object p0, Lcom/google/android/gms/internal/ads/zzfne;->zza:Lcom/google/android/gms/internal/ads/zzfne;

    return-object p0
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzfne;->zza()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final zza()I
    .locals 2

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/ads/zzfne;->zzb:Lcom/google/android/gms/internal/ads/zzfne;

    if-eq p0, v0, :cond_0

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzfne;->zze:I

    return v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Can\'t get the number of an unknown enum value."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
