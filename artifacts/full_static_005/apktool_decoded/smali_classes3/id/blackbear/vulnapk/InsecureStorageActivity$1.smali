.class Lid/blackbear/vulnapk/InsecureStorageActivity$1;
.super Ljava/lang/Object;
.source "InsecureStorageActivity.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lid/blackbear/vulnapk/InsecureStorageActivity;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lid/blackbear/vulnapk/InsecureStorageActivity;


# direct methods
.method constructor <init>(Lid/blackbear/vulnapk/InsecureStorageActivity;)V
    .locals 0
    .param p1, "this$0"    # Lid/blackbear/vulnapk/InsecureStorageActivity;

    .line 30
    iput-object p1, p0, Lid/blackbear/vulnapk/InsecureStorageActivity$1;->this$0:Lid/blackbear/vulnapk/InsecureStorageActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 5
    .param p1, "view"    # Landroid/view/View;

    .line 32
    iget-object v0, p0, Lid/blackbear/vulnapk/InsecureStorageActivity$1;->this$0:Lid/blackbear/vulnapk/InsecureStorageActivity;

    const v1, 0x7f0800e6

    invoke-virtual {v0, v1}, Lid/blackbear/vulnapk/InsecureStorageActivity;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/EditText;

    iput-object v1, v0, Lid/blackbear/vulnapk/InsecureStorageActivity;->name:Landroid/widget/EditText;

    .line 33
    iget-object v0, p0, Lid/blackbear/vulnapk/InsecureStorageActivity$1;->this$0:Lid/blackbear/vulnapk/InsecureStorageActivity;

    const v1, 0x7f0800e9

    invoke-virtual {v0, v1}, Lid/blackbear/vulnapk/InsecureStorageActivity;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/EditText;

    iput-object v1, v0, Lid/blackbear/vulnapk/InsecureStorageActivity;->secret:Landroid/widget/EditText;

    .line 34
    iget-object v0, p0, Lid/blackbear/vulnapk/InsecureStorageActivity$1;->this$0:Lid/blackbear/vulnapk/InsecureStorageActivity;

    const v1, 0x7f0800e8

    invoke-virtual {v0, v1}, Lid/blackbear/vulnapk/InsecureStorageActivity;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    iput-object v1, v0, Lid/blackbear/vulnapk/InsecureStorageActivity;->result:Landroid/widget/TextView;

    .line 35
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "This is your secret!\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lid/blackbear/vulnapk/InsecureStorageActivity$1;->this$0:Lid/blackbear/vulnapk/InsecureStorageActivity;

    iget-object v1, v1, Lid/blackbear/vulnapk/InsecureStorageActivity;->secret:Landroid/widget/EditText;

    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\nBy: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lid/blackbear/vulnapk/InsecureStorageActivity$1;->this$0:Lid/blackbear/vulnapk/InsecureStorageActivity;

    iget-object v1, v1, Lid/blackbear/vulnapk/InsecureStorageActivity;->name:Landroid/widget/EditText;

    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 36
    .local v0, "final_result":Ljava/lang/String;
    iget-object v1, p0, Lid/blackbear/vulnapk/InsecureStorageActivity$1;->this$0:Lid/blackbear/vulnapk/InsecureStorageActivity;

    iget-object v1, v1, Lid/blackbear/vulnapk/InsecureStorageActivity;->result:Landroid/widget/TextView;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 37
    const-string v1, "user_secret_info"

    invoke-static {v1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 40
    const/4 v1, 0x0

    :try_start_0
    iget-object v2, p0, Lid/blackbear/vulnapk/InsecureStorageActivity$1;->this$0:Lid/blackbear/vulnapk/InsecureStorageActivity;

    const-string v3, "mysecret"

    invoke-virtual {v2, v3, v1}, Lid/blackbear/vulnapk/InsecureStorageActivity;->openFileOutput(Ljava/lang/String;I)Ljava/io/FileOutputStream;

    move-result-object v2

    .line 41
    .local v2, "fos":Ljava/io/FileOutputStream;
    invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/io/FileOutputStream;->write([B)V

    .line 42
    invoke-virtual {v2}, Ljava/io/FileOutputStream;->close()V

    .line 43
    iget-object v3, p0, Lid/blackbear/vulnapk/InsecureStorageActivity$1;->this$0:Lid/blackbear/vulnapk/InsecureStorageActivity;

    invoke-virtual {v3}, Lid/blackbear/vulnapk/InsecureStorageActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v3

    const-string v4, "Your secret is saved successfully in our very secure database!."

    invoke-static {v3, v4, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v3

    invoke-virtual {v3}, Landroid/widget/Toast;->show()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 47
    .end local v2    # "fos":Ljava/io/FileOutputStream;
    goto :goto_0

    .line 44
    :catch_0
    move-exception v2

    .line 45
    .local v2, "e":Ljava/io/IOException;
    invoke-virtual {v2}, Ljava/io/IOException;->printStackTrace()V

    .line 46
    iget-object v3, p0, Lid/blackbear/vulnapk/InsecureStorageActivity$1;->this$0:Lid/blackbear/vulnapk/InsecureStorageActivity;

    invoke-virtual {v3}, Lid/blackbear/vulnapk/InsecureStorageActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v3

    const-string v4, "Failed to save your secret :(("

    invoke-static {v3, v4, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v1

    invoke-virtual {v1}, Landroid/widget/Toast;->show()V

    .line 49
    .end local v2    # "e":Ljava/io/IOException;
    :goto_0
    return-void
.end method
