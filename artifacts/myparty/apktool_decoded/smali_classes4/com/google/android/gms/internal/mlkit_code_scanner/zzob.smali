.class public final Lcom/google/android/gms/internal/mlkit_code_scanner/zzob;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-code-scanner@@16.1.0"

# interfaces
.implements Lcom/google/android/gms/internal/mlkit_code_scanner/zznq;


# instance fields
.field private final zza:Lcom/google/android/gms/internal/mlkit_code_scanner/zzkc;

.field private zzb:Lcom/google/android/gms/internal/mlkit_code_scanner/zzmq;


# direct methods
.method private constructor <init>(Lcom/google/android/gms/internal/mlkit_code_scanner/zzkc;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p2, Lcom/google/android/gms/internal/mlkit_code_scanner/zzmq;

    invoke-direct {p2}, Lcom/google/android/gms/internal/mlkit_code_scanner/zzmq;-><init>()V

    iput-object p2, p0, Lcom/google/android/gms/internal/mlkit_code_scanner/zzob;->zzb:Lcom/google/android/gms/internal/mlkit_code_scanner/zzmq;

    iput-object p1, p0, Lcom/google/android/gms/internal/mlkit_code_scanner/zzob;->zza:Lcom/google/android/gms/internal/mlkit_code_scanner/zzkc;

    invoke-static {}, Lcom/google/android/gms/internal/mlkit_code_scanner/zzok;->zza()Lcom/google/android/gms/internal/mlkit_code_scanner/zzok;

    return-void
.end method

.method public static zze(Lcom/google/android/gms/internal/mlkit_code_scanner/zzkc;)Lcom/google/android/gms/internal/mlkit_code_scanner/zznq;
    .locals 2

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/mlkit_code_scanner/zzob;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/google/android/gms/internal/mlkit_code_scanner/zzob;-><init>(Lcom/google/android/gms/internal/mlkit_code_scanner/zzkc;I)V

    return-object v0
.end method


# virtual methods
.method public final zza(Lcom/google/android/gms/internal/mlkit_code_scanner/zzkb;)Lcom/google/android/gms/internal/mlkit_code_scanner/zznq;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_code_scanner/zzob;->zza:Lcom/google/android/gms/internal/mlkit_code_scanner/zzkc;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/mlkit_code_scanner/zzkc;->zzd(Lcom/google/android/gms/internal/mlkit_code_scanner/zzkb;)Lcom/google/android/gms/internal/mlkit_code_scanner/zzkc;

    return-object p0
.end method

.method public final zzb(Lcom/google/android/gms/internal/mlkit_code_scanner/zzmq;)Lcom/google/android/gms/internal/mlkit_code_scanner/zznq;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/mlkit_code_scanner/zzob;->zzb:Lcom/google/android/gms/internal/mlkit_code_scanner/zzmq;

    return-object p0
.end method

.method public final zzc()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_code_scanner/zzob;->zza:Lcom/google/android/gms/internal/mlkit_code_scanner/zzkc;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_code_scanner/zzkc;->zzf()Lcom/google/android/gms/internal/mlkit_code_scanner/zzke;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_code_scanner/zzke;->zzc()Lcom/google/android/gms/internal/mlkit_code_scanner/zzms;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_code_scanner/zzms;->zzk()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/google/android/gms/internal/mlkit_code_scanner/zzg;->zzb(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_code_scanner/zzms;->zzk()Ljava/lang/String;

    move-result-object v0

    .line 2
    invoke-static {v0}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0

    :cond_0
    const-string v0, "NA"

    return-object v0
.end method

.method public final zzd(IZ)[B
    .locals 3

    xor-int/lit8 p2, p1, 0x1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_code_scanner/zzob;->zzb:Lcom/google/android/gms/internal/mlkit_code_scanner/zzmq;

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eq v2, p2, :cond_0

    move p2, v1

    goto :goto_0

    :cond_0
    move p2, v2

    :goto_0
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/mlkit_code_scanner/zzmq;->zzf(Ljava/lang/Boolean;)Lcom/google/android/gms/internal/mlkit_code_scanner/zzmq;

    iget-object p2, p0, Lcom/google/android/gms/internal/mlkit_code_scanner/zzob;->zzb:Lcom/google/android/gms/internal/mlkit_code_scanner/zzmq;

    .line 2
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/google/android/gms/internal/mlkit_code_scanner/zzmq;->zze(Ljava/lang/Boolean;)Lcom/google/android/gms/internal/mlkit_code_scanner/zzmq;

    iget-object p2, p0, Lcom/google/android/gms/internal/mlkit_code_scanner/zzob;->zza:Lcom/google/android/gms/internal/mlkit_code_scanner/zzkc;

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_code_scanner/zzob;->zzb:Lcom/google/android/gms/internal/mlkit_code_scanner/zzmq;

    .line 3
    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_code_scanner/zzmq;->zzm()Lcom/google/android/gms/internal/mlkit_code_scanner/zzms;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/google/android/gms/internal/mlkit_code_scanner/zzkc;->zze(Lcom/google/android/gms/internal/mlkit_code_scanner/zzms;)Lcom/google/android/gms/internal/mlkit_code_scanner/zzkc;

    .line 4
    :try_start_0
    invoke-static {}, Lcom/google/android/gms/internal/mlkit_code_scanner/zzok;->zza()Lcom/google/android/gms/internal/mlkit_code_scanner/zzok;

    if-nez p1, :cond_1

    iget-object p1, p0, Lcom/google/android/gms/internal/mlkit_code_scanner/zzob;->zza:Lcom/google/android/gms/internal/mlkit_code_scanner/zzkc;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/mlkit_code_scanner/zzkc;->zzf()Lcom/google/android/gms/internal/mlkit_code_scanner/zzke;

    move-result-object p1

    .line 5
    new-instance p2, Lcom/google/firebase/encoders/json/JsonDataEncoderBuilder;

    invoke-direct {p2}, Lcom/google/firebase/encoders/json/JsonDataEncoderBuilder;-><init>()V

    sget-object v0, Lcom/google/android/gms/internal/mlkit_code_scanner/zzig;->zza:Lcom/google/firebase/encoders/config/Configurator;

    invoke-virtual {p2, v0}, Lcom/google/firebase/encoders/json/JsonDataEncoderBuilder;->configureWith(Lcom/google/firebase/encoders/config/Configurator;)Lcom/google/firebase/encoders/json/JsonDataEncoderBuilder;

    move-result-object p2

    invoke-virtual {p2, v2}, Lcom/google/firebase/encoders/json/JsonDataEncoderBuilder;->ignoreNullValues(Z)Lcom/google/firebase/encoders/json/JsonDataEncoderBuilder;

    move-result-object p2

    invoke-virtual {p2}, Lcom/google/firebase/encoders/json/JsonDataEncoderBuilder;->build()Lcom/google/firebase/encoders/DataEncoder;

    move-result-object p2

    invoke-interface {p2, p1}, Lcom/google/firebase/encoders/DataEncoder;->encode(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string/jumbo p2, "utf-8"

    .line 6
    invoke-virtual {p1, p2}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object p1

    return-object p1

    :cond_1
    iget-object p1, p0, Lcom/google/android/gms/internal/mlkit_code_scanner/zzob;->zza:Lcom/google/android/gms/internal/mlkit_code_scanner/zzkc;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/mlkit_code_scanner/zzkc;->zzf()Lcom/google/android/gms/internal/mlkit_code_scanner/zzke;

    move-result-object p1

    .line 7
    new-instance p2, Lcom/google/android/gms/internal/mlkit_code_scanner/zzal;

    invoke-direct {p2}, Lcom/google/android/gms/internal/mlkit_code_scanner/zzal;-><init>()V

    .line 8
    sget-object v0, Lcom/google/android/gms/internal/mlkit_code_scanner/zzig;->zza:Lcom/google/firebase/encoders/config/Configurator;

    .line 9
    invoke-interface {v0, p2}, Lcom/google/firebase/encoders/config/Configurator;->configure(Lcom/google/firebase/encoders/config/EncoderConfig;)V

    .line 8
    invoke-virtual {p2}, Lcom/google/android/gms/internal/mlkit_code_scanner/zzal;->zza()Lcom/google/android/gms/internal/mlkit_code_scanner/zzam;

    move-result-object p2

    invoke-virtual {p2, p1}, Lcom/google/android/gms/internal/mlkit_code_scanner/zzam;->zza(Ljava/lang/Object;)[B

    move-result-object p1
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    new-instance p2, Ljava/lang/UnsupportedOperationException;

    const-string v0, "Failed to covert logging to UTF-8 byte array"

    .line 10
    invoke-direct {p2, v0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2
.end method
