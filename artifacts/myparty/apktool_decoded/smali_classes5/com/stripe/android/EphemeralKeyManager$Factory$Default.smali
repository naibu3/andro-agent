.class public final Lcom/stripe/android/EphemeralKeyManager$Factory$Default;
.super Ljava/lang/Object;
.source "EphemeralKeyManager.kt"

# interfaces
.implements Lcom/stripe/android/EphemeralKeyManager$Factory;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/EphemeralKeyManager$Factory;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Default"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u0007\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u0012\u0008\u0002\u0010\u0008\u001a\u000c\u0012\u0004\u0012\u00020\n0\tj\u0002`\u000b\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0018\u0010\u0008\u001a\u000c\u0012\u0004\u0012\u00020\n0\tj\u0002`\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"
    }
    d2 = {
        "Lcom/stripe/android/EphemeralKeyManager$Factory$Default;",
        "Lcom/stripe/android/EphemeralKeyManager$Factory;",
        "keyProvider",
        "Lcom/stripe/android/EphemeralKeyProvider;",
        "shouldPrefetchEphemeralKey",
        "",
        "operationIdFactory",
        "Lcom/stripe/android/OperationIdFactory;",
        "timeSupplier",
        "Lkotlin/Function0;",
        "",
        "Lcom/stripe/android/TimeSupplier;",
        "<init>",
        "(Lcom/stripe/android/EphemeralKeyProvider;ZLcom/stripe/android/OperationIdFactory;Lkotlin/jvm/functions/Function0;)V",
        "create",
        "Lcom/stripe/android/EphemeralKeyManager;",
        "arg",
        "Lcom/stripe/android/EphemeralKeyManager$KeyManagerListener;",
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
.field public static final $stable:I


# instance fields
.field private final keyProvider:Lcom/stripe/android/EphemeralKeyProvider;

.field private final operationIdFactory:Lcom/stripe/android/OperationIdFactory;

.field private final shouldPrefetchEphemeralKey:Z

.field private final timeSupplier:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static synthetic $r8$lambda$_NLtfASK_E7dKxqcyT3oRhIlnT4()J
    .locals 2

    invoke-static {}, Lcom/stripe/android/EphemeralKeyManager$Factory$Default;->_init_$lambda$0()J

    move-result-wide v0

    return-wide v0
.end method

.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/EphemeralKeyProvider;ZLcom/stripe/android/OperationIdFactory;Lkotlin/jvm/functions/Function0;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/EphemeralKeyProvider;",
            "Z",
            "Lcom/stripe/android/OperationIdFactory;",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/Long;",
            ">;)V"
        }
    .end annotation

    const-string v0, "keyProvider"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "operationIdFactory"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "timeSupplier"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 146
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 147
    iput-object p1, p0, Lcom/stripe/android/EphemeralKeyManager$Factory$Default;->keyProvider:Lcom/stripe/android/EphemeralKeyProvider;

    .line 148
    iput-boolean p2, p0, Lcom/stripe/android/EphemeralKeyManager$Factory$Default;->shouldPrefetchEphemeralKey:Z

    .line 149
    iput-object p3, p0, Lcom/stripe/android/EphemeralKeyManager$Factory$Default;->operationIdFactory:Lcom/stripe/android/OperationIdFactory;

    .line 150
    iput-object p4, p0, Lcom/stripe/android/EphemeralKeyManager$Factory$Default;->timeSupplier:Lkotlin/jvm/functions/Function0;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/stripe/android/EphemeralKeyProvider;ZLcom/stripe/android/OperationIdFactory;Lkotlin/jvm/functions/Function0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_0

    .line 149
    new-instance p3, Lcom/stripe/android/StripeOperationIdFactory;

    invoke-direct {p3}, Lcom/stripe/android/StripeOperationIdFactory;-><init>()V

    check-cast p3, Lcom/stripe/android/OperationIdFactory;

    :cond_0
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_1

    .line 150
    new-instance p4, Lcom/stripe/android/EphemeralKeyManager$Factory$Default$$ExternalSyntheticLambda0;

    invoke-direct {p4}, Lcom/stripe/android/EphemeralKeyManager$Factory$Default$$ExternalSyntheticLambda0;-><init>()V

    .line 146
    :cond_1
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/stripe/android/EphemeralKeyManager$Factory$Default;-><init>(Lcom/stripe/android/EphemeralKeyProvider;ZLcom/stripe/android/OperationIdFactory;Lkotlin/jvm/functions/Function0;)V

    return-void
.end method

.method private static final _init_$lambda$0()J
    .locals 2

    .line 150
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v0

    return-wide v0
.end method


# virtual methods
.method public synthetic create(Lcom/stripe/android/EphemeralKeyManager$KeyManagerListener;)Lcom/stripe/android/EphemeralKeyManager;
    .locals 11

    const-string v0, "arg"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 154
    new-instance v1, Lcom/stripe/android/EphemeralKeyManager;

    .line 155
    iget-object v2, p0, Lcom/stripe/android/EphemeralKeyManager$Factory$Default;->keyProvider:Lcom/stripe/android/EphemeralKeyProvider;

    .line 157
    iget-object v4, p0, Lcom/stripe/android/EphemeralKeyManager$Factory$Default;->operationIdFactory:Lcom/stripe/android/OperationIdFactory;

    .line 158
    iget-boolean v5, p0, Lcom/stripe/android/EphemeralKeyManager$Factory$Default;->shouldPrefetchEphemeralKey:Z

    .line 159
    iget-object v6, p0, Lcom/stripe/android/EphemeralKeyManager$Factory$Default;->timeSupplier:Lkotlin/jvm/functions/Function0;

    const/16 v9, 0x20

    const/4 v10, 0x0

    const-wide/16 v7, 0x0

    move-object v3, p1

    .line 154
    invoke-direct/range {v1 .. v10}, Lcom/stripe/android/EphemeralKeyManager;-><init>(Lcom/stripe/android/EphemeralKeyProvider;Lcom/stripe/android/EphemeralKeyManager$KeyManagerListener;Lcom/stripe/android/OperationIdFactory;ZLkotlin/jvm/functions/Function0;JILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method
