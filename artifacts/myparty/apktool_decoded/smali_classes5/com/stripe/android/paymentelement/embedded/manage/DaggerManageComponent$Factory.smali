.class final Lcom/stripe/android/paymentelement/embedded/manage/DaggerManageComponent$Factory;
.super Ljava/lang/Object;
.source "DaggerManageComponent.java"

# interfaces
.implements Lcom/stripe/android/paymentelement/embedded/manage/ManageComponent$Factory;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/paymentelement/embedded/manage/DaggerManageComponent;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "Factory"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 77
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/stripe/android/paymentelement/embedded/manage/DaggerManageComponent-IA;)V
    .locals 0

    invoke-direct {p0}, Lcom/stripe/android/paymentelement/embedded/manage/DaggerManageComponent$Factory;-><init>()V

    return-void
.end method


# virtual methods
.method public build(Landroidx/lifecycle/SavedStateHandle;Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;Landroid/content/Context;Ljava/lang/String;)Lcom/stripe/android/paymentelement/embedded/manage/ManageComponent;
    .locals 7

    .line 82
    invoke-static {p1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 83
    invoke-static {p2}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 84
    invoke-static {p3}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 85
    invoke-static {p4}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 86
    new-instance v0, Lcom/stripe/android/paymentelement/embedded/manage/DaggerManageComponent$ManageComponentImpl;

    new-instance v1, Lcom/stripe/android/core/injection/CoreCommonModule;

    invoke-direct {v1}, Lcom/stripe/android/core/injection/CoreCommonModule;-><init>()V

    const/4 v6, 0x0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v6}, Lcom/stripe/android/paymentelement/embedded/manage/DaggerManageComponent$ManageComponentImpl;-><init>(Lcom/stripe/android/core/injection/CoreCommonModule;Landroidx/lifecycle/SavedStateHandle;Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;Landroid/content/Context;Ljava/lang/String;Lcom/stripe/android/paymentelement/embedded/manage/DaggerManageComponent-IA;)V

    return-object v0
.end method
