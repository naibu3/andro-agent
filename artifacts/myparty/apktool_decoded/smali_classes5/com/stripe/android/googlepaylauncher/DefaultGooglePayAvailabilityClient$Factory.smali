.class public final Lcom/stripe/android/googlepaylauncher/DefaultGooglePayAvailabilityClient$Factory;
.super Ljava/lang/Object;
.source "GooglePayAvailabilityClient.kt"

# interfaces
.implements Lcom/stripe/android/googlepaylauncher/GooglePayAvailabilityClient$Factory;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/googlepaylauncher/DefaultGooglePayAvailabilityClient;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Factory"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016\u00a8\u0006\u0008"
    }
    d2 = {
        "Lcom/stripe/android/googlepaylauncher/DefaultGooglePayAvailabilityClient$Factory;",
        "Lcom/stripe/android/googlepaylauncher/GooglePayAvailabilityClient$Factory;",
        "<init>",
        "()V",
        "create",
        "Lcom/stripe/android/googlepaylauncher/GooglePayAvailabilityClient;",
        "paymentsClient",
        "Lcom/google/android/gms/wallet/PaymentsClient;",
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

.method public constructor <init>()V
    .locals 0

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public create(Lcom/google/android/gms/wallet/PaymentsClient;)Lcom/stripe/android/googlepaylauncher/GooglePayAvailabilityClient;
    .locals 1

    const-string v0, "paymentsClient"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    new-instance v0, Lcom/stripe/android/googlepaylauncher/DefaultGooglePayAvailabilityClient;

    invoke-direct {v0, p1}, Lcom/stripe/android/googlepaylauncher/DefaultGooglePayAvailabilityClient;-><init>(Lcom/google/android/gms/wallet/PaymentsClient;)V

    check-cast v0, Lcom/stripe/android/googlepaylauncher/GooglePayAvailabilityClient;

    return-object v0
.end method
