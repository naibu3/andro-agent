.class public final Lcom/stripe/android/uicore/elements/AddressTextFieldController;
.super Ljava/lang/Object;
.source "AddressTextFieldController.kt"

# interfaces
.implements Lcom/stripe/android/uicore/elements/TextFieldController;
.implements Lcom/stripe/android/uicore/elements/InputController;
.implements Lcom/stripe/android/uicore/elements/SectionFieldComposable;


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nAddressTextFieldController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AddressTextFieldController.kt\ncom/stripe/android/uicore/elements/AddressTextFieldController\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,125:1\n1#2:126\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00a2\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B-\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0010\u0008\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0008\u0018\u00010\u0007\u0012\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0012\u0010H\u001a\u0004\u0018\u00010<2\u0006\u0010I\u001a\u00020\nH\u0016J\u0010\u0010J\u001a\u00020\u00082\u0006\u0010K\u001a\u00020 H\u0016J\u0010\u0010O\u001a\u00020\u00082\u0006\u0010P\u001a\u00020\nH\u0016J=\u0010Q\u001a\u00020\u00082\u0006\u0010R\u001a\u00020 2\u0006\u0010S\u001a\u00020T2\u0006\u0010U\u001a\u00020V2\u000c\u0010W\u001a\u0008\u0012\u0004\u0012\u00020Y0X2\u0008\u0010Z\u001a\u0004\u0018\u00010YH\u0017\u00a2\u0006\u0002\u0010[J\u0006\u0010\\\u001a\u00020\u0008R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0008\u0018\u00010\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\u0004\u0018\u00010\nX\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000eR\u001c\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u0010X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u0013R\u0016\u0010\u0014\u001a\u00020\u0015X\u0096\u0004\u00a2\u0006\n\n\u0002\u0010\u0018\u001a\u0004\u0008\u0016\u0010\u0017R\u0016\u0010\u0019\u001a\u00020\u001aX\u0096\u0004\u00a2\u0006\n\n\u0002\u0010\u0018\u001a\u0004\u0008\u001b\u0010\u0017R\u001a\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00020\u001d0\u0010X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001e\u0010\u0013R\u0014\u0010\u001f\u001a\u00020 X\u0096D\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008!\u0010\"R\u001a\u0010#\u001a\u0008\u0012\u0004\u0012\u00020%0$X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008&\u0010\'R\u0014\u0010(\u001a\u00020\nX\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008)\u0010\u000eR\u001e\u0010*\u001a\u0004\u0018\u00010+8\u0016X\u0097\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008,\u0010-\u001a\u0004\u0008.\u0010/R\u0014\u00100\u001a\u0008\u0012\u0004\u0012\u00020\n0$X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u00101\u001a\u0008\u0012\u0004\u0012\u00020\n0\u0010X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00082\u0010\u0013R\u001a\u00103\u001a\u0008\u0012\u0004\u0012\u00020\n0\u0010X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00084\u0010\u0013R\u0016\u00105\u001a\u0004\u0018\u000106X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00087\u00108R\u001a\u00109\u001a\u0008\u0012\u0004\u0012\u00020%0\u0010X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008:\u0010\u0013R\u0014\u0010;\u001a\u0008\u0012\u0004\u0012\u00020<0$X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010=\u001a\u0008\u0012\u0004\u0012\u00020<0\u0010X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008>\u0010\u0013R\u001a\u0010?\u001a\u0008\u0012\u0004\u0012\u00020 0\u0010X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008@\u0010\u0013R\u0014\u0010A\u001a\u0008\u0012\u0004\u0012\u00020 0$X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010B\u001a\u0008\u0012\u0004\u0012\u00020 0\u0010X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008C\u0010\u0013R\u001c\u0010D\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010E0\u0010X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008F\u0010\u0013R\u001a\u0010G\u001a\u0008\u0012\u0004\u0012\u00020 0\u0010X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008G\u0010\u0013R\u001a\u0010L\u001a\u0008\u0012\u0004\u0012\u00020M0\u0010X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008N\u0010\u0013\u00a8\u0006]"
    }
    d2 = {
        "Lcom/stripe/android/uicore/elements/AddressTextFieldController;",
        "Lcom/stripe/android/uicore/elements/TextFieldController;",
        "Lcom/stripe/android/uicore/elements/InputController;",
        "Lcom/stripe/android/uicore/elements/SectionFieldComposable;",
        "config",
        "Lcom/stripe/android/uicore/elements/TextFieldConfig;",
        "onNavigation",
        "Lkotlin/Function0;",
        "",
        "initialValue",
        "",
        "<init>",
        "(Lcom/stripe/android/uicore/elements/TextFieldConfig;Lkotlin/jvm/functions/Function0;Ljava/lang/String;)V",
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
        "showOptionalLabel",
        "",
        "getShowOptionalLabel",
        "()Z",
        "label",
        "Lkotlinx/coroutines/flow/MutableStateFlow;",
        "Lcom/stripe/android/core/strings/ResolvableString;",
        "getLabel",
        "()Lkotlinx/coroutines/flow/MutableStateFlow;",
        "debugLabel",
        "getDebugLabel",
        "autofillType",
        "Landroidx/compose/ui/autofill/AutofillType;",
        "getAutofillType$annotations",
        "()V",
        "getAutofillType",
        "()Landroidx/compose/ui/autofill/AutofillType;",
        "_fieldValue",
        "fieldValue",
        "getFieldValue",
        "rawFieldValue",
        "getRawFieldValue",
        "layoutDirection",
        "Landroidx/compose/ui/unit/LayoutDirection;",
        "getLayoutDirection",
        "()Landroidx/compose/ui/unit/LayoutDirection;",
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
        "onValueChange",
        "displayFormatted",
        "onFocusChange",
        "newHasFocus",
        "formFieldValue",
        "Lcom/stripe/android/uicore/forms/FormFieldEntry;",
        "getFormFieldValue",
        "onRawValueChange",
        "rawValue",
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
        "launchAutocompleteScreen",
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

.field private final config:Lcom/stripe/android/uicore/elements/TextFieldConfig;

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

.field private final onNavigation:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
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
.method public static synthetic $r8$lambda$-jhaZVZIzcRwPb3ItAHoxNFr1qU(Lcom/stripe/android/uicore/elements/AddressTextFieldController;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/uicore/elements/AddressTextFieldController;->rawFieldValue$lambda$1(Lcom/stripe/android/uicore/elements/AddressTextFieldController;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$7EdGl_KZsQAChgt0SyS96dZaqTU(Lcom/stripe/android/uicore/elements/TextFieldState;Z)Z
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/uicore/elements/AddressTextFieldController;->visibleError$lambda$3(Lcom/stripe/android/uicore/elements/TextFieldState;Z)Z

    move-result p0

    return p0
.end method

.method public static synthetic $r8$lambda$S_hkupq2YR4ArWU4cj9yJeydHxc(Lcom/stripe/android/uicore/elements/AddressTextFieldController;Lcom/stripe/android/uicore/elements/TextFieldState;)Z
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/uicore/elements/AddressTextFieldController;->isComplete$lambda$6(Lcom/stripe/android/uicore/elements/AddressTextFieldController;Lcom/stripe/android/uicore/elements/TextFieldState;)Z

    move-result p0

    return p0
.end method

.method public static synthetic $r8$lambda$ZMGcuajTG-wokCMWxMaHVZSH1oU(ZLjava/lang/String;)Lcom/stripe/android/uicore/forms/FormFieldEntry;
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/uicore/elements/AddressTextFieldController;->formFieldValue$lambda$7(ZLjava/lang/String;)Lcom/stripe/android/uicore/forms/FormFieldEntry;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$d-ta5zJZ-ess1f7VTaJ0xS4rNF8(Ljava/lang/String;)Lcom/stripe/android/core/strings/ResolvableString;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/uicore/elements/AddressTextFieldController;->contentDescription$lambda$2(Ljava/lang/String;)Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$jKzczrxcuSPewHR-Q6FyEardFu8(Lcom/stripe/android/uicore/elements/AddressTextFieldController;Z)Lcom/stripe/android/uicore/elements/FieldError;
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/uicore/elements/AddressTextFieldController;->error$lambda$5(Lcom/stripe/android/uicore/elements/AddressTextFieldController;Z)Lcom/stripe/android/uicore/elements/FieldError;

    move-result-object p0

    return-object p0
.end method

.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/uicore/elements/TextFieldConfig;Lkotlin/jvm/functions/Function0;Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/uicore/elements/TextFieldConfig;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    const-string v0, "config"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    iput-object p1, p0, Lcom/stripe/android/uicore/elements/AddressTextFieldController;->config:Lcom/stripe/android/uicore/elements/TextFieldConfig;

    .line 25
    iput-object p2, p0, Lcom/stripe/android/uicore/elements/AddressTextFieldController;->onNavigation:Lkotlin/jvm/functions/Function0;

    .line 26
    iput-object p3, p0, Lcom/stripe/android/uicore/elements/AddressTextFieldController;->initialValue:Ljava/lang/String;

    .line 30
    invoke-virtual {p0}, Lcom/stripe/android/uicore/elements/AddressTextFieldController;->getInitialValue()Ljava/lang/String;

    move-result-object p2

    if-eqz p2, :cond_0

    invoke-virtual {p0, p2}, Lcom/stripe/android/uicore/elements/AddressTextFieldController;->onRawValueChange(Ljava/lang/String;)V

    .line 33
    :cond_0
    invoke-interface {p1}, Lcom/stripe/android/uicore/elements/TextFieldConfig;->getTrailingIcon()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object p2

    iput-object p2, p0, Lcom/stripe/android/uicore/elements/AddressTextFieldController;->trailingIcon:Lkotlinx/coroutines/flow/StateFlow;

    .line 34
    invoke-interface {p1}, Lcom/stripe/android/uicore/elements/TextFieldConfig;->getCapitalization-IUNYP9k()I

    move-result p2

    iput p2, p0, Lcom/stripe/android/uicore/elements/AddressTextFieldController;->capitalization:I

    .line 35
    invoke-interface {p1}, Lcom/stripe/android/uicore/elements/TextFieldConfig;->getKeyboard-PjHm6EE()I

    move-result p2

    iput p2, p0, Lcom/stripe/android/uicore/elements/AddressTextFieldController;->keyboardType:I

    .line 37
    invoke-interface {p1}, Lcom/stripe/android/uicore/elements/TextFieldConfig;->getVisualTransformation()Landroidx/compose/ui/text/input/VisualTransformation;

    move-result-object p2

    if-nez p2, :cond_1

    sget-object p2, Landroidx/compose/ui/text/input/VisualTransformation;->Companion:Landroidx/compose/ui/text/input/VisualTransformation$Companion;

    invoke-virtual {p2}, Landroidx/compose/ui/text/input/VisualTransformation$Companion;->getNone()Landroidx/compose/ui/text/input/VisualTransformation;

    move-result-object p2

    .line 36
    :cond_1
    invoke-static {p2}, Lcom/stripe/android/uicore/utils/StateFlowsKt;->stateFlowOf(Ljava/lang/Object;)Lkotlinx/coroutines/flow/StateFlow;

    move-result-object p2

    iput-object p2, p0, Lcom/stripe/android/uicore/elements/AddressTextFieldController;->visualTransformation:Lkotlinx/coroutines/flow/StateFlow;

    .line 41
    invoke-interface {p1}, Lcom/stripe/android/uicore/elements/TextFieldConfig;->getLabel()Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object p2

    invoke-static {p2}, Lkotlinx/coroutines/flow/StateFlowKt;->MutableStateFlow(Ljava/lang/Object;)Lkotlinx/coroutines/flow/MutableStateFlow;

    move-result-object p2

    iput-object p2, p0, Lcom/stripe/android/uicore/elements/AddressTextFieldController;->label:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 42
    invoke-interface {p1}, Lcom/stripe/android/uicore/elements/TextFieldConfig;->getDebugLabel()Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Lcom/stripe/android/uicore/elements/AddressTextFieldController;->debugLabel:Ljava/lang/String;

    .line 48
    const-string p2, ""

    invoke-static {p2}, Lkotlinx/coroutines/flow/StateFlowKt;->MutableStateFlow(Ljava/lang/Object;)Lkotlinx/coroutines/flow/MutableStateFlow;

    move-result-object p2

    iput-object p2, p0, Lcom/stripe/android/uicore/elements/AddressTextFieldController;->_fieldValue:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 49
    invoke-static {p2}, Lkotlinx/coroutines/flow/FlowKt;->asStateFlow(Lkotlinx/coroutines/flow/MutableStateFlow;)Lkotlinx/coroutines/flow/StateFlow;

    move-result-object p3

    iput-object p3, p0, Lcom/stripe/android/uicore/elements/AddressTextFieldController;->fieldValue:Lkotlinx/coroutines/flow/StateFlow;

    .line 51
    move-object p3, p2

    check-cast p3, Lkotlinx/coroutines/flow/StateFlow;

    new-instance v0, Lcom/stripe/android/uicore/elements/AddressTextFieldController$$ExternalSyntheticLambda0;

    invoke-direct {v0, p0}, Lcom/stripe/android/uicore/elements/AddressTextFieldController$$ExternalSyntheticLambda0;-><init>(Lcom/stripe/android/uicore/elements/AddressTextFieldController;)V

    invoke-static {p3, v0}, Lcom/stripe/android/uicore/utils/StateFlowsKt;->mapAsStateFlow(Lkotlinx/coroutines/flow/StateFlow;Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/flow/StateFlow;

    move-result-object p3

    iput-object p3, p0, Lcom/stripe/android/uicore/elements/AddressTextFieldController;->rawFieldValue:Lkotlinx/coroutines/flow/StateFlow;

    .line 55
    check-cast p2, Lkotlinx/coroutines/flow/StateFlow;

    new-instance p3, Lcom/stripe/android/uicore/elements/AddressTextFieldController$$ExternalSyntheticLambda1;

    invoke-direct {p3}, Lcom/stripe/android/uicore/elements/AddressTextFieldController$$ExternalSyntheticLambda1;-><init>()V

    invoke-static {p2, p3}, Lcom/stripe/android/uicore/utils/StateFlowsKt;->mapAsStateFlow(Lkotlinx/coroutines/flow/StateFlow;Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/flow/StateFlow;

    move-result-object p2

    iput-object p2, p0, Lcom/stripe/android/uicore/elements/AddressTextFieldController;->contentDescription:Lkotlinx/coroutines/flow/StateFlow;

    .line 57
    sget-object p2, Lcom/stripe/android/uicore/elements/TextFieldStateConstants$Error$Blank;->INSTANCE:Lcom/stripe/android/uicore/elements/TextFieldStateConstants$Error$Blank;

    invoke-static {p2}, Lkotlinx/coroutines/flow/StateFlowKt;->MutableStateFlow(Ljava/lang/Object;)Lkotlinx/coroutines/flow/MutableStateFlow;

    move-result-object p2

    iput-object p2, p0, Lcom/stripe/android/uicore/elements/AddressTextFieldController;->_fieldState:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 58
    invoke-static {p2}, Lkotlinx/coroutines/flow/FlowKt;->asStateFlow(Lkotlinx/coroutines/flow/MutableStateFlow;)Lkotlinx/coroutines/flow/StateFlow;

    move-result-object p3

    iput-object p3, p0, Lcom/stripe/android/uicore/elements/AddressTextFieldController;->fieldState:Lkotlinx/coroutines/flow/StateFlow;

    .line 60
    invoke-interface {p1}, Lcom/stripe/android/uicore/elements/TextFieldConfig;->getLoading()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/uicore/elements/AddressTextFieldController;->loading:Lkotlinx/coroutines/flow/StateFlow;

    const/4 p1, 0x0

    .line 62
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-static {p1}, Lkotlinx/coroutines/flow/StateFlowKt;->MutableStateFlow(Ljava/lang/Object;)Lkotlinx/coroutines/flow/MutableStateFlow;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/uicore/elements/AddressTextFieldController;->_hasFocus:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 65
    move-object p3, p2

    check-cast p3, Lkotlinx/coroutines/flow/StateFlow;

    check-cast p1, Lkotlinx/coroutines/flow/StateFlow;

    new-instance v0, Lcom/stripe/android/uicore/elements/AddressTextFieldController$$ExternalSyntheticLambda2;

    invoke-direct {v0}, Lcom/stripe/android/uicore/elements/AddressTextFieldController$$ExternalSyntheticLambda2;-><init>()V

    invoke-static {p3, p1, v0}, Lcom/stripe/android/uicore/utils/StateFlowsKt;->combineAsStateFlow(Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/flow/StateFlow;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/uicore/elements/AddressTextFieldController;->visibleError:Lkotlinx/coroutines/flow/StateFlow;

    .line 72
    invoke-virtual {p0}, Lcom/stripe/android/uicore/elements/AddressTextFieldController;->getVisibleError()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object p1

    new-instance p3, Lcom/stripe/android/uicore/elements/AddressTextFieldController$$ExternalSyntheticLambda3;

    invoke-direct {p3, p0}, Lcom/stripe/android/uicore/elements/AddressTextFieldController$$ExternalSyntheticLambda3;-><init>(Lcom/stripe/android/uicore/elements/AddressTextFieldController;)V

    invoke-static {p1, p3}, Lcom/stripe/android/uicore/utils/StateFlowsKt;->mapAsStateFlow(Lkotlinx/coroutines/flow/StateFlow;Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/flow/StateFlow;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/uicore/elements/AddressTextFieldController;->error:Lkotlinx/coroutines/flow/StateFlow;

    .line 76
    check-cast p2, Lkotlinx/coroutines/flow/StateFlow;

    new-instance p1, Lcom/stripe/android/uicore/elements/AddressTextFieldController$$ExternalSyntheticLambda4;

    invoke-direct {p1, p0}, Lcom/stripe/android/uicore/elements/AddressTextFieldController$$ExternalSyntheticLambda4;-><init>(Lcom/stripe/android/uicore/elements/AddressTextFieldController;)V

    invoke-static {p2, p1}, Lcom/stripe/android/uicore/utils/StateFlowsKt;->mapAsStateFlow(Lkotlinx/coroutines/flow/StateFlow;Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/flow/StateFlow;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/uicore/elements/AddressTextFieldController;->isComplete:Lkotlinx/coroutines/flow/StateFlow;

    .line 102
    invoke-virtual {p0}, Lcom/stripe/android/uicore/elements/AddressTextFieldController;->isComplete()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object p1

    invoke-virtual {p0}, Lcom/stripe/android/uicore/elements/AddressTextFieldController;->getRawFieldValue()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object p2

    new-instance p3, Lcom/stripe/android/uicore/elements/AddressTextFieldController$$ExternalSyntheticLambda5;

    invoke-direct {p3}, Lcom/stripe/android/uicore/elements/AddressTextFieldController$$ExternalSyntheticLambda5;-><init>()V

    invoke-static {p1, p2, p3}, Lcom/stripe/android/uicore/utils/StateFlowsKt;->combineAsStateFlow(Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/flow/StateFlow;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/uicore/elements/AddressTextFieldController;->formFieldValue:Lkotlinx/coroutines/flow/StateFlow;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/stripe/android/uicore/elements/TextFieldConfig;Lkotlin/jvm/functions/Function0;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p5, p4, 0x2

    const/4 v0, 0x0

    if-eqz p5, :cond_0

    move-object p2, v0

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    move-object p3, v0

    .line 23
    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lcom/stripe/android/uicore/elements/AddressTextFieldController;-><init>(Lcom/stripe/android/uicore/elements/TextFieldConfig;Lkotlin/jvm/functions/Function0;Ljava/lang/String;)V

    return-void
.end method

.method private static final contentDescription$lambda$2(Ljava/lang/String;)Lcom/stripe/android/core/strings/ResolvableString;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 55
    invoke-static {p0}, Lcom/stripe/android/core/strings/ResolvableStringUtilsKt;->getResolvableString(Ljava/lang/String;)Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object p0

    return-object p0
.end method

.method private static final error$lambda$5(Lcom/stripe/android/uicore/elements/AddressTextFieldController;Z)Lcom/stripe/android/uicore/elements/FieldError;
    .locals 1

    .line 73
    iget-object p0, p0, Lcom/stripe/android/uicore/elements/AddressTextFieldController;->_fieldState:Lkotlinx/coroutines/flow/MutableStateFlow;

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

.method private static final formFieldValue$lambda$7(ZLjava/lang/String;)Lcom/stripe/android/uicore/forms/FormFieldEntry;
    .locals 1

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 103
    new-instance v0, Lcom/stripe/android/uicore/forms/FormFieldEntry;

    invoke-direct {v0, p1, p0}, Lcom/stripe/android/uicore/forms/FormFieldEntry;-><init>(Ljava/lang/String;Z)V

    return-object v0
.end method

.method public static synthetic getAutofillType$annotations()V
    .locals 0

    return-void
.end method

.method private static final isComplete$lambda$6(Lcom/stripe/android/uicore/elements/AddressTextFieldController;Lcom/stripe/android/uicore/elements/TextFieldState;)Z
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 77
    invoke-interface {p1}, Lcom/stripe/android/uicore/elements/TextFieldState;->isValid()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-interface {p1}, Lcom/stripe/android/uicore/elements/TextFieldState;->isValid()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/stripe/android/uicore/elements/AddressTextFieldController;->getShowOptionalLabel()Z

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

.method private static final rawFieldValue$lambda$1(Lcom/stripe/android/uicore/elements/AddressTextFieldController;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 51
    iget-object p0, p0, Lcom/stripe/android/uicore/elements/AddressTextFieldController;->config:Lcom/stripe/android/uicore/elements/TextFieldConfig;

    invoke-interface {p0, p1}, Lcom/stripe/android/uicore/elements/TextFieldConfig;->convertToRaw(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static final visibleError$lambda$3(Lcom/stripe/android/uicore/elements/TextFieldState;Z)Z
    .locals 1

    const-string v0, "fieldState"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 66
    invoke-interface {p0, p1}, Lcom/stripe/android/uicore/elements/TextFieldState;->shouldShowError(Z)Z

    move-result p0

    return p0
.end method


# virtual methods
.method public ComposeUI(ZLcom/stripe/android/uicore/elements/SectionFieldElement;Landroidx/compose/ui/Modifier;Ljava/util/Set;Lcom/stripe/android/uicore/elements/IdentifierSpec;Landroidx/compose/runtime/Composer;I)V
    .locals 6
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

    const-string p1, "field"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "modifier"

    invoke-static {p3, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "hiddenIdentifiers"

    invoke-static {p4, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const p1, 0x6489507

    invoke-interface {p6, p1}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result p2

    if-eqz p2, :cond_0

    const/4 p2, -0x1

    const-string p4, "com.stripe.android.uicore.elements.AddressTextFieldController.ComposeUI (AddressTextFieldController.kt:116)"

    .line 117
    invoke-static {p1, p7, p2, p4}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    :cond_0
    shr-int/lit8 p1, p7, 0xf

    and-int/lit8 p1, p1, 0xe

    shr-int/lit8 p2, p7, 0x3

    and-int/lit8 p2, p2, 0x70

    or-int v4, p1, p2

    const/4 v5, 0x4

    const/4 v2, 0x0

    move-object v0, p0

    move-object v1, p3

    move-object v3, p6

    .line 118
    invoke-static/range {v0 .. v5}, Lcom/stripe/android/uicore/elements/AddressTextFieldUIKt;->AddressTextFieldUI(Lcom/stripe/android/uicore/elements/AddressTextFieldController;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_1
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    return-void
.end method

.method public getAutofillType()Landroidx/compose/ui/autofill/AutofillType;
    .locals 1

    .line 44
    iget-object v0, p0, Lcom/stripe/android/uicore/elements/AddressTextFieldController;->autofillType:Landroidx/compose/ui/autofill/AutofillType;

    return-object v0
.end method

.method public getCapitalization-IUNYP9k()I
    .locals 1

    .line 34
    iget v0, p0, Lcom/stripe/android/uicore/elements/AddressTextFieldController;->capitalization:I

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

    .line 55
    iget-object v0, p0, Lcom/stripe/android/uicore/elements/AddressTextFieldController;->contentDescription:Lkotlinx/coroutines/flow/StateFlow;

    return-object v0
.end method

.method public getDebugLabel()Ljava/lang/String;
    .locals 1

    .line 42
    iget-object v0, p0, Lcom/stripe/android/uicore/elements/AddressTextFieldController;->debugLabel:Ljava/lang/String;

    return-object v0
.end method

.method public getEnabled()Z
    .locals 1

    .line 22
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

    .line 72
    iget-object v0, p0, Lcom/stripe/android/uicore/elements/AddressTextFieldController;->error:Lkotlinx/coroutines/flow/StateFlow;

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

    .line 58
    iget-object v0, p0, Lcom/stripe/android/uicore/elements/AddressTextFieldController;->fieldState:Lkotlinx/coroutines/flow/StateFlow;

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

    .line 49
    iget-object v0, p0, Lcom/stripe/android/uicore/elements/AddressTextFieldController;->fieldValue:Lkotlinx/coroutines/flow/StateFlow;

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

    .line 101
    iget-object v0, p0, Lcom/stripe/android/uicore/elements/AddressTextFieldController;->formFieldValue:Lkotlinx/coroutines/flow/StateFlow;

    return-object v0
.end method

.method public getInitialValue()Ljava/lang/String;
    .locals 1

    .line 26
    iget-object v0, p0, Lcom/stripe/android/uicore/elements/AddressTextFieldController;->initialValue:Ljava/lang/String;

    return-object v0
.end method

.method public getKeyboardType-PjHm6EE()I
    .locals 1

    .line 35
    iget v0, p0, Lcom/stripe/android/uicore/elements/AddressTextFieldController;->keyboardType:I

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

    .line 41
    iget-object v0, p0, Lcom/stripe/android/uicore/elements/AddressTextFieldController;->label:Lkotlinx/coroutines/flow/MutableStateFlow;

    return-object v0
.end method

.method public bridge synthetic getLabel()Lkotlinx/coroutines/flow/StateFlow;
    .locals 1

    .line 22
    invoke-virtual {p0}, Lcom/stripe/android/uicore/elements/AddressTextFieldController;->getLabel()Lkotlinx/coroutines/flow/MutableStateFlow;

    move-result-object v0

    check-cast v0, Lkotlinx/coroutines/flow/StateFlow;

    return-object v0
.end method

.method public getLayoutDirection()Landroidx/compose/ui/unit/LayoutDirection;
    .locals 1

    .line 53
    iget-object v0, p0, Lcom/stripe/android/uicore/elements/AddressTextFieldController;->layoutDirection:Landroidx/compose/ui/unit/LayoutDirection;

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

    .line 60
    iget-object v0, p0, Lcom/stripe/android/uicore/elements/AddressTextFieldController;->loading:Lkotlinx/coroutines/flow/StateFlow;

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

    .line 22
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

    .line 51
    iget-object v0, p0, Lcom/stripe/android/uicore/elements/AddressTextFieldController;->rawFieldValue:Lkotlinx/coroutines/flow/StateFlow;

    return-object v0
.end method

.method public getShowOptionalLabel()Z
    .locals 1

    .line 39
    iget-boolean v0, p0, Lcom/stripe/android/uicore/elements/AddressTextFieldController;->showOptionalLabel:Z

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

    .line 33
    iget-object v0, p0, Lcom/stripe/android/uicore/elements/AddressTextFieldController;->trailingIcon:Lkotlinx/coroutines/flow/StateFlow;

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

    .line 64
    iget-object v0, p0, Lcom/stripe/android/uicore/elements/AddressTextFieldController;->visibleError:Lkotlinx/coroutines/flow/StateFlow;

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

    .line 36
    iget-object v0, p0, Lcom/stripe/android/uicore/elements/AddressTextFieldController;->visualTransformation:Lkotlinx/coroutines/flow/StateFlow;

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

    .line 76
    iget-object v0, p0, Lcom/stripe/android/uicore/elements/AddressTextFieldController;->isComplete:Lkotlinx/coroutines/flow/StateFlow;

    return-object v0
.end method

.method public final launchAutocompleteScreen()V
    .locals 1

    .line 122
    iget-object v0, p0, Lcom/stripe/android/uicore/elements/AddressTextFieldController;->onNavigation:Lkotlin/jvm/functions/Function0;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method public onDropdownItemClicked(Lcom/stripe/android/uicore/elements/TextFieldIcon$Dropdown$Item;)V
    .locals 0

    .line 22
    invoke-static {p0, p1}, Lcom/stripe/android/uicore/elements/TextFieldController$DefaultImpls;->onDropdownItemClicked(Lcom/stripe/android/uicore/elements/TextFieldController;Lcom/stripe/android/uicore/elements/TextFieldIcon$Dropdown$Item;)V

    return-void
.end method

.method public onFocusChange(Z)V
    .locals 1

    .line 98
    iget-object v0, p0, Lcom/stripe/android/uicore/elements/AddressTextFieldController;->_hasFocus:Lkotlinx/coroutines/flow/MutableStateFlow;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {v0, p1}, Lkotlinx/coroutines/flow/MutableStateFlow;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public onRawValueChange(Ljava/lang/String;)V
    .locals 1

    const-string v0, "rawValue"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 107
    iget-object v0, p0, Lcom/stripe/android/uicore/elements/AddressTextFieldController;->config:Lcom/stripe/android/uicore/elements/TextFieldConfig;

    invoke-interface {v0, p1}, Lcom/stripe/android/uicore/elements/TextFieldConfig;->convertFromRaw(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/stripe/android/uicore/elements/AddressTextFieldController;->onValueChange(Ljava/lang/String;)Lcom/stripe/android/uicore/elements/TextFieldState;

    return-void
.end method

.method public onValueChange(Ljava/lang/String;)Lcom/stripe/android/uicore/elements/TextFieldState;
    .locals 3

    const-string v0, "displayFormatted"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 84
    iget-object v0, p0, Lcom/stripe/android/uicore/elements/AddressTextFieldController;->_fieldState:Lkotlinx/coroutines/flow/MutableStateFlow;

    invoke-interface {v0}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/uicore/elements/TextFieldState;

    .line 85
    iget-object v1, p0, Lcom/stripe/android/uicore/elements/AddressTextFieldController;->_fieldValue:Lkotlinx/coroutines/flow/MutableStateFlow;

    iget-object v2, p0, Lcom/stripe/android/uicore/elements/AddressTextFieldController;->config:Lcom/stripe/android/uicore/elements/TextFieldConfig;

    invoke-interface {v2, p1}, Lcom/stripe/android/uicore/elements/TextFieldConfig;->filter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {v1, p1}, Lkotlinx/coroutines/flow/MutableStateFlow;->setValue(Ljava/lang/Object;)V

    .line 88
    iget-object p1, p0, Lcom/stripe/android/uicore/elements/AddressTextFieldController;->_fieldState:Lkotlinx/coroutines/flow/MutableStateFlow;

    iget-object v1, p0, Lcom/stripe/android/uicore/elements/AddressTextFieldController;->config:Lcom/stripe/android/uicore/elements/TextFieldConfig;

    iget-object v2, p0, Lcom/stripe/android/uicore/elements/AddressTextFieldController;->_fieldValue:Lkotlinx/coroutines/flow/MutableStateFlow;

    invoke-interface {v2}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-interface {v1, v2}, Lcom/stripe/android/uicore/elements/TextFieldConfig;->determineState(Ljava/lang/String;)Lcom/stripe/android/uicore/elements/TextFieldState;

    move-result-object v1

    invoke-interface {p1, v1}, Lkotlinx/coroutines/flow/MutableStateFlow;->setValue(Ljava/lang/Object;)V

    .line 90
    iget-object p1, p0, Lcom/stripe/android/uicore/elements/AddressTextFieldController;->_fieldState:Lkotlinx/coroutines/flow/MutableStateFlow;

    invoke-interface {p1}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    .line 91
    iget-object p1, p0, Lcom/stripe/android/uicore/elements/AddressTextFieldController;->_fieldState:Lkotlinx/coroutines/flow/MutableStateFlow;

    invoke-interface {p1}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/uicore/elements/TextFieldState;

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method
