.class public final Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationModule;
.super Ljava/lang/Object;
.source "LinkInlineSignupConfirmationModule.kt"


# annotations
.annotation runtime Ldagger/Module;
    subcomponents = {
        Lcom/stripe/android/link/injection/LinkAnalyticsComponent;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u00c1\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J0\u0010\u0004\u001a\u0012\u0012\u0002\u0008\u0003\u0012\u0002\u0008\u0003\u0012\u0002\u0008\u0003\u0012\u0002\u0008\u00030\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007\u00a8\u0006\u000c"
    }
    d2 = {
        "Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationModule;",
        "",
        "<init>",
        "()V",
        "providesLinkConfirmationDefinition",
        "Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition;",
        "linkStore",
        "Lcom/stripe/android/link/account/LinkStore;",
        "linkConfigurationCoordinator",
        "Lcom/stripe/android/link/LinkConfigurationCoordinator;",
        "linkAnalyticsComponentBuilder",
        "Lcom/stripe/android/link/injection/LinkAnalyticsComponent$Builder;",
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
.field public static final $stable:I

.field public static final INSTANCE:Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationModule;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationModule;

    invoke-direct {v0}, Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationModule;-><init>()V

    sput-object v0, Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationModule;->INSTANCE:Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationModule;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final providesLinkConfirmationDefinition(Lcom/stripe/android/link/account/LinkStore;Lcom/stripe/android/link/LinkConfigurationCoordinator;Lcom/stripe/android/link/injection/LinkAnalyticsComponent$Builder;)Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ldagger/multibindings/IntoSet;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/link/account/LinkStore;",
            "Lcom/stripe/android/link/LinkConfigurationCoordinator;",
            "Lcom/stripe/android/link/injection/LinkAnalyticsComponent$Builder;",
            ")",
            "Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition<",
            "****>;"
        }
    .end annotation

    const-string v0, "linkStore"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "linkConfigurationCoordinator"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "linkAnalyticsComponentBuilder"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    invoke-interface {p3}, Lcom/stripe/android/link/injection/LinkAnalyticsComponent$Builder;->build()Lcom/stripe/android/link/injection/LinkAnalyticsComponent;

    move-result-object p3

    invoke-interface {p3}, Lcom/stripe/android/link/injection/LinkAnalyticsComponent;->getLinkAnalyticsHelper()Lcom/stripe/android/link/analytics/LinkAnalyticsHelper;

    move-result-object p3

    .line 25
    new-instance v0, Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationDefinition;

    invoke-direct {v0, p2, p3, p1}, Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationDefinition;-><init>(Lcom/stripe/android/link/LinkConfigurationCoordinator;Lcom/stripe/android/link/analytics/LinkAnalyticsHelper;Lcom/stripe/android/link/account/LinkStore;)V

    check-cast v0, Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition;

    return-object v0
.end method
