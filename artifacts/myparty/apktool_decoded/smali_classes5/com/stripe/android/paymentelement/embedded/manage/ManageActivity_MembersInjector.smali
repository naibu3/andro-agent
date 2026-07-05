.class public final Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity_MembersInjector;
.super Ljava/lang/Object;
.source "ManageActivity_MembersInjector.java"

# interfaces
.implements Ldagger/MembersInjector;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/MembersInjector<",
        "Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity;",
        ">;"
    }
.end annotation


# instance fields
.field private final customerStateHolderProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/paymentsheet/CustomerStateHolder;",
            ">;"
        }
    .end annotation
.end field

.field private final manageNavigatorProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/paymentelement/embedded/manage/ManageNavigator;",
            ">;"
        }
    .end annotation
.end field

.field private final selectionHolderProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/paymentelement/embedded/EmbeddedSelectionHolder;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/paymentsheet/CustomerStateHolder;",
            ">;",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/paymentelement/embedded/manage/ManageNavigator;",
            ">;",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/paymentelement/embedded/EmbeddedSelectionHolder;",
            ">;)V"
        }
    .end annotation

    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 38
    iput-object p1, p0, Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity_MembersInjector;->customerStateHolderProvider:Ldagger/internal/Provider;

    .line 39
    iput-object p2, p0, Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity_MembersInjector;->manageNavigatorProvider:Ldagger/internal/Provider;

    .line 40
    iput-object p3, p0, Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity_MembersInjector;->selectionHolderProvider:Ldagger/internal/Provider;

    return-void
.end method

.method public static create(Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;)Ldagger/MembersInjector;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/paymentsheet/CustomerStateHolder;",
            ">;",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/paymentelement/embedded/manage/ManageNavigator;",
            ">;",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/paymentelement/embedded/EmbeddedSelectionHolder;",
            ">;)",
            "Ldagger/MembersInjector<",
            "Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity;",
            ">;"
        }
    .end annotation

    .line 47
    new-instance v0, Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity_MembersInjector;

    invoke-direct {v0, p0, p1, p2}, Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity_MembersInjector;-><init>(Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;)V

    return-object v0
.end method

.method public static create(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Ldagger/MembersInjector;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/stripe/android/paymentsheet/CustomerStateHolder;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/stripe/android/paymentelement/embedded/manage/ManageNavigator;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/stripe/android/paymentelement/embedded/EmbeddedSelectionHolder;",
            ">;)",
            "Ldagger/MembersInjector<",
            "Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity;",
            ">;"
        }
    .end annotation

    .line 54
    new-instance v0, Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity_MembersInjector;

    invoke-static {p0}, Ldagger/internal/Providers;->asDaggerProvider(Ljavax/inject/Provider;)Ldagger/internal/Provider;

    move-result-object p0

    invoke-static {p1}, Ldagger/internal/Providers;->asDaggerProvider(Ljavax/inject/Provider;)Ldagger/internal/Provider;

    move-result-object p1

    invoke-static {p2}, Ldagger/internal/Providers;->asDaggerProvider(Ljavax/inject/Provider;)Ldagger/internal/Provider;

    move-result-object p2

    invoke-direct {v0, p0, p1, p2}, Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity_MembersInjector;-><init>(Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;)V

    return-object v0
.end method

.method public static injectCustomerStateHolder(Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity;Lcom/stripe/android/paymentsheet/CustomerStateHolder;)V
    .locals 0

    .line 67
    iput-object p1, p0, Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity;->customerStateHolder:Lcom/stripe/android/paymentsheet/CustomerStateHolder;

    return-void
.end method

.method public static injectManageNavigator(Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity;Lcom/stripe/android/paymentelement/embedded/manage/ManageNavigator;)V
    .locals 0

    .line 73
    iput-object p1, p0, Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity;->manageNavigator:Lcom/stripe/android/paymentelement/embedded/manage/ManageNavigator;

    return-void
.end method

.method public static injectSelectionHolder(Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity;Lcom/stripe/android/paymentelement/embedded/EmbeddedSelectionHolder;)V
    .locals 0

    .line 79
    iput-object p1, p0, Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity;->selectionHolder:Lcom/stripe/android/paymentelement/embedded/EmbeddedSelectionHolder;

    return-void
.end method


# virtual methods
.method public injectMembers(Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity;)V
    .locals 1

    .line 59
    iget-object v0, p0, Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity_MembersInjector;->customerStateHolderProvider:Ldagger/internal/Provider;

    invoke-interface {v0}, Ldagger/internal/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/paymentsheet/CustomerStateHolder;

    invoke-static {p1, v0}, Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity_MembersInjector;->injectCustomerStateHolder(Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity;Lcom/stripe/android/paymentsheet/CustomerStateHolder;)V

    .line 60
    iget-object v0, p0, Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity_MembersInjector;->manageNavigatorProvider:Ldagger/internal/Provider;

    invoke-interface {v0}, Ldagger/internal/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/paymentelement/embedded/manage/ManageNavigator;

    invoke-static {p1, v0}, Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity_MembersInjector;->injectManageNavigator(Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity;Lcom/stripe/android/paymentelement/embedded/manage/ManageNavigator;)V

    .line 61
    iget-object v0, p0, Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity_MembersInjector;->selectionHolderProvider:Ldagger/internal/Provider;

    invoke-interface {v0}, Ldagger/internal/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/paymentelement/embedded/EmbeddedSelectionHolder;

    invoke-static {p1, v0}, Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity_MembersInjector;->injectSelectionHolder(Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity;Lcom/stripe/android/paymentelement/embedded/EmbeddedSelectionHolder;)V

    return-void
.end method

.method public bridge synthetic injectMembers(Ljava/lang/Object;)V
    .locals 0

    .line 13
    check-cast p1, Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity;

    invoke-virtual {p0, p1}, Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity_MembersInjector;->injectMembers(Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity;)V

    return-void
.end method
