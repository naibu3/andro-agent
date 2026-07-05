.class public final enum Lcom/google/android/gms/internal/ads/zzhgf;
.super Ljava/lang/Enum;
.source "com.google.android.gms:play-services-ads@@23.2.0"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzhbs;


# static fields
.field public static final enum zza:Lcom/google/android/gms/internal/ads/zzhgf;

.field public static final enum zzb:Lcom/google/android/gms/internal/ads/zzhgf;

.field public static final enum zzc:Lcom/google/android/gms/internal/ads/zzhgf;

.field public static final enum zzd:Lcom/google/android/gms/internal/ads/zzhgf;

.field public static final enum zze:Lcom/google/android/gms/internal/ads/zzhgf;

.field public static final enum zzf:Lcom/google/android/gms/internal/ads/zzhgf;

.field private static final zzg:Lcom/google/android/gms/internal/ads/zzhbt;

.field private static final synthetic zzh:[Lcom/google/android/gms/internal/ads/zzhgf;


# instance fields
.field private final zzi:I


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/ads/zzhgf;

    const-string v1, "UNSPECIFIED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lcom/google/android/gms/internal/ads/zzhgf;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/google/android/gms/internal/ads/zzhgf;->zza:Lcom/google/android/gms/internal/ads/zzhgf;

    new-instance v1, Lcom/google/android/gms/internal/ads/zzhgf;

    const-string v2, "TAILORED_WARNING_CT_BASE"

    const/4 v3, 0x1

    .line 2
    invoke-direct {v1, v2, v3, v3}, Lcom/google/android/gms/internal/ads/zzhgf;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lcom/google/android/gms/internal/ads/zzhgf;->zzb:Lcom/google/android/gms/internal/ads/zzhgf;

    new-instance v2, Lcom/google/android/gms/internal/ads/zzhgf;

    const-string v3, "TAILORED_WARNING_CT"

    const/4 v4, 0x2

    .line 3
    invoke-direct {v2, v3, v4, v4}, Lcom/google/android/gms/internal/ads/zzhgf;-><init>(Ljava/lang/String;II)V

    sput-object v2, Lcom/google/android/gms/internal/ads/zzhgf;->zzc:Lcom/google/android/gms/internal/ads/zzhgf;

    new-instance v3, Lcom/google/android/gms/internal/ads/zzhgf;

    const-string v4, "TAILORED_WARNING_CT_ACCOUNT_INFO"

    const/4 v5, 0x3

    .line 4
    invoke-direct {v3, v4, v5, v5}, Lcom/google/android/gms/internal/ads/zzhgf;-><init>(Ljava/lang/String;II)V

    sput-object v3, Lcom/google/android/gms/internal/ads/zzhgf;->zzd:Lcom/google/android/gms/internal/ads/zzhgf;

    new-instance v4, Lcom/google/android/gms/internal/ads/zzhgf;

    const-string v5, "TAILORED_WARNING_SUSPICIOUS_BASE"

    const/4 v6, 0x4

    .line 5
    invoke-direct {v4, v5, v6, v6}, Lcom/google/android/gms/internal/ads/zzhgf;-><init>(Ljava/lang/String;II)V

    sput-object v4, Lcom/google/android/gms/internal/ads/zzhgf;->zze:Lcom/google/android/gms/internal/ads/zzhgf;

    new-instance v5, Lcom/google/android/gms/internal/ads/zzhgf;

    const-string v6, "TAILORED_WARNING_SUSPICIOUS"

    const/4 v7, 0x5

    .line 6
    invoke-direct {v5, v6, v7, v7}, Lcom/google/android/gms/internal/ads/zzhgf;-><init>(Ljava/lang/String;II)V

    sput-object v5, Lcom/google/android/gms/internal/ads/zzhgf;->zzf:Lcom/google/android/gms/internal/ads/zzhgf;

    filled-new-array/range {v0 .. v5}, [Lcom/google/android/gms/internal/ads/zzhgf;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/ads/zzhgf;->zzh:[Lcom/google/android/gms/internal/ads/zzhgf;

    new-instance v0, Lcom/google/android/gms/internal/ads/zzhgd;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzhgd;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ads/zzhgf;->zzg:Lcom/google/android/gms/internal/ads/zzhbt;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lcom/google/android/gms/internal/ads/zzhgf;->zzi:I

    return-void
.end method

.method public static values()[Lcom/google/android/gms/internal/ads/zzhgf;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/ads/zzhgf;->zzh:[Lcom/google/android/gms/internal/ads/zzhgf;

    invoke-virtual {v0}, [Lcom/google/android/gms/internal/ads/zzhgf;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/google/android/gms/internal/ads/zzhgf;

    return-object v0
.end method

.method public static zzb(I)Lcom/google/android/gms/internal/ads/zzhgf;
    .locals 1

    if-eqz p0, :cond_5

    const/4 v0, 0x1

    if-eq p0, v0, :cond_4

    const/4 v0, 0x2

    if-eq p0, v0, :cond_3

    const/4 v0, 0x3

    if-eq p0, v0, :cond_2

    const/4 v0, 0x4

    if-eq p0, v0, :cond_1

    const/4 v0, 0x5

    if-eq p0, v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    sget-object p0, Lcom/google/android/gms/internal/ads/zzhgf;->zzf:Lcom/google/android/gms/internal/ads/zzhgf;

    return-object p0

    :cond_1
    sget-object p0, Lcom/google/android/gms/internal/ads/zzhgf;->zze:Lcom/google/android/gms/internal/ads/zzhgf;

    return-object p0

    :cond_2
    sget-object p0, Lcom/google/android/gms/internal/ads/zzhgf;->zzd:Lcom/google/android/gms/internal/ads/zzhgf;

    return-object p0

    :cond_3
    sget-object p0, Lcom/google/android/gms/internal/ads/zzhgf;->zzc:Lcom/google/android/gms/internal/ads/zzhgf;

    return-object p0

    :cond_4
    sget-object p0, Lcom/google/android/gms/internal/ads/zzhgf;->zzb:Lcom/google/android/gms/internal/ads/zzhgf;

    return-object p0

    :cond_5
    sget-object p0, Lcom/google/android/gms/internal/ads/zzhgf;->zza:Lcom/google/android/gms/internal/ads/zzhgf;

    return-object p0
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzhgf;->zzi:I

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final zza()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzhgf;->zzi:I

    return v0
.end method
