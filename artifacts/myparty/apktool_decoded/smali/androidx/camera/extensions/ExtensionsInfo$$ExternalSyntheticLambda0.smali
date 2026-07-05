.class public final synthetic Landroidx/camera/extensions/ExtensionsInfo$$ExternalSyntheticLambda0;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Landroidx/camera/extensions/VendorExtenderFactory;


# instance fields
.field public final synthetic f$0:Landroidx/camera/extensions/ExtensionsInfo;


# direct methods
.method public synthetic constructor <init>(Landroidx/camera/extensions/ExtensionsInfo;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/camera/extensions/ExtensionsInfo$$ExternalSyntheticLambda0;->f$0:Landroidx/camera/extensions/ExtensionsInfo;

    return-void
.end method


# virtual methods
.method public final createVendorExtender(IZ)Landroidx/camera/extensions/internal/VendorExtender;
    .locals 1

    .line 0
    iget-object v0, p0, Landroidx/camera/extensions/ExtensionsInfo$$ExternalSyntheticLambda0;->f$0:Landroidx/camera/extensions/ExtensionsInfo;

    invoke-virtual {v0, p1, p2}, Landroidx/camera/extensions/ExtensionsInfo;->getVendorExtender(IZ)Landroidx/camera/extensions/internal/VendorExtender;

    move-result-object p1

    return-object p1
.end method
