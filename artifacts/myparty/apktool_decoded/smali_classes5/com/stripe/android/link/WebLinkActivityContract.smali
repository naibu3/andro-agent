.class public final Lcom/stripe/android/link/WebLinkActivityContract;
.super Landroidx/activity/result/contract/ActivityResultContract;
.source "WebLinkActivityContract.kt"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/activity/result/contract/ActivityResultContract<",
        "Lcom/stripe/android/link/LinkActivityContract$Args;",
        "Lcom/stripe/android/link/LinkActivityResult;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0008\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\u0008\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000c\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0002H\u0016J\u001a\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00112\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u000bH\u0016J\u0012\u0010\u0013\u001a\u00020\u00032\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u000bH\u0002J\u000e\u0010\u0014\u001a\u0004\u0018\u00010\u0015*\u00020\u0016H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"
    }
    d2 = {
        "Lcom/stripe/android/link/WebLinkActivityContract;",
        "Landroidx/activity/result/contract/ActivityResultContract;",
        "Lcom/stripe/android/link/LinkActivityContract$Args;",
        "Lcom/stripe/android/link/LinkActivityResult;",
        "stripeRepository",
        "Lcom/stripe/android/networking/StripeRepository;",
        "errorReporter",
        "Lcom/stripe/android/payments/core/analytics/ErrorReporter;",
        "<init>",
        "(Lcom/stripe/android/networking/StripeRepository;Lcom/stripe/android/payments/core/analytics/ErrorReporter;)V",
        "createIntent",
        "Landroid/content/Intent;",
        "context",
        "Landroid/content/Context;",
        "input",
        "parseResult",
        "resultCode",
        "",
        "intent",
        "handleCompleteResult",
        "parsePaymentMethod",
        "Lcom/stripe/android/model/PaymentMethod;",
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


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private final errorReporter:Lcom/stripe/android/payments/core/analytics/ErrorReporter;

.field private final stripeRepository:Lcom/stripe/android/networking/StripeRepository;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/networking/StripeRepository;Lcom/stripe/android/payments/core/analytics/ErrorReporter;)V
    .locals 1
    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    const-string v0, "stripeRepository"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "errorReporter"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    invoke-direct {p0}, Landroidx/activity/result/contract/ActivityResultContract;-><init>()V

    .line 23
    iput-object p1, p0, Lcom/stripe/android/link/WebLinkActivityContract;->stripeRepository:Lcom/stripe/android/networking/StripeRepository;

    .line 24
    iput-object p2, p0, Lcom/stripe/android/link/WebLinkActivityContract;->errorReporter:Lcom/stripe/android/payments/core/analytics/ErrorReporter;

    return-void
.end method

.method private final handleCompleteResult(Landroid/content/Intent;)Lcom/stripe/android/link/LinkActivityResult;
    .locals 5

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-eqz p1, :cond_7

    .line 80
    invoke-virtual {p1}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object p1

    if-nez p1, :cond_0

    goto :goto_2

    .line 83
    :cond_0
    const-string v2, "link_status"

    invoke-virtual {p1, v2}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_6

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v3

    const v4, -0x4167ea76

    if-eq v3, v4, :cond_4

    const v4, -0x23bacec7

    if-eq v3, v4, :cond_1

    goto :goto_1

    :cond_1
    const-string v3, "complete"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_6

    .line 85
    const-string v2, "pm"

    invoke-virtual {p1, v2}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_2

    .line 86
    invoke-direct {p0, p1}, Lcom/stripe/android/link/WebLinkActivityContract;->parsePaymentMethod(Ljava/lang/String;)Lcom/stripe/android/model/PaymentMethod;

    move-result-object p1

    goto :goto_0

    :cond_2
    move-object p1, v1

    :goto_0
    if-nez p1, :cond_3

    .line 88
    new-instance p1, Lcom/stripe/android/link/LinkActivityResult$Canceled;

    .line 89
    sget-object v2, Lcom/stripe/android/link/LinkAccountUpdate$None;->INSTANCE:Lcom/stripe/android/link/LinkAccountUpdate$None;

    check-cast v2, Lcom/stripe/android/link/LinkAccountUpdate;

    .line 88
    invoke-direct {p1, v1, v2, v0, v1}, Lcom/stripe/android/link/LinkActivityResult$Canceled;-><init>(Lcom/stripe/android/link/LinkActivityResult$Canceled$Reason;Lcom/stripe/android/link/LinkAccountUpdate;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    check-cast p1, Lcom/stripe/android/link/LinkActivityResult;

    return-object p1

    .line 92
    :cond_3
    new-instance v0, Lcom/stripe/android/link/LinkActivityResult$PaymentMethodObtained;

    invoke-direct {v0, p1}, Lcom/stripe/android/link/LinkActivityResult$PaymentMethodObtained;-><init>(Lcom/stripe/android/model/PaymentMethod;)V

    check-cast v0, Lcom/stripe/android/link/LinkActivityResult;

    return-object v0

    .line 83
    :cond_4
    const-string p1, "logout"

    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    goto :goto_1

    .line 97
    :cond_5
    new-instance p1, Lcom/stripe/android/link/LinkActivityResult$Canceled;

    .line 98
    sget-object v0, Lcom/stripe/android/link/LinkActivityResult$Canceled$Reason;->LoggedOut:Lcom/stripe/android/link/LinkActivityResult$Canceled$Reason;

    .line 99
    sget-object v1, Lcom/stripe/android/link/LinkAccountUpdate$None;->INSTANCE:Lcom/stripe/android/link/LinkAccountUpdate$None;

    check-cast v1, Lcom/stripe/android/link/LinkAccountUpdate;

    .line 97
    invoke-direct {p1, v0, v1}, Lcom/stripe/android/link/LinkActivityResult$Canceled;-><init>(Lcom/stripe/android/link/LinkActivityResult$Canceled$Reason;Lcom/stripe/android/link/LinkAccountUpdate;)V

    check-cast p1, Lcom/stripe/android/link/LinkActivityResult;

    return-object p1

    .line 104
    :cond_6
    :goto_1
    new-instance p1, Lcom/stripe/android/link/LinkActivityResult$Canceled;

    .line 105
    sget-object v2, Lcom/stripe/android/link/LinkAccountUpdate$None;->INSTANCE:Lcom/stripe/android/link/LinkAccountUpdate$None;

    check-cast v2, Lcom/stripe/android/link/LinkAccountUpdate;

    .line 104
    invoke-direct {p1, v1, v2, v0, v1}, Lcom/stripe/android/link/LinkActivityResult$Canceled;-><init>(Lcom/stripe/android/link/LinkActivityResult$Canceled$Reason;Lcom/stripe/android/link/LinkAccountUpdate;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    check-cast p1, Lcom/stripe/android/link/LinkActivityResult;

    return-object p1

    .line 80
    :cond_7
    :goto_2
    new-instance p1, Lcom/stripe/android/link/LinkActivityResult$Canceled;

    .line 81
    sget-object v2, Lcom/stripe/android/link/LinkAccountUpdate$None;->INSTANCE:Lcom/stripe/android/link/LinkAccountUpdate$None;

    check-cast v2, Lcom/stripe/android/link/LinkAccountUpdate;

    .line 80
    invoke-direct {p1, v1, v2, v0, v1}, Lcom/stripe/android/link/LinkActivityResult$Canceled;-><init>(Lcom/stripe/android/link/LinkActivityResult$Canceled$Reason;Lcom/stripe/android/link/LinkAccountUpdate;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    check-cast p1, Lcom/stripe/android/link/LinkActivityResult;

    return-object p1
.end method

.method private final parsePaymentMethod(Ljava/lang/String;)Lcom/stripe/android/model/PaymentMethod;
    .locals 7

    .line 112
    :try_start_0
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    const/4 v0, 0x0

    .line 113
    invoke-static {p1, v0}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    move-result-object p1

    const-string v0, "decode(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lkotlin/text/Charsets;->UTF_8:Ljava/nio/charset/Charset;

    new-instance v1, Ljava/lang/String;

    invoke-direct {v1, p1, v0}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 114
    new-instance p1, Lcom/stripe/android/model/parsers/PaymentMethodJsonParser;

    invoke-direct {p1}, Lcom/stripe/android/model/parsers/PaymentMethodJsonParser;-><init>()V

    .line 115
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0, v1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Lcom/stripe/android/model/parsers/PaymentMethodJsonParser;->parse(Lorg/json/JSONObject;)Lcom/stripe/android/model/PaymentMethod;

    move-result-object p1

    .line 112
    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    move-object p1, v0

    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    .line 116
    :goto_0
    invoke-static {p1}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_1

    .line 117
    :cond_0
    iget-object v1, p0, Lcom/stripe/android/link/WebLinkActivityContract;->errorReporter:Lcom/stripe/android/payments/core/analytics/ErrorReporter;

    .line 118
    sget-object p1, Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;->LINK_WEB_FAILED_TO_PARSE_RESULT_URI:Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;

    move-object v2, p1

    check-cast v2, Lcom/stripe/android/payments/core/analytics/ErrorReporter$ErrorEvent;

    .line 119
    new-instance p1, Lcom/stripe/android/link/FailedToParseLinkResultUriException;

    invoke-direct {p1, v0}, Lcom/stripe/android/link/FailedToParseLinkResultUriException;-><init>(Ljava/lang/Throwable;)V

    move-object v3, p1

    check-cast v3, Lcom/stripe/android/core/exception/StripeException;

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    .line 117
    invoke-static/range {v1 .. v6}, Lcom/stripe/android/payments/core/analytics/ErrorReporter$DefaultImpls;->report$default(Lcom/stripe/android/payments/core/analytics/ErrorReporter;Lcom/stripe/android/payments/core/analytics/ErrorReporter$ErrorEvent;Lcom/stripe/android/core/exception/StripeException;Ljava/util/Map;ILjava/lang/Object;)V

    const/4 p1, 0x0

    .line 116
    :goto_1
    check-cast p1, Lcom/stripe/android/model/PaymentMethod;

    return-object p1
.end method


# virtual methods
.method public createIntent(Landroid/content/Context;Lcom/stripe/android/link/LinkActivityContract$Args;)Landroid/content/Intent;
    .locals 7

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "input"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    sget-object v0, Lcom/stripe/android/PaymentConfiguration;->Companion:Lcom/stripe/android/PaymentConfiguration$Companion;

    invoke-virtual {v0, p1}, Lcom/stripe/android/PaymentConfiguration$Companion;->getInstance(Landroid/content/Context;)Lcom/stripe/android/PaymentConfiguration;

    move-result-object v0

    .line 29
    sget-object v1, Lcom/stripe/android/link/serialization/PopupPayload;->Companion:Lcom/stripe/android/link/serialization/PopupPayload$Companion;

    .line 30
    invoke-virtual {p2}, Lcom/stripe/android/link/LinkActivityContract$Args;->getConfiguration$paymentsheet_release()Lcom/stripe/android/link/LinkConfiguration;

    move-result-object v2

    .line 32
    invoke-virtual {v0}, Lcom/stripe/android/PaymentConfiguration;->getPublishableKey()Ljava/lang/String;

    move-result-object v4

    .line 33
    invoke-virtual {v0}, Lcom/stripe/android/PaymentConfiguration;->getStripeAccountId()Ljava/lang/String;

    move-result-object v5

    .line 34
    iget-object p2, p0, Lcom/stripe/android/link/WebLinkActivityContract;->stripeRepository:Lcom/stripe/android/networking/StripeRepository;

    const/4 v0, 0x0

    const/4 v3, 0x1

    invoke-static {p2, v0, v3, v0}, Lcom/stripe/android/networking/StripeRepository$DefaultImpls;->buildPaymentUserAgent$default(Lcom/stripe/android/networking/StripeRepository;Ljava/util/Set;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    move-object v3, p1

    .line 29
    invoke-virtual/range {v1 .. v6}, Lcom/stripe/android/link/serialization/PopupPayload$Companion;->create(Lcom/stripe/android/link/LinkConfiguration;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/stripe/android/link/serialization/PopupPayload;

    move-result-object p1

    .line 36
    sget-object p2, Lcom/stripe/android/link/LinkForegroundActivity;->Companion:Lcom/stripe/android/link/LinkForegroundActivity$Companion;

    invoke-virtual {p1}, Lcom/stripe/android/link/serialization/PopupPayload;->toUrl()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, v3, p1}, Lcom/stripe/android/link/LinkForegroundActivity$Companion;->createIntent(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic createIntent(Landroid/content/Context;Ljava/lang/Object;)Landroid/content/Intent;
    .locals 0

    .line 22
    check-cast p2, Lcom/stripe/android/link/LinkActivityContract$Args;

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/link/WebLinkActivityContract;->createIntent(Landroid/content/Context;Lcom/stripe/android/link/LinkActivityContract$Args;)Landroid/content/Intent;

    move-result-object p1

    return-object p1
.end method

.method public parseResult(ILandroid/content/Intent;)Lcom/stripe/android/link/LinkActivityResult;
    .locals 3

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-eqz p1, :cond_4

    const v2, 0xc2cf

    if-eq p1, v2, :cond_3

    const v2, 0x164e7

    if-eq p1, v2, :cond_0

    .line 72
    new-instance p1, Lcom/stripe/android/link/LinkActivityResult$Canceled;

    .line 73
    sget-object p2, Lcom/stripe/android/link/LinkAccountUpdate$None;->INSTANCE:Lcom/stripe/android/link/LinkAccountUpdate$None;

    check-cast p2, Lcom/stripe/android/link/LinkAccountUpdate;

    .line 72
    invoke-direct {p1, v1, p2, v0, v1}, Lcom/stripe/android/link/LinkActivityResult$Canceled;-><init>(Lcom/stripe/android/link/LinkActivityResult$Canceled$Reason;Lcom/stripe/android/link/LinkAccountUpdate;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    check-cast p1, Lcom/stripe/android/link/LinkActivityResult;

    return-object p1

    :cond_0
    if-eqz p2, :cond_1

    .line 42
    invoke-virtual {p2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 45
    const-string p2, "LinkFailure"

    .line 46
    const-class v2, Ljava/lang/Exception;

    .line 43
    invoke-static {p1, p2, v2}, Landroidx/core/os/BundleCompat;->getSerializable(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Class;)Ljava/io/Serializable;

    move-result-object p1

    check-cast p1, Ljava/lang/Exception;

    goto :goto_0

    :cond_1
    move-object p1, v1

    :goto_0
    if-eqz p1, :cond_2

    .line 50
    new-instance p2, Lcom/stripe/android/link/LinkActivityResult$Failed;

    .line 51
    check-cast p1, Ljava/lang/Throwable;

    .line 52
    sget-object v0, Lcom/stripe/android/link/LinkAccountUpdate$None;->INSTANCE:Lcom/stripe/android/link/LinkAccountUpdate$None;

    check-cast v0, Lcom/stripe/android/link/LinkAccountUpdate;

    .line 50
    invoke-direct {p2, p1, v0}, Lcom/stripe/android/link/LinkActivityResult$Failed;-><init>(Ljava/lang/Throwable;Lcom/stripe/android/link/LinkAccountUpdate;)V

    check-cast p2, Lcom/stripe/android/link/LinkActivityResult;

    return-object p2

    .line 56
    :cond_2
    new-instance p1, Lcom/stripe/android/link/LinkActivityResult$Canceled;

    .line 57
    sget-object p2, Lcom/stripe/android/link/LinkAccountUpdate$None;->INSTANCE:Lcom/stripe/android/link/LinkAccountUpdate$None;

    check-cast p2, Lcom/stripe/android/link/LinkAccountUpdate;

    .line 56
    invoke-direct {p1, v1, p2, v0, v1}, Lcom/stripe/android/link/LinkActivityResult$Canceled;-><init>(Lcom/stripe/android/link/LinkActivityResult$Canceled$Reason;Lcom/stripe/android/link/LinkAccountUpdate;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    check-cast p1, Lcom/stripe/android/link/LinkActivityResult;

    return-object p1

    .line 63
    :cond_3
    invoke-direct {p0, p2}, Lcom/stripe/android/link/WebLinkActivityContract;->handleCompleteResult(Landroid/content/Intent;)Lcom/stripe/android/link/LinkActivityResult;

    move-result-object p1

    return-object p1

    .line 67
    :cond_4
    new-instance p1, Lcom/stripe/android/link/LinkActivityResult$Canceled;

    .line 68
    sget-object p2, Lcom/stripe/android/link/LinkAccountUpdate$None;->INSTANCE:Lcom/stripe/android/link/LinkAccountUpdate$None;

    check-cast p2, Lcom/stripe/android/link/LinkAccountUpdate;

    .line 67
    invoke-direct {p1, v1, p2, v0, v1}, Lcom/stripe/android/link/LinkActivityResult$Canceled;-><init>(Lcom/stripe/android/link/LinkActivityResult$Canceled$Reason;Lcom/stripe/android/link/LinkAccountUpdate;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    check-cast p1, Lcom/stripe/android/link/LinkActivityResult;

    return-object p1
.end method

.method public bridge synthetic parseResult(ILandroid/content/Intent;)Ljava/lang/Object;
    .locals 0

    .line 22
    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/link/WebLinkActivityContract;->parseResult(ILandroid/content/Intent;)Lcom/stripe/android/link/LinkActivityResult;

    move-result-object p1

    return-object p1
.end method
