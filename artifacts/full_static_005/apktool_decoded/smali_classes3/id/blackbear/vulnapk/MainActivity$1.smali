.class Lid/blackbear/vulnapk/MainActivity$1;
.super Ljava/lang/Object;
.source "MainActivity.java"

# interfaces
.implements Lcom/google/android/material/navigation/NavigationView$OnNavigationItemSelectedListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lid/blackbear/vulnapk/MainActivity;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lid/blackbear/vulnapk/MainActivity;


# direct methods
.method constructor <init>(Lid/blackbear/vulnapk/MainActivity;)V
    .locals 0
    .param p1, "this$0"    # Lid/blackbear/vulnapk/MainActivity;

    .line 36
    iput-object p1, p0, Lid/blackbear/vulnapk/MainActivity$1;->this$0:Lid/blackbear/vulnapk/MainActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onNavigationItemSelected(Landroid/view/MenuItem;)Z
    .locals 3
    .param p1, "item"    # Landroid/view/MenuItem;

    .line 39
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 61
    :pswitch_0
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lid/blackbear/vulnapk/MainActivity$1;->this$0:Lid/blackbear/vulnapk/MainActivity;

    const-class v2, Lid/blackbear/vulnapk/RootActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 62
    .local v0, "root":Landroid/content/Intent;
    iget-object v1, p0, Lid/blackbear/vulnapk/MainActivity$1;->this$0:Lid/blackbear/vulnapk/MainActivity;

    invoke-virtual {v1, v0}, Lid/blackbear/vulnapk/MainActivity;->startActivity(Landroid/content/Intent;)V

    goto :goto_0

    .line 57
    .end local v0    # "root":Landroid/content/Intent;
    :pswitch_1
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lid/blackbear/vulnapk/MainActivity$1;->this$0:Lid/blackbear/vulnapk/MainActivity;

    const-class v2, Lid/blackbear/vulnapk/SettingsActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 58
    .local v0, "settings":Landroid/content/Intent;
    iget-object v1, p0, Lid/blackbear/vulnapk/MainActivity$1;->this$0:Lid/blackbear/vulnapk/MainActivity;

    invoke-virtual {v1, v0}, Lid/blackbear/vulnapk/MainActivity;->startActivity(Landroid/content/Intent;)V

    .line 59
    goto :goto_0

    .line 53
    .end local v0    # "settings":Landroid/content/Intent;
    :pswitch_2
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lid/blackbear/vulnapk/MainActivity$1;->this$0:Lid/blackbear/vulnapk/MainActivity;

    const-class v2, Lid/blackbear/vulnapk/VulnWeb;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 54
    .local v0, "web":Landroid/content/Intent;
    iget-object v1, p0, Lid/blackbear/vulnapk/MainActivity$1;->this$0:Lid/blackbear/vulnapk/MainActivity;

    invoke-virtual {v1, v0}, Lid/blackbear/vulnapk/MainActivity;->startActivity(Landroid/content/Intent;)V

    .line 55
    goto :goto_0

    .line 49
    .end local v0    # "web":Landroid/content/Intent;
    :pswitch_3
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lid/blackbear/vulnapk/MainActivity$1;->this$0:Lid/blackbear/vulnapk/MainActivity;

    const-class v2, Lid/blackbear/vulnapk/InsecureCryptoActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 50
    .local v0, "crypto":Landroid/content/Intent;
    iget-object v1, p0, Lid/blackbear/vulnapk/MainActivity$1;->this$0:Lid/blackbear/vulnapk/MainActivity;

    invoke-virtual {v1, v0}, Lid/blackbear/vulnapk/MainActivity;->startActivity(Landroid/content/Intent;)V

    .line 51
    goto :goto_0

    .line 45
    .end local v0    # "crypto":Landroid/content/Intent;
    :pswitch_4
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lid/blackbear/vulnapk/MainActivity$1;->this$0:Lid/blackbear/vulnapk/MainActivity;

    const-class v2, Lid/blackbear/vulnapk/InsecureStorageActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 46
    .local v0, "storage":Landroid/content/Intent;
    iget-object v1, p0, Lid/blackbear/vulnapk/MainActivity$1;->this$0:Lid/blackbear/vulnapk/MainActivity;

    invoke-virtual {v1, v0}, Lid/blackbear/vulnapk/MainActivity;->startActivity(Landroid/content/Intent;)V

    .line 47
    goto :goto_0

    .line 41
    .end local v0    # "storage":Landroid/content/Intent;
    :pswitch_5
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lid/blackbear/vulnapk/MainActivity$1;->this$0:Lid/blackbear/vulnapk/MainActivity;

    const-class v2, Lid/blackbear/vulnapk/MainActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 42
    .local v0, "menu":Landroid/content/Intent;
    iget-object v1, p0, Lid/blackbear/vulnapk/MainActivity$1;->this$0:Lid/blackbear/vulnapk/MainActivity;

    invoke-virtual {v1, v0}, Lid/blackbear/vulnapk/MainActivity;->startActivity(Landroid/content/Intent;)V

    .line 43
    nop

    .line 65
    .end local v0    # "menu":Landroid/content/Intent;
    :goto_0
    iget-object v0, p0, Lid/blackbear/vulnapk/MainActivity$1;->this$0:Lid/blackbear/vulnapk/MainActivity;

    iget-object v0, v0, Lid/blackbear/vulnapk/MainActivity;->drawerLayout:Landroidx/drawerlayout/widget/DrawerLayout;

    invoke-virtual {v0}, Landroidx/drawerlayout/widget/DrawerLayout;->closeDrawers()V

    .line 66
    const/4 v0, 0x1

    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x7f080118
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
