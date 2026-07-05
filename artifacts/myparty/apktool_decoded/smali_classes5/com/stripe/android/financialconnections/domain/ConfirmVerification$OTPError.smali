.class public final Lcom/stripe/android/financialconnections/domain/ConfirmVerification$OTPError;
.super Ljava/lang/Throwable;
.source "ConfirmVerification.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/financialconnections/domain/ConfirmVerification;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "OTPError"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/financialconnections/domain/ConfirmVerification$OTPError$Type;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\t\u0008\u0007\u0018\u00002\u00020\u0001:\u0001\rB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\tR\u0011\u0010\n\u001a\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\u000e"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/domain/ConfirmVerification$OTPError;",
        "",
        "message",
        "",
        "type",
        "Lcom/stripe/android/financialconnections/domain/ConfirmVerification$OTPError$Type;",
        "<init>",
        "(Ljava/lang/String;Lcom/stripe/android/financialconnections/domain/ConfirmVerification$OTPError$Type;)V",
        "getType",
        "()Lcom/stripe/android/financialconnections/domain/ConfirmVerification$OTPError$Type;",
        "supportUrl",
        "getSupportUrl",
        "()Ljava/lang/String;",
        "Type",
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


# static fields
.field public static final $stable:I


# instance fields
.field private final type:Lcom/stripe/android/financialconnections/domain/ConfirmVerification$OTPError$Type;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lcom/stripe/android/financialconnections/domain/ConfirmVerification$OTPError$Type;)V
    .locals 1

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "type"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 65
    invoke-direct {p0, p1}, Ljava/lang/Throwable;-><init>(Ljava/lang/String;)V

    .line 64
    iput-object p2, p0, Lcom/stripe/android/financialconnections/domain/ConfirmVerification$OTPError;->type:Lcom/stripe/android/financialconnections/domain/ConfirmVerification$OTPError$Type;

    return-void
.end method


# virtual methods
.method public final getSupportUrl()Ljava/lang/String;
    .locals 1

    .line 68
    const-string v0, "https://support.link.co/contact/email?skipVerification=true"

    return-object v0
.end method

.method public final getType()Lcom/stripe/android/financialconnections/domain/ConfirmVerification$OTPError$Type;
    .locals 1

    .line 64
    iget-object v0, p0, Lcom/stripe/android/financialconnections/domain/ConfirmVerification$OTPError;->type:Lcom/stripe/android/financialconnections/domain/ConfirmVerification$OTPError$Type;

    return-object v0
.end method
