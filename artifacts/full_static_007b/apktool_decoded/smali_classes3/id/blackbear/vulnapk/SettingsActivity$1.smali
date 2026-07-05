.class Lid/blackbear/vulnapk/SettingsActivity$1;
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

    .line 28
    iput-object p1, p0, Lid/blackbear/vulnapk/SettingsActivity$1;->this$0:Lid/blackbear/vulnapk/SettingsActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4
    .param p1, "view"    # Landroid/view/View;

    .line 32
    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, Lid/blackbear/vulnapk/SettingsActivity$1;->this$0:Lid/blackbear/vulnapk/SettingsActivity;

    const-string v2, "ip_settings"

    invoke-virtual {v1, v2, v0}, Lid/blackbear/vulnapk/SettingsActivity;->openFileOutput(Ljava/lang/String;I)Ljava/io/FileOutputStream;

    move-result-object v1

    .line 33
    .local v1, "fos":Ljava/io/FileOutputStream;
    iget-object v2, p0, Lid/blackbear/vulnapk/SettingsActivity$1;->this$0:Lid/blackbear/vulnapk/SettingsActivity;

    iget-object v2, v2, Lid/blackbear/vulnapk/SettingsActivity;->ip:Landroid/widget/EditText;

    invoke-virtual {v2}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->getBytes()[B

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/io/FileOutputStream;->write([B)V

    .line 34
    invoke-virtual {v1}, Ljava/io/FileOutputStream;->close()V

    .line 35
    iget-object v2, p0, Lid/blackbear/vulnapk/SettingsActivity$1;->this$0:Lid/blackbear/vulnapk/SettingsActivity;

    invoke-virtual {v2}, Lid/blackbear/vulnapk/SettingsActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    const-string v3, "Saved successfully."

    invoke-static {v2, v3, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v2

    invoke-virtual {v2}, Landroid/widget/Toast;->show()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 39
    .end local v1    # "fos":Ljava/io/FileOutputStream;
    goto :goto_0

    .line 36
    :catch_0
    move-exception v1

    .line 37
    .local v1, "e":Ljava/io/IOException;
    invoke-virtual {v1}, Ljava/io/IOException;->printStackTrace()V

    .line 38
    iget-object v2, p0, Lid/blackbear/vulnapk/SettingsActivity$1;->this$0:Lid/blackbear/vulnapk/SettingsActivity;

    invoke-virtual {v2}, Lid/blackbear/vulnapk/SettingsActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    const-string v3, "Error occurred."

    invoke-static {v2, v3, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 41
    .end local v1    # "e":Ljava/io/IOException;
    :goto_0
    return-void
.end method
