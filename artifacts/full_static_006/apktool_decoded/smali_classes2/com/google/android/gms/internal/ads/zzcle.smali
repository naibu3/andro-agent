.class final Lcom/google/android/gms/internal/ads/zzcle;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@23.2.0"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzcrs;


# instance fields
.field private final zza:Lcom/google/android/gms/internal/ads/zzcla;

.field private zzb:Lcom/google/android/gms/internal/ads/zzfeo;

.field private zzc:Lcom/google/android/gms/internal/ads/zzfdr;

.field private zzd:Lcom/google/android/gms/internal/ads/zzdfc;

.field private zze:Lcom/google/android/gms/internal/ads/zzcyv;


# direct methods
.method synthetic constructor <init>(Lcom/google/android/gms/internal/ads/zzcla;Lcom/google/android/gms/internal/ads/zzcld;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzcle;->zza:Lcom/google/android/gms/internal/ads/zzcla;

    return-void
.end method


# virtual methods
.method public final synthetic zza(Lcom/google/android/gms/internal/ads/zzfdr;)Lcom/google/android/gms/internal/ads/zzcyr;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzcle;->zzc:Lcom/google/android/gms/internal/ads/zzfdr;

    return-object p0
.end method

.method public final synthetic zzb(Lcom/google/android/gms/internal/ads/zzfeo;)Lcom/google/android/gms/internal/ads/zzcyr;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzcle;->zzb:Lcom/google/android/gms/internal/ads/zzfeo;

    return-object p0
.end method

.method public final synthetic zzc(Lcom/google/android/gms/internal/ads/zzdfc;)Lcom/google/android/gms/internal/ads/zzcrs;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzcle;->zzd:Lcom/google/android/gms/internal/ads/zzdfc;

    return-object p0
.end method

.method public final synthetic zzd(Lcom/google/android/gms/internal/ads/zzcyv;)Lcom/google/android/gms/internal/ads/zzcrs;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzcle;->zze:Lcom/google/android/gms/internal/ads/zzcyv;

    return-object p0
.end method

.method public final zze()Lcom/google/android/gms/internal/ads/zzcrt;
    .locals 15

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzcle;->zzd:Lcom/google/android/gms/internal/ads/zzdfc;

    const-class v1, Lcom/google/android/gms/internal/ads/zzdfc;

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/zzhkx;->zzc(Ljava/lang/Object;Ljava/lang/Class;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzcle;->zze:Lcom/google/android/gms/internal/ads/zzcyv;

    const-class v1, Lcom/google/android/gms/internal/ads/zzcyv;

    .line 2
    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/zzhkx;->zzc(Ljava/lang/Object;Ljava/lang/Class;)V

    new-instance v0, Lcom/google/android/gms/internal/ads/zzclg;

    new-instance v4, Lcom/google/android/gms/internal/ads/zzcvz;

    invoke-direct {v4}, Lcom/google/android/gms/internal/ads/zzcvz;-><init>()V

    new-instance v5, Lcom/google/android/gms/internal/ads/zzfiu;

    invoke-direct {v5}, Lcom/google/android/gms/internal/ads/zzfiu;-><init>()V

    new-instance v6, Lcom/google/android/gms/internal/ads/zzcxy;

    invoke-direct {v6}, Lcom/google/android/gms/internal/ads/zzcxy;-><init>()V

    new-instance v7, Lcom/google/android/gms/internal/ads/zzdvq;

    invoke-direct {v7}, Lcom/google/android/gms/internal/ads/zzdvq;-><init>()V

    iget-object v8, p0, Lcom/google/android/gms/internal/ads/zzcle;->zzd:Lcom/google/android/gms/internal/ads/zzdfc;

    iget-object v9, p0, Lcom/google/android/gms/internal/ads/zzcle;->zze:Lcom/google/android/gms/internal/ads/zzcyv;

    invoke-static {}, Lcom/google/android/gms/internal/ads/zzelq;->zza()Lcom/google/android/gms/internal/ads/zzelo;

    move-result-object v10

    iget-object v12, p0, Lcom/google/android/gms/internal/ads/zzcle;->zzb:Lcom/google/android/gms/internal/ads/zzfeo;

    iget-object v13, p0, Lcom/google/android/gms/internal/ads/zzcle;->zzc:Lcom/google/android/gms/internal/ads/zzfdr;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzcle;->zza:Lcom/google/android/gms/internal/ads/zzcla;

    const/4 v11, 0x0

    const/4 v14, 0x0

    move-object v2, v0

    .line 3
    invoke-direct/range {v2 .. v14}, Lcom/google/android/gms/internal/ads/zzclg;-><init>(Lcom/google/android/gms/internal/ads/zzcla;Lcom/google/android/gms/internal/ads/zzcvz;Lcom/google/android/gms/internal/ads/zzfiu;Lcom/google/android/gms/internal/ads/zzcxy;Lcom/google/android/gms/internal/ads/zzdvq;Lcom/google/android/gms/internal/ads/zzdfc;Lcom/google/android/gms/internal/ads/zzcyv;Lcom/google/android/gms/internal/ads/zzelo;Lcom/google/android/gms/internal/ads/zzfhf;Lcom/google/android/gms/internal/ads/zzfeo;Lcom/google/android/gms/internal/ads/zzfdr;Lcom/google/android/gms/internal/ads/zzclf;)V

    return-object v0
.end method

.method public final bridge synthetic zzh()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzcle;->zze()Lcom/google/android/gms/internal/ads/zzcrt;

    move-result-object v0

    return-object v0
.end method
