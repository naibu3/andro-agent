.class public final Lcom/stripe/android/lpmfoundations/paymentmethod/definitions/CustomPaymentMethodUiDefinitionFactory;
.super Ljava/lang/Object;
.source "CustomPaymentMethodUiDefinitionFactory.kt"

# interfaces
.implements Lcom/stripe/android/lpmfoundations/paymentmethod/UiDefinitionFactory$Simple;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0008\u0010\u0006\u001a\u00020\u0007H\u0016J\u001e\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00020\u000eH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"
    }
    d2 = {
        "Lcom/stripe/android/lpmfoundations/paymentmethod/definitions/CustomPaymentMethodUiDefinitionFactory;",
        "Lcom/stripe/android/lpmfoundations/paymentmethod/UiDefinitionFactory$Simple;",
        "displayableCustomPaymentMethod",
        "Lcom/stripe/android/lpmfoundations/paymentmethod/DisplayableCustomPaymentMethod;",
        "<init>",
        "(Lcom/stripe/android/lpmfoundations/paymentmethod/DisplayableCustomPaymentMethod;)V",
        "createSupportedPaymentMethod",
        "Lcom/stripe/android/lpmfoundations/luxe/SupportedPaymentMethod;",
        "createFormElements",
        "",
        "Lcom/stripe/android/uicore/elements/FormElement;",
        "metadata",
        "Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;",
        "arguments",
        "Lcom/stripe/android/lpmfoundations/paymentmethod/UiDefinitionFactory$Arguments;",
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
.field private final displayableCustomPaymentMethod:Lcom/stripe/android/lpmfoundations/paymentmethod/DisplayableCustomPaymentMethod;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/lpmfoundations/paymentmethod/DisplayableCustomPaymentMethod;)V
    .locals 1

    const-string v0, "displayableCustomPaymentMethod"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    iput-object p1, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/definitions/CustomPaymentMethodUiDefinitionFactory;->displayableCustomPaymentMethod:Lcom/stripe/android/lpmfoundations/paymentmethod/DisplayableCustomPaymentMethod;

    return-void
.end method


# virtual methods
.method public canBeDisplayedInUi(Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodDefinition;Ljava/util/List;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodDefinition;",
            "Ljava/util/List<",
            "Lcom/stripe/android/ui/core/elements/SharedDataSpec;",
            ">;)Z"
        }
    .end annotation

    .line 13
    invoke-static {p0, p1, p2}, Lcom/stripe/android/lpmfoundations/paymentmethod/UiDefinitionFactory$Simple$DefaultImpls;->canBeDisplayedInUi(Lcom/stripe/android/lpmfoundations/paymentmethod/UiDefinitionFactory$Simple;Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodDefinition;Ljava/util/List;)Z

    move-result p1

    return p1
.end method

.method public createFormElements(Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;Lcom/stripe/android/lpmfoundations/paymentmethod/UiDefinitionFactory$Arguments;)Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;",
            "Lcom/stripe/android/lpmfoundations/paymentmethod/UiDefinitionFactory$Arguments;",
            ")",
            "Ljava/util/List<",
            "Lcom/stripe/android/uicore/elements/FormElement;",
            ">;"
        }
    .end annotation

    const-string v0, "metadata"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "arguments"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    new-instance p1, Lcom/stripe/android/lpmfoundations/luxe/FormElementsBuilder;

    invoke-direct {p1, p2}, Lcom/stripe/android/lpmfoundations/luxe/FormElementsBuilder;-><init>(Lcom/stripe/android/lpmfoundations/paymentmethod/UiDefinitionFactory$Arguments;)V

    .line 35
    iget-object p2, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/definitions/CustomPaymentMethodUiDefinitionFactory;->displayableCustomPaymentMethod:Lcom/stripe/android/lpmfoundations/paymentmethod/DisplayableCustomPaymentMethod;

    invoke-virtual {p2}, Lcom/stripe/android/lpmfoundations/paymentmethod/DisplayableCustomPaymentMethod;->getSubtitle()Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 37
    new-instance v0, Lcom/stripe/android/ui/core/elements/StaticTextElement;

    .line 38
    sget-object p2, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;

    const-string v1, "CustomPaymentMethodHeader"

    invoke-virtual {p2, v1}, Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;->Generic(Ljava/lang/String;)Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v1

    const/4 v4, 0x4

    const/4 v5, 0x0

    const/4 v3, 0x0

    .line 37
    invoke-direct/range {v0 .. v5}, Lcom/stripe/android/ui/core/elements/StaticTextElement;-><init>(Lcom/stripe/android/uicore/elements/IdentifierSpec;Lcom/stripe/android/core/strings/ResolvableString;Lcom/stripe/android/uicore/elements/InputController;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    check-cast v0, Lcom/stripe/android/uicore/elements/FormElement;

    .line 36
    invoke-virtual {p1, v0}, Lcom/stripe/android/lpmfoundations/luxe/FormElementsBuilder;->header(Lcom/stripe/android/uicore/elements/FormElement;)Lcom/stripe/android/lpmfoundations/luxe/FormElementsBuilder;

    .line 44
    :cond_0
    iget-object p2, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/definitions/CustomPaymentMethodUiDefinitionFactory;->displayableCustomPaymentMethod:Lcom/stripe/android/lpmfoundations/paymentmethod/DisplayableCustomPaymentMethod;

    invoke-virtual {p2}, Lcom/stripe/android/lpmfoundations/paymentmethod/DisplayableCustomPaymentMethod;->getDoesNotCollectBillingDetails()Z

    move-result p2

    if-eqz p2, :cond_1

    .line 45
    invoke-virtual {p1}, Lcom/stripe/android/lpmfoundations/luxe/FormElementsBuilder;->ignoreContactInformationRequirements()Lcom/stripe/android/lpmfoundations/luxe/FormElementsBuilder;

    .line 46
    invoke-virtual {p1}, Lcom/stripe/android/lpmfoundations/luxe/FormElementsBuilder;->ignoreBillingAddressRequirements()Lcom/stripe/android/lpmfoundations/luxe/FormElementsBuilder;

    .line 49
    :cond_1
    invoke-virtual {p1}, Lcom/stripe/android/lpmfoundations/luxe/FormElementsBuilder;->build()Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public createFormHeaderInformation(ZLcom/stripe/android/paymentsheet/model/PaymentMethodIncentive;)Lcom/stripe/android/lpmfoundations/FormHeaderInformation;
    .locals 0

    .line 13
    invoke-static {p0, p1, p2}, Lcom/stripe/android/lpmfoundations/paymentmethod/UiDefinitionFactory$Simple$DefaultImpls;->createFormHeaderInformation(Lcom/stripe/android/lpmfoundations/paymentmethod/UiDefinitionFactory$Simple;ZLcom/stripe/android/paymentsheet/model/PaymentMethodIncentive;)Lcom/stripe/android/lpmfoundations/FormHeaderInformation;

    move-result-object p1

    return-object p1
.end method

.method public createSupportedPaymentMethod()Lcom/stripe/android/lpmfoundations/luxe/SupportedPaymentMethod;
    .locals 14

    .line 18
    iget-object v0, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/definitions/CustomPaymentMethodUiDefinitionFactory;->displayableCustomPaymentMethod:Lcom/stripe/android/lpmfoundations/paymentmethod/DisplayableCustomPaymentMethod;

    invoke-virtual {v0}, Lcom/stripe/android/lpmfoundations/paymentmethod/DisplayableCustomPaymentMethod;->getId()Ljava/lang/String;

    move-result-object v2

    .line 19
    iget-object v0, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/definitions/CustomPaymentMethodUiDefinitionFactory;->displayableCustomPaymentMethod:Lcom/stripe/android/lpmfoundations/paymentmethod/DisplayableCustomPaymentMethod;

    invoke-virtual {v0}, Lcom/stripe/android/lpmfoundations/paymentmethod/DisplayableCustomPaymentMethod;->getDisplayName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/stripe/android/core/strings/ResolvableStringUtilsKt;->getResolvableString(Ljava/lang/String;)Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object v4

    .line 20
    iget-object v0, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/definitions/CustomPaymentMethodUiDefinitionFactory;->displayableCustomPaymentMethod:Lcom/stripe/android/lpmfoundations/paymentmethod/DisplayableCustomPaymentMethod;

    invoke-virtual {v0}, Lcom/stripe/android/lpmfoundations/paymentmethod/DisplayableCustomPaymentMethod;->getSubtitle()Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object v10

    .line 21
    iget-object v0, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/definitions/CustomPaymentMethodUiDefinitionFactory;->displayableCustomPaymentMethod:Lcom/stripe/android/lpmfoundations/paymentmethod/DisplayableCustomPaymentMethod;

    invoke-virtual {v0}, Lcom/stripe/android/lpmfoundations/paymentmethod/DisplayableCustomPaymentMethod;->getLogoUrl()Ljava/lang/String;

    move-result-object v7

    .line 22
    iget-object v0, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/definitions/CustomPaymentMethodUiDefinitionFactory;->displayableCustomPaymentMethod:Lcom/stripe/android/lpmfoundations/paymentmethod/DisplayableCustomPaymentMethod;

    invoke-virtual {v0}, Lcom/stripe/android/lpmfoundations/paymentmethod/DisplayableCustomPaymentMethod;->getLogoUrl()Ljava/lang/String;

    move-result-object v8

    .line 17
    new-instance v1, Lcom/stripe/android/lpmfoundations/luxe/SupportedPaymentMethod;

    const/4 v0, 0x0

    .line 24
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    const/16 v12, 0x202

    const/4 v13, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v9, 0x0

    const/4 v11, 0x0

    .line 17
    invoke-direct/range {v1 .. v13}, Lcom/stripe/android/lpmfoundations/luxe/SupportedPaymentMethod;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/core/strings/ResolvableString;ILjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;ZLcom/stripe/android/core/strings/ResolvableString;Ljava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method public formElements(Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodDefinition;Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;Ljava/util/List;Lcom/stripe/android/lpmfoundations/paymentmethod/UiDefinitionFactory$Arguments;)Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodDefinition;",
            "Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;",
            "Ljava/util/List<",
            "Lcom/stripe/android/ui/core/elements/SharedDataSpec;",
            ">;",
            "Lcom/stripe/android/lpmfoundations/paymentmethod/UiDefinitionFactory$Arguments;",
            ")",
            "Ljava/util/List<",
            "Lcom/stripe/android/uicore/elements/FormElement;",
            ">;"
        }
    .end annotation

    .line 13
    invoke-static {p0, p1, p2, p3, p4}, Lcom/stripe/android/lpmfoundations/paymentmethod/UiDefinitionFactory$Simple$DefaultImpls;->formElements(Lcom/stripe/android/lpmfoundations/paymentmethod/UiDefinitionFactory$Simple;Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodDefinition;Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;Ljava/util/List;Lcom/stripe/android/lpmfoundations/paymentmethod/UiDefinitionFactory$Arguments;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public formHeaderInformation(Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodDefinition;Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;Ljava/util/List;Z)Lcom/stripe/android/lpmfoundations/FormHeaderInformation;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodDefinition;",
            "Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;",
            "Ljava/util/List<",
            "Lcom/stripe/android/ui/core/elements/SharedDataSpec;",
            ">;Z)",
            "Lcom/stripe/android/lpmfoundations/FormHeaderInformation;"
        }
    .end annotation

    .line 13
    invoke-static {p0, p1, p2, p3, p4}, Lcom/stripe/android/lpmfoundations/paymentmethod/UiDefinitionFactory$Simple$DefaultImpls;->formHeaderInformation(Lcom/stripe/android/lpmfoundations/paymentmethod/UiDefinitionFactory$Simple;Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodDefinition;Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;Ljava/util/List;Z)Lcom/stripe/android/lpmfoundations/FormHeaderInformation;

    move-result-object p1

    return-object p1
.end method

.method public supportedPaymentMethod(Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodDefinition;Ljava/util/List;)Lcom/stripe/android/lpmfoundations/luxe/SupportedPaymentMethod;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;",
            "Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodDefinition;",
            "Ljava/util/List<",
            "Lcom/stripe/android/ui/core/elements/SharedDataSpec;",
            ">;)",
            "Lcom/stripe/android/lpmfoundations/luxe/SupportedPaymentMethod;"
        }
    .end annotation

    .line 13
    invoke-static {p0, p1, p2, p3}, Lcom/stripe/android/lpmfoundations/paymentmethod/UiDefinitionFactory$Simple$DefaultImpls;->supportedPaymentMethod(Lcom/stripe/android/lpmfoundations/paymentmethod/UiDefinitionFactory$Simple;Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodDefinition;Ljava/util/List;)Lcom/stripe/android/lpmfoundations/luxe/SupportedPaymentMethod;

    move-result-object p1

    return-object p1
.end method
