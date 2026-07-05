.class public final Lcom/reactcommunity/rndatetimepicker/MaterialTimePickerModule;
.super Lcom/reactcommunity/rndatetimepicker/NativeModuleMaterialTimePickerSpec;
.source "MaterialTimePickerModule.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/reactcommunity/rndatetimepicker/MaterialTimePickerModule$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0008\u0010\u0006\u001a\u00020\u0007H\u0016J\u0012\u0010\u0008\u001a\u00020\t2\u0008\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J\u0018\u0010\u000c\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u000bH\u0016\u00a8\u0006\u0010"
    }
    d2 = {
        "Lcom/reactcommunity/rndatetimepicker/MaterialTimePickerModule;",
        "Lcom/reactcommunity/rndatetimepicker/NativeModuleMaterialTimePickerSpec;",
        "reactContext",
        "Lcom/facebook/react/bridge/ReactApplicationContext;",
        "<init>",
        "(Lcom/facebook/react/bridge/ReactApplicationContext;)V",
        "getName",
        "",
        "dismiss",
        "",
        "promise",
        "Lcom/facebook/react/bridge/Promise;",
        "open",
        "params",
        "Lcom/facebook/react/bridge/ReadableMap;",
        "Companion",
        "react-native-community_datetimepicker_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final Companion:Lcom/reactcommunity/rndatetimepicker/MaterialTimePickerModule$Companion;

.field public static final NAME:Ljava/lang/String; = "RNCMaterialTimePicker"


# direct methods
.method public static synthetic $r8$lambda$Fd7Bz8i6zmNahyMJIHFgC8wqsHw(Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Promise;Landroidx/fragment/app/FragmentManager;Lcom/reactcommunity/rndatetimepicker/MaterialTimePickerModule;)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/reactcommunity/rndatetimepicker/MaterialTimePickerModule;->open$lambda$0(Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Promise;Landroidx/fragment/app/FragmentManager;Lcom/reactcommunity/rndatetimepicker/MaterialTimePickerModule;)V

    return-void
.end method

.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/reactcommunity/rndatetimepicker/MaterialTimePickerModule$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/reactcommunity/rndatetimepicker/MaterialTimePickerModule$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/reactcommunity/rndatetimepicker/MaterialTimePickerModule;->Companion:Lcom/reactcommunity/rndatetimepicker/MaterialTimePickerModule$Companion;

    return-void
.end method

.method public constructor <init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V
    .locals 1

    const-string v0, "reactContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    invoke-direct {p0, p1}, Lcom/reactcommunity/rndatetimepicker/NativeModuleMaterialTimePickerSpec;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    return-void
.end method

.method private static final open$lambda$0(Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Promise;Landroidx/fragment/app/FragmentManager;Lcom/reactcommunity/rndatetimepicker/MaterialTimePickerModule;)V
    .locals 2

    .line 39
    invoke-static {p0}, Lcom/reactcommunity/rndatetimepicker/Common;->createTimePickerArguments(Lcom/facebook/react/bridge/ReadableMap;)Landroid/os/Bundle;

    move-result-object p0

    .line 40
    new-instance v0, Lcom/reactcommunity/rndatetimepicker/RNMaterialTimePicker;

    .line 41
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 44
    invoke-virtual {p3}, Lcom/reactcommunity/rndatetimepicker/MaterialTimePickerModule;->getReactApplicationContext()Lcom/facebook/react/bridge/ReactApplicationContext;

    move-result-object p3

    const-string v1, "getReactApplicationContext(...)"

    invoke-static {p3, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 40
    invoke-direct {v0, p0, p1, p2, p3}, Lcom/reactcommunity/rndatetimepicker/RNMaterialTimePicker;-><init>(Landroid/os/Bundle;Lcom/facebook/react/bridge/Promise;Landroidx/fragment/app/FragmentManager;Lcom/facebook/react/bridge/ReactApplicationContext;)V

    .line 46
    invoke-virtual {v0}, Lcom/reactcommunity/rndatetimepicker/RNMaterialTimePicker;->open()V

    return-void
.end method


# virtual methods
.method public dismiss(Lcom/facebook/react/bridge/Promise;)V
    .locals 2

    .line 22
    invoke-virtual {p0}, Lcom/reactcommunity/rndatetimepicker/MaterialTimePickerModule;->getCurrentActivity()Landroid/app/Activity;

    move-result-object v0

    check-cast v0, Landroidx/fragment/app/FragmentActivity;

    .line 23
    const-string v1, "RNCMaterialTimePicker"

    invoke-static {v0, v1, p1}, Lcom/reactcommunity/rndatetimepicker/Common;->dismissDialog(Landroidx/fragment/app/FragmentActivity;Ljava/lang/String;Lcom/facebook/react/bridge/Promise;)V

    return-void
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    .line 18
    const-string v0, "RNCMaterialTimePicker"

    return-object v0
.end method

.method public open(Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Promise;)V
    .locals 3

    const-string v0, "params"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "promise"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    invoke-virtual {p0}, Lcom/reactcommunity/rndatetimepicker/MaterialTimePickerModule;->getCurrentActivity()Landroid/app/Activity;

    move-result-object v0

    check-cast v0, Landroidx/fragment/app/FragmentActivity;

    if-nez v0, :cond_0

    .line 30
    const-string v1, "E_NO_ACTIVITY"

    .line 31
    const-string v2, "Tried to open a MaterialTimePicker dialog while not attached to an Activity"

    .line 29
    invoke-interface {p2, v1, v2}, Lcom/facebook/react/bridge/Promise;->reject(Ljava/lang/String;Ljava/lang/String;)V

    .line 35
    :cond_0
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v0}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object v0

    const-string v1, "getSupportFragmentManager(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 37
    new-instance v1, Lcom/reactcommunity/rndatetimepicker/MaterialTimePickerModule$$ExternalSyntheticLambda0;

    invoke-direct {v1, p1, p2, v0, p0}, Lcom/reactcommunity/rndatetimepicker/MaterialTimePickerModule$$ExternalSyntheticLambda0;-><init>(Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Promise;Landroidx/fragment/app/FragmentManager;Lcom/reactcommunity/rndatetimepicker/MaterialTimePickerModule;)V

    invoke-static {v1}, Lcom/facebook/react/bridge/UiThreadUtil;->runOnUiThread(Ljava/lang/Runnable;)Z

    return-void
.end method
