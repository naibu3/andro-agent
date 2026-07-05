.class public final Lcom/google/android/gms/internal/ads/zzgsa;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@23.2.0"


# static fields
.field private static final zza:Lcom/google/android/gms/internal/ads/zzgpy;

.field private static final zzb:Lcom/google/android/gms/internal/ads/zzgpy;

.field private static final zzc:Lcom/google/android/gms/internal/ads/zzghj;

.field private static final zzd:Lcom/google/android/gms/internal/ads/zzgpc;

.field private static final zze:Lcom/google/android/gms/internal/ads/zzgpa;

.field private static final zzf:I


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/ads/zzgrw;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzgrw;-><init>()V

    const-class v1, Lcom/google/android/gms/internal/ads/zzgrv;

    const-class v2, Lcom/google/android/gms/internal/ads/zzgro;

    invoke-static {v0, v1, v2}, Lcom/google/android/gms/internal/ads/zzgpy;->zzb(Lcom/google/android/gms/internal/ads/zzgpw;Ljava/lang/Class;Ljava/lang/Class;)Lcom/google/android/gms/internal/ads/zzgpy;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/ads/zzgsa;->zza:Lcom/google/android/gms/internal/ads/zzgpy;

    new-instance v0, Lcom/google/android/gms/internal/ads/zzgrx;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzgrx;-><init>()V

    const-class v1, Lcom/google/android/gms/internal/ads/zzgrv;

    const-class v2, Lcom/google/android/gms/internal/ads/zzghw;

    invoke-static {v0, v1, v2}, Lcom/google/android/gms/internal/ads/zzgpy;->zzb(Lcom/google/android/gms/internal/ads/zzgpw;Ljava/lang/Class;Ljava/lang/Class;)Lcom/google/android/gms/internal/ads/zzgpy;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/ads/zzgsa;->zzb:Lcom/google/android/gms/internal/ads/zzgpy;

    const-class v0, Lcom/google/android/gms/internal/ads/zzghw;

    sget-object v1, Lcom/google/android/gms/internal/ads/zzgwg;->zzb:Lcom/google/android/gms/internal/ads/zzgwg;

    .line 2
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzgvw;->zzi()Lcom/google/android/gms/internal/ads/zzhdm;

    move-result-object v2

    const-string v3, "type.googleapis.com/google.crypto.tink.HmacKey"

    invoke-static {v3, v0, v1, v2}, Lcom/google/android/gms/internal/ads/zzgos;->zzd(Ljava/lang/String;Ljava/lang/Class;Lcom/google/android/gms/internal/ads/zzgwg;Lcom/google/android/gms/internal/ads/zzhdm;)Lcom/google/android/gms/internal/ads/zzghj;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/ads/zzgsa;->zzc:Lcom/google/android/gms/internal/ads/zzghj;

    new-instance v0, Lcom/google/android/gms/internal/ads/zzgry;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzgry;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ads/zzgsa;->zzd:Lcom/google/android/gms/internal/ads/zzgpc;

    new-instance v0, Lcom/google/android/gms/internal/ads/zzgrz;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzgrz;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ads/zzgsa;->zze:Lcom/google/android/gms/internal/ads/zzgpa;

    const/4 v0, 0x2

    sput v0, Lcom/google/android/gms/internal/ads/zzgsa;->zzf:I

    return-void
.end method

.method public static zza(Z)V
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    .line 1
    sget p0, Lcom/google/android/gms/internal/ads/zzgsa;->zzf:I

    invoke-static {p0}, Lcom/google/android/gms/internal/ads/zzgoc;->zza(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3
    sget v0, Lcom/google/android/gms/internal/ads/zzgtg;->zza:I

    .line 4
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzgpl;->zzc()Lcom/google/android/gms/internal/ads/zzgpl;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzgtg;->zze(Lcom/google/android/gms/internal/ads/zzgpl;)V

    .line 5
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzgpi;->zza()Lcom/google/android/gms/internal/ads/zzgpi;

    move-result-object v0

    sget-object v1, Lcom/google/android/gms/internal/ads/zzgsa;->zza:Lcom/google/android/gms/internal/ads/zzgpy;

    .line 6
    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzgpi;->zze(Lcom/google/android/gms/internal/ads/zzgpy;)V

    invoke-static {}, Lcom/google/android/gms/internal/ads/zzgpi;->zza()Lcom/google/android/gms/internal/ads/zzgpi;

    move-result-object v0

    sget-object v1, Lcom/google/android/gms/internal/ads/zzgsa;->zzb:Lcom/google/android/gms/internal/ads/zzgpy;

    .line 7
    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzgpi;->zze(Lcom/google/android/gms/internal/ads/zzgpy;)V

    .line 8
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzgph;->zzb()Lcom/google/android/gms/internal/ads/zzgph;

    move-result-object v0

    new-instance v1, Ljava/util/HashMap;

    .line 9
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    const-string v2, "HMAC_SHA256_128BITTAG"

    .line 10
    sget-object v3, Lcom/google/android/gms/internal/ads/zzgst;->zza:Lcom/google/android/gms/internal/ads/zzgsg;

    invoke-interface {v1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, Lcom/google/android/gms/internal/ads/zzgsc;

    const/4 v3, 0x0

    invoke-direct {v2, v3}, Lcom/google/android/gms/internal/ads/zzgsc;-><init>(Lcom/google/android/gms/internal/ads/zzgsb;)V

    const/16 v4, 0x20

    .line 11
    invoke-virtual {v2, v4}, Lcom/google/android/gms/internal/ads/zzgsc;->zzb(I)Lcom/google/android/gms/internal/ads/zzgsc;

    const/16 v5, 0x10

    .line 12
    invoke-virtual {v2, v5}, Lcom/google/android/gms/internal/ads/zzgsc;->zzc(I)Lcom/google/android/gms/internal/ads/zzgsc;

    sget-object v6, Lcom/google/android/gms/internal/ads/zzgse;->zzd:Lcom/google/android/gms/internal/ads/zzgse;

    .line 13
    invoke-virtual {v2, v6}, Lcom/google/android/gms/internal/ads/zzgsc;->zzd(Lcom/google/android/gms/internal/ads/zzgse;)Lcom/google/android/gms/internal/ads/zzgsc;

    sget-object v6, Lcom/google/android/gms/internal/ads/zzgsd;->zzc:Lcom/google/android/gms/internal/ads/zzgsd;

    .line 14
    invoke-virtual {v2, v6}, Lcom/google/android/gms/internal/ads/zzgsc;->zza(Lcom/google/android/gms/internal/ads/zzgsd;)Lcom/google/android/gms/internal/ads/zzgsc;

    .line 15
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzgsc;->zze()Lcom/google/android/gms/internal/ads/zzgsg;

    move-result-object v2

    const-string v6, "HMAC_SHA256_128BITTAG_RAW"

    .line 16
    invoke-interface {v1, v6, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, Lcom/google/android/gms/internal/ads/zzgsc;

    invoke-direct {v2, v3}, Lcom/google/android/gms/internal/ads/zzgsc;-><init>(Lcom/google/android/gms/internal/ads/zzgsb;)V

    .line 17
    invoke-virtual {v2, v4}, Lcom/google/android/gms/internal/ads/zzgsc;->zzb(I)Lcom/google/android/gms/internal/ads/zzgsc;

    .line 18
    invoke-virtual {v2, v4}, Lcom/google/android/gms/internal/ads/zzgsc;->zzc(I)Lcom/google/android/gms/internal/ads/zzgsc;

    sget-object v6, Lcom/google/android/gms/internal/ads/zzgse;->zza:Lcom/google/android/gms/internal/ads/zzgse;

    .line 19
    invoke-virtual {v2, v6}, Lcom/google/android/gms/internal/ads/zzgsc;->zzd(Lcom/google/android/gms/internal/ads/zzgse;)Lcom/google/android/gms/internal/ads/zzgsc;

    sget-object v6, Lcom/google/android/gms/internal/ads/zzgsd;->zzc:Lcom/google/android/gms/internal/ads/zzgsd;

    .line 20
    invoke-virtual {v2, v6}, Lcom/google/android/gms/internal/ads/zzgsc;->zza(Lcom/google/android/gms/internal/ads/zzgsd;)Lcom/google/android/gms/internal/ads/zzgsc;

    .line 21
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzgsc;->zze()Lcom/google/android/gms/internal/ads/zzgsg;

    move-result-object v2

    const-string v6, "HMAC_SHA256_256BITTAG"

    .line 22
    invoke-interface {v1, v6, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, Lcom/google/android/gms/internal/ads/zzgsc;

    invoke-direct {v2, v3}, Lcom/google/android/gms/internal/ads/zzgsc;-><init>(Lcom/google/android/gms/internal/ads/zzgsb;)V

    .line 23
    invoke-virtual {v2, v4}, Lcom/google/android/gms/internal/ads/zzgsc;->zzb(I)Lcom/google/android/gms/internal/ads/zzgsc;

    .line 24
    invoke-virtual {v2, v4}, Lcom/google/android/gms/internal/ads/zzgsc;->zzc(I)Lcom/google/android/gms/internal/ads/zzgsc;

    sget-object v6, Lcom/google/android/gms/internal/ads/zzgse;->zzd:Lcom/google/android/gms/internal/ads/zzgse;

    .line 25
    invoke-virtual {v2, v6}, Lcom/google/android/gms/internal/ads/zzgsc;->zzd(Lcom/google/android/gms/internal/ads/zzgse;)Lcom/google/android/gms/internal/ads/zzgsc;

    sget-object v6, Lcom/google/android/gms/internal/ads/zzgsd;->zzc:Lcom/google/android/gms/internal/ads/zzgsd;

    .line 26
    invoke-virtual {v2, v6}, Lcom/google/android/gms/internal/ads/zzgsc;->zza(Lcom/google/android/gms/internal/ads/zzgsd;)Lcom/google/android/gms/internal/ads/zzgsc;

    .line 27
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzgsc;->zze()Lcom/google/android/gms/internal/ads/zzgsg;

    move-result-object v2

    const-string v6, "HMAC_SHA256_256BITTAG_RAW"

    .line 28
    invoke-interface {v1, v6, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, Lcom/google/android/gms/internal/ads/zzgsc;

    invoke-direct {v2, v3}, Lcom/google/android/gms/internal/ads/zzgsc;-><init>(Lcom/google/android/gms/internal/ads/zzgsb;)V

    const/16 v6, 0x40

    .line 29
    invoke-virtual {v2, v6}, Lcom/google/android/gms/internal/ads/zzgsc;->zzb(I)Lcom/google/android/gms/internal/ads/zzgsc;

    .line 30
    invoke-virtual {v2, v5}, Lcom/google/android/gms/internal/ads/zzgsc;->zzc(I)Lcom/google/android/gms/internal/ads/zzgsc;

    sget-object v7, Lcom/google/android/gms/internal/ads/zzgse;->zza:Lcom/google/android/gms/internal/ads/zzgse;

    .line 31
    invoke-virtual {v2, v7}, Lcom/google/android/gms/internal/ads/zzgsc;->zzd(Lcom/google/android/gms/internal/ads/zzgse;)Lcom/google/android/gms/internal/ads/zzgsc;

    sget-object v7, Lcom/google/android/gms/internal/ads/zzgsd;->zze:Lcom/google/android/gms/internal/ads/zzgsd;

    .line 32
    invoke-virtual {v2, v7}, Lcom/google/android/gms/internal/ads/zzgsc;->zza(Lcom/google/android/gms/internal/ads/zzgsd;)Lcom/google/android/gms/internal/ads/zzgsc;

    .line 33
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzgsc;->zze()Lcom/google/android/gms/internal/ads/zzgsg;

    move-result-object v2

    const-string v7, "HMAC_SHA512_128BITTAG"

    .line 34
    invoke-interface {v1, v7, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, Lcom/google/android/gms/internal/ads/zzgsc;

    invoke-direct {v2, v3}, Lcom/google/android/gms/internal/ads/zzgsc;-><init>(Lcom/google/android/gms/internal/ads/zzgsb;)V

    .line 35
    invoke-virtual {v2, v6}, Lcom/google/android/gms/internal/ads/zzgsc;->zzb(I)Lcom/google/android/gms/internal/ads/zzgsc;

    .line 36
    invoke-virtual {v2, v5}, Lcom/google/android/gms/internal/ads/zzgsc;->zzc(I)Lcom/google/android/gms/internal/ads/zzgsc;

    sget-object v5, Lcom/google/android/gms/internal/ads/zzgse;->zzd:Lcom/google/android/gms/internal/ads/zzgse;

    .line 37
    invoke-virtual {v2, v5}, Lcom/google/android/gms/internal/ads/zzgsc;->zzd(Lcom/google/android/gms/internal/ads/zzgse;)Lcom/google/android/gms/internal/ads/zzgsc;

    sget-object v5, Lcom/google/android/gms/internal/ads/zzgsd;->zze:Lcom/google/android/gms/internal/ads/zzgsd;

    .line 38
    invoke-virtual {v2, v5}, Lcom/google/android/gms/internal/ads/zzgsc;->zza(Lcom/google/android/gms/internal/ads/zzgsd;)Lcom/google/android/gms/internal/ads/zzgsc;

    .line 39
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzgsc;->zze()Lcom/google/android/gms/internal/ads/zzgsg;

    move-result-object v2

    const-string v5, "HMAC_SHA512_128BITTAG_RAW"

    .line 40
    invoke-interface {v1, v5, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, Lcom/google/android/gms/internal/ads/zzgsc;

    invoke-direct {v2, v3}, Lcom/google/android/gms/internal/ads/zzgsc;-><init>(Lcom/google/android/gms/internal/ads/zzgsb;)V

    .line 41
    invoke-virtual {v2, v6}, Lcom/google/android/gms/internal/ads/zzgsc;->zzb(I)Lcom/google/android/gms/internal/ads/zzgsc;

    .line 42
    invoke-virtual {v2, v4}, Lcom/google/android/gms/internal/ads/zzgsc;->zzc(I)Lcom/google/android/gms/internal/ads/zzgsc;

    sget-object v5, Lcom/google/android/gms/internal/ads/zzgse;->zza:Lcom/google/android/gms/internal/ads/zzgse;

    .line 43
    invoke-virtual {v2, v5}, Lcom/google/android/gms/internal/ads/zzgsc;->zzd(Lcom/google/android/gms/internal/ads/zzgse;)Lcom/google/android/gms/internal/ads/zzgsc;

    sget-object v5, Lcom/google/android/gms/internal/ads/zzgsd;->zze:Lcom/google/android/gms/internal/ads/zzgsd;

    .line 44
    invoke-virtual {v2, v5}, Lcom/google/android/gms/internal/ads/zzgsc;->zza(Lcom/google/android/gms/internal/ads/zzgsd;)Lcom/google/android/gms/internal/ads/zzgsc;

    .line 45
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzgsc;->zze()Lcom/google/android/gms/internal/ads/zzgsg;

    move-result-object v2

    const-string v5, "HMAC_SHA512_256BITTAG"

    .line 46
    invoke-interface {v1, v5, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, Lcom/google/android/gms/internal/ads/zzgsc;

    invoke-direct {v2, v3}, Lcom/google/android/gms/internal/ads/zzgsc;-><init>(Lcom/google/android/gms/internal/ads/zzgsb;)V

    .line 47
    invoke-virtual {v2, v6}, Lcom/google/android/gms/internal/ads/zzgsc;->zzb(I)Lcom/google/android/gms/internal/ads/zzgsc;

    .line 48
    invoke-virtual {v2, v4}, Lcom/google/android/gms/internal/ads/zzgsc;->zzc(I)Lcom/google/android/gms/internal/ads/zzgsc;

    sget-object v4, Lcom/google/android/gms/internal/ads/zzgse;->zzd:Lcom/google/android/gms/internal/ads/zzgse;

    .line 49
    invoke-virtual {v2, v4}, Lcom/google/android/gms/internal/ads/zzgsc;->zzd(Lcom/google/android/gms/internal/ads/zzgse;)Lcom/google/android/gms/internal/ads/zzgsc;

    sget-object v4, Lcom/google/android/gms/internal/ads/zzgsd;->zze:Lcom/google/android/gms/internal/ads/zzgsd;

    .line 50
    invoke-virtual {v2, v4}, Lcom/google/android/gms/internal/ads/zzgsc;->zza(Lcom/google/android/gms/internal/ads/zzgsd;)Lcom/google/android/gms/internal/ads/zzgsc;

    .line 51
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzgsc;->zze()Lcom/google/android/gms/internal/ads/zzgsg;

    move-result-object v2

    const-string v4, "HMAC_SHA512_256BITTAG_RAW"

    .line 52
    invoke-interface {v1, v4, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "HMAC_SHA512_512BITTAG"

    sget-object v4, Lcom/google/android/gms/internal/ads/zzgst;->zzd:Lcom/google/android/gms/internal/ads/zzgsg;

    .line 53
    invoke-interface {v1, v2, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, Lcom/google/android/gms/internal/ads/zzgsc;

    invoke-direct {v2, v3}, Lcom/google/android/gms/internal/ads/zzgsc;-><init>(Lcom/google/android/gms/internal/ads/zzgsb;)V

    .line 54
    invoke-virtual {v2, v6}, Lcom/google/android/gms/internal/ads/zzgsc;->zzb(I)Lcom/google/android/gms/internal/ads/zzgsc;

    .line 55
    invoke-virtual {v2, v6}, Lcom/google/android/gms/internal/ads/zzgsc;->zzc(I)Lcom/google/android/gms/internal/ads/zzgsc;

    sget-object v3, Lcom/google/android/gms/internal/ads/zzgse;->zzd:Lcom/google/android/gms/internal/ads/zzgse;

    .line 56
    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/ads/zzgsc;->zzd(Lcom/google/android/gms/internal/ads/zzgse;)Lcom/google/android/gms/internal/ads/zzgsc;

    sget-object v3, Lcom/google/android/gms/internal/ads/zzgsd;->zze:Lcom/google/android/gms/internal/ads/zzgsd;

    .line 57
    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/ads/zzgsc;->zza(Lcom/google/android/gms/internal/ads/zzgsd;)Lcom/google/android/gms/internal/ads/zzgsc;

    .line 58
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzgsc;->zze()Lcom/google/android/gms/internal/ads/zzgsg;

    move-result-object v2

    const-string v3, "HMAC_SHA512_512BITTAG_RAW"

    .line 59
    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    invoke-static {v1}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v1

    .line 8
    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzgph;->zzd(Ljava/util/Map;)V

    .line 61
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzgpb;->zzb()Lcom/google/android/gms/internal/ads/zzgpb;

    move-result-object v0

    sget-object v1, Lcom/google/android/gms/internal/ads/zzgsa;->zze:Lcom/google/android/gms/internal/ads/zzgpa;

    const-class v2, Lcom/google/android/gms/internal/ads/zzgsg;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ads/zzgpb;->zzc(Lcom/google/android/gms/internal/ads/zzgpa;Ljava/lang/Class;)V

    .line 62
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzgpd;->zza()Lcom/google/android/gms/internal/ads/zzgpd;

    move-result-object v0

    sget-object v1, Lcom/google/android/gms/internal/ads/zzgsa;->zzd:Lcom/google/android/gms/internal/ads/zzgpc;

    const-class v2, Lcom/google/android/gms/internal/ads/zzgsg;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ads/zzgpd;->zzb(Lcom/google/android/gms/internal/ads/zzgpc;Ljava/lang/Class;)V

    .line 63
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzgoj;->zzc()Lcom/google/android/gms/internal/ads/zzgoj;

    move-result-object v0

    sget-object v1, Lcom/google/android/gms/internal/ads/zzgsa;->zzc:Lcom/google/android/gms/internal/ads/zzghj;

    const/4 v2, 0x1

    .line 64
    invoke-virtual {v0, v1, p0, v2}, Lcom/google/android/gms/internal/ads/zzgoj;->zzf(Lcom/google/android/gms/internal/ads/zzghj;IZ)V

    return-void

    .line 2
    :cond_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string v0, "Can not use HMAC in FIPS-mode, as BoringCrypto module is not available."

    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
