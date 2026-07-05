.class public interface abstract Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/di/PollingViewModelModule;
.super Ljava/lang/Object;
.source "PollingViewModelModule.kt"


# annotations
.annotation runtime Ldagger/Module;
    subcomponents = {
        Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/di/PollingViewModelSubcomponent;
    }
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/di/PollingViewModelModule$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008a\u0018\u0000 \t2\u00020\u0001:\u0001\tJ\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0008H\'\u00a8\u0006\n"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/di/PollingViewModelModule;",
        "",
        "bindsIntentStatusPoller",
        "Lcom/stripe/android/polling/IntentStatusPoller;",
        "impl",
        "Lcom/stripe/android/polling/DefaultIntentStatusPoller;",
        "bindsTimeProvider",
        "Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/TimeProvider;",
        "Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/DefaultTimeProvider;",
        "Companion",
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


# static fields
.field public static final Companion:Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/di/PollingViewModelModule$Companion;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/di/PollingViewModelModule$Companion;->$$INSTANCE:Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/di/PollingViewModelModule$Companion;

    sput-object v0, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/di/PollingViewModelModule;->Companion:Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/di/PollingViewModelModule$Companion;

    return-void
.end method


# virtual methods
.method public abstract bindsIntentStatusPoller(Lcom/stripe/android/polling/DefaultIntentStatusPoller;)Lcom/stripe/android/polling/IntentStatusPoller;
    .annotation runtime Ldagger/Binds;
    .end annotation
.end method

.method public abstract bindsTimeProvider(Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/DefaultTimeProvider;)Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/TimeProvider;
    .annotation runtime Ldagger/Binds;
    .end annotation
.end method
