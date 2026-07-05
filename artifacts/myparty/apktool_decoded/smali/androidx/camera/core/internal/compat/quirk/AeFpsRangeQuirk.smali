.class public interface abstract Landroidx/camera/core/internal/compat/quirk/AeFpsRangeQuirk;
.super Ljava/lang/Object;
.source "AeFpsRangeQuirk.java"

# interfaces
.implements Landroidx/camera/core/impl/Quirk;


# virtual methods
.method public getTargetAeFpsRange()Landroid/util/Range;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroid/util/Range<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .line 36
    sget-object v0, Landroidx/camera/core/impl/StreamSpec;->FRAME_RATE_RANGE_UNSPECIFIED:Landroid/util/Range;

    return-object v0
.end method
