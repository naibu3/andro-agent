.class final Lcom/stripe/android/link/RealLinkDismissalCoordinator_Factory$InstanceHolder;
.super Ljava/lang/Object;
.source "RealLinkDismissalCoordinator_Factory.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/link/RealLinkDismissalCoordinator_Factory;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "InstanceHolder"
.end annotation


# static fields
.field static final INSTANCE:Lcom/stripe/android/link/RealLinkDismissalCoordinator_Factory;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 40
    new-instance v0, Lcom/stripe/android/link/RealLinkDismissalCoordinator_Factory;

    invoke-direct {v0}, Lcom/stripe/android/link/RealLinkDismissalCoordinator_Factory;-><init>()V

    sput-object v0, Lcom/stripe/android/link/RealLinkDismissalCoordinator_Factory$InstanceHolder;->INSTANCE:Lcom/stripe/android/link/RealLinkDismissalCoordinator_Factory;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 39
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
