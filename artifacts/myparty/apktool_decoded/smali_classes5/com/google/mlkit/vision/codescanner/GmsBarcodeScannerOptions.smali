.class public Lcom/google/mlkit/vision/codescanner/GmsBarcodeScannerOptions;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-code-scanner@@16.1.0"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/mlkit/vision/codescanner/GmsBarcodeScannerOptions$Builder;
    }
.end annotation


# instance fields
.field private final zza:I

.field private final zzb:Z

.field private final zzc:Z


# direct methods
.method synthetic constructor <init>(IZZLcom/google/mlkit/vision/codescanner/zza;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/google/mlkit/vision/codescanner/GmsBarcodeScannerOptions;->zza:I

    iput-boolean p2, p0, Lcom/google/mlkit/vision/codescanner/GmsBarcodeScannerOptions;->zzb:Z

    iput-boolean p3, p0, Lcom/google/mlkit/vision/codescanner/GmsBarcodeScannerOptions;->zzc:Z

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    .line 1
    :cond_0
    instance-of v1, p1, Lcom/google/mlkit/vision/codescanner/GmsBarcodeScannerOptions;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/google/mlkit/vision/codescanner/GmsBarcodeScannerOptions;

    iget v1, p0, Lcom/google/mlkit/vision/codescanner/GmsBarcodeScannerOptions;->zza:I

    .line 2
    iget v3, p1, Lcom/google/mlkit/vision/codescanner/GmsBarcodeScannerOptions;->zza:I

    if-ne v1, v3, :cond_2

    iget-boolean v1, p0, Lcom/google/mlkit/vision/codescanner/GmsBarcodeScannerOptions;->zzb:Z

    iget-boolean v3, p1, Lcom/google/mlkit/vision/codescanner/GmsBarcodeScannerOptions;->zzb:Z

    if-ne v1, v3, :cond_2

    iget-boolean v1, p0, Lcom/google/mlkit/vision/codescanner/GmsBarcodeScannerOptions;->zzc:Z

    iget-boolean p1, p1, Lcom/google/mlkit/vision/codescanner/GmsBarcodeScannerOptions;->zzc:Z

    if-ne v1, p1, :cond_2

    return v0

    :cond_2
    return v2
.end method

.method public hashCode()I
    .locals 3

    .line 1
    iget v0, p0, Lcom/google/mlkit/vision/codescanner/GmsBarcodeScannerOptions;->zza:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iget-boolean v1, p0, Lcom/google/mlkit/vision/codescanner/GmsBarcodeScannerOptions;->zzb:Z

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    iget-boolean v2, p0, Lcom/google/mlkit/vision/codescanner/GmsBarcodeScannerOptions;->zzc:Z

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    filled-new-array {v0, v1, v2}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/common/internal/Objects;->hashCode([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final zza()I
    .locals 1

    iget v0, p0, Lcom/google/mlkit/vision/codescanner/GmsBarcodeScannerOptions;->zza:I

    return v0
.end method

.method public final zzb()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/mlkit/vision/codescanner/GmsBarcodeScannerOptions;->zzc:Z

    return v0
.end method

.method public final zzc()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/mlkit/vision/codescanner/GmsBarcodeScannerOptions;->zzb:Z

    return v0
.end method
