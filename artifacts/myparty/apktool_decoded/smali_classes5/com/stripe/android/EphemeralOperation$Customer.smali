.class public abstract Lcom/stripe/android/EphemeralOperation$Customer;
.super Lcom/stripe/android/EphemeralOperation;
.source "EphemeralOperation.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/EphemeralOperation;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "Customer"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/EphemeralOperation$Customer$AddSource;,
        Lcom/stripe/android/EphemeralOperation$Customer$AttachPaymentMethod;,
        Lcom/stripe/android/EphemeralOperation$Customer$DeleteSource;,
        Lcom/stripe/android/EphemeralOperation$Customer$DetachPaymentMethod;,
        Lcom/stripe/android/EphemeralOperation$Customer$GetPaymentMethods;,
        Lcom/stripe/android/EphemeralOperation$Customer$UpdateDefaultSource;,
        Lcom/stripe/android/EphemeralOperation$Customer$UpdateShipping;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00081\u0018\u00002\u00020\u0001:\u0007\u0004\u0005\u0006\u0007\u0008\t\nB\t\u0008\u0004\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u0082\u0001\u0007\u000b\u000c\r\u000e\u000f\u0010\u0011\u00a8\u0006\u0012"
    }
    d2 = {
        "Lcom/stripe/android/EphemeralOperation$Customer;",
        "Lcom/stripe/android/EphemeralOperation;",
        "<init>",
        "()V",
        "AddSource",
        "DeleteSource",
        "AttachPaymentMethod",
        "DetachPaymentMethod",
        "GetPaymentMethods",
        "UpdateShipping",
        "UpdateDefaultSource",
        "Lcom/stripe/android/EphemeralOperation$Customer$AddSource;",
        "Lcom/stripe/android/EphemeralOperation$Customer$AttachPaymentMethod;",
        "Lcom/stripe/android/EphemeralOperation$Customer$DeleteSource;",
        "Lcom/stripe/android/EphemeralOperation$Customer$DetachPaymentMethod;",
        "Lcom/stripe/android/EphemeralOperation$Customer$GetPaymentMethods;",
        "Lcom/stripe/android/EphemeralOperation$Customer$UpdateDefaultSource;",
        "Lcom/stripe/android/EphemeralOperation$Customer$UpdateShipping;",
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


# static fields
.field public static final $stable:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    .line 19
    invoke-direct {p0, v0}, Lcom/stripe/android/EphemeralOperation;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lcom/stripe/android/EphemeralOperation$Customer;-><init>()V

    return-void
.end method
