.class public interface abstract Lcom/stripe/android/paymentsheet/injection/AutocompleteViewModelFactoryComponent$Factory;
.super Ljava/lang/Object;
.source "AutocompleteViewModelFactoryComponent.kt"


# annotations
.annotation runtime Ldagger/Component$Factory;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/paymentsheet/injection/AutocompleteViewModelFactoryComponent;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "Factory"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008g\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0001\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0001\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\u0008"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/injection/AutocompleteViewModelFactoryComponent$Factory;",
        "",
        "build",
        "Lcom/stripe/android/paymentsheet/injection/AutocompleteViewModelFactoryComponent;",
        "application",
        "Landroid/app/Application;",
        "args",
        "Lcom/stripe/android/paymentsheet/addresselement/AutocompleteContract$Args;",
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


# virtual methods
.method public abstract build(Landroid/app/Application;Lcom/stripe/android/paymentsheet/addresselement/AutocompleteContract$Args;)Lcom/stripe/android/paymentsheet/injection/AutocompleteViewModelFactoryComponent;
    .param p1    # Landroid/app/Application;
        .annotation runtime Ldagger/BindsInstance;
        .end annotation
    .end param
    .param p2    # Lcom/stripe/android/paymentsheet/addresselement/AutocompleteContract$Args;
        .annotation runtime Ldagger/BindsInstance;
        .end annotation
    .end param
.end method
