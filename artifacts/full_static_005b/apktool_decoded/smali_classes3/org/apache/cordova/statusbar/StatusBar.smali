.class public Lorg/apache/cordova/statusbar/StatusBar;
.super Lorg/apache/cordova/CordovaPlugin;
.source "StatusBar.java"


# static fields
.field private static final ACTION_BACKGROUND_COLOR_BY_HEX_STRING:Ljava/lang/String; = "backgroundColorByHexString"

.field private static final ACTION_HIDE:Ljava/lang/String; = "hide"

.field private static final ACTION_OVERLAYS_WEB_VIEW:Ljava/lang/String; = "overlaysWebView"

.field private static final ACTION_READY:Ljava/lang/String; = "_ready"

.field private static final ACTION_SHOW:Ljava/lang/String; = "show"

.field private static final ACTION_STYLE_DEFAULT:Ljava/lang/String; = "styleDefault"

.field private static final ACTION_STYLE_LIGHT_CONTENT:Ljava/lang/String; = "styleLightContent"

.field private static final STYLE_DEFAULT:Ljava/lang/String; = "default"

.field private static final STYLE_LIGHT_CONTENT:Ljava/lang/String; = "lightcontent"

.field private static final TAG:Ljava/lang/String; = "StatusBar"


# instance fields
.field private activity:Landroidx/appcompat/app/AppCompatActivity;

.field private window:Landroid/view/Window;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 41
    invoke-direct {p0}, Lorg/apache/cordova/CordovaPlugin;-><init>()V

    return-void
.end method

.method private setStatusBarBackgroundColor(Ljava/lang/String;)V
    .locals 2

    .line 171
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 175
    :cond_0
    :try_start_0
    invoke-static {p1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result p1
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 181
    iget-object v0, p0, Lorg/apache/cordova/statusbar/StatusBar;->window:Landroid/view/Window;

    const/high16 v1, 0x4000000

    invoke-virtual {v0, v1}, Landroid/view/Window;->clearFlags(I)V

    .line 182
    iget-object v0, p0, Lorg/apache/cordova/statusbar/StatusBar;->window:Landroid/view/Window;

    const/high16 v1, -0x80000000

    invoke-virtual {v0, v1}, Landroid/view/Window;->addFlags(I)V

    .line 183
    iget-object v0, p0, Lorg/apache/cordova/statusbar/StatusBar;->window:Landroid/view/Window;

    invoke-virtual {v0, p1}, Landroid/view/Window;->setStatusBarColor(I)V

    return-void

    .line 177
    :catch_0
    const-string p1, "StatusBar"

    const-string v0, "Invalid hexString argument, use f.i. \'#999999\'"

    invoke-static {p1, v0}, Lorg/apache/cordova/LOG;->e(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private setStatusBarStyle(Ljava/lang/String;)V
    .locals 2

    .line 200
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    .line 201
    iget-object v0, p0, Lorg/apache/cordova/statusbar/StatusBar;->window:Landroid/view/Window;

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    .line 202
    iget-object v1, p0, Lorg/apache/cordova/statusbar/StatusBar;->window:Landroid/view/Window;

    invoke-static {v1, v0}, Landroidx/core/view/WindowCompat;->getInsetsController(Landroid/view/Window;Landroid/view/View;)Landroidx/core/view/WindowInsetsControllerCompat;

    move-result-object v0

    .line 204
    const-string v1, "default"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 p1, 0x1

    .line 205
    invoke-virtual {v0, p1}, Landroidx/core/view/WindowInsetsControllerCompat;->setAppearanceLightStatusBars(Z)V

    goto :goto_0

    .line 206
    :cond_0
    const-string v1, "lightcontent"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, 0x0

    .line 207
    invoke-virtual {v0, p1}, Landroidx/core/view/WindowInsetsControllerCompat;->setAppearanceLightStatusBars(Z)V

    goto :goto_0

    .line 209
    :cond_1
    const-string p1, "StatusBar"

    const-string v0, "Invalid style, must be either \'default\' or \'lightcontent\'"

    invoke-static {p1, v0}, Lorg/apache/cordova/LOG;->e(Ljava/lang/String;Ljava/lang/String;)V

    :cond_2
    :goto_0
    return-void
.end method

.method private setStatusBarTransparent(Z)V
    .locals 3

    .line 187
    iget-object v0, p0, Lorg/apache/cordova/statusbar/StatusBar;->cordova:Lorg/apache/cordova/CordovaInterface;

    invoke-interface {v0}, Lorg/apache/cordova/CordovaInterface;->getActivity()Landroidx/appcompat/app/AppCompatActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/appcompat/app/AppCompatActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    if-eqz p1, :cond_0

    const/16 v1, 0x500

    goto :goto_0

    :cond_0
    const/16 v1, 0x100

    .line 192
    :goto_0
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v2

    invoke-virtual {v2, v1}, Landroid/view/View;->setSystemUiVisibility(I)V

    if-eqz p1, :cond_1

    const/4 p1, 0x0

    .line 195
    invoke-virtual {v0, p1}, Landroid/view/Window;->setStatusBarColor(I)V

    :cond_1
    return-void
.end method


# virtual methods
.method public execute(Ljava/lang/String;Lorg/apache/cordova/CordovaArgs;Lorg/apache/cordova/CallbackContext;)Z
    .locals 4

    .line 101
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Executing action: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "StatusBar"

    invoke-static {v1, v0}, Lorg/apache/cordova/LOG;->v(Ljava/lang/String;Ljava/lang/String;)V

    .line 103
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    const/4 v3, -0x1

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, "backgroundColorByHexString"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v3, 0x6

    goto :goto_0

    :sswitch_1
    const-string v0, "overlaysWebView"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v3, 0x5

    goto :goto_0

    :sswitch_2
    const-string v0, "show"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    goto :goto_0

    :cond_2
    const/4 v3, 0x4

    goto :goto_0

    :sswitch_3
    const-string v0, "hide"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    goto :goto_0

    :cond_3
    const/4 v3, 0x3

    goto :goto_0

    :sswitch_4
    const-string v0, "styleLightContent"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    goto :goto_0

    :cond_4
    const/4 v3, 0x2

    goto :goto_0

    :sswitch_5
    const-string v0, "styleDefault"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    goto :goto_0

    :cond_5
    move v3, v2

    goto :goto_0

    :sswitch_6
    const-string v0, "_ready"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    goto :goto_0

    :cond_6
    move v3, v1

    :goto_0
    packed-switch v3, :pswitch_data_0

    return v1

    .line 138
    :pswitch_0
    iget-object p1, p0, Lorg/apache/cordova/statusbar/StatusBar;->activity:Landroidx/appcompat/app/AppCompatActivity;

    new-instance p3, Lorg/apache/cordova/statusbar/StatusBar$$ExternalSyntheticLambda2;

    invoke-direct {p3, p0, p2}, Lorg/apache/cordova/statusbar/StatusBar$$ExternalSyntheticLambda2;-><init>(Lorg/apache/cordova/statusbar/StatusBar;Lorg/apache/cordova/CordovaArgs;)V

    invoke-virtual {p1, p3}, Landroidx/appcompat/app/AppCompatActivity;->runOnUiThread(Ljava/lang/Runnable;)V

    return v2

    .line 148
    :pswitch_1
    iget-object p1, p0, Lorg/apache/cordova/statusbar/StatusBar;->activity:Landroidx/appcompat/app/AppCompatActivity;

    new-instance p3, Lorg/apache/cordova/statusbar/StatusBar$$ExternalSyntheticLambda3;

    invoke-direct {p3, p0, p2}, Lorg/apache/cordova/statusbar/StatusBar$$ExternalSyntheticLambda3;-><init>(Lorg/apache/cordova/statusbar/StatusBar;Lorg/apache/cordova/CordovaArgs;)V

    invoke-virtual {p1, p3}, Landroidx/appcompat/app/AppCompatActivity;->runOnUiThread(Ljava/lang/Runnable;)V

    return v2

    .line 110
    :pswitch_2
    iget-object p1, p0, Lorg/apache/cordova/statusbar/StatusBar;->activity:Landroidx/appcompat/app/AppCompatActivity;

    new-instance p2, Lorg/apache/cordova/statusbar/StatusBar$$ExternalSyntheticLambda0;

    invoke-direct {p2, p0}, Lorg/apache/cordova/statusbar/StatusBar$$ExternalSyntheticLambda0;-><init>(Lorg/apache/cordova/statusbar/StatusBar;)V

    invoke-virtual {p1, p2}, Landroidx/appcompat/app/AppCompatActivity;->runOnUiThread(Ljava/lang/Runnable;)V

    return v2

    .line 124
    :pswitch_3
    iget-object p1, p0, Lorg/apache/cordova/statusbar/StatusBar;->activity:Landroidx/appcompat/app/AppCompatActivity;

    new-instance p2, Lorg/apache/cordova/statusbar/StatusBar$$ExternalSyntheticLambda1;

    invoke-direct {p2, p0}, Lorg/apache/cordova/statusbar/StatusBar$$ExternalSyntheticLambda1;-><init>(Lorg/apache/cordova/statusbar/StatusBar;)V

    invoke-virtual {p1, p2}, Landroidx/appcompat/app/AppCompatActivity;->runOnUiThread(Ljava/lang/Runnable;)V

    return v2

    .line 162
    :pswitch_4
    iget-object p1, p0, Lorg/apache/cordova/statusbar/StatusBar;->activity:Landroidx/appcompat/app/AppCompatActivity;

    new-instance p2, Lorg/apache/cordova/statusbar/StatusBar$$ExternalSyntheticLambda5;

    invoke-direct {p2, p0}, Lorg/apache/cordova/statusbar/StatusBar$$ExternalSyntheticLambda5;-><init>(Lorg/apache/cordova/statusbar/StatusBar;)V

    invoke-virtual {p1, p2}, Landroidx/appcompat/app/AppCompatActivity;->runOnUiThread(Ljava/lang/Runnable;)V

    return v2

    .line 158
    :pswitch_5
    iget-object p1, p0, Lorg/apache/cordova/statusbar/StatusBar;->activity:Landroidx/appcompat/app/AppCompatActivity;

    new-instance p2, Lorg/apache/cordova/statusbar/StatusBar$$ExternalSyntheticLambda4;

    invoke-direct {p2, p0}, Lorg/apache/cordova/statusbar/StatusBar$$ExternalSyntheticLambda4;-><init>(Lorg/apache/cordova/statusbar/StatusBar;)V

    invoke-virtual {p1, p2}, Landroidx/appcompat/app/AppCompatActivity;->runOnUiThread(Ljava/lang/Runnable;)V

    return v2

    .line 105
    :pswitch_6
    iget-object p1, p0, Lorg/apache/cordova/statusbar/StatusBar;->window:Landroid/view/Window;

    invoke-virtual {p1}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    move-result-object p1

    iget p1, p1, Landroid/view/WindowManager$LayoutParams;->flags:I

    and-int/lit16 p1, p1, 0x400

    if-nez p1, :cond_7

    move v1, v2

    .line 106
    :cond_7
    new-instance p1, Lorg/apache/cordova/PluginResult;

    sget-object p2, Lorg/apache/cordova/PluginResult$Status;->OK:Lorg/apache/cordova/PluginResult$Status;

    invoke-direct {p1, p2, v1}, Lorg/apache/cordova/PluginResult;-><init>(Lorg/apache/cordova/PluginResult$Status;Z)V

    invoke-virtual {p3, p1}, Lorg/apache/cordova/CallbackContext;->sendPluginResult(Lorg/apache/cordova/PluginResult;)V

    return v2

    :sswitch_data_0
    .sparse-switch
        -0x576dc35c -> :sswitch_6
        -0x54d948b0 -> :sswitch_5
        -0x23c4bd2c -> :sswitch_4
        0x30dd42 -> :sswitch_3
        0x35dafd -> :sswitch_2
        0x641f6476 -> :sswitch_1
        0x6f896e60 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public initialize(Lorg/apache/cordova/CordovaInterface;Lorg/apache/cordova/CordovaWebView;)V
    .locals 2

    .line 67
    const-string v0, "StatusBar"

    const-string v1, "StatusBar: initialization"

    invoke-static {v0, v1}, Lorg/apache/cordova/LOG;->v(Ljava/lang/String;Ljava/lang/String;)V

    .line 68
    invoke-super {p0, p1, p2}, Lorg/apache/cordova/CordovaPlugin;->initialize(Lorg/apache/cordova/CordovaInterface;Lorg/apache/cordova/CordovaWebView;)V

    .line 70
    iget-object p1, p0, Lorg/apache/cordova/statusbar/StatusBar;->cordova:Lorg/apache/cordova/CordovaInterface;

    invoke-interface {p1}, Lorg/apache/cordova/CordovaInterface;->getActivity()Landroidx/appcompat/app/AppCompatActivity;

    move-result-object p1

    iput-object p1, p0, Lorg/apache/cordova/statusbar/StatusBar;->activity:Landroidx/appcompat/app/AppCompatActivity;

    .line 71
    invoke-virtual {p1}, Landroidx/appcompat/app/AppCompatActivity;->getWindow()Landroid/view/Window;

    move-result-object p1

    iput-object p1, p0, Lorg/apache/cordova/statusbar/StatusBar;->window:Landroid/view/Window;

    .line 73
    iget-object p1, p0, Lorg/apache/cordova/statusbar/StatusBar;->activity:Landroidx/appcompat/app/AppCompatActivity;

    new-instance p2, Lorg/apache/cordova/statusbar/StatusBar$$ExternalSyntheticLambda6;

    invoke-direct {p2, p0}, Lorg/apache/cordova/statusbar/StatusBar$$ExternalSyntheticLambda6;-><init>(Lorg/apache/cordova/statusbar/StatusBar;)V

    invoke-virtual {p1, p2}, Landroidx/appcompat/app/AppCompatActivity;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method synthetic lambda$execute$1$org-apache-cordova-statusbar-StatusBar()V
    .locals 2

    .line 111
    iget-object v0, p0, Lorg/apache/cordova/statusbar/StatusBar;->window:Landroid/view/Window;

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getSystemUiVisibility()I

    move-result v0

    and-int/lit16 v0, v0, -0x405

    .line 115
    iget-object v1, p0, Lorg/apache/cordova/statusbar/StatusBar;->window:Landroid/view/Window;

    invoke-virtual {v1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/view/View;->setSystemUiVisibility(I)V

    .line 119
    iget-object v0, p0, Lorg/apache/cordova/statusbar/StatusBar;->window:Landroid/view/Window;

    const/16 v1, 0x400

    invoke-virtual {v0, v1}, Landroid/view/Window;->clearFlags(I)V

    return-void
.end method

.method synthetic lambda$execute$2$org-apache-cordova-statusbar-StatusBar()V
    .locals 2

    .line 125
    iget-object v0, p0, Lorg/apache/cordova/statusbar/StatusBar;->window:Landroid/view/Window;

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getSystemUiVisibility()I

    move-result v0

    or-int/lit16 v0, v0, 0x404

    .line 129
    iget-object v1, p0, Lorg/apache/cordova/statusbar/StatusBar;->window:Landroid/view/Window;

    invoke-virtual {v1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/view/View;->setSystemUiVisibility(I)V

    .line 133
    iget-object v0, p0, Lorg/apache/cordova/statusbar/StatusBar;->window:Landroid/view/Window;

    const/16 v1, 0x400

    invoke-virtual {v0, v1}, Landroid/view/Window;->addFlags(I)V

    return-void
.end method

.method synthetic lambda$execute$3$org-apache-cordova-statusbar-StatusBar(Lorg/apache/cordova/CordovaArgs;)V
    .locals 1

    .line 0
    const/4 v0, 0x0

    .line 140
    :try_start_0
    invoke-virtual {p1, v0}, Lorg/apache/cordova/CordovaArgs;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lorg/apache/cordova/statusbar/StatusBar;->setStatusBarBackgroundColor(Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 142
    :catch_0
    const-string p1, "StatusBar"

    const-string v0, "Invalid hexString argument, use f.i. \'#777777\'"

    invoke-static {p1, v0}, Lorg/apache/cordova/LOG;->e(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method synthetic lambda$execute$4$org-apache-cordova-statusbar-StatusBar(Lorg/apache/cordova/CordovaArgs;)V
    .locals 1

    .line 0
    const/4 v0, 0x0

    .line 150
    :try_start_0
    invoke-virtual {p1, v0}, Lorg/apache/cordova/CordovaArgs;->getBoolean(I)Z

    move-result p1

    invoke-direct {p0, p1}, Lorg/apache/cordova/statusbar/StatusBar;->setStatusBarTransparent(Z)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 152
    :catch_0
    const-string p1, "StatusBar"

    const-string v0, "Invalid boolean argument"

    invoke-static {p1, v0}, Lorg/apache/cordova/LOG;->e(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method synthetic lambda$execute$5$org-apache-cordova-statusbar-StatusBar()V
    .locals 1

    .line 158
    const-string v0, "default"

    invoke-direct {p0, v0}, Lorg/apache/cordova/statusbar/StatusBar;->setStatusBarStyle(Ljava/lang/String;)V

    return-void
.end method

.method synthetic lambda$execute$6$org-apache-cordova-statusbar-StatusBar()V
    .locals 1

    .line 162
    const-string v0, "lightcontent"

    invoke-direct {p0, v0}, Lorg/apache/cordova/statusbar/StatusBar;->setStatusBarStyle(Ljava/lang/String;)V

    return-void
.end method

.method synthetic lambda$initialize$0$org-apache-cordova-statusbar-StatusBar()V
    .locals 3

    .line 76
    iget-object v0, p0, Lorg/apache/cordova/statusbar/StatusBar;->window:Landroid/view/Window;

    const/16 v1, 0x800

    invoke-virtual {v0, v1}, Landroid/view/Window;->clearFlags(I)V

    .line 79
    iget-object v0, p0, Lorg/apache/cordova/statusbar/StatusBar;->preferences:Lorg/apache/cordova/CordovaPreferences;

    const-string v1, "StatusBarOverlaysWebView"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lorg/apache/cordova/CordovaPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    invoke-direct {p0, v0}, Lorg/apache/cordova/statusbar/StatusBar;->setStatusBarTransparent(Z)V

    .line 82
    iget-object v0, p0, Lorg/apache/cordova/statusbar/StatusBar;->preferences:Lorg/apache/cordova/CordovaPreferences;

    const-string v1, "StatusBarBackgroundColor"

    const-string v2, "#000000"

    invoke-virtual {v0, v1, v2}, Lorg/apache/cordova/CordovaPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lorg/apache/cordova/statusbar/StatusBar;->setStatusBarBackgroundColor(Ljava/lang/String;)V

    .line 85
    iget-object v0, p0, Lorg/apache/cordova/statusbar/StatusBar;->preferences:Lorg/apache/cordova/CordovaPreferences;

    const-string v1, "StatusBarStyle"

    const-string v2, "lightcontent"

    .line 86
    invoke-virtual {v0, v1, v2}, Lorg/apache/cordova/CordovaPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    .line 85
    invoke-direct {p0, v0}, Lorg/apache/cordova/statusbar/StatusBar;->setStatusBarStyle(Ljava/lang/String;)V

    return-void
.end method
