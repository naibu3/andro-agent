.class final Lcom/stripe/android/link/ui/updatecard/ComposableSingletons$UpdateCardScreenKt$lambda-1$1;
.super Ljava/lang/Object;
.source "UpdateCardScreen.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/link/ui/updatecard/ComposableSingletons$UpdateCardScreenKt;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlin/jvm/functions/Function2<",
        "Landroidx/compose/runtime/Composer;",
        "Ljava/lang/Integer;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nUpdateCardScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UpdateCardScreen.kt\ncom/stripe/android/link/ui/updatecard/ComposableSingletons$UpdateCardScreenKt$lambda-1$1\n+ 2 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n*L\n1#1,155:1\n481#2:156\n480#2,4:157\n484#2,2:164\n488#2:170\n1225#3,3:161\n1228#3,3:167\n1225#3,6:171\n1225#3,6:177\n1225#3,6:183\n480#4:166\n*S KotlinDebug\n*F\n+ 1 UpdateCardScreen.kt\ncom/stripe/android/link/ui/updatecard/ComposableSingletons$UpdateCardScreenKt$lambda-1$1\n*L\n105#1:156\n105#1:157,4\n105#1:164,2\n105#1:170\n105#1:161,3\n105#1:167,3\n135#1:171,6\n136#1:177,6\n150#1:183,6\n105#1:166\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final INSTANCE:Lcom/stripe/android/link/ui/updatecard/ComposableSingletons$UpdateCardScreenKt$lambda-1$1;


# direct methods
.method public static synthetic $r8$lambda$A7ICxUtGjxDCWWPa-vmV4Uzx5oI(Lcom/stripe/android/paymentsheet/CardUpdateParams;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/link/ui/updatecard/ComposableSingletons$UpdateCardScreenKt$lambda-1$1;->invoke$lambda$3$lambda$2(Lcom/stripe/android/paymentsheet/CardUpdateParams;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$T_f4V85flNlJYxTjYrNDgfppcF4()Lkotlin/Unit;
    .locals 1

    invoke-static {}, Lcom/stripe/android/link/ui/updatecard/ComposableSingletons$UpdateCardScreenKt$lambda-1$1;->invoke$lambda$5$lambda$4()Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic $r8$lambda$h1zxPHkcA87cPfaSBApq49JzTFc(Lcom/stripe/android/model/CardBrand;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/link/ui/updatecard/ComposableSingletons$UpdateCardScreenKt$lambda-1$1;->invoke$lambda$1$lambda$0(Lcom/stripe/android/model/CardBrand;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/link/ui/updatecard/ComposableSingletons$UpdateCardScreenKt$lambda-1$1;

    invoke-direct {v0}, Lcom/stripe/android/link/ui/updatecard/ComposableSingletons$UpdateCardScreenKt$lambda-1$1;-><init>()V

    sput-object v0, Lcom/stripe/android/link/ui/updatecard/ComposableSingletons$UpdateCardScreenKt$lambda-1$1;->INSTANCE:Lcom/stripe/android/link/ui/updatecard/ComposableSingletons$UpdateCardScreenKt$lambda-1$1;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static final invoke$lambda$1$lambda$0(Lcom/stripe/android/model/CardBrand;)Lkotlin/Unit;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 135
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method private static final invoke$lambda$3$lambda$2(Lcom/stripe/android/paymentsheet/CardUpdateParams;)Lkotlin/Unit;
    .locals 0

    .line 136
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method private static final invoke$lambda$5$lambda$4()Lkotlin/Unit;
    .locals 1

    .line 150
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 102
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/link/ui/updatecard/ComposableSingletons$UpdateCardScreenKt$lambda-1$1;->invoke(Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/runtime/Composer;I)V
    .locals 23

    move-object/from16 v0, p1

    move/from16 v1, p2

    and-int/lit8 v2, v1, 0x3

    const/4 v3, 0x2

    if-ne v2, v3, :cond_1

    .line 103
    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    .line 151
    :cond_0
    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    return-void

    .line 103
    :cond_1
    :goto_0
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v2

    if-eqz v2, :cond_2

    const/4 v2, -0x1

    const-string v3, "com.stripe.android.link.ui.updatecard.ComposableSingletons$UpdateCardScreenKt.lambda-1.<anonymous> (UpdateCardScreen.kt:102)"

    const v4, -0x32d069a2

    invoke-static {v4, v1, v2, v3}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 104
    :cond_2
    new-instance v5, Lcom/stripe/android/paymentsheet/ui/DefaultEditCardDetailsInteractor$Factory;

    invoke-direct {v5}, Lcom/stripe/android/paymentsheet/ui/DefaultEditCardDetailsInteractor$Factory;-><init>()V

    const v1, 0x2e20b340

    .line 105
    const-string v2, "CC(rememberCoroutineScope)482@20332L144:Effects.kt#9igjgp"

    .line 156
    invoke-static {v0, v1, v2}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    const v1, -0x38e27f50

    .line 159
    const-string v2, "CC(remember):Effects.kt#9igjgp"

    .line 160
    invoke-static {v0, v1, v2}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    .line 161
    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v1

    .line 162
    sget-object v2, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v2}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v2

    if-ne v1, v2, :cond_3

    .line 166
    sget-object v1, Lkotlin/coroutines/EmptyCoroutineContext;->INSTANCE:Lkotlin/coroutines/EmptyCoroutineContext;

    .line 165
    check-cast v1, Lkotlin/coroutines/CoroutineContext;

    invoke-static {v1, v0}, Landroidx/compose/runtime/EffectsKt;->createCompositionCoroutineScope(Lkotlin/coroutines/CoroutineContext;Landroidx/compose/runtime/Composer;)Lkotlinx/coroutines/CoroutineScope;

    move-result-object v1

    .line 164
    new-instance v2, Landroidx/compose/runtime/CompositionScopedCoroutineScopeCanceller;

    invoke-direct {v2, v1}, Landroidx/compose/runtime/CompositionScopedCoroutineScopeCanceller;-><init>(Lkotlinx/coroutines/CoroutineScope;)V

    .line 167
    invoke-interface {v0, v2}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    move-object v1, v2

    .line 160
    :cond_3
    check-cast v1, Landroidx/compose/runtime/CompositionScopedCoroutineScopeCanceller;

    invoke-static {v0}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 170
    invoke-virtual {v1}, Landroidx/compose/runtime/CompositionScopedCoroutineScopeCanceller;->getCoroutineScope()Lkotlinx/coroutines/CoroutineScope;

    move-result-object v6

    .line 156
    invoke-static {v0}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 106
    new-instance v7, Lcom/stripe/android/paymentsheet/ui/CardEditConfiguration;

    .line 107
    sget-object v1, Lcom/stripe/android/DefaultCardBrandFilter;->INSTANCE:Lcom/stripe/android/DefaultCardBrandFilter;

    check-cast v1, Lcom/stripe/android/CardBrandFilter;

    const/4 v2, 0x0

    const/4 v3, 0x1

    .line 106
    invoke-direct {v7, v1, v2, v3}, Lcom/stripe/android/paymentsheet/ui/CardEditConfiguration;-><init>(Lcom/stripe/android/CardBrandFilter;ZZ)V

    .line 111
    sget-object v1, Lcom/stripe/android/paymentsheet/ui/EditCardPayload;->Companion:Lcom/stripe/android/paymentsheet/ui/EditCardPayload$Companion;

    .line 117
    sget-object v17, Lcom/stripe/android/model/CardBrand;->Visa:Lcom/stripe/android/model/CardBrand;

    .line 118
    sget-object v19, Lcom/stripe/android/model/CvcCheck;->Pass:Lcom/stripe/android/model/CvcCheck;

    .line 120
    const-string v2, "VISA"

    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v18

    .line 129
    sget-object v2, Lcom/stripe/android/core/model/CountryCode;->Companion:Lcom/stripe/android/core/model/CountryCode$Companion;

    invoke-virtual {v2}, Lcom/stripe/android/core/model/CountryCode$Companion;->getUS()Lcom/stripe/android/core/model/CountryCode;

    move-result-object v15

    .line 123
    new-instance v13, Lcom/stripe/android/model/ConsumerPaymentDetails$BillingAddress;

    move-object v8, v13

    const/4 v13, 0x0

    .line 130
    const-string v14, "42424"

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    .line 123
    invoke-direct/range {v8 .. v15}, Lcom/stripe/android/model/ConsumerPaymentDetails$BillingAddress;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/core/model/CountryCode;)V

    .line 112
    new-instance v2, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;

    const/16 v21, 0x20

    const/16 v22, 0x0

    const-string v9, "card_id_1234"

    const-string v10, "4242"

    const/4 v11, 0x0

    const-string v12, "Fancy Card"

    const/4 v14, 0x0

    const/16 v15, 0x9c4

    const/16 v16, 0x4

    const-string v20, "credit"

    move-object v13, v8

    move-object v8, v2

    invoke-direct/range {v8 .. v22}, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;-><init>(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lcom/stripe/android/model/ConsumerPaymentDetails$BillingAddress;Ljava/lang/String;IILcom/stripe/android/model/CardBrand;Ljava/util/List;Lcom/stripe/android/model/CvcCheck;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v2, v8

    check-cast v2, Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;

    const/4 v3, 0x0

    .line 111
    invoke-virtual {v1, v2, v3}, Lcom/stripe/android/paymentsheet/ui/EditCardPayload$Companion;->create(Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;Ljava/lang/String;)Lcom/stripe/android/paymentsheet/ui/EditCardPayload;

    move-result-object v9

    .line 137
    new-instance v10, Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;

    const/16 v16, 0x1f

    const/16 v17, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v15, 0x0

    invoke-direct/range {v10 .. v17}, Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;-><init>(Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration$CollectionMode;Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration$CollectionMode;Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration$CollectionMode;Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration$AddressCollectionMode;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const v1, -0x5a8cc5c7

    invoke-interface {v0, v1}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 171
    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v1

    .line 172
    sget-object v2, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v2}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v2

    if-ne v1, v2, :cond_4

    .line 173
    new-instance v1, Lcom/stripe/android/link/ui/updatecard/ComposableSingletons$UpdateCardScreenKt$lambda-1$1$$ExternalSyntheticLambda0;

    invoke-direct {v1}, Lcom/stripe/android/link/ui/updatecard/ComposableSingletons$UpdateCardScreenKt$lambda-1$1$$ExternalSyntheticLambda0;-><init>()V

    .line 174
    invoke-interface {v0, v1}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 135
    :cond_4
    move-object v11, v1

    check-cast v11, Lkotlin/jvm/functions/Function1;

    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    const v1, -0x5a8cbf47

    invoke-interface {v0, v1}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 177
    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v1

    .line 178
    sget-object v2, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v2}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v2

    if-ne v1, v2, :cond_5

    .line 179
    new-instance v1, Lcom/stripe/android/link/ui/updatecard/ComposableSingletons$UpdateCardScreenKt$lambda-1$1$$ExternalSyntheticLambda1;

    invoke-direct {v1}, Lcom/stripe/android/link/ui/updatecard/ComposableSingletons$UpdateCardScreenKt$lambda-1$1$$ExternalSyntheticLambda1;-><init>()V

    .line 180
    invoke-interface {v0, v1}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 136
    :cond_5
    move-object v12, v1

    check-cast v12, Lkotlin/jvm/functions/Function1;

    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    const/4 v8, 0x1

    .line 104
    invoke-virtual/range {v5 .. v12}, Lcom/stripe/android/paymentsheet/ui/DefaultEditCardDetailsInteractor$Factory;->create(Lkotlinx/coroutines/CoroutineScope;Lcom/stripe/android/paymentsheet/ui/CardEditConfiguration;ZLcom/stripe/android/paymentsheet/ui/EditCardPayload;Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lcom/stripe/android/paymentsheet/ui/EditCardDetailsInteractor;

    move-result-object v1

    .line 140
    new-instance v2, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenState;

    .line 143
    sget v3, Lcom/stripe/android/paymentsheet/R$string;->stripe_link_update_card_confirm_cta:I

    invoke-static {v3}, Lcom/stripe/android/core/strings/ResolvableStringUtilsKt;->getResolvableString(I)Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object v5

    .line 147
    const-string v3, "Random error."

    invoke-static {v3}, Lcom/stripe/android/core/strings/ResolvableStringUtilsKt;->getResolvableString(Ljava/lang/String;)Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object v9

    const/4 v10, 0x0

    .line 140
    const-string v3, "card_id_1234"

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v2 .. v10}, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenState;-><init>(Ljava/lang/String;Lcom/stripe/android/link/LinkScreen$UpdateCard$BillingDetailsUpdateFlow;Lcom/stripe/android/core/strings/ResolvableString;ZLcom/stripe/android/paymentsheet/CardUpdateParams;Lcom/stripe/android/model/CardBrand;Lcom/stripe/android/core/strings/ResolvableString;Z)V

    const v3, -0x5a8c65a7

    invoke-interface {v0, v3}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 183
    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v3

    .line 184
    sget-object v4, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v4}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v4

    if-ne v3, v4, :cond_6

    .line 185
    new-instance v3, Lcom/stripe/android/link/ui/updatecard/ComposableSingletons$UpdateCardScreenKt$lambda-1$1$$ExternalSyntheticLambda2;

    invoke-direct {v3}, Lcom/stripe/android/link/ui/updatecard/ComposableSingletons$UpdateCardScreenKt$lambda-1$1$$ExternalSyntheticLambda2;-><init>()V

    .line 186
    invoke-interface {v0, v3}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 150
    :cond_6
    check-cast v3, Lkotlin/jvm/functions/Function0;

    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    const/16 v4, 0x180

    .line 103
    invoke-static {v1, v2, v3, v0, v4}, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenKt;->UpdateCardScreenBody(Lcom/stripe/android/paymentsheet/ui/EditCardDetailsInteractor;Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenState;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_7
    return-void
.end method
