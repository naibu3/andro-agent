.class public final Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadataKtxKt;
.super Ljava/lang/Object;
.source "PaymentMethodMetadataKtx.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nPaymentMethodMetadataKtx.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentMethodMetadataKtx.kt\ncom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadataKtxKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,45:1\n1611#2,9:46\n1863#2:55\n230#2,2:56\n1864#2:59\n1620#2:60\n1#3:58\n*S KotlinDebug\n*F\n+ 1 PaymentMethodMetadataKtx.kt\ncom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadataKtxKt\n*L\n26#1:46,9\n26#1:55\n29#1:56,2\n26#1:59\n26#1:60\n26#1:58\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u000c\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\u001a\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004*\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0000\u00a8\u0006\u0008"
    }
    d2 = {
        "toPaymentSheetSaveConsentBehavior",
        "Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodSaveConsentBehavior;",
        "Lcom/stripe/android/model/ElementsSession;",
        "toDisplayableCustomPaymentMethods",
        "",
        "Lcom/stripe/android/lpmfoundations/paymentmethod/DisplayableCustomPaymentMethod;",
        "configuration",
        "Lcom/stripe/android/common/model/CommonConfiguration;",
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


# direct methods
.method public static final toDisplayableCustomPaymentMethods(Lcom/stripe/android/model/ElementsSession;Lcom/stripe/android/common/model/CommonConfiguration;)Ljava/util/List;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/model/ElementsSession;",
            "Lcom/stripe/android/common/model/CommonConfiguration;",
            ")",
            "Ljava/util/List<",
            "Lcom/stripe/android/lpmfoundations/paymentmethod/DisplayableCustomPaymentMethod;",
            ">;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "configuration"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    invoke-virtual {p0}, Lcom/stripe/android/model/ElementsSession;->getCustomPaymentMethods()Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    .line 46
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    check-cast v0, Ljava/util/Collection;

    .line 55
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    .line 54
    check-cast v1, Lcom/stripe/android/model/ElementsSession$CustomPaymentMethod;

    .line 28
    instance-of v2, v1, Lcom/stripe/android/model/ElementsSession$CustomPaymentMethod$Available;

    if-eqz v2, :cond_3

    .line 29
    invoke-virtual {p1}, Lcom/stripe/android/common/model/CommonConfiguration;->getCustomPaymentMethods()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    .line 56
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/stripe/android/paymentsheet/PaymentSheet$CustomPaymentMethod;

    .line 30
    move-object v4, v1

    check-cast v4, Lcom/stripe/android/model/ElementsSession$CustomPaymentMethod$Available;

    invoke-virtual {v4}, Lcom/stripe/android/model/ElementsSession$CustomPaymentMethod$Available;->getType()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3}, Lcom/stripe/android/paymentsheet/PaymentSheet$CustomPaymentMethod;->getId()Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    .line 33
    new-instance v6, Lcom/stripe/android/lpmfoundations/paymentmethod/DisplayableCustomPaymentMethod;

    .line 34
    invoke-virtual {v4}, Lcom/stripe/android/model/ElementsSession$CustomPaymentMethod$Available;->getType()Ljava/lang/String;

    move-result-object v7

    .line 35
    invoke-virtual {v4}, Lcom/stripe/android/model/ElementsSession$CustomPaymentMethod$Available;->getDisplayName()Ljava/lang/String;

    move-result-object v8

    .line 36
    invoke-virtual {v4}, Lcom/stripe/android/model/ElementsSession$CustomPaymentMethod$Available;->getLogoUrl()Ljava/lang/String;

    move-result-object v9

    .line 37
    invoke-virtual {v3}, Lcom/stripe/android/paymentsheet/PaymentSheet$CustomPaymentMethod;->getSubtitle$paymentsheet_release()Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object v10

    .line 38
    invoke-virtual {v3}, Lcom/stripe/android/paymentsheet/PaymentSheet$CustomPaymentMethod;->getDisableBillingDetailCollection$paymentsheet_release()Z

    move-result v11

    .line 33
    invoke-direct/range {v6 .. v11}, Lcom/stripe/android/lpmfoundations/paymentmethod/DisplayableCustomPaymentMethod;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/core/strings/ResolvableString;Z)V

    goto :goto_1

    .line 57
    :cond_2
    new-instance p0, Ljava/util/NoSuchElementException;

    const-string p1, "Collection contains no element matching the predicate."

    invoke-direct {p0, p1}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 41
    :cond_3
    instance-of v1, v1, Lcom/stripe/android/model/ElementsSession$CustomPaymentMethod$Unavailable;

    if-eqz v1, :cond_4

    const/4 v6, 0x0

    :goto_1
    if-eqz v6, :cond_0

    .line 54
    invoke-interface {v0, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 27
    :cond_4
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    .line 60
    :cond_5
    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method public static final toPaymentSheetSaveConsentBehavior(Lcom/stripe/android/model/ElementsSession;)Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodSaveConsentBehavior;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    invoke-virtual {p0}, Lcom/stripe/android/model/ElementsSession;->getCustomer()Lcom/stripe/android/model/ElementsSession$Customer;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lcom/stripe/android/model/ElementsSession$Customer;->getSession()Lcom/stripe/android/model/ElementsSession$Customer$Session;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lcom/stripe/android/model/ElementsSession$Customer$Session;->getComponents()Lcom/stripe/android/model/ElementsSession$Customer$Components;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lcom/stripe/android/model/ElementsSession$Customer$Components;->getMobilePaymentElement()Lcom/stripe/android/model/ElementsSession$Customer$Components$MobilePaymentElement;

    move-result-object p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    .line 8
    :goto_0
    instance-of v0, p0, Lcom/stripe/android/model/ElementsSession$Customer$Components$MobilePaymentElement$Enabled;

    if-eqz v0, :cond_2

    .line 9
    check-cast p0, Lcom/stripe/android/model/ElementsSession$Customer$Components$MobilePaymentElement$Enabled;

    invoke-virtual {p0}, Lcom/stripe/android/model/ElementsSession$Customer$Components$MobilePaymentElement$Enabled;->isPaymentMethodSaveEnabled()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 10
    sget-object p0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodSaveConsentBehavior$Enabled;->INSTANCE:Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodSaveConsentBehavior$Enabled;

    check-cast p0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodSaveConsentBehavior;

    return-object p0

    .line 12
    :cond_1
    new-instance v0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodSaveConsentBehavior$Disabled;

    .line 13
    invoke-virtual {p0}, Lcom/stripe/android/model/ElementsSession$Customer$Components$MobilePaymentElement$Enabled;->getAllowRedisplayOverride()Lcom/stripe/android/model/PaymentMethod$AllowRedisplay;

    move-result-object p0

    .line 12
    invoke-direct {v0, p0}, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodSaveConsentBehavior$Disabled;-><init>(Lcom/stripe/android/model/PaymentMethod$AllowRedisplay;)V

    check-cast v0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodSaveConsentBehavior;

    return-object v0

    .line 18
    :cond_2
    instance-of v0, p0, Lcom/stripe/android/model/ElementsSession$Customer$Components$MobilePaymentElement$Disabled;

    if-nez v0, :cond_4

    if-nez p0, :cond_3

    goto :goto_1

    .line 7
    :cond_3
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    .line 19
    :cond_4
    :goto_1
    sget-object p0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodSaveConsentBehavior$Legacy;->INSTANCE:Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodSaveConsentBehavior$Legacy;

    check-cast p0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodSaveConsentBehavior;

    return-object p0
.end method
