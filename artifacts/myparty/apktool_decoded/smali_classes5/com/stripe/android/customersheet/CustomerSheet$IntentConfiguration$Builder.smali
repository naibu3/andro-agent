.class public final Lcom/stripe/android/customersheet/CustomerSheet$IntentConfiguration$Builder;
.super Ljava/lang/Object;
.source "CustomerSheet.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/customersheet/CustomerSheet$IntentConfiguration;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00002\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005J\u0006\u0010\u0007\u001a\u00020\u0008R\u0014\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"
    }
    d2 = {
        "Lcom/stripe/android/customersheet/CustomerSheet$IntentConfiguration$Builder;",
        "",
        "<init>",
        "()V",
        "paymentMethodTypes",
        "",
        "",
        "build",
        "Lcom/stripe/android/customersheet/CustomerSheet$IntentConfiguration;",
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
.field public static final $stable:I = 0x8


# instance fields
.field private paymentMethodTypes:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 365
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 367
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/stripe/android/customersheet/CustomerSheet$IntentConfiguration$Builder;->paymentMethodTypes:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final build()Lcom/stripe/android/customersheet/CustomerSheet$IntentConfiguration;
    .locals 2

    .line 382
    new-instance v0, Lcom/stripe/android/customersheet/CustomerSheet$IntentConfiguration;

    .line 383
    iget-object v1, p0, Lcom/stripe/android/customersheet/CustomerSheet$IntentConfiguration$Builder;->paymentMethodTypes:Ljava/util/List;

    .line 382
    invoke-direct {v0, v1}, Lcom/stripe/android/customersheet/CustomerSheet$IntentConfiguration;-><init>(Ljava/util/List;)V

    return-object v0
.end method

.method public final paymentMethodTypes(Ljava/util/List;)Lcom/stripe/android/customersheet/CustomerSheet$IntentConfiguration$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/stripe/android/customersheet/CustomerSheet$IntentConfiguration$Builder;"
        }
    .end annotation

    const-string v0, "paymentMethodTypes"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 374
    move-object v0, p0

    check-cast v0, Lcom/stripe/android/customersheet/CustomerSheet$IntentConfiguration$Builder;

    .line 375
    iput-object p1, p0, Lcom/stripe/android/customersheet/CustomerSheet$IntentConfiguration$Builder;->paymentMethodTypes:Ljava/util/List;

    return-object p0
.end method
