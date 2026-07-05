.class final Lcom/stripe/android/uicore/elements/PhoneNumberElementUIKt$PhoneNumberCollectionSection$4;
.super Ljava/lang/Object;
.source "PhoneNumberElementUI.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/uicore/elements/PhoneNumberElementUIKt;->PhoneNumberCollectionSection-fhH9uAM(ZLcom/stripe/android/uicore/elements/PhoneNumberController;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;ZLjava/lang/Integer;ZZLandroidx/compose/ui/focus/FocusRequester;ILandroidx/compose/runtime/Composer;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlin/jvm/functions/Function2<",
        "Landroidx/compose/runtime/Composer;",
        "Ljava/lang/Integer;",
        "Lkotlin/Unit;",
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
.field final synthetic $countryDropdown:Lkotlin/jvm/functions/Function2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function2<",
            "Landroidx/compose/runtime/Composer;",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $enabled:Z

.field final synthetic $focusRequester:Landroidx/compose/ui/focus/FocusRequester;

.field final synthetic $imeAction:I

.field final synthetic $modifier:Landroidx/compose/ui/Modifier;

.field final synthetic $moveToNextFieldOnceComplete:Z

.field final synthetic $phoneNumberController:Lcom/stripe/android/uicore/elements/PhoneNumberController;

.field final synthetic $requestFocusWhenShown:Z


# direct methods
.method constructor <init>(ZLcom/stripe/android/uicore/elements/PhoneNumberController;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;ZZLandroidx/compose/ui/focus/FocusRequester;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lcom/stripe/android/uicore/elements/PhoneNumberController;",
            "Landroidx/compose/ui/Modifier;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;ZZ",
            "Landroidx/compose/ui/focus/FocusRequester;",
            "I)V"
        }
    .end annotation

    iput-boolean p1, p0, Lcom/stripe/android/uicore/elements/PhoneNumberElementUIKt$PhoneNumberCollectionSection$4;->$enabled:Z

    iput-object p2, p0, Lcom/stripe/android/uicore/elements/PhoneNumberElementUIKt$PhoneNumberCollectionSection$4;->$phoneNumberController:Lcom/stripe/android/uicore/elements/PhoneNumberController;

    iput-object p3, p0, Lcom/stripe/android/uicore/elements/PhoneNumberElementUIKt$PhoneNumberCollectionSection$4;->$modifier:Landroidx/compose/ui/Modifier;

    iput-object p4, p0, Lcom/stripe/android/uicore/elements/PhoneNumberElementUIKt$PhoneNumberCollectionSection$4;->$countryDropdown:Lkotlin/jvm/functions/Function2;

    iput-boolean p5, p0, Lcom/stripe/android/uicore/elements/PhoneNumberElementUIKt$PhoneNumberCollectionSection$4;->$requestFocusWhenShown:Z

    iput-boolean p6, p0, Lcom/stripe/android/uicore/elements/PhoneNumberElementUIKt$PhoneNumberCollectionSection$4;->$moveToNextFieldOnceComplete:Z

    iput-object p7, p0, Lcom/stripe/android/uicore/elements/PhoneNumberElementUIKt$PhoneNumberCollectionSection$4;->$focusRequester:Landroidx/compose/ui/focus/FocusRequester;

    iput p8, p0, Lcom/stripe/android/uicore/elements/PhoneNumberElementUIKt$PhoneNumberCollectionSection$4;->$imeAction:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 94
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/uicore/elements/PhoneNumberElementUIKt$PhoneNumberCollectionSection$4;->invoke(Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/runtime/Composer;I)V
    .locals 17

    move-object/from16 v0, p0

    move/from16 v1, p2

    and-int/lit8 v2, v1, 0x3

    const/4 v3, 0x2

    if-ne v2, v3, :cond_1

    .line 95
    invoke-interface/range {p1 .. p1}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    .line 104
    :cond_0
    invoke-interface/range {p1 .. p1}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    return-void

    .line 95
    :cond_1
    :goto_0
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v2

    if-eqz v2, :cond_2

    const/4 v2, -0x1

    const-string v3, "com.stripe.android.uicore.elements.PhoneNumberCollectionSection.<anonymous> (PhoneNumberElementUI.kt:94)"

    const v4, -0xec66a17

    invoke-static {v4, v1, v2, v3}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 98
    :cond_2
    iget-boolean v5, v0, Lcom/stripe/android/uicore/elements/PhoneNumberElementUIKt$PhoneNumberCollectionSection$4;->$enabled:Z

    .line 99
    iget-object v6, v0, Lcom/stripe/android/uicore/elements/PhoneNumberElementUIKt$PhoneNumberCollectionSection$4;->$phoneNumberController:Lcom/stripe/android/uicore/elements/PhoneNumberController;

    .line 96
    iget-object v7, v0, Lcom/stripe/android/uicore/elements/PhoneNumberElementUIKt$PhoneNumberCollectionSection$4;->$modifier:Landroidx/compose/ui/Modifier;

    .line 97
    iget-object v8, v0, Lcom/stripe/android/uicore/elements/PhoneNumberElementUIKt$PhoneNumberCollectionSection$4;->$countryDropdown:Lkotlin/jvm/functions/Function2;

    .line 100
    iget-boolean v9, v0, Lcom/stripe/android/uicore/elements/PhoneNumberElementUIKt$PhoneNumberCollectionSection$4;->$requestFocusWhenShown:Z

    .line 101
    iget-boolean v10, v0, Lcom/stripe/android/uicore/elements/PhoneNumberElementUIKt$PhoneNumberCollectionSection$4;->$moveToNextFieldOnceComplete:Z

    .line 102
    iget-object v11, v0, Lcom/stripe/android/uicore/elements/PhoneNumberElementUIKt$PhoneNumberCollectionSection$4;->$focusRequester:Landroidx/compose/ui/focus/FocusRequester;

    .line 103
    iget v13, v0, Lcom/stripe/android/uicore/elements/PhoneNumberElementUIKt$PhoneNumberCollectionSection$4;->$imeAction:I

    const/4 v15, 0x0

    const/16 v16, 0x80

    const/4 v12, 0x0

    move-object/from16 v14, p1

    .line 95
    invoke-static/range {v5 .. v16}, Lcom/stripe/android/uicore/elements/PhoneNumberElementUIKt;->PhoneNumberElementUI-Rts_TWA(ZLcom/stripe/android/uicore/elements/PhoneNumberController;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;ZZLandroidx/compose/ui/focus/FocusRequester;Lkotlin/jvm/functions/Function2;ILandroidx/compose/runtime/Composer;II)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_3
    return-void
.end method
