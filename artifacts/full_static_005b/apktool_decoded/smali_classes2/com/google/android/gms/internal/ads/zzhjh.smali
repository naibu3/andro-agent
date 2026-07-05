.class public final Lcom/google/android/gms/internal/ads/zzhjh;
.super Lcom/google/android/gms/internal/ads/zzhbo;
.source "com.google.android.gms:play-services-ads@@23.2.0"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzhdf;


# static fields
.field private static final zza:Lcom/google/android/gms/internal/ads/zzhjh;

.field private static volatile zzb:Lcom/google/android/gms/internal/ads/zzhdm;


# instance fields
.field private zzA:Lcom/google/android/gms/internal/ads/zzhca;

.field private zzB:Lcom/google/android/gms/internal/ads/zzhca;

.field private zzC:Lcom/google/android/gms/internal/ads/zzhjb;

.field private zzD:Lcom/google/android/gms/internal/ads/zzhca;

.field private zzE:Lcom/google/android/gms/internal/ads/zzhgt;

.field private zzF:Ljava/lang/String;

.field private zzG:Lcom/google/android/gms/internal/ads/zzhgj;

.field private zzH:Lcom/google/android/gms/internal/ads/zzhca;

.field private zzI:Lcom/google/android/gms/internal/ads/zzhhs;

.field private zzJ:I

.field private zzK:Lcom/google/android/gms/internal/ads/zzhca;

.field private zzL:Lcom/google/android/gms/internal/ads/zzhca;

.field private zzM:J

.field private zzN:Lcom/google/android/gms/internal/ads/zzhjg;

.field private zzO:Lcom/google/android/gms/internal/ads/zzhhz;

.field private zzP:B

.field private zzc:I

.field private zzd:I

.field private zze:I

.field private zzf:Ljava/lang/String;

.field private zzg:Ljava/lang/String;

.field private zzh:Ljava/lang/String;

.field private zzi:Lcom/google/android/gms/internal/ads/zzhgp;

.field private zzj:Lcom/google/android/gms/internal/ads/zzhca;

.field private zzk:Lcom/google/android/gms/internal/ads/zzhca;

.field private zzl:Ljava/lang/String;

.field private zzm:Lcom/google/android/gms/internal/ads/zzhij;

.field private zzn:Z

.field private zzo:Lcom/google/android/gms/internal/ads/zzhca;

.field private zzp:Ljava/lang/String;

.field private zzu:Z

.field private zzv:Z

.field private zzw:Lcom/google/android/gms/internal/ads/zzhac;

.field private zzx:Lcom/google/android/gms/internal/ads/zzhit;

.field private zzy:Z

.field private zzz:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/ads/zzhjh;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzhjh;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ads/zzhjh;->zza:Lcom/google/android/gms/internal/ads/zzhjh;

    const-class v1, Lcom/google/android/gms/internal/ads/zzhjh;

    .line 2
    invoke-static {v1, v0}, Lcom/google/android/gms/internal/ads/zzhbo;->zzca(Ljava/lang/Class;Lcom/google/android/gms/internal/ads/zzhbo;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzhbo;-><init>()V

    const/4 v0, 0x2

    iput-byte v0, p0, Lcom/google/android/gms/internal/ads/zzhjh;->zzP:B

    const-string v0, ""

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzhjh;->zzf:Ljava/lang/String;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzhjh;->zzg:Ljava/lang/String;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzhjh;->zzh:Ljava/lang/String;

    .line 2
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzhjh;->zzbK()Lcom/google/android/gms/internal/ads/zzhca;

    move-result-object v1

    iput-object v1, p0, Lcom/google/android/gms/internal/ads/zzhjh;->zzj:Lcom/google/android/gms/internal/ads/zzhca;

    .line 3
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzhjh;->zzbK()Lcom/google/android/gms/internal/ads/zzhca;

    move-result-object v1

    iput-object v1, p0, Lcom/google/android/gms/internal/ads/zzhjh;->zzk:Lcom/google/android/gms/internal/ads/zzhca;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzhjh;->zzl:Ljava/lang/String;

    .line 4
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzhbo;->zzbK()Lcom/google/android/gms/internal/ads/zzhca;

    move-result-object v1

    iput-object v1, p0, Lcom/google/android/gms/internal/ads/zzhjh;->zzo:Lcom/google/android/gms/internal/ads/zzhca;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzhjh;->zzp:Ljava/lang/String;

    .line 5
    sget-object v1, Lcom/google/android/gms/internal/ads/zzhac;->zzb:Lcom/google/android/gms/internal/ads/zzhac;

    iput-object v1, p0, Lcom/google/android/gms/internal/ads/zzhjh;->zzw:Lcom/google/android/gms/internal/ads/zzhac;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzhjh;->zzz:Ljava/lang/String;

    .line 6
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzhbo;->zzbK()Lcom/google/android/gms/internal/ads/zzhca;

    move-result-object v1

    iput-object v1, p0, Lcom/google/android/gms/internal/ads/zzhjh;->zzA:Lcom/google/android/gms/internal/ads/zzhca;

    .line 7
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzhbo;->zzbK()Lcom/google/android/gms/internal/ads/zzhca;

    move-result-object v1

    iput-object v1, p0, Lcom/google/android/gms/internal/ads/zzhjh;->zzB:Lcom/google/android/gms/internal/ads/zzhca;

    .line 8
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzhjh;->zzbK()Lcom/google/android/gms/internal/ads/zzhca;

    move-result-object v1

    iput-object v1, p0, Lcom/google/android/gms/internal/ads/zzhjh;->zzD:Lcom/google/android/gms/internal/ads/zzhca;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzhjh;->zzF:Ljava/lang/String;

    .line 9
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzhjh;->zzbK()Lcom/google/android/gms/internal/ads/zzhca;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzhjh;->zzH:Lcom/google/android/gms/internal/ads/zzhca;

    .line 10
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzhjh;->zzbK()Lcom/google/android/gms/internal/ads/zzhca;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzhjh;->zzK:Lcom/google/android/gms/internal/ads/zzhca;

    .line 11
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzhjh;->zzbK()Lcom/google/android/gms/internal/ads/zzhca;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzhjh;->zzL:Lcom/google/android/gms/internal/ads/zzhca;

    return-void
.end method

.method public static zzc()Lcom/google/android/gms/internal/ads/zzhgn;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/ads/zzhjh;->zza:Lcom/google/android/gms/internal/ads/zzhjh;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzhbo;->zzaZ()Lcom/google/android/gms/internal/ads/zzhbi;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/zzhgn;

    return-object v0
.end method

.method static synthetic zze()Lcom/google/android/gms/internal/ads/zzhjh;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/ads/zzhjh;->zza:Lcom/google/android/gms/internal/ads/zzhjh;

    return-object v0
.end method

.method static synthetic zzi(Lcom/google/android/gms/internal/ads/zzhjh;Lcom/google/android/gms/internal/ads/zzhim;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzhim;->zza()I

    move-result p1

    iput p1, p0, Lcom/google/android/gms/internal/ads/zzhjh;->zzd:I

    iget p1, p0, Lcom/google/android/gms/internal/ads/zzhjh;->zzc:I

    or-int/lit8 p1, p1, 0x1

    iput p1, p0, Lcom/google/android/gms/internal/ads/zzhjh;->zzc:I

    return-void
.end method

.method static synthetic zzj(Lcom/google/android/gms/internal/ads/zzhjh;Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzhjh;->zzc:I

    or-int/lit8 v0, v0, 0x4

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzhjh;->zzc:I

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzhjh;->zzf:Ljava/lang/String;

    return-void
.end method

.method static synthetic zzk(Lcom/google/android/gms/internal/ads/zzhjh;Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzhjh;->zzc:I

    or-int/lit8 v0, v0, 0x8

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzhjh;->zzc:I

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzhjh;->zzg:Ljava/lang/String;

    return-void
.end method

.method static synthetic zzl(Lcom/google/android/gms/internal/ads/zzhjh;Lcom/google/android/gms/internal/ads/zzhgp;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzhjh;->zzi:Lcom/google/android/gms/internal/ads/zzhgp;

    iget p1, p0, Lcom/google/android/gms/internal/ads/zzhjh;->zzc:I

    or-int/lit8 p1, p1, 0x20

    iput p1, p0, Lcom/google/android/gms/internal/ads/zzhjh;->zzc:I

    return-void
.end method

.method static synthetic zzm(Lcom/google/android/gms/internal/ads/zzhjh;Lcom/google/android/gms/internal/ads/zzhir;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzhjh;->zzj:Lcom/google/android/gms/internal/ads/zzhca;

    .line 2
    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzhca;->zzc()Z

    move-result v1

    if-nez v1, :cond_0

    .line 3
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzhbo;->zzbL(Lcom/google/android/gms/internal/ads/zzhca;)Lcom/google/android/gms/internal/ads/zzhca;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzhjh;->zzj:Lcom/google/android/gms/internal/ads/zzhca;

    :cond_0
    iget-object p0, p0, Lcom/google/android/gms/internal/ads/zzhjh;->zzj:Lcom/google/android/gms/internal/ads/zzhca;

    .line 4
    invoke-interface {p0, p1}, Lcom/google/android/gms/internal/ads/zzhca;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method static synthetic zzn(Lcom/google/android/gms/internal/ads/zzhjh;Ljava/lang/String;)V
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzhjh;->zzc:I

    or-int/lit8 v0, v0, 0x40

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzhjh;->zzc:I

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzhjh;->zzl:Ljava/lang/String;

    return-void
.end method

.method static synthetic zzo(Lcom/google/android/gms/internal/ads/zzhjh;)V
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzhjh;->zzc:I

    and-int/lit8 v0, v0, -0x41

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzhjh;->zzc:I

    sget-object v0, Lcom/google/android/gms/internal/ads/zzhjh;->zza:Lcom/google/android/gms/internal/ads/zzhjh;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zzhjh;->zzl:Ljava/lang/String;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzhjh;->zzl:Ljava/lang/String;

    return-void
.end method

.method static synthetic zzp(Lcom/google/android/gms/internal/ads/zzhjh;Lcom/google/android/gms/internal/ads/zzhij;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzhjh;->zzm:Lcom/google/android/gms/internal/ads/zzhij;

    iget p1, p0, Lcom/google/android/gms/internal/ads/zzhjh;->zzc:I

    or-int/lit16 p1, p1, 0x80

    iput p1, p0, Lcom/google/android/gms/internal/ads/zzhjh;->zzc:I

    return-void
.end method

.method static synthetic zzq(Lcom/google/android/gms/internal/ads/zzhjh;Lcom/google/android/gms/internal/ads/zzhit;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzhjh;->zzx:Lcom/google/android/gms/internal/ads/zzhit;

    iget p1, p0, Lcom/google/android/gms/internal/ads/zzhjh;->zzc:I

    or-int/lit16 p1, p1, 0x2000

    iput p1, p0, Lcom/google/android/gms/internal/ads/zzhjh;->zzc:I

    return-void
.end method

.method static synthetic zzr(Lcom/google/android/gms/internal/ads/zzhjh;Ljava/lang/Iterable;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzhjh;->zzA:Lcom/google/android/gms/internal/ads/zzhca;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzhca;->zzc()Z

    move-result v1

    if-nez v1, :cond_0

    .line 2
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzhbo;->zzbL(Lcom/google/android/gms/internal/ads/zzhca;)Lcom/google/android/gms/internal/ads/zzhca;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzhjh;->zzA:Lcom/google/android/gms/internal/ads/zzhca;

    :cond_0
    iget-object p0, p0, Lcom/google/android/gms/internal/ads/zzhjh;->zzA:Lcom/google/android/gms/internal/ads/zzhca;

    .line 3
    invoke-static {p1, p0}, Lcom/google/android/gms/internal/ads/zzgzi;->zzaQ(Ljava/lang/Iterable;Ljava/util/List;)V

    return-void
.end method

.method static synthetic zzs(Lcom/google/android/gms/internal/ads/zzhjh;Ljava/lang/Iterable;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzhjh;->zzB:Lcom/google/android/gms/internal/ads/zzhca;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzhca;->zzc()Z

    move-result v1

    if-nez v1, :cond_0

    .line 2
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzhbo;->zzbL(Lcom/google/android/gms/internal/ads/zzhca;)Lcom/google/android/gms/internal/ads/zzhca;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzhjh;->zzB:Lcom/google/android/gms/internal/ads/zzhca;

    :cond_0
    iget-object p0, p0, Lcom/google/android/gms/internal/ads/zzhjh;->zzB:Lcom/google/android/gms/internal/ads/zzhca;

    .line 3
    invoke-static {p1, p0}, Lcom/google/android/gms/internal/ads/zzgzi;->zzaQ(Ljava/lang/Iterable;Ljava/util/List;)V

    return-void
.end method


# virtual methods
.method protected final zzde(Lcom/google/android/gms/internal/ads/zzhbn;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 46

    move-object/from16 v1, p0

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/ads/zzhbn;->zza:Lcom/google/android/gms/internal/ads/zzhbn;

    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/zzhbn;->ordinal()I

    move-result v0

    const/4 v2, 0x0

    packed-switch v0, :pswitch_data_0

    .line 10
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    .line 11
    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0

    .line 1
    :pswitch_0
    sget-object v0, Lcom/google/android/gms/internal/ads/zzhjh;->zzb:Lcom/google/android/gms/internal/ads/zzhdm;

    if-nez v0, :cond_1

    const-class v2, Lcom/google/android/gms/internal/ads/zzhjh;

    monitor-enter v2

    :try_start_0
    sget-object v0, Lcom/google/android/gms/internal/ads/zzhjh;->zzb:Lcom/google/android/gms/internal/ads/zzhdm;

    if-nez v0, :cond_0

    .line 3
    new-instance v0, Lcom/google/android/gms/internal/ads/zzhbj;

    sget-object v3, Lcom/google/android/gms/internal/ads/zzhjh;->zza:Lcom/google/android/gms/internal/ads/zzhjh;

    invoke-direct {v0, v3}, Lcom/google/android/gms/internal/ads/zzhbj;-><init>(Lcom/google/android/gms/internal/ads/zzhbo;)V

    sput-object v0, Lcom/google/android/gms/internal/ads/zzhjh;->zzb:Lcom/google/android/gms/internal/ads/zzhdm;

    .line 4
    :cond_0
    monitor-exit v2

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    :cond_1
    :goto_0
    return-object v0

    .line 2
    :pswitch_1
    sget-object v0, Lcom/google/android/gms/internal/ads/zzhjh;->zza:Lcom/google/android/gms/internal/ads/zzhjh;

    return-object v0

    .line 8
    :pswitch_2
    new-instance v0, Lcom/google/android/gms/internal/ads/zzhgn;

    .line 9
    invoke-direct {v0, v2}, Lcom/google/android/gms/internal/ads/zzhgn;-><init>(Lcom/google/android/gms/internal/ads/zzhfr;)V

    return-object v0

    :pswitch_3
    new-instance v0, Lcom/google/android/gms/internal/ads/zzhjh;

    .line 10
    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzhjh;-><init>()V

    return-object v0

    .line 2
    :pswitch_4
    const-string v2, "zzc"

    const-string v3, "zzf"

    const-string v4, "zzg"

    const-string v5, "zzh"

    const-string v6, "zzj"

    const-class v7, Lcom/google/android/gms/internal/ads/zzhir;

    const-string v8, "zzn"

    const-string v9, "zzo"

    const-string v10, "zzp"

    const-string v11, "zzu"

    const-string v12, "zzv"

    const-string v13, "zzd"

    .line 5
    sget-object v14, Lcom/google/android/gms/internal/ads/zzhil;->zza:Lcom/google/android/gms/internal/ads/zzhbu;

    const-string v15, "zze"

    .line 6
    sget-object v16, Lcom/google/android/gms/internal/ads/zzhgl;->zza:Lcom/google/android/gms/internal/ads/zzhbu;

    const-string v17, "zzi"

    const-string v18, "zzl"

    const-string v19, "zzm"

    const-string v20, "zzw"

    const-string v21, "zzk"

    const-class v22, Lcom/google/android/gms/internal/ads/zzhjl;

    const-string v23, "zzx"

    const-string v24, "zzy"

    const-string v25, "zzz"

    const-string v26, "zzA"

    const-string v27, "zzB"

    const-string v28, "zzC"

    const-string v29, "zzD"

    const-class v30, Lcom/google/android/gms/internal/ads/zzhjv;

    const-string v31, "zzE"

    const-string v32, "zzF"

    const-string v33, "zzG"

    const-string v34, "zzH"

    const-class v35, Lcom/google/android/gms/internal/ads/zzhhb;

    const-string v36, "zzI"

    const-string v37, "zzJ"

    .line 7
    sget-object v38, Lcom/google/android/gms/internal/ads/zzhiy;->zza:Lcom/google/android/gms/internal/ads/zzhbu;

    const-string v39, "zzK"

    const-class v40, Lcom/google/android/gms/internal/ads/zzhhx;

    const-string v41, "zzL"

    const-class v42, Lcom/google/android/gms/internal/ads/zzhie;

    const-string v43, "zzM"

    const-string v44, "zzN"

    const-string v45, "zzO"

    filled-new-array/range {v2 .. v45}, [Ljava/lang/Object;

    move-result-object v0

    sget-object v2, Lcom/google/android/gms/internal/ads/zzhjh;->zza:Lcom/google/android/gms/internal/ads/zzhjh;

    const-string v3, "\u0001\"\u0000\u0001\u0001\"\"\u0000\t\u0001\u0001\u1008\u0002\u0002\u1008\u0003\u0003\u1008\u0004\u0004\u041b\u0005\u1007\u0008\u0006\u001a\u0007\u1008\t\u0008\u1007\n\t\u1007\u000b\n\u180c\u0000\u000b\u180c\u0001\u000c\u1009\u0005\r\u1008\u0006\u000e\u1009\u0007\u000f\u100a\u000c\u0010\u001b\u0011\u1009\r\u0012\u1007\u000e\u0013\u1008\u000f\u0014\u001a\u0015\u001a\u0016\u1009\u0010\u0017\u001b\u0018\u1009\u0011\u0019\u1008\u0012\u001a\u1009\u0013\u001b\u001b\u001c\u1009\u0014\u001d\u180c\u0015\u001e\u001b\u001f\u001b \u1002\u0016!\u1009\u0017\"\u1009\u0018"

    .line 8
    invoke-static {v2, v3, v0}, Lcom/google/android/gms/internal/ads/zzhjh;->zzbR(Lcom/google/android/gms/internal/ads/zzhde;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :pswitch_5
    if-nez p2, :cond_2

    const/4 v0, 0x0

    goto :goto_1

    :cond_2
    const/4 v0, 0x1

    .line 4
    :goto_1
    iput-byte v0, v1, Lcom/google/android/gms/internal/ads/zzhjh;->zzP:B

    return-object v2

    :pswitch_6
    iget-byte v0, v1, Lcom/google/android/gms/internal/ads/zzhjh;->zzP:B

    .line 2
    invoke-static {v0}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v0

    return-object v0

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

.method public final zzf()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzhjh;->zzl:Ljava/lang/String;

    return-object v0
.end method

.method public final zzg()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzhjh;->zzf:Ljava/lang/String;

    return-object v0
.end method

.method public final zzh()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzhjh;->zzj:Lcom/google/android/gms/internal/ads/zzhca;

    return-object v0
.end method
