.class final Lcom/stripe/android/uicore/text/MiddleEllipsisTextKt$MiddleEllipsisText$2$1;
.super Ljava/lang/Object;
.source "MiddleEllipsisText.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/uicore/text/MiddleEllipsisTextKt;->MiddleEllipsisText-oiE5lR0(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;CILandroidx/compose/runtime/Composer;III)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlin/jvm/functions/Function2<",
        "Landroidx/compose/runtime/Composer;",
        "Ljava/lang/Integer;",
        "Lkotlin/Unit;",
        ">;"
    }
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
.field final synthetic $color:J

.field final synthetic $ellipsisChar:C

.field final synthetic $fontFamily:Landroidx/compose/ui/text/font/FontFamily;

.field final synthetic $fontSize:J

.field final synthetic $fontStyle:Landroidx/compose/ui/text/font/FontStyle;

.field final synthetic $fontWeight:Landroidx/compose/ui/text/font/FontWeight;

.field final synthetic $letterSpacing:J

.field final synthetic $lineHeight:J

.field final synthetic $softWrap:Z

.field final synthetic $style:Landroidx/compose/ui/text/TextStyle;

.field final synthetic $text:Ljava/lang/String;

.field final synthetic $textAlign:Landroidx/compose/ui/text/style/TextAlign;

.field final synthetic $textDecoration:Landroidx/compose/ui/text/style/TextDecoration;

.field final synthetic $textLayoutResult:Lkotlin/jvm/internal/Ref$ObjectRef;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/internal/Ref$ObjectRef<",
            "Landroidx/compose/ui/text/TextLayoutResult;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static synthetic $r8$lambda$S4eQ7k04dPmgTYlHHrqfz5THRuA(Lkotlin/jvm/internal/Ref$ObjectRef;Landroidx/compose/ui/text/TextLayoutResult;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/uicore/text/MiddleEllipsisTextKt$MiddleEllipsisText$2$1;->invoke$lambda$0(Lkotlin/jvm/internal/Ref$ObjectRef;Landroidx/compose/ui/text/TextLayoutResult;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method constructor <init>(Ljava/lang/String;CJJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JZLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/internal/Ref$ObjectRef;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "CJJ",
            "Landroidx/compose/ui/text/font/FontStyle;",
            "Landroidx/compose/ui/text/font/FontWeight;",
            "Landroidx/compose/ui/text/font/FontFamily;",
            "J",
            "Landroidx/compose/ui/text/style/TextDecoration;",
            "Landroidx/compose/ui/text/style/TextAlign;",
            "JZ",
            "Landroidx/compose/ui/text/TextStyle;",
            "Lkotlin/jvm/internal/Ref$ObjectRef<",
            "Landroidx/compose/ui/text/TextLayoutResult;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/uicore/text/MiddleEllipsisTextKt$MiddleEllipsisText$2$1;->$text:Ljava/lang/String;

    iput-char p2, p0, Lcom/stripe/android/uicore/text/MiddleEllipsisTextKt$MiddleEllipsisText$2$1;->$ellipsisChar:C

    iput-wide p3, p0, Lcom/stripe/android/uicore/text/MiddleEllipsisTextKt$MiddleEllipsisText$2$1;->$color:J

    iput-wide p5, p0, Lcom/stripe/android/uicore/text/MiddleEllipsisTextKt$MiddleEllipsisText$2$1;->$fontSize:J

    iput-object p7, p0, Lcom/stripe/android/uicore/text/MiddleEllipsisTextKt$MiddleEllipsisText$2$1;->$fontStyle:Landroidx/compose/ui/text/font/FontStyle;

    iput-object p8, p0, Lcom/stripe/android/uicore/text/MiddleEllipsisTextKt$MiddleEllipsisText$2$1;->$fontWeight:Landroidx/compose/ui/text/font/FontWeight;

    iput-object p9, p0, Lcom/stripe/android/uicore/text/MiddleEllipsisTextKt$MiddleEllipsisText$2$1;->$fontFamily:Landroidx/compose/ui/text/font/FontFamily;

    iput-wide p10, p0, Lcom/stripe/android/uicore/text/MiddleEllipsisTextKt$MiddleEllipsisText$2$1;->$letterSpacing:J

    iput-object p12, p0, Lcom/stripe/android/uicore/text/MiddleEllipsisTextKt$MiddleEllipsisText$2$1;->$textDecoration:Landroidx/compose/ui/text/style/TextDecoration;

    iput-object p13, p0, Lcom/stripe/android/uicore/text/MiddleEllipsisTextKt$MiddleEllipsisText$2$1;->$textAlign:Landroidx/compose/ui/text/style/TextAlign;

    iput-wide p14, p0, Lcom/stripe/android/uicore/text/MiddleEllipsisTextKt$MiddleEllipsisText$2$1;->$lineHeight:J

    move/from16 p1, p16

    iput-boolean p1, p0, Lcom/stripe/android/uicore/text/MiddleEllipsisTextKt$MiddleEllipsisText$2$1;->$softWrap:Z

    move-object/from16 p1, p17

    iput-object p1, p0, Lcom/stripe/android/uicore/text/MiddleEllipsisTextKt$MiddleEllipsisText$2$1;->$style:Landroidx/compose/ui/text/TextStyle;

    move-object/from16 p1, p18

    iput-object p1, p0, Lcom/stripe/android/uicore/text/MiddleEllipsisTextKt$MiddleEllipsisText$2$1;->$textLayoutResult:Lkotlin/jvm/internal/Ref$ObjectRef;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static final invoke$lambda$0(Lkotlin/jvm/internal/Ref$ObjectRef;Landroidx/compose/ui/text/TextLayoutResult;)Lkotlin/Unit;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 92
    iput-object p1, p0, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 79
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/uicore/text/MiddleEllipsisTextKt$MiddleEllipsisText$2$1;->invoke(Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/runtime/Composer;I)V
    .locals 27

    move-object/from16 v0, p0

    move/from16 v1, p2

    and-int/lit8 v2, v1, 0x3

    const/4 v3, 0x2

    if-ne v2, v3, :cond_1

    .line 80
    invoke-interface/range {p1 .. p1}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    .line 94
    :cond_0
    invoke-interface/range {p1 .. p1}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    return-void

    .line 80
    :cond_1
    :goto_0
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v2

    if-eqz v2, :cond_2

    const/4 v2, -0x1

    const-string v3, "com.stripe.android.uicore.text.MiddleEllipsisText.<anonymous>.<anonymous> (MiddleEllipsisText.kt:79)"

    const v4, 0x21c58857

    invoke-static {v4, v1, v2, v3}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 81
    :cond_2
    iget-object v1, v0, Lcom/stripe/android/uicore/text/MiddleEllipsisTextKt$MiddleEllipsisText$2$1;->$text:Ljava/lang/String;

    iget-char v2, v0, Lcom/stripe/android/uicore/text/MiddleEllipsisTextKt$MiddleEllipsisText$2$1;->$ellipsisChar:C

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 82
    iget-wide v4, v0, Lcom/stripe/android/uicore/text/MiddleEllipsisTextKt$MiddleEllipsisText$2$1;->$color:J

    .line 83
    iget-wide v6, v0, Lcom/stripe/android/uicore/text/MiddleEllipsisTextKt$MiddleEllipsisText$2$1;->$fontSize:J

    .line 84
    iget-object v8, v0, Lcom/stripe/android/uicore/text/MiddleEllipsisTextKt$MiddleEllipsisText$2$1;->$fontStyle:Landroidx/compose/ui/text/font/FontStyle;

    .line 85
    iget-object v9, v0, Lcom/stripe/android/uicore/text/MiddleEllipsisTextKt$MiddleEllipsisText$2$1;->$fontWeight:Landroidx/compose/ui/text/font/FontWeight;

    .line 86
    iget-object v10, v0, Lcom/stripe/android/uicore/text/MiddleEllipsisTextKt$MiddleEllipsisText$2$1;->$fontFamily:Landroidx/compose/ui/text/font/FontFamily;

    .line 87
    iget-wide v11, v0, Lcom/stripe/android/uicore/text/MiddleEllipsisTextKt$MiddleEllipsisText$2$1;->$letterSpacing:J

    .line 88
    iget-object v13, v0, Lcom/stripe/android/uicore/text/MiddleEllipsisTextKt$MiddleEllipsisText$2$1;->$textDecoration:Landroidx/compose/ui/text/style/TextDecoration;

    .line 89
    iget-object v14, v0, Lcom/stripe/android/uicore/text/MiddleEllipsisTextKt$MiddleEllipsisText$2$1;->$textAlign:Landroidx/compose/ui/text/style/TextAlign;

    move-object/from16 p2, v2

    .line 90
    iget-wide v1, v0, Lcom/stripe/android/uicore/text/MiddleEllipsisTextKt$MiddleEllipsisText$2$1;->$lineHeight:J

    .line 91
    iget-boolean v3, v0, Lcom/stripe/android/uicore/text/MiddleEllipsisTextKt$MiddleEllipsisText$2$1;->$softWrap:Z

    .line 80
    iget-object v15, v0, Lcom/stripe/android/uicore/text/MiddleEllipsisTextKt$MiddleEllipsisText$2$1;->$textLayoutResult:Lkotlin/jvm/internal/Ref$ObjectRef;

    move-wide/from16 v16, v1

    new-instance v1, Lcom/stripe/android/uicore/text/MiddleEllipsisTextKt$MiddleEllipsisText$2$1$$ExternalSyntheticLambda0;

    invoke-direct {v1, v15}, Lcom/stripe/android/uicore/text/MiddleEllipsisTextKt$MiddleEllipsisText$2$1$$ExternalSyntheticLambda0;-><init>(Lkotlin/jvm/internal/Ref$ObjectRef;)V

    .line 93
    iget-object v2, v0, Lcom/stripe/android/uicore/text/MiddleEllipsisTextKt$MiddleEllipsisText$2$1;->$style:Landroidx/compose/ui/text/TextStyle;

    const/16 v25, 0x0

    const/16 v26, 0x6802

    move/from16 v18, v3

    const/4 v3, 0x0

    move-wide/from16 v15, v16

    const/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v24, 0x0

    move-object/from16 v23, p1

    move-object/from16 v21, v1

    move-object/from16 v22, v2

    move-object/from16 v2, p2

    .line 80
    invoke-static/range {v2 .. v26}, Landroidx/compose/material/TextKt;->Text--4IGK_g(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_3
    return-void
.end method
