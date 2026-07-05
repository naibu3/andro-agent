.class final synthetic Lcom/reactnativestripesdk/customersheet/CustomerSheetFragment$Companion$createCustomerAdapter$customerAdapter$3;
.super Ljava/lang/Object;
.source "CustomerSheetFragment.kt"

# interfaces
.implements Lcom/stripe/android/customersheet/CustomerEphemeralKeyProvider;
.implements Lkotlin/jvm/internal/FunctionAdapter;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/reactnativestripesdk/customersheet/CustomerSheetFragment$Companion;->createCustomerAdapter$stripe_stripe_react_native_release(Lcom/facebook/react/bridge/ReactApplicationContext;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)Lcom/reactnativestripesdk/ReactNativeCustomerAdapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1000
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $tmp0:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lcom/stripe/android/customersheet/CustomerAdapter$Result<",
            "Lcom/stripe/android/customersheet/CustomerEphemeralKey;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lkotlin/jvm/functions/Function0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function0<",
            "+",
            "Lcom/stripe/android/customersheet/CustomerAdapter$Result<",
            "Lcom/stripe/android/customersheet/CustomerEphemeralKey;",
            ">;>;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/reactnativestripesdk/customersheet/CustomerSheetFragment$Companion$createCustomerAdapter$customerAdapter$3;->$tmp0:Lkotlin/jvm/functions/Function0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    instance-of v0, p1, Lcom/stripe/android/customersheet/CustomerEphemeralKeyProvider;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    instance-of v0, p1, Lkotlin/jvm/internal/FunctionAdapter;

    if-eqz v0, :cond_0

    move-object v0, p0

    check-cast v0, Lkotlin/jvm/internal/FunctionAdapter;

    invoke-interface {v0}, Lkotlin/jvm/internal/FunctionAdapter;->getFunctionDelegate()Lkotlin/Function;

    move-result-object v0

    check-cast p1, Lkotlin/jvm/internal/FunctionAdapter;

    invoke-interface {p1}, Lkotlin/jvm/internal/FunctionAdapter;->getFunctionDelegate()Lkotlin/Function;

    move-result-object p1

    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_0
    return v1
.end method

.method public final getFunctionDelegate()Lkotlin/Function;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/Function<",
            "*>;"
        }
    .end annotation

    new-instance v0, Lkotlin/jvm/internal/FunctionReferenceImpl;

    iget-object v2, p0, Lcom/reactnativestripesdk/customersheet/CustomerSheetFragment$Companion$createCustomerAdapter$customerAdapter$3;->$tmp0:Lkotlin/jvm/functions/Function0;

    const-class v3, Lkotlin/jvm/internal/Intrinsics$Kotlin;

    const-string v5, "createCustomerAdapter$suspendConversion1(Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"

    const/4 v6, 0x0

    const/4 v1, 0x1

    const-string v4, "suspendConversion1"

    invoke-direct/range {v0 .. v6}, Lkotlin/jvm/internal/FunctionReferenceImpl;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    check-cast v0, Lkotlin/Function;

    return-object v0
.end method

.method public final hashCode()I
    .locals 1

    move-object v0, p0

    check-cast v0, Lkotlin/jvm/internal/FunctionAdapter;

    invoke-interface {v0}, Lkotlin/jvm/internal/FunctionAdapter;->getFunctionDelegate()Lkotlin/Function;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public final provideCustomerEphemeralKey(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/customersheet/CustomerAdapter$Result<",
            "Lcom/stripe/android/customersheet/CustomerEphemeralKey;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 344
    iget-object v0, p0, Lcom/reactnativestripesdk/customersheet/CustomerSheetFragment$Companion$createCustomerAdapter$customerAdapter$3;->$tmp0:Lkotlin/jvm/functions/Function0;

    invoke-static {v0, p1}, Lcom/reactnativestripesdk/customersheet/CustomerSheetFragment$Companion;->access$createCustomerAdapter$suspendConversion1(Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
