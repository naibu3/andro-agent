.class public final Lcom/stripe/android/customersheet/CustomerAdapter$Result$Failure;
.super Lcom/stripe/android/customersheet/CustomerAdapter$Result;
.source "CustomerAdapter.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/customersheet/CustomerAdapter$Result;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Failure"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/stripe/android/customersheet/CustomerAdapter$Result<",
        "TT;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0007\u0008\u0007\u0018\u0000*\u0004\u0008\u0001\u0010\u00012\u0008\u0012\u0004\u0012\u0002H\u00010\u0002B\u001d\u0008\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0004\u0008\u0007\u0010\u0008R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\r"
    }
    d2 = {
        "Lcom/stripe/android/customersheet/CustomerAdapter$Result$Failure;",
        "T",
        "Lcom/stripe/android/customersheet/CustomerAdapter$Result;",
        "cause",
        "",
        "displayMessage",
        "",
        "<init>",
        "(Ljava/lang/Throwable;Ljava/lang/String;)V",
        "getCause",
        "()Ljava/lang/Throwable;",
        "getDisplayMessage",
        "()Ljava/lang/String;",
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
.field public static final $stable:I = 0x8


# instance fields
.field private final cause:Ljava/lang/Throwable;

.field private final displayMessage:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Ljava/lang/Throwable;Ljava/lang/String;)V
    .locals 1

    const-string v0, "cause"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 212
    invoke-direct {p0, v0}, Lcom/stripe/android/customersheet/CustomerAdapter$Result;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 210
    iput-object p1, p0, Lcom/stripe/android/customersheet/CustomerAdapter$Result$Failure;->cause:Ljava/lang/Throwable;

    .line 211
    iput-object p2, p0, Lcom/stripe/android/customersheet/CustomerAdapter$Result$Failure;->displayMessage:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Throwable;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    .line 209
    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/stripe/android/customersheet/CustomerAdapter$Result$Failure;-><init>(Ljava/lang/Throwable;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final getCause()Ljava/lang/Throwable;
    .locals 1

    .line 210
    iget-object v0, p0, Lcom/stripe/android/customersheet/CustomerAdapter$Result$Failure;->cause:Ljava/lang/Throwable;

    return-object v0
.end method

.method public final getDisplayMessage()Ljava/lang/String;
    .locals 1

    .line 211
    iget-object v0, p0, Lcom/stripe/android/customersheet/CustomerAdapter$Result$Failure;->displayMessage:Ljava/lang/String;

    return-object v0
.end method
