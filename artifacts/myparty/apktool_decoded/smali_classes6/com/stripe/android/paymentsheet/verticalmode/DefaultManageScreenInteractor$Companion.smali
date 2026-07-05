.class public final Lcom/stripe/android/paymentsheet/verticalmode/DefaultManageScreenInteractor$Companion;
.super Ljava/lang/Object;
.source "ManageScreenInteractor.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/paymentsheet/verticalmode/DefaultManageScreenInteractor;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nManageScreenInteractor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ManageScreenInteractor.kt\ncom/stripe/android/paymentsheet/verticalmode/DefaultManageScreenInteractor$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,241:1\n1#2:242\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J&\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000c\u001a\u00020\rJ\"\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u000c\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u0013H\u0002\u00a8\u0006\u0014"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/verticalmode/DefaultManageScreenInteractor$Companion;",
        "",
        "<init>",
        "()V",
        "create",
        "Lcom/stripe/android/paymentsheet/verticalmode/ManageScreenInteractor;",
        "viewModel",
        "Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;",
        "paymentMethodMetadata",
        "Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;",
        "customerStateHolder",
        "Lcom/stripe/android/paymentsheet/CustomerStateHolder;",
        "savedPaymentMethodMutator",
        "Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator;",
        "paymentSelectionToDisplayableSavedPaymentMethod",
        "Lcom/stripe/android/paymentsheet/DisplayableSavedPaymentMethod;",
        "selection",
        "Lcom/stripe/android/paymentsheet/model/PaymentSelection;",
        "displayableSavedPaymentMethods",
        "",
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


# direct methods
.method public static synthetic $r8$lambda$-drE6AP3Q87tF4kK3HszpuCrlzA(Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;Z)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/paymentsheet/verticalmode/DefaultManageScreenInteractor$Companion;->create$lambda$2(Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;Z)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$H4biw-30vHL-gZTuJKof9RD_eD8(Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;Lcom/stripe/android/paymentsheet/DisplayableSavedPaymentMethod;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/paymentsheet/verticalmode/DefaultManageScreenInteractor$Companion;->create$lambda$0(Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;Lcom/stripe/android/paymentsheet/DisplayableSavedPaymentMethod;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$SzL0GhBHGNdbcxAaVenzdlZ86Ig(Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator;Lcom/stripe/android/paymentsheet/DisplayableSavedPaymentMethod;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/paymentsheet/verticalmode/DefaultManageScreenInteractor$Companion;->create$lambda$1(Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator;Lcom/stripe/android/paymentsheet/DisplayableSavedPaymentMethod;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method private constructor <init>()V
    .locals 0

    .line 191
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lcom/stripe/android/paymentsheet/verticalmode/DefaultManageScreenInteractor$Companion;-><init>()V

    return-void
.end method

.method public static final synthetic access$paymentSelectionToDisplayableSavedPaymentMethod(Lcom/stripe/android/paymentsheet/verticalmode/DefaultManageScreenInteractor$Companion;Lcom/stripe/android/paymentsheet/model/PaymentSelection;Ljava/util/List;)Lcom/stripe/android/paymentsheet/DisplayableSavedPaymentMethod;
    .locals 0

    .line 191
    invoke-direct {p0, p1, p2}, Lcom/stripe/android/paymentsheet/verticalmode/DefaultManageScreenInteractor$Companion;->paymentSelectionToDisplayableSavedPaymentMethod(Lcom/stripe/android/paymentsheet/model/PaymentSelection;Ljava/util/List;)Lcom/stripe/android/paymentsheet/DisplayableSavedPaymentMethod;

    move-result-object p0

    return-object p0
.end method

.method private static final create$lambda$0(Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;Lcom/stripe/android/paymentsheet/DisplayableSavedPaymentMethod;)Lkotlin/Unit;
    .locals 7

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 207
    new-instance v1, Lcom/stripe/android/paymentsheet/model/PaymentSelection$Saved;

    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/DisplayableSavedPaymentMethod;->getPaymentMethod()Lcom/stripe/android/model/PaymentMethod;

    move-result-object v2

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v1 .. v6}, Lcom/stripe/android/paymentsheet/model/PaymentSelection$Saved;-><init>(Lcom/stripe/android/model/PaymentMethod;Lcom/stripe/android/paymentsheet/model/PaymentSelection$Saved$WalletType;Lcom/stripe/android/model/PaymentMethodOptionsParams;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 208
    check-cast v1, Lcom/stripe/android/paymentsheet/model/PaymentSelection;

    invoke-virtual {p0, v1}, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->updateSelection(Lcom/stripe/android/paymentsheet/model/PaymentSelection;)V

    .line 209
    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->getEventReporter()Lcom/stripe/android/paymentsheet/analytics/EventReporter;

    move-result-object p0

    invoke-interface {p0, v1}, Lcom/stripe/android/paymentsheet/analytics/EventReporter;->onSelectPaymentOption(Lcom/stripe/android/paymentsheet/model/PaymentSelection;)V

    .line 210
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method private static final create$lambda$1(Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator;Lcom/stripe/android/paymentsheet/DisplayableSavedPaymentMethod;)Lkotlin/Unit;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 211
    invoke-virtual {p0, p1}, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator;->updatePaymentMethod(Lcom/stripe/android/paymentsheet/DisplayableSavedPaymentMethod;)V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method private static final create$lambda$2(Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;Z)Lkotlin/Unit;
    .locals 0

    if-eqz p1, :cond_0

    .line 214
    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->getNavigationHandler()Lcom/stripe/android/paymentsheet/navigation/NavigationHandler;

    move-result-object p0

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/navigation/NavigationHandler;->popWithDelay()V

    goto :goto_0

    .line 216
    :cond_0
    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->getNavigationHandler()Lcom/stripe/android/paymentsheet/navigation/NavigationHandler;

    move-result-object p0

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/navigation/NavigationHandler;->pop()V

    .line 218
    :goto_0
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method private final paymentSelectionToDisplayableSavedPaymentMethod(Lcom/stripe/android/paymentsheet/model/PaymentSelection;Ljava/util/List;)Lcom/stripe/android/paymentsheet/DisplayableSavedPaymentMethod;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/paymentsheet/model/PaymentSelection;",
            "Ljava/util/List<",
            "Lcom/stripe/android/paymentsheet/DisplayableSavedPaymentMethod;",
            ">;)",
            "Lcom/stripe/android/paymentsheet/DisplayableSavedPaymentMethod;"
        }
    .end annotation

    const/4 v0, 0x0

    if-eqz p1, :cond_4

    .line 229
    instance-of v1, p1, Lcom/stripe/android/paymentsheet/model/PaymentSelection$ExternalPaymentMethod;

    if-nez v1, :cond_4

    .line 230
    instance-of v1, p1, Lcom/stripe/android/paymentsheet/model/PaymentSelection$CustomPaymentMethod;

    if-nez v1, :cond_4

    .line 231
    sget-object v1, Lcom/stripe/android/paymentsheet/model/PaymentSelection$GooglePay;->INSTANCE:Lcom/stripe/android/paymentsheet/model/PaymentSelection$GooglePay;

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    .line 232
    instance-of v1, p1, Lcom/stripe/android/paymentsheet/model/PaymentSelection$Link;

    if-nez v1, :cond_4

    .line 233
    instance-of v1, p1, Lcom/stripe/android/paymentsheet/model/PaymentSelection$ShopPay;

    if-nez v1, :cond_4

    .line 234
    instance-of v1, p1, Lcom/stripe/android/paymentsheet/model/PaymentSelection$New;

    if-eqz v1, :cond_0

    goto :goto_0

    .line 235
    :cond_0
    instance-of v1, p1, Lcom/stripe/android/paymentsheet/model/PaymentSelection$Saved;

    if-eqz v1, :cond_3

    check-cast p1, Lcom/stripe/android/paymentsheet/model/PaymentSelection$Saved;

    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/model/PaymentSelection$Saved;->getPaymentMethod()Lcom/stripe/android/model/PaymentMethod;

    move-result-object p1

    iget-object p1, p1, Lcom/stripe/android/model/PaymentMethod;->id:Ljava/lang/String;

    .line 237
    check-cast p2, Ljava/lang/Iterable;

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lcom/stripe/android/paymentsheet/DisplayableSavedPaymentMethod;

    invoke-virtual {v2}, Lcom/stripe/android/paymentsheet/DisplayableSavedPaymentMethod;->getPaymentMethod()Lcom/stripe/android/model/PaymentMethod;

    move-result-object v2

    iget-object v2, v2, Lcom/stripe/android/model/PaymentMethod;->id:Ljava/lang/String;

    invoke-static {v2, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    move-object v0, v1

    :cond_2
    check-cast v0, Lcom/stripe/android/paymentsheet/DisplayableSavedPaymentMethod;

    return-object v0

    .line 227
    :cond_3
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_4
    :goto_0
    return-object v0
.end method


# virtual methods
.method public final create(Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;Lcom/stripe/android/paymentsheet/CustomerStateHolder;Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator;)Lcom/stripe/android/paymentsheet/verticalmode/ManageScreenInteractor;
    .locals 18

    move-object/from16 v0, p1

    move-object/from16 v1, p4

    const-string v2, "viewModel"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "paymentMethodMetadata"

    move-object/from16 v5, p2

    invoke-static {v5, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "customerStateHolder"

    move-object/from16 v3, p3

    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "savedPaymentMethodMutator"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 198
    new-instance v3, Lcom/stripe/android/paymentsheet/verticalmode/DefaultManageScreenInteractor;

    .line 199
    invoke-virtual/range {p3 .. p3}, Lcom/stripe/android/paymentsheet/CustomerStateHolder;->getPaymentMethods()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v4

    .line 201
    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->getSelection$paymentsheet_release()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v6

    .line 202
    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator;->getEditing$paymentsheet_release()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v7

    .line 203
    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator;->getCanEdit()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v8

    .line 204
    new-instance v2, Lcom/stripe/android/paymentsheet/verticalmode/DefaultManageScreenInteractor$Companion$create$1;

    invoke-direct {v2, v1}, Lcom/stripe/android/paymentsheet/verticalmode/DefaultManageScreenInteractor$Companion$create$1;-><init>(Ljava/lang/Object;)V

    move-object v9, v2

    check-cast v9, Lkotlin/jvm/functions/Function0;

    .line 205
    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator;->getProvidePaymentMethodName()Lkotlin/jvm/functions/Function1;

    move-result-object v10

    .line 206
    new-instance v11, Lcom/stripe/android/paymentsheet/verticalmode/DefaultManageScreenInteractor$Companion$$ExternalSyntheticLambda0;

    invoke-direct {v11, v0}, Lcom/stripe/android/paymentsheet/verticalmode/DefaultManageScreenInteractor$Companion$$ExternalSyntheticLambda0;-><init>(Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;)V

    .line 211
    new-instance v12, Lcom/stripe/android/paymentsheet/verticalmode/DefaultManageScreenInteractor$Companion$$ExternalSyntheticLambda1;

    invoke-direct {v12, v1}, Lcom/stripe/android/paymentsheet/verticalmode/DefaultManageScreenInteractor$Companion$$ExternalSyntheticLambda1;-><init>(Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator;)V

    .line 212
    new-instance v13, Lcom/stripe/android/paymentsheet/verticalmode/DefaultManageScreenInteractor$Companion$$ExternalSyntheticLambda2;

    invoke-direct {v13, v0}, Lcom/stripe/android/paymentsheet/verticalmode/DefaultManageScreenInteractor$Companion$$ExternalSyntheticLambda2;-><init>(Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;)V

    .line 219
    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator;->getDefaultPaymentMethodId()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v14

    const/16 v16, 0x800

    const/16 v17, 0x0

    const/4 v15, 0x0

    .line 198
    invoke-direct/range {v3 .. v17}, Lcom/stripe/android/paymentsheet/verticalmode/DefaultManageScreenInteractor;-><init>(Lkotlinx/coroutines/flow/StateFlow;Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlinx/coroutines/flow/StateFlow;Lkotlin/coroutines/CoroutineContext;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    check-cast v3, Lcom/stripe/android/paymentsheet/verticalmode/ManageScreenInteractor;

    return-object v3
.end method
