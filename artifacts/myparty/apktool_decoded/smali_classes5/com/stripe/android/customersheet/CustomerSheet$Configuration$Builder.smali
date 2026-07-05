.class public final Lcom/stripe/android/customersheet/CustomerSheet$Configuration$Builder;
.super Ljava/lang/Object;
.source "CustomerSheet.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/customersheet/CustomerSheet$Configuration;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\u0008\u0007\u0018\u00002\u00020\u0001B\u0011\u0008\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u000e\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\u0008\u001a\u00020\u00002\u0006\u0010\u0008\u001a\u00020\tJ\u0010\u0010\n\u001a\u00020\u00002\u0008\u0010\n\u001a\u0004\u0018\u00010\u0003J\u000e\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u000cJ\u000e\u0010\r\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u000eJ\u0014\u0010\u000f\u001a\u00020\u00002\u000c\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u00110\u0010J\u0010\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\tH\u0007J\u0014\u0010\u0013\u001a\u00020\u00002\u000c\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0010J\u000e\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0015J\u0006\u0010\u0018\u001a\u00020\u0019R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0008\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u000cX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u00110\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"
    }
    d2 = {
        "Lcom/stripe/android/customersheet/CustomerSheet$Configuration$Builder;",
        "",
        "merchantDisplayName",
        "",
        "<init>",
        "(Ljava/lang/String;)V",
        "appearance",
        "Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;",
        "googlePayEnabled",
        "",
        "headerTextForSelectionScreen",
        "defaultBillingDetails",
        "Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;",
        "billingDetailsCollectionConfiguration",
        "Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;",
        "preferredNetworks",
        "",
        "Lcom/stripe/android/model/CardBrand;",
        "allowsRemovalOfLastSavedPaymentMethod",
        "paymentMethodOrder",
        "cardBrandAcceptance",
        "Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance;",
        "details",
        "configuration",
        "build",
        "Lcom/stripe/android/customersheet/CustomerSheet$Configuration;",
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
.field private allowsRemovalOfLastSavedPaymentMethod:Z

.field private appearance:Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;

.field private billingDetailsCollectionConfiguration:Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;

.field private cardBrandAcceptance:Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance;

.field private defaultBillingDetails:Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;

.field private googlePayEnabled:Z

.field private headerTextForSelectionScreen:Ljava/lang/String;

.field private final merchantDisplayName:Ljava/lang/String;

.field private paymentMethodOrder:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private preferredNetworks:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "+",
            "Lcom/stripe/android/model/CardBrand;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    const-string v0, "merchantDisplayName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 257
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/customersheet/CustomerSheet$Configuration$Builder;->merchantDisplayName:Ljava/lang/String;

    .line 258
    sget-object p1, Lcom/stripe/android/common/configuration/ConfigurationDefaults;->INSTANCE:Lcom/stripe/android/common/configuration/ConfigurationDefaults;

    invoke-virtual {p1}, Lcom/stripe/android/common/configuration/ConfigurationDefaults;->getAppearance()Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/customersheet/CustomerSheet$Configuration$Builder;->appearance:Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;

    .line 260
    sget-object p1, Lcom/stripe/android/common/configuration/ConfigurationDefaults;->INSTANCE:Lcom/stripe/android/common/configuration/ConfigurationDefaults;

    invoke-virtual {p1}, Lcom/stripe/android/common/configuration/ConfigurationDefaults;->getHeaderTextForSelectionScreen()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/customersheet/CustomerSheet$Configuration$Builder;->headerTextForSelectionScreen:Ljava/lang/String;

    .line 261
    sget-object p1, Lcom/stripe/android/common/configuration/ConfigurationDefaults;->INSTANCE:Lcom/stripe/android/common/configuration/ConfigurationDefaults;

    invoke-virtual {p1}, Lcom/stripe/android/common/configuration/ConfigurationDefaults;->getBillingDetails()Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/customersheet/CustomerSheet$Configuration$Builder;->defaultBillingDetails:Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;

    .line 263
    sget-object p1, Lcom/stripe/android/common/configuration/ConfigurationDefaults;->INSTANCE:Lcom/stripe/android/common/configuration/ConfigurationDefaults;

    invoke-virtual {p1}, Lcom/stripe/android/common/configuration/ConfigurationDefaults;->getBillingDetailsCollectionConfiguration()Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/customersheet/CustomerSheet$Configuration$Builder;->billingDetailsCollectionConfiguration:Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;

    .line 264
    sget-object p1, Lcom/stripe/android/common/configuration/ConfigurationDefaults;->INSTANCE:Lcom/stripe/android/common/configuration/ConfigurationDefaults;

    invoke-virtual {p1}, Lcom/stripe/android/common/configuration/ConfigurationDefaults;->getPreferredNetworks()Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/customersheet/CustomerSheet$Configuration$Builder;->preferredNetworks:Ljava/util/List;

    const/4 p1, 0x1

    .line 266
    iput-boolean p1, p0, Lcom/stripe/android/customersheet/CustomerSheet$Configuration$Builder;->allowsRemovalOfLastSavedPaymentMethod:Z

    .line 267
    sget-object p1, Lcom/stripe/android/common/configuration/ConfigurationDefaults;->INSTANCE:Lcom/stripe/android/common/configuration/ConfigurationDefaults;

    invoke-virtual {p1}, Lcom/stripe/android/common/configuration/ConfigurationDefaults;->getPaymentMethodOrder()Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/customersheet/CustomerSheet$Configuration$Builder;->paymentMethodOrder:Ljava/util/List;

    .line 268
    sget-object p1, Lcom/stripe/android/common/configuration/ConfigurationDefaults;->INSTANCE:Lcom/stripe/android/common/configuration/ConfigurationDefaults;

    invoke-virtual {p1}, Lcom/stripe/android/common/configuration/ConfigurationDefaults;->getCardBrandAcceptance()Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/customersheet/CustomerSheet$Configuration$Builder;->cardBrandAcceptance:Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance;

    return-void
.end method


# virtual methods
.method public final allowsRemovalOfLastSavedPaymentMethod(Z)Lcom/stripe/android/customersheet/CustomerSheet$Configuration$Builder;
    .locals 1

    .line 299
    move-object v0, p0

    check-cast v0, Lcom/stripe/android/customersheet/CustomerSheet$Configuration$Builder;

    .line 300
    iput-boolean p1, p0, Lcom/stripe/android/customersheet/CustomerSheet$Configuration$Builder;->allowsRemovalOfLastSavedPaymentMethod:Z

    return-object p0
.end method

.method public final appearance(Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;)Lcom/stripe/android/customersheet/CustomerSheet$Configuration$Builder;
    .locals 1

    const-string v0, "appearance"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 270
    move-object v0, p0

    check-cast v0, Lcom/stripe/android/customersheet/CustomerSheet$Configuration$Builder;

    .line 271
    iput-object p1, p0, Lcom/stripe/android/customersheet/CustomerSheet$Configuration$Builder;->appearance:Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;

    return-object p0
.end method

.method public final billingDetailsCollectionConfiguration(Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;)Lcom/stripe/android/customersheet/CustomerSheet$Configuration$Builder;
    .locals 1

    const-string v0, "configuration"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 288
    move-object v0, p0

    check-cast v0, Lcom/stripe/android/customersheet/CustomerSheet$Configuration$Builder;

    .line 289
    iput-object p1, p0, Lcom/stripe/android/customersheet/CustomerSheet$Configuration$Builder;->billingDetailsCollectionConfiguration:Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;

    return-object p0
.end method

.method public final build()Lcom/stripe/android/customersheet/CustomerSheet$Configuration;
    .locals 11

    .line 331
    new-instance v0, Lcom/stripe/android/customersheet/CustomerSheet$Configuration;

    .line 332
    iget-object v1, p0, Lcom/stripe/android/customersheet/CustomerSheet$Configuration$Builder;->appearance:Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;

    .line 333
    iget-boolean v2, p0, Lcom/stripe/android/customersheet/CustomerSheet$Configuration$Builder;->googlePayEnabled:Z

    .line 334
    iget-object v3, p0, Lcom/stripe/android/customersheet/CustomerSheet$Configuration$Builder;->headerTextForSelectionScreen:Ljava/lang/String;

    .line 335
    iget-object v4, p0, Lcom/stripe/android/customersheet/CustomerSheet$Configuration$Builder;->defaultBillingDetails:Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;

    .line 336
    iget-object v5, p0, Lcom/stripe/android/customersheet/CustomerSheet$Configuration$Builder;->billingDetailsCollectionConfiguration:Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;

    .line 337
    iget-object v6, p0, Lcom/stripe/android/customersheet/CustomerSheet$Configuration$Builder;->merchantDisplayName:Ljava/lang/String;

    .line 338
    iget-object v7, p0, Lcom/stripe/android/customersheet/CustomerSheet$Configuration$Builder;->preferredNetworks:Ljava/util/List;

    .line 339
    iget-boolean v8, p0, Lcom/stripe/android/customersheet/CustomerSheet$Configuration$Builder;->allowsRemovalOfLastSavedPaymentMethod:Z

    .line 340
    iget-object v9, p0, Lcom/stripe/android/customersheet/CustomerSheet$Configuration$Builder;->paymentMethodOrder:Ljava/util/List;

    .line 341
    iget-object v10, p0, Lcom/stripe/android/customersheet/CustomerSheet$Configuration$Builder;->cardBrandAcceptance:Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance;

    .line 331
    invoke-direct/range {v0 .. v10}, Lcom/stripe/android/customersheet/CustomerSheet$Configuration;-><init>(Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;ZLjava/lang/String;Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;Ljava/lang/String;Ljava/util/List;ZLjava/util/List;Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance;)V

    return-object v0
.end method

.method public final cardBrandAcceptance(Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance;)Lcom/stripe/android/customersheet/CustomerSheet$Configuration$Builder;
    .locals 1

    const-string v0, "cardBrandAcceptance"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 327
    move-object v0, p0

    check-cast v0, Lcom/stripe/android/customersheet/CustomerSheet$Configuration$Builder;

    .line 328
    iput-object p1, p0, Lcom/stripe/android/customersheet/CustomerSheet$Configuration$Builder;->cardBrandAcceptance:Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance;

    return-object p0
.end method

.method public final defaultBillingDetails(Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;)Lcom/stripe/android/customersheet/CustomerSheet$Configuration$Builder;
    .locals 1

    const-string v0, "details"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 282
    move-object v0, p0

    check-cast v0, Lcom/stripe/android/customersheet/CustomerSheet$Configuration$Builder;

    .line 283
    iput-object p1, p0, Lcom/stripe/android/customersheet/CustomerSheet$Configuration$Builder;->defaultBillingDetails:Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;

    return-object p0
.end method

.method public final googlePayEnabled(Z)Lcom/stripe/android/customersheet/CustomerSheet$Configuration$Builder;
    .locals 1

    .line 274
    move-object v0, p0

    check-cast v0, Lcom/stripe/android/customersheet/CustomerSheet$Configuration$Builder;

    .line 275
    iput-boolean p1, p0, Lcom/stripe/android/customersheet/CustomerSheet$Configuration$Builder;->googlePayEnabled:Z

    return-object p0
.end method

.method public final headerTextForSelectionScreen(Ljava/lang/String;)Lcom/stripe/android/customersheet/CustomerSheet$Configuration$Builder;
    .locals 1

    .line 278
    move-object v0, p0

    check-cast v0, Lcom/stripe/android/customersheet/CustomerSheet$Configuration$Builder;

    .line 279
    iput-object p1, p0, Lcom/stripe/android/customersheet/CustomerSheet$Configuration$Builder;->headerTextForSelectionScreen:Ljava/lang/String;

    return-object p0
.end method

.method public final paymentMethodOrder(Ljava/util/List;)Lcom/stripe/android/customersheet/CustomerSheet$Configuration$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/stripe/android/customersheet/CustomerSheet$Configuration$Builder;"
        }
    .end annotation

    const-string v0, "paymentMethodOrder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 314
    move-object v0, p0

    check-cast v0, Lcom/stripe/android/customersheet/CustomerSheet$Configuration$Builder;

    .line 315
    iput-object p1, p0, Lcom/stripe/android/customersheet/CustomerSheet$Configuration$Builder;->paymentMethodOrder:Ljava/util/List;

    return-object p0
.end method

.method public final preferredNetworks(Ljava/util/List;)Lcom/stripe/android/customersheet/CustomerSheet$Configuration$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lcom/stripe/android/model/CardBrand;",
            ">;)",
            "Lcom/stripe/android/customersheet/CustomerSheet$Configuration$Builder;"
        }
    .end annotation

    const-string v0, "preferredNetworks"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 294
    move-object v0, p0

    check-cast v0, Lcom/stripe/android/customersheet/CustomerSheet$Configuration$Builder;

    .line 295
    iput-object p1, p0, Lcom/stripe/android/customersheet/CustomerSheet$Configuration$Builder;->preferredNetworks:Ljava/util/List;

    return-object p0
.end method
