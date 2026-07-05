.class public abstract Lcom/stripe/android/customersheet/CustomerSheetIntegration;
.super Ljava/lang/Object;
.source "CustomerSheetIntegration.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/customersheet/CustomerSheetIntegration$Adapter;,
        Lcom/stripe/android/customersheet/CustomerSheetIntegration$CustomerSession;,
        Lcom/stripe/android/customersheet/CustomerSheetIntegration$Type;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00081\u0018\u00002\u00020\u0001:\u0003\u0008\t\nB\u0011\u0008\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007\u0082\u0001\u0002\u000b\u000c\u00a8\u0006\r"
    }
    d2 = {
        "Lcom/stripe/android/customersheet/CustomerSheetIntegration;",
        "",
        "type",
        "Lcom/stripe/android/customersheet/CustomerSheetIntegration$Type;",
        "<init>",
        "(Lcom/stripe/android/customersheet/CustomerSheetIntegration$Type;)V",
        "getType",
        "()Lcom/stripe/android/customersheet/CustomerSheetIntegration$Type;",
        "Type",
        "Adapter",
        "CustomerSession",
        "Lcom/stripe/android/customersheet/CustomerSheetIntegration$Adapter;",
        "Lcom/stripe/android/customersheet/CustomerSheetIntegration$CustomerSession;",
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


# instance fields
.field private final type:Lcom/stripe/android/customersheet/CustomerSheetIntegration$Type;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>(Lcom/stripe/android/customersheet/CustomerSheetIntegration$Type;)V
    .locals 0

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/customersheet/CustomerSheetIntegration;->type:Lcom/stripe/android/customersheet/CustomerSheetIntegration$Type;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/stripe/android/customersheet/CustomerSheetIntegration$Type;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/stripe/android/customersheet/CustomerSheetIntegration;-><init>(Lcom/stripe/android/customersheet/CustomerSheetIntegration$Type;)V

    return-void
.end method


# virtual methods
.method public final getType()Lcom/stripe/android/customersheet/CustomerSheetIntegration$Type;
    .locals 1

    .line 6
    iget-object v0, p0, Lcom/stripe/android/customersheet/CustomerSheetIntegration;->type:Lcom/stripe/android/customersheet/CustomerSheetIntegration$Type;

    return-object v0
.end method
