.class final Lcom/stripe/android/financialconnections/features/common/ModalBottomSheetContentKt$DataAccessBottomSheetContent$1;
.super Ljava/lang/Object;
.source "ModalBottomSheetContent.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/financialconnections/features/common/ModalBottomSheetContentKt;->DataAccessBottomSheetContent(Lcom/stripe/android/financialconnections/model/DataAccessNotice;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V
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
    value = "SMAP\nModalBottomSheetContent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModalBottomSheetContent.kt\ncom/stripe/android/financialconnections/features/common/ModalBottomSheetContentKt$DataAccessBottomSheetContent$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,245:1\n149#2:246\n149#2:247\n149#2:248\n149#2:250\n149#2:252\n149#2:253\n149#2:255\n1863#3:249\n1864#3:251\n1863#3:254\n1864#3:256\n*S KotlinDebug\n*F\n+ 1 ModalBottomSheetContent.kt\ncom/stripe/android/financialconnections/features/common/ModalBottomSheetContentKt$DataAccessBottomSheetContent$1\n*L\n53#1:246\n58#1:247\n63#1:248\n69#1:250\n74#1:252\n77#1:253\n83#1:255\n64#1:249\n64#1:251\n78#1:254\n78#1:256\n*E\n"
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
.field final synthetic $bullets:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/stripe/android/financialconnections/ui/sdui/BulletUI;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $dataDialog:Lcom/stripe/android/financialconnections/model/DataAccessNotice;

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
.method constructor <init>(Lcom/stripe/android/financialconnections/model/DataAccessNotice;Lcom/stripe/android/financialconnections/ui/TextResource$Text;Lkotlin/jvm/functions/Function1;Lcom/stripe/android/financialconnections/ui/TextResource$Text;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/financialconnections/model/DataAccessNotice;",
            "Lcom/stripe/android/financialconnections/ui/TextResource$Text;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;",
            "Lcom/stripe/android/financialconnections/ui/TextResource$Text;",
            "Ljava/util/List<",
            "Lcom/stripe/android/financialconnections/ui/sdui/BulletUI;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/financialconnections/features/common/ModalBottomSheetContentKt$DataAccessBottomSheetContent$1;->$dataDialog:Lcom/stripe/android/financialconnections/model/DataAccessNotice;

    iput-object p2, p0, Lcom/stripe/android/financialconnections/features/common/ModalBottomSheetContentKt$DataAccessBottomSheetContent$1;->$title:Lcom/stripe/android/financialconnections/ui/TextResource$Text;

    iput-object p3, p0, Lcom/stripe/android/financialconnections/features/common/ModalBottomSheetContentKt$DataAccessBottomSheetContent$1;->$onClickableTextClick:Lkotlin/jvm/functions/Function1;

    iput-object p4, p0, Lcom/stripe/android/financialconnections/features/common/ModalBottomSheetContentKt$DataAccessBottomSheetContent$1;->$subtitle:Lcom/stripe/android/financialconnections/ui/TextResource$Text;

    iput-object p5, p0, Lcom/stripe/android/financialconnections/features/common/ModalBottomSheetContentKt$DataAccessBottomSheetContent$1;->$bullets:Ljava/util/List;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 50
    check-cast p1, Landroidx/compose/foundation/layout/ColumnScope;

    check-cast p2, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Lcom/stripe/android/financialconnections/features/common/ModalBottomSheetContentKt$DataAccessBottomSheetContent$1;->invoke(Landroidx/compose/foundation/layout/ColumnScope;Landroidx/compose/runtime/Composer;I)V

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

    .line 51
    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    .line 84
    :cond_0
    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    return-void

    .line 51
    :cond_1
    :goto_0
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result p1

    if-eqz p1, :cond_2

    const/4 p1, -0x1

    const-string v1, "com.stripe.android.financialconnections.features.common.DataAccessBottomSheetContent.<anonymous> (ModalBottomSheetContent.kt:50)"

    const v2, -0x11794987

    invoke-static {v2, p3, p1, v1}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    :cond_2
    iget-object p1, p0, Lcom/stripe/android/financialconnections/features/common/ModalBottomSheetContentKt$DataAccessBottomSheetContent$1;->$dataDialog:Lcom/stripe/android/financialconnections/model/DataAccessNotice;

    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/model/DataAccessNotice;->getIcon()Lcom/stripe/android/financialconnections/model/Image;

    move-result-object p1

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/model/Image;->getDefault()Ljava/lang/String;

    move-result-object p1

    goto :goto_1

    :cond_3
    const/4 p1, 0x0

    :goto_1
    move-object v1, p1

    const p1, -0x5376f280

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

    .line 52
    const-string v5, "Icon"

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v8, p2

    invoke-static/range {v1 .. v10}, Lcom/stripe/android/financialconnections/features/common/ShapedIconKt;->ShapedIcon(Ljava/lang/String;Landroidx/compose/ui/Modifier;Lcom/stripe/android/financialconnections/features/common/IconSize;Landroidx/compose/ui/graphics/Shape;Ljava/lang/String;Landroidx/compose/ui/graphics/painter/Painter;ZLandroidx/compose/runtime/Composer;II)V

    .line 53
    sget-object p2, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast p2, Landroidx/compose/ui/Modifier;

    int-to-float p3, v0

    .line 246
    invoke-static {p3}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result p3

    .line 53
    invoke-static {p2, p3}, Landroidx/compose/foundation/layout/SizeKt;->size-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    move-result-object p2

    invoke-static {p2, v8, p1}, Landroidx/compose/foundation/layout/SpacerKt;->Spacer(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    .line 51
    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    :goto_2
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 55
    iget-object p2, p0, Lcom/stripe/android/financialconnections/features/common/ModalBottomSheetContentKt$DataAccessBottomSheetContent$1;->$title:Lcom/stripe/android/financialconnections/ui/TextResource$Text;

    iget-object p3, p0, Lcom/stripe/android/financialconnections/features/common/ModalBottomSheetContentKt$DataAccessBottomSheetContent$1;->$onClickableTextClick:Lkotlin/jvm/functions/Function1;

    const/4 v1, 0x0

    invoke-static {p2, p3, v8, v1}, Lcom/stripe/android/financialconnections/features/common/ModalBottomSheetContentKt;->access$Title(Lcom/stripe/android/financialconnections/ui/TextResource$Text;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    .line 57
    iget-object p2, p0, Lcom/stripe/android/financialconnections/features/common/ModalBottomSheetContentKt$DataAccessBottomSheetContent$1;->$dataDialog:Lcom/stripe/android/financialconnections/model/DataAccessNotice;

    invoke-virtual {p2}, Lcom/stripe/android/financialconnections/model/DataAccessNotice;->getConnectedAccountNotice()Lcom/stripe/android/financialconnections/model/ConnectedAccessNotice;

    move-result-object p2

    const p3, -0x5376c396

    invoke-interface {v8, p3}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    const/16 p3, 0x18

    if-nez p2, :cond_5

    goto :goto_4

    :cond_5
    iget-object v2, p0, Lcom/stripe/android/financialconnections/features/common/ModalBottomSheetContentKt$DataAccessBottomSheetContent$1;->$onClickableTextClick:Lkotlin/jvm/functions/Function1;

    .line 58
    sget-object v3, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v3, Landroidx/compose/ui/Modifier;

    int-to-float v4, v0

    .line 247
    invoke-static {v4}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v5

    .line 58
    invoke-static {v3, v5}, Landroidx/compose/foundation/layout/SizeKt;->size-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-static {v3, v8, p1}, Landroidx/compose/foundation/layout/SpacerKt;->Spacer(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    .line 60
    invoke-virtual {p2}, Lcom/stripe/android/financialconnections/model/ConnectedAccessNotice;->getSubtitle()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v8, v1}, Lcom/stripe/android/financialconnections/ui/sdui/ServerDrivenUiKt;->rememberHtml(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Lcom/stripe/android/financialconnections/ui/TextResource$Text;

    move-result-object v3

    check-cast v3, Lcom/stripe/android/financialconnections/ui/TextResource;

    .line 59
    invoke-static {v3, v2, v8, v1}, Lcom/stripe/android/financialconnections/features/common/ModalBottomSheetContentKt;->access$Subtitle(Lcom/stripe/android/financialconnections/ui/TextResource;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    .line 63
    sget-object v3, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v3, Landroidx/compose/ui/Modifier;

    int-to-float v5, p3

    .line 248
    invoke-static {v5}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v5

    .line 63
    invoke-static {v3, v5}, Landroidx/compose/foundation/layout/SizeKt;->size-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-static {v3, v8, p1}, Landroidx/compose/foundation/layout/SpacerKt;->Spacer(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    const v3, -0x53769ddc    # -3.90467E-12f

    invoke-interface {v8, v3}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 64
    invoke-virtual {p2}, Lcom/stripe/android/financialconnections/model/ConnectedAccessNotice;->getBody()Lcom/stripe/android/financialconnections/model/DataAccessNoticeBody;

    move-result-object p2

    invoke-virtual {p2}, Lcom/stripe/android/financialconnections/model/DataAccessNoticeBody;->getBullets()Ljava/util/List;

    move-result-object p2

    check-cast p2, Ljava/lang/Iterable;

    .line 249
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_3
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_6

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/stripe/android/financialconnections/model/Bullet;

    .line 66
    sget-object v5, Lcom/stripe/android/financialconnections/ui/sdui/BulletUI;->Companion:Lcom/stripe/android/financialconnections/ui/sdui/BulletUI$Companion;

    invoke-virtual {v5, v3}, Lcom/stripe/android/financialconnections/ui/sdui/BulletUI$Companion;->from(Lcom/stripe/android/financialconnections/model/Bullet;)Lcom/stripe/android/financialconnections/ui/sdui/BulletUI;

    move-result-object v3

    .line 65
    invoke-static {v3, v2, v8, v1}, Lcom/stripe/android/financialconnections/features/common/ListItemKt;->ListItem(Lcom/stripe/android/financialconnections/ui/sdui/BulletUI;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    .line 69
    sget-object v3, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v3, Landroidx/compose/ui/Modifier;

    .line 250
    invoke-static {v4}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v5

    .line 69
    invoke-static {v3, v5}, Landroidx/compose/foundation/layout/SizeKt;->size-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-static {v3, v8, p1}, Landroidx/compose/foundation/layout/SpacerKt;->Spacer(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    goto :goto_3

    .line 251
    :cond_6
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 57
    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    :goto_4
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 73
    iget-object p2, p0, Lcom/stripe/android/financialconnections/features/common/ModalBottomSheetContentKt$DataAccessBottomSheetContent$1;->$subtitle:Lcom/stripe/android/financialconnections/ui/TextResource$Text;

    const v2, -0x53766daf

    invoke-interface {v8, v2}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    if-nez p2, :cond_7

    goto :goto_5

    :cond_7
    iget-object v2, p0, Lcom/stripe/android/financialconnections/features/common/ModalBottomSheetContentKt$DataAccessBottomSheetContent$1;->$onClickableTextClick:Lkotlin/jvm/functions/Function1;

    .line 74
    sget-object v3, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v3, Landroidx/compose/ui/Modifier;

    int-to-float v4, v0

    .line 252
    invoke-static {v4}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v4

    .line 74
    invoke-static {v3, v4}, Landroidx/compose/foundation/layout/SizeKt;->size-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-static {v3, v8, p1}, Landroidx/compose/foundation/layout/SpacerKt;->Spacer(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    .line 75
    check-cast p2, Lcom/stripe/android/financialconnections/ui/TextResource;

    invoke-static {p2, v2, v8, v1}, Lcom/stripe/android/financialconnections/features/common/ModalBottomSheetContentKt;->access$Subtitle(Lcom/stripe/android/financialconnections/ui/TextResource;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    .line 73
    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    :goto_5
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 77
    sget-object p2, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast p2, Landroidx/compose/ui/Modifier;

    int-to-float p3, p3

    .line 253
    invoke-static {p3}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result p3

    .line 77
    invoke-static {p2, p3}, Landroidx/compose/foundation/layout/SizeKt;->size-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    move-result-object p2

    invoke-static {p2, v8, p1}, Landroidx/compose/foundation/layout/SpacerKt;->Spacer(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    .line 78
    iget-object p2, p0, Lcom/stripe/android/financialconnections/features/common/ModalBottomSheetContentKt$DataAccessBottomSheetContent$1;->$bullets:Ljava/util/List;

    check-cast p2, Ljava/lang/Iterable;

    iget-object p3, p0, Lcom/stripe/android/financialconnections/features/common/ModalBottomSheetContentKt$DataAccessBottomSheetContent$1;->$onClickableTextClick:Lkotlin/jvm/functions/Function1;

    .line 254
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_6
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_8

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/stripe/android/financialconnections/ui/sdui/BulletUI;

    .line 79
    invoke-static {v2, p3, v8, v1}, Lcom/stripe/android/financialconnections/features/common/ListItemKt;->ListItem(Lcom/stripe/android/financialconnections/ui/sdui/BulletUI;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    .line 83
    sget-object v2, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v2, Landroidx/compose/ui/Modifier;

    int-to-float v3, v0

    .line 255
    invoke-static {v3}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v3

    .line 83
    invoke-static {v2, v3}, Landroidx/compose/foundation/layout/SizeKt;->size-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-static {v2, v8, p1}, Landroidx/compose/foundation/layout/SpacerKt;->Spacer(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    goto :goto_6

    .line 256
    :cond_8
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result p1

    if-eqz p1, :cond_9

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_9
    return-void
.end method
