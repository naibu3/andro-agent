.class public final Lcom/stripe/android/uicore/elements/CheckboxFieldController;
.super Ljava/lang/Object;
.source "CheckboxFieldController.kt"

# interfaces
.implements Lcom/stripe/android/uicore/elements/SectionFieldErrorController;
.implements Lcom/stripe/android/uicore/elements/SectionFieldComposable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/uicore/elements/CheckboxFieldController$LabelResource;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001&B\'\u0012\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\t\u0010\nJ\u000e\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0008J=\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u00082\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u000c\u0010!\u001a\u0008\u0012\u0004\u0012\u00020#0\"2\u0008\u0010$\u001a\u0004\u0018\u00010#H\u0017\u00a2\u0006\u0002\u0010%R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000cR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0008X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00138F\u00a2\u0006\u0006\u001a\u0004\u0008\u0012\u0010\u0014R\u001c\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0013X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0017\u0010\u0014\u00a8\u0006\'"
    }
    d2 = {
        "Lcom/stripe/android/uicore/elements/CheckboxFieldController;",
        "Lcom/stripe/android/uicore/elements/SectionFieldErrorController;",
        "Lcom/stripe/android/uicore/elements/SectionFieldComposable;",
        "labelResource",
        "Lcom/stripe/android/uicore/elements/CheckboxFieldController$LabelResource;",
        "debugTag",
        "",
        "initialValue",
        "",
        "<init>",
        "(Lcom/stripe/android/uicore/elements/CheckboxFieldController$LabelResource;Ljava/lang/String;Z)V",
        "getLabelResource",
        "()Lcom/stripe/android/uicore/elements/CheckboxFieldController$LabelResource;",
        "getDebugTag",
        "()Ljava/lang/String;",
        "hasBeenEdited",
        "_isChecked",
        "Lkotlinx/coroutines/flow/MutableStateFlow;",
        "isChecked",
        "Lkotlinx/coroutines/flow/StateFlow;",
        "()Lkotlinx/coroutines/flow/StateFlow;",
        "error",
        "Lcom/stripe/android/uicore/elements/FieldError;",
        "getError",
        "onValueChange",
        "",
        "value",
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
        "LabelResource",
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
.field private final _isChecked:Lkotlinx/coroutines/flow/MutableStateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/MutableStateFlow<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final debugTag:Ljava/lang/String;

.field private final error:Lkotlinx/coroutines/flow/StateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Lcom/stripe/android/uicore/elements/FieldError;",
            ">;"
        }
    .end annotation
.end field

.field private hasBeenEdited:Z

.field private final labelResource:Lcom/stripe/android/uicore/elements/CheckboxFieldController$LabelResource;


# direct methods
.method public static synthetic $r8$lambda$vYuZ7YcGoj_y61H4b6YSWKmj-zg(Lcom/stripe/android/uicore/elements/CheckboxFieldController;Z)Lcom/stripe/android/uicore/elements/FieldError;
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/uicore/elements/CheckboxFieldController;->error$lambda$0(Lcom/stripe/android/uicore/elements/CheckboxFieldController;Z)Lcom/stripe/android/uicore/elements/FieldError;

    move-result-object p0

    return-object p0
.end method

.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 6

    const/4 v4, 0x7

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lcom/stripe/android/uicore/elements/CheckboxFieldController;-><init>(Lcom/stripe/android/uicore/elements/CheckboxFieldController$LabelResource;Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/uicore/elements/CheckboxFieldController$LabelResource;Ljava/lang/String;Z)V
    .locals 1

    const-string v0, "debugTag"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    iput-object p1, p0, Lcom/stripe/android/uicore/elements/CheckboxFieldController;->labelResource:Lcom/stripe/android/uicore/elements/CheckboxFieldController$LabelResource;

    .line 15
    iput-object p2, p0, Lcom/stripe/android/uicore/elements/CheckboxFieldController;->debugTag:Ljava/lang/String;

    .line 27
    invoke-static {p3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-static {p1}, Lkotlinx/coroutines/flow/StateFlowKt;->MutableStateFlow(Ljava/lang/Object;)Lkotlinx/coroutines/flow/MutableStateFlow;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/uicore/elements/CheckboxFieldController;->_isChecked:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 31
    check-cast p1, Lkotlinx/coroutines/flow/StateFlow;

    new-instance p2, Lcom/stripe/android/uicore/elements/CheckboxFieldController$$ExternalSyntheticLambda0;

    invoke-direct {p2, p0}, Lcom/stripe/android/uicore/elements/CheckboxFieldController$$ExternalSyntheticLambda0;-><init>(Lcom/stripe/android/uicore/elements/CheckboxFieldController;)V

    invoke-static {p1, p2}, Lcom/stripe/android/uicore/utils/StateFlowsKt;->mapAsStateFlow(Lkotlinx/coroutines/flow/StateFlow;Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/flow/StateFlow;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/uicore/elements/CheckboxFieldController;->error:Lkotlinx/coroutines/flow/StateFlow;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/stripe/android/uicore/elements/CheckboxFieldController$LabelResource;Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    const/4 p1, 0x0

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    .line 15
    const-string p2, "CHECKBOX_FIELD"

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    const/4 p3, 0x0

    .line 13
    :cond_2
    invoke-direct {p0, p1, p2, p3}, Lcom/stripe/android/uicore/elements/CheckboxFieldController;-><init>(Lcom/stripe/android/uicore/elements/CheckboxFieldController$LabelResource;Ljava/lang/String;Z)V

    return-void
.end method

.method private static final error$lambda$0(Lcom/stripe/android/uicore/elements/CheckboxFieldController;Z)Lcom/stripe/android/uicore/elements/FieldError;
    .locals 2

    const/4 v0, 0x0

    if-nez p1, :cond_0

    .line 33
    iget-boolean p0, p0, Lcom/stripe/android/uicore/elements/CheckboxFieldController;->hasBeenEdited:Z

    if-eqz p0, :cond_0

    new-instance p0, Lcom/stripe/android/uicore/elements/FieldError;

    sget p1, Lcom/stripe/android/uicore/R$string;->stripe_field_required:I

    const/4 v1, 0x2

    invoke-direct {p0, p1, v0, v1, v0}, Lcom/stripe/android/uicore/elements/FieldError;-><init>(I[Ljava/lang/Object;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p0

    :cond_0
    return-object v0
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

    const-string p5, "field"

    invoke-static {p2, p5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "modifier"

    invoke-static {p3, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "hiddenIdentifiers"

    invoke-static {p4, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const p2, -0x424ce6bd

    invoke-interface {p6, p2}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result p4

    if-eqz p4, :cond_0

    const/4 p4, -0x1

    const-string p5, "com.stripe.android.uicore.elements.CheckboxFieldController.ComposeUI (CheckboxFieldController.kt:52)"

    .line 53
    invoke-static {p2, p7, p4, p5}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    :cond_0
    shr-int/lit8 p2, p7, 0x6

    and-int/lit8 p2, p2, 0xe

    shr-int/lit8 p4, p7, 0xc

    and-int/lit8 p4, p4, 0x70

    or-int/2addr p2, p4

    shl-int/lit8 p4, p7, 0x6

    and-int/lit16 p4, p4, 0x380

    or-int v4, p2, p4

    const/4 v5, 0x0

    move-object v1, p0

    move v2, p1

    move-object v0, p3

    move-object v3, p6

    .line 54
    invoke-static/range {v0 .. v5}, Lcom/stripe/android/uicore/elements/CheckboxFieldUIKt;->CheckboxFieldUI(Landroidx/compose/ui/Modifier;Lcom/stripe/android/uicore/elements/CheckboxFieldController;ZLandroidx/compose/runtime/Composer;II)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_1
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    return-void
.end method

.method public final getDebugTag()Ljava/lang/String;
    .locals 1

    .line 15
    iget-object v0, p0, Lcom/stripe/android/uicore/elements/CheckboxFieldController;->debugTag:Ljava/lang/String;

    return-object v0
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

    .line 31
    iget-object v0, p0, Lcom/stripe/android/uicore/elements/CheckboxFieldController;->error:Lkotlinx/coroutines/flow/StateFlow;

    return-object v0
.end method

.method public final getLabelResource()Lcom/stripe/android/uicore/elements/CheckboxFieldController$LabelResource;
    .locals 1

    .line 14
    iget-object v0, p0, Lcom/stripe/android/uicore/elements/CheckboxFieldController;->labelResource:Lcom/stripe/android/uicore/elements/CheckboxFieldController$LabelResource;

    return-object v0
.end method

.method public final isChecked()Lkotlinx/coroutines/flow/StateFlow;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .line 29
    iget-object v0, p0, Lcom/stripe/android/uicore/elements/CheckboxFieldController;->_isChecked:Lkotlinx/coroutines/flow/MutableStateFlow;

    check-cast v0, Lkotlinx/coroutines/flow/StateFlow;

    return-object v0
.end method

.method public final onValueChange(Z)V
    .locals 1

    .line 39
    iget-boolean v0, p0, Lcom/stripe/android/uicore/elements/CheckboxFieldController;->hasBeenEdited:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    .line 40
    iput-boolean v0, p0, Lcom/stripe/android/uicore/elements/CheckboxFieldController;->hasBeenEdited:Z

    .line 43
    :cond_0
    iget-object v0, p0, Lcom/stripe/android/uicore/elements/CheckboxFieldController;->_isChecked:Lkotlinx/coroutines/flow/MutableStateFlow;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {v0, p1}, Lkotlinx/coroutines/flow/MutableStateFlow;->setValue(Ljava/lang/Object;)V

    return-void
.end method
