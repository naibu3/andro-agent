.class public abstract Lcom/stripe/android/customersheet/InternalCustomerSheetResult;
.super Ljava/lang/Object;
.source "InternalCustomerSheetResult.kt"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/customersheet/InternalCustomerSheetResult$Canceled;,
        Lcom/stripe/android/customersheet/InternalCustomerSheetResult$Companion;,
        Lcom/stripe/android/customersheet/InternalCustomerSheetResult$Error;,
        Lcom/stripe/android/customersheet/InternalCustomerSheetResult$Selected;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00081\u0018\u0000 \u000e2\u00020\u0001:\u0004\u000b\u000c\r\u000eB\t\u0008\u0004\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\r\u0010\u0008\u001a\u00020\tH\u0000\u00a2\u0006\u0002\u0008\n\u0082\u0001\u0003\u000f\u0010\u0011\u00a8\u0006\u0012"
    }
    d2 = {
        "Lcom/stripe/android/customersheet/InternalCustomerSheetResult;",
        "Landroid/os/Parcelable;",
        "<init>",
        "()V",
        "toPublicResult",
        "Lcom/stripe/android/customersheet/CustomerSheetResult;",
        "paymentOptionFactory",
        "Lcom/stripe/android/paymentsheet/model/PaymentOptionFactory;",
        "toBundle",
        "Landroid/os/Bundle;",
        "toBundle$paymentsheet_release",
        "Selected",
        "Canceled",
        "Error",
        "Companion",
        "Lcom/stripe/android/customersheet/InternalCustomerSheetResult$Canceled;",
        "Lcom/stripe/android/customersheet/InternalCustomerSheetResult$Error;",
        "Lcom/stripe/android/customersheet/InternalCustomerSheetResult$Selected;",
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
.field public static final $stable:I = 0x0

.field public static final Companion:Lcom/stripe/android/customersheet/InternalCustomerSheetResult$Companion;

.field private static final EXTRA_RESULT:Ljava/lang/String; = "extra_activity_result"


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/customersheet/InternalCustomerSheetResult$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/customersheet/InternalCustomerSheetResult$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/customersheet/InternalCustomerSheetResult;->Companion:Lcom/stripe/android/customersheet/InternalCustomerSheetResult$Companion;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lcom/stripe/android/customersheet/InternalCustomerSheetResult;-><init>()V

    return-void
.end method


# virtual methods
.method public final toBundle$paymentsheet_release()Landroid/os/Bundle;
    .locals 3

    const/4 v0, 0x1

    .line 75
    new-array v0, v0, [Lkotlin/Pair;

    const-string v1, "extra_activity_result"

    invoke-static {v1, p0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-static {v0}, Landroidx/core/os/BundleKt;->bundleOf([Lkotlin/Pair;)Landroid/os/Bundle;

    move-result-object v0

    return-object v0
.end method

.method public abstract toPublicResult(Lcom/stripe/android/paymentsheet/model/PaymentOptionFactory;)Lcom/stripe/android/customersheet/CustomerSheetResult;
.end method
