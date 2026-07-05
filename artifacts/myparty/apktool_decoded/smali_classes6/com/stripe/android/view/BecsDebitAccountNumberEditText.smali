.class public final Lcom/stripe/android/view/BecsDebitAccountNumberEditText;
.super Lcom/stripe/android/view/StripeEditText;
.source "BecsDebitAccountNumberEditText.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/view/BecsDebitAccountNumberEditText$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nBecsDebitAccountNumberEditText.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BecsDebitAccountNumberEditText.kt\ncom/stripe/android/view/BecsDebitAccountNumberEditText\n+ 2 TextView.kt\nandroidx/core/widget/TextViewKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,49:1\n58#2,23:50\n93#2,3:73\n1#3:76\n*S KotlinDebug\n*F\n+ 1 BecsDebitAccountNumberEditText.kt\ncom/stripe/android/view/BecsDebitAccountNumberEditText\n*L\n39#1:50,23\n39#1:73,3\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\t\u0008\u0001\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\'\u0008\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\tR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b8F\u00a2\u0006\u0006\u001a\u0004\u0008\u000c\u0010\rR\u001a\u0010\u000e\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u000f\u0010\u0010\"\u0004\u0008\u0011\u0010\u0012\u00a8\u0006\u0014"
    }
    d2 = {
        "Lcom/stripe/android/view/BecsDebitAccountNumberEditText;",
        "Lcom/stripe/android/view/StripeEditText;",
        "context",
        "Landroid/content/Context;",
        "attrs",
        "Landroid/util/AttributeSet;",
        "defStyleAttr",
        "",
        "<init>",
        "(Landroid/content/Context;Landroid/util/AttributeSet;I)V",
        "accountNumber",
        "",
        "getAccountNumber",
        "()Ljava/lang/String;",
        "minLength",
        "getMinLength",
        "()I",
        "setMinLength",
        "(I)V",
        "Companion",
        "payments-core_release"
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

.field public static final Companion:Lcom/stripe/android/view/BecsDebitAccountNumberEditText$Companion;

.field public static final DEFAULT_MIN_LENGTH:I = 0x5

.field private static final MAX_LENGTH:I = 0x9


# instance fields
.field private minLength:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/view/BecsDebitAccountNumberEditText$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/view/BecsDebitAccountNumberEditText$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/view/BecsDebitAccountNumberEditText;->Companion:Lcom/stripe/android/view/BecsDebitAccountNumberEditText$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/stripe/android/view/BecsDebitAccountNumberEditText;->$stable:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 7

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    invoke-direct/range {v1 .. v6}, Lcom/stripe/android/view/BecsDebitAccountNumberEditText;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 7

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v1 .. v6}, Lcom/stripe/android/view/BecsDebitAccountNumberEditText;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    invoke-direct {p0, p1, p2, p3}, Lcom/stripe/android/view/StripeEditText;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/4 p1, 0x5

    .line 33
    iput p1, p0, Lcom/stripe/android/view/BecsDebitAccountNumberEditText;->minLength:I

    const/4 p1, 0x1

    .line 36
    new-array p1, p1, [Landroid/text/InputFilter$LengthFilter;

    new-instance p2, Landroid/text/InputFilter$LengthFilter;

    const/16 p3, 0x9

    invoke-direct {p2, p3}, Landroid/text/InputFilter$LengthFilter;-><init>(I)V

    const/4 p3, 0x0

    aput-object p2, p1, p3

    check-cast p1, [Landroid/text/InputFilter;

    invoke-virtual {p0, p1}, Lcom/stripe/android/view/BecsDebitAccountNumberEditText;->setFilters([Landroid/text/InputFilter;)V

    const/4 p1, 0x2

    .line 37
    invoke-virtual {p0, p1}, Lcom/stripe/android/view/BecsDebitAccountNumberEditText;->setInputType(I)V

    .line 39
    move-object p1, p0

    check-cast p1, Landroid/widget/TextView;

    .line 72
    new-instance p2, Lcom/stripe/android/view/BecsDebitAccountNumberEditText$special$$inlined$doAfterTextChanged$1;

    invoke-direct {p2, p0}, Lcom/stripe/android/view/BecsDebitAccountNumberEditText$special$$inlined$doAfterTextChanged$1;-><init>(Lcom/stripe/android/view/BecsDebitAccountNumberEditText;)V

    .line 73
    check-cast p2, Landroid/text/TextWatcher;

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    const/4 p2, 0x0

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    .line 14
    sget p3, Landroidx/appcompat/R$attr;->editTextStyle:I

    .line 11
    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lcom/stripe/android/view/BecsDebitAccountNumberEditText;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method


# virtual methods
.method public final getAccountNumber()Ljava/lang/String;
    .locals 3

    .line 20
    invoke-virtual {p0}, Lcom/stripe/android/view/BecsDebitAccountNumberEditText;->getFieldText$payments_core_release()Ljava/lang/String;

    move-result-object v0

    check-cast v0, Ljava/lang/CharSequence;

    invoke-static {v0}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 21
    invoke-virtual {p0}, Lcom/stripe/android/view/BecsDebitAccountNumberEditText;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v2, Lcom/stripe/android/R$string;->stripe_becs_widget_account_number_required:I

    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 23
    :cond_0
    invoke-virtual {p0}, Lcom/stripe/android/view/BecsDebitAccountNumberEditText;->getFieldText$payments_core_release()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    iget v2, p0, Lcom/stripe/android/view/BecsDebitAccountNumberEditText;->minLength:I

    if-ge v0, v2, :cond_1

    .line 24
    invoke-virtual {p0}, Lcom/stripe/android/view/BecsDebitAccountNumberEditText;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v2, Lcom/stripe/android/R$string;->stripe_becs_widget_account_number_incomplete:I

    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_1
    move-object v0, v1

    .line 19
    :goto_0
    invoke-virtual {p0, v0}, Lcom/stripe/android/view/BecsDebitAccountNumberEditText;->setErrorMessage$payments_core_release(Ljava/lang/String;)V

    .line 30
    invoke-virtual {p0}, Lcom/stripe/android/view/BecsDebitAccountNumberEditText;->getFieldText$payments_core_release()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lcom/stripe/android/view/BecsDebitAccountNumberEditText;->getErrorMessage$payments_core_release()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_2

    return-object v0

    :cond_2
    return-object v1
.end method

.method public final getMinLength()I
    .locals 1

    .line 33
    iget v0, p0, Lcom/stripe/android/view/BecsDebitAccountNumberEditText;->minLength:I

    return v0
.end method

.method public final setMinLength(I)V
    .locals 0

    .line 33
    iput p1, p0, Lcom/stripe/android/view/BecsDebitAccountNumberEditText;->minLength:I

    return-void
.end method
