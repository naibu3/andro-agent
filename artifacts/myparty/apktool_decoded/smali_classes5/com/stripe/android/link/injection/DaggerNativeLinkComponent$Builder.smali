.class final Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$Builder;
.super Ljava/lang/Object;
.source "DaggerNativeLinkComponent.java"

# interfaces
.implements Lcom/stripe/android/link/injection/NativeLinkComponent$Builder;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/link/injection/DaggerNativeLinkComponent;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "Builder"
.end annotation


# instance fields
.field private application:Landroid/app/Application;

.field private configuration:Lcom/stripe/android/link/LinkConfiguration;

.field private context:Landroid/content/Context;

.field private linkAccountUpdate:Lcom/stripe/android/link/LinkAccountUpdate$Value;

.field private linkExpressMode:Lcom/stripe/android/link/LinkExpressMode;

.field private linkLaunchMode:Lcom/stripe/android/link/LinkLaunchMode;

.field private paymentElementCallbackIdentifier:Ljava/lang/String;

.field private publishableKeyProvider:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private savedStateHandle:Landroidx/lifecycle/SavedStateHandle;

.field private statusBarColor:Ljava/lang/Integer;

.field private stripeAccountIdProvider:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 120
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/stripe/android/link/injection/DaggerNativeLinkComponent-IA;)V
    .locals 0

    invoke-direct {p0}, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$Builder;-><init>()V

    return-void
.end method


# virtual methods
.method public application(Landroid/app/Application;)Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$Builder;
    .locals 0

    .line 187
    invoke-static {p1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/app/Application;

    iput-object p1, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$Builder;->application:Landroid/app/Application;

    return-object p0
.end method

.method public bridge synthetic application(Landroid/app/Application;)Lcom/stripe/android/link/injection/NativeLinkComponent$Builder;
    .locals 0

    .line 120
    invoke-virtual {p0, p1}, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$Builder;->application(Landroid/app/Application;)Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$Builder;

    move-result-object p1

    return-object p1
.end method

.method public build()Lcom/stripe/android/link/injection/NativeLinkComponent;
    .locals 15

    .line 211
    iget-object v0, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$Builder;->configuration:Lcom/stripe/android/link/LinkConfiguration;

    const-class v1, Lcom/stripe/android/link/LinkConfiguration;

    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkBuilderRequirement(Ljava/lang/Object;Ljava/lang/Class;)V

    .line 212
    iget-object v0, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$Builder;->publishableKeyProvider:Lkotlin/jvm/functions/Function0;

    const-class v1, Lkotlin/jvm/functions/Function0;

    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkBuilderRequirement(Ljava/lang/Object;Ljava/lang/Class;)V

    .line 213
    iget-object v0, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$Builder;->stripeAccountIdProvider:Lkotlin/jvm/functions/Function0;

    const-class v1, Lkotlin/jvm/functions/Function0;

    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkBuilderRequirement(Ljava/lang/Object;Ljava/lang/Class;)V

    .line 214
    iget-object v0, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$Builder;->paymentElementCallbackIdentifier:Ljava/lang/String;

    const-class v1, Ljava/lang/String;

    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkBuilderRequirement(Ljava/lang/Object;Ljava/lang/Class;)V

    .line 215
    iget-object v0, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$Builder;->context:Landroid/content/Context;

    const-class v1, Landroid/content/Context;

    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkBuilderRequirement(Ljava/lang/Object;Ljava/lang/Class;)V

    .line 216
    iget-object v0, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$Builder;->savedStateHandle:Landroidx/lifecycle/SavedStateHandle;

    const-class v1, Landroidx/lifecycle/SavedStateHandle;

    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkBuilderRequirement(Ljava/lang/Object;Ljava/lang/Class;)V

    .line 217
    iget-object v0, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$Builder;->application:Landroid/app/Application;

    const-class v1, Landroid/app/Application;

    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkBuilderRequirement(Ljava/lang/Object;Ljava/lang/Class;)V

    .line 218
    iget-object v0, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$Builder;->linkExpressMode:Lcom/stripe/android/link/LinkExpressMode;

    const-class v1, Lcom/stripe/android/link/LinkExpressMode;

    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkBuilderRequirement(Ljava/lang/Object;Ljava/lang/Class;)V

    .line 219
    iget-object v0, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$Builder;->linkLaunchMode:Lcom/stripe/android/link/LinkLaunchMode;

    const-class v1, Lcom/stripe/android/link/LinkLaunchMode;

    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkBuilderRequirement(Ljava/lang/Object;Ljava/lang/Class;)V

    .line 220
    iget-object v0, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$Builder;->linkAccountUpdate:Lcom/stripe/android/link/LinkAccountUpdate$Value;

    const-class v1, Lcom/stripe/android/link/LinkAccountUpdate$Value;

    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkBuilderRequirement(Ljava/lang/Object;Ljava/lang/Class;)V

    .line 221
    new-instance v2, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$NativeLinkComponentImpl;

    iget-object v3, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$Builder;->configuration:Lcom/stripe/android/link/LinkConfiguration;

    iget-object v4, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$Builder;->publishableKeyProvider:Lkotlin/jvm/functions/Function0;

    iget-object v5, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$Builder;->stripeAccountIdProvider:Lkotlin/jvm/functions/Function0;

    iget-object v6, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$Builder;->paymentElementCallbackIdentifier:Ljava/lang/String;

    iget-object v7, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$Builder;->context:Landroid/content/Context;

    iget-object v8, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$Builder;->savedStateHandle:Landroidx/lifecycle/SavedStateHandle;

    iget-object v9, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$Builder;->statusBarColor:Ljava/lang/Integer;

    iget-object v10, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$Builder;->application:Landroid/app/Application;

    iget-object v11, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$Builder;->linkExpressMode:Lcom/stripe/android/link/LinkExpressMode;

    iget-object v12, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$Builder;->linkLaunchMode:Lcom/stripe/android/link/LinkLaunchMode;

    iget-object v13, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$Builder;->linkAccountUpdate:Lcom/stripe/android/link/LinkAccountUpdate$Value;

    const/4 v14, 0x0

    invoke-direct/range {v2 .. v14}, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$NativeLinkComponentImpl;-><init>(Lcom/stripe/android/link/LinkConfiguration;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Landroid/content/Context;Landroidx/lifecycle/SavedStateHandle;Ljava/lang/Integer;Landroid/app/Application;Lcom/stripe/android/link/LinkExpressMode;Lcom/stripe/android/link/LinkLaunchMode;Lcom/stripe/android/link/LinkAccountUpdate$Value;Lcom/stripe/android/link/injection/DaggerNativeLinkComponent-IA;)V

    return-object v2
.end method

.method public configuration(Lcom/stripe/android/link/LinkConfiguration;)Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$Builder;
    .locals 0

    .line 145
    invoke-static {p1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/link/LinkConfiguration;

    iput-object p1, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$Builder;->configuration:Lcom/stripe/android/link/LinkConfiguration;

    return-object p0
.end method

.method public bridge synthetic configuration(Lcom/stripe/android/link/LinkConfiguration;)Lcom/stripe/android/link/injection/NativeLinkComponent$Builder;
    .locals 0

    .line 120
    invoke-virtual {p0, p1}, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$Builder;->configuration(Lcom/stripe/android/link/LinkConfiguration;)Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$Builder;

    move-result-object p1

    return-object p1
.end method

.method public context(Landroid/content/Context;)Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$Builder;
    .locals 0

    .line 169
    invoke-static {p1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/Context;

    iput-object p1, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$Builder;->context:Landroid/content/Context;

    return-object p0
.end method

.method public bridge synthetic context(Landroid/content/Context;)Lcom/stripe/android/link/injection/NativeLinkComponent$Builder;
    .locals 0

    .line 120
    invoke-virtual {p0, p1}, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$Builder;->context(Landroid/content/Context;)Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$Builder;

    move-result-object p1

    return-object p1
.end method

.method public linkAccountUpdate(Lcom/stripe/android/link/LinkAccountUpdate$Value;)Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$Builder;
    .locals 0

    .line 205
    invoke-static {p1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/link/LinkAccountUpdate$Value;

    iput-object p1, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$Builder;->linkAccountUpdate:Lcom/stripe/android/link/LinkAccountUpdate$Value;

    return-object p0
.end method

.method public bridge synthetic linkAccountUpdate(Lcom/stripe/android/link/LinkAccountUpdate$Value;)Lcom/stripe/android/link/injection/NativeLinkComponent$Builder;
    .locals 0

    .line 120
    invoke-virtual {p0, p1}, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$Builder;->linkAccountUpdate(Lcom/stripe/android/link/LinkAccountUpdate$Value;)Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$Builder;

    move-result-object p1

    return-object p1
.end method

.method public linkExpressMode(Lcom/stripe/android/link/LinkExpressMode;)Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$Builder;
    .locals 0

    .line 193
    invoke-static {p1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/link/LinkExpressMode;

    iput-object p1, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$Builder;->linkExpressMode:Lcom/stripe/android/link/LinkExpressMode;

    return-object p0
.end method

.method public bridge synthetic linkExpressMode(Lcom/stripe/android/link/LinkExpressMode;)Lcom/stripe/android/link/injection/NativeLinkComponent$Builder;
    .locals 0

    .line 120
    invoke-virtual {p0, p1}, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$Builder;->linkExpressMode(Lcom/stripe/android/link/LinkExpressMode;)Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$Builder;

    move-result-object p1

    return-object p1
.end method

.method public linkLaunchMode(Lcom/stripe/android/link/LinkLaunchMode;)Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$Builder;
    .locals 0

    .line 199
    invoke-static {p1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/link/LinkLaunchMode;

    iput-object p1, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$Builder;->linkLaunchMode:Lcom/stripe/android/link/LinkLaunchMode;

    return-object p0
.end method

.method public bridge synthetic linkLaunchMode(Lcom/stripe/android/link/LinkLaunchMode;)Lcom/stripe/android/link/injection/NativeLinkComponent$Builder;
    .locals 0

    .line 120
    invoke-virtual {p0, p1}, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$Builder;->linkLaunchMode(Lcom/stripe/android/link/LinkLaunchMode;)Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$Builder;

    move-result-object p1

    return-object p1
.end method

.method public paymentElementCallbackIdentifier(Ljava/lang/String;)Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$Builder;
    .locals 0

    .line 163
    invoke-static {p1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iput-object p1, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$Builder;->paymentElementCallbackIdentifier:Ljava/lang/String;

    return-object p0
.end method

.method public bridge synthetic paymentElementCallbackIdentifier(Ljava/lang/String;)Lcom/stripe/android/link/injection/NativeLinkComponent$Builder;
    .locals 0

    .line 120
    invoke-virtual {p0, p1}, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$Builder;->paymentElementCallbackIdentifier(Ljava/lang/String;)Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$Builder;

    move-result-object p1

    return-object p1
.end method

.method public publishableKeyProvider(Lkotlin/jvm/functions/Function0;)Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$Builder;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$Builder;"
        }
    .end annotation

    .line 151
    invoke-static {p1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lkotlin/jvm/functions/Function0;

    iput-object p1, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$Builder;->publishableKeyProvider:Lkotlin/jvm/functions/Function0;

    return-object p0
.end method

.method public bridge synthetic publishableKeyProvider(Lkotlin/jvm/functions/Function0;)Lcom/stripe/android/link/injection/NativeLinkComponent$Builder;
    .locals 0

    .line 120
    invoke-virtual {p0, p1}, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$Builder;->publishableKeyProvider(Lkotlin/jvm/functions/Function0;)Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$Builder;

    move-result-object p1

    return-object p1
.end method

.method public savedStateHandle(Landroidx/lifecycle/SavedStateHandle;)Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$Builder;
    .locals 0

    .line 175
    invoke-static {p1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/lifecycle/SavedStateHandle;

    iput-object p1, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$Builder;->savedStateHandle:Landroidx/lifecycle/SavedStateHandle;

    return-object p0
.end method

.method public bridge synthetic savedStateHandle(Landroidx/lifecycle/SavedStateHandle;)Lcom/stripe/android/link/injection/NativeLinkComponent$Builder;
    .locals 0

    .line 120
    invoke-virtual {p0, p1}, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$Builder;->savedStateHandle(Landroidx/lifecycle/SavedStateHandle;)Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$Builder;

    move-result-object p1

    return-object p1
.end method

.method public statusBarColor(Ljava/lang/Integer;)Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$Builder;
    .locals 0

    .line 181
    iput-object p1, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$Builder;->statusBarColor:Ljava/lang/Integer;

    return-object p0
.end method

.method public bridge synthetic statusBarColor(Ljava/lang/Integer;)Lcom/stripe/android/link/injection/NativeLinkComponent$Builder;
    .locals 0

    .line 120
    invoke-virtual {p0, p1}, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$Builder;->statusBarColor(Ljava/lang/Integer;)Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$Builder;

    move-result-object p1

    return-object p1
.end method

.method public stripeAccountIdProvider(Lkotlin/jvm/functions/Function0;)Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$Builder;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$Builder;"
        }
    .end annotation

    .line 157
    invoke-static {p1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lkotlin/jvm/functions/Function0;

    iput-object p1, p0, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$Builder;->stripeAccountIdProvider:Lkotlin/jvm/functions/Function0;

    return-object p0
.end method

.method public bridge synthetic stripeAccountIdProvider(Lkotlin/jvm/functions/Function0;)Lcom/stripe/android/link/injection/NativeLinkComponent$Builder;
    .locals 0

    .line 120
    invoke-virtual {p0, p1}, Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$Builder;->stripeAccountIdProvider(Lkotlin/jvm/functions/Function0;)Lcom/stripe/android/link/injection/DaggerNativeLinkComponent$Builder;

    move-result-object p1

    return-object p1
.end method
