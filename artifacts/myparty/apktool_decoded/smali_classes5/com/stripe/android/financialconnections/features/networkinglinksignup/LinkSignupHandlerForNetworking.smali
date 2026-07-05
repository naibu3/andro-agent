.class public final Lcom/stripe/android/financialconnections/features/networkinglinksignup/LinkSignupHandlerForNetworking;
.super Ljava/lang/Object;
.source "LinkSignupHandler.kt"

# interfaces
.implements Lcom/stripe/android/financialconnections/features/networkinglinksignup/LinkSignupHandler;


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nLinkSignupHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LinkSignupHandler.kt\ncom/stripe/android/financialconnections/features/networkinglinksignup/LinkSignupHandlerForNetworking\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,191:1\n1#2:192\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0003\n\u0000\u0008\u0001\u0018\u00002\u00020\u0001BS\u0008\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\u000c\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0008\u0008\u0001\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u0016\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0096@\u00a2\u0006\u0002\u0010\u001aJ\u0008\u0010\u001b\u001a\u00020\u001cH\u0016J\u0018\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u001fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0008\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000c\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006 "
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/features/networkinglinksignup/LinkSignupHandlerForNetworking;",
        "Lcom/stripe/android/financialconnections/features/networkinglinksignup/LinkSignupHandler;",
        "consumerRepository",
        "Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepository;",
        "getOrFetchSync",
        "Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;",
        "getCachedAccounts",
        "Lcom/stripe/android/financialconnections/domain/GetCachedAccounts;",
        "requestIntegrityToken",
        "Lcom/stripe/android/financialconnections/domain/RequestIntegrityToken;",
        "saveAccountToLink",
        "Lcom/stripe/android/financialconnections/domain/SaveAccountToLink;",
        "eventTracker",
        "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;",
        "navigationManager",
        "Lcom/stripe/android/uicore/navigation/NavigationManager;",
        "applicationId",
        "",
        "logger",
        "Lcom/stripe/android/core/Logger;",
        "<init>",
        "(Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepository;Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;Lcom/stripe/android/financialconnections/domain/GetCachedAccounts;Lcom/stripe/android/financialconnections/domain/RequestIntegrityToken;Lcom/stripe/android/financialconnections/domain/SaveAccountToLink;Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;Lcom/stripe/android/uicore/navigation/NavigationManager;Ljava/lang/String;Lcom/stripe/android/core/Logger;)V",
        "performSignup",
        "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;",
        "state",
        "Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;",
        "(Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "navigateToVerification",
        "",
        "handleSignupFailure",
        "error",
        "",
        "financial-connections_release"
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
.field private final applicationId:Ljava/lang/String;

.field private final consumerRepository:Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepository;

.field private final eventTracker:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;

.field private final getCachedAccounts:Lcom/stripe/android/financialconnections/domain/GetCachedAccounts;

.field private final getOrFetchSync:Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;

.field private final logger:Lcom/stripe/android/core/Logger;

.field private final navigationManager:Lcom/stripe/android/uicore/navigation/NavigationManager;

.field private final requestIntegrityToken:Lcom/stripe/android/financialconnections/domain/RequestIntegrityToken;

.field private final saveAccountToLink:Lcom/stripe/android/financialconnections/domain/SaveAccountToLink;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepository;Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;Lcom/stripe/android/financialconnections/domain/GetCachedAccounts;Lcom/stripe/android/financialconnections/domain/RequestIntegrityToken;Lcom/stripe/android/financialconnections/domain/SaveAccountToLink;Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;Lcom/stripe/android/uicore/navigation/NavigationManager;Ljava/lang/String;Lcom/stripe/android/core/Logger;)V
    .locals 1
    .param p8    # Ljava/lang/String;
        .annotation runtime Ljavax/inject/Named;
            value = "applicationId"
        .end annotation
    .end param
    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    const-string v0, "consumerRepository"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "getOrFetchSync"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "getCachedAccounts"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "requestIntegrityToken"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "saveAccountToLink"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "eventTracker"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "navigationManager"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "applicationId"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 111
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 112
    iput-object p1, p0, Lcom/stripe/android/financialconnections/features/networkinglinksignup/LinkSignupHandlerForNetworking;->consumerRepository:Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepository;

    .line 113
    iput-object p2, p0, Lcom/stripe/android/financialconnections/features/networkinglinksignup/LinkSignupHandlerForNetworking;->getOrFetchSync:Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;

    .line 114
    iput-object p3, p0, Lcom/stripe/android/financialconnections/features/networkinglinksignup/LinkSignupHandlerForNetworking;->getCachedAccounts:Lcom/stripe/android/financialconnections/domain/GetCachedAccounts;

    .line 115
    iput-object p4, p0, Lcom/stripe/android/financialconnections/features/networkinglinksignup/LinkSignupHandlerForNetworking;->requestIntegrityToken:Lcom/stripe/android/financialconnections/domain/RequestIntegrityToken;

    .line 116
    iput-object p5, p0, Lcom/stripe/android/financialconnections/features/networkinglinksignup/LinkSignupHandlerForNetworking;->saveAccountToLink:Lcom/stripe/android/financialconnections/domain/SaveAccountToLink;

    .line 117
    iput-object p6, p0, Lcom/stripe/android/financialconnections/features/networkinglinksignup/LinkSignupHandlerForNetworking;->eventTracker:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;

    .line 118
    iput-object p7, p0, Lcom/stripe/android/financialconnections/features/networkinglinksignup/LinkSignupHandlerForNetworking;->navigationManager:Lcom/stripe/android/uicore/navigation/NavigationManager;

    .line 119
    iput-object p8, p0, Lcom/stripe/android/financialconnections/features/networkinglinksignup/LinkSignupHandlerForNetworking;->applicationId:Ljava/lang/String;

    .line 120
    iput-object p9, p0, Lcom/stripe/android/financialconnections/features/networkinglinksignup/LinkSignupHandlerForNetworking;->logger:Lcom/stripe/android/core/Logger;

    return-void
.end method


# virtual methods
.method public handleSignupFailure(Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;Ljava/lang/Throwable;)V
    .locals 9

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "error"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 175
    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/networkinglinksignup/LinkSignupHandlerForNetworking;->eventTracker:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;

    .line 178
    new-instance v1, Lcom/stripe/android/financialconnections/ElementsSessionContext$PrefillDetails;

    .line 179
    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;->getValidEmail()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 180
    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;->getValidPhone()Ljava/lang/String;

    move-result-object v3

    .line 181
    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;->getPayload()Lcom/stripe/android/financialconnections/presentation/Async;

    move-result-object p1

    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/presentation/Async;->invoke()Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    check-cast p1, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState$Payload;

    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState$Payload;->getPhoneController()Lcom/stripe/android/uicore/elements/PhoneNumberController;

    move-result-object p1

    invoke-virtual {p1}, Lcom/stripe/android/uicore/elements/PhoneNumberController;->getCountryCode()Ljava/lang/String;

    move-result-object p1

    .line 178
    invoke-direct {v1, v2, v3, p1}, Lcom/stripe/android/financialconnections/ElementsSessionContext$PrefillDetails;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 177
    invoke-static {p2, v1}, Lcom/stripe/android/financialconnections/features/error/ErrorExtKt;->toAttestationErrorIfApplicable(Ljava/lang/Throwable;Lcom/stripe/android/financialconnections/ElementsSessionContext$PrefillDetails;)Ljava/lang/Throwable;

    move-result-object p1

    .line 184
    iget-object p2, p0, Lcom/stripe/android/financialconnections/features/networkinglinksignup/LinkSignupHandlerForNetworking;->logger:Lcom/stripe/android/core/Logger;

    .line 185
    sget-object v1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;->NETWORKING_LINK_SIGNUP_PANE:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    .line 175
    const-string v2, "Error saving account to Link"

    invoke-static {v0, v2, p1, p2, v1}, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTrackerKt;->logError(Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;Ljava/lang/String;Ljava/lang/Throwable;Lcom/stripe/android/core/Logger;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;)V

    .line 188
    iget-object v3, p0, Lcom/stripe/android/financialconnections/features/networkinglinksignup/LinkSignupHandlerForNetworking;->navigationManager:Lcom/stripe/android/uicore/navigation/NavigationManager;

    sget-object p1, Lcom/stripe/android/financialconnections/navigation/Destination$Success;->INSTANCE:Lcom/stripe/android/financialconnections/navigation/Destination$Success;

    check-cast p1, Lcom/stripe/android/financialconnections/navigation/Destination;

    sget-object p2, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;->NETWORKING_LINK_SIGNUP_PANE:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p1, p2, v0, v1, v0}, Lcom/stripe/android/financialconnections/navigation/Destination;->invoke$default(Lcom/stripe/android/financialconnections/navigation/Destination;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Ljava/util/Map;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    const/4 v7, 0x6

    const/4 v8, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v3 .. v8}, Lcom/stripe/android/uicore/navigation/NavigationManager$DefaultImpls;->tryNavigateTo$default(Lcom/stripe/android/uicore/navigation/NavigationManager;Ljava/lang/String;Lcom/stripe/android/uicore/navigation/PopUpToBehavior;ZILjava/lang/Object;)V

    return-void
.end method

.method public navigateToVerification()V
    .locals 6

    .line 168
    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/networkinglinksignup/LinkSignupHandlerForNetworking;->navigationManager:Lcom/stripe/android/uicore/navigation/NavigationManager;

    sget-object v1, Lcom/stripe/android/financialconnections/navigation/Destination$NetworkingSaveToLinkVerification;->INSTANCE:Lcom/stripe/android/financialconnections/navigation/Destination$NetworkingSaveToLinkVerification;

    check-cast v1, Lcom/stripe/android/financialconnections/navigation/Destination;

    sget-object v2, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;->NETWORKING_LINK_SIGNUP_PANE:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    const/4 v3, 0x0

    const/4 v4, 0x2

    invoke-static {v1, v2, v3, v4, v3}, Lcom/stripe/android/financialconnections/navigation/Destination;->invoke$default(Lcom/stripe/android/financialconnections/navigation/Destination;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Ljava/util/Map;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const/4 v4, 0x6

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, Lcom/stripe/android/uicore/navigation/NavigationManager$DefaultImpls;->tryNavigateTo$default(Lcom/stripe/android/uicore/navigation/NavigationManager;Ljava/lang/String;Lcom/stripe/android/uicore/navigation/PopUpToBehavior;ZILjava/lang/Object;)V

    return-void
.end method

.method public performSignup(Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lcom/stripe/android/financialconnections/features/networkinglinksignup/LinkSignupHandlerForNetworking$performSignup$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/stripe/android/financialconnections/features/networkinglinksignup/LinkSignupHandlerForNetworking$performSignup$1;

    iget v1, v0, Lcom/stripe/android/financialconnections/features/networkinglinksignup/LinkSignupHandlerForNetworking$performSignup$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p2, v0, Lcom/stripe/android/financialconnections/features/networkinglinksignup/LinkSignupHandlerForNetworking$performSignup$1;->label:I

    sub-int/2addr p2, v2

    iput p2, v0, Lcom/stripe/android/financialconnections/features/networkinglinksignup/LinkSignupHandlerForNetworking$performSignup$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/financialconnections/features/networkinglinksignup/LinkSignupHandlerForNetworking$performSignup$1;

    invoke-direct {v0, p0, p2}, Lcom/stripe/android/financialconnections/features/networkinglinksignup/LinkSignupHandlerForNetworking$performSignup$1;-><init>(Lcom/stripe/android/financialconnections/features/networkinglinksignup/LinkSignupHandlerForNetworking;Lkotlin/coroutines/Continuation;)V

    :goto_0
    move-object v7, v0

    iget-object p2, v7, Lcom/stripe/android/financialconnections/features/networkinglinksignup/LinkSignupHandlerForNetworking$performSignup$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 123
    iget v1, v7, Lcom/stripe/android/financialconnections/features/networkinglinksignup/LinkSignupHandlerForNetworking$performSignup$1;->label:I

    const/4 v8, 0x0

    packed-switch v1, :pswitch_data_0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_0
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_7

    :pswitch_1
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_5

    :pswitch_2
    iget-object p1, v7, Lcom/stripe/android/financialconnections/features/networkinglinksignup/LinkSignupHandlerForNetworking$performSignup$1;->L$2:Ljava/lang/Object;

    check-cast p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;

    iget-object v1, v7, Lcom/stripe/android/financialconnections/features/networkinglinksignup/LinkSignupHandlerForNetworking$performSignup$1;->L$1:Ljava/lang/Object;

    check-cast v1, Ljava/util/List;

    iget-object v2, v7, Lcom/stripe/android/financialconnections/features/networkinglinksignup/LinkSignupHandlerForNetworking$performSignup$1;->L$0:Ljava/lang/Object;

    check-cast v2, Lcom/stripe/android/financialconnections/features/networkinglinksignup/LinkSignupHandlerForNetworking;

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_4

    :pswitch_3
    iget-object p1, v7, Lcom/stripe/android/financialconnections/features/networkinglinksignup/LinkSignupHandlerForNetworking$performSignup$1;->L$4:Ljava/lang/Object;

    check-cast p1, Lcom/stripe/android/uicore/elements/PhoneNumberController;

    iget-object v1, v7, Lcom/stripe/android/financialconnections/features/networkinglinksignup/LinkSignupHandlerForNetworking$performSignup$1;->L$3:Ljava/lang/Object;

    check-cast v1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;

    iget-object v2, v7, Lcom/stripe/android/financialconnections/features/networkinglinksignup/LinkSignupHandlerForNetworking$performSignup$1;->L$2:Ljava/lang/Object;

    check-cast v2, Ljava/util/List;

    iget-object v3, v7, Lcom/stripe/android/financialconnections/features/networkinglinksignup/LinkSignupHandlerForNetworking$performSignup$1;->L$1:Ljava/lang/Object;

    check-cast v3, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;

    iget-object v4, v7, Lcom/stripe/android/financialconnections/features/networkinglinksignup/LinkSignupHandlerForNetworking$performSignup$1;->L$0:Ljava/lang/Object;

    check-cast v4, Lcom/stripe/android/financialconnections/features/networkinglinksignup/LinkSignupHandlerForNetworking;

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v9, v1

    move-object v1, p2

    move-object p2, v9

    move-object v9, v2

    move-object v10, v4

    goto/16 :goto_3

    :pswitch_4
    iget-object p1, v7, Lcom/stripe/android/financialconnections/features/networkinglinksignup/LinkSignupHandlerForNetworking$performSignup$1;->L$2:Ljava/lang/Object;

    check-cast p1, Ljava/util/List;

    iget-object v1, v7, Lcom/stripe/android/financialconnections/features/networkinglinksignup/LinkSignupHandlerForNetworking$performSignup$1;->L$1:Ljava/lang/Object;

    check-cast v1, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;

    iget-object v2, v7, Lcom/stripe/android/financialconnections/features/networkinglinksignup/LinkSignupHandlerForNetworking$performSignup$1;->L$0:Ljava/lang/Object;

    check-cast v2, Lcom/stripe/android/financialconnections/features/networkinglinksignup/LinkSignupHandlerForNetworking;

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v4, p1

    move-object v3, v1

    goto :goto_2

    :pswitch_5
    iget-object p1, v7, Lcom/stripe/android/financialconnections/features/networkinglinksignup/LinkSignupHandlerForNetworking$performSignup$1;->L$1:Ljava/lang/Object;

    check-cast p1, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;

    iget-object v1, v7, Lcom/stripe/android/financialconnections/features/networkinglinksignup/LinkSignupHandlerForNetworking$performSignup$1;->L$0:Ljava/lang/Object;

    check-cast v1, Lcom/stripe/android/financialconnections/features/networkinglinksignup/LinkSignupHandlerForNetworking;

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v9, v1

    goto :goto_1

    :pswitch_6
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 126
    iget-object p2, p0, Lcom/stripe/android/financialconnections/features/networkinglinksignup/LinkSignupHandlerForNetworking;->eventTracker:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;

    new-instance v1, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$Click;

    const-string v2, "click.save_to_link"

    sget-object v3, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;->NETWORKING_LINK_SIGNUP_PANE:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    invoke-direct {v1, v2, v3}, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$Click;-><init>(Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;)V

    check-cast v1, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent;

    invoke-interface {p2, v1}, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;->track(Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent;)V

    .line 127
    iget-object p2, p0, Lcom/stripe/android/financialconnections/features/networkinglinksignup/LinkSignupHandlerForNetworking;->getCachedAccounts:Lcom/stripe/android/financialconnections/domain/GetCachedAccounts;

    iput-object p0, v7, Lcom/stripe/android/financialconnections/features/networkinglinksignup/LinkSignupHandlerForNetworking$performSignup$1;->L$0:Ljava/lang/Object;

    iput-object p1, v7, Lcom/stripe/android/financialconnections/features/networkinglinksignup/LinkSignupHandlerForNetworking$performSignup$1;->L$1:Ljava/lang/Object;

    const/4 v1, 0x1

    iput v1, v7, Lcom/stripe/android/financialconnections/features/networkinglinksignup/LinkSignupHandlerForNetworking$performSignup$1;->label:I

    invoke-virtual {p2, v7}, Lcom/stripe/android/financialconnections/domain/GetCachedAccounts;->invoke(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v0, :cond_1

    goto/16 :goto_6

    :cond_1
    move-object v9, p0

    .line 123
    :goto_1
    check-cast p2, Ljava/util/List;

    .line 128
    iget-object v1, v9, Lcom/stripe/android/financialconnections/features/networkinglinksignup/LinkSignupHandlerForNetworking;->getOrFetchSync:Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;

    iput-object v9, v7, Lcom/stripe/android/financialconnections/features/networkinglinksignup/LinkSignupHandlerForNetworking$performSignup$1;->L$0:Ljava/lang/Object;

    iput-object p1, v7, Lcom/stripe/android/financialconnections/features/networkinglinksignup/LinkSignupHandlerForNetworking$performSignup$1;->L$1:Ljava/lang/Object;

    iput-object p2, v7, Lcom/stripe/android/financialconnections/features/networkinglinksignup/LinkSignupHandlerForNetworking$performSignup$1;->L$2:Ljava/lang/Object;

    const/4 v2, 0x2

    iput v2, v7, Lcom/stripe/android/financialconnections/features/networkinglinksignup/LinkSignupHandlerForNetworking$performSignup$1;->label:I

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x3

    const/4 v6, 0x0

    move-object v4, v7

    invoke-static/range {v1 .. v6}, Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;->invoke$default(Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;Lcom/stripe/android/financialconnections/domain/GetOrFetchSync$RefetchCondition;ZLkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_2

    goto/16 :goto_6

    :cond_2
    move-object v3, p1

    move-object v4, p2

    move-object p2, v1

    move-object v2, v9

    :goto_2
    check-cast p2, Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;

    invoke-virtual {p2}, Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;->getManifest()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;

    move-result-object p1

    .line 129
    invoke-virtual {v3}, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;->getPayload()Lcom/stripe/android/financialconnections/presentation/Async;

    move-result-object p2

    invoke-virtual {p2}, Lcom/stripe/android/financialconnections/presentation/Async;->invoke()Ljava/lang/Object;

    move-result-object p2

    invoke-static {p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    check-cast p2, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState$Payload;

    invoke-virtual {p2}, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState$Payload;->getPhoneController()Lcom/stripe/android/uicore/elements/PhoneNumberController;

    move-result-object p2

    .line 130
    invoke-virtual {v3}, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;->getValid()Z

    move-result v1

    if-eqz v1, :cond_8

    .line 132
    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->getAppVerificationEnabled()Z

    move-result v1

    if-eqz v1, :cond_6

    .line 136
    iget-object v1, v2, Lcom/stripe/android/financialconnections/features/networkinglinksignup/LinkSignupHandlerForNetworking;->requestIntegrityToken:Lcom/stripe/android/financialconnections/domain/RequestIntegrityToken;

    .line 137
    sget-object v5, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$AttestationEndpoint;->SIGNUP:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$AttestationEndpoint;

    .line 138
    sget-object v6, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;->NETWORKING_LINK_SIGNUP_PANE:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    .line 136
    iput-object v2, v7, Lcom/stripe/android/financialconnections/features/networkinglinksignup/LinkSignupHandlerForNetworking$performSignup$1;->L$0:Ljava/lang/Object;

    iput-object v3, v7, Lcom/stripe/android/financialconnections/features/networkinglinksignup/LinkSignupHandlerForNetworking$performSignup$1;->L$1:Ljava/lang/Object;

    iput-object v4, v7, Lcom/stripe/android/financialconnections/features/networkinglinksignup/LinkSignupHandlerForNetworking$performSignup$1;->L$2:Ljava/lang/Object;

    iput-object p1, v7, Lcom/stripe/android/financialconnections/features/networkinglinksignup/LinkSignupHandlerForNetworking$performSignup$1;->L$3:Ljava/lang/Object;

    iput-object p2, v7, Lcom/stripe/android/financialconnections/features/networkinglinksignup/LinkSignupHandlerForNetworking$performSignup$1;->L$4:Ljava/lang/Object;

    const/4 v9, 0x3

    iput v9, v7, Lcom/stripe/android/financialconnections/features/networkinglinksignup/LinkSignupHandlerForNetworking$performSignup$1;->label:I

    invoke-virtual {v1, v5, v6, v7}, Lcom/stripe/android/financialconnections/domain/RequestIntegrityToken;->invoke(Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$AttestationEndpoint;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_3

    goto/16 :goto_6

    :cond_3
    move-object v9, p2

    move-object p2, p1

    move-object p1, v9

    move-object v10, v2

    move-object v9, v4

    .line 123
    :goto_3
    move-object v5, v1

    check-cast v5, Ljava/lang/String;

    .line 140
    iget-object v1, v10, Lcom/stripe/android/financialconnections/features/networkinglinksignup/LinkSignupHandlerForNetworking;->consumerRepository:Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepository;

    .line 141
    invoke-virtual {v3}, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;->getValidEmail()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 142
    invoke-virtual {v3}, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;->getValidPhone()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 143
    invoke-virtual {p1}, Lcom/stripe/android/uicore/elements/PhoneNumberController;->getCountryCode()Ljava/lang/String;

    move-result-object v4

    .line 145
    iget-object v6, v10, Lcom/stripe/android/financialconnections/features/networkinglinksignup/LinkSignupHandlerForNetworking;->applicationId:Ljava/lang/String;

    .line 140
    iput-object v10, v7, Lcom/stripe/android/financialconnections/features/networkinglinksignup/LinkSignupHandlerForNetworking$performSignup$1;->L$0:Ljava/lang/Object;

    iput-object v9, v7, Lcom/stripe/android/financialconnections/features/networkinglinksignup/LinkSignupHandlerForNetworking$performSignup$1;->L$1:Ljava/lang/Object;

    iput-object p2, v7, Lcom/stripe/android/financialconnections/features/networkinglinksignup/LinkSignupHandlerForNetworking$performSignup$1;->L$2:Ljava/lang/Object;

    iput-object v8, v7, Lcom/stripe/android/financialconnections/features/networkinglinksignup/LinkSignupHandlerForNetworking$performSignup$1;->L$3:Ljava/lang/Object;

    iput-object v8, v7, Lcom/stripe/android/financialconnections/features/networkinglinksignup/LinkSignupHandlerForNetworking$performSignup$1;->L$4:Ljava/lang/Object;

    const/4 p1, 0x4

    iput p1, v7, Lcom/stripe/android/financialconnections/features/networkinglinksignup/LinkSignupHandlerForNetworking$performSignup$1;->label:I

    invoke-interface/range {v1 .. v7}, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepository;->mobileSignUp(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    goto :goto_6

    :cond_4
    move-object v1, p2

    move-object p2, p1

    move-object p1, v1

    move-object v1, v9

    move-object v2, v10

    .line 123
    :goto_4
    check-cast p2, Lcom/stripe/android/model/ConsumerSessionSignup;

    .line 147
    iget-object v2, v2, Lcom/stripe/android/financialconnections/features/networkinglinksignup/LinkSignupHandlerForNetworking;->saveAccountToLink:Lcom/stripe/android/financialconnections/domain/SaveAccountToLink;

    .line 148
    invoke-virtual {p2}, Lcom/stripe/android/model/ConsumerSessionSignup;->getConsumerSession()Lcom/stripe/android/model/ConsumerSession;

    move-result-object p2

    invoke-virtual {p2}, Lcom/stripe/android/model/ConsumerSession;->getClientSecret()Ljava/lang/String;

    move-result-object p2

    .line 150
    invoke-static {p1}, Lcom/stripe/android/financialconnections/features/common/ManifestExtensionsKt;->isDataFlow(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;)Z

    move-result p1

    .line 147
    iput-object v8, v7, Lcom/stripe/android/financialconnections/features/networkinglinksignup/LinkSignupHandlerForNetworking$performSignup$1;->L$0:Ljava/lang/Object;

    iput-object v8, v7, Lcom/stripe/android/financialconnections/features/networkinglinksignup/LinkSignupHandlerForNetworking$performSignup$1;->L$1:Ljava/lang/Object;

    iput-object v8, v7, Lcom/stripe/android/financialconnections/features/networkinglinksignup/LinkSignupHandlerForNetworking$performSignup$1;->L$2:Ljava/lang/Object;

    const/4 v3, 0x5

    iput v3, v7, Lcom/stripe/android/financialconnections/features/networkinglinksignup/LinkSignupHandlerForNetworking$performSignup$1;->label:I

    invoke-virtual {v2, p2, v1, p1, v7}, Lcom/stripe/android/financialconnections/domain/SaveAccountToLink;->existing(Ljava/lang/String;Ljava/util/List;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v0, :cond_5

    goto :goto_6

    :cond_5
    :goto_5
    check-cast p2, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;

    goto :goto_8

    .line 156
    :cond_6
    iget-object v1, v2, Lcom/stripe/android/financialconnections/features/networkinglinksignup/LinkSignupHandlerForNetworking;->saveAccountToLink:Lcom/stripe/android/financialconnections/domain/SaveAccountToLink;

    .line 157
    invoke-virtual {p2}, Lcom/stripe/android/uicore/elements/PhoneNumberController;->getCountryCode()Ljava/lang/String;

    move-result-object v5

    .line 158
    invoke-virtual {v3}, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;->getValidEmail()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 159
    invoke-virtual {v3}, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;->getValidPhone()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 161
    invoke-static {p1}, Lcom/stripe/android/financialconnections/features/common/ManifestExtensionsKt;->isDataFlow(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;)Z

    move-result v6

    .line 156
    iput-object v8, v7, Lcom/stripe/android/financialconnections/features/networkinglinksignup/LinkSignupHandlerForNetworking$performSignup$1;->L$0:Ljava/lang/Object;

    iput-object v8, v7, Lcom/stripe/android/financialconnections/features/networkinglinksignup/LinkSignupHandlerForNetworking$performSignup$1;->L$1:Ljava/lang/Object;

    iput-object v8, v7, Lcom/stripe/android/financialconnections/features/networkinglinksignup/LinkSignupHandlerForNetworking$performSignup$1;->L$2:Ljava/lang/Object;

    const/4 p1, 0x6

    iput p1, v7, Lcom/stripe/android/financialconnections/features/networkinglinksignup/LinkSignupHandlerForNetworking$performSignup$1;->label:I

    invoke-virtual/range {v1 .. v7}, Lcom/stripe/android/financialconnections/domain/SaveAccountToLink;->new(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v0, :cond_7

    :goto_6
    return-object v0

    .line 164
    :cond_7
    :goto_7
    check-cast p2, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;

    :goto_8
    sget-object p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;->SUCCESS:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    return-object p1

    .line 130
    :cond_8
    invoke-virtual {v3}, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;->getValidEmail()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v3}, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;->getValidPhone()Ljava/lang/String;

    move-result-object p2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Form invalid! "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    const-string v0, " "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
