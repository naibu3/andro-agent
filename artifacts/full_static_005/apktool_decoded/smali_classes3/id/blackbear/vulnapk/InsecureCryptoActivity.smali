.class public Lid/blackbear/vulnapk/InsecureCryptoActivity;
.super Landroidx/appcompat/app/AppCompatActivity;
.source "InsecureCryptoActivity.java"


# instance fields
.field result:Landroid/widget/TextView;

.field secret:Landroid/widget/EditText;

.field submit:Landroid/widget/Button;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 17
    invoke-direct {p0}, Landroidx/appcompat/app/AppCompatActivity;-><init>()V

    return-void
.end method


# virtual methods
.method protected onCreate(Landroid/os/Bundle;)V
    .locals 2
    .param p1, "savedInstanceState"    # Landroid/os/Bundle;

    .line 24
    invoke-super {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->onCreate(Landroid/os/Bundle;)V

    .line 25
    const v0, 0x7f0b001c

    invoke-virtual {p0, v0}, Lid/blackbear/vulnapk/InsecureCryptoActivity;->setContentView(I)V

    .line 27
    const v0, 0x7f080089

    invoke-virtual {p0, v0}, Lid/blackbear/vulnapk/InsecureCryptoActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lid/blackbear/vulnapk/InsecureCryptoActivity;->submit:Landroid/widget/Button;

    .line 28
    new-instance v1, Lid/blackbear/vulnapk/InsecureCryptoActivity$1;

    invoke-direct {v1, p0}, Lid/blackbear/vulnapk/InsecureCryptoActivity$1;-><init>(Lid/blackbear/vulnapk/InsecureCryptoActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 56
    return-void
.end method
