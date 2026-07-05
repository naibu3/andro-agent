.class public final Lcom/stripe/android/paymentsheet/model/PaymentOptionLabelsFactory;
.super Ljava/lang/Object;
.source "PaymentOptionLabelsFactory.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nPaymentOptionLabelsFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentOptionLabelsFactory.kt\ncom/stripe/android/paymentsheet/model/PaymentOptionLabelsFactory\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,151:1\n1#2:152\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\u0008\u00c1\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\tJ\u0018\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\u000bH\u0002J\u0018\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\u000cH\u0002J\u0018\u0010\r\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\u000eH\u0002J\u0018\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0018\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u0018\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u001a\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0008\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0002\u00a8\u0006\u001d"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/model/PaymentOptionLabelsFactory;",
        "",
        "<init>",
        "()V",
        "create",
        "Lcom/stripe/android/paymentsheet/model/PaymentOption$Labels;",
        "context",
        "Landroid/content/Context;",
        "selection",
        "Lcom/stripe/android/paymentsheet/model/PaymentSelection;",
        "newCard",
        "Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$Card;",
        "Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$LinkInline;",
        "newUSBankAccount",
        "Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$USBankAccount;",
        "savedLink",
        "linkDetails",
        "Lcom/stripe/android/model/LinkPaymentDetails;",
        "savedCard",
        "card",
        "Lcom/stripe/android/model/PaymentMethod$Card;",
        "savedUSBankAccount",
        "usBankAccount",
        "Lcom/stripe/android/model/PaymentMethod$USBankAccount;",
        "label",
        "",
        "link",
        "paymentMethod",
        "Lcom/stripe/android/link/LinkPaymentMethod;",
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

.field public static final INSTANCE:Lcom/stripe/android/paymentsheet/model/PaymentOptionLabelsFactory;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/paymentsheet/model/PaymentOptionLabelsFactory;

    invoke-direct {v0}, Lcom/stripe/android/paymentsheet/model/PaymentOptionLabelsFactory;-><init>()V

    sput-object v0, Lcom/stripe/android/paymentsheet/model/PaymentOptionLabelsFactory;->INSTANCE:Lcom/stripe/android/paymentsheet/model/PaymentOptionLabelsFactory;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final link(Landroid/content/Context;Lcom/stripe/android/link/LinkPaymentMethod;)Lcom/stripe/android/paymentsheet/model/PaymentOption$Labels;
    .locals 2

    if-eqz p2, :cond_0

    .line 144
    invoke-virtual {p2}, Lcom/stripe/android/link/LinkPaymentMethod;->getDetails()Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;

    move-result-object p2

    if-eqz p2, :cond_0

    invoke-static {p2}, Lcom/stripe/android/link/ui/wallet/PaymentDetailsNicknameKt;->getPaymentOptionLabel(Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;)Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object p2

    if-eqz p2, :cond_0

    invoke-interface {p2, p1}, Lcom/stripe/android/core/strings/ResolvableString;->resolve(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p2

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    .line 145
    :goto_0
    new-instance v0, Lcom/stripe/android/paymentsheet/model/PaymentOption$Labels;

    .line 146
    sget v1, Lcom/stripe/android/R$string;->stripe_link:I

    invoke-static {v1}, Lcom/stripe/android/core/strings/ResolvableStringUtilsKt;->getResolvableString(I)Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object v1

    invoke-interface {v1, p1}, Lcom/stripe/android/core/strings/ResolvableString;->resolve(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p1

    .line 145
    invoke-direct {v0, p1, p2}, Lcom/stripe/android/paymentsheet/model/PaymentOption$Labels;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method private final newCard(Landroid/content/Context;Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$Card;)Lcom/stripe/android/paymentsheet/model/PaymentOption$Labels;
    .locals 2

    .line 61
    new-instance v0, Lcom/stripe/android/paymentsheet/model/PaymentOption$Labels;

    .line 62
    invoke-virtual {p2}, Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$Card;->getBrand()Lcom/stripe/android/model/CardBrand;

    move-result-object v1

    invoke-virtual {v1}, Lcom/stripe/android/model/CardBrand;->getDisplayName()Ljava/lang/String;

    move-result-object v1

    .line 63
    check-cast p2, Lcom/stripe/android/paymentsheet/model/PaymentSelection;

    invoke-static {p2}, Lcom/stripe/android/paymentsheet/model/PaymentSelectionKt;->getLabel(Lcom/stripe/android/paymentsheet/model/PaymentSelection;)Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object p2

    invoke-interface {p2, p1}, Lcom/stripe/android/core/strings/ResolvableString;->resolve(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p1

    .line 61
    invoke-direct {v0, v1, p1}, Lcom/stripe/android/paymentsheet/model/PaymentOption$Labels;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method private final newCard(Landroid/content/Context;Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$LinkInline;)Lcom/stripe/android/paymentsheet/model/PaymentOption$Labels;
    .locals 2

    .line 71
    new-instance v0, Lcom/stripe/android/paymentsheet/model/PaymentOption$Labels;

    .line 72
    invoke-virtual {p2}, Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$LinkInline;->getBrand()Lcom/stripe/android/model/CardBrand;

    move-result-object v1

    invoke-virtual {v1}, Lcom/stripe/android/model/CardBrand;->getDisplayName()Ljava/lang/String;

    move-result-object v1

    .line 73
    check-cast p2, Lcom/stripe/android/paymentsheet/model/PaymentSelection;

    invoke-static {p2}, Lcom/stripe/android/paymentsheet/model/PaymentSelectionKt;->getLabel(Lcom/stripe/android/paymentsheet/model/PaymentSelection;)Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object p2

    invoke-interface {p2, p1}, Lcom/stripe/android/core/strings/ResolvableString;->resolve(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p1

    .line 71
    invoke-direct {v0, v1, p1}, Lcom/stripe/android/paymentsheet/model/PaymentOption$Labels;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method private final newUSBankAccount(Landroid/content/Context;Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$USBankAccount;)Lcom/stripe/android/paymentsheet/model/PaymentOption$Labels;
    .locals 2

    .line 81
    invoke-virtual {p2}, Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$USBankAccount;->getLabel()Ljava/lang/String;

    move-result-object v0

    .line 82
    invoke-virtual {p2}, Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$USBankAccount;->getScreenState()Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/BankFormScreenState;

    move-result-object p2

    invoke-virtual {p2}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/BankFormScreenState;->getLinkedBankAccount()Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/BankFormScreenState$LinkedBankAccount;

    move-result-object p2

    if-eqz p2, :cond_0

    invoke-virtual {p2}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/BankFormScreenState$LinkedBankAccount;->getBankName()Ljava/lang/String;

    move-result-object p2

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    .line 83
    :goto_0
    new-instance v1, Lcom/stripe/android/paymentsheet/model/PaymentOption$Labels;

    if-nez p2, :cond_1

    .line 84
    sget p2, Lcom/stripe/android/ui/core/R$string;->stripe_payment_method_bank:I

    invoke-static {p2}, Lcom/stripe/android/core/strings/ResolvableStringUtilsKt;->getResolvableString(I)Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object p2

    invoke-interface {p2, p1}, Lcom/stripe/android/core/strings/ResolvableString;->resolve(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p2

    .line 83
    :cond_1
    invoke-direct {v1, p2, v0}, Lcom/stripe/android/paymentsheet/model/PaymentOption$Labels;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v1
.end method

.method private final savedCard(Landroid/content/Context;Lcom/stripe/android/model/PaymentMethod$Card;)Lcom/stripe/android/paymentsheet/model/PaymentOption$Labels;
    .locals 3

    .line 103
    iget-object v0, p2, Lcom/stripe/android/model/PaymentMethod$Card;->displayBrand:Ljava/lang/String;

    if-eqz v0, :cond_0

    sget-object v1, Lcom/stripe/android/model/CardBrand;->Companion:Lcom/stripe/android/model/CardBrand$Companion;

    invoke-virtual {v1, v0}, Lcom/stripe/android/model/CardBrand$Companion;->fromCode(Ljava/lang/String;)Lcom/stripe/android/model/CardBrand;

    move-result-object v0

    if-nez v0, :cond_1

    :cond_0
    iget-object v0, p2, Lcom/stripe/android/model/PaymentMethod$Card;->brand:Lcom/stripe/android/model/CardBrand;

    .line 104
    :cond_1
    sget-object v1, Lcom/stripe/android/model/CardBrand;->Unknown:Lcom/stripe/android/model/CardBrand;

    const/4 v2, 0x0

    if-eq v0, v1, :cond_2

    goto :goto_0

    :cond_2
    move-object v0, v2

    .line 106
    :goto_0
    iget-object p2, p2, Lcom/stripe/android/model/PaymentMethod$Card;->last4:Ljava/lang/String;

    invoke-static {p2}, Lcom/stripe/android/paymentsheet/ui/PaymentMethodsUiExtensionKt;->createCardLabel(Ljava/lang/String;)Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object p2

    if-eqz p2, :cond_3

    invoke-interface {p2, p1}, Lcom/stripe/android/core/strings/ResolvableString;->resolve(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p1

    goto :goto_1

    :cond_3
    move-object p1, v2

    :goto_1
    if-nez p1, :cond_4

    const-string p1, ""

    :cond_4
    if-eqz v0, :cond_5

    .line 109
    new-instance p2, Lcom/stripe/android/paymentsheet/model/PaymentOption$Labels;

    .line 110
    invoke-virtual {v0}, Lcom/stripe/android/model/CardBrand;->getDisplayName()Ljava/lang/String;

    move-result-object v0

    .line 109
    invoke-direct {p2, v0, p1}, Lcom/stripe/android/paymentsheet/model/PaymentOption$Labels;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object p2

    .line 114
    :cond_5
    new-instance p2, Lcom/stripe/android/paymentsheet/model/PaymentOption$Labels;

    invoke-direct {p2, p1, v2}, Lcom/stripe/android/paymentsheet/model/PaymentOption$Labels;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object p2
.end method

.method private final savedLink(Landroid/content/Context;Lcom/stripe/android/model/LinkPaymentDetails;)Lcom/stripe/android/paymentsheet/model/PaymentOption$Labels;
    .locals 2

    .line 93
    new-instance v0, Lcom/stripe/android/paymentsheet/model/PaymentOption$Labels;

    .line 94
    sget v1, Lcom/stripe/android/R$string;->stripe_link:I

    invoke-static {v1}, Lcom/stripe/android/core/strings/ResolvableStringUtilsKt;->getResolvableString(I)Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object v1

    invoke-interface {v1, p1}, Lcom/stripe/android/core/strings/ResolvableString;->resolve(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    .line 95
    invoke-static {p2}, Lcom/stripe/android/link/ui/wallet/PaymentDetailsNicknameKt;->getPaymentOptionLabel(Lcom/stripe/android/model/LinkPaymentDetails;)Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object p2

    invoke-interface {p2, p1}, Lcom/stripe/android/core/strings/ResolvableString;->resolve(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p1

    .line 93
    invoke-direct {v0, v1, p1}, Lcom/stripe/android/paymentsheet/model/PaymentOption$Labels;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method private final savedUSBankAccount(Lcom/stripe/android/model/PaymentMethod$USBankAccount;Ljava/lang/String;)Lcom/stripe/android/paymentsheet/model/PaymentOption$Labels;
    .locals 1

    .line 125
    iget-object p1, p1, Lcom/stripe/android/model/PaymentMethod$USBankAccount;->bankName:Ljava/lang/String;

    if-eqz p1, :cond_0

    .line 128
    new-instance v0, Lcom/stripe/android/paymentsheet/model/PaymentOption$Labels;

    invoke-direct {v0, p1, p2}, Lcom/stripe/android/paymentsheet/model/PaymentOption$Labels;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0

    .line 133
    :cond_0
    new-instance p1, Lcom/stripe/android/paymentsheet/model/PaymentOption$Labels;

    const/4 v0, 0x0

    invoke-direct {p1, p2, v0}, Lcom/stripe/android/paymentsheet/model/PaymentOption$Labels;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object p1
.end method


# virtual methods
.method public final create(Landroid/content/Context;Lcom/stripe/android/paymentsheet/model/PaymentSelection;)Lcom/stripe/android/paymentsheet/model/PaymentOption$Labels;
    .locals 5

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "selection"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    invoke-static {p2}, Lcom/stripe/android/paymentsheet/model/PaymentSelectionKt;->getLabel(Lcom/stripe/android/paymentsheet/model/PaymentSelection;)Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/stripe/android/core/strings/ResolvableString;->resolve(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    .line 21
    new-instance v1, Lcom/stripe/android/paymentsheet/model/PaymentOption$Labels;

    const/4 v2, 0x0

    invoke-direct {v1, v0, v2}, Lcom/stripe/android/paymentsheet/model/PaymentOption$Labels;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 27
    instance-of v3, p2, Lcom/stripe/android/paymentsheet/model/PaymentSelection$CustomPaymentMethod;

    if-nez v3, :cond_b

    .line 28
    instance-of v3, p2, Lcom/stripe/android/paymentsheet/model/PaymentSelection$ExternalPaymentMethod;

    if-nez v3, :cond_b

    .line 29
    instance-of v3, p2, Lcom/stripe/android/paymentsheet/model/PaymentSelection$GooglePay;

    if-nez v3, :cond_b

    .line 30
    instance-of v3, p2, Lcom/stripe/android/paymentsheet/model/PaymentSelection$ShopPay;

    if-nez v3, :cond_b

    .line 31
    instance-of v3, p2, Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$GenericPaymentMethod;

    if-eqz v3, :cond_0

    goto :goto_1

    .line 34
    :cond_0
    instance-of v3, p2, Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$Card;

    if-eqz v3, :cond_1

    .line 35
    check-cast p2, Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$Card;

    invoke-direct {p0, p1, p2}, Lcom/stripe/android/paymentsheet/model/PaymentOptionLabelsFactory;->newCard(Landroid/content/Context;Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$Card;)Lcom/stripe/android/paymentsheet/model/PaymentOption$Labels;

    move-result-object p1

    return-object p1

    .line 37
    :cond_1
    instance-of v3, p2, Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$LinkInline;

    if-eqz v3, :cond_2

    .line 38
    check-cast p2, Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$LinkInline;

    invoke-direct {p0, p1, p2}, Lcom/stripe/android/paymentsheet/model/PaymentOptionLabelsFactory;->newCard(Landroid/content/Context;Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$LinkInline;)Lcom/stripe/android/paymentsheet/model/PaymentOption$Labels;

    move-result-object p1

    return-object p1

    .line 40
    :cond_2
    instance-of v3, p2, Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$USBankAccount;

    if-eqz v3, :cond_3

    .line 41
    check-cast p2, Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$USBankAccount;

    invoke-direct {p0, p1, p2}, Lcom/stripe/android/paymentsheet/model/PaymentOptionLabelsFactory;->newUSBankAccount(Landroid/content/Context;Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$USBankAccount;)Lcom/stripe/android/paymentsheet/model/PaymentOption$Labels;

    move-result-object p1

    return-object p1

    .line 43
    :cond_3
    instance-of v3, p2, Lcom/stripe/android/paymentsheet/model/PaymentSelection$Saved;

    if-eqz v3, :cond_9

    .line 44
    check-cast p2, Lcom/stripe/android/paymentsheet/model/PaymentSelection$Saved;

    invoke-virtual {p2}, Lcom/stripe/android/paymentsheet/model/PaymentSelection$Saved;->getPaymentMethod()Lcom/stripe/android/model/PaymentMethod;

    move-result-object p2

    .line 45
    invoke-virtual {p2}, Lcom/stripe/android/model/PaymentMethod;->getLinkPaymentDetails()Lcom/stripe/android/model/LinkPaymentDetails;

    move-result-object v3

    if-eqz v3, :cond_5

    sget-object v4, Lcom/stripe/android/paymentsheet/model/PaymentOptionLabelsFactory;->INSTANCE:Lcom/stripe/android/paymentsheet/model/PaymentOptionLabelsFactory;

    invoke-direct {v4, p1, v3}, Lcom/stripe/android/paymentsheet/model/PaymentOptionLabelsFactory;->savedLink(Landroid/content/Context;Lcom/stripe/android/model/LinkPaymentDetails;)Lcom/stripe/android/paymentsheet/model/PaymentOption$Labels;

    move-result-object v3

    if-nez v3, :cond_4

    goto :goto_0

    :cond_4
    return-object v3

    .line 46
    :cond_5
    :goto_0
    iget-object v3, p2, Lcom/stripe/android/model/PaymentMethod;->card:Lcom/stripe/android/model/PaymentMethod$Card;

    if-eqz v3, :cond_6

    sget-object p2, Lcom/stripe/android/paymentsheet/model/PaymentOptionLabelsFactory;->INSTANCE:Lcom/stripe/android/paymentsheet/model/PaymentOptionLabelsFactory;

    invoke-direct {p2, p1, v3}, Lcom/stripe/android/paymentsheet/model/PaymentOptionLabelsFactory;->savedCard(Landroid/content/Context;Lcom/stripe/android/model/PaymentMethod$Card;)Lcom/stripe/android/paymentsheet/model/PaymentOption$Labels;

    move-result-object p1

    return-object p1

    .line 47
    :cond_6
    iget-object p1, p2, Lcom/stripe/android/model/PaymentMethod;->usBankAccount:Lcom/stripe/android/model/PaymentMethod$USBankAccount;

    if-eqz p1, :cond_7

    sget-object p2, Lcom/stripe/android/paymentsheet/model/PaymentOptionLabelsFactory;->INSTANCE:Lcom/stripe/android/paymentsheet/model/PaymentOptionLabelsFactory;

    invoke-direct {p2, p1, v0}, Lcom/stripe/android/paymentsheet/model/PaymentOptionLabelsFactory;->savedUSBankAccount(Lcom/stripe/android/model/PaymentMethod$USBankAccount;Ljava/lang/String;)Lcom/stripe/android/paymentsheet/model/PaymentOption$Labels;

    move-result-object v2

    :cond_7
    if-nez v2, :cond_8

    goto :goto_1

    :cond_8
    return-object v2

    .line 51
    :cond_9
    instance-of v0, p2, Lcom/stripe/android/paymentsheet/model/PaymentSelection$Link;

    if-eqz v0, :cond_a

    .line 52
    check-cast p2, Lcom/stripe/android/paymentsheet/model/PaymentSelection$Link;

    invoke-virtual {p2}, Lcom/stripe/android/paymentsheet/model/PaymentSelection$Link;->getSelectedPayment()Lcom/stripe/android/link/LinkPaymentMethod;

    move-result-object p2

    invoke-direct {p0, p1, p2}, Lcom/stripe/android/paymentsheet/model/PaymentOptionLabelsFactory;->link(Landroid/content/Context;Lcom/stripe/android/link/LinkPaymentMethod;)Lcom/stripe/android/paymentsheet/model/PaymentOption$Labels;

    move-result-object p1

    return-object p1

    .line 26
    :cond_a
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_b
    :goto_1
    return-object v1
.end method
