.class public final Lcom/stripe/android/paymentelement/embedded/manage/DaggerManageComponent;
.super Ljava/lang/Object;
.source "DaggerManageComponent.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/paymentelement/embedded/manage/DaggerManageComponent$Factory;,
        Lcom/stripe/android/paymentelement/embedded/manage/DaggerManageComponent$ManageComponentImpl;
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 70
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static factory()Lcom/stripe/android/paymentelement/embedded/manage/ManageComponent$Factory;
    .locals 2

    .line 74
    new-instance v0, Lcom/stripe/android/paymentelement/embedded/manage/DaggerManageComponent$Factory;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/paymentelement/embedded/manage/DaggerManageComponent$Factory;-><init>(Lcom/stripe/android/paymentelement/embedded/manage/DaggerManageComponent-IA;)V

    return-object v0
.end method
