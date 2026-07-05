.class final Lcom/reactnativestripesdk/customersheet/CustomerSheetFragment$Companion$createCustomerAdapter$customerAdapter$2;
.super Ljava/lang/Object;
.source "CustomerSheetFragment.kt"

# interfaces
.implements Lcom/stripe/android/customersheet/SetupIntentClientSecretProvider;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/reactnativestripesdk/customersheet/CustomerSheetFragment$Companion;->createCustomerAdapter$stripe_stripe_react_native_release(Lcom/facebook/react/bridge/ReactApplicationContext;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)Lcom/reactnativestripesdk/ReactNativeCustomerAdapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
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
.field final synthetic $setupIntentClientSecret:Ljava/lang/String;


# direct methods
.method constructor <init>(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/reactnativestripesdk/customersheet/CustomerSheetFragment$Companion$createCustomerAdapter$customerAdapter$2;->$setupIntentClientSecret:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final provideSetupIntentClientSecret(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/customersheet/CustomerAdapter$Result<",
            "Ljava/lang/String;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 336
    sget-object p1, Lcom/stripe/android/customersheet/CustomerAdapter$Result;->Companion:Lcom/stripe/android/customersheet/CustomerAdapter$Result$Companion;

    .line 337
    iget-object p2, p0, Lcom/reactnativestripesdk/customersheet/CustomerSheetFragment$Companion$createCustomerAdapter$customerAdapter$2;->$setupIntentClientSecret:Ljava/lang/String;

    .line 336
    invoke-virtual {p1, p2}, Lcom/stripe/android/customersheet/CustomerAdapter$Result$Companion;->success(Ljava/lang/Object;)Lcom/stripe/android/customersheet/CustomerAdapter$Result;

    move-result-object p1

    return-object p1
.end method
