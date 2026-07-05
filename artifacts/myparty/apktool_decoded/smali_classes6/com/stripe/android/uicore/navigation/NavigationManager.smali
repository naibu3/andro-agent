.class public interface abstract Lcom/stripe/android/uicore/navigation/NavigationManager;
.super Ljava/lang/Object;
.source "NavigationManager.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/uicore/navigation/NavigationManager$DefaultImpls;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\u0008g\u0018\u00002\u00020\u0001J&\u0010\u0007\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\n2\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u000c2\u0008\u0008\u0002\u0010\r\u001a\u00020\u000eH&J\u0008\u0010\u000f\u001a\u00020\u0008H&R\u0018\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0010"
    }
    d2 = {
        "Lcom/stripe/android/uicore/navigation/NavigationManager;",
        "",
        "navigationFlow",
        "Lkotlinx/coroutines/flow/SharedFlow;",
        "Lcom/stripe/android/uicore/navigation/NavigationIntent;",
        "getNavigationFlow",
        "()Lkotlinx/coroutines/flow/SharedFlow;",
        "tryNavigateTo",
        "",
        "route",
        "",
        "popUpTo",
        "Lcom/stripe/android/uicore/navigation/PopUpToBehavior;",
        "isSingleTop",
        "",
        "tryNavigateBack",
        "stripe-ui-core_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# virtual methods
.method public abstract getNavigationFlow()Lkotlinx/coroutines/flow/SharedFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/SharedFlow<",
            "Lcom/stripe/android/uicore/navigation/NavigationIntent;",
            ">;"
        }
    .end annotation
.end method

.method public abstract tryNavigateBack()V
.end method

.method public abstract tryNavigateTo(Ljava/lang/String;Lcom/stripe/android/uicore/navigation/PopUpToBehavior;Z)V
.end method
