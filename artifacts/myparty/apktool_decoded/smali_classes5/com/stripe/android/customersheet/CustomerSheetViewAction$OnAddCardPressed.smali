.class public final Lcom/stripe/android/customersheet/CustomerSheetViewAction$OnAddCardPressed;
.super Lcom/stripe/android/customersheet/CustomerSheetViewAction;
.source "CustomerSheetViewAction.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/customersheet/CustomerSheetViewAction;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "OnAddCardPressed"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "Lcom/stripe/android/customersheet/CustomerSheetViewAction$OnAddCardPressed;",
        "Lcom/stripe/android/customersheet/CustomerSheetViewAction;",
        "<init>",
        "()V",
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

.field public static final INSTANCE:Lcom/stripe/android/customersheet/CustomerSheetViewAction$OnAddCardPressed;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/customersheet/CustomerSheetViewAction$OnAddCardPressed;

    invoke-direct {v0}, Lcom/stripe/android/customersheet/CustomerSheetViewAction$OnAddCardPressed;-><init>()V

    sput-object v0, Lcom/stripe/android/customersheet/CustomerSheetViewAction$OnAddCardPressed;->INSTANCE:Lcom/stripe/android/customersheet/CustomerSheetViewAction$OnAddCardPressed;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    .line 18
    invoke-direct {p0, v0}, Lcom/stripe/android/customersheet/CustomerSheetViewAction;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method
