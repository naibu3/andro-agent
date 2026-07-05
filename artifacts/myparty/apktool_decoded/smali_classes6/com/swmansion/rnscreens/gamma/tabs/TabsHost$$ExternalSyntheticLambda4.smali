.class public final synthetic Lcom/swmansion/rnscreens/gamma/tabs/TabsHost$$ExternalSyntheticLambda4;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic f$0:Lcom/swmansion/rnscreens/gamma/tabs/TabScreen;


# direct methods
.method public synthetic constructor <init>(Lcom/swmansion/rnscreens/gamma/tabs/TabScreen;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost$$ExternalSyntheticLambda4;->f$0:Lcom/swmansion/rnscreens/gamma/tabs/TabScreen;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 0
    iget-object v0, p0, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost$$ExternalSyntheticLambda4;->f$0:Lcom/swmansion/rnscreens/gamma/tabs/TabScreen;

    check-cast p1, Lcom/swmansion/rnscreens/gamma/tabs/TabScreenFragment;

    invoke-static {v0, p1}, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost;->$r8$lambda$WDaHbyfRLC_4hCnGOWlKrTPOoLA(Lcom/swmansion/rnscreens/gamma/tabs/TabScreen;Lcom/swmansion/rnscreens/gamma/tabs/TabScreenFragment;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
