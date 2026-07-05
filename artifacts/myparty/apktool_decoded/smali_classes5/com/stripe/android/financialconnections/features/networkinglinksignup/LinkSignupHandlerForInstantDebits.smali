.class public final Lcom/stripe/android/financialconnections/features/networkinglinksignup/LinkSignupHandlerForInstantDebits;
.super Ljava/lang/Object;
.source "LinkSignupHandler.kt"

# interfaces
.implements Lcom/stripe/android/financialconnections/features/networkinglinksignup/LinkSignupHandler;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0003\n\u0000\u0008\u0001\u0018\u00002\u00020\u0001BC\u0008\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0008\u0008\u0001\u0010\u000c\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0096@\u00a2\u0006\u0002\u0010\u0016J\u0008\u0010\u0017\u001a\u00020\u0018H\u0016J\u0018\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u001bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0008\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000c\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/features/networkinglinksignup/LinkSignupHandlerForInstantDebits;",
        "Lcom/stripe/android/financialconnections/features/networkinglinksignup/LinkSignupHandler;",
        "consumerRepository",
        "Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepository;",
        "attachConsumerToLinkAccountSession",
        "Lcom/stripe/android/financialconnections/domain/AttachConsumerToLinkAccountSession;",
        "requestIntegrityToken",
        "Lcom/stripe/android/financialconnections/domain/RequestIntegrityToken;",
        "getOrFetchSync",
        "Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;",
        "navigationManager",
        "Lcom/stripe/android/uicore/navigation/NavigationManager;",
        "applicationId",
        "",
        "handleError",
        "Lcom/stripe/android/financialconnections/domain/HandleError;",
        "<init>",
        "(Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepository;Lcom/stripe/android/financialconnections/domain/AttachConsumerToLinkAccountSession;Lcom/stripe/android/financialconnections/domain/RequestIntegrityToken;Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;Lcom/stripe/android/uicore/navigation/NavigationManager;Ljava/lang/String;Lcom/stripe/android/financialconnections/domain/HandleError;)V",
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

.field private final attachConsumerToLinkAccountSession:Lcom/stripe/android/financialconnections/domain/AttachConsumerToLinkAccountSession;

.field private final consumerRepository:Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepository;

.field private final getOrFetchSync:Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;

.field private final handleError:Lcom/stripe/android/financialconnections/domain/HandleError;

.field private final navigationManager:Lcom/stripe/android/uicore/navigation/NavigationManager;

.field private final requestIntegrityToken:Lcom/stripe/android/financialconnections/domain/RequestIntegrityToken;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepository;Lcom/stripe/android/financialconnections/domain/AttachConsumerToLinkAccountSession;Lcom/stripe/android/financialconnections/domain/RequestIntegrityToken;Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;Lcom/stripe/android/uicore/navigation/NavigationManager;Ljava/lang/String;Lcom/stripe/android/financialconnections/domain/HandleError;)V
    .locals 1
    .param p6    # Ljava/lang/String;
        .annotation runtime Ljavax/inject/Named;
            value = "applicationId"
        .end annotation
    .end param
    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    const-string v0, "consumerRepository"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "attachConsumerToLinkAccountSession"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "requestIntegrityToken"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "getOrFetchSync"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "navigationManager"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "applicationId"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "handleError"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 44
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 45
    iput-object p1, p0, Lcom/stripe/android/financialconnections/features/networkinglinksignup/LinkSignupHandlerForInstantDebits;->consumerRepository:Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepository;

    .line 46
    iput-object p2, p0, Lcom/stripe/android/financialconnections/features/networkinglinksignup/LinkSignupHandlerForInstantDebits;->attachConsumerToLinkAccountSession:Lcom/stripe/android/financialconnections/domain/AttachConsumerToLinkAccountSession;

    .line 47
    iput-object p3, p0, Lcom/stripe/android/financialconnections/features/networkinglinksignup/LinkSignupHandlerForInstantDebits;->requestIntegrityToken:Lcom/stripe/android/financialconnections/domain/RequestIntegrityToken;

    .line 48
    iput-object p4, p0, Lcom/stripe/android/financialconnections/features/networkinglinksignup/LinkSignupHandlerForInstantDebits;->getOrFetchSync:Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;

    .line 49
    iput-object p5, p0, Lcom/stripe/android/financialconnections/features/networkinglinksignup/LinkSignupHandlerForInstantDebits;->navigationManager:Lcom/stripe/android/uicore/navigation/NavigationManager;

    .line 50
    iput-object p6, p0, Lcom/stripe/android/financialconnections/features/networkinglinksignup/LinkSignupHandlerForInstantDebits;->applicationId:Ljava/lang/String;

    .line 51
    iput-object p7, p0, Lcom/stripe/android/financialconnections/features/networkinglinksignup/LinkSignupHandlerForInstantDebits;->handleError:Lcom/stripe/android/financialconnections/domain/HandleError;

    return-void
.end method


# virtual methods
.method public handleSignupFailure(Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;Ljava/lang/Throwable;)V
    .locals 4

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "error"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 96
    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/networkinglinksignup/LinkSignupHandlerForInstantDebits;->handleError:Lcom/stripe/android/financialconnections/domain/HandleError;

    .line 99
    new-instance v1, Lcom/stripe/android/financialconnections/ElementsSessionContext$PrefillDetails;

    .line 100
    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;->getValidEmail()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 101
    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;->getValidPhone()Ljava/lang/String;

    move-result-object v3

    .line 102
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

    .line 99
    invoke-direct {v1, v2, v3, p1}, Lcom/stripe/android/financialconnections/ElementsSessionContext$PrefillDetails;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 98
    invoke-static {p2, v1}, Lcom/stripe/android/financialconnections/features/error/ErrorExtKt;->toAttestationErrorIfApplicable(Ljava/lang/Throwable;Lcom/stripe/android/financialconnections/ElementsSessionContext$PrefillDetails;)Ljava/lang/Throwable;

    move-result-object p1

    .line 105
    sget-object p2, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;->LINK_LOGIN:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    const/4 v1, 0x1

    .line 96
    const-string v2, "Error creating a Link account"

    invoke-interface {v0, v2, p1, p2, v1}, Lcom/stripe/android/financialconnections/domain/HandleError;->invoke(Ljava/lang/String;Ljava/lang/Throwable;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Z)V

    return-void
.end method

.method public navigateToVerification()V
    .locals 6

    .line 89
    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/networkinglinksignup/LinkSignupHandlerForInstantDebits;->navigationManager:Lcom/stripe/android/uicore/navigation/NavigationManager;

    sget-object v1, Lcom/stripe/android/financialconnections/navigation/Destination$NetworkingLinkVerification;->INSTANCE:Lcom/stripe/android/financialconnections/navigation/Destination$NetworkingLinkVerification;

    check-cast v1, Lcom/stripe/android/financialconnections/navigation/Destination;

    sget-object v2, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;->LINK_LOGIN:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

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
    .locals 10
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

    instance-of v0, p2, Lcom/stripe/android/financialconnections/features/networkinglinksignup/LinkSignupHandlerForInstantDebits$performSignup$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/stripe/android/financialconnections/features/networkinglinksignup/LinkSignupHandlerForInstantDebits$performSignup$1;

    iget v1, v0, Lcom/stripe/android/financialconnections/features/networkinglinksignup/LinkSignupHandlerForInstantDebits$performSignup$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p2, v0, Lcom/stripe/android/financialconnections/features/networkinglinksignup/LinkSignupHandlerForInstantDebits$performSignup$1;->label:I

    sub-int/2addr p2, v2

    iput p2, v0, Lcom/stripe/android/financialconnections/features/networkinglinksignup/LinkSignupHandlerForInstantDebits$performSignup$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/financialconnections/features/networkinglinksignup/LinkSignupHandlerForInstantDebits$performSignup$1;

    invoke-direct {v0, p0, p2}, Lcom/stripe/android/financialconnections/features/networkinglinksignup/LinkSignupHandlerForInstantDebits$performSignup$1;-><init>(Lcom/stripe/android/financialconnections/features/networkinglinksignup/LinkSignupHandlerForInstantDebits;Lkotlin/coroutines/Continuation;)V

    :goto_0
    move-object v4, v0

    iget-object p2, v4, Lcom/stripe/android/financialconnections/features/networkinglinksignup/LinkSignupHandlerForInstantDebits$performSignup$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 54
    iget v1, v4, Lcom/stripe/android/financialconnections/features/networkinglinksignup/LinkSignupHandlerForInstantDebits$performSignup$1;->label:I

    const/4 v8, 0x0

    packed-switch v1, :pswitch_data_0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_0
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_8

    :pswitch_1
    iget-object p1, v4, Lcom/stripe/android/financialconnections/features/networkinglinksignup/LinkSignupHandlerForInstantDebits$performSignup$1;->L$0:Ljava/lang/Object;

    check-cast p1, Lcom/stripe/android/financialconnections/features/networkinglinksignup/LinkSignupHandlerForInstantDebits;

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_6

    :pswitch_2
    iget-object p1, v4, Lcom/stripe/android/financialconnections/features/networkinglinksignup/LinkSignupHandlerForInstantDebits$performSignup$1;->L$0:Ljava/lang/Object;

    check-cast p1, Lcom/stripe/android/financialconnections/features/networkinglinksignup/LinkSignupHandlerForInstantDebits;

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_4

    :pswitch_3
    iget-object p1, v4, Lcom/stripe/android/financialconnections/features/networkinglinksignup/LinkSignupHandlerForInstantDebits$performSignup$1;->L$0:Ljava/lang/Object;

    check-cast p1, Lcom/stripe/android/financialconnections/features/networkinglinksignup/LinkSignupHandlerForInstantDebits;

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_3

    :pswitch_4
    iget-object p1, v4, Lcom/stripe/android/financialconnections/features/networkinglinksignup/LinkSignupHandlerForInstantDebits$performSignup$1;->L$2:Ljava/lang/Object;

    check-cast p1, Lcom/stripe/android/uicore/elements/PhoneNumberController;

    iget-object v1, v4, Lcom/stripe/android/financialconnections/features/networkinglinksignup/LinkSignupHandlerForInstantDebits$performSignup$1;->L$1:Ljava/lang/Object;

    check-cast v1, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;

    iget-object v2, v4, Lcom/stripe/android/financialconnections/features/networkinglinksignup/LinkSignupHandlerForInstantDebits$performSignup$1;->L$0:Ljava/lang/Object;

    check-cast v2, Lcom/stripe/android/financialconnections/features/networkinglinksignup/LinkSignupHandlerForInstantDebits;

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v9, p2

    move-object p2, p1

    move-object p1, v2

    move-object v2, v9

    goto :goto_2

    :pswitch_5
    iget-object p1, v4, Lcom/stripe/android/financialconnections/features/networkinglinksignup/LinkSignupHandlerForInstantDebits$performSignup$1;->L$2:Ljava/lang/Object;

    check-cast p1, Lcom/stripe/android/uicore/elements/PhoneNumberController;

    iget-object v1, v4, Lcom/stripe/android/financialconnections/features/networkinglinksignup/LinkSignupHandlerForInstantDebits$performSignup$1;->L$1:Ljava/lang/Object;

    check-cast v1, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;

    iget-object v2, v4, Lcom/stripe/android/financialconnections/features/networkinglinksignup/LinkSignupHandlerForInstantDebits$performSignup$1;->L$0:Ljava/lang/Object;

    check-cast v2, Lcom/stripe/android/financialconnections/features/networkinglinksignup/LinkSignupHandlerForInstantDebits;

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v9, p2

    move-object p2, p1

    move-object p1, v2

    move-object v2, v9

    goto :goto_1

    :pswitch_6
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 57
    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;->getPayload()Lcom/stripe/android/financialconnections/presentation/Async;

    move-result-object p2

    invoke-virtual {p2}, Lcom/stripe/android/financialconnections/presentation/Async;->invoke()Ljava/lang/Object;

    move-result-object p2

    invoke-static {p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    check-cast p2, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState$Payload;

    invoke-virtual {p2}, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState$Payload;->getPhoneController()Lcom/stripe/android/uicore/elements/PhoneNumberController;

    move-result-object p2

    .line 59
    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/networkinglinksignup/LinkSignupHandlerForInstantDebits;->getOrFetchSync:Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;

    iput-object p0, v4, Lcom/stripe/android/financialconnections/features/networkinglinksignup/LinkSignupHandlerForInstantDebits$performSignup$1;->L$0:Ljava/lang/Object;

    iput-object p1, v4, Lcom/stripe/android/financialconnections/features/networkinglinksignup/LinkSignupHandlerForInstantDebits$performSignup$1;->L$1:Ljava/lang/Object;

    iput-object p2, v4, Lcom/stripe/android/financialconnections/features/networkinglinksignup/LinkSignupHandlerForInstantDebits$performSignup$1;->L$2:Ljava/lang/Object;

    const/4 v2, 0x1

    iput v2, v4, Lcom/stripe/android/financialconnections/features/networkinglinksignup/LinkSignupHandlerForInstantDebits$performSignup$1;->label:I

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x3

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;->invoke$default(Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;Lcom/stripe/android/financialconnections/domain/GetOrFetchSync$RefetchCondition;ZLkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_1

    goto/16 :goto_7

    :cond_1
    move-object v2, v1

    move-object v1, p1

    move-object p1, p0

    :goto_1
    check-cast v2, Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;

    invoke-virtual {v2}, Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;->getManifest()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;

    move-result-object v2

    .line 60
    invoke-virtual {v2}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->getAppVerificationEnabled()Z

    move-result v2

    if-eqz v2, :cond_4

    .line 61
    iget-object v2, p1, Lcom/stripe/android/financialconnections/features/networkinglinksignup/LinkSignupHandlerForInstantDebits;->requestIntegrityToken:Lcom/stripe/android/financialconnections/domain/RequestIntegrityToken;

    .line 62
    sget-object v3, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$AttestationEndpoint;->SIGNUP:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$AttestationEndpoint;

    .line 63
    sget-object v5, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;->LINK_LOGIN:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    .line 61
    iput-object p1, v4, Lcom/stripe/android/financialconnections/features/networkinglinksignup/LinkSignupHandlerForInstantDebits$performSignup$1;->L$0:Ljava/lang/Object;

    iput-object v1, v4, Lcom/stripe/android/financialconnections/features/networkinglinksignup/LinkSignupHandlerForInstantDebits$performSignup$1;->L$1:Ljava/lang/Object;

    iput-object p2, v4, Lcom/stripe/android/financialconnections/features/networkinglinksignup/LinkSignupHandlerForInstantDebits$performSignup$1;->L$2:Ljava/lang/Object;

    const/4 v6, 0x2

    iput v6, v4, Lcom/stripe/android/financialconnections/features/networkinglinksignup/LinkSignupHandlerForInstantDebits$performSignup$1;->label:I

    invoke-virtual {v2, v3, v5, v4}, Lcom/stripe/android/financialconnections/domain/RequestIntegrityToken;->invoke(Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$AttestationEndpoint;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v0, :cond_2

    goto/16 :goto_7

    .line 54
    :cond_2
    :goto_2
    move-object v5, v2

    check-cast v5, Ljava/lang/String;

    move-object v2, v1

    .line 65
    iget-object v1, p1, Lcom/stripe/android/financialconnections/features/networkinglinksignup/LinkSignupHandlerForInstantDebits;->consumerRepository:Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepository;

    move-object v3, v2

    .line 66
    invoke-virtual {v3}, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;->getValidEmail()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 67
    invoke-virtual {v3}, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;->getValidPhone()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 68
    invoke-virtual {p2}, Lcom/stripe/android/uicore/elements/PhoneNumberController;->getCountryCode()Ljava/lang/String;

    move-result-object p2

    .line 70
    iget-object v6, p1, Lcom/stripe/android/financialconnections/features/networkinglinksignup/LinkSignupHandlerForInstantDebits;->applicationId:Ljava/lang/String;

    .line 65
    iput-object p1, v4, Lcom/stripe/android/financialconnections/features/networkinglinksignup/LinkSignupHandlerForInstantDebits$performSignup$1;->L$0:Ljava/lang/Object;

    iput-object v8, v4, Lcom/stripe/android/financialconnections/features/networkinglinksignup/LinkSignupHandlerForInstantDebits$performSignup$1;->L$1:Ljava/lang/Object;

    iput-object v8, v4, Lcom/stripe/android/financialconnections/features/networkinglinksignup/LinkSignupHandlerForInstantDebits$performSignup$1;->L$2:Ljava/lang/Object;

    const/4 v7, 0x3

    iput v7, v4, Lcom/stripe/android/financialconnections/features/networkinglinksignup/LinkSignupHandlerForInstantDebits$performSignup$1;->label:I

    move-object v7, v4

    move-object v4, p2

    invoke-interface/range {v1 .. v7}, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepository;->mobileSignUp(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p2

    move-object v4, v7

    if-ne p2, v0, :cond_3

    goto :goto_7

    :cond_3
    :goto_3
    check-cast p2, Lcom/stripe/android/model/ConsumerSessionSignup;

    goto :goto_5

    .line 73
    :cond_4
    iget-object v2, p1, Lcom/stripe/android/financialconnections/features/networkinglinksignup/LinkSignupHandlerForInstantDebits;->consumerRepository:Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepository;

    .line 74
    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;->getValidEmail()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 75
    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;->getValidPhone()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 76
    invoke-virtual {p2}, Lcom/stripe/android/uicore/elements/PhoneNumberController;->getCountryCode()Ljava/lang/String;

    move-result-object p2

    .line 73
    iput-object p1, v4, Lcom/stripe/android/financialconnections/features/networkinglinksignup/LinkSignupHandlerForInstantDebits$performSignup$1;->L$0:Ljava/lang/Object;

    iput-object v8, v4, Lcom/stripe/android/financialconnections/features/networkinglinksignup/LinkSignupHandlerForInstantDebits$performSignup$1;->L$1:Ljava/lang/Object;

    iput-object v8, v4, Lcom/stripe/android/financialconnections/features/networkinglinksignup/LinkSignupHandlerForInstantDebits$performSignup$1;->L$2:Ljava/lang/Object;

    const/4 v5, 0x4

    iput v5, v4, Lcom/stripe/android/financialconnections/features/networkinglinksignup/LinkSignupHandlerForInstantDebits$performSignup$1;->label:I

    invoke-interface {v2, v3, v1, p2, v4}, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepository;->signUp(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v0, :cond_5

    goto :goto_7

    .line 54
    :cond_5
    :goto_4
    check-cast p2, Lcom/stripe/android/model/ConsumerSessionSignup;

    .line 80
    :goto_5
    iget-object v1, p1, Lcom/stripe/android/financialconnections/features/networkinglinksignup/LinkSignupHandlerForInstantDebits;->attachConsumerToLinkAccountSession:Lcom/stripe/android/financialconnections/domain/AttachConsumerToLinkAccountSession;

    .line 81
    invoke-virtual {p2}, Lcom/stripe/android/model/ConsumerSessionSignup;->getConsumerSession()Lcom/stripe/android/model/ConsumerSession;

    move-result-object p2

    invoke-virtual {p2}, Lcom/stripe/android/model/ConsumerSession;->getClientSecret()Ljava/lang/String;

    move-result-object p2

    .line 80
    iput-object p1, v4, Lcom/stripe/android/financialconnections/features/networkinglinksignup/LinkSignupHandlerForInstantDebits$performSignup$1;->L$0:Ljava/lang/Object;

    const/4 v2, 0x5

    iput v2, v4, Lcom/stripe/android/financialconnections/features/networkinglinksignup/LinkSignupHandlerForInstantDebits$performSignup$1;->label:I

    invoke-interface {v1, p2, v4}, Lcom/stripe/android/financialconnections/domain/AttachConsumerToLinkAccountSession;->invoke(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v0, :cond_6

    goto :goto_7

    .line 85
    :cond_6
    :goto_6
    iget-object v1, p1, Lcom/stripe/android/financialconnections/features/networkinglinksignup/LinkSignupHandlerForInstantDebits;->getOrFetchSync:Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;

    sget-object p1, Lcom/stripe/android/financialconnections/domain/GetOrFetchSync$RefetchCondition$Always;->INSTANCE:Lcom/stripe/android/financialconnections/domain/GetOrFetchSync$RefetchCondition$Always;

    move-object v2, p1

    check-cast v2, Lcom/stripe/android/financialconnections/domain/GetOrFetchSync$RefetchCondition;

    iput-object v8, v4, Lcom/stripe/android/financialconnections/features/networkinglinksignup/LinkSignupHandlerForInstantDebits$performSignup$1;->L$0:Ljava/lang/Object;

    const/4 p1, 0x6

    iput p1, v4, Lcom/stripe/android/financialconnections/features/networkinglinksignup/LinkSignupHandlerForInstantDebits$performSignup$1;->label:I

    const/4 v3, 0x0

    const/4 v5, 0x2

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;->invoke$default(Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;Lcom/stripe/android/financialconnections/domain/GetOrFetchSync$RefetchCondition;ZLkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v0, :cond_7

    :goto_7
    return-object v0

    :cond_7
    :goto_8
    check-cast p2, Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;

    invoke-virtual {p2}, Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;->getManifest()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;

    move-result-object p1

    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->getNextPane()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    move-result-object p1

    return-object p1

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
