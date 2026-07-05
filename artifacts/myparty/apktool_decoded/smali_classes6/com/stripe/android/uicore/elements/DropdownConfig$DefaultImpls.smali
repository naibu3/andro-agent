.class public final Lcom/stripe/android/uicore/elements/DropdownConfig$DefaultImpls;
.super Ljava/lang/Object;
.source "DropdownConfig.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/uicore/elements/DropdownConfig;
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
.method public static getDisableDropdownWithSingleElement(Lcom/stripe/android/uicore/elements/DropdownConfig;)Z
    .locals 0

    const/4 p0, 0x0

    return p0
.end method

.method public static getMode(Lcom/stripe/android/uicore/elements/DropdownConfig;)Lcom/stripe/android/uicore/elements/DropdownConfig$Mode;
    .locals 3

    .line 22
    new-instance p0, Lcom/stripe/android/uicore/elements/DropdownConfig$Mode$Full;

    const/4 v0, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {p0, v2, v0, v1}, Lcom/stripe/android/uicore/elements/DropdownConfig$Mode$Full;-><init>(ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    check-cast p0, Lcom/stripe/android/uicore/elements/DropdownConfig$Mode;

    return-object p0
.end method
