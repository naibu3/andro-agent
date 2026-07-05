.class public final synthetic Lcom/stripe/android/view/CountryTextInputLayout$$ExternalSyntheticLambda2;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic f$0:Landroid/content/Context;

.field public final synthetic f$1:Lcom/stripe/android/view/CountryTextInputLayout;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;Lcom/stripe/android/view/CountryTextInputLayout;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/view/CountryTextInputLayout$$ExternalSyntheticLambda2;->f$0:Landroid/content/Context;

    iput-object p2, p0, Lcom/stripe/android/view/CountryTextInputLayout$$ExternalSyntheticLambda2;->f$1:Lcom/stripe/android/view/CountryTextInputLayout;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 0
    iget-object v0, p0, Lcom/stripe/android/view/CountryTextInputLayout$$ExternalSyntheticLambda2;->f$0:Landroid/content/Context;

    iget-object v1, p0, Lcom/stripe/android/view/CountryTextInputLayout$$ExternalSyntheticLambda2;->f$1:Lcom/stripe/android/view/CountryTextInputLayout;

    check-cast p1, Landroid/view/ViewGroup;

    invoke-static {v0, v1, p1}, Lcom/stripe/android/view/CountryTextInputLayout;->$r8$lambda$SxnISbxaK1v4grr39ZcwZNspSQM(Landroid/content/Context;Lcom/stripe/android/view/CountryTextInputLayout;Landroid/view/ViewGroup;)Landroid/widget/TextView;

    move-result-object p1

    return-object p1
.end method
