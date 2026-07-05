.class public final enum Lcom/google/android/gms/internal/ads/zzhim;
.super Ljava/lang/Enum;
.source "com.google.android.gms:play-services-ads@@23.2.0"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzhbs;


# static fields
.field public static final enum zzA:Lcom/google/android/gms/internal/ads/zzhim;

.field private static final zzB:Lcom/google/android/gms/internal/ads/zzhbt;

.field private static final synthetic zzC:[Lcom/google/android/gms/internal/ads/zzhim;

.field public static final enum zza:Lcom/google/android/gms/internal/ads/zzhim;

.field public static final enum zzb:Lcom/google/android/gms/internal/ads/zzhim;

.field public static final enum zzc:Lcom/google/android/gms/internal/ads/zzhim;

.field public static final enum zzd:Lcom/google/android/gms/internal/ads/zzhim;

.field public static final enum zze:Lcom/google/android/gms/internal/ads/zzhim;

.field public static final enum zzf:Lcom/google/android/gms/internal/ads/zzhim;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final enum zzg:Lcom/google/android/gms/internal/ads/zzhim;

.field public static final enum zzh:Lcom/google/android/gms/internal/ads/zzhim;

.field public static final enum zzi:Lcom/google/android/gms/internal/ads/zzhim;

.field public static final enum zzj:Lcom/google/android/gms/internal/ads/zzhim;

.field public static final enum zzk:Lcom/google/android/gms/internal/ads/zzhim;

.field public static final enum zzl:Lcom/google/android/gms/internal/ads/zzhim;

.field public static final enum zzm:Lcom/google/android/gms/internal/ads/zzhim;

.field public static final enum zzn:Lcom/google/android/gms/internal/ads/zzhim;

.field public static final enum zzo:Lcom/google/android/gms/internal/ads/zzhim;

.field public static final enum zzp:Lcom/google/android/gms/internal/ads/zzhim;

.field public static final enum zzq:Lcom/google/android/gms/internal/ads/zzhim;

.field public static final enum zzr:Lcom/google/android/gms/internal/ads/zzhim;

.field public static final enum zzs:Lcom/google/android/gms/internal/ads/zzhim;

.field public static final enum zzt:Lcom/google/android/gms/internal/ads/zzhim;

.field public static final enum zzu:Lcom/google/android/gms/internal/ads/zzhim;

.field public static final enum zzv:Lcom/google/android/gms/internal/ads/zzhim;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final enum zzw:Lcom/google/android/gms/internal/ads/zzhim;

.field public static final enum zzx:Lcom/google/android/gms/internal/ads/zzhim;

.field public static final enum zzy:Lcom/google/android/gms/internal/ads/zzhim;

.field public static final enum zzz:Lcom/google/android/gms/internal/ads/zzhim;


# instance fields
.field private final zzD:I


# direct methods
.method static constructor <clinit>()V
    .locals 30

    .line 1
    new-instance v1, Lcom/google/android/gms/internal/ads/zzhim;

    move-object v0, v1

    const-string v2, "UNKNOWN"

    const/4 v3, 0x0

    invoke-direct {v1, v2, v3, v3}, Lcom/google/android/gms/internal/ads/zzhim;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lcom/google/android/gms/internal/ads/zzhim;->zza:Lcom/google/android/gms/internal/ads/zzhim;

    new-instance v2, Lcom/google/android/gms/internal/ads/zzhim;

    move-object v1, v2

    const-string v3, "URL_PHISHING"

    const/4 v4, 0x1

    .line 2
    invoke-direct {v2, v3, v4, v4}, Lcom/google/android/gms/internal/ads/zzhim;-><init>(Ljava/lang/String;II)V

    sput-object v2, Lcom/google/android/gms/internal/ads/zzhim;->zzb:Lcom/google/android/gms/internal/ads/zzhim;

    new-instance v3, Lcom/google/android/gms/internal/ads/zzhim;

    move-object v2, v3

    const-string v4, "URL_MALWARE"

    const/4 v5, 0x2

    .line 3
    invoke-direct {v3, v4, v5, v5}, Lcom/google/android/gms/internal/ads/zzhim;-><init>(Ljava/lang/String;II)V

    sput-object v3, Lcom/google/android/gms/internal/ads/zzhim;->zzc:Lcom/google/android/gms/internal/ads/zzhim;

    new-instance v4, Lcom/google/android/gms/internal/ads/zzhim;

    move-object v3, v4

    const-string v5, "URL_UNWANTED"

    const/4 v6, 0x3

    .line 4
    invoke-direct {v4, v5, v6, v6}, Lcom/google/android/gms/internal/ads/zzhim;-><init>(Ljava/lang/String;II)V

    sput-object v4, Lcom/google/android/gms/internal/ads/zzhim;->zzd:Lcom/google/android/gms/internal/ads/zzhim;

    new-instance v5, Lcom/google/android/gms/internal/ads/zzhim;

    move-object v4, v5

    const-string v6, "CLIENT_SIDE_PHISHING_URL"

    const/4 v7, 0x4

    .line 5
    invoke-direct {v5, v6, v7, v7}, Lcom/google/android/gms/internal/ads/zzhim;-><init>(Ljava/lang/String;II)V

    sput-object v5, Lcom/google/android/gms/internal/ads/zzhim;->zze:Lcom/google/android/gms/internal/ads/zzhim;

    new-instance v6, Lcom/google/android/gms/internal/ads/zzhim;

    move-object v5, v6

    const-string v7, "CLIENT_SIDE_MALWARE_URL"

    const/4 v8, 0x5

    .line 6
    invoke-direct {v6, v7, v8, v8}, Lcom/google/android/gms/internal/ads/zzhim;-><init>(Ljava/lang/String;II)V

    sput-object v6, Lcom/google/android/gms/internal/ads/zzhim;->zzf:Lcom/google/android/gms/internal/ads/zzhim;

    new-instance v7, Lcom/google/android/gms/internal/ads/zzhim;

    move-object v6, v7

    const-string v8, "DANGEROUS_DOWNLOAD_RECOVERY"

    const/4 v9, 0x6

    .line 7
    invoke-direct {v7, v8, v9, v9}, Lcom/google/android/gms/internal/ads/zzhim;-><init>(Ljava/lang/String;II)V

    sput-object v7, Lcom/google/android/gms/internal/ads/zzhim;->zzg:Lcom/google/android/gms/internal/ads/zzhim;

    new-instance v8, Lcom/google/android/gms/internal/ads/zzhim;

    move-object v7, v8

    const-string v9, "DANGEROUS_DOWNLOAD_WARNING"

    const/4 v10, 0x7

    .line 8
    invoke-direct {v8, v9, v10, v10}, Lcom/google/android/gms/internal/ads/zzhim;-><init>(Ljava/lang/String;II)V

    sput-object v8, Lcom/google/android/gms/internal/ads/zzhim;->zzh:Lcom/google/android/gms/internal/ads/zzhim;

    new-instance v9, Lcom/google/android/gms/internal/ads/zzhim;

    move-object v8, v9

    const-string v10, "OCTAGON_AD"

    const/16 v11, 0x8

    .line 9
    invoke-direct {v9, v10, v11, v11}, Lcom/google/android/gms/internal/ads/zzhim;-><init>(Ljava/lang/String;II)V

    sput-object v9, Lcom/google/android/gms/internal/ads/zzhim;->zzi:Lcom/google/android/gms/internal/ads/zzhim;

    new-instance v10, Lcom/google/android/gms/internal/ads/zzhim;

    move-object v9, v10

    const-string v11, "OCTAGON_AD_SB_MATCH"

    const/16 v12, 0x9

    .line 10
    invoke-direct {v10, v11, v12, v12}, Lcom/google/android/gms/internal/ads/zzhim;-><init>(Ljava/lang/String;II)V

    sput-object v10, Lcom/google/android/gms/internal/ads/zzhim;->zzj:Lcom/google/android/gms/internal/ads/zzhim;

    new-instance v11, Lcom/google/android/gms/internal/ads/zzhim;

    move-object v10, v11

    const-string v12, "DANGEROUS_DOWNLOAD_BY_API"

    const/16 v13, 0xa

    .line 11
    invoke-direct {v11, v12, v13, v13}, Lcom/google/android/gms/internal/ads/zzhim;-><init>(Ljava/lang/String;II)V

    sput-object v11, Lcom/google/android/gms/internal/ads/zzhim;->zzk:Lcom/google/android/gms/internal/ads/zzhim;

    new-instance v12, Lcom/google/android/gms/internal/ads/zzhim;

    move-object v11, v12

    const-string v13, "OCTAGON_IOS_AD"

    const/16 v14, 0xb

    .line 12
    invoke-direct {v12, v13, v14, v14}, Lcom/google/android/gms/internal/ads/zzhim;-><init>(Ljava/lang/String;II)V

    sput-object v12, Lcom/google/android/gms/internal/ads/zzhim;->zzl:Lcom/google/android/gms/internal/ads/zzhim;

    new-instance v13, Lcom/google/android/gms/internal/ads/zzhim;

    move-object v12, v13

    const-string v14, "PASSWORD_PROTECTION_PHISHING_URL"

    const/16 v15, 0xc

    .line 13
    invoke-direct {v13, v14, v15, v15}, Lcom/google/android/gms/internal/ads/zzhim;-><init>(Ljava/lang/String;II)V

    sput-object v13, Lcom/google/android/gms/internal/ads/zzhim;->zzm:Lcom/google/android/gms/internal/ads/zzhim;

    new-instance v14, Lcom/google/android/gms/internal/ads/zzhim;

    move-object v13, v14

    const-string v15, "DANGEROUS_DOWNLOAD_OPENED"

    move-object/from16 v27, v0

    const/16 v0, 0xd

    .line 14
    invoke-direct {v14, v15, v0, v0}, Lcom/google/android/gms/internal/ads/zzhim;-><init>(Ljava/lang/String;II)V

    sput-object v14, Lcom/google/android/gms/internal/ads/zzhim;->zzn:Lcom/google/android/gms/internal/ads/zzhim;

    new-instance v0, Lcom/google/android/gms/internal/ads/zzhim;

    move-object v14, v0

    const-string v15, "AD_SAMPLE"

    move-object/from16 v28, v1

    const/16 v1, 0xe

    .line 15
    invoke-direct {v0, v15, v1, v1}, Lcom/google/android/gms/internal/ads/zzhim;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/google/android/gms/internal/ads/zzhim;->zzo:Lcom/google/android/gms/internal/ads/zzhim;

    new-instance v0, Lcom/google/android/gms/internal/ads/zzhim;

    move-object v15, v0

    const-string v1, "URL_SUSPICIOUS"

    move-object/from16 v29, v2

    const/16 v2, 0xf

    .line 16
    invoke-direct {v0, v1, v2, v2}, Lcom/google/android/gms/internal/ads/zzhim;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/google/android/gms/internal/ads/zzhim;->zzp:Lcom/google/android/gms/internal/ads/zzhim;

    new-instance v0, Lcom/google/android/gms/internal/ads/zzhim;

    move-object/from16 v16, v0

    const-string v1, "BILLING"

    const/16 v2, 0x10

    .line 17
    invoke-direct {v0, v1, v2, v2}, Lcom/google/android/gms/internal/ads/zzhim;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/google/android/gms/internal/ads/zzhim;->zzq:Lcom/google/android/gms/internal/ads/zzhim;

    new-instance v0, Lcom/google/android/gms/internal/ads/zzhim;

    move-object/from16 v17, v0

    const-string v1, "APK_DOWNLOAD"

    const/16 v2, 0x11

    .line 18
    invoke-direct {v0, v1, v2, v2}, Lcom/google/android/gms/internal/ads/zzhim;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/google/android/gms/internal/ads/zzhim;->zzr:Lcom/google/android/gms/internal/ads/zzhim;

    new-instance v0, Lcom/google/android/gms/internal/ads/zzhim;

    move-object/from16 v18, v0

    const-string v1, "BLOCKED_AD_DRIVE_BY_DOWNLOAD"

    const/16 v2, 0x12

    .line 19
    invoke-direct {v0, v1, v2, v2}, Lcom/google/android/gms/internal/ads/zzhim;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/google/android/gms/internal/ads/zzhim;->zzs:Lcom/google/android/gms/internal/ads/zzhim;

    new-instance v0, Lcom/google/android/gms/internal/ads/zzhim;

    move-object/from16 v19, v0

    const-string v1, "BLOCKED_AD_REDIRECT"

    const/16 v2, 0x13

    .line 20
    invoke-direct {v0, v1, v2, v2}, Lcom/google/android/gms/internal/ads/zzhim;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/google/android/gms/internal/ads/zzhim;->zzt:Lcom/google/android/gms/internal/ads/zzhim;

    new-instance v0, Lcom/google/android/gms/internal/ads/zzhim;

    move-object/from16 v20, v0

    const-string v1, "BLOCKED_AD_POPUP"

    const/16 v2, 0x14

    .line 21
    invoke-direct {v0, v1, v2, v2}, Lcom/google/android/gms/internal/ads/zzhim;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/google/android/gms/internal/ads/zzhim;->zzu:Lcom/google/android/gms/internal/ads/zzhim;

    new-instance v0, Lcom/google/android/gms/internal/ads/zzhim;

    move-object/from16 v21, v0

    const-string v1, "HASH_PREFIX_REAL_TIME_EXPERIMENT"

    const/16 v2, 0x15

    .line 22
    invoke-direct {v0, v1, v2, v2}, Lcom/google/android/gms/internal/ads/zzhim;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/google/android/gms/internal/ads/zzhim;->zzv:Lcom/google/android/gms/internal/ads/zzhim;

    new-instance v0, Lcom/google/android/gms/internal/ads/zzhim;

    move-object/from16 v22, v0

    const-string v1, "PHISHY_SITE_INTERACTIONS"

    const/16 v2, 0x16

    .line 23
    invoke-direct {v0, v1, v2, v2}, Lcom/google/android/gms/internal/ads/zzhim;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/google/android/gms/internal/ads/zzhim;->zzw:Lcom/google/android/gms/internal/ads/zzhim;

    new-instance v0, Lcom/google/android/gms/internal/ads/zzhim;

    move-object/from16 v23, v0

    const-string v1, "WARNING_SHOWN"

    const/16 v2, 0x17

    .line 24
    invoke-direct {v0, v1, v2, v2}, Lcom/google/android/gms/internal/ads/zzhim;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/google/android/gms/internal/ads/zzhim;->zzx:Lcom/google/android/gms/internal/ads/zzhim;

    new-instance v0, Lcom/google/android/gms/internal/ads/zzhim;

    move-object/from16 v24, v0

    const-string v1, "NOTIFICATION_PERMISSION_ACCEPTED"

    const/16 v2, 0x18

    .line 25
    invoke-direct {v0, v1, v2, v2}, Lcom/google/android/gms/internal/ads/zzhim;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/google/android/gms/internal/ads/zzhim;->zzy:Lcom/google/android/gms/internal/ads/zzhim;

    new-instance v0, Lcom/google/android/gms/internal/ads/zzhim;

    move-object/from16 v25, v0

    const-string v1, "DANGEROUS_DOWNLOAD_AUTO_DELETED"

    const/16 v2, 0x19

    .line 26
    invoke-direct {v0, v1, v2, v2}, Lcom/google/android/gms/internal/ads/zzhim;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/google/android/gms/internal/ads/zzhim;->zzz:Lcom/google/android/gms/internal/ads/zzhim;

    new-instance v0, Lcom/google/android/gms/internal/ads/zzhim;

    move-object/from16 v26, v0

    const-string v1, "DANGEROUS_DOWNLOAD_PROFILE_CLOSED"

    const/16 v2, 0x1a

    .line 27
    invoke-direct {v0, v1, v2, v2}, Lcom/google/android/gms/internal/ads/zzhim;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/google/android/gms/internal/ads/zzhim;->zzA:Lcom/google/android/gms/internal/ads/zzhim;

    move-object/from16 v0, v27

    move-object/from16 v1, v28

    move-object/from16 v2, v29

    filled-new-array/range {v0 .. v26}, [Lcom/google/android/gms/internal/ads/zzhim;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/ads/zzhim;->zzC:[Lcom/google/android/gms/internal/ads/zzhim;

    new-instance v0, Lcom/google/android/gms/internal/ads/zzhik;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzhik;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ads/zzhim;->zzB:Lcom/google/android/gms/internal/ads/zzhbt;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lcom/google/android/gms/internal/ads/zzhim;->zzD:I

    return-void
.end method

.method public static values()[Lcom/google/android/gms/internal/ads/zzhim;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/ads/zzhim;->zzC:[Lcom/google/android/gms/internal/ads/zzhim;

    invoke-virtual {v0}, [Lcom/google/android/gms/internal/ads/zzhim;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/google/android/gms/internal/ads/zzhim;

    return-object v0
.end method

.method public static zzb(I)Lcom/google/android/gms/internal/ads/zzhim;
    .locals 0

    packed-switch p0, :pswitch_data_0

    const/4 p0, 0x0

    return-object p0

    :pswitch_0
    sget-object p0, Lcom/google/android/gms/internal/ads/zzhim;->zzA:Lcom/google/android/gms/internal/ads/zzhim;

    return-object p0

    :pswitch_1
    sget-object p0, Lcom/google/android/gms/internal/ads/zzhim;->zzz:Lcom/google/android/gms/internal/ads/zzhim;

    return-object p0

    :pswitch_2
    sget-object p0, Lcom/google/android/gms/internal/ads/zzhim;->zzy:Lcom/google/android/gms/internal/ads/zzhim;

    return-object p0

    :pswitch_3
    sget-object p0, Lcom/google/android/gms/internal/ads/zzhim;->zzx:Lcom/google/android/gms/internal/ads/zzhim;

    return-object p0

    :pswitch_4
    sget-object p0, Lcom/google/android/gms/internal/ads/zzhim;->zzw:Lcom/google/android/gms/internal/ads/zzhim;

    return-object p0

    :pswitch_5
    sget-object p0, Lcom/google/android/gms/internal/ads/zzhim;->zzv:Lcom/google/android/gms/internal/ads/zzhim;

    return-object p0

    :pswitch_6
    sget-object p0, Lcom/google/android/gms/internal/ads/zzhim;->zzu:Lcom/google/android/gms/internal/ads/zzhim;

    return-object p0

    :pswitch_7
    sget-object p0, Lcom/google/android/gms/internal/ads/zzhim;->zzt:Lcom/google/android/gms/internal/ads/zzhim;

    return-object p0

    :pswitch_8
    sget-object p0, Lcom/google/android/gms/internal/ads/zzhim;->zzs:Lcom/google/android/gms/internal/ads/zzhim;

    return-object p0

    :pswitch_9
    sget-object p0, Lcom/google/android/gms/internal/ads/zzhim;->zzr:Lcom/google/android/gms/internal/ads/zzhim;

    return-object p0

    :pswitch_a
    sget-object p0, Lcom/google/android/gms/internal/ads/zzhim;->zzq:Lcom/google/android/gms/internal/ads/zzhim;

    return-object p0

    :pswitch_b
    sget-object p0, Lcom/google/android/gms/internal/ads/zzhim;->zzp:Lcom/google/android/gms/internal/ads/zzhim;

    return-object p0

    :pswitch_c
    sget-object p0, Lcom/google/android/gms/internal/ads/zzhim;->zzo:Lcom/google/android/gms/internal/ads/zzhim;

    return-object p0

    :pswitch_d
    sget-object p0, Lcom/google/android/gms/internal/ads/zzhim;->zzn:Lcom/google/android/gms/internal/ads/zzhim;

    return-object p0

    :pswitch_e
    sget-object p0, Lcom/google/android/gms/internal/ads/zzhim;->zzm:Lcom/google/android/gms/internal/ads/zzhim;

    return-object p0

    :pswitch_f
    sget-object p0, Lcom/google/android/gms/internal/ads/zzhim;->zzl:Lcom/google/android/gms/internal/ads/zzhim;

    return-object p0

    :pswitch_10
    sget-object p0, Lcom/google/android/gms/internal/ads/zzhim;->zzk:Lcom/google/android/gms/internal/ads/zzhim;

    return-object p0

    :pswitch_11
    sget-object p0, Lcom/google/android/gms/internal/ads/zzhim;->zzj:Lcom/google/android/gms/internal/ads/zzhim;

    return-object p0

    :pswitch_12
    sget-object p0, Lcom/google/android/gms/internal/ads/zzhim;->zzi:Lcom/google/android/gms/internal/ads/zzhim;

    return-object p0

    :pswitch_13
    sget-object p0, Lcom/google/android/gms/internal/ads/zzhim;->zzh:Lcom/google/android/gms/internal/ads/zzhim;

    return-object p0

    :pswitch_14
    sget-object p0, Lcom/google/android/gms/internal/ads/zzhim;->zzg:Lcom/google/android/gms/internal/ads/zzhim;

    return-object p0

    :pswitch_15
    sget-object p0, Lcom/google/android/gms/internal/ads/zzhim;->zzf:Lcom/google/android/gms/internal/ads/zzhim;

    return-object p0

    :pswitch_16
    sget-object p0, Lcom/google/android/gms/internal/ads/zzhim;->zze:Lcom/google/android/gms/internal/ads/zzhim;

    return-object p0

    :pswitch_17
    sget-object p0, Lcom/google/android/gms/internal/ads/zzhim;->zzd:Lcom/google/android/gms/internal/ads/zzhim;

    return-object p0

    :pswitch_18
    sget-object p0, Lcom/google/android/gms/internal/ads/zzhim;->zzc:Lcom/google/android/gms/internal/ads/zzhim;

    return-object p0

    :pswitch_19
    sget-object p0, Lcom/google/android/gms/internal/ads/zzhim;->zzb:Lcom/google/android/gms/internal/ads/zzhim;

    return-object p0

    :pswitch_1a
    sget-object p0, Lcom/google/android/gms/internal/ads/zzhim;->zza:Lcom/google/android/gms/internal/ads/zzhim;

    return-object p0

    :pswitch_data_0
    .packed-switch 0x0
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
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzhim;->zzD:I

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final zza()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzhim;->zzD:I

    return v0
.end method
