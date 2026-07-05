.class public final Lcom/stripe/android/ui/core/elements/CvcConfig;
.super Ljava/lang/Object;
.source "CvcConfig.kt"

# interfaces
.implements Lcom/stripe/android/ui/core/elements/CardDetailsTextFieldConfig;


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nCvcConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CvcConfig.kt\ncom/stripe/android/ui/core/elements/CvcConfig\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,57:1\n434#2:58\n507#2,5:59\n*S KotlinDebug\n*F\n+ 1 CvcConfig.kt\ncom/stripe/android/ui/core/elements/CvcConfig\n*L\n51#1:58\n51#1:59,5\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J \u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0016\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u0018H\u0016J\u0010\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\nH\u0016J\u0010\u0010 \u001a\u00020\n2\u0006\u0010!\u001a\u00020\nH\u0016J\u0010\u0010\"\u001a\u00020\n2\u0006\u0010#\u001a\u00020\nH\u0016R\u0016\u0010\u0004\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\n\n\u0002\u0010\u0008\u001a\u0004\u0008\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\nX\u0096D\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000cR\u0014\u0010\r\u001a\u00020\u000eX\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u0010R\u0016\u0010\u0011\u001a\u00020\u0012X\u0096\u0004\u00a2\u0006\n\n\u0002\u0010\u0008\u001a\u0004\u0008\u0013\u0010\u0007\u00a8\u0006$"
    }
    d2 = {
        "Lcom/stripe/android/ui/core/elements/CvcConfig;",
        "Lcom/stripe/android/ui/core/elements/CardDetailsTextFieldConfig;",
        "<init>",
        "()V",
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
        "determineVisualTransformation",
        "Landroidx/compose/ui/text/input/VisualTransformation;",
        "number",
        "panLength",
        "",
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
.field public static final $stable:I = 0x8


# instance fields
.field private final capitalization:I

.field private final debugLabel:Ljava/lang/String;

.field private final keyboard:I

.field private final label:Lcom/stripe/android/core/strings/ResolvableString;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 4

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    sget-object v0, Landroidx/compose/ui/text/input/KeyboardCapitalization;->Companion:Landroidx/compose/ui/text/input/KeyboardCapitalization$Companion;

    invoke-virtual {v0}, Landroidx/compose/ui/text/input/KeyboardCapitalization$Companion;->getNone-IUNYP9k()I

    move-result v0

    iput v0, p0, Lcom/stripe/android/ui/core/elements/CvcConfig;->capitalization:I

    .line 17
    const-string v0, "cvc"

    iput-object v0, p0, Lcom/stripe/android/ui/core/elements/CvcConfig;->debugLabel:Ljava/lang/String;

    .line 18
    sget v0, Lcom/stripe/android/R$string;->stripe_cvc_number_hint:I

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    const/4 v3, 0x4

    invoke-static {v0, v1, v2, v3, v2}, Lcom/stripe/android/core/strings/ResolvableStringUtilsKt;->resolvableString$default(I[Ljava/lang/Object;Ljava/util/List;ILjava/lang/Object;)Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object v0

    iput-object v0, p0, Lcom/stripe/android/ui/core/elements/CvcConfig;->label:Lcom/stripe/android/core/strings/ResolvableString;

    .line 19
    sget-object v0, Landroidx/compose/ui/text/input/KeyboardType;->Companion:Landroidx/compose/ui/text/input/KeyboardType$Companion;

    invoke-virtual {v0}, Landroidx/compose/ui/text/input/KeyboardType$Companion;->getNumberPassword-PjHm6EE()I

    move-result v0

    iput v0, p0, Lcom/stripe/android/ui/core/elements/CvcConfig;->keyboard:I

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
    .locals 7

    const-string v0, "brand"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "number"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    invoke-virtual {p1}, Lcom/stripe/android/model/CardBrand;->getMaxCvcLength()I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 31
    :goto_0
    move-object v1, p2

    check-cast v1, Ljava/lang/CharSequence;

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-nez v1, :cond_1

    .line 32
    sget-object p1, Lcom/stripe/android/uicore/elements/TextFieldStateConstants$Error$Blank;->INSTANCE:Lcom/stripe/android/uicore/elements/TextFieldStateConstants$Error$Blank;

    check-cast p1, Lcom/stripe/android/uicore/elements/TextFieldState;

    return-object p1

    .line 33
    :cond_1
    sget-object v1, Lcom/stripe/android/model/CardBrand;->Unknown:Lcom/stripe/android/model/CardBrand;

    if-ne p1, v1, :cond_3

    .line 34
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result p1

    if-ne p1, p3, :cond_2

    .line 35
    sget-object p1, Lcom/stripe/android/uicore/elements/TextFieldStateConstants$Valid$Full;->INSTANCE:Lcom/stripe/android/uicore/elements/TextFieldStateConstants$Valid$Full;

    check-cast p1, Lcom/stripe/android/uicore/elements/TextFieldStateConstants$Valid;

    goto :goto_1

    .line 36
    :cond_2
    sget-object p1, Lcom/stripe/android/uicore/elements/TextFieldStateConstants$Valid$Limitless;->INSTANCE:Lcom/stripe/android/uicore/elements/TextFieldStateConstants$Valid$Limitless;

    check-cast p1, Lcom/stripe/android/uicore/elements/TextFieldStateConstants$Valid;

    :goto_1
    check-cast p1, Lcom/stripe/android/uicore/elements/TextFieldState;

    return-object p1

    :cond_3
    if-eqz v0, :cond_4

    .line 38
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v1

    if-ne v1, p3, :cond_4

    .line 39
    sget-object p1, Lcom/stripe/android/uicore/elements/TextFieldStateConstants$Valid$Full;->INSTANCE:Lcom/stripe/android/uicore/elements/TextFieldStateConstants$Valid$Full;

    check-cast p1, Lcom/stripe/android/uicore/elements/TextFieldState;

    return-object p1

    :cond_4
    if-eqz v0, :cond_5

    .line 40
    invoke-virtual {p1}, Lcom/stripe/android/model/CardBrand;->getCvcLength()Ljava/util/Set;

    move-result-object p1

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p1, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_5

    .line 41
    sget-object p1, Lcom/stripe/android/uicore/elements/TextFieldStateConstants$Valid$Limitless;->INSTANCE:Lcom/stripe/android/uicore/elements/TextFieldStateConstants$Valid$Limitless;

    check-cast p1, Lcom/stripe/android/uicore/elements/TextFieldState;

    return-object p1

    :cond_5
    if-eqz v0, :cond_6

    .line 42
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result p1

    if-ge p1, p3, :cond_6

    .line 43
    new-instance p1, Lcom/stripe/android/uicore/elements/TextFieldStateConstants$Error$Incomplete;

    sget p2, Lcom/stripe/android/R$string;->stripe_invalid_cvc:I

    invoke-direct {p1, p2}, Lcom/stripe/android/uicore/elements/TextFieldStateConstants$Error$Incomplete;-><init>(I)V

    check-cast p1, Lcom/stripe/android/uicore/elements/TextFieldState;

    return-object p1

    :cond_6
    if-eqz v0, :cond_7

    .line 44
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result p1

    if-le p1, p3, :cond_7

    .line 45
    new-instance v0, Lcom/stripe/android/uicore/elements/TextFieldStateConstants$Error$Invalid;

    sget v1, Lcom/stripe/android/R$string;->stripe_invalid_cvc:I

    const/4 v4, 0x6

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct/range {v0 .. v5}, Lcom/stripe/android/uicore/elements/TextFieldStateConstants$Error$Invalid;-><init>(I[Ljava/lang/Object;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    check-cast v0, Lcom/stripe/android/uicore/elements/TextFieldState;

    return-object v0

    .line 47
    :cond_7
    new-instance v1, Lcom/stripe/android/uicore/elements/TextFieldStateConstants$Error$Invalid;

    sget v2, Lcom/stripe/android/R$string;->stripe_invalid_cvc:I

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v1 .. v6}, Lcom/stripe/android/uicore/elements/TextFieldStateConstants$Error$Invalid;-><init>(I[Ljava/lang/Object;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    check-cast v1, Lcom/stripe/android/uicore/elements/TextFieldState;

    return-object v1
.end method

.method public determineVisualTransformation(Ljava/lang/String;I)Landroidx/compose/ui/text/input/VisualTransformation;
    .locals 0

    const-string p2, "number"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    sget-object p1, Landroidx/compose/ui/text/input/VisualTransformation;->Companion:Landroidx/compose/ui/text/input/VisualTransformation$Companion;

    invoke-virtual {p1}, Landroidx/compose/ui/text/input/VisualTransformation$Companion;->getNone()Landroidx/compose/ui/text/input/VisualTransformation;

    move-result-object p1

    return-object p1
.end method

.method public filter(Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    const-string v0, "userTyped"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 58
    check-cast p1, Ljava/lang/CharSequence;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    check-cast v0, Ljava/lang/Appendable;

    .line 59
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    .line 60
    invoke-interface {p1, v2}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v3

    .line 51
    invoke-static {v3}, Ljava/lang/Character;->isDigit(C)Z

    move-result v4

    if-eqz v4, :cond_0

    .line 61
    invoke-interface {v0, v3}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 63
    :cond_1
    check-cast v0, Ljava/lang/StringBuilder;

    .line 58
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public getCapitalization-IUNYP9k()I
    .locals 1

    .line 16
    iget v0, p0, Lcom/stripe/android/ui/core/elements/CvcConfig;->capitalization:I

    return v0
.end method

.method public getDebugLabel()Ljava/lang/String;
    .locals 1

    .line 17
    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/CvcConfig;->debugLabel:Ljava/lang/String;

    return-object v0
.end method

.method public getKeyboard-PjHm6EE()I
    .locals 1

    .line 19
    iget v0, p0, Lcom/stripe/android/ui/core/elements/CvcConfig;->keyboard:I

    return v0
.end method

.method public getLabel()Lcom/stripe/android/core/strings/ResolvableString;
    .locals 1

    .line 18
    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/CvcConfig;->label:Lcom/stripe/android/core/strings/ResolvableString;

    return-object v0
.end method
