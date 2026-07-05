.class public final synthetic Lcom/stripe/android/uicore/navigation/NavigationEffectsKt$NavigationEffects$3$1$1$$ExternalSyntheticLambda0;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic f$0:Lcom/stripe/android/uicore/navigation/NavigationIntent;

.field public final synthetic f$1:Landroidx/navigation/NavHostController;

.field public final synthetic f$2:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lcom/stripe/android/uicore/navigation/NavigationIntent;Landroidx/navigation/NavHostController;Ljava/lang/String;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/uicore/navigation/NavigationEffectsKt$NavigationEffects$3$1$1$$ExternalSyntheticLambda0;->f$0:Lcom/stripe/android/uicore/navigation/NavigationIntent;

    iput-object p2, p0, Lcom/stripe/android/uicore/navigation/NavigationEffectsKt$NavigationEffects$3$1$1$$ExternalSyntheticLambda0;->f$1:Landroidx/navigation/NavHostController;

    iput-object p3, p0, Lcom/stripe/android/uicore/navigation/NavigationEffectsKt$NavigationEffects$3$1$1$$ExternalSyntheticLambda0;->f$2:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 0
    iget-object v0, p0, Lcom/stripe/android/uicore/navigation/NavigationEffectsKt$NavigationEffects$3$1$1$$ExternalSyntheticLambda0;->f$0:Lcom/stripe/android/uicore/navigation/NavigationIntent;

    iget-object v1, p0, Lcom/stripe/android/uicore/navigation/NavigationEffectsKt$NavigationEffects$3$1$1$$ExternalSyntheticLambda0;->f$1:Landroidx/navigation/NavHostController;

    iget-object v2, p0, Lcom/stripe/android/uicore/navigation/NavigationEffectsKt$NavigationEffects$3$1$1$$ExternalSyntheticLambda0;->f$2:Ljava/lang/String;

    check-cast p1, Landroidx/navigation/NavOptionsBuilder;

    invoke-static {v0, v1, v2, p1}, Lcom/stripe/android/uicore/navigation/NavigationEffectsKt$NavigationEffects$3$1$1;->$r8$lambda$O1NzA7-Rd8m6eLrkuv32QdyoLOs(Lcom/stripe/android/uicore/navigation/NavigationIntent;Landroidx/navigation/NavHostController;Ljava/lang/String;Landroidx/navigation/NavOptionsBuilder;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
