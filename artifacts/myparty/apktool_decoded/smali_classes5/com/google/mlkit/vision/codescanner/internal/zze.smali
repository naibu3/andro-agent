.class public final Lcom/google/mlkit/vision/codescanner/internal/zze;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-code-scanner@@16.1.0"

# interfaces
.implements Lcom/google/mlkit/vision/codescanner/GmsBarcodeScanner;


# static fields
.field static final zza:Ljava/util/concurrent/atomic/AtomicReference;

.field public static final synthetic zzb:I

.field private static final zzc:Ljava/lang/Object;

.field private static zzd:Z


# instance fields
.field private final zze:Landroid/content/Context;

.field private final zzf:Lcom/google/mlkit/vision/codescanner/GmsBarcodeScannerOptions;

.field private final zzg:Lcom/google/android/gms/internal/mlkit_code_scanner/zzny;

.field private final zzh:Lcom/google/android/gms/internal/mlkit_code_scanner/zzoa;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    sput-object v0, Lcom/google/mlkit/vision/codescanner/internal/zze;->zza:Ljava/util/concurrent/atomic/AtomicReference;

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/google/mlkit/vision/codescanner/internal/zze;->zzc:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/google/mlkit/vision/codescanner/GmsBarcodeScannerOptions;)V
    .locals 2

    .line 1
    invoke-static {p1}, Lcom/google/android/gms/internal/mlkit_code_scanner/zzoa;->zza(Landroid/content/Context;)Lcom/google/android/gms/internal/mlkit_code_scanner/zzoa;

    move-result-object v0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v1, "play-services-code-scanner"

    .line 2
    invoke-static {v1}, Lcom/google/android/gms/internal/mlkit_code_scanner/zzoj;->zzb(Ljava/lang/String;)Lcom/google/android/gms/internal/mlkit_code_scanner/zzny;

    move-result-object v1

    iput-object v1, p0, Lcom/google/mlkit/vision/codescanner/internal/zze;->zzg:Lcom/google/android/gms/internal/mlkit_code_scanner/zzny;

    iput-object p1, p0, Lcom/google/mlkit/vision/codescanner/internal/zze;->zze:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/mlkit/vision/codescanner/internal/zze;->zzf:Lcom/google/mlkit/vision/codescanner/GmsBarcodeScannerOptions;

    iput-object v0, p0, Lcom/google/mlkit/vision/codescanner/internal/zze;->zzh:Lcom/google/android/gms/internal/mlkit_code_scanner/zzoa;

    return-void
.end method

.method static zzc(Lcom/google/mlkit/vision/barcode/common/Barcode;I)V
    .locals 2

    .line 1
    sget-object v0, Lcom/google/mlkit/vision/codescanner/internal/zze;->zza:Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/util/Pair;

    if-eqz v0, :cond_2

    if-eqz p0, :cond_0

    .line 2
    iget-object p1, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast p1, Lcom/google/android/gms/tasks/TaskCompletionSource;

    invoke-virtual {p1, p0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setResult(Ljava/lang/Object;)V

    return-void

    :cond_0
    const/16 p0, 0xc9

    if-ne p1, p0, :cond_1

    .line 3
    iget-object p0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast p0, Lcom/google/android/gms/tasks/CancellationTokenSource;

    invoke-virtual {p0}, Lcom/google/android/gms/tasks/CancellationTokenSource;->cancel()V

    return-void

    .line 4
    :cond_1
    iget-object p0, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast p0, Lcom/google/android/gms/tasks/TaskCompletionSource;

    new-instance v0, Lcom/google/mlkit/common/MlKitException;

    const-string v1, "Failed to scan code."

    invoke-direct {v0, v1, p1}, Lcom/google/mlkit/common/MlKitException;-><init>(Ljava/lang/String;I)V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setException(Ljava/lang/Exception;)V

    return-void

    :cond_2
    const-string p0, "GmsBarcodeScannerImpl"

    const-string p1, "Scanning task source doesn\'t exist when setting back result."

    .line 5
    invoke-static {p0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method


# virtual methods
.method public final getOptionalFeatures()[Lcom/google/android/gms/common/Feature;
    .locals 3

    const/4 v0, 0x1

    .line 1
    new-array v0, v0, [Lcom/google/android/gms/common/Feature;

    const/4 v1, 0x0

    sget-object v2, Lcom/google/mlkit/common/sdkinternal/OptionalModuleUtils;->FEATURE_MLKIT_BARCODE_UI:Lcom/google/android/gms/common/Feature;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public final startScan()Lcom/google/android/gms/tasks/Task;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/tasks/Task<",
            "Lcom/google/mlkit/vision/barcode/common/Barcode;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-static {}, Lcom/google/android/gms/common/GoogleApiAvailabilityLight;->getInstance()Lcom/google/android/gms/common/GoogleApiAvailabilityLight;

    move-result-object v0

    iget-object v1, p0, Lcom/google/mlkit/vision/codescanner/internal/zze;->zze:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/common/GoogleApiAvailabilityLight;->getApkVersion(Landroid/content/Context;)I

    move-result v0

    const v1, 0xd33d260

    if-ge v0, v1, :cond_0

    .line 5
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v4

    .line 6
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    const/16 v3, 0xcf

    move-object v2, p0

    .line 7
    invoke-virtual/range {v2 .. v7}, Lcom/google/mlkit/vision/codescanner/internal/zze;->zzb(IJJ)V

    .line 8
    new-instance v0, Lcom/google/mlkit/common/MlKitException;

    const-string v1, "Code scanner module is not supported on current Google Play Services version, please upgrade."

    invoke-direct {v0, v1, v3}, Lcom/google/mlkit/common/MlKitException;-><init>(Ljava/lang/String;I)V

    invoke-static {v0}, Lcom/google/android/gms/tasks/Tasks;->forException(Ljava/lang/Exception;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    return-object v0

    :cond_0
    move-object v2, p0

    iget-object v0, v2, Lcom/google/mlkit/vision/codescanner/internal/zze;->zze:Landroid/content/Context;

    .line 2
    invoke-static {v0}, Lcom/google/android/gms/common/moduleinstall/ModuleInstall;->getClient(Landroid/content/Context;)Lcom/google/android/gms/common/moduleinstall/ModuleInstallClient;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Lcom/google/android/gms/common/api/OptionalModuleApi;

    const/4 v3, 0x0

    sget-object v4, Lcom/google/mlkit/vision/codescanner/internal/zzc;->zza:Lcom/google/mlkit/vision/codescanner/internal/zzc;

    aput-object v4, v1, v3

    .line 3
    invoke-interface {v0, v1}, Lcom/google/android/gms/common/moduleinstall/ModuleInstallClient;->areModulesAvailable([Lcom/google/android/gms/common/api/OptionalModuleApi;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    new-instance v1, Lcom/google/mlkit/vision/codescanner/internal/zzd;

    invoke-direct {v1, p0}, Lcom/google/mlkit/vision/codescanner/internal/zzd;-><init>(Lcom/google/mlkit/vision/codescanner/internal/zze;)V

    .line 4
    invoke-virtual {v0, v1}, Lcom/google/android/gms/tasks/Task;->onSuccessTask(Lcom/google/android/gms/tasks/SuccessContinuation;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    return-object v0
.end method

.method final synthetic zza(Lcom/google/android/gms/common/moduleinstall/ModuleAvailabilityResponse;)Lcom/google/android/gms/tasks/Task;
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Lcom/google/android/gms/common/moduleinstall/ModuleAvailabilityResponse;->areModulesAvailable()Z

    move-result p1

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/google/mlkit/vision/codescanner/internal/zze;->zze:Landroid/content/Context;

    .line 2
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object p1

    new-instance v2, Landroid/content/Intent;

    .line 3
    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    const-string v3, "com.google.android.gms"

    .line 4
    invoke-virtual {v2, v3}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v2

    const-string v3, "com.google.android.gms.mlkit.ACTION_SCAN_BARCODE"

    .line 5
    invoke-virtual {v2, v3}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v2

    .line 6
    invoke-virtual {v2, p1}, Landroid/content/Intent;->resolveActivity(Landroid/content/pm/PackageManager;)Landroid/content/ComponentName;

    move-result-object p1

    if-eqz p1, :cond_0

    move v1, v0

    :cond_0
    sget-object p1, Lcom/google/mlkit/vision/codescanner/internal/zze;->zzc:Ljava/lang/Object;

    .line 7
    monitor-enter p1

    .line 8
    :try_start_0
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v4

    .line 9
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-nez v1, :cond_2

    :try_start_1
    sget-boolean v1, Lcom/google/mlkit/vision/codescanner/internal/zze;->zzd:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-nez v1, :cond_1

    :try_start_2
    iget-object v1, p0, Lcom/google/mlkit/vision/codescanner/internal/zze;->zze:Landroid/content/Context;

    const-string v2, "barcode_ui"

    .line 10
    invoke-static {v1, v2}, Lcom/google/mlkit/common/sdkinternal/OptionalModuleUtils;->requestDownload(Landroid/content/Context;Ljava/lang/String;)V

    sput-boolean v0, Lcom/google/mlkit/vision/codescanner/internal/zze;->zzd:Z

    :cond_1
    const/16 v3, 0xc8

    move-object v2, p0

    .line 11
    invoke-virtual/range {v2 .. v7}, Lcom/google/mlkit/vision/codescanner/internal/zze;->zzb(IJJ)V

    .line 12
    new-instance v0, Lcom/google/mlkit/common/MlKitException;

    const-string v1, "Waiting for the Barcode UI module to be downloaded."

    const/16 v3, 0xc8

    invoke-direct {v0, v1, v3}, Lcom/google/mlkit/common/MlKitException;-><init>(Ljava/lang/String;I)V

    invoke-static {v0}, Lcom/google/android/gms/tasks/Tasks;->forException(Ljava/lang/Exception;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    monitor-exit p1

    return-object v0

    :catchall_0
    move-exception v0

    move-object v2, p0

    goto :goto_0

    :cond_2
    move-object v2, p0

    sget-object v0, Lcom/google/mlkit/vision/codescanner/internal/zze;->zza:Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v1, 0x0

    .line 13
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/util/Pair;

    if-eqz v1, :cond_3

    .line 14
    iget-object v1, v1, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v1, Lcom/google/android/gms/tasks/CancellationTokenSource;

    invoke-virtual {v1}, Lcom/google/android/gms/tasks/CancellationTokenSource;->cancel()V

    .line 15
    :cond_3
    new-instance v1, Lcom/google/android/gms/tasks/CancellationTokenSource;

    invoke-direct {v1}, Lcom/google/android/gms/tasks/CancellationTokenSource;-><init>()V

    .line 16
    new-instance v3, Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 17
    invoke-virtual {v1}, Lcom/google/android/gms/tasks/CancellationTokenSource;->getToken()Lcom/google/android/gms/tasks/CancellationToken;

    move-result-object v8

    invoke-direct {v3, v8}, Lcom/google/android/gms/tasks/TaskCompletionSource;-><init>(Lcom/google/android/gms/tasks/CancellationToken;)V

    new-instance v8, Landroid/util/Pair;

    .line 18
    invoke-direct {v8, v3, v1}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v0, v8}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    new-instance v0, Landroid/content/Intent;

    iget-object v1, v2, Lcom/google/mlkit/vision/codescanner/internal/zze;->zze:Landroid/content/Context;

    const-class v8, Lcom/google/mlkit/vision/codescanner/internal/GmsBarcodeScanningDelegateActivity;

    .line 19
    invoke-direct {v0, v1, v8}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v1, "extra_supported_formats"

    iget-object v8, v2, Lcom/google/mlkit/vision/codescanner/internal/zze;->zzf:Lcom/google/mlkit/vision/codescanner/GmsBarcodeScannerOptions;

    .line 20
    invoke-virtual {v8}, Lcom/google/mlkit/vision/codescanner/GmsBarcodeScannerOptions;->zza()I

    move-result v8

    invoke-virtual {v0, v1, v8}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    const-string v1, "extra_allow_manual_input"

    iget-object v8, v2, Lcom/google/mlkit/vision/codescanner/internal/zze;->zzf:Lcom/google/mlkit/vision/codescanner/GmsBarcodeScannerOptions;

    .line 21
    invoke-virtual {v8}, Lcom/google/mlkit/vision/codescanner/GmsBarcodeScannerOptions;->zzc()Z

    move-result v8

    invoke-virtual {v0, v1, v8}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    const-string v1, "extra_enable_auto_zoom"

    iget-object v8, v2, Lcom/google/mlkit/vision/codescanner/internal/zze;->zzf:Lcom/google/mlkit/vision/codescanner/GmsBarcodeScannerOptions;

    .line 22
    invoke-virtual {v8}, Lcom/google/mlkit/vision/codescanner/GmsBarcodeScannerOptions;->zzb()Z

    move-result v8

    invoke-virtual {v0, v1, v8}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    const/high16 v1, 0x10000000

    .line 23
    invoke-virtual {v0, v1}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    iget-object v1, v2, Lcom/google/mlkit/vision/codescanner/internal/zze;->zze:Landroid/content/Context;

    .line 24
    invoke-virtual {v1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 25
    invoke-virtual {v3}, Lcom/google/android/gms/tasks/TaskCompletionSource;->getTask()Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    new-instance v2, Lcom/google/mlkit/vision/codescanner/internal/zzb;

    move-object v3, p0

    invoke-direct/range {v2 .. v7}, Lcom/google/mlkit/vision/codescanner/internal/zzb;-><init>(Lcom/google/mlkit/vision/codescanner/internal/zze;JJ)V

    .line 26
    invoke-virtual {v0, v2}, Lcom/google/android/gms/tasks/Task;->addOnCompleteListener(Lcom/google/android/gms/tasks/OnCompleteListener;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    monitor-exit p1

    return-object v0

    :catchall_1
    move-exception v0

    .line 27
    :goto_0
    monitor-exit p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw v0
.end method

.method final zzb(IJJ)V
    .locals 9

    .line 1
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    .line 2
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v7

    iget-object v2, p0, Lcom/google/mlkit/vision/codescanner/internal/zze;->zzg:Lcom/google/android/gms/internal/mlkit_code_scanner/zzny;

    new-instance v3, Lcom/google/android/gms/internal/mlkit_code_scanner/zzkc;

    invoke-direct {v3}, Lcom/google/android/gms/internal/mlkit_code_scanner/zzkc;-><init>()V

    new-instance v4, Lcom/google/android/gms/internal/mlkit_code_scanner/zziv;

    invoke-direct {v4}, Lcom/google/android/gms/internal/mlkit_code_scanner/zziv;-><init>()V

    iget-object v5, p0, Lcom/google/mlkit/vision/codescanner/internal/zze;->zzf:Lcom/google/mlkit/vision/codescanner/GmsBarcodeScannerOptions;

    .line 3
    invoke-virtual {v5}, Lcom/google/mlkit/vision/codescanner/GmsBarcodeScannerOptions;->zza()I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v4, v5}, Lcom/google/android/gms/internal/mlkit_code_scanner/zziv;->zzd(Ljava/lang/Integer;)Lcom/google/android/gms/internal/mlkit_code_scanner/zziv;

    iget-object v5, p0, Lcom/google/mlkit/vision/codescanner/internal/zze;->zzf:Lcom/google/mlkit/vision/codescanner/GmsBarcodeScannerOptions;

    .line 4
    invoke-virtual {v5}, Lcom/google/mlkit/vision/codescanner/GmsBarcodeScannerOptions;->zzc()Z

    move-result v5

    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v5

    invoke-virtual {v4, v5}, Lcom/google/android/gms/internal/mlkit_code_scanner/zziv;->zza(Ljava/lang/Boolean;)Lcom/google/android/gms/internal/mlkit_code_scanner/zziv;

    sub-long/2addr v0, p2

    .line 5
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    invoke-virtual {v4, p2}, Lcom/google/android/gms/internal/mlkit_code_scanner/zziv;->zzb(Ljava/lang/Long;)Lcom/google/android/gms/internal/mlkit_code_scanner/zziv;

    if-eqz p1, :cond_1

    const/16 p2, 0xcf

    if-eq p1, p2, :cond_0

    packed-switch p1, :pswitch_data_0

    .line 14
    sget-object p2, Lcom/google/android/gms/internal/mlkit_code_scanner/zzka;->zzX:Lcom/google/android/gms/internal/mlkit_code_scanner/zzka;

    goto :goto_0

    .line 7
    :pswitch_0
    sget-object p2, Lcom/google/android/gms/internal/mlkit_code_scanner/zzka;->zzS:Lcom/google/android/gms/internal/mlkit_code_scanner/zzka;

    goto :goto_0

    .line 8
    :pswitch_1
    sget-object p2, Lcom/google/android/gms/internal/mlkit_code_scanner/zzka;->zzR:Lcom/google/android/gms/internal/mlkit_code_scanner/zzka;

    goto :goto_0

    .line 9
    :pswitch_2
    sget-object p2, Lcom/google/android/gms/internal/mlkit_code_scanner/zzka;->zzQ:Lcom/google/android/gms/internal/mlkit_code_scanner/zzka;

    goto :goto_0

    .line 10
    :pswitch_3
    sget-object p2, Lcom/google/android/gms/internal/mlkit_code_scanner/zzka;->zzP:Lcom/google/android/gms/internal/mlkit_code_scanner/zzka;

    goto :goto_0

    .line 11
    :pswitch_4
    sget-object p2, Lcom/google/android/gms/internal/mlkit_code_scanner/zzka;->zzO:Lcom/google/android/gms/internal/mlkit_code_scanner/zzka;

    goto :goto_0

    .line 12
    :pswitch_5
    sget-object p2, Lcom/google/android/gms/internal/mlkit_code_scanner/zzka;->zzN:Lcom/google/android/gms/internal/mlkit_code_scanner/zzka;

    goto :goto_0

    .line 6
    :cond_0
    sget-object p2, Lcom/google/android/gms/internal/mlkit_code_scanner/zzka;->zzU:Lcom/google/android/gms/internal/mlkit_code_scanner/zzka;

    goto :goto_0

    .line 13
    :cond_1
    sget-object p2, Lcom/google/android/gms/internal/mlkit_code_scanner/zzka;->zza:Lcom/google/android/gms/internal/mlkit_code_scanner/zzka;

    .line 15
    :goto_0
    invoke-virtual {v4, p2}, Lcom/google/android/gms/internal/mlkit_code_scanner/zziv;->zzc(Lcom/google/android/gms/internal/mlkit_code_scanner/zzka;)Lcom/google/android/gms/internal/mlkit_code_scanner/zziv;

    invoke-virtual {v4}, Lcom/google/android/gms/internal/mlkit_code_scanner/zziv;->zze()Lcom/google/android/gms/internal/mlkit_code_scanner/zzix;

    move-result-object p2

    .line 16
    invoke-virtual {v3, p2}, Lcom/google/android/gms/internal/mlkit_code_scanner/zzkc;->zzc(Lcom/google/android/gms/internal/mlkit_code_scanner/zzix;)Lcom/google/android/gms/internal/mlkit_code_scanner/zzkc;

    .line 17
    invoke-static {v3}, Lcom/google/android/gms/internal/mlkit_code_scanner/zzob;->zze(Lcom/google/android/gms/internal/mlkit_code_scanner/zzkc;)Lcom/google/android/gms/internal/mlkit_code_scanner/zznq;

    move-result-object p2

    sget-object p3, Lcom/google/android/gms/internal/mlkit_code_scanner/zzkb;->zzcr:Lcom/google/android/gms/internal/mlkit_code_scanner/zzkb;

    .line 18
    invoke-virtual {v2, p2, p3}, Lcom/google/android/gms/internal/mlkit_code_scanner/zzny;->zzc(Lcom/google/android/gms/internal/mlkit_code_scanner/zznq;Lcom/google/android/gms/internal/mlkit_code_scanner/zzkb;)V

    iget-object v2, p0, Lcom/google/mlkit/vision/codescanner/internal/zze;->zzh:Lcom/google/android/gms/internal/mlkit_code_scanner/zzoa;

    const/16 v3, 0x5f03

    move v4, p1

    move-wide v5, p4

    .line 19
    invoke-virtual/range {v2 .. v8}, Lcom/google/android/gms/internal/mlkit_code_scanner/zzoa;->zzc(IIJJ)V

    return-void

    :pswitch_data_0
    .packed-switch 0xc8
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
