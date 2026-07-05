.class public final Lcom/google/android/gms/internal/mlkit_code_scanner/zzad;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-code-scanner@@16.1.0"


# instance fields
.field private zza:I

.field private final zzb:Lcom/google/android/gms/internal/mlkit_code_scanner/zzag;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lcom/google/android/gms/internal/mlkit_code_scanner/zzag;->zza:Lcom/google/android/gms/internal/mlkit_code_scanner/zzag;

    iput-object v0, p0, Lcom/google/android/gms/internal/mlkit_code_scanner/zzad;->zzb:Lcom/google/android/gms/internal/mlkit_code_scanner/zzag;

    return-void
.end method


# virtual methods
.method public final zza(I)Lcom/google/android/gms/internal/mlkit_code_scanner/zzad;
    .locals 0

    iput p1, p0, Lcom/google/android/gms/internal/mlkit_code_scanner/zzad;->zza:I

    return-object p0
.end method

.method public final zzb()Lcom/google/android/gms/internal/mlkit_code_scanner/zzah;
    .locals 3

    new-instance v0, Lcom/google/android/gms/internal/mlkit_code_scanner/zzac;

    iget v1, p0, Lcom/google/android/gms/internal/mlkit_code_scanner/zzad;->zza:I

    iget-object v2, p0, Lcom/google/android/gms/internal/mlkit_code_scanner/zzad;->zzb:Lcom/google/android/gms/internal/mlkit_code_scanner/zzag;

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/internal/mlkit_code_scanner/zzac;-><init>(ILcom/google/android/gms/internal/mlkit_code_scanner/zzag;)V

    return-object v0
.end method
