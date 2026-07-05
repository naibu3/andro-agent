.class public final Lcom/stripe/android/uicore/elements/SimpleTextFieldController;
.super Ljava/lang/Object;
.source "TextFieldController.kt"

# interfaces
.implements Lcom/stripe/android/uicore/elements/TextFieldController;


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nTextFieldController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldController.kt\ncom/stripe/android/uicore/elements/SimpleTextFieldController\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,242:1\n1#2:243\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00a4\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\r\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u00020\u0001BL\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012%\u0008\u0002\u0010\u0008\u001a\u001f\u0012\u0013\u0012\u00110\u0007\u00a2\u0006\u000c\u0008\n\u0012\u0008\u0008\u000b\u0012\u0004\u0008\u0008(\u000c\u0012\u0004\u0012\u00020\r\u0018\u00010\t\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0012\u0010N\u001a\u0004\u0018\u00010?2\u0006\u0010O\u001a\u00020\u0007H\u0016J\u0010\u0010P\u001a\u00020Q2\u0006\u0010R\u001a\u00020\u0007H\u0016J\u0010\u0010S\u001a\u00020Q2\u0006\u0010T\u001a\u00020\u0005H\u0016J=\u0010U\u001a\u00020Q2\u0006\u0010V\u001a\u00020\u00052\u0006\u0010W\u001a\u00020X2\u0006\u0010Y\u001a\u00020Z2\u000c\u0010[\u001a\u0008\u0012\u0004\u0012\u00020]0\\2\u0008\u0010^\u001a\u0004\u0018\u00010]H\u0017\u00a2\u0006\u0002\u0010_R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u0011R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u0013R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0014\u0010\u0015R+\u0010\u0008\u001a\u001f\u0012\u0013\u0012\u00110\u0007\u00a2\u0006\u000c\u0008\n\u0012\u0008\u0008\u000b\u0012\u0004\u0008\u0008(\u000c\u0012\u0004\u0012\u00020\r\u0018\u00010\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0017X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0019\u0010\u001aR\u0016\u0010\u001b\u001a\u00020\u001cX\u0096\u0004\u00a2\u0006\n\n\u0002\u0010\u001f\u001a\u0004\u0008\u001d\u0010\u001eR\u0016\u0010 \u001a\u00020!X\u0096\u0004\u00a2\u0006\n\n\u0002\u0010\u001f\u001a\u0004\u0008\"\u0010\u001eR\u001a\u0010#\u001a\u0008\u0012\u0004\u0012\u00020$0\u0017X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008%\u0010\u001aR\u001a\u0010&\u001a\u0008\u0012\u0004\u0012\u00020\r0\'X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008(\u0010)R\u0014\u0010*\u001a\u00020\u0007X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008+\u0010\u0015R\u0016\u0010,\u001a\u0004\u0018\u00010-X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008.\u0010/R\u001c\u00100\u001a\u0004\u0018\u000101X\u0096\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u00082\u00103\u001a\u0004\u00084\u00105R\u001c\u00106\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\'X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00087\u0010)R\u0014\u00108\u001a\u0008\u0012\u0004\u0012\u00020\u00070\'X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0017X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00089\u0010\u001aR\u001a\u0010:\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0017X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008;\u0010\u001aR\u001a\u0010<\u001a\u0008\u0012\u0004\u0012\u00020\r0\u0017X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008=\u0010\u001aR\u0014\u0010>\u001a\u0008\u0012\u0004\u0012\u00020?0\'X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010@\u001a\u0008\u0012\u0004\u0012\u00020?0\u0017X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008A\u0010\u001aR\u001a\u0010B\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0017X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008C\u0010\u001aR\u0014\u0010D\u001a\u0008\u0012\u0004\u0012\u00020\u00050\'X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010E\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0017X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008F\u0010\u001aR\u001c\u0010G\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010H0\u0017X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008I\u0010\u001aR\u001a\u0010J\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0017X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008J\u0010\u001aR\u001a\u0010K\u001a\u0008\u0012\u0004\u0012\u00020L0\u0017X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008M\u0010\u001a\u00a8\u0006`"
    }
    d2 = {
        "Lcom/stripe/android/uicore/elements/SimpleTextFieldController;",
        "Lcom/stripe/android/uicore/elements/TextFieldController;",
        "textFieldConfig",
        "Lcom/stripe/android/uicore/elements/TextFieldConfig;",
        "showOptionalLabel",
        "",
        "initialValue",
        "",
        "overrideContentDescriptionProvider",
        "Lkotlin/Function1;",
        "Lkotlin/ParameterName;",
        "name",
        "fieldValue",
        "Lcom/stripe/android/core/strings/ResolvableString;",
        "<init>",
        "(Lcom/stripe/android/uicore/elements/TextFieldConfig;ZLjava/lang/String;Lkotlin/jvm/functions/Function1;)V",
        "getTextFieldConfig",
        "()Lcom/stripe/android/uicore/elements/TextFieldConfig;",
        "getShowOptionalLabel",
        "()Z",
        "getInitialValue",
        "()Ljava/lang/String;",
        "trailingIcon",
        "Lkotlinx/coroutines/flow/StateFlow;",
        "Lcom/stripe/android/uicore/elements/TextFieldIcon;",
        "getTrailingIcon",
        "()Lkotlinx/coroutines/flow/StateFlow;",
        "capitalization",
        "Landroidx/compose/ui/text/input/KeyboardCapitalization;",
        "getCapitalization-IUNYP9k",
        "()I",
        "I",
        "keyboardType",
        "Landroidx/compose/ui/text/input/KeyboardType;",
        "getKeyboardType-PjHm6EE",
        "visualTransformation",
        "Landroidx/compose/ui/text/input/VisualTransformation;",
        "getVisualTransformation",
        "label",
        "Lkotlinx/coroutines/flow/MutableStateFlow;",
        "getLabel",
        "()Lkotlinx/coroutines/flow/MutableStateFlow;",
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
        "placeHolder",
        "getPlaceHolder",
        "_fieldValue",
        "getFieldValue",
        "rawFieldValue",
        "getRawFieldValue",
        "contentDescription",
        "getContentDescription",
        "_fieldState",
        "Lcom/stripe/android/uicore/elements/TextFieldState;",
        "fieldState",
        "getFieldState",
        "loading",
        "getLoading",
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
        "onValueChange",
        "displayFormatted",
        "onRawValueChange",
        "",
        "rawValue",
        "onFocusChange",
        "newHasFocus",
        "ComposeUI",
        "enabled",
        "field",
        "Lcom/stripe/android/uicore/elements/SectionFieldElement;",
        "modifier",
        "Landroidx/compose/ui/Modifier;",
        "hiddenIdentifiers",
        "",
        "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
        "lastTextFieldIdentifier",
        "(ZLcom/stripe/android/uicore/elements/SectionFieldElement;Landroidx/compose/ui/Modifier;Ljava/util/Set;Lcom/stripe/android/uicore/elements/IdentifierSpec;Landroidx/compose/runtime/Composer;I)V",
        "stripe-ui-core_release"
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
.field private final _fieldState:Lkotlinx/coroutines/flow/MutableStateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/MutableStateFlow<",
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

.field private final label:Lkotlinx/coroutines/flow/MutableStateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/MutableStateFlow<",
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

.field private final overrideContentDescriptionProvider:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/lang/String;",
            "Lcom/stripe/android/core/strings/ResolvableString;",
            ">;"
        }
    .end annotation
.end field

.field private final placeHolder:Lkotlinx/coroutines/flow/MutableStateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/MutableStateFlow<",
            "Ljava/lang/String;",
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

.field private final textFieldConfig:Lcom/stripe/android/uicore/elements/TextFieldConfig;

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
.method public static synthetic $r8$lambda$Bme4FV_MHbJzxGMqeg2q5OaSBuo(Lcom/stripe/android/uicore/elements/SimpleTextFieldController;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/uicore/elements/SimpleTextFieldController;->rawFieldValue$lambda$0(Lcom/stripe/android/uicore/elements/SimpleTextFieldController;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$CX6Y0c3VZppzEWi_24x-8VXy5WI(Lcom/stripe/android/uicore/elements/SimpleTextFieldController;Lcom/stripe/android/uicore/elements/TextFieldState;)Z
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/uicore/elements/SimpleTextFieldController;->isComplete$lambda$5(Lcom/stripe/android/uicore/elements/SimpleTextFieldController;Lcom/stripe/android/uicore/elements/TextFieldState;)Z

    move-result p0

    return p0
.end method

.method public static synthetic $r8$lambda$G3k5ZWB8IaFOYWSrwkaDe_25lPk(Lcom/stripe/android/uicore/elements/TextFieldState;Z)Z
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/uicore/elements/SimpleTextFieldController;->visibleError$lambda$2(Lcom/stripe/android/uicore/elements/TextFieldState;Z)Z

    move-result p0

    return p0
.end method

.method public static synthetic $r8$lambda$jyzWpK984zI33ercGy7KHRxd-qc(ZLjava/lang/String;)Lcom/stripe/android/uicore/forms/FormFieldEntry;
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/uicore/elements/SimpleTextFieldController;->formFieldValue$lambda$6(ZLjava/lang/String;)Lcom/stripe/android/uicore/forms/FormFieldEntry;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$rAqXkEl8j6KzlFQt2csXYNWfmfg(Lcom/stripe/android/uicore/elements/SimpleTextFieldController;Z)Lcom/stripe/android/uicore/elements/FieldError;
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/uicore/elements/SimpleTextFieldController;->error$lambda$4(Lcom/stripe/android/uicore/elements/SimpleTextFieldController;Z)Lcom/stripe/android/uicore/elements/FieldError;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$x6RT6dOk3wywk_Fh0SdYf7kgTJA(Lcom/stripe/android/uicore/elements/SimpleTextFieldController;Ljava/lang/String;)Lcom/stripe/android/core/strings/ResolvableString;
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/uicore/elements/SimpleTextFieldController;->contentDescription$lambda$1(Lcom/stripe/android/uicore/elements/SimpleTextFieldController;Ljava/lang/String;)Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object p0

    return-object p0
.end method

.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/uicore/elements/TextFieldConfig;ZLjava/lang/String;Lkotlin/jvm/functions/Function1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/uicore/elements/TextFieldConfig;",
            "Z",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/String;",
            "+",
            "Lcom/stripe/android/core/strings/ResolvableString;",
            ">;)V"
        }
    .end annotation

    const-string v0, "textFieldConfig"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 122
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 123
    iput-object p1, p0, Lcom/stripe/android/uicore/elements/SimpleTextFieldController;->textFieldConfig:Lcom/stripe/android/uicore/elements/TextFieldConfig;

    .line 124
    iput-boolean p2, p0, Lcom/stripe/android/uicore/elements/SimpleTextFieldController;->showOptionalLabel:Z

    .line 125
    iput-object p3, p0, Lcom/stripe/android/uicore/elements/SimpleTextFieldController;->initialValue:Ljava/lang/String;

    .line 126
    iput-object p4, p0, Lcom/stripe/android/uicore/elements/SimpleTextFieldController;->overrideContentDescriptionProvider:Lkotlin/jvm/functions/Function1;

    .line 128
    invoke-interface {p1}, Lcom/stripe/android/uicore/elements/TextFieldConfig;->getTrailingIcon()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object p2

    iput-object p2, p0, Lcom/stripe/android/uicore/elements/SimpleTextFieldController;->trailingIcon:Lkotlinx/coroutines/flow/StateFlow;

    .line 129
    invoke-interface {p1}, Lcom/stripe/android/uicore/elements/TextFieldConfig;->getCapitalization-IUNYP9k()I

    move-result p2

    iput p2, p0, Lcom/stripe/android/uicore/elements/SimpleTextFieldController;->capitalization:I

    .line 130
    invoke-interface {p1}, Lcom/stripe/android/uicore/elements/TextFieldConfig;->getKeyboard-PjHm6EE()I

    move-result p2

    iput p2, p0, Lcom/stripe/android/uicore/elements/SimpleTextFieldController;->keyboardType:I

    .line 132
    invoke-interface {p1}, Lcom/stripe/android/uicore/elements/TextFieldConfig;->getVisualTransformation()Landroidx/compose/ui/text/input/VisualTransformation;

    move-result-object p2

    if-nez p2, :cond_0

    sget-object p2, Landroidx/compose/ui/text/input/VisualTransformation;->Companion:Landroidx/compose/ui/text/input/VisualTransformation$Companion;

    invoke-virtual {p2}, Landroidx/compose/ui/text/input/VisualTransformation$Companion;->getNone()Landroidx/compose/ui/text/input/VisualTransformation;

    move-result-object p2

    .line 131
    :cond_0
    invoke-static {p2}, Lcom/stripe/android/uicore/utils/StateFlowsKt;->stateFlowOf(Ljava/lang/Object;)Lkotlinx/coroutines/flow/StateFlow;

    move-result-object p2

    iput-object p2, p0, Lcom/stripe/android/uicore/elements/SimpleTextFieldController;->visualTransformation:Lkotlinx/coroutines/flow/StateFlow;

    .line 135
    invoke-interface {p1}, Lcom/stripe/android/uicore/elements/TextFieldConfig;->getLabel()Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object p2

    invoke-static {p2}, Lkotlinx/coroutines/flow/StateFlowKt;->MutableStateFlow(Ljava/lang/Object;)Lkotlinx/coroutines/flow/MutableStateFlow;

    move-result-object p2

    iput-object p2, p0, Lcom/stripe/android/uicore/elements/SimpleTextFieldController;->label:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 136
    invoke-interface {p1}, Lcom/stripe/android/uicore/elements/TextFieldConfig;->getDebugLabel()Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Lcom/stripe/android/uicore/elements/SimpleTextFieldController;->debugLabel:Ljava/lang/String;

    .line 137
    invoke-interface {p1}, Lcom/stripe/android/uicore/elements/TextFieldConfig;->getLayoutDirection()Landroidx/compose/ui/unit/LayoutDirection;

    move-result-object p2

    iput-object p2, p0, Lcom/stripe/android/uicore/elements/SimpleTextFieldController;->layoutDirection:Landroidx/compose/ui/unit/LayoutDirection;

    .line 141
    instance-of p2, p1, Lcom/stripe/android/uicore/elements/DateConfig;

    if-eqz p2, :cond_1

    sget-object p2, Landroidx/compose/ui/autofill/AutofillType;->CreditCardExpirationDate:Landroidx/compose/ui/autofill/AutofillType;

    goto :goto_0

    .line 142
    :cond_1
    instance-of p2, p1, Lcom/stripe/android/uicore/elements/PostalCodeConfig;

    if-eqz p2, :cond_2

    sget-object p2, Landroidx/compose/ui/autofill/AutofillType;->PostalCode:Landroidx/compose/ui/autofill/AutofillType;

    goto :goto_0

    .line 143
    :cond_2
    instance-of p2, p1, Lcom/stripe/android/uicore/elements/EmailConfig;

    if-eqz p2, :cond_3

    sget-object p2, Landroidx/compose/ui/autofill/AutofillType;->EmailAddress:Landroidx/compose/ui/autofill/AutofillType;

    goto :goto_0

    .line 144
    :cond_3
    instance-of p2, p1, Lcom/stripe/android/uicore/elements/NameConfig;

    if-eqz p2, :cond_4

    sget-object p2, Landroidx/compose/ui/autofill/AutofillType;->PersonFullName:Landroidx/compose/ui/autofill/AutofillType;

    goto :goto_0

    :cond_4
    const/4 p2, 0x0

    .line 140
    :goto_0
    iput-object p2, p0, Lcom/stripe/android/uicore/elements/SimpleTextFieldController;->autofillType:Landroidx/compose/ui/autofill/AutofillType;

    .line 148
    invoke-interface {p1}, Lcom/stripe/android/uicore/elements/TextFieldConfig;->getPlaceHolder()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Lkotlinx/coroutines/flow/StateFlowKt;->MutableStateFlow(Ljava/lang/Object;)Lkotlinx/coroutines/flow/MutableStateFlow;

    move-result-object p2

    iput-object p2, p0, Lcom/stripe/android/uicore/elements/SimpleTextFieldController;->placeHolder:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 151
    const-string p2, ""

    invoke-static {p2}, Lkotlinx/coroutines/flow/StateFlowKt;->MutableStateFlow(Ljava/lang/Object;)Lkotlinx/coroutines/flow/MutableStateFlow;

    move-result-object p2

    iput-object p2, p0, Lcom/stripe/android/uicore/elements/SimpleTextFieldController;->_fieldValue:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 152
    invoke-static {p2}, Lkotlinx/coroutines/flow/FlowKt;->asStateFlow(Lkotlinx/coroutines/flow/MutableStateFlow;)Lkotlinx/coroutines/flow/StateFlow;

    move-result-object p3

    iput-object p3, p0, Lcom/stripe/android/uicore/elements/SimpleTextFieldController;->fieldValue:Lkotlinx/coroutines/flow/StateFlow;

    .line 154
    move-object p3, p2

    check-cast p3, Lkotlinx/coroutines/flow/StateFlow;

    new-instance p4, Lcom/stripe/android/uicore/elements/SimpleTextFieldController$$ExternalSyntheticLambda0;

    invoke-direct {p4, p0}, Lcom/stripe/android/uicore/elements/SimpleTextFieldController$$ExternalSyntheticLambda0;-><init>(Lcom/stripe/android/uicore/elements/SimpleTextFieldController;)V

    invoke-static {p3, p4}, Lcom/stripe/android/uicore/utils/StateFlowsKt;->mapAsStateFlow(Lkotlinx/coroutines/flow/StateFlow;Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/flow/StateFlow;

    move-result-object p3

    iput-object p3, p0, Lcom/stripe/android/uicore/elements/SimpleTextFieldController;->rawFieldValue:Lkotlinx/coroutines/flow/StateFlow;

    .line 156
    check-cast p2, Lkotlinx/coroutines/flow/StateFlow;

    new-instance p3, Lcom/stripe/android/uicore/elements/SimpleTextFieldController$$ExternalSyntheticLambda1;

    invoke-direct {p3, p0}, Lcom/stripe/android/uicore/elements/SimpleTextFieldController$$ExternalSyntheticLambda1;-><init>(Lcom/stripe/android/uicore/elements/SimpleTextFieldController;)V

    invoke-static {p2, p3}, Lcom/stripe/android/uicore/utils/StateFlowsKt;->mapAsStateFlow(Lkotlinx/coroutines/flow/StateFlow;Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/flow/StateFlow;

    move-result-object p2

    iput-object p2, p0, Lcom/stripe/android/uicore/elements/SimpleTextFieldController;->contentDescription:Lkotlinx/coroutines/flow/StateFlow;

    .line 160
    sget-object p2, Lcom/stripe/android/uicore/elements/TextFieldStateConstants$Error$Blank;->INSTANCE:Lcom/stripe/android/uicore/elements/TextFieldStateConstants$Error$Blank;

    invoke-static {p2}, Lkotlinx/coroutines/flow/StateFlowKt;->MutableStateFlow(Ljava/lang/Object;)Lkotlinx/coroutines/flow/MutableStateFlow;

    move-result-object p2

    iput-object p2, p0, Lcom/stripe/android/uicore/elements/SimpleTextFieldController;->_fieldState:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 161
    invoke-static {p2}, Lkotlinx/coroutines/flow/FlowKt;->asStateFlow(Lkotlinx/coroutines/flow/MutableStateFlow;)Lkotlinx/coroutines/flow/StateFlow;

    move-result-object p3

    iput-object p3, p0, Lcom/stripe/android/uicore/elements/SimpleTextFieldController;->fieldState:Lkotlinx/coroutines/flow/StateFlow;

    .line 163
    invoke-interface {p1}, Lcom/stripe/android/uicore/elements/TextFieldConfig;->getLoading()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/uicore/elements/SimpleTextFieldController;->loading:Lkotlinx/coroutines/flow/StateFlow;

    const/4 p1, 0x0

    .line 165
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-static {p1}, Lkotlinx/coroutines/flow/StateFlowKt;->MutableStateFlow(Ljava/lang/Object;)Lkotlinx/coroutines/flow/MutableStateFlow;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/uicore/elements/SimpleTextFieldController;->_hasFocus:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 168
    move-object p3, p2

    check-cast p3, Lkotlinx/coroutines/flow/StateFlow;

    check-cast p1, Lkotlinx/coroutines/flow/StateFlow;

    new-instance p4, Lcom/stripe/android/uicore/elements/SimpleTextFieldController$$ExternalSyntheticLambda2;

    invoke-direct {p4}, Lcom/stripe/android/uicore/elements/SimpleTextFieldController$$ExternalSyntheticLambda2;-><init>()V

    invoke-static {p3, p1, p4}, Lcom/stripe/android/uicore/utils/StateFlowsKt;->combineAsStateFlow(Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/flow/StateFlow;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/uicore/elements/SimpleTextFieldController;->visibleError:Lkotlinx/coroutines/flow/StateFlow;

    .line 175
    invoke-virtual {p0}, Lcom/stripe/android/uicore/elements/SimpleTextFieldController;->getVisibleError()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object p1

    new-instance p3, Lcom/stripe/android/uicore/elements/SimpleTextFieldController$$ExternalSyntheticLambda3;

    invoke-direct {p3, p0}, Lcom/stripe/android/uicore/elements/SimpleTextFieldController$$ExternalSyntheticLambda3;-><init>(Lcom/stripe/android/uicore/elements/SimpleTextFieldController;)V

    invoke-static {p1, p3}, Lcom/stripe/android/uicore/utils/StateFlowsKt;->mapAsStateFlow(Lkotlinx/coroutines/flow/StateFlow;Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/flow/StateFlow;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/uicore/elements/SimpleTextFieldController;->error:Lkotlinx/coroutines/flow/StateFlow;

    .line 179
    check-cast p2, Lkotlinx/coroutines/flow/StateFlow;

    new-instance p1, Lcom/stripe/android/uicore/elements/SimpleTextFieldController$$ExternalSyntheticLambda4;

    invoke-direct {p1, p0}, Lcom/stripe/android/uicore/elements/SimpleTextFieldController$$ExternalSyntheticLambda4;-><init>(Lcom/stripe/android/uicore/elements/SimpleTextFieldController;)V

    invoke-static {p2, p1}, Lcom/stripe/android/uicore/utils/StateFlowsKt;->mapAsStateFlow(Lkotlinx/coroutines/flow/StateFlow;Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/flow/StateFlow;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/uicore/elements/SimpleTextFieldController;->isComplete:Lkotlinx/coroutines/flow/StateFlow;

    .line 184
    invoke-virtual {p0}, Lcom/stripe/android/uicore/elements/SimpleTextFieldController;->isComplete()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object p1

    invoke-virtual {p0}, Lcom/stripe/android/uicore/elements/SimpleTextFieldController;->getRawFieldValue()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object p2

    new-instance p3, Lcom/stripe/android/uicore/elements/SimpleTextFieldController$$ExternalSyntheticLambda5;

    invoke-direct {p3}, Lcom/stripe/android/uicore/elements/SimpleTextFieldController$$ExternalSyntheticLambda5;-><init>()V

    invoke-static {p1, p2, p3}, Lcom/stripe/android/uicore/utils/StateFlowsKt;->combineAsStateFlow(Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/flow/StateFlow;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/uicore/elements/SimpleTextFieldController;->formFieldValue:Lkotlinx/coroutines/flow/StateFlow;

    .line 189
    invoke-virtual {p0}, Lcom/stripe/android/uicore/elements/SimpleTextFieldController;->getInitialValue()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_5

    invoke-virtual {p0, p1}, Lcom/stripe/android/uicore/elements/SimpleTextFieldController;->onRawValueChange(Ljava/lang/String;)V

    :cond_5
    return-void
.end method

.method public synthetic constructor <init>(Lcom/stripe/android/uicore/elements/TextFieldConfig;ZLjava/lang/String;Lkotlin/jvm/functions/Function1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_0

    const/4 p2, 0x0

    :cond_0
    and-int/lit8 p6, p5, 0x4

    const/4 v0, 0x0

    if-eqz p6, :cond_1

    move-object p3, v0

    :cond_1
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_2

    move-object p4, v0

    .line 122
    :cond_2
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/stripe/android/uicore/elements/SimpleTextFieldController;-><init>(Lcom/stripe/android/uicore/elements/TextFieldConfig;ZLjava/lang/String;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method private static final contentDescription$lambda$1(Lcom/stripe/android/uicore/elements/SimpleTextFieldController;Ljava/lang/String;)Lcom/stripe/android/core/strings/ResolvableString;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 157
    iget-object p0, p0, Lcom/stripe/android/uicore/elements/SimpleTextFieldController;->overrideContentDescriptionProvider:Lkotlin/jvm/functions/Function1;

    if-eqz p0, :cond_1

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/stripe/android/core/strings/ResolvableString;

    if-nez p0, :cond_0

    goto :goto_0

    :cond_0
    return-object p0

    :cond_1
    :goto_0
    invoke-static {p1}, Lcom/stripe/android/core/strings/ResolvableStringUtilsKt;->getResolvableString(Ljava/lang/String;)Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object p0

    return-object p0
.end method

.method private static final error$lambda$4(Lcom/stripe/android/uicore/elements/SimpleTextFieldController;Z)Lcom/stripe/android/uicore/elements/FieldError;
    .locals 1

    .line 176
    iget-object p0, p0, Lcom/stripe/android/uicore/elements/SimpleTextFieldController;->_fieldState:Lkotlinx/coroutines/flow/MutableStateFlow;

    invoke-interface {p0}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/stripe/android/uicore/elements/TextFieldState;

    invoke-interface {p0}, Lcom/stripe/android/uicore/elements/TextFieldState;->getError()Lcom/stripe/android/uicore/elements/FieldError;

    move-result-object p0

    const/4 v0, 0x0

    if-eqz p0, :cond_0

    if-eqz p1, :cond_0

    return-object p0

    :cond_0
    return-object v0
.end method

.method private static final formFieldValue$lambda$6(ZLjava/lang/String;)Lcom/stripe/android/uicore/forms/FormFieldEntry;
    .locals 1

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 185
    new-instance v0, Lcom/stripe/android/uicore/forms/FormFieldEntry;

    invoke-direct {v0, p1, p0}, Lcom/stripe/android/uicore/forms/FormFieldEntry;-><init>(Ljava/lang/String;Z)V

    return-object v0
.end method

.method public static synthetic getAutofillType$annotations()V
    .locals 0

    return-void
.end method

.method private static final isComplete$lambda$5(Lcom/stripe/android/uicore/elements/SimpleTextFieldController;Lcom/stripe/android/uicore/elements/TextFieldState;)Z
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 180
    invoke-interface {p1}, Lcom/stripe/android/uicore/elements/TextFieldState;->isValid()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-interface {p1}, Lcom/stripe/android/uicore/elements/TextFieldState;->isValid()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/stripe/android/uicore/elements/SimpleTextFieldController;->getShowOptionalLabel()Z

    move-result p0

    if-eqz p0, :cond_0

    invoke-interface {p1}, Lcom/stripe/android/uicore/elements/TextFieldState;->isBlank()Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x1

    return p0
.end method

.method private static final rawFieldValue$lambda$0(Lcom/stripe/android/uicore/elements/SimpleTextFieldController;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 154
    iget-object p0, p0, Lcom/stripe/android/uicore/elements/SimpleTextFieldController;->textFieldConfig:Lcom/stripe/android/uicore/elements/TextFieldConfig;

    invoke-interface {p0, p1}, Lcom/stripe/android/uicore/elements/TextFieldConfig;->convertToRaw(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static final visibleError$lambda$2(Lcom/stripe/android/uicore/elements/TextFieldState;Z)Z
    .locals 1

    const-string v0, "fieldState"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 169
    invoke-interface {p0, p1}, Lcom/stripe/android/uicore/elements/TextFieldState;->shouldShowError(Z)Z

    move-result p0

    return p0
.end method


# virtual methods
.method public ComposeUI(ZLcom/stripe/android/uicore/elements/SectionFieldElement;Landroidx/compose/ui/Modifier;Ljava/util/Set;Lcom/stripe/android/uicore/elements/IdentifierSpec;Landroidx/compose/runtime/Composer;I)V
    .locals 16
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

    move-object/from16 v0, p0

    move/from16 v1, p7

    const-string v2, "field"

    move-object/from16 v3, p2

    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "modifier"

    move-object/from16 v6, p3

    invoke-static {v6, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "hiddenIdentifiers"

    move-object/from16 v4, p4

    invoke-static {v4, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v2, 0x490d86a9

    move-object/from16 v13, p6

    invoke-interface {v13, v2}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v4

    if-eqz v4, :cond_0

    const/4 v4, -0x1

    const-string v5, "com.stripe.android.uicore.elements.SimpleTextFieldController.ComposeUI (TextFieldController.kt:226)"

    .line 227
    invoke-static {v2, v1, v4, v5}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 229
    :cond_0
    move-object v3, v0

    check-cast v3, Lcom/stripe/android/uicore/elements/TextFieldController;

    .line 231
    invoke-interface/range {p2 .. p2}, Lcom/stripe/android/uicore/elements/SectionFieldElement;->getIdentifier()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v2

    move-object/from16 v4, p5

    invoke-static {v4, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 232
    sget-object v2, Landroidx/compose/ui/text/input/ImeAction;->Companion:Landroidx/compose/ui/text/input/ImeAction$Companion;

    invoke-virtual {v2}, Landroidx/compose/ui/text/input/ImeAction$Companion;->getDone-eUduSuo()I

    move-result v2

    goto :goto_0

    .line 234
    :cond_1
    sget-object v2, Landroidx/compose/ui/text/input/ImeAction;->Companion:Landroidx/compose/ui/text/input/ImeAction$Companion;

    invoke-virtual {v2}, Landroidx/compose/ui/text/input/ImeAction$Companion;->getNext-eUduSuo()I

    move-result v2

    :goto_0
    move v5, v2

    .line 237
    iget-object v2, v0, Lcom/stripe/android/uicore/elements/SimpleTextFieldController;->textFieldConfig:Lcom/stripe/android/uicore/elements/TextFieldConfig;

    invoke-interface {v2}, Lcom/stripe/android/uicore/elements/TextFieldConfig;->getShouldAnnounceLabel()Z

    move-result v11

    .line 238
    iget-object v2, v0, Lcom/stripe/android/uicore/elements/SimpleTextFieldController;->textFieldConfig:Lcom/stripe/android/uicore/elements/TextFieldConfig;

    invoke-interface {v2}, Lcom/stripe/android/uicore/elements/TextFieldConfig;->getShouldAnnounceFieldValue()Z

    move-result v12

    shr-int/lit8 v2, v1, 0xf

    and-int/lit8 v2, v2, 0xe

    shl-int/lit8 v1, v1, 0x3

    and-int/lit8 v4, v1, 0x70

    or-int/2addr v2, v4

    and-int/lit16 v1, v1, 0x1c00

    or-int v14, v2, v1

    const/16 v15, 0xf0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move/from16 v4, p1

    .line 228
    invoke-static/range {v3 .. v15}, Lcom/stripe/android/uicore/elements/TextFieldUIKt;->TextField-ZkbtPhE(Lcom/stripe/android/uicore/elements/TextFieldController;ZILandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;IILandroidx/compose/ui/focus/FocusRequester;ZZLandroidx/compose/runtime/Composer;II)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_2
    invoke-interface/range {p6 .. p6}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    return-void
.end method

.method public getAutofillType()Landroidx/compose/ui/autofill/AutofillType;
    .locals 1

    .line 139
    iget-object v0, p0, Lcom/stripe/android/uicore/elements/SimpleTextFieldController;->autofillType:Landroidx/compose/ui/autofill/AutofillType;

    return-object v0
.end method

.method public getCapitalization-IUNYP9k()I
    .locals 1

    .line 129
    iget v0, p0, Lcom/stripe/android/uicore/elements/SimpleTextFieldController;->capitalization:I

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

    .line 156
    iget-object v0, p0, Lcom/stripe/android/uicore/elements/SimpleTextFieldController;->contentDescription:Lkotlinx/coroutines/flow/StateFlow;

    return-object v0
.end method

.method public getDebugLabel()Ljava/lang/String;
    .locals 1

    .line 136
    iget-object v0, p0, Lcom/stripe/android/uicore/elements/SimpleTextFieldController;->debugLabel:Ljava/lang/String;

    return-object v0
.end method

.method public getEnabled()Z
    .locals 1

    .line 121
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

    .line 175
    iget-object v0, p0, Lcom/stripe/android/uicore/elements/SimpleTextFieldController;->error:Lkotlinx/coroutines/flow/StateFlow;

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

    .line 161
    iget-object v0, p0, Lcom/stripe/android/uicore/elements/SimpleTextFieldController;->fieldState:Lkotlinx/coroutines/flow/StateFlow;

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

    .line 152
    iget-object v0, p0, Lcom/stripe/android/uicore/elements/SimpleTextFieldController;->fieldValue:Lkotlinx/coroutines/flow/StateFlow;

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

    .line 183
    iget-object v0, p0, Lcom/stripe/android/uicore/elements/SimpleTextFieldController;->formFieldValue:Lkotlinx/coroutines/flow/StateFlow;

    return-object v0
.end method

.method public getInitialValue()Ljava/lang/String;
    .locals 1

    .line 125
    iget-object v0, p0, Lcom/stripe/android/uicore/elements/SimpleTextFieldController;->initialValue:Ljava/lang/String;

    return-object v0
.end method

.method public getKeyboardType-PjHm6EE()I
    .locals 1

    .line 130
    iget v0, p0, Lcom/stripe/android/uicore/elements/SimpleTextFieldController;->keyboardType:I

    return v0
.end method

.method public getLabel()Lkotlinx/coroutines/flow/MutableStateFlow;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/MutableStateFlow<",
            "Lcom/stripe/android/core/strings/ResolvableString;",
            ">;"
        }
    .end annotation

    .line 135
    iget-object v0, p0, Lcom/stripe/android/uicore/elements/SimpleTextFieldController;->label:Lkotlinx/coroutines/flow/MutableStateFlow;

    return-object v0
.end method

.method public bridge synthetic getLabel()Lkotlinx/coroutines/flow/StateFlow;
    .locals 1

    .line 121
    invoke-virtual {p0}, Lcom/stripe/android/uicore/elements/SimpleTextFieldController;->getLabel()Lkotlinx/coroutines/flow/MutableStateFlow;

    move-result-object v0

    check-cast v0, Lkotlinx/coroutines/flow/StateFlow;

    return-object v0
.end method

.method public getLayoutDirection()Landroidx/compose/ui/unit/LayoutDirection;
    .locals 1

    .line 137
    iget-object v0, p0, Lcom/stripe/android/uicore/elements/SimpleTextFieldController;->layoutDirection:Landroidx/compose/ui/unit/LayoutDirection;

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

    .line 163
    iget-object v0, p0, Lcom/stripe/android/uicore/elements/SimpleTextFieldController;->loading:Lkotlinx/coroutines/flow/StateFlow;

    return-object v0
.end method

.method public getPlaceHolder()Lkotlinx/coroutines/flow/MutableStateFlow;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/MutableStateFlow<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 148
    iget-object v0, p0, Lcom/stripe/android/uicore/elements/SimpleTextFieldController;->placeHolder:Lkotlinx/coroutines/flow/MutableStateFlow;

    return-object v0
.end method

.method public bridge synthetic getPlaceHolder()Lkotlinx/coroutines/flow/StateFlow;
    .locals 1

    .line 121
    invoke-virtual {p0}, Lcom/stripe/android/uicore/elements/SimpleTextFieldController;->getPlaceHolder()Lkotlinx/coroutines/flow/MutableStateFlow;

    move-result-object v0

    check-cast v0, Lkotlinx/coroutines/flow/StateFlow;

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

    .line 154
    iget-object v0, p0, Lcom/stripe/android/uicore/elements/SimpleTextFieldController;->rawFieldValue:Lkotlinx/coroutines/flow/StateFlow;

    return-object v0
.end method

.method public getShowOptionalLabel()Z
    .locals 1

    .line 124
    iget-boolean v0, p0, Lcom/stripe/android/uicore/elements/SimpleTextFieldController;->showOptionalLabel:Z

    return v0
.end method

.method public final getTextFieldConfig()Lcom/stripe/android/uicore/elements/TextFieldConfig;
    .locals 1

    .line 123
    iget-object v0, p0, Lcom/stripe/android/uicore/elements/SimpleTextFieldController;->textFieldConfig:Lcom/stripe/android/uicore/elements/TextFieldConfig;

    return-object v0
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

    .line 128
    iget-object v0, p0, Lcom/stripe/android/uicore/elements/SimpleTextFieldController;->trailingIcon:Lkotlinx/coroutines/flow/StateFlow;

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

    .line 167
    iget-object v0, p0, Lcom/stripe/android/uicore/elements/SimpleTextFieldController;->visibleError:Lkotlinx/coroutines/flow/StateFlow;

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

    .line 131
    iget-object v0, p0, Lcom/stripe/android/uicore/elements/SimpleTextFieldController;->visualTransformation:Lkotlinx/coroutines/flow/StateFlow;

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

    .line 179
    iget-object v0, p0, Lcom/stripe/android/uicore/elements/SimpleTextFieldController;->isComplete:Lkotlinx/coroutines/flow/StateFlow;

    return-object v0
.end method

.method public onDropdownItemClicked(Lcom/stripe/android/uicore/elements/TextFieldIcon$Dropdown$Item;)V
    .locals 0

    .line 121
    invoke-static {p0, p1}, Lcom/stripe/android/uicore/elements/TextFieldController$DefaultImpls;->onDropdownItemClicked(Lcom/stripe/android/uicore/elements/TextFieldController;Lcom/stripe/android/uicore/elements/TextFieldIcon$Dropdown$Item;)V

    return-void
.end method

.method public onFocusChange(Z)V
    .locals 1

    .line 217
    iget-object v0, p0, Lcom/stripe/android/uicore/elements/SimpleTextFieldController;->_hasFocus:Lkotlinx/coroutines/flow/MutableStateFlow;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {v0, p1}, Lkotlinx/coroutines/flow/MutableStateFlow;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public onRawValueChange(Ljava/lang/String;)V
    .locals 1

    const-string v0, "rawValue"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 213
    iget-object v0, p0, Lcom/stripe/android/uicore/elements/SimpleTextFieldController;->textFieldConfig:Lcom/stripe/android/uicore/elements/TextFieldConfig;

    invoke-interface {v0, p1}, Lcom/stripe/android/uicore/elements/TextFieldConfig;->convertFromRaw(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/stripe/android/uicore/elements/SimpleTextFieldController;->onValueChange(Ljava/lang/String;)Lcom/stripe/android/uicore/elements/TextFieldState;

    return-void
.end method

.method public onValueChange(Ljava/lang/String;)Lcom/stripe/android/uicore/elements/TextFieldState;
    .locals 3

    const-string v0, "displayFormatted"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 196
    iget-object v0, p0, Lcom/stripe/android/uicore/elements/SimpleTextFieldController;->_fieldState:Lkotlinx/coroutines/flow/MutableStateFlow;

    invoke-interface {v0}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/uicore/elements/TextFieldState;

    .line 197
    iget-object v1, p0, Lcom/stripe/android/uicore/elements/SimpleTextFieldController;->_fieldValue:Lkotlinx/coroutines/flow/MutableStateFlow;

    iget-object v2, p0, Lcom/stripe/android/uicore/elements/SimpleTextFieldController;->textFieldConfig:Lcom/stripe/android/uicore/elements/TextFieldConfig;

    invoke-interface {v2, p1}, Lcom/stripe/android/uicore/elements/TextFieldConfig;->filter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {v1, p1}, Lkotlinx/coroutines/flow/MutableStateFlow;->setValue(Ljava/lang/Object;)V

    .line 200
    iget-object p1, p0, Lcom/stripe/android/uicore/elements/SimpleTextFieldController;->_fieldState:Lkotlinx/coroutines/flow/MutableStateFlow;

    iget-object v1, p0, Lcom/stripe/android/uicore/elements/SimpleTextFieldController;->textFieldConfig:Lcom/stripe/android/uicore/elements/TextFieldConfig;

    iget-object v2, p0, Lcom/stripe/android/uicore/elements/SimpleTextFieldController;->_fieldValue:Lkotlinx/coroutines/flow/MutableStateFlow;

    invoke-interface {v2}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-interface {v1, v2}, Lcom/stripe/android/uicore/elements/TextFieldConfig;->determineState(Ljava/lang/String;)Lcom/stripe/android/uicore/elements/TextFieldState;

    move-result-object v1

    invoke-interface {p1, v1}, Lkotlinx/coroutines/flow/MutableStateFlow;->setValue(Ljava/lang/Object;)V

    .line 202
    iget-object p1, p0, Lcom/stripe/android/uicore/elements/SimpleTextFieldController;->_fieldState:Lkotlinx/coroutines/flow/MutableStateFlow;

    invoke-interface {p1}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    .line 203
    iget-object p1, p0, Lcom/stripe/android/uicore/elements/SimpleTextFieldController;->_fieldState:Lkotlinx/coroutines/flow/MutableStateFlow;

    invoke-interface {p1}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/uicore/elements/TextFieldState;

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method
