.class public final Lcom/google/android/gms/internal/ads/zzhgj;
.super Lcom/google/android/gms/internal/ads/zzhbo;
.source "com.google.android.gms:play-services-ads@@23.2.0"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzhdf;


# static fields
.field private static final zza:Lcom/google/android/gms/internal/ads/zzhbx;

.field private static final zzb:Lcom/google/android/gms/internal/ads/zzhbx;

.field private static final zzc:Lcom/google/android/gms/internal/ads/zzhgj;

.field private static volatile zzd:Lcom/google/android/gms/internal/ads/zzhdm;


# instance fields
.field private zzA:Z

.field private zzB:Lcom/google/android/gms/internal/ads/zzhbw;

.field private zze:I

.field private zzf:I

.field private zzg:Z

.field private zzh:Ljava/lang/String;

.field private zzi:Lcom/google/android/gms/internal/ads/zzhca;

.field private zzj:I

.field private zzk:Z

.field private zzl:Z

.field private zzm:Z

.field private zzn:Ljava/lang/String;

.field private zzo:I

.field private zzp:I

.field private zzu:I

.field private zzv:Z

.field private zzw:Lcom/google/android/gms/internal/ads/zzhca;

.field private zzx:Z

.field private zzy:J

.field private zzz:Lcom/google/android/gms/internal/ads/zzhbw;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/ads/zzhfs;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzhfs;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ads/zzhgj;->zza:Lcom/google/android/gms/internal/ads/zzhbx;

    new-instance v0, Lcom/google/android/gms/internal/ads/zzhft;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzhft;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ads/zzhgj;->zzb:Lcom/google/android/gms/internal/ads/zzhbx;

    new-instance v0, Lcom/google/android/gms/internal/ads/zzhgj;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzhgj;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ads/zzhgj;->zzc:Lcom/google/android/gms/internal/ads/zzhgj;

    const-class v1, Lcom/google/android/gms/internal/ads/zzhgj;

    .line 2
    invoke-static {v1, v0}, Lcom/google/android/gms/internal/ads/zzhbo;->zzca(Ljava/lang/Class;Lcom/google/android/gms/internal/ads/zzhbo;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzhbo;-><init>()V

    const-string v0, ""

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzhgj;->zzh:Ljava/lang/String;

    .line 2
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzhbo;->zzbK()Lcom/google/android/gms/internal/ads/zzhca;

    move-result-object v1

    iput-object v1, p0, Lcom/google/android/gms/internal/ads/zzhgj;->zzi:Lcom/google/android/gms/internal/ads/zzhca;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzhgj;->zzn:Ljava/lang/String;

    .line 3
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzhgj;->zzbK()Lcom/google/android/gms/internal/ads/zzhca;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzhgj;->zzw:Lcom/google/android/gms/internal/ads/zzhca;

    .line 4
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzhgj;->zzbG()Lcom/google/android/gms/internal/ads/zzhbw;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzhgj;->zzz:Lcom/google/android/gms/internal/ads/zzhbw;

    .line 5
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzhgj;->zzbG()Lcom/google/android/gms/internal/ads/zzhbw;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzhgj;->zzB:Lcom/google/android/gms/internal/ads/zzhbw;

    return-void
.end method

.method static synthetic zzc()Lcom/google/android/gms/internal/ads/zzhgj;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/ads/zzhgj;->zzc:Lcom/google/android/gms/internal/ads/zzhgj;

    return-object v0
.end method


# virtual methods
.method protected final zzde(Lcom/google/android/gms/internal/ads/zzhbn;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 26

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/ads/zzhbn;->zza:Lcom/google/android/gms/internal/ads/zzhbn;

    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/zzhbn;->ordinal()I

    move-result v0

    const/4 v1, 0x0

    packed-switch v0, :pswitch_data_0

    .line 11
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    .line 12
    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0

    .line 1
    :pswitch_0
    sget-object v0, Lcom/google/android/gms/internal/ads/zzhgj;->zzd:Lcom/google/android/gms/internal/ads/zzhdm;

    if-nez v0, :cond_1

    const-class v1, Lcom/google/android/gms/internal/ads/zzhgj;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lcom/google/android/gms/internal/ads/zzhgj;->zzd:Lcom/google/android/gms/internal/ads/zzhdm;

    if-nez v0, :cond_0

    .line 3
    new-instance v0, Lcom/google/android/gms/internal/ads/zzhbj;

    sget-object v2, Lcom/google/android/gms/internal/ads/zzhgj;->zzc:Lcom/google/android/gms/internal/ads/zzhgj;

    invoke-direct {v0, v2}, Lcom/google/android/gms/internal/ads/zzhbj;-><init>(Lcom/google/android/gms/internal/ads/zzhbo;)V

    sput-object v0, Lcom/google/android/gms/internal/ads/zzhgj;->zzd:Lcom/google/android/gms/internal/ads/zzhdm;

    .line 4
    :cond_0
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    :cond_1
    :goto_0
    return-object v0

    .line 2
    :pswitch_1
    sget-object v0, Lcom/google/android/gms/internal/ads/zzhgj;->zzc:Lcom/google/android/gms/internal/ads/zzhgj;

    return-object v0

    .line 9
    :pswitch_2
    new-instance v0, Lcom/google/android/gms/internal/ads/zzhfu;

    .line 10
    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/zzhfu;-><init>(Lcom/google/android/gms/internal/ads/zzhfr;)V

    return-object v0

    :pswitch_3
    new-instance v0, Lcom/google/android/gms/internal/ads/zzhgj;

    .line 11
    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzhgj;-><init>()V

    return-object v0

    .line 2
    :pswitch_4
    const-string v1, "zze"

    const-string v2, "zzf"

    .line 5
    sget-object v3, Lcom/google/android/gms/internal/ads/zzhgh;->zza:Lcom/google/android/gms/internal/ads/zzhbu;

    const-string v4, "zzg"

    const-string v5, "zzh"

    const-string v6, "zzi"

    const-string v7, "zzj"

    .line 6
    sget-object v8, Lcom/google/android/gms/internal/ads/zzhgb;->zza:Lcom/google/android/gms/internal/ads/zzhbu;

    const-string v9, "zzk"

    const-string v10, "zzl"

    const-string v11, "zzm"

    const-string v12, "zzn"

    const-string v13, "zzo"

    const-string v14, "zzp"

    const-string v15, "zzu"

    const-string v16, "zzv"

    const-string v17, "zzw"

    const-class v18, Lcom/google/android/gms/internal/ads/zzhfz;

    const-string v19, "zzx"

    const-string v20, "zzy"

    const-string v21, "zzz"

    .line 7
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzhfl;->zzb()Lcom/google/android/gms/internal/ads/zzhbu;

    move-result-object v22

    const-string v23, "zzA"

    const-string v24, "zzB"

    .line 8
    sget-object v25, Lcom/google/android/gms/internal/ads/zzhge;->zza:Lcom/google/android/gms/internal/ads/zzhbu;

    filled-new-array/range {v1 .. v25}, [Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Lcom/google/android/gms/internal/ads/zzhgj;->zzc:Lcom/google/android/gms/internal/ads/zzhgj;

    const-string v2, "\u0001\u0013\u0000\u0001\u0001\u0013\u0013\u0000\u0004\u0000\u0001\u180c\u0000\u0002\u1007\u0001\u0003\u1008\u0002\u0004\u001a\u0005\u180c\u0003\u0006\u1007\u0004\u0007\u1007\u0005\u0008\u1007\u0006\t\u1008\u0007\n\u1004\u0008\u000b\u1004\t\u000c\u1004\n\r\u1007\u000b\u000e\u001b\u000f\u1007\u000c\u0010\u1002\r\u0011\u082c\u0012\u1007\u000e\u0013\u082c"

    .line 9
    invoke-static {v1, v2, v0}, Lcom/google/android/gms/internal/ads/zzhgj;->zzbR(Lcom/google/android/gms/internal/ads/zzhde;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :pswitch_5
    return-object v1

    :pswitch_6
    const/4 v0, 0x1

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
