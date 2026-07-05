.class public final Lcom/stripe/android/paymentsheet/ui/DefaultEditCardDetailsInteractor$Factory;
.super Ljava/lang/Object;
.source "EditCardDetailsInteractor.kt"

# interfaces
.implements Lcom/stripe/android/paymentsheet/ui/EditCardDetailsInteractor$Factory;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/paymentsheet/ui/DefaultEditCardDetailsInteractor;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Factory"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003Jd\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0008\u0010\u0008\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000c\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0016\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011j\u0002`\u00142\u0018\u0010\u0015\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0012\u0004\u0012\u00020\u00130\u0011j\u0002`\u0017H\u0016\u00a8\u0006\u0018"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/ui/DefaultEditCardDetailsInteractor$Factory;",
        "Lcom/stripe/android/paymentsheet/ui/EditCardDetailsInteractor$Factory;",
        "<init>",
        "()V",
        "create",
        "Lcom/stripe/android/paymentsheet/ui/EditCardDetailsInteractor;",
        "coroutineScope",
        "Lkotlinx/coroutines/CoroutineScope;",
        "cardEditConfiguration",
        "Lcom/stripe/android/paymentsheet/ui/CardEditConfiguration;",
        "requiresModification",
        "",
        "payload",
        "Lcom/stripe/android/paymentsheet/ui/EditCardPayload;",
        "billingDetailsCollectionConfiguration",
        "Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;",
        "onBrandChoiceChanged",
        "Lkotlin/Function1;",
        "Lcom/stripe/android/model/CardBrand;",
        "",
        "Lcom/stripe/android/paymentsheet/ui/CardBrandCallback;",
        "onCardUpdateParamsChanged",
        "Lcom/stripe/android/paymentsheet/CardUpdateParams;",
        "Lcom/stripe/android/paymentsheet/ui/CardUpdateParamsCallback;",
        "paymentsheet_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final $stable:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 372
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public create(Lkotlinx/coroutines/CoroutineScope;Lcom/stripe/android/paymentsheet/ui/CardEditConfiguration;ZLcom/stripe/android/paymentsheet/ui/EditCardPayload;Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lcom/stripe/android/paymentsheet/ui/EditCardDetailsInteractor;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/CoroutineScope;",
            "Lcom/stripe/android/paymentsheet/ui/CardEditConfiguration;",
            "Z",
            "Lcom/stripe/android/paymentsheet/ui/EditCardPayload;",
            "Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/stripe/android/model/CardBrand;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/stripe/android/paymentsheet/CardUpdateParams;",
            "Lkotlin/Unit;",
            ">;)",
            "Lcom/stripe/android/paymentsheet/ui/EditCardDetailsInteractor;"
        }
    .end annotation

    const-string v0, "coroutineScope"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "payload"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "billingDetailsCollectionConfiguration"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onBrandChoiceChanged"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onCardUpdateParamsChanged"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 382
    new-instance v1, Lcom/stripe/android/paymentsheet/ui/DefaultEditCardDetailsInteractor;

    move-object v6, p1

    move-object v4, p2

    move v5, p3

    move-object v2, p4

    move-object v3, p5

    move-object v7, p6

    invoke-direct/range {v1 .. v8}, Lcom/stripe/android/paymentsheet/ui/DefaultEditCardDetailsInteractor;-><init>(Lcom/stripe/android/paymentsheet/ui/EditCardPayload;Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;Lcom/stripe/android/paymentsheet/ui/CardEditConfiguration;ZLkotlinx/coroutines/CoroutineScope;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    check-cast v1, Lcom/stripe/android/paymentsheet/ui/EditCardDetailsInteractor;

    return-object v1
.end method
