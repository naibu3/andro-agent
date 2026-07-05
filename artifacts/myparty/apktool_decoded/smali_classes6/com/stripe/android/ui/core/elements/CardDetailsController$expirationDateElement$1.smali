.class final synthetic Lcom/stripe/android/ui/core/elements/CardDetailsController$expirationDateElement$1;
.super Lkotlin/jvm/internal/FunctionReferenceImpl;
.source "CardDetailsController.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/ui/core/elements/CardDetailsController;-><init>(Lcom/stripe/android/cards/CardAccountRangeRepository$Factory;Ljava/util/Map;ZLcom/stripe/android/ui/core/cbc/CardBrandChoiceEligibility;Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext;Lcom/stripe/android/CardBrandFilter;)V
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


# static fields
.field public static final INSTANCE:Lcom/stripe/android/ui/core/elements/CardDetailsController$expirationDateElement$1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/ui/core/elements/CardDetailsController$expirationDateElement$1;

    invoke-direct {v0}, Lcom/stripe/android/ui/core/elements/CardDetailsController$expirationDateElement$1;-><init>()V

    sput-object v0, Lcom/stripe/android/ui/core/elements/CardDetailsController$expirationDateElement$1;->INSTANCE:Lcom/stripe/android/ui/core/elements/CardDetailsController$expirationDateElement$1;

    return-void
.end method

.method constructor <init>()V
    .locals 6

    const-class v2, Lcom/stripe/android/ui/core/elements/ExpiryDateContentDescriptionFormatterKt;

    const-string v4, "formatExpirationDateForAccessibility(Ljava/lang/String;)Lcom/stripe/android/core/strings/ResolvableString;"

    const/4 v5, 0x1

    const/4 v1, 0x1

    const-string v3, "formatExpirationDateForAccessibility"

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lkotlin/jvm/internal/FunctionReferenceImpl;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/String;)Lcom/stripe/android/core/strings/ResolvableString;
    .locals 1

    const-string v0, "p0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 96
    invoke-static {p1}, Lcom/stripe/android/ui/core/elements/ExpiryDateContentDescriptionFormatterKt;->formatExpirationDateForAccessibility(Ljava/lang/String;)Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 96
    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/stripe/android/ui/core/elements/CardDetailsController$expirationDateElement$1;->invoke(Ljava/lang/String;)Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object p1

    return-object p1
.end method
