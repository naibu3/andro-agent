.class final Lcom/stripe/android/uicore/elements/SingleChoiceDropdownUIKt$SingleChoiceDropdown$1;
.super Ljava/lang/Object;
.source "SingleChoiceDropdownUI.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/uicore/elements/SingleChoiceDropdownUIKt;->SingleChoiceDropdown-WMdw5o4(ZLcom/stripe/android/core/strings/ResolvableString;Lcom/stripe/android/uicore/elements/SingleChoiceDropdownItem;Ljava/util/List;Lkotlin/jvm/functions/Function1;JJLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V
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
    value = "SMAP\nSingleChoiceDropdownUI.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SingleChoiceDropdownUI.kt\ncom/stripe/android/uicore/elements/SingleChoiceDropdownUIKt$SingleChoiceDropdown$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,129:1\n149#2:130\n1863#3:131\n1864#3:138\n1225#4,6:132\n*S KotlinDebug\n*F\n+ 1 SingleChoiceDropdownUI.kt\ncom/stripe/android/uicore/elements/SingleChoiceDropdownUIKt$SingleChoiceDropdown$1\n*L\n53#1:130\n56#1:131\n56#1:138\n63#1:132,6\n*E\n"
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
.field final synthetic $choices:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "TTDropdownChoice;>;"
        }
    .end annotation
.end field

.field final synthetic $currentChoice:Lcom/stripe/android/uicore/elements/SingleChoiceDropdownItem;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TTDropdownChoice;"
        }
    .end annotation
.end field

.field final synthetic $headerTextColor:J

.field final synthetic $onChoiceSelected:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "TTDropdownChoice;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $optionTextColor:J

.field final synthetic $title:Lcom/stripe/android/core/strings/ResolvableString;


# direct methods
.method public static synthetic $r8$lambda$7cRYOkqTVBVXVjYw_mJtp1jAd84(Lkotlin/jvm/functions/Function1;Lcom/stripe/android/uicore/elements/SingleChoiceDropdownItem;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/uicore/elements/SingleChoiceDropdownUIKt$SingleChoiceDropdown$1;->invoke$lambda$2$lambda$1$lambda$0(Lkotlin/jvm/functions/Function1;Lcom/stripe/android/uicore/elements/SingleChoiceDropdownItem;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method constructor <init>(Lcom/stripe/android/core/strings/ResolvableString;JLjava/util/List;Lcom/stripe/android/uicore/elements/SingleChoiceDropdownItem;JLkotlin/jvm/functions/Function1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/core/strings/ResolvableString;",
            "J",
            "Ljava/util/List<",
            "+TTDropdownChoice;>;TTDropdownChoice;J",
            "Lkotlin/jvm/functions/Function1<",
            "-TTDropdownChoice;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/uicore/elements/SingleChoiceDropdownUIKt$SingleChoiceDropdown$1;->$title:Lcom/stripe/android/core/strings/ResolvableString;

    iput-wide p2, p0, Lcom/stripe/android/uicore/elements/SingleChoiceDropdownUIKt$SingleChoiceDropdown$1;->$headerTextColor:J

    iput-object p4, p0, Lcom/stripe/android/uicore/elements/SingleChoiceDropdownUIKt$SingleChoiceDropdown$1;->$choices:Ljava/util/List;

    iput-object p5, p0, Lcom/stripe/android/uicore/elements/SingleChoiceDropdownUIKt$SingleChoiceDropdown$1;->$currentChoice:Lcom/stripe/android/uicore/elements/SingleChoiceDropdownItem;

    iput-wide p6, p0, Lcom/stripe/android/uicore/elements/SingleChoiceDropdownUIKt$SingleChoiceDropdown$1;->$optionTextColor:J

    iput-object p8, p0, Lcom/stripe/android/uicore/elements/SingleChoiceDropdownUIKt$SingleChoiceDropdown$1;->$onChoiceSelected:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static final invoke$lambda$2$lambda$1$lambda$0(Lkotlin/jvm/functions/Function1;Lcom/stripe/android/uicore/elements/SingleChoiceDropdownItem;)Lkotlin/Unit;
    .locals 0

    .line 64
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 65
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 49
    check-cast p1, Landroidx/compose/foundation/layout/ColumnScope;

    check-cast p2, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Lcom/stripe/android/uicore/elements/SingleChoiceDropdownUIKt$SingleChoiceDropdown$1;->invoke(Landroidx/compose/foundation/layout/ColumnScope;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/foundation/layout/ColumnScope;Landroidx/compose/runtime/Composer;I)V
    .locals 26

    move-object/from16 v0, p0

    move-object/from16 v8, p2

    move/from16 v1, p3

    const-string v2, "$this$DropdownMenu"

    move-object/from16 v3, p1

    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v2, v1, 0x11

    const/16 v3, 0x10

    if-ne v2, v3, :cond_1

    .line 50
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    .line 67
    :cond_0
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    return-void

    .line 50
    :cond_1
    :goto_0
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v2

    if-eqz v2, :cond_2

    const/4 v2, -0x1

    const-string v3, "com.stripe.android.uicore.elements.SingleChoiceDropdown.<anonymous> (SingleChoiceDropdownUI.kt:49)"

    const v4, -0x7b8a9ef7

    invoke-static {v4, v1, v2, v3}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 51
    :cond_2
    iget-object v1, v0, Lcom/stripe/android/uicore/elements/SingleChoiceDropdownUIKt$SingleChoiceDropdown$1;->$title:Lcom/stripe/android/core/strings/ResolvableString;

    const/4 v2, 0x0

    invoke-static {v1, v8, v2}, Lcom/stripe/android/uicore/strings/ResolvableStringComposeUtilsKt;->resolve(Lcom/stripe/android/core/strings/ResolvableString;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v1

    .line 53
    sget-object v3, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    const/4 v4, 0x5

    int-to-float v4, v4

    .line 130
    invoke-static {v4}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v4

    const/16 v5, 0xd

    int-to-float v5, v5

    invoke-static {v5}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v5

    .line 53
    check-cast v3, Landroidx/compose/ui/Modifier;

    invoke-static {v3, v5, v4}, Landroidx/compose/foundation/layout/PaddingKt;->padding-VpY3zN4(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v3

    move v5, v2

    move-object v2, v3

    .line 52
    iget-wide v3, v0, Lcom/stripe/android/uicore/elements/SingleChoiceDropdownUIKt$SingleChoiceDropdown$1;->$headerTextColor:J

    const/16 v24, 0x0

    const v25, 0x1fff8

    move v7, v5

    const-wide/16 v5, 0x0

    move v9, v7

    const/4 v7, 0x0

    const/4 v8, 0x0

    move v10, v9

    const/4 v9, 0x0

    move v12, v10

    const-wide/16 v10, 0x0

    move v13, v12

    const/4 v12, 0x0

    move v14, v13

    const/4 v13, 0x0

    move/from16 v16, v14

    const-wide/16 v14, 0x0

    move/from16 v17, v16

    const/16 v16, 0x0

    move/from16 v18, v17

    const/16 v17, 0x0

    move/from16 v19, v18

    const/16 v18, 0x0

    move/from16 v20, v19

    const/16 v19, 0x0

    move/from16 v21, v20

    const/16 v20, 0x0

    move/from16 v22, v21

    const/16 v21, 0x0

    const/16 v23, 0x0

    move-object/from16 v22, p2

    .line 50
    invoke-static/range {v1 .. v25}, Landroidx/compose/material/TextKt;->Text--4IGK_g(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v8, v22

    .line 56
    iget-object v1, v0, Lcom/stripe/android/uicore/elements/SingleChoiceDropdownUIKt$SingleChoiceDropdown$1;->$choices:Ljava/util/List;

    check-cast v1, Ljava/lang/Iterable;

    iget-object v11, v0, Lcom/stripe/android/uicore/elements/SingleChoiceDropdownUIKt$SingleChoiceDropdown$1;->$currentChoice:Lcom/stripe/android/uicore/elements/SingleChoiceDropdownItem;

    iget-wide v4, v0, Lcom/stripe/android/uicore/elements/SingleChoiceDropdownUIKt$SingleChoiceDropdown$1;->$optionTextColor:J

    iget-object v12, v0, Lcom/stripe/android/uicore/elements/SingleChoiceDropdownUIKt$SingleChoiceDropdown$1;->$onChoiceSelected:Lkotlin/jvm/functions/Function1;

    .line 131
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v13

    :goto_1
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/stripe/android/uicore/elements/SingleChoiceDropdownItem;

    .line 58
    invoke-interface {v1}, Lcom/stripe/android/uicore/elements/SingleChoiceDropdownItem;->getLabel()Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object v2

    const/4 v14, 0x0

    invoke-static {v2, v8, v14}, Lcom/stripe/android/uicore/strings/ResolvableStringComposeUtilsKt;->resolve(Lcom/stripe/android/core/strings/ResolvableString;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v2

    move-object v3, v2

    .line 59
    invoke-interface {v1}, Lcom/stripe/android/uicore/elements/SingleChoiceDropdownItem;->getIcon()Ljava/lang/Integer;

    move-result-object v2

    move-object v6, v3

    .line 60
    invoke-static {v1, v11}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    move-object v7, v6

    .line 62
    invoke-interface {v1}, Lcom/stripe/android/uicore/elements/SingleChoiceDropdownItem;->getEnabled()Z

    move-result v6

    const v9, -0x7ad187b9

    invoke-interface {v8, v9}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    invoke-interface {v8, v12}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v9

    invoke-interface {v8, v1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v10

    or-int/2addr v9, v10

    .line 132
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v10

    if-nez v9, :cond_3

    .line 133
    sget-object v9, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v9}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v9

    if-ne v10, v9, :cond_4

    .line 63
    :cond_3
    new-instance v10, Lcom/stripe/android/uicore/elements/SingleChoiceDropdownUIKt$SingleChoiceDropdown$1$$ExternalSyntheticLambda0;

    invoke-direct {v10, v12, v1}, Lcom/stripe/android/uicore/elements/SingleChoiceDropdownUIKt$SingleChoiceDropdown$1$$ExternalSyntheticLambda0;-><init>(Lkotlin/jvm/functions/Function1;Lcom/stripe/android/uicore/elements/SingleChoiceDropdownItem;)V

    .line 135
    invoke-interface {v8, v10}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 63
    :cond_4
    check-cast v10, Lkotlin/jvm/functions/Function0;

    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    const/4 v9, 0x0

    move-object v1, v7

    move-object v7, v10

    const/4 v10, 0x0

    .line 57
    invoke-static/range {v1 .. v10}, Lcom/stripe/android/uicore/elements/SingleChoiceDropdownUIKt;->access$Choice-fWhpE4E(Ljava/lang/String;Ljava/lang/Integer;ZJZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V

    move-object/from16 v8, p2

    goto :goto_1

    .line 138
    :cond_5
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_6
    return-void
.end method
