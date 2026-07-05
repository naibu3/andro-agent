.class public final Lcom/stripe/android/customersheet/CustomerSheetIntegration$Adapter;
.super Lcom/stripe/android/customersheet/CustomerSheetIntegration;
.source "CustomerSheetIntegration.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/customersheet/CustomerSheetIntegration;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Adapter"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Lcom/stripe/android/customersheet/CustomerSheetIntegration$Adapter;",
        "Lcom/stripe/android/customersheet/CustomerSheetIntegration;",
        "adapter",
        "Lcom/stripe/android/customersheet/CustomerAdapter;",
        "<init>",
        "(Lcom/stripe/android/customersheet/CustomerAdapter;)V",
        "getAdapter",
        "()Lcom/stripe/android/customersheet/CustomerAdapter;",
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
.field private final adapter:Lcom/stripe/android/customersheet/CustomerAdapter;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/customersheet/CustomerAdapter;)V
    .locals 2

    const-string v0, "adapter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    sget-object v0, Lcom/stripe/android/customersheet/CustomerSheetIntegration$Type;->CustomerAdapter:Lcom/stripe/android/customersheet/CustomerSheetIntegration$Type;

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lcom/stripe/android/customersheet/CustomerSheetIntegration;-><init>(Lcom/stripe/android/customersheet/CustomerSheetIntegration$Type;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 13
    iput-object p1, p0, Lcom/stripe/android/customersheet/CustomerSheetIntegration$Adapter;->adapter:Lcom/stripe/android/customersheet/CustomerAdapter;

    return-void
.end method


# virtual methods
.method public final getAdapter()Lcom/stripe/android/customersheet/CustomerAdapter;
    .locals 1

    .line 13
    iget-object v0, p0, Lcom/stripe/android/customersheet/CustomerSheetIntegration$Adapter;->adapter:Lcom/stripe/android/customersheet/CustomerAdapter;

    return-object v0
.end method
