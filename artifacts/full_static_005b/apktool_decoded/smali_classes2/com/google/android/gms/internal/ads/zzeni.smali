.class final Lcom/google/android/gms/internal/ads/zzeni;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@23.2.0"

# interfaces
.implements Lcom/google/android/gms/ads/internal/zzg;


# instance fields
.field final synthetic zza:Lcom/google/android/gms/internal/ads/zzccn;

.field final synthetic zzb:Lcom/google/android/gms/internal/ads/zzfhf;

.field final synthetic zzc:Lcom/google/android/gms/internal/ads/zzfgt;

.field final synthetic zzd:Lcom/google/android/gms/internal/ads/zzeno;

.field final synthetic zze:Lcom/google/android/gms/internal/ads/zzenj;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/zzenj;Lcom/google/android/gms/internal/ads/zzccn;Lcom/google/android/gms/internal/ads/zzfhf;Lcom/google/android/gms/internal/ads/zzfgt;Lcom/google/android/gms/internal/ads/zzeno;)V
    .locals 0

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzeni;->zza:Lcom/google/android/gms/internal/ads/zzccn;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzeni;->zzb:Lcom/google/android/gms/internal/ads/zzfhf;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/zzeni;->zzc:Lcom/google/android/gms/internal/ads/zzfgt;

    iput-object p5, p0, Lcom/google/android/gms/internal/ads/zzeni;->zzd:Lcom/google/android/gms/internal/ads/zzeno;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzeni;->zze:Lcom/google/android/gms/internal/ads/zzenj;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final zza(Landroid/view/View;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzeni;->zzd:Lcom/google/android/gms/internal/ads/zzeno;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzeni;->zze:Lcom/google/android/gms/internal/ads/zzenj;

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/zzenj;->zzd(Lcom/google/android/gms/internal/ads/zzenj;)Lcom/google/android/gms/internal/ads/zzens;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzeni;->zzb:Lcom/google/android/gms/internal/ads/zzfhf;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzeni;->zzc:Lcom/google/android/gms/internal/ads/zzfgt;

    invoke-virtual {v1, v2, v3, p1, v0}, Lcom/google/android/gms/internal/ads/zzens;->zza(Lcom/google/android/gms/internal/ads/zzfhf;Lcom/google/android/gms/internal/ads/zzfgt;Landroid/view/View;Lcom/google/android/gms/internal/ads/zzeno;)Ljava/lang/Object;

    move-result-object p1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzeni;->zza:Lcom/google/android/gms/internal/ads/zzccn;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/zzccn;->zzc(Ljava/lang/Object;)Z

    return-void
.end method

.method public final zzb()V
    .locals 0

    return-void
.end method

.method public final zzc()V
    .locals 0

    return-void
.end method
