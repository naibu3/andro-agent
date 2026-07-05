.class public final Lcom/google/android/gms/internal/mlkit_code_scanner/zzke;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-code-scanner@@16.1.0"


# annotations
.annotation runtime Lcom/google/firebase/encoders/annotations/Encodable;
.end annotation


# instance fields
.field private final zza:Lcom/google/android/gms/internal/mlkit_code_scanner/zzms;

.field private final zzb:Lcom/google/android/gms/internal/mlkit_code_scanner/zzkb;

.field private final zzc:Lcom/google/android/gms/internal/mlkit_code_scanner/zzix;


# direct methods
.method synthetic constructor <init>(Lcom/google/android/gms/internal/mlkit_code_scanner/zzkc;Lcom/google/android/gms/internal/mlkit_code_scanner/zzkd;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/google/android/gms/internal/mlkit_code_scanner/zzkc;->zzg(Lcom/google/android/gms/internal/mlkit_code_scanner/zzkc;)Lcom/google/android/gms/internal/mlkit_code_scanner/zzms;

    move-result-object p2

    iput-object p2, p0, Lcom/google/android/gms/internal/mlkit_code_scanner/zzke;->zza:Lcom/google/android/gms/internal/mlkit_code_scanner/zzms;

    invoke-static {p1}, Lcom/google/android/gms/internal/mlkit_code_scanner/zzkc;->zzb(Lcom/google/android/gms/internal/mlkit_code_scanner/zzkc;)Lcom/google/android/gms/internal/mlkit_code_scanner/zzkb;

    move-result-object p2

    iput-object p2, p0, Lcom/google/android/gms/internal/mlkit_code_scanner/zzke;->zzb:Lcom/google/android/gms/internal/mlkit_code_scanner/zzkb;

    invoke-static {p1}, Lcom/google/android/gms/internal/mlkit_code_scanner/zzkc;->zza(Lcom/google/android/gms/internal/mlkit_code_scanner/zzkc;)Lcom/google/android/gms/internal/mlkit_code_scanner/zzix;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/mlkit_code_scanner/zzke;->zzc:Lcom/google/android/gms/internal/mlkit_code_scanner/zzix;

    return-void
.end method


# virtual methods
.method public final zza()Lcom/google/android/gms/internal/mlkit_code_scanner/zzix;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_code_scanner/zzke;->zzc:Lcom/google/android/gms/internal/mlkit_code_scanner/zzix;

    return-object v0
.end method

.method public final zzb()Lcom/google/android/gms/internal/mlkit_code_scanner/zzkb;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_code_scanner/zzke;->zzb:Lcom/google/android/gms/internal/mlkit_code_scanner/zzkb;

    return-object v0
.end method

.method public final zzc()Lcom/google/android/gms/internal/mlkit_code_scanner/zzms;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_code_scanner/zzke;->zza:Lcom/google/android/gms/internal/mlkit_code_scanner/zzms;

    return-object v0
.end method
