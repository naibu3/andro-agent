.class final Lcom/stripe/android/payments/core/authentication/WebAuthParams;
.super Ljava/lang/Object;
.source "WebIntentNextActionHandler.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0017\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0082\u0008\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0006H\u00c6\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\u0006H\u00c6\u0003JI\u0010\u001a\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00062\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u00032\u0008\u0008\u0002\u0010\t\u001a\u00020\u0006H\u00c6\u0001J\u0013\u0010\u001b\u001a\u00020\u00062\u0008\u0010\u001c\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001d\u001a\u00020\u001eH\u00d6\u0001J\t\u0010\u001f\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\u0010R\u0013\u0010\u0008\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\rR\u0011\u0010\t\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u0010\u00a8\u0006 "
    }
    d2 = {
        "Lcom/stripe/android/payments/core/authentication/WebAuthParams;",
        "",
        "authUrl",
        "",
        "returnUrl",
        "shouldCancelSource",
        "",
        "shouldCancelIntentOnUserNavigation",
        "referrer",
        "forceInAppWebView",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Z)V",
        "getAuthUrl",
        "()Ljava/lang/String;",
        "getReturnUrl",
        "getShouldCancelSource",
        "()Z",
        "getShouldCancelIntentOnUserNavigation",
        "getReferrer",
        "getForceInAppWebView",
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
        "",
        "toString",
        "payments-core_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final authUrl:Ljava/lang/String;

.field private final forceInAppWebView:Z

.field private final referrer:Ljava/lang/String;

.field private final returnUrl:Ljava/lang/String;

.field private final shouldCancelIntentOnUserNavigation:Z

.field private final shouldCancelSource:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Z)V
    .locals 1

    const-string v0, "authUrl"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 208
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 209
    iput-object p1, p0, Lcom/stripe/android/payments/core/authentication/WebAuthParams;->authUrl:Ljava/lang/String;

    .line 210
    iput-object p2, p0, Lcom/stripe/android/payments/core/authentication/WebAuthParams;->returnUrl:Ljava/lang/String;

    .line 211
    iput-boolean p3, p0, Lcom/stripe/android/payments/core/authentication/WebAuthParams;->shouldCancelSource:Z

    .line 212
    iput-boolean p4, p0, Lcom/stripe/android/payments/core/authentication/WebAuthParams;->shouldCancelIntentOnUserNavigation:Z

    .line 213
    iput-object p5, p0, Lcom/stripe/android/payments/core/authentication/WebAuthParams;->referrer:Ljava/lang/String;

    .line 214
    iput-boolean p6, p0, Lcom/stripe/android/payments/core/authentication/WebAuthParams;->forceInAppWebView:Z

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p8, p7, 0x4

    const/4 v0, 0x0

    if-eqz p8, :cond_0

    move p3, v0

    :cond_0
    and-int/lit8 p8, p7, 0x8

    if-eqz p8, :cond_1

    const/4 p4, 0x1

    :cond_1
    and-int/lit8 p8, p7, 0x10

    if-eqz p8, :cond_2

    const/4 p5, 0x0

    :cond_2
    and-int/lit8 p7, p7, 0x20

    if-eqz p7, :cond_3

    move p7, v0

    goto :goto_0

    :cond_3
    move p7, p6

    :goto_0
    move-object p6, p5

    move p5, p4

    move p4, p3

    move-object p3, p2

    move-object p2, p1

    move-object p1, p0

    .line 208
    invoke-direct/range {p1 .. p7}, Lcom/stripe/android/payments/core/authentication/WebAuthParams;-><init>(Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Z)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/stripe/android/payments/core/authentication/WebAuthParams;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;ZILjava/lang/Object;)Lcom/stripe/android/payments/core/authentication/WebAuthParams;
    .locals 0

    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    iget-object p1, p0, Lcom/stripe/android/payments/core/authentication/WebAuthParams;->authUrl:Ljava/lang/String;

    :cond_0
    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_1

    iget-object p2, p0, Lcom/stripe/android/payments/core/authentication/WebAuthParams;->returnUrl:Ljava/lang/String;

    :cond_1
    and-int/lit8 p8, p7, 0x4

    if-eqz p8, :cond_2

    iget-boolean p3, p0, Lcom/stripe/android/payments/core/authentication/WebAuthParams;->shouldCancelSource:Z

    :cond_2
    and-int/lit8 p8, p7, 0x8

    if-eqz p8, :cond_3

    iget-boolean p4, p0, Lcom/stripe/android/payments/core/authentication/WebAuthParams;->shouldCancelIntentOnUserNavigation:Z

    :cond_3
    and-int/lit8 p8, p7, 0x10

    if-eqz p8, :cond_4

    iget-object p5, p0, Lcom/stripe/android/payments/core/authentication/WebAuthParams;->referrer:Ljava/lang/String;

    :cond_4
    and-int/lit8 p7, p7, 0x20

    if-eqz p7, :cond_5

    iget-boolean p6, p0, Lcom/stripe/android/payments/core/authentication/WebAuthParams;->forceInAppWebView:Z

    :cond_5
    move-object p7, p5

    move p8, p6

    move p5, p3

    move p6, p4

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p8}, Lcom/stripe/android/payments/core/authentication/WebAuthParams;->copy(Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Z)Lcom/stripe/android/payments/core/authentication/WebAuthParams;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/payments/core/authentication/WebAuthParams;->authUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/payments/core/authentication/WebAuthParams;->returnUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/payments/core/authentication/WebAuthParams;->shouldCancelSource:Z

    return v0
.end method

.method public final component4()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/payments/core/authentication/WebAuthParams;->shouldCancelIntentOnUserNavigation:Z

    return v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/payments/core/authentication/WebAuthParams;->referrer:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/payments/core/authentication/WebAuthParams;->forceInAppWebView:Z

    return v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Z)Lcom/stripe/android/payments/core/authentication/WebAuthParams;
    .locals 8

    const-string v0, "authUrl"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/stripe/android/payments/core/authentication/WebAuthParams;

    move-object v2, p1

    move-object v3, p2

    move v4, p3

    move v5, p4

    move-object v6, p5

    move v7, p6

    invoke-direct/range {v1 .. v7}, Lcom/stripe/android/payments/core/authentication/WebAuthParams;-><init>(Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Z)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/stripe/android/payments/core/authentication/WebAuthParams;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/payments/core/authentication/WebAuthParams;

    iget-object v1, p0, Lcom/stripe/android/payments/core/authentication/WebAuthParams;->authUrl:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/payments/core/authentication/WebAuthParams;->authUrl:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/stripe/android/payments/core/authentication/WebAuthParams;->returnUrl:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/payments/core/authentication/WebAuthParams;->returnUrl:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Lcom/stripe/android/payments/core/authentication/WebAuthParams;->shouldCancelSource:Z

    iget-boolean v3, p1, Lcom/stripe/android/payments/core/authentication/WebAuthParams;->shouldCancelSource:Z

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-boolean v1, p0, Lcom/stripe/android/payments/core/authentication/WebAuthParams;->shouldCancelIntentOnUserNavigation:Z

    iget-boolean v3, p1, Lcom/stripe/android/payments/core/authentication/WebAuthParams;->shouldCancelIntentOnUserNavigation:Z

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/stripe/android/payments/core/authentication/WebAuthParams;->referrer:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/payments/core/authentication/WebAuthParams;->referrer:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-boolean v1, p0, Lcom/stripe/android/payments/core/authentication/WebAuthParams;->forceInAppWebView:Z

    iget-boolean p1, p1, Lcom/stripe/android/payments/core/authentication/WebAuthParams;->forceInAppWebView:Z

    if-eq v1, p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public final getAuthUrl()Ljava/lang/String;
    .locals 1

    .line 209
    iget-object v0, p0, Lcom/stripe/android/payments/core/authentication/WebAuthParams;->authUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final getForceInAppWebView()Z
    .locals 1

    .line 214
    iget-boolean v0, p0, Lcom/stripe/android/payments/core/authentication/WebAuthParams;->forceInAppWebView:Z

    return v0
.end method

.method public final getReferrer()Ljava/lang/String;
    .locals 1

    .line 213
    iget-object v0, p0, Lcom/stripe/android/payments/core/authentication/WebAuthParams;->referrer:Ljava/lang/String;

    return-object v0
.end method

.method public final getReturnUrl()Ljava/lang/String;
    .locals 1

    .line 210
    iget-object v0, p0, Lcom/stripe/android/payments/core/authentication/WebAuthParams;->returnUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final getShouldCancelIntentOnUserNavigation()Z
    .locals 1

    .line 212
    iget-boolean v0, p0, Lcom/stripe/android/payments/core/authentication/WebAuthParams;->shouldCancelIntentOnUserNavigation:Z

    return v0
.end method

.method public final getShouldCancelSource()Z
    .locals 1

    .line 211
    iget-boolean v0, p0, Lcom/stripe/android/payments/core/authentication/WebAuthParams;->shouldCancelSource:Z

    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/stripe/android/payments/core/authentication/WebAuthParams;->authUrl:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/payments/core/authentication/WebAuthParams;->returnUrl:Ljava/lang/String;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/stripe/android/payments/core/authentication/WebAuthParams;->shouldCancelSource:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/stripe/android/payments/core/authentication/WebAuthParams;->shouldCancelIntentOnUserNavigation:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/payments/core/authentication/WebAuthParams;->referrer:Ljava/lang/String;

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/stripe/android/payments/core/authentication/WebAuthParams;->forceInAppWebView:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 8

    iget-object v0, p0, Lcom/stripe/android/payments/core/authentication/WebAuthParams;->authUrl:Ljava/lang/String;

    iget-object v1, p0, Lcom/stripe/android/payments/core/authentication/WebAuthParams;->returnUrl:Ljava/lang/String;

    iget-boolean v2, p0, Lcom/stripe/android/payments/core/authentication/WebAuthParams;->shouldCancelSource:Z

    iget-boolean v3, p0, Lcom/stripe/android/payments/core/authentication/WebAuthParams;->shouldCancelIntentOnUserNavigation:Z

    iget-object v4, p0, Lcom/stripe/android/payments/core/authentication/WebAuthParams;->referrer:Ljava/lang/String;

    iget-boolean v5, p0, Lcom/stripe/android/payments/core/authentication/WebAuthParams;->forceInAppWebView:Z

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "WebAuthParams(authUrl="

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v6, ", returnUrl="

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", shouldCancelSource="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", shouldCancelIntentOnUserNavigation="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", referrer="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", forceInAppWebView="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
