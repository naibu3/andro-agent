.class public final Lcom/stripe/android/stripe3ds2/init/DefaultSecurityChecker;
.super Ljava/lang/Object;
.source "SecurityChecker.kt"

# interfaces
.implements Lcom/stripe/android/stripe3ds2/init/SecurityChecker;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/stripe3ds2/init/DefaultSecurityChecker$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nSecurityChecker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SecurityChecker.kt\ncom/stripe/android/stripe3ds2/init/DefaultSecurityChecker\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,34:1\n774#2:35\n865#2,2:36\n1557#2:38\n1628#2,3:39\n*S KotlinDebug\n*F\n+ 1 SecurityChecker.kt\ncom/stripe/android/stripe3ds2/init/DefaultSecurityChecker\n*L\n20#1:35\n20#1:36,2\n21#1:38\n21#1:39,3\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0000\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0019\u0008\u0000\u0012\u000e\u0008\u0002\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u000e\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0003H\u0016R\u0014\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"
    }
    d2 = {
        "Lcom/stripe/android/stripe3ds2/init/DefaultSecurityChecker;",
        "Lcom/stripe/android/stripe3ds2/init/SecurityChecker;",
        "securityChecks",
        "",
        "Lcom/stripe/android/stripe3ds2/init/SecurityCheck;",
        "<init>",
        "(Ljava/util/List;)V",
        "getWarnings",
        "Lcom/stripe/android/stripe3ds2/init/Warning;",
        "Companion",
        "3ds2sdk_release"
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
.field private static final Companion:Lcom/stripe/android/stripe3ds2/init/DefaultSecurityChecker$Companion;

.field private static final DEFAULT_CHECKS:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/stripe/android/stripe3ds2/init/SecurityCheck;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final securityChecks:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/stripe/android/stripe3ds2/init/SecurityCheck;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lcom/stripe/android/stripe3ds2/init/DefaultSecurityChecker$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/stripe3ds2/init/DefaultSecurityChecker$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/init/DefaultSecurityChecker;->Companion:Lcom/stripe/android/stripe3ds2/init/DefaultSecurityChecker$Companion;

    const/4 v0, 0x5

    .line 26
    new-array v0, v0, [Lcom/stripe/android/stripe3ds2/init/SecurityCheck;

    new-instance v2, Lcom/stripe/android/stripe3ds2/init/SecurityCheck$RootedCheck;

    invoke-direct {v2}, Lcom/stripe/android/stripe3ds2/init/SecurityCheck$RootedCheck;-><init>()V

    const/4 v3, 0x0

    aput-object v2, v0, v3

    .line 27
    new-instance v2, Lcom/stripe/android/stripe3ds2/init/SecurityCheck$Tampered;

    invoke-direct {v2}, Lcom/stripe/android/stripe3ds2/init/SecurityCheck$Tampered;-><init>()V

    const/4 v4, 0x1

    aput-object v2, v0, v4

    .line 28
    new-instance v2, Lcom/stripe/android/stripe3ds2/init/SecurityCheck$Emulator;

    invoke-direct {v2}, Lcom/stripe/android/stripe3ds2/init/SecurityCheck$Emulator;-><init>()V

    const/4 v5, 0x2

    aput-object v2, v0, v5

    .line 29
    new-instance v2, Lcom/stripe/android/stripe3ds2/init/SecurityCheck$DebuggerAttached;

    invoke-direct {v2, v3, v4, v1}, Lcom/stripe/android/stripe3ds2/init/SecurityCheck$DebuggerAttached;-><init>(ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v1, 0x3

    aput-object v2, v0, v1

    .line 30
    new-instance v1, Lcom/stripe/android/stripe3ds2/init/SecurityCheck$UnsupportedOS;

    invoke-direct {v1}, Lcom/stripe/android/stripe3ds2/init/SecurityCheck$UnsupportedOS;-><init>()V

    const/4 v2, 0x4

    aput-object v1, v0, v2

    .line 25
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/stripe3ds2/init/DefaultSecurityChecker;->DEFAULT_CHECKS:Ljava/util/List;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1, v0}, Lcom/stripe/android/stripe3ds2/init/DefaultSecurityChecker;-><init>(Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lcom/stripe/android/stripe3ds2/init/SecurityCheck;",
            ">;)V"
        }
    .end annotation

    const-string v0, "securityChecks"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    iput-object p1, p0, Lcom/stripe/android/stripe3ds2/init/DefaultSecurityChecker;->securityChecks:Ljava/util/List;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    .line 16
    sget-object p1, Lcom/stripe/android/stripe3ds2/init/DefaultSecurityChecker;->DEFAULT_CHECKS:Ljava/util/List;

    .line 15
    :cond_0
    invoke-direct {p0, p1}, Lcom/stripe/android/stripe3ds2/init/DefaultSecurityChecker;-><init>(Ljava/util/List;)V

    return-void
.end method

.method public static final synthetic access$getDEFAULT_CHECKS$cp()Ljava/util/List;
    .locals 1

    .line 15
    sget-object v0, Lcom/stripe/android/stripe3ds2/init/DefaultSecurityChecker;->DEFAULT_CHECKS:Ljava/util/List;

    return-object v0
.end method


# virtual methods
.method public getWarnings()Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/stripe/android/stripe3ds2/init/Warning;",
            ">;"
        }
    .end annotation

    .line 19
    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/init/DefaultSecurityChecker;->securityChecks:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    .line 35
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    check-cast v1, Ljava/util/Collection;

    .line 36
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lcom/stripe/android/stripe3ds2/init/SecurityCheck;

    .line 20
    invoke-virtual {v3}, Lcom/stripe/android/stripe3ds2/init/SecurityCheck;->check()Z

    move-result v3

    if-eqz v3, :cond_0

    .line 36
    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 37
    :cond_1
    check-cast v1, Ljava/util/List;

    .line 35
    check-cast v1, Ljava/lang/Iterable;

    .line 38
    new-instance v0, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v1, v2}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v0, Ljava/util/Collection;

    .line 39
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    .line 40
    check-cast v2, Lcom/stripe/android/stripe3ds2/init/SecurityCheck;

    .line 21
    invoke-virtual {v2}, Lcom/stripe/android/stripe3ds2/init/SecurityCheck;->getWarning()Lcom/stripe/android/stripe3ds2/init/Warning;

    move-result-object v2

    .line 40
    invoke-interface {v0, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 41
    :cond_2
    check-cast v0, Ljava/util/List;

    return-object v0
.end method
