.class public final Lcom/stripe/android/paymentelement/embedded/form/DaggerFormActivityViewModelComponent;
.super Ljava/lang/Object;
.source "DaggerFormActivityViewModelComponent.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/paymentelement/embedded/form/DaggerFormActivityViewModelComponent$Factory;,
        Lcom/stripe/android/paymentelement/embedded/form/DaggerFormActivityViewModelComponent$FormActivityViewModelComponentImpl;,
        Lcom/stripe/android/paymentelement/embedded/form/DaggerFormActivityViewModelComponent$LinkAnalyticsComponentImpl;,
        Lcom/stripe/android/paymentelement/embedded/form/DaggerFormActivityViewModelComponent$LinkComponentImpl;,
        Lcom/stripe/android/paymentelement/embedded/form/DaggerFormActivityViewModelComponent$FormActivitySubcomponentImpl;,
        Lcom/stripe/android/paymentelement/embedded/form/DaggerFormActivityViewModelComponent$LinkAnalyticsComponentBuilder;,
        Lcom/stripe/android/paymentelement/embedded/form/DaggerFormActivityViewModelComponent$LinkComponentBuilder;,
        Lcom/stripe/android/paymentelement/embedded/form/DaggerFormActivityViewModelComponent$FormActivitySubcomponentFactory;
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 172
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static factory()Lcom/stripe/android/paymentelement/embedded/form/FormActivityViewModelComponent$Factory;
    .locals 2

    .line 176
    new-instance v0, Lcom/stripe/android/paymentelement/embedded/form/DaggerFormActivityViewModelComponent$Factory;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/paymentelement/embedded/form/DaggerFormActivityViewModelComponent$Factory;-><init>(Lcom/stripe/android/paymentelement/embedded/form/DaggerFormActivityViewModelComponent-IA;)V

    return-object v0
.end method
