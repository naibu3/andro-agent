.class public final Lexpo/modules/systemui/SystemUIModule$definition$lambda$3$$inlined$AsyncFunction$3;
.super Ljava/lang/Object;
.source "ObjectDefinitionBuilder.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lexpo/modules/systemui/SystemUIModule;->definition()Lexpo/modules/kotlin/modules/ModuleDefinitionData;
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
    value = "SMAP\nObjectDefinitionBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ObjectDefinitionBuilder.kt\nexpo/modules/kotlin/objects/ObjectDefinitionBuilder$AsyncFunction$6\n+ 2 EnforceType.kt\nexpo/modules/kotlin/types/EnforceTypeKt\n+ 3 SystemUIModule.kt\nexpo/modules/systemui/SystemUIModule\n*L\n1#1,613:1\n11#2:614\n41#3,9:615\n*S KotlinDebug\n*F\n+ 1 ObjectDefinitionBuilder.kt\nexpo/modules/kotlin/objects/ObjectDefinitionBuilder$AsyncFunction$6\n*L\n249#1:614\n*E\n"
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
.field final synthetic this$0:Lexpo/modules/systemui/SystemUIModule;


# direct methods
.method public constructor <init>(Lexpo/modules/systemui/SystemUIModule;)V
    .locals 0

    iput-object p1, p0, Lexpo/modules/systemui/SystemUIModule$definition$lambda$3$$inlined$AsyncFunction$3;->this$0:Lexpo/modules/systemui/SystemUIModule;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 248
    check-cast p1, [Ljava/lang/Object;

    invoke-virtual {p0, p1}, Lexpo/modules/systemui/SystemUIModule$definition$lambda$3$$inlined$AsyncFunction$3;->invoke([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ljava/lang/Object;",
            ")",
            "Lkotlin/Unit;"
        }
    .end annotation

    const-string v0, "<destruct>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    aget-object p1, p1, v0

    .line 250
    check-cast p1, Ljava/lang/Integer;

    .line 615
    const-string v0, "expoRootBackgroundColor"

    if-eqz p1, :cond_0

    move-object v1, p1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    .line 616
    iget-object v2, p0, Lexpo/modules/systemui/SystemUIModule$definition$lambda$3$$inlined$AsyncFunction$3;->this$0:Lexpo/modules/systemui/SystemUIModule;

    invoke-static {v2}, Lexpo/modules/systemui/SystemUIModule;->access$getPrefs(Lexpo/modules/systemui/SystemUIModule;)Landroid/content/SharedPreferences;

    move-result-object v2

    invoke-interface {v2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v2

    .line 617
    invoke-interface {v2, v0, v1}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 618
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    goto :goto_0

    .line 619
    :cond_0
    iget-object v1, p0, Lexpo/modules/systemui/SystemUIModule$definition$lambda$3$$inlined$AsyncFunction$3;->this$0:Lexpo/modules/systemui/SystemUIModule;

    invoke-static {v1}, Lexpo/modules/systemui/SystemUIModule;->access$getPrefs(Lexpo/modules/systemui/SystemUIModule;)Landroid/content/SharedPreferences;

    move-result-object v1

    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    .line 620
    invoke-interface {v1, v0}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 621
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 622
    :goto_0
    iget-object v0, p0, Lexpo/modules/systemui/SystemUIModule$definition$lambda$3$$inlined$AsyncFunction$3;->this$0:Lexpo/modules/systemui/SystemUIModule;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    goto :goto_1

    :cond_1
    invoke-static {v0}, Lexpo/modules/systemui/SystemUIModule;->access$getSystemBackgroundColor(Lexpo/modules/systemui/SystemUIModule;)I

    move-result p1

    :goto_1
    invoke-static {v0, p1}, Lexpo/modules/systemui/SystemUIModule;->access$setBackgroundColor(Lexpo/modules/systemui/SystemUIModule;I)V

    .line 623
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
