.class public final Lcom/stripe/android/common/ui/InlineContentTemplateBuilder;
.super Ljava/lang/Object;
.source "InlineContentTemplateBuilder.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010$\n\u0000\u0008\u0001\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003JB\u0010\u0008\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000c\u001a\u00020\u000b2\u0008\u0008\u0002\u0010\r\u001a\u00020\u000e2\u0011\u0010\u000f\u001a\r\u0012\u0004\u0012\u00020\u00110\u0010\u00a2\u0006\u0002\u0008\u0012\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\'\u0010\u0015\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000b2\u0008\u0008\u0002\u0010\r\u001a\u00020\u000e\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0019R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"
    }
    d2 = {
        "Lcom/stripe/android/common/ui/InlineContentTemplateBuilder;",
        "",
        "<init>",
        "()V",
        "inlineContent",
        "",
        "",
        "Landroidx/compose/foundation/text/InlineTextContent;",
        "add",
        "id",
        "width",
        "Landroidx/compose/ui/unit/TextUnit;",
        "height",
        "align",
        "Landroidx/compose/ui/text/PlaceholderVerticalAlign;",
        "content",
        "Lkotlin/Function0;",
        "",
        "Landroidx/compose/runtime/Composable;",
        "add-QI4CevY",
        "(Ljava/lang/String;JJILkotlin/jvm/functions/Function2;)Lcom/stripe/android/common/ui/InlineContentTemplateBuilder;",
        "addSpacer",
        "addSpacer-nttgDAE",
        "(Ljava/lang/String;JI)Lcom/stripe/android/common/ui/InlineContentTemplateBuilder;",
        "build",
        "",
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
.field public static final $stable:I = 0x8


# instance fields
.field private final inlineContent:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Landroidx/compose/foundation/text/InlineTextContent;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    check-cast v0, Ljava/util/Map;

    iput-object v0, p0, Lcom/stripe/android/common/ui/InlineContentTemplateBuilder;->inlineContent:Ljava/util/Map;

    return-void
.end method

.method public static synthetic add-QI4CevY$default(Lcom/stripe/android/common/ui/InlineContentTemplateBuilder;Ljava/lang/String;JJILkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lcom/stripe/android/common/ui/InlineContentTemplateBuilder;
    .locals 8

    and-int/lit8 v0, p8, 0x8

    if-eqz v0, :cond_0

    .line 22
    sget-object p6, Landroidx/compose/ui/text/PlaceholderVerticalAlign;->Companion:Landroidx/compose/ui/text/PlaceholderVerticalAlign$Companion;

    invoke-virtual {p6}, Landroidx/compose/ui/text/PlaceholderVerticalAlign$Companion;->getCenter-J6kI3mc()I

    move-result p6

    :cond_0
    move-object v0, p0

    move-object v1, p1

    move-wide v2, p2

    move-wide v4, p4

    move v6, p6

    move-object v7, p7

    .line 18
    invoke-virtual/range {v0 .. v7}, Lcom/stripe/android/common/ui/InlineContentTemplateBuilder;->add-QI4CevY(Ljava/lang/String;JJILkotlin/jvm/functions/Function2;)Lcom/stripe/android/common/ui/InlineContentTemplateBuilder;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic addSpacer-nttgDAE$default(Lcom/stripe/android/common/ui/InlineContentTemplateBuilder;Ljava/lang/String;JIILjava/lang/Object;)Lcom/stripe/android/common/ui/InlineContentTemplateBuilder;
    .locals 0

    and-int/lit8 p5, p5, 0x4

    if-eqz p5, :cond_0

    .line 41
    sget-object p4, Landroidx/compose/ui/text/PlaceholderVerticalAlign;->Companion:Landroidx/compose/ui/text/PlaceholderVerticalAlign$Companion;

    invoke-virtual {p4}, Landroidx/compose/ui/text/PlaceholderVerticalAlign$Companion;->getCenter-J6kI3mc()I

    move-result p4

    .line 38
    :cond_0
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/stripe/android/common/ui/InlineContentTemplateBuilder;->addSpacer-nttgDAE(Ljava/lang/String;JI)Lcom/stripe/android/common/ui/InlineContentTemplateBuilder;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final add-QI4CevY(Ljava/lang/String;JJILkotlin/jvm/functions/Function2;)Lcom/stripe/android/common/ui/InlineContentTemplateBuilder;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "JJI",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;)",
            "Lcom/stripe/android/common/ui/InlineContentTemplateBuilder;"
        }
    .end annotation

    move-object/from16 v0, p7

    const-string v1, "id"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "content"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    iget-object v1, p0, Lcom/stripe/android/common/ui/InlineContentTemplateBuilder;->inlineContent:Ljava/util/Map;

    new-instance v2, Landroidx/compose/foundation/text/InlineTextContent;

    .line 26
    new-instance v3, Landroidx/compose/ui/text/Placeholder;

    const/4 v9, 0x0

    move-wide v4, p2

    move-wide v6, p4

    move/from16 v8, p6

    invoke-direct/range {v3 .. v9}, Landroidx/compose/ui/text/Placeholder;-><init>(JJILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 31
    new-instance p2, Lcom/stripe/android/common/ui/InlineContentTemplateBuilder$add$1;

    invoke-direct {p2, v0}, Lcom/stripe/android/common/ui/InlineContentTemplateBuilder$add$1;-><init>(Lkotlin/jvm/functions/Function2;)V

    const p3, -0x35f71b98    # -2242842.0f

    const/4 p4, 0x1

    invoke-static {p3, p4, p2}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambdaInstance(IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object p2

    check-cast p2, Lkotlin/jvm/functions/Function3;

    .line 25
    invoke-direct {v2, v3, p2}, Landroidx/compose/foundation/text/InlineTextContent;-><init>(Landroidx/compose/ui/text/Placeholder;Lkotlin/jvm/functions/Function3;)V

    invoke-interface {v1, p1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object p0
.end method

.method public final addSpacer-nttgDAE(Ljava/lang/String;JI)Lcom/stripe/android/common/ui/InlineContentTemplateBuilder;
    .locals 9

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 46
    invoke-static {v0}, Landroidx/compose/ui/unit/TextUnitKt;->getEm(I)J

    move-result-wide v5

    .line 47
    sget-object v0, Lcom/stripe/android/common/ui/ComposableSingletons$InlineContentTemplateBuilderKt;->INSTANCE:Lcom/stripe/android/common/ui/ComposableSingletons$InlineContentTemplateBuilderKt;

    invoke-virtual {v0}, Lcom/stripe/android/common/ui/ComposableSingletons$InlineContentTemplateBuilderKt;->getLambda-1$paymentsheet_release()Lkotlin/jvm/functions/Function2;

    move-result-object v8

    move-object v1, p0

    move-object v2, p1

    move-wide v3, p2

    move v7, p4

    .line 43
    invoke-virtual/range {v1 .. v8}, Lcom/stripe/android/common/ui/InlineContentTemplateBuilder;->add-QI4CevY(Ljava/lang/String;JJILkotlin/jvm/functions/Function2;)Lcom/stripe/android/common/ui/InlineContentTemplateBuilder;

    return-object v1
.end method

.method public final build()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Landroidx/compose/foundation/text/InlineTextContent;",
            ">;"
        }
    .end annotation

    .line 55
    iget-object v0, p0, Lcom/stripe/android/common/ui/InlineContentTemplateBuilder;->inlineContent:Ljava/util/Map;

    return-object v0
.end method
