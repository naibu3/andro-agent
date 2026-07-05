.class final Lcom/google/android/gms/internal/ads/zzclu;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@23.2.0"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzfdi;


# instance fields
.field private final zza:Landroid/content/Context;

.field private final zzb:Lcom/google/android/gms/ads/internal/client/zzq;

.field private final zzc:Ljava/lang/String;

.field private final zzd:Lcom/google/android/gms/internal/ads/zzcla;

.field private final zze:Lcom/google/android/gms/internal/ads/zzclu;

.field private final zzf:Lcom/google/android/gms/internal/ads/zzhky;

.field private final zzg:Lcom/google/android/gms/internal/ads/zzhky;

.field private final zzh:Lcom/google/android/gms/internal/ads/zzhky;

.field private final zzi:Lcom/google/android/gms/internal/ads/zzhky;

.field private final zzj:Lcom/google/android/gms/internal/ads/zzhky;

.field private final zzk:Lcom/google/android/gms/internal/ads/zzhky;


# direct methods
.method synthetic constructor <init>(Lcom/google/android/gms/internal/ads/zzcla;Landroid/content/Context;Ljava/lang/String;Lcom/google/android/gms/ads/internal/client/zzq;Lcom/google/android/gms/internal/ads/zzclt;)V
    .locals 9

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p0, p0, Lcom/google/android/gms/internal/ads/zzclu;->zze:Lcom/google/android/gms/internal/ads/zzclu;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzclu;->zzd:Lcom/google/android/gms/internal/ads/zzcla;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzclu;->zza:Landroid/content/Context;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/zzclu;->zzb:Lcom/google/android/gms/ads/internal/client/zzq;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzclu;->zzc:Ljava/lang/String;

    invoke-static {p2}, Lcom/google/android/gms/internal/ads/zzhkq;->zza(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/zzhkp;

    move-result-object v1

    iput-object v1, p0, Lcom/google/android/gms/internal/ads/zzclu;->zzf:Lcom/google/android/gms/internal/ads/zzhky;

    .line 2
    invoke-static {p4}, Lcom/google/android/gms/internal/ads/zzhkq;->zza(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/zzhkp;

    move-result-object v3

    iput-object v3, p0, Lcom/google/android/gms/internal/ads/zzclu;->zzg:Lcom/google/android/gms/internal/ads/zzhky;

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzcla;->zzV(Lcom/google/android/gms/internal/ads/zzcla;)Lcom/google/android/gms/internal/ads/zzhky;

    move-result-object p2

    new-instance p3, Lcom/google/android/gms/internal/ads/zzepd;

    invoke-direct {p3, p2}, Lcom/google/android/gms/internal/ads/zzepd;-><init>(Lcom/google/android/gms/internal/ads/zzhlg;)V

    invoke-static {p3}, Lcom/google/android/gms/internal/ads/zzhko;->zzc(Lcom/google/android/gms/internal/ads/zzhky;)Lcom/google/android/gms/internal/ads/zzhky;

    move-result-object v5

    iput-object v5, p0, Lcom/google/android/gms/internal/ads/zzclu;->zzh:Lcom/google/android/gms/internal/ads/zzhky;

    invoke-static {}, Lcom/google/android/gms/internal/ads/zzepi;->zza()Lcom/google/android/gms/internal/ads/zzepi;

    move-result-object p2

    invoke-static {p2}, Lcom/google/android/gms/internal/ads/zzhko;->zzc(Lcom/google/android/gms/internal/ads/zzhky;)Lcom/google/android/gms/internal/ads/zzhky;

    move-result-object v6

    iput-object v6, p0, Lcom/google/android/gms/internal/ads/zzclu;->zzi:Lcom/google/android/gms/internal/ads/zzhky;

    invoke-static {}, Lcom/google/android/gms/internal/ads/zzdej;->zza()Lcom/google/android/gms/internal/ads/zzdej;

    move-result-object p2

    invoke-static {p2}, Lcom/google/android/gms/internal/ads/zzhko;->zzc(Lcom/google/android/gms/internal/ads/zzhky;)Lcom/google/android/gms/internal/ads/zzhky;

    move-result-object v8

    iput-object v8, p0, Lcom/google/android/gms/internal/ads/zzclu;->zzj:Lcom/google/android/gms/internal/ads/zzhky;

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzcla;->zzP(Lcom/google/android/gms/internal/ads/zzcla;)Lcom/google/android/gms/internal/ads/zzhky;

    move-result-object v2

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzcla;->zzL(Lcom/google/android/gms/internal/ads/zzcla;)Lcom/google/android/gms/internal/ads/zzhky;

    move-result-object v4

    invoke-static {}, Lcom/google/android/gms/internal/ads/zzfhq;->zza()Lcom/google/android/gms/internal/ads/zzfhq;

    move-result-object v7

    new-instance p1, Lcom/google/android/gms/internal/ads/zzfdg;

    move-object v0, p1

    invoke-direct/range {v0 .. v8}, Lcom/google/android/gms/internal/ads/zzfdg;-><init>(Lcom/google/android/gms/internal/ads/zzhlg;Lcom/google/android/gms/internal/ads/zzhlg;Lcom/google/android/gms/internal/ads/zzhlg;Lcom/google/android/gms/internal/ads/zzhlg;Lcom/google/android/gms/internal/ads/zzhlg;Lcom/google/android/gms/internal/ads/zzhlg;Lcom/google/android/gms/internal/ads/zzhlg;Lcom/google/android/gms/internal/ads/zzhlg;)V

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzhko;->zzc(Lcom/google/android/gms/internal/ads/zzhky;)Lcom/google/android/gms/internal/ads/zzhky;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzclu;->zzk:Lcom/google/android/gms/internal/ads/zzhky;

    return-void
.end method


# virtual methods
.method public final zza()Lcom/google/android/gms/internal/ads/zzeoi;
    .locals 10

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzclu;->zzk:Lcom/google/android/gms/internal/ads/zzhky;

    new-instance v9, Lcom/google/android/gms/internal/ads/zzeoi;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzhky;->zzb()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/google/android/gms/internal/ads/zzfdf;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzclu;->zzh:Lcom/google/android/gms/internal/ads/zzhky;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzhky;->zzb()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/google/android/gms/internal/ads/zzepc;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzclu;->zzd:Lcom/google/android/gms/internal/ads/zzcla;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzcla;->zzE(Lcom/google/android/gms/internal/ads/zzcla;)Lcom/google/android/gms/internal/ads/zzcjg;

    move-result-object v0

    .line 2
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzcjg;->zze()Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;

    move-result-object v7

    invoke-static {v7}, Lcom/google/android/gms/internal/ads/zzhkx;->zzb(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzclu;->zzd:Lcom/google/android/gms/internal/ads/zzcla;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzcla;->zzV(Lcom/google/android/gms/internal/ads/zzcla;)Lcom/google/android/gms/internal/ads/zzhky;

    move-result-object v0

    .line 1
    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzhky;->zzb()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lcom/google/android/gms/internal/ads/zzdvc;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzclu;->zza:Landroid/content/Context;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzclu;->zzb:Lcom/google/android/gms/ads/internal/client/zzq;

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/zzclu;->zzc:Ljava/lang/String;

    move-object v1, v9

    invoke-direct/range {v1 .. v8}, Lcom/google/android/gms/internal/ads/zzeoi;-><init>(Landroid/content/Context;Lcom/google/android/gms/ads/internal/client/zzq;Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzfdf;Lcom/google/android/gms/internal/ads/zzepc;Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;Lcom/google/android/gms/internal/ads/zzdvc;)V

    return-object v9
.end method
