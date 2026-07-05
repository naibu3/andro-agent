.class final Lexpo/modules/kotlin/jni/JNIDeallocator$DeallocatorThread;
.super Ljava/lang/Thread;
.source "JNIDeallocator.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lexpo/modules/kotlin/jni/JNIDeallocator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "DeallocatorThread"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\u0008\u0082\u0004\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0008\u0010\u0004\u001a\u00020\u0005H\u0016\u00a8\u0006\u0006"
    }
    d2 = {
        "Lexpo/modules/kotlin/jni/JNIDeallocator$DeallocatorThread;",
        "Ljava/lang/Thread;",
        "<init>",
        "(Lexpo/modules/kotlin/jni/JNIDeallocator;)V",
        "run",
        "",
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


# instance fields
.field final synthetic this$0:Lexpo/modules/kotlin/jni/JNIDeallocator;


# direct methods
.method public constructor <init>(Lexpo/modules/kotlin/jni/JNIDeallocator;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 15
    iput-object p1, p0, Lexpo/modules/kotlin/jni/JNIDeallocator$DeallocatorThread;->this$0:Lexpo/modules/kotlin/jni/JNIDeallocator;

    const-string p1, "Expo JNI deallocator"

    invoke-direct {p0, p1}, Ljava/lang/Thread;-><init>(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 16
    iget-object v0, p0, Lexpo/modules/kotlin/jni/JNIDeallocator$DeallocatorThread;->this$0:Lexpo/modules/kotlin/jni/JNIDeallocator;

    move-object v1, p0

    check-cast v1, Ljava/lang/Thread;

    invoke-static {v0, v1}, Lexpo/modules/kotlin/jni/JNIDeallocator;->access$deallocator(Lexpo/modules/kotlin/jni/JNIDeallocator;Ljava/lang/Thread;)V

    return-void
.end method
