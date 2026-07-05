.class public Lcom/google/mlkit/vision/codescanner/GmsBarcodeScannerOptions$Builder;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-code-scanner@@16.1.0"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/mlkit/vision/codescanner/GmsBarcodeScannerOptions;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Builder"
.end annotation


# instance fields
.field private zza:I

.field private zzb:Z

.field private zzc:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lcom/google/mlkit/vision/codescanner/GmsBarcodeScannerOptions$Builder;->zza:I

    return-void
.end method


# virtual methods
.method public allowManualInput()Lcom/google/mlkit/vision/codescanner/GmsBarcodeScannerOptions$Builder;
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/mlkit/vision/codescanner/GmsBarcodeScannerOptions$Builder;->zzb:Z

    return-object p0
.end method

.method public build()Lcom/google/mlkit/vision/codescanner/GmsBarcodeScannerOptions;
    .locals 5

    new-instance v0, Lcom/google/mlkit/vision/codescanner/GmsBarcodeScannerOptions;

    iget v1, p0, Lcom/google/mlkit/vision/codescanner/GmsBarcodeScannerOptions$Builder;->zza:I

    iget-boolean v2, p0, Lcom/google/mlkit/vision/codescanner/GmsBarcodeScannerOptions$Builder;->zzb:Z

    iget-boolean v3, p0, Lcom/google/mlkit/vision/codescanner/GmsBarcodeScannerOptions$Builder;->zzc:Z

    const/4 v4, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/google/mlkit/vision/codescanner/GmsBarcodeScannerOptions;-><init>(IZZLcom/google/mlkit/vision/codescanner/zza;)V

    return-object v0
.end method

.method public enableAutoZoom()Lcom/google/mlkit/vision/codescanner/GmsBarcodeScannerOptions$Builder;
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/mlkit/vision/codescanner/GmsBarcodeScannerOptions$Builder;->zzc:Z

    return-object p0
.end method

.method public varargs setBarcodeFormats(I[I)Lcom/google/mlkit/vision/codescanner/GmsBarcodeScannerOptions$Builder;
    .locals 3

    .line 1
    iput p1, p0, Lcom/google/mlkit/vision/codescanner/GmsBarcodeScannerOptions$Builder;->zza:I

    array-length p1, p2

    const/4 v0, 0x0

    :goto_0
    if-ge v0, p1, :cond_0

    aget v1, p2, v0

    iget v2, p0, Lcom/google/mlkit/vision/codescanner/GmsBarcodeScannerOptions$Builder;->zza:I

    or-int/2addr v1, v2

    iput v1, p0, Lcom/google/mlkit/vision/codescanner/GmsBarcodeScannerOptions$Builder;->zza:I

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-object p0
.end method
