.class public final synthetic Lcom/google/mlkit/vision/codescanner/internal/zzf;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-code-scanner@@16.1.0"

# interfaces
.implements Landroidx/activity/result/ActivityResultCallback;


# instance fields
.field public final synthetic zza:Lcom/google/mlkit/vision/codescanner/internal/GmsBarcodeScanningDelegateActivity;


# direct methods
.method public synthetic constructor <init>(Lcom/google/mlkit/vision/codescanner/internal/GmsBarcodeScanningDelegateActivity;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/mlkit/vision/codescanner/internal/zzf;->zza:Lcom/google/mlkit/vision/codescanner/internal/GmsBarcodeScanningDelegateActivity;

    return-void
.end method


# virtual methods
.method public final onActivityResult(Ljava/lang/Object;)V
    .locals 3

    iget-object v0, p0, Lcom/google/mlkit/vision/codescanner/internal/zzf;->zza:Lcom/google/mlkit/vision/codescanner/internal/GmsBarcodeScanningDelegateActivity;

    check-cast p1, Landroidx/activity/result/ActivityResult;

    .line 1
    invoke-virtual {p1}, Landroidx/activity/result/ActivityResult;->getData()Landroid/content/Intent;

    move-result-object v1

    .line 2
    invoke-virtual {p1}, Landroidx/activity/result/ActivityResult;->getResultCode()I

    move-result p1

    const/4 v2, -0x1

    if-ne p1, v2, :cond_0

    if-eqz v1, :cond_0

    .line 3
    const-string p1, "extra_barcode_result"

    invoke-virtual {v1, p1}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 6
    invoke-virtual {v1, p1}, Landroid/content/Intent;->getByteArrayExtra(Ljava/lang/String;)[B

    move-result-object p1

    invoke-static {p1}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [B

    sget-object v1, Lcom/google/android/gms/internal/mlkit_code_scanner/zzoz;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 7
    invoke-static {p1, v1}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelableSerializer;->deserializeFromBytes([BLandroid/os/Parcelable$Creator;)Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/mlkit_code_scanner/zzoz;

    .line 8
    new-instance v1, Lcom/google/mlkit/vision/barcode/common/Barcode;

    new-instance v2, Lcom/google/mlkit/vision/codescanner/internal/zza;

    invoke-direct {v2, p1}, Lcom/google/mlkit/vision/codescanner/internal/zza;-><init>(Lcom/google/android/gms/internal/mlkit_code_scanner/zzoz;)V

    invoke-direct {v1, v2}, Lcom/google/mlkit/vision/barcode/common/Barcode;-><init>(Lcom/google/mlkit/vision/barcode/common/internal/BarcodeSource;)V

    const/4 p1, 0x0

    invoke-static {v1, p1}, Lcom/google/mlkit/vision/codescanner/internal/zze;->zzc(Lcom/google/mlkit/vision/barcode/common/Barcode;I)V

    goto :goto_0

    :cond_0
    const/16 p1, 0xd

    if-eqz v1, :cond_1

    .line 9
    const-string v2, "extra_error_code"

    .line 4
    invoke-virtual {v1, v2, p1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result p1

    :cond_1
    const/4 v1, 0x0

    .line 5
    invoke-static {v1, p1}, Lcom/google/mlkit/vision/codescanner/internal/zze;->zzc(Lcom/google/mlkit/vision/barcode/common/Barcode;I)V

    .line 9
    :goto_0
    invoke-virtual {v0}, Lcom/google/mlkit/vision/codescanner/internal/GmsBarcodeScanningDelegateActivity;->finish()V

    return-void
.end method
