.class public final synthetic Lcom/google/mlkit/vision/codescanner/internal/zzc;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-code-scanner@@16.1.0"

# interfaces
.implements Lcom/google/android/gms/common/api/OptionalModuleApi;


# static fields
.field public static final synthetic zza:Lcom/google/mlkit/vision/codescanner/internal/zzc;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/mlkit/vision/codescanner/internal/zzc;

    invoke-direct {v0}, Lcom/google/mlkit/vision/codescanner/internal/zzc;-><init>()V

    sput-object v0, Lcom/google/mlkit/vision/codescanner/internal/zzc;->zza:Lcom/google/mlkit/vision/codescanner/internal/zzc;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final getOptionalFeatures()[Lcom/google/android/gms/common/Feature;
    .locals 3

    sget v0, Lcom/google/mlkit/vision/codescanner/internal/zze;->zzb:I

    const/4 v0, 0x1

    .line 1
    new-array v0, v0, [Lcom/google/android/gms/common/Feature;

    const/4 v1, 0x0

    sget-object v2, Lcom/google/mlkit/common/sdkinternal/OptionalModuleUtils;->FEATURE_BARCODE:Lcom/google/android/gms/common/Feature;

    aput-object v2, v0, v1

    return-object v0
.end method
