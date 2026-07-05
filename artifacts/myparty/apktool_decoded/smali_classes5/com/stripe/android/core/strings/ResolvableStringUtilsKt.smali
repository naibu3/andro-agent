.class public final Lcom/stripe/android/core/strings/ResolvableStringUtilsKt;
.super Ljava/lang/Object;
.source "ResolvableStringUtils.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nResolvableStringUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ResolvableStringUtils.kt\ncom/stripe/android/core/strings/ResolvableStringUtilsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,73:1\n1557#2:74\n1628#2,3:75\n37#3:78\n36#3,3:79\n*S KotlinDebug\n*F\n+ 1 ResolvableStringUtils.kt\ncom/stripe/android/core/strings/ResolvableStringUtilsKt\n*L\n12#1:74\n12#1:75,3\n17#1:78\n17#1:79,3\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0008\u001a-\u0010\u0000\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0006H\u0000\u00a2\u0006\u0002\u0010\u0007\u001aI\u0010\u0008\u001a\u00020\t2\u0008\u0008\u0001\u0010\n\u001a\u00020\u000b2 \u0010\u000c\u001a\u0011\u0012\r\u0008\u0001\u0012\t\u0018\u00010\u0002\u00a2\u0006\u0002\u0008\r0\u0001\"\t\u0018\u00010\u0002\u00a2\u0006\u0002\u0008\r2\u000e\u0008\u0002\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u0006H\u0007\u00a2\u0006\u0002\u0010\u0010\u001a7\u0010\u0008\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00122 \u0010\u000c\u001a\u0011\u0012\r\u0008\u0001\u0012\t\u0018\u00010\u0002\u00a2\u0006\u0002\u0008\r0\u0001\"\t\u0018\u00010\u0002\u00a2\u0006\u0002\u0008\rH\u0007\u00a2\u0006\u0002\u0010\u0013\u001a\u000e\u0010\u0017\u001a\u00020\t*\u0004\u0018\u00010\tH\u0007\u001a\u0015\u0010\u0018\u001a\u00020\t*\u00020\t2\u0006\u0010\u0019\u001a\u00020\tH\u0087\u0002\"\u0015\u0010\u0008\u001a\u00020\t*\u00020\u00128G\u00a2\u0006\u0006\u001a\u0004\u0008\u0014\u0010\u0015\"\u0015\u0010\u0008\u001a\u00020\t*\u00020\u000b8G\u00a2\u0006\u0006\u001a\u0004\u0008\u0014\u0010\u0016\u00a8\u0006\u001a"
    }
    d2 = {
        "resolveArgs",
        "",
        "",
        "context",
        "Landroid/content/Context;",
        "args",
        "",
        "(Landroid/content/Context;Ljava/util/List;)[Ljava/lang/Object;",
        "resolvableString",
        "Lcom/stripe/android/core/strings/ResolvableString;",
        "id",
        "",
        "formatArgs",
        "Lkotlinx/parcelize/RawValue;",
        "transformations",
        "Lcom/stripe/android/core/strings/transformations/TransformOperation;",
        "(I[Ljava/lang/Object;Ljava/util/List;)Lcom/stripe/android/core/strings/ResolvableString;",
        "value",
        "",
        "(Ljava/lang/String;[Ljava/lang/Object;)Lcom/stripe/android/core/strings/ResolvableString;",
        "getResolvableString",
        "(Ljava/lang/String;)Lcom/stripe/android/core/strings/ResolvableString;",
        "(I)Lcom/stripe/android/core/strings/ResolvableString;",
        "orEmpty",
        "plus",
        "other",
        "stripe-core_release"
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
.method public static final getResolvableString(I)Lcom/stripe/android/core/strings/ResolvableString;
    .locals 3

    .line 62
    new-instance v0, Lcom/stripe/android/core/strings/IdentifierResolvableString;

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v1

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v2

    invoke-direct {v0, p0, v1, v2}, Lcom/stripe/android/core/strings/IdentifierResolvableString;-><init>(ILjava/util/List;Ljava/util/List;)V

    check-cast v0, Lcom/stripe/android/core/strings/ResolvableString;

    return-object v0
.end method

.method public static final getResolvableString(Ljava/lang/String;)Lcom/stripe/android/core/strings/ResolvableString;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 55
    new-instance v0, Lcom/stripe/android/core/strings/StaticResolvableString;

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lcom/stripe/android/core/strings/StaticResolvableString;-><init>(Ljava/lang/String;Ljava/util/List;)V

    check-cast v0, Lcom/stripe/android/core/strings/ResolvableString;

    return-object v0
.end method

.method public static final orEmpty(Lcom/stripe/android/core/strings/ResolvableString;)Lcom/stripe/android/core/strings/ResolvableString;
    .locals 0

    if-nez p0, :cond_0

    .line 66
    const-string p0, ""

    invoke-static {p0}, Lcom/stripe/android/core/strings/ResolvableStringUtilsKt;->getResolvableString(Ljava/lang/String;)Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object p0

    :cond_0
    return-object p0
.end method

.method public static final plus(Lcom/stripe/android/core/strings/ResolvableString;Lcom/stripe/android/core/strings/ResolvableString;)Lcom/stripe/android/core/strings/ResolvableString;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "other"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 71
    new-instance v0, Lcom/stripe/android/core/strings/ConcatenatedResolvableString;

    invoke-direct {v0, p0, p1}, Lcom/stripe/android/core/strings/ConcatenatedResolvableString;-><init>(Lcom/stripe/android/core/strings/ResolvableString;Lcom/stripe/android/core/strings/ResolvableString;)V

    check-cast v0, Lcom/stripe/android/core/strings/ResolvableString;

    return-object v0
.end method

.method public static final resolvableString(I[Ljava/lang/Object;Ljava/util/List;)Lcom/stripe/android/core/strings/ResolvableString;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I[",
            "Ljava/lang/Object;",
            "Ljava/util/List<",
            "+",
            "Lcom/stripe/android/core/strings/transformations/TransformOperation;",
            ">;)",
            "Lcom/stripe/android/core/strings/ResolvableString;"
        }
    .end annotation

    const-string v0, "formatArgs"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "transformations"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    new-instance v0, Lcom/stripe/android/core/strings/IdentifierResolvableString;

    invoke-static {p1}, Lkotlin/collections/ArraysKt;->toList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-direct {v0, p0, p2, p1}, Lcom/stripe/android/core/strings/IdentifierResolvableString;-><init>(ILjava/util/List;Ljava/util/List;)V

    check-cast v0, Lcom/stripe/android/core/strings/ResolvableString;

    return-object v0
.end method

.method public static final varargs resolvableString(Ljava/lang/String;[Ljava/lang/Object;)Lcom/stripe/android/core/strings/ResolvableString;
    .locals 1

    const-string v0, "value"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "formatArgs"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 47
    new-instance v0, Lcom/stripe/android/core/strings/StaticResolvableString;

    invoke-static {p1}, Lkotlin/collections/ArraysKt;->toList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-direct {v0, p0, p1}, Lcom/stripe/android/core/strings/StaticResolvableString;-><init>(Ljava/lang/String;Ljava/util/List;)V

    check-cast v0, Lcom/stripe/android/core/strings/ResolvableString;

    return-object v0
.end method

.method public static synthetic resolvableString$default(I[Ljava/lang/Object;Ljava/util/List;ILjava/lang/Object;)Lcom/stripe/android/core/strings/ResolvableString;
    .locals 0

    and-int/lit8 p3, p3, 0x4

    if-eqz p3, :cond_0

    .line 32
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object p2

    .line 28
    :cond_0
    invoke-static {p0, p1, p2}, Lcom/stripe/android/core/strings/ResolvableStringUtilsKt;->resolvableString(I[Ljava/lang/Object;Ljava/util/List;)Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object p0

    return-object p0
.end method

.method public static final resolveArgs(Landroid/content/Context;Ljava/util/List;)[Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/List<",
            "+",
            "Ljava/lang/Object;",
            ">;)[",
            "Ljava/lang/Object;"
        }
    .end annotation

    const-string v0, "context"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "args"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    check-cast p1, Ljava/lang/Iterable;

    .line 74
    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p1, v1}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v0, Ljava/util/Collection;

    .line 75
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    .line 14
    instance-of v2, v1, Lcom/stripe/android/core/strings/ResolvableString;

    if-eqz v2, :cond_0

    check-cast v1, Lcom/stripe/android/core/strings/ResolvableString;

    invoke-interface {v1, p0}, Lcom/stripe/android/core/strings/ResolvableString;->resolve(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    .line 76
    :cond_0
    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 77
    :cond_1
    check-cast v0, Ljava/util/List;

    .line 74
    check-cast v0, Ljava/util/Collection;

    const/4 p0, 0x0

    .line 81
    new-array p0, p0, [Ljava/lang/Object;

    invoke-interface {v0, p0}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method
