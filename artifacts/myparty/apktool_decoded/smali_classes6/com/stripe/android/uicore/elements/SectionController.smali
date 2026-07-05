.class public final Lcom/stripe/android/uicore/elements/SectionController;
.super Ljava/lang/Object;
.source "SectionController.kt"

# interfaces
.implements Lcom/stripe/android/uicore/elements/Controller;


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nSectionController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SectionController.kt\ncom/stripe/android/uicore/elements/SectionController\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 StateFlows.kt\ncom/stripe/android/uicore/utils/StateFlowsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt\n+ 6 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 7 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,24:1\n1557#2:25\n1628#2,3:26\n203#3,3:29\n207#3:33\n211#3:41\n1#4:32\n283#5:34\n284#5:39\n37#6:35\n36#6,3:36\n105#7:40\n*S KotlinDebug\n*F\n+ 1 SectionController.kt\ncom/stripe/android/uicore/elements/SectionController\n*L\n17#1:25\n17#1:26,3\n16#1:29,3\n16#1:33\n16#1:41\n16#1:34\n16#1:39\n16#1:35\n16#1:36,3\n16#1:40\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0004\u0008\u0007\u0010\u0008R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\nR\u0019\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u000c\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u0010"
    }
    d2 = {
        "Lcom/stripe/android/uicore/elements/SectionController;",
        "Lcom/stripe/android/uicore/elements/Controller;",
        "label",
        "Lcom/stripe/android/core/strings/ResolvableString;",
        "sectionFieldErrorControllers",
        "",
        "Lcom/stripe/android/uicore/elements/SectionFieldErrorController;",
        "<init>",
        "(Lcom/stripe/android/core/strings/ResolvableString;Ljava/util/List;)V",
        "getLabel",
        "()Lcom/stripe/android/core/strings/ResolvableString;",
        "error",
        "Lkotlinx/coroutines/flow/StateFlow;",
        "Lcom/stripe/android/uicore/elements/FieldError;",
        "getError",
        "()Lkotlinx/coroutines/flow/StateFlow;",
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
.field private final error:Lkotlinx/coroutines/flow/StateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Lcom/stripe/android/uicore/elements/FieldError;",
            ">;"
        }
    .end annotation
.end field

.field private final label:Lcom/stripe/android/core/strings/ResolvableString;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/core/strings/ResolvableString;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/core/strings/ResolvableString;",
            "Ljava/util/List<",
            "+",
            "Lcom/stripe/android/uicore/elements/SectionFieldErrorController;",
            ">;)V"
        }
    .end annotation

    const-string v0, "sectionFieldErrorControllers"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    iput-object p1, p0, Lcom/stripe/android/uicore/elements/SectionController;->label:Lcom/stripe/android/core/strings/ResolvableString;

    .line 17
    check-cast p2, Ljava/lang/Iterable;

    .line 25
    new-instance p1, Ljava/util/ArrayList;

    const/16 v0, 0xa

    invoke-static {p2, v0}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v0

    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(I)V

    check-cast p1, Ljava/util/Collection;

    .line 26
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    .line 27
    check-cast v0, Lcom/stripe/android/uicore/elements/SectionFieldErrorController;

    .line 18
    invoke-interface {v0}, Lcom/stripe/android/uicore/elements/SectionFieldErrorController;->getError()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v0

    .line 27
    invoke-interface {p1, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 28
    :cond_0
    check-cast p1, Ljava/util/List;

    .line 30
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result p2

    if-eqz p2, :cond_3

    .line 31
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object p2

    .line 21
    check-cast p2, Ljava/lang/Iterable;

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/uicore/elements/FieldError;

    if-eqz v0, :cond_1

    goto :goto_1

    :cond_2
    const/4 v0, 0x0

    .line 31
    :goto_1
    invoke-static {v0}, Lcom/stripe/android/uicore/utils/StateFlowsKt;->stateFlowOf(Ljava/lang/Object;)Lkotlinx/coroutines/flow/StateFlow;

    move-result-object p2

    check-cast p2, Lkotlinx/coroutines/flow/Flow;

    goto :goto_2

    .line 34
    :cond_3
    move-object p2, p1

    check-cast p2, Ljava/lang/Iterable;

    invoke-static {p2}, Lkotlin/collections/CollectionsKt;->toList(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p2

    check-cast p2, Ljava/util/Collection;

    const/4 v0, 0x0

    .line 38
    new-array v0, v0, [Lkotlinx/coroutines/flow/Flow;

    invoke-interface {p2, v0}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p2

    .line 34
    check-cast p2, [Lkotlinx/coroutines/flow/Flow;

    .line 40
    new-instance v0, Lcom/stripe/android/uicore/elements/SectionController$special$$inlined$combineAsStateFlow$1;

    invoke-direct {v0, p2}, Lcom/stripe/android/uicore/elements/SectionController$special$$inlined$combineAsStateFlow$1;-><init>([Lkotlinx/coroutines/flow/Flow;)V

    move-object p2, v0

    check-cast p2, Lkotlinx/coroutines/flow/Flow;

    .line 41
    :goto_2
    new-instance v0, Lcom/stripe/android/uicore/elements/SectionController$special$$inlined$combineAsStateFlow$2;

    invoke-direct {v0, p1}, Lcom/stripe/android/uicore/elements/SectionController$special$$inlined$combineAsStateFlow$2;-><init>(Ljava/util/List;)V

    check-cast v0, Lkotlin/jvm/functions/Function0;

    .line 29
    new-instance p1, Lcom/stripe/android/uicore/utils/FlowToStateFlow;

    invoke-direct {p1, p2, v0}, Lcom/stripe/android/uicore/utils/FlowToStateFlow;-><init>(Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function0;)V

    check-cast p1, Lkotlinx/coroutines/flow/StateFlow;

    .line 16
    iput-object p1, p0, Lcom/stripe/android/uicore/elements/SectionController;->error:Lkotlinx/coroutines/flow/StateFlow;

    return-void
.end method


# virtual methods
.method public final getError()Lkotlinx/coroutines/flow/StateFlow;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Lcom/stripe/android/uicore/elements/FieldError;",
            ">;"
        }
    .end annotation

    .line 16
    iget-object v0, p0, Lcom/stripe/android/uicore/elements/SectionController;->error:Lkotlinx/coroutines/flow/StateFlow;

    return-object v0
.end method

.method public final getLabel()Lcom/stripe/android/core/strings/ResolvableString;
    .locals 1

    .line 13
    iget-object v0, p0, Lcom/stripe/android/uicore/elements/SectionController;->label:Lcom/stripe/android/core/strings/ResolvableString;

    return-object v0
.end method
