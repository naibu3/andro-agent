.class public abstract Lcom/stripe/android/customersheet/CustomerSheet$CustomerSessionProvider;
.super Ljava/lang/Object;
.source "CustomerSheet.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/customersheet/CustomerSheet;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "CustomerSessionProvider"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\'\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005H\u0096@\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u001e\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\n0\u00052\u0006\u0010\u000b\u001a\u00020\nH\u00a6@\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0016\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u0005H\u00a6@\u00a2\u0006\u0004\u0008\u0010\u0010\u0008\u00a8\u0006\u0011"
    }
    d2 = {
        "Lcom/stripe/android/customersheet/CustomerSheet$CustomerSessionProvider;",
        "",
        "<init>",
        "()V",
        "intentConfiguration",
        "Lkotlin/Result;",
        "Lcom/stripe/android/customersheet/CustomerSheet$IntentConfiguration;",
        "intentConfiguration-IoAF18A",
        "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "provideSetupIntentClientSecret",
        "",
        "customerId",
        "provideSetupIntentClientSecret-gIAlu-s",
        "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "providesCustomerSessionClientSecret",
        "Lcom/stripe/android/customersheet/CustomerSheet$CustomerSessionClientSecret;",
        "providesCustomerSessionClientSecret-IoAF18A",
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

    .line 423
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic intentConfiguration-IoAF18A$suspendImpl(Lcom/stripe/android/customersheet/CustomerSheet$CustomerSessionProvider;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/customersheet/CustomerSheet$CustomerSessionProvider;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Result<",
            "Lcom/stripe/android/customersheet/CustomerSheet$IntentConfiguration;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 430
    sget-object p0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    new-instance p0, Lcom/stripe/android/customersheet/CustomerSheet$IntentConfiguration$Builder;

    invoke-direct {p0}, Lcom/stripe/android/customersheet/CustomerSheet$IntentConfiguration$Builder;-><init>()V

    invoke-virtual {p0}, Lcom/stripe/android/customersheet/CustomerSheet$IntentConfiguration$Builder;->build()Lcom/stripe/android/customersheet/CustomerSheet$IntentConfiguration;

    move-result-object p0

    invoke-static {p0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public intentConfiguration-IoAF18A(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Result<",
            "Lcom/stripe/android/customersheet/CustomerSheet$IntentConfiguration;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-static {p0, p1}, Lcom/stripe/android/customersheet/CustomerSheet$CustomerSessionProvider;->intentConfiguration-IoAF18A$suspendImpl(Lcom/stripe/android/customersheet/CustomerSheet$CustomerSessionProvider;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public abstract provideSetupIntentClientSecret-gIAlu-s(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Result<",
            "Ljava/lang/String;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract providesCustomerSessionClientSecret-IoAF18A(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Result<",
            "Lcom/stripe/android/customersheet/CustomerSheet$CustomerSessionClientSecret;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method
