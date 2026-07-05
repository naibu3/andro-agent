.class public final Lcom/stripe/android/ui/core/elements/CardNumberConfig;
.super Ljava/lang/Object;
.source "CardNumberConfig.kt"

# interfaces
.implements Lcom/stripe/android/ui/core/elements/CardDetailsTextFieldConfig;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/ui/core/elements/CardNumberConfig$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nCardNumberConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CardNumberConfig.kt\ncom/stripe/android/ui/core/elements/CardNumberConfig\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,82:1\n434#2:83\n507#2,5:84\n*S KotlinDebug\n*F\n+ 1 CardNumberConfig.kt\ncom/stripe/android/ui/core/elements/CardNumberConfig\n*L\n72#1:83\n72#1:84,5\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\t\u0008\u0001\u0018\u0000 )2\u00020\u0001:\u0001)B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0018\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u0019H\u0016J \u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020\u0019H\u0016J\u0010\u0010#\u001a\u00020\u000e2\u0006\u0010$\u001a\u00020\u000eH\u0016J\u0010\u0010%\u001a\u00020\u000e2\u0006\u0010&\u001a\u00020\u000eH\u0016J\u0010\u0010\'\u001a\u00020\u000e2\u0006\u0010(\u001a\u00020\u000eH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0008\u001a\u00020\tX\u0096\u0004\u00a2\u0006\n\n\u0002\u0010\u000c\u001a\u0004\u0008\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\u000eX\u0096D\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u0012X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\u00020\u0016X\u0096\u0004\u00a2\u0006\n\n\u0002\u0010\u000c\u001a\u0004\u0008\u0017\u0010\u000bR\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006*"
    }
    d2 = {
        "Lcom/stripe/android/ui/core/elements/CardNumberConfig;",
        "Lcom/stripe/android/ui/core/elements/CardDetailsTextFieldConfig;",
        "isCardBrandChoiceEligible",
        "",
        "cardBrandFilter",
        "Lcom/stripe/android/CardBrandFilter;",
        "<init>",
        "(ZLcom/stripe/android/CardBrandFilter;)V",
        "capitalization",
        "Landroidx/compose/ui/text/input/KeyboardCapitalization;",
        "getCapitalization-IUNYP9k",
        "()I",
        "I",
        "debugLabel",
        "",
        "getDebugLabel",
        "()Ljava/lang/String;",
        "label",
        "Lcom/stripe/android/core/strings/ResolvableString;",
        "getLabel",
        "()Lcom/stripe/android/core/strings/ResolvableString;",
        "keyboard",
        "Landroidx/compose/ui/text/input/KeyboardType;",
        "getKeyboard-PjHm6EE",
        "digitsRequiredToFetchBrands",
        "",
        "determineVisualTransformation",
        "Landroidx/compose/ui/text/input/VisualTransformation;",
        "number",
        "panLength",
        "determineState",
        "Lcom/stripe/android/uicore/elements/TextFieldState;",
        "brand",
        "Lcom/stripe/android/model/CardBrand;",
        "numberAllowedDigits",
        "filter",
        "userTyped",
        "convertToRaw",
        "displayName",
        "convertFromRaw",
        "rawValue",
        "Companion",
        "payments-ui-core_release"
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

.field private static final Companion:Lcom/stripe/android/ui/core/elements/CardNumberConfig$Companion;

.field public static final SEPARATOR:C = ' '
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field


# instance fields
.field private final capitalization:I

.field private final cardBrandFilter:Lcom/stripe/android/CardBrandFilter;

.field private final debugLabel:Ljava/lang/String;

.field private digitsRequiredToFetchBrands:I

.field private final isCardBrandChoiceEligible:Z

.field private final keyboard:I

.field private final label:Lcom/stripe/android/core/strings/ResolvableString;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/ui/core/elements/CardNumberConfig$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/ui/core/elements/CardNumberConfig$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/ui/core/elements/CardNumberConfig;->Companion:Lcom/stripe/android/ui/core/elements/CardNumberConfig$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/stripe/android/ui/core/elements/CardNumberConfig;->$stable:I

    return-void
.end method

.method public constructor <init>(ZLcom/stripe/android/CardBrandFilter;)V
    .locals 2

    const-string v0, "cardBrandFilter"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    iput-boolean p1, p0, Lcom/stripe/android/ui/core/elements/CardNumberConfig;->isCardBrandChoiceEligible:Z

    .line 17
    iput-object p2, p0, Lcom/stripe/android/ui/core/elements/CardNumberConfig;->cardBrandFilter:Lcom/stripe/android/CardBrandFilter;

    .line 19
    sget-object p1, Landroidx/compose/ui/text/input/KeyboardCapitalization;->Companion:Landroidx/compose/ui/text/input/KeyboardCapitalization$Companion;

    invoke-virtual {p1}, Landroidx/compose/ui/text/input/KeyboardCapitalization$Companion;->getNone-IUNYP9k()I

    move-result p1

    iput p1, p0, Lcom/stripe/android/ui/core/elements/CardNumberConfig;->capitalization:I

    .line 20
    const-string p1, "Card number"

    iput-object p1, p0, Lcom/stripe/android/ui/core/elements/CardNumberConfig;->debugLabel:Ljava/lang/String;

    .line 21
    sget p1, Lcom/stripe/android/R$string;->stripe_acc_label_card_number:I

    const/4 p2, 0x0

    new-array p2, p2, [Ljava/lang/Object;

    const/4 v0, 0x0

    const/4 v1, 0x4

    invoke-static {p1, p2, v0, v1, v0}, Lcom/stripe/android/core/strings/ResolvableStringUtilsKt;->resolvableString$default(I[Ljava/lang/Object;Ljava/util/List;ILjava/lang/Object;)Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/ui/core/elements/CardNumberConfig;->label:Lcom/stripe/android/core/strings/ResolvableString;

    .line 22
    sget-object p1, Landroidx/compose/ui/text/input/KeyboardType;->Companion:Landroidx/compose/ui/text/input/KeyboardType$Companion;

    invoke-virtual {p1}, Landroidx/compose/ui/text/input/KeyboardType$Companion;->getNumberPassword-PjHm6EE()I

    move-result p1

    iput p1, p0, Lcom/stripe/android/ui/core/elements/CardNumberConfig;->keyboard:I

    const/16 p1, 0x9

    .line 25
    iput p1, p0, Lcom/stripe/android/ui/core/elements/CardNumberConfig;->digitsRequiredToFetchBrands:I

    return-void
.end method


# virtual methods
.method public convertFromRaw(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    const-string v0, "rawValue"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public convertToRaw(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    const-string v0, "displayName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public determineState(Lcom/stripe/android/model/CardBrand;Ljava/lang/String;I)Lcom/stripe/android/uicore/elements/TextFieldState;
    .locals 9

    const-string v0, "brand"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "number"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 36
    sget-object v0, Lcom/stripe/android/CardUtils;->INSTANCE:Lcom/stripe/android/CardUtils;

    invoke-virtual {v0, p2}, Lcom/stripe/android/CardUtils;->isValidLuhnNumber(Ljava/lang/String;)Z

    move-result v0

    .line 37
    invoke-virtual {p1, p2}, Lcom/stripe/android/model/CardBrand;->getMaxLengthForCardNumber(Ljava/lang/String;)I

    move-result v1

    const/4 v2, -0x1

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eq v1, v2, :cond_0

    move v1, v3

    goto :goto_0

    :cond_0
    move v1, v4

    .line 39
    :goto_0
    move-object v2, p2

    check-cast v2, Ljava/lang/CharSequence;

    invoke-static {v2}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 40
    sget-object p1, Lcom/stripe/android/uicore/elements/TextFieldStateConstants$Error$Blank;->INSTANCE:Lcom/stripe/android/uicore/elements/TextFieldStateConstants$Error$Blank;

    check-cast p1, Lcom/stripe/android/uicore/elements/TextFieldState;

    return-object p1

    .line 41
    :cond_1
    iget-object v2, p0, Lcom/stripe/android/ui/core/elements/CardNumberConfig;->cardBrandFilter:Lcom/stripe/android/CardBrandFilter;

    invoke-interface {v2, p1}, Lcom/stripe/android/CardBrandFilter;->isAccepted(Lcom/stripe/android/model/CardBrand;)Z

    move-result v2

    if-nez v2, :cond_3

    .line 42
    iget-boolean v2, p0, Lcom/stripe/android/ui/core/elements/CardNumberConfig;->isCardBrandChoiceEligible:Z

    if-eqz v2, :cond_2

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v2

    iget v5, p0, Lcom/stripe/android/ui/core/elements/CardNumberConfig;->digitsRequiredToFetchBrands:I

    if-le v2, v5, :cond_3

    .line 48
    :cond_2
    new-instance p2, Lcom/stripe/android/uicore/elements/TextFieldStateConstants$Error$Invalid;

    .line 49
    sget p3, Lcom/stripe/android/R$string;->stripe_disallowed_card_brand:I

    .line 50
    new-array v0, v3, [Ljava/lang/String;

    invoke-virtual {p1}, Lcom/stripe/android/model/CardBrand;->getDisplayName()Ljava/lang/String;

    move-result-object p1

    aput-object p1, v0, v4

    .line 48
    invoke-direct {p2, p3, v0, v4}, Lcom/stripe/android/uicore/elements/TextFieldStateConstants$Error$Invalid;-><init>(I[Ljava/lang/Object;Z)V

    check-cast p2, Lcom/stripe/android/uicore/elements/TextFieldState;

    return-object p2

    .line 53
    :cond_3
    sget-object v2, Lcom/stripe/android/model/CardBrand;->Unknown:Lcom/stripe/android/model/CardBrand;

    if-ne p1, v2, :cond_4

    .line 54
    new-instance v3, Lcom/stripe/android/uicore/elements/TextFieldStateConstants$Error$Invalid;

    .line 55
    sget v4, Lcom/stripe/android/R$string;->stripe_invalid_card_number:I

    const/4 v7, 0x2

    const/4 v8, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x1

    .line 54
    invoke-direct/range {v3 .. v8}, Lcom/stripe/android/uicore/elements/TextFieldStateConstants$Error$Invalid;-><init>(I[Ljava/lang/Object;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    check-cast v3, Lcom/stripe/android/uicore/elements/TextFieldState;

    return-object v3

    :cond_4
    if-eqz v1, :cond_5

    .line 58
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result p1

    if-ge p1, p3, :cond_5

    .line 59
    new-instance p1, Lcom/stripe/android/uicore/elements/TextFieldStateConstants$Error$Incomplete;

    sget p2, Lcom/stripe/android/R$string;->stripe_invalid_card_number:I

    invoke-direct {p1, p2}, Lcom/stripe/android/uicore/elements/TextFieldStateConstants$Error$Incomplete;-><init>(I)V

    check-cast p1, Lcom/stripe/android/uicore/elements/TextFieldState;

    return-object p1

    :cond_5
    if-nez v0, :cond_6

    .line 61
    new-instance v0, Lcom/stripe/android/uicore/elements/TextFieldStateConstants$Error$Invalid;

    .line 62
    sget v1, Lcom/stripe/android/R$string;->stripe_invalid_card_number:I

    const/4 v4, 0x2

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x1

    .line 61
    invoke-direct/range {v0 .. v5}, Lcom/stripe/android/uicore/elements/TextFieldStateConstants$Error$Invalid;-><init>(I[Ljava/lang/Object;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    check-cast v0, Lcom/stripe/android/uicore/elements/TextFieldState;

    return-object v0

    :cond_6
    if-eqz v1, :cond_7

    .line 65
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result p1

    if-ne p1, p3, :cond_7

    .line 66
    sget-object p1, Lcom/stripe/android/uicore/elements/TextFieldStateConstants$Valid$Full;->INSTANCE:Lcom/stripe/android/uicore/elements/TextFieldStateConstants$Valid$Full;

    check-cast p1, Lcom/stripe/android/uicore/elements/TextFieldState;

    return-object p1

    .line 68
    :cond_7
    new-instance v0, Lcom/stripe/android/uicore/elements/TextFieldStateConstants$Error$Invalid;

    sget v1, Lcom/stripe/android/R$string;->stripe_invalid_card_number:I

    const/4 v4, 0x6

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct/range {v0 .. v5}, Lcom/stripe/android/uicore/elements/TextFieldStateConstants$Error$Invalid;-><init>(I[Ljava/lang/Object;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    check-cast v0, Lcom/stripe/android/uicore/elements/TextFieldState;

    return-object v0
.end method

.method public determineVisualTransformation(Ljava/lang/String;I)Landroidx/compose/ui/text/input/VisualTransformation;
    .locals 1

    const-string v0, "number"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 p1, 0xe

    const/16 v0, 0x20

    if-eq p2, p1, :cond_1

    const/16 p1, 0xf

    if-eq p2, p1, :cond_1

    const/16 p1, 0x13

    if-eq p2, p1, :cond_0

    .line 31
    new-instance p1, Lcom/stripe/android/ui/core/elements/CardNumberVisualTransformations$Default;

    invoke-direct {p1, v0}, Lcom/stripe/android/ui/core/elements/CardNumberVisualTransformations$Default;-><init>(C)V

    check-cast p1, Landroidx/compose/ui/text/input/VisualTransformation;

    return-object p1

    .line 30
    :cond_0
    new-instance p1, Lcom/stripe/android/ui/core/elements/CardNumberVisualTransformations$NineteenPanLength;

    invoke-direct {p1, v0}, Lcom/stripe/android/ui/core/elements/CardNumberVisualTransformations$NineteenPanLength;-><init>(C)V

    check-cast p1, Landroidx/compose/ui/text/input/VisualTransformation;

    return-object p1

    .line 29
    :cond_1
    new-instance p1, Lcom/stripe/android/ui/core/elements/CardNumberVisualTransformations$FourteenAndFifteenPanLength;

    invoke-direct {p1, v0}, Lcom/stripe/android/ui/core/elements/CardNumberVisualTransformations$FourteenAndFifteenPanLength;-><init>(C)V

    check-cast p1, Landroidx/compose/ui/text/input/VisualTransformation;

    return-object p1
.end method

.method public filter(Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    const-string v0, "userTyped"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 83
    check-cast p1, Ljava/lang/CharSequence;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    check-cast v0, Ljava/lang/Appendable;

    .line 84
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    .line 85
    invoke-interface {p1, v2}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v3

    .line 72
    invoke-static {v3}, Ljava/lang/Character;->isDigit(C)Z

    move-result v4

    if-eqz v4, :cond_0

    .line 86
    invoke-interface {v0, v3}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 88
    :cond_1
    check-cast v0, Ljava/lang/StringBuilder;

    .line 83
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public getCapitalization-IUNYP9k()I
    .locals 1

    .line 19
    iget v0, p0, Lcom/stripe/android/ui/core/elements/CardNumberConfig;->capitalization:I

    return v0
.end method

.method public getDebugLabel()Ljava/lang/String;
    .locals 1

    .line 20
    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/CardNumberConfig;->debugLabel:Ljava/lang/String;

    return-object v0
.end method

.method public getKeyboard-PjHm6EE()I
    .locals 1

    .line 22
    iget v0, p0, Lcom/stripe/android/ui/core/elements/CardNumberConfig;->keyboard:I

    return v0
.end method

.method public getLabel()Lcom/stripe/android/core/strings/ResolvableString;
    .locals 1

    .line 21
    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/CardNumberConfig;->label:Lcom/stripe/android/core/strings/ResolvableString;

    return-object v0
.end method
