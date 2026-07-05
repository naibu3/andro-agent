.class final Lcom/stripe/android/paymentelement/embedded/content/NullCardAccountRangeRepositoryFactory;
.super Ljava/lang/Object;
.source "NullUiDefinitionFactoryHelper.kt"

# interfaces
.implements Lcom/stripe/android/cards/CardAccountRangeRepository$Factory;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/paymentelement/embedded/content/NullCardAccountRangeRepositoryFactory$NullCardAccountRangeRepository;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\u0008\u00c2\u0002\u0018\u00002\u00020\u0001:\u0001\u000bB\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0008\u0010\u0004\u001a\u00020\u0005H\u0016J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\nH\u0016\u00a8\u0006\u000c"
    }
    d2 = {
        "Lcom/stripe/android/paymentelement/embedded/content/NullCardAccountRangeRepositoryFactory;",
        "Lcom/stripe/android/cards/CardAccountRangeRepository$Factory;",
        "<init>",
        "()V",
        "create",
        "Lcom/stripe/android/cards/CardAccountRangeRepository;",
        "createWithStripeRepository",
        "stripeRepository",
        "Lcom/stripe/android/networking/StripeRepository;",
        "publishableKey",
        "",
        "NullCardAccountRangeRepository",
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
.field public static final INSTANCE:Lcom/stripe/android/paymentelement/embedded/content/NullCardAccountRangeRepositoryFactory;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/paymentelement/embedded/content/NullCardAccountRangeRepositoryFactory;

    invoke-direct {v0}, Lcom/stripe/android/paymentelement/embedded/content/NullCardAccountRangeRepositoryFactory;-><init>()V

    sput-object v0, Lcom/stripe/android/paymentelement/embedded/content/NullCardAccountRangeRepositoryFactory;->INSTANCE:Lcom/stripe/android/paymentelement/embedded/content/NullCardAccountRangeRepositoryFactory;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public create()Lcom/stripe/android/cards/CardAccountRangeRepository;
    .locals 1

    .line 25
    sget-object v0, Lcom/stripe/android/paymentelement/embedded/content/NullCardAccountRangeRepositoryFactory$NullCardAccountRangeRepository;->INSTANCE:Lcom/stripe/android/paymentelement/embedded/content/NullCardAccountRangeRepositoryFactory$NullCardAccountRangeRepository;

    check-cast v0, Lcom/stripe/android/cards/CardAccountRangeRepository;

    return-object v0
.end method

.method public createWithStripeRepository(Lcom/stripe/android/networking/StripeRepository;Ljava/lang/String;)Lcom/stripe/android/cards/CardAccountRangeRepository;
    .locals 1

    const-string v0, "stripeRepository"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "publishableKey"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 32
    sget-object p1, Lcom/stripe/android/paymentelement/embedded/content/NullCardAccountRangeRepositoryFactory$NullCardAccountRangeRepository;->INSTANCE:Lcom/stripe/android/paymentelement/embedded/content/NullCardAccountRangeRepositoryFactory$NullCardAccountRangeRepository;

    check-cast p1, Lcom/stripe/android/cards/CardAccountRangeRepository;

    return-object p1
.end method
