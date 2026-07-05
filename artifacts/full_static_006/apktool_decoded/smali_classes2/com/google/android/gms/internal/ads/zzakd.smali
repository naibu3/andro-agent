.class public final Lcom/google/android/gms/internal/ads/zzakd;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@23.2.0"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzadu;


# static fields
.field public static final zza:Lcom/google/android/gms/internal/ads/zzaea;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field private static final zzb:[B

.field private static final zzc:Lcom/google/android/gms/internal/ads/zzan;


# instance fields
.field private zzA:Lcom/google/android/gms/internal/ads/zzakc;

.field private zzB:I

.field private zzC:I

.field private zzD:I

.field private zzE:Z

.field private zzF:Lcom/google/android/gms/internal/ads/zzadx;

.field private zzG:[Lcom/google/android/gms/internal/ads/zzafa;

.field private zzH:[Lcom/google/android/gms/internal/ads/zzafa;

.field private zzI:Z

.field private final zzd:Lcom/google/android/gms/internal/ads/zzalt;

.field private final zze:Ljava/util/List;

.field private final zzf:Landroid/util/SparseArray;

.field private final zzg:Lcom/google/android/gms/internal/ads/zzfu;

.field private final zzh:Lcom/google/android/gms/internal/ads/zzfu;

.field private final zzi:Lcom/google/android/gms/internal/ads/zzfu;

.field private final zzj:[B

.field private final zzk:Lcom/google/android/gms/internal/ads/zzfu;

.field private final zzl:Lcom/google/android/gms/internal/ads/zzagu;

.field private final zzm:Lcom/google/android/gms/internal/ads/zzfu;

.field private final zzn:Ljava/util/ArrayDeque;

.field private final zzo:Ljava/util/ArrayDeque;

.field private zzp:Lcom/google/android/gms/internal/ads/zzgbc;

.field private zzq:I

.field private zzr:I

.field private zzs:J

.field private zzt:I

.field private zzu:Lcom/google/android/gms/internal/ads/zzfu;

.field private zzv:J

.field private zzw:I

.field private zzx:J

.field private zzy:J

.field private zzz:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/ads/zzajz;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzajz;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ads/zzakd;->zza:Lcom/google/android/gms/internal/ads/zzaea;

    const/16 v0, 0x10

    new-array v0, v0, [B

    fill-array-data v0, :array_0

    sput-object v0, Lcom/google/android/gms/internal/ads/zzakd;->zzb:[B

    new-instance v0, Lcom/google/android/gms/internal/ads/zzal;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzal;-><init>()V

    const-string v1, "application/x-emsg"

    .line 2
    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzal;->zzX(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzal;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzal;->zzad()Lcom/google/android/gms/internal/ads/zzan;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/ads/zzakd;->zzc:Lcom/google/android/gms/internal/ads/zzan;

    return-void

    nop

    :array_0
    .array-data 1
        -0x5et
        0x39t
        0x4ft
        0x52t
        0x5at
        -0x65t
        0x4ft
        0x14t
        -0x5et
        0x44t
        0x6ct
        0x42t
        0x7ct
        0x64t
        -0x73t
        -0xct
    .end array-data
.end method

.method public constructor <init>()V
    .locals 7
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    sget-object v1, Lcom/google/android/gms/internal/ads/zzalt;->zza:Lcom/google/android/gms/internal/ads/zzalt;

    invoke-static {}, Lcom/google/android/gms/internal/ads/zzgbc;->zzm()Lcom/google/android/gms/internal/ads/zzgbc;

    move-result-object v5

    const/4 v6, 0x0

    const/16 v2, 0x20

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v0, p0

    .line 2
    invoke-direct/range {v0 .. v6}, Lcom/google/android/gms/internal/ads/zzakd;-><init>(Lcom/google/android/gms/internal/ads/zzalt;ILcom/google/android/gms/internal/ads/zzgb;Lcom/google/android/gms/internal/ads/zzakp;Ljava/util/List;Lcom/google/android/gms/internal/ads/zzafa;)V

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/internal/ads/zzalt;I)V
    .locals 7

    .line 3
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzgbc;->zzm()Lcom/google/android/gms/internal/ads/zzgbc;

    move-result-object v5

    const/4 v6, 0x0

    const/16 v2, 0x20

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v0, p0

    move-object v1, p1

    .line 4
    invoke-direct/range {v0 .. v6}, Lcom/google/android/gms/internal/ads/zzakd;-><init>(Lcom/google/android/gms/internal/ads/zzalt;ILcom/google/android/gms/internal/ads/zzgb;Lcom/google/android/gms/internal/ads/zzakp;Ljava/util/List;Lcom/google/android/gms/internal/ads/zzafa;)V

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/internal/ads/zzalt;ILcom/google/android/gms/internal/ads/zzgb;Lcom/google/android/gms/internal/ads/zzakp;Ljava/util/List;Lcom/google/android/gms/internal/ads/zzafa;)V
    .locals 0

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzakd;->zzd:Lcom/google/android/gms/internal/ads/zzalt;

    invoke-static {p5}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzakd;->zze:Ljava/util/List;

    new-instance p1, Lcom/google/android/gms/internal/ads/zzagu;

    .line 6
    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/zzagu;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzakd;->zzl:Lcom/google/android/gms/internal/ads/zzagu;

    .line 7
    new-instance p1, Lcom/google/android/gms/internal/ads/zzfu;

    const/16 p2, 0x10

    invoke-direct {p1, p2}, Lcom/google/android/gms/internal/ads/zzfu;-><init>(I)V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzakd;->zzm:Lcom/google/android/gms/internal/ads/zzfu;

    new-instance p1, Lcom/google/android/gms/internal/ads/zzfu;

    .line 8
    sget-object p3, Lcom/google/android/gms/internal/ads/zzgr;->zza:[B

    invoke-direct {p1, p3}, Lcom/google/android/gms/internal/ads/zzfu;-><init>([B)V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzakd;->zzg:Lcom/google/android/gms/internal/ads/zzfu;

    new-instance p1, Lcom/google/android/gms/internal/ads/zzfu;

    const/4 p3, 0x5

    .line 9
    invoke-direct {p1, p3}, Lcom/google/android/gms/internal/ads/zzfu;-><init>(I)V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzakd;->zzh:Lcom/google/android/gms/internal/ads/zzfu;

    new-instance p1, Lcom/google/android/gms/internal/ads/zzfu;

    .line 10
    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/zzfu;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzakd;->zzi:Lcom/google/android/gms/internal/ads/zzfu;

    new-array p1, p2, [B

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzakd;->zzj:[B

    new-instance p2, Lcom/google/android/gms/internal/ads/zzfu;

    .line 11
    invoke-direct {p2, p1}, Lcom/google/android/gms/internal/ads/zzfu;-><init>([B)V

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzakd;->zzk:Lcom/google/android/gms/internal/ads/zzfu;

    new-instance p1, Ljava/util/ArrayDeque;

    .line 12
    invoke-direct {p1}, Ljava/util/ArrayDeque;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzakd;->zzn:Ljava/util/ArrayDeque;

    new-instance p1, Ljava/util/ArrayDeque;

    .line 13
    invoke-direct {p1}, Ljava/util/ArrayDeque;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzakd;->zzo:Ljava/util/ArrayDeque;

    new-instance p1, Landroid/util/SparseArray;

    .line 14
    invoke-direct {p1}, Landroid/util/SparseArray;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzakd;->zzf:Landroid/util/SparseArray;

    .line 15
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzgbc;->zzm()Lcom/google/android/gms/internal/ads/zzgbc;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzakd;->zzp:Lcom/google/android/gms/internal/ads/zzgbc;

    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide p1, p0, Lcom/google/android/gms/internal/ads/zzakd;->zzy:J

    iput-wide p1, p0, Lcom/google/android/gms/internal/ads/zzakd;->zzx:J

    iput-wide p1, p0, Lcom/google/android/gms/internal/ads/zzakd;->zzz:J

    sget-object p1, Lcom/google/android/gms/internal/ads/zzadx;->zza:Lcom/google/android/gms/internal/ads/zzadx;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzakd;->zzF:Lcom/google/android/gms/internal/ads/zzadx;

    const/4 p1, 0x0

    new-array p2, p1, [Lcom/google/android/gms/internal/ads/zzafa;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzakd;->zzG:[Lcom/google/android/gms/internal/ads/zzafa;

    new-array p1, p1, [Lcom/google/android/gms/internal/ads/zzafa;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzakd;->zzH:[Lcom/google/android/gms/internal/ads/zzafa;

    return-void
.end method

.method private static zza(I)I
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/ads/zzch;
        }
    .end annotation

    if-ltz p0, :cond_0

    return p0

    .line 1
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Unexpected negative value: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const/4 v0, 0x0

    invoke-static {p0, v0}, Lcom/google/android/gms/internal/ads/zzch;->zza(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/google/android/gms/internal/ads/zzch;

    move-result-object p0

    throw p0
.end method

.method private static zzg(Ljava/util/List;)Lcom/google/android/gms/internal/ads/zzae;
    .locals 18

    .line 1
    invoke-interface/range {p0 .. p0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    move v3, v1

    const/4 v4, 0x0

    :goto_0
    if-ge v3, v0, :cond_b

    move-object/from16 v5, p0

    .line 2
    invoke-interface {v5, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/google/android/gms/internal/ads/zzajn;

    .line 3
    iget v7, v6, Lcom/google/android/gms/internal/ads/zzajn;->zzd:I

    const v8, 0x70737368    # 3.013775E29f

    if-ne v7, v8, :cond_a

    if-nez v4, :cond_0

    new-instance v4, Ljava/util/ArrayList;

    .line 4
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 5
    :cond_0
    iget-object v6, v6, Lcom/google/android/gms/internal/ads/zzajn;->zza:Lcom/google/android/gms/internal/ads/zzfu;

    invoke-virtual {v6}, Lcom/google/android/gms/internal/ads/zzfu;->zzM()[B

    move-result-object v6

    new-instance v7, Lcom/google/android/gms/internal/ads/zzfu;

    .line 6
    invoke-direct {v7, v6}, Lcom/google/android/gms/internal/ads/zzfu;-><init>([B)V

    invoke-virtual {v7}, Lcom/google/android/gms/internal/ads/zzfu;->zze()I

    move-result v9

    const/16 v10, 0x20

    if-ge v9, v10, :cond_1

    :goto_1
    move/from16 v16, v3

    move-object/from16 v17, v4

    :goto_2
    const/4 v2, 0x0

    goto/16 :goto_5

    .line 7
    :cond_1
    invoke-virtual {v7, v1}, Lcom/google/android/gms/internal/ads/zzfu;->zzK(I)V

    invoke-virtual {v7}, Lcom/google/android/gms/internal/ads/zzfu;->zzb()I

    move-result v9

    .line 8
    invoke-virtual {v7}, Lcom/google/android/gms/internal/ads/zzfu;->zzg()I

    move-result v10

    const-string v11, "PsshAtomUtil"

    if-eq v10, v9, :cond_2

    new-instance v7, Ljava/lang/StringBuilder;

    const-string v8, "Advertised atom size ("

    .line 9
    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v8, ") does not match buffer size: "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-static {v11, v7}, Lcom/google/android/gms/internal/ads/zzfk;->zzf(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    .line 10
    :cond_2
    invoke-virtual {v7}, Lcom/google/android/gms/internal/ads/zzfu;->zzg()I

    move-result v9

    if-eq v9, v8, :cond_3

    new-instance v7, Ljava/lang/StringBuilder;

    const-string v8, "Atom type is not pssh: "

    .line 11
    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-static {v11, v7}, Lcom/google/android/gms/internal/ads/zzfk;->zzf(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    .line 12
    :cond_3
    invoke-virtual {v7}, Lcom/google/android/gms/internal/ads/zzfu;->zzg()I

    move-result v8

    invoke-static {v8}, Lcom/google/android/gms/internal/ads/zzajo;->zze(I)I

    move-result v8

    const/4 v9, 0x1

    if-le v8, v9, :cond_4

    new-instance v7, Ljava/lang/StringBuilder;

    const-string v9, "Unsupported pssh version: "

    .line 13
    invoke-direct {v7, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-static {v11, v7}, Lcom/google/android/gms/internal/ads/zzfk;->zzf(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    :cond_4
    new-instance v10, Ljava/util/UUID;

    .line 14
    invoke-virtual {v7}, Lcom/google/android/gms/internal/ads/zzfu;->zzt()J

    move-result-wide v12

    invoke-virtual {v7}, Lcom/google/android/gms/internal/ads/zzfu;->zzt()J

    move-result-wide v14

    invoke-direct {v10, v12, v13, v14, v15}, Ljava/util/UUID;-><init>(JJ)V

    if-ne v8, v9, :cond_6

    .line 15
    invoke-virtual {v7}, Lcom/google/android/gms/internal/ads/zzfu;->zzp()I

    move-result v9

    new-array v12, v9, [Ljava/util/UUID;

    move v13, v1

    :goto_3
    if-ge v13, v9, :cond_5

    new-instance v14, Ljava/util/UUID;

    move/from16 v16, v3

    .line 16
    invoke-virtual {v7}, Lcom/google/android/gms/internal/ads/zzfu;->zzt()J

    move-result-wide v2

    move-object/from16 v17, v4

    invoke-virtual {v7}, Lcom/google/android/gms/internal/ads/zzfu;->zzt()J

    move-result-wide v4

    invoke-direct {v14, v2, v3, v4, v5}, Ljava/util/UUID;-><init>(JJ)V

    aput-object v14, v12, v13

    add-int/lit8 v13, v13, 0x1

    move-object/from16 v5, p0

    move/from16 v3, v16

    move-object/from16 v4, v17

    goto :goto_3

    :cond_5
    move/from16 v16, v3

    move-object/from16 v17, v4

    goto :goto_4

    :cond_6
    move/from16 v16, v3

    move-object/from16 v17, v4

    const/4 v12, 0x0

    .line 17
    :goto_4
    invoke-virtual {v7}, Lcom/google/android/gms/internal/ads/zzfu;->zzp()I

    move-result v2

    invoke-virtual {v7}, Lcom/google/android/gms/internal/ads/zzfu;->zzb()I

    move-result v3

    if-eq v2, v3, :cond_7

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Atom data size ("

    .line 18
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ") does not match the bytes left: "

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v11, v2}, Lcom/google/android/gms/internal/ads/zzfk;->zzf(Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_2

    :cond_7
    new-array v3, v2, [B

    .line 19
    invoke-virtual {v7, v3, v1, v2}, Lcom/google/android/gms/internal/ads/zzfu;->zzG([BII)V

    new-instance v2, Lcom/google/android/gms/internal/ads/zzakl;

    invoke-direct {v2, v10, v8, v3, v12}, Lcom/google/android/gms/internal/ads/zzakl;-><init>(Ljava/util/UUID;I[B[Ljava/util/UUID;)V

    :goto_5
    if-nez v2, :cond_8

    const/4 v2, 0x0

    goto :goto_6

    .line 22
    :cond_8
    iget-object v2, v2, Lcom/google/android/gms/internal/ads/zzakl;->zza:Ljava/util/UUID;

    :goto_6
    if-nez v2, :cond_9

    .line 6
    const-string v2, "FragmentedMp4Extractor"

    const-string v3, "Skipped pssh atom (failed to extract uuid)"

    .line 20
    invoke-static {v2, v3}, Lcom/google/android/gms/internal/ads/zzfk;->zzf(Ljava/lang/String;Ljava/lang/String;)V

    move-object/from16 v4, v17

    goto :goto_7

    :cond_9
    new-instance v3, Lcom/google/android/gms/internal/ads/zzad;

    .line 21
    const-string v4, "video/mp4"

    const/4 v5, 0x0

    invoke-direct {v3, v2, v5, v4, v6}, Lcom/google/android/gms/internal/ads/zzad;-><init>(Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;[B)V

    move-object/from16 v4, v17

    .line 22
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_8

    :cond_a
    move/from16 v16, v3

    :goto_7
    const/4 v5, 0x0

    :goto_8
    add-int/lit8 v3, v16, 0x1

    goto/16 :goto_0

    :cond_b
    const/4 v5, 0x0

    if-nez v4, :cond_c

    return-object v5

    .line 19
    :cond_c
    new-instance v0, Lcom/google/android/gms/internal/ads/zzae;

    .line 23
    invoke-direct {v0, v4}, Lcom/google/android/gms/internal/ads/zzae;-><init>(Ljava/util/List;)V

    return-object v0
.end method

.method private final zzh()V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzakd;->zzq:I

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzakd;->zzt:I

    return-void
.end method

.method private static zzi(Lcom/google/android/gms/internal/ads/zzfu;ILcom/google/android/gms/internal/ads/zzakr;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/ads/zzch;
        }
    .end annotation

    add-int/lit8 p1, p1, 0x8

    .line 1
    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/ads/zzfu;->zzK(I)V

    .line 2
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzfu;->zzg()I

    move-result p1

    and-int/lit8 v0, p1, 0x1

    if-nez v0, :cond_3

    and-int/lit8 p1, p1, 0x2

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    move p1, v0

    .line 4
    :goto_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzfu;->zzp()I

    move-result v1

    if-nez v1, :cond_1

    iget-object p0, p2, Lcom/google/android/gms/internal/ads/zzakr;->zzl:[Z

    iget p1, p2, Lcom/google/android/gms/internal/ads/zzakr;->zze:I

    .line 5
    invoke-static {p0, v0, p1, v0}, Ljava/util/Arrays;->fill([ZIIZ)V

    return-void

    :cond_1
    iget v2, p2, Lcom/google/android/gms/internal/ads/zzakr;->zze:I

    if-ne v1, v2, :cond_2

    .line 6
    iget-object v2, p2, Lcom/google/android/gms/internal/ads/zzakr;->zzl:[Z

    .line 7
    invoke-static {v2, v0, v1, p1}, Ljava/util/Arrays;->fill([ZIIZ)V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzfu;->zzb()I

    move-result p1

    .line 8
    invoke-virtual {p2, p1}, Lcom/google/android/gms/internal/ads/zzakr;->zza(I)V

    iget-object p1, p2, Lcom/google/android/gms/internal/ads/zzakr;->zzn:Lcom/google/android/gms/internal/ads/zzfu;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzfu;->zzM()[B

    move-result-object v1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzfu;->zze()I

    move-result p1

    .line 9
    invoke-virtual {p0, v1, v0, p1}, Lcom/google/android/gms/internal/ads/zzfu;->zzG([BII)V

    iget-object p0, p2, Lcom/google/android/gms/internal/ads/zzakr;->zzn:Lcom/google/android/gms/internal/ads/zzfu;

    .line 10
    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ads/zzfu;->zzK(I)V

    iput-boolean v0, p2, Lcom/google/android/gms/internal/ads/zzakr;->zzo:Z

    return-void

    .line 5
    :cond_2
    new-instance p0, Ljava/lang/StringBuilder;

    const-string p1, "Senc sample count "

    .line 6
    invoke-direct {p0, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " is different from fragment sample count"

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const/4 p1, 0x0

    invoke-static {p0, p1}, Lcom/google/android/gms/internal/ads/zzch;->zza(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/google/android/gms/internal/ads/zzch;

    move-result-object p0

    throw p0

    .line 2
    :cond_3
    const-string p0, "Overriding TrackEncryptionBox parameters is unsupported."

    .line 3
    invoke-static {p0}, Lcom/google/android/gms/internal/ads/zzch;->zzc(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzch;

    move-result-object p0

    throw p0
.end method

.method private final zzj(J)V
    .locals 44
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/ads/zzch;
        }
    .end annotation

    move-object/from16 v0, p0

    .line 1
    :cond_0
    :goto_0
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzakd;->zzn:Ljava/util/ArrayDeque;

    invoke-virtual {v1}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_4f

    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzakd;->zzn:Ljava/util/ArrayDeque;

    invoke-virtual {v1}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/ads/zzajm;

    iget-wide v1, v1, Lcom/google/android/gms/internal/ads/zzajm;->zza:J

    cmp-long v1, v1, p1

    if-nez v1, :cond_4f

    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzakd;->zzn:Ljava/util/ArrayDeque;

    .line 2
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->pop()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lcom/google/android/gms/internal/ads/zzajm;

    .line 3
    iget v1, v2, Lcom/google/android/gms/internal/ads/zzajm;->zzd:I

    const v3, 0x6d6f6f76

    const/16 v6, 0xc

    const/16 v7, 0x8

    if-ne v1, v3, :cond_8

    .line 4
    iget-object v1, v2, Lcom/google/android/gms/internal/ads/zzajm;->zzb:Ljava/util/List;

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/zzakd;->zzg(Ljava/util/List;)Lcom/google/android/gms/internal/ads/zzae;

    move-result-object v1

    const v3, 0x6d766578

    .line 5
    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/ads/zzajm;->zza(I)Lcom/google/android/gms/internal/ads/zzajm;

    move-result-object v3

    .line 175
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    new-instance v12, Landroid/util/SparseArray;

    .line 6
    invoke-direct {v12}, Landroid/util/SparseArray;-><init>()V

    iget-object v8, v3, Lcom/google/android/gms/internal/ads/zzajm;->zzb:Ljava/util/List;

    .line 7
    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v8

    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    const/4 v9, 0x0

    :goto_1
    if-ge v9, v8, :cond_4

    iget-object v13, v3, Lcom/google/android/gms/internal/ads/zzajm;->zzb:Ljava/util/List;

    .line 8
    invoke-interface {v13, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lcom/google/android/gms/internal/ads/zzajn;

    .line 9
    iget v14, v13, Lcom/google/android/gms/internal/ads/zzajn;->zzd:I

    const v15, 0x74726578

    if-ne v14, v15, :cond_1

    .line 10
    iget-object v13, v13, Lcom/google/android/gms/internal/ads/zzajn;->zza:Lcom/google/android/gms/internal/ads/zzfu;

    .line 11
    invoke-virtual {v13, v6}, Lcom/google/android/gms/internal/ads/zzfu;->zzK(I)V

    .line 12
    invoke-virtual {v13}, Lcom/google/android/gms/internal/ads/zzfu;->zzg()I

    move-result v14

    .line 13
    invoke-virtual {v13}, Lcom/google/android/gms/internal/ads/zzfu;->zzg()I

    move-result v15

    add-int/lit8 v15, v15, -0x1

    .line 14
    invoke-virtual {v13}, Lcom/google/android/gms/internal/ads/zzfu;->zzg()I

    move-result v10

    .line 15
    invoke-virtual {v13}, Lcom/google/android/gms/internal/ads/zzfu;->zzg()I

    move-result v6

    .line 16
    invoke-virtual {v13}, Lcom/google/android/gms/internal/ads/zzfu;->zzg()I

    move-result v13

    .line 17
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    new-instance v11, Lcom/google/android/gms/internal/ads/zzajy;

    invoke-direct {v11, v15, v10, v6, v13}, Lcom/google/android/gms/internal/ads/zzajy;-><init>(IIII)V

    .line 18
    invoke-static {v14, v11}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    move-result-object v6

    .line 19
    iget-object v10, v6, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v10, Ljava/lang/Integer;

    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    move-result v10

    iget-object v6, v6, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v6, Lcom/google/android/gms/internal/ads/zzajy;

    invoke-virtual {v12, v10, v6}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    goto :goto_2

    :cond_1
    const v6, 0x6d656864

    if-ne v14, v6, :cond_3

    .line 20
    iget-object v4, v13, Lcom/google/android/gms/internal/ads/zzajn;->zza:Lcom/google/android/gms/internal/ads/zzfu;

    .line 21
    invoke-virtual {v4, v7}, Lcom/google/android/gms/internal/ads/zzfu;->zzK(I)V

    .line 22
    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/zzfu;->zzg()I

    move-result v5

    invoke-static {v5}, Lcom/google/android/gms/internal/ads/zzajo;->zze(I)I

    move-result v5

    if-nez v5, :cond_2

    .line 23
    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/zzfu;->zzu()J

    move-result-wide v4

    goto :goto_2

    :cond_2
    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/zzfu;->zzv()J

    move-result-wide v4

    :cond_3
    :goto_2
    add-int/lit8 v9, v9, 0x1

    const/16 v6, 0xc

    goto :goto_1

    :cond_4
    new-instance v3, Lcom/google/android/gms/internal/ads/zzaej;

    invoke-direct {v3}, Lcom/google/android/gms/internal/ads/zzaej;-><init>()V

    new-instance v9, Lcom/google/android/gms/internal/ads/zzaka;

    invoke-direct {v9, v0}, Lcom/google/android/gms/internal/ads/zzaka;-><init>(Lcom/google/android/gms/internal/ads/zzakd;)V

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v6, v1

    .line 24
    invoke-static/range {v2 .. v9}, Lcom/google/android/gms/internal/ads/zzajw;->zzd(Lcom/google/android/gms/internal/ads/zzajm;Lcom/google/android/gms/internal/ads/zzaej;JLcom/google/android/gms/internal/ads/zzae;ZZLcom/google/android/gms/internal/ads/zzfxu;)Ljava/util/List;

    move-result-object v1

    .line 25
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    iget-object v3, v0, Lcom/google/android/gms/internal/ads/zzakd;->zzf:Landroid/util/SparseArray;

    .line 26
    invoke-virtual {v3}, Landroid/util/SparseArray;->size()I

    move-result v3

    if-nez v3, :cond_6

    const/4 v10, 0x0

    :goto_3
    if-ge v10, v2, :cond_5

    .line 27
    invoke-interface {v1, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/android/gms/internal/ads/zzaks;

    .line 28
    iget-object v4, v3, Lcom/google/android/gms/internal/ads/zzaks;->zza:Lcom/google/android/gms/internal/ads/zzakp;

    new-instance v5, Lcom/google/android/gms/internal/ads/zzakc;

    iget-object v6, v0, Lcom/google/android/gms/internal/ads/zzakd;->zzF:Lcom/google/android/gms/internal/ads/zzadx;

    iget v7, v4, Lcom/google/android/gms/internal/ads/zzakp;->zzb:I

    .line 29
    invoke-interface {v6, v10, v7}, Lcom/google/android/gms/internal/ads/zzadx;->zzw(II)Lcom/google/android/gms/internal/ads/zzafa;

    move-result-object v6

    iget v7, v4, Lcom/google/android/gms/internal/ads/zzakp;->zza:I

    .line 30
    invoke-static {v12, v7}, Lcom/google/android/gms/internal/ads/zzakd;->zzk(Landroid/util/SparseArray;I)Lcom/google/android/gms/internal/ads/zzajy;

    move-result-object v7

    invoke-direct {v5, v6, v3, v7}, Lcom/google/android/gms/internal/ads/zzakc;-><init>(Lcom/google/android/gms/internal/ads/zzafa;Lcom/google/android/gms/internal/ads/zzaks;Lcom/google/android/gms/internal/ads/zzajy;)V

    iget-object v3, v0, Lcom/google/android/gms/internal/ads/zzakd;->zzf:Landroid/util/SparseArray;

    iget v6, v4, Lcom/google/android/gms/internal/ads/zzakp;->zza:I

    .line 31
    invoke-virtual {v3, v6, v5}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    iget-wide v5, v0, Lcom/google/android/gms/internal/ads/zzakd;->zzy:J

    iget-wide v3, v4, Lcom/google/android/gms/internal/ads/zzakp;->zze:J

    .line 32
    invoke-static {v5, v6, v3, v4}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v3

    iput-wide v3, v0, Lcom/google/android/gms/internal/ads/zzakd;->zzy:J

    add-int/lit8 v10, v10, 0x1

    goto :goto_3

    :cond_5
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzakd;->zzF:Lcom/google/android/gms/internal/ads/zzadx;

    .line 33
    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/zzadx;->zzD()V

    goto/16 :goto_0

    :cond_6
    iget-object v3, v0, Lcom/google/android/gms/internal/ads/zzakd;->zzf:Landroid/util/SparseArray;

    .line 34
    invoke-virtual {v3}, Landroid/util/SparseArray;->size()I

    move-result v3

    if-ne v3, v2, :cond_7

    const/4 v11, 0x1

    goto :goto_4

    :cond_7
    const/4 v11, 0x0

    :goto_4
    invoke-static {v11}, Lcom/google/android/gms/internal/ads/zzeq;->zzf(Z)V

    const/4 v10, 0x0

    :goto_5
    if-ge v10, v2, :cond_0

    .line 35
    invoke-interface {v1, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/android/gms/internal/ads/zzaks;

    .line 36
    iget-object v4, v3, Lcom/google/android/gms/internal/ads/zzaks;->zza:Lcom/google/android/gms/internal/ads/zzakp;

    iget-object v5, v0, Lcom/google/android/gms/internal/ads/zzakd;->zzf:Landroid/util/SparseArray;

    iget v6, v4, Lcom/google/android/gms/internal/ads/zzakp;->zza:I

    .line 37
    invoke-virtual {v5, v6}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/google/android/gms/internal/ads/zzakc;

    iget v4, v4, Lcom/google/android/gms/internal/ads/zzakp;->zza:I

    .line 38
    invoke-static {v12, v4}, Lcom/google/android/gms/internal/ads/zzakd;->zzk(Landroid/util/SparseArray;I)Lcom/google/android/gms/internal/ads/zzajy;

    move-result-object v4

    invoke-virtual {v5, v3, v4}, Lcom/google/android/gms/internal/ads/zzakc;->zzh(Lcom/google/android/gms/internal/ads/zzaks;Lcom/google/android/gms/internal/ads/zzajy;)V

    add-int/lit8 v10, v10, 0x1

    goto :goto_5

    :cond_8
    const v3, 0x6d6f6f66

    if-ne v1, v3, :cond_4d

    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzakd;->zzf:Landroid/util/SparseArray;

    iget-object v3, v0, Lcom/google/android/gms/internal/ads/zzakd;->zzj:[B

    .line 39
    iget-object v6, v2, Lcom/google/android/gms/internal/ads/zzajm;->zzc:Ljava/util/List;

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v6

    const/4 v8, 0x0

    :goto_6
    if-ge v8, v6, :cond_47

    .line 40
    iget-object v10, v2, Lcom/google/android/gms/internal/ads/zzajm;->zzc:Ljava/util/List;

    invoke-interface {v10, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lcom/google/android/gms/internal/ads/zzajm;

    .line 41
    iget v11, v10, Lcom/google/android/gms/internal/ads/zzajm;->zzd:I

    const v12, 0x74726166

    if-ne v11, v12, :cond_46

    const v11, 0x74666864

    .line 42
    invoke-virtual {v10, v11}, Lcom/google/android/gms/internal/ads/zzajm;->zzb(I)Lcom/google/android/gms/internal/ads/zzajn;

    move-result-object v11

    .line 183
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    iget-object v11, v11, Lcom/google/android/gms/internal/ads/zzajn;->zza:Lcom/google/android/gms/internal/ads/zzfu;

    .line 43
    invoke-virtual {v11, v7}, Lcom/google/android/gms/internal/ads/zzfu;->zzK(I)V

    .line 44
    invoke-virtual {v11}, Lcom/google/android/gms/internal/ads/zzfu;->zzg()I

    move-result v12

    .line 45
    invoke-virtual {v11}, Lcom/google/android/gms/internal/ads/zzfu;->zzg()I

    move-result v13

    .line 46
    invoke-virtual {v1, v13}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lcom/google/android/gms/internal/ads/zzakc;

    if-nez v13, :cond_9

    const/4 v13, 0x0

    goto :goto_b

    :cond_9
    and-int/lit8 v14, v12, 0x1

    if-eqz v14, :cond_a

    .line 47
    invoke-virtual {v11}, Lcom/google/android/gms/internal/ads/zzfu;->zzv()J

    move-result-wide v14

    iget-object v4, v13, Lcom/google/android/gms/internal/ads/zzakc;->zzb:Lcom/google/android/gms/internal/ads/zzakr;

    iput-wide v14, v4, Lcom/google/android/gms/internal/ads/zzakr;->zzb:J

    iput-wide v14, v4, Lcom/google/android/gms/internal/ads/zzakr;->zzc:J

    :cond_a
    iget-object v4, v13, Lcom/google/android/gms/internal/ads/zzakc;->zze:Lcom/google/android/gms/internal/ads/zzajy;

    and-int/lit8 v5, v12, 0x2

    if-eqz v5, :cond_b

    .line 48
    invoke-virtual {v11}, Lcom/google/android/gms/internal/ads/zzfu;->zzg()I

    move-result v5

    add-int/lit8 v5, v5, -0x1

    goto :goto_7

    .line 49
    :cond_b
    iget v5, v4, Lcom/google/android/gms/internal/ads/zzajy;->zza:I

    :goto_7
    and-int/lit8 v14, v12, 0x8

    if-eqz v14, :cond_c

    .line 50
    invoke-virtual {v11}, Lcom/google/android/gms/internal/ads/zzfu;->zzg()I

    move-result v14

    goto :goto_8

    .line 51
    :cond_c
    iget v14, v4, Lcom/google/android/gms/internal/ads/zzajy;->zzb:I

    :goto_8
    and-int/lit8 v15, v12, 0x10

    if-eqz v15, :cond_d

    .line 52
    invoke-virtual {v11}, Lcom/google/android/gms/internal/ads/zzfu;->zzg()I

    move-result v15

    goto :goto_9

    .line 53
    :cond_d
    iget v15, v4, Lcom/google/android/gms/internal/ads/zzajy;->zzc:I

    :goto_9
    and-int/lit8 v12, v12, 0x20

    if-eqz v12, :cond_e

    .line 54
    invoke-virtual {v11}, Lcom/google/android/gms/internal/ads/zzfu;->zzg()I

    move-result v4

    goto :goto_a

    .line 55
    :cond_e
    iget v4, v4, Lcom/google/android/gms/internal/ads/zzajy;->zzd:I

    .line 54
    :goto_a
    iget-object v11, v13, Lcom/google/android/gms/internal/ads/zzakc;->zzb:Lcom/google/android/gms/internal/ads/zzakr;

    new-instance v12, Lcom/google/android/gms/internal/ads/zzajy;

    invoke-direct {v12, v5, v14, v15, v4}, Lcom/google/android/gms/internal/ads/zzajy;-><init>(IIII)V

    iput-object v12, v11, Lcom/google/android/gms/internal/ads/zzakr;->zza:Lcom/google/android/gms/internal/ads/zzajy;

    :goto_b
    if-nez v13, :cond_f

    goto/16 :goto_2d

    .line 46
    :cond_f
    iget-object v4, v13, Lcom/google/android/gms/internal/ads/zzakc;->zzb:Lcom/google/android/gms/internal/ads/zzakr;

    iget-wide v11, v4, Lcom/google/android/gms/internal/ads/zzakr;->zzp:J

    iget-boolean v5, v4, Lcom/google/android/gms/internal/ads/zzakr;->zzq:Z

    .line 56
    invoke-virtual {v13}, Lcom/google/android/gms/internal/ads/zzakc;->zzi()V

    const/4 v14, 0x1

    .line 57
    invoke-static {v13, v14}, Lcom/google/android/gms/internal/ads/zzakc;->zzg(Lcom/google/android/gms/internal/ads/zzakc;Z)V

    const v15, 0x74666474

    .line 58
    invoke-virtual {v10, v15}, Lcom/google/android/gms/internal/ads/zzajm;->zzb(I)Lcom/google/android/gms/internal/ads/zzajn;

    move-result-object v15

    if-eqz v15, :cond_11

    iget-object v5, v15, Lcom/google/android/gms/internal/ads/zzajn;->zza:Lcom/google/android/gms/internal/ads/zzfu;

    .line 59
    invoke-virtual {v5, v7}, Lcom/google/android/gms/internal/ads/zzfu;->zzK(I)V

    .line 60
    invoke-virtual {v5}, Lcom/google/android/gms/internal/ads/zzfu;->zzg()I

    move-result v11

    invoke-static {v11}, Lcom/google/android/gms/internal/ads/zzajo;->zze(I)I

    move-result v11

    if-ne v11, v14, :cond_10

    .line 61
    invoke-virtual {v5}, Lcom/google/android/gms/internal/ads/zzfu;->zzv()J

    move-result-wide v11

    goto :goto_c

    :cond_10
    invoke-virtual {v5}, Lcom/google/android/gms/internal/ads/zzfu;->zzu()J

    move-result-wide v11

    :goto_c
    iput-wide v11, v4, Lcom/google/android/gms/internal/ads/zzakr;->zzp:J

    iput-boolean v14, v4, Lcom/google/android/gms/internal/ads/zzakr;->zzq:Z

    goto :goto_d

    :cond_11
    iput-wide v11, v4, Lcom/google/android/gms/internal/ads/zzakr;->zzp:J

    iput-boolean v5, v4, Lcom/google/android/gms/internal/ads/zzakr;->zzq:Z

    .line 62
    :goto_d
    iget-object v5, v10, Lcom/google/android/gms/internal/ads/zzajm;->zzb:Ljava/util/List;

    .line 63
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v11

    const/4 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    :goto_e
    const v9, 0x7472756e

    if-ge v12, v11, :cond_13

    .line 64
    invoke-interface {v5, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v16

    move-object/from16 v7, v16

    check-cast v7, Lcom/google/android/gms/internal/ads/zzajn;

    move-object/from16 v16, v1

    .line 65
    iget v1, v7, Lcom/google/android/gms/internal/ads/zzajn;->zzd:I

    if-ne v1, v9, :cond_12

    .line 66
    iget-object v1, v7, Lcom/google/android/gms/internal/ads/zzajn;->zza:Lcom/google/android/gms/internal/ads/zzfu;

    const/16 v7, 0xc

    .line 67
    invoke-virtual {v1, v7}, Lcom/google/android/gms/internal/ads/zzfu;->zzK(I)V

    .line 68
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzfu;->zzp()I

    move-result v1

    if-lez v1, :cond_12

    add-int/2addr v15, v1

    add-int/lit8 v14, v14, 0x1

    :cond_12
    add-int/lit8 v12, v12, 0x1

    move-object/from16 v1, v16

    const/16 v7, 0x8

    goto :goto_e

    :cond_13
    move-object/from16 v16, v1

    const/4 v1, 0x0

    iput v1, v13, Lcom/google/android/gms/internal/ads/zzakc;->zzh:I

    iput v1, v13, Lcom/google/android/gms/internal/ads/zzakc;->zzg:I

    iput v1, v13, Lcom/google/android/gms/internal/ads/zzakc;->zzf:I

    iget-object v1, v13, Lcom/google/android/gms/internal/ads/zzakc;->zzb:Lcom/google/android/gms/internal/ads/zzakr;

    iput v14, v1, Lcom/google/android/gms/internal/ads/zzakr;->zzd:I

    iput v15, v1, Lcom/google/android/gms/internal/ads/zzakr;->zze:I

    iget-object v7, v1, Lcom/google/android/gms/internal/ads/zzakr;->zzg:[I

    .line 69
    array-length v7, v7

    if-ge v7, v14, :cond_14

    new-array v7, v14, [J

    iput-object v7, v1, Lcom/google/android/gms/internal/ads/zzakr;->zzf:[J

    new-array v7, v14, [I

    iput-object v7, v1, Lcom/google/android/gms/internal/ads/zzakr;->zzg:[I

    :cond_14
    iget-object v7, v1, Lcom/google/android/gms/internal/ads/zzakr;->zzh:[I

    .line 70
    array-length v7, v7

    if-ge v7, v15, :cond_15

    mul-int/lit8 v15, v15, 0x7d

    div-int/lit8 v15, v15, 0x64

    .line 71
    new-array v7, v15, [I

    iput-object v7, v1, Lcom/google/android/gms/internal/ads/zzakr;->zzh:[I

    .line 72
    new-array v7, v15, [J

    iput-object v7, v1, Lcom/google/android/gms/internal/ads/zzakr;->zzi:[J

    .line 73
    new-array v7, v15, [Z

    iput-object v7, v1, Lcom/google/android/gms/internal/ads/zzakr;->zzj:[Z

    .line 74
    new-array v7, v15, [Z

    iput-object v7, v1, Lcom/google/android/gms/internal/ads/zzakr;->zzl:[Z

    :cond_15
    const/4 v1, 0x0

    const/4 v7, 0x0

    const/4 v12, 0x0

    :goto_f
    if-ge v1, v11, :cond_28

    .line 75
    invoke-interface {v5, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Lcom/google/android/gms/internal/ads/zzajn;

    .line 76
    iget v14, v15, Lcom/google/android/gms/internal/ads/zzajn;->zzd:I

    if-ne v14, v9, :cond_27

    add-int/lit8 v14, v7, 0x1

    .line 77
    iget-object v15, v15, Lcom/google/android/gms/internal/ads/zzajn;->zza:Lcom/google/android/gms/internal/ads/zzfu;

    const/16 v9, 0x8

    .line 78
    invoke-virtual {v15, v9}, Lcom/google/android/gms/internal/ads/zzfu;->zzK(I)V

    .line 79
    invoke-virtual {v15}, Lcom/google/android/gms/internal/ads/zzfu;->zzg()I

    move-result v9

    move-object/from16 v19, v5

    iget-object v5, v13, Lcom/google/android/gms/internal/ads/zzakc;->zzd:Lcom/google/android/gms/internal/ads/zzaks;

    .line 80
    iget-object v5, v5, Lcom/google/android/gms/internal/ads/zzaks;->zza:Lcom/google/android/gms/internal/ads/zzakp;

    move/from16 v20, v6

    iget-object v6, v13, Lcom/google/android/gms/internal/ads/zzakc;->zzb:Lcom/google/android/gms/internal/ads/zzakr;

    move/from16 v21, v11

    iget-object v11, v6, Lcom/google/android/gms/internal/ads/zzakr;->zza:Lcom/google/android/gms/internal/ads/zzajy;

    .line 81
    sget v22, Lcom/google/android/gms/internal/ads/zzgd;->zza:I

    move/from16 v22, v14

    iget-object v14, v6, Lcom/google/android/gms/internal/ads/zzakr;->zzg:[I

    .line 82
    invoke-virtual {v15}, Lcom/google/android/gms/internal/ads/zzfu;->zzp()I

    move-result v23

    aput v23, v14, v7

    iget-object v14, v6, Lcom/google/android/gms/internal/ads/zzakr;->zzf:[J

    move-object/from16 v23, v2

    move-object/from16 v24, v3

    iget-wide v2, v6, Lcom/google/android/gms/internal/ads/zzakr;->zzb:J

    .line 83
    aput-wide v2, v14, v7

    and-int/lit8 v25, v9, 0x1

    if-eqz v25, :cond_16

    .line 84
    invoke-virtual {v15}, Lcom/google/android/gms/internal/ads/zzfu;->zzg()I

    move-result v0

    move/from16 v25, v1

    int-to-long v0, v0

    add-long/2addr v2, v0

    aput-wide v2, v14, v7

    goto :goto_10

    :cond_16
    move/from16 v25, v1

    :goto_10
    and-int/lit8 v0, v9, 0x4

    if-eqz v0, :cond_17

    const/4 v0, 0x1

    goto :goto_11

    :cond_17
    const/4 v0, 0x0

    .line 85
    :goto_11
    iget v1, v11, Lcom/google/android/gms/internal/ads/zzajy;->zzd:I

    if-eqz v0, :cond_18

    .line 86
    invoke-virtual {v15}, Lcom/google/android/gms/internal/ads/zzfu;->zzg()I

    move-result v1

    :cond_18
    and-int/lit16 v2, v9, 0x100

    and-int/lit16 v3, v9, 0x200

    and-int/lit16 v14, v9, 0x400

    and-int/lit16 v9, v9, 0x800

    move/from16 v26, v1

    iget-object v1, v5, Lcom/google/android/gms/internal/ads/zzakp;->zzh:[J

    if-eqz v1, :cond_1d

    move/from16 v27, v8

    array-length v8, v1

    move-object/from16 v28, v10

    const/4 v10, 0x1

    if-ne v8, v10, :cond_1c

    iget-object v8, v5, Lcom/google/android/gms/internal/ads/zzakp;->zzi:[J

    if-nez v8, :cond_19

    goto :goto_13

    :cond_19
    const/4 v10, 0x0

    .line 87
    aget-wide v29, v1, v10

    const-wide/16 v17, 0x0

    cmp-long v1, v29, v17

    if-nez v1, :cond_1a

    move v10, v0

    move/from16 v29, v9

    goto :goto_12

    .line 88
    :cond_1a
    aget-wide v31, v8, v10

    add-long v33, v29, v31

    move v1, v9

    iget-wide v8, v5, Lcom/google/android/gms/internal/ads/zzakp;->zzd:J

    sget-object v39, Ljava/math/RoundingMode;->FLOOR:Ljava/math/RoundingMode;

    const-wide/32 v35, 0xf4240

    move-wide/from16 v37, v8

    .line 89
    invoke-static/range {v33 .. v39}, Lcom/google/android/gms/internal/ads/zzgd;->zzt(JJJLjava/math/RoundingMode;)J

    move-result-wide v8

    move v10, v0

    move/from16 v29, v1

    iget-wide v0, v5, Lcom/google/android/gms/internal/ads/zzakp;->zze:J

    cmp-long v0, v8, v0

    if-gez v0, :cond_1b

    goto :goto_14

    .line 87
    :cond_1b
    :goto_12
    iget-object v0, v5, Lcom/google/android/gms/internal/ads/zzakp;->zzi:[J

    const/4 v1, 0x0

    .line 90
    aget-wide v8, v0, v1

    move-wide/from16 v17, v8

    goto :goto_15

    :cond_1c
    :goto_13
    move v10, v0

    move/from16 v29, v9

    goto :goto_14

    :cond_1d
    move/from16 v27, v8

    move/from16 v29, v9

    move-object/from16 v28, v10

    move v10, v0

    :goto_14
    const-wide/16 v17, 0x0

    .line 86
    :goto_15
    iget-object v0, v6, Lcom/google/android/gms/internal/ads/zzakr;->zzh:[I

    iget-object v1, v6, Lcom/google/android/gms/internal/ads/zzakr;->zzi:[J

    iget-object v8, v6, Lcom/google/android/gms/internal/ads/zzakr;->zzj:[Z

    iget-object v9, v6, Lcom/google/android/gms/internal/ads/zzakr;->zzg:[I

    .line 91
    aget v7, v9, v7

    add-int/2addr v7, v12

    move-object v9, v4

    iget-wide v4, v5, Lcom/google/android/gms/internal/ads/zzakp;->zzc:J

    move-object/from16 v37, v8

    move-object/from16 v38, v9

    iget-wide v8, v6, Lcom/google/android/gms/internal/ads/zzakr;->zzp:J

    :goto_16
    if-ge v12, v7, :cond_26

    if-eqz v2, :cond_1e

    .line 92
    invoke-virtual {v15}, Lcom/google/android/gms/internal/ads/zzfu;->zzg()I

    move-result v30

    move/from16 v39, v2

    move/from16 v2, v30

    goto :goto_17

    :cond_1e
    move/from16 v39, v2

    iget v2, v11, Lcom/google/android/gms/internal/ads/zzajy;->zzb:I

    :goto_17
    invoke-static {v2}, Lcom/google/android/gms/internal/ads/zzakd;->zza(I)I

    if-eqz v3, :cond_1f

    .line 93
    invoke-virtual {v15}, Lcom/google/android/gms/internal/ads/zzfu;->zzg()I

    move-result v30

    move/from16 v40, v3

    move/from16 v3, v30

    goto :goto_18

    :cond_1f
    move/from16 v40, v3

    iget v3, v11, Lcom/google/android/gms/internal/ads/zzajy;->zzc:I

    :goto_18
    invoke-static {v3}, Lcom/google/android/gms/internal/ads/zzakd;->zza(I)I

    if-eqz v14, :cond_20

    .line 94
    invoke-virtual {v15}, Lcom/google/android/gms/internal/ads/zzfu;->zzg()I

    move-result v30

    move/from16 v41, v7

    move/from16 v7, v30

    goto :goto_19

    :cond_20
    move/from16 v41, v7

    if-nez v12, :cond_22

    if-eqz v10, :cond_21

    move/from16 v7, v26

    const/4 v12, 0x0

    goto :goto_19

    :cond_21
    const/4 v12, 0x0

    .line 95
    :cond_22
    iget v7, v11, Lcom/google/android/gms/internal/ads/zzajy;->zzd:I

    :goto_19
    if-eqz v29, :cond_23

    .line 96
    invoke-virtual {v15}, Lcom/google/android/gms/internal/ads/zzfu;->zzg()I

    move-result v30

    move/from16 v42, v10

    move-object/from16 v43, v11

    move/from16 v10, v30

    goto :goto_1a

    :cond_23
    move/from16 v42, v10

    move-object/from16 v43, v11

    const/4 v10, 0x0

    :goto_1a
    int-to-long v10, v10

    add-long/2addr v10, v8

    sub-long v30, v10, v17

    const-wide/32 v32, 0xf4240

    sget-object v36, Ljava/math/RoundingMode;->FLOOR:Ljava/math/RoundingMode;

    move-wide/from16 v34, v4

    .line 97
    invoke-static/range {v30 .. v36}, Lcom/google/android/gms/internal/ads/zzgd;->zzt(JJJLjava/math/RoundingMode;)J

    move-result-wide v10

    .line 98
    aput-wide v10, v1, v12

    move-wide/from16 v30, v4

    iget-boolean v4, v6, Lcom/google/android/gms/internal/ads/zzakr;->zzq:Z

    if-nez v4, :cond_24

    iget-object v4, v13, Lcom/google/android/gms/internal/ads/zzakc;->zzd:Lcom/google/android/gms/internal/ads/zzaks;

    .line 99
    iget-wide v4, v4, Lcom/google/android/gms/internal/ads/zzaks;->zzh:J

    add-long/2addr v10, v4

    aput-wide v10, v1, v12

    .line 100
    :cond_24
    aput v3, v0, v12

    const/16 v3, 0x10

    shr-int/lit8 v4, v7, 0x10

    const/4 v3, 0x1

    and-int/2addr v4, v3

    xor-int/2addr v4, v3

    if-eq v3, v4, :cond_25

    const/4 v3, 0x0

    goto :goto_1b

    :cond_25
    const/4 v3, 0x1

    .line 101
    :goto_1b
    aput-boolean v3, v37, v12

    int-to-long v2, v2

    add-long/2addr v8, v2

    add-int/lit8 v12, v12, 0x1

    move-wide/from16 v4, v30

    move/from16 v2, v39

    move/from16 v3, v40

    move/from16 v7, v41

    move/from16 v10, v42

    move-object/from16 v11, v43

    goto/16 :goto_16

    :cond_26
    move/from16 v41, v7

    .line 92
    iput-wide v8, v6, Lcom/google/android/gms/internal/ads/zzakr;->zzp:J

    move/from16 v7, v22

    move/from16 v12, v41

    goto :goto_1c

    :cond_27
    move/from16 v25, v1

    move-object/from16 v23, v2

    move-object/from16 v24, v3

    move-object/from16 v38, v4

    move-object/from16 v19, v5

    move/from16 v20, v6

    move/from16 v27, v8

    move-object/from16 v28, v10

    move/from16 v21, v11

    :goto_1c
    add-int/lit8 v1, v25, 0x1

    move-object/from16 v0, p0

    move-object/from16 v5, v19

    move/from16 v6, v20

    move/from16 v11, v21

    move-object/from16 v2, v23

    move-object/from16 v3, v24

    move/from16 v8, v27

    move-object/from16 v10, v28

    move-object/from16 v4, v38

    const v9, 0x7472756e

    goto/16 :goto_f

    :cond_28
    move-object/from16 v23, v2

    move-object/from16 v24, v3

    move-object/from16 v38, v4

    move/from16 v20, v6

    move/from16 v27, v8

    move-object/from16 v28, v10

    .line 89
    iget-object v0, v13, Lcom/google/android/gms/internal/ads/zzakc;->zzd:Lcom/google/android/gms/internal/ads/zzaks;

    .line 102
    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zzaks;->zza:Lcom/google/android/gms/internal/ads/zzakp;

    move-object/from16 v1, v38

    iget-object v2, v1, Lcom/google/android/gms/internal/ads/zzakr;->zza:Lcom/google/android/gms/internal/ads/zzajy;

    .line 182
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 102
    iget v2, v2, Lcom/google/android/gms/internal/ads/zzajy;->zza:I

    .line 103
    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/ads/zzakp;->zza(I)Lcom/google/android/gms/internal/ads/zzakq;

    move-result-object v0

    const v2, 0x7361697a

    move-object/from16 v10, v28

    .line 104
    invoke-virtual {v10, v2}, Lcom/google/android/gms/internal/ads/zzajm;->zzb(I)Lcom/google/android/gms/internal/ads/zzajn;

    move-result-object v2

    if-eqz v2, :cond_2f

    .line 181
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 104
    iget-object v2, v2, Lcom/google/android/gms/internal/ads/zzajn;->zza:Lcom/google/android/gms/internal/ads/zzfu;

    const/16 v3, 0x8

    .line 105
    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/ads/zzfu;->zzK(I)V

    .line 106
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzfu;->zzg()I

    move-result v4

    const/4 v5, 0x1

    and-int/2addr v4, v5

    if-ne v4, v5, :cond_29

    .line 107
    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/ads/zzfu;->zzL(I)V

    .line 108
    :cond_29
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzfu;->zzm()I

    move-result v3

    .line 109
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzfu;->zzp()I

    move-result v4

    iget v5, v1, Lcom/google/android/gms/internal/ads/zzakr;->zze:I

    if-gt v4, v5, :cond_2e

    .line 176
    iget v5, v0, Lcom/google/android/gms/internal/ads/zzakq;->zzd:I

    if-nez v3, :cond_2c

    iget-object v3, v1, Lcom/google/android/gms/internal/ads/zzakr;->zzl:[Z

    const/4 v6, 0x0

    const/4 v7, 0x0

    :goto_1d
    if-ge v6, v4, :cond_2b

    .line 110
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzfu;->zzm()I

    move-result v8

    add-int/2addr v7, v8

    if-le v8, v5, :cond_2a

    const/4 v8, 0x1

    goto :goto_1e

    :cond_2a
    const/4 v8, 0x0

    .line 111
    :goto_1e
    aput-boolean v8, v3, v6

    add-int/lit8 v6, v6, 0x1

    goto :goto_1d

    :cond_2b
    const/4 v5, 0x0

    goto :goto_20

    :cond_2c
    if-le v3, v5, :cond_2d

    const/4 v2, 0x1

    goto :goto_1f

    :cond_2d
    const/4 v2, 0x0

    :goto_1f
    mul-int v7, v3, v4

    .line 120
    iget-object v3, v1, Lcom/google/android/gms/internal/ads/zzakr;->zzl:[Z

    const/4 v5, 0x0

    .line 112
    invoke-static {v3, v5, v4, v2}, Ljava/util/Arrays;->fill([ZIIZ)V

    .line 111
    :goto_20
    iget-object v2, v1, Lcom/google/android/gms/internal/ads/zzakr;->zzl:[Z

    iget v3, v1, Lcom/google/android/gms/internal/ads/zzakr;->zze:I

    .line 113
    invoke-static {v2, v4, v3, v5}, Ljava/util/Arrays;->fill([ZIIZ)V

    if-lez v7, :cond_2f

    .line 114
    invoke-virtual {v1, v7}, Lcom/google/android/gms/internal/ads/zzakr;->zza(I)V

    goto :goto_21

    .line 109
    :cond_2e
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Saiz sample count "

    .line 176
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " is greater than fragment sample count"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/zzch;->zza(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/google/android/gms/internal/ads/zzch;

    move-result-object v0

    throw v0

    :cond_2f
    :goto_21
    const v2, 0x7361696f

    .line 115
    invoke-virtual {v10, v2}, Lcom/google/android/gms/internal/ads/zzajm;->zzb(I)Lcom/google/android/gms/internal/ads/zzajn;

    move-result-object v2

    if-eqz v2, :cond_33

    iget-object v2, v2, Lcom/google/android/gms/internal/ads/zzajn;->zza:Lcom/google/android/gms/internal/ads/zzfu;

    const/16 v3, 0x8

    .line 116
    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/ads/zzfu;->zzK(I)V

    .line 117
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzfu;->zzg()I

    move-result v4

    and-int/lit8 v5, v4, 0x1

    const/4 v6, 0x1

    if-ne v5, v6, :cond_30

    .line 118
    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/ads/zzfu;->zzL(I)V

    .line 119
    :cond_30
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzfu;->zzp()I

    move-result v3

    if-ne v3, v6, :cond_32

    .line 177
    invoke-static {v4}, Lcom/google/android/gms/internal/ads/zzajo;->zze(I)I

    move-result v3

    iget-wide v4, v1, Lcom/google/android/gms/internal/ads/zzakr;->zzc:J

    if-nez v3, :cond_31

    .line 120
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzfu;->zzu()J

    move-result-wide v2

    goto :goto_22

    :cond_31
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzfu;->zzv()J

    move-result-wide v2

    :goto_22
    add-long/2addr v4, v2

    iput-wide v4, v1, Lcom/google/android/gms/internal/ads/zzakr;->zzc:J

    goto :goto_23

    .line 119
    :cond_32
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Unexpected saio entry count: "

    .line 177
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x0

    invoke-static {v0, v2}, Lcom/google/android/gms/internal/ads/zzch;->zza(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/google/android/gms/internal/ads/zzch;

    move-result-object v0

    throw v0

    :cond_33
    :goto_23
    const/4 v2, 0x0

    const v3, 0x73656e63

    .line 121
    invoke-virtual {v10, v3}, Lcom/google/android/gms/internal/ads/zzajm;->zzb(I)Lcom/google/android/gms/internal/ads/zzajn;

    move-result-object v3

    if-eqz v3, :cond_34

    iget-object v3, v3, Lcom/google/android/gms/internal/ads/zzajn;->zza:Lcom/google/android/gms/internal/ads/zzfu;

    const/4 v4, 0x0

    .line 122
    invoke-static {v3, v4, v1}, Lcom/google/android/gms/internal/ads/zzakd;->zzi(Lcom/google/android/gms/internal/ads/zzfu;ILcom/google/android/gms/internal/ads/zzakr;)V

    :cond_34
    if-eqz v0, :cond_35

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zzakq;->zzb:Ljava/lang/String;

    move-object/from16 v30, v0

    goto :goto_24

    :cond_35
    move-object/from16 v30, v2

    :goto_24
    move-object v0, v2

    move-object v3, v0

    const/4 v4, 0x0

    .line 123
    :goto_25
    iget-object v5, v10, Lcom/google/android/gms/internal/ads/zzajm;->zzb:Ljava/util/List;

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v5

    if-ge v4, v5, :cond_38

    .line 124
    iget-object v5, v10, Lcom/google/android/gms/internal/ads/zzajm;->zzb:Ljava/util/List;

    invoke-interface {v5, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/google/android/gms/internal/ads/zzajn;

    .line 125
    iget-object v6, v5, Lcom/google/android/gms/internal/ads/zzajn;->zza:Lcom/google/android/gms/internal/ads/zzfu;

    .line 126
    iget v5, v5, Lcom/google/android/gms/internal/ads/zzajn;->zzd:I

    const v7, 0x73626770

    const v8, 0x73656967

    if-ne v5, v7, :cond_36

    const/16 v7, 0xc

    .line 127
    invoke-virtual {v6, v7}, Lcom/google/android/gms/internal/ads/zzfu;->zzK(I)V

    .line 128
    invoke-virtual {v6}, Lcom/google/android/gms/internal/ads/zzfu;->zzg()I

    move-result v5

    if-ne v5, v8, :cond_37

    move-object v0, v6

    goto :goto_26

    :cond_36
    const/16 v7, 0xc

    const v9, 0x73677064

    if-ne v5, v9, :cond_37

    .line 129
    invoke-virtual {v6, v7}, Lcom/google/android/gms/internal/ads/zzfu;->zzK(I)V

    .line 130
    invoke-virtual {v6}, Lcom/google/android/gms/internal/ads/zzfu;->zzg()I

    move-result v5

    if-ne v5, v8, :cond_37

    move-object v3, v6

    :cond_37
    :goto_26
    add-int/lit8 v4, v4, 0x1

    goto :goto_25

    :cond_38
    const/16 v7, 0xc

    if-eqz v0, :cond_41

    if-nez v3, :cond_39

    goto/16 :goto_29

    :cond_39
    const/16 v4, 0x8

    .line 131
    invoke-virtual {v0, v4}, Lcom/google/android/gms/internal/ads/zzfu;->zzK(I)V

    .line 132
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzfu;->zzg()I

    move-result v5

    invoke-static {v5}, Lcom/google/android/gms/internal/ads/zzajo;->zze(I)I

    move-result v5

    const/4 v6, 0x4

    .line 133
    invoke-virtual {v0, v6}, Lcom/google/android/gms/internal/ads/zzfu;->zzL(I)V

    const/4 v8, 0x1

    if-ne v5, v8, :cond_3a

    .line 134
    invoke-virtual {v0, v6}, Lcom/google/android/gms/internal/ads/zzfu;->zzL(I)V

    .line 135
    :cond_3a
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzfu;->zzg()I

    move-result v0

    if-ne v0, v8, :cond_40

    .line 136
    invoke-virtual {v3, v4}, Lcom/google/android/gms/internal/ads/zzfu;->zzK(I)V

    .line 137
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzfu;->zzg()I

    move-result v0

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzajo;->zze(I)I

    move-result v0

    .line 138
    invoke-virtual {v3, v6}, Lcom/google/android/gms/internal/ads/zzfu;->zzL(I)V

    if-ne v0, v8, :cond_3c

    .line 139
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzfu;->zzu()J

    move-result-wide v4

    const-wide/16 v8, 0x0

    cmp-long v0, v4, v8

    if-eqz v0, :cond_3b

    goto :goto_27

    .line 173
    :cond_3b
    const-string v0, "Variable length description in sgpd found (unsupported)"

    .line 179
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzch;->zzc(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzch;

    move-result-object v0

    throw v0

    :cond_3c
    const/4 v4, 0x2

    if-lt v0, v4, :cond_3d

    .line 140
    invoke-virtual {v3, v6}, Lcom/google/android/gms/internal/ads/zzfu;->zzL(I)V

    .line 141
    :cond_3d
    :goto_27
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzfu;->zzu()J

    move-result-wide v4

    const-wide/16 v8, 0x1

    cmp-long v0, v4, v8

    if-nez v0, :cond_3f

    const/4 v0, 0x1

    .line 142
    invoke-virtual {v3, v0}, Lcom/google/android/gms/internal/ads/zzfu;->zzL(I)V

    .line 143
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzfu;->zzm()I

    move-result v4

    and-int/lit16 v5, v4, 0xf0

    shr-int/lit8 v33, v5, 0x4

    and-int/lit8 v34, v4, 0xf

    .line 144
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzfu;->zzm()I

    move-result v4

    if-ne v4, v0, :cond_42

    .line 145
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzfu;->zzm()I

    move-result v31

    const/16 v4, 0x10

    new-array v5, v4, [B

    const/4 v6, 0x0

    .line 146
    invoke-virtual {v3, v5, v6, v4}, Lcom/google/android/gms/internal/ads/zzfu;->zzG([BII)V

    if-nez v31, :cond_3e

    .line 147
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzfu;->zzm()I

    move-result v2

    new-array v9, v2, [B

    .line 148
    invoke-virtual {v3, v9, v6, v2}, Lcom/google/android/gms/internal/ads/zzfu;->zzG([BII)V

    move-object/from16 v35, v9

    goto :goto_28

    :cond_3e
    move-object/from16 v35, v2

    :goto_28
    iput-boolean v0, v1, Lcom/google/android/gms/internal/ads/zzakr;->zzk:Z

    new-instance v2, Lcom/google/android/gms/internal/ads/zzakq;

    const/16 v29, 0x1

    move-object/from16 v28, v2

    move-object/from16 v32, v5

    .line 149
    invoke-direct/range {v28 .. v35}, Lcom/google/android/gms/internal/ads/zzakq;-><init>(ZLjava/lang/String;I[BII[B)V

    iput-object v2, v1, Lcom/google/android/gms/internal/ads/zzakr;->zzm:Lcom/google/android/gms/internal/ads/zzakq;

    goto :goto_2a

    .line 141
    :cond_3f
    const-string v0, "Entry count in sgpd != 1 (unsupported)."

    .line 180
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzch;->zzc(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzch;

    move-result-object v0

    throw v0

    .line 135
    :cond_40
    const-string v0, "Entry count in sbgp != 1 (unsupported)."

    .line 178
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzch;->zzc(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzch;

    move-result-object v0

    throw v0

    :cond_41
    :goto_29
    const/4 v0, 0x1

    .line 150
    :cond_42
    :goto_2a
    iget-object v2, v10, Lcom/google/android/gms/internal/ads/zzajm;->zzb:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    const/4 v3, 0x0

    :goto_2b
    if-ge v3, v2, :cond_45

    .line 151
    iget-object v4, v10, Lcom/google/android/gms/internal/ads/zzajm;->zzb:Ljava/util/List;

    invoke-interface {v4, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/google/android/gms/internal/ads/zzajn;

    .line 152
    iget v5, v4, Lcom/google/android/gms/internal/ads/zzajn;->zzd:I

    const v6, 0x75756964

    if-ne v5, v6, :cond_43

    .line 153
    iget-object v4, v4, Lcom/google/android/gms/internal/ads/zzajn;->zza:Lcom/google/android/gms/internal/ads/zzfu;

    const/16 v5, 0x8

    .line 154
    invoke-virtual {v4, v5}, Lcom/google/android/gms/internal/ads/zzfu;->zzK(I)V

    move-object/from16 v8, v24

    const/4 v6, 0x0

    const/16 v9, 0x10

    .line 155
    invoke-virtual {v4, v8, v6, v9}, Lcom/google/android/gms/internal/ads/zzfu;->zzG([BII)V

    sget-object v11, Lcom/google/android/gms/internal/ads/zzakd;->zzb:[B

    .line 156
    invoke-static {v8, v11}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v11

    if-eqz v11, :cond_44

    .line 157
    invoke-static {v4, v9, v1}, Lcom/google/android/gms/internal/ads/zzakd;->zzi(Lcom/google/android/gms/internal/ads/zzfu;ILcom/google/android/gms/internal/ads/zzakr;)V

    goto :goto_2c

    :cond_43
    move-object/from16 v8, v24

    const/16 v5, 0x8

    const/4 v6, 0x0

    const/16 v9, 0x10

    :cond_44
    :goto_2c
    add-int/lit8 v3, v3, 0x1

    move-object/from16 v24, v8

    goto :goto_2b

    :cond_45
    move-object/from16 v8, v24

    const/16 v5, 0x8

    const/4 v6, 0x0

    goto :goto_2e

    :cond_46
    :goto_2d
    move-object/from16 v16, v1

    move-object/from16 v23, v2

    move/from16 v20, v6

    move v5, v7

    move/from16 v27, v8

    const/4 v0, 0x1

    const/4 v6, 0x0

    const/16 v7, 0xc

    move-object v8, v3

    :goto_2e
    add-int/lit8 v1, v27, 0x1

    move-object/from16 v0, p0

    move v7, v5

    move-object v3, v8

    move/from16 v6, v20

    move-object/from16 v2, v23

    move v8, v1

    move-object/from16 v1, v16

    goto/16 :goto_6

    :cond_47
    move-object v1, v2

    const/4 v2, 0x0

    const/4 v6, 0x0

    .line 158
    iget-object v0, v1, Lcom/google/android/gms/internal/ads/zzajm;->zzb:Ljava/util/List;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzakd;->zzg(Ljava/util/List;)Lcom/google/android/gms/internal/ads/zzae;

    move-result-object v0

    move-object/from16 v3, p0

    if-eqz v0, :cond_49

    iget-object v1, v3, Lcom/google/android/gms/internal/ads/zzakd;->zzf:Landroid/util/SparseArray;

    .line 159
    invoke-virtual {v1}, Landroid/util/SparseArray;->size()I

    move-result v1

    move v4, v6

    :goto_2f
    if-ge v4, v1, :cond_49

    iget-object v5, v3, Lcom/google/android/gms/internal/ads/zzakd;->zzf:Landroid/util/SparseArray;

    .line 160
    invoke-virtual {v5, v4}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/google/android/gms/internal/ads/zzakc;

    iget-object v7, v5, Lcom/google/android/gms/internal/ads/zzakc;->zzd:Lcom/google/android/gms/internal/ads/zzaks;

    .line 161
    iget-object v7, v7, Lcom/google/android/gms/internal/ads/zzaks;->zza:Lcom/google/android/gms/internal/ads/zzakp;

    iget-object v8, v5, Lcom/google/android/gms/internal/ads/zzakc;->zzb:Lcom/google/android/gms/internal/ads/zzakr;

    iget-object v8, v8, Lcom/google/android/gms/internal/ads/zzakr;->zza:Lcom/google/android/gms/internal/ads/zzajy;

    .line 162
    sget v9, Lcom/google/android/gms/internal/ads/zzgd;->zza:I

    iget v8, v8, Lcom/google/android/gms/internal/ads/zzajy;->zza:I

    .line 163
    invoke-virtual {v7, v8}, Lcom/google/android/gms/internal/ads/zzakp;->zza(I)Lcom/google/android/gms/internal/ads/zzakq;

    move-result-object v7

    if-eqz v7, :cond_48

    iget-object v7, v7, Lcom/google/android/gms/internal/ads/zzakq;->zzb:Ljava/lang/String;

    goto :goto_30

    :cond_48
    move-object v7, v2

    .line 164
    :goto_30
    invoke-virtual {v0, v7}, Lcom/google/android/gms/internal/ads/zzae;->zzb(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzae;

    move-result-object v7

    iget-object v8, v5, Lcom/google/android/gms/internal/ads/zzakc;->zzd:Lcom/google/android/gms/internal/ads/zzaks;

    .line 165
    iget-object v8, v8, Lcom/google/android/gms/internal/ads/zzaks;->zza:Lcom/google/android/gms/internal/ads/zzakp;

    iget-object v8, v8, Lcom/google/android/gms/internal/ads/zzakp;->zzf:Lcom/google/android/gms/internal/ads/zzan;

    .line 166
    invoke-virtual {v8}, Lcom/google/android/gms/internal/ads/zzan;->zzb()Lcom/google/android/gms/internal/ads/zzal;

    move-result-object v8

    invoke-virtual {v8, v7}, Lcom/google/android/gms/internal/ads/zzal;->zzE(Lcom/google/android/gms/internal/ads/zzae;)Lcom/google/android/gms/internal/ads/zzal;

    invoke-virtual {v8}, Lcom/google/android/gms/internal/ads/zzal;->zzad()Lcom/google/android/gms/internal/ads/zzan;

    move-result-object v7

    iget-object v5, v5, Lcom/google/android/gms/internal/ads/zzakc;->zza:Lcom/google/android/gms/internal/ads/zzafa;

    .line 167
    invoke-interface {v5, v7}, Lcom/google/android/gms/internal/ads/zzafa;->zzl(Lcom/google/android/gms/internal/ads/zzan;)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_2f

    :cond_49
    iget-wide v0, v3, Lcom/google/android/gms/internal/ads/zzakd;->zzx:J

    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v0, v0, v4

    if-eqz v0, :cond_4e

    iget-object v0, v3, Lcom/google/android/gms/internal/ads/zzakd;->zzf:Landroid/util/SparseArray;

    .line 168
    invoke-virtual {v0}, Landroid/util/SparseArray;->size()I

    move-result v0

    move v10, v6

    :goto_31
    if-ge v10, v0, :cond_4c

    iget-object v1, v3, Lcom/google/android/gms/internal/ads/zzakd;->zzf:Landroid/util/SparseArray;

    .line 169
    invoke-virtual {v1, v10}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/ads/zzakc;

    iget-wide v4, v3, Lcom/google/android/gms/internal/ads/zzakd;->zzx:J

    iget v2, v1, Lcom/google/android/gms/internal/ads/zzakc;->zzf:I

    :goto_32
    iget-object v6, v1, Lcom/google/android/gms/internal/ads/zzakc;->zzb:Lcom/google/android/gms/internal/ads/zzakr;

    iget v7, v6, Lcom/google/android/gms/internal/ads/zzakr;->zze:I

    if-ge v2, v7, :cond_4b

    iget-object v7, v6, Lcom/google/android/gms/internal/ads/zzakr;->zzi:[J

    .line 170
    aget-wide v8, v7, v2

    cmp-long v7, v8, v4

    if-gtz v7, :cond_4b

    iget-object v6, v6, Lcom/google/android/gms/internal/ads/zzakr;->zzj:[Z

    .line 171
    aget-boolean v6, v6, v2

    if-eqz v6, :cond_4a

    iput v2, v1, Lcom/google/android/gms/internal/ads/zzakc;->zzi:I

    :cond_4a
    add-int/lit8 v2, v2, 0x1

    goto :goto_32

    :cond_4b
    add-int/lit8 v10, v10, 0x1

    goto :goto_31

    :cond_4c
    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v1, v3, Lcom/google/android/gms/internal/ads/zzakd;->zzx:J

    goto :goto_33

    :cond_4d
    move-object v3, v0

    move-object v1, v2

    iget-object v0, v3, Lcom/google/android/gms/internal/ads/zzakd;->zzn:Ljava/util/ArrayDeque;

    .line 172
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_4e

    iget-object v0, v3, Lcom/google/android/gms/internal/ads/zzakd;->zzn:Ljava/util/ArrayDeque;

    .line 173
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/zzajm;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzajm;->zzc(Lcom/google/android/gms/internal/ads/zzajm;)V

    :cond_4e
    :goto_33
    move-object v0, v3

    goto/16 :goto_0

    :cond_4f
    move-object v3, v0

    .line 174
    invoke-direct/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/zzakd;->zzh()V

    return-void
.end method

.method private static final zzk(Landroid/util/SparseArray;I)Lcom/google/android/gms/internal/ads/zzajy;
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/util/SparseArray;->size()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    const/4 p1, 0x0

    .line 2
    invoke-virtual {p0, p1}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/google/android/gms/internal/ads/zzajy;

    return-object p0

    .line 3
    :cond_0
    invoke-virtual {p0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/google/android/gms/internal/ads/zzajy;

    .line 4
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-object p0
.end method


# virtual methods
.method public final zzb(Lcom/google/android/gms/internal/ads/zzadv;Lcom/google/android/gms/internal/ads/zzaeq;)I
    .locals 33
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    .line 1
    :goto_0
    iget v2, v0, Lcom/google/android/gms/internal/ads/zzakd;->zzq:I

    const v3, 0x656d7367

    const v4, 0x73696478

    const/4 v5, 0x2

    const/4 v7, 0x0

    const/4 v8, 0x1

    const/4 v9, 0x0

    if-eqz v2, :cond_30

    const-string v10, "FragmentedMp4Extractor"

    if-eq v2, v8, :cond_22

    const-wide v3, 0x7fffffffffffffffL

    const/4 v12, 0x3

    if-eq v2, v5, :cond_1d

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzakd;->zzA:Lcom/google/android/gms/internal/ads/zzakc;

    if-nez v2, :cond_7

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzakd;->zzf:Landroid/util/SparseArray;

    invoke-virtual {v2}, Landroid/util/SparseArray;->size()I

    move-result v13

    move-wide v14, v3

    move-object v3, v7

    move v4, v9

    :goto_1
    if-ge v4, v13, :cond_3

    .line 2
    invoke-virtual {v2, v4}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v16

    move-object/from16 v5, v16

    check-cast v5, Lcom/google/android/gms/internal/ads/zzakc;

    .line 3
    invoke-static {v5}, Lcom/google/android/gms/internal/ads/zzakc;->zzj(Lcom/google/android/gms/internal/ads/zzakc;)Z

    move-result v16

    if-nez v16, :cond_0

    iget v11, v5, Lcom/google/android/gms/internal/ads/zzakc;->zzf:I

    iget-object v6, v5, Lcom/google/android/gms/internal/ads/zzakc;->zzd:Lcom/google/android/gms/internal/ads/zzaks;

    iget v6, v6, Lcom/google/android/gms/internal/ads/zzaks;->zzb:I

    if-eq v11, v6, :cond_2

    :cond_0
    invoke-static {v5}, Lcom/google/android/gms/internal/ads/zzakc;->zzj(Lcom/google/android/gms/internal/ads/zzakc;)Z

    move-result v6

    if-eqz v6, :cond_1

    iget v6, v5, Lcom/google/android/gms/internal/ads/zzakc;->zzh:I

    iget-object v11, v5, Lcom/google/android/gms/internal/ads/zzakc;->zzb:Lcom/google/android/gms/internal/ads/zzakr;

    iget v11, v11, Lcom/google/android/gms/internal/ads/zzakr;->zzd:I

    if-ne v6, v11, :cond_1

    goto :goto_2

    .line 4
    :cond_1
    invoke-virtual {v5}, Lcom/google/android/gms/internal/ads/zzakc;->zzd()J

    move-result-wide v18

    cmp-long v6, v18, v14

    if-gez v6, :cond_2

    move-object v3, v5

    move-wide/from16 v14, v18

    :cond_2
    :goto_2
    add-int/lit8 v4, v4, 0x1

    const/4 v5, 0x2

    goto :goto_1

    :cond_3
    if-nez v3, :cond_5

    iget-wide v2, v0, Lcom/google/android/gms/internal/ads/zzakd;->zzv:J

    invoke-interface/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/zzadv;->zzf()J

    move-result-wide v4

    sub-long/2addr v2, v4

    long-to-int v2, v2

    if-ltz v2, :cond_4

    .line 91
    move-object v3, v1

    check-cast v3, Lcom/google/android/gms/internal/ads/zzadi;

    .line 5
    invoke-virtual {v3, v2, v9}, Lcom/google/android/gms/internal/ads/zzadi;->zzo(IZ)Z

    .line 6
    invoke-direct/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/zzakd;->zzh()V

    goto :goto_0

    .line 4
    :cond_4
    const-string v1, "Offset to end of mdat was negative."

    .line 91
    invoke-static {v1, v7}, Lcom/google/android/gms/internal/ads/zzch;->zza(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/google/android/gms/internal/ads/zzch;

    move-result-object v1

    throw v1

    .line 92
    :cond_5
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzakc;->zzd()J

    move-result-wide v4

    invoke-interface/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/zzadv;->zzf()J

    move-result-wide v13

    sub-long/2addr v4, v13

    long-to-int v2, v4

    if-gez v2, :cond_6

    const-string v2, "Ignoring negative offset to sample data."

    .line 93
    invoke-static {v10, v2}, Lcom/google/android/gms/internal/ads/zzfk;->zzf(Ljava/lang/String;Ljava/lang/String;)V

    move v2, v9

    :cond_6
    move-object v4, v1

    check-cast v4, Lcom/google/android/gms/internal/ads/zzadi;

    .line 94
    invoke-virtual {v4, v2, v9}, Lcom/google/android/gms/internal/ads/zzadi;->zzo(IZ)Z

    iput-object v3, v0, Lcom/google/android/gms/internal/ads/zzakd;->zzA:Lcom/google/android/gms/internal/ads/zzakc;

    move-object v2, v3

    :cond_7
    iget v3, v0, Lcom/google/android/gms/internal/ads/zzakd;->zzq:I

    const/4 v4, 0x6

    if-ne v3, v12, :cond_f

    .line 95
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzakc;->zzb()I

    move-result v3

    iput v3, v0, Lcom/google/android/gms/internal/ads/zzakd;->zzB:I

    .line 96
    iget v5, v2, Lcom/google/android/gms/internal/ads/zzakc;->zzf:I

    iget v6, v2, Lcom/google/android/gms/internal/ads/zzakc;->zzi:I

    if-ge v5, v6, :cond_c

    check-cast v1, Lcom/google/android/gms/internal/ads/zzadi;

    .line 97
    invoke-virtual {v1, v3, v9}, Lcom/google/android/gms/internal/ads/zzadi;->zzo(IZ)Z

    .line 98
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzakc;->zzf()Lcom/google/android/gms/internal/ads/zzakq;

    move-result-object v1

    if-nez v1, :cond_8

    goto :goto_3

    .line 102
    :cond_8
    iget-object v3, v2, Lcom/google/android/gms/internal/ads/zzakc;->zzb:Lcom/google/android/gms/internal/ads/zzakr;

    iget-object v3, v3, Lcom/google/android/gms/internal/ads/zzakr;->zzn:Lcom/google/android/gms/internal/ads/zzfu;

    iget v1, v1, Lcom/google/android/gms/internal/ads/zzakq;->zzd:I

    if-eqz v1, :cond_9

    .line 99
    invoke-virtual {v3, v1}, Lcom/google/android/gms/internal/ads/zzfu;->zzL(I)V

    :cond_9
    iget-object v1, v2, Lcom/google/android/gms/internal/ads/zzakc;->zzb:Lcom/google/android/gms/internal/ads/zzakr;

    iget v5, v2, Lcom/google/android/gms/internal/ads/zzakc;->zzf:I

    .line 100
    invoke-virtual {v1, v5}, Lcom/google/android/gms/internal/ads/zzakr;->zzb(I)Z

    move-result v1

    if-eqz v1, :cond_a

    .line 101
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzfu;->zzq()I

    move-result v1

    mul-int/2addr v1, v4

    invoke-virtual {v3, v1}, Lcom/google/android/gms/internal/ads/zzfu;->zzL(I)V

    .line 102
    :cond_a
    :goto_3
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzakc;->zzk()Z

    move-result v1

    if-nez v1, :cond_b

    iput-object v7, v0, Lcom/google/android/gms/internal/ads/zzakd;->zzA:Lcom/google/android/gms/internal/ads/zzakc;

    :cond_b
    move v1, v12

    goto/16 :goto_e

    .line 103
    :cond_c
    iget-object v5, v2, Lcom/google/android/gms/internal/ads/zzakc;->zzd:Lcom/google/android/gms/internal/ads/zzaks;

    iget-object v5, v5, Lcom/google/android/gms/internal/ads/zzaks;->zza:Lcom/google/android/gms/internal/ads/zzakp;

    iget v5, v5, Lcom/google/android/gms/internal/ads/zzakp;->zzg:I

    if-ne v5, v8, :cond_d

    add-int/lit8 v3, v3, -0x8

    iput v3, v0, Lcom/google/android/gms/internal/ads/zzakd;->zzB:I

    move-object v3, v1

    check-cast v3, Lcom/google/android/gms/internal/ads/zzadi;

    const/16 v5, 0x8

    .line 104
    invoke-virtual {v3, v5, v9}, Lcom/google/android/gms/internal/ads/zzadi;->zzo(IZ)Z

    .line 105
    :cond_d
    iget-object v3, v2, Lcom/google/android/gms/internal/ads/zzakc;->zzd:Lcom/google/android/gms/internal/ads/zzaks;

    iget-object v3, v3, Lcom/google/android/gms/internal/ads/zzaks;->zza:Lcom/google/android/gms/internal/ads/zzakp;

    iget-object v3, v3, Lcom/google/android/gms/internal/ads/zzakp;->zzf:Lcom/google/android/gms/internal/ads/zzan;

    const-string v5, "audio/ac4"

    iget-object v3, v3, Lcom/google/android/gms/internal/ads/zzan;->zzn:Ljava/lang/String;

    invoke-virtual {v5, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_e

    iget v3, v0, Lcom/google/android/gms/internal/ads/zzakd;->zzB:I

    const/4 v5, 0x7

    .line 106
    invoke-virtual {v2, v3, v5}, Lcom/google/android/gms/internal/ads/zzakc;->zzc(II)I

    move-result v3

    iput v3, v0, Lcom/google/android/gms/internal/ads/zzakd;->zzC:I

    iget v3, v0, Lcom/google/android/gms/internal/ads/zzakd;->zzB:I

    iget-object v6, v0, Lcom/google/android/gms/internal/ads/zzakd;->zzk:Lcom/google/android/gms/internal/ads/zzfu;

    .line 107
    invoke-static {v3, v6}, Lcom/google/android/gms/internal/ads/zzacw;->zzb(ILcom/google/android/gms/internal/ads/zzfu;)V

    .line 108
    iget-object v3, v2, Lcom/google/android/gms/internal/ads/zzakc;->zza:Lcom/google/android/gms/internal/ads/zzafa;

    iget-object v6, v0, Lcom/google/android/gms/internal/ads/zzakd;->zzk:Lcom/google/android/gms/internal/ads/zzfu;

    invoke-interface {v3, v6, v5}, Lcom/google/android/gms/internal/ads/zzafa;->zzq(Lcom/google/android/gms/internal/ads/zzfu;I)V

    iget v3, v0, Lcom/google/android/gms/internal/ads/zzakd;->zzC:I

    add-int/2addr v3, v5

    iput v3, v0, Lcom/google/android/gms/internal/ads/zzakd;->zzC:I

    goto :goto_4

    .line 134
    :cond_e
    iget v3, v0, Lcom/google/android/gms/internal/ads/zzakd;->zzB:I

    .line 109
    invoke-virtual {v2, v3, v9}, Lcom/google/android/gms/internal/ads/zzakc;->zzc(II)I

    move-result v3

    iput v3, v0, Lcom/google/android/gms/internal/ads/zzakd;->zzC:I

    .line 108
    :goto_4
    iget v5, v0, Lcom/google/android/gms/internal/ads/zzakd;->zzB:I

    add-int/2addr v5, v3

    iput v5, v0, Lcom/google/android/gms/internal/ads/zzakd;->zzB:I

    const/4 v3, 0x4

    iput v3, v0, Lcom/google/android/gms/internal/ads/zzakd;->zzq:I

    iput v9, v0, Lcom/google/android/gms/internal/ads/zzakd;->zzD:I

    .line 110
    :cond_f
    iget-object v3, v2, Lcom/google/android/gms/internal/ads/zzakc;->zzd:Lcom/google/android/gms/internal/ads/zzaks;

    iget-object v3, v3, Lcom/google/android/gms/internal/ads/zzaks;->zza:Lcom/google/android/gms/internal/ads/zzakp;

    .line 111
    iget-object v5, v2, Lcom/google/android/gms/internal/ads/zzakc;->zza:Lcom/google/android/gms/internal/ads/zzafa;

    .line 112
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzakc;->zze()J

    move-result-wide v10

    iget v6, v3, Lcom/google/android/gms/internal/ads/zzakp;->zzj:I

    if-nez v6, :cond_10

    :goto_5
    iget v3, v0, Lcom/google/android/gms/internal/ads/zzakd;->zzC:I

    iget v4, v0, Lcom/google/android/gms/internal/ads/zzakd;->zzB:I

    if-ge v3, v4, :cond_17

    sub-int/2addr v4, v3

    .line 113
    invoke-interface {v5, v1, v4, v9}, Lcom/google/android/gms/internal/ads/zzafa;->zzf(Lcom/google/android/gms/internal/ads/zzu;IZ)I

    move-result v3

    iget v4, v0, Lcom/google/android/gms/internal/ads/zzakd;->zzC:I

    add-int/2addr v4, v3

    iput v4, v0, Lcom/google/android/gms/internal/ads/zzakd;->zzC:I

    goto :goto_5

    .line 145
    :cond_10
    iget-object v13, v0, Lcom/google/android/gms/internal/ads/zzakd;->zzh:Lcom/google/android/gms/internal/ads/zzfu;

    invoke-virtual {v13}, Lcom/google/android/gms/internal/ads/zzfu;->zzM()[B

    move-result-object v13

    .line 114
    aput-byte v9, v13, v9

    .line 115
    aput-byte v9, v13, v8

    const/4 v14, 0x2

    .line 116
    aput-byte v9, v13, v14

    add-int/lit8 v14, v6, 0x1

    const/4 v15, 0x4

    rsub-int/lit8 v6, v6, 0x4

    :goto_6
    iget v15, v0, Lcom/google/android/gms/internal/ads/zzakd;->zzC:I

    iget v12, v0, Lcom/google/android/gms/internal/ads/zzakd;->zzB:I

    if-ge v15, v12, :cond_17

    iget v12, v0, Lcom/google/android/gms/internal/ads/zzakd;->zzD:I

    const-string v15, "video/hevc"

    if-nez v12, :cond_15

    move-object v12, v1

    check-cast v12, Lcom/google/android/gms/internal/ads/zzadi;

    .line 117
    invoke-virtual {v12, v13, v6, v14, v9}, Lcom/google/android/gms/internal/ads/zzadi;->zzn([BIIZ)Z

    iget-object v12, v0, Lcom/google/android/gms/internal/ads/zzakd;->zzh:Lcom/google/android/gms/internal/ads/zzfu;

    .line 118
    invoke-virtual {v12, v9}, Lcom/google/android/gms/internal/ads/zzfu;->zzK(I)V

    iget-object v12, v0, Lcom/google/android/gms/internal/ads/zzakd;->zzh:Lcom/google/android/gms/internal/ads/zzfu;

    .line 119
    invoke-virtual {v12}, Lcom/google/android/gms/internal/ads/zzfu;->zzg()I

    move-result v12

    if-lez v12, :cond_14

    add-int/lit8 v12, v12, -0x1

    .line 146
    iput v12, v0, Lcom/google/android/gms/internal/ads/zzakd;->zzD:I

    iget-object v12, v0, Lcom/google/android/gms/internal/ads/zzakd;->zzg:Lcom/google/android/gms/internal/ads/zzfu;

    .line 120
    invoke-virtual {v12, v9}, Lcom/google/android/gms/internal/ads/zzfu;->zzK(I)V

    iget-object v12, v0, Lcom/google/android/gms/internal/ads/zzakd;->zzg:Lcom/google/android/gms/internal/ads/zzfu;

    const/4 v9, 0x4

    .line 121
    invoke-interface {v5, v12, v9}, Lcom/google/android/gms/internal/ads/zzafa;->zzq(Lcom/google/android/gms/internal/ads/zzfu;I)V

    iget-object v12, v0, Lcom/google/android/gms/internal/ads/zzakd;->zzh:Lcom/google/android/gms/internal/ads/zzfu;

    .line 122
    invoke-interface {v5, v12, v8}, Lcom/google/android/gms/internal/ads/zzafa;->zzq(Lcom/google/android/gms/internal/ads/zzfu;I)V

    iget-object v12, v0, Lcom/google/android/gms/internal/ads/zzakd;->zzH:[Lcom/google/android/gms/internal/ads/zzafa;

    .line 123
    array-length v12, v12

    if-lez v12, :cond_13

    iget-object v12, v3, Lcom/google/android/gms/internal/ads/zzakp;->zzf:Lcom/google/android/gms/internal/ads/zzan;

    iget-object v12, v12, Lcom/google/android/gms/internal/ads/zzan;->zzn:Ljava/lang/String;

    aget-byte v17, v13, v9

    .line 124
    sget-object v9, Lcom/google/android/gms/internal/ads/zzgr;->zza:[B

    const-string v9, "video/avc"

    .line 125
    invoke-virtual {v9, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_12

    and-int/lit8 v9, v17, 0x1f

    if-eq v9, v4, :cond_11

    goto :goto_8

    :cond_11
    :goto_7
    move v9, v8

    goto :goto_9

    .line 126
    :cond_12
    :goto_8
    invoke-virtual {v15, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_13

    and-int/lit8 v9, v17, 0x7e

    shr-int/2addr v9, v8

    const/16 v12, 0x27

    if-ne v9, v12, :cond_13

    goto :goto_7

    :cond_13
    const/4 v9, 0x0

    :goto_9
    iput-boolean v9, v0, Lcom/google/android/gms/internal/ads/zzakd;->zzE:Z

    iget v9, v0, Lcom/google/android/gms/internal/ads/zzakd;->zzC:I

    add-int/lit8 v9, v9, 0x5

    iput v9, v0, Lcom/google/android/gms/internal/ads/zzakd;->zzC:I

    iget v9, v0, Lcom/google/android/gms/internal/ads/zzakd;->zzB:I

    add-int/2addr v9, v6

    iput v9, v0, Lcom/google/android/gms/internal/ads/zzakd;->zzB:I

    goto :goto_b

    .line 119
    :cond_14
    const-string v1, "Invalid NAL length"

    .line 146
    invoke-static {v1, v7}, Lcom/google/android/gms/internal/ads/zzch;->zza(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/google/android/gms/internal/ads/zzch;

    move-result-object v1

    throw v1

    .line 126
    :cond_15
    iget-boolean v9, v0, Lcom/google/android/gms/internal/ads/zzakd;->zzE:Z

    if-eqz v9, :cond_16

    iget-object v9, v0, Lcom/google/android/gms/internal/ads/zzakd;->zzi:Lcom/google/android/gms/internal/ads/zzfu;

    .line 127
    invoke-virtual {v9, v12}, Lcom/google/android/gms/internal/ads/zzfu;->zzH(I)V

    iget-object v9, v0, Lcom/google/android/gms/internal/ads/zzakd;->zzi:Lcom/google/android/gms/internal/ads/zzfu;

    invoke-virtual {v9}, Lcom/google/android/gms/internal/ads/zzfu;->zzM()[B

    move-result-object v9

    iget v12, v0, Lcom/google/android/gms/internal/ads/zzakd;->zzD:I

    move-object v4, v1

    check-cast v4, Lcom/google/android/gms/internal/ads/zzadi;

    const/4 v8, 0x0

    .line 128
    invoke-virtual {v4, v9, v8, v12, v8}, Lcom/google/android/gms/internal/ads/zzadi;->zzn([BIIZ)Z

    iget-object v4, v0, Lcom/google/android/gms/internal/ads/zzakd;->zzi:Lcom/google/android/gms/internal/ads/zzfu;

    iget v8, v0, Lcom/google/android/gms/internal/ads/zzakd;->zzD:I

    .line 129
    invoke-interface {v5, v4, v8}, Lcom/google/android/gms/internal/ads/zzafa;->zzq(Lcom/google/android/gms/internal/ads/zzfu;I)V

    iget v4, v0, Lcom/google/android/gms/internal/ads/zzakd;->zzD:I

    iget-object v8, v0, Lcom/google/android/gms/internal/ads/zzakd;->zzi:Lcom/google/android/gms/internal/ads/zzfu;

    invoke-virtual {v8}, Lcom/google/android/gms/internal/ads/zzfu;->zzM()[B

    move-result-object v9

    invoke-virtual {v8}, Lcom/google/android/gms/internal/ads/zzfu;->zze()I

    move-result v8

    .line 130
    invoke-static {v9, v8}, Lcom/google/android/gms/internal/ads/zzgr;->zzb([BI)I

    move-result v8

    iget-object v9, v0, Lcom/google/android/gms/internal/ads/zzakd;->zzi:Lcom/google/android/gms/internal/ads/zzfu;

    iget-object v12, v3, Lcom/google/android/gms/internal/ads/zzakp;->zzf:Lcom/google/android/gms/internal/ads/zzan;

    .line 131
    iget-object v12, v12, Lcom/google/android/gms/internal/ads/zzan;->zzn:Ljava/lang/String;

    invoke-virtual {v15, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    invoke-virtual {v9, v12}, Lcom/google/android/gms/internal/ads/zzfu;->zzK(I)V

    iget-object v9, v0, Lcom/google/android/gms/internal/ads/zzakd;->zzi:Lcom/google/android/gms/internal/ads/zzfu;

    .line 132
    invoke-virtual {v9, v8}, Lcom/google/android/gms/internal/ads/zzfu;->zzJ(I)V

    iget-object v8, v0, Lcom/google/android/gms/internal/ads/zzakd;->zzi:Lcom/google/android/gms/internal/ads/zzfu;

    iget-object v9, v0, Lcom/google/android/gms/internal/ads/zzakd;->zzH:[Lcom/google/android/gms/internal/ads/zzafa;

    .line 133
    invoke-static {v10, v11, v8, v9}, Lcom/google/android/gms/internal/ads/zzadf;->zza(JLcom/google/android/gms/internal/ads/zzfu;[Lcom/google/android/gms/internal/ads/zzafa;)V

    goto :goto_a

    :cond_16
    const/4 v4, 0x0

    .line 134
    invoke-interface {v5, v1, v12, v4}, Lcom/google/android/gms/internal/ads/zzafa;->zzf(Lcom/google/android/gms/internal/ads/zzu;IZ)I

    move-result v8

    move v4, v8

    .line 133
    :goto_a
    iget v8, v0, Lcom/google/android/gms/internal/ads/zzakd;->zzC:I

    add-int/2addr v8, v4

    iput v8, v0, Lcom/google/android/gms/internal/ads/zzakd;->zzC:I

    iget v8, v0, Lcom/google/android/gms/internal/ads/zzakd;->zzD:I

    sub-int/2addr v8, v4

    iput v8, v0, Lcom/google/android/gms/internal/ads/zzakd;->zzD:I

    const/4 v4, 0x6

    const/4 v8, 0x1

    :goto_b
    const/4 v9, 0x0

    const/4 v12, 0x3

    goto/16 :goto_6

    .line 135
    :cond_17
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzakc;->zza()I

    move-result v20

    .line 136
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzakc;->zzf()Lcom/google/android/gms/internal/ads/zzakq;

    move-result-object v1

    if-eqz v1, :cond_18

    iget-object v1, v1, Lcom/google/android/gms/internal/ads/zzakq;->zzc:Lcom/google/android/gms/internal/ads/zzaez;

    move-object/from16 v23, v1

    goto :goto_c

    :cond_18
    move-object/from16 v23, v7

    :goto_c
    iget v1, v0, Lcom/google/android/gms/internal/ads/zzakd;->zzB:I

    const/16 v22, 0x0

    move-object/from16 v17, v5

    move-wide/from16 v18, v10

    move/from16 v21, v1

    .line 137
    invoke-interface/range {v17 .. v23}, Lcom/google/android/gms/internal/ads/zzafa;->zzs(JIIILcom/google/android/gms/internal/ads/zzaez;)V

    :cond_19
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzakd;->zzo:Ljava/util/ArrayDeque;

    .line 138
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_1b

    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzakd;->zzo:Ljava/util/ArrayDeque;

    .line 139
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->removeFirst()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/ads/zzakb;

    iget v3, v0, Lcom/google/android/gms/internal/ads/zzakd;->zzw:I

    .line 140
    iget v4, v1, Lcom/google/android/gms/internal/ads/zzakb;->zzc:I

    sub-int/2addr v3, v4

    iput v3, v0, Lcom/google/android/gms/internal/ads/zzakd;->zzw:I

    .line 141
    iget-wide v3, v1, Lcom/google/android/gms/internal/ads/zzakb;->zza:J

    .line 142
    iget-boolean v5, v1, Lcom/google/android/gms/internal/ads/zzakb;->zzb:Z

    if-eqz v5, :cond_1a

    add-long/2addr v3, v10

    :cond_1a
    iget-object v5, v0, Lcom/google/android/gms/internal/ads/zzakd;->zzG:[Lcom/google/android/gms/internal/ads/zzafa;

    .line 143
    array-length v6, v5

    const/4 v8, 0x0

    :goto_d
    if-ge v8, v6, :cond_19

    aget-object v12, v5, v8

    .line 144
    iget v9, v1, Lcom/google/android/gms/internal/ads/zzakb;->zzc:I

    iget v15, v0, Lcom/google/android/gms/internal/ads/zzakd;->zzw:I

    const/16 v18, 0x0

    const/16 v16, 0x1

    move-wide v13, v3

    move/from16 v17, v15

    move/from16 v15, v16

    move/from16 v16, v9

    invoke-interface/range {v12 .. v18}, Lcom/google/android/gms/internal/ads/zzafa;->zzs(JIIILcom/google/android/gms/internal/ads/zzaez;)V

    add-int/lit8 v8, v8, 0x1

    goto :goto_d

    .line 145
    :cond_1b
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzakc;->zzk()Z

    move-result v1

    if-nez v1, :cond_1c

    iput-object v7, v0, Lcom/google/android/gms/internal/ads/zzakd;->zzA:Lcom/google/android/gms/internal/ads/zzakc;

    :cond_1c
    const/4 v1, 0x3

    .line 102
    :goto_e
    iput v1, v0, Lcom/google/android/gms/internal/ads/zzakd;->zzq:I

    const/4 v1, 0x0

    return v1

    .line 14
    :cond_1d
    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzakd;->zzf:Landroid/util/SparseArray;

    .line 85
    invoke-virtual {v2}, Landroid/util/SparseArray;->size()I

    move-result v2

    move-object v6, v7

    const/4 v5, 0x0

    :goto_f
    if-ge v5, v2, :cond_1f

    iget-object v8, v0, Lcom/google/android/gms/internal/ads/zzakd;->zzf:Landroid/util/SparseArray;

    .line 86
    invoke-virtual {v8, v5}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/google/android/gms/internal/ads/zzakc;

    iget-object v8, v8, Lcom/google/android/gms/internal/ads/zzakc;->zzb:Lcom/google/android/gms/internal/ads/zzakr;

    iget-boolean v9, v8, Lcom/google/android/gms/internal/ads/zzakr;->zzo:Z

    if-eqz v9, :cond_1e

    iget-wide v8, v8, Lcom/google/android/gms/internal/ads/zzakr;->zzc:J

    cmp-long v10, v8, v3

    if-gez v10, :cond_1e

    iget-object v3, v0, Lcom/google/android/gms/internal/ads/zzakd;->zzf:Landroid/util/SparseArray;

    .line 87
    invoke-virtual {v3, v5}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v3

    move-object v6, v3

    check-cast v6, Lcom/google/android/gms/internal/ads/zzakc;

    move-wide v3, v8

    :cond_1e
    add-int/lit8 v5, v5, 0x1

    goto :goto_f

    :cond_1f
    if-nez v6, :cond_20

    const/4 v2, 0x3

    iput v2, v0, Lcom/google/android/gms/internal/ads/zzakd;->zzq:I

    goto/16 :goto_0

    :cond_20
    invoke-interface/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/zzadv;->zzf()J

    move-result-wide v8

    sub-long/2addr v3, v8

    long-to-int v2, v3

    if-ltz v2, :cond_21

    .line 155
    move-object v3, v1

    check-cast v3, Lcom/google/android/gms/internal/ads/zzadi;

    const/4 v4, 0x0

    .line 88
    invoke-virtual {v3, v2, v4}, Lcom/google/android/gms/internal/ads/zzadi;->zzo(IZ)Z

    iget-object v2, v6, Lcom/google/android/gms/internal/ads/zzakc;->zzb:Lcom/google/android/gms/internal/ads/zzakr;

    iget-object v5, v2, Lcom/google/android/gms/internal/ads/zzakr;->zzn:Lcom/google/android/gms/internal/ads/zzfu;

    invoke-virtual {v5}, Lcom/google/android/gms/internal/ads/zzfu;->zzM()[B

    move-result-object v6

    invoke-virtual {v5}, Lcom/google/android/gms/internal/ads/zzfu;->zze()I

    move-result v5

    .line 89
    invoke-virtual {v3, v6, v4, v5, v4}, Lcom/google/android/gms/internal/ads/zzadi;->zzn([BIIZ)Z

    iget-object v3, v2, Lcom/google/android/gms/internal/ads/zzakr;->zzn:Lcom/google/android/gms/internal/ads/zzfu;

    .line 90
    invoke-virtual {v3, v4}, Lcom/google/android/gms/internal/ads/zzfu;->zzK(I)V

    iput-boolean v4, v2, Lcom/google/android/gms/internal/ads/zzakr;->zzo:Z

    goto/16 :goto_0

    .line 87
    :cond_21
    const-string v1, "Offset to encryption data was negative."

    .line 156
    invoke-static {v1, v7}, Lcom/google/android/gms/internal/ads/zzch;->zza(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/google/android/gms/internal/ads/zzch;

    move-result-object v1

    throw v1

    .line 109
    :cond_22
    iget-wide v5, v0, Lcom/google/android/gms/internal/ads/zzakd;->zzs:J

    long-to-int v2, v5

    iget v5, v0, Lcom/google/android/gms/internal/ads/zzakd;->zzt:I

    sub-int/2addr v2, v5

    iget-object v5, v0, Lcom/google/android/gms/internal/ads/zzakd;->zzu:Lcom/google/android/gms/internal/ads/zzfu;

    if-eqz v5, :cond_2e

    invoke-virtual {v5}, Lcom/google/android/gms/internal/ads/zzfu;->zzM()[B

    move-result-object v6

    move-object v8, v1

    check-cast v8, Lcom/google/android/gms/internal/ads/zzadi;

    const/16 v9, 0x8

    const/4 v11, 0x0

    .line 24
    invoke-virtual {v8, v6, v9, v2, v11}, Lcom/google/android/gms/internal/ads/zzadi;->zzn([BIIZ)Z

    new-instance v2, Lcom/google/android/gms/internal/ads/zzajn;

    iget v6, v0, Lcom/google/android/gms/internal/ads/zzakd;->zzr:I

    invoke-direct {v2, v6, v5}, Lcom/google/android/gms/internal/ads/zzajn;-><init>(ILcom/google/android/gms/internal/ads/zzfu;)V

    invoke-interface/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/zzadv;->zzf()J

    move-result-wide v5

    iget-object v8, v0, Lcom/google/android/gms/internal/ads/zzakd;->zzn:Ljava/util/ArrayDeque;

    .line 25
    invoke-virtual {v8}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v8

    if-nez v8, :cond_23

    iget-object v3, v0, Lcom/google/android/gms/internal/ads/zzakd;->zzn:Ljava/util/ArrayDeque;

    .line 26
    invoke-virtual {v3}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/android/gms/internal/ads/zzajm;

    invoke-virtual {v3, v2}, Lcom/google/android/gms/internal/ads/zzajm;->zzd(Lcom/google/android/gms/internal/ads/zzajn;)V

    goto/16 :goto_16

    .line 84
    :cond_23
    iget v8, v2, Lcom/google/android/gms/internal/ads/zzajn;->zzd:I

    if-ne v8, v4, :cond_27

    iget-object v2, v2, Lcom/google/android/gms/internal/ads/zzajn;->zza:Lcom/google/android/gms/internal/ads/zzfu;

    const/16 v3, 0x8

    .line 27
    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/ads/zzfu;->zzK(I)V

    .line 28
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzfu;->zzg()I

    move-result v3

    invoke-static {v3}, Lcom/google/android/gms/internal/ads/zzajo;->zze(I)I

    move-result v3

    const/4 v4, 0x4

    .line 29
    invoke-virtual {v2, v4}, Lcom/google/android/gms/internal/ads/zzfu;->zzL(I)V

    .line 30
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzfu;->zzu()J

    move-result-wide v19

    if-nez v3, :cond_24

    .line 31
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzfu;->zzu()J

    move-result-wide v3

    .line 32
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzfu;->zzu()J

    move-result-wide v8

    goto :goto_10

    .line 33
    :cond_24
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzfu;->zzv()J

    move-result-wide v3

    .line 34
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzfu;->zzv()J

    move-result-wide v8

    :goto_10
    add-long/2addr v5, v8

    const-wide/32 v10, 0xf4240

    .line 35
    sget-object v14, Ljava/math/RoundingMode;->FLOOR:Ljava/math/RoundingMode;

    move-wide v8, v3

    move-wide/from16 v12, v19

    .line 36
    invoke-static/range {v8 .. v14}, Lcom/google/android/gms/internal/ads/zzgd;->zzt(JJJLjava/math/RoundingMode;)J

    move-result-wide v21

    const/4 v8, 0x2

    .line 37
    invoke-virtual {v2, v8}, Lcom/google/android/gms/internal/ads/zzfu;->zzL(I)V

    .line 38
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzfu;->zzq()I

    move-result v15

    new-array v14, v15, [I

    new-array v12, v15, [J

    new-array v13, v15, [J

    new-array v10, v15, [J

    move-wide/from16 v8, v21

    const/4 v11, 0x0

    :goto_11
    if-ge v11, v15, :cond_26

    .line 39
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzfu;->zzg()I

    move-result v17

    const/high16 v23, -0x80000000

    and-int v23, v17, v23

    if-nez v23, :cond_25

    .line 40
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzfu;->zzu()J

    move-result-wide v23

    const v25, 0x7fffffff

    and-int v17, v17, v25

    .line 41
    aput v17, v14, v11

    .line 42
    aput-wide v5, v12, v11

    .line 43
    aput-wide v8, v10, v11

    add-long v3, v3, v23

    const-wide/32 v23, 0xf4240

    sget-object v17, Ljava/math/RoundingMode;->FLOOR:Ljava/math/RoundingMode;

    move-wide v8, v3

    move-object v7, v10

    move/from16 v26, v11

    move-wide/from16 v10, v23

    move-object/from16 v27, v12

    move-object/from16 v28, v13

    move-wide/from16 v12, v19

    move-wide/from16 v23, v3

    move-object v3, v14

    move-object/from16 v14, v17

    .line 44
    invoke-static/range {v8 .. v14}, Lcom/google/android/gms/internal/ads/zzgd;->zzt(JJJLjava/math/RoundingMode;)J

    move-result-wide v8

    .line 45
    aget-wide v10, v7, v26

    sub-long v10, v8, v10

    move-object/from16 v4, v28

    aput-wide v10, v4, v26

    const/4 v10, 0x4

    .line 46
    invoke-virtual {v2, v10}, Lcom/google/android/gms/internal/ads/zzfu;->zzL(I)V

    .line 47
    aget v11, v3, v26

    int-to-long v11, v11

    add-long/2addr v5, v11

    add-int/lit8 v11, v26, 0x1

    move-object v14, v3

    move-object v13, v4

    move-object v10, v7

    move-wide/from16 v3, v23

    move-object/from16 v12, v27

    const/4 v7, 0x0

    goto :goto_11

    .line 39
    :cond_25
    const-string v1, "Unhandled indirect reference"

    const/4 v2, 0x0

    .line 151
    invoke-static {v1, v2}, Lcom/google/android/gms/internal/ads/zzch;->zza(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/google/android/gms/internal/ads/zzch;

    move-result-object v1

    throw v1

    :cond_26
    move-object v7, v10

    move-object/from16 v27, v12

    move-object v4, v13

    move-object v3, v14

    .line 48
    invoke-static/range {v21 .. v22}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    new-instance v5, Lcom/google/android/gms/internal/ads/zzadg;

    move-object/from16 v6, v27

    invoke-direct {v5, v3, v6, v4, v7}, Lcom/google/android/gms/internal/ads/zzadg;-><init>([I[J[J[J)V

    .line 49
    invoke-static {v2, v5}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    move-result-object v2

    .line 50
    iget-object v3, v2, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v3, Ljava/lang/Long;

    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    iput-wide v3, v0, Lcom/google/android/gms/internal/ads/zzakd;->zzz:J

    iget-object v3, v0, Lcom/google/android/gms/internal/ads/zzakd;->zzF:Lcom/google/android/gms/internal/ads/zzadx;

    .line 51
    iget-object v2, v2, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v2, Lcom/google/android/gms/internal/ads/zzaet;

    invoke-interface {v3, v2}, Lcom/google/android/gms/internal/ads/zzadx;->zzO(Lcom/google/android/gms/internal/ads/zzaet;)V

    const/4 v2, 0x1

    iput-boolean v2, v0, Lcom/google/android/gms/internal/ads/zzakd;->zzI:Z

    goto/16 :goto_16

    :cond_27
    if-ne v8, v3, :cond_2f

    .line 34
    iget-object v2, v2, Lcom/google/android/gms/internal/ads/zzajn;->zza:Lcom/google/android/gms/internal/ads/zzfu;

    iget-object v3, v0, Lcom/google/android/gms/internal/ads/zzakd;->zzG:[Lcom/google/android/gms/internal/ads/zzafa;

    .line 52
    array-length v3, v3

    if-eqz v3, :cond_2f

    const/16 v3, 0x8

    .line 53
    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/ads/zzfu;->zzK(I)V

    .line 54
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzfu;->zzg()I

    move-result v3

    invoke-static {v3}, Lcom/google/android/gms/internal/ads/zzajo;->zze(I)I

    move-result v3

    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    if-eqz v3, :cond_29

    const/4 v6, 0x1

    if-eq v3, v6, :cond_28

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v4, "Skipping unsupported emsg version: "

    .line 83
    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v10, v2}, Lcom/google/android/gms/internal/ads/zzfk;->zzf(Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_16

    .line 63
    :cond_28
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzfu;->zzu()J

    move-result-wide v6

    .line 64
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzfu;->zzv()J

    move-result-wide v11

    const-wide/32 v13, 0xf4240

    sget-object v17, Ljava/math/RoundingMode;->FLOOR:Ljava/math/RoundingMode;

    move-wide v15, v6

    .line 65
    invoke-static/range {v11 .. v17}, Lcom/google/android/gms/internal/ads/zzgd;->zzt(JJJLjava/math/RoundingMode;)J

    move-result-wide v8

    .line 66
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzfu;->zzu()J

    move-result-wide v11

    const-wide/16 v13, 0x3e8

    sget-object v17, Ljava/math/RoundingMode;->FLOOR:Ljava/math/RoundingMode;

    .line 67
    invoke-static/range {v11 .. v17}, Lcom/google/android/gms/internal/ads/zzgd;->zzt(JJJLjava/math/RoundingMode;)J

    move-result-wide v6

    .line 68
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzfu;->zzu()J

    move-result-wide v10

    const/4 v3, 0x0

    .line 69
    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/ads/zzfu;->zzx(C)Ljava/lang/String;

    move-result-object v12

    .line 155
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 70
    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/ads/zzfu;->zzx(C)Ljava/lang/String;

    move-result-object v13

    .line 154
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-wide/from16 v28, v6

    move-wide/from16 v30, v10

    move-object/from16 v26, v12

    move-object/from16 v27, v13

    move-wide v13, v8

    move-wide v8, v4

    goto :goto_13

    :cond_29
    const/4 v3, 0x0

    .line 55
    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/ads/zzfu;->zzx(C)Ljava/lang/String;

    move-result-object v12

    .line 153
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/ads/zzfu;->zzx(C)Ljava/lang/String;

    move-result-object v13

    .line 152
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 57
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzfu;->zzu()J

    move-result-wide v6

    .line 58
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzfu;->zzu()J

    move-result-wide v25

    const-wide/32 v27, 0xf4240

    sget-object v31, Ljava/math/RoundingMode;->FLOOR:Ljava/math/RoundingMode;

    move-wide/from16 v29, v6

    .line 59
    invoke-static/range {v25 .. v31}, Lcom/google/android/gms/internal/ads/zzgd;->zzt(JJJLjava/math/RoundingMode;)J

    move-result-wide v8

    iget-wide v10, v0, Lcom/google/android/gms/internal/ads/zzakd;->zzz:J

    cmp-long v3, v10, v4

    if-eqz v3, :cond_2a

    add-long/2addr v10, v8

    goto :goto_12

    :cond_2a
    move-wide v10, v4

    .line 60
    :goto_12
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzfu;->zzu()J

    move-result-wide v25

    const-wide/16 v27, 0x3e8

    sget-object v31, Ljava/math/RoundingMode;->FLOOR:Ljava/math/RoundingMode;

    move-wide/from16 v29, v6

    .line 61
    invoke-static/range {v25 .. v31}, Lcom/google/android/gms/internal/ads/zzgd;->zzt(JJJLjava/math/RoundingMode;)J

    move-result-wide v6

    .line 62
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzfu;->zzu()J

    move-result-wide v14

    move-wide/from16 v28, v6

    move-object/from16 v26, v12

    move-object/from16 v27, v13

    move-wide/from16 v30, v14

    move-wide v13, v10

    :goto_13
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzfu;->zzb()I

    move-result v3

    .line 71
    new-array v3, v3, [B

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzfu;->zzb()I

    move-result v6

    const/4 v7, 0x0

    .line 72
    invoke-virtual {v2, v3, v7, v6}, Lcom/google/android/gms/internal/ads/zzfu;->zzG([BII)V

    .line 73
    new-instance v2, Lcom/google/android/gms/internal/ads/zzagt;

    move-object/from16 v25, v2

    move-object/from16 v32, v3

    invoke-direct/range {v25 .. v32}, Lcom/google/android/gms/internal/ads/zzagt;-><init>(Ljava/lang/String;Ljava/lang/String;JJ[B)V

    iget-object v3, v0, Lcom/google/android/gms/internal/ads/zzakd;->zzl:Lcom/google/android/gms/internal/ads/zzagu;

    new-instance v6, Lcom/google/android/gms/internal/ads/zzfu;

    .line 74
    invoke-virtual {v3, v2}, Lcom/google/android/gms/internal/ads/zzagu;->zza(Lcom/google/android/gms/internal/ads/zzagt;)[B

    move-result-object v2

    invoke-direct {v6, v2}, Lcom/google/android/gms/internal/ads/zzfu;-><init>([B)V

    invoke-virtual {v6}, Lcom/google/android/gms/internal/ads/zzfu;->zzb()I

    move-result v2

    iget-object v3, v0, Lcom/google/android/gms/internal/ads/zzakd;->zzG:[Lcom/google/android/gms/internal/ads/zzafa;

    .line 75
    array-length v7, v3

    const/4 v10, 0x0

    :goto_14
    if-ge v10, v7, :cond_2b

    aget-object v11, v3, v10

    const/4 v12, 0x0

    .line 76
    invoke-virtual {v6, v12}, Lcom/google/android/gms/internal/ads/zzfu;->zzK(I)V

    .line 77
    invoke-interface {v11, v6, v2}, Lcom/google/android/gms/internal/ads/zzafa;->zzq(Lcom/google/android/gms/internal/ads/zzfu;I)V

    add-int/lit8 v10, v10, 0x1

    goto :goto_14

    :cond_2b
    cmp-long v3, v13, v4

    if-nez v3, :cond_2c

    iget-object v3, v0, Lcom/google/android/gms/internal/ads/zzakd;->zzo:Ljava/util/ArrayDeque;

    new-instance v4, Lcom/google/android/gms/internal/ads/zzakb;

    const/4 v5, 0x1

    invoke-direct {v4, v8, v9, v5, v2}, Lcom/google/android/gms/internal/ads/zzakb;-><init>(JZI)V

    .line 78
    invoke-virtual {v3, v4}, Ljava/util/ArrayDeque;->addLast(Ljava/lang/Object;)V

    iget v3, v0, Lcom/google/android/gms/internal/ads/zzakd;->zzw:I

    add-int/2addr v3, v2

    iput v3, v0, Lcom/google/android/gms/internal/ads/zzakd;->zzw:I

    goto :goto_16

    :cond_2c
    iget-object v3, v0, Lcom/google/android/gms/internal/ads/zzakd;->zzo:Ljava/util/ArrayDeque;

    .line 79
    invoke-virtual {v3}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_2d

    iget-object v3, v0, Lcom/google/android/gms/internal/ads/zzakd;->zzo:Ljava/util/ArrayDeque;

    new-instance v4, Lcom/google/android/gms/internal/ads/zzakb;

    const/4 v5, 0x0

    invoke-direct {v4, v13, v14, v5, v2}, Lcom/google/android/gms/internal/ads/zzakb;-><init>(JZI)V

    .line 80
    invoke-virtual {v3, v4}, Ljava/util/ArrayDeque;->addLast(Ljava/lang/Object;)V

    iget v3, v0, Lcom/google/android/gms/internal/ads/zzakd;->zzw:I

    add-int/2addr v3, v2

    iput v3, v0, Lcom/google/android/gms/internal/ads/zzakd;->zzw:I

    goto :goto_16

    :cond_2d
    iget-object v3, v0, Lcom/google/android/gms/internal/ads/zzakd;->zzG:[Lcom/google/android/gms/internal/ads/zzafa;

    .line 81
    array-length v4, v3

    const/4 v5, 0x0

    :goto_15
    if-ge v5, v4, :cond_2f

    aget-object v6, v3, v5

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v9, 0x1

    move-wide v7, v13

    move v10, v2

    .line 82
    invoke-interface/range {v6 .. v12}, Lcom/google/android/gms/internal/ads/zzafa;->zzs(JIIILcom/google/android/gms/internal/ads/zzaez;)V

    add-int/lit8 v5, v5, 0x1

    goto :goto_15

    .line 70
    :cond_2e
    move-object v3, v1

    check-cast v3, Lcom/google/android/gms/internal/ads/zzadi;

    const/4 v5, 0x0

    .line 23
    invoke-virtual {v3, v2, v5}, Lcom/google/android/gms/internal/ads/zzadi;->zzo(IZ)Z

    .line 26
    :cond_2f
    :goto_16
    invoke-interface/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/zzadv;->zzf()J

    move-result-wide v2

    .line 84
    invoke-direct {v0, v2, v3}, Lcom/google/android/gms/internal/ads/zzakd;->zzj(J)V

    goto/16 :goto_0

    :cond_30
    move v5, v9

    .line 23
    iget v2, v0, Lcom/google/android/gms/internal/ads/zzakd;->zzt:I

    if-nez v2, :cond_32

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzakd;->zzm:Lcom/google/android/gms/internal/ads/zzfu;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzfu;->zzM()[B

    move-result-object v2

    const/16 v6, 0x8

    const/4 v7, 0x1

    .line 7
    invoke-interface {v1, v2, v5, v6, v7}, Lcom/google/android/gms/internal/ads/zzadv;->zzn([BIIZ)Z

    move-result v2

    if-nez v2, :cond_31

    const/4 v1, -0x1

    return v1

    :cond_31
    iput v6, v0, Lcom/google/android/gms/internal/ads/zzakd;->zzt:I

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzakd;->zzm:Lcom/google/android/gms/internal/ads/zzfu;

    .line 8
    invoke-virtual {v2, v5}, Lcom/google/android/gms/internal/ads/zzfu;->zzK(I)V

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzakd;->zzm:Lcom/google/android/gms/internal/ads/zzfu;

    .line 9
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzfu;->zzu()J

    move-result-wide v5

    iput-wide v5, v0, Lcom/google/android/gms/internal/ads/zzakd;->zzs:J

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzakd;->zzm:Lcom/google/android/gms/internal/ads/zzfu;

    .line 10
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzfu;->zzg()I

    move-result v2

    iput v2, v0, Lcom/google/android/gms/internal/ads/zzakd;->zzr:I

    :cond_32
    iget-wide v5, v0, Lcom/google/android/gms/internal/ads/zzakd;->zzs:J

    const-wide/16 v7, 0x1

    cmp-long v2, v5, v7

    if-nez v2, :cond_33

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzakd;->zzm:Lcom/google/android/gms/internal/ads/zzfu;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzfu;->zzM()[B

    move-result-object v2

    move-object v5, v1

    check-cast v5, Lcom/google/android/gms/internal/ads/zzadi;

    const/16 v6, 0x8

    const/4 v7, 0x0

    .line 11
    invoke-virtual {v5, v2, v6, v6, v7}, Lcom/google/android/gms/internal/ads/zzadi;->zzn([BIIZ)Z

    iget v2, v0, Lcom/google/android/gms/internal/ads/zzakd;->zzt:I

    add-int/2addr v2, v6

    iput v2, v0, Lcom/google/android/gms/internal/ads/zzakd;->zzt:I

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzakd;->zzm:Lcom/google/android/gms/internal/ads/zzfu;

    .line 12
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzfu;->zzv()J

    move-result-wide v5

    iput-wide v5, v0, Lcom/google/android/gms/internal/ads/zzakd;->zzs:J

    goto :goto_18

    :cond_33
    const-wide/16 v7, 0x0

    cmp-long v2, v5, v7

    if-nez v2, :cond_36

    .line 150
    invoke-interface/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/zzadv;->zzd()J

    move-result-wide v5

    const-wide/16 v7, -0x1

    cmp-long v2, v5, v7

    if-nez v2, :cond_35

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzakd;->zzn:Ljava/util/ArrayDeque;

    .line 13
    invoke-virtual {v2}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_34

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzakd;->zzn:Ljava/util/ArrayDeque;

    .line 14
    invoke-virtual {v2}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/ads/zzajm;

    iget-wide v5, v2, Lcom/google/android/gms/internal/ads/zzajm;->zza:J

    goto :goto_17

    :cond_34
    move-wide v5, v7

    :cond_35
    :goto_17
    cmp-long v2, v5, v7

    if-eqz v2, :cond_36

    invoke-interface/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/zzadv;->zzf()J

    move-result-wide v7

    sub-long/2addr v5, v7

    iget v2, v0, Lcom/google/android/gms/internal/ads/zzakd;->zzt:I

    int-to-long v7, v2

    add-long/2addr v5, v7

    iput-wide v5, v0, Lcom/google/android/gms/internal/ads/zzakd;->zzs:J

    .line 12
    :cond_36
    :goto_18
    iget-wide v5, v0, Lcom/google/android/gms/internal/ads/zzakd;->zzs:J

    iget v2, v0, Lcom/google/android/gms/internal/ads/zzakd;->zzt:I

    int-to-long v7, v2

    cmp-long v2, v5, v7

    if-ltz v2, :cond_43

    .line 147
    invoke-interface/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/zzadv;->zzf()J

    move-result-wide v5

    sub-long/2addr v5, v7

    iget v2, v0, Lcom/google/android/gms/internal/ads/zzakd;->zzr:I

    const v7, 0x6d646174

    const v8, 0x6d6f6f66

    if-eq v2, v8, :cond_37

    if-ne v2, v7, :cond_38

    :cond_37
    iget-boolean v2, v0, Lcom/google/android/gms/internal/ads/zzakd;->zzI:Z

    if-nez v2, :cond_38

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzakd;->zzF:Lcom/google/android/gms/internal/ads/zzadx;

    new-instance v9, Lcom/google/android/gms/internal/ads/zzaes;

    iget-wide v10, v0, Lcom/google/android/gms/internal/ads/zzakd;->zzy:J

    invoke-direct {v9, v10, v11, v5, v6}, Lcom/google/android/gms/internal/ads/zzaes;-><init>(JJ)V

    .line 15
    invoke-interface {v2, v9}, Lcom/google/android/gms/internal/ads/zzadx;->zzO(Lcom/google/android/gms/internal/ads/zzaet;)V

    const/4 v2, 0x1

    iput-boolean v2, v0, Lcom/google/android/gms/internal/ads/zzakd;->zzI:Z

    :cond_38
    iget v2, v0, Lcom/google/android/gms/internal/ads/zzakd;->zzr:I

    if-ne v2, v8, :cond_39

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzakd;->zzf:Landroid/util/SparseArray;

    .line 16
    invoke-virtual {v2}, Landroid/util/SparseArray;->size()I

    move-result v2

    const/4 v9, 0x0

    :goto_19
    if-ge v9, v2, :cond_39

    iget-object v10, v0, Lcom/google/android/gms/internal/ads/zzakd;->zzf:Landroid/util/SparseArray;

    .line 17
    invoke-virtual {v10, v9}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lcom/google/android/gms/internal/ads/zzakc;

    iget-object v10, v10, Lcom/google/android/gms/internal/ads/zzakc;->zzb:Lcom/google/android/gms/internal/ads/zzakr;

    iput-wide v5, v10, Lcom/google/android/gms/internal/ads/zzakr;->zzc:J

    iput-wide v5, v10, Lcom/google/android/gms/internal/ads/zzakr;->zzb:J

    add-int/lit8 v9, v9, 0x1

    goto :goto_19

    :cond_39
    iget v2, v0, Lcom/google/android/gms/internal/ads/zzakd;->zzr:I

    if-ne v2, v7, :cond_3a

    const/4 v7, 0x0

    iput-object v7, v0, Lcom/google/android/gms/internal/ads/zzakd;->zzA:Lcom/google/android/gms/internal/ads/zzakc;

    iget-wide v2, v0, Lcom/google/android/gms/internal/ads/zzakd;->zzs:J

    add-long/2addr v5, v2

    iput-wide v5, v0, Lcom/google/android/gms/internal/ads/zzakd;->zzv:J

    const/4 v2, 0x2

    iput v2, v0, Lcom/google/android/gms/internal/ads/zzakd;->zzq:I

    goto/16 :goto_0

    :cond_3a
    const v5, 0x6d6f6f76

    if-eq v2, v5, :cond_41

    const v5, 0x7472616b

    if-eq v2, v5, :cond_41

    const v5, 0x6d646961

    if-eq v2, v5, :cond_41

    const v5, 0x6d696e66

    if-eq v2, v5, :cond_41

    const v5, 0x7374626c

    if-eq v2, v5, :cond_41

    if-eq v2, v8, :cond_41

    const v5, 0x74726166

    if-eq v2, v5, :cond_41

    const v5, 0x6d766578

    if-eq v2, v5, :cond_41

    const v5, 0x65647473

    if-ne v2, v5, :cond_3b

    goto/16 :goto_1b

    :cond_3b
    const v5, 0x68646c72    # 4.3148E24f

    const-wide/32 v6, 0x7fffffff

    if-eq v2, v5, :cond_3e

    const v5, 0x6d646864

    if-eq v2, v5, :cond_3e

    const v5, 0x6d766864

    if-eq v2, v5, :cond_3e

    if-eq v2, v4, :cond_3e

    const v4, 0x73747364

    if-eq v2, v4, :cond_3e

    const v4, 0x73747473

    if-eq v2, v4, :cond_3e

    const v4, 0x63747473

    if-eq v2, v4, :cond_3e

    const v4, 0x73747363

    if-eq v2, v4, :cond_3e

    const v4, 0x7374737a

    if-eq v2, v4, :cond_3e

    const v4, 0x73747a32

    if-eq v2, v4, :cond_3e

    const v4, 0x7374636f

    if-eq v2, v4, :cond_3e

    const v4, 0x636f3634

    if-eq v2, v4, :cond_3e

    const v4, 0x73747373

    if-eq v2, v4, :cond_3e

    const v4, 0x74666474

    if-eq v2, v4, :cond_3e

    const v4, 0x74666864

    if-eq v2, v4, :cond_3e

    const v4, 0x746b6864

    if-eq v2, v4, :cond_3e

    const v4, 0x74726578

    if-eq v2, v4, :cond_3e

    const v4, 0x7472756e

    if-eq v2, v4, :cond_3e

    const v4, 0x70737368    # 3.013775E29f

    if-eq v2, v4, :cond_3e

    const v4, 0x7361697a

    if-eq v2, v4, :cond_3e

    const v4, 0x7361696f

    if-eq v2, v4, :cond_3e

    const v4, 0x73656e63

    if-eq v2, v4, :cond_3e

    const v4, 0x75756964

    if-eq v2, v4, :cond_3e

    const v4, 0x73626770

    if-eq v2, v4, :cond_3e

    const v4, 0x73677064

    if-eq v2, v4, :cond_3e

    const v4, 0x656c7374

    if-eq v2, v4, :cond_3e

    const v4, 0x6d656864

    if-eq v2, v4, :cond_3e

    if-ne v2, v3, :cond_3c

    goto :goto_1a

    .line 22
    :cond_3c
    iget-wide v2, v0, Lcom/google/android/gms/internal/ads/zzakd;->zzs:J

    cmp-long v2, v2, v6

    if-gtz v2, :cond_3d

    const/4 v2, 0x0

    .line 150
    iput-object v2, v0, Lcom/google/android/gms/internal/ads/zzakd;->zzu:Lcom/google/android/gms/internal/ads/zzfu;

    const/4 v2, 0x1

    iput v2, v0, Lcom/google/android/gms/internal/ads/zzakd;->zzq:I

    goto/16 :goto_0

    .line 22
    :cond_3d
    const-string v1, "Skipping atom with length > 2147483647 (unsupported)."

    .line 150
    invoke-static {v1}, Lcom/google/android/gms/internal/ads/zzch;->zzc(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzch;

    move-result-object v1

    throw v1

    .line 20
    :cond_3e
    :goto_1a
    iget v2, v0, Lcom/google/android/gms/internal/ads/zzakd;->zzt:I

    const/16 v3, 0x8

    if-ne v2, v3, :cond_40

    .line 148
    iget-wide v4, v0, Lcom/google/android/gms/internal/ads/zzakd;->zzs:J

    cmp-long v2, v4, v6

    if-gtz v2, :cond_3f

    .line 21
    new-instance v2, Lcom/google/android/gms/internal/ads/zzfu;

    iget-wide v4, v0, Lcom/google/android/gms/internal/ads/zzakd;->zzs:J

    long-to-int v4, v4

    invoke-direct {v2, v4}, Lcom/google/android/gms/internal/ads/zzfu;-><init>(I)V

    iget-object v4, v0, Lcom/google/android/gms/internal/ads/zzakd;->zzm:Lcom/google/android/gms/internal/ads/zzfu;

    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/zzfu;->zzM()[B

    move-result-object v4

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzfu;->zzM()[B

    move-result-object v5

    const/4 v6, 0x0

    .line 22
    invoke-static {v4, v6, v5, v6, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iput-object v2, v0, Lcom/google/android/gms/internal/ads/zzakd;->zzu:Lcom/google/android/gms/internal/ads/zzfu;

    const/4 v2, 0x1

    iput v2, v0, Lcom/google/android/gms/internal/ads/zzakd;->zzq:I

    goto/16 :goto_0

    .line 148
    :cond_3f
    const-string v1, "Leaf atom with length > 2147483647 (unsupported)."

    .line 149
    invoke-static {v1}, Lcom/google/android/gms/internal/ads/zzch;->zzc(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzch;

    move-result-object v1

    throw v1

    .line 20
    :cond_40
    const-string v1, "Leaf atom defines extended atom size (unsupported)."

    .line 148
    invoke-static {v1}, Lcom/google/android/gms/internal/ads/zzch;->zzc(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzch;

    move-result-object v1

    throw v1

    .line 17
    :cond_41
    :goto_1b
    invoke-interface/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/zzadv;->zzf()J

    move-result-wide v3

    iget-wide v5, v0, Lcom/google/android/gms/internal/ads/zzakd;->zzs:J

    add-long/2addr v3, v5

    iget-object v5, v0, Lcom/google/android/gms/internal/ads/zzakd;->zzn:Ljava/util/ArrayDeque;

    new-instance v6, Lcom/google/android/gms/internal/ads/zzajm;

    const-wide/16 v7, -0x8

    add-long/2addr v3, v7

    .line 18
    invoke-direct {v6, v2, v3, v4}, Lcom/google/android/gms/internal/ads/zzajm;-><init>(IJ)V

    invoke-virtual {v5, v6}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    iget-wide v5, v0, Lcom/google/android/gms/internal/ads/zzakd;->zzs:J

    iget v2, v0, Lcom/google/android/gms/internal/ads/zzakd;->zzt:I

    int-to-long v7, v2

    cmp-long v2, v5, v7

    if-nez v2, :cond_42

    .line 19
    invoke-direct {v0, v3, v4}, Lcom/google/android/gms/internal/ads/zzakd;->zzj(J)V

    goto/16 :goto_0

    .line 20
    :cond_42
    invoke-direct/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/zzakd;->zzh()V

    goto/16 :goto_0

    .line 12
    :cond_43
    const-string v1, "Atom size less than header length (unsupported)."

    .line 147
    invoke-static {v1}, Lcom/google/android/gms/internal/ads/zzch;->zzc(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzch;

    move-result-object v1

    throw v1
.end method

.method public final synthetic zzc()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzakd;->zzp:Lcom/google/android/gms/internal/ads/zzgbc;

    return-object v0
.end method

.method public final zzd(Lcom/google/android/gms/internal/ads/zzadx;)V
    .locals 5

    .line 1
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzakd;->zzF:Lcom/google/android/gms/internal/ads/zzadx;

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzakd;->zzh()V

    const/4 p1, 0x2

    new-array p1, p1, [Lcom/google/android/gms/internal/ads/zzafa;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzakd;->zzG:[Lcom/google/android/gms/internal/ads/zzafa;

    const/4 v0, 0x0

    .line 2
    invoke-static {p1, v0}, Lcom/google/android/gms/internal/ads/zzgd;->zzP([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Lcom/google/android/gms/internal/ads/zzafa;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzakd;->zzG:[Lcom/google/android/gms/internal/ads/zzafa;

    .line 3
    array-length v1, p1

    move v2, v0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, p1, v2

    sget-object v4, Lcom/google/android/gms/internal/ads/zzakd;->zzc:Lcom/google/android/gms/internal/ads/zzan;

    .line 4
    invoke-interface {v3, v4}, Lcom/google/android/gms/internal/ads/zzafa;->zzl(Lcom/google/android/gms/internal/ads/zzan;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzakd;->zze:Ljava/util/List;

    .line 5
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    new-array p1, p1, [Lcom/google/android/gms/internal/ads/zzafa;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzakd;->zzH:[Lcom/google/android/gms/internal/ads/zzafa;

    const/16 p1, 0x64

    :goto_1
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzakd;->zzH:[Lcom/google/android/gms/internal/ads/zzafa;

    .line 6
    array-length v1, v1

    if-ge v0, v1, :cond_1

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzakd;->zzF:Lcom/google/android/gms/internal/ads/zzadx;

    add-int/lit8 v2, p1, 0x1

    const/4 v3, 0x3

    .line 7
    invoke-interface {v1, p1, v3}, Lcom/google/android/gms/internal/ads/zzadx;->zzw(II)Lcom/google/android/gms/internal/ads/zzafa;

    move-result-object p1

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzakd;->zze:Ljava/util/List;

    .line 8
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/ads/zzan;

    invoke-interface {p1, v1}, Lcom/google/android/gms/internal/ads/zzafa;->zzl(Lcom/google/android/gms/internal/ads/zzan;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzakd;->zzH:[Lcom/google/android/gms/internal/ads/zzafa;

    .line 9
    aput-object p1, v1, v0

    add-int/lit8 v0, v0, 0x1

    move p1, v2

    goto :goto_1

    :cond_1
    return-void
.end method

.method public final zze(JJ)V
    .locals 2

    .line 1
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzakd;->zzf:Landroid/util/SparseArray;

    invoke-virtual {p1}, Landroid/util/SparseArray;->size()I

    move-result p1

    const/4 p2, 0x0

    move v0, p2

    :goto_0
    if-ge v0, p1, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzakd;->zzf:Landroid/util/SparseArray;

    .line 2
    invoke-virtual {v1, v0}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/ads/zzakc;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzakc;->zzi()V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzakd;->zzo:Ljava/util/ArrayDeque;

    .line 3
    invoke-virtual {p1}, Ljava/util/ArrayDeque;->clear()V

    iput p2, p0, Lcom/google/android/gms/internal/ads/zzakd;->zzw:I

    iput-wide p3, p0, Lcom/google/android/gms/internal/ads/zzakd;->zzx:J

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzakd;->zzn:Ljava/util/ArrayDeque;

    .line 4
    invoke-virtual {p1}, Ljava/util/ArrayDeque;->clear()V

    .line 5
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzakd;->zzh()V

    return-void
.end method

.method public final zzf(Lcom/google/android/gms/internal/ads/zzadv;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzako;->zza(Lcom/google/android/gms/internal/ads/zzadv;)Lcom/google/android/gms/internal/ads/zzaex;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 2
    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzgbc;->zzn(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/zzgbc;

    move-result-object v0

    goto :goto_0

    :cond_0
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzgbc;->zzm()Lcom/google/android/gms/internal/ads/zzgbc;

    move-result-object v0

    :goto_0
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzakd;->zzp:Lcom/google/android/gms/internal/ads/zzgbc;

    if-nez p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method
