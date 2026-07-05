.class public final Lcom/stripe/android/link/ui/signup/SignUpScreenState;
.super Ljava/lang/Object;
.source "SignUpScreenState.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/link/ui/signup/SignUpScreenState$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0019\n\u0002\u0010\u0008\n\u0002\u0008\u0003\u0008\u0081\u0008\u0018\u0000 (2\u00020\u0001:\u0001(BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\t\u0012\u0008\u0008\u0002\u0010\n\u001a\u00020\u0005\u0012\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u000c\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\t\u0010\u001b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001c\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001d\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001e\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001f\u001a\u00020\tH\u00c6\u0003J\t\u0010 \u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u000cH\u00c6\u0003JQ\u0010\"\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0008\u001a\u00020\t2\u0008\u0008\u0002\u0010\n\u001a\u00020\u00052\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u000cH\u00c6\u0001J\u0013\u0010#\u001a\u00020\u00052\u0008\u0010$\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010%\u001a\u00020&H\u00d6\u0001J\t\u0010\'\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0014\u0010\u0012R\u0011\u0010\u0008\u001a\u00020\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0015\u0010\u0016R\u0011\u0010\n\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u0012R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u000c\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0017\u0010\u0018R\u0011\u0010\u0019\u001a\u00020\u00058F\u00a2\u0006\u0006\u001a\u0004\u0008\u001a\u0010\u0012\u00a8\u0006)"
    }
    d2 = {
        "Lcom/stripe/android/link/ui/signup/SignUpScreenState;",
        "",
        "merchantName",
        "",
        "signUpEnabled",
        "",
        "requiresNameCollection",
        "canEditEmail",
        "signUpState",
        "Lcom/stripe/android/link/ui/signup/SignUpState;",
        "isSubmitting",
        "errorMessage",
        "Lcom/stripe/android/core/strings/ResolvableString;",
        "<init>",
        "(Ljava/lang/String;ZZZLcom/stripe/android/link/ui/signup/SignUpState;ZLcom/stripe/android/core/strings/ResolvableString;)V",
        "getMerchantName",
        "()Ljava/lang/String;",
        "getSignUpEnabled",
        "()Z",
        "getRequiresNameCollection",
        "getCanEditEmail",
        "getSignUpState",
        "()Lcom/stripe/android/link/ui/signup/SignUpState;",
        "getErrorMessage",
        "()Lcom/stripe/android/core/strings/ResolvableString;",
        "canEditForm",
        "getCanEditForm",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "copy",
        "equals",
        "other",
        "hashCode",
        "",
        "toString",
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

.field public static final Companion:Lcom/stripe/android/link/ui/signup/SignUpScreenState$Companion;


# instance fields
.field private final canEditEmail:Z

.field private final errorMessage:Lcom/stripe/android/core/strings/ResolvableString;

.field private final isSubmitting:Z

.field private final merchantName:Ljava/lang/String;

.field private final requiresNameCollection:Z

.field private final signUpEnabled:Z

.field private final signUpState:Lcom/stripe/android/link/ui/signup/SignUpState;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/link/ui/signup/SignUpScreenState$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/link/ui/signup/SignUpScreenState$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/link/ui/signup/SignUpScreenState;->Companion:Lcom/stripe/android/link/ui/signup/SignUpScreenState$Companion;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ZZZLcom/stripe/android/link/ui/signup/SignUpState;ZLcom/stripe/android/core/strings/ResolvableString;)V
    .locals 1

    const-string v0, "merchantName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "signUpState"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    iput-object p1, p0, Lcom/stripe/android/link/ui/signup/SignUpScreenState;->merchantName:Ljava/lang/String;

    .line 13
    iput-boolean p2, p0, Lcom/stripe/android/link/ui/signup/SignUpScreenState;->signUpEnabled:Z

    .line 14
    iput-boolean p3, p0, Lcom/stripe/android/link/ui/signup/SignUpScreenState;->requiresNameCollection:Z

    .line 15
    iput-boolean p4, p0, Lcom/stripe/android/link/ui/signup/SignUpScreenState;->canEditEmail:Z

    .line 16
    iput-object p5, p0, Lcom/stripe/android/link/ui/signup/SignUpScreenState;->signUpState:Lcom/stripe/android/link/ui/signup/SignUpState;

    .line 17
    iput-boolean p6, p0, Lcom/stripe/android/link/ui/signup/SignUpScreenState;->isSubmitting:Z

    .line 18
    iput-object p7, p0, Lcom/stripe/android/link/ui/signup/SignUpScreenState;->errorMessage:Lcom/stripe/android/core/strings/ResolvableString;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;ZZZLcom/stripe/android/link/ui/signup/SignUpState;ZLcom/stripe/android/core/strings/ResolvableString;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 8

    and-int/lit8 v0, p8, 0x10

    if-eqz v0, :cond_0

    .line 16
    sget-object p5, Lcom/stripe/android/link/ui/signup/SignUpState;->InputtingPrimaryField:Lcom/stripe/android/link/ui/signup/SignUpState;

    :cond_0
    move-object v5, p5

    and-int/lit8 p5, p8, 0x20

    if-eqz p5, :cond_1

    const/4 p6, 0x0

    :cond_1
    move v6, p6

    and-int/lit8 p5, p8, 0x40

    if-eqz p5, :cond_2

    const/4 p5, 0x0

    move-object v7, p5

    goto :goto_0

    :cond_2
    move-object v7, p7

    :goto_0
    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    .line 11
    invoke-direct/range {v0 .. v7}, Lcom/stripe/android/link/ui/signup/SignUpScreenState;-><init>(Ljava/lang/String;ZZZLcom/stripe/android/link/ui/signup/SignUpState;ZLcom/stripe/android/core/strings/ResolvableString;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/stripe/android/link/ui/signup/SignUpScreenState;Ljava/lang/String;ZZZLcom/stripe/android/link/ui/signup/SignUpState;ZLcom/stripe/android/core/strings/ResolvableString;ILjava/lang/Object;)Lcom/stripe/android/link/ui/signup/SignUpScreenState;
    .locals 0

    and-int/lit8 p9, p8, 0x1

    if-eqz p9, :cond_0

    iget-object p1, p0, Lcom/stripe/android/link/ui/signup/SignUpScreenState;->merchantName:Ljava/lang/String;

    :cond_0
    and-int/lit8 p9, p8, 0x2

    if-eqz p9, :cond_1

    iget-boolean p2, p0, Lcom/stripe/android/link/ui/signup/SignUpScreenState;->signUpEnabled:Z

    :cond_1
    and-int/lit8 p9, p8, 0x4

    if-eqz p9, :cond_2

    iget-boolean p3, p0, Lcom/stripe/android/link/ui/signup/SignUpScreenState;->requiresNameCollection:Z

    :cond_2
    and-int/lit8 p9, p8, 0x8

    if-eqz p9, :cond_3

    iget-boolean p4, p0, Lcom/stripe/android/link/ui/signup/SignUpScreenState;->canEditEmail:Z

    :cond_3
    and-int/lit8 p9, p8, 0x10

    if-eqz p9, :cond_4

    iget-object p5, p0, Lcom/stripe/android/link/ui/signup/SignUpScreenState;->signUpState:Lcom/stripe/android/link/ui/signup/SignUpState;

    :cond_4
    and-int/lit8 p9, p8, 0x20

    if-eqz p9, :cond_5

    iget-boolean p6, p0, Lcom/stripe/android/link/ui/signup/SignUpScreenState;->isSubmitting:Z

    :cond_5
    and-int/lit8 p8, p8, 0x40

    if-eqz p8, :cond_6

    iget-object p7, p0, Lcom/stripe/android/link/ui/signup/SignUpScreenState;->errorMessage:Lcom/stripe/android/core/strings/ResolvableString;

    :cond_6
    move p8, p6

    move-object p9, p7

    move p6, p4

    move-object p7, p5

    move p4, p2

    move p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p9}, Lcom/stripe/android/link/ui/signup/SignUpScreenState;->copy(Ljava/lang/String;ZZZLcom/stripe/android/link/ui/signup/SignUpState;ZLcom/stripe/android/core/strings/ResolvableString;)Lcom/stripe/android/link/ui/signup/SignUpScreenState;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/link/ui/signup/SignUpScreenState;->merchantName:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/link/ui/signup/SignUpScreenState;->signUpEnabled:Z

    return v0
.end method

.method public final component3()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/link/ui/signup/SignUpScreenState;->requiresNameCollection:Z

    return v0
.end method

.method public final component4()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/link/ui/signup/SignUpScreenState;->canEditEmail:Z

    return v0
.end method

.method public final component5()Lcom/stripe/android/link/ui/signup/SignUpState;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/link/ui/signup/SignUpScreenState;->signUpState:Lcom/stripe/android/link/ui/signup/SignUpState;

    return-object v0
.end method

.method public final component6()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/link/ui/signup/SignUpScreenState;->isSubmitting:Z

    return v0
.end method

.method public final component7()Lcom/stripe/android/core/strings/ResolvableString;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/link/ui/signup/SignUpScreenState;->errorMessage:Lcom/stripe/android/core/strings/ResolvableString;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;ZZZLcom/stripe/android/link/ui/signup/SignUpState;ZLcom/stripe/android/core/strings/ResolvableString;)Lcom/stripe/android/link/ui/signup/SignUpScreenState;
    .locals 9

    const-string v0, "merchantName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "signUpState"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/stripe/android/link/ui/signup/SignUpScreenState;

    move-object v2, p1

    move v3, p2

    move v4, p3

    move v5, p4

    move-object v6, p5

    move v7, p6

    move-object/from16 v8, p7

    invoke-direct/range {v1 .. v8}, Lcom/stripe/android/link/ui/signup/SignUpScreenState;-><init>(Ljava/lang/String;ZZZLcom/stripe/android/link/ui/signup/SignUpState;ZLcom/stripe/android/core/strings/ResolvableString;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/stripe/android/link/ui/signup/SignUpScreenState;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/link/ui/signup/SignUpScreenState;

    iget-object v1, p0, Lcom/stripe/android/link/ui/signup/SignUpScreenState;->merchantName:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/link/ui/signup/SignUpScreenState;->merchantName:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-boolean v1, p0, Lcom/stripe/android/link/ui/signup/SignUpScreenState;->signUpEnabled:Z

    iget-boolean v3, p1, Lcom/stripe/android/link/ui/signup/SignUpScreenState;->signUpEnabled:Z

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Lcom/stripe/android/link/ui/signup/SignUpScreenState;->requiresNameCollection:Z

    iget-boolean v3, p1, Lcom/stripe/android/link/ui/signup/SignUpScreenState;->requiresNameCollection:Z

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-boolean v1, p0, Lcom/stripe/android/link/ui/signup/SignUpScreenState;->canEditEmail:Z

    iget-boolean v3, p1, Lcom/stripe/android/link/ui/signup/SignUpScreenState;->canEditEmail:Z

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/stripe/android/link/ui/signup/SignUpScreenState;->signUpState:Lcom/stripe/android/link/ui/signup/SignUpState;

    iget-object v3, p1, Lcom/stripe/android/link/ui/signup/SignUpScreenState;->signUpState:Lcom/stripe/android/link/ui/signup/SignUpState;

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-boolean v1, p0, Lcom/stripe/android/link/ui/signup/SignUpScreenState;->isSubmitting:Z

    iget-boolean v3, p1, Lcom/stripe/android/link/ui/signup/SignUpScreenState;->isSubmitting:Z

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/stripe/android/link/ui/signup/SignUpScreenState;->errorMessage:Lcom/stripe/android/core/strings/ResolvableString;

    iget-object p1, p1, Lcom/stripe/android/link/ui/signup/SignUpScreenState;->errorMessage:Lcom/stripe/android/core/strings/ResolvableString;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    return v2

    :cond_8
    return v0
.end method

.method public final getCanEditEmail()Z
    .locals 1

    .line 15
    iget-boolean v0, p0, Lcom/stripe/android/link/ui/signup/SignUpScreenState;->canEditEmail:Z

    return v0
.end method

.method public final getCanEditForm()Z
    .locals 1

    .line 21
    iget-boolean v0, p0, Lcom/stripe/android/link/ui/signup/SignUpScreenState;->isSubmitting:Z

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public final getErrorMessage()Lcom/stripe/android/core/strings/ResolvableString;
    .locals 1

    .line 18
    iget-object v0, p0, Lcom/stripe/android/link/ui/signup/SignUpScreenState;->errorMessage:Lcom/stripe/android/core/strings/ResolvableString;

    return-object v0
.end method

.method public final getMerchantName()Ljava/lang/String;
    .locals 1

    .line 12
    iget-object v0, p0, Lcom/stripe/android/link/ui/signup/SignUpScreenState;->merchantName:Ljava/lang/String;

    return-object v0
.end method

.method public final getRequiresNameCollection()Z
    .locals 1

    .line 14
    iget-boolean v0, p0, Lcom/stripe/android/link/ui/signup/SignUpScreenState;->requiresNameCollection:Z

    return v0
.end method

.method public final getSignUpEnabled()Z
    .locals 1

    .line 13
    iget-boolean v0, p0, Lcom/stripe/android/link/ui/signup/SignUpScreenState;->signUpEnabled:Z

    return v0
.end method

.method public final getSignUpState()Lcom/stripe/android/link/ui/signup/SignUpState;
    .locals 1

    .line 16
    iget-object v0, p0, Lcom/stripe/android/link/ui/signup/SignUpScreenState;->signUpState:Lcom/stripe/android/link/ui/signup/SignUpState;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/stripe/android/link/ui/signup/SignUpScreenState;->merchantName:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/stripe/android/link/ui/signup/SignUpScreenState;->signUpEnabled:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/stripe/android/link/ui/signup/SignUpScreenState;->requiresNameCollection:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/stripe/android/link/ui/signup/SignUpScreenState;->canEditEmail:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/link/ui/signup/SignUpScreenState;->signUpState:Lcom/stripe/android/link/ui/signup/SignUpState;

    invoke-virtual {v1}, Lcom/stripe/android/link/ui/signup/SignUpState;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/stripe/android/link/ui/signup/SignUpScreenState;->isSubmitting:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/link/ui/signup/SignUpScreenState;->errorMessage:Lcom/stripe/android/core/strings/ResolvableString;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    return v0
.end method

.method public final isSubmitting()Z
    .locals 1

    .line 17
    iget-boolean v0, p0, Lcom/stripe/android/link/ui/signup/SignUpScreenState;->isSubmitting:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 9

    iget-object v0, p0, Lcom/stripe/android/link/ui/signup/SignUpScreenState;->merchantName:Ljava/lang/String;

    iget-boolean v1, p0, Lcom/stripe/android/link/ui/signup/SignUpScreenState;->signUpEnabled:Z

    iget-boolean v2, p0, Lcom/stripe/android/link/ui/signup/SignUpScreenState;->requiresNameCollection:Z

    iget-boolean v3, p0, Lcom/stripe/android/link/ui/signup/SignUpScreenState;->canEditEmail:Z

    iget-object v4, p0, Lcom/stripe/android/link/ui/signup/SignUpScreenState;->signUpState:Lcom/stripe/android/link/ui/signup/SignUpState;

    iget-boolean v5, p0, Lcom/stripe/android/link/ui/signup/SignUpScreenState;->isSubmitting:Z

    iget-object v6, p0, Lcom/stripe/android/link/ui/signup/SignUpScreenState;->errorMessage:Lcom/stripe/android/core/strings/ResolvableString;

    new-instance v7, Ljava/lang/StringBuilder;

    const-string v8, "SignUpScreenState(merchantName="

    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v7, ", signUpEnabled="

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", requiresNameCollection="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", canEditEmail="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", signUpState="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", isSubmitting="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", errorMessage="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
