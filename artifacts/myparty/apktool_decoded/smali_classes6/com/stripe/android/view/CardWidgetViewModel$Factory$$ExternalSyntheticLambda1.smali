.class public final synthetic Lcom/stripe/android/view/CardWidgetViewModel$Factory$$ExternalSyntheticLambda1;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Ljavax/inject/Provider;


# instance fields
.field public final synthetic f$0:Lcom/stripe/android/view/CardWidgetViewModel$Factory;


# direct methods
.method public synthetic constructor <init>(Lcom/stripe/android/view/CardWidgetViewModel$Factory;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/view/CardWidgetViewModel$Factory$$ExternalSyntheticLambda1;->f$0:Lcom/stripe/android/view/CardWidgetViewModel$Factory;

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 1

    .line 0
    iget-object v0, p0, Lcom/stripe/android/view/CardWidgetViewModel$Factory$$ExternalSyntheticLambda1;->f$0:Lcom/stripe/android/view/CardWidgetViewModel$Factory;

    invoke-static {v0}, Lcom/stripe/android/view/CardWidgetViewModel$Factory;->$r8$lambda$7ew4WODwNC_iIJaTjaimJaovruE(Lcom/stripe/android/view/CardWidgetViewModel$Factory;)Lcom/stripe/android/PaymentConfiguration;

    move-result-object v0

    return-object v0
.end method
