.class public final Lcom/stripe/android/financialconnections/ui/TextResource$DefaultImpls;
.super Ljava/lang/Object;
.source "TextResource.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/financialconnections/ui/TextResource;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "DefaultImpls"
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nTextResource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextResource.kt\ncom/stripe/android/financialconnections/ui/TextResource$DefaultImpls\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,72:1\n77#2:73\n1812#3,4:74\n*S KotlinDebug\n*F\n+ 1 TextResource.kt\ncom/stripe/android/financialconnections/ui/TextResource$DefaultImpls\n*L\n59#1:73\n58#1:74,4\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method private static buildText(Lcom/stripe/android/financialconnections/ui/TextResource;ILjava/util/List;Landroidx/compose/runtime/Composer;I)Ljava/lang/CharSequence;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/financialconnections/ui/TextResource;",
            "I",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Landroidx/compose/runtime/Composer;",
            "I)",
            "Ljava/lang/CharSequence;"
        }
    .end annotation

    const p0, -0x22aacc62

    invoke-interface {p3, p0}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "com.stripe.android.financialconnections.ui.TextResource.buildText (TextResource.kt:57)"

    .line 58
    invoke-static {p0, p4, v0, v1}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    :cond_0
    check-cast p2, Ljava/lang/Iterable;

    .line 59
    invoke-static {}, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->getLocalContext()Landroidx/compose/runtime/ProvidableCompositionLocal;

    move-result-object p0

    check-cast p0, Landroidx/compose/runtime/CompositionLocal;

    const p4, 0x789c5f52

    const-string v0, "CC:CompositionLocal.kt#9igjgp"

    .line 73
    invoke-static {p3, p4, v0}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {p3, p0}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {p3}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    check-cast p0, Landroid/content/Context;

    .line 59
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    invoke-virtual {p0, p1}, Landroid/content/res/Resources;->getText(I)Ljava/lang/CharSequence;

    move-result-object p0

    .line 76
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 p2, 0x0

    move p4, p2

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    add-int/lit8 v1, p4, 0x1

    if-gez p4, :cond_1

    invoke-static {}, Lkotlin/collections/CollectionsKt;->throwIndexOverflow()V

    :cond_1
    check-cast v0, Ljava/lang/String;

    const/4 p4, 0x1

    .line 61
    new-array v2, p4, [Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "%"

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "$s"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v2, p2

    new-array p4, p4, [Ljava/lang/String;

    aput-object v0, p4, p2

    check-cast p4, [Ljava/lang/CharSequence;

    invoke-static {p0, v2, p4}, Landroid/text/TextUtils;->replace(Ljava/lang/CharSequence;[Ljava/lang/String;[Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object p0

    const-string p4, "replace(...)"

    invoke-static {p0, p4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    move p4, v1

    goto :goto_0

    .line 58
    :cond_2
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_3
    invoke-interface {p3}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    return-object p0
.end method

.method public static toText(Lcom/stripe/android/financialconnections/ui/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/CharSequence;
    .locals 3

    const v0, 0x7abf1718

    invoke-interface {p1, v0}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "com.stripe.android.financialconnections.ui.TextResource.toText (TextResource.kt:38)"

    .line 39
    invoke-static {v0, p2, v1, v2}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 41
    :cond_0
    instance-of v0, p0, Lcom/stripe/android/financialconnections/ui/TextResource$Text;

    if-eqz v0, :cond_1

    const p2, -0x4a891aeb

    invoke-interface {p1, p2}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    check-cast p0, Lcom/stripe/android/financialconnections/ui/TextResource$Text;

    invoke-virtual {p0}, Lcom/stripe/android/financialconnections/ui/TextResource$Text;->getValue()Ljava/lang/CharSequence;

    move-result-object p0

    goto :goto_1

    .line 43
    :cond_1
    instance-of v0, p0, Lcom/stripe/android/financialconnections/ui/TextResource$StringId;

    if-eqz v0, :cond_2

    const v0, -0x4a8915e1

    invoke-interface {p1, v0}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    move-object v0, p0

    check-cast v0, Lcom/stripe/android/financialconnections/ui/TextResource$StringId;

    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/ui/TextResource$StringId;->getValue()I

    move-result v1

    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/ui/TextResource$StringId;->getArgs()Ljava/util/List;

    move-result-object v0

    shl-int/lit8 p2, p2, 0x6

    and-int/lit16 p2, p2, 0x380

    invoke-static {p0, v1, v0, p1, p2}, Lcom/stripe/android/financialconnections/ui/TextResource$DefaultImpls;->buildText(Lcom/stripe/android/financialconnections/ui/TextResource;ILjava/util/List;Landroidx/compose/runtime/Composer;I)Ljava/lang/CharSequence;

    move-result-object p0

    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    goto :goto_1

    .line 45
    :cond_2
    instance-of v0, p0, Lcom/stripe/android/financialconnections/ui/TextResource$PluralId;

    if-eqz v0, :cond_5

    const v0, -0x698eee7

    invoke-interface {p1, v0}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 47
    move-object v0, p0

    check-cast v0, Lcom/stripe/android/financialconnections/ui/TextResource$PluralId;

    .line 45
    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/ui/TextResource$PluralId;->getCount()I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_3

    const v1, -0x4a890ac1    # -9.199902E-7f

    .line 46
    invoke-interface {p1, v1}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/ui/TextResource$PluralId;->getSingular()I

    move-result v1

    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/ui/TextResource$PluralId;->getArgs()Ljava/util/List;

    move-result-object v0

    shl-int/lit8 p2, p2, 0x6

    and-int/lit16 p2, p2, 0x380

    invoke-static {p0, v1, v0, p1, p2}, Lcom/stripe/android/financialconnections/ui/TextResource$DefaultImpls;->buildText(Lcom/stripe/android/financialconnections/ui/TextResource;ILjava/util/List;Landroidx/compose/runtime/Composer;I)Ljava/lang/CharSequence;

    move-result-object p0

    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    goto :goto_0

    :cond_3
    const v1, -0x4a8904e1

    .line 47
    invoke-interface {p1, v1}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/ui/TextResource$PluralId;->getPlural()I

    move-result v1

    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/ui/TextResource$PluralId;->getArgs()Ljava/util/List;

    move-result-object v0

    shl-int/lit8 p2, p2, 0x6

    and-int/lit16 p2, p2, 0x380

    invoke-static {p0, v1, v0, p1, p2}, Lcom/stripe/android/financialconnections/ui/TextResource$DefaultImpls;->buildText(Lcom/stripe/android/financialconnections/ui/TextResource;ILjava/util/List;Landroidx/compose/runtime/Composer;I)Ljava/lang/CharSequence;

    move-result-object p0

    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 45
    :goto_0
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 40
    :goto_1
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result p2

    if-eqz p2, :cond_4

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_4
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    return-object p0

    :cond_5
    const p0, -0x4a891e94

    invoke-interface {p1, p0}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method
