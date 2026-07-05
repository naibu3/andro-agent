.class public final enum Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$CaptureMethod;
.super Ljava/lang/Enum;
.source "PaymentSheet.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "CaptureMethod"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$CaptureMethod;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0006\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$CaptureMethod;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "Automatic",
        "AutomaticAsync",
        "Manual",
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

.field private static final synthetic $VALUES:[Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$CaptureMethod;

.field public static final enum Automatic:Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$CaptureMethod;

.field public static final enum AutomaticAsync:Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$CaptureMethod;

.field public static final enum Manual:Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$CaptureMethod;


# direct methods
.method private static final synthetic $values()[Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$CaptureMethod;
    .locals 3

    sget-object v0, Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$CaptureMethod;->Automatic:Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$CaptureMethod;

    sget-object v1, Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$CaptureMethod;->AutomaticAsync:Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$CaptureMethod;

    sget-object v2, Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$CaptureMethod;->Manual:Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$CaptureMethod;

    filled-new-array {v0, v1, v2}, [Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$CaptureMethod;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    .line 603
    new-instance v0, Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$CaptureMethod;

    const-string v1, "Automatic"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$CaptureMethod;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$CaptureMethod;->Automatic:Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$CaptureMethod;

    .line 610
    new-instance v0, Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$CaptureMethod;

    const-string v1, "AutomaticAsync"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$CaptureMethod;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$CaptureMethod;->AutomaticAsync:Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$CaptureMethod;

    .line 618
    new-instance v0, Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$CaptureMethod;

    const-string v1, "Manual"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$CaptureMethod;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$CaptureMethod;->Manual:Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$CaptureMethod;

    invoke-static {}, Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$CaptureMethod;->$values()[Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$CaptureMethod;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$CaptureMethod;->$VALUES:[Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$CaptureMethod;

    check-cast v0, [Ljava/lang/Enum;

    invoke-static {v0}, Lkotlin/enums/EnumEntriesKt;->enumEntries([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$CaptureMethod;->$ENTRIES:Lkotlin/enums/EnumEntries;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 598
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static getEntries()Lkotlin/enums/EnumEntries;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/enums/EnumEntries<",
            "Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$CaptureMethod;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$CaptureMethod;->$ENTRIES:Lkotlin/enums/EnumEntries;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$CaptureMethod;
    .locals 1

    const-class v0, Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$CaptureMethod;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    .line 619
    check-cast p0, Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$CaptureMethod;

    return-object p0
.end method

.method public static values()[Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$CaptureMethod;
    .locals 1

    sget-object v0, Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$CaptureMethod;->$VALUES:[Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$CaptureMethod;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    .line 619
    check-cast v0, [Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$CaptureMethod;

    return-object v0
.end method
