.class public abstract Lcom/google/android/gms/internal/mlkit_code_scanner/zznt;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-code-scanner@@16.1.0"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static zzd(Ljava/lang/String;)Lcom/google/android/gms/internal/mlkit_code_scanner/zzns;
    .locals 1

    .line 1
    new-instance p0, Lcom/google/android/gms/internal/mlkit_code_scanner/zznn;

    invoke-direct {p0}, Lcom/google/android/gms/internal/mlkit_code_scanner/zznn;-><init>()V

    const-string v0, "play-services-code-scanner"

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/mlkit_code_scanner/zznn;->zzc(Ljava/lang/String;)Lcom/google/android/gms/internal/mlkit_code_scanner/zzns;

    const/4 v0, 0x1

    .line 2
    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/mlkit_code_scanner/zzns;->zza(Z)Lcom/google/android/gms/internal/mlkit_code_scanner/zzns;

    .line 3
    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/mlkit_code_scanner/zzns;->zzb(I)Lcom/google/android/gms/internal/mlkit_code_scanner/zzns;

    return-object p0
.end method


# virtual methods
.method public abstract zza()I
.end method

.method public abstract zzb()Ljava/lang/String;
.end method

.method public abstract zzc()Z
.end method
