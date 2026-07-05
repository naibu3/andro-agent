.class public final Lcom/stripe/android/uicore/elements/PostalCodeConfig;
.super Ljava/lang/Object;
.source "PostalCodeConfig.kt"

# interfaces
.implements Lcom/stripe/android/uicore/elements/TextFieldConfig;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/uicore/elements/PostalCodeConfig$CountryPostalFormat;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nPostalCodeConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PostalCodeConfig.kt\ncom/stripe/android/uicore/elements/PostalCodeConfig\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,140:1\n434#2:141\n507#2,5:142\n434#2:147\n507#2,5:148\n*S KotlinDebug\n*F\n+ 1 PostalCodeConfig.kt\ncom/stripe/android/uicore/elements/PostalCodeConfig\n*L\n81#1:141\n81#1:142,5\n83#1:147\n83#1:148,5\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\t\u0008\u0007\u0018\u00002\u00020\u0001:\u0001/B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0010\u0008\u0002\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0010\u0010&\u001a\u00020\'2\u0006\u0010(\u001a\u00020\u0008H\u0016J\u0010\u0010)\u001a\u00020\u00082\u0006\u0010*\u001a\u00020\u0008H\u0016J\u0010\u0010+\u001a\u00020\u00082\u0006\u0010,\u001a\u00020\u0008H\u0016J\u0010\u0010-\u001a\u00020\u00082\u0006\u0010.\u001a\u00020\u0008H\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000cR\u001c\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000eR\u000e\u0010\u0007\u001a\u00020\u0008X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0011\u001a\u00020\u0012X\u0096\u0004\u00a2\u0006\n\n\u0002\u0010\u0015\u001a\u0004\u0008\u0013\u0010\u0014R\u0016\u0010\u0016\u001a\u00020\u0017X\u0096\u0004\u00a2\u0006\n\n\u0002\u0010\u0015\u001a\u0004\u0008\u0018\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u0008X\u0096D\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u001dX\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001e\u0010\u001fR\u001a\u0010 \u001a\u0008\u0012\u0004\u0012\u00020!0\u0005X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\"\u0010\u000eR\u0014\u0010#\u001a\u00020!X\u0096D\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008$\u0010%\u00a8\u00060"
    }
    d2 = {
        "Lcom/stripe/android/uicore/elements/PostalCodeConfig;",
        "Lcom/stripe/android/uicore/elements/TextFieldConfig;",
        "label",
        "Lcom/stripe/android/core/strings/ResolvableString;",
        "trailingIcon",
        "Lkotlinx/coroutines/flow/MutableStateFlow;",
        "Lcom/stripe/android/uicore/elements/TextFieldIcon;",
        "country",
        "",
        "<init>",
        "(Lcom/stripe/android/core/strings/ResolvableString;Lkotlinx/coroutines/flow/MutableStateFlow;Ljava/lang/String;)V",
        "getLabel",
        "()Lcom/stripe/android/core/strings/ResolvableString;",
        "getTrailingIcon",
        "()Lkotlinx/coroutines/flow/MutableStateFlow;",
        "format",
        "Lcom/stripe/android/uicore/elements/PostalCodeConfig$CountryPostalFormat;",
        "capitalization",
        "Landroidx/compose/ui/text/input/KeyboardCapitalization;",
        "getCapitalization-IUNYP9k",
        "()I",
        "I",
        "keyboard",
        "Landroidx/compose/ui/text/input/KeyboardType;",
        "getKeyboard-PjHm6EE",
        "debugLabel",
        "getDebugLabel",
        "()Ljava/lang/String;",
        "visualTransformation",
        "Landroidx/compose/ui/text/input/VisualTransformation;",
        "getVisualTransformation",
        "()Landroidx/compose/ui/text/input/VisualTransformation;",
        "loading",
        "",
        "getLoading",
        "shouldAnnounceFieldValue",
        "getShouldAnnounceFieldValue",
        "()Z",
        "determineState",
        "Lcom/stripe/android/uicore/elements/TextFieldState;",
        "input",
        "filter",
        "userTyped",
        "convertToRaw",
        "displayName",
        "convertFromRaw",
        "rawValue",
        "CountryPostalFormat",
        "stripe-ui-core_release"
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

.field private final country:Ljava/lang/String;

.field private final debugLabel:Ljava/lang/String;

.field private final format:Lcom/stripe/android/uicore/elements/PostalCodeConfig$CountryPostalFormat;

.field private final keyboard:I

.field private final label:Lcom/stripe/android/core/strings/ResolvableString;

.field private final loading:Lkotlinx/coroutines/flow/MutableStateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/MutableStateFlow<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final shouldAnnounceFieldValue:Z

.field private final trailingIcon:Lkotlinx/coroutines/flow/MutableStateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/MutableStateFlow<",
            "Lcom/stripe/android/uicore/elements/TextFieldIcon;",
            ">;"
        }
    .end annotation
.end field

.field private final visualTransformation:Landroidx/compose/ui/text/input/VisualTransformation;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/core/strings/ResolvableString;Lkotlinx/coroutines/flow/MutableStateFlow;Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/core/strings/ResolvableString;",
            "Lkotlinx/coroutines/flow/MutableStateFlow<",
            "Lcom/stripe/android/uicore/elements/TextFieldIcon;",
            ">;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    const-string v0, "label"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "trailingIcon"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "country"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    iput-object p1, p0, Lcom/stripe/android/uicore/elements/PostalCodeConfig;->label:Lcom/stripe/android/core/strings/ResolvableString;

    .line 14
    iput-object p2, p0, Lcom/stripe/android/uicore/elements/PostalCodeConfig;->trailingIcon:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 15
    iput-object p3, p0, Lcom/stripe/android/uicore/elements/PostalCodeConfig;->country:Ljava/lang/String;

    .line 17
    sget-object p1, Lcom/stripe/android/uicore/elements/PostalCodeConfig$CountryPostalFormat;->Companion:Lcom/stripe/android/uicore/elements/PostalCodeConfig$CountryPostalFormat$Companion;

    invoke-virtual {p1, p3}, Lcom/stripe/android/uicore/elements/PostalCodeConfig$CountryPostalFormat$Companion;->forCountry(Ljava/lang/String;)Lcom/stripe/android/uicore/elements/PostalCodeConfig$CountryPostalFormat;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/uicore/elements/PostalCodeConfig;->format:Lcom/stripe/android/uicore/elements/PostalCodeConfig$CountryPostalFormat;

    .line 20
    sget-object p2, Lcom/stripe/android/uicore/elements/PostalCodeConfig$CountryPostalFormat$US;->INSTANCE:Lcom/stripe/android/uicore/elements/PostalCodeConfig$CountryPostalFormat$US;

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    sget-object p2, Landroidx/compose/ui/text/input/KeyboardCapitalization;->Companion:Landroidx/compose/ui/text/input/KeyboardCapitalization$Companion;

    invoke-virtual {p2}, Landroidx/compose/ui/text/input/KeyboardCapitalization$Companion;->getNone-IUNYP9k()I

    move-result p2

    goto :goto_1

    .line 21
    :cond_0
    sget-object p2, Lcom/stripe/android/uicore/elements/PostalCodeConfig$CountryPostalFormat$CA;->INSTANCE:Lcom/stripe/android/uicore/elements/PostalCodeConfig$CountryPostalFormat$CA;

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_2

    .line 22
    sget-object p2, Lcom/stripe/android/uicore/elements/PostalCodeConfig$CountryPostalFormat$GB;->INSTANCE:Lcom/stripe/android/uicore/elements/PostalCodeConfig$CountryPostalFormat$GB;

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_2

    .line 23
    sget-object p2, Lcom/stripe/android/uicore/elements/PostalCodeConfig$CountryPostalFormat$Other;->INSTANCE:Lcom/stripe/android/uicore/elements/PostalCodeConfig$CountryPostalFormat$Other;

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_1

    goto :goto_0

    .line 19
    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    .line 23
    :cond_2
    :goto_0
    sget-object p2, Landroidx/compose/ui/text/input/KeyboardCapitalization;->Companion:Landroidx/compose/ui/text/input/KeyboardCapitalization$Companion;

    invoke-virtual {p2}, Landroidx/compose/ui/text/input/KeyboardCapitalization$Companion;->getCharacters-IUNYP9k()I

    move-result p2

    .line 19
    :goto_1
    iput p2, p0, Lcom/stripe/android/uicore/elements/PostalCodeConfig;->capitalization:I

    .line 27
    sget-object p2, Lcom/stripe/android/uicore/elements/PostalCodeConfig$CountryPostalFormat$US;->INSTANCE:Lcom/stripe/android/uicore/elements/PostalCodeConfig$CountryPostalFormat$US;

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_3

    sget-object p2, Landroidx/compose/ui/text/input/KeyboardType;->Companion:Landroidx/compose/ui/text/input/KeyboardType$Companion;

    invoke-virtual {p2}, Landroidx/compose/ui/text/input/KeyboardType$Companion;->getNumberPassword-PjHm6EE()I

    move-result p2

    goto :goto_3

    .line 28
    :cond_3
    sget-object p2, Lcom/stripe/android/uicore/elements/PostalCodeConfig$CountryPostalFormat$CA;->INSTANCE:Lcom/stripe/android/uicore/elements/PostalCodeConfig$CountryPostalFormat$CA;

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_5

    .line 29
    sget-object p2, Lcom/stripe/android/uicore/elements/PostalCodeConfig$CountryPostalFormat$GB;->INSTANCE:Lcom/stripe/android/uicore/elements/PostalCodeConfig$CountryPostalFormat$GB;

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_5

    .line 30
    sget-object p2, Lcom/stripe/android/uicore/elements/PostalCodeConfig$CountryPostalFormat$Other;->INSTANCE:Lcom/stripe/android/uicore/elements/PostalCodeConfig$CountryPostalFormat$Other;

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_4

    goto :goto_2

    .line 26
    :cond_4
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    .line 30
    :cond_5
    :goto_2
    sget-object p2, Landroidx/compose/ui/text/input/KeyboardType;->Companion:Landroidx/compose/ui/text/input/KeyboardType$Companion;

    invoke-virtual {p2}, Landroidx/compose/ui/text/input/KeyboardType$Companion;->getText-PjHm6EE()I

    move-result p2

    .line 26
    :goto_3
    iput p2, p0, Lcom/stripe/android/uicore/elements/PostalCodeConfig;->keyboard:I

    .line 33
    const-string p2, "postal_code_text"

    iput-object p2, p0, Lcom/stripe/android/uicore/elements/PostalCodeConfig;->debugLabel:Ljava/lang/String;

    .line 35
    new-instance p2, Lcom/stripe/android/uicore/elements/PostalCodeVisualTransformation;

    invoke-direct {p2, p1}, Lcom/stripe/android/uicore/elements/PostalCodeVisualTransformation;-><init>(Lcom/stripe/android/uicore/elements/PostalCodeConfig$CountryPostalFormat;)V

    check-cast p2, Landroidx/compose/ui/text/input/VisualTransformation;

    iput-object p2, p0, Lcom/stripe/android/uicore/elements/PostalCodeConfig;->visualTransformation:Landroidx/compose/ui/text/input/VisualTransformation;

    const/4 p1, 0x0

    .line 36
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-static {p1}, Lkotlinx/coroutines/flow/StateFlowKt;->MutableStateFlow(Ljava/lang/Object;)Lkotlinx/coroutines/flow/MutableStateFlow;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/uicore/elements/PostalCodeConfig;->loading:Lkotlinx/coroutines/flow/MutableStateFlow;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/stripe/android/core/strings/ResolvableString;Lkotlinx/coroutines/flow/MutableStateFlow;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_0

    const/4 p2, 0x0

    .line 14
    invoke-static {p2}, Lkotlinx/coroutines/flow/StateFlowKt;->MutableStateFlow(Ljava/lang/Object;)Lkotlinx/coroutines/flow/MutableStateFlow;

    move-result-object p2

    .line 12
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lcom/stripe/android/uicore/elements/PostalCodeConfig;-><init>(Lcom/stripe/android/core/strings/ResolvableString;Lkotlinx/coroutines/flow/MutableStateFlow;Ljava/lang/String;)V

    return-void
.end method

.method public static final synthetic access$getCountry$p(Lcom/stripe/android/uicore/elements/PostalCodeConfig;)Ljava/lang/String;
    .locals 0

    .line 11
    iget-object p0, p0, Lcom/stripe/android/uicore/elements/PostalCodeConfig;->country:Ljava/lang/String;

    return-object p0
.end method

.method public static final synthetic access$getFormat$p(Lcom/stripe/android/uicore/elements/PostalCodeConfig;)Lcom/stripe/android/uicore/elements/PostalCodeConfig$CountryPostalFormat;
    .locals 0

    .line 11
    iget-object p0, p0, Lcom/stripe/android/uicore/elements/PostalCodeConfig;->format:Lcom/stripe/android/uicore/elements/PostalCodeConfig$CountryPostalFormat;

    return-object p0
.end method


# virtual methods
.method public convertFromRaw(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    const-string v0, "rawValue"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 91
    check-cast p1, Ljava/lang/CharSequence;

    new-instance v0, Lkotlin/text/Regex;

    const-string v1, "\\s+"

    invoke-direct {v0, v1}, Lkotlin/text/Regex;-><init>(Ljava/lang/String;)V

    const-string v1, ""

    invoke-virtual {v0, p1, v1}, Lkotlin/text/Regex;->replace(Ljava/lang/CharSequence;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public convertToRaw(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    const-string v0, "displayName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public determineState(Ljava/lang/String;)Lcom/stripe/android/uicore/elements/TextFieldState;
    .locals 1

    const-string v0, "input"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 39
    new-instance v0, Lcom/stripe/android/uicore/elements/PostalCodeConfig$determineState$1;

    invoke-direct {v0, p0, p1}, Lcom/stripe/android/uicore/elements/PostalCodeConfig$determineState$1;-><init>(Lcom/stripe/android/uicore/elements/PostalCodeConfig;Ljava/lang/String;)V

    check-cast v0, Lcom/stripe/android/uicore/elements/TextFieldState;

    return-object v0
.end method

.method public filter(Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    const-string v0, "userTyped"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 80
    iget-object v0, p0, Lcom/stripe/android/uicore/elements/PostalCodeConfig;->format:Lcom/stripe/android/uicore/elements/PostalCodeConfig$CountryPostalFormat;

    .line 81
    sget-object v1, Lcom/stripe/android/uicore/elements/PostalCodeConfig$CountryPostalFormat$US;->INSTANCE:Lcom/stripe/android/uicore/elements/PostalCodeConfig$CountryPostalFormat$US;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    .line 141
    check-cast p1, Ljava/lang/CharSequence;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    check-cast v0, Ljava/lang/Appendable;

    .line 142
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    :goto_0
    if-ge v2, v1, :cond_1

    .line 143
    invoke-interface {p1, v2}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v3

    .line 81
    invoke-static {v3}, Ljava/lang/Character;->isDigit(C)Z

    move-result v4

    if-eqz v4, :cond_0

    .line 144
    invoke-interface {v0, v3}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 146
    :cond_1
    check-cast v0, Ljava/lang/StringBuilder;

    .line 141
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    goto :goto_3

    .line 82
    :cond_2
    sget-object v1, Lcom/stripe/android/uicore/elements/PostalCodeConfig$CountryPostalFormat$CA;->INSTANCE:Lcom/stripe/android/uicore/elements/PostalCodeConfig$CountryPostalFormat$CA;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    .line 83
    sget-object v1, Lcom/stripe/android/uicore/elements/PostalCodeConfig$CountryPostalFormat$GB;->INSTANCE:Lcom/stripe/android/uicore/elements/PostalCodeConfig$CountryPostalFormat$GB;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    goto :goto_1

    .line 84
    :cond_3
    sget-object v1, Lcom/stripe/android/uicore/elements/PostalCodeConfig$CountryPostalFormat$Other;->INSTANCE:Lcom/stripe/android/uicore/elements/PostalCodeConfig$CountryPostalFormat$Other;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    goto :goto_3

    .line 80
    :cond_4
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    .line 147
    :cond_5
    :goto_1
    check-cast p1, Ljava/lang/CharSequence;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    check-cast v0, Ljava/lang/Appendable;

    .line 148
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    :goto_2
    if-ge v2, v1, :cond_7

    .line 149
    invoke-interface {p1, v2}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v3

    .line 83
    invoke-static {v3}, Ljava/lang/Character;->isLetterOrDigit(C)Z

    move-result v4

    if-eqz v4, :cond_6

    .line 150
    invoke-interface {v0, v3}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;

    :cond_6
    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    .line 152
    :cond_7
    check-cast v0, Ljava/lang/StringBuilder;

    .line 147
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 83
    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {p1, v0}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "toUpperCase(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 85
    :goto_3
    iget-object v0, p0, Lcom/stripe/android/uicore/elements/PostalCodeConfig;->format:Lcom/stripe/android/uicore/elements/PostalCodeConfig$CountryPostalFormat;

    invoke-virtual {v0}, Lcom/stripe/android/uicore/elements/PostalCodeConfig$CountryPostalFormat;->getMaximumLength()I

    move-result v0

    invoke-static {p1, v0}, Lkotlin/text/StringsKt;->take(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public getCapitalization-IUNYP9k()I
    .locals 1

    .line 19
    iget v0, p0, Lcom/stripe/android/uicore/elements/PostalCodeConfig;->capitalization:I

    return v0
.end method

.method public getDebugLabel()Ljava/lang/String;
    .locals 1

    .line 33
    iget-object v0, p0, Lcom/stripe/android/uicore/elements/PostalCodeConfig;->debugLabel:Ljava/lang/String;

    return-object v0
.end method

.method public getKeyboard-PjHm6EE()I
    .locals 1

    .line 26
    iget v0, p0, Lcom/stripe/android/uicore/elements/PostalCodeConfig;->keyboard:I

    return v0
.end method

.method public getLabel()Lcom/stripe/android/core/strings/ResolvableString;
    .locals 1

    .line 13
    iget-object v0, p0, Lcom/stripe/android/uicore/elements/PostalCodeConfig;->label:Lcom/stripe/android/core/strings/ResolvableString;

    return-object v0
.end method

.method public getLayoutDirection()Landroidx/compose/ui/unit/LayoutDirection;
    .locals 1

    .line 11
    invoke-static {p0}, Lcom/stripe/android/uicore/elements/TextFieldConfig$DefaultImpls;->getLayoutDirection(Lcom/stripe/android/uicore/elements/TextFieldConfig;)Landroidx/compose/ui/unit/LayoutDirection;

    move-result-object v0

    return-object v0
.end method

.method public getLoading()Lkotlinx/coroutines/flow/MutableStateFlow;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/MutableStateFlow<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .line 36
    iget-object v0, p0, Lcom/stripe/android/uicore/elements/PostalCodeConfig;->loading:Lkotlinx/coroutines/flow/MutableStateFlow;

    return-object v0
.end method

.method public bridge synthetic getLoading()Lkotlinx/coroutines/flow/StateFlow;
    .locals 1

    .line 11
    invoke-virtual {p0}, Lcom/stripe/android/uicore/elements/PostalCodeConfig;->getLoading()Lkotlinx/coroutines/flow/MutableStateFlow;

    move-result-object v0

    check-cast v0, Lkotlinx/coroutines/flow/StateFlow;

    return-object v0
.end method

.method public getOverrideContentDescriptionProvider()Lkotlin/jvm/functions/Function1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/lang/String;",
            "Lcom/stripe/android/core/strings/ResolvableString;",
            ">;"
        }
    .end annotation

    .line 11
    invoke-static {p0}, Lcom/stripe/android/uicore/elements/TextFieldConfig$DefaultImpls;->getOverrideContentDescriptionProvider(Lcom/stripe/android/uicore/elements/TextFieldConfig;)Lkotlin/jvm/functions/Function1;

    move-result-object v0

    return-object v0
.end method

.method public getPlaceHolder()Ljava/lang/String;
    .locals 1

    .line 11
    invoke-static {p0}, Lcom/stripe/android/uicore/elements/TextFieldConfig$DefaultImpls;->getPlaceHolder(Lcom/stripe/android/uicore/elements/TextFieldConfig;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getShouldAnnounceFieldValue()Z
    .locals 1

    .line 37
    iget-boolean v0, p0, Lcom/stripe/android/uicore/elements/PostalCodeConfig;->shouldAnnounceFieldValue:Z

    return v0
.end method

.method public getShouldAnnounceLabel()Z
    .locals 1

    .line 11
    invoke-static {p0}, Lcom/stripe/android/uicore/elements/TextFieldConfig$DefaultImpls;->getShouldAnnounceLabel(Lcom/stripe/android/uicore/elements/TextFieldConfig;)Z

    move-result v0

    return v0
.end method

.method public getTrailingIcon()Lkotlinx/coroutines/flow/MutableStateFlow;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/MutableStateFlow<",
            "Lcom/stripe/android/uicore/elements/TextFieldIcon;",
            ">;"
        }
    .end annotation

    .line 14
    iget-object v0, p0, Lcom/stripe/android/uicore/elements/PostalCodeConfig;->trailingIcon:Lkotlinx/coroutines/flow/MutableStateFlow;

    return-object v0
.end method

.method public bridge synthetic getTrailingIcon()Lkotlinx/coroutines/flow/StateFlow;
    .locals 1

    .line 11
    invoke-virtual {p0}, Lcom/stripe/android/uicore/elements/PostalCodeConfig;->getTrailingIcon()Lkotlinx/coroutines/flow/MutableStateFlow;

    move-result-object v0

    check-cast v0, Lkotlinx/coroutines/flow/StateFlow;

    return-object v0
.end method

.method public getVisualTransformation()Landroidx/compose/ui/text/input/VisualTransformation;
    .locals 1

    .line 34
    iget-object v0, p0, Lcom/stripe/android/uicore/elements/PostalCodeConfig;->visualTransformation:Landroidx/compose/ui/text/input/VisualTransformation;

    return-object v0
.end method
