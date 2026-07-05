.class public final synthetic Lcom/google/android/gms/internal/ads/zzkb;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@23.2.0"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzfe;


# instance fields
.field public final synthetic zza:Lcom/google/android/gms/internal/ads/zzbu;

.field public final synthetic zzb:I


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/zzbu;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzkb;->zza:Lcom/google/android/gms/internal/ads/zzbu;

    iput p2, p0, Lcom/google/android/gms/internal/ads/zzkb;->zzb:I

    return-void
.end method


# virtual methods
.method public final zza(Ljava/lang/Object;)V
    .locals 2

    check-cast p1, Lcom/google/android/gms/internal/ads/zzcq;

    sget v0, Lcom/google/android/gms/internal/ads/zzkw;->zzd:I

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzkb;->zza:Lcom/google/android/gms/internal/ads/zzbu;

    iget v1, p0, Lcom/google/android/gms/internal/ads/zzkb;->zzb:I

    invoke-interface {p1, v0, v1}, Lcom/google/android/gms/internal/ads/zzcq;->zzd(Lcom/google/android/gms/internal/ads/zzbu;I)V

    return-void
.end method
