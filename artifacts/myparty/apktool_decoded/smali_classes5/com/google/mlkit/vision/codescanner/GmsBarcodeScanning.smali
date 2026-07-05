.class public final Lcom/google/mlkit/vision/codescanner/GmsBarcodeScanning;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-code-scanner@@16.1.0"


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static getClient(Landroid/content/Context;)Lcom/google/mlkit/vision/codescanner/GmsBarcodeScanner;
    .locals 2

    .line 1
    new-instance v0, Lcom/google/mlkit/vision/codescanner/internal/zze;

    new-instance v1, Lcom/google/mlkit/vision/codescanner/GmsBarcodeScannerOptions$Builder;

    invoke-direct {v1}, Lcom/google/mlkit/vision/codescanner/GmsBarcodeScannerOptions$Builder;-><init>()V

    invoke-virtual {v1}, Lcom/google/mlkit/vision/codescanner/GmsBarcodeScannerOptions$Builder;->build()Lcom/google/mlkit/vision/codescanner/GmsBarcodeScannerOptions;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lcom/google/mlkit/vision/codescanner/internal/zze;-><init>(Landroid/content/Context;Lcom/google/mlkit/vision/codescanner/GmsBarcodeScannerOptions;)V

    return-object v0
.end method

.method public static getClient(Landroid/content/Context;Lcom/google/mlkit/vision/codescanner/GmsBarcodeScannerOptions;)Lcom/google/mlkit/vision/codescanner/GmsBarcodeScanner;
    .locals 1

    .line 2
    new-instance v0, Lcom/google/mlkit/vision/codescanner/internal/zze;

    invoke-direct {v0, p0, p1}, Lcom/google/mlkit/vision/codescanner/internal/zze;-><init>(Landroid/content/Context;Lcom/google/mlkit/vision/codescanner/GmsBarcodeScannerOptions;)V

    return-object v0
.end method
