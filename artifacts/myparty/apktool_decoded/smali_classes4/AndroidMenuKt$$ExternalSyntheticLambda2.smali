.class public final synthetic LAndroidMenuKt$$ExternalSyntheticLambda2;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic f$0:Z

.field public final synthetic f$1:I

.field public final synthetic f$2:Lkotlin/jvm/functions/Function0;

.field public final synthetic f$3:Landroidx/compose/ui/Modifier;

.field public final synthetic f$4:J

.field public final synthetic f$5:Landroidx/compose/ui/window/PopupProperties;

.field public final synthetic f$6:Lkotlin/jvm/functions/Function1;

.field public final synthetic f$7:I

.field public final synthetic f$8:I


# direct methods
.method public synthetic constructor <init>(ZILkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;JLandroidx/compose/ui/window/PopupProperties;Lkotlin/jvm/functions/Function1;II)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, LAndroidMenuKt$$ExternalSyntheticLambda2;->f$0:Z

    iput p2, p0, LAndroidMenuKt$$ExternalSyntheticLambda2;->f$1:I

    iput-object p3, p0, LAndroidMenuKt$$ExternalSyntheticLambda2;->f$2:Lkotlin/jvm/functions/Function0;

    iput-object p4, p0, LAndroidMenuKt$$ExternalSyntheticLambda2;->f$3:Landroidx/compose/ui/Modifier;

    iput-wide p5, p0, LAndroidMenuKt$$ExternalSyntheticLambda2;->f$4:J

    iput-object p7, p0, LAndroidMenuKt$$ExternalSyntheticLambda2;->f$5:Landroidx/compose/ui/window/PopupProperties;

    iput-object p8, p0, LAndroidMenuKt$$ExternalSyntheticLambda2;->f$6:Lkotlin/jvm/functions/Function1;

    iput p9, p0, LAndroidMenuKt$$ExternalSyntheticLambda2;->f$7:I

    iput p10, p0, LAndroidMenuKt$$ExternalSyntheticLambda2;->f$8:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 0
    iget-boolean v0, p0, LAndroidMenuKt$$ExternalSyntheticLambda2;->f$0:Z

    iget v1, p0, LAndroidMenuKt$$ExternalSyntheticLambda2;->f$1:I

    iget-object v2, p0, LAndroidMenuKt$$ExternalSyntheticLambda2;->f$2:Lkotlin/jvm/functions/Function0;

    iget-object v3, p0, LAndroidMenuKt$$ExternalSyntheticLambda2;->f$3:Landroidx/compose/ui/Modifier;

    iget-wide v4, p0, LAndroidMenuKt$$ExternalSyntheticLambda2;->f$4:J

    iget-object v6, p0, LAndroidMenuKt$$ExternalSyntheticLambda2;->f$5:Landroidx/compose/ui/window/PopupProperties;

    iget-object v7, p0, LAndroidMenuKt$$ExternalSyntheticLambda2;->f$6:Lkotlin/jvm/functions/Function1;

    iget v8, p0, LAndroidMenuKt$$ExternalSyntheticLambda2;->f$7:I

    iget v9, p0, LAndroidMenuKt$$ExternalSyntheticLambda2;->f$8:I

    move-object v10, p1

    check-cast v10, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v11

    invoke-static/range {v0 .. v11}, LAndroidMenuKt;->$r8$lambda$ojrntauvdJOaatAUZsGFyrgmcA0(ZILkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;JLandroidx/compose/ui/window/PopupProperties;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
