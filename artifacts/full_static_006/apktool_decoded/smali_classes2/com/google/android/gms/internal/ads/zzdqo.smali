.class public final Lcom/google/android/gms/internal/ads/zzdqo;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@23.2.0"


# instance fields
.field private final zza:Lcom/google/android/gms/internal/ads/zzczj;

.field private final zzb:Lcom/google/android/gms/internal/ads/zzdas;

.field private final zzc:Lcom/google/android/gms/internal/ads/zzdbf;

.field private final zzd:Lcom/google/android/gms/internal/ads/zzdbr;

.field private final zze:Lcom/google/android/gms/internal/ads/zzdef;

.field private final zzf:Lcom/google/android/gms/internal/ads/zzfgt;

.field private final zzg:Lcom/google/android/gms/internal/ads/zzfgw;

.field private final zzh:Lcom/google/android/gms/internal/ads/zzcqd;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/zzczj;Lcom/google/android/gms/internal/ads/zzdas;Lcom/google/android/gms/internal/ads/zzdbf;Lcom/google/android/gms/internal/ads/zzdbr;Lcom/google/android/gms/internal/ads/zzdef;Lcom/google/android/gms/internal/ads/zzfgt;Lcom/google/android/gms/internal/ads/zzfgw;Lcom/google/android/gms/internal/ads/zzcqd;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzdqo;->zza:Lcom/google/android/gms/internal/ads/zzczj;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzdqo;->zzb:Lcom/google/android/gms/internal/ads/zzdas;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzdqo;->zzc:Lcom/google/android/gms/internal/ads/zzdbf;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/zzdqo;->zzd:Lcom/google/android/gms/internal/ads/zzdbr;

    iput-object p5, p0, Lcom/google/android/gms/internal/ads/zzdqo;->zze:Lcom/google/android/gms/internal/ads/zzdef;

    iput-object p6, p0, Lcom/google/android/gms/internal/ads/zzdqo;->zzf:Lcom/google/android/gms/internal/ads/zzfgt;

    iput-object p7, p0, Lcom/google/android/gms/internal/ads/zzdqo;->zzg:Lcom/google/android/gms/internal/ads/zzfgw;

    iput-object p8, p0, Lcom/google/android/gms/internal/ads/zzdqo;->zzh:Lcom/google/android/gms/internal/ads/zzcqd;

    return-void
.end method


# virtual methods
.method public final zza(Lcom/google/android/gms/internal/ads/zzdqs;)V
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzdqo;->zzb:Lcom/google/android/gms/internal/ads/zzdas;

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzdqs;->zzb(Lcom/google/android/gms/internal/ads/zzdqs;)Lcom/google/android/gms/internal/ads/zzdqf;

    move-result-object v1

    .line 2
    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v6, Lcom/google/android/gms/internal/ads/zzdqn;

    invoke-direct {v6, v0}, Lcom/google/android/gms/internal/ads/zzdqn;-><init>(Lcom/google/android/gms/internal/ads/zzdas;)V

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzdqo;->zza:Lcom/google/android/gms/internal/ads/zzczj;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzdqo;->zzc:Lcom/google/android/gms/internal/ads/zzdbf;

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/zzdqo;->zzd:Lcom/google/android/gms/internal/ads/zzdbr;

    iget-object v5, p0, Lcom/google/android/gms/internal/ads/zzdqo;->zze:Lcom/google/android/gms/internal/ads/zzdef;

    .line 1
    invoke-virtual/range {v1 .. v6}, Lcom/google/android/gms/internal/ads/zzdqf;->zzh(Lcom/google/android/gms/ads/internal/client/zza;Lcom/google/android/gms/internal/ads/zzbkf;Lcom/google/android/gms/ads/internal/overlay/zzp;Lcom/google/android/gms/internal/ads/zzbkh;Lcom/google/android/gms/ads/internal/overlay/zzaa;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzdqo;->zzf:Lcom/google/android/gms/internal/ads/zzfgt;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzdqo;->zzg:Lcom/google/android/gms/internal/ads/zzfgw;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzdqo;->zzh:Lcom/google/android/gms/internal/ads/zzcqd;

    .line 3
    invoke-virtual {p1, v0, v1, v2}, Lcom/google/android/gms/internal/ads/zzdqs;->zzh(Lcom/google/android/gms/internal/ads/zzfgt;Lcom/google/android/gms/internal/ads/zzfgw;Lcom/google/android/gms/internal/ads/zzcqd;)V

    return-void
.end method
