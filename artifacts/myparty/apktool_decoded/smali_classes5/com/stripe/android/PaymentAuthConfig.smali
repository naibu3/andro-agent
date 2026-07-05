.class public final Lcom/stripe/android/PaymentAuthConfig;
.super Ljava/lang/Object;
.source "PaymentAuthConfig.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/PaymentAuthConfig$Builder;,
        Lcom/stripe/android/PaymentAuthConfig$Companion;,
        Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2ButtonCustomization;,
        Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2Config;,
        Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2LabelCustomization;,
        Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2TextBoxCustomization;,
        Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2ToolbarCustomization;,
        Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2UiCustomization;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\r\u0008\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0008\u0008\t\n\u000b\u000c\r\u000e\u000fB\u0011\u0008\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0010"
    }
    d2 = {
        "Lcom/stripe/android/PaymentAuthConfig;",
        "",
        "stripe3ds2Config",
        "Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2Config;",
        "<init>",
        "(Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2Config;)V",
        "getStripe3ds2Config$payments_core_release",
        "()Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2Config;",
        "Builder",
        "Stripe3ds2Config",
        "Stripe3ds2ButtonCustomization",
        "Stripe3ds2LabelCustomization",
        "Stripe3ds2TextBoxCustomization",
        "Stripe3ds2ToolbarCustomization",
        "Stripe3ds2UiCustomization",
        "Companion",
        "payments-core_release"
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

.field public static final Companion:Lcom/stripe/android/PaymentAuthConfig$Companion;

.field private static final DEFAULT:Lcom/stripe/android/PaymentAuthConfig;

.field private static instance:Lcom/stripe/android/PaymentAuthConfig;


# instance fields
.field private final stripe3ds2Config:Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2Config;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/PaymentAuthConfig$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/PaymentAuthConfig$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/PaymentAuthConfig;->Companion:Lcom/stripe/android/PaymentAuthConfig$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/stripe/android/PaymentAuthConfig;->$stable:I

    .line 570
    new-instance v0, Lcom/stripe/android/PaymentAuthConfig$Builder;

    invoke-direct {v0}, Lcom/stripe/android/PaymentAuthConfig$Builder;-><init>()V

    .line 571
    new-instance v1, Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2Config$Builder;

    invoke-direct {v1}, Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2Config$Builder;-><init>()V

    invoke-virtual {v1}, Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2Config$Builder;->build()Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2Config;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/stripe/android/PaymentAuthConfig$Builder;->set3ds2Config(Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2Config;)Lcom/stripe/android/PaymentAuthConfig$Builder;

    move-result-object v0

    .line 572
    invoke-virtual {v0}, Lcom/stripe/android/PaymentAuthConfig$Builder;->build()Lcom/stripe/android/PaymentAuthConfig;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/PaymentAuthConfig;->DEFAULT:Lcom/stripe/android/PaymentAuthConfig;

    return-void
.end method

.method private constructor <init>(Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2Config;)V
    .locals 0

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    iput-object p1, p0, Lcom/stripe/android/PaymentAuthConfig;->stripe3ds2Config:Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2Config;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2Config;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/stripe/android/PaymentAuthConfig;-><init>(Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2Config;)V

    return-void
.end method

.method public static final synthetic access$getDEFAULT$cp()Lcom/stripe/android/PaymentAuthConfig;
    .locals 1

    .line 21
    sget-object v0, Lcom/stripe/android/PaymentAuthConfig;->DEFAULT:Lcom/stripe/android/PaymentAuthConfig;

    return-object v0
.end method

.method public static final synthetic access$getInstance$cp()Lcom/stripe/android/PaymentAuthConfig;
    .locals 1

    .line 21
    sget-object v0, Lcom/stripe/android/PaymentAuthConfig;->instance:Lcom/stripe/android/PaymentAuthConfig;

    return-object v0
.end method

.method public static final synthetic access$setInstance$cp(Lcom/stripe/android/PaymentAuthConfig;)V
    .locals 0

    .line 21
    sput-object p0, Lcom/stripe/android/PaymentAuthConfig;->instance:Lcom/stripe/android/PaymentAuthConfig;

    return-void
.end method

.method public static final get()Lcom/stripe/android/PaymentAuthConfig;
    .locals 1
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    sget-object v0, Lcom/stripe/android/PaymentAuthConfig;->Companion:Lcom/stripe/android/PaymentAuthConfig$Companion;

    invoke-virtual {v0}, Lcom/stripe/android/PaymentAuthConfig$Companion;->get()Lcom/stripe/android/PaymentAuthConfig;

    move-result-object v0

    return-object v0
.end method

.method public static final init(Lcom/stripe/android/PaymentAuthConfig;)V
    .locals 1
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    sget-object v0, Lcom/stripe/android/PaymentAuthConfig;->Companion:Lcom/stripe/android/PaymentAuthConfig$Companion;

    invoke-virtual {v0, p0}, Lcom/stripe/android/PaymentAuthConfig$Companion;->init(Lcom/stripe/android/PaymentAuthConfig;)V

    return-void
.end method


# virtual methods
.method public final getStripe3ds2Config$payments_core_release()Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2Config;
    .locals 1

    .line 22
    iget-object v0, p0, Lcom/stripe/android/PaymentAuthConfig;->stripe3ds2Config:Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2Config;

    return-object v0
.end method
