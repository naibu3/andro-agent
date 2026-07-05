.class public final enum Lcom/google/android/gms/internal/ads/zzatx;
.super Ljava/lang/Enum;
.source "com.google.android.gms:play-services-ads@@23.2.0"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzhbs;


# static fields
.field public static final enum zza:Lcom/google/android/gms/internal/ads/zzatx;

.field public static final enum zzb:Lcom/google/android/gms/internal/ads/zzatx;

.field public static final enum zzc:Lcom/google/android/gms/internal/ads/zzatx;

.field public static final enum zzd:Lcom/google/android/gms/internal/ads/zzatx;

.field public static final enum zze:Lcom/google/android/gms/internal/ads/zzatx;

.field public static final enum zzf:Lcom/google/android/gms/internal/ads/zzatx;

.field public static final enum zzg:Lcom/google/android/gms/internal/ads/zzatx;

.field public static final enum zzh:Lcom/google/android/gms/internal/ads/zzatx;

.field public static final enum zzi:Lcom/google/android/gms/internal/ads/zzatx;

.field public static final enum zzj:Lcom/google/android/gms/internal/ads/zzatx;

.field private static final zzk:Lcom/google/android/gms/internal/ads/zzhbt;

.field private static final synthetic zzl:[Lcom/google/android/gms/internal/ads/zzatx;


# instance fields
.field private final zzm:I


# direct methods
.method static constructor <clinit>()V
    .locals 12

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/ads/zzatx;

    const-string v1, "DEVICE_IDENTIFIER_NO_ID"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lcom/google/android/gms/internal/ads/zzatx;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/google/android/gms/internal/ads/zzatx;->zza:Lcom/google/android/gms/internal/ads/zzatx;

    new-instance v1, Lcom/google/android/gms/internal/ads/zzatx;

    const-string v2, "DEVICE_IDENTIFIER_APP_SPECIFIC_ID"

    const/4 v3, 0x1

    .line 2
    invoke-direct {v1, v2, v3, v3}, Lcom/google/android/gms/internal/ads/zzatx;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lcom/google/android/gms/internal/ads/zzatx;->zzb:Lcom/google/android/gms/internal/ads/zzatx;

    new-instance v2, Lcom/google/android/gms/internal/ads/zzatx;

    const-string v3, "DEVICE_IDENTIFIER_GLOBAL_ID"

    const/4 v4, 0x2

    .line 3
    invoke-direct {v2, v3, v4, v4}, Lcom/google/android/gms/internal/ads/zzatx;-><init>(Ljava/lang/String;II)V

    sput-object v2, Lcom/google/android/gms/internal/ads/zzatx;->zzc:Lcom/google/android/gms/internal/ads/zzatx;

    new-instance v3, Lcom/google/android/gms/internal/ads/zzatx;

    const-string v4, "DEVICE_IDENTIFIER_ADVERTISER_ID"

    const/4 v5, 0x3

    .line 4
    invoke-direct {v3, v4, v5, v5}, Lcom/google/android/gms/internal/ads/zzatx;-><init>(Ljava/lang/String;II)V

    sput-object v3, Lcom/google/android/gms/internal/ads/zzatx;->zzd:Lcom/google/android/gms/internal/ads/zzatx;

    new-instance v4, Lcom/google/android/gms/internal/ads/zzatx;

    const-string v5, "DEVICE_IDENTIFIER_ADVERTISER_ID_UNHASHED"

    const/4 v6, 0x4

    .line 5
    invoke-direct {v4, v5, v6, v6}, Lcom/google/android/gms/internal/ads/zzatx;-><init>(Ljava/lang/String;II)V

    sput-object v4, Lcom/google/android/gms/internal/ads/zzatx;->zze:Lcom/google/android/gms/internal/ads/zzatx;

    new-instance v5, Lcom/google/android/gms/internal/ads/zzatx;

    const-string v6, "DEVICE_IDENTIFIER_ANDROID_AD_ID"

    const/4 v7, 0x5

    .line 6
    invoke-direct {v5, v6, v7, v7}, Lcom/google/android/gms/internal/ads/zzatx;-><init>(Ljava/lang/String;II)V

    sput-object v5, Lcom/google/android/gms/internal/ads/zzatx;->zzf:Lcom/google/android/gms/internal/ads/zzatx;

    new-instance v6, Lcom/google/android/gms/internal/ads/zzatx;

    const-string v7, "DEVICE_IDENTIFIER_GFIBER_ADVERTISING_ID"

    const/4 v8, 0x6

    .line 7
    invoke-direct {v6, v7, v8, v8}, Lcom/google/android/gms/internal/ads/zzatx;-><init>(Ljava/lang/String;II)V

    sput-object v6, Lcom/google/android/gms/internal/ads/zzatx;->zzg:Lcom/google/android/gms/internal/ads/zzatx;

    new-instance v7, Lcom/google/android/gms/internal/ads/zzatx;

    const-string v8, "DEVICE_IDENTIFIER_PER_APP_ID"

    const/4 v9, 0x7

    .line 8
    invoke-direct {v7, v8, v9, v9}, Lcom/google/android/gms/internal/ads/zzatx;-><init>(Ljava/lang/String;II)V

    sput-object v7, Lcom/google/android/gms/internal/ads/zzatx;->zzh:Lcom/google/android/gms/internal/ads/zzatx;

    new-instance v8, Lcom/google/android/gms/internal/ads/zzatx;

    const-string v9, "DEVICE_IDENTIFIER_PER_APP_ID_V2"

    const/16 v10, 0x8

    .line 9
    invoke-direct {v8, v9, v10, v10}, Lcom/google/android/gms/internal/ads/zzatx;-><init>(Ljava/lang/String;II)V

    sput-object v8, Lcom/google/android/gms/internal/ads/zzatx;->zzi:Lcom/google/android/gms/internal/ads/zzatx;

    new-instance v9, Lcom/google/android/gms/internal/ads/zzatx;

    const-string v10, "DEVICE_IDENTIFIER_CONNECTED_TV_IFA"

    const/16 v11, 0x9

    .line 10
    invoke-direct {v9, v10, v11, v11}, Lcom/google/android/gms/internal/ads/zzatx;-><init>(Ljava/lang/String;II)V

    sput-object v9, Lcom/google/android/gms/internal/ads/zzatx;->zzj:Lcom/google/android/gms/internal/ads/zzatx;

    filled-new-array/range {v0 .. v9}, [Lcom/google/android/gms/internal/ads/zzatx;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/ads/zzatx;->zzl:[Lcom/google/android/gms/internal/ads/zzatx;

    new-instance v0, Lcom/google/android/gms/internal/ads/zzatv;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzatv;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ads/zzatx;->zzk:Lcom/google/android/gms/internal/ads/zzhbt;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lcom/google/android/gms/internal/ads/zzatx;->zzm:I

    return-void
.end method

.method public static values()[Lcom/google/android/gms/internal/ads/zzatx;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/ads/zzatx;->zzl:[Lcom/google/android/gms/internal/ads/zzatx;

    invoke-virtual {v0}, [Lcom/google/android/gms/internal/ads/zzatx;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/google/android/gms/internal/ads/zzatx;

    return-object v0
.end method

.method public static zzb(I)Lcom/google/android/gms/internal/ads/zzatx;
    .locals 0

    packed-switch p0, :pswitch_data_0

    const/4 p0, 0x0

    return-object p0

    :pswitch_0
    sget-object p0, Lcom/google/android/gms/internal/ads/zzatx;->zzj:Lcom/google/android/gms/internal/ads/zzatx;

    return-object p0

    :pswitch_1
    sget-object p0, Lcom/google/android/gms/internal/ads/zzatx;->zzi:Lcom/google/android/gms/internal/ads/zzatx;

    return-object p0

    :pswitch_2
    sget-object p0, Lcom/google/android/gms/internal/ads/zzatx;->zzh:Lcom/google/android/gms/internal/ads/zzatx;

    return-object p0

    :pswitch_3
    sget-object p0, Lcom/google/android/gms/internal/ads/zzatx;->zzg:Lcom/google/android/gms/internal/ads/zzatx;

    return-object p0

    :pswitch_4
    sget-object p0, Lcom/google/android/gms/internal/ads/zzatx;->zzf:Lcom/google/android/gms/internal/ads/zzatx;

    return-object p0

    :pswitch_5
    sget-object p0, Lcom/google/android/gms/internal/ads/zzatx;->zze:Lcom/google/android/gms/internal/ads/zzatx;

    return-object p0

    :pswitch_6
    sget-object p0, Lcom/google/android/gms/internal/ads/zzatx;->zzd:Lcom/google/android/gms/internal/ads/zzatx;

    return-object p0

    :pswitch_7
    sget-object p0, Lcom/google/android/gms/internal/ads/zzatx;->zzc:Lcom/google/android/gms/internal/ads/zzatx;

    return-object p0

    :pswitch_8
    sget-object p0, Lcom/google/android/gms/internal/ads/zzatx;->zzb:Lcom/google/android/gms/internal/ads/zzatx;

    return-object p0

    :pswitch_9
    sget-object p0, Lcom/google/android/gms/internal/ads/zzatx;->zza:Lcom/google/android/gms/internal/ads/zzatx;

    return-object p0

    nop

    :pswitch_data_0
    .packed-switch 0x0
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

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzatx;->zzm:I

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final zza()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzatx;->zzm:I

    return v0
.end method
