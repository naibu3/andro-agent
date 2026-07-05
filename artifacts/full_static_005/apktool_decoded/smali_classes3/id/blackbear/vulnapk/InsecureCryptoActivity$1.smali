.class Lid/blackbear/vulnapk/InsecureCryptoActivity$1;
.super Ljava/lang/Object;
.source "InsecureCryptoActivity.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lid/blackbear/vulnapk/InsecureCryptoActivity;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lid/blackbear/vulnapk/InsecureCryptoActivity;


# direct methods
.method constructor <init>(Lid/blackbear/vulnapk/InsecureCryptoActivity;)V
    .locals 0
    .param p1, "this$0"    # Lid/blackbear/vulnapk/InsecureCryptoActivity;

    .line 28
    iput-object p1, p0, Lid/blackbear/vulnapk/InsecureCryptoActivity$1;->this$0:Lid/blackbear/vulnapk/InsecureCryptoActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 13
    .param p1, "view"    # Landroid/view/View;

    .line 30
    iget-object v0, p0, Lid/blackbear/vulnapk/InsecureCryptoActivity$1;->this$0:Lid/blackbear/vulnapk/InsecureCryptoActivity;

    const v1, 0x7f080088

    invoke-virtual {v0, v1}, Lid/blackbear/vulnapk/InsecureCryptoActivity;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/EditText;

    iput-object v1, v0, Lid/blackbear/vulnapk/InsecureCryptoActivity;->secret:Landroid/widget/EditText;

    .line 31
    iget-object v0, p0, Lid/blackbear/vulnapk/InsecureCryptoActivity$1;->this$0:Lid/blackbear/vulnapk/InsecureCryptoActivity;

    const v1, 0x7f080087

    invoke-virtual {v0, v1}, Lid/blackbear/vulnapk/InsecureCryptoActivity;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    iput-object v1, v0, Lid/blackbear/vulnapk/InsecureCryptoActivity;->result:Landroid/widget/TextView;

    .line 32
    const/4 v0, 0x0

    .line 33
    .local v0, "encrypted":Ljava/lang/String;
    const/4 v1, 0x0

    .line 37
    .local v1, "hashed":Ljava/lang/String;
    const/4 v2, 0x0

    :try_start_0
    iget-object v3, p0, Lid/blackbear/vulnapk/InsecureCryptoActivity$1;->this$0:Lid/blackbear/vulnapk/InsecureCryptoActivity;

    iget-object v3, v3, Lid/blackbear/vulnapk/InsecureCryptoActivity;->secret:Landroid/widget/EditText;

    invoke-virtual {v3}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lid/blackbear/vulnapk/CryptoUtil;->encrypt(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    move-object v0, v3

    .line 38
    const-string v3, "MD5"

    invoke-static {v3}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    move-result-object v3

    .line 39
    .local v3, "messagedigest":Ljava/security/MessageDigest;
    iget-object v4, p0, Lid/blackbear/vulnapk/InsecureCryptoActivity$1;->this$0:Lid/blackbear/vulnapk/InsecureCryptoActivity;

    iget-object v4, v4, Lid/blackbear/vulnapk/InsecureCryptoActivity;->secret:Landroid/widget/EditText;

    invoke-virtual {v4}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v4

    .line 40
    .local v4, "input":Ljava/lang/String;
    invoke-virtual {v4}, Ljava/lang/String;->getBytes()[B

    move-result-object v5

    invoke-virtual {v3, v5}, Ljava/security/MessageDigest;->digest([B)[B

    move-result-object v5

    .line 41
    .local v5, "hashBytes":[B
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 42
    .local v6, "stringbuilder":Ljava/lang/StringBuilder;
    array-length v7, v5

    move v8, v2

    :goto_0
    if-ge v8, v7, :cond_0

    aget-byte v9, v5, v8

    .line 43
    .local v9, "b":B
    const-string v10, "%02x"

    const/4 v11, 0x1

    new-array v11, v11, [Ljava/lang/Object;

    invoke-static {v9}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v12

    aput-object v12, v11, v2

    invoke-static {v10, v11}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v6, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    nop

    .end local v9    # "b":B
    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    .line 45
    :cond_0
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    move-object v1, v7

    .line 46
    iget-object v7, p0, Lid/blackbear/vulnapk/InsecureCryptoActivity$1;->this$0:Lid/blackbear/vulnapk/InsecureCryptoActivity;

    invoke-virtual {v7}, Lid/blackbear/vulnapk/InsecureCryptoActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v7

    const-string v8, "Encrypted Successfully!"

    invoke-static {v7, v8, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v7

    invoke-virtual {v7}, Landroid/widget/Toast;->show()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 49
    .end local v3    # "messagedigest":Ljava/security/MessageDigest;
    .end local v4    # "input":Ljava/lang/String;
    .end local v5    # "hashBytes":[B
    .end local v6    # "stringbuilder":Ljava/lang/StringBuilder;
    goto :goto_1

    .line 47
    :catch_0
    move-exception v3

    .line 48
    .local v3, "e":Ljava/lang/Exception;
    iget-object v4, p0, Lid/blackbear/vulnapk/InsecureCryptoActivity$1;->this$0:Lid/blackbear/vulnapk/InsecureCryptoActivity;

    invoke-virtual {v4}, Lid/blackbear/vulnapk/InsecureCryptoActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v4

    const-string v5, "An Error Has Occurred"

    invoke-static {v4, v5, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v2

    invoke-virtual {v2}, Landroid/widget/Toast;->show()V

    .line 51
    .end local v3    # "e":Ljava/lang/Exception;
    :goto_1
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "This is your encrypted secret!\n"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "And your hashed secret is: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 52
    .local v2, "final_result":Ljava/lang/String;
    iget-object v3, p0, Lid/blackbear/vulnapk/InsecureCryptoActivity$1;->this$0:Lid/blackbear/vulnapk/InsecureCryptoActivity;

    iget-object v3, v3, Lid/blackbear/vulnapk/InsecureCryptoActivity;->result:Landroid/widget/TextView;

    invoke-virtual {v3, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 53
    return-void
.end method
