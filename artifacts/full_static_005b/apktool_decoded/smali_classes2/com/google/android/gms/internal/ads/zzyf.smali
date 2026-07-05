.class public final synthetic Lcom/google/android/gms/internal/ads/zzyf;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@23.2.0"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzyz;


# instance fields
.field public final synthetic zza:Lcom/google/android/gms/internal/ads/zzze;

.field public final synthetic zzb:Lcom/google/android/gms/internal/ads/zzys;

.field public final synthetic zzc:Z

.field public final synthetic zzd:[I


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/zzze;Lcom/google/android/gms/internal/ads/zzys;Z[I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzyf;->zza:Lcom/google/android/gms/internal/ads/zzze;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzyf;->zzb:Lcom/google/android/gms/internal/ads/zzys;

    iput-boolean p3, p0, Lcom/google/android/gms/internal/ads/zzyf;->zzc:Z

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/zzyf;->zzd:[I

    return-void
.end method


# virtual methods
.method public final zza(ILcom/google/android/gms/internal/ads/zzde;[I)Ljava/util/List;
    .locals 16

    move-object/from16 v0, p0

    .line 1
    new-instance v10, Lcom/google/android/gms/internal/ads/zzyc;

    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzyf;->zza:Lcom/google/android/gms/internal/ads/zzze;

    invoke-direct {v10, v1}, Lcom/google/android/gms/internal/ads/zzyc;-><init>(Lcom/google/android/gms/internal/ads/zzze;)V

    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzyf;->zzd:[I

    aget v11, v1, p1

    .line 2
    new-instance v12, Lcom/google/android/gms/internal/ads/zzgaz;

    invoke-direct {v12}, Lcom/google/android/gms/internal/ads/zzgaz;-><init>()V

    const/4 v1, 0x0

    move-object/from16 v14, p2

    move v13, v1

    .line 3
    :goto_0
    iget v1, v14, Lcom/google/android/gms/internal/ads/zzde;->zzb:I

    if-ge v13, v1, :cond_0

    iget-boolean v7, v0, Lcom/google/android/gms/internal/ads/zzyf;->zzc:Z

    iget-object v5, v0, Lcom/google/android/gms/internal/ads/zzyf;->zzb:Lcom/google/android/gms/internal/ads/zzys;

    new-instance v15, Lcom/google/android/gms/internal/ads/zzyl;

    .line 4
    aget v6, p3, v13

    move-object v1, v15

    move/from16 v2, p1

    move-object/from16 v3, p2

    move v4, v13

    move-object v8, v10

    move v9, v11

    invoke-direct/range {v1 .. v9}, Lcom/google/android/gms/internal/ads/zzyl;-><init>(ILcom/google/android/gms/internal/ads/zzde;ILcom/google/android/gms/internal/ads/zzys;IZLcom/google/android/gms/internal/ads/zzfyh;I)V

    invoke-virtual {v12, v15}, Lcom/google/android/gms/internal/ads/zzgaz;->zzf(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/zzgaz;

    add-int/lit8 v13, v13, 0x1

    goto :goto_0

    .line 5
    :cond_0
    invoke-virtual {v12}, Lcom/google/android/gms/internal/ads/zzgaz;->zzi()Lcom/google/android/gms/internal/ads/zzgbc;

    move-result-object v1

    return-object v1
.end method
