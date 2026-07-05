.class public interface abstract Lcom/stripe/android/paymentelement/embedded/manage/ManageModule;
.super Ljava/lang/Object;
.source "ManageComponent.kt"


# annotations
.annotation runtime Ldagger/Module;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/paymentelement/embedded/manage/ManageModule$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008a\u0018\u0000 \r2\u00020\u0001:\u0001\rJ\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0008H\'J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u000cH\'\u00a8\u0006\u000e"
    }
    d2 = {
        "Lcom/stripe/android/paymentelement/embedded/manage/ManageModule;",
        "",
        "bindsEmbeddedManageScreenInteractorFactory",
        "Lcom/stripe/android/paymentelement/embedded/manage/EmbeddedManageScreenInteractorFactory;",
        "factory",
        "Lcom/stripe/android/paymentelement/embedded/manage/DefaultEmbeddedManageScreenInteractorFactory;",
        "bindsEmbeddedUpdateScreenInteractorFactory",
        "Lcom/stripe/android/paymentelement/embedded/manage/EmbeddedUpdateScreenInteractorFactory;",
        "Lcom/stripe/android/paymentelement/embedded/manage/DefaultEmbeddedUpdateScreenInteractorFactory;",
        "bindsUserFacingLogger",
        "Lcom/stripe/android/core/utils/UserFacingLogger;",
        "impl",
        "Lcom/stripe/android/core/utils/RealUserFacingLogger;",
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
.field public static final Companion:Lcom/stripe/android/paymentelement/embedded/manage/ManageModule$Companion;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lcom/stripe/android/paymentelement/embedded/manage/ManageModule$Companion;->$$INSTANCE:Lcom/stripe/android/paymentelement/embedded/manage/ManageModule$Companion;

    sput-object v0, Lcom/stripe/android/paymentelement/embedded/manage/ManageModule;->Companion:Lcom/stripe/android/paymentelement/embedded/manage/ManageModule$Companion;

    return-void
.end method


# virtual methods
.method public abstract bindsEmbeddedManageScreenInteractorFactory(Lcom/stripe/android/paymentelement/embedded/manage/DefaultEmbeddedManageScreenInteractorFactory;)Lcom/stripe/android/paymentelement/embedded/manage/EmbeddedManageScreenInteractorFactory;
    .annotation runtime Ldagger/Binds;
    .end annotation
.end method

.method public abstract bindsEmbeddedUpdateScreenInteractorFactory(Lcom/stripe/android/paymentelement/embedded/manage/DefaultEmbeddedUpdateScreenInteractorFactory;)Lcom/stripe/android/paymentelement/embedded/manage/EmbeddedUpdateScreenInteractorFactory;
    .annotation runtime Ldagger/Binds;
    .end annotation
.end method

.method public abstract bindsUserFacingLogger(Lcom/stripe/android/core/utils/RealUserFacingLogger;)Lcom/stripe/android/core/utils/UserFacingLogger;
    .annotation runtime Ldagger/Binds;
    .end annotation
.end method
