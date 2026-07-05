.class public final Lcom/google/android/gms/internal/ads/zzgkv;
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
    new-instance v0, Lcom/google/android/gms/internal/ads/zzgkt;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzgkt;-><init>()V

    const-class v1, Lcom/google/android/gms/internal/ads/zzgla;

    const-class v2, Lcom/google/android/gms/internal/ads/zzggy;

    invoke-static {v0, v1, v2}, Lcom/google/android/gms/internal/ads/zzgpy;->zzb(Lcom/google/android/gms/internal/ads/zzgpw;Ljava/lang/Class;Ljava/lang/Class;)Lcom/google/android/gms/internal/ads/zzgpy;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/ads/zzgkv;->zzb:Lcom/google/android/gms/internal/ads/zzgpy;

    const-class v0, Lcom/google/android/gms/internal/ads/zzggy;

    sget-object v1, Lcom/google/android/gms/internal/ads/zzgwg;->zze:Lcom/google/android/gms/internal/ads/zzgwg;

    invoke-static {}, Lcom/google/android/gms/internal/ads/zzgxc;->zzg()Lcom/google/android/gms/internal/ads/zzhdm;

    move-result-object v2

    const-string v3, "type.googleapis.com/google.crypto.tink.KmsAeadKey"

    invoke-static {v3, v0, v1, v2}, Lcom/google/android/gms/internal/ads/zzgos;->zzd(Ljava/lang/String;Ljava/lang/Class;Lcom/google/android/gms/internal/ads/zzgwg;Lcom/google/android/gms/internal/ads/zzhdm;)Lcom/google/android/gms/internal/ads/zzghj;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/ads/zzgkv;->zzc:Lcom/google/android/gms/internal/ads/zzghj;

    new-instance v0, Lcom/google/android/gms/internal/ads/zzgku;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzgku;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ads/zzgkv;->zzd:Lcom/google/android/gms/internal/ads/zzgpa;

    return-void
.end method

.method public static zza(Z)V
    .locals 3
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
    sget v0, Lcom/google/android/gms/internal/ads/zzglh;->zza:I

    .line 4
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzgpl;->zzc()Lcom/google/android/gms/internal/ads/zzgpl;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzglh;->zze(Lcom/google/android/gms/internal/ads/zzgpl;)V

    .line 5
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzgpi;->zza()Lcom/google/android/gms/internal/ads/zzgpi;

    move-result-object v0

    sget-object v1, Lcom/google/android/gms/internal/ads/zzgkv;->zzb:Lcom/google/android/gms/internal/ads/zzgpy;

    .line 6
    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzgpi;->zze(Lcom/google/android/gms/internal/ads/zzgpy;)V

    .line 7
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzgpb;->zzb()Lcom/google/android/gms/internal/ads/zzgpb;

    move-result-object v0

    sget-object v1, Lcom/google/android/gms/internal/ads/zzgkv;->zzd:Lcom/google/android/gms/internal/ads/zzgpa;

    const-class v2, Lcom/google/android/gms/internal/ads/zzglc;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ads/zzgpb;->zzc(Lcom/google/android/gms/internal/ads/zzgpa;Ljava/lang/Class;)V

    .line 8
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzgoj;->zzc()Lcom/google/android/gms/internal/ads/zzgoj;

    move-result-object v0

    sget-object v1, Lcom/google/android/gms/internal/ads/zzgkv;->zzc:Lcom/google/android/gms/internal/ads/zzghj;

    invoke-virtual {v0, v1, p0}, Lcom/google/android/gms/internal/ads/zzgoj;->zzd(Lcom/google/android/gms/internal/ads/zzghj;Z)V

    return-void

    .line 2
    :cond_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string v0, "Registering KMS AEAD is not supported in FIPS mode"

    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
