.class public final Lowasp/sat/agoat/MainActivity;
.super Landroidx/appcompat/app/AppCompatActivity;
.source "MainActivity.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0014\u00a8\u0006\u0007"
    }
    d2 = {
        "Lowasp/sat/agoat/MainActivity;",
        "Landroidx/appcompat/app/AppCompatActivity;",
        "()V",
        "onCreate",
        "",
        "savedInstanceState",
        "Landroid/os/Bundle;",
        "app_debug"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static synthetic $r8$lambda$9DCTDwukvhvrGQKVv4k990TErw8(Lowasp/sat/agoat/MainActivity;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lowasp/sat/agoat/MainActivity;->onCreate$lambda$4(Lowasp/sat/agoat/MainActivity;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic $r8$lambda$KRqfShHiHz99w4kO_3T-j3GBXwA(Lowasp/sat/agoat/MainActivity;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lowasp/sat/agoat/MainActivity;->onCreate$lambda$2(Lowasp/sat/agoat/MainActivity;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic $r8$lambda$RycOa6TXuj5VYN_PojCufMxFDwQ(Lowasp/sat/agoat/MainActivity;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lowasp/sat/agoat/MainActivity;->onCreate$lambda$3(Lowasp/sat/agoat/MainActivity;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic $r8$lambda$UNR3BOgu7gYqRtLXYqbp2OhP0r8(Lowasp/sat/agoat/MainActivity;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lowasp/sat/agoat/MainActivity;->onCreate$lambda$1(Lowasp/sat/agoat/MainActivity;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic $r8$lambda$ZBuTUKAdBBbBqW0j-GbS0QLUIDo(Lowasp/sat/agoat/MainActivity;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lowasp/sat/agoat/MainActivity;->onCreate$lambda$8(Lowasp/sat/agoat/MainActivity;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic $r8$lambda$_L3hhl0D9DJprFUtTwyqSuGZDq0(Lowasp/sat/agoat/MainActivity;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lowasp/sat/agoat/MainActivity;->onCreate$lambda$6(Lowasp/sat/agoat/MainActivity;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic $r8$lambda$dHu7rlBjj0x3w9f_Ide8WyPDb04(Lowasp/sat/agoat/MainActivity;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lowasp/sat/agoat/MainActivity;->onCreate$lambda$0(Lowasp/sat/agoat/MainActivity;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic $r8$lambda$r9e7bzfkUX_QidYFfHqblaPoVaM(Lowasp/sat/agoat/MainActivity;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lowasp/sat/agoat/MainActivity;->onCreate$lambda$9(Lowasp/sat/agoat/MainActivity;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic $r8$lambda$waG12uOzebXnwvPWxt17_AxIM0A(Lowasp/sat/agoat/MainActivity;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lowasp/sat/agoat/MainActivity;->onCreate$lambda$7(Lowasp/sat/agoat/MainActivity;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic $r8$lambda$yNDxs8NdINTeuzDsdLbTH58xMAE(Lowasp/sat/agoat/MainActivity;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lowasp/sat/agoat/MainActivity;->onCreate$lambda$5(Lowasp/sat/agoat/MainActivity;Landroid/view/View;)V

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 8
    invoke-direct {p0}, Landroidx/appcompat/app/AppCompatActivity;-><init>()V

    return-void
.end method

.method private static final onCreate$lambda$0(Lowasp/sat/agoat/MainActivity;Landroid/view/View;)V
    .locals 3
    .param p0, "this$0"    # Lowasp/sat/agoat/MainActivity;
    .param p1, "it"    # Landroid/view/View;

    const-string/jumbo v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    new-instance v0, Landroid/content/Intent;

    move-object v1, p0

    check-cast v1, Landroid/content/Context;

    const-class v2, Lowasp/sat/agoat/RootDetectionActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0, v0}, Lowasp/sat/agoat/MainActivity;->startActivity(Landroid/content/Intent;)V

    .line 17
    return-void
.end method

.method private static final onCreate$lambda$1(Lowasp/sat/agoat/MainActivity;Landroid/view/View;)V
    .locals 3
    .param p0, "this$0"    # Lowasp/sat/agoat/MainActivity;
    .param p1, "it"    # Landroid/view/View;

    const-string/jumbo v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    new-instance v0, Landroid/content/Intent;

    move-object v1, p0

    check-cast v1, Landroid/content/Context;

    const-class v2, Lowasp/sat/agoat/EmulatorDetectionActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0, v0}, Lowasp/sat/agoat/MainActivity;->startActivity(Landroid/content/Intent;)V

    .line 22
    return-void
.end method

.method private static final onCreate$lambda$2(Lowasp/sat/agoat/MainActivity;Landroid/view/View;)V
    .locals 3
    .param p0, "this$0"    # Lowasp/sat/agoat/MainActivity;
    .param p1, "it"    # Landroid/view/View;

    const-string/jumbo v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    new-instance v0, Landroid/content/Intent;

    move-object v1, p0

    check-cast v1, Landroid/content/Context;

    const-class v2, Lowasp/sat/agoat/InsecureStorageActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0, v0}, Lowasp/sat/agoat/MainActivity;->startActivity(Landroid/content/Intent;)V

    .line 27
    return-void
.end method

.method private static final onCreate$lambda$3(Lowasp/sat/agoat/MainActivity;Landroid/view/View;)V
    .locals 3
    .param p0, "this$0"    # Lowasp/sat/agoat/MainActivity;
    .param p1, "it"    # Landroid/view/View;

    const-string/jumbo v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    new-instance v0, Landroid/content/Intent;

    move-object v1, p0

    check-cast v1, Landroid/content/Context;

    const-class v2, Lowasp/sat/agoat/InputValidationsActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0, v0}, Lowasp/sat/agoat/MainActivity;->startActivity(Landroid/content/Intent;)V

    .line 32
    return-void
.end method

.method private static final onCreate$lambda$4(Lowasp/sat/agoat/MainActivity;Landroid/view/View;)V
    .locals 3
    .param p0, "this$0"    # Lowasp/sat/agoat/MainActivity;
    .param p1, "it"    # Landroid/view/View;

    const-string/jumbo v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 36
    new-instance v0, Landroid/content/Intent;

    move-object v1, p0

    check-cast v1, Landroid/content/Context;

    const-class v2, Lowasp/sat/agoat/SideChannelDataLeakageActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0, v0}, Lowasp/sat/agoat/MainActivity;->startActivity(Landroid/content/Intent;)V

    .line 37
    return-void
.end method

.method private static final onCreate$lambda$5(Lowasp/sat/agoat/MainActivity;Landroid/view/View;)V
    .locals 3
    .param p0, "this$0"    # Lowasp/sat/agoat/MainActivity;
    .param p1, "it"    # Landroid/view/View;

    const-string/jumbo v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 41
    new-instance v0, Landroid/content/Intent;

    move-object v1, p0

    check-cast v1, Landroid/content/Context;

    const-class v2, Lowasp/sat/agoat/AccessControlIssue1Activity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0, v0}, Lowasp/sat/agoat/MainActivity;->startActivity(Landroid/content/Intent;)V

    .line 42
    return-void
.end method

.method private static final onCreate$lambda$6(Lowasp/sat/agoat/MainActivity;Landroid/view/View;)V
    .locals 3
    .param p0, "this$0"    # Lowasp/sat/agoat/MainActivity;
    .param p1, "it"    # Landroid/view/View;

    const-string/jumbo v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 46
    new-instance v0, Landroid/content/Intent;

    move-object v1, p0

    check-cast v1, Landroid/content/Context;

    const-class v2, Lowasp/sat/agoat/HardcodeViewActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0, v0}, Lowasp/sat/agoat/MainActivity;->startActivity(Landroid/content/Intent;)V

    .line 47
    return-void
.end method

.method private static final onCreate$lambda$7(Lowasp/sat/agoat/MainActivity;Landroid/view/View;)V
    .locals 3
    .param p0, "this$0"    # Lowasp/sat/agoat/MainActivity;
    .param p1, "it"    # Landroid/view/View;

    const-string/jumbo v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 51
    new-instance v0, Landroid/content/Intent;

    move-object v1, p0

    check-cast v1, Landroid/content/Context;

    const-class v2, Lowasp/sat/agoat/TrafficActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0, v0}, Lowasp/sat/agoat/MainActivity;->startActivity(Landroid/content/Intent;)V

    .line 52
    return-void
.end method

.method private static final onCreate$lambda$8(Lowasp/sat/agoat/MainActivity;Landroid/view/View;)V
    .locals 3
    .param p0, "this$0"    # Lowasp/sat/agoat/MainActivity;
    .param p1, "it"    # Landroid/view/View;

    const-string/jumbo v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 56
    new-instance v0, Landroid/content/Intent;

    move-object v1, p0

    check-cast v1, Landroid/content/Context;

    const-class v2, Lowasp/sat/agoat/BinaryPatchingActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0, v0}, Lowasp/sat/agoat/MainActivity;->startActivity(Landroid/content/Intent;)V

    .line 57
    return-void
.end method

.method private static final onCreate$lambda$9(Lowasp/sat/agoat/MainActivity;Landroid/view/View;)V
    .locals 3
    .param p0, "this$0"    # Lowasp/sat/agoat/MainActivity;
    .param p1, "it"    # Landroid/view/View;

    const-string/jumbo v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 61
    new-instance v0, Landroid/content/Intent;

    move-object v1, p0

    check-cast v1, Landroid/content/Context;

    const-class v2, Lowasp/sat/agoat/BioMetricAuthActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0, v0}, Lowasp/sat/agoat/MainActivity;->startActivity(Landroid/content/Intent;)V

    .line 62
    return-void
.end method


# virtual methods
.method protected onCreate(Landroid/os/Bundle;)V
    .locals 11
    .param p1, "savedInstanceState"    # Landroid/os/Bundle;

    .line 11
    invoke-super {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->onCreate(Landroid/os/Bundle;)V

    .line 12
    sget v0, Lowasp/sat/agoat/R$layout;->activity_main:I

    invoke-virtual {p0, v0}, Lowasp/sat/agoat/MainActivity;->setContentView(I)V

    .line 14
    sget v0, Lowasp/sat/agoat/R$id;->rootButton1:I

    invoke-virtual {p0, v0}, Lowasp/sat/agoat/MainActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    .line 15
    .local v0, "rootButton1":Landroid/widget/Button;
    new-instance v1, Lowasp/sat/agoat/MainActivity$$ExternalSyntheticLambda0;

    invoke-direct {v1, p0}, Lowasp/sat/agoat/MainActivity$$ExternalSyntheticLambda0;-><init>(Lowasp/sat/agoat/MainActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 19
    sget v1, Lowasp/sat/agoat/R$id;->EmulatorButton:I

    invoke-virtual {p0, v1}, Lowasp/sat/agoat/MainActivity;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/Button;

    .line 20
    .local v1, "emulatorButton":Landroid/widget/Button;
    new-instance v2, Lowasp/sat/agoat/MainActivity$$ExternalSyntheticLambda1;

    invoke-direct {v2, p0}, Lowasp/sat/agoat/MainActivity$$ExternalSyntheticLambda1;-><init>(Lowasp/sat/agoat/MainActivity;)V

    invoke-virtual {v1, v2}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 24
    sget v2, Lowasp/sat/agoat/R$id;->InsecureStorage:I

    invoke-virtual {p0, v2}, Lowasp/sat/agoat/MainActivity;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/Button;

    .line 25
    .local v2, "insecureStorage":Landroid/widget/Button;
    new-instance v3, Lowasp/sat/agoat/MainActivity$$ExternalSyntheticLambda2;

    invoke-direct {v3, p0}, Lowasp/sat/agoat/MainActivity$$ExternalSyntheticLambda2;-><init>(Lowasp/sat/agoat/MainActivity;)V

    invoke-virtual {v2, v3}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 29
    sget v3, Lowasp/sat/agoat/R$id;->InputValidations:I

    invoke-virtual {p0, v3}, Lowasp/sat/agoat/MainActivity;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/Button;

    .line 30
    .local v3, "inputValidations":Landroid/widget/Button;
    new-instance v4, Lowasp/sat/agoat/MainActivity$$ExternalSyntheticLambda3;

    invoke-direct {v4, p0}, Lowasp/sat/agoat/MainActivity$$ExternalSyntheticLambda3;-><init>(Lowasp/sat/agoat/MainActivity;)V

    invoke-virtual {v3, v4}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 34
    sget v4, Lowasp/sat/agoat/R$id;->SideChannelLeakage:I

    invoke-virtual {p0, v4}, Lowasp/sat/agoat/MainActivity;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/Button;

    .line 35
    .local v4, "sideChannelLeakage":Landroid/widget/Button;
    new-instance v5, Lowasp/sat/agoat/MainActivity$$ExternalSyntheticLambda4;

    invoke-direct {v5, p0}, Lowasp/sat/agoat/MainActivity$$ExternalSyntheticLambda4;-><init>(Lowasp/sat/agoat/MainActivity;)V

    invoke-virtual {v4, v5}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 39
    sget v5, Lowasp/sat/agoat/R$id;->AccessControl1:I

    invoke-virtual {p0, v5}, Lowasp/sat/agoat/MainActivity;->findViewById(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Landroid/widget/Button;

    .line 40
    .local v5, "accessControl1":Landroid/widget/Button;
    new-instance v6, Lowasp/sat/agoat/MainActivity$$ExternalSyntheticLambda5;

    invoke-direct {v6, p0}, Lowasp/sat/agoat/MainActivity$$ExternalSyntheticLambda5;-><init>(Lowasp/sat/agoat/MainActivity;)V

    invoke-virtual {v5, v6}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 44
    sget v6, Lowasp/sat/agoat/R$id;->Hardcode:I

    invoke-virtual {p0, v6}, Lowasp/sat/agoat/MainActivity;->findViewById(I)Landroid/view/View;

    move-result-object v6

    check-cast v6, Landroid/widget/Button;

    .line 45
    .local v6, "hardcode":Landroid/widget/Button;
    new-instance v7, Lowasp/sat/agoat/MainActivity$$ExternalSyntheticLambda6;

    invoke-direct {v7, p0}, Lowasp/sat/agoat/MainActivity$$ExternalSyntheticLambda6;-><init>(Lowasp/sat/agoat/MainActivity;)V

    invoke-virtual {v6, v7}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 49
    sget v7, Lowasp/sat/agoat/R$id;->Traffic:I

    invoke-virtual {p0, v7}, Lowasp/sat/agoat/MainActivity;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Landroid/widget/Button;

    .line 50
    .local v7, "traffic":Landroid/widget/Button;
    new-instance v8, Lowasp/sat/agoat/MainActivity$$ExternalSyntheticLambda7;

    invoke-direct {v8, p0}, Lowasp/sat/agoat/MainActivity$$ExternalSyntheticLambda7;-><init>(Lowasp/sat/agoat/MainActivity;)V

    invoke-virtual {v7, v8}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 54
    sget v8, Lowasp/sat/agoat/R$id;->BinaryPatching:I

    invoke-virtual {p0, v8}, Lowasp/sat/agoat/MainActivity;->findViewById(I)Landroid/view/View;

    move-result-object v8

    check-cast v8, Landroid/widget/Button;

    .line 55
    .local v8, "binaryPatching":Landroid/widget/Button;
    new-instance v9, Lowasp/sat/agoat/MainActivity$$ExternalSyntheticLambda8;

    invoke-direct {v9, p0}, Lowasp/sat/agoat/MainActivity$$ExternalSyntheticLambda8;-><init>(Lowasp/sat/agoat/MainActivity;)V

    invoke-virtual {v8, v9}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 59
    sget v9, Lowasp/sat/agoat/R$id;->bioauth1:I

    invoke-virtual {p0, v9}, Lowasp/sat/agoat/MainActivity;->findViewById(I)Landroid/view/View;

    move-result-object v9

    check-cast v9, Landroid/widget/Button;

    .line 60
    .local v9, "biopath":Landroid/widget/Button;
    new-instance v10, Lowasp/sat/agoat/MainActivity$$ExternalSyntheticLambda9;

    invoke-direct {v10, p0}, Lowasp/sat/agoat/MainActivity$$ExternalSyntheticLambda9;-><init>(Lowasp/sat/agoat/MainActivity;)V

    invoke-virtual {v9, v10}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 63
    return-void
.end method
