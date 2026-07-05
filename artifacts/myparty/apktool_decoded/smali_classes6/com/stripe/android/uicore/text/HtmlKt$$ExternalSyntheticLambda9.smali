.class public final synthetic Lcom/stripe/android/uicore/text/HtmlKt$$ExternalSyntheticLambda9;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic f$0:Ljava/lang/String;

.field public final synthetic f$1:Landroidx/compose/ui/Modifier;

.field public final synthetic f$10:I

.field public final synthetic f$2:Ljava/util/Map;

.field public final synthetic f$3:J

.field public final synthetic f$4:Landroidx/compose/ui/text/TextStyle;

.field public final synthetic f$5:Z

.field public final synthetic f$6:Landroidx/compose/ui/text/SpanStyle;

.field public final synthetic f$7:I

.field public final synthetic f$8:Lkotlin/jvm/functions/Function0;

.field public final synthetic f$9:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Landroidx/compose/ui/Modifier;Ljava/util/Map;JLandroidx/compose/ui/text/TextStyle;ZLandroidx/compose/ui/text/SpanStyle;ILkotlin/jvm/functions/Function0;II)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/uicore/text/HtmlKt$$ExternalSyntheticLambda9;->f$0:Ljava/lang/String;

    iput-object p2, p0, Lcom/stripe/android/uicore/text/HtmlKt$$ExternalSyntheticLambda9;->f$1:Landroidx/compose/ui/Modifier;

    iput-object p3, p0, Lcom/stripe/android/uicore/text/HtmlKt$$ExternalSyntheticLambda9;->f$2:Ljava/util/Map;

    iput-wide p4, p0, Lcom/stripe/android/uicore/text/HtmlKt$$ExternalSyntheticLambda9;->f$3:J

    iput-object p6, p0, Lcom/stripe/android/uicore/text/HtmlKt$$ExternalSyntheticLambda9;->f$4:Landroidx/compose/ui/text/TextStyle;

    iput-boolean p7, p0, Lcom/stripe/android/uicore/text/HtmlKt$$ExternalSyntheticLambda9;->f$5:Z

    iput-object p8, p0, Lcom/stripe/android/uicore/text/HtmlKt$$ExternalSyntheticLambda9;->f$6:Landroidx/compose/ui/text/SpanStyle;

    iput p9, p0, Lcom/stripe/android/uicore/text/HtmlKt$$ExternalSyntheticLambda9;->f$7:I

    iput-object p10, p0, Lcom/stripe/android/uicore/text/HtmlKt$$ExternalSyntheticLambda9;->f$8:Lkotlin/jvm/functions/Function0;

    iput p11, p0, Lcom/stripe/android/uicore/text/HtmlKt$$ExternalSyntheticLambda9;->f$9:I

    iput p12, p0, Lcom/stripe/android/uicore/text/HtmlKt$$ExternalSyntheticLambda9;->f$10:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 0
    iget-object v0, p0, Lcom/stripe/android/uicore/text/HtmlKt$$ExternalSyntheticLambda9;->f$0:Ljava/lang/String;

    iget-object v1, p0, Lcom/stripe/android/uicore/text/HtmlKt$$ExternalSyntheticLambda9;->f$1:Landroidx/compose/ui/Modifier;

    iget-object v2, p0, Lcom/stripe/android/uicore/text/HtmlKt$$ExternalSyntheticLambda9;->f$2:Ljava/util/Map;

    iget-wide v3, p0, Lcom/stripe/android/uicore/text/HtmlKt$$ExternalSyntheticLambda9;->f$3:J

    iget-object v5, p0, Lcom/stripe/android/uicore/text/HtmlKt$$ExternalSyntheticLambda9;->f$4:Landroidx/compose/ui/text/TextStyle;

    iget-boolean v6, p0, Lcom/stripe/android/uicore/text/HtmlKt$$ExternalSyntheticLambda9;->f$5:Z

    iget-object v7, p0, Lcom/stripe/android/uicore/text/HtmlKt$$ExternalSyntheticLambda9;->f$6:Landroidx/compose/ui/text/SpanStyle;

    iget v8, p0, Lcom/stripe/android/uicore/text/HtmlKt$$ExternalSyntheticLambda9;->f$7:I

    iget-object v9, p0, Lcom/stripe/android/uicore/text/HtmlKt$$ExternalSyntheticLambda9;->f$8:Lkotlin/jvm/functions/Function0;

    iget v10, p0, Lcom/stripe/android/uicore/text/HtmlKt$$ExternalSyntheticLambda9;->f$9:I

    iget v11, p0, Lcom/stripe/android/uicore/text/HtmlKt$$ExternalSyntheticLambda9;->f$10:I

    move-object v12, p1

    check-cast v12, Landroidx/compose/runtime/Composer;

    move-object/from16 p1, p2

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v13

    invoke-static/range {v0 .. v13}, Lcom/stripe/android/uicore/text/HtmlKt;->$r8$lambda$sVO6jswjeskYjDqiQHVRzBFomlk(Ljava/lang/String;Landroidx/compose/ui/Modifier;Ljava/util/Map;JLandroidx/compose/ui/text/TextStyle;ZLandroidx/compose/ui/text/SpanStyle;ILkotlin/jvm/functions/Function0;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
