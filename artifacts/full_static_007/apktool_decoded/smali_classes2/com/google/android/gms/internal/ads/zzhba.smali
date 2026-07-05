.class final Lcom/google/android/gms/internal/ads/zzhba;
.super Lcom/google/android/gms/internal/ads/zzhaz;
.source "com.google.android.gms:play-services-ads-lite@@23.2.0"


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzhaz;-><init>()V

    return-void
.end method


# virtual methods
.method final zza(Ljava/util/Map$Entry;)I
    .locals 0

    .line 1
    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/ads/zzhbl;

    iget p1, p1, Lcom/google/android/gms/internal/ads/zzhbl;->zzb:I

    return p1
.end method

.method final zzb(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/zzhbd;
    .locals 0

    .line 1
    check-cast p1, Lcom/google/android/gms/internal/ads/zzhbk;

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/zzhbk;->zza:Lcom/google/android/gms/internal/ads/zzhbd;

    return-object p1
.end method

.method final zzc(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/zzhbd;
    .locals 0

    .line 1
    check-cast p1, Lcom/google/android/gms/internal/ads/zzhbk;

    const/4 p1, 0x0

    .line 2
    throw p1
.end method

.method final zzd(Lcom/google/android/gms/internal/ads/zzhay;Lcom/google/android/gms/internal/ads/zzhde;I)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p1, p2, p3}, Lcom/google/android/gms/internal/ads/zzhay;->zzc(Lcom/google/android/gms/internal/ads/zzhde;I)Lcom/google/android/gms/internal/ads/zzhbm;

    move-result-object p1

    return-object p1
.end method

.method final zze(Ljava/lang/Object;Lcom/google/android/gms/internal/ads/zzhdr;Ljava/lang/Object;Lcom/google/android/gms/internal/ads/zzhay;Lcom/google/android/gms/internal/ads/zzhbd;Ljava/lang/Object;Lcom/google/android/gms/internal/ads/zzheq;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    check-cast p3, Lcom/google/android/gms/internal/ads/zzhbm;

    .line 49
    iget-object v0, p3, Lcom/google/android/gms/internal/ads/zzhbm;->zzd:Lcom/google/android/gms/internal/ads/zzhbl;

    iget-boolean v1, v0, Lcom/google/android/gms/internal/ads/zzhbl;->zzd:Z

    iget v2, v0, Lcom/google/android/gms/internal/ads/zzhbl;->zzb:I

    if-eqz v1, :cond_4

    iget-boolean v1, v0, Lcom/google/android/gms/internal/ads/zzhbl;->zze:Z

    if-eqz v1, :cond_4

    sget-object p4, Lcom/google/android/gms/internal/ads/zzhfg;->zza:Lcom/google/android/gms/internal/ads/zzhfg;

    iget-object p4, p3, Lcom/google/android/gms/internal/ads/zzhbm;->zzd:Lcom/google/android/gms/internal/ads/zzhbl;

    iget-object p4, p4, Lcom/google/android/gms/internal/ads/zzhbl;->zzc:Lcom/google/android/gms/internal/ads/zzhfg;

    invoke-virtual {p4}, Lcom/google/android/gms/internal/ads/zzhfg;->ordinal()I

    move-result p4

    packed-switch p4, :pswitch_data_0

    .line 29
    :pswitch_0
    iget-object p1, p3, Lcom/google/android/gms/internal/ads/zzhbm;->zzd:Lcom/google/android/gms/internal/ads/zzhbl;

    new-instance p2, Ljava/lang/IllegalStateException;

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/zzhbl;->zzc:Lcom/google/android/gms/internal/ads/zzhfg;

    .line 86
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string p3, "Type cannot be packed: "

    invoke-virtual {p3, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2

    .line 85
    :pswitch_1
    new-instance p1, Ljava/util/ArrayList;

    .line 59
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 60
    invoke-interface {p2, p1}, Lcom/google/android/gms/internal/ads/zzhdr;->zzL(Ljava/util/List;)V

    goto/16 :goto_2

    :pswitch_2
    new-instance p1, Ljava/util/ArrayList;

    .line 61
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 62
    invoke-interface {p2, p1}, Lcom/google/android/gms/internal/ads/zzhdr;->zzK(Ljava/util/List;)V

    goto/16 :goto_2

    :pswitch_3
    new-instance p1, Ljava/util/ArrayList;

    .line 63
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 64
    invoke-interface {p2, p1}, Lcom/google/android/gms/internal/ads/zzhdr;->zzJ(Ljava/util/List;)V

    goto/16 :goto_2

    :pswitch_4
    new-instance p1, Ljava/util/ArrayList;

    .line 65
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 66
    invoke-interface {p2, p1}, Lcom/google/android/gms/internal/ads/zzhdr;->zzI(Ljava/util/List;)V

    goto/16 :goto_2

    .line 49
    :pswitch_5
    new-instance p4, Ljava/util/ArrayList;

    .line 50
    invoke-direct {p4}, Ljava/util/ArrayList;-><init>()V

    .line 51
    invoke-interface {p2, p4}, Lcom/google/android/gms/internal/ads/zzhdr;->zzA(Ljava/util/List;)V

    iget-object p2, p3, Lcom/google/android/gms/internal/ads/zzhbm;->zzd:Lcom/google/android/gms/internal/ads/zzhbl;

    .line 52
    sget v0, Lcom/google/android/gms/internal/ads/zzheb;->zza:I

    iget-object p2, p2, Lcom/google/android/gms/internal/ads/zzhbl;->zza:Lcom/google/android/gms/internal/ads/zzhbt;

    if-eqz p2, :cond_3

    .line 53
    invoke-interface {p4}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    move v3, v1

    :goto_0
    if-ge v1, v0, :cond_2

    .line 54
    invoke-interface {p4, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    .line 55
    invoke-interface {p2, v4}, Lcom/google/android/gms/internal/ads/zzhbt;->zza(I)Lcom/google/android/gms/internal/ads/zzhbs;

    move-result-object v5

    if-eqz v5, :cond_1

    if-eq v1, v3, :cond_0

    .line 56
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {p4, v3, v4}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    .line 57
    :cond_1
    invoke-static {p1, v2, v4, p6, p7}, Lcom/google/android/gms/internal/ads/zzheb;->zzp(Ljava/lang/Object;IILjava/lang/Object;Lcom/google/android/gms/internal/ads/zzheq;)Ljava/lang/Object;

    move-result-object p6

    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    if-eq v3, v0, :cond_3

    .line 58
    invoke-interface {p4, v3, v0}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->clear()V

    :cond_3
    move-object p1, p4

    goto :goto_2

    .line 66
    :pswitch_6
    new-instance p1, Ljava/util/ArrayList;

    .line 67
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 68
    invoke-interface {p2, p1}, Lcom/google/android/gms/internal/ads/zzhdr;->zzN(Ljava/util/List;)V

    goto :goto_2

    :pswitch_7
    new-instance p1, Ljava/util/ArrayList;

    .line 69
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 70
    invoke-interface {p2, p1}, Lcom/google/android/gms/internal/ads/zzhdr;->zzx(Ljava/util/List;)V

    goto :goto_2

    :pswitch_8
    new-instance p1, Ljava/util/ArrayList;

    .line 71
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 72
    invoke-interface {p2, p1}, Lcom/google/android/gms/internal/ads/zzhdr;->zzB(Ljava/util/List;)V

    goto :goto_2

    :pswitch_9
    new-instance p1, Ljava/util/ArrayList;

    .line 73
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 74
    invoke-interface {p2, p1}, Lcom/google/android/gms/internal/ads/zzhdr;->zzC(Ljava/util/List;)V

    goto :goto_2

    :pswitch_a
    new-instance p1, Ljava/util/ArrayList;

    .line 75
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 76
    invoke-interface {p2, p1}, Lcom/google/android/gms/internal/ads/zzhdr;->zzF(Ljava/util/List;)V

    goto :goto_2

    :pswitch_b
    new-instance p1, Ljava/util/ArrayList;

    .line 77
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 78
    invoke-interface {p2, p1}, Lcom/google/android/gms/internal/ads/zzhdr;->zzO(Ljava/util/List;)V

    goto :goto_2

    :pswitch_c
    new-instance p1, Ljava/util/ArrayList;

    .line 79
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 80
    invoke-interface {p2, p1}, Lcom/google/android/gms/internal/ads/zzhdr;->zzG(Ljava/util/List;)V

    goto :goto_2

    :pswitch_d
    new-instance p1, Ljava/util/ArrayList;

    .line 81
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 82
    invoke-interface {p2, p1}, Lcom/google/android/gms/internal/ads/zzhdr;->zzD(Ljava/util/List;)V

    goto :goto_2

    :pswitch_e
    new-instance p1, Ljava/util/ArrayList;

    .line 83
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 84
    invoke-interface {p2, p1}, Lcom/google/android/gms/internal/ads/zzhdr;->zzz(Ljava/util/List;)V

    .line 58
    :goto_2
    iget-object p2, p3, Lcom/google/android/gms/internal/ads/zzhbm;->zzd:Lcom/google/android/gms/internal/ads/zzhbl;

    .line 85
    invoke-virtual {p5, p2, p1}, Lcom/google/android/gms/internal/ads/zzhbd;->zzk(Lcom/google/android/gms/internal/ads/zzhbc;Ljava/lang/Object;)V

    goto/16 :goto_5

    .line 84
    :cond_4
    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zzhbl;->zzc:Lcom/google/android/gms/internal/ads/zzhfg;

    .line 1
    sget-object v1, Lcom/google/android/gms/internal/ads/zzhfg;->zzn:Lcom/google/android/gms/internal/ads/zzhfg;

    if-ne v0, v1, :cond_6

    .line 2
    invoke-interface {p2}, Lcom/google/android/gms/internal/ads/zzhdr;->zzg()I

    move-result p2

    iget-object p4, p3, Lcom/google/android/gms/internal/ads/zzhbm;->zzd:Lcom/google/android/gms/internal/ads/zzhbl;

    iget-object p4, p4, Lcom/google/android/gms/internal/ads/zzhbl;->zza:Lcom/google/android/gms/internal/ads/zzhbt;

    .line 3
    invoke-interface {p4, p2}, Lcom/google/android/gms/internal/ads/zzhbt;->zza(I)Lcom/google/android/gms/internal/ads/zzhbs;

    move-result-object p4

    if-nez p4, :cond_5

    .line 4
    invoke-static {p1, v2, p2, p6, p7}, Lcom/google/android/gms/internal/ads/zzheb;->zzp(Ljava/lang/Object;IILjava/lang/Object;Lcom/google/android/gms/internal/ads/zzheq;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    .line 5
    :cond_5
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    goto/16 :goto_3

    .line 48
    :cond_6
    iget-object p1, p3, Lcom/google/android/gms/internal/ads/zzhbm;->zzd:Lcom/google/android/gms/internal/ads/zzhbl;

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/zzhbl;->zzc:Lcom/google/android/gms/internal/ads/zzhfg;

    .line 6
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzhfg;->ordinal()I

    move-result p1

    packed-switch p1, :pswitch_data_1

    const/4 p1, 0x0

    goto/16 :goto_3

    .line 30
    :pswitch_f
    invoke-interface {p2}, Lcom/google/android/gms/internal/ads/zzhdr;->zzn()J

    move-result-wide p1

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    goto/16 :goto_3

    .line 31
    :pswitch_10
    invoke-interface {p2}, Lcom/google/android/gms/internal/ads/zzhdr;->zzi()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    goto/16 :goto_3

    .line 32
    :pswitch_11
    invoke-interface {p2}, Lcom/google/android/gms/internal/ads/zzhdr;->zzm()J

    move-result-wide p1

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    goto/16 :goto_3

    .line 33
    :pswitch_12
    invoke-interface {p2}, Lcom/google/android/gms/internal/ads/zzhdr;->zzh()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    goto/16 :goto_3

    .line 41
    :pswitch_13
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Shouldn\'t reach here."

    .line 29
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 34
    :pswitch_14
    invoke-interface {p2}, Lcom/google/android/gms/internal/ads/zzhdr;->zzj()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    goto/16 :goto_3

    .line 28
    :pswitch_15
    invoke-interface {p2}, Lcom/google/android/gms/internal/ads/zzhdr;->zzp()Lcom/google/android/gms/internal/ads/zzhac;

    move-result-object p1

    goto/16 :goto_3

    .line 6
    :pswitch_16
    iget-object p1, p3, Lcom/google/android/gms/internal/ads/zzhbm;->zzd:Lcom/google/android/gms/internal/ads/zzhbl;

    iget-boolean p7, p1, Lcom/google/android/gms/internal/ads/zzhbl;->zzd:Z

    if-nez p7, :cond_8

    .line 17
    invoke-virtual {p5, p1}, Lcom/google/android/gms/internal/ads/zzhbd;->zzf(Lcom/google/android/gms/internal/ads/zzhbc;)Ljava/lang/Object;

    move-result-object p1

    instance-of p7, p1, Lcom/google/android/gms/internal/ads/zzhbo;

    if-eqz p7, :cond_8

    .line 20
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzhdo;->zza()Lcom/google/android/gms/internal/ads/zzhdo;

    move-result-object p7

    .line 21
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {p7, v0}, Lcom/google/android/gms/internal/ads/zzhdo;->zzb(Ljava/lang/Class;)Lcom/google/android/gms/internal/ads/zzhdz;

    move-result-object p7

    .line 22
    move-object v0, p1

    check-cast v0, Lcom/google/android/gms/internal/ads/zzhbo;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzhbo;->zzce()Z

    move-result v0

    if-nez v0, :cond_7

    .line 23
    invoke-interface {p7}, Lcom/google/android/gms/internal/ads/zzhdz;->zze()Ljava/lang/Object;

    move-result-object v0

    .line 24
    invoke-interface {p7, v0, p1}, Lcom/google/android/gms/internal/ads/zzhdz;->zzg(Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object p1, p3, Lcom/google/android/gms/internal/ads/zzhbm;->zzd:Lcom/google/android/gms/internal/ads/zzhbl;

    .line 25
    invoke-virtual {p5, p1, v0}, Lcom/google/android/gms/internal/ads/zzhbd;->zzk(Lcom/google/android/gms/internal/ads/zzhbc;Ljava/lang/Object;)V

    move-object p1, v0

    .line 26
    :cond_7
    invoke-interface {p2, p1, p7, p4}, Lcom/google/android/gms/internal/ads/zzhdr;->zzw(Ljava/lang/Object;Lcom/google/android/gms/internal/ads/zzhdz;Lcom/google/android/gms/internal/ads/zzhay;)V

    return-object p6

    :cond_8
    iget-object p1, p3, Lcom/google/android/gms/internal/ads/zzhbm;->zzc:Lcom/google/android/gms/internal/ads/zzhde;

    .line 18
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    .line 19
    invoke-interface {p2, p1, p4}, Lcom/google/android/gms/internal/ads/zzhdr;->zzs(Ljava/lang/Class;Lcom/google/android/gms/internal/ads/zzhay;)Ljava/lang/Object;

    move-result-object p1

    goto/16 :goto_3

    :pswitch_17
    iget-object p1, p3, Lcom/google/android/gms/internal/ads/zzhbm;->zzd:Lcom/google/android/gms/internal/ads/zzhbl;

    iget-boolean p7, p1, Lcom/google/android/gms/internal/ads/zzhbl;->zzd:Z

    if-nez p7, :cond_a

    .line 7
    invoke-virtual {p5, p1}, Lcom/google/android/gms/internal/ads/zzhbd;->zzf(Lcom/google/android/gms/internal/ads/zzhbc;)Ljava/lang/Object;

    move-result-object p1

    instance-of p7, p1, Lcom/google/android/gms/internal/ads/zzhbo;

    if-eqz p7, :cond_a

    .line 10
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzhdo;->zza()Lcom/google/android/gms/internal/ads/zzhdo;

    move-result-object p7

    .line 11
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {p7, v0}, Lcom/google/android/gms/internal/ads/zzhdo;->zzb(Ljava/lang/Class;)Lcom/google/android/gms/internal/ads/zzhdz;

    move-result-object p7

    .line 12
    move-object v0, p1

    check-cast v0, Lcom/google/android/gms/internal/ads/zzhbo;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzhbo;->zzce()Z

    move-result v0

    if-nez v0, :cond_9

    .line 13
    invoke-interface {p7}, Lcom/google/android/gms/internal/ads/zzhdz;->zze()Ljava/lang/Object;

    move-result-object v0

    .line 14
    invoke-interface {p7, v0, p1}, Lcom/google/android/gms/internal/ads/zzhdz;->zzg(Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object p1, p3, Lcom/google/android/gms/internal/ads/zzhbm;->zzd:Lcom/google/android/gms/internal/ads/zzhbl;

    .line 15
    invoke-virtual {p5, p1, v0}, Lcom/google/android/gms/internal/ads/zzhbd;->zzk(Lcom/google/android/gms/internal/ads/zzhbc;Ljava/lang/Object;)V

    move-object p1, v0

    .line 16
    :cond_9
    invoke-interface {p2, p1, p7, p4}, Lcom/google/android/gms/internal/ads/zzhdr;->zzv(Ljava/lang/Object;Lcom/google/android/gms/internal/ads/zzhdz;Lcom/google/android/gms/internal/ads/zzhay;)V

    return-object p6

    :cond_a
    iget-object p1, p3, Lcom/google/android/gms/internal/ads/zzhbm;->zzc:Lcom/google/android/gms/internal/ads/zzhde;

    .line 8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    .line 9
    invoke-interface {p2, p1, p4}, Lcom/google/android/gms/internal/ads/zzhdr;->zzr(Ljava/lang/Class;Lcom/google/android/gms/internal/ads/zzhay;)Ljava/lang/Object;

    move-result-object p1

    goto :goto_3

    .line 27
    :pswitch_18
    invoke-interface {p2}, Lcom/google/android/gms/internal/ads/zzhdr;->zzt()Ljava/lang/String;

    move-result-object p1

    goto :goto_3

    .line 35
    :pswitch_19
    invoke-interface {p2}, Lcom/google/android/gms/internal/ads/zzhdr;->zzP()Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    goto :goto_3

    .line 36
    :pswitch_1a
    invoke-interface {p2}, Lcom/google/android/gms/internal/ads/zzhdr;->zzf()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    goto :goto_3

    .line 37
    :pswitch_1b
    invoke-interface {p2}, Lcom/google/android/gms/internal/ads/zzhdr;->zzk()J

    move-result-wide p1

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    goto :goto_3

    .line 38
    :pswitch_1c
    invoke-interface {p2}, Lcom/google/android/gms/internal/ads/zzhdr;->zzg()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    goto :goto_3

    .line 39
    :pswitch_1d
    invoke-interface {p2}, Lcom/google/android/gms/internal/ads/zzhdr;->zzo()J

    move-result-wide p1

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    goto :goto_3

    .line 40
    :pswitch_1e
    invoke-interface {p2}, Lcom/google/android/gms/internal/ads/zzhdr;->zzl()J

    move-result-wide p1

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    goto :goto_3

    .line 41
    :pswitch_1f
    invoke-interface {p2}, Lcom/google/android/gms/internal/ads/zzhdr;->zzb()F

    move-result p1

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    goto :goto_3

    .line 42
    :pswitch_20
    invoke-interface {p2}, Lcom/google/android/gms/internal/ads/zzhdr;->zza()D

    move-result-wide p1

    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    .line 5
    :goto_3
    iget-object p2, p3, Lcom/google/android/gms/internal/ads/zzhbm;->zzd:Lcom/google/android/gms/internal/ads/zzhbl;

    iget-boolean p4, p2, Lcom/google/android/gms/internal/ads/zzhbl;->zzd:Z

    if-eqz p4, :cond_b

    .line 43
    invoke-virtual {p5, p2, p1}, Lcom/google/android/gms/internal/ads/zzhbd;->zzh(Lcom/google/android/gms/internal/ads/zzhbc;Ljava/lang/Object;)V

    goto :goto_5

    :cond_b
    iget-object p2, p2, Lcom/google/android/gms/internal/ads/zzhbl;->zzc:Lcom/google/android/gms/internal/ads/zzhfg;

    .line 44
    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/zzhfg;->ordinal()I

    move-result p2

    const/16 p4, 0x9

    if-eq p2, p4, :cond_c

    const/16 p4, 0xa

    if-eq p2, p4, :cond_c

    goto :goto_4

    :cond_c
    iget-object p2, p3, Lcom/google/android/gms/internal/ads/zzhbm;->zzd:Lcom/google/android/gms/internal/ads/zzhbl;

    .line 45
    invoke-virtual {p5, p2}, Lcom/google/android/gms/internal/ads/zzhbd;->zzf(Lcom/google/android/gms/internal/ads/zzhbc;)Ljava/lang/Object;

    move-result-object p2

    if-eqz p2, :cond_d

    .line 46
    sget-object p4, Lcom/google/android/gms/internal/ads/zzhcb;->zzd:[B

    .line 47
    check-cast p2, Lcom/google/android/gms/internal/ads/zzhde;

    invoke-interface {p2}, Lcom/google/android/gms/internal/ads/zzhde;->zzcZ()Lcom/google/android/gms/internal/ads/zzhdd;

    move-result-object p2

    check-cast p1, Lcom/google/android/gms/internal/ads/zzhde;

    invoke-interface {p2, p1}, Lcom/google/android/gms/internal/ads/zzhdd;->zzaS(Lcom/google/android/gms/internal/ads/zzhde;)Lcom/google/android/gms/internal/ads/zzhdd;

    move-result-object p1

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/zzhdd;->zzbs()Lcom/google/android/gms/internal/ads/zzhde;

    move-result-object p1

    :cond_d
    :goto_4
    iget-object p2, p3, Lcom/google/android/gms/internal/ads/zzhbm;->zzd:Lcom/google/android/gms/internal/ads/zzhbl;

    .line 48
    invoke-virtual {p5, p2, p1}, Lcom/google/android/gms/internal/ads/zzhbd;->zzk(Lcom/google/android/gms/internal/ads/zzhbc;Ljava/lang/Object;)V

    :goto_5
    return-object p6

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
    .end packed-switch
.end method

.method final zzf(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/google/android/gms/internal/ads/zzhbk;

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/zzhbk;->zza:Lcom/google/android/gms/internal/ads/zzhbd;

    .line 2
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzhbd;->zzi()V

    return-void
.end method

.method final zzg(Lcom/google/android/gms/internal/ads/zzhdr;Ljava/lang/Object;Lcom/google/android/gms/internal/ads/zzhay;Lcom/google/android/gms/internal/ads/zzhbd;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    check-cast p2, Lcom/google/android/gms/internal/ads/zzhbm;

    .line 1
    iget-object v0, p2, Lcom/google/android/gms/internal/ads/zzhbm;->zzc:Lcom/google/android/gms/internal/ads/zzhde;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-interface {p1, v0, p3}, Lcom/google/android/gms/internal/ads/zzhdr;->zzs(Ljava/lang/Class;Lcom/google/android/gms/internal/ads/zzhay;)Ljava/lang/Object;

    move-result-object p1

    iget-object p2, p2, Lcom/google/android/gms/internal/ads/zzhbm;->zzd:Lcom/google/android/gms/internal/ads/zzhbl;

    .line 2
    invoke-virtual {p4, p2, p1}, Lcom/google/android/gms/internal/ads/zzhbd;->zzk(Lcom/google/android/gms/internal/ads/zzhbc;Ljava/lang/Object;)V

    return-void
.end method

.method final zzh(Lcom/google/android/gms/internal/ads/zzhac;Ljava/lang/Object;Lcom/google/android/gms/internal/ads/zzhay;Lcom/google/android/gms/internal/ads/zzhbd;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    check-cast p2, Lcom/google/android/gms/internal/ads/zzhbm;

    .line 1
    iget-object v0, p2, Lcom/google/android/gms/internal/ads/zzhbm;->zzc:Lcom/google/android/gms/internal/ads/zzhde;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzhde;->zzcY()Lcom/google/android/gms/internal/ads/zzhdd;

    move-result-object v0

    .line 2
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzhac;->zzl()Lcom/google/android/gms/internal/ads/zzham;

    move-result-object p1

    .line 3
    invoke-interface {v0, p1, p3}, Lcom/google/android/gms/internal/ads/zzhdd;->zzaW(Lcom/google/android/gms/internal/ads/zzham;Lcom/google/android/gms/internal/ads/zzhay;)Lcom/google/android/gms/internal/ads/zzhdd;

    .line 4
    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzhdd;->zzbs()Lcom/google/android/gms/internal/ads/zzhde;

    move-result-object p3

    iget-object p2, p2, Lcom/google/android/gms/internal/ads/zzhbm;->zzd:Lcom/google/android/gms/internal/ads/zzhbl;

    invoke-virtual {p4, p2, p3}, Lcom/google/android/gms/internal/ads/zzhbd;->zzk(Lcom/google/android/gms/internal/ads/zzhbc;Ljava/lang/Object;)V

    const/4 p2, 0x0

    .line 5
    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/ads/zzham;->zzz(I)V

    return-void
.end method

.method final zzi(Lcom/google/android/gms/internal/ads/zzhfi;Ljava/util/Map$Entry;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-interface {p2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/zzhbl;

    iget-boolean v1, v0, Lcom/google/android/gms/internal/ads/zzhbl;->zzd:Z

    if-eqz v1, :cond_0

    .line 2
    sget-object v1, Lcom/google/android/gms/internal/ads/zzhfg;->zza:Lcom/google/android/gms/internal/ads/zzhfg;

    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzhbl;->zzc:Lcom/google/android/gms/internal/ads/zzhfg;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzhfg;->ordinal()I

    move-result v1

    const/4 v2, 0x0

    packed-switch v1, :pswitch_data_0

    goto/16 :goto_0

    .line 26
    :pswitch_0
    iget v1, v0, Lcom/google/android/gms/internal/ads/zzhbl;->zzb:I

    .line 27
    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    iget-boolean v0, v0, Lcom/google/android/gms/internal/ads/zzhbl;->zze:Z

    .line 28
    invoke-static {v1, p2, p1, v0}, Lcom/google/android/gms/internal/ads/zzheb;->zzH(ILjava/util/List;Lcom/google/android/gms/internal/ads/zzhfi;Z)V

    return-void

    .line 24
    :pswitch_1
    iget v1, v0, Lcom/google/android/gms/internal/ads/zzhbl;->zzb:I

    .line 25
    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    iget-boolean v0, v0, Lcom/google/android/gms/internal/ads/zzhbl;->zze:Z

    .line 26
    invoke-static {v1, p2, p1, v0}, Lcom/google/android/gms/internal/ads/zzheb;->zzG(ILjava/util/List;Lcom/google/android/gms/internal/ads/zzhfi;Z)V

    return-void

    .line 22
    :pswitch_2
    iget v1, v0, Lcom/google/android/gms/internal/ads/zzhbl;->zzb:I

    .line 23
    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    iget-boolean v0, v0, Lcom/google/android/gms/internal/ads/zzhbl;->zze:Z

    .line 24
    invoke-static {v1, p2, p1, v0}, Lcom/google/android/gms/internal/ads/zzheb;->zzF(ILjava/util/List;Lcom/google/android/gms/internal/ads/zzhfi;Z)V

    return-void

    .line 20
    :pswitch_3
    iget v1, v0, Lcom/google/android/gms/internal/ads/zzhbl;->zzb:I

    .line 21
    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    iget-boolean v0, v0, Lcom/google/android/gms/internal/ads/zzhbl;->zze:Z

    .line 22
    invoke-static {v1, p2, p1, v0}, Lcom/google/android/gms/internal/ads/zzheb;->zzE(ILjava/util/List;Lcom/google/android/gms/internal/ads/zzhfi;Z)V

    return-void

    .line 28
    :pswitch_4
    iget v1, v0, Lcom/google/android/gms/internal/ads/zzhbl;->zzb:I

    .line 29
    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    iget-boolean v0, v0, Lcom/google/android/gms/internal/ads/zzhbl;->zze:Z

    .line 30
    invoke-static {v1, p2, p1, v0}, Lcom/google/android/gms/internal/ads/zzheb;->zzB(ILjava/util/List;Lcom/google/android/gms/internal/ads/zzhfi;Z)V

    return-void

    .line 18
    :pswitch_5
    iget v1, v0, Lcom/google/android/gms/internal/ads/zzhbl;->zzb:I

    .line 19
    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    iget-boolean v0, v0, Lcom/google/android/gms/internal/ads/zzhbl;->zze:Z

    .line 20
    invoke-static {v1, p2, p1, v0}, Lcom/google/android/gms/internal/ads/zzheb;->zzJ(ILjava/util/List;Lcom/google/android/gms/internal/ads/zzhfi;Z)V

    return-void

    .line 30
    :pswitch_6
    iget v0, v0, Lcom/google/android/gms/internal/ads/zzhbl;->zzb:I

    .line 31
    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    .line 32
    invoke-static {v0, p2, p1}, Lcom/google/android/gms/internal/ads/zzheb;->zzu(ILjava/util/List;Lcom/google/android/gms/internal/ads/zzhfi;)V

    return-void

    .line 35
    :pswitch_7
    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    if-eqz v1, :cond_1

    .line 36
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_1

    iget v0, v0, Lcom/google/android/gms/internal/ads/zzhbl;->zzb:I

    .line 37
    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    .line 38
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzhdo;->zza()Lcom/google/android/gms/internal/ads/zzhdo;

    move-result-object v3

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v3, v1}, Lcom/google/android/gms/internal/ads/zzhdo;->zzb(Ljava/lang/Class;)Lcom/google/android/gms/internal/ads/zzhdz;

    move-result-object v1

    .line 39
    invoke-static {v0, p2, p1, v1}, Lcom/google/android/gms/internal/ads/zzheb;->zzD(ILjava/util/List;Lcom/google/android/gms/internal/ads/zzhfi;Lcom/google/android/gms/internal/ads/zzhdz;)V

    return-void

    .line 40
    :pswitch_8
    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    if-eqz v1, :cond_1

    .line 41
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_1

    iget v0, v0, Lcom/google/android/gms/internal/ads/zzhbl;->zzb:I

    .line 42
    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    .line 43
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzhdo;->zza()Lcom/google/android/gms/internal/ads/zzhdo;

    move-result-object v3

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v3, v1}, Lcom/google/android/gms/internal/ads/zzhdo;->zzb(Ljava/lang/Class;)Lcom/google/android/gms/internal/ads/zzhdz;

    move-result-object v1

    .line 44
    invoke-static {v0, p2, p1, v1}, Lcom/google/android/gms/internal/ads/zzheb;->zzA(ILjava/util/List;Lcom/google/android/gms/internal/ads/zzhfi;Lcom/google/android/gms/internal/ads/zzhdz;)V

    return-void

    .line 32
    :pswitch_9
    iget v0, v0, Lcom/google/android/gms/internal/ads/zzhbl;->zzb:I

    .line 33
    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    .line 34
    invoke-static {v0, p2, p1}, Lcom/google/android/gms/internal/ads/zzheb;->zzI(ILjava/util/List;Lcom/google/android/gms/internal/ads/zzhfi;)V

    return-void

    .line 16
    :pswitch_a
    iget v1, v0, Lcom/google/android/gms/internal/ads/zzhbl;->zzb:I

    .line 17
    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    iget-boolean v0, v0, Lcom/google/android/gms/internal/ads/zzhbl;->zze:Z

    .line 18
    invoke-static {v1, p2, p1, v0}, Lcom/google/android/gms/internal/ads/zzheb;->zzt(ILjava/util/List;Lcom/google/android/gms/internal/ads/zzhfi;Z)V

    return-void

    .line 14
    :pswitch_b
    iget v1, v0, Lcom/google/android/gms/internal/ads/zzhbl;->zzb:I

    .line 15
    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    iget-boolean v0, v0, Lcom/google/android/gms/internal/ads/zzhbl;->zze:Z

    .line 16
    invoke-static {v1, p2, p1, v0}, Lcom/google/android/gms/internal/ads/zzheb;->zzx(ILjava/util/List;Lcom/google/android/gms/internal/ads/zzhfi;Z)V

    return-void

    .line 12
    :pswitch_c
    iget v1, v0, Lcom/google/android/gms/internal/ads/zzhbl;->zzb:I

    .line 13
    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    iget-boolean v0, v0, Lcom/google/android/gms/internal/ads/zzhbl;->zze:Z

    .line 14
    invoke-static {v1, p2, p1, v0}, Lcom/google/android/gms/internal/ads/zzheb;->zzy(ILjava/util/List;Lcom/google/android/gms/internal/ads/zzhfi;Z)V

    return-void

    .line 10
    :pswitch_d
    iget v1, v0, Lcom/google/android/gms/internal/ads/zzhbl;->zzb:I

    .line 11
    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    iget-boolean v0, v0, Lcom/google/android/gms/internal/ads/zzhbl;->zze:Z

    .line 12
    invoke-static {v1, p2, p1, v0}, Lcom/google/android/gms/internal/ads/zzheb;->zzB(ILjava/util/List;Lcom/google/android/gms/internal/ads/zzhfi;Z)V

    return-void

    .line 8
    :pswitch_e
    iget v1, v0, Lcom/google/android/gms/internal/ads/zzhbl;->zzb:I

    .line 9
    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    iget-boolean v0, v0, Lcom/google/android/gms/internal/ads/zzhbl;->zze:Z

    .line 10
    invoke-static {v1, p2, p1, v0}, Lcom/google/android/gms/internal/ads/zzheb;->zzK(ILjava/util/List;Lcom/google/android/gms/internal/ads/zzhfi;Z)V

    return-void

    .line 6
    :pswitch_f
    iget v1, v0, Lcom/google/android/gms/internal/ads/zzhbl;->zzb:I

    .line 7
    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    iget-boolean v0, v0, Lcom/google/android/gms/internal/ads/zzhbl;->zze:Z

    .line 8
    invoke-static {v1, p2, p1, v0}, Lcom/google/android/gms/internal/ads/zzheb;->zzC(ILjava/util/List;Lcom/google/android/gms/internal/ads/zzhfi;Z)V

    return-void

    .line 4
    :pswitch_10
    iget v1, v0, Lcom/google/android/gms/internal/ads/zzhbl;->zzb:I

    .line 5
    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    iget-boolean v0, v0, Lcom/google/android/gms/internal/ads/zzhbl;->zze:Z

    .line 6
    invoke-static {v1, p2, p1, v0}, Lcom/google/android/gms/internal/ads/zzheb;->zzz(ILjava/util/List;Lcom/google/android/gms/internal/ads/zzhfi;Z)V

    return-void

    .line 2
    :pswitch_11
    iget v1, v0, Lcom/google/android/gms/internal/ads/zzhbl;->zzb:I

    .line 3
    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    iget-boolean v0, v0, Lcom/google/android/gms/internal/ads/zzhbl;->zze:Z

    .line 4
    invoke-static {v1, p2, p1, v0}, Lcom/google/android/gms/internal/ads/zzheb;->zzv(ILjava/util/List;Lcom/google/android/gms/internal/ads/zzhfi;Z)V

    return-void

    .line 45
    :cond_0
    sget-object v1, Lcom/google/android/gms/internal/ads/zzhfg;->zza:Lcom/google/android/gms/internal/ads/zzhfg;

    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzhbl;->zzc:Lcom/google/android/gms/internal/ads/zzhfg;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzhfg;->ordinal()I

    move-result v1

    packed-switch v1, :pswitch_data_1

    goto/16 :goto_0

    .line 57
    :pswitch_12
    iget v0, v0, Lcom/google/android/gms/internal/ads/zzhbl;->zzb:I

    .line 58
    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Long;

    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-interface {p1, v0, v1, v2}, Lcom/google/android/gms/internal/ads/zzhfi;->zzD(IJ)V

    return-void

    .line 56
    :pswitch_13
    iget v0, v0, Lcom/google/android/gms/internal/ads/zzhbl;->zzb:I

    .line 57
    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-interface {p1, v0, p2}, Lcom/google/android/gms/internal/ads/zzhfi;->zzB(II)V

    return-void

    .line 55
    :pswitch_14
    iget v0, v0, Lcom/google/android/gms/internal/ads/zzhbl;->zzb:I

    .line 56
    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Long;

    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-interface {p1, v0, v1, v2}, Lcom/google/android/gms/internal/ads/zzhfi;->zzz(IJ)V

    return-void

    .line 54
    :pswitch_15
    iget v0, v0, Lcom/google/android/gms/internal/ads/zzhbl;->zzb:I

    .line 55
    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-interface {p1, v0, p2}, Lcom/google/android/gms/internal/ads/zzhfi;->zzx(II)V

    return-void

    .line 58
    :pswitch_16
    iget v0, v0, Lcom/google/android/gms/internal/ads/zzhbl;->zzb:I

    .line 59
    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-interface {p1, v0, p2}, Lcom/google/android/gms/internal/ads/zzhfi;->zzr(II)V

    return-void

    .line 53
    :pswitch_17
    iget v0, v0, Lcom/google/android/gms/internal/ads/zzhbl;->zzb:I

    .line 54
    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-interface {p1, v0, p2}, Lcom/google/android/gms/internal/ads/zzhfi;->zzI(II)V

    return-void

    .line 59
    :pswitch_18
    iget v0, v0, Lcom/google/android/gms/internal/ads/zzhbl;->zzb:I

    .line 60
    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/google/android/gms/internal/ads/zzhac;

    invoke-interface {p1, v0, p2}, Lcom/google/android/gms/internal/ads/zzhfi;->zzd(ILcom/google/android/gms/internal/ads/zzhac;)V

    return-void

    .line 64
    :pswitch_19
    iget v0, v0, Lcom/google/android/gms/internal/ads/zzhbl;->zzb:I

    .line 65
    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    .line 66
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzhdo;->zza()Lcom/google/android/gms/internal/ads/zzhdo;

    move-result-object v2

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p2

    invoke-virtual {v2, p2}, Lcom/google/android/gms/internal/ads/zzhdo;->zzb(Ljava/lang/Class;)Lcom/google/android/gms/internal/ads/zzhdz;

    move-result-object p2

    .line 67
    invoke-interface {p1, v0, v1, p2}, Lcom/google/android/gms/internal/ads/zzhfi;->zzv(ILjava/lang/Object;Lcom/google/android/gms/internal/ads/zzhdz;)V

    return-void

    .line 61
    :pswitch_1a
    iget v0, v0, Lcom/google/android/gms/internal/ads/zzhbl;->zzb:I

    .line 62
    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    .line 63
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzhdo;->zza()Lcom/google/android/gms/internal/ads/zzhdo;

    move-result-object v2

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p2

    invoke-virtual {v2, p2}, Lcom/google/android/gms/internal/ads/zzhdo;->zzb(Ljava/lang/Class;)Lcom/google/android/gms/internal/ads/zzhdz;

    move-result-object p2

    .line 64
    invoke-interface {p1, v0, v1, p2}, Lcom/google/android/gms/internal/ads/zzhfi;->zzq(ILjava/lang/Object;Lcom/google/android/gms/internal/ads/zzhdz;)V

    return-void

    .line 60
    :pswitch_1b
    iget v0, v0, Lcom/google/android/gms/internal/ads/zzhbl;->zzb:I

    .line 61
    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    invoke-interface {p1, v0, p2}, Lcom/google/android/gms/internal/ads/zzhfi;->zzG(ILjava/lang/String;)V

    return-void

    .line 52
    :pswitch_1c
    iget v0, v0, Lcom/google/android/gms/internal/ads/zzhbl;->zzb:I

    .line 53
    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    invoke-interface {p1, v0, p2}, Lcom/google/android/gms/internal/ads/zzhfi;->zzb(IZ)V

    return-void

    .line 51
    :pswitch_1d
    iget v0, v0, Lcom/google/android/gms/internal/ads/zzhbl;->zzb:I

    .line 52
    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-interface {p1, v0, p2}, Lcom/google/android/gms/internal/ads/zzhfi;->zzk(II)V

    return-void

    .line 50
    :pswitch_1e
    iget v0, v0, Lcom/google/android/gms/internal/ads/zzhbl;->zzb:I

    .line 51
    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Long;

    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-interface {p1, v0, v1, v2}, Lcom/google/android/gms/internal/ads/zzhfi;->zzm(IJ)V

    return-void

    .line 49
    :pswitch_1f
    iget v0, v0, Lcom/google/android/gms/internal/ads/zzhbl;->zzb:I

    .line 50
    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-interface {p1, v0, p2}, Lcom/google/android/gms/internal/ads/zzhfi;->zzr(II)V

    return-void

    .line 48
    :pswitch_20
    iget v0, v0, Lcom/google/android/gms/internal/ads/zzhbl;->zzb:I

    .line 49
    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Long;

    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-interface {p1, v0, v1, v2}, Lcom/google/android/gms/internal/ads/zzhfi;->zzK(IJ)V

    return-void

    .line 47
    :pswitch_21
    iget v0, v0, Lcom/google/android/gms/internal/ads/zzhbl;->zzb:I

    .line 48
    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Long;

    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-interface {p1, v0, v1, v2}, Lcom/google/android/gms/internal/ads/zzhfi;->zzt(IJ)V

    return-void

    .line 46
    :pswitch_22
    iget v0, v0, Lcom/google/android/gms/internal/ads/zzhbl;->zzb:I

    .line 47
    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Float;

    invoke-virtual {p2}, Ljava/lang/Float;->floatValue()F

    move-result p2

    invoke-interface {p1, v0, p2}, Lcom/google/android/gms/internal/ads/zzhfi;->zzo(IF)V

    return-void

    .line 45
    :pswitch_23
    iget v0, v0, Lcom/google/android/gms/internal/ads/zzhbl;->zzb:I

    .line 46
    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Double;

    invoke-virtual {p2}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v1

    invoke-interface {p1, v0, v1, v2}, Lcom/google/android/gms/internal/ads/zzhfi;->zzf(ID)V

    :cond_1
    :goto_0
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
    .end packed-switch
.end method

.method final zzj(Lcom/google/android/gms/internal/ads/zzhde;)Z
    .locals 0

    instance-of p1, p1, Lcom/google/android/gms/internal/ads/zzhbk;

    return p1
.end method
