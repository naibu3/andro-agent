.class public final Lexpo/modules/localization/LocalizationModule$definition$lambda$6$$inlined$OnCreate$1;
.super Ljava/lang/Object;
.source "ModuleDefinitionBuilder.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lexpo/modules/localization/LocalizationModule;->definition()Lexpo/modules/kotlin/modules/ModuleDefinitionData;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlin/jvm/functions/Function0<",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nModuleDefinitionBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModuleDefinitionBuilder.kt\nexpo/modules/kotlin/modules/InternalModuleDefinitionBuilder$OnCreate$1\n+ 2 LocalizationModule.kt\nexpo/modules/localization/LocalizationModule\n*L\n1#1,110:1\n43#2,9:111\n*E\n"
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
.field final synthetic this$0:Lexpo/modules/localization/LocalizationModule;


# direct methods
.method public constructor <init>(Lexpo/modules/localization/LocalizationModule;)V
    .locals 0

    iput-object p1, p0, Lexpo/modules/localization/LocalizationModule$definition$lambda$6$$inlined$OnCreate$1;->this$0:Lexpo/modules/localization/LocalizationModule;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 110
    invoke-virtual {p0}, Lexpo/modules/localization/LocalizationModule$definition$lambda$6$$inlined$OnCreate$1;->invoke()V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method public final invoke()V
    .locals 3

    .line 111
    iget-object v0, p0, Lexpo/modules/localization/LocalizationModule$definition$lambda$6$$inlined$OnCreate$1;->this$0:Lexpo/modules/localization/LocalizationModule;

    invoke-virtual {v0}, Lexpo/modules/localization/LocalizationModule;->getAppContext()Lexpo/modules/kotlin/AppContext;

    move-result-object v0

    invoke-virtual {v0}, Lexpo/modules/kotlin/AppContext;->getReactContext()Landroid/content/Context;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 112
    iget-object v1, p0, Lexpo/modules/localization/LocalizationModule$definition$lambda$6$$inlined$OnCreate$1;->this$0:Lexpo/modules/localization/LocalizationModule;

    invoke-static {v1, v0}, Lexpo/modules/localization/LocalizationModule;->access$setRTLFromStringResources(Lexpo/modules/localization/LocalizationModule;Landroid/content/Context;)V

    .line 114
    :cond_0
    iget-object v0, p0, Lexpo/modules/localization/LocalizationModule$definition$lambda$6$$inlined$OnCreate$1;->this$0:Lexpo/modules/localization/LocalizationModule;

    new-instance v1, Lexpo/modules/localization/LocalizationModule$definition$1$3$2;

    iget-object v2, p0, Lexpo/modules/localization/LocalizationModule$definition$lambda$6$$inlined$OnCreate$1;->this$0:Lexpo/modules/localization/LocalizationModule;

    invoke-direct {v1, v2}, Lexpo/modules/localization/LocalizationModule$definition$1$3$2;-><init>(Lexpo/modules/localization/LocalizationModule;)V

    check-cast v1, Lkotlin/jvm/functions/Function0;

    invoke-static {v0, v1}, Lexpo/modules/localization/LocalizationModule;->access$setObserver$p(Lexpo/modules/localization/LocalizationModule;Lkotlin/jvm/functions/Function0;)V

    .line 118
    sget-object v0, Lexpo/modules/localization/Notifier;->INSTANCE:Lexpo/modules/localization/Notifier;

    iget-object v1, p0, Lexpo/modules/localization/LocalizationModule$definition$lambda$6$$inlined$OnCreate$1;->this$0:Lexpo/modules/localization/LocalizationModule;

    invoke-static {v1}, Lexpo/modules/localization/LocalizationModule;->access$getObserver$p(Lexpo/modules/localization/LocalizationModule;)Lkotlin/jvm/functions/Function0;

    move-result-object v1

    invoke-virtual {v0, v1}, Lexpo/modules/localization/Notifier;->registerObserver(Lkotlin/jvm/functions/Function0;)V

    return-void
.end method
