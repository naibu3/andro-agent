.class public final Lcom/stripe/android/stripe3ds2/transaction/InitChallengeRepositoryFactory;
.super Ljava/lang/Object;
.source "InitChallengeRepository.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\t\u0012\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000b\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0006\u0010\u0012\u001a\u00020\u0013R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0008\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"
    }
    d2 = {
        "Lcom/stripe/android/stripe3ds2/transaction/InitChallengeRepositoryFactory;",
        "",
        "application",
        "Landroid/app/Application;",
        "isLiveMode",
        "",
        "sdkTransactionId",
        "Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;",
        "uiCustomization",
        "Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;",
        "rootCerts",
        "",
        "Ljava/security/cert/X509Certificate;",
        "enableLogging",
        "workContext",
        "Lkotlin/coroutines/CoroutineContext;",
        "<init>",
        "(Landroid/app/Application;ZLcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;Ljava/util/List;ZLkotlin/coroutines/CoroutineContext;)V",
        "create",
        "Lcom/stripe/android/stripe3ds2/transaction/InitChallengeRepository;",
        "3ds2sdk_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final application:Landroid/app/Application;

.field private final enableLogging:Z

.field private final isLiveMode:Z

.field private final rootCerts:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/security/cert/X509Certificate;",
            ">;"
        }
    .end annotation
.end field

.field private final sdkTransactionId:Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;

.field private final uiCustomization:Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;

.field private final workContext:Lkotlin/coroutines/CoroutineContext;


# direct methods
.method public constructor <init>(Landroid/app/Application;ZLcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;Ljava/util/List;ZLkotlin/coroutines/CoroutineContext;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/app/Application;",
            "Z",
            "Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;",
            "Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;",
            "Ljava/util/List<",
            "+",
            "Ljava/security/cert/X509Certificate;",
            ">;Z",
            "Lkotlin/coroutines/CoroutineContext;",
            ")V"
        }
    .end annotation

    const-string v0, "application"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sdkTransactionId"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "uiCustomization"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "rootCerts"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "workContext"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 147
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 148
    iput-object p1, p0, Lcom/stripe/android/stripe3ds2/transaction/InitChallengeRepositoryFactory;->application:Landroid/app/Application;

    .line 149
    iput-boolean p2, p0, Lcom/stripe/android/stripe3ds2/transaction/InitChallengeRepositoryFactory;->isLiveMode:Z

    .line 150
    iput-object p3, p0, Lcom/stripe/android/stripe3ds2/transaction/InitChallengeRepositoryFactory;->sdkTransactionId:Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;

    .line 151
    iput-object p4, p0, Lcom/stripe/android/stripe3ds2/transaction/InitChallengeRepositoryFactory;->uiCustomization:Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;

    .line 152
    iput-object p5, p0, Lcom/stripe/android/stripe3ds2/transaction/InitChallengeRepositoryFactory;->rootCerts:Ljava/util/List;

    .line 153
    iput-boolean p6, p0, Lcom/stripe/android/stripe3ds2/transaction/InitChallengeRepositoryFactory;->enableLogging:Z

    .line 154
    iput-object p7, p0, Lcom/stripe/android/stripe3ds2/transaction/InitChallengeRepositoryFactory;->workContext:Lkotlin/coroutines/CoroutineContext;

    return-void
.end method


# virtual methods
.method public final create()Lcom/stripe/android/stripe3ds2/transaction/InitChallengeRepository;
    .locals 13

    .line 157
    sget-object v0, Lcom/stripe/android/stripe3ds2/transaction/Logger;->Companion:Lcom/stripe/android/stripe3ds2/transaction/Logger$Companion;

    iget-boolean v1, p0, Lcom/stripe/android/stripe3ds2/transaction/InitChallengeRepositoryFactory;->enableLogging:Z

    invoke-virtual {v0, v1}, Lcom/stripe/android/stripe3ds2/transaction/Logger$Companion;->get(Z)Lcom/stripe/android/stripe3ds2/transaction/Logger;

    move-result-object v6

    .line 158
    new-instance v2, Lcom/stripe/android/stripe3ds2/observability/DefaultErrorReporter;

    .line 159
    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/transaction/InitChallengeRepositoryFactory;->application:Landroid/app/Application;

    move-object v3, v0

    check-cast v3, Landroid/content/Context;

    .line 160
    new-instance v0, Lcom/stripe/android/stripe3ds2/observability/Stripe3ds2ErrorReporterConfig;

    iget-object v1, p0, Lcom/stripe/android/stripe3ds2/transaction/InitChallengeRepositoryFactory;->sdkTransactionId:Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;

    invoke-direct {v0, v1}, Lcom/stripe/android/stripe3ds2/observability/Stripe3ds2ErrorReporterConfig;-><init>(Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;)V

    move-object v4, v0

    check-cast v4, Lcom/stripe/android/stripe3ds2/observability/DefaultErrorReporter$Config;

    .line 161
    iget-object v5, p0, Lcom/stripe/android/stripe3ds2/transaction/InitChallengeRepositoryFactory;->workContext:Lkotlin/coroutines/CoroutineContext;

    const/16 v11, 0xf0

    const/4 v12, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    .line 158
    invoke-direct/range {v2 .. v12}, Lcom/stripe/android/stripe3ds2/observability/DefaultErrorReporter;-><init>(Landroid/content/Context;Lcom/stripe/android/stripe3ds2/observability/DefaultErrorReporter$Config;Lkotlin/coroutines/CoroutineContext;Lcom/stripe/android/stripe3ds2/transaction/Logger;Lcom/stripe/android/stripe3ds2/observability/SentryConfig;Ljava/lang/String;Ljava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 164
    new-instance v0, Lcom/stripe/android/stripe3ds2/transaction/DefaultInitChallengeRepository;

    .line 165
    iget-object v3, p0, Lcom/stripe/android/stripe3ds2/transaction/InitChallengeRepositoryFactory;->sdkTransactionId:Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;

    .line 166
    new-instance v4, Lcom/stripe/android/stripe3ds2/transaction/MessageVersionRegistry;

    invoke-direct {v4}, Lcom/stripe/android/stripe3ds2/transaction/MessageVersionRegistry;-><init>()V

    .line 167
    new-instance v1, Lcom/stripe/android/stripe3ds2/transaction/DefaultJwsValidator;

    .line 168
    iget-boolean v5, p0, Lcom/stripe/android/stripe3ds2/transaction/InitChallengeRepositoryFactory;->isLiveMode:Z

    .line 169
    iget-object v7, p0, Lcom/stripe/android/stripe3ds2/transaction/InitChallengeRepositoryFactory;->rootCerts:Ljava/util/List;

    .line 170
    move-object v11, v2

    check-cast v11, Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;

    .line 167
    invoke-direct {v1, v5, v7, v11}, Lcom/stripe/android/stripe3ds2/transaction/DefaultJwsValidator;-><init>(ZLjava/util/List;Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;)V

    move-object v5, v1

    check-cast v5, Lcom/stripe/android/stripe3ds2/transaction/JwsValidator;

    .line 172
    new-instance v1, Lcom/stripe/android/stripe3ds2/security/DefaultMessageTransformer;

    iget-boolean v2, p0, Lcom/stripe/android/stripe3ds2/transaction/InitChallengeRepositoryFactory;->isLiveMode:Z

    invoke-direct {v1, v2}, Lcom/stripe/android/stripe3ds2/security/DefaultMessageTransformer;-><init>(Z)V

    check-cast v1, Lcom/stripe/android/stripe3ds2/security/MessageTransformer;

    .line 173
    new-instance v2, Lcom/stripe/android/stripe3ds2/transaction/DefaultAcsDataParser;

    invoke-direct {v2, v11}, Lcom/stripe/android/stripe3ds2/transaction/DefaultAcsDataParser;-><init>(Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;)V

    move-object v7, v2

    check-cast v7, Lcom/stripe/android/stripe3ds2/transaction/AcsDataParser;

    .line 174
    new-instance v2, Lcom/stripe/android/stripe3ds2/transaction/DefaultChallengeRequestResultRepository;

    iget-object v8, p0, Lcom/stripe/android/stripe3ds2/transaction/InitChallengeRepositoryFactory;->workContext:Lkotlin/coroutines/CoroutineContext;

    invoke-direct {v2, v11, v8}, Lcom/stripe/android/stripe3ds2/transaction/DefaultChallengeRequestResultRepository;-><init>(Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;Lkotlin/coroutines/CoroutineContext;)V

    move-object v8, v2

    check-cast v8, Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestResultRepository;

    .line 175
    new-instance v2, Lcom/stripe/android/stripe3ds2/transaction/StripeErrorRequestExecutor$Factory;

    iget-object v9, p0, Lcom/stripe/android/stripe3ds2/transaction/InitChallengeRepositoryFactory;->workContext:Lkotlin/coroutines/CoroutineContext;

    invoke-direct {v2, v9}, Lcom/stripe/android/stripe3ds2/transaction/StripeErrorRequestExecutor$Factory;-><init>(Lkotlin/coroutines/CoroutineContext;)V

    move-object v9, v2

    check-cast v9, Lcom/stripe/android/stripe3ds2/transaction/ErrorRequestExecutor$Factory;

    .line 176
    iget-object v10, p0, Lcom/stripe/android/stripe3ds2/transaction/InitChallengeRepositoryFactory;->uiCustomization:Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;

    move-object v2, v0

    move-object v12, v6

    move-object v6, v1

    .line 164
    invoke-direct/range {v2 .. v12}, Lcom/stripe/android/stripe3ds2/transaction/DefaultInitChallengeRepository;-><init>(Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;Lcom/stripe/android/stripe3ds2/transaction/MessageVersionRegistry;Lcom/stripe/android/stripe3ds2/transaction/JwsValidator;Lcom/stripe/android/stripe3ds2/security/MessageTransformer;Lcom/stripe/android/stripe3ds2/transaction/AcsDataParser;Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestResultRepository;Lcom/stripe/android/stripe3ds2/transaction/ErrorRequestExecutor$Factory;Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;Lcom/stripe/android/stripe3ds2/transaction/Logger;)V

    move-object v0, v2

    check-cast v0, Lcom/stripe/android/stripe3ds2/transaction/InitChallengeRepository;

    return-object v0
.end method
