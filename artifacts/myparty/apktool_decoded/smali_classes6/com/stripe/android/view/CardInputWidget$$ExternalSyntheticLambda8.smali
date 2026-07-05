.class public final synthetic Lcom/stripe/android/view/CardInputWidget$$ExternalSyntheticLambda8;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic f$0:Lcom/stripe/android/view/CardInputWidget;


# direct methods
.method public synthetic constructor <init>(Lcom/stripe/android/view/CardInputWidget;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/view/CardInputWidget$$ExternalSyntheticLambda8;->f$0:Lcom/stripe/android/view/CardInputWidget;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 0
    iget-object v0, p0, Lcom/stripe/android/view/CardInputWidget$$ExternalSyntheticLambda8;->f$0:Lcom/stripe/android/view/CardInputWidget;

    check-cast p1, Landroidx/lifecycle/LifecycleOwner;

    check-cast p2, Lcom/stripe/android/view/CardWidgetViewModel;

    invoke-static {v0, p1, p2}, Lcom/stripe/android/view/CardInputWidget;->$r8$lambda$fknBwHI0PM_seZY89fvX6U6Pr3Q(Lcom/stripe/android/view/CardInputWidget;Landroidx/lifecycle/LifecycleOwner;Lcom/stripe/android/view/CardWidgetViewModel;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
