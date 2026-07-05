.class public final Lcom/stripe/android/customersheet/analytics/CustomerSheetEvent$LoadSucceeded;
.super Lcom/stripe/android/customersheet/analytics/CustomerSheetEvent;
.source "CustomerSheetEvent.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/customersheet/analytics/CustomerSheetEvent;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "LoadSucceeded"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096D\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\tR\"\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u000c0\u000b8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\r\u0010\u000e\u00a8\u0006\u000f"
    }
    d2 = {
        "Lcom/stripe/android/customersheet/analytics/CustomerSheetEvent$LoadSucceeded;",
        "Lcom/stripe/android/customersheet/analytics/CustomerSheetEvent;",
        "customerSheetSession",
        "Lcom/stripe/android/customersheet/data/CustomerSheetSession;",
        "<init>",
        "(Lcom/stripe/android/customersheet/data/CustomerSheetSession;)V",
        "eventName",
        "",
        "getEventName",
        "()Ljava/lang/String;",
        "additionalParams",
        "",
        "",
        "getAdditionalParams",
        "()Ljava/util/Map;",
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
.field private final customerSheetSession:Lcom/stripe/android/customersheet/data/CustomerSheetSession;

.field private final eventName:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/customersheet/data/CustomerSheetSession;)V
    .locals 1

    const-string v0, "customerSheetSession"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 244
    invoke-direct {p0, v0}, Lcom/stripe/android/customersheet/analytics/CustomerSheetEvent;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 243
    iput-object p1, p0, Lcom/stripe/android/customersheet/analytics/CustomerSheetEvent$LoadSucceeded;->customerSheetSession:Lcom/stripe/android/customersheet/data/CustomerSheetSession;

    .line 245
    const-string p1, "cs_load_succeeded"

    iput-object p1, p0, Lcom/stripe/android/customersheet/analytics/CustomerSheetEvent$LoadSucceeded;->eventName:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public getAdditionalParams()Ljava/util/Map;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 250
    iget-object v0, p0, Lcom/stripe/android/customersheet/analytics/CustomerSheetEvent$LoadSucceeded;->customerSheetSession:Lcom/stripe/android/customersheet/data/CustomerSheetSession;

    invoke-virtual {v0}, Lcom/stripe/android/customersheet/data/CustomerSheetSession;->getElementsSession()Lcom/stripe/android/model/ElementsSession;

    move-result-object v0

    .line 249
    invoke-static {v0}, Lcom/stripe/android/customersheet/util/SyncDefaultPaymentMethodUtilsKt;->getDefaultPaymentMethodsEnabledForCustomerSheet(Lcom/stripe/android/model/ElementsSession;)Z

    move-result v0

    .line 252
    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    check-cast v1, Ljava/util/Map;

    .line 253
    iget-object v2, p0, Lcom/stripe/android/customersheet/analytics/CustomerSheetEvent$LoadSucceeded;->customerSheetSession:Lcom/stripe/android/customersheet/data/CustomerSheetSession;

    invoke-virtual {v2}, Lcom/stripe/android/customersheet/data/CustomerSheetSession;->getElementsSession()Lcom/stripe/android/model/ElementsSession;

    move-result-object v2

    invoke-virtual {v2}, Lcom/stripe/android/model/ElementsSession;->getCustomer()Lcom/stripe/android/model/ElementsSession$Customer;

    move-result-object v2

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Lcom/stripe/android/model/ElementsSession$Customer;->getSession()Lcom/stripe/android/model/ElementsSession$Customer$Session;

    move-result-object v2

    goto :goto_0

    :cond_0
    move-object v2, v3

    :goto_0
    if-eqz v2, :cond_3

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    .line 254
    const-string v4, "sync_default_enabled"

    invoke-interface {v1, v4, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    if-eqz v0, :cond_3

    .line 257
    iget-object v0, p0, Lcom/stripe/android/customersheet/analytics/CustomerSheetEvent$LoadSucceeded;->customerSheetSession:Lcom/stripe/android/customersheet/data/CustomerSheetSession;

    invoke-virtual {v0}, Lcom/stripe/android/customersheet/data/CustomerSheetSession;->getElementsSession()Lcom/stripe/android/model/ElementsSession;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/model/ElementsSession;->getCustomer()Lcom/stripe/android/model/ElementsSession$Customer;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/stripe/android/model/ElementsSession$Customer;->getDefaultPaymentMethod()Ljava/lang/String;

    move-result-object v3

    :cond_1
    if-eqz v3, :cond_2

    const/4 v0, 0x1

    goto :goto_1

    :cond_2
    const/4 v0, 0x0

    :goto_1
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    .line 256
    const-string v2, "has_default_payment_method"

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    return-object v1
.end method

.method public getEventName()Ljava/lang/String;
    .locals 1

    .line 245
    iget-object v0, p0, Lcom/stripe/android/customersheet/analytics/CustomerSheetEvent$LoadSucceeded;->eventName:Ljava/lang/String;

    return-object v0
.end method
