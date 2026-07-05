.class public interface abstract Lcom/stripe/android/model/ElementsSessionParams;
.super Ljava/lang/Object;
.source "ElementsSessionParams.kt"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/model/ElementsSessionParams$DeferredIntentType;,
        Lcom/stripe/android/model/ElementsSessionParams$PaymentIntentType;,
        Lcom/stripe/android/model/ElementsSessionParams$SellerDetails;,
        Lcom/stripe/android/model/ElementsSessionParams$SetupIntentType;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\r\n\u0002\u0010 \n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0008w\u0018\u00002\u00020\u0001:\u0004 !\"#R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0007\u0010\u0005R\u0014\u0010\u0008\u001a\u0004\u0018\u00010\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\t\u0010\u0005R\u0014\u0010\n\u001a\u0004\u0018\u00010\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000b\u0010\u0005R\u0014\u0010\u000c\u001a\u0004\u0018\u00010\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\r\u0010\u0005R\u0014\u0010\u000e\u001a\u0004\u0018\u00010\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000f\u0010\u0005R\u0018\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0011X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u0004\u0018\u00010\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0015\u0010\u0005R\u0018\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0011X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0017\u0010\u0013R\u0018\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0011X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0019\u0010\u0013R\u0012\u0010\u001a\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001b\u0010\u0005R\u0014\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001e\u0010\u001f\u0082\u0001\u0003$%&\u00a8\u0006\'"
    }
    d2 = {
        "Lcom/stripe/android/model/ElementsSessionParams;",
        "Landroid/os/Parcelable;",
        "type",
        "",
        "getType",
        "()Ljava/lang/String;",
        "clientSecret",
        "getClientSecret",
        "customerSessionClientSecret",
        "getCustomerSessionClientSecret",
        "legacyCustomerEphemeralKey",
        "getLegacyCustomerEphemeralKey",
        "mobileSessionId",
        "getMobileSessionId",
        "locale",
        "getLocale",
        "expandFields",
        "",
        "getExpandFields",
        "()Ljava/util/List;",
        "savedPaymentMethodSelectionId",
        "getSavedPaymentMethodSelectionId",
        "customPaymentMethods",
        "getCustomPaymentMethods",
        "externalPaymentMethods",
        "getExternalPaymentMethods",
        "appId",
        "getAppId",
        "sellerDetails",
        "Lcom/stripe/android/model/ElementsSessionParams$SellerDetails;",
        "getSellerDetails",
        "()Lcom/stripe/android/model/ElementsSessionParams$SellerDetails;",
        "PaymentIntentType",
        "SetupIntentType",
        "DeferredIntentType",
        "SellerDetails",
        "Lcom/stripe/android/model/ElementsSessionParams$DeferredIntentType;",
        "Lcom/stripe/android/model/ElementsSessionParams$PaymentIntentType;",
        "Lcom/stripe/android/model/ElementsSessionParams$SetupIntentType;",
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
.method public abstract getAppId()Ljava/lang/String;
.end method

.method public abstract getClientSecret()Ljava/lang/String;
.end method

.method public abstract getCustomPaymentMethods()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getCustomerSessionClientSecret()Ljava/lang/String;
.end method

.method public abstract getExpandFields()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getExternalPaymentMethods()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getLegacyCustomerEphemeralKey()Ljava/lang/String;
.end method

.method public abstract getLocale()Ljava/lang/String;
.end method

.method public abstract getMobileSessionId()Ljava/lang/String;
.end method

.method public abstract getSavedPaymentMethodSelectionId()Ljava/lang/String;
.end method

.method public abstract getSellerDetails()Lcom/stripe/android/model/ElementsSessionParams$SellerDetails;
.end method

.method public abstract getType()Ljava/lang/String;
.end method
