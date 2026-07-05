.class public final synthetic Lcom/stripe/android/customersheet/CustomerSheetViewModel$$ExternalSyntheticLambda13;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic f$0:Lcom/stripe/android/customersheet/CustomerSheetViewModel;


# direct methods
.method public synthetic constructor <init>(Lcom/stripe/android/customersheet/CustomerSheetViewModel;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/customersheet/CustomerSheetViewModel$$ExternalSyntheticLambda13;->f$0:Lcom/stripe/android/customersheet/CustomerSheetViewModel;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 0
    iget-object v0, p0, Lcom/stripe/android/customersheet/CustomerSheetViewModel$$ExternalSyntheticLambda13;->f$0:Lcom/stripe/android/customersheet/CustomerSheetViewModel;

    check-cast p1, Lcom/stripe/android/core/strings/ResolvableString;

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    invoke-static {v0, p1, p2}, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->$r8$lambda$yyA-uVJHsNraYvC5v3278u-PkL0(Lcom/stripe/android/customersheet/CustomerSheetViewModel;Lcom/stripe/android/core/strings/ResolvableString;Z)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
