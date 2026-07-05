.class public final Lcom/stripe/android/ui/core/elements/CardDetailsController;
.super Ljava/lang/Object;
.source "CardDetailsController.kt"

# interfaces
.implements Lcom/stripe/android/uicore/elements/SectionFieldErrorController;
.implements Lcom/stripe/android/uicore/elements/SectionFieldComposable;


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nCardDetailsController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CardDetailsController.kt\ncom/stripe/android/ui/core/elements/CardDetailsController\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 StateFlows.kt\ncom/stripe/android/uicore/utils/StateFlowsKt\n+ 4 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt\n+ 5 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 6 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,141:1\n1557#2:142\n1628#2,3:143\n1557#2:146\n1628#2,3:147\n203#3,5:150\n211#3:162\n283#4:155\n284#4:160\n37#5:156\n36#5,3:157\n105#6:161\n*S KotlinDebug\n*F\n+ 1 CardDetailsController.kt\ncom/stripe/android/ui/core/elements/CardDetailsController\n*L\n118#1:142\n118#1:143,3\n119#1:146\n119#1:147,3\n111#1:150,5\n111#1:162\n111#1:155\n111#1:160\n111#1:156\n111#1:157,3\n111#1:161\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0008\u0003\u0008\u0001\u0018\u00002\u00020\u00012\u00020\u0002BW\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00080\u0006\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\n\u0012\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u000c\u0012\u0008\u0008\u0002\u0010\r\u001a\u00020\u000e\u0012\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u000e\u0012\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u0011\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J=\u00103\u001a\u0002042\u0006\u00105\u001a\u00020\n2\u0006\u00106\u001a\u00020+2\u0006\u00107\u001a\u0002082\u000c\u00109\u001a\u0008\u0012\u0004\u0012\u00020\u00070:2\u0008\u0010;\u001a\u0004\u0018\u00010\u0007H\u0017\u00a2\u0006\u0002\u0010<R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0016\u0010\u0017R\u0015\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u00a2\u0006\n\n\u0002\u0010\u001c\u001a\u0004\u0008\u001a\u0010\u001bR\u0011\u0010\u001d\u001a\u00020\u001e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001f\u0010 R\u0011\u0010!\u001a\u00020\"\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008#\u0010$R\u0011\u0010%\u001a\u00020\u0015\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008&\u0010\u0017R\u0014\u0010\'\u001a\u0008\u0012\u0004\u0012\u00020)0(X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010*\u001a\u0008\u0012\u0004\u0012\u00020+0(\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008,\u0010-R\u001c\u0010.\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001000/X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00081\u00102\u00a8\u0006="
    }
    d2 = {
        "Lcom/stripe/android/ui/core/elements/CardDetailsController;",
        "Lcom/stripe/android/uicore/elements/SectionFieldErrorController;",
        "Lcom/stripe/android/uicore/elements/SectionFieldComposable;",
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
        "uiContext",
        "Lkotlin/coroutines/CoroutineContext;",
        "workContext",
        "cardBrandFilter",
        "Lcom/stripe/android/CardBrandFilter;",
        "<init>",
        "(Lcom/stripe/android/cards/CardAccountRangeRepository$Factory;Ljava/util/Map;ZLcom/stripe/android/ui/core/cbc/CardBrandChoiceEligibility;Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext;Lcom/stripe/android/CardBrandFilter;)V",
        "nameElement",
        "Lcom/stripe/android/uicore/elements/SimpleTextElement;",
        "getNameElement",
        "()Lcom/stripe/android/uicore/elements/SimpleTextElement;",
        "label",
        "",
        "getLabel",
        "()Ljava/lang/Integer;",
        "Ljava/lang/Integer;",
        "numberElement",
        "Lcom/stripe/android/ui/core/elements/CardNumberElement;",
        "getNumberElement",
        "()Lcom/stripe/android/ui/core/elements/CardNumberElement;",
        "cvcElement",
        "Lcom/stripe/android/ui/core/elements/CvcElement;",
        "getCvcElement",
        "()Lcom/stripe/android/ui/core/elements/CvcElement;",
        "expirationDateElement",
        "getExpirationDateElement",
        "rowFields",
        "",
        "Lcom/stripe/android/uicore/elements/SectionSingleFieldElement;",
        "fields",
        "Lcom/stripe/android/uicore/elements/SectionFieldElement;",
        "getFields",
        "()Ljava/util/List;",
        "error",
        "Lkotlinx/coroutines/flow/StateFlow;",
        "Lcom/stripe/android/uicore/elements/FieldError;",
        "getError",
        "()Lkotlinx/coroutines/flow/StateFlow;",
        "ComposeUI",
        "",
        "enabled",
        "field",
        "modifier",
        "Landroidx/compose/ui/Modifier;",
        "hiddenIdentifiers",
        "",
        "lastTextFieldIdentifier",
        "(ZLcom/stripe/android/uicore/elements/SectionFieldElement;Landroidx/compose/ui/Modifier;Ljava/util/Set;Lcom/stripe/android/uicore/elements/IdentifierSpec;Landroidx/compose/runtime/Composer;I)V",
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
.field private final cvcElement:Lcom/stripe/android/ui/core/elements/CvcElement;

.field private final error:Lkotlinx/coroutines/flow/StateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Lcom/stripe/android/uicore/elements/FieldError;",
            ">;"
        }
    .end annotation
.end field

.field private final expirationDateElement:Lcom/stripe/android/uicore/elements/SimpleTextElement;

.field private final fields:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/stripe/android/uicore/elements/SectionFieldElement;",
            ">;"
        }
    .end annotation
.end field

.field private final label:Ljava/lang/Integer;

.field private final nameElement:Lcom/stripe/android/uicore/elements/SimpleTextElement;

.field private final numberElement:Lcom/stripe/android/ui/core/elements/CardNumberElement;

.field private final rowFields:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/stripe/android/uicore/elements/SectionSingleFieldElement;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/cards/CardAccountRangeRepository$Factory;Ljava/util/Map;ZLcom/stripe/android/ui/core/cbc/CardBrandChoiceEligibility;Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext;Lcom/stripe/android/CardBrandFilter;)V
    .locals 25
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/cards/CardAccountRangeRepository$Factory;",
            "Ljava/util/Map<",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
            "Ljava/lang/String;",
            ">;Z",
            "Lcom/stripe/android/ui/core/cbc/CardBrandChoiceEligibility;",
            "Lkotlin/coroutines/CoroutineContext;",
            "Lkotlin/coroutines/CoroutineContext;",
            "Lcom/stripe/android/CardBrandFilter;",
            ")V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    move-object/from16 v2, p4

    move-object/from16 v11, p7

    const-string v3, "cardAccountRangeRepositoryFactory"

    move-object/from16 v4, p1

    invoke-static {v4, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "initialValues"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "cbcEligibility"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "uiContext"

    move-object/from16 v5, p5

    invoke-static {v5, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "workContext"

    move-object/from16 v6, p6

    invoke-static {v6, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "cardBrandFilter"

    invoke-static {v11, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    const/4 v14, 0x4

    const/4 v15, 0x0

    const/4 v3, 0x0

    if-eqz p3, :cond_0

    .line 40
    new-instance v16, Lcom/stripe/android/uicore/elements/SimpleTextFieldController;

    .line 41
    new-instance v17, Lcom/stripe/android/uicore/elements/SimpleTextFieldConfig;

    .line 42
    sget v7, Lcom/stripe/android/ui/core/R$string;->stripe_name_on_card:I

    new-array v8, v15, [Ljava/lang/Object;

    invoke-static {v7, v8, v3, v14, v3}, Lcom/stripe/android/core/strings/ResolvableStringUtilsKt;->resolvableString$default(I[Ljava/lang/Object;Ljava/util/List;ILjava/lang/Object;)Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object v18

    .line 43
    sget-object v7, Landroidx/compose/ui/text/input/KeyboardCapitalization;->Companion:Landroidx/compose/ui/text/input/KeyboardCapitalization$Companion;

    invoke-virtual {v7}, Landroidx/compose/ui/text/input/KeyboardCapitalization$Companion;->getWords-IUNYP9k()I

    move-result v19

    .line 44
    sget-object v7, Landroidx/compose/ui/text/input/KeyboardType;->Companion:Landroidx/compose/ui/text/input/KeyboardType$Companion;

    invoke-virtual {v7}, Landroidx/compose/ui/text/input/KeyboardType$Companion;->getText-PjHm6EE()I

    move-result v20

    const/16 v22, 0x8

    const/16 v23, 0x0

    const/16 v21, 0x0

    .line 41
    invoke-direct/range {v17 .. v23}, Lcom/stripe/android/uicore/elements/SimpleTextFieldConfig;-><init>(Lcom/stripe/android/core/strings/ResolvableString;IILkotlinx/coroutines/flow/MutableStateFlow;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    check-cast v17, Lcom/stripe/android/uicore/elements/TextFieldConfig;

    .line 46
    sget-object v7, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;

    invoke-virtual {v7}, Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;->getName()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v7

    invoke-interface {v1, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    move-object/from16 v19, v7

    check-cast v19, Ljava/lang/String;

    const/16 v21, 0xa

    const/16 v22, 0x0

    const/16 v18, 0x0

    const/16 v20, 0x0

    .line 40
    invoke-direct/range {v16 .. v22}, Lcom/stripe/android/uicore/elements/SimpleTextFieldController;-><init>(Lcom/stripe/android/uicore/elements/TextFieldConfig;ZLjava/lang/String;Lkotlin/jvm/functions/Function1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 48
    sget-object v7, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;

    invoke-virtual {v7}, Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;->getName()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v7

    .line 39
    new-instance v8, Lcom/stripe/android/uicore/elements/SimpleTextElement;

    .line 40
    move-object/from16 v9, v16

    check-cast v9, Lcom/stripe/android/uicore/elements/TextFieldController;

    .line 39
    invoke-direct {v8, v7, v9}, Lcom/stripe/android/uicore/elements/SimpleTextElement;-><init>(Lcom/stripe/android/uicore/elements/IdentifierSpec;Lcom/stripe/android/uicore/elements/TextFieldController;)V

    move-object v7, v8

    goto :goto_0

    :cond_0
    move-object v7, v3

    .line 38
    :goto_0
    iput-object v7, v0, Lcom/stripe/android/ui/core/elements/CardDetailsController;->nameElement:Lcom/stripe/android/uicore/elements/SimpleTextElement;

    .line 56
    sget-object v8, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;

    invoke-virtual {v8}, Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;->getCardNumber()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v8

    move-object v9, v3

    .line 58
    new-instance v3, Lcom/stripe/android/ui/core/elements/CardNumberConfig;

    .line 59
    sget-object v10, Lcom/stripe/android/ui/core/cbc/CardBrandChoiceEligibility$Ineligible;->INSTANCE:Lcom/stripe/android/ui/core/cbc/CardBrandChoiceEligibility$Ineligible;

    invoke-static {v2, v10}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    const/16 v16, 0x1

    xor-int/lit8 v10, v10, 0x1

    .line 58
    invoke-direct {v3, v10, v11}, Lcom/stripe/android/ui/core/elements/CardNumberConfig;-><init>(ZLcom/stripe/android/CardBrandFilter;)V

    .line 62
    invoke-interface {v4}, Lcom/stripe/android/cards/CardAccountRangeRepository$Factory;->create()Lcom/stripe/android/cards/CardAccountRangeRepository;

    move-result-object v4

    .line 65
    sget-object v10, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;

    invoke-virtual {v10}, Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;->getCardNumber()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v10

    invoke-interface {v1, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/String;

    .line 67
    instance-of v12, v2, Lcom/stripe/android/ui/core/cbc/CardBrandChoiceEligibility$Eligible;

    if-eqz v12, :cond_2

    .line 68
    check-cast v2, Lcom/stripe/android/ui/core/cbc/CardBrandChoiceEligibility$Eligible;

    invoke-virtual {v2}, Lcom/stripe/android/ui/core/cbc/CardBrandChoiceEligibility$Eligible;->getPreferredNetworks()Ljava/util/List;

    move-result-object v2

    .line 70
    sget-object v12, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;

    invoke-virtual {v12}, Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;->getPreferredCardBrand()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v12

    .line 69
    invoke-interface {v1, v12}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/lang/String;

    if-eqz v12, :cond_1

    .line 72
    sget-object v13, Lcom/stripe/android/model/CardBrand;->Companion:Lcom/stripe/android/model/CardBrand$Companion;

    invoke-virtual {v13, v12}, Lcom/stripe/android/model/CardBrand$Companion;->fromCode(Ljava/lang/String;)Lcom/stripe/android/model/CardBrand;

    move-result-object v12

    goto :goto_1

    :cond_1
    move-object v12, v9

    .line 67
    :goto_1
    new-instance v13, Lcom/stripe/android/ui/core/elements/CardBrandChoiceConfig$Eligible;

    invoke-direct {v13, v2, v12}, Lcom/stripe/android/ui/core/elements/CardBrandChoiceConfig$Eligible;-><init>(Ljava/util/List;Lcom/stripe/android/model/CardBrand;)V

    check-cast v13, Lcom/stripe/android/ui/core/elements/CardBrandChoiceConfig;

    goto :goto_2

    .line 75
    :cond_2
    instance-of v2, v2, Lcom/stripe/android/ui/core/cbc/CardBrandChoiceEligibility$Ineligible;

    if-eqz v2, :cond_7

    sget-object v2, Lcom/stripe/android/ui/core/elements/CardBrandChoiceConfig$Ineligible;->INSTANCE:Lcom/stripe/android/ui/core/elements/CardBrandChoiceConfig$Ineligible;

    move-object v13, v2

    check-cast v13, Lcom/stripe/android/ui/core/elements/CardBrandChoiceConfig;

    .line 57
    :goto_2
    new-instance v2, Lcom/stripe/android/ui/core/elements/DefaultCardNumberController;

    move-object v12, v7

    const/4 v7, 0x0

    move-object/from16 v17, v9

    const/4 v9, 0x0

    move-object/from16 v18, v12

    const/16 v12, 0x50

    move-object/from16 v19, v8

    move-object v8, v10

    move-object v10, v13

    const/4 v13, 0x0

    move-object/from16 v24, v19

    move/from16 v19, v15

    move-object/from16 v15, v24

    invoke-direct/range {v2 .. v13}, Lcom/stripe/android/ui/core/elements/DefaultCardNumberController;-><init>(Lcom/stripe/android/ui/core/elements/CardNumberConfig;Lcom/stripe/android/cards/CardAccountRangeRepository;Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext;Lcom/stripe/android/cards/StaticCardAccountRanges;Ljava/lang/String;ZLcom/stripe/android/ui/core/elements/CardBrandChoiceConfig;Lcom/stripe/android/CardBrandFilter;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    check-cast v2, Lcom/stripe/android/ui/core/elements/CardNumberController;

    .line 55
    new-instance v3, Lcom/stripe/android/ui/core/elements/CardNumberElement;

    invoke-direct {v3, v15, v2}, Lcom/stripe/android/ui/core/elements/CardNumberElement;-><init>(Lcom/stripe/android/uicore/elements/IdentifierSpec;Lcom/stripe/android/ui/core/elements/CardNumberController;)V

    iput-object v3, v0, Lcom/stripe/android/ui/core/elements/CardDetailsController;->numberElement:Lcom/stripe/android/ui/core/elements/CardNumberElement;

    .line 81
    new-instance v2, Lcom/stripe/android/ui/core/elements/CvcElement;

    .line 82
    sget-object v4, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;

    invoke-virtual {v4}, Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;->getCardCvc()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v4

    .line 83
    new-instance v5, Lcom/stripe/android/ui/core/elements/CvcController;

    .line 84
    new-instance v6, Lcom/stripe/android/ui/core/elements/CvcConfig;

    invoke-direct {v6}, Lcom/stripe/android/ui/core/elements/CvcConfig;-><init>()V

    .line 85
    invoke-virtual {v3}, Lcom/stripe/android/ui/core/elements/CardNumberElement;->getController()Lcom/stripe/android/ui/core/elements/CardNumberController;

    move-result-object v7

    invoke-virtual {v7}, Lcom/stripe/android/ui/core/elements/CardNumberController;->getCardBrandFlow()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v7

    .line 86
    sget-object v8, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;

    invoke-virtual {v8}, Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;->getCardCvc()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v8

    invoke-interface {v1, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/String;

    const/16 v10, 0x8

    const/4 v11, 0x0

    .line 83
    invoke-direct/range {v5 .. v11}, Lcom/stripe/android/ui/core/elements/CvcController;-><init>(Lcom/stripe/android/ui/core/elements/CvcConfig;Lkotlinx/coroutines/flow/StateFlow;Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 81
    invoke-direct {v2, v4, v5}, Lcom/stripe/android/ui/core/elements/CvcElement;-><init>(Lcom/stripe/android/uicore/elements/IdentifierSpec;Lcom/stripe/android/ui/core/elements/CvcController;)V

    iput-object v2, v0, Lcom/stripe/android/ui/core/elements/CardDetailsController;->cvcElement:Lcom/stripe/android/ui/core/elements/CvcElement;

    .line 90
    new-instance v4, Lcom/stripe/android/uicore/elements/SimpleTextElement;

    .line 91
    sget-object v5, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;

    const-string v6, "date"

    invoke-virtual {v5, v6}, Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;->Generic(Ljava/lang/String;)Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v5

    .line 92
    new-instance v6, Lcom/stripe/android/uicore/elements/SimpleTextFieldController;

    .line 93
    new-instance v7, Lcom/stripe/android/uicore/elements/DateConfig;

    invoke-direct {v7}, Lcom/stripe/android/uicore/elements/DateConfig;-><init>()V

    check-cast v7, Lcom/stripe/android/uicore/elements/TextFieldConfig;

    .line 94
    sget-object v8, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;

    invoke-virtual {v8}, Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;->getCardExpMonth()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v8

    invoke-interface {v1, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    .line 95
    sget-object v9, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;

    invoke-virtual {v9}, Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;->getCardExpYear()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v9

    invoke-interface {v1, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    const/4 v9, 0x2

    if-eqz v1, :cond_3

    invoke-static {v1, v9}, Lkotlin/text/StringsKt;->takeLast(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v1

    goto :goto_3

    :cond_3
    move-object/from16 v1, v17

    :goto_3
    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 96
    sget-object v8, Lcom/stripe/android/ui/core/elements/CardDetailsController$expirationDateElement$1;->INSTANCE:Lcom/stripe/android/ui/core/elements/CardDetailsController$expirationDateElement$1;

    check-cast v8, Lkotlin/jvm/functions/Function1;

    const/4 v10, 0x2

    const/4 v11, 0x0

    const/4 v12, 0x0

    move-object/from16 p4, v1

    move-object/from16 p1, v6

    move-object/from16 p2, v7

    move-object/from16 p5, v8

    move/from16 p6, v10

    move-object/from16 p7, v11

    move/from16 p3, v12

    .line 92
    invoke-direct/range {p1 .. p7}, Lcom/stripe/android/uicore/elements/SimpleTextFieldController;-><init>(Lcom/stripe/android/uicore/elements/TextFieldConfig;ZLjava/lang/String;Lkotlin/jvm/functions/Function1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v1, p1

    move-object v6, v1

    check-cast v6, Lcom/stripe/android/uicore/elements/TextFieldController;

    .line 90
    invoke-direct {v4, v5, v6}, Lcom/stripe/android/uicore/elements/SimpleTextElement;-><init>(Lcom/stripe/android/uicore/elements/IdentifierSpec;Lcom/stripe/android/uicore/elements/TextFieldController;)V

    iput-object v4, v0, Lcom/stripe/android/ui/core/elements/CardDetailsController;->expirationDateElement:Lcom/stripe/android/uicore/elements/SimpleTextElement;

    .line 100
    new-array v1, v9, [Lcom/stripe/android/uicore/elements/SectionSingleFieldElement;

    aput-object v4, v1, v19

    aput-object v2, v1, v16

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    iput-object v1, v0, Lcom/stripe/android/ui/core/elements/CardDetailsController;->rowFields:Ljava/util/List;

    const/4 v5, 0x3

    .line 102
    new-array v6, v5, [Lcom/stripe/android/uicore/elements/SectionFieldElement;

    aput-object v18, v6, v19

    .line 103
    aput-object v3, v6, v16

    .line 104
    new-instance v7, Lcom/stripe/android/uicore/elements/RowElement;

    .line 105
    sget-object v8, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v10

    invoke-virtual {v10}, Ljava/util/UUID;->getLeastSignificantBits()J

    move-result-wide v10

    new-instance v12, Ljava/lang/StringBuilder;

    const-string v13, "row_"

    invoke-direct {v12, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v12, v10, v11}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v8, v10}, Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;->Generic(Ljava/lang/String;)Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v8

    .line 107
    new-instance v10, Lcom/stripe/android/uicore/elements/RowController;

    invoke-direct {v10, v1}, Lcom/stripe/android/uicore/elements/RowController;-><init>(Ljava/util/List;)V

    .line 104
    invoke-direct {v7, v8, v1, v10}, Lcom/stripe/android/uicore/elements/RowElement;-><init>(Lcom/stripe/android/uicore/elements/IdentifierSpec;Ljava/util/List;Lcom/stripe/android/uicore/elements/RowController;)V

    aput-object v7, v6, v9

    .line 101
    invoke-static {v6}, Lkotlin/collections/CollectionsKt;->listOfNotNull([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    iput-object v1, v0, Lcom/stripe/android/ui/core/elements/CardDetailsController;->fields:Ljava/util/List;

    .line 113
    new-array v1, v14, [Lcom/stripe/android/uicore/elements/SectionSingleFieldElement;

    aput-object v18, v1, v19

    .line 114
    aput-object v3, v1, v16

    .line 115
    aput-object v4, v1, v9

    .line 116
    aput-object v2, v1, v5

    .line 112
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOfNotNull([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    .line 142
    new-instance v2, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {v1, v3}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v2, v4}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v2, Ljava/util/Collection;

    .line 143
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    .line 144
    check-cast v4, Lcom/stripe/android/uicore/elements/SectionSingleFieldElement;

    .line 118
    invoke-virtual {v4}, Lcom/stripe/android/uicore/elements/SectionSingleFieldElement;->getController()Lcom/stripe/android/uicore/elements/InputController;

    move-result-object v4

    .line 144
    invoke-interface {v2, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_4

    .line 145
    :cond_4
    check-cast v2, Ljava/util/List;

    .line 142
    check-cast v2, Ljava/lang/Iterable;

    .line 146
    new-instance v1, Ljava/util/ArrayList;

    invoke-static {v2, v3}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v1, Ljava/util/Collection;

    .line 147
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_5
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    .line 148
    check-cast v3, Lcom/stripe/android/uicore/elements/InputController;

    .line 119
    invoke-interface {v3}, Lcom/stripe/android/uicore/elements/InputController;->getError()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v3

    .line 148
    invoke-interface {v1, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_5

    .line 149
    :cond_5
    check-cast v1, Ljava/util/List;

    .line 151
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_6

    .line 152
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v2

    .line 121
    check-cast v2, Ljava/lang/Iterable;

    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->filterNotNull(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v2

    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/stripe/android/uicore/elements/FieldError;

    .line 152
    invoke-static {v2}, Lcom/stripe/android/uicore/utils/StateFlowsKt;->stateFlowOf(Ljava/lang/Object;)Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v2

    check-cast v2, Lkotlinx/coroutines/flow/Flow;

    goto :goto_6

    .line 155
    :cond_6
    move-object v2, v1

    check-cast v2, Ljava/lang/Iterable;

    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->toList(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/util/Collection;

    move/from16 v3, v19

    .line 159
    new-array v3, v3, [Lkotlinx/coroutines/flow/Flow;

    invoke-interface {v2, v3}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v2

    .line 155
    check-cast v2, [Lkotlinx/coroutines/flow/Flow;

    .line 161
    new-instance v3, Lcom/stripe/android/ui/core/elements/CardDetailsController$special$$inlined$combineAsStateFlow$1;

    invoke-direct {v3, v2}, Lcom/stripe/android/ui/core/elements/CardDetailsController$special$$inlined$combineAsStateFlow$1;-><init>([Lkotlinx/coroutines/flow/Flow;)V

    move-object v2, v3

    check-cast v2, Lkotlinx/coroutines/flow/Flow;

    .line 162
    :goto_6
    new-instance v3, Lcom/stripe/android/ui/core/elements/CardDetailsController$special$$inlined$combineAsStateFlow$2;

    invoke-direct {v3, v1}, Lcom/stripe/android/ui/core/elements/CardDetailsController$special$$inlined$combineAsStateFlow$2;-><init>(Ljava/util/List;)V

    check-cast v3, Lkotlin/jvm/functions/Function0;

    .line 150
    new-instance v1, Lcom/stripe/android/uicore/utils/FlowToStateFlow;

    invoke-direct {v1, v2, v3}, Lcom/stripe/android/uicore/utils/FlowToStateFlow;-><init>(Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function0;)V

    check-cast v1, Lkotlinx/coroutines/flow/StateFlow;

    .line 111
    iput-object v1, v0, Lcom/stripe/android/ui/core/elements/CardDetailsController;->error:Lkotlinx/coroutines/flow/StateFlow;

    return-void

    .line 66
    :cond_7
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1
.end method

.method public synthetic constructor <init>(Lcom/stripe/android/cards/CardAccountRangeRepository$Factory;Ljava/util/Map;ZLcom/stripe/android/ui/core/cbc/CardBrandChoiceEligibility;Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext;Lcom/stripe/android/CardBrandFilter;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 8

    and-int/lit8 v0, p8, 0x4

    if-eqz v0, :cond_0

    const/4 p3, 0x0

    :cond_0
    move v3, p3

    and-int/lit8 p3, p8, 0x8

    if-eqz p3, :cond_1

    .line 32
    sget-object p3, Lcom/stripe/android/ui/core/cbc/CardBrandChoiceEligibility$Ineligible;->INSTANCE:Lcom/stripe/android/ui/core/cbc/CardBrandChoiceEligibility$Ineligible;

    move-object p4, p3

    check-cast p4, Lcom/stripe/android/ui/core/cbc/CardBrandChoiceEligibility;

    :cond_1
    move-object v4, p4

    and-int/lit8 p3, p8, 0x10

    if-eqz p3, :cond_2

    .line 33
    invoke-static {}, Lkotlinx/coroutines/Dispatchers;->getMain()Lkotlinx/coroutines/MainCoroutineDispatcher;

    move-result-object p3

    move-object p5, p3

    check-cast p5, Lkotlin/coroutines/CoroutineContext;

    :cond_2
    move-object v5, p5

    and-int/lit8 p3, p8, 0x20

    if-eqz p3, :cond_3

    .line 34
    invoke-static {}, Lkotlinx/coroutines/Dispatchers;->getIO()Lkotlinx/coroutines/CoroutineDispatcher;

    move-result-object p3

    move-object p6, p3

    check-cast p6, Lkotlin/coroutines/CoroutineContext;

    :cond_3
    move-object v6, p6

    and-int/lit8 p3, p8, 0x40

    if-eqz p3, :cond_4

    .line 35
    sget-object p3, Lcom/stripe/android/DefaultCardBrandFilter;->INSTANCE:Lcom/stripe/android/DefaultCardBrandFilter;

    check-cast p3, Lcom/stripe/android/CardBrandFilter;

    move-object v7, p3

    goto :goto_0

    :cond_4
    move-object v7, p7

    :goto_0
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    .line 28
    invoke-direct/range {v0 .. v7}, Lcom/stripe/android/ui/core/elements/CardDetailsController;-><init>(Lcom/stripe/android/cards/CardAccountRangeRepository$Factory;Ljava/util/Map;ZLcom/stripe/android/ui/core/cbc/CardBrandChoiceEligibility;Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext;Lcom/stripe/android/CardBrandFilter;)V

    return-void
.end method


# virtual methods
.method public ComposeUI(ZLcom/stripe/android/uicore/elements/SectionFieldElement;Landroidx/compose/ui/Modifier;Ljava/util/Set;Lcom/stripe/android/uicore/elements/IdentifierSpec;Landroidx/compose/runtime/Composer;I)V
    .locals 8
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

    const-string v0, "field"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "modifier"

    invoke-static {p3, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "hiddenIdentifiers"

    invoke-static {p4, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const p2, -0x77c9019

    invoke-interface {p6, p2}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "com.stripe.android.ui.core.elements.CardDetailsController.ComposeUI (CardDetailsController.kt:130)"

    .line 131
    invoke-static {p2, p7, v0, v1}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    :cond_0
    and-int/lit8 p2, p7, 0xe

    shr-int/lit8 v0, p7, 0xc

    and-int/lit8 v0, v0, 0x70

    or-int/2addr p2, v0

    shr-int/lit8 v0, p7, 0x3

    and-int/lit16 v1, v0, 0x380

    or-int/2addr p2, v1

    .line 137
    sget v1, Lcom/stripe/android/uicore/elements/IdentifierSpec;->$stable:I

    shl-int/lit8 v1, v1, 0x9

    or-int/2addr p2, v1

    and-int/lit16 v0, v0, 0x1c00

    or-int/2addr p2, v0

    shl-int/lit8 p7, p7, 0x6

    const v0, 0xe000

    and-int/2addr p7, v0

    or-int v6, p2, p7

    const/4 v7, 0x0

    move-object v1, p0

    move v0, p1

    move-object v4, p3

    move-object v2, p4

    move-object v3, p5

    move-object v5, p6

    .line 132
    invoke-static/range {v0 .. v7}, Lcom/stripe/android/ui/core/elements/CardDetailsElementUIKt;->CardDetailsElementUI(ZLcom/stripe/android/ui/core/elements/CardDetailsController;Ljava/util/Set;Lcom/stripe/android/uicore/elements/IdentifierSpec;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_1
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    return-void
.end method

.method public final getCvcElement()Lcom/stripe/android/ui/core/elements/CvcElement;
    .locals 1

    .line 81
    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/CardDetailsController;->cvcElement:Lcom/stripe/android/ui/core/elements/CvcElement;

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

    .line 111
    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/CardDetailsController;->error:Lkotlinx/coroutines/flow/StateFlow;

    return-object v0
.end method

.method public final getExpirationDateElement()Lcom/stripe/android/uicore/elements/SimpleTextElement;
    .locals 1

    .line 90
    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/CardDetailsController;->expirationDateElement:Lcom/stripe/android/uicore/elements/SimpleTextElement;

    return-object v0
.end method

.method public final getFields()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/stripe/android/uicore/elements/SectionFieldElement;",
            ">;"
        }
    .end annotation

    .line 101
    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/CardDetailsController;->fields:Ljava/util/List;

    return-object v0
.end method

.method public final getLabel()Ljava/lang/Integer;
    .locals 1

    .line 54
    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/CardDetailsController;->label:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getNameElement()Lcom/stripe/android/uicore/elements/SimpleTextElement;
    .locals 1

    .line 38
    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/CardDetailsController;->nameElement:Lcom/stripe/android/uicore/elements/SimpleTextElement;

    return-object v0
.end method

.method public final getNumberElement()Lcom/stripe/android/ui/core/elements/CardNumberElement;
    .locals 1

    .line 55
    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/CardDetailsController;->numberElement:Lcom/stripe/android/ui/core/elements/CardNumberElement;

    return-object v0
.end method
