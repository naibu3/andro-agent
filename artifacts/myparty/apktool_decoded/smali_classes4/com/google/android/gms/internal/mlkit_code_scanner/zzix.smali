.class public final Lcom/google/android/gms/internal/mlkit_code_scanner/zzix;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-code-scanner@@16.1.0"


# instance fields
.field private final zza:Ljava/lang/Integer;

.field private final zzb:Ljava/lang/Long;

.field private final zzc:Lcom/google/android/gms/internal/mlkit_code_scanner/zzka;

.field private final zzd:Ljava/lang/Boolean;


# direct methods
.method synthetic constructor <init>(Lcom/google/android/gms/internal/mlkit_code_scanner/zziv;Lcom/google/android/gms/internal/mlkit_code_scanner/zziw;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/google/android/gms/internal/mlkit_code_scanner/zziv;->zzh(Lcom/google/android/gms/internal/mlkit_code_scanner/zziv;)Ljava/lang/Integer;

    move-result-object p2

    iput-object p2, p0, Lcom/google/android/gms/internal/mlkit_code_scanner/zzix;->zza:Ljava/lang/Integer;

    invoke-static {p1}, Lcom/google/android/gms/internal/mlkit_code_scanner/zziv;->zzi(Lcom/google/android/gms/internal/mlkit_code_scanner/zziv;)Ljava/lang/Long;

    move-result-object p2

    iput-object p2, p0, Lcom/google/android/gms/internal/mlkit_code_scanner/zzix;->zzb:Ljava/lang/Long;

    invoke-static {p1}, Lcom/google/android/gms/internal/mlkit_code_scanner/zziv;->zzf(Lcom/google/android/gms/internal/mlkit_code_scanner/zziv;)Lcom/google/android/gms/internal/mlkit_code_scanner/zzka;

    move-result-object p2

    iput-object p2, p0, Lcom/google/android/gms/internal/mlkit_code_scanner/zzix;->zzc:Lcom/google/android/gms/internal/mlkit_code_scanner/zzka;

    invoke-static {p1}, Lcom/google/android/gms/internal/mlkit_code_scanner/zziv;->zzg(Lcom/google/android/gms/internal/mlkit_code_scanner/zziv;)Ljava/lang/Boolean;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/mlkit_code_scanner/zzix;->zzd:Ljava/lang/Boolean;

    return-void
.end method


# virtual methods
.method public final zza()Lcom/google/android/gms/internal/mlkit_code_scanner/zzka;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_code_scanner/zzix;->zzc:Lcom/google/android/gms/internal/mlkit_code_scanner/zzka;

    return-object v0
.end method

.method public final zzb()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_code_scanner/zzix;->zzd:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final zzc()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_code_scanner/zzix;->zza:Ljava/lang/Integer;

    return-object v0
.end method

.method public final zzd()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_code_scanner/zzix;->zzb:Ljava/lang/Long;

    return-object v0
.end method
