.class final Lcom/stripe/android/paymentsheet/addresselement/AutocompleteActivity$onCreate$1$3$2$1;
.super Ljava/lang/Object;
.source "AutocompleteActivity.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/paymentsheet/addresselement/AutocompleteActivity$onCreate$1$3$2;->invoke(Landroidx/compose/runtime/Composer;I)V
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
.field final synthetic $appearanceContext:Lcom/stripe/android/paymentsheet/addresselement/AutocompleteAppearanceContext;

.field final synthetic this$0:Lcom/stripe/android/paymentsheet/addresselement/AutocompleteActivity;


# direct methods
.method constructor <init>(Lcom/stripe/android/paymentsheet/addresselement/AutocompleteActivity;Lcom/stripe/android/paymentsheet/addresselement/AutocompleteAppearanceContext;)V
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteActivity$onCreate$1$3$2$1;->this$0:Lcom/stripe/android/paymentsheet/addresselement/AutocompleteActivity;

    iput-object p2, p0, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteActivity$onCreate$1$3$2$1;->$appearanceContext:Lcom/stripe/android/paymentsheet/addresselement/AutocompleteAppearanceContext;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 77
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteActivity$onCreate$1$3$2$1;->invoke(Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/runtime/Composer;I)V
    .locals 8

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 78
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 84
    :cond_0
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    return-void

    .line 78
    :cond_1
    :goto_0
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, -0x1

    const-string v2, "com.stripe.android.paymentsheet.addresselement.AutocompleteActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AutocompleteActivity.kt:77)"

    const v3, 0x51ee391a

    invoke-static {v3, p2, v0, v2}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 79
    :cond_2
    iget-object p2, p0, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteActivity$onCreate$1$3$2$1;->this$0:Lcom/stripe/android/paymentsheet/addresselement/AutocompleteActivity;

    invoke-static {p2}, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteActivity;->access$getViewModel(Lcom/stripe/android/paymentsheet/addresselement/AutocompleteActivity;)Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel;

    move-result-object v2

    .line 83
    sget-object p2, Lcom/stripe/android/ui/core/elements/autocomplete/PlacesClientProxy;->Companion:Lcom/stripe/android/ui/core/elements/autocomplete/PlacesClientProxy$Companion;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Landroidx/compose/foundation/DarkThemeKt;->isSystemInDarkTheme(Landroidx/compose/runtime/Composer;I)Z

    move-result v0

    const/4 v3, 0x0

    invoke-static {p2, v0, v3, v1, v3}, Lcom/stripe/android/ui/core/elements/autocomplete/PlacesClientProxy$Companion;->getPlacesPoweredByGoogleDrawable$default(Lcom/stripe/android/ui/core/elements/autocomplete/PlacesClientProxy$Companion;ZLcom/stripe/android/uicore/elements/IsPlacesAvailable;ILjava/lang/Object;)Ljava/lang/Integer;

    move-result-object v4

    .line 81
    iget-object v3, p0, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteActivity$onCreate$1$3$2$1;->$appearanceContext:Lcom/stripe/android/paymentsheet/addresselement/AutocompleteAppearanceContext;

    const/4 v5, 0x1

    const/16 v7, 0xc00

    move-object v6, p1

    .line 78
    invoke-static/range {v2 .. v7}, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteScreenKt;->AutocompleteScreenUI(Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel;Lcom/stripe/android/paymentsheet/addresselement/AutocompleteAppearanceContext;Ljava/lang/Integer;ZLandroidx/compose/runtime/Composer;I)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_3
    return-void
.end method
