.class public final Lowasp/sat/agoat/databinding/ActivityMainBinding;
.super Ljava/lang/Object;
.source "ActivityMainBinding.java"

# interfaces
.implements Landroidx/viewbinding/ViewBinding;


# instance fields
.field public final AccessControl1:Landroid/widget/Button;

.field public final BinaryPatching:Landroid/widget/Button;

.field public final EmulatorButton:Landroid/widget/Button;

.field public final Hardcode:Landroid/widget/Button;

.field public final InputValidations:Landroid/widget/Button;

.field public final InsecureStorage:Landroid/widget/Button;

.field public final SideChannelLeakage:Landroid/widget/Button;

.field public final Traffic:Landroid/widget/Button;

.field public final bioauth1:Landroid/widget/Button;

.field public final rootButton1:Landroid/widget/Button;

.field private final rootView:Landroid/widget/LinearLayout;


# direct methods
.method private constructor <init>(Landroid/widget/LinearLayout;Landroid/widget/Button;Landroid/widget/Button;Landroid/widget/Button;Landroid/widget/Button;Landroid/widget/Button;Landroid/widget/Button;Landroid/widget/Button;Landroid/widget/Button;Landroid/widget/Button;Landroid/widget/Button;)V
    .locals 0
    .param p1, "rootView"    # Landroid/widget/LinearLayout;
    .param p2, "AccessControl1"    # Landroid/widget/Button;
    .param p3, "BinaryPatching"    # Landroid/widget/Button;
    .param p4, "EmulatorButton"    # Landroid/widget/Button;
    .param p5, "Hardcode"    # Landroid/widget/Button;
    .param p6, "InputValidations"    # Landroid/widget/Button;
    .param p7, "InsecureStorage"    # Landroid/widget/Button;
    .param p8, "SideChannelLeakage"    # Landroid/widget/Button;
    .param p9, "Traffic"    # Landroid/widget/Button;
    .param p10, "bioauth1"    # Landroid/widget/Button;
    .param p11, "rootButton1"    # Landroid/widget/Button;

    .line 56
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 57
    iput-object p1, p0, Lowasp/sat/agoat/databinding/ActivityMainBinding;->rootView:Landroid/widget/LinearLayout;

    .line 58
    iput-object p2, p0, Lowasp/sat/agoat/databinding/ActivityMainBinding;->AccessControl1:Landroid/widget/Button;

    .line 59
    iput-object p3, p0, Lowasp/sat/agoat/databinding/ActivityMainBinding;->BinaryPatching:Landroid/widget/Button;

    .line 60
    iput-object p4, p0, Lowasp/sat/agoat/databinding/ActivityMainBinding;->EmulatorButton:Landroid/widget/Button;

    .line 61
    iput-object p5, p0, Lowasp/sat/agoat/databinding/ActivityMainBinding;->Hardcode:Landroid/widget/Button;

    .line 62
    iput-object p6, p0, Lowasp/sat/agoat/databinding/ActivityMainBinding;->InputValidations:Landroid/widget/Button;

    .line 63
    iput-object p7, p0, Lowasp/sat/agoat/databinding/ActivityMainBinding;->InsecureStorage:Landroid/widget/Button;

    .line 64
    iput-object p8, p0, Lowasp/sat/agoat/databinding/ActivityMainBinding;->SideChannelLeakage:Landroid/widget/Button;

    .line 65
    iput-object p9, p0, Lowasp/sat/agoat/databinding/ActivityMainBinding;->Traffic:Landroid/widget/Button;

    .line 66
    iput-object p10, p0, Lowasp/sat/agoat/databinding/ActivityMainBinding;->bioauth1:Landroid/widget/Button;

    .line 67
    iput-object p11, p0, Lowasp/sat/agoat/databinding/ActivityMainBinding;->rootButton1:Landroid/widget/Button;

    .line 68
    return-void
.end method

.method public static bind(Landroid/view/View;)Lowasp/sat/agoat/databinding/ActivityMainBinding;
    .locals 14
    .param p0, "rootView"    # Landroid/view/View;

    .line 97
    sget v0, Lowasp/sat/agoat/R$id;->AccessControl1:I

    .line 98
    .local v0, "id":I
    invoke-static {p0, v0}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v4, v1

    check-cast v4, Landroid/widget/Button;

    .line 99
    .local v4, "AccessControl1":Landroid/widget/Button;
    if-eqz v4, :cond_9

    .line 103
    sget v0, Lowasp/sat/agoat/R$id;->BinaryPatching:I

    .line 104
    invoke-static {p0, v0}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v5, v1

    check-cast v5, Landroid/widget/Button;

    .line 105
    .local v5, "BinaryPatching":Landroid/widget/Button;
    if-eqz v5, :cond_8

    .line 109
    sget v0, Lowasp/sat/agoat/R$id;->EmulatorButton:I

    .line 110
    invoke-static {p0, v0}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v6, v1

    check-cast v6, Landroid/widget/Button;

    .line 111
    .local v6, "EmulatorButton":Landroid/widget/Button;
    if-eqz v6, :cond_7

    .line 115
    sget v0, Lowasp/sat/agoat/R$id;->Hardcode:I

    .line 116
    invoke-static {p0, v0}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v7, v1

    check-cast v7, Landroid/widget/Button;

    .line 117
    .local v7, "Hardcode":Landroid/widget/Button;
    if-eqz v7, :cond_6

    .line 121
    sget v0, Lowasp/sat/agoat/R$id;->InputValidations:I

    .line 122
    invoke-static {p0, v0}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v8, v1

    check-cast v8, Landroid/widget/Button;

    .line 123
    .local v8, "InputValidations":Landroid/widget/Button;
    if-eqz v8, :cond_5

    .line 127
    sget v0, Lowasp/sat/agoat/R$id;->InsecureStorage:I

    .line 128
    invoke-static {p0, v0}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v9, v1

    check-cast v9, Landroid/widget/Button;

    .line 129
    .local v9, "InsecureStorage":Landroid/widget/Button;
    if-eqz v9, :cond_4

    .line 133
    sget v0, Lowasp/sat/agoat/R$id;->SideChannelLeakage:I

    .line 134
    invoke-static {p0, v0}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v10, v1

    check-cast v10, Landroid/widget/Button;

    .line 135
    .local v10, "SideChannelLeakage":Landroid/widget/Button;
    if-eqz v10, :cond_3

    .line 139
    sget v0, Lowasp/sat/agoat/R$id;->Traffic:I

    .line 140
    invoke-static {p0, v0}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v11, v1

    check-cast v11, Landroid/widget/Button;

    .line 141
    .local v11, "Traffic":Landroid/widget/Button;
    if-eqz v11, :cond_2

    .line 145
    sget v0, Lowasp/sat/agoat/R$id;->bioauth1:I

    .line 146
    invoke-static {p0, v0}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v12, v1

    check-cast v12, Landroid/widget/Button;

    .line 147
    .local v12, "bioauth1":Landroid/widget/Button;
    if-eqz v12, :cond_1

    .line 151
    sget v0, Lowasp/sat/agoat/R$id;->rootButton1:I

    .line 152
    invoke-static {p0, v0}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v13, v1

    check-cast v13, Landroid/widget/Button;

    .line 153
    .local v13, "rootButton1":Landroid/widget/Button;
    if-eqz v13, :cond_0

    .line 157
    new-instance v2, Lowasp/sat/agoat/databinding/ActivityMainBinding;

    move-object v3, p0

    check-cast v3, Landroid/widget/LinearLayout;

    invoke-direct/range {v2 .. v13}, Lowasp/sat/agoat/databinding/ActivityMainBinding;-><init>(Landroid/widget/LinearLayout;Landroid/widget/Button;Landroid/widget/Button;Landroid/widget/Button;Landroid/widget/Button;Landroid/widget/Button;Landroid/widget/Button;Landroid/widget/Button;Landroid/widget/Button;Landroid/widget/Button;Landroid/widget/Button;)V

    return-object v2

    .line 154
    :cond_0
    goto :goto_0

    .line 148
    .end local v13    # "rootButton1":Landroid/widget/Button;
    :cond_1
    goto :goto_0

    .line 142
    .end local v12    # "bioauth1":Landroid/widget/Button;
    :cond_2
    goto :goto_0

    .line 136
    .end local v11    # "Traffic":Landroid/widget/Button;
    :cond_3
    goto :goto_0

    .line 130
    .end local v10    # "SideChannelLeakage":Landroid/widget/Button;
    :cond_4
    goto :goto_0

    .line 124
    .end local v9    # "InsecureStorage":Landroid/widget/Button;
    :cond_5
    goto :goto_0

    .line 118
    .end local v8    # "InputValidations":Landroid/widget/Button;
    :cond_6
    goto :goto_0

    .line 112
    .end local v7    # "Hardcode":Landroid/widget/Button;
    :cond_7
    goto :goto_0

    .line 106
    .end local v6    # "EmulatorButton":Landroid/widget/Button;
    :cond_8
    goto :goto_0

    .line 100
    .end local v5    # "BinaryPatching":Landroid/widget/Button;
    :cond_9
    nop

    .line 161
    .end local v4    # "AccessControl1":Landroid/widget/Button;
    :goto_0
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    move-result-object v1

    .line 162
    .local v1, "missingId":Ljava/lang/String;
    new-instance v2, Ljava/lang/NullPointerException;

    const-string v3, "Missing required view with ID: "

    invoke-virtual {v3, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v2
.end method

.method public static inflate(Landroid/view/LayoutInflater;)Lowasp/sat/agoat/databinding/ActivityMainBinding;
    .locals 2
    .param p0, "inflater"    # Landroid/view/LayoutInflater;

    .line 78
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, Lowasp/sat/agoat/databinding/ActivityMainBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lowasp/sat/agoat/databinding/ActivityMainBinding;

    move-result-object v0

    return-object v0
.end method

.method public static inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lowasp/sat/agoat/databinding/ActivityMainBinding;
    .locals 2
    .param p0, "inflater"    # Landroid/view/LayoutInflater;
    .param p1, "parent"    # Landroid/view/ViewGroup;
    .param p2, "attachToParent"    # Z

    .line 84
    sget v0, Lowasp/sat/agoat/R$layout;->activity_main:I

    const/4 v1, 0x0

    invoke-virtual {p0, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    .line 85
    .local v0, "root":Landroid/view/View;
    if-eqz p2, :cond_0

    .line 86
    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 88
    :cond_0
    invoke-static {v0}, Lowasp/sat/agoat/databinding/ActivityMainBinding;->bind(Landroid/view/View;)Lowasp/sat/agoat/databinding/ActivityMainBinding;

    move-result-object v1

    return-object v1
.end method


# virtual methods
.method public bridge synthetic getRoot()Landroid/view/View;
    .locals 1

    .line 18
    invoke-virtual {p0}, Lowasp/sat/agoat/databinding/ActivityMainBinding;->getRoot()Landroid/widget/LinearLayout;

    move-result-object v0

    return-object v0
.end method

.method public getRoot()Landroid/widget/LinearLayout;
    .locals 1

    .line 73
    iget-object v0, p0, Lowasp/sat/agoat/databinding/ActivityMainBinding;->rootView:Landroid/widget/LinearLayout;

    return-object v0
.end method
