.class public final synthetic Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedWalletsHelper$$ExternalSyntheticLambda0;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic f$0:Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;


# direct methods
.method public synthetic constructor <init>(Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedWalletsHelper$$ExternalSyntheticLambda0;->f$0:Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 0
    iget-object v0, p0, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedWalletsHelper$$ExternalSyntheticLambda0;->f$0:Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;

    check-cast p1, Ljava/lang/Boolean;

    check-cast p2, Ljava/lang/String;

    invoke-static {v0, p1, p2}, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedWalletsHelper;->$r8$lambda$UXtrRZYkjUikH_TS5JOTxs6ZDfQ(Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;Ljava/lang/Boolean;Ljava/lang/String;)Lcom/stripe/android/paymentsheet/state/WalletsState;

    move-result-object p1

    return-object p1
.end method
