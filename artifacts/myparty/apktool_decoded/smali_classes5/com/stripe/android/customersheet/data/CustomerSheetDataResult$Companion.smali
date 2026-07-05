.class public final Lcom/stripe/android/customersheet/data/CustomerSheetDataResult$Companion;
.super Ljava/lang/Object;
.source "CustomerSheetDataResult.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/customersheet/data/CustomerSheetDataResult;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u001f\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u0002H\u00060\u0005\"\u0004\u0008\u0001\u0010\u00062\u0006\u0010\u0007\u001a\u0002H\u0006\u00a2\u0006\u0002\u0010\u0008J$\u0010\t\u001a\u0008\u0012\u0004\u0012\u0002H\u00060\n\"\u0004\u0008\u0001\u0010\u00062\u0006\u0010\u000b\u001a\u00020\u000c2\u0008\u0010\r\u001a\u0004\u0018\u00010\u000e\u00a8\u0006\u000f"
    }
    d2 = {
        "Lcom/stripe/android/customersheet/data/CustomerSheetDataResult$Companion;",
        "",
        "<init>",
        "()V",
        "success",
        "Lcom/stripe/android/customersheet/data/CustomerSheetDataResult$Success;",
        "T",
        "value",
        "(Ljava/lang/Object;)Lcom/stripe/android/customersheet/data/CustomerSheetDataResult$Success;",
        "failure",
        "Lcom/stripe/android/customersheet/data/CustomerSheetDataResult$Failure;",
        "cause",
        "",
        "displayMessage",
        "",
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
.field static final synthetic $$INSTANCE:Lcom/stripe/android/customersheet/data/CustomerSheetDataResult$Companion;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/customersheet/data/CustomerSheetDataResult$Companion;

    invoke-direct {v0}, Lcom/stripe/android/customersheet/data/CustomerSheetDataResult$Companion;-><init>()V

    sput-object v0, Lcom/stripe/android/customersheet/data/CustomerSheetDataResult$Companion;->$$INSTANCE:Lcom/stripe/android/customersheet/data/CustomerSheetDataResult$Companion;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final failure(Ljava/lang/Throwable;Ljava/lang/String;)Lcom/stripe/android/customersheet/data/CustomerSheetDataResult$Failure;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Throwable;",
            "Ljava/lang/String;",
            ")",
            "Lcom/stripe/android/customersheet/data/CustomerSheetDataResult$Failure<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "cause"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    new-instance v0, Lcom/stripe/android/customersheet/data/CustomerSheetDataResult$Failure;

    invoke-direct {v0, p1, p2}, Lcom/stripe/android/customersheet/data/CustomerSheetDataResult$Failure;-><init>(Ljava/lang/Throwable;Ljava/lang/String;)V

    return-object v0
.end method

.method public final success(Ljava/lang/Object;)Lcom/stripe/android/customersheet/data/CustomerSheetDataResult$Success;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;)",
            "Lcom/stripe/android/customersheet/data/CustomerSheetDataResult$Success<",
            "TT;>;"
        }
    .end annotation

    .line 20
    new-instance v0, Lcom/stripe/android/customersheet/data/CustomerSheetDataResult$Success;

    invoke-direct {v0, p1}, Lcom/stripe/android/customersheet/data/CustomerSheetDataResult$Success;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method
