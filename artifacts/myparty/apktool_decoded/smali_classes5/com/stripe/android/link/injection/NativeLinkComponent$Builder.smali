.class public interface abstract Lcom/stripe/android/link/injection/NativeLinkComponent$Builder;
.super Ljava/lang/Object;
.source "NativeLinkComponent.kt"


# annotations
.annotation runtime Ldagger/Component$Builder;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/link/injection/NativeLinkComponent;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "Builder"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008g\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0003H\'J\u0018\u0010\u0004\u001a\u00020\u00002\u000e\u0008\u0001\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005H\'J\u001a\u0010\u0007\u001a\u00020\u00002\u0010\u0008\u0001\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005H\'J\u0012\u0010\u0008\u001a\u00020\u00002\u0008\u0008\u0001\u0010\u0008\u001a\u00020\u0006H\'J\u0010\u0010\t\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\nH\'J\u0010\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u000cH\'J\u0019\u0010\r\u001a\u00020\u00002\n\u0008\u0001\u0010\r\u001a\u0004\u0018\u00010\u000eH\'\u00a2\u0006\u0002\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0011H\'J\u0012\u0010\u0012\u001a\u00020\u00002\u0008\u0008\u0001\u0010\u0012\u001a\u00020\u0013H\'J\u0010\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0015H\'J\u0010\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0017H\'J\u0008\u0010\u0018\u001a\u00020\u0019H&\u00a8\u0006\u001a"
    }
    d2 = {
        "Lcom/stripe/android/link/injection/NativeLinkComponent$Builder;",
        "",
        "configuration",
        "Lcom/stripe/android/link/LinkConfiguration;",
        "publishableKeyProvider",
        "Lkotlin/Function0;",
        "",
        "stripeAccountIdProvider",
        "paymentElementCallbackIdentifier",
        "context",
        "Landroid/content/Context;",
        "savedStateHandle",
        "Landroidx/lifecycle/SavedStateHandle;",
        "statusBarColor",
        "",
        "(Ljava/lang/Integer;)Lcom/stripe/android/link/injection/NativeLinkComponent$Builder;",
        "application",
        "Landroid/app/Application;",
        "linkExpressMode",
        "Lcom/stripe/android/link/LinkExpressMode;",
        "linkLaunchMode",
        "Lcom/stripe/android/link/LinkLaunchMode;",
        "linkAccountUpdate",
        "Lcom/stripe/android/link/LinkAccountUpdate$Value;",
        "build",
        "Lcom/stripe/android/link/injection/NativeLinkComponent;",
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
.method public abstract application(Landroid/app/Application;)Lcom/stripe/android/link/injection/NativeLinkComponent$Builder;
    .annotation runtime Ldagger/BindsInstance;
    .end annotation
.end method

.method public abstract build()Lcom/stripe/android/link/injection/NativeLinkComponent;
.end method

.method public abstract configuration(Lcom/stripe/android/link/LinkConfiguration;)Lcom/stripe/android/link/injection/NativeLinkComponent$Builder;
    .annotation runtime Ldagger/BindsInstance;
    .end annotation
.end method

.method public abstract context(Landroid/content/Context;)Lcom/stripe/android/link/injection/NativeLinkComponent$Builder;
    .annotation runtime Ldagger/BindsInstance;
    .end annotation
.end method

.method public abstract linkAccountUpdate(Lcom/stripe/android/link/LinkAccountUpdate$Value;)Lcom/stripe/android/link/injection/NativeLinkComponent$Builder;
    .annotation runtime Ldagger/BindsInstance;
    .end annotation
.end method

.method public abstract linkExpressMode(Lcom/stripe/android/link/LinkExpressMode;)Lcom/stripe/android/link/injection/NativeLinkComponent$Builder;
    .param p1    # Lcom/stripe/android/link/LinkExpressMode;
        .annotation runtime Ljavax/inject/Named;
            value = "link_express_mode"
        .end annotation
    .end param
    .annotation runtime Ldagger/BindsInstance;
    .end annotation
.end method

.method public abstract linkLaunchMode(Lcom/stripe/android/link/LinkLaunchMode;)Lcom/stripe/android/link/injection/NativeLinkComponent$Builder;
    .annotation runtime Ldagger/BindsInstance;
    .end annotation
.end method

.method public abstract paymentElementCallbackIdentifier(Ljava/lang/String;)Lcom/stripe/android/link/injection/NativeLinkComponent$Builder;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbackIdentifier;
        .end annotation
    .end param
    .annotation runtime Ldagger/BindsInstance;
    .end annotation
.end method

.method public abstract publishableKeyProvider(Lkotlin/jvm/functions/Function0;)Lcom/stripe/android/link/injection/NativeLinkComponent$Builder;
    .param p1    # Lkotlin/jvm/functions/Function0;
        .annotation runtime Ljavax/inject/Named;
            value = "publishableKey"
        .end annotation
    .end param
    .annotation runtime Ldagger/BindsInstance;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/stripe/android/link/injection/NativeLinkComponent$Builder;"
        }
    .end annotation
.end method

.method public abstract savedStateHandle(Landroidx/lifecycle/SavedStateHandle;)Lcom/stripe/android/link/injection/NativeLinkComponent$Builder;
    .annotation runtime Ldagger/BindsInstance;
    .end annotation
.end method

.method public abstract statusBarColor(Ljava/lang/Integer;)Lcom/stripe/android/link/injection/NativeLinkComponent$Builder;
    .param p1    # Ljava/lang/Integer;
        .annotation runtime Ljavax/inject/Named;
            value = "STATUS_BAR_COLOR"
        .end annotation
    .end param
    .annotation runtime Ldagger/BindsInstance;
    .end annotation
.end method

.method public abstract stripeAccountIdProvider(Lkotlin/jvm/functions/Function0;)Lcom/stripe/android/link/injection/NativeLinkComponent$Builder;
    .param p1    # Lkotlin/jvm/functions/Function0;
        .annotation runtime Ljavax/inject/Named;
            value = "stripeAccountId"
        .end annotation
    .end param
    .annotation runtime Ldagger/BindsInstance;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/stripe/android/link/injection/NativeLinkComponent$Builder;"
        }
    .end annotation
.end method
