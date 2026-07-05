.class public final Lcom/stripe/android/paymentelement/embedded/form/FormActivity_MembersInjector;
.super Ljava/lang/Object;
.source "FormActivity_MembersInjector.java"

# interfaces
.implements Ldagger/MembersInjector;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/MembersInjector<",
        "Lcom/stripe/android/paymentelement/embedded/form/FormActivity;",
        ">;"
    }
.end annotation


# instance fields
.field private final confirmationHelperProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/paymentelement/embedded/form/FormActivityConfirmationHelper;",
            ">;"
        }
    .end annotation
.end field

.field private final eventReporterProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/paymentsheet/analytics/EventReporter;",
            ">;"
        }
    .end annotation
.end field

.field private final formActivityStateHelperProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/paymentelement/embedded/form/FormActivityStateHelper;",
            ">;"
        }
    .end annotation
.end field

.field private final formInteractorProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/paymentsheet/verticalmode/DefaultVerticalModeFormInteractor;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/paymentsheet/verticalmode/DefaultVerticalModeFormInteractor;",
            ">;",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/paymentsheet/analytics/EventReporter;",
            ">;",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/paymentelement/embedded/form/FormActivityStateHelper;",
            ">;",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/paymentelement/embedded/form/FormActivityConfirmationHelper;",
            ">;)V"
        }
    .end annotation

    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 42
    iput-object p1, p0, Lcom/stripe/android/paymentelement/embedded/form/FormActivity_MembersInjector;->formInteractorProvider:Ldagger/internal/Provider;

    .line 43
    iput-object p2, p0, Lcom/stripe/android/paymentelement/embedded/form/FormActivity_MembersInjector;->eventReporterProvider:Ldagger/internal/Provider;

    .line 44
    iput-object p3, p0, Lcom/stripe/android/paymentelement/embedded/form/FormActivity_MembersInjector;->formActivityStateHelperProvider:Ldagger/internal/Provider;

    .line 45
    iput-object p4, p0, Lcom/stripe/android/paymentelement/embedded/form/FormActivity_MembersInjector;->confirmationHelperProvider:Ldagger/internal/Provider;

    return-void
.end method

.method public static create(Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;)Ldagger/MembersInjector;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/paymentsheet/verticalmode/DefaultVerticalModeFormInteractor;",
            ">;",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/paymentsheet/analytics/EventReporter;",
            ">;",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/paymentelement/embedded/form/FormActivityStateHelper;",
            ">;",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/paymentelement/embedded/form/FormActivityConfirmationHelper;",
            ">;)",
            "Ldagger/MembersInjector<",
            "Lcom/stripe/android/paymentelement/embedded/form/FormActivity;",
            ">;"
        }
    .end annotation

    .line 53
    new-instance v0, Lcom/stripe/android/paymentelement/embedded/form/FormActivity_MembersInjector;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/stripe/android/paymentelement/embedded/form/FormActivity_MembersInjector;-><init>(Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;)V

    return-object v0
.end method

.method public static create(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Ldagger/MembersInjector;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/stripe/android/paymentsheet/verticalmode/DefaultVerticalModeFormInteractor;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/stripe/android/paymentsheet/analytics/EventReporter;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/stripe/android/paymentelement/embedded/form/FormActivityStateHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/stripe/android/paymentelement/embedded/form/FormActivityConfirmationHelper;",
            ">;)",
            "Ldagger/MembersInjector<",
            "Lcom/stripe/android/paymentelement/embedded/form/FormActivity;",
            ">;"
        }
    .end annotation

    .line 61
    new-instance v0, Lcom/stripe/android/paymentelement/embedded/form/FormActivity_MembersInjector;

    invoke-static {p0}, Ldagger/internal/Providers;->asDaggerProvider(Ljavax/inject/Provider;)Ldagger/internal/Provider;

    move-result-object p0

    invoke-static {p1}, Ldagger/internal/Providers;->asDaggerProvider(Ljavax/inject/Provider;)Ldagger/internal/Provider;

    move-result-object p1

    invoke-static {p2}, Ldagger/internal/Providers;->asDaggerProvider(Ljavax/inject/Provider;)Ldagger/internal/Provider;

    move-result-object p2

    invoke-static {p3}, Ldagger/internal/Providers;->asDaggerProvider(Ljavax/inject/Provider;)Ldagger/internal/Provider;

    move-result-object p3

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/stripe/android/paymentelement/embedded/form/FormActivity_MembersInjector;-><init>(Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;)V

    return-object v0
.end method

.method public static injectConfirmationHelper(Lcom/stripe/android/paymentelement/embedded/form/FormActivity;Lcom/stripe/android/paymentelement/embedded/form/FormActivityConfirmationHelper;)V
    .locals 0

    .line 92
    iput-object p1, p0, Lcom/stripe/android/paymentelement/embedded/form/FormActivity;->confirmationHelper:Lcom/stripe/android/paymentelement/embedded/form/FormActivityConfirmationHelper;

    return-void
.end method

.method public static injectEventReporter(Lcom/stripe/android/paymentelement/embedded/form/FormActivity;Lcom/stripe/android/paymentsheet/analytics/EventReporter;)V
    .locals 0

    .line 80
    iput-object p1, p0, Lcom/stripe/android/paymentelement/embedded/form/FormActivity;->eventReporter:Lcom/stripe/android/paymentsheet/analytics/EventReporter;

    return-void
.end method

.method public static injectFormActivityStateHelper(Lcom/stripe/android/paymentelement/embedded/form/FormActivity;Lcom/stripe/android/paymentelement/embedded/form/FormActivityStateHelper;)V
    .locals 0

    .line 86
    iput-object p1, p0, Lcom/stripe/android/paymentelement/embedded/form/FormActivity;->formActivityStateHelper:Lcom/stripe/android/paymentelement/embedded/form/FormActivityStateHelper;

    return-void
.end method

.method public static injectFormInteractor(Lcom/stripe/android/paymentelement/embedded/form/FormActivity;Lcom/stripe/android/paymentsheet/verticalmode/DefaultVerticalModeFormInteractor;)V
    .locals 0

    .line 75
    iput-object p1, p0, Lcom/stripe/android/paymentelement/embedded/form/FormActivity;->formInteractor:Lcom/stripe/android/paymentsheet/verticalmode/DefaultVerticalModeFormInteractor;

    return-void
.end method


# virtual methods
.method public injectMembers(Lcom/stripe/android/paymentelement/embedded/form/FormActivity;)V
    .locals 1

    .line 66
    iget-object v0, p0, Lcom/stripe/android/paymentelement/embedded/form/FormActivity_MembersInjector;->formInteractorProvider:Ldagger/internal/Provider;

    invoke-interface {v0}, Ldagger/internal/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/paymentsheet/verticalmode/DefaultVerticalModeFormInteractor;

    invoke-static {p1, v0}, Lcom/stripe/android/paymentelement/embedded/form/FormActivity_MembersInjector;->injectFormInteractor(Lcom/stripe/android/paymentelement/embedded/form/FormActivity;Lcom/stripe/android/paymentsheet/verticalmode/DefaultVerticalModeFormInteractor;)V

    .line 67
    iget-object v0, p0, Lcom/stripe/android/paymentelement/embedded/form/FormActivity_MembersInjector;->eventReporterProvider:Ldagger/internal/Provider;

    invoke-interface {v0}, Ldagger/internal/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/paymentsheet/analytics/EventReporter;

    invoke-static {p1, v0}, Lcom/stripe/android/paymentelement/embedded/form/FormActivity_MembersInjector;->injectEventReporter(Lcom/stripe/android/paymentelement/embedded/form/FormActivity;Lcom/stripe/android/paymentsheet/analytics/EventReporter;)V

    .line 68
    iget-object v0, p0, Lcom/stripe/android/paymentelement/embedded/form/FormActivity_MembersInjector;->formActivityStateHelperProvider:Ldagger/internal/Provider;

    invoke-interface {v0}, Ldagger/internal/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/paymentelement/embedded/form/FormActivityStateHelper;

    invoke-static {p1, v0}, Lcom/stripe/android/paymentelement/embedded/form/FormActivity_MembersInjector;->injectFormActivityStateHelper(Lcom/stripe/android/paymentelement/embedded/form/FormActivity;Lcom/stripe/android/paymentelement/embedded/form/FormActivityStateHelper;)V

    .line 69
    iget-object v0, p0, Lcom/stripe/android/paymentelement/embedded/form/FormActivity_MembersInjector;->confirmationHelperProvider:Ldagger/internal/Provider;

    invoke-interface {v0}, Ldagger/internal/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/paymentelement/embedded/form/FormActivityConfirmationHelper;

    invoke-static {p1, v0}, Lcom/stripe/android/paymentelement/embedded/form/FormActivity_MembersInjector;->injectConfirmationHelper(Lcom/stripe/android/paymentelement/embedded/form/FormActivity;Lcom/stripe/android/paymentelement/embedded/form/FormActivityConfirmationHelper;)V

    return-void
.end method

.method public bridge synthetic injectMembers(Ljava/lang/Object;)V
    .locals 0

    .line 13
    check-cast p1, Lcom/stripe/android/paymentelement/embedded/form/FormActivity;

    invoke-virtual {p0, p1}, Lcom/stripe/android/paymentelement/embedded/form/FormActivity_MembersInjector;->injectMembers(Lcom/stripe/android/paymentelement/embedded/form/FormActivity;)V

    return-void
.end method
