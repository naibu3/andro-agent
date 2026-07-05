.class public final Lcom/google/android/gms/internal/ads/zzgri;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@23.2.0"


# static fields
.field private static final zza:Lcom/google/android/gms/internal/ads/zzgpa;

.field private static final zzb:Lcom/google/android/gms/internal/ads/zzgpy;

.field private static final zzc:Lcom/google/android/gms/internal/ads/zzgpy;

.field private static final zzd:Lcom/google/android/gms/internal/ads/zzghj;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/ads/zzgrf;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzgrf;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ads/zzgri;->zza:Lcom/google/android/gms/internal/ads/zzgpa;

    new-instance v0, Lcom/google/android/gms/internal/ads/zzgrg;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzgrg;-><init>()V

    const-class v1, Lcom/google/android/gms/internal/ads/zzgre;

    const-class v2, Lcom/google/android/gms/internal/ads/zzgro;

    invoke-static {v0, v1, v2}, Lcom/google/android/gms/internal/ads/zzgpy;->zzb(Lcom/google/android/gms/internal/ads/zzgpw;Ljava/lang/Class;Ljava/lang/Class;)Lcom/google/android/gms/internal/ads/zzgpy;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/ads/zzgri;->zzb:Lcom/google/android/gms/internal/ads/zzgpy;

    new-instance v0, Lcom/google/android/gms/internal/ads/zzgrh;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzgrh;-><init>()V

    const-class v1, Lcom/google/android/gms/internal/ads/zzgre;

    const-class v2, Lcom/google/android/gms/internal/ads/zzghw;

    invoke-static {v0, v1, v2}, Lcom/google/android/gms/internal/ads/zzgpy;->zzb(Lcom/google/android/gms/internal/ads/zzgpw;Ljava/lang/Class;Ljava/lang/Class;)Lcom/google/android/gms/internal/ads/zzgpy;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/ads/zzgri;->zzc:Lcom/google/android/gms/internal/ads/zzgpy;

    const-class v0, Lcom/google/android/gms/internal/ads/zzghw;

    sget-object v1, Lcom/google/android/gms/internal/ads/zzgwg;->zzb:Lcom/google/android/gms/internal/ads/zzgwg;

    .line 2
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzgtv;->zzh()Lcom/google/android/gms/internal/ads/zzhdm;

    move-result-object v2

    const-string v3, "type.googleapis.com/google.crypto.tink.AesCmacKey"

    invoke-static {v3, v0, v1, v2}, Lcom/google/android/gms/internal/ads/zzgos;->zzd(Ljava/lang/String;Ljava/lang/Class;Lcom/google/android/gms/internal/ads/zzgwg;Lcom/google/android/gms/internal/ads/zzhdm;)Lcom/google/android/gms/internal/ads/zzghj;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/ads/zzgri;->zzd:Lcom/google/android/gms/internal/ads/zzghj;

    return-void
.end method

.method public static synthetic zza(Lcom/google/android/gms/internal/ads/zzgre;)Lcom/google/android/gms/internal/ads/zzghw;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzgre;->zzb()Lcom/google/android/gms/internal/ads/zzgrn;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzgri;->zze(Lcom/google/android/gms/internal/ads/zzgrn;)V

    .line 2
    invoke-static {p0}, Lcom/google/android/gms/internal/ads/zzgzb;->zza(Lcom/google/android/gms/internal/ads/zzgre;)Lcom/google/android/gms/internal/ads/zzghw;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic zzb(Lcom/google/android/gms/internal/ads/zzgrn;Ljava/lang/Integer;)Lcom/google/android/gms/internal/ads/zzgre;
    .locals 2

    .line 1
    invoke-static {p0}, Lcom/google/android/gms/internal/ads/zzgri;->zze(Lcom/google/android/gms/internal/ads/zzgrn;)V

    new-instance v0, Lcom/google/android/gms/internal/ads/zzgrc;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/zzgrc;-><init>(Lcom/google/android/gms/internal/ads/zzgrb;)V

    .line 2
    invoke-virtual {v0, p0}, Lcom/google/android/gms/internal/ads/zzgrc;->zzc(Lcom/google/android/gms/internal/ads/zzgrn;)Lcom/google/android/gms/internal/ads/zzgrc;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzgrn;->zzc()I

    move-result p0

    .line 3
    invoke-static {p0}, Lcom/google/android/gms/internal/ads/zzgzf;->zzc(I)Lcom/google/android/gms/internal/ads/zzgzf;

    move-result-object p0

    invoke-virtual {v0, p0}, Lcom/google/android/gms/internal/ads/zzgrc;->zza(Lcom/google/android/gms/internal/ads/zzgzf;)Lcom/google/android/gms/internal/ads/zzgrc;

    .line 4
    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/zzgrc;->zzb(Ljava/lang/Integer;)Lcom/google/android/gms/internal/ads/zzgrc;

    .line 5
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzgrc;->zzd()Lcom/google/android/gms/internal/ads/zzgre;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic zzc(Lcom/google/android/gms/internal/ads/zzgre;)Lcom/google/android/gms/internal/ads/zzgro;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzgre;->zzb()Lcom/google/android/gms/internal/ads/zzgrn;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzgri;->zze(Lcom/google/android/gms/internal/ads/zzgrn;)V

    new-instance v0, Lcom/google/android/gms/internal/ads/zzgta;

    .line 2
    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/ads/zzgta;-><init>(Lcom/google/android/gms/internal/ads/zzgre;)V

    return-object v0
.end method

.method public static zzd(Z)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    const/4 p0, 0x1

    .line 1
    invoke-static {p0}, Lcom/google/android/gms/internal/ads/zzgoc;->zza(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3
    sget v0, Lcom/google/android/gms/internal/ads/zzgsy;->zza:I

    .line 4
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzgpl;->zzc()Lcom/google/android/gms/internal/ads/zzgpl;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzgsy;->zze(Lcom/google/android/gms/internal/ads/zzgpl;)V

    .line 5
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzgpb;->zzb()Lcom/google/android/gms/internal/ads/zzgpb;

    move-result-object v0

    sget-object v1, Lcom/google/android/gms/internal/ads/zzgri;->zza:Lcom/google/android/gms/internal/ads/zzgpa;

    const-class v2, Lcom/google/android/gms/internal/ads/zzgrn;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ads/zzgpb;->zzc(Lcom/google/android/gms/internal/ads/zzgpa;Ljava/lang/Class;)V

    .line 6
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzgpi;->zza()Lcom/google/android/gms/internal/ads/zzgpi;

    move-result-object v0

    sget-object v1, Lcom/google/android/gms/internal/ads/zzgri;->zzb:Lcom/google/android/gms/internal/ads/zzgpy;

    .line 7
    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzgpi;->zze(Lcom/google/android/gms/internal/ads/zzgpy;)V

    invoke-static {}, Lcom/google/android/gms/internal/ads/zzgpi;->zza()Lcom/google/android/gms/internal/ads/zzgpi;

    move-result-object v0

    sget-object v1, Lcom/google/android/gms/internal/ads/zzgri;->zzc:Lcom/google/android/gms/internal/ads/zzgpy;

    .line 8
    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzgpi;->zze(Lcom/google/android/gms/internal/ads/zzgpy;)V

    .line 9
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzgph;->zzb()Lcom/google/android/gms/internal/ads/zzgph;

    move-result-object v0

    new-instance v1, Ljava/util/HashMap;

    .line 10
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    const-string v2, "AES_CMAC"

    .line 11
    sget-object v3, Lcom/google/android/gms/internal/ads/zzgst;->zze:Lcom/google/android/gms/internal/ads/zzgrn;

    invoke-interface {v1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "AES256_CMAC"

    sget-object v3, Lcom/google/android/gms/internal/ads/zzgst;->zze:Lcom/google/android/gms/internal/ads/zzgrn;

    .line 12
    invoke-interface {v1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, Lcom/google/android/gms/internal/ads/zzgrk;

    const/4 v3, 0x0

    invoke-direct {v2, v3}, Lcom/google/android/gms/internal/ads/zzgrk;-><init>(Lcom/google/android/gms/internal/ads/zzgrj;)V

    const/16 v3, 0x20

    .line 13
    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/ads/zzgrk;->zza(I)Lcom/google/android/gms/internal/ads/zzgrk;

    const/16 v3, 0x10

    .line 14
    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/ads/zzgrk;->zzb(I)Lcom/google/android/gms/internal/ads/zzgrk;

    sget-object v3, Lcom/google/android/gms/internal/ads/zzgrl;->zzd:Lcom/google/android/gms/internal/ads/zzgrl;

    .line 15
    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/ads/zzgrk;->zzc(Lcom/google/android/gms/internal/ads/zzgrl;)Lcom/google/android/gms/internal/ads/zzgrk;

    .line 16
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzgrk;->zzd()Lcom/google/android/gms/internal/ads/zzgrn;

    move-result-object v2

    const-string v3, "AES256_CMAC_RAW"

    .line 17
    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    invoke-static {v1}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v1

    .line 9
    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzgph;->zzd(Ljava/util/Map;)V

    .line 19
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzgoj;->zzc()Lcom/google/android/gms/internal/ads/zzgoj;

    move-result-object v0

    sget-object v1, Lcom/google/android/gms/internal/ads/zzgri;->zzd:Lcom/google/android/gms/internal/ads/zzghj;

    invoke-virtual {v0, v1, p0}, Lcom/google/android/gms/internal/ads/zzgoj;->zzd(Lcom/google/android/gms/internal/ads/zzghj;Z)V

    return-void

    .line 2
    :cond_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string v0, "Registering AES CMAC is not supported in FIPS mode"

    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private static zze(Lcom/google/android/gms/internal/ads/zzgrn;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzgrn;->zzc()I

    move-result p0

    const/16 v0, 0x20

    if-ne p0, v0, :cond_0

    return-void

    .line 2
    :cond_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string v0, "AesCmacKey size wrong, must be 32 bytes"

    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
