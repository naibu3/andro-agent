.class public final synthetic Lcom/google/android/gms/internal/mlkit_code_scanner/zznx;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-code-scanner@@16.1.0"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic zza:Lcom/google/android/gms/internal/mlkit_code_scanner/zzny;

.field public final synthetic zzb:Lcom/google/android/gms/internal/mlkit_code_scanner/zznq;

.field public final synthetic zzc:Lcom/google/android/gms/internal/mlkit_code_scanner/zzkb;

.field public final synthetic zzd:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/mlkit_code_scanner/zzny;Lcom/google/android/gms/internal/mlkit_code_scanner/zznq;Lcom/google/android/gms/internal/mlkit_code_scanner/zzkb;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/mlkit_code_scanner/zznx;->zza:Lcom/google/android/gms/internal/mlkit_code_scanner/zzny;

    iput-object p2, p0, Lcom/google/android/gms/internal/mlkit_code_scanner/zznx;->zzb:Lcom/google/android/gms/internal/mlkit_code_scanner/zznq;

    iput-object p3, p0, Lcom/google/android/gms/internal/mlkit_code_scanner/zznx;->zzc:Lcom/google/android/gms/internal/mlkit_code_scanner/zzkb;

    iput-object p4, p0, Lcom/google/android/gms/internal/mlkit_code_scanner/zznx;->zzd:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_code_scanner/zznx;->zza:Lcom/google/android/gms/internal/mlkit_code_scanner/zzny;

    iget-object v1, p0, Lcom/google/android/gms/internal/mlkit_code_scanner/zznx;->zzb:Lcom/google/android/gms/internal/mlkit_code_scanner/zznq;

    iget-object v2, p0, Lcom/google/android/gms/internal/mlkit_code_scanner/zznx;->zzc:Lcom/google/android/gms/internal/mlkit_code_scanner/zzkb;

    iget-object v3, p0, Lcom/google/android/gms/internal/mlkit_code_scanner/zznx;->zzd:Ljava/lang/String;

    invoke-virtual {v0, v1, v2, v3}, Lcom/google/android/gms/internal/mlkit_code_scanner/zzny;->zzb(Lcom/google/android/gms/internal/mlkit_code_scanner/zznq;Lcom/google/android/gms/internal/mlkit_code_scanner/zzkb;Ljava/lang/String;)V

    return-void
.end method
