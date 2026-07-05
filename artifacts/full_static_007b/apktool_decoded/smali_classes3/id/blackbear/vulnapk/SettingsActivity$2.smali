.class Lid/blackbear/vulnapk/SettingsActivity$2;
.super Ljava/lang/Object;
.source "SettingsActivity.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lid/blackbear/vulnapk/SettingsActivity;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lid/blackbear/vulnapk/SettingsActivity;


# direct methods
.method constructor <init>(Lid/blackbear/vulnapk/SettingsActivity;)V
    .locals 0
    .param p1, "this$0"    # Lid/blackbear/vulnapk/SettingsActivity;

    .line 44
    iput-object p1, p0, Lid/blackbear/vulnapk/SettingsActivity$2;->this$0:Lid/blackbear/vulnapk/SettingsActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 5
    .param p1, "view"    # Landroid/view/View;

    .line 48
    new-instance v0, Ljava/io/File;

    const-string v1, "data/data/id.blackbear.vulnapk/files/ip_settings"

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 50
    .local v0, "file":Ljava/io/File;
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    .line 51
    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    move-result v1

    .line 53
    .local v1, "isDeleted":Z
    if-eqz v1, :cond_0

    .line 54
    iget-object v3, p0, Lid/blackbear/vulnapk/SettingsActivity$2;->this$0:Lid/blackbear/vulnapk/SettingsActivity;

    invoke-virtual {v3}, Lid/blackbear/vulnapk/SettingsActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v3

    const-string v4, "File deleted successfully"

    invoke-static {v3, v4, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v2

    invoke-virtual {v2}, Landroid/widget/Toast;->show()V

    goto :goto_0

    .line 56
    :cond_0
    iget-object v3, p0, Lid/blackbear/vulnapk/SettingsActivity$2;->this$0:Lid/blackbear/vulnapk/SettingsActivity;

    invoke-virtual {v3}, Lid/blackbear/vulnapk/SettingsActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v3

    const-string v4, "Error occurred."

    invoke-static {v3, v4, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v2

    invoke-virtual {v2}, Landroid/widget/Toast;->show()V

    .line 58
    .end local v1    # "isDeleted":Z
    :goto_0
    goto :goto_1

    .line 59
    :cond_1
    iget-object v1, p0, Lid/blackbear/vulnapk/SettingsActivity$2;->this$0:Lid/blackbear/vulnapk/SettingsActivity;

    invoke-virtual {v1}, Lid/blackbear/vulnapk/SettingsActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    const-string v3, "File doesn\'t exist."

    invoke-static {v1, v3, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v1

    invoke-virtual {v1}, Landroid/widget/Toast;->show()V

    .line 61
    :goto_1
    return-void
.end method
