.class public final synthetic Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel$$ExternalSyntheticLambda2;
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
    check-cast p1, Lcom/stripe/android/financialconnections/features/consent/ConsentState;

    check-cast p2, Lcom/stripe/android/financialconnections/presentation/Async;

    invoke-static {p1, p2}, Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel;->$r8$lambda$1Eb7wT44umcXyamdINifyPFu_5Q(Lcom/stripe/android/financialconnections/features/consent/ConsentState;Lcom/stripe/android/financialconnections/presentation/Async;)Lcom/stripe/android/financialconnections/features/consent/ConsentState;

    move-result-object p1

    return-object p1
.end method
