.class public final Lcom/stripe/android/customersheet/util/SyncDefaultPaymentMethodUtilsKt;
.super Ljava/lang/Object;
.source "SyncDefaultPaymentMethodUtils.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nSyncDefaultPaymentMethodUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SyncDefaultPaymentMethodUtils.kt\ncom/stripe/android/customersheet/util/SyncDefaultPaymentMethodUtilsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,38:1\n774#2:39\n865#2,2:40\n1#3:42\n*S KotlinDebug\n*F\n+ 1 SyncDefaultPaymentMethodUtils.kt\ncom/stripe/android/customersheet/util/SyncDefaultPaymentMethodUtilsKt\n*L\n15#1:39\n15#1:40,2\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\u001a \u0010\u0000\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0001*\u0008\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0000\u001a\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0000\u001a\"\u0010\u0008\u001a\u0004\u0018\u00010\t2\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u00012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u000cH\u0000\u00a8\u0006\r"
    }
    d2 = {
        "filterToSupportedPaymentMethods",
        "",
        "Lcom/stripe/android/model/PaymentMethod;",
        "isSyncDefaultPaymentMethodFeatureEnabled",
        "",
        "getDefaultPaymentMethodsEnabledForCustomerSheet",
        "elementsSession",
        "Lcom/stripe/android/model/ElementsSession;",
        "getDefaultPaymentMethodAsPaymentSelection",
        "Lcom/stripe/android/paymentsheet/model/PaymentSelection;",
        "paymentMethods",
        "defaultPaymentMethodId",
        "",
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
.method public static final filterToSupportedPaymentMethods(Ljava/util/List;Z)Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/stripe/android/model/PaymentMethod;",
            ">;Z)",
            "Ljava/util/List<",
            "Lcom/stripe/android/model/PaymentMethod;",
            ">;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x2

    .line 11
    new-array v0, v0, [Lcom/stripe/android/model/PaymentMethod$Type;

    const/4 v1, 0x0

    sget-object v2, Lcom/stripe/android/model/PaymentMethod$Type;->Card:Lcom/stripe/android/model/PaymentMethod$Type;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    .line 12
    sget-object v2, Lcom/stripe/android/model/PaymentMethod$Type;->USBankAccount:Lcom/stripe/android/model/PaymentMethod$Type;

    aput-object v2, v0, v1

    .line 10
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    .line 15
    check-cast p0, Ljava/lang/Iterable;

    .line 39
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    check-cast v1, Ljava/util/Collection;

    .line 40
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lcom/stripe/android/model/PaymentMethod;

    if-eqz p1, :cond_1

    .line 17
    move-object v4, v0

    check-cast v4, Ljava/lang/Iterable;

    iget-object v3, v3, Lcom/stripe/android/model/PaymentMethod;->type:Lcom/stripe/android/model/PaymentMethod$Type;

    invoke-static {v4, v3}, Lkotlin/collections/CollectionsKt;->contains(Ljava/lang/Iterable;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 40
    :cond_1
    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 41
    :cond_2
    check-cast v1, Ljava/util/List;

    return-object v1
.end method

.method public static final getDefaultPaymentMethodAsPaymentSelection(Ljava/util/List;Ljava/lang/String;)Lcom/stripe/android/paymentsheet/model/PaymentSelection;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/stripe/android/model/PaymentMethod;",
            ">;",
            "Ljava/lang/String;",
            ")",
            "Lcom/stripe/android/paymentsheet/model/PaymentSelection;"
        }
    .end annotation

    const-string v0, "paymentMethods"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    check-cast p0, Ljava/lang/Iterable;

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/stripe/android/model/PaymentMethod;

    .line 35
    iget-object v2, v2, Lcom/stripe/android/model/PaymentMethod;->id:Ljava/lang/String;

    invoke-static {v2, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_1
    move-object v0, v1

    .line 34
    :goto_0
    move-object v3, v0

    check-cast v3, Lcom/stripe/android/model/PaymentMethod;

    if-eqz v3, :cond_2

    .line 36
    new-instance v2, Lcom/stripe/android/paymentsheet/model/PaymentSelection$Saved;

    const/4 v6, 0x6

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v2 .. v7}, Lcom/stripe/android/paymentsheet/model/PaymentSelection$Saved;-><init>(Lcom/stripe/android/model/PaymentMethod;Lcom/stripe/android/paymentsheet/model/PaymentSelection$Saved$WalletType;Lcom/stripe/android/model/PaymentMethodOptionsParams;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v1, v2

    :cond_2
    check-cast v1, Lcom/stripe/android/paymentsheet/model/PaymentSelection;

    return-object v1
.end method

.method public static final getDefaultPaymentMethodsEnabledForCustomerSheet(Lcom/stripe/android/model/ElementsSession;)Z
    .locals 1

    const-string v0, "elementsSession"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    invoke-virtual {p0}, Lcom/stripe/android/model/ElementsSession;->getCustomer()Lcom/stripe/android/model/ElementsSession$Customer;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lcom/stripe/android/model/ElementsSession$Customer;->getSession()Lcom/stripe/android/model/ElementsSession$Customer$Session;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lcom/stripe/android/model/ElementsSession$Customer$Session;->getComponents()Lcom/stripe/android/model/ElementsSession$Customer$Components;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lcom/stripe/android/model/ElementsSession$Customer$Components;->getCustomerSheet()Lcom/stripe/android/model/ElementsSession$Customer$Components$CustomerSheet;

    move-result-object p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    .line 23
    :goto_0
    instance-of v0, p0, Lcom/stripe/android/model/ElementsSession$Customer$Components$CustomerSheet$Enabled;

    if-eqz v0, :cond_1

    .line 24
    check-cast p0, Lcom/stripe/android/model/ElementsSession$Customer$Components$CustomerSheet$Enabled;

    invoke-virtual {p0}, Lcom/stripe/android/model/ElementsSession$Customer$Components$CustomerSheet$Enabled;->isPaymentMethodSyncDefaultEnabled()Z

    move-result p0

    return p0

    .line 25
    :cond_1
    sget-object v0, Lcom/stripe/android/model/ElementsSession$Customer$Components$CustomerSheet$Disabled;->INSTANCE:Lcom/stripe/android/model/ElementsSession$Customer$Components$CustomerSheet$Disabled;

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    if-nez p0, :cond_2

    goto :goto_1

    .line 22
    :cond_2
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_3
    :goto_1
    const/4 p0, 0x0

    return p0
.end method
