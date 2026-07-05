.class public final Lcom/google/android/gms/internal/mlkit_code_scanner/zziv;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-code-scanner@@16.1.0"


# instance fields
.field private zza:Ljava/lang/Integer;

.field private zzb:Ljava/lang/Long;

.field private zzc:Lcom/google/android/gms/internal/mlkit_code_scanner/zzka;

.field private zzd:Ljava/lang/Boolean;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static bridge synthetic zzf(Lcom/google/android/gms/internal/mlkit_code_scanner/zziv;)Lcom/google/android/gms/internal/mlkit_code_scanner/zzka;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/mlkit_code_scanner/zziv;->zzc:Lcom/google/android/gms/internal/mlkit_code_scanner/zzka;

    return-object p0
.end method

.method static bridge synthetic zzg(Lcom/google/android/gms/internal/mlkit_code_scanner/zziv;)Ljava/lang/Boolean;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/mlkit_code_scanner/zziv;->zzd:Ljava/lang/Boolean;

    return-object p0
.end method

.method static bridge synthetic zzh(Lcom/google/android/gms/internal/mlkit_code_scanner/zziv;)Ljava/lang/Integer;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/mlkit_code_scanner/zziv;->zza:Ljava/lang/Integer;

    return-object p0
.end method

.method static bridge synthetic zzi(Lcom/google/android/gms/internal/mlkit_code_scanner/zziv;)Ljava/lang/Long;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/mlkit_code_scanner/zziv;->zzb:Ljava/lang/Long;

    return-object p0
.end method


# virtual methods
.method public final zza(Ljava/lang/Boolean;)Lcom/google/android/gms/internal/mlkit_code_scanner/zziv;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/mlkit_code_scanner/zziv;->zzd:Ljava/lang/Boolean;

    return-object p0
.end method

.method public final zzb(Ljava/lang/Long;)Lcom/google/android/gms/internal/mlkit_code_scanner/zziv;
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    const-wide v2, 0x7fffffffffffffffL

    and-long/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/mlkit_code_scanner/zziv;->zzb:Ljava/lang/Long;

    return-object p0
.end method

.method public final zzc(Lcom/google/android/gms/internal/mlkit_code_scanner/zzka;)Lcom/google/android/gms/internal/mlkit_code_scanner/zziv;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/mlkit_code_scanner/zziv;->zzc:Lcom/google/android/gms/internal/mlkit_code_scanner/zzka;

    return-object p0
.end method

.method public final zzd(Ljava/lang/Integer;)Lcom/google/android/gms/internal/mlkit_code_scanner/zziv;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    const v0, 0x7fffffff

    and-int/2addr p1, v0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/mlkit_code_scanner/zziv;->zza:Ljava/lang/Integer;

    return-object p0
.end method

.method public final zze()Lcom/google/android/gms/internal/mlkit_code_scanner/zzix;
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/mlkit_code_scanner/zzix;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/google/android/gms/internal/mlkit_code_scanner/zzix;-><init>(Lcom/google/android/gms/internal/mlkit_code_scanner/zziv;Lcom/google/android/gms/internal/mlkit_code_scanner/zziw;)V

    return-object v0
.end method
