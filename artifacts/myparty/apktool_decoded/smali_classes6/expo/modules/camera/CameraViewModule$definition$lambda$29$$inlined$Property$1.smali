.class public final Lexpo/modules/camera/CameraViewModule$definition$lambda$29$$inlined$Property$1;
.super Ljava/lang/Object;
.source "PropertyComponentBuilder.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lexpo/modules/camera/CameraViewModule;->definition()Lexpo/modules/kotlin/modules/ModuleDefinitionData;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlin/jvm/functions/Function1<",
        "[",
        "Ljava/lang/Object;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nPropertyComponentBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PropertyComponentBuilder.kt\nexpo/modules/kotlin/objects/PropertyComponentBuilder$get$1$1\n+ 2 CameraViewModule.kt\nexpo/modules/camera/CameraViewModule\n*L\n1#1,19:1\n72#2:20\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic this$0:Lexpo/modules/camera/CameraViewModule;


# direct methods
.method public constructor <init>(Lexpo/modules/camera/CameraViewModule;)V
    .locals 0

    iput-object p1, p0, Lexpo/modules/camera/CameraViewModule$definition$lambda$29$$inlined$Property$1;->this$0:Lexpo/modules/camera/CameraViewModule;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 19
    check-cast p1, [Ljava/lang/Object;

    invoke-virtual {p0, p1}, Lexpo/modules/camera/CameraViewModule$definition$lambda$29$$inlined$Property$1;->invoke([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    sget-object p1, Lexpo/modules/core/utilities/VRUtilities;->Companion:Lexpo/modules/core/utilities/VRUtilities$Companion;

    invoke-virtual {p1}, Lexpo/modules/core/utilities/VRUtilities$Companion;->isQuest()Z

    move-result p1

    if-nez p1, :cond_0

    sget-object p1, Lexpo/modules/camera/utils/CameraUtils;->INSTANCE:Lexpo/modules/camera/utils/CameraUtils;

    iget-object v0, p0, Lexpo/modules/camera/CameraViewModule$definition$lambda$29$$inlined$Property$1;->this$0:Lexpo/modules/camera/CameraViewModule;

    invoke-virtual {v0}, Lexpo/modules/camera/CameraViewModule;->getAppContext()Lexpo/modules/kotlin/AppContext;

    move-result-object v0

    invoke-virtual {v0}, Lexpo/modules/kotlin/AppContext;->getReactContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p1, v0}, Lexpo/modules/camera/utils/CameraUtils;->isMLKitAvailable(Landroid/content/Context;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
