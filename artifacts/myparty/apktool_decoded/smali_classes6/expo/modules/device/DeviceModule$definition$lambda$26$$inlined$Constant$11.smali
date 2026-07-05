.class public final Lexpo/modules/device/DeviceModule$definition$lambda$26$$inlined$Constant$11;
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
        "Ljava/lang/String;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nConstantComponentBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConstantComponentBuilder.kt\nexpo/modules/kotlin/objects/ObjectDefinitionBuilder$Constant$lambda$50$$inlined$get$1\n+ 2 DeviceModule.kt\nexpo/modules/device/DeviceModule\n*L\n1#1,12:1\n80#2:13\n*E\n"
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

    iput-object p1, p0, Lexpo/modules/device/DeviceModule$definition$lambda$26$$inlined$Constant$11;->this$0:Lexpo/modules/device/DeviceModule;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/String;"
        }
    .end annotation

    .line 13
    iget-object v0, p0, Lexpo/modules/device/DeviceModule$definition$lambda$26$$inlined$Constant$11;->this$0:Lexpo/modules/device/DeviceModule;

    invoke-static {v0}, Lexpo/modules/device/DeviceModule;->access$getSystemName(Lexpo/modules/device/DeviceModule;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
