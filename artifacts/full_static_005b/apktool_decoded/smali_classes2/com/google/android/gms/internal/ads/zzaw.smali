.class public final Lcom/google/android/gms/internal/ads/zzaw;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@23.2.0"


# instance fields
.field private zza:Ljava/lang/String;

.field private zzb:Landroid/net/Uri;

.field private final zzc:Lcom/google/android/gms/internal/ads/zzay;

.field private final zzd:Lcom/google/android/gms/internal/ads/zzbf;

.field private final zze:Ljava/util/List;

.field private final zzf:Lcom/google/android/gms/internal/ads/zzgbc;

.field private final zzg:Lcom/google/android/gms/internal/ads/zzbi;

.field private final zzh:Lcom/google/android/gms/internal/ads/zzbq;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/google/android/gms/internal/ads/zzay;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzay;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzaw;->zzc:Lcom/google/android/gms/internal/ads/zzay;

    new-instance v0, Lcom/google/android/gms/internal/ads/zzbf;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/zzbf;-><init>(Lcom/google/android/gms/internal/ads/zzbe;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzaw;->zzd:Lcom/google/android/gms/internal/ads/zzbf;

    .line 2
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzaw;->zze:Ljava/util/List;

    .line 3
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzgbc;->zzm()Lcom/google/android/gms/internal/ads/zzgbc;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzaw;->zzf:Lcom/google/android/gms/internal/ads/zzgbc;

    new-instance v0, Lcom/google/android/gms/internal/ads/zzbi;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzbi;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzaw;->zzg:Lcom/google/android/gms/internal/ads/zzbi;

    .line 4
    sget-object v0, Lcom/google/android/gms/internal/ads/zzbq;->zza:Lcom/google/android/gms/internal/ads/zzbq;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzaw;->zzh:Lcom/google/android/gms/internal/ads/zzbq;

    return-void
.end method


# virtual methods
.method public final zza(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzaw;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzaw;->zza:Ljava/lang/String;

    return-object p0
.end method

.method public final zzb(Landroid/net/Uri;)Lcom/google/android/gms/internal/ads/zzaw;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzaw;->zzb:Landroid/net/Uri;

    return-object p0
.end method

.method public final zzc()Lcom/google/android/gms/internal/ads/zzbu;
    .locals 23

    move-object/from16 v0, p0

    .line 1
    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzaw;->zzb:Landroid/net/Uri;

    const/4 v13, 0x0

    if-eqz v2, :cond_0

    iget-object v6, v0, Lcom/google/android/gms/internal/ads/zzaw;->zze:Ljava/util/List;

    iget-object v8, v0, Lcom/google/android/gms/internal/ads/zzaw;->zzf:Lcom/google/android/gms/internal/ads/zzgbc;

    new-instance v14, Lcom/google/android/gms/internal/ads/zzbn;

    const-wide v10, -0x7fffffffffffffffL    # -4.9E-324

    const/4 v12, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    move-object v1, v14

    .line 2
    invoke-direct/range {v1 .. v12}, Lcom/google/android/gms/internal/ads/zzbn;-><init>(Landroid/net/Uri;Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzbg;Lcom/google/android/gms/internal/ads/zzav;Ljava/util/List;Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzgbc;Ljava/lang/Object;JLcom/google/android/gms/internal/ads/zzbm;)V

    move-object/from16 v18, v14

    goto :goto_0

    :cond_0
    move-object/from16 v18, v13

    .line 3
    :goto_0
    new-instance v1, Lcom/google/android/gms/internal/ads/zzbu;

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzaw;->zza:Ljava/lang/String;

    if-nez v2, :cond_1

    const-string v2, ""

    :cond_1
    move-object/from16 v16, v2

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzaw;->zzc:Lcom/google/android/gms/internal/ads/zzay;

    .line 4
    new-instance v3, Lcom/google/android/gms/internal/ads/zzbc;

    invoke-direct {v3, v2, v13}, Lcom/google/android/gms/internal/ads/zzbc;-><init>(Lcom/google/android/gms/internal/ads/zzay;Lcom/google/android/gms/internal/ads/zzbb;)V

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzaw;->zzg:Lcom/google/android/gms/internal/ads/zzbi;

    .line 5
    new-instance v4, Lcom/google/android/gms/internal/ads/zzbk;

    invoke-direct {v4, v2, v13}, Lcom/google/android/gms/internal/ads/zzbk;-><init>(Lcom/google/android/gms/internal/ads/zzbi;Lcom/google/android/gms/internal/ads/zzbj;)V

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzaw;->zzh:Lcom/google/android/gms/internal/ads/zzbq;

    .line 6
    sget-object v20, Lcom/google/android/gms/internal/ads/zzca;->zza:Lcom/google/android/gms/internal/ads/zzca;

    const/16 v22, 0x0

    move-object v15, v1

    move-object/from16 v17, v3

    move-object/from16 v19, v4

    move-object/from16 v21, v2

    invoke-direct/range {v15 .. v22}, Lcom/google/android/gms/internal/ads/zzbu;-><init>(Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzbc;Lcom/google/android/gms/internal/ads/zzbn;Lcom/google/android/gms/internal/ads/zzbk;Lcom/google/android/gms/internal/ads/zzca;Lcom/google/android/gms/internal/ads/zzbq;Lcom/google/android/gms/internal/ads/zzbt;)V

    return-object v1
.end method
