.class public interface abstract Lcom/stripe/android/model/StripeIntent;
.super Ljava/lang/Object;
.source "StripeIntent.kt"

# interfaces
.implements Lcom/stripe/android/core/model/StripeModel;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/model/StripeIntent$NextActionData;,
        Lcom/stripe/android/model/StripeIntent$NextActionType;,
        Lcom/stripe/android/model/StripeIntent$Status;,
        Lcom/stripe/android/model/StripeIntent$Usage;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\t\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010 \n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u000e\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0008v\u0018\u00002\u00020\u0001:\u00045678J\u0008\u00100\u001a\u00020\rH&J\u0008\u00101\u001a\u00020\rH&J\u0016\u00102\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010403H\'R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0008\u0010\tR\u0014\u0010\n\u001a\u0004\u0018\u00010\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000b\u0010\u0005R\u0012\u0010\u000c\u001a\u00020\rX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000c\u0010\u000eR\u0014\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u0004\u0018\u00010\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0014\u0010\u0005R\u0018\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0016X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u0004\u0018\u00010\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001e\u0010\u0005R\u0014\u0010\u001f\u001a\u0004\u0018\u00010 X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008!\u0010\"R\u0014\u0010#\u001a\u0004\u0018\u00010$X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008%\u0010&R\u0012\u0010\'\u001a\u00020\rX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\'\u0010\u000eR\u0014\u0010(\u001a\u0004\u0018\u00010\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008)\u0010\u0005R\u0018\u0010*\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0016X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008+\u0010\u0018R\u0018\u0010,\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0016X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008-\u0010\u0018R\u0016\u0010.\u001a\u0004\u0018\u00010\u00038gX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008/\u0010\u0005\u0082\u0001\u00029:\u00a8\u0006;"
    }
    d2 = {
        "Lcom/stripe/android/model/StripeIntent;",
        "Lcom/stripe/android/core/model/StripeModel;",
        "id",
        "",
        "getId",
        "()Ljava/lang/String;",
        "created",
        "",
        "getCreated",
        "()J",
        "description",
        "getDescription",
        "isLiveMode",
        "",
        "()Z",
        "paymentMethod",
        "Lcom/stripe/android/model/PaymentMethod;",
        "getPaymentMethod",
        "()Lcom/stripe/android/model/PaymentMethod;",
        "paymentMethodId",
        "getPaymentMethodId",
        "paymentMethodTypes",
        "",
        "getPaymentMethodTypes",
        "()Ljava/util/List;",
        "nextActionType",
        "Lcom/stripe/android/model/StripeIntent$NextActionType;",
        "getNextActionType",
        "()Lcom/stripe/android/model/StripeIntent$NextActionType;",
        "clientSecret",
        "getClientSecret",
        "status",
        "Lcom/stripe/android/model/StripeIntent$Status;",
        "getStatus",
        "()Lcom/stripe/android/model/StripeIntent$Status;",
        "nextActionData",
        "Lcom/stripe/android/model/StripeIntent$NextActionData;",
        "getNextActionData",
        "()Lcom/stripe/android/model/StripeIntent$NextActionData;",
        "isConfirmed",
        "lastErrorMessage",
        "getLastErrorMessage",
        "unactivatedPaymentMethods",
        "getUnactivatedPaymentMethods",
        "linkFundingSources",
        "getLinkFundingSources",
        "countryCode",
        "getCountryCode",
        "requiresAction",
        "requiresConfirmation",
        "getPaymentMethodOptions",
        "",
        "",
        "NextActionType",
        "Status",
        "Usage",
        "NextActionData",
        "Lcom/stripe/android/model/PaymentIntent;",
        "Lcom/stripe/android/model/SetupIntent;",
        "payments-core_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# virtual methods
.method public abstract getClientSecret()Ljava/lang/String;
.end method

.method public abstract getCountryCode()Ljava/lang/String;
.end method

.method public abstract getCreated()J
.end method

.method public abstract getDescription()Ljava/lang/String;
.end method

.method public abstract getId()Ljava/lang/String;
.end method

.method public abstract getLastErrorMessage()Ljava/lang/String;
.end method

.method public abstract getLinkFundingSources()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getNextActionData()Lcom/stripe/android/model/StripeIntent$NextActionData;
.end method

.method public abstract getNextActionType()Lcom/stripe/android/model/StripeIntent$NextActionType;
.end method

.method public abstract getPaymentMethod()Lcom/stripe/android/model/PaymentMethod;
.end method

.method public abstract getPaymentMethodId()Ljava/lang/String;
.end method

.method public abstract getPaymentMethodOptions()Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getPaymentMethodTypes()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getStatus()Lcom/stripe/android/model/StripeIntent$Status;
.end method

.method public abstract getUnactivatedPaymentMethods()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end method

.method public abstract isConfirmed()Z
.end method

.method public abstract isLiveMode()Z
.end method

.method public abstract requiresAction()Z
.end method

.method public abstract requiresConfirmation()Z
.end method
