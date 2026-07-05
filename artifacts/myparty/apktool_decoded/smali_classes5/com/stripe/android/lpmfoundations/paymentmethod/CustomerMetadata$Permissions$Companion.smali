.class public final Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata$Permissions$Companion;
.super Ljava/lang/Object;
.source "CustomerMetadata.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata$Permissions;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u001d\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\tH\u0000\u00a2\u0006\u0002\u0008\nJ\u0015\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0000\u00a2\u0006\u0002\u0008\u000cJ\u001d\u0010\r\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0000\u00a2\u0006\u0002\u0008\u0011J\r\u0010\u0012\u001a\u00020\u0005H\u0000\u00a2\u0006\u0002\u0008\u0013\u00a8\u0006\u0014"
    }
    d2 = {
        "Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata$Permissions$Companion;",
        "",
        "<init>",
        "()V",
        "createForPaymentSheetCustomerSession",
        "Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata$Permissions;",
        "configuration",
        "Lcom/stripe/android/common/model/CommonConfiguration;",
        "customer",
        "Lcom/stripe/android/model/ElementsSession$Customer;",
        "createForPaymentSheetCustomerSession$paymentsheet_release",
        "createForPaymentSheetLegacyEphemeralKey",
        "createForPaymentSheetLegacyEphemeralKey$paymentsheet_release",
        "createForCustomerSheet",
        "Lcom/stripe/android/customersheet/CustomerSheet$Configuration;",
        "customerSheetSession",
        "Lcom/stripe/android/customersheet/data/CustomerSheetSession;",
        "createForCustomerSheet$paymentsheet_release",
        "createForNativeLink",
        "createForNativeLink$paymentsheet_release",
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


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata$Permissions$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final createForCustomerSheet$paymentsheet_release(Lcom/stripe/android/customersheet/CustomerSheet$Configuration;Lcom/stripe/android/customersheet/data/CustomerSheetSession;)Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata$Permissions;
    .locals 3

    const-string v0, "configuration"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "customerSheetSession"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 80
    new-instance v0, Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata$Permissions;

    .line 81
    invoke-virtual {p2}, Lcom/stripe/android/customersheet/data/CustomerSheetSession;->getPermissions()Lcom/stripe/android/customersheet/CustomerPermissions;

    move-result-object v1

    invoke-virtual {v1}, Lcom/stripe/android/customersheet/CustomerPermissions;->getCanRemovePaymentMethods()Z

    move-result v1

    .line 82
    invoke-virtual {p1}, Lcom/stripe/android/customersheet/CustomerSheet$Configuration;->getAllowsRemovalOfLastSavedPaymentMethod$paymentsheet_release()Z

    move-result p1

    .line 85
    invoke-virtual {p2}, Lcom/stripe/android/customersheet/data/CustomerSheetSession;->getPermissions()Lcom/stripe/android/customersheet/CustomerPermissions;

    move-result-object p2

    invoke-virtual {p2}, Lcom/stripe/android/customersheet/CustomerPermissions;->getCanUpdateFullPaymentMethodDetails()Z

    move-result p2

    const/4 v2, 0x1

    .line 80
    invoke-direct {v0, v1, p1, v2, p2}, Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata$Permissions;-><init>(ZZZZ)V

    return-object v0
.end method

.method public final createForNativeLink$paymentsheet_release()Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata$Permissions;
    .locals 2

    .line 91
    new-instance v0, Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata$Permissions;

    const/4 v1, 0x0

    invoke-direct {v0, v1, v1, v1, v1}, Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata$Permissions;-><init>(ZZZZ)V

    return-object v0
.end method

.method public final createForPaymentSheetCustomerSession$paymentsheet_release(Lcom/stripe/android/common/model/CommonConfiguration;Lcom/stripe/android/model/ElementsSession$Customer;)Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata$Permissions;
    .locals 4

    const-string v0, "configuration"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "customer"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    invoke-virtual {p2}, Lcom/stripe/android/model/ElementsSession$Customer;->getSession()Lcom/stripe/android/model/ElementsSession$Customer$Session;

    move-result-object p2

    invoke-virtual {p2}, Lcom/stripe/android/model/ElementsSession$Customer$Session;->getComponents()Lcom/stripe/android/model/ElementsSession$Customer$Components;

    move-result-object p2

    invoke-virtual {p2}, Lcom/stripe/android/model/ElementsSession$Customer$Components;->getMobilePaymentElement()Lcom/stripe/android/model/ElementsSession$Customer$Components$MobilePaymentElement;

    move-result-object p2

    .line 31
    instance-of v0, p2, Lcom/stripe/android/model/ElementsSession$Customer$Components$MobilePaymentElement$Enabled;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 32
    move-object v2, p2

    check-cast v2, Lcom/stripe/android/model/ElementsSession$Customer$Components$MobilePaymentElement$Enabled;

    invoke-virtual {v2}, Lcom/stripe/android/model/ElementsSession$Customer$Components$MobilePaymentElement$Enabled;->isPaymentMethodRemoveEnabled()Z

    move-result v2

    goto :goto_0

    .line 34
    :cond_0
    instance-of v2, p2, Lcom/stripe/android/model/ElementsSession$Customer$Components$MobilePaymentElement$Disabled;

    if-eqz v2, :cond_2

    move v2, v1

    .line 37
    :goto_0
    invoke-virtual {p1}, Lcom/stripe/android/common/model/CommonConfiguration;->getAllowsRemovalOfLastSavedPaymentMethod()Z

    move-result p1

    const/4 v3, 0x1

    if-eqz p1, :cond_1

    if-eqz v0, :cond_1

    .line 39
    check-cast p2, Lcom/stripe/android/model/ElementsSession$Customer$Components$MobilePaymentElement$Enabled;

    invoke-virtual {p2}, Lcom/stripe/android/model/ElementsSession$Customer$Components$MobilePaymentElement$Enabled;->getCanRemoveLastPaymentMethod()Z

    move-result p1

    if-eqz p1, :cond_1

    move v1, v3

    .line 41
    :cond_1
    new-instance p1, Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata$Permissions;

    invoke-direct {p1, v2, v1, v3, v3}, Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata$Permissions;-><init>(ZZZZ)V

    return-object p1

    .line 30
    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public final createForPaymentSheetLegacyEphemeralKey$paymentsheet_release(Lcom/stripe/android/common/model/CommonConfiguration;)Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata$Permissions;
    .locals 3

    const-string v0, "configuration"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 54
    new-instance v0, Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata$Permissions;

    .line 66
    invoke-virtual {p1}, Lcom/stripe/android/common/model/CommonConfiguration;->getAllowsRemovalOfLastSavedPaymentMethod()Z

    move-result p1

    const/4 v1, 0x0

    const/4 v2, 0x1

    .line 54
    invoke-direct {v0, v2, p1, v1, v1}, Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata$Permissions;-><init>(ZZZZ)V

    return-object v0
.end method
