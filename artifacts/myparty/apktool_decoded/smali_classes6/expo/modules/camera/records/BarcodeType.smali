.class public final enum Lexpo/modules/camera/records/BarcodeType;
.super Ljava/lang/Enum;
.source "CameraRecords.kt"

# interfaces
.implements Lexpo/modules/kotlin/types/Enumerable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lexpo/modules/camera/records/BarcodeType$Companion;,
        Lexpo/modules/camera/records/BarcodeType$WhenMappings;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lexpo/modules/camera/records/BarcodeType;",
        ">;",
        "Lexpo/modules/kotlin/types/Enumerable;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0011\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0086\u0081\u0002\u0018\u0000 \u00172\u00020\u00012\u0008\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0017B\u0011\u0008\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0006\u0010\u0015\u001a\u00020\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000j\u0002\u0008\u0007j\u0002\u0008\u0008j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000bj\u0002\u0008\u000cj\u0002\u0008\rj\u0002\u0008\u000ej\u0002\u0008\u000fj\u0002\u0008\u0010j\u0002\u0008\u0011j\u0002\u0008\u0012j\u0002\u0008\u0013j\u0002\u0008\u0014\u00a8\u0006\u0018"
    }
    d2 = {
        "Lexpo/modules/camera/records/BarcodeType;",
        "Lexpo/modules/kotlin/types/Enumerable;",
        "",
        "value",
        "",
        "<init>",
        "(Ljava/lang/String;ILjava/lang/String;)V",
        "AZTEC",
        "EAN13",
        "EAN8",
        "QR",
        "PDF417",
        "UPCE",
        "DATAMATRIX",
        "CODE39",
        "CODE93",
        "ITF14",
        "CODABAR",
        "CODE128",
        "UPCA",
        "UNKNOWN",
        "mapToBarcode",
        "",
        "Companion",
        "expo-camera_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lkotlin/enums/EnumEntries;

.field private static final synthetic $VALUES:[Lexpo/modules/camera/records/BarcodeType;

.field public static final enum AZTEC:Lexpo/modules/camera/records/BarcodeType;

.field public static final enum CODABAR:Lexpo/modules/camera/records/BarcodeType;

.field public static final enum CODE128:Lexpo/modules/camera/records/BarcodeType;

.field public static final enum CODE39:Lexpo/modules/camera/records/BarcodeType;

.field public static final enum CODE93:Lexpo/modules/camera/records/BarcodeType;

.field public static final Companion:Lexpo/modules/camera/records/BarcodeType$Companion;

.field public static final enum DATAMATRIX:Lexpo/modules/camera/records/BarcodeType;

.field public static final enum EAN13:Lexpo/modules/camera/records/BarcodeType;

.field public static final enum EAN8:Lexpo/modules/camera/records/BarcodeType;

.field public static final enum ITF14:Lexpo/modules/camera/records/BarcodeType;

.field public static final enum PDF417:Lexpo/modules/camera/records/BarcodeType;

.field public static final enum QR:Lexpo/modules/camera/records/BarcodeType;

.field public static final enum UNKNOWN:Lexpo/modules/camera/records/BarcodeType;

.field public static final enum UPCA:Lexpo/modules/camera/records/BarcodeType;

.field public static final enum UPCE:Lexpo/modules/camera/records/BarcodeType;


# instance fields
.field private final value:Ljava/lang/String;


# direct methods
.method private static final synthetic $values()[Lexpo/modules/camera/records/BarcodeType;
    .locals 14

    sget-object v0, Lexpo/modules/camera/records/BarcodeType;->AZTEC:Lexpo/modules/camera/records/BarcodeType;

    sget-object v1, Lexpo/modules/camera/records/BarcodeType;->EAN13:Lexpo/modules/camera/records/BarcodeType;

    sget-object v2, Lexpo/modules/camera/records/BarcodeType;->EAN8:Lexpo/modules/camera/records/BarcodeType;

    sget-object v3, Lexpo/modules/camera/records/BarcodeType;->QR:Lexpo/modules/camera/records/BarcodeType;

    sget-object v4, Lexpo/modules/camera/records/BarcodeType;->PDF417:Lexpo/modules/camera/records/BarcodeType;

    sget-object v5, Lexpo/modules/camera/records/BarcodeType;->UPCE:Lexpo/modules/camera/records/BarcodeType;

    sget-object v6, Lexpo/modules/camera/records/BarcodeType;->DATAMATRIX:Lexpo/modules/camera/records/BarcodeType;

    sget-object v7, Lexpo/modules/camera/records/BarcodeType;->CODE39:Lexpo/modules/camera/records/BarcodeType;

    sget-object v8, Lexpo/modules/camera/records/BarcodeType;->CODE93:Lexpo/modules/camera/records/BarcodeType;

    sget-object v9, Lexpo/modules/camera/records/BarcodeType;->ITF14:Lexpo/modules/camera/records/BarcodeType;

    sget-object v10, Lexpo/modules/camera/records/BarcodeType;->CODABAR:Lexpo/modules/camera/records/BarcodeType;

    sget-object v11, Lexpo/modules/camera/records/BarcodeType;->CODE128:Lexpo/modules/camera/records/BarcodeType;

    sget-object v12, Lexpo/modules/camera/records/BarcodeType;->UPCA:Lexpo/modules/camera/records/BarcodeType;

    sget-object v13, Lexpo/modules/camera/records/BarcodeType;->UNKNOWN:Lexpo/modules/camera/records/BarcodeType;

    filled-new-array/range {v0 .. v13}, [Lexpo/modules/camera/records/BarcodeType;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    .line 77
    new-instance v0, Lexpo/modules/camera/records/BarcodeType;

    const/4 v1, 0x0

    const-string v2, "aztec"

    const-string v3, "AZTEC"

    invoke-direct {v0, v3, v1, v2}, Lexpo/modules/camera/records/BarcodeType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lexpo/modules/camera/records/BarcodeType;->AZTEC:Lexpo/modules/camera/records/BarcodeType;

    .line 78
    new-instance v0, Lexpo/modules/camera/records/BarcodeType;

    const/4 v1, 0x1

    const-string v2, "ean13"

    const-string v3, "EAN13"

    invoke-direct {v0, v3, v1, v2}, Lexpo/modules/camera/records/BarcodeType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lexpo/modules/camera/records/BarcodeType;->EAN13:Lexpo/modules/camera/records/BarcodeType;

    .line 79
    new-instance v0, Lexpo/modules/camera/records/BarcodeType;

    const/4 v1, 0x2

    const-string v2, "ean8"

    const-string v3, "EAN8"

    invoke-direct {v0, v3, v1, v2}, Lexpo/modules/camera/records/BarcodeType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lexpo/modules/camera/records/BarcodeType;->EAN8:Lexpo/modules/camera/records/BarcodeType;

    .line 80
    new-instance v0, Lexpo/modules/camera/records/BarcodeType;

    const/4 v1, 0x3

    const-string v2, "qr"

    const-string v3, "QR"

    invoke-direct {v0, v3, v1, v2}, Lexpo/modules/camera/records/BarcodeType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lexpo/modules/camera/records/BarcodeType;->QR:Lexpo/modules/camera/records/BarcodeType;

    .line 81
    new-instance v0, Lexpo/modules/camera/records/BarcodeType;

    const/4 v1, 0x4

    const-string v2, "pdf417"

    const-string v3, "PDF417"

    invoke-direct {v0, v3, v1, v2}, Lexpo/modules/camera/records/BarcodeType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lexpo/modules/camera/records/BarcodeType;->PDF417:Lexpo/modules/camera/records/BarcodeType;

    .line 82
    new-instance v0, Lexpo/modules/camera/records/BarcodeType;

    const/4 v1, 0x5

    const-string v2, "upc_e"

    const-string v3, "UPCE"

    invoke-direct {v0, v3, v1, v2}, Lexpo/modules/camera/records/BarcodeType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lexpo/modules/camera/records/BarcodeType;->UPCE:Lexpo/modules/camera/records/BarcodeType;

    .line 83
    new-instance v0, Lexpo/modules/camera/records/BarcodeType;

    const/4 v1, 0x6

    const-string v2, "datamatrix"

    const-string v3, "DATAMATRIX"

    invoke-direct {v0, v3, v1, v2}, Lexpo/modules/camera/records/BarcodeType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lexpo/modules/camera/records/BarcodeType;->DATAMATRIX:Lexpo/modules/camera/records/BarcodeType;

    .line 84
    new-instance v0, Lexpo/modules/camera/records/BarcodeType;

    const/4 v1, 0x7

    const-string v2, "code39"

    const-string v3, "CODE39"

    invoke-direct {v0, v3, v1, v2}, Lexpo/modules/camera/records/BarcodeType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lexpo/modules/camera/records/BarcodeType;->CODE39:Lexpo/modules/camera/records/BarcodeType;

    .line 85
    new-instance v0, Lexpo/modules/camera/records/BarcodeType;

    const/16 v1, 0x8

    const-string v2, "code93"

    const-string v3, "CODE93"

    invoke-direct {v0, v3, v1, v2}, Lexpo/modules/camera/records/BarcodeType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lexpo/modules/camera/records/BarcodeType;->CODE93:Lexpo/modules/camera/records/BarcodeType;

    .line 86
    new-instance v0, Lexpo/modules/camera/records/BarcodeType;

    const/16 v1, 0x9

    const-string v2, "itf14"

    const-string v3, "ITF14"

    invoke-direct {v0, v3, v1, v2}, Lexpo/modules/camera/records/BarcodeType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lexpo/modules/camera/records/BarcodeType;->ITF14:Lexpo/modules/camera/records/BarcodeType;

    .line 87
    new-instance v0, Lexpo/modules/camera/records/BarcodeType;

    const/16 v1, 0xa

    const-string v2, "codabar"

    const-string v3, "CODABAR"

    invoke-direct {v0, v3, v1, v2}, Lexpo/modules/camera/records/BarcodeType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lexpo/modules/camera/records/BarcodeType;->CODABAR:Lexpo/modules/camera/records/BarcodeType;

    .line 88
    new-instance v0, Lexpo/modules/camera/records/BarcodeType;

    const/16 v1, 0xb

    const-string v2, "code128"

    const-string v3, "CODE128"

    invoke-direct {v0, v3, v1, v2}, Lexpo/modules/camera/records/BarcodeType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lexpo/modules/camera/records/BarcodeType;->CODE128:Lexpo/modules/camera/records/BarcodeType;

    .line 89
    new-instance v0, Lexpo/modules/camera/records/BarcodeType;

    const/16 v1, 0xc

    const-string v2, "upc_a"

    const-string v3, "UPCA"

    invoke-direct {v0, v3, v1, v2}, Lexpo/modules/camera/records/BarcodeType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lexpo/modules/camera/records/BarcodeType;->UPCA:Lexpo/modules/camera/records/BarcodeType;

    .line 90
    new-instance v0, Lexpo/modules/camera/records/BarcodeType;

    const/16 v1, 0xd

    const-string v2, "unknown"

    const-string v3, "UNKNOWN"

    invoke-direct {v0, v3, v1, v2}, Lexpo/modules/camera/records/BarcodeType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lexpo/modules/camera/records/BarcodeType;->UNKNOWN:Lexpo/modules/camera/records/BarcodeType;

    invoke-static {}, Lexpo/modules/camera/records/BarcodeType;->$values()[Lexpo/modules/camera/records/BarcodeType;

    move-result-object v0

    sput-object v0, Lexpo/modules/camera/records/BarcodeType;->$VALUES:[Lexpo/modules/camera/records/BarcodeType;

    check-cast v0, [Ljava/lang/Enum;

    invoke-static {v0}, Lkotlin/enums/EnumEntriesKt;->enumEntries([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    move-result-object v0

    sput-object v0, Lexpo/modules/camera/records/BarcodeType;->$ENTRIES:Lkotlin/enums/EnumEntries;

    new-instance v0, Lexpo/modules/camera/records/BarcodeType$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lexpo/modules/camera/records/BarcodeType$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lexpo/modules/camera/records/BarcodeType;->Companion:Lexpo/modules/camera/records/BarcodeType$Companion;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 76
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lexpo/modules/camera/records/BarcodeType;->value:Ljava/lang/String;

    return-void
.end method

.method public static final synthetic access$getValue$p(Lexpo/modules/camera/records/BarcodeType;)Ljava/lang/String;
    .locals 0

    .line 76
    iget-object p0, p0, Lexpo/modules/camera/records/BarcodeType;->value:Ljava/lang/String;

    return-object p0
.end method

.method public static getEntries()Lkotlin/enums/EnumEntries;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/enums/EnumEntries<",
            "Lexpo/modules/camera/records/BarcodeType;",
            ">;"
        }
    .end annotation

    sget-object v0, Lexpo/modules/camera/records/BarcodeType;->$ENTRIES:Lkotlin/enums/EnumEntries;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lexpo/modules/camera/records/BarcodeType;
    .locals 1

    const-class v0, Lexpo/modules/camera/records/BarcodeType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    .line 131
    check-cast p0, Lexpo/modules/camera/records/BarcodeType;

    return-object p0
.end method

.method public static values()[Lexpo/modules/camera/records/BarcodeType;
    .locals 1

    sget-object v0, Lexpo/modules/camera/records/BarcodeType;->$VALUES:[Lexpo/modules/camera/records/BarcodeType;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    .line 131
    check-cast v0, [Lexpo/modules/camera/records/BarcodeType;

    return-object v0
.end method


# virtual methods
.method public final mapToBarcode()I
    .locals 2

    .line 92
    sget-object v0, Lexpo/modules/camera/records/BarcodeType$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {p0}, Lexpo/modules/camera/records/BarcodeType;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :pswitch_0
    const/4 v0, -0x1

    return v0

    :pswitch_1
    const/16 v0, 0x200

    return v0

    :pswitch_2
    const/4 v0, 0x1

    return v0

    :pswitch_3
    const/16 v0, 0x8

    return v0

    :pswitch_4
    const/16 v0, 0x80

    return v0

    :pswitch_5
    const/4 v0, 0x4

    return v0

    :pswitch_6
    const/4 v0, 0x2

    return v0

    :pswitch_7
    const/16 v0, 0x10

    return v0

    :pswitch_8
    const/16 v0, 0x400

    return v0

    :pswitch_9
    const/16 v0, 0x800

    return v0

    :pswitch_a
    const/16 v0, 0x100

    return v0

    :pswitch_b
    const/16 v0, 0x40

    return v0

    :pswitch_c
    const/16 v0, 0x20

    return v0

    :pswitch_d
    const/16 v0, 0x1000

    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x1
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
