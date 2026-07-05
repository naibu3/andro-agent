.class final Lcom/google/android/gms/internal/ads/zzcap;
.super Lcom/google/android/gms/internal/ads/zzcav;
.source "com.google.android.gms:play-services-ads@@23.2.0"


# instance fields
.field private final zzb:Lcom/google/android/gms/common/util/Clock;

.field private final zzc:Lcom/google/android/gms/internal/ads/zzcap;

.field private final zzd:Lcom/google/android/gms/internal/ads/zzhky;

.field private final zze:Lcom/google/android/gms/internal/ads/zzhky;

.field private final zzf:Lcom/google/android/gms/internal/ads/zzhky;

.field private final zzg:Lcom/google/android/gms/internal/ads/zzhky;

.field private final zzh:Lcom/google/android/gms/internal/ads/zzhky;

.field private final zzi:Lcom/google/android/gms/internal/ads/zzhky;

.field private final zzj:Lcom/google/android/gms/internal/ads/zzhky;

.field private final zzk:Lcom/google/android/gms/internal/ads/zzhky;


# direct methods
.method synthetic constructor <init>(Landroid/content/Context;Lcom/google/android/gms/common/util/Clock;Lcom/google/android/gms/ads/internal/util/zzg;Lcom/google/android/gms/internal/ads/zzcau;Lcom/google/android/gms/internal/ads/zzcao;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzcav;-><init>()V

    iput-object p0, p0, Lcom/google/android/gms/internal/ads/zzcap;->zzc:Lcom/google/android/gms/internal/ads/zzcap;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzcap;->zzb:Lcom/google/android/gms/common/util/Clock;

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzhkq;->zza(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/zzhkp;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzcap;->zzd:Lcom/google/android/gms/internal/ads/zzhky;

    .line 2
    invoke-static {p3}, Lcom/google/android/gms/internal/ads/zzhkq;->zza(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/zzhkp;

    move-result-object p3

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzcap;->zze:Lcom/google/android/gms/internal/ads/zzhky;

    new-instance p5, Lcom/google/android/gms/internal/ads/zzcah;

    invoke-direct {p5, p1, p3}, Lcom/google/android/gms/internal/ads/zzcah;-><init>(Lcom/google/android/gms/internal/ads/zzhlg;Lcom/google/android/gms/internal/ads/zzhlg;)V

    invoke-static {p5}, Lcom/google/android/gms/internal/ads/zzhko;->zzc(Lcom/google/android/gms/internal/ads/zzhky;)Lcom/google/android/gms/internal/ads/zzhky;

    move-result-object p5

    iput-object p5, p0, Lcom/google/android/gms/internal/ads/zzcap;->zzf:Lcom/google/android/gms/internal/ads/zzhky;

    .line 3
    invoke-static {p2}, Lcom/google/android/gms/internal/ads/zzhkq;->zza(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/zzhkp;

    move-result-object p2

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzcap;->zzg:Lcom/google/android/gms/internal/ads/zzhky;

    .line 4
    invoke-static {p4}, Lcom/google/android/gms/internal/ads/zzhkq;->zza(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/zzhkp;

    move-result-object p4

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/zzcap;->zzh:Lcom/google/android/gms/internal/ads/zzhky;

    new-instance p5, Lcom/google/android/gms/internal/ads/zzcaj;

    invoke-direct {p5, p2, p3, p4}, Lcom/google/android/gms/internal/ads/zzcaj;-><init>(Lcom/google/android/gms/internal/ads/zzhlg;Lcom/google/android/gms/internal/ads/zzhlg;Lcom/google/android/gms/internal/ads/zzhlg;)V

    invoke-static {p5}, Lcom/google/android/gms/internal/ads/zzhko;->zzc(Lcom/google/android/gms/internal/ads/zzhky;)Lcom/google/android/gms/internal/ads/zzhky;

    move-result-object p3

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzcap;->zzi:Lcom/google/android/gms/internal/ads/zzhky;

    new-instance p4, Lcom/google/android/gms/internal/ads/zzcal;

    invoke-direct {p4, p2, p3}, Lcom/google/android/gms/internal/ads/zzcal;-><init>(Lcom/google/android/gms/internal/ads/zzhlg;Lcom/google/android/gms/internal/ads/zzhlg;)V

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/zzcap;->zzj:Lcom/google/android/gms/internal/ads/zzhky;

    new-instance p2, Lcom/google/android/gms/internal/ads/zzcba;

    invoke-direct {p2, p1, p4}, Lcom/google/android/gms/internal/ads/zzcba;-><init>(Lcom/google/android/gms/internal/ads/zzhlg;Lcom/google/android/gms/internal/ads/zzhlg;)V

    invoke-static {p2}, Lcom/google/android/gms/internal/ads/zzhko;->zzc(Lcom/google/android/gms/internal/ads/zzhky;)Lcom/google/android/gms/internal/ads/zzhky;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzcap;->zzk:Lcom/google/android/gms/internal/ads/zzhky;

    return-void
.end method


# virtual methods
.method final zza()Lcom/google/android/gms/internal/ads/zzcag;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzcap;->zzf:Lcom/google/android/gms/internal/ads/zzhky;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzhky;->zzb()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/zzcag;

    return-object v0
.end method

.method final zzb()Lcom/google/android/gms/internal/ads/zzcak;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzcap;->zzi:Lcom/google/android/gms/internal/ads/zzhky;

    new-instance v1, Lcom/google/android/gms/internal/ads/zzcak;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzhky;->zzb()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/zzcai;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzcap;->zzb:Lcom/google/android/gms/common/util/Clock;

    invoke-direct {v1, v2, v0}, Lcom/google/android/gms/internal/ads/zzcak;-><init>(Lcom/google/android/gms/common/util/Clock;Lcom/google/android/gms/internal/ads/zzcai;)V

    return-object v1
.end method

.method final zzc()Lcom/google/android/gms/internal/ads/zzcaz;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzcap;->zzk:Lcom/google/android/gms/internal/ads/zzhky;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzhky;->zzb()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/zzcaz;

    return-object v0
.end method
