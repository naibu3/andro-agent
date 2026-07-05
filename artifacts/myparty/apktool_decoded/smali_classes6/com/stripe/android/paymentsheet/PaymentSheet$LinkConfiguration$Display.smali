.class public final enum Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration$Display;
.super Ljava/lang/Enum;
.source "PaymentSheet.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "Display"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration$Display$WhenMappings;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration$Display;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0005\n\u0002\u0010\u000e\n\u0002\u0008\u0003\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R\u0014\u0010\u0006\u001a\u00020\u00078@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0008\u0010\tj\u0002\u0008\u0004j\u0002\u0008\u0005\u00a8\u0006\n"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration$Display;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "Automatic",
        "Never",
        "analyticsValue",
        "",
        "getAnalyticsValue$paymentsheet_release",
        "()Ljava/lang/String;",
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

.field private static final synthetic $VALUES:[Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration$Display;

.field public static final enum Automatic:Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration$Display;

.field public static final enum Never:Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration$Display;


# direct methods
.method private static final synthetic $values()[Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration$Display;
    .locals 2

    sget-object v0, Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration$Display;->Automatic:Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration$Display;

    sget-object v1, Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration$Display;->Never:Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration$Display;

    filled-new-array {v0, v1}, [Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration$Display;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    .line 3204
    new-instance v0, Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration$Display;

    const-string v1, "Automatic"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration$Display;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration$Display;->Automatic:Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration$Display;

    .line 3209
    new-instance v0, Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration$Display;

    const-string v1, "Never"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration$Display;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration$Display;->Never:Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration$Display;

    invoke-static {}, Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration$Display;->$values()[Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration$Display;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration$Display;->$VALUES:[Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration$Display;

    check-cast v0, [Ljava/lang/Enum;

    invoke-static {v0}, Lkotlin/enums/EnumEntriesKt;->enumEntries([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration$Display;->$ENTRIES:Lkotlin/enums/EnumEntries;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 3200
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static getEntries()Lkotlin/enums/EnumEntries;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/enums/EnumEntries<",
            "Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration$Display;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration$Display;->$ENTRIES:Lkotlin/enums/EnumEntries;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration$Display;
    .locals 1

    const-class v0, Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration$Display;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    .line 3216
    check-cast p0, Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration$Display;

    return-object p0
.end method

.method public static values()[Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration$Display;
    .locals 1

    sget-object v0, Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration$Display;->$VALUES:[Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration$Display;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    .line 3216
    check-cast v0, [Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration$Display;

    return-object v0
.end method


# virtual methods
.method public final getAnalyticsValue$paymentsheet_release()Ljava/lang/String;
    .locals 2

    .line 3212
    sget-object v0, Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration$Display$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration$Display;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    .line 3214
    const-string v0, "never"

    return-object v0

    .line 3212
    :cond_0
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    .line 3213
    :cond_1
    const-string v0, "automatic"

    return-object v0
.end method
