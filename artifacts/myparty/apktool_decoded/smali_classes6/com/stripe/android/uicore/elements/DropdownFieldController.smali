.class public final Lcom/stripe/android/uicore/elements/DropdownFieldController;
.super Ljava/lang/Object;
.source "DropdownFieldController.kt"

# interfaces
.implements Lcom/stripe/android/uicore/elements/InputController;
.implements Lcom/stripe/android/uicore/elements/SectionFieldErrorController;
.implements Lcom/stripe/android/uicore/elements/SectionFieldComposable;


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nDropdownFieldController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DropdownFieldController.kt\ncom/stripe/android/uicore/elements/DropdownFieldController\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,95:1\n1#2:96\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u001b\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0015\u0010/\u001a\u00020\u00072\u0008\u00100\u001a\u0004\u0018\u00010\u0015\u00a2\u0006\u0002\u00101J\u000e\u00102\u001a\u0002032\u0006\u00100\u001a\u00020\u0015J\u0010\u00104\u001a\u0002032\u0006\u00105\u001a\u00020\u0007H\u0016J\u0017\u00106\u001a\u0002032\u0008\u00100\u001a\u0004\u0018\u00010\u0015H\u0002\u00a2\u0006\u0002\u00107J=\u00108\u001a\u0002032\u0006\u00109\u001a\u00020\u000f2\u0006\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020=2\u000c\u0010>\u001a\u0008\u0012\u0004\u0012\u00020@0?2\u0008\u0010A\u001a\u0004\u0018\u00010@H\u0017\u00a2\u0006\u0002\u0010BR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u000b\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\rR\u0011\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0016R\u0016\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u0018X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0019\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u001a\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\u0008\u0012\u0004\u0012\u00020\u001e0\u001aX\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001f\u0010\u001cR\u001a\u0010 \u001a\u0008\u0012\u0004\u0012\u00020\u00070\u001aX\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008!\u0010\u001cR\u001c\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u001aX\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008#\u0010\u001cR\u001c\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010%0\u001aX\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008&\u0010\u001cR\u0014\u0010\'\u001a\u00020\u000fX\u0096D\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008(\u0010\u0011R\u001a\u0010)\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u001aX\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008)\u0010\u001cR\u001a\u0010*\u001a\u0008\u0012\u0004\u0012\u00020+0\u001aX\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008,\u0010\u001cR\u0011\u0010-\u001a\u00020\u000f\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008.\u0010\u0011\u00a8\u0006C"
    }
    d2 = {
        "Lcom/stripe/android/uicore/elements/DropdownFieldController;",
        "Lcom/stripe/android/uicore/elements/InputController;",
        "Lcom/stripe/android/uicore/elements/SectionFieldErrorController;",
        "Lcom/stripe/android/uicore/elements/SectionFieldComposable;",
        "config",
        "Lcom/stripe/android/uicore/elements/DropdownConfig;",
        "initialValue",
        "",
        "<init>",
        "(Lcom/stripe/android/uicore/elements/DropdownConfig;Ljava/lang/String;)V",
        "displayItems",
        "",
        "getDisplayItems",
        "()Ljava/util/List;",
        "disableDropdownWithSingleElement",
        "",
        "getDisableDropdownWithSingleElement",
        "()Z",
        "dropdownMode",
        "Lcom/stripe/android/uicore/elements/DropdownConfig$Mode;",
        "initialIndex",
        "",
        "Ljava/lang/Integer;",
        "_selectedIndex",
        "Lkotlinx/coroutines/flow/MutableStateFlow;",
        "selectedIndex",
        "Lkotlinx/coroutines/flow/StateFlow;",
        "getSelectedIndex",
        "()Lkotlinx/coroutines/flow/StateFlow;",
        "label",
        "Lcom/stripe/android/core/strings/ResolvableString;",
        "getLabel",
        "fieldValue",
        "getFieldValue",
        "rawFieldValue",
        "getRawFieldValue",
        "error",
        "Lcom/stripe/android/uicore/elements/FieldError;",
        "getError",
        "showOptionalLabel",
        "getShowOptionalLabel",
        "isComplete",
        "formFieldValue",
        "Lcom/stripe/android/uicore/forms/FormFieldEntry;",
        "getFormFieldValue",
        "tinyMode",
        "getTinyMode",
        "getSelectedItemLabel",
        "index",
        "(Ljava/lang/Integer;)Ljava/lang/String;",
        "onValueChange",
        "",
        "onRawValueChange",
        "rawValue",
        "safelyUpdateSelectedIndex",
        "(Ljava/lang/Integer;)V",
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
.field private final _selectedIndex:Lkotlinx/coroutines/flow/MutableStateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/MutableStateFlow<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private final config:Lcom/stripe/android/uicore/elements/DropdownConfig;

.field private final disableDropdownWithSingleElement:Z

.field private final displayItems:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final dropdownMode:Lcom/stripe/android/uicore/elements/DropdownConfig$Mode;

.field private final error:Lkotlinx/coroutines/flow/StateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Lcom/stripe/android/uicore/elements/FieldError;",
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

.field private final initialIndex:Ljava/lang/Integer;

.field private final isComplete:Lkotlinx/coroutines/flow/StateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final label:Lkotlinx/coroutines/flow/StateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Lcom/stripe/android/core/strings/ResolvableString;",
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

.field private final selectedIndex:Lkotlinx/coroutines/flow/StateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private final showOptionalLabel:Z

.field private final tinyMode:Z


# direct methods
.method public static synthetic $r8$lambda$3bvROmeQNrdaZ0ZDFGt0-60kSlQ(Lcom/stripe/android/uicore/elements/DropdownFieldController;Ljava/lang/Integer;)Ljava/lang/String;
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/uicore/elements/DropdownFieldController;->fieldValue$lambda$2(Lcom/stripe/android/uicore/elements/DropdownFieldController;Ljava/lang/Integer;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$b9QYhXXDqjls9-uTlhA89EuJ37Y(Ljava/lang/Integer;)Z
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/uicore/elements/DropdownFieldController;->isComplete$lambda$5(Ljava/lang/Integer;)Z

    move-result p0

    return p0
.end method

.method public static synthetic $r8$lambda$ddsab6b21ZRFP9nm5-MGt88kk3E(Lcom/stripe/android/uicore/elements/DropdownFieldController;Ljava/lang/Integer;)Ljava/lang/String;
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/uicore/elements/DropdownFieldController;->rawFieldValue$lambda$4(Lcom/stripe/android/uicore/elements/DropdownFieldController;Ljava/lang/Integer;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$eRwbB0VqbIe-1pgEEa5wJUCRgpE(ZLjava/lang/String;)Lcom/stripe/android/uicore/forms/FormFieldEntry;
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/uicore/elements/DropdownFieldController;->formFieldValue$lambda$6(ZLjava/lang/String;)Lcom/stripe/android/uicore/forms/FormFieldEntry;

    move-result-object p0

    return-object p0
.end method

.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/uicore/elements/DropdownConfig;Ljava/lang/String;)V
    .locals 4

    const-string v0, "config"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    iput-object p1, p0, Lcom/stripe/android/uicore/elements/DropdownFieldController;->config:Lcom/stripe/android/uicore/elements/DropdownConfig;

    .line 24
    invoke-interface {p1}, Lcom/stripe/android/uicore/elements/DropdownConfig;->getDisplayItems()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/stripe/android/uicore/elements/DropdownFieldController;->displayItems:Ljava/util/List;

    .line 25
    invoke-interface {p1}, Lcom/stripe/android/uicore/elements/DropdownConfig;->getDisableDropdownWithSingleElement()Z

    move-result v0

    iput-boolean v0, p0, Lcom/stripe/android/uicore/elements/DropdownFieldController;->disableDropdownWithSingleElement:Z

    .line 26
    invoke-interface {p1}, Lcom/stripe/android/uicore/elements/DropdownConfig;->getMode()Lcom/stripe/android/uicore/elements/DropdownConfig$Mode;

    move-result-object v0

    iput-object v0, p0, Lcom/stripe/android/uicore/elements/DropdownFieldController;->dropdownMode:Lcom/stripe/android/uicore/elements/DropdownConfig$Mode;

    const/4 v1, 0x0

    .line 27
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 28
    instance-of v2, v0, Lcom/stripe/android/uicore/elements/DropdownConfig$Mode$Full;

    const/4 v3, 0x0

    if-eqz v2, :cond_1

    check-cast v0, Lcom/stripe/android/uicore/elements/DropdownConfig$Mode$Full;

    invoke-virtual {v0}, Lcom/stripe/android/uicore/elements/DropdownConfig$Mode$Full;->getSelectsFirstOptionAsDefault()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    move-object v1, v3

    .line 27
    :cond_1
    :goto_0
    iput-object v1, p0, Lcom/stripe/android/uicore/elements/DropdownFieldController;->initialIndex:Ljava/lang/Integer;

    .line 30
    invoke-static {v1}, Lkotlinx/coroutines/flow/StateFlowKt;->MutableStateFlow(Ljava/lang/Object;)Lkotlinx/coroutines/flow/MutableStateFlow;

    move-result-object v0

    iput-object v0, p0, Lcom/stripe/android/uicore/elements/DropdownFieldController;->_selectedIndex:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 31
    check-cast v0, Lkotlinx/coroutines/flow/StateFlow;

    iput-object v0, p0, Lcom/stripe/android/uicore/elements/DropdownFieldController;->selectedIndex:Lkotlinx/coroutines/flow/StateFlow;

    .line 32
    invoke-interface {p1}, Lcom/stripe/android/uicore/elements/DropdownConfig;->getLabel()Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object v1

    invoke-static {v1}, Lkotlinx/coroutines/flow/StateFlowKt;->MutableStateFlow(Ljava/lang/Object;)Lkotlinx/coroutines/flow/MutableStateFlow;

    move-result-object v1

    check-cast v1, Lkotlinx/coroutines/flow/StateFlow;

    iput-object v1, p0, Lcom/stripe/android/uicore/elements/DropdownFieldController;->label:Lkotlinx/coroutines/flow/StateFlow;

    .line 33
    new-instance v1, Lcom/stripe/android/uicore/elements/DropdownFieldController$$ExternalSyntheticLambda0;

    invoke-direct {v1, p0}, Lcom/stripe/android/uicore/elements/DropdownFieldController$$ExternalSyntheticLambda0;-><init>(Lcom/stripe/android/uicore/elements/DropdownFieldController;)V

    invoke-static {v0, v1}, Lcom/stripe/android/uicore/utils/StateFlowsKt;->mapAsStateFlow(Lkotlinx/coroutines/flow/StateFlow;Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v1

    iput-object v1, p0, Lcom/stripe/android/uicore/elements/DropdownFieldController;->fieldValue:Lkotlinx/coroutines/flow/StateFlow;

    .line 34
    new-instance v1, Lcom/stripe/android/uicore/elements/DropdownFieldController$$ExternalSyntheticLambda1;

    invoke-direct {v1, p0}, Lcom/stripe/android/uicore/elements/DropdownFieldController$$ExternalSyntheticLambda1;-><init>(Lcom/stripe/android/uicore/elements/DropdownFieldController;)V

    invoke-static {v0, v1}, Lcom/stripe/android/uicore/utils/StateFlowsKt;->mapAsStateFlow(Lkotlinx/coroutines/flow/StateFlow;Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v1

    iput-object v1, p0, Lcom/stripe/android/uicore/elements/DropdownFieldController;->rawFieldValue:Lkotlinx/coroutines/flow/StateFlow;

    .line 35
    invoke-static {v3}, Lcom/stripe/android/uicore/utils/StateFlowsKt;->stateFlowOf(Ljava/lang/Object;)Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v1

    iput-object v1, p0, Lcom/stripe/android/uicore/elements/DropdownFieldController;->error:Lkotlinx/coroutines/flow/StateFlow;

    .line 37
    new-instance v1, Lcom/stripe/android/uicore/elements/DropdownFieldController$$ExternalSyntheticLambda2;

    invoke-direct {v1}, Lcom/stripe/android/uicore/elements/DropdownFieldController$$ExternalSyntheticLambda2;-><init>()V

    invoke-static {v0, v1}, Lcom/stripe/android/uicore/utils/StateFlowsKt;->mapAsStateFlow(Lkotlinx/coroutines/flow/StateFlow;Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v0

    iput-object v0, p0, Lcom/stripe/android/uicore/elements/DropdownFieldController;->isComplete:Lkotlinx/coroutines/flow/StateFlow;

    .line 39
    invoke-virtual {p0}, Lcom/stripe/android/uicore/elements/DropdownFieldController;->isComplete()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v0

    invoke-virtual {p0}, Lcom/stripe/android/uicore/elements/DropdownFieldController;->getRawFieldValue()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v1

    new-instance v2, Lcom/stripe/android/uicore/elements/DropdownFieldController$$ExternalSyntheticLambda3;

    invoke-direct {v2}, Lcom/stripe/android/uicore/elements/DropdownFieldController$$ExternalSyntheticLambda3;-><init>()V

    invoke-static {v0, v1, v2}, Lcom/stripe/android/uicore/utils/StateFlowsKt;->combineAsStateFlow(Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v0

    iput-object v0, p0, Lcom/stripe/android/uicore/elements/DropdownFieldController;->formFieldValue:Lkotlinx/coroutines/flow/StateFlow;

    .line 43
    invoke-interface {p1}, Lcom/stripe/android/uicore/elements/DropdownConfig;->getMode()Lcom/stripe/android/uicore/elements/DropdownConfig$Mode;

    move-result-object p1

    instance-of p1, p1, Lcom/stripe/android/uicore/elements/DropdownConfig$Mode$Condensed;

    iput-boolean p1, p0, Lcom/stripe/android/uicore/elements/DropdownFieldController;->tinyMode:Z

    if-eqz p2, :cond_2

    .line 46
    invoke-virtual {p0, p2}, Lcom/stripe/android/uicore/elements/DropdownFieldController;->onRawValueChange(Ljava/lang/String;)V

    :cond_2
    return-void
.end method

.method public synthetic constructor <init>(Lcom/stripe/android/uicore/elements/DropdownConfig;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    .line 20
    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/stripe/android/uicore/elements/DropdownFieldController;-><init>(Lcom/stripe/android/uicore/elements/DropdownConfig;Ljava/lang/String;)V

    return-void
.end method

.method private static final fieldValue$lambda$2(Lcom/stripe/android/uicore/elements/DropdownFieldController;Ljava/lang/Integer;)Ljava/lang/String;
    .locals 0

    if-eqz p1, :cond_1

    .line 33
    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    iget-object p0, p0, Lcom/stripe/android/uicore/elements/DropdownFieldController;->displayItems:Ljava/util/List;

    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    if-nez p0, :cond_0

    goto :goto_0

    :cond_0
    return-object p0

    :cond_1
    :goto_0
    const-string p0, ""

    return-object p0
.end method

.method private static final formFieldValue$lambda$6(ZLjava/lang/String;)Lcom/stripe/android/uicore/forms/FormFieldEntry;
    .locals 1

    .line 40
    new-instance v0, Lcom/stripe/android/uicore/forms/FormFieldEntry;

    invoke-direct {v0, p1, p0}, Lcom/stripe/android/uicore/forms/FormFieldEntry;-><init>(Ljava/lang/String;Z)V

    return-object v0
.end method

.method private static final isComplete$lambda$5(Ljava/lang/Integer;)Z
    .locals 0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method private static final rawFieldValue$lambda$4(Lcom/stripe/android/uicore/elements/DropdownFieldController;Ljava/lang/Integer;)Ljava/lang/String;
    .locals 0

    if-eqz p1, :cond_0

    .line 34
    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    iget-object p0, p0, Lcom/stripe/android/uicore/elements/DropdownFieldController;->config:Lcom/stripe/android/uicore/elements/DropdownConfig;

    invoke-interface {p0}, Lcom/stripe/android/uicore/elements/DropdownConfig;->getRawItems()Ljava/util/List;

    move-result-object p0

    invoke-static {p0, p1}, Lkotlin/collections/CollectionsKt;->getOrNull(Ljava/util/List;I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method private final safelyUpdateSelectedIndex(Ljava/lang/Integer;)V
    .locals 1

    if-eqz p1, :cond_1

    .line 71
    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    .line 72
    iget-object v0, p0, Lcom/stripe/android/uicore/elements/DropdownFieldController;->displayItems:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge p1, v0, :cond_0

    .line 73
    iget-object v0, p0, Lcom/stripe/android/uicore/elements/DropdownFieldController;->_selectedIndex:Lkotlinx/coroutines/flow/MutableStateFlow;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, p1}, Lkotlinx/coroutines/flow/MutableStateFlow;->setValue(Ljava/lang/Object;)V

    :cond_0
    return-void

    .line 75
    :cond_1
    move-object p1, p0

    check-cast p1, Lcom/stripe/android/uicore/elements/DropdownFieldController;

    .line 76
    iget-object p1, p0, Lcom/stripe/android/uicore/elements/DropdownFieldController;->_selectedIndex:Lkotlinx/coroutines/flow/MutableStateFlow;

    iget-object v0, p0, Lcom/stripe/android/uicore/elements/DropdownFieldController;->initialIndex:Ljava/lang/Integer;

    invoke-interface {p1, v0}, Lkotlinx/coroutines/flow/MutableStateFlow;->setValue(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public ComposeUI(ZLcom/stripe/android/uicore/elements/SectionFieldElement;Landroidx/compose/ui/Modifier;Ljava/util/Set;Lcom/stripe/android/uicore/elements/IdentifierSpec;Landroidx/compose/runtime/Composer;I)V
    .locals 7
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

    const p2, -0x6ffb8c21

    invoke-interface {p6, p2}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result p4

    if-eqz p4, :cond_0

    const/4 p4, -0x1

    const-string p5, "com.stripe.android.uicore.elements.DropdownFieldController.ComposeUI (DropdownFieldController.kt:86)"

    .line 87
    invoke-static {p2, p7, p4, p5}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    :cond_0
    shr-int/lit8 p2, p7, 0xf

    and-int/lit8 p2, p2, 0xe

    shl-int/lit8 p4, p7, 0x3

    and-int/lit8 p4, p4, 0x70

    or-int/2addr p2, p4

    and-int/lit16 p4, p7, 0x380

    or-int v5, p2, p4

    const/16 v6, 0x8

    const/4 v3, 0x0

    move-object v0, p0

    move v1, p1

    move-object v2, p3

    move-object v4, p6

    .line 88
    invoke-static/range {v0 .. v6}, Lcom/stripe/android/uicore/elements/DropdownFieldUIKt;->DropDown(Lcom/stripe/android/uicore/elements/DropdownFieldController;ZLandroidx/compose/ui/Modifier;ZLandroidx/compose/runtime/Composer;II)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_1
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    return-void
.end method

.method public final getDisableDropdownWithSingleElement()Z
    .locals 1

    .line 25
    iget-boolean v0, p0, Lcom/stripe/android/uicore/elements/DropdownFieldController;->disableDropdownWithSingleElement:Z

    return v0
.end method

.method public final getDisplayItems()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 24
    iget-object v0, p0, Lcom/stripe/android/uicore/elements/DropdownFieldController;->displayItems:Ljava/util/List;

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

    .line 35
    iget-object v0, p0, Lcom/stripe/android/uicore/elements/DropdownFieldController;->error:Lkotlinx/coroutines/flow/StateFlow;

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

    .line 33
    iget-object v0, p0, Lcom/stripe/android/uicore/elements/DropdownFieldController;->fieldValue:Lkotlinx/coroutines/flow/StateFlow;

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

    .line 38
    iget-object v0, p0, Lcom/stripe/android/uicore/elements/DropdownFieldController;->formFieldValue:Lkotlinx/coroutines/flow/StateFlow;

    return-object v0
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

    .line 32
    iget-object v0, p0, Lcom/stripe/android/uicore/elements/DropdownFieldController;->label:Lkotlinx/coroutines/flow/StateFlow;

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

    .line 34
    iget-object v0, p0, Lcom/stripe/android/uicore/elements/DropdownFieldController;->rawFieldValue:Lkotlinx/coroutines/flow/StateFlow;

    return-object v0
.end method

.method public final getSelectedIndex()Lkotlinx/coroutines/flow/StateFlow;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .line 31
    iget-object v0, p0, Lcom/stripe/android/uicore/elements/DropdownFieldController;->selectedIndex:Lkotlinx/coroutines/flow/StateFlow;

    return-object v0
.end method

.method public final getSelectedItemLabel(Ljava/lang/Integer;)Ljava/lang/String;
    .locals 1

    if-eqz p1, :cond_1

    .line 52
    move-object v0, p1

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    iget-object v0, p0, Lcom/stripe/android/uicore/elements/DropdownFieldController;->config:Lcom/stripe/android/uicore/elements/DropdownConfig;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-interface {v0, p1}, Lcom/stripe/android/uicore/elements/DropdownConfig;->getSelectedItemLabel(I)Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    return-object p1

    :cond_1
    :goto_0
    const-string p1, ""

    return-object p1
.end method

.method public getShowOptionalLabel()Z
    .locals 1

    .line 36
    iget-boolean v0, p0, Lcom/stripe/android/uicore/elements/DropdownFieldController;->showOptionalLabel:Z

    return v0
.end method

.method public final getTinyMode()Z
    .locals 1

    .line 43
    iget-boolean v0, p0, Lcom/stripe/android/uicore/elements/DropdownFieldController;->tinyMode:Z

    return v0
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

    .line 37
    iget-object v0, p0, Lcom/stripe/android/uicore/elements/DropdownFieldController;->isComplete:Lkotlinx/coroutines/flow/StateFlow;

    return-object v0
.end method

.method public onRawValueChange(Ljava/lang/String;)V
    .locals 2

    const-string v0, "rawValue"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 66
    iget-object v0, p0, Lcom/stripe/android/uicore/elements/DropdownFieldController;->displayItems:Ljava/util/List;

    iget-object v1, p0, Lcom/stripe/android/uicore/elements/DropdownFieldController;->config:Lcom/stripe/android/uicore/elements/DropdownConfig;

    invoke-interface {v1, p1}, Lcom/stripe/android/uicore/elements/DropdownConfig;->convertFromRaw(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    move-object v0, p1

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    const/4 p1, 0x0

    :cond_0
    if-nez p1, :cond_1

    iget-object p1, p0, Lcom/stripe/android/uicore/elements/DropdownFieldController;->initialIndex:Ljava/lang/Integer;

    .line 65
    :cond_1
    invoke-direct {p0, p1}, Lcom/stripe/android/uicore/elements/DropdownFieldController;->safelyUpdateSelectedIndex(Ljava/lang/Integer;)V

    return-void
.end method

.method public final onValueChange(I)V
    .locals 0

    .line 58
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/stripe/android/uicore/elements/DropdownFieldController;->safelyUpdateSelectedIndex(Ljava/lang/Integer;)V

    return-void
.end method
