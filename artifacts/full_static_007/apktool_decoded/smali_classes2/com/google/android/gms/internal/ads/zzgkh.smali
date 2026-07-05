.class public final Lcom/google/android/gms/internal/ads/zzgkh;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@23.2.0"


# static fields
.field private static final zza:Lcom/google/android/gms/internal/ads/zzgpy;

.field private static final zzb:Lcom/google/android/gms/internal/ads/zzgpa;

.field private static final zzc:Lcom/google/android/gms/internal/ads/zzgpc;

.field private static final zzd:Lcom/google/android/gms/internal/ads/zzghj;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/ads/zzgke;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzgke;-><init>()V

    const-class v1, Lcom/google/android/gms/internal/ads/zzgkd;

    const-class v2, Lcom/google/android/gms/internal/ads/zzggy;

    invoke-static {v0, v1, v2}, Lcom/google/android/gms/internal/ads/zzgpy;->zzb(Lcom/google/android/gms/internal/ads/zzgpw;Ljava/lang/Class;Ljava/lang/Class;)Lcom/google/android/gms/internal/ads/zzgpy;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/ads/zzgkh;->zza:Lcom/google/android/gms/internal/ads/zzgpy;

    new-instance v0, Lcom/google/android/gms/internal/ads/zzgkf;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzgkf;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ads/zzgkh;->zzb:Lcom/google/android/gms/internal/ads/zzgpa;

    new-instance v0, Lcom/google/android/gms/internal/ads/zzgkg;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzgkg;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ads/zzgkh;->zzc:Lcom/google/android/gms/internal/ads/zzgpc;

    const-class v0, Lcom/google/android/gms/internal/ads/zzggy;

    sget-object v1, Lcom/google/android/gms/internal/ads/zzgwg;->zzb:Lcom/google/android/gms/internal/ads/zzgwg;

    .line 2
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzgvi;->zzg()Lcom/google/android/gms/internal/ads/zzhdm;

    move-result-object v2

    const-string v3, "type.googleapis.com/google.crypto.tink.AesGcmSivKey"

    invoke-static {v3, v0, v1, v2}, Lcom/google/android/gms/internal/ads/zzgos;->zzd(Ljava/lang/String;Ljava/lang/Class;Lcom/google/android/gms/internal/ads/zzgwg;Lcom/google/android/gms/internal/ads/zzhdm;)Lcom/google/android/gms/internal/ads/zzghj;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/ads/zzgkh;->zzd:Lcom/google/android/gms/internal/ads/zzghj;

    return-void
.end method

.method public static zza(Z)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    const/4 p0, 0x1

    .line 1
    invoke-static {p0}, Lcom/google/android/gms/internal/ads/zzgoc;->zza(I)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 3
    sget v0, Lcom/google/android/gms/internal/ads/zzgnb;->zza:I

    .line 4
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzgpl;->zzc()Lcom/google/android/gms/internal/ads/zzgpl;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzgnb;->zze(Lcom/google/android/gms/internal/ads/zzgpl;)V

    .line 5
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzgkh;->zzb()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 6
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzgpi;->zza()Lcom/google/android/gms/internal/ads/zzgpi;

    move-result-object v0

    sget-object v1, Lcom/google/android/gms/internal/ads/zzgkh;->zza:Lcom/google/android/gms/internal/ads/zzgpy;

    .line 7
    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzgpi;->zze(Lcom/google/android/gms/internal/ads/zzgpy;)V

    .line 8
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzgph;->zzb()Lcom/google/android/gms/internal/ads/zzgph;

    move-result-object v0

    new-instance v1, Ljava/util/HashMap;

    .line 9
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    new-instance v2, Lcom/google/android/gms/internal/ads/zzgkj;

    const/4 v3, 0x0

    invoke-direct {v2, v3}, Lcom/google/android/gms/internal/ads/zzgkj;-><init>(Lcom/google/android/gms/internal/ads/zzgki;)V

    const/16 v4, 0x10

    .line 10
    invoke-virtual {v2, v4}, Lcom/google/android/gms/internal/ads/zzgkj;->zza(I)Lcom/google/android/gms/internal/ads/zzgkj;

    sget-object v5, Lcom/google/android/gms/internal/ads/zzgkk;->zza:Lcom/google/android/gms/internal/ads/zzgkk;

    .line 11
    invoke-virtual {v2, v5}, Lcom/google/android/gms/internal/ads/zzgkj;->zzb(Lcom/google/android/gms/internal/ads/zzgkk;)Lcom/google/android/gms/internal/ads/zzgkj;

    .line 12
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzgkj;->zzc()Lcom/google/android/gms/internal/ads/zzgkm;

    move-result-object v2

    const-string v5, "AES128_GCM_SIV"

    .line 13
    invoke-interface {v1, v5, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, Lcom/google/android/gms/internal/ads/zzgkj;

    invoke-direct {v2, v3}, Lcom/google/android/gms/internal/ads/zzgkj;-><init>(Lcom/google/android/gms/internal/ads/zzgki;)V

    .line 14
    invoke-virtual {v2, v4}, Lcom/google/android/gms/internal/ads/zzgkj;->zza(I)Lcom/google/android/gms/internal/ads/zzgkj;

    sget-object v4, Lcom/google/android/gms/internal/ads/zzgkk;->zzc:Lcom/google/android/gms/internal/ads/zzgkk;

    .line 15
    invoke-virtual {v2, v4}, Lcom/google/android/gms/internal/ads/zzgkj;->zzb(Lcom/google/android/gms/internal/ads/zzgkk;)Lcom/google/android/gms/internal/ads/zzgkj;

    .line 16
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzgkj;->zzc()Lcom/google/android/gms/internal/ads/zzgkm;

    move-result-object v2

    const-string v4, "AES128_GCM_SIV_RAW"

    .line 17
    invoke-interface {v1, v4, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, Lcom/google/android/gms/internal/ads/zzgkj;

    invoke-direct {v2, v3}, Lcom/google/android/gms/internal/ads/zzgkj;-><init>(Lcom/google/android/gms/internal/ads/zzgki;)V

    const/16 v4, 0x20

    .line 18
    invoke-virtual {v2, v4}, Lcom/google/android/gms/internal/ads/zzgkj;->zza(I)Lcom/google/android/gms/internal/ads/zzgkj;

    sget-object v5, Lcom/google/android/gms/internal/ads/zzgkk;->zza:Lcom/google/android/gms/internal/ads/zzgkk;

    .line 19
    invoke-virtual {v2, v5}, Lcom/google/android/gms/internal/ads/zzgkj;->zzb(Lcom/google/android/gms/internal/ads/zzgkk;)Lcom/google/android/gms/internal/ads/zzgkj;

    .line 20
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzgkj;->zzc()Lcom/google/android/gms/internal/ads/zzgkm;

    move-result-object v2

    const-string v5, "AES256_GCM_SIV"

    .line 21
    invoke-interface {v1, v5, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, Lcom/google/android/gms/internal/ads/zzgkj;

    invoke-direct {v2, v3}, Lcom/google/android/gms/internal/ads/zzgkj;-><init>(Lcom/google/android/gms/internal/ads/zzgki;)V

    .line 22
    invoke-virtual {v2, v4}, Lcom/google/android/gms/internal/ads/zzgkj;->zza(I)Lcom/google/android/gms/internal/ads/zzgkj;

    sget-object v3, Lcom/google/android/gms/internal/ads/zzgkk;->zzc:Lcom/google/android/gms/internal/ads/zzgkk;

    .line 23
    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/ads/zzgkj;->zzb(Lcom/google/android/gms/internal/ads/zzgkk;)Lcom/google/android/gms/internal/ads/zzgkj;

    .line 24
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzgkj;->zzc()Lcom/google/android/gms/internal/ads/zzgkm;

    move-result-object v2

    const-string v3, "AES256_GCM_SIV_RAW"

    .line 25
    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    invoke-static {v1}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v1

    .line 8
    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzgph;->zzd(Ljava/util/Map;)V

    .line 27
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzgpd;->zza()Lcom/google/android/gms/internal/ads/zzgpd;

    move-result-object v0

    sget-object v1, Lcom/google/android/gms/internal/ads/zzgkh;->zzc:Lcom/google/android/gms/internal/ads/zzgpc;

    const-class v2, Lcom/google/android/gms/internal/ads/zzgkm;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ads/zzgpd;->zzb(Lcom/google/android/gms/internal/ads/zzgpc;Ljava/lang/Class;)V

    .line 28
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzgpb;->zzb()Lcom/google/android/gms/internal/ads/zzgpb;

    move-result-object v0

    sget-object v1, Lcom/google/android/gms/internal/ads/zzgkh;->zzb:Lcom/google/android/gms/internal/ads/zzgpa;

    const-class v2, Lcom/google/android/gms/internal/ads/zzgkm;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ads/zzgpb;->zzc(Lcom/google/android/gms/internal/ads/zzgpa;Ljava/lang/Class;)V

    .line 29
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzgoj;->zzc()Lcom/google/android/gms/internal/ads/zzgoj;

    move-result-object v0

    sget-object v1, Lcom/google/android/gms/internal/ads/zzgkh;->zzd:Lcom/google/android/gms/internal/ads/zzghj;

    invoke-virtual {v0, v1, p0}, Lcom/google/android/gms/internal/ads/zzgoj;->zzd(Lcom/google/android/gms/internal/ads/zzghj;Z)V

    :cond_0
    return-void

    .line 2
    :cond_1
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string v0, "Registering AES GCM SIV is not supported in FIPS mode"

    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private static zzb()Z
    .locals 1

    .line 1
    :try_start_0
    const-string v0, "AES/GCM-SIV/NoPadding"

    invoke-static {v0}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;)Ljavax/crypto/Cipher;
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljavax/crypto/NoSuchPaddingException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v0, 0x1

    return v0

    :catch_0
    const/4 v0, 0x0

    return v0
.end method
