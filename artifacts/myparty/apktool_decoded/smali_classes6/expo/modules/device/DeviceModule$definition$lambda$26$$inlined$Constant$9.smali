.class public final Lexpo/modules/device/DeviceModule$definition$lambda$26$$inlined$Constant$9;
.super Ljava/lang/Object;
.source "ConstantComponentBuilder.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lexpo/modules/device/DeviceModule;->definition()Lexpo/modules/kotlin/modules/ModuleDefinitionData;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlin/jvm/functions/Function0<",
        "Ljava/lang/Integer;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nConstantComponentBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConstantComponentBuilder.kt\nexpo/modules/kotlin/objects/ObjectDefinitionBuilder$Constant$lambda$50$$inlined$get$1\n+ 2 DeviceModule.kt\nexpo/modules/device/DeviceModule\n*L\n1#1,12:1\n72#2:13\n*E\n"
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
.field final synthetic this$0:Lexpo/modules/device/DeviceModule;


# direct methods
.method public constructor <init>(Lexpo/modules/device/DeviceModule;)V
    .locals 0

    iput-object p1, p0, Lexpo/modules/device/DeviceModule$definition$lambda$26$$inlined$Constant$9;->this$0:Lexpo/modules/device/DeviceModule;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Integer;"
        }
    .end annotation

    .line 13
    sget-object v0, Lexpo/modules/device/DeviceModule;->Companion:Lexpo/modules/device/DeviceModule$Companion;

    iget-object v1, p0, Lexpo/modules/device/DeviceModule$definition$lambda$26$$inlined$Constant$9;->this$0:Lexpo/modules/device/DeviceModule;

    invoke-static {v1}, Lexpo/modules/device/DeviceModule;->access$getContext(Lexpo/modules/device/DeviceModule;)Landroid/content/Context;

    move-result-object v1

    invoke-static {v0, v1}, Lexpo/modules/device/DeviceModule$Companion;->access$getDeviceType(Lexpo/modules/device/DeviceModule$Companion;Landroid/content/Context;)Lexpo/modules/device/DeviceModule$DeviceType;

    move-result-object v0

    invoke-virtual {v0}, Lexpo/modules/device/DeviceModule$DeviceType;->getJSValue()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method
