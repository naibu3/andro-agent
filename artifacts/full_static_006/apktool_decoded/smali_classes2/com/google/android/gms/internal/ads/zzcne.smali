.class final Lcom/google/android/gms/internal/ads/zzcne;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@23.2.0"

# interfaces
.implements Lcom/google/android/gms/ads/nonagon/signalgeneration/zzq;


# instance fields
.field private final zza:Lcom/google/android/gms/internal/ads/zzcla;

.field private zzb:Lcom/google/android/gms/internal/ads/zzcyv;

.field private zzc:Lcom/google/android/gms/ads/nonagon/signalgeneration/zzao;


# direct methods
.method synthetic constructor <init>(Lcom/google/android/gms/internal/ads/zzcla;Lcom/google/android/gms/internal/ads/zzcnd;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzcne;->zza:Lcom/google/android/gms/internal/ads/zzcla;

    return-void
.end method


# virtual methods
.method public final synthetic zza(Lcom/google/android/gms/internal/ads/zzcyv;)Lcom/google/android/gms/ads/nonagon/signalgeneration/zzq;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzcne;->zzb:Lcom/google/android/gms/internal/ads/zzcyv;

    return-object p0
.end method

.method public final synthetic zzb(Lcom/google/android/gms/ads/nonagon/signalgeneration/zzao;)Lcom/google/android/gms/ads/nonagon/signalgeneration/zzq;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzcne;->zzc:Lcom/google/android/gms/ads/nonagon/signalgeneration/zzao;

    return-object p0
.end method

.method public final zzc()Lcom/google/android/gms/ads/nonagon/signalgeneration/zzr;
    .locals 12

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzcne;->zzb:Lcom/google/android/gms/internal/ads/zzcyv;

    const-class v1, Lcom/google/android/gms/internal/ads/zzcyv;

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/zzhkx;->zzc(Ljava/lang/Object;Ljava/lang/Class;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzcne;->zzc:Lcom/google/android/gms/ads/nonagon/signalgeneration/zzao;

    const-class v1, Lcom/google/android/gms/ads/nonagon/signalgeneration/zzao;

    .line 2
    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/zzhkx;->zzc(Ljava/lang/Object;Ljava/lang/Class;)V

    new-instance v0, Lcom/google/android/gms/internal/ads/zzcng;

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/zzcne;->zzc:Lcom/google/android/gms/ads/nonagon/signalgeneration/zzao;

    new-instance v5, Lcom/google/android/gms/internal/ads/zzcvz;

    invoke-direct {v5}, Lcom/google/android/gms/internal/ads/zzcvz;-><init>()V

    new-instance v6, Lcom/google/android/gms/internal/ads/zzcxy;

    invoke-direct {v6}, Lcom/google/android/gms/internal/ads/zzcxy;-><init>()V

    new-instance v7, Lcom/google/android/gms/internal/ads/zzdvq;

    invoke-direct {v7}, Lcom/google/android/gms/internal/ads/zzdvq;-><init>()V

    iget-object v8, p0, Lcom/google/android/gms/internal/ads/zzcne;->zzb:Lcom/google/android/gms/internal/ads/zzcyv;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzcne;->zza:Lcom/google/android/gms/internal/ads/zzcla;

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v9, 0x0

    move-object v2, v0

    .line 3
    invoke-direct/range {v2 .. v11}, Lcom/google/android/gms/internal/ads/zzcng;-><init>(Lcom/google/android/gms/internal/ads/zzcla;Lcom/google/android/gms/ads/nonagon/signalgeneration/zzao;Lcom/google/android/gms/internal/ads/zzcvz;Lcom/google/android/gms/internal/ads/zzcxy;Lcom/google/android/gms/internal/ads/zzdvq;Lcom/google/android/gms/internal/ads/zzcyv;Lcom/google/android/gms/internal/ads/zzfeo;Lcom/google/android/gms/internal/ads/zzfdr;Lcom/google/android/gms/internal/ads/zzcnf;)V

    return-object v0
.end method
