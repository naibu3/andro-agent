.class final synthetic Lcom/stripe/android/customersheet/ui/CustomerSheetScreenKt$CustomerSheetScreen$2$1;
.super Lkotlin/jvm/internal/FunctionReferenceImpl;
.source "CustomerSheetScreen.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/customersheet/ui/CustomerSheetScreenKt;->CustomerSheetScreen(Lcom/stripe/android/customersheet/CustomerSheetViewModel;Landroidx/compose/runtime/Composer;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1000
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/FunctionReferenceImpl;",
        "Lkotlin/jvm/functions/Function1<",
        "Ljava/lang/String;",
        "Lcom/stripe/android/core/strings/ResolvableString;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method constructor <init>(Ljava/lang/Object;)V
    .locals 7

    const-class v3, Lcom/stripe/android/customersheet/CustomerSheetViewModel;

    const-string v5, "providePaymentMethodName(Ljava/lang/String;)Lcom/stripe/android/core/strings/ResolvableString;"

    const/4 v6, 0x0

    const/4 v1, 0x1

    const-string v4, "providePaymentMethodName"

    move-object v0, p0

    move-object v2, p1

    invoke-direct/range {v0 .. v6}, Lkotlin/jvm/internal/FunctionReferenceImpl;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/String;)Lcom/stripe/android/core/strings/ResolvableString;
    .locals 1

    .line 59
    iget-object v0, p0, Lcom/stripe/android/customersheet/ui/CustomerSheetScreenKt$CustomerSheetScreen$2$1;->receiver:Ljava/lang/Object;

    check-cast v0, Lcom/stripe/android/customersheet/CustomerSheetViewModel;

    invoke-virtual {v0, p1}, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->providePaymentMethodName(Ljava/lang/String;)Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 59
    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/stripe/android/customersheet/ui/CustomerSheetScreenKt$CustomerSheetScreen$2$1;->invoke(Ljava/lang/String;)Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object p1

    return-object p1
.end method
