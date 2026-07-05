.class public final synthetic Lcom/google/android/gms/internal/ads/zzbpq;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@23.2.0"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic zza:Lcom/google/android/gms/internal/ads/zzbpr;

.field public final synthetic zzb:Lcom/google/android/gms/internal/ads/zzboo;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/zzbpr;Lcom/google/android/gms/internal/ads/zzboo;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzbpq;->zza:Lcom/google/android/gms/internal/ads/zzbpr;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzbpq;->zzb:Lcom/google/android/gms/internal/ads/zzboo;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbpq;->zzb:Lcom/google/android/gms/internal/ads/zzboo;

    const-string v1, "/result"

    sget-object v2, Lcom/google/android/gms/internal/ads/zzblo;->zzo:Lcom/google/android/gms/internal/ads/zzbmf;

    invoke-interface {v0, v1, v2}, Lcom/google/android/gms/internal/ads/zzboo;->zzr(Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzblp;)V

    .line 2
    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzboo;->zzc()V

    return-void
.end method
