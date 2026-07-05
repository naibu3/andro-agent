.class public final Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarStateFactory;
.super Ljava/lang/Object;
.source "PaymentSheetTopBarState.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u00c1\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\t\u00a8\u0006\n"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarStateFactory;",
        "",
        "<init>",
        "()V",
        "create",
        "Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarState;",
        "isLiveMode",
        "",
        "editable",
        "Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarState$Editable;",
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
.field public static final $stable:I

.field public static final INSTANCE:Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarStateFactory;


# direct methods
.method public static synthetic $r8$lambda$1fgQFZXaMzdkUeBzzmchZJtdHb4()Lkotlin/Unit;
    .locals 1

    invoke-static {}, Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarStateFactory;->create$lambda$0()Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarStateFactory;

    invoke-direct {v0}, Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarStateFactory;-><init>()V

    sput-object v0, Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarStateFactory;->INSTANCE:Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarStateFactory;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static final create$lambda$0()Lkotlin/Unit;
    .locals 1

    .line 41
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method


# virtual methods
.method public final create(ZLcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarState$Editable;)Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarState;
    .locals 7

    const-string v0, "editable"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 36
    new-instance v0, Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarState;

    const/4 v1, 0x1

    xor-int/2addr p1, v1

    .line 38
    instance-of v2, p2, Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarState$Editable$Maybe;

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    move-object v4, p2

    check-cast v4, Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarState$Editable$Maybe;

    goto :goto_0

    :cond_0
    move-object v4, v3

    :goto_0
    const/4 v5, 0x0

    if-eqz v4, :cond_1

    invoke-virtual {v4}, Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarState$Editable$Maybe;->getCanEdit()Z

    move-result v4

    if-ne v4, v1, :cond_1

    move v4, v1

    goto :goto_1

    :cond_1
    move v4, v5

    :goto_1
    if-eqz v2, :cond_2

    .line 39
    move-object v6, p2

    check-cast v6, Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarState$Editable$Maybe;

    goto :goto_2

    :cond_2
    move-object v6, v3

    :goto_2
    if-eqz v6, :cond_3

    invoke-virtual {v6}, Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarState$Editable$Maybe;->isEditing()Z

    move-result v6

    if-ne v6, v1, :cond_3

    goto :goto_3

    :cond_3
    move v1, v5

    :goto_3
    if-eqz v2, :cond_4

    .line 40
    move-object v3, p2

    check-cast v3, Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarState$Editable$Maybe;

    :cond_4
    if-eqz v3, :cond_5

    invoke-virtual {v3}, Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarState$Editable$Maybe;->getOnEditIconPressed()Lkotlin/jvm/functions/Function0;

    move-result-object p2

    if-nez p2, :cond_6

    :cond_5
    new-instance p2, Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarStateFactory$$ExternalSyntheticLambda0;

    invoke-direct {p2}, Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarStateFactory$$ExternalSyntheticLambda0;-><init>()V

    .line 36
    :cond_6
    invoke-direct {v0, p1, v4, v1, p2}, Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarState;-><init>(ZZZLkotlin/jvm/functions/Function0;)V

    return-object v0
.end method
