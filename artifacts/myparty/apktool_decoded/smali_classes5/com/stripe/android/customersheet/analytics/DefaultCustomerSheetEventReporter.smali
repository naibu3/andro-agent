.class public final Lcom/stripe/android/customersheet/analytics/DefaultCustomerSheetEventReporter;
.super Ljava/lang/Object;
.source "DefaultCustomerSheetEventReporter.kt"

# interfaces
.implements Lcom/stripe/android/customersheet/analytics/CustomerSheetEventReporter;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/customersheet/analytics/DefaultCustomerSheetEventReporter$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0003\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u0001\u0018\u00002\u00020\u0001B#\u0008\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0008\u0008\u0001\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000c\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0010\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0010\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0010\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u001f\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u001c2\u0008\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016\u00a2\u0006\u0002\u0010!J\u001f\u0010\"\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u001c2\u0008\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016\u00a2\u0006\u0002\u0010!J\u0008\u0010#\u001a\u00020\u000bH\u0016J\u0008\u0010$\u001a\u00020\u000bH\u0016J\u0008\u0010%\u001a\u00020\u000bH\u0016J\u0008\u0010&\u001a\u00020\u000bH\u0016J\u0010\u0010\'\u001a\u00020\u000b2\u0006\u0010(\u001a\u00020)H\u0016J\u0010\u0010*\u001a\u00020\u000b2\u0006\u0010(\u001a\u00020)H\u0016J\u0010\u0010+\u001a\u00020\u000b2\u0006\u0010(\u001a\u00020)H\u0016J\u0018\u0010,\u001a\u00020\u000b2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u000200H\u0016J\u001a\u00101\u001a\u00020\u000b2\u0006\u0010-\u001a\u00020.2\u0008\u0010/\u001a\u0004\u0018\u000100H\u0016J\u0018\u00102\u001a\u00020\u000b2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u000200H\u0016J\u0012\u00103\u001a\u00020\u000b2\u0008\u0010/\u001a\u0004\u0018\u000100H\u0016J\u001a\u00104\u001a\u00020\u000b2\u0008\u0010/\u001a\u0004\u0018\u0001002\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0008\u00105\u001a\u00020\u000bH\u0016J\u0010\u00106\u001a\u00020\u000b2\u0006\u00107\u001a\u000200H\u0016J\u0010\u00108\u001a\u00020\u000b2\u0006\u00109\u001a\u00020:H\u0016J\u0010\u0010;\u001a\u00020\u000b2\u0006\u00109\u001a\u00020<H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006="
    }
    d2 = {
        "Lcom/stripe/android/customersheet/analytics/DefaultCustomerSheetEventReporter;",
        "Lcom/stripe/android/customersheet/analytics/CustomerSheetEventReporter;",
        "analyticsRequestExecutor",
        "Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;",
        "analyticsRequestFactory",
        "Lcom/stripe/android/core/networking/AnalyticsRequestFactory;",
        "workContext",
        "Lkotlin/coroutines/CoroutineContext;",
        "<init>",
        "(Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;Lcom/stripe/android/core/networking/AnalyticsRequestFactory;Lkotlin/coroutines/CoroutineContext;)V",
        "onInit",
        "",
        "configuration",
        "Lcom/stripe/android/customersheet/CustomerSheet$Configuration;",
        "integrationType",
        "Lcom/stripe/android/customersheet/CustomerSheetIntegration$Type;",
        "onLoadSucceeded",
        "customerSheetSession",
        "Lcom/stripe/android/customersheet/data/CustomerSheetSession;",
        "onLoadFailed",
        "error",
        "",
        "onScreenPresented",
        "screen",
        "Lcom/stripe/android/customersheet/analytics/CustomerSheetEventReporter$Screen;",
        "onScreenHidden",
        "onPaymentMethodSelected",
        "code",
        "",
        "onConfirmPaymentMethodSucceeded",
        "type",
        "syncDefaultEnabled",
        "",
        "(Ljava/lang/String;Ljava/lang/Boolean;)V",
        "onConfirmPaymentMethodFailed",
        "onEditTapped",
        "onEditCompleted",
        "onRemovePaymentMethodSucceeded",
        "onRemovePaymentMethodFailed",
        "onAttachPaymentMethodSucceeded",
        "style",
        "Lcom/stripe/android/customersheet/analytics/CustomerSheetEventReporter$AddPaymentMethodStyle;",
        "onAttachPaymentMethodCanceled",
        "onAttachPaymentMethodFailed",
        "onShowPaymentOptionBrands",
        "source",
        "Lcom/stripe/android/customersheet/analytics/CustomerSheetEventReporter$CardBrandChoiceEventSource;",
        "selectedBrand",
        "Lcom/stripe/android/model/CardBrand;",
        "onHidePaymentOptionBrands",
        "onBrandChoiceSelected",
        "onUpdatePaymentMethodSucceeded",
        "onUpdatePaymentMethodFailed",
        "onCardNumberCompleted",
        "onDisallowedCardBrandEntered",
        "brand",
        "onAnalyticsEvent",
        "event",
        "Lcom/stripe/android/core/networking/AnalyticsEvent;",
        "fireEvent",
        "Lcom/stripe/android/customersheet/analytics/CustomerSheetEvent;",
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
.field private final analyticsRequestExecutor:Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;

.field private final analyticsRequestFactory:Lcom/stripe/android/core/networking/AnalyticsRequestFactory;

.field private final workContext:Lkotlin/coroutines/CoroutineContext;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;Lcom/stripe/android/core/networking/AnalyticsRequestFactory;Lkotlin/coroutines/CoroutineContext;)V
    .locals 1
    .param p3    # Lkotlin/coroutines/CoroutineContext;
        .annotation runtime Lcom/stripe/android/core/injection/IOContext;
        .end annotation
    .end param
    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    const-string v0, "analyticsRequestExecutor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "analyticsRequestFactory"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "workContext"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    iput-object p1, p0, Lcom/stripe/android/customersheet/analytics/DefaultCustomerSheetEventReporter;->analyticsRequestExecutor:Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;

    .line 18
    iput-object p2, p0, Lcom/stripe/android/customersheet/analytics/DefaultCustomerSheetEventReporter;->analyticsRequestFactory:Lcom/stripe/android/core/networking/AnalyticsRequestFactory;

    .line 19
    iput-object p3, p0, Lcom/stripe/android/customersheet/analytics/DefaultCustomerSheetEventReporter;->workContext:Lkotlin/coroutines/CoroutineContext;

    return-void
.end method

.method public static final synthetic access$getAnalyticsRequestExecutor$p(Lcom/stripe/android/customersheet/analytics/DefaultCustomerSheetEventReporter;)Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;
    .locals 0

    .line 16
    iget-object p0, p0, Lcom/stripe/android/customersheet/analytics/DefaultCustomerSheetEventReporter;->analyticsRequestExecutor:Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;

    return-object p0
.end method

.method public static final synthetic access$getAnalyticsRequestFactory$p(Lcom/stripe/android/customersheet/analytics/DefaultCustomerSheetEventReporter;)Lcom/stripe/android/core/networking/AnalyticsRequestFactory;
    .locals 0

    .line 16
    iget-object p0, p0, Lcom/stripe/android/customersheet/analytics/DefaultCustomerSheetEventReporter;->analyticsRequestFactory:Lcom/stripe/android/core/networking/AnalyticsRequestFactory;

    return-object p0
.end method

.method private final fireEvent(Lcom/stripe/android/customersheet/analytics/CustomerSheetEvent;)V
    .locals 7

    .line 244
    iget-object v0, p0, Lcom/stripe/android/customersheet/analytics/DefaultCustomerSheetEventReporter;->workContext:Lkotlin/coroutines/CoroutineContext;

    invoke-static {v0}, Lkotlinx/coroutines/CoroutineScopeKt;->CoroutineScope(Lkotlin/coroutines/CoroutineContext;)Lkotlinx/coroutines/CoroutineScope;

    move-result-object v1

    new-instance v0, Lcom/stripe/android/customersheet/analytics/DefaultCustomerSheetEventReporter$fireEvent$1;

    const/4 v2, 0x0

    invoke-direct {v0, p0, p1, v2}, Lcom/stripe/android/customersheet/analytics/DefaultCustomerSheetEventReporter$fireEvent$1;-><init>(Lcom/stripe/android/customersheet/analytics/DefaultCustomerSheetEventReporter;Lcom/stripe/android/customersheet/analytics/CustomerSheetEvent;Lkotlin/coroutines/Continuation;)V

    move-object v4, v0

    check-cast v4, Lkotlin/jvm/functions/Function2;

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    return-void
.end method


# virtual methods
.method public onAnalyticsEvent(Lcom/stripe/android/core/networking/AnalyticsEvent;)V
    .locals 7

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 233
    iget-object v0, p0, Lcom/stripe/android/customersheet/analytics/DefaultCustomerSheetEventReporter;->workContext:Lkotlin/coroutines/CoroutineContext;

    invoke-static {v0}, Lkotlinx/coroutines/CoroutineScopeKt;->CoroutineScope(Lkotlin/coroutines/CoroutineContext;)Lkotlinx/coroutines/CoroutineScope;

    move-result-object v1

    new-instance v0, Lcom/stripe/android/customersheet/analytics/DefaultCustomerSheetEventReporter$onAnalyticsEvent$1;

    const/4 v2, 0x0

    invoke-direct {v0, p0, p1, v2}, Lcom/stripe/android/customersheet/analytics/DefaultCustomerSheetEventReporter$onAnalyticsEvent$1;-><init>(Lcom/stripe/android/customersheet/analytics/DefaultCustomerSheetEventReporter;Lcom/stripe/android/core/networking/AnalyticsEvent;Lkotlin/coroutines/Continuation;)V

    move-object v4, v0

    check-cast v4, Lkotlin/jvm/functions/Function2;

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    return-void
.end method

.method public onAttachPaymentMethodCanceled(Lcom/stripe/android/customersheet/analytics/CustomerSheetEventReporter$AddPaymentMethodStyle;)V
    .locals 1

    const-string v0, "style"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 130
    sget-object v0, Lcom/stripe/android/customersheet/analytics/CustomerSheetEventReporter$AddPaymentMethodStyle;->SetupIntent:Lcom/stripe/android/customersheet/analytics/CustomerSheetEventReporter$AddPaymentMethodStyle;

    if-ne p1, v0, :cond_0

    .line 132
    new-instance p1, Lcom/stripe/android/customersheet/analytics/CustomerSheetEvent$AttachPaymentMethodCanceled;

    invoke-direct {p1}, Lcom/stripe/android/customersheet/analytics/CustomerSheetEvent$AttachPaymentMethodCanceled;-><init>()V

    check-cast p1, Lcom/stripe/android/customersheet/analytics/CustomerSheetEvent;

    .line 131
    invoke-direct {p0, p1}, Lcom/stripe/android/customersheet/analytics/DefaultCustomerSheetEventReporter;->fireEvent(Lcom/stripe/android/customersheet/analytics/CustomerSheetEvent;)V

    :cond_0
    return-void
.end method

.method public onAttachPaymentMethodFailed(Lcom/stripe/android/customersheet/analytics/CustomerSheetEventReporter$AddPaymentMethodStyle;)V
    .locals 1

    const-string v0, "style"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 141
    new-instance v0, Lcom/stripe/android/customersheet/analytics/CustomerSheetEvent$AttachPaymentMethodFailed;

    invoke-direct {v0, p1}, Lcom/stripe/android/customersheet/analytics/CustomerSheetEvent$AttachPaymentMethodFailed;-><init>(Lcom/stripe/android/customersheet/analytics/CustomerSheetEventReporter$AddPaymentMethodStyle;)V

    check-cast v0, Lcom/stripe/android/customersheet/analytics/CustomerSheetEvent;

    .line 140
    invoke-direct {p0, v0}, Lcom/stripe/android/customersheet/analytics/DefaultCustomerSheetEventReporter;->fireEvent(Lcom/stripe/android/customersheet/analytics/CustomerSheetEvent;)V

    return-void
.end method

.method public onAttachPaymentMethodSucceeded(Lcom/stripe/android/customersheet/analytics/CustomerSheetEventReporter$AddPaymentMethodStyle;)V
    .locals 1

    const-string v0, "style"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 121
    new-instance v0, Lcom/stripe/android/customersheet/analytics/CustomerSheetEvent$AttachPaymentMethodSucceeded;

    invoke-direct {v0, p1}, Lcom/stripe/android/customersheet/analytics/CustomerSheetEvent$AttachPaymentMethodSucceeded;-><init>(Lcom/stripe/android/customersheet/analytics/CustomerSheetEventReporter$AddPaymentMethodStyle;)V

    check-cast v0, Lcom/stripe/android/customersheet/analytics/CustomerSheetEvent;

    .line 120
    invoke-direct {p0, v0}, Lcom/stripe/android/customersheet/analytics/DefaultCustomerSheetEventReporter;->fireEvent(Lcom/stripe/android/customersheet/analytics/CustomerSheetEvent;)V

    return-void
.end method

.method public onBrandChoiceSelected(Lcom/stripe/android/customersheet/analytics/CustomerSheetEventReporter$CardBrandChoiceEventSource;Lcom/stripe/android/model/CardBrand;)V
    .locals 2

    const-string v0, "source"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "selectedBrand"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 186
    new-instance v0, Lcom/stripe/android/customersheet/analytics/CustomerSheetEvent$BrandChoiceSelected;

    .line 187
    sget-object v1, Lcom/stripe/android/customersheet/analytics/DefaultCustomerSheetEventReporter$WhenMappings;->$EnumSwitchMapping$1:[I

    invoke-virtual {p1}, Lcom/stripe/android/customersheet/analytics/CustomerSheetEventReporter$CardBrandChoiceEventSource;->ordinal()I

    move-result p1

    aget p1, v1, p1

    const/4 v1, 0x1

    if-eq p1, v1, :cond_1

    const/4 v1, 0x2

    if-ne p1, v1, :cond_0

    .line 191
    sget-object p1, Lcom/stripe/android/customersheet/analytics/CustomerSheetEvent$BrandChoiceSelected$Source;->Edit:Lcom/stripe/android/customersheet/analytics/CustomerSheetEvent$BrandChoiceSelected$Source;

    goto :goto_0

    .line 187
    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    .line 189
    :cond_1
    sget-object p1, Lcom/stripe/android/customersheet/analytics/CustomerSheetEvent$BrandChoiceSelected$Source;->Add:Lcom/stripe/android/customersheet/analytics/CustomerSheetEvent$BrandChoiceSelected$Source;

    .line 186
    :goto_0
    invoke-direct {v0, p1, p2}, Lcom/stripe/android/customersheet/analytics/CustomerSheetEvent$BrandChoiceSelected;-><init>(Lcom/stripe/android/customersheet/analytics/CustomerSheetEvent$BrandChoiceSelected$Source;Lcom/stripe/android/model/CardBrand;)V

    check-cast v0, Lcom/stripe/android/customersheet/analytics/CustomerSheetEvent;

    .line 185
    invoke-direct {p0, v0}, Lcom/stripe/android/customersheet/analytics/DefaultCustomerSheetEventReporter;->fireEvent(Lcom/stripe/android/customersheet/analytics/CustomerSheetEvent;)V

    return-void
.end method

.method public onCardNumberCompleted()V
    .locals 1

    .line 221
    new-instance v0, Lcom/stripe/android/customersheet/analytics/CustomerSheetEvent$CardNumberCompleted;

    invoke-direct {v0}, Lcom/stripe/android/customersheet/analytics/CustomerSheetEvent$CardNumberCompleted;-><init>()V

    check-cast v0, Lcom/stripe/android/customersheet/analytics/CustomerSheetEvent;

    invoke-direct {p0, v0}, Lcom/stripe/android/customersheet/analytics/DefaultCustomerSheetEventReporter;->fireEvent(Lcom/stripe/android/customersheet/analytics/CustomerSheetEvent;)V

    return-void
.end method

.method public onConfirmPaymentMethodFailed(Ljava/lang/String;Ljava/lang/Boolean;)V
    .locals 1

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 86
    new-instance v0, Lcom/stripe/android/customersheet/analytics/CustomerSheetEvent$ConfirmPaymentMethodFailed;

    invoke-direct {v0, p1, p2}, Lcom/stripe/android/customersheet/analytics/CustomerSheetEvent$ConfirmPaymentMethodFailed;-><init>(Ljava/lang/String;Ljava/lang/Boolean;)V

    check-cast v0, Lcom/stripe/android/customersheet/analytics/CustomerSheetEvent;

    .line 85
    invoke-direct {p0, v0}, Lcom/stripe/android/customersheet/analytics/DefaultCustomerSheetEventReporter;->fireEvent(Lcom/stripe/android/customersheet/analytics/CustomerSheetEvent;)V

    return-void
.end method

.method public onConfirmPaymentMethodSucceeded(Ljava/lang/String;Ljava/lang/Boolean;)V
    .locals 1

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 74
    new-instance v0, Lcom/stripe/android/customersheet/analytics/CustomerSheetEvent$ConfirmPaymentMethodSucceeded;

    invoke-direct {v0, p1, p2}, Lcom/stripe/android/customersheet/analytics/CustomerSheetEvent$ConfirmPaymentMethodSucceeded;-><init>(Ljava/lang/String;Ljava/lang/Boolean;)V

    check-cast v0, Lcom/stripe/android/customersheet/analytics/CustomerSheetEvent;

    .line 73
    invoke-direct {p0, v0}, Lcom/stripe/android/customersheet/analytics/DefaultCustomerSheetEventReporter;->fireEvent(Lcom/stripe/android/customersheet/analytics/CustomerSheetEvent;)V

    return-void
.end method

.method public onDisallowedCardBrandEntered(Lcom/stripe/android/model/CardBrand;)V
    .locals 1

    const-string v0, "brand"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 226
    new-instance v0, Lcom/stripe/android/customersheet/analytics/CustomerSheetEvent$CardBrandDisallowed;

    invoke-direct {v0, p1}, Lcom/stripe/android/customersheet/analytics/CustomerSheetEvent$CardBrandDisallowed;-><init>(Lcom/stripe/android/model/CardBrand;)V

    check-cast v0, Lcom/stripe/android/customersheet/analytics/CustomerSheetEvent;

    .line 225
    invoke-direct {p0, v0}, Lcom/stripe/android/customersheet/analytics/DefaultCustomerSheetEventReporter;->fireEvent(Lcom/stripe/android/customersheet/analytics/CustomerSheetEvent;)V

    return-void
.end method

.method public onEditCompleted()V
    .locals 1

    .line 101
    new-instance v0, Lcom/stripe/android/customersheet/analytics/CustomerSheetEvent$EditCompleted;

    invoke-direct {v0}, Lcom/stripe/android/customersheet/analytics/CustomerSheetEvent$EditCompleted;-><init>()V

    check-cast v0, Lcom/stripe/android/customersheet/analytics/CustomerSheetEvent;

    .line 100
    invoke-direct {p0, v0}, Lcom/stripe/android/customersheet/analytics/DefaultCustomerSheetEventReporter;->fireEvent(Lcom/stripe/android/customersheet/analytics/CustomerSheetEvent;)V

    return-void
.end method

.method public onEditTapped()V
    .locals 1

    .line 95
    new-instance v0, Lcom/stripe/android/customersheet/analytics/CustomerSheetEvent$EditTapped;

    invoke-direct {v0}, Lcom/stripe/android/customersheet/analytics/CustomerSheetEvent$EditTapped;-><init>()V

    check-cast v0, Lcom/stripe/android/customersheet/analytics/CustomerSheetEvent;

    .line 94
    invoke-direct {p0, v0}, Lcom/stripe/android/customersheet/analytics/DefaultCustomerSheetEventReporter;->fireEvent(Lcom/stripe/android/customersheet/analytics/CustomerSheetEvent;)V

    return-void
.end method

.method public onHidePaymentOptionBrands(Lcom/stripe/android/customersheet/analytics/CustomerSheetEventReporter$CardBrandChoiceEventSource;Lcom/stripe/android/model/CardBrand;)V
    .locals 2

    const-string v0, "source"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 169
    new-instance v0, Lcom/stripe/android/customersheet/analytics/CustomerSheetEvent$HidePaymentOptionBrands;

    .line 170
    sget-object v1, Lcom/stripe/android/customersheet/analytics/DefaultCustomerSheetEventReporter$WhenMappings;->$EnumSwitchMapping$1:[I

    invoke-virtual {p1}, Lcom/stripe/android/customersheet/analytics/CustomerSheetEventReporter$CardBrandChoiceEventSource;->ordinal()I

    move-result p1

    aget p1, v1, p1

    const/4 v1, 0x1

    if-eq p1, v1, :cond_1

    const/4 v1, 0x2

    if-ne p1, v1, :cond_0

    .line 174
    sget-object p1, Lcom/stripe/android/customersheet/analytics/CustomerSheetEvent$HidePaymentOptionBrands$Source;->Edit:Lcom/stripe/android/customersheet/analytics/CustomerSheetEvent$HidePaymentOptionBrands$Source;

    goto :goto_0

    .line 170
    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    .line 172
    :cond_1
    sget-object p1, Lcom/stripe/android/customersheet/analytics/CustomerSheetEvent$HidePaymentOptionBrands$Source;->Add:Lcom/stripe/android/customersheet/analytics/CustomerSheetEvent$HidePaymentOptionBrands$Source;

    .line 169
    :goto_0
    invoke-direct {v0, p1, p2}, Lcom/stripe/android/customersheet/analytics/CustomerSheetEvent$HidePaymentOptionBrands;-><init>(Lcom/stripe/android/customersheet/analytics/CustomerSheetEvent$HidePaymentOptionBrands$Source;Lcom/stripe/android/model/CardBrand;)V

    check-cast v0, Lcom/stripe/android/customersheet/analytics/CustomerSheetEvent;

    .line 168
    invoke-direct {p0, v0}, Lcom/stripe/android/customersheet/analytics/DefaultCustomerSheetEventReporter;->fireEvent(Lcom/stripe/android/customersheet/analytics/CustomerSheetEvent;)V

    return-void
.end method

.method public onInit(Lcom/stripe/android/customersheet/CustomerSheet$Configuration;Lcom/stripe/android/customersheet/CustomerSheetIntegration$Type;)V
    .locals 1

    const-string v0, "configuration"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "integrationType"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    new-instance v0, Lcom/stripe/android/customersheet/analytics/CustomerSheetEvent$Init;

    invoke-direct {v0, p1, p2}, Lcom/stripe/android/customersheet/analytics/CustomerSheetEvent$Init;-><init>(Lcom/stripe/android/customersheet/CustomerSheet$Configuration;Lcom/stripe/android/customersheet/CustomerSheetIntegration$Type;)V

    check-cast v0, Lcom/stripe/android/customersheet/analytics/CustomerSheetEvent;

    .line 25
    invoke-direct {p0, v0}, Lcom/stripe/android/customersheet/analytics/DefaultCustomerSheetEventReporter;->fireEvent(Lcom/stripe/android/customersheet/analytics/CustomerSheetEvent;)V

    return-void
.end method

.method public onLoadFailed(Ljava/lang/Throwable;)V
    .locals 1

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 38
    new-instance v0, Lcom/stripe/android/customersheet/analytics/CustomerSheetEvent$LoadFailed;

    invoke-direct {v0, p1}, Lcom/stripe/android/customersheet/analytics/CustomerSheetEvent$LoadFailed;-><init>(Ljava/lang/Throwable;)V

    check-cast v0, Lcom/stripe/android/customersheet/analytics/CustomerSheetEvent;

    .line 37
    invoke-direct {p0, v0}, Lcom/stripe/android/customersheet/analytics/DefaultCustomerSheetEventReporter;->fireEvent(Lcom/stripe/android/customersheet/analytics/CustomerSheetEvent;)V

    return-void
.end method

.method public onLoadSucceeded(Lcom/stripe/android/customersheet/data/CustomerSheetSession;)V
    .locals 1

    const-string v0, "customerSheetSession"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 32
    new-instance v0, Lcom/stripe/android/customersheet/analytics/CustomerSheetEvent$LoadSucceeded;

    invoke-direct {v0, p1}, Lcom/stripe/android/customersheet/analytics/CustomerSheetEvent$LoadSucceeded;-><init>(Lcom/stripe/android/customersheet/data/CustomerSheetSession;)V

    check-cast v0, Lcom/stripe/android/customersheet/analytics/CustomerSheetEvent;

    .line 31
    invoke-direct {p0, v0}, Lcom/stripe/android/customersheet/analytics/DefaultCustomerSheetEventReporter;->fireEvent(Lcom/stripe/android/customersheet/analytics/CustomerSheetEvent;)V

    return-void
.end method

.method public onPaymentMethodSelected(Ljava/lang/String;)V
    .locals 1

    const-string v0, "code"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 65
    new-instance v0, Lcom/stripe/android/customersheet/analytics/CustomerSheetEvent$SelectPaymentMethod;

    invoke-direct {v0, p1}, Lcom/stripe/android/customersheet/analytics/CustomerSheetEvent$SelectPaymentMethod;-><init>(Ljava/lang/String;)V

    check-cast v0, Lcom/stripe/android/customersheet/analytics/CustomerSheetEvent;

    .line 64
    invoke-direct {p0, v0}, Lcom/stripe/android/customersheet/analytics/DefaultCustomerSheetEventReporter;->fireEvent(Lcom/stripe/android/customersheet/analytics/CustomerSheetEvent;)V

    return-void
.end method

.method public onRemovePaymentMethodFailed()V
    .locals 1

    .line 113
    new-instance v0, Lcom/stripe/android/customersheet/analytics/CustomerSheetEvent$RemovePaymentMethodFailed;

    invoke-direct {v0}, Lcom/stripe/android/customersheet/analytics/CustomerSheetEvent$RemovePaymentMethodFailed;-><init>()V

    check-cast v0, Lcom/stripe/android/customersheet/analytics/CustomerSheetEvent;

    .line 112
    invoke-direct {p0, v0}, Lcom/stripe/android/customersheet/analytics/DefaultCustomerSheetEventReporter;->fireEvent(Lcom/stripe/android/customersheet/analytics/CustomerSheetEvent;)V

    return-void
.end method

.method public onRemovePaymentMethodSucceeded()V
    .locals 1

    .line 107
    new-instance v0, Lcom/stripe/android/customersheet/analytics/CustomerSheetEvent$RemovePaymentMethodSucceeded;

    invoke-direct {v0}, Lcom/stripe/android/customersheet/analytics/CustomerSheetEvent$RemovePaymentMethodSucceeded;-><init>()V

    check-cast v0, Lcom/stripe/android/customersheet/analytics/CustomerSheetEvent;

    .line 106
    invoke-direct {p0, v0}, Lcom/stripe/android/customersheet/analytics/DefaultCustomerSheetEventReporter;->fireEvent(Lcom/stripe/android/customersheet/analytics/CustomerSheetEvent;)V

    return-void
.end method

.method public onScreenHidden(Lcom/stripe/android/customersheet/analytics/CustomerSheetEventReporter$Screen;)V
    .locals 2

    const-string v0, "screen"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 51
    sget-object v0, Lcom/stripe/android/customersheet/analytics/DefaultCustomerSheetEventReporter$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {p1}, Lcom/stripe/android/customersheet/analytics/CustomerSheetEventReporter$Screen;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 54
    new-instance v0, Lcom/stripe/android/customersheet/analytics/CustomerSheetEvent$ScreenHidden;

    invoke-direct {v0, p1}, Lcom/stripe/android/customersheet/analytics/CustomerSheetEvent$ScreenHidden;-><init>(Lcom/stripe/android/customersheet/analytics/CustomerSheetEventReporter$Screen;)V

    check-cast v0, Lcom/stripe/android/customersheet/analytics/CustomerSheetEvent;

    .line 53
    invoke-direct {p0, v0}, Lcom/stripe/android/customersheet/analytics/DefaultCustomerSheetEventReporter;->fireEvent(Lcom/stripe/android/customersheet/analytics/CustomerSheetEvent;)V

    :cond_0
    return-void
.end method

.method public onScreenPresented(Lcom/stripe/android/customersheet/analytics/CustomerSheetEventReporter$Screen;)V
    .locals 1

    const-string v0, "screen"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 44
    new-instance v0, Lcom/stripe/android/customersheet/analytics/CustomerSheetEvent$ScreenPresented;

    invoke-direct {v0, p1}, Lcom/stripe/android/customersheet/analytics/CustomerSheetEvent$ScreenPresented;-><init>(Lcom/stripe/android/customersheet/analytics/CustomerSheetEventReporter$Screen;)V

    check-cast v0, Lcom/stripe/android/customersheet/analytics/CustomerSheetEvent;

    .line 43
    invoke-direct {p0, v0}, Lcom/stripe/android/customersheet/analytics/DefaultCustomerSheetEventReporter;->fireEvent(Lcom/stripe/android/customersheet/analytics/CustomerSheetEvent;)V

    return-void
.end method

.method public onShowPaymentOptionBrands(Lcom/stripe/android/customersheet/analytics/CustomerSheetEventReporter$CardBrandChoiceEventSource;Lcom/stripe/android/model/CardBrand;)V
    .locals 2

    const-string v0, "source"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "selectedBrand"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 152
    new-instance v0, Lcom/stripe/android/customersheet/analytics/CustomerSheetEvent$ShowPaymentOptionBrands;

    .line 153
    sget-object v1, Lcom/stripe/android/customersheet/analytics/DefaultCustomerSheetEventReporter$WhenMappings;->$EnumSwitchMapping$1:[I

    invoke-virtual {p1}, Lcom/stripe/android/customersheet/analytics/CustomerSheetEventReporter$CardBrandChoiceEventSource;->ordinal()I

    move-result p1

    aget p1, v1, p1

    const/4 v1, 0x1

    if-eq p1, v1, :cond_1

    const/4 v1, 0x2

    if-ne p1, v1, :cond_0

    .line 157
    sget-object p1, Lcom/stripe/android/customersheet/analytics/CustomerSheetEvent$ShowPaymentOptionBrands$Source;->Edit:Lcom/stripe/android/customersheet/analytics/CustomerSheetEvent$ShowPaymentOptionBrands$Source;

    goto :goto_0

    .line 153
    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    .line 155
    :cond_1
    sget-object p1, Lcom/stripe/android/customersheet/analytics/CustomerSheetEvent$ShowPaymentOptionBrands$Source;->Add:Lcom/stripe/android/customersheet/analytics/CustomerSheetEvent$ShowPaymentOptionBrands$Source;

    .line 152
    :goto_0
    invoke-direct {v0, p1, p2}, Lcom/stripe/android/customersheet/analytics/CustomerSheetEvent$ShowPaymentOptionBrands;-><init>(Lcom/stripe/android/customersheet/analytics/CustomerSheetEvent$ShowPaymentOptionBrands$Source;Lcom/stripe/android/model/CardBrand;)V

    check-cast v0, Lcom/stripe/android/customersheet/analytics/CustomerSheetEvent;

    .line 151
    invoke-direct {p0, v0}, Lcom/stripe/android/customersheet/analytics/DefaultCustomerSheetEventReporter;->fireEvent(Lcom/stripe/android/customersheet/analytics/CustomerSheetEvent;)V

    return-void
.end method

.method public onUpdatePaymentMethodFailed(Lcom/stripe/android/model/CardBrand;Ljava/lang/Throwable;)V
    .locals 1

    const-string v0, "error"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 213
    new-instance v0, Lcom/stripe/android/customersheet/analytics/CustomerSheetEvent$UpdatePaymentOptionFailed;

    invoke-direct {v0, p1, p2}, Lcom/stripe/android/customersheet/analytics/CustomerSheetEvent$UpdatePaymentOptionFailed;-><init>(Lcom/stripe/android/model/CardBrand;Ljava/lang/Throwable;)V

    check-cast v0, Lcom/stripe/android/customersheet/analytics/CustomerSheetEvent;

    .line 212
    invoke-direct {p0, v0}, Lcom/stripe/android/customersheet/analytics/DefaultCustomerSheetEventReporter;->fireEvent(Lcom/stripe/android/customersheet/analytics/CustomerSheetEvent;)V

    return-void
.end method

.method public onUpdatePaymentMethodSucceeded(Lcom/stripe/android/model/CardBrand;)V
    .locals 1

    .line 202
    new-instance v0, Lcom/stripe/android/customersheet/analytics/CustomerSheetEvent$UpdatePaymentOptionSucceeded;

    invoke-direct {v0, p1}, Lcom/stripe/android/customersheet/analytics/CustomerSheetEvent$UpdatePaymentOptionSucceeded;-><init>(Lcom/stripe/android/model/CardBrand;)V

    check-cast v0, Lcom/stripe/android/customersheet/analytics/CustomerSheetEvent;

    .line 201
    invoke-direct {p0, v0}, Lcom/stripe/android/customersheet/analytics/DefaultCustomerSheetEventReporter;->fireEvent(Lcom/stripe/android/customersheet/analytics/CustomerSheetEvent;)V

    return-void
.end method
