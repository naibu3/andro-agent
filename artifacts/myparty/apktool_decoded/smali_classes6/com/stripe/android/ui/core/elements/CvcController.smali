.class public final Lcom/stripe/android/ui/core/elements/CvcController;
.super Ljava/lang/Object;
.source "CvcController.kt"

# interfaces
.implements Lcom/stripe/android/uicore/elements/TextFieldController;


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nCvcController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CvcController.kt\ncom/stripe/android/ui/core/elements/CvcController\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,126:1\n1#2:127\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u0001B5\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0012\u0010H\u001a\u0004\u0018\u0001062\u0006\u0010I\u001a\u00020\u0008H\u0016J\u0010\u0010J\u001a\u00020K2\u0006\u0010L\u001a\u00020\u0008H\u0016J\u0010\u0010M\u001a\u00020K2\u0006\u0010N\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u0008X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000eR\u0014\u0010\t\u001a\u00020\nX\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u0010R\u0016\u0010\u0011\u001a\u00020\u0012X\u0096\u0004\u00a2\u0006\n\n\u0002\u0010\u0015\u001a\u0004\u0008\u0013\u0010\u0014R\u0016\u0010\u0016\u001a\u00020\u0017X\u0096\u0004\u00a2\u0006\n\n\u0002\u0010\u0015\u001a\u0004\u0008\u0018\u0010\u0014R\u0014\u0010\u0019\u001a\u0008\u0012\u0004\u0012\u00020\u001a0\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u001b\u001a\u0008\u0012\u0004\u0012\u00020\u001a0\u0005X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u0008X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001f\u0010\u000eR\u0014\u0010 \u001a\u00020!X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\"\u0010#R\u001a\u0010$\u001a\u00020%X\u0096\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008&\u0010\'\u001a\u0004\u0008(\u0010)R\u0014\u0010*\u001a\u0008\u0012\u0004\u0012\u00020\u00080+X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010,\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0005X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008-\u0010\u001dR\u001a\u0010.\u001a\u0008\u0012\u0004\u0012\u00020/0\u0005X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00080\u0010\u001dR\u001a\u00101\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0005X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00082\u0010\u001dR\u001a\u00103\u001a\u0008\u0012\u0004\u0012\u00020\u001a0\u0005X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00084\u0010\u001dR\u0014\u00105\u001a\u0008\u0012\u0004\u0012\u0002060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u00107\u001a\u0008\u0012\u0004\u0012\u0002060\u0005X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00088\u0010\u001dR\u0014\u00109\u001a\u0008\u0012\u0004\u0012\u00020\n0+X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010:\u001a\u0008\u0012\u0004\u0012\u00020\n0\u0005X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008;\u0010\u001dR\u001c\u0010<\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010=0\u0005X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008>\u0010\u001dR\u001a\u0010?\u001a\u0008\u0012\u0004\u0012\u00020\n0\u0005X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008?\u0010\u001dR\u001a\u0010@\u001a\u0008\u0012\u0004\u0012\u00020A0\u0005X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008B\u0010\u001dR\u001c\u0010C\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010D0\u0005X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008E\u0010\u001dR\u001a\u0010F\u001a\u0008\u0012\u0004\u0012\u00020\n0\u0005X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008G\u0010\u001d\u00a8\u0006O"
    }
    d2 = {
        "Lcom/stripe/android/ui/core/elements/CvcController;",
        "Lcom/stripe/android/uicore/elements/TextFieldController;",
        "cvcTextFieldConfig",
        "Lcom/stripe/android/ui/core/elements/CvcConfig;",
        "cardBrandFlow",
        "Lkotlinx/coroutines/flow/StateFlow;",
        "Lcom/stripe/android/model/CardBrand;",
        "initialValue",
        "",
        "showOptionalLabel",
        "",
        "<init>",
        "(Lcom/stripe/android/ui/core/elements/CvcConfig;Lkotlinx/coroutines/flow/StateFlow;Ljava/lang/String;Z)V",
        "getInitialValue",
        "()Ljava/lang/String;",
        "getShowOptionalLabel",
        "()Z",
        "capitalization",
        "Landroidx/compose/ui/text/input/KeyboardCapitalization;",
        "getCapitalization-IUNYP9k",
        "()I",
        "I",
        "keyboardType",
        "Landroidx/compose/ui/text/input/KeyboardType;",
        "getKeyboardType-PjHm6EE",
        "_label",
        "Lcom/stripe/android/core/strings/ResolvableString;",
        "label",
        "getLabel",
        "()Lkotlinx/coroutines/flow/StateFlow;",
        "debugLabel",
        "getDebugLabel",
        "layoutDirection",
        "Landroidx/compose/ui/unit/LayoutDirection;",
        "getLayoutDirection",
        "()Landroidx/compose/ui/unit/LayoutDirection;",
        "autofillType",
        "Landroidx/compose/ui/autofill/AutofillType;",
        "getAutofillType$annotations",
        "()V",
        "getAutofillType",
        "()Landroidx/compose/ui/autofill/AutofillType;",
        "_fieldValue",
        "Lkotlinx/coroutines/flow/MutableStateFlow;",
        "fieldValue",
        "getFieldValue",
        "visualTransformation",
        "Landroidx/compose/ui/text/input/VisualTransformation;",
        "getVisualTransformation",
        "rawFieldValue",
        "getRawFieldValue",
        "contentDescription",
        "getContentDescription",
        "_fieldState",
        "Lcom/stripe/android/uicore/elements/TextFieldState;",
        "fieldState",
        "getFieldState",
        "_hasFocus",
        "visibleError",
        "getVisibleError",
        "error",
        "Lcom/stripe/android/uicore/elements/FieldError;",
        "getError",
        "isComplete",
        "formFieldValue",
        "Lcom/stripe/android/uicore/forms/FormFieldEntry;",
        "getFormFieldValue",
        "trailingIcon",
        "Lcom/stripe/android/uicore/elements/TextFieldIcon;",
        "getTrailingIcon",
        "loading",
        "getLoading",
        "onValueChange",
        "displayFormatted",
        "onRawValueChange",
        "",
        "rawValue",
        "onFocusChange",
        "newHasFocus",
        "payments-ui-core_release"
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
.field private final _fieldState:Lkotlinx/coroutines/flow/StateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Lcom/stripe/android/uicore/elements/TextFieldState;",
            ">;"
        }
    .end annotation
.end field

.field private final _fieldValue:Lkotlinx/coroutines/flow/MutableStateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/MutableStateFlow<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final _hasFocus:Lkotlinx/coroutines/flow/MutableStateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/MutableStateFlow<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final _label:Lkotlinx/coroutines/flow/StateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Lcom/stripe/android/core/strings/ResolvableString;",
            ">;"
        }
    .end annotation
.end field

.field private final autofillType:Landroidx/compose/ui/autofill/AutofillType;

.field private final capitalization:I

.field private final contentDescription:Lkotlinx/coroutines/flow/StateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Lcom/stripe/android/core/strings/ResolvableString;",
            ">;"
        }
    .end annotation
.end field

.field private final cvcTextFieldConfig:Lcom/stripe/android/ui/core/elements/CvcConfig;

.field private final debugLabel:Ljava/lang/String;

.field private final error:Lkotlinx/coroutines/flow/StateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Lcom/stripe/android/uicore/elements/FieldError;",
            ">;"
        }
    .end annotation
.end field

.field private final fieldState:Lkotlinx/coroutines/flow/StateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Lcom/stripe/android/uicore/elements/TextFieldState;",
            ">;"
        }
    .end annotation
.end field

.field private final fieldValue:Lkotlinx/coroutines/flow/StateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final formFieldValue:Lkotlinx/coroutines/flow/StateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Lcom/stripe/android/uicore/forms/FormFieldEntry;",
            ">;"
        }
    .end annotation
.end field

.field private final initialValue:Ljava/lang/String;

.field private final isComplete:Lkotlinx/coroutines/flow/StateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final keyboardType:I

.field private final label:Lkotlinx/coroutines/flow/StateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Lcom/stripe/android/core/strings/ResolvableString;",
            ">;"
        }
    .end annotation
.end field

.field private final layoutDirection:Landroidx/compose/ui/unit/LayoutDirection;

.field private final loading:Lkotlinx/coroutines/flow/StateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final rawFieldValue:Lkotlinx/coroutines/flow/StateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final showOptionalLabel:Z

.field private final trailingIcon:Lkotlinx/coroutines/flow/StateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Lcom/stripe/android/uicore/elements/TextFieldIcon;",
            ">;"
        }
    .end annotation
.end field

.field private final visibleError:Lkotlinx/coroutines/flow/StateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final visualTransformation:Lkotlinx/coroutines/flow/StateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Landroidx/compose/ui/text/input/VisualTransformation;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static synthetic $r8$lambda$1MnhiWAfRprVo4fY2_Di1fRg1OA(Lcom/stripe/android/ui/core/elements/CvcController;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/ui/core/elements/CvcController;->rawFieldValue$lambda$2(Lcom/stripe/android/ui/core/elements/CvcController;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$7ZjdhsjPCtsD3iyCNtNVlhim5sM(ZLjava/lang/String;)Lcom/stripe/android/uicore/forms/FormFieldEntry;
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/ui/core/elements/CvcController;->formFieldValue$lambda$9(ZLjava/lang/String;)Lcom/stripe/android/uicore/forms/FormFieldEntry;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$KpmJAXWfMDlFBzwMcRxZ1-dkP04(Lcom/stripe/android/uicore/elements/TextFieldState;Z)Z
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/ui/core/elements/CvcController;->visibleError$lambda$5(Lcom/stripe/android/uicore/elements/TextFieldState;Z)Z

    move-result p0

    return p0
.end method

.method public static synthetic $r8$lambda$P95uYRJuOG9wVXpBY1JU2ZOxpWc(Lcom/stripe/android/model/CardBrand;)Lcom/stripe/android/uicore/elements/TextFieldIcon$Trailing;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/ui/core/elements/CvcController;->trailingIcon$lambda$10(Lcom/stripe/android/model/CardBrand;)Lcom/stripe/android/uicore/elements/TextFieldIcon$Trailing;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$X7_R2ktr_R1xOQf9-aMkHeUYSUw(ZLcom/stripe/android/uicore/elements/TextFieldState;)Lcom/stripe/android/uicore/elements/FieldError;
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/ui/core/elements/CvcController;->error$lambda$7(ZLcom/stripe/android/uicore/elements/TextFieldState;)Lcom/stripe/android/uicore/elements/FieldError;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$ZO-IQKvvuOQR4qua8QsKnoptUwE(Ljava/lang/String;)Lcom/stripe/android/core/strings/ResolvableString;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/ui/core/elements/CvcController;->contentDescription$lambda$3(Ljava/lang/String;)Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$lZ_1vfiNdiZ8nR35XQx-uaOUe1A(Lcom/stripe/android/model/CardBrand;)Lcom/stripe/android/core/strings/ResolvableString;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/ui/core/elements/CvcController;->_label$lambda$0(Lcom/stripe/android/model/CardBrand;)Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$ptBb3dBa7LvQAae8V2E2fjUnRSc(Lcom/stripe/android/uicore/elements/TextFieldState;)Z
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/ui/core/elements/CvcController;->isComplete$lambda$8(Lcom/stripe/android/uicore/elements/TextFieldState;)Z

    move-result p0

    return p0
.end method

.method public static synthetic $r8$lambda$qkBgEeLdSeQQVZv0aY8hYNKefFs(Lcom/stripe/android/ui/core/elements/CvcController;Ljava/lang/String;)Landroidx/compose/ui/text/input/VisualTransformation;
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/ui/core/elements/CvcController;->visualTransformation$lambda$1(Lcom/stripe/android/ui/core/elements/CvcController;Ljava/lang/String;)Landroidx/compose/ui/text/input/VisualTransformation;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$zKQE7GEwYBl6HCslipw8EbRGc3E(Lcom/stripe/android/ui/core/elements/CvcController;Lcom/stripe/android/model/CardBrand;Ljava/lang/String;)Lcom/stripe/android/uicore/elements/TextFieldState;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/stripe/android/ui/core/elements/CvcController;->_fieldState$lambda$4(Lcom/stripe/android/ui/core/elements/CvcController;Lcom/stripe/android/model/CardBrand;Ljava/lang/String;)Lcom/stripe/android/uicore/elements/TextFieldState;

    move-result-object p0

    return-object p0
.end method

.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/ui/core/elements/CvcConfig;Lkotlinx/coroutines/flow/StateFlow;Ljava/lang/String;Z)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/ui/core/elements/CvcConfig;",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "+",
            "Lcom/stripe/android/model/CardBrand;",
            ">;",
            "Ljava/lang/String;",
            "Z)V"
        }
    .end annotation

    const-string v0, "cvcTextFieldConfig"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cardBrandFlow"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    iput-object p1, p0, Lcom/stripe/android/ui/core/elements/CvcController;->cvcTextFieldConfig:Lcom/stripe/android/ui/core/elements/CvcConfig;

    .line 30
    iput-object p3, p0, Lcom/stripe/android/ui/core/elements/CvcController;->initialValue:Ljava/lang/String;

    .line 31
    iput-boolean p4, p0, Lcom/stripe/android/ui/core/elements/CvcController;->showOptionalLabel:Z

    .line 33
    invoke-virtual {p1}, Lcom/stripe/android/ui/core/elements/CvcConfig;->getCapitalization-IUNYP9k()I

    move-result p3

    iput p3, p0, Lcom/stripe/android/ui/core/elements/CvcController;->capitalization:I

    .line 34
    invoke-virtual {p1}, Lcom/stripe/android/ui/core/elements/CvcConfig;->getKeyboard-PjHm6EE()I

    move-result p3

    iput p3, p0, Lcom/stripe/android/ui/core/elements/CvcController;->keyboardType:I

    .line 36
    new-instance p3, Lcom/stripe/android/ui/core/elements/CvcController$$ExternalSyntheticLambda0;

    invoke-direct {p3}, Lcom/stripe/android/ui/core/elements/CvcController$$ExternalSyntheticLambda0;-><init>()V

    invoke-static {p2, p3}, Lcom/stripe/android/uicore/utils/StateFlowsKt;->mapAsStateFlow(Lkotlinx/coroutines/flow/StateFlow;Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/flow/StateFlow;

    move-result-object p3

    iput-object p3, p0, Lcom/stripe/android/ui/core/elements/CvcController;->_label:Lkotlinx/coroutines/flow/StateFlow;

    .line 45
    iput-object p3, p0, Lcom/stripe/android/ui/core/elements/CvcController;->label:Lkotlinx/coroutines/flow/StateFlow;

    .line 47
    invoke-virtual {p1}, Lcom/stripe/android/ui/core/elements/CvcConfig;->getDebugLabel()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/ui/core/elements/CvcController;->debugLabel:Ljava/lang/String;

    .line 49
    sget-object p1, Landroidx/compose/ui/unit/LayoutDirection;->Ltr:Landroidx/compose/ui/unit/LayoutDirection;

    iput-object p1, p0, Lcom/stripe/android/ui/core/elements/CvcController;->layoutDirection:Landroidx/compose/ui/unit/LayoutDirection;

    .line 52
    sget-object p1, Landroidx/compose/ui/autofill/AutofillType;->CreditCardSecurityCode:Landroidx/compose/ui/autofill/AutofillType;

    iput-object p1, p0, Lcom/stripe/android/ui/core/elements/CvcController;->autofillType:Landroidx/compose/ui/autofill/AutofillType;

    .line 54
    const-string p1, ""

    invoke-static {p1}, Lkotlinx/coroutines/flow/StateFlowKt;->MutableStateFlow(Ljava/lang/Object;)Lkotlinx/coroutines/flow/MutableStateFlow;

    move-result-object p3

    iput-object p3, p0, Lcom/stripe/android/ui/core/elements/CvcController;->_fieldValue:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 55
    invoke-static {p3}, Lkotlinx/coroutines/flow/FlowKt;->asStateFlow(Lkotlinx/coroutines/flow/MutableStateFlow;)Lkotlinx/coroutines/flow/StateFlow;

    move-result-object p4

    iput-object p4, p0, Lcom/stripe/android/ui/core/elements/CvcController;->fieldValue:Lkotlinx/coroutines/flow/StateFlow;

    .line 57
    move-object p4, p3

    check-cast p4, Lkotlinx/coroutines/flow/StateFlow;

    new-instance v0, Lcom/stripe/android/ui/core/elements/CvcController$$ExternalSyntheticLambda1;

    invoke-direct {v0, p0}, Lcom/stripe/android/ui/core/elements/CvcController$$ExternalSyntheticLambda1;-><init>(Lcom/stripe/android/ui/core/elements/CvcController;)V

    invoke-static {p4, v0}, Lcom/stripe/android/uicore/utils/StateFlowsKt;->mapAsStateFlow(Lkotlinx/coroutines/flow/StateFlow;Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/flow/StateFlow;

    move-result-object p4

    iput-object p4, p0, Lcom/stripe/android/ui/core/elements/CvcController;->visualTransformation:Lkotlinx/coroutines/flow/StateFlow;

    .line 62
    move-object p4, p3

    check-cast p4, Lkotlinx/coroutines/flow/StateFlow;

    new-instance v0, Lcom/stripe/android/ui/core/elements/CvcController$$ExternalSyntheticLambda2;

    invoke-direct {v0, p0}, Lcom/stripe/android/ui/core/elements/CvcController$$ExternalSyntheticLambda2;-><init>(Lcom/stripe/android/ui/core/elements/CvcController;)V

    invoke-static {p4, v0}, Lcom/stripe/android/uicore/utils/StateFlowsKt;->mapAsStateFlow(Lkotlinx/coroutines/flow/StateFlow;Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/flow/StateFlow;

    move-result-object p4

    iput-object p4, p0, Lcom/stripe/android/ui/core/elements/CvcController;->rawFieldValue:Lkotlinx/coroutines/flow/StateFlow;

    .line 65
    move-object p4, p3

    check-cast p4, Lkotlinx/coroutines/flow/StateFlow;

    new-instance v0, Lcom/stripe/android/ui/core/elements/CvcController$$ExternalSyntheticLambda3;

    invoke-direct {v0}, Lcom/stripe/android/ui/core/elements/CvcController$$ExternalSyntheticLambda3;-><init>()V

    invoke-static {p4, v0}, Lcom/stripe/android/uicore/utils/StateFlowsKt;->mapAsStateFlow(Lkotlinx/coroutines/flow/StateFlow;Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/flow/StateFlow;

    move-result-object p4

    iput-object p4, p0, Lcom/stripe/android/ui/core/elements/CvcController;->contentDescription:Lkotlinx/coroutines/flow/StateFlow;

    .line 69
    check-cast p3, Lkotlinx/coroutines/flow/StateFlow;

    new-instance p4, Lcom/stripe/android/ui/core/elements/CvcController$$ExternalSyntheticLambda4;

    invoke-direct {p4, p0}, Lcom/stripe/android/ui/core/elements/CvcController$$ExternalSyntheticLambda4;-><init>(Lcom/stripe/android/ui/core/elements/CvcController;)V

    invoke-static {p2, p3, p4}, Lcom/stripe/android/uicore/utils/StateFlowsKt;->combineAsStateFlow(Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/flow/StateFlow;

    move-result-object p3

    iput-object p3, p0, Lcom/stripe/android/ui/core/elements/CvcController;->_fieldState:Lkotlinx/coroutines/flow/StateFlow;

    .line 72
    iput-object p3, p0, Lcom/stripe/android/ui/core/elements/CvcController;->fieldState:Lkotlinx/coroutines/flow/StateFlow;

    const/4 p4, 0x0

    .line 74
    invoke-static {p4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p4

    invoke-static {p4}, Lkotlinx/coroutines/flow/StateFlowKt;->MutableStateFlow(Ljava/lang/Object;)Lkotlinx/coroutines/flow/MutableStateFlow;

    move-result-object v0

    iput-object v0, p0, Lcom/stripe/android/ui/core/elements/CvcController;->_hasFocus:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 77
    check-cast v0, Lkotlinx/coroutines/flow/StateFlow;

    new-instance v1, Lcom/stripe/android/ui/core/elements/CvcController$$ExternalSyntheticLambda5;

    invoke-direct {v1}, Lcom/stripe/android/ui/core/elements/CvcController$$ExternalSyntheticLambda5;-><init>()V

    invoke-static {p3, v0, v1}, Lcom/stripe/android/uicore/utils/StateFlowsKt;->combineAsStateFlow(Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v0

    iput-object v0, p0, Lcom/stripe/android/ui/core/elements/CvcController;->visibleError:Lkotlinx/coroutines/flow/StateFlow;

    .line 85
    invoke-virtual {p0}, Lcom/stripe/android/ui/core/elements/CvcController;->getVisibleError()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v0

    new-instance v1, Lcom/stripe/android/ui/core/elements/CvcController$$ExternalSyntheticLambda6;

    invoke-direct {v1}, Lcom/stripe/android/ui/core/elements/CvcController$$ExternalSyntheticLambda6;-><init>()V

    invoke-static {v0, p3, v1}, Lcom/stripe/android/uicore/utils/StateFlowsKt;->combineAsStateFlow(Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v0

    iput-object v0, p0, Lcom/stripe/android/ui/core/elements/CvcController;->error:Lkotlinx/coroutines/flow/StateFlow;

    .line 89
    new-instance v0, Lcom/stripe/android/ui/core/elements/CvcController$$ExternalSyntheticLambda7;

    invoke-direct {v0}, Lcom/stripe/android/ui/core/elements/CvcController$$ExternalSyntheticLambda7;-><init>()V

    invoke-static {p3, v0}, Lcom/stripe/android/uicore/utils/StateFlowsKt;->mapAsStateFlow(Lkotlinx/coroutines/flow/StateFlow;Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/flow/StateFlow;

    move-result-object p3

    iput-object p3, p0, Lcom/stripe/android/ui/core/elements/CvcController;->isComplete:Lkotlinx/coroutines/flow/StateFlow;

    .line 92
    invoke-virtual {p0}, Lcom/stripe/android/ui/core/elements/CvcController;->isComplete()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object p3

    invoke-virtual {p0}, Lcom/stripe/android/ui/core/elements/CvcController;->getRawFieldValue()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v0

    new-instance v1, Lcom/stripe/android/ui/core/elements/CvcController$$ExternalSyntheticLambda8;

    invoke-direct {v1}, Lcom/stripe/android/ui/core/elements/CvcController$$ExternalSyntheticLambda8;-><init>()V

    invoke-static {p3, v0, v1}, Lcom/stripe/android/uicore/utils/StateFlowsKt;->combineAsStateFlow(Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/flow/StateFlow;

    move-result-object p3

    iput-object p3, p0, Lcom/stripe/android/ui/core/elements/CvcController;->formFieldValue:Lkotlinx/coroutines/flow/StateFlow;

    .line 96
    new-instance p3, Lcom/stripe/android/ui/core/elements/CvcController$$ExternalSyntheticLambda9;

    invoke-direct {p3}, Lcom/stripe/android/ui/core/elements/CvcController$$ExternalSyntheticLambda9;-><init>()V

    invoke-static {p2, p3}, Lcom/stripe/android/uicore/utils/StateFlowsKt;->mapAsStateFlow(Lkotlinx/coroutines/flow/StateFlow;Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/flow/StateFlow;

    move-result-object p2

    iput-object p2, p0, Lcom/stripe/android/ui/core/elements/CvcController;->trailingIcon:Lkotlinx/coroutines/flow/StateFlow;

    .line 100
    invoke-static {p4}, Lcom/stripe/android/uicore/utils/StateFlowsKt;->stateFlowOf(Ljava/lang/Object;)Lkotlinx/coroutines/flow/StateFlow;

    move-result-object p2

    iput-object p2, p0, Lcom/stripe/android/ui/core/elements/CvcController;->loading:Lkotlinx/coroutines/flow/StateFlow;

    .line 103
    invoke-virtual {p0}, Lcom/stripe/android/ui/core/elements/CvcController;->getInitialValue()Ljava/lang/String;

    move-result-object p2

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    move-object p1, p2

    :goto_0
    invoke-virtual {p0, p1}, Lcom/stripe/android/ui/core/elements/CvcController;->onRawValueChange(Ljava/lang/String;)V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/stripe/android/ui/core/elements/CvcConfig;Lkotlinx/coroutines/flow/StateFlow;Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    .line 28
    new-instance p1, Lcom/stripe/android/ui/core/elements/CvcConfig;

    invoke-direct {p1}, Lcom/stripe/android/ui/core/elements/CvcConfig;-><init>()V

    :cond_0
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_1

    const/4 p3, 0x0

    :cond_1
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_2

    const/4 p4, 0x0

    .line 27
    :cond_2
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/stripe/android/ui/core/elements/CvcController;-><init>(Lcom/stripe/android/ui/core/elements/CvcConfig;Lkotlinx/coroutines/flow/StateFlow;Ljava/lang/String;Z)V

    return-void
.end method

.method private static final _fieldState$lambda$4(Lcom/stripe/android/ui/core/elements/CvcController;Lcom/stripe/android/model/CardBrand;Ljava/lang/String;)Lcom/stripe/android/uicore/elements/TextFieldState;
    .locals 1

    const-string v0, "brand"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fieldValue"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 70
    iget-object p0, p0, Lcom/stripe/android/ui/core/elements/CvcController;->cvcTextFieldConfig:Lcom/stripe/android/ui/core/elements/CvcConfig;

    invoke-virtual {p1}, Lcom/stripe/android/model/CardBrand;->getMaxCvcLength()I

    move-result v0

    invoke-virtual {p0, p1, p2, v0}, Lcom/stripe/android/ui/core/elements/CvcConfig;->determineState(Lcom/stripe/android/model/CardBrand;Ljava/lang/String;I)Lcom/stripe/android/uicore/elements/TextFieldState;

    move-result-object p0

    return-object p0
.end method

.method private static final _label$lambda$0(Lcom/stripe/android/model/CardBrand;)Lcom/stripe/android/core/strings/ResolvableString;
    .locals 3

    const-string v0, "cardBrand"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 37
    sget-object v0, Lcom/stripe/android/model/CardBrand;->AmericanExpress:Lcom/stripe/android/model/CardBrand;

    if-ne p0, v0, :cond_0

    .line 38
    sget p0, Lcom/stripe/android/R$string;->stripe_cvc_amex_hint:I

    goto :goto_0

    .line 40
    :cond_0
    sget p0, Lcom/stripe/android/R$string;->stripe_cvc_number_hint:I

    :goto_0
    const/4 v0, 0x0

    .line 43
    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x4

    const/4 v2, 0x0

    invoke-static {p0, v0, v2, v1, v2}, Lcom/stripe/android/core/strings/ResolvableStringUtilsKt;->resolvableString$default(I[Ljava/lang/Object;Ljava/util/List;ILjava/lang/Object;)Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object p0

    return-object p0
.end method

.method private static final contentDescription$lambda$3(Ljava/lang/String;)Lcom/stripe/android/core/strings/ResolvableString;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 66
    invoke-static {p0}, Lcom/stripe/android/uicore/utils/AccessibilityKt;->asIndividualDigits(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/stripe/android/core/strings/ResolvableStringUtilsKt;->getResolvableString(Ljava/lang/String;)Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object p0

    return-object p0
.end method

.method private static final error$lambda$7(ZLcom/stripe/android/uicore/elements/TextFieldState;)Lcom/stripe/android/uicore/elements/FieldError;
    .locals 1

    const-string v0, "fieldState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 86
    invoke-interface {p1}, Lcom/stripe/android/uicore/elements/TextFieldState;->getError()Lcom/stripe/android/uicore/elements/FieldError;

    move-result-object p1

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    if-eqz p0, :cond_0

    return-object p1

    :cond_0
    return-object v0
.end method

.method private static final formFieldValue$lambda$9(ZLjava/lang/String;)Lcom/stripe/android/uicore/forms/FormFieldEntry;
    .locals 1

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 93
    new-instance v0, Lcom/stripe/android/uicore/forms/FormFieldEntry;

    invoke-direct {v0, p1, p0}, Lcom/stripe/android/uicore/forms/FormFieldEntry;-><init>(Ljava/lang/String;Z)V

    return-object v0
.end method

.method public static synthetic getAutofillType$annotations()V
    .locals 0

    return-void
.end method

.method private static final isComplete$lambda$8(Lcom/stripe/android/uicore/elements/TextFieldState;)Z
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 89
    invoke-interface {p0}, Lcom/stripe/android/uicore/elements/TextFieldState;->isValid()Z

    move-result p0

    return p0
.end method

.method private static final rawFieldValue$lambda$2(Lcom/stripe/android/ui/core/elements/CvcController;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 62
    iget-object p0, p0, Lcom/stripe/android/ui/core/elements/CvcController;->cvcTextFieldConfig:Lcom/stripe/android/ui/core/elements/CvcConfig;

    invoke-virtual {p0, p1}, Lcom/stripe/android/ui/core/elements/CvcConfig;->convertToRaw(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static final trailingIcon$lambda$10(Lcom/stripe/android/model/CardBrand;)Lcom/stripe/android/uicore/elements/TextFieldIcon$Trailing;
    .locals 8

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 97
    new-instance v1, Lcom/stripe/android/uicore/elements/TextFieldIcon$Trailing;

    invoke-virtual {p0}, Lcom/stripe/android/model/CardBrand;->getCvcIcon()I

    move-result v2

    const/16 v6, 0xa

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v1 .. v7}, Lcom/stripe/android/uicore/elements/TextFieldIcon$Trailing;-><init>(ILjava/lang/Integer;ZLkotlin/jvm/functions/Function0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method private static final visibleError$lambda$5(Lcom/stripe/android/uicore/elements/TextFieldState;Z)Z
    .locals 1

    const-string v0, "fieldState"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 78
    invoke-interface {p0, p1}, Lcom/stripe/android/uicore/elements/TextFieldState;->shouldShowError(Z)Z

    move-result p0

    return p0
.end method

.method private static final visualTransformation$lambda$1(Lcom/stripe/android/ui/core/elements/CvcController;Ljava/lang/String;)Landroidx/compose/ui/text/input/VisualTransformation;
    .locals 1

    const-string v0, "number"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 58
    iget-object p0, p0, Lcom/stripe/android/ui/core/elements/CvcController;->cvcTextFieldConfig:Lcom/stripe/android/ui/core/elements/CvcConfig;

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/stripe/android/ui/core/elements/CvcConfig;->determineVisualTransformation(Ljava/lang/String;I)Landroidx/compose/ui/text/input/VisualTransformation;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public ComposeUI(ZLcom/stripe/android/uicore/elements/SectionFieldElement;Landroidx/compose/ui/Modifier;Ljava/util/Set;Lcom/stripe/android/uicore/elements/IdentifierSpec;Landroidx/compose/runtime/Composer;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lcom/stripe/android/uicore/elements/SectionFieldElement;",
            "Landroidx/compose/ui/Modifier;",
            "Ljava/util/Set<",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
            ">;",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    .line 26
    invoke-static/range {p0 .. p7}, Lcom/stripe/android/uicore/elements/TextFieldController$DefaultImpls;->ComposeUI(Lcom/stripe/android/uicore/elements/TextFieldController;ZLcom/stripe/android/uicore/elements/SectionFieldElement;Landroidx/compose/ui/Modifier;Ljava/util/Set;Lcom/stripe/android/uicore/elements/IdentifierSpec;Landroidx/compose/runtime/Composer;I)V

    return-void
.end method

.method public getAutofillType()Landroidx/compose/ui/autofill/AutofillType;
    .locals 1

    .line 51
    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/CvcController;->autofillType:Landroidx/compose/ui/autofill/AutofillType;

    return-object v0
.end method

.method public getCapitalization-IUNYP9k()I
    .locals 1

    .line 33
    iget v0, p0, Lcom/stripe/android/ui/core/elements/CvcController;->capitalization:I

    return v0
.end method

.method public getContentDescription()Lkotlinx/coroutines/flow/StateFlow;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Lcom/stripe/android/core/strings/ResolvableString;",
            ">;"
        }
    .end annotation

    .line 65
    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/CvcController;->contentDescription:Lkotlinx/coroutines/flow/StateFlow;

    return-object v0
.end method

.method public getDebugLabel()Ljava/lang/String;
    .locals 1

    .line 47
    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/CvcController;->debugLabel:Ljava/lang/String;

    return-object v0
.end method

.method public getEnabled()Z
    .locals 1

    .line 26
    invoke-static {p0}, Lcom/stripe/android/uicore/elements/TextFieldController$DefaultImpls;->getEnabled(Lcom/stripe/android/uicore/elements/TextFieldController;)Z

    move-result v0

    return v0
.end method

.method public getError()Lkotlinx/coroutines/flow/StateFlow;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Lcom/stripe/android/uicore/elements/FieldError;",
            ">;"
        }
    .end annotation

    .line 84
    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/CvcController;->error:Lkotlinx/coroutines/flow/StateFlow;

    return-object v0
.end method

.method public getFieldState()Lkotlinx/coroutines/flow/StateFlow;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Lcom/stripe/android/uicore/elements/TextFieldState;",
            ">;"
        }
    .end annotation

    .line 72
    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/CvcController;->fieldState:Lkotlinx/coroutines/flow/StateFlow;

    return-object v0
.end method

.method public getFieldValue()Lkotlinx/coroutines/flow/StateFlow;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 55
    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/CvcController;->fieldValue:Lkotlinx/coroutines/flow/StateFlow;

    return-object v0
.end method

.method public getFormFieldValue()Lkotlinx/coroutines/flow/StateFlow;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Lcom/stripe/android/uicore/forms/FormFieldEntry;",
            ">;"
        }
    .end annotation

    .line 91
    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/CvcController;->formFieldValue:Lkotlinx/coroutines/flow/StateFlow;

    return-object v0
.end method

.method public getInitialValue()Ljava/lang/String;
    .locals 1

    .line 30
    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/CvcController;->initialValue:Ljava/lang/String;

    return-object v0
.end method

.method public getKeyboardType-PjHm6EE()I
    .locals 1

    .line 34
    iget v0, p0, Lcom/stripe/android/ui/core/elements/CvcController;->keyboardType:I

    return v0
.end method

.method public getLabel()Lkotlinx/coroutines/flow/StateFlow;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Lcom/stripe/android/core/strings/ResolvableString;",
            ">;"
        }
    .end annotation

    .line 45
    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/CvcController;->label:Lkotlinx/coroutines/flow/StateFlow;

    return-object v0
.end method

.method public getLayoutDirection()Landroidx/compose/ui/unit/LayoutDirection;
    .locals 1

    .line 49
    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/CvcController;->layoutDirection:Landroidx/compose/ui/unit/LayoutDirection;

    return-object v0
.end method

.method public getLoading()Lkotlinx/coroutines/flow/StateFlow;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .line 100
    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/CvcController;->loading:Lkotlinx/coroutines/flow/StateFlow;

    return-object v0
.end method

.method public getPlaceHolder()Lkotlinx/coroutines/flow/StateFlow;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 26
    invoke-static {p0}, Lcom/stripe/android/uicore/elements/TextFieldController$DefaultImpls;->getPlaceHolder(Lcom/stripe/android/uicore/elements/TextFieldController;)Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v0

    return-object v0
.end method

.method public getRawFieldValue()Lkotlinx/coroutines/flow/StateFlow;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 61
    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/CvcController;->rawFieldValue:Lkotlinx/coroutines/flow/StateFlow;

    return-object v0
.end method

.method public getShowOptionalLabel()Z
    .locals 1

    .line 31
    iget-boolean v0, p0, Lcom/stripe/android/ui/core/elements/CvcController;->showOptionalLabel:Z

    return v0
.end method

.method public getTrailingIcon()Lkotlinx/coroutines/flow/StateFlow;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Lcom/stripe/android/uicore/elements/TextFieldIcon;",
            ">;"
        }
    .end annotation

    .line 96
    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/CvcController;->trailingIcon:Lkotlinx/coroutines/flow/StateFlow;

    return-object v0
.end method

.method public getVisibleError()Lkotlinx/coroutines/flow/StateFlow;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .line 76
    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/CvcController;->visibleError:Lkotlinx/coroutines/flow/StateFlow;

    return-object v0
.end method

.method public getVisualTransformation()Lkotlinx/coroutines/flow/StateFlow;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Landroidx/compose/ui/text/input/VisualTransformation;",
            ">;"
        }
    .end annotation

    .line 57
    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/CvcController;->visualTransformation:Lkotlinx/coroutines/flow/StateFlow;

    return-object v0
.end method

.method public isComplete()Lkotlinx/coroutines/flow/StateFlow;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .line 89
    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/CvcController;->isComplete:Lkotlinx/coroutines/flow/StateFlow;

    return-object v0
.end method

.method public onDropdownItemClicked(Lcom/stripe/android/uicore/elements/TextFieldIcon$Dropdown$Item;)V
    .locals 0

    .line 26
    invoke-static {p0, p1}, Lcom/stripe/android/uicore/elements/TextFieldController$DefaultImpls;->onDropdownItemClicked(Lcom/stripe/android/uicore/elements/TextFieldController;Lcom/stripe/android/uicore/elements/TextFieldIcon$Dropdown$Item;)V

    return-void
.end method

.method public onFocusChange(Z)V
    .locals 1

    .line 123
    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/CvcController;->_hasFocus:Lkotlinx/coroutines/flow/MutableStateFlow;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {v0, p1}, Lkotlinx/coroutines/flow/MutableStateFlow;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public onRawValueChange(Ljava/lang/String;)V
    .locals 1

    const-string v0, "rawValue"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 119
    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/CvcController;->cvcTextFieldConfig:Lcom/stripe/android/ui/core/elements/CvcConfig;

    invoke-virtual {v0, p1}, Lcom/stripe/android/ui/core/elements/CvcConfig;->convertFromRaw(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/stripe/android/ui/core/elements/CvcController;->onValueChange(Ljava/lang/String;)Lcom/stripe/android/uicore/elements/TextFieldState;

    return-void
.end method

.method public onValueChange(Ljava/lang/String;)Lcom/stripe/android/uicore/elements/TextFieldState;
    .locals 2

    const-string v0, "displayFormatted"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 110
    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/CvcController;->_fieldValue:Lkotlinx/coroutines/flow/MutableStateFlow;

    iget-object v1, p0, Lcom/stripe/android/ui/core/elements/CvcController;->cvcTextFieldConfig:Lcom/stripe/android/ui/core/elements/CvcConfig;

    invoke-virtual {v1, p1}, Lcom/stripe/android/ui/core/elements/CvcConfig;->filter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Lkotlinx/coroutines/flow/MutableStateFlow;->setValue(Ljava/lang/Object;)V

    const/4 p1, 0x0

    return-object p1
.end method
