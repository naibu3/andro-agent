.class final Lcom/stripe/android/uicore/elements/OTPElementUIKt$OTPElementUI$2$1$1$textFieldModifier$2$1;
.super Ljava/lang/Object;
.source "OTPElementUI.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/uicore/elements/OTPElementUIKt$OTPElementUI$2$1$1;->invoke(Landroidx/compose/runtime/Composer;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlin/jvm/functions/Function1<",
        "Landroidx/compose/ui/input/key/KeyEvent;",
        "Ljava/lang/Boolean;",
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
.field final synthetic $element:Lcom/stripe/android/uicore/elements/OTPElement;

.field final synthetic $focusManager:Landroidx/compose/ui/focus/FocusManager;

.field final synthetic $index:I

.field final synthetic $value$delegate:Landroidx/compose/runtime/State;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/State<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(ILandroidx/compose/ui/focus/FocusManager;Lcom/stripe/android/uicore/elements/OTPElement;Landroidx/compose/runtime/State;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Landroidx/compose/ui/focus/FocusManager;",
            "Lcom/stripe/android/uicore/elements/OTPElement;",
            "Landroidx/compose/runtime/State<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    iput p1, p0, Lcom/stripe/android/uicore/elements/OTPElementUIKt$OTPElementUI$2$1$1$textFieldModifier$2$1;->$index:I

    iput-object p2, p0, Lcom/stripe/android/uicore/elements/OTPElementUIKt$OTPElementUI$2$1$1$textFieldModifier$2$1;->$focusManager:Landroidx/compose/ui/focus/FocusManager;

    iput-object p3, p0, Lcom/stripe/android/uicore/elements/OTPElementUIKt$OTPElementUI$2$1$1$textFieldModifier$2$1;->$element:Lcom/stripe/android/uicore/elements/OTPElement;

    iput-object p4, p0, Lcom/stripe/android/uicore/elements/OTPElementUIKt$OTPElementUI$2$1$1$textFieldModifier$2$1;->$value$delegate:Landroidx/compose/runtime/State;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 159
    check-cast p1, Landroidx/compose/ui/input/key/KeyEvent;

    invoke-virtual {p1}, Landroidx/compose/ui/input/key/KeyEvent;->unbox-impl()Landroid/view/KeyEvent;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/stripe/android/uicore/elements/OTPElementUIKt$OTPElementUI$2$1$1$textFieldModifier$2$1;->invoke-ZmokQxo(Landroid/view/KeyEvent;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public final invoke-ZmokQxo(Landroid/view/KeyEvent;)Ljava/lang/Boolean;
    .locals 3

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 160
    iget v0, p0, Lcom/stripe/android/uicore/elements/OTPElementUIKt$OTPElementUI$2$1$1$textFieldModifier$2$1;->$index:I

    if-eqz v0, :cond_0

    .line 161
    invoke-static {p1}, Landroidx/compose/ui/input/key/KeyEvent_androidKt;->getType-ZmokQxo(Landroid/view/KeyEvent;)I

    move-result v0

    sget-object v1, Landroidx/compose/ui/input/key/KeyEventType;->Companion:Landroidx/compose/ui/input/key/KeyEventType$Companion;

    invoke-virtual {v1}, Landroidx/compose/ui/input/key/KeyEventType$Companion;->getKeyDown-CS__XNY()I

    move-result v1

    invoke-static {v0, v1}, Landroidx/compose/ui/input/key/KeyEventType;->equals-impl0(II)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 162
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result p1

    const/16 v0, 0x43

    if-ne p1, v0, :cond_0

    .line 163
    iget-object p1, p0, Lcom/stripe/android/uicore/elements/OTPElementUIKt$OTPElementUI$2$1$1$textFieldModifier$2$1;->$value$delegate:Landroidx/compose/runtime/State;

    invoke-static {p1}, Lcom/stripe/android/uicore/elements/OTPElementUIKt$OTPElementUI$2$1$1;->access$invoke$lambda$0(Landroidx/compose/runtime/State;)Ljava/lang/String;

    move-result-object p1

    check-cast p1, Ljava/lang/CharSequence;

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p1

    if-nez p1, :cond_0

    .line 166
    iget-object p1, p0, Lcom/stripe/android/uicore/elements/OTPElementUIKt$OTPElementUI$2$1$1$textFieldModifier$2$1;->$focusManager:Landroidx/compose/ui/focus/FocusManager;

    sget-object v0, Landroidx/compose/ui/focus/FocusDirection;->Companion:Landroidx/compose/ui/focus/FocusDirection$Companion;

    invoke-virtual {v0}, Landroidx/compose/ui/focus/FocusDirection$Companion;->getPrevious-dhqQ-8s()I

    move-result v0

    invoke-static {p1, v0}, Lcom/stripe/android/uicore/FocusManagerKtKt;->moveFocusSafely-Mxy_nc0(Landroidx/compose/ui/focus/FocusManager;I)Z

    .line 167
    iget-object p1, p0, Lcom/stripe/android/uicore/elements/OTPElementUIKt$OTPElementUI$2$1$1$textFieldModifier$2$1;->$element:Lcom/stripe/android/uicore/elements/OTPElement;

    invoke-virtual {p1}, Lcom/stripe/android/uicore/elements/OTPElement;->getController()Lcom/stripe/android/uicore/elements/OTPController;

    move-result-object p1

    iget v0, p0, Lcom/stripe/android/uicore/elements/OTPElementUIKt$OTPElementUI$2$1$1$textFieldModifier$2$1;->$index:I

    const/4 v1, 0x1

    sub-int/2addr v0, v1

    const-string v2, ""

    invoke-virtual {p1, v0, v2}, Lcom/stripe/android/uicore/elements/OTPController;->onValueChanged(ILjava/lang/String;)I

    .line 168
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    .line 170
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
