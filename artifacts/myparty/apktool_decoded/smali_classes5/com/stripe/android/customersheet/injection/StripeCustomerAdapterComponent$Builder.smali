.class public interface abstract Lcom/stripe/android/customersheet/injection/StripeCustomerAdapterComponent$Builder;
.super Ljava/lang/Object;
.source "StripeCustomerAdapterComponent.kt"


# annotations
.annotation runtime Ldagger/Component$Builder;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/customersheet/injection/StripeCustomerAdapterComponent;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "Builder"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008g\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0003H\'J\u0010\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0012\u0010\u0006\u001a\u00020\u00002\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\'J\u0018\u0010\u0008\u001a\u00020\u00002\u000e\u0010\u0008\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tH\'J\u0008\u0010\u000b\u001a\u00020\u000cH&\u00a8\u0006\r"
    }
    d2 = {
        "Lcom/stripe/android/customersheet/injection/StripeCustomerAdapterComponent$Builder;",
        "",
        "context",
        "Landroid/content/Context;",
        "customerEphemeralKeyProvider",
        "Lcom/stripe/android/customersheet/CustomerEphemeralKeyProvider;",
        "setupIntentClientSecretProvider",
        "Lcom/stripe/android/customersheet/SetupIntentClientSecretProvider;",
        "paymentMethodTypes",
        "",
        "",
        "build",
        "Lcom/stripe/android/customersheet/injection/StripeCustomerAdapterComponent;",
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


# virtual methods
.method public abstract build()Lcom/stripe/android/customersheet/injection/StripeCustomerAdapterComponent;
.end method

.method public abstract context(Landroid/content/Context;)Lcom/stripe/android/customersheet/injection/StripeCustomerAdapterComponent$Builder;
    .annotation runtime Ldagger/BindsInstance;
    .end annotation
.end method

.method public abstract customerEphemeralKeyProvider(Lcom/stripe/android/customersheet/CustomerEphemeralKeyProvider;)Lcom/stripe/android/customersheet/injection/StripeCustomerAdapterComponent$Builder;
    .annotation runtime Ldagger/BindsInstance;
    .end annotation
.end method

.method public abstract paymentMethodTypes(Ljava/util/List;)Lcom/stripe/android/customersheet/injection/StripeCustomerAdapterComponent$Builder;
    .annotation runtime Ldagger/BindsInstance;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/stripe/android/customersheet/injection/StripeCustomerAdapterComponent$Builder;"
        }
    .end annotation
.end method

.method public abstract setupIntentClientSecretProvider(Lcom/stripe/android/customersheet/SetupIntentClientSecretProvider;)Lcom/stripe/android/customersheet/injection/StripeCustomerAdapterComponent$Builder;
    .annotation runtime Ldagger/BindsInstance;
    .end annotation
.end method
