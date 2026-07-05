.class public final Lcom/google/android/gms/internal/ads/zzclw;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@23.2.0"


# instance fields
.field private zza:Lcom/google/android/gms/internal/ads/zzcjg;

.field private zzb:Lcom/google/android/gms/internal/ads/zzcnj;

.field private zzc:Lcom/google/android/gms/internal/ads/zzflx;

.field private zzd:Lcom/google/android/gms/internal/ads/zzcnv;

.field private zze:Lcom/google/android/gms/internal/ads/zzfir;


# direct methods
.method private constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    throw v0
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/internal/ads/zzclv;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final zza()Lcom/google/android/gms/internal/ads/zzcjd;
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzclw;->zza:Lcom/google/android/gms/internal/ads/zzcjg;

    const-class v1, Lcom/google/android/gms/internal/ads/zzcjg;

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/zzhkx;->zzc(Ljava/lang/Object;Ljava/lang/Class;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzclw;->zzb:Lcom/google/android/gms/internal/ads/zzcnj;

    const-class v1, Lcom/google/android/gms/internal/ads/zzcnj;

    .line 2
    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/zzhkx;->zzc(Ljava/lang/Object;Ljava/lang/Class;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzclw;->zzc:Lcom/google/android/gms/internal/ads/zzflx;

    if-nez v0, :cond_0

    new-instance v0, Lcom/google/android/gms/internal/ads/zzflx;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzflx;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzclw;->zzc:Lcom/google/android/gms/internal/ads/zzflx;

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzclw;->zzd:Lcom/google/android/gms/internal/ads/zzcnv;

    if-nez v0, :cond_1

    new-instance v0, Lcom/google/android/gms/internal/ads/zzcnv;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzcnv;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzclw;->zzd:Lcom/google/android/gms/internal/ads/zzcnv;

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzclw;->zze:Lcom/google/android/gms/internal/ads/zzfir;

    if-nez v0, :cond_2

    new-instance v0, Lcom/google/android/gms/internal/ads/zzfir;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzfir;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzclw;->zze:Lcom/google/android/gms/internal/ads/zzfir;

    :cond_2
    new-instance v0, Lcom/google/android/gms/internal/ads/zzcla;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzclw;->zza:Lcom/google/android/gms/internal/ads/zzcjg;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzclw;->zzb:Lcom/google/android/gms/internal/ads/zzcnj;

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/zzclw;->zzc:Lcom/google/android/gms/internal/ads/zzflx;

    iget-object v5, p0, Lcom/google/android/gms/internal/ads/zzclw;->zzd:Lcom/google/android/gms/internal/ads/zzcnv;

    iget-object v6, p0, Lcom/google/android/gms/internal/ads/zzclw;->zze:Lcom/google/android/gms/internal/ads/zzfir;

    const/4 v7, 0x0

    move-object v1, v0

    .line 3
    invoke-direct/range {v1 .. v7}, Lcom/google/android/gms/internal/ads/zzcla;-><init>(Lcom/google/android/gms/internal/ads/zzcjg;Lcom/google/android/gms/internal/ads/zzcnj;Lcom/google/android/gms/internal/ads/zzflx;Lcom/google/android/gms/internal/ads/zzcnv;Lcom/google/android/gms/internal/ads/zzfir;Lcom/google/android/gms/internal/ads/zzckz;)V

    return-object v0
.end method

.method public final zzb(Lcom/google/android/gms/internal/ads/zzcjg;)Lcom/google/android/gms/internal/ads/zzclw;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzclw;->zza:Lcom/google/android/gms/internal/ads/zzcjg;

    return-object p0
.end method

.method public final zzc(Lcom/google/android/gms/internal/ads/zzcnj;)Lcom/google/android/gms/internal/ads/zzclw;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzclw;->zzb:Lcom/google/android/gms/internal/ads/zzcnj;

    return-object p0
.end method
