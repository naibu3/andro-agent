.class public final Lcom/stripe/android/common/model/CommonConfigurationKt;
.super Ljava/lang/Object;
.source "CommonConfiguration.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\u001a\u000c\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\u000c\u0010\u0000\u001a\u00020\u0001*\u00020\u0003H\u0000\u001a\u000c\u0010\u0000\u001a\u00020\u0001*\u00020\u0004H\u0000\u001a\u000c\u0010\u0005\u001a\u00020\u0006*\u00020\u0007H\u0002\u001a\u0014\u0010\t\u001a\u00020\u0006*\u00020\u00012\u0006\u0010\n\u001a\u00020\u0001H\u0000\u001a\u000c\u0010\u000b\u001a\u00020\u000c*\u00020\u0001H\u0002\"\u000e\u0010\u0008\u001a\u00020\u0007X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"
    }
    d2 = {
        "asCommonConfiguration",
        "Lcom/stripe/android/common/model/CommonConfiguration;",
        "Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;",
        "Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Configuration;",
        "Lcom/stripe/android/link/LinkController$Configuration;",
        "isEKClientSecretValid",
        "",
        "",
        "EK_CLIENT_SECRET_VALID_REGEX_PATTERN",
        "containsVolatileDifferences",
        "other",
        "toVolatileConfiguration",
        "Lcom/stripe/android/common/model/VolatileCommonConfiguration;",
        "paymentsheet_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final EK_CLIENT_SECRET_VALID_REGEX_PATTERN:Ljava/lang/String; = "^ek_[^_](.)+$"


# direct methods
.method public static final synthetic access$isEKClientSecretValid(Ljava/lang/String;)Z
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/stripe/android/common/model/CommonConfigurationKt;->isEKClientSecretValid(Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method public static final asCommonConfiguration(Lcom/stripe/android/link/LinkController$Configuration;)Lcom/stripe/android/common/model/CommonConfiguration;
    .locals 22

    const-string v0, "<this>"

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 208
    invoke-virtual {v1}, Lcom/stripe/android/link/LinkController$Configuration;->getMerchantDisplayName$paymentsheet_release()Ljava/lang/String;

    move-result-object v2

    .line 211
    invoke-virtual {v1}, Lcom/stripe/android/link/LinkController$Configuration;->getDefaultBillingDetails$paymentsheet_release()Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;

    move-result-object v6

    .line 215
    invoke-virtual {v1}, Lcom/stripe/android/link/LinkController$Configuration;->getBillingDetailsCollectionConfiguration$paymentsheet_release()Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;

    move-result-object v10

    .line 216
    sget-object v0, Lcom/stripe/android/common/configuration/ConfigurationDefaults;->INSTANCE:Lcom/stripe/android/common/configuration/ConfigurationDefaults;

    invoke-virtual {v0}, Lcom/stripe/android/common/configuration/ConfigurationDefaults;->getPreferredNetworks()Ljava/util/List;

    move-result-object v11

    .line 218
    sget-object v0, Lcom/stripe/android/common/configuration/ConfigurationDefaults;->INSTANCE:Lcom/stripe/android/common/configuration/ConfigurationDefaults;

    invoke-virtual {v0}, Lcom/stripe/android/common/configuration/ConfigurationDefaults;->getPaymentMethodOrder()Ljava/util/List;

    move-result-object v13

    .line 219
    sget-object v0, Lcom/stripe/android/common/configuration/ConfigurationDefaults;->INSTANCE:Lcom/stripe/android/common/configuration/ConfigurationDefaults;

    invoke-virtual {v0}, Lcom/stripe/android/common/configuration/ConfigurationDefaults;->getExternalPaymentMethods()Ljava/util/List;

    move-result-object v14

    .line 220
    invoke-virtual {v1}, Lcom/stripe/android/link/LinkController$Configuration;->getCardBrandAcceptance$paymentsheet_release()Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance;

    move-result-object v15

    .line 221
    sget-object v0, Lcom/stripe/android/common/configuration/ConfigurationDefaults;->INSTANCE:Lcom/stripe/android/common/configuration/ConfigurationDefaults;

    invoke-virtual {v0}, Lcom/stripe/android/common/configuration/ConfigurationDefaults;->getCustomPaymentMethods()Ljava/util/List;

    move-result-object v16

    .line 222
    new-instance v5, Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration;

    .line 223
    sget-object v0, Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration$Display;->Automatic:Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration$Display;

    const/4 v3, 0x1

    .line 225
    invoke-virtual {v1}, Lcom/stripe/android/link/LinkController$Configuration;->getAllowUserEmailEdits$paymentsheet_release()Z

    move-result v4

    .line 222
    invoke-direct {v5, v0, v3, v4}, Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration;-><init>(Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration$Display;ZZ)V

    .line 229
    invoke-virtual {v1}, Lcom/stripe/android/link/LinkController$Configuration;->getLinkAppearance$paymentsheet_release()Lcom/stripe/android/link/model/LinkAppearance;

    move-result-object v19

    .line 230
    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    move-result-object v20

    .line 207
    new-instance v1, Lcom/stripe/android/common/model/CommonConfiguration;

    const/16 v18, 0x0

    const/16 v21, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v12, 0x1

    const/16 v17, 0x0

    invoke-direct/range {v1 .. v21}, Lcom/stripe/android/common/model/CommonConfiguration;-><init>(Ljava/lang/String;Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerConfiguration;Lcom/stripe/android/paymentsheet/PaymentSheet$GooglePayConfiguration;Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration;Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;ZZLcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;Ljava/util/List;ZLjava/util/List;Ljava/util/List;Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance;Ljava/util/List;Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration;Ljava/lang/String;Lcom/stripe/android/link/model/LinkAppearance;Ljava/util/Map;Lcom/stripe/android/paymentsheet/PaymentSheet$WalletButtonsConfiguration;)V

    return-object v1
.end method

.method public static final asCommonConfiguration(Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Configuration;)Lcom/stripe/android/common/model/CommonConfiguration;
    .locals 24

    const-string v0, "<this>"

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 186
    invoke-virtual {v1}, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Configuration;->getMerchantDisplayName$paymentsheet_release()Ljava/lang/String;

    move-result-object v2

    .line 187
    invoke-virtual {v1}, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Configuration;->getCustomer$paymentsheet_release()Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerConfiguration;

    move-result-object v3

    .line 188
    invoke-virtual {v1}, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Configuration;->getGooglePay$paymentsheet_release()Lcom/stripe/android/paymentsheet/PaymentSheet$GooglePayConfiguration;

    move-result-object v4

    .line 189
    invoke-virtual {v1}, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Configuration;->getDefaultBillingDetails$paymentsheet_release()Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;

    move-result-object v6

    .line 190
    invoke-virtual {v1}, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Configuration;->getShippingDetails$paymentsheet_release()Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;

    move-result-object v7

    .line 191
    invoke-virtual {v1}, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Configuration;->getAllowsDelayedPaymentMethods$paymentsheet_release()Z

    move-result v8

    .line 192
    invoke-virtual {v1}, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Configuration;->getAllowsPaymentMethodsRequiringShippingAddress$paymentsheet_release()Z

    move-result v9

    .line 193
    invoke-virtual {v1}, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Configuration;->getBillingDetailsCollectionConfiguration$paymentsheet_release()Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;

    move-result-object v10

    .line 194
    invoke-virtual {v1}, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Configuration;->getPreferredNetworks$paymentsheet_release()Ljava/util/List;

    move-result-object v11

    .line 195
    invoke-virtual {v1}, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Configuration;->getAllowsRemovalOfLastSavedPaymentMethod$paymentsheet_release()Z

    move-result v12

    .line 196
    invoke-virtual {v1}, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Configuration;->getPaymentMethodOrder$paymentsheet_release()Ljava/util/List;

    move-result-object v13

    .line 197
    invoke-virtual {v1}, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Configuration;->getExternalPaymentMethods$paymentsheet_release()Ljava/util/List;

    move-result-object v14

    .line 198
    invoke-virtual {v1}, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Configuration;->getCardBrandAcceptance$paymentsheet_release()Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance;

    move-result-object v15

    .line 199
    invoke-virtual {v1}, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Configuration;->getCustomPaymentMethods$paymentsheet_release()Ljava/util/List;

    move-result-object v16

    .line 200
    invoke-virtual {v1}, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Configuration;->getLink$paymentsheet_release()Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration;

    move-result-object v5

    .line 203
    invoke-virtual {v1}, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Configuration;->getTermsDisplay$paymentsheet_release()Ljava/util/Map;

    move-result-object v20

    .line 185
    new-instance v1, Lcom/stripe/android/common/model/CommonConfiguration;

    const/high16 v22, 0x20000

    const/16 v23, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v21, 0x0

    invoke-direct/range {v1 .. v23}, Lcom/stripe/android/common/model/CommonConfiguration;-><init>(Ljava/lang/String;Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerConfiguration;Lcom/stripe/android/paymentsheet/PaymentSheet$GooglePayConfiguration;Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration;Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;ZZLcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;Ljava/util/List;ZLjava/util/List;Ljava/util/List;Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance;Ljava/util/List;Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration;Ljava/lang/String;Lcom/stripe/android/link/model/LinkAppearance;Ljava/util/Map;Lcom/stripe/android/paymentsheet/PaymentSheet$WalletButtonsConfiguration;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method public static final asCommonConfiguration(Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;)Lcom/stripe/android/common/model/CommonConfiguration;
    .locals 24

    const-string v0, "<this>"

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 164
    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;->getMerchantDisplayName()Ljava/lang/String;

    move-result-object v2

    .line 165
    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;->getCustomer()Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerConfiguration;

    move-result-object v3

    .line 166
    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;->getGooglePay()Lcom/stripe/android/paymentsheet/PaymentSheet$GooglePayConfiguration;

    move-result-object v4

    .line 167
    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;->getDefaultBillingDetails()Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;

    move-result-object v6

    .line 168
    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;->getShippingDetails()Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;

    move-result-object v7

    .line 169
    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;->getAllowsDelayedPaymentMethods()Z

    move-result v8

    .line 170
    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;->getAllowsPaymentMethodsRequiringShippingAddress()Z

    move-result v9

    .line 171
    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;->getBillingDetailsCollectionConfiguration()Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;

    move-result-object v10

    .line 172
    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;->getPreferredNetworks()Ljava/util/List;

    move-result-object v11

    .line 173
    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;->getAllowsRemovalOfLastSavedPaymentMethod$paymentsheet_release()Z

    move-result v12

    .line 174
    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;->getPaymentMethodOrder$paymentsheet_release()Ljava/util/List;

    move-result-object v13

    .line 175
    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;->getExternalPaymentMethods$paymentsheet_release()Ljava/util/List;

    move-result-object v14

    .line 176
    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;->getCardBrandAcceptance$paymentsheet_release()Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance;

    move-result-object v15

    .line 177
    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;->getCustomPaymentMethods$paymentsheet_release()Ljava/util/List;

    move-result-object v16

    .line 178
    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;->getLink$paymentsheet_release()Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration;

    move-result-object v5

    .line 179
    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;->getShopPayConfiguration$paymentsheet_release()Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration;

    move-result-object v17

    .line 180
    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;->getGooglePlacesApiKey$paymentsheet_release()Ljava/lang/String;

    move-result-object v18

    .line 181
    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;->getTermsDisplay$paymentsheet_release()Ljava/util/Map;

    move-result-object v20

    .line 182
    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;->getWalletButtons$paymentsheet_release()Lcom/stripe/android/paymentsheet/PaymentSheet$WalletButtonsConfiguration;

    move-result-object v21

    .line 163
    new-instance v1, Lcom/stripe/android/common/model/CommonConfiguration;

    const/high16 v22, 0x20000

    const/16 v23, 0x0

    const/16 v19, 0x0

    invoke-direct/range {v1 .. v23}, Lcom/stripe/android/common/model/CommonConfiguration;-><init>(Ljava/lang/String;Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerConfiguration;Lcom/stripe/android/paymentsheet/PaymentSheet$GooglePayConfiguration;Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration;Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;ZZLcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;Ljava/util/List;ZLjava/util/List;Ljava/util/List;Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance;Ljava/util/List;Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration;Ljava/lang/String;Lcom/stripe/android/link/model/LinkAppearance;Ljava/util/Map;Lcom/stripe/android/paymentsheet/PaymentSheet$WalletButtonsConfiguration;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method public static final containsVolatileDifferences(Lcom/stripe/android/common/model/CommonConfiguration;Lcom/stripe/android/common/model/CommonConfiguration;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "other"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 243
    invoke-static {p0}, Lcom/stripe/android/common/model/CommonConfigurationKt;->toVolatileConfiguration(Lcom/stripe/android/common/model/CommonConfiguration;)Lcom/stripe/android/common/model/VolatileCommonConfiguration;

    move-result-object p0

    invoke-static {p1}, Lcom/stripe/android/common/model/CommonConfigurationKt;->toVolatileConfiguration(Lcom/stripe/android/common/model/CommonConfiguration;)Lcom/stripe/android/common/model/VolatileCommonConfiguration;

    move-result-object p1

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    xor-int/lit8 p0, p0, 0x1

    return p0
.end method

.method private static final isEKClientSecretValid(Ljava/lang/String;)Z
    .locals 2

    .line 235
    new-instance v0, Lkotlin/text/Regex;

    const-string v1, "^ek_[^_](.)+$"

    invoke-direct {v0, v1}, Lkotlin/text/Regex;-><init>(Ljava/lang/String;)V

    check-cast p0, Ljava/lang/CharSequence;

    invoke-virtual {v0, p0}, Lkotlin/text/Regex;->matches(Ljava/lang/CharSequence;)Z

    move-result p0

    return p0
.end method

.method private static final toVolatileConfiguration(Lcom/stripe/android/common/model/CommonConfiguration;)Lcom/stripe/android/common/model/VolatileCommonConfiguration;
    .locals 3

    .line 250
    new-instance v0, Lcom/stripe/android/common/model/VolatileCommonConfiguration;

    .line 251
    invoke-virtual {p0}, Lcom/stripe/android/common/model/CommonConfiguration;->getDefaultBillingDetails()Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;

    move-result-object v1

    .line 252
    invoke-virtual {p0}, Lcom/stripe/android/common/model/CommonConfiguration;->getBillingDetailsCollectionConfiguration()Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;

    move-result-object v2

    .line 253
    invoke-virtual {p0}, Lcom/stripe/android/common/model/CommonConfiguration;->getCardBrandAcceptance()Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance;

    move-result-object p0

    .line 250
    invoke-direct {v0, v1, v2, p0}, Lcom/stripe/android/common/model/VolatileCommonConfiguration;-><init>(Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance;)V

    return-object v0
.end method
