.class public interface abstract Lcom/stripe/android/link/injection/LinkModule;
.super Ljava/lang/Object;
.source "LinkModule.kt"


# annotations
.annotation runtime Ldagger/Module;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/link/injection/LinkModule$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008a\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\tH\'J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0008\u001a\u00020\u000cH\'J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\'\u00a8\u0006\u0012"
    }
    d2 = {
        "Lcom/stripe/android/link/injection/LinkModule;",
        "",
        "bindLinkAccountManager",
        "Lcom/stripe/android/link/account/LinkAccountManager;",
        "linkAccountManager",
        "Lcom/stripe/android/link/account/DefaultLinkAccountManager;",
        "bindsLinkGate",
        "Lcom/stripe/android/link/gate/LinkGate;",
        "linkGate",
        "Lcom/stripe/android/link/gate/DefaultLinkGate;",
        "bindsLinkAuth",
        "Lcom/stripe/android/link/account/LinkAuth;",
        "Lcom/stripe/android/link/account/DefaultLinkAuth;",
        "bindsLinkAttestationCheck",
        "Lcom/stripe/android/link/attestation/LinkAttestationCheck;",
        "linkAttestationCheck",
        "Lcom/stripe/android/link/attestation/DefaultLinkAttestationCheck;",
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
.field public static final Companion:Lcom/stripe/android/link/injection/LinkModule$Companion;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lcom/stripe/android/link/injection/LinkModule$Companion;->$$INSTANCE:Lcom/stripe/android/link/injection/LinkModule$Companion;

    sput-object v0, Lcom/stripe/android/link/injection/LinkModule;->Companion:Lcom/stripe/android/link/injection/LinkModule$Companion;

    return-void
.end method


# virtual methods
.method public abstract bindLinkAccountManager(Lcom/stripe/android/link/account/DefaultLinkAccountManager;)Lcom/stripe/android/link/account/LinkAccountManager;
    .annotation runtime Lcom/stripe/android/link/injection/LinkScope;
    .end annotation

    .annotation runtime Ldagger/Binds;
    .end annotation
.end method

.method public abstract bindsLinkAttestationCheck(Lcom/stripe/android/link/attestation/DefaultLinkAttestationCheck;)Lcom/stripe/android/link/attestation/LinkAttestationCheck;
    .annotation runtime Lcom/stripe/android/link/injection/LinkScope;
    .end annotation

    .annotation runtime Ldagger/Binds;
    .end annotation
.end method

.method public abstract bindsLinkAuth(Lcom/stripe/android/link/account/DefaultLinkAuth;)Lcom/stripe/android/link/account/LinkAuth;
    .annotation runtime Lcom/stripe/android/link/injection/LinkScope;
    .end annotation

    .annotation runtime Ldagger/Binds;
    .end annotation
.end method

.method public abstract bindsLinkGate(Lcom/stripe/android/link/gate/DefaultLinkGate;)Lcom/stripe/android/link/gate/LinkGate;
    .annotation runtime Lcom/stripe/android/link/injection/LinkScope;
    .end annotation

    .annotation runtime Ldagger/Binds;
    .end annotation
.end method
