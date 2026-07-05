.class public final Lcom/stripe/android/financialconnections/ui/sdui/BulletUI$Companion;
.super Ljava/lang/Object;
.source "ServerDrivenUi.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/financialconnections/ui/sdui/BulletUI;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nServerDrivenUi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ServerDrivenUi.kt\ncom/stripe/android/financialconnections/ui/sdui/BulletUI$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,47:1\n1#2:48\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/ui/sdui/BulletUI$Companion;",
        "",
        "<init>",
        "()V",
        "from",
        "Lcom/stripe/android/financialconnections/ui/sdui/BulletUI;",
        "bullet",
        "Lcom/stripe/android/financialconnections/model/Bullet;",
        "LFinancialConnectionsGenericInfoScreen$Body$Entry$Bullets$GenericBulletPoint;",
        "financial-connections_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lcom/stripe/android/financialconnections/ui/sdui/BulletUI$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final from(LFinancialConnectionsGenericInfoScreen$Body$Entry$Bullets$GenericBulletPoint;)Lcom/stripe/android/financialconnections/ui/sdui/BulletUI;
    .locals 4

    const-string v0, "bullet"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    invoke-virtual {p1}, LFinancialConnectionsGenericInfoScreen$Body$Entry$Bullets$GenericBulletPoint;->getIcon()Lcom/stripe/android/financialconnections/model/Image;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/model/Image;->getDefault()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    new-instance v2, Lcom/stripe/android/financialconnections/ui/ImageResource$Network;

    invoke-direct {v2, v0}, Lcom/stripe/android/financialconnections/ui/ImageResource$Network;-><init>(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    move-object v2, v1

    .line 30
    :goto_0
    invoke-virtual {p1}, LFinancialConnectionsGenericInfoScreen$Body$Entry$Bullets$GenericBulletPoint;->getTitle()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    new-instance v3, Lcom/stripe/android/financialconnections/ui/TextResource$Text;

    invoke-static {v0}, Lcom/stripe/android/financialconnections/ui/sdui/ServerDrivenUiKt;->fromHtml(Ljava/lang/String;)Landroid/text/Spanned;

    move-result-object v0

    check-cast v0, Ljava/lang/CharSequence;

    invoke-direct {v3, v0}, Lcom/stripe/android/financialconnections/ui/TextResource$Text;-><init>(Ljava/lang/CharSequence;)V

    goto :goto_1

    :cond_1
    move-object v3, v1

    .line 31
    :goto_1
    invoke-virtual {p1}, LFinancialConnectionsGenericInfoScreen$Body$Entry$Bullets$GenericBulletPoint;->getContent()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_2

    new-instance v1, Lcom/stripe/android/financialconnections/ui/TextResource$Text;

    invoke-static {p1}, Lcom/stripe/android/financialconnections/ui/sdui/ServerDrivenUiKt;->fromHtml(Ljava/lang/String;)Landroid/text/Spanned;

    move-result-object p1

    check-cast p1, Ljava/lang/CharSequence;

    invoke-direct {v1, p1}, Lcom/stripe/android/financialconnections/ui/TextResource$Text;-><init>(Ljava/lang/CharSequence;)V

    .line 28
    :cond_2
    new-instance p1, Lcom/stripe/android/financialconnections/ui/sdui/BulletUI;

    .line 30
    check-cast v3, Lcom/stripe/android/financialconnections/ui/TextResource;

    .line 31
    check-cast v1, Lcom/stripe/android/financialconnections/ui/TextResource;

    .line 29
    check-cast v2, Lcom/stripe/android/financialconnections/ui/ImageResource;

    .line 28
    invoke-direct {p1, v3, v1, v2}, Lcom/stripe/android/financialconnections/ui/sdui/BulletUI;-><init>(Lcom/stripe/android/financialconnections/ui/TextResource;Lcom/stripe/android/financialconnections/ui/TextResource;Lcom/stripe/android/financialconnections/ui/ImageResource;)V

    return-object p1
.end method

.method public final from(Lcom/stripe/android/financialconnections/model/Bullet;)Lcom/stripe/android/financialconnections/ui/sdui/BulletUI;
    .locals 4

    const-string v0, "bullet"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/model/Bullet;->getIcon()Lcom/stripe/android/financialconnections/model/Image;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/model/Image;->getDefault()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    new-instance v2, Lcom/stripe/android/financialconnections/ui/ImageResource$Network;

    invoke-direct {v2, v0}, Lcom/stripe/android/financialconnections/ui/ImageResource$Network;-><init>(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    move-object v2, v1

    .line 24
    :goto_0
    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/model/Bullet;->getTitle()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    new-instance v3, Lcom/stripe/android/financialconnections/ui/TextResource$Text;

    invoke-static {v0}, Lcom/stripe/android/financialconnections/ui/sdui/ServerDrivenUiKt;->fromHtml(Ljava/lang/String;)Landroid/text/Spanned;

    move-result-object v0

    check-cast v0, Ljava/lang/CharSequence;

    invoke-direct {v3, v0}, Lcom/stripe/android/financialconnections/ui/TextResource$Text;-><init>(Ljava/lang/CharSequence;)V

    goto :goto_1

    :cond_1
    move-object v3, v1

    .line 25
    :goto_1
    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/model/Bullet;->getContent()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_2

    new-instance v1, Lcom/stripe/android/financialconnections/ui/TextResource$Text;

    invoke-static {p1}, Lcom/stripe/android/financialconnections/ui/sdui/ServerDrivenUiKt;->fromHtml(Ljava/lang/String;)Landroid/text/Spanned;

    move-result-object p1

    check-cast p1, Ljava/lang/CharSequence;

    invoke-direct {v1, p1}, Lcom/stripe/android/financialconnections/ui/TextResource$Text;-><init>(Ljava/lang/CharSequence;)V

    .line 22
    :cond_2
    new-instance p1, Lcom/stripe/android/financialconnections/ui/sdui/BulletUI;

    .line 24
    check-cast v3, Lcom/stripe/android/financialconnections/ui/TextResource;

    .line 25
    check-cast v1, Lcom/stripe/android/financialconnections/ui/TextResource;

    .line 23
    check-cast v2, Lcom/stripe/android/financialconnections/ui/ImageResource;

    .line 22
    invoke-direct {p1, v3, v1, v2}, Lcom/stripe/android/financialconnections/ui/sdui/BulletUI;-><init>(Lcom/stripe/android/financialconnections/ui/TextResource;Lcom/stripe/android/financialconnections/ui/TextResource;Lcom/stripe/android/financialconnections/ui/ImageResource;)V

    return-object p1
.end method
