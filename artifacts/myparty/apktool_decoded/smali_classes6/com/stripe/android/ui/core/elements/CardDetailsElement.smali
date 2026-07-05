.class public final Lcom/stripe/android/ui/core/elements/CardDetailsElement;
.super Lcom/stripe/android/uicore/elements/SectionMultiFieldElement;
.source "CardDetailsElement.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nCardDetailsElement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CardDetailsElement.kt\ncom/stripe/android/ui/core/elements/CardDetailsElement\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 StateFlows.kt\ncom/stripe/android/uicore/utils/StateFlowsKt\n+ 4 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt\n+ 5 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 6 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,111:1\n1#2:112\n203#3,5:113\n211#3:125\n283#4:118\n284#4:123\n37#5:119\n36#5,3:120\n105#6:124\n*S KotlinDebug\n*F\n+ 1 CardDetailsElement.kt\ncom/stripe/android/ui/core/elements/CardDetailsElement\n*L\n108#1:113,5\n108#1:125\n108#1:118\n108#1:123\n108#1:119\n108#1:120,3\n108#1:124\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0008\u0001\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00080\u0007\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\n\u0012\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u000c\u0012\u0008\u0008\u0002\u0010\r\u001a\u00020\u000e\u0012\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u0010\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0008\u0010\u001d\u001a\u00020\u001eH\u0016J\u001e\u0010\u001f\u001a\u00020 2\u0014\u0010!\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00080\u0007H\u0016J\u0014\u0010\"\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00030$0#H\u0016J \u0010%\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\'0&0$0#H\u0016R\u000e\u0010\u000b\u001a\u00020\u000cX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u000f\u001a\u00020\u0010\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u0014R\u0011\u0010\u0015\u001a\u00020\n\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\nX\u0096D\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0018\u0010\u0016R\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001b\u0010\u001c\u00a8\u0006("
    }
    d2 = {
        "Lcom/stripe/android/ui/core/elements/CardDetailsElement;",
        "Lcom/stripe/android/uicore/elements/SectionMultiFieldElement;",
        "identifier",
        "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
        "cardAccountRangeRepositoryFactory",
        "Lcom/stripe/android/cards/CardAccountRangeRepository$Factory;",
        "initialValues",
        "",
        "",
        "collectName",
        "",
        "cbcEligibility",
        "Lcom/stripe/android/ui/core/cbc/CardBrandChoiceEligibility;",
        "cardBrandFilter",
        "Lcom/stripe/android/CardBrandFilter;",
        "controller",
        "Lcom/stripe/android/ui/core/elements/CardDetailsController;",
        "<init>",
        "(Lcom/stripe/android/uicore/elements/IdentifierSpec;Lcom/stripe/android/cards/CardAccountRangeRepository$Factory;Ljava/util/Map;ZLcom/stripe/android/ui/core/cbc/CardBrandChoiceEligibility;Lcom/stripe/android/CardBrandFilter;Lcom/stripe/android/ui/core/elements/CardDetailsController;)V",
        "getController",
        "()Lcom/stripe/android/ui/core/elements/CardDetailsController;",
        "isCardScanEnabled",
        "()Z",
        "allowsUserInteraction",
        "getAllowsUserInteraction",
        "mandateText",
        "Lcom/stripe/android/core/strings/ResolvableString;",
        "getMandateText",
        "()Lcom/stripe/android/core/strings/ResolvableString;",
        "sectionFieldErrorController",
        "Lcom/stripe/android/uicore/elements/SectionFieldErrorController;",
        "setRawValue",
        "",
        "rawValuesMap",
        "getTextFieldIdentifiers",
        "Lkotlinx/coroutines/flow/StateFlow;",
        "",
        "getFormFieldValueFlow",
        "Lkotlin/Pair;",
        "Lcom/stripe/android/uicore/forms/FormFieldEntry;",
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
.field private final allowsUserInteraction:Z

.field private final cardBrandFilter:Lcom/stripe/android/CardBrandFilter;

.field private final cbcEligibility:Lcom/stripe/android/ui/core/cbc/CardBrandChoiceEligibility;

.field private final controller:Lcom/stripe/android/ui/core/elements/CardDetailsController;

.field private final isCardScanEnabled:Z

.field private final mandateText:Lcom/stripe/android/core/strings/ResolvableString;


# direct methods
.method public static synthetic $r8$lambda$6p6genzJ1f_rvSI54Ht6H0DNuPc(Lcom/stripe/android/model/CardBrand;)Lkotlin/Pair;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/ui/core/elements/CardDetailsElement;->getFormFieldValueFlow$lambda$9$lambda$4(Lcom/stripe/android/model/CardBrand;)Lkotlin/Pair;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$Hc7ZXpQg-M_8W81G-eaZbaoJZRs(Lcom/stripe/android/model/CardBrand;)Lkotlin/Pair;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/ui/core/elements/CardDetailsElement;->getFormFieldValueFlow$lambda$9$lambda$6(Lcom/stripe/android/model/CardBrand;)Lkotlin/Pair;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$Sk9qwvSvaDwIF5cl-bfyooedxu4(Lcom/stripe/android/ui/core/elements/CardDetailsElement;Lcom/stripe/android/uicore/forms/FormFieldEntry;)Lkotlin/Pair;
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/ui/core/elements/CardDetailsElement;->getFormFieldValueFlow$lambda$9$lambda$2(Lcom/stripe/android/ui/core/elements/CardDetailsElement;Lcom/stripe/android/uicore/forms/FormFieldEntry;)Lkotlin/Pair;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$mpraHZZRE7gXX8JJLQzh-wjle4I(Lcom/stripe/android/ui/core/elements/CardDetailsElement;Lcom/stripe/android/uicore/forms/FormFieldEntry;)Lkotlin/Pair;
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/ui/core/elements/CardDetailsElement;->getFormFieldValueFlow$lambda$9$lambda$3(Lcom/stripe/android/ui/core/elements/CardDetailsElement;Lcom/stripe/android/uicore/forms/FormFieldEntry;)Lkotlin/Pair;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$n-GR2VtNHMAxW0VG-jXda4YmpIo(Lcom/stripe/android/uicore/forms/FormFieldEntry;)Lkotlin/Pair;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/ui/core/elements/CardDetailsElement;->getFormFieldValueFlow$lambda$9$lambda$7(Lcom/stripe/android/uicore/forms/FormFieldEntry;)Lkotlin/Pair;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$vBSR1GapUMyeZBq_eAZM8m9Gf8I(Lcom/stripe/android/uicore/forms/FormFieldEntry;)Lkotlin/Pair;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/ui/core/elements/CardDetailsElement;->getFormFieldValueFlow$lambda$9$lambda$8(Lcom/stripe/android/uicore/forms/FormFieldEntry;)Lkotlin/Pair;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$xfe_uhCGnVDr6WFHisJOPzhDgaU(Lcom/stripe/android/ui/core/elements/CardDetailsElement;Lcom/stripe/android/uicore/forms/FormFieldEntry;)Lkotlin/Pair;
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/ui/core/elements/CardDetailsElement;->getFormFieldValueFlow$lambda$9$lambda$1(Lcom/stripe/android/ui/core/elements/CardDetailsElement;Lcom/stripe/android/uicore/forms/FormFieldEntry;)Lkotlin/Pair;

    move-result-object p0

    return-object p0
.end method

.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/uicore/elements/IdentifierSpec;Lcom/stripe/android/cards/CardAccountRangeRepository$Factory;Ljava/util/Map;ZLcom/stripe/android/ui/core/cbc/CardBrandChoiceEligibility;Lcom/stripe/android/CardBrandFilter;Lcom/stripe/android/ui/core/elements/CardDetailsController;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
            "Lcom/stripe/android/cards/CardAccountRangeRepository$Factory;",
            "Ljava/util/Map<",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
            "Ljava/lang/String;",
            ">;Z",
            "Lcom/stripe/android/ui/core/cbc/CardBrandChoiceEligibility;",
            "Lcom/stripe/android/CardBrandFilter;",
            "Lcom/stripe/android/ui/core/elements/CardDetailsController;",
            ")V"
        }
    .end annotation

    const-string p4, "identifier"

    invoke-static {p1, p4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p4, "cardAccountRangeRepositoryFactory"

    invoke-static {p2, p4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "initialValues"

    invoke-static {p3, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "cbcEligibility"

    invoke-static {p5, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "cardBrandFilter"

    invoke-static {p6, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "controller"

    invoke-static {p7, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 38
    invoke-direct {p0, p1}, Lcom/stripe/android/uicore/elements/SectionMultiFieldElement;-><init>(Lcom/stripe/android/uicore/elements/IdentifierSpec;)V

    .line 29
    iput-object p5, p0, Lcom/stripe/android/ui/core/elements/CardDetailsElement;->cbcEligibility:Lcom/stripe/android/ui/core/cbc/CardBrandChoiceEligibility;

    .line 30
    iput-object p6, p0, Lcom/stripe/android/ui/core/elements/CardDetailsElement;->cardBrandFilter:Lcom/stripe/android/CardBrandFilter;

    .line 31
    iput-object p7, p0, Lcom/stripe/android/ui/core/elements/CardDetailsElement;->controller:Lcom/stripe/android/ui/core/elements/CardDetailsController;

    .line 39
    invoke-virtual {p7}, Lcom/stripe/android/ui/core/elements/CardDetailsController;->getNumberElement()Lcom/stripe/android/ui/core/elements/CardNumberElement;

    move-result-object p1

    invoke-virtual {p1}, Lcom/stripe/android/ui/core/elements/CardNumberElement;->getController()Lcom/stripe/android/ui/core/elements/CardNumberController;

    move-result-object p1

    invoke-virtual {p1}, Lcom/stripe/android/ui/core/elements/CardNumberController;->getCardScanEnabled()Z

    move-result p1

    iput-boolean p1, p0, Lcom/stripe/android/ui/core/elements/CardDetailsElement;->isCardScanEnabled:Z

    const/4 p1, 0x1

    .line 41
    iput-boolean p1, p0, Lcom/stripe/android/ui/core/elements/CardDetailsElement;->allowsUserInteraction:Z

    return-void
.end method

.method public synthetic constructor <init>(Lcom/stripe/android/uicore/elements/IdentifierSpec;Lcom/stripe/android/cards/CardAccountRangeRepository$Factory;Ljava/util/Map;ZLcom/stripe/android/ui/core/cbc/CardBrandChoiceEligibility;Lcom/stripe/android/CardBrandFilter;Lcom/stripe/android/ui/core/elements/CardDetailsController;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 10

    and-int/lit8 v0, p8, 0x8

    if-eqz v0, :cond_0

    const/4 p4, 0x0

    :cond_0
    move v3, p4

    and-int/lit8 p4, p8, 0x10

    if-eqz p4, :cond_1

    .line 29
    sget-object p4, Lcom/stripe/android/ui/core/cbc/CardBrandChoiceEligibility$Ineligible;->INSTANCE:Lcom/stripe/android/ui/core/cbc/CardBrandChoiceEligibility$Ineligible;

    check-cast p4, Lcom/stripe/android/ui/core/cbc/CardBrandChoiceEligibility;

    move-object v4, p4

    goto :goto_0

    :cond_1
    move-object v4, p5

    :goto_0
    and-int/lit8 p4, p8, 0x20

    if-eqz p4, :cond_2

    .line 30
    sget-object p4, Lcom/stripe/android/DefaultCardBrandFilter;->INSTANCE:Lcom/stripe/android/DefaultCardBrandFilter;

    check-cast p4, Lcom/stripe/android/CardBrandFilter;

    move-object v6, p4

    goto :goto_1

    :cond_2
    move-object/from16 v6, p6

    :goto_1
    and-int/lit8 p4, p8, 0x40

    if-eqz p4, :cond_3

    .line 31
    new-instance v0, Lcom/stripe/android/ui/core/elements/CardDetailsController;

    const/16 v8, 0x30

    const/4 v9, 0x0

    const/4 v5, 0x0

    move-object v7, v6

    const/4 v6, 0x0

    move-object v1, p2

    move-object v2, p3

    invoke-direct/range {v0 .. v9}, Lcom/stripe/android/ui/core/elements/CardDetailsController;-><init>(Lcom/stripe/android/cards/CardAccountRangeRepository$Factory;Ljava/util/Map;ZLcom/stripe/android/ui/core/cbc/CardBrandChoiceEligibility;Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext;Lcom/stripe/android/CardBrandFilter;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v6, v7

    move-object v7, v0

    move-object v1, p1

    move-object v2, p2

    move-object v5, v4

    move v4, v3

    move-object v0, p0

    goto :goto_2

    :cond_3
    move-object/from16 v7, p7

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v5, v4

    move v4, v3

    :goto_2
    move-object v3, p3

    .line 24
    invoke-direct/range {v0 .. v7}, Lcom/stripe/android/ui/core/elements/CardDetailsElement;-><init>(Lcom/stripe/android/uicore/elements/IdentifierSpec;Lcom/stripe/android/cards/CardAccountRangeRepository$Factory;Ljava/util/Map;ZLcom/stripe/android/ui/core/cbc/CardBrandChoiceEligibility;Lcom/stripe/android/CardBrandFilter;Lcom/stripe/android/ui/core/elements/CardDetailsController;)V

    return-void
.end method

.method private static final getFormFieldValueFlow$lambda$9$lambda$1(Lcom/stripe/android/ui/core/elements/CardDetailsElement;Lcom/stripe/android/uicore/forms/FormFieldEntry;)Lkotlin/Pair;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 68
    iget-object p0, p0, Lcom/stripe/android/ui/core/elements/CardDetailsElement;->controller:Lcom/stripe/android/ui/core/elements/CardDetailsController;

    invoke-virtual {p0}, Lcom/stripe/android/ui/core/elements/CardDetailsController;->getNameElement()Lcom/stripe/android/uicore/elements/SimpleTextElement;

    move-result-object p0

    invoke-virtual {p0}, Lcom/stripe/android/uicore/elements/SimpleTextElement;->getIdentifier()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object p0

    invoke-static {p0, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p0

    return-object p0
.end method

.method private static final getFormFieldValueFlow$lambda$9$lambda$2(Lcom/stripe/android/ui/core/elements/CardDetailsElement;Lcom/stripe/android/uicore/forms/FormFieldEntry;)Lkotlin/Pair;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 74
    iget-object p0, p0, Lcom/stripe/android/ui/core/elements/CardDetailsElement;->controller:Lcom/stripe/android/ui/core/elements/CardDetailsController;

    invoke-virtual {p0}, Lcom/stripe/android/ui/core/elements/CardDetailsController;->getNumberElement()Lcom/stripe/android/ui/core/elements/CardNumberElement;

    move-result-object p0

    invoke-virtual {p0}, Lcom/stripe/android/ui/core/elements/CardNumberElement;->getIdentifier()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object p0

    invoke-static {p0, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p0

    return-object p0
.end method

.method private static final getFormFieldValueFlow$lambda$9$lambda$3(Lcom/stripe/android/ui/core/elements/CardDetailsElement;Lcom/stripe/android/uicore/forms/FormFieldEntry;)Lkotlin/Pair;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 79
    iget-object p0, p0, Lcom/stripe/android/ui/core/elements/CardDetailsElement;->controller:Lcom/stripe/android/ui/core/elements/CardDetailsController;

    invoke-virtual {p0}, Lcom/stripe/android/ui/core/elements/CardDetailsController;->getCvcElement()Lcom/stripe/android/ui/core/elements/CvcElement;

    move-result-object p0

    invoke-virtual {p0}, Lcom/stripe/android/ui/core/elements/CvcElement;->getIdentifier()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object p0

    invoke-static {p0, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p0

    return-object p0
.end method

.method private static final getFormFieldValueFlow$lambda$9$lambda$4(Lcom/stripe/android/model/CardBrand;)Lkotlin/Pair;
    .locals 3

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 84
    sget-object v0, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;

    invoke-virtual {v0}, Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;->getCardBrand()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v0

    new-instance v1, Lcom/stripe/android/uicore/forms/FormFieldEntry;

    invoke-virtual {p0}, Lcom/stripe/android/model/CardBrand;->getCode()Ljava/lang/String;

    move-result-object p0

    const/4 v2, 0x1

    invoke-direct {v1, p0, v2}, Lcom/stripe/android/uicore/forms/FormFieldEntry;-><init>(Ljava/lang/String;Z)V

    invoke-static {v0, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p0

    return-object p0
.end method

.method private static final getFormFieldValueFlow$lambda$9$lambda$6(Lcom/stripe/android/model/CardBrand;)Lkotlin/Pair;
    .locals 3

    const-string v0, "brand"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 90
    sget-object v0, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;

    invoke-virtual {v0}, Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;->getPreferredCardBrand()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v0

    .line 91
    invoke-virtual {p0}, Lcom/stripe/android/model/CardBrand;->getCode()Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lcom/stripe/android/model/CardBrand;->Unknown:Lcom/stripe/android/model/CardBrand;

    if-ne p0, v2, :cond_0

    const/4 v1, 0x0

    .line 90
    :cond_0
    new-instance p0, Lcom/stripe/android/uicore/forms/FormFieldEntry;

    const/4 v2, 0x1

    invoke-direct {p0, v1, v2}, Lcom/stripe/android/uicore/forms/FormFieldEntry;-><init>(Ljava/lang/String;Z)V

    invoke-static {v0, p0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p0

    return-object p0
.end method

.method private static final getFormFieldValueFlow$lambda$9$lambda$7(Lcom/stripe/android/uicore/forms/FormFieldEntry;)Lkotlin/Pair;
    .locals 2

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 99
    sget-object v0, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;

    invoke-virtual {v0}, Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;->getCardExpMonth()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v0

    sget-object v1, Lcom/stripe/android/ui/core/elements/CardDetailsUtil;->INSTANCE:Lcom/stripe/android/ui/core/elements/CardDetailsUtil;

    invoke-virtual {v1, p0}, Lcom/stripe/android/ui/core/elements/CardDetailsUtil;->getExpiryMonthFormFieldEntry$payments_ui_core_release(Lcom/stripe/android/uicore/forms/FormFieldEntry;)Lcom/stripe/android/uicore/forms/FormFieldEntry;

    move-result-object p0

    invoke-static {v0, p0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p0

    return-object p0
.end method

.method private static final getFormFieldValueFlow$lambda$9$lambda$8(Lcom/stripe/android/uicore/forms/FormFieldEntry;)Lkotlin/Pair;
    .locals 2

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 104
    sget-object v0, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;

    invoke-virtual {v0}, Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;->getCardExpYear()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v0

    sget-object v1, Lcom/stripe/android/ui/core/elements/CardDetailsUtil;->INSTANCE:Lcom/stripe/android/ui/core/elements/CardDetailsUtil;

    invoke-virtual {v1, p0}, Lcom/stripe/android/ui/core/elements/CardDetailsUtil;->getExpiryYearFormFieldEntry$payments_ui_core_release(Lcom/stripe/android/uicore/forms/FormFieldEntry;)Lcom/stripe/android/uicore/forms/FormFieldEntry;

    move-result-object p0

    invoke-static {v0, p0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public getAllowsUserInteraction()Z
    .locals 1

    .line 41
    iget-boolean v0, p0, Lcom/stripe/android/ui/core/elements/CardDetailsElement;->allowsUserInteraction:Z

    return v0
.end method

.method public final getController()Lcom/stripe/android/ui/core/elements/CardDetailsController;
    .locals 1

    .line 31
    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/CardDetailsElement;->controller:Lcom/stripe/android/ui/core/elements/CardDetailsController;

    return-object v0
.end method

.method public getFormFieldValueFlow()Lkotlinx/coroutines/flow/StateFlow;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Ljava/util/List<",
            "Lkotlin/Pair<",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
            "Lcom/stripe/android/uicore/forms/FormFieldEntry;",
            ">;>;>;"
        }
    .end annotation

    .line 64
    invoke-static {}, Lkotlin/collections/CollectionsKt;->createListBuilder()Ljava/util/List;

    move-result-object v0

    .line 65
    iget-object v1, p0, Lcom/stripe/android/ui/core/elements/CardDetailsElement;->controller:Lcom/stripe/android/ui/core/elements/CardDetailsController;

    invoke-virtual {v1}, Lcom/stripe/android/ui/core/elements/CardDetailsController;->getNameElement()Lcom/stripe/android/uicore/elements/SimpleTextElement;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 67
    iget-object v1, p0, Lcom/stripe/android/ui/core/elements/CardDetailsElement;->controller:Lcom/stripe/android/ui/core/elements/CardDetailsController;

    invoke-virtual {v1}, Lcom/stripe/android/ui/core/elements/CardDetailsController;->getNameElement()Lcom/stripe/android/uicore/elements/SimpleTextElement;

    move-result-object v1

    invoke-virtual {v1}, Lcom/stripe/android/uicore/elements/SimpleTextElement;->getController()Lcom/stripe/android/uicore/elements/TextFieldController;

    move-result-object v1

    invoke-interface {v1}, Lcom/stripe/android/uicore/elements/TextFieldController;->getFormFieldValue()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v1

    new-instance v2, Lcom/stripe/android/ui/core/elements/CardDetailsElement$$ExternalSyntheticLambda0;

    invoke-direct {v2, p0}, Lcom/stripe/android/ui/core/elements/CardDetailsElement$$ExternalSyntheticLambda0;-><init>(Lcom/stripe/android/ui/core/elements/CardDetailsElement;)V

    invoke-static {v1, v2}, Lcom/stripe/android/uicore/utils/StateFlowsKt;->mapAsStateFlow(Lkotlinx/coroutines/flow/StateFlow;Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v1

    .line 66
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 73
    :cond_0
    iget-object v1, p0, Lcom/stripe/android/ui/core/elements/CardDetailsElement;->controller:Lcom/stripe/android/ui/core/elements/CardDetailsController;

    invoke-virtual {v1}, Lcom/stripe/android/ui/core/elements/CardDetailsController;->getNumberElement()Lcom/stripe/android/ui/core/elements/CardNumberElement;

    move-result-object v1

    invoke-virtual {v1}, Lcom/stripe/android/ui/core/elements/CardNumberElement;->getController()Lcom/stripe/android/ui/core/elements/CardNumberController;

    move-result-object v1

    invoke-virtual {v1}, Lcom/stripe/android/ui/core/elements/CardNumberController;->getFormFieldValue()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v1

    new-instance v2, Lcom/stripe/android/ui/core/elements/CardDetailsElement$$ExternalSyntheticLambda1;

    invoke-direct {v2, p0}, Lcom/stripe/android/ui/core/elements/CardDetailsElement$$ExternalSyntheticLambda1;-><init>(Lcom/stripe/android/ui/core/elements/CardDetailsElement;)V

    invoke-static {v1, v2}, Lcom/stripe/android/uicore/utils/StateFlowsKt;->mapAsStateFlow(Lkotlinx/coroutines/flow/StateFlow;Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v1

    .line 72
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 78
    iget-object v1, p0, Lcom/stripe/android/ui/core/elements/CardDetailsElement;->controller:Lcom/stripe/android/ui/core/elements/CardDetailsController;

    invoke-virtual {v1}, Lcom/stripe/android/ui/core/elements/CardDetailsController;->getCvcElement()Lcom/stripe/android/ui/core/elements/CvcElement;

    move-result-object v1

    invoke-virtual {v1}, Lcom/stripe/android/ui/core/elements/CvcElement;->getController()Lcom/stripe/android/ui/core/elements/CvcController;

    move-result-object v1

    invoke-virtual {v1}, Lcom/stripe/android/ui/core/elements/CvcController;->getFormFieldValue()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v1

    new-instance v2, Lcom/stripe/android/ui/core/elements/CardDetailsElement$$ExternalSyntheticLambda2;

    invoke-direct {v2, p0}, Lcom/stripe/android/ui/core/elements/CardDetailsElement$$ExternalSyntheticLambda2;-><init>(Lcom/stripe/android/ui/core/elements/CardDetailsElement;)V

    invoke-static {v1, v2}, Lcom/stripe/android/uicore/utils/StateFlowsKt;->mapAsStateFlow(Lkotlinx/coroutines/flow/StateFlow;Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v1

    .line 77
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 83
    iget-object v1, p0, Lcom/stripe/android/ui/core/elements/CardDetailsElement;->controller:Lcom/stripe/android/ui/core/elements/CardDetailsController;

    invoke-virtual {v1}, Lcom/stripe/android/ui/core/elements/CardDetailsController;->getNumberElement()Lcom/stripe/android/ui/core/elements/CardNumberElement;

    move-result-object v1

    invoke-virtual {v1}, Lcom/stripe/android/ui/core/elements/CardNumberElement;->getController()Lcom/stripe/android/ui/core/elements/CardNumberController;

    move-result-object v1

    invoke-virtual {v1}, Lcom/stripe/android/ui/core/elements/CardNumberController;->getCardBrandFlow()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v1

    new-instance v2, Lcom/stripe/android/ui/core/elements/CardDetailsElement$$ExternalSyntheticLambda3;

    invoke-direct {v2}, Lcom/stripe/android/ui/core/elements/CardDetailsElement$$ExternalSyntheticLambda3;-><init>()V

    invoke-static {v1, v2}, Lcom/stripe/android/uicore/utils/StateFlowsKt;->mapAsStateFlow(Lkotlinx/coroutines/flow/StateFlow;Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v1

    .line 82
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 87
    iget-object v1, p0, Lcom/stripe/android/ui/core/elements/CardDetailsElement;->cbcEligibility:Lcom/stripe/android/ui/core/cbc/CardBrandChoiceEligibility;

    instance-of v1, v1, Lcom/stripe/android/ui/core/cbc/CardBrandChoiceEligibility$Eligible;

    if-eqz v1, :cond_1

    .line 89
    iget-object v1, p0, Lcom/stripe/android/ui/core/elements/CardDetailsElement;->controller:Lcom/stripe/android/ui/core/elements/CardDetailsController;

    invoke-virtual {v1}, Lcom/stripe/android/ui/core/elements/CardDetailsController;->getNumberElement()Lcom/stripe/android/ui/core/elements/CardNumberElement;

    move-result-object v1

    invoke-virtual {v1}, Lcom/stripe/android/ui/core/elements/CardNumberElement;->getController()Lcom/stripe/android/ui/core/elements/CardNumberController;

    move-result-object v1

    invoke-virtual {v1}, Lcom/stripe/android/ui/core/elements/CardNumberController;->getSelectedCardBrandFlow()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v1

    new-instance v2, Lcom/stripe/android/ui/core/elements/CardDetailsElement$$ExternalSyntheticLambda4;

    invoke-direct {v2}, Lcom/stripe/android/ui/core/elements/CardDetailsElement$$ExternalSyntheticLambda4;-><init>()V

    invoke-static {v1, v2}, Lcom/stripe/android/uicore/utils/StateFlowsKt;->mapAsStateFlow(Lkotlinx/coroutines/flow/StateFlow;Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v1

    .line 88
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 98
    :cond_1
    iget-object v1, p0, Lcom/stripe/android/ui/core/elements/CardDetailsElement;->controller:Lcom/stripe/android/ui/core/elements/CardDetailsController;

    invoke-virtual {v1}, Lcom/stripe/android/ui/core/elements/CardDetailsController;->getExpirationDateElement()Lcom/stripe/android/uicore/elements/SimpleTextElement;

    move-result-object v1

    invoke-virtual {v1}, Lcom/stripe/android/uicore/elements/SimpleTextElement;->getController()Lcom/stripe/android/uicore/elements/TextFieldController;

    move-result-object v1

    invoke-interface {v1}, Lcom/stripe/android/uicore/elements/TextFieldController;->getFormFieldValue()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v1

    new-instance v2, Lcom/stripe/android/ui/core/elements/CardDetailsElement$$ExternalSyntheticLambda5;

    invoke-direct {v2}, Lcom/stripe/android/ui/core/elements/CardDetailsElement$$ExternalSyntheticLambda5;-><init>()V

    invoke-static {v1, v2}, Lcom/stripe/android/uicore/utils/StateFlowsKt;->mapAsStateFlow(Lkotlinx/coroutines/flow/StateFlow;Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v1

    .line 97
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 103
    iget-object v1, p0, Lcom/stripe/android/ui/core/elements/CardDetailsElement;->controller:Lcom/stripe/android/ui/core/elements/CardDetailsController;

    invoke-virtual {v1}, Lcom/stripe/android/ui/core/elements/CardDetailsController;->getExpirationDateElement()Lcom/stripe/android/uicore/elements/SimpleTextElement;

    move-result-object v1

    invoke-virtual {v1}, Lcom/stripe/android/uicore/elements/SimpleTextElement;->getController()Lcom/stripe/android/uicore/elements/TextFieldController;

    move-result-object v1

    invoke-interface {v1}, Lcom/stripe/android/uicore/elements/TextFieldController;->getFormFieldValue()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v1

    new-instance v2, Lcom/stripe/android/ui/core/elements/CardDetailsElement$$ExternalSyntheticLambda6;

    invoke-direct {v2}, Lcom/stripe/android/ui/core/elements/CardDetailsElement$$ExternalSyntheticLambda6;-><init>()V

    invoke-static {v1, v2}, Lcom/stripe/android/uicore/utils/StateFlowsKt;->mapAsStateFlow(Lkotlinx/coroutines/flow/StateFlow;Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v1

    .line 102
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 64
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->build(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    .line 114
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 115
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v1

    .line 108
    check-cast v1, Ljava/lang/Iterable;

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->toList(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v1

    .line 115
    invoke-static {v1}, Lcom/stripe/android/uicore/utils/StateFlowsKt;->stateFlowOf(Ljava/lang/Object;)Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v1

    check-cast v1, Lkotlinx/coroutines/flow/Flow;

    goto :goto_0

    .line 118
    :cond_2
    move-object v1, v0

    check-cast v1, Ljava/lang/Iterable;

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->toList(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/util/Collection;

    const/4 v2, 0x0

    .line 122
    new-array v2, v2, [Lkotlinx/coroutines/flow/Flow;

    invoke-interface {v1, v2}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v1

    .line 118
    check-cast v1, [Lkotlinx/coroutines/flow/Flow;

    .line 124
    new-instance v2, Lcom/stripe/android/ui/core/elements/CardDetailsElement$getFormFieldValueFlow$$inlined$combineAsStateFlow$1;

    invoke-direct {v2, v1}, Lcom/stripe/android/ui/core/elements/CardDetailsElement$getFormFieldValueFlow$$inlined$combineAsStateFlow$1;-><init>([Lkotlinx/coroutines/flow/Flow;)V

    move-object v1, v2

    check-cast v1, Lkotlinx/coroutines/flow/Flow;

    .line 125
    :goto_0
    new-instance v2, Lcom/stripe/android/ui/core/elements/CardDetailsElement$getFormFieldValueFlow$$inlined$combineAsStateFlow$2;

    invoke-direct {v2, v0}, Lcom/stripe/android/ui/core/elements/CardDetailsElement$getFormFieldValueFlow$$inlined$combineAsStateFlow$2;-><init>(Ljava/util/List;)V

    check-cast v2, Lkotlin/jvm/functions/Function0;

    .line 113
    new-instance v0, Lcom/stripe/android/uicore/utils/FlowToStateFlow;

    invoke-direct {v0, v1, v2}, Lcom/stripe/android/uicore/utils/FlowToStateFlow;-><init>(Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function0;)V

    check-cast v0, Lkotlinx/coroutines/flow/StateFlow;

    return-object v0
.end method

.method public getMandateText()Lcom/stripe/android/core/strings/ResolvableString;
    .locals 1

    .line 42
    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/CardDetailsElement;->mandateText:Lcom/stripe/android/core/strings/ResolvableString;

    return-object v0
.end method

.method public getTextFieldIdentifiers()Lkotlinx/coroutines/flow/StateFlow;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Ljava/util/List<",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
            ">;>;"
        }
    .end annotation

    const/4 v0, 0x6

    .line 54
    new-array v0, v0, [Lcom/stripe/android/uicore/elements/IdentifierSpec;

    iget-object v1, p0, Lcom/stripe/android/ui/core/elements/CardDetailsElement;->controller:Lcom/stripe/android/ui/core/elements/CardDetailsController;

    invoke-virtual {v1}, Lcom/stripe/android/ui/core/elements/CardDetailsController;->getNameElement()Lcom/stripe/android/uicore/elements/SimpleTextElement;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lcom/stripe/android/uicore/elements/SimpleTextElement;->getIdentifier()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v1

    goto :goto_0

    :cond_0
    move-object v1, v2

    :goto_0
    const/4 v3, 0x0

    aput-object v1, v0, v3

    .line 55
    iget-object v1, p0, Lcom/stripe/android/ui/core/elements/CardDetailsElement;->controller:Lcom/stripe/android/ui/core/elements/CardDetailsController;

    invoke-virtual {v1}, Lcom/stripe/android/ui/core/elements/CardDetailsController;->getNumberElement()Lcom/stripe/android/ui/core/elements/CardNumberElement;

    move-result-object v1

    invoke-virtual {v1}, Lcom/stripe/android/ui/core/elements/CardNumberElement;->getIdentifier()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v1

    const/4 v3, 0x1

    aput-object v1, v0, v3

    .line 56
    iget-object v1, p0, Lcom/stripe/android/ui/core/elements/CardDetailsElement;->controller:Lcom/stripe/android/ui/core/elements/CardDetailsController;

    invoke-virtual {v1}, Lcom/stripe/android/ui/core/elements/CardDetailsController;->getExpirationDateElement()Lcom/stripe/android/uicore/elements/SimpleTextElement;

    move-result-object v1

    invoke-virtual {v1}, Lcom/stripe/android/uicore/elements/SimpleTextElement;->getIdentifier()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v1

    const/4 v3, 0x2

    aput-object v1, v0, v3

    .line 57
    iget-object v1, p0, Lcom/stripe/android/ui/core/elements/CardDetailsElement;->controller:Lcom/stripe/android/ui/core/elements/CardDetailsController;

    invoke-virtual {v1}, Lcom/stripe/android/ui/core/elements/CardDetailsController;->getCvcElement()Lcom/stripe/android/ui/core/elements/CvcElement;

    move-result-object v1

    invoke-virtual {v1}, Lcom/stripe/android/ui/core/elements/CvcElement;->getIdentifier()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v1

    const/4 v3, 0x3

    aput-object v1, v0, v3

    .line 58
    sget-object v1, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;

    invoke-virtual {v1}, Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;->getCardBrand()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v1

    const/4 v3, 0x4

    aput-object v1, v0, v3

    .line 59
    sget-object v1, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;

    invoke-virtual {v1}, Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;->getPreferredCardBrand()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v1

    iget-object v3, p0, Lcom/stripe/android/ui/core/elements/CardDetailsElement;->cbcEligibility:Lcom/stripe/android/ui/core/cbc/CardBrandChoiceEligibility;

    instance-of v3, v3, Lcom/stripe/android/ui/core/cbc/CardBrandChoiceEligibility$Eligible;

    if-eqz v3, :cond_1

    move-object v2, v1

    :cond_1
    const/4 v1, 0x5

    aput-object v2, v0, v1

    .line 53
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOfNotNull([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    .line 52
    invoke-static {v0}, Lcom/stripe/android/uicore/utils/StateFlowsKt;->stateFlowOf(Ljava/lang/Object;)Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v0

    return-object v0
.end method

.method public final isCardScanEnabled()Z
    .locals 1

    .line 39
    iget-boolean v0, p0, Lcom/stripe/android/ui/core/elements/CardDetailsElement;->isCardScanEnabled:Z

    return v0
.end method

.method public sectionFieldErrorController()Lcom/stripe/android/uicore/elements/SectionFieldErrorController;
    .locals 1

    .line 45
    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/CardDetailsElement;->controller:Lcom/stripe/android/ui/core/elements/CardDetailsController;

    check-cast v0, Lcom/stripe/android/uicore/elements/SectionFieldErrorController;

    return-object v0
.end method

.method public setRawValue(Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const-string v0, "rawValuesMap"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method
