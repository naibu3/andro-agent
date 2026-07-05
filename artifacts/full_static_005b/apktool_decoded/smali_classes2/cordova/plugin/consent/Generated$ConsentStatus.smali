.class public final Lcordova/plugin/consent/Generated$ConsentStatus;
.super Ljava/lang/Object;
.source "Generated.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcordova/plugin/consent/Generated;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "ConsentStatus"
.end annotation


# static fields
.field public static final NOT_REQUIRED:I = 0x2

.field public static final OBTAINED:I = 0x3

.field public static final REQUIRED:I = 0x1

.field public static final UNKNOWN:I


# instance fields
.field final synthetic this$0:Lcordova/plugin/consent/Generated;


# direct methods
.method public constructor <init>(Lcordova/plugin/consent/Generated;)V
    .locals 0

    .line 25
    iput-object p1, p0, Lcordova/plugin/consent/Generated$ConsentStatus;->this$0:Lcordova/plugin/consent/Generated;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
