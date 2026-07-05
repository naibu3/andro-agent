.class public final Lcom/stripe/android/customersheet/injection/CustomerSheetDataCommonModule$Companion;
.super Ljava/lang/Object;
.source "CustomerSheetDataCommonModule.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/customersheet/injection/CustomerSheetDataCommonModule;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u001c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\n0\t2\u000c\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u000cH\u0007J\u001e\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t2\u000c\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u000cH\u0007J\u000e\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\n0\u000fH\u0007J\u0008\u0010\u0010\u001a\u00020\u0011H\u0007J\u000e\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00130\tH\u0007\u00a8\u0006\u0014"
    }
    d2 = {
        "Lcom/stripe/android/customersheet/injection/CustomerSheetDataCommonModule$Companion;",
        "",
        "<init>",
        "()V",
        "providePaymentConfiguration",
        "Lcom/stripe/android/PaymentConfiguration;",
        "appContext",
        "Landroid/content/Context;",
        "providePublishableKey",
        "Lkotlin/Function0;",
        "",
        "paymentConfiguration",
        "Ljavax/inject/Provider;",
        "provideStripeAccountId",
        "providesProductUsage",
        "",
        "providesEnableLogging",
        "",
        "provideTimeProvider",
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
.field static final synthetic $$INSTANCE:Lcom/stripe/android/customersheet/injection/CustomerSheetDataCommonModule$Companion;


# direct methods
.method public static synthetic $r8$lambda$2NdsdMOmBoD2fOlgAb-3sPwwRWA()J
    .locals 2

    invoke-static {}, Lcom/stripe/android/customersheet/injection/CustomerSheetDataCommonModule$Companion;->provideTimeProvider$lambda$2()J

    move-result-wide v0

    return-wide v0
.end method

.method public static synthetic $r8$lambda$Mwnx4aJa9qooQbCmgXtJbavlV_Q(Ljavax/inject/Provider;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/customersheet/injection/CustomerSheetDataCommonModule$Companion;->provideStripeAccountId$lambda$1(Ljavax/inject/Provider;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$x4wN3ekeocXoiFAoBPL_BTCwqQg(Ljavax/inject/Provider;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/customersheet/injection/CustomerSheetDataCommonModule$Companion;->providePublishableKey$lambda$0(Ljavax/inject/Provider;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/customersheet/injection/CustomerSheetDataCommonModule$Companion;

    invoke-direct {v0}, Lcom/stripe/android/customersheet/injection/CustomerSheetDataCommonModule$Companion;-><init>()V

    sput-object v0, Lcom/stripe/android/customersheet/injection/CustomerSheetDataCommonModule$Companion;->$$INSTANCE:Lcom/stripe/android/customersheet/injection/CustomerSheetDataCommonModule$Companion;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static final providePublishableKey$lambda$0(Ljavax/inject/Provider;)Ljava/lang/String;
    .locals 0

    .line 54
    invoke-interface {p0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/stripe/android/PaymentConfiguration;

    invoke-virtual {p0}, Lcom/stripe/android/PaymentConfiguration;->getPublishableKey()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static final provideStripeAccountId$lambda$1(Ljavax/inject/Provider;)Ljava/lang/String;
    .locals 0

    .line 60
    invoke-interface {p0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/stripe/android/PaymentConfiguration;

    invoke-virtual {p0}, Lcom/stripe/android/PaymentConfiguration;->getStripeAccountId()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static final provideTimeProvider$lambda$2()J
    .locals 2

    .line 72
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v0

    return-wide v0
.end method


# virtual methods
.method public final providePaymentConfiguration(Landroid/content/Context;)Lcom/stripe/android/PaymentConfiguration;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    const-string v0, "appContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 47
    sget-object v0, Lcom/stripe/android/PaymentConfiguration;->Companion:Lcom/stripe/android/PaymentConfiguration$Companion;

    invoke-virtual {v0, p1}, Lcom/stripe/android/PaymentConfiguration$Companion;->getInstance(Landroid/content/Context;)Lcom/stripe/android/PaymentConfiguration;

    move-result-object p1

    return-object p1
.end method

.method public final providePublishableKey(Ljavax/inject/Provider;)Lkotlin/jvm/functions/Function0;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/stripe/android/PaymentConfiguration;",
            ">;)",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation runtime Ljavax/inject/Named;
        value = "publishableKey"
    .end annotation

    const-string v0, "paymentConfiguration"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 54
    new-instance v0, Lcom/stripe/android/customersheet/injection/CustomerSheetDataCommonModule$Companion$$ExternalSyntheticLambda0;

    invoke-direct {v0, p1}, Lcom/stripe/android/customersheet/injection/CustomerSheetDataCommonModule$Companion$$ExternalSyntheticLambda0;-><init>(Ljavax/inject/Provider;)V

    return-object v0
.end method

.method public final provideStripeAccountId(Ljavax/inject/Provider;)Lkotlin/jvm/functions/Function0;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/stripe/android/PaymentConfiguration;",
            ">;)",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation runtime Ljavax/inject/Named;
        value = "stripeAccountId"
    .end annotation

    const-string v0, "paymentConfiguration"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 60
    new-instance v0, Lcom/stripe/android/customersheet/injection/CustomerSheetDataCommonModule$Companion$$ExternalSyntheticLambda2;

    invoke-direct {v0, p1}, Lcom/stripe/android/customersheet/injection/CustomerSheetDataCommonModule$Companion$$ExternalSyntheticLambda2;-><init>(Ljavax/inject/Provider;)V

    return-object v0
.end method

.method public final provideTimeProvider()Lkotlin/jvm/functions/Function0;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/stripe/android/customersheet/injection/CustomerSheetDataCommonModule$Companion$$ExternalSyntheticLambda1;

    invoke-direct {v0}, Lcom/stripe/android/customersheet/injection/CustomerSheetDataCommonModule$Companion$$ExternalSyntheticLambda1;-><init>()V

    return-object v0
.end method

.method public final providesEnableLogging()Z
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ljavax/inject/Named;
        value = "enableLogging"
    .end annotation

    const/4 v0, 0x0

    return v0
.end method

.method public final providesProductUsage()Ljava/util/Set;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation runtime Ljavax/inject/Named;
        value = "productUsage"
    .end annotation

    .line 64
    const-string v0, "CustomerSheet"

    invoke-static {v0}, Lkotlin/collections/SetsKt;->setOf(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method
