.class public interface abstract Lcom/stripe/android/uicore/elements/TextFieldController;
.super Ljava/lang/Object;
.source "TextFieldController.kt"

# interfaces
.implements Lcom/stripe/android/uicore/elements/InputController;
.implements Lcom/stripe/android/uicore/elements/SectionFieldComposable;
.implements Lcom/stripe/android/uicore/elements/SectionFieldErrorController;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/uicore/elements/TextFieldController$DefaultImpls;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008g\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\u0008\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH&J\u0010\u0010\u000c\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000eH\u0016J=\u0010?\u001a\u00020\t2\u0006\u0010;\u001a\u00020\u000b2\u0006\u0010@\u001a\u00020A2\u0006\u0010B\u001a\u00020C2\u000c\u0010D\u001a\u0008\u0012\u0004\u0012\u00020F0E2\u0008\u0010G\u001a\u0004\u0018\u00010FH\u0017\u00a2\u0006\u0002\u0010HR\u0014\u0010\u000f\u001a\u0004\u0018\u00010\u0007X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0014\u0010\u0015R\u0012\u0010\u0016\u001a\u00020\u0007X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0017\u0010\u0011R\u001a\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u0019X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001b\u0010\u001cR\u0012\u0010\u001d\u001a\u00020\u001eX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001f\u0010 R\u0012\u0010!\u001a\u00020\"X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008#\u0010 R\u0014\u0010$\u001a\u0004\u0018\u00010%X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008&\u0010\'R\u0018\u0010(\u001a\u0008\u0012\u0004\u0012\u00020)0\u0019X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008*\u0010\u001cR\u0018\u0010+\u001a\u0008\u0012\u0004\u0012\u00020,0\u0019X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008-\u0010\u001cR\u0012\u0010.\u001a\u00020\u000bX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008/\u00100R\u0018\u00101\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0019X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u00082\u0010\u001cR\u0018\u00103\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0019X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u00084\u0010\u001cR\u0018\u00105\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\u0019X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u00086\u0010\u001cR\u0018\u00107\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\u0019X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u00088\u0010\u001cR\u001c\u00109\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00198VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008:\u0010\u001cR\u0014\u0010;\u001a\u00020\u000b8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008<\u00100R\u0018\u0010=\u001a\u0008\u0012\u0004\u0012\u00020)0\u0019X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008>\u0010\u001c\u00a8\u0006I"
    }
    d2 = {
        "Lcom/stripe/android/uicore/elements/TextFieldController;",
        "Lcom/stripe/android/uicore/elements/InputController;",
        "Lcom/stripe/android/uicore/elements/SectionFieldComposable;",
        "Lcom/stripe/android/uicore/elements/SectionFieldErrorController;",
        "onValueChange",
        "Lcom/stripe/android/uicore/elements/TextFieldState;",
        "displayFormatted",
        "",
        "onFocusChange",
        "",
        "newHasFocus",
        "",
        "onDropdownItemClicked",
        "item",
        "Lcom/stripe/android/uicore/elements/TextFieldIcon$Dropdown$Item;",
        "initialValue",
        "getInitialValue",
        "()Ljava/lang/String;",
        "autofillType",
        "Landroidx/compose/ui/autofill/AutofillType;",
        "getAutofillType",
        "()Landroidx/compose/ui/autofill/AutofillType;",
        "debugLabel",
        "getDebugLabel",
        "trailingIcon",
        "Lkotlinx/coroutines/flow/StateFlow;",
        "Lcom/stripe/android/uicore/elements/TextFieldIcon;",
        "getTrailingIcon",
        "()Lkotlinx/coroutines/flow/StateFlow;",
        "capitalization",
        "Landroidx/compose/ui/text/input/KeyboardCapitalization;",
        "getCapitalization-IUNYP9k",
        "()I",
        "keyboardType",
        "Landroidx/compose/ui/text/input/KeyboardType;",
        "getKeyboardType-PjHm6EE",
        "layoutDirection",
        "Landroidx/compose/ui/unit/LayoutDirection;",
        "getLayoutDirection",
        "()Landroidx/compose/ui/unit/LayoutDirection;",
        "label",
        "Lcom/stripe/android/core/strings/ResolvableString;",
        "getLabel",
        "visualTransformation",
        "Landroidx/compose/ui/text/input/VisualTransformation;",
        "getVisualTransformation",
        "showOptionalLabel",
        "getShowOptionalLabel",
        "()Z",
        "fieldState",
        "getFieldState",
        "fieldValue",
        "getFieldValue",
        "visibleError",
        "getVisibleError",
        "loading",
        "getLoading",
        "placeHolder",
        "getPlaceHolder",
        "enabled",
        "getEnabled",
        "contentDescription",
        "getContentDescription",
        "ComposeUI",
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


# virtual methods
.method public abstract ComposeUI(ZLcom/stripe/android/uicore/elements/SectionFieldElement;Landroidx/compose/ui/Modifier;Ljava/util/Set;Lcom/stripe/android/uicore/elements/IdentifierSpec;Landroidx/compose/runtime/Composer;I)V
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
.end method

.method public abstract getAutofillType()Landroidx/compose/ui/autofill/AutofillType;
.end method

.method public abstract getCapitalization-IUNYP9k()I
.end method

.method public abstract getContentDescription()Lkotlinx/coroutines/flow/StateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Lcom/stripe/android/core/strings/ResolvableString;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getDebugLabel()Ljava/lang/String;
.end method

.method public abstract getEnabled()Z
.end method

.method public abstract getFieldState()Lkotlinx/coroutines/flow/StateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Lcom/stripe/android/uicore/elements/TextFieldState;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getFieldValue()Lkotlinx/coroutines/flow/StateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getInitialValue()Ljava/lang/String;
.end method

.method public abstract getKeyboardType-PjHm6EE()I
.end method

.method public abstract getLabel()Lkotlinx/coroutines/flow/StateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Lcom/stripe/android/core/strings/ResolvableString;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getLayoutDirection()Landroidx/compose/ui/unit/LayoutDirection;
.end method

.method public abstract getLoading()Lkotlinx/coroutines/flow/StateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getPlaceHolder()Lkotlinx/coroutines/flow/StateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getShowOptionalLabel()Z
.end method

.method public abstract getTrailingIcon()Lkotlinx/coroutines/flow/StateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Lcom/stripe/android/uicore/elements/TextFieldIcon;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getVisibleError()Lkotlinx/coroutines/flow/StateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getVisualTransformation()Lkotlinx/coroutines/flow/StateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Landroidx/compose/ui/text/input/VisualTransformation;",
            ">;"
        }
    .end annotation
.end method

.method public abstract onDropdownItemClicked(Lcom/stripe/android/uicore/elements/TextFieldIcon$Dropdown$Item;)V
.end method

.method public abstract onFocusChange(Z)V
.end method

.method public abstract onValueChange(Ljava/lang/String;)Lcom/stripe/android/uicore/elements/TextFieldState;
.end method
