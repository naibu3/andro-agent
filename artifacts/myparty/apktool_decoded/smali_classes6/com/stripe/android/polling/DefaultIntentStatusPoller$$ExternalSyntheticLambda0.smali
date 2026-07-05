.class public final synthetic Lcom/stripe/android/polling/DefaultIntentStatusPoller$$ExternalSyntheticLambda0;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic f$0:Lcom/stripe/android/PaymentConfiguration;


# direct methods
.method public synthetic constructor <init>(Lcom/stripe/android/PaymentConfiguration;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/polling/DefaultIntentStatusPoller$$ExternalSyntheticLambda0;->f$0:Lcom/stripe/android/PaymentConfiguration;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    .line 0
    iget-object v0, p0, Lcom/stripe/android/polling/DefaultIntentStatusPoller$$ExternalSyntheticLambda0;->f$0:Lcom/stripe/android/PaymentConfiguration;

    invoke-static {v0}, Lcom/stripe/android/polling/DefaultIntentStatusPoller;->$r8$lambda$T9T1pKnwHfXNJR5WGnW6WCi5sfk(Lcom/stripe/android/PaymentConfiguration;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
