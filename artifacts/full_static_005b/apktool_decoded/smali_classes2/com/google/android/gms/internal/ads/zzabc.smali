.class public final Lcom/google/android/gms/internal/ads/zzabc;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@23.2.0"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzacn;
.implements Lcom/google/android/gms/internal/ads/zzdt;
.implements Lcom/google/android/gms/internal/ads/zzabv;


# static fields
.field private static final zza:Ljava/util/concurrent/Executor;


# instance fields
.field private final zzb:Landroid/content/Context;

.field private final zzc:Lcom/google/android/gms/internal/ads/zzaba;

.field private final zzd:Lcom/google/android/gms/internal/ads/zzcu;

.field private final zze:Ljava/util/concurrent/CopyOnWriteArraySet;

.field private zzf:Lcom/google/android/gms/internal/ads/zzer;

.field private zzg:Lcom/google/android/gms/internal/ads/zzabq;

.field private zzh:Lcom/google/android/gms/internal/ads/zzabw;

.field private zzi:Lcom/google/android/gms/internal/ads/zzan;

.field private zzj:Lcom/google/android/gms/internal/ads/zzabn;

.field private zzk:Lcom/google/android/gms/internal/ads/zzfb;

.field private zzl:Lcom/google/android/gms/internal/ads/zzcv;

.field private zzm:Landroid/util/Pair;

.field private zzn:I

.field private zzo:I

.field private zzp:F


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/ads/zzaao;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzaao;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ads/zzabc;->zza:Ljava/util/concurrent/Executor;

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/internal/ads/zzaar;Lcom/google/android/gms/internal/ads/zzabb;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzaar;->zza(Lcom/google/android/gms/internal/ads/zzaar;)Landroid/content/Context;

    move-result-object p2

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzabc;->zzb:Landroid/content/Context;

    new-instance v0, Lcom/google/android/gms/internal/ads/zzaba;

    invoke-direct {v0, p0, p2}, Lcom/google/android/gms/internal/ads/zzaba;-><init>(Lcom/google/android/gms/internal/ads/zzabc;Landroid/content/Context;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzabc;->zzc:Lcom/google/android/gms/internal/ads/zzaba;

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzaar;->zzb(Lcom/google/android/gms/internal/ads/zzaar;)Lcom/google/android/gms/internal/ads/zzcu;

    move-result-object p1

    .line 2
    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzeq;->zzb(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzabc;->zzd:Lcom/google/android/gms/internal/ads/zzcu;

    .line 3
    new-instance p1, Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-direct {p1}, Ljava/util/concurrent/CopyOnWriteArraySet;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzabc;->zze:Ljava/util/concurrent/CopyOnWriteArraySet;

    const/4 p2, 0x0

    iput p2, p0, Lcom/google/android/gms/internal/ads/zzabc;->zzo:I

    const/high16 p2, 0x3f800000    # 1.0f

    iput p2, p0, Lcom/google/android/gms/internal/ads/zzabc;->zzp:F

    .line 4
    invoke-virtual {p1, v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method static bridge synthetic zza(Lcom/google/android/gms/internal/ads/zzt;)Lcom/google/android/gms/internal/ads/zzt;
    .locals 0

    invoke-static {p0}, Lcom/google/android/gms/internal/ads/zzabc;->zzu(Lcom/google/android/gms/internal/ads/zzt;)Lcom/google/android/gms/internal/ads/zzt;

    move-result-object p0

    return-object p0
.end method

.method static bridge synthetic zzb(Lcom/google/android/gms/internal/ads/zzabc;Lcom/google/android/gms/internal/ads/zzan;Lcom/google/android/gms/internal/ads/zzer;)Lcom/google/android/gms/internal/ads/zzds;
    .locals 11

    .line 1
    iget v0, p0, Lcom/google/android/gms/internal/ads/zzabc;->zzo:I

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzeq;->zzf(Z)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzabc;->zzh:Lcom/google/android/gms/internal/ads/zzabw;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzabc;->zzg:Lcom/google/android/gms/internal/ads/zzabq;

    if-eqz v0, :cond_1

    goto :goto_1

    :cond_1
    move v1, v2

    .line 2
    :goto_1
    invoke-static {v1}, Lcom/google/android/gms/internal/ads/zzeq;->zzf(Z)V

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzabc;->zzf:Lcom/google/android/gms/internal/ads/zzer;

    .line 3
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzeq;->zzb(Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v1, 0x0

    invoke-interface {p2, v0, v1}, Lcom/google/android/gms/internal/ads/zzer;->zzb(Landroid/os/Looper;Landroid/os/Handler$Callback;)Lcom/google/android/gms/internal/ads/zzfb;

    move-result-object p2

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzabc;->zzk:Lcom/google/android/gms/internal/ads/zzfb;

    iget-object p2, p1, Lcom/google/android/gms/internal/ads/zzan;->zzz:Lcom/google/android/gms/internal/ads/zzt;

    .line 4
    invoke-static {p2}, Lcom/google/android/gms/internal/ads/zzabc;->zzu(Lcom/google/android/gms/internal/ads/zzt;)Lcom/google/android/gms/internal/ads/zzt;

    move-result-object p2

    .line 5
    iget v0, p2, Lcom/google/android/gms/internal/ads/zzt;->zzf:I

    const/4 v2, 0x7

    if-ne v0, v2, :cond_2

    sget v0, Lcom/google/android/gms/internal/ads/zzgd;->zza:I

    const/16 v2, 0x22

    if-ge v0, v2, :cond_2

    .line 6
    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/zzt;->zzc()Lcom/google/android/gms/internal/ads/zzr;

    move-result-object p2

    const/4 v0, 0x6

    invoke-virtual {p2, v0}, Lcom/google/android/gms/internal/ads/zzr;->zzd(I)Lcom/google/android/gms/internal/ads/zzr;

    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/zzr;->zzg()Lcom/google/android/gms/internal/ads/zzt;

    move-result-object p2

    :cond_2
    move-object v4, p2

    :try_start_0
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzabc;->zzd:Lcom/google/android/gms/internal/ads/zzcu;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzabc;->zzb:Landroid/content/Context;

    sget-object v5, Lcom/google/android/gms/internal/ads/zzw;->zza:Lcom/google/android/gms/internal/ads/zzw;

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/zzabc;->zzk:Lcom/google/android/gms/internal/ads/zzfb;

    .line 7
    invoke-static {p2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v7, Lcom/google/android/gms/internal/ads/zzaap;

    invoke-direct {v7, p2}, Lcom/google/android/gms/internal/ads/zzaap;-><init>(Lcom/google/android/gms/internal/ads/zzfb;)V

    .line 8
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzgbc;->zzm()Lcom/google/android/gms/internal/ads/zzgbc;

    move-result-object v8

    const-wide/16 v9, 0x0

    move-object v6, p0

    .line 9
    invoke-interface/range {v2 .. v10}, Lcom/google/android/gms/internal/ads/zzcu;->zza(Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzt;Lcom/google/android/gms/internal/ads/zzw;Lcom/google/android/gms/internal/ads/zzdt;Ljava/util/concurrent/Executor;Ljava/util/List;J)Lcom/google/android/gms/internal/ads/zzcv;

    move-result-object p2

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzabc;->zzl:Lcom/google/android/gms/internal/ads/zzcv;

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/zzabc;->zzm:Landroid/util/Pair;

    if-eqz p2, :cond_3

    .line 10
    iget-object p2, p2, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast p2, Landroid/view/Surface;

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/zzabc;->zzm:Landroid/util/Pair;

    .line 11
    iget-object p0, p0, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast p0, Lcom/google/android/gms/internal/ads/zzfv;

    .line 12
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzfv;->zzb()I

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzfv;->zza()I

    .line 13
    :cond_3
    throw v1
    :try_end_0
    .catch Lcom/google/android/gms/internal/ads/zzdq; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception p0

    new-instance p2, Lcom/google/android/gms/internal/ads/zzacl;

    .line 14
    invoke-direct {p2, p0, p1}, Lcom/google/android/gms/internal/ads/zzacl;-><init>(Ljava/lang/Throwable;Lcom/google/android/gms/internal/ads/zzan;)V

    throw p2
.end method

.method static bridge synthetic zze()Ljava/util/concurrent/Executor;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/ads/zzabc;->zza:Ljava/util/concurrent/Executor;

    return-object v0
.end method

.method public static synthetic zzf(Lcom/google/android/gms/internal/ads/zzabc;)V
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/android/gms/internal/ads/zzabc;->zzn:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzabc;->zzn:I

    if-lez v0, :cond_0

    return-void

    :cond_0
    if-ltz v0, :cond_1

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/zzabc;->zzh:Lcom/google/android/gms/internal/ads/zzabw;

    .line 2
    invoke-static {p0}, Lcom/google/android/gms/internal/ads/zzeq;->zzb(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzabw;->zza()V

    return-void

    .line 1
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method static bridge synthetic zzg(Lcom/google/android/gms/internal/ads/zzabc;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzabc;->zzv()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget v0, p0, Lcom/google/android/gms/internal/ads/zzabc;->zzn:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzabc;->zzn:I

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzabc;->zzh:Lcom/google/android/gms/internal/ads/zzabw;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzeq;->zzb(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzabw;->zza()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzabc;->zzk:Lcom/google/android/gms/internal/ads/zzfb;

    .line 2
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzeq;->zzb(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Lcom/google/android/gms/internal/ads/zzaaq;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/ads/zzaaq;-><init>(Lcom/google/android/gms/internal/ads/zzabc;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ads/zzfb;->zzh(Ljava/lang/Runnable;)Z

    return-void
.end method

.method static bridge synthetic zzh(Lcom/google/android/gms/internal/ads/zzabc;JJ)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/gms/internal/ads/zzabc;->zzh:Lcom/google/android/gms/internal/ads/zzabw;

    invoke-static {p0}, Lcom/google/android/gms/internal/ads/zzeq;->zzb(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/google/android/gms/internal/ads/zzabw;->zzb(JJ)V

    return-void
.end method

.method static bridge synthetic zzi(Lcom/google/android/gms/internal/ads/zzabc;F)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/google/android/gms/internal/ads/zzabc;->zzp:F

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/zzabc;->zzh:Lcom/google/android/gms/internal/ads/zzabw;

    if-eqz p0, :cond_0

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/ads/zzabw;->zzd(F)V

    :cond_0
    return-void
.end method

.method static synthetic zzj(Lcom/google/android/gms/internal/ads/zzabc;Lcom/google/android/gms/internal/ads/zzabn;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzabc;->zzj:Lcom/google/android/gms/internal/ads/zzabn;

    return-void
.end method

.method static bridge synthetic zzt(Lcom/google/android/gms/internal/ads/zzabc;J)Z
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/android/gms/internal/ads/zzabc;->zzn:I

    if-nez v0, :cond_0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/zzabc;->zzh:Lcom/google/android/gms/internal/ads/zzabw;

    invoke-static {p0}, Lcom/google/android/gms/internal/ads/zzeq;->zzb(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/internal/ads/zzabw;->zze(J)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method private static zzu(Lcom/google/android/gms/internal/ads/zzt;)Lcom/google/android/gms/internal/ads/zzt;
    .locals 1

    if-eqz p0, :cond_1

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzt;->zzf()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    return-object p0

    :cond_1
    :goto_0
    sget-object p0, Lcom/google/android/gms/internal/ads/zzt;->zza:Lcom/google/android/gms/internal/ads/zzt;

    return-object p0
.end method

.method private final zzv()Z
    .locals 2

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzabc;->zzo:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    return v0
.end method


# virtual methods
.method public final zzc()Lcom/google/android/gms/internal/ads/zzabq;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzabc;->zzg:Lcom/google/android/gms/internal/ads/zzabq;

    return-object v0
.end method

.method public final zzd()Lcom/google/android/gms/internal/ads/zzacm;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzabc;->zzc:Lcom/google/android/gms/internal/ads/zzaba;

    return-object v0
.end method

.method public final zzk()V
    .locals 1

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/ads/zzfv;->zza:Lcom/google/android/gms/internal/ads/zzfv;

    .line 2
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzfv;->zzb()I

    sget-object v0, Lcom/google/android/gms/internal/ads/zzfv;->zza:Lcom/google/android/gms/internal/ads/zzfv;

    .line 3
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzfv;->zza()I

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzabc;->zzm:Landroid/util/Pair;

    return-void
.end method

.method public final zzl()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzabc;->zze:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/ads/zzaas;

    .line 2
    invoke-interface {v1, p0}, Lcom/google/android/gms/internal/ads/zzaas;->zzb(Lcom/google/android/gms/internal/ads/zzabc;)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 3
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzeq;->zzb(Ljava/lang/Object;)Ljava/lang/Object;

    throw v0
.end method

.method public final zzm(Lcom/google/android/gms/internal/ads/zzdv;)V
    .locals 2

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/ads/zzal;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzal;-><init>()V

    iget v1, p1, Lcom/google/android/gms/internal/ads/zzdv;->zzc:I

    .line 2
    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzal;->zzac(I)Lcom/google/android/gms/internal/ads/zzal;

    iget v1, p1, Lcom/google/android/gms/internal/ads/zzdv;->zzd:I

    .line 3
    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzal;->zzI(I)Lcom/google/android/gms/internal/ads/zzal;

    const-string v1, "video/raw"

    .line 4
    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzal;->zzX(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzal;

    .line 5
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzal;->zzad()Lcom/google/android/gms/internal/ads/zzan;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzabc;->zzi:Lcom/google/android/gms/internal/ads/zzan;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzabc;->zze:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 6
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/ads/zzaas;

    .line 7
    invoke-interface {v1, p0, p1}, Lcom/google/android/gms/internal/ads/zzaas;->zzc(Lcom/google/android/gms/internal/ads/zzabc;Lcom/google/android/gms/internal/ads/zzdv;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final zzn()V
    .locals 3

    .line 1
    iget v0, p0, Lcom/google/android/gms/internal/ads/zzabc;->zzo:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzabc;->zzk:Lcom/google/android/gms/internal/ads/zzfb;

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    invoke-interface {v0, v2}, Lcom/google/android/gms/internal/ads/zzfb;->zze(Ljava/lang/Object;)V

    :cond_1
    iput-object v2, p0, Lcom/google/android/gms/internal/ads/zzabc;->zzm:Landroid/util/Pair;

    iput v1, p0, Lcom/google/android/gms/internal/ads/zzabc;->zzo:I

    return-void
.end method

.method public final zzo(JJ)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/ads/zzjh;
        }
    .end annotation

    .line 1
    iget v0, p0, Lcom/google/android/gms/internal/ads/zzabc;->zzn:I

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzabc;->zzh:Lcom/google/android/gms/internal/ads/zzabw;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzeq;->zzb(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0, p1, p2, p3, p4}, Lcom/google/android/gms/internal/ads/zzabw;->zzc(JJ)V

    :cond_0
    return-void
.end method

.method public final zzp(JJJZ)V
    .locals 7

    if-eqz p7, :cond_0

    .line 1
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzabc;->zzm:Landroid/util/Pair;

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzabc;->zze:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {p1}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/google/android/gms/internal/ads/zzaas;

    .line 2
    invoke-interface {p2, p0}, Lcom/google/android/gms/internal/ads/zzaas;->zza(Lcom/google/android/gms/internal/ads/zzabc;)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzabc;->zzj:Lcom/google/android/gms/internal/ads/zzabn;

    if-eqz p1, :cond_2

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzabc;->zzi:Lcom/google/android/gms/internal/ads/zzan;

    if-nez p1, :cond_1

    new-instance p1, Lcom/google/android/gms/internal/ads/zzal;

    .line 3
    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/zzal;-><init>()V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzal;->zzad()Lcom/google/android/gms/internal/ads/zzan;

    move-result-object p1

    :cond_1
    move-object v5, p1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzabc;->zzj:Lcom/google/android/gms/internal/ads/zzabn;

    sub-long v1, p3, p5

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzabc;->zzf:Lcom/google/android/gms/internal/ads/zzer;

    .line 4
    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzeq;->zzb(Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v3

    const/4 v6, 0x0

    .line 6
    invoke-interface/range {v0 .. v6}, Lcom/google/android/gms/internal/ads/zzabn;->zza(JJLcom/google/android/gms/internal/ads/zzan;Landroid/media/MediaFormat;)V

    :cond_2
    const/4 p1, 0x0

    .line 7
    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzeq;->zzb(Ljava/lang/Object;)Ljava/lang/Object;

    throw p1
.end method

.method public final zzq(Landroid/view/Surface;Lcom/google/android/gms/internal/ads/zzfv;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzabc;->zzm:Landroid/util/Pair;

    if-eqz v0, :cond_0

    iget-object v0, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v0, Landroid/view/Surface;

    .line 2
    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzabc;->zzm:Landroid/util/Pair;

    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v0, Lcom/google/android/gms/internal/ads/zzfv;

    .line 3
    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/ads/zzfv;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 4
    :cond_0
    invoke-static {p1, p2}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzabc;->zzm:Landroid/util/Pair;

    .line 5
    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/zzfv;->zzb()I

    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/zzfv;->zza()I

    return-void
.end method

.method public final zzr(Ljava/util/List;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzabc;->zzc:Lcom/google/android/gms/internal/ads/zzaba;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/zzaba;->zzk(Ljava/util/List;)V

    return-void
.end method

.method public final zzs(Lcom/google/android/gms/internal/ads/zzabq;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzabc;->zzv()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzeq;->zzf(Z)V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzabc;->zzg:Lcom/google/android/gms/internal/ads/zzabq;

    new-instance v0, Lcom/google/android/gms/internal/ads/zzabw;

    .line 2
    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/ads/zzabw;-><init>(Lcom/google/android/gms/internal/ads/zzabv;Lcom/google/android/gms/internal/ads/zzabq;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzabc;->zzh:Lcom/google/android/gms/internal/ads/zzabw;

    iget p1, p0, Lcom/google/android/gms/internal/ads/zzabc;->zzp:F

    .line 3
    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/zzabw;->zzd(F)V

    return-void
.end method
