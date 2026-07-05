.class public final Lcom/stripe/android/link/LinkControllerInteractor;
.super Ljava/lang/Object;
.source "LinkControllerInteractor.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/link/LinkControllerInteractor$State;,
        Lcom/stripe/android/link/LinkControllerInteractor$WhenMappings;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nLinkControllerInteractor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LinkControllerInteractor.kt\ncom/stripe/android/link/LinkControllerInteractor\n+ 2 ResultUtils.kt\ncom/stripe/android/core/utils/ResultUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,475:1\n7#2,2:476\n7#2,2:479\n7#2,2:481\n1#3:478\n230#4,5:483\n*S KotlinDebug\n*F\n+ 1 LinkControllerInteractor.kt\ncom/stripe/android/link/LinkControllerInteractor\n*L\n91#1:476,2\n300#1:479,2\n332#1:481,2\n461#1:483,5\n*E\n"
.end annotation

.annotation runtime Ljavax/inject/Singleton;
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u008e\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0001\u0018\u00002\u00020\u0001:\u0001mB/\u0008\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\n0\t\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0014\u0010\"\u001a\u0008\u0012\u0004\u0012\u00020#0\u00102\u0006\u0010$\u001a\u00020%J\u0016\u0010&\u001a\u00020\'2\u0006\u0010(\u001a\u00020)H\u0086@\u00a2\u0006\u0002\u0010*J*\u0010+\u001a\u00020,2\u000c\u0010-\u001a\u0008\u0012\u0004\u0012\u00020/0.2\u0008\u00100\u001a\u0004\u0018\u00010\u000e2\n\u0008\u0002\u00101\u001a\u0004\u0018\u00010\u000eJ\u001e\u00102\u001a\u00020,2\u000c\u0010-\u001a\u0008\u0012\u0004\u0012\u00020/0.2\u0008\u00100\u001a\u0004\u0018\u00010\u000eJ\u001c\u00103\u001a\u00020,2\u000c\u0010-\u001a\u0008\u0012\u0004\u0012\u00020/0.2\u0006\u00100\u001a\u00020\u000eJ(\u00104\u001a\u00020,2\u000c\u0010-\u001a\u0008\u0012\u0004\u0012\u00020/0.2\u0008\u00100\u001a\u0004\u0018\u00010\u000e2\u0006\u00105\u001a\u000206H\u0002J:\u00107\u001a\u00020,2\u0008\u00100\u001a\u0004\u0018\u00010\u000e2\u0012\u00108\u001a\u000e\u0012\u0004\u0012\u00020:\u0012\u0004\u0012\u00020,092\u0012\u0010;\u001a\u000e\u0012\u0004\u0012\u00020<\u0012\u0004\u0012\u00020,09H\u0002J\u000e\u0010=\u001a\u00020,2\u0006\u0010>\u001a\u00020?J\u0012\u0010@\u001a\u00020,2\u0008\u00100\u001a\u0004\u0018\u00010\u000eH\u0002J\u0012\u0010A\u001a\u00020,2\u0008\u0010B\u001a\u0004\u0018\u00010CH\u0002J\u0010\u0010D\u001a\u00020,2\u0006\u0010>\u001a\u00020?H\u0002J\u0010\u0010E\u001a\u00020,2\u0006\u0010>\u001a\u00020?H\u0002J\u0016\u0010F\u001a\u00020G2\u0006\u00100\u001a\u00020\u000eH\u0086@\u00a2\u0006\u0002\u0010HJ\u000e\u0010I\u001a\u00020JH\u0086@\u00a2\u0006\u0002\u0010KJ0\u0010L\u001a\u00020M2\u0006\u00100\u001a\u00020\u000e2\u0006\u0010N\u001a\u00020\u000e2\u0006\u0010O\u001a\u00020\u000e2\u0008\u0010P\u001a\u0004\u0018\u00010\u000eH\u0086@\u00a2\u0006\u0002\u0010QJ\u001f\u0010R\u001a\u0008\u0012\u0004\u0012\u00020T0S2\u0008\u0008\u0002\u0010\"\u001a\u00020\u0016H\u0002\u00a2\u0006\u0004\u0008U\u0010VJp\u0010W\u001a\u00020,2\u000c\u0010-\u001a\u0008\u0012\u0004\u0012\u00020/0.2\u0008\u00100\u001a\u0004\u0018\u00010\u000e2\u0012\u0010X\u001a\u000e\u0012\u0004\u0012\u00020:\u0012\u0004\u0012\u00020,092:\u0010Y\u001a6\u0012\u0015\u0012\u0013\u0018\u00010\u0011\u00a2\u0006\u000c\u0008[\u0012\u0008\u0008P\u0012\u0004\u0008\u0008(\\\u0012\u0013\u0012\u00110\u0016\u00a2\u0006\u000c\u0008[\u0012\u0008\u0008P\u0012\u0004\u0008\u0008(\"\u0012\u0006\u0012\u0004\u0018\u00010]0ZH\u0002J\u0016\u0010^\u001a\u0008\u0012\u0004\u0012\u00020_0SH\u0082@\u00a2\u0006\u0004\u0008`\u0010KJ\u0014\u0010a\u001a\u00020b*\u00020c2\u0006\u0010$\u001a\u00020%H\u0002J\u0019\u0010d\u001a\u0008\u0012\u0004\u0012\u00020,0S*\u00020eH\u0002\u00a2\u0006\u0004\u0008f\u0010gJ\u001b\u0010d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110S*\u00020hH\u0002\u00a2\u0006\u0004\u0008f\u0010iJ!\u0010j\u001a\u00020,2\u0012\u0010k\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u001609H\u0001\u00a2\u0006\u0002\u0008lR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082D\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00160\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\u00190\u0018X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u001a\u001a\u0008\u0012\u0004\u0012\u00020\u00190\u001b\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u0008\u0012\u0004\u0012\u00020\u001f0\u0018X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010 \u001a\u0008\u0012\u0004\u0012\u00020\u001f0\u001b\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008!\u0010\u001d\u00a8\u0006n"
    }
    d2 = {
        "Lcom/stripe/android/link/LinkControllerInteractor;",
        "",
        "logger",
        "Lcom/stripe/android/core/Logger;",
        "linkConfigurationLoader",
        "Lcom/stripe/android/link/LinkConfigurationLoader;",
        "linkAccountHolder",
        "Lcom/stripe/android/link/account/LinkAccountHolder;",
        "linkComponentBuilderProvider",
        "Ljavax/inject/Provider;",
        "Lcom/stripe/android/link/injection/LinkComponent$Builder;",
        "<init>",
        "(Lcom/stripe/android/core/Logger;Lcom/stripe/android/link/LinkConfigurationLoader;Lcom/stripe/android/link/account/LinkAccountHolder;Ljavax/inject/Provider;)V",
        "tag",
        "",
        "_account",
        "Lkotlinx/coroutines/flow/StateFlow;",
        "Lcom/stripe/android/link/model/LinkAccount;",
        "_internalLinkAccount",
        "Lcom/stripe/android/link/LinkController$LinkAccount;",
        "_state",
        "Lkotlinx/coroutines/flow/MutableStateFlow;",
        "Lcom/stripe/android/link/LinkControllerInteractor$State;",
        "_presentPaymentMethodsResultFlow",
        "Lkotlinx/coroutines/flow/MutableSharedFlow;",
        "Lcom/stripe/android/link/LinkController$PresentPaymentMethodsResult;",
        "presentPaymentMethodsResultFlow",
        "Lkotlinx/coroutines/flow/SharedFlow;",
        "getPresentPaymentMethodsResultFlow",
        "()Lkotlinx/coroutines/flow/SharedFlow;",
        "_authenticationResultFlow",
        "Lcom/stripe/android/link/LinkController$AuthenticationResult;",
        "authenticationResultFlow",
        "getAuthenticationResultFlow",
        "state",
        "Lcom/stripe/android/link/LinkController$State;",
        "context",
        "Landroid/content/Context;",
        "configure",
        "Lcom/stripe/android/link/LinkController$ConfigureResult;",
        "configuration",
        "Lcom/stripe/android/link/LinkController$Configuration;",
        "(Lcom/stripe/android/link/LinkController$Configuration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "presentPaymentMethods",
        "",
        "launcher",
        "Landroidx/activity/result/ActivityResultLauncher;",
        "Lcom/stripe/android/link/LinkActivityContract$Args;",
        "email",
        "hint",
        "authenticate",
        "authenticateExistingConsumer",
        "performAuthentication",
        "existingOnly",
        "",
        "withConfiguration",
        "onError",
        "Lkotlin/Function1;",
        "",
        "onSuccess",
        "Lcom/stripe/android/link/LinkConfiguration;",
        "onLinkActivityResult",
        "result",
        "Lcom/stripe/android/link/LinkActivityResult;",
        "updateStateOnNewEmail",
        "updateStateOnAccountUpdate",
        "update",
        "Lcom/stripe/android/link/LinkAccountUpdate;",
        "handlePaymentMethodSelectionResult",
        "handleAuthenticationResult",
        "lookupConsumer",
        "Lcom/stripe/android/link/LinkController$LookupConsumerResult;",
        "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "createPaymentMethod",
        "Lcom/stripe/android/link/LinkController$CreatePaymentMethodResult;",
        "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "registerConsumer",
        "Lcom/stripe/android/link/LinkController$RegisterConsumerResult;",
        "phone",
        "country",
        "name",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "requireLinkComponent",
        "Lkotlin/Result;",
        "Lcom/stripe/android/link/injection/LinkComponent;",
        "requireLinkComponent-IoAF18A",
        "(Lcom/stripe/android/link/LinkControllerInteractor$State;)Ljava/lang/Object;",
        "present",
        "onConfigurationError",
        "getLaunchMode",
        "Lkotlin/Function2;",
        "Lkotlin/ParameterName;",
        "linkAccount",
        "Lcom/stripe/android/link/LinkLaunchMode;",
        "performCreatePaymentMethod",
        "Lcom/stripe/android/model/PaymentMethod;",
        "performCreatePaymentMethod-IoAF18A",
        "toPreview",
        "Lcom/stripe/android/link/LinkController$PaymentMethodPreview;",
        "Lcom/stripe/android/link/LinkPaymentMethod;",
        "toResult",
        "Lcom/stripe/android/link/attestation/LinkAttestationCheck$Result;",
        "toResult-IoAF18A",
        "(Lcom/stripe/android/link/attestation/LinkAttestationCheck$Result;)Ljava/lang/Object;",
        "Lcom/stripe/android/link/account/LinkAuthResult;",
        "(Lcom/stripe/android/link/account/LinkAuthResult;)Ljava/lang/Object;",
        "updateState",
        "block",
        "updateState$paymentsheet_release",
        "State",
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
.field private final _account:Lkotlinx/coroutines/flow/StateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Lcom/stripe/android/link/model/LinkAccount;",
            ">;"
        }
    .end annotation
.end field

.field private final _authenticationResultFlow:Lkotlinx/coroutines/flow/MutableSharedFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/MutableSharedFlow<",
            "Lcom/stripe/android/link/LinkController$AuthenticationResult;",
            ">;"
        }
    .end annotation
.end field

.field private final _internalLinkAccount:Lkotlinx/coroutines/flow/StateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Lcom/stripe/android/link/LinkController$LinkAccount;",
            ">;"
        }
    .end annotation
.end field

.field private final _presentPaymentMethodsResultFlow:Lkotlinx/coroutines/flow/MutableSharedFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/MutableSharedFlow<",
            "Lcom/stripe/android/link/LinkController$PresentPaymentMethodsResult;",
            ">;"
        }
    .end annotation
.end field

.field private final _state:Lkotlinx/coroutines/flow/MutableStateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/MutableStateFlow<",
            "Lcom/stripe/android/link/LinkControllerInteractor$State;",
            ">;"
        }
    .end annotation
.end field

.field private final authenticationResultFlow:Lkotlinx/coroutines/flow/SharedFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/SharedFlow<",
            "Lcom/stripe/android/link/LinkController$AuthenticationResult;",
            ">;"
        }
    .end annotation
.end field

.field private final linkAccountHolder:Lcom/stripe/android/link/account/LinkAccountHolder;

.field private final linkComponentBuilderProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/stripe/android/link/injection/LinkComponent$Builder;",
            ">;"
        }
    .end annotation
.end field

.field private final linkConfigurationLoader:Lcom/stripe/android/link/LinkConfigurationLoader;

.field private final logger:Lcom/stripe/android/core/Logger;

.field private final presentPaymentMethodsResultFlow:Lkotlinx/coroutines/flow/SharedFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/SharedFlow<",
            "Lcom/stripe/android/link/LinkController$PresentPaymentMethodsResult;",
            ">;"
        }
    .end annotation
.end field

.field private final tag:Ljava/lang/String;


# direct methods
.method public static synthetic $r8$lambda$A7vMxrsAnRgU-x18oiJSqtnkWEg(Lcom/stripe/android/link/LinkActivityResult;Lcom/stripe/android/link/LinkControllerInteractor$State;)Lcom/stripe/android/link/LinkControllerInteractor$State;
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/link/LinkControllerInteractor;->handlePaymentMethodSelectionResult$lambda$26(Lcom/stripe/android/link/LinkActivityResult;Lcom/stripe/android/link/LinkControllerInteractor$State;)Lcom/stripe/android/link/LinkControllerInteractor$State;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$BJu-PL78ApESxfawc8b90YUvzg8(Lcom/stripe/android/link/injection/LinkComponent;Lcom/stripe/android/link/LinkControllerInteractor$State;)Lcom/stripe/android/link/LinkControllerInteractor$State;
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/link/LinkControllerInteractor;->configure$lambda$8$lambda$7(Lcom/stripe/android/link/injection/LinkComponent;Lcom/stripe/android/link/LinkControllerInteractor$State;)Lcom/stripe/android/link/LinkControllerInteractor$State;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$BR2INc-0OC-1o6l4KYAXDyLpSn4(Lcom/stripe/android/link/LinkControllerInteractor$State;)Lcom/stripe/android/link/LinkControllerInteractor$State;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/link/LinkControllerInteractor;->onLinkActivityResult$lambda$19(Lcom/stripe/android/link/LinkControllerInteractor$State;)Lcom/stripe/android/link/LinkControllerInteractor$State;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$FkQATjN1bZhLOXBPIeBKe1KGJtA(Lcom/stripe/android/link/LinkControllerInteractor;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Landroidx/activity/result/ActivityResultLauncher;Lcom/stripe/android/link/LinkConfiguration;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lcom/stripe/android/link/LinkControllerInteractor;->present$lambda$39(Lcom/stripe/android/link/LinkControllerInteractor;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Landroidx/activity/result/ActivityResultLauncher;Lcom/stripe/android/link/LinkConfiguration;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$LzxrrA_YPToi5OYUrIuLuKCqaRQ(ZLcom/stripe/android/link/LinkControllerInteractor$State;)Lcom/stripe/android/link/LinkControllerInteractor$State;
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/link/LinkControllerInteractor;->updateStateOnAccountUpdate$lambda$25(ZLcom/stripe/android/link/LinkControllerInteractor$State;)Lcom/stripe/android/link/LinkControllerInteractor$State;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$NjfwxKq4LbPK8NVvJ9isftKWpAM(Lcom/stripe/android/link/LinkControllerInteractor;ZLcom/stripe/android/link/model/LinkAccount;Lcom/stripe/android/link/LinkControllerInteractor$State;)Lcom/stripe/android/link/LinkLaunchMode;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/stripe/android/link/LinkControllerInteractor;->performAuthentication$lambda$13(Lcom/stripe/android/link/LinkControllerInteractor;ZLcom/stripe/android/link/model/LinkAccount;Lcom/stripe/android/link/LinkControllerInteractor$State;)Lcom/stripe/android/link/LinkLaunchMode;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$RmO1ltjIOPg2UTgm4GX00m-ohIE(Lcom/stripe/android/link/model/LinkAccount;)Lcom/stripe/android/link/LinkController$LinkAccount;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/link/LinkControllerInteractor;->_internalLinkAccount$lambda$2(Lcom/stripe/android/link/model/LinkAccount;)Lcom/stripe/android/link/LinkController$LinkAccount;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$S4rDtKjq1TOXD9xM6NQ4_jAOSt4(Ljava/lang/String;Lcom/stripe/android/link/LinkLaunchMode;Lcom/stripe/android/link/LinkControllerInteractor$State;)Lcom/stripe/android/link/LinkControllerInteractor$State;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/stripe/android/link/LinkControllerInteractor;->present$lambda$39$lambda$38(Ljava/lang/String;Lcom/stripe/android/link/LinkLaunchMode;Lcom/stripe/android/link/LinkControllerInteractor$State;)Lcom/stripe/android/link/LinkControllerInteractor$State;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$UlNM1EEEi5_gWyCXcaPpbwFH78M(Ljava/lang/String;ZLcom/stripe/android/link/LinkControllerInteractor$State;)Lcom/stripe/android/link/LinkControllerInteractor$State;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/stripe/android/link/LinkControllerInteractor;->updateStateOnNewEmail$lambda$22(Ljava/lang/String;ZLcom/stripe/android/link/LinkControllerInteractor$State;)Lcom/stripe/android/link/LinkControllerInteractor$State;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$cxrGiB8DLrrleU2uAT642EXLhvE(Lcom/stripe/android/link/LinkControllerInteractor;Landroid/content/Context;Lcom/stripe/android/link/LinkController$LinkAccount;Lcom/stripe/android/link/LinkControllerInteractor$State;)Lcom/stripe/android/link/LinkController$State;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/stripe/android/link/LinkControllerInteractor;->state$lambda$3(Lcom/stripe/android/link/LinkControllerInteractor;Landroid/content/Context;Lcom/stripe/android/link/LinkController$LinkAccount;Lcom/stripe/android/link/LinkControllerInteractor$State;)Lcom/stripe/android/link/LinkController$State;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$f8p9mf3Z0aD8GTVkamtpTsYtWqQ(Ljava/lang/Object;Lcom/stripe/android/link/LinkControllerInteractor$State;)Lcom/stripe/android/link/LinkControllerInteractor$State;
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/link/LinkControllerInteractor;->createPaymentMethod$lambda$31(Ljava/lang/Object;Lcom/stripe/android/link/LinkControllerInteractor$State;)Lcom/stripe/android/link/LinkControllerInteractor$State;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$gaxS-w66c0R64D4kwp0BCqYQvF8(Lcom/stripe/android/link/LinkControllerInteractor;Ljava/lang/Throwable;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/link/LinkControllerInteractor;->presentPaymentMethods$lambda$10(Lcom/stripe/android/link/LinkControllerInteractor;Ljava/lang/Throwable;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$iZ0Ey8nus7G4pM8P1aLUi_Bck2E(Lcom/stripe/android/link/LinkControllerInteractor;Ljava/lang/Throwable;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/link/LinkControllerInteractor;->performAuthentication$lambda$12(Lcom/stripe/android/link/LinkControllerInteractor;Ljava/lang/Throwable;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$mRvMN8GMlDAU3eVe1iJ6XzO64u4(Lcom/stripe/android/link/LinkAccountUpdate$Value;)Lcom/stripe/android/link/model/LinkAccount;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/link/LinkControllerInteractor;->_account$lambda$0(Lcom/stripe/android/link/LinkAccountUpdate$Value;)Lcom/stripe/android/link/model/LinkAccount;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$rdsQe327oqpIl3fYf4Gv2fASHuY(Ljava/lang/String;Lcom/stripe/android/link/model/LinkAccount;Lcom/stripe/android/link/LinkControllerInteractor$State;)Lcom/stripe/android/link/LinkLaunchMode;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/stripe/android/link/LinkControllerInteractor;->presentPaymentMethods$lambda$11(Ljava/lang/String;Lcom/stripe/android/link/model/LinkAccount;Lcom/stripe/android/link/LinkControllerInteractor$State;)Lcom/stripe/android/link/LinkLaunchMode;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$zFi6AYcKsr-fECTEpoWe8dSEoE0(Lcom/stripe/android/link/LinkControllerInteractor$State;)Lcom/stripe/android/link/LinkControllerInteractor$State;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/link/LinkControllerInteractor;->configure$lambda$4(Lcom/stripe/android/link/LinkControllerInteractor$State;)Lcom/stripe/android/link/LinkControllerInteractor$State;

    move-result-object p0

    return-object p0
.end method

.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/core/Logger;Lcom/stripe/android/link/LinkConfigurationLoader;Lcom/stripe/android/link/account/LinkAccountHolder;Ljavax/inject/Provider;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/core/Logger;",
            "Lcom/stripe/android/link/LinkConfigurationLoader;",
            "Lcom/stripe/android/link/account/LinkAccountHolder;",
            "Ljavax/inject/Provider<",
            "Lcom/stripe/android/link/injection/LinkComponent$Builder;",
            ">;)V"
        }
    .end annotation

    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    const-string v0, "logger"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "linkConfigurationLoader"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "linkAccountHolder"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "linkComponentBuilderProvider"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 39
    iput-object p1, p0, Lcom/stripe/android/link/LinkControllerInteractor;->logger:Lcom/stripe/android/core/Logger;

    .line 40
    iput-object p2, p0, Lcom/stripe/android/link/LinkControllerInteractor;->linkConfigurationLoader:Lcom/stripe/android/link/LinkConfigurationLoader;

    .line 41
    iput-object p3, p0, Lcom/stripe/android/link/LinkControllerInteractor;->linkAccountHolder:Lcom/stripe/android/link/account/LinkAccountHolder;

    .line 42
    iput-object p4, p0, Lcom/stripe/android/link/LinkControllerInteractor;->linkComponentBuilderProvider:Ljavax/inject/Provider;

    .line 45
    const-string p1, "LinkControllerViewInteractor"

    iput-object p1, p0, Lcom/stripe/android/link/LinkControllerInteractor;->tag:Ljava/lang/String;

    .line 47
    invoke-virtual {p3}, Lcom/stripe/android/link/account/LinkAccountHolder;->getLinkAccountInfo()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object p1

    new-instance p2, Lcom/stripe/android/link/LinkControllerInteractor$$ExternalSyntheticLambda13;

    invoke-direct {p2}, Lcom/stripe/android/link/LinkControllerInteractor$$ExternalSyntheticLambda13;-><init>()V

    invoke-static {p1, p2}, Lcom/stripe/android/uicore/utils/StateFlowsKt;->mapAsStateFlow(Lkotlinx/coroutines/flow/StateFlow;Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/flow/StateFlow;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/link/LinkControllerInteractor;->_account:Lkotlinx/coroutines/flow/StateFlow;

    .line 49
    new-instance p2, Lcom/stripe/android/link/LinkControllerInteractor$$ExternalSyntheticLambda14;

    invoke-direct {p2}, Lcom/stripe/android/link/LinkControllerInteractor$$ExternalSyntheticLambda14;-><init>()V

    invoke-static {p1, p2}, Lcom/stripe/android/uicore/utils/StateFlowsKt;->mapAsStateFlow(Lkotlinx/coroutines/flow/StateFlow;Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/flow/StateFlow;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/link/LinkControllerInteractor;->_internalLinkAccount:Lkotlinx/coroutines/flow/StateFlow;

    .line 67
    new-instance v0, Lcom/stripe/android/link/LinkControllerInteractor$State;

    const/16 v6, 0x1f

    const/4 v7, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v0 .. v7}, Lcom/stripe/android/link/LinkControllerInteractor$State;-><init>(Lcom/stripe/android/link/injection/LinkComponent;Ljava/lang/String;Lcom/stripe/android/link/LinkPaymentMethod;Lcom/stripe/android/model/PaymentMethod;Lcom/stripe/android/link/LinkLaunchMode;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v0}, Lkotlinx/coroutines/flow/StateFlowKt;->MutableStateFlow(Ljava/lang/Object;)Lkotlinx/coroutines/flow/MutableStateFlow;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/link/LinkControllerInteractor;->_state:Lkotlinx/coroutines/flow/MutableStateFlow;

    const/4 p1, 0x1

    const/4 p2, 0x0

    const/4 p3, 0x0

    const/4 p4, 0x6

    .line 70
    invoke-static {p1, p2, p3, p4, p3}, Lkotlinx/coroutines/flow/SharedFlowKt;->MutableSharedFlow$default(IILkotlinx/coroutines/channels/BufferOverflow;ILjava/lang/Object;)Lkotlinx/coroutines/flow/MutableSharedFlow;

    move-result-object v0

    iput-object v0, p0, Lcom/stripe/android/link/LinkControllerInteractor;->_presentPaymentMethodsResultFlow:Lkotlinx/coroutines/flow/MutableSharedFlow;

    .line 71
    invoke-static {v0}, Lkotlinx/coroutines/flow/FlowKt;->asSharedFlow(Lkotlinx/coroutines/flow/MutableSharedFlow;)Lkotlinx/coroutines/flow/SharedFlow;

    move-result-object v0

    iput-object v0, p0, Lcom/stripe/android/link/LinkControllerInteractor;->presentPaymentMethodsResultFlow:Lkotlinx/coroutines/flow/SharedFlow;

    .line 74
    invoke-static {p1, p2, p3, p4, p3}, Lkotlinx/coroutines/flow/SharedFlowKt;->MutableSharedFlow$default(IILkotlinx/coroutines/channels/BufferOverflow;ILjava/lang/Object;)Lkotlinx/coroutines/flow/MutableSharedFlow;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/link/LinkControllerInteractor;->_authenticationResultFlow:Lkotlinx/coroutines/flow/MutableSharedFlow;

    .line 75
    invoke-static {p1}, Lkotlinx/coroutines/flow/FlowKt;->asSharedFlow(Lkotlinx/coroutines/flow/MutableSharedFlow;)Lkotlinx/coroutines/flow/SharedFlow;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/link/LinkControllerInteractor;->authenticationResultFlow:Lkotlinx/coroutines/flow/SharedFlow;

    return-void
.end method

.method private static final _account$lambda$0(Lcom/stripe/android/link/LinkAccountUpdate$Value;)Lcom/stripe/android/link/model/LinkAccount;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 47
    invoke-virtual {p0}, Lcom/stripe/android/link/LinkAccountUpdate$Value;->getAccount()Lcom/stripe/android/link/model/LinkAccount;

    move-result-object p0

    return-object p0
.end method

.method private static final _internalLinkAccount$lambda$2(Lcom/stripe/android/link/model/LinkAccount;)Lcom/stripe/android/link/LinkController$LinkAccount;
    .locals 5

    if-eqz p0, :cond_3

    .line 51
    new-instance v0, Lcom/stripe/android/link/LinkController$LinkAccount;

    .line 52
    invoke-virtual {p0}, Lcom/stripe/android/link/model/LinkAccount;->getEmail()Ljava/lang/String;

    move-result-object v1

    .line 53
    invoke-virtual {p0}, Lcom/stripe/android/link/model/LinkAccount;->getRedactedPhoneNumber()Ljava/lang/String;

    move-result-object v2

    .line 54
    invoke-virtual {p0}, Lcom/stripe/android/link/model/LinkAccount;->getAccountStatus()Lcom/stripe/android/link/model/AccountStatus;

    move-result-object v3

    invoke-static {v3}, Lcom/stripe/android/link/model/AccountStatusKt;->toLoginState(Lcom/stripe/android/link/model/AccountStatus;)Lcom/stripe/android/paymentsheet/state/LinkState$LoginState;

    move-result-object v3

    sget-object v4, Lcom/stripe/android/link/LinkControllerInteractor$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v3}, Lcom/stripe/android/paymentsheet/state/LinkState$LoginState;->ordinal()I

    move-result v3

    aget v3, v4, v3

    const/4 v4, 0x1

    if-eq v3, v4, :cond_2

    const/4 v4, 0x2

    if-eq v3, v4, :cond_1

    const/4 v4, 0x3

    if-ne v3, v4, :cond_0

    .line 60
    sget-object v3, Lcom/stripe/android/link/LinkController$SessionState;->LoggedIn:Lcom/stripe/android/link/LinkController$SessionState;

    goto :goto_0

    .line 54
    :cond_0
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    .line 58
    :cond_1
    sget-object v3, Lcom/stripe/android/link/LinkController$SessionState;->NeedsVerification:Lcom/stripe/android/link/LinkController$SessionState;

    goto :goto_0

    .line 56
    :cond_2
    sget-object v3, Lcom/stripe/android/link/LinkController$SessionState;->LoggedOut:Lcom/stripe/android/link/LinkController$SessionState;

    .line 62
    :goto_0
    invoke-virtual {p0}, Lcom/stripe/android/link/model/LinkAccount;->getClientSecret()Ljava/lang/String;

    move-result-object p0

    .line 51
    invoke-direct {v0, v1, v2, v3, p0}, Lcom/stripe/android/link/LinkController$LinkAccount;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/link/LinkController$SessionState;Ljava/lang/String;)V

    return-object v0

    :cond_3
    const/4 p0, 0x0

    return-object p0
.end method

.method public static final synthetic access$performCreatePaymentMethod-IoAF18A(Lcom/stripe/android/link/LinkControllerInteractor;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 37
    invoke-direct {p0, p1}, Lcom/stripe/android/link/LinkControllerInteractor;->performCreatePaymentMethod-IoAF18A(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private static final configure$lambda$4(Lcom/stripe/android/link/LinkControllerInteractor$State;)Lcom/stripe/android/link/LinkControllerInteractor$State;
    .locals 9

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 89
    new-instance v1, Lcom/stripe/android/link/LinkControllerInteractor$State;

    const/16 v7, 0x1f

    const/4 v8, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v1 .. v8}, Lcom/stripe/android/link/LinkControllerInteractor$State;-><init>(Lcom/stripe/android/link/injection/LinkComponent;Ljava/lang/String;Lcom/stripe/android/link/LinkPaymentMethod;Lcom/stripe/android/model/PaymentMethod;Lcom/stripe/android/link/LinkLaunchMode;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method private static final configure$lambda$8$lambda$7(Lcom/stripe/android/link/injection/LinkComponent;Lcom/stripe/android/link/LinkControllerInteractor$State;)Lcom/stripe/android/link/LinkControllerInteractor$State;
    .locals 9

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v7, 0x1e

    const/4 v8, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v2, p0

    move-object v1, p1

    .line 101
    invoke-static/range {v1 .. v8}, Lcom/stripe/android/link/LinkControllerInteractor$State;->copy$default(Lcom/stripe/android/link/LinkControllerInteractor$State;Lcom/stripe/android/link/injection/LinkComponent;Ljava/lang/String;Lcom/stripe/android/link/LinkPaymentMethod;Lcom/stripe/android/model/PaymentMethod;Lcom/stripe/android/link/LinkLaunchMode;ILjava/lang/Object;)Lcom/stripe/android/link/LinkControllerInteractor$State;

    move-result-object p0

    return-object p0
.end method

.method private static final createPaymentMethod$lambda$31(Ljava/lang/Object;Lcom/stripe/android/link/LinkControllerInteractor$State;)Lcom/stripe/android/link/LinkControllerInteractor$State;
    .locals 8

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 318
    invoke-static {p0}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p0, 0x0

    :cond_0
    move-object v4, p0

    check-cast v4, Lcom/stripe/android/model/PaymentMethod;

    const/16 v6, 0x17

    const/4 v7, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    move-object v0, p1

    invoke-static/range {v0 .. v7}, Lcom/stripe/android/link/LinkControllerInteractor$State;->copy$default(Lcom/stripe/android/link/LinkControllerInteractor$State;Lcom/stripe/android/link/injection/LinkComponent;Ljava/lang/String;Lcom/stripe/android/link/LinkPaymentMethod;Lcom/stripe/android/model/PaymentMethod;Lcom/stripe/android/link/LinkLaunchMode;ILjava/lang/Object;)Lcom/stripe/android/link/LinkControllerInteractor$State;

    move-result-object p0

    return-object p0
.end method

.method private final handleAuthenticationResult(Lcom/stripe/android/link/LinkActivityResult;)V
    .locals 3

    .line 278
    instance-of v0, p1, Lcom/stripe/android/link/LinkActivityResult$Canceled;

    if-eqz v0, :cond_0

    .line 279
    iget-object p1, p0, Lcom/stripe/android/link/LinkControllerInteractor;->logger:Lcom/stripe/android/core/Logger;

    iget-object v0, p0, Lcom/stripe/android/link/LinkControllerInteractor;->tag:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ": authentication canceled"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Lcom/stripe/android/core/Logger;->debug(Ljava/lang/String;)V

    .line 280
    iget-object p1, p0, Lcom/stripe/android/link/LinkControllerInteractor;->_authenticationResultFlow:Lkotlinx/coroutines/flow/MutableSharedFlow;

    sget-object v0, Lcom/stripe/android/link/LinkController$AuthenticationResult$Canceled;->INSTANCE:Lcom/stripe/android/link/LinkController$AuthenticationResult$Canceled;

    invoke-interface {p1, v0}, Lkotlinx/coroutines/flow/MutableSharedFlow;->tryEmit(Ljava/lang/Object;)Z

    return-void

    .line 282
    :cond_0
    instance-of v0, p1, Lcom/stripe/android/link/LinkActivityResult$Completed;

    if-eqz v0, :cond_1

    .line 283
    iget-object p1, p0, Lcom/stripe/android/link/LinkControllerInteractor;->logger:Lcom/stripe/android/core/Logger;

    iget-object v0, p0, Lcom/stripe/android/link/LinkControllerInteractor;->tag:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ": authentication completed"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Lcom/stripe/android/core/Logger;->debug(Ljava/lang/String;)V

    .line 284
    iget-object p1, p0, Lcom/stripe/android/link/LinkControllerInteractor;->_authenticationResultFlow:Lkotlinx/coroutines/flow/MutableSharedFlow;

    sget-object v0, Lcom/stripe/android/link/LinkController$AuthenticationResult$Success;->INSTANCE:Lcom/stripe/android/link/LinkController$AuthenticationResult$Success;

    invoke-interface {p1, v0}, Lkotlinx/coroutines/flow/MutableSharedFlow;->tryEmit(Ljava/lang/Object;)Z

    return-void

    .line 286
    :cond_1
    instance-of v0, p1, Lcom/stripe/android/link/LinkActivityResult$Failed;

    if-eqz v0, :cond_2

    .line 287
    iget-object v0, p0, Lcom/stripe/android/link/LinkControllerInteractor;->logger:Lcom/stripe/android/core/Logger;

    iget-object v1, p0, Lcom/stripe/android/link/LinkControllerInteractor;->tag:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ": authentication failed"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/stripe/android/core/Logger;->debug(Ljava/lang/String;)V

    .line 288
    iget-object v0, p0, Lcom/stripe/android/link/LinkControllerInteractor;->_authenticationResultFlow:Lkotlinx/coroutines/flow/MutableSharedFlow;

    .line 289
    new-instance v1, Lcom/stripe/android/link/LinkController$AuthenticationResult$Failed;

    check-cast p1, Lcom/stripe/android/link/LinkActivityResult$Failed;

    invoke-virtual {p1}, Lcom/stripe/android/link/LinkActivityResult$Failed;->getError()Ljava/lang/Throwable;

    move-result-object p1

    invoke-direct {v1, p1}, Lcom/stripe/android/link/LinkController$AuthenticationResult$Failed;-><init>(Ljava/lang/Throwable;)V

    .line 288
    invoke-interface {v0, v1}, Lkotlinx/coroutines/flow/MutableSharedFlow;->tryEmit(Ljava/lang/Object;)Z

    return-void

    .line 292
    :cond_2
    instance-of v0, p1, Lcom/stripe/android/link/LinkActivityResult$PaymentMethodObtained;

    if-eqz v0, :cond_3

    .line 293
    iget-object v0, p0, Lcom/stripe/android/link/LinkControllerInteractor;->logger:Lcom/stripe/android/core/Logger;

    iget-object v1, p0, Lcom/stripe/android/link/LinkControllerInteractor;->tag:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ": authentication unexpected result: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/stripe/android/core/Logger;->warning(Ljava/lang/String;)V

    return-void

    .line 277
    :cond_3
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method private final handlePaymentMethodSelectionResult(Lcom/stripe/android/link/LinkActivityResult;)V
    .locals 4

    .line 251
    instance-of v0, p1, Lcom/stripe/android/link/LinkActivityResult$Canceled;

    if-eqz v0, :cond_0

    .line 252
    iget-object p1, p0, Lcom/stripe/android/link/LinkControllerInteractor;->logger:Lcom/stripe/android/core/Logger;

    iget-object v0, p0, Lcom/stripe/android/link/LinkControllerInteractor;->tag:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ": presentPaymentMethods canceled"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Lcom/stripe/android/core/Logger;->debug(Ljava/lang/String;)V

    .line 253
    iget-object p1, p0, Lcom/stripe/android/link/LinkControllerInteractor;->_presentPaymentMethodsResultFlow:Lkotlinx/coroutines/flow/MutableSharedFlow;

    .line 254
    sget-object v0, Lcom/stripe/android/link/LinkController$PresentPaymentMethodsResult$Canceled;->INSTANCE:Lcom/stripe/android/link/LinkController$PresentPaymentMethodsResult$Canceled;

    .line 253
    invoke-interface {p1, v0}, Lkotlinx/coroutines/flow/MutableSharedFlow;->tryEmit(Ljava/lang/Object;)Z

    return-void

    .line 257
    :cond_0
    instance-of v0, p1, Lcom/stripe/android/link/LinkActivityResult$Completed;

    if-eqz v0, :cond_2

    .line 258
    iget-object v0, p0, Lcom/stripe/android/link/LinkControllerInteractor;->logger:Lcom/stripe/android/core/Logger;

    iget-object v1, p0, Lcom/stripe/android/link/LinkControllerInteractor;->tag:Ljava/lang/String;

    move-object v2, p1

    check-cast v2, Lcom/stripe/android/link/LinkActivityResult$Completed;

    invoke-virtual {v2}, Lcom/stripe/android/link/LinkActivityResult$Completed;->getSelectedPayment()Lcom/stripe/android/link/LinkPaymentMethod;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Lcom/stripe/android/link/LinkPaymentMethod;->getDetails()Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;

    move-result-object v2

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    :goto_0
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v3, ": presentPaymentMethods completed: details="

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/stripe/android/core/Logger;->debug(Ljava/lang/String;)V

    .line 259
    new-instance v0, Lcom/stripe/android/link/LinkControllerInteractor$$ExternalSyntheticLambda2;

    invoke-direct {v0, p1}, Lcom/stripe/android/link/LinkControllerInteractor$$ExternalSyntheticLambda2;-><init>(Lcom/stripe/android/link/LinkActivityResult;)V

    invoke-virtual {p0, v0}, Lcom/stripe/android/link/LinkControllerInteractor;->updateState$paymentsheet_release(Lkotlin/jvm/functions/Function1;)V

    .line 262
    iget-object p1, p0, Lcom/stripe/android/link/LinkControllerInteractor;->_presentPaymentMethodsResultFlow:Lkotlinx/coroutines/flow/MutableSharedFlow;

    sget-object v0, Lcom/stripe/android/link/LinkController$PresentPaymentMethodsResult$Success;->INSTANCE:Lcom/stripe/android/link/LinkController$PresentPaymentMethodsResult$Success;

    invoke-interface {p1, v0}, Lkotlinx/coroutines/flow/MutableSharedFlow;->tryEmit(Ljava/lang/Object;)Z

    return-void

    .line 264
    :cond_2
    instance-of v0, p1, Lcom/stripe/android/link/LinkActivityResult$Failed;

    if-eqz v0, :cond_3

    .line 265
    iget-object v0, p0, Lcom/stripe/android/link/LinkControllerInteractor;->logger:Lcom/stripe/android/core/Logger;

    iget-object v1, p0, Lcom/stripe/android/link/LinkControllerInteractor;->tag:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ": presentPaymentMethods failed"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/stripe/android/core/Logger;->debug(Ljava/lang/String;)V

    .line 266
    iget-object v0, p0, Lcom/stripe/android/link/LinkControllerInteractor;->_presentPaymentMethodsResultFlow:Lkotlinx/coroutines/flow/MutableSharedFlow;

    .line 267
    new-instance v1, Lcom/stripe/android/link/LinkController$PresentPaymentMethodsResult$Failed;

    check-cast p1, Lcom/stripe/android/link/LinkActivityResult$Failed;

    invoke-virtual {p1}, Lcom/stripe/android/link/LinkActivityResult$Failed;->getError()Ljava/lang/Throwable;

    move-result-object p1

    invoke-direct {v1, p1}, Lcom/stripe/android/link/LinkController$PresentPaymentMethodsResult$Failed;-><init>(Ljava/lang/Throwable;)V

    .line 266
    invoke-interface {v0, v1}, Lkotlinx/coroutines/flow/MutableSharedFlow;->tryEmit(Ljava/lang/Object;)Z

    return-void

    .line 270
    :cond_3
    instance-of v0, p1, Lcom/stripe/android/link/LinkActivityResult$PaymentMethodObtained;

    if-eqz v0, :cond_4

    .line 271
    iget-object v0, p0, Lcom/stripe/android/link/LinkControllerInteractor;->logger:Lcom/stripe/android/core/Logger;

    iget-object v1, p0, Lcom/stripe/android/link/LinkControllerInteractor;->tag:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ": presentPaymentMethods unexpected result: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/stripe/android/core/Logger;->warning(Ljava/lang/String;)V

    return-void

    .line 250
    :cond_4
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method private static final handlePaymentMethodSelectionResult$lambda$26(Lcom/stripe/android/link/LinkActivityResult;Lcom/stripe/android/link/LinkControllerInteractor$State;)Lcom/stripe/android/link/LinkControllerInteractor$State;
    .locals 8

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 260
    check-cast p0, Lcom/stripe/android/link/LinkActivityResult$Completed;

    invoke-virtual {p0}, Lcom/stripe/android/link/LinkActivityResult$Completed;->getSelectedPayment()Lcom/stripe/android/link/LinkPaymentMethod;

    move-result-object v3

    const/16 v6, 0x1b

    const/4 v7, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, p1

    invoke-static/range {v0 .. v7}, Lcom/stripe/android/link/LinkControllerInteractor$State;->copy$default(Lcom/stripe/android/link/LinkControllerInteractor$State;Lcom/stripe/android/link/injection/LinkComponent;Ljava/lang/String;Lcom/stripe/android/link/LinkPaymentMethod;Lcom/stripe/android/model/PaymentMethod;Lcom/stripe/android/link/LinkLaunchMode;ILjava/lang/Object;)Lcom/stripe/android/link/LinkControllerInteractor$State;

    move-result-object p0

    return-object p0
.end method

.method private static final onLinkActivityResult$lambda$19(Lcom/stripe/android/link/LinkControllerInteractor$State;)Lcom/stripe/android/link/LinkControllerInteractor$State;
    .locals 9

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v7, 0xf

    const/4 v8, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v1, p0

    .line 193
    invoke-static/range {v1 .. v8}, Lcom/stripe/android/link/LinkControllerInteractor$State;->copy$default(Lcom/stripe/android/link/LinkControllerInteractor$State;Lcom/stripe/android/link/injection/LinkComponent;Ljava/lang/String;Lcom/stripe/android/link/LinkPaymentMethod;Lcom/stripe/android/model/PaymentMethod;Lcom/stripe/android/link/LinkLaunchMode;ILjava/lang/Object;)Lcom/stripe/android/link/LinkControllerInteractor$State;

    move-result-object p0

    return-object p0
.end method

.method private final performAuthentication(Landroidx/activity/result/ActivityResultLauncher;Ljava/lang/String;Z)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/activity/result/ActivityResultLauncher<",
            "Lcom/stripe/android/link/LinkActivityContract$Args;",
            ">;",
            "Ljava/lang/String;",
            "Z)V"
        }
    .end annotation

    .line 152
    new-instance v0, Lcom/stripe/android/link/LinkControllerInteractor$$ExternalSyntheticLambda3;

    invoke-direct {v0, p0}, Lcom/stripe/android/link/LinkControllerInteractor$$ExternalSyntheticLambda3;-><init>(Lcom/stripe/android/link/LinkControllerInteractor;)V

    new-instance v1, Lcom/stripe/android/link/LinkControllerInteractor$$ExternalSyntheticLambda4;

    invoke-direct {v1, p0, p3}, Lcom/stripe/android/link/LinkControllerInteractor$$ExternalSyntheticLambda4;-><init>(Lcom/stripe/android/link/LinkControllerInteractor;Z)V

    invoke-direct {p0, p1, p2, v0, v1}, Lcom/stripe/android/link/LinkControllerInteractor;->present(Landroidx/activity/result/ActivityResultLauncher;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)V

    return-void
.end method

.method private static final performAuthentication$lambda$12(Lcom/stripe/android/link/LinkControllerInteractor;Ljava/lang/Throwable;)Lkotlin/Unit;
    .locals 1

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 156
    iget-object p0, p0, Lcom/stripe/android/link/LinkControllerInteractor;->_authenticationResultFlow:Lkotlinx/coroutines/flow/MutableSharedFlow;

    .line 157
    new-instance v0, Lcom/stripe/android/link/LinkController$AuthenticationResult$Failed;

    invoke-direct {v0, p1}, Lcom/stripe/android/link/LinkController$AuthenticationResult$Failed;-><init>(Ljava/lang/Throwable;)V

    .line 156
    invoke-interface {p0, v0}, Lkotlinx/coroutines/flow/MutableSharedFlow;->tryEmit(Ljava/lang/Object;)Z

    .line 159
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method private static final performAuthentication$lambda$13(Lcom/stripe/android/link/LinkControllerInteractor;ZLcom/stripe/android/link/model/LinkAccount;Lcom/stripe/android/link/LinkControllerInteractor$State;)Lcom/stripe/android/link/LinkLaunchMode;
    .locals 1

    const-string v0, "<unused var>"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p2, :cond_0

    .line 161
    invoke-virtual {p2}, Lcom/stripe/android/link/model/LinkAccount;->isVerified()Z

    move-result p2

    const/4 p3, 0x1

    if-ne p2, p3, :cond_0

    .line 162
    iget-object p1, p0, Lcom/stripe/android/link/LinkControllerInteractor;->logger:Lcom/stripe/android/core/Logger;

    iget-object p2, p0, Lcom/stripe/android/link/LinkControllerInteractor;->tag:Ljava/lang/String;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    const-string p3, ": account is already verified, skipping authentication"

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, p2}, Lcom/stripe/android/core/Logger;->debug(Ljava/lang/String;)V

    .line 163
    iget-object p0, p0, Lcom/stripe/android/link/LinkControllerInteractor;->_authenticationResultFlow:Lkotlinx/coroutines/flow/MutableSharedFlow;

    sget-object p1, Lcom/stripe/android/link/LinkController$AuthenticationResult$Success;->INSTANCE:Lcom/stripe/android/link/LinkController$AuthenticationResult$Success;

    invoke-interface {p0, p1}, Lkotlinx/coroutines/flow/MutableSharedFlow;->tryEmit(Ljava/lang/Object;)Z

    const/4 p0, 0x0

    return-object p0

    .line 166
    :cond_0
    new-instance p0, Lcom/stripe/android/link/LinkLaunchMode$Authentication;

    invoke-direct {p0, p1}, Lcom/stripe/android/link/LinkLaunchMode$Authentication;-><init>(Z)V

    check-cast p0, Lcom/stripe/android/link/LinkLaunchMode;

    return-object p0
.end method

.method private final performCreatePaymentMethod-IoAF18A(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Result<",
            "Lcom/stripe/android/model/PaymentMethod;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lcom/stripe/android/link/LinkControllerInteractor$performCreatePaymentMethod$1;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/stripe/android/link/LinkControllerInteractor$performCreatePaymentMethod$1;

    iget v1, v0, Lcom/stripe/android/link/LinkControllerInteractor$performCreatePaymentMethod$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p1, v0, Lcom/stripe/android/link/LinkControllerInteractor$performCreatePaymentMethod$1;->label:I

    sub-int/2addr p1, v2

    iput p1, v0, Lcom/stripe/android/link/LinkControllerInteractor$performCreatePaymentMethod$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/link/LinkControllerInteractor$performCreatePaymentMethod$1;

    invoke-direct {v0, p0, p1}, Lcom/stripe/android/link/LinkControllerInteractor$performCreatePaymentMethod$1;-><init>(Lcom/stripe/android/link/LinkControllerInteractor;Lkotlin/coroutines/Continuation;)V

    :goto_0
    move-object v6, v0

    iget-object p1, v6, Lcom/stripe/android/link/LinkControllerInteractor$performCreatePaymentMethod$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 395
    iget v1, v6, Lcom/stripe/android/link/LinkControllerInteractor$performCreatePaymentMethod$1;->label:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v1, :cond_3

    if-eq v1, v3, :cond_2

    if-ne v1, v2, :cond_1

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast p1, Lkotlin/Result;

    invoke-virtual {p1}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast p1, Lkotlin/Result;

    invoke-virtual {p1}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p1

    goto :goto_1

    :cond_3
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 396
    iget-object p1, p0, Lcom/stripe/android/link/LinkControllerInteractor;->_state:Lkotlinx/coroutines/flow/MutableStateFlow;

    invoke-interface {p1}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/link/LinkControllerInteractor$State;

    .line 397
    invoke-direct {p0, p1}, Lcom/stripe/android/link/LinkControllerInteractor;->requireLinkComponent-IoAF18A(Lcom/stripe/android/link/LinkControllerInteractor$State;)Ljava/lang/Object;

    move-result-object v1

    .line 398
    invoke-static {v1}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v4

    if-nez v4, :cond_9

    check-cast v1, Lcom/stripe/android/link/injection/LinkComponent;

    .line 399
    invoke-virtual {v1}, Lcom/stripe/android/link/injection/LinkComponent;->getConfiguration$paymentsheet_release()Lcom/stripe/android/link/LinkConfiguration;

    move-result-object v4

    .line 400
    invoke-virtual {p1}, Lcom/stripe/android/link/LinkControllerInteractor$State;->getSelectedPaymentMethod()Lcom/stripe/android/link/LinkPaymentMethod;

    move-result-object p1

    if-nez p1, :cond_4

    .line 401
    sget-object p1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "No selected payment method"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Throwable;

    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    .line 403
    :cond_4
    invoke-virtual {v4}, Lcom/stripe/android/link/LinkConfiguration;->getPassthroughModeEnabled()Z

    move-result v5

    if-eqz v5, :cond_7

    .line 404
    invoke-virtual {v1}, Lcom/stripe/android/link/injection/LinkComponent;->getLinkAccountManager$paymentsheet_release()Lcom/stripe/android/link/account/LinkAccountManager;

    move-result-object v1

    .line 405
    invoke-virtual {p1}, Lcom/stripe/android/link/LinkPaymentMethod;->getDetails()Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;

    move-result-object v2

    invoke-virtual {v2}, Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;->getId()Ljava/lang/String;

    move-result-object v2

    .line 406
    invoke-virtual {p1}, Lcom/stripe/android/link/LinkPaymentMethod;->getDetails()Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;

    move-result-object v5

    invoke-static {v4, v5}, Lcom/stripe/android/link/confirmation/DefaultLinkConfirmationHandlerKt;->computeExpectedPaymentMethodType(Lcom/stripe/android/link/LinkConfiguration;Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;)Ljava/lang/String;

    move-result-object v4

    .line 407
    invoke-virtual {p1}, Lcom/stripe/android/link/LinkPaymentMethod;->getCollectedCvc()Ljava/lang/String;

    move-result-object v5

    .line 404
    iput v3, v6, Lcom/stripe/android/link/LinkControllerInteractor$performCreatePaymentMethod$1;->label:I

    move-object v3, v4

    const/4 v4, 0x0

    invoke-interface/range {v1 .. v6}, Lcom/stripe/android/link/account/LinkAccountManager;->sharePaymentDetails-yxL6bBk(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5

    goto :goto_2

    .line 409
    :cond_5
    :goto_1
    invoke-static {p1}, Lkotlin/Result;->isSuccess-impl(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    check-cast p1, Lcom/stripe/android/model/SharePaymentDetails;

    .line 410
    new-instance v0, Lorg/json/JSONObject;

    invoke-virtual {p1}, Lcom/stripe/android/model/SharePaymentDetails;->getEncodedPaymentMethod()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 411
    new-instance p1, Lcom/stripe/android/model/parsers/PaymentMethodJsonParser;

    invoke-direct {p1}, Lcom/stripe/android/model/parsers/PaymentMethodJsonParser;-><init>()V

    invoke-virtual {p1, v0}, Lcom/stripe/android/model/parsers/PaymentMethodJsonParser;->parse(Lorg/json/JSONObject;)Lcom/stripe/android/model/PaymentMethod;

    move-result-object p1

    .line 409
    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_6
    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    .line 414
    :cond_7
    invoke-virtual {v1}, Lcom/stripe/android/link/injection/LinkComponent;->getLinkAccountManager$paymentsheet_release()Lcom/stripe/android/link/account/LinkAccountManager;

    move-result-object v1

    iput v2, v6, Lcom/stripe/android/link/LinkControllerInteractor$performCreatePaymentMethod$1;->label:I

    invoke-interface {v1, p1, v6}, Lcom/stripe/android/link/account/LinkAccountManager;->createPaymentMethod-gIAlu-s(Lcom/stripe/android/link/LinkPaymentMethod;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_8

    :goto_2
    return-object v0

    :cond_8
    return-object p1

    .line 398
    :cond_9
    sget-object p1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v4}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method private final present(Landroidx/activity/result/ActivityResultLauncher;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/activity/result/ActivityResultLauncher<",
            "Lcom/stripe/android/link/LinkActivityContract$Args;",
            ">;",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Throwable;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Lcom/stripe/android/link/model/LinkAccount;",
            "-",
            "Lcom/stripe/android/link/LinkControllerInteractor$State;",
            "+",
            "Lcom/stripe/android/link/LinkLaunchMode;",
            ">;)V"
        }
    .end annotation

    .line 365
    iget-object v0, p0, Lcom/stripe/android/link/LinkControllerInteractor;->logger:Lcom/stripe/android/core/Logger;

    iget-object v1, p0, Lcom/stripe/android/link/LinkControllerInteractor;->tag:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ": presenting"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/stripe/android/core/Logger;->debug(Ljava/lang/String;)V

    .line 367
    new-instance v0, Lcom/stripe/android/link/LinkControllerInteractor$$ExternalSyntheticLambda15;

    invoke-direct {v0, p0, p2, p4, p1}, Lcom/stripe/android/link/LinkControllerInteractor$$ExternalSyntheticLambda15;-><init>(Lcom/stripe/android/link/LinkControllerInteractor;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Landroidx/activity/result/ActivityResultLauncher;)V

    invoke-direct {p0, p2, p3, v0}, Lcom/stripe/android/link/LinkControllerInteractor;->withConfiguration(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method private static final present$lambda$39(Lcom/stripe/android/link/LinkControllerInteractor;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Landroidx/activity/result/ActivityResultLauncher;Lcom/stripe/android/link/LinkConfiguration;)Lkotlin/Unit;
    .locals 2

    const-string v0, "configuration"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 371
    invoke-direct {p0, p1}, Lcom/stripe/android/link/LinkControllerInteractor;->updateStateOnNewEmail(Ljava/lang/String;)V

    .line 373
    iget-object v0, p0, Lcom/stripe/android/link/LinkControllerInteractor;->_account:Lkotlinx/coroutines/flow/StateFlow;

    invoke-interface {v0}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, Lcom/stripe/android/link/LinkControllerInteractor;->_state:Lkotlinx/coroutines/flow/MutableStateFlow;

    invoke-interface {v1}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/stripe/android/link/LinkLaunchMode;

    if-nez p2, :cond_0

    .line 374
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0

    .line 376
    :cond_0
    new-instance v0, Lcom/stripe/android/link/LinkControllerInteractor$$ExternalSyntheticLambda0;

    invoke-direct {v0, p1, p2}, Lcom/stripe/android/link/LinkControllerInteractor$$ExternalSyntheticLambda0;-><init>(Ljava/lang/String;Lcom/stripe/android/link/LinkLaunchMode;)V

    invoke-virtual {p0, v0}, Lcom/stripe/android/link/LinkControllerInteractor;->updateState$paymentsheet_release(Lkotlin/jvm/functions/Function1;)V

    .line 384
    new-instance p1, Lcom/stripe/android/link/LinkActivityContract$Args;

    .line 386
    sget-object v0, Lcom/stripe/android/link/LinkExpressMode;->ENABLED:Lcom/stripe/android/link/LinkExpressMode;

    .line 387
    iget-object p0, p0, Lcom/stripe/android/link/LinkControllerInteractor;->linkAccountHolder:Lcom/stripe/android/link/account/LinkAccountHolder;

    invoke-virtual {p0}, Lcom/stripe/android/link/account/LinkAccountHolder;->getLinkAccountInfo()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object p0

    invoke-interface {p0}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/stripe/android/link/LinkAccountUpdate$Value;

    .line 384
    invoke-direct {p1, p4, v0, p0, p2}, Lcom/stripe/android/link/LinkActivityContract$Args;-><init>(Lcom/stripe/android/link/LinkConfiguration;Lcom/stripe/android/link/LinkExpressMode;Lcom/stripe/android/link/LinkAccountUpdate$Value;Lcom/stripe/android/link/LinkLaunchMode;)V

    .line 383
    invoke-virtual {p3, p1}, Landroidx/activity/result/ActivityResultLauncher;->launch(Ljava/lang/Object;)V

    .line 391
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method private static final present$lambda$39$lambda$38(Ljava/lang/String;Lcom/stripe/android/link/LinkLaunchMode;Lcom/stripe/android/link/LinkControllerInteractor$State;)Lcom/stripe/android/link/LinkControllerInteractor$State;
    .locals 9

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v7, 0xd

    const/4 v8, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v3, p0

    move-object v6, p1

    move-object v1, p2

    .line 377
    invoke-static/range {v1 .. v8}, Lcom/stripe/android/link/LinkControllerInteractor$State;->copy$default(Lcom/stripe/android/link/LinkControllerInteractor$State;Lcom/stripe/android/link/injection/LinkComponent;Ljava/lang/String;Lcom/stripe/android/link/LinkPaymentMethod;Lcom/stripe/android/model/PaymentMethod;Lcom/stripe/android/link/LinkLaunchMode;ILjava/lang/Object;)Lcom/stripe/android/link/LinkControllerInteractor$State;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic presentPaymentMethods$default(Lcom/stripe/android/link/LinkControllerInteractor;Landroidx/activity/result/ActivityResultLauncher;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/4 p3, 0x0

    .line 110
    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lcom/stripe/android/link/LinkControllerInteractor;->presentPaymentMethods(Landroidx/activity/result/ActivityResultLauncher;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private static final presentPaymentMethods$lambda$10(Lcom/stripe/android/link/LinkControllerInteractor;Ljava/lang/Throwable;)Lkotlin/Unit;
    .locals 1

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 119
    iget-object p0, p0, Lcom/stripe/android/link/LinkControllerInteractor;->_presentPaymentMethodsResultFlow:Lkotlinx/coroutines/flow/MutableSharedFlow;

    .line 120
    new-instance v0, Lcom/stripe/android/link/LinkController$PresentPaymentMethodsResult$Failed;

    invoke-direct {v0, p1}, Lcom/stripe/android/link/LinkController$PresentPaymentMethodsResult$Failed;-><init>(Ljava/lang/Throwable;)V

    .line 119
    invoke-interface {p0, v0}, Lkotlinx/coroutines/flow/MutableSharedFlow;->tryEmit(Ljava/lang/Object;)Z

    .line 122
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method private static final presentPaymentMethods$lambda$11(Ljava/lang/String;Lcom/stripe/android/link/model/LinkAccount;Lcom/stripe/android/link/LinkControllerInteractor$State;)Lcom/stripe/android/link/LinkLaunchMode;
    .locals 1

    const-string p1, "state"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 124
    new-instance p1, Lcom/stripe/android/link/LinkLaunchMode$PaymentMethodSelection;

    .line 125
    invoke-virtual {p2}, Lcom/stripe/android/link/LinkControllerInteractor$State;->getSelectedPaymentMethod()Lcom/stripe/android/link/LinkPaymentMethod;

    move-result-object p2

    if-eqz p2, :cond_0

    invoke-virtual {p2}, Lcom/stripe/android/link/LinkPaymentMethod;->getDetails()Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;

    move-result-object p2

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    const/4 v0, 0x0

    .line 124
    invoke-direct {p1, p2, v0, p0}, Lcom/stripe/android/link/LinkLaunchMode$PaymentMethodSelection;-><init>(Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;ZLjava/lang/String;)V

    check-cast p1, Lcom/stripe/android/link/LinkLaunchMode;

    return-object p1
.end method

.method private final requireLinkComponent-IoAF18A(Lcom/stripe/android/link/LinkControllerInteractor$State;)Ljava/lang/Object;
    .locals 1

    .line 354
    invoke-virtual {p1}, Lcom/stripe/android/link/LinkControllerInteractor$State;->getLinkComponent()Lcom/stripe/android/link/injection/LinkComponent;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 355
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    .line 356
    :cond_0
    sget-object p1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    new-instance p1, Lcom/stripe/android/link/exceptions/MissingConfigurationException;

    invoke-direct {p1}, Lcom/stripe/android/link/exceptions/MissingConfigurationException;-><init>()V

    check-cast p1, Ljava/lang/Throwable;

    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method static synthetic requireLinkComponent-IoAF18A$default(Lcom/stripe/android/link/LinkControllerInteractor;Lcom/stripe/android/link/LinkControllerInteractor$State;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    .line 353
    iget-object p1, p0, Lcom/stripe/android/link/LinkControllerInteractor;->_state:Lkotlinx/coroutines/flow/MutableStateFlow;

    invoke-interface {p1}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/link/LinkControllerInteractor$State;

    :cond_0
    invoke-direct {p0, p1}, Lcom/stripe/android/link/LinkControllerInteractor;->requireLinkComponent-IoAF18A(Lcom/stripe/android/link/LinkControllerInteractor$State;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private static final state$lambda$3(Lcom/stripe/android/link/LinkControllerInteractor;Landroid/content/Context;Lcom/stripe/android/link/LinkController$LinkAccount;Lcom/stripe/android/link/LinkControllerInteractor$State;)Lcom/stripe/android/link/LinkController$State;
    .locals 2

    const-string v0, "state"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 79
    new-instance v0, Lcom/stripe/android/link/LinkController$State;

    .line 81
    invoke-virtual {p3}, Lcom/stripe/android/link/LinkControllerInteractor$State;->getSelectedPaymentMethod()Lcom/stripe/android/link/LinkPaymentMethod;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-direct {p0, v1, p1}, Lcom/stripe/android/link/LinkControllerInteractor;->toPreview(Lcom/stripe/android/link/LinkPaymentMethod;Landroid/content/Context;)Lcom/stripe/android/link/LinkController$PaymentMethodPreview;

    move-result-object p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    .line 82
    :goto_0
    invoke-virtual {p3}, Lcom/stripe/android/link/LinkControllerInteractor$State;->getCreatedPaymentMethod()Lcom/stripe/android/model/PaymentMethod;

    move-result-object p1

    .line 79
    invoke-direct {v0, p2, p0, p1}, Lcom/stripe/android/link/LinkController$State;-><init>(Lcom/stripe/android/link/LinkController$LinkAccount;Lcom/stripe/android/link/LinkController$PaymentMethodPreview;Lcom/stripe/android/model/PaymentMethod;)V

    return-object v0
.end method

.method private final toPreview(Lcom/stripe/android/link/LinkPaymentMethod;Landroid/content/Context;)Lcom/stripe/android/link/LinkController$PaymentMethodPreview;
    .locals 3

    .line 421
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 422
    invoke-virtual {p1}, Lcom/stripe/android/link/LinkPaymentMethod;->getDetails()Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;

    move-result-object v1

    invoke-static {v1}, Lcom/stripe/android/link/ui/wallet/PaymentDetailsNicknameKt;->getDisplayName(Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;)Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object v1

    invoke-interface {v1, p2}, Lcom/stripe/android/core/strings/ResolvableString;->resolve(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 423
    const-string v1, " \u2022\u2022\u2022\u2022 "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 424
    invoke-virtual {p1}, Lcom/stripe/android/link/LinkPaymentMethod;->getDetails()Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;

    move-result-object p1

    invoke-virtual {p1}, Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;->getLast4()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 421
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 426
    new-instance v0, Lcom/stripe/android/link/LinkController$PaymentMethodPreview;

    .line 427
    sget v1, Lcom/stripe/android/paymentsheet/R$drawable;->stripe_ic_paymentsheet_link_arrow:I

    .line 428
    sget v2, Lcom/stripe/android/R$string;->stripe_link:I

    invoke-virtual {p2, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p2

    const-string v2, "getString(...)"

    invoke-static {p2, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 426
    invoke-direct {v0, v1, p2, p1}, Lcom/stripe/android/link/LinkController$PaymentMethodPreview;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method private final toResult-IoAF18A(Lcom/stripe/android/link/account/LinkAuthResult;)Ljava/lang/Object;
    .locals 1

    .line 447
    instance-of v0, p1, Lcom/stripe/android/link/account/LinkAuthResult$AccountError;

    if-eqz v0, :cond_0

    .line 448
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    check-cast p1, Lcom/stripe/android/link/account/LinkAuthResult$AccountError;

    invoke-virtual {p1}, Lcom/stripe/android/link/account/LinkAuthResult$AccountError;->getError()Ljava/lang/Throwable;

    move-result-object p1

    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    .line 449
    :cond_0
    instance-of v0, p1, Lcom/stripe/android/link/account/LinkAuthResult$AttestationFailed;

    if-eqz v0, :cond_1

    .line 450
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    new-instance v0, Lcom/stripe/android/link/exceptions/AppAttestationException;

    check-cast p1, Lcom/stripe/android/link/account/LinkAuthResult$AttestationFailed;

    invoke-virtual {p1}, Lcom/stripe/android/link/account/LinkAuthResult$AttestationFailed;->getError()Ljava/lang/Throwable;

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/stripe/android/link/exceptions/AppAttestationException;-><init>(Ljava/lang/Throwable;)V

    check-cast v0, Ljava/lang/Throwable;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    .line 451
    :cond_1
    instance-of v0, p1, Lcom/stripe/android/link/account/LinkAuthResult$Error;

    if-eqz v0, :cond_2

    .line 452
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    check-cast p1, Lcom/stripe/android/link/account/LinkAuthResult$Error;

    invoke-virtual {p1}, Lcom/stripe/android/link/account/LinkAuthResult$Error;->getError()Ljava/lang/Throwable;

    move-result-object p1

    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    .line 453
    :cond_2
    sget-object v0, Lcom/stripe/android/link/account/LinkAuthResult$NoLinkAccountFound;->INSTANCE:Lcom/stripe/android/link/account/LinkAuthResult$NoLinkAccountFound;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 454
    sget-object p1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    const/4 p1, 0x0

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    .line 455
    :cond_3
    instance-of v0, p1, Lcom/stripe/android/link/account/LinkAuthResult$Success;

    if-eqz v0, :cond_4

    .line 456
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    check-cast p1, Lcom/stripe/android/link/account/LinkAuthResult$Success;

    invoke-virtual {p1}, Lcom/stripe/android/link/account/LinkAuthResult$Success;->getAccount()Lcom/stripe/android/link/model/LinkAccount;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    .line 446
    :cond_4
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method private final toResult-IoAF18A(Lcom/stripe/android/link/attestation/LinkAttestationCheck$Result;)Ljava/lang/Object;
    .locals 1

    .line 435
    instance-of v0, p1, Lcom/stripe/android/link/attestation/LinkAttestationCheck$Result$AccountError;

    if-eqz v0, :cond_0

    .line 436
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    check-cast p1, Lcom/stripe/android/link/attestation/LinkAttestationCheck$Result$AccountError;

    invoke-virtual {p1}, Lcom/stripe/android/link/attestation/LinkAttestationCheck$Result$AccountError;->getError()Ljava/lang/Throwable;

    move-result-object p1

    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    .line 437
    :cond_0
    instance-of v0, p1, Lcom/stripe/android/link/attestation/LinkAttestationCheck$Result$AttestationFailed;

    if-eqz v0, :cond_1

    .line 438
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    new-instance v0, Lcom/stripe/android/link/exceptions/AppAttestationException;

    check-cast p1, Lcom/stripe/android/link/attestation/LinkAttestationCheck$Result$AttestationFailed;

    invoke-virtual {p1}, Lcom/stripe/android/link/attestation/LinkAttestationCheck$Result$AttestationFailed;->getError()Ljava/lang/Throwable;

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/stripe/android/link/exceptions/AppAttestationException;-><init>(Ljava/lang/Throwable;)V

    check-cast v0, Ljava/lang/Throwable;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    .line 439
    :cond_1
    instance-of v0, p1, Lcom/stripe/android/link/attestation/LinkAttestationCheck$Result$Error;

    if-eqz v0, :cond_2

    .line 440
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    check-cast p1, Lcom/stripe/android/link/attestation/LinkAttestationCheck$Result$Error;

    invoke-virtual {p1}, Lcom/stripe/android/link/attestation/LinkAttestationCheck$Result$Error;->getError()Ljava/lang/Throwable;

    move-result-object p1

    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    .line 441
    :cond_2
    sget-object v0, Lcom/stripe/android/link/attestation/LinkAttestationCheck$Result$Successful;->INSTANCE:Lcom/stripe/android/link/attestation/LinkAttestationCheck$Result$Successful;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    .line 442
    sget-object p1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    .line 434
    :cond_3
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method private final updateStateOnAccountUpdate(Lcom/stripe/android/link/LinkAccountUpdate;)V
    .locals 3

    .line 230
    instance-of v0, p1, Lcom/stripe/android/link/LinkAccountUpdate$Value;

    if-eqz v0, :cond_4

    .line 231
    iget-object v0, p0, Lcom/stripe/android/link/LinkControllerInteractor;->_account:Lkotlinx/coroutines/flow/StateFlow;

    invoke-interface {v0}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/link/model/LinkAccount;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/stripe/android/link/model/LinkAccount;->getEmail()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v1

    .line 232
    :goto_0
    check-cast p1, Lcom/stripe/android/link/LinkAccountUpdate$Value;

    invoke-virtual {p1}, Lcom/stripe/android/link/LinkAccountUpdate$Value;->getAccount()Lcom/stripe/android/link/model/LinkAccount;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Lcom/stripe/android/link/model/LinkAccount;->getEmail()Ljava/lang/String;

    move-result-object v1

    :cond_1
    if-eqz v0, :cond_3

    .line 234
    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_1

    :cond_2
    const/4 v0, 0x0

    goto :goto_2

    :cond_3
    :goto_1
    const/4 v0, 0x1

    .line 235
    :goto_2
    iget-object v1, p0, Lcom/stripe/android/link/LinkControllerInteractor;->linkAccountHolder:Lcom/stripe/android/link/account/LinkAccountHolder;

    invoke-virtual {v1, p1}, Lcom/stripe/android/link/account/LinkAccountHolder;->set(Lcom/stripe/android/link/LinkAccountUpdate$Value;)V

    .line 236
    new-instance p1, Lcom/stripe/android/link/LinkControllerInteractor$$ExternalSyntheticLambda1;

    invoke-direct {p1, v0}, Lcom/stripe/android/link/LinkControllerInteractor$$ExternalSyntheticLambda1;-><init>(Z)V

    invoke-virtual {p0, p1}, Lcom/stripe/android/link/LinkControllerInteractor;->updateState$paymentsheet_release(Lkotlin/jvm/functions/Function1;)V

    return-void

    .line 243
    :cond_4
    instance-of v0, p1, Lcom/stripe/android/link/LinkAccountUpdate$None;

    if-nez v0, :cond_6

    if-nez p1, :cond_5

    goto :goto_3

    .line 229
    :cond_5
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_6
    :goto_3
    return-void
.end method

.method private static final updateStateOnAccountUpdate$lambda$25(ZLcom/stripe/android/link/LinkControllerInteractor$State;)Lcom/stripe/android/link/LinkControllerInteractor$State;
    .locals 10

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 238
    invoke-virtual {p1}, Lcom/stripe/android/link/LinkControllerInteractor$State;->getSelectedPaymentMethod()Lcom/stripe/android/link/LinkPaymentMethod;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz p0, :cond_0

    move-object v5, v0

    goto :goto_0

    :cond_0
    move-object v5, v1

    .line 239
    :goto_0
    invoke-virtual {p1}, Lcom/stripe/android/link/LinkControllerInteractor$State;->getCreatedPaymentMethod()Lcom/stripe/android/model/PaymentMethod;

    move-result-object v0

    if-eqz p0, :cond_1

    move-object v6, v0

    goto :goto_1

    :cond_1
    move-object v6, v1

    :goto_1
    const/16 v8, 0x13

    const/4 v9, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v7, 0x0

    move-object v2, p1

    .line 237
    invoke-static/range {v2 .. v9}, Lcom/stripe/android/link/LinkControllerInteractor$State;->copy$default(Lcom/stripe/android/link/LinkControllerInteractor$State;Lcom/stripe/android/link/injection/LinkComponent;Ljava/lang/String;Lcom/stripe/android/link/LinkPaymentMethod;Lcom/stripe/android/model/PaymentMethod;Lcom/stripe/android/link/LinkLaunchMode;ILjava/lang/Object;)Lcom/stripe/android/link/LinkControllerInteractor$State;

    move-result-object p0

    return-object p0
.end method

.method private final updateStateOnNewEmail(Ljava/lang/String;)V
    .locals 5

    .line 207
    iget-object v0, p0, Lcom/stripe/android/link/LinkControllerInteractor;->_account:Lkotlinx/coroutines/flow/StateFlow;

    invoke-interface {v0}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/link/model/LinkAccount;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/stripe/android/link/model/LinkAccount;->getEmail()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v1

    .line 211
    :goto_0
    iget-object v2, p0, Lcom/stripe/android/link/LinkControllerInteractor;->_state:Lkotlinx/coroutines/flow/MutableStateFlow;

    invoke-interface {v2}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/stripe/android/link/LinkControllerInteractor$State;

    invoke-virtual {v2}, Lcom/stripe/android/link/LinkControllerInteractor$State;->getEmailInput()Ljava/lang/String;

    move-result-object v2

    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    if-eqz v0, :cond_2

    .line 215
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    goto :goto_2

    :cond_2
    :goto_1
    const/4 v0, 0x1

    :goto_2
    if-nez v0, :cond_3

    .line 217
    iget-object v2, p0, Lcom/stripe/android/link/LinkControllerInteractor;->linkAccountHolder:Lcom/stripe/android/link/account/LinkAccountHolder;

    new-instance v3, Lcom/stripe/android/link/LinkAccountUpdate$Value;

    const/4 v4, 0x2

    invoke-direct {v3, v1, v1, v4, v1}, Lcom/stripe/android/link/LinkAccountUpdate$Value;-><init>(Lcom/stripe/android/link/model/LinkAccount;Lcom/stripe/android/link/LinkAccountUpdate$Value$UpdateReason;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v2, v3}, Lcom/stripe/android/link/account/LinkAccountHolder;->set(Lcom/stripe/android/link/LinkAccountUpdate$Value;)V

    .line 219
    :cond_3
    new-instance v1, Lcom/stripe/android/link/LinkControllerInteractor$$ExternalSyntheticLambda7;

    invoke-direct {v1, p1, v0}, Lcom/stripe/android/link/LinkControllerInteractor$$ExternalSyntheticLambda7;-><init>(Ljava/lang/String;Z)V

    invoke-virtual {p0, v1}, Lcom/stripe/android/link/LinkControllerInteractor;->updateState$paymentsheet_release(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method private static final updateStateOnNewEmail$lambda$22(Ljava/lang/String;ZLcom/stripe/android/link/LinkControllerInteractor$State;)Lcom/stripe/android/link/LinkControllerInteractor$State;
    .locals 10

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 222
    invoke-virtual {p2}, Lcom/stripe/android/link/LinkControllerInteractor$State;->getSelectedPaymentMethod()Lcom/stripe/android/link/LinkPaymentMethod;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    move-object v5, v0

    goto :goto_0

    :cond_0
    move-object v5, v1

    .line 223
    :goto_0
    invoke-virtual {p2}, Lcom/stripe/android/link/LinkControllerInteractor$State;->getCreatedPaymentMethod()Lcom/stripe/android/model/PaymentMethod;

    move-result-object v0

    if-eqz p1, :cond_1

    move-object v6, v0

    goto :goto_1

    :cond_1
    move-object v6, v1

    :goto_1
    const/16 v8, 0x11

    const/4 v9, 0x0

    const/4 v3, 0x0

    const/4 v7, 0x0

    move-object v4, p0

    move-object v2, p2

    .line 220
    invoke-static/range {v2 .. v9}, Lcom/stripe/android/link/LinkControllerInteractor$State;->copy$default(Lcom/stripe/android/link/LinkControllerInteractor$State;Lcom/stripe/android/link/injection/LinkComponent;Ljava/lang/String;Lcom/stripe/android/link/LinkPaymentMethod;Lcom/stripe/android/model/PaymentMethod;Lcom/stripe/android/link/LinkLaunchMode;ILjava/lang/Object;)Lcom/stripe/android/link/LinkControllerInteractor$State;

    move-result-object p0

    return-object p0
.end method

.method private final withConfiguration(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V
    .locals 34
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Throwable;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/stripe/android/link/LinkConfiguration;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x0

    const/4 v1, 0x1

    move-object/from16 v2, p0

    .line 177
    invoke-static {v2, v0, v1, v0}, Lcom/stripe/android/link/LinkControllerInteractor;->requireLinkComponent-IoAF18A$default(Lcom/stripe/android/link/LinkControllerInteractor;Lcom/stripe/android/link/LinkControllerInteractor$State;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 178
    invoke-static {v0}, Lkotlin/Result;->isSuccess-impl(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    check-cast v0, Lcom/stripe/android/link/injection/LinkComponent;

    invoke-virtual {v0}, Lcom/stripe/android/link/injection/LinkComponent;->getConfiguration$paymentsheet_release()Lcom/stripe/android/link/LinkConfiguration;

    move-result-object v0

    :cond_0
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 179
    invoke-static {v0}, Lkotlin/Result;->isSuccess-impl(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object v3, v0

    check-cast v3, Lcom/stripe/android/link/LinkConfiguration;

    if-eqz p1, :cond_1

    .line 181
    invoke-virtual {v3}, Lcom/stripe/android/link/LinkConfiguration;->getCustomerInfo()Lcom/stripe/android/link/LinkConfiguration$CustomerInfo;

    move-result-object v4

    const/16 v9, 0xd

    const/4 v10, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object/from16 v6, p1

    invoke-static/range {v4 .. v10}, Lcom/stripe/android/link/LinkConfiguration$CustomerInfo;->copy$default(Lcom/stripe/android/link/LinkConfiguration$CustomerInfo;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/stripe/android/link/LinkConfiguration$CustomerInfo;

    move-result-object v7

    const v32, 0xffffff7

    const/16 v33, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    invoke-static/range {v3 .. v33}, Lcom/stripe/android/link/LinkConfiguration;->copy$default(Lcom/stripe/android/link/LinkConfiguration;Lcom/stripe/android/model/StripeIntent;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/link/LinkConfiguration$CustomerInfo;Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;ZLjava/util/Map;Lcom/stripe/android/link/LinkConfiguration$CardBrandChoice;Lcom/stripe/android/CardBrandFilter;Lcom/stripe/android/payments/financialconnections/FinancialConnectionsAvailability;Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;ZZZLcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;Ljava/lang/String;Lcom/stripe/android/model/LinkMode;ZLjava/lang/String;ZZZZLcom/stripe/android/link/model/LinkAppearance;ZZLjava/lang/String;ILjava/lang/Object;)Lcom/stripe/android/link/LinkConfiguration;

    move-result-object v0

    if-eqz v0, :cond_1

    move-object v3, v0

    .line 179
    :cond_1
    invoke-static {v3}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    goto :goto_0

    :cond_2
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 185
    :goto_0
    invoke-static {v0}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v1

    if-nez v1, :cond_3

    check-cast v0, Lcom/stripe/android/link/LinkConfiguration;

    move-object/from16 v1, p3

    .line 186
    invoke-interface {v1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :cond_3
    move-object/from16 v0, p2

    .line 187
    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final authenticate(Landroidx/activity/result/ActivityResultLauncher;Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/activity/result/ActivityResultLauncher<",
            "Lcom/stripe/android/link/LinkActivityContract$Args;",
            ">;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    const-string v0, "launcher"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 137
    invoke-direct {p0, p1, p2, v0}, Lcom/stripe/android/link/LinkControllerInteractor;->performAuthentication(Landroidx/activity/result/ActivityResultLauncher;Ljava/lang/String;Z)V

    return-void
.end method

.method public final authenticateExistingConsumer(Landroidx/activity/result/ActivityResultLauncher;Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/activity/result/ActivityResultLauncher<",
            "Lcom/stripe/android/link/LinkActivityContract$Args;",
            ">;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    const-string v0, "launcher"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "email"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    .line 144
    invoke-direct {p0, p1, p2, v0}, Lcom/stripe/android/link/LinkControllerInteractor;->performAuthentication(Landroidx/activity/result/ActivityResultLauncher;Ljava/lang/String;Z)V

    return-void
.end method

.method public final configure(Lcom/stripe/android/link/LinkController$Configuration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/link/LinkController$Configuration;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/link/LinkController$ConfigureResult;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lcom/stripe/android/link/LinkControllerInteractor$configure$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/stripe/android/link/LinkControllerInteractor$configure$1;

    iget v1, v0, Lcom/stripe/android/link/LinkControllerInteractor$configure$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p2, v0, Lcom/stripe/android/link/LinkControllerInteractor$configure$1;->label:I

    sub-int/2addr p2, v2

    iput p2, v0, Lcom/stripe/android/link/LinkControllerInteractor$configure$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/link/LinkControllerInteractor$configure$1;

    invoke-direct {v0, p0, p2}, Lcom/stripe/android/link/LinkControllerInteractor$configure$1;-><init>(Lcom/stripe/android/link/LinkControllerInteractor;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p2, v0, Lcom/stripe/android/link/LinkControllerInteractor$configure$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 87
    iget v2, v0, Lcom/stripe/android/link/LinkControllerInteractor$configure$1;->label:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lcom/stripe/android/link/LinkControllerInteractor$configure$1;->L$2:Ljava/lang/Object;

    check-cast p1, Lcom/stripe/android/link/LinkControllerInteractor;

    iget-object v1, v0, Lcom/stripe/android/link/LinkControllerInteractor$configure$1;->L$1:Ljava/lang/Object;

    check-cast v1, Lcom/stripe/android/link/injection/LinkComponent;

    iget-object v0, v0, Lcom/stripe/android/link/LinkControllerInteractor$configure$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lcom/stripe/android/link/LinkControllerInteractor;

    :try_start_0
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_3

    :catchall_0
    move-exception p1

    goto/16 :goto_5

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, Lcom/stripe/android/link/LinkControllerInteractor$configure$1;->L$0:Ljava/lang/Object;

    check-cast p1, Lcom/stripe/android/link/LinkControllerInteractor;

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast p2, Lkotlin/Result;

    invoke-virtual {p2}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p2

    goto :goto_1

    :cond_3
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 88
    iget-object p2, p0, Lcom/stripe/android/link/LinkControllerInteractor;->logger:Lcom/stripe/android/core/Logger;

    iget-object v2, p0, Lcom/stripe/android/link/LinkControllerInteractor;->tag:Ljava/lang/String;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v5, ": updating configuration"

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {p2, v2}, Lcom/stripe/android/core/Logger;->debug(Ljava/lang/String;)V

    .line 89
    new-instance p2, Lcom/stripe/android/link/LinkControllerInteractor$$ExternalSyntheticLambda5;

    invoke-direct {p2}, Lcom/stripe/android/link/LinkControllerInteractor$$ExternalSyntheticLambda5;-><init>()V

    invoke-virtual {p0, p2}, Lcom/stripe/android/link/LinkControllerInteractor;->updateState$paymentsheet_release(Lkotlin/jvm/functions/Function1;)V

    .line 90
    iget-object p2, p0, Lcom/stripe/android/link/LinkControllerInteractor;->linkConfigurationLoader:Lcom/stripe/android/link/LinkConfigurationLoader;

    iput-object p0, v0, Lcom/stripe/android/link/LinkControllerInteractor$configure$1;->L$0:Ljava/lang/Object;

    iput v4, v0, Lcom/stripe/android/link/LinkControllerInteractor$configure$1;->label:I

    invoke-interface {p2, p1, v0}, Lcom/stripe/android/link/LinkConfigurationLoader;->load-gIAlu-s(Lcom/stripe/android/link/LinkController$Configuration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_4

    goto :goto_2

    :cond_4
    move-object p1, p0

    .line 476
    :goto_1
    invoke-static {p2}, Lkotlin/Result;->isSuccess-impl(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_7

    :try_start_1
    sget-object v2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 477
    check-cast p2, Lcom/stripe/android/link/LinkConfiguration;

    .line 92
    iget-object v2, p1, Lcom/stripe/android/link/LinkControllerInteractor;->linkComponentBuilderProvider:Ljavax/inject/Provider;

    invoke-interface {v2}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/stripe/android/link/injection/LinkComponent$Builder;

    .line 93
    invoke-interface {v2, p2}, Lcom/stripe/android/link/injection/LinkComponent$Builder;->configuration(Lcom/stripe/android/link/LinkConfiguration;)Lcom/stripe/android/link/injection/LinkComponent$Builder;

    move-result-object p2

    .line 94
    invoke-interface {p2}, Lcom/stripe/android/link/injection/LinkComponent$Builder;->build()Lcom/stripe/android/link/injection/LinkComponent;

    move-result-object p2

    .line 95
    invoke-virtual {p2}, Lcom/stripe/android/link/injection/LinkComponent;->getLinkAttestationCheck$paymentsheet_release()Lcom/stripe/android/link/attestation/LinkAttestationCheck;

    move-result-object v2

    iput-object p1, v0, Lcom/stripe/android/link/LinkControllerInteractor$configure$1;->L$0:Ljava/lang/Object;

    iput-object p2, v0, Lcom/stripe/android/link/LinkControllerInteractor$configure$1;->L$1:Ljava/lang/Object;

    iput-object p1, v0, Lcom/stripe/android/link/LinkControllerInteractor$configure$1;->L$2:Ljava/lang/Object;

    iput v3, v0, Lcom/stripe/android/link/LinkControllerInteractor$configure$1;->label:I

    invoke-interface {v2, v0}, Lcom/stripe/android/link/attestation/LinkAttestationCheck;->invoke(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-ne v0, v1, :cond_5

    :goto_2
    return-object v1

    :cond_5
    move-object v1, p2

    move-object p2, v0

    move-object v0, p1

    .line 87
    :goto_3
    :try_start_2
    check-cast p2, Lcom/stripe/android/link/attestation/LinkAttestationCheck$Result;

    .line 96
    invoke-direct {p1, p2}, Lcom/stripe/android/link/LinkControllerInteractor;->toResult-IoAF18A(Lcom/stripe/android/link/attestation/LinkAttestationCheck$Result;)Ljava/lang/Object;

    move-result-object p1

    .line 97
    invoke-static {p1}, Lkotlin/Result;->isSuccess-impl(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_6

    sget-object p2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    check-cast p1, Lkotlin/Unit;

    invoke-static {v1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    goto :goto_4

    :cond_6
    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    .line 477
    :goto_4
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 476
    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_6

    :catchall_1
    move-exception p2

    move-object v0, p1

    move-object p1, p2

    :goto_5
    sget-object p2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    goto :goto_6

    :cond_7
    invoke-static {p2}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    move-object v0, p1

    move-object p1, p2

    .line 99
    :goto_6
    invoke-static {p1}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p2

    if-nez p2, :cond_8

    check-cast p1, Lcom/stripe/android/link/injection/LinkComponent;

    .line 101
    new-instance p2, Lcom/stripe/android/link/LinkControllerInteractor$$ExternalSyntheticLambda6;

    invoke-direct {p2, p1}, Lcom/stripe/android/link/LinkControllerInteractor$$ExternalSyntheticLambda6;-><init>(Lcom/stripe/android/link/injection/LinkComponent;)V

    invoke-virtual {v0, p2}, Lcom/stripe/android/link/LinkControllerInteractor;->updateState$paymentsheet_release(Lkotlin/jvm/functions/Function1;)V

    .line 102
    sget-object p1, Lcom/stripe/android/link/LinkController$ConfigureResult$Success;->INSTANCE:Lcom/stripe/android/link/LinkController$ConfigureResult$Success;

    check-cast p1, Lcom/stripe/android/link/LinkController$ConfigureResult;

    goto :goto_7

    .line 105
    :cond_8
    new-instance p1, Lcom/stripe/android/link/LinkController$ConfigureResult$Failed;

    invoke-direct {p1, p2}, Lcom/stripe/android/link/LinkController$ConfigureResult$Failed;-><init>(Ljava/lang/Throwable;)V

    check-cast p1, Lcom/stripe/android/link/LinkController$ConfigureResult;

    :goto_7
    return-object p1
.end method

.method public final createPaymentMethod(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/link/LinkController$CreatePaymentMethodResult;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lcom/stripe/android/link/LinkControllerInteractor$createPaymentMethod$1;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/stripe/android/link/LinkControllerInteractor$createPaymentMethod$1;

    iget v1, v0, Lcom/stripe/android/link/LinkControllerInteractor$createPaymentMethod$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p1, v0, Lcom/stripe/android/link/LinkControllerInteractor$createPaymentMethod$1;->label:I

    sub-int/2addr p1, v2

    iput p1, v0, Lcom/stripe/android/link/LinkControllerInteractor$createPaymentMethod$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/link/LinkControllerInteractor$createPaymentMethod$1;

    invoke-direct {v0, p0, p1}, Lcom/stripe/android/link/LinkControllerInteractor$createPaymentMethod$1;-><init>(Lcom/stripe/android/link/LinkControllerInteractor;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p1, v0, Lcom/stripe/android/link/LinkControllerInteractor$createPaymentMethod$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 316
    iget v2, v0, Lcom/stripe/android/link/LinkControllerInteractor$createPaymentMethod$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object v0, v0, Lcom/stripe/android/link/LinkControllerInteractor$createPaymentMethod$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lcom/stripe/android/link/LinkControllerInteractor;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast p1, Lkotlin/Result;

    invoke-virtual {p1}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p1

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 317
    iput-object p0, v0, Lcom/stripe/android/link/LinkControllerInteractor$createPaymentMethod$1;->L$0:Ljava/lang/Object;

    iput v3, v0, Lcom/stripe/android/link/LinkControllerInteractor$createPaymentMethod$1;->label:I

    invoke-direct {p0, v0}, Lcom/stripe/android/link/LinkControllerInteractor;->performCreatePaymentMethod-IoAF18A(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    move-object v0, p0

    .line 318
    :goto_1
    new-instance v1, Lcom/stripe/android/link/LinkControllerInteractor$$ExternalSyntheticLambda8;

    invoke-direct {v1, p1}, Lcom/stripe/android/link/LinkControllerInteractor$$ExternalSyntheticLambda8;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Lcom/stripe/android/link/LinkControllerInteractor;->updateState$paymentsheet_release(Lkotlin/jvm/functions/Function1;)V

    .line 319
    invoke-static {p1}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-nez v0, :cond_4

    check-cast p1, Lcom/stripe/android/model/PaymentMethod;

    .line 320
    sget-object p1, Lcom/stripe/android/link/LinkController$CreatePaymentMethodResult$Success;->INSTANCE:Lcom/stripe/android/link/LinkController$CreatePaymentMethodResult$Success;

    check-cast p1, Lcom/stripe/android/link/LinkController$CreatePaymentMethodResult;

    return-object p1

    .line 321
    :cond_4
    new-instance p1, Lcom/stripe/android/link/LinkController$CreatePaymentMethodResult$Failed;

    invoke-direct {p1, v0}, Lcom/stripe/android/link/LinkController$CreatePaymentMethodResult$Failed;-><init>(Ljava/lang/Throwable;)V

    check-cast p1, Lcom/stripe/android/link/LinkController$CreatePaymentMethodResult;

    return-object p1
.end method

.method public final getAuthenticationResultFlow()Lkotlinx/coroutines/flow/SharedFlow;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/SharedFlow<",
            "Lcom/stripe/android/link/LinkController$AuthenticationResult;",
            ">;"
        }
    .end annotation

    .line 75
    iget-object v0, p0, Lcom/stripe/android/link/LinkControllerInteractor;->authenticationResultFlow:Lkotlinx/coroutines/flow/SharedFlow;

    return-object v0
.end method

.method public final getPresentPaymentMethodsResultFlow()Lkotlinx/coroutines/flow/SharedFlow;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/SharedFlow<",
            "Lcom/stripe/android/link/LinkController$PresentPaymentMethodsResult;",
            ">;"
        }
    .end annotation

    .line 71
    iget-object v0, p0, Lcom/stripe/android/link/LinkControllerInteractor;->presentPaymentMethodsResultFlow:Lkotlinx/coroutines/flow/SharedFlow;

    return-object v0
.end method

.method public final lookupConsumer(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/link/LinkController$LookupConsumerResult;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lcom/stripe/android/link/LinkControllerInteractor$lookupConsumer$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/stripe/android/link/LinkControllerInteractor$lookupConsumer$1;

    iget v1, v0, Lcom/stripe/android/link/LinkControllerInteractor$lookupConsumer$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p2, v0, Lcom/stripe/android/link/LinkControllerInteractor$lookupConsumer$1;->label:I

    sub-int/2addr p2, v2

    iput p2, v0, Lcom/stripe/android/link/LinkControllerInteractor$lookupConsumer$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/link/LinkControllerInteractor$lookupConsumer$1;

    invoke-direct {v0, p0, p2}, Lcom/stripe/android/link/LinkControllerInteractor$lookupConsumer$1;-><init>(Lcom/stripe/android/link/LinkControllerInteractor;Lkotlin/coroutines/Continuation;)V

    :goto_0
    move-object v6, v0

    iget-object p2, v6, Lcom/stripe/android/link/LinkControllerInteractor$lookupConsumer$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 298
    iget v1, v6, Lcom/stripe/android/link/LinkControllerInteractor$lookupConsumer$1;->label:I

    const/4 v7, 0x1

    if-eqz v1, :cond_2

    if-ne v1, v7, :cond_1

    iget-object p1, v6, Lcom/stripe/android/link/LinkControllerInteractor$lookupConsumer$1;->L$1:Ljava/lang/Object;

    check-cast p1, Lcom/stripe/android/link/LinkControllerInteractor;

    iget-object v0, v6, Lcom/stripe/android/link/LinkControllerInteractor$lookupConsumer$1;->L$0:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Ljava/lang/String;

    :try_start_0
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v0

    move-object p1, v0

    goto :goto_4

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    const/4 p2, 0x0

    .line 299
    invoke-static {p0, p2, v7, p2}, Lcom/stripe/android/link/LinkControllerInteractor;->requireLinkComponent-IoAF18A$default(Lcom/stripe/android/link/LinkControllerInteractor;Lcom/stripe/android/link/LinkControllerInteractor$State;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    .line 479
    invoke-static {p2}, Lkotlin/Result;->isSuccess-impl(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_6

    :try_start_1
    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 480
    check-cast p2, Lcom/stripe/android/link/injection/LinkComponent;

    .line 301
    invoke-virtual {p2}, Lcom/stripe/android/link/injection/LinkComponent;->getLinkAuth$paymentsheet_release()Lcom/stripe/android/link/account/LinkAuth;

    move-result-object v1

    .line 303
    sget-object v3, Lcom/stripe/android/model/EmailSource;->USER_ACTION:Lcom/stripe/android/model/EmailSource;

    .line 301
    iput-object p1, v6, Lcom/stripe/android/link/LinkControllerInteractor$lookupConsumer$1;->L$0:Ljava/lang/Object;

    iput-object p0, v6, Lcom/stripe/android/link/LinkControllerInteractor$lookupConsumer$1;->L$1:Ljava/lang/Object;

    iput v7, v6, Lcom/stripe/android/link/LinkControllerInteractor$lookupConsumer$1;->label:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v2, p1

    :try_start_2
    invoke-interface/range {v1 .. v6}, Lcom/stripe/android/link/account/LinkAuth;->lookUp(Ljava/lang/String;Lcom/stripe/android/model/EmailSource;ZLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    if-ne p2, v0, :cond_3

    return-object v0

    :cond_3
    move-object p1, p0

    move-object v1, v2

    .line 298
    :goto_1
    :try_start_3
    check-cast p2, Lcom/stripe/android/link/account/LinkAuthResult;

    .line 307
    invoke-direct {p1, p2}, Lcom/stripe/android/link/LinkControllerInteractor;->toResult-IoAF18A(Lcom/stripe/android/link/account/LinkAuthResult;)Ljava/lang/Object;

    move-result-object p1

    .line 308
    invoke-static {p1}, Lkotlin/Result;->isSuccess-impl(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_5

    sget-object p2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    check-cast p1, Lcom/stripe/android/link/model/LinkAccount;

    if-eqz p1, :cond_4

    goto :goto_2

    :cond_4
    const/4 v7, 0x0

    :goto_2
    invoke-static {v7}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    move-result-object p1

    :cond_5
    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    .line 480
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 479
    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_5

    :catchall_1
    move-exception v0

    goto :goto_3

    :catchall_2
    move-exception v0

    move-object v2, p1

    :goto_3
    move-object p1, v0

    move-object v1, v2

    :goto_4
    sget-object p2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    goto :goto_5

    :cond_6
    move-object v2, p1

    invoke-static {p2}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    move-object v1, v2

    .line 310
    :goto_5
    invoke-static {p1}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p2

    if-nez p2, :cond_7

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    .line 311
    new-instance p2, Lcom/stripe/android/link/LinkController$LookupConsumerResult$Success;

    invoke-direct {p2, v1, p1}, Lcom/stripe/android/link/LinkController$LookupConsumerResult$Success;-><init>(Ljava/lang/String;Z)V

    check-cast p2, Lcom/stripe/android/link/LinkController$LookupConsumerResult;

    goto :goto_6

    .line 312
    :cond_7
    new-instance p1, Lcom/stripe/android/link/LinkController$LookupConsumerResult$Failed;

    invoke-direct {p1, v1, p2}, Lcom/stripe/android/link/LinkController$LookupConsumerResult$Failed;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    move-object p2, p1

    check-cast p2, Lcom/stripe/android/link/LinkController$LookupConsumerResult;

    :goto_6
    return-object p2
.end method

.method public final onLinkActivityResult(Lcom/stripe/android/link/LinkActivityResult;)V
    .locals 3

    const-string v0, "result"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 192
    iget-object v0, p0, Lcom/stripe/android/link/LinkControllerInteractor;->_state:Lkotlinx/coroutines/flow/MutableStateFlow;

    invoke-interface {v0}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/link/LinkControllerInteractor$State;

    invoke-virtual {v0}, Lcom/stripe/android/link/LinkControllerInteractor$State;->getCurrentLaunchMode()Lcom/stripe/android/link/LinkLaunchMode;

    move-result-object v0

    .line 193
    new-instance v1, Lcom/stripe/android/link/LinkControllerInteractor$$ExternalSyntheticLambda12;

    invoke-direct {v1}, Lcom/stripe/android/link/LinkControllerInteractor$$ExternalSyntheticLambda12;-><init>()V

    invoke-virtual {p0, v1}, Lcom/stripe/android/link/LinkControllerInteractor;->updateState$paymentsheet_release(Lkotlin/jvm/functions/Function1;)V

    .line 194
    invoke-virtual {p1}, Lcom/stripe/android/link/LinkActivityResult;->getLinkAccountUpdate()Lcom/stripe/android/link/LinkAccountUpdate;

    move-result-object v1

    invoke-direct {p0, v1}, Lcom/stripe/android/link/LinkControllerInteractor;->updateStateOnAccountUpdate(Lcom/stripe/android/link/LinkAccountUpdate;)V

    .line 197
    instance-of v1, v0, Lcom/stripe/android/link/LinkLaunchMode$PaymentMethodSelection;

    if-eqz v1, :cond_0

    .line 198
    invoke-direct {p0, p1}, Lcom/stripe/android/link/LinkControllerInteractor;->handlePaymentMethodSelectionResult(Lcom/stripe/android/link/LinkActivityResult;)V

    return-void

    .line 199
    :cond_0
    instance-of v1, v0, Lcom/stripe/android/link/LinkLaunchMode$Authentication;

    if-eqz v1, :cond_1

    .line 200
    invoke-direct {p0, p1}, Lcom/stripe/android/link/LinkControllerInteractor;->handleAuthenticationResult(Lcom/stripe/android/link/LinkActivityResult;)V

    return-void

    .line 202
    :cond_1
    iget-object p1, p0, Lcom/stripe/android/link/LinkControllerInteractor;->logger:Lcom/stripe/android/core/Logger;

    iget-object v1, p0, Lcom/stripe/android/link/LinkControllerInteractor;->tag:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ": unexpected result for launch mode: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Lcom/stripe/android/core/Logger;->warning(Ljava/lang/String;)V

    return-void
.end method

.method public final presentPaymentMethods(Landroidx/activity/result/ActivityResultLauncher;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/activity/result/ActivityResultLauncher<",
            "Lcom/stripe/android/link/LinkActivityContract$Args;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    const-string v0, "launcher"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 115
    new-instance v0, Lcom/stripe/android/link/LinkControllerInteractor$$ExternalSyntheticLambda9;

    invoke-direct {v0, p0}, Lcom/stripe/android/link/LinkControllerInteractor$$ExternalSyntheticLambda9;-><init>(Lcom/stripe/android/link/LinkControllerInteractor;)V

    new-instance v1, Lcom/stripe/android/link/LinkControllerInteractor$$ExternalSyntheticLambda10;

    invoke-direct {v1, p3}, Lcom/stripe/android/link/LinkControllerInteractor$$ExternalSyntheticLambda10;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, p1, p2, v0, v1}, Lcom/stripe/android/link/LinkControllerInteractor;->present(Landroidx/activity/result/ActivityResultLauncher;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)V

    return-void
.end method

.method public final registerConsumer(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/link/LinkController$RegisterConsumerResult;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p5, Lcom/stripe/android/link/LinkControllerInteractor$registerConsumer$1;

    if-eqz v0, :cond_0

    move-object v0, p5

    check-cast v0, Lcom/stripe/android/link/LinkControllerInteractor$registerConsumer$1;

    iget v1, v0, Lcom/stripe/android/link/LinkControllerInteractor$registerConsumer$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p5, v0, Lcom/stripe/android/link/LinkControllerInteractor$registerConsumer$1;->label:I

    sub-int/2addr p5, v2

    iput p5, v0, Lcom/stripe/android/link/LinkControllerInteractor$registerConsumer$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/link/LinkControllerInteractor$registerConsumer$1;

    invoke-direct {v0, p0, p5}, Lcom/stripe/android/link/LinkControllerInteractor$registerConsumer$1;-><init>(Lcom/stripe/android/link/LinkControllerInteractor;Lkotlin/coroutines/Continuation;)V

    :goto_0
    move-object v7, v0

    iget-object p5, v7, Lcom/stripe/android/link/LinkControllerInteractor$registerConsumer$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 325
    iget v1, v7, Lcom/stripe/android/link/LinkControllerInteractor$registerConsumer$1;->label:I

    const/4 v2, 0x1

    const/4 v8, 0x0

    if-eqz v1, :cond_2

    if-ne v1, v2, :cond_1

    iget-object p1, v7, Lcom/stripe/android/link/LinkControllerInteractor$registerConsumer$1;->L$1:Ljava/lang/Object;

    check-cast p1, Lcom/stripe/android/link/LinkControllerInteractor;

    iget-object p2, v7, Lcom/stripe/android/link/LinkControllerInteractor$registerConsumer$1;->L$0:Ljava/lang/Object;

    check-cast p2, Lcom/stripe/android/link/LinkControllerInteractor;

    :try_start_0
    invoke-static {p5}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v0

    move-object p1, v0

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p5}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 331
    invoke-static {p0, v8, v2, v8}, Lcom/stripe/android/link/LinkControllerInteractor;->requireLinkComponent-IoAF18A$default(Lcom/stripe/android/link/LinkControllerInteractor;Lcom/stripe/android/link/LinkControllerInteractor$State;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p5

    .line 481
    invoke-static {p5}, Lkotlin/Result;->isSuccess-impl(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    :try_start_1
    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 482
    check-cast p5, Lcom/stripe/android/link/injection/LinkComponent;

    .line 333
    invoke-virtual {p5}, Lcom/stripe/android/link/injection/LinkComponent;->getLinkAuth$paymentsheet_release()Lcom/stripe/android/link/account/LinkAuth;

    move-result-object v1

    .line 338
    sget-object v6, Lcom/stripe/android/link/ui/inline/SignUpConsentAction;->Implied:Lcom/stripe/android/link/ui/inline/SignUpConsentAction;

    .line 333
    iput-object p0, v7, Lcom/stripe/android/link/LinkControllerInteractor$registerConsumer$1;->L$0:Ljava/lang/Object;

    iput-object p0, v7, Lcom/stripe/android/link/LinkControllerInteractor$registerConsumer$1;->L$1:Ljava/lang/Object;

    iput v2, v7, Lcom/stripe/android/link/LinkControllerInteractor$registerConsumer$1;->label:I

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-interface/range {v1 .. v7}, Lcom/stripe/android/link/account/LinkAuth;->signUp(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/link/ui/inline/SignUpConsentAction;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p5
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-ne p5, v0, :cond_3

    return-object v0

    :cond_3
    move-object p1, p0

    move-object p2, p1

    .line 325
    :goto_1
    :try_start_2
    check-cast p5, Lcom/stripe/android/link/account/LinkAuthResult;

    .line 339
    invoke-direct {p1, p5}, Lcom/stripe/android/link/LinkControllerInteractor;->toResult-IoAF18A(Lcom/stripe/android/link/account/LinkAuthResult;)Ljava/lang/Object;

    move-result-object p1

    .line 482
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 481
    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_3

    :catchall_1
    move-exception v0

    move-object p1, v0

    move-object p2, p0

    :goto_2
    sget-object p3, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    goto :goto_3

    :cond_4
    invoke-static {p5}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    move-object p2, p0

    .line 341
    :goto_3
    invoke-static {p1}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p3

    const/4 p4, 0x2

    if-nez p3, :cond_5

    check-cast p1, Lcom/stripe/android/link/model/LinkAccount;

    .line 343
    new-instance p3, Lcom/stripe/android/link/LinkAccountUpdate$Value;

    invoke-direct {p3, p1, v8, p4, v8}, Lcom/stripe/android/link/LinkAccountUpdate$Value;-><init>(Lcom/stripe/android/link/model/LinkAccount;Lcom/stripe/android/link/LinkAccountUpdate$Value$UpdateReason;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    check-cast p3, Lcom/stripe/android/link/LinkAccountUpdate;

    invoke-direct {p2, p3}, Lcom/stripe/android/link/LinkControllerInteractor;->updateStateOnAccountUpdate(Lcom/stripe/android/link/LinkAccountUpdate;)V

    .line 344
    sget-object p1, Lcom/stripe/android/link/LinkController$RegisterConsumerResult$Success;->INSTANCE:Lcom/stripe/android/link/LinkController$RegisterConsumerResult$Success;

    check-cast p1, Lcom/stripe/android/link/LinkController$RegisterConsumerResult;

    goto :goto_4

    .line 347
    :cond_5
    new-instance p1, Lcom/stripe/android/link/LinkAccountUpdate$Value;

    invoke-direct {p1, v8, v8, p4, v8}, Lcom/stripe/android/link/LinkAccountUpdate$Value;-><init>(Lcom/stripe/android/link/model/LinkAccount;Lcom/stripe/android/link/LinkAccountUpdate$Value$UpdateReason;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    check-cast p1, Lcom/stripe/android/link/LinkAccountUpdate;

    invoke-direct {p2, p1}, Lcom/stripe/android/link/LinkControllerInteractor;->updateStateOnAccountUpdate(Lcom/stripe/android/link/LinkAccountUpdate;)V

    .line 348
    new-instance p1, Lcom/stripe/android/link/LinkController$RegisterConsumerResult$Failed;

    invoke-direct {p1, p3}, Lcom/stripe/android/link/LinkController$RegisterConsumerResult$Failed;-><init>(Ljava/lang/Throwable;)V

    check-cast p1, Lcom/stripe/android/link/LinkController$RegisterConsumerResult;

    :goto_4
    return-object p1
.end method

.method public final state(Landroid/content/Context;)Lkotlinx/coroutines/flow/StateFlow;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            ")",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Lcom/stripe/android/link/LinkController$State;",
            ">;"
        }
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 78
    iget-object v0, p0, Lcom/stripe/android/link/LinkControllerInteractor;->_internalLinkAccount:Lkotlinx/coroutines/flow/StateFlow;

    iget-object v1, p0, Lcom/stripe/android/link/LinkControllerInteractor;->_state:Lkotlinx/coroutines/flow/MutableStateFlow;

    check-cast v1, Lkotlinx/coroutines/flow/StateFlow;

    new-instance v2, Lcom/stripe/android/link/LinkControllerInteractor$$ExternalSyntheticLambda11;

    invoke-direct {v2, p0, p1}, Lcom/stripe/android/link/LinkControllerInteractor$$ExternalSyntheticLambda11;-><init>(Lcom/stripe/android/link/LinkControllerInteractor;Landroid/content/Context;)V

    invoke-static {v0, v1, v2}, Lcom/stripe/android/uicore/utils/StateFlowsKt;->combineAsStateFlow(Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/flow/StateFlow;

    move-result-object p1

    return-object p1
.end method

.method public final updateState$paymentsheet_release(Lkotlin/jvm/functions/Function1;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/stripe/android/link/LinkControllerInteractor$State;",
            "Lcom/stripe/android/link/LinkControllerInteractor$State;",
            ">;)V"
        }
    .end annotation

    const-string v0, "block"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 461
    iget-object v0, p0, Lcom/stripe/android/link/LinkControllerInteractor;->_state:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 484
    :cond_0
    invoke-interface {v0}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    move-result-object v1

    .line 485
    invoke-interface {p1, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    .line 486
    invoke-interface {v0, v1, v2}, Lkotlinx/coroutines/flow/MutableStateFlow;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-void
.end method
