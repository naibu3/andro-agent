.class final Lcom/stripe/android/financialconnections/features/common/ModalBottomSheetContentKt$LegalDetailsBottomSheetContent$1;
.super Ljava/lang/Object;
.source "ModalBottomSheetContent.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/financialconnections/features/common/ModalBottomSheetContentKt;->LegalDetailsBottomSheetContent(Lcom/stripe/android/financialconnections/model/LegalDetailsNotice;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlin/jvm/functions/Function3<",
        "Landroidx/compose/foundation/layout/ColumnScope;",
        "Landroidx/compose/runtime/Composer;",
        "Ljava/lang/Integer;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nModalBottomSheetContent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModalBottomSheetContent.kt\ncom/stripe/android/financialconnections/features/common/ModalBottomSheetContentKt$LegalDetailsBottomSheetContent$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,245:1\n149#2:246\n149#2:247\n149#2:248\n*S KotlinDebug\n*F\n+ 1 ModalBottomSheetContent.kt\ncom/stripe/android/financialconnections/features/common/ModalBottomSheetContentKt$LegalDetailsBottomSheetContent$1\n*L\n109#1:246\n115#1:247\n119#1:248\n*E\n"
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


# instance fields
.field final synthetic $legalDetails:Lcom/stripe/android/financialconnections/model/LegalDetailsNotice;

.field final synthetic $links:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/stripe/android/financialconnections/ui/TextResource$Text;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $onClickableTextClick:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $subtitle:Lcom/stripe/android/financialconnections/ui/TextResource$Text;

.field final synthetic $title:Lcom/stripe/android/financialconnections/ui/TextResource$Text;


# direct methods
.method constructor <init>(Lcom/stripe/android/financialconnections/model/LegalDetailsNotice;Lcom/stripe/android/financialconnections/ui/TextResource$Text;Lkotlin/jvm/functions/Function1;Lcom/stripe/android/financialconnections/ui/TextResource$Text;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/financialconnections/model/LegalDetailsNotice;",
            "Lcom/stripe/android/financialconnections/ui/TextResource$Text;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;",
            "Lcom/stripe/android/financialconnections/ui/TextResource$Text;",
            "Ljava/util/List<",
            "Lcom/stripe/android/financialconnections/ui/TextResource$Text;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/financialconnections/features/common/ModalBottomSheetContentKt$LegalDetailsBottomSheetContent$1;->$legalDetails:Lcom/stripe/android/financialconnections/model/LegalDetailsNotice;

    iput-object p2, p0, Lcom/stripe/android/financialconnections/features/common/ModalBottomSheetContentKt$LegalDetailsBottomSheetContent$1;->$title:Lcom/stripe/android/financialconnections/ui/TextResource$Text;

    iput-object p3, p0, Lcom/stripe/android/financialconnections/features/common/ModalBottomSheetContentKt$LegalDetailsBottomSheetContent$1;->$onClickableTextClick:Lkotlin/jvm/functions/Function1;

    iput-object p4, p0, Lcom/stripe/android/financialconnections/features/common/ModalBottomSheetContentKt$LegalDetailsBottomSheetContent$1;->$subtitle:Lcom/stripe/android/financialconnections/ui/TextResource$Text;

    iput-object p5, p0, Lcom/stripe/android/financialconnections/features/common/ModalBottomSheetContentKt$LegalDetailsBottomSheetContent$1;->$links:Ljava/util/List;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 106
    check-cast p1, Landroidx/compose/foundation/layout/ColumnScope;

    check-cast p2, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Lcom/stripe/android/financialconnections/features/common/ModalBottomSheetContentKt$LegalDetailsBottomSheetContent$1;->invoke(Landroidx/compose/foundation/layout/ColumnScope;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/foundation/layout/ColumnScope;Landroidx/compose/runtime/Composer;I)V
    .locals 11

    const-string v0, "$this$ModalBottomSheetContent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 p1, p3, 0x11

    const/16 v0, 0x10

    if-ne p1, v0, :cond_1

    .line 107
    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    .line 121
    :cond_0
    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    return-void

    .line 107
    :cond_1
    :goto_0
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result p1

    if-eqz p1, :cond_2

    const/4 p1, -0x1

    const-string v1, "com.stripe.android.financialconnections.features.common.LegalDetailsBottomSheetContent.<anonymous> (ModalBottomSheetContent.kt:106)"

    const v2, 0x62d51919

    invoke-static {v2, p3, p1, v1}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    :cond_2
    iget-object p1, p0, Lcom/stripe/android/financialconnections/features/common/ModalBottomSheetContentKt$LegalDetailsBottomSheetContent$1;->$legalDetails:Lcom/stripe/android/financialconnections/model/LegalDetailsNotice;

    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/model/LegalDetailsNotice;->getIcon()Lcom/stripe/android/financialconnections/model/Image;

    move-result-object p1

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/model/Image;->getDefault()Ljava/lang/String;

    move-result-object p1

    goto :goto_1

    :cond_3
    const/4 p1, 0x0

    :goto_1
    move-object v1, p1

    const p1, -0x5b5e7509

    invoke-interface {p2, p1}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    const/4 p1, 0x6

    if-nez v1, :cond_4

    move-object v8, p2

    goto :goto_2

    :cond_4
    const/16 v9, 0x6000

    const/16 v10, 0x6e

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    .line 108
    const-string v5, "legal details icon"

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v8, p2

    invoke-static/range {v1 .. v10}, Lcom/stripe/android/financialconnections/features/common/ShapedIconKt;->ShapedIcon(Ljava/lang/String;Landroidx/compose/ui/Modifier;Lcom/stripe/android/financialconnections/features/common/IconSize;Landroidx/compose/ui/graphics/Shape;Ljava/lang/String;Landroidx/compose/ui/graphics/painter/Painter;ZLandroidx/compose/runtime/Composer;II)V

    .line 109
    sget-object p2, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast p2, Landroidx/compose/ui/Modifier;

    int-to-float p3, v0

    .line 246
    invoke-static {p3}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result p3

    .line 109
    invoke-static {p2, p3}, Landroidx/compose/foundation/layout/SizeKt;->size-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    move-result-object p2

    invoke-static {p2, v8, p1}, Landroidx/compose/foundation/layout/SpacerKt;->Spacer(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    .line 107
    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    :goto_2
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 112
    iget-object p2, p0, Lcom/stripe/android/financialconnections/features/common/ModalBottomSheetContentKt$LegalDetailsBottomSheetContent$1;->$title:Lcom/stripe/android/financialconnections/ui/TextResource$Text;

    iget-object p3, p0, Lcom/stripe/android/financialconnections/features/common/ModalBottomSheetContentKt$LegalDetailsBottomSheetContent$1;->$onClickableTextClick:Lkotlin/jvm/functions/Function1;

    const/4 v1, 0x0

    invoke-static {p2, p3, v8, v1}, Lcom/stripe/android/financialconnections/features/common/ModalBottomSheetContentKt;->access$Title(Lcom/stripe/android/financialconnections/ui/TextResource$Text;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    .line 114
    iget-object p2, p0, Lcom/stripe/android/financialconnections/features/common/ModalBottomSheetContentKt$LegalDetailsBottomSheetContent$1;->$subtitle:Lcom/stripe/android/financialconnections/ui/TextResource$Text;

    const p3, -0x5b5e5802

    invoke-interface {v8, p3}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    if-nez p2, :cond_5

    goto :goto_3

    :cond_5
    iget-object p3, p0, Lcom/stripe/android/financialconnections/features/common/ModalBottomSheetContentKt$LegalDetailsBottomSheetContent$1;->$onClickableTextClick:Lkotlin/jvm/functions/Function1;

    .line 115
    sget-object v2, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v2, Landroidx/compose/ui/Modifier;

    int-to-float v0, v0

    .line 247
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v0

    .line 115
    invoke-static {v2, v0}, Landroidx/compose/foundation/layout/SizeKt;->size-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {v0, v8, p1}, Landroidx/compose/foundation/layout/SpacerKt;->Spacer(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    .line 116
    check-cast p2, Lcom/stripe/android/financialconnections/ui/TextResource;

    invoke-static {p2, p3, v8, v1}, Lcom/stripe/android/financialconnections/features/common/ModalBottomSheetContentKt;->access$Subtitle(Lcom/stripe/android/financialconnections/ui/TextResource;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    .line 114
    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    :goto_3
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 119
    sget-object p2, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast p2, Landroidx/compose/ui/Modifier;

    const/16 p3, 0x18

    int-to-float p3, p3

    .line 248
    invoke-static {p3}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result p3

    .line 119
    invoke-static {p2, p3}, Landroidx/compose/foundation/layout/SizeKt;->size-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    move-result-object p2

    invoke-static {p2, v8, p1}, Landroidx/compose/foundation/layout/SpacerKt;->Spacer(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    .line 121
    iget-object p1, p0, Lcom/stripe/android/financialconnections/features/common/ModalBottomSheetContentKt$LegalDetailsBottomSheetContent$1;->$links:Ljava/util/List;

    iget-object p2, p0, Lcom/stripe/android/financialconnections/features/common/ModalBottomSheetContentKt$LegalDetailsBottomSheetContent$1;->$onClickableTextClick:Lkotlin/jvm/functions/Function1;

    invoke-static {p1, p2, v8, v1}, Lcom/stripe/android/financialconnections/features/common/ModalBottomSheetContentKt;->access$Links(Ljava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result p1

    if-eqz p1, :cond_6

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_6
    return-void
.end method
