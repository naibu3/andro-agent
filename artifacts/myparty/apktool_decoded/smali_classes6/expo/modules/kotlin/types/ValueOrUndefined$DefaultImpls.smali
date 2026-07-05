.class public final Lexpo/modules/kotlin/types/ValueOrUndefined$DefaultImpls;
.super Ljava/lang/Object;
.source "ValueOrUndefined.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lexpo/modules/kotlin/types/ValueOrUndefined;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "DefaultImpls"
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


# direct methods
.method public static getOptional(Lexpo/modules/kotlin/types/ValueOrUndefined;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lexpo/modules/kotlin/types/ValueOrUndefined<",
            "TT;>;)TT;"
        }
    .end annotation

    .line 12
    instance-of v0, p0, Lexpo/modules/kotlin/types/ValueOrUndefined$Value;

    if-eqz v0, :cond_0

    check-cast p0, Lexpo/modules/kotlin/types/ValueOrUndefined$Value;

    invoke-virtual {p0}, Lexpo/modules/kotlin/types/ValueOrUndefined$Value;->getValue()Ljava/lang/Object;

    move-result-object p0

    return-object p0

    .line 13
    :cond_0
    instance-of p0, p0, Lexpo/modules/kotlin/types/ValueOrUndefined$Undefined;

    if-eqz p0, :cond_1

    const/4 p0, 0x0

    return-object p0

    .line 11
    :cond_1
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method

.method public static isUndefined(Lexpo/modules/kotlin/types/ValueOrUndefined;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lexpo/modules/kotlin/types/ValueOrUndefined<",
            "TT;>;)Z"
        }
    .end annotation

    .line 8
    instance-of p0, p0, Lexpo/modules/kotlin/types/ValueOrUndefined$Undefined;

    return p0
.end method
