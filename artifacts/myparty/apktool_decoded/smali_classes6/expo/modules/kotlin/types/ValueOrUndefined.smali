.class public interface abstract Lexpo/modules/kotlin/types/ValueOrUndefined;
.super Ljava/lang/Object;
.source "ValueOrUndefined.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lexpo/modules/kotlin/types/ValueOrUndefined$Companion;,
        Lexpo/modules/kotlin/types/ValueOrUndefined$DefaultImpls;,
        Lexpo/modules/kotlin/types/ValueOrUndefined$Undefined;,
        Lexpo/modules/kotlin/types/ValueOrUndefined$Value;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0008w\u0018\u0000 \u000b*\u0004\u0008\u0000\u0010\u00012\u00020\u0002:\u0003\t\n\u000bR\u0014\u0010\u0003\u001a\u00020\u00048VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0003\u0010\u0005R\u0016\u0010\u0006\u001a\u0004\u0018\u00018\u00008VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0007\u0010\u0008\u0082\u0001\u0002\u000c\r\u00a8\u0006\u000e"
    }
    d2 = {
        "Lexpo/modules/kotlin/types/ValueOrUndefined;",
        "T",
        "",
        "isUndefined",
        "",
        "()Z",
        "optional",
        "getOptional",
        "()Ljava/lang/Object;",
        "Value",
        "Undefined",
        "Companion",
        "Lexpo/modules/kotlin/types/ValueOrUndefined$Undefined;",
        "Lexpo/modules/kotlin/types/ValueOrUndefined$Value;",
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
.field public static final Companion:Lexpo/modules/kotlin/types/ValueOrUndefined$Companion;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lexpo/modules/kotlin/types/ValueOrUndefined$Companion;->$$INSTANCE:Lexpo/modules/kotlin/types/ValueOrUndefined$Companion;

    sput-object v0, Lexpo/modules/kotlin/types/ValueOrUndefined;->Companion:Lexpo/modules/kotlin/types/ValueOrUndefined$Companion;

    return-void
.end method

.method public static getUndefined()Ljava/lang/Object;
    .locals 1
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    sget-object v0, Lexpo/modules/kotlin/types/ValueOrUndefined;->Companion:Lexpo/modules/kotlin/types/ValueOrUndefined$Companion;

    invoke-virtual {v0}, Lexpo/modules/kotlin/types/ValueOrUndefined$Companion;->getUndefined()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public abstract getOptional()Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation
.end method

.method public abstract isUndefined()Z
.end method
