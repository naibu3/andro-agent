.class public final Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountTextBuilder;
.super Ljava/lang/Object;
.source "USBankAccountTextBuilder.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0006\u0008\u00c1\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J.\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\u000c\u001a\u00020\tJ(\u0010\r\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\u000c\u001a\u00020\tH\u0007J\u0010\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\tH\u0002\u00a8\u0006\u000f"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountTextBuilder;",
        "",
        "<init>",
        "()V",
        "buildMandateAndMicrodepositsText",
        "Lcom/stripe/android/core/strings/ResolvableString;",
        "merchantName",
        "",
        "isVerifyingMicrodeposits",
        "",
        "isSaveForFutureUseSelected",
        "isInstantDebits",
        "isSetupFlow",
        "buildMandateText",
        "getTermsLink",
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

.field public static final INSTANCE:Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountTextBuilder;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountTextBuilder;

    invoke-direct {v0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountTextBuilder;-><init>()V

    sput-object v0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountTextBuilder;->INSTANCE:Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountTextBuilder;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final getTermsLink(Z)Ljava/lang/String;
    .locals 1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    .line 69
    const-string p1, "https://link.com/terms/ach-authorization"

    return-object p1

    :cond_0
    if-nez p1, :cond_1

    .line 70
    const-string p1, "https://stripe.com/ach-payments/authorization"

    return-object p1

    .line 68
    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method


# virtual methods
.method public final buildMandateAndMicrodepositsText(Ljava/lang/String;ZZZZ)Lcom/stripe/android/core/strings/ResolvableString;
    .locals 1

    const-string v0, "merchantName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    invoke-virtual {p0, p1, p3, p4, p5}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountTextBuilder;->buildMandateText(Ljava/lang/String;ZZZ)Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object p3

    const/4 p4, 0x0

    if-eqz p2, :cond_0

    .line 30
    sget p2, Lcom/stripe/android/paymentsheet/R$string;->stripe_paymentsheet_microdeposit:I

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    const/4 p5, 0x4

    invoke-static {p2, p1, p4, p5, p4}, Lcom/stripe/android/core/strings/ResolvableStringUtilsKt;->resolvableString$default(I[Ljava/lang/Object;Ljava/util/List;ILjava/lang/Object;)Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object p4

    :cond_0
    if-eqz p4, :cond_1

    .line 36
    const-string p1, " "

    invoke-static {p1}, Lcom/stripe/android/core/strings/ResolvableStringUtilsKt;->getResolvableString(Ljava/lang/String;)Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object p1

    invoke-static {p4, p1}, Lcom/stripe/android/core/strings/ResolvableStringUtilsKt;->plus(Lcom/stripe/android/core/strings/ResolvableString;Lcom/stripe/android/core/strings/ResolvableString;)Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object p1

    invoke-static {p1, p3}, Lcom/stripe/android/core/strings/ResolvableStringUtilsKt;->plus(Lcom/stripe/android/core/strings/ResolvableString;Lcom/stripe/android/core/strings/ResolvableString;)Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object p1

    return-object p1

    :cond_1
    return-object p3
.end method

.method public final buildMandateText(Ljava/lang/String;ZZZ)Lcom/stripe/android/core/strings/ResolvableString;
    .locals 4

    const-string v0, "merchantName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x2

    .line 50
    new-array v0, v0, [Lcom/stripe/android/core/strings/transformations/Replace;

    new-instance v1, Lcom/stripe/android/core/strings/transformations/Replace;

    .line 52
    invoke-direct {p0, p3}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountTextBuilder;->getTermsLink(Z)Ljava/lang/String;

    move-result-object p3

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "<a href=\""

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p3

    const-string v2, "\">"

    invoke-virtual {p3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p3

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    .line 50
    const-string v2, "<terms>"

    invoke-direct {v1, v2, p3}, Lcom/stripe/android/core/strings/transformations/Replace;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/4 p3, 0x0

    aput-object v1, v0, p3

    .line 54
    new-instance v1, Lcom/stripe/android/core/strings/transformations/Replace;

    .line 55
    const-string v2, "</terms>"

    .line 56
    const-string v3, "</a>"

    .line 54
    invoke-direct {v1, v2, v3}, Lcom/stripe/android/core/strings/transformations/Replace;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v2, 0x1

    aput-object v1, v0, v2

    .line 49
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    if-nez p2, :cond_1

    if-eqz p4, :cond_0

    goto :goto_0

    .line 62
    :cond_0
    sget p1, Lcom/stripe/android/paymentsheet/R$string;->stripe_paymentsheet_ach_continue_mandate:I

    new-array p2, p3, [Ljava/lang/Object;

    invoke-static {p1, p2, v0}, Lcom/stripe/android/core/strings/ResolvableStringUtilsKt;->resolvableString(I[Ljava/lang/Object;Ljava/util/List;)Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object p1

    return-object p1

    .line 60
    :cond_1
    :goto_0
    sget p2, Lcom/stripe/android/paymentsheet/R$string;->stripe_paymentsheet_ach_save_mandate:I

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p2, p1, v0}, Lcom/stripe/android/core/strings/ResolvableStringUtilsKt;->resolvableString(I[Ljava/lang/Object;Ljava/util/List;)Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object p1

    return-object p1
.end method
