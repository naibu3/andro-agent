.class public final Lcom/stripe/android/financialconnections/repository/SuccessContentRepository;
.super Lcom/stripe/android/financialconnections/repository/PersistingRepository;
.source "SuccessContentRepository.kt"


# annotations
.annotation runtime Lcom/stripe/android/financialconnections/di/ActivityRetainedScope;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/financialconnections/repository/SuccessContentRepository$State;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/stripe/android/financialconnections/repository/PersistingRepository<",
        "Lcom/stripe/android/financialconnections/repository/SuccessContentRepository$State;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000cB\u0011\u0008\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u001c\u0010\u0007\u001a\u00020\u00082\u0008\u0010\t\u001a\u0004\u0018\u00010\n2\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u00a8\u0006\r"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/repository/SuccessContentRepository;",
        "Lcom/stripe/android/financialconnections/repository/PersistingRepository;",
        "Lcom/stripe/android/financialconnections/repository/SuccessContentRepository$State;",
        "savedStateHandle",
        "Landroidx/lifecycle/SavedStateHandle;",
        "<init>",
        "(Landroidx/lifecycle/SavedStateHandle;)V",
        "set",
        "",
        "message",
        "Lcom/stripe/android/financialconnections/ui/TextResource;",
        "heading",
        "State",
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


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroidx/lifecycle/SavedStateHandle;)V
    .locals 1
    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    const-string v0, "savedStateHandle"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    invoke-direct {p0, p1}, Lcom/stripe/android/financialconnections/repository/PersistingRepository;-><init>(Landroidx/lifecycle/SavedStateHandle;)V

    return-void
.end method

.method public static synthetic set$default(Lcom/stripe/android/financialconnections/repository/SuccessContentRepository;Lcom/stripe/android/financialconnections/ui/TextResource;Lcom/stripe/android/financialconnections/ui/TextResource;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    .line 18
    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/financialconnections/repository/SuccessContentRepository;->set(Lcom/stripe/android/financialconnections/ui/TextResource;Lcom/stripe/android/financialconnections/ui/TextResource;)V

    return-void
.end method


# virtual methods
.method public final set(Lcom/stripe/android/financialconnections/ui/TextResource;Lcom/stripe/android/financialconnections/ui/TextResource;)V
    .locals 1

    .line 23
    new-instance v0, Lcom/stripe/android/financialconnections/repository/SuccessContentRepository$State;

    invoke-direct {v0, p1, p2}, Lcom/stripe/android/financialconnections/repository/SuccessContentRepository$State;-><init>(Lcom/stripe/android/financialconnections/ui/TextResource;Lcom/stripe/android/financialconnections/ui/TextResource;)V

    check-cast v0, Landroid/os/Parcelable;

    .line 22
    invoke-virtual {p0, v0}, Lcom/stripe/android/financialconnections/repository/SuccessContentRepository;->set(Landroid/os/Parcelable;)V

    return-void
.end method
