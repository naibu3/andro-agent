.class public Lid/blackbear/vulnapk/MainActivity;
.super Landroidx/appcompat/app/AppCompatActivity;
.source "MainActivity.java"


# instance fields
.field public drawerLayout:Landroidx/drawerlayout/widget/DrawerLayout;

.field private navigationView:Lcom/google/android/material/navigation/NavigationView;

.field private toggle:Landroidx/appcompat/app/ActionBarDrawerToggle;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 16
    invoke-direct {p0}, Landroidx/appcompat/app/AppCompatActivity;-><init>()V

    return-void
.end method


# virtual methods
.method protected onCreate(Landroid/os/Bundle;)V
    .locals 4
    .param p1, "savedInstanceState"    # Landroid/os/Bundle;

    .line 24
    invoke-super {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->onCreate(Landroid/os/Bundle;)V

    .line 25
    const v0, 0x7f0b001e

    invoke-virtual {p0, v0}, Lid/blackbear/vulnapk/MainActivity;->setContentView(I)V

    .line 27
    const v0, 0x7f0800ab

    invoke-virtual {p0, v0}, Lid/blackbear/vulnapk/MainActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroidx/drawerlayout/widget/DrawerLayout;

    iput-object v0, p0, Lid/blackbear/vulnapk/MainActivity;->drawerLayout:Landroidx/drawerlayout/widget/DrawerLayout;

    .line 28
    const v0, 0x7f080147

    invoke-virtual {p0, v0}, Lid/blackbear/vulnapk/MainActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/google/android/material/navigation/NavigationView;

    iput-object v0, p0, Lid/blackbear/vulnapk/MainActivity;->navigationView:Lcom/google/android/material/navigation/NavigationView;

    .line 30
    new-instance v0, Landroidx/appcompat/app/ActionBarDrawerToggle;

    iget-object v1, p0, Lid/blackbear/vulnapk/MainActivity;->drawerLayout:Landroidx/drawerlayout/widget/DrawerLayout;

    const v2, 0x7f100096

    const v3, 0x7f100028

    invoke-direct {v0, p0, v1, v2, v3}, Landroidx/appcompat/app/ActionBarDrawerToggle;-><init>(Landroid/app/Activity;Landroidx/drawerlayout/widget/DrawerLayout;II)V

    iput-object v0, p0, Lid/blackbear/vulnapk/MainActivity;->toggle:Landroidx/appcompat/app/ActionBarDrawerToggle;

    .line 31
    iget-object v1, p0, Lid/blackbear/vulnapk/MainActivity;->drawerLayout:Landroidx/drawerlayout/widget/DrawerLayout;

    invoke-virtual {v1, v0}, Landroidx/drawerlayout/widget/DrawerLayout;->addDrawerListener(Landroidx/drawerlayout/widget/DrawerLayout$DrawerListener;)V

    .line 32
    iget-object v0, p0, Lid/blackbear/vulnapk/MainActivity;->toggle:Landroidx/appcompat/app/ActionBarDrawerToggle;

    invoke-virtual {v0}, Landroidx/appcompat/app/ActionBarDrawerToggle;->syncState()V

    .line 34
    invoke-virtual {p0}, Lid/blackbear/vulnapk/MainActivity;->getSupportActionBar()Landroidx/appcompat/app/ActionBar;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroidx/appcompat/app/ActionBar;->setDisplayHomeAsUpEnabled(Z)V

    .line 36
    iget-object v0, p0, Lid/blackbear/vulnapk/MainActivity;->navigationView:Lcom/google/android/material/navigation/NavigationView;

    new-instance v1, Lid/blackbear/vulnapk/MainActivity$1;

    invoke-direct {v1, p0}, Lid/blackbear/vulnapk/MainActivity$1;-><init>(Lid/blackbear/vulnapk/MainActivity;)V

    invoke-virtual {v0, v1}, Lcom/google/android/material/navigation/NavigationView;->setNavigationItemSelectedListener(Lcom/google/android/material/navigation/NavigationView$OnNavigationItemSelectedListener;)V

    .line 69
    return-void
.end method

.method public onOptionsItemSelected(Landroid/view/MenuItem;)Z
    .locals 1
    .param p1, "item"    # Landroid/view/MenuItem;

    .line 73
    iget-object v0, p0, Lid/blackbear/vulnapk/MainActivity;->toggle:Landroidx/appcompat/app/ActionBarDrawerToggle;

    invoke-virtual {v0, p1}, Landroidx/appcompat/app/ActionBarDrawerToggle;->onOptionsItemSelected(Landroid/view/MenuItem;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 74
    const/4 v0, 0x1

    return v0

    .line 76
    :cond_0
    invoke-super {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->onOptionsItemSelected(Landroid/view/MenuItem;)Z

    move-result v0

    return v0
.end method
