.class public final Lcom/stripe/android/core/networking/NetworkConstantsKt;
.super Ljava/lang/Object;
.source "NetworkConstants.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u001c\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u000b\"\u0010\u0010\u0000\u001a\u00020\u00018\u0006X\u0087T\u00a2\u0006\u0002\n\u0000\"\u001c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0004\u0010\u0005\"\u0010\u0010\u0006\u001a\u00020\u00078\u0006X\u0087T\u00a2\u0006\u0002\n\u0000\"\u0010\u0010\u0008\u001a\u00020\u00078\u0006X\u0087T\u00a2\u0006\u0002\n\u0000\"\u0010\u0010\t\u001a\u00020\u00078\u0006X\u0087T\u00a2\u0006\u0002\n\u0000\"\u0010\u0010\n\u001a\u00020\u00078\u0006X\u0087T\u00a2\u0006\u0002\n\u0000\"\u0010\u0010\u000b\u001a\u00020\u00078\u0006X\u0087T\u00a2\u0006\u0002\n\u0000\"\u0010\u0010\u000c\u001a\u00020\u00078\u0006X\u0087T\u00a2\u0006\u0002\n\u0000\"\u0010\u0010\r\u001a\u00020\u00078\u0006X\u0087T\u00a2\u0006\u0002\n\u0000\"\u0010\u0010\u000e\u001a\u00020\u00078\u0006X\u0087T\u00a2\u0006\u0002\n\u0000\"\u0010\u0010\u000f\u001a\u00020\u00078\u0006X\u0087T\u00a2\u0006\u0002\n\u0000\"\u0010\u0010\u0010\u001a\u00020\u00078\u0006X\u0087T\u00a2\u0006\u0002\n\u0000\"\u0010\u0010\u0011\u001a\u00020\u00078\u0006X\u0087T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"
    }
    d2 = {
        "HTTP_TOO_MANY_REQUESTS",
        "",
        "DEFAULT_RETRY_CODES",
        "",
        "getDEFAULT_RETRY_CODES",
        "()Ljava/lang/Iterable;",
        "HEADER_USER_AGENT",
        "",
        "HEADER_ACCEPT_CHARSET",
        "HEADER_ACCEPT_LANGUAGE",
        "HEADER_CONTENT_TYPE",
        "HEADER_ACCEPT",
        "HEADER_STRIPE_VERSION",
        "HEADER_STRIPE_ACCOUNT",
        "HEADER_STRIPE_LIVEMODE",
        "HEADER_AUTHORIZATION",
        "HEADER_IDEMPOTENCY_KEY",
        "HEADER_X_STRIPE_USER_AGENT",
        "stripe-core_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final DEFAULT_RETRY_CODES:Ljava/lang/Iterable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Iterable<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public static final HEADER_ACCEPT:Ljava/lang/String; = "Accept"

.field public static final HEADER_ACCEPT_CHARSET:Ljava/lang/String; = "Accept-Charset"

.field public static final HEADER_ACCEPT_LANGUAGE:Ljava/lang/String; = "Accept-Language"

.field public static final HEADER_AUTHORIZATION:Ljava/lang/String; = "Authorization"

.field public static final HEADER_CONTENT_TYPE:Ljava/lang/String; = "Content-Type"

.field public static final HEADER_IDEMPOTENCY_KEY:Ljava/lang/String; = "Idempotency-Key"

.field public static final HEADER_STRIPE_ACCOUNT:Ljava/lang/String; = "Stripe-Account"

.field public static final HEADER_STRIPE_LIVEMODE:Ljava/lang/String; = "Stripe-Livemode"

.field public static final HEADER_STRIPE_VERSION:Ljava/lang/String; = "Stripe-Version"

.field public static final HEADER_USER_AGENT:Ljava/lang/String; = "User-Agent"

.field public static final HEADER_X_STRIPE_USER_AGENT:Ljava/lang/String; = "X-Stripe-User-Agent"

.field public static final HTTP_TOO_MANY_REQUESTS:I = 0x1ad


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 15
    new-instance v0, Lkotlin/ranges/IntRange;

    const/16 v1, 0x1ad

    invoke-direct {v0, v1, v1}, Lkotlin/ranges/IntRange;-><init>(II)V

    check-cast v0, Ljava/lang/Iterable;

    sput-object v0, Lcom/stripe/android/core/networking/NetworkConstantsKt;->DEFAULT_RETRY_CODES:Ljava/lang/Iterable;

    return-void
.end method

.method public static final getDEFAULT_RETRY_CODES()Ljava/lang/Iterable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Iterable<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .line 14
    sget-object v0, Lcom/stripe/android/core/networking/NetworkConstantsKt;->DEFAULT_RETRY_CODES:Ljava/lang/Iterable;

    return-object v0
.end method
