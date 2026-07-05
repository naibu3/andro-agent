.class public final Lcom/stripe/android/link/ui/wallet/PaymentDetailsNicknameKt;
.super Ljava/lang/Object;
.source "PaymentDetailsNickname.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nPaymentDetailsNickname.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentDetailsNickname.kt\ncom/stripe/android/link/ui/wallet/PaymentDetailsNicknameKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,82:1\n2669#2,7:83\n*S KotlinDebug\n*F\n+ 1 PaymentDetailsNickname.kt\ncom/stripe/android/link/ui/wallet/PaymentDetailsNicknameKt\n*L\n78#1:83,7\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010 \n\u0002\u0008\u0002\u001a\"\u0010\r\u001a\u00020\u00012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002\u001a\u001c\u0010\u0013\u001a\u00020\u00012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u000fH\u0002\u001a\u0018\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fH\u0002\u001a\u001a\u0010\u0016\u001a\u00020\u0001*\u0008\u0012\u0004\u0012\u00020\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u000fH\u0002\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0003\u0010\u0004\"\u0018\u0010\u0005\u001a\u00020\u0001*\u00020\u00028@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0006\u0010\u0004\"\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u0001*\u00020\u00028@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0008\u0010\u0004\"\u0018\u0010\t\u001a\u00020\u0001*\u00020\n8@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000b\u0010\u000c\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\n8@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0003\u0010\u000c\u00a8\u0006\u0019"
    }
    d2 = {
        "paymentOptionLabel",
        "Lcom/stripe/android/core/strings/ResolvableString;",
        "Lcom/stripe/android/model/LinkPaymentDetails;",
        "getPaymentOptionLabel",
        "(Lcom/stripe/android/model/LinkPaymentDetails;)Lcom/stripe/android/core/strings/ResolvableString;",
        "label",
        "getLabel",
        "sublabel",
        "getSublabel",
        "displayName",
        "Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;",
        "getDisplayName",
        "(Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;)Lcom/stripe/android/core/strings/ResolvableString;",
        "makeCardDisplayName",
        "nickname",
        "",
        "funding",
        "brand",
        "Lcom/stripe/android/model/CardBrand;",
        "makeBankAccountDisplayName",
        "bankName",
        "makeFallbackCardName",
        "joinToString",
        "",
        "separator",
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
.method public static final getDisplayName(Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;)Lcom/stripe/android/core/strings/ResolvableString;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    instance-of v0, p0, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;

    if-eqz v0, :cond_0

    check-cast p0, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;

    invoke-virtual {p0}, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->getNickname()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->getFunding()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->getBrand()Lcom/stripe/android/model/CardBrand;

    move-result-object p0

    invoke-static {v0, v1, p0}, Lcom/stripe/android/link/ui/wallet/PaymentDetailsNicknameKt;->makeCardDisplayName(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/CardBrand;)Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object p0

    return-object p0

    .line 35
    :cond_0
    instance-of v0, p0, Lcom/stripe/android/model/ConsumerPaymentDetails$BankAccount;

    if-eqz v0, :cond_1

    check-cast p0, Lcom/stripe/android/model/ConsumerPaymentDetails$BankAccount;

    invoke-virtual {p0}, Lcom/stripe/android/model/ConsumerPaymentDetails$BankAccount;->getNickname()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lcom/stripe/android/model/ConsumerPaymentDetails$BankAccount;->getBankName()Ljava/lang/String;

    move-result-object p0

    invoke-static {v0, p0}, Lcom/stripe/android/link/ui/wallet/PaymentDetailsNicknameKt;->makeBankAccountDisplayName(Ljava/lang/String;Ljava/lang/String;)Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object p0

    return-object p0

    .line 36
    :cond_1
    instance-of v0, p0, Lcom/stripe/android/model/ConsumerPaymentDetails$Passthrough;

    if-eqz v0, :cond_2

    .line 37
    check-cast p0, Lcom/stripe/android/model/ConsumerPaymentDetails$Passthrough;

    invoke-virtual {p0}, Lcom/stripe/android/model/ConsumerPaymentDetails$Passthrough;->getLast4()Ljava/lang/String;

    move-result-object p0

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "\u2022\u2022\u2022\u2022 "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/stripe/android/core/strings/ResolvableStringUtilsKt;->getResolvableString(Ljava/lang/String;)Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object p0

    return-object p0

    .line 33
    :cond_2
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method

.method public static final getLabel(Lcom/stripe/android/model/LinkPaymentDetails;)Lcom/stripe/android/core/strings/ResolvableString;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    instance-of v0, p0, Lcom/stripe/android/model/LinkPaymentDetails$Card;

    if-eqz v0, :cond_0

    check-cast p0, Lcom/stripe/android/model/LinkPaymentDetails$Card;

    invoke-virtual {p0}, Lcom/stripe/android/model/LinkPaymentDetails$Card;->getNickname()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lcom/stripe/android/model/LinkPaymentDetails$Card;->getFunding()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lcom/stripe/android/model/LinkPaymentDetails$Card;->getBrand()Lcom/stripe/android/model/CardBrand;

    move-result-object p0

    invoke-static {v0, v1, p0}, Lcom/stripe/android/link/ui/wallet/PaymentDetailsNicknameKt;->makeCardDisplayName(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/CardBrand;)Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object p0

    return-object p0

    .line 23
    :cond_0
    instance-of v0, p0, Lcom/stripe/android/model/LinkPaymentDetails$BankAccount;

    if-eqz v0, :cond_3

    check-cast p0, Lcom/stripe/android/model/LinkPaymentDetails$BankAccount;

    invoke-virtual {p0}, Lcom/stripe/android/model/LinkPaymentDetails$BankAccount;->getBankName()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-static {v0}, Lcom/stripe/android/core/strings/ResolvableStringUtilsKt;->getResolvableString(Ljava/lang/String;)Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    return-object v0

    :cond_2
    :goto_0
    invoke-virtual {p0}, Lcom/stripe/android/model/LinkPaymentDetails$BankAccount;->getLast4()Ljava/lang/String;

    move-result-object p0

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "\u2022\u2022\u2022\u2022"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/stripe/android/core/strings/ResolvableStringUtilsKt;->getResolvableString(Ljava/lang/String;)Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object p0

    return-object p0

    .line 21
    :cond_3
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method

.method public static final getPaymentOptionLabel(Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;)Lcom/stripe/android/core/strings/ResolvableString;
    .locals 7

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 44
    instance-of v0, p0, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x2

    const-string v4, "\u2022\u2022\u2022\u2022 "

    if-eqz v0, :cond_0

    .line 45
    new-array v0, v3, [Lcom/stripe/android/core/strings/ResolvableString;

    check-cast p0, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;

    invoke-virtual {p0}, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->getNickname()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0}, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->getFunding()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p0}, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->getBrand()Lcom/stripe/android/model/CardBrand;

    move-result-object v6

    invoke-static {v3, v5, v6}, Lcom/stripe/android/link/ui/wallet/PaymentDetailsNicknameKt;->makeCardDisplayName(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/CardBrand;)Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object v3

    aput-object v3, v0, v2

    invoke-virtual {p0}, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->getLast4()Ljava/lang/String;

    move-result-object p0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/stripe/android/core/strings/ResolvableStringUtilsKt;->getResolvableString(Ljava/lang/String;)Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object p0

    aput-object p0, v0, v1

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    goto :goto_0

    .line 47
    :cond_0
    instance-of v0, p0, Lcom/stripe/android/model/ConsumerPaymentDetails$BankAccount;

    if-eqz v0, :cond_1

    .line 48
    new-array v0, v3, [Lcom/stripe/android/core/strings/ResolvableString;

    check-cast p0, Lcom/stripe/android/model/ConsumerPaymentDetails$BankAccount;

    invoke-virtual {p0}, Lcom/stripe/android/model/ConsumerPaymentDetails$BankAccount;->getNickname()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0}, Lcom/stripe/android/model/ConsumerPaymentDetails$BankAccount;->getBankName()Ljava/lang/String;

    move-result-object v5

    invoke-static {v3, v5}, Lcom/stripe/android/link/ui/wallet/PaymentDetailsNicknameKt;->makeBankAccountDisplayName(Ljava/lang/String;Ljava/lang/String;)Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object v3

    aput-object v3, v0, v2

    invoke-virtual {p0}, Lcom/stripe/android/model/ConsumerPaymentDetails$BankAccount;->getLast4()Ljava/lang/String;

    move-result-object p0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/stripe/android/core/strings/ResolvableStringUtilsKt;->getResolvableString(Ljava/lang/String;)Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object p0

    aput-object p0, v0, v1

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    goto :goto_0

    .line 50
    :cond_1
    instance-of v0, p0, Lcom/stripe/android/model/ConsumerPaymentDetails$Passthrough;

    if-eqz v0, :cond_2

    .line 51
    check-cast p0, Lcom/stripe/android/model/ConsumerPaymentDetails$Passthrough;

    invoke-virtual {p0}, Lcom/stripe/android/model/ConsumerPaymentDetails$Passthrough;->getLast4()Ljava/lang/String;

    move-result-object p0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/stripe/android/core/strings/ResolvableStringUtilsKt;->getResolvableString(Ljava/lang/String;)Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object p0

    invoke-static {p0}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    .line 54
    :goto_0
    const-string v0, " "

    invoke-static {p0, v0}, Lcom/stripe/android/link/ui/wallet/PaymentDetailsNicknameKt;->joinToString(Ljava/util/List;Ljava/lang/String;)Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object p0

    return-object p0

    .line 43
    :cond_2
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method

.method public static final getPaymentOptionLabel(Lcom/stripe/android/model/LinkPaymentDetails;)Lcom/stripe/android/core/strings/ResolvableString;
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x2

    .line 16
    new-array v0, v0, [Lcom/stripe/android/core/strings/ResolvableString;

    const/4 v1, 0x0

    invoke-static {p0}, Lcom/stripe/android/link/ui/wallet/PaymentDetailsNicknameKt;->getLabel(Lcom/stripe/android/model/LinkPaymentDetails;)Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x1

    invoke-static {p0}, Lcom/stripe/android/link/ui/wallet/PaymentDetailsNicknameKt;->getSublabel(Lcom/stripe/android/model/LinkPaymentDetails;)Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object p0

    aput-object p0, v0, v1

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOfNotNull([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    .line 17
    const-string v0, " "

    invoke-static {p0, v0}, Lcom/stripe/android/link/ui/wallet/PaymentDetailsNicknameKt;->joinToString(Ljava/util/List;Ljava/lang/String;)Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object p0

    return-object p0
.end method

.method public static final getSublabel(Lcom/stripe/android/model/LinkPaymentDetails;)Lcom/stripe/android/core/strings/ResolvableString;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    instance-of v0, p0, Lcom/stripe/android/model/LinkPaymentDetails$Card;

    if-eqz v0, :cond_0

    check-cast p0, Lcom/stripe/android/model/LinkPaymentDetails$Card;

    invoke-virtual {p0}, Lcom/stripe/android/model/LinkPaymentDetails$Card;->getLast4()Ljava/lang/String;

    move-result-object p0

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "\u2022\u2022\u2022\u2022 "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/stripe/android/core/strings/ResolvableStringUtilsKt;->getResolvableString(Ljava/lang/String;)Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object p0

    return-object p0

    .line 29
    :cond_0
    instance-of v0, p0, Lcom/stripe/android/model/LinkPaymentDetails$BankAccount;

    if-eqz v0, :cond_2

    check-cast p0, Lcom/stripe/android/model/LinkPaymentDetails$BankAccount;

    invoke-virtual {p0}, Lcom/stripe/android/model/LinkPaymentDetails$BankAccount;->getBankName()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/stripe/android/model/LinkPaymentDetails$BankAccount;->getLast4()Ljava/lang/String;

    move-result-object p0

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "\u2022\u2022\u2022\u2022"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/stripe/android/core/strings/ResolvableStringUtilsKt;->getResolvableString(Ljava/lang/String;)Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object p0

    return-object p0

    :cond_1
    const/4 p0, 0x0

    return-object p0

    .line 27
    :cond_2
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method

.method private static final joinToString(Ljava/util/List;Ljava/lang/String;)Lcom/stripe/android/core/strings/ResolvableString;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lcom/stripe/android/core/strings/ResolvableString;",
            ">;",
            "Ljava/lang/String;",
            ")",
            "Lcom/stripe/android/core/strings/ResolvableString;"
        }
    .end annotation

    .line 78
    check-cast p0, Ljava/lang/Iterable;

    .line 83
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    .line 84
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 85
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    .line 86
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 87
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/stripe/android/core/strings/ResolvableString;

    check-cast v0, Lcom/stripe/android/core/strings/ResolvableString;

    .line 79
    invoke-static {p1}, Lcom/stripe/android/core/strings/ResolvableStringUtilsKt;->getResolvableString(Ljava/lang/String;)Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object v2

    invoke-static {v0, v2}, Lcom/stripe/android/core/strings/ResolvableStringUtilsKt;->plus(Lcom/stripe/android/core/strings/ResolvableString;Lcom/stripe/android/core/strings/ResolvableString;)Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object v0

    invoke-static {v0, v1}, Lcom/stripe/android/core/strings/ResolvableStringUtilsKt;->plus(Lcom/stripe/android/core/strings/ResolvableString;Lcom/stripe/android/core/strings/ResolvableString;)Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object v0

    goto :goto_0

    .line 89
    :cond_0
    check-cast v0, Lcom/stripe/android/core/strings/ResolvableString;

    return-object v0

    .line 84
    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Empty collection can\'t be reduced."

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private static final makeBankAccountDisplayName(Ljava/lang/String;Ljava/lang/String;)Lcom/stripe/android/core/strings/ResolvableString;
    .locals 0

    if-eqz p0, :cond_1

    .line 62
    invoke-static {p0}, Lcom/stripe/android/core/strings/ResolvableStringUtilsKt;->getResolvableString(Ljava/lang/String;)Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object p0

    if-nez p0, :cond_0

    goto :goto_0

    :cond_0
    return-object p0

    :cond_1
    :goto_0
    if-eqz p1, :cond_2

    .line 63
    invoke-static {p1}, Lcom/stripe/android/core/strings/ResolvableStringUtilsKt;->getResolvableString(Ljava/lang/String;)Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object p0

    return-object p0

    .line 64
    :cond_2
    sget p0, Lcom/stripe/android/ui/core/R$string;->stripe_payment_method_bank:I

    invoke-static {p0}, Lcom/stripe/android/core/strings/ResolvableStringUtilsKt;->getResolvableString(I)Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object p0

    return-object p0
.end method

.method private static final makeCardDisplayName(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/CardBrand;)Lcom/stripe/android/core/strings/ResolvableString;
    .locals 0

    if-eqz p0, :cond_1

    .line 58
    invoke-static {p0}, Lcom/stripe/android/core/strings/ResolvableStringUtilsKt;->getResolvableString(Ljava/lang/String;)Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object p0

    if-nez p0, :cond_0

    goto :goto_0

    :cond_0
    return-object p0

    :cond_1
    :goto_0
    invoke-virtual {p2}, Lcom/stripe/android/model/CardBrand;->getDisplayName()Ljava/lang/String;

    move-result-object p0

    invoke-static {p1, p0}, Lcom/stripe/android/link/ui/wallet/PaymentDetailsNicknameKt;->makeFallbackCardName(Ljava/lang/String;Ljava/lang/String;)Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object p0

    return-object p0
.end method

.method private static final makeFallbackCardName(Ljava/lang/String;Ljava/lang/String;)Lcom/stripe/android/core/strings/ResolvableString;
    .locals 3

    .line 68
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/4 v1, 0x4

    const/4 v2, 0x0

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, "CREDIT"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_0

    goto :goto_0

    .line 69
    :cond_0
    sget p0, Lcom/stripe/android/paymentsheet/R$string;->stripe_link_card_type_credit:I

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p0, p1, v2, v1, v2}, Lcom/stripe/android/core/strings/ResolvableStringUtilsKt;->resolvableString$default(I[Ljava/lang/Object;Ljava/util/List;ILjava/lang/Object;)Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object p0

    return-object p0

    .line 68
    :sswitch_1
    const-string v0, "FUNDING_INVALID"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_1

    goto :goto_0

    :sswitch_2
    const-string v0, "CHARGE"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_1

    goto :goto_0

    .line 72
    :cond_1
    sget p0, Lcom/stripe/android/paymentsheet/R$string;->stripe_link_card_type_unknown:I

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p0, p1, v2, v1, v2}, Lcom/stripe/android/core/strings/ResolvableStringUtilsKt;->resolvableString$default(I[Ljava/lang/Object;Ljava/util/List;ILjava/lang/Object;)Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object p0

    return-object p0

    .line 68
    :sswitch_3
    const-string v0, "PREPAID"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_2

    goto :goto_0

    .line 71
    :cond_2
    sget p0, Lcom/stripe/android/paymentsheet/R$string;->stripe_link_card_type_prepaid:I

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p0, p1, v2, v1, v2}, Lcom/stripe/android/core/strings/ResolvableStringUtilsKt;->resolvableString$default(I[Ljava/lang/Object;Ljava/util/List;ILjava/lang/Object;)Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object p0

    return-object p0

    .line 68
    :sswitch_4
    const-string v0, "DEBIT"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_3

    goto :goto_0

    .line 70
    :cond_3
    sget p0, Lcom/stripe/android/paymentsheet/R$string;->stripe_link_card_type_debit:I

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p0, p1, v2, v1, v2}, Lcom/stripe/android/core/strings/ResolvableStringUtilsKt;->resolvableString$default(I[Ljava/lang/Object;Ljava/util/List;ILjava/lang/Object;)Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object p0

    return-object p0

    .line 73
    :goto_0
    sget p0, Lcom/stripe/android/paymentsheet/R$string;->stripe_link_card_type_unknown:I

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p0, p1, v2, v1, v2}, Lcom/stripe/android/core/strings/ResolvableStringUtilsKt;->resolvableString$default(I[Ljava/lang/Object;Ljava/util/List;ILjava/lang/Object;)Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object p0

    return-object p0

    :sswitch_data_0
    .sparse-switch
        0x3de9ccc -> :sswitch_4
        0x17d197cf -> :sswitch_3
        0x766a16b4 -> :sswitch_2
        0x767c4675 -> :sswitch_1
        0x76f89ef9 -> :sswitch_0
    .end sparse-switch
.end method
