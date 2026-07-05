.class public final Lcom/google/android/gms/internal/mlkit_code_scanner/zzok;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-code-scanner@@16.1.0"


# static fields
.field private static zza:Lcom/google/android/gms/internal/mlkit_code_scanner/zzok;


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static declared-synchronized zza()Lcom/google/android/gms/internal/mlkit_code_scanner/zzok;
    .locals 2

    const-class v0, Lcom/google/android/gms/internal/mlkit_code_scanner/zzok;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/google/android/gms/internal/mlkit_code_scanner/zzok;->zza:Lcom/google/android/gms/internal/mlkit_code_scanner/zzok;

    if-nez v1, :cond_0

    new-instance v1, Lcom/google/android/gms/internal/mlkit_code_scanner/zzok;

    invoke-direct {v1}, Lcom/google/android/gms/internal/mlkit_code_scanner/zzok;-><init>()V

    sput-object v1, Lcom/google/android/gms/internal/mlkit_code_scanner/zzok;->zza:Lcom/google/android/gms/internal/mlkit_code_scanner/zzok;

    :cond_0
    sget-object v1, Lcom/google/android/gms/internal/mlkit_code_scanner/zzok;->zza:Lcom/google/android/gms/internal/mlkit_code_scanner/zzok;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method
