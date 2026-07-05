.class public interface abstract Lcom/stripe/android/model/ElementsSession$CustomPaymentMethod;
.super Ljava/lang/Object;
.source "ElementsSession.kt"

# interfaces
.implements Lcom/stripe/android/core/model/StripeModel;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/model/ElementsSession;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "CustomPaymentMethod"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/model/ElementsSession$CustomPaymentMethod$Available;,
        Lcom/stripe/android/model/ElementsSession$CustomPaymentMethod$Unavailable;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0008w\u0018\u00002\u00020\u0001:\u0002\u0006\u0007R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u0082\u0001\u0002\u0008\t\u00a8\u0006\n"
    }
    d2 = {
        "Lcom/stripe/android/model/ElementsSession$CustomPaymentMethod;",
        "Lcom/stripe/android/core/model/StripeModel;",
        "type",
        "",
        "getType",
        "()Ljava/lang/String;",
        "Available",
        "Unavailable",
        "Lcom/stripe/android/model/ElementsSession$CustomPaymentMethod$Available;",
        "Lcom/stripe/android/model/ElementsSession$CustomPaymentMethod$Unavailable;",
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
.method public abstract getType()Ljava/lang/String;
.end method
