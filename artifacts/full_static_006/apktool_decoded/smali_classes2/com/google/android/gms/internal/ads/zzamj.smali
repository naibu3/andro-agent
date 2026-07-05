.class public final Lcom/google/android/gms/internal/ads/zzamj;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@23.2.0"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzalv;


# instance fields
.field private final zza:Lcom/google/android/gms/internal/ads/zzfu;

.field private final zzb:Lcom/google/android/gms/internal/ads/zzfu;

.field private final zzc:Lcom/google/android/gms/internal/ads/zzami;

.field private zzd:Ljava/util/zip/Inflater;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/google/android/gms/internal/ads/zzfu;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzfu;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzamj;->zza:Lcom/google/android/gms/internal/ads/zzfu;

    new-instance v0, Lcom/google/android/gms/internal/ads/zzfu;

    .line 2
    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzfu;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzamj;->zzb:Lcom/google/android/gms/internal/ads/zzfu;

    new-instance v0, Lcom/google/android/gms/internal/ads/zzami;

    .line 3
    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzami;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzamj;->zzc:Lcom/google/android/gms/internal/ads/zzami;

    return-void
.end method


# virtual methods
.method public final zza([BIILcom/google/android/gms/internal/ads/zzalu;Lcom/google/android/gms/internal/ads/zzev;)V
    .locals 6

    add-int/2addr p3, p2

    .line 1
    iget-object p4, p0, Lcom/google/android/gms/internal/ads/zzamj;->zza:Lcom/google/android/gms/internal/ads/zzfu;

    invoke-virtual {p4, p1, p3}, Lcom/google/android/gms/internal/ads/zzfu;->zzI([BI)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzamj;->zza:Lcom/google/android/gms/internal/ads/zzfu;

    .line 2
    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/ads/zzfu;->zzK(I)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzamj;->zza:Lcom/google/android/gms/internal/ads/zzfu;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzfu;->zzb()I

    move-result p2

    if-lez p2, :cond_1

    .line 3
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzfu;->zzf()I

    move-result p2

    const/16 p3, 0x78

    if-ne p2, p3, :cond_1

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/zzamj;->zzd:Ljava/util/zip/Inflater;

    if-nez p2, :cond_0

    new-instance p2, Ljava/util/zip/Inflater;

    .line 4
    invoke-direct {p2}, Ljava/util/zip/Inflater;-><init>()V

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzamj;->zzd:Ljava/util/zip/Inflater;

    :cond_0
    iget-object p2, p0, Lcom/google/android/gms/internal/ads/zzamj;->zzb:Lcom/google/android/gms/internal/ads/zzfu;

    iget-object p3, p0, Lcom/google/android/gms/internal/ads/zzamj;->zzd:Ljava/util/zip/Inflater;

    .line 5
    invoke-static {p1, p2, p3}, Lcom/google/android/gms/internal/ads/zzgd;->zzI(Lcom/google/android/gms/internal/ads/zzfu;Lcom/google/android/gms/internal/ads/zzfu;Ljava/util/zip/Inflater;)Z

    move-result p2

    if-eqz p2, :cond_1

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/zzamj;->zzb:Lcom/google/android/gms/internal/ads/zzfu;

    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/zzfu;->zzM()[B

    move-result-object p3

    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/zzfu;->zze()I

    move-result p2

    .line 6
    invoke-virtual {p1, p3, p2}, Lcom/google/android/gms/internal/ads/zzfu;->zzI([BI)V

    :cond_1
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzamj;->zzc:Lcom/google/android/gms/internal/ads/zzami;

    .line 7
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzami;->zze()V

    new-instance v1, Ljava/util/ArrayList;

    .line 8
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    :cond_2
    :goto_0
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzamj;->zza:Lcom/google/android/gms/internal/ads/zzfu;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzfu;->zzb()I

    move-result p2

    const/4 p3, 0x3

    if-lt p2, p3, :cond_5

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/zzamj;->zzc:Lcom/google/android/gms/internal/ads/zzami;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzfu;->zze()I

    move-result p3

    .line 9
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzfu;->zzm()I

    move-result p4

    .line 10
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzfu;->zzq()I

    move-result v0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzfu;->zzd()I

    move-result v2

    add-int/2addr v2, v0

    const/4 v3, 0x0

    if-le v2, p3, :cond_3

    .line 11
    invoke-virtual {p1, p3}, Lcom/google/android/gms/internal/ads/zzfu;->zzK(I)V

    goto :goto_2

    :cond_3
    const/16 p3, 0x80

    if-eq p4, p3, :cond_4

    packed-switch p4, :pswitch_data_0

    goto :goto_1

    .line 14
    :pswitch_0
    invoke-static {p2, p1, v0}, Lcom/google/android/gms/internal/ads/zzami;->zzc(Lcom/google/android/gms/internal/ads/zzami;Lcom/google/android/gms/internal/ads/zzfu;I)V

    goto :goto_1

    .line 15
    :pswitch_1
    invoke-static {p2, p1, v0}, Lcom/google/android/gms/internal/ads/zzami;->zzb(Lcom/google/android/gms/internal/ads/zzami;Lcom/google/android/gms/internal/ads/zzfu;I)V

    goto :goto_1

    .line 16
    :pswitch_2
    invoke-static {p2, p1, v0}, Lcom/google/android/gms/internal/ads/zzami;->zzd(Lcom/google/android/gms/internal/ads/zzami;Lcom/google/android/gms/internal/ads/zzfu;I)V

    goto :goto_1

    .line 12
    :cond_4
    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/zzami;->zza()Lcom/google/android/gms/internal/ads/zzei;

    move-result-object p3

    .line 13
    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/zzami;->zze()V

    move-object v3, p3

    .line 17
    :goto_1
    invoke-virtual {p1, v2}, Lcom/google/android/gms/internal/ads/zzfu;->zzK(I)V

    :goto_2
    if-eqz v3, :cond_2

    .line 18
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 15
    :cond_5
    new-instance p1, Lcom/google/android/gms/internal/ads/zzaln;

    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    move-object v0, p1

    move-wide v2, v4

    .line 19
    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/ads/zzaln;-><init>(Ljava/util/List;JJ)V

    invoke-interface {p5, p1}, Lcom/google/android/gms/internal/ads/zzev;->zza(Ljava/lang/Object;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x14
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
