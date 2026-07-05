.class final Lexpo/modules/camera/CameraViewModule$definition$1$12$9;
.super Ljava/lang/Object;
.source "CameraViewModule.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lexpo/modules/camera/CameraViewModule;->definition()Lexpo/modules/kotlin/modules/ModuleDefinitionData;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlin/jvm/functions/Function2<",
        "Lexpo/modules/camera/ExpoCameraView;",
        "Lexpo/modules/camera/records/BarcodeSettings;",
        "Lkotlin/Unit;",
        ">;"
    }
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


# static fields
.field public static final INSTANCE:Lexpo/modules/camera/CameraViewModule$definition$1$12$9;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lexpo/modules/camera/CameraViewModule$definition$1$12$9;

    invoke-direct {v0}, Lexpo/modules/camera/CameraViewModule$definition$1$12$9;-><init>()V

    sput-object v0, Lexpo/modules/camera/CameraViewModule$definition$1$12$9;->INSTANCE:Lexpo/modules/camera/CameraViewModule$definition$1$12$9;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 330
    check-cast p1, Lexpo/modules/camera/ExpoCameraView;

    check-cast p2, Lexpo/modules/camera/records/BarcodeSettings;

    invoke-virtual {p0, p1, p2}, Lexpo/modules/camera/CameraViewModule$definition$1$12$9;->invoke(Lexpo/modules/camera/ExpoCameraView;Lexpo/modules/camera/records/BarcodeSettings;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lexpo/modules/camera/ExpoCameraView;Lexpo/modules/camera/records/BarcodeSettings;)V
    .locals 1

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p2, :cond_0

    .line 332
    invoke-virtual {p1, p2}, Lexpo/modules/camera/ExpoCameraView;->setBarcodeScannerSettings(Lexpo/modules/camera/records/BarcodeSettings;)V

    :cond_0
    return-void
.end method
