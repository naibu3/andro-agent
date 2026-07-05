.class public final Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$WithRegion;
.super Lcom/stripe/android/uicore/elements/PhoneNumberFormatter;
.source "PhoneNumberFormatter.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/uicore/elements/PhoneNumberFormatter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "WithRegion"
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nPhoneNumberFormatter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PhoneNumberFormatter.kt\ncom/stripe/android/uicore/elements/PhoneNumberFormatter$WithRegion\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,508:1\n434#2:509\n507#2,5:510\n1179#2,2:515\n*S KotlinDebug\n*F\n+ 1 PhoneNumberFormatter.kt\ncom/stripe/android/uicore/elements/PhoneNumberFormatter$WithRegion\n*L\n60#1:509\n60#1:510,5\n135#1:515,2\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0010\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0007H\u0016J\u0010\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0007H\u0016J\u000e\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\tR\u0014\u0010\n\u001a\u00020\u0007X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\tR\u0014\u0010\u000c\u001a\u00020\u0007X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\tR\u0014\u0010\u0011\u001a\u00020\u0012X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u0014\u00a8\u0006\u0017"
    }
    d2 = {
        "Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$WithRegion;",
        "Lcom/stripe/android/uicore/elements/PhoneNumberFormatter;",
        "metadata",
        "Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;",
        "<init>",
        "(Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;)V",
        "prefix",
        "",
        "getPrefix",
        "()Ljava/lang/String;",
        "placeholder",
        "getPlaceholder",
        "countryCode",
        "getCountryCode",
        "userInputFilter",
        "input",
        "toE164Format",
        "visualTransformation",
        "Landroidx/compose/ui/text/input/VisualTransformation;",
        "getVisualTransformation",
        "()Landroidx/compose/ui/text/input/VisualTransformation;",
        "formatNumberNational",
        "filteredInput",
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
.field public static final $stable:I


# instance fields
.field private final countryCode:Ljava/lang/String;

.field private final metadata:Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

.field private final placeholder:Ljava/lang/String;

.field private final prefix:Ljava/lang/String;

.field private final visualTransformation:Landroidx/compose/ui/text/input/VisualTransformation;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;)V
    .locals 7

    const-string v0, "metadata"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 54
    invoke-direct {p0, v0}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$WithRegion;->metadata:Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    .line 55
    invoke-virtual {p1}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;->getPrefix()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$WithRegion;->prefix:Ljava/lang/String;

    .line 56
    invoke-virtual {p1}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;->getPattern()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/16 v2, 0x23

    const/16 v3, 0x35

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Lkotlin/text/StringsKt;->replace$default(Ljava/lang/String;CCZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1

    :cond_0
    const-string v0, ""

    :cond_1
    iput-object v0, p0, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$WithRegion;->placeholder:Ljava/lang/String;

    .line 57
    invoke-virtual {p1}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;->getRegionCode()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$WithRegion;->countryCode:Ljava/lang/String;

    .line 66
    new-instance p1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$WithRegion$visualTransformation$1;

    invoke-direct {p1, p0}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$WithRegion$visualTransformation$1;-><init>(Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$WithRegion;)V

    check-cast p1, Landroidx/compose/ui/text/input/VisualTransformation;

    iput-object p1, p0, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$WithRegion;->visualTransformation:Landroidx/compose/ui/text/input/VisualTransformation;

    return-void
.end method

.method public static final synthetic access$getMetadata$p(Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$WithRegion;)Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;
    .locals 0

    .line 54
    iget-object p0, p0, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$WithRegion;->metadata:Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    return-object p0
.end method


# virtual methods
.method public final formatNumberNational(Ljava/lang/String;)Ljava/lang/String;
    .locals 6

    const-string v0, "filteredInput"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 129
    iget-object v0, p0, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$WithRegion;->metadata:Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    invoke-virtual {v0}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;->getPattern()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    return-object p1

    .line 134
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 135
    iget-object v1, p0, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$WithRegion;->metadata:Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    invoke-virtual {v1}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;->getPattern()Ljava/lang/String;

    move-result-object v1

    check-cast v1, Ljava/lang/CharSequence;

    const/4 v2, 0x0

    move v3, v2

    .line 515
    :goto_0
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v4

    if-ge v2, v4, :cond_3

    invoke-interface {v1, v2}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v4

    .line 136
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v5

    if-ge v3, v5, :cond_2

    const/16 v5, 0x23

    if-ne v4, v5, :cond_1

    .line 139
    invoke-virtual {p1, v3}, Ljava/lang/String;->charAt(I)C

    move-result v4

    add-int/lit8 v3, v3, 0x1

    .line 137
    :cond_1
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 150
    :cond_3
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    if-ge v3, v1, :cond_4

    const/16 v1, 0x20

    .line 151
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 152
    invoke-virtual {p1, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    const-string v2, "substring(...)"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/String;->toCharArray()[C

    move-result-object p1

    const-string v2, "toCharArray(...)"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append([C)Ljava/lang/StringBuilder;

    .line 155
    :cond_4
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "toString(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public getCountryCode()Ljava/lang/String;
    .locals 1

    .line 57
    iget-object v0, p0, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$WithRegion;->countryCode:Ljava/lang/String;

    return-object v0
.end method

.method public getPlaceholder()Ljava/lang/String;
    .locals 1

    .line 56
    iget-object v0, p0, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$WithRegion;->placeholder:Ljava/lang/String;

    return-object v0
.end method

.method public getPrefix()Ljava/lang/String;
    .locals 1

    .line 55
    iget-object v0, p0, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$WithRegion;->prefix:Ljava/lang/String;

    return-object v0
.end method

.method public getVisualTransformation()Landroidx/compose/ui/text/input/VisualTransformation;
    .locals 1

    .line 66
    iget-object v0, p0, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$WithRegion;->visualTransformation:Landroidx/compose/ui/text/input/VisualTransformation;

    return-object v0
.end method

.method public toE164Format(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    const-string v0, "input"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 64
    invoke-virtual {p0}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$WithRegion;->getPrefix()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, p1}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$WithRegion;->userInputFilter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x1

    new-array v1, v1, [C

    const/16 v2, 0x30

    const/4 v3, 0x0

    aput-char v2, v1, v3

    invoke-static {p1, v1}, Lkotlin/text/StringsKt;->trimStart(Ljava/lang/String;[C)Ljava/lang/String;

    move-result-object p1

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public userInputFilter(Ljava/lang/String;)Ljava/lang/String;
    .locals 6

    const-string v0, "input"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 509
    check-cast p1, Ljava/lang/CharSequence;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    check-cast v0, Ljava/lang/Appendable;

    .line 510
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_1

    .line 511
    invoke-interface {p1, v3}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v4

    .line 60
    sget-object v5, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter;->Companion:Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Companion;

    invoke-virtual {v5}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Companion;->getVALID_INPUT_RANGE()Lkotlin/ranges/CharRange;

    move-result-object v5

    invoke-virtual {v5, v4}, Lkotlin/ranges/CharRange;->contains(C)Z

    move-result v5

    if-eqz v5, :cond_0

    .line 512
    invoke-interface {v0, v4}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 514
    :cond_1
    check-cast v0, Ljava/lang/StringBuilder;

    .line 509
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 61
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0xf

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    invoke-virtual {p1, v2, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p1

    const-string v0, "substring(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method
