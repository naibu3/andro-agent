.class public final Lexpo/modules/kotlin/types/ValueOrUndefined$Undefined;
.super Ljava/lang/Object;
.source "ValueOrUndefined.kt"

# interfaces
.implements Lexpo/modules/kotlin/types/ValueOrUndefined;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lexpo/modules/kotlin/types/ValueOrUndefined;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Undefined"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0008\u0003\u0008\u00c6\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0005"
    }
    d2 = {
        "Lexpo/modules/kotlin/types/ValueOrUndefined$Undefined;",
        "Lexpo/modules/kotlin/types/ValueOrUndefined;",
        "",
        "<init>",
        "()V",
        "expo-modules-core_release"
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
.field public static final INSTANCE:Lexpo/modules/kotlin/types/ValueOrUndefined$Undefined;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lexpo/modules/kotlin/types/ValueOrUndefined$Undefined;

    invoke-direct {v0}, Lexpo/modules/kotlin/types/ValueOrUndefined$Undefined;-><init>()V

    sput-object v0, Lexpo/modules/kotlin/types/ValueOrUndefined$Undefined;->INSTANCE:Lexpo/modules/kotlin/types/ValueOrUndefined$Undefined;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic getOptional()Ljava/lang/Object;
    .locals 1

    .line 17
    invoke-virtual {p0}, Lexpo/modules/kotlin/types/ValueOrUndefined$Undefined;->getOptional()Ljava/lang/Void;

    move-result-object v0

    return-object v0
.end method

.method public getOptional()Ljava/lang/Void;
    .locals 1

    .line 17
    invoke-static {p0}, Lexpo/modules/kotlin/types/ValueOrUndefined$DefaultImpls;->getOptional(Lexpo/modules/kotlin/types/ValueOrUndefined;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Void;

    return-object v0
.end method

.method public isUndefined()Z
    .locals 1

    .line 17
    invoke-static {p0}, Lexpo/modules/kotlin/types/ValueOrUndefined$DefaultImpls;->isUndefined(Lexpo/modules/kotlin/types/ValueOrUndefined;)Z

    move-result v0

    return v0
.end method
