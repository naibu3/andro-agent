.class public final Lcom/stripe/android/uicore/elements/OTPController;
.super Ljava/lang/Object;
.source "OTPController.kt"

# interfaces
.implements Lcom/stripe/android/uicore/elements/Controller;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/uicore/elements/OTPController$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nOTPController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OTPController.kt\ncom/stripe/android/uicore/elements/OTPController\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 StateFlows.kt\ncom/stripe/android/uicore/utils/StateFlowsKt\n+ 4 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt\n+ 5 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 6 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 7 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,77:1\n1557#2:78\n1628#2,3:79\n1863#2,2:95\n1863#2,2:97\n203#3,5:82\n211#3:94\n283#4:87\n284#4:92\n37#5:88\n36#5,3:89\n105#6:93\n434#7:99\n507#7,5:100\n*S KotlinDebug\n*F\n+ 1 OTPController.kt\ncom/stripe/android/uicore/elements/OTPController\n*L\n18#1:78\n18#1:79,3\n51#1:95,2\n68#1:97,2\n22#1:82,5\n22#1:94\n22#1:87\n22#1:92\n22#1:88\n22#1:89,3\n22#1:93\n71#1:99\n71#1:100,5\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u0000  2\u00020\u0001:\u0001 B\u0011\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0016\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\tJ\u000e\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\tJ\u0006\u0010\u001d\u001a\u00020\u001bJ\u0010\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\tH\u0002R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007R\u000e\u0010\u0008\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\u00020\u000bX\u0080\u0004\u00a2\u0006\n\n\u0002\u0010\r\u001a\u0004\u0008\u000c\u0010\u0007R \u0010\u000e\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\t0\u00100\u000fX\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\u0012R\u0017\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0014\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0015\u0010\u0016\u00a8\u0006!"
    }
    d2 = {
        "Lcom/stripe/android/uicore/elements/OTPController;",
        "Lcom/stripe/android/uicore/elements/Controller;",
        "otpLength",
        "",
        "<init>",
        "(I)V",
        "getOtpLength",
        "()I",
        "autofillAccumulator",
        "",
        "keyboardType",
        "Landroidx/compose/ui/text/input/KeyboardType;",
        "getKeyboardType-PjHm6EE$stripe_ui_core_release",
        "I",
        "fieldValues",
        "",
        "Lkotlinx/coroutines/flow/MutableStateFlow;",
        "getFieldValues$stripe_ui_core_release",
        "()Ljava/util/List;",
        "fieldValue",
        "Lkotlinx/coroutines/flow/StateFlow;",
        "getFieldValue",
        "()Lkotlinx/coroutines/flow/StateFlow;",
        "onValueChanged",
        "index",
        "text",
        "onAutofillDigit",
        "",
        "digit",
        "reset",
        "filter",
        "userTyped",
        "Companion",
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

.field private static final Companion:Lcom/stripe/android/uicore/elements/OTPController$Companion;

.field private static final VALID_INPUT_RANGES:Lkotlin/ranges/CharRange;


# instance fields
.field private autofillAccumulator:Ljava/lang/String;

.field private final fieldValue:Lkotlinx/coroutines/flow/StateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final fieldValues:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lkotlinx/coroutines/flow/MutableStateFlow<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation
.end field

.field private final keyboardType:I

.field private final otpLength:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/stripe/android/uicore/elements/OTPController$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/uicore/elements/OTPController$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/uicore/elements/OTPController;->Companion:Lcom/stripe/android/uicore/elements/OTPController$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/stripe/android/uicore/elements/OTPController;->$stable:I

    .line 74
    new-instance v0, Lkotlin/ranges/CharRange;

    const/16 v1, 0x30

    const/16 v2, 0x39

    invoke-direct {v0, v1, v2}, Lkotlin/ranges/CharRange;-><init>(CC)V

    sput-object v0, Lcom/stripe/android/uicore/elements/OTPController;->VALID_INPUT_RANGES:Lkotlin/ranges/CharRange;

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    const/4 v0, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {p0, v2, v0, v1}, Lcom/stripe/android/uicore/elements/OTPController;-><init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 12

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/stripe/android/uicore/elements/OTPController;->otpLength:I

    .line 14
    const-string v0, ""

    iput-object v0, p0, Lcom/stripe/android/uicore/elements/OTPController;->autofillAccumulator:Ljava/lang/String;

    .line 16
    sget-object v1, Landroidx/compose/ui/text/input/KeyboardType;->Companion:Landroidx/compose/ui/text/input/KeyboardType$Companion;

    invoke-virtual {v1}, Landroidx/compose/ui/text/input/KeyboardType$Companion;->getNumberPassword-PjHm6EE()I

    move-result v1

    iput v1, p0, Lcom/stripe/android/uicore/elements/OTPController;->keyboardType:I

    const/4 v1, 0x0

    .line 18
    invoke-static {v1, p1}, Lkotlin/ranges/RangesKt;->until(II)Lkotlin/ranges/IntRange;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    .line 78
    new-instance v2, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {p1, v3}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v2, Ljava/util/Collection;

    .line 79
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    move-object v3, p1

    check-cast v3, Lkotlin/collections/IntIterator;

    invoke-virtual {v3}, Lkotlin/collections/IntIterator;->nextInt()I

    .line 19
    invoke-static {v0}, Lkotlinx/coroutines/flow/StateFlowKt;->MutableStateFlow(Ljava/lang/Object;)Lkotlinx/coroutines/flow/MutableStateFlow;

    move-result-object v3

    .line 80
    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 81
    :cond_0
    check-cast v2, Ljava/util/List;

    .line 18
    iput-object v2, p0, Lcom/stripe/android/uicore/elements/OTPController;->fieldValues:Ljava/util/List;

    .line 83
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_1

    .line 84
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object p1

    .line 23
    move-object v3, p1

    check-cast v3, Ljava/lang/Iterable;

    move-object v4, v0

    check-cast v4, Ljava/lang/CharSequence;

    const/16 v10, 0x3e

    const/4 v11, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-static/range {v3 .. v11}, Lkotlin/collections/CollectionsKt;->joinToString$default(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    .line 84
    invoke-static {p1}, Lcom/stripe/android/uicore/utils/StateFlowsKt;->stateFlowOf(Ljava/lang/Object;)Lkotlinx/coroutines/flow/StateFlow;

    move-result-object p1

    check-cast p1, Lkotlinx/coroutines/flow/Flow;

    goto :goto_1

    .line 87
    :cond_1
    move-object p1, v2

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->toList(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    .line 91
    new-array v0, v1, [Lkotlinx/coroutines/flow/Flow;

    invoke-interface {p1, v0}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    .line 87
    check-cast p1, [Lkotlinx/coroutines/flow/Flow;

    .line 93
    new-instance v0, Lcom/stripe/android/uicore/elements/OTPController$special$$inlined$combineAsStateFlow$1;

    invoke-direct {v0, p1}, Lcom/stripe/android/uicore/elements/OTPController$special$$inlined$combineAsStateFlow$1;-><init>([Lkotlinx/coroutines/flow/Flow;)V

    move-object p1, v0

    check-cast p1, Lkotlinx/coroutines/flow/Flow;

    .line 94
    :goto_1
    new-instance v0, Lcom/stripe/android/uicore/elements/OTPController$special$$inlined$combineAsStateFlow$2;

    invoke-direct {v0, v2}, Lcom/stripe/android/uicore/elements/OTPController$special$$inlined$combineAsStateFlow$2;-><init>(Ljava/util/List;)V

    check-cast v0, Lkotlin/jvm/functions/Function0;

    .line 82
    new-instance v1, Lcom/stripe/android/uicore/utils/FlowToStateFlow;

    invoke-direct {v1, p1, v0}, Lcom/stripe/android/uicore/utils/FlowToStateFlow;-><init>(Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function0;)V

    check-cast v1, Lkotlinx/coroutines/flow/StateFlow;

    .line 22
    iput-object v1, p0, Lcom/stripe/android/uicore/elements/OTPController;->fieldValue:Lkotlinx/coroutines/flow/StateFlow;

    return-void
.end method

.method public synthetic constructor <init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x6

    .line 10
    :cond_0
    invoke-direct {p0, p1}, Lcom/stripe/android/uicore/elements/OTPController;-><init>(I)V

    return-void
.end method

.method public static final synthetic access$getVALID_INPUT_RANGES$cp()Lkotlin/ranges/CharRange;
    .locals 1

    .line 9
    sget-object v0, Lcom/stripe/android/uicore/elements/OTPController;->VALID_INPUT_RANGES:Lkotlin/ranges/CharRange;

    return-object v0
.end method

.method private final filter(Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    .line 99
    check-cast p1, Ljava/lang/CharSequence;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    check-cast v0, Ljava/lang/Appendable;

    .line 100
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    .line 101
    invoke-interface {p1, v2}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v3

    .line 71
    sget-object v4, Lcom/stripe/android/uicore/elements/OTPController;->VALID_INPUT_RANGES:Lkotlin/ranges/CharRange;

    invoke-virtual {v4, v3}, Lkotlin/ranges/CharRange;->contains(C)Z

    move-result v4

    if-eqz v4, :cond_0

    .line 102
    invoke-interface {v0, v3}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 104
    :cond_1
    check-cast v0, Ljava/lang/StringBuilder;

    .line 99
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public final getFieldValue()Lkotlinx/coroutines/flow/StateFlow;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 22
    iget-object v0, p0, Lcom/stripe/android/uicore/elements/OTPController;->fieldValue:Lkotlinx/coroutines/flow/StateFlow;

    return-object v0
.end method

.method public final getFieldValues$stripe_ui_core_release()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lkotlinx/coroutines/flow/MutableStateFlow<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation

    .line 18
    iget-object v0, p0, Lcom/stripe/android/uicore/elements/OTPController;->fieldValues:Ljava/util/List;

    return-object v0
.end method

.method public final getKeyboardType-PjHm6EE$stripe_ui_core_release()I
    .locals 1

    .line 16
    iget v0, p0, Lcom/stripe/android/uicore/elements/OTPController;->keyboardType:I

    return v0
.end method

.method public final getOtpLength()I
    .locals 1

    .line 10
    iget v0, p0, Lcom/stripe/android/uicore/elements/OTPController;->otpLength:I

    return v0
.end method

.method public final onAutofillDigit(Ljava/lang/String;)V
    .locals 2

    const-string v0, "digit"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 59
    iget-object v0, p0, Lcom/stripe/android/uicore/elements/OTPController;->autofillAccumulator:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/uicore/elements/OTPController;->autofillAccumulator:Ljava/lang/String;

    .line 61
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    iget v0, p0, Lcom/stripe/android/uicore/elements/OTPController;->otpLength:I

    if-ne p1, v0, :cond_0

    const/4 p1, 0x0

    .line 62
    iget-object v0, p0, Lcom/stripe/android/uicore/elements/OTPController;->autofillAccumulator:Ljava/lang/String;

    invoke-virtual {p0, p1, v0}, Lcom/stripe/android/uicore/elements/OTPController;->onValueChanged(ILjava/lang/String;)I

    .line 63
    const-string p1, ""

    iput-object p1, p0, Lcom/stripe/android/uicore/elements/OTPController;->autofillAccumulator:Ljava/lang/String;

    :cond_0
    return-void
.end method

.method public final onValueChanged(ILjava/lang/String;)I
    .locals 5

    const-string v0, "text"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 35
    iget-object v0, p0, Lcom/stripe/android/uicore/elements/OTPController;->fieldValues:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkotlinx/coroutines/flow/MutableStateFlow;

    invoke-interface {v0}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    move-result-object v0

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x1

    return p1

    .line 39
    :cond_0
    move-object v0, p2

    check-cast v0, Ljava/lang/CharSequence;

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_1

    .line 40
    iget-object p2, p0, Lcom/stripe/android/uicore/elements/OTPController;->fieldValues:Ljava/util/List;

    invoke-interface {p2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lkotlinx/coroutines/flow/MutableStateFlow;

    const-string p2, ""

    invoke-interface {p1, p2}, Lkotlinx/coroutines/flow/MutableStateFlow;->setValue(Ljava/lang/Object;)V

    return v1

    .line 44
    :cond_1
    invoke-direct {p0, p2}, Lcom/stripe/android/uicore/elements/OTPController;->filter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 48
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v0

    iget v2, p0, Lcom/stripe/android/uicore/elements/OTPController;->otpLength:I

    if-ne v0, v2, :cond_2

    move p1, v1

    .line 49
    :cond_2
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v0

    invoke-static {v2, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    .line 51
    invoke-static {v1, v0}, Lkotlin/ranges/RangesKt;->until(II)Lkotlin/ranges/IntRange;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    .line 95
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    move-object v2, v1

    check-cast v2, Lkotlin/collections/IntIterator;

    invoke-virtual {v2}, Lkotlin/collections/IntIterator;->nextInt()I

    move-result v2

    .line 52
    iget-object v3, p0, Lcom/stripe/android/uicore/elements/OTPController;->fieldValues:Ljava/util/List;

    add-int v4, p1, v2

    invoke-interface {v3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lkotlinx/coroutines/flow/MutableStateFlow;

    invoke-virtual {p2, v2}, Ljava/lang/String;->charAt(I)C

    move-result v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v3, v2}, Lkotlinx/coroutines/flow/MutableStateFlow;->setValue(Ljava/lang/Object;)V

    goto :goto_0

    :cond_3
    return v0
.end method

.method public final reset()V
    .locals 3

    .line 68
    iget-object v0, p0, Lcom/stripe/android/uicore/elements/OTPController;->fieldValues:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    .line 97
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 68
    const-string v2, ""

    invoke-interface {v1, v2}, Lkotlinx/coroutines/flow/MutableStateFlow;->setValue(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    return-void
.end method
