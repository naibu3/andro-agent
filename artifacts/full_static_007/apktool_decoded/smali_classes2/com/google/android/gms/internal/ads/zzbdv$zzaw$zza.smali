.class public final Lcom/google/android/gms/internal/ads/zzbdv$zzaw$zza;
.super Lcom/google/android/gms/internal/ads/zzhbi;
.source "com.google.android.gms:play-services-ads@@23.2.0"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzbdv$zzax;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/ads/zzhbi<",
        "Lcom/google/android/gms/internal/ads/zzbdv$zzaw;",
        "Lcom/google/android/gms/internal/ads/zzbdv$zzaw$zza;",
        ">;",
        "Lcom/google/android/gms/internal/ads/zzbdv$zzax;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 1
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzbdv$zzaw;->zzf()Lcom/google/android/gms/internal/ads/zzbdv$zzaw;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/zzhbi;-><init>(Lcom/google/android/gms/internal/ads/zzhbo;)V

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/internal/ads/zzbdv$1;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzbdv$zzaw$zza;-><init>()V

    return-void
.end method


# virtual methods
.method public zza()Lcom/google/android/gms/internal/ads/zzbdv$zzaw$zza;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzhbi;->zzbu()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbdv$zzaw$zza;->zza:Lcom/google/android/gms/internal/ads/zzhbo;

    .line 2
    check-cast v0, Lcom/google/android/gms/internal/ads/zzbdv$zzaw;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzbdv$zzaw;->zzv(Lcom/google/android/gms/internal/ads/zzbdv$zzaw;)V

    return-object p0
.end method

.method public zzb(Lcom/google/android/gms/internal/ads/zzbdv$zzaw$zzb;)Lcom/google/android/gms/internal/ads/zzbdv$zzaw$zza;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzhbi;->zzbu()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbdv$zzaw$zza;->zza:Lcom/google/android/gms/internal/ads/zzhbo;

    .line 2
    check-cast v0, Lcom/google/android/gms/internal/ads/zzbdv$zzaw;

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/ads/zzbdv$zzaw;->zzu(Lcom/google/android/gms/internal/ads/zzbdv$zzaw;Lcom/google/android/gms/internal/ads/zzbdv$zzaw$zzb;)V

    return-object p0
.end method

.method public zzc()Lcom/google/android/gms/internal/ads/zzbdv$zzaw$zzb;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbdv$zzaw$zza;->zza:Lcom/google/android/gms/internal/ads/zzhbo;

    check-cast v0, Lcom/google/android/gms/internal/ads/zzbdv$zzaw;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzbdv$zzaw;->zzc()Lcom/google/android/gms/internal/ads/zzbdv$zzaw$zzb;

    move-result-object v0

    return-object v0
.end method

.method public zzd()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbdv$zzaw$zza;->zza:Lcom/google/android/gms/internal/ads/zzhbo;

    check-cast v0, Lcom/google/android/gms/internal/ads/zzbdv$zzaw;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzbdv$zzaw;->zzd()Z

    move-result v0

    return v0
.end method
