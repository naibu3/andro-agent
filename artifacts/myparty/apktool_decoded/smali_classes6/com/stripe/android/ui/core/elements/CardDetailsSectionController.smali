.class public final Lcom/stripe/android/ui/core/elements/CardDetailsSectionController;
.super Ljava/lang/Object;
.source "CardDetailsSectionController.kt"

# interfaces
.implements Lcom/stripe/android/uicore/elements/SectionFieldErrorController;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0005\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\t\u0012\u0008\u0008\u0002\u0010\n\u001a\u00020\u000b\u0012\u0008\u0008\u0002\u0010\u000c\u001a\u00020\r\u0012\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0004\u0008\u000f\u0010\u0010R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u0014X\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\tX\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u001bX\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001c\u0010\u001dR\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u001fX\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008!\u0010\"\u00a8\u0006#"
    }
    d2 = {
        "Lcom/stripe/android/ui/core/elements/CardDetailsSectionController;",
        "Lcom/stripe/android/uicore/elements/SectionFieldErrorController;",
        "cardAccountRangeRepositoryFactory",
        "Lcom/stripe/android/cards/CardAccountRangeRepository$Factory;",
        "initialValues",
        "",
        "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
        "",
        "collectName",
        "",
        "cbcEligibility",
        "Lcom/stripe/android/ui/core/cbc/CardBrandChoiceEligibility;",
        "cardBrandFilter",
        "Lcom/stripe/android/CardBrandFilter;",
        "elementsSessionId",
        "<init>",
        "(Lcom/stripe/android/cards/CardAccountRangeRepository$Factory;Ljava/util/Map;ZLcom/stripe/android/ui/core/cbc/CardBrandChoiceEligibility;Lcom/stripe/android/CardBrandFilter;Ljava/lang/String;)V",
        "getElementsSessionId",
        "()Ljava/lang/String;",
        "cardDetailsElement",
        "Lcom/stripe/android/ui/core/elements/CardDetailsElement;",
        "getCardDetailsElement$payments_ui_core_release",
        "()Lcom/stripe/android/ui/core/elements/CardDetailsElement;",
        "isCardScanEnabled",
        "isCardScanEnabled$payments_ui_core_release",
        "()Z",
        "isStripeCardScanAvailable",
        "Lcom/stripe/android/ui/core/DefaultIsStripeCardScanAvailable;",
        "isStripeCardScanAvailable$payments_ui_core_release",
        "()Lcom/stripe/android/ui/core/DefaultIsStripeCardScanAvailable;",
        "error",
        "Lkotlinx/coroutines/flow/StateFlow;",
        "Lcom/stripe/android/uicore/elements/FieldError;",
        "getError",
        "()Lkotlinx/coroutines/flow/StateFlow;",
        "payments-ui-core_release"
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
.field public static final $stable:I = 0x8


# instance fields
.field private final cardDetailsElement:Lcom/stripe/android/ui/core/elements/CardDetailsElement;

.field private final elementsSessionId:Ljava/lang/String;

.field private final error:Lkotlinx/coroutines/flow/StateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Lcom/stripe/android/uicore/elements/FieldError;",
            ">;"
        }
    .end annotation
.end field

.field private final isCardScanEnabled:Z

.field private final isStripeCardScanAvailable:Lcom/stripe/android/ui/core/DefaultIsStripeCardScanAvailable;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/cards/CardAccountRangeRepository$Factory;Ljava/util/Map;ZLcom/stripe/android/ui/core/cbc/CardBrandChoiceEligibility;Lcom/stripe/android/CardBrandFilter;Ljava/lang/String;)V
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/cards/CardAccountRangeRepository$Factory;",
            "Ljava/util/Map<",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
            "Ljava/lang/String;",
            ">;Z",
            "Lcom/stripe/android/ui/core/cbc/CardBrandChoiceEligibility;",
            "Lcom/stripe/android/CardBrandFilter;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    const-string v0, "cardAccountRangeRepositoryFactory"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "initialValues"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cbcEligibility"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cardBrandFilter"

    move-object/from16 v7, p5

    invoke-static {v7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    move-object/from16 v0, p6

    .line 19
    iput-object v0, p0, Lcom/stripe/android/ui/core/elements/CardDetailsSectionController;->elementsSessionId:Ljava/lang/String;

    .line 22
    new-instance v1, Lcom/stripe/android/ui/core/elements/CardDetailsElement;

    .line 23
    sget-object v0, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;

    const-string v2, "card_detail"

    invoke-virtual {v0, v2}, Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;->Generic(Ljava/lang/String;)Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v2

    const/16 v9, 0x40

    const/4 v10, 0x0

    const/4 v8, 0x0

    move-object v3, p1

    move-object v4, p2

    move v5, p3

    move-object v6, p4

    .line 22
    invoke-direct/range {v1 .. v10}, Lcom/stripe/android/ui/core/elements/CardDetailsElement;-><init>(Lcom/stripe/android/uicore/elements/IdentifierSpec;Lcom/stripe/android/cards/CardAccountRangeRepository$Factory;Ljava/util/Map;ZLcom/stripe/android/ui/core/cbc/CardBrandChoiceEligibility;Lcom/stripe/android/CardBrandFilter;Lcom/stripe/android/ui/core/elements/CardDetailsController;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v1, p0, Lcom/stripe/android/ui/core/elements/CardDetailsSectionController;->cardDetailsElement:Lcom/stripe/android/ui/core/elements/CardDetailsElement;

    .line 31
    invoke-virtual {v1}, Lcom/stripe/android/ui/core/elements/CardDetailsElement;->isCardScanEnabled()Z

    move-result p1

    iput-boolean p1, p0, Lcom/stripe/android/ui/core/elements/CardDetailsSectionController;->isCardScanEnabled:Z

    .line 32
    new-instance p1, Lcom/stripe/android/ui/core/DefaultIsStripeCardScanAvailable;

    invoke-direct {p1}, Lcom/stripe/android/ui/core/DefaultIsStripeCardScanAvailable;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/ui/core/elements/CardDetailsSectionController;->isStripeCardScanAvailable:Lcom/stripe/android/ui/core/DefaultIsStripeCardScanAvailable;

    .line 34
    invoke-virtual {v1}, Lcom/stripe/android/ui/core/elements/CardDetailsElement;->getController()Lcom/stripe/android/ui/core/elements/CardDetailsController;

    move-result-object p1

    invoke-virtual {p1}, Lcom/stripe/android/ui/core/elements/CardDetailsController;->getError()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/ui/core/elements/CardDetailsSectionController;->error:Lkotlinx/coroutines/flow/StateFlow;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/stripe/android/cards/CardAccountRangeRepository$Factory;Ljava/util/Map;ZLcom/stripe/android/ui/core/cbc/CardBrandChoiceEligibility;Lcom/stripe/android/CardBrandFilter;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 7

    and-int/lit8 p8, p7, 0x4

    if-eqz p8, :cond_0

    const/4 p3, 0x0

    :cond_0
    move v3, p3

    and-int/lit8 p3, p7, 0x8

    if-eqz p3, :cond_1

    .line 17
    sget-object p3, Lcom/stripe/android/ui/core/cbc/CardBrandChoiceEligibility$Ineligible;->INSTANCE:Lcom/stripe/android/ui/core/cbc/CardBrandChoiceEligibility$Ineligible;

    move-object p4, p3

    check-cast p4, Lcom/stripe/android/ui/core/cbc/CardBrandChoiceEligibility;

    :cond_1
    move-object v4, p4

    and-int/lit8 p3, p7, 0x10

    if-eqz p3, :cond_2

    .line 18
    sget-object p3, Lcom/stripe/android/DefaultCardBrandFilter;->INSTANCE:Lcom/stripe/android/DefaultCardBrandFilter;

    move-object p5, p3

    check-cast p5, Lcom/stripe/android/CardBrandFilter;

    :cond_2
    move-object v5, p5

    and-int/lit8 p3, p7, 0x20

    if-eqz p3, :cond_3

    const/4 p6, 0x0

    :cond_3
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v6, p6

    .line 13
    invoke-direct/range {v0 .. v6}, Lcom/stripe/android/ui/core/elements/CardDetailsSectionController;-><init>(Lcom/stripe/android/cards/CardAccountRangeRepository$Factory;Ljava/util/Map;ZLcom/stripe/android/ui/core/cbc/CardBrandChoiceEligibility;Lcom/stripe/android/CardBrandFilter;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final getCardDetailsElement$payments_ui_core_release()Lcom/stripe/android/ui/core/elements/CardDetailsElement;
    .locals 1

    .line 22
    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/CardDetailsSectionController;->cardDetailsElement:Lcom/stripe/android/ui/core/elements/CardDetailsElement;

    return-object v0
.end method

.method public final getElementsSessionId()Ljava/lang/String;
    .locals 1

    .line 19
    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/CardDetailsSectionController;->elementsSessionId:Ljava/lang/String;

    return-object v0
.end method

.method public getError()Lkotlinx/coroutines/flow/StateFlow;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Lcom/stripe/android/uicore/elements/FieldError;",
            ">;"
        }
    .end annotation

    .line 34
    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/CardDetailsSectionController;->error:Lkotlinx/coroutines/flow/StateFlow;

    return-object v0
.end method

.method public final isCardScanEnabled$payments_ui_core_release()Z
    .locals 1

    .line 31
    iget-boolean v0, p0, Lcom/stripe/android/ui/core/elements/CardDetailsSectionController;->isCardScanEnabled:Z

    return v0
.end method

.method public final isStripeCardScanAvailable$payments_ui_core_release()Lcom/stripe/android/ui/core/DefaultIsStripeCardScanAvailable;
    .locals 1

    .line 32
    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/CardDetailsSectionController;->isStripeCardScanAvailable:Lcom/stripe/android/ui/core/DefaultIsStripeCardScanAvailable;

    return-object v0
.end method
