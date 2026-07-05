.class public final Lcom/stripe/android/paymentelement/embedded/form/FormActivityViewModelModule_Companion_ProvideOnClickOverrideDelegateFactory;
.super Ljava/lang/Object;
.source "FormActivityViewModelModule_Companion_ProvideOnClickOverrideDelegateFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/paymentelement/embedded/form/FormActivityViewModelModule_Companion_ProvideOnClickOverrideDelegateFactory$InstanceHolder;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/stripe/android/paymentelement/embedded/form/OnClickOverrideDelegate;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static create()Lcom/stripe/android/paymentelement/embedded/form/FormActivityViewModelModule_Companion_ProvideOnClickOverrideDelegateFactory;
    .locals 1

    .line 34
    sget-object v0, Lcom/stripe/android/paymentelement/embedded/form/FormActivityViewModelModule_Companion_ProvideOnClickOverrideDelegateFactory$InstanceHolder;->INSTANCE:Lcom/stripe/android/paymentelement/embedded/form/FormActivityViewModelModule_Companion_ProvideOnClickOverrideDelegateFactory;

    return-object v0
.end method

.method public static provideOnClickOverrideDelegate()Lcom/stripe/android/paymentelement/embedded/form/OnClickOverrideDelegate;
    .locals 1

    .line 38
    sget-object v0, Lcom/stripe/android/paymentelement/embedded/form/FormActivityViewModelModule;->Companion:Lcom/stripe/android/paymentelement/embedded/form/FormActivityViewModelModule$Companion;

    invoke-virtual {v0}, Lcom/stripe/android/paymentelement/embedded/form/FormActivityViewModelModule$Companion;->provideOnClickOverrideDelegate()Lcom/stripe/android/paymentelement/embedded/form/OnClickOverrideDelegate;

    move-result-object v0

    invoke-static {v0}, Ldagger/internal/Preconditions;->checkNotNullFromProvides(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/paymentelement/embedded/form/OnClickOverrideDelegate;

    return-object v0
.end method


# virtual methods
.method public get()Lcom/stripe/android/paymentelement/embedded/form/OnClickOverrideDelegate;
    .locals 1

    .line 29
    invoke-static {}, Lcom/stripe/android/paymentelement/embedded/form/FormActivityViewModelModule_Companion_ProvideOnClickOverrideDelegateFactory;->provideOnClickOverrideDelegate()Lcom/stripe/android/paymentelement/embedded/form/OnClickOverrideDelegate;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 10
    invoke-virtual {p0}, Lcom/stripe/android/paymentelement/embedded/form/FormActivityViewModelModule_Companion_ProvideOnClickOverrideDelegateFactory;->get()Lcom/stripe/android/paymentelement/embedded/form/OnClickOverrideDelegate;

    move-result-object v0

    return-object v0
.end method
