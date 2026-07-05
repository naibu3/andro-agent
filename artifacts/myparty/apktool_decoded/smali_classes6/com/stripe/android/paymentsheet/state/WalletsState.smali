.class public final Lcom/stripe/android/paymentsheet/state/WalletsState;
.super Ljava/lang/Object;
.source "WalletsState.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/paymentsheet/state/WalletsState$Companion;,
        Lcom/stripe/android/paymentsheet/state/WalletsState$GooglePay;,
        Lcom/stripe/android/paymentsheet/state/WalletsState$Link;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0019\n\u0002\u0010\u000e\n\u0002\u0008\u0004\u0008\u0081\u0008\u0018\u0000 )2\u00020\u0001:\u0003\'()BI\u0012\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0008\u0008\u0001\u0010\u0008\u001a\u00020\t\u0012\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000b\u0012\u000c\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000b\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\t\u0010\u001d\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u001e\u001a\u00020\tH\u00c6\u0003J\u000f\u0010\u001f\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000bH\u00c6\u0003J\u000f\u0010 \u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000bH\u00c6\u0003JU\u0010!\u001a\u00020\u00002\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00072\u0008\u0008\u0003\u0010\u0008\u001a\u00020\t2\u000e\u0008\u0002\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000b2\u000e\u0008\u0002\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000bH\u00c6\u0001J\u0013\u0010\"\u001a\u00020\u00072\u0008\u0010#\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010$\u001a\u00020\tH\u00d6\u0001J\t\u0010%\u001a\u00020&H\u00d6\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0014\u0010\u0015R\u0011\u0010\u0008\u001a\u00020\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0016\u0010\u0017R\u0017\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000b\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0018\u0010\u0019R\u0017\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000b\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001a\u0010\u0019\u00a8\u0006*"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/state/WalletsState;",
        "",
        "link",
        "Lcom/stripe/android/paymentsheet/state/WalletsState$Link;",
        "googlePay",
        "Lcom/stripe/android/paymentsheet/state/WalletsState$GooglePay;",
        "buttonsEnabled",
        "",
        "dividerTextResource",
        "",
        "onGooglePayPressed",
        "Lkotlin/Function0;",
        "",
        "onLinkPressed",
        "<init>",
        "(Lcom/stripe/android/paymentsheet/state/WalletsState$Link;Lcom/stripe/android/paymentsheet/state/WalletsState$GooglePay;ZILkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V",
        "getLink",
        "()Lcom/stripe/android/paymentsheet/state/WalletsState$Link;",
        "getGooglePay",
        "()Lcom/stripe/android/paymentsheet/state/WalletsState$GooglePay;",
        "getButtonsEnabled",
        "()Z",
        "getDividerTextResource",
        "()I",
        "getOnGooglePayPressed",
        "()Lkotlin/jvm/functions/Function0;",
        "getOnLinkPressed",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "copy",
        "equals",
        "other",
        "hashCode",
        "toString",
        "",
        "Link",
        "GooglePay",
        "Companion",
        "paymentsheet_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final $stable:I

.field public static final Companion:Lcom/stripe/android/paymentsheet/state/WalletsState$Companion;


# instance fields
.field private final buttonsEnabled:Z

.field private final dividerTextResource:I

.field private final googlePay:Lcom/stripe/android/paymentsheet/state/WalletsState$GooglePay;

.field private final link:Lcom/stripe/android/paymentsheet/state/WalletsState$Link;

.field private final onGooglePayPressed:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field private final onLinkPressed:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/paymentsheet/state/WalletsState$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/paymentsheet/state/WalletsState$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/paymentsheet/state/WalletsState;->Companion:Lcom/stripe/android/paymentsheet/state/WalletsState$Companion;

    sget v0, Lcom/stripe/android/GooglePayJsonFactory$BillingAddressParameters;->$stable:I

    sput v0, Lcom/stripe/android/paymentsheet/state/WalletsState;->$stable:I

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/paymentsheet/state/WalletsState$Link;Lcom/stripe/android/paymentsheet/state/WalletsState$GooglePay;ZILkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/paymentsheet/state/WalletsState$Link;",
            "Lcom/stripe/android/paymentsheet/state/WalletsState$GooglePay;",
            "ZI",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const-string v0, "onGooglePayPressed"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onLinkPressed"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    iput-object p1, p0, Lcom/stripe/android/paymentsheet/state/WalletsState;->link:Lcom/stripe/android/paymentsheet/state/WalletsState$Link;

    .line 14
    iput-object p2, p0, Lcom/stripe/android/paymentsheet/state/WalletsState;->googlePay:Lcom/stripe/android/paymentsheet/state/WalletsState$GooglePay;

    .line 15
    iput-boolean p3, p0, Lcom/stripe/android/paymentsheet/state/WalletsState;->buttonsEnabled:Z

    .line 16
    iput p4, p0, Lcom/stripe/android/paymentsheet/state/WalletsState;->dividerTextResource:I

    .line 17
    iput-object p5, p0, Lcom/stripe/android/paymentsheet/state/WalletsState;->onGooglePayPressed:Lkotlin/jvm/functions/Function0;

    .line 18
    iput-object p6, p0, Lcom/stripe/android/paymentsheet/state/WalletsState;->onLinkPressed:Lkotlin/jvm/functions/Function0;

    return-void
.end method

.method public static synthetic copy$default(Lcom/stripe/android/paymentsheet/state/WalletsState;Lcom/stripe/android/paymentsheet/state/WalletsState$Link;Lcom/stripe/android/paymentsheet/state/WalletsState$GooglePay;ZILkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;ILjava/lang/Object;)Lcom/stripe/android/paymentsheet/state/WalletsState;
    .locals 0

    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    iget-object p1, p0, Lcom/stripe/android/paymentsheet/state/WalletsState;->link:Lcom/stripe/android/paymentsheet/state/WalletsState$Link;

    :cond_0
    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_1

    iget-object p2, p0, Lcom/stripe/android/paymentsheet/state/WalletsState;->googlePay:Lcom/stripe/android/paymentsheet/state/WalletsState$GooglePay;

    :cond_1
    and-int/lit8 p8, p7, 0x4

    if-eqz p8, :cond_2

    iget-boolean p3, p0, Lcom/stripe/android/paymentsheet/state/WalletsState;->buttonsEnabled:Z

    :cond_2
    and-int/lit8 p8, p7, 0x8

    if-eqz p8, :cond_3

    iget p4, p0, Lcom/stripe/android/paymentsheet/state/WalletsState;->dividerTextResource:I

    :cond_3
    and-int/lit8 p8, p7, 0x10

    if-eqz p8, :cond_4

    iget-object p5, p0, Lcom/stripe/android/paymentsheet/state/WalletsState;->onGooglePayPressed:Lkotlin/jvm/functions/Function0;

    :cond_4
    and-int/lit8 p7, p7, 0x20

    if-eqz p7, :cond_5

    iget-object p6, p0, Lcom/stripe/android/paymentsheet/state/WalletsState;->onLinkPressed:Lkotlin/jvm/functions/Function0;

    :cond_5
    move-object p7, p5

    move-object p8, p6

    move p5, p3

    move p6, p4

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p8}, Lcom/stripe/android/paymentsheet/state/WalletsState;->copy(Lcom/stripe/android/paymentsheet/state/WalletsState$Link;Lcom/stripe/android/paymentsheet/state/WalletsState$GooglePay;ZILkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Lcom/stripe/android/paymentsheet/state/WalletsState;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lcom/stripe/android/paymentsheet/state/WalletsState$Link;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/state/WalletsState;->link:Lcom/stripe/android/paymentsheet/state/WalletsState$Link;

    return-object v0
.end method

.method public final component2()Lcom/stripe/android/paymentsheet/state/WalletsState$GooglePay;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/state/WalletsState;->googlePay:Lcom/stripe/android/paymentsheet/state/WalletsState$GooglePay;

    return-object v0
.end method

.method public final component3()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/paymentsheet/state/WalletsState;->buttonsEnabled:Z

    return v0
.end method

.method public final component4()I
    .locals 1

    iget v0, p0, Lcom/stripe/android/paymentsheet/state/WalletsState;->dividerTextResource:I

    return v0
.end method

.method public final component5()Lkotlin/jvm/functions/Function0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/state/WalletsState;->onGooglePayPressed:Lkotlin/jvm/functions/Function0;

    return-object v0
.end method

.method public final component6()Lkotlin/jvm/functions/Function0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/state/WalletsState;->onLinkPressed:Lkotlin/jvm/functions/Function0;

    return-object v0
.end method

.method public final copy(Lcom/stripe/android/paymentsheet/state/WalletsState$Link;Lcom/stripe/android/paymentsheet/state/WalletsState$GooglePay;ZILkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Lcom/stripe/android/paymentsheet/state/WalletsState;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/paymentsheet/state/WalletsState$Link;",
            "Lcom/stripe/android/paymentsheet/state/WalletsState$GooglePay;",
            "ZI",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;)",
            "Lcom/stripe/android/paymentsheet/state/WalletsState;"
        }
    .end annotation

    const-string v0, "onGooglePayPressed"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onLinkPressed"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/stripe/android/paymentsheet/state/WalletsState;

    move-object v2, p1

    move-object v3, p2

    move v4, p3

    move v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v1 .. v7}, Lcom/stripe/android/paymentsheet/state/WalletsState;-><init>(Lcom/stripe/android/paymentsheet/state/WalletsState$Link;Lcom/stripe/android/paymentsheet/state/WalletsState$GooglePay;ZILkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/stripe/android/paymentsheet/state/WalletsState;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/paymentsheet/state/WalletsState;

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/state/WalletsState;->link:Lcom/stripe/android/paymentsheet/state/WalletsState$Link;

    iget-object v3, p1, Lcom/stripe/android/paymentsheet/state/WalletsState;->link:Lcom/stripe/android/paymentsheet/state/WalletsState$Link;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/stripe/android/paymentsheet/state/WalletsState;->googlePay:Lcom/stripe/android/paymentsheet/state/WalletsState$GooglePay;

    iget-object v3, p1, Lcom/stripe/android/paymentsheet/state/WalletsState;->googlePay:Lcom/stripe/android/paymentsheet/state/WalletsState$GooglePay;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Lcom/stripe/android/paymentsheet/state/WalletsState;->buttonsEnabled:Z

    iget-boolean v3, p1, Lcom/stripe/android/paymentsheet/state/WalletsState;->buttonsEnabled:Z

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lcom/stripe/android/paymentsheet/state/WalletsState;->dividerTextResource:I

    iget v3, p1, Lcom/stripe/android/paymentsheet/state/WalletsState;->dividerTextResource:I

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/stripe/android/paymentsheet/state/WalletsState;->onGooglePayPressed:Lkotlin/jvm/functions/Function0;

    iget-object v3, p1, Lcom/stripe/android/paymentsheet/state/WalletsState;->onGooglePayPressed:Lkotlin/jvm/functions/Function0;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/stripe/android/paymentsheet/state/WalletsState;->onLinkPressed:Lkotlin/jvm/functions/Function0;

    iget-object p1, p1, Lcom/stripe/android/paymentsheet/state/WalletsState;->onLinkPressed:Lkotlin/jvm/functions/Function0;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public final getButtonsEnabled()Z
    .locals 1

    .line 15
    iget-boolean v0, p0, Lcom/stripe/android/paymentsheet/state/WalletsState;->buttonsEnabled:Z

    return v0
.end method

.method public final getDividerTextResource()I
    .locals 1

    .line 16
    iget v0, p0, Lcom/stripe/android/paymentsheet/state/WalletsState;->dividerTextResource:I

    return v0
.end method

.method public final getGooglePay()Lcom/stripe/android/paymentsheet/state/WalletsState$GooglePay;
    .locals 1

    .line 14
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/state/WalletsState;->googlePay:Lcom/stripe/android/paymentsheet/state/WalletsState$GooglePay;

    return-object v0
.end method

.method public final getLink()Lcom/stripe/android/paymentsheet/state/WalletsState$Link;
    .locals 1

    .line 13
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/state/WalletsState;->link:Lcom/stripe/android/paymentsheet/state/WalletsState$Link;

    return-object v0
.end method

.method public final getOnGooglePayPressed()Lkotlin/jvm/functions/Function0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    .line 17
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/state/WalletsState;->onGooglePayPressed:Lkotlin/jvm/functions/Function0;

    return-object v0
.end method

.method public final getOnLinkPressed()Lkotlin/jvm/functions/Function0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    .line 18
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/state/WalletsState;->onLinkPressed:Lkotlin/jvm/functions/Function0;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/state/WalletsState;->link:Lcom/stripe/android/paymentsheet/state/WalletsState$Link;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/state/WalletsState$Link;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/stripe/android/paymentsheet/state/WalletsState;->googlePay:Lcom/stripe/android/paymentsheet/state/WalletsState$GooglePay;

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Lcom/stripe/android/paymentsheet/state/WalletsState$GooglePay;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/stripe/android/paymentsheet/state/WalletsState;->buttonsEnabled:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/stripe/android/paymentsheet/state/WalletsState;->dividerTextResource:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/state/WalletsState;->onGooglePayPressed:Lkotlin/jvm/functions/Function0;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/state/WalletsState;->onLinkPressed:Lkotlin/jvm/functions/Function0;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 8

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/state/WalletsState;->link:Lcom/stripe/android/paymentsheet/state/WalletsState$Link;

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/state/WalletsState;->googlePay:Lcom/stripe/android/paymentsheet/state/WalletsState$GooglePay;

    iget-boolean v2, p0, Lcom/stripe/android/paymentsheet/state/WalletsState;->buttonsEnabled:Z

    iget v3, p0, Lcom/stripe/android/paymentsheet/state/WalletsState;->dividerTextResource:I

    iget-object v4, p0, Lcom/stripe/android/paymentsheet/state/WalletsState;->onGooglePayPressed:Lkotlin/jvm/functions/Function0;

    iget-object v5, p0, Lcom/stripe/android/paymentsheet/state/WalletsState;->onLinkPressed:Lkotlin/jvm/functions/Function0;

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "WalletsState(link="

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v6, ", googlePay="

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", buttonsEnabled="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", dividerTextResource="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", onGooglePayPressed="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", onLinkPressed="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
