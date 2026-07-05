.class public final Lcom/qonversion/android/sdk/automations/mvp/ScreenActivity;
.super Landroidx/fragment/app/FragmentActivity;
.source "ScreenActivity.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qonversion/android/sdk/automations/mvp/ScreenActivity$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0005\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0008\u0010\u0008\u001a\u00020\tH\u0016J\r\u0010\n\u001a\u00020\u000bH\u0000\u00a2\u0006\u0002\u0008\u000cJ\u0012\u0010\r\u001a\u00020\t2\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0014J\u0008\u0010\u0010\u001a\u00020\tH\u0002J+\u0010\u0011\u001a\u00020\t2\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0008\u0008\u0002\u0010\u0015\u001a\u00020\u000bH\u0000\u00a2\u0006\u0002\u0008\u0016R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00048BX\u0082\u0004\u00a2\u0006\u000c\u0012\u0004\u0008\u0005\u0010\u0002\u001a\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0018"
    }
    d2 = {
        "Lcom/qonversion/android/sdk/automations/mvp/ScreenActivity;",
        "Landroidx/fragment/app/FragmentActivity;",
        "()V",
        "presentationStyle",
        "Lcom/qonversion/android/sdk/automations/dto/QScreenPresentationStyle;",
        "getPresentationStyle$annotations",
        "getPresentationStyle",
        "()Lcom/qonversion/android/sdk/automations/dto/QScreenPresentationStyle;",
        "finish",
        "",
        "goBack",
        "",
        "goBack$sdk_release",
        "onCreate",
        "savedInstanceState",
        "Landroid/os/Bundle;",
        "playCloseAnimation",
        "showScreen",
        "screenId",
        "",
        "htmlPage",
        "addToBackStack",
        "showScreen$sdk_release",
        "Companion",
        "sdk_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final Companion:Lcom/qonversion/android/sdk/automations/mvp/ScreenActivity$Companion;

.field public static final INTENT_HTML_PAGE:Ljava/lang/String; = "htmlPage"

.field public static final INTENT_SCREEN_ID:Ljava/lang/String; = "screenId"

.field public static final INTENT_SCREEN_PRESENTATION_STYLE:Ljava/lang/String; = "screenPresentationStyle"


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/qonversion/android/sdk/automations/mvp/ScreenActivity$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/qonversion/android/sdk/automations/mvp/ScreenActivity$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/qonversion/android/sdk/automations/mvp/ScreenActivity;->Companion:Lcom/qonversion/android/sdk/automations/mvp/ScreenActivity$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 12
    sget v0, Lcom/qonversion/android/sdk/R$layout;->q_activity_screen:I

    invoke-direct {p0, v0}, Landroidx/fragment/app/FragmentActivity;-><init>(I)V

    return-void
.end method

.method private final getPresentationStyle()Lcom/qonversion/android/sdk/automations/dto/QScreenPresentationStyle;
    .locals 2

    .line 14
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/automations/mvp/ScreenActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    .line 15
    const-string v1, "screenPresentationStyle"

    .line 14
    invoke-virtual {v0, v1}, Landroid/content/Intent;->getSerializableExtra(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v0

    instance-of v1, v0, Lcom/qonversion/android/sdk/automations/dto/QScreenPresentationStyle;

    if-eqz v1, :cond_0

    check-cast v0, Lcom/qonversion/android/sdk/automations/dto/QScreenPresentationStyle;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method private static synthetic getPresentationStyle$annotations()V
    .locals 0

    return-void
.end method

.method private final playCloseAnimation()V
    .locals 2

    .line 68
    invoke-direct {p0}, Lcom/qonversion/android/sdk/automations/mvp/ScreenActivity;->getPresentationStyle()Lcom/qonversion/android/sdk/automations/dto/QScreenPresentationStyle;

    move-result-object v0

    invoke-static {v0}, Lcom/qonversion/android/sdk/automations/internal/UtilsKt;->getScreenTransactionAnimations(Lcom/qonversion/android/sdk/automations/dto/QScreenPresentationStyle;)Lkotlin/Pair;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 69
    invoke-virtual {v0}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    invoke-virtual {v0}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    .line 70
    invoke-virtual {p0, v1, v0}, Lcom/qonversion/android/sdk/automations/mvp/ScreenActivity;->overridePendingTransition(II)V

    :cond_0
    return-void
.end method

.method public static synthetic showScreen$sdk_release$default(Lcom/qonversion/android/sdk/automations/mvp/ScreenActivity;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/4 p3, 0x1

    .line 34
    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lcom/qonversion/android/sdk/automations/mvp/ScreenActivity;->showScreen$sdk_release(Ljava/lang/String;Ljava/lang/String;Z)V

    return-void
.end method


# virtual methods
.method public finish()V
    .locals 0

    .line 30
    invoke-super {p0}, Landroidx/fragment/app/FragmentActivity;->finish()V

    .line 31
    invoke-direct {p0}, Lcom/qonversion/android/sdk/automations/mvp/ScreenActivity;->playCloseAnimation()V

    return-void
.end method

.method public final goBack$sdk_release()Z
    .locals 2

    .line 58
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/automations/mvp/ScreenActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->getBackStackEntryCount()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    .line 60
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/automations/mvp/ScreenActivity;->finish()V

    goto :goto_1

    .line 62
    :cond_1
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/automations/mvp/ScreenActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/fragment/app/FragmentManager;->popBackStack()V

    :goto_1
    return v0
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 2

    .line 19
    invoke-super {p0, p1}, Landroidx/fragment/app/FragmentActivity;->onCreate(Landroid/os/Bundle;)V

    if-nez p1, :cond_0

    .line 22
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/automations/mvp/ScreenActivity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v0, "screenId"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 23
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/automations/mvp/ScreenActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "htmlPage"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    .line 21
    invoke-virtual {p0, p1, v0, v1}, Lcom/qonversion/android/sdk/automations/mvp/ScreenActivity;->showScreen$sdk_release(Ljava/lang/String;Ljava/lang/String;Z)V

    :cond_0
    return-void
.end method

.method public final showScreen$sdk_release(Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 3

    .line 35
    sget-object v0, Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment;->Companion:Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment$Companion;

    invoke-virtual {v0, p1, p2}, Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment$Companion;->getArguments(Ljava/lang/String;Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object p1

    .line 36
    new-instance p2, Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment;

    invoke-direct {p2}, Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment;-><init>()V

    .line 37
    invoke-virtual {p2, p1}, Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment;->setArguments(Landroid/os/Bundle;)V

    .line 38
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/automations/mvp/ScreenActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object p1

    .line 39
    invoke-virtual {p1}, Landroidx/fragment/app/FragmentManager;->beginTransaction()Landroidx/fragment/app/FragmentTransaction;

    move-result-object p1

    const-string v0, "beginTransaction(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p3, :cond_0

    .line 44
    sget p3, Lcom/qonversion/android/sdk/R$anim;->q_slide_in_from_left:I

    .line 45
    sget v0, Lcom/qonversion/android/sdk/R$anim;->q_fade_out:I

    .line 46
    sget v1, Lcom/qonversion/android/sdk/R$anim;->q_fade_in:I

    .line 47
    sget v2, Lcom/qonversion/android/sdk/R$anim;->q_slide_out_to_left:I

    .line 43
    invoke-virtual {p1, p3, v0, v1, v2}, Landroidx/fragment/app/FragmentTransaction;->setCustomAnimations(IIII)Landroidx/fragment/app/FragmentTransaction;

    move-result-object p3

    const/4 v0, 0x0

    .line 49
    invoke-virtual {p3, v0}, Landroidx/fragment/app/FragmentTransaction;->addToBackStack(Ljava/lang/String;)Landroidx/fragment/app/FragmentTransaction;

    .line 53
    :cond_0
    sget p3, Lcom/qonversion/android/sdk/R$id;->fragment_container_view:I

    check-cast p2, Landroidx/fragment/app/Fragment;

    invoke-virtual {p1, p3, p2}, Landroidx/fragment/app/FragmentTransaction;->replace(ILandroidx/fragment/app/Fragment;)Landroidx/fragment/app/FragmentTransaction;

    move-result-object p1

    .line 54
    invoke-virtual {p1}, Landroidx/fragment/app/FragmentTransaction;->commit()I

    return-void
.end method
