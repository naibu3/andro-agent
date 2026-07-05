.class public final synthetic Landroidx/camera/core/impl/utils/MappingRedirectableLiveData$$ExternalSyntheticLambda2;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic f$0:Landroidx/camera/core/impl/utils/MappingRedirectableLiveData;

.field public final synthetic f$1:Landroidx/lifecycle/LiveData;


# direct methods
.method public synthetic constructor <init>(Landroidx/camera/core/impl/utils/MappingRedirectableLiveData;Landroidx/lifecycle/LiveData;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/camera/core/impl/utils/MappingRedirectableLiveData$$ExternalSyntheticLambda2;->f$0:Landroidx/camera/core/impl/utils/MappingRedirectableLiveData;

    iput-object p2, p0, Landroidx/camera/core/impl/utils/MappingRedirectableLiveData$$ExternalSyntheticLambda2;->f$1:Landroidx/lifecycle/LiveData;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 0
    iget-object v0, p0, Landroidx/camera/core/impl/utils/MappingRedirectableLiveData$$ExternalSyntheticLambda2;->f$0:Landroidx/camera/core/impl/utils/MappingRedirectableLiveData;

    iget-object v1, p0, Landroidx/camera/core/impl/utils/MappingRedirectableLiveData$$ExternalSyntheticLambda2;->f$1:Landroidx/lifecycle/LiveData;

    invoke-static {v0, v1}, Landroidx/camera/core/impl/utils/MappingRedirectableLiveData;->$r8$lambda$7tD5RVblOYTL5PUwJg3-Pxb0Rnw(Landroidx/camera/core/impl/utils/MappingRedirectableLiveData;Landroidx/lifecycle/LiveData;)V

    return-void
.end method
