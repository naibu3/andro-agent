.class public final enum Lcom/google/android/gms/internal/ads/zzhgm;
.super Ljava/lang/Enum;
.source "com.google.android.gms:play-services-ads@@23.2.0"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzhbs;


# static fields
.field public static final enum zza:Lcom/google/android/gms/internal/ads/zzhgm;

.field public static final enum zzb:Lcom/google/android/gms/internal/ads/zzhgm;

.field public static final enum zzc:Lcom/google/android/gms/internal/ads/zzhgm;

.field public static final enum zzd:Lcom/google/android/gms/internal/ads/zzhgm;

.field public static final enum zze:Lcom/google/android/gms/internal/ads/zzhgm;

.field public static final enum zzf:Lcom/google/android/gms/internal/ads/zzhgm;

.field public static final enum zzg:Lcom/google/android/gms/internal/ads/zzhgm;

.field public static final enum zzh:Lcom/google/android/gms/internal/ads/zzhgm;

.field public static final enum zzi:Lcom/google/android/gms/internal/ads/zzhgm;

.field public static final enum zzj:Lcom/google/android/gms/internal/ads/zzhgm;

.field public static final enum zzk:Lcom/google/android/gms/internal/ads/zzhgm;

.field public static final enum zzl:Lcom/google/android/gms/internal/ads/zzhgm;

.field public static final enum zzm:Lcom/google/android/gms/internal/ads/zzhgm;

.field private static final zzn:Lcom/google/android/gms/internal/ads/zzhbt;

.field private static final synthetic zzo:[Lcom/google/android/gms/internal/ads/zzhgm;


# instance fields
.field private final zzp:I


# direct methods
.method static constructor <clinit>()V
    .locals 15

    new-instance v0, Lcom/google/android/gms/internal/ads/zzhgm;

    const-string v1, "SAFE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lcom/google/android/gms/internal/ads/zzhgm;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/google/android/gms/internal/ads/zzhgm;->zza:Lcom/google/android/gms/internal/ads/zzhgm;

    new-instance v1, Lcom/google/android/gms/internal/ads/zzhgm;

    const-string v2, "DANGEROUS"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3, v3}, Lcom/google/android/gms/internal/ads/zzhgm;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lcom/google/android/gms/internal/ads/zzhgm;->zzb:Lcom/google/android/gms/internal/ads/zzhgm;

    new-instance v2, Lcom/google/android/gms/internal/ads/zzhgm;

    const-string v3, "UNCOMMON"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4, v4}, Lcom/google/android/gms/internal/ads/zzhgm;-><init>(Ljava/lang/String;II)V

    sput-object v2, Lcom/google/android/gms/internal/ads/zzhgm;->zzc:Lcom/google/android/gms/internal/ads/zzhgm;

    new-instance v3, Lcom/google/android/gms/internal/ads/zzhgm;

    const-string v4, "POTENTIALLY_UNWANTED"

    const/4 v5, 0x3

    invoke-direct {v3, v4, v5, v5}, Lcom/google/android/gms/internal/ads/zzhgm;-><init>(Ljava/lang/String;II)V

    sput-object v3, Lcom/google/android/gms/internal/ads/zzhgm;->zzd:Lcom/google/android/gms/internal/ads/zzhgm;

    new-instance v4, Lcom/google/android/gms/internal/ads/zzhgm;

    const-string v5, "DANGEROUS_HOST"

    const/4 v6, 0x4

    invoke-direct {v4, v5, v6, v6}, Lcom/google/android/gms/internal/ads/zzhgm;-><init>(Ljava/lang/String;II)V

    sput-object v4, Lcom/google/android/gms/internal/ads/zzhgm;->zze:Lcom/google/android/gms/internal/ads/zzhgm;

    new-instance v5, Lcom/google/android/gms/internal/ads/zzhgm;

    const-string v6, "UNKNOWN"

    const/4 v7, 0x5

    invoke-direct {v5, v6, v7, v7}, Lcom/google/android/gms/internal/ads/zzhgm;-><init>(Ljava/lang/String;II)V

    sput-object v5, Lcom/google/android/gms/internal/ads/zzhgm;->zzf:Lcom/google/android/gms/internal/ads/zzhgm;

    new-instance v6, Lcom/google/android/gms/internal/ads/zzhgm;

    const-string v7, "PLAY_POLICY_VIOLATION_SEVERE"

    const/4 v8, 0x6

    invoke-direct {v6, v7, v8, v8}, Lcom/google/android/gms/internal/ads/zzhgm;-><init>(Ljava/lang/String;II)V

    sput-object v6, Lcom/google/android/gms/internal/ads/zzhgm;->zzg:Lcom/google/android/gms/internal/ads/zzhgm;

    new-instance v7, Lcom/google/android/gms/internal/ads/zzhgm;

    const-string v8, "PLAY_POLICY_VIOLATION_OTHER"

    const/4 v9, 0x7

    invoke-direct {v7, v8, v9, v9}, Lcom/google/android/gms/internal/ads/zzhgm;-><init>(Ljava/lang/String;II)V

    sput-object v7, Lcom/google/android/gms/internal/ads/zzhgm;->zzh:Lcom/google/android/gms/internal/ads/zzhgm;

    new-instance v8, Lcom/google/android/gms/internal/ads/zzhgm;

    const-string v9, "DANGEROUS_ACCOUNT_COMPROMISE"

    const/16 v10, 0x8

    invoke-direct {v8, v9, v10, v10}, Lcom/google/android/gms/internal/ads/zzhgm;-><init>(Ljava/lang/String;II)V

    sput-object v8, Lcom/google/android/gms/internal/ads/zzhgm;->zzi:Lcom/google/android/gms/internal/ads/zzhgm;

    new-instance v9, Lcom/google/android/gms/internal/ads/zzhgm;

    const-string v10, "PENDING"

    const/16 v11, 0x9

    invoke-direct {v9, v10, v11, v11}, Lcom/google/android/gms/internal/ads/zzhgm;-><init>(Ljava/lang/String;II)V

    sput-object v9, Lcom/google/android/gms/internal/ads/zzhgm;->zzj:Lcom/google/android/gms/internal/ads/zzhgm;

    new-instance v10, Lcom/google/android/gms/internal/ads/zzhgm;

    const-string v11, "PLAY_POLICY_VIOLATION_TREATMENT_ON_DEVICE"

    const/16 v12, 0xa

    invoke-direct {v10, v11, v12, v12}, Lcom/google/android/gms/internal/ads/zzhgm;-><init>(Ljava/lang/String;II)V

    sput-object v10, Lcom/google/android/gms/internal/ads/zzhgm;->zzk:Lcom/google/android/gms/internal/ads/zzhgm;

    new-instance v11, Lcom/google/android/gms/internal/ads/zzhgm;

    const-string v12, "HIGH_RISK_BLOCK"

    const/16 v13, 0xb

    invoke-direct {v11, v12, v13, v13}, Lcom/google/android/gms/internal/ads/zzhgm;-><init>(Ljava/lang/String;II)V

    sput-object v11, Lcom/google/android/gms/internal/ads/zzhgm;->zzl:Lcom/google/android/gms/internal/ads/zzhgm;

    new-instance v12, Lcom/google/android/gms/internal/ads/zzhgm;

    const-string v13, "HIGH_RISK_WARN"

    const/16 v14, 0xc

    invoke-direct {v12, v13, v14, v14}, Lcom/google/android/gms/internal/ads/zzhgm;-><init>(Ljava/lang/String;II)V

    sput-object v12, Lcom/google/android/gms/internal/ads/zzhgm;->zzm:Lcom/google/android/gms/internal/ads/zzhgm;

    filled-new-array/range {v0 .. v12}, [Lcom/google/android/gms/internal/ads/zzhgm;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/ads/zzhgm;->zzo:[Lcom/google/android/gms/internal/ads/zzhgm;

    new-instance v0, Lcom/google/android/gms/internal/ads/zzhgk;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzhgk;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ads/zzhgm;->zzn:Lcom/google/android/gms/internal/ads/zzhbt;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lcom/google/android/gms/internal/ads/zzhgm;->zzp:I

    return-void
.end method

.method public static values()[Lcom/google/android/gms/internal/ads/zzhgm;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/ads/zzhgm;->zzo:[Lcom/google/android/gms/internal/ads/zzhgm;

    invoke-virtual {v0}, [Lcom/google/android/gms/internal/ads/zzhgm;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/google/android/gms/internal/ads/zzhgm;

    return-object v0
.end method

.method public static zzb(I)Lcom/google/android/gms/internal/ads/zzhgm;
    .locals 0

    packed-switch p0, :pswitch_data_0

    const/4 p0, 0x0

    return-object p0

    :pswitch_0
    sget-object p0, Lcom/google/android/gms/internal/ads/zzhgm;->zzm:Lcom/google/android/gms/internal/ads/zzhgm;

    return-object p0

    :pswitch_1
    sget-object p0, Lcom/google/android/gms/internal/ads/zzhgm;->zzl:Lcom/google/android/gms/internal/ads/zzhgm;

    return-object p0

    :pswitch_2
    sget-object p0, Lcom/google/android/gms/internal/ads/zzhgm;->zzk:Lcom/google/android/gms/internal/ads/zzhgm;

    return-object p0

    :pswitch_3
    sget-object p0, Lcom/google/android/gms/internal/ads/zzhgm;->zzj:Lcom/google/android/gms/internal/ads/zzhgm;

    return-object p0

    :pswitch_4
    sget-object p0, Lcom/google/android/gms/internal/ads/zzhgm;->zzi:Lcom/google/android/gms/internal/ads/zzhgm;

    return-object p0

    :pswitch_5
    sget-object p0, Lcom/google/android/gms/internal/ads/zzhgm;->zzh:Lcom/google/android/gms/internal/ads/zzhgm;

    return-object p0

    :pswitch_6
    sget-object p0, Lcom/google/android/gms/internal/ads/zzhgm;->zzg:Lcom/google/android/gms/internal/ads/zzhgm;

    return-object p0

    :pswitch_7
    sget-object p0, Lcom/google/android/gms/internal/ads/zzhgm;->zzf:Lcom/google/android/gms/internal/ads/zzhgm;

    return-object p0

    :pswitch_8
    sget-object p0, Lcom/google/android/gms/internal/ads/zzhgm;->zze:Lcom/google/android/gms/internal/ads/zzhgm;

    return-object p0

    :pswitch_9
    sget-object p0, Lcom/google/android/gms/internal/ads/zzhgm;->zzd:Lcom/google/android/gms/internal/ads/zzhgm;

    return-object p0

    :pswitch_a
    sget-object p0, Lcom/google/android/gms/internal/ads/zzhgm;->zzc:Lcom/google/android/gms/internal/ads/zzhgm;

    return-object p0

    :pswitch_b
    sget-object p0, Lcom/google/android/gms/internal/ads/zzhgm;->zzb:Lcom/google/android/gms/internal/ads/zzhgm;

    return-object p0

    :pswitch_c
    sget-object p0, Lcom/google/android/gms/internal/ads/zzhgm;->zza:Lcom/google/android/gms/internal/ads/zzhgm;

    return-object p0

    :pswitch_data_0
    .packed-switch 0x0
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

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzhgm;->zzp:I

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final zza()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzhgm;->zzp:I

    return v0
.end method
