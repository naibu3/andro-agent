.class public Lcom/stripe/android/view/StripeEditText;
.super Lcom/google/android/material/textfield/TextInputEditText;
.source "StripeEditText.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/view/StripeEditText$AfterTextChangedListener;,
        Lcom/stripe/android/view/StripeEditText$DeleteEmptyListener;,
        Lcom/stripe/android/view/StripeEditText$ErrorMessageListener;,
        Lcom/stripe/android/view/StripeEditText$SoftDeleteInputConnection;,
        Lcom/stripe/android/view/StripeEditText$StripeEditTextState;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nStripeEditText.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StripeEditText.kt\ncom/stripe/android/view/StripeEditText\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 TextView.kt\nandroidx/core/widget/TextViewKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,344:1\n1#2:345\n58#3,23:346\n93#3,3:369\n1863#4,2:372\n1863#4,2:374\n1863#4,2:376\n*S KotlinDebug\n*F\n+ 1 StripeEditText.kt\ncom/stripe/android/view/StripeEditText\n*L\n201#1:346,23\n201#1:369,3\n320#1:372,2\n324#1:374,2\n280#1:376,2\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0091\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\r\n\u0002\u0010\r\n\u0002\u0008\u0008*\u00012\u0008\u0017\u0018\u00002\u00020\u0001:\u0005fghijB\'\u0008\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0012\u0010>\u001a\u00020?2\u0008\u0010@\u001a\u0004\u0018\u00010\u0017H\u0016J\u0010\u0010>\u001a\u00020?2\u0006\u0010A\u001a\u00020\u0007H\u0016J\u0012\u0010B\u001a\u0004\u0018\u00010C2\u0006\u0010D\u001a\u00020EH\u0016J\u0010\u0010F\u001a\u00020?2\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0013J\u0010\u0010G\u001a\u00020?2\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0015J\u0010\u0010H\u001a\u00020?2\u0008\u0010/\u001a\u0004\u0018\u000100J\u0010\u0010I\u001a\u00020?2\u0008\u0010\'\u001a\u0004\u0018\u00010(J\u0010\u0010J\u001a\u00020?2\u0008\u0008\u0001\u0010K\u001a\u00020\u0007J\u0010\u0010L\u001a\u00020?2\u0006\u0010M\u001a\u00020NH\u0016J\u0008\u0010O\u001a\u00020?H\u0002J\u0008\u0010P\u001a\u00020?H\u0002J\u0008\u0010Q\u001a\u00020?H\u0002J\u0010\u0010R\u001a\u00020\u000b2\u0006\u0010S\u001a\u00020\u0007H\u0002J\u0008\u0010T\u001a\u00020UH\u0016J\u0012\u0010V\u001a\u00020?2\u0008\u0010W\u001a\u0004\u0018\u00010UH\u0016J\u0010\u0010X\u001a\u00020?2\u0008\u0010Y\u001a\u0004\u0018\u000108J\n\u0010Z\u001a\u0004\u0018\u000108H\u0016J\u0015\u0010[\u001a\n \\*\u0004\u0018\u00010808H\u0007\u00a2\u0006\u0002\u0010]J\u0012\u0010^\u001a\u00020?2\u0008\u0010_\u001a\u0004\u0018\u00010#H\u0016J\u0012\u0010`\u001a\u00020?2\u0008\u0010_\u001a\u0004\u0018\u00010#H\u0016J\u0017\u0010a\u001a\u00020?2\u0008\u0010b\u001a\u0004\u0018\u00010cH\u0000\u00a2\u0006\u0002\u0008dJ\u0008\u0010e\u001a\u00020?H\u0007R$\u0010\n\u001a\u00020\u000b8\u0000@\u0000X\u0081\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\u0008\u000c\u0010\r\u001a\u0004\u0008\u000e\u0010\u000f\"\u0004\u0008\u0010\u0010\u0011R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R$\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0017@AX\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0019\u0010\u001a\"\u0004\u0008\u001b\u0010\u001cR\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u001e\u001a\u00020\u00078\u0002@\u0002X\u0083\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u001f\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0083\u000e\u00a2\u0006\u0004\n\u0002\u0010 R\u0016\u0010!\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\"X\u0082\u000e\u00a2\u0006\u0002\n\u0000R$\u0010$\u001a\u00020\u000b2\u0006\u0010$\u001a\u00020\u000b@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008%\u0010\u000f\"\u0004\u0008&\u0010\u0011R\u001c\u0010\'\u001a\u0004\u0018\u00010(X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008)\u0010*\"\u0004\u0008+\u0010,R\u0014\u0010-\u001a\u00020(8@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008.\u0010*R\u0010\u0010/\u001a\u0004\u0018\u000100X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u00101\u001a\u000202X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u00103R\u0011\u00104\u001a\u00020\u00078G\u00a2\u0006\u0006\u001a\u0004\u00085\u00106R\u001c\u00107\u001a\u0008\u0012\u0004\u0012\u0002080\"8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00089\u0010:R\u0010\u0010;\u001a\u0004\u0018\u000108X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010<\u001a\u0004\u0018\u00010(X\u0094\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008=\u0010*\u00a8\u0006k"
    }
    d2 = {
        "Lcom/stripe/android/view/StripeEditText;",
        "Lcom/google/android/material/textfield/TextInputEditText;",
        "context",
        "Landroid/content/Context;",
        "attrs",
        "Landroid/util/AttributeSet;",
        "defStyleAttr",
        "",
        "<init>",
        "(Landroid/content/Context;Landroid/util/AttributeSet;I)V",
        "isLastKeyDelete",
        "",
        "isLastKeyDelete$payments_core_release$annotations",
        "()V",
        "isLastKeyDelete$payments_core_release",
        "()Z",
        "setLastKeyDelete$payments_core_release",
        "(Z)V",
        "afterTextChangedListener",
        "Lcom/stripe/android/view/StripeEditText$AfterTextChangedListener;",
        "deleteEmptyListener",
        "Lcom/stripe/android/view/StripeEditText$DeleteEmptyListener;",
        "value",
        "Landroid/content/res/ColorStateList;",
        "defaultColorStateList",
        "getDefaultColorStateList$payments_core_release",
        "()Landroid/content/res/ColorStateList;",
        "setDefaultColorStateList$payments_core_release",
        "(Landroid/content/res/ColorStateList;)V",
        "externalColorStateList",
        "defaultErrorColor",
        "externalErrorColor",
        "Ljava/lang/Integer;",
        "textWatchers",
        "",
        "Landroid/text/TextWatcher;",
        "shouldShowError",
        "getShouldShowError",
        "setShouldShowError",
        "errorMessage",
        "",
        "getErrorMessage$payments_core_release",
        "()Ljava/lang/String;",
        "setErrorMessage$payments_core_release",
        "(Ljava/lang/String;)V",
        "fieldText",
        "getFieldText$payments_core_release",
        "errorMessageListener",
        "Lcom/stripe/android/view/StripeEditText$ErrorMessageListener;",
        "isLastKeyDeleteTextWatcher",
        "com/stripe/android/view/StripeEditText$isLastKeyDeleteTextWatcher$1",
        "Lcom/stripe/android/view/StripeEditText$isLastKeyDeleteTextWatcher$1;",
        "defaultErrorColorInt",
        "getDefaultErrorColorInt",
        "()I",
        "internalFocusChangeListeners",
        "Landroid/view/View$OnFocusChangeListener;",
        "getInternalFocusChangeListeners",
        "()Ljava/util/List;",
        "externalFocusChangeListener",
        "accessibilityText",
        "getAccessibilityText",
        "setTextColor",
        "",
        "colors",
        "color",
        "onCreateInputConnection",
        "Landroid/view/inputmethod/InputConnection;",
        "outAttrs",
        "Landroid/view/inputmethod/EditorInfo;",
        "setAfterTextChangedListener",
        "setDeleteEmptyListener",
        "setErrorMessageListener",
        "setErrorMessage",
        "setErrorColor",
        "errorColor",
        "onInitializeAccessibilityNodeInfo",
        "info",
        "Landroid/view/accessibility/AccessibilityNodeInfo;",
        "determineDefaultErrorColor",
        "listenForTextChanges",
        "listenForDeleteEmpty",
        "isDeleteKey",
        "keyCode",
        "onSaveInstanceState",
        "Landroid/os/Parcelable;",
        "onRestoreInstanceState",
        "state",
        "setOnFocusChangeListener",
        "listener",
        "getOnFocusChangeListener",
        "getParentOnFocusChangeListener",
        "kotlin.jvm.PlatformType",
        "()Landroid/view/View$OnFocusChangeListener;",
        "addTextChangedListener",
        "watcher",
        "removeTextChangedListener",
        "setTextSilent",
        "text",
        "",
        "setTextSilent$payments_core_release",
        "setNumberOnlyInputType",
        "DeleteEmptyListener",
        "AfterTextChangedListener",
        "ErrorMessageListener",
        "SoftDeleteInputConnection",
        "StripeEditTextState",
        "payments-core_release"
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
.field private final accessibilityText:Ljava/lang/String;

.field private afterTextChangedListener:Lcom/stripe/android/view/StripeEditText$AfterTextChangedListener;

.field private defaultColorStateList:Landroid/content/res/ColorStateList;

.field private defaultErrorColor:I

.field private deleteEmptyListener:Lcom/stripe/android/view/StripeEditText$DeleteEmptyListener;

.field private errorMessage:Ljava/lang/String;

.field private errorMessageListener:Lcom/stripe/android/view/StripeEditText$ErrorMessageListener;

.field private externalColorStateList:Landroid/content/res/ColorStateList;

.field private externalErrorColor:Ljava/lang/Integer;

.field private externalFocusChangeListener:Landroid/view/View$OnFocusChangeListener;

.field private final internalFocusChangeListeners:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroid/view/View$OnFocusChangeListener;",
            ">;"
        }
    .end annotation
.end field

.field private isLastKeyDelete:Z

.field private final isLastKeyDeleteTextWatcher:Lcom/stripe/android/view/StripeEditText$isLastKeyDeleteTextWatcher$1;

.field private shouldShowError:Z

.field private textWatchers:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroid/text/TextWatcher;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static synthetic $r8$lambda$_GwyZobl3KY25y98capcF2GLXcw(Lcom/stripe/android/view/StripeEditText;Landroid/view/View;ILandroid/view/KeyEvent;)Z
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/stripe/android/view/StripeEditText;->listenForDeleteEmpty$lambda$6(Lcom/stripe/android/view/StripeEditText;Landroid/view/View;ILandroid/view/KeyEvent;)Z

    move-result p0

    return p0
.end method

.method public static synthetic $r8$lambda$eF69gMeBkuQqRlzuKy_cYZYLi3I(Lcom/stripe/android/view/StripeEditText;Landroid/view/View;Z)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/stripe/android/view/StripeEditText;->setOnFocusChangeListener$lambda$8(Lcom/stripe/android/view/StripeEditText;Landroid/view/View;Z)V

    return-void
.end method

.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 7

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    invoke-direct/range {v1 .. v6}, Lcom/stripe/android/view/StripeEditText;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 7

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v1 .. v6}, Lcom/stripe/android/view/StripeEditText;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 36
    invoke-direct {p0, p1, p2, p3}, Lcom/google/android/material/textfield/TextInputEditText;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 91
    new-instance p1, Lcom/stripe/android/view/StripeEditText$isLastKeyDeleteTextWatcher$1;

    invoke-direct {p1, p0}, Lcom/stripe/android/view/StripeEditText$isLastKeyDeleteTextWatcher$1;-><init>(Lcom/stripe/android/view/StripeEditText;)V

    iput-object p1, p0, Lcom/stripe/android/view/StripeEditText;->isLastKeyDeleteTextWatcher:Lcom/stripe/android/view/StripeEditText$isLastKeyDeleteTextWatcher$1;

    .line 110
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    check-cast p1, Ljava/util/List;

    iput-object p1, p0, Lcom/stripe/android/view/StripeEditText;->textWatchers:Ljava/util/List;

    const/4 p1, 0x1

    .line 111
    invoke-virtual {p0, p1}, Lcom/stripe/android/view/StripeEditText;->setMaxLines(I)V

    .line 113
    invoke-direct {p0}, Lcom/stripe/android/view/StripeEditText;->listenForTextChanges()V

    .line 114
    invoke-direct {p0}, Lcom/stripe/android/view/StripeEditText;->listenForDeleteEmpty()V

    .line 115
    invoke-virtual {p0}, Lcom/stripe/android/view/StripeEditText;->getTextColors()Landroid/content/res/ColorStateList;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/view/StripeEditText;->defaultColorStateList:Landroid/content/res/ColorStateList;

    .line 116
    invoke-direct {p0}, Lcom/stripe/android/view/StripeEditText;->determineDefaultErrorColor()V

    const/4 p1, 0x0

    .line 119
    invoke-virtual {p0, p1}, Lcom/stripe/android/view/StripeEditText;->setOnFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V

    .line 123
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    check-cast p1, Ljava/util/List;

    iput-object p1, p0, Lcom/stripe/android/view/StripeEditText;->internalFocusChangeListeners:Ljava/util/List;

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    const/4 p2, 0x0

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    .line 35
    sget p3, Landroidx/appcompat/R$attr;->editTextStyle:I

    .line 32
    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lcom/stripe/android/view/StripeEditText;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public static final synthetic access$getAfterTextChangedListener$p(Lcom/stripe/android/view/StripeEditText;)Lcom/stripe/android/view/StripeEditText$AfterTextChangedListener;
    .locals 0

    .line 32
    iget-object p0, p0, Lcom/stripe/android/view/StripeEditText;->afterTextChangedListener:Lcom/stripe/android/view/StripeEditText$AfterTextChangedListener;

    return-object p0
.end method

.method private final determineDefaultErrorColor()V
    .locals 3

    .line 189
    invoke-virtual {p0}, Lcom/stripe/android/view/StripeEditText;->getContext()Landroid/content/Context;

    move-result-object v0

    .line 190
    sget-object v1, Lcom/stripe/android/view/StripeColorUtils;->Companion:Lcom/stripe/android/view/StripeColorUtils$Companion;

    iget-object v2, p0, Lcom/stripe/android/view/StripeEditText;->defaultColorStateList:Landroid/content/res/ColorStateList;

    invoke-virtual {v2}, Landroid/content/res/ColorStateList;->getDefaultColor()I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/stripe/android/view/StripeColorUtils$Companion;->isColorDark(I)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 193
    sget v1, Lcom/stripe/android/R$color;->stripe_error_text_light_theme:I

    goto :goto_0

    .line 195
    :cond_0
    sget v1, Lcom/stripe/android/R$color;->stripe_error_text_dark_theme:I

    .line 188
    :goto_0
    invoke-static {v0, v1}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v0

    iput v0, p0, Lcom/stripe/android/view/StripeEditText;->defaultErrorColor:I

    return-void
.end method

.method private final isDeleteKey(I)Z
    .locals 1

    const/16 v0, 0x43

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public static synthetic isLastKeyDelete$payments_core_release$annotations()V
    .locals 0

    return-void
.end method

.method private final listenForDeleteEmpty()V
    .locals 2

    .line 210
    iget-object v0, p0, Lcom/stripe/android/view/StripeEditText;->textWatchers:Ljava/util/List;

    if-nez v0, :cond_0

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v0

    :cond_0
    iget-object v1, p0, Lcom/stripe/android/view/StripeEditText;->isLastKeyDeleteTextWatcher:Lcom/stripe/android/view/StripeEditText$isLastKeyDeleteTextWatcher$1;

    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 211
    iget-object v0, p0, Lcom/stripe/android/view/StripeEditText;->isLastKeyDeleteTextWatcher:Lcom/stripe/android/view/StripeEditText$isLastKeyDeleteTextWatcher$1;

    check-cast v0, Landroid/text/TextWatcher;

    invoke-virtual {p0, v0}, Lcom/stripe/android/view/StripeEditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 215
    :cond_1
    new-instance v0, Lcom/stripe/android/view/StripeEditText$$ExternalSyntheticLambda0;

    invoke-direct {v0, p0}, Lcom/stripe/android/view/StripeEditText$$ExternalSyntheticLambda0;-><init>(Lcom/stripe/android/view/StripeEditText;)V

    invoke-virtual {p0, v0}, Lcom/stripe/android/view/StripeEditText;->setOnKeyListener(Landroid/view/View$OnKeyListener;)V

    return-void
.end method

.method private static final listenForDeleteEmpty$lambda$6(Lcom/stripe/android/view/StripeEditText;Landroid/view/View;ILandroid/view/KeyEvent;)Z
    .locals 0

    .line 216
    invoke-virtual {p3}, Landroid/view/KeyEvent;->getAction()I

    move-result p1

    if-nez p1, :cond_0

    .line 218
    invoke-direct {p0, p2}, Lcom/stripe/android/view/StripeEditText;->isDeleteKey(I)Z

    move-result p1

    .line 219
    iput-boolean p1, p0, Lcom/stripe/android/view/StripeEditText;->isLastKeyDelete:Z

    if-eqz p1, :cond_0

    .line 221
    invoke-virtual {p0}, Lcom/stripe/android/view/StripeEditText;->length()I

    move-result p1

    if-nez p1, :cond_0

    .line 222
    iget-object p0, p0, Lcom/stripe/android/view/StripeEditText;->deleteEmptyListener:Lcom/stripe/android/view/StripeEditText$DeleteEmptyListener;

    if-eqz p0, :cond_0

    invoke-interface {p0}, Lcom/stripe/android/view/StripeEditText$DeleteEmptyListener;->onDeleteEmpty()V

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method private final listenForTextChanges()V
    .locals 2

    .line 201
    move-object v0, p0

    check-cast v0, Landroid/widget/TextView;

    .line 368
    new-instance v1, Lcom/stripe/android/view/StripeEditText$listenForTextChanges$$inlined$doAfterTextChanged$1;

    invoke-direct {v1, p0}, Lcom/stripe/android/view/StripeEditText$listenForTextChanges$$inlined$doAfterTextChanged$1;-><init>(Lcom/stripe/android/view/StripeEditText;)V

    .line 369
    check-cast v1, Landroid/text/TextWatcher;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    return-void
.end method

.method private static final setOnFocusChangeListener$lambda$8(Lcom/stripe/android/view/StripeEditText;Landroid/view/View;Z)V
    .locals 2

    .line 280
    iget-object v0, p0, Lcom/stripe/android/view/StripeEditText;->internalFocusChangeListeners:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    .line 376
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/View$OnFocusChangeListener;

    .line 281
    invoke-interface {v1, p1, p2}, Landroid/view/View$OnFocusChangeListener;->onFocusChange(Landroid/view/View;Z)V

    goto :goto_0

    .line 284
    :cond_0
    iget-object p0, p0, Lcom/stripe/android/view/StripeEditText;->externalFocusChangeListener:Landroid/view/View$OnFocusChangeListener;

    if-eqz p0, :cond_1

    invoke-interface {p0, p1, p2}, Landroid/view/View$OnFocusChangeListener;->onFocusChange(Landroid/view/View;Z)V

    :cond_1
    return-void
.end method


# virtual methods
.method public addTextChangedListener(Landroid/text/TextWatcher;)V
    .locals 1

    .line 301
    invoke-super {p0, p1}, Lcom/google/android/material/textfield/TextInputEditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    if-eqz p1, :cond_0

    .line 304
    iget-object v0, p0, Lcom/stripe/android/view/StripeEditText;->textWatchers:Ljava/util/List;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method protected getAccessibilityText()Ljava/lang/String;
    .locals 1

    .line 126
    iget-object v0, p0, Lcom/stripe/android/view/StripeEditText;->accessibilityText:Ljava/lang/String;

    return-object v0
.end method

.method public final getDefaultColorStateList$payments_core_release()Landroid/content/res/ColorStateList;
    .locals 1

    .line 43
    iget-object v0, p0, Lcom/stripe/android/view/StripeEditText;->defaultColorStateList:Landroid/content/res/ColorStateList;

    return-object v0
.end method

.method public final getDefaultErrorColorInt()I
    .locals 1

    .line 105
    invoke-direct {p0}, Lcom/stripe/android/view/StripeEditText;->determineDefaultErrorColor()V

    .line 106
    iget v0, p0, Lcom/stripe/android/view/StripeEditText;->defaultErrorColor:I

    return v0
.end method

.method public final getErrorMessage$payments_core_release()Ljava/lang/String;
    .locals 1

    .line 82
    iget-object v0, p0, Lcom/stripe/android/view/StripeEditText;->errorMessage:Ljava/lang/String;

    return-object v0
.end method

.method public final getFieldText$payments_core_release()Ljava/lang/String;
    .locals 1

    .line 86
    invoke-virtual {p0}, Lcom/stripe/android/view/StripeEditText;->getText()Landroid/text/Editable;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    const-string v0, ""

    :cond_1
    return-object v0
.end method

.method public final getInternalFocusChangeListeners()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Landroid/view/View$OnFocusChangeListener;",
            ">;"
        }
    .end annotation

    .line 122
    iget-object v0, p0, Lcom/stripe/android/view/StripeEditText;->internalFocusChangeListeners:Ljava/util/List;

    return-object v0
.end method

.method public getOnFocusChangeListener()Landroid/view/View$OnFocusChangeListener;
    .locals 1

    .line 290
    iget-object v0, p0, Lcom/stripe/android/view/StripeEditText;->externalFocusChangeListener:Landroid/view/View$OnFocusChangeListener;

    return-object v0
.end method

.method public final getParentOnFocusChangeListener()Landroid/view/View$OnFocusChangeListener;
    .locals 1

    .line 295
    invoke-super {p0}, Lcom/google/android/material/textfield/TextInputEditText;->getOnFocusChangeListener()Landroid/view/View$OnFocusChangeListener;

    move-result-object v0

    return-object v0
.end method

.method public final getShouldShowError()Z
    .locals 1

    .line 63
    iget-boolean v0, p0, Lcom/stripe/android/view/StripeEditText;->shouldShowError:Z

    return v0
.end method

.method public final isLastKeyDelete$payments_core_release()Z
    .locals 1

    .line 37
    iget-boolean v0, p0, Lcom/stripe/android/view/StripeEditText;->isLastKeyDelete:Z

    return v0
.end method

.method public onCreateInputConnection(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;
    .locals 3

    const-string v0, "outAttrs"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 138
    invoke-super {p0, p1}, Lcom/google/android/material/textfield/TextInputEditText;->onCreateInputConnection(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 140
    new-instance v0, Lcom/stripe/android/view/StripeEditText$SoftDeleteInputConnection;

    const/4 v1, 0x1

    iget-object v2, p0, Lcom/stripe/android/view/StripeEditText;->deleteEmptyListener:Lcom/stripe/android/view/StripeEditText$DeleteEmptyListener;

    invoke-direct {v0, p1, v1, v2}, Lcom/stripe/android/view/StripeEditText$SoftDeleteInputConnection;-><init>(Landroid/view/inputmethod/InputConnection;ZLcom/stripe/android/view/StripeEditText$DeleteEmptyListener;)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 139
    :goto_0
    check-cast v0, Landroid/view/inputmethod/InputConnection;

    return-object v0
.end method

.method public onInitializeAccessibilityNodeInfo(Landroid/view/accessibility/AccessibilityNodeInfo;)V
    .locals 2

    const-string v0, "info"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 181
    invoke-super {p0, p1}, Lcom/google/android/material/textfield/TextInputEditText;->onInitializeAccessibilityNodeInfo(Landroid/view/accessibility/AccessibilityNodeInfo;)V

    .line 182
    iget-boolean v0, p0, Lcom/stripe/android/view/StripeEditText;->shouldShowError:Z

    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->setContentInvalid(Z)V

    .line 183
    invoke-virtual {p0}, Lcom/stripe/android/view/StripeEditText;->getAccessibilityText()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    check-cast v0, Ljava/lang/CharSequence;

    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->setText(Ljava/lang/CharSequence;)V

    .line 184
    :cond_0
    iget-object v0, p0, Lcom/stripe/android/view/StripeEditText;->errorMessage:Ljava/lang/String;

    iget-boolean v1, p0, Lcom/stripe/android/view/StripeEditText;->shouldShowError:Z

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    check-cast v0, Ljava/lang/CharSequence;

    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->setError(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public onRestoreInstanceState(Landroid/os/Parcelable;)V
    .locals 1

    .line 255
    instance-of v0, p1, Lcom/stripe/android/view/StripeEditText$StripeEditTextState;

    if-eqz v0, :cond_0

    .line 256
    check-cast p1, Lcom/stripe/android/view/StripeEditText$StripeEditTextState;

    invoke-virtual {p1}, Lcom/stripe/android/view/StripeEditText$StripeEditTextState;->getSuperState()Landroid/os/Parcelable;

    move-result-object v0

    invoke-super {p0, v0}, Lcom/google/android/material/textfield/TextInputEditText;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    .line 257
    invoke-virtual {p1}, Lcom/stripe/android/view/StripeEditText$StripeEditTextState;->getErrorMessage()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/stripe/android/view/StripeEditText;->errorMessage:Ljava/lang/String;

    .line 258
    invoke-virtual {p1}, Lcom/stripe/android/view/StripeEditText$StripeEditTextState;->getShouldShowError()Z

    move-result p1

    invoke-virtual {p0, p1}, Lcom/stripe/android/view/StripeEditText;->setShouldShowError(Z)V

    return-void

    .line 260
    :cond_0
    invoke-super {p0, p1}, Lcom/google/android/material/textfield/TextInputEditText;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    return-void
.end method

.method public onSaveInstanceState()Landroid/os/Parcelable;
    .locals 4

    .line 247
    new-instance v0, Lcom/stripe/android/view/StripeEditText$StripeEditTextState;

    .line 248
    invoke-super {p0}, Lcom/google/android/material/textfield/TextInputEditText;->onSaveInstanceState()Landroid/os/Parcelable;

    move-result-object v1

    .line 249
    iget-object v2, p0, Lcom/stripe/android/view/StripeEditText;->errorMessage:Ljava/lang/String;

    .line 250
    iget-boolean v3, p0, Lcom/stripe/android/view/StripeEditText;->shouldShowError:Z

    .line 247
    invoke-direct {v0, v1, v2, v3}, Lcom/stripe/android/view/StripeEditText$StripeEditTextState;-><init>(Landroid/os/Parcelable;Ljava/lang/String;Z)V

    check-cast v0, Landroid/os/Parcelable;

    return-object v0
.end method

.method public removeTextChangedListener(Landroid/text/TextWatcher;)V
    .locals 1

    .line 309
    invoke-super {p0, p1}, Lcom/google/android/material/textfield/TextInputEditText;->removeTextChangedListener(Landroid/text/TextWatcher;)V

    if-eqz p1, :cond_0

    .line 312
    iget-object v0, p0, Lcom/stripe/android/view/StripeEditText;->textWatchers:Ljava/util/List;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method public final setAfterTextChangedListener(Lcom/stripe/android/view/StripeEditText$AfterTextChangedListener;)V
    .locals 0

    .line 151
    iput-object p1, p0, Lcom/stripe/android/view/StripeEditText;->afterTextChangedListener:Lcom/stripe/android/view/StripeEditText$AfterTextChangedListener;

    return-void
.end method

.method public final setDefaultColorStateList$payments_core_release(Landroid/content/res/ColorStateList;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 44
    iput-object p1, p0, Lcom/stripe/android/view/StripeEditText;->defaultColorStateList:Landroid/content/res/ColorStateList;

    return-void
.end method

.method public final setDeleteEmptyListener(Lcom/stripe/android/view/StripeEditText$DeleteEmptyListener;)V
    .locals 0

    .line 160
    iput-object p1, p0, Lcom/stripe/android/view/StripeEditText;->deleteEmptyListener:Lcom/stripe/android/view/StripeEditText$DeleteEmptyListener;

    return-void
.end method

.method public final setErrorColor(I)V
    .locals 0

    .line 177
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/view/StripeEditText;->externalErrorColor:Ljava/lang/Integer;

    return-void
.end method

.method public final setErrorMessage(Ljava/lang/String;)V
    .locals 0

    .line 168
    iput-object p1, p0, Lcom/stripe/android/view/StripeEditText;->errorMessage:Ljava/lang/String;

    return-void
.end method

.method public final setErrorMessage$payments_core_release(Ljava/lang/String;)V
    .locals 0

    .line 82
    iput-object p1, p0, Lcom/stripe/android/view/StripeEditText;->errorMessage:Ljava/lang/String;

    return-void
.end method

.method public final setErrorMessageListener(Lcom/stripe/android/view/StripeEditText$ErrorMessageListener;)V
    .locals 0

    .line 164
    iput-object p1, p0, Lcom/stripe/android/view/StripeEditText;->errorMessageListener:Lcom/stripe/android/view/StripeEditText$ErrorMessageListener;

    return-void
.end method

.method public final setLastKeyDelete$payments_core_release(Z)V
    .locals 0

    .line 37
    iput-boolean p1, p0, Lcom/stripe/android/view/StripeEditText;->isLastKeyDelete:Z

    return-void
.end method

.method public final setNumberOnlyInputType()V
    .locals 2

    .line 331
    invoke-virtual {p0}, Lcom/stripe/android/view/StripeEditText;->getTypeface()Landroid/graphics/Typeface;

    move-result-object v0

    const/16 v1, 0x12

    .line 332
    invoke-virtual {p0, v1}, Lcom/stripe/android/view/StripeEditText;->setInputType(I)V

    .line 333
    invoke-virtual {p0, v0}, Lcom/stripe/android/view/StripeEditText;->setTypeface(Landroid/graphics/Typeface;)V

    .line 334
    invoke-static {}, Landroid/text/method/HideReturnsTransformationMethod;->getInstance()Landroid/text/method/HideReturnsTransformationMethod;

    move-result-object v0

    check-cast v0, Landroid/text/method/TransformationMethod;

    invoke-virtual {p0, v0}, Lcom/stripe/android/view/StripeEditText;->setTransformationMethod(Landroid/text/method/TransformationMethod;)V

    return-void
.end method

.method public final setOnFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V
    .locals 1

    .line 279
    new-instance v0, Lcom/stripe/android/view/StripeEditText$$ExternalSyntheticLambda1;

    invoke-direct {v0, p0}, Lcom/stripe/android/view/StripeEditText$$ExternalSyntheticLambda1;-><init>(Lcom/stripe/android/view/StripeEditText;)V

    invoke-super {p0, v0}, Lcom/google/android/material/textfield/TextInputEditText;->setOnFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V

    .line 287
    iput-object p1, p0, Lcom/stripe/android/view/StripeEditText;->externalFocusChangeListener:Landroid/view/View$OnFocusChangeListener;

    return-void
.end method

.method public final setShouldShowError(Z)V
    .locals 3

    .line 65
    iget-object v0, p0, Lcom/stripe/android/view/StripeEditText;->errorMessage:Ljava/lang/String;

    if-eqz v0, :cond_1

    .line 66
    iget-object v1, p0, Lcom/stripe/android/view/StripeEditText;->errorMessageListener:Lcom/stripe/android/view/StripeEditText$ErrorMessageListener;

    if-eqz v1, :cond_1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-interface {v1, v0}, Lcom/stripe/android/view/StripeEditText$ErrorMessageListener;->displayErrorMessage(Ljava/lang/String;)V

    .line 69
    :cond_1
    iget-boolean v0, p0, Lcom/stripe/android/view/StripeEditText;->shouldShowError:Z

    if-eq v0, p1, :cond_5

    if-eqz p1, :cond_3

    .line 72
    iget-object v0, p0, Lcom/stripe/android/view/StripeEditText;->externalErrorColor:Ljava/lang/Integer;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    goto :goto_1

    :cond_2
    iget v0, p0, Lcom/stripe/android/view/StripeEditText;->defaultErrorColor:I

    :goto_1
    invoke-super {p0, v0}, Lcom/google/android/material/textfield/TextInputEditText;->setTextColor(I)V

    goto :goto_2

    .line 74
    :cond_3
    iget-object v0, p0, Lcom/stripe/android/view/StripeEditText;->externalColorStateList:Landroid/content/res/ColorStateList;

    if-nez v0, :cond_4

    iget-object v0, p0, Lcom/stripe/android/view/StripeEditText;->defaultColorStateList:Landroid/content/res/ColorStateList;

    :cond_4
    invoke-super {p0, v0}, Lcom/google/android/material/textfield/TextInputEditText;->setTextColor(Landroid/content/res/ColorStateList;)V

    .line 76
    :goto_2
    invoke-virtual {p0}, Lcom/stripe/android/view/StripeEditText;->refreshDrawableState()V

    .line 79
    :cond_5
    iput-boolean p1, p0, Lcom/stripe/android/view/StripeEditText;->shouldShowError:Z

    return-void
.end method

.method public setTextColor(I)V
    .locals 0

    .line 135
    invoke-static {p1}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/stripe/android/view/StripeEditText;->setTextColor(Landroid/content/res/ColorStateList;)V

    return-void
.end method

.method public setTextColor(Landroid/content/res/ColorStateList;)V
    .locals 0

    .line 129
    invoke-super {p0, p1}, Lcom/google/android/material/textfield/TextInputEditText;->setTextColor(Landroid/content/res/ColorStateList;)V

    .line 132
    invoke-virtual {p0}, Lcom/stripe/android/view/StripeEditText;->getTextColors()Landroid/content/res/ColorStateList;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/view/StripeEditText;->externalColorStateList:Landroid/content/res/ColorStateList;

    return-void
.end method

.method public final setTextSilent$payments_core_release(Ljava/lang/CharSequence;)V
    .locals 2

    .line 320
    iget-object v0, p0, Lcom/stripe/android/view/StripeEditText;->textWatchers:Ljava/util/List;

    if-eqz v0, :cond_0

    check-cast v0, Ljava/lang/Iterable;

    .line 372
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/text/TextWatcher;

    .line 321
    invoke-super {p0, v1}, Lcom/google/android/material/textfield/TextInputEditText;->removeTextChangedListener(Landroid/text/TextWatcher;)V

    goto :goto_0

    .line 323
    :cond_0
    invoke-virtual {p0, p1}, Lcom/stripe/android/view/StripeEditText;->setText(Ljava/lang/CharSequence;)V

    .line 324
    iget-object p1, p0, Lcom/stripe/android/view/StripeEditText;->textWatchers:Ljava/util/List;

    if-eqz p1, :cond_1

    check-cast p1, Ljava/lang/Iterable;

    .line 374
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/text/TextWatcher;

    .line 325
    invoke-super {p0, v0}, Lcom/google/android/material/textfield/TextInputEditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    goto :goto_1

    :cond_1
    return-void
.end method
