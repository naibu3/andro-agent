.class public final Lcom/stripe/android/stripe3ds2/views/ChallengeProgressArgs$Companion;
.super Ljava/lang/Object;
.source "ChallengeProgressArgs.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/stripe3ds2/views/ChallengeProgressArgs;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nChallengeProgressArgs.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChallengeProgressArgs.kt\ncom/stripe/android/stripe3ds2/views/ChallengeProgressArgs$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,26:1\n1#2:27\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0008\u0010\u0008\u001a\u0004\u0018\u00010\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"
    }
    d2 = {
        "Lcom/stripe/android/stripe3ds2/views/ChallengeProgressArgs$Companion;",
        "",
        "<init>",
        "()V",
        "EXTRA_ARGS",
        "",
        "fromBundle",
        "Lcom/stripe/android/stripe3ds2/views/ChallengeProgressArgs;",
        "bundle",
        "Landroid/os/Bundle;",
        "3ds2sdk_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lcom/stripe/android/stripe3ds2/views/ChallengeProgressArgs$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final fromBundle(Landroid/os/Bundle;)Lcom/stripe/android/stripe3ds2/views/ChallengeProgressArgs;
    .locals 2

    if-eqz p1, :cond_0

    .line 22
    const-string v0, "com.stripe.android.stripe3ds2.views.ChallengeProgressArgs"

    const-class v1, Lcom/stripe/android/stripe3ds2/views/ChallengeProgressArgs;

    invoke-static {p1, v0, v1}, Landroidx/core/os/BundleCompat;->getParcelable(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/stripe3ds2/views/ChallengeProgressArgs;

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method
