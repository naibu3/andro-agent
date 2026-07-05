.class public final Lexpo/modules/filesystem/FilePickerContract;
.super Ljava/lang/Object;
.source "FilePickerContract.kt"

# interfaces
.implements Lexpo/modules/kotlin/activityresult/AppContextActivityResultContract;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lexpo/modules/filesystem/FilePickerContract$WhenMappings;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lexpo/modules/kotlin/activityresult/AppContextActivityResultContract<",
        "Lexpo/modules/filesystem/FilePickerContractOptions;",
        "Lexpo/modules/filesystem/FilePickerContractResult;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nFilePickerContract.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FilePickerContract.kt\nexpo/modules/filesystem/FilePickerContract\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,72:1\n1#2:73\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0018\u0010\u000c\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0002H\u0016J\"\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00132\u0008\u0010\u0014\u001a\u0004\u0018\u00010\rH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0008\u001a\u00020\t8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\n\u0010\u000b\u00a8\u0006\u0015"
    }
    d2 = {
        "Lexpo/modules/filesystem/FilePickerContract;",
        "Lexpo/modules/kotlin/activityresult/AppContextActivityResultContract;",
        "Lexpo/modules/filesystem/FilePickerContractOptions;",
        "Lexpo/modules/filesystem/FilePickerContractResult;",
        "appContextProvider",
        "Lexpo/modules/kotlin/providers/AppContextProvider;",
        "<init>",
        "(Lexpo/modules/kotlin/providers/AppContextProvider;)V",
        "contentResolver",
        "Landroid/content/ContentResolver;",
        "getContentResolver",
        "()Landroid/content/ContentResolver;",
        "createIntent",
        "Landroid/content/Intent;",
        "context",
        "Landroid/content/Context;",
        "input",
        "parseResult",
        "resultCode",
        "",
        "intent",
        "expo-file-system_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final appContextProvider:Lexpo/modules/kotlin/providers/AppContextProvider;


# direct methods
.method public constructor <init>(Lexpo/modules/kotlin/providers/AppContextProvider;)V
    .locals 1

    const-string v0, "appContextProvider"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lexpo/modules/filesystem/FilePickerContract;->appContextProvider:Lexpo/modules/kotlin/providers/AppContextProvider;

    return-void
.end method

.method private final getContentResolver()Landroid/content/ContentResolver;
    .locals 2

    .line 18
    iget-object v0, p0, Lexpo/modules/filesystem/FilePickerContract;->appContextProvider:Lexpo/modules/kotlin/providers/AppContextProvider;

    invoke-interface {v0}, Lexpo/modules/kotlin/providers/AppContextProvider;->getAppContext()Lexpo/modules/kotlin/AppContext;

    move-result-object v0

    invoke-virtual {v0}, Lexpo/modules/kotlin/AppContext;->getReactContext()Landroid/content/Context;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 20
    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    const-string v1, "getContentResolver(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0

    .line 18
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "React Application Context is null"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public createIntent(Landroid/content/Context;Lexpo/modules/filesystem/FilePickerContractOptions;)Landroid/content/Intent;
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "input"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    invoke-virtual {p2}, Lexpo/modules/filesystem/FilePickerContractOptions;->getPickerType()Lexpo/modules/filesystem/PickerType;

    move-result-object p1

    sget-object v0, Lexpo/modules/filesystem/PickerType;->FILE:Lexpo/modules/filesystem/PickerType;

    if-ne p1, v0, :cond_1

    .line 24
    new-instance p1, Landroid/content/Intent;

    const-string v0, "android.intent.action.OPEN_DOCUMENT"

    invoke-direct {p1, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 26
    invoke-virtual {p2}, Lexpo/modules/filesystem/FilePickerContractOptions;->getMimeType()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    const-string v0, "*/*"

    :cond_0
    invoke-virtual {p1, v0}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    goto :goto_0

    .line 29
    :cond_1
    new-instance p1, Landroid/content/Intent;

    const-string v0, "android.intent.action.OPEN_DOCUMENT_TREE"

    invoke-direct {p1, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 32
    :goto_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    if-lt v0, v1, :cond_2

    .line 33
    invoke-virtual {p2}, Lexpo/modules/filesystem/FilePickerContractOptions;->getInitialUri()Landroid/net/Uri;

    move-result-object p2

    const-string v0, "android.provider.extra.INITIAL_URI"

    check-cast p2, Landroid/os/Parcelable;

    invoke-virtual {p1, v0, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    :cond_2
    return-object p1
.end method

.method public bridge synthetic createIntent(Landroid/content/Context;Ljava/io/Serializable;)Landroid/content/Intent;
    .locals 0

    .line 15
    check-cast p2, Lexpo/modules/filesystem/FilePickerContractOptions;

    invoke-virtual {p0, p1, p2}, Lexpo/modules/filesystem/FilePickerContract;->createIntent(Landroid/content/Context;Lexpo/modules/filesystem/FilePickerContractOptions;)Landroid/content/Intent;

    move-result-object p1

    return-object p1
.end method

.method public parseResult(Lexpo/modules/filesystem/FilePickerContractOptions;ILandroid/content/Intent;)Lexpo/modules/filesystem/FilePickerContractResult;
    .locals 1

    const-string v0, "input"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p2, :cond_6

    if-nez p3, :cond_0

    goto :goto_1

    .line 41
    :cond_0
    invoke-virtual {p3}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object p2

    .line 42
    invoke-virtual {p3}, Landroid/content/Intent;->getFlags()I

    move-result p3

    and-int/lit8 p3, p3, 0x3

    if-eqz p2, :cond_1

    .line 44
    invoke-direct {p0}, Lexpo/modules/filesystem/FilePickerContract;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    invoke-virtual {v0, p2, p3}, Landroid/content/ContentResolver;->takePersistableUriPermission(Landroid/net/Uri;I)V

    .line 46
    :cond_1
    invoke-virtual {p1}, Lexpo/modules/filesystem/FilePickerContractOptions;->getPickerType()Lexpo/modules/filesystem/PickerType;

    move-result-object p1

    sget-object p3, Lexpo/modules/filesystem/FilePickerContract$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {p1}, Lexpo/modules/filesystem/PickerType;->ordinal()I

    move-result p1

    aget p1, p3, p1

    const/4 p3, 0x1

    if-eq p1, p3, :cond_4

    const/4 p3, 0x2

    if-ne p1, p3, :cond_3

    .line 55
    new-instance p1, Lexpo/modules/filesystem/FilePickerContractResult$Success;

    new-instance p3, Lexpo/modules/filesystem/FileSystemFile;

    if-nez p2, :cond_2

    sget-object p2, Landroid/net/Uri;->EMPTY:Landroid/net/Uri;

    :cond_2
    invoke-static {p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-direct {p3, p2}, Lexpo/modules/filesystem/FileSystemFile;-><init>(Landroid/net/Uri;)V

    check-cast p3, Lexpo/modules/filesystem/FileSystemPath;

    invoke-direct {p1, p3}, Lexpo/modules/filesystem/FilePickerContractResult$Success;-><init>(Lexpo/modules/filesystem/FileSystemPath;)V

    goto :goto_0

    .line 46
    :cond_3
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    .line 47
    :cond_4
    new-instance p1, Lexpo/modules/filesystem/FilePickerContractResult$Success;

    .line 48
    new-instance p3, Lexpo/modules/filesystem/FileSystemDirectory;

    if-nez p2, :cond_5

    .line 50
    sget-object p2, Landroid/net/Uri;->EMPTY:Landroid/net/Uri;

    .line 49
    :cond_5
    invoke-static {p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 48
    invoke-direct {p3, p2}, Lexpo/modules/filesystem/FileSystemDirectory;-><init>(Landroid/net/Uri;)V

    check-cast p3, Lexpo/modules/filesystem/FileSystemPath;

    .line 47
    invoke-direct {p1, p3}, Lexpo/modules/filesystem/FilePickerContractResult$Success;-><init>(Lexpo/modules/filesystem/FileSystemPath;)V

    .line 46
    :goto_0
    check-cast p1, Lexpo/modules/filesystem/FilePickerContractResult;

    return-object p1

    .line 39
    :cond_6
    :goto_1
    sget-object p1, Lexpo/modules/filesystem/FilePickerContractResult$Cancelled;->INSTANCE:Lexpo/modules/filesystem/FilePickerContractResult$Cancelled;

    check-cast p1, Lexpo/modules/filesystem/FilePickerContractResult;

    return-object p1
.end method

.method public bridge synthetic parseResult(Ljava/io/Serializable;ILandroid/content/Intent;)Ljava/lang/Object;
    .locals 0

    .line 15
    check-cast p1, Lexpo/modules/filesystem/FilePickerContractOptions;

    invoke-virtual {p0, p1, p2, p3}, Lexpo/modules/filesystem/FilePickerContract;->parseResult(Lexpo/modules/filesystem/FilePickerContractOptions;ILandroid/content/Intent;)Lexpo/modules/filesystem/FilePickerContractResult;

    move-result-object p1

    return-object p1
.end method
