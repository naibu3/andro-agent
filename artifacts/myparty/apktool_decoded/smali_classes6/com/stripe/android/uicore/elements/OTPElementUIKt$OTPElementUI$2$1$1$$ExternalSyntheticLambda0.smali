.class public final synthetic Lcom/stripe/android/uicore/elements/OTPElementUIKt$OTPElementUI$2$1$1$$ExternalSyntheticLambda0;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic f$0:I

.field public final synthetic f$1:Z

.field public final synthetic f$2:Landroidx/compose/runtime/MutableIntState;


# direct methods
.method public synthetic constructor <init>(IZLandroidx/compose/runtime/MutableIntState;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/stripe/android/uicore/elements/OTPElementUIKt$OTPElementUI$2$1$1$$ExternalSyntheticLambda0;->f$0:I

    iput-boolean p2, p0, Lcom/stripe/android/uicore/elements/OTPElementUIKt$OTPElementUI$2$1$1$$ExternalSyntheticLambda0;->f$1:Z

    iput-object p3, p0, Lcom/stripe/android/uicore/elements/OTPElementUIKt$OTPElementUI$2$1$1$$ExternalSyntheticLambda0;->f$2:Landroidx/compose/runtime/MutableIntState;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 0
    iget v0, p0, Lcom/stripe/android/uicore/elements/OTPElementUIKt$OTPElementUI$2$1$1$$ExternalSyntheticLambda0;->f$0:I

    iget-boolean v1, p0, Lcom/stripe/android/uicore/elements/OTPElementUIKt$OTPElementUI$2$1$1$$ExternalSyntheticLambda0;->f$1:Z

    iget-object v2, p0, Lcom/stripe/android/uicore/elements/OTPElementUIKt$OTPElementUI$2$1$1$$ExternalSyntheticLambda0;->f$2:Landroidx/compose/runtime/MutableIntState;

    check-cast p1, Landroidx/compose/ui/focus/FocusState;

    invoke-static {v0, v1, v2, p1}, Lcom/stripe/android/uicore/elements/OTPElementUIKt$OTPElementUI$2$1$1;->$r8$lambda$-_TNl_IR3pWPq5II93zPrpKE_Vc(IZLandroidx/compose/runtime/MutableIntState;Landroidx/compose/ui/focus/FocusState;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
