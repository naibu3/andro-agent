.class public final Lcom/reactnativestripesdk/AuBECSDebitFormView;
.super Landroid/widget/FrameLayout;
.source "AuBECSDebitFormView.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nAuBECSDebitFormView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AuBECSDebitFormView.kt\ncom/reactnativestripesdk/AuBECSDebitFormView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,120:1\n1#2:121\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0010\u0010\n\u001a\u00020\u000b2\u0008\u0010\u000c\u001a\u0004\u0018\u00010\rJ\u0010\u0010\u000e\u001a\u00020\u000b2\u0008\u0010\u000f\u001a\u0004\u0018\u00010\tJ\u000e\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0012J\u0008\u0010\u0013\u001a\u00020\u000bH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0008\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"
    }
    d2 = {
        "Lcom/reactnativestripesdk/AuBECSDebitFormView;",
        "Landroid/widget/FrameLayout;",
        "context",
        "Lcom/facebook/react/uimanager/ThemedReactContext;",
        "<init>",
        "(Lcom/facebook/react/uimanager/ThemedReactContext;)V",
        "becsDebitWidget",
        "Lcom/stripe/android/view/BecsDebitWidget;",
        "formStyle",
        "Lcom/facebook/react/bridge/ReadableMap;",
        "setCompanyName",
        "",
        "name",
        "",
        "setFormStyle",
        "value",
        "onFormChanged",
        "params",
        "Lcom/stripe/android/model/PaymentMethodCreateParams;",
        "setListeners",
        "stripe_stripe-react-native_release"
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
.field private becsDebitWidget:Lcom/stripe/android/view/BecsDebitWidget;

.field private final context:Lcom/facebook/react/uimanager/ThemedReactContext;

.field private formStyle:Lcom/facebook/react/bridge/ReadableMap;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/facebook/react/uimanager/ThemedReactContext;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    move-object v0, p1

    check-cast v0, Landroid/content/Context;

    invoke-direct {p0, v0}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 22
    iput-object p1, p0, Lcom/reactnativestripesdk/AuBECSDebitFormView;->context:Lcom/facebook/react/uimanager/ThemedReactContext;

    return-void
.end method

.method public static final synthetic access$getBecsDebitWidget$p(Lcom/reactnativestripesdk/AuBECSDebitFormView;)Lcom/stripe/android/view/BecsDebitWidget;
    .locals 0

    .line 20
    iget-object p0, p0, Lcom/reactnativestripesdk/AuBECSDebitFormView;->becsDebitWidget:Lcom/stripe/android/view/BecsDebitWidget;

    return-object p0
.end method

.method private final setListeners()V
    .locals 2

    .line 112
    iget-object v0, p0, Lcom/reactnativestripesdk/AuBECSDebitFormView;->becsDebitWidget:Lcom/stripe/android/view/BecsDebitWidget;

    if-nez v0, :cond_0

    const-string v0, "becsDebitWidget"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 113
    :cond_0
    new-instance v1, Lcom/reactnativestripesdk/AuBECSDebitFormView$setListeners$1;

    invoke-direct {v1, p0}, Lcom/reactnativestripesdk/AuBECSDebitFormView$setListeners$1;-><init>(Lcom/reactnativestripesdk/AuBECSDebitFormView;)V

    check-cast v1, Lcom/stripe/android/view/BecsDebitWidget$ValidParamsCallback;

    .line 112
    invoke-virtual {v0, v1}, Lcom/stripe/android/view/BecsDebitWidget;->setValidParamsCallback(Lcom/stripe/android/view/BecsDebitWidget$ValidParamsCallback;)V

    return-void
.end method


# virtual methods
.method public final onFormChanged(Lcom/stripe/android/model/PaymentMethodCreateParams;)V
    .locals 5

    const-string v0, "params"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 97
    invoke-virtual {p1}, Lcom/stripe/android/model/PaymentMethodCreateParams;->toParamMap()Ljava/util/Map;

    move-result-object v0

    const-string v1, "billing_details"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type java.util.HashMap<*, *>"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/util/HashMap;

    .line 98
    invoke-virtual {p1}, Lcom/stripe/android/model/PaymentMethodCreateParams;->toParamMap()Ljava/util/Map;

    move-result-object p1

    const-string v2, "au_becs_debit"

    invoke-interface {p1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/util/HashMap;

    const/4 v1, 0x4

    .line 102
    new-array v1, v1, [Lkotlin/Pair;

    check-cast p1, Ljava/util/Map;

    const-string v2, "account_number"

    invoke-interface {p1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    const-string v3, "null cannot be cast to non-null type kotlin.String"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Ljava/lang/String;

    const-string v4, "accountNumber"

    invoke-static {v4, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/4 v4, 0x0

    aput-object v2, v1, v4

    .line 103
    const-string v2, "bsb_number"

    invoke-interface {p1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/String;

    const-string v2, "bsbNumber"

    invoke-static {v2, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    const/4 v2, 0x1

    aput-object p1, v1, v2

    .line 104
    check-cast v0, Ljava/util/Map;

    const-string p1, "name"

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Ljava/lang/String;

    invoke-static {p1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    const/4 v2, 0x2

    aput-object p1, v1, v2

    .line 105
    const-string p1, "email"

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/String;

    invoke-static {p1, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    const/4 v0, 0x3

    aput-object p1, v1, v0

    .line 101
    invoke-static {v1}, Lkotlin/collections/MapsKt;->mutableMapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object p1

    .line 108
    iget-object v0, p0, Lcom/reactnativestripesdk/AuBECSDebitFormView;->context:Lcom/facebook/react/uimanager/ThemedReactContext;

    check-cast v0, Lcom/facebook/react/bridge/ReactContext;

    invoke-virtual {p0}, Lcom/reactnativestripesdk/AuBECSDebitFormView;->getId()I

    move-result v1

    invoke-static {v0, v1}, Lcom/facebook/react/uimanager/UIManagerHelper;->getEventDispatcherForReactTag(Lcom/facebook/react/bridge/ReactContext;I)Lcom/facebook/react/uimanager/events/EventDispatcher;

    move-result-object v0

    if-eqz v0, :cond_0

    new-instance v1, Lcom/reactnativestripesdk/FormCompleteEvent;

    iget-object v2, p0, Lcom/reactnativestripesdk/AuBECSDebitFormView;->context:Lcom/facebook/react/uimanager/ThemedReactContext;

    invoke-virtual {v2}, Lcom/facebook/react/uimanager/ThemedReactContext;->getSurfaceId()I

    move-result v2

    invoke-virtual {p0}, Lcom/reactnativestripesdk/AuBECSDebitFormView;->getId()I

    move-result v3

    invoke-direct {v1, v2, v3, p1}, Lcom/reactnativestripesdk/FormCompleteEvent;-><init>(IILjava/util/Map;)V

    check-cast v1, Lcom/facebook/react/uimanager/events/Event;

    invoke-interface {v0, v1}, Lcom/facebook/react/uimanager/events/EventDispatcher;->dispatchEvent(Lcom/facebook/react/uimanager/events/Event;)V

    :cond_0
    return-void
.end method

.method public final setCompanyName(Ljava/lang/String;)V
    .locals 7

    .line 28
    new-instance v0, Lcom/stripe/android/view/BecsDebitWidget;

    iget-object v1, p0, Lcom/reactnativestripesdk/AuBECSDebitFormView;->context:Lcom/facebook/react/uimanager/ThemedReactContext;

    check-cast v1, Landroid/content/Context;

    const-string v2, "null cannot be cast to non-null type kotlin.String"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v4, p1

    invoke-direct/range {v0 .. v6}, Lcom/stripe/android/view/BecsDebitWidget;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;ILjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v0, p0, Lcom/reactnativestripesdk/AuBECSDebitFormView;->becsDebitWidget:Lcom/stripe/android/view/BecsDebitWidget;

    .line 30
    iget-object p1, p0, Lcom/reactnativestripesdk/AuBECSDebitFormView;->formStyle:Lcom/facebook/react/bridge/ReadableMap;

    invoke-virtual {p0, p1}, Lcom/reactnativestripesdk/AuBECSDebitFormView;->setFormStyle(Lcom/facebook/react/bridge/ReadableMap;)V

    .line 31
    iget-object p1, p0, Lcom/reactnativestripesdk/AuBECSDebitFormView;->becsDebitWidget:Lcom/stripe/android/view/BecsDebitWidget;

    if-nez p1, :cond_0

    const-string p1, "becsDebitWidget"

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 p1, 0x0

    :cond_0
    check-cast p1, Landroid/view/View;

    invoke-virtual {p0, p1}, Lcom/reactnativestripesdk/AuBECSDebitFormView;->addView(Landroid/view/View;)V

    .line 32
    invoke-direct {p0}, Lcom/reactnativestripesdk/AuBECSDebitFormView;->setListeners()V

    return-void
.end method

.method public final setFormStyle(Lcom/facebook/react/bridge/ReadableMap;)V
    .locals 14

    .line 36
    iput-object p1, p0, Lcom/reactnativestripesdk/AuBECSDebitFormView;->formStyle:Lcom/facebook/react/bridge/ReadableMap;

    .line 37
    iget-object v0, p0, Lcom/reactnativestripesdk/AuBECSDebitFormView;->becsDebitWidget:Lcom/stripe/android/view/BecsDebitWidget;

    if-eqz v0, :cond_b

    if-nez p1, :cond_0

    goto/16 :goto_2

    .line 40
    :cond_0
    const-string v1, "becsDebitWidget"

    const/4 v2, 0x0

    if-nez v0, :cond_1

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v2

    :cond_1
    check-cast v0, Landroid/view/View;

    invoke-static {v0}, Lcom/stripe/android/databinding/StripeBecsDebitWidgetBinding;->bind(Landroid/view/View;)Lcom/stripe/android/databinding/StripeBecsDebitWidgetBinding;

    move-result-object v0

    const-string v3, "bind(...)"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 41
    const-string v3, "textColor"

    invoke-static {p1, v3, v2}, Lcom/reactnativestripesdk/utils/MappersKt;->getValOr(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 42
    const-string v4, "textErrorColor"

    invoke-static {p1, v4, v2}, Lcom/reactnativestripesdk/utils/MappersKt;->getValOr(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 43
    const-string v5, "placeholderColor"

    invoke-static {p1, v5, v2}, Lcom/reactnativestripesdk/utils/MappersKt;->getValOr(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 44
    const-string v6, "fontSize"

    invoke-static {p1, v6}, Lcom/reactnativestripesdk/utils/MappersKt;->getIntOrNull(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v6

    .line 45
    const-string v7, "borderWidth"

    invoke-static {p1, v7}, Lcom/reactnativestripesdk/utils/MappersKt;->getIntOrNull(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v7

    .line 46
    const-string v8, "backgroundColor"

    invoke-static {p1, v8, v2}, Lcom/reactnativestripesdk/utils/MappersKt;->getValOr(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 47
    const-string v9, "borderColor"

    invoke-static {p1, v9, v2}, Lcom/reactnativestripesdk/utils/MappersKt;->getValOr(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 48
    const-string v10, "borderRadius"

    invoke-static {p1, v10}, Lcom/reactnativestripesdk/utils/MappersKt;->getIntOrNull(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object p1

    const/4 v10, 0x0

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    goto :goto_0

    :cond_2
    move p1, v10

    .line 50
    :goto_0
    const-string v11, "null cannot be cast to non-null type com.stripe.android.view.StripeEditText"

    if-eqz v3, :cond_3

    .line 51
    iget-object v12, v0, Lcom/stripe/android/databinding/StripeBecsDebitWidgetBinding;->accountNumberEditText:Lcom/stripe/android/view/BecsDebitAccountNumberEditText;

    invoke-static {v12, v11}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v12, Lcom/stripe/android/view/StripeEditText;

    invoke-static {v3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v13

    invoke-virtual {v12, v13}, Lcom/stripe/android/view/StripeEditText;->setTextColor(I)V

    .line 52
    iget-object v12, v0, Lcom/stripe/android/databinding/StripeBecsDebitWidgetBinding;->bsbEditText:Lcom/stripe/android/view/BecsDebitBsbEditText;

    invoke-static {v12, v11}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v12, Lcom/stripe/android/view/StripeEditText;

    invoke-static {v3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v13

    invoke-virtual {v12, v13}, Lcom/stripe/android/view/StripeEditText;->setTextColor(I)V

    .line 53
    iget-object v12, v0, Lcom/stripe/android/databinding/StripeBecsDebitWidgetBinding;->emailEditText:Lcom/stripe/android/view/EmailEditText;

    invoke-static {v12, v11}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v12, Lcom/stripe/android/view/StripeEditText;

    invoke-static {v3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v13

    invoke-virtual {v12, v13}, Lcom/stripe/android/view/StripeEditText;->setTextColor(I)V

    .line 54
    iget-object v12, v0, Lcom/stripe/android/databinding/StripeBecsDebitWidgetBinding;->nameEditText:Lcom/stripe/android/view/StripeEditText;

    invoke-static {v3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v3

    invoke-virtual {v12, v3}, Lcom/stripe/android/view/StripeEditText;->setTextColor(I)V

    :cond_3
    if-eqz v4, :cond_4

    .line 58
    iget-object v3, v0, Lcom/stripe/android/databinding/StripeBecsDebitWidgetBinding;->accountNumberEditText:Lcom/stripe/android/view/BecsDebitAccountNumberEditText;

    invoke-static {v3, v11}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v3, Lcom/stripe/android/view/StripeEditText;

    invoke-static {v4}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v12

    invoke-virtual {v3, v12}, Lcom/stripe/android/view/StripeEditText;->setErrorColor(I)V

    .line 59
    iget-object v3, v0, Lcom/stripe/android/databinding/StripeBecsDebitWidgetBinding;->bsbEditText:Lcom/stripe/android/view/BecsDebitBsbEditText;

    invoke-static {v3, v11}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v3, Lcom/stripe/android/view/StripeEditText;

    invoke-static {v4}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v12

    invoke-virtual {v3, v12}, Lcom/stripe/android/view/StripeEditText;->setErrorColor(I)V

    .line 60
    iget-object v3, v0, Lcom/stripe/android/databinding/StripeBecsDebitWidgetBinding;->emailEditText:Lcom/stripe/android/view/EmailEditText;

    invoke-static {v3, v11}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v3, Lcom/stripe/android/view/StripeEditText;

    invoke-static {v4}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v12

    invoke-virtual {v3, v12}, Lcom/stripe/android/view/StripeEditText;->setErrorColor(I)V

    .line 61
    iget-object v3, v0, Lcom/stripe/android/databinding/StripeBecsDebitWidgetBinding;->nameEditText:Lcom/stripe/android/view/StripeEditText;

    invoke-static {v4}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v4

    invoke-virtual {v3, v4}, Lcom/stripe/android/view/StripeEditText;->setErrorColor(I)V

    :cond_4
    if-eqz v5, :cond_5

    .line 65
    iget-object v3, v0, Lcom/stripe/android/databinding/StripeBecsDebitWidgetBinding;->accountNumberEditText:Lcom/stripe/android/view/BecsDebitAccountNumberEditText;

    invoke-static {v3, v11}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v3, Lcom/stripe/android/view/StripeEditText;

    invoke-static {v5}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v4

    invoke-virtual {v3, v4}, Lcom/stripe/android/view/StripeEditText;->setHintTextColor(I)V

    .line 66
    iget-object v3, v0, Lcom/stripe/android/databinding/StripeBecsDebitWidgetBinding;->bsbEditText:Lcom/stripe/android/view/BecsDebitBsbEditText;

    invoke-static {v3, v11}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v3, Lcom/stripe/android/view/StripeEditText;

    invoke-static {v5}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v4

    invoke-virtual {v3, v4}, Lcom/stripe/android/view/StripeEditText;->setHintTextColor(I)V

    .line 67
    iget-object v3, v0, Lcom/stripe/android/databinding/StripeBecsDebitWidgetBinding;->emailEditText:Lcom/stripe/android/view/EmailEditText;

    invoke-static {v3, v11}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v3, Lcom/stripe/android/view/StripeEditText;

    invoke-static {v5}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v4

    invoke-virtual {v3, v4}, Lcom/stripe/android/view/StripeEditText;->setHintTextColor(I)V

    .line 68
    iget-object v3, v0, Lcom/stripe/android/databinding/StripeBecsDebitWidgetBinding;->nameEditText:Lcom/stripe/android/view/StripeEditText;

    invoke-static {v5}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v4

    invoke-virtual {v3, v4}, Lcom/stripe/android/view/StripeEditText;->setHintTextColor(I)V

    :cond_5
    if-eqz v6, :cond_6

    .line 71
    check-cast v6, Ljava/lang/Number;

    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    move-result v3

    .line 72
    iget-object v4, v0, Lcom/stripe/android/databinding/StripeBecsDebitWidgetBinding;->accountNumberEditText:Lcom/stripe/android/view/BecsDebitAccountNumberEditText;

    invoke-static {v4, v11}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v4, Lcom/stripe/android/view/StripeEditText;

    int-to-float v3, v3

    invoke-virtual {v4, v3}, Lcom/stripe/android/view/StripeEditText;->setTextSize(F)V

    .line 73
    iget-object v4, v0, Lcom/stripe/android/databinding/StripeBecsDebitWidgetBinding;->bsbEditText:Lcom/stripe/android/view/BecsDebitBsbEditText;

    invoke-static {v4, v11}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v4, Lcom/stripe/android/view/StripeEditText;

    invoke-virtual {v4, v3}, Lcom/stripe/android/view/StripeEditText;->setTextSize(F)V

    .line 74
    iget-object v4, v0, Lcom/stripe/android/databinding/StripeBecsDebitWidgetBinding;->emailEditText:Lcom/stripe/android/view/EmailEditText;

    invoke-static {v4, v11}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v4, Lcom/stripe/android/view/StripeEditText;

    invoke-virtual {v4, v3}, Lcom/stripe/android/view/StripeEditText;->setTextSize(F)V

    .line 75
    iget-object v0, v0, Lcom/stripe/android/databinding/StripeBecsDebitWidgetBinding;->nameEditText:Lcom/stripe/android/view/StripeEditText;

    invoke-virtual {v0, v3}, Lcom/stripe/android/view/StripeEditText;->setTextSize(F)V

    .line 78
    :cond_6
    iget-object v0, p0, Lcom/reactnativestripesdk/AuBECSDebitFormView;->becsDebitWidget:Lcom/stripe/android/view/BecsDebitWidget;

    if-nez v0, :cond_7

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    goto :goto_1

    :cond_7
    move-object v2, v0

    .line 79
    :goto_1
    new-instance v0, Lcom/google/android/material/shape/MaterialShapeDrawable;

    .line 80
    new-instance v1, Lcom/google/android/material/shape/ShapeAppearanceModel;

    invoke-direct {v1}, Lcom/google/android/material/shape/ShapeAppearanceModel;-><init>()V

    .line 81
    invoke-virtual {v1}, Lcom/google/android/material/shape/ShapeAppearanceModel;->toBuilder()Lcom/google/android/material/shape/ShapeAppearanceModel$Builder;

    move-result-object v1

    mul-int/lit8 p1, p1, 0x2

    int-to-float p1, p1

    .line 82
    invoke-virtual {v1, v10, p1}, Lcom/google/android/material/shape/ShapeAppearanceModel$Builder;->setAllCorners(IF)Lcom/google/android/material/shape/ShapeAppearanceModel$Builder;

    move-result-object p1

    .line 83
    invoke-virtual {p1}, Lcom/google/android/material/shape/ShapeAppearanceModel$Builder;->build()Lcom/google/android/material/shape/ShapeAppearanceModel;

    move-result-object p1

    .line 79
    invoke-direct {v0, p1}, Lcom/google/android/material/shape/MaterialShapeDrawable;-><init>(Lcom/google/android/material/shape/ShapeAppearanceModel;)V

    const/4 p1, 0x0

    .line 85
    invoke-virtual {v0, p1}, Lcom/google/android/material/shape/MaterialShapeDrawable;->setStrokeWidth(F)V

    .line 86
    const-string p1, "#000000"

    invoke-static {p1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result p1

    invoke-static {p1}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/google/android/material/shape/MaterialShapeDrawable;->setStrokeColor(Landroid/content/res/ColorStateList;)V

    .line 87
    const-string p1, "#FFFFFF"

    invoke-static {p1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result p1

    invoke-static {p1}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/google/android/material/shape/MaterialShapeDrawable;->setFillColor(Landroid/content/res/ColorStateList;)V

    if-eqz v7, :cond_8

    .line 88
    check-cast v7, Ljava/lang/Number;

    invoke-virtual {v7}, Ljava/lang/Number;->intValue()I

    move-result p1

    mul-int/lit8 p1, p1, 0x2

    int-to-float p1, p1

    invoke-virtual {v0, p1}, Lcom/google/android/material/shape/MaterialShapeDrawable;->setStrokeWidth(F)V

    :cond_8
    if-eqz v9, :cond_9

    .line 89
    invoke-static {v9}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result p1

    invoke-static {p1}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/google/android/material/shape/MaterialShapeDrawable;->setStrokeColor(Landroid/content/res/ColorStateList;)V

    :cond_9
    if-eqz v8, :cond_a

    .line 91
    invoke-static {v8}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result p1

    invoke-static {p1}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/google/android/material/shape/MaterialShapeDrawable;->setFillColor(Landroid/content/res/ColorStateList;)V

    .line 84
    :cond_a
    check-cast v0, Landroid/graphics/drawable/Drawable;

    .line 78
    invoke-virtual {v2, v0}, Lcom/stripe/android/view/BecsDebitWidget;->setBackground(Landroid/graphics/drawable/Drawable;)V

    :cond_b
    :goto_2
    return-void
.end method
