.class public final Lcom/stripe/android/customersheet/CustomerAdapter$Companion;
.super Ljava/lang/Object;
.source "CustomerAdapter.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/customersheet/CustomerAdapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J4\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\t2\u0008\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0010\u0008\u0002\u0010\u000c\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rH\u0007\u00a8\u0006\u000f"
    }
    d2 = {
        "Lcom/stripe/android/customersheet/CustomerAdapter$Companion;",
        "",
        "<init>",
        "()V",
        "create",
        "Lcom/stripe/android/customersheet/CustomerAdapter;",
        "context",
        "Landroid/content/Context;",
        "customerEphemeralKeyProvider",
        "Lcom/stripe/android/customersheet/CustomerEphemeralKeyProvider;",
        "setupIntentClientSecretProvider",
        "Lcom/stripe/android/customersheet/SetupIntentClientSecretProvider;",
        "paymentMethodTypes",
        "",
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
.field static final synthetic $$INSTANCE:Lcom/stripe/android/customersheet/CustomerAdapter$Companion;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/customersheet/CustomerAdapter$Companion;

    invoke-direct {v0}, Lcom/stripe/android/customersheet/CustomerAdapter$Companion;-><init>()V

    sput-object v0, Lcom/stripe/android/customersheet/CustomerAdapter$Companion;->$$INSTANCE:Lcom/stripe/android/customersheet/CustomerAdapter$Companion;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 94
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic create$default(Lcom/stripe/android/customersheet/CustomerAdapter$Companion;Landroid/content/Context;Lcom/stripe/android/customersheet/CustomerEphemeralKeyProvider;Lcom/stripe/android/customersheet/SetupIntentClientSecretProvider;Ljava/util/List;ILjava/lang/Object;)Lcom/stripe/android/customersheet/CustomerAdapter;
    .locals 0

    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_0

    const/4 p4, 0x0

    .line 113
    :cond_0
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/stripe/android/customersheet/CustomerAdapter$Companion;->create(Landroid/content/Context;Lcom/stripe/android/customersheet/CustomerEphemeralKeyProvider;Lcom/stripe/android/customersheet/SetupIntentClientSecretProvider;Ljava/util/List;)Lcom/stripe/android/customersheet/CustomerAdapter;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final create(Landroid/content/Context;Lcom/stripe/android/customersheet/CustomerEphemeralKeyProvider;Lcom/stripe/android/customersheet/SetupIntentClientSecretProvider;)Lcom/stripe/android/customersheet/CustomerAdapter;
    .locals 8
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "customerEphemeralKeyProvider"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v6, 0x8

    const/4 v7, 0x0

    const/4 v5, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    invoke-static/range {v1 .. v7}, Lcom/stripe/android/customersheet/CustomerAdapter$Companion;->create$default(Lcom/stripe/android/customersheet/CustomerAdapter$Companion;Landroid/content/Context;Lcom/stripe/android/customersheet/CustomerEphemeralKeyProvider;Lcom/stripe/android/customersheet/SetupIntentClientSecretProvider;Ljava/util/List;ILjava/lang/Object;)Lcom/stripe/android/customersheet/CustomerAdapter;

    move-result-object p1

    return-object p1
.end method

.method public final create(Landroid/content/Context;Lcom/stripe/android/customersheet/CustomerEphemeralKeyProvider;Lcom/stripe/android/customersheet/SetupIntentClientSecretProvider;Ljava/util/List;)Lcom/stripe/android/customersheet/CustomerAdapter;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/stripe/android/customersheet/CustomerEphemeralKeyProvider;",
            "Lcom/stripe/android/customersheet/SetupIntentClientSecretProvider;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/stripe/android/customersheet/CustomerAdapter;"
        }
    .end annotation

    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "customerEphemeralKeyProvider"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 121
    invoke-static {}, Lcom/stripe/android/customersheet/injection/DaggerStripeCustomerAdapterComponent;->builder()Lcom/stripe/android/customersheet/injection/StripeCustomerAdapterComponent$Builder;

    move-result-object v0

    .line 122
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    const-string v1, "getApplicationContext(...)"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0, p1}, Lcom/stripe/android/customersheet/injection/StripeCustomerAdapterComponent$Builder;->context(Landroid/content/Context;)Lcom/stripe/android/customersheet/injection/StripeCustomerAdapterComponent$Builder;

    move-result-object p1

    .line 123
    invoke-interface {p1, p2}, Lcom/stripe/android/customersheet/injection/StripeCustomerAdapterComponent$Builder;->customerEphemeralKeyProvider(Lcom/stripe/android/customersheet/CustomerEphemeralKeyProvider;)Lcom/stripe/android/customersheet/injection/StripeCustomerAdapterComponent$Builder;

    move-result-object p1

    .line 124
    invoke-interface {p1, p3}, Lcom/stripe/android/customersheet/injection/StripeCustomerAdapterComponent$Builder;->setupIntentClientSecretProvider(Lcom/stripe/android/customersheet/SetupIntentClientSecretProvider;)Lcom/stripe/android/customersheet/injection/StripeCustomerAdapterComponent$Builder;

    move-result-object p1

    .line 125
    invoke-interface {p1, p4}, Lcom/stripe/android/customersheet/injection/StripeCustomerAdapterComponent$Builder;->paymentMethodTypes(Ljava/util/List;)Lcom/stripe/android/customersheet/injection/StripeCustomerAdapterComponent$Builder;

    move-result-object p1

    .line 126
    invoke-interface {p1}, Lcom/stripe/android/customersheet/injection/StripeCustomerAdapterComponent$Builder;->build()Lcom/stripe/android/customersheet/injection/StripeCustomerAdapterComponent;

    move-result-object p1

    .line 127
    invoke-interface {p1}, Lcom/stripe/android/customersheet/injection/StripeCustomerAdapterComponent;->getStripeCustomerAdapter()Lcom/stripe/android/customersheet/StripeCustomerAdapter;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/customersheet/CustomerAdapter;

    return-object p1
.end method
