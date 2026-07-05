.class public final Lexpo/modules/application/ApplicationModule$definition$lambda$8$$inlined$Constant$4;
.super Ljava/lang/Object;
.source "ConstantComponentBuilder.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lexpo/modules/application/ApplicationModule;->definition()Lexpo/modules/kotlin/modules/ModuleDefinitionData;
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
    value = "SMAP\nConstantComponentBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConstantComponentBuilder.kt\nexpo/modules/kotlin/objects/ObjectDefinitionBuilder$Constant$lambda$50$$inlined$get$1\n+ 2 ApplicationModule.kt\nexpo/modules/application/ApplicationModule\n*L\n1#1,12:1\n40#2:13\n*E\n"
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
.field final synthetic this$0:Lexpo/modules/application/ApplicationModule;


# direct methods
.method public constructor <init>(Lexpo/modules/application/ApplicationModule;)V
    .locals 0

    iput-object p1, p0, Lexpo/modules/application/ApplicationModule$definition$lambda$8$$inlined$Constant$4;->this$0:Lexpo/modules/application/ApplicationModule;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/String;"
        }
    .end annotation

    .line 13
    iget-object v0, p0, Lexpo/modules/application/ApplicationModule$definition$lambda$8$$inlined$Constant$4;->this$0:Lexpo/modules/application/ApplicationModule;

    invoke-static {v0}, Lexpo/modules/application/ApplicationModule;->access$getPackageManager(Lexpo/modules/application/ApplicationModule;)Landroid/content/pm/PackageManager;

    move-result-object v0

    const-string v1, "access$getPackageManager(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Lexpo/modules/application/ApplicationModule$definition$lambda$8$$inlined$Constant$4;->this$0:Lexpo/modules/application/ApplicationModule;

    invoke-static {v1}, Lexpo/modules/application/ApplicationModule;->access$getPackageName(Lexpo/modules/application/ApplicationModule;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "access$getPackageName(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lexpo/modules/application/ApplicationModuleKt;->access$getPackageInfoCompat(Landroid/content/pm/PackageManager;Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v0

    invoke-static {v0}, Lexpo/modules/application/ApplicationModuleKt;->access$getLongVersionCode(Landroid/content/pm/PackageInfo;)J

    move-result-wide v0

    long-to-int v0, v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
