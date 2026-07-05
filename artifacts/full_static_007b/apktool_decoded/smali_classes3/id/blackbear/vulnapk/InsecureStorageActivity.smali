.class public Lid/blackbear/vulnapk/InsecureStorageActivity;
.super Landroidx/appcompat/app/AppCompatActivity;
.source "InsecureStorageActivity.java"


# instance fields
.field name:Landroid/widget/EditText;

.field result:Landroid/widget/TextView;

.field secret:Landroid/widget/EditText;

.field submit:Landroid/widget/Button;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 18
    invoke-direct {p0}, Landroidx/appcompat/app/AppCompatActivity;-><init>()V

    return-void
.end method


# virtual methods
.method protected onCreate(Landroid/os/Bundle;)V
    .locals 2
    .param p1, "savedInstanceState"    # Landroid/os/Bundle;

    .line 25
    invoke-super {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->onCreate(Landroid/os/Bundle;)V

    .line 26
    const v0, 0x7f0b001d

    invoke-virtual {p0, v0}, Lid/blackbear/vulnapk/InsecureStorageActivity;->setContentView(I)V

    .line 28
    const v0, 0x7f0800ea

    invoke-virtual {p0, v0}, Lid/blackbear/vulnapk/InsecureStorageActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lid/blackbear/vulnapk/InsecureStorageActivity;->submit:Landroid/widget/Button;

    .line 30
    new-instance v1, Lid/blackbear/vulnapk/InsecureStorageActivity$1;

    invoke-direct {v1, p0}, Lid/blackbear/vulnapk/InsecureStorageActivity$1;-><init>(Lid/blackbear/vulnapk/InsecureStorageActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 52
    return-void
.end method
