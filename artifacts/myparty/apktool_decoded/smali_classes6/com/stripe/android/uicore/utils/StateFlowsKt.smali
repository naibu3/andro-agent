.class public final Lcom/stripe/android/uicore/utils/StateFlowsKt;
.super Ljava/lang/Object;
.source "StateFlows.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nStateFlows.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StateFlows.kt\ncom/stripe/android/uicore/utils/StateFlowsKt\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 5 Merge.kt\nkotlinx/coroutines/flow/FlowKt__MergeKt\n+ 6 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt\n+ 7 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,220:1\n49#2:221\n51#2:225\n46#3:222\n51#3:224\n105#4:223\n105#4:233\n105#4:240\n105#4:247\n189#5:226\n283#6:227\n284#6:232\n283#6:234\n284#6:239\n283#6:241\n284#6:246\n37#7:228\n36#7,3:229\n37#7:235\n36#7,3:236\n37#7:242\n36#7,3:243\n*S KotlinDebug\n*F\n+ 1 StateFlows.kt\ncom/stripe/android/uicore/utils/StateFlowsKt\n*L\n67#1:221\n67#1:225\n67#1:222\n67#1:224\n67#1:223\n154#1:233\n181#1:240\n207#1:247\n82#1:226\n154#1:227\n154#1:232\n181#1:234\n181#1:239\n207#1:241\n207#1:246\n154#1:228\n154#1:229,3\n181#1:235\n181#1:236,3\n207#1:242\n207#1:243,3\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0008\u0004\u001a8\u0010\u0000\u001a\u0008\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\u0008\u0000\u0010\u0003\"\u0004\u0008\u0001\u0010\u0002*\u0008\u0012\u0004\u0012\u0002H\u00030\u00012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u00020\u0005H\u0007\u001a>\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\u0008\u0000\u0010\u0003\"\u0004\u0008\u0001\u0010\u0002*\u0008\u0012\u0004\u0012\u0002H\u00030\u00012\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u0002H\u0003\u0012\n\u0012\u0008\u0012\u0004\u0012\u0002H\u00020\u00010\u0005H\u0007\u001aV\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\u0008\u0000\u0010\u0008\"\u0004\u0008\u0001\u0010\t\"\u0004\u0008\u0002\u0010\u00022\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u0002H\u00080\u00012\u000c\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u0002H\t0\u00012\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u0002H\u0008\u0012\u0004\u0012\u0002H\t\u0012\u0004\u0012\u0002H\u00020\u000cH\u0007\u001ap\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\u0008\u0000\u0010\u0008\"\u0004\u0008\u0001\u0010\t\"\u0004\u0008\u0002\u0010\r\"\u0004\u0008\u0003\u0010\u00022\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u0002H\u00080\u00012\u000c\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u0002H\t0\u00012\u000c\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u0002H\r0\u00012\u001e\u0010\u0004\u001a\u001a\u0012\u0004\u0012\u0002H\u0008\u0012\u0004\u0012\u0002H\t\u0012\u0004\u0012\u0002H\r\u0012\u0004\u0012\u0002H\u00020\u000fH\u0007\u001a\u008a\u0001\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\u0008\u0000\u0010\u0008\"\u0004\u0008\u0001\u0010\t\"\u0004\u0008\u0002\u0010\r\"\u0004\u0008\u0003\u0010\u0010\"\u0004\u0008\u0004\u0010\u00022\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u0002H\u00080\u00012\u000c\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u0002H\t0\u00012\u000c\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u0002H\r0\u00012\u000c\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u0002H\u00100\u00012$\u0010\u0004\u001a \u0012\u0004\u0012\u0002H\u0008\u0012\u0004\u0012\u0002H\t\u0012\u0004\u0012\u0002H\r\u0012\u0004\u0012\u0002H\u0010\u0012\u0004\u0012\u0002H\u00020\u0012H\u0007\u001a\u00a4\u0001\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\u0008\u0000\u0010\u0008\"\u0004\u0008\u0001\u0010\t\"\u0004\u0008\u0002\u0010\r\"\u0004\u0008\u0003\u0010\u0010\"\u0004\u0008\u0004\u0010\u0013\"\u0004\u0008\u0005\u0010\u00022\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u0002H\u00080\u00012\u000c\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u0002H\t0\u00012\u000c\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u0002H\r0\u00012\u000c\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u0002H\u00100\u00012\u000c\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u0002H\u00130\u00012*\u0010\u0004\u001a&\u0012\u0004\u0012\u0002H\u0008\u0012\u0004\u0012\u0002H\t\u0012\u0004\u0012\u0002H\r\u0012\u0004\u0012\u0002H\u0010\u0012\u0004\u0012\u0002H\u0013\u0012\u0004\u0012\u0002H\u00020\u0015H\u0007\u001a\u00be\u0001\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\u0008\u0000\u0010\u0008\"\u0004\u0008\u0001\u0010\t\"\u0004\u0008\u0002\u0010\r\"\u0004\u0008\u0003\u0010\u0010\"\u0004\u0008\u0004\u0010\u0013\"\u0004\u0008\u0005\u0010\u0016\"\u0004\u0008\u0006\u0010\u00022\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u0002H\u00080\u00012\u000c\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u0002H\t0\u00012\u000c\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u0002H\r0\u00012\u000c\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u0002H\u00100\u00012\u000c\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u0002H\u00130\u00012\u000c\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u0002H\u00160\u000120\u0010\u0004\u001a,\u0012\u0004\u0012\u0002H\u0008\u0012\u0004\u0012\u0002H\t\u0012\u0004\u0012\u0002H\r\u0012\u0004\u0012\u0002H\u0010\u0012\u0004\u0012\u0002H\u0013\u0012\u0004\u0012\u0002H\u0016\u0012\u0004\u0012\u0002H\u00020\u0018H\u0007\u001aP\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0006\u0008\u0000\u0010\u0003\u0018\u0001\"\u0004\u0008\u0001\u0010\u00022\u0012\u0010\u0019\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u0002H\u00030\u00010\u001a2\u001a\u0008\u0004\u0010\u0004\u001a\u0014\u0012\n\u0012\u0008\u0012\u0004\u0012\u0002H\u00030\u001a\u0012\u0004\u0012\u0002H\u00020\u0005H\u0087\u0008\u00f8\u0001\u0000\u001a!\u0010\u001b\u001a\u0008\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\u0008\u0000\u0010\u00032\u0006\u0010\u001c\u001a\u0002H\u0003H\u0007\u00a2\u0006\u0002\u0010\u001d\u0082\u0002\u0007\n\u0005\u0008\u009920\u0001\u00a8\u0006\u001e"
    }
    d2 = {
        "mapAsStateFlow",
        "Lkotlinx/coroutines/flow/StateFlow;",
        "R",
        "T",
        "transform",
        "Lkotlin/Function1;",
        "flatMapLatestAsStateFlow",
        "combineAsStateFlow",
        "T1",
        "T2",
        "flow1",
        "flow2",
        "Lkotlin/Function2;",
        "T3",
        "flow3",
        "Lkotlin/Function3;",
        "T4",
        "flow4",
        "Lkotlin/Function4;",
        "T5",
        "flow5",
        "Lkotlin/Function5;",
        "T6",
        "flow6",
        "Lkotlin/Function6;",
        "flows",
        "",
        "stateFlowOf",
        "value",
        "(Ljava/lang/Object;)Lkotlinx/coroutines/flow/StateFlow;",
        "stripe-ui-core_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static synthetic $r8$lambda$1QNCOfK_CaUhMxg4QdhfCMzY9gM(Lkotlin/jvm/functions/Function5;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;)Ljava/lang/Object;
    .locals 0

    invoke-static/range {p0 .. p5}, Lcom/stripe/android/uicore/utils/StateFlowsKt;->combineAsStateFlow$lambda$10(Lkotlin/jvm/functions/Function5;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$AbJ_hwBiCmmq2mE2RTJhiIwqSNA(Lkotlin/jvm/functions/Function2;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/stripe/android/uicore/utils/StateFlowsKt;->combineAsStateFlow$lambda$4(Lkotlin/jvm/functions/Function2;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$axoMOgbfCATBjRlpiGa6ubdIS9Y(Lkotlin/jvm/functions/Function1;Lkotlinx/coroutines/flow/StateFlow;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/uicore/utils/StateFlowsKt;->mapAsStateFlow$lambda$0(Lkotlin/jvm/functions/Function1;Lkotlinx/coroutines/flow/StateFlow;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$e_Wkn5qh4DhrOfxcajnp5MciJbQ(Lkotlin/jvm/functions/Function4;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lcom/stripe/android/uicore/utils/StateFlowsKt;->combineAsStateFlow$lambda$8(Lkotlin/jvm/functions/Function4;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$i61GDb2KRj49shfbgzM2GGUS94k(Lkotlin/jvm/functions/Function1;Lkotlinx/coroutines/flow/StateFlow;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/uicore/utils/StateFlowsKt;->flatMapLatestAsStateFlow$lambda$2(Lkotlin/jvm/functions/Function1;Lkotlinx/coroutines/flow/StateFlow;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$s7BEM7YA1XUzZaWKDj-UdUqgaUE(Lkotlin/jvm/functions/Function3;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/stripe/android/uicore/utils/StateFlowsKt;->combineAsStateFlow$lambda$6(Lkotlin/jvm/functions/Function3;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$wFepZT6NIQP2GmIWi7knoqRgy90(Lkotlin/jvm/functions/Function6;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;)Ljava/lang/Object;
    .locals 0

    invoke-static/range {p0 .. p6}, Lcom/stripe/android/uicore/utils/StateFlowsKt;->combineAsStateFlow$lambda$12(Lkotlin/jvm/functions/Function6;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$combineAsStateFlow$suspendConversion0$3(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/stripe/android/uicore/utils/StateFlowsKt;->combineAsStateFlow$suspendConversion0$3(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$combineAsStateFlow$suspendConversion0$5(Lkotlin/jvm/functions/Function3;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3, p4}, Lcom/stripe/android/uicore/utils/StateFlowsKt;->combineAsStateFlow$suspendConversion0$5(Lkotlin/jvm/functions/Function3;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$combineAsStateFlow$suspendConversion0$7(Lkotlin/jvm/functions/Function4;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p5}, Lcom/stripe/android/uicore/utils/StateFlowsKt;->combineAsStateFlow$suspendConversion0$7(Lkotlin/jvm/functions/Function4;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic combineAsStateFlow(Ljava/util/List;Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/flow/StateFlow;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            "R:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/List<",
            "+",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "+TT;>;>;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/util/List<",
            "+TT;>;+TR;>;)",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "TR;>;"
        }
    .end annotation

    const-string v0, "flows"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "transform"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 203
    new-instance v0, Lcom/stripe/android/uicore/utils/FlowToStateFlow;

    .line 204
    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 205
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v1

    invoke-interface {p1, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Lcom/stripe/android/uicore/utils/StateFlowsKt;->stateFlowOf(Ljava/lang/Object;)Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v1

    check-cast v1, Lkotlinx/coroutines/flow/Flow;

    goto :goto_0

    .line 241
    :cond_0
    move-object v1, p0

    check-cast v1, Ljava/lang/Iterable;

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->toList(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/util/Collection;

    const/4 v2, 0x0

    .line 245
    new-array v2, v2, [Lkotlinx/coroutines/flow/Flow;

    invoke-interface {v1, v2}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v1

    .line 241
    check-cast v1, [Lkotlinx/coroutines/flow/Flow;

    .line 247
    invoke-static {}, Lkotlin/jvm/internal/Intrinsics;->needClassReification()V

    new-instance v2, Lcom/stripe/android/uicore/utils/StateFlowsKt$combineAsStateFlow$$inlined$combine$1;

    invoke-direct {v2, v1, p1}, Lcom/stripe/android/uicore/utils/StateFlowsKt$combineAsStateFlow$$inlined$combine$1;-><init>([Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function1;)V

    move-object v1, v2

    check-cast v1, Lkotlinx/coroutines/flow/Flow;

    .line 211
    :goto_0
    invoke-static {}, Lkotlin/jvm/internal/Intrinsics;->needClassReification()V

    new-instance v2, Lcom/stripe/android/uicore/utils/StateFlowsKt$combineAsStateFlow$12;

    invoke-direct {v2, p1, p0}, Lcom/stripe/android/uicore/utils/StateFlowsKt$combineAsStateFlow$12;-><init>(Lkotlin/jvm/functions/Function1;Ljava/util/List;)V

    check-cast v2, Lkotlin/jvm/functions/Function0;

    .line 203
    invoke-direct {v0, v1, v2}, Lcom/stripe/android/uicore/utils/FlowToStateFlow;-><init>(Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function0;)V

    check-cast v0, Lkotlinx/coroutines/flow/StateFlow;

    return-object v0
.end method

.method public static final combineAsStateFlow(Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/flow/StateFlow;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T1:",
            "Ljava/lang/Object;",
            "T2:",
            "Ljava/lang/Object;",
            "R:",
            "Ljava/lang/Object;",
            ">(",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "+TT1;>;",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "+TT2;>;",
            "Lkotlin/jvm/functions/Function2<",
            "-TT1;-TT2;+TR;>;)",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "TR;>;"
        }
    .end annotation

    const-string v0, "flow1"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "flow2"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "transform"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 99
    new-instance v0, Lcom/stripe/android/uicore/utils/FlowToStateFlow;

    .line 100
    move-object v1, p0

    check-cast v1, Lkotlinx/coroutines/flow/Flow;

    move-object v2, p1

    check-cast v2, Lkotlinx/coroutines/flow/Flow;

    new-instance v3, Lcom/stripe/android/uicore/utils/StateFlowsKt$combineAsStateFlow$1;

    invoke-direct {v3, p2}, Lcom/stripe/android/uicore/utils/StateFlowsKt$combineAsStateFlow$1;-><init>(Ljava/lang/Object;)V

    check-cast v3, Lkotlin/jvm/functions/Function3;

    invoke-static {v1, v2, v3}, Lkotlinx/coroutines/flow/FlowKt;->combine(Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function3;)Lkotlinx/coroutines/flow/Flow;

    move-result-object v1

    .line 101
    new-instance v2, Lcom/stripe/android/uicore/utils/StateFlowsKt$$ExternalSyntheticLambda4;

    invoke-direct {v2, p2, p0, p1}, Lcom/stripe/android/uicore/utils/StateFlowsKt$$ExternalSyntheticLambda4;-><init>(Lkotlin/jvm/functions/Function2;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;)V

    .line 99
    invoke-direct {v0, v1, v2}, Lcom/stripe/android/uicore/utils/FlowToStateFlow;-><init>(Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function0;)V

    check-cast v0, Lkotlinx/coroutines/flow/StateFlow;

    return-object v0
.end method

.method public static final combineAsStateFlow(Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlin/jvm/functions/Function3;)Lkotlinx/coroutines/flow/StateFlow;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T1:",
            "Ljava/lang/Object;",
            "T2:",
            "Ljava/lang/Object;",
            "T3:",
            "Ljava/lang/Object;",
            "R:",
            "Ljava/lang/Object;",
            ">(",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "+TT1;>;",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "+TT2;>;",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "+TT3;>;",
            "Lkotlin/jvm/functions/Function3<",
            "-TT1;-TT2;-TT3;+TR;>;)",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "TR;>;"
        }
    .end annotation

    const-string v0, "flow1"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "flow2"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "flow3"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "transform"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 116
    new-instance v0, Lcom/stripe/android/uicore/utils/FlowToStateFlow;

    .line 117
    move-object v1, p0

    check-cast v1, Lkotlinx/coroutines/flow/Flow;

    move-object v2, p1

    check-cast v2, Lkotlinx/coroutines/flow/Flow;

    move-object v3, p2

    check-cast v3, Lkotlinx/coroutines/flow/Flow;

    new-instance v4, Lcom/stripe/android/uicore/utils/StateFlowsKt$combineAsStateFlow$3;

    invoke-direct {v4, p3}, Lcom/stripe/android/uicore/utils/StateFlowsKt$combineAsStateFlow$3;-><init>(Ljava/lang/Object;)V

    check-cast v4, Lkotlin/jvm/functions/Function4;

    invoke-static {v1, v2, v3, v4}, Lkotlinx/coroutines/flow/FlowKt;->combine(Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function4;)Lkotlinx/coroutines/flow/Flow;

    move-result-object v1

    .line 118
    new-instance v2, Lcom/stripe/android/uicore/utils/StateFlowsKt$$ExternalSyntheticLambda2;

    invoke-direct {v2, p3, p0, p1, p2}, Lcom/stripe/android/uicore/utils/StateFlowsKt$$ExternalSyntheticLambda2;-><init>(Lkotlin/jvm/functions/Function3;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;)V

    .line 116
    invoke-direct {v0, v1, v2}, Lcom/stripe/android/uicore/utils/FlowToStateFlow;-><init>(Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function0;)V

    check-cast v0, Lkotlinx/coroutines/flow/StateFlow;

    return-object v0
.end method

.method public static final combineAsStateFlow(Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlin/jvm/functions/Function4;)Lkotlinx/coroutines/flow/StateFlow;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T1:",
            "Ljava/lang/Object;",
            "T2:",
            "Ljava/lang/Object;",
            "T3:",
            "Ljava/lang/Object;",
            "T4:",
            "Ljava/lang/Object;",
            "R:",
            "Ljava/lang/Object;",
            ">(",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "+TT1;>;",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "+TT2;>;",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "+TT3;>;",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "+TT4;>;",
            "Lkotlin/jvm/functions/Function4<",
            "-TT1;-TT2;-TT3;-TT4;+TR;>;)",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "TR;>;"
        }
    .end annotation

    const-string v0, "flow1"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "flow2"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "flow3"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "flow4"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "transform"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 134
    new-instance v0, Lcom/stripe/android/uicore/utils/FlowToStateFlow;

    .line 135
    move-object v1, p0

    check-cast v1, Lkotlinx/coroutines/flow/Flow;

    move-object v2, p1

    check-cast v2, Lkotlinx/coroutines/flow/Flow;

    move-object v3, p2

    check-cast v3, Lkotlinx/coroutines/flow/Flow;

    move-object v4, p3

    check-cast v4, Lkotlinx/coroutines/flow/Flow;

    new-instance v5, Lcom/stripe/android/uicore/utils/StateFlowsKt$combineAsStateFlow$5;

    invoke-direct {v5, p4}, Lcom/stripe/android/uicore/utils/StateFlowsKt$combineAsStateFlow$5;-><init>(Ljava/lang/Object;)V

    check-cast v5, Lkotlin/jvm/functions/Function5;

    invoke-static {v1, v2, v3, v4, v5}, Lkotlinx/coroutines/flow/FlowKt;->combine(Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function5;)Lkotlinx/coroutines/flow/Flow;

    move-result-object v1

    .line 136
    new-instance v2, Lcom/stripe/android/uicore/utils/StateFlowsKt$$ExternalSyntheticLambda1;

    move-object v4, p0

    move-object v5, p1

    move-object v6, p2

    move-object v7, p3

    move-object v3, p4

    invoke-direct/range {v2 .. v7}, Lcom/stripe/android/uicore/utils/StateFlowsKt$$ExternalSyntheticLambda1;-><init>(Lkotlin/jvm/functions/Function4;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;)V

    .line 134
    invoke-direct {v0, v1, v2}, Lcom/stripe/android/uicore/utils/FlowToStateFlow;-><init>(Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function0;)V

    check-cast v0, Lkotlinx/coroutines/flow/StateFlow;

    return-object v0
.end method

.method public static final combineAsStateFlow(Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlin/jvm/functions/Function5;)Lkotlinx/coroutines/flow/StateFlow;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T1:",
            "Ljava/lang/Object;",
            "T2:",
            "Ljava/lang/Object;",
            "T3:",
            "Ljava/lang/Object;",
            "T4:",
            "Ljava/lang/Object;",
            "T5:",
            "Ljava/lang/Object;",
            "R:",
            "Ljava/lang/Object;",
            ">(",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "+TT1;>;",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "+TT2;>;",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "+TT3;>;",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "+TT4;>;",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "+TT5;>;",
            "Lkotlin/jvm/functions/Function5<",
            "-TT1;-TT2;-TT3;-TT4;-TT5;+TR;>;)",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "TR;>;"
        }
    .end annotation

    const-string v0, "flow1"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "flow2"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "flow3"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "flow4"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "flow5"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "transform"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 153
    new-instance v0, Lcom/stripe/android/uicore/utils/FlowToStateFlow;

    const/4 v1, 0x5

    .line 154
    new-array v1, v1, [Lkotlinx/coroutines/flow/StateFlow;

    const/4 v2, 0x0

    aput-object p0, v1, v2

    const/4 v3, 0x1

    aput-object p1, v1, v3

    const/4 v3, 0x2

    aput-object p2, v1, v3

    const/4 v3, 0x3

    aput-object p3, v1, v3

    const/4 v3, 0x4

    aput-object p4, v1, v3

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    .line 227
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->toList(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/util/Collection;

    .line 231
    new-array v2, v2, [Lkotlinx/coroutines/flow/Flow;

    invoke-interface {v1, v2}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v1

    .line 227
    check-cast v1, [Lkotlinx/coroutines/flow/Flow;

    .line 233
    new-instance v2, Lcom/stripe/android/uicore/utils/StateFlowsKt$combineAsStateFlow$$inlined$combine$2;

    invoke-direct {v2, v1, p5}, Lcom/stripe/android/uicore/utils/StateFlowsKt$combineAsStateFlow$$inlined$combine$2;-><init>([Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function5;)V

    check-cast v2, Lkotlinx/coroutines/flow/Flow;

    .line 162
    new-instance v3, Lcom/stripe/android/uicore/utils/StateFlowsKt$$ExternalSyntheticLambda0;

    move-object v5, p0

    move-object v6, p1

    move-object v7, p2

    move-object v8, p3

    move-object v9, p4

    move-object v4, p5

    invoke-direct/range {v3 .. v9}, Lcom/stripe/android/uicore/utils/StateFlowsKt$$ExternalSyntheticLambda0;-><init>(Lkotlin/jvm/functions/Function5;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;)V

    .line 153
    invoke-direct {v0, v2, v3}, Lcom/stripe/android/uicore/utils/FlowToStateFlow;-><init>(Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function0;)V

    check-cast v0, Lkotlinx/coroutines/flow/StateFlow;

    return-object v0
.end method

.method public static final combineAsStateFlow(Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlin/jvm/functions/Function6;)Lkotlinx/coroutines/flow/StateFlow;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T1:",
            "Ljava/lang/Object;",
            "T2:",
            "Ljava/lang/Object;",
            "T3:",
            "Ljava/lang/Object;",
            "T4:",
            "Ljava/lang/Object;",
            "T5:",
            "Ljava/lang/Object;",
            "T6:",
            "Ljava/lang/Object;",
            "R:",
            "Ljava/lang/Object;",
            ">(",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "+TT1;>;",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "+TT2;>;",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "+TT3;>;",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "+TT4;>;",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "+TT5;>;",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "+TT6;>;",
            "Lkotlin/jvm/functions/Function6<",
            "-TT1;-TT2;-TT3;-TT4;-TT5;-TT6;+TR;>;)",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "TR;>;"
        }
    .end annotation

    move-object/from16 v1, p6

    const-string v0, "flow1"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "flow2"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "flow3"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "flow4"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "flow5"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "flow6"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "transform"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 180
    new-instance v8, Lcom/stripe/android/uicore/utils/FlowToStateFlow;

    const/4 v0, 0x6

    .line 181
    new-array v0, v0, [Lkotlinx/coroutines/flow/StateFlow;

    const/4 v2, 0x0

    aput-object p0, v0, v2

    const/4 v3, 0x1

    aput-object p1, v0, v3

    const/4 v3, 0x2

    aput-object p2, v0, v3

    const/4 v3, 0x3

    aput-object p3, v0, v3

    const/4 v3, 0x4

    aput-object p4, v0, v3

    const/4 v3, 0x5

    aput-object p5, v0, v3

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    .line 234
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->toList(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    .line 238
    new-array v2, v2, [Lkotlinx/coroutines/flow/Flow;

    invoke-interface {v0, v2}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    .line 234
    check-cast v0, [Lkotlinx/coroutines/flow/Flow;

    .line 240
    new-instance v2, Lcom/stripe/android/uicore/utils/StateFlowsKt$combineAsStateFlow$$inlined$combine$3;

    invoke-direct {v2, v0, v1}, Lcom/stripe/android/uicore/utils/StateFlowsKt$combineAsStateFlow$$inlined$combine$3;-><init>([Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function6;)V

    move-object v9, v2

    check-cast v9, Lkotlinx/coroutines/flow/Flow;

    .line 190
    new-instance v0, Lcom/stripe/android/uicore/utils/StateFlowsKt$$ExternalSyntheticLambda3;

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    move-object v6, p4

    move-object v7, p5

    invoke-direct/range {v0 .. v7}, Lcom/stripe/android/uicore/utils/StateFlowsKt$$ExternalSyntheticLambda3;-><init>(Lkotlin/jvm/functions/Function6;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;)V

    .line 180
    invoke-direct {v8, v9, v0}, Lcom/stripe/android/uicore/utils/FlowToStateFlow;-><init>(Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function0;)V

    check-cast v8, Lkotlinx/coroutines/flow/StateFlow;

    return-object v8
.end method

.method private static final combineAsStateFlow$lambda$10(Lkotlin/jvm/functions/Function5;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;)Ljava/lang/Object;
    .locals 0

    .line 162
    invoke-interface {p1}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    move-result-object p1

    invoke-interface {p2}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    move-result-object p2

    invoke-interface {p3}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    move-result-object p3

    invoke-interface {p4}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    move-result-object p4

    invoke-interface {p5}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    move-result-object p5

    invoke-interface/range {p0 .. p5}, Lkotlin/jvm/functions/Function5;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private static final combineAsStateFlow$lambda$12(Lkotlin/jvm/functions/Function6;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;)Ljava/lang/Object;
    .locals 0

    .line 190
    invoke-interface {p1}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    move-result-object p1

    invoke-interface {p2}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    move-result-object p2

    invoke-interface {p3}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    move-result-object p3

    invoke-interface {p4}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    move-result-object p4

    invoke-interface {p5}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    move-result-object p5

    invoke-interface {p6}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    move-result-object p6

    invoke-interface/range {p0 .. p6}, Lkotlin/jvm/functions/Function6;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private static final combineAsStateFlow$lambda$4(Lkotlin/jvm/functions/Function2;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;)Ljava/lang/Object;
    .locals 0

    .line 101
    invoke-interface {p1}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    move-result-object p1

    invoke-interface {p2}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    move-result-object p2

    invoke-interface {p0, p1, p2}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private static final combineAsStateFlow$lambda$6(Lkotlin/jvm/functions/Function3;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;)Ljava/lang/Object;
    .locals 0

    .line 118
    invoke-interface {p1}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    move-result-object p1

    invoke-interface {p2}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    move-result-object p2

    invoke-interface {p3}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    move-result-object p3

    invoke-interface {p0, p1, p2, p3}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private static final combineAsStateFlow$lambda$8(Lkotlin/jvm/functions/Function4;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;)Ljava/lang/Object;
    .locals 0

    .line 136
    invoke-interface {p1}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    move-result-object p1

    invoke-interface {p2}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    move-result-object p2

    invoke-interface {p3}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    move-result-object p3

    invoke-interface {p4}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    move-result-object p4

    invoke-interface {p0, p1, p2, p3, p4}, Lkotlin/jvm/functions/Function4;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private static final synthetic combineAsStateFlow$suspendConversion0$3(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 100
    invoke-interface {p0, p1, p2}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private static final synthetic combineAsStateFlow$suspendConversion0$5(Lkotlin/jvm/functions/Function3;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 117
    invoke-interface {p0, p1, p2, p3}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private static final synthetic combineAsStateFlow$suspendConversion0$7(Lkotlin/jvm/functions/Function4;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 135
    invoke-interface {p0, p1, p2, p3, p4}, Lkotlin/jvm/functions/Function4;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final flatMapLatestAsStateFlow(Lkotlinx/coroutines/flow/StateFlow;Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/flow/StateFlow;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            "R:",
            "Ljava/lang/Object;",
            ">(",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "+TT;>;",
            "Lkotlin/jvm/functions/Function1<",
            "-TT;+",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "+TR;>;>;)",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "TR;>;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "transform"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 81
    new-instance v0, Lcom/stripe/android/uicore/utils/FlowToStateFlow;

    .line 82
    move-object v1, p0

    check-cast v1, Lkotlinx/coroutines/flow/Flow;

    .line 226
    new-instance v2, Lcom/stripe/android/uicore/utils/StateFlowsKt$flatMapLatestAsStateFlow$$inlined$flatMapLatest$1;

    const/4 v3, 0x0

    invoke-direct {v2, v3, p1}, Lcom/stripe/android/uicore/utils/StateFlowsKt$flatMapLatestAsStateFlow$$inlined$flatMapLatest$1;-><init>(Lkotlin/coroutines/Continuation;Lkotlin/jvm/functions/Function1;)V

    check-cast v2, Lkotlin/jvm/functions/Function3;

    invoke-static {v1, v2}, Lkotlinx/coroutines/flow/FlowKt;->transformLatest(Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function3;)Lkotlinx/coroutines/flow/Flow;

    move-result-object v1

    .line 83
    new-instance v2, Lcom/stripe/android/uicore/utils/StateFlowsKt$$ExternalSyntheticLambda5;

    invoke-direct {v2, p1, p0}, Lcom/stripe/android/uicore/utils/StateFlowsKt$$ExternalSyntheticLambda5;-><init>(Lkotlin/jvm/functions/Function1;Lkotlinx/coroutines/flow/StateFlow;)V

    .line 81
    invoke-direct {v0, v1, v2}, Lcom/stripe/android/uicore/utils/FlowToStateFlow;-><init>(Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function0;)V

    check-cast v0, Lkotlinx/coroutines/flow/StateFlow;

    return-object v0
.end method

.method private static final flatMapLatestAsStateFlow$lambda$2(Lkotlin/jvm/functions/Function1;Lkotlinx/coroutines/flow/StateFlow;)Ljava/lang/Object;
    .locals 0

    .line 84
    invoke-interface {p1}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lkotlinx/coroutines/flow/StateFlow;

    invoke-interface {p0}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final mapAsStateFlow(Lkotlinx/coroutines/flow/StateFlow;Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/flow/StateFlow;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            "R:",
            "Ljava/lang/Object;",
            ">(",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "+TT;>;",
            "Lkotlin/jvm/functions/Function1<",
            "-TT;+TR;>;)",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "TR;>;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "transform"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 66
    new-instance v0, Lcom/stripe/android/uicore/utils/FlowToStateFlow;

    .line 67
    move-object v1, p0

    check-cast v1, Lkotlinx/coroutines/flow/Flow;

    .line 223
    new-instance v2, Lcom/stripe/android/uicore/utils/StateFlowsKt$mapAsStateFlow$$inlined$map$1;

    invoke-direct {v2, v1, p1}, Lcom/stripe/android/uicore/utils/StateFlowsKt$mapAsStateFlow$$inlined$map$1;-><init>(Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function1;)V

    check-cast v2, Lkotlinx/coroutines/flow/Flow;

    .line 68
    new-instance v1, Lcom/stripe/android/uicore/utils/StateFlowsKt$$ExternalSyntheticLambda6;

    invoke-direct {v1, p1, p0}, Lcom/stripe/android/uicore/utils/StateFlowsKt$$ExternalSyntheticLambda6;-><init>(Lkotlin/jvm/functions/Function1;Lkotlinx/coroutines/flow/StateFlow;)V

    .line 66
    invoke-direct {v0, v2, v1}, Lcom/stripe/android/uicore/utils/FlowToStateFlow;-><init>(Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function0;)V

    check-cast v0, Lkotlinx/coroutines/flow/StateFlow;

    return-object v0
.end method

.method private static final mapAsStateFlow$lambda$0(Lkotlin/jvm/functions/Function1;Lkotlinx/coroutines/flow/StateFlow;)Ljava/lang/Object;
    .locals 0

    .line 68
    invoke-interface {p1}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final stateFlowOf(Ljava/lang/Object;)Lkotlinx/coroutines/flow/StateFlow;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;)",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "TT;>;"
        }
    .end annotation

    .line 219
    invoke-static {p0}, Lkotlinx/coroutines/flow/StateFlowKt;->MutableStateFlow(Ljava/lang/Object;)Lkotlinx/coroutines/flow/MutableStateFlow;

    move-result-object p0

    invoke-static {p0}, Lkotlinx/coroutines/flow/FlowKt;->asStateFlow(Lkotlinx/coroutines/flow/MutableStateFlow;)Lkotlinx/coroutines/flow/StateFlow;

    move-result-object p0

    return-object p0
.end method
