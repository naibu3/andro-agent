.class public final Lcom/stripe/android/view/PostalCodeEditText;
.super Lcom/stripe/android/view/StripeEditText;
.source "PostalCodeEditText.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/view/PostalCodeEditText$Companion;,
        Lcom/stripe/android/view/PostalCodeEditText$Config;,
        Lcom/stripe/android/view/PostalCodeEditText$WhenMappings;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nPostalCodeEditText.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PostalCodeEditText.kt\ncom/stripe/android/view/PostalCodeEditText\n+ 2 Delegates.kt\nkotlin/properties/Delegates\n+ 3 TextView.kt\nandroidx/core/widget/TextViewKt\n*L\n1#1,130:1\n33#2,3:131\n58#3,23:134\n93#3,3:157\n*S KotlinDebug\n*F\n+ 1 PostalCodeEditText.kt\ncom/stripe/android/view/PostalCodeEditText\n*L\n26#1:131,3\n50#1:134,23\n50#1:157,3\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0004\u0008\u0007\u0018\u0000 #2\u00020\u0001:\u0002\"#B\'\u0008\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0008\u0010\u0017\u001a\u00020\u0018H\u0014J\u0008\u0010\u0019\u001a\u00020\u0018H\u0002J\u0008\u0010\u001a\u001a\u00020\u0018H\u0002J\u0012\u0010\u001b\u001a\u00020\u00182\u0008\u0008\u0001\u0010\u001c\u001a\u00020\u0007H\u0002J\n\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0002J\r\u0010\u001f\u001a\u00020 H\u0000\u00a2\u0006\u0002\u0008!R+\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b8@@@X\u0080\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008\u0011\u0010\u0012\u001a\u0004\u0008\r\u0010\u000e\"\u0004\u0008\u000f\u0010\u0010R\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00148@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0015\u0010\u0016\u00a8\u0006$"
    }
    d2 = {
        "Lcom/stripe/android/view/PostalCodeEditText;",
        "Lcom/stripe/android/view/StripeEditText;",
        "context",
        "Landroid/content/Context;",
        "attrs",
        "Landroid/util/AttributeSet;",
        "defStyleAttr",
        "",
        "<init>",
        "(Landroid/content/Context;Landroid/util/AttributeSet;I)V",
        "<set-?>",
        "Lcom/stripe/android/view/PostalCodeEditText$Config;",
        "config",
        "getConfig$payments_core_release",
        "()Lcom/stripe/android/view/PostalCodeEditText$Config;",
        "setConfig$payments_core_release",
        "(Lcom/stripe/android/view/PostalCodeEditText$Config;)V",
        "config$delegate",
        "Lkotlin/properties/ReadWriteProperty;",
        "postalCode",
        "",
        "getPostalCode$payments_core_release",
        "()Ljava/lang/String;",
        "onFinishInflate",
        "",
        "configureForUs",
        "configureForGlobal",
        "updateHint",
        "hintRes",
        "getTextInputLayout",
        "Lcom/google/android/material/textfield/TextInputLayout;",
        "hasValidPostal",
        "",
        "hasValidPostal$payments_core_release",
        "Config",
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
.field static final synthetic $$delegatedProperties:[Lkotlin/reflect/KProperty;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Lkotlin/reflect/KProperty<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field public static final $stable:I

.field private static final Companion:Lcom/stripe/android/view/PostalCodeEditText$Companion;

.field private static final MAX_LENGTH_US:I = 0x5

.field private static final ZIP_CODE_PATTERN:Ljava/util/regex/Pattern;


# instance fields
.field private final config$delegate:Lkotlin/properties/ReadWriteProperty;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    const/4 v0, 0x1

    new-array v0, v0, [Lkotlin/reflect/KProperty;

    .line 26
    new-instance v1, Lkotlin/jvm/internal/MutablePropertyReference1Impl;

    const-string v2, "config"

    const-string v3, "getConfig$payments_core_release()Lcom/stripe/android/view/PostalCodeEditText$Config;"

    const-class v4, Lcom/stripe/android/view/PostalCodeEditText;

    const/4 v5, 0x0

    invoke-direct {v1, v4, v2, v3, v5}, Lkotlin/jvm/internal/MutablePropertyReference1Impl;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    check-cast v1, Lkotlin/jvm/internal/MutablePropertyReference1;

    invoke-static {v1}, Lkotlin/jvm/internal/Reflection;->mutableProperty1(Lkotlin/jvm/internal/MutablePropertyReference1;)Lkotlin/reflect/KMutableProperty1;

    move-result-object v1

    aput-object v1, v0, v5

    sput-object v0, Lcom/stripe/android/view/PostalCodeEditText;->$$delegatedProperties:[Lkotlin/reflect/KProperty;

    new-instance v0, Lcom/stripe/android/view/PostalCodeEditText$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/view/PostalCodeEditText$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/view/PostalCodeEditText;->Companion:Lcom/stripe/android/view/PostalCodeEditText$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/stripe/android/view/PostalCodeEditText;->$stable:I

    .line 127
    const-string v0, "^[0-9]{5}$"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/view/PostalCodeEditText;->ZIP_CODE_PATTERN:Ljava/util/regex/Pattern;

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

    invoke-direct/range {v1 .. v6}, Lcom/stripe/android/view/PostalCodeEditText;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

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

    invoke-direct/range {v1 .. v6}, Lcom/stripe/android/view/PostalCodeEditText;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    invoke-direct {p0, p1, p2, p3}, Lcom/stripe/android/view/StripeEditText;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 26
    sget-object p1, Lkotlin/properties/Delegates;->INSTANCE:Lkotlin/properties/Delegates;

    .line 27
    sget-object p1, Lcom/stripe/android/view/PostalCodeEditText$Config;->Global:Lcom/stripe/android/view/PostalCodeEditText$Config;

    .line 131
    new-instance p2, Lcom/stripe/android/view/PostalCodeEditText$special$$inlined$observable$1;

    invoke-direct {p2, p1, p0}, Lcom/stripe/android/view/PostalCodeEditText$special$$inlined$observable$1;-><init>(Ljava/lang/Object;Lcom/stripe/android/view/PostalCodeEditText;)V

    check-cast p2, Lkotlin/properties/ReadWriteProperty;

    .line 26
    iput-object p2, p0, Lcom/stripe/android/view/PostalCodeEditText;->config$delegate:Lkotlin/properties/ReadWriteProperty;

    .line 47
    invoke-virtual {p0}, Lcom/stripe/android/view/PostalCodeEditText;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    sget p2, Lcom/stripe/android/R$string;->stripe_invalid_zip:I

    invoke-virtual {p1, p2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/stripe/android/view/PostalCodeEditText;->setErrorMessage(Ljava/lang/String;)V

    const/4 p1, 0x1

    .line 48
    invoke-virtual {p0, p1}, Lcom/stripe/android/view/PostalCodeEditText;->setMaxLines(I)V

    .line 50
    move-object p2, p0

    check-cast p2, Landroid/widget/TextView;

    .line 156
    new-instance p3, Lcom/stripe/android/view/PostalCodeEditText$special$$inlined$doAfterTextChanged$1;

    invoke-direct {p3, p0}, Lcom/stripe/android/view/PostalCodeEditText$special$$inlined$doAfterTextChanged$1;-><init>(Lcom/stripe/android/view/PostalCodeEditText;)V

    .line 157
    check-cast p3, Landroid/text/TextWatcher;

    invoke-virtual {p2, p3}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 54
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 p3, 0x1a

    if-lt p2, p3, :cond_0

    .line 55
    new-array p1, p1, [Ljava/lang/String;

    const/4 p2, 0x0

    const-string p3, "postalCode"

    aput-object p3, p1, p2

    invoke-virtual {p0, p1}, Lcom/stripe/android/view/PostalCodeEditText;->setAutofillHints([Ljava/lang/String;)V

    :cond_0
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

    .line 23
    sget p3, Landroidx/appcompat/R$attr;->editTextStyle:I

    .line 20
    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lcom/stripe/android/view/PostalCodeEditText;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public static final synthetic access$configureForGlobal(Lcom/stripe/android/view/PostalCodeEditText;)V
    .locals 0

    .line 20
    invoke-direct {p0}, Lcom/stripe/android/view/PostalCodeEditText;->configureForGlobal()V

    return-void
.end method

.method public static final synthetic access$configureForUs(Lcom/stripe/android/view/PostalCodeEditText;)V
    .locals 0

    .line 20
    invoke-direct {p0}, Lcom/stripe/android/view/PostalCodeEditText;->configureForUs()V

    return-void
.end method

.method private final configureForGlobal()V
    .locals 1

    .line 78
    sget v0, Lcom/stripe/android/core/R$string;->stripe_address_label_postal_code:I

    invoke-direct {p0, v0}, Lcom/stripe/android/view/PostalCodeEditText;->updateHint(I)V

    .line 79
    invoke-static {}, Landroid/text/method/TextKeyListener;->getInstance()Landroid/text/method/TextKeyListener;

    move-result-object v0

    check-cast v0, Landroid/text/method/KeyListener;

    invoke-virtual {p0, v0}, Lcom/stripe/android/view/PostalCodeEditText;->setKeyListener(Landroid/text/method/KeyListener;)V

    const/16 v0, 0x70

    .line 80
    invoke-virtual {p0, v0}, Lcom/stripe/android/view/PostalCodeEditText;->setInputType(I)V

    const/4 v0, 0x0

    .line 81
    new-array v0, v0, [Landroid/text/InputFilter;

    invoke-virtual {p0, v0}, Lcom/stripe/android/view/PostalCodeEditText;->setFilters([Landroid/text/InputFilter;)V

    return-void
.end method

.method private final configureForUs()V
    .locals 4

    .line 68
    sget v0, Lcom/stripe/android/core/R$string;->stripe_address_label_zip_code:I

    invoke-direct {p0, v0}, Lcom/stripe/android/view/PostalCodeEditText;->updateHint(I)V

    const/4 v0, 0x1

    .line 69
    new-array v1, v0, [Landroid/text/InputFilter$LengthFilter;

    new-instance v2, Landroid/text/InputFilter$LengthFilter;

    const/4 v3, 0x5

    invoke-direct {v2, v3}, Landroid/text/InputFilter$LengthFilter;-><init>(I)V

    const/4 v3, 0x0

    aput-object v2, v1, v3

    check-cast v1, [Landroid/text/InputFilter;

    invoke-virtual {p0, v1}, Lcom/stripe/android/view/PostalCodeEditText;->setFilters([Landroid/text/InputFilter;)V

    .line 70
    invoke-static {v3, v0}, Landroid/text/method/DigitsKeyListener;->getInstance(ZZ)Landroid/text/method/DigitsKeyListener;

    move-result-object v0

    check-cast v0, Landroid/text/method/KeyListener;

    invoke-virtual {p0, v0}, Lcom/stripe/android/view/PostalCodeEditText;->setKeyListener(Landroid/text/method/KeyListener;)V

    .line 71
    invoke-virtual {p0}, Lcom/stripe/android/view/PostalCodeEditText;->setNumberOnlyInputType()V

    return-void
.end method

.method private final getTextInputLayout()Lcom/google/android/material/textfield/TextInputLayout;
    .locals 2

    .line 102
    invoke-virtual {p0}, Lcom/stripe/android/view/PostalCodeEditText;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    .line 103
    :goto_0
    instance-of v1, v0, Landroid/view/View;

    if-eqz v1, :cond_1

    .line 104
    instance-of v1, v0, Lcom/google/android/material/textfield/TextInputLayout;

    if-eqz v1, :cond_0

    .line 105
    check-cast v0, Lcom/google/android/material/textfield/TextInputLayout;

    return-object v0

    .line 107
    :cond_0
    check-cast v0, Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method

.method private final updateHint(I)V
    .locals 2

    .line 89
    invoke-direct {p0}, Lcom/stripe/android/view/PostalCodeEditText;->getTextInputLayout()Lcom/google/android/material/textfield/TextInputLayout;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 90
    invoke-virtual {v0}, Lcom/google/android/material/textfield/TextInputLayout;->isHintEnabled()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 91
    invoke-virtual {p0}, Lcom/stripe/android/view/PostalCodeEditText;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, p1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p1

    check-cast p1, Ljava/lang/CharSequence;

    invoke-virtual {v0, p1}, Lcom/google/android/material/textfield/TextInputLayout;->setHint(Ljava/lang/CharSequence;)V

    return-void

    .line 93
    :cond_0
    invoke-virtual {p0, p1}, Lcom/stripe/android/view/PostalCodeEditText;->setHint(I)V

    :cond_1
    return-void
.end method


# virtual methods
.method public final getConfig$payments_core_release()Lcom/stripe/android/view/PostalCodeEditText$Config;
    .locals 3

    .line 26
    iget-object v0, p0, Lcom/stripe/android/view/PostalCodeEditText;->config$delegate:Lkotlin/properties/ReadWriteProperty;

    sget-object v1, Lcom/stripe/android/view/PostalCodeEditText;->$$delegatedProperties:[Lkotlin/reflect/KProperty;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-interface {v0, p0, v1}, Lkotlin/properties/ReadWriteProperty;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/view/PostalCodeEditText$Config;

    return-object v0
.end method

.method public final getPostalCode$payments_core_release()Ljava/lang/String;
    .locals 3

    .line 37
    invoke-virtual {p0}, Lcom/stripe/android/view/PostalCodeEditText;->getConfig$payments_core_release()Lcom/stripe/android/view/PostalCodeEditText$Config;

    move-result-object v0

    sget-object v1, Lcom/stripe/android/view/PostalCodeEditText$Config;->US:Lcom/stripe/android/view/PostalCodeEditText$Config;

    if-ne v0, v1, :cond_1

    .line 38
    invoke-virtual {p0}, Lcom/stripe/android/view/PostalCodeEditText;->getFieldText$payments_core_release()Ljava/lang/String;

    move-result-object v0

    .line 39
    sget-object v1, Lcom/stripe/android/view/PostalCodeEditText;->ZIP_CODE_PATTERN:Ljava/util/regex/Pattern;

    invoke-virtual {p0}, Lcom/stripe/android/view/PostalCodeEditText;->getFieldText$payments_core_release()Ljava/lang/String;

    move-result-object v2

    check-cast v2, Ljava/lang/CharSequence;

    invoke-virtual {v1, v2}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/regex/Matcher;->matches()Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 42
    :cond_1
    invoke-virtual {p0}, Lcom/stripe/android/view/PostalCodeEditText;->getFieldText$payments_core_release()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final hasValidPostal$payments_core_release()Z
    .locals 2

    .line 121
    invoke-virtual {p0}, Lcom/stripe/android/view/PostalCodeEditText;->getConfig$payments_core_release()Lcom/stripe/android/view/PostalCodeEditText$Config;

    move-result-object v0

    sget-object v1, Lcom/stripe/android/view/PostalCodeEditText$Config;->US:Lcom/stripe/android/view/PostalCodeEditText$Config;

    if-ne v0, v1, :cond_0

    sget-object v0, Lcom/stripe/android/view/PostalCodeEditText;->ZIP_CODE_PATTERN:Ljava/util/regex/Pattern;

    invoke-virtual {p0}, Lcom/stripe/android/view/PostalCodeEditText;->getFieldText$payments_core_release()Ljava/lang/String;

    move-result-object v1

    check-cast v1, Ljava/lang/CharSequence;

    invoke-virtual {v0, v1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v0

    .line 122
    invoke-virtual {v0}, Ljava/util/regex/Matcher;->matches()Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    invoke-virtual {p0}, Lcom/stripe/android/view/PostalCodeEditText;->getConfig$payments_core_release()Lcom/stripe/android/view/PostalCodeEditText$Config;

    move-result-object v0

    sget-object v1, Lcom/stripe/android/view/PostalCodeEditText$Config;->Global:Lcom/stripe/android/view/PostalCodeEditText$Config;

    if-ne v0, v1, :cond_2

    invoke-virtual {p0}, Lcom/stripe/android/view/PostalCodeEditText;->getFieldText$payments_core_release()Ljava/lang/String;

    move-result-object v0

    check-cast v0, Ljava/lang/CharSequence;

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-lez v0, :cond_2

    :cond_1
    const/4 v0, 0x1

    return v0

    :cond_2
    const/4 v0, 0x0

    return v0
.end method

.method protected onFinishInflate()V
    .locals 0

    .line 60
    invoke-super {p0}, Lcom/stripe/android/view/StripeEditText;->onFinishInflate()V

    .line 61
    invoke-direct {p0}, Lcom/stripe/android/view/PostalCodeEditText;->configureForGlobal()V

    return-void
.end method

.method public final setConfig$payments_core_release(Lcom/stripe/android/view/PostalCodeEditText$Config;)V
    .locals 3

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    iget-object v0, p0, Lcom/stripe/android/view/PostalCodeEditText;->config$delegate:Lkotlin/properties/ReadWriteProperty;

    sget-object v1, Lcom/stripe/android/view/PostalCodeEditText;->$$delegatedProperties:[Lkotlin/reflect/KProperty;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-interface {v0, p0, v1, p1}, Lkotlin/properties/ReadWriteProperty;->setValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;Ljava/lang/Object;)V

    return-void
.end method
