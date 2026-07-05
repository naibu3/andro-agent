.class public final Lcom/stripe/android/lpmfoundations/paymentmethod/UiDefinitionFactory$Arguments;
.super Ljava/lang/Object;
.source "UiDefinitionFactory.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/lpmfoundations/paymentmethod/UiDefinitionFactory;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Arguments"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/lpmfoundations/paymentmethod/UiDefinitionFactory$Arguments$Factory;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u001f\u0008\u0007\u0018\u00002\u00020\u0001:\u0001=B\u00b1\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0008\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0007\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0016\u0010\u000c\u001a\u0012\u0012\u0004\u0012\u00020\u0008\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\u0007\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\t\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u000e\u0012\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u001a\u0012\u0006\u0010\u001b\u001a\u00020\u000e\u0012\u0008\u0010\u001c\u001a\u0004\u0018\u00010\u001d\u0012\u0008\u0010\u001e\u001a\u0004\u0018\u00010\u001f\u00a2\u0006\u0004\u0008 \u0010!R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\"\u0010#R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008$\u0010%R\u001f\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0008\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008&\u0010\'R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008(\u0010)R!\u0010\u000c\u001a\u0012\u0012\u0004\u0012\u00020\u0008\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008*\u0010\'R\u0011\u0010\r\u001a\u00020\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008+\u0010,R\u0011\u0010\u000f\u001a\u00020\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008-\u0010.R\u0011\u0010\u0010\u001a\u00020\u0011\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008/\u00100R\u0011\u0010\u0012\u001a\u00020\u0013\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00081\u00102R\u0011\u0010\u0014\u001a\u00020\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00083\u0010,R\u001d\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u0016\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00084\u00105R\u0011\u0010\u0019\u001a\u00020\u001a\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00086\u00107R\u0011\u0010\u001b\u001a\u00020\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00088\u0010,R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u001d\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00089\u0010:R\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u001f\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008;\u0010<\u00a8\u0006>"
    }
    d2 = {
        "Lcom/stripe/android/lpmfoundations/paymentmethod/UiDefinitionFactory$Arguments;",
        "",
        "cardAccountRangeRepositoryFactory",
        "Lcom/stripe/android/cards/CardAccountRangeRepository$Factory;",
        "linkConfigurationCoordinator",
        "Lcom/stripe/android/link/LinkConfigurationCoordinator;",
        "initialValues",
        "",
        "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
        "",
        "initialLinkUserInput",
        "Lcom/stripe/android/link/ui/inline/UserInput;",
        "shippingValues",
        "saveForFutureUseInitialValue",
        "",
        "merchantName",
        "cbcEligibility",
        "Lcom/stripe/android/ui/core/cbc/CardBrandChoiceEligibility;",
        "billingDetailsCollectionConfiguration",
        "Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;",
        "requiresMandate",
        "onLinkInlineSignupStateChanged",
        "Lkotlin/Function1;",
        "Lcom/stripe/android/link/ui/inline/InlineSignupViewState;",
        "",
        "cardBrandFilter",
        "Lcom/stripe/android/CardBrandFilter;",
        "setAsDefaultMatchesSaveForFutureUse",
        "autocompleteAddressInteractorFactory",
        "Lcom/stripe/android/uicore/elements/AutocompleteAddressInteractor$Factory;",
        "linkInlineHandler",
        "Lcom/stripe/android/paymentsheet/LinkInlineHandler;",
        "<init>",
        "(Lcom/stripe/android/cards/CardAccountRangeRepository$Factory;Lcom/stripe/android/link/LinkConfigurationCoordinator;Ljava/util/Map;Lcom/stripe/android/link/ui/inline/UserInput;Ljava/util/Map;ZLjava/lang/String;Lcom/stripe/android/ui/core/cbc/CardBrandChoiceEligibility;Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;ZLkotlin/jvm/functions/Function1;Lcom/stripe/android/CardBrandFilter;ZLcom/stripe/android/uicore/elements/AutocompleteAddressInteractor$Factory;Lcom/stripe/android/paymentsheet/LinkInlineHandler;)V",
        "getCardAccountRangeRepositoryFactory",
        "()Lcom/stripe/android/cards/CardAccountRangeRepository$Factory;",
        "getLinkConfigurationCoordinator",
        "()Lcom/stripe/android/link/LinkConfigurationCoordinator;",
        "getInitialValues",
        "()Ljava/util/Map;",
        "getInitialLinkUserInput",
        "()Lcom/stripe/android/link/ui/inline/UserInput;",
        "getShippingValues",
        "getSaveForFutureUseInitialValue",
        "()Z",
        "getMerchantName",
        "()Ljava/lang/String;",
        "getCbcEligibility",
        "()Lcom/stripe/android/ui/core/cbc/CardBrandChoiceEligibility;",
        "getBillingDetailsCollectionConfiguration",
        "()Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;",
        "getRequiresMandate",
        "getOnLinkInlineSignupStateChanged",
        "()Lkotlin/jvm/functions/Function1;",
        "getCardBrandFilter",
        "()Lcom/stripe/android/CardBrandFilter;",
        "getSetAsDefaultMatchesSaveForFutureUse",
        "getAutocompleteAddressInteractorFactory",
        "()Lcom/stripe/android/uicore/elements/AutocompleteAddressInteractor$Factory;",
        "getLinkInlineHandler",
        "()Lcom/stripe/android/paymentsheet/LinkInlineHandler;",
        "Factory",
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
.field public static final $stable:I = 0x8


# instance fields
.field private final autocompleteAddressInteractorFactory:Lcom/stripe/android/uicore/elements/AutocompleteAddressInteractor$Factory;

.field private final billingDetailsCollectionConfiguration:Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;

.field private final cardAccountRangeRepositoryFactory:Lcom/stripe/android/cards/CardAccountRangeRepository$Factory;

.field private final cardBrandFilter:Lcom/stripe/android/CardBrandFilter;

.field private final cbcEligibility:Lcom/stripe/android/ui/core/cbc/CardBrandChoiceEligibility;

.field private final initialLinkUserInput:Lcom/stripe/android/link/ui/inline/UserInput;

.field private final initialValues:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final linkConfigurationCoordinator:Lcom/stripe/android/link/LinkConfigurationCoordinator;

.field private final linkInlineHandler:Lcom/stripe/android/paymentsheet/LinkInlineHandler;

.field private final merchantName:Ljava/lang/String;

.field private final onLinkInlineSignupStateChanged:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Lcom/stripe/android/link/ui/inline/InlineSignupViewState;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field private final requiresMandate:Z

.field private final saveForFutureUseInitialValue:Z

.field private final setAsDefaultMatchesSaveForFutureUse:Z

.field private final shippingValues:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/cards/CardAccountRangeRepository$Factory;Lcom/stripe/android/link/LinkConfigurationCoordinator;Ljava/util/Map;Lcom/stripe/android/link/ui/inline/UserInput;Ljava/util/Map;ZLjava/lang/String;Lcom/stripe/android/ui/core/cbc/CardBrandChoiceEligibility;Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;ZLkotlin/jvm/functions/Function1;Lcom/stripe/android/CardBrandFilter;ZLcom/stripe/android/uicore/elements/AutocompleteAddressInteractor$Factory;Lcom/stripe/android/paymentsheet/LinkInlineHandler;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/cards/CardAccountRangeRepository$Factory;",
            "Lcom/stripe/android/link/LinkConfigurationCoordinator;",
            "Ljava/util/Map<",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
            "Ljava/lang/String;",
            ">;",
            "Lcom/stripe/android/link/ui/inline/UserInput;",
            "Ljava/util/Map<",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
            "Ljava/lang/String;",
            ">;Z",
            "Ljava/lang/String;",
            "Lcom/stripe/android/ui/core/cbc/CardBrandChoiceEligibility;",
            "Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;",
            "Z",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/stripe/android/link/ui/inline/InlineSignupViewState;",
            "Lkotlin/Unit;",
            ">;",
            "Lcom/stripe/android/CardBrandFilter;",
            "Z",
            "Lcom/stripe/android/uicore/elements/AutocompleteAddressInteractor$Factory;",
            "Lcom/stripe/android/paymentsheet/LinkInlineHandler;",
            ")V"
        }
    .end annotation

    move-object v0, p12

    const-string v1, "cardAccountRangeRepositoryFactory"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "initialValues"

    invoke-static {p3, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "merchantName"

    invoke-static {p7, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "cbcEligibility"

    invoke-static {p8, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "billingDetailsCollectionConfiguration"

    invoke-static {p9, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "onLinkInlineSignupStateChanged"

    invoke-static {p11, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "cardBrandFilter"

    invoke-static {p12, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    iput-object p1, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/UiDefinitionFactory$Arguments;->cardAccountRangeRepositoryFactory:Lcom/stripe/android/cards/CardAccountRangeRepository$Factory;

    .line 31
    iput-object p2, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/UiDefinitionFactory$Arguments;->linkConfigurationCoordinator:Lcom/stripe/android/link/LinkConfigurationCoordinator;

    .line 32
    iput-object p3, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/UiDefinitionFactory$Arguments;->initialValues:Ljava/util/Map;

    .line 33
    iput-object p4, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/UiDefinitionFactory$Arguments;->initialLinkUserInput:Lcom/stripe/android/link/ui/inline/UserInput;

    .line 34
    iput-object p5, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/UiDefinitionFactory$Arguments;->shippingValues:Ljava/util/Map;

    .line 35
    iput-boolean p6, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/UiDefinitionFactory$Arguments;->saveForFutureUseInitialValue:Z

    .line 36
    iput-object p7, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/UiDefinitionFactory$Arguments;->merchantName:Ljava/lang/String;

    .line 37
    iput-object p8, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/UiDefinitionFactory$Arguments;->cbcEligibility:Lcom/stripe/android/ui/core/cbc/CardBrandChoiceEligibility;

    .line 38
    iput-object p9, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/UiDefinitionFactory$Arguments;->billingDetailsCollectionConfiguration:Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;

    .line 39
    iput-boolean p10, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/UiDefinitionFactory$Arguments;->requiresMandate:Z

    .line 40
    iput-object p11, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/UiDefinitionFactory$Arguments;->onLinkInlineSignupStateChanged:Lkotlin/jvm/functions/Function1;

    .line 41
    iput-object v0, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/UiDefinitionFactory$Arguments;->cardBrandFilter:Lcom/stripe/android/CardBrandFilter;

    move p1, p13

    .line 42
    iput-boolean p1, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/UiDefinitionFactory$Arguments;->setAsDefaultMatchesSaveForFutureUse:Z

    move-object/from16 p1, p14

    .line 43
    iput-object p1, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/UiDefinitionFactory$Arguments;->autocompleteAddressInteractorFactory:Lcom/stripe/android/uicore/elements/AutocompleteAddressInteractor$Factory;

    move-object/from16 p1, p15

    .line 44
    iput-object p1, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/UiDefinitionFactory$Arguments;->linkInlineHandler:Lcom/stripe/android/paymentsheet/LinkInlineHandler;

    return-void
.end method


# virtual methods
.method public final getAutocompleteAddressInteractorFactory()Lcom/stripe/android/uicore/elements/AutocompleteAddressInteractor$Factory;
    .locals 1

    .line 43
    iget-object v0, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/UiDefinitionFactory$Arguments;->autocompleteAddressInteractorFactory:Lcom/stripe/android/uicore/elements/AutocompleteAddressInteractor$Factory;

    return-object v0
.end method

.method public final getBillingDetailsCollectionConfiguration()Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;
    .locals 1

    .line 38
    iget-object v0, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/UiDefinitionFactory$Arguments;->billingDetailsCollectionConfiguration:Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;

    return-object v0
.end method

.method public final getCardAccountRangeRepositoryFactory()Lcom/stripe/android/cards/CardAccountRangeRepository$Factory;
    .locals 1

    .line 30
    iget-object v0, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/UiDefinitionFactory$Arguments;->cardAccountRangeRepositoryFactory:Lcom/stripe/android/cards/CardAccountRangeRepository$Factory;

    return-object v0
.end method

.method public final getCardBrandFilter()Lcom/stripe/android/CardBrandFilter;
    .locals 1

    .line 41
    iget-object v0, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/UiDefinitionFactory$Arguments;->cardBrandFilter:Lcom/stripe/android/CardBrandFilter;

    return-object v0
.end method

.method public final getCbcEligibility()Lcom/stripe/android/ui/core/cbc/CardBrandChoiceEligibility;
    .locals 1

    .line 37
    iget-object v0, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/UiDefinitionFactory$Arguments;->cbcEligibility:Lcom/stripe/android/ui/core/cbc/CardBrandChoiceEligibility;

    return-object v0
.end method

.method public final getInitialLinkUserInput()Lcom/stripe/android/link/ui/inline/UserInput;
    .locals 1

    .line 33
    iget-object v0, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/UiDefinitionFactory$Arguments;->initialLinkUserInput:Lcom/stripe/android/link/ui/inline/UserInput;

    return-object v0
.end method

.method public final getInitialValues()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 32
    iget-object v0, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/UiDefinitionFactory$Arguments;->initialValues:Ljava/util/Map;

    return-object v0
.end method

.method public final getLinkConfigurationCoordinator()Lcom/stripe/android/link/LinkConfigurationCoordinator;
    .locals 1

    .line 31
    iget-object v0, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/UiDefinitionFactory$Arguments;->linkConfigurationCoordinator:Lcom/stripe/android/link/LinkConfigurationCoordinator;

    return-object v0
.end method

.method public final getLinkInlineHandler()Lcom/stripe/android/paymentsheet/LinkInlineHandler;
    .locals 1

    .line 44
    iget-object v0, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/UiDefinitionFactory$Arguments;->linkInlineHandler:Lcom/stripe/android/paymentsheet/LinkInlineHandler;

    return-object v0
.end method

.method public final getMerchantName()Ljava/lang/String;
    .locals 1

    .line 36
    iget-object v0, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/UiDefinitionFactory$Arguments;->merchantName:Ljava/lang/String;

    return-object v0
.end method

.method public final getOnLinkInlineSignupStateChanged()Lkotlin/jvm/functions/Function1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function1<",
            "Lcom/stripe/android/link/ui/inline/InlineSignupViewState;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    .line 40
    iget-object v0, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/UiDefinitionFactory$Arguments;->onLinkInlineSignupStateChanged:Lkotlin/jvm/functions/Function1;

    return-object v0
.end method

.method public final getRequiresMandate()Z
    .locals 1

    .line 39
    iget-boolean v0, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/UiDefinitionFactory$Arguments;->requiresMandate:Z

    return v0
.end method

.method public final getSaveForFutureUseInitialValue()Z
    .locals 1

    .line 35
    iget-boolean v0, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/UiDefinitionFactory$Arguments;->saveForFutureUseInitialValue:Z

    return v0
.end method

.method public final getSetAsDefaultMatchesSaveForFutureUse()Z
    .locals 1

    .line 42
    iget-boolean v0, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/UiDefinitionFactory$Arguments;->setAsDefaultMatchesSaveForFutureUse:Z

    return v0
.end method

.method public final getShippingValues()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 34
    iget-object v0, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/UiDefinitionFactory$Arguments;->shippingValues:Ljava/util/Map;

    return-object v0
.end method
