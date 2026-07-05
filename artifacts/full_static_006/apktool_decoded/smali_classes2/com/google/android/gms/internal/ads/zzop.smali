.class public final synthetic Lcom/google/android/gms/internal/ads/zzop;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@23.2.0"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzfe;


# instance fields
.field public final synthetic zza:Lcom/google/android/gms/internal/ads/zzmy;

.field public final synthetic zzb:I

.field public final synthetic zzc:Lcom/google/android/gms/internal/ads/zzcs;

.field public final synthetic zzd:Lcom/google/android/gms/internal/ads/zzcs;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/zzmy;ILcom/google/android/gms/internal/ads/zzcs;Lcom/google/android/gms/internal/ads/zzcs;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzop;->zza:Lcom/google/android/gms/internal/ads/zzmy;

    iput p2, p0, Lcom/google/android/gms/internal/ads/zzop;->zzb:I

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzop;->zzc:Lcom/google/android/gms/internal/ads/zzcs;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/zzop;->zzd:Lcom/google/android/gms/internal/ads/zzcs;

    return-void
.end method


# virtual methods
.method public final zza(Ljava/lang/Object;)V
    .locals 4

    check-cast p1, Lcom/google/android/gms/internal/ads/zzna;

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzop;->zza:Lcom/google/android/gms/internal/ads/zzmy;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzop;->zzd:Lcom/google/android/gms/internal/ads/zzcs;

    iget v2, p0, Lcom/google/android/gms/internal/ads/zzop;->zzb:I

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzop;->zzc:Lcom/google/android/gms/internal/ads/zzcs;

    invoke-interface {p1, v0, v3, v1, v2}, Lcom/google/android/gms/internal/ads/zzna;->zzm(Lcom/google/android/gms/internal/ads/zzmy;Lcom/google/android/gms/internal/ads/zzcs;Lcom/google/android/gms/internal/ads/zzcs;I)V

    return-void
.end method
