.class public final Lcom/stripe/android/model/Address$Builder;
.super Ljava/lang/Object;
.source "Address.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/model/Address;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0010\u0010\u000b\u001a\u00020\u00002\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0005J\u0010\u0010\u000c\u001a\u00020\u00002\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0005J\u0012\u0010\r\u001a\u00020\u00002\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0007J\u0010\u0010\u0010\u001a\u00020\u00002\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0005J\u0010\u0010\u0011\u001a\u00020\u00002\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0005J\u0010\u0010\u0012\u001a\u00020\u00002\u0008\u0010\t\u001a\u0004\u0018\u00010\u0005J\u0010\u0010\u0013\u001a\u00020\u00002\u0008\u0010\n\u001a\u0004\u0018\u00010\u0005J\u0006\u0010\u0014\u001a\u00020\u0015R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0008\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"
    }
    d2 = {
        "Lcom/stripe/android/model/Address$Builder;",
        "",
        "<init>",
        "()V",
        "city",
        "",
        "country",
        "line1",
        "line2",
        "postalCode",
        "state",
        "setCity",
        "setCountry",
        "setCountryCode",
        "countryCode",
        "Lcom/stripe/android/core/model/CountryCode;",
        "setLine1",
        "setLine2",
        "setPostalCode",
        "setState",
        "build",
        "Lcom/stripe/android/model/Address;",
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


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private city:Ljava/lang/String;

.field private country:Ljava/lang/String;

.field private line1:Ljava/lang/String;

.field private line2:Ljava/lang/String;

.field private postalCode:Ljava/lang/String;

.field private state:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 44
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final build()Lcom/stripe/android/model/Address;
    .locals 7

    .line 82
    new-instance v0, Lcom/stripe/android/model/Address;

    .line 83
    iget-object v1, p0, Lcom/stripe/android/model/Address$Builder;->city:Ljava/lang/String;

    .line 84
    iget-object v2, p0, Lcom/stripe/android/model/Address$Builder;->country:Ljava/lang/String;

    .line 85
    iget-object v3, p0, Lcom/stripe/android/model/Address$Builder;->line1:Ljava/lang/String;

    .line 86
    iget-object v4, p0, Lcom/stripe/android/model/Address$Builder;->line2:Ljava/lang/String;

    .line 87
    iget-object v5, p0, Lcom/stripe/android/model/Address$Builder;->postalCode:Ljava/lang/String;

    .line 88
    iget-object v6, p0, Lcom/stripe/android/model/Address$Builder;->state:Ljava/lang/String;

    .line 82
    invoke-direct/range {v0 .. v6}, Lcom/stripe/android/model/Address;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public final setCity(Ljava/lang/String;)Lcom/stripe/android/model/Address$Builder;
    .locals 1

    .line 52
    move-object v0, p0

    check-cast v0, Lcom/stripe/android/model/Address$Builder;

    .line 53
    iput-object p1, p0, Lcom/stripe/android/model/Address$Builder;->city:Ljava/lang/String;

    return-object p0
.end method

.method public final setCountry(Ljava/lang/String;)Lcom/stripe/android/model/Address$Builder;
    .locals 1

    .line 56
    move-object v0, p0

    check-cast v0, Lcom/stripe/android/model/Address$Builder;

    if-eqz p1, :cond_0

    .line 57
    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {p1, v0}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "toUpperCase(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-object p1, p0, Lcom/stripe/android/model/Address$Builder;->country:Ljava/lang/String;

    return-object p0
.end method

.method public final setCountryCode(Lcom/stripe/android/core/model/CountryCode;)Lcom/stripe/android/model/Address$Builder;
    .locals 1

    .line 61
    move-object v0, p0

    check-cast v0, Lcom/stripe/android/model/Address$Builder;

    if-eqz p1, :cond_0

    .line 62
    invoke-virtual {p1}, Lcom/stripe/android/core/model/CountryCode;->getValue()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-object p1, p0, Lcom/stripe/android/model/Address$Builder;->country:Ljava/lang/String;

    return-object p0
.end method

.method public final setLine1(Ljava/lang/String;)Lcom/stripe/android/model/Address$Builder;
    .locals 1

    .line 65
    move-object v0, p0

    check-cast v0, Lcom/stripe/android/model/Address$Builder;

    .line 66
    iput-object p1, p0, Lcom/stripe/android/model/Address$Builder;->line1:Ljava/lang/String;

    return-object p0
.end method

.method public final setLine2(Ljava/lang/String;)Lcom/stripe/android/model/Address$Builder;
    .locals 1

    .line 69
    move-object v0, p0

    check-cast v0, Lcom/stripe/android/model/Address$Builder;

    .line 70
    iput-object p1, p0, Lcom/stripe/android/model/Address$Builder;->line2:Ljava/lang/String;

    return-object p0
.end method

.method public final setPostalCode(Ljava/lang/String;)Lcom/stripe/android/model/Address$Builder;
    .locals 1

    .line 73
    move-object v0, p0

    check-cast v0, Lcom/stripe/android/model/Address$Builder;

    .line 74
    iput-object p1, p0, Lcom/stripe/android/model/Address$Builder;->postalCode:Ljava/lang/String;

    return-object p0
.end method

.method public final setState(Ljava/lang/String;)Lcom/stripe/android/model/Address$Builder;
    .locals 1

    .line 77
    move-object v0, p0

    check-cast v0, Lcom/stripe/android/model/Address$Builder;

    .line 78
    iput-object p1, p0, Lcom/stripe/android/model/Address$Builder;->state:Ljava/lang/String;

    return-object p0
.end method
