.class public interface abstract Lcom/stripe/android/link/injection/LinkCommonModule;
.super Ljava/lang/Object;
.source "LinkCommonModule.kt"


# annotations
.annotation runtime Ldagger/Module;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/link/injection/LinkCommonModule$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008a\u0018\u0000 \n2\u00020\u0001:\u0001\nJ\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\tH\'\u00a8\u0006\u000b"
    }
    d2 = {
        "Lcom/stripe/android/link/injection/LinkCommonModule;",
        "",
        "bindLinkRepository",
        "Lcom/stripe/android/link/repositories/LinkRepository;",
        "linkApiRepository",
        "Lcom/stripe/android/link/repositories/LinkApiRepository;",
        "bindLinkEventsReporter",
        "Lcom/stripe/android/link/analytics/LinkEventsReporter;",
        "linkEventsReporter",
        "Lcom/stripe/android/link/analytics/DefaultLinkEventsReporter;",
        "Companion",
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


# static fields
.field public static final Companion:Lcom/stripe/android/link/injection/LinkCommonModule$Companion;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lcom/stripe/android/link/injection/LinkCommonModule$Companion;->$$INSTANCE:Lcom/stripe/android/link/injection/LinkCommonModule$Companion;

    sput-object v0, Lcom/stripe/android/link/injection/LinkCommonModule;->Companion:Lcom/stripe/android/link/injection/LinkCommonModule$Companion;

    return-void
.end method


# virtual methods
.method public abstract bindLinkEventsReporter(Lcom/stripe/android/link/analytics/DefaultLinkEventsReporter;)Lcom/stripe/android/link/analytics/LinkEventsReporter;
    .annotation runtime Ldagger/Binds;
    .end annotation

    .annotation runtime Ljavax/inject/Singleton;
    .end annotation
.end method

.method public abstract bindLinkRepository(Lcom/stripe/android/link/repositories/LinkApiRepository;)Lcom/stripe/android/link/repositories/LinkRepository;
    .annotation runtime Ldagger/Binds;
    .end annotation

    .annotation runtime Ljavax/inject/Singleton;
    .end annotation
.end method
