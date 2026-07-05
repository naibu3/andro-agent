.class public Lid/blackbear/vulnapk/RootActivity;
.super Landroidx/appcompat/app/AppCompatActivity;
.source "RootActivity.java"


# instance fields
.field hook:Landroid/widget/TextView;

.field status:Landroid/widget/TextView;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 12
    invoke-direct {p0}, Landroidx/appcompat/app/AppCompatActivity;-><init>()V

    return-void
.end method


# virtual methods
.method public checkStatus(Ljava/lang/String;)Ljava/lang/String;
    .locals 1
    .param p1, "status"    # Ljava/lang/String;

    .line 16
    const-string v0, "Admin"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 17
    const-string v0, "yay"

    return-object v0

    .line 19
    :cond_0
    const-string v0, "nay"

    return-object v0
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 4
    .param p1, "savedInstanceState"    # Landroid/os/Bundle;

    .line 25
    invoke-super {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->onCreate(Landroid/os/Bundle;)V

    .line 26
    const v0, 0x7f0b001f

    invoke-virtual {p0, v0}, Lid/blackbear/vulnapk/RootActivity;->setContentView(I)V

    .line 28
    const v0, 0x7f080172

    invoke-virtual {p0, v0}, Lid/blackbear/vulnapk/RootActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lid/blackbear/vulnapk/RootActivity;->status:Landroid/widget/TextView;

    .line 29
    const v0, 0x7f0800da

    invoke-virtual {p0, v0}, Lid/blackbear/vulnapk/RootActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lid/blackbear/vulnapk/RootActivity;->hook:Landroid/widget/TextView;

    .line 30
    const-string v0, "NormalUser"

    .line 32
    .local v0, "stats":Ljava/lang/String;
    new-instance v1, Lcom/scottyab/rootbeer/RootBeer;

    invoke-direct {v1, p0}, Lcom/scottyab/rootbeer/RootBeer;-><init>(Landroid/content/Context;)V

    .line 33
    .local v1, "rootBeer":Lcom/scottyab/rootbeer/RootBeer;
    invoke-virtual {v1}, Lcom/scottyab/rootbeer/RootBeer;->isRooted()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 34
    iget-object v2, p0, Lid/blackbear/vulnapk/RootActivity;->status:Landroid/widget/TextView;

    const-string v3, "STATUS: ROOT DETECTED!!!!!"

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 36
    :cond_0
    iget-object v2, p0, Lid/blackbear/vulnapk/RootActivity;->status:Landroid/widget/TextView;

    const-string v3, "STATUS: ROOT IS NOT DETECTED."

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 39
    :goto_0
    invoke-virtual {p0, v0}, Lid/blackbear/vulnapk/RootActivity;->checkStatus(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "yay"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 40
    iget-object v2, p0, Lid/blackbear/vulnapk/RootActivity;->hook:Landroid/widget/TextView;

    const-string v3, "STATUS: YOU ARE ADMIN!"

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_1

    .line 42
    :cond_1
    iget-object v2, p0, Lid/blackbear/vulnapk/RootActivity;->hook:Landroid/widget/TextView;

    const-string v3, "STATUS: WHO ARE YOU ?!"

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 47
    :goto_1
    return-void
.end method
