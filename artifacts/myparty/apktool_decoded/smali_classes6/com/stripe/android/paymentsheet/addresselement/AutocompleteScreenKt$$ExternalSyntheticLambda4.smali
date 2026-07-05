.class public final synthetic Lcom/stripe/android/paymentsheet/addresselement/AutocompleteScreenKt$$ExternalSyntheticLambda4;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic f$0:Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel;

.field public final synthetic f$1:Lcom/stripe/android/paymentsheet/addresselement/AddressElementNavigator;

.field public final synthetic f$2:Ljava/lang/Integer;

.field public final synthetic f$3:I

.field public final synthetic f$4:I


# direct methods
.method public synthetic constructor <init>(Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel;Lcom/stripe/android/paymentsheet/addresselement/AddressElementNavigator;Ljava/lang/Integer;II)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteScreenKt$$ExternalSyntheticLambda4;->f$0:Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel;

    iput-object p2, p0, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteScreenKt$$ExternalSyntheticLambda4;->f$1:Lcom/stripe/android/paymentsheet/addresselement/AddressElementNavigator;

    iput-object p3, p0, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteScreenKt$$ExternalSyntheticLambda4;->f$2:Ljava/lang/Integer;

    iput p4, p0, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteScreenKt$$ExternalSyntheticLambda4;->f$3:I

    iput p5, p0, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteScreenKt$$ExternalSyntheticLambda4;->f$4:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 0
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteScreenKt$$ExternalSyntheticLambda4;->f$0:Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel;

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteScreenKt$$ExternalSyntheticLambda4;->f$1:Lcom/stripe/android/paymentsheet/addresselement/AddressElementNavigator;

    iget-object v2, p0, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteScreenKt$$ExternalSyntheticLambda4;->f$2:Ljava/lang/Integer;

    iget v3, p0, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteScreenKt$$ExternalSyntheticLambda4;->f$3:I

    iget v4, p0, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteScreenKt$$ExternalSyntheticLambda4;->f$4:I

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    invoke-static/range {v0 .. v6}, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteScreenKt;->$r8$lambda$OVLj4ZefzRVkJTPFJ78S-gs-uHQ(Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel;Lcom/stripe/android/paymentsheet/addresselement/AddressElementNavigator;Ljava/lang/Integer;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
