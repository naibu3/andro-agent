.class public final enum Lcom/stripe/android/paymentsheet/PaymentSheet$IconStyle;
.super Ljava/lang/Enum;
.source "PaymentSheet.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/paymentsheet/PaymentSheet;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "IconStyle"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/paymentsheet/PaymentSheet$IconStyle$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/stripe/android/paymentsheet/PaymentSheet$IconStyle;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0006\u0008\u0087\u0081\u0002\u0018\u0000 \u00062\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005\u00a8\u0006\u0007"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/PaymentSheet$IconStyle;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "Filled",
        "Outlined",
        "Companion",
        "paymentsheet_release"
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

.field private static final synthetic $VALUES:[Lcom/stripe/android/paymentsheet/PaymentSheet$IconStyle;

.field public static final Companion:Lcom/stripe/android/paymentsheet/PaymentSheet$IconStyle$Companion;

.field public static final enum Filled:Lcom/stripe/android/paymentsheet/PaymentSheet$IconStyle;

.field public static final enum Outlined:Lcom/stripe/android/paymentsheet/PaymentSheet$IconStyle;

.field private static final default:Lcom/stripe/android/paymentsheet/PaymentSheet$IconStyle;


# direct methods
.method private static final synthetic $values()[Lcom/stripe/android/paymentsheet/PaymentSheet$IconStyle;
    .locals 2

    sget-object v0, Lcom/stripe/android/paymentsheet/PaymentSheet$IconStyle;->Filled:Lcom/stripe/android/paymentsheet/PaymentSheet$IconStyle;

    sget-object v1, Lcom/stripe/android/paymentsheet/PaymentSheet$IconStyle;->Outlined:Lcom/stripe/android/paymentsheet/PaymentSheet$IconStyle;

    filled-new-array {v0, v1}, [Lcom/stripe/android/paymentsheet/PaymentSheet$IconStyle;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    .line 2386
    new-instance v0, Lcom/stripe/android/paymentsheet/PaymentSheet$IconStyle;

    const-string v1, "Filled"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/stripe/android/paymentsheet/PaymentSheet$IconStyle;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/stripe/android/paymentsheet/PaymentSheet$IconStyle;->Filled:Lcom/stripe/android/paymentsheet/PaymentSheet$IconStyle;

    .line 2391
    new-instance v1, Lcom/stripe/android/paymentsheet/PaymentSheet$IconStyle;

    const-string v2, "Outlined"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Lcom/stripe/android/paymentsheet/PaymentSheet$IconStyle;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/stripe/android/paymentsheet/PaymentSheet$IconStyle;->Outlined:Lcom/stripe/android/paymentsheet/PaymentSheet$IconStyle;

    invoke-static {}, Lcom/stripe/android/paymentsheet/PaymentSheet$IconStyle;->$values()[Lcom/stripe/android/paymentsheet/PaymentSheet$IconStyle;

    move-result-object v1

    sput-object v1, Lcom/stripe/android/paymentsheet/PaymentSheet$IconStyle;->$VALUES:[Lcom/stripe/android/paymentsheet/PaymentSheet$IconStyle;

    check-cast v1, [Ljava/lang/Enum;

    invoke-static {v1}, Lkotlin/enums/EnumEntriesKt;->enumEntries([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    move-result-object v1

    sput-object v1, Lcom/stripe/android/paymentsheet/PaymentSheet$IconStyle;->$ENTRIES:Lkotlin/enums/EnumEntries;

    new-instance v1, Lcom/stripe/android/paymentsheet/PaymentSheet$IconStyle$Companion;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lcom/stripe/android/paymentsheet/PaymentSheet$IconStyle$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v1, Lcom/stripe/android/paymentsheet/PaymentSheet$IconStyle;->Companion:Lcom/stripe/android/paymentsheet/PaymentSheet$IconStyle$Companion;

    .line 2394
    sput-object v0, Lcom/stripe/android/paymentsheet/PaymentSheet$IconStyle;->default:Lcom/stripe/android/paymentsheet/PaymentSheet$IconStyle;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 2381
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static final synthetic access$getDefault$cp()Lcom/stripe/android/paymentsheet/PaymentSheet$IconStyle;
    .locals 1

    .line 2381
    sget-object v0, Lcom/stripe/android/paymentsheet/PaymentSheet$IconStyle;->default:Lcom/stripe/android/paymentsheet/PaymentSheet$IconStyle;

    return-object v0
.end method

.method public static getEntries()Lkotlin/enums/EnumEntries;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/enums/EnumEntries<",
            "Lcom/stripe/android/paymentsheet/PaymentSheet$IconStyle;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/stripe/android/paymentsheet/PaymentSheet$IconStyle;->$ENTRIES:Lkotlin/enums/EnumEntries;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/stripe/android/paymentsheet/PaymentSheet$IconStyle;
    .locals 1

    const-class v0, Lcom/stripe/android/paymentsheet/PaymentSheet$IconStyle;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    .line 2396
    check-cast p0, Lcom/stripe/android/paymentsheet/PaymentSheet$IconStyle;

    return-object p0
.end method

.method public static values()[Lcom/stripe/android/paymentsheet/PaymentSheet$IconStyle;
    .locals 1

    sget-object v0, Lcom/stripe/android/paymentsheet/PaymentSheet$IconStyle;->$VALUES:[Lcom/stripe/android/paymentsheet/PaymentSheet$IconStyle;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    .line 2396
    check-cast v0, [Lcom/stripe/android/paymentsheet/PaymentSheet$IconStyle;

    return-object v0
.end method
