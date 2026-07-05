.class public final Lcom/google/android/gms/internal/ads/zzajg;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@23.2.0"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzadu;


# static fields
.field public static final zza:Lcom/google/android/gms/internal/ads/zzaea;

.field private static final zzb:Lcom/google/android/gms/internal/ads/zzaho;


# instance fields
.field private final zzc:Lcom/google/android/gms/internal/ads/zzfu;

.field private final zzd:Lcom/google/android/gms/internal/ads/zzaen;

.field private final zze:Lcom/google/android/gms/internal/ads/zzaej;

.field private final zzf:Lcom/google/android/gms/internal/ads/zzael;

.field private final zzg:Lcom/google/android/gms/internal/ads/zzafa;

.field private zzh:Lcom/google/android/gms/internal/ads/zzadx;

.field private zzi:Lcom/google/android/gms/internal/ads/zzafa;

.field private zzj:Lcom/google/android/gms/internal/ads/zzafa;

.field private zzk:I

.field private zzl:Lcom/google/android/gms/internal/ads/zzcd;

.field private zzm:J

.field private zzn:J

.field private zzo:J

.field private zzp:I

.field private zzq:Lcom/google/android/gms/internal/ads/zzaji;

.field private zzr:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/ads/zzaje;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzaje;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ads/zzajg;->zza:Lcom/google/android/gms/internal/ads/zzaea;

    new-instance v0, Lcom/google/android/gms/internal/ads/zzajf;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzajf;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ads/zzajg;->zzb:Lcom/google/android/gms/internal/ads/zzaho;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    throw v0
.end method

.method public constructor <init>(I)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p1, Lcom/google/android/gms/internal/ads/zzfu;

    const/16 v0, 0xa

    invoke-direct {p1, v0}, Lcom/google/android/gms/internal/ads/zzfu;-><init>(I)V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzajg;->zzc:Lcom/google/android/gms/internal/ads/zzfu;

    new-instance p1, Lcom/google/android/gms/internal/ads/zzaen;

    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/zzaen;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzajg;->zzd:Lcom/google/android/gms/internal/ads/zzaen;

    new-instance p1, Lcom/google/android/gms/internal/ads/zzaej;

    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/zzaej;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzajg;->zze:Lcom/google/android/gms/internal/ads/zzaej;

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/zzajg;->zzm:J

    new-instance p1, Lcom/google/android/gms/internal/ads/zzael;

    .line 2
    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/zzael;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzajg;->zzf:Lcom/google/android/gms/internal/ads/zzael;

    new-instance p1, Lcom/google/android/gms/internal/ads/zzadt;

    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/zzadt;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzajg;->zzg:Lcom/google/android/gms/internal/ads/zzafa;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzajg;->zzj:Lcom/google/android/gms/internal/ads/zzafa;

    return-void
.end method

.method private final zzg(Lcom/google/android/gms/internal/ads/zzadv;)I
    .locals 18
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .annotation runtime Lorg/checkerframework/checker/nullness/qual/RequiresNonNull;
        value = {
            "extractorOutput",
            "realTrackOutput"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    .line 1
    iget v2, v0, Lcom/google/android/gms/internal/ads/zzajg;->zzk:I

    const/4 v3, -0x1

    const/4 v4, 0x0

    if-nez v2, :cond_0

    :try_start_0
    invoke-direct {v0, v1, v4}, Lcom/google/android/gms/internal/ads/zzajg;->zzl(Lcom/google/android/gms/internal/ads/zzadv;Z)Z
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    return v3

    :cond_0
    :goto_0
    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzajg;->zzq:Lcom/google/android/gms/internal/ads/zzaji;

    const/4 v8, 0x1

    if-nez v2, :cond_15

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzajg;->zzd:Lcom/google/android/gms/internal/ads/zzaen;

    .line 2
    new-instance v14, Lcom/google/android/gms/internal/ads/zzfu;

    iget v2, v2, Lcom/google/android/gms/internal/ads/zzaen;->zzc:I

    invoke-direct {v14, v2}, Lcom/google/android/gms/internal/ads/zzfu;-><init>(I)V

    invoke-virtual {v14}, Lcom/google/android/gms/internal/ads/zzfu;->zzM()[B

    move-result-object v2

    iget-object v9, v0, Lcom/google/android/gms/internal/ads/zzajg;->zzd:Lcom/google/android/gms/internal/ads/zzaen;

    iget v9, v9, Lcom/google/android/gms/internal/ads/zzaen;->zzc:I

    move-object v15, v1

    check-cast v15, Lcom/google/android/gms/internal/ads/zzadi;

    .line 3
    invoke-virtual {v15, v2, v4, v9, v4}, Lcom/google/android/gms/internal/ads/zzadi;->zzm([BIIZ)Z

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzajg;->zzd:Lcom/google/android/gms/internal/ads/zzaen;

    iget v9, v2, Lcom/google/android/gms/internal/ads/zzaen;->zza:I

    and-int/2addr v9, v8

    const/16 v10, 0x24

    const/16 v11, 0x15

    if-eqz v9, :cond_1

    iget v2, v2, Lcom/google/android/gms/internal/ads/zzaen;->zze:I

    if-eq v2, v8, :cond_3

    move v11, v10

    goto :goto_1

    .line 7
    :cond_1
    iget v2, v2, Lcom/google/android/gms/internal/ads/zzaen;->zze:I

    if-eq v2, v8, :cond_2

    goto :goto_1

    :cond_2
    const/16 v11, 0xd

    .line 3
    :cond_3
    :goto_1
    invoke-virtual {v14}, Lcom/google/android/gms/internal/ads/zzfu;->zze()I

    move-result v2

    add-int/lit8 v9, v11, 0x4

    const v12, 0x496e666f

    const v13, 0x56425249

    const v8, 0x58696e67

    if-lt v2, v9, :cond_4

    .line 4
    invoke-virtual {v14, v11}, Lcom/google/android/gms/internal/ads/zzfu;->zzK(I)V

    .line 5
    invoke-virtual {v14}, Lcom/google/android/gms/internal/ads/zzfu;->zzg()I

    move-result v2

    if-eq v2, v8, :cond_6

    if-ne v2, v12, :cond_4

    move v2, v12

    goto :goto_2

    .line 13
    :cond_4
    invoke-virtual {v14}, Lcom/google/android/gms/internal/ads/zzfu;->zze()I

    move-result v2

    const/16 v9, 0x28

    if-lt v2, v9, :cond_5

    .line 6
    invoke-virtual {v14, v10}, Lcom/google/android/gms/internal/ads/zzfu;->zzK(I)V

    .line 7
    invoke-virtual {v14}, Lcom/google/android/gms/internal/ads/zzfu;->zzg()I

    move-result v2

    if-ne v2, v13, :cond_5

    move v2, v13

    goto :goto_2

    :cond_5
    move v2, v4

    :cond_6
    :goto_2
    const-wide/16 v9, -0x1

    if-eq v2, v12, :cond_7

    if-eq v2, v13, :cond_8

    if-eq v2, v8, :cond_7

    .line 14
    invoke-interface/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/zzadv;->zzj()V

    move-wide v5, v9

    const/4 v2, 0x0

    goto :goto_5

    :cond_7
    move-wide v5, v9

    goto :goto_3

    .line 23
    :cond_8
    invoke-interface/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/zzadv;->zzd()J

    move-result-wide v11

    invoke-interface/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/zzadv;->zzf()J

    move-result-wide v16

    iget-object v13, v0, Lcom/google/android/gms/internal/ads/zzajg;->zzd:Lcom/google/android/gms/internal/ads/zzaen;

    move-wide v5, v9

    move-wide v9, v11

    move-wide/from16 v11, v16

    .line 8
    invoke-static/range {v9 .. v14}, Lcom/google/android/gms/internal/ads/zzajj;->zzb(JJLcom/google/android/gms/internal/ads/zzaen;Lcom/google/android/gms/internal/ads/zzfu;)Lcom/google/android/gms/internal/ads/zzajj;

    move-result-object v2

    iget-object v8, v0, Lcom/google/android/gms/internal/ads/zzajg;->zzd:Lcom/google/android/gms/internal/ads/zzaen;

    iget v8, v8, Lcom/google/android/gms/internal/ads/zzaen;->zzc:I

    .line 9
    invoke-virtual {v15, v8, v4}, Lcom/google/android/gms/internal/ads/zzadi;->zzo(IZ)Z

    goto :goto_5

    :goto_3
    iget-object v9, v0, Lcom/google/android/gms/internal/ads/zzajg;->zzd:Lcom/google/android/gms/internal/ads/zzaen;

    .line 10
    invoke-static {v9, v14}, Lcom/google/android/gms/internal/ads/zzajk;->zza(Lcom/google/android/gms/internal/ads/zzaen;Lcom/google/android/gms/internal/ads/zzfu;)Lcom/google/android/gms/internal/ads/zzajk;

    move-result-object v9

    iget-object v10, v0, Lcom/google/android/gms/internal/ads/zzajg;->zze:Lcom/google/android/gms/internal/ads/zzaej;

    invoke-virtual {v10}, Lcom/google/android/gms/internal/ads/zzaej;->zza()Z

    move-result v11

    if-nez v11, :cond_9

    iget v11, v9, Lcom/google/android/gms/internal/ads/zzajk;->zzd:I

    if-eq v11, v3, :cond_9

    iget v12, v9, Lcom/google/android/gms/internal/ads/zzajk;->zze:I

    if-eq v12, v3, :cond_9

    iput v11, v10, Lcom/google/android/gms/internal/ads/zzaej;->zza:I

    iput v12, v10, Lcom/google/android/gms/internal/ads/zzaej;->zzb:I

    :cond_9
    invoke-interface/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/zzadv;->zzf()J

    move-result-wide v10

    iget-object v12, v0, Lcom/google/android/gms/internal/ads/zzajg;->zzd:Lcom/google/android/gms/internal/ads/zzaen;

    iget v12, v12, Lcom/google/android/gms/internal/ads/zzaen;->zzc:I

    .line 11
    invoke-virtual {v15, v12, v4}, Lcom/google/android/gms/internal/ads/zzadi;->zzo(IZ)Z

    if-ne v2, v8, :cond_a

    invoke-interface/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/zzadv;->zzd()J

    move-result-wide v12

    .line 12
    invoke-static {v12, v13, v9, v10, v11}, Lcom/google/android/gms/internal/ads/zzajl;->zzb(JLcom/google/android/gms/internal/ads/zzajk;J)Lcom/google/android/gms/internal/ads/zzajl;

    move-result-object v2

    goto :goto_5

    :cond_a
    iget-wide v8, v9, Lcom/google/android/gms/internal/ads/zzajk;->zzc:J

    cmp-long v2, v8, v5

    if-eqz v2, :cond_b

    add-long v9, v10, v8

    goto :goto_4

    :cond_b
    move-wide v9, v5

    .line 13
    :goto_4
    invoke-direct {v0, v1, v9, v10, v4}, Lcom/google/android/gms/internal/ads/zzajg;->zzi(Lcom/google/android/gms/internal/ads/zzadv;JZ)Lcom/google/android/gms/internal/ads/zzaji;

    move-result-object v2

    .line 14
    :goto_5
    iget-object v8, v0, Lcom/google/android/gms/internal/ads/zzajg;->zzl:Lcom/google/android/gms/internal/ads/zzcd;

    invoke-interface/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/zzadv;->zzf()J

    move-result-wide v9

    if-eqz v8, :cond_f

    .line 15
    invoke-virtual {v8}, Lcom/google/android/gms/internal/ads/zzcd;->zza()I

    move-result v11

    move v12, v4

    :goto_6
    if-ge v12, v11, :cond_f

    .line 16
    invoke-virtual {v8, v12}, Lcom/google/android/gms/internal/ads/zzcd;->zzb(I)Lcom/google/android/gms/internal/ads/zzcc;

    move-result-object v13

    instance-of v14, v13, Lcom/google/android/gms/internal/ads/zzahv;

    if-eqz v14, :cond_e

    .line 17
    check-cast v13, Lcom/google/android/gms/internal/ads/zzahv;

    .line 18
    invoke-virtual {v8}, Lcom/google/android/gms/internal/ads/zzcd;->zza()I

    move-result v11

    move v12, v4

    :goto_7
    if-ge v12, v11, :cond_d

    .line 19
    invoke-virtual {v8, v12}, Lcom/google/android/gms/internal/ads/zzcd;->zzb(I)Lcom/google/android/gms/internal/ads/zzcc;

    move-result-object v14

    instance-of v15, v14, Lcom/google/android/gms/internal/ads/zzahz;

    if-eqz v15, :cond_c

    .line 20
    check-cast v14, Lcom/google/android/gms/internal/ads/zzahz;

    iget-object v15, v14, Lcom/google/android/gms/internal/ads/zzahz;->zzf:Ljava/lang/String;

    const-string v7, "TLEN"

    .line 21
    invoke-virtual {v15, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_c

    .line 22
    iget-object v7, v14, Lcom/google/android/gms/internal/ads/zzahz;->zzc:Lcom/google/android/gms/internal/ads/zzgbc;

    invoke-virtual {v7, v4}, Lcom/google/android/gms/internal/ads/zzgbc;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    invoke-static {v7}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v7

    invoke-static {v7, v8}, Lcom/google/android/gms/internal/ads/zzgd;->zzr(J)J

    move-result-wide v7

    goto :goto_8

    :cond_c
    add-int/lit8 v12, v12, 0x1

    goto :goto_7

    :cond_d
    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    .line 17
    :goto_8
    invoke-static {v9, v10, v13, v7, v8}, Lcom/google/android/gms/internal/ads/zzajd;->zzb(JLcom/google/android/gms/internal/ads/zzahv;J)Lcom/google/android/gms/internal/ads/zzajd;

    move-result-object v7

    goto :goto_9

    :cond_e
    add-int/lit8 v12, v12, 0x1

    goto :goto_6

    :cond_f
    const/4 v7, 0x0

    :goto_9
    iget-boolean v8, v0, Lcom/google/android/gms/internal/ads/zzajg;->zzr:Z

    if-eqz v8, :cond_10

    new-instance v2, Lcom/google/android/gms/internal/ads/zzajh;

    invoke-direct {v2}, Lcom/google/android/gms/internal/ads/zzajh;-><init>()V

    goto :goto_b

    :cond_10
    if-eqz v7, :cond_11

    move-object v2, v7

    goto :goto_a

    :cond_11
    if-nez v2, :cond_12

    const/4 v2, 0x0

    :cond_12
    :goto_a
    if-eqz v2, :cond_13

    .line 47
    invoke-interface {v2}, Lcom/google/android/gms/internal/ads/zzaji;->zzh()Z

    goto :goto_b

    .line 23
    :cond_13
    invoke-direct {v0, v1, v5, v6, v4}, Lcom/google/android/gms/internal/ads/zzajg;->zzi(Lcom/google/android/gms/internal/ads/zzadv;JZ)Lcom/google/android/gms/internal/ads/zzaji;

    move-result-object v2

    .line 17
    :goto_b
    iput-object v2, v0, Lcom/google/android/gms/internal/ads/zzajg;->zzq:Lcom/google/android/gms/internal/ads/zzaji;

    iget-object v5, v0, Lcom/google/android/gms/internal/ads/zzajg;->zzh:Lcom/google/android/gms/internal/ads/zzadx;

    .line 24
    invoke-interface {v5, v2}, Lcom/google/android/gms/internal/ads/zzadx;->zzO(Lcom/google/android/gms/internal/ads/zzaet;)V

    new-instance v2, Lcom/google/android/gms/internal/ads/zzal;

    .line 25
    invoke-direct {v2}, Lcom/google/android/gms/internal/ads/zzal;-><init>()V

    iget-object v5, v0, Lcom/google/android/gms/internal/ads/zzajg;->zzd:Lcom/google/android/gms/internal/ads/zzaen;

    iget-object v5, v5, Lcom/google/android/gms/internal/ads/zzaen;->zzb:Ljava/lang/String;

    .line 26
    invoke-virtual {v2, v5}, Lcom/google/android/gms/internal/ads/zzal;->zzX(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzal;

    const/16 v5, 0x1000

    .line 27
    invoke-virtual {v2, v5}, Lcom/google/android/gms/internal/ads/zzal;->zzP(I)Lcom/google/android/gms/internal/ads/zzal;

    iget-object v5, v0, Lcom/google/android/gms/internal/ads/zzajg;->zzd:Lcom/google/android/gms/internal/ads/zzaen;

    iget v5, v5, Lcom/google/android/gms/internal/ads/zzaen;->zze:I

    .line 28
    invoke-virtual {v2, v5}, Lcom/google/android/gms/internal/ads/zzal;->zzy(I)Lcom/google/android/gms/internal/ads/zzal;

    iget-object v5, v0, Lcom/google/android/gms/internal/ads/zzajg;->zzd:Lcom/google/android/gms/internal/ads/zzaen;

    iget v5, v5, Lcom/google/android/gms/internal/ads/zzaen;->zzd:I

    .line 29
    invoke-virtual {v2, v5}, Lcom/google/android/gms/internal/ads/zzal;->zzY(I)Lcom/google/android/gms/internal/ads/zzal;

    iget-object v5, v0, Lcom/google/android/gms/internal/ads/zzajg;->zze:Lcom/google/android/gms/internal/ads/zzaej;

    iget v5, v5, Lcom/google/android/gms/internal/ads/zzaej;->zza:I

    .line 30
    invoke-virtual {v2, v5}, Lcom/google/android/gms/internal/ads/zzal;->zzF(I)Lcom/google/android/gms/internal/ads/zzal;

    iget-object v5, v0, Lcom/google/android/gms/internal/ads/zzajg;->zze:Lcom/google/android/gms/internal/ads/zzaej;

    iget v5, v5, Lcom/google/android/gms/internal/ads/zzaej;->zzb:I

    .line 31
    invoke-virtual {v2, v5}, Lcom/google/android/gms/internal/ads/zzal;->zzG(I)Lcom/google/android/gms/internal/ads/zzal;

    iget-object v5, v0, Lcom/google/android/gms/internal/ads/zzajg;->zzl:Lcom/google/android/gms/internal/ads/zzcd;

    .line 32
    invoke-virtual {v2, v5}, Lcom/google/android/gms/internal/ads/zzal;->zzQ(Lcom/google/android/gms/internal/ads/zzcd;)Lcom/google/android/gms/internal/ads/zzal;

    iget-object v5, v0, Lcom/google/android/gms/internal/ads/zzajg;->zzq:Lcom/google/android/gms/internal/ads/zzaji;

    .line 33
    invoke-interface {v5}, Lcom/google/android/gms/internal/ads/zzaji;->zzc()I

    move-result v5

    const v6, -0x7fffffff

    if-eq v5, v6, :cond_14

    iget-object v5, v0, Lcom/google/android/gms/internal/ads/zzajg;->zzq:Lcom/google/android/gms/internal/ads/zzaji;

    .line 34
    invoke-interface {v5}, Lcom/google/android/gms/internal/ads/zzaji;->zzc()I

    move-result v5

    invoke-virtual {v2, v5}, Lcom/google/android/gms/internal/ads/zzal;->zzx(I)Lcom/google/android/gms/internal/ads/zzal;

    :cond_14
    iget-object v5, v0, Lcom/google/android/gms/internal/ads/zzajg;->zzj:Lcom/google/android/gms/internal/ads/zzafa;

    .line 35
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzal;->zzad()Lcom/google/android/gms/internal/ads/zzan;

    move-result-object v2

    invoke-interface {v5, v2}, Lcom/google/android/gms/internal/ads/zzafa;->zzl(Lcom/google/android/gms/internal/ads/zzan;)V

    invoke-interface/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/zzadv;->zzf()J

    move-result-wide v5

    iput-wide v5, v0, Lcom/google/android/gms/internal/ads/zzajg;->zzo:J

    goto :goto_c

    .line 7
    :cond_15
    iget-wide v5, v0, Lcom/google/android/gms/internal/ads/zzajg;->zzo:J

    const-wide/16 v7, 0x0

    cmp-long v2, v5, v7

    if-eqz v2, :cond_16

    invoke-interface/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/zzadv;->zzf()J

    move-result-wide v7

    cmp-long v2, v7, v5

    if-gez v2, :cond_16

    sub-long/2addr v5, v7

    move-object v2, v1

    check-cast v2, Lcom/google/android/gms/internal/ads/zzadi;

    long-to-int v5, v5

    .line 36
    invoke-virtual {v2, v5, v4}, Lcom/google/android/gms/internal/ads/zzadi;->zzo(IZ)Z

    .line 35
    :cond_16
    :goto_c
    iget v2, v0, Lcom/google/android/gms/internal/ads/zzajg;->zzp:I

    if-nez v2, :cond_1c

    .line 37
    invoke-interface/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/zzadv;->zzj()V

    .line 38
    invoke-direct/range {p0 .. p1}, Lcom/google/android/gms/internal/ads/zzajg;->zzk(Lcom/google/android/gms/internal/ads/zzadv;)Z

    move-result v2

    if-eqz v2, :cond_17

    goto/16 :goto_10

    :cond_17
    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzajg;->zzc:Lcom/google/android/gms/internal/ads/zzfu;

    .line 39
    invoke-virtual {v2, v4}, Lcom/google/android/gms/internal/ads/zzfu;->zzK(I)V

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzajg;->zzc:Lcom/google/android/gms/internal/ads/zzfu;

    .line 40
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzfu;->zzg()I

    move-result v2

    iget v5, v0, Lcom/google/android/gms/internal/ads/zzajg;->zzk:I

    int-to-long v5, v5

    invoke-static {v2, v5, v6}, Lcom/google/android/gms/internal/ads/zzajg;->zzj(IJ)Z

    move-result v5

    if-eqz v5, :cond_1b

    .line 41
    invoke-static {v2}, Lcom/google/android/gms/internal/ads/zzaeo;->zzb(I)I

    move-result v5

    if-ne v5, v3, :cond_18

    goto :goto_d

    .line 42
    :cond_18
    iget-object v5, v0, Lcom/google/android/gms/internal/ads/zzajg;->zzd:Lcom/google/android/gms/internal/ads/zzaen;

    .line 43
    invoke-virtual {v5, v2}, Lcom/google/android/gms/internal/ads/zzaen;->zza(I)Z

    iget-wide v5, v0, Lcom/google/android/gms/internal/ads/zzajg;->zzm:J

    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v2, v5, v7

    if-nez v2, :cond_19

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzajg;->zzq:Lcom/google/android/gms/internal/ads/zzaji;

    invoke-interface/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/zzadv;->zzf()J

    move-result-wide v5

    .line 44
    invoke-interface {v2, v5, v6}, Lcom/google/android/gms/internal/ads/zzaji;->zze(J)J

    move-result-wide v5

    iput-wide v5, v0, Lcom/google/android/gms/internal/ads/zzajg;->zzm:J

    :cond_19
    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzajg;->zzd:Lcom/google/android/gms/internal/ads/zzaen;

    iget v5, v2, Lcom/google/android/gms/internal/ads/zzaen;->zzc:I

    iput v5, v0, Lcom/google/android/gms/internal/ads/zzajg;->zzp:I

    iget-object v6, v0, Lcom/google/android/gms/internal/ads/zzajg;->zzq:Lcom/google/android/gms/internal/ads/zzaji;

    instance-of v7, v6, Lcom/google/android/gms/internal/ads/zzajc;

    if-nez v7, :cond_1a

    move v2, v5

    goto :goto_e

    .line 48
    :cond_1a
    check-cast v6, Lcom/google/android/gms/internal/ads/zzajc;

    iget-wide v3, v0, Lcom/google/android/gms/internal/ads/zzajg;->zzn:J

    iget v1, v2, Lcom/google/android/gms/internal/ads/zzaen;->zzg:I

    int-to-long v1, v1

    add-long/2addr v3, v1

    .line 49
    invoke-direct {v0, v3, v4}, Lcom/google/android/gms/internal/ads/zzajg;->zzh(J)J

    const/4 v1, 0x0

    .line 50
    throw v1

    .line 41
    :cond_1b
    :goto_d
    check-cast v1, Lcom/google/android/gms/internal/ads/zzadi;

    const/4 v5, 0x1

    .line 42
    invoke-virtual {v1, v5, v4}, Lcom/google/android/gms/internal/ads/zzadi;->zzo(IZ)Z

    iput v4, v0, Lcom/google/android/gms/internal/ads/zzajg;->zzk:I

    goto :goto_f

    :cond_1c
    :goto_e
    const/4 v5, 0x1

    .line 44
    iget-object v6, v0, Lcom/google/android/gms/internal/ads/zzajg;->zzj:Lcom/google/android/gms/internal/ads/zzafa;

    .line 45
    invoke-interface {v6, v1, v2, v5}, Lcom/google/android/gms/internal/ads/zzafa;->zzf(Lcom/google/android/gms/internal/ads/zzu;IZ)I

    move-result v1

    if-ne v1, v3, :cond_1d

    goto :goto_10

    :cond_1d
    iget v2, v0, Lcom/google/android/gms/internal/ads/zzajg;->zzp:I

    sub-int/2addr v2, v1

    iput v2, v0, Lcom/google/android/gms/internal/ads/zzajg;->zzp:I

    if-lez v2, :cond_1e

    :goto_f
    move v3, v4

    :goto_10
    return v3

    :cond_1e
    iget-object v5, v0, Lcom/google/android/gms/internal/ads/zzajg;->zzj:Lcom/google/android/gms/internal/ads/zzafa;

    iget-wide v1, v0, Lcom/google/android/gms/internal/ads/zzajg;->zzn:J

    .line 46
    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/internal/ads/zzajg;->zzh(J)J

    move-result-wide v6

    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzajg;->zzd:Lcom/google/android/gms/internal/ads/zzaen;

    iget v9, v1, Lcom/google/android/gms/internal/ads/zzaen;->zzc:I

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v8, 0x1

    .line 47
    invoke-interface/range {v5 .. v11}, Lcom/google/android/gms/internal/ads/zzafa;->zzs(JIIILcom/google/android/gms/internal/ads/zzaez;)V

    iget-wide v1, v0, Lcom/google/android/gms/internal/ads/zzajg;->zzn:J

    iget-object v3, v0, Lcom/google/android/gms/internal/ads/zzajg;->zzd:Lcom/google/android/gms/internal/ads/zzaen;

    iget v3, v3, Lcom/google/android/gms/internal/ads/zzaen;->zzg:I

    int-to-long v5, v3

    add-long/2addr v1, v5

    iput-wide v1, v0, Lcom/google/android/gms/internal/ads/zzajg;->zzn:J

    iput v4, v0, Lcom/google/android/gms/internal/ads/zzajg;->zzp:I

    return v4
.end method

.method private final zzh(J)J
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzajg;->zzd:Lcom/google/android/gms/internal/ads/zzaen;

    iget-wide v1, p0, Lcom/google/android/gms/internal/ads/zzajg;->zzm:J

    iget v0, v0, Lcom/google/android/gms/internal/ads/zzaen;->zzd:I

    int-to-long v3, v0

    const-wide/32 v5, 0xf4240

    mul-long/2addr p1, v5

    div-long/2addr p1, v3

    add-long/2addr v1, p1

    return-wide v1
.end method

.method private final zzi(Lcom/google/android/gms/internal/ads/zzadv;JZ)Lcom/google/android/gms/internal/ads/zzaji;
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget-object p4, p0, Lcom/google/android/gms/internal/ads/zzajg;->zzc:Lcom/google/android/gms/internal/ads/zzfu;

    invoke-virtual {p4}, Lcom/google/android/gms/internal/ads/zzfu;->zzM()[B

    move-result-object p4

    move-object v0, p1

    check-cast v0, Lcom/google/android/gms/internal/ads/zzadi;

    const/4 v1, 0x4

    const/4 v2, 0x0

    .line 1
    invoke-virtual {v0, p4, v2, v1, v2}, Lcom/google/android/gms/internal/ads/zzadi;->zzm([BIIZ)Z

    iget-object p4, p0, Lcom/google/android/gms/internal/ads/zzajg;->zzc:Lcom/google/android/gms/internal/ads/zzfu;

    .line 2
    invoke-virtual {p4, v2}, Lcom/google/android/gms/internal/ads/zzfu;->zzK(I)V

    iget-object p4, p0, Lcom/google/android/gms/internal/ads/zzajg;->zzd:Lcom/google/android/gms/internal/ads/zzaen;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzajg;->zzc:Lcom/google/android/gms/internal/ads/zzfu;

    .line 3
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzfu;->zzg()I

    move-result v0

    invoke-virtual {p4, v0}, Lcom/google/android/gms/internal/ads/zzaen;->zza(I)Z

    new-instance p4, Lcom/google/android/gms/internal/ads/zzajb;

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/zzadv;->zzd()J

    move-result-wide v0

    const-wide/16 v2, -0x1

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/zzadv;->zzd()J

    move-result-wide p2

    :cond_0
    move-wide v2, p2

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/zzadv;->zzf()J

    move-result-wide v4

    iget-object v6, p0, Lcom/google/android/gms/internal/ads/zzajg;->zzd:Lcom/google/android/gms/internal/ads/zzaen;

    const/4 v7, 0x0

    move-object v1, p4

    .line 4
    invoke-direct/range {v1 .. v7}, Lcom/google/android/gms/internal/ads/zzajb;-><init>(JJLcom/google/android/gms/internal/ads/zzaen;Z)V

    return-object p4
.end method

.method private static zzj(IJ)Z
    .locals 4

    const v0, -0x1f400

    and-int/2addr p0, v0

    int-to-long v0, p0

    const-wide/32 v2, -0x1f400

    and-long p0, p1, v2

    cmp-long p0, v0, p0

    if-nez p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method private final zzk(Lcom/google/android/gms/internal/ads/zzadv;)Z
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzajg;->zzq:Lcom/google/android/gms/internal/ads/zzaji;

    const/4 v1, 0x1

    if-eqz v0, :cond_1

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzaji;->zzd()J

    move-result-wide v2

    const-wide/16 v4, -0x1

    cmp-long v0, v2, v4

    if-eqz v0, :cond_1

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/zzadv;->zze()J

    move-result-wide v4

    const-wide/16 v6, -0x4

    add-long/2addr v2, v6

    cmp-long v0, v4, v2

    if-gtz v0, :cond_0

    goto :goto_0

    :cond_0
    return v1

    :cond_1
    :goto_0
    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzajg;->zzc:Lcom/google/android/gms/internal/ads/zzfu;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzfu;->zzM()[B

    move-result-object v0

    const/4 v2, 0x4

    const/4 v3, 0x0

    invoke-interface {p1, v0, v3, v2, v1}, Lcom/google/android/gms/internal/ads/zzadv;->zzm([BIIZ)Z

    move-result p1
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0

    if-nez p1, :cond_2

    return v1

    :cond_2
    return v3

    :catch_0
    return v1
.end method

.method private final zzl(Lcom/google/android/gms/internal/ads/zzadv;Z)Z
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/zzadv;->zzj()V

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/zzadv;->zzf()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    const/4 v1, 0x0

    const/4 v2, 0x0

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzajg;->zzf:Lcom/google/android/gms/internal/ads/zzael;

    .line 2
    invoke-virtual {v0, p1, v1}, Lcom/google/android/gms/internal/ads/zzael;->zza(Lcom/google/android/gms/internal/ads/zzadv;Lcom/google/android/gms/internal/ads/zzaho;)Lcom/google/android/gms/internal/ads/zzcd;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzajg;->zzl:Lcom/google/android/gms/internal/ads/zzcd;

    if-eqz v0, :cond_0

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzajg;->zze:Lcom/google/android/gms/internal/ads/zzaej;

    .line 3
    invoke-virtual {v3, v0}, Lcom/google/android/gms/internal/ads/zzaej;->zzb(Lcom/google/android/gms/internal/ads/zzcd;)Z

    :cond_0
    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/zzadv;->zze()J

    move-result-wide v3

    long-to-int v0, v3

    if-nez p2, :cond_1

    move-object v3, p1

    check-cast v3, Lcom/google/android/gms/internal/ads/zzadi;

    .line 4
    invoke-virtual {v3, v0, v2}, Lcom/google/android/gms/internal/ads/zzadi;->zzo(IZ)Z

    :cond_1
    move v3, v2

    goto :goto_0

    :cond_2
    move v0, v2

    move v3, v0

    :goto_0
    move v4, v3

    move v5, v4

    .line 5
    :goto_1
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzajg;->zzk(Lcom/google/android/gms/internal/ads/zzadv;)Z

    move-result v6

    const/4 v7, 0x1

    if-eqz v6, :cond_4

    if-lez v4, :cond_3

    goto :goto_4

    .line 14
    :cond_3
    new-instance p1, Ljava/io/EOFException;

    invoke-direct {p1}, Ljava/io/EOFException;-><init>()V

    throw p1

    .line 17
    :cond_4
    iget-object v6, p0, Lcom/google/android/gms/internal/ads/zzajg;->zzc:Lcom/google/android/gms/internal/ads/zzfu;

    .line 6
    invoke-virtual {v6, v2}, Lcom/google/android/gms/internal/ads/zzfu;->zzK(I)V

    iget-object v6, p0, Lcom/google/android/gms/internal/ads/zzajg;->zzc:Lcom/google/android/gms/internal/ads/zzfu;

    .line 7
    invoke-virtual {v6}, Lcom/google/android/gms/internal/ads/zzfu;->zzg()I

    move-result v6

    if-eqz v3, :cond_5

    int-to-long v8, v3

    invoke-static {v6, v8, v9}, Lcom/google/android/gms/internal/ads/zzajg;->zzj(IJ)Z

    move-result v8

    if-eqz v8, :cond_6

    .line 8
    :cond_5
    invoke-static {v6}, Lcom/google/android/gms/internal/ads/zzaeo;->zzb(I)I

    move-result v8

    const/4 v9, -0x1

    if-ne v8, v9, :cond_b

    :cond_6
    if-eq v7, p2, :cond_7

    const/high16 v3, 0x20000

    goto :goto_2

    :cond_7
    const v3, 0x8000

    :goto_2
    add-int/lit8 v4, v5, 0x1

    if-ne v5, v3, :cond_9

    if-eqz p2, :cond_8

    return v2

    :cond_8
    const-string p1, "Searched too many bytes."

    .line 15
    invoke-static {p1, v1}, Lcom/google/android/gms/internal/ads/zzch;->zza(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/google/android/gms/internal/ads/zzch;

    move-result-object p1

    throw p1

    :cond_9
    if-eqz p2, :cond_a

    .line 10
    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/zzadv;->zzj()V

    add-int v3, v0, v4

    move-object v5, p1

    check-cast v5, Lcom/google/android/gms/internal/ads/zzadi;

    .line 11
    invoke-virtual {v5, v3, v2}, Lcom/google/android/gms/internal/ads/zzadi;->zzl(IZ)Z

    goto :goto_3

    :cond_a
    move-object v3, p1

    check-cast v3, Lcom/google/android/gms/internal/ads/zzadi;

    .line 9
    invoke-virtual {v3, v7, v2}, Lcom/google/android/gms/internal/ads/zzadi;->zzo(IZ)Z

    :goto_3
    move v3, v2

    move v5, v4

    move v4, v3

    goto :goto_1

    :cond_b
    add-int/lit8 v4, v4, 0x1

    if-ne v4, v7, :cond_c

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzajg;->zzd:Lcom/google/android/gms/internal/ads/zzaen;

    .line 12
    invoke-virtual {v3, v6}, Lcom/google/android/gms/internal/ads/zzaen;->zza(I)Z

    move v3, v6

    goto :goto_6

    :cond_c
    const/4 v6, 0x4

    if-ne v4, v6, :cond_e

    :goto_4
    if-eqz p2, :cond_d

    add-int/2addr v0, v5

    .line 5
    check-cast p1, Lcom/google/android/gms/internal/ads/zzadi;

    .line 16
    invoke-virtual {p1, v0, v2}, Lcom/google/android/gms/internal/ads/zzadi;->zzo(IZ)Z

    goto :goto_5

    .line 17
    :cond_d
    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/zzadv;->zzj()V

    .line 16
    :goto_5
    iput v3, p0, Lcom/google/android/gms/internal/ads/zzajg;->zzk:I

    return v7

    :cond_e
    :goto_6
    add-int/lit8 v8, v8, -0x4

    .line 12
    move-object v6, p1

    check-cast v6, Lcom/google/android/gms/internal/ads/zzadi;

    .line 13
    invoke-virtual {v6, v8, v2}, Lcom/google/android/gms/internal/ads/zzadi;->zzl(IZ)Z

    goto :goto_1
.end method


# virtual methods
.method public final zza()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzajg;->zzr:Z

    return-void
.end method

.method public final zzb(Lcom/google/android/gms/internal/ads/zzadv;Lcom/google/android/gms/internal/ads/zzaeq;)I
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object p2, p0, Lcom/google/android/gms/internal/ads/zzajg;->zzi:Lcom/google/android/gms/internal/ads/zzafa;

    invoke-static {p2}, Lcom/google/android/gms/internal/ads/zzeq;->zzb(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    sget p2, Lcom/google/android/gms/internal/ads/zzgd;->zza:I

    .line 3
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzajg;->zzg(Lcom/google/android/gms/internal/ads/zzadv;)I

    move-result p1

    const/4 p2, -0x1

    if-ne p1, p2, :cond_1

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/zzajg;->zzq:Lcom/google/android/gms/internal/ads/zzaji;

    instance-of p2, p2, Lcom/google/android/gms/internal/ads/zzajc;

    if-eqz p2, :cond_1

    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/zzajg;->zzn:J

    .line 4
    invoke-direct {p0, v0, v1}, Lcom/google/android/gms/internal/ads/zzajg;->zzh(J)J

    move-result-wide v0

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/zzajg;->zzq:Lcom/google/android/gms/internal/ads/zzaji;

    .line 5
    invoke-interface {p2}, Lcom/google/android/gms/internal/ads/zzaji;->zza()J

    move-result-wide v2

    cmp-long p2, v2, v0

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzajg;->zzq:Lcom/google/android/gms/internal/ads/zzaji;

    .line 6
    check-cast p1, Lcom/google/android/gms/internal/ads/zzajc;

    const/4 p1, 0x0

    .line 7
    throw p1

    :cond_1
    :goto_0
    return p1
.end method

.method public final synthetic zzc()Ljava/util/List;
    .locals 1

    .line 1
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzgbc;->zzm()Lcom/google/android/gms/internal/ads/zzgbc;

    move-result-object v0

    return-object v0
.end method

.method public final zzd(Lcom/google/android/gms/internal/ads/zzadx;)V
    .locals 2

    .line 1
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzajg;->zzh:Lcom/google/android/gms/internal/ads/zzadx;

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-interface {p1, v0, v1}, Lcom/google/android/gms/internal/ads/zzadx;->zzw(II)Lcom/google/android/gms/internal/ads/zzafa;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzajg;->zzi:Lcom/google/android/gms/internal/ads/zzafa;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzajg;->zzj:Lcom/google/android/gms/internal/ads/zzafa;

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzajg;->zzh:Lcom/google/android/gms/internal/ads/zzadx;

    .line 2
    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/zzadx;->zzD()V

    return-void
.end method

.method public final zze(JJ)V
    .locals 0

    const/4 p1, 0x0

    .line 1
    iput p1, p0, Lcom/google/android/gms/internal/ads/zzajg;->zzk:I

    const-wide p2, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide p2, p0, Lcom/google/android/gms/internal/ads/zzajg;->zzm:J

    const-wide/16 p2, 0x0

    iput-wide p2, p0, Lcom/google/android/gms/internal/ads/zzajg;->zzn:J

    iput p1, p0, Lcom/google/android/gms/internal/ads/zzajg;->zzp:I

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzajg;->zzq:Lcom/google/android/gms/internal/ads/zzaji;

    instance-of p2, p1, Lcom/google/android/gms/internal/ads/zzajc;

    if-nez p2, :cond_0

    return-void

    :cond_0
    check-cast p1, Lcom/google/android/gms/internal/ads/zzajc;

    const/4 p1, 0x0

    .line 2
    throw p1
.end method

.method public final zzf(Lcom/google/android/gms/internal/ads/zzadv;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x1

    .line 1
    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/internal/ads/zzajg;->zzl(Lcom/google/android/gms/internal/ads/zzadv;Z)Z

    move-result p1

    return p1
.end method
