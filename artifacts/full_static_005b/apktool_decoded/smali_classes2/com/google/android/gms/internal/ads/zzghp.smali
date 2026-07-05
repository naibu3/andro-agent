.class public final Lcom/google/android/gms/internal/ads/zzghp;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@23.2.0"


# instance fields
.field private final zza:Ljava/util/List;

.field private final zzb:Lcom/google/android/gms/internal/ads/zzgtk;

.field private zzc:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzghp;->zza:Ljava/util/List;

    .line 2
    sget-object v0, Lcom/google/android/gms/internal/ads/zzgtk;->zza:Lcom/google/android/gms/internal/ads/zzgtk;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzghp;->zzb:Lcom/google/android/gms/internal/ads/zzgtk;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzghp;->zzc:Z

    return-void
.end method

.method static bridge synthetic zzc(Lcom/google/android/gms/internal/ads/zzghp;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzghp;->zzd()V

    return-void
.end method

.method private final zzd()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzghp;->zza:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/ads/zzghn;

    const/4 v2, 0x0

    .line 2
    invoke-static {v1, v2}, Lcom/google/android/gms/internal/ads/zzghn;->zzi(Lcom/google/android/gms/internal/ads/zzghn;Z)V

    goto :goto_0

    :cond_0
    return-void
.end method


# virtual methods
.method public final zza(Lcom/google/android/gms/internal/ads/zzghn;)Lcom/google/android/gms/internal/ads/zzghp;
    .locals 1

    .line 1
    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzghn;->zzf(Lcom/google/android/gms/internal/ads/zzghn;)Lcom/google/android/gms/internal/ads/zzghp;

    move-result-object v0

    if-nez v0, :cond_1

    .line 2
    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzghn;->zzj(Lcom/google/android/gms/internal/ads/zzghn;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzghp;->zzd()V

    .line 4
    :cond_0
    invoke-static {p1, p0}, Lcom/google/android/gms/internal/ads/zzghn;->zzh(Lcom/google/android/gms/internal/ads/zzghn;Lcom/google/android/gms/internal/ads/zzghp;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzghp;->zza:Ljava/util/List;

    .line 5
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object p0

    .line 1
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Entry has already been added to a KeysetHandle.Builder"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final zzb()Lcom/google/android/gms/internal/ads/zzght;
    .locals 19
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    move-object/from16 v0, p0

    .line 1
    iget-boolean v1, v0, Lcom/google/android/gms/internal/ads/zzghp;->zzc:Z

    if-nez v1, :cond_14

    const/4 v1, 0x1

    iput-boolean v1, v0, Lcom/google/android/gms/internal/ads/zzghp;->zzc:Z

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzghp;->zza:Ljava/util/List;

    .line 2
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzgwu;->zzd()Lcom/google/android/gms/internal/ads/zzgwr;

    move-result-object v3

    new-instance v4, Ljava/util/ArrayList;

    .line 3
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    invoke-direct {v4, v2}, Ljava/util/ArrayList;-><init>(I)V

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzghp;->zza:Ljava/util/List;

    const/4 v5, 0x0

    move v6, v5

    .line 4
    :goto_0
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v7

    add-int/lit8 v7, v7, -0x1

    if-ge v6, v7, :cond_2

    add-int/lit8 v7, v6, 0x1

    .line 5
    invoke-interface {v2, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/google/android/gms/internal/ads/zzghn;

    invoke-static {v6}, Lcom/google/android/gms/internal/ads/zzghn;->zze(Lcom/google/android/gms/internal/ads/zzghn;)Lcom/google/android/gms/internal/ads/zzgho;

    move-result-object v6

    invoke-static {}, Lcom/google/android/gms/internal/ads/zzgho;->zza()Lcom/google/android/gms/internal/ads/zzgho;

    move-result-object v8

    if-ne v6, v8, :cond_1

    .line 6
    invoke-interface {v2, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/google/android/gms/internal/ads/zzghn;

    invoke-static {v6}, Lcom/google/android/gms/internal/ads/zzghn;->zze(Lcom/google/android/gms/internal/ads/zzghn;)Lcom/google/android/gms/internal/ads/zzgho;

    move-result-object v6

    invoke-static {}, Lcom/google/android/gms/internal/ads/zzgho;->zza()Lcom/google/android/gms/internal/ads/zzgho;

    move-result-object v8

    if-ne v6, v8, :cond_0

    goto :goto_1

    .line 58
    :cond_0
    new-instance v1, Ljava/security/GeneralSecurityException;

    const-string v2, "Entries with \'withRandomId()\' may only be followed by other entries with \'withRandomId()\'."

    invoke-direct {v1, v2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    :goto_1
    move v6, v7

    goto :goto_0

    .line 6
    :cond_2
    new-instance v2, Ljava/util/HashSet;

    .line 7
    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    iget-object v6, v0, Lcom/google/android/gms/internal/ads/zzghp;->zza:Ljava/util/List;

    .line 8
    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    const/4 v7, 0x0

    move-object v8, v7

    :goto_2
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_12

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/google/android/gms/internal/ads/zzghn;

    .line 9
    invoke-static {v9}, Lcom/google/android/gms/internal/ads/zzghn;->zzb(Lcom/google/android/gms/internal/ads/zzghn;)Lcom/google/android/gms/internal/ads/zzghk;

    .line 10
    invoke-static {v9}, Lcom/google/android/gms/internal/ads/zzghn;->zze(Lcom/google/android/gms/internal/ads/zzghn;)Lcom/google/android/gms/internal/ads/zzgho;

    move-result-object v10

    if-eqz v10, :cond_11

    .line 11
    invoke-static {v9}, Lcom/google/android/gms/internal/ads/zzghn;->zze(Lcom/google/android/gms/internal/ads/zzghn;)Lcom/google/android/gms/internal/ads/zzgho;

    move-result-object v10

    invoke-static {}, Lcom/google/android/gms/internal/ads/zzgho;->zza()Lcom/google/android/gms/internal/ads/zzgho;

    move-result-object v11

    if-ne v10, v11, :cond_5

    move v10, v5

    :goto_3
    if-eqz v10, :cond_3

    .line 12
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-interface {v2, v11}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_6

    .line 13
    :cond_3
    new-instance v10, Ljava/security/SecureRandom;

    .line 14
    invoke-direct {v10}, Ljava/security/SecureRandom;-><init>()V

    const/4 v11, 0x4

    new-array v11, v11, [B

    move v12, v5

    :goto_4
    if-nez v12, :cond_4

    .line 15
    invoke-virtual {v10, v11}, Ljava/security/SecureRandom;->nextBytes([B)V

    aget-byte v12, v11, v5

    and-int/lit16 v12, v12, 0xff

    aget-byte v13, v11, v1

    and-int/lit16 v13, v13, 0xff

    const/4 v14, 0x2

    aget-byte v14, v11, v14

    and-int/lit16 v14, v14, 0xff

    const/4 v15, 0x3

    aget-byte v15, v11, v15

    and-int/lit16 v15, v15, 0xff

    shl-int/lit8 v12, v12, 0x18

    shl-int/lit8 v13, v13, 0x10

    or-int/2addr v12, v13

    shl-int/lit8 v13, v14, 0x8

    or-int/2addr v12, v13

    or-int/2addr v12, v15

    goto :goto_4

    :cond_4
    move v10, v12

    goto :goto_3

    .line 16
    :cond_5
    invoke-static {v9}, Lcom/google/android/gms/internal/ads/zzghn;->zze(Lcom/google/android/gms/internal/ads/zzghn;)Lcom/google/android/gms/internal/ads/zzgho;

    move v10, v5

    .line 17
    :cond_6
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-interface {v2, v11}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_10

    .line 18
    invoke-interface {v2, v11}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 19
    invoke-static {v9}, Lcom/google/android/gms/internal/ads/zzghn;->zza(Lcom/google/android/gms/internal/ads/zzghn;)Lcom/google/android/gms/internal/ads/zzghi;

    .line 20
    invoke-static {v9}, Lcom/google/android/gms/internal/ads/zzghn;->zzg(Lcom/google/android/gms/internal/ads/zzghn;)Lcom/google/android/gms/internal/ads/zzghx;

    move-result-object v12

    invoke-virtual {v12}, Lcom/google/android/gms/internal/ads/zzghx;->zza()Z

    move-result v12

    if-eq v1, v12, :cond_7

    move-object v12, v7

    goto :goto_5

    :cond_7
    move-object v12, v11

    .line 21
    :goto_5
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzgpb;->zzb()Lcom/google/android/gms/internal/ads/zzgpb;

    move-result-object v13

    invoke-static {v9}, Lcom/google/android/gms/internal/ads/zzghn;->zzg(Lcom/google/android/gms/internal/ads/zzghn;)Lcom/google/android/gms/internal/ads/zzghx;

    move-result-object v14

    .line 22
    invoke-virtual {v13, v14, v12}, Lcom/google/android/gms/internal/ads/zzgpb;->zza(Lcom/google/android/gms/internal/ads/zzghx;Ljava/lang/Integer;)Lcom/google/android/gms/internal/ads/zzghi;

    move-result-object v12

    new-instance v15, Lcom/google/android/gms/internal/ads/zzghr;

    .line 23
    invoke-static {v9}, Lcom/google/android/gms/internal/ads/zzghn;->zzb(Lcom/google/android/gms/internal/ads/zzghn;)Lcom/google/android/gms/internal/ads/zzghk;

    move-result-object v16

    invoke-static {v9}, Lcom/google/android/gms/internal/ads/zzghn;->zzj(Lcom/google/android/gms/internal/ads/zzghn;)Z

    move-result v17

    const/16 v18, 0x0

    move-object v13, v15

    move-object v14, v12

    move-object v1, v15

    move-object/from16 v15, v16

    move/from16 v16, v10

    invoke-direct/range {v13 .. v18}, Lcom/google/android/gms/internal/ads/zzghr;-><init>(Lcom/google/android/gms/internal/ads/zzghi;Lcom/google/android/gms/internal/ads/zzghk;IZLcom/google/android/gms/internal/ads/zzghq;)V

    .line 24
    invoke-static {v9}, Lcom/google/android/gms/internal/ads/zzghn;->zzb(Lcom/google/android/gms/internal/ads/zzghn;)Lcom/google/android/gms/internal/ads/zzghk;

    move-result-object v13

    .line 25
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzgpl;->zzc()Lcom/google/android/gms/internal/ads/zzgpl;

    move-result-object v14

    const-class v15, Lcom/google/android/gms/internal/ads/zzgql;

    invoke-static {}, Lcom/google/android/gms/internal/ads/zzgic;->zza()Lcom/google/android/gms/internal/ads/zzgic;

    move-result-object v5

    .line 26
    invoke-virtual {v14, v12, v15, v5}, Lcom/google/android/gms/internal/ads/zzgpl;->zzd(Lcom/google/android/gms/internal/ads/zzghi;Ljava/lang/Class;Lcom/google/android/gms/internal/ads/zzgic;)Lcom/google/android/gms/internal/ads/zzgqq;

    move-result-object v5

    check-cast v5, Lcom/google/android/gms/internal/ads/zzgql;

    invoke-virtual {v5}, Lcom/google/android/gms/internal/ads/zzgql;->zzf()Ljava/lang/Integer;

    move-result-object v12

    if-eqz v12, :cond_9

    .line 27
    invoke-virtual {v12}, Ljava/lang/Integer;->intValue()I

    move-result v12

    if-ne v12, v10, :cond_8

    goto :goto_6

    .line 53
    :cond_8
    new-instance v1, Ljava/security/GeneralSecurityException;

    const-string v2, "Wrong ID set for key with ID requirement"

    invoke-direct {v1, v2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 27
    :cond_9
    :goto_6
    sget-object v12, Lcom/google/android/gms/internal/ads/zzghk;->zza:Lcom/google/android/gms/internal/ads/zzghk;

    .line 28
    invoke-virtual {v12, v13}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_a

    .line 29
    sget-object v12, Lcom/google/android/gms/internal/ads/zzgwj;->zzb:Lcom/google/android/gms/internal/ads/zzgwj;

    goto :goto_7

    .line 47
    :cond_a
    sget-object v12, Lcom/google/android/gms/internal/ads/zzghk;->zzb:Lcom/google/android/gms/internal/ads/zzghk;

    .line 30
    invoke-virtual {v12, v13}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_b

    .line 31
    sget-object v12, Lcom/google/android/gms/internal/ads/zzgwj;->zzc:Lcom/google/android/gms/internal/ads/zzgwj;

    goto :goto_7

    :cond_b
    sget-object v12, Lcom/google/android/gms/internal/ads/zzghk;->zzc:Lcom/google/android/gms/internal/ads/zzghk;

    .line 32
    invoke-virtual {v12, v13}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_f

    .line 33
    sget-object v12, Lcom/google/android/gms/internal/ads/zzgwj;->zzd:Lcom/google/android/gms/internal/ads/zzgwj;

    .line 34
    :goto_7
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzgwt;->zze()Lcom/google/android/gms/internal/ads/zzgws;

    move-result-object v13

    .line 35
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzgwh;->zza()Lcom/google/android/gms/internal/ads/zzgwe;

    move-result-object v14

    .line 26
    invoke-virtual {v5}, Lcom/google/android/gms/internal/ads/zzgql;->zzg()Ljava/lang/String;

    move-result-object v15

    .line 36
    invoke-virtual {v14, v15}, Lcom/google/android/gms/internal/ads/zzgwe;->zzb(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzgwe;

    .line 26
    invoke-virtual {v5}, Lcom/google/android/gms/internal/ads/zzgql;->zze()Lcom/google/android/gms/internal/ads/zzhac;

    move-result-object v15

    .line 37
    invoke-virtual {v14, v15}, Lcom/google/android/gms/internal/ads/zzgwe;->zzc(Lcom/google/android/gms/internal/ads/zzhac;)Lcom/google/android/gms/internal/ads/zzgwe;

    .line 26
    invoke-virtual {v5}, Lcom/google/android/gms/internal/ads/zzgql;->zzb()Lcom/google/android/gms/internal/ads/zzgwg;

    move-result-object v15

    .line 38
    invoke-virtual {v14, v15}, Lcom/google/android/gms/internal/ads/zzgwe;->zza(Lcom/google/android/gms/internal/ads/zzgwg;)Lcom/google/android/gms/internal/ads/zzgwe;

    .line 39
    invoke-virtual {v13, v14}, Lcom/google/android/gms/internal/ads/zzgws;->zza(Lcom/google/android/gms/internal/ads/zzgwe;)Lcom/google/android/gms/internal/ads/zzgws;

    .line 40
    invoke-virtual {v13, v12}, Lcom/google/android/gms/internal/ads/zzgws;->zzd(Lcom/google/android/gms/internal/ads/zzgwj;)Lcom/google/android/gms/internal/ads/zzgws;

    .line 41
    invoke-virtual {v13, v10}, Lcom/google/android/gms/internal/ads/zzgws;->zzb(I)Lcom/google/android/gms/internal/ads/zzgws;

    .line 26
    invoke-virtual {v5}, Lcom/google/android/gms/internal/ads/zzgql;->zzc()Lcom/google/android/gms/internal/ads/zzgxn;

    move-result-object v5

    .line 42
    invoke-virtual {v13, v5}, Lcom/google/android/gms/internal/ads/zzgws;->zzc(Lcom/google/android/gms/internal/ads/zzgxn;)Lcom/google/android/gms/internal/ads/zzgws;

    .line 43
    invoke-virtual {v13}, Lcom/google/android/gms/internal/ads/zzhbi;->zzbn()Lcom/google/android/gms/internal/ads/zzhbo;

    move-result-object v5

    check-cast v5, Lcom/google/android/gms/internal/ads/zzgwt;

    .line 44
    invoke-virtual {v3, v5}, Lcom/google/android/gms/internal/ads/zzgwr;->zza(Lcom/google/android/gms/internal/ads/zzgwt;)Lcom/google/android/gms/internal/ads/zzgwr;

    .line 45
    invoke-static {v9}, Lcom/google/android/gms/internal/ads/zzghn;->zzj(Lcom/google/android/gms/internal/ads/zzghn;)Z

    move-result v5

    if-eqz v5, :cond_e

    if-nez v8, :cond_d

    .line 46
    invoke-static {v9}, Lcom/google/android/gms/internal/ads/zzghn;->zzb(Lcom/google/android/gms/internal/ads/zzghn;)Lcom/google/android/gms/internal/ads/zzghk;

    move-result-object v5

    sget-object v8, Lcom/google/android/gms/internal/ads/zzghk;->zza:Lcom/google/android/gms/internal/ads/zzghk;

    if-ne v5, v8, :cond_c

    move-object v8, v11

    goto :goto_8

    .line 51
    :cond_c
    new-instance v1, Ljava/security/GeneralSecurityException;

    const-string v2, "Primary key is not enabled"

    invoke-direct {v1, v2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 50
    :cond_d
    new-instance v1, Ljava/security/GeneralSecurityException;

    const-string v2, "Two primaries were set"

    invoke-direct {v1, v2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 47
    :cond_e
    :goto_8
    invoke-interface {v4, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const/4 v1, 0x1

    const/4 v5, 0x0

    goto/16 :goto_2

    .line 54
    :cond_f
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "Unknown key status"

    .line 52
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 49
    :cond_10
    new-instance v1, Ljava/security/GeneralSecurityException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Id "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, " is used twice in the keyset"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 48
    :cond_11
    new-instance v1, Ljava/security/GeneralSecurityException;

    const-string v2, "No ID was set (with withFixedId or withRandomId)"

    invoke-direct {v1, v2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_12
    if-eqz v8, :cond_13

    .line 55
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v3, v1}, Lcom/google/android/gms/internal/ads/zzgwr;->zzb(I)Lcom/google/android/gms/internal/ads/zzgwr;

    .line 56
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzhbi;->zzbn()Lcom/google/android/gms/internal/ads/zzhbo;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/ads/zzgwu;

    .line 57
    invoke-static {v1}, Lcom/google/android/gms/internal/ads/zzght;->zze(Lcom/google/android/gms/internal/ads/zzgwu;)V

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzghp;->zzb:Lcom/google/android/gms/internal/ads/zzgtk;

    new-instance v3, Lcom/google/android/gms/internal/ads/zzght;

    invoke-direct {v3, v1, v4, v2, v7}, Lcom/google/android/gms/internal/ads/zzght;-><init>(Lcom/google/android/gms/internal/ads/zzgwu;Ljava/util/List;Lcom/google/android/gms/internal/ads/zzgtk;Lcom/google/android/gms/internal/ads/zzghs;)V

    return-object v3

    .line 54
    :cond_13
    new-instance v1, Ljava/security/GeneralSecurityException;

    const-string v2, "No primary was set"

    invoke-direct {v1, v2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 1
    :cond_14
    new-instance v1, Ljava/security/GeneralSecurityException;

    const-string v2, "KeysetHandle.Builder#build must only be called once"

    invoke-direct {v1, v2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v1
.end method
