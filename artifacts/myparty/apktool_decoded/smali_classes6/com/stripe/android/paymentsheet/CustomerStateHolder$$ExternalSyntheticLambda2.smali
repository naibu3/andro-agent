.class public final synthetic Lcom/stripe/android/paymentsheet/CustomerStateHolder$$ExternalSyntheticLambda2;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# direct methods
.method public synthetic constructor <init>()V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 0
    check-cast p1, Ljava/util/List;

    check-cast p2, Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata$Permissions;

    invoke-static {p1, p2}, Lcom/stripe/android/paymentsheet/CustomerStateHolder;->$r8$lambda$YvNbD0Z-csQwyUdoUuCteUmaQ58(Ljava/util/List;Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata$Permissions;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
