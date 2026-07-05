.class final Lcom/stripe/android/ui/core/elements/events/EmptyCardEventReporter;
.super Ljava/lang/Object;
.source "CardNumberCompletedEventReporter.kt"

# interfaces
.implements Lcom/stripe/android/ui/core/elements/events/CardNumberCompletedEventReporter;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\u0008\u00c2\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0008\u0010\u0004\u001a\u00020\u0005H\u0016\u00a8\u0006\u0006"
    }
    d2 = {
        "Lcom/stripe/android/ui/core/elements/events/EmptyCardEventReporter;",
        "Lcom/stripe/android/ui/core/elements/events/CardNumberCompletedEventReporter;",
        "<init>",
        "()V",
        "onCardNumberCompleted",
        "",
        "payments-ui-core_release"
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
.field public static final INSTANCE:Lcom/stripe/android/ui/core/elements/events/EmptyCardEventReporter;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/ui/core/elements/events/EmptyCardEventReporter;

    invoke-direct {v0}, Lcom/stripe/android/ui/core/elements/events/EmptyCardEventReporter;-><init>()V

    sput-object v0, Lcom/stripe/android/ui/core/elements/events/EmptyCardEventReporter;->INSTANCE:Lcom/stripe/android/ui/core/elements/events/EmptyCardEventReporter;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCardNumberCompleted()V
    .locals 0

    return-void
.end method
