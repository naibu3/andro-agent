.class final Lcom/google/android/gms/internal/ads/zzamy;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@23.2.0"


# instance fields
.field private zza:Ljava/lang/String;

.field private zzb:I

.field private zzc:Z

.field private zzd:I

.field private zze:Z

.field private zzf:I

.field private zzg:I

.field private zzh:I

.field private zzi:I

.field private zzj:I

.field private zzk:F

.field private zzl:Ljava/lang/String;

.field private zzm:I

.field private zzn:I

.field private zzo:Landroid/text/Layout$Alignment;

.field private zzp:Landroid/text/Layout$Alignment;

.field private zzq:I

.field private zzr:Lcom/google/android/gms/internal/ads/zzamr;

.field private zzs:F


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzamy;->zzf:I

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzamy;->zzg:I

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzamy;->zzh:I

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzamy;->zzi:I

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzamy;->zzj:I

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzamy;->zzm:I

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzamy;->zzn:I

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzamy;->zzq:I

    const v0, 0x7f7fffff    # Float.MAX_VALUE

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzamy;->zzs:F

    return-void
.end method


# virtual methods
.method public final zzA(Z)Lcom/google/android/gms/internal/ads/zzamy;
    .locals 0

    iput p1, p0, Lcom/google/android/gms/internal/ads/zzamy;->zzq:I

    return-object p0
.end method

.method public final zzB(Lcom/google/android/gms/internal/ads/zzamr;)Lcom/google/android/gms/internal/ads/zzamy;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzamy;->zzr:Lcom/google/android/gms/internal/ads/zzamr;

    return-object p0
.end method

.method public final zzC(Z)Lcom/google/android/gms/internal/ads/zzamy;
    .locals 0

    iput p1, p0, Lcom/google/android/gms/internal/ads/zzamy;->zzg:I

    return-object p0
.end method

.method public final zzD()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzamy;->zza:Ljava/lang/String;

    return-object v0
.end method

.method public final zzE()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzamy;->zzl:Ljava/lang/String;

    return-object v0
.end method

.method public final zzF()Z
    .locals 2

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzamy;->zzq:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final zzG()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzamy;->zze:Z

    return v0
.end method

.method public final zzH()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzamy;->zzc:Z

    return v0
.end method

.method public final zzI()Z
    .locals 2

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzamy;->zzf:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final zzJ()Z
    .locals 2

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzamy;->zzg:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final zza()F
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzamy;->zzk:F

    return v0
.end method

.method public final zzb()F
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzamy;->zzs:F

    return v0
.end method

.method public final zzc()I
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzamy;->zze:Z

    if-eqz v0, :cond_0

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzamy;->zzd:I

    return v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Background color has not been defined."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final zzd()I
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzamy;->zzc:Z

    if-eqz v0, :cond_0

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzamy;->zzb:I

    return v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Font color has not been defined."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final zze()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzamy;->zzj:I

    return v0
.end method

.method public final zzf()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzamy;->zzn:I

    return v0
.end method

.method public final zzg()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzamy;->zzm:I

    return v0
.end method

.method public final zzh()I
    .locals 4

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzamy;->zzh:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_1

    iget v2, p0, Lcom/google/android/gms/internal/ads/zzamy;->zzi:I

    if-eq v2, v1, :cond_0

    goto :goto_0

    :cond_0
    return v1

    :cond_1
    :goto_0
    const/4 v1, 0x0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_2

    move v0, v2

    goto :goto_1

    :cond_2
    move v0, v1

    :goto_1
    iget v3, p0, Lcom/google/android/gms/internal/ads/zzamy;->zzi:I

    if-ne v3, v2, :cond_3

    const/4 v1, 0x2

    :cond_3
    or-int/2addr v0, v1

    return v0
.end method

.method public final zzi()Landroid/text/Layout$Alignment;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzamy;->zzp:Landroid/text/Layout$Alignment;

    return-object v0
.end method

.method public final zzj()Landroid/text/Layout$Alignment;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzamy;->zzo:Landroid/text/Layout$Alignment;

    return-object v0
.end method

.method public final zzk()Lcom/google/android/gms/internal/ads/zzamr;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzamy;->zzr:Lcom/google/android/gms/internal/ads/zzamr;

    return-object v0
.end method

.method public final zzl(Lcom/google/android/gms/internal/ads/zzamy;)Lcom/google/android/gms/internal/ads/zzamy;
    .locals 3

    if-eqz p1, :cond_e

    .line 1
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzamy;->zzc:Z

    if-nez v0, :cond_0

    iget-boolean v0, p1, Lcom/google/android/gms/internal/ads/zzamy;->zzc:Z

    if-eqz v0, :cond_0

    iget v0, p1, Lcom/google/android/gms/internal/ads/zzamy;->zzb:I

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ads/zzamy;->zzo(I)Lcom/google/android/gms/internal/ads/zzamy;

    :cond_0
    iget v0, p0, Lcom/google/android/gms/internal/ads/zzamy;->zzh:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_1

    iget v0, p1, Lcom/google/android/gms/internal/ads/zzamy;->zzh:I

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzamy;->zzh:I

    :cond_1
    iget v0, p0, Lcom/google/android/gms/internal/ads/zzamy;->zzi:I

    if-ne v0, v1, :cond_2

    iget v0, p1, Lcom/google/android/gms/internal/ads/zzamy;->zzi:I

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzamy;->zzi:I

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzamy;->zza:Ljava/lang/String;

    if-nez v0, :cond_3

    iget-object v0, p1, Lcom/google/android/gms/internal/ads/zzamy;->zza:Ljava/lang/String;

    if-eqz v0, :cond_3

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzamy;->zza:Ljava/lang/String;

    :cond_3
    iget v0, p0, Lcom/google/android/gms/internal/ads/zzamy;->zzf:I

    if-ne v0, v1, :cond_4

    iget v0, p1, Lcom/google/android/gms/internal/ads/zzamy;->zzf:I

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzamy;->zzf:I

    :cond_4
    iget v0, p0, Lcom/google/android/gms/internal/ads/zzamy;->zzg:I

    if-ne v0, v1, :cond_5

    iget v0, p1, Lcom/google/android/gms/internal/ads/zzamy;->zzg:I

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzamy;->zzg:I

    :cond_5
    iget v0, p0, Lcom/google/android/gms/internal/ads/zzamy;->zzn:I

    if-ne v0, v1, :cond_6

    iget v0, p1, Lcom/google/android/gms/internal/ads/zzamy;->zzn:I

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzamy;->zzn:I

    :cond_6
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzamy;->zzo:Landroid/text/Layout$Alignment;

    if-nez v0, :cond_7

    iget-object v0, p1, Lcom/google/android/gms/internal/ads/zzamy;->zzo:Landroid/text/Layout$Alignment;

    if-eqz v0, :cond_7

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzamy;->zzo:Landroid/text/Layout$Alignment;

    :cond_7
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzamy;->zzp:Landroid/text/Layout$Alignment;

    if-nez v0, :cond_8

    iget-object v0, p1, Lcom/google/android/gms/internal/ads/zzamy;->zzp:Landroid/text/Layout$Alignment;

    if-eqz v0, :cond_8

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzamy;->zzp:Landroid/text/Layout$Alignment;

    :cond_8
    iget v0, p0, Lcom/google/android/gms/internal/ads/zzamy;->zzq:I

    if-ne v0, v1, :cond_9

    iget v0, p1, Lcom/google/android/gms/internal/ads/zzamy;->zzq:I

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzamy;->zzq:I

    :cond_9
    iget v0, p0, Lcom/google/android/gms/internal/ads/zzamy;->zzj:I

    if-ne v0, v1, :cond_a

    iget v0, p1, Lcom/google/android/gms/internal/ads/zzamy;->zzj:I

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzamy;->zzj:I

    iget v0, p1, Lcom/google/android/gms/internal/ads/zzamy;->zzk:F

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzamy;->zzk:F

    :cond_a
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzamy;->zzr:Lcom/google/android/gms/internal/ads/zzamr;

    if-nez v0, :cond_b

    iget-object v0, p1, Lcom/google/android/gms/internal/ads/zzamy;->zzr:Lcom/google/android/gms/internal/ads/zzamr;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzamy;->zzr:Lcom/google/android/gms/internal/ads/zzamr;

    :cond_b
    iget v0, p0, Lcom/google/android/gms/internal/ads/zzamy;->zzs:F

    const v2, 0x7f7fffff    # Float.MAX_VALUE

    cmpl-float v0, v0, v2

    if-nez v0, :cond_c

    iget v0, p1, Lcom/google/android/gms/internal/ads/zzamy;->zzs:F

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzamy;->zzs:F

    :cond_c
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzamy;->zze:Z

    if-nez v0, :cond_d

    iget-boolean v0, p1, Lcom/google/android/gms/internal/ads/zzamy;->zze:Z

    if-eqz v0, :cond_d

    iget v0, p1, Lcom/google/android/gms/internal/ads/zzamy;->zzd:I

    .line 2
    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ads/zzamy;->zzm(I)Lcom/google/android/gms/internal/ads/zzamy;

    :cond_d
    iget v0, p0, Lcom/google/android/gms/internal/ads/zzamy;->zzm:I

    if-ne v0, v1, :cond_e

    iget p1, p1, Lcom/google/android/gms/internal/ads/zzamy;->zzm:I

    if-eq p1, v1, :cond_e

    iput p1, p0, Lcom/google/android/gms/internal/ads/zzamy;->zzm:I

    :cond_e
    return-object p0
.end method

.method public final zzm(I)Lcom/google/android/gms/internal/ads/zzamy;
    .locals 0

    iput p1, p0, Lcom/google/android/gms/internal/ads/zzamy;->zzd:I

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/zzamy;->zze:Z

    return-object p0
.end method

.method public final zzn(Z)Lcom/google/android/gms/internal/ads/zzamy;
    .locals 0

    iput p1, p0, Lcom/google/android/gms/internal/ads/zzamy;->zzh:I

    return-object p0
.end method

.method public final zzo(I)Lcom/google/android/gms/internal/ads/zzamy;
    .locals 0

    iput p1, p0, Lcom/google/android/gms/internal/ads/zzamy;->zzb:I

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/zzamy;->zzc:Z

    return-object p0
.end method

.method public final zzp(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzamy;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzamy;->zza:Ljava/lang/String;

    return-object p0
.end method

.method public final zzq(F)Lcom/google/android/gms/internal/ads/zzamy;
    .locals 0

    iput p1, p0, Lcom/google/android/gms/internal/ads/zzamy;->zzk:F

    return-object p0
.end method

.method public final zzr(I)Lcom/google/android/gms/internal/ads/zzamy;
    .locals 0

    iput p1, p0, Lcom/google/android/gms/internal/ads/zzamy;->zzj:I

    return-object p0
.end method

.method public final zzs(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzamy;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzamy;->zzl:Ljava/lang/String;

    return-object p0
.end method

.method public final zzt(Z)Lcom/google/android/gms/internal/ads/zzamy;
    .locals 0

    iput p1, p0, Lcom/google/android/gms/internal/ads/zzamy;->zzi:I

    return-object p0
.end method

.method public final zzu(Z)Lcom/google/android/gms/internal/ads/zzamy;
    .locals 0

    iput p1, p0, Lcom/google/android/gms/internal/ads/zzamy;->zzf:I

    return-object p0
.end method

.method public final zzv(Landroid/text/Layout$Alignment;)Lcom/google/android/gms/internal/ads/zzamy;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzamy;->zzp:Landroid/text/Layout$Alignment;

    return-object p0
.end method

.method public final zzw(I)Lcom/google/android/gms/internal/ads/zzamy;
    .locals 0

    iput p1, p0, Lcom/google/android/gms/internal/ads/zzamy;->zzn:I

    return-object p0
.end method

.method public final zzx(I)Lcom/google/android/gms/internal/ads/zzamy;
    .locals 0

    iput p1, p0, Lcom/google/android/gms/internal/ads/zzamy;->zzm:I

    return-object p0
.end method

.method public final zzy(F)Lcom/google/android/gms/internal/ads/zzamy;
    .locals 0

    iput p1, p0, Lcom/google/android/gms/internal/ads/zzamy;->zzs:F

    return-object p0
.end method

.method public final zzz(Landroid/text/Layout$Alignment;)Lcom/google/android/gms/internal/ads/zzamy;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzamy;->zzo:Landroid/text/Layout$Alignment;

    return-object p0
.end method
