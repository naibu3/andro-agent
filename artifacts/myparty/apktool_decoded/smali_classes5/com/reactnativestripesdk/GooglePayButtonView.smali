.class public final Lcom/reactnativestripesdk/GooglePayButtonView;
.super Landroid/widget/FrameLayout;
.source "GooglePayButtonView.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0006\u0010\r\u001a\u00020\u000eJ\u0008\u0010\u000f\u001a\u00020\u000cH\u0002J\u0008\u0010\u0010\u001a\u00020\u0011H\u0003J\u000f\u0010\u0012\u001a\u0004\u0018\u00010\u0007H\u0002\u00a2\u0006\u0002\u0010\u0013J\u000f\u0010\u0014\u001a\u0004\u0018\u00010\u0007H\u0002\u00a2\u0006\u0002\u0010\u0013J\u0008\u0010\u0015\u001a\u00020\u000eH\u0016J\u000e\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u0007J\u000e\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u0008R\u0012\u0010\t\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u0008R\u000e\u0010\n\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u000cX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"
    }
    d2 = {
        "Lcom/reactnativestripesdk/GooglePayButtonView;",
        "Landroid/widget/FrameLayout;",
        "context",
        "Lcom/facebook/react/uimanager/ThemedReactContext;",
        "<init>",
        "(Lcom/facebook/react/uimanager/ThemedReactContext;)V",
        "type",
        "",
        "Ljava/lang/Integer;",
        "appearance",
        "borderRadius",
        "button",
        "Lcom/google/android/gms/wallet/button/PayButton;",
        "initialize",
        "",
        "configureGooglePayButton",
        "buildButtonOptions",
        "Lcom/google/android/gms/wallet/button/ButtonOptions;",
        "getButtonType",
        "()Ljava/lang/Integer;",
        "getButtonTheme",
        "requestLayout",
        "mLayoutRunnable",
        "Ljava/lang/Runnable;",
        "setType",
        "setAppearance",
        "setBorderRadius",
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
.field private appearance:Ljava/lang/Integer;

.field private borderRadius:I

.field private button:Lcom/google/android/gms/wallet/button/PayButton;

.field private final context:Lcom/facebook/react/uimanager/ThemedReactContext;

.field private final mLayoutRunnable:Ljava/lang/Runnable;

.field private type:Ljava/lang/Integer;


# direct methods
.method public static synthetic $r8$lambda$LuNoCZwJx0l-N3491DaF4VWSU_U(Lcom/reactnativestripesdk/GooglePayButtonView;)V
    .locals 0

    invoke-static {p0}, Lcom/reactnativestripesdk/GooglePayButtonView;->mLayoutRunnable$lambda$5(Lcom/reactnativestripesdk/GooglePayButtonView;)V

    return-void
.end method

.method public static synthetic $r8$lambda$NzxGORnJ-sY8Dk6Jo1DwF-snyGA(Lcom/reactnativestripesdk/GooglePayButtonView;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/reactnativestripesdk/GooglePayButtonView;->configureGooglePayButton$lambda$2(Lcom/reactnativestripesdk/GooglePayButtonView;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic $r8$lambda$fhH0BN4n3KIa-N6OXMbGAUZmNVY(Lcom/reactnativestripesdk/GooglePayButtonView;)V
    .locals 0

    invoke-static {p0}, Lcom/reactnativestripesdk/GooglePayButtonView;->initialize$lambda$0(Lcom/reactnativestripesdk/GooglePayButtonView;)V

    return-void
.end method

.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/facebook/react/uimanager/ThemedReactContext;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    move-object v0, p1

    check-cast v0, Landroid/content/Context;

    invoke-direct {p0, v0}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 18
    iput-object p1, p0, Lcom/reactnativestripesdk/GooglePayButtonView;->context:Lcom/facebook/react/uimanager/ThemedReactContext;

    const/4 p1, 0x4

    .line 22
    iput p1, p0, Lcom/reactnativestripesdk/GooglePayButtonView;->borderRadius:I

    .line 106
    new-instance p1, Lcom/reactnativestripesdk/GooglePayButtonView$$ExternalSyntheticLambda2;

    invoke-direct {p1, p0}, Lcom/reactnativestripesdk/GooglePayButtonView$$ExternalSyntheticLambda2;-><init>(Lcom/reactnativestripesdk/GooglePayButtonView;)V

    iput-object p1, p0, Lcom/reactnativestripesdk/GooglePayButtonView;->mLayoutRunnable:Ljava/lang/Runnable;

    return-void
.end method

.method private final buildButtonOptions()Lcom/google/android/gms/wallet/button/ButtonOptions;
    .locals 7

    .line 52
    new-instance v0, Lorg/json/JSONArray;

    invoke-direct {v0}, Lorg/json/JSONArray;-><init>()V

    .line 54
    new-instance v1, Lcom/stripe/android/GooglePayJsonFactory;

    iget-object v2, p0, Lcom/reactnativestripesdk/GooglePayButtonView;->context:Lcom/facebook/react/uimanager/ThemedReactContext;

    check-cast v2, Landroid/content/Context;

    const/4 v3, 0x2

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct {v1, v2, v5, v3, v4}, Lcom/stripe/android/GooglePayJsonFactory;-><init>(Landroid/content/Context;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Lcom/stripe/android/GooglePayJsonFactory;->createCardPaymentMethod$default(Lcom/stripe/android/GooglePayJsonFactory;Lcom/stripe/android/GooglePayJsonFactory$BillingAddressParameters;Ljava/lang/Boolean;ZILjava/lang/Object;)Lorg/json/JSONObject;

    move-result-object v1

    .line 53
    invoke-virtual {v0, v1}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    move-result-object v0

    .line 58
    invoke-virtual {v0}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "toString(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 62
    invoke-static {}, Lcom/google/android/gms/wallet/button/ButtonOptions;->newBuilder()Lcom/google/android/gms/wallet/button/ButtonOptions$Builder;

    move-result-object v1

    .line 63
    invoke-virtual {v1, v0}, Lcom/google/android/gms/wallet/button/ButtonOptions$Builder;->setAllowedPaymentMethods(Ljava/lang/String;)Lcom/google/android/gms/wallet/button/ButtonOptions$Builder;

    move-result-object v0

    const-string v1, "setAllowedPaymentMethods(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 65
    invoke-direct {p0}, Lcom/reactnativestripesdk/GooglePayButtonView;->getButtonType()Ljava/lang/Integer;

    move-result-object v1

    if-eqz v1, :cond_0

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    .line 66
    invoke-virtual {v0, v1}, Lcom/google/android/gms/wallet/button/ButtonOptions$Builder;->setButtonType(I)Lcom/google/android/gms/wallet/button/ButtonOptions$Builder;

    .line 69
    :cond_0
    invoke-direct {p0}, Lcom/reactnativestripesdk/GooglePayButtonView;->getButtonTheme()Ljava/lang/Integer;

    move-result-object v1

    if-eqz v1, :cond_1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    .line 70
    invoke-virtual {v0, v1}, Lcom/google/android/gms/wallet/button/ButtonOptions$Builder;->setButtonTheme(I)Lcom/google/android/gms/wallet/button/ButtonOptions$Builder;

    .line 73
    :cond_1
    iget v1, p0, Lcom/reactnativestripesdk/GooglePayButtonView;->borderRadius:I

    int-to-double v1, v1

    invoke-static {v1, v2}, Lcom/facebook/react/uimanager/PixelUtil;->toPixelFromDIP(D)F

    move-result v1

    float-to-int v1, v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/wallet/button/ButtonOptions$Builder;->setCornerRadius(I)Lcom/google/android/gms/wallet/button/ButtonOptions$Builder;

    .line 75
    invoke-virtual {v0}, Lcom/google/android/gms/wallet/button/ButtonOptions$Builder;->build()Lcom/google/android/gms/wallet/button/ButtonOptions;

    move-result-object v0

    const-string v1, "build(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method private final configureGooglePayButton()Lcom/google/android/gms/wallet/button/PayButton;
    .locals 2

    .line 36
    new-instance v0, Lcom/google/android/gms/wallet/button/PayButton;

    .line 37
    iget-object v1, p0, Lcom/reactnativestripesdk/GooglePayButtonView;->context:Lcom/facebook/react/uimanager/ThemedReactContext;

    check-cast v1, Landroid/content/Context;

    .line 36
    invoke-direct {v0, v1}, Lcom/google/android/gms/wallet/button/PayButton;-><init>(Landroid/content/Context;)V

    .line 39
    invoke-direct {p0}, Lcom/reactnativestripesdk/GooglePayButtonView;->buildButtonOptions()Lcom/google/android/gms/wallet/button/ButtonOptions;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/wallet/button/PayButton;->initialize(Lcom/google/android/gms/wallet/button/ButtonOptions;)V

    .line 40
    new-instance v1, Lcom/reactnativestripesdk/GooglePayButtonView$$ExternalSyntheticLambda0;

    invoke-direct {v1, p0}, Lcom/reactnativestripesdk/GooglePayButtonView$$ExternalSyntheticLambda0;-><init>(Lcom/reactnativestripesdk/GooglePayButtonView;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/wallet/button/PayButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-object v0
.end method

.method private static final configureGooglePayButton$lambda$2(Lcom/reactnativestripesdk/GooglePayButtonView;Landroid/view/View;)V
    .locals 0

    .line 42
    invoke-virtual {p0}, Lcom/reactnativestripesdk/GooglePayButtonView;->getParent()Landroid/view/ViewParent;

    move-result-object p0

    instance-of p1, p0, Landroid/view/View;

    if-eqz p1, :cond_0

    check-cast p0, Landroid/view/View;

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    if-eqz p0, :cond_1

    invoke-virtual {p0}, Landroid/view/View;->performClick()Z

    return-void

    .line 43
    :cond_1
    const-string p0, "StripeReactNative"

    const-string p1, "Unable to find parent of GooglePayButtonView."

    invoke-static {p0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method private final getButtonTheme()Ljava/lang/Integer;
    .locals 4

    .line 94
    iget-object v0, p0, Lcom/reactnativestripesdk/GooglePayButtonView;->appearance:Ljava/lang/Integer;

    const/4 v1, 0x2

    if-nez v0, :cond_0

    goto :goto_0

    .line 95
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v2

    if-eqz v2, :cond_5

    :goto_0
    const/4 v2, 0x1

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v3

    if-ne v3, v2, :cond_2

    goto :goto_3

    :cond_2
    :goto_1
    if-nez v0, :cond_3

    goto :goto_2

    .line 96
    :cond_3
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-ne v0, v1, :cond_4

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    :cond_4
    :goto_2
    const/4 v0, 0x0

    return-object v0

    .line 95
    :cond_5
    :goto_3
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method private final getButtonType()Ljava/lang/Integer;
    .locals 5

    .line 79
    iget-object v0, p0, Lcom/reactnativestripesdk/GooglePayButtonView;->type:Ljava/lang/Integer;

    const/4 v1, 0x1

    if-nez v0, :cond_0

    goto :goto_0

    .line 80
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v2

    if-eqz v2, :cond_11

    :goto_0
    if-nez v0, :cond_1

    goto :goto_1

    .line 81
    :cond_1
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v2

    if-ne v2, v1, :cond_2

    goto/16 :goto_9

    :cond_2
    :goto_1
    const/4 v1, 0x6

    if-nez v0, :cond_3

    goto :goto_2

    .line 83
    :cond_3
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v2

    if-ne v2, v1, :cond_4

    const/4 v0, 0x2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    :cond_4
    :goto_2
    const/4 v2, 0x5

    if-nez v0, :cond_5

    goto :goto_3

    .line 84
    :cond_5
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v3

    if-ne v3, v2, :cond_6

    const/4 v0, 0x3

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    :cond_6
    :goto_3
    if-nez v0, :cond_7

    goto :goto_4

    .line 85
    :cond_7
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v3

    const/4 v4, 0x4

    if-ne v3, v4, :cond_8

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    :cond_8
    :goto_4
    if-nez v0, :cond_9

    goto :goto_5

    .line 86
    :cond_9
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v3

    const/16 v4, 0xb

    if-ne v3, v4, :cond_a

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    :cond_a
    :goto_5
    if-nez v0, :cond_b

    goto :goto_6

    .line 87
    :cond_b
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v2

    const/4 v3, 0x7

    if-ne v2, v3, :cond_c

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    :cond_c
    :goto_6
    if-nez v0, :cond_d

    goto :goto_7

    .line 88
    :cond_d
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v2

    const/16 v3, 0x3e8

    if-ne v2, v3, :cond_e

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    :cond_e
    :goto_7
    if-nez v0, :cond_f

    goto :goto_8

    .line 89
    :cond_f
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/16 v1, 0x3e9

    if-ne v0, v1, :cond_10

    const/16 v0, 0x8

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    :cond_10
    :goto_8
    const/4 v0, 0x0

    return-object v0

    .line 82
    :cond_11
    :goto_9
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method private static final initialize$lambda$0(Lcom/reactnativestripesdk/GooglePayButtonView;)V
    .locals 0

    .line 31
    invoke-virtual {p0}, Lcom/reactnativestripesdk/GooglePayButtonView;->requestLayout()V

    return-void
.end method

.method private static final mLayoutRunnable$lambda$5(Lcom/reactnativestripesdk/GooglePayButtonView;)V
    .locals 4

    .line 108
    invoke-virtual {p0}, Lcom/reactnativestripesdk/GooglePayButtonView;->getWidth()I

    move-result v0

    const/high16 v1, 0x40000000    # 2.0f

    invoke-static {v0, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v0

    .line 109
    invoke-virtual {p0}, Lcom/reactnativestripesdk/GooglePayButtonView;->getHeight()I

    move-result v2

    invoke-static {v2, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v1

    .line 107
    invoke-virtual {p0, v0, v1}, Lcom/reactnativestripesdk/GooglePayButtonView;->measure(II)V

    .line 111
    iget-object v0, p0, Lcom/reactnativestripesdk/GooglePayButtonView;->button:Lcom/google/android/gms/wallet/button/PayButton;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/reactnativestripesdk/GooglePayButtonView;->getLeft()I

    move-result v1

    invoke-virtual {p0}, Lcom/reactnativestripesdk/GooglePayButtonView;->getTop()I

    move-result v2

    invoke-virtual {p0}, Lcom/reactnativestripesdk/GooglePayButtonView;->getRight()I

    move-result v3

    invoke-virtual {p0}, Lcom/reactnativestripesdk/GooglePayButtonView;->getBottom()I

    move-result p0

    invoke-virtual {v0, v1, v2, v3, p0}, Lcom/google/android/gms/wallet/button/PayButton;->layout(IIII)V

    :cond_0
    return-void
.end method


# virtual methods
.method public final initialize()V
    .locals 2

    .line 26
    iget-object v0, p0, Lcom/reactnativestripesdk/GooglePayButtonView;->button:Lcom/google/android/gms/wallet/button/PayButton;

    if-eqz v0, :cond_0

    .line 27
    check-cast v0, Landroid/view/View;

    invoke-virtual {p0, v0}, Lcom/reactnativestripesdk/GooglePayButtonView;->removeView(Landroid/view/View;)V

    .line 29
    :cond_0
    invoke-direct {p0}, Lcom/reactnativestripesdk/GooglePayButtonView;->configureGooglePayButton()Lcom/google/android/gms/wallet/button/PayButton;

    move-result-object v0

    iput-object v0, p0, Lcom/reactnativestripesdk/GooglePayButtonView;->button:Lcom/google/android/gms/wallet/button/PayButton;

    .line 30
    check-cast v0, Landroid/view/View;

    invoke-virtual {p0, v0}, Lcom/reactnativestripesdk/GooglePayButtonView;->addView(Landroid/view/View;)V

    .line 31
    invoke-virtual {p0}, Lcom/reactnativestripesdk/GooglePayButtonView;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    new-instance v1, Lcom/reactnativestripesdk/GooglePayButtonView$$ExternalSyntheticLambda1;

    invoke-direct {v1, p0}, Lcom/reactnativestripesdk/GooglePayButtonView$$ExternalSyntheticLambda1;-><init>(Lcom/reactnativestripesdk/GooglePayButtonView;)V

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    return-void
.end method

.method public requestLayout()V
    .locals 1

    .line 101
    invoke-super {p0}, Landroid/widget/FrameLayout;->requestLayout()V

    .line 102
    iget-object v0, p0, Lcom/reactnativestripesdk/GooglePayButtonView;->mLayoutRunnable:Ljava/lang/Runnable;

    invoke-virtual {p0, v0}, Lcom/reactnativestripesdk/GooglePayButtonView;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final setAppearance(I)V
    .locals 0

    .line 119
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Lcom/reactnativestripesdk/GooglePayButtonView;->appearance:Ljava/lang/Integer;

    return-void
.end method

.method public final setBorderRadius(I)V
    .locals 0

    .line 123
    iput p1, p0, Lcom/reactnativestripesdk/GooglePayButtonView;->borderRadius:I

    return-void
.end method

.method public final setType(I)V
    .locals 0

    .line 115
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Lcom/reactnativestripesdk/GooglePayButtonView;->type:Ljava/lang/Integer;

    return-void
.end method
