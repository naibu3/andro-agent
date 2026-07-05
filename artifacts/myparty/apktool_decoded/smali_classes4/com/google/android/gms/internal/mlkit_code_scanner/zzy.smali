.class final Lcom/google/android/gms/internal/mlkit_code_scanner/zzy;
.super Lcom/google/android/gms/internal/mlkit_code_scanner/zzr;
.source "com.google.android.gms:play-services-code-scanner@@16.1.0"


# static fields
.field static final zza:Lcom/google/android/gms/internal/mlkit_code_scanner/zzr;


# instance fields
.field final transient zzb:[Ljava/lang/Object;

.field private final transient zzc:I


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/google/android/gms/internal/mlkit_code_scanner/zzy;

    const/4 v1, 0x0

    new-array v2, v1, [Ljava/lang/Object;

    const/4 v3, 0x0

    invoke-direct {v0, v3, v2, v1}, Lcom/google/android/gms/internal/mlkit_code_scanner/zzy;-><init>(Ljava/lang/Object;[Ljava/lang/Object;I)V

    sput-object v0, Lcom/google/android/gms/internal/mlkit_code_scanner/zzy;->zza:Lcom/google/android/gms/internal/mlkit_code_scanner/zzr;

    return-void
.end method

.method private constructor <init>(Ljava/lang/Object;[Ljava/lang/Object;I)V
    .locals 0
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/CheckForNull;
        .end annotation
    .end param

    invoke-direct {p0}, Lcom/google/android/gms/internal/mlkit_code_scanner/zzr;-><init>()V

    iput-object p2, p0, Lcom/google/android/gms/internal/mlkit_code_scanner/zzy;->zzb:[Ljava/lang/Object;

    iput p3, p0, Lcom/google/android/gms/internal/mlkit_code_scanner/zzy;->zzc:I

    return-void
.end method

.method static zzg(I[Ljava/lang/Object;Lcom/google/android/gms/internal/mlkit_code_scanner/zzq;)Lcom/google/android/gms/internal/mlkit_code_scanner/zzy;
    .locals 1

    const/4 p0, 0x0

    aget-object p0, p1, p0

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p2, 0x1

    aget-object v0, p1, p2

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    invoke-static {p0, v0}, Lcom/google/android/gms/internal/mlkit_code_scanner/zzi;->zza(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance p0, Lcom/google/android/gms/internal/mlkit_code_scanner/zzy;

    const/4 v0, 0x0

    invoke-direct {p0, v0, p1, p2}, Lcom/google/android/gms/internal/mlkit_code_scanner/zzy;-><init>(Ljava/lang/Object;[Ljava/lang/Object;I)V

    return-object p0
.end method


# virtual methods
.method public final get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/CheckForNull;
        .end annotation
    .end param
    .annotation runtime Ljavax/annotation/CheckForNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_code_scanner/zzy;->zzb:[Ljava/lang/Object;

    iget v1, p0, Lcom/google/android/gms/internal/mlkit_code_scanner/zzy;->zzc:I

    const/4 v2, 0x0

    if-nez p1, :cond_1

    :cond_0
    move-object p1, v2

    goto :goto_0

    :cond_1
    const/4 v3, 0x1

    if-ne v1, v3, :cond_0

    const/4 v1, 0x0

    aget-object v1, v0, v1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v1, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 2
    aget-object p1, v0, v3

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :goto_0
    if-nez p1, :cond_2

    return-object v2

    :cond_2
    return-object p1
.end method

.method public final size()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/mlkit_code_scanner/zzy;->zzc:I

    return v0
.end method

.method final zza()Lcom/google/android/gms/internal/mlkit_code_scanner/zzl;
    .locals 4

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/mlkit_code_scanner/zzx;

    iget-object v1, p0, Lcom/google/android/gms/internal/mlkit_code_scanner/zzy;->zzb:[Ljava/lang/Object;

    const/4 v2, 0x1

    iget v3, p0, Lcom/google/android/gms/internal/mlkit_code_scanner/zzy;->zzc:I

    invoke-direct {v0, v1, v2, v3}, Lcom/google/android/gms/internal/mlkit_code_scanner/zzx;-><init>([Ljava/lang/Object;II)V

    return-object v0
.end method

.method final zzd()Lcom/google/android/gms/internal/mlkit_code_scanner/zzs;
    .locals 4

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/mlkit_code_scanner/zzv;

    iget-object v1, p0, Lcom/google/android/gms/internal/mlkit_code_scanner/zzy;->zzb:[Ljava/lang/Object;

    const/4 v2, 0x0

    iget v3, p0, Lcom/google/android/gms/internal/mlkit_code_scanner/zzy;->zzc:I

    invoke-direct {v0, p0, v1, v2, v3}, Lcom/google/android/gms/internal/mlkit_code_scanner/zzv;-><init>(Lcom/google/android/gms/internal/mlkit_code_scanner/zzr;[Ljava/lang/Object;II)V

    return-object v0
.end method

.method final zze()Lcom/google/android/gms/internal/mlkit_code_scanner/zzs;
    .locals 4

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/mlkit_code_scanner/zzx;

    iget-object v1, p0, Lcom/google/android/gms/internal/mlkit_code_scanner/zzy;->zzb:[Ljava/lang/Object;

    const/4 v2, 0x0

    iget v3, p0, Lcom/google/android/gms/internal/mlkit_code_scanner/zzy;->zzc:I

    invoke-direct {v0, v1, v2, v3}, Lcom/google/android/gms/internal/mlkit_code_scanner/zzx;-><init>([Ljava/lang/Object;II)V

    new-instance v1, Lcom/google/android/gms/internal/mlkit_code_scanner/zzw;

    .line 2
    invoke-direct {v1, p0, v0}, Lcom/google/android/gms/internal/mlkit_code_scanner/zzw;-><init>(Lcom/google/android/gms/internal/mlkit_code_scanner/zzr;Lcom/google/android/gms/internal/mlkit_code_scanner/zzp;)V

    return-object v1
.end method
