.class final Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "NetworkingLinkSignupViewModel.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel;-><init>(Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;Lcom/stripe/android/financialconnections/domain/LookupAccount;Lcom/stripe/android/financialconnections/utils/UriUtils;Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;Lcom/stripe/android/uicore/navigation/NavigationManager;Lcom/stripe/android/core/Logger;Lcom/stripe/android/financialconnections/features/notice/PresentSheet;Lcom/stripe/android/financialconnections/features/networkinglinksignup/LinkSignupHandler;Lcom/stripe/android/financialconnections/ElementsSessionContext;Lcom/stripe/android/financialconnections/domain/HandleError;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lkotlin/coroutines/Continuation<",
        "-",
        "Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState$Payload;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nNetworkingLinkSignupViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NetworkingLinkSignupViewModel.kt\ncom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,425:1\n1#2:426\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"
    }
    d2 = {
        "<anonymous>",
        "Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState$Payload;"
    }
    k = 0x3
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.stripe.android.financialconnections.features.networkinglinksignup.NetworkingLinkSignupViewModel$1"
    f = "NetworkingLinkSignupViewModel.kt"
    i = {}
    l = {
        0x60
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field final synthetic $initialState:Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;

.field label:I

.field final synthetic this$0:Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel;


# direct methods
.method constructor <init>(Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;",
            "Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel$1;->$initialState:Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;

    iput-object p2, p0, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel$1;->this$0:Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "*>;)",
            "Lkotlin/coroutines/Continuation<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel$1;

    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel$1;->$initialState:Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;

    iget-object v2, p0, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel$1;->this$0:Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel;

    invoke-direct {v0, v1, v2, p1}, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel$1;-><init>(Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel;Lkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1}, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel$1;->invoke(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState$Payload;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1}, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel$1;->create(Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel$1;

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, v0}, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 25

    move-object/from16 v0, p0

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 88
    iget v2, v0, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_1

    if-ne v2, v3, :cond_0

    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object/from16 v2, p1

    goto :goto_1

    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 89
    iget-object v2, v0, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel$1;->$initialState:Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;

    invoke-virtual {v2}, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;->isInstantDebits()Z

    move-result v2

    if-eqz v2, :cond_2

    .line 90
    sget-object v2, Lcom/stripe/android/financialconnections/domain/GetOrFetchSync$RefetchCondition$None;->INSTANCE:Lcom/stripe/android/financialconnections/domain/GetOrFetchSync$RefetchCondition$None;

    check-cast v2, Lcom/stripe/android/financialconnections/domain/GetOrFetchSync$RefetchCondition;

    goto :goto_0

    .line 93
    :cond_2
    sget-object v2, Lcom/stripe/android/financialconnections/domain/GetOrFetchSync$RefetchCondition$Always;->INSTANCE:Lcom/stripe/android/financialconnections/domain/GetOrFetchSync$RefetchCondition$Always;

    check-cast v2, Lcom/stripe/android/financialconnections/domain/GetOrFetchSync$RefetchCondition;

    :goto_0
    move-object v5, v2

    .line 96
    iget-object v2, v0, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel$1;->this$0:Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel;

    invoke-static {v2}, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel;->access$getGetOrFetchSync$p(Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel;)Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;

    move-result-object v4

    move-object v7, v0

    check-cast v7, Lkotlin/coroutines/Continuation;

    iput v3, v0, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel$1;->label:I

    const/4 v6, 0x0

    const/4 v8, 0x2

    const/4 v9, 0x0

    invoke-static/range {v4 .. v9}, Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;->invoke$default(Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;Lcom/stripe/android/financialconnections/domain/GetOrFetchSync$RefetchCondition;ZLkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_3

    return-object v1

    .line 88
    :cond_3
    :goto_1
    check-cast v2, Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;

    .line 98
    invoke-virtual {v2}, Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;->getText()Lcom/stripe/android/financialconnections/model/TextUpdate;

    move-result-object v1

    const/4 v3, 0x0

    if-eqz v1, :cond_7

    .line 99
    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/model/TextUpdate;->getLinkLoginPane()Lcom/stripe/android/financialconnections/model/LinkLoginPane;

    move-result-object v4

    if-eqz v4, :cond_4

    invoke-static {v4}, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModelKt;->toContent(Lcom/stripe/android/financialconnections/model/LinkLoginPane;)Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState$Content;

    move-result-object v4

    if-nez v4, :cond_6

    :cond_4
    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/model/TextUpdate;->getNetworkingLinkSignupPane()Lcom/stripe/android/financialconnections/model/NetworkingLinkSignupPane;

    move-result-object v1

    if-eqz v1, :cond_5

    invoke-static {v1}, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModelKt;->toContent(Lcom/stripe/android/financialconnections/model/NetworkingLinkSignupPane;)Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState$Content;

    move-result-object v4

    goto :goto_2

    :cond_5
    move-object v4, v3

    :cond_6
    :goto_2
    move-object v12, v4

    goto :goto_3

    :cond_7
    move-object v12, v3

    .line 102
    :goto_3
    iget-object v1, v0, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel$1;->this$0:Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel;

    invoke-static {v1}, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel;->access$getEventTracker$p(Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel;)Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;

    move-result-object v1

    new-instance v4, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$PaneLoaded;

    iget-object v5, v0, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel$1;->this$0:Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel;

    invoke-static {v5}, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel;->access$getPane(Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel;)Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    move-result-object v5

    invoke-direct {v4, v5}, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$PaneLoaded;-><init>(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;)V

    check-cast v4, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent;

    invoke-interface {v1, v4}, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;->track(Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent;)V

    .line 104
    iget-object v1, v0, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel$1;->this$0:Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel;

    invoke-static {v1}, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel;->access$getElementsSessionContext$p(Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel;)Lcom/stripe/android/financialconnections/ElementsSessionContext;

    move-result-object v1

    if-eqz v1, :cond_8

    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/ElementsSessionContext;->getPrefillDetails()Lcom/stripe/android/financialconnections/ElementsSessionContext$PrefillDetails;

    move-result-object v1

    goto :goto_4

    :cond_8
    move-object v1, v3

    .line 106
    :goto_4
    invoke-virtual {v2}, Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;->getManifest()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;

    move-result-object v4

    invoke-virtual {v4}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->getAccountholderCustomerEmailAddress()Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_a

    if-eqz v1, :cond_9

    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/ElementsSessionContext$PrefillDetails;->getEmail()Ljava/lang/String;

    move-result-object v4

    goto :goto_5

    :cond_9
    move-object v4, v3

    :cond_a
    :goto_5
    if-eqz v4, :cond_b

    .line 107
    move-object v5, v4

    check-cast v5, Ljava/lang/CharSequence;

    invoke-static {v5}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_b

    move-object/from16 v16, v4

    goto :goto_6

    :cond_b
    move-object/from16 v16, v3

    :goto_6
    if-eqz v12, :cond_f

    .line 111
    invoke-virtual {v2}, Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;->getManifest()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;

    move-result-object v4

    invoke-static {v4}, Lcom/stripe/android/financialconnections/features/common/ManifestExtensionsKt;->getBusinessName(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;)Ljava/lang/String;

    move-result-object v6

    .line 112
    invoke-virtual {v2}, Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;->getManifest()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;

    move-result-object v4

    invoke-virtual {v4}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->getId()Ljava/lang/String;

    move-result-object v4

    .line 113
    invoke-virtual {v2}, Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;->getManifest()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;

    move-result-object v5

    invoke-virtual {v5}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->getAppVerificationEnabled()Z

    move-result v8

    .line 116
    new-instance v5, Lcom/stripe/android/uicore/elements/EmailConfig;

    .line 117
    sget v7, Lcom/stripe/android/financialconnections/R$string;->stripe_networking_signup_email_label:I

    const/4 v9, 0x0

    new-array v9, v9, [Ljava/lang/Object;

    const/4 v10, 0x4

    invoke-static {v7, v9, v3, v10, v3}, Lcom/stripe/android/core/strings/ResolvableStringUtilsKt;->resolvableString$default(I[Ljava/lang/Object;Ljava/util/List;ILjava/lang/Object;)Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object v7

    .line 116
    invoke-direct {v5, v7}, Lcom/stripe/android/uicore/elements/EmailConfig;-><init>(Lcom/stripe/android/core/strings/ResolvableString;)V

    .line 115
    new-instance v7, Lcom/stripe/android/uicore/elements/SimpleTextFieldController;

    .line 116
    move-object v14, v5

    check-cast v14, Lcom/stripe/android/uicore/elements/TextFieldConfig;

    const/16 v18, 0x8

    const/16 v19, 0x0

    const/4 v15, 0x0

    const/16 v17, 0x0

    move-object v13, v7

    .line 115
    invoke-direct/range {v13 .. v19}, Lcom/stripe/android/uicore/elements/SimpleTextFieldController;-><init>(Lcom/stripe/android/uicore/elements/TextFieldConfig;ZLjava/lang/String;Lkotlin/jvm/functions/Function1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 122
    sget-object v17, Lcom/stripe/android/uicore/elements/PhoneNumberController;->Companion:Lcom/stripe/android/uicore/elements/PhoneNumberController$Companion;

    .line 123
    invoke-virtual {v2}, Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;->getManifest()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;

    move-result-object v2

    invoke-virtual {v2}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->getAccountholderPhoneNumber()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_d

    if-eqz v1, :cond_c

    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/ElementsSessionContext$PrefillDetails;->getPhone()Ljava/lang/String;

    move-result-object v2

    goto :goto_7

    :cond_c
    move-object v2, v3

    :goto_7
    if-nez v2, :cond_d

    const-string v2, ""

    :cond_d
    move-object/from16 v18, v2

    if-eqz v1, :cond_e

    .line 124
    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/ElementsSessionContext$PrefillDetails;->getPhoneCountryCode()Ljava/lang/String;

    move-result-object v3

    :cond_e
    move-object/from16 v19, v3

    const/16 v23, 0x1c

    const/16 v24, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    .line 122
    invoke-static/range {v17 .. v24}, Lcom/stripe/android/uicore/elements/PhoneNumberController$Companion;->createPhoneNumberController$default(Lcom/stripe/android/uicore/elements/PhoneNumberController$Companion;Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;ZZILjava/lang/Object;)Lcom/stripe/android/uicore/elements/PhoneNumberController;

    move-result-object v10

    .line 126
    iget-object v1, v0, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel$1;->$initialState:Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;

    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;->isInstantDebits()Z

    move-result v11

    .line 109
    new-instance v5, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState$Payload;

    move-object v13, v4

    move-object/from16 v9, v16

    invoke-direct/range {v5 .. v13}, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState$Payload;-><init>(Ljava/lang/String;Lcom/stripe/android/uicore/elements/SimpleTextFieldController;ZLjava/lang/String;Lcom/stripe/android/uicore/elements/PhoneNumberController;ZLcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState$Content;Ljava/lang/String;)V

    return-object v5

    .line 110
    :cond_f
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "Required value was null."

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
.end method
