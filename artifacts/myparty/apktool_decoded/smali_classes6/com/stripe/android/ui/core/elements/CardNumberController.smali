.class public abstract Lcom/stripe/android/ui/core/elements/CardNumberController;
.super Ljava/lang/Object;
.source "CardNumberController.kt"

# interfaces
.implements Lcom/stripe/android/uicore/elements/TextFieldController;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00081\u0018\u00002\u00020\u0001B\t\u0008\u0004\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017R\u0018\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0007\u0010\u0008R\u0018\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\n\u0010\u0008R\u0012\u0010\u000b\u001a\u00020\u000cX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0096\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008\u0011\u0010\u0003\u001a\u0004\u0008\u0012\u0010\u0013\u0082\u0001\u0001\u0018\u00a8\u0006\u0019"
    }
    d2 = {
        "Lcom/stripe/android/ui/core/elements/CardNumberController;",
        "Lcom/stripe/android/uicore/elements/TextFieldController;",
        "<init>",
        "()V",
        "cardBrandFlow",
        "Lkotlinx/coroutines/flow/StateFlow;",
        "Lcom/stripe/android/model/CardBrand;",
        "getCardBrandFlow",
        "()Lkotlinx/coroutines/flow/StateFlow;",
        "selectedCardBrandFlow",
        "getSelectedCardBrandFlow",
        "cardScanEnabled",
        "",
        "getCardScanEnabled",
        "()Z",
        "autofillType",
        "Landroidx/compose/ui/autofill/AutofillType;",
        "getAutofillType$annotations",
        "getAutofillType",
        "()Landroidx/compose/ui/autofill/AutofillType;",
        "onCardScanResult",
        "",
        "cardScanSheetResult",
        "Lcom/stripe/android/stripecardscan/cardscan/CardScanSheetResult;",
        "Lcom/stripe/android/ui/core/elements/DefaultCardNumberController;",
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
.field public static final $stable:I


# instance fields
.field private final autofillType:Landroidx/compose/ui/autofill/AutofillType;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .line 54
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 62
    sget-object v0, Landroidx/compose/ui/autofill/AutofillType;->CreditCardNumber:Landroidx/compose/ui/autofill/AutofillType;

    iput-object v0, p0, Lcom/stripe/android/ui/core/elements/CardNumberController;->autofillType:Landroidx/compose/ui/autofill/AutofillType;

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lcom/stripe/android/ui/core/elements/CardNumberController;-><init>()V

    return-void
.end method

.method public static synthetic getAutofillType$annotations()V
    .locals 0

    return-void
.end method


# virtual methods
.method public ComposeUI(ZLcom/stripe/android/uicore/elements/SectionFieldElement;Landroidx/compose/ui/Modifier;Ljava/util/Set;Lcom/stripe/android/uicore/elements/IdentifierSpec;Landroidx/compose/runtime/Composer;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lcom/stripe/android/uicore/elements/SectionFieldElement;",
            "Landroidx/compose/ui/Modifier;",
            "Ljava/util/Set<",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
            ">;",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    .line 54
    invoke-static/range {p0 .. p7}, Lcom/stripe/android/uicore/elements/TextFieldController$DefaultImpls;->ComposeUI(Lcom/stripe/android/uicore/elements/TextFieldController;ZLcom/stripe/android/uicore/elements/SectionFieldElement;Landroidx/compose/ui/Modifier;Ljava/util/Set;Lcom/stripe/android/uicore/elements/IdentifierSpec;Landroidx/compose/runtime/Composer;I)V

    return-void
.end method

.method public getAutofillType()Landroidx/compose/ui/autofill/AutofillType;
    .locals 1

    .line 61
    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/CardNumberController;->autofillType:Landroidx/compose/ui/autofill/AutofillType;

    return-object v0
.end method

.method public abstract getCardBrandFlow()Lkotlinx/coroutines/flow/StateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Lcom/stripe/android/model/CardBrand;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getCardScanEnabled()Z
.end method

.method public getEnabled()Z
    .locals 1

    .line 54
    invoke-static {p0}, Lcom/stripe/android/uicore/elements/TextFieldController$DefaultImpls;->getEnabled(Lcom/stripe/android/uicore/elements/TextFieldController;)Z

    move-result v0

    return v0
.end method

.method public getPlaceHolder()Lkotlinx/coroutines/flow/StateFlow;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 54
    invoke-static {p0}, Lcom/stripe/android/uicore/elements/TextFieldController$DefaultImpls;->getPlaceHolder(Lcom/stripe/android/uicore/elements/TextFieldController;)Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v0

    return-object v0
.end method

.method public abstract getSelectedCardBrandFlow()Lkotlinx/coroutines/flow/StateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Lcom/stripe/android/model/CardBrand;",
            ">;"
        }
    .end annotation
.end method

.method public final onCardScanResult(Lcom/stripe/android/stripecardscan/cardscan/CardScanSheetResult;)V
    .locals 1

    const-string v0, "cardScanSheetResult"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 66
    instance-of v0, p1, Lcom/stripe/android/stripecardscan/cardscan/CardScanSheetResult$Completed;

    if-eqz v0, :cond_0

    .line 67
    check-cast p1, Lcom/stripe/android/stripecardscan/cardscan/CardScanSheetResult$Completed;

    invoke-virtual {p1}, Lcom/stripe/android/stripecardscan/cardscan/CardScanSheetResult$Completed;->getScannedCard()Lcom/stripe/android/stripecardscan/payment/card/ScannedCard;

    move-result-object p1

    invoke-virtual {p1}, Lcom/stripe/android/stripecardscan/payment/card/ScannedCard;->getPan()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/stripe/android/ui/core/elements/CardNumberController;->onRawValueChange(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public onDropdownItemClicked(Lcom/stripe/android/uicore/elements/TextFieldIcon$Dropdown$Item;)V
    .locals 0

    .line 54
    invoke-static {p0, p1}, Lcom/stripe/android/uicore/elements/TextFieldController$DefaultImpls;->onDropdownItemClicked(Lcom/stripe/android/uicore/elements/TextFieldController;Lcom/stripe/android/uicore/elements/TextFieldIcon$Dropdown$Item;)V

    return-void
.end method
