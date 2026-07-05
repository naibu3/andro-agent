.class public final Lcom/stripe/android/paymentelement/embedded/content/NullUiDefinitionFactoryHelper;
.super Ljava/lang/Object;
.source "NullUiDefinitionFactoryHelper.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u00c1\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Lcom/stripe/android/paymentelement/embedded/content/NullUiDefinitionFactoryHelper;",
        "",
        "<init>",
        "()V",
        "nullEmbeddedUiDefinitionFactory",
        "Lcom/stripe/android/lpmfoundations/paymentmethod/UiDefinitionFactory$Arguments$Factory$Default;",
        "getNullEmbeddedUiDefinitionFactory",
        "()Lcom/stripe/android/lpmfoundations/paymentmethod/UiDefinitionFactory$Arguments$Factory$Default;",
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

.field public static final INSTANCE:Lcom/stripe/android/paymentelement/embedded/content/NullUiDefinitionFactoryHelper;

.field private static final nullEmbeddedUiDefinitionFactory:Lcom/stripe/android/lpmfoundations/paymentmethod/UiDefinitionFactory$Arguments$Factory$Default;


# direct methods
.method public static synthetic $r8$lambda$uAf0zYzIqiWyT14PRpNr05vVMO0(Lcom/stripe/android/link/ui/inline/InlineSignupViewState;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/paymentelement/embedded/content/NullUiDefinitionFactoryHelper;->nullEmbeddedUiDefinitionFactory$lambda$0(Lcom/stripe/android/link/ui/inline/InlineSignupViewState;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method static constructor <clinit>()V
    .locals 14

    new-instance v0, Lcom/stripe/android/paymentelement/embedded/content/NullUiDefinitionFactoryHelper;

    invoke-direct {v0}, Lcom/stripe/android/paymentelement/embedded/content/NullUiDefinitionFactoryHelper;-><init>()V

    sput-object v0, Lcom/stripe/android/paymentelement/embedded/content/NullUiDefinitionFactoryHelper;->INSTANCE:Lcom/stripe/android/paymentelement/embedded/content/NullUiDefinitionFactoryHelper;

    .line 13
    sget-object v0, Lcom/stripe/android/paymentelement/embedded/content/NullCardAccountRangeRepositoryFactory;->INSTANCE:Lcom/stripe/android/paymentelement/embedded/content/NullCardAccountRangeRepositoryFactory;

    .line 12
    new-instance v1, Lcom/stripe/android/lpmfoundations/paymentmethod/UiDefinitionFactory$Arguments$Factory$Default;

    .line 13
    move-object v2, v0

    check-cast v2, Lcom/stripe/android/cards/CardAccountRangeRepository$Factory;

    .line 15
    new-instance v5, Lcom/stripe/android/paymentelement/embedded/content/NullUiDefinitionFactoryHelper$$ExternalSyntheticLambda0;

    invoke-direct {v5}, Lcom/stripe/android/paymentelement/embedded/content/NullUiDefinitionFactoryHelper$$ExternalSyntheticLambda0;-><init>()V

    const/16 v12, 0x1f0

    const/4 v13, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    .line 12
    invoke-direct/range {v1 .. v13}, Lcom/stripe/android/lpmfoundations/paymentmethod/UiDefinitionFactory$Arguments$Factory$Default;-><init>(Lcom/stripe/android/cards/CardAccountRangeRepository$Factory;Lcom/stripe/android/link/LinkConfigurationCoordinator;Lcom/stripe/android/paymentsheet/LinkInlineHandler;Lkotlin/jvm/functions/Function1;Lcom/stripe/android/model/PaymentMethodCreateParams;Lcom/stripe/android/model/PaymentMethodOptionsParams;Lcom/stripe/android/model/PaymentMethodExtraParams;Lcom/stripe/android/link/ui/inline/UserInput;ZLcom/stripe/android/uicore/elements/AutocompleteAddressInteractor$Factory;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v1, Lcom/stripe/android/paymentelement/embedded/content/NullUiDefinitionFactoryHelper;->nullEmbeddedUiDefinitionFactory:Lcom/stripe/android/lpmfoundations/paymentmethod/UiDefinitionFactory$Arguments$Factory$Default;

    const/16 v0, 0x8

    sput v0, Lcom/stripe/android/paymentelement/embedded/content/NullUiDefinitionFactoryHelper;->$stable:I

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static final nullEmbeddedUiDefinitionFactory$lambda$0(Lcom/stripe/android/link/ui/inline/InlineSignupViewState;)Lkotlin/Unit;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "Not possible."

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public final getNullEmbeddedUiDefinitionFactory()Lcom/stripe/android/lpmfoundations/paymentmethod/UiDefinitionFactory$Arguments$Factory$Default;
    .locals 1

    .line 12
    sget-object v0, Lcom/stripe/android/paymentelement/embedded/content/NullUiDefinitionFactoryHelper;->nullEmbeddedUiDefinitionFactory:Lcom/stripe/android/lpmfoundations/paymentmethod/UiDefinitionFactory$Arguments$Factory$Default;

    return-object v0
.end method
