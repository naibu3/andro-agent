.class public final Lcom/stripe/hcaptcha/HCaptchaException;
.super Ljava/lang/Exception;
.source "HCaptchaException.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/hcaptcha/HCaptchaException$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\t\n\u0002\u0010\u0008\n\u0002\u0008\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0004\u0008\u0087\u0008\u0018\u0000 \u001c2\u00060\u0001j\u0002`\u0002:\u0001\u001cB\u001d\u0008\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\t\u0010\u0013\u001a\u00020\u0004H\u00c6\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u001f\u0010\u0015\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00042\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u00c6\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\u0008\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u00d6\u0003J\t\u0010\u001a\u001a\u00020\u0010H\u00d6\u0001J\t\u0010\u001b\u001a\u00020\u0006H\u00d6\u0001R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000cR\u0014\u0010\r\u001a\u00020\u00068VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000e\u0010\u000cR\u0011\u0010\u000f\u001a\u00020\u00108F\u00a2\u0006\u0006\u001a\u0004\u0008\u0011\u0010\u0012\u00a8\u0006\u001d"
    }
    d2 = {
        "Lcom/stripe/hcaptcha/HCaptchaException;",
        "Ljava/lang/Exception;",
        "Lkotlin/Exception;",
        "hCaptchaError",
        "Lcom/stripe/hcaptcha/HCaptchaError;",
        "hCaptchaMessage",
        "",
        "<init>",
        "(Lcom/stripe/hcaptcha/HCaptchaError;Ljava/lang/String;)V",
        "getHCaptchaError",
        "()Lcom/stripe/hcaptcha/HCaptchaError;",
        "getHCaptchaMessage",
        "()Ljava/lang/String;",
        "message",
        "getMessage",
        "statusCode",
        "",
        "getStatusCode",
        "()I",
        "component1",
        "component2",
        "copy",
        "equals",
        "",
        "other",
        "",
        "hashCode",
        "toString",
        "Companion",
        "hcaptcha_release"
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
.field public static final Companion:Lcom/stripe/hcaptcha/HCaptchaException$Companion;

.field private static final serialVersionUID:J = -0x565128d5dc3d49a7L


# instance fields
.field private final hCaptchaError:Lcom/stripe/hcaptcha/HCaptchaError;

.field private final hCaptchaMessage:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/hcaptcha/HCaptchaException$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/hcaptcha/HCaptchaException$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/hcaptcha/HCaptchaException;->Companion:Lcom/stripe/hcaptcha/HCaptchaException$Companion;

    return-void
.end method

.method public constructor <init>(Lcom/stripe/hcaptcha/HCaptchaError;)V
    .locals 2

    const-string v0, "hCaptchaError"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-direct {p0, p1, v0, v1, v0}, Lcom/stripe/hcaptcha/HCaptchaException;-><init>(Lcom/stripe/hcaptcha/HCaptchaError;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Lcom/stripe/hcaptcha/HCaptchaError;Ljava/lang/String;)V
    .locals 1

    const-string v0, "hCaptchaError"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    invoke-direct {p0}, Ljava/lang/Exception;-><init>()V

    .line 13
    iput-object p1, p0, Lcom/stripe/hcaptcha/HCaptchaException;->hCaptchaError:Lcom/stripe/hcaptcha/HCaptchaError;

    .line 14
    iput-object p2, p0, Lcom/stripe/hcaptcha/HCaptchaException;->hCaptchaMessage:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/stripe/hcaptcha/HCaptchaError;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    .line 9
    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/stripe/hcaptcha/HCaptchaException;-><init>(Lcom/stripe/hcaptcha/HCaptchaError;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/stripe/hcaptcha/HCaptchaException;Lcom/stripe/hcaptcha/HCaptchaError;Ljava/lang/String;ILjava/lang/Object;)Lcom/stripe/hcaptcha/HCaptchaException;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    iget-object p1, p0, Lcom/stripe/hcaptcha/HCaptchaException;->hCaptchaError:Lcom/stripe/hcaptcha/HCaptchaError;

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    iget-object p2, p0, Lcom/stripe/hcaptcha/HCaptchaException;->hCaptchaMessage:Ljava/lang/String;

    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/stripe/hcaptcha/HCaptchaException;->copy(Lcom/stripe/hcaptcha/HCaptchaError;Ljava/lang/String;)Lcom/stripe/hcaptcha/HCaptchaException;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lcom/stripe/hcaptcha/HCaptchaError;
    .locals 1

    iget-object v0, p0, Lcom/stripe/hcaptcha/HCaptchaException;->hCaptchaError:Lcom/stripe/hcaptcha/HCaptchaError;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/hcaptcha/HCaptchaException;->hCaptchaMessage:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Lcom/stripe/hcaptcha/HCaptchaError;Ljava/lang/String;)Lcom/stripe/hcaptcha/HCaptchaException;
    .locals 1

    const-string v0, "hCaptchaError"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/hcaptcha/HCaptchaException;

    invoke-direct {v0, p1, p2}, Lcom/stripe/hcaptcha/HCaptchaException;-><init>(Lcom/stripe/hcaptcha/HCaptchaError;Ljava/lang/String;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/stripe/hcaptcha/HCaptchaException;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/hcaptcha/HCaptchaException;

    iget-object v1, p0, Lcom/stripe/hcaptcha/HCaptchaException;->hCaptchaError:Lcom/stripe/hcaptcha/HCaptchaError;

    iget-object v3, p1, Lcom/stripe/hcaptcha/HCaptchaException;->hCaptchaError:Lcom/stripe/hcaptcha/HCaptchaError;

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/stripe/hcaptcha/HCaptchaException;->hCaptchaMessage:Ljava/lang/String;

    iget-object p1, p1, Lcom/stripe/hcaptcha/HCaptchaException;->hCaptchaMessage:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final getHCaptchaError()Lcom/stripe/hcaptcha/HCaptchaError;
    .locals 1

    .line 13
    iget-object v0, p0, Lcom/stripe/hcaptcha/HCaptchaException;->hCaptchaError:Lcom/stripe/hcaptcha/HCaptchaError;

    return-object v0
.end method

.method public final getHCaptchaMessage()Ljava/lang/String;
    .locals 1

    .line 14
    iget-object v0, p0, Lcom/stripe/hcaptcha/HCaptchaException;->hCaptchaMessage:Ljava/lang/String;

    return-object v0
.end method

.method public getMessage()Ljava/lang/String;
    .locals 1

    .line 18
    iget-object v0, p0, Lcom/stripe/hcaptcha/HCaptchaException;->hCaptchaMessage:Ljava/lang/String;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/stripe/hcaptcha/HCaptchaException;->hCaptchaError:Lcom/stripe/hcaptcha/HCaptchaError;

    invoke-virtual {v0}, Lcom/stripe/hcaptcha/HCaptchaError;->getMessage()Ljava/lang/String;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public final getStatusCode()I
    .locals 1

    .line 21
    iget-object v0, p0, Lcom/stripe/hcaptcha/HCaptchaException;->hCaptchaError:Lcom/stripe/hcaptcha/HCaptchaError;

    invoke-virtual {v0}, Lcom/stripe/hcaptcha/HCaptchaError;->getErrorId()I

    move-result v0

    return v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/stripe/hcaptcha/HCaptchaException;->hCaptchaError:Lcom/stripe/hcaptcha/HCaptchaError;

    invoke-virtual {v0}, Lcom/stripe/hcaptcha/HCaptchaError;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/hcaptcha/HCaptchaException;->hCaptchaMessage:Ljava/lang/String;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    iget-object v0, p0, Lcom/stripe/hcaptcha/HCaptchaException;->hCaptchaError:Lcom/stripe/hcaptcha/HCaptchaError;

    iget-object v1, p0, Lcom/stripe/hcaptcha/HCaptchaException;->hCaptchaMessage:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "HCaptchaException(hCaptchaError="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, ", hCaptchaMessage="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
