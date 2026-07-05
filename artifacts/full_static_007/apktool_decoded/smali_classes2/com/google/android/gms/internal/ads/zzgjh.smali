.class public final Lcom/google/android/gms/internal/ads/zzgjh;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@23.2.0"


# static fields
.field public static final synthetic zza:I

.field private static final zzb:Lcom/google/android/gms/internal/ads/zzgpy;

.field private static final zzc:Lcom/google/android/gms/internal/ads/zzghj;

.field private static final zzd:Lcom/google/android/gms/internal/ads/zzgpa;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/ads/zzgjf;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzgjf;-><init>()V

    const-class v1, Lcom/google/android/gms/internal/ads/zzgje;

    const-class v2, Lcom/google/android/gms/internal/ads/zzggy;

    invoke-static {v0, v1, v2}, Lcom/google/android/gms/internal/ads/zzgpy;->zzb(Lcom/google/android/gms/internal/ads/zzgpw;Ljava/lang/Class;Ljava/lang/Class;)Lcom/google/android/gms/internal/ads/zzgpy;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/ads/zzgjh;->zzb:Lcom/google/android/gms/internal/ads/zzgpy;

    const-class v0, Lcom/google/android/gms/internal/ads/zzggy;

    sget-object v1, Lcom/google/android/gms/internal/ads/zzgwg;->zzb:Lcom/google/android/gms/internal/ads/zzgwg;

    .line 2
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzgut;->zzh()Lcom/google/android/gms/internal/ads/zzhdm;

    move-result-object v2

    const-string v3, "type.googleapis.com/google.crypto.tink.AesEaxKey"

    invoke-static {v3, v0, v1, v2}, Lcom/google/android/gms/internal/ads/zzgos;->zzd(Ljava/lang/String;Ljava/lang/Class;Lcom/google/android/gms/internal/ads/zzgwg;Lcom/google/android/gms/internal/ads/zzhdm;)Lcom/google/android/gms/internal/ads/zzghj;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/ads/zzgjh;->zzc:Lcom/google/android/gms/internal/ads/zzghj;

    new-instance v0, Lcom/google/android/gms/internal/ads/zzgjg;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzgjg;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ads/zzgjh;->zzd:Lcom/google/android/gms/internal/ads/zzgpa;

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

    if-eqz v0, :cond_0

    .line 3
    sget v0, Lcom/google/android/gms/internal/ads/zzgmr;->zza:I

    .line 4
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzgpl;->zzc()Lcom/google/android/gms/internal/ads/zzgpl;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzgmr;->zze(Lcom/google/android/gms/internal/ads/zzgpl;)V

    .line 5
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzgpi;->zza()Lcom/google/android/gms/internal/ads/zzgpi;

    move-result-object v0

    sget-object v1, Lcom/google/android/gms/internal/ads/zzgjh;->zzb:Lcom/google/android/gms/internal/ads/zzgpy;

    .line 6
    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzgpi;->zze(Lcom/google/android/gms/internal/ads/zzgpy;)V

    .line 7
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzgph;->zzb()Lcom/google/android/gms/internal/ads/zzgph;

    move-result-object v0

    new-instance v1, Ljava/util/HashMap;

    .line 8
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    const-string v2, "AES128_EAX"

    .line 9
    sget-object v3, Lcom/google/android/gms/internal/ads/zzgma;->zzc:Lcom/google/android/gms/internal/ads/zzgjm;

    invoke-interface {v1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, Lcom/google/android/gms/internal/ads/zzgjj;

    const/4 v3, 0x0

    invoke-direct {v2, v3}, Lcom/google/android/gms/internal/ads/zzgjj;-><init>(Lcom/google/android/gms/internal/ads/zzgji;)V

    const/16 v4, 0x10

    .line 10
    invoke-virtual {v2, v4}, Lcom/google/android/gms/internal/ads/zzgjj;->zza(I)Lcom/google/android/gms/internal/ads/zzgjj;

    .line 11
    invoke-virtual {v2, v4}, Lcom/google/android/gms/internal/ads/zzgjj;->zzb(I)Lcom/google/android/gms/internal/ads/zzgjj;

    .line 12
    invoke-virtual {v2, v4}, Lcom/google/android/gms/internal/ads/zzgjj;->zzc(I)Lcom/google/android/gms/internal/ads/zzgjj;

    sget-object v5, Lcom/google/android/gms/internal/ads/zzgjk;->zzc:Lcom/google/android/gms/internal/ads/zzgjk;

    .line 13
    invoke-virtual {v2, v5}, Lcom/google/android/gms/internal/ads/zzgjj;->zzd(Lcom/google/android/gms/internal/ads/zzgjk;)Lcom/google/android/gms/internal/ads/zzgjj;

    .line 14
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzgjj;->zze()Lcom/google/android/gms/internal/ads/zzgjm;

    move-result-object v2

    const-string v5, "AES128_EAX_RAW"

    .line 15
    invoke-interface {v1, v5, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "AES256_EAX"

    sget-object v5, Lcom/google/android/gms/internal/ads/zzgma;->zzd:Lcom/google/android/gms/internal/ads/zzgjm;

    .line 16
    invoke-interface {v1, v2, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, Lcom/google/android/gms/internal/ads/zzgjj;

    invoke-direct {v2, v3}, Lcom/google/android/gms/internal/ads/zzgjj;-><init>(Lcom/google/android/gms/internal/ads/zzgji;)V

    .line 17
    invoke-virtual {v2, v4}, Lcom/google/android/gms/internal/ads/zzgjj;->zza(I)Lcom/google/android/gms/internal/ads/zzgjj;

    const/16 v3, 0x20

    .line 18
    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/ads/zzgjj;->zzb(I)Lcom/google/android/gms/internal/ads/zzgjj;

    .line 19
    invoke-virtual {v2, v4}, Lcom/google/android/gms/internal/ads/zzgjj;->zzc(I)Lcom/google/android/gms/internal/ads/zzgjj;

    sget-object v3, Lcom/google/android/gms/internal/ads/zzgjk;->zzc:Lcom/google/android/gms/internal/ads/zzgjk;

    .line 20
    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/ads/zzgjj;->zzd(Lcom/google/android/gms/internal/ads/zzgjk;)Lcom/google/android/gms/internal/ads/zzgjj;

    .line 21
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzgjj;->zze()Lcom/google/android/gms/internal/ads/zzgjm;

    move-result-object v2

    const-string v3, "AES256_EAX_RAW"

    .line 22
    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    invoke-static {v1}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v1

    .line 7
    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzgph;->zzd(Ljava/util/Map;)V

    .line 24
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzgpb;->zzb()Lcom/google/android/gms/internal/ads/zzgpb;

    move-result-object v0

    sget-object v1, Lcom/google/android/gms/internal/ads/zzgjh;->zzd:Lcom/google/android/gms/internal/ads/zzgpa;

    const-class v2, Lcom/google/android/gms/internal/ads/zzgjm;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ads/zzgpb;->zzc(Lcom/google/android/gms/internal/ads/zzgpa;Ljava/lang/Class;)V

    .line 25
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzgoj;->zzc()Lcom/google/android/gms/internal/ads/zzgoj;

    move-result-object v0

    sget-object v1, Lcom/google/android/gms/internal/ads/zzgjh;->zzc:Lcom/google/android/gms/internal/ads/zzghj;

    invoke-virtual {v0, v1, p0}, Lcom/google/android/gms/internal/ads/zzgoj;->zzd(Lcom/google/android/gms/internal/ads/zzghj;Z)V

    return-void

    .line 2
    :cond_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string v0, "Registering AES EAX is not supported in FIPS mode"

    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
