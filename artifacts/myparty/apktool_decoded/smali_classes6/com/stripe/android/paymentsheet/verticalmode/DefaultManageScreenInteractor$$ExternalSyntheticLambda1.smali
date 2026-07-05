.class public final synthetic Lcom/stripe/android/paymentsheet/verticalmode/DefaultManageScreenInteractor$$ExternalSyntheticLambda1;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function4;


# direct methods
.method public synthetic constructor <init>()V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 0
    check-cast p1, Ljava/util/List;

    check-cast p2, Lcom/stripe/android/paymentsheet/model/PaymentSelection;

    check-cast p3, Ljava/lang/Boolean;

    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p3

    check-cast p4, Ljava/lang/Boolean;

    invoke-virtual {p4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p4

    invoke-static {p1, p2, p3, p4}, Lcom/stripe/android/paymentsheet/verticalmode/DefaultManageScreenInteractor;->$r8$lambda$eIlCuj3GENwxnyVHsj8pwStrt9Q(Ljava/util/List;Lcom/stripe/android/paymentsheet/model/PaymentSelection;ZZ)Lcom/stripe/android/paymentsheet/verticalmode/ManageScreenInteractor$State;

    move-result-object p1

    return-object p1
.end method
