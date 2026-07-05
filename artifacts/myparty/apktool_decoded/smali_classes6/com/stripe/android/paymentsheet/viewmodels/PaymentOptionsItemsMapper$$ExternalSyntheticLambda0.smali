.class public final synthetic Lcom/stripe/android/paymentsheet/viewmodels/PaymentOptionsItemsMapper$$ExternalSyntheticLambda0;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function4;


# instance fields
.field public final synthetic f$0:Lcom/stripe/android/paymentsheet/viewmodels/PaymentOptionsItemsMapper;


# direct methods
.method public synthetic constructor <init>(Lcom/stripe/android/paymentsheet/viewmodels/PaymentOptionsItemsMapper;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/viewmodels/PaymentOptionsItemsMapper$$ExternalSyntheticLambda0;->f$0:Lcom/stripe/android/paymentsheet/viewmodels/PaymentOptionsItemsMapper;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 0
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/viewmodels/PaymentOptionsItemsMapper$$ExternalSyntheticLambda0;->f$0:Lcom/stripe/android/paymentsheet/viewmodels/PaymentOptionsItemsMapper;

    check-cast p1, Lcom/stripe/android/paymentsheet/state/CustomerState;

    check-cast p2, Ljava/lang/Boolean;

    check-cast p3, Ljava/lang/Boolean;

    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p3

    check-cast p4, Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata;

    invoke-static {v0, p1, p2, p3, p4}, Lcom/stripe/android/paymentsheet/viewmodels/PaymentOptionsItemsMapper;->$r8$lambda$jmaoj2q3ygvhG3wP_xgz5_OeVb8(Lcom/stripe/android/paymentsheet/viewmodels/PaymentOptionsItemsMapper;Lcom/stripe/android/paymentsheet/state/CustomerState;Ljava/lang/Boolean;ZLcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method
