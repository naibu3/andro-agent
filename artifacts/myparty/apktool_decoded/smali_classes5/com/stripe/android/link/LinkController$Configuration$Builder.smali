.class public final Lcom/stripe/android/link/LinkController$Configuration$Builder;
.super Ljava/lang/Object;
.source "LinkController.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/link/LinkController$Configuration;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nLinkController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LinkController.kt\ncom/stripe/android/link/LinkController$Configuration$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,571:1\n1#2:572\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u000e\u0010\u0008\u001a\u00020\u00002\u0006\u0010\u0008\u001a\u00020\tJ\u0010\u0010\n\u001a\u00020\u00002\u0008\u0010\n\u001a\u0004\u0018\u00010\u000bJ\u000e\u0010\u000c\u001a\u00020\u00002\u0006\u0010\u000c\u001a\u00020\rJ\u000e\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u000fJ\u0006\u0010\u0010\u001a\u00020\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0008\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000c\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"
    }
    d2 = {
        "Lcom/stripe/android/link/LinkController$Configuration$Builder;",
        "",
        "merchantDisplayName",
        "",
        "appearance",
        "Lcom/stripe/android/link/model/LinkAppearance;",
        "<init>",
        "(Ljava/lang/String;Lcom/stripe/android/link/model/LinkAppearance;)V",
        "cardBrandAcceptance",
        "Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance;",
        "defaultBillingDetails",
        "Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;",
        "billingDetailsCollectionConfiguration",
        "Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;",
        "allowUserEmailEdits",
        "",
        "build",
        "Lcom/stripe/android/link/LinkController$Configuration;",
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
.field private allowUserEmailEdits:Z

.field private final appearance:Lcom/stripe/android/link/model/LinkAppearance;

.field private billingDetailsCollectionConfiguration:Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;

.field private cardBrandAcceptance:Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance;

.field private defaultBillingDetails:Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;

.field private final merchantDisplayName:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lcom/stripe/android/link/model/LinkAppearance;)V
    .locals 1

    const-string v0, "merchantDisplayName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 145
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 149
    iput-object p1, p0, Lcom/stripe/android/link/LinkController$Configuration$Builder;->merchantDisplayName:Ljava/lang/String;

    .line 150
    iput-object p2, p0, Lcom/stripe/android/link/LinkController$Configuration$Builder;->appearance:Lcom/stripe/android/link/model/LinkAppearance;

    .line 153
    sget-object p1, Lcom/stripe/android/common/configuration/ConfigurationDefaults;->INSTANCE:Lcom/stripe/android/common/configuration/ConfigurationDefaults;

    invoke-virtual {p1}, Lcom/stripe/android/common/configuration/ConfigurationDefaults;->getCardBrandAcceptance()Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/link/LinkController$Configuration$Builder;->cardBrandAcceptance:Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance;

    .line 155
    sget-object p1, Lcom/stripe/android/common/configuration/ConfigurationDefaults;->INSTANCE:Lcom/stripe/android/common/configuration/ConfigurationDefaults;

    invoke-virtual {p1}, Lcom/stripe/android/common/configuration/ConfigurationDefaults;->getBillingDetails()Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/link/LinkController$Configuration$Builder;->defaultBillingDetails:Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;

    .line 157
    sget-object p1, Lcom/stripe/android/common/configuration/ConfigurationDefaults;->INSTANCE:Lcom/stripe/android/common/configuration/ConfigurationDefaults;

    invoke-virtual {p1}, Lcom/stripe/android/common/configuration/ConfigurationDefaults;->getBillingDetailsCollectionConfiguration()Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/link/LinkController$Configuration$Builder;->billingDetailsCollectionConfiguration:Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;

    const/4 p1, 0x1

    .line 158
    iput-boolean p1, p0, Lcom/stripe/android/link/LinkController$Configuration$Builder;->allowUserEmailEdits:Z

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Lcom/stripe/android/link/model/LinkAppearance;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    .line 145
    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/stripe/android/link/LinkController$Configuration$Builder;-><init>(Ljava/lang/String;Lcom/stripe/android/link/model/LinkAppearance;)V

    return-void
.end method


# virtual methods
.method public final allowUserEmailEdits(Z)Lcom/stripe/android/link/LinkController$Configuration$Builder;
    .locals 1

    .line 202
    move-object v0, p0

    check-cast v0, Lcom/stripe/android/link/LinkController$Configuration$Builder;

    .line 203
    iput-boolean p1, p0, Lcom/stripe/android/link/LinkController$Configuration$Builder;->allowUserEmailEdits:Z

    return-object p0
.end method

.method public final billingDetailsCollectionConfiguration(Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;)Lcom/stripe/android/link/LinkController$Configuration$Builder;
    .locals 1

    const-string v0, "billingDetailsCollectionConfiguration"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 192
    move-object v0, p0

    check-cast v0, Lcom/stripe/android/link/LinkController$Configuration$Builder;

    .line 193
    iput-object p1, p0, Lcom/stripe/android/link/LinkController$Configuration$Builder;->billingDetailsCollectionConfiguration:Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;

    return-object p0
.end method

.method public final build()Lcom/stripe/android/link/LinkController$Configuration;
    .locals 7

    .line 212
    iget-boolean v5, p0, Lcom/stripe/android/link/LinkController$Configuration$Builder;->allowUserEmailEdits:Z

    .line 213
    iget-object v1, p0, Lcom/stripe/android/link/LinkController$Configuration$Builder;->merchantDisplayName:Ljava/lang/String;

    .line 214
    iget-object v2, p0, Lcom/stripe/android/link/LinkController$Configuration$Builder;->cardBrandAcceptance:Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance;

    .line 215
    iget-object v3, p0, Lcom/stripe/android/link/LinkController$Configuration$Builder;->defaultBillingDetails:Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;

    .line 216
    iget-object v4, p0, Lcom/stripe/android/link/LinkController$Configuration$Builder;->billingDetailsCollectionConfiguration:Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;

    .line 217
    iget-object v6, p0, Lcom/stripe/android/link/LinkController$Configuration$Builder;->appearance:Lcom/stripe/android/link/model/LinkAppearance;

    .line 211
    new-instance v0, Lcom/stripe/android/link/LinkController$Configuration;

    invoke-direct/range {v0 .. v6}, Lcom/stripe/android/link/LinkController$Configuration;-><init>(Ljava/lang/String;Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance;Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;ZLcom/stripe/android/link/model/LinkAppearance;)V

    return-object v0
.end method

.method public final cardBrandAcceptance(Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance;)Lcom/stripe/android/link/LinkController$Configuration$Builder;
    .locals 1

    const-string v0, "cardBrandAcceptance"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 169
    move-object v0, p0

    check-cast v0, Lcom/stripe/android/link/LinkController$Configuration$Builder;

    .line 170
    iput-object p1, p0, Lcom/stripe/android/link/LinkController$Configuration$Builder;->cardBrandAcceptance:Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance;

    return-object p0
.end method

.method public final defaultBillingDetails(Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;)Lcom/stripe/android/link/LinkController$Configuration$Builder;
    .locals 1

    .line 182
    move-object v0, p0

    check-cast v0, Lcom/stripe/android/link/LinkController$Configuration$Builder;

    iput-object p1, p0, Lcom/stripe/android/link/LinkController$Configuration$Builder;->defaultBillingDetails:Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;

    return-object p0
.end method
