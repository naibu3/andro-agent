.class public final synthetic Lcom/stripe/android/view/CountryTextInputLayout$$ExternalSyntheticLambda5;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic f$0:Lcom/stripe/android/view/CountryTextInputLayout;

.field public final synthetic f$1:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lcom/stripe/android/view/CountryTextInputLayout;Ljava/lang/String;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/view/CountryTextInputLayout$$ExternalSyntheticLambda5;->f$0:Lcom/stripe/android/view/CountryTextInputLayout;

    iput-object p2, p0, Lcom/stripe/android/view/CountryTextInputLayout$$ExternalSyntheticLambda5;->f$1:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 0
    iget-object v0, p0, Lcom/stripe/android/view/CountryTextInputLayout$$ExternalSyntheticLambda5;->f$0:Lcom/stripe/android/view/CountryTextInputLayout;

    iget-object v1, p0, Lcom/stripe/android/view/CountryTextInputLayout$$ExternalSyntheticLambda5;->f$1:Ljava/lang/String;

    check-cast p1, Lcom/stripe/android/core/model/Country;

    invoke-static {v0, v1, p1}, Lcom/stripe/android/view/CountryTextInputLayout;->$r8$lambda$4mRXAT5KzWnK6CJhUTpKOUGntdg(Lcom/stripe/android/view/CountryTextInputLayout;Ljava/lang/String;Lcom/stripe/android/core/model/Country;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
