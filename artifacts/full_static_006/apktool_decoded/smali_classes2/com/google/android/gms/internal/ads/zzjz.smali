.class public final synthetic Lcom/google/android/gms/internal/ads/zzjz;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@23.2.0"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzfe;


# instance fields
.field public final synthetic zza:I

.field public final synthetic zzb:Lcom/google/android/gms/internal/ads/zzcs;

.field public final synthetic zzc:Lcom/google/android/gms/internal/ads/zzcs;


# direct methods
.method public synthetic constructor <init>(ILcom/google/android/gms/internal/ads/zzcs;Lcom/google/android/gms/internal/ads/zzcs;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/google/android/gms/internal/ads/zzjz;->zza:I

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzjz;->zzb:Lcom/google/android/gms/internal/ads/zzcs;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzjz;->zzc:Lcom/google/android/gms/internal/ads/zzcs;

    return-void
.end method


# virtual methods
.method public final zza(Ljava/lang/Object;)V
    .locals 3

    check-cast p1, Lcom/google/android/gms/internal/ads/zzcq;

    sget v0, Lcom/google/android/gms/internal/ads/zzkw;->zzd:I

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzjz;->zzc:Lcom/google/android/gms/internal/ads/zzcs;

    iget v1, p0, Lcom/google/android/gms/internal/ads/zzjz;->zza:I

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzjz;->zzb:Lcom/google/android/gms/internal/ads/zzcs;

    invoke-interface {p1, v2, v0, v1}, Lcom/google/android/gms/internal/ads/zzcq;->zzm(Lcom/google/android/gms/internal/ads/zzcs;Lcom/google/android/gms/internal/ads/zzcs;I)V

    return-void
.end method
