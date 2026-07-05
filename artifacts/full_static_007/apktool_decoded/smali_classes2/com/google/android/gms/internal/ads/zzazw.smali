.class public final enum Lcom/google/android/gms/internal/ads/zzazw;
.super Ljava/lang/Enum;
.source "com.google.android.gms:play-services-ads@@23.2.0"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzhbs;


# static fields
.field public static final enum zza:Lcom/google/android/gms/internal/ads/zzazw;

.field public static final enum zzb:Lcom/google/android/gms/internal/ads/zzazw;

.field public static final enum zzc:Lcom/google/android/gms/internal/ads/zzazw;

.field public static final enum zzd:Lcom/google/android/gms/internal/ads/zzazw;

.field public static final enum zze:Lcom/google/android/gms/internal/ads/zzazw;

.field public static final enum zzf:Lcom/google/android/gms/internal/ads/zzazw;

.field public static final enum zzg:Lcom/google/android/gms/internal/ads/zzazw;

.field private static final zzh:Lcom/google/android/gms/internal/ads/zzhbt;

.field private static final synthetic zzi:[Lcom/google/android/gms/internal/ads/zzazw;


# instance fields
.field private final zzj:I


# direct methods
.method static constructor <clinit>()V
    .locals 10

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/ads/zzazw;

    const-string v1, "UNSUPPORTED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lcom/google/android/gms/internal/ads/zzazw;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/google/android/gms/internal/ads/zzazw;->zza:Lcom/google/android/gms/internal/ads/zzazw;

    new-instance v1, Lcom/google/android/gms/internal/ads/zzazw;

    .line 2
    const-string v2, "ARM7"

    const/4 v3, 0x1

    const/4 v4, 0x2

    invoke-direct {v1, v2, v3, v4}, Lcom/google/android/gms/internal/ads/zzazw;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lcom/google/android/gms/internal/ads/zzazw;->zzb:Lcom/google/android/gms/internal/ads/zzazw;

    new-instance v2, Lcom/google/android/gms/internal/ads/zzazw;

    .line 3
    const-string v3, "X86"

    const/4 v5, 0x4

    invoke-direct {v2, v3, v4, v5}, Lcom/google/android/gms/internal/ads/zzazw;-><init>(Ljava/lang/String;II)V

    sput-object v2, Lcom/google/android/gms/internal/ads/zzazw;->zzc:Lcom/google/android/gms/internal/ads/zzazw;

    new-instance v3, Lcom/google/android/gms/internal/ads/zzazw;

    .line 4
    const-string v4, "ARM64"

    const/4 v6, 0x3

    const/4 v7, 0x5

    invoke-direct {v3, v4, v6, v7}, Lcom/google/android/gms/internal/ads/zzazw;-><init>(Ljava/lang/String;II)V

    sput-object v3, Lcom/google/android/gms/internal/ads/zzazw;->zzd:Lcom/google/android/gms/internal/ads/zzazw;

    new-instance v4, Lcom/google/android/gms/internal/ads/zzazw;

    .line 5
    const-string v6, "X86_64"

    const/4 v8, 0x6

    invoke-direct {v4, v6, v5, v8}, Lcom/google/android/gms/internal/ads/zzazw;-><init>(Ljava/lang/String;II)V

    sput-object v4, Lcom/google/android/gms/internal/ads/zzazw;->zze:Lcom/google/android/gms/internal/ads/zzazw;

    new-instance v5, Lcom/google/android/gms/internal/ads/zzazw;

    const-string v6, "RISCV64"

    const/4 v9, 0x7

    .line 6
    invoke-direct {v5, v6, v7, v9}, Lcom/google/android/gms/internal/ads/zzazw;-><init>(Ljava/lang/String;II)V

    sput-object v5, Lcom/google/android/gms/internal/ads/zzazw;->zzf:Lcom/google/android/gms/internal/ads/zzazw;

    new-instance v6, Lcom/google/android/gms/internal/ads/zzazw;

    const-string v7, "UNKNOWN"

    const/16 v9, 0x3e7

    .line 7
    invoke-direct {v6, v7, v8, v9}, Lcom/google/android/gms/internal/ads/zzazw;-><init>(Ljava/lang/String;II)V

    sput-object v6, Lcom/google/android/gms/internal/ads/zzazw;->zzg:Lcom/google/android/gms/internal/ads/zzazw;

    filled-new-array/range {v0 .. v6}, [Lcom/google/android/gms/internal/ads/zzazw;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/ads/zzazw;->zzi:[Lcom/google/android/gms/internal/ads/zzazw;

    new-instance v0, Lcom/google/android/gms/internal/ads/zzazv;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzazv;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ads/zzazw;->zzh:Lcom/google/android/gms/internal/ads/zzhbt;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lcom/google/android/gms/internal/ads/zzazw;->zzj:I

    return-void
.end method

.method public static values()[Lcom/google/android/gms/internal/ads/zzazw;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/ads/zzazw;->zzi:[Lcom/google/android/gms/internal/ads/zzazw;

    invoke-virtual {v0}, [Lcom/google/android/gms/internal/ads/zzazw;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/google/android/gms/internal/ads/zzazw;

    return-object v0
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzazw;->zzj:I

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final zza()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzazw;->zzj:I

    return v0
.end method
