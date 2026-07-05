.class final Lexpo/modules/filesystem/legacy/FileSystemLegacyModule$definition$1$21$request$1;
.super Ljava/lang/Object;
.source "FileSystemLegacyModule.kt"

# interfaces
.implements Lexpo/modules/filesystem/legacy/RequestBodyDecorator;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lexpo/modules/filesystem/legacy/FileSystemLegacyModule;->definition()Lexpo/modules/kotlin/modules/ModuleDefinitionData;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $progressListener:Lexpo/modules/filesystem/legacy/CountingRequestListener;


# direct methods
.method constructor <init>(Lexpo/modules/filesystem/legacy/CountingRequestListener;)V
    .locals 0

    iput-object p1, p0, Lexpo/modules/filesystem/legacy/FileSystemLegacyModule$definition$1$21$request$1;->$progressListener:Lexpo/modules/filesystem/legacy/CountingRequestListener;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final decorate(Lokhttp3/RequestBody;)Lokhttp3/RequestBody;
    .locals 2

    const-string v0, "requestBody"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 537
    new-instance v0, Lexpo/modules/filesystem/legacy/CountingRequestBody;

    iget-object v1, p0, Lexpo/modules/filesystem/legacy/FileSystemLegacyModule$definition$1$21$request$1;->$progressListener:Lexpo/modules/filesystem/legacy/CountingRequestListener;

    invoke-direct {v0, p1, v1}, Lexpo/modules/filesystem/legacy/CountingRequestBody;-><init>(Lokhttp3/RequestBody;Lexpo/modules/filesystem/legacy/CountingRequestListener;)V

    check-cast v0, Lokhttp3/RequestBody;

    return-object v0
.end method
