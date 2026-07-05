.class public interface abstract Lcom/google/mlkit/vision/codescanner/GmsBarcodeScanner;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-code-scanner@@16.1.0"

# interfaces
.implements Lcom/google/android/gms/common/api/OptionalModuleApi;


# virtual methods
.method public abstract startScan()Lcom/google/android/gms/tasks/Task;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/tasks/Task<",
            "Lcom/google/mlkit/vision/barcode/common/Barcode;",
            ">;"
        }
    .end annotation
.end method
