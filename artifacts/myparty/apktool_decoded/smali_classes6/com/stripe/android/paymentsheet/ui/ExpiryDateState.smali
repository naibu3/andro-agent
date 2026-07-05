.class public final Lcom/stripe/android/paymentsheet/ui/ExpiryDateState;
.super Ljava/lang/Object;
.source "ExpiryDateState.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/paymentsheet/ui/ExpiryDateState$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nExpiryDateState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExpiryDateState.kt\ncom/stripe/android/paymentsheet/ui/ExpiryDateState\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,158:1\n18#2:159\n*S KotlinDebug\n*F\n+ 1 ExpiryDateState.kt\ncom/stripe/android/paymentsheet/ui/ExpiryDateState\n*L\n63#1:159\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0011\u0008\u0081\u0008\u0018\u0000 ,2\u00020\u0001:\u0001,B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0006\u0010\u001a\u001a\u00020\u0005J\u0008\u0010\u001b\u001a\u0004\u0018\u00010\u001cJ\u000e\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u0003J7\u0010\u001f\u001a\u0004\u0018\u00010\u0015*\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u00112\u0006\u0010 \u001a\u00020\u00122\u0006\u0010!\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020\u0015H\u0002\u00a2\u0006\u0002\u0010#J\t\u0010$\u001a\u00020\u0003H\u00c6\u0003J\t\u0010%\u001a\u00020\u0005H\u00c6\u0003J\t\u0010&\u001a\u00020\u0007H\u00c2\u0003J\'\u0010\'\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0007H\u00c6\u0001J\u0013\u0010(\u001a\u00020\u00052\u0008\u0010)\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010*\u001a\u00020\u0015H\u00d6\u0001J\t\u0010+\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\rR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u00158F\u00a2\u0006\u0006\u001a\u0004\u0008\u0016\u0010\u0017R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u00158F\u00a2\u0006\u0006\u001a\u0004\u0008\u0019\u0010\u0017\u00a8\u0006-"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/ui/ExpiryDateState;",
        "",
        "text",
        "",
        "enabled",
        "",
        "dateConfig",
        "Lcom/stripe/android/uicore/elements/DateConfig;",
        "<init>",
        "(Ljava/lang/String;ZLcom/stripe/android/uicore/elements/DateConfig;)V",
        "getText",
        "()Ljava/lang/String;",
        "getEnabled",
        "()Z",
        "textFieldState",
        "Lcom/stripe/android/uicore/elements/TextFieldState;",
        "formFieldValues",
        "",
        "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
        "Lcom/stripe/android/uicore/forms/FormFieldEntry;",
        "expiryMonth",
        "",
        "getExpiryMonth",
        "()Ljava/lang/Integer;",
        "expiryYear",
        "getExpiryYear",
        "shouldShowError",
        "sectionError",
        "Lcom/stripe/android/core/strings/ResolvableString;",
        "onDateChanged",
        "proposedValue",
        "toIntOrNull",
        "key",
        "min",
        "max",
        "(Ljava/util/Map;Lcom/stripe/android/uicore/elements/IdentifierSpec;II)Ljava/lang/Integer;",
        "component1",
        "component2",
        "component3",
        "copy",
        "equals",
        "other",
        "hashCode",
        "toString",
        "Companion",
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

.field public static final Companion:Lcom/stripe/android/paymentsheet/ui/ExpiryDateState$Companion;


# instance fields
.field private final dateConfig:Lcom/stripe/android/uicore/elements/DateConfig;

.field private final enabled:Z

.field private final formFieldValues:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
            "Lcom/stripe/android/uicore/forms/FormFieldEntry;",
            ">;"
        }
    .end annotation
.end field

.field private final text:Ljava/lang/String;

.field private final textFieldState:Lcom/stripe/android/uicore/elements/TextFieldState;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/paymentsheet/ui/ExpiryDateState$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/paymentsheet/ui/ExpiryDateState$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/paymentsheet/ui/ExpiryDateState;->Companion:Lcom/stripe/android/paymentsheet/ui/ExpiryDateState$Companion;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ZLcom/stripe/android/uicore/elements/DateConfig;)V
    .locals 3

    const-string v0, "text"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dateConfig"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    iput-object p1, p0, Lcom/stripe/android/paymentsheet/ui/ExpiryDateState;->text:Ljava/lang/String;

    .line 17
    iput-boolean p2, p0, Lcom/stripe/android/paymentsheet/ui/ExpiryDateState;->enabled:Z

    .line 18
    iput-object p3, p0, Lcom/stripe/android/paymentsheet/ui/ExpiryDateState;->dateConfig:Lcom/stripe/android/uicore/elements/DateConfig;

    .line 21
    move-object p1, p0

    check-cast p1, Lcom/stripe/android/paymentsheet/ui/ExpiryDateState;

    .line 22
    iget-object p1, p0, Lcom/stripe/android/paymentsheet/ui/ExpiryDateState;->text:Ljava/lang/String;

    const-string p2, "\u2022\u2022 / \u2022\u2022"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 23
    sget-object p1, Lcom/stripe/android/uicore/elements/TextFieldStateConstants$Error$Blank;->INSTANCE:Lcom/stripe/android/uicore/elements/TextFieldStateConstants$Error$Blank;

    check-cast p1, Lcom/stripe/android/uicore/elements/TextFieldState;

    goto :goto_0

    .line 25
    :cond_0
    iget-object p1, p0, Lcom/stripe/android/paymentsheet/ui/ExpiryDateState;->dateConfig:Lcom/stripe/android/uicore/elements/DateConfig;

    iget-object p2, p0, Lcom/stripe/android/paymentsheet/ui/ExpiryDateState;->text:Ljava/lang/String;

    invoke-virtual {p1, p2}, Lcom/stripe/android/uicore/elements/DateConfig;->determineState(Ljava/lang/String;)Lcom/stripe/android/uicore/elements/TextFieldState;

    move-result-object p1

    .line 21
    :goto_0
    iput-object p1, p0, Lcom/stripe/android/paymentsheet/ui/ExpiryDateState;->textFieldState:Lcom/stripe/android/uicore/elements/TextFieldState;

    .line 30
    iget-object p1, p0, Lcom/stripe/android/paymentsheet/ui/ExpiryDateState;->textFieldState:Lcom/stripe/android/uicore/elements/TextFieldState;

    invoke-interface {p1}, Lcom/stripe/android/uicore/elements/TextFieldState;->isValid()Z

    move-result p1

    const/4 p2, 0x0

    if-eqz p1, :cond_1

    .line 31
    sget-object p1, Lcom/stripe/android/ui/core/elements/CardDetailsUtil;->INSTANCE:Lcom/stripe/android/ui/core/elements/CardDetailsUtil;

    new-instance p3, Lcom/stripe/android/uicore/forms/FormFieldEntry;

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/ExpiryDateState;->text:Ljava/lang/String;

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-direct {p3, v0, v1, v2, p2}, Lcom/stripe/android/uicore/forms/FormFieldEntry;-><init>(Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {p1, p3}, Lcom/stripe/android/ui/core/elements/CardDetailsUtil;->createExpiryDateFormFieldValues(Lcom/stripe/android/uicore/forms/FormFieldEntry;)Ljava/util/Map;

    move-result-object p2

    .line 29
    :cond_1
    iput-object p2, p0, Lcom/stripe/android/paymentsheet/ui/ExpiryDateState;->formFieldValues:Ljava/util/Map;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;ZLcom/stripe/android/uicore/elements/DateConfig;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    .line 18
    new-instance p3, Lcom/stripe/android/uicore/elements/DateConfig;

    invoke-direct {p3}, Lcom/stripe/android/uicore/elements/DateConfig;-><init>()V

    .line 15
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lcom/stripe/android/paymentsheet/ui/ExpiryDateState;-><init>(Ljava/lang/String;ZLcom/stripe/android/uicore/elements/DateConfig;)V

    return-void
.end method

.method private final component3()Lcom/stripe/android/uicore/elements/DateConfig;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/ExpiryDateState;->dateConfig:Lcom/stripe/android/uicore/elements/DateConfig;

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/stripe/android/paymentsheet/ui/ExpiryDateState;Ljava/lang/String;ZLcom/stripe/android/uicore/elements/DateConfig;ILjava/lang/Object;)Lcom/stripe/android/paymentsheet/ui/ExpiryDateState;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-object p1, p0, Lcom/stripe/android/paymentsheet/ui/ExpiryDateState;->text:Ljava/lang/String;

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget-boolean p2, p0, Lcom/stripe/android/paymentsheet/ui/ExpiryDateState;->enabled:Z

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-object p3, p0, Lcom/stripe/android/paymentsheet/ui/ExpiryDateState;->dateConfig:Lcom/stripe/android/uicore/elements/DateConfig;

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lcom/stripe/android/paymentsheet/ui/ExpiryDateState;->copy(Ljava/lang/String;ZLcom/stripe/android/uicore/elements/DateConfig;)Lcom/stripe/android/paymentsheet/ui/ExpiryDateState;

    move-result-object p0

    return-object p0
.end method

.method private final toIntOrNull(Ljava/util/Map;Lcom/stripe/android/uicore/elements/IdentifierSpec;II)Ljava/lang/Integer;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
            "Lcom/stripe/android/uicore/forms/FormFieldEntry;",
            ">;",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
            "II)",
            "Ljava/lang/Integer;"
        }
    .end annotation

    .line 82
    invoke-interface {p1, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/uicore/forms/FormFieldEntry;

    const/4 p2, 0x0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/stripe/android/uicore/forms/FormFieldEntry;->getValue()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-static {p1}, Lkotlin/text/StringsKt;->toIntOrNull(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object p1

    if-eqz p1, :cond_0

    move-object v0, p1

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    if-gt p3, v0, :cond_0

    if-gt v0, p4, :cond_0

    return-object p1

    :cond_0
    return-object p2
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/ExpiryDateState;->text:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/paymentsheet/ui/ExpiryDateState;->enabled:Z

    return v0
.end method

.method public final copy(Ljava/lang/String;ZLcom/stripe/android/uicore/elements/DateConfig;)Lcom/stripe/android/paymentsheet/ui/ExpiryDateState;
    .locals 1

    const-string v0, "text"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dateConfig"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/paymentsheet/ui/ExpiryDateState;

    invoke-direct {v0, p1, p2, p3}, Lcom/stripe/android/paymentsheet/ui/ExpiryDateState;-><init>(Ljava/lang/String;ZLcom/stripe/android/uicore/elements/DateConfig;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/stripe/android/paymentsheet/ui/ExpiryDateState;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/paymentsheet/ui/ExpiryDateState;

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/ui/ExpiryDateState;->text:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/paymentsheet/ui/ExpiryDateState;->text:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-boolean v1, p0, Lcom/stripe/android/paymentsheet/ui/ExpiryDateState;->enabled:Z

    iget-boolean v3, p1, Lcom/stripe/android/paymentsheet/ui/ExpiryDateState;->enabled:Z

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/stripe/android/paymentsheet/ui/ExpiryDateState;->dateConfig:Lcom/stripe/android/uicore/elements/DateConfig;

    iget-object p1, p1, Lcom/stripe/android/paymentsheet/ui/ExpiryDateState;->dateConfig:Lcom/stripe/android/uicore/elements/DateConfig;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getEnabled()Z
    .locals 1

    .line 17
    iget-boolean v0, p0, Lcom/stripe/android/paymentsheet/ui/ExpiryDateState;->enabled:Z

    return v0
.end method

.method public final getExpiryMonth()Ljava/lang/Integer;
    .locals 4

    .line 38
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/ExpiryDateState;->formFieldValues:Ljava/util/Map;

    if-eqz v0, :cond_0

    .line 39
    sget-object v1, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;

    invoke-virtual {v1}, Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;->getCardExpMonth()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v1

    const/4 v2, 0x1

    const/16 v3, 0xc

    .line 38
    invoke-direct {p0, v0, v1, v2, v3}, Lcom/stripe/android/paymentsheet/ui/ExpiryDateState;->toIntOrNull(Ljava/util/Map;Lcom/stripe/android/uicore/elements/IdentifierSpec;II)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final getExpiryYear()Ljava/lang/Integer;
    .locals 4

    .line 45
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/ExpiryDateState;->formFieldValues:Ljava/util/Map;

    if-eqz v0, :cond_0

    .line 46
    sget-object v1, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;

    invoke-virtual {v1}, Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;->getCardExpYear()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v1

    const/16 v2, 0x7d0

    const/16 v3, 0x834

    .line 45
    invoke-direct {p0, v0, v1, v2, v3}, Lcom/stripe/android/paymentsheet/ui/ExpiryDateState;->toIntOrNull(Ljava/util/Map;Lcom/stripe/android/uicore/elements/IdentifierSpec;II)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final getText()Ljava/lang/String;
    .locals 1

    .line 16
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/ExpiryDateState;->text:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/ExpiryDateState;->text:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/stripe/android/paymentsheet/ui/ExpiryDateState;->enabled:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/ui/ExpiryDateState;->dateConfig:Lcom/stripe/android/uicore/elements/DateConfig;

    invoke-virtual {v1}, Lcom/stripe/android/uicore/elements/DateConfig;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final onDateChanged(Ljava/lang/String;)Lcom/stripe/android/paymentsheet/ui/ExpiryDateState;
    .locals 7

    const-string v0, "proposedValue"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 69
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/ExpiryDateState;->textFieldState:Lcom/stripe/android/uicore/elements/TextFieldState;

    .line 70
    iget-object v1, p0, Lcom/stripe/android/paymentsheet/ui/ExpiryDateState;->text:Ljava/lang/String;

    .line 69
    invoke-static {v0, v1, p1}, Lcom/stripe/android/uicore/elements/TextFieldStateKt;->canAcceptInput(Lcom/stripe/android/uicore/elements/TextFieldState;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    return-object p0

    :cond_0
    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    .line 74
    invoke-static/range {v1 .. v6}, Lcom/stripe/android/paymentsheet/ui/ExpiryDateState;->copy$default(Lcom/stripe/android/paymentsheet/ui/ExpiryDateState;Ljava/lang/String;ZLcom/stripe/android/uicore/elements/DateConfig;ILjava/lang/Object;)Lcom/stripe/android/paymentsheet/ui/ExpiryDateState;

    move-result-object p1

    return-object p1
.end method

.method public final sectionError()Lcom/stripe/android/core/strings/ResolvableString;
    .locals 4

    .line 57
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/ExpiryDateState;->textFieldState:Lcom/stripe/android/uicore/elements/TextFieldState;

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Lcom/stripe/android/uicore/elements/TextFieldState;->shouldShowError(Z)Z

    move-result v0

    .line 58
    iget-object v1, p0, Lcom/stripe/android/paymentsheet/ui/ExpiryDateState;->textFieldState:Lcom/stripe/android/uicore/elements/TextFieldState;

    invoke-interface {v1}, Lcom/stripe/android/uicore/elements/TextFieldState;->getError()Lcom/stripe/android/uicore/elements/FieldError;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    if-eqz v0, :cond_0

    .line 59
    iget-boolean v0, p0, Lcom/stripe/android/paymentsheet/ui/ExpiryDateState;->enabled:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    move-object v1, v2

    :goto_0
    if-eqz v1, :cond_2

    .line 62
    invoke-virtual {v1}, Lcom/stripe/android/uicore/elements/FieldError;->getErrorMessage()I

    move-result v0

    .line 63
    invoke-virtual {v1}, Lcom/stripe/android/uicore/elements/FieldError;->getFormatArgs()[Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_1

    const/4 v1, 0x0

    .line 159
    new-array v1, v1, [Ljava/lang/Object;

    .line 63
    :cond_1
    array-length v3, v1

    invoke-static {v1, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v1

    const/4 v3, 0x4

    .line 61
    invoke-static {v0, v1, v2, v3, v2}, Lcom/stripe/android/core/strings/ResolvableStringUtilsKt;->resolvableString$default(I[Ljava/lang/Object;Ljava/util/List;ILjava/lang/Object;)Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object v0

    return-object v0

    :cond_2
    return-object v2
.end method

.method public final shouldShowError()Z
    .locals 2

    .line 52
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/ExpiryDateState;->textFieldState:Lcom/stripe/android/uicore/elements/TextFieldState;

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Lcom/stripe/android/uicore/elements/TextFieldState;->shouldShowError(Z)Z

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/ExpiryDateState;->text:Ljava/lang/String;

    iget-boolean v1, p0, Lcom/stripe/android/paymentsheet/ui/ExpiryDateState;->enabled:Z

    iget-object v2, p0, Lcom/stripe/android/paymentsheet/ui/ExpiryDateState;->dateConfig:Lcom/stripe/android/uicore/elements/DateConfig;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "ExpiryDateState(text="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v3, ", enabled="

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", dateConfig="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
