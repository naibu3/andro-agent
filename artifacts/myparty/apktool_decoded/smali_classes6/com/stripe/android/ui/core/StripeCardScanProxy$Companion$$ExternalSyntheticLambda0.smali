.class public final synthetic Lcom/stripe/android/ui/core/StripeCardScanProxy$Companion$$ExternalSyntheticLambda0;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic f$0:Landroidx/fragment/app/Fragment;

.field public final synthetic f$1:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/ui/core/StripeCardScanProxy$Companion$$ExternalSyntheticLambda0;->f$0:Landroidx/fragment/app/Fragment;

    iput-object p2, p0, Lcom/stripe/android/ui/core/StripeCardScanProxy$Companion$$ExternalSyntheticLambda0;->f$1:Lkotlin/jvm/functions/Function1;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    .line 0
    iget-object v0, p0, Lcom/stripe/android/ui/core/StripeCardScanProxy$Companion$$ExternalSyntheticLambda0;->f$0:Landroidx/fragment/app/Fragment;

    iget-object v1, p0, Lcom/stripe/android/ui/core/StripeCardScanProxy$Companion$$ExternalSyntheticLambda0;->f$1:Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1}, Lcom/stripe/android/ui/core/StripeCardScanProxy$Companion;->$r8$lambda$oo2jR6uXKAY8Y8oPu8OSxPgxMA8(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)Lcom/stripe/android/ui/core/DefaultStripeCardScanProxy;

    move-result-object v0

    return-object v0
.end method
