.class public final Lcom/google/android/gms/internal/ads/zzbdv$zzi;
.super Lcom/google/android/gms/internal/ads/zzhbo;
.source "com.google.android.gms:play-services-ads@@23.2.0"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzbdv$zzj;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/ads/zzhbo<",
        "Lcom/google/android/gms/internal/ads/zzbdv$zzi;",
        "Lcom/google/android/gms/internal/ads/zzbdv$zzi$zza;",
        ">;",
        "Lcom/google/android/gms/internal/ads/zzbdv$zzj;"
    }
.end annotation


# static fields
.field public static final zza:I = 0x1

.field public static final zzb:I = 0x2

.field public static final zzc:I = 0x3

.field public static final zzd:I = 0x4

.field public static final zze:I = 0x5

.field private static final zzf:Lcom/google/android/gms/internal/ads/zzbdv$zzi;

.field private static volatile zzg:Lcom/google/android/gms/internal/ads/zzhdm;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/ads/zzhdm<",
            "Lcom/google/android/gms/internal/ads/zzbdv$zzi;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private zzh:I

.field private zzi:Ljava/lang/String;

.field private zzj:Lcom/google/android/gms/internal/ads/zzhca;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/ads/zzhca<",
            "Lcom/google/android/gms/internal/ads/zzbdv$zzd;",
            ">;"
        }
    .end annotation
.end field

.field private zzk:I

.field private zzl:I

.field private zzm:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/ads/zzbdv$zzi;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzbdv$zzi;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ads/zzbdv$zzi;->zzf:Lcom/google/android/gms/internal/ads/zzbdv$zzi;

    const-class v1, Lcom/google/android/gms/internal/ads/zzbdv$zzi;

    .line 2
    invoke-static {v1, v0}, Lcom/google/android/gms/internal/ads/zzhbo;->zzca(Ljava/lang/Class;Lcom/google/android/gms/internal/ads/zzhbo;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzhbo;-><init>()V

    const-string v0, ""

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzbdv$zzi;->zzi:Ljava/lang/String;

    .line 2
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzbdv$zzi;->zzbK()Lcom/google/android/gms/internal/ads/zzhca;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzbdv$zzi;->zzj:Lcom/google/android/gms/internal/ads/zzhca;

    const/16 v0, 0x3e8

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzbdv$zzi;->zzk:I

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzbdv$zzi;->zzl:I

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzbdv$zzi;->zzm:I

    return-void
.end method

.method static synthetic zzF(Lcom/google/android/gms/internal/ads/zzbdv$zzi;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzbdv$zzi;->zzaf(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic zzG(Lcom/google/android/gms/internal/ads/zzbdv$zzi;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzbdv$zzi;->zzY()V

    return-void
.end method

.method static synthetic zzH(Lcom/google/android/gms/internal/ads/zzbdv$zzi;Lcom/google/android/gms/internal/ads/zzhac;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzbdv$zzi;->zzag(Lcom/google/android/gms/internal/ads/zzhac;)V

    return-void
.end method

.method static synthetic zzI(Lcom/google/android/gms/internal/ads/zzbdv$zzi;ILcom/google/android/gms/internal/ads/zzbdv$zzd;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/ads/zzbdv$zzi;->zzaj(ILcom/google/android/gms/internal/ads/zzbdv$zzd;)V

    return-void
.end method

.method static synthetic zzJ(Lcom/google/android/gms/internal/ads/zzbdv$zzi;Lcom/google/android/gms/internal/ads/zzbdv$zzd;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzbdv$zzi;->zzV(Lcom/google/android/gms/internal/ads/zzbdv$zzd;)V

    return-void
.end method

.method static synthetic zzK(Lcom/google/android/gms/internal/ads/zzbdv$zzi;ILcom/google/android/gms/internal/ads/zzbdv$zzd;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/ads/zzbdv$zzi;->zzW(ILcom/google/android/gms/internal/ads/zzbdv$zzd;)V

    return-void
.end method

.method static synthetic zzL(Lcom/google/android/gms/internal/ads/zzbdv$zzi;Ljava/lang/Iterable;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzbdv$zzi;->zzU(Ljava/lang/Iterable;)V

    return-void
.end method

.method static synthetic zzM(Lcom/google/android/gms/internal/ads/zzbdv$zzi;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzbdv$zzi;->zzab()V

    return-void
.end method

.method static synthetic zzN(Lcom/google/android/gms/internal/ads/zzbdv$zzi;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzbdv$zzi;->zzad(I)V

    return-void
.end method

.method static synthetic zzO(Lcom/google/android/gms/internal/ads/zzbdv$zzi;Lcom/google/android/gms/internal/ads/zzbdv$zzq;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzbdv$zzi;->zzai(Lcom/google/android/gms/internal/ads/zzbdv$zzq;)V

    return-void
.end method

.method static synthetic zzP(Lcom/google/android/gms/internal/ads/zzbdv$zzi;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzbdv$zzi;->zzaa()V

    return-void
.end method

.method static synthetic zzQ(Lcom/google/android/gms/internal/ads/zzbdv$zzi;Lcom/google/android/gms/internal/ads/zzbdv$zzq;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzbdv$zzi;->zzah(Lcom/google/android/gms/internal/ads/zzbdv$zzq;)V

    return-void
.end method

.method static synthetic zzR(Lcom/google/android/gms/internal/ads/zzbdv$zzi;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzbdv$zzi;->zzZ()V

    return-void
.end method

.method static synthetic zzS(Lcom/google/android/gms/internal/ads/zzbdv$zzi;Lcom/google/android/gms/internal/ads/zzbdv$zzq;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzbdv$zzi;->zzae(Lcom/google/android/gms/internal/ads/zzbdv$zzq;)V

    return-void
.end method

.method static synthetic zzT(Lcom/google/android/gms/internal/ads/zzbdv$zzi;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzbdv$zzi;->zzX()V

    return-void
.end method

.method private zzU(Ljava/lang/Iterable;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Iterable<",
            "+",
            "Lcom/google/android/gms/internal/ads/zzbdv$zzd;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzbdv$zzi;->zzac()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbdv$zzi;->zzj:Lcom/google/android/gms/internal/ads/zzhca;

    .line 2
    invoke-static {p1, v0}, Lcom/google/android/gms/internal/ads/zzgzi;->zzaQ(Ljava/lang/Iterable;Ljava/util/List;)V

    return-void
.end method

.method private zzV(Lcom/google/android/gms/internal/ads/zzbdv$zzd;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzbdv$zzi;->zzac()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbdv$zzi;->zzj:Lcom/google/android/gms/internal/ads/zzhca;

    .line 3
    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ads/zzhca;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method private zzW(ILcom/google/android/gms/internal/ads/zzbdv$zzd;)V
    .locals 1

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzbdv$zzi;->zzac()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbdv$zzi;->zzj:Lcom/google/android/gms/internal/ads/zzhca;

    .line 3
    invoke-interface {v0, p1, p2}, Lcom/google/android/gms/internal/ads/zzhca;->add(ILjava/lang/Object;)V

    return-void
.end method

.method private zzX()V
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzbdv$zzi;->zzh:I

    and-int/lit8 v0, v0, -0x9

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzbdv$zzi;->zzh:I

    const/16 v0, 0x3e8

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzbdv$zzi;->zzm:I

    return-void
.end method

.method private zzY()V
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/android/gms/internal/ads/zzbdv$zzi;->zzh:I

    and-int/lit8 v0, v0, -0x2

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzbdv$zzi;->zzh:I

    invoke-static {}, Lcom/google/android/gms/internal/ads/zzbdv$zzi;->zzg()Lcom/google/android/gms/internal/ads/zzbdv$zzi;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzbdv$zzi;->zzy()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzbdv$zzi;->zzi:Ljava/lang/String;

    return-void
.end method

.method private zzZ()V
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzbdv$zzi;->zzh:I

    and-int/lit8 v0, v0, -0x5

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzbdv$zzi;->zzh:I

    const/16 v0, 0x3e8

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzbdv$zzi;->zzl:I

    return-void
.end method

.method private zzaa()V
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzbdv$zzi;->zzh:I

    and-int/lit8 v0, v0, -0x3

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzbdv$zzi;->zzh:I

    const/16 v0, 0x3e8

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzbdv$zzi;->zzk:I

    return-void
.end method

.method private zzab()V
    .locals 1

    .line 1
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzbdv$zzi;->zzbK()Lcom/google/android/gms/internal/ads/zzhca;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzbdv$zzi;->zzj:Lcom/google/android/gms/internal/ads/zzhca;

    return-void
.end method

.method private zzac()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbdv$zzi;->zzj:Lcom/google/android/gms/internal/ads/zzhca;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzhca;->zzc()Z

    move-result v1

    if-nez v1, :cond_0

    .line 2
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzhbo;->zzbL(Lcom/google/android/gms/internal/ads/zzhca;)Lcom/google/android/gms/internal/ads/zzhca;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzbdv$zzi;->zzj:Lcom/google/android/gms/internal/ads/zzhca;

    :cond_0
    return-void
.end method

.method private zzad(I)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzbdv$zzi;->zzac()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbdv$zzi;->zzj:Lcom/google/android/gms/internal/ads/zzhca;

    .line 2
    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ads/zzhca;->remove(I)Ljava/lang/Object;

    return-void
.end method

.method private zzae(Lcom/google/android/gms/internal/ads/zzbdv$zzq;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzbdv$zzq;->zza()I

    move-result p1

    iput p1, p0, Lcom/google/android/gms/internal/ads/zzbdv$zzi;->zzm:I

    iget p1, p0, Lcom/google/android/gms/internal/ads/zzbdv$zzi;->zzh:I

    or-int/lit8 p1, p1, 0x8

    iput p1, p0, Lcom/google/android/gms/internal/ads/zzbdv$zzi;->zzh:I

    return-void
.end method

.method private zzaf(Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzbdv$zzi;->zzh:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzbdv$zzi;->zzh:I

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzbdv$zzi;->zzi:Ljava/lang/String;

    return-void
.end method

.method private zzag(Lcom/google/android/gms/internal/ads/zzhac;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzhac;->zzy()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzbdv$zzi;->zzi:Ljava/lang/String;

    iget p1, p0, Lcom/google/android/gms/internal/ads/zzbdv$zzi;->zzh:I

    or-int/lit8 p1, p1, 0x1

    iput p1, p0, Lcom/google/android/gms/internal/ads/zzbdv$zzi;->zzh:I

    return-void
.end method

.method private zzah(Lcom/google/android/gms/internal/ads/zzbdv$zzq;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzbdv$zzq;->zza()I

    move-result p1

    iput p1, p0, Lcom/google/android/gms/internal/ads/zzbdv$zzi;->zzl:I

    iget p1, p0, Lcom/google/android/gms/internal/ads/zzbdv$zzi;->zzh:I

    or-int/lit8 p1, p1, 0x4

    iput p1, p0, Lcom/google/android/gms/internal/ads/zzbdv$zzi;->zzh:I

    return-void
.end method

.method private zzai(Lcom/google/android/gms/internal/ads/zzbdv$zzq;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzbdv$zzq;->zza()I

    move-result p1

    iput p1, p0, Lcom/google/android/gms/internal/ads/zzbdv$zzi;->zzk:I

    iget p1, p0, Lcom/google/android/gms/internal/ads/zzbdv$zzi;->zzh:I

    or-int/lit8 p1, p1, 0x2

    iput p1, p0, Lcom/google/android/gms/internal/ads/zzbdv$zzi;->zzh:I

    return-void
.end method

.method private zzaj(ILcom/google/android/gms/internal/ads/zzbdv$zzd;)V
    .locals 1

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzbdv$zzi;->zzac()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbdv$zzi;->zzj:Lcom/google/android/gms/internal/ads/zzhca;

    .line 3
    invoke-interface {v0, p1, p2}, Lcom/google/android/gms/internal/ads/zzhca;->set(ILjava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static zzd()Lcom/google/android/gms/internal/ads/zzbdv$zzi$zza;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/ads/zzbdv$zzi;->zzf:Lcom/google/android/gms/internal/ads/zzbdv$zzi;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzhbo;->zzaZ()Lcom/google/android/gms/internal/ads/zzhbi;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/zzbdv$zzi$zza;

    return-object v0
.end method

.method public static zze(Lcom/google/android/gms/internal/ads/zzbdv$zzi;)Lcom/google/android/gms/internal/ads/zzbdv$zzi$zza;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/ads/zzbdv$zzi;->zzf:Lcom/google/android/gms/internal/ads/zzbdv$zzi;

    invoke-virtual {v0, p0}, Lcom/google/android/gms/internal/ads/zzhbo;->zzba(Lcom/google/android/gms/internal/ads/zzhbo;)Lcom/google/android/gms/internal/ads/zzhbi;

    move-result-object p0

    check-cast p0, Lcom/google/android/gms/internal/ads/zzbdv$zzi$zza;

    return-object p0
.end method

.method static synthetic zzf()Lcom/google/android/gms/internal/ads/zzbdv$zzi;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/ads/zzbdv$zzi;->zzf:Lcom/google/android/gms/internal/ads/zzbdv$zzi;

    return-object v0
.end method

.method public static zzg()Lcom/google/android/gms/internal/ads/zzbdv$zzi;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/ads/zzbdv$zzi;->zzf:Lcom/google/android/gms/internal/ads/zzbdv$zzi;

    return-object v0
.end method

.method public static zzh(Ljava/io/InputStream;)Lcom/google/android/gms/internal/ads/zzbdv$zzi;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/ads/zzbdv$zzi;->zzf:Lcom/google/android/gms/internal/ads/zzbdv$zzi;

    invoke-static {v0, p0}, Lcom/google/android/gms/internal/ads/zzbdv$zzi;->zzbk(Lcom/google/android/gms/internal/ads/zzhbo;Ljava/io/InputStream;)Lcom/google/android/gms/internal/ads/zzhbo;

    move-result-object p0

    check-cast p0, Lcom/google/android/gms/internal/ads/zzbdv$zzi;

    return-object p0
.end method

.method public static zzi(Ljava/io/InputStream;Lcom/google/android/gms/internal/ads/zzhay;)Lcom/google/android/gms/internal/ads/zzbdv$zzi;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/ads/zzbdv$zzi;->zzf:Lcom/google/android/gms/internal/ads/zzbdv$zzi;

    invoke-static {v0, p0, p1}, Lcom/google/android/gms/internal/ads/zzbdv$zzi;->zzbl(Lcom/google/android/gms/internal/ads/zzhbo;Ljava/io/InputStream;Lcom/google/android/gms/internal/ads/zzhay;)Lcom/google/android/gms/internal/ads/zzhbo;

    move-result-object p0

    check-cast p0, Lcom/google/android/gms/internal/ads/zzbdv$zzi;

    return-object p0
.end method

.method public static zzj(Lcom/google/android/gms/internal/ads/zzhac;)Lcom/google/android/gms/internal/ads/zzbdv$zzi;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/ads/zzhcd;
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/ads/zzbdv$zzi;->zzf:Lcom/google/android/gms/internal/ads/zzbdv$zzi;

    invoke-static {v0, p0}, Lcom/google/android/gms/internal/ads/zzhbo;->zzbm(Lcom/google/android/gms/internal/ads/zzhbo;Lcom/google/android/gms/internal/ads/zzhac;)Lcom/google/android/gms/internal/ads/zzhbo;

    move-result-object p0

    check-cast p0, Lcom/google/android/gms/internal/ads/zzbdv$zzi;

    return-object p0
.end method

.method public static zzk(Lcom/google/android/gms/internal/ads/zzham;)Lcom/google/android/gms/internal/ads/zzbdv$zzi;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/ads/zzbdv$zzi;->zzf:Lcom/google/android/gms/internal/ads/zzbdv$zzi;

    invoke-static {v0, p0}, Lcom/google/android/gms/internal/ads/zzhbo;->zzbn(Lcom/google/android/gms/internal/ads/zzhbo;Lcom/google/android/gms/internal/ads/zzham;)Lcom/google/android/gms/internal/ads/zzhbo;

    move-result-object p0

    check-cast p0, Lcom/google/android/gms/internal/ads/zzbdv$zzi;

    return-object p0
.end method

.method public static zzl(Ljava/io/InputStream;)Lcom/google/android/gms/internal/ads/zzbdv$zzi;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/ads/zzbdv$zzi;->zzf:Lcom/google/android/gms/internal/ads/zzbdv$zzi;

    invoke-static {v0, p0}, Lcom/google/android/gms/internal/ads/zzhbo;->zzbo(Lcom/google/android/gms/internal/ads/zzhbo;Ljava/io/InputStream;)Lcom/google/android/gms/internal/ads/zzhbo;

    move-result-object p0

    check-cast p0, Lcom/google/android/gms/internal/ads/zzbdv$zzi;

    return-object p0
.end method

.method public static zzm(Ljava/nio/ByteBuffer;)Lcom/google/android/gms/internal/ads/zzbdv$zzi;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/ads/zzhcd;
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/ads/zzbdv$zzi;->zzf:Lcom/google/android/gms/internal/ads/zzbdv$zzi;

    invoke-static {v0, p0}, Lcom/google/android/gms/internal/ads/zzhbo;->zzbp(Lcom/google/android/gms/internal/ads/zzhbo;Ljava/nio/ByteBuffer;)Lcom/google/android/gms/internal/ads/zzhbo;

    move-result-object p0

    check-cast p0, Lcom/google/android/gms/internal/ads/zzbdv$zzi;

    return-object p0
.end method

.method public static zzn([B)Lcom/google/android/gms/internal/ads/zzbdv$zzi;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/ads/zzhcd;
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/ads/zzbdv$zzi;->zzf:Lcom/google/android/gms/internal/ads/zzbdv$zzi;

    invoke-static {v0, p0}, Lcom/google/android/gms/internal/ads/zzhbo;->zzbq(Lcom/google/android/gms/internal/ads/zzhbo;[B)Lcom/google/android/gms/internal/ads/zzhbo;

    move-result-object p0

    check-cast p0, Lcom/google/android/gms/internal/ads/zzbdv$zzi;

    return-object p0
.end method

.method public static zzo(Lcom/google/android/gms/internal/ads/zzhac;Lcom/google/android/gms/internal/ads/zzhay;)Lcom/google/android/gms/internal/ads/zzbdv$zzi;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/ads/zzhcd;
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/ads/zzbdv$zzi;->zzf:Lcom/google/android/gms/internal/ads/zzbdv$zzi;

    invoke-static {v0, p0, p1}, Lcom/google/android/gms/internal/ads/zzhbo;->zzbr(Lcom/google/android/gms/internal/ads/zzhbo;Lcom/google/android/gms/internal/ads/zzhac;Lcom/google/android/gms/internal/ads/zzhay;)Lcom/google/android/gms/internal/ads/zzhbo;

    move-result-object p0

    check-cast p0, Lcom/google/android/gms/internal/ads/zzbdv$zzi;

    return-object p0
.end method

.method public static zzp(Lcom/google/android/gms/internal/ads/zzham;Lcom/google/android/gms/internal/ads/zzhay;)Lcom/google/android/gms/internal/ads/zzbdv$zzi;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/ads/zzbdv$zzi;->zzf:Lcom/google/android/gms/internal/ads/zzbdv$zzi;

    invoke-static {v0, p0, p1}, Lcom/google/android/gms/internal/ads/zzhbo;->zzbs(Lcom/google/android/gms/internal/ads/zzhbo;Lcom/google/android/gms/internal/ads/zzham;Lcom/google/android/gms/internal/ads/zzhay;)Lcom/google/android/gms/internal/ads/zzhbo;

    move-result-object p0

    check-cast p0, Lcom/google/android/gms/internal/ads/zzbdv$zzi;

    return-object p0
.end method

.method public static zzq(Ljava/io/InputStream;Lcom/google/android/gms/internal/ads/zzhay;)Lcom/google/android/gms/internal/ads/zzbdv$zzi;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/ads/zzbdv$zzi;->zzf:Lcom/google/android/gms/internal/ads/zzbdv$zzi;

    invoke-static {v0, p0, p1}, Lcom/google/android/gms/internal/ads/zzhbo;->zzbu(Lcom/google/android/gms/internal/ads/zzhbo;Ljava/io/InputStream;Lcom/google/android/gms/internal/ads/zzhay;)Lcom/google/android/gms/internal/ads/zzhbo;

    move-result-object p0

    check-cast p0, Lcom/google/android/gms/internal/ads/zzbdv$zzi;

    return-object p0
.end method

.method public static zzr(Ljava/nio/ByteBuffer;Lcom/google/android/gms/internal/ads/zzhay;)Lcom/google/android/gms/internal/ads/zzbdv$zzi;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/ads/zzhcd;
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/ads/zzbdv$zzi;->zzf:Lcom/google/android/gms/internal/ads/zzbdv$zzi;

    invoke-static {v0, p0, p1}, Lcom/google/android/gms/internal/ads/zzhbo;->zzbv(Lcom/google/android/gms/internal/ads/zzhbo;Ljava/nio/ByteBuffer;Lcom/google/android/gms/internal/ads/zzhay;)Lcom/google/android/gms/internal/ads/zzhbo;

    move-result-object p0

    check-cast p0, Lcom/google/android/gms/internal/ads/zzbdv$zzi;

    return-object p0
.end method

.method public static zzs([BLcom/google/android/gms/internal/ads/zzhay;)Lcom/google/android/gms/internal/ads/zzbdv$zzi;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/ads/zzhcd;
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/ads/zzbdv$zzi;->zzf:Lcom/google/android/gms/internal/ads/zzbdv$zzi;

    invoke-static {v0, p0, p1}, Lcom/google/android/gms/internal/ads/zzhbo;->zzbx(Lcom/google/android/gms/internal/ads/zzhbo;[BLcom/google/android/gms/internal/ads/zzhay;)Lcom/google/android/gms/internal/ads/zzhbo;

    move-result-object p0

    check-cast p0, Lcom/google/android/gms/internal/ads/zzbdv$zzi;

    return-object p0
.end method

.method public static zzt()Lcom/google/android/gms/internal/ads/zzhdm;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/internal/ads/zzhdm<",
            "Lcom/google/android/gms/internal/ads/zzbdv$zzi;",
            ">;"
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/ads/zzbdv$zzi;->zzf:Lcom/google/android/gms/internal/ads/zzbdv$zzi;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzhbo;->zzbM()Lcom/google/android/gms/internal/ads/zzhdm;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public zzA()Z
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzbdv$zzi;->zzh:I

    and-int/lit8 v0, v0, 0x8

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public zzB()Z
    .locals 2

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzbdv$zzi;->zzh:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-eqz v0, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public zzC()Z
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzbdv$zzi;->zzh:I

    and-int/lit8 v0, v0, 0x4

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public zzD()Z
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzbdv$zzi;->zzh:I

    and-int/lit8 v0, v0, 0x2

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public zzE()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "+",
            "Lcom/google/android/gms/internal/ads/zzbdv$zze;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbdv$zzi;->zzj:Lcom/google/android/gms/internal/ads/zzhca;

    return-object v0
.end method

.method public zza()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbdv$zzi;->zzj:Lcom/google/android/gms/internal/ads/zzhca;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzhca;->size()I

    move-result v0

    return v0
.end method

.method public zzb(I)Lcom/google/android/gms/internal/ads/zzbdv$zzd;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbdv$zzi;->zzj:Lcom/google/android/gms/internal/ads/zzhca;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ads/zzhca;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/ads/zzbdv$zzd;

    return-object p1
.end method

.method public zzc(I)Lcom/google/android/gms/internal/ads/zzbdv$zze;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbdv$zzi;->zzj:Lcom/google/android/gms/internal/ads/zzhca;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ads/zzhca;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/ads/zzbdv$zze;

    return-object p1
.end method

.method protected final zzde(Lcom/google/android/gms/internal/ads/zzhbn;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

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
    sget-object p1, Lcom/google/android/gms/internal/ads/zzbdv$zzi;->zzg:Lcom/google/android/gms/internal/ads/zzhdm;

    if-nez p1, :cond_1

    const-class p2, Lcom/google/android/gms/internal/ads/zzbdv$zzi;

    monitor-enter p2

    :try_start_0
    sget-object p1, Lcom/google/android/gms/internal/ads/zzbdv$zzi;->zzg:Lcom/google/android/gms/internal/ads/zzhdm;

    if-nez p1, :cond_0

    .line 3
    new-instance p1, Lcom/google/android/gms/internal/ads/zzhbj;

    sget-object p3, Lcom/google/android/gms/internal/ads/zzbdv$zzi;->zzf:Lcom/google/android/gms/internal/ads/zzbdv$zzi;

    invoke-direct {p1, p3}, Lcom/google/android/gms/internal/ads/zzhbj;-><init>(Lcom/google/android/gms/internal/ads/zzhbo;)V

    sput-object p1, Lcom/google/android/gms/internal/ads/zzbdv$zzi;->zzg:Lcom/google/android/gms/internal/ads/zzhdm;

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
    sget-object p1, Lcom/google/android/gms/internal/ads/zzbdv$zzi;->zzf:Lcom/google/android/gms/internal/ads/zzbdv$zzi;

    return-object p1

    .line 6
    :pswitch_2
    new-instance p1, Lcom/google/android/gms/internal/ads/zzbdv$zzi$zza;

    .line 7
    invoke-direct {p1, p2}, Lcom/google/android/gms/internal/ads/zzbdv$zzi$zza;-><init>(Lcom/google/android/gms/internal/ads/zzbdv$1;)V

    return-object p1

    :pswitch_3
    new-instance p1, Lcom/google/android/gms/internal/ads/zzbdv$zzi;

    .line 8
    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/zzbdv$zzi;-><init>()V

    return-object p1

    .line 2
    :pswitch_4
    const-string v0, "zzh"

    const-string v1, "zzi"

    const-string v2, "zzj"

    const-class v3, Lcom/google/android/gms/internal/ads/zzbdv$zzd;

    const-string v4, "zzk"

    .line 5
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzbdv$zzq;->zze()Lcom/google/android/gms/internal/ads/zzhbu;

    move-result-object v5

    const-string v6, "zzl"

    invoke-static {}, Lcom/google/android/gms/internal/ads/zzbdv$zzq;->zze()Lcom/google/android/gms/internal/ads/zzhbu;

    move-result-object v7

    const-string v8, "zzm"

    invoke-static {}, Lcom/google/android/gms/internal/ads/zzbdv$zzq;->zze()Lcom/google/android/gms/internal/ads/zzhbu;

    move-result-object v9

    filled-new-array/range {v0 .. v9}, [Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lcom/google/android/gms/internal/ads/zzbdv$zzi;->zzf:Lcom/google/android/gms/internal/ads/zzbdv$zzi;

    const-string p3, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u1008\u0000\u0002\u001b\u0003\u180c\u0001\u0004\u180c\u0002\u0005\u180c\u0003"

    .line 6
    invoke-static {p2, p3, p1}, Lcom/google/android/gms/internal/ads/zzbdv$zzi;->zzbR(Lcom/google/android/gms/internal/ads/zzhde;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

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

.method public zzu()Lcom/google/android/gms/internal/ads/zzbdv$zzq;
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/android/gms/internal/ads/zzbdv$zzi;->zzm:I

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzbdv$zzq;->zzb(I)Lcom/google/android/gms/internal/ads/zzbdv$zzq;

    move-result-object v0

    if-nez v0, :cond_0

    sget-object v0, Lcom/google/android/gms/internal/ads/zzbdv$zzq;->zzc:Lcom/google/android/gms/internal/ads/zzbdv$zzq;

    :cond_0
    return-object v0
.end method

.method public zzv()Lcom/google/android/gms/internal/ads/zzbdv$zzq;
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/android/gms/internal/ads/zzbdv$zzi;->zzl:I

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzbdv$zzq;->zzb(I)Lcom/google/android/gms/internal/ads/zzbdv$zzq;

    move-result-object v0

    if-nez v0, :cond_0

    sget-object v0, Lcom/google/android/gms/internal/ads/zzbdv$zzq;->zzc:Lcom/google/android/gms/internal/ads/zzbdv$zzq;

    :cond_0
    return-object v0
.end method

.method public zzw()Lcom/google/android/gms/internal/ads/zzbdv$zzq;
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/android/gms/internal/ads/zzbdv$zzi;->zzk:I

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzbdv$zzq;->zzb(I)Lcom/google/android/gms/internal/ads/zzbdv$zzq;

    move-result-object v0

    if-nez v0, :cond_0

    sget-object v0, Lcom/google/android/gms/internal/ads/zzbdv$zzq;->zzc:Lcom/google/android/gms/internal/ads/zzbdv$zzq;

    :cond_0
    return-object v0
.end method

.method public zzx()Lcom/google/android/gms/internal/ads/zzhac;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbdv$zzi;->zzi:Ljava/lang/String;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzhac;->zzw(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzhac;

    move-result-object v0

    return-object v0
.end method

.method public zzy()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbdv$zzi;->zzi:Ljava/lang/String;

    return-object v0
.end method

.method public zzz()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/google/android/gms/internal/ads/zzbdv$zzd;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbdv$zzi;->zzj:Lcom/google/android/gms/internal/ads/zzhca;

    return-object v0
.end method
