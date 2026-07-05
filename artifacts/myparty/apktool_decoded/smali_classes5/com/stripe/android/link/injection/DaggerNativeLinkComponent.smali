.class public final Lcom/stripe/android/link/injection/DaggerNativeLinkComponent;
.super Ljava/lang/Object;
.source "DaggerNativeLinkComponent.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$Builder;,
        Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$NativeLinkComponentImpl;
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 113
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static builder()Lcom/stripe/android/link/injection/NativeLinkComponent$Builder;
    .locals 2

    .line 117
    new-instance v0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$Builder;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$Builder;-><init>(Lcom/stripe/android/link/injection/DaggerNativeLinkComponent-IA;)V

    return-object v0
.end method
