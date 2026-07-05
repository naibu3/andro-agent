.class public final Lcom/stripe/android/lpmfoundations/paymentmethod/definitions/AmazonPayDefinition;
.super Ljava/lang/Object;
.source "AmazonPayDefinition.kt"

# interfaces
.implements Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodDefinition;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u00c1\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0016\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0011\u001a\u00020\tH\u0016J\u0010\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0008\u0010\u0015\u001a\u00020\u0016H\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007R\u0014\u0010\u0008\u001a\u00020\tX\u0096D\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bR\u0014\u0010\u000c\u001a\u00020\tX\u0096D\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000b\u00a8\u0006\u0017"
    }
    d2 = {
        "Lcom/stripe/android/lpmfoundations/paymentmethod/definitions/AmazonPayDefinition;",
        "Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodDefinition;",
        "<init>",
        "()V",
        "type",
        "Lcom/stripe/android/model/PaymentMethod$Type;",
        "getType",
        "()Lcom/stripe/android/model/PaymentMethod$Type;",
        "supportedAsSavedPaymentMethod",
        "",
        "getSupportedAsSavedPaymentMethod",
        "()Z",
        "supportsTermDisplayConfiguration",
        "getSupportsTermDisplayConfiguration",
        "requirementsToBeUsedAsNewPaymentMethod",
        "",
        "Lcom/stripe/android/lpmfoundations/paymentmethod/AddPaymentMethodRequirement;",
        "hasIntentToSetup",
        "requiresMandate",
        "metadata",
        "Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;",
        "uiDefinitionFactory",
        "Lcom/stripe/android/lpmfoundations/paymentmethod/UiDefinitionFactory;",
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

.field public static final INSTANCE:Lcom/stripe/android/lpmfoundations/paymentmethod/definitions/AmazonPayDefinition;

.field private static final supportedAsSavedPaymentMethod:Z

.field private static final supportsTermDisplayConfiguration:Z

.field private static final type:Lcom/stripe/android/model/PaymentMethod$Type;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/lpmfoundations/paymentmethod/definitions/AmazonPayDefinition;

    invoke-direct {v0}, Lcom/stripe/android/lpmfoundations/paymentmethod/definitions/AmazonPayDefinition;-><init>()V

    sput-object v0, Lcom/stripe/android/lpmfoundations/paymentmethod/definitions/AmazonPayDefinition;->INSTANCE:Lcom/stripe/android/lpmfoundations/paymentmethod/definitions/AmazonPayDefinition;

    .line 17
    sget-object v0, Lcom/stripe/android/model/PaymentMethod$Type;->AmazonPay:Lcom/stripe/android/model/PaymentMethod$Type;

    sput-object v0, Lcom/stripe/android/lpmfoundations/paymentmethod/definitions/AmazonPayDefinition;->type:Lcom/stripe/android/model/PaymentMethod$Type;

    const/4 v0, 0x1

    .line 21
    sput-boolean v0, Lcom/stripe/android/lpmfoundations/paymentmethod/definitions/AmazonPayDefinition;->supportsTermDisplayConfiguration:Z

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getSupportedAsSavedPaymentMethod()Z
    .locals 1

    .line 19
    sget-boolean v0, Lcom/stripe/android/lpmfoundations/paymentmethod/definitions/AmazonPayDefinition;->supportedAsSavedPaymentMethod:Z

    return v0
.end method

.method public getSupportsTermDisplayConfiguration()Z
    .locals 1

    .line 21
    sget-boolean v0, Lcom/stripe/android/lpmfoundations/paymentmethod/definitions/AmazonPayDefinition;->supportsTermDisplayConfiguration:Z

    return v0
.end method

.method public getType()Lcom/stripe/android/model/PaymentMethod$Type;
    .locals 1

    .line 17
    sget-object v0, Lcom/stripe/android/lpmfoundations/paymentmethod/definitions/AmazonPayDefinition;->type:Lcom/stripe/android/model/PaymentMethod$Type;

    return-object v0
.end method

.method public requirementsToBeUsedAsNewPaymentMethod(Z)Ljava/util/Set;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)",
            "Ljava/util/Set<",
            "Lcom/stripe/android/lpmfoundations/paymentmethod/AddPaymentMethodRequirement;",
            ">;"
        }
    .end annotation

    .line 25
    invoke-static {}, Lkotlin/collections/SetsKt;->emptySet()Ljava/util/Set;

    move-result-object p1

    return-object p1
.end method

.method public requiresMandate(Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;)Z
    .locals 1

    const-string v0, "metadata"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    invoke-virtual {p0}, Lcom/stripe/android/lpmfoundations/paymentmethod/definitions/AmazonPayDefinition;->getType()Lcom/stripe/android/model/PaymentMethod$Type;

    move-result-object v0

    iget-object v0, v0, Lcom/stripe/android/model/PaymentMethod$Type;->code:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->hasIntentToSetup(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/stripe/android/lpmfoundations/paymentmethod/definitions/AmazonPayDefinition;->getType()Lcom/stripe/android/model/PaymentMethod$Type;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->mandateAllowed(Lcom/stripe/android/model/PaymentMethod$Type;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public uiDefinitionFactory()Lcom/stripe/android/lpmfoundations/paymentmethod/UiDefinitionFactory;
    .locals 1

    .line 31
    sget-object v0, Lcom/stripe/android/lpmfoundations/paymentmethod/definitions/AmazonPayUiDefinitionFactory;->INSTANCE:Lcom/stripe/android/lpmfoundations/paymentmethod/definitions/AmazonPayUiDefinitionFactory;

    check-cast v0, Lcom/stripe/android/lpmfoundations/paymentmethod/UiDefinitionFactory;

    return-object v0
.end method
