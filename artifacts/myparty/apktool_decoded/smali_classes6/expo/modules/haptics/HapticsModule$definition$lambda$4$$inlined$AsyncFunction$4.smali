.class public final Lexpo/modules/haptics/HapticsModule$definition$lambda$4$$inlined$AsyncFunction$4;
.super Ljava/lang/Object;
.source "ObjectDefinitionBuilder.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lexpo/modules/haptics/HapticsModule;->definition()Lexpo/modules/kotlin/modules/ModuleDefinitionData;
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
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nObjectDefinitionBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ObjectDefinitionBuilder.kt\nexpo/modules/kotlin/objects/ObjectDefinitionBuilder$AsyncFunction$3\n+ 2 HapticsModule.kt\nexpo/modules/haptics/HapticsModule\n*L\n1#1,235:1\n36#2,2:236\n*E\n"
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
.field final synthetic this$0:Lexpo/modules/haptics/HapticsModule;


# direct methods
.method public constructor <init>(Lexpo/modules/haptics/HapticsModule;)V
    .locals 0

    iput-object p1, p0, Lexpo/modules/haptics/HapticsModule$definition$lambda$4$$inlined$AsyncFunction$4;->this$0:Lexpo/modules/haptics/HapticsModule;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 235
    check-cast p1, [Ljava/lang/Object;

    invoke-virtual {p0, p1}, Lexpo/modules/haptics/HapticsModule$definition$lambda$4$$inlined$AsyncFunction$4;->invoke([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ljava/lang/Object;",
            ")",
            "Lkotlin/Unit;"
        }
    .end annotation

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 236
    iget-object p1, p0, Lexpo/modules/haptics/HapticsModule$definition$lambda$4$$inlined$AsyncFunction$4;->this$0:Lexpo/modules/haptics/HapticsModule;

    invoke-static {}, Lexpo/modules/haptics/arguments/HapticsSelectionTypeKt;->getHapticsSelectionType()Lexpo/modules/haptics/arguments/HapticsVibrationType;

    move-result-object v0

    invoke-static {p1, v0}, Lexpo/modules/haptics/HapticsModule;->access$vibrate(Lexpo/modules/haptics/HapticsModule;Lexpo/modules/haptics/arguments/HapticsVibrationType;)V

    .line 237
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
