.class public final synthetic Lcom/stripe/android/uicore/elements/OTPElementUIKt$$ExternalSyntheticLambda3;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic f$0:Ljava/lang/String;

.field public final synthetic f$1:Lcom/stripe/android/uicore/elements/OTPElement;

.field public final synthetic f$2:I

.field public final synthetic f$3:Landroidx/compose/ui/focus/FocusManager;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Lcom/stripe/android/uicore/elements/OTPElement;ILandroidx/compose/ui/focus/FocusManager;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/uicore/elements/OTPElementUIKt$$ExternalSyntheticLambda3;->f$0:Ljava/lang/String;

    iput-object p2, p0, Lcom/stripe/android/uicore/elements/OTPElementUIKt$$ExternalSyntheticLambda3;->f$1:Lcom/stripe/android/uicore/elements/OTPElement;

    iput p3, p0, Lcom/stripe/android/uicore/elements/OTPElementUIKt$$ExternalSyntheticLambda3;->f$2:I

    iput-object p4, p0, Lcom/stripe/android/uicore/elements/OTPElementUIKt$$ExternalSyntheticLambda3;->f$3:Landroidx/compose/ui/focus/FocusManager;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 0
    iget-object v0, p0, Lcom/stripe/android/uicore/elements/OTPElementUIKt$$ExternalSyntheticLambda3;->f$0:Ljava/lang/String;

    iget-object v1, p0, Lcom/stripe/android/uicore/elements/OTPElementUIKt$$ExternalSyntheticLambda3;->f$1:Lcom/stripe/android/uicore/elements/OTPElement;

    iget v2, p0, Lcom/stripe/android/uicore/elements/OTPElementUIKt$$ExternalSyntheticLambda3;->f$2:I

    iget-object v3, p0, Lcom/stripe/android/uicore/elements/OTPElementUIKt$$ExternalSyntheticLambda3;->f$3:Landroidx/compose/ui/focus/FocusManager;

    check-cast p1, Landroidx/compose/ui/text/input/TextFieldValue;

    invoke-static {v0, v1, v2, v3, p1}, Lcom/stripe/android/uicore/elements/OTPElementUIKt;->$r8$lambda$1rluQgiokSyJ4wZxEfoS5LbF9v4(Ljava/lang/String;Lcom/stripe/android/uicore/elements/OTPElement;ILandroidx/compose/ui/focus/FocusManager;Landroidx/compose/ui/text/input/TextFieldValue;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
