.class public final Lio/qonversion/sandwich/QonversionSandwich$setEntitlementsUpdateListener$1$1;
.super Ljava/lang/Object;
.source "QonversionSandwich.kt"

# interfaces
.implements Lcom/qonversion/android/sdk/listeners/QEntitlementsUpdateListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/qonversion/sandwich/QonversionSandwich;->setEntitlementsUpdateListener(Lcom/qonversion/android/sdk/QonversionConfig$Builder;)Lcom/qonversion/android/sdk/QonversionConfig$Builder;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0016\u00a8\u0006\u0008"
    }
    d2 = {
        "io/qonversion/sandwich/QonversionSandwich$setEntitlementsUpdateListener$1$1",
        "Lcom/qonversion/android/sdk/listeners/QEntitlementsUpdateListener;",
        "onEntitlementsUpdated",
        "",
        "entitlements",
        "",
        "",
        "Lcom/qonversion/android/sdk/dto/entitlements/QEntitlement;",
        "sandwich_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic this$0:Lio/qonversion/sandwich/QonversionSandwich;


# direct methods
.method constructor <init>(Lio/qonversion/sandwich/QonversionSandwich;)V
    .locals 0

    iput-object p1, p0, Lio/qonversion/sandwich/QonversionSandwich$setEntitlementsUpdateListener$1$1;->this$0:Lio/qonversion/sandwich/QonversionSandwich;

    .line 449
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onEntitlementsUpdated(Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/qonversion/android/sdk/dto/entitlements/QEntitlement;",
            ">;)V"
        }
    .end annotation

    const-string v0, "entitlements"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 451
    iget-object v0, p0, Lio/qonversion/sandwich/QonversionSandwich$setEntitlementsUpdateListener$1$1;->this$0:Lio/qonversion/sandwich/QonversionSandwich;

    invoke-static {v0}, Lio/qonversion/sandwich/QonversionSandwich;->access$getQonversionEventsListener$p(Lio/qonversion/sandwich/QonversionSandwich;)Lio/qonversion/sandwich/QonversionEventsListener;

    move-result-object v0

    invoke-static {p1}, Lio/qonversion/sandwich/MappersKt;->toEntitlementsMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object p1

    invoke-interface {v0, p1}, Lio/qonversion/sandwich/QonversionEventsListener;->onEntitlementsUpdated(Ljava/util/Map;)V

    return-void
.end method
