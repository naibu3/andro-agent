.class public final Lcom/stripe/android/customersheet/CustomerSheet$Configuration;
.super Ljava/lang/Object;
.source "CustomerSheet.kt"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/customersheet/CustomerSheet;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Configuration"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/customersheet/CustomerSheet$Configuration$Builder;,
        Lcom/stripe/android/customersheet/CustomerSheet$Configuration$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0015\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u0000 22\u00020\u0001:\u000212By\u0008\u0000\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\t\u0012\u0008\u0008\u0002\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\u000c\u001a\u00020\u0007\u0012\u000e\u0008\u0002\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u0005\u0012\u000e\u0008\u0002\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u000e\u0012\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u0013\u00a2\u0006\u0004\u0008\u0014\u0010\u0015B\u0011\u0008\u0010\u0012\u0006\u0010\u000c\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u0014\u0010\u0016J\u0006\u0010(\u001a\u00020)J\u0006\u0010*\u001a\u00020+J\u0016\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020+R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0017\u0010\u0018R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0019\u0010\u001aR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001b\u0010\u001cR\u0011\u0010\u0008\u001a\u00020\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001d\u0010\u001eR\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001f\u0010 R\u0011\u0010\u000c\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008!\u0010\u001cR\u0017\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\"\u0010#R\u0014\u0010\u0010\u001a\u00020\u0005X\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008$\u0010\u001aR\u001a\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u000eX\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008%\u0010#R\u0014\u0010\u0012\u001a\u00020\u0013X\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008&\u0010\'\u00a8\u00063"
    }
    d2 = {
        "Lcom/stripe/android/customersheet/CustomerSheet$Configuration;",
        "Landroid/os/Parcelable;",
        "appearance",
        "Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;",
        "googlePayEnabled",
        "",
        "headerTextForSelectionScreen",
        "",
        "defaultBillingDetails",
        "Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;",
        "billingDetailsCollectionConfiguration",
        "Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;",
        "merchantDisplayName",
        "preferredNetworks",
        "",
        "Lcom/stripe/android/model/CardBrand;",
        "allowsRemovalOfLastSavedPaymentMethod",
        "paymentMethodOrder",
        "cardBrandAcceptance",
        "Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance;",
        "<init>",
        "(Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;ZLjava/lang/String;Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;Ljava/lang/String;Ljava/util/List;ZLjava/util/List;Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance;)V",
        "(Ljava/lang/String;)V",
        "getAppearance",
        "()Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;",
        "getGooglePayEnabled",
        "()Z",
        "getHeaderTextForSelectionScreen",
        "()Ljava/lang/String;",
        "getDefaultBillingDetails",
        "()Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;",
        "getBillingDetailsCollectionConfiguration",
        "()Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;",
        "getMerchantDisplayName",
        "getPreferredNetworks",
        "()Ljava/util/List;",
        "getAllowsRemovalOfLastSavedPaymentMethod$paymentsheet_release",
        "getPaymentMethodOrder$paymentsheet_release",
        "getCardBrandAcceptance$paymentsheet_release",
        "()Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance;",
        "newBuilder",
        "Lcom/stripe/android/customersheet/CustomerSheet$Configuration$Builder;",
        "describeContents",
        "",
        "writeToParcel",
        "",
        "dest",
        "Landroid/os/Parcel;",
        "flags",
        "Builder",
        "Companion",
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

.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/stripe/android/customersheet/CustomerSheet$Configuration;",
            ">;"
        }
    .end annotation
.end field

.field public static final Companion:Lcom/stripe/android/customersheet/CustomerSheet$Configuration$Companion;


# instance fields
.field private final allowsRemovalOfLastSavedPaymentMethod:Z

.field private final appearance:Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;

.field private final billingDetailsCollectionConfiguration:Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;

.field private final cardBrandAcceptance:Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance;

.field private final defaultBillingDetails:Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;

.field private final googlePayEnabled:Z

.field private final headerTextForSelectionScreen:Ljava/lang/String;

.field private final merchantDisplayName:Ljava/lang/String;

.field private final paymentMethodOrder:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final preferredNetworks:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/stripe/android/model/CardBrand;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/customersheet/CustomerSheet$Configuration$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/customersheet/CustomerSheet$Configuration$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/customersheet/CustomerSheet$Configuration;->Companion:Lcom/stripe/android/customersheet/CustomerSheet$Configuration$Companion;

    new-instance v0, Lcom/stripe/android/customersheet/CustomerSheet$Configuration$Creator;

    invoke-direct {v0}, Lcom/stripe/android/customersheet/CustomerSheet$Configuration$Creator;-><init>()V

    check-cast v0, Landroid/os/Parcelable$Creator;

    sput-object v0, Lcom/stripe/android/customersheet/CustomerSheet$Configuration;->CREATOR:Landroid/os/Parcelable$Creator;

    const/16 v0, 0x8

    sput v0, Lcom/stripe/android/customersheet/CustomerSheet$Configuration;->$stable:I

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;ZLjava/lang/String;Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;Ljava/lang/String;Ljava/util/List;ZLjava/util/List;Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;",
            "Z",
            "Ljava/lang/String;",
            "Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;",
            "Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "+",
            "Lcom/stripe/android/model/CardBrand;",
            ">;Z",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance;",
            ")V"
        }
    .end annotation

    const-string v0, "appearance"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "defaultBillingDetails"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "billingDetailsCollectionConfiguration"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "merchantDisplayName"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "preferredNetworks"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "paymentMethodOrder"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cardBrandAcceptance"

    invoke-static {p10, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 178
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 182
    iput-object p1, p0, Lcom/stripe/android/customersheet/CustomerSheet$Configuration;->appearance:Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;

    .line 187
    iput-boolean p2, p0, Lcom/stripe/android/customersheet/CustomerSheet$Configuration;->googlePayEnabled:Z

    .line 192
    iput-object p3, p0, Lcom/stripe/android/customersheet/CustomerSheet$Configuration;->headerTextForSelectionScreen:Ljava/lang/String;

    .line 200
    iput-object p4, p0, Lcom/stripe/android/customersheet/CustomerSheet$Configuration;->defaultBillingDetails:Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;

    .line 209
    iput-object p5, p0, Lcom/stripe/android/customersheet/CustomerSheet$Configuration;->billingDetailsCollectionConfiguration:Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;

    .line 215
    iput-object p6, p0, Lcom/stripe/android/customersheet/CustomerSheet$Configuration;->merchantDisplayName:Ljava/lang/String;

    .line 224
    iput-object p7, p0, Lcom/stripe/android/customersheet/CustomerSheet$Configuration;->preferredNetworks:Ljava/util/List;

    .line 226
    iput-boolean p8, p0, Lcom/stripe/android/customersheet/CustomerSheet$Configuration;->allowsRemovalOfLastSavedPaymentMethod:Z

    .line 229
    iput-object p9, p0, Lcom/stripe/android/customersheet/CustomerSheet$Configuration;->paymentMethodOrder:Ljava/util/List;

    .line 231
    iput-object p10, p0, Lcom/stripe/android/customersheet/CustomerSheet$Configuration;->cardBrandAcceptance:Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;ZLjava/lang/String;Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;Ljava/lang/String;Ljava/util/List;ZLjava/util/List;Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p12, p11, 0x1

    if-eqz p12, :cond_0

    .line 182
    sget-object p1, Lcom/stripe/android/common/configuration/ConfigurationDefaults;->INSTANCE:Lcom/stripe/android/common/configuration/ConfigurationDefaults;

    invoke-virtual {p1}, Lcom/stripe/android/common/configuration/ConfigurationDefaults;->getAppearance()Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;

    move-result-object p1

    :cond_0
    and-int/lit8 p12, p11, 0x2

    if-eqz p12, :cond_1

    const/4 p2, 0x0

    :cond_1
    and-int/lit8 p12, p11, 0x4

    if-eqz p12, :cond_2

    .line 192
    sget-object p3, Lcom/stripe/android/common/configuration/ConfigurationDefaults;->INSTANCE:Lcom/stripe/android/common/configuration/ConfigurationDefaults;

    invoke-virtual {p3}, Lcom/stripe/android/common/configuration/ConfigurationDefaults;->getHeaderTextForSelectionScreen()Ljava/lang/String;

    move-result-object p3

    :cond_2
    and-int/lit8 p12, p11, 0x8

    if-eqz p12, :cond_3

    .line 200
    sget-object p4, Lcom/stripe/android/common/configuration/ConfigurationDefaults;->INSTANCE:Lcom/stripe/android/common/configuration/ConfigurationDefaults;

    invoke-virtual {p4}, Lcom/stripe/android/common/configuration/ConfigurationDefaults;->getBillingDetails()Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;

    move-result-object p4

    :cond_3
    and-int/lit8 p12, p11, 0x10

    if-eqz p12, :cond_4

    .line 210
    sget-object p5, Lcom/stripe/android/common/configuration/ConfigurationDefaults;->INSTANCE:Lcom/stripe/android/common/configuration/ConfigurationDefaults;

    invoke-virtual {p5}, Lcom/stripe/android/common/configuration/ConfigurationDefaults;->getBillingDetailsCollectionConfiguration()Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;

    move-result-object p5

    :cond_4
    and-int/lit8 p12, p11, 0x40

    if-eqz p12, :cond_5

    .line 224
    sget-object p7, Lcom/stripe/android/common/configuration/ConfigurationDefaults;->INSTANCE:Lcom/stripe/android/common/configuration/ConfigurationDefaults;

    invoke-virtual {p7}, Lcom/stripe/android/common/configuration/ConfigurationDefaults;->getPreferredNetworks()Ljava/util/List;

    move-result-object p7

    :cond_5
    and-int/lit16 p12, p11, 0x80

    if-eqz p12, :cond_6

    const/4 p8, 0x1

    :cond_6
    and-int/lit16 p12, p11, 0x100

    if-eqz p12, :cond_7

    .line 229
    sget-object p9, Lcom/stripe/android/common/configuration/ConfigurationDefaults;->INSTANCE:Lcom/stripe/android/common/configuration/ConfigurationDefaults;

    invoke-virtual {p9}, Lcom/stripe/android/common/configuration/ConfigurationDefaults;->getPaymentMethodOrder()Ljava/util/List;

    move-result-object p9

    :cond_7
    and-int/lit16 p11, p11, 0x200

    if-eqz p11, :cond_8

    .line 231
    sget-object p10, Lcom/stripe/android/common/configuration/ConfigurationDefaults;->INSTANCE:Lcom/stripe/android/common/configuration/ConfigurationDefaults;

    invoke-virtual {p10}, Lcom/stripe/android/common/configuration/ConfigurationDefaults;->getCardBrandAcceptance()Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance;

    move-result-object p10

    :cond_8
    move-object p11, p9

    move-object p12, p10

    move-object p9, p7

    move p10, p8

    move-object p7, p5

    move-object p8, p6

    move-object p5, p3

    move-object p6, p4

    move-object p3, p1

    move p4, p2

    move-object p2, p0

    .line 178
    invoke-direct/range {p2 .. p12}, Lcom/stripe/android/customersheet/CustomerSheet$Configuration;-><init>(Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;ZLjava/lang/String;Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;Ljava/lang/String;Ljava/util/List;ZLjava/util/List;Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 14

    const-string v0, "merchantDisplayName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 236
    sget-object v0, Lcom/stripe/android/common/configuration/ConfigurationDefaults;->INSTANCE:Lcom/stripe/android/common/configuration/ConfigurationDefaults;

    invoke-virtual {v0}, Lcom/stripe/android/common/configuration/ConfigurationDefaults;->getAppearance()Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;

    move-result-object v2

    .line 238
    sget-object v0, Lcom/stripe/android/common/configuration/ConfigurationDefaults;->INSTANCE:Lcom/stripe/android/common/configuration/ConfigurationDefaults;

    invoke-virtual {v0}, Lcom/stripe/android/common/configuration/ConfigurationDefaults;->getHeaderTextForSelectionScreen()Ljava/lang/String;

    move-result-object v4

    .line 239
    sget-object v0, Lcom/stripe/android/common/configuration/ConfigurationDefaults;->INSTANCE:Lcom/stripe/android/common/configuration/ConfigurationDefaults;

    invoke-virtual {v0}, Lcom/stripe/android/common/configuration/ConfigurationDefaults;->getBillingDetails()Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;

    move-result-object v5

    .line 240
    sget-object v0, Lcom/stripe/android/common/configuration/ConfigurationDefaults;->INSTANCE:Lcom/stripe/android/common/configuration/ConfigurationDefaults;

    invoke-virtual {v0}, Lcom/stripe/android/common/configuration/ConfigurationDefaults;->getBillingDetailsCollectionConfiguration()Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;

    move-result-object v6

    const/16 v12, 0x340

    const/4 v13, 0x0

    const/4 v3, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x1

    const/4 v10, 0x0

    const/4 v11, 0x0

    move-object v1, p0

    move-object v7, p1

    .line 235
    invoke-direct/range {v1 .. v13}, Lcom/stripe/android/customersheet/CustomerSheet$Configuration;-><init>(Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;ZLjava/lang/String;Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;Ljava/lang/String;Ljava/util/List;ZLjava/util/List;Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public static final builder(Ljava/lang/String;)Lcom/stripe/android/customersheet/CustomerSheet$Configuration$Builder;
    .locals 1
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    sget-object v0, Lcom/stripe/android/customersheet/CustomerSheet$Configuration;->Companion:Lcom/stripe/android/customersheet/CustomerSheet$Configuration$Companion;

    invoke-virtual {v0, p0}, Lcom/stripe/android/customersheet/CustomerSheet$Configuration$Companion;->builder(Ljava/lang/String;)Lcom/stripe/android/customersheet/CustomerSheet$Configuration$Builder;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/stripe/android/customersheet/CustomerSheet$Configuration;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/customersheet/CustomerSheet$Configuration;

    iget-object v1, p0, Lcom/stripe/android/customersheet/CustomerSheet$Configuration;->appearance:Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;

    iget-object v3, p1, Lcom/stripe/android/customersheet/CustomerSheet$Configuration;->appearance:Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-boolean v1, p0, Lcom/stripe/android/customersheet/CustomerSheet$Configuration;->googlePayEnabled:Z

    iget-boolean v3, p1, Lcom/stripe/android/customersheet/CustomerSheet$Configuration;->googlePayEnabled:Z

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/stripe/android/customersheet/CustomerSheet$Configuration;->headerTextForSelectionScreen:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/customersheet/CustomerSheet$Configuration;->headerTextForSelectionScreen:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/stripe/android/customersheet/CustomerSheet$Configuration;->defaultBillingDetails:Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;

    iget-object v3, p1, Lcom/stripe/android/customersheet/CustomerSheet$Configuration;->defaultBillingDetails:Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/stripe/android/customersheet/CustomerSheet$Configuration;->billingDetailsCollectionConfiguration:Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;

    iget-object v3, p1, Lcom/stripe/android/customersheet/CustomerSheet$Configuration;->billingDetailsCollectionConfiguration:Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/stripe/android/customersheet/CustomerSheet$Configuration;->merchantDisplayName:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/customersheet/CustomerSheet$Configuration;->merchantDisplayName:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/stripe/android/customersheet/CustomerSheet$Configuration;->preferredNetworks:Ljava/util/List;

    iget-object v3, p1, Lcom/stripe/android/customersheet/CustomerSheet$Configuration;->preferredNetworks:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-boolean v1, p0, Lcom/stripe/android/customersheet/CustomerSheet$Configuration;->allowsRemovalOfLastSavedPaymentMethod:Z

    iget-boolean v3, p1, Lcom/stripe/android/customersheet/CustomerSheet$Configuration;->allowsRemovalOfLastSavedPaymentMethod:Z

    if-eq v1, v3, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/stripe/android/customersheet/CustomerSheet$Configuration;->paymentMethodOrder:Ljava/util/List;

    iget-object v3, p1, Lcom/stripe/android/customersheet/CustomerSheet$Configuration;->paymentMethodOrder:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/stripe/android/customersheet/CustomerSheet$Configuration;->cardBrandAcceptance:Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance;

    iget-object p1, p1, Lcom/stripe/android/customersheet/CustomerSheet$Configuration;->cardBrandAcceptance:Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_b

    return v2

    :cond_b
    return v0
.end method

.method public final getAllowsRemovalOfLastSavedPaymentMethod$paymentsheet_release()Z
    .locals 1

    .line 226
    iget-boolean v0, p0, Lcom/stripe/android/customersheet/CustomerSheet$Configuration;->allowsRemovalOfLastSavedPaymentMethod:Z

    return v0
.end method

.method public final getAppearance()Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;
    .locals 1

    .line 182
    iget-object v0, p0, Lcom/stripe/android/customersheet/CustomerSheet$Configuration;->appearance:Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;

    return-object v0
.end method

.method public final getBillingDetailsCollectionConfiguration()Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;
    .locals 1

    .line 209
    iget-object v0, p0, Lcom/stripe/android/customersheet/CustomerSheet$Configuration;->billingDetailsCollectionConfiguration:Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;

    return-object v0
.end method

.method public final getCardBrandAcceptance$paymentsheet_release()Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance;
    .locals 1

    .line 231
    iget-object v0, p0, Lcom/stripe/android/customersheet/CustomerSheet$Configuration;->cardBrandAcceptance:Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance;

    return-object v0
.end method

.method public final getDefaultBillingDetails()Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;
    .locals 1

    .line 200
    iget-object v0, p0, Lcom/stripe/android/customersheet/CustomerSheet$Configuration;->defaultBillingDetails:Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;

    return-object v0
.end method

.method public final getGooglePayEnabled()Z
    .locals 1

    .line 187
    iget-boolean v0, p0, Lcom/stripe/android/customersheet/CustomerSheet$Configuration;->googlePayEnabled:Z

    return v0
.end method

.method public final getHeaderTextForSelectionScreen()Ljava/lang/String;
    .locals 1

    .line 192
    iget-object v0, p0, Lcom/stripe/android/customersheet/CustomerSheet$Configuration;->headerTextForSelectionScreen:Ljava/lang/String;

    return-object v0
.end method

.method public final getMerchantDisplayName()Ljava/lang/String;
    .locals 1

    .line 215
    iget-object v0, p0, Lcom/stripe/android/customersheet/CustomerSheet$Configuration;->merchantDisplayName:Ljava/lang/String;

    return-object v0
.end method

.method public final getPaymentMethodOrder$paymentsheet_release()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 229
    iget-object v0, p0, Lcom/stripe/android/customersheet/CustomerSheet$Configuration;->paymentMethodOrder:Ljava/util/List;

    return-object v0
.end method

.method public final getPreferredNetworks()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/stripe/android/model/CardBrand;",
            ">;"
        }
    .end annotation

    .line 224
    iget-object v0, p0, Lcom/stripe/android/customersheet/CustomerSheet$Configuration;->preferredNetworks:Ljava/util/List;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/stripe/android/customersheet/CustomerSheet$Configuration;->appearance:Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;

    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/stripe/android/customersheet/CustomerSheet$Configuration;->googlePayEnabled:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/customersheet/CustomerSheet$Configuration;->headerTextForSelectionScreen:Ljava/lang/String;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/customersheet/CustomerSheet$Configuration;->defaultBillingDetails:Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;

    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/customersheet/CustomerSheet$Configuration;->billingDetailsCollectionConfiguration:Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;

    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/customersheet/CustomerSheet$Configuration;->merchantDisplayName:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/customersheet/CustomerSheet$Configuration;->preferredNetworks:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/stripe/android/customersheet/CustomerSheet$Configuration;->allowsRemovalOfLastSavedPaymentMethod:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/customersheet/CustomerSheet$Configuration;->paymentMethodOrder:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/customersheet/CustomerSheet$Configuration;->cardBrandAcceptance:Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance;

    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final newBuilder()Lcom/stripe/android/customersheet/CustomerSheet$Configuration$Builder;
    .locals 2

    .line 247
    new-instance v0, Lcom/stripe/android/customersheet/CustomerSheet$Configuration$Builder;

    iget-object v1, p0, Lcom/stripe/android/customersheet/CustomerSheet$Configuration;->merchantDisplayName:Ljava/lang/String;

    invoke-direct {v0, v1}, Lcom/stripe/android/customersheet/CustomerSheet$Configuration$Builder;-><init>(Ljava/lang/String;)V

    .line 248
    iget-object v1, p0, Lcom/stripe/android/customersheet/CustomerSheet$Configuration;->appearance:Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;

    invoke-virtual {v0, v1}, Lcom/stripe/android/customersheet/CustomerSheet$Configuration$Builder;->appearance(Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;)Lcom/stripe/android/customersheet/CustomerSheet$Configuration$Builder;

    move-result-object v0

    .line 249
    iget-boolean v1, p0, Lcom/stripe/android/customersheet/CustomerSheet$Configuration;->googlePayEnabled:Z

    invoke-virtual {v0, v1}, Lcom/stripe/android/customersheet/CustomerSheet$Configuration$Builder;->googlePayEnabled(Z)Lcom/stripe/android/customersheet/CustomerSheet$Configuration$Builder;

    move-result-object v0

    .line 250
    iget-object v1, p0, Lcom/stripe/android/customersheet/CustomerSheet$Configuration;->headerTextForSelectionScreen:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/stripe/android/customersheet/CustomerSheet$Configuration$Builder;->headerTextForSelectionScreen(Ljava/lang/String;)Lcom/stripe/android/customersheet/CustomerSheet$Configuration$Builder;

    move-result-object v0

    .line 251
    iget-object v1, p0, Lcom/stripe/android/customersheet/CustomerSheet$Configuration;->defaultBillingDetails:Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;

    invoke-virtual {v0, v1}, Lcom/stripe/android/customersheet/CustomerSheet$Configuration$Builder;->defaultBillingDetails(Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;)Lcom/stripe/android/customersheet/CustomerSheet$Configuration$Builder;

    move-result-object v0

    .line 252
    iget-object v1, p0, Lcom/stripe/android/customersheet/CustomerSheet$Configuration;->billingDetailsCollectionConfiguration:Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;

    invoke-virtual {v0, v1}, Lcom/stripe/android/customersheet/CustomerSheet$Configuration$Builder;->billingDetailsCollectionConfiguration(Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;)Lcom/stripe/android/customersheet/CustomerSheet$Configuration$Builder;

    move-result-object v0

    .line 253
    iget-boolean v1, p0, Lcom/stripe/android/customersheet/CustomerSheet$Configuration;->allowsRemovalOfLastSavedPaymentMethod:Z

    invoke-virtual {v0, v1}, Lcom/stripe/android/customersheet/CustomerSheet$Configuration$Builder;->allowsRemovalOfLastSavedPaymentMethod(Z)Lcom/stripe/android/customersheet/CustomerSheet$Configuration$Builder;

    move-result-object v0

    .line 254
    iget-object v1, p0, Lcom/stripe/android/customersheet/CustomerSheet$Configuration;->paymentMethodOrder:Ljava/util/List;

    invoke-virtual {v0, v1}, Lcom/stripe/android/customersheet/CustomerSheet$Configuration$Builder;->paymentMethodOrder(Ljava/util/List;)Lcom/stripe/android/customersheet/CustomerSheet$Configuration$Builder;

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 12

    iget-object v0, p0, Lcom/stripe/android/customersheet/CustomerSheet$Configuration;->appearance:Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;

    iget-boolean v1, p0, Lcom/stripe/android/customersheet/CustomerSheet$Configuration;->googlePayEnabled:Z

    iget-object v2, p0, Lcom/stripe/android/customersheet/CustomerSheet$Configuration;->headerTextForSelectionScreen:Ljava/lang/String;

    iget-object v3, p0, Lcom/stripe/android/customersheet/CustomerSheet$Configuration;->defaultBillingDetails:Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;

    iget-object v4, p0, Lcom/stripe/android/customersheet/CustomerSheet$Configuration;->billingDetailsCollectionConfiguration:Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;

    iget-object v5, p0, Lcom/stripe/android/customersheet/CustomerSheet$Configuration;->merchantDisplayName:Ljava/lang/String;

    iget-object v6, p0, Lcom/stripe/android/customersheet/CustomerSheet$Configuration;->preferredNetworks:Ljava/util/List;

    iget-boolean v7, p0, Lcom/stripe/android/customersheet/CustomerSheet$Configuration;->allowsRemovalOfLastSavedPaymentMethod:Z

    iget-object v8, p0, Lcom/stripe/android/customersheet/CustomerSheet$Configuration;->paymentMethodOrder:Ljava/util/List;

    iget-object v9, p0, Lcom/stripe/android/customersheet/CustomerSheet$Configuration;->cardBrandAcceptance:Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance;

    new-instance v10, Ljava/lang/StringBuilder;

    const-string v11, "Configuration(appearance="

    invoke-direct {v10, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v10, ", googlePayEnabled="

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", headerTextForSelectionScreen="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", defaultBillingDetails="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", billingDetailsCollectionConfiguration="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", merchantDisplayName="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", preferredNetworks="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", allowsRemovalOfLastSavedPaymentMethod="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", paymentMethodOrder="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", cardBrandAcceptance="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    const-string v0, "dest"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/customersheet/CustomerSheet$Configuration;->appearance:Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;

    invoke-virtual {v0, p1, p2}, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;->writeToParcel(Landroid/os/Parcel;I)V

    iget-boolean v0, p0, Lcom/stripe/android/customersheet/CustomerSheet$Configuration;->googlePayEnabled:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-object v0, p0, Lcom/stripe/android/customersheet/CustomerSheet$Configuration;->headerTextForSelectionScreen:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/customersheet/CustomerSheet$Configuration;->defaultBillingDetails:Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;

    invoke-virtual {v0, p1, p2}, Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;->writeToParcel(Landroid/os/Parcel;I)V

    iget-object v0, p0, Lcom/stripe/android/customersheet/CustomerSheet$Configuration;->billingDetailsCollectionConfiguration:Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;

    invoke-virtual {v0, p1, p2}, Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;->writeToParcel(Landroid/os/Parcel;I)V

    iget-object v0, p0, Lcom/stripe/android/customersheet/CustomerSheet$Configuration;->merchantDisplayName:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/customersheet/CustomerSheet$Configuration;->preferredNetworks:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/stripe/android/model/CardBrand;

    invoke-virtual {v1}, Lcom/stripe/android/model/CardBrand;->name()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    iget-boolean v0, p0, Lcom/stripe/android/customersheet/CustomerSheet$Configuration;->allowsRemovalOfLastSavedPaymentMethod:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-object v0, p0, Lcom/stripe/android/customersheet/CustomerSheet$Configuration;->paymentMethodOrder:Ljava/util/List;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeStringList(Ljava/util/List;)V

    iget-object v0, p0, Lcom/stripe/android/customersheet/CustomerSheet$Configuration;->cardBrandAcceptance:Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance;

    check-cast v0, Landroid/os/Parcelable;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    return-void
.end method
