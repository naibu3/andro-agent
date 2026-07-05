.class final Lexpo/modules/filesystem/legacy/FileSystemLegacyModule$definition$1$20$request$1;
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


# static fields
.field public static final INSTANCE:Lexpo/modules/filesystem/legacy/FileSystemLegacyModule$definition$1$20$request$1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lexpo/modules/filesystem/legacy/FileSystemLegacyModule$definition$1$20$request$1;

    invoke-direct {v0}, Lexpo/modules/filesystem/legacy/FileSystemLegacyModule$definition$1$20$request$1;-><init>()V

    sput-object v0, Lexpo/modules/filesystem/legacy/FileSystemLegacyModule$definition$1$20$request$1;->INSTANCE:Lexpo/modules/filesystem/legacy/FileSystemLegacyModule$definition$1$20$request$1;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final decorate(Lokhttp3/RequestBody;)Lokhttp3/RequestBody;
    .locals 1

    const-string v0, "requestBody"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method
