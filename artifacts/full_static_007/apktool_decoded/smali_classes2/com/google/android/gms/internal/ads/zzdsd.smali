.class public final Lcom/google/android/gms/internal/ads/zzdsd;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@23.2.0"


# instance fields
.field private final zza:Lcom/google/android/gms/internal/ads/zzchq;

.field private final zzb:Landroid/content/Context;

.field private final zzc:Lcom/google/android/gms/internal/ads/zzaxd;

.field private final zzd:Lcom/google/android/gms/internal/ads/zzbfs;

.field private final zze:Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;

.field private final zzf:Lcom/google/android/gms/ads/internal/zza;

.field private final zzg:Lcom/google/android/gms/internal/ads/zzbdm;

.field private final zzh:Lcom/google/android/gms/internal/ads/zzdca;

.field private final zzi:Lcom/google/android/gms/internal/ads/zzegk;

.field private final zzj:Lcom/google/android/gms/internal/ads/zzfhs;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/zzchq;Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzaxd;Lcom/google/android/gms/internal/ads/zzbfs;Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;Lcom/google/android/gms/ads/internal/zza;Lcom/google/android/gms/internal/ads/zzbdm;Lcom/google/android/gms/internal/ads/zzdca;Lcom/google/android/gms/internal/ads/zzegk;Lcom/google/android/gms/internal/ads/zzfhs;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzdsd;->zza:Lcom/google/android/gms/internal/ads/zzchq;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzdsd;->zzb:Landroid/content/Context;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzdsd;->zzc:Lcom/google/android/gms/internal/ads/zzaxd;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/zzdsd;->zzd:Lcom/google/android/gms/internal/ads/zzbfs;

    iput-object p5, p0, Lcom/google/android/gms/internal/ads/zzdsd;->zze:Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;

    iput-object p6, p0, Lcom/google/android/gms/internal/ads/zzdsd;->zzf:Lcom/google/android/gms/ads/internal/zza;

    iput-object p7, p0, Lcom/google/android/gms/internal/ads/zzdsd;->zzg:Lcom/google/android/gms/internal/ads/zzbdm;

    iput-object p8, p0, Lcom/google/android/gms/internal/ads/zzdsd;->zzh:Lcom/google/android/gms/internal/ads/zzdca;

    iput-object p9, p0, Lcom/google/android/gms/internal/ads/zzdsd;->zzi:Lcom/google/android/gms/internal/ads/zzegk;

    iput-object p10, p0, Lcom/google/android/gms/internal/ads/zzdsd;->zzj:Lcom/google/android/gms/internal/ads/zzfhs;

    return-void
.end method

.method static bridge synthetic zzb(Lcom/google/android/gms/internal/ads/zzdsd;)Lcom/google/android/gms/internal/ads/zzdca;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/zzdsd;->zzh:Lcom/google/android/gms/internal/ads/zzdca;

    return-object p0
.end method


# virtual methods
.method public final zza(Lcom/google/android/gms/ads/internal/client/zzq;Lcom/google/android/gms/internal/ads/zzfgt;Lcom/google/android/gms/internal/ads/zzfgw;)Lcom/google/android/gms/internal/ads/zzchd;
    .locals 17
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/ads/zzchp;
        }
    .end annotation

    move-object/from16 v0, p0

    .line 1
    invoke-static/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/zzcix;->zzc(Lcom/google/android/gms/ads/internal/client/zzq;)Lcom/google/android/gms/internal/ads/zzcix;

    move-result-object v2

    move-object/from16 v1, p1

    iget-object v3, v1, Lcom/google/android/gms/ads/internal/client/zzq;->zza:Ljava/lang/String;

    new-instance v10, Lcom/google/android/gms/internal/ads/zzdrs;

    invoke-direct {v10, v0}, Lcom/google/android/gms/internal/ads/zzdrs;-><init>(Lcom/google/android/gms/internal/ads/zzdsd;)V

    iget-object v15, v0, Lcom/google/android/gms/internal/ads/zzdsd;->zzi:Lcom/google/android/gms/internal/ads/zzegk;

    iget-object v14, v0, Lcom/google/android/gms/internal/ads/zzdsd;->zzj:Lcom/google/android/gms/internal/ads/zzfhs;

    iget-object v11, v0, Lcom/google/android/gms/internal/ads/zzdsd;->zzf:Lcom/google/android/gms/ads/internal/zza;

    iget-object v12, v0, Lcom/google/android/gms/internal/ads/zzdsd;->zzg:Lcom/google/android/gms/internal/ads/zzbdm;

    iget-object v6, v0, Lcom/google/android/gms/internal/ads/zzdsd;->zzc:Lcom/google/android/gms/internal/ads/zzaxd;

    iget-object v7, v0, Lcom/google/android/gms/internal/ads/zzdsd;->zzd:Lcom/google/android/gms/internal/ads/zzbfs;

    iget-object v8, v0, Lcom/google/android/gms/internal/ads/zzdsd;->zze:Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;

    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzdsd;->zzb:Landroid/content/Context;

    const/4 v5, 0x0

    const/4 v9, 0x0

    const/4 v4, 0x0

    move-object/from16 v13, p2

    move-object/from16 v16, v14

    move-object/from16 v14, p3

    .line 2
    invoke-static/range {v1 .. v16}, Lcom/google/android/gms/internal/ads/zzchq;->zza(Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzcix;Ljava/lang/String;ZZLcom/google/android/gms/internal/ads/zzaxd;Lcom/google/android/gms/internal/ads/zzbfs;Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;Lcom/google/android/gms/internal/ads/zzbfe;Lcom/google/android/gms/ads/internal/zzm;Lcom/google/android/gms/ads/internal/zza;Lcom/google/android/gms/internal/ads/zzbdm;Lcom/google/android/gms/internal/ads/zzfgt;Lcom/google/android/gms/internal/ads/zzfgw;Lcom/google/android/gms/internal/ads/zzegk;Lcom/google/android/gms/internal/ads/zzfhs;)Lcom/google/android/gms/internal/ads/zzchd;

    move-result-object v1

    return-object v1
.end method
