.class final Lcom/google/android/gms/internal/mlkit_code_scanner/zzn;
.super Lcom/google/android/gms/internal/mlkit_code_scanner/zzh;
.source "com.google.android.gms:play-services-code-scanner@@16.1.0"


# instance fields
.field private final zza:Lcom/google/android/gms/internal/mlkit_code_scanner/zzp;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/mlkit_code_scanner/zzp;I)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Lcom/google/android/gms/internal/mlkit_code_scanner/zzp;->size()I

    move-result v0

    invoke-direct {p0, v0, p2}, Lcom/google/android/gms/internal/mlkit_code_scanner/zzh;-><init>(II)V

    iput-object p1, p0, Lcom/google/android/gms/internal/mlkit_code_scanner/zzn;->zza:Lcom/google/android/gms/internal/mlkit_code_scanner/zzp;

    return-void
.end method


# virtual methods
.method protected final zza(I)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_code_scanner/zzn;->zza:Lcom/google/android/gms/internal/mlkit_code_scanner/zzp;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/mlkit_code_scanner/zzp;->get(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
