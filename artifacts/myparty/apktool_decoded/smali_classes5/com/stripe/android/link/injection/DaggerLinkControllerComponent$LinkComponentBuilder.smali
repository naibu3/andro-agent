.class final Lcom/stripe/android/link/injection/DaggerLinkControllerComponent$LinkComponentBuilder;
.super Ljava/lang/Object;
.source "DaggerLinkControllerComponent.java"

# interfaces
.implements Lcom/stripe/android/link/injection/LinkComponent$Builder;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/link/injection/DaggerLinkControllerComponent;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "LinkComponentBuilder"
.end annotation


# instance fields
.field private configuration:Lcom/stripe/android/link/LinkConfiguration;

.field private final linkControllerComponentImpl:Lcom/stripe/android/link/injection/DaggerLinkControllerComponent$LinkControllerComponentImpl;


# direct methods
.method private constructor <init>(Lcom/stripe/android/link/injection/DaggerLinkControllerComponent$LinkControllerComponentImpl;)V
    .locals 0

    .line 160
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 161
    iput-object p1, p0, Lcom/stripe/android/link/injection/DaggerLinkControllerComponent$LinkComponentBuilder;->linkControllerComponentImpl:Lcom/stripe/android/link/injection/DaggerLinkControllerComponent$LinkControllerComponentImpl;

    return-void
.end method

.method synthetic constructor <init>(Lcom/stripe/android/link/injection/DaggerLinkControllerComponent$LinkControllerComponentImpl;Lcom/stripe/android/link/injection/DaggerLinkControllerComponent-IA;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/stripe/android/link/injection/DaggerLinkControllerComponent$LinkComponentBuilder;-><init>(Lcom/stripe/android/link/injection/DaggerLinkControllerComponent$LinkControllerComponentImpl;)V

    return-void
.end method


# virtual methods
.method public build()Lcom/stripe/android/link/injection/LinkComponent;
    .locals 4

    .line 172
    iget-object v0, p0, Lcom/stripe/android/link/injection/DaggerLinkControllerComponent$LinkComponentBuilder;->configuration:Lcom/stripe/android/link/LinkConfiguration;

    const-class v1, Lcom/stripe/android/link/LinkConfiguration;

    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkBuilderRequirement(Ljava/lang/Object;Ljava/lang/Class;)V

    .line 173
    new-instance v0, Lcom/stripe/android/link/injection/DaggerLinkControllerComponent$LinkComponentImpl;

    iget-object v1, p0, Lcom/stripe/android/link/injection/DaggerLinkControllerComponent$LinkComponentBuilder;->linkControllerComponentImpl:Lcom/stripe/android/link/injection/DaggerLinkControllerComponent$LinkControllerComponentImpl;

    iget-object v2, p0, Lcom/stripe/android/link/injection/DaggerLinkControllerComponent$LinkComponentBuilder;->configuration:Lcom/stripe/android/link/LinkConfiguration;

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lcom/stripe/android/link/injection/DaggerLinkControllerComponent$LinkComponentImpl;-><init>(Lcom/stripe/android/link/injection/DaggerLinkControllerComponent$LinkControllerComponentImpl;Lcom/stripe/android/link/LinkConfiguration;Lcom/stripe/android/link/injection/DaggerLinkControllerComponent-IA;)V

    return-object v0
.end method

.method public configuration(Lcom/stripe/android/link/LinkConfiguration;)Lcom/stripe/android/link/injection/DaggerLinkControllerComponent$LinkComponentBuilder;
    .locals 0

    .line 166
    invoke-static {p1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/link/LinkConfiguration;

    iput-object p1, p0, Lcom/stripe/android/link/injection/DaggerLinkControllerComponent$LinkComponentBuilder;->configuration:Lcom/stripe/android/link/LinkConfiguration;

    return-object p0
.end method

.method public bridge synthetic configuration(Lcom/stripe/android/link/LinkConfiguration;)Lcom/stripe/android/link/injection/LinkComponent$Builder;
    .locals 0

    .line 155
    invoke-virtual {p0, p1}, Lcom/stripe/android/link/injection/DaggerLinkControllerComponent$LinkComponentBuilder;->configuration(Lcom/stripe/android/link/LinkConfiguration;)Lcom/stripe/android/link/injection/DaggerLinkControllerComponent$LinkComponentBuilder;

    move-result-object p1

    return-object p1
.end method
