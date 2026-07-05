.class public final Lcom/google/android/gms/internal/ads/zzfsd;
.super Lcom/google/android/gms/internal/ads/zzhbo;
.source "com.google.android.gms:play-services-ads@@23.2.0"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzhdf;


# static fields
.field private static final zza:Lcom/google/android/gms/internal/ads/zzhbx;

.field private static final zzb:Lcom/google/android/gms/internal/ads/zzfsd;

.field private static volatile zzc:Lcom/google/android/gms/internal/ads/zzhdm;


# instance fields
.field private zzd:I

.field private zze:Lcom/google/android/gms/internal/ads/zzhbw;

.field private zzf:Ljava/lang/String;

.field private zzg:Ljava/lang/String;

.field private zzh:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/ads/zzfry;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzfry;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ads/zzfsd;->zza:Lcom/google/android/gms/internal/ads/zzhbx;

    new-instance v0, Lcom/google/android/gms/internal/ads/zzfsd;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzfsd;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ads/zzfsd;->zzb:Lcom/google/android/gms/internal/ads/zzfsd;

    const-class v1, Lcom/google/android/gms/internal/ads/zzfsd;

    .line 2
    invoke-static {v1, v0}, Lcom/google/android/gms/internal/ads/zzhbo;->zzca(Ljava/lang/Class;Lcom/google/android/gms/internal/ads/zzhbo;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzhbo;-><init>()V

    .line 2
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzfsd;->zzbG()Lcom/google/android/gms/internal/ads/zzhbw;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzfsd;->zze:Lcom/google/android/gms/internal/ads/zzhbw;

    const-string v0, ""

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzfsd;->zzf:Ljava/lang/String;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzfsd;->zzg:Ljava/lang/String;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzfsd;->zzh:Ljava/lang/String;

    return-void
.end method

.method public static zza()Lcom/google/android/gms/internal/ads/zzfsc;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/ads/zzfsd;->zzb:Lcom/google/android/gms/internal/ads/zzfsd;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzhbo;->zzaZ()Lcom/google/android/gms/internal/ads/zzhbi;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/zzfsc;

    return-object v0
.end method

.method static synthetic zzc()Lcom/google/android/gms/internal/ads/zzfsd;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/ads/zzfsd;->zzb:Lcom/google/android/gms/internal/ads/zzfsd;

    return-object v0
.end method

.method static synthetic zzd(Lcom/google/android/gms/internal/ads/zzfsd;Lcom/google/android/gms/internal/ads/zzfsb;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfsd;->zze:Lcom/google/android/gms/internal/ads/zzhbw;

    .line 2
    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzhbw;->zzc()Z

    move-result v1

    if-nez v1, :cond_0

    .line 3
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzhbo;->zzbH(Lcom/google/android/gms/internal/ads/zzhbw;)Lcom/google/android/gms/internal/ads/zzhbw;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzfsd;->zze:Lcom/google/android/gms/internal/ads/zzhbw;

    :cond_0
    iget-object p0, p0, Lcom/google/android/gms/internal/ads/zzfsd;->zze:Lcom/google/android/gms/internal/ads/zzhbw;

    .line 4
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzfsb;->zza()I

    move-result p1

    invoke-interface {p0, p1}, Lcom/google/android/gms/internal/ads/zzhbw;->zzi(I)V

    return-void
.end method

.method static synthetic zze(Lcom/google/android/gms/internal/ads/zzfsd;Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzfsd;->zzd:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzfsd;->zzd:I

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzfsd;->zzf:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method protected final zzde(Lcom/google/android/gms/internal/ads/zzhbn;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    sget-object p2, Lcom/google/android/gms/internal/ads/zzhbn;->zza:Lcom/google/android/gms/internal/ads/zzhbn;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzhbn;->ordinal()I

    move-result p1

    const/4 p2, 0x0

    packed-switch p1, :pswitch_data_0

    .line 8
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 9
    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1

    .line 1
    :pswitch_0
    sget-object p1, Lcom/google/android/gms/internal/ads/zzfsd;->zzc:Lcom/google/android/gms/internal/ads/zzhdm;

    if-nez p1, :cond_1

    const-class p2, Lcom/google/android/gms/internal/ads/zzfsd;

    monitor-enter p2

    :try_start_0
    sget-object p1, Lcom/google/android/gms/internal/ads/zzfsd;->zzc:Lcom/google/android/gms/internal/ads/zzhdm;

    if-nez p1, :cond_0

    .line 3
    new-instance p1, Lcom/google/android/gms/internal/ads/zzhbj;

    sget-object p3, Lcom/google/android/gms/internal/ads/zzfsd;->zzb:Lcom/google/android/gms/internal/ads/zzfsd;

    invoke-direct {p1, p3}, Lcom/google/android/gms/internal/ads/zzhbj;-><init>(Lcom/google/android/gms/internal/ads/zzhbo;)V

    sput-object p1, Lcom/google/android/gms/internal/ads/zzfsd;->zzc:Lcom/google/android/gms/internal/ads/zzhdm;

    .line 4
    :cond_0
    monitor-exit p2

    goto :goto_0

    :catchall_0
    move-exception p1

    monitor-exit p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    :cond_1
    :goto_0
    return-object p1

    .line 2
    :pswitch_1
    sget-object p1, Lcom/google/android/gms/internal/ads/zzfsd;->zzb:Lcom/google/android/gms/internal/ads/zzfsd;

    return-object p1

    .line 6
    :pswitch_2
    new-instance p1, Lcom/google/android/gms/internal/ads/zzfsc;

    .line 7
    invoke-direct {p1, p2}, Lcom/google/android/gms/internal/ads/zzfsc;-><init>(Lcom/google/android/gms/internal/ads/zzfry;)V

    return-object p1

    :pswitch_3
    new-instance p1, Lcom/google/android/gms/internal/ads/zzfsd;

    .line 8
    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/zzfsd;-><init>()V

    return-object p1

    .line 2
    :pswitch_4
    const-string v0, "zzd"

    const-string v1, "zze"

    .line 5
    sget-object v2, Lcom/google/android/gms/internal/ads/zzfsa;->zza:Lcom/google/android/gms/internal/ads/zzhbu;

    const-string v3, "zzf"

    const-string v4, "zzg"

    const-string v5, "zzh"

    filled-new-array/range {v0 .. v5}, [Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lcom/google/android/gms/internal/ads/zzfsd;->zzb:Lcom/google/android/gms/internal/ads/zzfsd;

    const-string p3, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u081e\u0002\u1008\u0000\u0003\u1008\u0001\u0004\u1008\u0002"

    .line 6
    invoke-static {p2, p3, p1}, Lcom/google/android/gms/internal/ads/zzfsd;->zzbR(Lcom/google/android/gms/internal/ads/zzhde;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_5
    return-object p2

    :pswitch_6
    const/4 p1, 0x1

    .line 2
    invoke-static {p1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
