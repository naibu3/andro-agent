.class public final Lcom/stripe/android/link/injection/DaggerLinkControllerComponent;
.super Ljava/lang/Object;
.source "DaggerLinkControllerComponent.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/link/injection/DaggerLinkControllerComponent$Factory;,
        Lcom/stripe/android/link/injection/DaggerLinkControllerComponent$LinkControllerComponentImpl;,
        Lcom/stripe/android/link/injection/DaggerLinkControllerComponent$LinkControllerPresenterComponentImpl;,
        Lcom/stripe/android/link/injection/DaggerLinkControllerComponent$LinkComponentImpl;,
        Lcom/stripe/android/link/injection/DaggerLinkControllerComponent$LinkControllerPresenterComponentFactory;,
        Lcom/stripe/android/link/injection/DaggerLinkControllerComponent$LinkComponentBuilder;
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 137
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static factory()Lcom/stripe/android/link/injection/LinkControllerComponent$Factory;
    .locals 2

    .line 141
    new-instance v0, Lcom/stripe/android/link/injection/DaggerLinkControllerComponent$Factory;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/link/injection/DaggerLinkControllerComponent$Factory;-><init>(Lcom/stripe/android/link/injection/DaggerLinkControllerComponent-IA;)V

    return-object v0
.end method
