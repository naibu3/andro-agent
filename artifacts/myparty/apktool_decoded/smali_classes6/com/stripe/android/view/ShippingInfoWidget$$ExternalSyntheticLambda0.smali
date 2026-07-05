.class public final synthetic Lcom/stripe/android/view/ShippingInfoWidget$$ExternalSyntheticLambda0;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic f$0:Landroid/content/Context;

.field public final synthetic f$1:Lcom/stripe/android/view/ShippingInfoWidget;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;Lcom/stripe/android/view/ShippingInfoWidget;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/view/ShippingInfoWidget$$ExternalSyntheticLambda0;->f$0:Landroid/content/Context;

    iput-object p2, p0, Lcom/stripe/android/view/ShippingInfoWidget$$ExternalSyntheticLambda0;->f$1:Lcom/stripe/android/view/ShippingInfoWidget;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    .line 0
    iget-object v0, p0, Lcom/stripe/android/view/ShippingInfoWidget$$ExternalSyntheticLambda0;->f$0:Landroid/content/Context;

    iget-object v1, p0, Lcom/stripe/android/view/ShippingInfoWidget$$ExternalSyntheticLambda0;->f$1:Lcom/stripe/android/view/ShippingInfoWidget;

    invoke-static {v0, v1}, Lcom/stripe/android/view/ShippingInfoWidget;->$r8$lambda$snvB2zss37mHg9L1j0y-OCZD9KU(Landroid/content/Context;Lcom/stripe/android/view/ShippingInfoWidget;)Lcom/stripe/android/databinding/StripeAddressWidgetBinding;

    move-result-object v0

    return-object v0
.end method
