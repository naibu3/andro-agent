.class public final Lcom/google/android/gms/internal/mlkit_code_scanner/zzm;
.super Lcom/google/android/gms/internal/mlkit_code_scanner/zzj;
.source "com.google.android.gms:play-services-code-scanner@@16.1.0"


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x4

    .line 1
    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/mlkit_code_scanner/zzj;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final zza(Ljava/lang/Object;)Lcom/google/android/gms/internal/mlkit_code_scanner/zzm;
    .locals 6

    .line 6
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1
    iget v0, p0, Lcom/google/android/gms/internal/mlkit_code_scanner/zzj;->zzb:I

    add-int/lit8 v1, v0, 0x1

    iget-object v2, p0, Lcom/google/android/gms/internal/mlkit_code_scanner/zzj;->zza:[Ljava/lang/Object;

    array-length v3, v2

    const/4 v4, 0x0

    if-ge v3, v1, :cond_2

    shr-int/lit8 v5, v3, 0x1

    add-int/2addr v3, v5

    add-int/lit8 v3, v3, 0x1

    if-ge v3, v1, :cond_0

    .line 2
    invoke-static {v0}, Ljava/lang/Integer;->highestOneBit(I)I

    move-result v0

    add-int v3, v0, v0

    :cond_0
    if-gez v3, :cond_1

    const v3, 0x7fffffff

    .line 3
    :cond_1
    invoke-static {v2, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/mlkit_code_scanner/zzj;->zza:[Ljava/lang/Object;

    iput-boolean v4, p0, Lcom/google/android/gms/internal/mlkit_code_scanner/zzj;->zzc:Z

    goto :goto_0

    .line 5
    :cond_2
    iget-boolean v0, p0, Lcom/google/android/gms/internal/mlkit_code_scanner/zzj;->zzc:Z

    if-eqz v0, :cond_3

    .line 4
    invoke-virtual {v2}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/Object;

    iput-object v0, p0, Lcom/google/android/gms/internal/mlkit_code_scanner/zzj;->zza:[Ljava/lang/Object;

    iput-boolean v4, p0, Lcom/google/android/gms/internal/mlkit_code_scanner/zzj;->zzc:Z

    .line 3
    :cond_3
    :goto_0
    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_code_scanner/zzj;->zza:[Ljava/lang/Object;

    iget v1, p0, Lcom/google/android/gms/internal/mlkit_code_scanner/zzj;->zzb:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lcom/google/android/gms/internal/mlkit_code_scanner/zzj;->zzb:I

    .line 5
    aput-object p1, v0, v1

    return-object p0
.end method

.method public final zzb()Lcom/google/android/gms/internal/mlkit_code_scanner/zzp;
    .locals 2

    const/4 v0, 0x1

    .line 1
    iput-boolean v0, p0, Lcom/google/android/gms/internal/mlkit_code_scanner/zzm;->zzc:Z

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_code_scanner/zzm;->zza:[Ljava/lang/Object;

    iget v1, p0, Lcom/google/android/gms/internal/mlkit_code_scanner/zzm;->zzb:I

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/mlkit_code_scanner/zzp;->zzg([Ljava/lang/Object;I)Lcom/google/android/gms/internal/mlkit_code_scanner/zzp;

    move-result-object v0

    return-object v0
.end method
