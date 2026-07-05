.class public final Lcom/stripe/android/paymentelement/confirmation/injection/ConfirmationHandlerModule$Companion;
.super Ljava/lang/Object;
.source "ConfirmationHandlerModule.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/paymentelement/confirmation/injection/ConfirmationHandlerModule;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J&\u0010\u0004\u001a\u00020\u00052\u001c\u0010\u0006\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0002\u0008\u0003\u0012\u0002\u0008\u0003\u0012\u0002\u0008\u0003\u0012\u0002\u0008\u00030\u00080\u0007H\u0007\u00a8\u0006\t"
    }
    d2 = {
        "Lcom/stripe/android/paymentelement/confirmation/injection/ConfirmationHandlerModule$Companion;",
        "",
        "<init>",
        "()V",
        "providesConfirmationRegistry",
        "Lcom/stripe/android/paymentelement/confirmation/ConfirmationRegistry;",
        "definitions",
        "",
        "Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition;",
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
.field static final synthetic $$INSTANCE:Lcom/stripe/android/paymentelement/confirmation/injection/ConfirmationHandlerModule$Companion;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/paymentelement/confirmation/injection/ConfirmationHandlerModule$Companion;

    invoke-direct {v0}, Lcom/stripe/android/paymentelement/confirmation/injection/ConfirmationHandlerModule$Companion;-><init>()V

    sput-object v0, Lcom/stripe/android/paymentelement/confirmation/injection/ConfirmationHandlerModule$Companion;->$$INSTANCE:Lcom/stripe/android/paymentelement/confirmation/injection/ConfirmationHandlerModule$Companion;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final providesConfirmationRegistry(Ljava/util/Set;)Lcom/stripe/android/paymentelement/confirmation/ConfirmationRegistry;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition<",
            "****>;>;)",
            "Lcom/stripe/android/paymentelement/confirmation/ConfirmationRegistry;"
        }
    .end annotation

    const-string v0, "definitions"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    new-instance v0, Lcom/stripe/android/paymentelement/confirmation/ConfirmationRegistry;

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->toList(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/stripe/android/paymentelement/confirmation/ConfirmationRegistry;-><init>(Ljava/util/List;)V

    return-object v0
.end method
