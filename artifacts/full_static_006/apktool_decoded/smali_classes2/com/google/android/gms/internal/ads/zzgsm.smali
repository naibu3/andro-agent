.class final Lcom/google/android/gms/internal/ads/zzgsm;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@23.2.0"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzghw;


# instance fields
.field private final zza:Lcom/google/android/gms/internal/ads/zzgqk;

.field private final zzb:Lcom/google/android/gms/internal/ads/zzgtl;

.field private final zzc:Lcom/google/android/gms/internal/ads/zzgtl;


# direct methods
.method synthetic constructor <init>(Lcom/google/android/gms/internal/ads/zzgqk;Lcom/google/android/gms/internal/ads/zzgsl;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzgsm;->zza:Lcom/google/android/gms/internal/ads/zzgqk;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzgqk;->zzg()Z

    move-result p2

    if-eqz p2, :cond_0

    .line 2
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzgpg;->zza()Lcom/google/android/gms/internal/ads/zzgpg;

    move-result-object p2

    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/zzgpg;->zzb()Lcom/google/android/gms/internal/ads/zzgtm;

    move-result-object p2

    .line 3
    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzgoy;->zza(Lcom/google/android/gms/internal/ads/zzgqk;)Lcom/google/android/gms/internal/ads/zzgtr;

    move-result-object p1

    const-string v0, "compute"

    .line 4
    const-string v1, "mac"

    invoke-interface {p2, p1, v1, v0}, Lcom/google/android/gms/internal/ads/zzgtm;->zza(Lcom/google/android/gms/internal/ads/zzgtr;Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzgtl;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzgsm;->zzb:Lcom/google/android/gms/internal/ads/zzgtl;

    const-string v0, "verify"

    .line 5
    invoke-interface {p2, p1, v1, v0}, Lcom/google/android/gms/internal/ads/zzgtm;->zza(Lcom/google/android/gms/internal/ads/zzgtr;Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzgtl;

    move-result-object p1

    :goto_0
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzgsm;->zzc:Lcom/google/android/gms/internal/ads/zzgtl;

    return-void

    :cond_0
    sget-object p1, Lcom/google/android/gms/internal/ads/zzgoy;->zza:Lcom/google/android/gms/internal/ads/zzgtl;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzgsm;->zzb:Lcom/google/android/gms/internal/ads/zzgtl;

    goto :goto_0
.end method
