.class public final synthetic Lcom/stripe/android/link/LinkControllerInteractor$$ExternalSyntheticLambda13;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>()V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 0
    check-cast p1, Lcom/stripe/android/link/LinkAccountUpdate$Value;

    invoke-static {p1}, Lcom/stripe/android/link/LinkControllerInteractor;->$r8$lambda$mRvMN8GMlDAU3eVe1iJ6XzO64u4(Lcom/stripe/android/link/LinkAccountUpdate$Value;)Lcom/stripe/android/link/model/LinkAccount;

    move-result-object p1

    return-object p1
.end method
